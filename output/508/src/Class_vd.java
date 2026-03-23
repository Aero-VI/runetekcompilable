final class Class_vd {
   private static Class_r a = Class_tc.a(43, "Drop");
   static Class_r b = a;
   static long[] c = new long[32];
   static int d;
   static int e = 2301979;
   static volatile int f = 0;
   static int g;
   static Class_r h = Class_tc.a(43, "Starte 3D)2Softwarebibliothek)3");

   public static void a(int var0) {
      try {
         b = null;
         c = null;
         a = null;
         if (var0 > -100) {
            a(53, -1, -71);
         }

         h = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "vd.C(" + var0 + ')');
      }
   }

   static final boolean a(int var0, int var1, int var2, int var3, Class_a var4, int var5, long var6, int var8, int var9, int var10, int var11) {
      return var4 == null ? true : Class_ma.a(var0, var8, var9, var10 - var8 + 1, var11 - var9 + 1, var1, var2, var3, var4, var5, true, var6);
   }

   static final boolean a(int var0, int var1, int var2) {
      try {
         if (var2 != 28446) {
            return false;
         } else {
            if (var1 == 11) {
               var1 = 10;
            }

            g++;
            if (~var1 <= -6 && ~var1 >= -9) {
               var1 = 4;
            }

            Class_ub var3 = Class_qe.a(88, var0);
            return var3.a(124, var1);
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "vd.B(" + var0 + ',' + var1 + ',' + var2 + ')');
      }
   }
}
