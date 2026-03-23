final class Class_lc {
   static Class_vf a = new Class_vf();
   static int b;
   static int c;
   static Class_cj d;
   static int e;
   static int f;

   public static void a(int var0) {
      try {
         if (var0 == 0) {
            a = null;
            d = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "lc.C(" + var0 + ')');
      }
   }

   static final Class_ha a(int var0, boolean var1, int var2) {
      try {
         if (var1) {
            a = null;
         }

         Class_ha var3 = Class_tf.a(var0, (byte)-80);
         c++;
         if (~var2 == 0) {
            return var3;
         } else {
            return var3 != null && var3.n != null && ~var3.n.length < ~var2 ? var3.n[var2] : null;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "lc.A(" + var0 + ',' + var1 + ',' + var2 + ')');
      }
   }

   static final void a(int var0, int var1, int var2) {
      try {
         Class_ad.g[var2] = var1;
         Class_lk var3 = (Class_lk)Class_g.a.a(var2, -88);
         e++;
         int var4 = 124 % ((var0 - -11) / 61);
         if (var3 != null) {
            if (var3.s != 4611686018427387905L) {
               var3.s = 4611686018427387904L | Class_fj.a(17161) - -500L;
               return;
            }
         } else {
            var3 = new Class_lk(4611686018427387905L);
            Class_g.a.a((byte)-57, var3, var2);
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "lc.B(" + var0 + ',' + var1 + ',' + var2 + ')');
      }
   }
}
