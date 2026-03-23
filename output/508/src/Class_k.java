final class Class_k extends Class_ki {
   int q;
   int r;
   byte[] s;
   boolean t;
   int u;

   final Class_k a(Class_ph var1) {
      this.s = var1.a((byte)-127, this.s);
      this.u = var1.a(this.u, -100);
      if (this.q == this.r) {
         this.q = this.r = var1.a(this.q, (byte)127);
      } else {
         this.q = var1.a(this.q, (byte)127);
         this.r = var1.a(this.r, (byte)127);
         if (this.q == this.r) {
            this.q--;
         }
      }

      return this;
   }

   Class_k(int var1, byte[] var2, int var3, int var4) {
      this.u = var1;
      this.s = var2;
      this.q = var3;
      this.r = var4;
   }

   Class_k(int var1, byte[] var2, int var3, int var4, boolean var5) {
      this.u = var1;
      this.s = var2;
      this.q = var3;
      this.r = var4;
      this.t = var5;
   }
}
