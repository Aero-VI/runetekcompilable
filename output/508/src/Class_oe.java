final class Class_oe implements Runnable {
   static boolean a = false;
   static Class_cj b;
   static int c;
   static int d;
   static int e;
   static int f;
   static int g;

   static final void a(byte var0) {
      try {
         Class_ia.bb = null;
         Class_lj.h = null;
         Class_ji.Y = null;
         if (var0 != -93) {
            a = true;
         }

         Class_ub.L = null;
         Class_ae.g = null;
         Class_ld.ib = null;
         g++;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "oe.E(" + var0 + ')');
      }
   }

   public static void b(byte var0) {
      try {
         b = null;
         int var1 = 9 % ((var0 - -76) / 48);
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "oe.A(" + var0 + ')');
      }
   }

   static final void a(int var0) {
      try {
         Class_pd.c.a(-51);
         e++;
         Class_aj.h.a(-54);
         Class_pj.b.a(-9);
         if (var0 <= 52) {
            b = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "oe.B(" + var0 + ')');
      }
   }

   public final void run() {
      try {
         f++;

         try {
            while (true) {
               Class_c var2 = Class_jb.V;
               Class_v var1;
               synchronized (var2) {
                  var1 = (Class_v)Class_jb.V.e((byte)76);
               }

               if (var1 == null) {
                  Class_hg.a(-5, 100L);
                  var2 = (Class_c)Class_kh.a;
                  synchronized (var2) {
                     if (Class_bb.d > 1) {
                        Class_bb.d--;
                        continue;
                     }

                     Class_bb.d = 0;
                     Class_kh.a.notifyAll();
                  }

                  return;
               } else {
                  if (var1.C == 0) {
                     var1.v.a(var1.q, (int)var1.a, var1.q.length, (byte)-111);
                     var2 = Class_jb.V;
                     synchronized (var2) {
                        var1.c(-17554);
                     }
                  } else if (~var1.C == -2) {
                     var1.q = var1.v.a((int)var1.a, true);
                     var2 = Class_jb.V;
                     synchronized (var2) {
                        Class_wg.d.a(var1, true);
                     }
                  }

                  var2 = (Class_c)Class_kh.a;
                  synchronized (var2) {
                     if (Class_bb.d > 1) {
                        Class_bb.d = 600;
                        continue;
                     }

                     Class_bb.d = 0;
                     Class_kh.a.notifyAll();
                  }

                  return;
               }
            }
         } catch (Exception var44) {
            Class_mc.a(null, var44, 38);
         }
      } catch (RuntimeException var45) {
         throw Class_sh.a(var45, "oe.run(" + ')');
      }
   }

   static final Class_jb c(byte var0) {
      try {
         int var2 = -82 % ((-66 - var0) / 35);
         int var1 = Class_ld.ib[0] * Class_ia.bb[0];
         byte[] var3 = Class_lj.h[0];
         int[] var4 = new int[var1];
         c++;

         for (int var5 = 0; var1 > var5; var5++) {
            var4[var5] = Class_ji.Y[Class_ui.a(var3[var5], 255)];
         }

         Class_ni var6 = new Class_ni(Class_qb.b, Class_tf.bb, Class_ae.g[0], Class_ub.L[0], Class_ia.bb[0], Class_ld.ib[0], var4);
         a((byte)-93);
         return var6;
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "oe.C(" + var0 + ')');
      }
   }

   static final void d(byte param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic client.lb I
      // 003: istore 16
      // 005: iload 0
      // 006: bipush -110
      // 008: if_icmpeq 010
      // 00b: bipush -69
      // 00d: invokestatic Class_oe.d (B)V
      // 010: getstatic Class_oe.d I
      // 013: bipush 1
      // 014: iadd
      // 015: putstatic Class_oe.d I
      // 018: getstatic Class_aj.q [[B
      // 01b: arraylength
      // 01c: istore 1
      // 01d: bipush 0
      // 01e: istore 2
      // 01f: iload 16
      // 021: ifeq 21d
      // 024: getstatic Class_aj.q [[B
      // 027: iload 2
      // 028: aaload
      // 029: ifnull 21a
      // 02c: bipush -1
      // 02d: istore 3
      // 02e: bipush 0
      // 02f: istore 4
      // 031: iload 16
      // 033: ifeq 053
      // 036: getstatic Class_tb.c [I
      // 039: iload 4
      // 03b: iaload
      // 03c: bipush -1
      // 03d: ixor
      // 03e: getstatic Class_uh.e [I
      // 041: iload 2
      // 042: iaload
      // 043: bipush -1
      // 044: ixor
      // 045: if_icmpne 050
      // 048: iload 4
      // 04a: istore 3
      // 04b: iload 16
      // 04d: ifeq 05f
      // 050: iinc 4 1
      // 053: getstatic Class_oc.b I
      // 056: bipush -1
      // 057: ixor
      // 058: iload 4
      // 05a: bipush -1
      // 05b: ixor
      // 05c: if_icmplt 036
      // 05f: iload 3
      // 060: bipush -1
      // 061: if_icmpne 07a
      // 064: getstatic Class_tb.c [I
      // 067: getstatic Class_oc.b I
      // 06a: getstatic Class_uh.e [I
      // 06d: iload 2
      // 06e: iaload
      // 06f: iastore
      // 070: getstatic Class_oc.b I
      // 073: dup
      // 074: bipush 1
      // 075: iadd
      // 076: putstatic Class_oc.b I
      // 079: istore 3
      // 07a: new Class_lh
      // 07d: dup
      // 07e: getstatic Class_aj.q [[B
      // 081: iload 2
      // 082: aaload
      // 083: invokespecial Class_lh.<init> ([B)V
      // 086: astore 5
      // 088: bipush 0
      // 089: istore 6
      // 08b: iload 16
      // 08d: ifeq 208
      // 090: iload 6
      // 092: bipush -1
      // 093: ixor
      // 094: sipush -512
      // 097: if_icmple 21a
      // 09a: iload 3
      // 09b: iload 6
      // 09d: iinc 6 1
      // 0a0: ldc -1428217914
      // 0a2: ishl
      // 0a3: ior
      // 0a4: istore 7
      // 0a6: aload 5
      // 0a8: ldc 1355769544
      // 0aa: invokevirtual Class_lh.k (I)I
      // 0ad: istore 8
      // 0af: iload 8
      // 0b1: ldc -308588978
      // 0b3: ishr
      // 0b4: istore 9
      // 0b6: iload 8
      // 0b8: bipush 63
      // 0ba: iand
      // 0bb: istore 11
      // 0bd: bipush 63
      // 0bf: iload 8
      // 0c1: ldc 1724002311
      // 0c3: ishr
      // 0c4: iand
      // 0c5: istore 10
      // 0c7: iload 10
      // 0c9: getstatic Class_fj.e I
      // 0cc: ineg
      // 0cd: getstatic Class_uh.e [I
      // 0d0: iload 2
      // 0d1: iaload
      // 0d2: ldc -1417238360
      // 0d4: ishr
      // 0d5: bipush 64
      // 0d7: imul
      // 0d8: iadd
      // 0d9: iadd
      // 0da: istore 12
      // 0dc: iload 11
      // 0de: bipush 64
      // 0e0: getstatic Class_uh.e [I
      // 0e3: iload 2
      // 0e4: iaload
      // 0e5: sipush 255
      // 0e8: iand
      // 0e9: imul
      // 0ea: getstatic Class_va.ab I
      // 0ed: isub
      // 0ee: iadd
      // 0ef: istore 13
      // 0f1: aload 5
      // 0f3: ldc 1355769544
      // 0f5: invokevirtual Class_lh.k (I)I
      // 0f8: iload 0
      // 0f9: bipush -86
      // 0fb: ixor
      // 0fc: invokestatic Class_i.c (II)LClass_nd;
      // 0ff: astore 14
      // 101: getstatic Class_rf.a [LClass_eh;
      // 104: iload 7
      // 106: aaload
      // 107: ifnonnull 208
      // 10a: aload 14
      // 10c: getfield Class_nd.O B
      // 10f: bipush 1
      // 110: iand
      // 111: ifle 208
      // 114: getstatic Class_la.bb I
      // 117: iload 9
      // 119: if_icmpne 208
      // 11c: iload 12
      // 11e: iflt 208
      // 121: aload 14
      // 123: getfield Class_nd.T I
      // 126: iload 12
      // 128: iadd
      // 129: bipush 104
      // 12b: if_icmpge 208
      // 12e: iload 13
      // 130: bipush -1
      // 131: ixor
      // 132: bipush -1
      // 133: if_icmpgt 208
      // 136: aload 14
      // 138: getfield Class_nd.T I
      // 13b: iload 13
      // 13d: iadd
      // 13e: bipush 104
      // 140: if_icmpge 208
      // 143: getstatic Class_rf.a [LClass_eh;
      // 146: iload 7
      // 148: new Class_eh
      // 14b: dup
      // 14c: invokespecial Class_eh.<init> ()V
      // 14f: aastore
      // 150: getstatic Class_rf.a [LClass_eh;
      // 153: iload 7
      // 155: aaload
      // 156: astore 15
      // 158: getstatic Class_kg.v [I
      // 15b: getstatic Class_ke.p I
      // 15e: dup
      // 15f: bipush 1
      // 160: iadd
      // 161: putstatic Class_ke.p I
      // 164: iload 7
      // 166: iastore
      // 167: aload 15
      // 169: getstatic Class_be.C I
      // 16c: putfield Class_ta.vb I
      // 16f: aload 15
      // 171: aload 14
      // 173: putfield Class_eh.Pb LClass_nd;
      // 176: aload 15
      // 178: aload 15
      // 17a: getfield Class_eh.Pb LClass_nd;
      // 17d: getfield Class_nd.d I
      // 180: putfield Class_ta.C I
      // 183: aload 15
      // 185: aload 15
      // 187: getfield Class_eh.Pb LClass_nd;
      // 18a: getfield Class_nd.I I
      // 18d: putfield Class_ta.P I
      // 190: aload 15
      // 192: aload 15
      // 194: getfield Class_eh.Pb LClass_nd;
      // 197: getfield Class_nd.p I
      // 19a: putfield Class_ta.kb I
      // 19d: aload 15
      // 19f: aload 15
      // 1a1: getfield Class_eh.Pb LClass_nd;
      // 1a4: getfield Class_nd.jb I
      // 1a7: putfield Class_ta.lb I
      // 1aa: aload 15
      // 1ac: aload 15
      // 1ae: getfield Class_eh.Pb LClass_nd;
      // 1b1: getfield Class_nd.Y I
      // 1b4: putfield Class_ta.Bb I
      // 1b7: aload 15
      // 1b9: aload 15
      // 1bb: getfield Class_eh.Pb LClass_nd;
      // 1be: getfield Class_nd.j I
      // 1c1: putfield Class_ta.jb I
      // 1c4: aload 15
      // 1c6: aload 15
      // 1c8: getfield Class_eh.Pb LClass_nd;
      // 1cb: getfield Class_nd.e I
      // 1ce: putfield Class_ta.E I
      // 1d1: aload 15
      // 1d3: aload 15
      // 1d5: getfield Class_eh.Pb LClass_nd;
      // 1d8: getfield Class_nd.T I
      // 1db: putfield Class_ta.Q I
      // 1de: aload 15
      // 1e0: aload 15
      // 1e2: getfield Class_eh.Pb LClass_nd;
      // 1e5: getfield Class_nd.P I
      // 1e8: putfield Class_ta.ub I
      // 1eb: aload 15
      // 1ed: getfield Class_ta.Bb I
      // 1f0: bipush -1
      // 1f1: ixor
      // 1f2: bipush -1
      // 1f3: if_icmpne 1fc
      // 1f6: aload 15
      // 1f8: bipush 0
      // 1f9: putfield Class_ta.U I
      // 1fc: aload 15
      // 1fe: iload 13
      // 200: bipush -68
      // 202: iload 12
      // 204: bipush 1
      // 205: invokevirtual Class_ta.a (IBIZ)V
      // 208: getstatic Class_aj.q [[B
      // 20b: iload 2
      // 20c: aaload
      // 20d: arraylength
      // 20e: bipush -1
      // 20f: ixor
      // 210: aload 5
      // 212: getfield Class_lh.p I
      // 215: bipush -1
      // 216: ixor
      // 217: if_icmplt 090
      // 21a: iinc 2 1
      // 21d: iload 1
      // 21e: bipush -1
      // 21f: ixor
      // 220: iload 2
      // 221: bipush -1
      // 222: ixor
      // 223: if_icmplt 024
      // 226: return
      // 227: astore 1
      // 228: aload 1
      // 229: new java/lang/StringBuffer
      // 22c: dup
      // 22d: ldc_w "oe.D("
      // 230: invokespecial java/lang/StringBuffer.<init> (Ljava/lang/String;)V
      // 233: iload 0
      // 234: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 237: bipush 41
      // 239: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 23c: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 23f: invokestatic Class_sh.a (Ljava/lang/Throwable;Ljava/lang/String;)LClass_ua;
      // 242: athrow
   }
}
