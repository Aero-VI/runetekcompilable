final class Class_sc {
   static Class_r a = Class_tc.a(43, " zuerst von Ihrer Ignorieren)2Liste(Q");
   static int b;
   static Class_r c = Class_tc.a(43, ":assist:");
   static int d;
   static Class_dh[] e;
   static boolean f = false;
   int g;
   int h;
   static Class_r i = Class_tc.a(43, "slr2)3ws?order=LPWM");
   static int j = 0;
   static int k;
   static int l;
   static Class_lb m;
   int n;
   static int o;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final Class_lf a(boolean var0, Class_lh var1) {
      int var7 = client.lb;

      try {
         var1.n(-6677);
         o++;
         int var2 = var1.n(-6677);
         Class_lf var3 = Class_he.a(var2, (byte)-46);
         if (!var0) {
            return null;
         } else {
            var3.N = var1.n(-6677);
            int var4 = var1.n(-6677);
            int var5 = 0;
            if (var7 != 0) {
               int var6 = var1.n(-6677);
               var3.a(var1, var6, -1);
               var5++;
            }

            while (~var4 < ~var5) {
               int var9 = var1.n(-6677);
               var3.a(var1, var9, -1);
               var5++;
            }

            var3.a((byte)-34);
            return var3;
         }
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "sc.C(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   public static void a(int var0) {
      try {
         if (var0 == 0) {
            c = null;
            m = null;
            a = null;
            e = null;
            i = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "sc.B(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var19 = client.lb;

      try {
         d++;
         if (var0 >= -101) {
            a = null;
         }

         int var11 = Class_tf.a(var3, Class_hh.h, (byte)114, Class_ff.d);
         int var12 = Class_tf.a(var2, Class_hh.h, (byte)114, Class_ff.d);
         int var13 = Class_tf.a(var5, Class_tg.r, (byte)114, Class_ga.v);
         int var14 = Class_tf.a(var1, Class_tg.r, (byte)114, Class_ga.v);
         int var7 = Class_tf.a(var3 + var4, Class_hh.h, (byte)114, Class_ff.d);
         int var8 = Class_tf.a(var2 - var4, Class_hh.h, (byte)114, Class_ff.d);
         int var15 = var11;
         if (var19 != 0) {
            Class_fd.a(var13, (byte)-17, var6, Class_qd.p[var11], var14);
            var15 = var11 + 1;
         }

         while (~var15 > ~var7) {
            Class_fd.a(var13, (byte)-17, var6, Class_qd.p[var15], var14);
            var15++;
         }

         int var16 = var12;
         if (var19 != 0 || var12 > var8) {
            do {
               Class_fd.a(var13, (byte)-17, var6, Class_qd.p[var16], var14);
            } while (--var16 > var8);
         }

         int var9 = Class_tf.a(var5 - -var4, Class_tg.r, (byte)114, Class_ga.v);
         int var10 = Class_tf.a(-var4 + var1, Class_tg.r, (byte)114, Class_ga.v);
         int var17 = var7;
         if (var19 != 0 || ~var7 >= ~var8) {
            do {
               int[] var18 = Class_qd.p[var17];
               Class_fd.a(var13, (byte)-17, var6, var18, var9);
               Class_fd.a(var10, (byte)-17, var6, var18, var14);
            } while (~(++var17) >= ~var8);
         }
      } catch (RuntimeException var20) {
         throw Class_sh.a(var20, "sc.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
      }
   }

   static final void a(int var0, int var1) {
      try {
         Class_wb.g.b(-18767, var1);
         Class_bg.o.b(-18767, var1);
         b++;
         Class_m.ib.b(var0 ^ -18767, var1);
         if (var0 != 0) {
            a(true, null);
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "sc.D(" + var0 + ',' + var1 + ')');
      }
   }

   public Class_sc() {
   }
}
