final class Class_aj {
   int a;
   static Class_r b = null;
   int c;
   static int d;
   int e;
   static int f = 0;
   static Class_r g = Class_tc.a(43, "p12_full");
   static Class_qc h = new Class_qc(50);
   int i;
   boolean j = true;
   static Class_r k = Class_tc.a(43, "(U5");
   static int l;
   int m;
   static int[][] n = new int[][]{
      {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15},
      {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3},
      {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0},
      {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}
   };
   int o;
   static boolean p;
   static byte[][] q;
   static int[] r = new int[2];
   private static Class_r s = Class_tc.a(43, " more options");
   static Class_sg t;
   static Class_r u = s;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, boolean var6, int var7) {
      int var20 = client.lb;

      try {
         l++;
         int var12 = Class_tf.a(var1, Class_hh.h, (byte)114, Class_ff.d);
         int var13 = Class_tf.a(var5, Class_hh.h, (byte)114, Class_ff.d);
         int var14 = Class_tf.a(var7, Class_tg.r, (byte)114, Class_ga.v);
         int var15 = Class_tf.a(var2, Class_tg.r, (byte)114, Class_ga.v);
         int var8 = Class_tf.a(var1 + var0, Class_hh.h, (byte)114, Class_ff.d);
         int var9 = Class_tf.a(var5 - var0, Class_hh.h, (byte)114, Class_ff.d);
         int var16 = var12;
         if (var20 != 0) {
            Class_fd.a(var14, (byte)-17, var4, Class_qd.p[var12], var15);
            var16 = var12 + 1;
         }

         while (var8 > var16) {
            Class_fd.a(var14, (byte)-17, var4, Class_qd.p[var16], var15);
            var16++;
         }

         if (var6) {
            f = 118;
         }

         int var17 = var13;
         if (var20 != 0 || ~var13 < ~var9) {
            do {
               Class_fd.a(var14, (byte)-17, var4, Class_qd.p[var17], var15);
            } while (~(--var17) < ~var9);
         }

         int var10 = Class_tf.a(var7 - -var0, Class_tg.r, (byte)114, Class_ga.v);
         int var11 = Class_tf.a(-var0 + var2, Class_tg.r, (byte)114, Class_ga.v);
         int var18 = var8;
         if (var20 != 0 || ~var8 >= ~var9) {
            do {
               int[] var19 = Class_qd.p[var18];
               Class_fd.a(var14, (byte)-17, var4, var19, var10);
               Class_fd.a(var10, (byte)-17, var3, var19, var11);
               Class_fd.a(var11, (byte)-17, var4, var19, var15);
            } while (~(++var18) >= ~var9);
         }
      } catch (RuntimeException var21) {
         throw Class_sh.a(var21, "aj.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
      }
   }

   public static void a(byte var0) {
      try {
         t = null;
         k = null;
         r = null;
         b = null;
         u = null;
         n = null;
         g = null;
         q = null;
         s = null;
         if (var0 > 17) {
            h = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "aj.C(" + var0 + ')');
      }
   }

   static final int a(int var0) {
      try {
         int var1 = 121 / ((63 - var0) / 46);
         d++;
         return 6;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "aj.B(" + var0 + 41);
      }
   }

   Class_aj(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      try {
         this.e = var2;
         this.j = var7;
         this.c = var6;
         this.i = var5;
         this.m = var3;
         this.a = var4;
         this.o = var1;
      } catch (RuntimeException var9) {
         throw Class_sh.a(var9, "aj.<init>(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
      }
   }
}
