final class Class_ne extends Class_a {
   private static int[] p = Class_kd.q;
   int q = 0;
   int[] r;
   private byte[] s;
   Class_sc[] t;
   private short u;
   private short v;
   Class_sh[] w;
   short[] x;
   private static int[] y = new int[10000];
   short[] z;
   private byte[] A;
   private short[] B;
   short[] C;
   private static int D = 0;
   int E;
   private byte[] F;
   byte[] G;
   short[] H;
   int[] I;
   private byte[] J;
   short[] K;
   int[] L;
   private short[] M;
   short N;
   private short O;
   private short P;
   private int[] Q;
   private short[] R;
   int[] S;
   short T;
   int U = 0;
   byte[] V;
   int[] W;
   Class_sh[] X;
   byte[] Y;
   byte[] Z;
   private int[] ab;
   private boolean bb = false;
   private short cb;
   int[][] db;
   private byte[] eb;
   int[] fb;
   int[][] gb;
   private static int[] hb = new int[10000];
   byte ib = 0;
   private short jb;
   private static int[] kb = Class_kd.e;
   byte[] lb;

   final void c(int var1) {
      int var2 = kb[var1];
      int var3 = p[var1];

      for (int var4 = 0; var4 < this.q; var4++) {
         int var5 = this.L[var4] * var2 + this.W[var4] * var3 >> 16;
         this.L[var4] = this.L[var4] * var3 - this.W[var4] * var2 >> 16;
         this.W[var4] = var5;
      }

      this.i();
   }

   private final void a(byte[] var1) {
      Class_lh var2 = new Class_lh(var1);
      Class_lh var3 = new Class_lh(var1);
      Class_lh var4 = new Class_lh(var1);
      Class_lh var5 = new Class_lh(var1);
      Class_lh var6 = new Class_lh(var1);
      Class_lh var7 = new Class_lh(var1);
      Class_lh var8 = new Class_lh(var1);
      var2.p = var1.length - 23;
      int var9 = var2.k(1355769544);
      int var10 = var2.k(1355769544);
      int var11 = var2.n(-6677);
      int var12 = var2.n(-6677);
      int var13 = var2.n(-6677);
      int var14 = var2.n(-6677);
      int var15 = var2.n(-6677);
      int var16 = var2.n(-6677);
      int var17 = var2.n(-6677);
      int var18 = var2.k(1355769544);
      int var19 = var2.k(1355769544);
      int var20 = var2.k(1355769544);
      int var21 = var2.k(1355769544);
      int var22 = var2.k(1355769544);
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      if (var11 > 0) {
         this.G = new byte[var11];
         var2.p = 0;

         for (int var26 = 0; var26 < var11; var26++) {
            byte var27 = this.G[var26] = var2.o(3390);
            if (var27 == 0) {
               var23++;
            }

            if (var27 >= 1 && var27 <= 3) {
               var24++;
            }

            if (var27 == 2) {
               var25++;
            }
         }
      }

      int var59 = var11 + var9;
      int var28 = var59;
      if (var12 == 1) {
         var59 += var10;
      }

      var59 += var10;
      int var30 = var59;
      if (var13 == 255) {
         var59 += var10;
      }

      int var31 = var59;
      if (var15 == 1) {
         var59 += var10;
      }

      int var32 = var59;
      if (var17 == 1) {
         var59 += var9;
      }

      int var33 = var59;
      if (var14 == 1) {
         var59 += var10;
      }

      var59 += var21;
      int var35 = var59;
      if (var16 == 1) {
         var59 += var10 * 2;
      }

      var59 += var22;
      var59 += var10 * 2;
      var59 += var18;
      var59 += var19;
      var59 += var20;
      var59 += var23 * 6;
      var59 += var24 * 6;
      var59 += var24 * 6;
      var59 += var24;
      var59 += var24;
      var59 += var24 + var25 * 2;
      this.q = var9;
      this.U = var10;
      this.E = var11;
      this.W = new int[var9];
      this.S = new int[var9];
      this.L = new int[var9];
      this.r = new int[var10];
      this.fb = new int[var10];
      this.I = new int[var10];
      if (var17 == 1) {
         this.ab = new int[var9];
      }

      if (var12 == 1) {
         this.V = new byte[var10];
      }

      if (var13 == 255) {
         this.Z = new byte[var10];
      } else {
         this.ib = (byte)var13;
      }

      if (var14 == 1) {
         this.Y = new byte[var10];
      }

      if (var15 == 1) {
         this.Q = new int[var10];
      }

      if (var16 == 1) {
         this.K = new short[var10];
      }

      if (var16 == 1 && var11 > 0) {
         this.lb = new byte[var10];
      }

      this.H = new short[var10];
      if (var11 > 0) {
         this.z = new short[var11];
         this.x = new short[var11];
         this.C = new short[var11];
         if (var24 > 0) {
            this.R = new short[var24];
            this.B = new short[var24];
            this.M = new short[var24];
            this.s = new byte[var24];
            this.A = new byte[var24];
            this.F = new byte[var24];
         }

         if (var25 > 0) {
            this.J = new byte[var25];
            this.eb = new byte[var25];
         }
      }

      var2.p = var11;
      var3.p = var59;
      var4.p = var59;
      var5.p = var59;
      var6.p = var32;
      int var47 = 0;
      int var48 = 0;
      int var49 = 0;

      for (int var50 = 0; var50 < var9; var50++) {
         int var51 = var2.n(-6677);
         int var52 = 0;
         if ((var51 & 1) != 0) {
            var52 = var3.q(32767);
         }

         int var53 = 0;
         if ((var51 & 2) != 0) {
            var53 = var4.q(32767);
         }

         int var54 = 0;
         if ((var51 & 4) != 0) {
            var54 = var5.q(32767);
         }

         this.W[var50] = var47 + var52;
         this.S[var50] = var48 + var53;
         this.L[var50] = var49 + var54;
         var47 = this.W[var50];
         var48 = this.S[var50];
         var49 = this.L[var50];
         if (var17 == 1) {
            this.ab[var50] = var6.n(-6677);
         }
      }

      var2.p = var59;
      var3.p = var28;
      var4.p = var30;
      var5.p = var33;
      var6.p = var31;
      var7.p = var35;
      var8.p = var59;

      for (int var73 = 0; var73 < var10; var73++) {
         this.H[var73] = (short)var2.k(1355769544);
         if (var12 == 1) {
            this.V[var73] = var3.o(3390);
         }

         if (var13 == 255) {
            this.Z[var73] = var4.o(3390);
         }

         if (var14 == 1) {
            this.Y[var73] = var5.o(3390);
         }

         if (var15 == 1) {
            this.Q[var73] = var6.n(-6677);
         }

         if (var16 == 1) {
            this.K[var73] = (short)(var7.k(1355769544) - 1);
         }

         if (this.lb != null) {
            if (this.K[var73] != -1) {
               this.lb[var73] = (byte)(var8.n(-6677) - 1);
            } else {
               this.lb[var73] = -1;
            }
         }
      }

      var2.p = var59;
      var3.p = var59;
      int var74 = 0;
      int var75 = 0;
      int var76 = 0;
      int var55 = 0;

      for (int var56 = 0; var56 < var10; var56++) {
         int var57 = var3.n(-6677);
         if (var57 == 1) {
            var74 = var2.q(32767) + var55;
            var75 = var2.q(32767) + var74;
            var76 = var2.q(32767) + var75;
            var55 = var76;
            this.r[var56] = var74;
            this.fb[var56] = var75;
            this.I[var56] = var76;
         }

         if (var57 == 2) {
            var75 = var76;
            var76 = var2.q(32767) + var55;
            var55 = var76;
            this.r[var56] = var74;
            this.fb[var56] = var75;
            this.I[var56] = var76;
         }

         if (var57 == 3) {
            var74 = var76;
            var76 = var2.q(32767) + var55;
            var55 = var76;
            this.r[var56] = var74;
            this.fb[var56] = var75;
            this.I[var56] = var76;
         }

         if (var57 == 4) {
            int var58 = var74;
            var74 = var75;
            var75 = var58;
            var76 = var2.q(32767) + var55;
            var55 = var76;
            this.r[var56] = var74;
            this.fb[var56] = var58;
            this.I[var56] = var76;
         }
      }

      var2.p = var59;
      var3.p = var59;
      var4.p = var59;
      var5.p = var59;
      var6.p = var59;
      var7.p = var59;

      for (int var77 = 0; var77 < var11; var77++) {
         int var78 = this.G[var77] & 255;
         if (var78 == 0) {
            this.z[var77] = (short)var2.k(1355769544);
            this.x[var77] = (short)var2.k(1355769544);
            this.C[var77] = (short)var2.k(1355769544);
         }

         if (var78 == 1) {
            this.z[var77] = (short)var3.k(1355769544);
            this.x[var77] = (short)var3.k(1355769544);
            this.C[var77] = (short)var3.k(1355769544);
            this.R[var77] = (short)var4.k(1355769544);
            this.B[var77] = (short)var4.k(1355769544);
            this.M[var77] = (short)var4.k(1355769544);
            this.s[var77] = var5.o(3390);
            this.A[var77] = var6.o(3390);
            this.F[var77] = var7.o(3390);
         }

         if (var78 == 2) {
            this.z[var77] = (short)var3.k(1355769544);
            this.x[var77] = (short)var3.k(1355769544);
            this.C[var77] = (short)var3.k(1355769544);
            this.R[var77] = (short)var4.k(1355769544);
            this.B[var77] = (short)var4.k(1355769544);
            this.M[var77] = (short)var4.k(1355769544);
            this.s[var77] = var5.o(3390);
            this.A[var77] = var6.o(3390);
            this.F[var77] = var7.o(3390);
            this.J[var77] = var7.o(3390);
            this.eb[var77] = var7.o(3390);
         }

         if (var78 == 3) {
            this.z[var77] = (short)var3.k(1355769544);
            this.x[var77] = (short)var3.k(1355769544);
            this.C[var77] = (short)var3.k(1355769544);
            this.R[var77] = (short)var4.k(1355769544);
            this.B[var77] = (short)var4.k(1355769544);
            this.M[var77] = (short)var4.k(1355769544);
            this.s[var77] = var5.o(3390);
            this.A[var77] = var6.o(3390);
            this.F[var77] = var7.o(3390);
         }
      }
   }

