abstract class Class_bh {
   static short[] a;
   static Class_r b = Class_tc.a(43, "Update)2Liste geladen)3");
   static Class_r c = Class_tc.a(43, "not yet implemented");
   int d;
   static int e;
   static Class_r f = Class_tc.a(43, ":");
   static int g;
   int h;
   static Class_sg i;
   int j;
   static int k = 0;

   public static void a(int var0) {
      try {
         i = null;
         if (var0 != -28590) {
            a(111);
         }

         b = null;
         c = null;
         a = null;
         f = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "bh.C(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var47 = client.lb;

      try {
         e++;
         int var8 = 0;
         int var9 = var3;
         int var10 = 0;
         int var11 = var1 - var6;
         int var12 = -var6 + var3;
         int var13 = var1 * var1;
         int var14 = var3 * var3;
         int var15 = var11 * var11;
         int var17 = var14 << 1681556737;
         int var21 = var3 << -1832820639;
         int var16 = var12 * var12;
         int var20 = var15 << 1391449889;
         int var18 = var13 << 1699540225;
         int var19 = var16 << 1513595521;
         int var22 = var12 << -833556799;
         if (var7 != -1832820639) {
            c = null;
         }

         int var24 = var14 + -((-1 + var21) * var18);
         int var23 = var13 * (1 + -var21) - -var17;
         int var25 = var15 * (-var22 + 1) - -var19;
         int var28 = var14 << 2063553986;
         int var27 = var13 << 914706850;
         int var29 = var15 << -221823518;
         int var26 = var16 + -((-1 + var22) * var20);
         int var30 = var16 << -57084446;
         int var31 = var17 * 3;
         int var32 = (var21 + -3) * var18;
         int var33 = var19 * 3;
         int var34 = (-3 + var22) * var20;
         int var37 = var30;
         int var35 = var28;
         int var36 = var27 * (-1 + var3);
         if (~var2 <= ~Class_ff.d && Class_hh.h >= var2) {
            int[] var39 = Class_qd.p[var2];
            int var40 = Class_tf.a(-var1 + var5, Class_tg.r, (byte)114, Class_ga.v);
            int var41 = Class_tf.a(var5 - -var1, Class_tg.r, (byte)114, Class_ga.v);
            int var42 = Class_tf.a(var5 - var11, Class_tg.r, (byte)114, Class_ga.v);
            int var43 = Class_tf.a(var11 + var5, Class_tg.r, (byte)114, Class_ga.v);
            Class_fd.a(var40, (byte)-17, var4, var39, var42);
            Class_fd.a(var42, (byte)-17, var0, var39, var43);
            Class_fd.a(var43, (byte)-17, var4, var39, var41);
         }

         int var38 = (-1 + var12) * var29;
         if (var47 != 0 || var3 > 0) {
            do {
               if (var23 < 0 && (var47 != 0 || var23 < 0)) {
                  do {
                     var8++;
                     var23 += var31;
                     var24 += var35;
                     var31 += var28;
                     var35 += var28;
                  } while (var23 < 0);
               }

               boolean var49 = ~var9 >= ~var12;
               int var51 = --var9 + var2;
               if (~var24 > -1) {
                  var23 += var31;
                  var24 += var35;
                  var35 += var28;
                  var31 += var28;
                  var8++;
               }

               var24 += -var32;
               var23 += -var36;
               if (var49) {
                  if (~var25 > -1 && (var47 != 0 || var25 < 0)) {
                     do {
                        var26 += var37;
                        var37 += var30;
                        var10++;
                        var25 += var33;
                        var33 += var30;
                     } while (var25 < 0);
                  }

                  if (var26 < 0) {
                     var10++;
                     var26 += var37;
                     var25 += var33;
                     var33 += var30;
                     var37 += var30;
                  }

                  var26 += -var34;
                  var34 -= var29;
                  var25 += -var38;
                  var38 -= var29;
               }

               int var50 = -var9 + var2;
               var32 -= var27;
               label85:
               if (var51 >= Class_ff.d && var50 <= Class_hh.h) {
                  int var52 = Class_tf.a(var5 - -var8, Class_tg.r, (byte)114, Class_ga.v);
                  int var53 = Class_tf.a(-var8 + var5, Class_tg.r, (byte)114, Class_ga.v);
                  if (var49) {
                     int var44 = Class_tf.a(var5 - -var10, Class_tg.r, (byte)114, Class_ga.v);
                     int var45 = Class_tf.a(var5 + -var10, Class_tg.r, (byte)114, Class_ga.v);
                     if (~var50 <= ~Class_ff.d) {
                        int[] var46 = Class_qd.p[var50];
                        Class_fd.a(var53, (byte)-17, var4, var46, var45);
                        Class_fd.a(var45, (byte)-17, var0, var46, var44);
                        Class_fd.a(var44, (byte)-17, var4, var46, var52);
                     }

                     if (~Class_hh.h > ~var51) {
                        break label85;
                     }

                     int[] var54 = Class_qd.p[var51];
                     Class_fd.a(var53, (byte)-17, var4, var54, var45);
                     Class_fd.a(var45, (byte)-17, var0, var54, var44);
                     Class_fd.a(var44, (byte)-17, var4, var54, var52);
                     if (var47 == 0) {
                        break label85;
                     }
                  }

                  if (var50 >= Class_ff.d) {
                     Class_fd.a(var53, (byte)-17, var4, Class_qd.p[var50], var52);
                  }

                  if (var51 <= Class_hh.h) {
                     Class_fd.a(var53, (byte)-17, var4, Class_qd.p[var51], var52);
                  }
               }

               var36 -= var27;
            } while (var9 > 0);
         }
      } catch (RuntimeException var48) {
         throw Class_sh.a(var48, "bh.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
      }
   }

   static final void a(int var0, int var1, int var2, int var3, int var4) {
      try {
         g++;
         if (var0 < -77) {
            for (int var5 = 0; var5 < Class_jd.c; var5++) {
               if (var3 < Class_cf.X[var5] + Class_sd.f[var5]
                  && ~Class_sd.f[var5] > ~(var3 - -var1)
                  && ~(Class_fa.pc[var5] + Class_mc.g[var5]) < ~var4
                  && var2 + var4 > Class_mc.g[var5]) {
                  Class_n.u[var5] = true;
               }
            }
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "bh.F(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
      }
   }

   abstract void a(int var1, int var2, int var3);

   abstract void b(int var1, int var2, int var3);

   abstract void a(boolean var1, int var2, int var3);

   Class_bh(int var1, int var2, int var3) {
      try {
         this.j = var3;
         this.h = var2;
         this.d = var1;
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "bh.<init>(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }
}
