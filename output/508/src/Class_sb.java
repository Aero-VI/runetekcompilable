final class Class_sb {
   static int a;
   static int b;
   private int[] c;
   static volatile boolean d = true;
   static Class_ha[] e;
   private byte[] f;
   private int[] g;
   static int h;
   static int[] i = new int[2000];
   static int j;
   static Class_r k = Class_tc.a(43, "<col=c0ff00>");
   static int l;
   static Class_r m = Class_tc.a(43, "showVideoAd");
   static int n;
   static int o;
   static int p;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int a(int var1, byte[] var2, byte[] var3, int var4, int var5, int var6) {
      int var15 = client.lb;

      try {
         if (var4 != -2147483648) {
            j = -125;
         }

         var1 += var6;
         b++;
         int var7 = 0;
         int var8 = var5 << 2068778659;
         if (var15 == 0 && ~var1 >= ~var6) {
            return -var5 + (var8 - -7 >> 2144411171);
         } else {
            do {
               int var9 = 255 & var3[var6];
               int var10 = this.c[var9];
               byte var11 = this.f[var9];
               if (var11 == 0) {
                  throw new RuntimeException("No codeword for data value " + var9);
               }

               int var13 = var8 & 7;
               int var17 = var7 & -var13 >> -28910241;
               int var12 = var8 >> 1396436163;
               var8 += var11;
               int var14 = var12 + (var13 - -var11 + -1 >> -170448765);
               var13 += 24;
               var2[var12] = (byte)(var7 = Class_mb.a(var17, var10 >>> var13));
               if (var12 < var14) {
                  var12++;
                  var13 -= 8;
                  var2[var12] = (byte)(var7 = var10 >>> var13);
                  if (~var12 > ~var14) {
                     var13 -= 8;
                     var2[++var12] = (byte)(var7 = var10 >>> var13);
                     if (~var14 < ~var12) {
                        var13 -= 8;
                        var2[++var12] = (byte)(var7 = var10 >>> var13);
                        if (var12 < var14) {
                           var13 -= 8;
                           var2[++var12] = (byte)(var7 = var10 << -var13);
                        }
                     }
                  }
               }
            } while (~var1 < ~(++var6));

            return -var5 + (var8 - -7 >> 2144411171);
         }
      } catch (RuntimeException var16) {
         throw Class_sh.a(
            var16, "sb.C(" + var1 + 44 + (var2 != null ? "{...}" : "null") + 44 + (var3 != null ? "{...}" : "null") + 44 + var4 + 44 + var5 + 44 + var6 + 41
         );
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, int var1, int var2, byte var3, Class_nd var4) {
      int var11 = client.lb;

      try {
         p++;
         if (Class_ma.ib < 400) {
            if (var4.z != null) {
               var4 = var4.d(-94);
            }

            if (var4 != null) {
               if (var4.B) {
                  Class_r var5 = var4.ib;
                  int var6 = 3 / ((50 - var3) / 35);
                  if (var4.M != 0) {
                     var5 = Class_o.a(
                        2, new Class_r[]{var5, Class_gj.a(var4.M, true, Class_gg.B.ac), Class_oi.q, Class_jf.i, Class_og.b(var4.M, 0), Class_vg.G}
                     );
                  }

                  if (Class_vh.cb == 1) {
                     Class_be.a(var2, var1, (byte)-102, Class_o.a(2, new Class_r[]{Class_h.b, Class_jk.C, var5}), (short)15, Class_mk.c, var0);
                     Class_tb.h++;
                  } else {
                     if (Class_sg.tb) {
                        if ((Class_fb.o & 2) == 2) {
                           Class_rj.E++;
                           Class_be.a(var2, var1, (byte)-70, Class_o.a(2, new Class_r[]{Class_ab.U, Class_jk.C, var5}), (short)44, Class_aj.b, var0);
                           return;
                        }
                     } else {
                        Class_aa.x++;
                        Class_r[] var7 = var4.A;
                        if (Class_pc.f) {
                           var7 = Class_cg.a((byte)-117, var7);
                        }

                        if (var7 != null) {
                           int var8 = 4;
                           if (var11 != 0 || ~var8 <= -1) {
                              do {
                                 if (var7[var8] != null) {
                                    if (Class_u.W == 0 && var7[var8].a(false, Class_eb.b)) {
                                       var8--;
                                    } else {
                                       Class_fc.x++;
                                       byte var9 = 0;
                                       if (~var8 == -1) {
                                          var9 = 12;
                                       }

                                       if (var8 == 1) {
                                          var9 = 29;
                                       }

                                       if (var8 == 2) {
                                          var9 = 48;
                                       }

                                       if (~var8 == -4) {
                                          var9 = 21;
                                       }

                                       if (var8 == 4) {
                                          var9 = 11;
                                       }

                                       Class_be.a(var2, var1, (byte)-91, Class_o.a(2, new Class_r[]{Class_cc.Ob, var5}), var9, var7[var8], var0);
                                       var8--;
                                    }
                                 } else {
                                    var8--;
                                 }
                              } while (~var8 <= -1);
                           }
                        }

                        if (Class_u.W == 0 && var7 != null) {
                           int var13 = 4;
                           if (var11 != 0 || var13 >= 0) {
                              do {
                                 if (var7[var13] != null && var7[var13].a(false, Class_eb.b)) {
                                    short var14 = 0;
                                    Class_ph.c++;
                                    short var10 = 0;
                                    if (var13 == 0) {
                                       var10 = 12;
                                    }

                                    if (var4.M > Class_gg.B.ac) {
                                       var14 = 2000;
                                    }

                                    if (var13 == 1) {
                                       var10 = 29;
                                    }

                                    if (var13 == 2) {
                                       var10 = 48;
                                    }

                                    if (~var13 == -4) {
                                       var10 = 21;
                                    }

                                    if (var13 == 4) {
                                       var10 = 11;
                                    }

                                    if (var10 != 0) {
                                       var10 += var14;
                                    }

                                    Class_be.a(var2, var1, (byte)-86, Class_o.a(2, new Class_r[]{Class_cc.Ob, var5}), var10, var7[var13], var0);
                                 }
                              } while (--var13 >= 0);
                           }
                        }

                        Class_be.a(var2, var1, (byte)-126, Class_o.a(2, new Class_r[]{Class_cc.Ob, var5}), (short)1002, Class_uh.b, var0);
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var12) {
         throw Class_sh.a(var12, "sb.E(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ')');
      }
   }

   static final boolean a(Class_cj var0, int var1) {
      try {
         if (var1 != -1) {
            a(11);
         }

         l++;
         return var0.g(Class_tf.Y, 0);
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "sb.D(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
      }
   }

   final int a(byte[] var1, int var2, int var3, int var4, int var5, byte[] var6) {
      try {
         h++;
         if (var4 == 0) {
            return 0;
         } else {
            var4 += var5;
            int var7 = 0;
            if (var2 != 8) {
               this.a(null, -18, 64, 32, 16, null);
            }

            int var8 = var3;

            while (true) {
               byte var9 = var6[var8];
               if (~var9 > -1) {
                  var7 = this.g[var7];
               } else {
                  var7++;
               }

               int var10;
               if ((var10 = this.g[var7]) < 0) {
                  var1[var5++] = (byte)(~var10);
                  if (~var4 >= ~var5) {
                     break;
                  }

                  var7 = 0;
               }

               if (~(var9 & 64) != -1) {
                  var7 = this.g[var7];
               } else {
                  var7++;
               }

               if (~(var10 = this.g[var7]) > -1) {
                  var1[var5++] = (byte)(~var10);
                  if (~var4 >= ~var5) {
                     break;
                  }

                  var7 = 0;
               }

               if ((32 & var9) == 0) {
                  var7++;
               } else {
                  var7 = this.g[var7];
               }

               if ((var10 = this.g[var7]) < 0) {
                  var1[var5++] = (byte)(~var10);
                  if (var5 >= var4) {
                     break;
                  }

                  var7 = 0;
               }

               if ((16 & var9) != 0) {
                  var7 = this.g[var7];
               } else {
                  var7++;
               }

               if ((var10 = this.g[var7]) < 0) {
                  var1[var5++] = (byte)(~var10);
                  if (var4 <= var5) {
                     break;
                  }

                  var7 = 0;
               }

               if (~(var9 & 8) != -1) {
                  var7 = this.g[var7];
               } else {
                  var7++;
               }

               if (~(var10 = this.g[var7]) > -1) {
                  var1[var5++] = (byte)(~var10);
                  if (var5 >= var4) {
                     break;
                  }

                  var7 = 0;
               }

               if ((var9 & 4) == 0) {
                  var7++;
               } else {
                  var7 = this.g[var7];
               }

               if (~(var10 = this.g[var7]) > -1) {
                  var1[var5++] = (byte)(~var10);
                  if (var5 >= var4) {
                     break;
                  }

                  var7 = 0;
               }

               if ((2 & var9) != 0) {
                  var7 = this.g[var7];
               } else {
                  var7++;
               }

               if (~(var10 = this.g[var7]) > -1) {
                  var1[var5++] = (byte)(~var10);
                  if (var4 <= var5) {
                     break;
                  }

                  var7 = 0;
               }

               if (~(var9 & 1) != -1) {
                  var7 = this.g[var7];
               } else {
                  var7++;
               }

               if ((var10 = this.g[var7]) < 0) {
                  var1[var5++] = (byte)(~var10);
                  if (~var5 <= ~var4) {
                     break;
                  }

                  var7 = 0;
               }

               var8++;
            }

            return 1 + var8 - var3;
         }
      } catch (RuntimeException var11) {
         throw Class_sh.a(
            var11, "sb.A(" + (var1 != null ? "{...}" : "null") + 44 + var2 + 44 + var3 + 44 + var4 + 44 + var5 + 44 + (var6 != null ? "{...}" : "null") + 41
         );
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   Class_sb(byte[] var1) {
      super();
      int var16 = client.lb;

      try {
         int[] var3 = new int[33];
         int var4 = 0;
         int var2 = var1.length;
         this.f = var1;
         this.g = new int[8];
         this.c = new int[var2];
         int var5 = 0;
         if (var16 != 0 || var5 < var2) {
            do {
               byte var6 = var1[var5];
               if (var6 == 0) {
                  var5++;
               } else {
                  int var8;
                  int var9;
                  label169: {
                     int var7 = 1 << -var6 + 32;
                     var8 = var3[var6];
                     this.c[var5] = var8;
                     if (~(var8 & var7) != -1) {
                        var9 = var3[var6 - 1];
                        if (var16 == 0) {
                           break label169;
                        }
                     }

                     int var10 = var6 - 1;
                     if (var16 != 0 || var10 >= 1) {
                        do {
                           int var11 = var3[var10];
                           if (~var8 != ~var11) {
                              break;
                           }

                           int var12 = 1 << 32 + -var10;
                           if ((var11 & var12) == 0) {
                              var3[var10] = Class_mb.a(var11, var12);
                              if (var16 == 0) {
                                 var10--;
                                 continue;
                              }
                           }

                           var3[var10] = var3[var10 + -1];
                           if (var16 == 0) {
                              break;
                           }

                           var10--;
                        } while (var10 >= 1);
                     }

                     var9 = var8 | var7;
                  }

                  var3[var6] = var9;
                  int var18 = var6 + 1;
                  if (var16 != 0 || ~var18 >= -33) {
                     do {
                        if (var8 == var3[var18]) {
                           var3[var18] = var9;
                        }
                     } while (~(++var18) >= -33);
                  }

                  int var19 = 0;
                  int var21 = 0;
                  int var13;
                  if (var16 != 0) {
                     var13 = -2147483648 >>> var21;
                     if (~(var13 & var8) != -1) {
                        if (this.g[var19] == 0) {
                           this.g[var19] = var4;
                        }

                        var19 = this.g[var19];
                        if (var16 != 0) {
                           var19++;
                        }
                     } else {
                        var19++;
                     }
                  } else {
                     if (var6 <= var21) {
                        this.g[var19] = ~var5;
                        if (var4 <= var19) {
                           var4 = var19 + 1;
                        }

                        var5++;
                        continue;
                     }

                     var13 = -2147483648 >>> var21;
                     if (~(var13 & var8) != -1) {
                        if (this.g[var19] == 0) {
                           this.g[var19] = var4;
                        }

                        var19 = this.g[var19];
                        if (var16 != 0) {
                           var19++;
                        }
                     } else {
                        var19++;
                     }
                  }

                  while (true) {
                     if (~var19 > ~this.g.length) {
                        var13 >>>= 1;
                        var21++;
                     } else {
                        int[] var14 = new int[2 * this.g.length];
                        int var15 = 0;
                        if (var16 != 0) {
                           var14[var15] = this.g[var15];
                           var15++;
                        }

                        while (~var15 > ~this.g.length) {
                           var14[var15] = this.g[var15];
                           var15++;
                        }

                        this.g = var14;
                        var13 >>>= 1;
                        var21++;
                     }

                     if (var6 <= var21) {
                        this.g[var19] = ~var5;
                        if (var4 <= var19) {
                           var4 = var19 + 1;
                        }

                        var5++;
                        break;
                     }

                     var13 = -2147483648 >>> var21;
                     if (~(var13 & var8) != -1) {
                        if (this.g[var19] == 0) {
                           this.g[var19] = var4;
                        }

                        var19 = this.g[var19];
                        if (var16 != 0) {
                           var19++;
                        }
                     } else {
                        var19++;
                     }
                  }
               }
            } while (var5 < var2);
         }
      } catch (RuntimeException var17) {
         throw Class_sh.a(var17, "sb.<init>(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   public static void a(int var0) {
      try {
         i = null;
         m = null;
         int var1 = -70 / ((var0 - -71) / 48);
         k = null;
         e = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "sb.B(" + var0 + ')');
      }
   }
}
