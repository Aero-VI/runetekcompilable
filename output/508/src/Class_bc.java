final class Class_bc extends Class_lf {
   static int Q;
   static int R;
   static Class_r S = Class_tc.a(43, "leuchten1:");
   static Class_qc T = new Class_qc(260);
   static boolean U = true;
   static int V;
   static int W;
   static Class_dh[] X;

   static final Class_ig b(int var0, byte var1) {
      try {
         V++;
         Class_ig var2 = (Class_ig)Class_cc.Lb.a(14366, (long)var0);
         if (var1 != -128) {
            return null;
         } else if (var2 != null) {
            return var2;
         } else {
            byte[] var3 = Class_e.e.a(var0, var1 + 128, 1);
            var2 = new Class_ig();
            if (var3 != null) {
               var2.a(var1 ^ -128, var0, new Class_lh(var3));
            }

            Class_cc.Lb.a(var2, 119, var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "bc.E(" + var0 + ',' + var1 + ')');
      }
   }

   public static void d(byte var0) {
      try {
         X = null;
         if (var0 != -47) {
            T = null;
         }

         T = null;
         S = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "bc.B(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int[] a(byte var1, int var2) {
      int var6 = client.lb;

      try {
         Q++;
         int[] var3 = super.H.a(false, var2);
         if (super.H.s) {
            int var4 = Class_l.y[var2];
            int var5 = 0;
            if (var6 != 0 || ~var5 > ~Class_ld.X) {
               do {
                  var3[var5] = this.d(-113, var4, Class_ce.gb[var5]) % 4096;
               } while (~(++var5) > ~Class_ld.X);
            }
         }

         return var1 != -61 ? null : var3;
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "bc.G(" + var1 + ',' + var2 + ')');
      }
   }

   private final int d(int var1, int var2, int var3) {
      try {
         W++;
         int var4 = var2 * 57 + var3;
         int var5 = -69 % ((var1 - 4) / 40);
         var4 ^= var4 << -2090844671;
         return -((2147483647 & (789221 + 15731 * var4 * var4) * var4 + 1376312589) / 262144) + 4096;
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "bc.C(" + var1 + 44 + var2 + 44 + var3 + 41);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final int a(boolean var0, int var1) {
      int var7 = client.lb;

      try {
         R++;
         long var2 = Class_fj.a(17161);
         Class_lk var4 = var0 ? (Class_lk)Class_g.a.a(-32642) : (Class_lk)Class_g.a.a((byte)-118);
         int var5 = 78 / ((-52 - var1) / 58);
         if (var7 == 0 && var4 == null) {
            return -1;
         } else {
            do {
               if ((var4.s & 4611686018427387903L) < var2) {
                  if ((4611686018427387904L & var4.s) != 0L) {
                     int var6 = (int)var4.a;
                     Class_sb.i[var6] = Class_ad.g[var6];
                     var4.c(-17554);
                     return var6;
                  }

                  var4.c(-17554);
               }

               var4 = (Class_lk)Class_g.a.a((byte)-108);
            } while (var4 != null);

            return -1;
         }
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "bc.D(" + var0 + 44 + var1 + 41);
      }
   }

   public Class_bc() {
      super(0, true);
   }
}
