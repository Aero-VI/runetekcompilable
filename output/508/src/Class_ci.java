final class Class_ci extends Class_pe {
   Class_b I;
   static int J;
   static int K;
   static Class_sg L;
   static int M;
   static Class_r N = Class_tc.a(43, "(U0a )2 via: ");

   Class_ci(Class_b var1) {
      try {
         this.I = var1;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ci.<init>(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   public static void d(int var0) {
      try {
         L = null;
         if (var0 == 1152) {
            N = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ci.C(" + var0 + ')');
      }
   }

   static final void a(Class_cj var0, int var1) {
      try {
         if (var1 > 76) {
            Class_sj.l = var0;
            K++;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ci.B(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
      }
   }

   static final int a(byte var0, int var1) {
      try {
         J++;
         if (var0 >= 65 && ~var0 >= -91) {
            return var0 - 65;
         } else {
            int var2 = -21 % ((-24 - var1) / 46);
            if (var0 >= 97 && ~var0 >= -123) {
               return 26 + (var0 - 97);
            } else if (var0 >= 48 && var0 <= 57) {
               return 4 + var0;
            } else if (~var0 == -44) {
               return 62;
            } else if (var0 == 42) {
               return 62;
            } else if (var0 == 47) {
               return 63;
            } else {
               return var0 == 45 ? 63 : -1;
            }
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ci.A(" + var0 + 44 + var1 + 41);
      }
   }

   static final boolean a(int var0, int var1, int var2, int var3, int var4, Class_a var5, int var6, long var7, boolean var9) {
      if (var5 == null) {
         return true;
      } else {
         int var10 = var1 - var4;
         int var11 = var2 - var4;
         int var12 = var1 + var4;
         int var13 = var2 + var4;
         if (var9) {
            if (var6 > 640 && var6 < 1408) {
               var13 += 128;
            }

            if (var6 > 1152 && var6 < 1920) {
               var12 += 128;
            }

            if (var6 > 1664 || var6 < 384) {
               var11 -= 128;
            }

            if (var6 > 128 && var6 < 896) {
               var10 -= 128;
            }
         }

         var10 /= 128;
         var11 /= 128;
         var12 /= 128;
         var13 /= 128;
         return Class_ma.a(var0, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var1, var2, var3, var5, var6, true, var7);
      }
   }
}
