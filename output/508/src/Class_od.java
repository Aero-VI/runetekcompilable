import java.awt.Canvas;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

final class Class_od implements MouseListener, MouseMotionListener, FocusListener {
   static int a;
   static Class_cj b;
   static int c = 0;
   private static Class_r d = Class_tc.a(43, "Loading)3)3)3");
   static Class_r e = Class_tc.a(43, "sl_stars");
   static int f;
   static int g = 0;
   static int h;
   static int i;
   static Class_r j = d;
   static long[] k = new long[32];
   static int l = -1;
   static int m;
   static int n;
   static int o;
   static int p;
   static int q;
   static int r;
   static int s;
   static int t;
   static Canvas u;
   static int v;

   public final void focusGained(FocusEvent var1) {
      try {
         m++;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "od.focusGained(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   static final void a(int var0, int var1) {
      try {
         p++;
         Class_od var2 = Class_fb.g;
         synchronized (var2) {
            Class_ch.o = var0;
         }

         if (var1 != 0) {
            u = null;
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "od.B(" + var0 + ',' + var1 + ')');
      }
   }

   public final void mouseClicked(MouseEvent var1) {
      try {
         i++;
         if (var1.isPopupTrigger()) {
            var1.consume();
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "od.mouseClicked(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   public final synchronized void mouseExited(MouseEvent var1) {
      try {
         a++;
         if (Class_fb.g != null) {
            Class_ch.o = 0;
            Class_ti.t = -1;
            Class_qj.R = -1;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "od.mouseExited(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   public final synchronized void mouseDragged(MouseEvent var1) {
      try {
         o++;
         if (Class_fb.g != null) {
            Class_ch.o = 0;
            Class_ti.t = var1.getX();
            Class_qj.R = var1.getY();
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "od.mouseDragged(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   public static void a(int var0) {
      try {
         b = null;
         d = null;
         j = null;
         k = null;
         u = null;
         if (var0 != -20033) {
            a(37);
         }

         e = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "od.E(" + var0 + ')');
      }
   }

   public Class_od() {
   }

   public final synchronized void focusLost(FocusEvent var1) {
      try {
         s++;
         if (Class_fb.g != null) {
            client.Y = 0;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "od.focusLost(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   public final synchronized void mousePressed(MouseEvent var1) {
      try {
         q++;
         if (Class_fb.g != null) {
            label28: {
               Class_ch.o = 0;
               Class_bg.c = var1.getX();
               Class_he.j = var1.getY();
               Class_i.lb = Class_fj.a(17161);
               if (!var1.isMetaDown()) {
                  Class_vd.f = 1;
                  client.Y = 1;
                  if (client.lb == 0) {
                     break label28;
                  }
               }

               Class_vd.f = 2;
               client.Y = 2;
            }

            int var2 = var1.getModifiers();
         }

         if (var1.isPopupTrigger()) {
            var1.consume();
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "od.mousePressed(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   public final synchronized void mouseMoved(MouseEvent var1) {
      try {
         if (Class_fb.g != null) {
            Class_ch.o = 0;
            Class_ti.t = var1.getX();
            Class_qj.R = var1.getY();
         }

         n++;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "od.mouseMoved(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   public final synchronized void mouseReleased(MouseEvent var1) {
      try {
         if (Class_fb.g != null) {
            Class_ch.o = 0;
            client.Y = 0;
            int var2 = var1.getModifiers();
         }

         f++;
         if (var1.isPopupTrigger()) {
            var1.consume();
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "od.mouseReleased(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   public final synchronized void mouseEntered(MouseEvent var1) {
      try {
         if (Class_fb.g != null) {
            Class_ch.o = 0;
            Class_ti.t = var1.getX();
            Class_qj.R = var1.getY();
         }

         t++;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "od.mouseEntered(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   static final int a(int var0, int var1, int var2, byte var3) {
      try {
         h++;
         if (~(8 & Class_kk.c[var1][var2][var0]) != -1) {
            return 0;
         } else if (var3 >= -43) {
            return 117;
         } else {
            return var1 > 0 && (Class_kk.c[1][var2][var0] & 2) != 0 ? var1 + -1 : var1;
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "od.D(" + var0 + 44 + var1 + 44 + var2 + 44 + var3 + 41);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(byte var0, double var1) {
      int var5 = client.lb;

      try {
         if (var1 != Class_sf.e) {
            int var3 = 0;
            if (var5 != 0 || var3 < 256) {
               do {
                  int var4 = (int)(Math.pow(var3 / 255.0, var1) * 255.0);
                  Class_ke.l[var3] = ~var4 >= -256 ? var4 : 255;
               } while (++var3 < 256);
            }

            Class_sf.e = var1;
         }

         v++;
         if (var0 != 47) {
            a(-26, -31, -30, (byte)79);
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "od.A(" + var0 + ',' + var1 + ')');
      }
   }

   static final boolean a(int var0, int var1, int var2, long var3) {
      Class_aa var5 = Class_ck.d[var0][var1][var2];
      if (var5 == null) {
         return false;
      } else if (var5.s != null && var5.s.j == var3) {
         return true;
      } else if (var5.z != null && var5.z.t == var3) {
         return true;
      } else if (var5.M != null && var5.M.m == var3) {
         return true;
      } else {
         for (int var6 = 0; var6 < var5.G; var6++) {
            if (var5.H[var6].k == var3) {
               return true;
            }
         }

         return false;
      }
   }
}
