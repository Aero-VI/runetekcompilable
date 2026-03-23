import java.util.Random;

final class Class_gi {
   private Class_ag a;
   private int[] b = new int[5];
   private static int[] c;
   private Class_ag d;
   private Class_ag e;
   int f = 0;
   int g = 500;
   private Class_ah h;
   private static int[] i = new int[32768];
   private static int[] j;
   private int k;
   private static int[] l;
   private int m;
   private Class_ag n;
   private Class_ag o;
   private static int[] p;
   private int[] q = new int[5];
   private Class_ag r;
   private static int[] s;
   private Class_ag t;
   private Class_ag u;
   private static int[] v;
   private int[] w;
   private static int[] x;
   private Class_ag y;

   public static void a() {
      j = null;
      i = null;
      c = null;
      s = null;
      x = null;
      l = null;
      v = null;
      p = null;
   }

   final int[] a(int var1, int var2) {
      Class_gb.a(j, 0, var1);
      if (var2 < 10) {
         return j;
      } else {
         double var3 = var1 / (var2 + 0.0);
         this.d.a();
         this.t.a();
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         if (this.r != null) {
            this.r.a();
            this.u.a();
            var5 = (int)((this.r.e - this.r.a) * 32.768 / var3);
            var6 = (int)(this.r.a * 32.768 / var3);
         }

         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         if (this.y != null) {
            this.y.a();
            this.e.a();
            var8 = (int)((this.y.e - this.y.a) * 32.768 / var3);
            var9 = (int)(this.y.a * 32.768 / var3);
         }

         for (int var11 = 0; var11 < 5; var11++) {
            if (this.q[var11] != 0) {
               s[var11] = 0;
               x[var11] = (int)(this.w[var11] * var3);
               l[var11] = (this.q[var11] << 14) / 100;
               v[var11] = (int)((this.d.e - this.d.a) * 32.768 * Math.pow(1.0057929410678534, this.b[var11]) / var3);
               p[var11] = (int)(this.d.a * 32.768 / var3);
            }
         }

         for (int var12 = 0; var12 < var1; var12++) {
            int var13 = this.d.a(var1);
            int var14 = this.t.a(var1);
            if (this.r != null) {
               int var15 = this.r.a(var1);
               int var16 = this.u.a(var1);
               var13 += this.a(var7, var16, this.r.c) >> 1;
               var7 += (var15 * var5 >> 16) + var6;
            }

            if (this.y != null) {
               int var30 = this.y.a(var1);
               int var34 = this.e.a(var1);
               var14 = var14 * ((this.a(var10, var34, this.y.c) >> 1) + 32768) >> 15;
               var10 += (var30 * var8 >> 16) + var9;
            }

            for (int var31 = 0; var31 < 5; var31++) {
               if (this.q[var31] != 0) {
                  int var35 = var12 + x[var31];
                  if (var35 < var1) {
                     j[var35] = j[var35] + this.a(s[var31], var14 * l[var31] >> 15, this.d.c);
                     s[var31] = s[var31] + (var13 * v[var31] >> 16) + p[var31];
                  }
               }
            }
         }

         if (this.a != null) {
            this.a.a();
            this.n.a();
            short var21 = 0;
            int var26 = 0;
            boolean var32 = true;

            for (int var36 = 0; var36 < var1; var36++) {
               int var17 = this.a.a(var1);
               int var18 = this.n.a(var1);
               if (var32) {
                  var26 = this.a.a + ((this.a.e - this.a.a) * var17 >> 8);
               } else {
                  var26 = this.a.a + ((this.a.e - this.a.a) * var18 >> 8);
               }

               var21 += 256;
               if (var21 >= var26) {
                  var21 = 0;
                  var32 = !var32;
               }

               if (var32) {
                  j[var36] = 0;
               }
            }
         }

         if (this.k > 0 && this.m > 0) {
            int var22 = (int)(this.k * var3);

            for (int var28 = var22; var28 < var1; var28++) {
               j[var28] = j[var28] + j[var28 - var22] * this.m / 100;
            }
         }

         if (this.h.c[0] > 0 || this.h.c[1] > 0) {
            this.o.a();
            int var23 = this.o.a(var1 + 1);
            int var29 = this.h.a(0, var23 / 65536.0F);
            int var33 = this.h.a(1, var23 / 65536.0F);
            if (var1 >= var29 + var33) {
               int var37 = 0;
               int var38 = var33;
               if (var33 > var1 - var29) {
                  var38 = var1 - var29;
               }

               while (var37 < var38) {
                  int var40 = (int)((long)j[var37 + var29] * Class_ah.e >> 16);

                  for (int var19 = 0; var19 < var29; var19++) {
                     var40 += (int)((long)j[var37 + var29 - 1 - var19] * Class_ah.d[0][var19] >> 16);
                  }

                  for (int var20 = 0; var20 < var37; var20++) {
                     var40 -= (int)((long)j[var37 - 1 - var20] * Class_ah.d[1][var20] >> 16);
                  }

                  j[var37] = var40;
                  var23 = this.o.a(var1 + 1);
                  var37++;
               }

               var38 = 128;

               while (true) {
                  if (var38 > var1 - var29) {
                     var38 = var1 - var29;
                  }

                  while (var37 < var38) {
                     int var41 = (int)((long)j[var37 + var29] * Class_ah.e >> 16);

                     for (int var43 = 0; var43 < var29; var43++) {
                        var41 += (int)((long)j[var37 + var29 - 1 - var43] * Class_ah.d[0][var43] >> 16);
                     }

                     for (int var45 = 0; var45 < var33; var45++) {
                        var41 -= (int)((long)j[var37 - 1 - var45] * Class_ah.d[1][var45] >> 16);
                     }

                     j[var37] = var41;
                     var23 = this.o.a(var1 + 1);
                     var37++;
                  }

                  if (var37 >= var1 - var29) {
                     while (var37 < var1) {
                        int var42 = 0;

                        for (int var44 = var37 + var29 - var1; var44 < var29; var44++) {
                           var42 += (int)((long)j[var37 + var29 - 1 - var44] * Class_ah.d[0][var44] >> 16);
                        }

                        for (int var46 = 0; var46 < var33; var46++) {
                           var42 -= (int)((long)j[var37 - 1 - var46] * Class_ah.d[1][var46] >> 16);
                        }

                        j[var37] = var42;
                        var23 = this.o.a(var1 + 1);
                        var37++;
                     }
                     break;
                  }

                  var29 = this.h.a(0, var23 / 65536.0F);
                  var33 = this.h.a(1, var23 / 65536.0F);
                  var38 += 128;
               }
            }
         }

         for (int var25 = 0; var25 < var1; var25++) {
            if (j[var25] < -32768) {
               j[var25] = -32768;
            }

            if (j[var25] > 32767) {
               j[var25] = 32767;
            }
         }

         return j;
      }
   }

