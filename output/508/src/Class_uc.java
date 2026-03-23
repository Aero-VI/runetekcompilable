import java.awt.Component;

final class Class_uc {
   static int a;
   int b;
   int[][] c;
   int[] d;
   static Class_lb e;
   int f;
   static Class_sg g;
   int h;
   static int i;
   static int j;
   static int[] k;
   int l;
   static int m;
   private static Class_r n = Class_tc.a(43, "purple:");
   static int o;
   int p = -1;
   private int[] q;
   static int r;
   private int[] s;
   int t;
   static Class_r u = Class_tc.a(43, "details");
   static Class_r v = Class_uc.N;
   boolean w;
   static int x = 0;
   private boolean y;
   static int z;
   int[] A;
   static Class_r C = n;
   static int D;
   int E;
   static int F;
   static Class_r G = n;
   static Class_r H = Class_tc.a(43, "hint_mapedge");
   static int I;
   static int J;
   static Class_r[] K = new Class_r[100];
   static int L;
   static int M;
   private static Class_r N = Class_tc.a(43, "Please wait )2 attempting to reestablish)3");
   static byte O;
   int P;

   final Class_jh a(Class_jh var1, int var2, int var3) {
      try {
         var3 = this.d[var3];
         I++;
         Class_w var4 = Class_ff.a(var3 >> -1413375280, (byte)-40);
         var3 &= 65535;
         if (var4 == null) {
            return var1.a(true, true);
         } else {
            Class_jh var5 = var1.a(!var4.a(true, var3), !this.y);
            if (var2 != 8493) {
               this.b = 85;
            }

            var5.a(var4, var3, this.y);
            return var5;
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "uc.C(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   static final Class_ff a(Class_ik var0, byte var1, Component var2, int var3, int var4) {
      try {
         M++;
         if (Class_pd.a == 0) {
            throw new IllegalStateException();
         } else if (~var4 <= -1 && ~var4 > -3) {
            if (~var3 > -257) {
               var3 = 256;
            }

            try {
               Class_ff var9 = (Class_ff)Class.forName("gh").newInstance();
               var9.x = new int[256 * (Class_aj.p ? 2 : 1)];
               var9.E = var3;
               var9.a(var2);
               var9.I = (var3 & -1024) + 1024;
               if (~var9.I < -16385) {
                  var9.I = 16384;
               }

               var9.a(var9.I);
               if (~Class_ek.a < -1 && Class_h.a == null) {
                  Class_h.a = new Class_wb();
                  Class_h.a.b = var0;
                  var0.a((byte)-125, Class_ek.a, Class_h.a);
               }

               if (Class_h.a != null) {
                  if (Class_h.a.j[var4] != null) {
                     throw new IllegalArgumentException();
                  }

                  Class_h.a.j[var4] = var9;
               }

               return var9;
            } catch (Throwable var7) {
               try {
                  Class_ej var5 = new Class_ej(var0, var4);
                  if (var1 != 104) {
                     return null;
                  } else {
                     var5.E = var3;
                     var5.x = new int[(Class_aj.p ? 2 : 1) * 256];
                     var5.a(var2);
                     var5.I = 16384;
                     var5.a(var5.I);
                     if (~Class_ek.a < -1 && Class_h.a == null) {
                        Class_h.a = new Class_wb();
                        Class_h.a.b = var0;
                        var0.a((byte)-117, Class_ek.a, Class_h.a);
                     }

                     if (Class_h.a != null) {
                        if (Class_h.a.j[var4] != null) {
                           throw new IllegalArgumentException();
                        }

                        Class_h.a.j[var4] = var5;
                     }

                     return var5;
                  }
               } catch (Throwable var6) {
                  return new Class_ff();
               }
            }
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var8) {
         throw Class_sh.a(
            var8, "uc.B(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + var4 + ')'
         );
      }
   }

   public static void a(int var0) {
      try {
         v = null;
         g = null;
         e = null;
         k = null;
         C = null;
         H = null;
         if (var0 == 31891) {
            n = null;
            K = null;
            N = null;
            u = null;
            G = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "uc.G(" + var0 + ')');
      }
   }

   final Class_jh a(int var1, boolean var2, Class_jh var3) {
      try {
         F++;
         var1 = this.d[var1];
         Class_w var4 = Class_ff.a(var1 >> 2136200336, (byte)-89);
         var1 &= 65535;
         if (var4 == null) {
            return var3.b(true, true);
         } else {
            Class_jh var5 = var3.b(!var4.a(var2, var1), !this.y);
            var5.a(var4, var1, this.y);
            return var5;
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "uc.F(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
      }
   }

   static final void a(int var0, int var1, Class_fa var2, int var3) {
      try {
         if (var1 == 0) {
            m++;
            if (~var3 == ~var2.ob && var3 != -1) {
               Class_uc var4 = Class_kk.a((byte)-36, var3);
               int var5 = var4.E;
               if (var5 == 1) {
                  var2.V = 0;
                  var2.cb = 0;
                  var2.u = 0;
                  var2.R = var0;
                  Class_h.a(false, var2.u, var2.hb, var4, Class_gg.B == var2, var2.J);
               }

               if (var5 == 2) {
                  var2.V = 0;
                  return;
               }
            } else {
               if (var3 != -1 && var2.ob != -1 && ~Class_kk.a((byte)-36, var3).t > ~Class_kk.a((byte)-36, var2.ob).t) {
                  return;
               }

               var2.ob = var3;
               var2.u = 0;
               var2.V = 0;
               var2.cb = 0;
               var2.R = var0;
               var2.db = var2.zb;
               if (var2.ob != -1) {
                  Class_h.a(false, var2.u, var2.hb, Class_kk.a((byte)-36, var2.ob), var2 == Class_gg.B, var2.J);
                  return;
               }
            }
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "uc.N(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
      }
   }

   static final int a(int var0, int var1) {
      try {
         r++;
         if (var0 != 1) {
            k = null;
         }

         if ((~var1 > -66 || var1 > 90) && (var1 < 192 || ~var1 < -223 || ~var1 == -216)) {
            if (var1 == 159) {
               return 255;
            } else {
               return var1 == 140 ? 156 : var1;
            }
         } else {
            return var1 + 32;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "uc.E(" + var0 + 44 + var1 + 41);
      }
   }

   final Class_jh a(byte var1, Class_jh var2, int var3) {
      try {
         J++;
         int var4 = this.d[var3];
         Class_w var5 = Class_ff.a(var4 >> -1391172048, (byte)-94);
         var4 &= 65535;
         if (var5 == null) {
            return var2.b(true, true);
         } else {
            Class_w var6 = null;
            int var7 = 0;
            if (this.q != null && ~this.q.length < ~var3) {
               var7 = this.q[var3];
               var6 = Class_ff.a(var7 >> 1301424848, (byte)-48);
               var7 &= 65535;
            }

            if (var6 != null && ~var7 != -65536) {
               int var9 = -27 % ((var1 - -5) / 51);
               Class_jh var13 = var2.b(!var5.a(true, var4) & !var6.a(true, var7), !this.y);
               var13.a(var5, var4, this.y);
               var13.a(var6, var7, this.y);
               return var13;
            } else {
               Class_jh var8 = var2.b(!var5.a(true, var4), !this.y);
               var8.a(var5, var4, this.y);
               return var8;
            }
         }
      } catch (RuntimeException var10) {
         throw Class_sh.a(var10, "uc.I(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
      }
   }

   private final void a(Class_lh var1, int var2, int var3) {
      try {
         if (~var2 == -2) {
            int var4 = var1.k(var3 + 1355778338);
            this.A = new int[var4];

            for (int var5 = 0; ~var5 > ~var4; var5++) {
               this.A[var5] = var1.k(Class_bj.a(var3, -1355760786));
            }

            this.d = new int[var4];

            for (int var6 = 0; var4 > var6; var6++) {
               this.d[var6] = var1.k(1355769544);
            }

            for (int var7 = 0; var4 > var7; var7++) {
               this.d[var7] = (var1.k(1355769544) << -1074992464) + this.d[var7];
            }
         } else if (var2 != 2) {
            if (var2 == 3) {
               int var9 = var1.n(-6677);
               this.s = new int[var9 - -1];

               for (int var12 = 0; var9 > var12; var12++) {
                  this.s[var12] = var1.n(-6677);
               }

               this.s[var9] = 9999999;
            } else if (var2 != 4) {
               if (var2 != 5) {
                  if (~var2 != -7) {
                     if (~var2 != -8) {
                        if (~var2 != -9) {
                           if (var2 != 9) {
                              if (~var2 == -11) {
                                 this.h = var1.n(-6677);
                              } else if (~var2 != -12) {
                                 if (var2 == 12) {
                                    int var10 = var1.n(var3 ^ 14413);
                                    this.q = new int[var10];

                                    for (int var13 = 0; var10 > var13; var13++) {
                                       this.q[var13] = var1.k(1355769544);
                                    }

                                    for (int var15 = 0; ~var10 < ~var15; var15++) {
                                       this.q[var15] = (var1.k(1355769544) << 1693894864) + this.q[var15];
                                    }
                                 } else if (var2 != 13) {
                                    if (~var2 == -15) {
                                       this.y = true;
                                    }
                                 } else {
                                    int var11 = var1.k(1355769544);
                                    this.c = new int[var11][];

                                    for (int var14 = 0; ~var14 > ~var11; var14++) {
                                       int var16 = var1.n(-6677);
                                       if (~var16 < -1) {
                                          this.c[var14] = new int[var16];
                                          this.c[var14][0] = var1.b((byte)-97);

                                          for (int var17 = 1; var16 > var17; var17++) {
                                             this.c[var14][var17] = var1.k(1355769544);
                                          }
                                       }
                                    }
                                 }
                              } else {
                                 this.E = var1.n(var3 + 2117);
                              }
                           } else {
                              this.l = var1.n(-6677);
                           }
                        } else {
                           this.f = var1.n(var3 ^ 14413);
                        }
                     } else {
                        this.b = var1.k(1355769544);
                     }
                  } else {
                     this.p = var1.k(1355769544);
                  }
               } else {
                  this.t = var1.n(-6677);
               }
            } else {
               this.w = true;
            }
         } else {
            this.P = var1.k(var3 ^ -1355760786);
         }

         if (var3 == -8794) {
            a++;
         }
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "uc.J(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   static final void a(int var0, int var1, boolean var2, int var3, int var4, int var5, int[] var6, int var7, int var8, int var9, int var10) {
      try {
         int var11 = var7;
         D++;
         if (var7 < Class_nc.b) {
            if (~var7 > ~Class_nc.d) {
               var11 = Class_nc.d;
            }

            int var12 = var7 - -var1;
            if (~Class_nc.d > ~var12) {
               int var13 = var8;
               if (~Class_nc.b > ~var12) {
                  var12 = Class_nc.b;
               }

               if (~Class_nc.h < ~var8) {
                  int var14 = var3 + var8;
                  if (~var8 > ~Class_nc.g) {
                     var13 = Class_nc.g;
                  }

                  if (~var14 < ~Class_nc.g) {
                     if (var14 > Class_nc.h) {
                        var14 = Class_nc.h;
                     }

                     var14 -= var8;
                     if (~var0 == -10) {
                        var9 = 3 & var9 + 1;
                        var0 = 1;
                     }

                     if (var10 != 2) {
                        a(-121);
                     }

                     int var15 = var13 * Class_nc.e + var11;
                     if (~var0 == -11) {
                        var9 = 3 & var9 - -3;
                        var0 = 1;
                     }

                     var13 -= var8;
                     if (~var0 == -12) {
                        var0 = 8;
                        var9 = 3 + var9 & 3;
                     }

                     int var16 = Class_nc.e + var11 + -var12;
                     var11 -= var7;
                     var12 -= var7;
                     int var17 = -var12 + var1;
                     int var18 = -var11 + var1;
                     int var19 = -var14 + var3;
                     int var20 = var3 + -var13;
                     if (var0 == 1) {
                        if (var9 == 0) {
                           for (int var58 = var13; var58 < var14; var58++) {
                              for (int var89 = var11; var12 > var89; var89++) {
                                 if (~var58 <= ~var89) {
                                    var6[var15] = var5;
                                 } else if (var2) {
                                    var6[var15] = var4;
                                 }

                                 var15++;
                              }

                              var15 += var16;
                           }
                        } else if (~var9 == -2) {
                           for (int var57 = -1 + var20; var57 >= var19; var57--) {
                              for (int var88 = var11; var88 < var12; var88++) {
                                 if (~var88 < ~var57) {
                                    if (var2) {
                                       var6[var15] = var4;
                                    }
                                 } else {
                                    var6[var15] = var5;
                                 }

                                 var15++;
                              }

                              var15 += var16;
                           }
                        } else if (~var9 == -3) {
                           for (int var56 = var13; ~var14 < ~var56; var56++) {
                              for (int var87 = var11; var87 < var12; var87++) {
                                 if (~var87 <= ~var56) {
                                    var6[var15] = var5;
                                 } else if (var2) {
                                    var6[var15] = var4;
                                 }

                                 var15++;
                              }

                              var15 += var16;
                           }
                        } else if (var9 == 3) {
                           for (int var55 = var20 + -1; ~var55 <= ~var19; var55--) {
                              for (int var86 = var11; var86 < var12; var86++) {
                                 if (var55 > var86) {
                                    if (var2) {
                                       var6[var15] = var4;
                                    }
                                 } else {
                                    var6[var15] = var5;
                                 }

                                 var15++;
                              }

                              var15 += var16;
                           }
                        }
                     } else if (~var0 == -3) {
                        if (~var9 == -1) {
                           for (int var54 = -1 + var20; var19 <= var54; var54--) {
                              for (int var85 = var11; var85 < var12; var85++) {
                                 if (var85 > var54 >> -374295103) {
                                    if (var2) {
                                       var6[var15] = var4;
                                    }
                                 } else {
                                    var6[var15] = var5;
                                 }

                                 var15++;
                              }

                              var15 += var16;
                           }
                        } else if (var9 == 1) {
                           for (int var53 = var13; ~var14 < ~var53; var53++) {
                              for (int var84 = var11; var12 > var84; var84++) {
                                 if (var15 >= 0 && ~var6.length < ~var15) {
                                    if (~(var53 << -893375679) >= ~var84) {
                                       var6[var15] = var5;
                                    } else if (var2) {
                                       var6[var15] = var4;
                                    }

                                    var15++;
                                 } else {
                                    var15++;
                                 }
                              }

                              var15 += var16;
                           }
                        } else if (var9 == 2) {
                           for (int var52 = var13; ~var52 > ~var14; var52++) {
                              for (int var83 = var18 + -1; var83 >= var17; var83--) {
                                 if (~(var52 >> 1080453377) > ~var83) {
                                    if (var2) {
                                       var6[var15] = var4;
                                    }
                                 } else {
                                    var6[var15] = var5;
                                 }

                                 var15++;
                              }

                              var15 += var16;
                           }
                        } else if (var9 == 3) {
                           for (int var51 = var20 + -1; ~var19 >= ~var51; var51--) {
                              for (int var82 = var18 - 1; ~var82 <= ~var17; var82--) {
                                 if (~(var51 << -1132408607) < ~var82) {
                                    if (var2) {
                                       var6[var15] = var4;
                                    }
                                 } else {
                                    var6[var15] = var5;
                                 }

                                 var15++;
                              }

                              var15 += var16;
                           }
                        }
                     } else if (~var0 == -4) {
                        if (~var9 == -1) {
                           for (int var50 = var20 + -1; ~var19 >= ~var50; var50--) {
                              for (int var81 = var18 + -1; ~var81 <= ~var17; var81--) {
                                 if (var50 >> -668330591 >= var81) {
                                    var6[var15] = var5;
                                 } else if (var2) {
                                    var6[var15] = var4;
                                 }

                                 var15++;
                              }

                              var15 += var16;
                           }
                        } else if (~var9 == -2) {
                           for (int var49 = -1 + var20; ~var19 >= ~var49; var49--) {
                              for (int var80 = var11; var12 > var80; var80++) {
                                 if (~var80 > ~(var49 << 588707393)) {
                                    if (var2) {
                                       var6[var15] = var4;
                                    }
                                 } else {
                                    var6[var15] = var5;
                                 }

                                 var15++;
                              }

                              var15 += var16;
                           }
                        } else if (~var9 == -3) {
                           for (int var48 = var13; ~var14 < ~var48; var48++) {
                              for (int var79 = var11; ~var79 > ~var12; var79++) {
                                 if (var48 >> 1394317377 < var79) {
                                    if (var2) {
                                       var6[var15] = var4;
                                    }
                                 } else {
                                    var6[var15] = var5;
                                 }

                                 var15++;
                              }

                              var15 += var16;
                           }
                        } else if (~var9 == -4) {
                           for (int var47 = var13; ~var14 < ~var47; var47++) {
                              for (int var78 = -1 + var18; ~var78 <= ~var17; var78--) {
                                 if (~var78 <= ~(var47 << -2000851167)) {
                                    var6[var15] = var5;
                                 } else if (var2) {
                                    var6[var15] = var4;
                                 }

                                 var15++;
                              }

                              var15 += var16;
                           }
                        }
                     } else if (~var0 == -5) {
                        if (~var9 == -1) {
                           for (int var46 = var20 - 1; var19 <= var46; var46--) {
                              for (int var77 = var11; ~var12 < ~var77; var77++) {
                                 if (~(var46 >> -622270527) < ~var77) {
                                    if (var2) {
                                       var6[var15] = var4;
                                    }
                                 } else {
                                    var6[var15] = var5;
                                 }

                                 var15++;
                              }

                              var15 += var16;
                           }
                        } else if (~var9 == -2) {
                           for (int var45 = var13; var14 > var45; var45++) {
                              for (int var76 = var11; ~var12 < ~var76; var76++) {
                                 if (var45 << -1042949727 < var76) {
                                    if (var2) {
                                       var6[var15] = var4;
                                    }
                                 } else {
                                    var6[var15] = var5;
                                 }

                                 var15++;
                              }

                              var15 += var16;
                           }
                        } else if (~var9 == -3) {
                           for (int var44 = var13; var14 > var44; var44++) {
                              for (int var75 = var18 - 1; var75 >= var17; var75--) {
                                 if (var44 >> -860562879 <= var75) {
                                    var6[var15] = var5;
                                 } else if (var2) {
                                    var6[var15] = var4;
                                 }

                                 var15++;
                              }

                              var15 += var16;
                           }
                        } else if (~var9 == -4) {
                           for (int var43 = -1 + var20; var19 <= var43; var43--) {
                              for (int var74 = -1 + var18; var74 >= var17; var74--) {
                                 if (~(var43 << 1757922945) <= ~var74) {
                                    var6[var15] = var5;
                                 } else if (var2) {
                                    var6[var15] = var4;
                                 }

                                 var15++;
                              }

                              var15 += var16;
                           }
                        }
                     } else if (~var0 == -6) {
                        if (~var9 == -1) {
                           for (int var42 = var20 + -1; var19 <= var42; var42--) {
                              for (int var73 = -1 + var18; var17 <= var73; var73--) {
                                 if (~var73 <= ~(var42 >> 108043425)) {
                                    var6[var15] = var5;
                                 } else if (var2) {
                                    var6[var15] = var4;
                                 }

                                 var15++;
                              }

                              var15 += var16;
                           }
                        } else if (var9 == 1) {
                           for (int var41 = -1 + var20; ~var41 <= ~var19; var41--) {
                              for (int var72 = var11; var12 > var72; var72++) {
                                 if (var41 << 1351207873 < var72) {
                                    if (var2) {
                                       var6[var15] = var4;
                                    }
                                 } else {
                                    var6[var15] = var5;
                                 }

                                 var15++;
                              }

                              var15 += var16;
                           }
                        } else if (var9 == 2) {
                           for (int var40 = var13; var40 < var14; var40++) {
                              for (int var71 = var11; ~var71 > ~var12; var71++) {
                                 if (~var71 > ~(var40 >> 2046413473)) {
                                    if (var2) {
                                       var6[var15] = var4;
                                    }
                                 } else {
                                    var6[var15] = var5;
                                 }

                                 var15++;
                              }

                              var15 += var16;
                           }
                        } else if (~var9 == -4) {
                           for (int var39 = var13; ~var14 < ~var39; var39++) {
                              for (int var70 = var18 - 1; var70 >= var17; var70--) {
                                 if (~(var39 << 551578273) <= ~var70) {
                                    var6[var15] = var5;
                                 } else if (var2) {
                                    var6[var15] = var4;
                                 }

                                 var15++;
                              }

                              var15 += var16;
                           }
                        }
                     } else {
                        if (~var0 == -7) {
                           if (var9 == 0) {
                              for (int var38 = var13; var38 < var14; var38++) {
                                 for (int var69 = var11; var69 < var12; var69++) {
                                    if (~(var1 / 2) <= ~var69) {
                                       var6[var15] = var5;
                                    } else if (var2) {
                                       var6[var15] = var4;
                                    }

                                    var15++;
                                 }

                                 var15 += var16;
                              }

                              return;
                           }

                           if (var9 == 1) {
                              for (int var37 = var13; var14 > var37; var37++) {
                                 for (int var68 = var11; ~var68 > ~var12; var68++) {
                                    if (~var37 < ~(var3 / 2)) {
                                       if (var2) {
                                          var6[var15] = var4;
                                       }
                                    } else {
                                       var6[var15] = var5;
                                    }

                                    var15++;
                                 }

                                 var15 += var16;
                              }

                              return;
                           }

                           if (~var9 == -3) {
                              for (int var36 = var13; var14 > var36; var36++) {
                                 for (int var67 = var11; var67 < var12; var67++) {
                                    if (var67 < var1 / 2) {
                                       if (var2) {
                                          var6[var15] = var4;
                                       }
                                    } else {
                                       var6[var15] = var5;
                                    }

                                    var15++;
                                 }

                                 var15 += var16;
                              }

                              return;
                           }

                           if (var9 == 3) {
                              for (int var35 = var13; ~var35 > ~var14; var35++) {
                                 for (int var66 = var11; ~var66 > ~var12; var66++) {
                                    if (~var35 <= ~(var3 / 2)) {
                                       var6[var15] = var5;
                                    } else if (var2) {
                                       var6[var15] = var4;
                                    }

                                    var15++;
                                 }

                                 var15 += var16;
                              }

                              return;
                           }
                        }

                        if (var0 == 7) {
                           if (~var9 == -1) {
                              for (int var34 = var13; ~var34 > ~var14; var34++) {
                                 for (int var65 = var11; var12 > var65; var65++) {
                                    if (-(var3 / 2) + var34 < var65) {
                                       if (var2) {
                                          var6[var15] = var4;
                                       }
                                    } else {
                                       var6[var15] = var5;
                                    }

                                    var15++;
                                 }

                                 var15 += var16;
                              }

                              return;
                           }

                           if (~var9 == -2) {
                              for (int var33 = var20 - 1; ~var19 >= ~var33; var33--) {
                                 for (int var64 = var11; var12 > var64; var64++) {
                                    if (~(-(var3 / 2) + var33) <= ~var64) {
                                       var6[var15] = var5;
                                    } else if (var2) {
                                       var6[var15] = var4;
                                    }

                                    var15++;
                                 }

                                 var15 += var16;
                              }

                              return;
                           }

                           if (~var9 == -3) {
                              for (int var32 = -1 + var20; ~var32 <= ~var19; var32--) {
                                 for (int var63 = var18 - 1; var17 <= var63; var63--) {
                                    if (var63 > var32 - var3 / 2) {
                                       if (var2) {
                                          var6[var15] = var4;
                                       }
                                    } else {
                                       var6[var15] = var5;
                                    }

                                    var15++;
                                 }

                                 var15 += var16;
                              }

                              return;
                           }

                           if (~var9 == -4) {
                              for (int var31 = var13; ~var31 > ~var14; var31++) {
                                 for (int var62 = var18 - 1; var62 >= var17; var62--) {
                                    if (~(-(var3 / 2) + var31) > ~var62) {
                                       if (var2) {
                                          var6[var15] = var4;
                                       }
                                    } else {
                                       var6[var15] = var5;
                                    }

                                    var15++;
                                 }

                                 var15 += var16;
                              }

                              return;
                           }
                        }

                        if (~var0 == -9) {
                           if (var9 == 0) {
                              for (int var30 = var13; var14 > var30; var30++) {
                                 for (int var61 = var11; ~var12 < ~var61; var61++) {
                                    if (var30 + -(var3 / 2) <= var61) {
                                       var6[var15] = var5;
                                    } else if (var2) {
                                       var6[var15] = var4;
                                    }

                                    var15++;
                                 }

                                 var15 += var16;
                              }

                              return;
                           }

                           if (var9 == 1) {
                              for (int var29 = var20 + -1; var19 <= var29; var29--) {
                                 for (int var60 = var11; ~var12 < ~var60; var60++) {
                                    if (-(var3 / 2) + var29 <= var60) {
                                       var6[var15] = var5;
                                    } else if (var2) {
                                       var6[var15] = var4;
                                    }

                                    var15++;
                                 }

                                 var15 += var16;
                              }

                              return;
                           }

                           if (var9 == 2) {
                              for (int var28 = var20 + -1; ~var28 <= ~var19; var28--) {
                                 for (int var59 = -1 + var18; var59 >= var17; var59--) {
                                    if (~(-(var3 / 2) + var28) >= ~var59) {
                                       var6[var15] = var5;
                                    } else if (var2) {
                                       var6[var15] = var4;
                                    }

                                    var15++;
                                 }

                                 var15 += var16;
                              }

                              return;
                           }

                           if (var9 == 3) {
                              for (int var21 = var13; ~var14 < ~var21; var21++) {
                                 for (int var22 = var18 - 1; var22 >= var17; var22--) {
                                    if (-(var3 / 2) + var21 > var22) {
                                       if (var2) {
                                          var6[var15] = var4;
                                       }
                                    } else {
                                       var6[var15] = var5;
                                    }

                                    var15++;
                                 }

                                 var15 += var16;
                              }

                              return;
                           }
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var23) {
         throw Class_sh.a(
            var23,
            "uc.A("
               + var0
               + ','
               + var1
               + ','
               + var2
               + ','
               + var3
               + ','
               + var4
               + ','
               + var5
               + ','
               + (var6 != null ? "{...}" : "null")
               + ','
               + var7
               + ','
               + var8
               + ','
               + var9
               + ','
               + var10
               + ')'
         );
      }
   }

   final void a(byte var1) {
      try {
         if (~this.h == 0) {
            if (this.s != null) {
               this.h = 2;
            } else {
               this.h = 0;
            }
         }

         int var2 = 17 % ((55 - var1) / 54);
         L++;
         if (~this.l == 0) {
            if (this.s != null) {
               this.l = 2;
            } else {
               this.l = 0;
            }
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "uc.L(" + var1 + ')');
      }
   }

   static final void b(int var0, int var1) {
      try {
         o++;
         Class_mi.P.b(-18767, var1);
         Class_id.h.b(var0 ^ 18766, var1);
         if (var0 == -1) {
            Class_m.V.b(-18767, var1);
            Class_vh.eb.b(-18767, var1);
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "uc.M(" + var0 + ',' + var1 + ')');
      }
   }

   final Class_jh a(Class_jh var1, Class_uc var2, int var3, byte var4, int var5) {
      try {
         var5 = this.d[var5];
         int var7 = -52 / ((var4 - 57) / 44);
         z++;
         Class_w var6 = Class_ff.a(var5 >> 2009279920, (byte)-47);
         var5 &= 65535;
         if (var6 == null) {
            return var2.a(var3, true, var1);
         } else {
            var3 = var2.d[var3];
            Class_w var8 = Class_ff.a(var3 >> -337583216, (byte)-96);
            var3 &= 65535;
            if (var8 == null) {
               Class_jh var11 = var1.b(!var6.a(true, var5), !this.y);
               var11.a(var6, var5, this.y);
               return var11;
            } else {
               Class_jh var9 = var1.b(!var6.a(true, var5) & !var8.a(true, var3), !this.y & !var2.y);
               var9.a(var6, var5, var8, var3, this.s, this.y | var2.y);
               return var9;
            }
         }
      } catch (RuntimeException var10) {
         throw Class_sh.a(
            var10, "uc.H(" + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + var4 + ',' + var5 + ')'
         );
      }
   }

   final Class_jh a(int var1, Class_jh var2, int var3, int var4) {
      int var7 = client.lb;

      try {
         var1 = this.d[var1];
         j++;
         if (var4 != -11436) {
            this.q = null;
         }

         Class_w var5 = Class_ff.a(var1 >> 1564093840, (byte)-90);
         var1 &= 65535;
         if (var5 == null) {
            return var2.b(true, true);
         } else {
            Class_jh var6;
            label60: {
               var3 &= 3;
               var6 = var2.b(!var5.a(true, var1), !this.y);
               if (var3 != 1) {
                  if (var3 != 2) {
                     if (var3 != 3) {
                        break label60;
                     }

                     var6.e();
                     if (var7 == 0) {
                        break label60;
                     }
                  }

                  var6.f();
                  if (var7 == 0) {
                     break label60;
                  }
               }

               var6.i();
            }

            var6.a(var5, var1, this.y);
            if (~var3 != -2) {
               if (~var3 == -3) {
                  var6.f();
                  if (var7 == 0) {
                     return var6;
                  }
               }

               if (~var3 != -4) {
                  return var6;
               }

               var6.i();
               if (var7 == 0) {
                  return var6;
               }
            }

            var6.e();
            return var6;
         }
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "uc.D(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + var4 + ')');
      }
   }

   final void a(Class_lh var1, int var2) {
      try {
         i++;

         while (true) {
            int var3 = var1.n(-6677);
            if (~var3 == -1) {
               if (var2 != 24022) {
                  this.a((byte)23, null, 53);
                  return;
               } else {
                  return;
               }
            }

            this.a(var1, var3, var2 + -32816);
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "uc.K(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
      }
   }

   public Class_uc() {
      this.l = -1;
      this.b = -1;
      this.h = -1;
      this.f = 99;
      this.t = 5;
      this.y = false;
      this.w = false;
      this.E = 2;
      this.P = -1;
   }
}
