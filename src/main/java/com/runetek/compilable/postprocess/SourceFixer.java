package com.runetek.compilable.postprocess;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.Comparator;
import java.util.regex.*;

/**
 * Post-decompilation source fixer. Applies all necessary syntax repairs so the
 * decompiled output compiles cleanly with javac -source 1.8 on any platform.
 *
 * Fixes:
 * 1. <unknown> type declarations → int (with initialization)
 * 2. Flexible constructors (code before super()) → reorder
 * 3. Multi-byte char literals that break on Windows encoding → unicode escapes
 * 4. Ambiguous null method calls → cast null to first parameter type
 * 5. Synthetic class$ field + Class.forName patterns
 * 6. Object typed vars needing Container/Component casts
 * 7. Non-static field in static context
 * 8. Missing return statements in un-decompilable methods
 * 9. Throwable return from initCause
 * 10. JSObject.getWindow (removed in modern Java)
 */
public class SourceFixer {

    private int totalFixes = 0;

    public void fixAll(Path srcDir) throws IOException {
        System.out.println("  [Post-Process] Fixing decompiled source for cross-platform compilation...");

        List<Path> javaFiles = new ArrayList<>();
        Files.walk(srcDir)
                .filter(p -> p.toString().endsWith(".java"))
                .forEach(javaFiles::add);

        for (Path file : javaFiles) {
            String content = new String(Files.readAllBytes(file), StandardCharsets.UTF_8);
            String original = content;

            content = fixUnknownTypes(content);
            content = fixFlexibleConstructors(content);
            content = fixMultiByteCharLiterals(content);
            content = fixInitCauseThrow(content);
            content = fixJSObjectGetWindow(content, file.getFileName().toString());
            content = fixScopedVariables(content);

            if (!content.equals(original)) {
                Files.write(file, content.getBytes(StandardCharsets.UTF_8));
            }
        }

        // Second pass: compile-error-driven fixes (need to know method signatures)
        fixAmbiguousNullCalls(srcDir, javaFiles);
        fixMissingClassFields(srcDir, javaFiles);
        fixObjectTypeCasts(srcDir, javaFiles);
        fixNonStaticAccess(srcDir, javaFiles);
        fixMissingReturnStatements(srcDir, javaFiles);

        System.out.println("    Applied " + totalFixes + " source fixes");
    }

