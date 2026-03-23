final class Class_kg extends Class_li {
   static Class_r p = Class_tc.a(43, "::clientdrop");
   static Class_r q = Class_tc.a(43, "loginscreen");
   int r;
   static boolean s = false;
   static int t;
   static boolean[] u;
   static int[] v = new int[32768];
   static Class_cj w;
   static int x = 0;
   static int y = 0;
   static int z;
   static int A = -1;
   static Class_lb B;
   static int C;
   static Class_ei D;

   static final void a(int var0, int var1, int var2, int var3, int var4, byte var5) {
      try {
         z++;
         if (var5 < 79) {
            v = null;
         }

         long var6 = Class_sh.a(var0, var2, var4);
         if (~var6 != -1L) {
            int var8 = ((int)var6 & 4038692) >> -920493132;
            int var9 = 31 & (int)var6 >> -1013963858;
            int[] var11 = Class_nc.f;
            int var10 = var1;
            int var13 = (int)(var6 >>> -315819104) & 2147483647;
            int var12 = 4 * (-(var4 * 512) + 52736) + 4 * var2 + 24624;
            if (var6 > 0L) {
               var10 = var3;
            }

            Class_ub var14 = Class_qe.a(106, var13);
            if (~var14.o == 0) {
               if (var9 == 0 || var9 == 2) {
                  if (var8 == 0) {
                     var11[var12] = var10;
                     var11[var12 + 512] = var10;
                     var11[1024 + var12] = var10;
                     var11[1536 + var12] = var10;
                  } else if (~var8 == -2) {
                     var11[var12] = var10;
                     var11[var12 + 1] = var10;
                     var11[var12 + 2] = var10;
                     var11[3 + var12] = var10;
                  } else if (var8 == 2) {
                     var11[var12 - -3] = var10;
                     var11[3 + var12 + 512] = var10;
                     var11[3 + var12 + 1024] = var10;
                     var11[1536 + (var12 - -3)] = var10;
                  } else if (var8 == 3) {
                     var11[var12 + 1536] = var10;
                     var11[var12 + 1536 + 1] = var10;
                     var11[2 + var12 + 1536] = var10;
                     var11[var12 + 1539] = var10;
                  }
               }

               if (~var9 == -4) {
                  if (~var8 != -1) {
                     if (var8 != 1) {
                        if (~var8 == -3) {
                           var11[3 + var12 - -1536] = var10;
                        } else if (~var8 == -4) {
                           var11[1536 + var12] = var10;
                        }
                     } else {
                        var11[var12 + 3] = var10;
                     }
                  } else {
                     var11[var12] = var10;
                  }
               }

               if (var9 == 2) {
                  if (var8 != 3) {
                     if (var8 != 0) {
                        if (~var8 == -2) {
                           var11[var12 + 3] = var10;
                           var11[var12 + 515] = var10;
                           var11[1024 + var12 + 3] = var10;
                           var11[var12 - -1539] = var10;
                        } else if (var8 == 2) {
                           var11[1536 + var12] = var10;
                           var11[1 + var12 + 1536] = var10;
                           var11[1538 + var12] = var10;
                           var11[1536 + (var12 - -3)] = var10;
                        }
                     } else {
                        var11[var12] = var10;
                        var11[var12 + 1] = var10;
                        var11[2 + var12] = var10;
                        var11[3 + var12] = var10;
                     }
                  } else {
                     var11[var12] = var10;
                     var11[var12 - -512] = var10;
                     var11[var12 + 1024] = var10;
                     var11[1536 + var12] = var10;
                  }
               }
            } else {
               Class_dh var15 = null;
               if (var14.hb) {
                  if (~var8 == -1) {
                     var15 = Class_sc.e[var14.o];
                  } else if (var8 == 1) {
                     var15 = Class_tc.j[var14.o];
                  } else if (~var8 != -3) {
                     if (~var8 == -4) {
                        var15 = Class_w.I[var14.o];
                     }
                  } else {
                     var15 = Class_ld.W[var14.o];
                  }
               } else {
                  var15 = Class_sc.e[var14.o];
               }

               if (var15 != null) {
                  int var16 = (var14.D * 4 - var15.p) / 2;
                  int var17 = (-var15.o + var14.C * 4) / 2;
                  var15.a(var16 + 4 * var2 + 48, (-var14.C + -var4 + 104) * 4 + 48 + var17);
               }
            }
         }

         var6 = Class_fk.d(var0, var2, var4);
         if (~var6 != -1L) {
            int var21 = 3 & (int)var6 >> 1603407924;
            int var23 = (int)var6 >> 1977078766 & 31;
            int var25 = (int)(var6 >>> -1604026208) & 2147483647;
            Class_ub var27 = Class_qe.a(127, var25);
            if (~var27.o == 0) {
               if (var23 == 9) {
                  int[] var32 = Class_nc.f;
                  int var29 = 15658734;
                  if (~var6 < -1L) {
                     var29 = 15597568;
                  }

                  int var35 = 4 * (-var4 + 103) * 512 + 4 * var2 + 24624;
                  if (var21 != 0 && var21 != 2) {
                     var32[var35] = var29;
                     var32[1 + var35 - -512] = var29;
                     var32[1026 + var35] = var29;
                     var32[var35 + 1539] = var29;
                  } else {
                     var32[1536 + var35] = var29;
                     var32[1 + var35 + 1024] = var29;
                     var32[512 + var35 + 2] = var29;
                     var32[var35 + 3] = var29;
                  }
               }
            } else {
               Class_dh var30 = null;
               if (var27.hb) {
                  if (var21 == 0) {
                     var30 = Class_sc.e[var27.o];
                  } else if (var21 != 1) {
                     if (var21 != 2) {
                        if (var21 == 3) {
                           var30 = Class_w.I[var27.o];
                        }
                     } else {
                        var30 = Class_ld.W[var27.o];
                     }
                  } else {
                     var30 = Class_tc.j[var27.o];
                  }
               } else {
                  var30 = Class_sc.e[var27.o];
               }

               if (var30 != null) {
                  int var36 = (4 * var27.C - var30.o) / 2;
                  int var33 = (var27.D * 4 - var30.p) / 2;
                  var30.a(var33 + 48 + var2 * 4, var36 + 48 + 4 * (104 - (var4 - -var27.C)));
               }
            }
         }

         var6 = Class_p.b(var0, var2, var4);
         if (~var6 != -1L) {
            int var22 = ((int)var6 & 4162483) >> 2052673076;
            int var24 = (int)(var6 >>> 2064286688) & 2147483647;
            Class_ub var26 = Class_qe.a(82, var24);
            if (~var26.o != 0) {
               Class_dh var28 = null;
               if (!var26.hb) {
                  var28 = Class_sc.e[var26.o];
               } else if (~var22 == -1) {
                  var28 = Class_sc.e[var26.o];
               } else if (var22 != 1) {
                  if (~var22 == -3) {
                     var28 = Class_ld.W[var26.o];
                  } else if (var22 == 3) {
                     var28 = Class_w.I[var26.o];
                  }
               } else {
                  var28 = Class_tc.j[var26.o];
               }

               if (var28 != null) {
                  int var34 = (var26.C * 4 - var28.o) / 2;
                  int var31 = (-var28.p + var26.D * 4) / 2;
                  var28.a(var31 + 48 + 4 * var2, var34 + 48 - -(4 * (-var26.C + -var4 + 104)));
                  return;
               }
            }
         }
      } catch (RuntimeException var18) {
         throw Class_sh.a(var18, "kg.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
      }
   }

   public static void d(int var0) {
      try {
         p = null;
         D = null;
         w = null;
         q = null;
         B = null;
         u = null;
         if (var0 == 0) {
            v = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "kg.C(" + var0 + ')');
      }
   }

   public Class_kg() {
   }

   Class_kg(int var1) {
      try {
         this.r = var1;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "kg.<init>(" + var1 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(byte var0) {
      int var5 = client.lb;

      try {
         C++;
         int var1 = -69 / ((var0 - -65) / 61);
         if (Class_ud.e == null || Class_nb.h == null) {
            Class_ud.e = new int[256];
            Class_nb.h = new int[256];
            int var2 = 0;
            if (var5 != 0 || ~var2 > -257) {
               do {
                  double var3 = var2 / 255.0 * 6.283185307179586;
                  Class_ud.e[var2] = (int)(Math.sin(var3) * 4096.0);
                  Class_nb.h[var2] = (int)(Math.cos(var3) * 4096.0);
               } while (~(++var2) > -257);
            }
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "kg.D(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void e(int var0) {
      int var13 = client.lb;

      try {
         t++;
         if (var0 == ~Class_gg.d(1)) {
            byte var1 = (byte)(0xFF & Class_ad.l + -4);
            int var2 = Class_ad.l % 104;
            int var3 = 0;
            int var4;
            if (var13 != 0) {
               var4 = 0;
               if (var13 != 0) {
                  Class_pe.F[var3][var2][var4] = var1;
                  var4++;
               }
            } else {
               if (var3 >= 4) {
                  if (Class_jk.F == 3) {
                     return;
                  }

                  var4 = 0;
                  if (var13 != 0) {
                     Class_sg.hb[var4] = -1000000;
                     Class_wf.a[var4] = 1000000;
                     Class_aj.r[var4] = 0;
                     Class_uf.K[var4] = 1000000;
                     Class_nj.n[var4] = 0;
                     var4++;
                  }

                  while (~var4 > -3) {
                     Class_sg.hb[var4] = -1000000;
                     Class_wf.a[var4] = 1000000;
                     Class_aj.r[var4] = 0;
                     Class_uf.K[var4] = 1000000;
                     Class_nj.n[var4] = 0;
                     var4++;
                  }

                  if (~Class_wh.c == -2) {
                     if (~(4 & Class_kk.c[Class_jk.F][Class_gg.B.hb >> -551140089][Class_gg.B.J >> 729418503]) != -1) {
                        Class_rj.a(false, Class_ck.d, Class_gg.B.J >> -1252316761, Class_gg.B.hb >> -16710521, 0, (byte)-125);
                     }

                     if (Class_hc.a < 310) {
                        int var19;
                        int var20;
                        int var21;
                        int var22;
                        int var23;
                        label196: {
                           var21 = Class_gg.B.hb >> 607803239;
                           var20 = Class_oc.l >> -1080666425;
                           var22 = Class_gg.B.J >> -1840153689;
                           var19 = Class_gg.D >> -78823161;
                           if (var21 <= var19) {
                              var23 = var19 + -var21;
                              if (var13 == 0) {
                                 break label196;
                              }
                           }

                           var23 = -var19 + var21;
                        }

                        int var24;
                        label203: {
                           if (var22 <= var20) {
                              var24 = -var22 + var20;
                              if (var13 == 0) {
                                 break label203;
                              }
                           }

                           var24 = -var20 + var22;
                        }

                        if (~var24 <= ~var23) {
                           int var27 = var23 * 65536 / var24;
                           int var30 = 32768;
                           if (var13 == 0 && var20 == var22) {
                              return;
                           }

                           do {
                              if (~var20 > ~var22) {
                                 if (var13 != 0 && ++var20 > var22) {
                                    var20--;
                                 }
                              } else if (var20 > var22) {
                                 var20--;
                              }

                              if (~(4 & Class_kk.c[Class_jk.F][var19][var20]) != -1) {
                                 Class_rj.a(false, Class_ck.d, var20, var19, 1, (byte)-79);
                                 return;
                              }

                              var30 += var27;
                              if (var30 >= 65536) {
                                 label241: {
                                    if (~var19 > ~var21) {
                                       var19++;
                                       if (var13 == 0) {
                                          break label241;
                                       }
                                    }

                                    if (~var19 < ~var21) {
                                       var19--;
                                    }
                                 }

                                 var30 -= 65536;
                                 if ((Class_kk.c[Class_jk.F][var19][var20] & 4) != 0) {
                                    Class_rj.a(false, Class_ck.d, var20, var19, 1, (byte)-113);
                                    return;
                                 }
                              }
                           } while (var20 != var22);

                           return;
                        }

                        int var29 = 32768;
                        int var26 = 65536 * var24 / var23;
                        if (var13 == 0 && var19 == var21) {
                           return;
                        }

                        do {
                           label261: {
                              if (var21 > var19) {
                                 var19++;
                                 if (var13 == 0) {
                                    break label261;
                                 }
                              }

                              if (var19 > var21) {
                                 var19--;
                              }
                           }

                           if ((4 & Class_kk.c[Class_jk.F][var19][var20]) != 0) {
                              Class_rj.a(false, Class_ck.d, var20, var19, 1, (byte)104);
                              return;
                           }

                           var29 += var26;
                           if (var29 >= 65536) {
                              var29 -= 65536;
                              if (~var20 <= ~var22) {
                                 if (var20 > var22) {
                                    var20--;
                                    if (var13 != 0) {
                                       var20++;
                                    }
                                 }
                              } else {
                                 var20++;
                              }

                              if ((Class_kk.c[Class_jk.F][var19][var20] & 4) != 0) {
                                 Class_rj.a(false, Class_ck.d, var20, var19, 1, (byte)62);
                                 return;
                              }
                           }
                        } while (var19 != var21);

                        return;
                     }
                  } else {
                     int var18 = Class_fa.a(Class_gg.D, Class_jk.F, Class_oc.l, false);
                     if (var18 + -Class_ef.s >= 800 || (4 & Class_kk.c[Class_jk.F][Class_gg.D >> 1691754311][Class_oc.l >> 1757676263]) == 0) {
                        return;
                     }

                     Class_rj.a(false, Class_ck.d, Class_oc.l >> -576111289, Class_gg.D >> 35118439, 1, (byte)-109);
                  }

                  return;
               }

               var4 = 0;
               if (var13 != 0) {
                  Class_pe.F[var3][var2][var4] = var1;
                  var4++;
               }
            }

            while (true) {
               while (~var4 > -105) {
                  Class_pe.F[var3][var2][var4] = var1;
                  var4++;
               }

               if (++var3 >= 4) {
                  if (Class_jk.F == 3) {
                     return;
                  }

                  var4 = 0;
                  if (var13 != 0) {
                     Class_sg.hb[var4] = -1000000;
                     Class_wf.a[var4] = 1000000;
                     Class_aj.r[var4] = 0;
                     Class_uf.K[var4] = 1000000;
                     Class_nj.n[var4] = 0;
                     var4++;
                  }

                  while (~var4 > -3) {
                     Class_sg.hb[var4] = -1000000;
                     Class_wf.a[var4] = 1000000;
                     Class_aj.r[var4] = 0;
                     Class_uf.K[var4] = 1000000;
                     Class_nj.n[var4] = 0;
                     var4++;
                  }

                  if (~Class_wh.c == -2) {
                     if (~(4 & Class_kk.c[Class_jk.F][Class_gg.B.hb >> -551140089][Class_gg.B.J >> 729418503]) != -1) {
                        Class_rj.a(false, Class_ck.d, Class_gg.B.J >> -1252316761, Class_gg.B.hb >> -16710521, 0, (byte)-125);
                     }

                     if (Class_hc.a < 310) {
                        int var6;
                        int var7;
                        int var8;
                        int var9;
                        int var17;
                        label136: {
                           var7 = Class_gg.B.hb >> 607803239;
                           var6 = Class_oc.l >> -1080666425;
                           var8 = Class_gg.B.J >> -1840153689;
                           var17 = Class_gg.D >> -78823161;
                           if (var7 <= var17) {
                              var9 = var17 + -var7;
                              if (var13 == 0) {
                                 break label136;
                              }
                           }

                           var9 = -var17 + var7;
                        }

                        int var10;
                        label131: {
                           if (var8 <= var6) {
                              var10 = -var8 + var6;
                              if (var13 == 0) {
                                 break label131;
                              }
                           }

                           var10 = -var6 + var8;
                        }

                        if (~var10 <= ~var9) {
                           int var25 = var9 * 65536 / var10;
                           int var28 = 32768;
                           if (var13 == 0 && var6 == var8) {
                              return;
                           }

                           do {
                              if (~var6 > ~var8) {
                                 if (var13 != 0 && ++var6 > var8) {
                                    var6--;
                                 }
                              } else if (var6 > var8) {
                                 var6--;
                              }

                              if (~(4 & Class_kk.c[Class_jk.F][var17][var6]) != -1) {
                                 Class_rj.a(false, Class_ck.d, var6, var17, 1, (byte)-79);
                                 return;
                              }

                              var28 += var25;
                              if (var28 >= 65536) {
                                 label99: {
                                    if (~var17 > ~var7) {
                                       var17++;
                                       if (var13 == 0) {
                                          break label99;
                                       }
                                    }

                                    if (~var17 < ~var7) {
                                       var17--;
                                    }
                                 }

                                 var28 -= 65536;
                                 if ((Class_kk.c[Class_jk.F][var17][var6] & 4) != 0) {
                                    Class_rj.a(false, Class_ck.d, var6, var17, 1, (byte)-113);
                                    return;
                                 }
                              }
                           } while (var6 != var8);

                           return;
                        }

                        int var12 = 32768;
                        int var11 = 65536 * var10 / var9;
                        if (var13 == 0 && var17 == var7) {
                           return;
                        }

                        do {
                           label123: {
                              if (var7 > var17) {
                                 var17++;
                                 if (var13 == 0) {
                                    break label123;
                                 }
                              }

                              if (var17 > var7) {
                                 var17--;
                              }
                           }

                           if ((4 & Class_kk.c[Class_jk.F][var17][var6]) != 0) {
                              Class_rj.a(false, Class_ck.d, var6, var17, 1, (byte)104);
                              return;
                           }

                           var12 += var11;
                           if (var12 >= 65536) {
                              var12 -= 65536;
                              if (~var6 <= ~var8) {
                                 if (var6 > var8) {
                                    var6--;
                                    if (var13 != 0) {
                                       var6++;
                                    }
                                 }
                              } else {
                                 var6++;
                              }

                              if ((Class_kk.c[Class_jk.F][var17][var6] & 4) != 0) {
                                 Class_rj.a(false, Class_ck.d, var6, var17, 1, (byte)62);
                                 return;
                              }
                           }
                        } while (var17 != var7);

                        return;
                     }
                  } else {
                     int var5 = Class_fa.a(Class_gg.D, Class_jk.F, Class_oc.l, false);
                     if (var5 + -Class_ef.s >= 800 || (4 & Class_kk.c[Class_jk.F][Class_gg.D >> 1691754311][Class_oc.l >> 1757676263]) == 0) {
                        return;
                     }

                     Class_rj.a(false, Class_ck.d, Class_oc.l >> -576111289, Class_gg.D >> 35118439, 1, (byte)-109);
                  }

                  return;
               }

               var4 = 0;
               if (var13 != 0) {
                  Class_pe.F[var3][var2][var4] = var1;
                  var4++;
               }
            }
         }
      } catch (RuntimeException var14) {
         throw Class_sh.a(var14, "kg.B(" + var0 + ')');
      }
   }
}
