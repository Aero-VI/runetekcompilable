package com.runetek.compilable;

import com.runetek.compilable.transform.TransformPipeline;
import com.runetek.compilable.decompile.VineflowerDecompiler;
import com.runetek.compilable.util.JarIO;
import com.runetek.compilable.util.ScriptGenerator;
import org.objectweb.asm.tree.ClassNode;

import java.io.IOException;
import java.nio.file.*;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception {
        Path inputFile;
        Path outputDir;

        if (args.length >= 2) {
            inputFile = Paths.get(args[0]);
            outputDir = Paths.get(args[1]);
        } else if (args.length == 1) {
            inputFile = Paths.get(args[0]);
            outputDir = Paths.get("output/508");
        } else {
            // Default for development
            inputFile = Paths.get("input/508sd.dat");
            outputDir = Paths.get("output/508");
        }

        if (!Files.exists(inputFile)) {
            System.err.println("Input file not found: " + inputFile);
            System.err.println("Usage: java -jar runetekcompilable.jar <input.jar> [output-dir]");
            System.exit(1);
        }

        System.out.println("==========================================================");
        System.out.println("  RuneTek Compilable - Deobfuscator & Decompiler v1.0.0");
        System.out.println("==========================================================");
        System.out.println();
        System.out.println("Input:  " + inputFile);
        System.out.println("Output: " + outputDir);
        System.out.println();

        // Phase 1: Load classes from JAR
        System.out.println("[Phase 1] Loading classes from JAR...");
        Map<String, ClassNode> classes = JarIO.loadJar(inputFile);
        System.out.println("  Loaded " + classes.size() + " classes");

        // Phase 2: ASM Deobfuscation
        System.out.println("\n[Phase 2] ASM Deobfuscation Pipeline...");
        TransformPipeline pipeline = new TransformPipeline();
        pipeline.run(classes);

        // Phase 3: Write cleaned bytecode to temp JAR for Vineflower
        System.out.println("\n[Phase 3] Decompiling with Vineflower...");
        Path tempJar = Files.createTempFile("deobfuscated-", ".jar");
        JarIO.writeJar(classes, tempJar);

        Path srcDir = outputDir.resolve("src");
        Files.createDirectories(srcDir);
        VineflowerDecompiler.decompile(tempJar, srcDir);
        Files.deleteIfExists(tempJar);

        // Phase 4: Generate batch scripts
        System.out.println("\n[Phase 4] Generating batch scripts...");
        String mainClass = findMainClass(classes);
        ScriptGenerator.generate(outputDir, mainClass);

        // Count output
        long javaFiles = Files.walk(srcDir)
                .filter(p -> p.toString().endsWith(".java"))
                .count();
        System.out.println("\n==========================================================");
        System.out.println("  DONE! Generated " + javaFiles + " .java files");
        System.out.println("  Output: " + outputDir.toAbsolutePath());
        System.out.println("==========================================================");
    }

    private static String findMainClass(Map<String, ClassNode> classes) {
        // Find the most-derived Applet class
        String best = null;
        int bestDepth = -1;
        for (ClassNode cn : classes.values()) {
            int depth = 0;
            String superName = cn.superName;
            boolean isApplet = false;
            while (superName != null && depth < 20) {
                if (superName.contains("Applet")) { isApplet = true; break; }
                ClassNode sup = classes.get(superName);
                if (sup == null) break;
                superName = sup.superName;
                depth++;
            }
            if (isApplet && depth > bestDepth) {
                bestDepth = depth;
                best = cn.name;
            }
        }
        return best != null ? best.replace('/', '.') : "client";
    }
}
