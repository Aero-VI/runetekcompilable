final class Class_sf {
   static Class_jk a;
   static int b = 1;
   static Class_r c = Class_tc.a(43, ")1");
   static int d = 127;
   static double e = -1.0;
   static Class_tg f = new Class_tg(512);
   static int g = 0;
   static int h;
   static int i;
   static int j;
   static Class_r k = Class_tc.a(43, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");
   static int[] l = new int[2000];
   static Class_r m = Class_tc.a(43, "Schrifts-=tze geladen)3");

   static final int[] a(int[] var0, int var1) {
      try {
         j++;
         if (var1 > -28) {
            return null;
         } else if (var0 == null) {
            return null;
         } else {
            int[] var2 = new int[var0.length];
            Class_gb.a(var0, 0, var2, 0, var0.length);
            return var2;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "sf.A(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
      }
   }

   static final int a(int var0, boolean var1) {
      try {
         if (var1) {
            a(30);
         }

         h++;
         return 0xFF & var0;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "sf.C(" + var0 + 44 + var1 + 41);
      }
   }

   public static void a(int var0) {
      try {
         a = null;
         k = null;
         l = null;
         if (var0 != 0) {
            a = null;
         }

         c = null;
         f = null;
         m = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "sf.D(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(byte var0) {
      int var6 = client.lb;

      try {
         int var1 = -62 / (-var0 / 39);
         i++;
         Class_ci var2 = (Class_ci)Class_ha.Ac.e((byte)76);
         if (var6 != 0 || var2 != null) {
            do {
               label74: {
                  Class_b var3 = var2.I;
                  if (var3.Z != Class_jk.F || ~var3.L > ~Class_be.C) {
                     var2.c(-17554);
                     if (var6 == 0) {
                        break label74;
                     }
                  }

                  if (Class_be.C >= var3.w) {
                     if (~var3.U < -1) {
                        Class_eh var4 = Class_rf.a[var3.U + -1];
                        if (var4 != null && var4.hb >= 0 && var4.hb < 13312 && ~var4.J <= -1 && var4.J < 13312) {
                           var3.a(var4.hb, (byte)-8, var4.J, Class_fa.a(var4.hb, var3.Z, var4.J, false) - var3.X, Class_be.C);
                        }
                     }

                     if (var3.U < 0) {
                        int var5 = -1 + -var3.U;
                        Class_fa var8;
                        if (Class_kg.A != var5) {
                           var8 = Class_db.Q[var5];
                           if (var6 != 0) {
                              var8 = Class_gg.B;
                           }
                        } else {
                           var8 = Class_gg.B;
                        }

                        if (var8 != null && ~var8.hb <= -1 && var8.hb < 13312 && ~var8.J <= -1 && ~var8.J > -13313) {
                           var3.a(var8.hb, (byte)-103, var8.J, Class_fa.a(var8.hb, var3.Z, var8.J, false) + -var3.X, Class_be.C);
                        }
                     }

                     var3.a(Class_sj.k, false);
                     Class_ci.a(Class_jk.F, (int)var3.J, (int)var3.B, (int)var3.t, 60, var3, var3.K, -1L, false);
                  }
               }

               var2 = (Class_ci)Class_ha.Ac.c((byte)10);
            } while (var2 != null);
         }
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "sf.B(" + var0 + ')');
      }
   }
}