    /**
     * Replace <unknown> varN; with int varN = 0;
     * Vineflower emits this when it can't determine the type.
     */
    private String fixUnknownTypes(String content) {
        Pattern p = Pattern.compile("(\\s*)<unknown>\\s+(var\\d+);");
        Matcher m = p.matcher(content);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, m.group(1) + "int " + m.group(2) + " = 0;");
            totalFixes++;
        }
        m.appendTail(sb);
        return sb.toString();
    }

    /**
     * Move super() before any statements in constructors (Java 8 requirement).
     * Pattern: "int varN = client.lb;\n      super();" → "super();\n      int varN = client.lb;"
     */
    private String fixFlexibleConstructors(String content) {
        Pattern p = Pattern.compile(
                "([ \\t]*)(int\\s+var\\d+\\s*=\\s*client\\.lb;)\\s*\\n([ \\t]*)(super\\(\\);)");
        Matcher m = p.matcher(content);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, m.group(3) + m.group(4) + "\n" + m.group(1) + m.group(2));
            totalFixes++;
        }
        m.appendTail(sb);
        return sb.toString();
    }

    /**
     * Fix multi-byte characters that get mangled when Vineflower writes UTF-8
     * but the file is read as Cp1252 (Windows default).
     * Convert any non-ASCII char literal to unicode escape form.
     */
    private String fixMultiByteCharLiterals(String content) {
        // Find char literals containing non-ASCII characters
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < content.length()) {
            if (content.charAt(i) == '\'' && i + 1 < content.length()) {
                // Possible char literal - find closing quote
                int start = i;
                i++;
                // Skip if this is already an escape sequence
                if (i < content.length() && content.charAt(i) == '\\') {
                    // Escaped char - find end
                    i++;
                    if (i < content.length() && content.charAt(i) == 'u') {
                        // unicode XXXX - skip to closing '
                        i += 5;
                        if (i < content.length() && content.charAt(i) == '\'') {
                            sb.append(content, start, i + 1);
                            i++;
                            continue;
                        }
                    }
                    // Other escape like \n, \t, etc
                    if (i < content.length()) i++;
                    if (i < content.length() && content.charAt(i) == '\'') {
                        sb.append(content, start, i + 1);
                        i++;
                        continue;
                    }
                }

                // Check if char is non-ASCII or multi-char (which would be invalid)
                if (i < content.length()) {
                    char ch = content.charAt(i);
                    if (ch > 127) {
                        // Non-ASCII char - might be multi-byte garbage
                        // Find the closing quote
                        int end = content.indexOf('\'', i);
                        if (end > i && end - i <= 4) {
                            // Extract what's between quotes
                            String between = content.substring(i, end);
                            if (between.length() == 1) {
                                // Single non-ASCII char - unicode escape
                                sb.append("'" + "\\" + "u");
                                sb.append(String.format("%04x", (int) between.charAt(0)));
                                sb.append("'");
                                i = end + 1;
                                totalFixes++;
                                continue;
                            } else {
                                // Multi-char between quotes — this is an int literal that got decompiled
                                // as a char. Convert to the integer value.
                                int val = 0;
                                for (int c = 0; c < between.length(); c++) {
                                    val = (val << 8) | (between.charAt(c) & 0xFF);
                                }
                                sb.append(val);
                                i = end + 1;
                                totalFixes++;
                                continue;
                            }
                        }
                    }
                }

                // Normal char literal, copy as-is
                sb.append(content.charAt(start));
                continue;
            }
            sb.append(content.charAt(i));
            i++;
        }
        return sb.toString();
    }

    /**
     * Fix: throw new NoClassDefFoundError().initCause(var)
     * initCause returns Throwable which can't be thrown directly.
     */
    private String fixInitCauseThrow(String content) {
        Pattern p = Pattern.compile(
                "throw new NoClassDefFoundError\\(\\)\\.initCause\\((\\w+)\\);");
        Matcher m = p.matcher(content);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb,
                    "NoClassDefFoundError _err = new NoClassDefFoundError(); _err.initCause("
                            + m.group(1) + "); throw _err;");
            totalFixes++;
        }
        m.appendTail(sb);
        return sb.toString();
    }

    /**
     * Stub out JSObject.getWindow calls - removed in modern Java.
     */
    private String fixJSObjectGetWindow(String content, String fileName) {
        if (!content.contains("JSObject.getWindow")) return content;
        totalFixes++;

        // Replace the entire JSObject usage with stubs
        content = content.replaceAll(
                "import netscape\\.javascript\\.JSObject;\\s*", "");
        // Handle return statements with JSObject calls
        content = content.replaceAll(
                "return[^;]*JSObject\\.getWindow\\([^)]*\\)\\.call\\([^)]*\\);",
                "return null;");
        // Handle standalone JSObject calls
        content = content.replaceAll(
                "[^;]*JSObject\\.getWindow\\([^)]*\\)\\.call\\([^)]*\\);",
                "// JSObject.getWindow stubbed out");
        content = content.replaceAll(
                "JSObject\\.getWindow\\([^)]*\\)\\.eval\\([^)]*\\);",
                "// JSObject.getWindow stubbed out");
        return content;
    }

    /**
     * Find and fix ambiguous null references by iterative trial compilation.
     * Runs javac, parses "reference to X is ambiguous" errors with "both method" details,
     * and adds casts to null arguments.
     */
    private void fixAmbiguousNullCalls(Path srcDir, List<Path> files) throws IOException {
        for (int attempt = 0; attempt < 10; attempt++) {
            List<String> errors = trialCompile(srcDir);

            // Collect all error lines as a single list for forward-scanning
            boolean foundAmbiguous = false;
            for (int i = 0; i < errors.size(); i++) {
                String errLine = errors.get(i);
                if (!errLine.contains("error: reference to") || !errLine.contains("is ambiguous")) continue;

                foundAmbiguous = true;
                // Parse file:line from error
                // Format: src/Class_ha.java:631: error: reference to a is ambiguous
                // or absolute path on some systems
                Matcher fileMatcher = Pattern.compile("([^:]+\\.java):(\\d+):").matcher(errLine);
                if (!fileMatcher.find()) continue;

                String filePath = fileMatcher.group(1);
                int lineNum = Integer.parseInt(fileMatcher.group(2));

                // Find the "both method" line
                String firstMethodSig = null;
                for (int j = i + 1; j < Math.min(errors.size(), i + 5); j++) {
                    if (errors.get(j).contains("both method")) {
                        firstMethodSig = errors.get(j);
                        break;
                    }
                }
                if (firstMethodSig == null) continue;

                // Parse: "both method a(Class_cj,int) in X and method a(Class_lh,int) in X match"
                Matcher methodMatcher = Pattern.compile("both method \\w+\\(([^)]+)\\)").matcher(firstMethodSig);
                if (!methodMatcher.find()) continue;
                String[] firstOverloadTypes = methodMatcher.group(1).split(",");

                // Resolve the file
                Path javaFile = resolveFile(srcDir, filePath);
                if (javaFile == null || !Files.exists(javaFile)) continue;

                List<String> lines = Files.readAllLines(javaFile, StandardCharsets.UTF_8);
                if (lineNum < 1 || lineNum > lines.size()) continue;

                String line = lines.get(lineNum - 1);

                // Find null argument positions in the method call and cast them
                String fixed = castNullInLine(line, firstOverloadTypes);
                if (!fixed.equals(line)) {
                    lines.set(lineNum - 1, fixed);
                    Files.write(javaFile, lines, StandardCharsets.UTF_8);
                    totalFixes++;
                }
            }
            if (!foundAmbiguous) break;
        }
    }

    /**
     * Given a line like "a(null, 57)" and overload types ["Class_cj", "int"],
     * cast the null to the appropriate type.
     */
    private String castNullInLine(String line, String[] paramTypes) {
        // Find the method call containing null
        // Parse arguments by splitting on commas (handling nested parens)
        Pattern callPat = Pattern.compile("(\\w+\\()([^;]*)(\\))");
        Matcher m = callPat.matcher(line);
        StringBuffer sb = new StringBuffer();
        boolean replaced = false;

        while (m.find() && !replaced) {
            String args = m.group(2);
            if (!args.contains("null")) continue;

            String[] argParts = splitArgs(args);
            StringBuilder newArgs = new StringBuilder();
            for (int i = 0; i < argParts.length; i++) {
                if (i > 0) newArgs.append(", ");
                String arg = argParts[i].trim();
                if (arg.equals("null") && i < paramTypes.length) {
                    newArgs.append("(").append(paramTypes[i].trim()).append(")null");
                    replaced = true;
                } else {
                    newArgs.append(arg);
                }
            }
            if (replaced) {
                m.appendReplacement(sb, Matcher.quoteReplacement(m.group(1) + newArgs.toString() + m.group(3)));
            }
        }
        if (replaced) {
            m.appendTail(sb);
            return sb.toString();
        }
        return line;
    }

    private String[] splitArgs(String args) {
        List<String> result = new ArrayList<>();
        int depth = 0;
        StringBuilder current = new StringBuilder();
        for (char c : args.toCharArray()) {
            if (c == '(' || c == '[') depth++;
            else if (c == ')' || c == ']') depth--;
            else if (c == ',' && depth == 0) {
                result.add(current.toString());
                current = new StringBuilder();
                continue;
            }
            current.append(c);
        }
        result.add(current.toString());
        return result.toArray(new String[0]);
    }

    private Path resolveFile(Path srcDir, String filePath) {
        // filePath could be "src/Class_ha.java" or absolute
        Path p = Paths.get(filePath);
        if (Files.exists(p)) return p;
        // Try relative to srcDir
        String name = p.getFileName().toString();
        Path resolved = srcDir.resolve(name);
        if (Files.exists(resolved)) return resolved;
        // Try stripping "src/"
        if (filePath.startsWith("src/") || filePath.startsWith("src\\")) {
            resolved = srcDir.resolve(filePath.substring(4));
            if (Files.exists(resolved)) return resolved;
        }
        return null;
    }

    private void fixMissingClassFields(Path srcDir, List<Path> files) throws IOException {
        // Fix synthetic class$ patterns: nb field + Class.forName
        for (Path file : files) {
            String content = new String(Files.readAllBytes(file), StandardCharsets.UTF_8);
            // Look for: Class var = nb != null ? nb : (nb = a("classname"));
            Pattern p = Pattern.compile(
                    "Class\\s+(\\w+)\\s*=\\s*(\\w+)\\s*!=\\s*null\\s*\\?\\s*\\2\\s*:\\s*\\(\\2\\s*=\\s*a\\(\"(\\w+)\"\\)\\)");
            Matcher m = p.matcher(content);
            if (m.find()) {
                String fieldName = m.group(2);
                String className = m.group(3);

                // Add the static Class field if not present
                if (!content.contains("static Class " + fieldName + ";")) {
                    content = content.replaceFirst(
                            "(\\bclass\\s+\\w+[^{]*\\{)",
                            "$1\n   static Class " + fieldName + ";");
                    totalFixes++;
                }

                // Replace a("classname") with Class.forName("ClassName")
                content = content.replace(
                        "(" + fieldName + " = a(\"" + className + "\"))",
                        "(" + fieldName + " = Class.forName(\"Class_" + className + "\"))");

                // Wrap the ternary in try-catch
                String ternary = fieldName + " != null ? " + fieldName + " : (" + fieldName
                        + " = Class.forName(\"Class_" + className + "\"))";
                if (content.contains(ternary)) {
                    String varName = m.group(1);
                    content = content.replace(
                            "Class " + varName + " = " + ternary + ";",
                            "Class " + varName + ";\n         try { " + varName + " = "
                                    + ternary + "; } catch (ClassNotFoundException _ex) { throw new RuntimeException(_ex); }");
                    totalFixes++;
                }

                Files.write(file, content.getBytes(StandardCharsets.UTF_8));
            }
        }
    }

    /**
     * Fix Object-typed variables that need Container/Component casts.
     * Pattern: var.setLayout(null), var.add(...), var.getSize(), var.getGraphics()
     */
    private void fixObjectTypeCasts(Path srcDir, List<Path> files) throws IOException {
        for (Path file : files) {
            String content = new String(Files.readAllBytes(file), StandardCharsets.UTF_8);
            String original = content;

            // Find blocks where Object var is used with Container/Component methods
            // Pattern: Object varN; ... varN.setLayout | varN.add | varN.getSize | varN.getGraphics
            Pattern objDecl = Pattern.compile("Object\\s+(var\\d+)\\s*;");
            Matcher m = objDecl.matcher(content);
            Set<String> objectVars = new HashSet<>();
            while (m.find()) {
                objectVars.add(m.group(1));
            }

            for (String varName : objectVars) {
                // Cast for setLayout, add (Container methods)
                content = content.replaceAll(
                        "(?<![.(])" + varName + "\\.setLayout\\(",
                        "((java.awt.Container)" + varName + ").setLayout(");
                content = content.replaceAll(
                        "(?<![.(])" + varName + "\\.add\\(",
                        "((java.awt.Container)" + varName + ").add(");
                // Cast for getSize, getGraphics (Component methods)
                content = content.replaceAll(
                        "(?<![.(])" + varName + "\\.getSize\\(",
                        "((java.awt.Component)" + varName + ").getSize(");
                content = content.replaceAll(
                        "(?<![.(])" + varName + "\\.getGraphics\\(",
                        "((java.awt.Component)" + varName + ").getGraphics(");
            }

            if (!content.equals(original)) {
                totalFixes++;
                Files.write(file, content.getBytes(StandardCharsets.UTF_8));
            }
        }
    }

    /**
     * Fix non-static field access in static methods.
     * Specifically: bare "m = 0" in static method where Class_fg.m is used nearby.
     */
    private void fixNonStaticAccess(Path srcDir, List<Path> files) throws IOException {
        for (Path file : files) {
            String content = new String(Files.readAllBytes(file), StandardCharsets.UTF_8);
            String original = content;

            // Look for pattern: Class_X.m followed by bare m = 0 in same method
            Pattern p = Pattern.compile("(Class_\\w+)\\.m\\s*>=");
            Matcher m = p.matcher(content);
            if (m.find()) {
                String qualifiedClass = m.group(1);
                // Replace bare "m = 0" with "Class_X.m = 0" (only when preceded by indentation)
                content = content.replaceAll(
                        "(\\n\\s+)m = 0;",
                        "$1" + qualifiedClass + ".m = 0;");
            }

            if (!content.equals(original)) {
                totalFixes++;
                Files.write(file, content.getBytes(StandardCharsets.UTF_8));
            }
        }
    }

    /**
     * Add missing return statements to methods that Vineflower couldn't decompile
     * (left as bytecode comments). These methods have a signature but only comments inside.
     */
    private void fixMissingReturnStatements(Path srcDir, List<Path> files) throws IOException {
        for (Path file : files) {
            String content = new String(Files.readAllBytes(file), StandardCharsets.UTF_8);
            String original = content;

            // Find methods that contain only bytecode comments (// XXX: instruction)
            // Pattern: method signature { ... // bytecode ... } with no actual statements
            // We detect: "// NNN: athrow\n   }" and add a return before the closing brace

            // For boolean methods
            content = content.replaceAll(
                    "(static final boolean \\w+\\([^)]*\\)\\s*\\{[^}]*// [0-9a-f]+: athrow\\s*\\n)(\\s*\\})",
                    "$1      return false;\n$2");
            // For int methods
            content = content.replaceAll(
                    "(static final int \\w+\\([^)]*\\)\\s*\\{[^}]*// [0-9a-f]+: athrow\\s*\\n)(\\s*\\})",
                    "$1      return 0;\n$2");

            // More generic: any method ending with athrow comment before closing brace
            // but missing a return. Check for methods with return types.
            Pattern athrowEnd = Pattern.compile(
                    "(// [0-9a-f]+: athrow\\s*\\n)(\\s*\\})");
            Matcher m = athrowEnd.matcher(content);
            StringBuffer sb = new StringBuffer();
            while (m.find()) {
                // Look backward to find method signature to determine return type
                int pos = m.start();
                String before = content.substring(Math.max(0, pos - 3000), pos);
                String returnType = inferReturnType(before);
                if (returnType != null) {
                    String retStatement;
                    switch (returnType) {
                        case "boolean": retStatement = "return false;"; break;
                        case "int": retStatement = "return 0;"; break;
                        case "long": retStatement = "return 0L;"; break;
                        case "float": retStatement = "return 0.0f;"; break;
                        case "double": retStatement = "return 0.0;"; break;
                        case "void": retStatement = null; break;
                        default: retStatement = "return null;"; break;
                    }
                    if (retStatement != null) {
                        m.appendReplacement(sb, m.group(1) + "      " + retStatement + "\n" + m.group(2));
                        totalFixes++;
                    } else {
                        m.appendReplacement(sb, m.group(0));
                    }
                } else {
                    m.appendReplacement(sb, m.group(0));
                }
            }
            m.appendTail(sb);
            content = sb.toString();

            if (!content.equals(original)) {
                Files.write(file, content.getBytes(StandardCharsets.UTF_8));
            }
        }
    }

    /**
     * Look backward in content to find the nearest method signature return type.
     */
    private String inferReturnType(String before) {
        // Find last method declaration
        Pattern methodDecl = Pattern.compile(
                "(?:static\\s+)?(?:final\\s+)?(?:private\\s+)?(?:public\\s+)?(?:protected\\s+)?" +
                        "(?:static\\s+)?(?:final\\s+)?(\\w+(?:\\[\\])?)\\s+\\w+\\s*\\([^)]*\\)\\s*(?:throws\\s+[^{]+)?\\{");
        Matcher m = methodDecl.matcher(before);
        String lastType = null;
        while (m.find()) {
            lastType = m.group(1);
        }
        return lastType;
    }

    /**
     * Fix variable declarations inside label blocks that are used outside.
     * Hoists declarations to the enclosing scope.
     */
    public static String fixScopedVariables(String content) {
        // This handles the specific case of var29/var30 etc. in Class_wi
        // Look for variables used but declared inside label blocks
        // Generic approach: find "varN = expr" where varN hasn't been declared in scope
        // For now, handle the known pattern: add declarations before while(true) loops
        // that contain label blocks with undeclared vars

        // Pattern: while (true) { int var11; label: { ... var29 = ... }}
        // Fix: add "int var29 = 0; double var30 = 0;" after var11 declaration
        Pattern p = Pattern.compile(
                "(while \\(true\\) \\{\\s*\\n\\s*int var11;)");
        Matcher m = p.matcher(content);
        if (m.find()) {
            // Check if var29 and var30 are used but undeclared
            if (content.contains("var29 =") && !content.contains("int var29")) {
                content = content.replace(m.group(1),
                        m.group(1) + "\n                              int var29 = 0;");
            }
            if (content.contains("var30 =") && !content.contains("double var30")) {
                content = content.replace(m.group(1),
                        m.group(1) + "\n                              double var30 = 0;");
            }
        }
        return content;
    }

    /**
     * Run a trial compilation and return all output lines (errors + warnings).
     */
    private List<String> trialCompile(Path srcDir) throws IOException {
        List<String> result = new ArrayList<>();
        try {
            List<String> cmd = new ArrayList<>();
            cmd.add("javac");
            cmd.add("-source");
            cmd.add("8");
            cmd.add("-target");
            cmd.add("8");
            cmd.add("-encoding");
            cmd.add("UTF-8");
            cmd.add("-d");

            Path tempBin = Files.createTempDirectory("trial-compile-");
            cmd.add(tempBin.toAbsolutePath().toString());

            Files.walk(srcDir)
                    .filter(p -> p.toString().endsWith(".java"))
                    .forEach(p -> cmd.add(p.toAbsolutePath().toString()));

            ProcessBuilder pb = new ProcessBuilder(cmd);
            pb.redirectErrorStream(true);
            Process proc = pb.start();

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(proc.getInputStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    result.add(line);
                }
            }
            proc.waitFor();

            // Clean up temp dir
            Files.walk(tempBin)
                    .sorted(java.util.Comparator.reverseOrder())
                    .forEach(p -> { try { Files.delete(p); } catch (IOException e) {} });
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return result;
    }
}
