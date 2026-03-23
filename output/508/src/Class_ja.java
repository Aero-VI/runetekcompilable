final class Class_ja extends Class_rh {
   static int t;
   static int u;
   static int v;
   static int w = 0;
   static Class_r x = Class_tc.a(43, ")3");
   static boolean y = false;
   static short z = 32767;
   static int[] A = new int[]{2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2};
   static int B;
   static int[][] C = new int[5][5000];

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, int var1, int var2, int var3, byte var4, int var5) {
      int var25 = client.lb;

      try {
         int var7 = var2;
         u++;
         int var6 = 0;
         int var8 = var3 * var3;
         int var9 = var2 * var2;
         if (var4 != 47) {
            z = -19;
         }

         int var10 = var9 << -779863583;
         int var11 = var8 << -1518401439;
         int var12 = var2 << -595804831;
         int var14 = -((var12 - 1) * var11) + var9;
         int var13 = var10 + var8 * (1 + -var12);
         int var15 = var8 << 1303195234;
         int var16 = var9 << -794882078;
         int var18 = var11 * ((var2 << -660150431) - 3);
         int var17 = var10 * (3 + (var6 << -1741293663));
         int var19 = var16 * (1 + var6);
         int var20 = (-1 + var2) * var15;
         if (Class_ff.d <= var1) {
            if (~Class_hh.h <= ~var1) {
               int var21 = Class_tf.a(var3 + var0, Class_tg.r, (byte)114, Class_ga.v);
               int var22 = Class_tf.a(-var3 + var0, Class_tg.r, (byte)114, Class_ga.v);
               Class_fd.a(var22, (byte)-17, var5, Class_qd.p[var1], var21);
               if (var25 == 0 && ~var2 >= -1) {
                  return;
               }
            } else if (~var2 >= -1) {
               return;
            }
         } else if (~var2 >= -1) {
            return;
         }

         do {
            var7--;
            if (var13 < 0) {
               if (var25 != 0) {
                  var13 += var17;
                  var14 += var19;
                  var19 += var16;
                  var17 += var16;
                  var6++;
               }

               while (~var13 > -1) {
                  var13 += var17;
                  var14 += var19;
                  var19 += var16;
                  var17 += var16;
                  var6++;
               }
            }

            int var27 = var1 + -var7;
            int var28 = var7 + var1;
            if (~var14 > -1) {
               var6++;
               var13 += var17;
               var14 += var19;
               var19 += var16;
               var17 += var16;
            }

            var13 += -var20;
            var14 += -var18;
            if (~Class_ff.d >= ~var28 && Class_hh.h >= var27) {
               int var23 = Class_tf.a(var6 + var0, Class_tg.r, (byte)114, Class_ga.v);
               int var24 = Class_tf.a(-var6 + var0, Class_tg.r, (byte)114, Class_ga.v);
               if (~Class_ff.d >= ~var27) {
                  Class_fd.a(var24, (byte)-17, var5, Class_qd.p[var27], var23);
               }

               if (var28 <= Class_hh.h) {
                  Class_fd.a(var24, (byte)-17, var5, Class_qd.p[var28], var23);
               }
            }

            var18 -= var15;
            var20 -= var15;
         } while (~var7 < -1);
      } catch (RuntimeException var26) {
         throw Class_sh.a(var26, "ja.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
      }
   }

   public static void a(int var0) {
      try {
         if (var0 != 1) {
            a(81, -116, -60, 54, (byte)-84, -25);
         }

         x = null;
         A = null;
         C = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ja.E(" + var0 + ')');
      }
   }

   static final void a(boolean var0, int var1) {
      try {
         v++;
         if (var1 == 1) {
            Class_d.m = var0;
            Class_j.fb = !Class_e.a(24781);
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ja.D(" + var0 + ',' + var1 + ')');
      }
   }
}
