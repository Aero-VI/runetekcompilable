import java.io.IOException;

abstract class Class_hg {
   static int a;
   static Class_lh b;
   static int c = -2;
   private static Class_r d = Class_tc.a(43, " is already on your friend list)3");
   static int e;
   static int[] f = new int[128];
   static Class_c g = new Class_c();
   static Class_r h = d;
   static int i;
   static int j;
   static Class_r k = Class_tc.a(43, "Fallen lassen");
   static Class_r l = Class_tc.a(43, "::fps ");
   static int m;
   static int n;
   static Class_r o = Class_tc.a(43, "null");

   public static void a(int var0) {
      try {
         k = null;
         g = null;
         l = null;
         o = null;
         int var1 = 89 / ((var0 - 55) / 57);
         b = null;
         f = null;
         h = null;
         d = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "hg.I(" + var0 + ')');
      }
   }

   static final void a(int var0, long var1) {
      try {
         j++;
         if (var1 > 0L) {
            if (var1 % 10L != 0L) {
               Class_ee.a(false, var1);
            } else {
               Class_ee.a(false, var1 + -1L);
               Class_ee.a(false, 1L);
            }

            if (var0 != -5) {
               a(false, false);
            }
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "hg.F(" + var0 + ',' + var1 + ')');
      }
   }

   abstract void a(boolean var1);

   static final void a(boolean var0, boolean var1) {
      try {
         a++;
         if (Class_v.s != null) {
            try {
               Class_lh var2 = new Class_lh(4);
               var2.b(32, !var0 ? 3 : 2);
               var2.a(0, var1);
               Class_v.s.a(0, (byte)116, 4, var2.E);
            } catch (IOException var4) {
               try {
                  Class_v.s.b(-125);
               } catch (Exception var3) {
               }

               Class_v.s = null;
               Class_kg.y++;
            }
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "hg.E(" + var0 + ',' + var1 + ')');
      }
   }

   static final void a(boolean param0, int param1, Class_cc param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic client.lb I
      // 003: istore 14
      // 005: getstatic Class_hg.n I
      // 008: bipush 1
      // 009: iadd
      // 00a: putstatic Class_hg.n I
      // 00d: iload 0
      // 00e: bipush 0
      // 00f: if_icmpeq 017
      // 012: bipush -39
      // 014: invokestatic Class_hg.a (I)V
      // 017: getstatic Class_hg.g LClass_c;
      // 01a: bipush 76
      // 01c: invokevirtual Class_c.e (B)LClass_li;
      // 01f: checkcast Class_kc
      // 022: astore 3
      // 023: aload 3
      // 024: ifnonnull 028
      // 027: return
      // 028: bipush 0
      // 029: istore 4
      // 02b: bipush 0
      // 02c: istore 5
      // 02e: iload 14
      // 030: ifeq 0a1
      // 033: aload 3
      // 034: getfield Class_kc.G [LClass_ei;
      // 037: iload 5
      // 039: aaload
      // 03a: ifnull 067
      // 03d: aload 3
      // 03e: getfield Class_kc.G [LClass_ei;
      // 041: iload 5
      // 043: aaload
      // 044: getfield Class_ei.b I
      // 047: bipush -1
      // 048: ixor
      // 049: bipush -3
      // 04b: if_icmpne 057
      // 04e: aload 3
      // 04f: getfield Class_kc.w [I
      // 052: iload 5
      // 054: bipush -5
      // 056: iastore
      // 057: aload 3
      // 058: getfield Class_kc.G [LClass_ei;
      // 05b: iload 5
      // 05d: aaload
      // 05e: getfield Class_ei.b I
      // 061: ifne 067
      // 064: bipush 1
      // 065: istore 4
      // 067: aload 3
      // 068: getfield Class_kc.C [LClass_ei;
      // 06b: iload 5
      // 06d: aaload
      // 06e: ifnull 09e
      // 071: aload 3
      // 072: getfield Class_kc.C [LClass_ei;
      // 075: iload 5
      // 077: aaload
      // 078: getfield Class_ei.b I
      // 07b: bipush -1
      // 07c: ixor
      // 07d: bipush -3
      // 07f: if_icmpne 08b
      // 082: aload 3
      // 083: getfield Class_kc.w [I
      // 086: iload 5
      // 088: bipush -6
      // 08a: iastore
      // 08b: aload 3
      // 08c: getfield Class_kc.C [LClass_ei;
      // 08f: iload 5
      // 091: aaload
      // 092: getfield Class_ei.b I
      // 095: bipush -1
      // 096: ixor
      // 097: bipush -1
      // 098: if_icmpne 09e
      // 09b: bipush 1
      // 09c: istore 4
      // 09e: iinc 5 1
      // 0a1: iload 5
      // 0a3: aload 3
      // 0a4: getfield Class_kc.s I
      // 0a7: if_icmplt 033
      // 0aa: iload 4
      // 0ac: ifeq 0b0
      // 0af: return
      // 0b0: aload 2
      // 0b1: bipush -53
      // 0b3: iload 1
      // 0b4: invokevirtual Class_cc.o (II)V
      // 0b7: aload 2
      // 0b8: bipush 32
      // 0ba: bipush 0
      // 0bb: invokevirtual Class_lh.b (II)V
      // 0be: aload 2
      // 0bf: getfield Class_lh.p I
      // 0c2: istore 6
      // 0c4: aload 2
      // 0c5: ldc 544537784
      // 0c7: aload 3
      // 0c8: getfield Class_kc.F I
      // 0cb: invokevirtual Class_lh.g (II)V
      // 0ce: bipush 0
      // 0cf: istore 7
      // 0d1: iload 14
      // 0d3: ifeq 312
      // 0d6: aload 3
      // 0d7: getfield Class_kc.w [I
      // 0da: iload 7
      // 0dc: iaload
      // 0dd: ifeq 0f2
      // 0e0: aload 2
      // 0e1: bipush 32
      // 0e3: aload 3
      // 0e4: getfield Class_kc.w [I
      // 0e7: iload 7
      // 0e9: iaload
      // 0ea: invokevirtual Class_lh.b (II)V
      // 0ed: iload 14
      // 0ef: ifeq 30f
      // 0f2: aload 3
      // 0f3: getfield Class_kc.x [I
      // 0f6: iload 7
      // 0f8: iaload
      // 0f9: istore 8
      // 0fb: iload 8
      // 0fd: bipush -1
      // 0fe: ixor
      // 0ff: bipush -1
      // 100: if_icmpne 12e
      // 103: aload 3
      // 104: getfield Class_kc.G [LClass_ei;
      // 107: iload 7
      // 109: aaload
      // 10a: getfield Class_ei.e Ljava/lang/Object;
      // 10d: checkcast java/lang/reflect/Field
      // 110: astore 9
      // 112: aload 9
      // 114: aconst_null
      // 115: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 118: istore 10
      // 11a: aload 2
      // 11b: bipush 32
      // 11d: bipush 0
      // 11e: invokevirtual Class_lh.b (II)V
      // 121: aload 2
      // 122: ldc 544537784
      // 124: iload 10
      // 126: invokevirtual Class_lh.g (II)V
      // 129: iload 14
      // 12b: ifeq 18a
      // 12e: iload 8
      // 130: bipush -1
      // 131: ixor
      // 132: bipush -2
      // 134: if_icmpne 15f
      // 137: aload 3
      // 138: getfield Class_kc.G [LClass_ei;
      // 13b: iload 7
      // 13d: aaload
      // 13e: getfield Class_ei.e Ljava/lang/Object;
      // 141: checkcast java/lang/reflect/Field
      // 144: astore 9
      // 146: aload 9
      // 148: aconst_null
      // 149: aload 3
      // 14a: getfield Class_kc.B [I
      // 14d: iload 7
      // 14f: iaload
      // 150: invokevirtual java/lang/reflect/Field.setInt (Ljava/lang/Object;I)V
      // 153: aload 2
      // 154: bipush 32
      // 156: bipush 0
      // 157: invokevirtual Class_lh.b (II)V
      // 15a: iload 14
      // 15c: ifeq 18a
      // 15f: iload 8
      // 161: bipush 2
      // 162: if_icmpne 18a
      // 165: aload 3
      // 166: getfield Class_kc.G [LClass_ei;
      // 169: iload 7
      // 16b: aaload
      // 16c: getfield Class_ei.e Ljava/lang/Object;
      // 16f: checkcast java/lang/reflect/Field
      // 172: astore 9
      // 174: aload 9
      // 176: invokevirtual java/lang/reflect/Field.getModifiers ()I
      // 179: istore 10
      // 17b: aload 2
      // 17c: bipush 32
      // 17e: bipush 0
      // 17f: invokevirtual Class_lh.b (II)V
      // 182: aload 2
      // 183: ldc 544537784
      // 185: iload 10
      // 187: invokevirtual Class_lh.g (II)V
      // 18a: iload 8
      // 18c: bipush 3
      // 18d: if_icmpne 251
      // 190: aload 3
      // 191: getfield Class_kc.C [LClass_ei;
      // 194: iload 7
      // 196: aaload
      // 197: getfield Class_ei.e Ljava/lang/Object;
      // 19a: checkcast java/lang/reflect/Method
      // 19d: astore 9
      // 19f: aload 3
      // 1a0: getfield Class_kc.p [[[B
      // 1a3: iload 7
      // 1a5: aaload
      // 1a6: astore 10
      // 1a8: aload 10
      // 1aa: arraylength
      // 1ab: anewarray 4
      // 1ae: astore 11
      // 1b0: bipush 0
      // 1b1: istore 12
      // 1b3: iload 14
      // 1b5: ifeq 1da
      // 1b8: new java/io/ObjectInputStream
      // 1bb: dup
      // 1bc: new java/io/ByteArrayInputStream
      // 1bf: dup
      // 1c0: aload 10
      // 1c2: iload 12
      // 1c4: aaload
      // 1c5: invokespecial java/io/ByteArrayInputStream.<init> ([B)V
      // 1c8: invokespecial java/io/ObjectInputStream.<init> (Ljava/io/InputStream;)V
      // 1cb: astore 13
      // 1cd: aload 11
      // 1cf: iload 12
      // 1d1: aload 13
      // 1d3: invokevirtual java/io/ObjectInputStream.readObject ()Ljava/lang/Object;
      // 1d6: aastore
      // 1d7: iinc 12 1
      // 1da: aload 10
      // 1dc: arraylength
      // 1dd: iload 12
      // 1df: if_icmpgt 1b8
      // 1e2: aload 9
      // 1e4: aconst_null
      // 1e5: aload 11
      // 1e7: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1ea: astore 13
      // 1ec: aload 13
      // 1ee: ifnull 245
      // 1f1: aload 13
      // 1f3: instanceof java/lang/Number
      // 1f6: ifeq 21a
      // 1f9: aload 2
      // 1fa: bipush 32
      // 1fc: bipush 1
      // 1fd: invokevirtual Class_lh.b (II)V
      // 200: aload 2
      // 201: iload 0
      // 202: ifeq 209
      // 205: bipush 0
      // 206: goto 20a
      // 209: bipush 1
      // 20a: aload 13
      // 20c: checkcast java/lang/Number
      // 20f: invokevirtual java/lang/Number.longValue ()J
      // 212: invokevirtual Class_lh.a (ZJ)V
      // 215: iload 14
      // 217: ifeq 30f
      // 21a: aload 13
      // 21c: instanceof Class_r
      // 21f: ifne 22e
      // 222: aload 2
      // 223: bipush 32
      // 225: bipush 4
      // 226: invokevirtual Class_lh.b (II)V
      // 229: iload 14
      // 22b: ifeq 30f
      // 22e: aload 2
      // 22f: bipush 32
      // 231: bipush 2
      // 232: invokevirtual Class_lh.b (II)V
      // 235: aload 2
      // 236: bipush -9
      // 238: aload 13
      // 23a: checkcast Class_r
      // 23d: invokevirtual Class_lh.a (BLClass_r;)V
      // 240: iload 14
      // 242: ifeq 30f
      // 245: aload 2
      // 246: bipush 32
      // 248: bipush 0
      // 249: invokevirtual Class_lh.b (II)V
      // 24c: iload 14
      // 24e: ifeq 30f
      // 251: iload 8
      // 253: bipush 4
      // 254: if_icmpne 30f
      // 257: aload 3
      // 258: getfield Class_kc.C [LClass_ei;
      // 25b: iload 7
      // 25d: aaload
      // 25e: getfield Class_ei.e Ljava/lang/Object;
      // 261: checkcast java/lang/reflect/Method
      // 264: astore 9
      // 266: aload 9
      // 268: invokevirtual java/lang/reflect/Method.getModifiers ()I
      // 26b: istore 10
      // 26d: aload 2
      // 26e: bipush 32
      // 270: bipush 0
      // 271: invokevirtual Class_lh.b (II)V
      // 274: aload 2
      // 275: ldc 544537784
      // 277: iload 10
      // 279: invokevirtual Class_lh.g (II)V
      // 27c: goto 30f
      // 27f: pop
      // 280: aload 2
      // 281: bipush 32
      // 283: bipush -10
      // 285: invokevirtual Class_lh.b (II)V
      // 288: goto 30f
      // 28b: pop
      // 28c: aload 2
      // 28d: bipush 32
      // 28f: bipush -11
      // 291: invokevirtual Class_lh.b (II)V
      // 294: goto 30f
      // 297: pop
      // 298: aload 2
      // 299: bipush 32
      // 29b: bipush -12
      // 29d: invokevirtual Class_lh.b (II)V
      // 2a0: goto 30f
      // 2a3: pop
      // 2a4: aload 2
      // 2a5: bipush 32
      // 2a7: bipush -13
      // 2a9: invokevirtual Class_lh.b (II)V
      // 2ac: goto 30f
      // 2af: pop
      // 2b0: aload 2
      // 2b1: bipush 32
      // 2b3: bipush -14
      // 2b5: invokevirtual Class_lh.b (II)V
      // 2b8: goto 30f
      // 2bb: pop
      // 2bc: aload 2
      // 2bd: bipush 32
      // 2bf: bipush -15
      // 2c1: invokevirtual Class_lh.b (II)V
      // 2c4: goto 30f
      // 2c7: pop
      // 2c8: aload 2
      // 2c9: bipush 32
      // 2cb: bipush -16
      // 2cd: invokevirtual Class_lh.b (II)V
      // 2d0: goto 30f
      // 2d3: pop
      // 2d4: aload 2
      // 2d5: bipush 32
      // 2d7: bipush -17
      // 2d9: invokevirtual Class_lh.b (II)V
      // 2dc: goto 30f
      // 2df: pop
      // 2e0: aload 2
      // 2e1: bipush 32
      // 2e3: bipush -18
      // 2e5: invokevirtual Class_lh.b (II)V
      // 2e8: goto 30f
      // 2eb: pop
      // 2ec: aload 2
      // 2ed: bipush 32
      // 2ef: bipush -19
      // 2f1: invokevirtual Class_lh.b (II)V
      // 2f4: goto 30f
      // 2f7: pop
      // 2f8: aload 2
      // 2f9: bipush 32
      // 2fb: bipush -20
      // 2fd: invokevirtual Class_lh.b (II)V
      // 300: goto 30f
      // 303: pop
      // 304: aload 2
      // 305: bipush 32
      // 307: bipush -21
      // 309: invokevirtual Class_lh.b (II)V
      // 30c: goto 30f
      // 30f: iinc 7 1
      // 312: iload 7
      // 314: bipush -1
      // 315: ixor
      // 316: aload 3
      // 317: getfield Class_kc.s I
      // 31a: bipush -1
      // 31b: ixor
      // 31c: if_icmpgt 0d6
      // 31f: aload 2
      // 320: iload 6
      // 322: bipush -116
      // 324: invokevirtual Class_lh.c (II)I
      // 327: pop
      // 328: aload 2
      // 329: aload 2
      // 32a: getfield Class_lh.p I
      // 32d: iload 6
      // 32f: isub
      // 330: bipush 124
      // 332: invokevirtual Class_lh.e (II)V
      // 335: aload 3
      // 336: sipush -17554
      // 339: invokevirtual Class_li.c (I)V
      // 33c: goto 017
      // 33f: astore 3
      // 340: aload 3
      // 341: new java/lang/StringBuffer
      // 344: dup
      // 345: ldc_w "hg.H("
      // 348: invokespecial java/lang/StringBuffer.<init> (Ljava/lang/String;)V
      // 34b: iload 0
      // 34c: invokevirtual java/lang/StringBuffer.append (Z)Ljava/lang/StringBuffer;
      // 34f: bipush 44
      // 351: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 354: iload 1
      // 355: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 358: bipush 44
      // 35a: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 35d: aload 2
      // 35e: ifnull 367
      // 361: ldc_w "{...}"
      // 364: goto 36a
      // 367: ldc_w "null"
      // 36a: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 36d: bipush 41
      // 36f: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 372: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 375: invokestatic Class_sh.a (Ljava/lang/Throwable;Ljava/lang/String;)LClass_ua;
      // 378: athrow
   }

   public Class_hg() {
   }

   abstract int a(int var1, int var2, int var3);

   static final int b(int var0, int var1, int var2) {
      try {
         if (var1 != -11143) {
            return 32;
         } else {
            Class_qd var3 = (Class_qd)Class_f.X.a(var2, -106);
            e++;
            if (var3 == null) {
               return -1;
            } else {
               return var0 >= 0 && var0 < var3.B.length ? var3.B[var0] : -1;
            }
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "hg.G(" + var0 + 44 + var1 + 44 + var2 + 41);
      }
   }
}
