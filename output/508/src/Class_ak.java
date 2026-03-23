import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

final class Class_ak extends Class_me implements ImageProducer, ImageObserver {
   static int w;
   static int x;
   static int y;
   static int z;
   static int A;
   static int B;
   static int C;
   static int D;
   static int E;
   static int F;
   static Class_nj G = new Class_nj(64);
   static int H;
   static int I;
   static Class_r J = Class_ak.T;
   static Class_r K = Class_ak.M;
   static int[] L = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
   private static Class_r M = Class_tc.a(43, " has logged out)3");
   static int N;
   static Class_qf O;
   static Class_r P = Class_ak.R;
   private ColorModel Q;
   private static Class_r R = Class_tc.a(43, "Allocating memory");
   static int S;
   private static Class_r T = Class_tc.a(43, "scroll:");
   static int U;
   static int V;
   static int W;
   static long X;
   static int Y;
   private static Class_r Z = Class_tc.a(43, "scrollen:");
   static Class_r ab = T;
   private ImageConsumer bb;

   static final void a(int var0, Component var1) {
      try {
         w++;
         int var2 = 121 % ((var0 - -20) / 60);
         var1.addMouseListener(Class_fb.g);
         var1.addMouseMotionListener(Class_fb.g);
         var1.addFocusListener(Class_fb.g);
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ak.V(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   public final synchronized boolean isConsumer(ImageConsumer var1) {
      try {
         F++;
         return this.bb == var1;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ak.isConsumer(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   public final void startProduction(ImageConsumer var1) {
      try {
         this.addConsumer(var1);
         y++;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ak.startProduction(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   private final synchronized void b(boolean var1) {
      try {
         W++;
         if (this.bb != null) {
            this.bb.setPixels(0, 0, super.v, super.h, this.Q, super.g, 0, super.v);
            this.bb.imageComplete(2);
            if (var1) {
               T = null;
            }
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ak.S(" + var1 + ')');
      }
   }

   public final synchronized void removeConsumer(ImageConsumer var1) {
      try {
         if (var1 == this.bb) {
            this.bb = null;
         }

         z++;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ak.removeConsumer(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   static final void a(int var0, int var1) {
      try {
         if (var1 >= -54) {
            J = null;
         }

         C++;
         Class_qd var2 = (Class_qd)Class_f.X.a(var0, 117);
         if (var2 != null) {
            var2.c(-17554);
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ak.P(" + var0 + ',' + var1 + ')');
      }
   }

   static final void a(Class_r[] var0, short[] var1, int var2) {
      try {
         I++;
         Class_jj.a(var0, var1, -1 + var0.length, false, 0);
         int var3 = 44 / ((1 - var2) / 48);
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "ak.Q(" + (var0 != null ? "{...}" : "null") + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
      }
   }

   public final boolean imageUpdate(Image var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         D++;
         return true;
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "ak.imageUpdate(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
      }
   }

   private final synchronized void a(int var1, int var2, byte var3, int var4, int var5) {
      try {
         A++;
         if (this.bb != null) {
            if (var3 != 87) {
               K = null;
            }

            this.bb.setPixels(var1, var2, var5, var4, this.Q, super.g, var2 * super.v - -var1, super.v);
            this.bb.imageComplete(2);
         }
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "ak.T(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
      }
   }

   static final void b(byte var0) {
      try {
         H++;
         if (Class_c.u > 0) {
            Class_be.a((byte)-113);
         } else {
            Class_sf.a = Class_wf.k;
            Class_wf.k = null;
            if (var0 != -21) {
               e(-15);
            }

            Class_ca.a(40, (byte)-69);
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ak.U(" + var0 + ')');
      }
   }

   public final synchronized void addConsumer(ImageConsumer var1) {
      try {
         this.bb = var1;
         var1.setDimensions(super.v, super.h);
         B++;
         var1.setProperties(null);
         var1.setColorModel(this.Q);
         var1.setHints(14);
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ak.addConsumer(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   final void a(Component var1, int var2, int var3, int var4) {
      try {
         super.v = var2;
         super.h = var4;
         super.g = new int[1 + var4 * var2];
         E++;
         this.Q = new DirectColorModel(32, 16711680, 65280, 255);
         super.n = var1.createImage(this);
         this.b(false);
         var1.prepareImage(super.n, this);
         int var5 = -100 % ((-80 - var3) / 38);
         this.b(false);
         var1.prepareImage(super.n, this);
         this.b(false);
         var1.prepareImage(super.n, this);
         this.c(25);
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "ak.D(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + var4 + ')');
      }
   }

   final void a(int var1, int var2, int var3, Graphics var4) {
      try {
         this.b(false);
         if (var1 > 72) {
            var4.drawImage(super.n, var2, var3, this);
            x++;
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "ak.G(" + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ')');
      }
   }

   public static void c(byte var0) {
      try {
         L = null;
         G = null;
         O = null;
         T = null;
         ab = null;
         int var1 = 1 % ((74 - var0) / 49);
         R = null;
         J = null;
         M = null;
         K = null;
         Z = null;
         P = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ak.W(" + var0 + ')');
      }
   }

   static final void e(int var0) {
      try {
         Class_oc.r = Class_bh.b;
         Class_rd.bb = Class_a.k;
         Class_ve.jb = Class_vd.h;
         Class_wb.a = Class_je.e;
         Class_la.V = Class_ai.y;
         Class_jf.i = Class_ob.ab;
         Class_rf.f = Class_nk.h;
         Class_gg.C = Class_sg.mb;
         Class_eb.b = Class_hd.i;
         Class_ia.X = Class_fk.eb;
         Class_ka.ib = Class_th.i;
         Class_fd.h = Class_kc.t;
         Class_oc.m = Class_nk.b;
         Class_id.m = Class_sf.k;
         Class_oa.f = Class_hk.M;
         Class_me.f = Class_ee.X;
         Class_ua.n = Class_bc.S;
         Class_mk.c = Class_bi.t;
         Class_di.V = Class_wh.n;
         Class_uc.v = Class_se.mb;
         Class_wa.G = Class_vh.bb;
         Class_uh.b = Class_cd.L;
         Class_ha.md = Class_vc.p;
         Class_s.ab = Class_sf.m;
         Class_ld.R = Class_pe.y;
         Class_he.h = Class_ji.Z;
         Class_qb.o = Class_th.c;
         Class_vc.A = Class_ob.T;
         Class_ka.kb = Class_ed.l;
         Class_rh.m = Class_ek.h;
         Class_md.v = Class_p.a;
         Class_hh.k = Class_sd.c;
         Class_ug.p = Class_qb.l;
         Class_di.Y = Class_ed.c;
         Class_qb.q = Class_jc.p;
         Class_fa.zc = Class_rc.b;
         Class_tb.g = Class_kk.m;
         if (var0 < -19) {
            Class_ek.c = Class_ia.hb;
            Class_cb.k = Class_nf.z;
            Class_nb.c = Class_cj.db;
            Class_b.I = Class_f.Y;
            K = Class_fb.k;
            Class_mg.h = Class_fa.Yb;
            Class_te.Q = Class_nd.X;
            Class_s.Z = Class_nf.O;
            Class_ta.tb = Class_jb.bb;
            Class_wc.O = Class_he.d;
            Class_dj.y = Class_pa.B;
            Class_ch.c = Class_sh.h;
            Class_rd.ab = Class_a.k;
            Class_aj.u = Class_jd.d;
            ab = Z;
            Class_ld.T = Class_cc.Nb;
            Class_uc.C = Class_nb.a;
            Class_ch.d = Class_vg.v;
            Class_hg.h = Class_o.ab;
            S++;
            Class_je.n = Class_ef.r;
            Class_mc.b = Class_og.ib;
            Class_og.V = Class_nf.u;
            Class_ud.k = Class_mj.b;
            Class_od.j = Class_li.m;
            Class_mg.o = Class_ok.Z;
            Class_cb.x = Class_nf.z;
            Class_r.eb = Class_rj.H;
            Class_nj.y = Class_hk.L;
            Class_jc.r = Class_u.cb;
            Class_fg.q = Class_fg.g;
            Class_lj.d = Class_rc.d;
            Class_rh.j = Class_si.h;
            Class_lg.h = Class_ib.R;
            Class_ud.h = Class_fk.ab;
            Class_mj.c = Class_sc.a;
            Class_ke.r = Class_oa.i;
            Class_ha.id = Class_w.P;
            Class_jg.i = Class_pb.m;
            Class_ma.ab = Class_fg.i;
            Class_i.tb = Class_f.Z;
            Class_i.db = Class_f.Z;
            Class_ce.Z = Class_wa.r;
            Class_vd.b = Class_hg.k;
            P = Class_m.lb;
            Class_be.x = Class_rh.g;
            Class_wa.f = Class_ga.a;
            Class_wg.g = Class_oa.h;
            Class_rd.Q = Class_bi.a;
            Class_lg.b = Class_ib.Y;
            Class_nj.k = Class_g.j;
            Class_oj.lb = Class_ih.U;
            Class_ui.a = Class_bg.b;
            Class_m.mb = Class_fa.oc;
            Class_o.cb = Class_ka.sb;
            Class_dd.ub = Class_cf.P;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ak.R(" + var0 + ')');
      }
   }

   final void a(Graphics var1, boolean var2, int var3, int var4, int var5, int var6) {
      try {
         N++;
         this.a(var4, var5, (byte)87, var6, var3);
         Shape var7 = var1.getClip();
         if (!var2) {
            c((byte)40);
         }

         var1.clipRect(var4, var5, var3, var6);
         var1.drawImage(super.n, 0, 0, this);
         var1.setClip(var7);
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "ak.M(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
      }
   }

   public final void requestTopDownLeftRightResend(ImageConsumer var1) {
      try {
         Y++;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ak.requestTopDownLeftRightResend(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   public Class_ak() {
   }
}
