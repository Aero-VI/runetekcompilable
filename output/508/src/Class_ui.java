final class Class_ui {
   static Class_r a = Class_ui.b;
   private static Class_r b = Class_tc.a(43, "red:");
   static int c = 0;
   static Class_sg d;
   static Class_r e = b;
   static int f;
   static short[] g;
   static boolean h = false;

   public static void a(int var0) {
      try {
         if (var0 != 0) {
            e = null;
         }

         d = null;
         b = null;
         a = null;
         e = null;
         g = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ui.A(" + var0 + ')');
      }
   }

   static final Object a(boolean var0, byte var1, byte[] var2) {
      try {
         int var3 = -25 % ((-73 - var1) / 52);
         f++;
         if (var2 == null) {
            return null;
         } else {
            if (~var2.length < -137 && !Class_sc.f) {
               try {
                  Class_bj var4 = (Class_bj)Class.forName("eg").newInstance();
                  var4.a(var2, true);
                  return var4;
               } catch (Throwable var5) {
                  Class_sc.f = true;
               }
            }

            return var0 ? Class_p.a(var2, false) : var2;
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "ui.C(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
      }
   }

   static int a(int var0, int var1) {
      try {
         return var0 & var1;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ui.B(" + var0 + 44 + var1 + 41);
      }
   }
}
