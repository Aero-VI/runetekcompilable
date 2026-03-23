final class Class_lj {
   static volatile boolean a = true;
   int b;
   static int c;
   static Class_r d = Class_lj.n;
   static boolean[] e = new boolean[5];
   int f;
   static int g;
   static byte[][] h;
   static Class_ra i = null;
   Class_a j;
   long k = 0L;
   static Class_r l = Class_tc.a(43, "(Y<)4col>");
   static int m = 0;
   private static Class_r n = Class_tc.a(43, "white:");
   static int o;
   static int p = -1;
   int q;
   int r;
   static Class_r s = null;
   int t;
   int u;
   int v;
   int w;
   int x;
   static int[] y = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
   static int z;
   static Class_r A = n;
   int B;
   static int C;
   int D;

   static final int a(int var0, int var1, int var2) {
      try {
         if (var0 != 503159455) {
            a((byte)112);
         }

         C++;
         int var3 = var2 >>> 503159455;
         return -var3 + (var3 + var2) / var1;
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "lj.C(" + var0 + 44 + var1 + 44 + var2 + 41);
      }
   }

   static final void a(int var0) {
      try {
         Class_u.d((byte)108);
         c++;
         System.gc();
         Class_ca.a(var0, (byte)-68);
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "lj.A(" + var0 + ')');
      }
   }

   static final void a(Class_lh var0, int var1) {
      try {
         z++;
         if (Class_db.T != null) {
            try {
               Class_db.T.a(0L, var1 + -23);
               Class_db.T.a(24, 0, var0.p, var0.E);
            } catch (Exception var3) {
            }
         }

         var0.p += var1;
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "lj.E(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
      }
   }

   static final void a(byte var0) {
      try {
         Class_rg.W.b((byte)94);
         int var1 = 60 / ((-53 - var0) / 38);
         o++;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "lj.B(" + var0 + ')');
      }
   }

   public Class_lj() {
   }

   public static void b(int var0) {
      try {
         s = null;
         A = null;
         if (var0 != 24) {
            y = null;
         }

         n = null;
         y = null;
         h = null;
         l = null;
         d = null;
         e = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "lj.D(" + var0 + ')');
      }
   }
}
