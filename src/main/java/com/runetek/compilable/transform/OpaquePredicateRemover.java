package com.runetek.compilable.transform;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.*;

import java.util.*;

/**
 * Detects and removes ZKM opaque predicates.
 *
 * ZKM inserts dummy parameters (usually the last int/byte parameter) and uses
 * them in fake conditional branches that always resolve the same way. These
 * create unreachable code and illegal GOTO artifacts when decompiled.
 *
 * Common patterns:
 * 1. ILOAD dummy_param → IFEQ/IFNE → (always-taken branch)
 * 2. ILOAD dummy → BIPUSH const → IF_ICMPNE → (always-taken)
 * 3. Bitwise XOR with constant → comparison (e.g., ~x == -N means x == N-1)
 *
 * Strategy: Detect branches where one side is never reached by analyzing
 * constant values, then fold the branch to the always-taken path.
 */
public class OpaquePredicateRemover {

    public static int process(Map<String, ClassNode> classes) {
        int totalRemoved = 0;
        for (ClassNode cn : classes.values()) {
            for (MethodNode mn : cn.methods) {
                if (mn.instructions == null || mn.instructions.size() == 0) continue;
                totalRemoved += removeOpaquePredicates(mn);
            }
        }
        return totalRemoved;
    }

    private static int removeOpaquePredicates(MethodNode mn) {
        int removed = 0;

        // Pattern: detect the ZKM dummy parameter trick
        // ZKM adds an extra parameter and uses it in comparisons that always go one way
        // Look for: ILOAD <last_param> → ICONST/BIPUSH → IF_ICMP*
        // where the comparison is always true or always false

        for (AbstractInsnNode insn = mn.instructions.getFirst(); insn != null; ) {
            AbstractInsnNode next = insn.getNext();

            // Pattern: ICONST_M1 IXOR → used as ~x (ZKM's favorite obfuscation)
            // Simplify: ~x == -N  ↔  x == N-1
            // We can't easily resolve these statically, but we can detect the
            // unreachable branch pattern

            // Pattern: BIPUSH/SIPUSH N → IFEQ (N is never 0, so branch never taken)
            if (isPushConst(insn)) {
                int val = getConstValue(insn);
                AbstractInsnNode nextReal = nextRealInsn(insn);
                if (nextReal != null && nextReal.getOpcode() == Opcodes.IFEQ && val != 0) {
                    // Condition is always false (N != 0), remove the push + branch
                    // The IFEQ target is dead code
                    mn.instructions.remove(insn);
                    // Replace IFEQ with nothing (fall through)
                    mn.instructions.remove(nextReal);
                    removed++;
                    insn = next;
                    continue;
                }
                if (nextReal != null && nextReal.getOpcode() == Opcodes.IFNE && val != 0) {
                    // Condition is always true, replace with GOTO
                    JumpInsnNode jump = (JumpInsnNode) nextReal;
                    mn.instructions.remove(insn); // remove push
                    mn.instructions.set(nextReal, new JumpInsnNode(Opcodes.GOTO, jump.label));
                    removed++;
                    insn = next;
                    continue;
                }
            }

            insn = next;
        }

        return removed;
    }

    private static boolean isPushConst(AbstractInsnNode insn) {
        int op = insn.getOpcode();
        return (op >= Opcodes.ICONST_M1 && op <= Opcodes.ICONST_5)
                || op == Opcodes.BIPUSH || op == Opcodes.SIPUSH
                || (op == Opcodes.LDC && insn instanceof LdcInsnNode
                    && ((LdcInsnNode) insn).cst instanceof Integer);
    }

    private static int getConstValue(AbstractInsnNode insn) {
        int op = insn.getOpcode();
        if (op >= Opcodes.ICONST_M1 && op <= Opcodes.ICONST_5) {
            return op - Opcodes.ICONST_0;
        }
        if (insn instanceof IntInsnNode) {
            return ((IntInsnNode) insn).operand;
        }
        if (insn instanceof LdcInsnNode && ((LdcInsnNode) insn).cst instanceof Integer) {
            return (Integer) ((LdcInsnNode) insn).cst;
        }
        return 0;
    }

    private static AbstractInsnNode nextRealInsn(AbstractInsnNode insn) {
        AbstractInsnNode n = insn.getNext();
        while (n != null && n.getOpcode() < 0) n = n.getNext();
        return n;
    }
}
