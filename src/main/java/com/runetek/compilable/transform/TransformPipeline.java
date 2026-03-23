package com.runetek.compilable.transform;

import org.objectweb.asm.tree.ClassNode;
import java.util.Map;

/**
 * Orchestrates all ASM bytecode transformations before decompilation.
 */
public class TransformPipeline {

    public void run(Map<String, ClassNode> classes) {
        // Step 1: Rename obfuscated classes to avoid Java keyword collisions
        System.out.println("  [Step 1] Renaming obfuscated classes...");
        ClassRenamer renamer = new ClassRenamer();
        Map<String, ClassNode> renamed = renamer.rename(classes);
        classes.clear();
        classes.putAll(renamed);
        System.out.println("    Renamed " + renamer.getRenameCount() + " classes");

        // Step 2: Remove ZKM opaque predicates
        System.out.println("  [Step 2] Removing opaque predicates...");
        int removed = OpaquePredicateRemover.process(classes);
        System.out.println("    Removed " + removed + " opaque predicates");

        // Step 3: Fix method name collisions from renaming
        System.out.println("  [Step 3] Fixing method/field collisions...");
        int collisions = CollisionFixer.fix(classes);
        System.out.println("    Fixed " + collisions + " collisions");

        // Step 4: Remove illegal exception table entries and dead code
        System.out.println("  [Step 4] Cleaning dead code...");
        int cleaned = DeadCodeCleaner.clean(classes);
        System.out.println("    Cleaned " + cleaned + " methods");
    }
}
