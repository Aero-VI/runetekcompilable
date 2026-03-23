final class Class_ec extends Class_pe {
   static int I = 0;
   static Class_sg K;
   Class_qe L;
   static Class_r M = Class_tc.a(43, "_");
   static int N;
   static int O = 0;
   static int P = 0;
   static int Q;
   static Class_r R = Class_tc.a(43, "Clientscript error )2 check log for details");
   static int S = 0;

   Class_ec(Class_qe var1) {
      try {
         this.L = var1;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ec.<init>(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   static final void a(Class_a var0, int var1, int var2, int var3) {
      if (var2 < Class_ra.g) {
         Class_aa var4 = Class_ck.d[var1][var2 + 1][var3];
         if (var4 != null && var4.M != null && var4.M.a.b()) {
            var0.a(var4.M.a, 128, 0, 0, true);
         }
      }

      if (var3 < Class_ra.g) {
         Class_aa var5 = Class_ck.d[var1][var2][var3 + 1];
         if (var5 != null && var5.M != null && var5.M.a.b()) {
            var0.a(var5.M.a, 0, 0, 128, true);
         }
      }

      if (var2 < Class_ra.g && var3 < Class_qb.m) {
         Class_aa var6 = Class_ck.d[var1][var2 + 1][var3 + 1];
         if (var6 != null && var6.M != null && var6.M.a.b()) {
            var0.a(var6.M.a, 128, 0, 128, true);
         }
      }

      if (var2 < Class_ra.g && var3 > 0) {
         Class_aa var7 = Class_ck.d[var1][var2 + 1][var3 - 1];
         if (var7 != null && var7.M != null && var7.M.a.b()) {
            var0.a(var7.M.a, 128, 0, -128, true);
         }
      }
   }

   public static void d(int var0) {
      try {
         int var1 = 117 % ((-51 - var0) / 42);
         M = null;
         K = null;
         R = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ec.A(" + var0 + ')');
      }
   }
}
