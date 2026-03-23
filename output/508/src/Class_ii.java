final class Class_ii extends Class_lf {
   private int Q = 3216;
   static int R;
   static int[] S;
   static int T;
   static int U;
   private int V;
   static int W;
   private int[] X;
   static int Y;
   static int Z;
   static int ab;
   private int bb = 4096;
   static int cb;
   static int db;
   static int eb;
   static int fb;
   static int gb;

   final void a(byte var1) {
      try {
         if (var1 < -22) {
            this.d((byte)-23);
            W++;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ii.I(" + var1 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, int var1, boolean var2) {
      int var4 = client.lb;

      try {
         if (var0 != Class_ld.X) {
            Class_ce.gb = new int[var0];
            int var3 = 0;
            if (var4 != 0 || ~var3 > ~var0) {
               do {
                  Class_ce.gb[var3] = (var3 << 898224364) / var0;
               } while (~(++var3) > ~var0);
            }

            Class_o.Y = var0 == 64 ? 2048 : 4096;
            Class_ed.d = -1 + var0;
            Class_ld.X = var0;
         }

         gb++;
         if (~var1 != ~Class_aa.K) {
            label44: {
               if (~var1 != ~Class_ld.X) {
                  Class_l.y = new int[var1];
                  int var6 = 0;
                  if (var4 != 0 || ~var6 > ~var1) {
                     do {
                        Class_l.y[var6] = (var6 << -1932024276) / var1;
                     } while (~(++var6) > ~var1);
                  }

                  if (var4 == 0) {
                     break label44;
                  }
               }

               Class_l.y = Class_ce.gb;
            }

            Class_fa.rc = var1 - 1;
            Class_aa.K = var1;
         }

         if (!var2) {
            d(81, 122, -111);
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "ii.F(" + var0 + ',' + var1 + ',' + var2 + ')');
      }
   }

   public Class_ii() {
      super(1, true);
      this.X = new int[3];
      this.V = 3216;
   }

   private final void d(byte var1) {
      try {
         double var2 = Math.cos(this.Q / 4096.0F);
         db++;
         this.X[0] = (int)(Math.sin(this.V / 4096.0F) * var2 * 4096.0);
         this.X[1] = (int)(var2 * Math.cos(this.V / 4096.0F) * 4096.0);
         this.X[2] = (int)(4096.0 * Math.sin(this.Q / 4096.0F));
         int var5 = this.X[1] * this.X[1] >> -1148302068;
         int var6 = this.X[2] * this.X[2] >> 1285443756;
         int var4 = this.X[0] * this.X[0] >> 1915040716;
         int var7 = (int)(4096.0 * Math.sqrt(var6 + var5 + var4 >> 732006508));
         if (var1 != -23) {
            a(3, -86L);
         }

         if (var7 != 0) {
            this.X[2] = (this.X[2] << 1771585100) / var7;
            this.X[0] = (this.X[0] << -1837682996) / var7;
            this.X[1] = (this.X[1] << -805177300) / var7;
         }
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "ii.H(" + var1 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, long var1) {
      int var5 = client.lb;

      try {
         T++;
         if (~var1 != -1L) {
            int var3;
            label34: {
               var3 = 0;
               if (var0 != 23136) {
                  f((byte)-1);
                  if (var5 != 0) {
                     if (Class_ma.hb[var3] == var1) {
                        break label34;
                     }

                     var3++;
                  }
               }

               while (true) {
                  if (var3 >= Class_ek.n) {
                     return;
                  }

                  if (Class_ma.hb[var3] == var1) {
                     break;
                  }

                  var3++;
               }
            }

            Class_lc.b++;
            Class_ek.n--;
            int var4 = var3;
            if (var5 == 0 && Class_ek.n <= var3) {
               Class_vf.l = Class_qd.F;
               Class_cj.S.o(-105, 132);
               Class_cj.S.a(true, var1);
            } else {
               do {
                  Class_vi.W[var4] = Class_vi.W[var4 + 1];
                  Class_qc.e[var4] = Class_qc.e[var4 - -1];
                  Class_aa.p[var4] = Class_aa.p[var4 - -1];
                  Class_ma.hb[var4] = Class_ma.hb[var4 - -1];
                  Class_dc.E[var4] = Class_dc.E[1 + var4];
                  Class_s.bb[var4] = Class_s.bb[1 + var4];
               } while (Class_ek.n > ++var4);

               Class_vf.l = Class_qd.F;
               Class_cj.S.o(-105, 132);
               Class_cj.S.a(true, var1);
            }
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "ii.D(" + var0 + ',' + var1 + ')');
      }
   }

   static final void d(int var0, int var1, int var2) {
      try {
         label15: {
            Class_sb.i[var0] = var1;
            Y++;
            Class_lk var3 = (Class_lk)Class_g.a.a(var0, -123);
            if (var3 != null) {
               var3.s = 500L + Class_fj.a(17161);
               if (client.lb == 0) {
                  break label15;
               }
            }

            var3 = new Class_lk(500L + Class_fj.a(17161));
            Class_g.a.a((byte)126, var3, var0);
         }

         int var4 = 97 % ((34 - var2) / 52);
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "ii.B(" + var0 + ',' + var1 + ',' + var2 + ')');
      }
   }

   final void a(Class_lh var1, int var2, int var3) {
      int var5 = client.lb;

      try {
         label41: {
            label40: {
               label39: {
                  if (var2 != 0) {
                     if (var2 == 1) {
                        break label39;
                     }

                     if (~var2 != -3) {
                        break label41;
                     }

                     if (var5 == 0) {
                        break label40;
                     }
                  }

                  this.bb = var1.k(1355769544);
                  if (var5 == 0) {
                     break label41;
                  }
               }

               this.V = var1.k(1355769544);
               if (var5 == 0) {
                  break label41;
               }
            }

            this.Q = var1.k(1355769544);
         }

         if (var3 != -1) {
            this.Q = 123;
         }

         R++;
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "ii.K(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int[] a(byte var1, int var2) {
      int var17 = client.lb;

      try {
         Z++;
         if (var1 != -61) {
            this.bb = 7;
         }

         int[] var3 = super.H.a(false, var2);
         if (super.H.s) {
            int var7 = Class_o.Y * this.bb >> -803028372;
            int[] var8 = this.b(0, Class_fa.rc & -1 + var2, 29149);
            int[] var9 = this.b(0, var2, 29149);
            int[] var10 = this.b(0, 1 + var2 & Class_fa.rc, 29149);
            int var11 = 0;
            if (var17 != 0 || ~Class_ld.X < ~var11) {
               do {
                  int var13 = (-var9[var11 - -1 & Class_ed.d] + var9[var11 - 1 & Class_ed.d]) * var7 >> 250522988;
                  int var12 = (-var8[var11] + var10[var11]) * var7 >> 1504576684;
                  int var14 = var13 >> 1299021796;
                  int var15 = var12 >> 1318447268;
                  if (~var14 > -1) {
                     var14 = -var14;
                  }

                  if (~var15 > -1) {
                     var15 = -var15;
                  }

                  if (~var14 < -256) {
                     var14 = 255;
                  }

                  if (var15 > 255) {
                     var15 = 255;
                  }

                  int var16 = Class_wc.I[var14 + ((var15 + 1) * var15 >> -1206695839)] & 255;
                  int var4 = var13 * var16 >> 1247637544;
                  int var6 = 4096 * var16 >> -1998727416;
                  var4 = var4 * this.X[0] >> -753290548;
                  var6 = this.X[2] * var6 >> -555307668;
                  int var5 = var16 * var12 >> 2011762088;
                  var5 = var5 * this.X[1] >> 1453414380;
                  var3[var11] = var5 + var4 + var6;
               } while (~Class_ld.X < ~(++var11));
            }
         }

         return var3;
      } catch (RuntimeException var18) {
         throw Class_sh.a(var18, "ii.G(" + var1 + ',' + var2 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(byte var0, boolean var1) {
      int var20 = client.lb;

      try {
         label266: {
            Class_fj.b = var1;
            if (!Class_fj.b) {
               int var2 = Class_f.T.g(var0 ^ -15003);
               int var3 = Class_f.T.e((byte)-47);
               int var4 = Class_f.T.g(-15046);
               int var5 = (-Class_f.T.p + Class_sf.g) / 16;
               Class_fe.Z = new int[var5][4];
               int var6 = 0;
               if (var20 != 0 || ~var5 < ~var6) {
                  do {
                     int var7 = 0;
                     if (var20 != 0 || ~var7 > -5) {
                        do {
                           Class_fe.Z[var6][var7] = Class_f.T.h(-5528);
                        } while (~(++var7) > -5);
                     }
                  } while (~var5 < ~(++var6));
               }

               boolean var9 = false;
               int var30 = Class_f.T.r(126);
               int var8 = Class_f.T.k(var0 + 1355769449);
               Class_uh.e = new int[var5];
               Class_d.b = new byte[var5][];
               Class_nd.a = null;
               Class_aj.q = null;
               if ((~(var2 / 8) == -49 || var2 / 8 == 49) && var8 / 8 == 48) {
                  var9 = true;
               }

               Class_s.cb = new int[var5];
               Class_kj.T = new byte[var5][];
               if (var2 / 8 == 48 && var8 / 8 == 148) {
                  var9 = true;
               }

               Class_pj.g = new int[var5];
               var5 = 0;
               int var10 = (var2 + -6) / 8;
               if (var20 != 0 || ~((6 + var2) / 8) <= ~var10) {
                  do {
                     int var11 = (var8 + -6) / 8;
                     if (var20 != 0 || (var8 - -6) / 8 >= var11) {
                        do {
                           int var12 = (var10 << 1786653352) - -var11;
                           if (!var9 || var11 != 49 && ~var11 != -150 && var11 != 147 && var10 != 50 && (~var10 != -50 || var11 != 47)) {
                              Class_uh.e[var5] = var12;
                              Class_pj.g[var5] = Class_pc.a
                                 .a(Class_o.a(2, new Class_r[]{Class_nk.c, Class_og.b(var10, 0), Class_ec.M, Class_og.b(var11, 0)}), (byte)-82);
                              Class_s.cb[var5] = Class_pc.a
                                 .a(Class_o.a(2, new Class_r[]{Class_uf.ab, Class_og.b(var10, 0), Class_ec.M, Class_og.b(var11, var0 + -95)}), (byte)-88);
                              if (var20 == 0) {
                                 var5++;
                                 var11++;
                                 continue;
                              }
                           }

                           Class_uh.e[var5] = var12;
                           Class_pj.g[var5] = -1;
                           Class_s.cb[var5] = -1;
                           var5++;
                           var11++;
                        } while ((var8 - -6) / 8 >= var11);
                     }
                  } while (~((6 + var2) / 8) <= ~(++var10));
               }

               Class_ng.a((byte)-12, var3, var30, false, var4, var2, var8);
               if (var20 == 0) {
                  break label266;
               }
            }

            int var22 = Class_f.T.m(var0 + 24);
            int var23 = Class_f.T.k(var0 + 1355769449);
            int var24 = Class_f.T.g(-15046);
            Class_f.T.s(var0 + 17);
            int var26 = 0;
            if (var20 != 0 || ~var26 > -5) {
               do {
                  int var27 = 0;
                  if (var20 != 0 || ~var27 > -14) {
                     do {
                        int var31 = 0;
                        if (var20 != 0 || ~var31 > -14) {
                           do {
                              int var33 = Class_f.T.e((byte)0, 1);
                              if (var33 == 1) {
                                 Class_ai.D[var26][var27][var31] = Class_f.T.e((byte)0, 26);
                                 if (var20 != 0) {
                                    Class_ai.D[var26][var27][var31] = -1;
                                    var31++;
                                 } else {
                                    var31++;
                                 }
                              } else {
                                 Class_ai.D[var26][var27][var31] = -1;
                                 var31++;
                              }
                           } while (~var31 > -14);
                        }
                     } while (~(++var27) > -14);
                  }
               } while (~(++var26) > -5);
            }

            Class_f.T.f((byte)-59);
            int var28 = (-Class_f.T.p + Class_sf.g) / 16;
            Class_fe.Z = new int[var28][4];
            int var32 = 0;
            if (var20 != 0 || var32 < var28) {
               do {
                  int var34 = 0;
                  if (var20 != 0 || ~var34 > -5) {
                     do {
                        Class_fe.Z[var32][var34] = Class_f.T.c((byte)115);
                     } while (~(++var34) > -5);
                  }
               } while (++var32 < var28);
            }

            int var35 = Class_f.T.g(var0 + -15141);
            int var36 = Class_f.T.g(var0 ^ -15003);
            Class_kj.T = new byte[var28][];
            Class_aj.q = null;
            Class_pj.g = new int[var28];
            Class_nd.a = null;
            Class_uh.e = new int[var28];
            Class_d.b = new byte[var28][];
            Class_s.cb = new int[var28];
            var28 = 0;
            int var37 = 0;
            if (var20 != 0 || var37 < 4) {
               do {
                  int var38 = 0;
                  if (var20 != 0 || ~var38 > -14) {
                     do {
                        int var39 = 0;
                        if (var20 != 0 || var39 < 13) {
                           do {
                              int var13 = Class_ai.D[var37][var38][var39];
                              if (~var13 == 0) {
                                 var39++;
                              } else {
                                 int var14 = 1023 & var13 >> -1474462546;
                                 int var15 = (var13 & 16383) >> 160515;
                                 int var16 = var15 / 8 + (var14 / 8 << 2129198792);
                                 int var17 = 0;
                                 if (var20 != 0 || var17 < var28) {
                                    do {
                                       if (~Class_uh.e[var17] == ~var16) {
                                          var16 = -1;
                                          if (var20 == 0) {
                                             break;
                                          }

                                          var17++;
                                       } else {
                                          var17++;
                                       }
                                    } while (var17 < var28);
                                 }

                                 if (~var16 != 0) {
                                    int var18 = (var16 & 65282) >> 1393055048;
                                    int var19 = var16 & 0xFF;
                                    Class_uh.e[var28] = var16;
                                    Class_pj.g[var28] = Class_pc.a
                                       .a(
                                          Class_o.a(
                                             2, new Class_r[]{Class_nk.c, Class_og.b(var18, var0 + -95), Class_ec.M, Class_og.b(var19, Class_bj.a(var0, 95))}
                                          ),
                                          (byte)-99
                                       );
                                    Class_s.cb[var28] = Class_pc.a
                                       .a(Class_o.a(2, new Class_r[]{Class_uf.ab, Class_og.b(var18, 0), Class_ec.M, Class_og.b(var19, 0)}), (byte)-88);
                                    var28++;
                                 }

                                 var39++;
                              }
                           } while (var39 < 13);
                        }
                     } while (~(++var38) > -14);
                  }
               } while (++var37 < 4);
            }

            Class_ng.a((byte)-45, var35, var22, false, var24, var36, var23);
         }

         if (var0 != 95) {
            U = 18;
         }

         fb++;
      } catch (RuntimeException var21) {
         throw Class_sh.a(var21, "ii.C(" + var0 + ',' + var1 + ')');
      }
   }

   public static void e(byte var0) {
      try {
         if (var0 < 6) {
            S = null;
         }

         S = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ii.E(" + var0 + ')');
      }
   }

   static final void f(byte var0) {
      try {
         label57: {
            if (Class_pi.qb > Class_kc.A) {
               Class_kc.A = (float)(Class_kc.A + Class_kc.A / 30.0);
               if (Class_pi.qb < Class_kc.A) {
                  Class_kc.A = Class_pi.qb;
               }

               Class_wh.a(-1);
               if (client.lb == 0) {
                  break label57;
               }
            }

            if (Class_pi.qb < Class_kc.A) {
               Class_kc.A = (float)(Class_kc.A - Class_kc.A / 30.0);
               if (Class_pi.qb > Class_kc.A) {
                  Class_kc.A = Class_pi.qb;
               }

               Class_wh.a(-1);
            }
         }

         eb++;
         if (~Class_ad.m != 0 && ~Class_qd.C != 0) {
            int var1 = -Class_og.fb + Class_ad.m;
            int var2 = Class_qd.C - Class_oc.e;
            if (var1 < 2 || var1 > 2) {
               var1 >>= 4;
            }

            Class_og.fb += var1;
            if (var2 < 2 || var2 > 2) {
               var2 >>= 4;
            }

            Class_oc.e += var2;
            if (~var1 == -1 && ~var2 == -1) {
               Class_ad.m = -1;
               Class_qd.C = -1;
            }

            Class_wh.a(-1);
         }

         if (var0 >= -45) {
            a(72, -116, false);
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ii.J(" + var0 + ')');
      }
   }
}
