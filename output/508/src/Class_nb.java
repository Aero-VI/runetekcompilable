final class Class_nb {
   static Class_r a = Class_tc.a(43, "lila:");
   static Class_sg b;
   static Class_r c = Class_nb.e;
   static int d;
   private static Class_r e = Class_tc.a(43, "Ok");
   static int f;
   static int g;
   static int[] h;
   static int i;
   static int j;

   static final void a(int var0) {
      try {
         if (var0 <= 26) {
            a(55);
         }

         i++;
         Class_jc.v.b((byte)94);
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "nb.D(" + var0 + ')');
      }
   }

   public static void b(int var0) {
      try {
         e = null;
         c = null;
         h = null;
         b = null;
         a = null;
         if (var0 != 5756) {
            b = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "nb.E(" + var0 + ')');
      }
   }

   static final void a(int var0, int var1) {
      try {
         d++;
         if (var1 == Class_mb.y) {
            Class_fc.t.a((byte)-114, var0);
         } else {
            Class_lg.l = var0;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "nb.A(" + var0 + ',' + var1 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var15 = client.lb;

      try {
         g++;
         int var7 = var5 + var6;
         int var8 = -var6 + var4;
         int var11 = var5;
         if (var1 == 16324) {
            while (var7 > var11) {
               Class_fd.a(var2, (byte)-17, var0, Class_qd.p[var11], var3);
               var11++;
            }

            int var12 = var4;
            if (var15 != 0 || var4 > var8) {
               do {
                  Class_fd.a(var2, (byte)-17, var0, Class_qd.p[var12], var3);
               } while (--var12 > var8);
            }

            int var9 = var2 - -var6;
            int var10 = var3 + -var6;
            int var13 = var7;
            if (var15 != 0 || var7 <= var8) {
               do {
                  int[] var14 = Class_qd.p[var13];
                  Class_fd.a(var2, (byte)-17, var0, var14, var9);
                  Class_fd.a(var10, (byte)-17, var0, var14, var3);
               } while (++var13 <= var8);
            }
         }
      } catch (RuntimeException var16) {
         throw Class_sh.a(var16, "nb.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
      }
   }

   static final int a(int var0, int var1, int var2, byte var3, int var4) {
      try {
         j++;
         if (var3 != 25) {
            return -88;
         } else {
            int var5 = -Class_kd.q[1024 * var0 / var4] + 65536 >> -236413695;
            return (var2 * var5 >> 70466704) + ((65536 + -var5) * var1 >> -1130732240);
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "nb.C(" + var0 + 44 + var1 + 44 + var2 + 44 + var3 + 44 + var4 + 41);
      }
   }
}
