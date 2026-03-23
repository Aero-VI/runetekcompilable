final class Class_jj {
   static int a;
   static int b;
   static Class_r c = Class_tc.a(43, "overlay");
   static int d;
   static int e;

   static final void a(Class_p var0, Class_sg var1, int var2, int var3) {
      try {
         a++;
         byte[] var4 = null;
         Class_c var5 = Class_jb.V;
         synchronized (var5) {
            for (Class_v var7 = (Class_v)Class_jb.V.e((byte)76); var7 != null; var7 = (Class_v)Class_jb.V.c((byte)-128)) {
               if (var3 == var7.a && var0 == var7.v && var7.C == 0) {
                  var4 = var7.q;
                  break;
               }
            }
         }

         if (var4 != null) {
            var1.a(-71, true, var4, var0, var3);
         } else {
            if (var2 != 1) {
               a(5);
            }

            byte[] var12 = var0.a(var3, true);
            var1.a(-44, true, var12, var0, var3);
         }
      } catch (RuntimeException var11) {
         throw Class_sh.a(var11, "jj.C(" + (var0 != null ? "{...}" : "null") + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   static final void a(int var0, int var1) {
      try {
         b++;
         if (var0 == -1) {
            if (Class_tj.s == null || ~Class_tj.s.length > ~var1) {
               Class_tj.s = new int[var1];
            }
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "jj.D(" + var0 + ',' + var1 + ')');
      }
   }

   public static void a(int var0) {
      try {
         if (var0 == -1) {
            c = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "jj.A(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(Class_r[] var0, short[] var1, int var2, boolean var3, int var4) {
      int var12 = client.lb;

      try {
         if (~var2 < ~var4) {
            int var5 = (var4 + var2) / 2;
            int var6 = var4;
            Class_r var7 = var0[var5];
            var0[var5] = var0[var2];
            var0[var2] = var7;
            short var8 = var1[var5];
            var1[var5] = var1[var2];
            var1[var2] = var8;
            int var9 = var4;
            if (var12 != 0 || var2 > var4) {
               do {
                  if (var7 != null) {
                     if (var0[var9] == null) {
                        var9++;
                        continue;
                     }

                     if (~var0[var9].b(var3, var7) <= ~(var9 & 1)) {
                        var9++;
                        continue;
                     }
                  }

                  Class_r var10 = var0[var9];
                  var0[var9] = var0[var6];
                  var0[var6] = var10;
                  short var11 = var1[var9];
                  var1[var9] = var1[var6];
                  var1[var6++] = var11;
                  var9++;
               } while (var2 > var9);
            }

            var0[var2] = var0[var6];
            var0[var6] = var7;
            var1[var2] = var1[var6];
            var1[var6] = var8;
            a(var0, var1, var6 + -1, var3, var4);
            a(var0, var1, var2, false, var6 + 1);
         }

         e++;
         if (var3) {
            a(93);
         }
      } catch (RuntimeException var13) {
         throw Class_sh.a(
            var13, "jj.B(" + (var0 != null ? "{...}" : "null") + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + var4 + ')'
         );
      }
   }
}
