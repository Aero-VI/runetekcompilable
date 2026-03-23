final class Class_hj extends Class_lf {
   static int Q;
   static int R;
   static Class_r S = Class_tc.a(43, "rect_debug=");
   static int T;
   static Class_r U = Class_tc.a(43, "<col=ff9040>");
   static int V;
   static int W = 0;
   static int[] X;
   private int Y = 4096;
   static Class_r Z = Class_tc.a(43, "<)4col> x");
   static int ab;
   static int bb = -1;
   private int cb = 0;
   static int db = 1;

   static final boolean a(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var1 == var2 && var3 == var4) {
         if (!Class_cj.c(var0, var1, var3)) {
            return false;
         } else {
            int var12 = var1 << 7;
            int var14 = var3 << 7;
            return Class_nj.a(var12 + 1, Class_mi.U[var0][var1][var3] + var5, var14 + 1)
               && Class_nj.a(var12 + 128 - 1, Class_mi.U[var0][var1 + 1][var3] + var5, var14 + 1)
               && Class_nj.a(var12 + 128 - 1, Class_mi.U[var0][var1 + 1][var3 + 1] + var5, var14 + 128 - 1)
               && Class_nj.a(var12 + 1, Class_mi.U[var0][var1][var3 + 1] + var5, var14 + 128 - 1);
         }
      } else {
         for (int var6 = var1; var6 <= var2; var6++) {
            for (int var7 = var3; var7 <= var4; var7++) {
               if (Class_me.k[var0][var6][var7] == -Class_aa.r) {
                  return false;
               }
            }
         }

         int var13 = (var1 << 7) + 1;
         int var8 = (var3 << 7) + 2;
         int var9 = Class_mi.U[var0][var1][var3] + var5;
         if (!Class_nj.a(var13, var9, var8)) {
            return false;
         } else {
            int var10 = (var2 << 7) - 1;
            if (!Class_nj.a(var10, var9, var8)) {
               return false;
            } else {
               int var11 = (var4 << 7) - 1;
               return !Class_nj.a(var13, var9, var11) ? false : Class_nj.a(var10, var9, var11);
            }
         }
      }
   }

   public static void d(byte var0) {
      try {
         Z = null;
         S = null;
         int var1 = 100 % ((var0 - -80) / 46);
         X = null;
         U = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "hj.B(" + var0 + ')');
      }
   }

   public Class_hj() {
      super(1, true);
   }

   static final void b(int var0, boolean var1) {
      try {
         Class_jc.v.b(-18767, var0);
         T++;
         if (!var1) {
            db = 114;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "hj.D(" + var0 + ',' + var1 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int[] a(byte var1, int var2) {
      int var7 = client.lb;

      try {
         int[] var3 = super.H.a(false, var2);
         if (var1 != -61) {
            this.a((byte)2, 80);
         }

         R++;
         if (super.H.s) {
            int[] var4 = this.b(0, var2, var1 ^ -29154);
            int var5 = 0;
            if (var7 != 0 || ~Class_ld.X < ~var5) {
               do {
                  int var6 = var4[var5];
                  var3[var5] = var6 >= this.cb ? (this.Y < var6 ? 0 : 4096) : 0;
               } while (~Class_ld.X < ~(++var5));
            }
         }

         return var3;
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "hj.G(" + var1 + ',' + var2 + ')');
      }
   }

   static final void g(int var0) {
      try {
         Class_wb.g.a(111);
         V++;
         if (var0 != 7) {
            X = null;
         }

         Class_bg.o.a(var0 + 108);
         Class_m.ib.a(115);
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "hj.C(" + var0 + ')');
      }
   }

   final void a(Class_lh var1, int var2, int var3) {
      int var5 = client.lb;

      try {
         if (var3 != -1) {
            db = 68;
         }

         label33: {
            label32: {
               if (~var2 != -1) {
                  if (~var2 != -2) {
                     break label33;
                  }

                  if (var5 == 0) {
                     break label32;
                  }
               }

               this.cb = var1.k(1355769544);
               if (var5 == 0) {
                  break label33;
               }
            }

            this.Y = var1.k(1355769544);
         }

         Q++;
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "hj.K(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   static final void a(Class_be var0, boolean var1, boolean var2) {
      try {
         ab++;
         int var3 = var0.t;
         if (!var1) {
            bb = 98;
         }

         int var4 = (int)var0.a;
         var0.c(-17554);
         if (var2) {
            Class_cf.a(-10, var3);
         }

         Class_ae.a(var3, 2);
         Class_ha var5 = Class_tf.a(var4, (byte)-80);
         if (var5 != null) {
            Class_tg.a(var5, -124);
         }

         Class_ma.ib = 0;
         Class_ui.h = false;
         Class_wg.a(Class_hf.h, Class_ih.S, Class_ii.ab, Class_fb.n, (byte)-107);
         if (bb != -1) {
            Class_ua.a(116, bb, 1);
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "hj.E(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ')');
      }
   }
}
