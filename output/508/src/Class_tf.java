final class Class_tf extends Class_pe {
   static int I;
   static long[] J = new long[1000];
   static Class_r K = Class_tc.a(43, "showingVideoAd");
   byte M;
   int N;
   static Class_r O = Class_tc.a(43, "underlay");
   Class_sg P;
   static int R;
   static Class_r S = Class_tc.a(43, ":duelfriend:");
   static int T = 0;
   static int U;
   static int V = 127;
   static int W = -1;
   static int X;
   static int Y;
   static int Z;
   static int ab;
   static int bb;

   public static void c(byte var0) {
      try {
         S = null;
         K = null;
         J = null;
         if (var0 != -63) {
            c((byte)-1);
         }

         O = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "tf.D(" + var0 + ')');
      }
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
      try {
         R++;
         if (~var4 == ~var1) {
            Class_ad.a(var6, var2, var5, var1, var3, 73, var0);
         } else {
            label28: {
               if (~Class_ga.v >= ~(-var1 + var2) && Class_tg.r >= var1 + var2 && var3 - var4 >= Class_ff.d && ~(var4 + var3) >= ~Class_hh.h) {
                  Class_sg.a(var5, var4, var6, var2, var0, var1, (byte)-111, var3);
                  if (client.lb == 0) {
                     break label28;
                  }
               }

               Class_bh.a(var0, var1, var3, var4, var6, var2, var5, -1832820639);
            }

            if (var7 != -12) {
               S = null;
            }
         }
      } catch (RuntimeException var9) {
         throw Class_sh.a(var9, "tf.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
      }
   }

   static final Class_ha a(int var0, byte var1) {
      try {
         if (var1 != -80) {
            S = null;
         }

         X++;
         int var3 = var0 & 65535;
         int var2 = var0 >> -1432122384;
         if (Class_ve.ab[var2] == null || Class_ve.ab[var2][var3] == null) {
            boolean var4 = Class_oj.b(var2, (byte)-2);
            if (!var4) {
               return null;
            }
         }

         return Class_ve.ab[var2][var3];
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "tf.C(" + var0 + ',' + var1 + ')');
      }
   }

   public Class_tf() {
   }

   static final int a(int var0, int var1, byte var2, int var3) {
      try {
         if (var2 != 114) {
            W = 105;
         }

         ab++;
         if (~var0 > ~var3) {
            return var3;
         } else {
            return ~var0 >= ~var1 ? var0 : var1;
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "tf.B(" + var0 + 44 + var1 + 44 + var2 + 44 + var3 + 41);
      }
   }
}