   final Class_ne c() {
      Class_ne var1 = new Class_ne();
      if (this.V != null) {
         var1.V = new byte[this.U];

         for (int var2 = 0; var2 < this.U; var2++) {
            var1.V[var2] = this.V[var2];
         }
      }

      var1.q = this.q;
      var1.U = this.U;
      var1.E = this.E;
      var1.W = this.W;
      var1.S = this.S;
      var1.L = this.L;
      var1.r = this.r;
      var1.fb = this.fb;
      var1.I = this.I;
      var1.Z = this.Z;
      var1.Y = this.Y;
      var1.lb = this.lb;
      var1.H = this.H;
      var1.K = this.K;
      var1.ib = this.ib;
      var1.G = this.G;
      var1.z = this.z;
      var1.x = this.x;
      var1.C = this.C;
      var1.R = this.R;
      var1.B = this.B;
      var1.M = this.M;
      var1.s = this.s;
      var1.A = this.A;
      var1.F = this.F;
      var1.J = this.J;
      var1.eb = this.eb;
      var1.ab = this.ab;
      var1.Q = this.Q;
      var1.gb = this.gb;
      var1.db = this.db;
      var1.w = this.w;
      var1.t = this.t;
      var1.N = this.N;
      var1.T = this.T;
      return var1;
   }

   final void a(short var1, short var2) {
      if (this.K != null) {
         for (int var3 = 0; var3 < this.U; var3++) {
            if (this.K[var3] == var1) {
               this.K[var3] = var2;
            }
         }
      }
   }

