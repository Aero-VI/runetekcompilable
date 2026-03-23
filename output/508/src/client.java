import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.GregorianCalendar;
import nativeadvert.browsercontrol;

public final class client extends Class_ra {
   static int S;
   static int T;
   static int U;
   static int V;
   static int W;
   static int X;
   static volatile int Y = 0;
   static int Z;
   static int ab;
   static int bb;
   static int cb = 0;
   static int db;
   static int eb;
   static Class_le fb;
   static Class_cj gb;
   static int hb;
   static int ib = 0;
   static int jb;
   static int kb;
   public static int lb;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final void d(int var1) {
      int var4 = lb;

      try {
         Z++;
         if (browsercontrol.iscreated()) {
            browsercontrol.destroy();
         }

         if (Class_rj.J != null) {
            Class_rj.J.a(this.getClass(), 50);
         }

         if (Class_bi.r != null) {
            Class_bi.r.c = false;
         }

         Class_bi.r = null;
         if (Class_wf.k != null) {
            Class_wf.k.b(-67);
            Class_wf.k = null;
         }

         Class_tj.a(-91, Class_od.u);
         Class_pe.a(Class_od.u, true);
         if (Class_r.a != null) {
            Class_r.a.a(100, Class_od.u);
         }

         Class_vg.e(2);
         Class_vc.e(255);
         Class_r.a = null;
         if (Class_ve.V != null) {
            Class_ve.V.b(7759444);
         }

         if (Class_a.m != null) {
            Class_a.m.b(7759444);
         }

         Class_ek.a(-111);
         Class_cf.d(103);

         try {
            if (Class_jb.Z != null) {
               Class_jb.Z.b(-9715);
            }

            int var2 = 126 % ((var1 - -5) / 62);
            if (Class_df.b != null) {
               int var3 = 0;
               if (var4 != 0 || Class_df.b.length > var3) {
                  do {
                     if (Class_df.b[var3] != null) {
                        Class_df.b[var3].b(-9715);
                     }
                  } while (Class_df.b.length > ++var3);
               }
            }

            if (Class_fg.k != null) {
               Class_fg.k.b(-9715);
            }

            if (Class_db.T != null) {
               Class_db.T.b(-9715);
            }
         } catch (IOException var5) {
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "client.E(" + var1 + ')');
      }
   }

