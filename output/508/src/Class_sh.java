final class Class_sh {
   int a;
   static int b;
   static int c;
   int d;
   static int e = 0;
   static int f;
   static byte[][] g = new byte[250][];
   static Class_r h = Class_tc.a(43, "blaugr-Un:");
   static int i;
   int j;
   static int k;
   int l;
   static int m;

   static final void a(int var0, long var1) {
      try {
         i++;
         if (var1 != 0L) {
            Class_cj.S.o(98, 42);
            if (var0 != -256) {
               a(-102, 125, 108);
            }

            Class_cj.S.a(true, var1);
            Class_qb.n++;
         }
      } catch (RuntimeException var4) {
         throw a(var4, "sh.C(" + var0 + ',' + var1 + ')');
      }
   }

   static final long a(int var0, int var1, int var2) {
      Class_aa var3 = Class_ck.d[var0][var1][var2];
      return var3 != null && var3.s != null ? var3.s.j : 0L;
   }

   static final void a(int var0) {
      try {
         int var1 = Class_ed.b.b((byte)70);
         m++;
         if (var1 != 0) {
            Class_cj.S.o(122, 67);
            Class_cj.S.b(32, 0);
            int var2 = Class_cj.S.p;
            int var5 = 0;
            Class_fi.u++;
            if (var0 != -14394) {
               a(112);
            }

            Class_kg var3 = (Class_kg)Class_ed.b.e(-98);
            Class_cj.S.a(false, var3.r);
            int var4 = var3.r;

            while ((var3 = (Class_kg)Class_ed.b.e(-104)) != null) {
               if (~var5 > -256 && ~(var4 - -1) == ~var3.r) {
                  var5++;
               } else {
                  Class_cj.S.b(32, var5);
                  var5 = 0;
                  Class_cj.S.a(false, var3.r);
               }

               var4 = var3.r;
            }

            Class_cj.S.b(32, var5);
            Class_cj.S.e(-var2 + Class_cj.S.p, 125);
         }
      } catch (RuntimeException var6) {
         throw a(var6, "sh.A(" + var0 + ')');
      }
   }

   static final Class_ua a(Throwable var0, String var1) {
      try {
         b++;
         Class_ua var2;
         if (var0 instanceof Class_ua) {
            var2 = (Class_ua)var0;
            var2.j = var2.j + ' ' + var1;
         } else {
            var2 = new Class_ua(var0, var1);
         }

         return var2;
      } catch (RuntimeException var3) {
         throw var3;
      }
   }

   public static void b(int var0) {
      try {
         g = null;
         h = null;
         if (var0 <= 121) {
            a(33, 61, 40);
         }
      } catch (RuntimeException var2) {
         throw a(var2, "sh.D(" + var0 + ')');
      }
   }

   static final void c(int var0) {
      try {
         if (var0 != -13401) {
            a(46);
         }

         c++;
         int var1 = Class_gg.d(var0 ^ -13402);
         if (var1 != 0) {
            if (~var1 != -2) {
               Class_vb.a(105, (byte)(Class_ad.l + -4 & 0xFF));
               Class_sa.b(-56, 2);
            } else {
               Class_vb.a(var0 + 13498, (byte)0);
               Class_sa.b(-54, 512);
               Class_ba.a(true);
            }
         } else {
            Class_pe.F = null;
            Class_sa.b(-91, 0);
         }
      } catch (RuntimeException var2) {
         throw a(var2, "sh.E(" + var0 + ')');
      }
   }

   public Class_sh() {
   }

   Class_sh(Class_sh var1) {
      try {
         this.l = var1.l;
         this.j = var1.j;
         this.d = var1.d;
         this.a = var1.a;
      } catch (RuntimeException var3) {
         throw a(var3, "sh.<init>(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }
}
