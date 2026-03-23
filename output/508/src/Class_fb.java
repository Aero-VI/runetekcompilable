final class Class_fb {
   static int a;
   static int b = 0;
   static int c = 0;
   static int d;
   static short[] e = new short[256];
   static int f;
   static Class_od g = new Class_od();
   static Class_r[] h = new Class_r[500];
   static Class_sg i;
   static int[][][] j;
   static Class_r k = Class_tc.a(43, " loggt sich aus)3");
   static Class_r l = Class_tc.a(43, "");
   static boolean m;
   static int n;
   static int o;
   static volatile int p = 0;

   public static void a(byte var0) {
      try {
         j = null;
         if (var0 < 125) {
            i = null;
         }

         h = null;
         k = null;
         l = null;
         g = null;
         i = null;
         e = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "fb.B(" + var0 + ')');
      }
   }

   static final synchronized byte[] a(int var0, byte var1) {
      try {
         f++;
         if (var1 != -85) {
            return null;
         } else if (~var0 == -101 && Class_l.B > 0) {
            byte[] var5 = Class_th.n[--Class_l.B];
            Class_th.n[Class_l.B] = null;
            return var5;
         } else if (~var0 == -5001 && Class_li.o > 0) {
            byte[] var4 = Class_sh.g[--Class_li.o];
            Class_sh.g[Class_li.o] = null;
            return var4;
         } else if (var0 == 30000 && ~Class_ui.c < -1) {
            byte[] var2 = Class_pi.ib[--Class_ui.c];
            Class_pi.ib[Class_ui.c] = null;
            return var2;
         } else {
            return new byte[var0];
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "fb.C(" + var0 + ',' + var1 + ')');
      }
   }

   static final void a(int var0, int var1, Class_ha var2, int var3, int var4, Class_jb var5, int var6) {
      try {
         d++;
         if (var5 != null) {
            int var7 = 2047 & Class_ok.eb + Class_ba.z;
            int var8 = Math.max(var2.Gc / 2, var2.nc / 2) - -10;
            int var9 = var4 * var4 - -(var0 * var0);
            if (~(var8 * var8) <= ~var9) {
               int var10 = Class_kd.e[var7];
               int var11 = Class_kd.q[var7];
               var11 = var11 * 256 / (256 + Class_uf.W);
               var10 = 256 * var10 / (Class_uf.W - -256);
               if (var1 <= -23) {
                  int var12 = var11 * var4 + var10 * var0 >> -11489424;
                  int var13 = -(var4 * var10) + var0 * var11 >> -1721779952;
                  ((Class_ni)var5).a(var12 + var3 + var2.Gc / 2 - var5.M / 2, -(var5.U / 2) + var6 + var2.nc / 2 + -var13, var2.Ub, var2.B);
               }
            }
         }
      } catch (RuntimeException var14) {
         throw Class_sh.a(
            var14,
            "fb.A("
               + var0
               + ','
               + var1
               + ','
               + (var2 != null ? "{...}" : "null")
               + ','
               + var3
               + ','
               + var4
               + ','
               + (var5 != null ? "{...}" : "null")
               + ','
               + var6
               + ')'
         );
      }
   }
}
