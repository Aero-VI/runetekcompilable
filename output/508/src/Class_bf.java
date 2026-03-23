import java.awt.Insets;

final class Class_bf {
   static int a;
   static int b;
   static int c;
   static int d;
   static int e;
   static Class_qc f = new Class_qc(100);
   static int g;
   static int h;
   static int[] i = new int[5];

   static final int a(byte var0) {
      try {
         c++;
         return var0 <= 36 ? 13 : Class_ch.o;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "bf.H(" + var0 + 41);
      }
   }

   public static void b(byte var0) {
      try {
         int var1 = -4 / ((var0 - -62) / 37);
         f = null;
         i = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "bf.E(" + var0 + ')');
      }
   }

   static final Class_vj a(int var0, boolean var1, Class_cj var2) {
      try {
         if (!var1) {
            f = null;
         }

         e++;
         byte[] var3 = var2.f(0, var0);
         return var3 == null ? null : new Class_vj(var3);
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "bf.A(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0) {
      int var2 = client.lb;

      try {
         h++;
         int var1 = 0;
         if (var2 != 0) {
            Class_lj.e[var1] = false;
            var1++;
         }

         while (var1 < 5) {
            Class_lj.e[var1] = false;
            var1++;
         }

         Class_wh.c = 1;
         if (var0 == -10937) {
            Class_mc.k = -1;
            Class_oa.e = -1;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "bf.G(" + var0 + ')');
      }
   }

   static final void a(int var0, int var1) {
      int var4 = client.lb;

      try {
         Object var2;
         label64: {
            if (Class_fc.p != null) {
               var2 = Class_fc.p;
               if (var4 == 0) {
                  break label64;
               }
            }

            if (Class_si.i != null) {
               var2 = Class_si.i;
               if (var4 == 0) {
                  break label64;
               }
            }

            var2 = Class_rj.J.g;
         }

         a++;
         Class_w.O = ((java.awt.Component)var2).getSize().width;
         Class_cj.fb = ((java.awt.Component)var2).getSize().height;
         if (var2 == Class_si.i) {
            Insets var3 = Class_si.i.getInsets();
            Class_w.O = Class_w.O - (var3.right + var3.left);
            Class_cj.fb = Class_cj.fb - (var3.bottom + var3.top);
         }

         if (var1 >= -77) {
            a((byte)-81);
         }

         label47: {
            Class_fk.R = 503;
            Class_oj.bb = Class_mc.f;
            Class_id.u = (-765 + Class_w.O) / 2;
            Class_l.u = 765;
            Class_od.u.setSize(Class_l.u, Class_fk.R);
            if (var2 != Class_si.i) {
               Class_od.u.setLocation(Class_id.u, Class_oj.bb);
               if (var4 == 0) {
                  break label47;
               }
            }

            Insets var6 = Class_si.i.getInsets();
            Class_od.u.setLocation(Class_id.u + var6.left, Class_oj.bb + var6.top);
         }

         if (~Class_hj.bb != 0) {
            Class_hc.a(true, 640);
         }

         Class_me.a(0);
         if (Class_ik.e.startsWith("mac")) {
            Class_fj.f = Class_fj.a(17161) + var0;
         }

         Class_ng.h = Class_fj.a(17161) - -var0;
         if (var0 == 0 && Class_wf.k != null) {
            if (~Class_ua.b == -31 || Class_ua.b == 25) {
               Class_fe.c((byte)-118);
            }
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "bf.B(" + var0 + ',' + var1 + ')');
      }
   }

   static final void a(byte var0, int var1, boolean var2, int var3, int var4) {
      try {
         g++;
         if (Class_oj.b(var4, (byte)-2)) {
            Class_nf.a(-1, var1, var2, false, var3, Class_ve.ab[var4]);
            if (var0 != 99) {
               a(-17);
            }
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "bf.F(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, byte var1) {
      int var5 = client.lb;

      try {
         d++;
         int var3 = -111 / ((var1 - -48) / 49);
         Class_qd var2 = (Class_qd)Class_f.X.a(var0, 74);
         if (var2 != null) {
            int var4 = 0;
            if (var5 != 0 || var2.B.length > var4) {
               do {
                  var2.B[var4] = -1;
                  var2.y[var4] = 0;
               } while (var2.B.length > ++var4);
            }
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "bf.D(" + var0 + ',' + var1 + ')');
      }
   }

   static final void b(int var0) {
      try {
         Class_vf.k.b((byte)94);
         b++;
         if (var0 != 25580) {
            f = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "bf.C(" + var0 + ')');
      }
   }
}
