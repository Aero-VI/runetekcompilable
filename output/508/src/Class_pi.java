import java.util.Random;

final class Class_pi extends Class_lf {
   static int Q;
   private int R;
   static int S;
   static int T;
   static int U;
   private int V = 1024;
   static Class_qc W = new Class_qc(64);
   private int X = 2048;
   static int Y;
   private int Z;
   private int ab = 1024;
   private int bb;
   private int cb = 0;
   static int db;
   static Class_r eb = Class_tc.a(43, "floorshadows");
   static Class_r fb = Class_tc.a(43, "<img=0>");
   static int gb;
   static int hb;
   static byte[][] ib = new byte[50][];
   private int jb;
   private int kb;
   private int lb;
   static int mb;
   static int nb;
   static int ob = -1;
   static Class_lb pb;
   static float qb;
   static int rb = 0;
   static int sb = 0;
   static Class_r[] tb = new Class_r[100];

   static final int g(int var0) {
      try {
         if (var0 != 0) {
            return 29;
         } else {
            Y++;
            return 16;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "pi.J(" + var0 + 41);
      }
   }

   final void a(Class_lh var1, int var2, int var3) {
      int var5 = client.lb;

      try {
         label83: {
            label82: {
               label81: {
                  label80: {
                     label79: {
                        label78: {
                           label77: {
                              label76: {
                                 label75: {
                                    nb++;
                                    if (~var2 != -1) {
                                       if (var2 == 1) {
                                          break label75;
                                       }

                                       if (~var2 == -3) {
                                          break label76;
                                       }

                                       if (~var2 == -4) {
                                          break label77;
                                       }

                                       if (var2 == 4) {
                                          break label78;
                                       }

                                       if (var2 == 5) {
                                          break label79;
                                       }

                                       if (var2 == 6) {
                                          break label80;
                                       }

                                       if (var2 == 7) {
                                          break label81;
                                       }

                                       if (var2 != 8) {
                                          break label83;
                                       }

                                       if (var5 == 0) {
                                          break label82;
                                       }
                                    }

                                    this.jb = var1.n(-6677);
                                    if (var5 == 0) {
                                       break label83;
                                    }
                                 }

                                 this.R = var1.k(1355769544);
                                 if (var5 == 0) {
                                    break label83;
                                 }
                              }

                              this.X = var1.k(1355769544);
                              if (var5 == 0) {
                                 break label83;
                              }
                           }

                           this.lb = var1.k(var3 ^ -1355769545);
                           if (var5 == 0) {
                              break label83;
                           }
                        }

                        this.bb = var1.k(1355769544);
                        if (var5 == 0) {
                           break label83;
                        }
                     }

                     this.Z = var1.k(var3 ^ -1355769545);
                     if (var5 == 0) {
                        break label83;
                     }
                  }

                  this.cb = var1.n(-6677);
                  if (var5 == 0) {
                     break label83;
                  }
               }

               this.V = var1.k(1355769544);
               if (var5 == 0) {
                  break label83;
               }
            }

            this.ab = var1.k(1355769544);
         }

         if (var3 != -1) {
            a(-128, 32, 28, -22, -29, (byte)-27);
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "pi.K(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   public static void h(int var0) {
      try {
         eb = null;
         pb = null;
         W = null;
         ib = null;
         tb = null;
         if (var0 != 128) {
            ob = -101;
         }

         fb = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "pi.U(" + var0 + ')');
      }
   }

   static final void a(int var0, boolean var1, Class_ha var2) {
      try {
         db++;
         int var3 = var2.Cc == 0 ? var2.Gc : var2.Cc;
         int var4 = var2.M == 0 ? var2.nc : var2.M;
         Class_nf.a(var2.K, var4, var1, false, var3, Class_ve.ab[var2.K >> -1042903824]);
         if (var2.n != null) {
            Class_nf.a(var2.K, var4, var1, false, var3, var2.n);
         }

         Class_be var5 = (Class_be)Class_nj.p.a(var2.K, -78);
         if (var5 != null) {
            Class_bf.a((byte)99, var4, var1, var3, var5.t);
         }

         if (var0 != -1) {
            a(28, null, 33, -95);
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "pi.F(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, int var1, int var2, int var3, int var4, byte var5) {
      int var10 = client.lb;

      try {
         label111:
         if (var0 <= Class_hh.h && ~Class_ff.d >= ~var3) {
            boolean var7;
            label108: {
               if (~Class_ga.v >= ~var4) {
                  if (~Class_tg.r <= ~var4) {
                     var7 = true;
                     if (var10 == 0) {
                        break label108;
                     }
                  }

                  var4 = Class_tg.r;
                  var7 = false;
                  if (var10 == 0) {
                     break label108;
                  }
               }

               var7 = false;
               var4 = Class_ga.v;
            }

            boolean var6;
            label117: {
               if (var1 < Class_ga.v) {
                  var1 = Class_ga.v;
                  var6 = false;
                  if (var10 == 0) {
                     break label117;
                  }
               }

               if (~var1 >= ~Class_tg.r) {
                  var6 = true;
                  if (var10 == 0) {
                     break label117;
                  }
               }

               var1 = Class_tg.r;
               var6 = false;
            }

            label92: {
               if (~var0 > ~Class_ff.d) {
                  var0 = Class_ff.d;
                  if (var10 == 0) {
                     break label92;
                  }
               }

               Class_fd.a(var1, (byte)-17, var2, Class_qd.p[var0++], var4);
            }

            label87: {
               if (Class_hh.h < var3) {
                  var3 = Class_hh.h;
                  if (var10 == 0) {
                     break label87;
                  }
               }

               Class_fd.a(var1, (byte)-17, var2, Class_qd.p[var3--], var4);
            }

            if (var6 && var7) {
               int var8 = var0;
               if (var10 != 0 || ~var3 <= ~var0) {
                  do {
                     int[] var9 = Class_qd.p[var8];
                     var9[var1] = var9[var4] = var2;
                  } while (~var3 <= ~(++var8));
               }

               if (var10 == 0) {
                  break label111;
               }
            }

            if (!var6) {
               if (!var7) {
                  break label111;
               }

               int var12 = var0;
               if (var10 != 0 || var0 <= var3) {
                  do {
                     Class_qd.p[var12][var4] = var2;
                  } while (++var12 <= var3);
               }

               if (var10 == 0) {
                  break label111;
               }
            }

            int var13 = var0;
            if (var10 != 0 || var0 <= var3) {
               do {
                  Class_qd.p[var13][var1] = var2;
               } while (++var13 <= var3);
            }
         }

         mb++;
         if (var5 < 82) {
            a(28, -10, -23, 0);
         }
      } catch (RuntimeException var11) {
         throw Class_sh.a(var11, "pi.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
      }
   }

   static final boolean a(int var0, int var1, int var2, int var3) {
      if (!Class_cj.c(var0, var1, var2)) {
         return false;
      } else {
         int var4 = var1 << 7;
         int var5 = var2 << 7;
         int var6 = Class_mi.U[var0][var1][var2] - 1;
         int var7 = var6 - 120;
         int var8 = var6 - 230;
         int var9 = var6 - 238;
         if (var3 < 16) {
            if (var3 == 1) {
               if (var4 > Class_de.i) {
                  if (!Class_nj.a(var4, var6, var5)) {
                     return false;
                  }

                  if (!Class_nj.a(var4, var6, var5 + 128)) {
                     return false;
                  }
               }

               if (var0 > 0) {
                  if (!Class_nj.a(var4, var7, var5)) {
                     return false;
                  }

                  if (!Class_nj.a(var4, var7, var5 + 128)) {
                     return false;
                  }
               }

               if (!Class_nj.a(var4, var8, var5)) {
                  return false;
               }

               if (!Class_nj.a(var4, var8, var5 + 128)) {
                  return false;
               }

               return true;
            }

            if (var3 == 2) {
               if (var5 < Class_mi.W) {
                  if (!Class_nj.a(var4, var6, var5 + 128)) {
                     return false;
                  }

                  if (!Class_nj.a(var4 + 128, var6, var5 + 128)) {
                     return false;
                  }
               }

               if (var0 > 0) {
                  if (!Class_nj.a(var4, var7, var5 + 128)) {
                     return false;
                  }

                  if (!Class_nj.a(var4 + 128, var7, var5 + 128)) {
                     return false;
                  }
               }

               if (!Class_nj.a(var4, var8, var5 + 128)) {
                  return false;
               }

               if (!Class_nj.a(var4 + 128, var8, var5 + 128)) {
                  return false;
               }

               return true;
            }

            if (var3 == 4) {
               if (var4 < Class_de.i) {
                  if (!Class_nj.a(var4 + 128, var6, var5)) {
                     return false;
                  }

                  if (!Class_nj.a(var4 + 128, var6, var5 + 128)) {
                     return false;
                  }
               }

               if (var0 > 0) {
                  if (!Class_nj.a(var4 + 128, var7, var5)) {
                     return false;
                  }

                  if (!Class_nj.a(var4 + 128, var7, var5 + 128)) {
                     return false;
                  }
               }

               if (!Class_nj.a(var4 + 128, var8, var5)) {
                  return false;
               }

               if (!Class_nj.a(var4 + 128, var8, var5 + 128)) {
                  return false;
               }

               return true;
            }

            if (var3 == 8) {
               if (var5 > Class_mi.W) {
                  if (!Class_nj.a(var4, var6, var5)) {
                     return false;
                  }

                  if (!Class_nj.a(var4 + 128, var6, var5)) {
                     return false;
                  }
               }

               if (var0 > 0) {
                  if (!Class_nj.a(var4, var7, var5)) {
                     return false;
                  }

                  if (!Class_nj.a(var4 + 128, var7, var5)) {
                     return false;
                  }
               }

               if (!Class_nj.a(var4, var8, var5)) {
                  return false;
               }

               if (!Class_nj.a(var4 + 128, var8, var5)) {
                  return false;
               }

               return true;
            }
         }

         if (!Class_nj.a(var4 + 64, var9, var5 + 64)) {
            return false;
         } else if (var3 == 16) {
            return Class_nj.a(var4, var8, var5 + 128);
         } else if (var3 == 32) {
            return Class_nj.a(var4 + 128, var8, var5 + 128);
         } else if (var3 == 64) {
            return Class_nj.a(var4 + 128, var8, var5);
         } else {
            return var3 == 128 ? Class_nj.a(var4, var8, var5) : true;
         }
      }
   }

   private final void a(Random param1, int param2, int param3, int[][] param4, int param5, int param6, int param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic client.lb I
      // 003: istore 23
      // 005: getstatic Class_pi.gb I
      // 008: bipush 1
      // 009: iadd
      // 00a: putstatic Class_pi.gb I
      // 00d: aload 0
      // 00e: getfield Class_pi.ab I
      // 011: bipush -1
      // 012: ixor
      // 013: bipush -1
      // 014: if_icmpge 029
      // 017: sipush 4096
      // 01a: aload 0
      // 01b: getfield Class_pi.ab I
      // 01e: bipush 70
      // 020: aload 1
      // 021: invokestatic Class_jb.a (IBLjava/util/Random;)I
      // 024: ineg
      // 025: iadd
      // 026: goto 02c
      // 029: sipush 4096
      // 02c: istore 8
      // 02e: iload 7
      // 030: bipush 1
      // 031: if_icmpeq 039
      // 034: bipush -98
      // 036: putstatic Class_pi.ob I
      // 039: aload 0
      // 03a: getfield Class_pi.kb I
      // 03d: aload 0
      // 03e: getfield Class_pi.V I
      // 041: imul
      // 042: ldc_w 1394441932
      // 045: ishr
      // 046: istore 9
      // 048: aload 0
      // 049: getfield Class_pi.kb I
      // 04c: iload 9
      // 04e: ifgt 055
      // 051: bipush 0
      // 052: goto 05d
      // 055: iload 9
      // 057: bipush 70
      // 059: aload 1
      // 05a: invokestatic Class_jb.a (IBLjava/util/Random;)I
      // 05d: ineg
      // 05e: iadd
      // 05f: istore 10
      // 061: iload 5
      // 063: getstatic Class_ld.X I
      // 066: if_icmplt 071
      // 069: iload 5
      // 06b: getstatic Class_ld.X I
      // 06e: isub
      // 06f: istore 5
      // 071: iload 10
      // 073: bipush -1
      // 074: ixor
      // 075: bipush -1
      // 076: if_icmpge 36d
      // 079: iload 6
      // 07b: bipush -1
      // 07c: ixor
      // 07d: bipush -1
      // 07e: if_icmpge 088
      // 081: iload 3
      // 082: bipush -1
      // 083: ixor
      // 084: bipush -1
      // 085: if_icmplt 089
      // 088: return
      // 089: iload 3
      // 08a: bipush 2
      // 08b: idiv
      // 08c: istore 11
      // 08e: iload 6
      // 090: bipush 2
      // 091: idiv
      // 092: istore 12
      // 094: iload 10
      // 096: bipush -1
      // 097: ixor
      // 098: iload 11
      // 09a: bipush -1
      // 09b: ixor
      // 09c: if_icmplt 0a4
      // 09f: iload 10
      // 0a1: goto 0a6
      // 0a4: iload 11
      // 0a6: istore 13
      // 0a8: iload 12
      // 0aa: iload 10
      // 0ac: if_icmplt 0b4
      // 0af: iload 10
      // 0b1: goto 0b6
      // 0b4: iload 12
      // 0b6: istore 14
      // 0b8: iload 5
      // 0ba: iload 13
      // 0bc: ineg
      // 0bd: isub
      // 0be: istore 15
      // 0c0: iload 13
      // 0c2: bipush 2
      // 0c3: imul
      // 0c4: ineg
      // 0c5: iload 3
      // 0c6: iadd
      // 0c7: istore 16
      // 0c9: bipush 0
      // 0ca: istore 17
      // 0cc: iload 23
      // 0ce: ifeq 361
      // 0d1: aload 4
      // 0d3: iload 17
      // 0d5: iload 2
      // 0d6: ineg
      // 0d7: isub
      // 0d8: aaload
      // 0d9: astore 18
      // 0db: iload 17
      // 0dd: iload 14
      // 0df: if_icmpge 1d7
      // 0e2: iload 17
      // 0e4: iload 8
      // 0e6: imul
      // 0e7: iload 14
      // 0e9: idiv
      // 0ea: istore 19
      // 0ec: aload 0
      // 0ed: getfield Class_pi.cb I
      // 0f0: bipush -1
      // 0f1: ixor
      // 0f2: bipush -1
      // 0f3: if_icmpne 146
      // 0f6: bipush 0
      // 0f7: istore 20
      // 0f9: iload 23
      // 0fb: ifeq 136
      // 0fe: iload 8
      // 100: iload 20
      // 102: imul
      // 103: iload 13
      // 105: idiv
      // 106: istore 21
      // 108: aload 18
      // 10a: getstatic Class_ed.d I
      // 10d: iload 5
      // 10f: iload 20
      // 111: iadd
      // 112: invokestatic Class_ui.a (II)I
      // 115: aload 18
      // 117: bipush -1
      // 118: iload 5
      // 11a: iload 3
      // 11b: ineg
      // 11c: isub
      // 11d: iadd
      // 11e: iload 20
      // 120: isub
      // 121: getstatic Class_ed.d I
      // 124: invokestatic Class_ui.a (II)I
      // 127: iload 19
      // 129: iload 21
      // 12b: imul
      // 12c: ldc_w 721366060
      // 12f: ishr
      // 130: dup_x2
      // 131: iastore
      // 132: iastore
      // 133: iinc 20 1
      // 136: iload 13
      // 138: bipush -1
      // 139: ixor
      // 13a: iload 20
      // 13c: bipush -1
      // 13d: ixor
      // 13e: if_icmplt 0fe
      // 141: iload 23
      // 143: ifeq 191
      // 146: bipush 0
      // 147: istore 20
      // 149: iload 23
      // 14b: ifeq 18a
      // 14e: iload 20
      // 150: iload 8
      // 152: imul
      // 153: iload 13
      // 155: idiv
      // 156: istore 21
      // 158: aload 18
      // 15a: iload 20
      // 15c: iload 5
      // 15e: iadd
      // 15f: getstatic Class_ed.d I
      // 162: invokestatic Class_ui.a (II)I
      // 165: aload 18
      // 167: iload 3
      // 168: iload 5
      // 16a: iload 20
      // 16c: bipush -1
      // 16d: isub
      // 16e: isub
      // 16f: iadd
      // 170: getstatic Class_ed.d I
      // 173: invokestatic Class_ui.a (II)I
      // 176: iload 21
      // 178: iload 19
      // 17a: if_icmplt 182
      // 17d: iload 19
      // 17f: goto 184
      // 182: iload 21
      // 184: dup_x2
      // 185: iastore
      // 186: iastore
      // 187: iinc 20 1
      // 18a: iload 20
      // 18c: iload 13
      // 18e: if_icmplt 14e
      // 191: getstatic Class_ld.X I
      // 194: bipush -1
      // 195: ixor
      // 196: iload 15
      // 198: iload 16
      // 19a: ineg
      // 19b: isub
      // 19c: bipush -1
      // 19d: ixor
      // 19e: if_icmple 1c7
      // 1a1: getstatic Class_ld.X I
      // 1a4: iload 15
      // 1a6: isub
      // 1a7: istore 20
      // 1a9: aload 18
      // 1ab: iload 15
      // 1ad: iload 20
      // 1af: iload 19
      // 1b1: invokestatic Class_gb.a ([IIII)V
      // 1b4: aload 18
      // 1b6: bipush 0
      // 1b7: iload 16
      // 1b9: iload 20
      // 1bb: ineg
      // 1bc: iadd
      // 1bd: iload 19
      // 1bf: invokestatic Class_gb.a ([IIII)V
      // 1c2: iload 23
      // 1c4: ifeq 35e
      // 1c7: aload 18
      // 1c9: iload 15
      // 1cb: iload 16
      // 1cd: iload 19
      // 1cf: invokestatic Class_gb.a ([IIII)V
      // 1d2: iload 23
      // 1d4: ifeq 35e
      // 1d7: iload 17
      // 1d9: ineg
      // 1da: iload 6
      // 1dc: iadd
      // 1dd: bipush -1
      // 1de: iadd
      // 1df: istore 19
      // 1e1: iload 14
      // 1e3: iload 19
      // 1e5: if_icmple 2e1
      // 1e8: iload 19
      // 1ea: iload 8
      // 1ec: imul
      // 1ed: iload 14
      // 1ef: idiv
      // 1f0: istore 20
      // 1f2: aload 0
      // 1f3: getfield Class_pi.cb I
      // 1f6: ifeq 24e
      // 1f9: bipush 0
      // 1fa: istore 21
      // 1fc: iload 23
      // 1fe: ifeq 23e
      // 201: iload 8
      // 203: iload 21
      // 205: imul
      // 206: iload 13
      // 208: idiv
      // 209: istore 22
      // 20b: aload 18
      // 20d: getstatic Class_ed.d I
      // 210: iload 21
      // 212: iload 5
      // 214: iadd
      // 215: invokestatic Class_ui.a (II)I
      // 218: aload 18
      // 21a: getstatic Class_ed.d I
      // 21d: bipush -1
      // 21e: iload 21
      // 220: ineg
      // 221: iload 3
      // 222: iload 5
      // 224: iadd
      // 225: iadd
      // 226: iadd
      // 227: invokestatic Class_ui.a (II)I
      // 22a: iload 20
      // 22c: iload 22
      // 22e: if_icmpgt 236
      // 231: iload 20
      // 233: goto 238
      // 236: iload 22
      // 238: dup_x2
      // 239: iastore
      // 23a: iastore
      // 23b: iinc 21 1
      // 23e: iload 13
      // 240: bipush -1
      // 241: ixor
      // 242: iload 21
      // 244: bipush -1
      // 245: ixor
      // 246: if_icmplt 201
      // 249: iload 23
      // 24b: ifeq 29b
      // 24e: bipush 0
      // 24f: istore 21
      // 251: iload 23
      // 253: ifeq 290
      // 256: iload 21
      // 258: iload 8
      // 25a: imul
      // 25b: iload 13
      // 25d: idiv
      // 25e: istore 22
      // 260: aload 18
      // 262: getstatic Class_ed.d I
      // 265: iload 5
      // 267: iload 21
      // 269: ineg
      // 26a: isub
      // 26b: invokestatic Class_ui.a (II)I
      // 26e: aload 18
      // 270: iload 21
      // 272: ineg
      // 273: iload 5
      // 275: iadd
      // 276: iload 3
      // 277: ineg
      // 278: bipush 1
      // 279: iadd
      // 27a: isub
      // 27b: getstatic Class_ed.d I
      // 27e: invokestatic Class_ui.a (II)I
      // 281: iload 20
      // 283: iload 22
      // 285: imul
      // 286: ldc_w -2072381044
      // 289: ishr
      // 28a: dup_x2
      // 28b: iastore
      // 28c: iastore
      // 28d: iinc 21 1
      // 290: iload 13
      // 292: bipush -1
      // 293: ixor
      // 294: iload 21
      // 296: bipush -1
      // 297: ixor
      // 298: if_icmplt 256
      // 29b: getstatic Class_ld.X I
      // 29e: bipush -1
      // 29f: ixor
      // 2a0: iload 16
      // 2a2: iload 15
      // 2a4: iadd
      // 2a5: bipush -1
      // 2a6: ixor
      // 2a7: if_icmple 2d1
      // 2aa: iload 15
      // 2ac: ineg
      // 2ad: getstatic Class_ld.X I
      // 2b0: iadd
      // 2b1: istore 21
      // 2b3: aload 18
      // 2b5: iload 15
      // 2b7: iload 21
      // 2b9: iload 20
      // 2bb: invokestatic Class_gb.a ([IIII)V
      // 2be: aload 18
      // 2c0: bipush 0
      // 2c1: iload 16
      // 2c3: iload 21
      // 2c5: ineg
      // 2c6: iadd
      // 2c7: iload 20
      // 2c9: invokestatic Class_gb.a ([IIII)V
      // 2cc: iload 23
      // 2ce: ifeq 35e
      // 2d1: aload 18
      // 2d3: iload 15
      // 2d5: iload 16
      // 2d7: iload 20
      // 2d9: invokestatic Class_gb.a ([IIII)V
      // 2dc: iload 23
      // 2de: ifeq 35e
      // 2e1: bipush 0
      // 2e2: istore 20
      // 2e4: iload 23
      // 2e6: ifeq 316
      // 2e9: aload 18
      // 2eb: getstatic Class_ed.d I
      // 2ee: iload 5
      // 2f0: iload 20
      // 2f2: iadd
      // 2f3: invokestatic Class_ui.a (II)I
      // 2f6: aload 18
      // 2f8: getstatic Class_ed.d I
      // 2fb: bipush -1
      // 2fc: iload 20
      // 2fe: ineg
      // 2ff: iadd
      // 300: iload 5
      // 302: iadd
      // 303: iload 3
      // 304: iadd
      // 305: invokestatic Class_ui.a (II)I
      // 308: iload 20
      // 30a: iload 8
      // 30c: imul
      // 30d: iload 13
      // 30f: idiv
      // 310: dup_x2
      // 311: iastore
      // 312: iastore
      // 313: iinc 20 1
      // 316: iload 13
      // 318: iload 20
      // 31a: if_icmpgt 2e9
      // 31d: iload 15
      // 31f: iload 16
      // 321: ineg
      // 322: isub
      // 323: bipush -1
      // 324: ixor
      // 325: getstatic Class_ld.X I
      // 328: bipush -1
      // 329: ixor
      // 32a: if_icmplt 33d
      // 32d: aload 18
      // 32f: iload 15
      // 331: iload 16
      // 333: iload 8
      // 335: invokestatic Class_gb.a ([IIII)V
      // 338: iload 23
      // 33a: ifeq 35e
      // 33d: getstatic Class_ld.X I
      // 340: iload 15
      // 342: ineg
      // 343: iadd
      // 344: istore 21
      // 346: aload 18
      // 348: iload 15
      // 34a: iload 21
      // 34c: iload 8
      // 34e: invokestatic Class_gb.a ([IIII)V
      // 351: aload 18
      // 353: bipush 0
      // 354: iload 16
      // 356: iload 21
      // 358: isub
      // 359: iload 8
      // 35b: invokestatic Class_gb.a ([IIII)V
      // 35e: iinc 17 1
      // 361: iload 17
      // 363: bipush -1
      // 364: ixor
      // 365: iload 6
      // 367: bipush -1
      // 368: ixor
      // 369: if_icmpgt 0d1
      // 36c: return
      // 36d: iload 5
      // 36f: iload 3
      // 370: iadd
      // 371: bipush -1
      // 372: ixor
      // 373: getstatic Class_ld.X I
      // 376: bipush -1
      // 377: ixor
      // 378: if_icmplt 3a2
      // 37b: bipush 0
      // 37c: istore 11
      // 37e: iload 23
      // 380: ifeq 396
      // 383: aload 4
      // 385: iload 2
      // 386: iload 11
      // 388: ineg
      // 389: isub
      // 38a: aaload
      // 38b: iload 5
      // 38d: iload 3
      // 38e: iload 8
      // 390: invokestatic Class_gb.a ([IIII)V
      // 393: iinc 11 1
      // 396: iload 11
      // 398: bipush -1
      // 399: ixor
      // 39a: iload 6
      // 39c: bipush -1
      // 39d: ixor
      // 39e: if_icmpgt 383
      // 3a1: return
      // 3a2: iload 5
      // 3a4: ineg
      // 3a5: getstatic Class_ld.X I
      // 3a8: iadd
      // 3a9: istore 11
      // 3ab: bipush 0
      // 3ac: istore 12
      // 3ae: iload 23
      // 3b0: ifeq 3d7
      // 3b3: aload 4
      // 3b5: iload 12
      // 3b7: iload 2
      // 3b8: iadd
      // 3b9: aaload
      // 3ba: astore 13
      // 3bc: aload 13
      // 3be: iload 5
      // 3c0: iload 11
      // 3c2: iload 8
      // 3c4: invokestatic Class_gb.a ([IIII)V
      // 3c7: aload 13
      // 3c9: bipush 0
      // 3ca: iload 11
      // 3cc: ineg
      // 3cd: iload 3
      // 3ce: iadd
      // 3cf: iload 8
      // 3d1: invokestatic Class_gb.a ([IIII)V
      // 3d4: iinc 12 1
      // 3d7: iload 6
      // 3d9: iload 12
      // 3db: if_icmpgt 3b3
      // 3de: return
      // 3df: astore 8
      // 3e1: aload 8
      // 3e3: new java/lang/StringBuffer
      // 3e6: dup
      // 3e7: ldc_w "pi.D("
      // 3ea: invokespecial java/lang/StringBuffer.<init> (Ljava/lang/String;)V
      // 3ed: aload 1
      // 3ee: ifnull 3f6
      // 3f1: ldc "{...}"
      // 3f3: goto 3f8
      // 3f6: ldc "null"
      // 3f8: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 3fb: bipush 44
      // 3fd: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 400: iload 2
      // 401: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 404: bipush 44
      // 406: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 409: iload 3
      // 40a: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 40d: bipush 44
      // 40f: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 412: aload 4
      // 414: ifnull 41c
      // 417: ldc "{...}"
      // 419: goto 41e
      // 41c: ldc "null"
      // 41e: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 421: bipush 44
      // 423: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 426: iload 5
      // 428: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 42b: bipush 44
      // 42d: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 430: iload 6
      // 432: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 435: bipush 44
      // 437: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 43a: iload 7
      // 43c: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 43f: bipush 41
      // 441: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 444: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 447: invokestatic Class_sh.a (Ljava/lang/Throwable;Ljava/lang/String;)LClass_ua;
      // 44a: athrow
   }

   static final Class_r a(int var0, byte[] var1, int var2, int var3) {
      try {
         hb++;
         Class_r var4 = new Class_r();
         var4.h = new byte[var0];
         var4.G = 0;

         for (int var5 = var3; ~(var3 + var0) < ~var5; var5++) {
            if (~var1[var5] != -1) {
               var4.h[var4.G++] = var1[var5];
            }
         }

         if (var2 < 36) {
            sb = -90;
         }

         return var4;
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "pi.E(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   public Class_pi() {
      super(0, true);
      this.R = 1024;
      this.bb = 819;
      this.Z = 1024;
      this.jb = 0;
      this.lb = 409;
   }

   static final void b(int param0, boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic client.lb I
      // 003: istore 9
      // 005: getstatic Class_pi.T I
      // 008: bipush 1
      // 009: iadd
      // 00a: putstatic Class_pi.T I
      // 00d: getstatic Class_gg.B LClass_fa;
      // 010: getfield Class_ta.hb I
      // 013: ldc_w 671041927
      // 016: ishr
      // 017: bipush -1
      // 018: ixor
      // 019: getstatic Class_ph.f I
      // 01c: bipush -1
      // 01d: ixor
      // 01e: if_icmpne 039
      // 021: getstatic Class_fg.o I
      // 024: bipush -1
      // 025: ixor
      // 026: getstatic Class_gg.B LClass_fa;
      // 029: getfield Class_ta.J I
      // 02c: ldc_w 1022329287
      // 02f: ishr
      // 030: bipush -1
      // 031: ixor
      // 032: if_icmpne 039
      // 035: bipush 0
      // 036: putstatic Class_ph.f I
      // 039: getstatic client.ib I
      // 03c: istore 2
      // 03d: iload 1
      // 03e: ifeq 043
      // 041: bipush 1
      // 042: istore 2
      // 043: bipush 0
      // 044: istore 3
      // 045: iload 9
      // 047: ifeq 1f5
      // 04a: iload 1
      // 04b: ifne 06a
      // 04e: getstatic Class_db.Q [LClass_fa;
      // 051: getstatic Class_oc.q [I
      // 054: iload 3
      // 055: iaload
      // 056: aaload
      // 057: astore 4
      // 059: getstatic Class_oc.q [I
      // 05c: iload 3
      // 05d: iaload
      // 05e: i2l
      // 05f: ldc_w 2057557280
      // 062: lshl
      // 063: lstore 5
      // 065: iload 9
      // 067: ifeq 074
      // 06a: ldc2_w 8791798054912
      // 06d: lstore 5
      // 06f: getstatic Class_gg.B LClass_fa;
      // 072: astore 4
      // 074: aload 4
      // 076: ifnull 1f2
      // 079: aload 4
      // 07b: bipush 101
      // 07d: invokevirtual Class_fa.d (I)Z
      // 080: ifeq 1f2
      // 083: aload 4
      // 085: bipush 0
      // 086: putfield Class_fa.jc Z
      // 089: getstatic Class_r.b Z
      // 08c: ifeq 098
      // 08f: getstatic client.ib I
      // 092: sipush 200
      // 095: if_icmpgt 0a0
      // 098: getstatic client.ib I
      // 09b: bipush 50
      // 09d: if_icmple 0b7
      // 0a0: iload 1
      // 0a1: ifne 0b7
      // 0a4: aload 4
      // 0a6: getfield Class_ta.w I
      // 0a9: aload 4
      // 0ab: getfield Class_ta.C I
      // 0ae: if_icmpne 0b7
      // 0b1: aload 4
      // 0b3: bipush 1
      // 0b4: putfield Class_fa.jc Z
      // 0b7: aload 4
      // 0b9: getfield Class_ta.hb I
      // 0bc: ldc_w -2062929593
      // 0bf: ishr
      // 0c0: istore 7
      // 0c2: aload 4
      // 0c4: getfield Class_ta.J I
      // 0c7: ldc_w -424576857
      // 0ca: ishr
      // 0cb: istore 8
      // 0cd: iload 7
      // 0cf: bipush -1
      // 0d0: ixor
      // 0d1: bipush -1
      // 0d2: if_icmpgt 1f2
      // 0d5: iload 7
      // 0d7: bipush 104
      // 0d9: if_icmpge 1f2
      // 0dc: iload 8
      // 0de: bipush -1
      // 0df: ixor
      // 0e0: bipush -1
      // 0e1: if_icmpgt 1f2
      // 0e4: iload 8
      // 0e6: bipush -1
      // 0e7: ixor
      // 0e8: bipush -105
      // 0ea: if_icmple 1f2
      // 0ed: aload 4
      // 0ef: getfield Class_fa.Wb LClass_jh;
      // 0f2: ifnull 167
      // 0f5: aload 4
      // 0f7: getfield Class_fa.Xb I
      // 0fa: bipush -1
      // 0fb: ixor
      // 0fc: getstatic Class_be.C I
      // 0ff: bipush -1
      // 100: ixor
      // 101: if_icmplt 167
      // 104: aload 4
      // 106: getfield Class_fa.yc I
      // 109: bipush -1
      // 10a: ixor
      // 10b: getstatic Class_be.C I
      // 10e: bipush -1
      // 10f: ixor
      // 110: if_icmpge 167
      // 113: aload 4
      // 115: bipush 0
      // 116: putfield Class_fa.jc Z
      // 119: aload 4
      // 11b: aload 4
      // 11d: getfield Class_ta.hb I
      // 120: getstatic Class_jk.F I
      // 123: aload 4
      // 125: getfield Class_ta.J I
      // 128: bipush 0
      // 129: invokestatic Class_fa.a (IIIZ)I
      // 12c: putfield Class_ta.Cb I
      // 12f: getstatic Class_jk.F I
      // 132: aload 4
      // 134: getfield Class_ta.hb I
      // 137: aload 4
      // 139: getfield Class_ta.J I
      // 13c: aload 4
      // 13e: getfield Class_ta.Cb I
      // 141: aload 4
      // 143: aload 4
      // 145: getfield Class_ta.U I
      // 148: lload 5
      // 14a: aload 4
      // 14c: getfield Class_fa.sc I
      // 14f: aload 4
      // 151: getfield Class_fa.xc I
      // 154: aload 4
      // 156: getfield Class_fa.Tb I
      // 159: aload 4
      // 15b: getfield Class_fa.ec I
      // 15e: invokestatic Class_vd.a (IIIILClass_a;IJIIII)Z
      // 161: pop
      // 162: iload 9
      // 164: ifeq 1f2
      // 167: aload 4
      // 169: getfield Class_ta.Q I
      // 16c: bipush 1
      // 16d: if_icmpne 1ab
      // 170: bipush 127
      // 172: aload 4
      // 174: getfield Class_ta.hb I
      // 177: iand
      // 178: bipush 64
      // 17a: if_icmpne 1ab
      // 17d: aload 4
      // 17f: getfield Class_ta.J I
      // 182: bipush 127
      // 184: iand
      // 185: bipush -1
      // 186: ixor
      // 187: bipush -65
      // 189: if_icmpne 1ab
      // 18c: getstatic Class_mk.b [[I
      // 18f: iload 7
      // 191: aaload
      // 192: iload 8
      // 194: iaload
      // 195: bipush -1
      // 196: ixor
      // 197: getstatic Class_ad.l I
      // 19a: bipush -1
      // 19b: ixor
      // 19c: if_icmpeq 1f2
      // 19f: getstatic Class_mk.b [[I
      // 1a2: iload 7
      // 1a4: aaload
      // 1a5: iload 8
      // 1a7: getstatic Class_ad.l I
      // 1aa: iastore
      // 1ab: aload 4
      // 1ad: aload 4
      // 1af: getfield Class_ta.hb I
      // 1b2: getstatic Class_jk.F I
      // 1b5: aload 4
      // 1b7: getfield Class_ta.J I
      // 1ba: bipush 0
      // 1bb: invokestatic Class_fa.a (IIIZ)I
      // 1be: putfield Class_ta.Cb I
      // 1c1: getstatic Class_jk.F I
      // 1c4: aload 4
      // 1c6: getfield Class_ta.hb I
      // 1c9: aload 4
      // 1cb: getfield Class_ta.J I
      // 1ce: aload 4
      // 1d0: getfield Class_ta.Cb I
      // 1d3: aload 4
      // 1d5: getfield Class_ta.Q I
      // 1d8: bipush 1
      // 1d9: isub
      // 1da: bipush 64
      // 1dc: imul
      // 1dd: bipush -60
      // 1df: isub
      // 1e0: aload 4
      // 1e2: aload 4
      // 1e4: getfield Class_ta.U I
      // 1e7: lload 5
      // 1e9: aload 4
      // 1eb: getfield Class_ta.Db Z
      // 1ee: invokestatic Class_ci.a (IIIIILClass_a;IJZ)Z
      // 1f1: pop
      // 1f2: iinc 3 1
      // 1f5: iload 2
      // 1f6: iload 3
      // 1f7: if_icmpgt 04a
      // 1fa: iload 0
      // 1fb: bipush 64
      // 1fd: if_icmpeq 22b
      // 200: bipush -94
      // 202: putstatic Class_pi.sb I
      // 205: return
      // 206: astore 2
      // 207: aload 2
      // 208: new java/lang/StringBuffer
      // 20b: dup
      // 20c: ldc_w "pi.C("
      // 20f: invokespecial java/lang/StringBuffer.<init> (Ljava/lang/String;)V
      // 212: iload 0
      // 213: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 216: bipush 44
      // 218: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 21b: iload 1
      // 21c: invokevirtual java/lang/StringBuffer.append (Z)Ljava/lang/StringBuffer;
      // 21f: bipush 41
      // 221: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 224: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 227: invokestatic Class_sh.a (Ljava/lang/Throwable;Ljava/lang/String;)LClass_ua;
      // 22a: athrow
      // 22b: return
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int[] a(byte var1, int var2) {
      int var39 = client.lb;

      try {
         S++;
         int[] var3 = super.H.a(false, var2);
         if (super.H.s) {
            int var5 = 0;
            int[][] var4 = super.H.a(-32044);
            int var6 = 0;
            int var9 = 0;
            int var7 = 0;
            int var8 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = Class_ld.X * this.R >> -1038891860;
            int var15 = Class_ld.X * this.X >> -695056052;
            int var17 = Class_aa.K * this.bb >> 1716893868;
            int var16 = Class_aa.K * this.lb >> 764602188;
            if (var17 <= 1) {
               return var4[var2];
            }

            this.kb = Class_ld.X / 8 * this.Z >> -1227770260;
            int var18 = Class_ld.X / var14 + 1;
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            Random var21 = new Random(this.jb);

            label150:
            do {
               int var22;
               int var23;
               int var24;
               int var25;
               do {
                  label159: {
                     var23 = Class_jb.a(-var14 + var15, (byte)70, var21) + var14;
                     var25 = var23 + var8;
                     var24 = Class_jb.a(var17 + -var16, (byte)70, var21) + var16;
                     if (~var25 < ~Class_ld.X) {
                        var23 = -var8 + Class_ld.X;
                        var25 = Class_ld.X;
                     }

                     if (var11) {
                        var22 = 0;
                        if (var39 == 0) {
                           break label159;
                        }
                     }

                     int var26 = var9;
                     int[] var27 = var20[var9];
                     var22 = var27[2];
                     int var28 = 0;
                     int var29 = var5 + var25;
                     if (var29 < 0) {
                        var29 += Class_ld.X;
                     }

                     if (Class_ld.X < var29) {
                        var29 -= Class_ld.X;
                     }

                     while (true) {
                        int[] var30 = var20[var26];
                        if (~var29 <= ~var30[0] && ~var29 >= ~var30[1]) {
                           break;
                        }

                        var28++;
                        if (++var26 >= var12) {
                           var26 = 0;
                           if (var39 != 0) {
                              break;
                           }
                        }
                     }

                     if (~var9 != ~var26) {
                        int var47 = var8 - -var5;
                        if (~var47 > -1) {
                           var47 += Class_ld.X;
                        }

                        if (Class_ld.X < var47) {
                           var47 -= Class_ld.X;
                        }

                        int var31 = 1;
                        if (var39 != 0 || ~var31 >= ~var28) {
                           do {
                              int[] var32 = var20[(var31 + var9) % var12];
                              var22 = Math.max(var22, var32[2]);
                           } while (~(++var31) >= ~var28);
                        }

                        int var48 = 0;
                        if (var39 != 0 || ~var28 <= ~var48) {
                           do {
                              int[] var33 = var20[(var9 - -var48) % var12];
                              int var34 = var33[2];
                              if (var34 == var22) {
                                 var48++;
                              } else {
                                 int var35;
                                 int var36;
                                 label97: {
                                    int var37 = var33[0];
                                    int var38 = var33[1];
                                    if (~var47 > ~var29) {
                                       var35 = Math.max(var47, var37);
                                       var36 = Math.min(var29, var38);
                                       if (var39 == 0) {
                                          break label97;
                                       }
                                    }

                                    if (~var37 != -1) {
                                       var35 = Math.max(var47, var37);
                                       var36 = Class_ld.X;
                                       if (var39 != 0) {
                                          var35 = 0;
                                          var36 = Math.min(var29, var38);
                                       }
                                    } else {
                                       var35 = 0;
                                       var36 = Math.min(var29, var38);
                                    }
                                 }

                                 this.a(var21, var34, -var35 + var36, var4, var35 + var7, -var34 + var22, 1);
                                 var48++;
                              }
                           } while (~var28 <= ~var48);
                        }
                     }

                     var9 = var26;
                  }

                  label130: {
                     if (var24 + var22 <= Class_aa.K) {
                        var10 = false;
                        if (var39 == 0) {
                           break label130;
                        }
                     }

                     var24 = -var22 + Class_aa.K;
                  }

                  if (~Class_ld.X != ~var25) {
                     break;
                  }

                  this.a(var21, var22, var23, var4, var6 + var8, var24, 1);
                  if (var10) {
                     break label150;
                  }

                  var11 = false;
                  int[] var42 = var19[var13++];
                  var10 = true;
                  var42[2] = var24 + var22;
                  var42[0] = var8;
                  var7 = var6;
                  var42[1] = var25;
                  int[][] var44 = var20;
                  var9 = 0;
                  var12 = var13;
                  var13 = 0;
                  var20 = var19;
                  var8 = 0;
                  var6 = Class_jb.a(Class_ld.X, (byte)70, var21);
                  var19 = var44;
                  var5 = var6 - var7;
                  int var45 = var5;
                  if (~var5 > -1) {
                     var45 = var5 + Class_ld.X;
                  }

                  if (Class_ld.X < var45) {
                     var45 -= Class_ld.X;
                  }

                  while (true) {
                     int[] var46 = var20[var9];
                     if (var45 >= var46[0] && ~var45 >= ~var46[1]) {
                        break;
                     }

                     if (++var9 >= var12) {
                        var9 = 0;
                        if (var39 == 0) {
                           continue;
                        }
                        break;
                     }
                  }
               } while (var39 == 0);

               int[] var43 = var19[var13++];
               var43[1] = var25;
               var43[2] = var24 + var22;
               var43[0] = var8;
               this.a(var21, var22, var23, var4, var6 + var8, var24, 1);
               var8 = var25;
            } while (var39 == 0);
         }

         if (var1 != -61) {
            b(-113, true);
         }

         return var3;
      } catch (RuntimeException var40) {
         throw Class_sh.a(var40, "pi.G(" + var1 + ',' + var2 + ')');
      }
   }

   final void a(byte var1) {
      try {
         Q++;
         if (var1 >= -22) {
            a(-109, 82, 75, -110, -79, (byte)-79);
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "pi.I(" + var1 + ')');
      }
   }
}
