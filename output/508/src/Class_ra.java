import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;

public abstract class Class_ra extends Applet implements Runnable, FocusListener, WindowListener {
   static int a;
   static int b;
   static int c;
   static int d;
   static int e;
   private boolean f = false;
   static int g;
   static int h;
   static int i;
   static int j;
   static int k;
   static int l;
   static int m;
   static int n;
   static int o;
   static int p;
   private static Class_r q = Class_tc.a(43, "http:)4)4advert)3runescape)3com)4banner)3ws?size=729");
   static int r;
   static int s;
   static int t;
   static int u;
   static int v;
   static int w;
   static int x;
   static int y;
   static int z;
   static int A;
   static int B;
   static int C;
   static int D;
   static Class_r E = q;
   static int F;
   static Class_r G = Class_tc.a(43, "; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");
   static int H;
   static int I;
   static Class_r J = Class_tc.a(43, "titlebg");
   static int K;
   static int L;
   static int M;
   static int N;
   static int O;
   public static boolean P;
   public static boolean Q;
   public static boolean R;

   abstract void a(byte var1);

   public final synchronized void paint(Graphics var1) {
      try {
         l++;
         if (this == Class_lj.i && !Class_wf.f) {
            Class_sb.d = true;
            if (Class_ik.w != null && Class_ik.w.startsWith("1.5") && Class_fj.a(17161) - Class_bj.e > 1000L) {
               Rectangle var2 = var1.getClipBounds();
               if (var2 == null || var2.width >= Class_w.O && ~var2.height <= ~Class_cj.fb) {
                  Class_ma.bb = true;
               }
            }
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ra.paint(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   public final void focusLost(FocusEvent var1) {
      try {
         Class_lj.a = false;
         o++;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ra.focusLost(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   public final void windowDeactivated(WindowEvent var1) {
      try {
         F++;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ra.windowDeactivated(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   public final void windowClosed(WindowEvent var1) {
      try {
         i++;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ra.windowClosed(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public final void run() {
      int var3 = client.lb;

      try {
         D++;

         try {
            label109: {
               if (Class_ik.a != null) {
                  String var1 = Class_ik.a.toLowerCase();
                  if (var1.indexOf("sun") == -1 && ~var1.indexOf("apple") == 0) {
                     if (var1.indexOf("ibm") != -1 && (Class_ik.w == null || Class_ik.w.equals("1.4.2"))) {
                        this.a(690, "wrongjava");
                        return;
                     }
                  } else {
                     String var2 = Class_ik.w;
                     if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.a(690, "wrongjava");
                        return;
                     }

                     Class_sj.f = 5;
                  }
               }

               if (Class_rj.J.g != null) {
                  Method var7 = Class_ik.i;
                  if (var7 != null) {
                     try {
                        var7.invoke(Class_rj.J.g, Boolean.TRUE);
                     } catch (Throwable var4) {
                     }
                  }
               }

               this.e((byte)-104);
               Class_qe.s = Class_e.a(Class_od.u, Class_l.u, Class_fk.R, -115);
               this.c(-1);
               Class_qj.Q = Class_me.d(-86);
               int var8;
               if (var3 != 0) {
                  Class_mh.V = Class_qj.Q.a(Class_sj.f, -19, Class_mk.a);
                  var8 = 0;
                  if (var3 != 0) {
                     this.d((byte)-71);
                     var8++;
                  }
               } else {
                  if (~Class_c.y != -1L && ~Class_fj.a(17161) <= ~Class_c.y) {
                     break label109;
                  }

                  Class_mh.V = Class_qj.Q.a(Class_sj.f, -19, Class_mk.a);
                  var8 = 0;
                  if (var3 != 0) {
                     this.d((byte)-71);
                     var8++;
                  }
               }

               while (true) {
                  while (~var8 > ~Class_mh.V) {
                     this.d((byte)-71);
                     var8++;
                  }

                  this.b(-16633);
                  Class_hc.a(Class_rj.J, Class_od.u, (byte)-108);
                  if (~Class_c.y != -1L && ~Class_fj.a(17161) <= ~Class_c.y) {
                     break;
                  }

                  Class_mh.V = Class_qj.Q.a(Class_sj.f, -19, Class_mk.a);
                  var8 = 0;
                  if (var3 != 0) {
                     this.d((byte)-71);
                     var8++;
                  }
               }
            }
         } catch (Exception var5) {
            Class_mc.a(null, var5, 38);
            this.a(690, "crash");
         }

         this.a(true, 1000);
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "ra.run(" + ')');
      }
   }

   final void a(int var1, String var2) {
      try {
         t++;
         if (!this.f) {
            this.f = true;
            if (var1 == 690) {
               System.out.println("error_game_" + var2);

               try {
                  this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var2 + ".ws"), "_top");
               } catch (Exception var4) {
               }
            }
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "ra.CA(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
      }
   }

   public final void windowOpened(WindowEvent var1) {
      try {
         y++;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ra.windowOpened(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   static final boolean a(byte var0, int var1) {
      try {
         M++;
         if (~var1 > -1) {
            return false;
         } else if (var0 > -120) {
            return false;
         } else {
            short var2 = Class_dd.I[var1];
            if (var2 >= 2000) {
               var2 -= 2000;
            }

            return ~var2 == -1008;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ra.DA(" + var0 + ',' + var1 + ')');
      }
   }

   static final Class_cf a(int var0, int var1) {
      try {
         if (var0 != -25672) {
            G = null;
         }

         c++;
         Class_cf var2 = (Class_cf)Class_cg.j.a(14366, (long)var1);
         if (var2 != null) {
            return var2;
         } else {
            byte[] var3 = Class_od.b.a(Class_uf.c(var1, 255), var0 + 25672, Class_bj.a(var1, (byte)117));
            var2 = new Class_cf();
            var2.x = var1;
            if (var3 != null) {
               var2.a((byte)-7, new Class_lh(var3));
            }

            var2.b(var0 ^ -25671);
            if (var2.gb != -1) {
               var2.a((byte)-106, a(-25672, var2.Z), a(var0, var2.gb));
            }

            if (~var2.m != 0) {
               var2.a(a(-25672, var2.m), var0 ^ 25718, a(-25672, var2.s));
            }

            if (!Class_c.t && var2.S) {
               var2.Q = null;
               var2.J = Class_je.n;
               var2.eb = 0;
               var2.N = false;
               var2.n = null;
            }

            Class_cg.j.a(var2, 106, var1);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "ra.FA(" + var0 + ',' + var1 + ')');
      }
   }

   final void a(int var1, int var2, int var3, int var4, int var5) {
      try {
         C++;

         try {
            if (Class_lj.i != null) {
               Class_fh.M++;
               if (~Class_fh.M <= -4) {
                  this.a(690, "alreadyloaded");
               } else {
                  this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
               }
            } else {
               Class_id.u = 0;
               Class_lj.i = this;
               Class_oj.bb = 0;
               Class_pc.e = var5;
               Class_l.u = var4;
               Class_w.O = var4;
               Class_fk.R = var3;
               Class_cj.fb = var3;
               String var6 = this.getParameter("openwinjs");
               if (var6 != null && var6.equals("1")) {
                  boolean var9 = true;
               } else {
                  boolean var10000 = false;
               }

               if (var1 < -1) {
                  if (Class_rj.J == null) {
                     Class_oc.g = Class_rj.J = new Class_ik(false, this, var2, null, 0);
                  }

                  Class_rj.J.a((byte)-95, 1, this);
               }
            }
         } catch (Exception var7) {
            Class_mc.a(null, var7, 38);
            this.a(690, "crash");
         }
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "ra.AA(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
      }
   }

   public final void stop() {
      try {
         j++;
         if (this == Class_lj.i && !Class_wf.f) {
            Class_c.y = Class_fj.a(17161) - -4000L;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ra.stop(" + ')');
      }
   }

   private final void a(boolean var1, int var2) {
      try {
         k++;
         synchronized (this) {
            if (Class_wf.f) {
               return;
            }

            Class_wf.f = true;
         }

         if (Class_rj.J.g != null) {
            Class_rj.J.g.destroy();
         }

         try {
            this.d(-121);
         } catch (Exception var14) {
         }

         if (Class_od.u != null) {
            try {
               Class_od.u.removeFocusListener(this);
               Class_od.u.getParent().remove(Class_od.u);
            } catch (Exception var13) {
            }
         }

         if (Class_rj.J != null) {
            try {
               Class_rj.J.a(0);
            } catch (Exception var12) {
            }
         }

         if (var2 != 1000) {
            b = -96;
         }

         this.a(-61);
         if (Class_si.i != null) {
            try {
               System.exit(0);
            } catch (Throwable var11) {
            }
         }

         System.out.println("Shutdown complete - clean:" + var1);
      } catch (RuntimeException var16) {
         throw Class_sh.a(var16, "ra.T(" + var1 + ',' + var2 + ')');
      }
   }

   final void a(int var1, int var2, int var3, int var4, String var5, int var6, int var7) {
      try {
         N++;

         try {
            Class_oj.bb = 0;
            Class_id.u = 0;
            Class_l.u = var1;
            Class_w.O = var1;
            Class_lj.i = this;
            Class_pc.e = var6;
            Class_fk.R = var2;
            Class_cj.fb = var2;
            Class_si.i = new Frame();
            Class_si.i.setTitle("Jagex");
            Class_si.i.setResizable(true);
            Class_si.i.addWindowListener(this);
            Class_si.i.setVisible(true);
            Class_si.i.toFront();
            Insets var8 = Class_si.i.getInsets();
            Class_si.i.setSize(var8.left + Class_w.O + var8.right, Class_cj.fb - -var8.top + var8.bottom);
            Class_oc.g = Class_rj.J = new Class_ik(true, null, var7, var5, var4);
            Class_rj.J.a((byte)-36, 1, this);
            if (var3 < 86) {
               this.getDocumentBase();
            }
         } catch (Exception var9) {
            Class_mc.a(null, var9, 38);
         }
      } catch (RuntimeException var10) {
         throw Class_sh.a(
            var10, "ra.EA(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + (var5 != null ? "{...}" : "null") + ',' + var6 + ',' + var7 + ')'
         );
      }
   }

   public final void windowDeiconified(WindowEvent var1) {
      try {
         e++;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ra.windowDeiconified(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   public final URL getDocumentBase() {
      try {
         n++;
         if (Class_si.i != null) {
            return null;
         } else {
            return Class_rj.J != null && this != Class_rj.J.g ? Class_rj.J.g.getDocumentBase() : super.getDocumentBase();
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ra.getDocumentBase(" + ')');
      }
   }

   public static void b(byte var0) {
      try {
         int var1 = 35 / ((-70 - var0) / 44);
         q = null;
         E = null;
         J = null;
         G = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ra.R(" + var0 + ')');
      }
   }

   public abstract void init();

   abstract void a(int var1);

   public static final void providesignlink(Class_ik var0) {
      try {
         h++;
         Class_rj.J = var0;
         Class_oc.g = var0;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ra.providesignlink(" + (var0 != null ? "{...}" : "null") + ')');
      }
   }

   private final void b(int var1) {
      try {
         z++;
         long var2 = Class_fj.a(17161);
         long var4 = Class_od.k[Class_ec.Q];
         if (var1 != -16633) {
            providesignlink(null);
         }

         Class_od.k[Class_ec.Q] = var2;
         if (var4 != 0L && var2 > var4) {
            int var6 = (int)(-var4 + var2);
            Class_fd.g = ((var6 >> -1620937215) + 32000) / var6;
         }

         Class_ec.Q = 1 + Class_ec.Q & 31;
         label28:
         if (~(Class_oc.c++) < -51) {
            Class_sb.d = true;
            Class_oc.c -= 50;
            Class_od.u.setSize(Class_l.u, Class_fk.R);
            Class_od.u.setVisible(true);
            if (Class_si.i == null || Class_fc.p != null) {
               Class_od.u.setLocation(Class_id.u, Class_oj.bb);
               if (client.lb == 0) {
                  break label28;
               }
            }

            Insets var8 = Class_si.i.getInsets();
            Class_od.u.setLocation(var8.left - -Class_id.u, Class_oj.bb + var8.top);
         }

         this.a((byte)-75);
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "ra.U(" + var1 + ')');
      }
   }

   public final void windowActivated(WindowEvent var1) {
      try {
         K++;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ra.windowActivated(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   final boolean c(byte var1) {
      try {
         String var2 = this.getDocumentBase().getHost().toLowerCase();
         I++;
         if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
         } else if (!var2.equals("runescape.com") && !var2.endsWith(".runescape.com")) {
            int var3 = 105 / ((var1 - 9) / 35);
            if (var2.endsWith("127.0.0.1")) {
               return true;
            } else {
               while (var2.length() > 0 && ~var2.charAt(var2.length() + -1) <= -49 && ~var2.charAt(-1 + var2.length()) >= -58) {
                  var2 = var2.substring(0, -1 + var2.length());
               }

               if (var2.endsWith("192.168.1.")) {
                  return true;
               } else {
                  this.a(690, "invalidhost");
                  return false;
               }
            }
         } else {
            return true;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "ra.V(" + var1 + ')');
      }
   }

   abstract void c(int var1);

   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         r++;
         if (var4 != 1000) {
            g = -56;
         }

         if (~Class_ga.v >= ~var6 && ~Class_tg.r <= ~var3 && ~Class_ff.d >= ~var7 && Class_hh.h >= var1) {
            Class_me.a(var2, var6, var1, var5, var7, var3, var0, var4 + -18229);
         } else {
            Class_aj.a(var2, var7, var3, var0, var5, var1, false, var6);
         }
      } catch (RuntimeException var9) {
         throw Class_sh.a(var9, "ra.GA(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
      }
   }

   public final URL getCodeBase() {
      try {
         s++;
         if (Class_si.i != null) {
            return null;
         } else {
            return Class_rj.J != null && Class_rj.J.g != this ? Class_rj.J.g.getCodeBase() : super.getCodeBase();
         }
      } catch (RuntimeException var2) {
         throw var2;
      }
   }

   abstract void d(int var1);

   private final void d(byte var1) {
      try {
         long var2 = Class_fj.a(17161);
         a++;
         long var4 = Class_vd.c[Class_bi.b];
         Class_vd.c[Class_bi.b] = var2;
         Class_bi.b = 1 + Class_bi.b & 31;
         synchronized (this) {
            if (var1 > -60) {
               this.destroy();
            }

            Class_bj.g = Class_lj.a;
         }

         this.e(2);
         if (var4 != 0L && var4 < var2) {
            boolean var11 = true;
         } else {
            boolean var10000 = false;
         }
      } catch (RuntimeException var10) {
         throw Class_sh.a(var10, "ra.W(" + var1 + ')');
      }
   }

   public final void windowIconified(WindowEvent var1) {
      try {
         O++;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ra.windowIconified(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   public final void update(Graphics var1) {
      try {
         this.paint(var1);
         B++;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ra.update(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   public final void focusGained(FocusEvent var1) {
      try {
         Class_lj.a = true;
         Class_sb.d = true;
         d++;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ra.focusGained(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   public final String getParameter(String var1) {
      try {
         x++;
         if (Class_si.i != null) {
            return null;
         } else {
            return Class_rj.J != null && this != Class_rj.J.g ? Class_rj.J.g.getParameter(var1) : super.getParameter(var1);
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ra.getParameter(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   final synchronized void e(byte var1) {
      int var5 = client.lb;

      try {
         if (Class_od.u != null) {
            Class_od.u.removeFocusListener(this);
            Class_od.u.getParent().remove(Class_od.u);
         }

         Object var2;
         label32: {
            int var3 = 42 / ((32 - var1) / 53);
            if (Class_fc.p == null) {
               if (Class_si.i != null) {
                  var2 = Class_si.i;
                  if (var5 == 0) {
                     break label32;
                  }
               }

               var2 = Class_rj.J.g;
               if (var5 == 0) {
                  break label32;
               }
            }

            var2 = Class_fc.p;
         }

         label24: {
            w++;
            ((java.awt.Container)var2).setLayout(null);
            Class_od.u = new Class_hc(this);
            ((java.awt.Container)var2).add(Class_od.u);
            Class_od.u.setSize(Class_l.u, Class_fk.R);
            Class_od.u.setVisible(true);
            if (Class_si.i != var2) {
               Class_od.u.setLocation(Class_id.u, Class_oj.bb);
               if (var5 == 0) {
                  break label24;
               }
            }

            Insets var4 = Class_si.i.getInsets();
            Class_od.u.setLocation(var4.left - -Class_id.u, Class_oj.bb + var4.top);
         }

         Class_od.u.addFocusListener(this);
         Class_od.u.requestFocus();
         Class_lj.a = true;
         Class_bj.g = true;
         Class_sb.d = true;
         Class_ma.bb = false;
         Class_bj.e = Class_fj.a(17161);
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "ra.S(" + var1 + ')');
      }
   }

   static final int a(Class_fa var0, int var1) {
      try {
         L++;
         if (var1 != -6694) {
            providesignlink(null);
         }

         int var2 = var0.gc;
         if (~var0.w != ~var0.C) {
            if (~var0.w == ~var0.M) {
               var2 = var0.Ub;
            }
         } else {
            var2 = var0.Nb;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ra.BA(" + (var0 != null ? "{...}" : "null") + 44 + var1 + 41);
      }
   }

   public final void start() {
      try {
         m++;
         if (Class_lj.i == this && !Class_wf.f) {
            Class_c.y = 0L;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ra.start(" + ')');
      }
   }

   abstract void e(int var1);

   public final void windowClosing(WindowEvent var1) {
      try {
         H++;
         this.destroy();
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ra.windowClosing(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   public final AppletContext getAppletContext() {
      try {
         u++;
         if (Class_si.i != null) {
            return null;
         } else {
            return Class_rj.J != null && this != Class_rj.J.g ? Class_rj.J.g.getAppletContext() : super.getAppletContext();
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ra.getAppletContext(" + ')');
      }
   }

   public final void destroy() {
      try {
         A++;
         if (Class_lj.i == this && !Class_wf.f) {
            Class_c.y = Class_fj.a(17161);
            Class_hg.a(-5, 5000L);
            Class_oc.g = null;
            this.a(false, 1000);
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ra.destroy(" + ')');
      }
   }
}
