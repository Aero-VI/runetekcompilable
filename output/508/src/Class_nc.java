final class Class_nc {
   static int a;
   static int b = 0;
   static int[] c;
   static int d = 0;
   static int e;
   static int[] f;
   static int g = 0;
   static int h = 0;
   static int[] i;

   static final void a(int var0, int var1, int var2, int var3, int var4) {
      d(var0, var1, var2, var4);
      d(var0, var1 + var3 - 1, var2, var4);
      e(var0, var1, var3, var4);
      e(var0 + var2 - 1, var1, var3, var4);
   }

   static final void a() {
      d = 0;
      g = 0;
      b = e;
      h = a;
      d();
   }

   static final void b(int var0, int var1, int var2, int var3, int var4) {
      var2 -= var0;
      var3 -= var1;
      if (var3 == 0) {
         if (var2 >= 0) {
            d(var0, var1, var2 + 1, var4);
         } else {
            d(var0 + var2, var1, -var2 + 1, var4);
         }
      } else if (var2 == 0) {
         if (var3 >= 0) {
            e(var0, var1, var3 + 1, var4);
         } else {
            e(var0, var1 + var3, -var3 + 1, var4);
         }
      } else {
         if (var2 + var3 < 0) {
            var0 += var2;
            var2 = -var2;
            var1 += var3;
            var3 = -var3;
         }

         if (var2 > var3) {
            var1 <<= 16;
            var1 += 32768;
            var3 <<= 16;
            int var17 = (int)Math.floor((double)var3 / var2 + 0.5);
            var2 += var0;
            if (var0 < d) {
               var1 += var17 * (d - var0);
               var0 = d;
            }

            if (var2 >= b) {
               var2 = b - 1;
            }

            while (var0 <= var2) {
               int var18 = var1 >> 16;
               if (var18 >= g && var18 < h) {
                  f[var0 + var18 * e] = var4;
               }

               var1 += var17;
               var0++;
            }
         } else {
            var0 <<= 16;
            var0 += 32768;
            var2 <<= 16;
            int var5 = (int)Math.floor((double)var2 / var3 + 0.5);
            var3 += var1;
            if (var1 < g) {
               var0 += var5 * (g - var1);
               var1 = g;
            }

            if (var3 >= h) {
               var3 = h - 1;
            }

            while (var1 <= var3) {
               int var6 = var0 >> 16;
               if (var6 >= d && var6 < b) {
                  f[var6 + var1 * e] = var4;
               }

               var0 += var5;
               var1++;
            }
         }
      }
   }

   static final void b() {
      int var0 = 0;

      int var1;
      for (var1 = e * a - 7; var0 < var1; f[var0++] = 0) {
         f[var0++] = 0;
         f[var0++] = 0;
         f[var0++] = 0;
         f[var0++] = 0;
         f[var0++] = 0;
         f[var0++] = 0;
         f[var0++] = 0;
      }

      var1 += 7;

      while (var0 < var1) {
         f[var0++] = 0;
      }
   }

   static final void a(int var0, int var1, int var2, int[] var3, int[] var4) {
      int var5 = var0 + var1 * e;

      for (int var8 = 0; var8 < var3.length; var8++) {
         int var6 = var5 + var3[var8];

         for (int var7 = -var4[var8]; var7 < 0; var7++) {
            f[var6++] = var2;
         }

         var5 += e;
      }
   }

   public static void c() {
      f = null;
      c = null;
      i = null;
   }

   private static final void c(int var0, int var1, int var2, int var3, int var4) {
      if (var0 >= d && var0 < b) {
         if (var1 < g) {
            var2 -= g - var1;
            var1 = g;
         }

         if (var1 + var2 > h) {
            var2 = h - var1;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 0xFF) * var4;
         int var7 = (var3 >> 8 & 0xFF) * var4;
         int var8 = (var3 & 0xFF) * var4;
         int var12 = var0 + var1 * e;

         for (int var13 = 0; var13 < var2; var13++) {
            int var9 = (f[var12] >> 16 & 0xFF) * var5;
            int var10 = (f[var12] >> 8 & 0xFF) * var5;
            int var11 = (f[var12] & 0xFF) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            f[var12] = var14;
            var12 += e;
         }
      }
   }

   static final void a(int[] var0) {
      d = var0[0];
      g = var0[1];
      b = var0[2];
      h = var0[3];
      d();
   }

   private static final void a(int var0, int var1, int var2) {
      if (var0 >= d && var1 >= g && var0 < b && var1 < h) {
         f[var0 + var1 * e] = var2;
      }
   }

   static final void a(int[] var0, int[] var1) {
      if (var0.length == h - g && var1.length == h - g) {
         c = var0;
         i = var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   private static final void a(int var0, int var1, int var2, int var3) {
      if (var2 == 0) {
         a(var0, var1, var3);
      } else {
         if (var2 < 0) {
            var2 = -var2;
         }

         int var4 = var1 - var2;
         if (var4 < g) {
            var4 = g;
         }

         int var5 = var1 + var2 + 1;
         if (var5 > h) {
            var5 = h;
         }

         int var6 = var4;
         int var7 = var2 * var2;
         int var8 = 0;
         int var9 = var1 - var4;
         int var10 = var9 * var9;
         int var11 = var10 - var9;
         if (var1 > var5) {
            var1 = var5;
         }

         while (var6 < var1) {
            while (var11 <= var7 || var10 <= var7) {
               var10 += var8 + var8;
               var11 += var8++ + var8;
            }

            int var12 = var0 - var8 + 1;
            if (var12 < d) {
               var12 = d;
            }

            int var13 = var0 + var8;
            if (var13 > b) {
               var13 = b;
            }

            int var14 = var12 + var6 * e;

            for (int var15 = var12; var15 < var13; var15++) {
               f[var14++] = var3;
            }

            var6++;
            var10 -= var9-- + var9;
            var11 -= var9 + var9;
         }

         var8 = var2;
         var9 = var6 - var1;
         var11 = var9 * var9 + var7;
         var10 = var11 - var2;

         for (int var20 = var11 - var9; var6 < var5; var10 += var9++ + var9) {
            while (var20 > var7 && var10 > var7) {
               var20 -= var8-- + var8;
               var10 -= var8 + var8;
            }

            int var21 = var0 - var8;
            if (var21 < d) {
               var21 = d;
            }

            int var22 = var0 + var8;
            if (var22 > b - 1) {
               var22 = b - 1;
            }

            int var23 = var21 + var6 * e;

            for (int var24 = var21; var24 <= var22; var24++) {
               f[var23++] = var3;
            }

            var6++;
            var20 += var9 + var9;
         }
      }
   }

   static final void b(int var0, int var1, int var2, int var3) {
      if (d < var0) {
         d = var0;
      }

      if (g < var1) {
         g = var1;
      }

      if (b > var2) {
         b = var2;
      }

      if (h > var3) {
         h = var3;
      }

      d();
   }

   static final void c(int var0, int var1, int var2, int var3) {
      if (var0 < 0) {
         var0 = 0;
      }

      if (var1 < 0) {
         var1 = 0;
      }

      if (var2 > e) {
         var2 = e;
      }

      if (var3 > a) {
         var3 = a;
      }

      d = var0;
      g = var1;
      b = var2;
      h = var3;
      d();
   }

   static final void d(int var0, int var1, int var2, int var3) {
      if (var1 >= g && var1 < h) {
         if (var0 < d) {
            var2 -= d - var0;
            var0 = d;
         }

         if (var0 + var2 > b) {
            var2 = b - var0;
         }

         int var4 = var0 + var1 * e;

         for (int var5 = 0; var5 < var2; var5++) {
            f[var4 + var5] = var3;
         }
      }
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var2 - var0;
      int var7 = var3 - var1;
      int var8 = var6 >= 0 ? var6 : -var6;
      int var9 = var7 >= 0 ? var7 : -var7;
      int var10 = var8;
      if (var8 < var9) {
         var10 = var9;
      }

      if (var10 != 0) {
         int var11 = (var6 << 16) / var10;
         int var12 = (var7 << 16) / var10;
         if (var12 <= var11) {
            var11 = -var11;
         } else {
            var12 = -var12;
         }

         int var13 = var5 * var12 >> 17;
         int var14 = var5 * var12 + 1 >> 17;
         int var15 = var5 * var11 >> 17;
         int var16 = var5 * var11 + 1 >> 17;
         var0 -= Class_kd.c();
         var1 -= Class_kd.b();
         int var17 = var0 + var13;
         int var18 = var0 - var14;
         int var19 = var0 + var6 - var14;
         int var20 = var0 + var6 + var13;
         int var21 = var1 + var15;
         int var22 = var1 - var16;
         int var23 = var1 + var7 - var16;
         int var24 = var1 + var7 + var15;
         Class_kd.a(var17, var18, var19);
         Class_kd.a(var21, var22, var23, var17, var18, var19, var4);
         Class_kd.a(var17, var19, var20);
         Class_kd.a(var21, var23, var24, var17, var19, var20, var4);
      }
   }

   private static final void d(int var0, int var1, int var2, int var3, int var4) {
      if (var1 >= g && var1 < h) {
         if (var0 < d) {
            var2 -= d - var0;
            var0 = d;
         }

         if (var0 + var2 > b) {
            var2 = b - var0;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 0xFF) * var4;
         int var7 = (var3 >> 8 & 0xFF) * var4;
         int var8 = (var3 & 0xFF) * var4;
         int var12 = var0 + var1 * e;

         for (int var13 = 0; var13 < var2; var13++) {
            int var9 = (f[var12] >> 16 & 0xFF) * var5;
            int var10 = (f[var12] >> 8 & 0xFF) * var5;
            int var11 = (f[var12] & 0xFF) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            f[var12++] = var14;
         }
      }
   }

   static final void e(int var0, int var1, int var2, int var3) {
      if (var0 >= d && var0 < b) {
         if (var1 < g) {
            var2 -= g - var1;
            var1 = g;
         }

         if (var1 + var2 > h) {
            var2 = h - var1;
         }

         int var4 = var0 + var1 * e;

         for (int var5 = 0; var5 < var2; var5++) {
            f[var4 + var5 * e] = var3;
         }
      }
   }

   static final void a(int[] var0, int var1, int var2) {
      f = var0;
      e = var1;
      a = var2;
      c(0, 0, var1, var2);
   }

   static final void b(int var0, int var1, int var2, int var3, int var4, int var5) {
      d(var0, var1, var2, var4, var5);
      d(var0, var1 + var3 - 1, var2, var4, var5);
      if (var3 >= 3) {
         c(var0, var1 + 1, var3 - 2, var4, var5);
         c(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
      }
   }

   static final void e(int var0, int var1, int var2, int var3, int var4) {
      if (var4 != 0) {
         if (var4 == 256) {
            a(var0, var1, var2, var3);
         } else {
            if (var2 < 0) {
               var2 = -var2;
            }

            int var5 = 256 - var4;
            int var6 = (var3 >> 16 & 0xFF) * var4;
            int var7 = (var3 >> 8 & 0xFF) * var4;
            int var8 = (var3 & 0xFF) * var4;
            int var12 = var1 - var2;
            if (var12 < g) {
               var12 = g;
            }

            int var13 = var1 + var2 + 1;
            if (var13 > h) {
               var13 = h;
            }

            int var14 = var12;
            int var15 = var2 * var2;
            int var16 = 0;
            int var17 = var1 - var12;
            int var18 = var17 * var17;
            int var19 = var18 - var17;
            if (var1 > var13) {
               var1 = var13;
            }

            while (var14 < var1) {
               while (var19 <= var15 || var18 <= var15) {
                  var18 += var16 + var16;
                  var19 += var16++ + var16;
               }

               int var20 = var0 - var16 + 1;
               if (var20 < d) {
                  var20 = d;
               }

               int var21 = var0 + var16;
               if (var21 > b) {
                  var21 = b;
               }

               int var22 = var20 + var14 * e;

               for (int var23 = var20; var23 < var21; var23++) {
                  int var9 = (f[var22] >> 16 & 0xFF) * var5;
                  int var10 = (f[var22] >> 8 & 0xFF) * var5;
                  int var11 = (f[var22] & 0xFF) * var5;
                  int var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                  f[var22++] = var24;
               }

               var14++;
               var18 -= var17-- + var17;
               var19 -= var17 + var17;
            }

            var16 = var2;
            var17 = -var17;
            var19 = var17 * var17 + var15;
            var18 = var19 - var2;

            for (int var32 = var19 - var17; var14 < var13; var18 += var17++ + var17) {
               while (var32 > var15 && var18 > var15) {
                  var32 -= var16-- + var16;
                  var18 -= var16 + var16;
               }

               int var33 = var0 - var16;
               if (var33 < d) {
                  var33 = d;
               }

               int var34 = var0 + var16;
               if (var34 > b - 1) {
                  var34 = b - 1;
               }

               int var35 = var33 + var14 * e;

               for (int var36 = var33; var36 <= var34; var36++) {
                  int var25 = (f[var35] >> 16 & 0xFF) * var5;
                  int var26 = (f[var35] >> 8 & 0xFF) * var5;
                  int var27 = (f[var35] & 0xFF) * var5;
                  int var37 = (var6 + var25 >> 8 << 16) + (var7 + var26 >> 8 << 8) + (var8 + var27 >> 8);
                  f[var35++] = var37;
               }

               var14++;
               var32 += var17 + var17;
            }
         }
      }
   }

   static final void c(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 < d) {
         var2 -= d - var0;
         var0 = d;
      }

      if (var1 < g) {
         var3 -= g - var1;
         var1 = g;
      }

      if (var0 + var2 > b) {
         var2 = b - var0;
      }

      if (var1 + var3 > h) {
         var3 = h - var1;
      }

      var4 = ((var4 & 16711935) * var5 >> 8 & 16711935) + ((var4 & 0xFF00) * var5 >> 8 & 0xFF00);
      int var6 = 256 - var5;
      int var7 = e - var2;
      int var8 = var0 + var1 * e;

      for (int var9 = 0; var9 < var3; var9++) {
         for (int var10 = -var2; var10 < 0; var10++) {
            int var11 = f[var8];
            var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + ((var11 & 0xFF00) * var6 >> 8 & 0xFF00);
            f[var8++] = var4 + var11;
         }

         var8 += var7;
      }
   }

   static final void b(int[] var0) {
      var0[0] = d;
      var0[1] = g;
      var0[2] = b;
      var0[3] = h;
   }

   static final void d(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = 0;
      int var7 = 65536 / var3;
      if (var0 < d) {
         var2 -= d - var0;
         var0 = d;
      }

      if (var1 < g) {
         var6 += (g - var1) * var7;
         var3 -= g - var1;
         var1 = g;
      }

      if (var0 + var2 > b) {
         var2 = b - var0;
      }

      if (var1 + var3 > h) {
         var3 = h - var1;
      }

      int var8 = e - var2;
      int var9 = var0 + var1 * e;

      for (int var10 = -var3; var10 < 0; var10++) {
         int var11 = 65536 - var6 >> 8;
         int var12 = var6 >> 8;
         int var13 = ((var4 & 16711935) * var11 + (var5 & 16711935) * var12 & -16711936) + ((var4 & 0xFF00) * var11 + (var5 & 0xFF00) * var12 & 0xFF0000) >>> 8;

         for (int var14 = -var2; var14 < 0; var14++) {
            f[var9++] = var13;
         }

         var9 += var8;
         var6 += var7;
      }
   }

   static final void d() {
      c = null;
      i = null;
   }

   static final void f(int var0, int var1, int var2, int var3, int var4) {
      if (var0 < d) {
         var2 -= d - var0;
         var0 = d;
      }

      if (var1 < g) {
         var3 -= g - var1;
         var1 = g;
      }

      if (var0 + var2 > b) {
         var2 = b - var0;
      }

      if (var1 + var3 > h) {
         var3 = h - var1;
      }

      int var5 = e - var2;
      int var6 = var0 + var1 * e;

      for (int var7 = -var3; var7 < 0; var7++) {
         for (int var8 = -var2; var8 < 0; var8++) {
            f[var6++] = var4;
         }

         var6 += var5;
      }
   }
}
