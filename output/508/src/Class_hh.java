import java.util.Date;

final class Class_hh implements Class_ie {
   static int a;
   static int b;
   static int c;
   static Class_c d = new Class_c();
   static int e;
   static int f;
   static int g;
   static int h = 100;
   static int i = 0;
   static int[] j = new int[]{1, 1, 1, 1};
   static Class_r k = Class_hh.m;
   static int l;
   private static Class_r m = Class_tc.a(43, " ");

   public final Class_r a(int var1, byte var2, long var3, int[] var5) {
      try {
         f++;
         if (~var1 == -1) {
            Class_cd var8 = Class_pe.b(var2 + -1, var5[0]);
            return var8.b((byte)-113, (int)var3);
         } else if (var2 != 22) {
            return null;
         } else if (~var1 != -2 && var1 != 10) {
            return var1 != 6 && ~var1 != -8 ? null : Class_pe.b(21, var5[0]).b((byte)-112, (int)var3);
         } else {
            Class_cf var6 = Class_ra.a(-25672, (int)var3);
            return var6.J;
         }
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "hh.A(" + var1 + ',' + var2 + ',' + var3 + ',' + (var5 != null ? "{...}" : "null") + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(long var0, byte var2) {
      int var7 = client.lb;

      try {
         g++;
         if (var0 != 0L) {
            if (~Class_ok.bb <= -101) {
               Class_he.a(Class_hk.S, -88, Class_id.m, 0);
            } else {
               Class_r var3 = Class_jd.a(var0, -1).c(12688);
               int var4 = 0;
               if (var7 != 0 || ~Class_ok.bb < ~var4) {
                  do {
                     if (~var0 == ~Class_sg.rb[var4]) {
                        Class_he.a(Class_hk.S, -88, Class_o.a(2, new Class_r[]{var3, Class_lg.h}), 0);
                        return;
                     }
                  } while (~Class_ok.bb < ~(++var4));
               }

               int var6 = 9 / ((-19 - var2) / 57);
               int var5 = 0;
               if (var7 != 0) {
                  if (~Class_ma.hb[var5] == ~var0) {
                     Class_he.a(Class_hk.S, 125, Class_o.a(2, new Class_r[]{Class_rd.ab, var3, Class_wc.O}), 0);
                     return;
                  }

                  var5++;
               }

               while (Class_ek.n > var5) {
                  if (~Class_ma.hb[var5] == ~var0) {
                     Class_he.a(Class_hk.S, 125, Class_o.a(2, new Class_r[]{Class_rd.ab, var3, Class_wc.O}), 0);
                     return;
                  }

                  var5++;
               }

               if (var3.a(Class_gg.B.Zb, (byte)103)) {
                  Class_he.a(Class_hk.S, -99, Class_wb.a, 0);
               } else {
                  Class_sg.rb[Class_ok.bb] = var0;
                  Class_dc.D[Class_ok.bb++] = Class_jd.a(var0, -1);
                  Class_vf.l = Class_qd.F;
                  Class_cj.S.o(-121, 61);
                  e++;
                  Class_cj.S.a(true, var0);
               }
            }
         }
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "hh.E(" + var0 + ',' + var2 + ')');
      }
   }

   static final void a(Class_ta var0, int var1, int var2) {
      int var4 = client.lb;

      try {
         label58: {
            a++;
            if (~Class_be.C <= ~var0.W) {
               if (Class_be.C > var0.t) {
                  Class_jf.a(var0, true);
                  if (var4 == 0) {
                     break label58;
                  }
               }

               Class_cg.a(128, var0);
               if (var4 == 0) {
                  break label58;
               }
            }

            Class_eh.a((byte)126, var0);
         }

         if (var1 == 128) {
            if (~var0.hb > -129 || var0.J < 128 || ~var0.hb <= -13185 || var0.J >= 13184) {
               var0.t = 0;
               var0.J = var0.qb[0] * 128 - -(var0.Q * 64);
               var0.Y = -1;
               var0.W = 0;
               var0.hb = 64 * var0.Q + 128 * var0.v[0];
               var0.ob = -1;
               var0.e(var1 + -128);
            }

            if (var0 == Class_gg.B && (~var0.hb > -1537 || ~var0.J > -1537 || ~var0.hb <= -11777 || ~var0.J <= -11777)) {
               var0.Y = -1;
               var0.W = 0;
               var0.J = 128 * var0.qb[0] + 64 * var0.Q;
               var0.t = 0;
               var0.hb = 64 * var0.Q + var0.v[0] * 128;
               var0.ob = -1;
               var0.e(0);
            }

            Class_wh.a(var1 + 19978, var0);
            Class_mi.a(var0, 1);
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "hh.B(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ')');
      }
   }

   static final Class_r a(int var0, long var1) {
      try {
         Class_mb.u.setTime(new Date(var1));
         int var3 = Class_mb.u.get(7);
         if (var0 >= -102) {
            i = -26;
         }

         int var4 = Class_mb.u.get(5);
         c++;
         int var5 = Class_mb.u.get(2);
         int var6 = Class_mb.u.get(1);
         int var7 = Class_mb.u.get(11);
         int var8 = Class_mb.u.get(12);
         int var9 = Class_mb.u.get(13);
         return Class_o.a(
            2,
            new Class_r[]{
               Class_bg.d[var3 - 1],
               Class_pf.h,
               Class_og.b(var4 / 10, 0),
               Class_og.b(var4 % 10, 0),
               Class_nf.D,
               Class_ea.R[var5],
               Class_nf.D,
               Class_og.b(var6, 0),
               Class_fe.P,
               Class_og.b(var7 / 10, 0),
               Class_og.b(var7 % 10, 0),
               Class_bh.f,
               Class_og.b(var8 / 10, 0),
               Class_og.b(var8 % 10, 0),
               Class_bh.f,
               Class_og.b(var9 / 10, 0),
               Class_og.b(var9 % 10, 0),
               Class_g.f
            }
         );
      } catch (RuntimeException var10) {
         throw Class_sh.a(var10, "hh.C(" + var0 + ',' + var1 + ')');
      }
   }

   static final void a(int var0, int var1, int var2, int var3) {
      try {
         b++;
         Class_r var4 = Class_o.a(
            2,
            new Class_r[]{
               Class_jk.x,
               Class_og.b(var1, 0),
               Class_sf.c,
               Class_og.b(var0 >> 1784452358, 0),
               Class_sf.c,
               Class_og.b(var2 >> 436238662, 0),
               Class_sf.c,
               Class_og.b(63 & var0, var3 + -24867),
               Class_sf.c,
               Class_og.b(63 & var2, 0)
            }
         );
         var4.b((byte)112);
         if (var3 != 24867) {
            d = null;
         }

         Class_h.a(var4, (byte)1);
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "hh.D(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   public Class_hh() {
   }

   public static void a(int var0) {
      try {
         m = null;
         if (var0 != 10) {
            a(117L, (byte)123);
         }

         j = null;
         d = null;
         k = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "hh.F(" + var0 + ')');
      }
   }
}
