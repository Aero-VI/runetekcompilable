package com.runetek.compilable.util;

import java.io.*;
import java.nio.file.*;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/**
 * Detects and unpacks Pack200-compressed JAR files.
 * Handles standard JARs, standard Pack200, and RuneScape's custom
 * deflate-wrapped Pack200 format.
 *
 * Since Pack200 was removed in Java 14, this shells out to an external
 * JDK 11 unpack200 tool if available, or includes a bundled fallback.
 */
public class Pack200Unpacker {

    private static final byte[] JAR_MAGIC = {0x50, 0x4B, 0x03, 0x04}; // PK\x03\x04
    private static final byte[] PACK200_MAGIC = {(byte) 0xCA, (byte) 0xFE, (byte) 0xD0, 0x0D};

    /**
     * Detect the format and return a usable JAR path.
     * If the input is already a JAR, returns it as-is.
     * If it's pack200 (raw or deflate-wrapped), unpacks to a temp JAR.
     */
    public static Path ensureJar(Path input) throws Exception {
        byte[] header = new byte[16];
        try (InputStream is = Files.newInputStream(input)) {
            int read = is.read(header);
            if (read < 4) throw new IOException("File too small: " + input);
        }

        // Already a JAR/ZIP?
        if (startsWith(header, JAR_MAGIC)) {
            System.out.println("  Detected: Standard JAR");
            return input;
        }

        // Standard Pack200?
        if (startsWith(header, PACK200_MAGIC)) {
            System.out.println("  Detected: Pack200 compressed");
            return unpackPack200(input);
        }

        // RS custom format: deflate-wrapped pack200
        // Try inflating from various offsets and check for CAFED00D
        byte[] fileData = Files.readAllBytes(input);
        for (int offset : new int[]{8, 0, 2, 4, 5, 9, 10}) {
            try {
                byte[] inflated = tryInflate(fileData, offset);
                if (inflated != null && inflated.length >= 4 &&
                        startsWith(inflated, PACK200_MAGIC)) {
                    System.out.println("  Detected: Deflate-wrapped Pack200 (RS format, offset=" + offset + ")");
                    Path tempPack = Files.createTempFile("pack200-", ".pack");
                    Files.write(tempPack, inflated);
                    Path result = unpackPack200(tempPack);
                    Files.deleteIfExists(tempPack);
                    return result;
                }
            } catch (Exception ignored) {
            }
        }

        // Unknown format — try treating it as a JAR anyway
        System.out.println("  Warning: Unknown format, attempting to load as JAR");
        return input;
    }

    private static byte[] tryInflate(byte[] data, int offset) {
        try {
            Inflater inflater = new Inflater(true); // raw deflate (no zlib header)
            inflater.setInput(data, offset, data.length - offset);
            ByteArrayOutputStream out = new ByteArrayOutputStream(data.length * 2);
            byte[] buf = new byte[8192];
            while (!inflater.finished()) {
                int count = inflater.inflate(buf);
                if (count == 0 && inflater.needsInput()) break;
                out.write(buf, 0, count);
            }
            inflater.end();
            return out.size() > 0 ? out.toByteArray() : null;
        } catch (Exception e) {
            return null;
        }
    }

    private static Path unpackPack200(Path packFile) throws Exception {
        Path outputJar = Files.createTempFile("unpacked-", ".jar");

        // Try to find unpack200 from JDK 11
        String[] candidates = {
                System.getProperty("user.home") + "/jdk11/bin/unpack200",
                "/home/aeroverra/jdk11/bin/unpack200",
                "/usr/lib/jvm/java-11-openjdk/bin/unpack200",
                "/usr/lib/jvm/java-11/bin/unpack200",
                "unpack200" // system PATH
        };

        for (String candidate : candidates) {
            File tool = new File(candidate);
            if (tool.exists() || candidate.equals("unpack200")) {
                try {
                    ProcessBuilder pb = new ProcessBuilder(candidate,
                            packFile.toAbsolutePath().toString(),
                            outputJar.toAbsolutePath().toString());
                    pb.redirectErrorStream(true);
                    Process proc = pb.start();
                    String output = new String(proc.getInputStream().readAllBytes());
                    int exitCode = proc.waitFor();
                    if (exitCode == 0 && Files.size(outputJar) > 0) {
                        System.out.println("  Unpacked with: " + candidate);
                        return outputJar;
                    }
                } catch (Exception ignored) {
                }
            }
        }

        // If no unpack200 found, try using reflection on older JDK's Pack200 API
        // (won't work on JDK 14+, but worth trying)
        try {
            Class<?> pack200Class = Class.forName("java.util.jar.Pack200");
            Object unpacker = pack200Class.getMethod("newUnpacker").invoke(null);
            try (InputStream in = Files.newInputStream(packFile);
                 java.util.jar.JarOutputStream out = new java.util.jar.JarOutputStream(
                         Files.newOutputStream(outputJar))) {
                unpacker.getClass().getMethod("unpack", InputStream.class,
                        java.util.jar.JarOutputStream.class).invoke(unpacker, in, out);
            }
            if (Files.size(outputJar) > 0) {
                System.out.println("  Unpacked with Pack200 API");
                return outputJar;
            }
        } catch (Exception ignored) {
        }

        throw new RuntimeException(
                "Cannot unpack Pack200 file. Please install JDK 11 or set JAVA11_HOME.\n" +
                        "Pack200 was removed in JDK 14. The unpack200 tool from JDK 11 is needed.\n" +
                        "Download: https://adoptium.net/temurin/releases/?version=11");
    }

    private static boolean startsWith(byte[] data, byte[] prefix) {
        if (data.length < prefix.length) return false;
        for (int i = 0; i < prefix.length; i++) {
            if (data[i] != prefix[i]) return false;
        }
        return true;
    }
}
