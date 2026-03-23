abstract class Class_wd extends Class_li {
   Class_ki p;
   int q;
   volatile boolean r = true;
   Class_wd s;

   final void a(int[] var1, int var2, int var3) {
      if (this.r) {
         this.b(var1, var2, var3);
      } else {
         this.d(var3);
      }
   }

   abstract int a();

   abstract void b(int[] var1, int var2, int var3);

   abstract Class_wd b();

   int c() {
      return 255;
   }

   abstract Class_wd d();

   abstract void d(int var1);

   public Class_wd() {
   }
}
