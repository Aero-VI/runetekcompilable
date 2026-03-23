abstract class Class_ta extends Class_a {
   static int p;
   int q;
   int r;
   int s;
   int t;
   int u;
   int[] v;
   int w;
   int x = -1;
   int y;
   static int z;
   static int A;
   static Class_pd[] B;
   int C;
   static int D;
   int E;
   int F;
   int G;
   int H;
   static int I;
   int J;
   private static Class_r K = Class_tc.a(43, "Select a world");
   int L = 0;
   int M;
   int N;
   int O;
   int P;
   int Q;
   int R;
   boolean[] S;
   int T;
   int U;
   int V;
   int W;
   static int X;
   int Y;
   static int Z;
   int[] ab;
   int bb;
   int cb;
   int db;
   static Class_dh[] eb;
   int fb;
   int gb;
   int hb;
   int ib;
   int jb;
   int kb;
   int lb;
   int mb;
   static int nb;
   int ob;
   int pb;
   int[] qb;
   int[] rb;
   int sb;
   static Class_r tb = K;
   int ub;
   int vb;
   Class_r wb;
   int xb;
   int yb;
   int zb;
   int[] Ab;
   int Bb;
   int Cb;
   boolean Db;
   static Class_r Eb = Class_tc.a(43, "hitbar_default");
   static long Fb;
   int Gb;
   static int Hb;
   int Ib;
   static int Jb;

   static final void a(int var0, int var1, int var2, boolean var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      try {
         nb++;
         if (!var3) {
            Fb = -83L;
         }

         int var11 = var2 - var10;
         if (var2 < Class_fi.z) {
            var11++;
         }

         int var12 = -var8 + var6;
         if (~var6 > ~Class_sb.j) {
            var12++;
         }

         for (int var13 = 0; var11 > var13; var13++) {
            int var14 = var0 * var13 + var5 >> -585219248;
            int var15 = (1 + var13) * var0 + var5 >> -291039376;
            int var16 = -var14 + var15;
            if (~var16 < -1) {
               int var17 = var13 + var10 >> 2018114854;
               if (var17 >= 0 && ~var17 >= ~(-1 + Class_fb.j.length)) {
                  var14 += var9;
                  var15 += var9;
                  byte[][] var53 = Class_bg.p[var17];
                  int[][] var51 = Class_fb.j[var17];
                  byte[][] var57 = Class_he.e[var17];
                  byte[][] var60 = Class_hf.i[var17];
                  byte[][] var55 = Class_j.gb[var17];
                  byte[][] var23 = Class_i.ob[var17];

                  for (int var24 = 0; ~var12 < ~var24; var24++) {
                     int var25 = var24 * var1 + var4 >> 92119376;
                     int var26 = var1 * (var24 - -1) + var4 >> 1999918128;
                     int var27 = var26 - var25;
                     if (var27 > 0) {
                        var26 += var7;
                        var25 += var7;
                        int var28 = var8 + var24 >> -121594938;
                        int var30 = 63 & var13 + var10;
                        int var29 = 63 & var8 + var24;
                        int var31 = (var29 << -947924250) - -var30;
                        int var32;
                        if (var28 >= 0 && ~(var51.length + -1) <= ~var28 && var51[var28] != null) {
                           var32 = var51[var28][var31];
                        } else {
                           if (~Class_ed.a.L != 0) {
                              var32 = Class_ed.a.L;
                           } else if ((var10 + var13 & 4) != (4 & var8 + var24)) {
                              var32 = 4936552;
                           } else {
                              var32 = Class_vb.e[Class_kc.z - -1];
                           }

                           if (var28 < 0 || var51.length + -1 < var28) {
                              if (var32 == 0) {
                                 var32 = 1;
                              }

                              Class_nc.f(var14, var25, var16, var27, var32);
                              continue;
                           }
                        }

                        if (var32 == 0) {
                           var32 = 1;
                        }

                        int var34 = var57[var28] == null ? 0 : Class_vb.e[var57[var28][var31] & 255];
                        int var33 = var53[var28] != null ? Class_vb.e[var53[var28][var31] & 255] : 0;
                        if (var33 == 0 && var34 == 0) {
                           Class_nc.f(var14, var25, var16, var27, var32);
                        } else {
                           if (~var33 != -1) {
                              if (~var33 == 0) {
                                 var33 = 1;
                              }

                              byte var35 = var55[var28] == null ? 0 : var55[var28][var31];
                              int var36 = var35 & 252;
                              if (~var36 != -1 && var16 > 1 && var27 > 1) {
                                 Class_uc.a(var36 >> -1828439646, var16, true, var27, var32, var33, Class_nc.f, var14, var25, 3 & var35, 2);
                              } else {
                                 Class_nc.f(var14, var25, var16, var27, var33);
                              }
                           }

                           if (~var34 != -1) {
                              byte var70 = var60[var28][var31];
                              int var72 = 252 & var70;
                              if (~var34 == 0) {
                                 var34 = var32;
                              }

                              if (var72 == 0 || ~var16 >= -2 || var27 <= 1) {
                                 Class_nc.f(var14, var25, var16, var27, var34);
                              }

                              Class_uc.a(var72 >> 55536706, var16, ~var33 == -1, var27, 0, var34, Class_nc.f, var14, var25, var70 & 3, 2);
                           }
                        }

                        if (var23[var28] != null) {
                           int var71 = 255 & var23[var28][var31];
                           if (var71 != 0) {
                              int var73;
                              if (~var16 != -2) {
                                 var73 = var15 - 1;
                              } else {
                                 var73 = var14;
                              }

                              int var37;
                              if (var27 == 1) {
                                 var37 = var25;
                              } else {
                                 var37 = var26 - 1;
                              }

                              int var38 = 13421772;
                              if (~var71 <= -6 && ~var71 >= -9 || ~var71 <= -14 && ~var71 >= -17 || var71 >= 21 && ~var71 >= -25 || var71 == 27 || var71 == 28) {
                                 var38 = 13369344;
                                 var71 -= 4;
                              }

                              if (var71 == 1) {
                                 Class_nc.e(var14, var25, var27, var38);
                              } else if (~var71 == -3) {
                                 Class_nc.d(var14, var25, var16, var38);
                              } else if (~var71 == -4) {
                                 Class_nc.e(var73, var25, var27, var38);
                              } else if (var71 == 4) {
                                 Class_nc.d(var14, var37, var16, var38);
                              } else if (~var71 == -10) {
                                 Class_nc.e(var14, var25, var27, 16777215);
                                 Class_nc.d(var14, var25, var16, var38);
                              } else if (var71 == 10) {
                                 Class_nc.e(var73, var25, var27, 16777215);
                                 Class_nc.d(var14, var25, var16, var38);
                              } else if (var71 == 11) {
                                 Class_nc.e(var73, var25, var27, 16777215);
                                 Class_nc.d(var14, var37, var16, var38);
                              } else if (var71 == 12) {
                                 Class_nc.e(var14, var25, var27, 16777215);
                                 Class_nc.d(var14, var37, var16, var38);
                              } else if (~var71 == -18) {
                                 Class_nc.d(var14, var25, 1, var38);
                              } else if (var71 == 18) {
                                 Class_nc.d(var73, var25, 1, var38);
                              } else if (var71 == 19) {
                                 Class_nc.d(var73, var37, 1, var38);
                              } else if (~var71 == -21) {
                                 Class_nc.d(var14, var37, 1, var38);
                              } else if (var71 == 25) {
                                 for (int var39 = 0; var39 < var27; var39++) {
                                    Class_nc.d(var14 - -var39, var37 + -var39, 1, var38);
                                 }
                              } else if (var71 == 26) {
                                 for (int var74 = 0; var27 > var74; var74++) {
                                    Class_nc.d(var74 + var14, var74 + var25, 1, var38);
                                 }
                              }
                           }
                        }
                     }
                  }
               } else {
                  var14 += var9;

                  for (int var18 = 0; var18 < var12; var18++) {
                     int var19;
                     if (~Class_ed.a.L != 0) {
                        var19 = Class_ed.a.L;
                     } else if ((4 & var10 + var13) != (var18 - -var8 & 4)) {
                        var19 = 4936552;
                     } else {
                        var19 = Class_vb.e[Class_kc.z + 1];
                     }

                     if (~var19 == -1) {
                        var19 = 1;
                     }

                     int var20 = (var18 * var1 + var4 >> 472557872) + var7;
                     int var21 = (var4 + (1 + var18) * var1 >> 1252340496) - -var7;
                     int var22 = -var20 + var21;
                     Class_nc.f(var14, var20, var16, var22, var19);
                  }

                  var15 += var9;
               }
            }
         }

         for (int var43 = -2; ~(var11 - -2) < ~var43; var43++) {
            int var46 = var5 + var43 * var0 >> -1818531984;
            int var48 = var5 - -(var0 * (var43 - -1)) >> -525654480;
            int var50 = var48 + -var46;
            if (~var50 < -1) {
               var46 += var9;
               int var52 = var10 + var43 >> -381628986;
               var48 += var9;
               if (~var52 <= -1 && ~(Class_i.sb.length + -1) <= ~var52) {
                  short[][] var54 = Class_i.sb[var52];

                  for (int var56 = -2; ~(2 + var12) < ~var56; var56++) {
                     int var58 = var4 + var56 * var1 >> -1561565936;
                     int var61 = var4 + var1 * (var56 + 1) >> -1290227504;
                     int var63 = -var58 + var61;
                     if (var63 > 0) {
                        var61 += var7;
                        var58 += var7;
                        int var64 = var8 + var56 >> 478924902;
                        if (var64 >= 0 && -1 + var54.length >= var64) {
                           int var66 = (63 & var10 + var43) + ((63 & var56 - -var8) << 79829542);
                           if (var54[var64] != null) {
                              int var68 = 16383 & var54[var64][var66];
                              int var69 = 3 & var54[var64][var66] >> -1163430578;
                              if (var68 != 0) {
                                 if (var69 == 0) {
                                    Class_oi.t[-1 + var68].a(var46, var58, var50 * 2, var63 * 2);
                                 } else if (~var69 == -2) {
                                    Class_bc.X[var68 - 1].a(var46, var58, 2 * var50, var63 * 2);
                                 } else if (var69 == 2) {
                                    Class_se.jb[var68 - 1].a(var46, var58, var50 * 2, 2 * var63);
                                 } else if (~var69 == -4) {
                                    eb[-1 + var68].a(var46, var58, var50 * 2, 2 * var63);
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var40) {
         throw Class_sh.a(
            var40,
            "ta.I("
               + var0
               + ','
               + var1
               + ','
               + var2
               + ','
               + var3
               + ','
               + var4
               + ','
               + var5
               + ','
               + var6
               + ','
               + var7
               + ','
               + var8
               + ','
               + var9
               + ','
               + var10
               + ')'
         );
      }
   }

   public static void c(int var0) {
      try {
         Eb = null;
         tb = null;
         B = null;
         eb = null;
         if (var0 != 2) {
            b(-100, 10);
         }

         K = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ta.E(" + var0 + ')');
      }
   }

   static final int a(int var0, int var1) {
      try {
         if (var0 <= 79) {
            tb = null;
         }

         Z++;
         return var1 & 0xFF;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ta.J(" + var0 + 44 + var1 + 41);
      }
   }

   final void a(int var1, byte var2, int var3, boolean var4) {
      try {
         D++;
         if (~this.ob != 0 && ~Class_kk.a((byte)-36, this.ob).h == -2) {
            this.ob = -1;
         }

         if (!var4) {
            int var5 = -this.v[0] + var3;
            int var6 = -this.qb[0] + var1;
            if (~var5 <= 7 && var5 <= 8 && ~var6 <= 7 && ~var6 >= -9) {
               if (this.zb < 9) {
                  this.zb++;
               }

               for (int var7 = this.zb; ~var7 < -1; var7--) {
                  this.v[var7] = this.v[var7 + -1];
                  this.qb[var7] = this.qb[var7 + -1];
                  this.S[var7] = this.S[var7 + -1];
               }

               this.v[0] = var3;
               this.qb[0] = var1;
               this.S[0] = false;
               return;
            }
         }

         this.zb = 0;
         this.s = 0;
         if (var2 == -68) {
            this.db = 0;
            this.v[0] = var3;
            this.qb[0] = var1;
            this.hb = this.v[0] * 128 + this.Q * 64;
            this.J = this.qb[0] * 128 - -(64 * this.Q);
         }
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "ta.F(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
      }
   }

   static final int b(int var0, int var1) {
      try {
         if (var1 > -73) {
            B = null;
         }

         Jb++;
         return var0 >>> -685042969;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ta.H(" + var0 + 44 + var1 + 41);
      }
   }

   final void a(int var1, boolean var2, int var3, int var4) {
      try {
         p++;

         for (int var5 = 0; ~var5 > -5; var5++) {
            if (var3 >= this.Ab[var5]) {
               this.ab[var5] = var1;
               this.rb[var5] = var4;
               this.Ab[var5] = 70 + var3;
               return;
            }
         }

         if (var2) {
            this.u = 9;
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "ta.V(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
      }
   }

   boolean d(int var1) {
      try {
         Hb++;
         if (var1 < 14) {
            this.J = 101;
         }

         return false;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ta.W(" + var1 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final void a(boolean var1, int var2, byte var3) {
      int var7 = client.lb;

      try {
         A++;
         int var4 = this.v[0];
         int var5 = this.qb[0];
         if (var3 == 21) {
            if (~this.ob != 0 && Class_kk.a((byte)-36, this.ob).h == 1) {
               this.ob = -1;
            }

            if (this.zb < 9) {
               this.zb++;
            }

            if (~var2 == -1) {
               var5++;
               var4--;
            }

            int var6 = this.zb;
            if (var7 != 0) {
               this.v[var6] = this.v[-1 + var6];
               this.qb[var6] = this.qb[var6 - 1];
               this.S[var6] = this.S[-1 + var6];
               var6--;
            }

            while (var6 > 0) {
               this.v[var6] = this.v[-1 + var6];
               this.qb[var6] = this.qb[var6 - 1];
               this.S[var6] = this.S[-1 + var6];
               var6--;
            }

            if (var2 == 1) {
               var5++;
            }

            if (var2 == 2) {
               var5++;
               var4++;
            }

            this.S[0] = var1;
            if (var2 == 3) {
               var4--;
            }

            if (~var2 == -5) {
               var4++;
            }

            if (~var2 == -6) {
               var4--;
               var5--;
            }

            if (var2 == 6) {
               var5--;
            }

            if (~var2 == -8) {
               var4++;
               var5--;
            }

            this.v[0] = var4;
            this.qb[0] = var5;
         }
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "ta.C(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   final int a(byte var1) {
      try {
         z++;
         int var2 = 85 % ((var1 - -64) / 45);
         return this.mb == -32768 ? 200 : -this.mb;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ta.U(" + var1 + 41);
      }
   }

   final void e(int var1) {
      try {
         X++;
         this.zb = var1;
         this.db = 0;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ta.G(" + var1 + ')');
      }
   }

   Class_ta() {
      this.E = -1;
      this.H = 0;
      this.P = -1;
      this.R = 0;
      this.v = new int[10];
      this.w = -1;
      this.bb = 0;
      this.u = 0;
      this.V = 0;
      this.ab = new int[4];
      this.s = 0;
      this.db = 0;
      this.Q = 1;
      this.C = -1;
      this.qb = new int[10];
      this.rb = new int[4];
      this.G = -1000;
      this.xb = 0;
      this.ub = -1;
      this.ib = 0;
      this.sb = 0;
      this.pb = 100;
      this.Y = -1;
      this.wb = null;
      this.ob = -1;
      this.kb = -1;
      this.jb = -1;
      this.S = new boolean[10];
      this.Bb = 32;
      this.zb = 0;
      this.cb = 0;
      this.mb = -32768;
      this.Db = false;
      this.Gb = 0;
      this.M = -1;
      this.yb = 0;
      this.Ab = new int[4];
      this.vb = 0;
      this.lb = -1;
      this.y = 0;
   }
}
