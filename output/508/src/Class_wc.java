final class Class_wc extends Class_pe {
   static byte[] I = new byte[32896];
   Class_fc J;
   static int K;
   static int L;
   static int M;
   static int N;
   static Class_r O;
   private static Class_r P;

   static final void c(byte var0) {
      try {
         M++;
         Class_qb.n++;
         Class_cj.S.o(-96, 42);
         if (var0 >= 81) {
            Class_cj.S.a(true, 0L);
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "wc.D(" + var0 + ')');
      }
   }

   static final void a(int var0, int var1, int var2, int var3, int var4) {
      try {
         L++;
         if (client.cb == 1) {
            Class_fg.j[Class_df.e / 100].c(Class_qd.x - 8, Class_ma.S - 8);
         }

         if (~client.cb == -3) {
            Class_fg.j[4 + Class_df.e / 100].c(Class_qd.x - 8, Class_ma.S + -8);
         }

         if (var4 != -17234) {
            a(44, -23, -41, 64, -106);
         }

         Class_dc.d(-127);
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "wc.E(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
      }
   }

   Class_wc(Class_fc var1) {
      try {
         this.J = var1;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "wc.<init>(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   public static void d(byte var0) {
      try {
         I = null;
         P = null;
         O = null;
         if (var0 < 17) {
            I = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "wc.B(" + var0 + ')');
      }
   }

   static final Class_lj a(int var0, int var1, int var2) {
      Class_aa var3 = Class_ck.d[var0][var1][var2];
      if (var3 == null) {
         return null;
      } else {
         for (int var4 = 0; var4 < var3.G; var4++) {
            Class_lj var5 = var3.H[var4];
            if ((var5.k >> 29 & 3L) == 2L && var5.v == var1 && var5.u == var2) {
               Class_ph.a(var5);
               return var5;
            }
         }

         return null;
      }
   }

   static final Class_pg a(byte var0, Class_lh var1) {
      try {
         if (var0 != 116) {
            return null;
         } else {
            K++;
            return new Class_pg(
               var1.p(-22489),
               var1.p(-22489),
               var1.p(var0 + -22605),
               var1.p(var0 + -22605),
               var1.p(var0 + -22605),
               var1.p(-22489),
               var1.p(-22489),
               var1.p(-22489),
               var1.b((byte)113),
               var1.n(-6677)
            );
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "wc.C(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   static {
      int var0 = 0;

      for (int var1 = 0; ~var1 > -257; var1++) {
         for (int var2 = 0; var1 >= var2; var2++) {
            I[var0++] = (byte)(255.0 / Math.sqrt((var1 * var1 + var2 * var2 + 65535) / 65535.0F));
         }
      }

      P = Class_tc.a(43, " from your friend list first)3");
      O = P;
   }
}
