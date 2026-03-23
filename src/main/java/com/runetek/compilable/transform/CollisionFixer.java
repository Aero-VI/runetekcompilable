package com.runetek.compilable.transform;

import org.objectweb.asm.tree.*;

import java.util.*;

/**
 * Fixes method and field name collisions that can arise after class renaming
 * or from ZKM obfuscation. Two methods with the same name+descriptor in a
 * class will cause a ClassFormatError.
 */
public class CollisionFixer {

    public static int fix(Map<String, ClassNode> classes) {
        int fixed = 0;

        for (ClassNode cn : classes.values()) {
            fixed += fixMethodCollisions(cn);
            fixed += fixFieldCollisions(cn);
        }

        return fixed;
    }

    private static int fixMethodCollisions(ClassNode cn) {
        int fixed = 0;
        Set<String> seen = new HashSet<>();

        for (MethodNode mn : cn.methods) {
            if (mn.name.startsWith("<")) continue; // skip <init>/<clinit>
            String key = mn.name + mn.desc;
            if (seen.contains(key)) {
                // Collision — rename this method
                String newName = mn.name + "_" + (fixed + 1);
                mn.name = newName;
                fixed++;
            }
            seen.add(key);
        }

        return fixed;
    }

    private static int fixFieldCollisions(ClassNode cn) {
        int fixed = 0;
        Set<String> seen = new HashSet<>();

        for (FieldNode fn : cn.fields) {
            String key = fn.name + ":" + fn.desc;
            if (seen.contains(key)) {
                fn.name = fn.name + "_" + (fixed + 1);
                fixed++;
            }
            seen.add(key);
        }

        return fixed;
    }
}
