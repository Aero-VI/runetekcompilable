final class Class_fg extends Class_mj {
   static Class_r g = Class_tc.a(43, "VOLL");
   static int h;
   static Class_r i = Class_tc.a(43, "Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");
   static Class_jb[] j;
   static Class_wa k;
   private static Class_r l = Class_tc.a(43, "FULL");
   static int m = 0;
   static boolean n = false;
   static int o = 0;
   static int p;
   static Class_r q = l;

   public static void b(byte var0) {
      try {
         g = null;
         l = null;
         int var1 = -45 % ((var0 - 82) / 42);
         k = null;
         j = null;
         q = null;
         i = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "fg.A(" + var0 + ')');
      }
   }

   static final boolean a(long var0, int var2, int var3, int var4) {
      int var12 = client.lb;

      try {
         label44: {
            int var6 = (3777847 & (int)var0) >> -2141360332;
            int var5 = (int)var0 >> 1299664686 & 31;
            h++;
            int var7 = 2147483647 & (int)(var0 >>> -107367968);
            if (var5 != 10 && ~var5 != -12 && var5 != 22) {
               Class_ce.a(var6, 1 + var5, Class_gg.B.v[0], Class_gg.B.qb[0], 0, 0, var2, true, 0, -3, 2, var4);
               if (var12 == 0) {
                  break label44;
               }
            }

            Class_ub var8;
            int var9;
            int var10;
            label45: {
               var8 = Class_qe.a(91, var7);
               if (var6 == 0 || var6 == 2) {
                  var10 = var8.C;
                  var9 = var8.D;
                  if (var12 == 0) {
                     break label45;
                  }
               }

               var9 = var8.C;
               var10 = var8.D;
            }

            int var11 = var8.F;
            if (var6 != 0) {
               var11 = (15 & var11 << var6) + (var11 >> 4 - var6);
            }

            Class_ce.a(0, 0, Class_gg.B.v[0], Class_gg.B.qb[0], var10, var9, var2, true, var11, -3, 2, var4);
         }

         Class_ma.S = Class_wb.i;
         Class_qd.x = Class_vh.rb;
         client.cb = 2;
         if (var3 != -12974) {
            q = null;
         }

         Class_df.e = 0;
         return true;
      } catch (RuntimeException var13) {
         throw Class_sh.a(var13, "fg.B(" + var0 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
      }
   }
}
