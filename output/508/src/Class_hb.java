final class Class_hb {
   private Class_gi[] a = new Class_gi[10];
   private int b;
   private int c;

   final Class_k a() {
      byte[] var1 = this.c();
      return new Class_k(22050, var1, 22050 * this.b / 1000, 22050 * this.c / 1000);
   }

   static final Class_hb a(Class_cj var0, int var1, int var2) {
      byte[] var3 = var0.a(var2, 0, var1);
      return var3 == null ? null : new Class_hb(new Class_lh(var3));
   }

   final int b() {
      int var1 = 9999999;

      for (int var2 = 0; var2 < 10; var2++) {
         if (this.a[var2] != null && this.a[var2].f / 20 < var1) {
            var1 = this.a[var2].f / 20;
         }
      }

      if (this.b < this.c && this.b / 20 < var1) {
         var1 = this.b / 20;
      }

      if (var1 != 9999999 && var1 != 0) {
         for (int var3 = 0; var3 < 10; var3++) {
            if (this.a[var3] != null) {
               this.a[var3].f -= var1 * 20;
            }
         }

         if (this.b < this.c) {
            this.b -= var1 * 20;
            this.c -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   private final byte[] c() {
      int var1 = 0;

      for (int var2 = 0; var2 < 10; var2++) {
         if (this.a[var2] != null && this.a[var2].g + this.a[var2].f > var1) {
            var1 = this.a[var2].g + this.a[var2].f;
         }
      }

      if (var1 == 0) {
         return new byte[0];
      } else {
         int var3 = 22050 * var1 / 1000;
         byte[] var4 = new byte[var3];

         for (int var5 = 0; var5 < 10; var5++) {
            if (this.a[var5] != null) {
               int var6 = this.a[var5].g * 22050 / 1000;
               int var7 = this.a[var5].f * 22050 / 1000;
               int[] var8 = this.a[var5].a(var6, this.a[var5].g);

               for (int var9 = 0; var9 < var6; var9++) {
                  int var10 = var4[var9 + var7] + (var8[var9] >> 8);
                  if ((var10 + 128 & -256) != 0) {
                     var10 = var10 >> 31 ^ 127;
                  }

                  var4[var9 + var7] = (byte)var10;
               }
            }
         }

         return var4;
      }
   }

   private Class_hb(Class_lh var1) {
      for (int var2 = 0; var2 < 10; var2++) {
         int var3 = var1.n(-6677);
         if (var3 != 0) {
            var1.p--;
            this.a[var2] = new Class_gi();
            this.a[var2].a(var1);
         }
      }

      this.b = var1.k(1355769544);
      this.c = var1.k(1355769544);
   }

   private Class_hb() {
   }
}
