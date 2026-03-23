final class Class_vb {
   static Class_qc a = new Class_qc(32);
   static int b;
   static Class_ba[] c = new Class_ba[500];
   static int d;
   static int[] e;
   static int f;
   static int g;
   static int h;
   static Class_ha i;
   static boolean[] j = new boolean[100];
   static int[] k = new int[5];

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var11 = client.lb;

      try {
         d++;
         if (var4 > -15) {
            a = null;
         }

         int var6 = Class_tf.a(var0, Class_hh.h, (byte)114, Class_ff.d);
         int var7 = Class_tf.a(var1, Class_hh.h, (byte)114, Class_ff.d);
         int var8 = Class_tf.a(var3, Class_tg.r, (byte)114, Class_ga.v);
         int var9 = Class_tf.a(var2, Class_tg.r, (byte)114, Class_ga.v);
         int var10 = var6;
         if (var11 != 0 || var7 >= var6) {
            do {
               Class_fd.a(var8, (byte)-17, var5, Class_qd.p[var10], var9);
            } while (var7 >= ++var10);
         }
      } catch (RuntimeException var12) {
         throw Class_sh.a(var12, "vb.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
      }
   }

   static final void a(int var0, byte var1) {
      try {
         if (Class_pe.F == null) {
            Class_pe.F = new byte[4][104][104];
         }

         if (var0 <= 90) {
            h = -104;
         }

         b++;

         for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
               for (int var4 = 0; ~var4 > -105; var4++) {
                  Class_pe.F[var2][var3][var4] = var1;
               }
            }
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "vb.B(" + var0 + ',' + var1 + ')');
      }
   }

   public static void a(int var0) {
      try {
         i = null;
         c = null;
         if (var0 == 1) {
            a = null;
            e = null;
            k = null;
            j = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "vb.A(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final Class_ni[] a(boolean var0) {
      int var7 = client.lb;

      try {
         if (!var0) {
            return null;
         } else {
            f++;
            Class_ni[] var1 = new Class_ni[Class_lh.zb];
            int var2 = 0;
            if (var7 == 0 && ~Class_lh.zb >= ~var2) {
               Class_oe.a((byte)-93);
               return var1;
            } else {
               do {
                  byte[] var4 = Class_lj.h[var2];
                  int var3 = Class_ld.ib[var2] * Class_ia.bb[var2];
                  int[] var5 = new int[var3];
                  int var6 = 0;
                  if (var7 != 0 || ~var6 > ~var3) {
                     do {
                        var5[var6] = Class_ji.Y[Class_ui.a(var4[var6], 255)];
                     } while (~(++var6) > ~var3);
                  }

                  var1[var2] = new Class_ni(Class_qb.b, Class_tf.bb, Class_ae.g[var2], Class_ub.L[var2], Class_ia.bb[var2], Class_ld.ib[var2], var5);
               } while (~Class_lh.zb < ~(++var2));

               Class_oe.a((byte)-93);
               return var1;
            }
         }
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "vb.D(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, Class_ha var1, boolean var2, int var3) {
      int var13 = client.lb;

      try {
         if (!var2) {
            a(true);
         }

         g++;
         if (~var1.A == -2) {
            Class_be.a(0, var1.K, (byte)-56, Class_hk.S, (short)23, var1.qc, 0L);
            Class_qd.E++;
         }

         if (~var1.A == -3 && !Class_sg.tb) {
            Class_r var4 = Class_ba.a(0, var1);
            if (var4 != null) {
               Class_be.a(-1, var1.K, (byte)-125, Class_o.a(2, new Class_r[]{Class_he.i, var1.Mc}), (short)32, var4, 0L);
               Class_jg.a++;
            }
         }

         if (~var1.A == -4) {
            Class_cj.I++;
            Class_be.a(0, var1.K, (byte)-59, Class_hk.S, (short)10, Class_ha.md, 0L);
         }

         if (~var1.A == -5) {
            Class_kj.P++;
            Class_be.a(0, var1.K, (byte)-76, Class_hk.S, (short)36, var1.qc, 0L);
         }

         if (var1.A == 5) {
            Class_be.a(0, var1.K, (byte)-86, Class_hk.S, (short)28, var1.qc, 0L);
            Class_ce.eb++;
         }

         if (var1.A == 6 && Class_eb.f == null) {
            Class_ub.I++;
            Class_be.a(-1, var1.K, (byte)-78, Class_hk.S, (short)57, var1.qc, 0L);
         }

         if (var1.Kc == 2) {
            int var15 = 0;
            int var5 = 0;
            if (var13 != 0 || var1.Nc > var5) {
               do {
                  int var6 = 0;
                  if (var13 != 0 || ~var1.r < ~var6) {
                     do {
                        int var7 = var6 * (32 - -var1.zc);
                        int var8 = (32 + var1.Mb) * var5;
                        if (~var15 > -21) {
                           var7 += var1.sb[var15];
                           var8 += var1.l[var15];
                        }

                        if (~var7 >= ~var0 && ~var3 <= ~var8 && var7 - -32 > var0 && var3 < var8 + 32) {
                           Class_td.Q = var15;
                           Class_ad.a = var1;
                           label275:
                           if (var1.N[var15] > 0) {
                              Class_cf var9 = Class_ra.a(-25672, var1.N[var15] - 1);
                              if (Class_vh.cb == 1 && Class_fe.c(client.b(var1), -207106658)) {
                                 if (var1.K == Class_hk.P && ~Class_fa.Kb == ~var15) {
                                    break label275;
                                 }

                                 Class_be.a(var15, var1.K, (byte)-64, Class_o.a(2, new Class_r[]{Class_h.b, Class_de.b, var9.J}), (short)39, Class_mk.c, var9.x);
                                 Class_ve.ib++;
                                 if (var13 == 0) {
                                    break label275;
                                 }
                              }

                              if (!Class_sg.tb || !Class_fe.c(client.b(var1), -207106658)) {
                                 Class_ti.r++;
                                 Class_r[] var10 = var9.n;
                                 if (Class_pc.f) {
                                    var10 = Class_cg.a((byte)-114, var10);
                                 }

                                 if (Class_fe.c(client.b(var1), -207106658)) {
                                    int var11 = 4;
                                    if (var13 != 0 || var11 >= 3) {
                                       do {
                                          if (var10 == null || var10[var11] == null) {
                                             if (~var11 != -5) {
                                                var11--;
                                                continue;
                                             }

                                             Class_jk.s++;
                                             Class_be.a(
                                                var15, var1.K, (byte)-111, Class_o.a(2, new Class_r[]{Class_hj.U, var9.J}), (short)22, Class_vd.b, var9.x
                                             );
                                             if (var13 == 0) {
                                                var11--;
                                                continue;
                                             }
                                          }

                                          byte var12;
                                          if (var11 != 3) {
                                             var12 = 22;
                                             if (var13 != 0) {
                                                var12 = 7;
                                             }
                                          } else {
                                             var12 = 7;
                                          }

                                          Class_sh.f++;
                                          Class_be.a(var15, var1.K, (byte)-106, Class_o.a(2, new Class_r[]{Class_hj.U, var9.J}), var12, var10[var11], var9.x);
                                          var11--;
                                       } while (var11 >= 3);
                                    }
                                 }

                                 if (Class_li.a(client.b(var1), 1424444319)) {
                                    Class_og.bb++;
                                    Class_be.a(var15, var1.K, (byte)-69, Class_o.a(2, new Class_r[]{Class_hj.U, var9.J}), (short)16, Class_mk.c, var9.x);
                                 }

                                 if (Class_fe.c(client.b(var1), -207106658) && var10 != null) {
                                    int var22 = 2;
                                    if (var13 != 0 || var22 >= 0) {
                                       do {
                                          if (var10[var22] != null) {
                                             Class_tf.I++;
                                             byte var24 = 0;
                                             if (var22 == 0) {
                                                var24 = 14;
                                             }

                                             if (var22 == 1) {
                                                var24 = 17;
                                             }

                                             if (var22 == 2) {
                                                var24 = 13;
                                             }

                                             Class_be.a(var15, var1.K, (byte)-66, Class_o.a(2, new Class_r[]{Class_hj.U, var9.J}), var24, var10[var22], var9.x);
                                          }
                                       } while (--var22 >= 0);
                                    }
                                 }

                                 var10 = var1.jb;
                                 if (Class_pc.f) {
                                    var10 = Class_cg.a((byte)-73, var10);
                                 }

                                 if (var10 != null) {
                                    int var23 = 4;
                                    if (var13 != 0 || var23 >= 0) {
                                       do {
                                          if (var10[var23] != null) {
                                             Class_cb.G++;
                                             byte var25 = 0;
                                             if (~var23 == -1) {
                                                var25 = 41;
                                             }

                                             if (~var23 == -2) {
                                                var25 = 40;
                                             }

                                             if (var23 == 2) {
                                                var25 = 43;
                                             }

                                             if (var23 == 3) {
                                                var25 = 38;
                                             }

                                             if (var23 == 4) {
                                                var25 = 58;
                                             }

                                             Class_be.a(var15, var1.K, (byte)-60, Class_o.a(2, new Class_r[]{Class_hj.U, var9.J}), var25, var10[var23], var9.x);
                                          }
                                       } while (--var23 >= 0);
                                    }
                                 }

                                 Class_be.a(var15, var1.K, (byte)-99, Class_o.a(2, new Class_r[]{Class_hj.U, var9.J}), (short)1001, Class_uh.b, var9.x);
                                 if (var13 == 0) {
                                    break label275;
                                 }
                              }

                              if (~(16 & Class_fb.o) == -17) {
                                 Class_be.a(
                                    var15, var1.K, (byte)-77, Class_o.a(2, new Class_r[]{Class_ab.U, Class_de.b, var9.J}), (short)31, Class_aj.b, var9.x
                                 );
                                 Class_vd.d++;
                              }
                           }
                        }

                        var15++;
                     } while (~var1.r < ~(++var6));
                  }
               } while (var1.Nc > ++var5);
            }
         }

         if (var1.dc) {
            if (Class_sg.tb) {
               if (Class_pj.a(client.b(var1), (byte)-114) && ~(Class_fb.o & 32) == -33) {
                  Class_be.a(var1.hc, var1.K, (byte)-92, Class_o.a(2, new Class_r[]{Class_ab.U, Class_fe.K, var1.Ec}), (short)6, Class_aj.b, 0L);
                  Class_te.ab++;
                  return;
               }

               return;
            }

            int var16 = 9;
            if (var13 != 0 || var16 >= 5) {
               do {
                  Class_r var17 = Class_ji.a(-3574, var16, var1);
                  if (var17 != null) {
                     Class_fi.q++;
                     Class_be.a(var1.hc, var1.K, (byte)-121, var1.Ec, (short)1007, var17, 1 + var16);
                  }
               } while (--var16 >= 5);
            }

            Class_r var18 = Class_ba.a(0, var1);
            if (var18 != null) {
               Class_jg.a++;
               Class_be.a(var1.hc, var1.K, (byte)-105, var1.Ec, (short)32, var18, 0L);
            }

            int var19 = 4;
            if (var13 != 0 || var19 >= 0) {
               do {
                  Class_r var20 = Class_ji.a(-3574, var19, var1);
                  if (var20 != null) {
                     Class_be.a(var1.hc, var1.K, (byte)-120, var1.Ec, (short)51, var20, 1 + var19);
                     Class_fi.q++;
                  }
               } while (--var19 >= 0);
            }

            if (Class_be.b(client.b(var1), 1)) {
               Class_be.a(var1.hc, var1.K, (byte)-102, Class_hk.S, (short)57, Class_rh.j, 0L);
               Class_ub.I++;
               return;
            }
         }
      } catch (RuntimeException var14) {
         throw Class_sh.a(var14, "vb.E(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }
}
