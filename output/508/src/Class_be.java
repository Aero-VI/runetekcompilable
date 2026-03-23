final class Class_be extends Class_li {
   static Class_r p = Class_be.z;
   int q;
   static int r;
   static int s;
   int t;
   static Class_r u = Class_tc.a(43, " <col=ffff00>");
   static int v = 0;
   static int w;
   static Class_r x = Class_be.z;
   boolean y = false;
   private static Class_r z = Class_tc.a(43, "wave2:");
   static int A;
   static int B;
   static int C = 0;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(byte var0) {
      int var8 = client.lb;

      try {
         if (Class_wf.k != null) {
            Class_wf.k.b(-20);
            Class_wf.k = null;
         }

         B++;
         Class_cc.t(137);
         Class_db.a();
         int var1 = 0;
         if (var8 != 0) {
            Class_sj.j[var1].a(false);
            var1++;
         }

         while (var1 < 4) {
            Class_sj.j[var1].a(false);
            var1++;
         }

         if (var0 > -104) {
            a(true);
         }

         Class_u.d((byte)108);
         System.gc();
         Class_lf.a(2, (byte)127);
         Class_rc.i = -1;
         Class_vf.i = false;
         Class_ab.b(0, true);
         Class_va.ab = 0;
         Class_fj.e = 0;
         Class_fj.b = false;
         int var2 = 0;
         if (var8 != 0) {
            Class_fd.d[var2] = null;
            var2++;
         }

         while (~var2 > ~Class_fd.d.length) {
            Class_fd.d[var2] = null;
            var2++;
         }

         Class_ke.p = 0;
         client.ib = 0;
         int var3 = 0;
         if (var8 != 0) {
            Class_db.Q[var3] = null;
            Class_aa.q[var3] = null;
            var3++;
         }

         while (var3 < 2048) {
            Class_db.Q[var3] = null;
            Class_aa.q[var3] = null;
            var3++;
         }

         int var4 = 0;
         if (var8 != 0 || var4 < 32768) {
            do {
               Class_rf.a[var4] = null;
            } while (++var4 < 32768);
         }

         int var5 = 0;
         if (var8 == 0 && ~var5 <= -5) {
            Class_fa.g(64);
         } else {
            do {
               int var6 = 0;
               if (var8 != 0 || ~var6 > -105) {
                  do {
                     int var7 = 0;
                     if (var8 != 0 || var7 < 104) {
                        do {
                           Class_ha.od[var5][var6][var7] = null;
                        } while (++var7 < 104);
                     }
                  } while (~(++var6) > -105);
               }
            } while (~(++var5) > -5);

            Class_fa.g(64);
         }
      } catch (RuntimeException var9) {
         throw Class_sh.a(var9, "be.B(" + var0 + ')');
      }
   }

   static final void a(int var0, int var1, byte var2, Class_r var3, short var4, Class_r var5, long var6) {
      try {
         w++;
         if (var2 > -51) {
            d(-54);
         }

         if (!Class_ui.h) {
            if (Class_ma.ib < 500) {
               Class_tj.u[Class_ma.ib] = var5;
               Class_fb.h[Class_ma.ib] = var3;
               Class_dd.I[Class_ma.ib] = var4;
               Class_ih.bb[Class_ma.ib] = var6;
               Class_g.i[Class_ma.ib] = var0;
               Class_vh.pb[Class_ma.ib] = var1;
               Class_ma.ib++;
            }
         }
      } catch (RuntimeException var9) {
         throw Class_sh.a(
            var9,
            "be.D("
               + var0
               + ','
               + var1
               + ','
               + var2
               + ','
               + (var3 != null ? "{...}" : "null")
               + ','
               + var4
               + ','
               + (var5 != null ? "{...}" : "null")
               + ','
               + var6
               + ')'
         );
      }
   }

   public static void a(boolean var0) {
      try {
         x = null;
         if (var0) {
            p = null;
            z = null;
            u = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "be.A(" + var0 + ')');
      }
   }

   static final void d(int var0) {
      try {
         s++;
         if (var0 == 0) {
            Class_pj.b.b((byte)94);
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "be.E(" + var0 + ')');
      }
   }

   static final boolean b(int var0, int var1) {
      try {
         r++;
         return var1 != 1 ? false : (1 & var0) != 0;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "be.C(" + var0 + ',' + var1 + ')');
      }
   }

   public Class_be() {
   }
}
