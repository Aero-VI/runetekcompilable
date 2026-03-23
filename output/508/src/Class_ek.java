final class Class_ek {
   static int a;
   static int b;
   static Class_r c = Class_ek.l;
   static Class_ha d;
   int e = 0;
   static int f = 0;
   static Class_r g = Class_tc.a(43, ")2");
   static Class_r h = Class_tc.a(43, "Lade Schrifts-=tze )2 ");
   static int i;
   static Class_r j = Class_tc.a(43, "sl_back");
   static int k;
   private static Class_r l = Class_tc.a(43, "Loading sprites )2 ");
   static int m;
   static int n = 0;
   static int o = 0;

   private final void a(Class_lh var1, int var2, int var3) {
      try {
         k++;
         if (var3 == ~var2) {
            this.e = var1.k(1355769544);
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "ek.B(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   final void a(int var1, Class_lh var2) {
      int var4 = client.lb;

      try {
         if (var1 == 0) {
            i++;

            do {
               int var3 = var2.n(-6677);
               if (var3 == 0) {
                  break;
               }

               this.a(var2, var3, -6);
            } while (var4 == 0);
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "ek.D(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
      }
   }

   static final void a(int var0) {
      try {
         if (Class_v.s != null) {
            Class_v.s.b(-81);
         }

         if (var0 >= -63) {
            a(-12, 100, 4, -112);
         }

         m++;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ek.E(" + var0 + ')');
      }
   }

   static final Class_be a(int var0, int var1, int var2, int var3) {
      try {
         b++;
         Class_be var4 = new Class_be();
         var4.q = var0;
         var4.t = var1;
         Class_nj.p.a((byte)127, var4, var3);
         Class_mk.a(var1, (byte)112);
         Class_ha var5 = Class_tf.a(var3, (byte)-80);
         if (var5 != null) {
            Class_tg.a(var5, -116);
         }

         if (Class_eb.f != null) {
            Class_tg.a(Class_eb.f, -125);
            Class_eb.f = null;
         }

         Class_ma.ib = 0;
         Class_ui.h = false;
         Class_wg.a(Class_hf.h, Class_ih.S, Class_ii.ab, Class_fb.n, (byte)-114);
         if (var5 != null) {
            Class_pi.a(-1, false, var5);
         }

         Class_mc.a(-1, var1);
         int var6 = -12 / ((var2 - 65) / 56);
         if (Class_hj.bb != -1) {
            Class_ua.a(99, Class_hj.bb, 1);
         }

         return var4;
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "ek.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   public static void a(byte var0) {
      try {
         j = null;
         g = null;
         d = null;
         c = null;
         if (var0 >= -21) {
            a(13, 66, -29, -26);
         }

         h = null;
         l = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ek.A(" + var0 + ')');
      }
   }

   public Class_ek() {
   }
}
