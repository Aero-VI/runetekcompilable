final class Class_jc extends Class_li {
   static Class_r p = Class_tc.a(43, "Sprites geladen)3");
   static int q;
   static Class_r r = Class_jc.E;
   static int s;
   static int t;
   int u;
   static Class_qc v = new Class_qc(64);
   static Class_r w = Class_tc.a(43, "null");
   static Class_r[] x;
   static int[][] y = new int[104][104];
   static int z;
   int A;
   static int B;
   static int C;
   int D;
   private static Class_r E = Class_tc.a(43, "You can(Wt add yourself to your own friend list)3");
   static int F;

   static final Class_r a(int[] var0, long var1, int var3, int var4) {
      try {
         if (var3 != -1) {
            c(-84, -68);
         }

         t++;
         if (Class_g.d != null) {
            Class_r var5 = Class_g.d.a(var4, (byte)22, var1, var0);
            if (var5 != null) {
               return var5;
            }
         }

         return var4 == 5 ? Class_jd.a(var1, -1).c(var3 ^ -12689) : Class_wf.a(var1, -62);
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "jc.B(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var3 + ',' + var4 + ')');
      }
   }

   static final void b(int var0, int var1) {
      try {
         q++;
         int var2 = -59 / ((var1 - 27) / 54);
         Class_mk.a = 1000 / var0;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "jc.E(" + var0 + ',' + var1 + ')');
      }
   }

   static final void a(int var0, int var1, byte[] var2, boolean var3, Class_ga[] var4, boolean var5) {
      int var21 = client.lb;

      try {
         C++;
         Class_lh var6 = new Class_lh(var2);
         if (var5) {
            d(17);
         }

         int var7 = -1;

         while (true) {
            int var8 = var6.e(true);
            if (~var8 == -1) {
               return;
            }

            var7 += var8;
            int var9 = 0;

            while (true) {
               int var10 = var6.f(255);
               if (var10 != 0) {
                  var9 += -1 + var10;
                  int var11 = var9 & 63;
                  int var12 = (4032 & var9) >> -1109192570;
                  int var14 = var6.n(-6677);
                  int var13 = var9 >> 1165969356;
                  int var15 = var14 >> 750935842;
                  int var16 = 3 & var14;
                  int var17 = var0 + var12;
                  int var18 = var11 + var1;
                  if (~var17 >= -1 || ~var18 >= -1 || ~var17 <= -104 || var18 >= 103) {
                     continue;
                  }

                  Class_ga var19 = null;
                  if (!var3) {
                     int var20 = var13;
                     if (~(2 & Class_kk.c[1][var17][var18]) == -3) {
                        var20 = var13 - 1;
                     }

                     if (~var20 <= -1) {
                        var19 = var4[var20];
                     }
                  }

                  Class_w.a(var19, 1, var3, var18, var16, var17, var15, var13, var13, !var3, var7);
                  if (var21 == 0) {
                     continue;
                  }
               }

               if (var21 != 0) {
                  return;
               }
               break;
            }
         }
      } catch (RuntimeException var22) {
         throw Class_sh.a(
            var22,
            "jc.D(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ',' + var5 + ')'
         );
      }
   }

   static final int c(int var0, int var1) {
      try {
         if (var1 != -528748559) {
            a(null, 125L, 117, 89);
         }

         z++;
         return var0 >> -528748559 & 7;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "jc.C(" + var0 + 44 + var1 + 41);
      }
   }

   static final void d(int var0, int var1) {
      try {
         Class_qd.C = -1;
         Class_og.fb = var0;
         Class_ad.m = var1;
         Class_wh.a(-1);
         F++;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "jc.F(" + var0 + ',' + var1 + ')');
      }
   }

   public Class_jc() {
   }

   public static void d(int var0) {
      try {
         r = null;
         v = null;
         p = null;
         E = null;
         x = null;
         y = null;
         w = null;
         int var1 = -16 / ((4 - var0) / 49);
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "jc.A(" + var0 + ')');
      }
   }
}
