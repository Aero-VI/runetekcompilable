final class Class_rg extends Class_lf {
   static int Q = 10;
   static int R;
   static boolean S = true;
   static int T = 0;
   static int U;
   private int V = 6;
   static Class_qc W = new Class_qc(64);
   static int X;
   static int Y;
   static int Z;
   static int ab;
   static int bb;
   static int[] cb = new int[]{-1, -1, 1, 1};

   static final void a(byte var0, int var1, int var2) {
      try {
         Z++;
         if (var0 != 106) {
            Q = -11;
         }

         if (Class_oj.Y != 0 && ~var2 != 0) {
            Class_vi.a(var2, Class_cj.Y, false, 0, Class_oj.Y, false);
            Class_vf.i = true;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "rg.D(" + var0 + ',' + var1 + ',' + var2 + ')');
      }
   }

   static final void d(byte var0) {
      try {
         Class_f.U.b((byte)94);
         if (var0 == -115) {
            U++;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "rg.E(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int[] a(byte var1, int var2) {
      int var9 = client.lb;

      try {
         X++;
         if (var1 != -61) {
            return null;
         } else {
            int[] var3 = super.H.a(false, var2);
            if (super.H.s) {
               int[] var6;
               int[] var7;
               label420: {
                  label421: {
                     label422: {
                        label423: {
                           label424: {
                              label406: {
                                 var6 = this.b(0, var2, 29149);
                                 var7 = this.b(1, var2, 29149);
                                 int var8 = this.V;
                                 if (~var8 != -2) {
                                    if (var8 == 2) {
                                       break label406;
                                    }

                                    if (~var8 == -4) {
                                       var8 = 0;
                                       if (var9 != 0 || Class_ld.X > var8) {
                                          do {
                                             var3[var8] = var7[var8] * var6[var8] >> -40724276;
                                          } while (Class_ld.X > ++var8);
                                       }

                                       if (var9 == 0) {
                                          return var3;
                                       }
                                       break label424;
                                    }

                                    if (~var8 == -5) {
                                       break label424;
                                    }

                                    if (~var8 == -6) {
                                       var8 = 0;
                                       if (var9 != 0 || ~Class_ld.X < ~var8) {
                                          do {
                                             var3[var8] = 4096 + -((-var7[var8] + 4096) * (-var6[var8] + 4096) >> -1186110484);
                                          } while (~Class_ld.X < ~(++var8));
                                       }

                                       if (var9 == 0) {
                                          return var3;
                                       }
                                       break label423;
                                    }

                                    if (~var8 == -7) {
                                       break label423;
                                    }

                                    if (~var8 == -8) {
                                       var8 = 0;
                                       if (var9 != 0 || Class_ld.X > var8) {
                                          do {
                                             int var12 = var6[var8];
                                             var3[var8] = ~var12 != -4097 ? (var7[var8] << -663849236) / (4096 + -var12) : 4096;
                                          } while (Class_ld.X > ++var8);
                                       }

                                       if (var9 == 0) {
                                          return var3;
                                       }
                                       break label422;
                                    }

                                    if (var8 == 8) {
                                       break label422;
                                    }

                                    if (~var8 == -10) {
                                       var8 = 0;
                                       if (var9 != 0 || ~Class_ld.X < ~var8) {
                                          do {
                                             int var11 = var6[var8];
                                             int var21 = var7[var8];
                                             var3[var8] = ~var11 > ~var21 ? var11 : var21;
                                          } while (~Class_ld.X < ~(++var8));
                                       }

                                       if (var9 == 0) {
                                          return var3;
                                       }
                                       break label421;
                                    }

                                    if (var8 == 10) {
                                       break label421;
                                    }

                                    if (var8 == 11) {
                                       var8 = 0;
                                       if (var9 != 0 || ~var8 > ~Class_ld.X) {
                                          do {
                                             int var4 = var6[var8];
                                             int var5 = var7[var8];
                                             var3[var8] = var4 <= var5 ? var5 - var4 : var4 + -var5;
                                          } while (~(++var8) > ~Class_ld.X);
                                       }

                                       if (var9 == 0) {
                                          return var3;
                                       }
                                       break label420;
                                    }

                                    if (~var8 != -13) {
                                       return var3;
                                    }

                                    if (var9 == 0) {
                                       break label420;
                                    }
                                 }

                                 var8 = 0;
                                 if (var9 != 0 || ~var8 > ~Class_ld.X) {
                                    do {
                                       var3[var8] = var7[var8] + var6[var8];
                                    } while (~(++var8) > ~Class_ld.X);
                                 }

                                 if (var9 == 0) {
                                    return var3;
                                 }
                              }

                              int var37 = 0;
                              if (var9 != 0) {
                                 var3[var37] = var6[var37] - var7[var37];
                                 var37++;
                              }

                              while (var37 < Class_ld.X) {
                                 var3[var37] = var6[var37] - var7[var37];
                                 var37++;
                              }

                              if (var9 == 0) {
                                 return var3;
                              }

                              var37 = 0;
                              if (var9 != 0 || Class_ld.X > var37) {
                                 do {
                                    var3[var37] = var7[var37] * var6[var37] >> -40724276;
                                 } while (Class_ld.X > ++var37);
                              }

                              if (var9 == 0) {
                                 return var3;
                              }
                           }

                           int var39 = 0;
                           if (var9 != 0) {
                              int var22 = var7[var39];
                              var3[var39] = ~var22 != -1 ? (var6[var39] << 710496812) / var22 : 4096;
                              var39++;
                           }

                           while (~var39 > ~Class_ld.X) {
                              int var23 = var7[var39];
                              var3[var39] = ~var23 != -1 ? (var6[var39] << 710496812) / var23 : 4096;
                              var39++;
                           }

                           if (var9 == 0) {
                              return var3;
                           }

                           var39 = 0;
                           if (var9 != 0 || ~Class_ld.X < ~var39) {
                              do {
                                 var3[var39] = 4096 + -((-var7[var39] + 4096) * (-var6[var39] + 4096) >> -1186110484);
                              } while (~Class_ld.X < ~(++var39));
                           }

                           if (var9 == 0) {
                              return var3;
                           }
                        }

                        int var41 = 0;
                        if (var9 != 0) {
                           int var24 = var7[var41];
                           var3[var41] = ~var24 <= -2049 ? -((4096 + -var6[var41]) * (-var24 + 4096) >> 1743551403) + 4096 : var24 * var6[var41] >> 1871217099;
                           var41++;
                        }

                        while (Class_ld.X > var41) {
                           int var25 = var7[var41];
                           var3[var41] = ~var25 <= -2049 ? -((4096 + -var6[var41]) * (-var25 + 4096) >> 1743551403) + 4096 : var25 * var6[var41] >> 1871217099;
                           var41++;
                        }

                        if (var9 == 0) {
                           return var3;
                        }

                        var41 = 0;
                        if (var9 != 0 || Class_ld.X > var41) {
                           do {
                              int var13 = var6[var41];
                              var3[var41] = ~var13 != -4097 ? (var7[var41] << -663849236) / (4096 + -var13) : 4096;
                           } while (Class_ld.X > ++var41);
                        }

                        if (var9 == 0) {
                           return var3;
                        }
                     }

                     int var43 = 0;
                     if (var9 != 0) {
                        int var14 = var6[var43];
                        var3[var43] = var14 == 0 ? 0 : -((4096 + -var7[var43] << 109881068) / var14) + 4096;
                        var43++;
                     }

                     while (~Class_ld.X < ~var43) {
                        int var15 = var6[var43];
                        var3[var43] = var15 == 0 ? 0 : -((4096 + -var7[var43] << 109881068) / var15) + 4096;
                        var43++;
                     }

                     if (var9 == 0) {
                        return var3;
                     }

                     var43 = 0;
                     if (var9 != 0 || ~Class_ld.X < ~var43) {
                        do {
                           int var16 = var6[var43];
                           int var26 = var7[var43];
                           var3[var43] = ~var16 > ~var26 ? var16 : var26;
                        } while (~Class_ld.X < ~(++var43));
                     }

                     if (var9 == 0) {
                        return var3;
                     }
                  }

                  int var45 = 0;
                  if (var9 != 0) {
                     int var27 = var7[var45];
                     int var17 = var6[var45];
                     var3[var45] = ~var17 >= ~var27 ? var27 : var17;
                     var45++;
                  }

                  while (var45 < Class_ld.X) {
                     int var28 = var7[var45];
                     int var18 = var6[var45];
                     var3[var45] = ~var18 >= ~var28 ? var28 : var18;
                     var45++;
                  }

                  if (var9 == 0) {
                     return var3;
                  }

                  var45 = 0;
                  if (var9 != 0 || ~var45 > ~Class_ld.X) {
                     do {
                        int var19 = var6[var45];
                        int var29 = var7[var45];
                        var3[var45] = var19 <= var29 ? var29 - var19 : var19 + -var29;
                     } while (~(++var45) > ~Class_ld.X);
                  }

                  if (var9 == 0) {
                     return var3;
                  }
               }

               int var47 = 0;
               if (var9 != 0 || ~Class_ld.X < ~var47) {
                  do {
                     int var20 = var6[var47];
                     int var30 = var7[var47];
                     var3[var47] = -(var30 * var20 >> -1131577557) + (var20 - -var30);
                  } while (~Class_ld.X < ~(++var47));
               }
            }

            return var3;
         }
      } catch (RuntimeException var10) {
         throw Class_sh.a(var10, "rg.G(" + var1 + ',' + var2 + ')');
      }
   }

   static final void d(int var0, int var1, int var2) {
      try {
         R++;
         Class_ic var3 = Class_ka.a(var2, 1, (byte)-127);
         var3.e(0);
         if (var1 < 89) {
            a((byte)-107, -116, -64);
         }

         var3.L = var0;
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "rg.B(" + var0 + ',' + var1 + ',' + var2 + ')');
      }
   }

   public static void a(boolean var0) {
      try {
         cb = null;
         W = null;
         if (!var0) {
            d(99, -56, -68);
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "rg.F(" + var0 + ')');
      }
   }

   public Class_rg() {
      super(2, false);
   }

   static final Class_hd e(int var0, int var1, int var2) {
      Class_aa var3 = Class_ck.d[var0][var1][var2];
      return var3 != null && var3.M != null ? var3.M : null;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int[][] a(int var1, boolean var2) {
      int var22 = client.lb;

      try {
         int[][] var3;
         bb++;
         var3 = super.K.a(var1, (byte)-102);
         label518:
         if (super.K.q) {
            int[] var12;
            int[] var13;
            int[] var14;
            int[] var15;
            int[] var16;
            int[] var17;
            int[] var18;
            int[] var19;
            int[] var20;
            label610: {
               label611: {
                  label526: {
                     label612: {
                        label613: {
                           label598: {
                              int[][] var10 = this.c(-125, 0, var1);
                              int[][] var11 = this.c(-128, 1, var1);
                              var13 = var3[1];
                              var14 = var3[2];
                              var12 = var3[0];
                              var15 = var10[0];
                              var16 = var10[1];
                              var17 = var10[2];
                              var18 = var11[0];
                              var19 = var11[1];
                              var20 = var11[2];
                              int var21 = this.V;
                              if (~var21 != -2) {
                                 if (var21 == 2) {
                                    break label598;
                                 }

                                 if (var21 == 3) {
                                    var21 = 0;
                                    if (var22 != 0 || Class_ld.X > var21) {
                                       do {
                                          var12[var21] = var15[var21] * var18[var21] >> -924891028;
                                          var13[var21] = var19[var21] * var16[var21] >> -1164470868;
                                          var14[var21] = var17[var21] * var20[var21] >> -253440052;
                                       } while (Class_ld.X > ++var21);
                                    }

                                    if (var22 == 0) {
                                       break label518;
                                    }
                                    break label613;
                                 }

                                 if (var21 == 4) {
                                    break label613;
                                 }

                                 if (var21 == 5) {
                                    var21 = 0;
                                    if (var22 != 0 || ~var21 > ~Class_ld.X) {
                                       do {
                                          var12[var21] = 4096 - ((4096 + -var18[var21]) * (-var15[var21] + 4096) >> -1301301364);
                                          var13[var21] = 4096 - ((-var19[var21] + 4096) * (-var16[var21] + 4096) >> 1991461676);
                                          var14[var21] = -((-var20[var21] + 4096) * (-var17[var21] + 4096) >> 691978508) + 4096;
                                       } while (~(++var21) > ~Class_ld.X);
                                    }

                                    if (var22 == 0) {
                                       break label518;
                                    }
                                    break label612;
                                 }

                                 if (var21 == 6) {
                                    break label612;
                                 }

                                 if (~var21 == -8) {
                                    var21 = 0;
                                    if (var22 != 0 || var21 < Class_ld.X) {
                                       do {
                                          int var36 = var16[var21];
                                          int var25 = var15[var21];
                                          int var47 = var17[var21];
                                          var12[var21] = var25 == 4096 ? 4096 : (var18[var21] << 1483772396) / (4096 + -var25);
                                          var13[var21] = var36 == 4096 ? 4096 : (var19[var21] << -43184116) / (4096 - var36);
                                          var14[var21] = var47 == 4096 ? 4096 : (var20[var21] << -522695380) / (4096 - var47);
                                       } while (++var21 < Class_ld.X);
                                    }

                                    if (var22 == 0) {
                                       break label518;
                                    }
                                    break label526;
                                 }

                                 if (~var21 == -9) {
                                    break label526;
                                 }

                                 if (var21 == 9) {
                                    var21 = 0;
                                    if (var22 != 0 || ~var21 > ~Class_ld.X) {
                                       do {
                                          int var46 = var17[var21];
                                          int var66 = var19[var21];
                                          int var24 = var15[var21];
                                          int var57 = var18[var21];
                                          int var75 = var20[var21];
                                          int var35 = var16[var21];
                                          var12[var21] = var57 <= var24 ? var57 : var24;
                                          var13[var21] = ~var66 < ~var35 ? var35 : var66;
                                          var14[var21] = var46 < var75 ? var46 : var75;
                                       } while (~(++var21) > ~Class_ld.X);
                                    }

                                    if (var22 == 0) {
                                       break label518;
                                    }
                                    break label611;
                                 }

                                 if (~var21 == -11) {
                                    break label611;
                                 }

                                 if (var21 == 11) {
                                    var21 = 0;
                                    if (var22 != 0 || var21 < Class_ld.X) {
                                       do {
                                          int var8 = var19[var21];
                                          int var5 = var16[var21];
                                          int var9 = var20[var21];
                                          int var6 = var17[var21];
                                          int var7 = var18[var21];
                                          int var4 = var15[var21];
                                          var12[var21] = var7 >= var4 ? var7 - var4 : var4 + -var7;
                                          var13[var21] = var5 > var8 ? -var8 + var5 : var8 - var5;
                                          var14[var21] = ~var9 > ~var6 ? var6 - var9 : var9 - var6;
                                       } while (++var21 < Class_ld.X);
                                    }

                                    if (var22 == 0) {
                                       break label518;
                                    }
                                    break label610;
                                 }

                                 if (~var21 != -13) {
                                    break label518;
                                 }

                                 if (var22 == 0) {
                                    break label610;
                                 }
                              }

                              var21 = 0;
                              if (var22 != 0 || ~Class_ld.X < ~var21) {
                                 do {
                                    var12[var21] = var15[var21] - -var18[var21];
                                    var13[var21] = var16[var21] + var19[var21];
                                    var14[var21] = var20[var21] + var17[var21];
                                 } while (~Class_ld.X < ~(++var21));
                              }

                              if (var22 == 0) {
                                 break label518;
                              }
                           }

                           int var90 = 0;
                           if (var22 != 0) {
                              var12[var90] = var15[var90] - var18[var90];
                              var13[var90] = -var19[var90] + var16[var90];
                              var14[var90] = -var20[var90] + var17[var90];
                              var90++;
                           }

                           while (~Class_ld.X < ~var90) {
                              var12[var90] = var15[var90] - var18[var90];
                              var13[var90] = -var19[var90] + var16[var90];
                              var14[var90] = -var20[var90] + var17[var90];
                              var90++;
                           }

                           if (var22 == 0) {
                              break label518;
                           }

                           var90 = 0;
                           if (var22 != 0 || Class_ld.X > var90) {
                              do {
                                 var12[var90] = var15[var90] * var18[var90] >> -924891028;
                                 var13[var90] = var19[var90] * var16[var90] >> -1164470868;
                                 var14[var90] = var17[var90] * var20[var90] >> -253440052;
                              } while (Class_ld.X > ++var90);
                           }

                           if (var22 == 0) {
                              break label518;
                           }
                        }

                        int var92 = 0;
                        if (var22 != 0) {
                           int var67 = var19[var92];
                           int var76 = var20[var92];
                           int var58 = var18[var92];
                           var12[var92] = var58 == 0 ? 4096 : (var15[var92] << -1354494100) / var58;
                           var13[var92] = ~var67 == -1 ? 4096 : (var16[var92] << 433702380) / var67;
                           var14[var92] = var76 == 0 ? 4096 : (var17[var92] << 1115671852) / var76;
                           var92++;
                        }

                        while (Class_ld.X > var92) {
                           int var68 = var19[var92];
                           int var77 = var20[var92];
                           int var59 = var18[var92];
                           var12[var92] = var59 == 0 ? 4096 : (var15[var92] << -1354494100) / var59;
                           var13[var92] = ~var68 == -1 ? 4096 : (var16[var92] << 433702380) / var68;
                           var14[var92] = var77 == 0 ? 4096 : (var17[var92] << 1115671852) / var77;
                           var92++;
                        }

                        if (var22 == 0) {
                           break label518;
                        }

                        var92 = 0;
                        if (var22 != 0 || ~var92 > ~Class_ld.X) {
                           do {
                              var12[var92] = 4096 - ((4096 + -var18[var92]) * (-var15[var92] + 4096) >> -1301301364);
                              var13[var92] = 4096 - ((-var19[var92] + 4096) * (-var16[var92] + 4096) >> 1991461676);
                              var14[var92] = -((-var20[var92] + 4096) * (-var17[var92] + 4096) >> 691978508) + 4096;
                           } while (~(++var92) > ~Class_ld.X);
                        }

                        if (var22 == 0) {
                           break label518;
                        }
                     }

                     int var94 = 0;
                     if (var22 == 0 && ~var94 <= ~Class_ld.X) {
                        if (var22 == 0) {
                           break label518;
                        }

                        var94 = 0;
                        if (var22 != 0 || var94 < Class_ld.X) {
                           do {
                              int var38 = var16[var94];
                              int var27 = var15[var94];
                              int var49 = var17[var94];
                              var12[var94] = var27 == 4096 ? 4096 : (var18[var94] << 1483772396) / (4096 + -var27);
                              var13[var94] = var38 == 4096 ? 4096 : (var19[var94] << -43184116) / (4096 - var38);
                              var14[var94] = var49 == 4096 ? 4096 : (var20[var94] << -522695380) / (4096 - var49);
                           } while (++var94 < Class_ld.X);
                        }

                        if (var22 == 0) {
                           break label518;
                        }
                     } else {
                        do {
                           int var60 = var18[var94];
                           int var78 = var20[var94];
                           int var69 = var19[var94];
                           var12[var94] = ~var60 > -2049 ? var60 * var15[var94] >> -2125438965 : 4096 + -((4096 - var15[var94]) * (4096 - var60) >> -323397653);
                           var13[var94] = var69 >= 2048 ? 4096 - ((4096 - var69) * (-var16[var94] + 4096) >> 2089853707) : var16[var94] * var69 >> -485175445;
                           var14[var94] = ~var78 > -2049
                              ? var17[var94] * var78 >> 1030249003
                              : 4096 - ((-var78 + 4096) * (-var17[var94] + 4096) >> -1943585397);
                        } while (~(++var94) > ~Class_ld.X);

                        if (var22 == 0) {
                           break label518;
                        }

                        var94 = 0;
                        if (var22 != 0 || var94 < Class_ld.X) {
                           do {
                              int var37 = var16[var94];
                              int var26 = var15[var94];
                              int var48 = var17[var94];
                              var12[var94] = var26 == 4096 ? 4096 : (var18[var94] << 1483772396) / (4096 + -var26);
                              var13[var94] = var37 == 4096 ? 4096 : (var19[var94] << -43184116) / (4096 - var37);
                              var14[var94] = var48 == 4096 ? 4096 : (var20[var94] << -522695380) / (4096 - var48);
                           } while (++var94 < Class_ld.X);
                        }

                        if (var22 == 0) {
                           break label518;
                        }
                     }
                  }

                  int var97 = 0;
                  if (var22 != 0) {
                     int var50 = var17[var97];
                     int var39 = var16[var97];
                     int var28 = var15[var97];
                     var12[var97] = var28 == 0 ? 0 : 4096 + -((-var18[var97] + 4096 << -532940436) / var28);
                     var13[var97] = ~var39 == -1 ? 0 : -((-var19[var97] + 4096 << 1211544780) / var39) + 4096;
                     var14[var97] = var50 == 0 ? 0 : -((4096 - var20[var97] << 318990316) / var50) + 4096;
                     var97++;
                  }

                  while (var97 < Class_ld.X) {
                     int var51 = var17[var97];
                     int var40 = var16[var97];
                     int var29 = var15[var97];
                     var12[var97] = var29 == 0 ? 0 : 4096 + -((-var18[var97] + 4096 << -532940436) / var29);
                     var13[var97] = ~var40 == -1 ? 0 : -((-var19[var97] + 4096 << 1211544780) / var40) + 4096;
                     var14[var97] = var51 == 0 ? 0 : -((4096 - var20[var97] << 318990316) / var51) + 4096;
                     var97++;
                  }

                  if (var22 == 0) {
                     break label518;
                  }

                  var97 = 0;
                  if (var22 != 0 || ~var97 > ~Class_ld.X) {
                     do {
                        int var52 = var17[var97];
                        int var70 = var19[var97];
                        int var30 = var15[var97];
                        int var61 = var18[var97];
                        int var79 = var20[var97];
                        int var41 = var16[var97];
                        var12[var97] = var61 <= var30 ? var61 : var30;
                        var13[var97] = ~var70 < ~var41 ? var41 : var70;
                        var14[var97] = var52 < var79 ? var52 : var79;
                     } while (~(++var97) > ~Class_ld.X);
                  }

                  if (var22 == 0) {
                     break label518;
                  }
               }

               int var99 = 0;
               if (var22 != 0) {
                  int var42 = var16[var99];
                  int var31 = var15[var99];
                  int var71 = var19[var99];
                  int var53 = var17[var99];
                  int var80 = var20[var99];
                  int var62 = var18[var99];
                  var12[var99] = ~var62 <= ~var31 ? var62 : var31;
                  var13[var99] = ~var71 > ~var42 ? var42 : var71;
                  var14[var99] = ~var53 < ~var80 ? var53 : var80;
                  var99++;
               }

               while (~Class_ld.X < ~var99) {
                  int var43 = var16[var99];
                  int var32 = var15[var99];
                  int var72 = var19[var99];
                  int var54 = var17[var99];
                  int var81 = var20[var99];
                  int var63 = var18[var99];
                  var12[var99] = ~var63 <= ~var32 ? var63 : var32;
                  var13[var99] = ~var72 > ~var43 ? var43 : var72;
                  var14[var99] = ~var54 < ~var81 ? var54 : var81;
                  var99++;
               }

               if (var22 == 0) {
                  break label518;
               }

               var99 = 0;
               if (var22 != 0 || var99 < Class_ld.X) {
                  do {
                     int var73 = var19[var99];
                     int var44 = var16[var99];
                     int var82 = var20[var99];
                     int var55 = var17[var99];
                     int var64 = var18[var99];
                     int var33 = var15[var99];
                     var12[var99] = var64 >= var33 ? var64 - var33 : var33 + -var64;
                     var13[var99] = var44 > var73 ? -var73 + var44 : var73 - var44;
                     var14[var99] = ~var82 > ~var55 ? var55 - var82 : var82 - var55;
                  } while (++var99 < Class_ld.X);
               }

               if (var22 == 0) {
                  break label518;
               }
            }

            int var101 = 0;
            if (var22 != 0 || ~var101 > ~Class_ld.X) {
               do {
                  int var65 = var18[var101];
                  int var34 = var15[var101];
                  int var45 = var16[var101];
                  int var74 = var19[var101];
                  int var56 = var17[var101];
                  int var83 = var20[var101];
                  var12[var101] = -(var65 * var34 >> -729444213) + var65 + var34;
                  var13[var101] = var74 + var45 - (var45 * var74 >> 231254347);
                  var14[var101] = -(var56 * var83 >> -1152234805) + var83 + var56;
               } while (~(++var101) > ~Class_ld.X);
            }
         }

         if (!var2) {
            a(true);
         }

         return var3;
      } catch (RuntimeException var23) {
         throw Class_sh.a(var23, "rg.A(" + var1 + ',' + var2 + ')');
      }
   }

   final void a(Class_lh var1, int var2, int var3) {
      int var5 = client.lb;

      try {
         label44: {
            label38: {
               if (var2 != 0) {
                  if (var2 != 1) {
                     break label44;
                  }

                  if (var5 == 0) {
                     break label38;
                  }
               }

               this.V = var1.n(var3 + -6676);
               if (var5 == 0) {
                  break label44;
               }
            }

            super.C = var1.n(var3 + -6676) == 1;
         }

         if (var3 != -1) {
            W = null;
         }

         Y++;
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "rg.K(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }
}
