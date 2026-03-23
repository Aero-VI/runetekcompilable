final class Class_sa extends Class_lf {
   static int Q;
   private int R = 4096;
   static int S;
   static Class_cj T;
   static int U = 0;
   static int V;
   static int W;
   private int X = 4096;
   private int Y = 4096;
   static Class_sg Z;
   static int ab;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, byte var1, int var2, int var3, int var4) {
      int var10 = client.lb;

      try {
         if (var1 == -34) {
            Class_nf var5 = (Class_nf)Class_ba.c.e((byte)76);
            if (var10 != 0) {
               Class_se.a(93, var2, var3, var0, var5, var4);
               var5 = (Class_nf)Class_ba.c.c((byte)-127);
            }

            while (var5 != null) {
               Class_se.a(93, var2, var3, var0, var5, var4);
               var5 = (Class_nf)Class_ba.c.c((byte)-127);
            }

            Class_nf var6 = (Class_nf)Class_hh.d.e((byte)76);
            if (var10 != 0 || var6 != null) {
               do {
                  byte var7 = 1;
                  if (~var6.L.w != ~var6.L.C) {
                     if (var6.L.M == var6.L.w) {
                        var7 = 2;
                        if (var10 != 0) {
                           var7 = 0;
                        }
                     }
                  } else {
                     var7 = 0;
                  }

                  if (var7 != var6.y) {
                     int var8 = Class_me.a(var6.L, false);
                     if (~var6.t != ~var8) {
                        if (var6.r != null) {
                           Class_nd.m.a(var6.r);
                           var6.r = null;
                        }

                        var6.t = var8;
                     }

                     var6.y = var7;
                  }

                  var6.P = var6.L.hb;
                  var6.p = var6.L.Q * 64 + var6.L.J;
                  var6.C = var6.L.J;
                  var6.N = var6.L.hb + 64 * var6.L.Q;
                  Class_se.a(var1 ^ -78, var2, var3, var0, var6, var4);
                  var6 = (Class_nf)Class_hh.d.c((byte)-125);
               } while (var6 != null);
            }

            Q++;
            Class_nf var12 = (Class_nf)Class_qe.F.a(-32642);
            if (var10 != 0 || var12 != null) {
               do {
                  byte var13;
                  label78: {
                     var13 = 1;
                     if (var12.B.C == var12.B.w) {
                        var13 = 0;
                        if (var10 == 0) {
                           break label78;
                        }
                     }

                     if (var12.B.M == var12.B.w) {
                        var13 = 2;
                     }
                  }

                  if (~var12.y != ~var13) {
                     int var9 = Class_ra.a(var12.B, -6694);
                     if (~var9 != ~var12.t) {
                        if (var12.r != null) {
                           Class_nd.m.a(var12.r);
                           var12.r = null;
                        }

                        var12.t = var9;
                     }

                     var12.y = var13;
                  }

                  var12.C = var12.B.J;
                  var12.P = var12.B.hb;
                  var12.p = var12.B.J - -(var12.B.Q * 64);
                  var12.N = var12.B.hb - -(64 * var12.B.Q);
                  Class_se.a(112, var2, var3, var0, var12, var4);
                  var12 = (Class_nf)Class_qe.F.a((byte)-102);
               } while (var12 != null);
            }
         }
      } catch (RuntimeException var11) {
         throw Class_sh.a(var11, "sa.E(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
      }
   }

   static final void b(int var0, int var1) {
      try {
         Class_nj.n = new int[var1];
         Class_aj.r = new int[var1];
         if (var0 >= -46) {
            U = -119;
         }

         Class_wf.a = new int[var1];
         Class_uf.K = new int[var1];
         Class_sg.hb = new int[var1];
         S++;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "sa.C(" + var0 + ',' + var1 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int[][] a(int var1, boolean var2) {
      int var15 = client.lb;

      try {
         W++;
         if (!var2) {
            return null;
         } else {
            int[][] var3 = super.K.a(var1, (byte)-122);
            if (super.K.q) {
               int[][] var4 = this.c(-107, 0, var1);
               int[] var5 = var4[0];
               int[] var6 = var4[1];
               int[] var7 = var4[2];
               int[] var9 = var3[1];
               int[] var10 = var3[2];
               int[] var8 = var3[0];
               int var11 = 0;
               if (var15 != 0 || ~Class_ld.X < ~var11) {
                  do {
                     int var13 = var7[var11];
                     int var14 = var6[var11];
                     int var12 = var5[var11];
                     if (var13 == var12 && var14 == var13) {
                        var8[var11] = var12 * this.R >> -311107764;
                        var9[var11] = var13 * this.Y >> 620264780;
                        var10[var11] = this.X * var14 >> 1212671948;
                        if (var15 == 0) {
                           var11++;
                           continue;
                        }
                     }

                     var8[var11] = this.R;
                     var9[var11] = this.Y;
                     var10[var11] = this.X;
                     var11++;
                  } while (~Class_ld.X < ~var11);
               }
            }

            return var3;
         }
      } catch (RuntimeException var16) {
         throw Class_sh.a(var16, "sa.A(" + var1 + ',' + var2 + ')');
      }
   }

   static final Class_w a(int var0, boolean var1, Class_cj var2, int var3, Class_cj var4) {
      try {
         V++;
         boolean var5 = true;
         int[] var6 = var4.a(false, var3);
         if (var0 > -31) {
            Z = null;
         }

         for (int var7 = 0; ~var7 > ~var6.length; var7++) {
            byte[] var8 = var4.b(var6[var7], 14281, var3);
            if (var8 == null) {
               var5 = false;
            } else {
               int var9 = var8[1] & 255 | (255 & var8[0]) << 707067688;
               byte[] var10;
               if (var1) {
                  var10 = var2.b(var9, 14281, 0);
               } else {
                  var10 = var2.b(0, 14281, var9);
               }

               if (var10 == null) {
                  var5 = false;
               }
            }
         }

         if (!var5) {
            return null;
         } else {
            try {
               return new Class_w(var4, var2, var3, var1);
            } catch (Exception var11) {
               return null;
            }
         }
      } catch (RuntimeException var12) {
         throw Class_sh.a(
            var12, "sa.D(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ')'
         );
      }
   }

   public static void g(int var0) {
      try {
         Z = null;
         int var1 = 89 / ((var0 - 55) / 54);
         T = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "sa.B(" + var0 + ')');
      }
   }

   public Class_sa() {
      super(1, false);
   }

   final void a(Class_lh var1, int var2, int var3) {
      int var5 = client.lb;

      try {
         label41: {
            label40: {
               label39: {
                  ab++;
                  if (var2 != 0) {
                     if (var2 == 1) {
                        break label39;
                     }

                     if (var2 != 2) {
                        break label41;
                     }

                     if (var5 == 0) {
                        break label40;
                     }
                  }

                  this.R = var1.k(1355769544);
                  if (var5 == 0) {
                     break label41;
                  }
               }

               this.Y = var1.k(var3 + 1355769545);
               if (var5 == 0) {
                  break label41;
               }
            }

            this.X = var1.k(1355769544);
         }

         if (var3 != -1) {
            g(-105);
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "sa.K(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }
}
