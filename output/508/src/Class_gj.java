final class Class_gj extends Class_pe {
   static int I;
   static int J;
   static int K;
   static int L;
   static int M;
   static int N;
   private int[][] O;
   static int P;
   static int Q;
   int[] R;
   static int S;
   static Class_cj T;
   static int U;
   static int V;
   static Class_r W = Class_tc.a(43, "unzap");
   static int X;
   static int Y;
   private int[] Z;
   static int ab;
   static int bb;
   static int cb;
   private Class_r[] db;
   static Class_cj eb;

   final int a(int var1, int var2, int var3) {
      try {
         U++;
         if (this.Z != null && var1 >= 0 && var1 <= this.Z.length) {
            if (var2 != -20484) {
               a(-25, true, 33);
            }

            return this.O[var1] != null && var3 >= 0 && this.O[var1].length >= var3 ? this.O[var1][var3] : -1;
         } else {
            return -1;
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "gj.N(" + var1 + 44 + var2 + 44 + var3 + 41);
      }
   }

   final int c(byte var1) {
      try {
         if (var1 > -21) {
            this.R = null;
         }

         ab++;
         return this.Z == null ? 0 : this.Z.length;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "gj.D(" + var1 + 41);
      }
   }

   final void a(int var1, int[] var2, Class_lh var3) {
      try {
         V++;
         if (this.Z != null) {
            int var4 = 0;
            if (var1 <= -14) {
               for (; this.Z.length > var4; var4++) {
                  if (~var4 <= ~var2.length) {
                     return;
                  }

                  int var5 = Class_tb.a[this.a(var4, (byte)-66)];
                  if (var5 > 0) {
                     var3.a(var2[var4], -112, var5);
                  }
               }
            }
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "gj.E(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + (var3 != null ? "{...}" : "null") + ')');
      }
   }

   final int a(int var1, byte var2) {
      try {
         I++;
         if (var2 != -66) {
            this.Z = null;
         }

         return this.Z != null && var1 >= 0 && ~this.Z.length <= ~var1 ? this.Z[var1] : -1;
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "gj.J(" + var1 + 44 + var2 + 41);
      }
   }

   static final void a(byte var0, int var1) {
      try {
         M++;
         if (var1 >= 0) {
            int var3 = Class_vh.pb[var1];
            short var4 = Class_dd.I[var1];
            long var6 = Class_ih.bb[var1];
            if (~var4 <= -2001) {
               var4 -= 2000;
            }

            int var5 = (int)Class_ih.bb[var1];
            int var2 = Class_g.i[var1];
            if (~var4 == -21) {
               Class_fa var8 = Class_db.Q[var5];
               if (var8 != null) {
                  Class_rc.e++;
                  Class_ce.a(0, 0, Class_gg.B.v[0], Class_gg.B.qb[0], 1, 1, var8.qb[0], false, 0, -3, 2, var8.v[0]);
                  Class_ma.S = Class_wb.i;
                  Class_qd.x = Class_vh.rb;
                  client.cb = 2;
                  Class_df.e = 0;
                  Class_cj.S.o(78, 227);
                  Class_cj.S.c((byte)19, var5);
               }
            }

            if (var4 == 41) {
               Class_of.m++;
               Class_cj.S.o(-57, 203);
               Class_cj.S.c((byte)19, var2);
               Class_cj.S.g(544537784, var3);
               Class_cj.S.a(false, var5);
               Class_og.U = 0;
               Class_qe.L = Class_tf.a(var3, (byte)-80);
               Class_kh.d = var2;
            }

            if (var4 == 58) {
               Class_cj.S.o(87, 137);
               Class_ak.V++;
               Class_cj.S.a(false, var5);
               Class_cj.S.a((byte)-104, var3);
               Class_cj.S.b(var2, (byte)38);
               Class_og.U = 0;
               Class_qe.L = Class_tf.a(var3, (byte)-80);
               Class_kh.d = var2;
            }

            if (~var4 == -8) {
               Class_cj.S.o(-94, 152);
               Class_ua.m++;
               Class_cj.S.c((byte)19, var2);
               Class_cj.S.h(var5, -49);
               Class_cj.S.a((byte)-102, var3);
               Class_og.U = 0;
               Class_qe.L = Class_tf.a(var3, (byte)-80);
               Class_kh.d = var2;
            }

            if (~var4 == -1006) {
               Class_ma.S = Class_wb.i;
               Class_df.e = 0;
               Class_jj.d++;
               Class_qd.x = Class_vh.rb;
               client.cb = 2;
               Class_cj.S.o(-111, 84);
               Class_cj.S.h(var5, -37);
            }

            if (var4 == 35) {
               Class_ha.qb++;
               boolean var12 = Class_ce.a(0, 0, Class_gg.B.v[0], Class_gg.B.qb[0], 0, 0, var3, false, 0, -3, 2, var2);
               if (!var12) {
                  var12 = Class_ce.a(0, 0, Class_gg.B.v[0], Class_gg.B.qb[0], 1, 1, var3, false, 0, -3, 2, var2);
               }

               Class_df.e = 0;
               client.cb = 2;
               Class_qd.x = Class_vh.rb;
               Class_ma.S = Class_wb.i;
               Class_cj.S.o(54, 191);
               Class_cj.S.a(false, var2 - -Class_fj.e);
               Class_cj.S.a(false, var3 + Class_va.ab);
               Class_cj.S.h(var5, -58);
            }

            if (~var4 == -7) {
               Class_th.f++;
               Class_cj.S.o(-99, 136);
               Class_cj.S.a((byte)-126, var3);
               Class_cj.S.a(false, Class_uf.Y);
               Class_cj.S.c((byte)19, var2);
               Class_cj.S.k(-19237, Class_sh.k);
            }

            if (var4 == 1006) {
               Class_oc.i++;
               client.cb = 2;
               Class_ma.S = Class_wb.i;
               Class_df.e = 0;
               Class_qd.x = Class_vh.rb;
               Class_cj.S.o(-77, 38);
               Class_cj.S.c((byte)19, var5);
            }

            if (var4 == 29) {
               Class_eh var14 = Class_rf.a[var5];
               if (var14 != null) {
                  Class_ce.a(0, 0, Class_gg.B.v[0], Class_gg.B.qb[0], 1, 1, var14.qb[0], false, 0, -3, 2, var14.v[0]);
                  Class_ma.S = Class_wb.i;
                  Class_ha.Ab++;
                  Class_df.e = 0;
                  Class_qd.x = Class_vh.rb;
                  client.cb = 2;
                  Class_cj.S.o(85, 123);
                  Class_cj.S.a(false, var5);
               }
            }

            if (~var4 == -13) {
               Class_eh var15 = Class_rf.a[var5];
               if (var15 != null) {
                  Class_ce.a(0, 0, Class_gg.B.v[0], Class_gg.B.qb[0], 1, 1, var15.qb[0], false, 0, -3, 2, var15.v[0]);
                  Class_ma.S = Class_wb.i;
                  Class_df.e = 0;
                  client.cb = 2;
                  Class_qd.x = Class_vh.rb;
                  Class_cj.S.o(110, 7);
                  Class_cj.S.h(var5, -107);
                  Class_pa.c++;
               }
            }

            if (~var4 == -5) {
               Class_fa var16 = Class_db.Q[var5];
               if (var16 != null) {
                  Class_fc.A++;
                  Class_ce.a(0, 0, Class_gg.B.v[0], Class_gg.B.qb[0], 1, 1, var16.qb[0], false, 0, -3, 2, var16.v[0]);
                  Class_df.e = 0;
                  Class_qd.x = Class_vh.rb;
                  client.cb = 2;
                  Class_ma.S = Class_wb.i;
                  Class_cj.S.o(-105, 35);
                  Class_cj.S.c((byte)19, var5);
               }
            }

            if (var4 == 39) {
               Class_cj.S.o(-83, 40);
               Class_cj.S.b(var5, (byte)38);
               Class_oc.p++;
               Class_cj.S.h(Class_te.eb, -26);
               Class_cj.S.a((byte)-109, Class_hk.P);
               Class_cj.S.a((byte)-111, var3);
               Class_cj.S.h(var2, -85);
               Class_cj.S.h(Class_fa.Kb, -80);
               Class_og.U = 0;
               Class_qe.L = Class_tf.a(var3, (byte)-80);
               Class_kh.d = var2;
            }

            if (~var4 == -2 && Class_fg.a(var6, var3, -12974, var2)) {
               Class_sb.a++;
               Class_cj.S.o(-73, 224);
               Class_cj.S.b(var3 - -Class_va.ab, (byte)38);
               Class_cj.S.a(false, Class_te.eb);
               Class_cj.S.a((byte)-107, Class_hk.P);
               Class_cj.S.h(Class_fa.Kb, -80);
               Class_cj.S.h(2147483647 & (int)(var6 >>> 1244652192), -106);
               Class_cj.S.a(false, var2 - -Class_fj.e);
            }

            if (var4 == 2) {
               Class_fa var17 = Class_db.Q[var5];
               if (var17 != null) {
                  Class_ib.T++;
                  Class_ce.a(0, 0, Class_gg.B.v[0], Class_gg.B.qb[0], 1, 1, var17.qb[0], false, 0, -3, 2, var17.v[0]);
                  client.cb = 2;
                  Class_ma.S = Class_wb.i;
                  Class_df.e = 0;
                  Class_qd.x = Class_vh.rb;
                  Class_cj.S.o(-65, 131);
                  Class_cj.S.d((byte)127, Class_hk.P);
                  Class_cj.S.h(var5, -85);
                  Class_cj.S.b(Class_fa.Kb, (byte)38);
                  Class_cj.S.b(Class_te.eb, (byte)38);
               }
            }

            if (~var4 == -1003) {
               client.cb = 2;
               Class_qd.x = Class_vh.rb;
               Class_df.e = 0;
               Class_ma.S = Class_wb.i;
               Class_eh var18 = Class_rf.a[var5];
               if (var18 != null) {
                  Class_nd var9 = var18.Pb;
                  if (var9.z != null) {
                     var9 = var9.d(-94);
                  }

                  if (var9 != null) {
                     Class_cj.S.o(-119, 88);
                     Class_cj.S.a(false, var9.ab);
                     Class_wb.h++;
                  }
               }
            }

            if (~var4 == -32) {
               Class_cj.S.o(-54, 154);
               Class_cj.S.c((byte)19, var5);
               Class_ga.m++;
               Class_cj.S.b(Class_uf.Y, (byte)38);
               Class_cj.S.b(var2, (byte)38);
               Class_cj.S.d((byte)127, var3);
               Class_cj.S.d((byte)127, Class_sh.k);
               Class_og.U = 0;
               Class_qe.L = Class_tf.a(var3, (byte)-80);
               Class_kh.d = var2;
            }

            if (~var4 == -33) {
               Class_ha var38 = Class_lc.a(var3, false, var2);
               if (var38 != null) {
                  Class_bb.a((byte)96);
                  Class_rf.a((byte)-113, Class_fa.c(106, client.b(var38)), var2, var3);
                  Class_vh.cb = 0;
                  Class_aj.b = Class_ba.a(0, var38);
                  if (Class_aj.b == null) {
                     Class_aj.b = Class_ce.hb;
                  }

                  if (!var38.dc) {
                     Class_ab.U = Class_o.a(2, new Class_r[]{Class_he.i, var38.Mc, Class_li.f});
                     return;
                  }

                  Class_ab.U = Class_o.a(2, new Class_r[]{var38.Ec, Class_li.f});
               }
            } else {
               if (var4 == 8) {
                  boolean var19 = Class_ce.a(0, 0, Class_gg.B.v[0], Class_gg.B.qb[0], 0, 0, var3, false, 0, -3, 2, var2);
                  if (!var19) {
                     var19 = Class_ce.a(0, 0, Class_gg.B.v[0], Class_gg.B.qb[0], 1, 1, var3, false, 0, -3, 2, var2);
                  }

                  Class_qd.x = Class_vh.rb;
                  client.cb = 2;
                  Class_df.e = 0;
                  Class_ob.X++;
                  Class_ma.S = Class_wb.i;
                  Class_cj.S.o(-55, 9);
                  Class_cj.S.h(Class_te.eb, -41);
                  Class_cj.S.c((byte)19, var5);
                  Class_cj.S.k(-19237, Class_hk.P);
                  Class_cj.S.c((byte)19, var3 + Class_va.ab);
                  Class_cj.S.a(false, Class_fa.Kb);
                  Class_cj.S.b(var2 + Class_fj.e, (byte)38);
               }

               if (~var4 == -15) {
                  Class_kj.X++;
                  Class_cj.S.o(-121, 220);
                  Class_cj.S.d((byte)127, var3);
                  Class_cj.S.b(var5, (byte)38);
                  Class_cj.S.h(var2, -96);
                  Class_og.U = 0;
                  Class_qe.L = Class_tf.a(var3, (byte)-80);
                  Class_kh.d = var2;
               }

               if (~var4 == -17) {
                  Class_bb.a((byte)114);
                  Class_ha var37 = Class_tf.a(var3, (byte)-80);
                  Class_vh.cb = 1;
                  Class_te.eb = var5;
                  Class_hk.P = var3;
                  Class_fa.Kb = var2;
                  Class_tg.a(var37, -120);
                  Class_h.b = Class_o.a(2, new Class_r[]{Class_hj.U, Class_ra.a(-25672, var5).J, Class_li.f});
                  if (Class_h.b == null) {
                     Class_h.b = Class_td.U;
                  }
               } else {
                  if (~var4 == -10) {
                     Class_mc.j++;
                     boolean var21 = Class_ce.a(0, 0, Class_gg.B.v[0], Class_gg.B.qb[0], 0, 0, var3, false, 0, -3, 2, var2);
                     if (!var21) {
                        var21 = Class_ce.a(0, 0, Class_gg.B.v[0], Class_gg.B.qb[0], 1, 1, var3, false, 0, -3, 2, var2);
                     }

                     Class_df.e = 0;
                     Class_qd.x = Class_vh.rb;
                     client.cb = 2;
                     Class_ma.S = Class_wb.i;
                     Class_cj.S.o(80, 33);
                     Class_cj.S.c((byte)19, Class_va.ab + var3);
                     Class_cj.S.b(var5, (byte)38);
                     Class_cj.S.a(false, var2 - -Class_fj.e);
                  }

                  if (~var4 == -6) {
                     Class_j.d(Class_jk.F, var2, var3);
                  }

                  if (~var4 == -14) {
                     Class_vi.S++;
                     Class_cj.S.o(-119, 134);
                     Class_cj.S.a(false, var5);
                     Class_cj.S.c((byte)19, var2);
                     Class_cj.S.d((byte)127, var3);
                     Class_og.U = 0;
                     Class_qe.L = Class_tf.a(var3, (byte)-80);
                     Class_kh.d = var2;
                  }

                  if (var4 == 25) {
                     Class_fa var23 = Class_db.Q[var5];
                     if (var23 != null) {
                        Class_fi.t++;
                        Class_ce.a(0, 0, Class_gg.B.v[0], Class_gg.B.qb[0], 1, 1, var23.qb[0], false, 0, -3, 2, var23.v[0]);
                        Class_qd.x = Class_vh.rb;
                        Class_df.e = 0;
                        client.cb = 2;
                        Class_ma.S = Class_wb.i;
                        Class_cj.S.o(106, 68);
                        Class_cj.S.c((byte)19, var5);
                     }
                  }

                  if (~var4 == -4) {
                     Class_ud.g++;
                     boolean var24 = Class_ce.a(0, 0, Class_gg.B.v[0], Class_gg.B.qb[0], 0, 0, var3, false, 0, -3, 2, var2);
                     if (!var24) {
                        var24 = Class_ce.a(0, 0, Class_gg.B.v[0], Class_gg.B.qb[0], 1, 1, var3, false, 0, -3, 2, var2);
                     }

                     client.cb = 2;
                     Class_qd.x = Class_vh.rb;
                     Class_df.e = 0;
                     Class_ma.S = Class_wb.i;
                     Class_cj.S.o(-71, 39);
                     Class_cj.S.b(var5, (byte)38);
                     Class_cj.S.h(Class_fj.e + var2, -61);
                     Class_cj.S.b(Class_va.ab + var3, (byte)38);
                  }

                  if (var4 == 1001) {
                     label337: {
                        Class_ha var26 = Class_tf.a(var3, (byte)-80);
                        if (var26 != null && var26.s[var2] >= 100000) {
                           Class_he.a(Class_hk.S, 125, Class_o.a(2, new Class_r[]{Class_og.b(var26.s[var2], 0), Class_mh.T, Class_ra.a(-25672, var5).J}), 0);
                           if (client.lb == 0) {
                              break label337;
                           }
                        }

                        Class_cj.S.o(120, 38);
                        Class_cj.S.c((byte)19, var5);
                        Class_oc.i++;
                     }

                     Class_og.U = 0;
                     Class_qe.L = Class_tf.a(var3, (byte)-80);
                     Class_kh.d = var2;
                  }

                  if (var4 == 50) {
                     Class_fa var27 = Class_db.Q[var5];
                     if (var27 != null) {
                        Class_ce.a(0, 0, Class_gg.B.v[0], Class_gg.B.qb[0], 1, 1, var27.qb[0], false, 0, -3, 2, var27.v[0]);
                        Class_rh.h++;
                        client.cb = 2;
                        Class_qd.x = Class_vh.rb;
                        Class_df.e = 0;
                        Class_ma.S = Class_wb.i;
                        Class_cj.S.o(-104, 70);
                        Class_cj.S.a(false, Class_uf.Y);
                        Class_cj.S.b(var5, (byte)38);
                        Class_cj.S.g(544537784, Class_sh.k);
                     }
                  }

                  if (var4 == 1003) {
                     Class_tg.n++;
                     Class_fg.a(var6, var3, -12974, var2);
                     Class_cj.S.o(75, 190);
                     Class_cj.S.b(Class_va.ab + var3, (byte)38);
                     Class_cj.S.c((byte)19, var2 - -Class_fj.e);
                     Class_cj.S.c((byte)19, 2147483647 & (int)(var6 >>> -517571104));
                  }

                  if (~var4 == -23) {
                     Class_cj.S.o(-106, 211);
                     Class_o.X++;
                     Class_cj.S.d((byte)127, var3);
                     Class_cj.S.c((byte)19, var2);
                     Class_cj.S.a(false, var5);
                     Class_og.U = 0;
                     Class_qe.L = Class_tf.a(var3, (byte)-80);
                     Class_kh.d = var2;
                  }

                  if (var4 == 11) {
                     Class_eh var28 = Class_rf.a[var5];
                     if (var28 != null) {
                        Class_ce.a(0, 0, Class_gg.B.v[0], Class_gg.B.qb[0], 1, 1, var28.qb[0], false, 0, -3, 2, var28.v[0]);
                        Class_df.e = 0;
                        client.cb = 2;
                        Class_ma.S = Class_wb.i;
                        Class_lg.k++;
                        Class_qd.x = Class_vh.rb;
                        Class_cj.S.o(-66, 221);
                        Class_cj.S.c((byte)19, var5);
                     }
                  }

                  if (var4 == 30) {
                     Class_lg.i++;
                     boolean var29 = Class_ce.a(0, 0, Class_gg.B.v[0], Class_gg.B.qb[0], 0, 0, var3, false, 0, -3, 2, var2);
                     if (!var29) {
                        var29 = Class_ce.a(0, 0, Class_gg.B.v[0], Class_gg.B.qb[0], 1, 1, var3, false, 0, -3, 2, var2);
                     }

                     Class_qd.x = Class_vh.rb;
                     Class_df.e = 0;
                     client.cb = 2;
                     Class_ma.S = Class_wb.i;
                     Class_cj.S.o(69, 201);
                     Class_cj.S.h(Class_va.ab + var3, -111);
                     Class_cj.S.a(false, Class_fj.e + var2);
                     Class_cj.S.c((byte)19, var5);
                  }

                  if (var4 == 36) {
                     Class_cj.S.o(-72, 113);
                     Class_cj.S.g(544537784, var3);
                     Class_ua.f++;
                     Class_ha var31 = Class_tf.a(var3, (byte)-80);
                     if (var31.Wc != null && var31.Wc[0][0] == 5) {
                        int var39 = var31.Wc[0][1];
                        Class_sb.i[var39] = -Class_sb.i[var39] + 1;
                        Class_va.b((byte)67, var39);
                     }
                  }

                  if (~var4 == -45) {
                     Class_eh var32 = Class_rf.a[var5];
                     if (var32 != null) {
                        Class_ce.a(0, 0, Class_gg.B.v[0], Class_gg.B.qb[0], 1, 1, var32.qb[0], false, 0, -3, 2, var32.v[0]);
                        client.cb = 2;
                        Class_c.j++;
                        Class_ma.S = Class_wb.i;
                        Class_df.e = 0;
                        Class_qd.x = Class_vh.rb;
                        Class_cj.S.o(-118, 24);
                        Class_cj.S.h(var5, -25);
                        Class_cj.S.a((byte)-87, Class_sh.k);
                        Class_cj.S.h(Class_uf.Y, -51);
                     }
                  }

                  if (var4 == 24) {
                     Class_fa var33 = Class_db.Q[var5];
                     if (var33 != null) {
                        Class_rg.ab++;
                        Class_ce.a(0, 0, Class_gg.B.v[0], Class_gg.B.qb[0], 1, 1, var33.qb[0], false, 0, -3, 2, var33.v[0]);
                        client.cb = 2;
                        Class_ma.S = Class_wb.i;
                        Class_df.e = 0;
                        Class_qd.x = Class_vh.rb;
                        Class_cj.S.o(-79, 160);
                        Class_cj.S.b(var5, (byte)38);
                     }
                  }

                  if (~var4 == -18) {
                     Class_qj.M++;
                     Class_cj.S.o(-119, 3);
                     Class_cj.S.k(-19237, var3);
                     Class_cj.S.b(var5, (byte)38);
                     Class_cj.S.b(var2, (byte)38);
                     Class_og.U = 0;
                     Class_qe.L = Class_tf.a(var3, (byte)-80);
                     Class_kh.d = var2;
                  }

                  if (var4 == 10) {
                     Class_ch.a(636);
                  }

                  if (var4 == 34) {
                     boolean var34 = Class_ce.a(0, 0, Class_gg.B.v[0], Class_gg.B.qb[0], 0, 0, var3, false, 0, -3, 2, var2);
                     Class_ja.t++;
                     if (!var34) {
                        var34 = Class_ce.a(0, 0, Class_gg.B.v[0], Class_gg.B.qb[0], 1, 1, var3, false, 0, -3, 2, var2);
                     }

                     Class_qd.x = Class_vh.rb;
                     Class_df.e = 0;
                     Class_ma.S = Class_wb.i;
                     client.cb = 2;
                     Class_cj.S.o(-105, 81);
                     Class_cj.S.h(var2 - -Class_fj.e, -119);
                     Class_cj.S.g(544537784, Class_sh.k);
                     Class_cj.S.a(false, Class_va.ab + var3);
                     Class_cj.S.h(var5, -23);
                     Class_cj.S.b(Class_uf.Y, (byte)38);
                  }

                  if (~var4 == -47) {
                     Class_fg.a(var6, var3, -12974, var2);
                     Class_cj.S.o(101, 46);
                     Class_cj.S.c((byte)19, Class_va.ab + var3);
                     Class_cj.S.c((byte)19, Class_fj.e + var2);
                     Class_vg.S++;
                     Class_cj.S.h((int)(var6 >>> 415014368) & 2147483647, -55);
                  }

                  int var36 = -68 % ((var0 - -6) / 56);
                  if (~var4 == -29) {
                     Class_ua.f++;
                     Class_cj.S.o(-72, 113);
                     Class_cj.S.g(544537784, var3);
                     Class_ha var40 = Class_tf.a(var3, (byte)-80);
                     if (var40.Wc != null && ~var40.Wc[0][0] == -6) {
                        int var10 = var40.Wc[0][1];
                        if (~var40.J[0] != ~Class_sb.i[var10]) {
                           Class_sb.i[var10] = var40.J[0];
                           Class_va.b((byte)67, var10);
                        }
                     }
                  }

                  if (var4 == 37 && Class_fg.a(var6, var3, -12974, var2)) {
                     Class_f.V++;
                     Class_cj.S.o(-98, 114);
                     Class_cj.S.b(Class_va.ab + var3, (byte)38);
                     Class_cj.S.h((int)(var6 >>> -254697952) & 2147483647, -80);
                     Class_cj.S.h(var2 - -Class_fj.e, -93);
                     Class_cj.S.k(-19237, Class_sh.k);
                     Class_cj.S.b(Class_uf.Y, (byte)38);
                  }

                  if (~var4 == -52 || var4 == 1007) {
                     Class_ca.a(var3, (byte)78, var5, Class_fb.h[var1], var2);
                  }

                  if (~var4 == -39) {
                     Class_sc.k++;
                     Class_cj.S.o(65, 185);
                     Class_cj.S.k(-19237, var3);
                     Class_cj.S.a(false, var2);
                     Class_cj.S.c((byte)19, var5);
                     Class_og.U = 0;
                     Class_qe.L = Class_tf.a(var3, (byte)-80);
                     Class_kh.d = var2;
                  }

                  if (var4 == 42) {
                     Class_pg.A++;
                     Class_fg.a(var6, var3, -12974, var2);
                     Class_cj.S.o(-51, 94);
                     Class_cj.S.h(Class_fj.e + var2, -30);
                     Class_cj.S.b(2147483647 & (int)(var6 >>> -633461408), (byte)38);
                     Class_cj.S.c((byte)19, var3 - -Class_va.ab);
                  }

                  if (var4 == 47) {
                     Class_ch.n++;
                     Class_fg.a(var6, var3, -12974, var2);
                     Class_cj.S.o(112, 228);
                     Class_cj.S.h(Class_va.ab + var3, -28);
                     Class_cj.S.b(2147483647 & (int)(var6 >>> -929600736), (byte)38);
                     Class_cj.S.c((byte)19, var2 + Class_fj.e);
                  }

                  if (var4 == 26) {
                     Class_fa var41 = Class_db.Q[var5];
                     if (var41 != null) {
                        Class_tf.U++;
                        Class_ce.a(0, 0, Class_gg.B.v[0], Class_gg.B.qb[0], 1, 1, var41.qb[0], false, 0, -3, 2, var41.v[0]);
                        Class_df.e = 0;
                        Class_ma.S = Class_wb.i;
                        client.cb = 2;
                        Class_qd.x = Class_vh.rb;
                        Class_cj.S.o(118, 93);
                        Class_cj.S.c((byte)19, var5);
                     }
                  }

                  if (var4 == 49) {
                     Class_fa var42 = Class_db.Q[var5];
                     if (var42 != null) {
                        Class_ce.a(0, 0, Class_gg.B.v[0], Class_gg.B.qb[0], 1, 1, var42.qb[0], false, 0, -3, 2, var42.v[0]);
                        Class_hk.B++;
                        Class_ma.S = Class_wb.i;
                        client.cb = 2;
                        Class_qd.x = Class_vh.rb;
                        Class_df.e = 0;
                        Class_cj.S.o(117, 37);
                        Class_cj.S.a(false, var5);
                     }
                  }

                  if (~var4 == -44) {
                     Class_cj.S.o(103, 45);
                     Class_cj.S.a(false, var5);
                     Class_dj.B++;
                     Class_cj.S.b(var2, (byte)38);
                     Class_cj.S.g(544537784, var3);
                     Class_og.U = 0;
                     Class_qe.L = Class_tf.a(var3, (byte)-80);
                     Class_kh.d = var2;
                  }

                  if (var4 == 33) {
                     Class_fa var43 = Class_db.Q[var5];
                     if (var43 != null) {
                        Class_ce.a(0, 0, Class_gg.B.v[0], Class_gg.B.qb[0], 1, 1, var43.qb[0], false, 0, -3, 2, var43.v[0]);
                        client.cb = 2;
                        Class_qd.x = Class_vh.rb;
                        Class_tc.a++;
                        Class_df.e = 0;
                        Class_ma.S = Class_wb.i;
                        Class_cj.S.o(-114, 253);
                        Class_cj.S.c((byte)19, var5);
                     }
                  }

                  if (~var4 == -16) {
                     Class_eh var44 = Class_rf.a[var5];
                     if (var44 != null) {
                        Class_ce.a(0, 0, Class_gg.B.v[0], Class_gg.B.qb[0], 1, 1, var44.qb[0], false, 0, -3, 2, var44.v[0]);
                        Class_rc.a++;
                        client.cb = 2;
                        Class_ma.S = Class_wb.i;
                        Class_qd.x = Class_vh.rb;
                        Class_df.e = 0;
                        Class_cj.S.o(63, 12);
                        Class_cj.S.d((byte)127, Class_hk.P);
                        Class_cj.S.a(false, var5);
                        Class_cj.S.c((byte)19, Class_fa.Kb);
                        Class_cj.S.h(Class_te.eb, -124);
                     }
                  }

                  if (var4 == 45) {
                     Class_lf.B++;
                     boolean var45 = Class_ce.a(0, 0, Class_gg.B.v[0], Class_gg.B.qb[0], 0, 0, var3, false, 0, -3, 2, var2);
                     if (!var45) {
                        var45 = Class_ce.a(0, 0, Class_gg.B.v[0], Class_gg.B.qb[0], 1, 1, var3, false, 0, -3, 2, var2);
                     }

                     Class_df.e = 0;
                     Class_qd.x = Class_vh.rb;
                     client.cb = 2;
                     Class_ma.S = Class_wb.i;
                     Class_cj.S.o(65, 150);
                     Class_cj.S.b(var3 + Class_va.ab, (byte)38);
                     Class_cj.S.h(var5, -66);
                     Class_cj.S.a(false, var2 + Class_fj.e);
                  }

                  if (var4 == 48) {
                     Class_eh var47 = Class_rf.a[var5];
                     if (var47 != null) {
                        Class_th.j++;
                        Class_ce.a(0, 0, Class_gg.B.v[0], Class_gg.B.qb[0], 1, 1, var47.qb[0], false, 0, -3, 2, var47.v[0]);
                        Class_df.e = 0;
                        Class_qd.x = Class_vh.rb;
                        client.cb = 2;
                        Class_ma.S = Class_wb.i;
                        Class_cj.S.o(-116, 52);
                        Class_cj.S.c((byte)19, var5);
                     }
                  }

                  if (var4 == 19) {
                     Class_fa var48 = Class_db.Q[var5];
                     if (var48 != null) {
                        Class_ce.a(0, 0, Class_gg.B.v[0], Class_gg.B.qb[0], 1, 1, var48.qb[0], false, 0, -3, 2, var48.v[0]);
                        client.cb = 2;
                        Class_df.e = 0;
                        Class_nj.m++;
                        Class_ma.S = Class_wb.i;
                        Class_qd.x = Class_vh.rb;
                        Class_cj.S.o(83, 183);
                        Class_cj.S.b(var5, (byte)38);
                     }
                  }

                  if (~var4 == -24) {
                     Class_ha var49 = Class_tf.a(var3, (byte)-80);
                     boolean var51 = true;
                     if (~var49.ab < -1) {
                        var51 = Class_ij.a(var49, 29905);
                     }

                     if (var51) {
                        Class_ua.f++;
                        Class_cj.S.o(-82, 113);
                        Class_cj.S.g(544537784, var3);
                     }
                  }

                  if (var4 == 21) {
                     Class_eh var50 = Class_rf.a[var5];
                     if (var50 != null) {
                        Class_ce.a(0, 0, Class_gg.B.v[0], Class_gg.B.qb[0], 1, 1, var50.qb[0], false, 0, -3, 2, var50.v[0]);
                        Class_df.e = 0;
                        Class_qd.x = Class_vh.rb;
                        Class_cd.S++;
                        client.cb = 2;
                        Class_ma.S = Class_wb.i;
                        Class_cj.S.o(73, 199);
                        Class_cj.S.b(var5, (byte)38);
                     }
                  }

                  if (~var4 == -19) {
                     Class_ma.Q++;
                     Class_fg.a(var6, var3, -12974, var2);
                     Class_cj.S.o(91, 158);
                     Class_cj.S.b(Class_fj.e + var2, (byte)38);
                     Class_cj.S.a(false, 2147483647 & (int)(var6 >>> -1689064352));
                     Class_cj.S.c((byte)19, Class_va.ab + var3);
                  }

                  if (~var4 == -58 && Class_eb.f == null) {
                     Class_wi.d(var2, var3, 327685);
                     Class_eb.f = Class_lc.a(var3, false, var2);
                     Class_tg.a(Class_eb.f, -120);
                  }

                  if (~var4 == -41) {
                     Class_cj.S.o(-53, 186);
                     Class_qd.z++;
                     Class_cj.S.d((byte)127, var3);
                     Class_cj.S.h(var5, -122);
                     Class_cj.S.c((byte)19, var2);
                     Class_og.U = 0;
                     Class_qe.L = Class_tf.a(var3, (byte)-80);
                     Class_kh.d = var2;
                  }

                  if (~Class_vh.cb != -1) {
                     Class_vh.cb = 0;
                     Class_tg.a(Class_tf.a(Class_hk.P, (byte)-80), -114);
                  }

                  if (Class_sg.tb) {
                     Class_bb.a((byte)77);
                  }

                  if (Class_qe.L != null && ~Class_og.U == -1) {
                     Class_tg.a(Class_qe.L, -128);
                  }
               }
            }
         }
      } catch (RuntimeException var11) {
         throw Class_sh.a(var11, "gj.L(" + var0 + ',' + var1 + ')');
      }
   }

   final void a(byte var1, Class_lh var2) {
      try {
         K++;
         if (var1 != 45) {
            this.a(-45, -100, 114);
         }

         while (true) {
            int var3 = var2.n(-6677);
            if (var3 == 0) {
               return;
            }

            this.a(var2, var3, var1 ^ 14090);
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "gj.O(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
      }
   }

   private final void a(Class_lh var1, int var2, int var3) {
      try {
         P++;
         if (var3 != 14119) {
            this.O = null;
         }

         if (var2 == 1) {
            this.db = var1.e(var3 ^ 14168).e(0, 60);
         } else {
            if (~var2 != -3) {
               if (~var2 == -4) {
                  int var4 = var1.n(-6677);
                  this.Z = new int[var4];
                  this.O = new int[var4][];

                  for (int var5 = 0; var4 > var5; var5++) {
                     int var6 = var1.k(1355769544);
                     this.Z[var5] = var6;
                     this.O[var5] = new int[Class_vh.W[var6]];

                     for (int var7 = 0; Class_vh.W[var6] > var7; var7++) {
                        this.O[var5][var7] = var1.k(1355769544);
                     }
                  }

                  return;
               }
            } else {
               int var9 = var1.n(-6677);
               this.R = new int[var9];

               for (int var10 = 0; ~var10 > ~var9; var10++) {
                  this.R[var10] = var1.k(1355769544);
               }
            }
         }
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "gj.K(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   static final void c(int var0, int var1) {
      try {
         Q++;
         if (var0 == 0) {
            Class_rg.W.b(var0 ^ -18767, var1);
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "gj.M(" + var0 + ',' + var1 + ')');
      }
   }

   static final void d(int var0) {
      try {
         bb++;
         if (var0 != 0) {
            a();
         }

         Class_pb.g.a(-28);
         Class_bf.f.a(122);
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "gj.B(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final Class_r e(int var1) {
      int var5 = client.lb;

      try {
         cb++;
         Class_r var2 = Class_cj.b(-18982, 80);
         if (this.db == null) {
            return Class_v.p;
         } else {
            int var3 = 58 % ((-6 - var1) / 43);
            var2.b(this.db[0], 12147);
            int var4 = 1;
            if (var5 == 0 && var4 >= this.db.length) {
               return var2.b(true);
            } else {
               do {
                  var2.b(Class_lg.a, 12147);
                  var2.b(this.db[var4], 12147);
               } while (++var4 < this.db.length);

               return var2.b(true);
            }
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "gj.Q(" + var1 + ')');
      }
   }

   static final Class_r a(int var0, boolean var1, int var2) {
      try {
         L++;
         int var3 = -var0 + var2;
         if (var3 < -9) {
            return Class_tj.t;
         } else if (~var3 > 5) {
            return Class_ng.p;
         } else if (!var1) {
            return null;
         } else if (~var3 > 2) {
            return Class_kj.V;
         } else if (~var3 > -1) {
            return Class_ng.f;
         } else if (var3 > 9) {
            return Class_he.i;
         } else if (var3 > 6) {
            return Class_wh.j;
         } else if (~var3 < -4) {
            return Class_qb.i;
         } else {
            return ~var3 < -1 ? Class_sb.k : Class_cc.Ob;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "gj.C(" + var0 + ',' + var1 + ',' + var2 + ')');
      }
   }

   final void d(byte var1) {
      try {
         X++;
         if (this.R != null) {
            for (int var2 = 0; var2 < this.R.length; var2++) {
               this.R[var2] = Class_mb.a(this.R[var2], 32768);
            }
         }

         if (var1 != 38) {
            this.a(120, -71, -4);
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "gj.A(" + var1 + ')');
      }
   }

   static final void d(int var0, int var1) {
      try {
         J++;
         Class_bc.T.b(-18767, var1);
         if (var0 != 190) {
            eb = null;
         }

         Class_rj.x.b(-18767, var1);
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "gj.H(" + var0 + ',' + var1 + ')');
      }
   }

   public static void f(int var0) {
      try {
         eb = null;
         W = null;
         if (var0 != 1) {
            eb = null;
         }

         T = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "gj.I(" + var0 + ')');
      }
   }

   final Class_r a(int var1, Class_lh var2) {
      try {
         N++;
         int var4 = -92 / ((33 - var1) / 34);
         Class_r var3 = Class_cj.b(-18982, 80);
         if (this.Z != null) {
            for (int var5 = 0; ~this.Z.length < ~var5; var5++) {
               var3.b(this.db[var5], 12147);
               var3.b(Class_jc.a(this.O[var5], var2.a(Class_ja.A[this.Z[var5]], (byte)-41), -1, this.Z[var5]), 12147);
            }
         }

         var3.b(this.db[-1 + this.db.length], 12147);
         return var3.b(true);
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "gj.F(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
      }
   }

   static final int e(int var0, int var1) {
      try {
         if (var1 != 654593194) {
            T = null;
         }

         Y++;
         return var0 >>> 654593194;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "gj.P(" + var0 + 44 + var1 + 41);
      }
   }

   static final void a() {
      Class_vc.w = 0;

      label190:
      for (int var0 = 0; var0 < Class_ij.b; var0++) {
         Class_ba var1 = Class_vb.c[var0];
         if (Class_hj.X != null) {
            for (int var2 = 0; var2 < Class_hj.X.length; var2++) {
               if (Class_hj.X[var2] != -1000000
                  && (var1.o <= Class_hj.X[var2] || var1.m <= Class_hj.X[var2])
                  && (var1.v <= Class_uc.k[var2] || var1.y <= Class_uc.k[var2])
                  && (var1.v >= Class_qd.u[var2] || var1.y >= Class_qd.u[var2])
                  && (var1.k <= Class_md.x[var2] || var1.j <= Class_md.x[var2])
                  && (var1.k >= Class_ig.f[var2] || var1.j >= Class_ig.f[var2])) {
                  continue label190;
               }
            }
         }

         if (var1.e == 1) {
            int var12 = var1.i - Class_jb.ab + Class_rd.Y;
            if (var12 >= 0 && var12 <= Class_rd.Y + Class_rd.Y) {
               int var14 = var1.h - Class_vg.x + Class_rd.Y;
               if (var14 < 0) {
                  var14 = 0;
               }

               int var16 = var1.s - Class_vg.x + Class_rd.Y;
               if (var16 > Class_rd.Y + Class_rd.Y) {
                  var16 = Class_rd.Y + Class_rd.Y;
               }

               boolean var18 = false;

               while (var14 <= var16) {
                  if (Class_kc.v[var12][var14++]) {
                     var18 = true;
                     break;
                  }
               }

               if (var18) {
                  int var20 = Class_de.i - var1.v;
                  if (var20 > 32) {
                     var1.d = 1;
                  } else {
                     if (var20 >= -32) {
                        continue;
                     }

                     var1.d = 2;
                     var20 = -var20;
                  }

                  var1.a = (var1.k - Class_mi.W << 8) / var20;
                  var1.t = (var1.j - Class_mi.W << 8) / var20;
                  var1.p = (var1.o - Class_n.q << 8) / var20;
                  var1.f = (var1.m - Class_n.q << 8) / var20;
                  Class_v.t[Class_vc.w++] = var1;
               }
            }
         } else if (var1.e == 2) {
            int var11 = var1.h - Class_vg.x + Class_rd.Y;
            if (var11 >= 0 && var11 <= Class_rd.Y + Class_rd.Y) {
               int var13 = var1.i - Class_jb.ab + Class_rd.Y;
               if (var13 < 0) {
                  var13 = 0;
               }

               int var15 = var1.l - Class_jb.ab + Class_rd.Y;
               if (var15 > Class_rd.Y + Class_rd.Y) {
                  var15 = Class_rd.Y + Class_rd.Y;
               }

               boolean var17 = false;

               while (var13 <= var15) {
                  if (Class_kc.v[var13++][var11]) {
                     var17 = true;
                     break;
                  }
               }

               if (var17) {
                  int var19 = Class_mi.W - var1.k;
                  if (var19 > 32) {
                     var1.d = 3;
                  } else {
                     if (var19 >= -32) {
                        continue;
                     }

                     var1.d = 4;
                     var19 = -var19;
                  }

                  var1.b = (var1.v - Class_de.i << 8) / var19;
                  var1.g = (var1.y - Class_de.i << 8) / var19;
                  var1.p = (var1.o - Class_n.q << 8) / var19;
                  var1.f = (var1.m - Class_n.q << 8) / var19;
                  Class_v.t[Class_vc.w++] = var1;
               }
            }
         } else if (var1.e == 4) {
            int var10 = var1.o - Class_n.q;
            if (var10 > 128) {
               int var3 = var1.h - Class_vg.x + Class_rd.Y;
               if (var3 < 0) {
                  var3 = 0;
               }

               int var4 = var1.s - Class_vg.x + Class_rd.Y;
               if (var4 > Class_rd.Y + Class_rd.Y) {
                  var4 = Class_rd.Y + Class_rd.Y;
               }

               if (var3 <= var4) {
                  int var5 = var1.i - Class_jb.ab + Class_rd.Y;
                  if (var5 < 0) {
                     var5 = 0;
                  }

                  int var6 = var1.l - Class_jb.ab + Class_rd.Y;
                  if (var6 > Class_rd.Y + Class_rd.Y) {
                     var6 = Class_rd.Y + Class_rd.Y;
                  }

                  boolean var7 = false;

                  label159:
                  for (int var8 = var5; var8 <= var6; var8++) {
                     for (int var9 = var3; var9 <= var4; var9++) {
                        if (Class_kc.v[var8][var9]) {
                           var7 = true;
                           break label159;
                        }
                     }
                  }

                  if (var7) {
                     var1.d = 5;
                     var1.b = (var1.v - Class_de.i << 8) / var10;
                     var1.g = (var1.y - Class_de.i << 8) / var10;
                     var1.a = (var1.k - Class_mi.W << 8) / var10;
                     var1.t = (var1.j - Class_mi.W << 8) / var10;
                     Class_v.t[Class_vc.w++] = var1;
                  }
               }
            }
         }
      }
   }

   public Class_gj() {
   }
}
