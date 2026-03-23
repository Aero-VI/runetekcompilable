final class Class_la extends Class_lf {
   static int Q;
   private static Class_r R = Class_tc.a(43, "wave:");
   static Class_r S = R;
   static int T;
   static int U;
   static Class_r V = R;
   static Class_r W = Class_tc.a(43, "(U4");
   static int X;
   static int Y;
   static int Z;
   static int ab;
   static int bb = 0;
   static boolean[][] cb;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(byte var0, int var1, int var2, int var3, int var4) {
      int var15 = client.lb;

      try {
         int var7 = -var3;
         T++;
         byte var8 = -1;
         int var6 = var3;
         int var9 = Class_tf.a(var2 - -var3, Class_tg.r, (byte)114, Class_ga.v);
         int var10 = Class_tf.a(-var3 + var2, Class_tg.r, (byte)114, Class_ga.v);
         if (var0 != 83) {
            S = null;
         }

         int var5 = 0;
         Class_fd.a(var10, (byte)-17, var1, Class_qd.p[var4], var9);
         if (var15 != 0 || ~var5 > ~var3) {
            do {
               var8 += 2;
               var7 += var8;
               if (~var7 < -1) {
                  int var12 = --var6 + var4;
                  var7 -= var6 << 1795291777;
                  int var11 = -var6 + var4;
                  if (var12 >= Class_ff.d && ~var11 >= ~Class_hh.h) {
                     int var13 = Class_tf.a(var5 + var2, Class_tg.r, (byte)114, Class_ga.v);
                     int var14 = Class_tf.a(-var5 + var2, Class_tg.r, (byte)114, Class_ga.v);
                     if (var12 <= Class_hh.h) {
                        Class_fd.a(var14, (byte)-17, var1, Class_qd.p[var12], var13);
                     }

                     if (~var11 <= ~Class_ff.d) {
                        Class_fd.a(var14, (byte)-17, var1, Class_qd.p[var11], var13);
                     }
                  }
               }

               var5++;
               int var17 = var4 - var5;
               int var18 = var4 + var5;
               if (Class_ff.d <= var18 && Class_hh.h >= var17) {
                  int var19 = Class_tf.a(var6 + var2, Class_tg.r, (byte)114, Class_ga.v);
                  int var20 = Class_tf.a(-var6 + var2, Class_tg.r, (byte)114, Class_ga.v);
                  if (Class_hh.h >= var18) {
                     Class_fd.a(var20, (byte)-17, var1, Class_qd.p[var18], var19);
                  }

                  if (Class_ff.d <= var17) {
                     Class_fd.a(var20, (byte)-17, var1, Class_qd.p[var17], var19);
                  }
               }
            } while (~var5 > ~var6);
         }
      } catch (RuntimeException var16) {
         throw Class_sh.a(var16, "la.F(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void d(byte var0) {
      int var7 = client.lb;

      try {
         int var1 = Class_db.sb.c(Class_ka.kb);
         int var2 = 0;
         if (var7 != 0) {
            int var3 = Class_db.sb.c(Class_jf.a((byte)-59, var2));
            if (~var3 < ~var1) {
               var1 = var3;
            }

            var2++;
         }

         for (; var2 < Class_ma.ib; var2++) {
            int var10 = Class_db.sb.c(Class_jf.a((byte)-59, var2));
            if (~var10 < ~var1) {
               var1 = var10;
            }
         }

         var1 += 8;
         int var4 = -(var1 / 2) + Class_v.B;
         if (Class_l.u < var1 + var4) {
            var4 = Class_l.u - var1;
         }

         int var11 = 21 + 15 * Class_ma.ib;
         if (var4 < 0) {
            var4 = 0;
         }

         int var5 = Class_pc.c;
         Q++;
         if (~Class_fk.R > ~(var11 + var5)) {
            var5 = -var11 + Class_fk.R;
         }

         if (~var5 > -1) {
            var5 = 0;
         }

         int var6 = -52 % ((var0 - 39) / 41);
         if (~Class_hd.j != -2) {
            if (Class_v.B == Class_vh.rb && ~Class_wb.i == ~Class_pc.c) {
               Class_hf.h = var4;
               Class_fb.n = 22 + 15 * Class_ma.ib;
               Class_ui.h = true;
               Class_ii.ab = var1;
               Class_ih.S = var5;
               Class_hd.j = 0;
            } else {
               Class_pg.r = Class_vh.rb;
               Class_hd.j = 1;
               Class_j.bb = Class_wb.i;
            }
         } else if (~Class_v.B == ~Class_pg.r && ~Class_pc.c == ~Class_j.bb) {
            Class_ih.S = var5;
            Class_hf.h = var4;
            Class_ui.h = true;
            Class_ii.ab = var1;
            Class_fb.n = 22 + Class_ma.ib * 15;
            Class_hd.j = 0;
         }
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "la.E(" + var0 + ')');
      }
   }

   public static void g(int var0) {
      try {
         if (var0 != 208) {
            d((byte)-16);
         }

         R = null;
         cb = null;
         W = null;
         V = null;
         S = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "la.B(" + var0 + ')');
      }
   }

   public Class_la() {
      super(1, true);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int[] a(byte var1, int var2) {
      int var9 = client.lb;

      try {
         if (var1 != -61) {
            g(-89);
         }

         X++;
         int[] var3 = super.H.a(false, var2);
         if (super.H.s) {
            int[][] var4 = this.c(-114, 0, var2);
            int[] var5 = var4[0];
            int[] var7 = var4[2];
            int[] var6 = var4[1];
            int var8 = 0;
            if (var9 != 0 || Class_ld.X > var8) {
               do {
                  var3[var8] = (var5[var8] - -var6[var8] + var7[var8]) / 3;
               } while (Class_ld.X > ++var8);
            }
         }

         return var3;
      } catch (RuntimeException var10) {
         throw Class_sh.a(var10, "la.G(" + var1 + ',' + var2 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void h(int var0) {
      int var31 = client.lb;

      try {
         ab++;
         if (~Class_hf.a == -249) {
            int var43 = Class_f.T.n(-6677);
            int var56 = (7 & var43 >> -1708747836) + Class_pd.i;
            int var70 = (var43 & 7) + Class_dd.cb;
            int var84 = Class_f.T.k(1355769544);
            int var97 = Class_f.T.n(-6677);
            int var108 = Class_f.T.k(1355769544);
            if (var56 >= 0 && ~var70 <= -1 && var56 < 104 && var70 < 104) {
               var56 = var56 * 128 - -64;
               var70 = var70 * 128 + 64;
               Class_qe var117 = new Class_qe(var84, Class_jk.F, var56, var70, -var97 + Class_fa.a(var56, Class_jk.F, var70, false), var108, Class_be.C);
               Class_sd.a.a(new Class_ec(var117), true);
            }
         } else if (~Class_hf.a == -30) {
            int var42 = Class_f.T.n(-6677);
            int var68 = 2 * Class_dd.cb + (var42 & 15);
            int var54 = ((246 & var42) >> -555358940) + Class_pd.i * 2;
            int var82 = var54 + Class_f.T.o(var0 + 3391);
            int var95 = var68 + Class_f.T.o(3390);
            int var107 = Class_f.T.p(-22489);
            int var116 = Class_f.T.k(1355769544);
            int var123 = 4 * Class_f.T.n(-6677);
            int var127 = Class_f.T.n(var0 + -6676) * 4;
            int var129 = Class_f.T.k(var0 ^ -1355769545);
            int var131 = Class_f.T.k(1355769544);
            int var133 = Class_f.T.n(var0 ^ 6676);
            int var135 = Class_f.T.n(var0 + -6676);
            if (var54 >= 0 && var68 >= 0 && ~var54 > -209 && ~var68 > -209 && ~var82 <= -1 && ~var95 <= -1 && ~var82 > -209 && var95 < 208 && ~var116 != -65536
               )
             {
               var54 *= 64;
               var68 = 64 * var68;
               var82 *= 64;
               Class_b var137 = new Class_b(
                  var116,
                  Class_jk.F,
                  var54,
                  var68,
                  -var123 + Class_fa.a(var54, Class_jk.F, var68, false),
                  Class_be.C + var129,
                  var131 - -Class_be.C,
                  var133,
                  var135,
                  var107,
                  var127
               );
               var95 *= 64;
               var137.a(var82, (byte)-105, var95, Class_fa.a(var82, Class_jk.F, var95, false) + -var127, Class_be.C + var129);
               Class_ha.Ac.a(new Class_ci(var137), true);
            }
         } else if (Class_hf.a == 30) {
            int var41 = Class_f.T.d(var0 ^ 71);
            int var53 = Class_f.T.d((byte)-112);
            int var81 = Class_dd.cb + (7 & var53);
            int var67 = Class_pd.i + (7 & var53 >> -1355904828);
            int var94 = Class_f.T.r(var0 ^ 27);
            int var106 = var94 >> 631527074;
            int var122 = Class_bg.e[var106];
            int var115 = 3 & var94;
            if (~var67 <= -1 && ~var81 <= -1 && ~var67 > -105 && ~var81 > -105) {
               Class_p.a(var67, ~var0, -1, var122, var81, var106, var115, Class_jk.F, 0, var41);
            }
         } else if (Class_hf.a == 110) {
            int var40 = Class_f.T.m(50);
            int var52 = var40 >> -1965788638;
            int var66 = var40 & 3;
            int var80 = Class_bg.e[var52];
            int var93 = Class_f.T.e((byte)-47);
            int var105 = Class_f.T.m(52);
            int var121 = Class_dd.cb - -(7 & var105);
            if (var93 == 65535) {
               var93 = -1;
            }

            int var114 = Class_pd.i + ((var105 & 117) >> -1786063068);
            Class_gk.a(var121, var52, Class_jk.F, var66, var114, (byte)117, var93, var80);
         } else if (~Class_hf.a == -233) {
            int var39 = Class_f.T.n(-6677);
            int var51 = Class_pd.i + ((125 & var39) >> -2136350684);
            int var65 = Class_dd.cb + (7 & var39);
            int var79 = Class_f.T.k(1355769544);
            if (~var79 == -65536) {
               var79 = -1;
            }

            int var92 = Class_f.T.n(-6677);
            int var120 = Class_f.T.n(var0 + -6676);
            int var104 = var92 >> -246061916 & 15;
            int var113 = var92 & 7;
            if (var51 >= 0 && ~var65 <= -1 && ~var51 > -105 && ~var65 > -105) {
               int var126 = var104 + 1;
               if (Class_gg.B.v[0] >= var51 - var126
                  && ~(var126 + var51) <= ~Class_gg.B.v[0]
                  && ~(var65 + -var126) >= ~Class_gg.B.qb[0]
                  && ~(var65 + var126) <= ~Class_gg.B.qb[0]
                  && ~Class_tf.V != -1
                  && var113 > 0
                  && ~Class_fc.v > -51
                  && ~var79 != 0) {
                  Class_nj.s[Class_fc.v] = var79;
                  Class_tb.p[Class_fc.v] = var113;
                  Class_fd.f[Class_fc.v] = var120;
                  Class_ad.h[Class_fc.v] = null;
                  Class_rf.l[Class_fc.v] = (var51 << -1907916944) - -(var65 << 560581576) - -var104;
                  Class_fc.v++;
               }
            }
         } else if (Class_hf.a == 201) {
            int var38 = Class_f.T.n(-6677);
            int var50 = ((var38 & 115) >> 177348356) + Class_pd.i;
            int var64 = (var38 & 7) + Class_dd.cb;
            int var78 = Class_f.T.k(1355769544);
            if (var50 >= 0 && var64 >= 0 && var50 < 104 && ~var64 > -105) {
               Class_c var91 = Class_ha.od[Class_jk.F][var50][var64];
               if (var91 != null) {
                  Class_wc var103 = (Class_wc)var91.e((byte)76);
                  if (var31 != 0 || var103 != null) {
                     do {
                        if (~(32767 & var78) == ~var103.J.r) {
                           var103.c(var0 + -17553);
                           if (var31 == 0) {
                              break;
                           }
                        }

                        var103 = (Class_wc)var91.c((byte)16);
                     } while (var103 != null);
                  }

                  if (var91.e((byte)76) == null) {
                     Class_ha.od[Class_jk.F][var50][var64] = null;
                  }

                  Class_ic.a(var50, (byte)-52, var64);
               }
            }
         } else {
            if (~Class_hf.a == -22) {
               int var2;
               int var3;
               int var4;
               byte var5;
               byte var6;
               int var8;
               int var9;
               int var11;
               int var12;
               byte var13;
               int var14;
               byte var15;
               Class_fa var16;
               label284: {
                  int var1 = Class_f.T.d((byte)-76);
                  var3 = var1 & 3;
                  var2 = var1 >> -1321675038;
                  var4 = Class_bg.e[var2];
                  var5 = Class_f.T.o(3390);
                  var6 = Class_f.T.a((byte)88);
                  int var7 = Class_f.T.g(var0 ^ 15045);
                  var8 = Class_f.T.e((byte)-47);
                  var9 = Class_f.T.k(1355769544);
                  int var10 = Class_f.T.n(-6677);
                  var11 = Class_pd.i - -(7 & var10 >> -1932319804);
                  var12 = Class_dd.cb - -(7 & var10);
                  var13 = Class_f.T.a((byte)59);
                  var14 = Class_f.T.d(-41);
                  var15 = Class_f.T.a(false);
                  if (Class_kg.A != var7) {
                     var16 = Class_db.Q[var7];
                     if (var31 == 0) {
                        break label284;
                     }
                  }

                  var16 = Class_gg.B;
               }

               if (var16 != null) {
                  Class_ub var17;
                  int var18;
                  int var19;
                  label317: {
                     var17 = Class_qe.a(84, var9);
                     if (~var3 == -2 || ~var3 == -4) {
                        var19 = var17.D;
                        var18 = var17.C;
                        if (var31 == 0) {
                           break label317;
                        }
                     }

                     var18 = var17.D;
                     var19 = var17.C;
                  }

                  int var22 = var12 - -(var19 >> -572452511);
                  int var23 = var12 + (1 + var19 >> 857882625);
                  int var20 = (var18 >> 1312690017) + var11;
                  int[][] var24 = Class_mi.U[Class_jk.F];
                  int var21 = (var18 - -1 >> -1222094271) + var11;
                  int[][] var25 = null;
                  if (Class_jk.F < 3) {
                     var25 = Class_mi.U[1 + Class_jk.F];
                  }

                  int var26 = var24[var20][var22] + var24[var21][var22] - -var24[var20][var23] + var24[var21][var23] >> -962628286;
                  int var27 = (var11 << 1985401543) + (var18 << -1970496986);
                  int var28 = (var12 << -914098265) - -(var19 << 74204806);
                  Class_h var29 = var17.a(var2, null, var17.ib, (byte)123, false, var26, var3, var24, var28, var25, var27);
                  if (var29 != null) {
                     if (var15 < var6) {
                        byte var30 = var6;
                        var6 = var15;
                        var15 = var30;
                     }

                     Class_p.a(var11, 0, 1 + var8, var4, var12, 0, 0, Class_jk.F, var14 - -1, -1);
                     var16.Wb = (Class_jh)var29.e;
                     var16.Sb = 64 * var19 + 128 * var12;
                     var16.sc = var6 + var11;
                     var16.yc = Class_be.C + var8;
                     var16.Xb = Class_be.C + var14;
                     var16.tc = var26;
                     var16.bc = 64 * var18 + 128 * var11;
                     var16.Tb = var15 + var11;
                     if (~var13 < ~var5) {
                        byte var138 = var13;
                        var13 = var5;
                        var5 = var138;
                     }

                     var16.xc = var12 - -var13;
                     var16.ec = var5 + var12;
                  }
               }
            }

            if (~Class_hf.a == -197) {
               int var37 = Class_f.T.r(var0 + 127);
               int var63 = (7 & var37) + Class_dd.cb;
               int var49 = ((var37 & 118) >> 742230052) + Class_pd.i;
               int var77 = Class_f.T.r(-68);
               int var102 = var77 & 3;
               int var90 = var77 >> -989803230;
               int var112 = Class_bg.e[var90];
               if (var49 >= 0 && ~var63 <= -1 && var49 < 104 && var63 < 104) {
                  Class_p.a(var49, ~var0, -1, var112, var63, var90, var102, Class_jk.F, 0, -1);
               }
            } else {
               if (var0 != -1) {
                  h(81);
               }

               if (~Class_hf.a == -113) {
                  int var36 = Class_f.T.n(-6677);
                  int var47 = Class_pd.i - -(var36 >> -449700668 & 7);
                  int var61 = Class_dd.cb + (var36 & 7);
                  int var75 = var47 + Class_f.T.o(3390);
                  int var88 = Class_f.T.o(3390) + var61;
                  int var101 = Class_f.T.p(-22489);
                  int var111 = Class_f.T.k(1355769544);
                  int var119 = 4 * Class_f.T.n(-6677);
                  int var125 = 4 * Class_f.T.n(-6677);
                  int var128 = Class_f.T.k(1355769544);
                  int var130 = Class_f.T.k(1355769544);
                  int var132 = Class_f.T.n(var0 + -6676);
                  int var134 = Class_f.T.n(-6677);
                  if (var47 >= 0 && ~var61 <= -1 && ~var47 > -105 && ~var61 > -105 && var75 >= 0 && var88 >= 0 && var75 < 104 && var88 < 104 && var111 != 65535
                     )
                   {
                     var47 = var47 * 128 - -64;
                     var61 = 64 + var61 * 128;
                     var88 = 128 * var88 - -64;
                     Class_b var136 = new Class_b(
                        var111,
                        Class_jk.F,
                        var47,
                        var61,
                        Class_fa.a(var47, Class_jk.F, var61, false) + -var119,
                        var128 + Class_be.C,
                        Class_be.C + var130,
                        var132,
                        var134,
                        var101,
                        var125
                     );
                     var75 = var75 * 128 - -64;
                     var136.a(var75, (byte)-45, var88, -var125 + Class_fa.a(var75, Class_jk.F, var88, false), var128 - -Class_be.C);
                     Class_ha.Ac.a(new Class_ci(var136), true);
                  }
               } else if (Class_hf.a == 75) {
                  int var35 = Class_f.T.g(var0 + -15045);
                  int var46 = Class_f.T.k(var0 ^ -1355769545);
                  int var60 = Class_f.T.k(1355769544);
                  int var74 = Class_f.T.r(127);
                  int var100 = (var74 & 7) + Class_dd.cb;
                  int var87 = Class_pd.i + (7 & var74 >> 1825986180);
                  if (var87 >= 0 && var100 >= 0 && ~var87 > -105 && ~var100 > -105 && ~Class_kg.A != ~var35) {
                     Class_fc var110 = new Class_fc();
                     var110.r = var46;
                     var110.w = var60;
                     if (Class_ha.od[Class_jk.F][var87][var100] == null) {
                        Class_ha.od[Class_jk.F][var87][var100] = new Class_c();
                     }

                     Class_ha.od[Class_jk.F][var87][var100].a(new Class_wc(var110), true);
                     Class_ic.a(var87, (byte)-52, var100);
                  }
               } else if (Class_hf.a == 25) {
                  int var34 = Class_f.T.e((byte)-47);
                  int var45 = Class_f.T.n(-6677);
                  int var59 = (7 & var45 >> 2071123620) + Class_pd.i;
                  int var73 = Class_dd.cb + (var45 & 7);
                  int var86 = Class_f.T.e((byte)-47);
                  if (~var59 <= -1 && ~var73 <= -1 && var59 < 104 && ~var73 > -105) {
                     Class_fc var99 = new Class_fc();
                     var99.r = var86;
                     var99.w = var34;
                     if (Class_ha.od[Class_jk.F][var59][var73] == null) {
                        Class_ha.od[Class_jk.F][var59][var73] = new Class_c();
                     }

                     Class_ha.od[Class_jk.F][var59][var73].a(new Class_wc(var99), true);
                     Class_ic.a(var59, (byte)-52, var73);
                  }
               } else if (~Class_hf.a == -51) {
                  int var33 = Class_f.T.n(-6677);
                  int var58 = Class_dd.cb + (var33 & 7);
                  int var44 = (var33 >> -1733180188 & 7) + Class_pd.i;
                  int var72 = Class_f.T.k(var0 ^ -1355769545);
                  int var85 = Class_f.T.k(1355769544);
                  int var98 = Class_f.T.k(1355769544);
                  if (~var44 <= -1 && ~var58 <= -1 && ~var44 > -105 && var58 < 104) {
                     Class_c var109 = Class_ha.od[Class_jk.F][var44][var58];
                     if (var109 != null) {
                        Class_wc var118 = (Class_wc)var109.e((byte)76);
                        if (var31 != 0 || var118 != null) {
                           do {
                              Class_fc var124 = var118.J;
                              if (~var124.r == ~(32767 & var72) && var124.w == var85) {
                                 var124.w = var98;
                                 if (var31 == 0) {
                                    break;
                                 }
                              }

                              var118 = (Class_wc)var109.c((byte)34);
                           } while (var118 != null);
                        }

                        Class_ic.a(var44, (byte)-52, var58);
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var32) {
         throw Class_sh.a(var32, "la.D(" + var0 + ')');
      }
   }

   static final int i(int var0) {
      try {
         U++;
         if (var0 != 7) {
            Y = -13;
         }

         return Class_fb.p;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "la.H(" + var0 + 41);
      }
   }

   static final Class_dh a(Class_cj var0, byte var1, int var2, int var3) {
      try {
         Z++;
         if (var1 != 66) {
            return null;
         } else {
            return !Class_ve.a(-29381, var2, var0, var3) ? null : Class_ga.b(var1 ^ 9724);
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "la.C(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }
}
