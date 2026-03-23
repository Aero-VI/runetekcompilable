import java.io.UnsupportedEncodingException;

final class Class_d {
   int a;
   static byte[][] b;
   static int c;
   int d;
   int e;
   static int f;
   int g = -1;
   int h;
   int i;
   static int[] j = new int[]{1, 2, 4, 8};
   int k;
   static int l;
   static boolean m = true;
   int n;
   int o;

   static final int a(int var0, boolean var1) {
      try {
         l++;
         if (var1) {
            j = null;
         }

         return 0xFF & var0;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "d.D(" + var0 + 44 + var1 + 41);
      }
   }

   static final void a(int var0, int var1, int var2, int var3, Class_a var4, Class_a var5, int var6, int var7, int var8, int var9, long var10) {
      if (var4 != null) {
         Class_mk var12 = new Class_mk();
         var12.t = var10;
         var12.e = var1 * 128 + 64;
         var12.h = var2 * 128 + 64;
         var12.q = var3;
         var12.n = var4;
         var12.p = var5;
         var12.r = var6;
         var12.o = var7;
         var12.l = var8;
         var12.s = var9;

         for (int var13 = var0; var13 >= 0; var13--) {
            if (Class_ck.d[var13][var1][var2] == null) {
               Class_ck.d[var13][var1][var2] = new Class_aa(var13, var1, var2);
            }
         }

         Class_ck.d[var0][var1][var2].z = var12;
      }
   }

   public static void a(int var0) {
      try {
         if (var0 != 8) {
            m = false;
         }

         j = null;
         b = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "d.C(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final Class_r a(int var0, String var1) {
      int var5 = client.lb;

      try {
         byte[] var2;
         try {
            var2 = var1.getBytes("ISO-8859-1");
         } catch (UnsupportedEncodingException var6) {
            var2 = var1.getBytes();
         }

         Class_r var3 = new Class_r();
         var3.h = var2;
         if (var0 != 25732) {
            j = null;
         }

         var3.G = 0;
         f++;
         int var4 = 0;
         if (var5 == 0 && ~var2.length >= ~var4) {
            return var3;
         } else {
            do {
               if (~var2[var4] != -1) {
                  var2[var3.G++] = var2[var4];
               }
            } while (~var2.length < ~(++var4));

            return var3;
         }
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "d.B(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   public Class_d() {
   }
}
