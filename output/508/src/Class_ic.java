final class Class_ic extends Class_pe {
   static int I = 0;
   static int J;
   int L;
   static Class_r M = Class_tc.a(43, ":");
   static int N = 0;
   static int O;
   static int P;
   static int Q;
   static int R;
   Class_r S;
   static int T;

   final int d(int var1) {
      try {
         P++;
         if (var1 != -1597153401) {
            this.c((byte)-37);
         }

         return (int)super.a;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ic.F(" + var1 + 41);
      }
   }

   final void e(int var1) {
      try {
         O++;
         super.v |= -9223372036854775808L;
         if (var1 == this.f(var1 + 255)) {
            Class_ed.k.a(var1 ^ 75, this);
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ic.G(" + var1 + ')');
      }
   }

   final long f(int var1) {
      try {
         if (var1 != 255) {
            M = null;
         }

         R++;
         return super.v & 9223372036854775807L;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ic.D(" + var1 + ')');
      }
   }

   public static void a(boolean var0) {
      try {
         if (var0) {
            N = 85;
         }

         M = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ic.B(" + var0 + ')');
      }
   }

   static final void a(int var0, byte var1, int var2) {
      try {
         Q++;
         Class_c var3 = Class_ha.od[Class_jk.F][var0][var2];
         if (var3 == null) {
            Class_mh.d(Class_jk.F, var0, var2);
         } else {
            if (var1 != -52) {
               a(-71, (byte)-68, -62);
            }

            int var4 = -99999999;
            Class_wc var6 = (Class_wc)var3.e((byte)76);

            Class_wc var5;
            for (var5 = null; var6 != null; var6 = (Class_wc)var3.c((byte)67)) {
               Class_cf var7 = Class_ra.a(-25672, var6.J.r);
               int var8 = var7.W;
               if (~var7.cb == -2) {
                  var8 *= 1 + var6.J.w;
               }

               if (~var4 > ~var8) {
                  var4 = var8;
                  var5 = var6;
               }
            }

            if (var5 == null) {
               Class_mh.d(Class_jk.F, var0, var2);
            } else {
               var3.a((byte)43, var5);
               var6 = (Class_wc)var3.e((byte)76);
               Class_fc var14 = null;

               Class_fc var13;
               for (var13 = null; var6 != null; var6 = (Class_wc)var3.c((byte)-125)) {
                  Class_fc var9 = var6.J;
                  if (~var9.r != ~var5.J.r) {
                     if (var13 == null) {
                        var13 = var9;
                     }

                     if (var13.r != var9.r && var14 == null) {
                        var14 = var9;
                     }
                  }
               }

               long var15 = 1610612736 + (var2 << -1597153401) + var0;
               Class_vc.a(Class_jk.F, var0, var2, Class_fa.a(var0 * 128 + 64, Class_jk.F, 128 * var2 - -64, false), var5.J, var15, var13, var14);
            }
         }
      } catch (RuntimeException var11) {
         throw Class_sh.a(var11, "ic.E(" + var0 + ',' + var1 + ',' + var2 + ')');
      }
   }

   Class_ic(int var1, int var2) {
      try {
         super.a = (long)var1 << -221728608 | var2;
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "ic.<init>(" + var1 + ',' + var2 + ')');
      }
   }

   final void c(byte var1) {
      try {
         int var2 = 17 / ((var1 - 9) / 37);
         super.v = -9223372036854775808L & super.v | 500L + Class_fj.a(17161);
         Class_l.o.a(124, this);
         T++;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ic.C(" + var1 + ')');
      }
   }

   final int b(boolean var1) {
      try {
         J++;
         if (var1) {
            a(true);
         }

         return (int)(255L & super.a >>> -1198268384);
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ic.A(" + var1 + 41);
      }
   }
}
