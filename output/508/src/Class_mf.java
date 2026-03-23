final class Class_mf {
   private static Class_cb a = new Class_cb();

   private static final byte a(Class_cb var0) {
      return (byte)a(8, var0);
   }

   private static final void a(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int var7 = 0;

      for (int var8 = var4; var8 <= var5; var8++) {
         for (int var9 = 0; var9 < var6; var9++) {
            if (var3[var9] == var8) {
               var2[var7] = var9;
               var7++;
            }
         }
      }

      for (int var11 = 0; var11 < 23; var11++) {
         var1[var11] = 0;
      }

      for (int var12 = 0; var12 < var6; var12++) {
         var1[var3[var12] + 1]++;
      }

      for (int var13 = 1; var13 < 23; var13++) {
         var1[var13] += var1[var13 - 1];
      }

      for (int var14 = 0; var14 < 23; var14++) {
         var0[var14] = 0;
      }

      int var10 = 0;

      for (int var15 = var4; var15 <= var5; var15++) {
         var10 += var1[var15 + 1] - var1[var15];
         var0[var15] = var10 - 1;
         var10 <<= 1;
      }

      for (int var16 = var4 + 1; var16 <= var5; var16++) {
         var1[var16] = (var0[var16 - 1] + 1 << 1) - var1[var16];
      }
   }

   private static final void b(Class_cb var0) {
      var0.C = 0;

      for (int var1 = 0; var1 < 256; var1++) {
         if (var0.s[var1]) {
            var0.z[var0.C] = (byte)var1;
            var0.C++;
         }
      }
   }

   public static void a() {
      a = null;
   }

   private static final byte c(Class_cb var0) {
      return (byte)a(1, var0);
   }

   private static final void d(Class_cb var0) {
      boolean var4 = false;
      int var5 = 0;
      boolean var6 = false;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;
      int var13 = 0;
      int var14 = 0;
      int var15 = 0;
      byte var16 = 0;
      int var17 = 0;
      int var18 = 0;
      int var19 = 0;
      byte var20 = 0;
      byte var21 = 0;
      int var22 = 0;
      int[] var23 = null;
      int[] var24 = null;
      int[] var25 = null;
      var0.v = 1;
      if (Class_ca.e == null) {
         Class_ca.e = new int[var0.v * 100000];
      }

      boolean var26 = true;

      while (var26) {
         byte var1 = a(var0);
         if (var1 == 23) {
            return;
         }

         var1 = a(var0);
         var1 = a(var0);
         var1 = a(var0);
         var1 = a(var0);
         var1 = a(var0);
         var1 = a(var0);
         var1 = a(var0);
         var1 = a(var0);
         var1 = a(var0);
         var1 = c(var0);
         var0.u = 0;
         var1 = a(var0);
         var0.u = var0.u << 8 | var1 & 255;
         var1 = a(var0);
         var0.u = var0.u << 8 | var1 & 255;
         var1 = a(var0);
         var0.u = var0.u << 8 | var1 & 255;

         for (int var62 = 0; var62 < 16; var62++) {
            var1 = c(var0);
            if (var1 == 1) {
               var0.N[var62] = true;
            } else {
               var0.N[var62] = false;
            }
         }

         for (int var63 = 0; var63 < 256; var63++) {
            var0.s[var63] = false;
         }

         for (int var64 = 0; var64 < 16; var64++) {
            if (var0.N[var64]) {
               for (int var73 = 0; var73 < 16; var73++) {
                  var1 = c(var0);
                  if (var1 == 1) {
                     var0.s[var64 * 16 + var73] = true;
                  }
               }
            }
         }

         b(var0);
         var7 = var0.C + 2;
         var8 = a(3, var0);
         var9 = a(15, var0);

         for (int var65 = 0; var65 < var9; var65++) {
            var5 = 0;

            while (true) {
               var1 = c(var0);
               if (var1 == 0) {
                  var0.L[var65] = (byte)var5;
                  break;
               }

               var5++;
            }
         }

         byte[] var27 = new byte[6];
         byte var29 = 0;

         while (var29 < var8) {
            var27[var29] = var29++;
         }

         for (int var66 = 0; var66 < var9; var66++) {
            var29 = var0.L[var66];

            byte var28;
            for (var28 = var27[var29]; var29 > 0; var29--) {
               var27[var29] = var27[var29 - 1];
            }

            var27[0] = var28;
            var0.c[var66] = var28;
         }

         for (int var75 = 0; var75 < var8; var75++) {
            var17 = a(5, var0);

            for (int var67 = 0; var67 < var7; var67++) {
               while (true) {
                  var1 = c(var0);
                  if (var1 == 0) {
                     var0.o[var75][var67] = (byte)var17;
                     break;
                  }

                  var1 = c(var0);
                  if (var1 == 0) {
                     var17++;
                  } else {
                     var17--;
                  }
               }
            }
         }

         for (int var76 = 0; var76 < var8; var76++) {
            byte var2 = 32;
            byte var3 = 0;

            for (int var68 = 0; var68 < var7; var68++) {
               if (var0.o[var76][var68] > var3) {
                  var3 = var0.o[var76][var68];
               }

               if (var0.o[var76][var68] < var2) {
                  var2 = var0.o[var76][var68];
               }
            }

            a(var0.r[var76], var0.J[var76], var0.M[var76], var0.o[var76], var2, var3, var7);
            var0.K[var76] = var2;
         }

         var10 = var0.C + 1;
         var11 = -1;
         var12 = 0;

         for (int var69 = 0; var69 <= 255; var69++) {
            var0.H[var69] = 0;
         }

         int var32 = 4095;

         for (int var30 = 15; var30 >= 0; var30--) {
            for (int var31 = 15; var31 >= 0; var31--) {
               var0.b[var32] = (byte)(var30 * 16 + var31);
               var32--;
            }

            var0.n[var30] = var32 + 1;
         }

         var14 = 0;
         if (var12 == 0) {
            var11++;
            var12 = 50;
            var21 = var0.c[var11];
            var22 = var0.K[var21];
            var23 = var0.r[var21];
            var25 = var0.M[var21];
            var24 = var0.J[var21];
         }

         var12--;
         var18 = var22;
         var19 = a(var22, var0);

         while (var19 > var23[var18]) {
            var18++;
            var20 = c(var0);
            var19 = var19 << 1 | var20;
         }

         var13 = var25[var19 - var24[var18]];

         while (var13 != var10) {
            if (var13 != 0 && var13 != 1) {
               int var39 = var13 - 1;
               if (var39 < 16) {
                  int var103 = var0.n[0];

                  for (var1 = var0.b[var103 + var39]; var39 > 3; var39 -= 4) {
                     int var40 = var103 + var39;
                     var0.b[var40] = var0.b[var40 - 1];
                     var0.b[var40 - 1] = var0.b[var40 - 2];
                     var0.b[var40 - 2] = var0.b[var40 - 3];
                     var0.b[var40 - 3] = var0.b[var40 - 4];
                  }

                  while (var39 > 0) {
                     var0.b[var103 + var39] = var0.b[var103 + var39 - 1];
                     var39--;
                  }

                  var0.b[var103] = var1;
               } else {
                  int var37 = var39 / 16;
                  int var38 = var39 % 16;
                  int var36 = var0.n[var37] + var38;

                  for (var1 = var0.b[var36]; var36 > var0.n[var37]; var36--) {
                     var0.b[var36] = var0.b[var36 - 1];
                  }

                  var0.n[var37]++;

                  while (var37 > 0) {
                     var0.n[var37]--;
                     var0.b[var0.n[var37]] = var0.b[var0.n[var37 - 1] + 16 - 1];
                     var37--;
                  }

                  var0.n[0]--;
                  var0.b[var0.n[0]] = var1;
                  if (var0.n[0] == 0) {
                     int var35 = 4095;

                     for (int var33 = 15; var33 >= 0; var33--) {
                        for (int var34 = 15; var34 >= 0; var34--) {
                           var0.b[var35] = var0.b[var0.n[var33] + var34];
                           var35--;
                        }

                        var0.n[var33] = var35 + 1;
                     }
                  }
               }

               var0.H[var0.z[var1 & 255] & 255]++;
               Class_ca.e[var14] = var0.z[var1 & 255] & 255;
               var14++;
               if (var12 == 0) {
                  var11++;
                  var12 = 50;
                  var21 = var0.c[var11];
                  var22 = var0.K[var21];
                  var23 = var0.r[var21];
                  var25 = var0.M[var21];
                  var24 = var0.J[var21];
               }

               var12--;
               var18 = var22;
               var19 = a(var22, var0);

               while (var19 > var23[var18]) {
                  var18++;
                  var20 = c(var0);
                  var19 = var19 << 1 | var20;
               }

               var13 = var25[var19 - var24[var18]];
            } else {
               var15 = -1;
               var16 = 1;

               do {
                  if (var13 == 0) {
                     var15 += var16;
                  } else if (var13 == 1) {
                     var15 += 2 * var16;
                  }

                  var16 *= 2;
                  if (var12 == 0) {
                     var11++;
                     var12 = 50;
                     var21 = var0.c[var11];
                     var22 = var0.K[var21];
                     var23 = var0.r[var21];
                     var25 = var0.M[var21];
                     var24 = var0.J[var21];
                  }

                  var12--;
                  var18 = var22;
                  var19 = a(var22, var0);

                  while (var19 > var23[var18]) {
                     var18++;
                     var20 = c(var0);
                     var19 = var19 << 1 | var20;
                  }

                  var13 = var25[var19 - var24[var18]];
               } while (var13 == 0 || var13 == 1);

               var15++;
               var1 = var0.z[var0.b[var0.n[0]] & 255];

               for (var0.H[var1 & 255] = var0.H[var1 & 255] + var15; var15 > 0; var15--) {
                  Class_ca.e[var14] = var1 & 255;
                  var14++;
               }
            }
         }

         var0.g = 0;
         var0.l = 0;
         var0.f[0] = 0;

         for (int var70 = 1; var70 <= 256; var70++) {
            var0.f[var70] = var0.H[var70 - 1];
         }

         for (int var71 = 1; var71 <= 256; var71++) {
            var0.f[var71] = var0.f[var71] + var0.f[var71 - 1];
         }

         for (int var72 = 0; var72 < var14; var72++) {
            var1 = (byte)(Class_ca.e[var72] & 0xFF);
            Class_ca.e[var0.f[var1 & 255]] = Class_ca.e[var0.f[var1 & 255]] | var72 << 8;
            var0.f[var1 & 255]++;
         }

         var0.e = Class_ca.e[var0.u] >> 8;
         var0.t = 0;
         var0.e = Class_ca.e[var0.e];
         var0.h = (byte)(var0.e & 0xFF);
         var0.e >>= 8;
         var0.t++;
         var0.y = var14;
         e(var0);
         if (var0.t == var0.y + 1 && var0.g == 0) {
            var26 = true;
         } else {
            var26 = false;
         }
      }
   }

   static final int a(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      Class_cb var6 = a;
      int var5;
      synchronized (var6) {
         a.j = var2;
         a.w = var4;
         a.A = var0;
         a.D = 0;
         a.i = var1;
         a.m = 0;
         a.a = 0;
         a.B = 0;
         a.q = 0;
         d(a);
         var1 -= a.i;
         a.j = null;
         a.A = null;
         var5 = var1;
      }

      return var5;
   }

   private static final int a(int var0, Class_cb var1) {
      while (var1.m < var0) {
         var1.a = var1.a << 8 | var1.j[var1.w] & 255;
         var1.m += 8;
         var1.w++;
         var1.B++;
      }

      int var3 = var1.a >> var1.m - var0 & (1 << var0) - 1;
      var1.m -= var0;
      return var3;
   }

   private static final void e(Class_cb var0) {
      byte var2 = var0.l;
      int var3 = var0.g;
      int var4 = var0.t;
      int var5 = var0.h;
      int[] var6 = Class_ca.e;
      int var7 = var0.e;
      byte[] var8 = var0.A;
      int var9 = var0.D;
      int var10 = var0.i;
      int var11 = var10;
      int var12 = var0.y + 1;

      label62:
      while (true) {
         if (var3 > 0) {
            while (true) {
               if (var10 == 0) {
                  break label62;
               }

               if (var3 == 1) {
                  if (var10 == 0) {
                     var3 = 1;
                     break label62;
                  }

                  var8[var9] = var2;
                  var9++;
                  var10--;
                  break;
               }

               var8[var9] = var2;
               var3--;
               var9++;
               var10--;
            }
         }

         boolean var14 = true;

         while (var14) {
            var14 = false;
            if (var4 == var12) {
               var3 = 0;
               break label62;
            }

            var2 = (byte)var5;
            var7 = var6[var7];
            byte var1 = (byte)(var7 & 0xFF);
            var7 >>= 8;
            var4++;
            if (var1 != var5) {
               var5 = var1;
               if (var10 == 0) {
                  var3 = 1;
                  break label62;
               }

               var8[var9] = var2;
               var9++;
               var10--;
               var14 = true;
            } else if (var4 == var12) {
               if (var10 == 0) {
                  var3 = 1;
                  break label62;
               }

               var8[var9] = var2;
               var9++;
               var10--;
               var14 = true;
            }
         }

         var3 = 2;
         var7 = var6[var7];
         byte var15 = (byte)(var7 & 0xFF);
         var7 >>= 8;
         if (++var4 != var12) {
            if (var15 != var5) {
               var5 = var15;
            } else {
               var3 = 3;
               var7 = var6[var7];
               var15 = (byte)(var7 & 0xFF);
               var7 >>= 8;
               if (++var4 != var12) {
                  if (var15 != var5) {
                     var5 = var15;
                  } else {
                     var7 = var6[var7];
                     var15 = (byte)(var7 & 0xFF);
                     var7 >>= 8;
                     var4++;
                     var3 = (var15 & 255) + 4;
                     var7 = var6[var7];
                     var5 = (byte)(var7 & 0xFF);
                     var7 >>= 8;
                     var4++;
                  }
               }
            }
         }
      }

      int var13 = var0.q;
      var0.q += var11 - var10;
      var0.l = var2;
      var0.g = var3;
      var0.t = var4;
      var0.h = var5;
      Class_ca.e = var6;
      var0.e = var7;
      var0.A = var8;
      var0.D = var9;
      var0.i = var10;
   }
}
