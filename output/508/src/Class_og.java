final class Class_og extends Class_lf {
   private int Q = 1;
   static int R;
   static Class_cj S;
   static int T;
   static int U = 0;
   static Class_r V = Class_og.Z;
   private int W;
   static int X;
   private int Y = 1;
   private static Class_r Z = Class_tc.a(43, "Take");
   static Class_r ab = Class_tc.a(43, "overlay2");
   static int bb;
   static int cb = 0;
   static int db;
   static Class_cj eb;
   static int fb;
   static int gb;
   static int hb;
   static Class_r ib = Class_tc.a(43, "Freie Welt");

   static final Class_r b(int var0, int var1) {
      try {
         R++;
         if (var1 != 0) {
            eb = null;
         }

         return Class_dj.a(10, false, (byte)125, var0);
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "og.E(" + var0 + ',' + var1 + ')');
      }
   }

   final void a(Class_lh var1, int var2, int var3) {
      int var5 = client.lb;

      try {
         label41: {
            label40: {
               label39: {
                  if (var2 != 0) {
                     if (~var2 == -2) {
                        break label39;
                     }

                     if (var2 != 2) {
                        break label41;
                     }

                     if (var5 == 0) {
                        break label40;
                     }
                  }

                  this.Y = var1.n(-6677);
                  if (var5 == 0) {
                     break label41;
                  }
               }

               this.Q = var1.n(-6677);
               if (var5 == 0) {
                  break label41;
               }
            }

            this.W = var1.k(1355769544);
         }

         if (var3 != -1) {
            a(111, null);
         }

         T++;
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "og.K(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   public Class_og() {
      super(0, true);
      this.W = 204;
   }

   public static void g(int var0) {
      try {
         if (var0 != 0) {
            U = 92;
         }

         S = null;
         ib = null;
         Z = null;
         eb = null;
         V = null;
         ab = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "og.D(" + var0 + ')');
      }
   }

   static final void a(int var0, byte[] var1) {
      try {
         X++;
         Class_lh var2 = new Class_lh(var1);
         var2.p = var1.length - 2;
         Class_lh.zb = var2.k(1355769544);
         Class_ae.g = new int[Class_lh.zb];
         Class_ad.f = new byte[Class_lh.zb][];
         Class_lj.h = new byte[Class_lh.zb][];
         Class_ub.L = new int[Class_lh.zb];
         Class_ld.ib = new int[Class_lh.zb];
         Class_kg.u = new boolean[Class_lh.zb];
         Class_ia.bb = new int[Class_lh.zb];
         var2.p = -7 + var1.length - 8 * Class_lh.zb;
         Class_qb.b = var2.k(var0 ^ 1355767464);
         Class_tf.bb = var2.k(var0 ^ 1355767464);
         int var3 = (var2.n(-6677) & 0xFF) - -1;

         for (int var4 = 0; ~Class_lh.zb < ~var4; var4++) {
            Class_ae.g[var4] = var2.k(Class_bj.a(var0, 1355767464));
         }

         for (int var5 = 0; Class_lh.zb > var5; var5++) {
            Class_ub.L[var5] = var2.k(Class_bj.a(var0, 1355767464));
         }

         for (int var6 = 0; ~Class_lh.zb < ~var6; var6++) {
            Class_ia.bb[var6] = var2.k(var0 + 1355755112);
         }

         for (int var7 = 0; Class_lh.zb > var7; var7++) {
            Class_ld.ib[var7] = var2.k(1355769544);
         }

         if (var0 != 14432) {
            ib = null;
         }

         var2.p = -(8 * Class_lh.zb) + (var1.length + -7 - 3 * (-1 + var3));
         Class_ji.Y = new int[var3];

         for (int var8 = 1; ~var8 > ~var3; var8++) {
            Class_ji.Y[var8] = var2.b((byte)118);
            if (Class_ji.Y[var8] == 0) {
               Class_ji.Y[var8] = 1;
            }
         }

         var2.p = 0;

         for (int var9 = 0; ~var9 > ~Class_lh.zb; var9++) {
            int var10 = Class_ia.bb[var9];
            int var11 = Class_ld.ib[var9];
            int var12 = var10 * var11;
            byte[] var14 = new byte[var12];
            byte[] var13 = new byte[var12];
            boolean var15 = false;
            Class_lj.h[var9] = var13;
            Class_ad.f[var9] = var14;
            int var16 = var2.n(-6677);
            if ((1 & var16) == 0) {
               for (int var22 = 0; ~var12 < ~var22; var22++) {
                  var13[var22] = var2.o(3390);
               }

               if (~(2 & var16) != -1) {
                  for (int var24 = 0; var12 > var24; var24++) {
                     byte var25 = var14[var24] = var2.o(3390);
                     var15 |= var25 != -1;
                  }
               }
            } else {
               for (int var17 = 0; var10 > var17; var17++) {
                  for (int var18 = 0; ~var11 < ~var18; var18++) {
                     var13[var17 + var10 * var18] = var2.o(3390);
                  }
               }

               if (~(2 & var16) != -1) {
                  for (int var23 = 0; ~var10 < ~var23; var23++) {
                     for (int var19 = 0; var19 < var11; var19++) {
                        byte var20 = var14[var23 - -(var19 * var10)] = var2.o(3390);
                        var15 |= ~var20 != 0;
                     }
                  }
               }
            }

            Class_kg.u[var9] = var15;
         }
      } catch (RuntimeException var21) {
         throw Class_sh.a(var21, "og.C(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int[] a(byte var1, int var2) {
      int var11 = client.lb;

      try {
         if (var1 != -61) {
            return null;
         } else {
            int[] var3 = super.H.a(false, var2);
            if (super.H.s) {
               int var4 = 0;
               if (var11 != 0 || ~var4 > ~Class_ld.X) {
                  do {
                     int var5 = Class_ce.gb[var4];
                     int var7 = var5 * this.Y >> -175664180;
                     int var9 = this.Y * (var5 % (4096 / this.Y));
                     int var6 = Class_l.y[var2];
                     int var8 = var6 * this.Q >> 1807983244;
                     int var10 = this.Q * (var6 % (4096 / this.Q));
                     if (var10 < this.W) {
                        var7 -= var8;
                        if (var11 != 0) {
                           var7 += 4;
                        }

                        while (var7 < 0) {
                           var7 += 4;
                        }

                        if (var11 != 0) {
                           var7 -= 4;
                        }

                        while (~var7 < -4) {
                           var7 -= 4;
                        }

                        if (~var7 != -2) {
                           var3[var4] = 0;
                           if (var11 == 0) {
                              var4++;
                              continue;
                           }
                        }

                        if (this.W > var9) {
                           var3[var4] = 0;
                           if (var11 == 0) {
                              var4++;
                              continue;
                           }
                        }
                     }

                     if (var9 >= this.W) {
                        var3[var4] = 4096;
                        var4++;
                     } else {
                        var7 -= var8;
                        if (var11 != 0) {
                           var7 += 4;
                        }

                        while (~var7 > -1) {
                           var7 += 4;
                        }

                        if (var11 != 0) {
                           var7 -= 4;
                        }

                        while (~var7 < -4) {
                           var7 -= 4;
                        }

                        if (~var7 < -1) {
                           var3[var4] = 0;
                           if (var11 != 0) {
                              var3[var4] = 4096;
                              var4++;
                           } else {
                              var4++;
                           }
                        } else {
                           var3[var4] = 4096;
                           var4++;
                        }
                     }
                  } while (~var4 > ~Class_ld.X);
               }
            }

            db++;
            return var3;
         }
      } catch (RuntimeException var12) {
         throw Class_sh.a(var12, "og.G(" + var1 + ',' + var2 + ')');
      }
   }

   static final void a(int var0, int var1, int var2, boolean var3, int var4, int var5) {
      try {
         Class_me.u = var5;
         gb++;
         Class_wf.l = var4;
         Class_mi.V = var0;
         if (!var3) {
            b(20, -89);
         }

         Class_lf.O = var1;
         Class_ba.x = var2;
         if (Class_me.u >= 100) {
            int var6 = 128 * Class_ba.x + 64;
            int var7 = 64 + Class_wf.l * 128;
            int var8 = Class_fa.a(var6, Class_jk.F, var7, false) + -Class_lf.O;
            int var11 = var7 + -Class_oc.l;
            int var10 = -Class_ef.s + var8;
            int var9 = var6 - Class_gg.D;
            int var12 = (int)Math.sqrt(var9 * var9 + var11 * var11);
            Class_hc.a = (int)(Math.atan2(var10, var12) * 325.949) & 2047;
            Class_mg.j = (int)(Math.atan2(var9, var11) * -325.949) & 2047;
            if (Class_hc.a < 128) {
               Class_hc.a = 128;
            }

            if (~Class_hc.a < -384) {
               Class_hc.a = 383;
            }
         }

         Class_wh.c = 2;
      } catch (RuntimeException var13) {
         throw Class_sh.a(var13, "og.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
      }
   }
}
