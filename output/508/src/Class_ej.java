import java.awt.Component;

final class Class_ej extends Class_ff {
   private int L;
   private static Class_dg M;

   final void a(int var1) throws Exception {
      if (var1 > 32768) {
         throw new IllegalArgumentException();
      } else {
         M.a(var1, false, this.L);
      }
   }

   final void c() {
      M.a(this.L, 92);
   }

   final void a() {
      M.a(this.L, super.x);
   }

   public static void e() {
      M = null;
   }

   final int b() {
      return M.a((byte)94, this.L);
   }

   Class_ej(Class_ik var1, int var2) {
      M = var1.b(0);
      this.L = var2;
   }

   final void a(Component var1) throws Exception {
      M.a(Class_pd.a, Class_aj.p, var1, (byte)-23);
   }

   final void d() {
      M.b((byte)-117, this.L);
   }
}
