final class Class_ji extends Class_lf {
   static boolean Q = false;
   private int R;
   private int S = 4096;
   static int T;
   static int U;
   private int V;
   private int[] W;
   static int X;
   static int[] Y;
   static Class_r Z = Class_tc.a(43, "RuneScape wird geladen )2 bitte warten)3)3)3");
   static int ab;
   static int bb;
   private int cb;
   static int db;
   static int eb;

   public Class_ji() {
      super(1, false);
      this.R = 4096;
      this.W = new int[3];
      this.V = 409;
      this.cb = 4096;
   }

   static final int a(int var0, int var1, int var2, int var3) {
      try {
         T++;
         var0 &= 3;
         if (var0 == 0) {
            return var2;
         } else if (~var0 == -2) {
            return var1;
         } else {
            if (var3 != -27039) {
               a(-105, (Class_cj)null);
            }

            return var0 == 2 ? 7 - var2 : -var1 + 7;
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "ji.B(" + var0 + 44 + var1 + 44 + var2 + 44 + var3 + 41);
      }
   }

   static final Class_r a(int var0, int var1, Class_ha var2) {
      try {
         ab++;
         if (!Class_m.d(var1, client.b(var2), var0 + -28702) && var2.Wb == null) {
            return null;
         } else if (var2.pb != null && ~var1 > ~var2.pb.length && var2.pb[var1] != null && ~var2.pb[var1].a(true).d((byte)-107) != -1) {
            if (var0 != -3574) {
               a(-79, (Class_cj)null);
            }

            return var2.pb[var1];
         } else {
            return Class_pe.E ? Class_o.a(2, new Class_r[]{Class_nj.q, Class_og.b(var1, 0)}) : null;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "ji.D(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
      }
   }

   public static void g(int var0) {
      try {
         Z = null;
         if (var0 == 0) {
            Y = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ji.C(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int[][] a(int var1, boolean var2) {
      int var16 = client.lb;

      try {
         if (!var2) {
            a(-121, 56, null);
         }

         bb++;
         int[][] var3 = super.K.a(var1, (byte)-102);
         if (super.K.q) {
            int[][] var4 = this.c(-71, 0, var1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            int var11 = 0;
            if (var16 != 0 || var11 < Class_ld.X) {
               do {
                  int var13 = var5[var11];
                  int var12 = -this.W[0] + var13;
                  if (var12 < 0) {
                     var12 = -var12;
                  }

                  if (~this.V > ~var12) {
                     var8[var11] = var13;
                     var9[var11] = var6[var11];
                     var10[var11] = var7[var11];
                     if (var16 == 0) {
                        var11++;
                        continue;
                     }
                  }

                  int var14 = var6[var11];
                  var12 = var14 + -this.W[1];
                  if (var12 < 0) {
                     var12 = -var12;
                  }

                  if (~this.V > ~var12) {
                     var8[var11] = var13;
                     var9[var11] = var14;
                     var10[var11] = var7[var11];
                     if (var16 == 0) {
                        var11++;
                        continue;
                     }
                  }

                  int var15 = var7[var11];
                  var12 = var15 - this.W[2];
                  if (var12 < 0) {
                     var12 = -var12;
                  }

                  if (var12 > this.V) {
                     var8[var11] = var13;
                     var9[var11] = var14;
                     var10[var11] = var15;
                     if (var16 == 0) {
                        var11++;
                        continue;
                     }
                  }

                  var8[var11] = this.R * var13 >> 1602950764;
                  var9[var11] = var14 * this.cb >> 348864908;
                  var10[var11] = this.S * var15 >> 1050357836;
                  var11++;
               } while (var11 < Class_ld.X);
            }
         }

         return var3;
      } catch (RuntimeException var17) {
         throw Class_sh.a(var17, "ji.A(" + var1 + ',' + var2 + ')');
      }
   }

   static final int a(int var0, Class_cj var1) {
      try {
         int var2 = 0;
         if (var1.g(Class_pe.z, 0)) {
            var2++;
         }

         if (var1.g(Class_vg.t, 0)) {
            var2++;
         }

         if (var1.g(Class_hh.l, 0)) {
            var2++;
         }

         X++;
         if (var1.g(Class_ca.b, 0)) {
            var2++;
         }

         if (var1.g(Class_j.R, 0)) {
            var2++;
         }

         if (var1.g(Class_tg.b, var0)) {
            var2++;
         }

         if (var1.g(Class_qe.w, var0)) {
            var2++;
         }

         if (var1.g(Class_jc.B, var0)) {
            var2++;
         }

         if (var1.g(Class_ra.p, 0)) {
            var2++;
         }

         if (var1.g(Class_vi.U, 0)) {
            var2++;
         }

         if (var1.g(Class_pi.U, 0)) {
            var2++;
         }

         if (var1.g(Class_rd.S, var0 + var0)) {
            var2++;
         }

         if (var1.g(Class_bj.i, 0)) {
            var2++;
         }

         var2++;
         if (var1.g(Class_qb.k, 0)) {
            var2++;
         }

         if (var1.g(Class_qb.e, var0)) {
            var2++;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ji.E(" + var0 + 44 + (var1 != null ? "{...}" : "null") + 41);
      }
   }

   final void a(Class_lh var1, int var2, int var3) {
      int var6 = client.lb;

      try {
         label55: {
            label54: {
               label53: {
                  label52: {
                     label51: {
                        if (var2 != 0) {
                           if (var2 == 1) {
                              break label51;
                           }

                           if (var2 == 2) {
                              break label52;
                           }

                           if (~var2 == -4) {
                              break label53;
                           }

                           if (var2 != 4) {
                              break label55;
                           }

                           if (var6 == 0) {
                              break label54;
                           }
                        }

                        this.V = var1.k(1355769544);
                        if (var6 == 0) {
                           break label55;
                        }
                     }

                     this.S = var1.k(1355769544);
                     if (var6 == 0) {
                        break label55;
                     }
                  }

                  this.cb = var1.k(1355769544);
                  if (var6 == 0) {
                     break label55;
                  }
               }

               this.R = var1.k(1355769544);
               if (var6 == 0) {
                  break label55;
               }
            }

            int var4 = var1.b((byte)68);
            this.W[0] = Class_ui.a(16711680, var4) << -1712408444;
            this.W[1] = Class_ui.a(4080, var4 >> 1164839076);
            this.W[2] = Class_ui.a(var4, 255) >> -2020022708;
         }

         if (var3 != -1) {
            a(22, -40, null);
         }

         eb++;
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "ji.K(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final Class_rd b(int var0, byte var1) {
      int var14 = client.lb;

      try {
         db++;
         Class_rd var2 = (Class_rd)Class_j.Y.a((long)var0, (byte)-76);
         if (var2 != null) {
            return var2;
         } else {
            byte[] var3 = Class_bh.i.a(0, 0, var0);
            if (var3 == null) {
               return null;
            } else {
               var2 = new Class_rd();
               if (var1 < 22) {
                  Z = null;
               }

               Class_lh var4 = new Class_lh(var3);
               var4.p = var4.E.length - 2;
               int var5 = var4.k(1355769544);
               int var6 = -2 + var4.E.length - (var5 - -12);
               var4.p = var6;
               int var7 = var4.h(-5528);
               var2.T = var4.k(1355769544);
               var2.J = var4.k(1355769544);
               var2.N = var4.k(1355769544);
               var2.K = var4.k(1355769544);
               int var8 = var4.n(-6677);
               if (~var8 < -1) {
                  var2.U = new Class_tg[var8];
                  int var9 = 0;
                  if (var14 != 0 || ~var8 < ~var9) {
                     do {
                        int var10 = var4.k(1355769544);
                        Class_tg var11 = new Class_tg(Class_pa.f(var10, -21189));
                        var2.U[var9] = var11;
                        if (var14 != 0 || ~(var10--) < -1) {
                           do {
                              int var12 = var4.h(-5528);
                              int var13 = var4.h(-5528);
                              var11.a((byte)-89, new Class_kg(var13), var12);
                           } while (~(var10--) < -1);
                        }
                     } while (~var8 < ~(++var9));
                  }
               }

               int var17 = 0;
               var4.p = 0;
               var2.I = var4.l(23733);
               var2.O = new int[var7];
               var2.R = new int[var7];
               var2.P = new Class_r[var7];
               if (var14 == 0 && ~var4.p <= ~var6) {
                  Class_j.Y.a(var0, (byte)-107, var2);
                  return var2;
               } else {
                  do {
                     int var18 = var4.k(1355769544);
                     if (~var18 != -4) {
                        if (~var18 > -101 && var18 != 21 && ~var18 != -39 && var18 != 39) {
                           var2.O[var17] = var4.h(-5528);
                           if (var14 != 0) {
                              var2.P[var17] = var4.e(127);
                           }

                           var2.R[var17++] = var18;
                        } else {
                           var2.O[var17] = var4.n(-6677);
                           if (var14 != 0) {
                              var2.O[var17] = var4.h(-5528);
                              if (var14 != 0) {
                                 var2.P[var17] = var4.e(127);
                              }

                              var2.R[var17++] = var18;
                           } else {
                              var2.R[var17++] = var18;
                           }
                        }
                     } else {
                        var2.P[var17] = var4.e(127);
                        var2.R[var17++] = var18;
                     }
                  } while (~var4.p > ~var6);

                  Class_j.Y.a(var0, (byte)-107, var2);
                  return var2;
               }
            }
         }
      } catch (RuntimeException var15) {
         throw Class_sh.a(var15, "ji.F(" + var0 + ',' + var1 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final boolean a(int var0, Class_r var1) {
      int var3 = client.lb;

      try {
         U++;
         if (var1 == null) {
            return false;
         } else {
            if (var0 > -68) {
               Y = null;
            }

            int var2 = 0;
            if (var3 != 0) {
               if (var1.a(false, Class_vi.W[var2])) {
                  return true;
               }

               var2++;
            }

            while (Class_ek.n > var2) {
               if (var1.a(false, Class_vi.W[var2])) {
                  return true;
               }

               var2++;
            }

            return var1.a(false, Class_gg.B.Zb);
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "ji.H(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
      }
   }
}
