abstract class Class_bj {
   static int[] a = new int[]{1, 4};
   static int b;
   static int c;
   static boolean d = false;
   static volatile long e = 0L;
   static Class_cj f;
   static boolean g;
   static Class_pc h;
   static int i;

   static final int a(int var0, byte var1) {
      try {
         c++;
         if (var1 < 37) {
            a(-109);
         }

         return var0 >>> -388623192;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "bj.G(" + var0 + 44 + var1 + 41);
      }
   }

   public static void a(int var0) {
      try {
         if (var0 != 0) {
            a(56);
         }

         a = null;
         h = null;
         f = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "bj.C(" + var0 + ')');
      }
   }

   abstract byte[] b(int var1);

   static final void a(int var0, int var1, int var2, int var3, int var4) {
      try {
         b++;
         if (var0 != 1) {
            a(-15);
         }

         if (var1 >= var2) {
            Class_fd.a(var2, (byte)-17, var3, Class_qd.p[var4], var1);
         } else {
            Class_fd.a(var1, (byte)-17, var3, Class_qd.p[var4], var2);
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "bj.F(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
      }
   }

   abstract void a(byte[] var1, boolean var2);

   static int a(int var0, int var1) {
      try {
         return var0 ^ var1;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "bj.E(" + var0 + 44 + var1 + 41);
      }
   }

   static final Class_mk a(int var0, int var1, int var2) {
      Class_aa var3 = Class_ck.d[var0][var1][var2];
      if (var3 == null) {
         return null;
      } else {
         Class_mk var4 = var3.z;
         var3.z = null;
         return var4;
      }
   }
}
