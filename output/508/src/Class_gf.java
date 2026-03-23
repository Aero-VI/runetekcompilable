final class Class_gf extends Class_hg {
   private long p;

   final int a(int var1, int var2, int var3) {
      try {
         long var4 = var1 * 1000000L;
         int var10 = 0;
         long var6 = this.p - System.nanoTime();
         if (var6 < var4) {
            var6 = var4;
         }

         if (var2 != -19) {
            return -96;
         } else {
            Class_hg.a(-5, var6 / 1000000L);

            long var8;
            for (var8 = System.nanoTime(); 10 > var10 && (~var10 > -2 || this.p < var8); var10++) {
               this.p += var3 * 1000000L;
            }

            if (var8 > this.p) {
               this.p = var8;
            }

            return var10;
         }
      } catch (RuntimeException var11) {
         throw var11;
      }
   }

   Class_gf() {
      try {
         this.p = System.nanoTime();
      } catch (RuntimeException var2) {
         throw var2;
      }
   }

   final void a(boolean var1) {
      try {
         this.p = System.nanoTime();
         if (!var1) {
            this.a(false);
         }
      } catch (RuntimeException var3) {
         throw var3;
      }
   }
}
