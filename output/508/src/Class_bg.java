final class Class_bg {
   private static Class_r a = Class_tc.a(43, "Thu");
   static Class_r b = Class_tc.a(43, "rot:");
   static volatile int c = 0;
   static Class_r[] d = new Class_r[]{Class_bg.m, Class_bg.h, Class_bg.j, Class_bg.g, a, Class_bg.k, Class_bg.i};
   static int[] e = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
   static int f;
   private static Class_r g = Class_tc.a(43, "Wed");
   private static Class_r h = Class_tc.a(43, "Mon");
   private static Class_r i = Class_tc.a(43, "Sat");
   private static Class_r j = Class_tc.a(43, "Tue");
   private static Class_r k = Class_tc.a(43, "Fri");
   static int l = 0;
   private static Class_r m = Class_tc.a(43, "Sun");
   static int n;
   static Class_qc o = new Class_qc(50);
   static byte[][][] p;

   public static void a(int var0) {
      try {
         g = null;
         a = null;
         o = null;
         h = null;
         j = null;
         m = null;
         d = null;
         p = null;
         if (var0 != -5) {
            a((byte)49, null, null);
         }

         k = null;
         i = null;
         b = null;
         e = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "bg.C(" + var0 + ')');
      }
   }

   static final void a(Class_ik param0, Class_lh param1, int param2, byte param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic client.lb I
      // 003: istore 16
      // 005: bipush -54
      // 007: bipush -40
      // 009: iload 3
      // 00a: isub
      // 00b: bipush 34
      // 00d: idiv
      // 00e: irem
      // 00f: istore 4
      // 011: getstatic Class_bg.n I
      // 014: bipush 1
      // 015: iadd
      // 016: putstatic Class_bg.n I
      // 019: new Class_kc
      // 01c: dup
      // 01d: invokespecial Class_kc.<init> ()V
      // 020: astore 5
      // 022: aload 5
      // 024: aload 1
      // 025: sipush -6677
      // 028: invokevirtual Class_lh.n (I)I
      // 02b: putfield Class_kc.s I
      // 02e: aload 5
      // 030: aload 1
      // 031: sipush -5528
      // 034: invokevirtual Class_lh.h (I)I
      // 037: putfield Class_kc.F I
      // 03a: aload 5
      // 03c: aload 5
      // 03e: getfield Class_kc.s I
      // 041: newarray 10
      // 043: putfield Class_kc.B [I
      // 046: aload 5
      // 048: aload 5
      // 04a: getfield Class_kc.s I
      // 04d: newarray 10
      // 04f: putfield Class_kc.x [I
      // 052: aload 5
      // 054: aload 5
      // 056: getfield Class_kc.s I
      // 059: multianewarray 123 1
      // 05d: putfield Class_kc.p [[[B
      // 060: aload 5
      // 062: aload 5
      // 064: getfield Class_kc.s I
      // 067: anewarray 126
      // 06a: putfield Class_kc.C [LClass_ei;
      // 06d: aload 5
      // 06f: aload 5
      // 071: getfield Class_kc.s I
      // 074: newarray 10
      // 076: putfield Class_kc.w [I
      // 079: aload 5
      // 07b: aload 5
      // 07d: getfield Class_kc.s I
      // 080: anewarray 126
      // 083: putfield Class_kc.G [LClass_ei;
      // 086: bipush 0
      // 087: istore 6
      // 089: iload 16
      // 08b: ifeq 26f
      // 08e: aload 1
      // 08f: sipush -6677
      // 092: invokevirtual Class_lh.n (I)I
      // 095: istore 7
      // 097: iload 7
      // 099: ifeq 0ae
      // 09c: iload 7
      // 09e: bipush -1
      // 09f: ixor
      // 0a0: bipush -2
      // 0a2: if_icmpeq 0ae
      // 0a5: iload 7
      // 0a7: bipush -1
      // 0a8: ixor
      // 0a9: bipush -3
      // 0ab: if_icmpne 118
      // 0ae: new java/lang/String
      // 0b1: dup
      // 0b2: aload 1
      // 0b3: bipush 127
      // 0b5: invokevirtual Class_lh.e (I)LClass_r;
      // 0b8: bipush -115
      // 0ba: invokevirtual Class_r.a (B)[B
      // 0bd: invokespecial java/lang/String.<init> ([B)V
      // 0c0: astore 8
      // 0c2: new java/lang/String
      // 0c5: dup
      // 0c6: aload 1
      // 0c7: bipush 127
      // 0c9: invokevirtual Class_lh.e (I)LClass_r;
      // 0cc: bipush -82
      // 0ce: invokevirtual Class_r.a (B)[B
      // 0d1: invokespecial java/lang/String.<init> ([B)V
      // 0d4: astore 9
      // 0d6: bipush 0
      // 0d7: istore 10
      // 0d9: iload 7
      // 0db: bipush 1
      // 0dc: if_icmpne 0e8
      // 0df: aload 1
      // 0e0: sipush -5528
      // 0e3: invokevirtual Class_lh.h (I)I
      // 0e6: istore 10
      // 0e8: aload 5
      // 0ea: getfield Class_kc.x [I
      // 0ed: iload 6
      // 0ef: iload 7
      // 0f1: iastore
      // 0f2: aload 5
      // 0f4: getfield Class_kc.B [I
      // 0f7: iload 6
      // 0f9: iload 10
      // 0fb: iastore
      // 0fc: aload 5
      // 0fe: getfield Class_kc.G [LClass_ei;
      // 101: iload 6
      // 103: aload 0
      // 104: sipush 30810
      // 107: aload 9
      // 109: aload 8
      // 10b: bipush -1
      // 10c: invokestatic Class_ee.a (Ljava/lang/String;I)Ljava/lang/Class;
      // 10f: invokevirtual Class_ik.a (ILjava/lang/String;Ljava/lang/Class;)LClass_ei;
      // 112: aastore
      // 113: iload 16
      // 115: ifeq 26c
      // 118: iload 7
      // 11a: bipush 3
      // 11b: if_icmpeq 127
      // 11e: iload 7
      // 120: bipush -1
      // 121: ixor
      // 122: bipush -5
      // 124: if_icmpne 26c
      // 127: new java/lang/String
      // 12a: dup
      // 12b: aload 1
      // 12c: bipush 127
      // 12e: invokevirtual Class_lh.e (I)LClass_r;
      // 131: bipush -88
      // 133: invokevirtual Class_r.a (B)[B
      // 136: invokespecial java/lang/String.<init> ([B)V
      // 139: astore 8
      // 13b: new java/lang/String
      // 13e: dup
      // 13f: aload 1
      // 140: bipush 127
      // 142: invokevirtual Class_lh.e (I)LClass_r;
      // 145: bipush -86
      // 147: invokevirtual Class_r.a (B)[B
      // 14a: invokespecial java/lang/String.<init> ([B)V
      // 14d: astore 9
      // 14f: aload 1
      // 150: sipush -6677
      // 153: invokevirtual Class_lh.n (I)I
      // 156: istore 10
      // 158: iload 10
      // 15a: anewarray 138
      // 15d: astore 11
      // 15f: bipush 0
      // 160: istore 12
      // 162: iload 16
      // 164: ifeq 181
      // 167: aload 11
      // 169: iload 12
      // 16b: new java/lang/String
      // 16e: dup
      // 16f: aload 1
      // 170: bipush 127
      // 172: invokevirtual Class_lh.e (I)LClass_r;
      // 175: bipush -113
      // 177: invokevirtual Class_r.a (B)[B
      // 17a: invokespecial java/lang/String.<init> ([B)V
      // 17d: aastore
      // 17e: iinc 12 1
      // 181: iload 10
      // 183: bipush -1
      // 184: ixor
      // 185: iload 12
      // 187: bipush -1
      // 188: ixor
      // 189: if_icmplt 167
      // 18c: iload 10
      // 18e: multianewarray 161 1
      // 192: astore 13
      // 194: iload 7
      // 196: bipush -1
      // 197: ixor
      // 198: bipush -4
      // 19a: if_icmpne 1d2
      // 19d: bipush 0
      // 19e: istore 14
      // 1a0: iload 16
      // 1a2: ifeq 1c7
      // 1a5: aload 1
      // 1a6: sipush -5528
      // 1a9: invokevirtual Class_lh.h (I)I
      // 1ac: istore 15
      // 1ae: aload 13
      // 1b0: iload 14
      // 1b2: iload 15
      // 1b4: newarray 8
      // 1b6: aastore
      // 1b7: aload 1
      // 1b8: bipush 0
      // 1b9: bipush 0
      // 1ba: iload 15
      // 1bc: aload 13
      // 1be: iload 14
      // 1c0: aaload
      // 1c1: invokevirtual Class_lh.a (III[B)V
      // 1c4: iinc 14 1
      // 1c7: iload 14
      // 1c9: bipush -1
      // 1ca: ixor
      // 1cb: iload 10
      // 1cd: bipush -1
      // 1ce: ixor
      // 1cf: if_icmpgt 1a5
      // 1d2: iload 10
      // 1d4: anewarray 166
      // 1d7: astore 14
      // 1d9: aload 5
      // 1db: getfield Class_kc.x [I
      // 1de: iload 6
      // 1e0: iload 7
      // 1e2: iastore
      // 1e3: bipush 0
      // 1e4: istore 15
      // 1e6: iload 16
      // 1e8: ifeq 1fc
      // 1eb: aload 14
      // 1ed: iload 15
      // 1ef: aload 11
      // 1f1: iload 15
      // 1f3: aaload
      // 1f4: bipush -1
      // 1f5: invokestatic Class_ee.a (Ljava/lang/String;I)Ljava/lang/Class;
      // 1f8: aastore
      // 1f9: iinc 15 1
      // 1fc: iload 15
      // 1fe: iload 10
      // 200: if_icmplt 1eb
      // 203: aload 5
      // 205: getfield Class_kc.C [LClass_ei;
      // 208: iload 6
      // 20a: aload 0
      // 20b: aload 14
      // 20d: bipush 0
      // 20e: aload 9
      // 210: aload 8
      // 212: bipush -1
      // 213: invokestatic Class_ee.a (Ljava/lang/String;I)Ljava/lang/Class;
      // 216: invokevirtual Class_ik.a ([Ljava/lang/Class;ILjava/lang/String;Ljava/lang/Class;)LClass_ei;
      // 219: aastore
      // 21a: aload 5
      // 21c: getfield Class_kc.p [[[B
      // 21f: iload 6
      // 221: aload 13
      // 223: aastore
      // 224: goto 26c
      // 227: pop
      // 228: aload 5
      // 22a: getfield Class_kc.w [I
      // 22d: iload 6
      // 22f: bipush -1
      // 230: iastore
      // 231: goto 26c
      // 234: pop
      // 235: aload 5
      // 237: getfield Class_kc.w [I
      // 23a: iload 6
      // 23c: bipush -2
      // 23e: iastore
      // 23f: goto 26c
      // 242: pop
      // 243: aload 5
      // 245: getfield Class_kc.w [I
      // 248: iload 6
      // 24a: bipush -3
      // 24c: iastore
      // 24d: goto 26c
      // 250: pop
      // 251: aload 5
      // 253: getfield Class_kc.w [I
      // 256: iload 6
      // 258: bipush -4
      // 25a: iastore
      // 25b: goto 26c
      // 25e: pop
      // 25f: aload 5
      // 261: getfield Class_kc.w [I
      // 264: iload 6
      // 266: bipush -5
      // 268: iastore
      // 269: goto 26c
      // 26c: iinc 6 1
      // 26f: iload 6
      // 271: bipush -1
      // 272: ixor
      // 273: aload 5
      // 275: getfield Class_kc.s I
      // 278: bipush -1
      // 279: ixor
      // 27a: if_icmpgt 08e
      // 27d: getstatic Class_hg.g LClass_c;
      // 280: aload 5
      // 282: bipush 1
      // 283: invokevirtual Class_c.a (LClass_li;Z)V
      // 286: return
      // 287: astore 4
      // 289: aload 4
      // 28b: new java/lang/StringBuffer
      // 28e: dup
      // 28f: ldc "bg.B("
      // 291: invokespecial java/lang/StringBuffer.<init> (Ljava/lang/String;)V
      // 294: aload 0
      // 295: ifnull 29d
      // 298: ldc "{...}"
      // 29a: goto 29f
      // 29d: ldc "null"
      // 29f: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 2a2: bipush 44
      // 2a4: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 2a7: aload 1
      // 2a8: ifnull 2b0
      // 2ab: ldc "{...}"
      // 2ad: goto 2b2
      // 2b0: ldc "null"
      // 2b2: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 2b5: bipush 44
      // 2b7: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 2ba: iload 2
      // 2bb: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 2be: bipush 44
      // 2c0: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 2c3: iload 3
      // 2c4: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 2c7: bipush 41
      // 2c9: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 2cc: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 2cf: invokestatic Class_sh.a (Ljava/lang/Throwable;Ljava/lang/String;)LClass_ua;
      // 2d2: athrow
   }

   static final void a(byte var0, Class_pe var1, Class_pe var2) {
      try {
         f++;
         if (var1.x != null) {
            var1.b((byte)73);
         }

         var1.x = var2;
         var1.C = var2.C;
         if (var0 == -74) {
            var1.x.C = var1;
            var1.C.x = var1;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "bg.A(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ? "{...}" : "null") + ')');
      }
   }
}
