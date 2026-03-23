final class Class_re extends Class_wd {
   private Class_c t = new Class_c();
   private Class_c u = new Class_c();
   private int v = -1;
   private int w = 0;

   final int a() {
      return 0;
   }

   final Class_wd b() {
      return (Class_wd)this.t.e((byte)76);
   }

   private final void a(Class_qg var1) {
      var1.c(-17554);
      var1.a();
      Class_li var2 = this.u.n.l;
      if (var2 == this.u.n) {
         this.v = -1;
      } else {
         this.v = ((Class_qg)var2).p;
      }
   }

   private final void e(int var1) {
      for (Class_wd var2 = (Class_wd)this.t.e((byte)76); var2 != null; var2 = (Class_wd)this.t.c((byte)-110)) {
         var2.d(var1);
      }
   }

   final synchronized void a(Class_wd var1) {
      var1.c(-17554);
   }

   private final void a(Class_li var1, Class_qg var2) {
      while (var1 != this.u.n && ((Class_qg)var1).p <= var2.p) {
         var1 = var1.l;
      }

      Class_rh.a(86, var1, var2);
      this.v = ((Class_qg)this.u.n.l).p;
   }

   final synchronized void b(Class_wd var1) {
      this.t.a((byte)107, var1);
   }

   final synchronized void b(int[] var1, int var2, int var3) {
      while (this.v >= 0) {
         if (this.w + var3 < this.v) {
            this.w += var3;
            this.c(var1, var2, var3);
            return;
         }

         int var4 = this.v - this.w;
         this.c(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.w += var4;
         this.e();
         Class_qg var5 = (Class_qg)this.u.e((byte)76);
         synchronized (var5) {
            int var8 = var5.a(this);
            if (var8 < 0) {
               var5.p = 0;
               this.a(var5);
            } else {
               var5.p = var8;
               this.a(var5.l, var5);
            }
         }

         if (var3 == 0) {
            return;
         }
      }

      this.c(var1, var2, var3);
   }

   final synchronized void d(int var1) {
      while (this.v >= 0) {
         if (this.w + var1 < this.v) {
            this.w += var1;
            this.e(var1);
            return;
         }

         int var2 = this.v - this.w;
         this.e(var2);
         var1 -= var2;
         this.w += var2;
         this.e();
         Class_qg var3 = (Class_qg)this.u.e((byte)76);
         synchronized (var3) {
            int var6 = var3.a(this);
            if (var6 < 0) {
               var3.p = 0;
               this.a(var3);
            } else {
               var3.p = var6;
               this.a(var3.l, var3);
            }
         }

         if (var1 == 0) {
            return;
         }
      }

      this.e(var1);
   }

   private final void e() {
      if (this.w > 0) {
         for (Class_qg var1 = (Class_qg)this.u.e((byte)76); var1 != null; var1 = (Class_qg)this.u.c((byte)-127)) {
            var1.p = var1.p - this.w;
         }

         this.v = this.v - this.w;
         this.w = 0;
      }
   }

   final Class_wd d() {
      return (Class_wd)this.t.c((byte)-110);
   }

   private final void c(int[] var1, int var2, int var3) {
      for (Class_wd var4 = (Class_wd)this.t.e((byte)76); var4 != null; var4 = (Class_wd)this.t.c((byte)-116)) {
         var4.a(var1, var2, var3);
      }
   }

   public Class_re() {
   }
}
