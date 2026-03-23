final class Class_kc extends Class_li {
   byte[][][] p;
   static int q = 0;
   static String r;
   int s;
   static Class_r t = Class_tc.a(43, "Abbrechen");
   static int u = 0;
   static boolean[][] v;
   int[] w;
   int[] x;
   static int y;
   static int z = 0;
   static float A;
   int[] B;
   Class_ei[] C;
   static int D;
   static int E;
   int F;
   Class_ei[] G;
   static int H;

   static final int a(int var0, byte var1, int var2, int var3) {
      int var5 = client.lb;

      try {
         label39: {
            E++;
            if (var2 > 243) {
               var0 >>= 4;
               if (var5 == 0) {
                  break label39;
               }
            }

            if (var2 > 217) {
               var0 >>= 3;
               if (var5 == 0) {
                  break label39;
               }
            }

            if (~var2 >= -193) {
               if (~var2 >= -180) {
                  break label39;
               }

               var0 >>= 1;
               if (var5 == 0) {
                  break label39;
               }
            }

            var0 >>= 2;
         }

         if (var1 >= -41) {
            v = null;
         }

         return (var2 >> -469200223) + (var3 >> -888935646 << -1740396694) - -(var0 >> 2023893669 << -1627632793);
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "kc.C(" + var0 + 44 + var1 + 44 + var2 + 44 + var3 + 41);
      }
   }

   static final void a(boolean param0, int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic client.lb I
      // 003: istore 8
      // 005: bipush 0
      // 006: istore 2
      // 007: iload 8
      // 009: ifeq 117
      // 00c: getstatic Class_rf.a [LClass_eh;
      // 00f: getstatic Class_kg.v [I
      // 012: iload 2
      // 013: iaload
      // 014: aaload
      // 015: astore 3
      // 016: ldc2_w 536870912
      // 019: getstatic Class_kg.v [I
      // 01c: iload 2
      // 01d: iaload
      // 01e: i2l
      // 01f: ldc -768001120
      // 021: lshl
      // 022: lor
      // 023: lstore 4
      // 025: aload 3
      // 026: ifnull 114
      // 029: aload 3
      // 02a: bipush 109
      // 02c: invokevirtual Class_eh.d (I)Z
      // 02f: ifeq 114
      // 032: iload 0
      // 033: ifeq 03a
      // 036: bipush 0
      // 037: goto 03b
      // 03a: bipush 1
      // 03b: aload 3
      // 03c: getfield Class_eh.Pb LClass_nd;
      // 03f: getfield Class_nd.o Z
      // 042: if_icmpeq 114
      // 045: aload 3
      // 046: getfield Class_eh.Pb LClass_nd;
      // 049: sipush 8937
      // 04c: invokevirtual Class_nd.e (I)Z
      // 04f: ifeq 114
      // 052: aload 3
      // 053: getfield Class_ta.hb I
      // 056: ldc 198532487
      // 058: ishr
      // 059: istore 6
      // 05b: aload 3
      // 05c: getfield Class_ta.J I
      // 05f: ldc 1446181031
      // 061: ishr
      // 062: istore 7
      // 064: iload 6
      // 066: bipush -1
      // 067: ixor
      // 068: bipush -1
      // 069: if_icmpgt 114
      // 06c: iload 6
      // 06e: bipush 104
      // 070: if_icmpge 114
      // 073: iload 7
      // 075: bipush -1
      // 076: ixor
      // 077: bipush -1
      // 078: if_icmpgt 114
      // 07b: iload 7
      // 07d: bipush 104
      // 07f: if_icmpge 114
      // 082: aload 3
      // 083: getfield Class_ta.Q I
      // 086: bipush 1
      // 087: if_icmpne 0c5
      // 08a: bipush 127
      // 08c: aload 3
      // 08d: getfield Class_ta.hb I
      // 090: iand
      // 091: bipush -1
      // 092: ixor
      // 093: bipush -65
      // 095: if_icmpne 0c5
      // 098: bipush 127
      // 09a: aload 3
      // 09b: getfield Class_ta.J I
      // 09e: iand
      // 09f: bipush -1
      // 0a0: ixor
      // 0a1: bipush -65
      // 0a3: if_icmpne 0c5
      // 0a6: getstatic Class_ad.l I
      // 0a9: bipush -1
      // 0aa: ixor
      // 0ab: getstatic Class_mk.b [[I
      // 0ae: iload 6
      // 0b0: aaload
      // 0b1: iload 7
      // 0b3: iaload
      // 0b4: bipush -1
      // 0b5: ixor
      // 0b6: if_icmpeq 114
      // 0b9: getstatic Class_mk.b [[I
      // 0bc: iload 6
      // 0be: aaload
      // 0bf: iload 7
      // 0c1: getstatic Class_ad.l I
      // 0c4: iastore
      // 0c5: aload 3
      // 0c6: getfield Class_eh.Pb LClass_nd;
      // 0c9: getfield Class_nd.B Z
      // 0cc: ifne 0d7
      // 0cf: lload 4
      // 0d1: ldc2_w -9223372036854775808
      // 0d4: lor
      // 0d5: lstore 4
      // 0d7: aload 3
      // 0d8: aload 3
      // 0d9: getfield Class_ta.hb I
      // 0dc: getstatic Class_jk.F I
      // 0df: aload 3
      // 0e0: getfield Class_ta.J I
      // 0e3: bipush 0
      // 0e4: invokestatic Class_fa.a (IIIZ)I
      // 0e7: putfield Class_ta.Cb I
      // 0ea: getstatic Class_jk.F I
      // 0ed: aload 3
      // 0ee: getfield Class_ta.hb I
      // 0f1: aload 3
      // 0f2: getfield Class_ta.J I
      // 0f5: aload 3
      // 0f6: getfield Class_ta.Cb I
      // 0f9: bipush 60
      // 0fb: bipush 64
      // 0fd: aload 3
      // 0fe: getfield Class_ta.Q I
      // 101: bipush -1
      // 102: iadd
      // 103: imul
      // 104: iadd
      // 105: aload 3
      // 106: aload 3
      // 107: getfield Class_ta.U I
      // 10a: lload 4
      // 10c: aload 3
      // 10d: getfield Class_ta.Db Z
      // 110: invokestatic Class_ci.a (IIIIILClass_a;IJZ)Z
      // 113: pop
      // 114: iinc 2 1
      // 117: getstatic Class_ke.p I
      // 11a: bipush -1
      // 11b: ixor
      // 11c: iload 2
      // 11d: bipush -1
      // 11e: ixor
      // 11f: if_icmplt 00c
      // 122: iload 1
      // 123: bipush -124
      // 125: if_icmplt 12e
      // 128: bipush 0
      // 129: bipush -2
      // 12b: invokestatic Class_kc.a (ZI)V
      // 12e: getstatic Class_kc.H I
      // 131: bipush 1
      // 132: iadd
      // 133: putstatic Class_kc.H I
      // 136: return
      // 137: astore 2
      // 138: aload 2
      // 139: new java/lang/StringBuffer
      // 13c: dup
      // 13d: ldc "kc.A("
      // 13f: invokespecial java/lang/StringBuffer.<init> (Ljava/lang/String;)V
      // 142: iload 0
      // 143: invokevirtual java/lang/StringBuffer.append (Z)Ljava/lang/StringBuffer;
      // 146: bipush 44
      // 148: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 14b: iload 1
      // 14c: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 14f: bipush 41
      // 151: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 154: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 157: invokestatic Class_sh.a (Ljava/lang/Throwable;Ljava/lang/String;)LClass_ua;
      // 15a: athrow
   }

   static final int a(boolean var0, boolean var1, byte var2) {
      try {
         if (var2 != 71) {
            return 84;
         } else {
            D++;
            int var3 = 0;
            if (var0) {
               var3 += Class_jd.i - -Class_ug.q;
            }

            if (var1) {
               var3 += Class_ck.c + Class_wh.p;
            }

            return var3;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "kc.B(" + var0 + 44 + var1 + 44 + var2 + 41);
      }
   }

   public Class_kc() {
   }

   public static void d(int var0) {
      try {
         v = null;
         t = null;
         r = null;
         if (var0 != -19267) {
            v = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "kc.D(" + var0 + ')');
      }
   }
}
