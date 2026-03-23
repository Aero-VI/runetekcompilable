final class Class_ed {
   static Class_uf a;
   static Class_c b = new Class_c();
   static Class_r c = Class_tc.a(43, "Suche nach Updates )2 ");
   static int d;
   static int e = 0;
   static int f;
   static int g = 0;
   static int h;
   static int[] i = new int[25];
   static int j;
   static Class_wh k = new Class_wh();
   static Class_r l = Class_tc.a(43, "W-=hlen Sie eine Option");
   static int m = 0;
   static boolean n = false;

   public static void a(int var0) {
      try {
         l = null;
         c = null;
         i = null;
         b = null;
         k = null;
         if (var0 != 0) {
            j = 122;
         }

         a = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ed.A(" + var0 + ')');
      }
   }

   static final void a(byte var0) {
      try {
         f++;
         if (var0 == 113) {
            Class_nd.hb++;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ed.B(" + var0 + ')');
      }
   }

   static final void a(int var0, Class_ha var1) {
      try {
         h++;
         if (var0 > -124) {
            a((byte)-9);
         }

         int var3;
         int var4;
         label25: {
            Class_ha var2 = Class_fe.a((byte)126, var1);
            if (var2 != null) {
               var4 = var2.nc;
               var3 = var2.Gc;
               if (client.lb == 0) {
                  break label25;
               }
            }

            var4 = Class_fk.R;
            var3 = Class_l.u;
         }

         Class_fh.a(false, 123, var4, var3, var1);
         Class_qj.a(var4, var1, var3, -1198502738);
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "ed.C(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
      }
   }
}
