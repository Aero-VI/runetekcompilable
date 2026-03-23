import java.util.Calendar;
import java.util.Random;

final class Class_ia extends Class_lf {
   static int Q;
   static short[][] R = new short[][]{
      {
            6798,
            107,
            10283,
            16,
            4797,
            7744,
            5799,
            4634,
            -31839,
            22433,
            2983,
            -11343,
            8,
            5281,
            10438,
            3650,
            -27322,
            -21845,
            200,
            571,
            908,
            21830,
            28946,
            -15701,
            -14010
      },
      {
            8741,
            12,
            -1506,
            -22374,
            7735,
            8404,
            1701,
            -27106,
            24094,
            10153,
            -8915,
            4783,
            1341,
            16578,
            -30533,
            25239,
            8,
            5281,
            10438,
            3650,
            -27322,
            -21845,
            200,
            571,
            908,
            21830,
            28946,
            -15701,
            -14010
      },
      {
            25238,
            8742,
            12,
            -1506,
            -22374,
            7735,
            8404,
            1701,
            -27106,
            24094,
            10153,
            -8915,
            4783,
            1341,
            16578,
            -30533,
            8,
            5281,
            10438,
            3650,
            -27322,
            -21845,
            200,
            571,
            908,
            21830,
            28946,
            -15701,
            -14010
      },
      {4626, 11146, 6439, 12, 4758, 10270},
      {4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574}
   };
   private int S;
   private static Class_r T = Class_tc.a(43, "Connecting to update server");
   private int U = 0;
   static int V;
   static int W;
   static Class_r X = T;
   static Calendar Y = Calendar.getInstance();
   static int Z;
   private int ab;
   static int[] bb;
   private int cb = 0;
   static boolean db = false;
   static int eb;
   private int fb;
   static int gb;
   static Class_r hb = Class_tc.a(43, "Lade Sprites )2 ");
   static Class_jb[] ib;
   static Class_tg jb = new Class_tg(16);
   static Class_r kb = Class_tc.a(43, "::errortest");

   static final void b(int var0, int var1) {
      try {
         Class_oc.e = var0;
         Z++;
         Class_qd.C = -1;
         if (var1 >= 88) {
            Class_qd.C = -1;
            Class_wh.a(-1);
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ia.C(" + var0 + ',' + var1 + ')');
      }
   }

   public static void d(byte var0) {
      try {
         R = null;
         kb = null;
         hb = null;
         Y = null;
         jb = null;
         T = null;
         ib = null;
         if (var0 == 24) {
            X = null;
            bb = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ia.D(" + var0 + ')');
      }
   }

   static final void a(boolean var0) {
      try {
         if (!var0) {
            db = false;
         }

         Q++;
         Class_qj.L.a(110);
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ia.B(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int[] a(byte var1, int var2) {
      int var27 = client.lb;

      try {
         eb++;
         if (var1 != -61) {
            return null;
         } else {
            int[] var3 = super.H.a(false, var2);
            if (super.H.s) {
               int var4 = this.fb >> -942921695;
               int[][] var5 = super.H.a(-32044);
               Random var6 = new Random(this.cb);
               int var7 = 0;
               if (var27 != 0 || var7 < this.S) {
                  do {
                     int var8 = this.fb <= 0 ? this.U : this.U + (Class_jb.a(this.fb, (byte)70, var6) - var4);
                     var8 = 0xFF & var8 >> -1757194012;
                     int var9 = Class_jb.a(Class_ld.X, (byte)70, var6);
                     int var10 = Class_jb.a(Class_aa.K, (byte)70, var6);
                     int var12 = (Class_ud.e[var8] * this.ab >> 1986795884) + var10;
                     int var11 = (Class_nb.h[var8] * this.ab >> 1781805612) + var9;
                     int var13 = -var10 + var12;
                     int var14 = -var9 + var11;
                     if (var14 == 0 && ~var13 == -1) {
                        var7++;
                     } else {
                        if (~var13 > -1) {
                           var13 = -var13;
                        }

                        boolean var10000;
                        if (~var14 > -1) {
                           var14 = -var14;
                           var10000 = var14 < var13;
                        } else {
                           var10000 = var14 < var13;
                        }

                        boolean var15 = var10000;
                        if (var15) {
                           int var16 = var9;
                           var9 = var10;
                           int var17 = var11;
                           var10 = var16;
                           var11 = var12;
                           var12 = var17;
                        }

                        if (var9 > var11) {
                           int var31 = var9;
                           var9 = var11;
                           var11 = var31;
                           int var33 = var10;
                           var10 = var12;
                           var12 = var33;
                        }

                        int var32 = var10;
                        int var34 = var11 + -var9;
                        int var19 = -var34 / 2;
                        int var20 = 2048 / var34;
                        int var18 = var12 + -var10;
                        if (var18 < 0) {
                           var18 = -var18;
                        }

                        int var21 = -(Class_jb.a(4096, (byte)70, var6) >> -468586238) + 1024;
                        int var22 = var12 <= var10 ? -1 : 1;
                        int var23 = var9;
                        if (var27 != 0 || ~var11 < ~var9) {
                           do {
                              var19 += var18;
                              int var24 = var20 * (var23 + -var9) + 1024 + var21;
                              int var25 = Class_ed.d & var23;
                              int var26 = var32 & Class_fa.rc;
                              if (var15) {
                                 var5[var26][var25] = var24;
                                 if (var27 != 0) {
                                    var5[var25][var26] = var24;
                                 }
                              } else {
                                 var5[var25][var26] = var24;
                              }

                              if (var19 > 0) {
                                 var19 += -var34;
                                 var32 += var22;
                              }
                           } while (~var11 < ~(++var23));
                        }

                        var7++;
                     }
                  } while (var7 < this.S);
               }
            }

            return var3;
         }
      } catch (RuntimeException var28) {
         throw Class_sh.a(var28, "ia.G(" + var1 + ',' + var2 + ')');
      }
   }

   final void a(Class_lh var1, int var2, int var3) {
      int var5 = client.lb;

      try {
         label55: {
            label54: {
               label53: {
                  label52: {
                     label51: {
                        W++;
                        if (~var2 != -1) {
                           if (var2 == 1) {
                              break label51;
                           }

                           if (~var2 == -3) {
                              break label52;
                           }

                           if (~var2 == -4) {
                              break label53;
                           }

                           if (var2 != 4) {
                              break label55;
                           }

                           if (var5 == 0) {
                              break label54;
                           }
                        }

                        this.cb = var1.n(var3 + -6676);
                        if (var5 == 0) {
                           break label55;
                        }
                     }

                     this.S = var1.k(1355769544);
                     if (var5 == 0) {
                        break label55;
                     }
                  }

                  this.ab = var1.n(var3 + -6676);
                  if (var5 == 0) {
                     break label55;
                  }
               }

               this.U = var1.k(1355769544);
               if (var5 == 0) {
                  break label55;
               }
            }

            this.fb = var1.k(var3 ^ -1355769545);
         }

         if (var3 != -1) {
            this.ab = -69;
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "ia.K(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   final void a(byte var1) {
      try {
         if (var1 >= -22) {
            a(true);
         }

         V++;
         Class_kg.a((byte)-127);
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ia.I(" + var1 + ')');
      }
   }

   public Class_ia() {
      super(0, true);
      this.S = 2000;
      this.ab = 16;
      this.fb = 4096;
   }
}
