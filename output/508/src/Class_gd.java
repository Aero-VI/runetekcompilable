final class Class_gd {
   private int a;
   private int b;
   private int[] c;
   private int d;
   private int e;
   private int f;
   private int g = Class_q.d(16);

   final void a(float[] var1, int var2, boolean var3) {
      for (int var4 = 0; var4 < var2; var4++) {
         var1[var4] = 0.0F;
      }

      if (!var3) {
         int var5 = Class_q.O[this.b].a;
         int var6 = this.e - this.a;
         int var7 = var6 / this.d;
         int[] var8 = new int[var7];

         for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;

            while (var10 < var7) {
               if (var9 == 0) {
                  int var11 = Class_q.O[this.b].c();

                  for (int var12 = var5 - 1; var12 >= 0; var12--) {
                     if (var10 + var12 < var7) {
                        var8[var10 + var12] = var11 % this.f;
                     }

                     var11 /= this.f;
                  }
               }

               for (int var20 = 0; var20 < var5; var20++) {
                  int var21 = var8[var10];
                  int var13 = this.c[var21 * 8 + var9];
                  if (var13 >= 0) {
                     int var14 = this.a + var10 * this.d;
                     Class_da var15 = Class_q.O[var13];
                     if (this.g == 0) {
                        int var22 = this.d / var15.a;

                        for (int var23 = 0; var23 < var22; var23++) {
                           float[] var24 = var15.a();

                           for (int var19 = 0; var19 < var15.a; var19++) {
                              var1[var14 + var23 + var19 * var22] = var1[var14 + var23 + var19 * var22] + var24[var19];
                           }
                        }
                     } else {
                        int var16 = 0;

                        while (var16 < this.d) {
                           float[] var17 = var15.a();

                           for (int var18 = 0; var18 < var15.a; var18++) {
                              var1[var14 + var16] = var1[var14 + var16] + var17[var18];
                              var16++;
                           }
                        }
                     }
                  }

                  if (++var10 >= var7) {
                     break;
                  }
               }
            }
         }
      }
   }

   Class_gd() {
      this.a = Class_q.d(24);
      this.e = Class_q.d(24);
      this.d = Class_q.d(24) + 1;
      this.f = Class_q.d(6) + 1;
      this.b = Class_q.d(8);
      int[] var1 = new int[this.f];

      for (int var2 = 0; var2 < this.f; var2++) {
         int var3 = 0;
         int var4 = Class_q.d(3);
         boolean var5 = Class_q.a() != 0;
         if (var5) {
            var3 = Class_q.d(5);
         }

         var1[var2] = var3 << 3 | var4;
      }

      this.c = new int[this.f * 8];

      for (int var6 = 0; var6 < this.f * 8; var6++) {
         this.c[var6] = (var1[var6 >> 3] & 1 << (var6 & 7)) != 0 ? Class_q.d(8) : -1;
      }
   }
}
