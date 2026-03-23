final class Class_ib extends Class_lf {
   static int Q;
   static Class_r R = Class_tc.a(43, " steht bereits auf Ihrer Ignorieren)2Liste(Q");
   static int S;
   static int T;
   static int U;
   static int V;
   static int W;
   private int X;
   static Class_r Y = Class_tc.a(43, "Eingabeprozedur geladen)3");
   static int Z;
   private int ab;
   static int bb;
   static int cb;
   private int[] db;
   static int eb = 0;
   private int fb = -1;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final Class_jb a(boolean var0, int var1, int var2, int var3, boolean var4, int var5, boolean var6, int var7) {
      int var19 = client.lb;

      try {
         cb++;
         Class_cf var8 = Class_ra.a(-25672, var3);
         if (~var7 < -2 && var8.q != null) {
            int var9 = -1;
            int var10 = 0;
            if (var19 != 0 || ~var10 > -11) {
               do {
                  if (~var8.A[var10] >= ~var7 && ~var8.A[var10] != -1) {
                     var9 = var8.q[var10];
                  }
               } while (~(++var10) > -11);
            }

            if (var9 != -1) {
               var8 = Class_ra.a(-25672, var9);
            }
         }

         Class_qa var21 = var8.a(-50);
         if (var21 == null) {
            return null;
         } else {
            Class_ni var22 = null;
            if (var8.gb != -1) {
               var22 = (Class_ni)a(true, 0, -125, var8.Z, false, 1, true, 10);
               if (var22 == null) {
                  return null;
               }
            } else if (var8.m != -1) {
               var22 = (Class_ni)a(false, var1, -125, var8.s, false, var5, true, var7);
               if (var22 == null) {
                  return null;
               }
            }

            int[] var11 = Class_nc.f;
            int var12 = Class_nc.e;
            int[] var14 = new int[4];
            int var13 = Class_nc.a;
            Class_nc.b(var14);
            Class_ni var15 = new Class_ni(36, 32);
            if (var2 > -123) {
               b(-88, 64);
            }

            int var16;
            label83: {
               Class_nc.a(var15.I, 36, 32);
               Class_kd.d();
               Class_kd.a(16, 16);
               Class_kd.m = false;
               var16 = var8.j;
               if (!var0) {
                  if (~var5 != -3) {
                     break label83;
                  }

                  var16 = (int)(var16 * 1.04);
                  if (var19 == 0) {
                     break label83;
                  }
               }

               var16 = (int)(1.5 * var16);
            }

            int var18 = Class_kd.q[var8.kb] * var16 >> -310666320;
            int var17 = var16 * Class_kd.e[var8.kb] >> -1666088464;
            var21.a(0, var8.qb, var8.C, var8.kb, var8.F, var17 + -(var21.a() / 2) + var8.mb, var18 + var8.mb);
            if (var5 >= 1) {
               var15.d(1);
               if (~var5 <= -3) {
                  var15.d(16777215);
               }

               Class_nc.a(var15.I, 36, 32);
            }

            if (~var1 != -1) {
               var15.e(var1);
            }

            label73: {
               if (~var8.gb == 0) {
                  if (~var8.m == 0) {
                     break label73;
                  }

                  Class_nc.a(var22.I, 36, 32);
                  var15.c(0, 0);
                  var15 = var22;
                  if (var19 == 0) {
                     break label73;
                  }
               }

               var22.c(0, 0);
            }

            if (var4 && (~var8.cb == -2 || ~var7 != -2) && ~var7 != 0) {
               Class_cb.d.b(Class_a.a((byte)-83, var7), 0, 9, 16776960, 1);
            }

            Class_nc.a(var11, var12, var13);
            Class_nc.a(var14);
            Class_kd.d();
            Class_kd.m = true;
            return var15;
         }
      } catch (RuntimeException var20) {
         throw Class_sh.a(var20, "ib.F(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
      }
   }

   final void e(int var1) {
      try {
         bb++;
         super.e(var1);
         this.db = null;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ib.R(" + var1 + ')');
      }
   }

   public static void g(int var0) {
      try {
         Y = null;
         R = null;
         if (var0 != 1) {
            R = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ib.B(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int[][] a(int var1, boolean var2) {
      int var11 = client.lb;

      try {
         if (!var2) {
            this.X = -127;
         }

         Z++;
         int[][] var3 = super.K.a(var1, (byte)101);
         if (super.K.q && this.i(-9)) {
            int var4 = this.X * (~Class_aa.K != ~this.ab ? this.ab * var1 / Class_aa.K : var1);
            int[] var6 = var3[1];
            int[] var5 = var3[0];
            int[] var7 = var3[2];
            if (Class_ld.X == this.X) {
               int var8 = 0;
               if (var11 != 0 || var8 < Class_ld.X) {
                  do {
                     int var9 = this.db[var4++];
                     var7[var8] = Class_ui.a(255, var9) << 1554447844;
                     var6[var8] = Class_ui.a(65280, var9) >> 494843876;
                     var5[var8] = Class_ui.a(4080, var9 >> 854552940);
                  } while (++var8 < Class_ld.X);
               }

               if (var11 == 0) {
                  return var3;
               }
            }

            int var13 = 0;
            if (var11 != 0 || ~Class_ld.X < ~var13) {
               do {
                  int var14 = this.X * var13 / Class_ld.X;
                  int var10 = this.db[var4 - -var14];
                  var7[var13] = Class_ui.a(var10, 255) << 1682950436;
                  var6[var13] = Class_ui.a(var10 >> 549771812, 4080);
                  var5[var13] = Class_ui.a(var10, 16711680) >> -987571188;
               } while (~Class_ld.X < ~(++var13));
            }
         }

         return var3;
      } catch (RuntimeException var12) {
         throw Class_sh.a(var12, "ib.A(" + var1 + ',' + var2 + ')');
      }
   }

   static final int b(int var0, int var1) {
      try {
         if (var1 <= 83) {
            eb = 19;
         }

         Q++;
         return var0 >>> 420387688;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ib.E(" + var0 + 44 + var1 + 41);
      }
   }

   final void a(Class_lh var1, int var2, int var3) {
      try {
         V++;
         if (~var2 == var3) {
            this.fb = var1.k(1355769544);
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "ib.K(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   public Class_ib() {
      super(0, false);
   }

   static final void h(int var0) {
      try {
         Class_fc.t.e(106);
         Class_mb.y = 1;
         U++;
         if (var0 == 16777215) {
            Class_ua.g = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ib.D(" + var0 + ')');
      }
   }

   private final boolean i(int var1) {
      try {
         S++;
         int var2 = -85 % ((60 - var1) / 57);
         if (this.db != null) {
            return true;
         } else if (this.fb >= 0) {
            int var3 = Class_ld.X;
            int var4 = Class_aa.K;
            int var5 = !Class_hf.e.b((byte)-111, this.fb) ? 128 : 64;
            this.db = Class_hf.e.b(99, this.fb);
            this.ab = var5;
            this.X = var5;
            Class_ii.a(var3, var4, true);
            return this.db != null;
         } else {
            return false;
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "ib.C(" + var1 + ')');
      }
   }

   final int c(byte var1) {
      try {
         W++;
         if (var1 > -43) {
            this.a(null, -25, 81);
         }

         return this.fb;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ib.N(" + var1 + 41);
      }
   }
}
