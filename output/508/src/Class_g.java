final class Class_g {
   static Class_tg a = new Class_tg(16);
   static int b;
   static int c;
   static Class_ie d = null;
   static Class_r e = Class_tc.a(43, "b12_full");
   static Class_r f = Class_tc.a(43, " GMT");
   static Class_r g = Class_tc.a(43, "null");
   static Class_r h;
   static int[] i = new int[500];
   static Class_r j = Class_tc.a(43, "Welt");

   public static void a(int var0) {
      try {
         f = null;
         g = null;
         d = null;
         if (var0 >= -66) {
            e = null;
         }

         i = null;
         e = null;
         h = null;
         a = null;
         j = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "g.C(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final boolean a(Class_r var0, boolean var1) {
      int var3 = client.lb;

      try {
         c++;
         if (var0 == null) {
            return false;
         } else {
            int var2 = 0;
            if (var3 == 0 && Class_ok.bb <= var2) {
               if (!var1) {
                  a = null;
               }

               return false;
            } else {
               while (!var0.a(false, Class_dc.D[var2])) {
                  if (Class_ok.bb <= ++var2) {
                     if (!var1) {
                        a = null;
                     }

                     return false;
                  }
               }

               return true;
            }
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "g.A(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
      }
   }

   static final void b(int var0) {
      try {
         Class_sj.g = null;
         b++;
         Class_id.l = null;
         Class_fc.C = null;
         if (var0 == 500) {
            Class_fd.c = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "g.B(" + var0 + ')');
      }
   }
}
