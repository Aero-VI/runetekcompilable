final class Class_de {
   static int a;
   static Class_r b = Class_tc.a(43, " )2> <col=ff9040>");
   static int c;
   static Class_cj d;
   static int e;
   static int f;
   static int g;
   static int h = 0;
   static int i;

   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         f++;
         if (Class_oj.b(var1, (byte)-2)) {
            client.a(Class_ve.ab[var1], -1, var6, var3, var2, var7, var5, var4);
            if (var0 > -1) {
               h = -98;
            }
         }
      } catch (RuntimeException var9) {
         throw Class_sh.a(var9, "de.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
      }
   }

   public static void a(int var0) {
      try {
         b = null;
         d = null;
         if (var0 != 0) {
            g = -33;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "de.B(" + var0 + ')');
      }
   }

   static final void a(Class_r var0, int var1, Class_r var2, int var3, int var4, Class_r var5) {
      try {
         for (int var6 = 99; ~var6 < -1; var6--) {
            Class_wi.Y[var6] = Class_wi.Y[-1 + var6];
            Class_pi.tb[var6] = Class_pi.tb[var6 + -1];
            Class_uc.K[var6] = Class_uc.K[-1 + var6];
            Class_jk.v[var6] = Class_jk.v[var6 - 1];
            Class_fk.fb[var6] = Class_fk.fb[var6 - 1];
         }

         Class_pi.tb[0] = var2;
         Class_uc.K[0] = var5;
         if (var1 == -19596) {
            Class_cd.N = Class_qd.F;
            Class_wi.Y[0] = var4;
            Class_ck.e++;
            c++;
            Class_fk.fb[0] = var3;
            Class_jk.v[0] = var0;
         }
      } catch (RuntimeException var7) {
         throw Class_sh.a(
            var7,
            "de.D("
               + (var0 != null ? "{...}" : "null")
               + ','
               + var1
               + ','
               + (var2 != null ? "{...}" : "null")
               + ','
               + var3
               + ','
               + var4
               + ','
               + (var5 != null ? "{...}" : "null")
               + ')'
         );
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(boolean var0, Class_r var1, boolean var2) {
      int var9 = client.lb;

      try {
         a++;
         var1 = var1.f((byte)111);
         short[] var3 = new short[16];
         if (var0) {
            int var4 = 0;
            int var5 = 0;
            if (var9 != 0 || Class_bi.j > var5) {
               do {
                  Class_cf var6 = Class_ra.a(-25672, var5);
                  if ((!var2 || var6.N) && var6.gb == -1 && var6.m == -1 && (~var6.o == -1 || var9 != 0) && ~var6.J.f((byte)-99).a(-128, var1) != 0) {
                     if (~var4 <= -251) {
                        Class_fi.p = -1;
                        Class_bh.a = null;
                        return;
                     }

                     if (var3.length <= var4) {
                        short[] var7 = new short[var3.length * 2];
                        int var8 = 0;
                        if (var9 != 0) {
                           var7[var8] = var3[var8];
                           var8++;
                        }

                        while (~var4 < ~var8) {
                           var7[var8] = var3[var8];
                           var8++;
                        }

                        var3 = var7;
                     }

                     var3[var4++] = (short)var5;
                  }
               } while (Class_bi.j > ++var5);
            }

            Class_bh.a = var3;
            Class_fi.p = var4;
            Class_qb.p = 0;
            Class_r[] var11 = new Class_r[Class_fi.p];
            int var12 = 0;
            if (var9 == 0 && Class_fi.p <= var12) {
               Class_ak.a(var11, Class_bh.a, -122);
            } else {
               do {
                  var11[var12] = Class_ra.a(-25672, var3[var12]).J;
               } while (Class_fi.p > ++var12);

               Class_ak.a(var11, Class_bh.a, -122);
            }
         }
      } catch (RuntimeException var10) {
         throw Class_sh.a(var10, "de.A(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
      }
   }
}
