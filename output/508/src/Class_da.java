final class Class_da {
   int a;
   private int[] b;
   private float[][] c;
   private int d;
   private int[] e;
   private int[] f;

   final float[] a() {
      return this.c[this.c()];
   }

   private static final int a(int var0, int var1) {
      int var2 = (int)Math.pow(var0, 1.0 / var1) + 1;

      while (Class_oi.a(var1, var2, 107) > var0) {
         var2--;
      }

      return var2;
   }

   private final void b() {
      int[] var1 = new int[this.d];
      int[] var2 = new int[33];

      for (int var3 = 0; var3 < this.d; var3++) {
         int var4 = this.e[var3];
         if (var4 != 0) {
            int var5 = 1 << 32 - var4;
            int var6 = var2[var4];
            var1[var3] = var6;
            int var7;
            if ((var6 & var5) != 0) {
               var7 = var2[var4 - 1];
            } else {
               var7 = var6 | var5;

               for (int var8 = var4 - 1; var8 >= 1; var8--) {
                  int var9 = var2[var8];
                  if (var9 != var6) {
                     break;
                  }

                  int var10 = 1 << 32 - var8;
                  if ((var9 & var10) != 0) {
                     var2[var8] = var2[var8 - 1];
                     break;
                  }

                  var2[var8] = var9 | var10;
               }
            }

            var2[var4] = var7;

            for (int var17 = var4 + 1; var17 <= 32; var17++) {
               int var19 = var2[var17];
               if (var19 == var6) {
                  var2[var17] = var7;
               }
            }
         }
      }

      this.f = new int[8];
      int var13 = 0;

      for (int var14 = 0; var14 < this.d; var14++) {
         int var15 = this.e[var14];
         if (var15 != 0) {
            int var16 = var1[var14];
            int var18 = 0;

            for (int var20 = 0; var20 < var15; var20++) {
               int var21 = -2147483648 >>> var20;
               if ((var16 & var21) != 0) {
                  if (this.f[var18] == 0) {
                     this.f[var18] = var13;
                  }

                  var18 = this.f[var18];
               } else {
                  var18++;
               }

               if (var18 >= this.f.length) {
                  int[] var11 = new int[this.f.length * 2];

                  for (int var12 = 0; var12 < this.f.length; var12++) {
                     var11[var12] = this.f[var12];
                  }

                  this.f = var11;
               }

               var21 >>>= 1;
            }

            this.f[var18] = ~var14;
            if (var18 >= var13) {
               var13 = var18 + 1;
            }
         }
      }
   }

   Class_da() {
      Class_q.d(24);
      this.a = Class_q.d(16);
      this.d = Class_q.d(24);
      this.e = new int[this.d];
      boolean var1 = Class_q.a() != 0;
      if (var1) {
         int var2 = 0;

         for (int var3 = Class_q.d(5) + 1; var2 < this.d; var3++) {
            int var4 = Class_q.d(Class_pc.a(this.d - var2, (byte)-108));

            for (int var5 = 0; var5 < var4; var5++) {
               this.e[var2++] = var3;
            }
         }
      } else {
         boolean var15 = Class_q.a() != 0;

         for (int var17 = 0; var17 < this.d; var17++) {
            if (var15 && Class_q.a() == 0) {
               this.e[var17] = 0;
            } else {
               this.e[var17] = Class_q.d(5) + 1;
            }
         }
      }

      this.b();
      int var16 = Class_q.d(4);
      if (var16 > 0) {
         float var18 = Class_q.f(Class_q.d(32));
         float var19 = Class_q.f(Class_q.d(32));
         int var20 = Class_q.d(4) + 1;
         boolean var6 = Class_q.a() != 0;
         int var7;
         if (var16 == 1) {
            var7 = a(this.d, this.a);
         } else {
            var7 = this.d * this.a;
         }

         this.b = new int[var7];

         for (int var8 = 0; var8 < var7; var8++) {
            this.b[var8] = Class_q.d(var20);
         }

         this.c = new float[this.d][this.a];
         if (var16 == 1) {
            for (int var21 = 0; var21 < this.d; var21++) {
               float var22 = 0.0F;
               int var23 = 1;

               for (int var24 = 0; var24 < this.a; var24++) {
                  int var25 = var21 / var23 % var7;
                  float var14 = this.b[var25] * var19 + var18 + var22;
                  this.c[var21][var24] = var14;
                  if (var6) {
                     var22 = var14;
                  }

                  var23 *= var7;
               }
            }

            return;
         }

         for (int var9 = 0; var9 < this.d; var9++) {
            float var10 = 0.0F;
            int var11 = var9 * this.a;

            for (int var12 = 0; var12 < this.a; var12++) {
               float var13 = this.b[var11] * var19 + var18 + var10;
               this.c[var9][var12] = var13;
               if (var6) {
                  var10 = var13;
               }

               var11++;
            }
         }
      }
   }

   final int c() {
      int var1 = 0;

      while (this.f[var1] >= 0) {
         var1 = Class_q.a() != 0 ? this.f[var1] : var1 + 1;
      }

      return ~this.f[var1];
   }
}
