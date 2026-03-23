final class Class_rb extends Class_wd {
   private int t;
   private int u;
   private int v;
   private int w;
   private int x;
   private int y;
   private int z;
   private int A;
   private int B;
   private int D;
   private int E;
   private int F;
   private int G;
   private boolean H;
   private int I;

   final synchronized void e(int var1) {
      this.z = var1;
   }

   private static final int a(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, Class_rb var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if ((var7 = var4 + var3 - (var9 - 1)) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;
      var7 -= 6;

      while (var4 < var7) {
         byte var11 = var1[var3--];
         var2[var4++] += var11 * var5;
         var2[var4++] += var11 * var6;
         var11 = var1[var3--];
         var2[var4++] += var11 * var5;
         var2[var4++] += var11 * var6;
         var11 = var1[var3--];
         var2[var4++] += var11 * var5;
         var2[var4++] += var11 * var6;
         var11 = var1[var3--];
         var2[var4++] += var11 * var5;
         var2[var4++] += var11 * var6;
      }

      var7 += 6;

      while (var4 < var7) {
         byte var15 = var1[var3--];
         var2[var4++] += var15 * var5;
         var2[var4++] += var15 * var6;
      }

      var10.E = var3 << 8;
      return var4 >> 1;
   }

   private static final int a(
      int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, Class_rb var12
   ) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if ((var9 = var4 + var3 - (var11 - 1)) > var10) {
         var9 = var10;
      }

      var12.D = var12.D + var12.B * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;
      var9 -= 6;

      while (var4 < var9) {
         byte var13 = var1[var3--];
         var2[var4++] += var13 * var5;
         var5 += var7;
         var2[var4++] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var2[var4++] += var13 * var5;
         var5 += var7;
         var2[var4++] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var2[var4++] += var13 * var5;
         var5 += var7;
         var2[var4++] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var2[var4++] += var13 * var5;
         var5 += var7;
         var2[var4++] += var13 * var6;
         var6 += var8;
      }

      for (int var44 = var9 + 6; var4 < var44; var6 += var8) {
         byte var17 = var1[var3--];
         var2[var4++] += var17 * var5;
         var5 += var7;
         var2[var4++] += var17 * var6;
      }

      var12.A = var5 >> 2;
      var12.I = var6 >> 2;
      var12.E = var3 << 8;
      return var4 >> 1;
   }

   private static final int a(
      int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, Class_rb var10, int var11, int var12
   ) {
      if (var11 == 0 || (var7 = var5 + (var9 + 256 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      while (var5 < var7) {
         var1 = var4 >> 8;
         byte var13 = var2[var1 - 1];
         var3[var5++] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 0xFF)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      var0 = var12;

      for (int var16 = var11; var5 < var7; var4 += var16) {
         var3[var5++] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 0xFF)) * var6 >> 6;
      }

      var10.E = var4;
      return var5;
   }

   private final boolean e() {
      int var1 = this.w;
      int var2;
      int var3;
      if (var1 == -2147483648) {
         var3 = 0;
         var2 = 0;
         var1 = 0;
      } else {
         var2 = e(var1, this.t);
         var3 = b(var1, this.t);
      }

      if (this.D == var1 && this.A == var2 && this.I == var3) {
         if (this.w == -2147483648) {
            this.w = 0;
            this.D = this.A = this.I = 0;
            this.c(-17554);
            return true;
         } else {
            this.g();
            return false;
         }
      } else {
         if (this.D < var1) {
            this.B = 1;
            this.F = var1 - this.D;
         } else if (this.D > var1) {
            this.B = -1;
            this.F = this.D - var1;
         } else {
            this.B = 0;
         }

         if (this.A < var2) {
            this.G = 1;
            if (this.F == 0 || this.F > var2 - this.A) {
               this.F = var2 - this.A;
            }
         } else if (this.A > var2) {
            this.G = -1;
            if (this.F == 0 || this.F > this.A - var2) {
               this.F = this.A - var2;
            }
         } else {
            this.G = 0;
         }

         if (this.I < var3) {
            this.u = 1;
            if (this.F == 0 || this.F > var3 - this.I) {
               this.F = var3 - this.I;
            }
         } else if (this.I > var3) {
            this.u = -1;
            if (this.F == 0 || this.F > this.I - var3) {
               this.F = this.I - var3;
            }
         } else {
            this.u = 0;
         }

         return false;
      }
   }

   private static final int b(int var0, int var1) {
      return var1 < 0 ? -var0 : (int)(var0 * Math.sqrt(var1 * 1.220703125E-4) + 0.5);
   }

   final boolean f() {
      return this.F != 0;
   }

   final synchronized void f(int var1) {
      this.d(var1 << 6, this.h());
   }

   final synchronized void c(int var1, int var2) {
      this.a(var1, var2, this.h());
   }

   private final void g() {
      this.D = this.w;
      this.A = e(this.w, this.t);
      this.I = b(this.w, this.t);
   }

   final int c() {
      int var1 = this.D * 3 >> 6;
      var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
      if (this.z == 0) {
         var1 -= var1 * this.E / (((Class_k)super.p).s.length << 8);
      } else if (this.z >= 0) {
         var1 -= var1 * this.x / ((Class_k)super.p).s.length;
      }

      return var1 > 255 ? 255 : var1;
   }

   private final int a(int[] var1, int var2, int var3, int var4, int var5) {
      while (this.F > 0) {
         int var6 = var2 + this.F;
         if (var6 > var4) {
            var6 = var4;
         }

         this.F += var2;
         if (this.y == 256 && (this.E & 0xFF) == 0) {
            if (Class_aj.p) {
               var2 = b(0, ((Class_k)super.p).s, var1, this.E, var2, this.A, this.I, this.G, this.u, 0, var6, var3, this);
            } else {
               var2 = a(((Class_k)super.p).s, var1, this.E, var2, this.D, this.B, 0, var6, var3, this);
            }
         } else if (Class_aj.p) {
            var2 = a(0, 0, ((Class_k)super.p).s, var1, this.E, var2, this.A, this.I, this.G, this.u, 0, var6, var3, this, this.y, var5);
         } else {
            var2 = c(0, 0, ((Class_k)super.p).s, var1, this.E, var2, this.D, this.B, 0, var6, var3, this, this.y, var5);
         }

         this.F -= var2;
         if (this.F != 0) {
            return var2;
         }

         if (this.e()) {
            return var4;
         }
      }

      if (this.y == 256 && (this.E & 0xFF) == 0) {
         return Class_aj.p
            ? b(0, ((Class_k)super.p).s, var1, this.E, var2, this.A, this.I, 0, var4, var3, this)
            : a(((Class_k)super.p).s, var1, this.E, var2, this.D, 0, var4, var3, this);
      } else {
         return Class_aj.p
            ? a(0, 0, ((Class_k)super.p).s, var1, this.E, var2, this.A, this.I, 0, var4, var3, this, this.y, var5)
            : b(0, 0, ((Class_k)super.p).s, var1, this.E, var2, this.D, 0, var4, var3, this, this.y, var5);
      }
   }

   private static final int b(
      int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, Class_rb var10, int var11, int var12
   ) {
      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 257) / var11) > var8) {
         var7 = var8;
      }

      while (var5 < var7) {
         var1 = var4 >> 8;
         byte var13 = var2[var1];
         var3[var5++] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 0xFF)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 1) / var11) > var8) {
         var7 = var8;
      }

      for (int var16 = var12; var5 < var7; var4 += var11) {
         byte var14 = var2[var4 >> 8];
         var3[var5++] += ((var14 << 8) + (var16 - var14) * (var4 & 0xFF)) * var6 >> 6;
      }

      var10.E = var4;
      return var5;
   }

   final synchronized int h() {
      return this.t < 0 ? -1 : this.t;
   }

   final synchronized void d(int var1) {
      if (this.F > 0) {
         if (var1 >= this.F) {
            if (this.w == -2147483648) {
               this.w = 0;
               this.D = this.A = this.I = 0;
               this.c(-17554);
               var1 = this.F;
            }

            this.F = 0;
            this.g();
         } else {
            this.D = this.D + this.B * var1;
            this.A = this.A + this.G * var1;
            this.I = this.I + this.u * var1;
            this.F -= var1;
         }
      }

      Class_k var2 = (Class_k)super.p;
      int var3 = this.x << 8;
      int var4 = this.v << 8;
      int var5 = var2.s.length << 8;
      int var6 = var4 - var3;
      if (var6 <= 0) {
         this.z = 0;
      }

      if (this.E < 0) {
         if (this.y <= 0) {
            this.l();
            this.c(-17554);
            return;
         }

         this.E = 0;
      }

      if (this.E >= var5) {
         if (this.y >= 0) {
            this.l();
            this.c(-17554);
            return;
         }

         this.E = var5 - 1;
      }

      this.E = this.E + this.y * var1;
      if (this.z < 0) {
         if (!this.H) {
            if (this.y < 0) {
               if (this.E < var3) {
                  this.E = var4 - 1 - (var4 - 1 - this.E) % var6;
               }
            } else if (this.E >= var4) {
               this.E = var3 + (this.E - var3) % var6;
            }
         } else {
            if (this.y < 0) {
               if (this.E >= var3) {
                  return;
               }

               this.E = var3 + var3 - 1 - this.E;
               this.y = -this.y;
            }

            while (this.E >= var4) {
               this.E = var4 + var4 - 1 - this.E;
               this.y = -this.y;
               if (this.E >= var3) {
                  return;
               }

               this.E = var3 + var3 - 1 - this.E;
               this.y = -this.y;
            }
         }
      } else {
         if (this.z > 0) {
            label126:
            if (this.H) {
               if (this.y < 0) {
                  if (this.E >= var3) {
                     return;
                  }

                  this.E = var3 + var3 - 1 - this.E;
                  this.y = -this.y;
                  if (--this.z == 0) {
                     break label126;
                  }
               }

               do {
                  if (this.E < var4) {
                     return;
                  }

                  this.E = var4 + var4 - 1 - this.E;
                  this.y = -this.y;
                  if (--this.z == 0) {
                     break;
                  }

                  if (this.E >= var3) {
                     return;
                  }

                  this.E = var3 + var3 - 1 - this.E;
                  this.y = -this.y;
               } while (--this.z != 0);
            } else if (this.y < 0) {
               if (this.E >= var3) {
                  return;
               }

               int var7 = (var4 - 1 - this.E) / var6;
               if (var7 < this.z) {
                  this.E += var6 * var7;
                  this.z -= var7;
                  return;
               }

               this.E = this.E + var6 * this.z;
               this.z = 0;
            } else {
               if (this.E < var4) {
                  return;
               }

               int var8 = (this.E - var3) / var6;
               if (var8 < this.z) {
                  this.E -= var6 * var8;
                  this.z -= var8;
                  return;
               }

               this.E = this.E - var6 * this.z;
               this.z = 0;
            }
         }

         if (this.y < 0) {
            if (this.E < 0) {
               this.E = -1;
               this.l();
               this.c(-17554);
               return;
            }
         } else if (this.E >= var5) {
            this.E = var5;
            this.l();
            this.c(-17554);
         }
      }
   }

   private static final int a(
      int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Class_rb var11, int var12, int var13
   ) {
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      for (int var24 = var8 << 1; var5 < var24; var4 += var12) {
         var1 = var4 >> 8;
         int var14 = var2[var1];
         var14 = (var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 0xFF);
         var3[var5++] += var14 * var6 >> 6;
         var3[var5++] += var14 * var7 >> 6;
      }

      if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for (int var19 = var13; var5 < var8; var4 += var12) {
         int var16 = var2[var4 >> 8];
         var16 = (var16 << 8) + (var19 - var16) * (var4 & 0xFF);
         var3[var5++] += var16 * var6 >> 6;
         var3[var5++] += var16 * var7 >> 6;
      }

      var11.E = var4;
      return var5 >> 1;
   }

   private static final int b(
      int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Class_rb var11, int var12, int var13
   ) {
      if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      for (int var23 = var8 << 1; var5 < var23; var4 += var12) {
         var1 = var4 >> 8;
         int var14 = var2[var1 - 1];
         var14 = (var14 << 8) + (var2[var1] - var14) * (var4 & 0xFF);
         var3[var5++] += var14 * var6 >> 6;
         var3[var5++] += var14 * var7 >> 6;
      }

      if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for (int var18 = var13; var5 < var8; var4 += var12) {
         var0 = (var18 << 8) + (var2[var4 >> 8] - var18) * (var4 & 0xFF);
         var3[var5++] += var0 * var6 >> 6;
         var3[var5++] += var0 * var7 >> 6;
      }

      var11.E = var4;
      return var5 >> 1;
   }

   final Class_wd d() {
      return null;
   }

   static final Class_rb a(Class_k var0, int var1, int var2, int var3) {
      return var0.s != null && var0.s.length != 0 ? new Class_rb(var0, var1, var2, var3) : null;
   }

   final synchronized void g(int var1) {
      if (var1 == 0) {
         this.j(0);
         this.c(-17554);
      } else if (this.A == 0 && this.I == 0) {
         this.F = 0;
         this.w = 0;
         this.D = 0;
         this.c(-17554);
      } else {
         int var2 = -this.D;
         if (this.D > var2) {
            var2 = this.D;
         }

         if (-this.A > var2) {
            var2 = -this.A;
         }

         if (this.A > var2) {
            var2 = this.A;
         }

         if (-this.I > var2) {
            var2 = -this.I;
         }

         if (this.I > var2) {
            var2 = this.I;
         }

         if (var1 > var2) {
            var1 = var2;
         }

         this.F = var1;
         this.w = -2147483648;
         this.B = -this.D / var1;
         this.G = -this.A / var1;
         this.u = -this.I / var1;
      }
   }

   final synchronized void a(int var1, int var2, int var3) {
      if (var1 == 0) {
         this.d(var2, var3);
      } else {
         int var4 = e(var2, var3);
         int var5 = b(var2, var3);
         if (this.A == var4 && this.I == var5) {
            this.F = 0;
         } else {
            int var6 = var2 - this.D;
            if (this.D - var2 > var6) {
               var6 = this.D - var2;
            }

            if (var4 - this.A > var6) {
               var6 = var4 - this.A;
            }

            if (this.A - var4 > var6) {
               var6 = this.A - var4;
            }

            if (var5 - this.I > var6) {
               var6 = var5 - this.I;
            }

            if (this.I - var5 > var6) {
               var6 = this.I - var5;
            }

            if (var1 > var6) {
               var1 = var6;
            }

            this.F = var1;
            this.w = var2;
            this.t = var3;
            this.B = (var2 - this.D) / var1;
            this.G = (var4 - this.A) / var1;
            this.u = (var5 - this.I) / var1;
         }
      }
   }

   private static final int b(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, Class_rb var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if ((var7 = var4 + var9 - var3) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;
      var7 -= 6;

      while (var4 < var7) {
         byte var11 = var1[var3++];
         var2[var4++] += var11 * var5;
         var2[var4++] += var11 * var6;
         var11 = var1[var3++];
         var2[var4++] += var11 * var5;
         var2[var4++] += var11 * var6;
         var11 = var1[var3++];
         var2[var4++] += var11 * var5;
         var2[var4++] += var11 * var6;
         var11 = var1[var3++];
         var2[var4++] += var11 * var5;
         var2[var4++] += var11 * var6;
      }

      var7 += 6;

      while (var4 < var7) {
         byte var15 = var1[var3++];
         var2[var4++] += var15 * var5;
         var2[var4++] += var15 * var6;
      }

      var10.E = var3 << 8;
      return var4 >> 1;
   }

   final int a() {
      return this.w == 0 && this.F == 0 ? 0 : 1;
   }

   final synchronized int i() {
      return this.w == -2147483648 ? 0 : this.w;
   }

   final synchronized void h(int var1) {
      int var2 = ((Class_k)super.p).s.length << 8;
      if (var1 < -1) {
         var1 = -1;
      }

      if (var1 > var2) {
         var1 = var2;
      }

      this.E = var1;
   }

   private static final int c(
      int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Class_rb var11, int var12, int var13
   ) {
      var11.A = var11.A - var11.G * var5;
      var11.I = var11.I - var11.u * var5;
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      while (var5 < var8) {
         var1 = var4 >> 8;
         byte var14 = var2[var1];
         var3[var5++] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 0xFF)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      for (int var17 = var13; var5 < var8; var4 += var12) {
         byte var15 = var2[var4 >> 8];
         var3[var5++] += ((var15 << 8) + (var17 - var15) * (var4 & 0xFF)) * var6 >> 6;
         var6 += var7;
      }

      var11.A = var11.A + var11.G * var5;
      var11.I = var11.I + var11.u * var5;
      var11.D = var6;
      var11.E = var4;
      return var5;
   }

   final synchronized void b(int[] var1, int var2, int var3) {
      if (this.w == 0 && this.F == 0) {
         this.d(var3);
      } else {
         Class_k var4 = (Class_k)super.p;
         int var5 = this.x << 8;
         int var6 = this.v << 8;
         int var7 = var4.s.length << 8;
         int var8 = var6 - var5;
         if (var8 <= 0) {
            this.z = 0;
         }

         int var9 = var2;
         var3 += var2;
         if (this.E < 0) {
            if (this.y <= 0) {
               this.l();
               this.c(-17554);
               return;
            }

            this.E = 0;
         }

         if (this.E >= var7) {
            if (this.y >= 0) {
               this.l();
               this.c(-17554);
               return;
            }

            this.E = var7 - 1;
         }

         if (this.z < 0) {
            if (this.H) {
               if (this.y < 0) {
                  var9 = this.b(var1, var2, var5, var3, var4.s[this.x]);
                  if (this.E >= var5) {
                     return;
                  }

                  this.E = var5 + var5 - 1 - this.E;
                  this.y = -this.y;
               }

               while (true) {
                  var9 = this.a(var1, var9, var6, var3, var4.s[this.v - 1]);
                  if (this.E < var6) {
                     return;
                  }

                  this.E = var6 + var6 - 1 - this.E;
                  this.y = -this.y;
                  var9 = this.b(var1, var9, var5, var3, var4.s[this.x]);
                  if (this.E >= var5) {
                     return;
                  }

                  this.E = var5 + var5 - 1 - this.E;
                  this.y = -this.y;
               }
            } else if (this.y < 0) {
               while (true) {
                  var9 = this.b(var1, var9, var5, var3, var4.s[this.v - 1]);
                  if (this.E >= var5) {
                     return;
                  }

                  this.E = var6 - 1 - (var6 - 1 - this.E) % var8;
               }
            } else {
               while (true) {
                  var9 = this.a(var1, var9, var6, var3, var4.s[this.x]);
                  if (this.E < var6) {
                     return;
                  }

                  this.E = var5 + (this.E - var5) % var8;
               }
            }
         } else {
            if (this.z > 0) {
               label131:
               if (this.H) {
                  if (this.y < 0) {
                     var9 = this.b(var1, var2, var5, var3, var4.s[this.x]);
                     if (this.E >= var5) {
                        return;
                     }

                     this.E = var5 + var5 - 1 - this.E;
                     this.y = -this.y;
                     if (--this.z == 0) {
                        break label131;
                     }
                  }

                  do {
                     var9 = this.a(var1, var9, var6, var3, var4.s[this.v - 1]);
                     if (this.E < var6) {
                        return;
                     }

                     this.E = var6 + var6 - 1 - this.E;
                     this.y = -this.y;
                     if (--this.z == 0) {
                        break;
                     }

                     var9 = this.b(var1, var9, var5, var3, var4.s[this.x]);
                     if (this.E >= var5) {
                        return;
                     }

                     this.E = var5 + var5 - 1 - this.E;
                     this.y = -this.y;
                  } while (--this.z != 0);
               } else if (this.y < 0) {
                  while (true) {
                     var9 = this.b(var1, var9, var5, var3, var4.s[this.v - 1]);
                     if (this.E >= var5) {
                        return;
                     }

                     int var13 = (var6 - 1 - this.E) / var8;
                     if (var13 >= this.z) {
                        this.E = this.E + var8 * this.z;
                        this.z = 0;
                        break;
                     }

                     this.E += var8 * var13;
                     this.z -= var13;
                  }
               } else {
                  while (true) {
                     var9 = this.a(var1, var9, var6, var3, var4.s[this.x]);
                     if (this.E < var6) {
                        return;
                     }

                     int var10 = (this.E - var5) / var8;
                     if (var10 >= this.z) {
                        this.E = this.E - var8 * this.z;
                        this.z = 0;
                        break;
                     }

                     this.E -= var8 * var10;
                     this.z -= var10;
                  }
               }
            }

            if (this.y < 0) {
               this.b(var1, var9, 0, var3, 0);
               if (this.E < 0) {
                  this.E = -1;
                  this.l();
                  this.c(-17554);
                  return;
               }
            } else {
               this.a(var1, var9, var7, var3, 0);
               if (this.E >= var7) {
                  this.E = var7;
                  this.l();
                  this.c(-17554);
               }
            }
         }
      }
   }

   final synchronized int j() {
      return this.y < 0 ? -this.y : this.y;
   }

   final Class_wd b() {
      return null;
   }

   final boolean k() {
      return this.E < 0 || this.E >= ((Class_k)super.p).s.length << 8;
   }

   final synchronized void i(int var1) {
      if (this.y < 0) {
         this.y = -var1;
      } else {
         this.y = var1;
      }
   }

   private final synchronized void d(int var1, int var2) {
      this.w = var1;
      this.t = var2;
      this.F = 0;
      this.g();
   }

   private final synchronized void j(int var1) {
      this.d(var1, this.h());
   }

   static final Class_rb a(Class_k var0, int var1, int var2) {
      return var0.s != null && var0.s.length != 0 ? new Class_rb(var0, (int)(var0.u * 256L * var1 / (100 * Class_pd.a)), var2 << 6) : null;
   }

   private static final int a(
      int var0,
      int var1,
      byte[] var2,
      int[] var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      Class_rb var13,
      int var14,
      int var15
   ) {
      var13.D = var13.D - var13.B * var5;
      if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      for (int var27 = var10 << 1; var5 < var27; var4 += var14) {
         var1 = var4 >> 8;
         int var16 = var2[var1];
         var16 = (var16 << 8) + (var2[var1 + 1] - var16) * (var4 & 0xFF);
         var3[var5++] += var16 * var6 >> 6;
         var6 += var8;
         var3[var5++] += var16 * var7 >> 6;
         var7 += var9;
      }

      if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for (int var21 = var15; var5 < var10; var4 += var14) {
         int var18 = var2[var4 >> 8];
         var18 = (var18 << 8) + (var21 - var18) * (var4 & 0xFF);
         var3[var5++] += var18 * var6 >> 6;
         var6 += var8;
         var3[var5++] += var18 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.D = var13.D + var13.B * var5;
      var13.A = var6;
      var13.I = var7;
      var13.E = var4;
      return var5;
   }

   private static final int b(
      int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, Class_rb var12
   ) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if ((var9 = var4 + var11 - var3) > var10) {
         var9 = var10;
      }

      var12.D = var12.D + var12.B * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;
      var9 -= 6;

      while (var4 < var9) {
         byte var13 = var1[var3++];
         var2[var4++] += var13 * var5;
         var5 += var7;
         var2[var4++] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var2[var4++] += var13 * var5;
         var5 += var7;
         var2[var4++] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var2[var4++] += var13 * var5;
         var5 += var7;
         var2[var4++] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var2[var4++] += var13 * var5;
         var5 += var7;
         var2[var4++] += var13 * var6;
         var6 += var8;
      }

      for (int var44 = var9 + 6; var4 < var44; var6 += var8) {
         byte var17 = var1[var3++];
         var2[var4++] += var17 * var5;
         var5 += var7;
         var2[var4++] += var17 * var6;
      }

      var12.A = var5 >> 2;
      var12.I = var6 >> 2;
      var12.E = var3 << 8;
      return var4 >> 1;
   }

   private static final int a(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Class_rb var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var8 - var2) > var7) {
         var6 = var7;
      }

      var9.A = var9.A + var9.G * (var6 - var3);
      var9.I = var9.I + var9.u * (var6 - var3);
      var6 -= 3;

      while (var3 < var6) {
         var1[var3++] += var0[var2++] * var4;
         var4 += var5;
         var1[var3++] += var0[var2++] * var4;
         var4 += var5;
         var1[var3++] += var0[var2++] * var4;
         var4 += var5;
         var1[var3++] += var0[var2++] * var4;
         var4 += var5;
      }

      for (int var24 = var6 + 3; var3 < var24; var4 += var5) {
         var1[var3++] += var0[var2++] * var4;
      }

      var9.D = var4 >> 2;
      var9.E = var2 << 8;
      return var3;
   }

   private static final int a(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, Class_rb var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if ((var5 = var3 + var7 - var2) > var6) {
         var5 = var6;
      }

      var5 -= 3;

      while (var3 < var5) {
         var1[var3++] += var0[var2++] * var4;
         var1[var3++] += var0[var2++] * var4;
         var1[var3++] += var0[var2++] * var4;
         var1[var3++] += var0[var2++] * var4;
      }

      var5 += 3;

      while (var3 < var5) {
         var1[var3++] += var0[var2++] * var4;
      }

      var8.E = var2 << 8;
      return var3;
   }

   private Class_rb(Class_k var1, int var2, int var3) {
      super.p = var1;
      this.x = var1.q;
      this.v = var1.r;
      this.H = var1.t;
      this.y = var2;
      this.w = var3;
      this.t = 8192;
      this.E = 0;
      this.g();
   }

   private static final int d(
      int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Class_rb var11, int var12, int var13
   ) {
      var11.A = var11.A - var11.G * var5;
      var11.I = var11.I - var11.u * var5;
      if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      while (var5 < var8) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var3[var5++] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 0xFF)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var0 = var13;

      for (int var17 = var12; var5 < var8; var4 += var17) {
         var3[var5++] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 0xFF)) * var6 >> 6;
         var6 += var7;
      }

      var11.A = var11.A + var11.G * var5;
      var11.I = var11.I + var11.u * var5;
      var11.D = var6;
      var11.E = var4;
      return var5;
   }

   final synchronized void a(boolean var1) {
      this.y = (this.y ^ this.y >> 31) + (this.y >>> 31);
      if (var1) {
         this.y = -this.y;
      }
   }

   private static final int b(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, Class_rb var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
         var5 = var6;
      }

      var5 -= 3;

      while (var3 < var5) {
         var1[var3++] += var0[var2--] * var4;
         var1[var3++] += var0[var2--] * var4;
         var1[var3++] += var0[var2--] * var4;
         var1[var3++] += var0[var2--] * var4;
      }

      var5 += 3;

      while (var3 < var5) {
         var1[var3++] += var0[var2--] * var4;
      }

      var8.E = var2 << 8;
      return var3;
   }

   private static final int e(int var0, int var1) {
      return var1 < 0 ? var0 : (int)(var0 * Math.sqrt((16384 - var1) * 1.220703125E-4) + 0.5);
   }

   private static final int b(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Class_rb var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
         var6 = var7;
      }

      var9.A = var9.A + var9.G * (var6 - var3);
      var9.I = var9.I + var9.u * (var6 - var3);
      var6 -= 3;

      while (var3 < var6) {
         var1[var3++] += var0[var2--] * var4;
         var4 += var5;
         var1[var3++] += var0[var2--] * var4;
         var4 += var5;
         var1[var3++] += var0[var2--] * var4;
         var4 += var5;
         var1[var3++] += var0[var2--] * var4;
         var4 += var5;
      }

      for (int var24 = var6 + 3; var3 < var24; var4 += var5) {
         var1[var3++] += var0[var2--] * var4;
      }

      var9.D = var4 >> 2;
      var9.E = var2 << 8;
      return var3;
   }

   private Class_rb(Class_k var1, int var2, int var3, int var4) {
      super.p = var1;
      this.x = var1.q;
      this.v = var1.r;
      this.H = var1.t;
      this.y = var2;
      this.w = var3;
      this.t = var4;
      this.E = 0;
      this.g();
   }

   private final int b(int[] var1, int var2, int var3, int var4, int var5) {
      while (this.F > 0) {
         int var6 = var2 + this.F;
         if (var6 > var4) {
            var6 = var4;
         }

         this.F += var2;
         if (this.y == -256 && (this.E & 0xFF) == 0) {
            if (Class_aj.p) {
               var2 = a(0, ((Class_k)super.p).s, var1, this.E, var2, this.A, this.I, this.G, this.u, 0, var6, var3, this);
            } else {
               var2 = b(((Class_k)super.p).s, var1, this.E, var2, this.D, this.B, 0, var6, var3, this);
            }
         } else if (Class_aj.p) {
            var2 = b(0, 0, ((Class_k)super.p).s, var1, this.E, var2, this.A, this.I, this.G, this.u, 0, var6, var3, this, this.y, var5);
         } else {
            var2 = d(0, 0, ((Class_k)super.p).s, var1, this.E, var2, this.D, this.B, 0, var6, var3, this, this.y, var5);
         }

         this.F -= var2;
         if (this.F != 0) {
            return var2;
         }

         if (this.e()) {
            return var4;
         }
      }

      if (this.y == -256 && (this.E & 0xFF) == 0) {
         return Class_aj.p
            ? a(0, ((Class_k)super.p).s, var1, this.E, var2, this.A, this.I, 0, var4, var3, this)
            : b(((Class_k)super.p).s, var1, this.E, var2, this.D, 0, var4, var3, this);
      } else {
         return Class_aj.p
            ? b(0, 0, ((Class_k)super.p).s, var1, this.E, var2, this.A, this.I, 0, var4, var3, this, this.y, var5)
            : a(0, 0, ((Class_k)super.p).s, var1, this.E, var2, this.D, 0, var4, var3, this, this.y, var5);
      }
   }

   private final void l() {
      if (this.F != 0) {
         if (this.w == -2147483648) {
            this.w = 0;
         }

         this.F = 0;
         this.g();
      }
   }

   private static final int b(
      int var0,
      int var1,
      byte[] var2,
      int[] var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      Class_rb var13,
      int var14,
      int var15
   ) {
      var13.D = var13.D - var13.B * var5;
      if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      for (int var26 = var10 << 1; var5 < var26; var4 += var14) {
         var1 = var4 >> 8;
         int var16 = var2[var1 - 1];
         var16 = (var16 << 8) + (var2[var1] - var16) * (var4 & 0xFF);
         var3[var5++] += var16 * var6 >> 6;
         var6 += var8;
         var3[var5++] += var16 * var7 >> 6;
         var7 += var9;
      }

      if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for (int var20 = var15; var5 < var10; var4 += var14) {
         var0 = (var20 << 8) + (var2[var4 >> 8] - var20) * (var4 & 0xFF);
         var3[var5++] += var0 * var6 >> 6;
         var6 += var8;
         var3[var5++] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.D = var13.D + var13.B * var5;
      var13.A = var6;
      var13.I = var7;
      var13.E = var4;
      return var5;
   }
}
