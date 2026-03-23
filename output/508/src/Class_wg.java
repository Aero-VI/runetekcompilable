final class Class_wg {
   static int a;
   static int b;
   static int c;
   static Class_c d = new Class_c();
   private static Class_r e = Class_tc.a(43, " has logged in)3");
   static Class_r[] f = new Class_r[8];
   static Class_r g = e;
   static int h = 0;
   static int i;
   static Class_r j = Class_tc.a(43, ":trade:");

   static final void a(byte var0) {
      int var9 = client.lb;

      try {
         i++;
         Class_tg.a(Class_ff.e, -127);
         Class_vg.L++;
         if (Class_wa.C && Class_nf.J) {
            int var1 = Class_pj.c;
            var1 -= Class_oj.W;
            if (~Class_vh.nb < ~var1) {
               var1 = Class_vh.nb;
            }

            int var2 = Class_bh.k;
            var2 -= Class_jf.a;
            if (~Class_tg.c < ~var2) {
               var2 = Class_tg.c;
            }

            if (Class_ff.e.Gc + var1 > Class_vh.nb + Class_ka.mb.Gc) {
               var1 = Class_ka.mb.Gc + (Class_vh.nb - Class_ff.e.Gc);
            }

            if (var0 > -112) {
               j = null;
            }

            if (~(Class_tg.c - -Class_ka.mb.nc) > ~(var2 - -Class_ff.e.nc)) {
               var2 = Class_ka.mb.nc + Class_tg.c + -Class_ff.e.nc;
            }

            int var3 = var1 - Class_hk.H;
            int var4 = -Class_ck.a + var2;
            int var5 = Class_ff.e.kc;
            if (Class_ff.e.Xc < Class_vg.L && (~var5 > ~var3 || ~var3 > ~(-var5) || var4 > var5 || ~(-var5) < ~var4)) {
               Class_bj.d = true;
            }

            int var6 = Class_ka.mb.Nb + var1 - Class_vh.nb;
            int var7 = Class_ka.mb.kb + -Class_tg.c + var2;
            if (Class_ff.e.Z != null && Class_bj.d) {
               Class_wj var8 = new Class_wj();
               var8.s = var7;
               var8.x = Class_ff.e.Z;
               var8.B = var6;
               var8.z = Class_ff.e;
               Class_j.a(var8, 16);
            }

            if (Class_mi.T == 0) {
               label104: {
                  if (Class_bj.d) {
                     if (Class_ff.e.w != null) {
                        Class_wj var13 = new Class_wj();
                        var13.F = Class_a.h;
                        var13.s = var7;
                        var13.x = Class_ff.e.w;
                        var13.z = Class_ff.e;
                        var13.B = var6;
                        Class_j.a(var13, 16);
                     }

                     if (Class_a.h == null || client.a(Class_ff.e) == null) {
                        break label104;
                     }

                     Class_cj.S.o(68, 179);
                     Class_ub.a++;
                     Class_cj.S.g(544537784, Class_a.h.K);
                     Class_cj.S.g(544537784, Class_ff.e.K);
                     Class_cj.S.a(false, Class_ff.e.hc);
                     Class_cj.S.b(Class_a.h.hc, (byte)38);
                     if (var9 == 0) {
                        break label104;
                     }
                  }

                  if ((Class_bi.e == 1 || Class_ra.a((byte)-126, -1 + Class_ma.ib)) && ~Class_ma.ib < -3) {
                     Class_la.d((byte)-25);
                     if (var9 == 0) {
                        break label104;
                     }
                  }

                  if (~Class_ma.ib < -1) {
                     Class_wi.d((byte)49);
                  }
               }

               Class_ff.e = null;
            }
         } else {
            if (~Class_vg.L < -2) {
               Class_ff.e = null;
            }
         }
      } catch (RuntimeException var10) {
         throw Class_sh.a(var10, "wg.A(" + var0 + ')');
      }
   }

   static final boolean a(int var0) {
      try {
         a++;
         if (var0 != Class_hj.db) {
            try {
               Class_sb.m.a(Class_rj.J.g, (byte)-123);
               return true;
            } catch (Throwable var2) {
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "wg.D(" + var0 + ')');
      }
   }

   public static void b(int var0) {
      try {
         g = null;
         f = null;
         if (var0 != 0) {
            d = null;
         }

         d = null;
         j = null;
         e = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "wg.B(" + var0 + ')');
      }
   }

   static final Class_jb[] a(int var0, int var1, int var2, Class_cj var3) {
      try {
         c++;
         if (var0 != 0) {
            a(-51);
         }

         return !Class_ve.a(-29381, var1, var3, var2) ? null : Class_vi.e((byte)15);
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "wg.E(" + var0 + ',' + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
      }
   }

   static final void a(int var0, int var1, int var2, int var3, byte var4) {
      try {
         int var5 = 0;
         if (var4 >= -25) {
            b(-89);
         }

         for (; ~var5 > ~Class_jd.c; var5++) {
            if (~var0 > ~(Class_sd.f[var5] - -Class_cf.X[var5])
               && Class_sd.f[var5] < var2 + var0
               && Class_fa.pc[var5] + Class_mc.g[var5] > var1
               && ~Class_mc.g[var5] > ~(var1 - -var3)) {
               Class_vb.j[var5] = true;
            }
         }

         b++;
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "wg.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
      }
   }
}
