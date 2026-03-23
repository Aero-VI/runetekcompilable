import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;

abstract class Class_me {
   static int a;
   static Class_r b = Class_tc.a(43, "www");
   static int c;
   static int d;
   static Class_lb e;
   static Class_r f = Class_me.r;
   int[] g;
   int h;
   static int i;
   static int j;
   static int[][][] k;
   static Class_c l = new Class_c();
   static int m;
   Image n;
   static int o;
   static int p;
   static int q;
   private static Class_r r = Class_tc.a(43, "Connection lost)3");
   static int s;
   static int t;
   static int u;
   int v;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(boolean var0) {
      int var3 = client.lb;

      try {
         m++;
         Class_ja.w = 0;
         Class_uf.U = 0;
         Class_ck.a((byte)-67);
         Class_ee.h(19114);
         Class_p.b((byte)-11);
         int var1 = 0;
         if (var3 != 0) {
            int var2 = Class_ih.R[var1];
            if (Class_rf.a[var2].vb != Class_be.C) {
               if (Class_rf.a[var2].Pb.a(0)) {
                  Class_db.a(Class_rf.a[var2], 2);
               }

               Class_rf.a[var2].Pb = null;
               Class_rf.a[var2] = null;
            }

            var1++;
         }

         for (; var1 < Class_ja.w; var1++) {
            int var5 = Class_ih.R[var1];
            if (Class_rf.a[var5].vb != Class_be.C) {
               if (Class_rf.a[var5].Pb.a(0)) {
                  Class_db.a(Class_rf.a[var5], 2);
               }

               Class_rf.a[var5].Pb = null;
               Class_rf.a[var5] = null;
            }
         }

         if (Class_sf.g != Class_f.T.p) {
            throw new RuntimeException("gnp1 pos:" + Class_f.T.p + " psize:" + Class_sf.g);
         } else {
            if (var0) {
               b = null;
            }

            int var6 = 0;
            if (var3 != 0 || ~var6 > ~Class_ke.p) {
               while (Class_rf.a[Class_kg.v[var6]] != null) {
                  if (~(++var6) <= ~Class_ke.p) {
                     return;
                  }
               }

               throw new RuntimeException("gnp2 pos:" + var6 + " size:" + Class_ke.p);
            }
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "me.J(" + var0 + ')');
      }
   }

   static final void a(int var0) {
      int var9 = client.lb;

      try {
         p++;
         int var1 = Class_id.u;
         int var2 = Class_oj.bb;
         if (var0 != 0) {
            l = null;
         }

         int var3 = Class_w.O + -Class_l.u + -var1;
         int var4 = -var2 + Class_cj.fb + -Class_fk.R;
         if (~var1 < -1 || ~var3 < -1 || ~var2 < -1 || ~var4 < -1) {
            try {
               Object var5;
               int var7;
               label49: {
                  var7 = 0;
                  if (Class_fc.p == null) {
                     if (Class_si.i != null) {
                        var5 = Class_si.i;
                        if (var9 == 0) {
                           break label49;
                        }
                     }

                     var5 = Class_rj.J.g;
                     if (var9 == 0) {
                        break label49;
                     }
                  }

                  var5 = Class_fc.p;
               }

               int var6 = 0;
               if (var5 == Class_si.i) {
                  Insets var8 = Class_si.i.getInsets();
                  var6 = var8.left;
                  var7 = var8.top;
               }

               Graphics var12 = ((java.awt.Component)var5).getGraphics();
               var12.setColor(Color.black);
               if (var1 > 0) {
                  var12.fillRect(var6, var7, var1, Class_cj.fb);
               }

               if (var2 > 0) {
                  var12.fillRect(var6, var7, Class_w.O, var2);
               }

               if (var3 > 0) {
                  var12.fillRect(var6 + Class_w.O + -var3, var7, var3, Class_cj.fb);
               }

               if (~var4 < -1) {
                  var12.fillRect(var6, Class_cj.fb + var7 + -var4, Class_w.O, var4);
                  return;
               }
            } catch (Exception var10) {
               return;
            }
         }
      } catch (RuntimeException var11) {
         throw Class_sh.a(var11, "me.A(" + var0 + ')');
      }
   }

