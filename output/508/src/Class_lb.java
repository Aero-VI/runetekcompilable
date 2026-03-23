import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;

final class Class_lb {
   private static String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| "
      + String.valueOf('\u00c4')
      + '\u00cb'
      + '\u00cf'
      + '\u00d6'
      + '\u00dc'
      + '\u00e4'
      + '\u00eb'
      + '\u00ef'
      + '\u00f6'
      + '\u00fc'
      + '\u00ff'
      + '\u00df';
   private int b = 0;
   private byte[] c;
   private boolean d = false;
   private static int e = a.length();
   private static int[] f = new int[256];

   private final void a(Font var1, FontMetrics var2, char var3, int var4, boolean var5) {
      int var6 = var2.charWidth(var3);
      int var7 = var6;
      if (var5) {
         try {
            if (var3 == '/') {
               var5 = false;
            }

            if (var3 == 'f'
               || var3 == 't'
               || var3 == 'w'
               || var3 == 'v'
               || var3 == 'k'
               || var3 == 'x'
               || var3 == 'y'
               || var3 == 'A'
               || var3 == 'V'
               || var3 == 'W') {
               var6++;
            }
         } catch (Exception var27) {
         }
      }

      int var8 = var2.getMaxAscent();
      int var9 = var2.getMaxAscent() + var2.getMaxDescent();
      int var10 = var2.getHeight();
      Image var11 = Class_od.u.createImage(var6, var9);
      Graphics var12 = var11.getGraphics();
      var12.setColor(Color.black);
      var12.fillRect(0, 0, var6, var9);
      var12.setColor(Color.white);
      var12.setFont(var1);
      var12.drawString(String.valueOf(var3), 0, var8);
      if (var5) {
         var12.drawString(String.valueOf(var3), 1, var8);
      }

      int[] var13 = new int[var6 * var9];
      PixelGrabber var14 = new PixelGrabber(var11, 0, 0, var6, var9, var13, 0, var6);

      try {
         var14.grabPixels();
      } catch (Exception var26) {
      }

      var11.flush();
      Object var28 = null;
      int var15 = 0;
      int var16 = 0;
      int var17 = var6;
      int var18 = var9;

      label139:
      for (int var19 = 0; var19 < var9; var19++) {
         for (int var20 = 0; var20 < var6; var20++) {
            int var21 = var13[var20 + var19 * var6];
            if ((var21 & 16777215) != 0) {
               var16 = var19;
               break label139;
            }
         }
      }

      label126:
      for (int var29 = 0; var29 < var6; var29++) {
         for (int var30 = 0; var30 < var9; var30++) {
            int var22 = var13[var29 + var30 * var6];
            if ((var22 & 16777215) != 0) {
               var15 = var29;
               break label126;
            }
         }
      }

      label113:
      for (int var31 = var9 - 1; var31 >= 0; var31--) {
         for (int var32 = 0; var32 < var6; var32++) {
            int var23 = var13[var32 + var31 * var6];
            if ((var23 & 16777215) != 0) {
               var18 = var31 + 1;
               break label113;
            }
         }
      }

      label100:
      for (int var33 = var6 - 1; var33 >= 0; var33--) {
         for (int var34 = 0; var34 < var9; var34++) {
            int var24 = var13[var33 + var34 * var6];
            if ((var24 & 16777215) != 0) {
               var17 = var33 + 1;
               break label100;
            }
         }
      }

      this.c[var4 * 9] = (byte)(this.b / 16384);
      this.c[var4 * 9 + 1] = (byte)(this.b / 128 & 127);
      this.c[var4 * 9 + 2] = (byte)(this.b & 127);
      this.c[var4 * 9 + 3] = (byte)(var17 - var15);
      this.c[var4 * 9 + 4] = (byte)(var18 - var16);
      this.c[var4 * 9 + 5] = (byte)var15;
      this.c[var4 * 9 + 6] = (byte)(var8 - var16);
      this.c[var4 * 9 + 7] = (byte)var7;
      this.c[var4 * 9 + 8] = (byte)var10;

      for (int var35 = var16; var35 < var18; var35++) {
         for (int var36 = var15; var36 < var17; var36++) {
            int var25 = var13[var36 + var35 * var6] & 0xFF;
            if (var25 > 30 && var25 < 230) {
               this.d = true;
            }

            this.c[this.b++] = (byte)var25;
         }
      }
   }

   final int a() {
      return this.c[8] - 1;
   }

   private final void a(int var1, int var2, int var3, int var4, byte[] var5) {
      int var6 = var2 + var5[var1 + 5];
      int var7 = var3 - var5[var1 + 6];
      int var8 = var5[var1 + 3];
      int var9 = var5[var1 + 4];
      int var10 = var5[var1] * 16384 + var5[var1 + 1] * 128 + var5[var1 + 2];
      int var11 = var6 + var7 * Class_nc.e;
      int var12 = Class_nc.e - var8;
      int var13 = 0;
      if (var7 < Class_nc.g) {
         int var14 = Class_nc.g - var7;
         var9 -= var14;
         var7 = Class_nc.g;
         var10 += var14 * var8;
         var11 += var14 * Class_nc.e;
      }

      if (var7 + var9 >= Class_nc.h) {
         var9 -= var7 + var9 - Class_nc.h + 1;
      }

      if (var6 < Class_nc.d) {
         int var15 = Class_nc.d - var6;
         var8 -= var15;
         var6 = Class_nc.d;
         var10 += var15;
         var11 += var15;
         var13 += var15;
         var12 += var15;
      }

      if (var6 + var8 >= Class_nc.b) {
         int var16 = var6 + var8 - Class_nc.b + 1;
         var8 -= var16;
         var13 += var16;
         var12 += var16;
      }

      if (var8 > 0 && var9 > 0) {
         if (this.d) {
            this.a(Class_nc.f, var5, var4, var10, var11, var8, var9, var12, var13);
            return;
         }

         this.b(Class_nc.f, var5, var4, var10, var11, var8, var9, var12, var13);
      }
   }

