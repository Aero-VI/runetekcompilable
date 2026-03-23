import java.awt.Graphics;

final class Class_mg {
   static boolean a = true;
   static int b;
   static int c;
   static int d;
   static int e;
   static int f;
   static Class_lh g = new Class_lh(8);
   static Class_r h = Class_mg.n;
   static Class_r i = Class_mg.k;
   static int j;
   private static Class_r k = Class_tc.a(43, "slide:");
   static int[][][] l;
   static int[][][] m;
   private static Class_r n = Class_tc.a(43, "Loading title screen )2 ");
   static Class_r o = k;

   public static void a(int var0) {
      try {
         i = null;
         o = null;
         h = null;
         n = null;
         g = null;
         k = null;
         l = null;
         m = null;
         if (var0 > -2) {
            g = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "mg.D(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final Class_ni b(int var0) {
      int var7 = client.lb;

      try {
         d++;
         if (var0 != -14452) {
            g = null;
         }

         Object var3;
         label50: {
            byte[] var2 = Class_lj.h[0];
            int var1 = Class_ia.bb[0] * Class_ld.ib[0];
            if (!Class_kg.u[0]) {
               int[] var4 = new int[var1];
               int var5 = 0;
               if (var7 != 0 || var1 > var5) {
                  do {
                     var4[var5] = Class_ji.Y[Class_ui.a(var2[var5], 255)];
                  } while (var1 > ++var5);
               }

               var3 = new Class_ni(Class_qb.b, Class_tf.bb, Class_ae.g[0], Class_ub.L[0], Class_ia.bb[0], Class_ld.ib[0], var4);
               if (var7 == 0) {
                  break label50;
               }
            }

            byte[] var9 = Class_ad.f[0];
            int[] var10 = new int[var1];
            int var6 = 0;
            if (var7 != 0 || ~var1 < ~var6) {
               do {
                  var10[var6] = Class_mb.a(Class_ji.Y[Class_ui.a(var2[var6], 255)], Class_ui.a(255, var9[var6]) << -1318416968);
               } while (~var1 < ~(++var6));
            }

            var3 = new Class_uj(Class_qb.b, Class_tf.bb, Class_ae.g[0], Class_ub.L[0], Class_ia.bb[0], Class_ld.ib[0], var10);
         }

         Class_oe.a((byte)-93);
         return (Class_ni)var3;
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "mg.C(" + var0 + ')');
      }
   }

   static final void a(boolean var0, Class_r var1, int var2) {
      try {
         f++;
         byte var3 = 4;
         int var4 = var3 + 6;
         if (var2 != -16678) {
            a(79L, 67, 108, 3, null, -121, 64);
         }

         int var5 = 6 + var3;
         int var6 = Class_fi.A.a(var1, 250);
         int var7 = 13 * Class_fi.A.b(var1, 250);
         Class_nc.f(-var3 + var4, -var3 + var5, var3 + var3 + var6, var3 + var3 + var7, 0);
         Class_nc.a(var4 + -var3, var5 - var3, var3 + var6 - -var3, var7 - (-var3 + -var3), 16777215);
         Class_fi.A.a(var1, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
         Class_wg.a(-var3 + var4, var5 - var3, var3 + var3 + var6, var7 - -var3 + var3, (byte)-62);
         if (!var0) {
            Class_bh.a(-121, var6, var7, var4, var5);
         } else {
            try {
               Graphics var8 = Class_od.u.getGraphics();
               Class_qe.s.a(99, 0, 0, var8);
            } catch (Exception var9) {
               Class_od.u.repaint();
            }
         }
      } catch (RuntimeException var10) {
         throw Class_sh.a(var10, "mg.B(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
      }
   }

   static final int a(int var0, int var1) {
      int var22 = client.lb;

      try {
         double var2 = (var0 >> 547338608 & 0xFF) / 256.0;
         double var6 = (0xFF & var0) / 256.0;
         b++;
         int var10 = -26 % ((var1 - 61) / 33);
         double var4 = ((var0 & 65521) >> -806508568) / 256.0;
         double var13 = 0.0;
         double var8 = var2;
         if (var2 > var4) {
            var8 = var4;
         }

         if (var8 > var6) {
            var8 = var6;
         }

         double var11 = var2;
         if (var2 < var4) {
            var11 = var4;
         }

         double var15 = 0.0;
         if (var11 < var6) {
            var11 = var6;
         }

         double var17;
         int var21;
         label85: {
            var17 = (var11 + var8) / 2.0;
            var21 = (int)(256.0 * var17);
            if (~var21 > -1) {
               var21 = 0;
               if (var22 == 0) {
                  break label85;
               }
            }

            if (~var21 < -256) {
               var21 = 255;
            }
         }

         label80:
         if (var11 != var8) {
            if (var17 < 0.5) {
               var15 = (-var8 + var11) / (var8 + var11);
            }

            if (var17 >= 0.5) {
               var15 = (var11 - var8) / (-var11 + 2.0 - var8);
            }

            if (var2 == var11) {
               var13 = (-var6 + var4) / (var11 - var8);
               if (var22 == 0) {
                  break label80;
               }
            }

            if (var11 == var4) {
               var13 = 2.0 + (-var2 + var6) / (var11 - var8);
               if (var22 == 0) {
                  break label80;
               }
            }

            if (var6 == var11) {
               var13 = (-var4 + var2) / (-var8 + var11) + 4.0;
            }
         }

         int var20;
         label67: {
            var20 = (int)(var15 * 256.0);
            var13 /= 6.0;
            if (var20 < 0) {
               var20 = 0;
               if (var22 == 0) {
                  break label67;
               }
            }

            if (~var20 < -256) {
               var20 = 255;
            }
         }

         int var19 = (int)(var13 * 256.0);
         if (var21 > 243) {
            var20 >>= 4;
            if (var22 == 0) {
               return (var21 >> 1191709857) + (var20 >> -1297034779 << 1201007751) + (var19 >> -1173640894 << 1118688394);
            }
         }

         if (~var21 >= -218) {
            if (~var21 >= -193) {
               if (~var21 >= -180) {
                  return (var21 >> 1191709857) + (var20 >> -1297034779 << 1201007751) + (var19 >> -1173640894 << 1118688394);
               }

               var20 >>= 1;
               if (var22 == 0) {
                  return (var21 >> 1191709857) + (var20 >> -1297034779 << 1201007751) + (var19 >> -1173640894 << 1118688394);
               }
            }

            var20 >>= 2;
            if (var22 == 0) {
               return (var21 >> 1191709857) + (var20 >> -1297034779 << 1201007751) + (var19 >> -1173640894 << 1118688394);
            }
         }

         var20 >>= 3;
         return (var21 >> 1191709857) + (var20 >> -1297034779 << 1201007751) + (var19 >> -1173640894 << 1118688394);
      } catch (RuntimeException var23) {
         throw Class_sh.a(var23, "mg.F(" + var0 + 44 + var1 + 41);
      }
   }

   static final Class_pc c(int var0) {
      try {
         c++;
         Class_dh var1 = new Class_dh(Class_qb.b, Class_tf.bb, Class_ae.g[0], Class_ub.L[0], Class_ia.bb[0], Class_ld.ib[var0], Class_lj.h[0], Class_ji.Y);
         Class_oe.a((byte)-93);
         return var1;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "mg.A(" + var0 + ')');
      }
   }

   static final void a(long var0, int var2, int var3, int var4, Class_r var5, int var6, int var7) {
      try {
         e++;
         Class_lh var8 = new Class_lh(128);
         var8.b(32, 10);
         var8.a(false, (int)(Math.random() * 99999.0));
         var8.a(false, 508);
         var8.a(true, var0);
         var8.g(544537784, (int)(Math.random() * 9.9999999E7));
         var8.a((byte)-9, var5);
         var8.g(544537784, (int)(9.9999999E7 * Math.random()));
         var8.a(false, Class_m.kb);
         var8.b(32, var2);
         int var9 = -21 / ((-52 - var3) / 55);
         var8.b(32, var4);
         var8.g(544537784, (int)(Math.random() * 9.9999999E7));
         var8.a(false, var7);
         var8.a(false, var6);
         var8.g(544537784, (int)(9.9999999E7 * Math.random()));
         var8.a(false, Class_dc.q, Class_qd.t);
         Class_cj.S.p = 0;
         Class_cj.S.b(32, 48);
         Class_cj.S.b(32, var8.p);
         Class_cj.S.a(var8.p, (byte)118, 0, var8.E);
         Class_pi.rb = 1;
         Class_kk.o = 0;
         Class_hg.c = -3;
         Class_of.i = 0;
      } catch (RuntimeException var10) {
         throw Class_sh.a(
            var10, "mg.E(" + var0 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + (var5 != null ? "{...}" : "null") + ',' + var6 + ',' + var7 + ')'
         );
      }
   }
}
