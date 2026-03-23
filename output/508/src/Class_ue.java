import java.awt.Component;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public final class Class_ue extends Class_me {
   private Component w;

   final void a(int var1, int var2, int var3, Graphics var4) {
      try {
         if (var1 < 72) {
            this.a((Graphics)null, true, -108, 25, 34, 46);
         }

         var4.drawImage(this.n, var2, var3, this.w);
      } catch (RuntimeException var6) {
         throw var6;
      }
   }

   final void a(Component var1, int var2, int var3, int var4) {
      try {
         this.g = new int[1 + var2 * var4];
         this.v = var2;
         this.h = var4;
         DataBufferInt var5 = new DataBufferInt(this.g, this.g.length);
         int var8 = -5 % ((var3 - -80) / 38);
         DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
         WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.v, this.h), var5, null);
         this.n = new BufferedImage(var6, var7, false, new Hashtable());
         this.w = var1;
         this.c(37);
      } catch (RuntimeException var9) {
         throw var9;
      }
   }

   final void a(Graphics var1, boolean var2, int var3, int var4, int var5, int var6) {
      try {
         Shape var7 = var1.getClip();
         var1.clipRect(var4, var5, var3, var6);
         if (!var2) {
            this.a((Component)null, -64, 3, 120);
         }

         var1.drawImage(this.n, 0, 0, this.w);
         var1.setClip(var7);
      } catch (RuntimeException var8) {
         throw var8;
      }
   }
}
