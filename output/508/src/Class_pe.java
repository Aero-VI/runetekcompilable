import java.awt.Component;
import java.awt.event.KeyEvent;

class Class_pe extends Class_li {
   static Class_ph p;
   static short q = 1;
   static Class_sg[] r = new Class_sg[256];
   static int s;
   static int t;
   static int u;
   long v;
   static int w = 0;
   Class_pe x;
   static Class_r y = Class_tc.a(43, "Benutzeroberfl-=che geladen)3");
   static int z;
   static int[] A;
   static Class_r B = Class_tc.a(43, "(R");
   Class_pe C;
   static Class_r[] D;
   static boolean E = false;
   static byte[][][] F;
   static int G;
   static int H;

   public static void a(byte var0) {
      try {
         p = null;
         B = null;
         r = null;
         D = null;
         if (var0 > -13) {
            z = 57;
         }

         F = null;
         y = null;
         A = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "pe.KA(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, byte var8) {
      int var10 = client.lb;

      try {
         H++;
         if (!Class_oj.b(var4, (byte)-2)) {
            if (~var5 != 0) {
               Class_vb.j[var5] = true;
            } else {
               int var9 = 0;
               if (var10 != 0 || var9 < 100) {
                  do {
                     Class_vb.j[var9] = true;
                  } while (++var9 < 100);
               }
            }
         } else {
            Class_sb.e = null;
            if (var8 != -112) {
               A = null;
            }

            Class_oi.a(var2, -21644, var1, Class_ve.ab[var4], var7, var5, var0, var3, -1, var6);
            if (Class_sb.e != null) {
               Class_oi.a(var2, -21644, var1, Class_sb.e, var7, var5, var0, Class_vb.h, -1412584499, Class_dc.s);
               Class_sb.e = null;
            }
         }
      } catch (RuntimeException var11) {
         throw Class_sh.a(var11, "pe.JA(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ')');
      }
   }

   final void b(byte var1) {
      try {
         t++;
         if (var1 != 73) {
            a(null, true);
         }

         if (this.x != null) {
            this.x.C = this.C;
            this.C.x = this.x;
            this.C = null;
            this.x = null;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "pe.MA(" + var1 + ')');
      }
   }

   static final int a(boolean var0, KeyEvent var1) {
      try {
         if (!var0) {
            return -15;
         } else {
            s++;
            int var2 = var1.getKeyChar();
            if (~var2 == -8365) {
               return 128;
            } else {
               if (var2 <= 0 || var2 >= 256) {
                  var2 = -1;
               }

               return var2;
            }
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "pe.LA(" + var0 + 44 + (var1 != null ? "{...}" : "null") + 41);
      }
   }

   static final void a(Component var0, boolean var1) {
      try {
         if (!var1) {
            z = -124;
         }

         u++;
         var0.removeMouseListener(Class_fb.g);
         var0.removeMouseMotionListener(Class_fb.g);
         var0.removeFocusListener(Class_fb.g);
         client.Y = 0;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "pe.NA(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
      }
   }

   static final Class_cd b(int var0, int var1) {
      try {
         G++;
         Class_cd var2 = (Class_cd)Class_h.n.a((long)var1, (byte)-76);
         if (var2 != null) {
            return var2;
         } else {
            if (var0 != 21) {
               a(true, null);
            }

            byte[] var3 = Class_rj.G.a(Class_d.a(var1, false), 0, Class_ib.b(var1, 111));
            var2 = new Class_cd();
            if (var3 != null) {
               var2.a(0, new Class_lh(var3));
            }

            Class_h.n.a(var1, (byte)-116, var2);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "pe.OA(" + var0 + ',' + var1 + ')');
      }
   }

   public Class_pe() {
   }
}