   static final int a(Class_eh var0, boolean var1) {
      try {
         i++;
         if (var1) {
            u = 75;
         }

         Class_nd var2 = var0.Pb;
         if (var2.z != null) {
            var2 = var2.d(-94);
            if (var2 == null) {
               return -1;
            }
         }

         int var3 = var2.y;
         if (var0.w != var0.C) {
            if (var0.w == var0.M) {
               var3 = var2.nb;
            }
         } else {
            var3 = var2.x;
         }

         return var3;
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "me.N(" + (var0 != null ? "{...}" : "null") + 44 + var1 + 41);
      }
   }

   abstract void a(int var1, int var2, int var3, Graphics var4);

   public static void a(byte var0) {
      try {
         f = null;
         k = null;
         l = null;
         b = null;
         e = null;
         if (var0 < 75) {
            b(52);
         }

         r = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "me.B(" + var0 + ')');
      }
   }

   static final void b(int var0) {
      try {
         d++;
         int var1 = -15 / ((var0 - 7) / 57);
         Class_mi.P.a(-120);
         Class_id.h.a(-64);
         Class_m.V.a(-128);
         Class_vh.eb.a(-121);
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "me.O(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var16 = client.lb;

      try {
         o++;
         int var8 = var4 + var0;
         int var9 = var2 + -var0;
         int var11 = -var0 + var5;
         int var10 = var0 + var1;
         int var12 = var4;
         if (var16 != 0) {
            Class_fd.a(var1, (byte)-17, var3, Class_qd.p[var4], var5);
            var12 = var4 + 1;
         }

         while (var12 < var8) {
            Class_fd.a(var1, (byte)-17, var3, Class_qd.p[var12], var5);
            var12++;
         }

         if (var7 == -17229) {
            int var13 = var2;
            if (var16 != 0 || ~var9 > ~var2) {
               do {
                  Class_fd.a(var1, (byte)-17, var3, Class_qd.p[var13], var5);
               } while (~var9 > ~(--var13));
            }

            int var14 = var8;
            if (var16 != 0 || ~var9 <= ~var8) {
               do {
                  int[] var15 = Class_qd.p[var14];
                  Class_fd.a(var1, (byte)-17, var3, var15, var10);
                  Class_fd.a(var10, (byte)-17, var6, var15, var11);
                  Class_fd.a(var11, (byte)-17, var3, var15, var5);
               } while (~var9 <= ~(++var14));
            }
         }
      } catch (RuntimeException var17) {
         throw Class_sh.a(var17, "me.E(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
      }
   }

   static final void a(Class_r var0, int var1) {
      try {
         s++;
         int var2 = Class_se.a(64, var0);
         if (var1 != var2) {
            Class_ad.m = -Class_mb.k + Class_rf.k.b[var2];
            int var3 = Class_ad.m - (int)(Class_li.n.Gc / Class_kc.A);
            int var4 = Class_ad.m - -((int)(Class_li.n.Gc / Class_kc.A));
            Class_qd.C = Class_aa.v - Class_rf.k.e[var2] + (Class_sb.j - 1);
            int var5 = -((int)(Class_li.n.nc / Class_kc.A)) + Class_qd.C;
            if (~var3 > -1) {
               Class_ad.m = (int)(Class_li.n.Gc / Class_kc.A);
            }

            if (~var4 < ~Class_fi.z) {
               Class_ad.m = -((int)(Class_li.n.Gc / Class_kc.A)) + Class_fi.z;
            }

            int var6 = (int)(Class_li.n.nc / Class_kc.A) + Class_qd.C;
            if (var5 < 0) {
               Class_qd.C = (int)(Class_li.n.nc / Class_kc.A);
            }

            if (~Class_sb.j > ~var6) {
               Class_qd.C = -((int)(Class_li.n.nc / Class_kc.A)) + Class_sb.j;
            }
         }
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "me.L(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
      }
   }

   static final Class_sg a(byte var0, boolean var1, boolean var2, int var3, boolean var4) {
      try {
         int var6 = 28 % ((-13 - var0) / 59);
         j++;
         Class_p var5 = null;
         if (Class_jb.Z != null) {
            var5 = new Class_p(var3, Class_jb.Z, Class_df.b[var3], 1000000);
         }

         return new Class_sg(var5, Class_gk.d, var3, var1, var2, var4);
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "me.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
      }
   }

   abstract void a(Component var1, int var2, int var3, int var4);

   static final int a(int var0, int var1, byte[] var2) {
      try {
         t++;
         return var1 != -1 ? 65 : Class_kk.a(var0, false, 0, var2);
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "me.K(" + var0 + 44 + var1 + 44 + (var2 != null ? "{...}" : "null") + 41);
      }
   }

   final void c(int var1) {
      try {
         c++;
         Class_nc.a(this.g, this.v, this.h);
         if (var1 < 7) {
            u = 45;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "me.F(" + var1 + ')');
      }
   }

   abstract void a(Graphics var1, boolean var2, int var3, int var4, int var5, int var6);

   static final void a(Class_sg var0, int var1, int var2) {
      try {
         q++;
         if (Class_hg.b != null) {
            Class_hg.b.p = var2 * 8 - -5;
            int var3 = Class_hg.b.h(-5528);
            int var4 = Class_hg.b.h(-5528);
            var0.a(var4, (byte)80, var3);
         } else {
            if (var1 != -5720) {
               e = null;
            }

            Class_ua.a(true, 0, 255, (byte)0, 255, null, (byte)22);
            Class_pe.r[var2] = var0;
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "me.H(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ')');
      }
   }

   static final Class_hg d(int var0) {
      try {
         if (var0 >= -4) {
            a(null, false);
         }

         a++;

         try {
            return (Class_hg)Class.forName("gf").newInstance();
         } catch (Throwable var2) {
            return new Class_kf();
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "me.I(" + var0 + ')');
      }
   }

   protected Class_me() {
   }
}
