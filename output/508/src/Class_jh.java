abstract class Class_jh extends Class_a {
   boolean p = false;

   abstract void b(int var1, int var2, int var3);

   final void a(int[][] var1, int var2, int var3, int var4, int var5, int var6) {
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
            this.c(var7);
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

   abstract void a(Class_w var1, int var2, boolean var3);

   abstract int c();

   abstract void a(Class_w var1, int var2);

   abstract void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7);

   abstract void c(int var1);

   abstract int d();

   abstract void e();

   abstract Class_jh a(boolean var1, boolean var2);

   abstract Class_jh b(boolean var1, boolean var2);

   abstract void f();

   abstract int g();

   abstract void d(int var1);

   abstract void a(Class_w var1, int var2, Class_w var3, int var4, int[] var5, boolean var6);

   abstract int h();

   abstract void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9);

   abstract void i();

   abstract int j();

   abstract void e(int var1);

   abstract int a();

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

   abstract void c(int var1, int var2, int var3);

   public Class_jh() {
   }
}