   final int b() {
      return this.c[6];
   }

   final void a(Class_r var1, int var2, int var3, int var4, boolean var5) {
      int var6 = this.a(var1) / 2;
      int var7 = this.b();
      if (var2 - var6 <= Class_nc.b) {
         if (var2 + var6 >= Class_nc.d) {
            if (var3 - var7 <= Class_nc.h) {
               if (var3 >= 0) {
                  this.b(var1, var2 - var6, var3, var4, var5);
               }
            }
         }
      }
   }

   private final void a(int[] var1, byte[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      for (int var10 = -var7; var10 < 0; var10++) {
         for (int var11 = -var6; var11 < 0; var11++) {
            int var12 = var2[var4++] & 255;
            if (var12 > 30) {
               if (var12 >= 230) {
                  var1[var5++] = var3;
               } else {
                  int var13 = var1[var5];
                  var1[var5++] = ((var3 & 16711935) * var12 + (var13 & 16711935) * (256 - var12) & -16711936)
                        + ((var3 & 0xFF00) * var12 + (var13 & 0xFF00) * (256 - var12) & 0xFF0000)
                     >> 8;
               }
            } else {
               var5++;
            }
         }

         var5 += var8;
         var4 += var9;
      }
   }

   public static void c() {
      a = null;
      f = null;
   }

   Class_lb(int var1, boolean var2, Component var3) {
      this.c = new byte[100000];
      this.b = e * 9;
      this.d = false;
      Font var4 = new Font("Helvetica", var2 ? 1 : 0, var1);
      FontMetrics var5 = var3.getFontMetrics(var4);

      for (int var6 = 0; var6 < e; var6++) {
         this.a(var4, var5, a.charAt(var6), var6, false);
      }

      if (var2 && this.d) {
         this.b = e * 9;
         this.d = false;
         var4 = new Font("Helvetica", 0, var1);
         var5 = var3.getFontMetrics(var4);

         for (int var7 = 0; var7 < e; var7++) {
            this.a(var4, var5, a.charAt(var7), var7, false);
         }

         if (!this.d) {
            this.b = e * 9;
            this.d = false;

            for (int var8 = 0; var8 < e; var8++) {
               this.a(var4, var5, a.charAt(var8), var8, true);
            }
         }
      }

      byte[] var11 = new byte[this.b];

      for (int var12 = 0; var12 < this.b; var12++) {
         var11[var12] = this.c[var12];
      }

      this.c = var11;
   }

   private final void b(Class_r var1, int var2, int var3, int var4, boolean var5) {
      if (this.d || var4 == 0) {
         var5 = false;
      }

      for (int var6 = 0; var6 < var1.d((byte)-111); var6++) {
         int var7 = f[var1.a(var6, 7178)];
         if (var5) {
            this.a(var7, var2 + 1, var3, 1, this.c);
            this.a(var7, var2, var3 + 1, 1, this.c);
         }

         this.a(var7, var2, var3, var4, this.c);
         var2 += this.c[var7 + 7];
      }
   }

   private final int a(Class_r var1) {
      byte var2 = 0;

      for (int var3 = 0; var3 < var1.d((byte)-107); var3++) {
         if (var1.a(var3, 7178) == 64 && var3 + 4 < var1.d((byte)-126) && var1.a(var3 + 4, 7178) == 64) {
            var3 += 4;
         } else if (var1.a(var3, 7178) == 126 && var3 + 4 < var1.d((byte)-127) && var1.a(var3 + 4, 7178) == 126) {
            var3 += 4;
         } else {
            var2 += this.c[f[var1.a(var3, 7178)] + 7];
         }
      }

      return var2;
   }

   private final void b(int[] var1, byte[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = -(var6 >> 2);
      var6 = -(var6 & 3);

      for (int var11 = -var7; var11 < 0; var11++) {
         for (int var12 = var10; var12 < 0; var12++) {
            if (var2[var4++] != 0) {
               var1[var5++] = var3;
            } else {
               var5++;
            }

            if (var2[var4++] != 0) {
               var1[var5++] = var3;
            } else {
               var5++;
            }

            if (var2[var4++] != 0) {
               var1[var5++] = var3;
            } else {
               var5++;
            }

            if (var2[var4++] != 0) {
               var1[var5++] = var3;
            } else {
               var5++;
            }
         }

         for (int var13 = var6; var13 < 0; var13++) {
            if (var2[var4++] != 0) {
               var1[var5++] = var3;
            } else {
               var5++;
            }
         }

         var5 += var8;
         var4 += var9;
      }
   }

   static {
      for (int var0 = 0; var0 < 256; var0++) {
         int var1 = a.indexOf(var0);
         if (var1 == -1) {
            var1 = 74;
         }

         f[var0] = var1 * 9;
      }
   }
}
