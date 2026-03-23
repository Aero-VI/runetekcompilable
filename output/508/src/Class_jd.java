final class Class_jd {
   static int a;
   static int b;
   static int c = 0;
   static Class_r d = Class_tc.a(43, " weitere Optionen");
   static int e;
   static int f;
   static short[][] g;
   static Class_r h = Class_tc.a(43, "Mem:");
   static int i = 0;

   public static void a(boolean var0) {
      try {
         h = null;
         g = null;
         if (var0) {
            d = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "jd.B(" + var0 + ')');
      }
   }

   static final Class_r a(long var0, int var2) {
      try {
         b++;
         if (~var0 >= -1L || ~var0 <= -6582952005840035282L) {
            return null;
         } else if (~(var0 % 37L) == -1L) {
            return null;
         } else {
            int var3 = 0;

            for (long var4 = var0; var4 != 0L; var4 /= 37L) {
               var3++;
            }

            byte[] var6 = new byte[var3];

            while (var0 != 0L) {
               long var7 = var0;
               var0 /= 37L;
               var6[--var3] = Class_ng.x[(int)(var7 + -(var0 * 37L))];
            }

            Class_r var10 = new Class_r();
            var10.h = var6;
            var10.G = var6.length;
            if (var2 != -1) {
               c = -3;
            }

            return var10;
         }
      } catch (RuntimeException var9) {
         throw Class_sh.a(var9, "jd.A(" + var0 + ',' + var2 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(byte var0) {
      int var2 = client.lb;

      try {
         e++;
         if (~Class_hj.bb != 0) {
            Class_gk.a(Class_hj.bb, -1);
         }

         int var1 = 0;
         if (var2 != 0) {
            if (Class_vb.j[var1]) {
               Class_n.u[var1] = true;
            }

            Class_ae.f[var1] = Class_vb.j[var1];
            Class_vb.j[var1] = false;
            var1++;
         }

         while (~var1 > ~c) {
            if (Class_vb.j[var1]) {
               Class_n.u[var1] = true;
            }

            Class_ae.f[var1] = Class_vb.j[var1];
            Class_vb.j[var1] = false;
            var1++;
         }

         Class_ai.F = -1;
         Class_u.bb = Class_be.C;
         Class_c.x = -1;
         if (var0 != 46) {
            a((byte)-24);
         }

         Class_ad.a = null;
         if (Class_hj.bb != -1) {
            c = 0;
            Class_pe.a(0, 0, Class_fk.R, 0, Class_hj.bb, -1, 0, Class_l.u, (byte)-112);
         }

         Class_nc.a();
         Class_sj.k = 0;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "jd.D(" + var0 + ')');
      }
   }

   static final boolean a(Class_cj var0, int var1, int var2) {
      try {
         if (var1 != -1) {
            i = -32;
         }

         f++;
         byte[] var3 = var0.f(0, var2);
         if (var3 == null) {
            return false;
         } else {
            Class_og.a(14432, var3);
            return true;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "jd.C(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ')');
      }
   }
}
