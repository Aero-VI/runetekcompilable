final class Class_t {
   short[] a;
   private static short[] b = new short[500];
   short[] c;
   private static short[] d = new short[500];
   short[] e;
   private static short[] f = new short[500];
   boolean g;
   Class_gg h = null;
   private static short[] i = new short[500];
   private static short[] j = new short[500];
   int k;
   short[] l;
   short[] m;

   public static void a() {
      f = null;
      j = null;
      i = null;
      d = null;
      b = null;
   }

   Class_t(byte[] var1, Class_gg var2) {
      this.g = false;
      this.k = -1;
      this.h = var2;
      Class_lh var3 = new Class_lh(var1);
      Class_lh var4 = new Class_lh(var1);
      var3.p = 2;
      int var5 = var3.n(-6677);
      int var6 = 0;
      int var7 = -1;
      int var8 = -1;
      var4.p = var3.p + var5;

      for (int var9 = 0; var9 < var5; var9++) {
         if (this.h.u[var9] == 0) {
            var7 = var9;
         }

         int var10 = var3.n(-6677);
         if (var10 > 0) {
            if (this.h.u[var9] == 0) {
               var8 = var9;
            }

            f[var6] = (short)var9;
            short var11 = 0;
            if (this.h.u[var9] == 3) {
               var11 = 128;
            }

            if ((var10 & 1) != 0) {
               j[var6] = (short)var4.q(32767);
            } else {
               j[var6] = var11;
            }

            if ((var10 & 2) != 0) {
               i[var6] = (short)var4.q(32767);
            } else {
               i[var6] = var11;
            }

            if ((var10 & 4) != 0) {
               d[var6] = (short)var4.q(32767);
            } else {
               d[var6] = var11;
            }

            if (this.h.u[var9] == 2) {
               j[var6] = (short)(((j[var6] & 255) << 3) + (j[var6] >> 8 & 7));
               i[var6] = (short)(((i[var6] & 255) << 3) + (i[var6] >> 8 & 7));
               d[var6] = (short)(((d[var6] & 255) << 3) + (d[var6] >> 8 & 7));
            }

            b[var6] = -1;
            if (this.h.u[var9] >= 1 && this.h.u[var9] <= 3 && var7 > var8) {
               b[var6] = (short)var7;
               var8 = var7;
            }

            var6++;
            if (this.h.u[var9] == 5) {
               this.g = true;
            }
         }
      }

      if (var4.p != var1.length) {
         throw new RuntimeException();
      } else {
         this.k = var6;
         this.m = new short[var6];
         this.a = new short[var6];
         this.c = new short[var6];
         this.l = new short[var6];
         this.e = new short[var6];

         for (int var12 = 0; var12 < var6; var12++) {
            this.m[var12] = f[var12];
            this.a[var12] = j[var12];
            this.c[var12] = i[var12];
            this.l[var12] = d[var12];
            this.e[var12] = b[var12];
         }
      }
   }
}
