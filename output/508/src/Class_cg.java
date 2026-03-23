class Class_cg extends Class_mj {
   static int g;
   static int[] h = new int[Class_cg.q];
   static int[] i = new int[Class_cg.q];
   static Class_qc j = new Class_qc(64);
   static int[] k = new int[Class_cg.q];
   static int l;
   static int[] m = new int[Class_cg.q];
   static int n;
   static Class_r[] o = new Class_r[Class_cg.q];
   static int[] p = new int[Class_cg.q];
   static int q = 50;
   static int r;
   static int[] s = new int[q];
   static long t = 0L;
   static int[] u = new int[q];
   static Class_lj[] v = new Class_lj[100];

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final Class_r[] a(byte var0, Class_r[] var1) {
      int var4 = client.lb;

      try {
         l++;
         Class_r[] var2 = new Class_r[5];
         int var3 = 0;
         if (var4 == 0 && ~var3 <= -6) {
            if (var0 >= -65) {
               a((byte)-122, (Class_r[])null);
            }

            return var2;
         } else {
            do {
               var2[var3] = Class_o.a(2, new Class_r[]{Class_og.b(var3, 0), Class_c.v});
               if (var1 != null && var1[var3] != null) {
                  var2[var3] = Class_o.a(2, new Class_r[]{var2[var3], var1[var3]});
               }
            } while (~(++var3) > -6);

            if (var0 >= -65) {
               a((byte)-122, (Class_r[])null);
            }

            return var2;
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "cg.I(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var23 = client.lb;

      try {
         Class_jj.a(-1, var6);
         int var7 = 0;
         g++;
         int var9 = var6;
         int var10 = -var6;
         int var8 = var6 + -var3;
         if (~var8 > -1) {
            var8 = 0;
         }

         int var11 = var8;
         if (var5 == -135) {
            int var12 = -var8;
            byte var13 = -1;
            if (~Class_ff.d >= ~var1 && var1 <= Class_hh.h) {
               int[] var15 = Class_qd.p[var1];
               int var16 = Class_tf.a(var4 - var6, Class_tg.r, (byte)114, Class_ga.v);
               int var17 = Class_tf.a(var4 - -var6, Class_tg.r, (byte)114, Class_ga.v);
               int var18 = Class_tf.a(-var8 + var4, Class_tg.r, (byte)114, Class_ga.v);
               int var19 = Class_tf.a(var4 - -var8, Class_tg.r, (byte)114, Class_ga.v);
               Class_fd.a(var16, (byte)-17, var2, var15, var18);
               Class_fd.a(var18, (byte)-17, var0, var15, var19);
               Class_fd.a(var19, (byte)-17, var2, var15, var17);
            }

            byte var14 = -1;
            if (var23 != 0 || ~var6 < ~var7) {
               do {
                  var13 += 2;
                  var14 += 2;
                  var10 += var13;
                  var12 += var14;
                  if (var12 >= 0 && ~var11 <= -2) {
                     Class_tj.s[--var11] = var7;
                     var12 -= var11 << 1586863489;
                  }

                  var7++;
                  if (var10 >= 0) {
                     var9--;
                     var10 -= var9 << -199004927;
                     int var25 = var1 + -var9;
                     int var27 = var1 + var9;
                     label96:
                     if (~Class_ff.d >= ~var27 && var25 <= Class_hh.h) {
                        if (var8 > var9) {
                           int var29 = Class_tj.s[var9];
                           int var33 = Class_tf.a(var4 + var7, Class_tg.r, (byte)114, Class_ga.v);
                           int var37 = Class_tf.a(-var7 + var4, Class_tg.r, (byte)114, Class_ga.v);
                           int var20 = Class_tf.a(var29 + var4, Class_tg.r, (byte)114, Class_ga.v);
                           int var21 = Class_tf.a(var4 + -var29, Class_tg.r, (byte)114, Class_ga.v);
                           if (Class_hh.h >= var27) {
                              int[] var22 = Class_qd.p[var27];
                              Class_fd.a(var37, (byte)-17, var2, var22, var21);
                              Class_fd.a(var21, (byte)-17, var0, var22, var20);
                              Class_fd.a(var20, (byte)-17, var2, var22, var33);
                           }

                           if (var25 < Class_ff.d) {
                              break label96;
                           }

                           int[] var41 = Class_qd.p[var25];
                           Class_fd.a(var37, (byte)-17, var2, var41, var21);
                           Class_fd.a(var21, (byte)-17, var0, var41, var20);
                           Class_fd.a(var20, (byte)-17, var2, var41, var33);
                           if (var23 == 0) {
                              break label96;
                           }
                        }

                        int var30 = Class_tf.a(var4 - -var7, Class_tg.r, (byte)114, Class_ga.v);
                        int var34 = Class_tf.a(-var7 + var4, Class_tg.r, (byte)114, Class_ga.v);
                        if (~Class_hh.h <= ~var27) {
                           Class_fd.a(var34, (byte)-17, var2, Class_qd.p[var27], var30);
                        }

                        if (var25 >= Class_ff.d) {
                           Class_fd.a(var34, (byte)-17, var2, Class_qd.p[var25], var30);
                        }
                     }
                  }

                  int var28 = var1 - -var7;
                  int var26 = var1 - var7;
                  if (~var28 <= ~Class_ff.d && ~var26 >= ~Class_hh.h) {
                     int var31 = var9 + var4;
                     int var35 = var4 + -var9;
                     if (Class_ga.v <= var31 && ~var35 >= ~Class_tg.r) {
                        var31 = Class_tf.a(var31, Class_tg.r, (byte)114, Class_ga.v);
                        var35 = Class_tf.a(var35, Class_tg.r, (byte)114, Class_ga.v);
                        if (var8 > var7) {
                           int var38 = var11 < var7 ? Class_tj.s[var7] : var11;
                           int var39 = Class_tf.a(var38 + var4, Class_tg.r, (byte)114, Class_ga.v);
                           int var40 = Class_tf.a(var4 + -var38, Class_tg.r, (byte)114, Class_ga.v);
                           if (~Class_hh.h <= ~var28) {
                              int[] var42 = Class_qd.p[var28];
                              Class_fd.a(var35, (byte)-17, var2, var42, var40);
                              Class_fd.a(var40, (byte)-17, var0, var42, var39);
                              Class_fd.a(var39, (byte)-17, var2, var42, var31);
                           }

                           if (var26 >= Class_ff.d) {
                              int[] var43 = Class_qd.p[var26];
                              Class_fd.a(var35, (byte)-17, var2, var43, var40);
                              Class_fd.a(var40, (byte)-17, var0, var43, var39);
                              Class_fd.a(var39, (byte)-17, var2, var43, var31);
                              if (var23 != 0) {
                                 if (var28 <= Class_hh.h) {
                                    Class_fd.a(var35, (byte)-17, var2, Class_qd.p[var28], var31);
                                 }

                                 if (~var26 <= ~Class_ff.d) {
                                    Class_fd.a(var35, (byte)-17, var2, Class_qd.p[var26], var31);
                                 }
                              }
                           }
                        } else {
                           if (var28 <= Class_hh.h) {
                              Class_fd.a(var35, (byte)-17, var2, Class_qd.p[var28], var31);
                           }

                           if (~var26 <= ~Class_ff.d) {
                              Class_fd.a(var35, (byte)-17, var2, Class_qd.p[var26], var31);
                           }
                        }
                     }
                  }
               } while (~var9 < ~var7);
            }
         }
      } catch (RuntimeException var24) {
         throw Class_sh.a(var24, "cg.J(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
      }
   }

   static final void a(int var0, Class_ta var1) {
      try {
         r++;
         if (~Class_be.C == ~var1.t || var1.ob == -1 || var1.R != 0 || var1.cb + 1 > Class_kk.a((byte)-36, var1.ob).A[var1.u]) {
            int var3 = Class_be.C + -var1.W;
            int var2 = -var1.W + var1.t;
            int var5 = var1.Q * 64 + 128 * var1.q;
            int var6 = 128 * var1.O + 64 * var1.Q;
            int var7 = 64 * var1.Q + var1.r * 128;
            var1.J = ((var2 - var3) * var5 - -(var7 * var3)) / var2;
            int var4 = var1.fb * 128 + var1.Q * 64;
            var1.hb = (var3 * var6 + (var2 - var3) * var4) / var2;
         }

         if (var0 == 128) {
            if (var1.Ib == 0) {
               var1.F = 1024;
            }

            if (var1.Ib == 1) {
               var1.F = 1536;
            }

            if (var1.Ib == 2) {
               var1.F = 0;
            }

            if (~var1.Ib == -4) {
               var1.F = 512;
            }

            var1.U = var1.F;
            var1.s = 0;
         }
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "cg.H(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   public static void a(int var0) {
      try {
         k = null;
         u = null;
         j = null;
         h = null;
         m = null;
         p = null;
         if (var0 != 32655) {
            p = null;
         }

         v = null;
         s = null;
         o = null;
         i = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "cg.G(" + var0 + ')');
      }
   }
}
