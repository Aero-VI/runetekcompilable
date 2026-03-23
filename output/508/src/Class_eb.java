final class Class_eb {
   static int a;
   static Class_r b = Class_eb.e;
   static int c;
   static int d = 0;
   private static Class_r e = Class_tc.a(43, "Attack");
   static Class_ha f = null;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, int var1, Class_r var2) {
      int var7 = client.lb;

      try {
         c++;
         Class_r var3 = var2.d(99).c(12688);
         boolean var4 = false;
         int var5 = var0;
         if (var7 != 0 || ~var0 > ~client.ib) {
            do {
               Class_fa var6 = Class_db.Q[Class_oc.q[var5]];
               if (var6 != null && var6.Zb != null && var6.Zb.a(false, var3)) {
                  var4 = true;
                  Class_ce.a(0, 0, Class_gg.B.v[0], Class_gg.B.qb[0], 1, 1, var6.qb[0], false, 0, -3, 2, var6.v[0]);
                  if (var1 == 1) {
                     Class_rg.ab++;
                     Class_cj.S.o(var0 ^ 97, 160);
                     Class_cj.S.b(Class_oc.q[var5], (byte)38);
                     if (var7 == 0) {
                        break;
                     }
                  }

                  if (~var1 == -5) {
                     Class_tc.a++;
                     Class_cj.S.o(-78, 253);
                     Class_cj.S.c((byte)19, Class_oc.q[var5]);
                     if (var7 == 0) {
                        break;
                     }
                  }

                  if (~var1 == -7) {
                     Class_fc.A++;
                     Class_cj.S.o(-64, 35);
                     Class_cj.S.c((byte)19, Class_oc.q[var5]);
                     if (var7 == 0) {
                        break;
                     }
                  }

                  if (var1 != 7) {
                     break;
                  }

                  Class_cj.S.o(-98, 93);
                  Class_cj.S.c((byte)19, Class_oc.q[var5]);
                  Class_tf.U++;
                  if (var7 == 0) {
                     break;
                  }
               }
            } while (~(++var5) > ~client.ib);
         }

         if (!var4) {
            Class_he.a(Class_hk.S, -85, Class_o.a(2, new Class_r[]{Class_oa.f, var3}), 0);
         }
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "eb.B(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
      }
   }

   public static void a(int var0) {
      try {
         b = null;
         if (var0 >= 39) {
            e = null;
            f = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "eb.A(" + var0 + ')');
      }
   }
}
