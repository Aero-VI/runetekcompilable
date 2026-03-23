final class Class_pf {
   static Class_c a = new Class_c();
   static int b;
   static int c;
   static int d;
   static int e;
   static int f = 50;
   static int[] g;
   static Class_r h = Class_tc.a(43, ")1 ");

   static final Class_bb a(byte var0, int var1) {
      try {
         e++;
         Class_bb var2 = (Class_bb)Class_jc.v.a(14366, (long)var1);
         if (var2 != null) {
            return var2;
         } else {
            if (var0 != 53) {
               a = null;
            }

            byte[] var3 = Class_e.h.a(var1, 0, 4);
            var2 = new Class_bb();
            if (var3 != null) {
               var2.a((byte)-64, new Class_lh(var3), var1);
            }

            Class_jc.v.a(var2, var0 + 69, var1);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "pf.D(" + var0 + ',' + var1 + ')');
      }
   }

   static final boolean a(int var0, int var1) {
      try {
         if (var0 != 122) {
            a = null;
         }

         c++;
         return var1 >= 97 && var1 <= 122 || ~var1 <= -66 && ~var1 >= -91;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "pf.A(" + var0 + ',' + var1 + ')');
      }
   }

   static final Class_lh a(int var0) {
      try {
         b++;
         if (var0 != 0) {
            return null;
         } else {
            Class_lh var1 = new Class_lh(24);
            var1.b(32, 3);
            var1.b(32, Class_ha.hd);
            var1.b(32, !Class_d.m ? 0 : 1);
            var1.b(32, Class_bk.P ? 1 : 0);
            var1.b(32, !Class_ng.o ? 0 : 1);
            var1.b(var0 + 32, Class_fc.s ? 1 : 0);
            var1.b(32, Class_r.b ? 1 : 0);
            var1.b(32, !Class_bc.U ? 0 : 1);
            var1.b(var0 + 32, Class_qd.G ? 1 : 0);
            var1.b(var0 ^ 32, !Class_o.hb ? 0 : 1);
            var1.b(var0 + 32, Class_ok.X);
            var1.b(32, Class_dd.Gb ? 1 : 0);
            var1.b(32, !Class_fi.r ? 0 : 1);
            var1.b(var0 ^ 32, !Class_gk.k ? 0 : 1);
            var1.b(32, Class_lj.m);
            var1.b(var0 ^ 32, !Class_mg.a ? 0 : 1);
            var1.b(32, Class_sf.d);
            var1.b(32, Class_oj.Y);
            var1.b(32, Class_tf.V);
            var1.a(false, Class_od.g);
            var1.a(false, Class_ij.e);
            var1.b(32, Class_ma.Y ? 1 : 0);
            return var1;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "pf.C(" + var0 + ')');
      }
   }

   public static void a(byte var0) {
      try {
         h = null;
         int var1 = -64 % ((33 - var0) / 51);
         g = null;
         a = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "pf.B(" + var0 + ')');
      }
   }
}
