final class Class_nf extends Class_li {
   int p;
   int q;
   Class_rb r;
   static int s;
   int t;
   static Class_r u = Class_tc.a(43, "Nehmen");
   int v;
   Class_ub w;
   static int x = 0;
   int y = 0;
   static Class_r z = Class_tc.a(43, "M");
   Class_rb A;
   Class_fa B;
   int C;
   static Class_r D = Class_tc.a(43, ")2");
   int[] E;
   int F;
   static int G;
   static int H;
   int I;
   static boolean J = false;
   int K;
   Class_eh L;
   boolean M;
   int N;
   static Class_r O = Class_tc.a(43, "Wordpack geladen)3");
   int P;

   public static void d(int var0) {
      try {
         D = null;
         if (var0 != 0) {
            f(-119);
         }

         O = null;
         u = null;
         z = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "nf.A(" + var0 + ')');
      }
   }

   final void e(int var1) {
      try {
         if (var1 == 31506) {
            int var2 = this.t;
            if (this.w == null) {
               if (this.L == null) {
                  if (this.B != null) {
                     this.t = Class_ra.a(this.B, var1 ^ -24888);
                     this.I = 128 * this.B.mc;
                  }
               } else {
                  int var3 = Class_me.a(this.L, false);
                  if (var2 != var3) {
                     this.t = var3;
                     Class_nd var4 = this.L.Pb;
                     if (var4.z != null) {
                        var4 = var4.d(-94);
                     }

                     if (var4 != null) {
                        this.I = 128 * var4.fb;
                     } else {
                        this.I = 0;
                     }
                  }
               }
            } else {
               Class_ub var6 = this.w.b(var1 ^ -31507);
               if (var6 != null) {
                  this.E = var6.K;
                  this.v = var6.f;
                  this.t = var6.x;
                  this.I = 128 * var6.q;
                  this.K = var6.Q;
               } else {
                  this.E = null;
                  this.I = 0;
                  this.K = 0;
                  this.t = -1;
                  this.v = 0;
               }
            }

            H++;
            if (this.t != var2 && this.r != null) {
               Class_nd.m.a(this.r);
               this.r = null;
            }
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "nf.B(" + var1 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, int var1, boolean var2, boolean var3, int var4, Class_ha[] var5) {
      int var8 = client.lb;

      try {
         if (var3) {
            z = null;
         }

         int var6 = 0;
         if (var8 == 0 && ~var5.length >= ~var6) {
            s++;
         } else {
            do {
               Class_ha var7 = var5[var6];
               if (var7 != null && var7.R == var0) {
                  Class_fh.a(var2, 19, var1, var4, var7);
                  Class_qj.a(var1, var7, var4, -1198502738);
                  if (~var7.kb < ~(var7.M + -var7.nc)) {
                     var7.kb = -var7.nc + var7.M;
                  }

                  if (~var7.kb > -1) {
                     var7.kb = 0;
                  }

                  if (-var7.Gc + var7.Cc < var7.Nb) {
                     var7.Nb = var7.Cc + -var7.Gc;
                  }

                  if (var7.Nb < 0) {
                     var7.Nb = 0;
                  }

                  if (~var7.Kc == -1) {
                     Class_pi.a(-1, var2, var7);
                  }
               }
            } while (~var5.length < ~(++var6));

            s++;
         }
      } catch (RuntimeException var9) {
         throw Class_sh.a(var9, "nf.D(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + (var5 != null ? "{...}" : "null") + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void f(int var0) {
      int var4 = client.lb;

      try {
         G++;
         int var1 = 0;
         if (var4 == 0 && Class_ke.p <= var1) {
            if (var0 != 16986) {
               f(107);
            }
         } else {
            do {
               int var2 = Class_kg.v[var1];
               Class_eh var3 = Class_rf.a[var2];
               if (var3 != null) {
                  Class_hh.a(var3, 128, var3.Pb.T);
               }
            } while (Class_ke.p > ++var1);

            if (var0 != 16986) {
               f(107);
            }
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "nf.C(" + var0 + ')');
      }
   }
}
