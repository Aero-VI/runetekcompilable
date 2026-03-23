import java.io.IOException;

final class Class_pa implements Class_ri {
   private boolean[] a;
   static int b;
   static int c;
   static int d;
   static int e;
   static int f;
   static int g;
   private Class_cj h;
   static int[] i = new int[128];
   static int j;
   static int k;
   static int l;
   private Class_cj m;
   private Class_nj n;
   static Class_r o = Class_tc.a(43, "headicons_pk");
   private byte[] p;
   static int q;
   static int r;
   static int[] s;
   private boolean t;
   static int u;
   private boolean[] v;
   private byte[] w;
   static int x;
   static Class_r y = null;
   static int z;
   private int A;
   static Class_r B = Class_tc.a(43, "Lade Benutzeroberfl-=che )2 ");
   static Class_r C = Class_tc.a(43, "p11_full");
   static int D;
   private boolean[] E;
   private short[] F;
   static int G;
   private boolean[] H;
   private byte[] I;
   static int J;
   private boolean[] K;
   static int L;
   private byte[] M;

   public final boolean b(byte var1, int var2) {
      try {
         q++;
         if (!this.t && !this.a[var2]) {
            if (var1 >= -110) {
               this.a((byte)-57);
            }

            return false;
         } else {
            return true;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "pa.C(" + var1 + ',' + var2 + ')');
      }
   }

   public final int[] b(int var1, int var2) {
      try {
         Class_fe var3 = this.c((byte)84, var2);
         e++;
         if (var1 <= 70) {
            return null;
         } else {
            return var3 == null ? null : var3.a(this, -109, this.h, this.t || this.a[var2]);
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "pa.A(" + var1 + ',' + var2 + ')');
      }
   }

   public final boolean a(int var1, int var2) {
      try {
         if (var2 != 2) {
            return true;
         } else {
            D++;
            return this.K[var1];
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "pa.G(" + var1 + ',' + var2 + ')');
      }
   }