   final Class_ne a(int var1, int var2, int[][] var3, int[][] var4, int var5, int var6, int var7, boolean var8, boolean var9) {
      this.h();
      int var10 = var5 + this.jb;
      int var11 = var5 + this.u;
      int var12 = var7 + this.v;
      int var13 = var7 + this.cb;
      if (var1 != 1 && var1 != 2 && var1 != 3 && var1 != 5 || var10 >= 0 && var11 + 128 >> 7 < var3.length && var12 >= 0 && var13 + 128 >> 7 < var3[0].length) {
         if (var1 != 4 && var1 != 5) {
            var10 >>= 7;
            var11 = var11 + 127 >> 7;
            var12 >>= 7;
            var13 = var13 + 127 >> 7;
            if (var3[var10][var12] == var6 && var3[var11][var12] == var6 && var3[var10][var13] == var6 && var3[var11][var13] == var6) {
               return this;
            }
         } else {
            if (var4 == null) {
               return this;
            }

            if (var10 < 0 || var11 + 128 >> 7 >= var4.length || var12 < 0 || var13 + 128 >> 7 >= var4[0].length) {
               return this;
            }
         }

         Class_ne var14;
         if (var8) {
            var14 = new Class_ne();
            var14.q = this.q;
            var14.U = this.U;
            var14.E = this.E;
            var14.r = this.r;
            var14.fb = this.fb;
            var14.I = this.I;
            var14.V = this.V;
            var14.Z = this.Z;
            var14.Y = this.Y;
            var14.lb = this.lb;
            var14.H = this.H;
            var14.K = this.K;
            var14.ib = this.ib;
            var14.G = this.G;
            var14.z = this.z;
            var14.x = this.x;
            var14.C = this.C;
            var14.R = this.R;
            var14.B = this.B;
            var14.M = this.M;
            var14.s = this.s;
            var14.A = this.A;
            var14.F = this.F;
            var14.J = this.J;
            var14.eb = this.eb;
            var14.ab = this.ab;
            var14.Q = this.Q;
            var14.gb = this.gb;
            var14.db = this.db;
            var14.N = this.N;
            var14.T = this.T;
            var14.w = this.w;
            var14.t = this.t;
            var14.X = this.X;
            if (var1 == 3) {
               var14.W = Class_sf.a(this.W, -105);
               var14.S = Class_sf.a(this.S, -33);
               var14.L = Class_sf.a(this.L, -98);
            } else {
               var14.W = this.W;
               var14.S = new int[var14.q];
               var14.L = this.L;
            }
         } else {
            var14 = this;
         }

         if (var1 == 1) {
            for (int var15 = 0; var15 < var14.q; var15++) {
               int var16 = this.W[var15] + var5;
               int var17 = this.L[var15] + var7;
               int var18 = var16 & 127;
               int var19 = var17 & 127;
               int var20 = var16 >> 7;
               int var21 = var17 >> 7;
               int var22 = var3[var20][var21] * (128 - var18) + var3[var20 + 1][var21] * var18 >> 7;
               int var23 = var3[var20][var21 + 1] * (128 - var18) + var3[var20 + 1][var21 + 1] * var18 >> 7;
               int var24 = var22 * (128 - var19) + var23 * var19 >> 7;
               var14.S[var15] = this.S[var15] + var24 - var6;
            }
         } else if (var1 == 2) {
            for (int var32 = 0; var32 < var14.q; var32++) {
               int var36 = (this.S[var32] << 16) / this.P;
               if (var36 < var2) {
                  int var40 = this.W[var32] + var5;
                  int var43 = this.L[var32] + var7;
                  int var46 = var40 & 127;
                  int var49 = var43 & 127;
                  int var52 = var40 >> 7;
                  int var55 = var43 >> 7;
                  int var58 = var3[var52][var55] * (128 - var46) + var3[var52 + 1][var55] * var46 >> 7;
                  int var62 = var3[var52][var55 + 1] * (128 - var46) + var3[var52 + 1][var55 + 1] * var46 >> 7;
                  int var25 = var58 * (128 - var49) + var62 * var49 >> 7;
                  var14.S[var32] = this.S[var32] + (var25 - var6) * (var2 - var36) / var2;
               } else {
                  var14.S[var32] = this.S[var32];
               }
            }
         } else if (var1 == 3) {
            int var33 = (var2 & 0xFF) * 4;
            int var37 = (var2 >> 8 & 0xFF) * 4;
            this.a(var3, var5, var6, var7, var33, var37);
         } else if (var1 == 4) {
            int var34 = this.O - this.P;

            for (int var38 = 0; var38 < this.q; var38++) {
               int var41 = this.W[var38] + var5;
               int var44 = this.L[var38] + var7;
               int var47 = var41 & 127;
               int var50 = var44 & 127;
               int var53 = var41 >> 7;
               int var56 = var44 >> 7;
               int var59 = var4[var53][var56] * (128 - var47) + var4[var53 + 1][var56] * var47 >> 7;
               int var63 = var4[var53][var56 + 1] * (128 - var47) + var4[var53 + 1][var56 + 1] * var47 >> 7;
               int var66 = var59 * (128 - var50) + var63 * var50 >> 7;
               var14.S[var38] = this.S[var38] + (var66 - var6) + var34;
            }
         } else if (var1 == 5) {
            int var35 = this.O - this.P;

            for (int var39 = 0; var39 < this.q; var39++) {
               int var42 = this.W[var39] + var5;
               int var45 = this.L[var39] + var7;
               int var48 = var42 & 127;
               int var51 = var45 & 127;
               int var54 = var42 >> 7;
               int var57 = var45 >> 7;
               int var60 = var3[var54][var57] * (128 - var48) + var3[var54 + 1][var57] * var48 >> 7;
               int var64 = var3[var54][var57 + 1] * (128 - var48) + var3[var54 + 1][var57 + 1] * var48 >> 7;
               int var67 = var60 * (128 - var51) + var64 * var51 >> 7;
               var60 = var4[var54][var57] * (128 - var48) + var4[var54 + 1][var57] * var48 >> 7;
               var64 = var4[var54][var57 + 1] * (128 - var48) + var4[var54 + 1][var57 + 1] * var48 >> 7;
               int var26 = var60 * (128 - var51) + var64 * var51 >> 7;
               int var27 = var67 - var26;
               var14.S[var39] = ((this.S[var39] << 8) / var35 * var27 >> 8) - (var6 - var67);
            }
         }

         if (var9) {
            var14.i();
         } else {
            this.bb = false;
         }

         return var14;
      } else {
         return this;
      }
   }

