final class Class_ea extends Class_lf {
   static int Q;
   static Class_r[] R = new Class_r[]{
      Class_ea.fb, Class_ea.W, Class_ea.db, Class_ea.gb, Class_ea.bb, Class_ea.kb, Class_ea.ib, Class_ea.X, Class_ea.T, Class_ea.ab, Class_ea.eb, Class_ea.V
   };
   static int S;
   private static Class_r T = Class_tc.a(43, "Sep");
   static int U;
   private static Class_r V = Class_tc.a(43, "Dec");
   private static Class_r W = Class_tc.a(43, "Feb");
   private static Class_r X = Class_tc.a(43, "Aug");
   static int Y;
   static int Z = 0;
   private static Class_r ab = Class_tc.a(43, "Oct");
   private static Class_r bb = Class_tc.a(43, "May");
   static int cb;
   private static Class_r db = Class_tc.a(43, "Mar");
   private static Class_r eb = Class_tc.a(43, "Nov");
   private static Class_r fb = Class_tc.a(43, "Jan");
   private static Class_r gb = Class_tc.a(43, "Apr");
   static int hb;
   private static Class_r ib = Class_tc.a(43, "Jul");
   private boolean jb;
   private static Class_r kb = Class_tc.a(43, "Jun");
   private int lb = 4096;

