final class Class_oj extends Class_lf {
   static int Q;
   static int R;
   static int S;
   static Class_r T = Class_tc.a(43, "mapscene");
   private int[] V;
   static int W = 0;
   static short[] X = new short[256];
   static int Y = 255;
   static int Z = 0;
   static int ab;
   static int bb = 0;
   private int[] cb;
   private int[][] db;
   static int eb;
   static int fb;
   static int gb;
   private static Class_r hb = Class_tc.a(43, "Started 3d library");
   static int ib;
   private int jb;
   private short[] kb = new short[257];
   static Class_r lb = hb;
   static Class_r mb = Class_tc.a(43, "<img=0>");

   final void a(byte var1) {
      try {
         if (this.db == null) {
            this.db = new int[][]{new int[2], {4096, 4096}};
         }

         fb++;
         if (this.db.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
         } else {
            if (this.jb == 2) {
               this.d((byte)100);
            }

            if (var1 >= -22) {
               W = 22;
            }

            Class_kg.a((byte)-128);
            this.e((byte)63);
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "oj.I(" + var1 + ')');
      }
   }

   public static void g(int var0) {
      try {
         T = null;
         X = null;
         if (var0 != -1) {
            bb = -3;
         }

         lb = null;
         hb = null;
         mb = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "oj.D(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final void a(Class_lh var1, int var2, int var3) {
      int var5 = client.lb;

      try {
         if (var2 == 0) {
            this.jb = var1.n(var3 ^ 6676);
            this.db = new int[var1.n(-6677)][2];
            int var4 = 0;
            if (var5 != 0 || var4 < this.db.length) {
               do {
                  this.db[var4][0] = var1.k(var3 + 1355769545);
                  this.db[var4][1] = var1.k(Class_bj.a(var3, -1355769545));
               } while (++var4 < this.db.length);
            }
         }

         if (var3 != -1) {
            W = 120;
         }

         R++;
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "oj.K(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(boolean var0) {
      int var3 = client.lb;

      try {
         label90:
         if (!Class_ui.h) {
            Class_ma.ib = 1;
            Class_dd.I[0] = 1004;
            Class_tj.u[0] = Class_fd.h;
            Class_fb.h[0] = Class_hk.S;
            if (~Class_hd.j == -1) {
               if (~Class_eb.d != -1) {
                  Class_pc.c = Class_wb.i;
                  Class_v.B = Class_vh.rb;
                  if (var3 == 0) {
                     break label90;
                  }
               }

               Class_v.B = Class_pj.c;
               Class_pc.c = Class_bh.k;
               if (var3 == 0) {
                  break label90;
               }
            }

            Class_pc.c = Class_j.bb;
            Class_v.B = Class_pg.r;
         }

         if (~Class_hj.bb != 0) {
            Class_gk.a(Class_hj.bb, -1);
         }

         ib++;
         int var1 = 0;
         if (var3 != 0) {
            if (Class_vb.j[var1]) {
               Class_n.u[var1] = true;
            }

            Class_ae.f[var1] = Class_vb.j[var1];
            Class_vb.j[var1] = false;
            var1++;
         }

         while (var1 < Class_jd.c) {
            if (Class_vb.j[var1]) {
               Class_n.u[var1] = true;
            }

            Class_ae.f[var1] = Class_vb.j[var1];
            Class_vb.j[var1] = false;
            var1++;
         }

         Class_ai.F = -1;
         Class_ad.a = null;
         Class_u.bb = Class_be.C;
         if (!var0) {
            b(-36, (byte)44);
         }

         Class_c.x = -1;
         if (~Class_hj.bb != 0) {
            Class_jd.c = 0;
            Class_pe.a(0, 0, Class_fk.R, 0, Class_hj.bb, -1, 0, Class_l.u, (byte)-112);
         }

         label65: {
            Class_nc.a();
            Class_ld.g(6364);
            if (!Class_ui.h) {
               if (~Class_ai.F == 0) {
                  break label65;
               }

               Class_e.a(106, Class_c.x, Class_ai.F);
               if (var3 == 0) {
                  break label65;
               }
            }

            Class_wj.d(4);
         }

         if (Class_ec.S == 3) {
            int var2 = 0;
            if (var3 != 0 || var2 < Class_jd.c) {
               do {
                  if (Class_ae.f[var2]) {
                     Class_nc.c(Class_sd.f[var2], Class_mc.g[var2], Class_cf.X[var2], Class_fa.pc[var2], 16711935, 128);
                     if (var3 == 0) {
                        var2++;
                        continue;
                     }
                  }

                  if (Class_n.u[var2]) {
                     Class_nc.c(Class_sd.f[var2], Class_mc.g[var2], Class_cf.X[var2], Class_fa.pc[var2], 16711680, 128);
                  }

                  var2++;
               } while (var2 < Class_jd.c);
            }
         }

         Class_sa.a(Class_sj.k, (byte)-34, Class_jk.F, Class_gg.B.J, Class_gg.B.hb);
         Class_sj.k = 0;
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "oj.C(" + var0 + ')');
      }
   }

   private final void d(byte var1) {
      try {
         gb++;
         int[] var2 = this.db[0];
         int[] var3 = this.db[1];
         int[] var5 = this.db[-1 + this.db.length];
         int[] var4 = this.db[-2 + this.db.length];
         this.cb = new int[]{var2[0] + -var3[0] + var2[0], var2[1] + var2[1] - var3[1]};
         if (var1 != 100) {
            X = null;
         }

         this.V = new int[]{-var5[0] + var4[0] + var4[0], var4[1] + -var5[1] + var4[1]};
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "oj.H(" + var1 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private final void e(byte var1) {
      int var21 = client.lb;

      try {
         label242: {
            label243: {
               eb++;
               int var2 = this.jb;
               if (~var2 != -3) {
                  if (~var2 != -2) {
                     break label243;
                  }

                  if (var21 == 0) {
                     var2 = 0;
                     if (var21 != 0 || ~var2 > -258) {
                        do {
                           int var34 = var2 << 1595077924;
                           int var30 = 1;
                           if (var21 != 0 || ~(this.db.length - 1) < ~var30) {
                              do {
                                 if (this.db[var30][0] > var34) {
                                    if (var21 == 0) {
                                       break;
                                    }

                                    var30++;
                                 } else {
                                    var30++;
                                 }
                              } while (~(this.db.length - 1) < ~var30);
                           }

                           int[] var40 = this.db[-1 + var30];
                           int[] var46 = this.db[var30];
                           int var52 = (-var40[0] + var34 << -1257354836) / (var46[0] - var40[0]);
                           int var58 = 4096 + -Class_nb.h[(8169 & var52) >> -22165883] >> 612093569;
                           int var64 = 4096 + -var58;
                           int var70 = var58 * var46[1] + var40[1] * var64 >> 1106155820;
                           if (~var70 >= 32767) {
                              var70 = -32767;
                           }

                           if (~var70 <= -32769) {
                              var70 = 32767;
                           }

                           this.kb[var2] = (short)var70;
                        } while (~(++var2) > -258);
                     }

                     if (var21 == 0) {
                        break label242;
                     }
                     break label243;
                  }
               }

               var2 = 0;
               if (var21 == 0 && var2 >= 257) {
                  if (var21 == 0) {
                     break label242;
                  }

                  var2 = 0;
                  if (var21 != 0 || ~var2 > -258) {
                     do {
                        int var33 = var2 << 1595077924;
                        int var29 = 1;
                        if (var21 != 0 || ~(this.db.length - 1) < ~var29) {
                           do {
                              if (this.db[var29][0] > var33) {
                                 if (var21 == 0) {
                                    break;
                                 }

                                 var29++;
                              } else {
                                 var29++;
                              }
                           } while (~(this.db.length - 1) < ~var29);
                        }

                        int[] var39 = this.db[-1 + var29];
                        int[] var45 = this.db[var29];
                        int var51 = (-var39[0] + var33 << -1257354836) / (var45[0] - var39[0]);
                        int var57 = 4096 + -Class_nb.h[(8169 & var51) >> -22165883] >> 612093569;
                        int var63 = 4096 + -var57;
                        int var69 = var57 * var45[1] + var39[1] * var63 >> 1106155820;
                        if (~var69 >= 32767) {
                           var69 = -32767;
                        }

                        if (~var69 <= -32769) {
                           var69 = 32767;
                        }

                        this.kb[var2] = (short)var69;
                     } while (~(++var2) > -258);
                  }

                  if (var21 == 0) {
                     break label242;
                  }
               } else {
                  label234:
                  do {
                     int var4 = var2 << -531366396;
                     int var3 = 1;
                     if (var21 == 0 && this.db.length + -1 <= var3) {
                        int[] var43 = this.db[var3];
                        int[] var37 = this.db[var3 - 1];
                        int var49 = this.b((byte)-124, -2 + var3)[1];
                        int var55 = var37[1];
                        int var61 = var43[1];
                        int var67 = this.b((byte)-125, 1 + var3)[1];
                        int var72 = (-var37[0] + var4 << -1639158068) / (var43[0] + -var37[0]);
                        int var74 = var72 * var72 >> 923410828;
                        int var76 = var55 + var67 - (var61 - -var49);
                        int var80 = var61 + -var49;
                        int var82 = (var76 * var72 >> 1275727628) * var74 >> 2912588;
                        int var78 = var49 - var55 + -var76;
                        int var84 = var78 * var74 >> -1672939188;
                        int var86 = var80 * var72 >> 532892332;
                        int var88 = var55 + var84 + var82 + var86;
                        if (~var88 >= 32767) {
                           var88 = -32767;
                        }

                        if (~var88 <= -32769) {
                           var88 = 32767;
                        }

                        this.kb[var2] = (short)var88;
                        var2++;
                     } else {
                        do {
                           if (~this.db[var3][0] < ~var4) {
                              if (var21 == 0) {
                                 int[] var6 = this.db[var3];
                                 int[] var5 = this.db[var3 - 1];
                                 int var7 = this.b((byte)-124, -2 + var3)[1];
                                 int var8 = var5[1];
                                 int var9 = var6[1];
                                 int var10 = this.b((byte)-125, 1 + var3)[1];
                                 int var11 = (-var5[0] + var4 << -1639158068) / (var6[0] + -var5[0]);
                                 int var12 = var11 * var11 >> 923410828;
                                 int var13 = var8 + var10 - (var9 - -var7);
                                 int var15 = var9 + -var7;
                                 int var17 = (var13 * var11 >> 1275727628) * var12 >> 2912588;
                                 int var14 = var7 - var8 + -var13;
                                 int var18 = var14 * var12 >> -1672939188;
                                 int var19 = var15 * var11 >> 532892332;
                                 int var20 = var8 + var18 + var17 + var19;
                                 if (~var20 >= 32767) {
                                    var20 = -32767;
                                 }

                                 if (~var20 <= -32769) {
                                    var20 = 32767;
                                 }

                                 this.kb[var2] = (short)var20;
                                 var2++;
                                 continue label234;
                              }

                              var3++;
                           } else {
                              var3++;
                           }
                        } while (this.db.length + -1 > var3);

                        int[] var42 = this.db[var3];
                        int[] var36 = this.db[var3 - 1];
                        int var48 = this.b((byte)-124, -2 + var3)[1];
                        int var54 = var36[1];
                        int var60 = var42[1];
                        int var66 = this.b((byte)-125, 1 + var3)[1];
                        int var71 = (-var36[0] + var4 << -1639158068) / (var42[0] + -var36[0]);
                        int var73 = var71 * var71 >> 923410828;
                        int var75 = var54 + var66 - (var60 - -var48);
                        int var79 = var60 + -var48;
                        int var81 = (var75 * var71 >> 1275727628) * var73 >> 2912588;
                        int var77 = var48 - var54 + -var75;
                        int var83 = var77 * var73 >> -1672939188;
                        int var85 = var79 * var71 >> 532892332;
                        int var87 = var54 + var83 + var81 + var85;
                        if (~var87 >= 32767) {
                           var87 = -32767;
                        }

                        if (~var87 <= -32769) {
                           var87 = 32767;
                        }

                        this.kb[var2] = (short)var87;
                        var2++;
                     }
                  } while (var2 < 257);

                  if (var21 == 0) {
                     break label242;
                  }

                  var2 = 0;
                  if (var21 != 0 || ~var2 > -258) {
                     do {
                        int var32 = var2 << 1595077924;
                        int var28 = 1;
                        if (var21 != 0 || ~(this.db.length - 1) < ~var28) {
                           do {
                              if (this.db[var28][0] > var32) {
                                 if (var21 == 0) {
                                    break;
                                 }

                                 var28++;
                              } else {
                                 var28++;
                              }
                           } while (~(this.db.length - 1) < ~var28);
                        }

                        int[] var38 = this.db[-1 + var28];
                        int[] var44 = this.db[var28];
                        int var50 = (-var38[0] + var32 << -1257354836) / (var44[0] - var38[0]);
                        int var56 = 4096 + -Class_nb.h[(8169 & var50) >> -22165883] >> 612093569;
                        int var62 = 4096 + -var56;
                        int var68 = var56 * var44[1] + var38[1] * var62 >> 1106155820;
                        if (~var68 >= 32767) {
                           var68 = -32767;
                        }

                        if (~var68 <= -32769) {
                           var68 = 32767;
                        }

                        this.kb[var2] = (short)var68;
                     } while (~(++var2) > -258);
                  }

                  if (var21 == 0) {
                     break label242;
                  }
               }
            }

            int var27 = 0;
            if (var21 != 0 || var27 < 257) {
               do {
                  int var35 = var27 << -822171836;
                  int var31 = 1;
                  if (var21 != 0 || var31 < -1 + this.db.length) {
                     do {
                        if (~var35 > ~this.db[var31][0]) {
                           if (var21 == 0) {
                              break;
                           }

                           var31++;
                        } else {
                           var31++;
                        }
                     } while (var31 < -1 + this.db.length);
                  }

                  int[] var47 = this.db[var31];
                  int[] var41 = this.db[-1 + var31];
                  int var53 = (var35 + -var41[0] << 499248940) / (-var41[0] + var47[0]);
                  int var59 = -var53 + 4096;
                  int var65 = var41[1] * var59 - -(var47[1] * var53) >> -1985295316;
                  if (var65 <= -32768) {
                     var65 = -32767;
                  }

                  if (~var65 <= -32769) {
                     var65 = 32767;
                  }

                  this.kb[var27] = (short)var65;
               } while (++var27 < 257);
            }
         }

         if (var1 != 63) {
            this.a(null, 65, 75);
         }
      } catch (RuntimeException var22) {
         throw Class_sh.a(var22, "oj.B(" + var1 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final boolean b(int var0, byte var1) {
      int var5 = client.lb;

      try {
         S++;
         if (Class_jk.y[var0]) {
            return true;
         } else if (!client.gb.b((byte)-126, var0)) {
            return false;
         } else {
            int var2 = client.gb.e(var0, 0);
            if (var2 == 0) {
               Class_jk.y[var0] = true;
               return true;
            } else {
               if (Class_ve.ab[var0] == null) {
                  Class_ve.ab[var0] = new Class_ha[var2];
               }

               int var3 = 0;
               if (var5 == 0 && ~var3 <= ~var2) {
                  if (var1 != -2) {
                     bb = -29;
                  }

                  Class_jk.y[var0] = true;
                  return true;
               } else {
                  do {
                     if (Class_ve.ab[var0][var3] == null) {
                        byte[] var4 = client.gb.a(var3, 0, var0);
                        if (var4 != null) {
                           Class_ve.ab[var0][var3] = new Class_ha();
                           Class_ve.ab[var0][var3].K = (var0 << -359621840) + var3;
                           if (var4[0] != -1) {
                              Class_ve.ab[var0][var3].a(-18165, new Class_lh(var4));
                              if (var5 != 0) {
                                 Class_ve.ab[var0][var3].b(-2, new Class_lh(var4));
                                 var3++;
                              } else {
                                 var3++;
                              }
                           } else {
                              Class_ve.ab[var0][var3].b(-2, new Class_lh(var4));
                              var3++;
                           }
                        } else {
                           var3++;
                        }
                     } else {
                        var3++;
                     }
                  } while (~var3 > ~var2);

                  if (var1 != -2) {
                     bb = -29;
                  }

                  Class_jk.y[var0] = true;
                  return true;
               }
            }
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "oj.F(" + var0 + ',' + var1 + ')');
      }
   }

   private final int[] b(byte var1, int var2) {
      try {
         Q++;
         if (var1 > -117) {
            return null;
         } else if (~var2 > -1) {
            return this.cb;
         } else {
            return var2 >= this.db.length ? this.V : this.db[var2];
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "oj.E(" + var1 + ',' + var2 + ')');
      }
   }

   public Class_oj() {
      super(1, true);
      this.jb = 0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int[] a(byte var1, int var2) {
      int var7 = client.lb;

      try {
         ab++;
         int[] var3 = super.H.a(false, var2);
         if (super.H.s) {
            int[] var5 = this.b(0, var2, 29149);
            int var6 = 0;
            if (var7 != 0 || ~var6 > ~Class_ld.X) {
               do {
                  int var4 = var5[var6] >> -184885884;
                  if (var4 < 0) {
                     var4 = 0;
                  }

                  if (var4 > 256) {
                     var4 = 256;
                  }

                  var3[var6] = this.kb[var4];
               } while (~(++var6) > ~Class_ld.X);
            }
         }

         if (var1 != -61) {
            b(-50, (byte)-96);
         }

         return var3;
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "oj.G(" + var1 + ',' + var2 + ')');
      }
   }
}