   final void d() {
      if (this.ab != null) {
         int[] var1 = new int[256];
         int var2 = 0;

         for (int var3 = 0; var3 < this.q; var3++) {
            int var4 = this.ab[var3];
            var1[var4]++;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.gb = new int[var2 + 1][];

         for (int var10 = 0; var10 <= var2; var10++) {
            this.gb[var10] = new int[var1[var10]];
            var1[var10] = 0;
         }

         int var5 = 0;

         while (var5 < this.q) {
            int var6 = this.ab[var5];
            this.gb[var6][var1[var6]++] = var5++;
         }

         this.ab = null;
      }

      if (this.Q != null) {
         int[] var7 = new int[256];
         int var8 = 0;

         for (int var9 = 0; var9 < this.U; var9++) {
            int var11 = this.Q[var9];
            var7[var11]++;
            if (var11 > var8) {
               var8 = var11;
            }
         }

         this.db = new int[var8 + 1][];

         for (int var12 = 0; var12 <= var8; var12++) {
            this.db[var12] = new int[var7[var12]];
            var7[var12] = 0;
         }

         int var13 = 0;

         while (var13 < this.U) {
            int var14 = this.Q[var13];
            this.db[var14][var7[var14]++] = var13++;
         }

         this.Q = null;
      }
   }

   final void a(Class_a var1, int var2, int var3, int var4, boolean var5) {
      Class_ne var6 = (Class_ne)var1;
      var6.h();
      var6.g();
      D++;
      int var7 = 0;
      int[] var8 = var6.W;
      int var9 = var6.q;

      for (int var10 = 0; var10 < this.q; var10++) {
         Class_sh var11 = this.w[var10];
         if (var11.d != 0) {
            int var12 = this.S[var10] - var3;
            if (var12 >= var6.P && var12 <= var6.O) {
               int var13 = this.W[var10] - var2;
               if (var13 >= var6.jb && var13 <= var6.u) {
                  int var14 = this.L[var10] - var4;
                  if (var14 >= var6.v && var14 <= var6.cb) {
                     for (int var15 = 0; var15 < var9; var15++) {
                        Class_sh var16 = var6.w[var15];
                        if (var13 == var8[var15] && var14 == var6.L[var15] && var12 == var6.S[var15] && var16.d != 0) {
                           if (this.X == null) {
                              this.X = new Class_sh[this.q];
                           }

                           if (var6.X == null) {
                              var6.X = new Class_sh[var9];
                           }

                           Class_sh var17 = this.X[var10];
                           if (var17 == null) {
                              var17 = this.X[var10] = new Class_sh(var11);
                           }

                           Class_sh var18 = var6.X[var15];
                           if (var18 == null) {
                              var18 = var6.X[var15] = new Class_sh(var16);
                           }

                           var17.j = var17.j + var16.j;
                           var17.l = var17.l + var16.l;
                           var17.a = var17.a + var16.a;
                           var17.d = var17.d + var16.d;
                           var18.j = var18.j + var11.j;
                           var18.l = var18.l + var11.l;
                           var18.a = var18.a + var11.a;
                           var18.d = var18.d + var11.d;
                           var7++;
                           hb[var10] = D;
                           y[var15] = D;
                        }
                     }
                  }
               }
            }
         }
      }

      if (var7 >= 3 && var5) {
         for (int var19 = 0; var19 < this.U; var19++) {
            if (hb[this.r[var19]] == D && hb[this.fb[var19]] == D && hb[this.I[var19]] == D) {
               if (this.V == null) {
                  this.V = new byte[this.U];
               }

               this.V[var19] = 2;
            }
         }

         for (int var20 = 0; var20 < var6.U; var20++) {
            if (y[var6.r[var20]] == D && y[var6.fb[var20]] == D && y[var6.I[var20]] == D) {
               if (var6.V == null) {
                  var6.V = new byte[var6.U];
               }

               var6.V[var20] = 2;
            }
         }
      }
   }

   private final int a(Class_ne var1, int var2) {
      int var3 = -1;
      int var4 = var1.W[var2];
      int var5 = var1.S[var2];
      int var6 = var1.L[var2];

      for (int var7 = 0; var7 < this.q; var7++) {
         if (var4 == this.W[var7] && var5 == this.S[var7] && var6 == this.L[var7]) {
            var3 = var7;
            break;
         }
      }

      if (var3 == -1) {
         this.W[this.q] = var4;
         this.S[this.q] = var5;
         this.L[this.q] = var6;
         if (var1.ab != null) {
            this.ab[this.q] = var1.ab[var2];
         }

         var3 = this.q++;
      }

      return var3;
   }

   final void e() {
      for (int var1 = 0; var1 < this.q; var1++) {
         this.L[var1] = -this.L[var1];
      }

      for (int var2 = 0; var2 < this.U; var2++) {
         int var3 = this.r[var2];
         this.r[var2] = this.I[var2];
         this.I[var2] = var3;
      }

      this.i();
   }

   static final Class_ne a(Class_cj var0, int var1, int var2) {
      byte[] var3 = var0.a(var2, 0, var1);
      return var3 == null ? null : new Class_ne(var3);
   }

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
   }

   public static void f() {
      hb = null;
      y = null;
      kb = null;
      p = null;
   }

   private final void d(int var1) {
      int var2 = kb[var1];
      int var3 = p[var1];

      for (int var4 = 0; var4 < this.q; var4++) {
         int var5 = this.S[var4] * var2 + this.W[var4] * var3 >> 16;
         this.S[var4] = this.S[var4] * var3 - this.W[var4] * var2 >> 16;
         this.W[var4] = var5;
      }

      this.i();
   }

