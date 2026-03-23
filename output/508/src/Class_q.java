final class Class_q extends Class_li {
   private int p;
   private static Class_qi[] q;
   private boolean r;
   private int s;
   private static boolean t = false;
   private static float[] u;
   private static float[] v;
   private int w;
   private byte[][] x;
   private static int[] y;
   private static float[] z;
   private static int A;
   private static Class_gd[] B;
   private static float[] C;
   private static Class_ge[] D;
   private static float[] E;
   private static int F;
   private int G;
   private static boolean[] H;
   private int I;
   private static byte[] J;
   private static float[] K;
   private static int[] L;
   private static float[] M;
   private float[] N;
   static Class_da[] O;
   private int P;
   private static int Q;
   private boolean R;
   private static int[] S;
   private static int T;
   private int U;
   private byte[] V;
   private int W;

   static final int d(int var0) {
      int var1 = 0;
      int var2 = 0;

      while (var0 >= 8 - A) {
         int var3 = 8 - A;
         int var4 = (1 << var3) - 1;
         var1 += (J[Q] >> A & var4) << var2;
         A = 0;
         Q++;
         var2 += var3;
         var0 -= var3;
      }

      if (var0 > 0) {
         int var5 = (1 << var0) - 1;
         var1 += (J[Q] >> A & var5) << var2;
         A += var0;
      }

      return var1;
   }

   private final void a(byte[] var1) {
      Class_lh var2 = new Class_lh(var1);
      this.I = var2.h(-5528);
      this.w = var2.h(-5528);
      this.P = var2.h(-5528);
      this.p = var2.h(-5528);
      if (this.p < 0) {
         this.p = ~this.p;
         this.R = true;
      }

      int var3 = var2.h(-5528);
      this.x = new byte[var3][];

      for (int var4 = 0; var4 < var3; var4++) {
         int var5 = 0;

         int var6;
         do {
            var6 = var2.n(-6677);
            var5 += var6;
         } while (var6 >= 255);

         byte[] var7 = new byte[var5];
         var2.a(0, 0, var5, var7);
         this.x[var4] = var7;
      }
   }

   static final Class_q a(Class_cj var0, int var1, int var2) {
      if (!a(var0)) {
         var0.a(var1, var2, (byte)-101);
         return null;
      } else {
         byte[] var3 = var0.a(var2, 0, var1);
         return var3 == null ? null : new Class_q(var3);
      }
   }

   final Class_k a(int[] var1) {
      if (var1 != null && var1[0] <= 0) {
         return null;
      } else {
         if (this.V == null) {
            this.G = 0;
            this.N = new float[T];
            this.V = new byte[this.w];
            this.U = 0;
            this.W = 0;
         }

         for (; this.W < this.x.length; this.W++) {
            if (var1 != null && var1[0] <= 0) {
               return null;
            }

            float[] var2 = this.e(this.W);
            if (var2 != null) {
               int var3 = this.U;
               int var4 = var2.length;
               if (var4 > this.w - var3) {
                  var4 = this.w - var3;
               }

               for (int var5 = 0; var5 < var4; var5++) {
                  int var6 = (int)(128.0F + var2[var5] * 128.0F);
                  if ((var6 & -256) != 0) {
                     var6 = ~var6 >> 31;
                  }

                  this.V[var3++] = (byte)(var6 - 128);
               }

               if (var1 != null) {
                  var1[0] -= var3 - this.U;
               }

               this.U = var3;
            }
         }

         this.N = null;
         byte[] var7 = this.V;
         this.V = null;
         return new Class_k(this.I, var7, this.P, this.p, this.R);
      }
   }

   private static final void a(byte[] var0, int var1) {
      J = var0;
      Q = var1;
      A = 0;
   }

   private final float[] e(int var1) {
      a(this.x[var1], 0);
      a();
      int var2 = d(Class_pc.a(y.length - 1, (byte)33));
      boolean var3 = H[var2];
      int var4 = var3 ? T : F;
      boolean var5 = false;
      boolean var6 = false;
      if (var3) {
         var5 = a() != 0;
         var6 = a() != 0;
      }

      int var7 = var4 >> 1;
      int var8;
      int var9;
      int var10;
      if (var3 && !var5) {
         var8 = (var4 >> 2) - (F >> 2);
         var9 = (var4 >> 2) + (F >> 2);
         var10 = F >> 1;
      } else {
         var8 = 0;
         var9 = var7;
         var10 = var4 >> 1;
      }

      int var11;
      int var12;
      int var13;
      if (var3 && !var6) {
         var11 = var4 - (var4 >> 2) - (F >> 2);
         var12 = var4 - (var4 >> 2) + (F >> 2);
         var13 = F >> 1;
      } else {
         var11 = var7;
         var12 = var4;
         var13 = var4 >> 1;
      }

      Class_qi var14 = q[y[var2]];
      int var16 = var14.a;
      int var17 = var14.d[var16];
      boolean var15 = !D[var17].b();
      boolean var18 = var15;

      for (int var19 = 0; var19 < var14.b; var19++) {
         Class_gd var20 = B[var14.c[var19]];
         float[] var21 = M;
         var20.a(var21, var4 >> 1, var18);
      }

      if (!var15) {
         int var47 = var14.a;
         int var51 = var14.d[var47];
         D[var51].a(M, var4 >> 1);
      }

      if (var15) {
         for (int var48 = var4 >> 1; var48 < var4; var48++) {
            M[var48] = 0.0F;
         }
      } else {
         int var49 = var4 >> 1;
         int var52 = var4 >> 2;
         int var22 = var4 >> 3;
         float[] var23 = M;

         for (int var24 = 0; var24 < var49; var24++) {
            var23[var24] *= 0.5F;
         }

         for (int var25 = var49; var25 < var4; var25++) {
            var23[var25] = -var23[var4 - var25 - 1];
         }

         float[] var26 = var3 ? C : u;
         float[] var27 = var3 ? E : K;
         float[] var28 = var3 ? z : v;
         int[] var29 = var3 ? L : S;

         for (int var30 = 0; var30 < var52; var30++) {
            float var31 = var23[4 * var30] - var23[var4 - 4 * var30 - 1];
            float var32 = var23[4 * var30 + 2] - var23[var4 - 4 * var30 - 3];
            float var33 = var26[2 * var30];
            float var34 = var26[2 * var30 + 1];
            var23[var4 - 4 * var30 - 1] = var31 * var33 - var32 * var34;
            var23[var4 - 4 * var30 - 3] = var31 * var34 + var32 * var33;
         }

         for (int var59 = 0; var59 < var22; var59++) {
            float var60 = var23[var49 + 3 + 4 * var59];
            float var62 = var23[var49 + 1 + 4 * var59];
            float var64 = var23[4 * var59 + 3];
            float var35 = var23[4 * var59 + 1];
            var23[var49 + 3 + 4 * var59] = var60 + var64;
            var23[var49 + 1 + 4 * var59] = var62 + var35;
            float var36 = var26[var49 - 4 - 4 * var59];
            float var37 = var26[var49 - 3 - 4 * var59];
            var23[4 * var59 + 3] = (var60 - var64) * var36 - (var62 - var35) * var37;
            var23[4 * var59 + 1] = (var62 - var35) * var36 + (var60 - var64) * var37;
         }

         int var61 = Class_pc.a(var4 - 1, (byte)-114);

         for (int var63 = 0; var63 < var61 - 3; var63++) {
            int var65 = var4 >> var63 + 2;
            int var67 = 8 << var63;

            for (int var70 = 0; var70 < 2 << var63; var70++) {
               int var73 = var4 - var65 * 2 * var70;
               int var38 = var4 - var65 * (2 * var70 + 1);

               for (int var39 = 0; var39 < var4 >> var63 + 4; var39++) {
                  int var40 = 4 * var39;
                  float var41 = var23[var73 - 1 - var40];
                  float var42 = var23[var73 - 3 - var40];
                  float var43 = var23[var38 - 1 - var40];
                  float var44 = var23[var38 - 3 - var40];
                  var23[var73 - 1 - var40] = var41 + var43;
                  var23[var73 - 3 - var40] = var42 + var44;
                  float var45 = var26[var39 * var67];
                  float var46 = var26[var39 * var67 + 1];
                  var23[var38 - 1 - var40] = (var41 - var43) * var45 - (var42 - var44) * var46;
                  var23[var38 - 3 - var40] = (var42 - var44) * var45 + (var41 - var43) * var46;
               }
            }
         }

         for (int var66 = 1; var66 < var22 - 1; var66++) {
            int var68 = var29[var66];
            if (var66 < var68) {
               int var71 = 8 * var66;
               int var74 = 8 * var68;
               float var76 = var23[var71 + 1];
               var23[var71 + 1] = var23[var74 + 1];
               var23[var74 + 1] = var76;
               var76 = var23[var71 + 3];
               var23[var71 + 3] = var23[var74 + 3];
               var23[var74 + 3] = var76;
               var76 = var23[var71 + 5];
               var23[var71 + 5] = var23[var74 + 5];
               var23[var74 + 5] = var76;
               var76 = var23[var71 + 7];
               var23[var71 + 7] = var23[var74 + 7];
               var23[var74 + 7] = var76;
            }
         }

         for (int var69 = 0; var69 < var49; var69++) {
            var23[var69] = var23[2 * var69 + 1];
         }

         for (int var72 = 0; var72 < var22; var72++) {
            var23[var4 - 1 - 2 * var72] = var23[4 * var72];
            var23[var4 - 2 - 2 * var72] = var23[4 * var72 + 1];
            var23[var4 - var52 - 1 - 2 * var72] = var23[4 * var72 + 2];
            var23[var4 - var52 - 2 - 2 * var72] = var23[4 * var72 + 3];
         }

         for (int var75 = 0; var75 < var22; var75++) {
            float var80 = var28[2 * var75];
            float var82 = var28[2 * var75 + 1];
            float var84 = var23[var49 + 2 * var75];
            float var86 = var23[var49 + 2 * var75 + 1];
            float var88 = var23[var4 - 2 - 2 * var75];
            float var90 = var23[var4 - 1 - 2 * var75];
            float var92 = var82 * (var84 - var88) + var80 * (var86 + var90);
            var23[var49 + 2 * var75] = (var84 + var88 + var92) * 0.5F;
            var23[var4 - 2 - 2 * var75] = (var84 + var88 - var92) * 0.5F;
            var92 = var82 * (var86 + var90) - var80 * (var84 - var88);
            var23[var49 + 2 * var75 + 1] = (var86 - var90 + var92) * 0.5F;
            var23[var4 - 1 - 2 * var75] = (-var86 + var90 + var92) * 0.5F;
         }

         for (int var81 = 0; var81 < var52; var81++) {
            var23[var81] = var23[2 * var81 + var49] * var27[2 * var81] + var23[2 * var81 + 1 + var49] * var27[2 * var81 + 1];
            var23[var49 - 1 - var81] = var23[2 * var81 + var49] * var27[2 * var81 + 1] - var23[2 * var81 + 1 + var49] * var27[2 * var81];
         }

         for (int var83 = 0; var83 < var52; var83++) {
            var23[var4 - var52 + var83] = -var23[var83];
         }

         for (int var85 = 0; var85 < var52; var85++) {
            var23[var85] = var23[var52 + var85];
         }

         for (int var87 = 0; var87 < var52; var87++) {
            var23[var52 + var87] = -var23[var52 - var87 - 1];
         }

         for (int var89 = 0; var89 < var52; var89++) {
            var23[var49 + var89] = var23[var4 - var89 - 1];
         }

         for (int var91 = var8; var91 < var9; var91++) {
            float var94 = (float)Math.sin((var91 - var8 + 0.5) / var10 * 0.5 * 3.141592653589793);
            M[var91] = M[var91] * (float)Math.sin(1.5707963267948966 * var94 * var94);
         }

         for (int var95 = var11; var95 < var12; var95++) {
            float var96 = (float)Math.sin((var95 - var11 + 0.5) / var13 * 0.5 * 3.141592653589793 + 1.5707963267948966);
            M[var95] = M[var95] * (float)Math.sin(1.5707963267948966 * var96 * var96);
         }
      }

      float[] var50 = null;
      if (this.G > 0) {
         int var53 = this.G + var4 >> 2;
         var50 = new float[var53];
         if (!this.r) {
            for (int var55 = 0; var55 < this.s; var55++) {
               int var57 = (this.G >> 1) + var55;
               var50[var55] += this.N[var57];
            }
         }

         if (!var15) {
            for (int var56 = var8; var56 < var4 >> 1; var56++) {
               int var58 = var50.length - (var4 >> 1) + var56;
               var50[var58] += M[var56];
            }
         }
      }

      float[] var54 = this.N;
      this.N = M;
      M = var54;
      this.G = var4;
      this.s = var12 - (var4 >> 1);
      this.r = var15;
      return var50;
   }

   static final int a() {
      int var0 = J[Q] >> A & 1;
      A++;
      Q = Q + (A >> 3);
      A &= 7;
      return var0;
   }

   static final float f(int var0) {
      int var1 = var0 & 2097151;
      int var2 = var0 & -2147483648;
      int var3 = (var0 & 2145386496) >> 21;
      if (var2 != 0) {
         var1 = -var1;
      }

      return (float)(var1 * Math.pow(2.0, var3 - 788));
   }

   private static final boolean a(Class_cj var0) {
      if (!t) {
         byte[] var1 = var0.a(0, 0, 0);
         if (var1 == null) {
            return false;
         }

         b(var1);
         t = true;
      }

      return true;
   }

   private static final void b(byte[] var0) {
      a(var0, 0);
      F = 1 << d(4);
      T = 1 << d(4);
      M = new float[T];

      for (int var1 = 0; var1 < 2; var1++) {
         int var2 = var1 != 0 ? T : F;
         int var3 = var2 >> 1;
         int var4 = var2 >> 2;
         int var5 = var2 >> 3;
         float[] var6 = new float[var3];

         for (int var7 = 0; var7 < var4; var7++) {
            var6[2 * var7] = (float)Math.cos(4 * var7 * 3.141592653589793 / var2);
            var6[2 * var7 + 1] = -((float)Math.sin(4 * var7 * 3.141592653589793 / var2));
         }

         float[] var8 = new float[var3];

         for (int var9 = 0; var9 < var4; var9++) {
            var8[2 * var9] = (float)Math.cos((2 * var9 + 1) * 3.141592653589793 / (2 * var2));
            var8[2 * var9 + 1] = (float)Math.sin((2 * var9 + 1) * 3.141592653589793 / (2 * var2));
         }

         float[] var10 = new float[var4];

         for (int var11 = 0; var11 < var5; var11++) {
            var10[2 * var11] = (float)Math.cos((4 * var11 + 2) * 3.141592653589793 / var2);
            var10[2 * var11 + 1] = -((float)Math.sin((4 * var11 + 2) * 3.141592653589793 / var2));
         }

         int[] var12 = new int[var5];
         int var13 = Class_pc.a(var5 - 1, (byte)75);

         for (int var14 = 0; var14 < var5; var14++) {
            var12[var14] = Class_ma.a((byte)-88, var14, var13);
         }

         if (var1 != 0) {
            C = var6;
            E = var8;
            z = var10;
            L = var12;
         } else {
            u = var6;
            K = var8;
            v = var10;
            S = var12;
         }
      }

      int var15 = d(8) + 1;
      O = new Class_da[var15];

      for (int var16 = 0; var16 < var15; var16++) {
         O[var16] = new Class_da();
      }

      int var17 = d(6) + 1;

      for (int var18 = 0; var18 < var17; var18++) {
         d(16);
      }

      int var19 = d(6) + 1;
      D = new Class_ge[var19];

      for (int var20 = 0; var20 < var19; var20++) {
         D[var20] = new Class_ge();
      }

      int var21 = d(6) + 1;
      B = new Class_gd[var21];

      for (int var22 = 0; var22 < var21; var22++) {
         B[var22] = new Class_gd();
      }

      int var23 = d(6) + 1;
      q = new Class_qi[var23];

      for (int var24 = 0; var24 < var23; var24++) {
         q[var24] = new Class_qi();
      }

      int var25 = d(6) + 1;
      H = new boolean[var25];
      y = new int[var25];

      for (int var26 = 0; var26 < var25; var26++) {
         H[var26] = a() != 0;
         d(16);
         d(16);
         y[var26] = d(8);
      }
   }

   public static void b() {
      J = null;
      O = null;
      D = null;
      B = null;
      q = null;
      H = null;
      y = null;
      M = null;
      u = null;
      K = null;
      v = null;
      C = null;
      E = null;
      z = null;
      S = null;
      L = null;
   }

   private Class_q(byte[] var1) {
      this.a(var1);
   }
}
