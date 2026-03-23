final class Class_f extends Class_lf {
   static int Q;
   static int R;
   static int S;
   static Class_cc T = new Class_cc(5000);
   static Class_qc U = new Class_qc(64);
   static int V;
   static int W;
   static Class_tg X = new Class_tg(32);
   static Class_r Y = Class_tc.a(43, "Standort");
   static Class_r Z = Class_tc.a(43, "T");

   static final boolean b(int var0, int var1) {
      try {
         if (var0 != 0) {
            return false;
         } else {
            R++;
            return (1 & var1 >> 586962909) != 0;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "f.C(" + var0 + ',' + var1 + ')');
      }
   }

   final int[] a(byte var1, int var2) {
      try {
         W++;
         if (var1 != -61) {
            this.a((byte)-99, 53);
         }

         int[] var3 = super.H.a(false, var2);
         if (super.H.s) {
            Class_gb.a(var3, 0, Class_ld.X, Class_l.y[var2]);
         }

         return var3;
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "f.G(" + var1 + ',' + var2 + ')');
      }
   }

   public Class_f() {
      super(0, true);
   }

   static final Class_r a(int var0, Class_lh var1, int var2) {
      try {
         S++;

         try {
            Class_r var3 = new Class_r();
            var3.G = var1.f(255);
            if (var3.G > var2) {
               var3.G = var2;
            }

            var3.h = new byte[var3.G];
            var1.p = var1.p + Class_md.w.a(var3.h, var0 + 8, var1.p, var3.G, var0, var1.E);
            return var3;
         } catch (Exception var4) {
            return Class_aa.w;
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "f.D(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
      }
   }

   public static void g(int var0) {
      try {
         X = null;
         U = null;
         Z = null;
         if (var0 != 9071) {
            X = null;
         }

         Y = null;
         T = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "f.B(" + var0 + ')');
      }
   }
}
