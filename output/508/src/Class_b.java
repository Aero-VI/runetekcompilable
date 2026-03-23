final class Class_b extends Class_a {
   private int p;
   private int q;
   private int r;
   private double s;
   double t;
   static int u;
   private boolean v = false;
   int w;
   private double x;
   static Class_nj y = new Class_nj(64);
   private int z;
   private double A;
   double B;
   static int C;
   private static Class_r D = Class_tc.a(43, "Location");
   static int E;
   private int F;
   private double G;
   static int H;
   static Class_r I = D;
   double J;
   int K;
   int L;
   private double M;
   private Class_uc N;
   static Class_r O = Class_tc.a(43, "::rect_debug");
   static int P = 1;
   private int Q = -32768;
   static boolean R = false;
   static int S;
   static int T;
   int U;
   private int V;
   private int W = 0;
   int X;
   private int Y;
   int Z;
   static int ab;
   static int bb = -8 + (int)(Math.random() * 17.0);
   private int cb;
   static int db;
   static Class_cj eb;
   static int fb;

   static final void a(int var0, int var1) {
      try {
         label33: {
            if (~var1 == 0 && !Class_vf.i) {
               Class_ib.h(16777215);
               if (client.lb == 0) {
                  break label33;
               }
            }

            if (~var1 != 0 && (~Class_rc.i != ~var1 || !Class_tb.a(20778)) && Class_oj.Y != 0 && !Class_vf.i) {
               Class_tb.a(false, 0, 2, var1, Class_cj.L, false, Class_oj.Y);
            }
         }

         if (var0 <= 0) {
            a(-56, -73);
         }

         Class_rc.i = var1;
         fb++;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "b.E(" + var0 + ',' + var1 + ')');
      }
   }

   final void a(int var1, byte var2, int var3, int var4, int var5) {
      try {
         if (!this.v) {
            double var6 = var1 + -this.q;
            double var8 = var3 + -this.r;
            double var10 = Math.sqrt(var8 * var8 + var6 * var6);
            this.J = this.q + var6 * this.z / var10;
            this.t = this.cb;
            this.B = var8 * this.z / var10 + this.r;
         }

         u++;
         double var13 = this.L - (-1 - -var5);
         this.M = (var3 - this.B) / var13;
         this.A = (-this.J + var1) / var13;
         this.G = Math.sqrt(this.A * this.A + this.M * this.M);
         if (var2 < -2) {
            if (!this.v) {
               this.s = -this.G * Math.tan(0.02454369 * this.p);
            }

            this.x = (var4 - this.t - var13 * this.s) * 2.0 / (var13 * var13);
         }
      } catch (RuntimeException var12) {
         throw Class_sh.a(var12, "b.H(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
      }
   }

   static final void a(int var0, int var1, byte var2, Class_ha var3, int var4) {
      try {
         label26: {
            if (Class_kc.q < 3) {
               ((Class_ni)Class_ub.jb).a(var4, var0, var3.Gc, var3.nc, Class_ub.jb.Q / 2, Class_ub.jb.S / 2, Class_ba.z, 256, var3.Ub, var3.B);
               if (client.lb == 0) {
                  break label26;
               }
            }

            Class_nc.a(var4, var0, 0, var3.Ub, var3.B);
         }

         C++;
         Class_n.u[var1] = true;
         if (var2 != -123) {
            y = null;
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "b.J(" + var0 + ',' + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ',' + var4 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final void a(int var1, boolean var2) {
      int var4 = client.lb;

      try {
         this.J = this.J + var1 * this.A;
         this.v = true;
         if (!var2) {
            this.B = this.B + var1 * this.M;
            H++;
            this.t = this.t + (var1 * (0.5 * this.x * var1) + this.s * var1);
            this.s = this.s + this.x * var1;
            this.K = (int)(325.949 * Math.atan2(this.A, this.M)) - -1024 & 2047;
            this.Y = (int)(Math.atan2(this.s, this.G) * 325.949) & 2047;
            if (this.N != null) {
               this.V += var1;
               if (var4 != 0 || this.V > this.N.A[this.W]) {
                  do {
                     this.V = this.V - this.N.A[this.W];
                     this.W++;
                     if (this.N.d.length <= this.W) {
                        this.W = this.W - this.N.P;
                        if (~this.W <= -1) {
                           if (this.N.d.length <= this.W) {
                              this.W = 0;
                           }
                        } else {
                           this.W = 0;
                        }
                     }
                  } while (this.V > this.N.A[this.W]);
               }
            }
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "b.I(" + var1 + ',' + var2 + ')');
      }
   }

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      try {
         ab++;
         Class_jh var11 = this.a((byte)46);
         if (var11 != null) {
            var11.a(var1, var2, var3, var4, var5, var6, var7, var8, var9);
            this.Q = var11.a();
         }
      } catch (RuntimeException var12) {
         throw Class_sh.a(var12, "b.A(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ')');
      }
   }

   private final Class_jh a(byte var1) {
      try {
         S++;
         int var2 = -10 % ((-36 - var1) / 62);
         Class_mb var3 = Class_qj.c(this.F, 1);
         Class_jh var4 = var3.b(this.W, -10);
         if (var4 == null) {
            return null;
         } else {
            var4.c(this.Y);
            return var4;
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "b.C(" + var1 + ')');
      }
   }

   static final void b(byte var0) {
      try {
         if (var0 != -96) {
            bb = -18;
         }

         Class_cg.j.b((byte)94);
         Class_vf.k.b((byte)94);
         T++;
         Class_ha.gd.b((byte)94);
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "b.F(" + var0 + ')');
      }
   }

   final int a() {
      try {
         E++;
         return this.Q;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "b.D(" + 41);
      }
   }

   public static void a(boolean var0) {
      try {
         if (var0) {
            O = null;
            y = null;
            D = null;
            eb = null;
            I = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "b.G(" + var0 + ')');
      }
   }

   Class_b(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      this.V = 0;

      try {
         this.F = var1;
         this.v = false;
         this.r = var4;
         this.p = var8;
         this.w = var6;
         this.X = var11;
         this.z = var9;
         this.L = var7;
         this.U = var10;
         this.q = var3;
         this.cb = var5;
         this.Z = var2;
         int var12 = Class_qj.c(this.F, 1).t;
         if (~var12 == 0) {
            this.N = null;
         } else {
            this.N = Class_kk.a((byte)-36, var12);
         }
      } catch (RuntimeException var13) {
         throw Class_sh.a(
            var13,
            "b.<init>("
               + var1
               + ','
               + var2
               + ','
               + var3
               + ','
               + var4
               + ','
               + var5
               + ','
               + var6
               + ','
               + var7
               + ','
               + var8
               + ','
               + var9
               + ','
               + var10
               + ','
               + var11
               + ')'
         );
      }
   }
}
