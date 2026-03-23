final class Class_ae {
   static int a;
   static int b;
   static int c;
   static int d = 0;
   static Class_r e = Class_tc.a(43, "(U2");
   static boolean[] f = new boolean[100];
   static int[] g;
   static int h;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final Class_uf a(Class_lh var0, int var1) {
      int var5 = client.lb;

      try {
         h++;
         Class_uf var2 = new Class_uf(var0.e(127), var0.e(var1 + 126), var0.k(1355769544), var0.k(1355769544), var0.h(-5528), var1 == var0.n(-6677));
         int var3 = var0.n(-6677);
         int var4 = 0;
         if (var5 == 0 && var3 <= var4) {
            var2.d(var1 ^ 12801);
            return var2;
         } else {
            do {
               var2.gb.a(new Class_dc(var0.k(1355769544), var0.k(1355769544), var0.k(1355769544), var0.k(1355769544)), true);
            } while (var3 > ++var4);

            var2.d(var1 ^ 12801);
            return var2;
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "ae.A(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
      }
   }

   static final int a(int var0, int var1, int var2) {
      try {
         b++;
         if (~var2 == 0) {
            return 12345678;
         } else {
            var1 = var1 * (var2 & 127) >> 1673451751;
            if (var1 >= var0) {
               if (var1 <= 126) {
                  return (var2 & 65408) + var1;
               }

               var1 = 126;
               if (client.lb == 0) {
                  return (var2 & 65408) + var1;
               }
            }

            var1 = 2;
            return (var2 & 65408) + var1;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "ae.B(" + var0 + 44 + var1 + 44 + var2 + 41);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, int var1) {
      int var3 = client.lb;

      try {
         Class_kg var2 = (Class_kg)Class_sf.f.a(-32642);
         if (var3 == 0 && var2 == null) {
            if (var1 == 2) {
               a++;
            }
         } else {
            do {
               if ((65535L & var2.a >> 950968368) == var0) {
                  var2.c(-17554);
               }

               var2 = (Class_kg)Class_sf.f.a((byte)-119);
            } while (var2 != null);

            if (var1 == 2) {
               a++;
            }
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "ae.E(" + var0 + ',' + var1 + ')');
      }
   }

   public static void a(boolean var0) {
      try {
         if (!var0) {
            a(-40);
         }

         g = null;
         f = null;
         e = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ae.C(" + var0 + ')');
      }
   }

   static final void a(int var0) {
      try {
         c++;
         if (var0 != -26678) {
            e = null;
         }

         Class_f.U.a(-6);
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ae.D(" + var0 + ')');
      }
   }
}
