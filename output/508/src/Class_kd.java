final class Class_kd {
   private static float a = 1.0F;
   static boolean b = false;
   static int c = 0;
   static int[] d = new int[2048];
   static int[] e = new int[2048];
   private static int[] f = new int[1024];
   static boolean g = false;
   static int[] h = new int[65536];
   static Class_ri i;
   static int j;
   private static boolean k = false;
   private static int l;
   static boolean m = true;
   static int n;
   private static int[] o = new int[512];
   private static boolean p = false;
   static int[] q = new int[2048];
   static int r;

   static final void a(
      int var0,
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
      int var18
   ) {
      int[] var19 = i.a(a, 99, var18);
      if (var19 == null) {
         int var105 = i.c(var18, 101);
         a(var0, var1, var2, var3, var4, var5, b(var105, var6), b(var105, var7), b(var105, var8));
      } else {
         p = i.b((byte)-120, var18);
         k = i.a(var18, 2);
         int var20 = var4 - var3;
         int var21 = var1 - var0;
         int var22 = var5 - var3;
         int var23 = var2 - var0;
         int var24 = var7 - var6;
         int var25 = var8 - var6;
         int var26 = 0;
         if (var1 != var0) {
            var26 = (var4 - var3 << 16) / (var1 - var0);
         }

         int var27 = 0;
         if (var2 != var1) {
            var27 = (var5 - var4 << 16) / (var2 - var1);
         }

         int var28 = 0;
         if (var2 != var0) {
            var28 = (var3 - var5 << 16) / (var0 - var2);
         }

         int var29 = var20 * var23 - var22 * var21;
         if (var29 != 0) {
            int var30 = (var24 * var23 - var25 * var21 << 9) / var29;
            int var31 = (var25 * var20 - var24 * var22 << 9) / var29;
            var10 = var9 - var10;
            var13 = var12 - var13;
            var16 = var15 - var16;
            var11 -= var9;
            var14 -= var12;
            var17 -= var15;
            int var32 = var11 * var12 - var14 * var9 << 14;
            int var33 = var14 * var15 - var17 * var12 << 5;
            int var34 = var17 * var9 - var11 * var15 << 5;
            int var35 = var10 * var12 - var13 * var9 << 14;
            int var36 = var13 * var15 - var16 * var12 << 5;
            int var37 = var16 * var9 - var10 * var15 << 5;
            int var38 = var13 * var11 - var10 * var14 << 14;
            int var39 = var16 * var14 - var13 * var17 << 5;
            int var40 = var10 * var17 - var16 * var11 << 5;
            if (var0 <= var1 && var0 <= var2) {
               if (var0 < l) {
                  if (var1 > l) {
                     var1 = l;
                  }

                  if (var2 > l) {
                     var2 = l;
                  }

                  var6 = (var6 << 9) - var30 * var3 + var30;
                  if (var1 < var2) {
                     int var83;
                     var5 = var83 = var3 << 16;
                     if (var0 < 0) {
                        var5 -= var28 * var0;
                        var83 -= var26 * var0;
                        var6 -= var31 * var0;
                        var0 = 0;
                     }

                     var4 <<= 16;
                     if (var1 < 0) {
                        var4 -= var27 * var1;
                        var1 = 0;
                     }

                     int var128 = var0 - j;
                     var32 += var34 * var128;
                     var35 += var37 * var128;
                     var38 += var40 * var128;
                     if ((var0 == var1 || var28 >= var26) && (var0 != var1 || var28 <= var27)) {
                        var2 -= var1;
                        var1 -= var0;

                        for (var0 = f[var0]; --var1 >= 0; var38 += var40) {
                           b(Class_nc.f, var19, 0, 0, var0, var83 >> 16, var5 >> 16, var6, var30, var32, var35, var38, var33, var36, var39);
                           var5 += var28;
                           var83 += var26;
                           var6 += var31;
                           var0 += Class_nc.e;
                           var32 += var34;
                           var35 += var37;
                        }

                        while (--var2 >= 0) {
                           b(Class_nc.f, var19, 0, 0, var0, var4 >> 16, var5 >> 16, var6, var30, var32, var35, var38, var33, var36, var39);
                           var5 += var28;
                           var4 += var27;
                           var6 += var31;
                           var0 += Class_nc.e;
                           var32 += var34;
                           var35 += var37;
                           var38 += var40;
                        }
                     } else {
                        var2 -= var1;
                        var1 -= var0;

                        for (var0 = f[var0]; --var1 >= 0; var38 += var40) {
                           b(Class_nc.f, var19, 0, 0, var0, var5 >> 16, var83 >> 16, var6, var30, var32, var35, var38, var33, var36, var39);
                           var5 += var28;
                           var83 += var26;
                           var6 += var31;
                           var0 += Class_nc.e;
                           var32 += var34;
                           var35 += var37;
                        }

                        while (--var2 >= 0) {
                           b(Class_nc.f, var19, 0, 0, var0, var5 >> 16, var4 >> 16, var6, var30, var32, var35, var38, var33, var36, var39);
                           var5 += var28;
                           var4 += var27;
                           var6 += var31;
                           var0 += Class_nc.e;
                           var32 += var34;
                           var35 += var37;
                           var38 += var40;
                        }
                     }
                  } else {
                     int var82;
                     var4 = var82 = var3 << 16;
                     if (var0 < 0) {
                        var4 -= var28 * var0;
                        var82 -= var26 * var0;
                        var6 -= var31 * var0;
                        var0 = 0;
                     }

                     var5 <<= 16;
                     if (var2 < 0) {
                        var5 -= var27 * var2;
                        var2 = 0;
                     }

                     int var127 = var0 - j;
                     var32 += var34 * var127;
                     var35 += var37 * var127;
                     var38 += var40 * var127;
                     if ((var0 == var2 || var28 >= var26) && (var0 != var2 || var27 <= var26)) {
                        var1 -= var2;
                        var2 -= var0;

                        for (var0 = f[var0]; --var2 >= 0; var38 += var40) {
                           b(Class_nc.f, var19, 0, 0, var0, var82 >> 16, var4 >> 16, var6, var30, var32, var35, var38, var33, var36, var39);
                           var4 += var28;
                           var82 += var26;
                           var6 += var31;
                           var0 += Class_nc.e;
                           var32 += var34;
                           var35 += var37;
                        }

                        while (--var1 >= 0) {
                           b(Class_nc.f, var19, 0, 0, var0, var82 >> 16, var5 >> 16, var6, var30, var32, var35, var38, var33, var36, var39);
                           var5 += var27;
                           var82 += var26;
                           var6 += var31;
                           var0 += Class_nc.e;
                           var32 += var34;
                           var35 += var37;
                           var38 += var40;
                        }
                     } else {
                        var1 -= var2;
                        var2 -= var0;

                        for (var0 = f[var0]; --var2 >= 0; var38 += var40) {
                           b(Class_nc.f, var19, 0, 0, var0, var4 >> 16, var82 >> 16, var6, var30, var32, var35, var38, var33, var36, var39);
                           var4 += var28;
                           var82 += var26;
                           var6 += var31;
                           var0 += Class_nc.e;
                           var32 += var34;
                           var35 += var37;
                        }

                        while (--var1 >= 0) {
                           b(Class_nc.f, var19, 0, 0, var0, var5 >> 16, var82 >> 16, var6, var30, var32, var35, var38, var33, var36, var39);
                           var5 += var27;
                           var82 += var26;
                           var6 += var31;
                           var0 += Class_nc.e;
                           var32 += var34;
                           var35 += var37;
                           var38 += var40;
                        }
                     }
                  }
               }
            } else if (var1 <= var2) {
               if (var1 < l) {
                  if (var2 > l) {
                     var2 = l;
                  }

                  if (var0 > l) {
                     var0 = l;
                  }

                  var7 = (var7 << 9) - var30 * var4 + var30;
                  if (var2 < var0) {
                     int var87;
                     var3 = var87 = var4 << 16;
                     if (var1 < 0) {
                        var3 -= var26 * var1;
                        var87 -= var27 * var1;
                        var7 -= var31 * var1;
                        var1 = 0;
                     }

                     var5 <<= 16;
                     if (var2 < 0) {
                        var5 -= var28 * var2;
                        var2 = 0;
                     }

                     int var126 = var1 - j;
                     var32 += var34 * var126;
                     var35 += var37 * var126;
                     var38 += var40 * var126;
                     if ((var1 == var2 || var26 >= var27) && (var1 != var2 || var26 <= var28)) {
                        var0 -= var2;
                        var2 -= var1;

                        for (var1 = f[var1]; --var2 >= 0; var38 += var40) {
                           b(Class_nc.f, var19, 0, 0, var1, var87 >> 16, var3 >> 16, var7, var30, var32, var35, var38, var33, var36, var39);
                           var3 += var26;
                           var87 += var27;
                           var7 += var31;
                           var1 += Class_nc.e;
                           var32 += var34;
                           var35 += var37;
                        }

                        while (--var0 >= 0) {
                           b(Class_nc.f, var19, 0, 0, var1, var5 >> 16, var3 >> 16, var7, var30, var32, var35, var38, var33, var36, var39);
                           var3 += var26;
                           var5 += var28;
                           var7 += var31;
                           var1 += Class_nc.e;
                           var32 += var34;
                           var35 += var37;
                           var38 += var40;
                        }
                     } else {
                        var0 -= var2;
                        var2 -= var1;

                        for (var1 = f[var1]; --var2 >= 0; var38 += var40) {
                           b(Class_nc.f, var19, 0, 0, var1, var3 >> 16, var87 >> 16, var7, var30, var32, var35, var38, var33, var36, var39);
                           var3 += var26;
                           var87 += var27;
                           var7 += var31;
                           var1 += Class_nc.e;
                           var32 += var34;
                           var35 += var37;
                        }

                        while (--var0 >= 0) {
                           b(Class_nc.f, var19, 0, 0, var1, var3 >> 16, var5 >> 16, var7, var30, var32, var35, var38, var33, var36, var39);
                           var3 += var26;
                           var5 += var28;
                           var7 += var31;
                           var1 += Class_nc.e;
                           var32 += var34;
                           var35 += var37;
                           var38 += var40;
                        }
                     }
                  } else {
                     int var86;
                     var5 = var86 = var4 << 16;
                     if (var1 < 0) {
                        var5 -= var26 * var1;
                        var86 -= var27 * var1;
                        var7 -= var31 * var1;
                        var1 = 0;
                     }

                     var3 <<= 16;
                     if (var0 < 0) {
                        var3 -= var28 * var0;
                        var0 = 0;
                     }

                     int var125 = var1 - j;
                     var32 += var34 * var125;
                     var35 += var37 * var125;
                     var38 += var40 * var125;
                     if (var26 < var27) {
                        var2 -= var0;
                        var0 -= var1;

                        for (var1 = f[var1]; --var0 >= 0; var38 += var40) {
                           b(Class_nc.f, var19, 0, 0, var1, var5 >> 16, var86 >> 16, var7, var30, var32, var35, var38, var33, var36, var39);
                           var5 += var26;
                           var86 += var27;
                           var7 += var31;
                           var1 += Class_nc.e;
                           var32 += var34;
                           var35 += var37;
                        }

                        while (--var2 >= 0) {
                           b(Class_nc.f, var19, 0, 0, var1, var3 >> 16, var86 >> 16, var7, var30, var32, var35, var38, var33, var36, var39);
                           var3 += var28;
                           var86 += var27;
                           var7 += var31;
                           var1 += Class_nc.e;
                           var32 += var34;
                           var35 += var37;
                           var38 += var40;
                        }
                     } else {
                        var2 -= var0;
                        var0 -= var1;

                        for (var1 = f[var1]; --var0 >= 0; var38 += var40) {
                           b(Class_nc.f, var19, 0, 0, var1, var86 >> 16, var5 >> 16, var7, var30, var32, var35, var38, var33, var36, var39);
                           var5 += var26;
                           var86 += var27;
                           var7 += var31;
                           var1 += Class_nc.e;
                           var32 += var34;
                           var35 += var37;
                        }

                        while (--var2 >= 0) {
                           b(Class_nc.f, var19, 0, 0, var1, var86 >> 16, var3 >> 16, var7, var30, var32, var35, var38, var33, var36, var39);
                           var3 += var28;
                           var86 += var27;
                           var7 += var31;
                           var1 += Class_nc.e;
                           var32 += var34;
                           var35 += var37;
                           var38 += var40;
                        }
                     }
                  }
               }
            } else if (var2 < l) {
               if (var0 > l) {
                  var0 = l;
               }

               if (var1 > l) {
                  var1 = l;
               }

               var8 = (var8 << 9) - var30 * var5 + var30;
               if (var0 < var1) {
                  int var91;
                  var4 = var91 = var5 << 16;
                  if (var2 < 0) {
                     var4 -= var27 * var2;
                     var91 -= var28 * var2;
                     var8 -= var31 * var2;
                     var2 = 0;
                  }

                  var3 <<= 16;
                  if (var0 < 0) {
                     var3 -= var26 * var0;
                     var0 = 0;
                  }

                  int var124 = var2 - j;
                  var32 += var34 * var124;
                  var35 += var37 * var124;
                  var38 += var40 * var124;
                  if (var27 < var28) {
                     var1 -= var0;
                     var0 -= var2;

                     for (var2 = f[var2]; --var0 >= 0; var38 += var40) {
                        b(Class_nc.f, var19, 0, 0, var2, var4 >> 16, var91 >> 16, var8, var30, var32, var35, var38, var33, var36, var39);
                        var4 += var27;
                        var91 += var28;
                        var8 += var31;
                        var2 += Class_nc.e;
                        var32 += var34;
                        var35 += var37;
                     }

                     while (--var1 >= 0) {
                        b(Class_nc.f, var19, 0, 0, var2, var4 >> 16, var3 >> 16, var8, var30, var32, var35, var38, var33, var36, var39);
                        var4 += var27;
                        var3 += var26;
                        var8 += var31;
                        var2 += Class_nc.e;
                        var32 += var34;
                        var35 += var37;
                        var38 += var40;
                     }
                  } else {
                     var1 -= var0;
                     var0 -= var2;

                     for (var2 = f[var2]; --var0 >= 0; var38 += var40) {
                        b(Class_nc.f, var19, 0, 0, var2, var91 >> 16, var4 >> 16, var8, var30, var32, var35, var38, var33, var36, var39);
                        var4 += var27;
                        var91 += var28;
                        var8 += var31;
                        var2 += Class_nc.e;
                        var32 += var34;
                        var35 += var37;
                     }

                     while (--var1 >= 0) {
                        b(Class_nc.f, var19, 0, 0, var2, var3 >> 16, var4 >> 16, var8, var30, var32, var35, var38, var33, var36, var39);
                        var4 += var27;
                        var3 += var26;
                        var8 += var31;
                        var2 += Class_nc.e;
                        var32 += var34;
                        var35 += var37;
                        var38 += var40;
                     }
                  }
               } else {
                  int var90;
                  var3 = var90 = var5 << 16;
                  if (var2 < 0) {
                     var3 -= var27 * var2;
                     var90 -= var28 * var2;
                     var8 -= var31 * var2;
                     var2 = 0;
                  }

                  var4 <<= 16;
                  if (var1 < 0) {
                     var4 -= var26 * var1;
                     var1 = 0;
                  }

                  int var41 = var2 - j;
                  var32 += var34 * var41;
                  var35 += var37 * var41;
                  var38 += var40 * var41;
                  if (var27 < var28) {
                     var0 -= var1;
                     var1 -= var2;

                     for (var2 = f[var2]; --var1 >= 0; var38 += var40) {
                        b(Class_nc.f, var19, 0, 0, var2, var3 >> 16, var90 >> 16, var8, var30, var32, var35, var38, var33, var36, var39);
                        var3 += var27;
                        var90 += var28;
                        var8 += var31;
                        var2 += Class_nc.e;
                        var32 += var34;
                        var35 += var37;
                     }

                     while (--var0 >= 0) {
                        b(Class_nc.f, var19, 0, 0, var2, var4 >> 16, var90 >> 16, var8, var30, var32, var35, var38, var33, var36, var39);
                        var4 += var26;
                        var90 += var28;
                        var8 += var31;
                        var2 += Class_nc.e;
                        var32 += var34;
                        var35 += var37;
                        var38 += var40;
                     }
                  } else {
                     var0 -= var1;
                     var1 -= var2;

                     for (var2 = f[var2]; --var1 >= 0; var38 += var40) {
                        b(Class_nc.f, var19, 0, 0, var2, var90 >> 16, var3 >> 16, var8, var30, var32, var35, var38, var33, var36, var39);
                        var3 += var27;
                        var90 += var28;
                        var8 += var31;
                        var2 += Class_nc.e;
                        var32 += var34;
                        var35 += var37;
                     }

                     while (--var0 >= 0) {
                        b(Class_nc.f, var19, 0, 0, var2, var90 >> 16, var4 >> 16, var8, var30, var32, var35, var38, var33, var36, var39);
                        var4 += var26;
                        var90 += var28;
                        var8 += var31;
                        var2 += Class_nc.e;
                        var32 += var34;
                        var35 += var37;
                        var38 += var40;
                     }
                  }
               }
            }
         }
      }
   }

   static final void a(int var0, int var1, int var2) {
      g = var0 < 0 || var0 > r || var1 < 0 || var1 > r || var2 < 0 || var2 > r;
   }

   public static void a() {
      f = null;
      h = null;
      i = null;
      o = null;
      d = null;
      e = null;
      q = null;
   }

   static final void a(int var0, int var1) {
      int var2 = f[0];
      int var3 = var2 / Class_nc.e;
      int var4 = var2 - var3 * Class_nc.e;
      n = var0 - var4;
      j = var1 - var3;
      Class_nd.v = -n;
      Class_tb.o = r - n;
      Class_a.j = -j;
      Class_vi.R = l - j;
   }

   static final int b() {
      return f[0] / Class_nc.e;
   }

   private static final void a(int[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (g) {
         if (var5 > r) {
            var5 = r;
         }

         if (var4 < 0) {
            var4 = 0;
         }
      }

      if (var4 < var5) {
         var1 += var4;
         var6 += var7 * var4;
         if (m) {
            var3 = var5 - var4 >> 2;
            var7 <<= 2;
            if (c == 0) {
               if (var3 > 0) {
                  do {
                     var2 = h[var6 >> 8];
                     var6 += var7;
                     var0[var1++] = var2;
                     var0[var1++] = var2;
                     var0[var1++] = var2;
                     var0[var1++] = var2;
                  } while (--var3 > 0);
               }

               var3 = var5 - var4 & 3;
               if (var3 > 0) {
                  var2 = h[var6 >> 8];

                  do {
                     var0[var1++] = var2;
                  } while (--var3 > 0);

                  return;
               }
            } else {
               int var32 = c;
               int var33 = 256 - c;
               if (var3 > 0) {
                  do {
                     var2 = h[var6 >> 8];
                     var6 += var7;
                     var2 = ((var2 & 16711935) * var33 >> 8 & 16711935) + ((var2 & 0xFF00) * var33 >> 8 & 0xFF00);
                     int var34 = var0[var1];
                     var0[var1++] = var2 + ((var34 & 16711935) * var32 >> 8 & 16711935) + ((var34 & 0xFF00) * var32 >> 8 & 0xFF00);
                     var34 = var0[var1];
                     var0[var1++] = var2 + ((var34 & 16711935) * var32 >> 8 & 16711935) + ((var34 & 0xFF00) * var32 >> 8 & 0xFF00);
                     var34 = var0[var1];
                     var0[var1++] = var2 + ((var34 & 16711935) * var32 >> 8 & 16711935) + ((var34 & 0xFF00) * var32 >> 8 & 0xFF00);
                     var34 = var0[var1];
                     var0[var1++] = var2 + ((var34 & 16711935) * var32 >> 8 & 16711935) + ((var34 & 0xFF00) * var32 >> 8 & 0xFF00);
                  } while (--var3 > 0);
               }

               var3 = var5 - var4 & 3;
               if (var3 > 0) {
                  var2 = h[var6 >> 8];
                  var2 = ((var2 & 16711935) * var33 >> 8 & 16711935) + ((var2 & 0xFF00) * var33 >> 8 & 0xFF00);

                  do {
                     int var38 = var0[var1];
                     var0[var1++] = var2 + ((var38 & 16711935) * var32 >> 8 & 16711935) + ((var38 & 0xFF00) * var32 >> 8 & 0xFF00);
                  } while (--var3 > 0);
               }
            }
         } else {
            var3 = var5 - var4;
            if (c == 0) {
               do {
                  var0[var1++] = h[var6 >> 8];
                  var6 += var7;
               } while (--var3 > 0);
            } else {
               int var8 = c;
               int var9 = 256 - c;

               do {
                  var2 = h[var6 >> 8];
                  var6 += var7;
                  var2 = ((var2 & 16711935) * var9 >> 8 & 16711935) + ((var2 & 0xFF00) * var9 >> 8 & 0xFF00);
                  int var10 = var0[var1];
                  var0[var1++] = var2 + ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & 0xFF00) * var8 >> 8 & 0xFF00);
               } while (--var3 > 0);
            }
         }
      }
   }

   static final int c() {
      return f[0] % Class_nc.e;
   }

   private static final int b(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 65408) + var1;
   }

   private static final void a(
      int[] var0,
      int[] var1,
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
      int var14
   ) {
      if (g) {
         if (var6 > r) {
            var6 = r;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var4 += var5;
         var7 += var8 * var5;
         int var17 = var6 - var5;
         if (p) {
            int var23 = var5 - n;
            var9 += (var12 >> 3) * var23;
            var10 += (var13 >> 3) * var23;
            var11 += (var14 >> 3) * var23;
            int var22 = var11 >> 12;
            int var18;
            int var19;
            if (var22 != 0) {
               var18 = var9 / var22;
               var19 = var10 / var22;
            } else {
               var18 = 0;
               var19 = 0;
            }

            var9 += var12;
            var10 += var13;
            var11 += var14;
            var22 = var11 >> 12;
            int var20;
            int var21;
            if (var22 != 0) {
               var20 = var9 / var22;
               var21 = var10 / var22;
            } else {
               var20 = 0;
               var21 = 0;
            }

            var2 = (var18 << 20) + var19;
            int var16 = (var20 - var18 >> 3 << 20) + (var21 - var19 >> 3);
            var17 >>= 3;
            var8 <<= 3;
            int var15 = var7 >> 8;
            if (k) {
               if (var17 > 0) {
                  do {
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 0xFF00) * var15 & 0xFF0000) >> 8;
                     var2 += var16;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 0xFF00) * var15 & 0xFF0000) >> 8;
                     var2 += var16;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 0xFF00) * var15 & 0xFF0000) >> 8;
                     var2 += var16;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 0xFF00) * var15 & 0xFF0000) >> 8;
                     var2 += var16;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 0xFF00) * var15 & 0xFF0000) >> 8;
                     var2 += var16;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 0xFF00) * var15 & 0xFF0000) >> 8;
                     var2 += var16;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 0xFF00) * var15 & 0xFF0000) >> 8;
                     var2 += var16;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 0xFF00) * var15 & 0xFF0000) >> 8;
                     var2 += var16;
                     var18 = var20;
                     var19 = var21;
                     var9 += var12;
                     var10 += var13;
                     var11 += var14;
                     var22 = var11 >> 12;
                     if (var22 != 0) {
                        var20 = var9 / var22;
                        var21 = var10 / var22;
                     } else {
                        var20 = 0;
                        var21 = 0;
                     }

                     var2 = (var18 << 20) + var19;
                     var16 = (var20 - var18 >> 3 << 20) + (var21 - var19 >> 3);
                     var7 += var8;
                     var15 = var7 >> 8;
                  } while (--var17 > 0);
               }

               var17 = var6 - var5 & 7;
               if (var17 > 0) {
                  do {
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 0xFF00) * var15 & 0xFF0000) >> 8;
                     var2 += var16;
                  } while (--var17 > 0);

                  return;
               }

               return;
            }

            if (var17 > 0) {
               do {
                  if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                     var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 0xFF00) * var15 & 0xFF0000) >> 8;
                  }

                  var4++;
                  var2 += var16;
                  if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                     var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 0xFF00) * var15 & 0xFF0000) >> 8;
                  }

                  var4++;
                  var2 += var16;
                  if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                     var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 0xFF00) * var15 & 0xFF0000) >> 8;
                  }

                  var4++;
                  var2 += var16;
                  if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                     var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 0xFF00) * var15 & 0xFF0000) >> 8;
                  }

                  var4++;
                  var2 += var16;
                  if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                     var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 0xFF00) * var15 & 0xFF0000) >> 8;
                  }

                  var4++;
                  var2 += var16;
                  if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                     var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 0xFF00) * var15 & 0xFF0000) >> 8;
                  }

                  var4++;
                  var2 += var16;
                  if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                     var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 0xFF00) * var15 & 0xFF0000) >> 8;
                  }

                  var4++;
                  var2 += var16;
                  if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                     var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 0xFF00) * var15 & 0xFF0000) >> 8;
                  }

                  var4++;
                  var2 += var16;
                  var18 = var20;
                  var19 = var21;
                  var9 += var12;
                  var10 += var13;
                  var11 += var14;
                  var22 = var11 >> 12;
                  if (var22 != 0) {
                     var20 = var9 / var22;
                     var21 = var10 / var22;
                  } else {
                     var20 = 0;
                     var21 = 0;
                  }

                  var2 = (var18 << 20) + var19;
                  var16 = (var20 - var18 >> 3 << 20) + (var21 - var19 >> 3);
                  var7 += var8;
                  var15 = var7 >> 8;
               } while (--var17 > 0);
            }

            var17 = var6 - var5 & 7;
            if (var17 > 0) {
               do {
                  if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                     var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 0xFF00) * var15 & 0xFF0000) >> 8;
                  }

                  var4++;
                  var2 += var16;
               } while (--var17 > 0);

               return;
            }
         } else {
            int var165 = var5 - n;
            var9 += (var12 >> 3) * var165;
            var10 += (var13 >> 3) * var165;
            var11 += (var14 >> 3) * var165;
            int var161 = var11 >> 14;
            int var148;
            int var153;
            if (var161 != 0) {
               var148 = var9 / var161;
               var153 = var10 / var161;
            } else {
               var148 = 0;
               var153 = 0;
            }

            var9 += var12;
            var10 += var13;
            var11 += var14;
            var161 = var11 >> 14;
            int var156;
            int var157;
            if (var161 != 0) {
               var156 = var9 / var161;
               var157 = var10 / var161;
            } else {
               var156 = 0;
               var157 = 0;
            }

            var2 = (var148 << 18) + var153;
            int var139 = (var156 - var148 >> 3 << 18) + (var157 - var153 >> 3);
            var17 >>= 3;
            var8 <<= 3;
            int var138 = var7 >> 8;
            if (k) {
               if (var17 > 0) {
                  do {
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var138 & -16711936) + ((var3 & 0xFF00) * var138 & 0xFF0000) >> 8;
                     var2 += var139;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var138 & -16711936) + ((var3 & 0xFF00) * var138 & 0xFF0000) >> 8;
                     var2 += var139;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var138 & -16711936) + ((var3 & 0xFF00) * var138 & 0xFF0000) >> 8;
                     var2 += var139;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var138 & -16711936) + ((var3 & 0xFF00) * var138 & 0xFF0000) >> 8;
                     var2 += var139;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var138 & -16711936) + ((var3 & 0xFF00) * var138 & 0xFF0000) >> 8;
                     var2 += var139;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var138 & -16711936) + ((var3 & 0xFF00) * var138 & 0xFF0000) >> 8;
                     var2 += var139;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var138 & -16711936) + ((var3 & 0xFF00) * var138 & 0xFF0000) >> 8;
                     var2 += var139;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var138 & -16711936) + ((var3 & 0xFF00) * var138 & 0xFF0000) >> 8;
                     var2 += var139;
                     var148 = var156;
                     var153 = var157;
                     var9 += var12;
                     var10 += var13;
                     var11 += var14;
                     var161 = var11 >> 14;
                     if (var161 != 0) {
                        var156 = var9 / var161;
                        var157 = var10 / var161;
                     } else {
                        var156 = 0;
                        var157 = 0;
                     }

                     var2 = (var148 << 18) + var153;
                     var139 = (var156 - var148 >> 3 << 18) + (var157 - var153 >> 3);
                     var7 += var8;
                     var138 = var7 >> 8;
                  } while (--var17 > 0);
               }

               var17 = var6 - var5 & 7;
               if (var17 > 0) {
                  do {
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var138 & -16711936) + ((var3 & 0xFF00) * var138 & 0xFF0000) >> 8;
                     var2 += var139;
                  } while (--var17 > 0);

                  return;
               }
            } else {
               if (var17 > 0) {
                  do {
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var138 & -16711936) + ((var3 & 0xFF00) * var138 & 0xFF0000) >> 8;
                     }

                     var4++;
                     var2 += var139;
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var138 & -16711936) + ((var3 & 0xFF00) * var138 & 0xFF0000) >> 8;
                     }

                     var4++;
                     var2 += var139;
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var138 & -16711936) + ((var3 & 0xFF00) * var138 & 0xFF0000) >> 8;
                     }

                     var4++;
                     var2 += var139;
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var138 & -16711936) + ((var3 & 0xFF00) * var138 & 0xFF0000) >> 8;
                     }

                     var4++;
                     var2 += var139;
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var138 & -16711936) + ((var3 & 0xFF00) * var138 & 0xFF0000) >> 8;
                     }

                     var4++;
                     var2 += var139;
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var138 & -16711936) + ((var3 & 0xFF00) * var138 & 0xFF0000) >> 8;
                     }

                     var4++;
                     var2 += var139;
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var138 & -16711936) + ((var3 & 0xFF00) * var138 & 0xFF0000) >> 8;
                     }

                     var4++;
                     var2 += var139;
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var138 & -16711936) + ((var3 & 0xFF00) * var138 & 0xFF0000) >> 8;
                     }

                     var4++;
                     var2 += var139;
                     var148 = var156;
                     var153 = var157;
                     var9 += var12;
                     var10 += var13;
                     var11 += var14;
                     var161 = var11 >> 14;
                     if (var161 != 0) {
                        var156 = var9 / var161;
                        var157 = var10 / var161;
                     } else {
                        var156 = 0;
                        var157 = 0;
                     }

                     var2 = (var148 << 18) + var153;
                     var139 = (var156 - var148 >> 3 << 18) + (var157 - var153 >> 3);
                     var7 += var8;
                     var138 = var7 >> 8;
                  } while (--var17 > 0);
               }

               var17 = var6 - var5 & 7;
               if (var17 > 0) {
                  do {
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var138 & -16711936) + ((var3 & 0xFF00) * var138 & 0xFF0000) >> 8;
                     }

                     var4++;
                     var2 += var139;
                  } while (--var17 > 0);
               }
            }
         }
      }
   }

   private static final void a(float var0) {
      a = var0;
      a = (float)(a + (Math.random() * 0.03 - 0.015));
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = 0;
      if (var1 != var0) {
         var7 = (var4 - var3 << 16) / (var1 - var0);
      }

      int var8 = 0;
      if (var2 != var1) {
         var8 = (var5 - var4 << 16) / (var2 - var1);
      }

      int var9 = 0;
      if (var2 != var0) {
         var9 = (var3 - var5 << 16) / (var0 - var2);
      }

      if (var0 <= var1 && var0 <= var2) {
         if (var0 < l) {
            if (var1 > l) {
               var1 = l;
            }

            if (var2 > l) {
               var2 = l;
            }

            if (var1 < var2) {
               int var51;
               var5 = var51 = var3 << 16;
               if (var0 < 0) {
                  var5 -= var9 * var0;
                  var51 -= var7 * var0;
                  var0 = 0;
               }

               var4 <<= 16;
               if (var1 < 0) {
                  var4 -= var8 * var1;
                  var1 = 0;
               }

               if ((var0 == var1 || var9 >= var7) && (var0 != var1 || var9 <= var8)) {
                  var2 -= var1;
                  var1 -= var0;

                  for (var0 = f[var0]; --var1 >= 0; var0 += Class_nc.e) {
                     a(Class_nc.f, var0, var6, 0, var51 >> 16, var5 >> 16);
                     var5 += var9;
                     var51 += var7;
                  }

                  while (--var2 >= 0) {
                     a(Class_nc.f, var0, var6, 0, var4 >> 16, var5 >> 16);
                     var5 += var9;
                     var4 += var8;
                     var0 += Class_nc.e;
                  }
               } else {
                  var2 -= var1;
                  var1 -= var0;

                  for (var0 = f[var0]; --var1 >= 0; var0 += Class_nc.e) {
                     a(Class_nc.f, var0, var6, 0, var5 >> 16, var51 >> 16);
                     var5 += var9;
                     var51 += var7;
                  }

                  while (--var2 >= 0) {
                     a(Class_nc.f, var0, var6, 0, var5 >> 16, var4 >> 16);
                     var5 += var9;
                     var4 += var8;
                     var0 += Class_nc.e;
                  }
               }
            } else {
               int var50;
               var4 = var50 = var3 << 16;
               if (var0 < 0) {
                  var4 -= var9 * var0;
                  var50 -= var7 * var0;
                  var0 = 0;
               }

               var5 <<= 16;
               if (var2 < 0) {
                  var5 -= var8 * var2;
                  var2 = 0;
               }

               if ((var0 == var2 || var9 >= var7) && (var0 != var2 || var8 <= var7)) {
                  var1 -= var2;
                  var2 -= var0;

                  for (var0 = f[var0]; --var2 >= 0; var0 += Class_nc.e) {
                     a(Class_nc.f, var0, var6, 0, var50 >> 16, var4 >> 16);
                     var4 += var9;
                     var50 += var7;
                  }

                  while (--var1 >= 0) {
                     a(Class_nc.f, var0, var6, 0, var50 >> 16, var5 >> 16);
                     var5 += var8;
                     var50 += var7;
                     var0 += Class_nc.e;
                  }
               } else {
                  var1 -= var2;
                  var2 -= var0;

                  for (var0 = f[var0]; --var2 >= 0; var0 += Class_nc.e) {
                     a(Class_nc.f, var0, var6, 0, var4 >> 16, var50 >> 16);
                     var4 += var9;
                     var50 += var7;
                  }

                  while (--var1 >= 0) {
                     a(Class_nc.f, var0, var6, 0, var5 >> 16, var50 >> 16);
                     var5 += var8;
                     var50 += var7;
                     var0 += Class_nc.e;
                  }
               }
            }
         }
      } else if (var1 <= var2) {
         if (var1 < l) {
            if (var2 > l) {
               var2 = l;
            }

            if (var0 > l) {
               var0 = l;
            }

            if (var2 < var0) {
               int var55;
               var3 = var55 = var4 << 16;
               if (var1 < 0) {
                  var3 -= var7 * var1;
                  var55 -= var8 * var1;
                  var1 = 0;
               }

               var5 <<= 16;
               if (var2 < 0) {
                  var5 -= var9 * var2;
                  var2 = 0;
               }

               if ((var1 == var2 || var7 >= var8) && (var1 != var2 || var7 <= var9)) {
                  var0 -= var2;
                  var2 -= var1;

                  for (var1 = f[var1]; --var2 >= 0; var1 += Class_nc.e) {
                     a(Class_nc.f, var1, var6, 0, var55 >> 16, var3 >> 16);
                     var3 += var7;
                     var55 += var8;
                  }

                  while (--var0 >= 0) {
                     a(Class_nc.f, var1, var6, 0, var5 >> 16, var3 >> 16);
                     var3 += var7;
                     var5 += var9;
                     var1 += Class_nc.e;
                  }
               } else {
                  var0 -= var2;
                  var2 -= var1;

                  for (var1 = f[var1]; --var2 >= 0; var1 += Class_nc.e) {
                     a(Class_nc.f, var1, var6, 0, var3 >> 16, var55 >> 16);
                     var3 += var7;
                     var55 += var8;
                  }

                  while (--var0 >= 0) {
                     a(Class_nc.f, var1, var6, 0, var3 >> 16, var5 >> 16);
                     var3 += var7;
                     var5 += var9;
                     var1 += Class_nc.e;
                  }
               }
            } else {
               int var54;
               var5 = var54 = var4 << 16;
               if (var1 < 0) {
                  var5 -= var7 * var1;
                  var54 -= var8 * var1;
                  var1 = 0;
               }

               var3 <<= 16;
               if (var0 < 0) {
                  var3 -= var9 * var0;
                  var0 = 0;
               }

               if (var7 < var8) {
                  var2 -= var0;
                  var0 -= var1;

                  for (var1 = f[var1]; --var0 >= 0; var1 += Class_nc.e) {
                     a(Class_nc.f, var1, var6, 0, var5 >> 16, var54 >> 16);
                     var5 += var7;
                     var54 += var8;
                  }

                  while (--var2 >= 0) {
                     a(Class_nc.f, var1, var6, 0, var3 >> 16, var54 >> 16);
                     var3 += var9;
                     var54 += var8;
                     var1 += Class_nc.e;
                  }
               } else {
                  var2 -= var0;
                  var0 -= var1;

                  for (var1 = f[var1]; --var0 >= 0; var1 += Class_nc.e) {
                     a(Class_nc.f, var1, var6, 0, var54 >> 16, var5 >> 16);
                     var5 += var7;
                     var54 += var8;
                  }

                  while (--var2 >= 0) {
                     a(Class_nc.f, var1, var6, 0, var54 >> 16, var3 >> 16);
                     var3 += var9;
                     var54 += var8;
                     var1 += Class_nc.e;
                  }
               }
            }
         }
      } else if (var2 < l) {
         if (var0 > l) {
            var0 = l;
         }

         if (var1 > l) {
            var1 = l;
         }

         if (var0 < var1) {
            int var59;
            var4 = var59 = var5 << 16;
            if (var2 < 0) {
               var4 -= var8 * var2;
               var59 -= var9 * var2;
               var2 = 0;
            }

            var3 <<= 16;
            if (var0 < 0) {
               var3 -= var7 * var0;
               var0 = 0;
            }

            if (var8 < var9) {
               var1 -= var0;
               var0 -= var2;

               for (var2 = f[var2]; --var0 >= 0; var2 += Class_nc.e) {
                  a(Class_nc.f, var2, var6, 0, var4 >> 16, var59 >> 16);
                  var4 += var8;
                  var59 += var9;
               }

               while (--var1 >= 0) {
                  a(Class_nc.f, var2, var6, 0, var4 >> 16, var3 >> 16);
                  var4 += var8;
                  var3 += var7;
                  var2 += Class_nc.e;
               }
            } else {
               var1 -= var0;
               var0 -= var2;

               for (var2 = f[var2]; --var0 >= 0; var2 += Class_nc.e) {
                  a(Class_nc.f, var2, var6, 0, var59 >> 16, var4 >> 16);
                  var4 += var8;
                  var59 += var9;
               }

               while (--var1 >= 0) {
                  a(Class_nc.f, var2, var6, 0, var3 >> 16, var4 >> 16);
                  var4 += var8;
                  var3 += var7;
                  var2 += Class_nc.e;
               }
            }
         } else {
            int var58;
            var3 = var58 = var5 << 16;
            if (var2 < 0) {
               var3 -= var8 * var2;
               var58 -= var9 * var2;
               var2 = 0;
            }

            var4 <<= 16;
            if (var1 < 0) {
               var4 -= var7 * var1;
               var1 = 0;
            }

            if (var8 < var9) {
               var0 -= var1;
               var1 -= var2;

               for (var2 = f[var2]; --var1 >= 0; var2 += Class_nc.e) {
                  a(Class_nc.f, var2, var6, 0, var3 >> 16, var58 >> 16);
                  var3 += var8;
                  var58 += var9;
               }

               while (--var0 >= 0) {
                  a(Class_nc.f, var2, var6, 0, var4 >> 16, var58 >> 16);
                  var4 += var7;
                  var58 += var9;
                  var2 += Class_nc.e;
               }
            } else {
               var0 -= var1;
               var1 -= var2;

               for (var2 = f[var2]; --var1 >= 0; var2 += Class_nc.e) {
                  a(Class_nc.f, var2, var6, 0, var58 >> 16, var3 >> 16);
                  var3 += var8;
                  var58 += var9;
               }

               while (--var0 >= 0) {
                  a(Class_nc.f, var2, var6, 0, var58 >> 16, var4 >> 16);
                  var4 += var7;
                  var58 += var9;
                  var2 += Class_nc.e;
               }
            }
         }
      }
   }

   static final void a(Class_ri var0) {
      i = var0;
   }

   static final void d() {
      a(Class_nc.d, Class_nc.g, Class_nc.b, Class_nc.h);
   }

   private static final void a(int var0, int var1, int var2, int var3) {
      r = var2 - var0;
      l = var3 - var1;
      e();
      if (f.length < l) {
         f = new int[Class_pa.f(l, -21189)];
      }

      int var4 = var1 * Class_nc.e + var0;

      for (int var5 = 0; var5 < l; var5++) {
         f[var5] = var4;
         var4 += Class_nc.e;
      }
   }

   static final void b(float var0) {
      a(var0);
      c(0, 512);
   }

   private static final void a(int[] var0, int var1, int var2, int var3, int var4, int var5) {
      if (g) {
         if (var5 > r) {
            var5 = r;
         }

         if (var4 < 0) {
            var4 = 0;
         }
      }

      if (var4 < var5) {
         var1 += var4;
         var3 = var5 - var4 >> 2;
         if (c == 0) {
            while (--var3 >= 0) {
               var0[var1++] = var2;
               var0[var1++] = var2;
               var0[var1++] = var2;
               var0[var1++] = var2;
            }

            var3 = var5 - var4 & 3;

            while (--var3 >= 0) {
               var0[var1++] = var2;
            }
         } else if (c == 254) {
            while (--var3 >= 0) {
               var0[var1++] = var0[var1];
               var0[var1++] = var0[var1];
               var0[var1++] = var0[var1];
               var0[var1++] = var0[var1];
            }

            var3 = var5 - var4 & 3;

            while (--var3 >= 0) {
               var0[var1++] = var0[var1];
            }
         } else {
            int var6 = c;
            int var7 = 256 - c;
            var2 = ((var2 & 16711935) * var7 >> 8 & 16711935) + ((var2 & 0xFF00) * var7 >> 8 & 0xFF00);

            while (--var3 >= 0) {
               int var8 = var0[var1];
               var0[var1++] = var2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & 0xFF00) * var6 >> 8 & 0xFF00);
               var8 = var0[var1];
               var0[var1++] = var2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & 0xFF00) * var6 >> 8 & 0xFF00);
               var8 = var0[var1];
               var0[var1++] = var2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & 0xFF00) * var6 >> 8 & 0xFF00);
               var8 = var0[var1];
               var0[var1++] = var2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & 0xFF00) * var6 >> 8 & 0xFF00);
            }

            var3 = var5 - var4 & 3;

            while (--var3 >= 0) {
               int var27 = var0[var1];
               var0[var1++] = var2 + ((var27 & 16711935) * var6 >> 8 & 16711935) + ((var27 & 0xFF00) * var6 >> 8 & 0xFF00);
            }
         }
      }
   }

   static final void b(
      int var0,
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
      int var18
   ) {
      int[] var19 = i.a(a, 99, var18);
      if (var19 != null && c <= 10) {
         p = i.b((byte)-118, var18);
         k = i.a(var18, 2);
         int var105 = var4 - var3;
         int var21 = var1 - var0;
         int var22 = var5 - var3;
         int var23 = var2 - var0;
         int var24 = var7 - var6;
         int var25 = var8 - var6;
         int var26 = 0;
         if (var1 != var0) {
            var26 = (var4 - var3 << 16) / (var1 - var0);
         }

         int var27 = 0;
         if (var2 != var1) {
            var27 = (var5 - var4 << 16) / (var2 - var1);
         }

         int var28 = 0;
         if (var2 != var0) {
            var28 = (var3 - var5 << 16) / (var0 - var2);
         }

         int var29 = var105 * var23 - var22 * var21;
         if (var29 != 0) {
            int var30 = (var24 * var23 - var25 * var21 << 9) / var29;
            int var31 = (var25 * var105 - var24 * var22 << 9) / var29;
            var10 = var9 - var10;
            var13 = var12 - var13;
            var16 = var15 - var16;
            var11 -= var9;
            var14 -= var12;
            var17 -= var15;
            int var32 = var11 * var12 - var14 * var9 << 14;
            int var33 = var14 * var15 - var17 * var12 << 8;
            int var34 = var17 * var9 - var11 * var15 << 5;
            int var35 = var10 * var12 - var13 * var9 << 14;
            int var36 = var13 * var15 - var16 * var12 << 8;
            int var37 = var16 * var9 - var10 * var15 << 5;
            int var38 = var13 * var11 - var10 * var14 << 14;
            int var39 = var16 * var14 - var13 * var17 << 8;
            int var40 = var10 * var17 - var16 * var11 << 5;
            if (var0 <= var1 && var0 <= var2) {
               if (var0 < l) {
                  if (var1 > l) {
                     var1 = l;
                  }

                  if (var2 > l) {
                     var2 = l;
                  }

                  var6 = (var6 << 9) - var30 * var3 + var30;
                  if (var1 < var2) {
                     int var83;
                     var5 = var83 = var3 << 16;
                     if (var0 < 0) {
                        var5 -= var28 * var0;
                        var83 -= var26 * var0;
                        var6 -= var31 * var0;
                        var0 = 0;
                     }

                     var4 <<= 16;
                     if (var1 < 0) {
                        var4 -= var27 * var1;
                        var1 = 0;
                     }

                     int var128 = var0 - j;
                     var32 += var34 * var128;
                     var35 += var37 * var128;
                     var38 += var40 * var128;
                     if ((var0 == var1 || var28 >= var26) && (var0 != var1 || var28 <= var27)) {
                        var2 -= var1;
                        var1 -= var0;

                        for (var0 = f[var0]; --var1 >= 0; var38 += var40) {
                           a(Class_nc.f, var19, 0, 0, var0, var83 >> 16, var5 >> 16, var6, var30, var32, var35, var38, var33, var36, var39);
                           var5 += var28;
                           var83 += var26;
                           var6 += var31;
                           var0 += Class_nc.e;
                           var32 += var34;
                           var35 += var37;
                        }

                        while (--var2 >= 0) {
                           a(Class_nc.f, var19, 0, 0, var0, var4 >> 16, var5 >> 16, var6, var30, var32, var35, var38, var33, var36, var39);
                           var5 += var28;
                           var4 += var27;
                           var6 += var31;
                           var0 += Class_nc.e;
                           var32 += var34;
                           var35 += var37;
                           var38 += var40;
                        }
                     } else {
                        var2 -= var1;
                        var1 -= var0;

                        for (var0 = f[var0]; --var1 >= 0; var38 += var40) {
                           a(Class_nc.f, var19, 0, 0, var0, var5 >> 16, var83 >> 16, var6, var30, var32, var35, var38, var33, var36, var39);
                           var5 += var28;
                           var83 += var26;
                           var6 += var31;
                           var0 += Class_nc.e;
                           var32 += var34;
                           var35 += var37;
                        }

                        while (--var2 >= 0) {
                           a(Class_nc.f, var19, 0, 0, var0, var5 >> 16, var4 >> 16, var6, var30, var32, var35, var38, var33, var36, var39);
                           var5 += var28;
                           var4 += var27;
                           var6 += var31;
                           var0 += Class_nc.e;
                           var32 += var34;
                           var35 += var37;
                           var38 += var40;
                        }
                     }
                  } else {
                     int var82;
                     var4 = var82 = var3 << 16;
                     if (var0 < 0) {
                        var4 -= var28 * var0;
                        var82 -= var26 * var0;
                        var6 -= var31 * var0;
                        var0 = 0;
                     }

                     var5 <<= 16;
                     if (var2 < 0) {
                        var5 -= var27 * var2;
                        var2 = 0;
                     }

                     int var127 = var0 - j;
                     var32 += var34 * var127;
                     var35 += var37 * var127;
                     var38 += var40 * var127;
                     if ((var0 == var2 || var28 >= var26) && (var0 != var2 || var27 <= var26)) {
                        var1 -= var2;
                        var2 -= var0;

                        for (var0 = f[var0]; --var2 >= 0; var38 += var40) {
                           a(Class_nc.f, var19, 0, 0, var0, var82 >> 16, var4 >> 16, var6, var30, var32, var35, var38, var33, var36, var39);
                           var4 += var28;
                           var82 += var26;
                           var6 += var31;
                           var0 += Class_nc.e;
                           var32 += var34;
                           var35 += var37;
                        }

                        while (--var1 >= 0) {
                           a(Class_nc.f, var19, 0, 0, var0, var82 >> 16, var5 >> 16, var6, var30, var32, var35, var38, var33, var36, var39);
                           var5 += var27;
                           var82 += var26;
                           var6 += var31;
                           var0 += Class_nc.e;
                           var32 += var34;
                           var35 += var37;
                           var38 += var40;
                        }
                     } else {
                        var1 -= var2;
                        var2 -= var0;

                        for (var0 = f[var0]; --var2 >= 0; var38 += var40) {
                           a(Class_nc.f, var19, 0, 0, var0, var4 >> 16, var82 >> 16, var6, var30, var32, var35, var38, var33, var36, var39);
                           var4 += var28;
                           var82 += var26;
                           var6 += var31;
                           var0 += Class_nc.e;
                           var32 += var34;
                           var35 += var37;
                        }

                        while (--var1 >= 0) {
                           a(Class_nc.f, var19, 0, 0, var0, var5 >> 16, var82 >> 16, var6, var30, var32, var35, var38, var33, var36, var39);
                           var5 += var27;
                           var82 += var26;
                           var6 += var31;
                           var0 += Class_nc.e;
                           var32 += var34;
                           var35 += var37;
                           var38 += var40;
                        }
                     }
                  }
               }
            } else if (var1 <= var2) {
               if (var1 < l) {
                  if (var2 > l) {
                     var2 = l;
                  }

                  if (var0 > l) {
                     var0 = l;
                  }

                  var7 = (var7 << 9) - var30 * var4 + var30;
                  if (var2 < var0) {
                     int var87;
                     var3 = var87 = var4 << 16;
                     if (var1 < 0) {
                        var3 -= var26 * var1;
                        var87 -= var27 * var1;
                        var7 -= var31 * var1;
                        var1 = 0;
                     }

                     var5 <<= 16;
                     if (var2 < 0) {
                        var5 -= var28 * var2;
                        var2 = 0;
                     }

                     int var126 = var1 - j;
                     var32 += var34 * var126;
                     var35 += var37 * var126;
                     var38 += var40 * var126;
                     if ((var1 == var2 || var26 >= var27) && (var1 != var2 || var26 <= var28)) {
                        var0 -= var2;
                        var2 -= var1;

                        for (var1 = f[var1]; --var2 >= 0; var38 += var40) {
                           a(Class_nc.f, var19, 0, 0, var1, var87 >> 16, var3 >> 16, var7, var30, var32, var35, var38, var33, var36, var39);
                           var3 += var26;
                           var87 += var27;
                           var7 += var31;
                           var1 += Class_nc.e;
                           var32 += var34;
                           var35 += var37;
                        }

                        while (--var0 >= 0) {
                           a(Class_nc.f, var19, 0, 0, var1, var5 >> 16, var3 >> 16, var7, var30, var32, var35, var38, var33, var36, var39);
                           var3 += var26;
                           var5 += var28;
                           var7 += var31;
                           var1 += Class_nc.e;
                           var32 += var34;
                           var35 += var37;
                           var38 += var40;
                        }
                     } else {
                        var0 -= var2;
                        var2 -= var1;

                        for (var1 = f[var1]; --var2 >= 0; var38 += var40) {
                           a(Class_nc.f, var19, 0, 0, var1, var3 >> 16, var87 >> 16, var7, var30, var32, var35, var38, var33, var36, var39);
                           var3 += var26;
                           var87 += var27;
                           var7 += var31;
                           var1 += Class_nc.e;
                           var32 += var34;
                           var35 += var37;
                        }

                        while (--var0 >= 0) {
                           a(Class_nc.f, var19, 0, 0, var1, var3 >> 16, var5 >> 16, var7, var30, var32, var35, var38, var33, var36, var39);
                           var3 += var26;
                           var5 += var28;
                           var7 += var31;
                           var1 += Class_nc.e;
                           var32 += var34;
                           var35 += var37;
                           var38 += var40;
                        }
                     }
                  } else {
                     int var86;
                     var5 = var86 = var4 << 16;
                     if (var1 < 0) {
                        var5 -= var26 * var1;
                        var86 -= var27 * var1;
                        var7 -= var31 * var1;
                        var1 = 0;
                     }

                     var3 <<= 16;
                     if (var0 < 0) {
                        var3 -= var28 * var0;
                        var0 = 0;
                     }

                     int var125 = var1 - j;
                     var32 += var34 * var125;
                     var35 += var37 * var125;
                     var38 += var40 * var125;
                     if (var26 < var27) {
                        var2 -= var0;
                        var0 -= var1;

                        for (var1 = f[var1]; --var0 >= 0; var38 += var40) {
                           a(Class_nc.f, var19, 0, 0, var1, var5 >> 16, var86 >> 16, var7, var30, var32, var35, var38, var33, var36, var39);
                           var5 += var26;
                           var86 += var27;
                           var7 += var31;
                           var1 += Class_nc.e;
                           var32 += var34;
                           var35 += var37;
                        }

                        while (--var2 >= 0) {
                           a(Class_nc.f, var19, 0, 0, var1, var3 >> 16, var86 >> 16, var7, var30, var32, var35, var38, var33, var36, var39);
                           var3 += var28;
                           var86 += var27;
                           var7 += var31;
                           var1 += Class_nc.e;
                           var32 += var34;
                           var35 += var37;
                           var38 += var40;
                        }
                     } else {
                        var2 -= var0;
                        var0 -= var1;

                        for (var1 = f[var1]; --var0 >= 0; var38 += var40) {
                           a(Class_nc.f, var19, 0, 0, var1, var86 >> 16, var5 >> 16, var7, var30, var32, var35, var38, var33, var36, var39);
                           var5 += var26;
                           var86 += var27;
                           var7 += var31;
                           var1 += Class_nc.e;
                           var32 += var34;
                           var35 += var37;
                        }

                        while (--var2 >= 0) {
                           a(Class_nc.f, var19, 0, 0, var1, var86 >> 16, var3 >> 16, var7, var30, var32, var35, var38, var33, var36, var39);
                           var3 += var28;
                           var86 += var27;
                           var7 += var31;
                           var1 += Class_nc.e;
                           var32 += var34;
                           var35 += var37;
                           var38 += var40;
                        }
                     }
                  }
               }
            } else if (var2 < l) {
               if (var0 > l) {
                  var0 = l;
               }

               if (var1 > l) {
                  var1 = l;
               }

               var8 = (var8 << 9) - var30 * var5 + var30;
               if (var0 < var1) {
                  int var91;
                  var4 = var91 = var5 << 16;
                  if (var2 < 0) {
                     var4 -= var27 * var2;
                     var91 -= var28 * var2;
                     var8 -= var31 * var2;
                     var2 = 0;
                  }

                  var3 <<= 16;
                  if (var0 < 0) {
                     var3 -= var26 * var0;
                     var0 = 0;
                  }

                  int var124 = var2 - j;
                  var32 += var34 * var124;
                  var35 += var37 * var124;
                  var38 += var40 * var124;
                  if (var27 < var28) {
                     var1 -= var0;
                     var0 -= var2;

                     for (var2 = f[var2]; --var0 >= 0; var38 += var40) {
                        a(Class_nc.f, var19, 0, 0, var2, var4 >> 16, var91 >> 16, var8, var30, var32, var35, var38, var33, var36, var39);
                        var4 += var27;
                        var91 += var28;
                        var8 += var31;
                        var2 += Class_nc.e;
                        var32 += var34;
                        var35 += var37;
                     }

                     while (--var1 >= 0) {
                        a(Class_nc.f, var19, 0, 0, var2, var4 >> 16, var3 >> 16, var8, var30, var32, var35, var38, var33, var36, var39);
                        var4 += var27;
                        var3 += var26;
                        var8 += var31;
                        var2 += Class_nc.e;
                        var32 += var34;
                        var35 += var37;
                        var38 += var40;
                     }
                  } else {
                     var1 -= var0;
                     var0 -= var2;

                     for (var2 = f[var2]; --var0 >= 0; var38 += var40) {
                        a(Class_nc.f, var19, 0, 0, var2, var91 >> 16, var4 >> 16, var8, var30, var32, var35, var38, var33, var36, var39);
                        var4 += var27;
                        var91 += var28;
                        var8 += var31;
                        var2 += Class_nc.e;
                        var32 += var34;
                        var35 += var37;
                     }

                     while (--var1 >= 0) {
                        a(Class_nc.f, var19, 0, 0, var2, var3 >> 16, var4 >> 16, var8, var30, var32, var35, var38, var33, var36, var39);
                        var4 += var27;
                        var3 += var26;
                        var8 += var31;
                        var2 += Class_nc.e;
                        var32 += var34;
                        var35 += var37;
                        var38 += var40;
                     }
                  }
               } else {
                  int var90;
                  var3 = var90 = var5 << 16;
                  if (var2 < 0) {
                     var3 -= var27 * var2;
                     var90 -= var28 * var2;
                     var8 -= var31 * var2;
                     var2 = 0;
                  }

                  var4 <<= 16;
                  if (var1 < 0) {
                     var4 -= var26 * var1;
                     var1 = 0;
                  }

                  int var41 = var2 - j;
                  var32 += var34 * var41;
                  var35 += var37 * var41;
                  var38 += var40 * var41;
                  if (var27 < var28) {
                     var0 -= var1;
                     var1 -= var2;

                     for (var2 = f[var2]; --var1 >= 0; var38 += var40) {
                        a(Class_nc.f, var19, 0, 0, var2, var3 >> 16, var90 >> 16, var8, var30, var32, var35, var38, var33, var36, var39);
                        var3 += var27;
                        var90 += var28;
                        var8 += var31;
                        var2 += Class_nc.e;
                        var32 += var34;
                        var35 += var37;
                     }

                     while (--var0 >= 0) {
                        a(Class_nc.f, var19, 0, 0, var2, var4 >> 16, var90 >> 16, var8, var30, var32, var35, var38, var33, var36, var39);
                        var4 += var26;
                        var90 += var28;
                        var8 += var31;
                        var2 += Class_nc.e;
                        var32 += var34;
                        var35 += var37;
                        var38 += var40;
                     }
                  } else {
                     var0 -= var1;
                     var1 -= var2;

                     for (var2 = f[var2]; --var1 >= 0; var38 += var40) {
                        a(Class_nc.f, var19, 0, 0, var2, var90 >> 16, var3 >> 16, var8, var30, var32, var35, var38, var33, var36, var39);
                        var3 += var27;
                        var90 += var28;
                        var8 += var31;
                        var2 += Class_nc.e;
                        var32 += var34;
                        var35 += var37;
                     }

                     while (--var0 >= 0) {
                        a(Class_nc.f, var19, 0, 0, var2, var90 >> 16, var4 >> 16, var8, var30, var32, var35, var38, var33, var36, var39);
                        var4 += var26;
                        var90 += var28;
                        var8 += var31;
                        var2 += Class_nc.e;
                        var32 += var34;
                        var35 += var37;
                        var38 += var40;
                     }
                  }
               }
            }
         }
      } else {
         int var20 = i.c(var18, -79);
         b = true;
         a(var0, var1, var2, var3, var4, var5, b(var20, var6), b(var20, var7), b(var20, var8));
      }
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = var4 - var3;
      int var10 = var1 - var0;
      int var11 = var5 - var3;
      int var12 = var2 - var0;
      int var13 = var7 - var6;
      int var14 = var8 - var6;
      int var15;
      if (var2 != var1) {
         var15 = (var5 - var4 << 16) / (var2 - var1);
      } else {
         var15 = 0;
      }

      int var16;
      if (var1 != var0) {
         var16 = (var9 << 16) / var10;
      } else {
         var16 = 0;
      }

      int var17;
      if (var2 != var0) {
         var17 = (var11 << 16) / var12;
      } else {
         var17 = 0;
      }

      int var18 = var9 * var12 - var11 * var10;
      if (var18 != 0) {
         int var19 = (var13 * var12 - var14 * var10 << 8) / var18;
         int var20 = (var14 * var9 - var13 * var11 << 8) / var18;
         if (var0 <= var1 && var0 <= var2) {
            if (var0 < l) {
               if (var1 > l) {
                  var1 = l;
               }

               if (var2 > l) {
                  var2 = l;
               }

               var6 = (var6 << 8) - var19 * var3 + var19;
               if (var1 < var2) {
                  int var62;
                  var5 = var62 = var3 << 16;
                  if (var0 < 0) {
                     var5 -= var17 * var0;
                     var62 -= var16 * var0;
                     var6 -= var20 * var0;
                     var0 = 0;
                  }

                  var4 <<= 16;
                  if (var1 < 0) {
                     var4 -= var15 * var1;
                     var1 = 0;
                  }

                  if ((var0 == var1 || var17 >= var16) && (var0 != var1 || var17 <= var15)) {
                     var2 -= var1;
                     var1 -= var0;

                     for (var0 = f[var0]; --var1 >= 0; var0 += Class_nc.e) {
                        a(Class_nc.f, var0, 0, 0, var62 >> 16, var5 >> 16, var6, var19);
                        var5 += var17;
                        var62 += var16;
                        var6 += var20;
                     }

                     while (--var2 >= 0) {
                        a(Class_nc.f, var0, 0, 0, var4 >> 16, var5 >> 16, var6, var19);
                        var5 += var17;
                        var4 += var15;
                        var6 += var20;
                        var0 += Class_nc.e;
                     }
                  } else {
                     var2 -= var1;
                     var1 -= var0;

                     for (var0 = f[var0]; --var1 >= 0; var0 += Class_nc.e) {
                        a(Class_nc.f, var0, 0, 0, var5 >> 16, var62 >> 16, var6, var19);
                        var5 += var17;
                        var62 += var16;
                        var6 += var20;
                     }

                     while (--var2 >= 0) {
                        a(Class_nc.f, var0, 0, 0, var5 >> 16, var4 >> 16, var6, var19);
                        var5 += var17;
                        var4 += var15;
                        var6 += var20;
                        var0 += Class_nc.e;
                     }
                  }
               } else {
                  int var61;
                  var4 = var61 = var3 << 16;
                  if (var0 < 0) {
                     var4 -= var17 * var0;
                     var61 -= var16 * var0;
                     var6 -= var20 * var0;
                     var0 = 0;
                  }

                  var5 <<= 16;
                  if (var2 < 0) {
                     var5 -= var15 * var2;
                     var2 = 0;
                  }

                  if ((var0 == var2 || var17 >= var16) && (var0 != var2 || var15 <= var16)) {
                     var1 -= var2;
                     var2 -= var0;

                     for (var0 = f[var0]; --var2 >= 0; var0 += Class_nc.e) {
                        a(Class_nc.f, var0, 0, 0, var61 >> 16, var4 >> 16, var6, var19);
                        var4 += var17;
                        var61 += var16;
                        var6 += var20;
                     }

                     while (--var1 >= 0) {
                        a(Class_nc.f, var0, 0, 0, var61 >> 16, var5 >> 16, var6, var19);
                        var5 += var15;
                        var61 += var16;
                        var6 += var20;
                        var0 += Class_nc.e;
                     }
                  } else {
                     var1 -= var2;
                     var2 -= var0;

                     for (var0 = f[var0]; --var2 >= 0; var0 += Class_nc.e) {
                        a(Class_nc.f, var0, 0, 0, var4 >> 16, var61 >> 16, var6, var19);
                        var4 += var17;
                        var61 += var16;
                        var6 += var20;
                     }

                     while (--var1 >= 0) {
                        a(Class_nc.f, var0, 0, 0, var5 >> 16, var61 >> 16, var6, var19);
                        var5 += var15;
                        var61 += var16;
                        var6 += var20;
                        var0 += Class_nc.e;
                     }
                  }
               }
            }
         } else if (var1 <= var2) {
            if (var1 < l) {
               if (var2 > l) {
                  var2 = l;
               }

               if (var0 > l) {
                  var0 = l;
               }

               var7 = (var7 << 8) - var19 * var4 + var19;
               if (var2 < var0) {
                  int var66;
                  var3 = var66 = var4 << 16;
                  if (var1 < 0) {
                     var3 -= var16 * var1;
                     var66 -= var15 * var1;
                     var7 -= var20 * var1;
                     var1 = 0;
                  }

                  var5 <<= 16;
                  if (var2 < 0) {
                     var5 -= var17 * var2;
                     var2 = 0;
                  }

                  if ((var1 == var2 || var16 >= var15) && (var1 != var2 || var16 <= var17)) {
                     var0 -= var2;
                     var2 -= var1;

                     for (var1 = f[var1]; --var2 >= 0; var1 += Class_nc.e) {
                        a(Class_nc.f, var1, 0, 0, var66 >> 16, var3 >> 16, var7, var19);
                        var3 += var16;
                        var66 += var15;
                        var7 += var20;
                     }

                     while (--var0 >= 0) {
                        a(Class_nc.f, var1, 0, 0, var5 >> 16, var3 >> 16, var7, var19);
                        var3 += var16;
                        var5 += var17;
                        var7 += var20;
                        var1 += Class_nc.e;
                     }
                  } else {
                     var0 -= var2;
                     var2 -= var1;

                     for (var1 = f[var1]; --var2 >= 0; var1 += Class_nc.e) {
                        a(Class_nc.f, var1, 0, 0, var3 >> 16, var66 >> 16, var7, var19);
                        var3 += var16;
                        var66 += var15;
                        var7 += var20;
                     }

                     while (--var0 >= 0) {
                        a(Class_nc.f, var1, 0, 0, var3 >> 16, var5 >> 16, var7, var19);
                        var3 += var16;
                        var5 += var17;
                        var7 += var20;
                        var1 += Class_nc.e;
                     }
                  }
               } else {
                  int var65;
                  var5 = var65 = var4 << 16;
                  if (var1 < 0) {
                     var5 -= var16 * var1;
                     var65 -= var15 * var1;
                     var7 -= var20 * var1;
                     var1 = 0;
                  }

                  var3 <<= 16;
                  if (var0 < 0) {
                     var3 -= var17 * var0;
                     var0 = 0;
                  }

                  if (var16 < var15) {
                     var2 -= var0;
                     var0 -= var1;

                     for (var1 = f[var1]; --var0 >= 0; var1 += Class_nc.e) {
                        a(Class_nc.f, var1, 0, 0, var5 >> 16, var65 >> 16, var7, var19);
                        var5 += var16;
                        var65 += var15;
                        var7 += var20;
                     }

                     while (--var2 >= 0) {
                        a(Class_nc.f, var1, 0, 0, var3 >> 16, var65 >> 16, var7, var19);
                        var3 += var17;
                        var65 += var15;
                        var7 += var20;
                        var1 += Class_nc.e;
                     }
                  } else {
                     var2 -= var0;
                     var0 -= var1;

                     for (var1 = f[var1]; --var0 >= 0; var1 += Class_nc.e) {
                        a(Class_nc.f, var1, 0, 0, var65 >> 16, var5 >> 16, var7, var19);
                        var5 += var16;
                        var65 += var15;
                        var7 += var20;
                     }

                     while (--var2 >= 0) {
                        a(Class_nc.f, var1, 0, 0, var65 >> 16, var3 >> 16, var7, var19);
                        var3 += var17;
                        var65 += var15;
                        var7 += var20;
                        var1 += Class_nc.e;
                     }
                  }
               }
            }
         } else if (var2 < l) {
            if (var0 > l) {
               var0 = l;
            }

            if (var1 > l) {
               var1 = l;
            }

            var8 = (var8 << 8) - var19 * var5 + var19;
            if (var0 < var1) {
               int var70;
               var4 = var70 = var5 << 16;
               if (var2 < 0) {
                  var4 -= var15 * var2;
                  var70 -= var17 * var2;
                  var8 -= var20 * var2;
                  var2 = 0;
               }

               var3 <<= 16;
               if (var0 < 0) {
                  var3 -= var16 * var0;
                  var0 = 0;
               }

               if (var15 < var17) {
                  var1 -= var0;
                  var0 -= var2;

                  for (var2 = f[var2]; --var0 >= 0; var2 += Class_nc.e) {
                     a(Class_nc.f, var2, 0, 0, var4 >> 16, var70 >> 16, var8, var19);
                     var4 += var15;
                     var70 += var17;
                     var8 += var20;
                  }

                  while (--var1 >= 0) {
                     a(Class_nc.f, var2, 0, 0, var4 >> 16, var3 >> 16, var8, var19);
                     var4 += var15;
                     var3 += var16;
                     var8 += var20;
                     var2 += Class_nc.e;
                  }
               } else {
                  var1 -= var0;
                  var0 -= var2;

                  for (var2 = f[var2]; --var0 >= 0; var2 += Class_nc.e) {
                     a(Class_nc.f, var2, 0, 0, var70 >> 16, var4 >> 16, var8, var19);
                     var4 += var15;
                     var70 += var17;
                     var8 += var20;
                  }

                  while (--var1 >= 0) {
                     a(Class_nc.f, var2, 0, 0, var3 >> 16, var4 >> 16, var8, var19);
                     var4 += var15;
                     var3 += var16;
                     var8 += var20;
                     var2 += Class_nc.e;
                  }
               }
            } else {
               int var69;
               var3 = var69 = var5 << 16;
               if (var2 < 0) {
                  var3 -= var15 * var2;
                  var69 -= var17 * var2;
                  var8 -= var20 * var2;
                  var2 = 0;
               }

               var4 <<= 16;
               if (var1 < 0) {
                  var4 -= var16 * var1;
                  var1 = 0;
               }

               if (var15 < var17) {
                  var0 -= var1;
                  var1 -= var2;

                  for (var2 = f[var2]; --var1 >= 0; var2 += Class_nc.e) {
                     a(Class_nc.f, var2, 0, 0, var3 >> 16, var69 >> 16, var8, var19);
                     var3 += var15;
                     var69 += var17;
                     var8 += var20;
                  }

                  while (--var0 >= 0) {
                     a(Class_nc.f, var2, 0, 0, var4 >> 16, var69 >> 16, var8, var19);
                     var4 += var16;
                     var69 += var17;
                     var8 += var20;
                     var2 += Class_nc.e;
                  }
               } else {
                  var0 -= var1;
                  var1 -= var2;

                  for (var2 = f[var2]; --var1 >= 0; var2 += Class_nc.e) {
                     a(Class_nc.f, var2, 0, 0, var69 >> 16, var3 >> 16, var8, var19);
                     var3 += var15;
                     var69 += var17;
                     var8 += var20;
                  }

                  while (--var0 >= 0) {
                     a(Class_nc.f, var2, 0, 0, var69 >> 16, var4 >> 16, var8, var19);
                     var4 += var16;
                     var69 += var17;
                     var8 += var20;
                     var2 += Class_nc.e;
                  }
               }
            }
         }
      }
   }

   private static final void c(int var0, int var1) {
      int var2 = var0 * 128;

      for (int var3 = var0; var3 < var1; var3++) {
         double var4 = (var3 >> 3) / 64.0 + 0.0078125;
         double var6 = (var3 & 7) / 8.0 + 0.0625;

         for (int var8 = 0; var8 < 128; var8++) {
            double var9 = var8 / 128.0;
            double var11 = var9;
            double var13 = var9;
            double var15 = var9;
            if (var6 != 0.0) {
               double var17;
               if (var9 < 0.5) {
                  var17 = var9 * (1.0 + var6);
               } else {
                  var17 = var9 + var6 - var9 * var6;
               }

               double var19 = 2.0 * var9 - var17;
               double var21 = var4 + 0.3333333333333333;
               if (var21 > 1.0) {
                  var21--;
               }

               double var25 = var4 - 0.3333333333333333;
               if (var25 < 0.0) {
                  var25++;
               }

               if (6.0 * var21 < 1.0) {
                  var11 = var19 + (var17 - var19) * 6.0 * var21;
               } else if (2.0 * var21 < 1.0) {
                  var11 = var17;
               } else if (3.0 * var21 < 2.0) {
                  var11 = var19 + (var17 - var19) * (0.6666666666666666 - var21) * 6.0;
               } else {
                  var11 = var19;
               }

               if (6.0 * var4 < 1.0) {
                  var13 = var19 + (var17 - var19) * 6.0 * var4;
               } else if (2.0 * var4 < 1.0) {
                  var13 = var17;
               } else if (3.0 * var4 < 2.0) {
                  var13 = var19 + (var17 - var19) * (0.6666666666666666 - var4) * 6.0;
               } else {
                  var13 = var19;
               }

               if (6.0 * var25 < 1.0) {
                  var15 = var19 + (var17 - var19) * 6.0 * var25;
               } else if (2.0 * var25 < 1.0) {
                  var15 = var17;
               } else if (3.0 * var25 < 2.0) {
                  var15 = var19 + (var17 - var19) * (0.6666666666666666 - var25) * 6.0;
               } else {
                  var15 = var19;
               }
            }

            var11 = Math.pow(var11, a);
            var13 = Math.pow(var13, a);
            var15 = Math.pow(var15, a);
            int var30 = (int)(var11 * 256.0);
            int var18 = (int)(var13 * 256.0);
            int var31 = (int)(var15 * 256.0);
            int var20 = (var30 << 16) + (var18 << 8) + var31;
            if (var20 == 0) {
               var20 = 1;
            }

            h[var2++] = var20;
         }
      }
   }

   private static final void b(
      int[] var0,
      int[] var1,
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
      int var14
   ) {
      if (g) {
         if (var6 > r) {
            var6 = r;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var4 += var5;
         var7 += var8 * var5;
         int var17 = var6 - var5;
         if (p) {
            int var23 = var5 - n;
            var9 += var12 * var23;
            var10 += var13 * var23;
            var11 += var14 * var23;
            int var22 = var11 >> 12;
            int var18;
            int var19;
            if (var22 != 0) {
               var18 = var9 / var22;
               var19 = var10 / var22;
            } else {
               var18 = 0;
               var19 = 0;
            }

            var9 += var12 * var17;
            var10 += var13 * var17;
            var11 += var14 * var17;
            var22 = var11 >> 12;
            int var20;
            int var21;
            if (var22 != 0) {
               var20 = var9 / var22;
               var21 = var10 / var22;
            } else {
               var20 = 0;
               var21 = 0;
            }

            var2 = (var18 << 20) + var19;
            int var16 = ((var20 - var18) / var17 << 20) + (var21 - var19) / var17;
            var17 >>= 3;
            var8 <<= 3;
            int var15 = var7 >> 8;
            if (k) {
               if (var17 > 0) {
                  do {
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 0xFF00) * var15 & 0xFF0000) >> 8;
                     var2 += var16;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 0xFF00) * var15 & 0xFF0000) >> 8;
                     var2 += var16;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 0xFF00) * var15 & 0xFF0000) >> 8;
                     var2 += var16;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 0xFF00) * var15 & 0xFF0000) >> 8;
                     var2 += var16;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 0xFF00) * var15 & 0xFF0000) >> 8;
                     var2 += var16;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 0xFF00) * var15 & 0xFF0000) >> 8;
                     var2 += var16;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 0xFF00) * var15 & 0xFF0000) >> 8;
                     var2 += var16;
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 0xFF00) * var15 & 0xFF0000) >> 8;
                     var2 += var16;
                     var7 += var8;
                     var15 = var7 >> 8;
                  } while (--var17 > 0);
               }

               var17 = var6 - var5 & 7;
               if (var17 > 0) {
                  do {
                     var3 = var1[(var2 & 4032) + (var2 >>> 26)];
                     var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 0xFF00) * var15 & 0xFF0000) >> 8;
                     var2 += var16;
                  } while (--var17 > 0);

                  return;
               }

               return;
            }

            if (var17 > 0) {
               do {
                  if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                     var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 0xFF00) * var15 & 0xFF0000) >> 8;
                  }

                  var4++;
                  var2 += var16;
                  if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                     var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 0xFF00) * var15 & 0xFF0000) >> 8;
                  }

                  var4++;
                  var2 += var16;
                  if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                     var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 0xFF00) * var15 & 0xFF0000) >> 8;
                  }

                  var4++;
                  var2 += var16;
                  if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                     var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 0xFF00) * var15 & 0xFF0000) >> 8;
                  }

                  var4++;
                  var2 += var16;
                  if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                     var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 0xFF00) * var15 & 0xFF0000) >> 8;
                  }

                  var4++;
                  var2 += var16;
                  if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                     var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 0xFF00) * var15 & 0xFF0000) >> 8;
                  }

                  var4++;
                  var2 += var16;
                  if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                     var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 0xFF00) * var15 & 0xFF0000) >> 8;
                  }

                  var4++;
                  var2 += var16;
                  if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                     var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 0xFF00) * var15 & 0xFF0000) >> 8;
                  }

                  var4++;
                  var2 += var16;
                  var7 += var8;
                  var15 = var7 >> 8;
               } while (--var17 > 0);
            }

            var17 = var6 - var5 & 7;
            if (var17 > 0) {
               do {
                  if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
                     var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 0xFF00) * var15 & 0xFF0000) >> 8;
                  }

                  var4++;
                  var2 += var16;
               } while (--var17 > 0);

               return;
            }
         } else {
            int var149 = var5 - n;
            var9 += var12 * var149;
            var10 += var13 * var149;
            var11 += var14 * var149;
            int var147 = var11 >> 14;
            int var142;
            int var143;
            if (var147 != 0) {
               var142 = var9 / var147;
               var143 = var10 / var147;
            } else {
               var142 = 0;
               var143 = 0;
            }

            var9 += var12 * var17;
            var10 += var13 * var17;
            var11 += var14 * var17;
            var147 = var11 >> 14;
            int var144;
            int var145;
            if (var147 != 0) {
               var144 = var9 / var147;
               var145 = var10 / var147;
            } else {
               var144 = 0;
               var145 = 0;
            }

            var2 = (var142 << 18) + var143;
            int var135 = ((var144 - var142) / var17 << 18) + (var145 - var143) / var17;
            var17 >>= 3;
            var8 <<= 3;
            int var134 = var7 >> 8;
            if (k) {
               if (var17 > 0) {
                  do {
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var134 & -16711936) + ((var3 & 0xFF00) * var134 & 0xFF0000) >> 8;
                     var2 += var135;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var134 & -16711936) + ((var3 & 0xFF00) * var134 & 0xFF0000) >> 8;
                     var2 += var135;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var134 & -16711936) + ((var3 & 0xFF00) * var134 & 0xFF0000) >> 8;
                     var2 += var135;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var134 & -16711936) + ((var3 & 0xFF00) * var134 & 0xFF0000) >> 8;
                     var2 += var135;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var134 & -16711936) + ((var3 & 0xFF00) * var134 & 0xFF0000) >> 8;
                     var2 += var135;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var134 & -16711936) + ((var3 & 0xFF00) * var134 & 0xFF0000) >> 8;
                     var2 += var135;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var134 & -16711936) + ((var3 & 0xFF00) * var134 & 0xFF0000) >> 8;
                     var2 += var135;
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var134 & -16711936) + ((var3 & 0xFF00) * var134 & 0xFF0000) >> 8;
                     var2 += var135;
                     var7 += var8;
                     var134 = var7 >> 8;
                  } while (--var17 > 0);
               }

               var17 = var6 - var5 & 7;
               if (var17 > 0) {
                  do {
                     var3 = var1[(var2 & 16256) + (var2 >>> 25)];
                     var0[var4++] = ((var3 & 16711935) * var134 & -16711936) + ((var3 & 0xFF00) * var134 & 0xFF0000) >> 8;
                     var2 += var135;
                  } while (--var17 > 0);

                  return;
               }
            } else {
               if (var17 > 0) {
                  do {
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var134 & -16711936) + ((var3 & 0xFF00) * var134 & 0xFF0000) >> 8;
                     }

                     var4++;
                     var2 += var135;
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var134 & -16711936) + ((var3 & 0xFF00) * var134 & 0xFF0000) >> 8;
                     }

                     var4++;
                     var2 += var135;
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var134 & -16711936) + ((var3 & 0xFF00) * var134 & 0xFF0000) >> 8;
                     }

                     var4++;
                     var2 += var135;
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var134 & -16711936) + ((var3 & 0xFF00) * var134 & 0xFF0000) >> 8;
                     }

                     var4++;
                     var2 += var135;
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var134 & -16711936) + ((var3 & 0xFF00) * var134 & 0xFF0000) >> 8;
                     }

                     var4++;
                     var2 += var135;
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var134 & -16711936) + ((var3 & 0xFF00) * var134 & 0xFF0000) >> 8;
                     }

                     var4++;
                     var2 += var135;
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var134 & -16711936) + ((var3 & 0xFF00) * var134 & 0xFF0000) >> 8;
                     }

                     var4++;
                     var2 += var135;
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var134 & -16711936) + ((var3 & 0xFF00) * var134 & 0xFF0000) >> 8;
                     }

                     var4++;
                     var2 += var135;
                     var7 += var8;
                     var134 = var7 >> 8;
                  } while (--var17 > 0);
               }

               var17 = var6 - var5 & 7;
               if (var17 > 0) {
                  do {
                     if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
                        var0[var4] = ((var3 & 16711935) * var134 & -16711936) + ((var3 & 0xFF00) * var134 & 0xFF0000) >> 8;
                     }

                     var4++;
                     var2 += var135;
                  } while (--var17 > 0);
               }
            }
         }
      }
   }

   static final void e() {
      n = r / 2;
      j = l / 2;
      Class_nd.v = -n;
      Class_tb.o = r - n;
      Class_a.j = -j;
      Class_vi.R = l - j;
   }

   static {
      for (int var0 = 1; var0 < 512; var0++) {
         o[var0] = 32768 / var0;
      }

      for (int var1 = 1; var1 < 2048; var1++) {
         d[var1] = 65536 / var1;
      }

      for (int var2 = 0; var2 < 2048; var2++) {
         e[var2] = (int)(65536.0 * Math.sin(var2 * 0.0030679615));
         q[var2] = (int)(65536.0 * Math.cos(var2 * 0.0030679615));
      }
   }
}
