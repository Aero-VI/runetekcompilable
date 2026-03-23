final class Class_te extends Class_lf {
   static Class_r Q = Class_te.Z;
   static int R;
   static int S;
   static int T;
   static Class_wf U = new Class_wf();
   static int V;
   static int W;
   static int X;
   static int Y;
   private static Class_r Z = Class_tc.a(43, "Walk here");
   static int ab;
   private int bb = 32768;
   static Class_th cb = new Class_th();
   static boolean db = false;
   static int eb;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int[] a(byte var1, int var2) {
      int var14 = client.lb;

      try {
         int[] var3 = super.H.a(false, var2);
         X++;
         if (super.H.s) {
            int[] var4 = this.b(1, var2, var1 + 29210);
            int[] var5 = this.b(2, var2, 29149);
            int var6 = 0;
            if (var14 != 0 || ~Class_ld.X < ~var6) {
               do {
                  int var7 = 0xFF & var4[var6] >> 1702924836;
                  int var8 = this.bb * var5[var6] >> -763540564;
                  int var9 = Class_nb.h[var7] * var8 >> -1251440436;
                  int var11 = Class_ed.d & (var9 >> -1031310292) + var6;
                  int var10 = var8 * Class_ud.e[var7] >> 2095166508;
                  int var12 = Class_fa.rc & (var10 >> -552194164) + var2;
                  int[] var13 = this.b(0, var12, var1 ^ -29154);
                  var3[var6] = var13[var11];
               } while (~Class_ld.X < ~(++var6));
            }
         }

         if (var1 != -61) {
            a((byte)-71, true);
         }

         return var3;
      } catch (RuntimeException var15) {
         throw Class_sh.a(var15, "te.G(" + var1 + ',' + var2 + ')');
      }
   }

   static final void a(byte param0, boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic client.lb I
      // 003: istore 14
      // 005: getstatic Class_te.V I
      // 008: bipush 1
      // 009: iadd
      // 00a: putstatic Class_te.V I
      // 00d: bipush 4
      // 00e: istore 2
      // 00f: getstatic Class_kj.T [[B
      // 012: astore 3
      // 013: iload 0
      // 014: bipush -8
      // 016: if_icmplt 01e
      // 019: bipush 68
      // 01b: invokestatic Class_te.g (I)V
      // 01e: bipush 0
      // 01f: istore 4
      // 021: iload 14
      // 023: ifeq 10c
      // 026: sipush 16322
      // 029: invokestatic Class_hf.c (I)V
      // 02c: bipush 0
      // 02d: istore 5
      // 02f: iload 14
      // 031: ifeq 100
      // 034: bipush 0
      // 035: istore 6
      // 037: iload 14
      // 039: ifeq 0f4
      // 03c: getstatic Class_ai.D [[[I
      // 03f: iload 4
      // 041: aaload
      // 042: iload 5
      // 044: aaload
      // 045: iload 6
      // 047: iaload
      // 048: istore 7
      // 04a: iload 7
      // 04c: bipush -1
      // 04d: if_icmpeq 0f1
      // 050: ldc 60286104
      // 052: iload 7
      // 054: iand
      // 055: ldc 1887294840
      // 057: ishr
      // 058: istore 8
      // 05a: iload 1
      // 05b: ifeq 066
      // 05e: iload 8
      // 060: bipush -1
      // 061: ixor
      // 062: bipush -1
      // 063: if_icmpne 0f1
      // 066: iload 7
      // 068: ldc 741895745
      // 06a: ishr
      // 06b: bipush 3
      // 06c: iand
      // 06d: istore 9
      // 06f: sipush 1023
      // 072: iload 7
      // 074: ldc 613354350
      // 076: ishr
      // 077: iand
      // 078: istore 10
      // 07a: iload 7
      // 07c: ldc -1395382493
      // 07e: ishr
      // 07f: sipush 2047
      // 082: iand
      // 083: istore 11
      // 085: iload 11
      // 087: bipush 8
      // 089: idiv
      // 08a: iload 10
      // 08c: bipush 8
      // 08e: idiv
      // 08f: ldc -637017144
      // 091: ishl
      // 092: iadd
      // 093: istore 12
      // 095: bipush 0
      // 096: istore 13
      // 098: iload 14
      // 09a: ifeq 0e4
      // 09d: iload 12
      // 09f: getstatic Class_uh.e [I
      // 0a2: iload 13
      // 0a4: iaload
      // 0a5: if_icmpne 0e1
      // 0a8: aload 3
      // 0a9: iload 13
      // 0ab: aaload
      // 0ac: ifnull 0e1
      // 0af: iload 4
      // 0b1: iload 1
      // 0b2: bipush 8
      // 0b4: bipush 7
      // 0b6: iload 11
      // 0b8: iand
      // 0b9: imul
      // 0ba: bipush 8
      // 0bc: iload 5
      // 0be: imul
      // 0bf: iload 9
      // 0c1: iload 10
      // 0c3: bipush 7
      // 0c5: iand
      // 0c6: bipush 8
      // 0c8: imul
      // 0c9: aload 3
      // 0ca: iload 13
      // 0cc: aaload
      // 0cd: iload 8
      // 0cf: getstatic Class_sj.j [LClass_ga;
      // 0d2: bipush 73
      // 0d4: iload 6
      // 0d6: bipush 8
      // 0d8: imul
      // 0d9: invokestatic Class_ua.a (IZIIII[BI[LClass_ga;II)V
      // 0dc: iload 14
      // 0de: ifeq 0f1
      // 0e1: iinc 13 1
      // 0e4: iload 13
      // 0e6: bipush -1
      // 0e7: ixor
      // 0e8: getstatic Class_uh.e [I
      // 0eb: arraylength
      // 0ec: bipush -1
      // 0ed: ixor
      // 0ee: if_icmpgt 09d
      // 0f1: iinc 6 1
      // 0f4: iload 6
      // 0f6: bipush -1
      // 0f7: ixor
      // 0f8: bipush -14
      // 0fa: if_icmpgt 03c
      // 0fd: iinc 5 1
      // 100: iload 5
      // 102: bipush -1
      // 103: ixor
      // 104: bipush -14
      // 106: if_icmpgt 034
      // 109: iinc 4 1
      // 10c: iload 2
      // 10d: bipush -1
      // 10e: ixor
      // 10f: iload 4
      // 111: bipush -1
      // 112: ixor
      // 113: if_icmplt 026
      // 116: return
      // 117: astore 2
      // 118: aload 2
      // 119: new java/lang/StringBuffer
      // 11c: dup
      // 11d: ldc "te.D("
      // 11f: invokespecial java/lang/StringBuffer.<init> (Ljava/lang/String;)V
      // 122: iload 0
      // 123: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 126: bipush 44
      // 128: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 12b: iload 1
      // 12c: invokevirtual java/lang/StringBuffer.append (Z)Ljava/lang/StringBuffer;
      // 12f: bipush 41
      // 131: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 134: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 137: invokestatic Class_sh.a (Ljava/lang/Throwable;Ljava/lang/String;)LClass_ua;
      // 13a: athrow
   }

   final void a(byte var1) {
      try {
         T++;
         Class_kg.a((byte)96);
         if (var1 > -22) {
            eb = 51;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "te.I(" + var1 + ')');
      }
   }

   public Class_te() {
      super(3, false);
   }

   final void a(Class_lh var1, int var2, int var3) {
      int var5 = client.lb;

      try {
         if (var3 != -1) {
            Z = null;
         }

         label44: {
            label37: {
               if (var2 != 0) {
                  if (~var2 != -2) {
                     break label44;
                  }

                  if (var5 == 0) {
                     break label37;
                  }
               }

               this.bb = var1.k(1355769544) << -1461083036;
               if (var5 == 0) {
                  break label44;
               }
            }

            super.C = ~var1.n(-6677) == -2;
         }

         R++;
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "te.K(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   public static void g(int var0) {
      try {
         U = null;
         if (var0 <= -3) {
            cb = null;
            Z = null;
            Q = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "te.C(" + var0 + ')');
      }
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, boolean var6) {
      try {
         Class_lh.y = var0;
         Class_wb.c = var3;
         Class_se.nb = var5;
         S++;
         if (var4 >= -83) {
            d(-36, 33, 16);
         }

         Class_vh.hb = var1;
         Class_ug.x = var2;
         if (var6 && ~Class_ug.x <= -101) {
            Class_oc.l = 64 + 128 * Class_vh.hb;
            Class_gg.D = 64 + 128 * Class_lh.y;
            Class_ef.s = Class_fa.a(Class_gg.D, Class_jk.F, Class_oc.l, false) + -Class_se.nb;
         }

         Class_wh.c = 2;
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "te.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void d(int var0, int var1, int var2) {
      int var10 = client.lb;

      try {
         Y++;
         int var3 = 0;
         if (var2 <= 54) {
            cb = null;
            if (var10 == 0 && var3 >= Class_tc.c) {
               return;
            }
         } else if (var3 >= Class_tc.c) {
            return;
         }

         do {
            Class_bb var4 = Class_pf.a((byte)53, var3);
            if (var4 != null) {
               int var5 = var4.j;
               if (var5 >= 0 && !Class_kd.i.a((byte)39, var5)) {
                  var5 = -1;
               }

               int var6;
               label82: {
                  if (var4.g < 0) {
                     if (~var5 <= -1) {
                        var6 = Class_kd.h[Class_ig.a((byte)-91, Class_kd.i.c(var5, 102), 96)];
                        if (var10 == 0) {
                           break label82;
                        }
                     }

                     if (var4.c == -1) {
                        var6 = -1;
                        if (var10 == 0) {
                           break label82;
                        }
                     }

                     int var7 = var4.c;
                     int var8 = var0 + (127 & var7);
                     if (~var8 > -1) {
                        var8 = 0;
                        if (var10 != 0 && var8 > 127) {
                           var8 = 127;
                        }
                     } else if (var8 > 127) {
                        var8 = 127;
                     }

                     int var9 = var8 + (var7 - -var1 & 64512) + (896 & var7);
                     var6 = Class_kd.h[Class_ig.a((byte)-91, var9, 96)];
                     if (var10 == 0) {
                        break label82;
                     }
                  }

                  int var12 = var4.g;
                  int var13 = (127 & var12) - -var0;
                  if (~var13 > -1) {
                     var13 = 0;
                     if (var10 != 0 && ~var13 < -128) {
                        var13 = 127;
                     }
                  } else if (~var13 < -128) {
                     var13 = 127;
                  }

                  int var14 = (896 & var12) + (64512 & var1 + var12) + var13;
                  var6 = Class_kd.h[Class_ig.a((byte)-91, var14, 96)];
               }

               Class_vb.e[1 + var3] = var6;
               var3++;
            } else {
               var3++;
            }
         } while (var3 < Class_tc.c);
      } catch (RuntimeException var11) {
         throw Class_sh.a(var11, "te.E(" + var0 + ',' + var1 + ',' + var2 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int[][] a(int var1, boolean var2) {
      int var17 = client.lb;

      try {
         W++;
         if (!var2) {
            cb = null;
         }

         int[][] var3 = super.K.a(var1, (byte)-115);
         if (super.K.q) {
            int[] var4 = this.b(1, var1, 29149);
            int[] var5 = this.b(2, var1, 29149);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int var9 = 0;
            if (var17 != 0 || ~Class_ld.X < ~var9) {
               do {
                  int var10 = (var4[var9] * 255 & 1044693) >> -1042073652;
                  int var11 = this.bb * var5[var9] >> 510089036;
                  int var12 = var11 * Class_nb.h[var10] >> 2120473804;
                  int var14 = Class_ed.d & var9 + (var12 >> 904924492);
                  int var13 = Class_ud.e[var10] * var11 >> 1212368844;
                  int var15 = Class_fa.rc & var1 + (var13 >> -1177106676);
                  int[][] var16 = this.c(-57, 0, var15);
                  var6[var9] = var16[0][var14];
                  var7[var9] = var16[1][var14];
                  var8[var9] = var16[2][var14];
               } while (~Class_ld.X < ~(++var9));
            }
         }

         return var3;
      } catch (RuntimeException var18) {
         throw Class_sh.a(var18, "te.A(" + var1 + ',' + var2 + ')');
      }
   }
}
