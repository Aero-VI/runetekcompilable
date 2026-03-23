final class Class_oi extends Class_li {
   static int p;
   static Class_r q = Class_tc.a(43, " (X");
   int r;
   static int s;
   static Class_dh[] t;
   static boolean u = false;
   static int v;
   static int w;
   Class_r x;
   static int y;
   byte z;
   Class_r A;
   static int[] C;
   static int D;

   static final Class_r a(int var0, Class_lh var1) {
      try {
         y++;
         int var2 = 19 % ((-21 - var0) / 37);
         return Class_f.a(0, var1, 32767);
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "oi.D(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final int a(int var0, int var1, int var2) {
      int var4 = client.lb;

      try {
         if (var2 < 65) {
            return 23;
         } else {
            int var3 = 1;
            D++;
            if (var4 == 0 && ~var0 >= -2) {
               return ~var0 == -2 ? var3 * var1 : var3;
            } else {
               do {
                  if (~(var0 & 1) != -1) {
                     var3 *= var1;
                  }

                  var0 >>= 1;
                  var1 *= var1;
               } while (~var0 < -2);

               return ~var0 == -2 ? var3 * var1 : var3;
            }
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "oi.B(" + var0 + 44 + var1 + 44 + var2 + 41);
      }
   }

   public static void a(boolean var0) {
      try {
         t = null;
         q = null;
         if (var0) {
            C = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "oi.C(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, int var1, int var2, Class_ha[] var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var33 = client.lb;

      try {
         Class_nc.c(var6, var2, var4, var0);
         Class_kd.d();
         if (var1 == -21644) {
            p++;
            int var10 = 0;
            if (var33 != 0 || var10 < var3.length) {
               do {
                  Class_ha var11 = var3[var10];
                  if (var11 != null && (~var8 == ~var11.R || var8 == -1412584499 && (var11 == Class_ff.e || var33 != 0))) {
                     int var12;
                     if (var5 == -1) {
                        Class_sd.f[Class_jd.c] = var9 + var11.hb;
                        Class_mc.g[Class_jd.c] = var11.Rc + var7;
                        Class_cf.X[Class_jd.c] = var11.Gc;
                        Class_fa.pc[Class_jd.c] = var11.nc;
                        var12 = Class_jd.c++;
                        if (var33 != 0) {
                           var12 = var5;
                        }
                     } else {
                        var12 = var5;
                     }

                     var11.ac = Class_be.C;
                     var11.Qc = var12;
                     if (!var11.dc || !client.c(var11)) {
                        if (var11.ab > 0) {
                           Class_pb.a(30341, var11);
                        }

                        int var13 = var11.hb - -var9;
                        int var15 = var11.t;
                        int var14 = var7 + var11.Rc;
                        if (Class_pe.E && (client.b(var11) != 0 || var11.Kc == 0) && var15 > 127) {
                           var15 = 127;
                        }

                        if (Class_ff.e == var11) {
                           if (var8 != -1412584499 && !var11.k) {
                              Class_vb.h = var7;
                              Class_dc.s = var9;
                              Class_sb.e = var3;
                              if (var33 == 0) {
                                 continue;
                              }
                           }

                           if (Class_bj.d && Class_nf.J) {
                              int var17 = Class_bh.k;
                              var17 -= Class_jf.a;
                              if (var17 < Class_tg.c) {
                                 var17 = Class_tg.c;
                              }

                              int var16 = Class_pj.c;
                              var16 -= Class_oj.W;
                              if (~Class_vh.nb < ~var16) {
                                 var16 = Class_vh.nb;
                              }

                              if (Class_ka.mb.Gc + Class_vh.nb < var11.Gc + var16) {
                                 var16 = Class_ka.mb.Gc + Class_vh.nb + -var11.Gc;
                              }

                              var13 = var16;
                              if (~(Class_tg.c + Class_ka.mb.nc) > ~(var17 + var11.nc)) {
                                 var17 = Class_tg.c + (Class_ka.mb.nc - var11.nc);
                              }

                              var14 = var17;
                           }

                           if (!var11.k) {
                              var15 = 128;
                           }
                        }

                        int var18;
                        int var19;
                        int var36;
                        int var38;
                        label936: {
                           if (var11.Kc == 2) {
                              var36 = var6;
                              var19 = var0;
                              var38 = var2;
                              var18 = var4;
                              if (var33 == 0) {
                                 break label936;
                              }
                           }

                           var36 = var13 <= var6 ? var6 : var13;
                           var38 = ~var14 >= ~var2 ? var2 : var14;
                           int var20 = var11.Gc + var13;
                           int var21 = var14 - -var11.nc;
                           if (~var11.Kc == -10) {
                              var21++;
                              var20++;
                           }

                           var19 = ~var0 >= ~var21 ? var0 : var21;
                           var18 = ~var20 > ~var4 ? var20 : var4;
                        }

                        if (!var11.dc || ~var36 > ~var18 && (var38 < var19 || var33 != 0)) {
                           if (var11.ab != 0) {
                              if (~var11.ab == -1338) {
                                 Class_ai.F = var13;
                                 Class_c.x = var14;
                                 Class_w.S = var11;
                                 Class_se.a(var14, var11.Gc, false, var13, ~var11.ab == -1404, var11.nc);
                                 Class_nc.c(var6, var2, var4, var0);
                                 if (var33 == 0) {
                                    continue;
                                 }
                              }

                              if (var11.ab == 1338) {
                                 if (!var11.a(2663)) {
                                    continue;
                                 }

                                 Class_hc.a(var11, var13, var14, var12, (byte)-101);
                                 Class_nc.c(var6, var2, var4, var0);
                                 if (var33 == 0) {
                                    continue;
                                 }
                              }

                              if (var11.ab == 1339) {
                                 if (!var11.a(2663)) {
                                    continue;
                                 }

                                 Class_b.a(var14, var12, (byte)-123, var11, var13);
                                 Class_nc.c(var6, var2, var4, var0);
                                 if (var33 == 0) {
                                    continue;
                                 }
                              }

                              if (~var11.ab == -1401) {
                                 Class_pa.a(var14, (byte)51, var11.nc, var11.Gc, var13);
                                 Class_vb.j[var12] = true;
                                 Class_n.u[var12] = true;
                                 Class_nc.c(var6, var2, var4, var0);
                                 if (var33 == 0) {
                                    continue;
                                 }
                              }

                              if (var11.ab == 1401) {
                                 Class_ff.a(var14, var11.nc, var11.Gc, var13, true);
                                 Class_vb.j[var12] = true;
                                 Class_n.u[var12] = true;
                                 Class_nc.c(var6, var2, var4, var0);
                                 if (var33 == 0) {
                                    continue;
                                 }
                              }

                              if (var11.ab == 1402) {
                                 Class_mc.a(var14, var13, 95);
                                 Class_vb.j[var12] = true;
                                 Class_n.u[var12] = true;
                                 if (var33 == 0) {
                                    continue;
                                 }
                              }

                              if (~var11.ab == -1405) {
                                 Class_ea.a((byte)-38, var14, Class_db.sb, Class_ma.gb, var11.Gc, var11.nc, var13, var11);
                                 Class_vb.j[var12] = true;
                                 Class_n.u[var12] = true;
                                 if (var33 == 0) {
                                    continue;
                                 }
                              }

                              if (var11.ab == 1405) {
                                 if (!Class_qd.r) {
                                    continue;
                                 }

                                 int var39 = var13 + var11.Gc;
                                 int var51 = var14 + 15;
                                 Class_fi.A.a(Class_o.a(2, new Class_r[]{Class_cf.rb, Class_og.b(Class_fd.g, 0)}), var39, var51, 16776960, -1);
                                 var51 += 15;
                                 Runtime var22 = Runtime.getRuntime();
                                 int var23 = (int)((var22.totalMemory() + -var22.freeMemory()) / 1024L);
                                 int var24 = 16776960;
                                 if (var23 > 65536) {
                                    var24 = 16711680;
                                 }

                                 Class_fi.A.a(Class_o.a(2, new Class_r[]{Class_jd.h, Class_og.b(var23, var1 ^ -21644), Class_ij.c}), var39, var51, var24, -1);
                                 Class_vb.j[var12] = true;
                                 var51 += 15;
                                 Class_n.u[var12] = true;
                                 if (var33 == 0) {
                                    continue;
                                 }
                              }
                           }

                           if (!Class_ui.h) {
                              if (~var11.Kc == -1
                                 && var11.ed
                                 && ~var36 >= ~Class_v.B
                                 && ~var38 >= ~Class_pc.c
                                 && ~var18 < ~Class_v.B
                                 && ~var19 < ~Class_pc.c
                                 && !Class_pe.E) {
                                 Class_dd.I[0] = 1004;
                                 Class_tj.u[0] = Class_fd.h;
                                 Class_ma.ib = 1;
                                 Class_fb.h[0] = Class_hk.S;
                              }

                              if (Class_v.B >= var36 && ~Class_pc.c <= ~var38 && var18 > Class_v.B && Class_pc.c < var19) {
                                 Class_vb.a(-var13 + Class_v.B, var11, true, -var14 + Class_pc.c);
                              }
                           }

                           if (var11.Kc == 0) {
                              if (!var11.dc && client.c(var11) && var11 != Class_si.b) {
                                 continue;
                              }

                              if (!var11.dc) {
                                 if (~(var11.M + -var11.nc) > ~var11.kb) {
                                    var11.kb = var11.M - var11.nc;
                                 }

                                 if (var11.kb < 0) {
                                    var11.kb = 0;
                                 }
                              }

                              a(var19, -21644, var38, var3, var18, var12, var36, var14 - var11.kb, var11.K, -var11.Nb + var13);
                              if (var11.n != null) {
                                 a(var19, -21644, var38, var11.n, var18, var12, var36, var14 + -var11.kb, var11.K, -var11.Nb + var13);
                              }

                              Class_be var40 = (Class_be)Class_nj.p.a(var11.K, var1 + 21602);
                              if (var40 != null) {
                                 if (~var40.q == -1
                                    && !Class_ui.h
                                    && ~var36 >= ~Class_v.B
                                    && ~Class_pc.c <= ~var38
                                    && ~Class_v.B > ~var18
                                    && ~var19 < ~Class_pc.c
                                    && !Class_pe.E) {
                                    Class_dd.I[0] = 1004;
                                    Class_tj.u[0] = Class_fd.h;
                                    Class_ma.ib = 1;
                                    Class_fb.h[0] = Class_hk.S;
                                 }

                                 Class_pe.a(var36, var38, var19, var14, var40.t, var12, var13, var18, (byte)-112);
                              }

                              Class_nc.c(var6, var2, var4, var0);
                              Class_kd.d();
                           }

                           if (Class_ae.f[var12] || ~Class_ec.S < -2) {
                              if (~var11.Kc == -1 && !var11.dc && var11.M > var11.nc) {
                                 Class_j.a(var14, var11.kb, var11.M, var11.Gc + var13, var11.nc, (byte)-62);
                              }

                              if (~var11.Kc != -2) {
                                 if (~var11.Kc == -3) {
                                    int var41 = 0;
                                    int var54 = 0;
                                    if (var33 != 0 || ~var11.Nc < ~var54) {
                                       do {
                                          int var62 = 0;
                                          if (var33 != 0 || ~var11.r < ~var62) {
                                             do {
                                                int var80 = var14 + (32 - -var11.Mb) * var54;
                                                int var69 = var13 + (var11.zc + 32) * var62;
                                                if (~var41 > -21) {
                                                   var69 += var11.sb[var41];
                                                   var80 += var11.l[var41];
                                                }

                                                label1009: {
                                                   if (~var11.N[var41] >= -1) {
                                                      if (var11.Hb == null || var41 >= 20) {
                                                         break label1009;
                                                      }

                                                      Class_jb var25 = var11.a((byte)-40, var41);
                                                      if (var25 == null) {
                                                         if (!Class_pd.j) {
                                                            break label1009;
                                                         }

                                                         Class_tg.a(var11, var1 + 21530);
                                                         if (var33 == 0) {
                                                            break label1009;
                                                         }
                                                      }

                                                      var25.c(var69, var80);
                                                      if (var33 == 0) {
                                                         break label1009;
                                                      }
                                                   }

                                                   int var26 = 0;
                                                   int var90 = 0;
                                                   int var27 = var11.N[var41] - 1;
                                                   if (~var6 > ~(32 + var69) && var69 < var4 && ~(var80 + 32) < ~var2 && ~var80 > ~var0
                                                      || var11 == Class_ij.f && Class_bk.Q == var41) {
                                                      Class_jb var28;
                                                      label1010: {
                                                         if (Class_vh.cb != 1 || ~var41 != ~Class_fa.Kb || var11.K != Class_hk.P) {
                                                            var28 = Class_h.a(1, var11.s[var41], false, var27, 3153952, var11.D);
                                                            if (var33 == 0) {
                                                               if (Class_kd.b) {
                                                                  Class_vb.j[var12] = true;
                                                               }
                                                               break label1010;
                                                            }
                                                         }

                                                         var28 = Class_h.a(2, var11.s[var41], false, var27, 0, var11.D);
                                                         if (Class_kd.b) {
                                                            Class_vb.j[var12] = true;
                                                         }
                                                      }

                                                      label855:
                                                      if (var28 != null) {
                                                         if (Class_ij.f != var11 || ~var41 != ~Class_bk.Q) {
                                                            if (Class_qe.L != var11 || ~var41 != ~Class_kh.d) {
                                                               var28.c(var69, var80);
                                                               if (var33 == 0) {
                                                                  break label855;
                                                               }
                                                            }

                                                            var28.a(var69, var80, 128);
                                                            if (var33 == 0) {
                                                               break label855;
                                                            }
                                                         }

                                                         var90 = Class_pj.c + -Class_jg.c;
                                                         if (var90 < 5 && ~var90 < 4) {
                                                            var90 = 0;
                                                         }

                                                         var26 = -Class_nf.x + Class_bh.k;
                                                         if (~var26 > -6 && ~var26 < 4) {
                                                            var26 = 0;
                                                         }

                                                         if (~Class_ea.Z > -6) {
                                                            var26 = 0;
                                                            var90 = 0;
                                                         }

                                                         var28.a(var69 - -var90, var80 + var26, 128);
                                                         if (var8 != -1) {
                                                            Class_ha var29 = var3[var8 & 65535];
                                                            int var31 = Class_nc.h;
                                                            int var30 = Class_nc.g;
                                                            if (~var30 < ~(var80 + var26) && var29.kb > 0) {
                                                               int var32 = Class_sj.k * (var30 + (-var80 - var26)) / 3;
                                                               if (~var32 < ~(Class_sj.k * 10)) {
                                                                  var32 = 10 * Class_sj.k;
                                                               }

                                                               if (~var29.kb > ~var32) {
                                                                  var32 = var29.kb;
                                                               }

                                                               Class_nf.x += var32;
                                                               var29.kb -= var32;
                                                               Class_tg.a(var29, -116);
                                                            }

                                                            if (~var31 > ~(32 + var26 + var80) && ~var29.kb > ~(var29.M - var29.nc)) {
                                                               int var112 = Class_sj.k * (32 + var80 - -var26 + -var31) / 3;
                                                               if (~var112 < ~(10 * Class_sj.k)) {
                                                                  var112 = Class_sj.k * 10;
                                                               }

                                                               if (~(-var29.nc + (var29.M - var29.kb)) > ~var112) {
                                                                  var112 = -var29.kb + (var29.M - var29.nc);
                                                               }

                                                               var29.kb += var112;
                                                               Class_nf.x -= var112;
                                                               Class_tg.a(var29, -117);
                                                               if (var33 != 0) {
                                                                  Class_tg.a(var11, -119);
                                                               }
                                                            }
                                                         }
                                                      } else {
                                                         Class_tg.a(var11, -119);
                                                      }
                                                   }
                                                }

                                                var41++;
                                             } while (~var11.r < ~(++var62));
                                          }
                                       } while (~var11.Nc < ~(++var54));
                                    }

                                    if (var33 == 0) {
                                       continue;
                                    }
                                 }

                                 if (var11.Kc == 3) {
                                    int var42;
                                    label821: {
                                       if (a(var1 + 21644, var11)) {
                                          var42 = var11.cc;
                                          if (Class_si.b != var11 || ~var11.u == -1) {
                                             break label821;
                                          }

                                          var42 = var11.u;
                                          if (var33 == 0) {
                                             break label821;
                                          }
                                       }

                                       var42 = var11.yb;
                                       if (var11 == Class_si.b && ~var11.ub != -1) {
                                          var42 = var11.ub;
                                       }
                                    }

                                    if (var15 != 0) {
                                       if (var11.gc) {
                                          Class_nc.c(var13, var14, var11.Gc, var11.nc, var42, -(0xFF & var15) + 256);
                                          if (var33 == 0) {
                                             continue;
                                          }
                                       }

                                       Class_nc.b(var13, var14, var11.Gc, var11.nc, var42, -(0xFF & var15) + 256);
                                       if (var33 == 0) {
                                          continue;
                                       }
                                    }

                                    if (!var11.gc) {
                                       Class_nc.a(var13, var14, var11.Gc, var11.nc, var42);
                                       if (var33 == 0) {
                                          continue;
                                       }
                                    }

                                    Class_nc.f(var13, var14, var11.Gc, var11.nc, var42);
                                    if (var33 == 0) {
                                       continue;
                                    }
                                 }

                                 if (var11.Kc == 4) {
                                    Class_af var43 = var11.a(-103, Class_lh.Cb);
                                    if (var43 == null) {
                                       if (!Class_pd.j) {
                                          continue;
                                       }

                                       Class_tg.a(var11, -117);
                                       if (var33 == 0) {
                                          continue;
                                       }
                                    }

                                    int var55;
                                    Class_r var63;
                                    label809: {
                                       var63 = var11.vc;
                                       if (a(var1 ^ -21644, var11)) {
                                          var55 = var11.cc;
                                          if (var11 == Class_si.b && ~var11.u != -1) {
                                             var55 = var11.u;
                                          }

                                          if (~var11.uc.d((byte)-111) >= -1) {
                                             break label809;
                                          }

                                          var63 = var11.uc;
                                          if (var33 == 0) {
                                             break label809;
                                          }
                                       }

                                       var55 = var11.yb;
                                       if (var11 == Class_si.b && var11.ub != 0) {
                                          var55 = var11.ub;
                                       }
                                    }

                                    if (var11.dc && ~var11.Q != 0) {
                                       Class_cf var70 = Class_ra.a(-25672, var11.Q);
                                       var63 = var70.J;
                                       if (var63 == null) {
                                          var63 = Class_td.U;
                                       }

                                       if ((var70.cb == 1 || var11.dd != 1) && ~var11.dd != 0) {
                                          var63 = Class_o.a(2, new Class_r[]{Class_hj.U, var63, Class_hj.Z, Class_vh.b(var11.dd, var1 ^ 16468)});
                                       }
                                    }

                                    if (var11 == Class_eb.f) {
                                       var55 = var11.yb;
                                       var63 = Class_wa.f;
                                    }

                                    if (!var11.dc) {
                                       var63 = Class_cd.a(var63, 27757, var11);
                                    }

                                    var43.a(var63, var13, var14, var11.Gc, var11.nc, var55, var11.f ? 0 : -1, var11.v, var11.wb, var11.H);
                                    if (var33 == 0) {
                                       continue;
                                    }
                                 }

                                 if (~var11.Kc == -6) {
                                    if (var11.dc) {
                                       Class_jb var44;
                                       label787: {
                                          if (var11.Q != -1) {
                                             var44 = Class_h.a(var11.Zb, var11.dd, false, var11.Q, var11.Uc, var11.D);
                                             if (var33 == 0) {
                                                break label787;
                                             }
                                          }

                                          var44 = var11.a(false, 20503);
                                       }

                                       if (var44 == null) {
                                          if (!Class_pd.j) {
                                             continue;
                                          }

                                          Class_tg.a(var11, -127);
                                          if (var33 == 0) {
                                             continue;
                                          }
                                       }

                                       int var56 = var44.M;
                                       int var64 = var44.U;
                                       if (var11.tb) {
                                          int var71 = (var11.Gc + -1 + var56) / var56;
                                          int var81 = (var11.nc + var64 + -1) / var64;
                                          Class_nc.b(var13, var14, var13 - -var11.Gc, var14 + var11.nc);
                                          int var92 = 0;
                                          if (var33 != 0 || ~var71 < ~var92) {
                                             do {
                                                int var100 = 0;
                                                if (var33 != 0 || ~var81 < ~var100) {
                                                   do {
                                                      if (~var11.Lb != -1) {
                                                         var44.a(
                                                            var11.Lb, var100 * var64 + var14 - -(var64 / 2), var92 * var56 + var13 + var56 / 2, 4096, (byte)106
                                                         );
                                                         if (var33 == 0) {
                                                            var100++;
                                                            continue;
                                                         }
                                                      }

                                                      if (var15 != 0) {
                                                         var44.a(var92 * var56 + var13, var64 * var100 + var14, 256 + -(0xFF & var15));
                                                         if (var33 != 0) {
                                                            var44.c(var92 * var56 + var13, var14 + var64 * var100);
                                                            var100++;
                                                         } else {
                                                            var100++;
                                                         }
                                                      } else {
                                                         var44.c(var92 * var56 + var13, var14 + var64 * var100);
                                                         var100++;
                                                      }
                                                   } while (~var81 < ~var100);
                                                }
                                             } while (~var71 < ~(++var92));
                                          }

                                          Class_nc.c(var6, var2, var4, var0);
                                          if (var33 == 0) {
                                             continue;
                                          }
                                       }

                                       int var72 = 4096 * var11.Gc / var56;
                                       if (var11.Lb == 0) {
                                          if (~var15 != -1) {
                                             var44.a(var13, var14, var11.Gc, var11.nc, 256 + -(var15 & 0xFF));
                                             if (var33 == 0) {
                                                continue;
                                             }
                                          }

                                          if (~var56 != ~var11.Gc || ~var11.nc != ~var64) {
                                             var44.b(var13, var14, var11.Gc, var11.nc);
                                             if (var33 == 0) {
                                                continue;
                                             }
                                          }

                                          var44.c(var13, var14);
                                          if (var33 == 0) {
                                             continue;
                                          }
                                       }

                                       var44.a(var11.Lb, var11.nc / 2 + var14, var11.Gc / 2 + var13, var72, (byte)118);
                                       if (var33 == 0) {
                                          continue;
                                       }
                                    }

                                    Class_jb var45 = var11.a(a(0, var11), var1 + 42147);
                                    if (var45 == null) {
                                       if (!Class_pd.j) {
                                          continue;
                                       }

                                       Class_tg.a(var11, -121);
                                       if (var33 == 0) {
                                          continue;
                                       }
                                    }

                                    var45.c(var13, var14);
                                    if (var33 == 0) {
                                       continue;
                                    }
                                 }

                                 if (var11.Kc == 6) {
                                    boolean var46 = a(var1 + 21644, var11);
                                    Class_jh var65 = null;
                                    int var57;
                                    if (var46) {
                                       var57 = var11.jc;
                                       if (var33 != 0) {
                                          var57 = var11.xb;
                                       }
                                    } else {
                                       var57 = var11.xb;
                                    }

                                    int var73 = 0;
                                    if (~var11.Q == 0) {
                                       if (~var11.fc == -6) {
                                          if (~var11.V != 0) {
                                             int var84 = 2047 & var11.V;
                                             if (~var84 == ~Class_kg.A) {
                                                var84 = 2047;
                                             }

                                             Class_fa var94 = Class_db.Q[var84];
                                             Class_uc var101 = ~var57 == 0 ? null : Class_kk.a((byte)-36, var57);
                                             if (var94 != null && ~((int)var94.Zb.f(10908) << -2035566133) == ~(-2048 & var11.V)) {
                                                var65 = var94.Vb.a(var11.a, var101, 0, null, (byte)46);
                                             }
                                          } else {
                                             var65 = Class_te.U.a(-1, null, -1, null, (byte)99);
                                          }
                                       } else if (~var57 == 0) {
                                          var65 = var11.a(-1, var46, (byte)-27, Class_gg.B.Vb, null);
                                          if (var65 == null && Class_pd.j) {
                                             Class_tg.a(var11, -128);
                                          }
                                       } else {
                                          Class_uc var85 = Class_kk.a((byte)-36, var57);
                                          var65 = var11.a(var11.a, var46, (byte)-27, Class_gg.B.Vb, var85);
                                          if (var65 == null && Class_pd.j) {
                                             Class_tg.a(var11, -115);
                                          }
                                       }
                                    } else {
                                       Class_cf var82 = Class_ra.a(-25672, var11.Q);
                                       label736:
                                       if (var82 != null) {
                                          var82 = var82.b(var11.dd, -126);
                                          Class_uc var93 = var57 != -1 ? Class_kk.a((byte)-36, var57) : null;
                                          var65 = var82.a(1, var93, var11.a, 13895);
                                          if (var65 == null) {
                                             Class_tg.a(var11, -128);
                                             if (var33 == 0) {
                                                break label736;
                                             }
                                          }

                                          var73 = -var65.a() / 2;
                                       }
                                    }

                                    if (var65 == null) {
                                       continue;
                                    }

                                    int var86;
                                    label728: {
                                       if (var11.L <= 0) {
                                          var86 = 256;
                                          if (var33 == 0) {
                                             break label728;
                                          }
                                       }

                                       var86 = (var11.Gc << -2121766488) / var11.L;
                                    }

                                    int var95;
                                    if (~var11.xc < -1) {
                                       var95 = (var11.nc << -830447320) / var11.xc;
                                       if (var33 != 0) {
                                          var95 = 256;
                                       }
                                    } else {
                                       var95 = 256;
                                    }

                                    label962: {
                                       int var106 = var11.nc / 2 + var14 + (var95 * var11.ib >> 1319467880);
                                       int var102 = var11.Gc / 2 + var13 + (var11.Xb * var86 >> 860822824);
                                       Class_kd.a(var102, var106);
                                       int var109 = Class_kd.e[var11.ec] * var11.g >> -11452624;
                                       int var111 = var11.g * Class_kd.q[var11.ec] >> 1627033072;
                                       if (!var11.dc) {
                                          var65.a(0, var11.gb, 0, var11.ec, 0, var109, var111);
                                          if (var33 == 0) {
                                             break label962;
                                          }
                                       }

                                       if (!var11.fb) {
                                          var65.a(0, var11.gb, var11.Tb, var11.ec, var11.z, var11.Ib + var109 - -var73, var111 - -var11.Ib);
                                          if (var33 == 0) {
                                             break label962;
                                          }
                                       }

                                       ((Class_qa)var65).b(0, var11.gb, var11.Tb, var11.ec, var11.z, var109 + (var73 - -var11.Ib), var111 + var11.Ib, var11.g);
                                    }

                                    Class_kd.e();
                                    if (var33 == 0) {
                                       continue;
                                    }
                                 }

                                 if (~var11.Kc == -8) {
                                    Class_af var47 = var11.a(-92, Class_lh.Cb);
                                    if (var47 == null) {
                                       if (!Class_pd.j) {
                                          continue;
                                       }

                                       Class_tg.a(var11, -116);
                                       if (var33 == 0) {
                                          continue;
                                       }
                                    }

                                    int var58 = 0;
                                    int var66 = 0;
                                    if (var33 != 0 || var11.Nc > var66) {
                                       do {
                                          int var74 = 0;
                                          if (var33 != 0 || ~var11.r < ~var74) {
                                             do {
                                                if (var11.N[var58] <= 0) {
                                                   var58++;
                                                   var74++;
                                                } else {
                                                   Class_cf var87 = Class_ra.a(var1 + -4028, var11.N[var58] - 1);
                                                   Class_r var96;
                                                   if (~var87.cb != -2 && var11.s[var58] == 1) {
                                                      var96 = Class_o.a(2, new Class_r[]{Class_hj.U, var87.J, Class_r.S});
                                                   } else {
                                                      var96 = Class_o.a(2, new Class_r[]{Class_hj.U, var87.J, Class_hj.Z, Class_vh.b(var11.s[var58], -5344)});
                                                      if (var33 != 0) {
                                                         var96 = Class_o.a(2, new Class_r[]{Class_hj.U, var87.J, Class_r.S});
                                                      }
                                                   }

                                                   int var103 = (115 - -var11.zc) * var74 + var13;
                                                   int var107 = var14 - -((var11.Mb + 12) * var66);
                                                   if (var11.v != 0) {
                                                      if (var11.v == 1) {
                                                         var47.c(var96, 57 + var103, var107, var11.yb, !var11.f ? -1 : 0);
                                                         if (var33 == 0) {
                                                            var58++;
                                                            var74++;
                                                            continue;
                                                         }
                                                      }

                                                      var47.a(var96, -1 + var103 + 115, var107, var11.yb, var11.f ? 0 : -1);
                                                      if (var33 != 0) {
                                                         var47.b(var96, var103, var107, var11.yb, var11.f ? 0 : -1);
                                                         var58++;
                                                         var74++;
                                                      } else {
                                                         var58++;
                                                         var74++;
                                                      }
                                                   } else {
                                                      var47.b(var96, var103, var107, var11.yb, var11.f ? 0 : -1);
                                                      var58++;
                                                      var74++;
                                                   }
                                                }
                                             } while (~var11.r < ~var74);
                                          }
                                       } while (var11.Nc > ++var66);
                                    }
                                 }

                                 if (~var11.Kc == -9 && Class_vb.i == var11 && Class_jg.j == Class_pf.f) {
                                    int var48 = 0;
                                    int var59 = 0;
                                    Class_af var67 = Class_fi.A;
                                    Class_r var75 = var11.vc;
                                    var75 = Class_cd.a(var75, var1 + 49401, var11);
                                    if (var33 != 0 || var75.d((byte)-117) > 0) {
                                       do {
                                          Class_r var88;
                                          label657: {
                                             int var97 = var75.a(61, Class_ud.i);
                                             if (~var97 == 0) {
                                                var88 = var75;
                                                var75 = Class_hk.S;
                                                if (var33 == 0) {
                                                   break label657;
                                                }
                                             }

                                             var88 = var75.a(0, (byte)-74, var97);
                                             var75 = var75.b(4 + var97, true);
                                          }

                                          int var104 = var67.c(var88);
                                          if (var104 > var48) {
                                             var48 = var104;
                                          }

                                          var59 += var67.K + 1;
                                       } while (var75.d((byte)-117) > 0);
                                    }

                                    var48 += 6;
                                    var59 += 7;
                                    int var98 = -var48 + -5 + (var13 - -var11.Gc);
                                    int var105 = var14 - (-var11.nc + -5);
                                    if (~var0 > ~(var105 + var59)) {
                                       var105 = -var59 + var0;
                                    }

                                    if (var98 < var13 + 5) {
                                       var98 = 5 + var13;
                                    }

                                    if (~(var98 + var48) < ~var4) {
                                       var98 = -var48 + var4;
                                    }

                                    Class_nc.f(var98, var105, var48, var59, 16777120);
                                    Class_nc.a(var98, var105, var48, var59, 0);
                                    var75 = var11.vc;
                                    int var108 = var67.K + var105 + 2;
                                    var75 = Class_cd.a(var75, 27757, var11);
                                    if (var33 != 0 || var75.d((byte)-102) > 0) {
                                       do {
                                          Class_r var89;
                                          label640: {
                                             int var110 = var75.a(92, Class_ud.i);
                                             if (~var110 == 0) {
                                                var89 = var75;
                                                var75 = Class_hk.S;
                                                if (var33 == 0) {
                                                   break label640;
                                                }
                                             }

                                             var89 = var75.a(0, (byte)-74, var110);
                                             var75 = var75.b(var110 - -4, true);
                                          }

                                          var67.b(var89, var98 - -3, var108, 0, -1);
                                          var108 += var67.K - -1;
                                       } while (var75.d((byte)-102) > 0);
                                    }
                                 }

                                 if (~var11.Kc == -10) {
                                    int var50;
                                    int var61;
                                    int var68;
                                    int var79;
                                    label628: {
                                       if (var11.Ic) {
                                          var79 = var14;
                                          var50 = var13;
                                          var68 = var13 - -var11.Gc;
                                          var61 = var14 + var11.nc;
                                          if (var33 == 0) {
                                             break label628;
                                          }
                                       }

                                       var50 = var13;
                                       var79 = var11.nc + var14;
                                       var61 = var14;
                                       var68 = var11.Gc + var13;
                                    }

                                    if (~var11.ob != -2) {
                                       Class_nc.a(var50, var61, var68, var79, var11.yb, var11.ob);
                                       if (var33 == 0) {
                                          continue;
                                       }
                                    }

                                    Class_nc.b(var50, var61, var68, var79, var11.yb);
                                 }
                              }
                           }
                        }
                     }
                  }
               } while (++var10 < var3.length);
            }
         }
      } catch (RuntimeException var34) {
         throw Class_sh.a(
            var34,
            "oi.E("
               + var0
               + ','
               + var1
               + ','
               + var2
               + ','
               + (var3 != null ? "{...}" : "null")
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
               + ')'
         );
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final boolean a(int var0, Class_ha var1) {
      int var5 = client.lb;

      try {
         s++;
         if (var1.O == null) {
            return false;
         } else {
            int var2 = var0;
            if (var5 == 0 && ~var0 <= ~var1.O.length) {
               return true;
            } else {
               do {
                  int var3 = Class_ug.a(var2, var0 + 20, var1);
                  int var4 = var1.J[var2];
                  if (var1.O[var2] == 2) {
                     if (~var4 >= ~var3) {
                        return false;
                     }
                  } else if (~var1.O[var2] != -4) {
                     if (~var1.O[var2] != -5) {
                        if (var3 != var4) {
                           return false;
                        }
                     } else if (var4 == var3) {
                        return false;
                     }
                  } else if (~var4 <= ~var3) {
                     return false;
                  }
               } while (~(++var2) > ~var1.O.length);

               return true;
            }
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "oi.F(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   static final void a(byte var0) {
      try {
         v++;
         Class_ha.gd.b((byte)94);
         if (var0 >= -45) {
            a(7, 117, -119);
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "oi.G(" + var0 + ')');
      }
   }

   static final int b(int var0, int var1, int var2) {
      try {
         if (var2 != 16) {
            a(124, 106, 95);
         }

         w++;
         int var3 = Class_tc.a(133988164, var1 - 1, -1 + var0)
            - -Class_tc.a(133988164, -1 + var1, 1 + var0)
            - (-Class_tc.a(133988164, var1 - -1, -1 + var0) - Class_tc.a(133988164, 1 + var1, var0 - -1));
         int var4 = Class_tc.a(133988164, var1, -1 + var0)
            + Class_tc.a(133988164, var1, 1 + var0)
            + (Class_tc.a(133988164, -1 + var1, var0) - -Class_tc.a(var2 ^ 133988180, 1 + var1, var0));
         int var5 = Class_tc.a(133988164, var1, var0);
         return var4 / 8 + (var3 / 16 - -(var5 / 4));
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "oi.A(" + var0 + 44 + var1 + 44 + var2 + 41);
      }
   }

   public Class_oi() {
   }
}