   static final void f(byte var0) {
      try {
         X++;
         int var1 = -36 % ((var0 - -7) / 60);
         if (Class_ua.b == 30) {
            Class_ca.a(25, (byte)-81);
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "client.H(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private final void g(byte var1) {
      int var6 = lb;

      try {
         U++;
         if (Class_sh.e == 0) {
            Runtime var52 = Runtime.getRuntime();
            int var55 = (int)((var52.totalMemory() + -var52.freeMemory()) / 1024L);
            long var4 = Class_fj.a(var1 ^ 17229);
            if (~Class_cg.t == -1L) {
               Class_cg.t = var4;
            }

            if (var55 > 16384 && ~(var4 - Class_cg.t) > -5001L) {
               if (~(-Class_eh.Mb + var4) < -1001L) {
                  System.gc();
                  Class_eh.Mb = var4;
               }

               Class_wj.v = Class_ak.P;
               Class_rg.Q = 5;
            } else {
               Class_sh.e = 10;
               Class_wj.v = Class_di.V;
               Class_rg.Q = 5;
            }
         } else if (~Class_sh.e != -11) {
            if (~Class_sh.e == -31) {
               Class_dd.Eb = Class_me.a((byte)116, false, true, 0, true);
               Class_jf.k = Class_me.a((byte)57, false, true, 1, true);
               Class_fi.w = Class_me.a((byte)66, true, false, 2, true);
               Class_ma.jb = Class_me.a((byte)-73, false, true, 3, true);
               Class_nb.b = Class_me.a((byte)105, false, true, 4, true);
               Class_pc.a = Class_me.a((byte)71, true, true, 5, true);
               Class_cj.L = Class_me.a((byte)-111, true, true, 6, false);
               Class_ui.d = Class_me.a((byte)-117, false, true, 7, true);
               Class_id.s = Class_me.a((byte)102, false, true, 8, true);
               Class_sa.Z = Class_me.a((byte)-93, false, true, 9, true);
               Class_oa.b = Class_me.a((byte)50, false, true, 10, true);
               Class_cj.Y = Class_me.a((byte)-121, false, true, 11, true);
               Class_bh.i = Class_me.a((byte)107, false, true, 12, true);
               Class_kh.e = Class_me.a((byte)-99, false, true, 13, true);
               Class_ci.L = Class_me.a((byte)-89, false, true, 14, false);
               Class_e.f = Class_me.a((byte)-75, false, true, 15, true);
               Class_aj.t = Class_me.a((byte)94, false, true, 16, true);
               Class_fb.i = Class_me.a((byte)-114, false, true, 17, true);
               Class_li.k = Class_me.a((byte)74, false, true, 18, true);
               Class_uc.g = Class_me.a((byte)-95, false, true, 19, true);
               Class_je.a = Class_me.a((byte)57, false, true, 20, true);
               Class_se.hb = Class_me.a((byte)-81, false, true, 21, true);
               Class_bi.f = Class_me.a((byte)88, false, true, 22, true);
               Class_ec.K = Class_me.a((byte)70, true, true, 23, true);
               Class_di.ab = Class_me.a((byte)-109, false, true, 24, true);
               Class_ga.d = Class_me.a((byte)-90, false, true, 25, true);
               Class_cc.ac = Class_me.a((byte)65, true, true, 26, true);
               Class_rg.Q = 15;
               Class_wj.v = Class_ia.X;
               Class_sh.e = 40;
            } else if (~Class_sh.e == -41) {
               int var24 = 0;
               var24 += Class_dd.Eb.h(var1 + -13) * 4 / 100;
               var24 += 4 * Class_jf.k.h(-88) / 100;
               var24 += Class_fi.w.h(-76) / 100;
               var24 += 2 * Class_ma.jb.h(65) / 100;
               var24 += Class_nb.b.h(var1 + -195) * 6 / 100;
               var24 += Class_pc.a.h(-115) * 4 / 100;
               var24 += 2 * Class_cj.L.h(-94) / 100;
               var24 += 50 * Class_ui.d.h(var1 + 45) / 100;
               var24 += 2 * Class_id.s.h(var1 + -155) / 100;
               var24 += Class_sa.Z.h(87) * 2 / 100;
               var24 += Class_oa.b.h(var1) * 2 / 100;
               var24 += Class_cj.Y.h(-74) * 2 / 100;
               var24 += Class_bh.i.h(117) * 2 / 100;
               var24 += 2 * Class_kh.e.h(var1 + -3) / 100;
               var24 += 2 * Class_ci.L.h(58) / 100;
               var24 += 2 * Class_e.f.h(-89) / 100;
               var24 += Class_aj.t.h(112) / 100;
               var24 += Class_fb.i.h(-101) / 100;
               var24 += Class_li.k.h(106) / 100;
               var24 += Class_uc.g.h(52) / 100;
               var24 += Class_je.a.h(var1 + -184) / 100;
               var24 += Class_se.hb.h(84) / 100;
               var24 += Class_bi.f.h(48) / 100;
               var24 += Class_ec.K.h(var1 + -175) / 100;
               var24 += Class_di.ab.h(-96) / 100;
               var24 += Class_ga.d.h(-95) / 100;
               var24 += Class_cc.ac.h(-79) / 100;
               if (~var24 != -101) {
                  if (var24 != 0) {
                     Class_wj.v = Class_o.a(2, new Class_r[]{Class_di.Y, Class_og.b(var24, 0), Class_fh.Y});
                  }

                  Class_rg.Q = 20;
               } else {
                  Class_wj.v = Class_oc.r;
                  Class_rg.Q = 20;
                  Class_ff.a((byte)105, Class_id.s);
                  Class_e.a((byte)-128, Class_id.s);
                  Class_lk.a(Class_id.s, 1);
                  Class_gg.a(Class_id.s, -5545);
                  Class_sh.e = 45;
               }
            } else if (Class_sh.e == 45) {
               Class_ve.a(22050, 2, Class_mg.a, -126);
               Class_ij.a = new Class_dd();
               Class_ij.a.b(9, 128, var1 ^ 94);
               Class_ve.V = Class_uc.a(Class_rj.J, (byte)104, Class_od.u, 22050, 0);
               Class_ve.V.a(false, Class_ij.a);
               Class_nj.a(Class_ij.a, Class_nb.b, false, Class_e.f, Class_ci.L);
               Class_a.m = Class_uc.a(Class_rj.J, (byte)104, Class_od.u, 2048, 1);
               Class_nd.m = new Class_re();
               Class_a.m.a(false, Class_nd.m);
               Class_pe.p = new Class_ph(22050, Class_pd.a);
               Class_ii.U = Class_cj.L.a(Class_r.K, (byte)-84);
               Class_rg.Q = 30;
               Class_wj.v = Class_gg.C;
               Class_sh.e = 50;
            } else if (~Class_sh.e == -51) {
               int var23 = Class_ee.a(Class_id.s, 53, Class_kh.e);
               int var54 = Class_aj.a(var1 + -167);
               if (~var54 < ~var23) {
                  Class_wj.v = Class_o.a(2, new Class_r[]{Class_rh.m, Class_og.b(100 * var23 / var54, 0), Class_fh.Y});
                  Class_rg.Q = 35;
               } else {
                  Class_rg.Q = 35;
                  Class_sh.e = 60;
                  Class_wj.v = Class_s.ab;
               }
            } else if (Class_sh.e == 60) {
               int var22 = Class_ng.a((byte)-126, Class_id.s);
               int var53 = Class_ga.b(false);
               if (~var22 > ~var53) {
                  Class_wj.v = Class_o.a(2, new Class_r[]{Class_mg.h, Class_og.b(100 * var22 / var53, 0), Class_fh.Y});
                  Class_rg.Q = 40;
               } else {
                  Class_wj.v = Class_ve.jb;
                  Class_rg.Q = 40;
                  Class_sh.e = 65;
               }
            } else if (~Class_sh.e == -66) {
               Class_ch.a(Class_id.s, (byte)83, Class_kh.e);
               Class_wj.v = Class_oj.lb;
               Class_rg.Q = 45;
               Class_ca.a(5, (byte)-89);
               Class_sh.e = 70;
            } else if (~Class_sh.e == -71) {
               Class_fi.w.a((byte)-62);
               int var11 = 0;
               var11 += Class_fi.w.d(0);
               Class_aj.t.a((byte)-62);
               var11 += Class_aj.t.d(0);
               Class_fb.i.a((byte)-62);
               var11 += Class_fb.i.d(0);
               Class_li.k.a((byte)-62);
               var11 += Class_li.k.d(0);
               Class_uc.g.a((byte)-62);
               var11 += Class_uc.g.d(0);
               Class_je.a.a((byte)-62);
               var11 += Class_je.a.d(0);
               Class_se.hb.a((byte)-62);
               var11 += Class_se.hb.d(0);
               Class_bi.f.a((byte)-62);
               var11 += Class_bi.f.d(0);
               Class_di.ab.a((byte)-62);
               var11 += Class_di.ab.d(0);
               Class_ga.d.a((byte)-62);
               var11 += Class_ga.d.d(var1 + -68);
               if (var11 < 1000) {
                  Class_wj.v = Class_o.a(2, new Class_r[]{Class_dd.ub, Class_og.b(var11 / 10, 0), Class_fh.Y});
                  Class_rg.Q = 50;
               } else {
                  Class_md.a(Class_fi.w, -7486);
                  Class_th.a((byte)-88, Class_fi.w);
                  Class_l.a(Class_fi.w, 11053);
                  Class_jb.a(-124, Class_ui.d, Class_fi.w);
                  Class_uf.a(12800, Class_ui.d, Class_vc.L, Class_aj.t);
                  Class_tb.a(Class_li.k, (byte)82, Class_ui.d);
                  Class_bi.a(Class_vc.L, Class_ui.d, Class_uc.g, (byte)112, Class_ak.O);
                  Class_ha.a(Class_fi.w, 1);
                  Class_ld.a(Class_je.a, Class_jf.k, Class_dd.Eb, -118);
                  Class_sd.a(Class_ui.d, Class_se.hb, var1 + -27687);
                  Class_ck.a((byte)58, Class_bi.f);
                  Class_sj.a((byte)-101, Class_fi.w);
                  Class_wa.a(Class_ui.d, Class_kh.e, Class_ma.jb, true, Class_id.s);
                  Class_ci.a(Class_fi.w, 116);
                  Class_lh.a(-83, Class_fb.i);
                  Class_vi.a(Class_ga.d, Class_di.ab, new Class_hh(), (byte)-117);
                  Class_cj.a(Class_di.ab, (byte)-72, Class_ga.d);
                  Class_rg.Q = 50;
                  Class_wj.v = Class_nj.y;
                  Class_h.c(4);
                  Class_sh.e = 80;
               }
            } else if (Class_sh.e == 80) {
               int var10 = Class_ji.a(0, Class_id.s);
               int var3 = Class_pi.g(0);
               if (var3 > var10) {
                  Class_wj.v = Class_o.a(var1 ^ 70, new Class_r[]{Class_ek.c, Class_og.b(100 * var10 / var3, 0), Class_fh.Y});
                  Class_rg.Q = 60;
               } else {
                  Class_jk.a(12339, Class_id.s);
                  Class_sh.e = 90;
                  Class_rg.Q = 60;
                  Class_wj.v = Class_qb.q;
               }
            } else if (~Class_sh.e == -91) {
               if (!Class_cc.ac.a((byte)-62)) {
                  Class_wj.v = Class_o.a(var1 ^ 70, new Class_r[]{Class_ug.p, Class_og.b(Class_cc.ac.d(0), 0), Class_fh.Y});
                  Class_rg.Q = 70;
               } else {
                  Class_pa var9 = new Class_pa(Class_sa.Z, Class_cc.ac, Class_id.s, 20, !Class_fc.s);
                  Class_kd.a(var9);
                  if (~Class_ha.hd == -2) {
                     Class_kd.b(0.9F);
                  }

                  if (~Class_ha.hd == -3) {
                     Class_kd.b(0.8F);
                  }

                  if (~Class_ha.hd == -4) {
                     Class_kd.b(0.7F);
                  }

                  if (~Class_ha.hd == -5) {
                     Class_kd.b(0.6F);
                  }

                  Class_rg.Q = 70;
                  Class_sh.e = 100;
                  Class_wj.v = Class_jg.i;
               }
            } else if (Class_sh.e == 100) {
               if (Class_sb.a(Class_id.s, -1)) {
                  Class_sh.e = 110;
               }
            } else {
               if (var1 != 68) {
                  this.d(-56);
               }

               if (~Class_sh.e == -111) {
                  Class_bi.r = new Class_oa();
                  Class_rj.J.a((byte)-61, 10, Class_bi.r);
                  Class_sh.e = 120;
                  Class_wj.v = Class_lg.b;
                  Class_rg.Q = 75;
               } else if (Class_sh.e == 120) {
                  if (!Class_oa.b.a((byte)124, Class_ef.u, Class_hk.S)) {
                     Class_wj.v = Class_o.a(2, new Class_r[]{Class_r.eb, Class_ph.m});
                     Class_rg.Q = 80;
                  } else {
                     Class_sb var8 = new Class_sb(Class_oa.b.a(Class_ef.u, Class_hk.S, (byte)81));
                     Class_ok.a(var8, 127);
                     Class_sh.e = 130;
                     Class_wj.v = Class_s.Z;
                     Class_rg.Q = 80;
                  }
               } else if (Class_sh.e == 130) {
                  if (!Class_ma.jb.a((byte)-62)) {
                     Class_wj.v = Class_o.a(2, new Class_r[]{Class_dj.y, Class_og.b(3 * Class_ma.jb.d(0) / 4, 0), Class_fh.Y});
                     Class_rg.Q = 85;
                  } else if (!Class_bh.i.a((byte)-62)) {
                     Class_wj.v = Class_o.a(2, new Class_r[]{Class_dj.y, Class_og.b(75 - -(Class_bh.i.d(var1 + -68) / 10), 0), Class_fh.Y});
                     Class_rg.Q = 85;
                  } else if (!Class_kh.e.a((byte)-62)) {
                     Class_wj.v = Class_o.a(2, new Class_r[]{Class_dj.y, Class_og.b(Class_kh.e.d(var1 + -68) / 20 + 85, var1 + -68), Class_fh.Y});
                     Class_rg.Q = 85;
                  } else if (!Class_ec.K.a(0, Class_ng.i)) {
                     Class_wj.v = Class_o.a(var1 + -66, new Class_r[]{Class_dj.y, Class_og.b(Class_ec.K.b(126, Class_ng.i) / 10 + 90, 0), Class_fh.Y});
                     Class_rg.Q = 85;
                  } else {
                     Class_oc.a(-10675, Class_lh.yb, Class_ec.K, Class_ld.W, Class_sc.e, Class_tc.j, Class_w.I);
                     Class_rg.Q = 100;
                     Class_sh.e = 140;
                     Class_wj.v = Class_ld.R;
                  }
               } else if (~Class_sh.e == -141) {
                  Class_wa.i = Class_ma.jb.a(Class_kg.q, (byte)-106);
                  Class_pc.a.a(false, (byte)113, true);
                  Class_cj.L.a(true, (byte)113, true);
                  Class_id.s.a(true, (byte)113, true);
                  Class_kh.e.a(true, (byte)113, true);
                  Class_oa.b.a(true, (byte)113, true);
                  Class_ma.jb.a(true, (byte)113, true);
                  Class_lg.e = true;
                  Class_fa.g(64);
               }
            }
         } else {
            Class_fa.a(4, 104, 104, 25);
            int var2 = 0;
            if (var6 != 0) {
               Class_sj.j[var2] = new Class_ga(104, 104);
               var2++;
            }

            while (~var2 > -5) {
               Class_sj.j[var2] = new Class_ga(104, 104);
               var2++;
            }

            Class_rg.Q = 10;
            Class_wj.v = Class_ka.ib;
            Class_sh.e = 30;
         }
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "client.N(" + var1 + ')');
      }
   }

   public final void init() {
      int var9 = lb;

      try {
         T++;
         if (this.c((byte)-106)) {
            label73: {
               Class_sf.b = Integer.parseInt(this.getParameter("worldid"));
               Class_pg.z = Integer.parseInt(this.getParameter("modewhat"));
               Class_rh.q = Integer.parseInt(this.getParameter("modewhere"));
               String var1 = this.getParameter("safemode");
               if (var1 != null && var1.equals("1")) {
                  Class_fg.n = true;
                  if (var9 == 0) {
                     break label73;
                  }
               }

               Class_fg.n = false;
            }

            label80: {
               String var2 = this.getParameter("members");
               if (var2 == null || !var2.equals("1")) {
                  Class_vc.L = false;
                  if (var9 == 0) {
                     break label80;
                  }
               }

               Class_vc.L = true;
            }

            String var3 = this.getParameter("lang");
            if (var3 != null && var3.equals("1")) {
               Class_ak.e(-54);
               Class_pi.sb = 1;
            }

            label81: {
               String var4 = this.getParameter("game");
               if (var4 == null || !var4.equals("1")) {
                  Class_u.W = 0;
                  if (var9 == 0) {
                     break label81;
                  }
               }

               Class_u.W = 1;
            }

            try {
               Class_hj.db = Integer.parseInt(this.getParameter("js"));
               Class_ch.f = Integer.parseInt(this.getParameter("plug"));
               Class_m.kb = Integer.parseInt(this.getParameter("affid"));
            } catch (Exception var11) {
            }

            Class_df.c = Class_ug.z.b(this, (byte)-31);
            if (Class_df.c == null) {
               Class_df.c = Class_hk.S;
            }

            String var5 = this.getParameter("advert");
            if (var5 != null) {
               byte[] var6;
               try {
                  var6 = var5.getBytes("ISO-8859-1");
               } catch (UnsupportedEncodingException var10) {
                  var6 = var5.getBytes();
               }

               Class_r var7 = Class_pi.a(var6.length, var6, 127, 0);
               boolean var8 = Class_ka.a((byte)-101, var7);
               if (var8) {
                  Class_ra.E = var7;
               }
            }

            Class_kc.r = this.getCodeBase().getHost();
            this.a(-9, Class_pg.z + 32, 503, 765, 508);
         }
      } catch (RuntimeException var12) {
         throw Class_sh.a(var12, "client.init(" + ')');
      }
   }

   static final Class_ha a(Class_ha var0) {
      int var1 = Class_jc.c(b(var0), -528748559);
      if (var1 == 0) {
         return null;
      } else {
         for (int var2 = 0; var2 < var1; var2++) {
            var0 = Class_tf.a(var0.R, (byte)-80);
            if (var0 == null) {
               return null;
            }
         }

         return var0;
      }
   }

   static final void a(int var0, boolean var1) {
      try {
         bb++;
         if (!var1) {
            c(null);
         }

         Class_ve.T = 50;
         Class_ia.gb = var0;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "client.F(" + var0 + ',' + var1 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private final void f(int var1) {
      int var5 = lb;

      try {
         W++;
         Class_ld.a(this, (byte)100);
         if (var1 != 1) {
            this.f(114);
         }

         Class_gk.i = 0;
         if (var5 != 0 || Class_v.a((byte)111) && Class_gk.i < 128) {
            do {
               Class_rd.Z[Class_gk.i] = Class_jg.e;
               Class_hg.f[Class_gk.i] = Class_ta.I;
               Class_gk.i++;
            } while (Class_v.a((byte)111) && Class_gk.i < 128);
         }

         Class_sj.k++;
         if (Class_hj.bb != -1) {
            Class_de.a(-59, Class_hj.bb, Class_l.u, 0, 0, 0, 0, Class_fk.R);
         }

         Class_qd.F++;
         Class_ed.a((byte)113);

         while (true) {
            Class_wj var2 = (Class_wj)Class_ff.v.e(-120);
            if (var2 == null) {
               break;
            }

            Class_ha var3 = var2.z;
            if (var3.hc >= 0) {
               Class_ha var4 = Class_tf.a(var3.R, (byte)-80);
               if (var4 == null || var4.n == null || var4.n.length <= var3.hc || var3 != var4.n[var3.hc] && var5 == 0) {
                  continue;
               }
            }

            Class_j.a(var2, 16);
            if (var5 != 0) {
               break;
            }
         }

         while (true) {
            Class_wj var7 = (Class_wj)Class_dj.s.e(54);
            if (var7 == null) {
               break;
            }

            Class_ha var9 = var7.z;
            if (~var9.hc <= -1) {
               Class_ha var11 = Class_tf.a(var9.R, (byte)-80);
               if (var11 == null || var11.n == null || ~var9.hc <= ~var11.n.length || var11.n[var9.hc] != var9 && var5 == 0) {
                  continue;
               }
            }

            Class_j.a(var7, var1 + 15);
            if (var5 != 0) {
               break;
            }
         }

         while (true) {
            Class_wj var8 = (Class_wj)Class_ti.q.e(103);
            if (var8 == null) {
               break;
            }

            Class_ha var10 = var8.z;
            if (var10.hc >= 0) {
               Class_ha var12 = Class_tf.a(var10.R, (byte)-80);
               if (var12 == null || var12.n == null || var10.hc >= var12.n.length || var10 != var12.n[var10.hc] && var5 == 0) {
                  continue;
               }
            }

            Class_j.a(var8, var1 ^ 17);
            if (var5 != 0) {
               break;
            }
         }

         if (Class_ff.e != null) {
            Class_wg.a((byte)-118);
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "client.Q(" + var1 + ')');
      }
   }

   private final void h(byte var1) {
      try {
         if (var1 == -122) {
            S++;
            boolean var2 = Class_h.b(-127);
            if (!var2) {
               this.g(0);
            }
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "client.L(" + var1 + ')');
      }
   }

   public static void a(boolean var0) {
      try {
         if (var0) {
            gb = null;
            fb = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "client.M(" + var0 + ')');
      }
   }

   final void e(int var1) {
      int var3 = lb;

      try {
         hb++;
         if (var1 == 2) {
            if (Class_ua.b != 1000) {
               Class_be.C++;
               if (~(Class_be.C % 1000) == -2) {
                  GregorianCalendar var2 = new GregorianCalendar();
                  Class_db.qb = var2.get(11) * 600 - (-(var2.get(12) * 10) - var2.get(13) / 6);
                  Class_ok.U.setSeed(Class_db.qb);
               }

               this.h((byte)-122);
               Class_hk.a((byte)-38);
               Class_fk.a(true);
               Class_hf.c(16322);
               Class_ug.d(var1 ^ 124);
               Class_lg.b(-1);
               if (Class_r.a != null) {
                  int var5 = Class_r.a.a(false);
                  Class_sa.U = var5;
               }

               label56: {
                  if (~Class_ua.b != -1) {
                     if (Class_ua.b == 5) {
                        this.g((byte)68);
                        Class_ch.b((byte)50);
                        if (var3 == 0) {
                           break label56;
                        }
                     }

                     if (~Class_ua.b != -26 && ~Class_ua.b != -29) {
                        break label56;
                     }

                     Class_jk.d(94);
                     if (var3 == 0) {
                        break label56;
                     }
                  }

                  this.g((byte)68);
                  Class_ch.b((byte)104);
               }

               if (~Class_ua.b != -11) {
                  if (Class_ua.b != 30) {
                     if (Class_ua.b == 40) {
                        Class_nj.a(false);
                        if (~Class_fh.O != 2) {
                           if (~Class_fh.O != -16) {
                              if (Class_fh.O != 2) {
                                 Class_fa.g(var1 + 62);
                                 return;
                              }
                           } else {
                              Class_u.j(2);
                           }

                           return;
                        }
                     }
                  } else {
                     Class_pa.a(true);
                  }
               } else {
                  this.f(1);
                  Class_hf.a((byte)42);
                  Class_nj.a(false);
               }
            }
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "client.O(" + var1 + ')');
      }
   }

   static final int b(Class_ha var0) {
      Class_kg var1 = (Class_kg)Class_sf.f.a(((long)var0.K << 32) + var0.hc, 109);
      return var1 != null ? var1.r : var0.h;
   }

   private final void g(int var1) {
      try {
         jb++;
         if (var1 == 0) {
            if (Class_rj.F >= 4) {
               this.a(var1 + 690, "js5crc");
               Class_ua.b = 1000;
            } else {
               if (~Class_kg.y <= -5) {
                  if (Class_ua.b == 0 || Class_ua.b == 5) {
                     this.a(690, "js5io");
                     Class_ua.b = 1000;
                     return;
                  }

                  Class_ke.w = 3000;
                  Class_kg.y = 3;
               }

               if (~(Class_ke.w--) >= -1) {
                  try {
                     if (~Class_oa.j == -1) {
                        Class_fk.Y = Class_rj.J.a(Class_kc.r, (byte)115, Class_sb.o);
                        Class_oa.j++;
                     }

                     if (Class_oa.j == 1) {
                        if (Class_fk.Y.b == 2) {
                           this.b(-5, -1);
                           return;
                        }

                        if (~Class_fk.Y.b == -2) {
                           Class_oa.j++;
                        }
                     }

                     if (~Class_oa.j == -3) {
                        Class_sj.m = new Class_jk((Socket)Class_fk.Y.e, Class_rj.J);
                        Class_lh var2 = new Class_lh(5);
                        var2.b(32, 15);
                        var2.g(544537784, 508);
                        Class_sj.m.a(0, (byte)82, 5, var2.E);
                        Class_oa.j++;
                        Class_ta.Fb = Class_fj.a(17161);
                     }

                     if (Class_oa.j == 3) {
                        if (~Class_ua.b != -1 && Class_ua.b != 5 && ~Class_sj.m.a((byte)102) >= -1) {
                           if (~(Class_fj.a(var1 + 17161) + -Class_ta.Fb) < -30001L) {
                              this.b(var1 + -5, -2);
                              return;
                           }
                        } else {
                           int var5 = Class_sj.m.a(96);
                           if (~var5 != -1) {
                              this.b(-5, var5);
                              return;
                           }

                           Class_oa.j++;
                        }
                     }

                     if (Class_oa.j == 4) {
                        boolean var6 = Class_ua.b == 5 || ~Class_ua.b == -11 || ~Class_ua.b == -29;
                        Class_tg.a(Class_sj.m, false, !var6);
                        Class_wg.h = 0;
                        Class_fk.Y = null;
                        Class_oa.j = 0;
                        Class_sj.m = null;
                     }
                  } catch (IOException var3) {
                     this.b(-5, -3);
                  }
               }
            }
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "client.G(" + var1 + ')');
      }
   }

   static final void a(Class_ha[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for (int var8 = 0; var8 < var0.length; var8++) {
         Class_ha var9 = var0[var8];
         if (var9 != null
            && var9.R == var1
            && (!var9.dc || var9.Kc == 0 || var9.Rb || b(var9) != 0 || var9 == Class_ka.mb || var9.ab == 1338)
            && (!var9.dc || !c(var9))) {
            int var10 = var9.hb + var6;
            int var11 = var9.Rc + var7;
            int var12;
            int var13;
            int var14;
            int var15;
            if (var9.Kc == 2) {
               var12 = var2;
               var13 = var3;
               var14 = var4;
               var15 = var5;
            } else {
               int var16 = var10 + var9.Gc;
               int var17 = var11 + var9.nc;
               if (var9.Kc == 9) {
                  var16++;
                  var17++;
               }

               var12 = var10 > var2 ? var10 : var2;
               var13 = var11 > var3 ? var11 : var3;
               var14 = var16 < var4 ? var16 : var4;
               var15 = var17 < var5 ? var17 : var5;
            }

            if (var9 == Class_ff.e) {
               Class_wa.C = true;
               Class_hk.H = var10;
               Class_ck.a = var11;
            }

            if (!var9.dc || var12 < var14 && var13 < var15) {
               if (var9.Kc == 0) {
                  if (!var9.dc && c(var9) && Class_si.b != var9) {
                     continue;
                  }

                  if (var9.ed && Class_pj.c >= var12 && Class_bh.k >= var13 && Class_pj.c < var14 && Class_bh.k < var15) {
                     for (Class_wj var25 = (Class_wj)Class_ti.q.e((byte)76); var25 != null; var25 = (Class_wj)Class_ti.q.c((byte)-110)) {
                        if (var25.D) {
                           var25.c(-17554);
                        }
                     }

                     if (Class_vg.L == 0) {
                        Class_ff.e = null;
                        Class_ka.mb = null;
                     }

                     Class_kg.s = false;
                  }
               }

               if (var9.dc) {
                  boolean var26;
                  if (Class_pj.c >= var12 && Class_bh.k >= var13 && Class_pj.c < var14 && Class_bh.k < var15) {
                     var26 = true;
                  } else {
                     var26 = false;
                  }

                  boolean var28 = false;
                  if (Class_mi.T == 1 && var26) {
                     var28 = true;
                  }

                  boolean var18 = false;
                  if (Class_eb.d == 1 && Class_vh.rb >= var12 && Class_wb.i >= var13 && Class_vh.rb < var14 && Class_wb.i < var15) {
                     var18 = true;
                  }

                  if (Class_gk.i > 0 && var9.Vc != null) {
                     for (int var19 = 0; var19 < var9.Vc.length; var19++) {
                        for (int var20 = 0; var20 < Class_gk.i; var20++) {
                           int var21 = var9.Vc[var19] & 255;
                           if (var21 == Class_rd.Z[var20]) {
                              Class_ca.a(var9.K, (byte)111, var19 + 1, Class_hk.S, -1);
                           }
                        }
                     }
                  }

                  if (var18) {
                     Class_pb.a(Class_vh.rb - var10, Class_wb.i - var11, -4798, var9);
                  }

                  if (Class_ff.e != null && Class_ff.e != var9 && var26 && Class_ld.c(32157, b(var9))) {
                     Class_a.h = var9;
                  }

                  if (var9 == Class_ka.mb) {
                     Class_nf.J = true;
                     Class_vh.nb = var10;
                     Class_tg.c = var11;
                  }

                  if (var9.Rb || var9.ab != 0) {
                     if (var26 && Class_sa.U != 0 && var9.Ob != null) {
                        Class_wj var29 = new Class_wj();
                        var29.D = true;
                        var29.z = var9;
                        var29.s = Class_sa.U;
                        var29.x = var9.Ob;
                        Class_ti.q.a(var29, true);
                     }

                     if (Class_ff.e != null || Class_ij.f != null || Class_ui.h || var9.ab != 1400 && Class_kg.s) {
                        var18 = false;
                        var28 = false;
                        var26 = false;
                     }

                     if (var9.ab != 0) {
                        if (var9.ab == 1337) {
                           Class_w.S = var9;
                           Class_tg.a(var9, -120);
                           continue;
                        }

                        if (var9.ab == 1338) {
                           if (var18) {
                              Class_kj.a(99, var9, Class_wb.i - var11, Class_vh.rb - var10);
                           }
                           continue;
                        }

                        if (var9.ab == 1400) {
                           Class_li.n = var9;
                           if (var18) {
                              if (Class_wh.q[82] && Class_ib.eb > 0) {
                                 int var55 = (int)((Class_vh.rb - var10 - var9.Gc / 2) * 2.0 / Class_kc.A);
                                 int var62 = (int)((Class_wb.i - var11 - var9.nc / 2) * 2.0 / Class_kc.A);
                                 int var68 = Class_og.fb + var55;
                                 int var73 = Class_oc.e + var62;
                                 int var23 = var68 + Class_mb.k;
                                 int var24 = Class_sb.j - 1 - var73 + Class_aa.v;
                                 Class_hh.a(var23, 0, var24, 24867);
                                 Class_ch.a(636);
                                 continue;
                              }

                              Class_kg.s = true;
                              Class_oj.W = Class_pj.c;
                              Class_jf.a = Class_bh.k;
                              Class_ra.b = Class_og.fb;
                              Class_nd.N = Class_oc.e;
                              continue;
                           }

                           if (var28 && Class_kg.s) {
                              Class_jc.d(Class_ra.b + (int)((Class_oj.W - Class_pj.c) * 2.0 / Class_pi.qb), -1);
                              Class_ia.b(Class_nd.N + (int)((Class_jf.a - Class_bh.k) * 2.0 / Class_pi.qb), 112);
                              continue;
                           }

                           Class_kg.s = false;
                           continue;
                        }

                        if (var9.ab == 1401) {
                           if (var28) {
                              Class_n.a(var9.nc, false, Class_bh.k - var11, var9.Gc, Class_pj.c - var10);
                           }
                           continue;
                        }

                        if (var9.ab == 1402) {
                           Class_tg.a(var9, -121);
                           continue;
                        }

                        if (var9.ab == 1404) {
                           Class_tg.a(var9, -119);
                           continue;
                        }
                     }

                     if (!var9.Qb && var18) {
                        var9.Qb = true;
                        if (var9.G != null) {
                           Class_wj var30 = new Class_wj();
                           var30.D = true;
                           var30.z = var9;
                           var30.B = Class_vh.rb - var10;
                           var30.s = Class_wb.i - var11;
                           var30.x = var9.G;
                           Class_ti.q.a(var30, true);
                        }
                     }

                     if (var9.Qb && var28 && var9.Zc != null) {
                        Class_wj var31 = new Class_wj();
                        var31.D = true;
                        var31.z = var9;
                        var31.B = Class_pj.c - var10;
                        var31.s = Class_bh.k - var11;
                        var31.x = var9.Zc;
                        Class_ti.q.a(var31, true);
                     }

                     if (var9.Qb && !var28) {
                        var9.Qb = false;
                        if (var9.I != null) {
                           Class_wj var32 = new Class_wj();
                           var32.D = true;
                           var32.z = var9;
                           var32.B = Class_pj.c - var10;
                           var32.s = Class_bh.k - var11;
                           var32.x = var9.I;
                           Class_dj.s.a(var32, true);
                        }
                     }

                     if (var28 && var9.nb != null) {
                        Class_wj var33 = new Class_wj();
                        var33.D = true;
                        var33.z = var9;
                        var33.B = Class_pj.c - var10;
                        var33.s = Class_bh.k - var11;
                        var33.x = var9.nb;
                        Class_ti.q.a(var33, true);
                     }

                     if (!var9.Tc && var26) {
                        var9.Tc = true;
                        if (var9.C != null) {
                           Class_wj var34 = new Class_wj();
                           var34.D = true;
                           var34.z = var9;
                           var34.B = Class_pj.c - var10;
                           var34.s = Class_bh.k - var11;
                           var34.x = var9.C;
                           Class_ti.q.a(var34, true);
                        }
                     }

                     if (var9.Tc && var26 && var9.Eb != null) {
                        Class_wj var35 = new Class_wj();
                        var35.D = true;
                        var35.z = var9;
                        var35.B = Class_pj.c - var10;
                        var35.s = Class_bh.k - var11;
                        var35.x = var9.Eb;
                        Class_ti.q.a(var35, true);
                     }

                     if (var9.Tc && !var26) {
                        var9.Tc = false;
                        if (var9.q != null) {
                           Class_wj var36 = new Class_wj();
                           var36.D = true;
                           var36.z = var9;
                           var36.B = Class_pj.c - var10;
                           var36.s = Class_bh.k - var11;
                           var36.x = var9.q;
                           Class_dj.s.a(var36, true);
                        }
                     }

                     if (var9.sc != null) {
                        Class_wj var37 = new Class_wj();
                        var37.z = var9;
                        var37.x = var9.sc;
                        Class_ff.v.a(var37, true);
                     }

                     if (var9.pc != null && Class_dj.E > var9.tc) {
                        if (var9.Oc != null && Class_dj.E - var9.tc <= 32) {
                           label531:
                           for (int var39 = var9.tc; var39 < Class_dj.E; var39++) {
                              int var56 = Class_wb.e[var39 & 31];

                              for (int var63 = 0; var63 < var9.Oc.length; var63++) {
                                 if (var9.Oc[var63] == var56) {
                                    Class_wj var22 = new Class_wj();
                                    var22.z = var9;
                                    var22.x = var9.pc;
                                    Class_ti.q.a(var22, true);
                                    break label531;
                                 }
                              }
                           }
                        } else {
                           Class_wj var38 = new Class_wj();
                           var38.z = var9;
                           var38.x = var9.pc;
                           Class_ti.q.a(var38, true);
                        }

                        var9.tc = Class_dj.E;
                     }

                     if (var9.Bb != null && Class_kg.x > var9.rc) {
                        if (var9.y != null && Class_kg.x - var9.rc <= 32) {
                           label507:
                           for (int var41 = var9.rc; var41 < Class_kg.x; var41++) {
                              int var57 = Class_se.gb[var41 & 31];

                              for (int var64 = 0; var64 < var9.y.length; var64++) {
                                 if (var9.y[var64] == var57) {
                                    Class_wj var69 = new Class_wj();
                                    var69.z = var9;
                                    var69.x = var9.Bb;
                                    Class_ti.q.a(var69, true);
                                    break label507;
                                 }
                              }
                           }
                        } else {
                           Class_wj var40 = new Class_wj();
                           var40.z = var9;
                           var40.x = var9.Bb;
                           Class_ti.q.a(var40, true);
                        }

                        var9.rc = Class_kg.x;
                     }

                     if (var9.E != null && Class_dc.r > var9.Vb) {
                        if (var9.F != null && Class_dc.r - var9.Vb <= 32) {
                           label483:
                           for (int var43 = var9.Vb; var43 < Class_dc.r; var43++) {
                              int var58 = Class_u.ab[var43 & 31];

                              for (int var65 = 0; var65 < var9.F.length; var65++) {
                                 if (var9.F[var65] == var58) {
                                    Class_wj var70 = new Class_wj();
                                    var70.z = var9;
                                    var70.x = var9.E;
                                    Class_ti.q.a(var70, true);
                                    break label483;
                                 }
                              }
                           }
                        } else {
                           Class_wj var42 = new Class_wj();
                           var42.z = var9;
                           var42.x = var9.E;
                           Class_ti.q.a(var42, true);
                        }

                        var9.Vb = Class_dc.r;
                     }

                     if (var9.Db != null && Class_wj.E > var9.Dc) {
                        if (var9.Bc != null && Class_wj.E - var9.Dc <= 32) {
                           label459:
                           for (int var45 = var9.Dc; var45 < Class_wj.E; var45++) {
                              int var59 = Class_wi.cb[var45 & 31];

                              for (int var66 = 0; var66 < var9.Bc.length; var66++) {
                                 if (var9.Bc[var66] == var59) {
                                    Class_wj var71 = new Class_wj();
                                    var71.z = var9;
                                    var71.x = var9.Db;
                                    Class_ti.q.a(var71, true);
                                    break label459;
                                 }
                              }
                           }
                        } else {
                           Class_wj var44 = new Class_wj();
                           var44.z = var9;
                           var44.x = var9.Db;
                           Class_ti.q.a(var44, true);
                        }

                        var9.Dc = Class_wj.E;
                     }

                     if (var9.bc != null && Class_ed.e > var9.Fb) {
                        if (var9.Fc != null && Class_ed.e - var9.Fb <= 32) {
                           label435:
                           for (int var47 = var9.Fb; var47 < Class_ed.e; var47++) {
                              int var60 = Class_ve.eb[var47 & 31];

                              for (int var67 = 0; var67 < var9.Fc.length; var67++) {
                                 if (var9.Fc[var67] == var60) {
                                    Class_wj var72 = new Class_wj();
                                    var72.z = var9;
                                    var72.x = var9.bc;
                                    Class_ti.q.a(var72, true);
                                    break label435;
                                 }
                              }
                           }
                        } else {
                           Class_wj var46 = new Class_wj();
                           var46.z = var9;
                           var46.x = var9.bc;
                           Class_ti.q.a(var46, true);
                        }

                        var9.Fb = Class_ed.e;
                     }

                     if (Class_cd.N > var9.Cb && var9.eb != null) {
                        Class_wj var48 = new Class_wj();
                        var48.z = var9;
                        var48.x = var9.eb;
                        Class_ti.q.a(var48, true);
                     }

                     if (Class_vf.l > var9.Cb && var9.Jb != null) {
                        Class_wj var49 = new Class_wj();
                        var49.z = var9;
                        var49.x = var9.Jb;
                        Class_ti.q.a(var49, true);
                     }

                     if (Class_hk.J > var9.Cb && var9.lc != null) {
                        Class_wj var50 = new Class_wj();
                        var50.z = var9;
                        var50.x = var9.lc;
                        Class_ti.q.a(var50, true);
                     }

                     if (Class_ae.d > var9.Cb && var9.mc != null) {
                        Class_wj var51 = new Class_wj();
                        var51.z = var9;
                        var51.x = var9.mc;
                        Class_ti.q.a(var51, true);
                     }

                     if (Class_ec.I > var9.Cb && var9.oc != null) {
                        Class_wj var52 = new Class_wj();
                        var52.z = var9;
                        var52.x = var9.oc;
                        Class_ti.q.a(var52, true);
                     }

                     var9.Cb = Class_qd.F;
                     if (var9.ic != null) {
                        for (int var53 = 0; var53 < Class_gk.i; var53++) {
                           Class_wj var61 = new Class_wj();
                           var61.z = var9;
                           var61.q = Class_rd.Z[var53];
                           var61.C = Class_hg.f[var53];
                           var61.x = var9.ic;
                           Class_ti.q.a(var61, true);
                        }
                     }

                     if (Class_r.s && var9.T != null) {
                        Class_wj var54 = new Class_wj();
                        var54.z = var9;
                        var54.x = var9.T;
                        Class_ti.q.a(var54, true);
                     }
                  }
               }

               if (!var9.dc && Class_ff.e == null && Class_ij.f == null && !Class_ui.h) {
                  if ((var9.Kb >= 0 || var9.ub != 0) && Class_pj.c >= var12 && Class_bh.k >= var13 && Class_pj.c < var14 && Class_bh.k < var15) {
                     if (var9.Kb >= 0) {
                        Class_si.b = var0[var9.Kb];
                     } else {
                        Class_si.b = var9;
                     }
                  }

                  if (var9.Kc == 8 && Class_pj.c >= var12 && Class_bh.k >= var13 && Class_pj.c < var14 && Class_bh.k < var15) {
                     Class_vb.i = var9;
                  }

                  if (var9.M > var9.nc) {
                     Class_kj.a(var11, var9, var9.nc, var9.M, 25504, var10 + var9.Gc, Class_bh.k, Class_pj.c);
                  }
               }

               if (var9.Kc == 0) {
                  a(var0, var9.K, var12, var13, var14, var15, var10 - var9.Nb, var11 - var9.kb);
                  if (var9.n != null) {
                     a(var9.n, var9.K, var12, var13, var14, var15, var10 - var9.Nb, var11 - var9.kb);
                  }

                  Class_be var27 = (Class_be)Class_nj.p.a(var9.K, 84);
                  if (var27 != null) {
                     Class_de.a(-114, var27.t, var14, var13, var11, var10, var12, var15);
                  }
               }
            }
         }
      }
   }

   final void a(int var1) {
      int var3 = lb;

      try {
         a(true);
         Class_r.c((byte)-112);
         Class_mc.a(true);
         db++;
         Class_uf.e(25465);
         Class_pb.a((byte)-84);
         Class_ra.b((byte)-26);
         Class_hg.a(-116);
         Class_me.a((byte)116);
         Class_oa.a((byte)-127);
         Class_d.a(8);
         Class_lh.f(false);
         Class_jk.b((byte)-12);
         Class_sg.j(-677379135);
         Class_wa.a(true);
         Class_p.a((byte)102);
         Class_qc.a((byte)127);
         Class_cc.g(false);
         Class_c.a(0);
         Class_ga.a((byte)-105);
         Class_ha.b(104);
         Class_fa.b((byte)63);
         Class_tg.d(0);
         Class_qb.a(1);
         Class_oi.a(true);
         Class_hf.a(true);
         Class_jb.c((byte)-126);
         Class_dd.b((byte)105);
         Class_ff.a((byte)-90);
         Class_ph.a(-26412);
         Class_wf.a(63);
         Class_uc.a(31891);
         Class_ta.c(2);
         Class_aa.d(0);
         Class_ai.a((byte)68);
         Class_nd.c(1);
         Class_be.a(true);
         Class_li.a(-120);
         Class_wh.c(-74);
         Class_ng.a((byte)117);
         Class_g.a(-121);
         Class_si.a(29889);
         Class_pf.a((byte)-52);
         Class_ua.a(64);
         Class_kh.a((byte)126);
         Class_bf.b((byte)102);
         Class_bg.a(-5);
         Class_ub.d(0);
         Class_de.a(0);
         Class_jd.a(true);
         Class_cj.e(71);
         Class_ne.f();
         Class_h.d(8412);
         Class_cf.c(-1);
         Class_qa.k();
         Class_vf.b(24205);
         Class_od.a(-20033);
         Class_fj.a((byte)127);
         Class_lc.a(0);
         Class_oe.b((byte)-126);
         Class_nb.b(5756);
         Class_bi.a(false);
         Class_wb.a(110);
         Class_eb.a(112);
         Class_pc.b(-1);
         Class_af.a();
         Class_e.b(-1);
         Class_lj.b(24);
         Class_ba.a((byte)-9);
         Class_a.b(123);
         Class_kk.a(-1154);
         Class_mk.b(162);
         Class_hd.a((byte)-123);
         Class_je.a(156);
         Class_aj.a((byte)29);
         Class_na.a();
         Class_pe.a((byte)-82);
         Class_nj.a((byte)69);
         Class_pa.a(6287);
         Class_kd.a();
         Class_nc.c();
         Class_fe.e(-116);
         Class_w.e(499);
         Class_uh.a(-99);
         Class_ed.a(0);
         Class_id.b((byte)-65);
         Class_tj.b(false);
         Class_lb.c();
         Class_sj.a(20);
         Class_th.a(true);
         Class_ui.a(0);
         Class_tf.c((byte)-63);
         Class_vg.f(32125);
         Class_bd.d();
         Class_hk.g(-57);
         Class_vj.e(-1);
         Class_mg.a(-97);
         Class_rf.a(32768);
         Class_mi.a(true);
         Class_bb.a(-46);
         Class_fd.a(true);
         Class_ig.a((byte)-28);
         Class_tc.a(133988164);
         Class_fh.d(-23562);
         Class_pj.a((byte)71);
         Class_lg.a(988656400);
         Class_mb.a((byte)120);
         Class_he.a(113);
         Class_ek.a((byte)-121);
         Class_bk.c((byte)23);
         Class_cd.g(0);
         Class_gj.f(1);
         Class_hh.a(10);
         Class_kj.e(0);
         Class_sb.a(-11);
         Class_sf.a(0);
         Class_ca.a(1);
         Class_gk.a(-2);
         Class_jf.b(-2);
         Class_wj.e(-108);
         Class_ae.a(true);
         Class_tb.a((byte)-119);
         Class_oc.a(0);
         Class_lk.e(1);
         Class_ic.a(false);
         Class_qd.d(-1);
         Class_nf.d(0);
         Class_jj.a(-1);
         Class_rd.d(5285);
         Class_ij.a((byte)116);
         Class_gi.a();
         Class_jg.a(-1);
         Class_vb.a(1);
         Class_ud.a(32767);
         Class_b.a(true);
         Class_qe.c(2);
         Class_kg.d(0);
         Class_fc.c(31756);
         Class_vc.d(-104);
         Class_wg.b(0);
         Class_ef.d(0);
         Class_fb.a((byte)127);
         Class_dc.e(27392);
         Class_hc.a((byte)106);
         Class_df.a(-123);
         Class_kf.b(25);
         Class_ak.c((byte)-98);
         Class_sc.a(0);
         Class_sh.b(125);
         Class_bj.a(0);
         Class_qj.a(true);
         Class_o.f(-840517817);
         Class_sd.a(190);
         Class_md.a(false);
         Class_ch.a((byte)87);
         Class_ej.e();
         Class_ah.a();
         Class_t.a();
         int var2 = 9 / ((var1 - -12) / 38);
         Class_mf.a();
         Class_cb.a(18002);
         Class_gg.e(304);
         Class_v.d(121);
         Class_q.b();
         Class_ge.a();
         Class_ad.a(96);
         Class_lf.b((byte)50);
         Class_vh.d((byte)-37);
         Class_vd.a(-106);
         Class_ck.a(124);
         Class_of.a((byte)103);
         Class_ti.b(100);
         Class_ug.a((byte)-69);
         Class_rc.a(-31601);
         Class_kc.d(-19267);
         Class_nk.a(1);
         Class_ee.g(0);
         Class_ok.a(false);
         Class_ib.g(1);
         Class_j.g(-119);
         Class_ab.d((byte)-57);
         Class_f.g(9071);
         Class_db.g(-108);
         Class_mh.d((byte)25);
         Class_fk.g(-15578);
         Class_rg.a(true);
         Class_oj.g(-1);
         Class_ld.h(1);
         Class_ve.h(0);
         Class_sa.g(115);
         Class_ob.g(-68);
         Class_bc.d((byte)-47);
         Class_vi.d((byte)-65);
         Class_wi.g(-1);
         Class_og.g(0);
         Class_m.g(-22338);
         Class_ka.d((byte)-27);
         Class_te.g(-123);
         Class_s.g(121);
         Class_u.i(-26774);
         Class_di.g(4096);
         Class_ih.g(0);
         Class_la.g(208);
         Class_ji.g(0);
         Class_hj.d((byte)-126);
         Class_se.e((byte)120);
         Class_pi.h(128);
         Class_td.g(-85);
         Class_ce.g(9927);
         Class_va.d((byte)-127);
         Class_ii.e((byte)9);
         Class_ea.d((byte)126);
         Class_ma.g(-80);
         Class_i.e((byte)-66);
         Class_ia.d((byte)24);
         Class_cg.a(32655);
         Class_mj.a((byte)45);
         Class_rj.b((byte)15);
         Class_fg.b((byte)-63);
         Class_ja.a(1);
         Class_rh.b((byte)26);
         Class_wc.d((byte)74);
         Class_ci.d(1152);
         Class_ec.d(110);
         Class_jc.d(61);
         Class_pd.a(92);
         Class_we.d(26507);
         Class_fi.a((byte)-80);
         Class_n.d(125);
         Class_bh.a(-28590);
         Class_ke.a((byte)15);
         Class_l.b(0);
         Class_dj.b(112);
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "client.P(" + var1 + ')');
      }

      if (Class_ra.P) {
         lb = ++var3;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final void c(int var1) {
      int var3 = lb;

      try {
         label55: {
            Class_ok.a(Class_rj.J, (byte)-104, Class_fg.n);
            Class_lk.r = var1 != ~Class_rh.q ? Class_sf.b + 50000 : 443;
            kb++;
            if (Class_u.W != 1) {
               Class_ui.g = Class_ad.c;
               Class_pc.g = Class_we.L;
               Class_va.X = Class_m.jb;
               Class_jd.g = Class_ia.R;
               if (var3 == 0) {
                  break label55;
               }
            }

            Class_ui.g = Class_mc.m;
            Class_pc.g = Class_ef.q;
            Class_va.X = Class_jg.h;
            Class_jd.g = Class_l.A;
         }

         Class_ti.h = Class_rh.q == 0 ? '\uaa4a' : 40000 - -Class_sf.b;
         Class_sd.d = Class_fb.e = Class_oj.X = Class_fh.X = new short[256];
         Class_sb.o = Class_ti.h;
         Class_sd.a((byte)-109);
         Class_ig.a(Class_od.u, 1611550343);
         Class_ak.a(var1 + 52, Class_od.u);
         Class_r.a = Class_bk.d((byte)80);
         if (Class_r.a != null) {
            Class_r.a.a(Class_od.u, true);
         }

         Class_tc.x = Class_ik.s;

         try {
            if (Class_rj.J.j != null) {
               Class_jb.Z = new Class_wa(Class_rj.J.j, 5200, 0);
               int var2 = 0;
               if (var3 != 0 || ~var2 > -28) {
                  do {
                     Class_df.b[var2] = new Class_wa(Class_rj.J.d[var2], 6000, 0);
                  } while (~(++var2) > -28);
               }

               Class_fg.k = new Class_wa(Class_rj.J.v, 6000, 0);
               Class_gk.d = new Class_p(255, Class_jb.Z, Class_fg.k, 500000);
               Class_db.T = new Class_wa(Class_rj.J.f, 24, 0);
               Class_rj.J.f = null;
               Class_rj.J.v = null;
               Class_rj.J.j = null;
               Class_rj.J.d = null;
            }
         } catch (IOException var4) {
            Class_jb.Z = null;
            Class_db.T = null;
            Class_fg.k = null;
            Class_gk.d = null;
         }

         if (~Class_rh.q != -1) {
            Class_qd.r = true;
         }

         Class_dc.v = Class_he.h;
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "client.B(" + var1 + ')');
      }
   }

   private final void b(int var1, int var2) {
      try {
         V++;
         if (var1 != -5) {
            this.c(-31);
         }

         label52: {
            Class_fk.Y = null;
            Class_oa.j = 0;
            if (~Class_sb.o == ~Class_ti.h) {
               Class_sb.o = Class_lk.r;
               if (lb == 0) {
                  break label52;
               }
            }

            Class_sb.o = Class_ti.h;
         }

         Class_wg.h++;
         Class_sj.m = null;
         if (~Class_wg.h > -3 || ~var2 != -8 && var2 != 9) {
            if (~Class_wg.h <= -3 && var2 == 6) {
               this.a(690, "js5connect_outofdate");
               Class_ua.b = 1000;
            } else if (~Class_wg.h <= -5) {
               if (Class_ua.b != 0 && ~Class_ua.b != -6) {
                  Class_ke.w = 3000;
               } else {
                  this.a(690, "js5connect");
                  Class_ua.b = 1000;
               }
            }
         } else if (~Class_ua.b != -1 && ~Class_ua.b != -6) {
            Class_ke.w = 3000;
         } else {
            this.a(var1 ^ -695, "js5connect_full");
            Class_ua.b = 1000;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "client.J(" + var1 + ',' + var2 + ')');
      }
   }

   static final boolean c(Class_ha var0) {
      if (Class_pe.E) {
         if (b(var0) != 0) {
            return false;
         }

         if (var0.Kc == 0) {
            return false;
         }
      }

      return var0.i;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final void a(byte var1) {
      int var6 = lb;

      try {
         ab++;
         if (Class_ua.b != 1000) {
            boolean var2 = Class_u.h(0);
            if (var2 && Class_vf.i && Class_ve.V != null) {
               Class_ve.V.b((byte)-100);
            }

            if (var1 >= -56) {
               this.init();
            }

            boolean var3;
            var3 = false;
            label177:
            if (~Class_ua.b == -31 || Class_ua.b == 10) {
               if (!Class_ma.bb) {
                  if (Class_fj.f == 0L || ~Class_fj.a(17161) >= ~Class_fj.f) {
                     break label177;
                  }

                  Class_h.a(-1);
                  if (var6 == 0) {
                     break label177;
                  }
               }

               Class_h.a(-1);
            }

            if (~Class_ng.h != -1L && ~Class_fj.a(17161) < ~Class_ng.h && Class_wf.k != null && (Class_ua.b == 30 || Class_ua.b == 25)) {
               Class_fe.c((byte)-118);
            }

            if (Class_sb.d) {
               var3 = true;
               Class_sb.d = false;
            }

            if (var3) {
               Class_me.a(0);
            }

            label189: {
               if (Class_ua.b == 0) {
                  Class_j.a(Class_rg.Q, null, Class_wj.v, var3, 23189);
                  if (var6 == 0) {
                     break label189;
                  }
               }

               if (Class_ua.b != 5) {
                  if (~Class_ua.b != -11) {
                     if (~Class_ua.b != -26 && ~Class_ua.b != -29) {
                        if (Class_ua.b != 30) {
                           if (~Class_ua.b != -41) {
                              break label189;
                           }

                           Class_mg.a(false, Class_o.a(2, new Class_r[]{Class_me.f, Class_ud.i, Class_uc.v}), -16678);
                           if (var6 == 0) {
                              break label189;
                           }
                        }

                        Class_oj.a(true);
                        if (var6 == 0) {
                           break label189;
                        }
                     }

                     if (~Class_cj.gb != -2) {
                        if (~Class_cj.gb != -3) {
                           Class_mg.a(false, Class_ld.T, -16678);
                           if (var6 == 0) {
                              break label189;
                           }
                        }

                        if (Class_ha.nd > Class_i.U) {
                           Class_i.U = Class_ha.nd;
                        }

                        int var4 = 50 - -(50 * (Class_i.U - Class_ha.nd) / Class_i.U);
                        Class_mg.a(false, Class_o.a(2, new Class_r[]{Class_ld.T, Class_p.k, Class_og.b(var4, 0), Class_nk.a}), -16678);
                        if (var6 == 0) {
                           break label189;
                        }
                     }

                     if (Class_kf.F < Class_ld.Z) {
                        Class_kf.F = Class_ld.Z;
                     }

                     int var11 = 50 * (Class_kf.F + -Class_ld.Z) / Class_kf.F;
                     Class_mg.a(false, Class_o.a(2, new Class_r[]{Class_ld.T, Class_p.k, Class_og.b(var11, 0), Class_nk.a}), -16678);
                     if (var6 == 0) {
                        break label189;
                     }
                  }

                  Class_jd.a((byte)46);
                  if (var6 == 0) {
                     break label189;
                  }
               }

               Class_gg.a(Class_db.sb, -27931);
            }

            label196: {
               if ((Class_ua.b == 30 || ~Class_ua.b == -11) && ~Class_ec.S == -1 && !var3) {
                  try {
                     Graphics var13 = Class_od.u.getGraphics();
                     int var15 = 0;
                     if (var6 != 0 || ~Class_jd.c < ~var15) {
                        do {
                           if (Class_n.u[var15]) {
                              Class_qe.s.a(var13, true, Class_cf.X[var15], Class_sd.f[var15], Class_mc.g[var15], Class_fa.pc[var15]);
                              Class_n.u[var15] = false;
                           }
                        } while (~Class_jd.c < ~(++var15));
                     }
                     break label196;
                  } catch (Exception var9) {
                     Class_od.u.repaint();
                     if (var6 == 0) {
                        break label196;
                     }
                  }
               }

               if (Class_ua.b != 0) {
                  try {
                     Graphics var12 = Class_od.u.getGraphics();
                     Class_qe.s.a(73, 0, 0, var12);
                     int var5 = 0;
                     if (var6 != 0 || Class_jd.c > var5) {
                        do {
                           Class_n.u[var5] = false;
                        } while (Class_jd.c > ++var5);
                     }
                  } catch (Exception var8) {
                     Class_od.u.repaint();
                  }
               }
            }

            if (Class_lg.e) {
               Class_se.f((byte)-128);
            }

            if (browsercontrol.iscreated() && Class_mc.f != 0) {
               try {
                  Point var14 = Class_od.u.getLocationOnScreen();
                  Dimension var16 = Class_od.u.getSize();
                  browsercontrol.set_position(var14.x, var14.y + -Class_mc.f, var16.width, Class_mc.f);
               } catch (Exception var7) {
               }
            }
         }
      } catch (RuntimeException var10) {
         throw Class_sh.a(var10, "client.C(" + var1 + ')');
      }
   }

   public static final void main(String[] var0) {
      int var2 = lb;

      try {
         try {
            if (var0.length < 7 || var0.length > 8) {
               Class_cj.b(28);
            }

            label122: {
               Class_sf.b = Integer.parseInt(var0[0]);
               if (var0[1].equals("live")) {
                  Class_rh.q = 0;
                  if (var2 == 0) {
                     break label122;
                  }
               }

               if (var0[1].equals("office")) {
                  Class_rh.q = 1;
                  if (var2 == 0) {
                     break label122;
                  }
               }

               if (var0[1].equals("local")) {
                  Class_rh.q = 2;
                  if (var2 == 0) {
                     break label122;
                  }
               }

               Class_cj.b(-5);
            }

            label123: {
               if (var0[2].equals("live")) {
                  Class_pg.z = 0;
                  if (var2 == 0) {
                     break label123;
                  }
               }

               if (var0[2].equals("rc")) {
                  Class_pg.z = 1;
                  if (var2 == 0) {
                     break label123;
                  }
               }

               if (!var0[2].equals("wip")) {
                  Class_cj.b(126);
                  if (var2 == 0) {
                     break label123;
                  }
               }

               Class_pg.z = 2;
            }

            label124: {
               if (var0[4].equals("free")) {
                  Class_vc.L = false;
                  if (var2 == 0) {
                     break label124;
                  }
               }

               if (var0[4].equals("members")) {
                  Class_vc.L = true;
                  if (var2 == 0) {
                     break label124;
                  }
               }

               Class_cj.b(116);
            }

            label125: {
               if (var0[5].equals("english")) {
                  Class_pi.sb = 0;
                  if (var2 == 0) {
                     break label125;
                  }
               }

               if (!var0[5].equals("german")) {
                  Class_cj.b(-44);
                  if (var2 == 0) {
                     break label125;
                  }
               }

               Class_ak.e(-40);
               Class_pi.sb = 1;
            }

            label126: {
               if (var0[6].equals("game0")) {
                  Class_u.W = 0;
                  if (var2 == 0) {
                     break label126;
                  }
               }

               if (!var0[6].equals("game1")) {
                  Class_cj.b(114);
                  if (var2 == 0) {
                     break label126;
                  }
               }

               Class_u.W = 1;
            }

            label64: {
               if (~var0.length == -9) {
                  if (var0[7].equals("safemode")) {
                     Class_fg.n = true;
                     if (var2 == 0) {
                        break label64;
                     }
                  }

                  Class_cj.b(127);
                  if (var2 == 0) {
                     break label64;
                  }
               }

               Class_fg.n = false;
            }

            Class_kc.r = "127.0.0.1";
            Class_df.c = Class_hk.S;
            Class_m.kb = 0;
            client var1 = new client();
            var1.a(765, 503, 109, 27, "runescape", 508, 32 - -Class_pg.z);
            Class_si.i.setLocation(40, 40);
         } catch (Exception var3) {
            Class_mc.a(null, var3, 38);
         }

         eb++;
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "client.main(" + (var0 != null ? "{...}" : "null") + ')');
      }
   }
}
