import java.io.IOException;

final class Class_ch {
   static int a;
   static Class_r b = Class_ch.x;
   static Class_r c = Class_ch.x;
   static Class_r d = Class_ch.g;
   int e;
   static int f = 0;
   private static Class_r g = Class_tc.a(43, "Select");
   byte[] h;
   static int i;
   byte[] j;
   int k;
   int l;
   static int m;
   static int n;
   static volatile int o = 0;
   static Class_r p = Class_tc.a(43, "runes");
   int q;
   int r;
   static int s;
   int t;
   int u;
   static int v;
   static int w;
   private static Class_r x = Class_tc.a(43, "cyan:");

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0) {
      int var2 = client.lb;

      try {
         Class_ad.o++;
         w++;
         Class_cj.S.o(-67, 108);
         Class_be var1 = (Class_be)Class_nj.p.a(-32642);
         if (var2 != 0) {
            if (~var1.q == -1) {
               Class_hj.a(var1, true, true);
            }

            var1 = (Class_be)Class_nj.p.a((byte)-105);
         }

         for (; var1 != null; var1 = (Class_be)Class_nj.p.a((byte)-105)) {
            if (~var1.q == -1) {
               Class_hj.a(var1, true, true);
            }
         }

         if (var0 != 636) {
            a(126);
         }

         if (Class_eb.f != null) {
            Class_tg.a(Class_eb.f, -124);
            Class_eb.f = null;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ch.D(" + var0 + ')');
      }
   }

   static final void a(Class_cj var0, byte var1, Class_cj var2) {
      try {
         Class_ma.gb = Class_pa.a(var0, 0, (byte)81, var2, Class_tg.l);
         int var3 = -114 % ((20 - var1) / 61);
         Class_ak.O = (Class_qf)Class_ma.gb;
         m++;
         Class_fi.A = Class_pa.a(var0, 0, (byte)58, var2, Class_ua.l);
         Class_db.sb = Class_pa.a(var0, 0, (byte)67, var2, Class_hg.i);
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "ch.F(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, Class_lh var1) {
      int var4 = client.lb;

      try {
         i++;
         byte[] var2 = new byte[var0];
         if (Class_db.T != null) {
            try {
               Class_db.T.a(0L, var0 + -23);
               Class_db.T.a(-128, var2);
               int var7 = 0;
               if (var4 != 0 || var7 < 24) {
                  while (var2[var7] == 0 || var4 != 0) {
                     if (++var7 >= 24) {
                        break;
                     }
                  }
               }

               if (var7 >= 24) {
                  throw new IOException();
               }
            } catch (Exception var5) {
               int var3 = 0;
               if (var4 != 0) {
                  var2[var3] = -1;
                  var3++;
               }

               while (~var3 > -25) {
                  var2[var3] = -1;
                  var3++;
               }
            }
         }

         var1.a(24, (byte)118, 0, var2);
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "ch.A(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, int var1, int var2, int var3, boolean var4, int var5, int var6) {
      int var23 = client.lb;

      try {
         a++;
         if (~Class_vh.cb == -1 && !Class_sg.tb) {
            Class_d.c++;
            int var7 = Class_nd.v;
            int var8 = Class_tb.o;
            int var10 = Class_vi.R;
            int var9 = Class_a.j;
            int var11 = var7 + (-var0 + var6) * (-var7 + var8) / var5;
            int var12 = var9 + (var10 - var9) * (var3 - var1) / var2;
            Class_be.a(var11, var12, (byte)-108, Class_hk.S, (short)5, Class_g.h, 0L);
         }

         long var25 = -1L;
         if (var4) {
            int var26 = 0;
            if (var23 != 0 || Class_ab.Q > var26) {
               do {
                  long var27 = Class_tf.J[var26];
                  int var28 = 127 & (int)var27;
                  int var13 = 127 & (int)var27 >> 12401223;
                  int var14 = (1691523919 & (int)var27) >> 1521701917;
                  int var15 = (int)(var27 >>> 853512416) & 2147483647;
                  if (var25 != var27) {
                     var25 = var27;
                     label320:
                     if (~var14 == -3 && Class_od.a(Class_jk.F, var28, var13, var27)) {
                        Class_ub var16 = Class_qe.a(80, var15);
                        if (var16.J != null) {
                           var16 = var16.b(-1);
                        }

                        if (var16 == null) {
                           continue;
                        }

                        if (Class_vh.cb != 1) {
                           if (!Class_sg.tb) {
                              Class_og.hb++;
                              Class_r[] var17 = var16.W;
                              if (Class_pc.f) {
                                 var17 = Class_cg.a((byte)-106, var17);
                              }

                              if (var17 != null) {
                                 int var18 = 4;
                                 if (var23 != 0 || var18 >= 0) {
                                    do {
                                       if (var17[var18] != null) {
                                          Class_vc.P++;
                                          short var19 = 0;
                                          if (var18 == 0) {
                                             var19 = 18;
                                          }

                                          if (~var18 == -2) {
                                             var19 = 47;
                                          }

                                          if (var18 == 2) {
                                             var19 = 46;
                                          }

                                          if (~var18 == -4) {
                                             var19 = 42;
                                          }

                                          if (var18 == 4) {
                                             var19 = 1003;
                                          }

                                          Class_be.a(var28, var13, (byte)-119, Class_o.a(2, new Class_r[]{Class_cj.eb, var16.lb}), var19, var17[var18], var27);
                                       }
                                    } while (--var18 >= 0);
                                 }
                              }

                              Class_be.a(var28, var13, (byte)-87, Class_o.a(2, new Class_r[]{Class_cj.eb, var16.lb}), (short)1005, Class_uh.b, var16.vb);
                              if (var23 == 0) {
                                 break label320;
                              }
                           }

                           if ((Class_fb.o & 4) != 4) {
                              break label320;
                           }

                           Class_b.db++;
                           Class_be.a(var28, var13, (byte)-126, Class_o.a(2, new Class_r[]{Class_ab.U, Class_th.g, var16.lb}), (short)37, Class_aj.b, var27);
                           if (var23 == 0) {
                              break label320;
                           }
                        }

                        Class_r.cb++;
                        Class_be.a(var28, var13, (byte)-104, Class_o.a(2, new Class_r[]{Class_h.b, Class_th.g, var16.lb}), (short)1, Class_mk.c, var27);
                     }

                     if (var14 == 1) {
                        Class_eh var29 = Class_rf.a[var15];
                        if (var29.Pb.T == 1 && (var29.hb & 127) == 64 && ~(var29.J & 127) == -65) {
                           int var32 = 0;
                           if (var23 != 0 || var32 < Class_ke.p) {
                              do {
                                 Class_eh var35 = Class_rf.a[Class_kg.v[var32]];
                                 if (var35 != null && var35 != var29 && var35.Pb.T == 1 && var35.hb == var29.hb && var35.J == var29.J) {
                                    Class_sb.a(Class_kg.v[var32], var13, var28, (byte)111, var35.Pb);
                                 }
                              } while (++var32 < Class_ke.p);
                           }

                           int var36 = 0;
                           if (var23 != 0 || var36 < client.ib) {
                              do {
                                 Class_fa var40 = Class_db.Q[Class_oc.q[var36]];
                                 if (var40 != null && var40.hb == var29.hb && var40.J == var29.J) {
                                    Class_dc.a(var40, -126, var28, var13, Class_oc.q[var36]);
                                 }
                              } while (++var36 < client.ib);
                           }
                        }

                        Class_sb.a(var15, var13, var28, (byte)93, var29.Pb);
                     }

                     if (var14 == 0) {
                        Class_fa var30 = Class_db.Q[var15];
                        if (~(var30.hb & 127) == -65 && ~(var30.J & 127) == -65) {
                           int var33 = 0;
                           if (var23 != 0 || var33 < Class_ke.p) {
                              do {
                                 Class_eh var37 = Class_rf.a[Class_kg.v[var33]];
                                 if (var37 != null && ~var37.Pb.T == -2 && var37.hb == var30.hb && var37.J == var30.J) {
                                    Class_sb.a(Class_kg.v[var33], var13, var28, (byte)-11, var37.Pb);
                                 }
                              } while (++var33 < Class_ke.p);
                           }

                           int var38 = 0;
                           if (var23 != 0 || ~var38 > ~client.ib) {
                              do {
                                 Class_fa var41 = Class_db.Q[Class_oc.q[var38]];
                                 if (var41 != null && var30 != var41 && ~var41.hb == ~var30.hb && ~var30.J == ~var41.J) {
                                    Class_dc.a(var41, -62, var28, var13, Class_oc.q[var38]);
                                 }
                              } while (~(++var38) > ~client.ib);
                           }
                        }

                        Class_dc.a(var30, -112, var28, var13, var15);
                     }

                     if (~var14 == -4) {
                        Class_c var31 = Class_ha.od[Class_jk.F][var28][var13];
                        if (var31 != null) {
                           Class_wc var34 = (Class_wc)var31.d(30568);
                           if (var23 != 0 || var34 != null) {
                              do {
                                 label346: {
                                    int var39 = var34.J.r;
                                    Class_cf var42 = Class_ra.a(-25672, var39);
                                    if (Class_vh.cb == 1) {
                                       Class_cg.n++;
                                       Class_be.a(
                                          var28, var13, (byte)-62, Class_o.a(2, new Class_r[]{Class_h.b, Class_de.b, var42.J}), (short)8, Class_mk.c, var39
                                       );
                                       if (var23 == 0) {
                                          break label346;
                                       }
                                    }

                                    if (Class_sg.tb) {
                                       if (~(1 & Class_fb.o) != -2) {
                                          break label346;
                                       }

                                       Class_rh.l++;
                                       Class_be.a(
                                          var28, var13, (byte)-128, Class_o.a(2, new Class_r[]{Class_ab.U, Class_de.b, var42.J}), (short)34, Class_aj.b, var39
                                       );
                                       if (var23 == 0) {
                                          break label346;
                                       }
                                    }

                                    Class_je.c++;
                                    Class_r[] var20 = var42.Q;
                                    if (Class_pc.f) {
                                       var20 = Class_cg.a((byte)-79, var20);
                                    }

                                    int var21 = 4;
                                    if (var23 == 0 && var21 < 0) {
                                       Class_be.a(var28, var13, (byte)-80, Class_o.a(2, new Class_r[]{Class_hj.U, var42.J}), (short)1006, Class_uh.b, var39);
                                    } else {
                                       do {
                                          if (var20 != null && var20[var21] != null) {
                                             Class_p.j++;
                                             byte var43 = 0;
                                             if (var21 == 0) {
                                                var43 = 35;
                                             }

                                             if (var21 == 1) {
                                                var43 = 45;
                                             }

                                             if (~var21 == -3) {
                                                var43 = 30;
                                             }

                                             if (var21 == 3) {
                                                var43 = 3;
                                             }

                                             if (~var21 == -5) {
                                                var43 = 9;
                                             }

                                             Class_be.a(var28, var13, (byte)-52, Class_o.a(2, new Class_r[]{Class_hj.U, var42.J}), var43, var20[var21], var39);
                                             var21--;
                                          } else if (var21 == 2) {
                                             Class_pf.d++;
                                             Class_be.a(
                                                var28, var13, (byte)-104, Class_o.a(2, new Class_r[]{Class_hj.U, var42.J}), (short)30, Class_og.V, var39
                                             );
                                             if (var23 != 0) {
                                                Class_p.j++;
                                                byte var22 = 0;
                                                if (var21 == 0) {
                                                   var22 = 35;
                                                }

                                                if (var21 == 1) {
                                                   var22 = 45;
                                                }

                                                if (~var21 == -3) {
                                                   var22 = 30;
                                                }

                                                if (var21 == 3) {
                                                   var22 = 3;
                                                }

                                                if (~var21 == -5) {
                                                   var22 = 9;
                                                }

                                                Class_be.a(
                                                   var28, var13, (byte)-52, Class_o.a(2, new Class_r[]{Class_hj.U, var42.J}), var22, var20[var21], var39
                                                );
                                                var21--;
                                             } else {
                                                var21--;
                                             }
                                          } else {
                                             var21--;
                                          }
                                       } while (var21 >= 0);

                                       Class_be.a(var28, var13, (byte)-80, Class_o.a(2, new Class_r[]{Class_hj.U, var42.J}), (short)1006, Class_uh.b, var39);
                                    }
                                 }

                                 var34 = (Class_wc)var31.a((byte)-101);
                              } while (var34 != null);
                           }
                        }
                     }
                  }
               } while (Class_ab.Q > ++var26);
            }
         }
      } catch (RuntimeException var24) {
         throw Class_sh.a(var24, "ch.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
      }
   }

   static final void a(int var0, int var1, int var2, byte[][][] var3, int var4, byte var5, int var6, int var7) {
      Class_aa.r++;
      Class_i.kb = 0;
      int var8 = var6 - 16;
      int var9 = var6 + 16;
      int var10 = var7 - 16;
      int var11 = var7 + 16;

      for (int var12 = Class_hd.n; var12 < Class_od.r; var12++) {
         Class_aa[][] var13 = Class_ck.d[var12];

         for (int var14 = Class_lj.g; var14 < Class_ed.j; var14++) {
            for (int var15 = Class_oc.k; var15 < Class_ng.u; var15++) {
               Class_aa var16 = var13[var14][var15];
               if (var16 != null) {
                  if (!Class_kc.v[var14 - Class_jb.ab + Class_rd.Y][var15 - Class_vg.x + Class_rd.Y]
                     || var3 != null && var12 >= var4 && var3[var12][var14][var15] == var5) {
                     var16.E = false;
                     var16.F = false;
                     var16.N = 0;
                     if (var14 >= var8 && var14 <= var9 && var15 >= var10 && var15 <= var11) {
                        if (var16.s != null) {
                           Class_kk var17 = var16.s;
                           var17.f.a(var17.a, var17.h, 100, var17.a, var17.h);
                           if (var17.i != null) {
                              var17.i.a(var17.a, var17.h, 102, var17.a, var17.h);
                           }
                        }

                        if (var16.z != null) {
                           Class_mk var30 = var16.z;
                           var30.n.a(var30.h, var30.e, 98, var30.h, var30.e);
                           if (var30.p != null) {
                              var30.p.a(var30.h, var30.e, 123, var30.h, var30.e);
                           }
                        }

                        if (var16.M != null) {
                           Class_hd var31 = var16.M;
                           var31.a.a(var31.b, var31.k, 99, var31.b, var31.k);
                        }

                        if (var16.H != null) {
                           for (int var32 = 0; var32 < var16.G; var32++) {
                              Class_lj var18 = var16.H[var32];
                              var18.j.a(var18.b, var18.v, 99, var18.u, var18.f);
                           }
                        }
                     }
                  } else {
                     var16.E = true;
                     var16.F = true;
                     if (var16.G > 0) {
                        var16.Q = true;
                     } else {
                        var16.Q = false;
                     }

                     Class_i.kb++;
                  }
               }
            }
         }
      }

      boolean var24 = Class_mi.U == Class_ih.W;

      for (int var25 = Class_hd.n; var25 < Class_od.r; var25++) {
         Class_aa[][] var26 = Class_ck.d[var25];

         for (int var28 = -Class_rd.Y; var28 <= 0; var28++) {
            int var33 = Class_jb.ab + var28;
            int var35 = Class_jb.ab - var28;
            if (var33 >= Class_lj.g || var35 < Class_ed.j) {
               for (int var19 = -Class_rd.Y; var19 <= 0; var19++) {
                  int var20 = Class_vg.x + var19;
                  int var21 = Class_vg.x - var19;
                  if (var33 >= Class_lj.g) {
                     if (var20 >= Class_oc.k) {
                        Class_aa var22 = var26[var33][var20];
                        if (var22 != null && var22.E) {
                           Class_si.a(var22, true);
                        }
                     }

                     if (var21 < Class_ng.u) {
                        Class_aa var40 = var26[var33][var21];
                        if (var40 != null && var40.E) {
                           Class_si.a(var40, true);
                        }
                     }
                  }

                  if (var35 < Class_ed.j) {
                     if (var20 >= Class_oc.k) {
                        Class_aa var41 = var26[var35][var20];
                        if (var41 != null && var41.E) {
                           Class_si.a(var41, true);
                        }
                     }

                     if (var21 < Class_ng.u) {
                        Class_aa var42 = var26[var35][var21];
                        if (var42 != null && var42.E) {
                           Class_si.a(var42, true);
                        }
                     }
                  }

                  if (Class_i.kb == 0) {
                     if (!var24) {
                        Class_lh.cb = false;
                     }

                     return;
                  }
               }
            }
         }
      }

      for (int var27 = Class_hd.n; var27 < Class_od.r; var27++) {
         Class_aa[][] var29 = Class_ck.d[var27];

         for (int var34 = -Class_rd.Y; var34 <= 0; var34++) {
            int var36 = Class_jb.ab + var34;
            int var37 = Class_jb.ab - var34;
            if (var36 >= Class_lj.g || var37 < Class_ed.j) {
               for (int var38 = -Class_rd.Y; var38 <= 0; var38++) {
                  int var39 = Class_vg.x + var38;
                  int var43 = Class_vg.x - var38;
                  if (var36 >= Class_lj.g) {
                     if (var39 >= Class_oc.k) {
                        Class_aa var23 = var29[var36][var39];
                        if (var23 != null && var23.E) {
                           Class_si.a(var23, false);
                        }
                     }

                     if (var43 < Class_ng.u) {
                        Class_aa var44 = var29[var36][var43];
                        if (var44 != null && var44.E) {
                           Class_si.a(var44, false);
                        }
                     }
                  }

                  if (var37 < Class_ed.j) {
                     if (var39 >= Class_oc.k) {
                        Class_aa var45 = var29[var37][var39];
                        if (var45 != null && var45.E) {
                           Class_si.a(var45, false);
                        }
                     }

                     if (var43 < Class_ng.u) {
                        Class_aa var46 = var29[var37][var43];
                        if (var46 != null && var46.E) {
                           Class_si.a(var46, false);
                        }
                     }
                  }

                  if (Class_i.kb == 0) {
                     if (!var24) {
                        Class_lh.cb = false;
                     }

                     return;
                  }
               }
            }
         }
      }

      Class_lh.cb = false;
   }

   public static void a(byte var0) {
      try {
         if (var0 == 87) {
            c = null;
            x = null;
            d = null;
            p = null;
            b = null;
            g = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ch.H(" + var0 + ')');
      }
   }

   public Class_ch() {
   }

   static final void a(int var0, int var1, boolean var2) {
      try {
         s++;
         if (var2) {
            long var3 = (var0 << 1996473648) + var1;
            Class_tf var5 = (Class_tf)Class_lh.Ab.a(var3, -111);
            if (var5 != null) {
               Class_gg.v.a(var5, (byte)121);
            }
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "ch.G(" + var0 + ',' + var1 + ',' + var2 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void b(byte var0) {
      int var3 = client.lb;

      try {
         Class_qj.Q.a(true);
         int var1 = 0;
         if (var3 != 0 || var1 < 32) {
            do {
               Class_od.k[var1] = 0L;
            } while (++var1 < 32);
         }

         int var2 = 0;
         if (var3 != 0) {
            Class_vd.c[var2] = 0L;
            var2++;
         }

         while (var2 < 32) {
            Class_vd.c[var2] = 0L;
            var2++;
         }

         if (var0 < 24) {
            a(37, null);
         }

         v++;
         Class_mh.V = 0;
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "ch.B(" + var0 + ')');
      }
   }
}
