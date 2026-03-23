import java.security.MessageDigest;

final class Class_ka extends Class_ok {
   static Class_r Q = Class_tc.a(43, ":clanreq:");
   static Class_r ib = Class_ka.lb;
   static int jb;
   static Class_r kb = Class_ka.nb;
   private static Class_r lb = Class_tc.a(43, "Created gameworld");
   static Class_ha mb = null;
   private static Class_r nb = Class_tc.a(43, "Choose Option");
   static int[] ob = new int[]{0, 1, 2, 3};
   static int pb;
   static int qb;
   static int rb;
   static Class_r sb = Class_tc.a(43, "Ablegen");

   public static void d(byte var0) {
      try {
         ob = null;
         sb = null;
         Q = null;
         kb = null;
         mb = null;
         nb = null;
         ib = null;
         lb = null;
         if (var0 != -27) {
            lb = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ka.B(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int[][] a(int var1, boolean var2) {
      int var10 = client.lb;

      try {
         if (!var2) {
            return null;
         } else {
            jb++;
            int[][] var3 = super.K.a(var1, (byte)-99);
            if (super.K.q && this.g(0)) {
               int[] var4 = var3[0];
               int[] var5 = var3[1];
               int[] var6 = var3[2];
               int var7 = var1 % super.cb * super.cb;
               int var8 = 0;
               if (var10 != 0 || Class_ld.X > var8) {
                  do {
                     int var9 = super.T[var7 - -(var8 % super.db)];
                     var6[var8] = Class_ui.a(255, var9) << 2143947524;
                     var5[var8] = Class_ui.a(4080, var9 >> -299241436);
                     var4[var8] = Class_ui.a(4080, var9 >> 2135415980);
                  } while (Class_ld.X > ++var8);
               }
            }

            return var3;
         }
      } catch (RuntimeException var11) {
         throw Class_sh.a(var11, "ka.A(" + var1 + ',' + var2 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final boolean a(byte var0, Class_r var1) {
      int var10 = client.lb;

      try {
         rb++;

         try {
            int var2 = var1.b((byte)-124, 44);
            if (~var2 == 0) {
               return false;
            } else {
               Class_r var3 = var1.a(0, (byte)-74, var2);
               Class_r var4 = var1.b(var2 - -1, true);
               MessageDigest var5 = MessageDigest.getInstance("SHA");
               var5.reset();
               var5.update(var3.a((byte)-124));
               byte[] var6 = var5.digest();
               byte[] var7 = var4.e((byte)24);
               Class_lh var8 = new Class_lh(5000);
               var8.a(var7.length, (byte)118, 0, var7);
               var8.p = 0;
               var8.a(Class_tj.o, (byte)-88, Class_di.U);
               if (var8.E[0] != 1) {
                  return false;
               } else {
                  if (var0 >= -87) {
                     sb = null;
                  }

                  int var9 = 0;
                  if (var10 == 0 && ~var9 <= -21) {
                     return true;
                  } else {
                     while (var6[var9] == var8.E[var9 + 1]) {
                        if (~(++var9) <= -21) {
                           return true;
                        }
                     }

                     return false;
                  }
               }
            }
         } catch (Exception var11) {
            return false;
         }
      } catch (RuntimeException var12) {
         throw Class_sh.a(var12, "ka.D(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   public Class_ka() {
   }

   static final int h(int var0) {
      try {
         pb++;
         if (Class_pi.qb == 3.0) {
            return 37;
         } else {
            if (var0 != 50) {
               mb = null;
            }

            if (Class_pi.qb == 4.0) {
               return 50;
            } else {
               return Class_pi.qb == 6.0 ? 75 : 100;
            }
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ka.E(" + var0 + 41);
      }
   }

   static final Class_ic a(int var0, int var1, byte var2) {
      try {
         qb++;
         if (var2 >= -119) {
            h(29);
         }

         Class_ic var3 = (Class_ic)Class_ia.jb.a((long)var1 << -506011488 | var0, -104);
         if (var3 == null) {
            var3 = new Class_ic(var1, var0);
            Class_ia.jb.a((byte)121, var3, var3.a);
         }

         return var3;
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "ka.C(" + var0 + ',' + var1 + ',' + var2 + ')');
      }
   }
}
