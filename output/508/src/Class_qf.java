final class Class_qf extends Class_af {
   private byte[][] Cb = new byte[256][];

   private static final void a(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      var2 = ((var2 & 16711935) * var9 & -16711936) + ((var2 & 0xFF00) * var9 & 0xFF0000) >> 8;
      var9 = 256 - var9;

      for (int var10 = -var6; var10 < 0; var10++) {
         for (int var11 = -var5; var11 < 0; var11++) {
            if (var1[var3++] != 0) {
               int var12 = var0[var4];
               var0[var4++] = (((var12 & 16711935) * var9 & -16711936) + ((var12 & 0xFF00) * var9 & 0xFF0000) >> 8) + var2;
            } else {
               var4++;
            }
         }

         var4 += var7;
         var3 += var8;
      }
   }

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      int var9 = var2 + var3 * Class_nc.e;
      int var10 = Class_nc.e - var4;
      int var11 = 0;
      int var12 = 0;
      if (var3 < Class_nc.g) {
         int var13 = Class_nc.g - var3;
         var5 -= var13;
         var3 = Class_nc.g;
         var12 += var13 * var4;
         var9 += var13 * Class_nc.e;
      }

      if (var3 + var5 > Class_nc.h) {
         var5 -= var3 + var5 - Class_nc.h;
      }

      if (var2 < Class_nc.d) {
         int var14 = Class_nc.d - var2;
         var4 -= var14;
         var2 = Class_nc.d;
         var12 += var14;
         var9 += var14;
         var11 += var14;
         var10 += var14;
      }

      if (var2 + var4 > Class_nc.b) {
         int var15 = var2 + var4 - Class_nc.b;
         var4 -= var15;
         var11 += var15;
         var10 += var15;
      }

      if (var4 > 0 && var5 > 0) {
         a(Class_nc.f, this.Cb[var1], var6, var12, var9, var4, var5, var10, var11, var7);
      }
   }

   Class_qf(byte[] var1) {
      super(var1);
   }

   private static final void a(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for (int var10 = -var6; var10 < 0; var10++) {
         for (int var11 = var9; var11 < 0; var11++) {
            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               var4++;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               var4++;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               var4++;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               var4++;
            }
         }

         for (int var12 = var5; var12 < 0; var12++) {
            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               var4++;
            }
         }

         var4 += var7;
         var3 += var8;
      }
   }

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      int var8 = var2 + var3 * Class_nc.e;
      int var9 = Class_nc.e - var4;
      int var10 = 0;
      int var11 = 0;
      if (var3 < Class_nc.g) {
         int var12 = Class_nc.g - var3;
         var5 -= var12;
         var3 = Class_nc.g;
         var11 += var12 * var4;
         var8 += var12 * Class_nc.e;
      }

      if (var3 + var5 > Class_nc.h) {
         var5 -= var3 + var5 - Class_nc.h;
      }

      if (var2 < Class_nc.d) {
         int var13 = Class_nc.d - var2;
         var4 -= var13;
         var2 = Class_nc.d;
         var11 += var13;
         var8 += var13;
         var10 += var13;
         var9 += var13;
      }

      if (var2 + var4 > Class_nc.b) {
         int var14 = var2 + var4 - Class_nc.b;
         var4 -= var14;
         var10 += var14;
         var9 += var14;
      }

      if (var4 > 0 && var5 > 0) {
         if (Class_nc.c != null) {
            a(Class_nc.f, this.Cb[var1], var2, var3, var4, var5, var6, var11, var8, var9, var10, Class_nc.c, Class_nc.i);
         } else {
            a(Class_nc.f, this.Cb[var1], var6, var11, var8, var4, var5, var9, var10);
         }
      }
   }

   Class_qf(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, byte[][] var6) {
      super(var1, var2, var3, var4, var5);
      this.Cb = var6;
   }

   private static final void a(
      int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int[] var11, int[] var12
   ) {
      int var13 = var2 - Class_nc.d;
      int var14 = var3 - Class_nc.g;

      for (int var15 = var14; var15 < var14 + var5; var15++) {
         int var16 = var11[var15];
         int var17 = var12[var15];
         int var18 = var4;
         if (var13 > var16) {
            int var19 = var13 - var16;
            if (var19 >= var17) {
               var7 += var4 + var10;
               var8 += var4 + var9;
               continue;
            }

            var17 -= var19;
         } else {
            int var21 = var16 - var13;
            if (var21 >= var4) {
               var7 += var4 + var10;
               var8 += var4 + var9;
               continue;
            }

            var7 += var21;
            var18 = var4 - var21;
            var8 += var21;
         }

         int var22 = 0;
         if (var18 < var17) {
            var17 = var18;
         } else {
            var22 = var18 - var17;
         }

         for (int var20 = -var17; var20 < 0; var20++) {
            if (var1[var7++] != 0) {
               Class_nc.f[var8++] = var6;
            } else {
               var8++;
            }
         }

         var7 += var22 + var10;
         var8 += var22 + var9;
      }
   }
}
