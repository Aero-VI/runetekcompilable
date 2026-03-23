final class Class_vi extends Class_lf {
   static int Q;
   static int R;
   static int S;
   static int T;
   static int U;
   static int V;
   static Class_r[] W = new Class_r[200];
   static int X;
   private int Y = 585;
   static int Z;
   static int ab;
   static int bb;

   static final int a(int var0, boolean var1, int var2) {
      try {
         if (!var1) {
            return 53;
         } else {
            Z++;
            int var3 = -128
               + Class_eh.a(4, var2 + 45365, 91923 + var0, -1)
               + ((-128 + Class_eh.a(2, 10294 + var2, 37821 + var0, -1) >> -984476159) - -(Class_eh.a(1, var2, var0, -1) + -128 >> 1128606402));
            var3 = (int)(var3 * 0.3) - -35;
            if (var3 >= 10) {
               if (var3 <= 60) {
                  return var3;
               }

               byte var6 = 60;
               if (client.lb == 0) {
                  return var6;
               }
            }

            return 10;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "vi.H(" + var0 + 44 + var1 + 44 + var2 + 41);
      }
   }

   public static void d(byte var0) {
      try {
         if (var0 != -65) {
            U = -70;
         }

         W = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "vi.E(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final Class_jb[] e(byte var0) {
      int var8 = client.lb;

      try {
         if (var0 != 15) {
            b(91, 31);
         }

         X++;
         Class_jb[] var1 = new Class_jb[Class_lh.zb];
         int var2 = 0;
         if (var8 == 0 && ~var2 <= ~Class_lh.zb) {
            Class_oe.a((byte)-93);
            return var1;
         } else {
            do {
               byte[] var4 = Class_lj.h[var2];
               int var3 = Class_ia.bb[var2] * Class_ld.ib[var2];
               int[] var10;
               int var11;
               if (Class_kg.u[var2]) {
                  byte[] var5 = Class_ad.f[var2];
                  int[] var6 = new int[var3];
                  int var7 = 0;
                  if (var8 != 0) {
                     var6[var7] = Class_mb.a(Class_ui.a(var5[var7] << 1514024664, -16777216), Class_ji.Y[Class_ui.a(255, var4[var7])]);
                     var7++;
                  }

                  while (~var3 < ~var7) {
                     var6[var7] = Class_mb.a(Class_ui.a(var5[var7] << 1514024664, -16777216), Class_ji.Y[Class_ui.a(255, var4[var7])]);
                     var7++;
                  }

                  var1[var2] = new Class_uj(Class_qb.b, Class_tf.bb, Class_ae.g[var2], Class_ub.L[var2], Class_ia.bb[var2], Class_ld.ib[var2], var6);
                  if (var8 == 0) {
                     var2++;
                     continue;
                  }

                  var10 = new int[var3];
                  var11 = 0;
                  if (var8 != 0) {
                     var10[var11] = Class_ji.Y[Class_ui.a(var4[var11], 255)];
                     var11++;
                  }
               } else {
                  var10 = new int[var3];
                  var11 = 0;
                  if (var8 != 0) {
                     var10[var11] = Class_ji.Y[Class_ui.a(var4[var11], 255)];
                     var11++;
                  }
               }

               while (var11 < var3) {
                  var10[var11] = Class_ji.Y[Class_ui.a(var4[var11], 255)];
                  var11++;
               }

               var1[var2] = new Class_ni(Class_qb.b, Class_tf.bb, Class_ae.g[var2], Class_ub.L[var2], Class_ia.bb[var2], Class_ld.ib[var2], var10);
               var2++;
            } while (~var2 > ~Class_lh.zb);

            Class_oe.a((byte)-93);
            return var1;
         }
      } catch (RuntimeException var9) {
         throw Class_sh.a(var9, "vi.D(" + var0 + ')');
      }
   }

   static final void a(Class_cj var0, Class_cj var1, Class_ie var2, byte var3) {
      try {
         bb++;
         Class_l.x = var1;
         Class_g.d = var2;
         Class_pc.i = var0;
         if (var3 != -117) {
            U = 54;
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(
            var5,
            "vi.F(" + (var0 != null ? "{...}" : "null") + ',' + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')'
         );
      }
   }

   static final void a(int var0, Class_cj var1, boolean var2, int var3, int var4, boolean var5) {
      try {
         Class_ua.g = var1;
         Class_mb.y = 1;
         Class_i.mb = 10000;
         Class_tf.Z = var0;
         if (var2) {
            R = -46;
         }

         Class_id.f = var5;
         Class_lg.l = var4;
         Class_sd.e = var3;
         V++;
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "vi.B(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
      }
   }

   public Class_vi() {
      super(0, true);
   }

   static final void b(int var0, int var1) {
      try {
         Class_ed.b.a(new Class_kg(var1), true);
         Q++;
         int var2 = 86 % ((71 - var0) / 53);
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "vi.C(" + var0 + ',' + var1 + ')');
      }
   }

   final void a(Class_lh var1, int var2, int var3) {
      try {
         T++;
         if (var3 != -1) {
            R = 59;
         }

         if (var2 == 0) {
            this.Y = var1.k(1355769544);
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "vi.K(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int[] a(byte var1, int var2) {
      int var8 = client.lb;

      try {
         if (var1 != -61) {
            R = -34;
         }

         int[] var3 = super.H.a(false, var2);
         if (super.H.s) {
            int var4 = Class_l.y[var2];
            int var5 = 0;
            if (var8 != 0 || var5 < Class_ld.X) {
               do {
                  int var6 = Class_ce.gb[var5];
                  if (var6 > this.Y && ~var6 > ~(-this.Y + 4096) && ~var4 < ~(2048 - this.Y) && ~var4 > ~(2048 + this.Y)) {
                     int var7 = -var6 + 2048;
                     var7 = var7 >= 0 ? var7 : -var7;
                     var7 <<= 12;
                     var7 /= 2048 - this.Y;
                     var3[var5] = -var7 + 4096;
                     if (var8 == 0) {
                        continue;
                     }
                  }

                  if (2048 - this.Y < var6 && ~var6 > ~(this.Y + 2048)) {
                     int var13 = -2048 + var4;
                     var13 = var13 < 0 ? -var13 : var13;
                     var13 -= this.Y;
                     var13 <<= 12;
                     var3[var5] = var13 / (2048 + -this.Y);
                     if (var8 == 0) {
                        continue;
                     }
                  }

                  if (~this.Y < ~var4 || -this.Y + 4096 < var4) {
                     int var17 = -2048 + var6;
                     var17 = ~var17 <= -1 ? var17 : -var17;
                     var17 -= this.Y;
                     var17 <<= 12;
                     var3[var5] = var17 / (-this.Y + 2048);
                     if (var8 == 0) {
                        continue;
                     }
                  }

                  if (var6 < this.Y || 4096 - this.Y < var6) {
                     int var21 = -var4 + 2048;
                     var21 = var21 < 0 ? -var21 : var21;
                     var21 <<= 12;
                     var21 /= -this.Y + 2048;
                     var3[var5] = 4096 + -var21;
                     if (var8 == 0) {
                        continue;
                     }
                  }

                  var3[var5] = 0;
               } while (++var5 < Class_ld.X);
            }
         }

         ab++;
         return var3;
      } catch (RuntimeException var9) {
         throw Class_sh.a(var9, "vi.G(" + var1 + ',' + var2 + ')');
      }
   }
}
