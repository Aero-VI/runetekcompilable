final class Class_rc {
   static int a;
   static Class_r b = Class_tc.a(43, "blinken2:");
   static int c;
   static Class_r d = Class_tc.a(43, "weiss:");
   static int e;
   static Class_r f = Class_tc.a(43, "loc");
   static Class_r g = Class_tc.a(43, "<br>(X100(U(Y");
   static int h = (int)(33.0 * Math.random()) + -16;
   static int i = -1;

   public static void a(int var0) {
      try {
         d = null;
         b = null;
         g = null;
         if (var0 != -31601) {
            f = null;
         }

         f = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "rc.A(" + var0 + ')');
      }
   }

   static final void a(int var0, int var1, Class_eh var2, int var3) {
      try {
         if (var0 == 0) {
            label49: {
               if (var2.ob == var1 && var1 != -1) {
                  Class_uc var4 = Class_kk.a((byte)-36, var1);
                  int var5 = var4.E;
                  if (~var5 == -2) {
                     var2.u = 0;
                     var2.R = var3;
                     var2.V = 0;
                     var2.cb = 0;
                     Class_h.a(false, var2.u, var2.hb, var4, false, var2.J);
                  }

                  if (~var5 != -3) {
                     break label49;
                  }

                  var2.V = 0;
                  if (client.lb == 0) {
                     break label49;
                  }
               }

               if (var1 == -1 || ~var2.ob == 0 || ~Class_kk.a((byte)-36, var1).t <= ~Class_kk.a((byte)-36, var2.ob).t) {
                  var2.db = var2.zb;
                  var2.V = 0;
                  var2.u = 0;
                  var2.ob = var1;
                  var2.R = var3;
                  var2.cb = 0;
                  if (~var2.ob != 0) {
                     Class_h.a(false, var2.u, var2.hb, Class_kk.a((byte)-36, var2.ob), false, var2.J);
                  }
               }
            }

            c++;
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "rc.B(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
      }
   }
}
