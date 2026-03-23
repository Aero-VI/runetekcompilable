import java.io.IOException;
import java.util.Random;

class Class_ok extends Class_lf {
   static int R;
   static int S;
   int[] T;
   static Random U = new Random();
   static int V;
   static int W;
   static int X = 2;
   static int Y;
   static Class_r Z = Class_tc.a(43, "gleiten:");
   private int ab = -1;
   static int bb = 0;
   int cb;
   int db;
   static int eb = 0;
   static int fb;
   static int gb;
   static int hb;

   public Class_ok() {
      super(0, false);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   int[][] a(int var1, boolean var2) {
      int var11 = client.lb;

      try {
         gb++;
         if (!var2) {
            eb = -40;
         }

         int[][] var3 = super.K.a(var1, (byte)-98);
         if (super.K.q && this.g(0)) {
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int[] var4 = var3[0];
            int var7 = (Class_aa.K != this.cb ? var1 * this.cb / Class_aa.K : var1) * this.db;
            if (this.db != Class_ld.X) {
               int var8 = 0;
               if (var11 != 0 || ~Class_ld.X < ~var8) {
                  do {
                     int var9 = this.db * var8 / Class_ld.X;
                     int var10 = this.T[var9 + var7];
                     var6[var8] = Class_ui.a(var10 << 1307678724, 4080);
                     var5[var8] = Class_ui.a(var10 >> 857470852, 4080);
                     var4[var8] = Class_ui.a(16711680, var10) >> -1579996788;
                  } while (~Class_ld.X < ~(++var8));
               }

               if (var11 == 0) {
                  return var3;
               }
            }

            int var13 = 0;
            if (var11 != 0 || Class_ld.X > var13) {
               do {
                  int var14 = this.T[var7++];
                  var6[var13] = Class_ui.a(4080, var14 << 667311492);
                  var5[var13] = Class_ui.a(4080, var14 >> -1924506844);
                  var4[var13] = Class_ui.a(var14, 16711680) >> 793019564;
               } while (Class_ld.X > ++var13);
            }
         }

         return var3;
      } catch (RuntimeException var12) {
         throw Class_sh.a(var12, "ok.A(" + var1 + ',' + var2 + ')');
      }
   }

   final int d(int var1) {
      try {
         if (var1 != 9485) {
            b(31, -110);
         }

         R++;
         return this.ab;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ok.T(" + var1 + 41);
      }
   }

   final boolean g(int var1) {
      try {
         fb++;
         if (this.T != null) {
            return true;
         } else if (this.ab >= var1) {
            Class_ni var2 = Class_wj.a(this.ab, Class_nk.d, 64);
            var2.d();
            this.db = var2.Q;
            this.T = var2.I;
            this.cb = var2.S;
            return true;
         } else {
            return false;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ok.W(" + var1 + ')');
      }
   }

   final void e(int var1) {
      try {
         hb++;
         super.e(var1);
         this.T = null;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ok.R(" + var1 + ')');
      }
   }

   static final void b(int var0, int var1) {
      try {
         Class_hk.G.b(-18767, var1);
         int var2 = 94 % ((-4 - var0) / 54);
         W++;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ok.J(" + var0 + ',' + var1 + ')');
      }
   }

   public static void a(boolean var0) {
      try {
         if (var0) {
            b(11, 8);
         }

         U = null;
         Z = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ok.V(" + var0 + ')');
      }
   }

   static final void a(Class_sb var0, int var1) {
      try {
         if (var1 != 127) {
            a(null, 100);
         }

         Class_md.w = var0;
         V++;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ok.F(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
      }
   }

   static final void a(int var0, int var1, int var2, int var3) {
      Class_aa var4 = Class_ck.d[var0][var1][var2];
      if (var4 != null) {
         Class_mk var5 = var4.z;
         if (var5 != null) {
            var5.l = var5.l * var3 / 16;
            var5.s = var5.s * var3 / 16;
         }
      }
   }

   final void a(Class_lh var1, int var2, int var3) {
      try {
         if (var3 != -1) {
            this.a(0, false);
         }

         if (var2 == 0) {
            this.ab = var1.k(1355769544);
         }

         S++;
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "ok.K(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(Class_ik var0, byte var1, boolean var2) {
      int var8 = client.lb;

      try {
         Y++;
         if (var1 <= -35) {
            if (!var2) {
               Class_ac var3 = null;
               Class_ha.hd = 3;
               Class_ja.a(true, 1);
               Class_ij.e = 0;
               Class_qd.G = true;
               Class_o.hb = true;
               Class_fi.r = true;
               Class_bc.U = true;
               Class_r.b = true;
               Class_bk.P = true;
               Class_gk.k = true;
               Class_ma.Y = true;
               Class_ng.o = true;
               Class_lj.m = 0;
               Class_mg.a = true;
               X = 2;
               Class_fc.s = true;
               Class_tf.V = 127;
               Class_od.g = 0;
               Class_oj.Y = 255;
               Class_dd.Gb = true;
               Class_sf.d = 127;

               try {
                  Class_ei var4 = var0.a(true, "runescape");
                  if (var8 != 0) {
                     Class_hg.a(-5, 1L);
                  }

                  while (var4.b == 0) {
                     Class_hg.a(-5, 1L);
                  }

                  if (~var4.b == -2) {
                     var3 = (Class_ac)var4.e;
                     byte[] var5 = new byte[(int)var3.a(-1)];
                     int var6 = 0;
                     if (var8 == 0 && ~var6 <= ~var5.length) {
                        Class_qe.a(new Class_lh(var5), (byte)91);
                     } else {
                        do {
                           int var7 = var3.a(var5.length - var6, 0, var6, var5);
                           if (~var7 == 0) {
                              throw new IOException("EOF");
                           }

                           var6 += var7;
                        } while (~var6 > ~var5.length);

                        Class_qe.a(new Class_lh(var5), (byte)91);
                     }
                  }
               } catch (Exception var10) {
               }

               try {
                  if (var3 != null) {
                     var3.c(-8143);
                     return;
                  }
               } catch (Exception var9) {
                  return;
               }
            } else {
               Class_ha.hd = 3;
               Class_ja.a(false, 1);
               Class_oj.Y = 255;
               Class_lj.m = 0;
               Class_tf.V = 127;
               Class_fc.s = false;
               Class_ij.e = 0;
               Class_bk.P = false;
               Class_ma.Y = false;
               Class_qd.G = false;
               Class_bc.U = false;
               Class_sf.d = 127;
               Class_dd.Gb = false;
               Class_gk.k = false;
               Class_r.b = false;
               Class_mg.a = false;
               Class_fi.r = false;
               Class_od.g = 0;
               X = 0;
               Class_o.hb = false;
               Class_ng.o = false;
               Class_jb.a(true, var0);
            }
         }
      } catch (RuntimeException var11) {
         throw Class_sh.a(var11, "ok.H(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ')');
      }
   }
}
