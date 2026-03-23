import java.awt.Component;

abstract class Class_qb {
   static Class_uf a;
   static int b;
   private static Class_r c = Class_tc.a(43, "Loaded sprites");
   static Class_r d = Class_tc.a(43, "Hidden)2use");
   static int e;
   private static Class_r f = Class_tc.a(43, "flash3:");
   static int g;
   static int h;
   static Class_r i = Class_tc.a(43, "<col=80ff00>");
   static long[] j = new long[100];
   static int k;
   static Class_r l = Class_tc.a(43, "Lade Texturen )2 ");
   static int m;
   static int n;
   static Class_r o = f;
   static int p;
   static Class_r q = c;
   static Class_r r = f;

   abstract int a(boolean var1);

   abstract void a(int var1, Component var2);

   public static void a(int var0) {
      try {
         q = null;
         r = null;
         f = null;
         l = null;
         a = null;
         o = null;
         d = null;
         if (var0 == 1) {
            i = null;
            j = null;
            c = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "qb.C(" + var0 + ')');
      }
   }

   static final void a(int var0, int var1, boolean var2, int var3, int var4) {
      try {
         g++;
         Class_cj.S.p = 0;
         Class_cj.S.b(32, 85);
         Class_cj.S.b(32, var0);
         Class_cj.S.b(32, var1);
         Class_cj.S.a(false, var3);
         Class_cj.S.a(false, var4);
         if (!var2) {
            a(85, -77, true, 110, 112);
         }

         Class_kk.o = 0;
         Class_hg.c = -3;
         Class_of.i = 0;
         Class_pi.rb = 1;
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "qb.D(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
      }
   }

   static final void b(int var0) {
      try {
         Class_hk.G.a(-37);
         h++;
         if (var0 < 60) {
            c = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "qb.E(" + var0 + ')');
      }
   }

   public Class_qb() {
   }

   abstract void a(Component var1, boolean var2);
}
