final class Class_lg {
   static Class_r a = Class_tc.a(43, ")3)3)3");
   static Class_r b = Class_lg.f;
   private static Class_r c = Class_tc.a(43, " is already on your ignore list)3");
   static int d;
   static boolean e = false;
   private static Class_r f = Class_tc.a(43, "Loaded input handler");
   static int g;
   static Class_r h = c;
   static int i;
   static int j;
   static int k;
   static int l;

   public static void a(int var0) {
      try {
         a = null;
         if (var0 == 988656400) {
            f = null;
            b = null;
            h = null;
            c = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "lg.C(" + var0 + ')');
      }
   }

   static final void b(int var0) {
      try {
         d++;
         Class_od var1 = Class_fb.g;
         synchronized (var1) {
            Class_ch.o++;
            Class_mi.T = client.Y;
            Class_pj.c = Class_ti.t;
            Class_bh.k = Class_qj.R;
            Class_eb.d = Class_vd.f;
            Class_vh.rb = Class_bg.c;
            Class_wb.i = Class_he.j;
            Class_fh.T = Class_i.lb;
            Class_vd.f = 0;
         }

         if (var0 != -1) {
            a = null;
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "lg.D(" + var0 + ')');
      }
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
      try {
         g++;
         if (~var6 <= -129 && var3 >= 128 && ~var6 >= -13057 && ~var3 >= -13057) {
            if (var7 >= -122) {
               f = null;
            }

            int var8 = -var4 + Class_fa.a(var6, Class_jk.F, var3, false);
            int var10 = Class_kd.q[Class_hc.a];
            int var12 = Class_kd.q[Class_mg.j];
            var6 -= Class_gg.D;
            int var9 = Class_kd.e[Class_hc.a];
            var8 -= Class_ef.s;
            int var11 = Class_kd.e[Class_mg.j];
            var3 -= Class_oc.l;
            int var13 = var3 * var11 - -(var12 * var6) >> 988656400;
            var3 = var12 * var3 + -(var6 * var11) >> 2006409232;
            var6 = var13;
            var13 = var10 * var8 + -(var3 * var9) >> -1697007760;
            var3 = var8 * var9 + var3 * var10 >> -881511344;
            if (~var3 <= -51) {
               Class_od.l = (var13 << 1769409001) / var3 + var2;
               Class_th.b = var5 + (var13 << -1247133719) / var3;
            } else {
               Class_th.b = -1;
               Class_od.l = -1;
            }
         } else {
            Class_th.b = -1;
            Class_od.l = -1;
         }
      } catch (RuntimeException var14) {
         throw Class_sh.a(var14, "lg.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
      }
   }

   static final Class_pc a(Class_cj var0, int var1, int var2) {
      try {
         j++;
         if (!Class_jd.a(var0, -1, var1)) {
            return null;
         } else {
            if (var2 != -30509) {
               f = null;
            }

            return Class_mg.c(var2 + 30509);
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "lg.A(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ')');
      }
   }
}
