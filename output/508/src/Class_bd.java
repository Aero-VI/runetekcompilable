final class Class_bd {
   private Class_lh a = new Class_lh(null);
   private static byte[] b = new byte[]{
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      0,
      1,
      2,
      1,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0
   };
   private int[] c;
   int[] d;
   private long e;
   int f;
   private int g;
   private int[] h;
   private int[] i;

   final boolean a() {
      return this.a.E != null;
   }

   final int b() {
      int var1 = this.h.length;
      int var2 = -1;
      int var3 = 2147483647;

      for (int var4 = 0; var4 < var1; var4++) {
         if (this.h[var4] >= 0 && this.d[var4] < var3) {
            var2 = var4;
            var3 = this.d[var4];
         }
      }

      return var2;
   }

   final void a(int var1) {
      this.a.p = this.h[var1];
   }

   final int c() {
      return this.h.length;
   }

   final void a(byte[] var1) {
      this.a.E = var1;
      this.a.p = 10;
      int var2 = this.a.k(1355769544);
      this.f = this.a.k(1355769544);
      this.g = 500000;
      this.i = new int[var2];
      int var3 = 0;

      while (var3 < var2) {
         int var4 = this.a.h(-5528);
         int var5 = this.a.h(-5528);
         if (var4 == 1297379947) {
            this.i[var3] = this.a.p;
            var3++;
         }

         this.a.p += var5;
      }

      this.e = 0L;
      this.h = new int[var2];

      for (int var6 = 0; var6 < var2; var6++) {
         this.h[var6] = this.i[var6];
      }

      this.d = new int[var2];
      this.c = new int[var2];
   }

   public static void d() {
      b = null;
   }

   private final int a(int var1, int var2) {
      if (var2 == 255) {
         int var7 = this.a.n(-6677);
         int var8 = this.a.b(true);
         if (var7 == 47) {
            this.a.p += var8;
            return 1;
         } else if (var7 == 81) {
            int var5 = this.a.b((byte)77);
            var8 -= 3;
            int var6 = this.d[var1];
            this.e = this.e + (long)var6 * (this.g - var5);
            this.g = var5;
            this.a.p += var8;
            return 2;
         } else {
            this.a.p += var8;
            return 3;
         }
      } else {
         byte var3 = b[var2 - 128];
         int var4 = var2;
         if (var3 >= 1) {
            var4 = var2 | this.a.n(-6677) << 8;
         }

         if (var3 >= 2) {
            var4 |= this.a.n(-6677) << 16;
         }

         return var4;
      }
   }

   final void e() {
      this.a.E = null;
      this.i = null;
      this.h = null;
      this.d = null;
      this.c = null;
   }

   private final int b(int var1) {
      int var2 = this.a.E[this.a.p];
      if (var2 < 0) {
         var2 &= 255;
         this.c[var1] = var2;
         this.a.p++;
      } else {
         var2 = this.c[var1];
      }

      if (var2 != 240 && var2 != 247) {
         return this.a(var1, var2);
      } else {
         int var3 = this.a.b(true);
         if (var2 == 247 && var3 > 0) {
            int var4 = this.a.E[this.a.p] & 255;
            if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
               this.a.p++;
               this.c[var1] = var4;
               return this.a(var1, var4);
            }
         }

         this.a.p += var3;
         return 0;
      }
   }

   final void c(int var1) {
      int var2 = this.a.b(true);
      this.d[var1] = this.d[var1] + var2;
   }

   final long d(int var1) {
      return this.e + (long)var1 * this.g;
   }

   final void f() {
      this.a.p = -1;
   }

   final void e(int var1) {
      this.h[var1] = this.a.p;
   }

   final int f(int var1) {
      return this.b(var1);
   }

   public Class_bd() {
   }

   final void a(long var1) {
      this.e = var1;
      int var3 = this.h.length;

      for (int var4 = 0; var4 < var3; var4++) {
         this.d[var4] = 0;
         this.c[var4] = 0;
         this.a.p = this.i[var4];
         this.c(var4);
         this.h[var4] = this.a.p;
      }
   }

   final boolean g() {
      int var1 = this.h.length;

      for (int var2 = 0; var2 < var1; var2++) {
         if (this.h[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   Class_bd(byte[] var1) {
      this.a(var1);
   }
}
