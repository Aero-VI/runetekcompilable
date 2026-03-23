final class Class_kf extends Class_hg {
   private static Class_r p = Class_tc.a(43, "Dec");
   private static Class_r q = Class_tc.a(43, "Oct");
   private static Class_r r = Class_tc.a(43, "Aug");
   static int s;
   static int t;
   private static Class_r u = Class_tc.a(43, "Mar");
   private int v;
   static Class_cj w;
   private static Class_r x = Class_tc.a(43, "Apr");
   static int y;
   private static Class_r z = Class_tc.a(43, "Jun");
   static Class_r[] A = new Class_r[]{Class_kf.M, Class_kf.L, u, x, Class_kf.G, z, Class_kf.D, r, Class_kf.E, q, Class_kf.K, p};
   private int B;
   private long C;
   private static Class_r D = Class_tc.a(43, "Jul");
   private static Class_r E = Class_tc.a(43, "Sep");
   static int F = 1;
   private static Class_r G = Class_tc.a(43, "May");
   private int H;
   static int I;
   private long[] J;
   private static Class_r K = Class_tc.a(43, "Nov");
   private static Class_r L = Class_tc.a(43, "Feb");
   private static Class_r M = Class_tc.a(43, "Jan");
   private int N;

   static final int a(int var0, byte var1) {
      try {
         if (var1 != 65) {
            return 78;
         } else {
            t++;
            return 127 & var0;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "kf.D(" + var0 + 44 + var1 + 41);
      }
   }

   public static void b(int var0) {
      try {
         if (var0 != 25) {
            L = null;
         }

         A = null;
         L = null;
         u = null;
         q = null;
         M = null;
         r = null;
         p = null;
         w = null;
         D = null;
         E = null;
         x = null;
         z = null;
         K = null;
         G = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "kf.B(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final void a(boolean var1) {
      int var3 = client.lb;

      try {
         int var2 = 0;
         if (var3 != 0) {
            this.J[var2] = 0L;
            var2++;
         }

         while (var2 < 10) {
            this.J[var2] = 0L;
            var2++;
         }

         I++;
         if (!var1) {
            b(-115);
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "kf.A(" + var1 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int a(int var1, int var2, int var3) {
      int var7 = client.lb;

      try {
         y++;
         if (var2 != -19) {
            u = null;
         }

         label65: {
            int var4 = this.B;
            this.B = 300;
            int var5 = this.N;
            this.N = 1;
            this.C = Class_fj.a(17161);
            if (this.J[this.H] == 0L) {
               this.B = var4;
               this.N = var5;
               if (var7 == 0) {
                  break label65;
               }
            }

            if (~this.J[this.H] > ~this.C) {
               this.B = (int)(var3 * 2560 / (this.C - this.J[this.H]));
            }
         }

         if (this.B < 25) {
            this.B = 25;
         }

         if (~this.B < -257) {
            this.B = 256;
            this.N = (int)(-((this.C - this.J[this.H]) / 10L) + var3);
         }

         if (this.N > var3) {
            this.N = var3;
         }

         this.J[this.H] = this.C;
         this.H = (this.H + 1) % 10;
         if (~this.N < -2) {
            int var6 = 0;
            if (var7 != 0 || ~var6 > -11) {
               do {
                  if (this.J[var6] != 0L) {
                     this.J[var6] = this.J[var6] - -this.N;
                  }
               } while (~(++var6) > -11);
            }
         }

         if (~this.N > ~var1) {
            this.N = var1;
         }

         Class_hg.a(var2 + 14, this.N);
         int var9 = 0;
         if (var7 != 0) {
            this.v = this.v + this.B;
            var9++;
         }

         while (~this.v > -257) {
            this.v = this.v + this.B;
            var9++;
         }

         this.v &= 255;
         return var9;
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "kf.C(" + var1 + 44 + var2 + 44 + var3 + 41);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   Class_kf() {
      super();
      int var2 = client.lb;
      this.J = new long[10];

      try {
         this.B = 256;
         this.v = 0;
         this.N = 1;
         this.C = Class_fj.a(17161);
         int var1 = 0;
         if (var2 != 0 || var1 < 10) {
            do {
               this.J[var1] = this.C;
            } while (++var1 < 10);
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "kf.<init>(" + ')');
      }
   }
}
