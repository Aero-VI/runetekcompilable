final class Class_fj {
   static Class_r a = Class_tc.a(43, ")1p");
   static boolean b = false;
   static int c;
   static int d = 0;
   static int e;
   static long f = 0L;
   static int g;

   static final synchronized long a(int var0) {
      try {
         if (var0 != 17161) {
            return -108L;
         } else {
            g++;
            long var1 = System.currentTimeMillis();
            if (var1 < Class_jk.z) {
               Class_cj.cb = Class_cj.cb + -var1 + Class_jk.z;
            }

            Class_jk.z = var1;
            return var1 + Class_cj.cb;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "fj.B(" + var0 + ')');
      }
   }

   public static void a(byte var0) {
      try {
         if (var0 < 8) {
            f = -105L;
         }

         a = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "fj.A(" + var0 + ')');
      }
   }
}
