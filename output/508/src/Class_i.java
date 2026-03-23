final class Class_i extends Class_lf {
   private int Q;
   static int R;
   private int S;
   static int T;
   static int U = 1;
   static long V = 0L;
   static int W;
   static Class_jb[] X;
   private int Y;
   static int Z;
   private int ab = 2048;
   private int bb;
   static int cb;
   static Class_r db = Class_i.gb;
   static int eb;
   private int fb = 8192;
   private static Class_r gb = Class_tc.a(43, "K");
   static int hb;
   static short ib = 256;
   static int jb;
   static int kb = 0;
   static volatile long lb = 0L;
   static int mb;
   static int nb = 0;
   static byte[][][] ob;
   static int pb;
   static int qb;
   private int rb;
   static short[][][] sb;
   static Class_r tb = gb;

   private final boolean a(int var1, byte var2, int var3) {
      try {
         Z++;
         int var4 = 81 % ((50 - var2) / 41);
         int var5 = (-var1 + var3) * this.Y >> 918544460;
         int var6 = Class_nb.h[0xFF & 255 * var5 >> 500460556];
         var6 = (var6 << -1081103284) / this.Y;
         var6 = (var6 << -1260607892) / this.fb;
         var6 = var6 * this.Q >> 1208641004;
         return var1 - -var3 < var6 && ~(-var6) > ~(var1 + var3);
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "i.V(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Irreducible bytecode has more than 5 nodes in sequence and was not entirely decomposed
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static final void a(int var0, Class_lh var1) {
      int var15 = client.lb;

      try {
         if (var0 > 65) {
            while (~var1.E.length < ~var1.p) {
               boolean var3 = false;
               int var4 = 0;
               int var5 = 0;
               if (~var1.n(-6677) == -2) {
                  var3 = true;
                  var4 = var1.n(-6677);
                  var5 = var1.n(-6677);
               }

               int var6 = var1.n(-6677);
               int var7 = var1.n(-6677);
               int var8 = -Class_mb.k + var6 * 64;
               int var9 = Class_aa.v + -(64 * var7) + -1 + Class_sb.j;
               if (~var8 > -1 || ~(var9 + -63) > -1 || Class_fi.z <= 63 + var8 || Class_sb.j <= var9) {
                  int var10 = 0;
                  if (var15 != 0 || ~var10 > ~(var3 ? 64 : 4096)) {
                     do {
                        byte var2 = var1.o(3390);
                        if (var2 != 0) {
                           var1.p++;
                        }
                     } while (~(++var10) > ~(var3 ? 64 : 4096));
                  }

                  if (var15 == 0) {
                     continue;
                  }
               }

               int var18 = var8 >> 2087423014;
               int var11 = var9 >> -1700832474;
               int var12 = 0;
               if (var15 != 0 || ~var12 > -65) {
                  while (true) {
                     int var13 = 0;
                     if (var15 != 0 || ~var13 > -65) {
                        do {
                           if (var3) {
                              if (~var12 > ~(8 * var4)) {
                                 var13++;
                                 continue;
                              }

                              if (8 + var4 * 8 <= var12) {
                                 var13++;
                                 continue;
                              }

                              if (~(8 * var5) < ~var13) {
                                 var13++;
                                 continue;
                              }

                              if (var13 >= 8 * var5 + 8 && var15 == 0) {
                                 var13++;
                                 continue;
                              }
                           }

                           byte var17 = var1.o(3390);
                           if (~var17 != -1) {
                              if (Class_bg.p[var18][var11] == null) {
                                 Class_bg.p[var18][var11] = new byte[4096];
                              }

                              Class_bg.p[var18][var11][(63 + -var13 << -348620474) - -var12] = var17;
                              byte var14 = var1.o(3390);
                              if (Class_j.gb[var18][var11] == null) {
                                 Class_j.gb[var18][var11] = new byte[4096];
                              }

                              Class_j.gb[var18][var11][(63 + -var13 << 1570227686) - -var12] = var14;
                           }

                           var13++;
                        } while (~var13 > -65);
                     }

                     if (~(++var12) <= -65) {
                        break;
                     }
                  }
               }
            }

            cb++;
         }
      } catch (RuntimeException var16) {
         throw Class_sh.a(var16, "i.F(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   static final void a(Class_r var0, byte var1) {
      try {
         qb++;
         Class_df.c = var0;
         if (Class_rj.J.g != null) {
            try {
               Class_r var4;
               label31: {
                  Class_r var2 = Class_ee.W.b(Class_rj.J.g, (byte)-31);
                  Class_r var3 = Class_j.Q.b(Class_rj.J.g, (byte)-31);
                  var4 = Class_o.a(2, new Class_r[]{var2, Class_hk.K, var0, Class_rh.k, var3});
                  if (var0.d((byte)-118) != 0) {
                     var4 = Class_o.a(
                        2, new Class_r[]{var4, Class_rh.i, Class_hh.a(-118, 94608000000L + Class_fj.a(17161)), Class_vj.u, Class_wf.a(94608000L, -96)}
                     );
                     if (client.lb == 0) {
                        break label31;
                     }
                  }

                  var4 = Class_o.a(2, new Class_r[]{var4, Class_ra.G});
               }

               if (var1 > 118) {
                  Class_o.a(2, new Class_r[]{Class_hf.b, var4, Class_pe.B}).a((byte)-45, Class_rj.J.g);
               }
            } catch (Throwable var5) {
            }
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "i.J(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
      }
   }

   static final void b(int var0, int var1) {
      Class_aa var2 = Class_ck.d[0][var0][var1];

      for (int var3 = 0; var3 < 3; var3++) {
         Class_aa var4 = Class_ck.d[var3][var0][var1] = Class_ck.d[var3 + 1][var0][var1];
         if (var4 != null) {
            var4.C--;

            for (int var5 = 0; var5 < var4.G; var5++) {
               Class_lj var6 = var4.H[var5];
               if ((var6.k >> 29 & 3L) == 2L && var6.v == var0 && var6.u == var1) {
                  var6.q--;
               }
            }
         }
      }

      if (Class_ck.d[0][var0][var1] == null) {
         Class_ck.d[0][var0][var1] = new Class_aa(0, var0, var1);
      }

      Class_ck.d[0][var0][var1].P = var2;
      Class_ck.d[3][var0][var1] = null;
   }

   final void a(Class_lh var1, int var2, int var3) {
      try {
         jb++;
         if (var3 != -1) {
            this.Y = -119;
         }

         if (var2 != 0) {
            if (var2 == 1) {
               this.S = var1.k(1355769544);
               return;
            }

            if (~var2 == -3) {
               this.rb = var1.k(1355769544);
               return;
            }

            if (~var2 == -4) {
               this.bb = var1.k(1355769544);
               return;
            }

            if (~var2 == -5) {
               this.Y = var1.k(1355769544);
               return;
            }

            if (var2 == 5) {
               this.Q = var1.k(var3 + 1355769545);
               return;
            }

            if (var2 != 6) {
               return;
            }

            if (client.lb == 0) {
               this.fb = var1.k(var3 + 1355769545);
               return;
            }
         }

         this.ab = var1.k(1355769544);
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "i.K(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   public Class_i() {
      super(0, true);
      this.bb = 2048;
      this.Y = 12288;
      this.S = 0;
      this.Q = 4096;
      this.rb = 0;
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
      // 003: istore 10
      // 005: iload 0
      // 006: bipush 14
      // 008: if_icmpgt 013
      // 00b: bipush -56
      // 00d: bipush 26
      // 00f: invokestatic Class_i.c (II)LClass_nd;
      // 012: pop
      // 013: getstatic Class_f.T LClass_cc;
      // 016: bipush 0
      // 017: bipush 8
      // 019: invokevirtual Class_cc.e (BI)I
      // 01c: istore 1
      // 01d: getstatic client.ib I
      // 020: iload 1
      // 021: if_icmple 047
      // 024: iload 1
      // 025: istore 2
      // 026: iload 10
      // 028: ifeq 040
      // 02b: getstatic Class_ih.R [I
      // 02e: getstatic Class_ja.w I
      // 031: dup
      // 032: bipush 1
      // 033: iadd
      // 034: putstatic Class_ja.w I
      // 037: getstatic Class_oc.q [I
      // 03a: iload 2
      // 03b: iaload
      // 03c: iastore
      // 03d: iinc 2 1
      // 040: iload 2
      // 041: getstatic client.ib I
      // 044: if_icmplt 02b
      // 047: getstatic Class_i.pb I
      // 04a: bipush 1
      // 04b: iadd
      // 04c: putstatic Class_i.pb I
      // 04f: iload 1
      // 050: getstatic client.ib I
      // 053: if_icmple 061
      // 056: new java/lang/RuntimeException
      // 059: dup
      // 05a: ldc_w "gppov1"
      // 05d: invokespecial java/lang/RuntimeException.<init> (Ljava/lang/String;)V
      // 060: athrow
      // 061: bipush 0
      // 062: putstatic client.ib I
      // 065: bipush 0
      // 066: istore 2
      // 067: iload 10
      // 069: ifeq 1b5
      // 06c: getstatic Class_oc.q [I
      // 06f: iload 2
      // 070: iaload
      // 071: istore 3
      // 072: getstatic Class_db.Q [LClass_fa;
      // 075: iload 3
      // 076: aaload
      // 077: astore 4
      // 079: getstatic Class_f.T LClass_cc;
      // 07c: bipush 0
      // 07d: bipush 1
      // 07e: invokevirtual Class_cc.e (BI)I
      // 081: istore 5
      // 083: iload 5
      // 085: ifne 0a3
      // 088: getstatic Class_oc.q [I
      // 08b: getstatic client.ib I
      // 08e: dup
      // 08f: bipush 1
      // 090: iadd
      // 091: putstatic client.ib I
      // 094: iload 3
      // 095: iastore
      // 096: aload 4
      // 098: getstatic Class_be.C I
      // 09b: putfield Class_ta.vb I
      // 09e: iload 10
      // 0a0: ifeq 1b2
      // 0a3: getstatic Class_f.T LClass_cc;
      // 0a6: bipush 0
      // 0a7: bipush 2
      // 0a8: invokevirtual Class_cc.e (BI)I
      // 0ab: istore 6
      // 0ad: iload 6
      // 0af: ifne 0db
      // 0b2: getstatic Class_oc.q [I
      // 0b5: getstatic client.ib I
      // 0b8: dup
      // 0b9: bipush 1
      // 0ba: iadd
      // 0bb: putstatic client.ib I
      // 0be: iload 3
      // 0bf: iastore
      // 0c0: aload 4
      // 0c2: getstatic Class_be.C I
      // 0c5: putfield Class_ta.vb I
      // 0c8: getstatic Class_cc.Db [I
      // 0cb: getstatic Class_uf.U I
      // 0ce: dup
      // 0cf: bipush 1
      // 0d0: iadd
      // 0d1: putstatic Class_uf.U I
      // 0d4: iload 3
      // 0d5: iastore
      // 0d6: iload 10
      // 0d8: ifeq 1b2
      // 0db: iload 6
      // 0dd: bipush 1
      // 0de: if_icmpne 12e
      // 0e1: getstatic Class_oc.q [I
      // 0e4: getstatic client.ib I
      // 0e7: dup
      // 0e8: bipush 1
      // 0e9: iadd
      // 0ea: putstatic client.ib I
      // 0ed: iload 3
      // 0ee: iastore
      // 0ef: aload 4
      // 0f1: getstatic Class_be.C I
      // 0f4: putfield Class_ta.vb I
      // 0f7: getstatic Class_f.T LClass_cc;
      // 0fa: bipush 0
      // 0fb: bipush 3
      // 0fc: invokevirtual Class_cc.e (BI)I
      // 0ff: istore 7
      // 101: aload 4
      // 103: bipush 0
      // 104: iload 7
      // 106: bipush 21
      // 108: invokevirtual Class_ta.a (ZIB)V
      // 10b: getstatic Class_f.T LClass_cc;
      // 10e: bipush 0
      // 10f: bipush 1
      // 110: invokevirtual Class_cc.e (BI)I
      // 113: istore 8
      // 115: iload 8
      // 117: bipush 1
      // 118: if_icmpne 1b2
      // 11b: getstatic Class_cc.Db [I
      // 11e: getstatic Class_uf.U I
      // 121: dup
      // 122: bipush 1
      // 123: iadd
      // 124: putstatic Class_uf.U I
      // 127: iload 3
      // 128: iastore
      // 129: iload 10
      // 12b: ifeq 1b2
      // 12e: iload 6
      // 130: bipush 2
      // 131: if_icmpne 198
      // 134: getstatic Class_oc.q [I
      // 137: getstatic client.ib I
      // 13a: dup
      // 13b: bipush 1
      // 13c: iadd
      // 13d: putstatic client.ib I
      // 140: iload 3
      // 141: iastore
      // 142: aload 4
      // 144: getstatic Class_be.C I
      // 147: putfield Class_ta.vb I
      // 14a: getstatic Class_f.T LClass_cc;
      // 14d: bipush 0
      // 14e: bipush 3
      // 14f: invokevirtual Class_cc.e (BI)I
      // 152: istore 7
      // 154: aload 4
      // 156: bipush 1
      // 157: iload 7
      // 159: bipush 21
      // 15b: invokevirtual Class_ta.a (ZIB)V
      // 15e: getstatic Class_f.T LClass_cc;
      // 161: bipush 0
      // 162: bipush 3
      // 163: invokevirtual Class_cc.e (BI)I
      // 166: istore 8
      // 168: aload 4
      // 16a: bipush 1
      // 16b: iload 8
      // 16d: bipush 21
      // 16f: invokevirtual Class_ta.a (ZIB)V
      // 172: getstatic Class_f.T LClass_cc;
      // 175: bipush 0
      // 176: bipush 1
      // 177: invokevirtual Class_cc.e (BI)I
      // 17a: istore 9
      // 17c: iload 9
      // 17e: bipush -1
      // 17f: ixor
      // 180: bipush -2
      // 182: if_icmpne 1b2
      // 185: getstatic Class_cc.Db [I
      // 188: getstatic Class_uf.U I
      // 18b: dup
      // 18c: bipush 1
      // 18d: iadd
      // 18e: putstatic Class_uf.U I
      // 191: iload 3
      // 192: iastore
      // 193: iload 10
      // 195: ifeq 1b2
      // 198: iload 6
      // 19a: bipush -1
      // 19b: ixor
      // 19c: bipush -4
      // 19e: if_icmpne 1b2
      // 1a1: getstatic Class_ih.R [I
      // 1a4: getstatic Class_ja.w I
      // 1a7: dup
      // 1a8: bipush 1
      // 1a9: iadd
      // 1aa: putstatic Class_ja.w I
      // 1ad: iload 3
      // 1ae: iastore
      // 1af: goto 1b2
      // 1b2: iinc 2 1
      // 1b5: iload 1
      // 1b6: bipush -1
      // 1b7: ixor
      // 1b8: iload 2
      // 1b9: bipush -1
      // 1ba: ixor
      // 1bb: if_icmplt 06c
      // 1be: return
      // 1bf: astore 1
      // 1c0: aload 1
      // 1c1: new java/lang/StringBuffer
      // 1c4: dup
      // 1c5: ldc_w "i.H("
      // 1c8: invokespecial java/lang/StringBuffer.<init> (Ljava/lang/String;)V
      // 1cb: iload 0
      // 1cc: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 1cf: bipush 41
      // 1d1: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 1d4: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 1d7: invokestatic Class_sh.a (Ljava/lang/Throwable;Ljava/lang/String;)LClass_ua;
      // 1da: athrow
   }

   final void a(byte var1) {
      try {
         Class_kg.a((byte)-128);
         if (var1 <= -22) {
            hb++;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "i.I(" + var1 + ')');
      }
   }

   private final boolean b(int var1, byte var2, int var3) {
      try {
         eb++;
         int var4 = (var3 + var1) * this.Y >> -1226454516;
         if (var2 <= 13) {
            this.rb = 10;
         }

         int var5 = Class_nb.h[(255 * var4 & 1048488) >> 2102241036];
         var5 = (var5 << 262318060) / this.Y;
         var5 = (var5 << -229147252) / this.fb;
         var5 = this.Q * var5 >> 64103340;
         return var5 > -var1 + var3 && var3 + -var1 > -var5;
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "i.E(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   public static void e(byte var0) {
      try {
         gb = null;
         ob = null;
         sb = null;
         X = null;
         tb = null;
         db = null;
         if (var0 != -66) {
            mb = -85;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "i.U(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int[] a(byte var1, int var2) {
      int var11 = client.lb;

      try {
         R++;
         if (var1 != -61) {
            db = null;
         }

         int[] var3 = super.H.a(false, var2);
         if (super.H.s) {
            int var4 = -2048 + Class_l.y[var2];
            int var5 = 0;
            if (var11 != 0 || ~Class_ld.X < ~var5) {
               do {
                  int var6 = -2048 + Class_ce.gb[var5];
                  int var8 = this.S + var4;
                  var8 = ~var8 <= 2047 ? var8 : 4096 + var8;
                  var8 = var8 > 2048 ? -4096 + var8 : var8;
                  int var7 = this.ab + var6;
                  var7 = var7 >= -2048 ? var7 : var7 + 4096;
                  var7 = var7 > 2048 ? var7 - 4096 : var7;
                  int var9 = this.rb + var6;
                  int var10 = this.bb + var4;
                  var9 = var9 >= -2048 ? var9 : 4096 + var9;
                  var9 = ~var9 < -2049 ? -4096 + var9 : var9;
                  var10 = ~var10 <= 2047 ? var10 : var10 - -4096;
                  var10 = var10 > 2048 ? -4096 + var10 : var10;
                  var3[var5] = !this.a(var7, (byte)118, var8) ? (!this.b(var9, (byte)35, var10) ? 0 : 4096) : 4096;
               } while (~Class_ld.X < ~(++var5));
            }
         }

         return var3;
      } catch (RuntimeException var12) {
         throw Class_sh.a(var12, "i.G(" + var1 + ',' + var2 + ')');
      }
   }

   static final Class_he b(byte var0, int var1) {
      try {
         W++;
         Class_he var2 = (Class_he)Class_f.U.a(var0 + 14285, (long)var1);
         if (var2 != null) {
            return var2;
         } else {
            byte[] var3 = Class_lc.d.a(Class_ua.a(var1, 72), var0 ^ 81, Class_gj.e(var1, 654593194));
            var2 = new Class_he();
            if (var3 != null) {
               var2.a(126, new Class_lh(var3));
            }

            if (var0 != 81) {
               return null;
            } else {
               Class_f.U.a(var2, 123, var1);
               return var2;
            }
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "i.B(" + var0 + ',' + var1 + ')');
      }
   }

   static final Class_nd c(int var0, int var1) {
      try {
         T++;
         Class_nd var2 = (Class_nd)Class_pd.c.a(14366, (long)var0);
         if (var2 != null) {
            return var2;
         } else {
            byte[] var3 = Class_b.eb.a(Class_pa.d(var0, 522), 0, Class_ta.b(var0, -95));
            var2 = new Class_nd();
            var2.ab = var0;
            if (var3 != null) {
               var2.a(new Class_lh(var3), (byte)-53);
            }

            int var4 = 100 / ((-43 - var1) / 50);
            var2.f(24381);
            Class_pd.c.a(var2, 104, var0);
            return var2;
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "i.D(" + var0 + ',' + var1 + ')');
      }
   }
}
