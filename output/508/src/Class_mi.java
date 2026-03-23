final class Class_mi extends Class_pe {
   static int I;
   Class_r J;
   int L;
   static int N;
   static int O;
   static Class_qc P = new Class_qc(64);
   static int Q;
   private int R;
   static int S;
   static int T = 0;
   static int[][][] U;
   static int V;
   static int W;

   static final void c(int var0, int var1) {
      try {
         if (var0 != 9) {
            a(false);
         }

         N++;
         Class_pi.W.b(-18767, var1);
         Class_rd.M.b(-18767, var1);
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "mi.D(" + var0 + ',' + var1 + ')');
      }
   }

   static final boolean a(int var0, int var1, int var2, int var3, int var4) {
      int var5 = var3 * Class_wh.i + var0 * Class_c.z >> 16;
      int var6 = var3 * Class_c.z - var0 * Class_wh.i >> 16;
      int var7 = var1 * Class_ke.v + var6 * Class_lc.f >> 16;
      int var8 = var1 * Class_lc.f - var6 * Class_ke.v >> 16;
      if (var7 < 1) {
         var7 = 1;
      }

      int var9 = (var5 << 9) / var7;
      int var10 = (var8 << 9) / var7;
      int var11 = var2 * Class_ke.v + var6 * Class_lc.f >> 16;
      int var12 = var2 * Class_lc.f - var6 * Class_ke.v >> 16;
      if (var11 < 1) {
         var11 = 1;
      }

      int var13 = (var5 << 9) / var11;
      int var14 = (var12 << 9) / var11;
      if (var7 < 50 && var11 < 50) {
         return false;
      } else if (var7 > var4 && var11 > var4) {
         return false;
      } else if (var9 < Class_nd.v && var13 < Class_nd.v) {
         return false;
      } else if (var9 > Class_tb.o && var13 > Class_tb.o) {
         return false;
      } else {
         return var10 < Class_a.j && var14 < Class_a.j ? false : var10 <= Class_vi.R || var14 <= Class_vi.R;
      }
   }

   public static void a(boolean var0) {
      try {
         if (!var0) {
            a(29, 48, -43, -20, -24);
         }

         P = null;
         U = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "mi.E(" + var0 + ')');
      }
   }

   private final void a(Class_lh var1, int var2, int var3) {
      int var5 = client.lb;

      try {
         if (var2 != 5) {
            this.d(29);
         }

         label41: {
            if (~var3 == -2) {
               this.R = var1.n(var2 + -6682);
               if (var5 == 0) {
                  break label41;
               }
            }

            if (~var3 != -3) {
               if (var3 != 5) {
                  break label41;
               }

               this.J = var1.e(var2 + 122);
               if (var5 == 0) {
                  break label41;
               }
            }

            this.L = var1.h(var2 + -5533);
         }

         I++;
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "mi.A(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   static final void a(Class_ta var0, int var1) {
      int var4 = client.lb;

      try {
         var0.Db = false;
         label154:
         if (var0.w != -1) {
            Class_uc var2 = Class_kk.a((byte)-36, var0.w);
            if (var2 == null || var2.d == null) {
               var0.w = -1;
               if (var4 == 0) {
                  break label154;
               }
            }

            var0.xb++;
            if (~var0.bb > ~var2.d.length && var2.A[var0.bb] < var0.xb) {
               var0.xb = 1;
               var0.bb++;
               Class_h.a(false, var0.bb, var0.hb, var2, Class_gg.B == var0, var0.J);
            }

            if (~var0.bb <= ~var2.d.length) {
               var0.bb = 0;
               var0.xb = 0;
               Class_h.a(false, var0.bb, var0.hb, var2, Class_gg.B == var0, var0.J);
            }
         }

         label145:
         if (var0.Y != -1 && ~var0.N >= ~Class_be.C) {
            if (~var0.yb > -1) {
               var0.yb = 0;
            }

            int var6 = Class_qj.c(var0.Y, 1).t;
            if (~var6 != 0) {
               Class_uc var3 = Class_kk.a((byte)-36, var6);
               if (var3 != null && var3.d != null) {
                  var0.Gb++;
                  if (~var0.yb > ~var3.d.length && ~var3.A[var0.yb] > ~var0.Gb) {
                     var0.Gb = 1;
                     var0.yb++;
                     Class_h.a(false, var0.yb, var0.hb, var3, var0 == Class_gg.B, var0.J);
                  }

                  if (~var3.d.length < ~var0.yb) {
                     break label145;
                  }

                  var0.Y = -1;
                  if (var4 == 0) {
                     break label145;
                  }
               }

               var0.Y = -1;
               if (var4 == 0) {
                  break label145;
               }
            }

            var0.Y = -1;
         }

         O++;
         if (var1 != 1) {
            T = -38;
         }

         if (~var0.ob != 0 && ~var0.R >= -2) {
            Class_uc var7 = Class_kk.a((byte)-36, var0.ob);
            if (var7.l == 1 && var0.db > 0 && Class_be.C >= var0.W && ~Class_be.C < ~var0.t) {
               var0.R = 1;
               return;
            }
         }

         label127:
         if (var0.ob != -1 && var0.R == 0) {
            Class_uc var8 = Class_kk.a((byte)-36, var0.ob);
            if (var8 != null && var8.d != null) {
               var0.cb++;
               if (var0.u < var8.d.length && ~var8.A[var0.u] > ~var0.cb) {
                  var0.cb = 1;
                  var0.u++;
                  Class_h.a(false, var0.u, var0.hb, var8, var0 == Class_gg.B, var0.J);
               }

               label119:
               if (var0.u >= var8.d.length) {
                  var0.u = var0.u - var8.P;
                  var0.V++;
                  if (var0.V >= var8.f) {
                     var0.ob = -1;
                     if (var4 == 0) {
                        break label119;
                     }
                  }

                  if (~var0.u <= -1 && ~var8.d.length < ~var0.u) {
                     Class_h.a(false, var0.u, var0.hb, var8, Class_gg.B == var0, var0.J);
                     if (var4 == 0) {
                        break label119;
                     }
                  }

                  var0.ob = -1;
               }

               var0.Db = var8.w;
               if (var4 == 0) {
                  break label127;
               }
            }

            var0.ob = -1;
         }

         if (var0.R > 0) {
            var0.R--;
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "mi.B(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
      }
   }

   final boolean d(int var1) {
      try {
         S++;
         if (var1 != 115) {
            a(-88, -16, 25, 34, 28);
         }

         return this.R == 115;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "mi.C(" + var1 + ')');
      }
   }

   final void a(int var1, Class_lh var2) {
      int var4 = client.lb;

      try {
         if (var1 != 1) {
            T = 122;
         }

         Q++;

         do {
            int var3 = var2.n(-6677);
            if (var3 == 0) {
               break;
            }

            this.a(var2, var1 ^ 4, var3);
         } while (var4 == 0);
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "mi.G(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
      }
   }

   public Class_mi() {
   }
}