   final Class_qa b(int var1, int var2, int var3, int var4, int var5) {
      return new Class_qa(this, var1, var2, var3, var4, var5);
   }

   private final void a(int[][] var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = -var5 / 2;
      int var11 = -var6 / 2;
      int var12 = a(var1, var2 + var10, var4 + var11);
      int var13 = var5 / 2;
      int var14 = -var6 / 2;
      int var15 = a(var1, var2 + var13, var4 + var14);
      int var16 = -var5 / 2;
      int var17 = var6 / 2;
      int var18 = a(var1, var2 + var16, var4 + var17);
      int var19 = var5 / 2;
      int var20 = var6 / 2;
      int var21 = a(var1, var2 + var19, var4 + var20);
      int var22 = var12 < var15 ? var12 : var15;
      int var23 = var18 < var21 ? var18 : var21;
      int var24 = var15 < var21 ? var15 : var21;
      int var25 = var12 < var18 ? var12 : var18;
      if (var6 != 0) {
         var7 = (int)(Math.atan2(var22 - var23, var6) * 325.95) & 2047;
         if (var7 != 0) {
            this.e(var7);
         }
      }

      if (var5 != 0) {
         var8 = (int)(Math.atan2(var25 - var24, var5) * 325.95) & 2047;
         if (var8 != 0) {
            this.d(var8);
         }
      }

      var9 = var12 + var21;
      if (var15 + var18 < var9) {
         var9 = var15 + var18;
      }

      var9 = (var9 >> 1) - var3;
      if (var9 != 0) {
         this.c(0, var9, 0);
      }
   }

   final void g() {
      if (this.w == null) {
         this.w = new Class_sh[this.q];

         for (int var1 = 0; var1 < this.q; var1++) {
            this.w[var1] = new Class_sh();
         }

         for (int var2 = 0; var2 < this.U; var2++) {
            int var3 = this.r[var2];
            int var4 = this.fb[var2];
            int var5 = this.I[var2];
            int var6 = this.W[var4] - this.W[var3];
            int var7 = this.S[var4] - this.S[var3];
            int var8 = this.L[var4] - this.L[var3];
            int var9 = this.W[var5] - this.W[var3];
            int var10 = this.S[var5] - this.S[var3];
            int var11 = this.L[var5] - this.L[var3];
            int var12 = var7 * var11 - var10 * var8;
            int var13 = var8 * var9 - var11 * var6;

            int var14;
            for (var14 = var6 * var10 - var9 * var7;
               var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192;
               var14 >>= 1
            ) {
               var12 >>= 1;
               var13 >>= 1;
            }

            int var15 = (int)Math.sqrt(var12 * var12 + var13 * var13 + var14 * var14);
            if (var15 <= 0) {
               var15 = 1;
            }

            var12 = var12 * 256 / var15;
            var13 = var13 * 256 / var15;
            var14 = var14 * 256 / var15;
            byte var16;
            if (this.V == null) {
               var16 = 0;
            } else {
               var16 = this.V[var2];
            }

            if (var16 == 0) {
               Class_sh var17 = this.w[var3];
               var17.j += var12;
               var17.l += var13;
               var17.a += var14;
               var17.d++;
               var17 = this.w[var4];
               var17.j += var12;
               var17.l += var13;
               var17.a += var14;
               var17.d++;
               var17 = this.w[var5];
               var17.j += var12;
               var17.l += var13;
               var17.a += var14;
               var17.d++;
            } else if (var16 == 1) {
               if (this.t == null) {
                  this.t = new Class_sc[this.U];
               }

               Class_sc var23 = this.t[var2] = new Class_sc();
               var23.g = var12;
               var23.n = var13;
               var23.h = var14;
            }
         }
      }
   }

   private final void h() {
      if (!this.bb) {
         this.bb = true;
         int var1 = 32767;
         int var2 = 32767;
         int var3 = 32767;
         int var4 = -32768;
         int var5 = -32768;
         int var6 = -32768;

         for (int var7 = 0; var7 < this.q; var7++) {
            int var8 = this.W[var7];
            int var9 = this.S[var7];
            int var10 = this.L[var7];
            if (var8 < var1) {
               var1 = var8;
            }

            if (var8 > var4) {
               var4 = var8;
            }

            if (var9 < var2) {
               var2 = var9;
            }

            if (var9 > var5) {
               var5 = var9;
            }

            if (var10 < var3) {
               var3 = var10;
            }

            if (var10 > var6) {
               var6 = var10;
            }
         }

         this.jb = (short)var1;
         this.u = (short)var4;
         this.P = (short)var2;
         this.O = (short)var5;
         this.v = (short)var3;
         this.cb = (short)var6;
      }
   }

   final int a() {
      if (!this.bb) {
         this.h();
      }

      return this.P;
   }

   private final void i() {
      this.w = null;
      this.X = null;
      this.t = null;
      this.bb = false;
   }

   final void j() {
      for (int var1 = 0; var1 < this.q; var1++) {
         this.W[var1] = -this.W[var1];
         this.L[var1] = -this.L[var1];
      }

      this.i();
   }

   private final void e(int var1) {
      int var2 = kb[var1];
      int var3 = p[var1];

      for (int var4 = 0; var4 < this.q; var4++) {
         int var5 = this.S[var4] * var3 - this.L[var4] * var2 >> 16;
         this.L[var4] = this.S[var4] * var2 + this.L[var4] * var3 >> 16;
         this.S[var4] = var5;
      }

      this.i();
   }

