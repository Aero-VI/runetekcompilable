final class Class_uh {
   static int a;
   static Class_r b = Class_uh.g;
   static int c;
   static int d;
   static int[] e;
   static int f;
   private static Class_r g = Class_tc.a(43, "Examine");

   static final void a(int var0, int[][] var1) {
      try {
         Class_qd.p = var1;
         if (var0 != 128) {
            a(-15, -16, 76, null);
         }

         c++;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "uh.E(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   public static void a(int var0) {
      try {
         b = null;
         g = null;
         e = null;
         if (var0 >= -32) {
            a(97, -124, 127, null);
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "uh.A(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void b(int var0) {
      int var3 = client.lb;

      try {
         int var1 = 0;
         if (var3 == 0 && Class_jd.a <= var1) {
            int var6 = -112 % ((var0 - -72) / 51);
            a++;
            Class_g.a = new Class_tg(16);
         } else {
            do {
               Class_ek var2 = Class_ob.b(-85, var1);
               if (var2 != null && ~var2.e == -1) {
                  Class_ad.g[var1] = 0;
                  Class_sb.i[var1] = 0;
               }
            } while (Class_jd.a > ++var1);

            int var5 = -112 % ((var0 - -72) / 51);
            a++;
            Class_g.a = new Class_tg(16);
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "uh.C(" + var0 + ')');
      }
   }

   static final Class_jb a(int var0, int var1, int var2, Class_cj var3) {
      try {
         f++;
         if (var0 != 64) {
            return null;
         } else {
            return !Class_ve.a(-29381, var1, var3, var2) ? null : Class_oe.c((byte)-109);
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "uh.D(" + var0 + ',' + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
      }
   }

   static final void a(int var0, int var1, int var2, int var3, Class_a var4, Class_a var5, int var6, int var7, long var8) {
      if (var4 != null || var5 != null) {
         Class_kk var10 = new Class_kk();
         var10.j = var8;
         var10.h = var1 * 128 + 64;
         var10.a = var2 * 128 + 64;
         var10.k = var3;
         var10.f = var4;
         var10.i = var5;
         var10.l = var6;
         var10.b = var7;

         for (int var11 = var0; var11 >= 0; var11--) {
            if (Class_ck.d[var11][var1][var2] == null) {
               Class_ck.d[var11][var1][var2] = new Class_aa(var11, var1, var2);
            }
         }

         Class_ck.d[var0][var1][var2].s = var10;
      }
   }
}
