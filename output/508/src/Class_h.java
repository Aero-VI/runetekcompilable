import java.io.IOException;
import nativeadvert.browsercontrol;

final class Class_h {
   static Class_wb a;
   static Class_r b = null;
   static int c;
   static int d;
   Class_a e;
   static int f;
   static int g;
   static int h;
   static int i;
   static int j;
   static int k;
   static int l;
   static int m;
   static Class_nj n = new Class_nj(128);

   static final void a(byte var0, int var1) {
      try {
         if (var0 > 6) {
            d++;
            Class_qj.L.b(-18767, var1);
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "h.A(" + var0 + ',' + var1 + ')');
      }
   }

   static final void a(int var0) {
      try {
         h++;
         if (var0 != -1) {
            b = null;
         }

         if (browsercontrol.iscreated()) {
            browsercontrol.hide();
         }

         Class_tj.a(-68, Class_od.u);
         Class_pe.a(Class_od.u, true);
         if (Class_r.a != null) {
            Class_r.a.a(var0 + 101, Class_od.u);
         }

         Class_fc.d(-125);
         Class_ig.a(Class_od.u, 1611550343);
         Class_ak.a(var0 + -88, Class_od.u);
         if (Class_r.a != null) {
            Class_r.a.a(Class_od.u, true);
         }

         Class_me.a(0);
         Class_fj.f = 0L;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "h.C(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(Class_r var0, byte var1) {
      int var5 = client.lb;

      try {
         k++;
         if (~Class_ib.eb <= -3) {
            if (var0.a(false, Class_rj.B)) {
               Class_jk.c(0);
               int var2 = 0;
               if (var5 != 0) {
                  System.gc();
                  var2++;
               }

               while (~var2 > -11) {
                  System.gc();
                  var2++;
               }

               Runtime var3 = Runtime.getRuntime();
               int var4 = (int)((var3.totalMemory() + -var3.freeMemory()) / 1024L);
               Class_he.a(null, 14, Class_o.a(2, new Class_r[]{Class_qd.H, Class_og.b(var4, 0), Class_ij.c}), 0);
            }

            if (var0.a(false, Class_kg.p)) {
               Class_ak.b((byte)-21);
            }

            if (var0.a(false, Class_vh.mb)) {
               Class_ca.a(25, (byte)-98);
            }

            if (var0.a(false, Class_kk.d)) {
               Class_qd.r = true;
            }

            if (var0.a(false, Class_u.S)) {
               Class_qd.r = false;
            }

            if (var0.a(false, Class_fd.e)) {
               int var7 = 0;
               if (var5 != 0 || var7 < 4) {
                  do {
                     int var8 = 1;
                     if (var5 != 0 || ~var8 > -104) {
                        do {
                           int var9 = 1;
                           if (var5 != 0 || var9 < 103) {
                              do {
                                 Class_sj.j[var7].z[var8][var9] = 0;
                              } while (++var9 < 103);
                           }
                        } while (~(++var8) > -104);
                     }
                  } while (++var7 < 4);
               }
            }

            if (var0.a(Class_hg.l, 95) && Class_rh.q != 0) {
               Class_jc.b(var0.b(6, true).g((byte)16), -47);
            }

            if (var0.a(false, Class_ia.kb) && ~Class_rh.q == -3) {
               throw new RuntimeException();
            }

            if (var0.a(Class_b.O, 96)) {
               Class_ec.S = var0.b(12, true).a(true).g((byte)-41);
               Class_he.a(null, 126, Class_o.a(2, new Class_r[]{Class_hj.S, Class_og.b(Class_ec.S, 0)}), 0);
            }

            if (var0.a(false, Class_kj.S)) {
               Class_pe.E = true;
            }
         }

         if (var1 == 1) {
            Class_ec.N++;
            Class_cj.S.o(-64, 107);
            Class_cj.S.b(32, -1 + var0.d((byte)-96));
            Class_cj.S.a((byte)-9, var0.b(2, true));
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "h.H(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, int var1, byte var2, int var3, int var4, int var5) {
      int var15 = client.lb;

      try {
         i++;
         int var6 = -var5 + var1;
         int var7 = var3 - var0;
         if (~var7 != -1) {
            if (var6 == 0) {
               Class_bj.a(1, var3, var0, var4, var5);
            } else {
               if (~var6 > -1) {
                  var6 = -var6;
               }

               if (~var7 > -1) {
                  var7 = -var7;
               }

               if (var2 > 29) {
                  boolean var8 = ~var6 < ~var7;
                  if (var8) {
                     int var9 = var0;
                     var0 = var5;
                     int var10 = var3;
                     var5 = var9;
                     var3 = var1;
                     var1 = var10;
                  }

                  if (var0 > var3) {
                     int var17 = var0;
                     int var19 = var5;
                     var5 = var1;
                     var0 = var3;
                     var3 = var17;
                     var1 = var19;
                  }

                  int var20 = var3 - var0;
                  int var18 = var5;
                  int var11 = var1 + -var5;
                  int var12 = -(var20 >> -783505855);
                  int var13 = ~var1 < ~var5 ? 1 : -1;
                  if (~var11 > -1) {
                     var11 = -var11;
                  }

                  if (var8) {
                     int var21 = var0;
                     if (var15 != 0 || ~var0 >= ~var3) {
                        do {
                           Class_qd.p[var21][var18] = var4;
                           var12 += var11;
                           if (var12 > 0) {
                              var18 += var13;
                              var12 -= var20;
                           }
                        } while (~(++var21) >= ~var3);
                     }
                  } else {
                     int var14 = var0;
                     if (var15 != 0 || var3 >= var0) {
                        do {
                           Class_qd.p[var18][var14] = var4;
                           var12 += var11;
                           if (~var12 < -1) {
                              var12 -= var20;
                              var18 += var13;
                           }
                        } while (var3 >= ++var14);
                     }
                  }
               }
            }
         } else {
            if (~var6 != -1) {
               Class_jk.a(-6, var0, var1, var4, var5);
            }
         }
      } catch (RuntimeException var16) {
         throw Class_sh.a(var16, "h.J(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
      }
   }

   static final boolean b(int var0) {
      try {
         m++;
         if (var0 >= -86) {
            return true;
         } else {
            long var1 = Class_fj.a(17161);
            int var3 = (int)(var1 - Class_ng.w);
            if (var3 > 200) {
               var3 = 200;
            }

            Class_c.s += var3;
            Class_ng.w = var1;
            if (Class_ck.c == 0 && ~Class_ug.q == -1 && Class_wh.p == 0 && Class_jd.i == 0) {
               return true;
            } else if (Class_v.s == null) {
               return false;
            } else {
               try {
                  if (Class_c.s > 30000) {
                     throw new IOException();
                  } else {
                     while (Class_ug.q < 20 && Class_jd.i > 0) {
                        Class_tf var4 = (Class_tf)Class_vf.e.a(-32642);
                        Class_lh var5 = new Class_lh(4);
                        var5.b(32, 1);
                        var5.a((int)var4.a, false);
                        Class_v.s.a(0, (byte)34, 4, var5.E);
                        Class_qj.S.a((byte)-21, var4, var4.a);
                        Class_ug.q++;
                        Class_jd.i--;
                     }

                     while (~Class_ck.c > -21 && Class_wh.p > 0) {
                        Class_tf var20 = (Class_tf)Class_gg.v.b(1742);
                        Class_lh var22 = new Class_lh(4);
                        var22.b(32, 0);
                        var22.a((int)var20.a, false);
                        Class_v.s.a(0, (byte)88, 4, var22.E);
                        var20.b((byte)73);
                        Class_tb.n.a((byte)-82, var20, var20.a);
                        Class_wh.p--;
                        Class_ck.c++;
                     }

                     for (int var21 = 0; ~var21 > -101; var21++) {
                        int var23 = Class_v.s.a((byte)102);
                        if (~var23 > -1) {
                           throw new IOException();
                        }

                        if (var23 == 0) {
                           break;
                        }

                        byte var6 = 0;
                        Class_c.s = 0;
                        if (Class_mh.W != null) {
                           if (Class_hd.l == 0) {
                              var6 = 1;
                           }
                        } else {
                           var6 = 8;
                        }

                        if (~var6 < -1) {
                           int var7 = var6 + -Class_mg.g.p;
                           if (var7 > var23) {
                              var7 = var23;
                           }

                           Class_v.s.a(-122, var7, Class_mg.g.p, Class_mg.g.E);
                           if (Class_p.e != 0) {
                              for (int var8 = 0; ~var8 > ~var7; var8++) {
                                 Class_mg.g.E[var8 + Class_mg.g.p] = (byte)Class_bj.a(Class_mg.g.E[var8 + Class_mg.g.p], Class_p.e);
                              }
                           }

                           Class_mg.g.p += var7;
                           if (var6 > Class_mg.g.p) {
                              break;
                           }

                           if (Class_mh.W == null) {
                              Class_mg.g.p = 0;
                              int var25 = Class_mg.g.n(-6677);
                              int var9 = Class_mg.g.k(1355769544);
                              int var10 = Class_mg.g.n(-6677);
                              int var11 = Class_mg.g.h(-5528);
                              long var12 = var9 + (var25 << -2087565424);
                              Class_tf var14 = (Class_tf)Class_qj.S.a(var12, 84);
                              Class_sj.e = true;
                              if (var14 == null) {
                                 var14 = (Class_tf)Class_tb.n.a(var12, 101);
                                 Class_sj.e = false;
                              }

                              if (var14 == null) {
                                 throw new IOException();
                              }

                              Class_mh.W = var14;
                              int var15 = var10 != 0 ? 9 : 5;
                              Class_vf.j = new Class_lh(Class_mh.W.M + var15 + var11);
                              Class_vf.j.b(32, var10);
                              Class_vf.j.g(544537784, var11);
                              Class_mg.g.p = 0;
                              Class_hd.l = 8;
                           } else if (~Class_hd.l == -1) {
                              if (Class_mg.g.E[0] == -1) {
                                 Class_hd.l = 1;
                                 Class_mg.g.p = 0;
                              } else {
                                 Class_mh.W = null;
                              }
                           }
                        } else {
                           int var24 = Class_vf.j.E.length + -Class_mh.W.M;
                           int var26 = 512 - Class_hd.l;
                           if (~(var24 + -Class_vf.j.p) > ~var26) {
                              var26 = var24 - Class_vf.j.p;
                           }

                           if (~var23 > ~var26) {
                              var26 = var23;
                           }

                           Class_v.s.a(-60, var26, Class_vf.j.p, Class_vf.j.E);
                           if (Class_p.e != 0) {
                              for (int var27 = 0; ~var26 < ~var27; var27++) {
                                 Class_vf.j.E[var27 + Class_vf.j.p] = (byte)Class_bj.a(Class_vf.j.E[var27 + Class_vf.j.p], Class_p.e);
                              }
                           }

                           Class_vf.j.p += var26;
                           Class_hd.l += var26;
                           if (var24 == Class_vf.j.p) {
                              if (~Class_mh.W.a != -16711936L) {
                                 Class_tc.k.reset();
                                 Class_tc.k.update(Class_vf.j.E, 0, var24);
                                 int var29 = (int)Class_tc.k.getValue();
                                 if (var29 != Class_mh.W.N) {
                                    try {
                                       Class_v.s.b(-105);
                                    } catch (Exception var17) {
                                    }

                                    Class_rj.F++;
                                    Class_v.s = null;
                                    Class_p.e = (byte)(Math.random() * 255.0 + 1.0);
                                    return false;
                                 }

                                 Class_rj.F = 0;
                                 Class_kg.y = 0;
                                 Class_mh.W.P.a(Class_sj.e, ~(16711680L & Class_mh.W.a) == -16711681L, (int)(65535L & Class_mh.W.a), 125, Class_vf.j.E);
                              } else {
                                 Class_hg.b = Class_vf.j;

                                 for (int var28 = 0; var28 < 256; var28++) {
                                    Class_sg var30 = Class_pe.r[var28];
                                    if (var30 != null) {
                                       Class_hg.b.p = 8 * var28 + 5;
                                       int var31 = Class_hg.b.h(-5528);
                                       int var32 = Class_hg.b.h(-5528);
                                       var30.a(var32, (byte)102, var31);
                                    }
                                 }
                              }

                              Class_mh.W.c(-17554);
                              Class_hd.l = 0;
                              Class_mh.W = null;
                              Class_vf.j = null;
                              if (!Class_sj.e) {
                                 Class_ck.c--;
                              } else {
                                 Class_ug.q--;
                              }
                           } else {
                              if (~Class_hd.l != -513) {
                                 break;
                              }

                              Class_hd.l = 0;
                           }
                        }
                     }

                     return true;
                  }
               } catch (IOException var18) {
                  try {
                     Class_v.s.b(-89);
                  } catch (Exception var16) {
                  }

                  Class_v.s = null;
                  Class_kg.y++;
                  return false;
               }
            }
         }
      } catch (RuntimeException var19) {
         throw Class_sh.a(var19, "h.I(" + var0 + ')');
      }
   }

   static final void a(boolean var0, int var1, int var2, Class_uc var3, boolean var4, int var5) {
      try {
         j++;
         if (~Class_fc.v > -51) {
            if (var3.c != null && var3.c.length > var1 && var3.c[var1] != null) {
               if (var0) {
                  b(105);
               }

               int var6 = var3.c[var1][0];
               int var7 = var6 >> 125390056;
               if (var3.c[var1].length > 1) {
                  int var10 = (int)(Math.random() * var3.c[var1].length);
                  if (~var10 < -1) {
                     var7 = var3.c[var1][var10];
                  }
               }

               int var9 = var6 & 15;
               int var8 = var6 >> -1746099356 & 7;
               if (var9 == 0) {
                  if (var4) {
                     Class_je.a((byte)-124, 0, var8, var7);
                  }
               } else if (Class_tf.V != 0) {
                  Class_nj.s[Class_fc.v] = var7;
                  Class_tb.p[Class_fc.v] = var8;
                  Class_fd.f[Class_fc.v] = 0;
                  int var13 = (-64 + var2) / 128;
                  Class_ad.h[Class_fc.v] = null;
                  int var11 = (var5 - 64) / 128;
                  Class_rf.l[Class_fc.v] = var9 + (var13 << -777582416) + (var11 << 60528936);
                  Class_fc.v++;
               }
            }
         }
      } catch (RuntimeException var12) {
         throw Class_sh.a(var12, "h.D(" + var0 + ',' + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ',' + var4 + ',' + var5 + ')');
      }
   }

   static final Class_r a(boolean var0, byte var1, int var2) {
      try {
         g++;
         if (var1 != 42) {
            d(126);
         }

         return Class_dj.a(10, var0, (byte)125, var2);
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "h.K(" + var0 + ',' + var1 + ',' + var2 + ')');
      }
   }

   static final Class_jb a(int var0, int var1, boolean var2, int var3, int var4, boolean var5) {
      try {
         c++;
         int var7 = (var0 << -238182831) + var3 + (!var5 ? 0 : 65536) + (var4 << -2123486893);
         long var8 = var7 * 3849834839L + 3147483667L * var1;
         Class_jb var10 = (Class_jb)Class_ha.gd.a(14366, var8);
         if (var10 != null) {
            return var10;
         } else {
            Class_kd.b = false;
            var10 = Class_ib.a(var2, var4, -126, var3, var5, var0, false, var1);
            if (var10 != null && !Class_kd.b) {
               Class_ha.gd.a(var10, 121, var8);
            }

            return var10;
         }
      } catch (RuntimeException var11) {
         throw Class_sh.a(var11, "h.F(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void c(int var0) {
      int var5 = client.lb;

      try {
         f++;
         int[] var1 = new int[Class_bi.j];
         if (var0 == 4) {
            int var2 = 0;
            int var3 = 0;
            if (var5 != 0 || var3 < Class_bi.j) {
               do {
                  Class_cf var4 = Class_ra.a(-25672, var3);
                  if (~var4.lb > -1 && ~var4.ib > -1) {
                     var3++;
                  } else {
                     var1[var2++] = var3++;
                  }
               } while (var3 < Class_bi.j);
            }

            Class_qj.T = new int[var2];
            int var7 = 0;
            if (var5 != 0) {
               Class_qj.T[var7] = var1[var7];
               var7++;
            }

            while (~var7 > ~var2) {
               Class_qj.T[var7] = var1[var7];
               var7++;
            }
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "h.E(" + var0 + ')');
      }
   }

   static final void a(byte var0) {
      try {
         l++;
         Class_bc.T.b((byte)94);
         Class_rj.x.b((byte)94);
         if (var0 > -56) {
            a = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "h.G(" + var0 + ')');
      }
   }

   public Class_h() {
   }

   public static void d(int var0) {
      try {
         a = null;
         b = null;
         if (var0 == 8412) {
            n = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "h.B(" + var0 + ')');
      }
   }
}