   final void b(int var1, int var2, int var3) {
      if (var3 != 0) {
         int var4 = kb[var3];
         int var5 = p[var3];

         for (int var6 = 0; var6 < this.q; var6++) {
            int var7 = this.S[var6] * var4 + this.W[var6] * var5 >> 16;
            this.S[var6] = this.S[var6] * var5 - this.W[var6] * var4 >> 16;
            this.W[var6] = var7;
         }
      }

      if (var1 != 0) {
         int var8 = kb[var1];
         int var10 = p[var1];

         for (int var12 = 0; var12 < this.q; var12++) {
            int var14 = this.S[var12] * var10 - this.L[var12] * var8 >> 16;
            this.L[var12] = this.S[var12] * var8 + this.L[var12] * var10 >> 16;
            this.S[var12] = var14;
         }
      }

      if (var2 != 0) {
         int var9 = kb[var2];
         int var11 = p[var2];

         for (int var13 = 0; var13 < this.q; var13++) {
            int var15 = this.L[var13] * var9 + this.W[var13] * var11 >> 16;
            this.L[var13] = this.L[var13] * var11 - this.W[var13] * var9 >> 16;
            this.W[var13] = var15;
         }
      }
   }

   private final void b(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      Class_lh var4 = new Class_lh(var1);
      Class_lh var5 = new Class_lh(var1);
      Class_lh var6 = new Class_lh(var1);
      Class_lh var7 = new Class_lh(var1);
      Class_lh var8 = new Class_lh(var1);
      var4.p = var1.length - 18;
      int var9 = var4.k(1355769544);
      int var10 = var4.k(1355769544);
      int var11 = var4.n(-6677);
      int var12 = var4.n(-6677);
      int var13 = var4.n(-6677);
      int var14 = var4.n(-6677);
      int var15 = var4.n(-6677);
      int var16 = var4.n(-6677);
      int var17 = var4.k(1355769544);
      int var18 = var4.k(1355769544);
      int var19 = var4.k(1355769544);
      int var20 = var4.k(1355769544);
      int var21 = 0;
      var21 += var9;
      var21 += var10;
      int var24 = var21;
      if (var13 == 255) {
         var21 += var10;
      }

      int var25 = var21;
      if (var15 == 1) {
         var21 += var10;
      }

      int var26 = var21;
      if (var12 == 1) {
         var21 += var10;
      }

      int var27 = var21;
      if (var16 == 1) {
         var21 += var9;
      }

      int var28 = var21;
      if (var14 == 1) {
         var21 += var10;
      }

      var21 += var20;
      var21 += var10 * 2;
      var21 += var11 * 6;
      var21 += var17;
      var21 += var18;
      var21 += var19;
      this.q = var9;
      this.U = var10;
      this.E = var11;
      this.W = new int[var9];
      this.S = new int[var9];
      this.L = new int[var9];
      this.r = new int[var10];
      this.fb = new int[var10];
      this.I = new int[var10];
      if (var11 > 0) {
         this.G = new byte[var11];
         this.z = new short[var11];
         this.x = new short[var11];
         this.C = new short[var11];
      }

      if (var16 == 1) {
         this.ab = new int[var9];
      }

      if (var12 == 1) {
         this.V = new byte[var10];
         this.lb = new byte[var10];
         this.K = new short[var10];
      }

      if (var13 == 255) {
         this.Z = new byte[var10];
      } else {
         this.ib = (byte)var13;
      }

      if (var14 == 1) {
         this.Y = new byte[var10];
      }

      if (var15 == 1) {
         this.Q = new int[var10];
      }

      this.H = new short[var10];
      var4.p = var21;
      var5.p = var21;
      var6.p = var21;
      var7.p = var21;
      var8.p = var27;
      int var35 = 0;
      int var36 = 0;
      int var37 = 0;

      for (int var38 = 0; var38 < var9; var38++) {
         int var39 = var4.n(-6677);
         int var40 = 0;
         if ((var39 & 1) != 0) {
            var40 = var5.q(32767);
         }

         int var41 = 0;
         if ((var39 & 2) != 0) {
            var41 = var6.q(32767);
         }

         int var42 = 0;
         if ((var39 & 4) != 0) {
            var42 = var7.q(32767);
         }

         this.W[var38] = var35 + var40;
         this.S[var38] = var36 + var41;
         this.L[var38] = var37 + var42;
         var35 = this.W[var38];
         var36 = this.S[var38];
         var37 = this.L[var38];
         if (var16 == 1) {
            this.ab[var38] = var8.n(-6677);
         }
      }

      var4.p = var21;
      var5.p = var26;
      var6.p = var24;
      var7.p = var28;
      var8.p = var25;

      for (int var57 = 0; var57 < var10; var57++) {
         this.H[var57] = (short)var4.k(1355769544);
         if (var12 == 1) {
            int var58 = var5.n(-6677);
            if ((var58 & 1) == 1) {
               this.V[var57] = 1;
               var2 = true;
            } else {
               this.V[var57] = 0;
            }

            if ((var58 & 2) == 2) {
               this.lb[var57] = (byte)(var58 >> 2);
               this.K[var57] = this.H[var57];
               this.H[var57] = 127;
               if (this.K[var57] != -1) {
                  var3 = true;
               }
            } else {
               this.lb[var57] = -1;
               this.K[var57] = -1;
            }
         }

         if (var13 == 255) {
            this.Z[var57] = var6.o(3390);
         }

         if (var14 == 1) {
            this.Y[var57] = var7.o(3390);
         }

         if (var15 == 1) {
            this.Q[var57] = var8.n(-6677);
         }
      }

      var4.p = var21;
      var5.p = var21;
      int var59 = 0;
      int var60 = 0;
      int var61 = 0;
      int var43 = 0;

      for (int var44 = 0; var44 < var10; var44++) {
         int var45 = var5.n(-6677);
         if (var45 == 1) {
            var59 = var4.q(32767) + var43;
            var60 = var4.q(32767) + var59;
            var61 = var4.q(32767) + var60;
            var43 = var61;
            this.r[var44] = var59;
            this.fb[var44] = var60;
            this.I[var44] = var61;
         }

         if (var45 == 2) {
            var60 = var61;
            var61 = var4.q(32767) + var43;
            var43 = var61;
            this.r[var44] = var59;
            this.fb[var44] = var60;
            this.I[var44] = var61;
         }

         if (var45 == 3) {
            var59 = var61;
            var61 = var4.q(32767) + var43;
            var43 = var61;
            this.r[var44] = var59;
            this.fb[var44] = var60;
            this.I[var44] = var61;
         }

         if (var45 == 4) {
            int var46 = var59;
            var59 = var60;
            var60 = var46;
            var61 = var4.q(32767) + var43;
            var43 = var61;
            this.r[var44] = var59;
            this.fb[var44] = var46;
            this.I[var44] = var61;
         }
      }

      var4.p = var21;

      for (int var62 = 0; var62 < var11; var62++) {
         this.G[var62] = 0;
         this.z[var62] = (short)var4.k(1355769544);
         this.x[var62] = (short)var4.k(1355769544);
         this.C[var62] = (short)var4.k(1355769544);
      }

      if (this.lb != null) {
         boolean var63 = false;

         for (int var47 = 0; var47 < var10; var47++) {
            int var48 = this.lb[var47] & 255;
            if (var48 != 255) {
               if ((this.z[var48] & '\uffff') == this.r[var47] && (this.x[var48] & '\uffff') == this.fb[var47] && (this.C[var48] & '\uffff') == this.I[var47]) {
                  this.lb[var47] = -1;
               } else {
                  var63 = true;
               }
            }
         }

         if (!var63) {
            this.lb = null;
         }
      }

      if (!var3) {
         this.K = null;
      }

      if (!var2) {
         this.V = null;
      }
   }

