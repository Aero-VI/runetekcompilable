package com.runetek.compilable.postprocess;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

/**
 * Auto-generates JOGL stub classes if the decompiled source imports javax.media.opengl.
 * Scans the source for all GL method calls and generates matching interface stubs.
 */
public class JoglStubGenerator {

    public static boolean isNeeded(Path srcDir) throws IOException {
        return Files.walk(srcDir)
                .filter(p -> p.toString().endsWith(".java"))
                .anyMatch(p -> {
                    try {
                        return new String(Files.readAllBytes(p), StandardCharsets.UTF_8)
                                .contains("import javax.media.opengl");
                    } catch (IOException e) { return false; }
                });
    }

    public static void generate(Path srcDir) throws IOException {
        System.out.println("  [JOGL] Generating OpenGL stub classes...");

        // Scan for all GL method calls to build interface
        Set<String> glMethods = new TreeSet<>();
        Set<String> imports = new TreeSet<>();

        Files.walk(srcDir)
                .filter(p -> p.toString().endsWith(".java"))
                .forEach(p -> {
                    try {
                        String content = new String(Files.readAllBytes(p), StandardCharsets.UTF_8);
                        // Collect import types
                        Matcher im = Pattern.compile("import (javax\\.media\\.opengl[.\\w]*);").matcher(content);
                        while (im.find()) imports.add(im.group(1));
                        // Collect GL method calls
                        Matcher mm = Pattern.compile("\\.(gl\\w+)\\(").matcher(content);
                        while (mm.find()) glMethods.add(mm.group(1));
                    } catch (IOException ignored) {}
                });

        Path glDir = srcDir.resolve("javax/media/opengl");
        Path gluDir = glDir.resolve("glu");
        Files.createDirectories(gluDir);

        // Generate GL interface with all used methods
        StringBuilder gl = new StringBuilder();
        gl.append("package javax.media.opengl;\n");
        gl.append("/** Auto-generated JOGL stub for compilation. */\n");
        gl.append("public interface GL {\n");

        for (String method : glMethods) {
            if (method.startsWith("glu")) continue; // GLU methods

            // Generate multiple overloads to cover Buffer/long/int variants
            List<String> sigs = inferSignatures(method);
            for (String sig : sigs) {
                gl.append("    ").append(sig).append(";\n");
            }
        }
        // Always include utility methods that aren't gl* prefixed
        gl.append("    boolean isExtensionAvailable(String extension);\n");
        gl.append("    void setSwapInterval(int interval);\n");
        gl.append("}\n");
        Files.write(glDir.resolve("GL.java"), gl.toString().getBytes(StandardCharsets.UTF_8));

        // GLCapabilities
        Files.write(glDir.resolve("GLCapabilities.java"),
                ("package javax.media.opengl;\n" +
                        "public class GLCapabilities {\n" +
                        "    public GLCapabilities() {}\n" +
                        "    public void setSampleBuffers(boolean v) {}\n" +
                        "    public void setNumSamples(int v) {}\n" +
                        "}\n").getBytes(StandardCharsets.UTF_8));

        // GLContext
        Files.write(glDir.resolve("GLContext.java"),
                ("package javax.media.opengl;\n" +
                        "public abstract class GLContext {\n" +
                        "    public static GLContext getCurrent() { return null; }\n" +
                        "    public abstract GL getGL();\n" +
                        "    public abstract int makeCurrent();\n" +
                        "    public abstract void release();\n" +
                        "    public abstract void destroy();\n" +
                        "    public static final int CONTEXT_CURRENT = 2;\n" +
                        "    public static final int CONTEXT_CURRENT_NEW = 3;\n" +
                        "    public static final int CONTEXT_NOT_CURRENT = 0;\n" +
                        "}\n").getBytes(StandardCharsets.UTF_8));

        // GLDrawable
        Files.write(glDir.resolve("GLDrawable.java"),
                ("package javax.media.opengl;\n" +
                        "public interface GLDrawable {\n" +
                        "    GLContext createContext(GLContext shareWith);\n" +
                        "    void setRealized(boolean realized);\n" +
                        "    void swapBuffers();\n" +
                        "    int getWidth();\n" +
                        "    int getHeight();\n" +
                        "}\n").getBytes(StandardCharsets.UTF_8));

        // GLDrawableFactory
        Files.write(glDir.resolve("GLDrawableFactory.java"),
                ("package javax.media.opengl;\n" +
                        "public abstract class GLDrawableFactory {\n" +
                        "    public static GLDrawableFactory getFactory() { return null; }\n" +
                        "    public abstract GLDrawable getGLDrawable(Object target, GLCapabilities caps, GLCapabilities chooser);\n" +
                        "}\n").getBytes(StandardCharsets.UTF_8));

        // GLU
        boolean needsGlu = glMethods.stream().anyMatch(m -> m.startsWith("glu"));
        if (needsGlu || imports.stream().anyMatch(i -> i.contains("glu"))) {
            Files.write(gluDir.resolve("GLU.java"),
                    ("package javax.media.opengl.glu;\n" +
                            "import javax.media.opengl.GL;\n" +
                            "public class GLU {\n" +
                            "    public GLU() {}\n" +
                            "    public void gluPerspective(double fovy, double aspect, double zNear, double zFar) {}\n" +
                            "    public void gluLookAt(double eyeX, double eyeY, double eyeZ, double cX, double cY, double cZ, double uX, double uY, double uZ) {}\n" +
                            "    public void gluOrtho2D(double left, double right, double bottom, double top) {}\n" +
                            "    public int gluBuild2DMipmaps(int target, int internalFormat, int width, int height, int format, int type, java.nio.Buffer data) { return 0; }\n" +
                            "}\n").getBytes(StandardCharsets.UTF_8));
        }

        System.out.println("    Generated " + glMethods.size() + " GL method stubs");
    }

