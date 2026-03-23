import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class Class_ac {
   private long a;
   private long b;
   private RandomAccessFile c;
   private File d;

   public final long a(int var1) throws IOException {
      try {
         if (var1 != -1) {
            this.d = null;
         }

         return this.c.length();
      } catch (RuntimeException var3) {
         throw var3;
      }
   }

   public final File b(int var1) {
      try {
         if (var1 != 0) {
            this.a = 11L;
         }

         return this.d;
      } catch (RuntimeException var3) {
         throw var3;
      }
   }

   public final void a(boolean var1, long var2) throws IOException {
      try {
         if (var1) {
            this.b(46);
         }

         this.c.seek(var2);
         this.a = var2;
      } catch (RuntimeException var5) {
         throw var5;
      }
   }

   public final void c(int var1) throws IOException {
      try {
         if (var1 != -8143) {
            this.c = null;
         }

         if (this.c != null) {
            this.c.close();
            this.c = null;
         }
      } catch (RuntimeException var3) {
         throw var3;
      }
   }

   public final void a(int var1, byte[] var2, int var3, int var4) throws IOException {
      try {
         if (var3 == 18405) {
            if (var4 + this.a > this.b) {
               this.c.seek(this.b + 1L);
               this.c.write(1);
               throw new EOFException();
            } else {
               this.c.write(var2, var1, var4);
               this.a += var4;
            }
         }
      } catch (RuntimeException var6) {
         throw var6;
      }
   }

   public final int a(int var1, int var2, int var3, byte[] var4) throws IOException {
      try {
         int var5 = this.c.read(var4, var3, var1);
         if (var5 > var2) {
            this.a += var5;
         }

         return var5;
      } catch (RuntimeException var6) {
         throw var6;
      }
   }

   Class_ac(File var1, String var2, long var3) throws IOException {
      try {
         if (var3 == -1L) {
            var3 = 9223372036854775807L;
         }

         if (~var1.length() <= ~var3) {
            var1.delete();
         }

         this.c = new RandomAccessFile(var1, var2);
         this.d = var1;
         this.b = var3;
         this.a = 0L;
         int var5 = this.c.read();
         if (var5 != -1 && !var2.equals("r")) {
            this.c.seek(0L);
            this.c.write(var5);
         }

         this.c.seek(0L);
      } catch (RuntimeException var6) {
         throw var6;
      }
   }

   protected final void finalize() throws Throwable {
      try {
         if (this.c != null) {
            System.out.println("Warning! fileondisk " + this.d + " not closed correctly using close(). Auto-closing instead. ");
            this.c(-8143);
         }
      } catch (RuntimeException var2) {
         throw var2;
      }
   }
}
