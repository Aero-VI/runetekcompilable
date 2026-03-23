final class Class_ve extends Class_lf {
   static int Q;
   private int[][] R;
   private static Class_r S = Class_tc.a(43, "Starting 3d library");
   static int T = 0;
   static int U;
   static Class_ff V;
   static int W;
   static int X = -1;
   static int Y;
   static int[] Z = new int[4096];
   static Class_ha[][] ab;
   static int bb;
   static int cb;
   private int[] db = new int[257];
   static int[] eb = new int[32];
   static int fb;
   static int gb;
   static int hb;
   static int ib;
   static Class_r jb = S;

   final void a(byte var1) {
      try {
         Y++;
         if (var1 >= -22) {
            d(-65, 21, -105);
         }

         if (this.R == null) {
            this.a(false, 1);
         }

         this.g(3);
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ve.I(" + var1 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int[][] a(int var1, boolean var2) {
      int var10 = client.lb;

      try {
         if (!var2) {
            return null;
         } else {
            fb++;
            int[][] var3 = super.K.a(var1, (byte)-122);
            if (super.K.q) {
               int[] var5 = this.b(0, var1, 29149);
               int[] var6 = var3[0];
               int[] var7 = var3[1];
               int[] var8 = var3[2];
               int var9 = 0;
               if (var10 != 0 || ~var9 > ~Class_ld.X) {
                  do {
                     int var4 = var5[var9] >> -1685668220;
                     if (~var4 > -1) {
                        var4 = 0;
                     }

                     if (var4 > 256) {
                        var4 = 256;
                     }

                     var4 = this.db[var4];
                     var6[var9] = Class_ui.a(16711680, var4) >> -1778227924;
                     var7[var9] = Class_ui.a(4080, var4 >> 602634276);
                     var8[var9] = Class_ui.a(var4 << -45325180, 4080);
                  } while (~(++var9) > ~Class_ld.X);
               }
            }

            return var3;
         }
      } catch (RuntimeException var11) {
         throw Class_sh.a(var11, "ve.A(" + var1 + ',' + var2 + ')');
      }
   }

   static final boolean a(int var0, int var1, Class_cj var2, int var3) {
      try {
         Q++;
         byte[] var4 = var2.a(var3, var0 ^ var0, var1);
         if (var4 == null) {
            return false;
         } else {
            Class_og.a(var0 + 43813, var4);
            return true;
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "ve.B(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
      }
   }

   private final void a(boolean var1, int var2) {
      try {
         if (var1) {
            V = null;
         }

         cb++;
         if (~var2 != -1) {
            if (var2 != 1) {
               if (~var2 == -3) {
                  this.R = new int[8][4];
                  this.R[0][3] = 2361;
                  this.R[0][2] = 2602;
                  this.R[0][0] = 0;
                  this.R[0][1] = 2650;
                  this.R[1][2] = 1799;
                  this.R[1][0] = 2867;
                  this.R[2][2] = 1734;
                  this.R[3][2] = 1220;
                  this.R[1][1] = 2313;
                  this.R[1][3] = 1558;
                  this.R[2][1] = 2618;
                  this.R[4][2] = 963;
                  this.R[3][1] = 2296;
                  this.R[5][2] = 2152;
                  this.R[6][2] = 1060;
                  this.R[2][0] = 3072;
                  this.R[2][3] = 1413;
                  this.R[3][0] = 3276;
                  this.R[7][2] = 1413;
                  this.R[3][3] = 947;
                  this.R[4][3] = 722;
                  this.R[4][0] = 3481;
                  this.R[4][1] = 2072;
                  this.R[5][3] = 1766;
                  this.R[6][3] = 915;
                  this.R[5][0] = 3686;
                  this.R[7][3] = 1140;
                  this.R[5][1] = 2730;
                  this.R[6][1] = 2232;
                  this.R[6][0] = 3891;
                  this.R[7][1] = 1686;
                  this.R[7][0] = 4096;
                  return;
               }

               if (~var2 == -4) {
                  this.R = new int[7][4];
                  this.R[0][2] = 0;
                  this.R[1][2] = 4096;
                  this.R[2][2] = 4096;
                  this.R[0][1] = 0;
                  this.R[0][0] = 0;
                  this.R[1][1] = 0;
                  this.R[0][3] = 4096;
                  this.R[1][0] = 663;
                  this.R[3][2] = 4096;
                  this.R[4][2] = 0;
                  this.R[5][2] = 0;
                  this.R[2][1] = 0;
                  this.R[2][0] = 1363;
                  this.R[3][1] = 4096;
                  this.R[3][0] = 2048;
                  this.R[1][3] = 4096;
                  this.R[6][2] = 0;
                  this.R[4][0] = 2727;
                  this.R[2][3] = 0;
                  this.R[5][0] = 3411;
                  this.R[4][1] = 4096;
                  this.R[5][1] = 4096;
                  this.R[3][3] = 0;
                  this.R[6][0] = 4096;
                  this.R[6][1] = 0;
                  this.R[4][3] = 0;
                  this.R[5][3] = 4096;
                  this.R[6][3] = 4096;
                  return;
               }

               if (~var2 == -5) {
                  this.R = new int[6][4];
                  this.R[0][3] = 0;
                  this.R[1][3] = 1493;
                  this.R[0][0] = 0;
                  this.R[1][0] = 1843;
                  this.R[2][3] = 2939;
                  this.R[0][1] = 0;
                  this.R[2][0] = 2457;
                  this.R[3][0] = 2781;
                  this.R[3][3] = 3565;
                  this.R[4][3] = 4031;
                  this.R[0][2] = 0;
                  this.R[4][0] = 3481;
                  this.R[5][3] = 4096;
                  this.R[1][1] = 0;
                  this.R[1][2] = 0;
                  this.R[2][1] = 0;
                  this.R[2][2] = 0;
                  this.R[5][0] = 4096;
                  this.R[3][2] = 1124;
                  this.R[3][1] = 0;
                  this.R[4][1] = 546;
                  this.R[4][2] = 3084;
                  this.R[5][1] = 4096;
                  this.R[5][2] = 4096;
                  return;
               }

               if (~var2 == -6) {
                  this.R = new int[16][4];
                  this.R[0][3] = 321;
                  this.R[0][2] = 192;
                  this.R[0][0] = 0;
                  this.R[1][3] = 562;
                  this.R[2][3] = 803;
                  this.R[1][0] = 155;
                  this.R[1][2] = 449;
                  this.R[2][2] = 690;
                  this.R[0][1] = 80;
                  this.R[3][3] = 1140;
                  this.R[1][1] = 321;
                  this.R[2][1] = 578;
                  this.R[3][1] = 947;
                  this.R[3][2] = 995;
                  this.R[2][0] = 389;
                  this.R[4][3] = 1509;
                  this.R[4][2] = 1397;
                  this.R[3][0] = 671;
                  this.R[4][0] = 897;
                  this.R[5][3] = 1413;
                  this.R[4][1] = 1285;
                  this.R[5][2] = 1429;
                  this.R[5][1] = 1525;
                  this.R[5][0] = 1175;
                  this.R[6][0] = 1368;
                  this.R[7][0] = 1507;
                  this.R[6][3] = 1333;
                  this.R[8][0] = 1736;
                  this.R[7][3] = 1702;
                  this.R[6][2] = 1461;
                  this.R[9][0] = 2088;
                  this.R[6][1] = 1734;
                  this.R[10][0] = 2355;
                  this.R[7][2] = 1525;
                  this.R[8][3] = 2056;
                  this.R[9][3] = 2666;
                  this.R[10][3] = 3276;
                  this.R[7][1] = 1413;
                  this.R[8][1] = 1108;
                  this.R[9][1] = 1766;
                  this.R[8][2] = 1590;
                  this.R[11][3] = 3228;
                  this.R[11][0] = 2691;
                  this.R[12][3] = 3196;
                  this.R[13][3] = 3019;
                  this.R[12][0] = 3031;
                  this.R[13][0] = 3522;
                  this.R[14][0] = 3727;
                  this.R[9][2] = 2056;
                  this.R[10][2] = 2586;
                  this.R[15][0] = 4096;
                  this.R[14][3] = 3228;
                  this.R[11][2] = 3148;
                  this.R[12][2] = 3710;
                  this.R[10][1] = 2409;
                  this.R[11][1] = 3116;
                  this.R[15][3] = 2746;
                  this.R[13][2] = 3421;
                  this.R[12][1] = 3806;
                  this.R[14][2] = 3148;
                  this.R[13][1] = 3437;
                  this.R[14][1] = 3116;
                  this.R[15][1] = 2377;
                  this.R[15][2] = 2505;
                  return;
               }

               if (~var2 != -7) {
                  throw new RuntimeException("Invalid gradient preset");
               }

               if (client.lb == 0) {
                  this.R = new int[4][4];
                  this.R[0][2] = 4096;
                  this.R[0][0] = 2048;
                  this.R[1][0] = 2867;
                  this.R[2][0] = 3276;
                  this.R[0][1] = 0;
                  this.R[1][2] = 4096;
                  this.R[0][3] = 0;
                  this.R[2][2] = 4096;
                  this.R[3][2] = 0;
                  this.R[1][1] = 4096;
                  this.R[1][3] = 0;
                  this.R[3][0] = 4096;
                  this.R[2][3] = 0;
                  this.R[3][3] = 0;
                  this.R[2][1] = 4096;
                  this.R[3][1] = 4096;
                  return;
               }
            }

            this.R = new int[2][4];
            this.R[0][0] = 0;
            this.R[0][2] = 0;
            this.R[1][0] = 4096;
            this.R[0][3] = 0;
            this.R[1][3] = 4096;
            this.R[1][2] = 4096;
            this.R[0][1] = 0;
            this.R[1][1] = 4096;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "ve.F(" + var1 + ',' + var2 + ')');
      }
   }

   public Class_ve() {
      super(1, false);
   }

   static final void a(Class_ai var0, boolean var1) {
      try {
         bb++;
         long var2 = 0L;
         int var4 = -1;
         if (~var0.s == -1) {
            var2 = Class_sh.a(var0.v, var0.x, var0.q);
         }

         if (~var0.s == -2) {
            var2 = d(var0.v, var0.x, var0.q);
         }

         if (var1) {
            int var5 = 0;
            int var6 = 0;
            if (var0.s == 2) {
               var2 = Class_fk.d(var0.v, var0.x, var0.q);
            }

            if (var0.s == 3) {
               var2 = Class_p.b(var0.v, var0.x, var0.q);
            }

            if (~var2 != -1L) {
               var6 = 3 & (int)var2 >> 1394171124;
               var5 = (519242 & (int)var2) >> -729044818;
               var4 = (int)(var2 >>> -188883616) & 2147483647;
            }

            var0.u = var4;
            var0.p = var5;
            var0.z = var6;
         }
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "ve.J(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
      }
   }

   static final long d(int var0, int var1, int var2) {
      Class_aa var3 = Class_ck.d[var0][var1][var2];
      return var3 != null && var3.z != null ? var3.z.t : 0L;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private final void g(int var1) {
      int var14 = client.lb;

      try {
         W++;
         if (var1 != 3) {
            this.db = null;
         }

         int var5 = this.R.length;
         if (var5 > 0) {
            int var6 = 0;
            if (var14 != 0 || var6 < 257) {
               do {
                  int var7 = 0;
                  int var8 = var6 << -2139063356;
                  int var9 = 0;
                  if (var14 != 0 || ~var9 > ~var5) {
                     while (~this.R[var9][0] >= ~var8) {
                        var7++;
                        if (~(++var9) <= ~var5) {
                           break;
                        }
                     }
                  }

                  int var2;
                  int var3;
                  int var4;
                  label79: {
                     if (var5 > var7) {
                        int[] var10 = this.R[var7];
                        if (~var7 >= -1) {
                           var4 = var10[3];
                           var3 = var10[2];
                           var2 = var10[1];
                           if (var14 == 0) {
                              break label79;
                           }
                        }

                        int[] var11 = this.R[-1 + var7];
                        int var12 = (var8 - var11[0] << -511742004) / (-var11[0] + var10[0]);
                        int var13 = -var12 + 4096;
                        var3 = var11[2] * var13 + var10[2] * var12 >> 1194441644;
                        var2 = var13 * var11[1] + var12 * var10[1] >> 811739436;
                        var4 = var12 * var10[3] + var11[3] * var13 >> 623151116;
                        if (var14 == 0) {
                           break label79;
                        }
                     }

                     int[] var19 = this.R[-1 + var5];
                     var3 = var19[2];
                     var2 = var19[1];
                     var4 = var19[3];
                  }

                  label71: {
                     var4 >>= 4;
                     var2 >>= 4;
                     if (~var2 > -1) {
                        var2 = 0;
                        if (var14 == 0) {
                           break label71;
                        }
                     }

                     if (~var2 < -256) {
                        var2 = 255;
                     }
                  }

                  var3 >>= 4;
                  if (~var3 <= -1) {
                     if (~var3 < -256) {
                        var3 = 255;
                        if (var14 != 0) {
                           var3 = 0;
                        }
                     }
                  } else {
                     var3 = 0;
                  }

                  if (var4 >= 0) {
                     if (~var4 < -256) {
                        var4 = 255;
                        if (var14 != 0) {
                           var4 = 0;
                        }
                     }
                  } else {
                     var4 = 0;
                  }

                  this.db[var6] = Class_mb.a(Class_mb.a(var3 << 209806376, var2 << 1066707152), var4);
               } while (++var6 < 257);
            }
         }
      } catch (RuntimeException var15) {
         throw Class_sh.a(var15, "ve.C(" + var1 + ')');
      }
   }

   static final void a(byte var0, Class_r var1) {
      int var5 = client.lb;

      try {
         U++;
         if (var0 == -62) {
            if (Class_o.ib != null) {
               int var2 = 0;
               long var3 = var1.f(10908);
               if (~var3 != -1L) {
                  while (~Class_o.ib.length < ~var2 && (~var3 != ~Class_o.ib[var2].a || var5 != 0)) {
                     var2++;
                  }

                  if (var2 < Class_o.ib.length && Class_o.ib[var2] != null) {
                     Class_cj.S.o(111, 200);
                     Class_fg.p++;
                     Class_cj.S.a(true, Class_o.ib[var2].a);
                  }
               }
            }
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "ve.H(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   public static void h(int var0) {
      try {
         if (var0 != 0) {
            d(-69, -77, -25);
         }

         V = null;
         S = null;
         Z = null;
         jb = null;
         eb = null;
         ab = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ve.U(" + var0 + ')');
      }
   }

   static final void a(int var0, int var1, boolean var2, int var3) {
      try {
         hb++;
         int var4 = -66 % ((var3 - -73) / 51);
         if (~var0 <= -8001 && var0 <= 48000) {
            Class_aj.p = var2;
            Class_ek.a = var1;
            Class_pd.a = var0;
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "ve.E(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final void a(Class_lh var1, int var2, int var3) {
      int var6 = client.lb;

      try {
         if (var3 == -1) {
            label40:
            if (var2 == 0) {
               int var4 = var1.n(-6677);
               if (var4 == 0) {
                  this.R = new int[var1.n(var3 + -6676)][4];
                  int var5 = 0;
                  if (var6 != 0 || ~this.R.length < ~var5) {
                     do {
                        this.R[var5][0] = var1.k(1355769544);
                        this.R[var5][1] = var1.n(-6677) << 1696064164;
                        this.R[var5][2] = var1.n(var3 + -6676) << 941944740;
                        this.R[var5][3] = var1.n(-6677) << 1066621380;
                     } while (~this.R.length < ~(++var5));
                  }

                  if (var6 == 0) {
                     break label40;
                  }
               }

               this.a(false, var4);
            }

            gb++;
         }
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "ve.K(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   static {
      for (int var0 = 0; var0 < 4096; var0++) {
         Z[var0] = Class_m.b(26151, var0);
      }
   }
}
