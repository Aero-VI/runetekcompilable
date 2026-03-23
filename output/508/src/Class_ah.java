final class Class_ah {
   private static float a;
   private int[][][] b;
   int[] c = new int[2];
   static int[][] d = new int[2][8];
   static int e;
   private int[][][] f = new int[2][2][4];
   private static float[][] g = new float[2][8];
   private int[] h;

   final void a(Class_lh var1, Class_ag var2) {
      int var3 = var1.n(-6677);
      this.c[0] = var3 >> 4;
      this.c[1] = var3 & 15;
      if (var3 == 0) {
         this.h[0] = this.h[1] = 0;
      } else {
         this.h[0] = var1.k(1355769544);
         this.h[1] = var1.k(1355769544);
         int var4 = var1.n(-6677);

         for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.c[var5]; var6++) {
               this.b[var5][0][var6] = var1.k(1355769544);
               this.f[var5][0][var6] = var1.k(1355769544);
            }
         }

         for (int var8 = 0; var8 < 2; var8++) {
            for (int var7 = 0; var7 < this.c[var8]; var7++) {
               if ((var4 & 1 << var8 * 4 << var7) != 0) {
                  this.b[var8][1][var7] = var1.k(1355769544);
                  this.f[var8][1][var7] = var1.k(1355769544);
               } else {
                  this.b[var8][1][var7] = this.b[var8][0][var7];
                  this.f[var8][1][var7] = this.f[var8][0][var7];
               }
            }
         }

         if (var4 != 0 || this.h[1] != this.h[0]) {
            var2.a(var1);
         }
      }
   }

   final int a(int var1, float var2) {
      if (var1 == 0) {
         float var3 = this.h[0] + (this.h[1] - this.h[0]) * var2;
         var3 *= 0.0030517578F;
         a = (float)Math.pow(0.1, var3 / 20.0F);
         e = (int)(a * 65536.0F);
      }

      if (this.c[var1] == 0) {
         return 0;
      } else {
         float var9 = this.b(var1, 0, var2);
         g[var1][0] = -2.0F * var9 * (float)Math.cos(this.a(var1, 0, var2));
         g[var1][1] = var9 * var9;

         for (int var4 = 1; var4 < this.c[var1]; var4++) {
            var9 = this.b(var1, var4, var2);
            float var5 = -2.0F * var9 * (float)Math.cos(this.a(var1, var4, var2));
            float var6 = var9 * var9;
            g[var1][var4 * 2 + 1] = g[var1][var4 * 2 - 1] * var6;
            g[var1][var4 * 2] = g[var1][var4 * 2 - 1] * var5 + g[var1][var4 * 2 - 2] * var6;

            for (int var7 = var4 * 2 - 1; var7 >= 2; var7--) {
               g[var1][var7] = g[var1][var7] + (g[var1][var7 - 1] * var5 + g[var1][var7 - 2] * var6);
            }

            g[var1][1] = g[var1][1] + (g[var1][0] * var5 + var6);
            g[var1][0] = g[var1][0] + var5;
         }

         if (var1 == 0) {
            for (int var11 = 0; var11 < this.c[0] * 2; var11++) {
               g[0][var11] = g[0][var11] * a;
            }
         }

         for (int var12 = 0; var12 < this.c[var1] * 2; var12++) {
            d[var1][var12] = (int)(g[var1][var12] * 65536.0F);
         }

         return this.c[var1] * 2;
      }
   }

   private final float a(int var1, int var2, float var3) {
      float var4 = this.b[var1][0][var2] + var3 * (this.b[var1][1][var2] - this.b[var1][0][var2]);
      var4 *= 1.2207031E-4F;
      return a(var4);
   }

   private static final float a(float var0) {
      float var1 = 32.703197F * (float)Math.pow(2.0, var0);
      return var1 * 3.1415927F / 11025.0F;
   }

   public static void a() {
      g = null;
      d = null;
   }

   private final float b(int var1, int var2, float var3) {
      float var4 = this.f[var1][0][var2] + var3 * (this.f[var1][1][var2] - this.f[var1][0][var2]);
      var4 *= 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0, -var4 / 20.0F);
   }

   public Class_ah() {
      this.b = new int[2][2][4];
      this.h = new int[2];
   }
}
