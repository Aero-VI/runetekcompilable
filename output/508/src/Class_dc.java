import java.math.BigInteger;

final class Class_dc extends Class_li {
   static int p = 0;
   static BigInteger q = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
   static int r = 0;
   static int s;
   int t;
   static int u;
   static Class_r v = null;
   static int w;
   int x;
   int y;
   int z;
   static int A;
   static int B;
   static int C;
   static Class_r[] D = new Class_r[100];
   static int[] E = new int[200];
   static Class_r G = Class_tc.a(43, "zap");

   final boolean a(int var1, int var2, int var3) {
      try {
         if (var2 != -9710) {
            a(11, 92, 40, 111, -64, -112, -113);
         }

         u++;
         return var1 >= this.t && this.z >= var1 && ~this.y >= ~var3 && ~this.x <= ~var3;
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "dc.B(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   static final void d(int var0) {
      try {
         Class_ub.bb = 0;
         B++;
         int var1 = (Class_gg.B.hb >> -1474938329) + Class_fj.e;
         if (var0 > -123) {
            a(-46, (byte)115);
         }

         int var2 = Class_va.ab + (Class_gg.B.J >> -2080897113);
         if (var1 >= 3053 && var1 <= 3156 && ~var2 <= -3057 && ~var2 >= -3137) {
            Class_ub.bb = 1;
         }

         if (~var1 <= -3073 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            Class_ub.bb = 1;
         }

         if (Class_ub.bb == 1 && var1 >= 3139 && ~var1 >= -3200 && ~var2 <= -3009 && var2 <= 3062) {
            Class_ub.bb = 0;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "dc.F(" + var0 + ')');
      }
   }

   public static void e(int var0) {
      try {
         D = null;
         q = null;
         if (var0 != 27392) {
            a(41, (byte)-106);
         }

         E = null;
         G = null;
         v = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "dc.C(" + var0 + ')');
      }
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         if (var0 >= 22) {
            int var8 = 0;

            for (Class_d[] var7 = Class_fd.d; ~var7.length < ~var8; var8++) {
               Class_d var9 = var7[var8];
               if (var9 != null && var9.a == 2) {
                  Class_lg.a(
                     var4,
                     var6,
                     var1 >> 1891057889,
                     (-Class_va.ab + var9.d << -1963004729) + var9.o,
                     var9.i * 2,
                     var5 >> 2070267841,
                     (var9.h + -Class_fj.e << 744752135) + var9.n,
                     (byte)-124
                  );
                  if (Class_od.l > -1 && ~(Class_be.C % 20) > -11) {
                     Class_ia.ib[var9.k].c(var3 - -Class_od.l - 12, var2 - (-Class_th.b + 28));
                  }
               }
            }

            w++;
         }
      } catch (RuntimeException var10) {
         throw Class_sh.a(var10, "dc.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, byte var1) {
      int var17 = client.lb;

      try {
         C++;
         Class_hd.d += 128 * var0;
         if (Class_hd.d > Class_fe.I.length) {
            int var3 = (int)(Math.random() * 12.0);
            Class_hd.d = Class_hd.d - Class_fe.I.length;
            Class_oa.a(79, Class_lf.s[var3]);
         }

         short var2 = 256;
         int var4 = var0 * 128;
         int var5 = (var2 + -var0) * 128;
         int var19 = 0;
         int var6 = 0;
         if (var17 != 0 || var6 < var5) {
            do {
               int var7 = Class_pe.A[var4 + var19] + -(Class_fe.I[Class_hd.d + var19 & Class_fe.I.length + -1] * var0 / 6);
               if (~var7 > -1) {
                  var7 = 0;
               }

               Class_pe.A[var19++] = var7;
            } while (++var6 < var5);
         }

         int var20 = var2 + -var0;
         int var8;
         int var9;
         if (var17 != 0) {
            var8 = var20 * 128;
            var9 = 0;
            if (var17 != 0) {
               int var10 = (int)(Math.random() * 100.0);
               if (var10 < 50) {
                  if (var9 > 10) {
                     if (var9 >= 118) {
                        Class_pe.A[var9 - -var8] = 0;
                        if (var17 != 0) {
                           Class_pe.A[var8 + var9] = 255;
                           var9++;
                        } else {
                           var9++;
                        }
                     } else {
                        Class_pe.A[var8 + var9] = 255;
                        var9++;
                     }
                  } else {
                     Class_pe.A[var9 - -var8] = 0;
                     if (var17 != 0) {
                        Class_pe.A[var8 + var9] = 255;
                        var9++;
                     } else {
                        var9++;
                     }
                  }
               } else {
                  Class_pe.A[var9 - -var8] = 0;
                  if (var17 != 0) {
                     Class_pe.A[var8 + var9] = 255;
                     var9++;
                  } else {
                     var9++;
                  }
               }
            }
         } else {
            if (~var20 <= ~var2) {
               if (var1 != 60) {
                  G = null;
               }

               var8 = 0;
               if (var17 != 0 || var8 < -var0 + var2) {
                  do {
                     Class_uf.S[var8] = Class_uf.S[var8 + var0];
                  } while (++var8 < -var0 + var2);
               }

               var9 = var2 - var0;
               if (var17 != 0) {
                  Class_uf.S[var9] = (int)(16.0 * Math.sin(Class_lf.u / 14.0) + 14.0 * Math.sin(Class_lf.u / 15.0) + Math.sin(Class_lf.u / 16.0) * 12.0);
                  Class_lf.u++;
                  var9++;
               }

               while (~var9 > ~var2) {
                  Class_uf.S[var9] = (int)(16.0 * Math.sin(Class_lf.u / 14.0) + 14.0 * Math.sin(Class_lf.u / 15.0) + Math.sin(Class_lf.u / 16.0) * 12.0);
                  Class_lf.u++;
                  var9++;
               }

               Class_th.d += var0;
               int var29 = (var0 - -(Class_be.C & 1)) / 2;
               if (~var29 >= -1) {
                  return;
               }

               int var30 = 0;
               if (var17 != 0) {
                  int var33 = (int)(124.0 * Math.random()) - -2;
                  int var39 = (int)(128.0 * Math.random()) + 128;
                  Class_pe.A[(var39 << -2108211609) + var33] = 192;
                  var30++;
               }

               while (Class_th.d > var30) {
                  int var34 = (int)(124.0 * Math.random()) - -2;
                  int var40 = (int)(128.0 * Math.random()) + 128;
                  Class_pe.A[(var40 << -2108211609) + var34] = 192;
                  var30++;
               }

               Class_th.d = 0;
               int var35 = 0;
               if (var17 != 0 || ~var2 < ~var35) {
                  do {
                     int var41 = 0;
                     int var44 = var35 * 128;
                     int var47 = -var29;
                     if (var17 != 0 || ~var47 > -129) {
                        do {
                           if (var47 - -var29 < 128) {
                              var41 += Class_pe.A[var29 + var44 + var47];
                           }

                           if (var47 + -1 + -var29 >= 0) {
                              var41 -= Class_pe.A[var47 - -var44 + -var29 + -1];
                           }

                           if (var47 >= 0) {
                              Class_pa.s[var47 - -var44] = var41 / (var29 * 2 - -1);
                           }
                        } while (~(++var47) > -129);
                     }
                  } while (~var2 < ~(++var35));
               }

               int var42 = 0;
               if (var17 == 0 && ~var42 <= -129) {
                  return;
               }

               do {
                  int var45 = 0;
                  int var48 = -var29;
                  if (var17 != 0 || ~var2 < ~var48) {
                     do {
                        int var49 = var48 * 128;
                        if (var48 + var29 < var2) {
                           var45 += Class_pa.s[var49 + var42 - -(var29 * 128)];
                        }

                        if (~(var48 + -1 + -var29) <= -1) {
                           var45 -= Class_pa.s[-(128 * var29) - 128 + var49 + var42];
                        }

                        if (~var48 <= -1) {
                           Class_pe.A[var49 + var42] = var45 / (var29 * 2 + 1);
                        }
                     } while (~var2 < ~(++var48));
                  }
               } while (~(++var42) > -129);

               return;
            }

            var8 = var20 * 128;
            var9 = 0;
            if (var17 != 0) {
               int var25 = (int)(Math.random() * 100.0);
               if (var25 < 50) {
                  if (var9 > 10) {
                     if (var9 >= 118) {
                        Class_pe.A[var9 - -var8] = 0;
                        if (var17 != 0) {
                           Class_pe.A[var8 + var9] = 255;
                           var9++;
                        } else {
                           var9++;
                        }
                     } else {
                        Class_pe.A[var8 + var9] = 255;
                        var9++;
                     }
                  } else {
                     Class_pe.A[var9 - -var8] = 0;
                     if (var17 != 0) {
                        Class_pe.A[var8 + var9] = 255;
                        var9++;
                     } else {
                        var9++;
                     }
                  }
               } else {
                  Class_pe.A[var9 - -var8] = 0;
                  if (var17 != 0) {
                     Class_pe.A[var8 + var9] = 255;
                     var9++;
                  } else {
                     var9++;
                  }
               }
            }
         }

         while (true) {
            while (~var9 > -129) {
               int var26 = (int)(Math.random() * 100.0);
               if (var26 < 50) {
                  if (var9 > 10) {
                     if (var9 >= 118) {
                        Class_pe.A[var9 - -var8] = 0;
                        if (var17 != 0) {
                           Class_pe.A[var8 + var9] = 255;
                           var9++;
                        } else {
                           var9++;
                        }
                     } else {
                        Class_pe.A[var8 + var9] = 255;
                        var9++;
                     }
                  } else {
                     Class_pe.A[var9 - -var8] = 0;
                     if (var17 != 0) {
                        Class_pe.A[var8 + var9] = 255;
                        var9++;
                     } else {
                        var9++;
                     }
                  }
               } else {
                  Class_pe.A[var9 - -var8] = 0;
                  if (var17 != 0) {
                     Class_pe.A[var8 + var9] = 255;
                     var9++;
                  } else {
                     var9++;
                  }
               }
            }

            if (~(++var20) <= ~var2) {
               if (var1 != 60) {
                  G = null;
               }

               var8 = 0;
               if (var17 != 0 || var8 < -var0 + var2) {
                  do {
                     Class_uf.S[var8] = Class_uf.S[var8 + var0];
                  } while (++var8 < -var0 + var2);
               }

               var9 = var2 - var0;
               if (var17 != 0) {
                  Class_uf.S[var9] = (int)(16.0 * Math.sin(Class_lf.u / 14.0) + 14.0 * Math.sin(Class_lf.u / 15.0) + Math.sin(Class_lf.u / 16.0) * 12.0);
                  Class_lf.u++;
                  var9++;
               }

               while (~var9 > ~var2) {
                  Class_uf.S[var9] = (int)(16.0 * Math.sin(Class_lf.u / 14.0) + 14.0 * Math.sin(Class_lf.u / 15.0) + Math.sin(Class_lf.u / 16.0) * 12.0);
                  Class_lf.u++;
                  var9++;
               }

               Class_th.d += var0;
               int var28 = (var0 - -(Class_be.C & 1)) / 2;
               if (~var28 >= -1) {
                  return;
               }

               int var11 = 0;
               if (var17 != 0) {
                  int var12 = (int)(124.0 * Math.random()) - -2;
                  int var13 = (int)(128.0 * Math.random()) + 128;
                  Class_pe.A[(var13 << -2108211609) + var12] = 192;
                  var11++;
               }

               while (Class_th.d > var11) {
                  int var31 = (int)(124.0 * Math.random()) - -2;
                  int var36 = (int)(128.0 * Math.random()) + 128;
                  Class_pe.A[(var36 << -2108211609) + var31] = 192;
                  var11++;
               }

               Class_th.d = 0;
               int var32 = 0;
               if (var17 != 0 || ~var2 < ~var32) {
                  do {
                     int var37 = 0;
                     int var14 = var32 * 128;
                     int var15 = -var28;
                     if (var17 != 0 || ~var15 > -129) {
                        do {
                           if (var15 - -var28 < 128) {
                              var37 += Class_pe.A[var28 + var14 + var15];
                           }

                           if (var15 + -1 + -var28 >= 0) {
                              var37 -= Class_pe.A[var15 - -var14 + -var28 + -1];
                           }

                           if (var15 >= 0) {
                              Class_pa.s[var15 - -var14] = var37 / (var28 * 2 - -1);
                           }
                        } while (~(++var15) > -129);
                     }
                  } while (~var2 < ~(++var32));
               }

               int var38 = 0;
               if (var17 == 0 && ~var38 <= -129) {
                  return;
               }

               do {
                  int var43 = 0;
                  int var46 = -var28;
                  if (var17 != 0 || ~var2 < ~var46) {
                     do {
                        int var16 = var46 * 128;
                        if (var46 + var28 < var2) {
                           var43 += Class_pa.s[var16 + var38 - -(var28 * 128)];
                        }

                        if (~(var46 + -1 + -var28) <= -1) {
                           var43 -= Class_pa.s[-(128 * var28) - 128 + var16 + var38];
                        }

                        if (~var46 <= -1) {
                           Class_pe.A[var16 + var38] = var43 / (var28 * 2 + 1);
                        }
                     } while (~var2 < ~(++var46));
                  }
               } while (~(++var38) > -129);

               return;
            }

            var8 = var20 * 128;
            var9 = 0;
            if (var17 != 0) {
               int var27 = (int)(Math.random() * 100.0);
               if (var27 < 50) {
                  if (var9 > 10) {
                     if (var9 >= 118) {
                        Class_pe.A[var9 - -var8] = 0;
                        if (var17 != 0) {
                           Class_pe.A[var8 + var9] = 255;
                           var9++;
                        } else {
                           var9++;
                        }
                     } else {
                        Class_pe.A[var8 + var9] = 255;
                        var9++;
                     }
                  } else {
                     Class_pe.A[var9 - -var8] = 0;
                     if (var17 != 0) {
                        Class_pe.A[var8 + var9] = 255;
                        var9++;
                     } else {
                        var9++;
                     }
                  }
               } else {
                  Class_pe.A[var9 - -var8] = 0;
                  if (var17 != 0) {
                     Class_pe.A[var8 + var9] = 255;
                     var9++;
                  } else {
                     var9++;
                  }
               }
            }
         }
      } catch (RuntimeException var18) {
         throw Class_sh.a(var18, "dc.E(" + var0 + ',' + var1 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(Class_fa var0, int var1, int var2, int var3, int var4) {
      int var9 = client.lb;

      try {
         A++;
         if (Class_gg.B != var0) {
            if (var1 > -56) {
               E = null;
            }

            if (~Class_ma.ib > -401) {
               Class_r var5;
               label108: {
                  if (~var0.Rb != -1) {
                     var5 = Class_o.a(2, new Class_r[]{var0.f(3000), Class_oi.q, Class_ud.h, Class_og.b(var0.Rb, 0), Class_vg.G});
                     if (var9 == 0) {
                        break label108;
                     }
                  }

                  var5 = Class_o.a(
                     2, new Class_r[]{var0.f(3000), Class_gj.a(var0.ac, true, Class_gg.B.ac), Class_oi.q, Class_jf.i, Class_og.b(var0.ac, 0), Class_vg.G}
                  );
               }

               label117: {
                  if (~Class_vh.cb == -2) {
                     Class_be.a(var2, var3, (byte)-124, Class_o.a(2, new Class_r[]{Class_h.b, Class_o.bb, var5}), (short)2, Class_mk.c, var4);
                     Class_de.e++;
                     if (var9 == 0) {
                        break label117;
                     }
                  }

                  if (Class_sg.tb) {
                     if ((Class_fb.o & 8) != 8) {
                        break label117;
                     }

                     Class_fb.a++;
                     Class_be.a(var2, var3, (byte)-85, Class_o.a(2, new Class_r[]{Class_ab.U, Class_o.bb, var5}), (short)50, Class_aj.b, var4);
                     if (var9 == 0) {
                        break label117;
                     }
                  }

                  int var6 = 7;
                  if (var9 != 0 || var6 >= 0) {
                     do {
                        if (Class_wg.f[var6] == null) {
                           var6--;
                        } else {
                           short var7;
                           label79: {
                              var7 = 0;
                              if (Class_u.W == 0 && Class_wg.f[var6].a(false, Class_eb.b)) {
                                 if (Class_gg.B.ac < var0.ac) {
                                    var7 = 2000;
                                 }

                                 if (~Class_gg.B.qc == -1 || var0.qc == 0) {
                                    break label79;
                                 }

                                 if (Class_gg.B.qc == var0.qc) {
                                    var7 = 2000;
                                    if (var9 == 0) {
                                       break label79;
                                    }
                                 }

                                 var7 = 0;
                                 if (var9 == 0) {
                                    break label79;
                                 }
                              }

                              if (Class_ud.f[var6]) {
                                 var7 = 2000;
                              }
                           }

                           short var8 = 0;
                           Class_fi.v++;
                           var8 = Class_sj.c[var6];
                           var8 = (short)(var8 + var7);
                           Class_be.a(var2, var3, (byte)-56, Class_o.a(2, new Class_r[]{Class_li.f, var5}), var8, Class_wg.f[var6], var4);
                           var6--;
                        }
                     } while (var6 >= 0);
                  }
               }

               int var11 = 0;
               if (var9 != 0 || var11 < Class_ma.ib) {
                  while (~Class_dd.I[var11] != -6) {
                     if (++var11 >= Class_ma.ib) {
                        return;
                     }
                  }

                  Class_fb.h[var11] = Class_o.a(2, new Class_r[]{Class_li.f, var5});
               }
            }
         }
      } catch (RuntimeException var10) {
         throw Class_sh.a(var10, "dc.D(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
      }
   }

   Class_dc(int var1, int var2, int var3, int var4) {
      try {
         this.y = var2;
         this.t = var1;
         this.z = var3;
         this.x = var4;
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "dc.<init>(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
      }
   }
}
