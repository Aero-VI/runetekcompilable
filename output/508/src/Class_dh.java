final class Class_dh extends Class_pc {
   private int[] q;
   byte[] r;

   final void a(int var1, int var2, int var3) {
      var1 += super.n;
      var2 += super.l;
      int var4 = var1 + var2 * Class_nc.e;
      int var5 = 0;
      int var6 = super.o;
      int var7 = super.p;
      int var8 = Class_nc.e - var7;
      int var9 = 0;
      if (var2 < Class_nc.g) {
         int var10 = Class_nc.g - var2;
         var6 -= var10;
         var2 = Class_nc.g;
         var5 += var10 * var7;
         var4 += var10 * Class_nc.e;
      }

      if (var2 + var6 > Class_nc.h) {
         var6 -= var2 + var6 - Class_nc.h;
      }

      if (var1 < Class_nc.d) {
         int var13 = Class_nc.d - var1;
         var7 -= var13;
         var1 = Class_nc.d;
         var5 += var13;
         var4 += var13;
         var9 += var13;
         var8 += var13;
      }

      if (var1 + var7 > Class_nc.b) {
         int var14 = var1 + var7 - Class_nc.b;
         var7 -= var14;
         var9 += var14;
         var8 += var14;
      }

      if (var7 > 0 && var6 > 0) {
         b(Class_nc.f, this.r, this.q, var5, var4, var7, var6, var8, var9, var3);
      }
   }

   final void a() {
      byte[] var1 = new byte[super.p * super.o];
      int var2 = 0;

      for (int var3 = 0; var3 < super.p; var3++) {
         for (int var4 = super.o - 1; var4 >= 0; var4--) {
            var1[var2++] = this.r[var3 + var4 * super.p];
         }
      }

      this.r = var1;
      int var5 = super.l;
      super.l = super.n;
      super.n = super.b - super.o - var5;
      var5 = super.o;
      super.o = super.p;
      super.p = var5;
      var5 = super.b;
      super.b = super.d;
      super.d = var5;
   }

   final void b(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.q.length; var4++) {
         int var5 = this.q[var4] >> 16 & 0xFF;
         var5 += var1;
         if (var5 < 0) {
            var5 = 0;
         } else if (var5 > 255) {
            var5 = 255;
         }

         int var6 = this.q[var4] >> 8 & 0xFF;
         var6 += var2;
         if (var6 < 0) {
            var6 = 0;
         } else if (var6 > 255) {
            var6 = 255;
         }

         int var7 = this.q[var4] & 0xFF;
         var7 += var3;
         if (var7 < 0) {
            var7 = 0;
         } else if (var7 > 255) {
            var7 = 255;
         }

         this.q[var4] = (var5 << 16) + (var6 << 8) + var7;
      }
   }

   private static final void a(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var3;

      for (int var13 = -var8; var13 < 0; var13++) {
         int var14 = (var4 >> 16) * var11;

         for (int var15 = -var7; var15 < 0; var15++) {
            byte var16 = var1[(var3 >> 16) + var14];
            if (var16 != 0) {
               var0[var5++] = var2[var16 & 255];
            } else {
               var5++;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var12;
         var5 += var6;
      }
   }

   final Class_dh b() {
      Class_dh var1 = new Class_dh(super.p, super.o, this.q.length);
      var1.d = super.d;
      var1.b = super.b;
      var1.n = super.n;
      var1.l = super.l;
      int var2 = this.r.length;

      for (int var3 = 0; var3 < var2; var3++) {
         var1.r[var3] = this.r[var3];
      }

      var1.q = this.q;
      return var1;
   }

   private static final void a(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = -(var6 >> 2);
      var6 = -(var6 & 3);

      for (int var11 = -var7; var11 < 0; var11++) {
         for (int var12 = var10; var12 < 0; var12++) {
            byte var14 = var1[var4++];
            if (var14 != 0) {
               var0[var5++] = var2[var14 & 255];
            } else {
               var5++;
            }

            var14 = var1[var4++];
            if (var14 != 0) {
               var0[var5++] = var2[var14 & 255];
            } else {
               var5++;
            }

            var14 = var1[var4++];
            if (var14 != 0) {
               var0[var5++] = var2[var14 & 255];
            } else {
               var5++;
            }

            var14 = var1[var4++];
            if (var14 != 0) {
               var0[var5++] = var2[var14 & 255];
            } else {
               var5++;
            }
         }

         for (int var13 = var6; var13 < 0; var13++) {
            byte var18 = var1[var4++];
            if (var18 != 0) {
               var0[var5++] = var2[var18 & 255];
            } else {
               var5++;
            }
         }

         var5 += var8;
         var4 += var9;
      }
   }

   private static final void b(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = 256 - var9;

      for (int var11 = -var6; var11 < 0; var11++) {
         for (int var12 = -var5; var12 < 0; var12++) {
            int var13 = var1[var3++];
            if (var13 != 0) {
               var13 = var2[var13 & 0xFF];
               int var14 = var0[var4];
               var0[var4++] = ((var13 & 16711935) * var9 + (var14 & 16711935) * var10 & -16711936)
                     + ((var13 & 0xFF00) * var9 + (var14 & 0xFF00) * var10 & 0xFF0000)
                  >> 8;
            } else {
               var4++;
            }
         }

         var4 += var7;
         var3 += var8;
      }
   }

   final void a(int var1, int var2, int var3, int var4) {
      int var5 = super.p;
      int var6 = super.o;
      int var7 = 0;
      int var8 = 0;
      int var9 = super.d;
      int var10 = super.b;
      int var11 = (var9 << 16) / var3;
      int var12 = (var10 << 16) / var4;
      if (super.n > 0) {
         int var13 = ((super.n << 16) + var11 - 1) / var11;
         var1 += var13;
         var7 += var13 * var11 - (super.n << 16);
      }

      if (super.l > 0) {
         int var16 = ((super.l << 16) + var12 - 1) / var12;
         var2 += var16;
         var8 += var16 * var12 - (super.l << 16);
      }

      if (var5 < var9) {
         var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
      }

      if (var6 < var10) {
         var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
      }

      int var17 = var1 + var2 * Class_nc.e;
      int var14 = Class_nc.e - var3;
      if (var2 + var4 > Class_nc.h) {
         var4 -= var2 + var4 - Class_nc.h;
      }

      if (var2 < Class_nc.g) {
         int var15 = Class_nc.g - var2;
         var4 -= var15;
         var17 += var15 * Class_nc.e;
         var8 += var12 * var15;
      }

      if (var1 + var3 > Class_nc.b) {
         int var18 = var1 + var3 - Class_nc.b;
         var3 -= var18;
         var14 += var18;
      }

      if (var1 < Class_nc.d) {
         int var19 = Class_nc.d - var1;
         var3 -= var19;
         var17 += var19;
         var7 += var11 * var19;
         var14 += var19;
      }

      a(Class_nc.f, this.r, this.q, var7, var8, var17, var14, var3, var4, var11, var12, var5);
   }

   final void a(int var1, int var2) {
      var1 += super.n;
      var2 += super.l;
      int var3 = var1 + var2 * Class_nc.e;
      int var4 = 0;
      int var5 = super.o;
      int var6 = super.p;
      int var7 = Class_nc.e - var6;
      int var8 = 0;
      if (var2 < Class_nc.g) {
         int var9 = Class_nc.g - var2;
         var5 -= var9;
         var2 = Class_nc.g;
         var4 += var9 * var6;
         var3 += var9 * Class_nc.e;
      }

      if (var2 + var5 > Class_nc.h) {
         var5 -= var2 + var5 - Class_nc.h;
      }

      if (var1 < Class_nc.d) {
         int var12 = Class_nc.d - var1;
         var6 -= var12;
         var1 = Class_nc.d;
         var4 += var12;
         var3 += var12;
         var8 += var12;
         var7 += var12;
      }

      if (var1 + var6 > Class_nc.b) {
         int var13 = var1 + var6 - Class_nc.b;
         var6 -= var13;
         var8 += var13;
         var7 += var13;
      }

      if (var6 > 0 && var5 > 0) {
         a(Class_nc.f, this.r, this.q, 0, var4, var3, var6, var5, var7, var8);
      }
   }

   final void c() {
      if (super.p != super.d || super.o != super.b) {
         byte[] var1 = new byte[super.d * super.b];
         int var2 = 0;

         for (int var3 = 0; var3 < super.o; var3++) {
            for (int var4 = 0; var4 < super.p; var4++) {
               var1[var4 + super.n + (var3 + super.l) * super.d] = this.r[var2++];
            }
         }

         this.r = var1;
         super.p = super.d;
         super.o = super.b;
         super.n = 0;
         super.l = 0;
      }
   }

   Class_dh(int var1, int var2, int var3, int var4, int var5, int var6, byte[] var7, int[] var8) {
      super.d = var1;
      super.b = var2;
      super.n = var3;
      super.l = var4;
      super.p = var5;
      super.o = var6;
      this.r = var7;
      this.q = var8;
   }

   private Class_dh(int var1, int var2, int var3) {
      super.d = super.p = var1;
      super.b = super.o = var2;
      super.n = super.l = 0;
      this.r = new byte[var1 * var2];
      this.q = new int[var3];
   }
}