   private final int a(int var1, int var2, int var3) {
      if (var3 == 1) {
         return (var1 & 32767) < 16384 ? var2 : -var2;
      } else if (var3 == 2) {
         return c[var1 & 32767] * var2 >> 14;
      } else if (var3 == 3) {
         return ((var1 & 32767) * var2 >> 14) - var2;
      } else {
         return var3 == 4 ? i[var1 / 2607 & 32767] * var2 : 0;
      }
   }

   final void a(Class_lh var1) {
      this.d = new Class_ag();
      this.d.b(var1);
      this.t = new Class_ag();
      this.t.b(var1);
      int var2 = var1.n(-6677);
      if (var2 != 0) {
         var1.p--;
         this.r = new Class_ag();
         this.r.b(var1);
         this.u = new Class_ag();
         this.u.b(var1);
      }

      var2 = var1.n(-6677);
      if (var2 != 0) {
         var1.p--;
         this.y = new Class_ag();
         this.y.b(var1);
         this.e = new Class_ag();
         this.e.b(var1);
      }

      var2 = var1.n(-6677);
      if (var2 != 0) {
         var1.p--;
         this.a = new Class_ag();
         this.a.b(var1);
         this.n = new Class_ag();
         this.n.b(var1);
      }

      for (int var3 = 0; var3 < 10; var3++) {
         int var4 = var1.f(255);
         if (var4 == 0) {
            break;
         }

         this.q[var3] = var4;
         this.b[var3] = var1.q(32767);
         this.w[var3] = var1.f(255);
      }

      this.k = var1.f(255);
      this.m = var1.f(255);
      this.g = var1.k(1355769544);
      this.f = var1.k(1355769544);
      this.h = new Class_ah();
      this.o = new Class_ag();
      this.h.a(var1, this.o);
   }

   public Class_gi() {
      this.m = 100;
      this.k = 0;
      this.w = new int[5];
   }

   static {
      Random var0 = new Random(0L);

      for (int var1 = 0; var1 < 32768; var1++) {
         i[var1] = (var0.nextInt() & 2) - 1;
      }

      c = new int[32768];

      for (int var2 = 0; var2 < 32768; var2++) {
         c[var2] = (int)(Math.sin(var2 / 5215.1903) * 16384.0);
      }

      j = new int[220500];
      l = new int[5];
      p = new int[5];
      s = new int[5];
      v = new int[5];
      x = new int[5];
   }
}