    /**
     * Infer method signatures for a GL method name.
     * Uses naming conventions from the OpenGL API.
     */
    private static List<String> inferSignatures(String name) {
        List<String> sigs = new ArrayList<>();

        // Methods that need both Buffer and long overloads (VBO offset variants)
        boolean needsLongOverload = name.contains("Pointer") || name.equals("glInterleavedArrays")
                || name.equals("glDrawElements");

        switch (name) {
            // No-arg methods
            case "glEnd": case "glEndList": case "glLoadIdentity":
            case "glPushMatrix": case "glPopMatrix": case "glFlush":
            case "glFinish": case "glPopAttrib":
                sigs.add("void " + name + "()");
                break;
            // 1-arg int
            case "glBegin": case "glEnable": case "glDisable":
            case "glMatrixMode": case "glShadeModel": case "glCullFace":
            case "glDepthFunc": case "glActiveTexture": case "glClientActiveTexture":
            case "glEnableClientState": case "glDisableClientState":
            case "glCallList": case "glPushAttrib": case "glDrawBuffer":
            case "glReadBuffer":
                sigs.add("void " + name + "(int a)");
                break;
            case "glGenLists":
                sigs.add("int " + name + "(int a)");
                break;
            case "glDepthMask":
                sigs.add("void " + name + "(boolean a)");
                break;
            case "glClearDepth":
                sigs.add("void " + name + "(double a)");
                break;
            // 1-arg that might be int or a packed color
            case "glColor3ub": case "glColor4ub":
                sigs.add("void " + name + "(byte r, byte g, byte b" + (name.contains("4") ? ", byte a" : "") + ")");
                break;
            // 2-arg
            case "glBindTexture": case "glBlendFunc": case "glAlphaFunc":
            case "glDeleteLists": case "glNewList": case "glPolygonMode":
            case "glHint": case "glBindBufferARB": case "glBindProgramARB":
            case "glFogi": case "glRasterPos2i": case "glTexCoord2f":
            case "glVertex2f": case "glColorMaterial":
                String argType = name.endsWith("2f") ? "float" : "int";
                if (name.equals("glAlphaFunc")) sigs.add("void " + name + "(int a, float b)");
                else if (name.equals("glFogi")) sigs.add("void " + name + "(int a, int b)");
                else if (name.equals("glColorMaterial")) sigs.add("void " + name + "(int a, int b)");
                else sigs.add("void " + name + "(" + argType + " a, " + argType + " b)");
                break;
            case "glFogf": case "glTexEnvf": case "glLightf":
                sigs.add("void " + name + "(int a, " + (name.equals("glTexEnvf") || name.equals("glLightf") ? "int b, " : "") + "float c)");
                break;
            // 3-arg
            case "glScalef": case "glTranslatef":
                sigs.add("void " + name + "(float a, float b, float c)");
                break;
            case "glTexParameteri": case "glTexEnvi": case "glTexGeni":
            case "glMultiTexCoord2f":
                if (name.equals("glMultiTexCoord2f")) sigs.add("void " + name + "(int a, float b, float c)");
                else sigs.add("void " + name + "(int a, int b, int c)");
                break;
            case "glDeleteTextures": case "glGenTextures":
            case "glDeleteBuffersARB": case "glGenBuffersARB":
            case "glGenProgramsARB":
                sigs.add("void " + name + "(int n, int[] arr, int offset)");
                break;
            case "glFogfv": case "glLightModelfv":
                sigs.add("void " + name + "(int a, float[] b, int c)");
                break;
            case "glGetFloatv":
                sigs.add("void " + name + "(int a, float[] b, int c)");
                break;
            case "glGetIntegerv":
                sigs.add("void " + name + "(int a, int[] b, int c)");
                break;
            case "glNormalPointer":
                sigs.add("void " + name + "(int type, int stride, java.nio.Buffer p)");
                sigs.add("void " + name + "(int type, int stride, long offset)");
                break;
            case "glInterleavedArrays":
                sigs.add("void " + name + "(int format, int stride, java.nio.Buffer p)");
                sigs.add("void " + name + "(int format, int stride, long offset)");
                break;
            case "glGetString":
                sigs.add("String " + name + "(int a)");
                break;
            case "glLoadMatrixf": case "glColor4fv":
                sigs.add("void " + name + "(float[] a, int b)");
                break;
            // 4-arg
            case "glColor4f": case "glClearColor": case "glRotatef":
            case "glScissor": case "glViewport":
                if (name.equals("glColor4f") || name.equals("glClearColor") || name.equals("glRotatef"))
                    sigs.add("void " + name + "(float a, float b, float c, float d)");
                else
                    sigs.add("void " + name + "(int a, int b, int c, int d)");
                break;
            case "glColorPointer": case "glVertexPointer": case "glTexCoordPointer":
                sigs.add("void " + name + "(int size, int type, int stride, java.nio.Buffer p)");
                sigs.add("void " + name + "(int size, int type, int stride, long offset)");
                break;
            case "glDrawElements":
                sigs.add("void " + name + "(int mode, int count, int type, java.nio.Buffer idx)");
                sigs.add("void " + name + "(int mode, int count, int type, long offset)");
                break;
            case "glLightfv":
                sigs.add("void " + name + "(int light, int pname, float[] params, int offset)");
                break;
            case "glTexEnvfv": case "glTexGenfv":
                sigs.add("void " + name + "(int a, int b, float[] c, int d)");
                break;
            case "glBufferDataARB":
                sigs.add("void " + name + "(int target, java.nio.Buffer data)");
                sigs.add("void " + name + "(int target, int size, java.nio.Buffer data, int usage)");
                break;
            case "glBufferSubDataARB":
                sigs.add("void " + name + "(int target, int offset, java.nio.Buffer data)");
                sigs.add("void " + name + "(int target, int offset, int size, java.nio.Buffer data)");
                break;
            case "glCopyPixels": case "glDrawPixels":
                sigs.add("void " + name + "(int a, int b, int c, int d, " +
                        (name.equals("glDrawPixels") ? "java.nio.Buffer e" : "int e") + ")");
                break;
            // 5+ arg
            case "glOrtho":
                sigs.add("void " + name + "(double a, double b, double c, double d, double e, double f)");
                break;
            case "glProgramLocalParameter4fARB":
                sigs.add("void " + name + "(int a, int b, float c, float d, float e, float f)");
                break;
            case "glProgramLocalParameter4fvARB":
                sigs.add("void " + name + "(int a, int b, float[] c, int d)");
                sigs.add("void " + name + "(int a, int b, java.nio.FloatBuffer c)");
                break;
            case "glProgramStringARB":
                sigs.add("void " + name + "(int a, int b, int c, String d)");
                break;
            case "glTexImage1D":
                sigs.add("void " + name + "(int a, int b, int c, int d, int e, int f, int g, java.nio.Buffer h)");
                break;
            case "glTexImage2D":
                sigs.add("void " + name + "(int a, int b, int c, int d, int e, int f, int g, int h, java.nio.Buffer i)");
                break;
            case "glTexImage3D":
                sigs.add("void " + name + "(int a, int b, int c, int d, int e, int f, int g, int h, int i, java.nio.Buffer j)");
                break;
            default:
                // Fallback: generate a generic varargs method
                sigs.add("void " + name + "(Object... args)");
                break;
        }

        return sigs;
    }
}
