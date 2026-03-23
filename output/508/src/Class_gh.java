import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;

final class Class_gh extends Class_ff {
   private SourceDataLine L;
   private AudioFormat M;
   private byte[] N;
   private int O;
   private boolean P = false;
   static Class Q;

   final int b() {
      try {
         return this.O - (this.L.available() >> (Class_aj.p ? 2 : 1));
      } catch (RuntimeException var2) {
         throw var2;
      }
   }

   final void a(Component var1) {
      try {
         Info[] var2 = AudioSystem.getMixerInfo();
         if (var2 != null) {
            int var4 = 0;

            for (Info[] var3 = var2; ~var4 > ~var3.length; var4++) {
               Info var5 = var3[var4];
               if (null != var5) {
                  String var6 = var5.getName();
                  if (null != var6 && ~var6.toLowerCase().indexOf("soundmax") <= -1) {
                     this.P = true;
                  }
               }
            }
         }

         this.M = new AudioFormat(Class_pd.a, 16, Class_aj.p ? 2 : 1, true, false);
         this.N = new byte[256 << (!Class_aj.p ? 1 : 2)];
      } catch (RuntimeException var7) {
         throw var7;
      }
   }

   final void d() throws LineUnavailableException {
      try {
         this.L.flush();
         if (this.P) {
            this.L.close();
            this.L = null;
            javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(
               Q == null ? (Q = a("javax.sound.sampled.SourceDataLine")) : Q, this.M, this.O << (Class_aj.p ? 2 : 1)
            );
            this.L = (SourceDataLine)AudioSystem.getLine(var1);
            this.L.open();
            this.L.start();
         }
      } catch (RuntimeException var2) {
         throw var2;
      }
   }

   final void c() {
      try {
         if (this.L != null) {
            this.L.close();
            this.L = null;
         }
      } catch (RuntimeException var2) {
         throw var2;
      }
   }

   final void a(int var1) throws LineUnavailableException {
      try {
         try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(
               Q == null ? (Q = a("javax.sound.sampled.SourceDataLine")) : Q, this.M, var1 << (!Class_aj.p ? 1 : 2)
            );
            this.L = (SourceDataLine)AudioSystem.getLine(var2);
            this.L.open();
            this.L.start();
            this.O = var1;
         } catch (LineUnavailableException var3) {
            if (~Class_we.a(var1, (byte)-73) == -2) {
               this.L = null;
               throw var3;
            } else {
               this.a(Class_pa.f(var1, -21189));
            }
         }
      } catch (RuntimeException var4) {
         throw var4;
      }
   }

   final void a() {
      short var1 = 256;
      if (Class_aj.p) {
         var1 <<= 1;
      }

      for (int var2 = 0; var2 < var1; var2++) {
         int var3 = this.x[var2];
         if ((var3 + 8388608 & 0xFF000000) != 0) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this.N[var2 * 2] = (byte)(var3 >> 8);
         this.N[var2 * 2 + 1] = (byte)(var3 >> 16);
      }

      this.L.write(this.N, 0, var1 << 1);
   }

   static Class a(String var0) {
      try {
         return Class.forName(var0);
      } catch (ClassNotFoundException var2) {
         NoClassDefFoundError _err = new NoClassDefFoundError(); _err.initCause(var2); throw _err;
      }
   }
}
