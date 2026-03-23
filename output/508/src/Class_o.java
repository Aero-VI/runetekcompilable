final class Class_o extends Class_qj {
   static int V;
   static int W;
   static int X;
   static int Y;
   static Class_r Z = Class_tc.a(43, "<img=1>");
   static Class_r ab = Class_tc.a(43, " steht bereits auf Ihrer Freunde)2Liste(Q");
   static Class_r bb = Class_tc.a(43, " )2> <col=ffffff>");
   static Class_r cb = Class_o.jb;
   static int db;
   static int eb;
   private Object fb;
   static int gb;
   static boolean hb = true;
   static Class_oi[] ib;
   private static Class_r jb = Class_tc.a(43, "Discard");

   final boolean e(int var1) {
      try {
         V++;
         int var2 = -40 % ((-43 - var1) / 62);
         return false;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "o.B(" + var1 + ')');
      }
   }

   public static void f(int var0) {
      try {
         bb = null;
         cb = null;
         jb = null;
         Z = null;
         ab = null;
         if (var0 != -840517817) {
            f(43);
         }

         ib = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "o.J(" + var0 + ')');
      }
   }

   static final int d(int var0, int var1) {
      try {
         db++;
         if (var1 != -840517817) {
            d(71, 80);
         }

         return var0 >>> -840517817;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "o.I(" + var0 + 44 + var1 + 41);
      }
   }

   final Object d(int var1) {
      try {
         if (var1 >= -49) {
            return null;
         } else {
            gb++;
            return this.fb;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "o.D(" + var1 + ')');
      }
   }

   static final Class_r a(int var0, Class_r[] var1) {
      try {
         eb++;
         if (var0 > var1.length) {
            throw new IllegalArgumentException();
         } else {
            return Class_jb.a(true, 0, var1, var1.length);
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "o.H(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   Class_o(Object var1) {
      try {
         this.fb = var1;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "o.<init>(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }
}
