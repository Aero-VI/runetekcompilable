import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

final class Class_vf implements KeyListener, FocusListener {
   static int a;
   static int b;
   static int c;
   static int d;
   static Class_tg e = new Class_tg(4096);
   static int f;
   static byte[] g = new byte[520];
   static int h;
   static boolean i = false;
   static Class_lh j;
   static Class_qc k = new Class_qc(50);
   static int l = 0;

   static final void a(int var0) {
      try {
         Class_lh.xb = null;
         Class_oc.h = null;
         Class_bi.m = null;
         Class_id.v = null;
         Class_mh.Q = null;
         Class_kk.e = null;
         Class_va.cb = null;
         Class_sj.n = null;
         Class_mg.m = null;
         h++;
         Class_ga.u = null;
         if (var0 < 27) {
            b(-93);
         }

         Class_ii.S = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "vf.A(" + var0 + ')');
      }
   }

   public final void focusGained(FocusEvent var1) {
      try {
         b++;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "vf.focusGained(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   public final synchronized void keyPressed(KeyEvent var1) {
      try {
         d++;
         if (Class_lc.a != null) {
            int var2;
            label63: {
               Class_fb.p = 0;
               var2 = var1.getKeyCode();
               if (var2 < 0 || Class_fk.cb.length <= var2) {
                  var2 = -1;
                  if (client.lb == 0) {
                     break label63;
                  }
               }

               var2 = Class_fk.cb[var2];
               if ((var2 & 128) != 0) {
                  var2 = -1;
               }
            }

            if (Class_fb.b >= 0 && ~var2 <= -1) {
               Class_pa.i[Class_fb.b] = var2;
               Class_fb.b = 127 & 1 + Class_fb.b;
               if (~Class_fb.b == ~Class_wa.H) {
                  Class_fb.b = -1;
               }
            }

            if (var2 >= 0) {
               int var3 = 1 + Class_bb.l & 127;
               if (~var3 != ~Class_mb.s) {
                  Class_qd.q[Class_bb.l] = var2;
                  Class_ke.n[Class_bb.l] = -1;
                  Class_bb.l = var3;
               }
            }

            int var5 = var1.getModifiers();
            if (~(10 & var5) != -1 || var2 == 85 || ~var2 == -11) {
               var1.consume();
            }
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "vf.keyPressed(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   public static void b(int var0) {
      try {
         g = null;
         k = null;
         e = null;
         if (var0 == 24205) {
            j = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "vf.B(" + var0 + ')');
      }
   }

   public final synchronized void keyReleased(KeyEvent var1) {
      try {
         if (Class_lc.a != null) {
            int var4;
            label32: {
               Class_fb.p = 0;
               var4 = var1.getKeyCode();
               if (var4 >= 0 && Class_fk.cb.length > var4) {
                  var4 = Class_fk.cb[var4] & -129;
                  if (client.lb == 0) {
                     break label32;
                  }
               }

               var4 = -1;
            }

            if (~Class_fb.b <= -1 && var4 >= 0) {
               Class_pa.i[Class_fb.b] = ~var4;
               Class_fb.b = 127 & Class_fb.b + 1;
               if (~Class_wa.H == ~Class_fb.b) {
                  Class_fb.b = -1;
               }
            }
         }

         var1.consume();
         a++;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "vf.keyReleased(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   public final synchronized void focusLost(FocusEvent var1) {
      try {
         if (Class_lc.a != null) {
            Class_fb.b = -1;
         }

         c++;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "vf.focusLost(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   public Class_vf() {
   }

   public final void keyTyped(KeyEvent var1) {
      try {
         f++;
         if (Class_lc.a != null) {
            int var2 = Class_pe.a(true, var1);
            if (~var2 <= -1) {
               int var3 = 1 + Class_bb.l & 127;
               if (~Class_mb.s != ~var3) {
                  Class_qd.q[Class_bb.l] = -1;
                  Class_ke.n[Class_bb.l] = var2;
                  Class_bb.l = var3;
               }
            }
         }

         var1.consume();
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "vf.keyTyped(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }
}
