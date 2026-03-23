final class Class_md extends Class_li {
   byte[] p;
   static int q;
   static int r;
   static Class_sd s = Class_cd.e(3253);
   static int t;
   private static Class_r u = Class_tc.a(43, "wishes to trade with you)3");
   static Class_r v = u;
   static Class_sb w;
   static int[] x;
   static Class_jb[] y;
   static Class_lb z;

   static final void a(Class_aj var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      int var9;
      int var10 = var9 = (var6 << 7) - Class_de.i;
      int var11;
      int var12 = var11 = (var7 << 7) - Class_mi.W;
      int var13;
      int var14 = var13 = var10 + 128;
      int var15;
      int var16 = var15 = var12 + 128;
      int var17 = Class_mi.U[var1][var6][var7] - Class_n.q;
      int var18 = Class_mi.U[var1][var6 + 1][var7] - Class_n.q;
      int var19 = Class_mi.U[var1][var6 + 1][var7 + 1] - Class_n.q;
      int var20 = Class_mi.U[var1][var6][var7 + 1] - Class_n.q;
      int var21 = var12 * var4 + var10 * var5 >> 16;
      var12 = var12 * var5 - var10 * var4 >> 16;
      var21 = var17 * var3 - var12 * var2 >> 16;
      var12 = var17 * var2 + var12 * var3 >> 16;
      if (var12 >= 50) {
         var21 = var11 * var4 + var14 * var5 >> 16;
         var11 = var11 * var5 - var14 * var4 >> 16;
         var21 = var18 * var3 - var11 * var2 >> 16;
         var11 = var18 * var2 + var11 * var3 >> 16;
         if (var11 >= 50) {
            var21 = var16 * var4 + var13 * var5 >> 16;
            var16 = var16 * var5 - var13 * var4 >> 16;
            var21 = var19 * var3 - var16 * var2 >> 16;
            var16 = var19 * var2 + var16 * var3 >> 16;
            if (var16 >= 50) {
               var21 = var15 * var4 + var9 * var5 >> 16;
               var15 = var15 * var5 - var9 * var4 >> 16;
               var21 = var20 * var3 - var15 * var2 >> 16;
               var15 = var20 * var2 + var15 * var3 >> 16;
               if (var15 >= 50) {
                  int var22 = Class_kd.n + (var21 << 9) / var12;
                  int var23 = Class_kd.j + (var21 << 9) / var12;
                  int var24 = Class_kd.n + (var21 << 9) / var11;
                  int var25 = Class_kd.j + (var21 << 9) / var11;
                  int var26 = Class_kd.n + (var21 << 9) / var16;
                  int var27 = Class_kd.j + (var21 << 9) / var16;
                  int var28 = Class_kd.n + (var21 << 9) / var15;
                  int var29 = Class_kd.j + (var21 << 9) / var15;
                  Class_kd.c = 0;
                  if ((var26 - var28) * (var25 - var29) - (var27 - var29) * (var24 - var28) > 0) {
                     if (Class_lh.cb && Class_w.a(Class_od.c + Class_kd.n, Class_fh.R + Class_kd.j, var27, var29, var25, var26, var28, var24)) {
                        Class_tf.W = var6;
                        Class_ng.q = var7;
                     }

                     if (!var8) {
                        Class_kd.g = false;
                        if (var26 < 0 || var28 < 0 || var24 < 0 || var26 > Class_kd.r || var28 > Class_kd.r || var24 > Class_kd.r) {
                           Class_kd.g = true;
                        }

                        if (var0.i == -1) {
                           if (var0.m != 12345678) {
                              Class_kd.a(var27, var29, var25, var26, var28, var24, var0.m, var0.a, var0.e);
                           }
                        } else if (Class_qd.G) {
                           if (var0.j) {
                              Class_kd.a(
                                 var27,
                                 var29,
                                 var25,
                                 var26,
                                 var28,
                                 var24,
                                 var0.m,
                                 var0.a,
                                 var0.e,
                                 var21,
                                 var21,
                                 var21,
                                 var21,
                                 var21,
                                 var21,
                                 var12,
                                 var11,
                                 var15,
                                 var0.i
                              );
                           } else {
                              Class_kd.a(
                                 var27,
                                 var29,
                                 var25,
                                 var26,
                                 var28,
                                 var24,
                                 var0.m,
                                 var0.a,
                                 var0.e,
                                 var21,
                                 var21,
                                 var21,
                                 var21,
                                 var21,
                                 var21,
                                 var16,
                                 var15,
                                 var11,
                                 var0.i
                              );
                           }
                        } else {
                           int var30 = Class_kd.i.c(var0.i, -23);
                           Class_kd.a(var27, var29, var25, var26, var28, var24, Class_u.b(var30, var0.m), Class_u.b(var30, var0.a), Class_u.b(var30, var0.e));
                        }
                     }
                  }

                  if ((var22 - var24) * (var29 - var25) - (var23 - var25) * (var28 - var24) > 0) {
                     if (Class_lh.cb && Class_w.a(Class_od.c + Class_kd.n, Class_fh.R + Class_kd.j, var23, var25, var29, var22, var24, var28)) {
                        Class_tf.W = var6;
                        Class_ng.q = var7;
                     }

                     if (!var8) {
                        Class_kd.g = false;
                        if (var22 < 0 || var24 < 0 || var28 < 0 || var22 > Class_kd.r || var24 > Class_kd.r || var28 > Class_kd.r) {
                           Class_kd.g = true;
                        }

                        if (var0.i == -1) {
                           if (var0.o != 12345678) {
                              Class_kd.a(var23, var25, var29, var22, var24, var28, var0.o, var0.e, var0.a);
                              return;
                           }
                        } else {
                           if (Class_qd.G) {
                              Class_kd.a(
                                 var23,
                                 var25,
                                 var29,
                                 var22,
                                 var24,
                                 var28,
                                 var0.o,
                                 var0.e,
                                 var0.a,
                                 var21,
                                 var21,
                                 var21,
                                 var21,
                                 var21,
                                 var21,
                                 var12,
                                 var11,
                                 var15,
                                 var0.i
                              );
                              return;
                           }

                           int var53 = Class_kd.i.c(var0.i, 117);
                           Class_kd.a(var23, var25, var29, var22, var24, var28, Class_u.b(var53, var0.o), Class_u.b(var53, var0.e), Class_u.b(var53, var0.a));
                        }
                     }
                  }
               }
            }
         }
      }
   }

   static final Class_l a(byte var0, Class_lh var1) {
      try {
         t++;
         if (var0 < 70) {
            z = null;
         }

         return new Class_l(var1.p(-22489), var1.p(-22489), var1.p(-22489), var1.p(-22489), var1.b((byte)-97), var1.b((byte)91), var1.n(-6677));
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "md.E(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   static final void a(byte var0) {
      try {
         r++;
         Class_cc.Lb.a(-123);
         if (var0 != -79) {
            z = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "md.B(" + var0 + ')');
      }
   }

   public static void a(boolean var0) {
      try {
         w = null;
         x = null;
         v = null;
         if (var0) {
            a((byte)-8, null);
         }

         y = null;
         u = null;
         s = null;
         z = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "md.D(" + var0 + ')');
      }
   }

   static final void a(Class_cj var0, int var1) {
      try {
         if (var1 != -7486) {
            y = null;
         }

         Class_bj.f = var0;
         q++;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "md.C(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
      }
   }

   static final Class_kk a(int var0, int var1, int var2) {
      Class_aa var3 = Class_ck.d[var0][var1][var2];
      if (var3 == null) {
         return null;
      } else {
         Class_kk var4 = var3.s;
         var3.s = null;
         return var4;
      }
   }

   Class_md(byte[] var1) {
      try {
         this.p = var1;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "md.<init>(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }
}
