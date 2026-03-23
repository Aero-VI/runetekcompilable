final class Class_v extends Class_li {
   static Class_r p = Class_tc.a(43, "");
   byte[] q;
   static int r;
   static Class_jk s;
   static Class_ba[] t = new Class_ba[500];
   static int u;
   Class_p v;
   static Class_r w = Class_tc.a(43, "event_opbase");
   static int[] x;
   static int y;
   static int z = 99;
   Class_sg A;
   static int B;
   int C;

   static final boolean a(byte var0) {
      try {
         u++;
         Class_vf var2 = Class_lc.a;
         boolean var1;
         synchronized (var2) {
            if (Class_mb.s == Class_rj.K) {
               return false;
            }

            Class_jg.e = Class_qd.q[Class_mb.s];
            Class_ta.I = Class_ke.n[Class_mb.s];
            Class_mb.s = 127 & 1 + Class_mb.s;
            if (var0 != 111) {
               return false;
            }

            var1 = true;
         }

         return var1;
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "v.D(" + var0 + ')');
      }
   }

   public static void d(int var0) {
      try {
         t = null;
         x = null;
         p = null;
         int var1 = -53 % ((var0 - 33) / 49);
         s = null;
         w = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "v.B(" + var0 + ')');
      }
   }

   static final void a(int var0, byte var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      try {
         label55: {
            y++;
            if (var4 < Class_ga.v
               || ~var4 < ~Class_tg.r
               || Class_ga.v > var0
               || var0 > Class_tg.r
               || var9 < Class_ga.v
               || var9 > Class_tg.r
               || var5 < Class_ga.v
               || ~Class_tg.r > ~var5
               || Class_ff.d > var2
               || Class_hh.h < var2
               || Class_ff.d > var3
               || ~Class_hh.h > ~var3
               || ~var6 > ~Class_ff.d
               || Class_hh.h < var6
               || Class_ff.d > var8
               || var8 > Class_hh.h) {
               Class_bb.a(var2, var9, var0, 1580177356, var8, var6, var3, var5, var4, var7);
               if (client.lb == 0) {
                  break label55;
               }
            }

            Class_mb.a(var5, -99, var6, var0, var2, var4, var7, var3, var9, var8);
         }

         if (var1 > -80) {
            p = null;
         }
      } catch (RuntimeException var11) {
         throw Class_sh.a(
            var11, "v.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ')'
         );
      }
   }

   static final void a(Class_sg var0, byte var1, Class_p var2, int var3) {
      try {
         r++;
         Class_v var4 = new Class_v();
         int var5 = 4 / ((-78 - var1) / 32);
         var4.C = 1;
         var4.A = var0;
         var4.a = var3;
         var4.v = var2;
         Class_c var6 = Class_jb.V;
         synchronized (var6) {
            Class_jb.V.a(var4, true);
         }

         Class_kj.d(600);
      } catch (RuntimeException var10) {
         throw Class_sh.a(var10, "v.C(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
      }
   }

   public Class_v() {
   }
}
