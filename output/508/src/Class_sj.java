final class Class_sj {
   static Class_r a = Class_tc.a(43, "<col=ffffff> )4 ");
   private int[] b;
   static short[] c = new short[]{24, 49, 20, 33, 19, 4, 26, 25};
   static Class_r d = Class_tc.a(43, "headicons_prayer");
   static boolean e;
   static int f = 1;
   static Class_jb[] g;
   static int h;
   static int i;
   static Class_ga[] j = new Class_ga[4];
   static int k = 0;
   static Class_cj l;
   static Class_jk m;
   static byte[][][] n;

   final int a(int var1, int var2) {
      try {
         h++;
         int var3 = (this.b.length >> -856325599) + var2;
         int var4 = var3 & var1;

         while (true) {
            int var5 = this.b[1 + var4 - -var4];
            if (~var5 == 0) {
               return -1;
            }

            if (~this.b[var4 + var4] == ~var1) {
               return var5;
            }

            var4 = var3 & var4 - -1;
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "sj.B(" + var1 + 44 + var2 + 41);
      }
   }

   Class_sj(int[] var1) {
      try {
         byte var2 = 1;

         while (var1.length - -(var1.length >> 903985793) >= var2) {
            var2 <<= 1;
         }

         this.b = new int[var2 - -var2];

         for (int var3 = 0; ~(var2 + var2) < ~var3; var3++) {
            this.b[var3] = -1;
         }

         int var4 = 0;

         while (~var4 > ~var1.length) {
            int var5 = var1[var4] & var2 + -1;

            while (~this.b[1 + var5 + var5] != 0) {
               var5 = var2 + -1 & 1 + var5;
            }

            this.b[var5 - -var5] = var1[var4];
            this.b[var5 - (-var5 - 1)] = var4++;
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "sj.<init>(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   public static void a(int var0) {
      try {
         if (var0 != 20) {
            a(-7);
         }

         d = null;
         a = null;
         m = null;
         j = null;
         g = null;
         l = null;
         n = null;
         c = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "sj.A(" + var0 + ')');
      }
   }

   static final void a(byte var0, Class_cj var1) {
      try {
         i++;
         Class_wf.m = var1;
         Class_jd.a = Class_wf.m.e(16, 0);
         if (var0 != -101) {
            a(26);
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "sj.C(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
      }
   }
}
