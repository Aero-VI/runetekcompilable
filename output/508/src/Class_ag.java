final class Class_ag {
   int a;
   private int[] b;
   int c;
   private int d = 2;
   int e;
   private int[] f = new int[2];
   private int g;
   private int h;
   private int i;
   private int j;
   private int k;

   final void a(Class_lh var1) {
      this.d = var1.n(-6677);
      this.f = new int[this.d];
      this.b = new int[this.d];

      for (int var2 = 0; var2 < this.d; var2++) {
         this.f[var2] = var1.k(1355769544);
         this.b[var2] = var1.k(1355769544);
      }
   }

   final int a(int var1) {
      if (this.g >= this.h) {
         this.j = this.b[this.k++] << 15;
         if (this.k >= this.d) {
            this.k = this.d - 1;
         }

         this.h = (int)(this.f[this.k] / 65536.0 * var1);
         if (this.h > this.g) {
            this.i = ((this.b[this.k] << 15) - this.j) / (this.h - this.g);
         }
      }

      this.j = this.j + this.i;
      this.g++;
      return this.j - this.i >> 15;
   }

   final void b(Class_lh var1) {
      this.c = var1.n(-6677);
      this.a = var1.h(-5528);
      this.e = var1.h(-5528);
      this.a(var1);
   }

   final void a() {
      this.h = 0;
      this.k = 0;
      this.i = 0;
      this.j = 0;
      this.g = 0;
   }

   public Class_ag() {
      this.b = new int[2];
      this.f[0] = 0;
      this.f[1] = 65535;
      this.b[0] = 0;
      this.b[1] = 65535;
   }
}