   static final Class_af a(Class_cj var0, int var1, byte var2, Class_cj var3, int var4) {
      try {
         k++;
         if (!Class_ve.a(-29381, var4, var0, var1)) {
            return null;
         } else {
            if (var2 < 52) {
               a(45);
            }

            return Class_oc.a(var3.a(var1, 0, var4), false);
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(
            var6, "pa.O(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ',' + var4 + ')'
         );
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final Class_pb a(Class_r var0, int var1, Class_cj var2) {
      int var8 = client.lb;

      try {
         b++;
         int var3 = var2.a(var0, (byte)-94);
         if (var1 != 12666) {
            B = null;
         }

         if (var3 == -1) {
            return new Class_pb(0);
         } else {
            int[] var4 = var2.a(false, var3);
            Class_pb var5 = new Class_pb(var4.length);
            int var6 = 0;
            if (var8 == 0 && var5.h <= var6) {
               return var5;
            } else {
               do {
                  Class_lh var7 = new Class_lh(var2.a(var4[var6], 0, var3));
                  var5.f[var6] = var7.e(var1 + -12539);
                  var5.i[var6] = var7.o(3390);
                  var5.b[var6] = (short)var7.k(1355769544);
                  var5.e[var6] = (short)var7.k(var1 + 1355756878);
                  var5.k[var6] = var7.h(-5528);
               } while (var5.h > ++var6);

               return var5;
            }
         }
      } catch (RuntimeException var9) {
         throw Class_sh.a(var9, "pa.H(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(boolean var0) {
      int var12 = client.lb;

      try {
         if (Class_c.u > 0) {
            Class_c.u--;
         }

         J++;
         if (Class_sc.j > 1) {
            Class_ec.I = Class_qd.F;
            Class_sc.j--;
         }

         if (Class_ja.y) {
            Class_ja.y = false;
            Class_ak.b((byte)-21);
         } else {
            int var1 = 0;
            if (var12 != 0 || ~var1 > -101) {
               while (Class_bi.a(-110) || var12 != 0) {
                  if (~(++var1) <= -101) {
                     break;
                  }
               }
            }

            if (~Class_ua.b == -31) {
               Class_hg.a(false, 141, Class_cj.S);
               Object var2 = Class_bi.r.m;
               synchronized (var2) {
                  label1210: {
                     if (!Class_te.db) {
                        Class_bi.r.o = 0;
                        if (var12 == 0) {
                           break label1210;
                        }
                     }

                     label1179:
                     if (Class_eb.d != 0 || Class_bi.r.o >= 40) {
                        Class_nk.e++;
                        Class_cj.S.o(-79, 117);
                        Class_cj.S.b(32, 0);
                        int var4 = Class_cj.S.p;
                        int var5 = 0;
                        int var6 = 0;
                        if (var12 != 0 || var6 < Class_bi.r.o) {
                           while (~(Class_cj.S.p + -var4) > -241) {
                              int var7 = Class_bi.r.p[var6];
                              int var8 = Class_bi.r.n[var6];
                              if (var7 >= 0) {
                                 if (var7 > 65534) {
                                    var7 = 65534;
                                    if (var12 != 0) {
                                       var7 = 0;
                                    }
                                 }
                              } else {
                                 var7 = 0;
                              }

                              label1171: {
                                 var5++;
                                 if (~var8 > -1) {
                                    var8 = 0;
                                    if (var12 == 0) {
                                       break label1171;
                                    }
                                 }

                                 if (~var8 < -65535) {
                                    var8 = 65534;
                                 }
                              }

                              boolean var9 = false;
                              if (~Class_bi.r.p[var6] == 0 && Class_bi.r.n[var6] == -1) {
                                 var9 = true;
                                 var7 = -1;
                                 var8 = -1;
                              }

                              label1212: {
                                 if (Class_db.V == var8 && ~var7 == ~Class_w.Q) {
                                    if (~Class_aj.f <= -2048) {
                                       break label1212;
                                    }

                                    Class_aj.f++;
                                    if (var12 == 0) {
                                       break label1212;
                                    }
                                 }

                                 int var11 = -Class_w.Q + var7;
                                 Class_w.Q = var7;
                                 int var10 = var8 + -Class_db.V;
                                 Class_db.V = var8;
                                 if (Class_aj.f < 8 && ~var10 <= 31 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                    var10 += 32;
                                    var11 += 32;
                                    Class_cj.S.a(false, (var10 << 1808956998) + (Class_aj.f << 674618540) + var11);
                                    Class_aj.f = 0;
                                    if (var12 == 0) {
                                       break label1212;
                                    }
                                 }

                                 if (Class_aj.f < 32 && ~var10 <= 127 && var10 <= 127 && var11 >= -128 && ~var11 >= -128) {
                                    var11 += 128;
                                    Class_cj.S.b(32, Class_aj.f + 128);
                                    var10 += 128;
                                    Class_cj.S.a(false, (var10 << 1323552040) + var11);
                                    Class_aj.f = 0;
                                    if (var12 == 0) {
                                       break label1212;
                                    }
                                 }

                                 if (Class_aj.f < 32) {
                                    Class_cj.S.b(32, 192 - -Class_aj.f);
                                    if (!var9) {
                                       Class_cj.S.g(544537784, var7 << 1282459408 | var8);
                                       if (var12 != 0) {
                                          Class_cj.S.g(544537784, -2147483648);
                                       }
                                    } else {
                                       Class_cj.S.g(544537784, -2147483648);
                                    }

                                    Class_aj.f = 0;
                                    if (var12 == 0) {
                                       break label1212;
                                    }
                                 }

                                 Class_cj.S.a(false, Class_aj.f + 57344);
                                 if (var9) {
                                    Class_cj.S.g(544537784, -2147483648);
                                    if (var12 == 0) {
                                       Class_aj.f = 0;
                                       break label1212;
                                    }
                                 }

                                 Class_cj.S.g(544537784, var7 << 658823504 | var8);
                                 Class_aj.f = 0;
                              }

                              if (++var6 >= Class_bi.r.o) {
                                 break;
                              }
                           }
                        }

                        Class_cj.S.e(Class_cj.S.p - var4, 119);
                        if (Class_bi.r.o <= var5) {
                           Class_bi.r.o = 0;
                           if (var12 == 0) {
                              break label1179;
                           }
                        }

                        Class_bi.r.o -= var5;
                        int var40 = 0;
                        if (var12 != 0 || Class_bi.r.o > var40) {
                           do {
                              Class_bi.r.n[var40] = Class_bi.r.n[var40 - -var5];
                              Class_bi.r.p[var40] = Class_bi.r.p[var5 + var40];
                           } while (Class_bi.r.o > ++var40);
                        }
                     }
                  }
               }

               if (Class_eb.d != 0) {
                  long var19 = (-Class_jb.N + Class_fh.T) / 50L;
                  Class_kf.s++;
                  Class_jb.N = Class_fh.T;
                  if (~var19 < -32768L) {
                     var19 = 32767L;
                  }

                  int var21;
                  int var26;
                  int var41;
                  label1099: {
                     var21 = Class_wb.i;
                     var26 = Class_vh.rb;
                     var41 = (int)var19;
                     if (var21 >= 0) {
                        if (var21 <= 65535) {
                           break label1099;
                        }

                        var21 = 65535;
                        if (var12 == 0) {
                           break label1099;
                        }
                     }

                     var21 = 0;
                  }

                  byte var31;
                  label1092: {
                     var31 = 0;
                     if (var26 >= 0) {
                        if (~var26 >= -65536) {
                           break label1092;
                        }

                        var26 = 65535;
                        if (var12 == 0) {
                           break label1092;
                        }
                     }

                     var26 = 0;
                  }

                  if (~Class_eb.d == -3) {
                     var31 = 1;
                  }

                  Class_cj.S.o(-53, 59);
                  Class_cj.S.a(false, var41 | var31 << 714360111);
                  Class_cj.S.a((byte)-116, var26 | var21 << 189839792);
               }

               if (Class_si.c > 0) {
                  Class_si.c--;
               }

               if (Class_wh.q[96] || Class_wh.q[97] || Class_wh.q[98] || Class_wh.q[99]) {
                  Class_rf.c = true;
               }

               if (Class_rf.c && ~Class_si.c >= -1) {
                  Class_f.Q++;
                  Class_si.c = 20;
                  Class_rf.c = false;
                  Class_cj.S.o(75, 99);
                  Class_cj.S.c((byte)19, Class_c.w);
                  Class_cj.S.h(Class_ba.z, -22);
               }

               if (Class_bj.g && !Class_ca.f) {
                  Class_ra.v++;
                  Class_ca.f = true;
                  Class_cj.S.o(120, 248);
                  Class_cj.S.b(32, 1);
               }

               if (!Class_bj.g && Class_ca.f) {
                  Class_ra.v++;
                  Class_ca.f = false;
                  Class_cj.S.o(110, 248);
                  Class_cj.S.b(32, 0);
               }

               if (!Class_si.g) {
                  Class_qd.A++;
                  Class_cj.S.o(114, 165);
                  Class_cj.S.k(-19237, Class_fd.a((byte)112));
                  Class_si.g = true;
               }

               Class_th.b(0);
               if (Class_ua.b == 30) {
                  Class_td.h(0);
                  Class_wj.a((byte)-110);
                  Class_qj.U++;
                  if (Class_qj.U > 750) {
                     Class_ak.b((byte)-21);
                  } else {
                     Class_gg.f(51);
                     Class_nf.f(16986);
                     Class_mc.a((byte)122);
                     if (Class_li.n != null) {
                        Class_ii.f((byte)-84);
                     }

                     int var20 = Class_bc.a(var0, -115);
                     if (var12 != 0 || var20 != -1) {
                        do {
                           Class_va.b((byte)67, var20);
                           Class_u.ab[Class_ui.a(Class_dc.r++, 31)] = var20;
                           var20 = Class_bc.a(false, -122);
                        } while (var20 != -1);
                     }

                     Class_ic var3 = Class_tj.c((byte)37);
                     if (var12 != 0) {
                        int var22 = var3.b(!var0);
                        int var27 = var3.d(-1597153401);
                        if (var22 != 1) {
                           if (var22 == 2) {
                              Class_sg.yb[var27] = var3.S;
                              Class_se.gb[Class_ui.a(31, Class_kg.x++)] = var27;
                              if (var12 != 0) {
                                 Class_sf.l[var27] = var3.L;
                                 Class_wb.e[Class_ui.a(31, Class_dj.E++)] = var27;
                                 var3 = Class_tj.c((byte)37);
                              } else {
                                 var3 = Class_tj.c((byte)37);
                              }
                           } else {
                              var3 = Class_tj.c((byte)37);
                           }
                        } else {
                           Class_sf.l[var27] = var3.L;
                           Class_wb.e[Class_ui.a(31, Class_dj.E++)] = var27;
                           var3 = Class_tj.c((byte)37);
                        }
                     }

                     while (var3 != null) {
                        int var23 = var3.b(!var0);
                        int var28 = var3.d(-1597153401);
                        if (var23 != 1) {
                           if (var23 == 2) {
                              Class_sg.yb[var28] = var3.S;
                              Class_se.gb[Class_ui.a(31, Class_kg.x++)] = var28;
                              if (var12 != 0) {
                                 Class_sf.l[var28] = var3.L;
                                 Class_wb.e[Class_ui.a(31, Class_dj.E++)] = var28;
                                 var3 = Class_tj.c((byte)37);
                              } else {
                                 var3 = Class_tj.c((byte)37);
                              }
                           } else {
                              var3 = Class_tj.c((byte)37);
                           }
                        } else {
                           Class_sf.l[var28] = var3.L;
                           Class_wb.e[Class_ui.a(31, Class_dj.E++)] = var28;
                           var3 = Class_tj.c((byte)37);
                        }
                     }

                     if (~client.cb != -1) {
                        Class_df.e += 20;
                        if (Class_df.e >= 400) {
                           client.cb = 0;
                        }
                     }

                     Class_sj.k++;
                     if (Class_qe.L != null) {
                        Class_og.U++;
                        if (~Class_og.U <= -16) {
                           Class_tg.a(Class_qe.L, -116);
                           Class_qe.L = null;
                        }
                     }

                     if (Class_ij.f != null) {
                        Class_tg.a(Class_ij.f, -116);
                        if (Class_jg.c - -5 < Class_pj.c || Class_jg.c + -5 > Class_pj.c || ~(Class_nf.x + 5) > ~Class_bh.k || ~Class_bh.k > ~(Class_nf.x - 5)) {
                           Class_oe.a = true;
                        }

                        Class_ea.Z++;
                        if (Class_mi.T == 0) {
                           label1251: {
                              if (!Class_oe.a || ~Class_ea.Z > -6) {
                                 if ((~Class_bi.e == -2 || Class_ra.a((byte)-125, -1 + Class_ma.ib)) && ~Class_ma.ib < -3) {
                                    Class_la.d((byte)-49);
                                    if (var12 == 0) {
                                       break label1251;
                                    }
                                 }

                                 if (~Class_ma.ib >= -1) {
                                    break label1251;
                                 }

                                 Class_wi.d((byte)46);
                                 if (var12 == 0) {
                                    break label1251;
                                 }
                              }

                              if (Class_ad.a == Class_ij.f && Class_bk.Q != Class_td.Q) {
                                 Class_kc.y++;
                                 Class_ha var24 = Class_ij.f;
                                 byte var29 = 0;
                                 if (~Class_si.a == -2 && var24.ab == 206) {
                                    var29 = 1;
                                 }

                                 if (var24.N[Class_td.Q] <= 0) {
                                    var29 = 0;
                                 }

                                 label1218: {
                                    if (Class_f.b(0, client.b(var24))) {
                                       int var32 = Class_bk.Q;
                                       int var42 = Class_td.Q;
                                       var24.N[var42] = var24.N[var32];
                                       var24.s[var42] = var24.s[var32];
                                       var24.N[var32] = -1;
                                       var24.s[var32] = 0;
                                       if (var12 == 0) {
                                          break label1218;
                                       }
                                    }

                                    if (~var29 != -2) {
                                       var24.a(Class_td.Q, 95, Class_bk.Q);
                                       if (var12 == 0) {
                                          break label1218;
                                       }
                                    }

                                    int var43 = Class_td.Q;
                                    int var33 = Class_bk.Q;
                                    if (var12 != 0 || ~var33 != ~var43) {
                                       do {
                                          if (var43 >= var33) {
                                             if (~var43 < ~var33) {
                                                var24.a(1 + var33, 49, var33);
                                                var33++;
                                                if (var12 != 0) {
                                                   var24.a(var33 + -1, 87, var33);
                                                   var33--;
                                                }
                                             }
                                          } else {
                                             var24.a(var33 + -1, 87, var33);
                                             var33--;
                                          }
                                       } while (~var33 != ~var43);
                                    }
                                 }

                                 Class_cj.S.o(-86, 167);
                                 Class_cj.S.c((byte)19, Class_td.Q);
                                 Class_cj.S.d(-772724656, var29);
                                 Class_cj.S.c((byte)19, Class_bk.Q);
                                 Class_cj.S.d((byte)127, Class_ij.f.K);
                              }
                           }

                           Class_og.U = 10;
                           Class_ij.f = null;
                           Class_eb.d = 0;
                        }
                     }

                     Class_wa.C = false;
                     Class_nf.J = false;
                     Class_ha var25 = Class_si.b;
                     Class_si.b = null;
                     Class_a.h = null;
                     Class_gk.i = 0;
                     Class_ha var30 = Class_vb.i;
                     Class_vb.i = null;
                     if (var12 != 0 || Class_v.a((byte)111) && ~Class_gk.i > -129) {
                        do {
                           Class_rd.Z[Class_gk.i] = Class_jg.e;
                           Class_hg.f[Class_gk.i] = Class_ta.I;
                           Class_gk.i++;
                        } while (Class_v.a((byte)111) && ~Class_gk.i > -129);
                     }

                     Class_li.n = null;
                     if (~Class_hj.bb != 0) {
                        Class_de.a(-88, Class_hj.bb, Class_l.u, 0, 0, 0, 0, Class_fk.R);
                     }

                     Class_qd.F++;

                     while (true) {
                        Class_wj var34 = (Class_wj)Class_ff.v.e(-107);
                        if (var34 == null) {
                           break;
                        }

                        Class_ha var44 = var34.z;
                        if (var44.hc >= 0) {
                           Class_ha var49 = Class_tf.a(var44.R, (byte)-80);
                           if (var49 == null || var49.n == null || ~var44.hc <= ~var49.n.length || var44 != var49.n[var44.hc] && var12 == 0) {
                              continue;
                           }
                        }

                        Class_j.a(var34, 16);
                        if (var12 != 0) {
                           break;
                        }
                     }

                     while (true) {
                        Class_wj var35 = (Class_wj)Class_dj.s.e(-95);
                        if (var35 == null) {
                           break;
                        }

                        Class_ha var45 = var35.z;
                        if (~var45.hc <= -1) {
                           Class_ha var50 = Class_tf.a(var45.R, (byte)-80);
                           if (var50 == null || var50.n == null || var45.hc >= var50.n.length || var50.n[var45.hc] != var45 && var12 == 0) {
                              continue;
                           }
                        }

                        Class_j.a(var35, 16);
                        if (var12 != 0) {
                           break;
                        }
                     }

                     while (true) {
                        Class_wj var36 = (Class_wj)Class_ti.q.e(80);
                        if (var36 == null) {
                           break;
                        }

                        Class_ha var46 = var36.z;
                        if (~var46.hc <= -1) {
                           Class_ha var51 = Class_tf.a(var46.R, (byte)-80);
                           if (var51 == null || var51.n == null || ~var46.hc <= ~var51.n.length || var46 != var51.n[var46.hc] && var12 == 0) {
                              continue;
                           }
                        }

                        Class_j.a(var36, 16);
                        if (var12 != 0) {
                           break;
                        }
                     }

                     if (Class_kg.s && Class_li.n == null) {
                        Class_kg.s = false;
                     }

                     if (Class_ff.e != null) {
                        Class_wg.a((byte)-113);
                     }

                     if (Class_ib.eb > 0 && Class_wh.q[82] && Class_wh.q[81] && Class_sa.U != 0) {
                        int var37;
                        label891: {
                           var37 = Class_jk.F + -Class_sa.U;
                           if (var37 < 0) {
                              var37 = 0;
                              if (var12 == 0) {
                                 break label891;
                              }
                           }

                           if (var37 > 3) {
                              var37 = 3;
                           }
                        }

                        Class_hh.a(Class_gg.B.v[0] + Class_fj.e, var37, Class_va.ab + Class_gg.B.qb[0], 24867);
                     }

                     if (Class_tf.W != -1) {
                        label1248: {
                           int var38 = Class_tf.W;
                           int var47 = Class_ng.q;
                           if (Class_ib.eb <= 0 || !Class_wh.q[82] || !Class_wh.q[81]) {
                              boolean var52 = Class_ce.a(0, 0, Class_gg.B.v[0], Class_gg.B.qb[0], 0, 0, var47, true, 0, -3, 0, var38);
                              if (!var52) {
                                 break label1248;
                              }

                              Class_df.e = 0;
                              Class_qd.x = Class_vh.rb;
                              client.cb = 1;
                              Class_ma.S = Class_wb.i;
                              if (var12 == 0) {
                                 break label1248;
                              }
                           }

                           Class_hh.a(Class_fj.e + var38, Class_jk.F, Class_va.ab + var47, 24867);
                        }

                        Class_tf.W = -1;
                     }

                     Class_hk.e(-2);
                     if (var25 != Class_si.b) {
                        if (var25 != null) {
                           Class_tg.a(var25, -114);
                        }

                        if (Class_si.b != null) {
                           Class_tg.a(Class_si.b, -116);
                        }
                     }

                     if (Class_vb.i != var30 && ~Class_jg.j == ~Class_pf.f) {
                        if (var30 != null) {
                           Class_tg.a(var30, -119);
                        }

                        if (Class_vb.i != null) {
                           Class_tg.a(Class_vb.i, -119);
                        }
                     }

                     label870: {
                        if (Class_vb.i != null) {
                           if (~Class_pf.f >= ~Class_jg.j) {
                              break label870;
                           }

                           Class_jg.j++;
                           if (Class_jg.j != Class_pf.f) {
                              break label870;
                           }

                           Class_tg.a(Class_vb.i, -113);
                           if (var12 == 0) {
                              break label870;
                           }
                        }

                        if (~Class_jg.j < -1) {
                           Class_jg.j--;
                        }
                     }

                     label854: {
                        if (Class_wh.c != 1) {
                           if (~Class_wh.c != -3) {
                              Class_mk.a(-1);
                              if (var12 == 0) {
                                 break label854;
                              }
                           }

                           Class_th.a(-128);
                           if (var12 == 0) {
                              break label854;
                           }
                        }

                        Class_w.d(2);
                     }

                     int var39 = 0;
                     if (var12 != 0) {
                        Class_j.T[var39]++;
                        var39++;
                     }

                     while (~var39 > -6) {
                        Class_j.T[var39]++;
                        var39++;
                     }

                     int var48 = Class_bf.a((byte)47);
                     int var53 = Class_la.i(7);
                     if (var48 > 4500 && var53 > 4500) {
                        Class_c.u = 250;
                        Class_od.a(4000, 0);
                        Class_bi.i++;
                        Class_cj.S.o(57, 47);
                     }

                     Class_qj.P++;
                     Class_ck.b++;
                     if (~Class_ck.b < -501) {
                        Class_ck.b = 0;
                        int var54 = (int)(Math.random() * 8.0);
                        if ((var54 & 2) == 2) {
                           Class_ic.I = Class_ic.I + Class_ih.Y;
                        }

                        if ((1 & var54) == 1) {
                           Class_be.v = Class_be.v + Class_vg.u;
                        }

                        if (~(4 & var54) == -5) {
                           Class_rg.T = Class_rg.T + Class_dd.ob;
                        }
                     }

                     if (~Class_qj.P < -501) {
                        Class_qj.P = 0;
                        int var55 = (int)(8.0 * Math.random());
                        if (~(var55 & 2) == -3) {
                           Class_uf.W = Class_uf.W + Class_b.P;
                        }

                        if ((1 & var55) == 1) {
                           Class_ok.eb = Class_ok.eb + Class_db.ib;
                        }
                     }

                     if (~Class_uf.W > 19) {
                        Class_b.P = 1;
                     }

                     if (~Class_rg.T > 39) {
                        Class_dd.ob = 1;
                     }

                     if (~Class_be.v > 49) {
                        Class_vg.u = 2;
                     }

                     if (~Class_uf.W < -11) {
                        Class_b.P = -1;
                     }

                     Class_fg.m++;
                     if (~Class_ok.eb > 59) {
                        Class_db.ib = 2;
                     }

                     if (~Class_be.v < -51) {
                        Class_vg.u = -2;
                     }

                     if (~Class_rg.T < -41) {
                        Class_dd.ob = -1;
                     }

                     if (~Class_ic.I > 54) {
                        Class_ih.Y = 2;
                     }

                     if (~Class_ok.eb < -61) {
                        Class_db.ib = -2;
                     }

                     if (~Class_ic.I < -56) {
                        Class_ih.Y = -2;
                     }

                     if (Class_fg.m > 50) {
                        Class_nb.f++;
                        Class_cj.S.o(-106, 115);
                     }

                     Class_sh.a(-14394);

                     try {
                        if (Class_wf.k != null && Class_cj.S.p > 0) {
                           Class_wf.k.a(0, (byte)81, Class_cj.S.p, Class_cj.S.E);
                           Class_fg.m = 0;
                           Class_cj.S.p = 0;
                        }
                     } catch (IOException var16) {
                        Class_ak.b((byte)-21);
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var18) {
         throw Class_sh.a(var18, "pa.M(" + var0 + ')');
      }
   }

   static final void a(int var0, byte var1, int var2, int var3, int var4) {
      try {
         if (Class_je.m < 100) {
            Class_ti.a(false);
         }

         j++;
         Class_nc.c(var4, var0, var3 + var4, var0 + var2);
         if (Class_je.m < 100) {
            byte var15 = 20;
            int var16 = var4 + var3 / 2;
            int var17 = -18 + var2 / 2 + var0 - var15;
            Class_nc.f(var4, var0, var3, var2, 0);
            Class_nc.a(var16 - 152, var17, 304, 34, 9179409);
            Class_nc.a(-151 + var16, 1 + var17, 302, 32, 0);
            Class_nc.f(var16 - 150, var17 - -2, 3 * Class_je.m, 30, 9179409);
            Class_nc.f(Class_je.m * 3 + -150 + var16, var17 - -2, 300 - Class_je.m * 3, 30, 0);
            Class_db.sb.c(Class_od.j, var16, var17 - -var15, 16777215, -1);
         } else {
            Class_kk.q = Class_oc.e + -((int)(var2 / Class_kc.A));
            Class_pg.w = (int)(var3 * 2 / Class_kc.A);
            Class_vc.S = (int)(var2 * 2 / Class_kc.A);
            Class_de.g = -((int)(var3 / Class_kc.A)) + Class_og.fb;
            if (var1 != 51) {
               a(false);
            }

            int var5 = -((int)(var3 / Class_kc.A)) + Class_og.fb;
            int var6 = Class_oc.e - (int)(var2 / Class_kc.A);
            int var8 = (int)(var2 / Class_kc.A) + Class_oc.e;
            int var7 = (int)(var3 / Class_kc.A) + Class_og.fb;
            Class_wj.a(var0, var6, var8, var4, var5, var3 + var4, 1391070128, var0 - -var2, var7);
            Class_ti.a(var5, var0, false, var2 + var0, var4 + var3, var8, var6, var7, var4);
            Class_ab.a(var8, var0, var2 + var0, var4, var6, var4 + var3, var7, var5, 73);
            if (Class_ve.T > 0) {
               Class_ve.T--;
            }

            if (Class_qd.r) {
               int var9 = var3 + var4 + -5;
               int var10 = -8 + var0 + var2;
               Class_fi.A.a(Class_o.a(2, new Class_r[]{Class_mc.a, Class_og.b(Class_fd.g, 0)}), var9, var10, 16776960, -1);
               var10 -= 15;
               Runtime var11 = Runtime.getRuntime();
               int var13 = 16776960;
               int var12 = (int)((var11.totalMemory() + -var11.freeMemory()) / 1024L);
               if (var12 > 65536) {
                  var13 = 16711680;
               }

               Class_fi.A.a(Class_o.a(2, new Class_r[]{Class_hd.c, Class_og.b(var12, 0), Class_th.e}), var9, var10, var13, -1);
               var10 -= 15;
            }
         }
      } catch (RuntimeException var14) {
         throw Class_sh.a(var14, "pa.I(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
      }
   }

   final void a(byte var1) {
      try {
         g++;
         this.n.b((byte)-11);
         if (var1 <= -94) {
            ;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "pa.N(" + var1 + ')');
      }
   }

   public final boolean a(byte var1, int var2) {
      try {
         if (var1 != 39) {
            this.a((byte)2, true);
         }

         z++;
         return this.E[var2];
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "pa.F(" + var1 + ',' + var2 + ')');
      }
   }

   public final int[] a(float var1, int var2, int var3) {
      try {
         if (var2 != 99) {
            return null;
         } else {
            d++;
            Class_fe var4 = this.c((byte)109, var3);
            if (var4 == null) {
               return null;
            } else {
               var4.ab = true;
               return var4.a((byte)-92, this.h, this, var1, this.t || this.a[var3]);
            }
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "pa.D(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   private final Class_fe c(byte var1, int var2) {
      try {
         int var3 = -67 / (-var1 / 47);
         G++;
         Class_fe var4 = (Class_fe)this.n.a((long)var2, (byte)-76);
         if (var4 != null) {
            return var4;
         } else {
            byte[] var5 = this.m.a(0, 0, var2);
            if (var5 == null) {
               return null;
            } else {
               Class_lh var6 = new Class_lh(var5);
               var4 = new Class_fe(var6);
               this.n.a(var2, (byte)105, var4);
               return var4;
            }
         }
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "pa.R(" + var1 + ',' + var2 + ')');
      }
   }

   static final int d(int var0, int var1) {
      try {
         if (var1 != 522) {
            return -35;
         } else {
            u++;
            return var0 & 127;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "pa.K(" + var0 + 44 + var1 + 41);
      }
   }

   public final int c(int var1, int var2) {
      try {
         int var3 = 103 / ((56 - var2) / 44);
         r++;
         return 65535 & this.F[var1];
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "pa.B(" + var1 + 44 + var2 + 41);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final void e(int var1, int var2) {
      int var4 = client.lb;

      try {
         Class_fe var3 = (Class_fe)this.n.c(var2);
         if (var4 == 0 && var3 == null) {
            x++;
         } else {
            do {
               if (var3.ab) {
                  var3.d(var1, -27276);
                  var3.ab = false;
               }

               var3 = (Class_fe)this.n.a(125);
            } while (var3 != null);

            x++;
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "pa.P(" + var1 + ',' + var2 + ')');
      }
   }

   static final int f(int var0, int var1) {
      try {
         var0--;
         f++;
         var0 |= var0 >>> 363406817;
         var0 |= var0 >>> 1563808354;
         var0 |= var0 >>> 225433060;
         if (var1 != -21189) {
            f(-80, 15);
         }

         var0 |= var0 >>> -132522520;
         var0 |= var0 >>> 1065595664;
         return 1 + var0;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "pa.Q(" + var0 + 44 + var1 + 41);
      }
   }

   final void a(byte var1, boolean var2) {
      try {
         if (var1 == -97) {
            this.t = var2;
            L++;
            this.a((byte)-117);
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "pa.L(" + var1 + ',' + var2 + ')');
      }
   }

   public static void a(int var0) {
      try {
         if (var0 == 6287) {
            s = null;
            y = null;
            i = null;
            B = null;
            o = null;
            C = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "pa.J(" + var0 + ')');
      }
   }

   public final boolean a(boolean var1, int var2) {
      try {
         Class_fe var3 = this.c((byte)-120, var2);
         l++;
         if (var3 == null) {
            return false;
         } else {
            if (!var1) {
               this.c((byte)35, -31);
            }

            return var3.a(this, -5947, this.h);
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "pa.E(" + var1 + ',' + var2 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   Class_pa(Class_cj var1, Class_cj var2, Class_cj var3, int var4, boolean var5) {
      super();
      int var18 = client.lb;
      this.A = 50;
      this.t = false;

      try {
         this.A = var4;
         this.m = var1;
         this.h = var3;
         this.t = var5;
         this.n = new Class_nj(this.A);
         Class_lh var6 = new Class_lh(var2.a(0, 0, 0));
         int var7 = var6.k(1355769544);
         this.H = new boolean[var7];
         this.v = new boolean[var7];
         this.K = new boolean[var7];
         this.M = new byte[var7];
         this.a = new boolean[var7];
         this.p = new byte[var7];
         this.F = new short[var7];
         this.E = new boolean[var7];
         this.w = new byte[var7];
         this.I = new byte[var7];
         int var8 = 0;
         if (var18 != 0 || var7 > var8) {
            do {
               this.v[var8] = ~var6.n(-6677) == -2;
            } while (var7 > ++var8);
         }

         int var9 = 0;
         if (var18 != 0) {
            if (this.v[var9]) {
               this.E[var9] = var6.n(-6677) == 1;
            }

            var9++;
         }

         for (; ~var7 < ~var9; var9++) {
            if (this.v[var9]) {
               this.E[var9] = var6.n(-6677) == 1;
            }
         }

         int var10 = 0;
         if (var18 != 0 || ~var10 > ~var7) {
            do {
               if (this.v[var10]) {
                  this.K[var10] = ~var6.n(-6677) == -2;
               }
            } while (~(++var10) > ~var7);
         }

         int var11 = 0;
         if (var18 != 0) {
            if (this.v[var11]) {
               this.a[var11] = ~var6.n(-6677) == -2;
            }

            var11++;
         }

         for (; var11 < var7; var11++) {
            if (this.v[var11]) {
               this.a[var11] = ~var6.n(-6677) == -2;
            }
         }

         int var12 = 0;
         if (var18 != 0 || ~var12 > ~var7) {
            do {
               if (this.v[var12]) {
                  this.H[var12] = ~var6.n(-6677) == -2;
               }
            } while (~(++var12) > ~var7);
         }

         int var13 = 0;
         if (var18 != 0) {
            if (this.v[var13]) {
               this.w[var13] = var6.o(3390);
            }

            var13++;
         }

         for (; var13 < var7; var13++) {
            if (this.v[var13]) {
               this.w[var13] = var6.o(3390);
            }
         }

         int var14 = 0;
         if (var18 != 0 || var14 < var7) {
            do {
               if (this.v[var14]) {
                  this.M[var14] = var6.o(3390);
               }
            } while (++var14 < var7);
         }

         int var15 = 0;
         if (var18 != 0) {
            if (this.v[var15]) {
               this.p[var15] = var6.o(3390);
            }

            var15++;
         }

         for (; ~var7 < ~var15; var15++) {
            if (this.v[var15]) {
               this.p[var15] = var6.o(3390);
            }
         }

         int var16 = 0;
         if (var18 != 0 || var7 > var16) {
            do {
               if (this.v[var16]) {
                  this.I[var16] = var6.o(3390);
               }
            } while (var7 > ++var16);
         }

         int var17 = 0;
         if (var18 != 0 || var7 > var17) {
            do {
               if (this.v[var17]) {
                  this.F[var17] = (short)var6.k(1355769544);
               }
            } while (var7 > ++var17);
         }
      } catch (RuntimeException var19) {
         throw Class_sh.a(
            var19,
            "pa.<init>("
               + (var1 != null ? "{...}" : "null")
               + ','
               + (var2 != null ? "{...}" : "null")
               + ','
               + (var3 != null ? "{...}" : "null")
               + ','
               + var4
               + ','
               + var5
               + ')'
         );
      }
   }
}
