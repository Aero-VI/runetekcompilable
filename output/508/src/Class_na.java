final class Class_na {
   int[] a;
   int[] b;
   static int[] c = new int[6];
   static int[] d = new int[6];
   int e;
   int[] f;
   int g;
   int[] h;
   private static int[][] i = new int[][]{
      {0, 1, 2, 3, 0, 0, 1, 3},
      {1, 1, 2, 3, 1, 0, 1, 3},
      {0, 1, 2, 3, 1, 0, 1, 3},
      {0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3},
      {0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4},
      {0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4},
      {0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3},
      {0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3},
      {0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5},
      {0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5},
      {0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3},
      {1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3},
      {1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5}
   };
   static int[] j = new int[6];
   static int[] k = new int[6];
   int l;
   static int[] m = new int[6];
   int[] n;
   int[] o;
   boolean p = true;
   int[] q;
   int[] r;
   int s;
   private static int[][] t = new int[][]{
      {1, 3, 5, 7},
      {1, 3, 5, 7},
      {1, 3, 5, 7},
      {1, 3, 5, 7, 6},
      {1, 3, 5, 7, 6},
      {1, 3, 5, 7, 6},
      {1, 3, 5, 7, 6},
      {1, 3, 5, 7, 2, 6},
      {1, 3, 5, 7, 2, 8},
      {1, 3, 5, 7, 2, 8},
      {1, 3, 5, 7, 11, 12},
      {1, 3, 5, 7, 11, 12},
      {1, 3, 5, 7, 13, 14}
   };
   int[] u;
   int[] v;

   public static void a() {
      k = null;
      j = null;
      m = null;
      c = null;
      d = null;
      t = null;
      i = null;
   }

   Class_na(
      int var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17,
      int var18,
      int var19
   ) {
      if (var6 != var7 || var6 != var8 || var6 != var9) {
         this.p = false;
      }

      this.g = var1;
      this.l = var2;
      this.s = var18;
      this.e = var19;
      short var20 = 128;
      int var21 = var20 / 2;
      int var22 = var20 / 4;
      int var23 = var20 * 3 / 4;
      int[] var24 = t[var1];
      int var25 = var24.length;
      this.q = new int[var25];
      this.h = new int[var25];
      this.n = new int[var25];
      int[] var26 = new int[var25];
      int[] var27 = new int[var25];
      int var28 = var4 * var20;
      int var29 = var5 * var20;

      for (int var30 = 0; var30 < var25; var30++) {
         int var31 = var24[var30];
         if ((var31 & 1) == 0 && var31 <= 8) {
            var31 = (var31 - var2 - var2 - 1 & 7) + 1;
         }

         if (var31 > 8 && var31 <= 12) {
            var31 = (var31 - 9 - var2 & 3) + 9;
         }

         if (var31 > 12 && var31 <= 16) {
            var31 = (var31 - 13 - var2 & 3) + 13;
         }

         int var32;
         int var33;
         int var34;
         int var35;
         int var36;
         if (var31 == 1) {
            var32 = var28;
            var33 = var29;
            var34 = var6;
            var35 = var10;
            var36 = var14;
         } else if (var31 == 2) {
            var32 = var28 + var21;
            var33 = var29;
            var34 = var6 + var7 >> 1;
            var35 = var10 + var11 >> 1;
            var36 = var14 + var15 >> 1;
         } else if (var31 == 3) {
            var32 = var28 + var20;
            var33 = var29;
            var34 = var7;
            var35 = var11;
            var36 = var15;
         } else if (var31 == 4) {
            var32 = var28 + var20;
            var33 = var29 + var21;
            var34 = var7 + var8 >> 1;
            var35 = var11 + var12 >> 1;
            var36 = var15 + var16 >> 1;
         } else if (var31 == 5) {
            var32 = var28 + var20;
            var33 = var29 + var20;
            var34 = var8;
            var35 = var12;
            var36 = var16;
         } else if (var31 == 6) {
            var32 = var28 + var21;
            var33 = var29 + var20;
            var34 = var8 + var9 >> 1;
            var35 = var12 + var13 >> 1;
            var36 = var16 + var17 >> 1;
         } else if (var31 == 7) {
            var32 = var28;
            var33 = var29 + var20;
            var34 = var9;
            var35 = var13;
            var36 = var17;
         } else if (var31 == 8) {
            var32 = var28;
            var33 = var29 + var21;
            var34 = var9 + var6 >> 1;
            var35 = var13 + var10 >> 1;
            var36 = var17 + var14 >> 1;
         } else if (var31 == 9) {
            var32 = var28 + var21;
            var33 = var29 + var22;
            var34 = var6 + var7 >> 1;
            var35 = var10 + var11 >> 1;
            var36 = var14 + var15 >> 1;
         } else if (var31 == 10) {
            var32 = var28 + var23;
            var33 = var29 + var21;
            var34 = var7 + var8 >> 1;
            var35 = var11 + var12 >> 1;
            var36 = var15 + var16 >> 1;
         } else if (var31 == 11) {
            var32 = var28 + var21;
            var33 = var29 + var23;
            var34 = var8 + var9 >> 1;
            var35 = var12 + var13 >> 1;
            var36 = var16 + var17 >> 1;
         } else if (var31 == 12) {
            var32 = var28 + var22;
            var33 = var29 + var21;
            var34 = var9 + var6 >> 1;
            var35 = var13 + var10 >> 1;
            var36 = var17 + var14 >> 1;
         } else if (var31 == 13) {
            var32 = var28 + var22;
            var33 = var29 + var22;
            var34 = var6;
            var35 = var10;
            var36 = var14;
         } else if (var31 == 14) {
            var32 = var28 + var23;
            var33 = var29 + var22;
            var34 = var7;
            var35 = var11;
            var36 = var15;
         } else if (var31 == 15) {
            var32 = var28 + var23;
            var33 = var29 + var23;
            var34 = var8;
            var35 = var12;
            var36 = var16;
         } else {
            var32 = var28 + var22;
            var33 = var29 + var23;
            var34 = var9;
            var35 = var13;
            var36 = var17;
         }

         this.q[var30] = var32;
         this.h[var30] = var34;
         this.n[var30] = var33;
         var26[var30] = var35;
         var27[var30] = var36;
      }

      int[] var39 = i[var1];
      int var40 = var39.length / 4;
      this.f = new int[var40];
      this.b = new int[var40];
      this.r = new int[var40];
      this.v = new int[var40];
      this.u = new int[var40];
      this.o = new int[var40];
      if (var3 != -1) {
         this.a = new int[var40];
      }

      byte var41 = 0;

      for (int var42 = 0; var42 < var40; var42++) {
         int var43 = var39[var41];
         int var46 = var39[var41 + 1];
         int var37 = var39[var41 + 2];
         int var38 = var39[var41 + 3];
         var41 += 4;
         if (var46 < 4) {
            var46 = var46 - var2 & 3;
         }

         if (var37 < 4) {
            var37 = var37 - var2 & 3;
         }

         if (var38 < 4) {
            var38 = var38 - var2 & 3;
         }

         this.f[var42] = var46;
         this.b[var42] = var37;
         this.r[var42] = var38;
         if (var43 == 0) {
            this.v[var42] = var26[var46];
            this.u[var42] = var26[var37];
            this.o[var42] = var26[var38];
            if (this.a != null) {
               this.a[var42] = -1;
            }
         } else {
            this.v[var42] = var27[var46];
            this.u[var42] = var27[var37];
            this.o[var42] = var27[var38];
            if (this.a != null) {
               this.a[var42] = var3;
            }
         }
      }

      int var44 = var6;
      int var47 = var7;
      if (var7 < var6) {
         var44 = var7;
      }

      if (var7 > var7) {
         var47 = var7;
      }

      if (var8 < var44) {
         var44 = var8;
      }

      if (var8 > var47) {
         var47 = var8;
      }

      if (var9 < var44) {
         var44 = var9;
      }

      if (var9 > var47) {
         var47 = var9;
      }

      var44 /= 14;
      var47 /= 14;
   }
}
