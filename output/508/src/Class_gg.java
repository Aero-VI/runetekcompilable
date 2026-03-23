final class Class_gg extends Class_li {
   static int p;
   boolean[] q;
   private int r;
   static int s;
   static int t;
   int[] u;
   static Class_wh v = new Class_wh();
   int[][] w;
   static int x;
   int y;
   static Class_r z = Class_tc.a(43, "null");
   static int A;
   static Class_fa B;
   static Class_r C = Class_gg.E;
   static int D;
   private static Class_r E = Class_tc.a(43, "Prepared sound engine");

   static final void a(Class_af var0, int var1) {
      try {
         x++;
         var0.c(Class_he.h, Class_l.u / 2, Class_fk.R / 2 + -26, 16777215, -1);
         int var2 = Class_fk.R / 2 + -18;
         if (var1 != -27931) {
            b(false, (byte)82);
         }

         Class_nc.a(Class_l.u / 2 - 152, var2, 304, 34, 9179409);
         Class_nc.a(Class_l.u / 2 - 151, var2 - -1, 302, 32, 0);
         Class_nc.f(-150 + Class_l.u / 2, 2 + var2, Class_rg.Q * 3, 30, 9179409);
         Class_nc.f(-150 + (Class_l.u / 2 - -(3 * Class_rg.Q)), var2 - -2, 300 + -(Class_rg.Q * 3), 30, 0);
         var0.c(Class_wj.v, Class_l.u / 2, 4 + Class_fk.R / 2, 16777215, -1);
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "gg.B(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
      }
   }

   static final int d(int var0) {
      try {
         s++;
         if (Class_kh.b) {
            return 0;
         } else {
            if (var0 != 1) {
               z = null;
            }

            if (!Class_e.a(24781)) {
               return 1;
            } else {
               return !Class_bk.P ? 1 : 2;
            }
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "gg.E(" + var0 + 41);
      }
   }

   static final void a(Class_cj var0, int var1) {
      try {
         if (var1 == -5545) {
            Class_lj.p = var0.a(Class_ek.j, (byte)-84);
            A++;
            Class_qe.K = var0.a(Class_wa.k, (byte)-125);
            Class_cd.bb = var0.a(Class_cc.bc, (byte)-127);
            Class_pi.ob = var0.a(Class_od.e, (byte)-103);
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "gg.D(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
      }
   }

   public static void e(int var0) {
      try {
         v = null;
         if (var0 != 304) {
            d(-74);
         }

         E = null;
         z = null;
         C = null;
         B = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "gg.A(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void f(int var0) {
      int var5 = client.lb;

      try {
         int var1 = -1;
         int var2 = -71 / ((-81 - var0) / 38);
         if (var5 == 0 && client.ib <= var1) {
            t++;
         } else {
            do {
               int var3;
               if (~var1 != 0) {
                  var3 = Class_oc.q[var1];
                  if (var5 != 0) {
                     var3 = 2047;
                  }
               } else {
                  var3 = 2047;
               }

               Class_fa var4 = Class_db.Q[var3];
               if (var4 != null) {
                  Class_hh.a(var4, 128, var4.Q);
               }
            } while (client.ib > ++var1);

            t++;
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "gg.F(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void b(boolean var0, byte var1) {
      int var8 = client.lb;

      try {
         if (var1 == 84) {
            byte[][] var2 = Class_kj.T;
            int var3 = Class_d.b.length;
            int var4 = 0;
            if (var8 == 0 && var4 >= var3) {
               p++;
            } else {
               do {
                  byte[] var5 = var2[var4];
                  if (var5 != null) {
                     int var6 = -Class_fj.e + 64 * (Class_uh.e[var4] >> 1554965704);
                     int var7 = (Class_uh.e[var4] & 0xFF) * 64 - Class_va.ab;
                     Class_hf.c(var1 ^ 16278);
                     Class_jc.a(var6, var7, var5, var0, Class_sj.j, false);
                  }
               } while (++var4 < var3);

               p++;
            }
         }
      } catch (RuntimeException var9) {
         throw Class_sh.a(var9, "gg.C(" + var0 + ',' + var1 + ')');
      }
   }

   Class_gg(int var1, byte[] var2) {
      try {
         this.y = var1;
         Class_lh var3 = new Class_lh(var2);
         this.r = var3.n(-6677);
         this.q = new boolean[this.r];
         this.w = new int[this.r][];
         this.u = new int[this.r];

         for (int var4 = 0; var4 < this.r; var4++) {
            this.u[var4] = var3.n(-6677);
         }

         for (int var5 = 0; ~this.r < ~var5; var5++) {
            this.q[var5] = ~var3.n(-6677) == -2;
         }

         for (int var6 = 0; var6 < this.r; var6++) {
            this.w[var6] = new int[var3.n(-6677)];
         }

         for (int var7 = 0; ~this.r < ~var7; var7++) {
            for (int var8 = 0; ~var8 > ~this.w[var7].length; var8++) {
               this.w[var7][var8] = var3.n(-6677);
            }
         }
      } catch (RuntimeException var9) {
         throw Class_sh.a(var9, "gg.<init>(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
      }
   }
}