   final Class_jh c(int var1, int var2, int var3, int var4, int var5) {
      return new Class_qa(this, var1, var2, var3, var4, var5);
   }

   final void c(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.q; var4++) {
         this.W[var4] = this.W[var4] + var1;
         this.S[var4] = this.S[var4] + var2;
         this.L[var4] = this.L[var4] + var3;
      }

      this.i();
   }

   final void b(short var1, short var2) {
      for (int var3 = 0; var3 < this.U; var3++) {
         if (this.H[var3] == var1) {
            this.H[var3] = var2;
         }
      }
   }

   final boolean b() {
      return true;
   }

   final void k() {
      for (int var1 = 0; var1 < this.q; var1++) {
         int var2 = this.W[var1];
         this.W[var1] = this.L[var1];
         this.L[var1] = -var2;
      }

      this.i();
   }

   final int d(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.q; var4++) {
         if (this.W[var4] == var1 && this.S[var4] == var2 && this.L[var4] == var3) {
            return var4;
         }
      }

      this.W[this.q] = var1;
      this.S[this.q] = var2;
      this.L[this.q] = var3;
      return this.q++;
   }

   final Class_a a(int var1, int var2, int var3) {
      return this.c(this.N, this.T, var1, var2, var3);
   }

   final void l() {
      this.ab = null;
      this.Q = null;
      this.gb = null;
      this.db = null;
   }

   final void m() {
      for (int var1 = 0; var1 < this.q; var1++) {
         int var2 = this.L[var1];
         this.L[var1] = this.W[var1];
         this.W[var1] = -var2;
      }

      this.i();
   }

   private static final int a(int[][] var0, int var1, int var2) {
      int var3 = var1 >> 7;
      int var4 = var2 >> 7;
      if (var3 >= 0 && var4 >= 0 && var3 < var0.length && var4 < var0[0].length) {
         int var5 = var1 & 127;
         int var6 = var2 & 127;
         int var7 = var0[var3][var4] * (128 - var5) + var0[var3 + 1][var4] * var5 >> 7;
         int var8 = var0[var3][var4 + 1] * (128 - var5) + var0[var3 + 1][var4 + 1] * var5 >> 7;
         return var7 * (128 - var6) + var8 * var6 >> 7;
      } else {
         return 0;
      }
   }

   final void e(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.q; var4++) {
         this.W[var4] = this.W[var4] * var1 / 128;
         this.S[var4] = this.S[var4] * var2 / 128;
         this.L[var4] = this.L[var4] * var3 / 128;
      }

      this.i();
   }

   private Class_ne() {
   }

   private Class_ne(byte[] var1) {
      if (var1[var1.length - 1] == -1 && var1[var1.length - 2] == -1) {
         this.a(var1);
      } else {
         this.b(var1);
      }
   }

   Class_ne(int var1, int var2, int var3) {
      this.W = new int[var1];
      this.S = new int[var1];
      this.L = new int[var1];
      this.ab = new int[var1];
      this.r = new int[var2];
      this.fb = new int[var2];
      this.I = new int[var2];
      this.V = new byte[var2];
      this.Z = new byte[var2];
      this.Y = new byte[var2];
      this.H = new short[var2];
      this.K = new short[var2];
      this.lb = new byte[var2];
      this.Q = new int[var2];
      if (var3 > 0) {
         this.G = new byte[var3];
         this.z = new short[var3];
         this.x = new short[var3];
         this.C = new short[var3];
         this.R = new short[var3];
         this.B = new short[var3];
         this.M = new short[var3];
         this.s = new byte[var3];
         this.A = new byte[var3];
         this.F = new byte[var3];
         this.J = new byte[var3];
         this.eb = new byte[var3];
      }
   }

   final int a(int var1, int var2, int var3, byte var4, short var5, byte var6) {
      this.r[this.U] = var1;
      this.fb[this.U] = var2;
      this.I[this.U] = var3;
      this.V[this.U] = var4;
      this.lb[this.U] = -1;
      this.H[this.U] = var5;
      this.K[this.U] = -1;
      this.Y[this.U] = var6;
      return this.U++;
   }

   Class_ne(Class_ne[] var1, int var2) {
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      this.q = 0;
      this.U = 0;
      this.E = 0;
      this.ib = -1;

      for (int var9 = 0; var9 < var2; var9++) {
         Class_ne var10 = var1[var9];
         if (var10 != null) {
            this.q = this.q + var10.q;
            this.U = this.U + var10.U;
            this.E = this.E + var10.E;
            if (var10.Z != null) {
               var4 = true;
            } else {
               if (this.ib == -1) {
                  this.ib = var10.ib;
               }

               if (this.ib != var10.ib) {
                  var4 = true;
               }
            }

            var3 |= var10.V != null;
            var5 |= var10.Y != null;
            var6 |= var10.Q != null;
            var7 |= var10.K != null;
            var8 |= var10.lb != null;
         }
      }

      this.W = new int[this.q];
      this.S = new int[this.q];
      this.L = new int[this.q];
      this.ab = new int[this.q];
      this.r = new int[this.U];
      this.fb = new int[this.U];
      this.I = new int[this.U];
      if (var3) {
         this.V = new byte[this.U];
      }

      if (var4) {
         this.Z = new byte[this.U];
      }

      if (var5) {
         this.Y = new byte[this.U];
      }

      if (var6) {
         this.Q = new int[this.U];
      }

      if (var7) {
         this.K = new short[this.U];
      }

      if (var8) {
         this.lb = new byte[this.U];
      }

      this.H = new short[this.U];
      if (this.E > 0) {
         this.G = new byte[this.E];
         this.z = new short[this.E];
         this.x = new short[this.E];
         this.C = new short[this.E];
         this.R = new short[this.E];
         this.B = new short[this.E];
         this.M = new short[this.E];
         this.s = new byte[this.E];
         this.A = new byte[this.E];
         this.F = new byte[this.E];
         this.J = new byte[this.E];
         this.eb = new byte[this.E];
      }

      this.q = 0;
      this.U = 0;
      this.E = 0;

      for (int var15 = 0; var15 < var2; var15++) {
         Class_ne var11 = var1[var15];
         if (var11 != null) {
            for (int var12 = 0; var12 < var11.U; var12++) {
               if (var3 && var11.V != null) {
                  this.V[this.U] = var11.V[var12];
               }

               if (var4) {
                  if (var11.Z != null) {
                     this.Z[this.U] = var11.Z[var12];
                  } else {
                     this.Z[this.U] = var11.ib;
                  }
               }

               if (var5 && var11.Y != null) {
                  this.Y[this.U] = var11.Y[var12];
               }

               if (var6 && var11.Q != null) {
                  this.Q[this.U] = var11.Q[var12];
               }

               if (var7) {
                  if (var11.K != null) {
                     this.K[this.U] = var11.K[var12];
                  } else {
                     this.K[this.U] = -1;
                  }
               }

               if (var8) {
                  if (var11.lb != null && var11.lb[var12] != -1) {
                     this.lb[this.U] = (byte)(var11.lb[var12] + this.E);
                  } else {
                     this.lb[this.U] = -1;
                  }
               }

               this.H[this.U] = var11.H[var12];
               this.r[this.U] = this.a(var11, var11.r[var12]);
               this.fb[this.U] = this.a(var11, var11.fb[var12]);
               this.I[this.U] = this.a(var11, var11.I[var12]);
               this.U++;
            }

            for (int var13 = 0; var13 < var11.E; var13++) {
               byte var14 = this.G[this.E] = var11.G[var13];
               if (var14 == 0) {
                  this.z[this.E] = (short)this.a(var11, var11.z[var13]);
                  this.x[this.E] = (short)this.a(var11, var11.x[var13]);
                  this.C[this.E] = (short)this.a(var11, var11.C[var13]);
               }

               if (var14 >= 1 && var14 <= 3) {
                  this.z[this.E] = var11.z[var13];
                  this.x[this.E] = var11.x[var13];
                  this.C[this.E] = var11.C[var13];
                  this.R[this.E] = var11.R[var13];
                  this.B[this.E] = var11.B[var13];
                  this.M[this.E] = var11.M[var13];
                  this.s[this.E] = var11.s[var13];
                  this.A[this.E] = var11.A[var13];
                  this.F[this.E] = var11.F[var13];
               }

               if (var14 == 2) {
                  this.J[this.E] = var11.J[var13];
                  this.eb[this.E] = var11.eb[var13];
               }

               this.E++;
            }
         }
      }
   }

   Class_ne(Class_ne var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      this.q = var1.q;
      this.U = var1.U;
      this.E = var1.E;
      if (var2) {
         this.W = var1.W;
         this.S = var1.S;
         this.L = var1.L;
      } else {
         this.W = new int[this.q];
         this.S = new int[this.q];
         this.L = new int[this.q];

         for (int var6 = 0; var6 < this.q; var6++) {
            this.W[var6] = var1.W[var6];
            this.S[var6] = var1.S[var6];
            this.L[var6] = var1.L[var6];
         }
      }

      if (var3) {
         this.H = var1.H;
      } else {
         this.H = new short[this.U];

         for (int var7 = 0; var7 < this.U; var7++) {
            this.H[var7] = var1.H[var7];
         }
      }

      if (!var4 && var1.K != null) {
         this.K = new short[this.U];

         for (int var8 = 0; var8 < this.U; var8++) {
            this.K[var8] = var1.K[var8];
         }
      } else {
         this.K = var1.K;
      }

      if (var5) {
         this.Y = var1.Y;
      } else {
         this.Y = new byte[this.U];
         if (var1.Y == null) {
            for (int var9 = 0; var9 < this.U; var9++) {
               this.Y[var9] = 0;
            }
         } else {
            for (int var10 = 0; var10 < this.U; var10++) {
               this.Y[var10] = var1.Y[var10];
            }
         }
      }

      this.r = var1.r;
      this.fb = var1.fb;
      this.I = var1.I;
      this.V = var1.V;
      this.Z = var1.Z;
      this.lb = var1.lb;
      this.ib = var1.ib;
      this.G = var1.G;
      this.z = var1.z;
      this.x = var1.x;
      this.C = var1.C;
      this.R = var1.R;
      this.B = var1.B;
      this.M = var1.M;
      this.s = var1.s;
      this.A = var1.A;
      this.F = var1.F;
      this.J = var1.J;
      this.eb = var1.eb;
      this.ab = var1.ab;
      this.Q = var1.Q;
      this.gb = var1.gb;
      this.db = var1.db;
      this.w = var1.w;
      this.t = var1.t;
      this.X = var1.X;
      this.N = var1.N;
      this.T = var1.T;
   }
}
