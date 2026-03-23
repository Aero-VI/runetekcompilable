import java.awt.Frame;

final class Class_fc extends Class_a {
   static Frame p;
   static int[][] q;
   int r;
   static boolean s = true;
   static Class_dd t;
   static int u;
   static int v = 0;
   int w;
   static int x;
   static int y;
   private int z = -32768;
   static int A;
   static int B;
   static Class_pc[] C;

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      try {
         Class_jh var11 = Class_ra.a(-25672, this.r).a(this.w, null, 0, 13895);
         y++;
         if (var11 != null) {
            var11.a(var1, var2, var3, var4, var5, var6, var7, var8, var9);
            this.z = var11.a();
         }
      } catch (RuntimeException var12) {
         throw Class_sh.a(var12, "fc.A(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ')');
      }
   }

   public static void c(int var0) {
      try {
         if (var0 != 31756) {
            s = true;
         }

         p = null;
         q = null;
         C = null;
         t = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "fc.E(" + var0 + ')');
      }
   }

   static final void d(int var0) {
      try {
         Class_lj.i.e((byte)87);
         B++;
         if (var0 > -122) {
            d(111);
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "fc.C(" + var0 + ')');
      }
   }

   final int a() {
      try {
         u++;
         return this.z;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "fc.D(" + 41);
      }
   }
}
