import java.awt.Component;
import java.lang.reflect.Method;

final class Class_ig {
   int a;
   static int b;
   int c;
   static int d;
   static int e;
   static int[] f;
   static int g;
   int h;
   static int i;
   static int j;
   private int k;
   private int l = 0;
   int m;

   static final void a(Component var0, int var1) {
      try {
         b++;
         Method var2 = Class_ik.n;
         if (var2 != null) {
            try {
               var2.invoke(var0, Boolean.FALSE);
            } catch (Throwable var3) {
            }
         }

         var0.addKeyListener(Class_lc.a);
         if (var1 != 1611550343) {
            a(null, -119);
         }

         var0.addFocusListener(Class_lc.a);
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "ig.F(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
      }
   }

   final void a(int var1, int var2, Class_lh var3) {
      int var5 = client.lb;

      try {
         do {
            int var4 = var3.n(var1 + -6677);
            if (var4 == 0) {
               break;
            }

            this.a(30704, var2, var4, var3);
         } while (var5 == 0);

         if (var1 == 0) {
            d++;
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "ig.C(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
      }
   }

   static final int a(byte var0, int var1, int var2) {
      int var4 = client.lb;

      try {
         i++;
         if (~var1 == 1) {
            return 12345678;
         } else if (~var1 == 0) {
            if (var2 < 2) {
               var2 = 2;
               if (var4 == 0) {
                  return var2;
               }
            }

            if (var2 > 126) {
               var2 = 126;
            }

            return var2;
         } else {
            if (var0 != -91) {
               a((byte)-126);
            }

            var2 = var2 * (127 & var1) >> 1611550343;
            if (var2 < 2) {
               var2 = 2;
               if (var4 == 0) {
                  return var2 + (65408 & var1);
               }
            }

            if (~var2 < -127) {
               var2 = 126;
            }

            return var2 + (65408 & var1);
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "ig.A(" + var0 + 44 + var1 + 44 + var2 + 41);
      }
   }

   private final void a(int var1, int var2, int var3, Class_lh var4) {
      int var6 = client.lb;

      try {
         label38: {
            if (var3 != 1) {
               if (var3 != 2) {
                  if (~var3 != -4) {
                     break label38;
                  }

                  var4.k(1355769544);
                  if (var6 == 0) {
                     break label38;
                  }
               }

               this.k = var4.k(1355769544);
               if (this.k != 65535) {
                  break label38;
               }

               this.k = -1;
               if (var6 == 0) {
                  break label38;
               }
            }

            this.l = var4.b((byte)-119);
            this.a(-1, this.l);
         }

         if (var1 != 30704) {
            this.l = -84;
         }

         g++;
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "ig.D(" + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ')');
      }
   }

   private final void a(int var1, int var2) {
      int var19 = client.lb;

      try {
         j++;
         double var3 = ((16727733 & var2) >> -1197475216) / 256.0;
         double var5 = (0xFF & var2 >> -715674776) / 256.0;
         double var7 = (0xFF & var2) / 256.0;
         double var9 = var3;
         double var11 = var3;
         if (var3 < var5) {
            var11 = var5;
         }

         if (var3 > var5) {
            var9 = var5;
         }

         double var13 = 0.0;
         if (var11 < var7) {
            var11 = var7;
         }

         if (var7 < var9) {
            var9 = var7;
         }

         double var15;
         double var17;
         label78: {
            var15 = 0.0;
            var17 = (var9 + var11) / 2.0;
            this.c = (int)(256.0 * var17);
            if (var1 >= ~this.c) {
               if (this.c <= 255) {
                  break label78;
               }

               this.c = 255;
               if (var19 == 0) {
                  break label78;
               }
            }

            this.c = 0;
         }

         if (var11 != var9) {
            if (var17 < 0.5) {
               var15 = (-var9 + var11) / (var9 + var11);
            }

            label68: {
               if (var3 != var11) {
                  if (var11 != var5) {
                     if (var11 != var7) {
                        break label68;
                     }

                     var13 = 4.0 + (-var5 + var3) / (-var9 + var11);
                     if (var19 == 0) {
                        break label68;
                     }
                  }

                  var13 = (-var3 + var7) / (-var9 + var11) + 2.0;
                  if (var19 == 0) {
                     break label68;
                  }
               }

               var13 = (-var7 + var5) / (var11 - var9);
            }

            if (var17 >= 0.5) {
               var15 = (var11 - var9) / (-var9 + (-var11 + 2.0));
            }
         }

         label58: {
            var13 /= 6.0;
            this.m = (int)(var15 * 256.0);
            if (var17 > 0.5) {
               this.a = (int)((-var17 + 1.0) * var15 * 512.0);
               if (var19 == 0) {
                  break label58;
               }
            }

            this.a = (int)(512.0 * (var17 * var15));
         }

         label53: {
            if (this.m >= 0) {
               if (this.m <= 255) {
                  break label53;
               }

               this.m = 255;
               if (var19 == 0) {
                  break label53;
               }
            }

            this.m = 0;
         }

         if (this.a < 1) {
            this.a = 1;
         }

         this.h = (int)(this.a * var13);
      } catch (RuntimeException var20) {
         throw Class_sh.a(var20, "ig.B(" + var1 + ',' + var2 + ')');
      }
   }

   public static void a(byte var0) {
      try {
         f = null;
         if (var0 != -28) {
            a(null, 22);
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ig.G(" + var0 + ')');
      }
   }

   static final void a(int var0, byte var1, int var2, Class_ha var3, int var4, int var5, int var6) {
      try {
         e++;
         if (var1 <= 96) {
            f = null;
         }

         int var7 = var2 * var2 + var6 * var6;
         if (var7 <= 360000) {
            int var8 = Math.min(var3.Gc / 2, var3.nc / 2);
            if (~(var8 * var8) > ~var7) {
               var8 -= 10;
               int var9 = Class_ok.eb + Class_ba.z & 2047;
               int var10 = Class_kd.e[var9];
               var10 = var10 * 256 / (256 + Class_uf.W);
               int var11 = Class_kd.q[var9];
               var11 = 256 * var11 / (Class_uf.W - -256);
               int var12 = var6 * var10 + var2 * var11 >> 683275280;
               int var13 = -(var10 * var2) + var11 * var6 >> 823015568;
               double var14 = Math.atan2(var12, var13);
               int var16 = (int)(Math.sin(var14) * var8);
               int var17 = (int)(var8 * Math.cos(var14));
               ((Class_ni)Class_of.o[var0]).a(-10 + var5 - -(var3.Gc / 2) + var16, -10 + -var17 + var4 + var3.nc / 2, 20, 20, 15, 15, var14, 256);
            } else {
               Class_fb.a(var6, -90, var3, var5, var2, Class_mb.x[var0], var4);
            }
         }
      } catch (RuntimeException var18) {
         throw Class_sh.a(
            var18, "ig.E(" + var0 + ',' + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ',' + var4 + ',' + var5 + ',' + var6 + ')'
         );
      }
   }

   public Class_ig() {
      this.k = -1;
   }
}