   static final Class_r b(int var0, int var1) {
      try {
         cb++;
         if (var1 != -1) {
            d(43, -92, 110);
         }

         return var0 < 999999999 ? Class_og.b(var0, 0) : Class_dj.A;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ea.F(" + var0 + ',' + var1 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final Class_jb[] g(int var0) {
      int var7 = client.lb;

      try {
         Y++;
         Class_jb[] var1 = new Class_jb[Class_lh.zb];
         int var2 = 0;
         if (var0 != -21477) {
            ib = null;
            if (var7 == 0 && Class_lh.zb <= var2) {
               Class_oe.a((byte)-93);
               return var1;
            }
         } else if (Class_lh.zb <= var2) {
            Class_oe.a((byte)-93);
            return var1;
         }

         do {
            int var3 = Class_ld.ib[var2] * Class_ia.bb[var2];
            byte[] var4 = Class_lj.h[var2];
            int[] var5 = new int[var3];
            int var6 = 0;
            if (var7 != 0) {
               var5[var6] = Class_ji.Y[Class_ui.a(var4[var6], 255)];
               var6++;
            }

            while (~var6 > ~var3) {
               var5[var6] = Class_ji.Y[Class_ui.a(var4[var6], 255)];
               var6++;
            }

            var1[var2] = new Class_ni(Class_qb.b, Class_tf.bb, Class_ae.g[var2], Class_ub.L[var2], Class_ia.bb[var2], Class_ld.ib[var2], var5);
         } while (Class_lh.zb > ++var2);

         Class_oe.a((byte)-93);
         return var1;
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "ea.B(" + var0 + ')');
      }
   }

   final void a(Class_lh var1, int var2, int var3) {
      int var5 = client.lb;

      try {
         if (var3 != -1) {
            T = null;
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

               this.lb = var1.k(1355769544);
               if (var5 == 0) {
                  break label44;
               }
            }

            this.jb = ~var1.n(-6677) == -2;
         }

         Q++;
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "ea.K(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   public static void d(byte var0) {
      try {
         ab = null;
         kb = null;
         gb = null;
         bb = null;
         R = null;
         eb = null;
         ib = null;
         X = null;
         W = null;
         T = null;
         fb = null;
         V = null;
         db = null;
         if (var0 != 126) {
            d(69, 68, 57);
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ea.E(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(byte var0, int var1, Class_af var2, Class_af var3, int var4, int var5, int var6, Class_ha var7) {
      int var25 = client.lb;

      try {
         hb++;
         Class_hg.m = var4;
         Class_ug.v = var1;
         Class_la.Y = var6;
         Class_jc.s = var5;
         Class_jg.b = var7;
         if (Class_mk.j == null) {
            Class_b.R = true;
            if (Class_sj.g == null) {
               Class_sj.g = Class_j.a(Class_id.s, 0, Class_lj.p, (byte)13);
            }

            if (Class_id.l == null) {
               Class_id.l = Class_dj.a(Class_id.s, 0, false, Class_qe.K);
            }

            if (Class_fc.C == null) {
               Class_fc.C = Class_dj.a(Class_id.s, 0, false, Class_cd.bb);
            }

            if (Class_fd.c == null) {
               Class_fd.c = Class_dj.a(Class_id.s, 0, false, Class_pi.ob);
            }

            int var9 = 4 * (Class_hg.m / 5);
            int var8 = Class_hg.m / 5;
            if (var0 != -38) {
               V = null;
            }

            Class_nc.c(Class_la.Y, Class_ug.v, Class_hg.m, Class_jc.s, 0, 168);
            Class_nc.d(Class_la.Y, Class_ug.v, var8, 23, 12425273, 9135624);
            Class_nc.d(Class_la.Y + var8, Class_ug.v, var9, 23, 5197647, 2697513);
            var2.c(Class_ta.tb, var8 / 2 + Class_la.Y, Class_ug.v + 15, 0, -1);
            if (Class_fd.c != null) {
               Class_fd.c[1].a(2 + Class_la.Y - -var8, Class_ug.v - -1);
               var3.b(Class_ud.k, var8 + Class_la.Y + 12, 10 + Class_ug.v, 16777215, -1);
               Class_fd.c[0].a(2 + (Class_la.Y - -var8), Class_ug.v - -12);
               var3.b(Class_mc.b, 12 + var8 + Class_la.Y, Class_ug.v - -21, 16777215, -1);
            }

            if (Class_fc.C != null) {
               int var10;
               label226: {
                  var10 = Class_la.Y - -var8 - -140;
                  if (Class_ka.ob[0] == 0 && ~Class_hh.j[0] == -1) {
                     Class_fc.C[2].a(var10, 4 + Class_ug.v);
                     if (var25 == 0) {
                        break label226;
                     }
                  }

                  Class_fc.C[0].a(var10, Class_ug.v + 4);
               }

               label220: {
                  if (Class_ka.ob[0] == 0 && ~Class_hh.j[0] == -2) {
                     Class_fc.C[3].a(var10 + 15, 4 + Class_ug.v);
                     if (var25 == 0) {
                        break label220;
                     }
                  }

                  Class_fc.C[1].a(var10 + 15, Class_ug.v + 4);
               }

               int var11;
               label258: {
                  var2.b(Class_nj.k, 32 + var10, Class_ug.v + 17, 16777215, -1);
                  var11 = Class_la.Y - (-var8 + -250);
                  if (~Class_ka.ob[0] != -2 || Class_hh.j[0] != 0) {
                     Class_fc.C[0].a(var11, Class_ug.v - -4);
                     if (var25 == 0) {
                        break label258;
                     }
                  }

                  Class_fc.C[2].a(var11, 4 + Class_ug.v);
               }

               label260: {
                  if (Class_ka.ob[0] != 1 || Class_hh.j[0] != 1) {
                     Class_fc.C[1].a(15 + var11, Class_ug.v + 4);
                     if (var25 == 0) {
                        break label260;
                     }
                  }

                  Class_fc.C[3].a(15 + var11, Class_ug.v + 4);
               }

               int var12;
               label198: {
                  var2.b(Class_oc.m, 32 + var11, 17 + Class_ug.v, 16777215, -1);
                  var12 = Class_la.Y - -var8 + 360;
                  if (Class_ka.ob[0] == 2 && Class_hh.j[0] == 0) {
                     Class_fc.C[2].a(var12, Class_ug.v + 4);
                     if (var25 == 0) {
                        break label198;
                     }
                  }

                  Class_fc.C[0].a(var12, Class_ug.v + 4);
               }

               label192: {
                  if (Class_ka.ob[0] == 2 && Class_hh.j[0] == 1) {
                     Class_fc.C[3].a(var12 + 15, Class_ug.v - -4);
                     if (var25 == 0) {
                        break label192;
                     }
                  }

                  Class_fc.C[1].a(var12 - -15, 4 + Class_ug.v);
               }

               int var13;
               label186: {
                  var2.b(Class_b.I, 32 + var12, 17 + Class_ug.v, 16777215, -1);
                  var13 = 470 + Class_la.Y - -var8;
                  if (Class_ka.ob[0] == 3 && ~Class_hh.j[0] == -1) {
                     Class_fc.C[2].a(var13, 4 + Class_ug.v);
                     if (var25 == 0) {
                        break label186;
                     }
                  }

                  Class_fc.C[0].a(var13, 4 + Class_ug.v);
               }

               label261: {
                  if (Class_ka.ob[0] != 3 || ~Class_hh.j[0] != -2) {
                     Class_fc.C[1].a(15 + var13, Class_ug.v + 4);
                     if (var25 == 0) {
                        break label261;
                     }
                  }

                  Class_fc.C[3].a(15 + var13, 4 + Class_ug.v);
               }

               var2.b(Class_rd.Q, 32 + var13, 17 + Class_ug.v, 16777215, -1);
            }

            Class_nc.f(Class_hg.m + -58 - 10, 4 + Class_ug.v, 58, 16, 0);
            Class_ve.X = -1;
            if (Class_sj.g != null) {
               byte var27 = 88;
               byte var28 = 19;
               int var30 = (Class_jc.s + -23) / (1 + var28);
               int var29 = Class_hg.m / (var27 + 1);

               int var14;
               int var15;
               do {
                  var14 = var30;
                  var15 = var29;
                  if (~(var30 * (-1 + var29)) <= ~Class_ld.kb) {
                     var29--;
                  }

                  if (Class_ld.kb <= (-1 + var30) * var29) {
                     var30--;
                  }

                  if (Class_ld.kb <= (-1 + var30) * var29) {
                     var30--;
                  }
               } while (var30 != var14 || var15 != var29);

               var14 = (Class_hg.m + -(var27 * var29)) / (var29 + 1);
               if (~var14 < -6) {
                  var14 = 5;
               }

               var15 = (Class_jc.s + (-23 - var28 * var30)) / (1 + var30);
               if (~var15 < -6) {
                  var15 = 5;
               }

               int var16 = (Class_hg.m - var27 * var29 - (-1 + var29) * var14) / 2;
               int var17 = (-((var30 + -1) * var15) + -(var28 * var30) + Class_jc.s + -23) / 2;
               int var18 = 23 + var17;
               int var20 = 0;
               int var19 = var16;
               int var21 = 0;
               if (var25 != 0 || ~var21 > ~Class_ld.kb) {
                  do {
                     Class_pd var22 = Class_ta.B[var21];
                     boolean var23 = true;
                     Class_r var24 = Class_og.b(var22.f, 0);
                     if (~var22.f != 0) {
                        if (var22.f > 1980) {
                           var23 = false;
                           var24 = Class_fg.q;
                           if (var25 != 0) {
                              var23 = false;
                              var24 = Class_rf.f;
                           }
                        }
                     } else {
                        var23 = false;
                        var24 = Class_rf.f;
                     }

                     label262: {
                        if (~var19 < ~Class_pj.c || var18 > Class_bh.k || Class_pj.c >= var27 + var19 || ~Class_bh.k <= ~(var28 + var18) || !var23) {
                           Class_sj.g[var22.b ? 1 : 0].c(Class_la.Y + var19, Class_ug.v - -var18);
                           if (var25 == 0) {
                              break label262;
                           }
                        }

                        Class_ve.X = var21;
                        Class_sj.g[var22.b ? 1 : 0].a(Class_la.Y - -var19, Class_ug.v - -var18, 128, 16777215);
                     }

                     if (Class_id.l != null) {
                        Class_id.l[var22.g + (!var22.b ? 0 : Class_id.l.length / 2)].a(var19 + Class_la.Y - -29, Class_ug.v + var18);
                     }

                     var2.c(Class_og.b(var22.e, var0 + 38), Class_la.Y + (var19 - -15), var18 + Class_ug.v - -(var28 / 2) + 5, 0, -1);
                     var3.c(var24, 60 + var19 + Class_la.Y, Class_ug.v + (var18 - -(var28 / 2)) + 5, 268435455, -1);
                     var18 += var15 - -var28;
                     if (var30 <= ++var20) {
                        var18 = var17 + 23;
                        var20 = 0;
                        var19 += var14 + var27;
                     }
                  } while (~(++var21) > ~Class_ld.kb);
               }
            }
         }
      } catch (RuntimeException var26) {
         throw Class_sh.a(
            var26,
            "ea.D("
               + var0
               + ','
               + var1
               + ','
               + (var2 != null ? "{...}" : "null")
               + ','
               + (var3 != null ? "{...}" : "null")
               + ','
               + var4
               + ','
               + var5
               + ','
               + var6
               + ','
               + (var7 != null ? "{...}" : "null")
               + ')'
         );
      }
   }

   static final Class_kk d(int var0, int var1, int var2) {
      Class_aa var3 = Class_ck.d[var0][var1][var2];
      return var3 == null ? null : var3.s;
   }

   public Class_ea() {
      super(1, false);
      this.jb = true;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int[][] a(int var1, boolean var2) {
      int var21 = client.lb;

      try {
         S++;
         if (!var2) {
            this.lb = 100;
         }

         int[][] var3 = super.K.a(var1, (byte)-101);
         if (super.K.q) {
            int[] var4 = this.b(0, Class_fa.rc & -1 + var1, 29149);
            int[] var5 = this.b(0, var1, 29149);
            int[] var6 = this.b(0, Class_fa.rc & var1 - -1, 29149);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int var10 = 0;
            if (var21 != 0 || ~Class_ld.X < ~var10) {
               do {
                  int var11;
                  int var12;
                  int var13;
                  label32: {
                     int var15 = (var5[Class_ed.d & var10 + 1] - var5[Class_ed.d & var10 + -1]) * this.lb;
                     int var14 = this.lb * (-var4[var10] + var6[var10]);
                     int var17 = var14 >> 1650796588;
                     int var16 = var15 >> -252799028;
                     int var19 = var17 * var17 >> -812361652;
                     int var18 = var16 * var16 >> -437259636;
                     int var20 = (int)(Math.sqrt((4096 + var19 + var18) / 4096.0F) * 4096.0);
                     if (~var20 == -1) {
                        var12 = 0;
                        var13 = 0;
                        var11 = 0;
                        if (var21 == 0) {
                           break label32;
                        }
                     }

                     var12 = var14 / var20;
                     var11 = var15 / var20;
                     var13 = 16777216 / var20;
                  }

                  if (this.jb) {
                     var13 = (var13 >> 902826465) + 2048;
                     var11 = 2048 - -(var11 >> 330679649);
                     var12 = 2048 - -(var12 >> -800465215);
                  }

                  var7[var10] = var11;
                  var8[var10] = var12;
                  var9[var10] = var13;
               } while (~Class_ld.X < ~(++var10));
            }
         }

         return var3;
      } catch (RuntimeException var22) {
         throw Class_sh.a(var22, "ea.A(" + var1 + ',' + var2 + ')');
      }
   }
}
