final class Class_td extends Class_lf {
   static int Q = 0;
   static int R;
   static int S;
   static int T = -1;
   static Class_r U = Class_tc.a(43, "null");
   static int V;
   static int W;
   private Class_bh[] X;
   static int Y;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int[][] a(int var1, boolean var2) {
      int var16 = client.lb;

      try {
         V++;
         if (!var2) {
            this.a((byte)-45, 77);
         }

         int[][] var3 = super.K.a(var1, (byte)89);
         if (super.K.q) {
            int var4 = Class_ld.X;
            int var5 = Class_aa.K;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.K.b((byte)123);
            this.a(var6, 23891);
            int var8 = 0;
            if (var16 != 0 || ~Class_aa.K < ~var8) {
               do {
                  int[] var9 = var6[var8];
                  int[][] var10 = var7[var8];
                  int[] var11 = var10[0];
                  int[] var12 = var10[1];
                  int[] var13 = var10[2];
                  int var14 = 0;
                  if (var16 != 0 || var14 < Class_ld.X) {
                     do {
                        int var15 = var9[var14];
                        var13[var14] = Class_ui.a(var15 << -741736188, 4080);
                        var12[var14] = Class_ui.a(65280, var15) >> -739883420;
                        var11[var14] = Class_ui.a(var15 >> -1987974356, 4080);
                     } while (++var14 < Class_ld.X);
                  }
               } while (~Class_aa.K < ~(++var8));
            }
         }

         return var3;
      } catch (RuntimeException var17) {
         throw Class_sh.a(var17, "td.A(" + var1 + ',' + var2 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Irreducible bytecode has more than 5 nodes in sequence and was not entirely decomposed
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   final void a(Class_lh var1, int var2, int var3) {
      int var7 = client.lb;

      try {
         Y++;
         if (~var2 != var3) {
            if (~var2 == -2) {
               super.C = var1.n(-6677) == 1;
            }
         } else {
            this.X = new Class_bh[var1.n(-6677)];
            int var4 = 0;
            if (var7 != 0 || this.X.length > var4) {
               do {
                  int var5 = var1.n(-6677);
                  if (var5 != 0) {
                     if (~var5 == -2) {
                        this.X[var4] = Class_wc.a((byte)116, var1);
                        if (var7 != 0) {
                           this.X[var4] = Class_md.a((byte)121, var1);
                           if (var7 != 0) {
                              this.X[var4] = Class_r.a(-20084, var1);
                              var4++;
                           } else {
                              var4++;
                           }
                        } else {
                           var4++;
                        }
                        continue;
                     }

                     if (var5 == 2) {
                        this.X[var4] = Class_md.a((byte)121, var1);
                        if (var7 != 0) {
                           this.X[var4] = Class_r.a(-20084, var1);
                           var4++;
                        } else {
                           var4++;
                        }
                        continue;
                     }

                     if (var5 != 3) {
                        var4++;
                        continue;
                     }

                     if (var7 == 0) {
                        this.X[var4] = Class_r.a(-20084, var1);
                        var4++;
                        continue;
                     }
                  }

                  this.X[var4] = Class_mk.a(3, var1);
                  if (var7 != 0) {
                     this.X[var4] = Class_wc.a((byte)116, var1);
                     if (var7 != 0) {
                        this.X[var4] = Class_md.a((byte)121, var1);
                        if (var7 != 0) {
                           this.X[var4] = Class_r.a(-20084, var1);
                           var4++;
                        } else {
                           var4++;
                        }
                     } else {
                        var4++;
                     }
                  } else {
                     var4++;
                  }
               } while (this.X.length > var4);
            }
         }
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "td.K(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   public Class_td() {
      super(0, true);
   }

   public static void g(int var0) {
      try {
         U = null;
         if (var0 > -62) {
            g(-27);
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "td.C(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private final void a(int[][] var1, int var2) {
      int var9 = client.lb;

      try {
         R++;
         int var3 = Class_ld.X;
         if (var2 == 23891) {
            int var4 = Class_aa.K;
            Class_uh.a(128, var1);
            Class_dd.a(Class_fa.rc, 0, 0, 20685, Class_ed.d);
            if (this.X != null) {
               int var5 = 0;
               if (var9 != 0 || ~var5 > ~this.X.length) {
                  do {
                     Class_bh var6 = this.X[var5];
                     int var8 = var6.h;
                     int var7 = var6.d;
                     if (~var7 > -1) {
                        if (var8 >= 0) {
                           var6.a(true, var3, var4);
                           if (var9 != 0) {
                              if (var8 < 0) {
                                 var6.b(var4, 103, var3);
                                 if (var9 != 0) {
                                    var6.a(var3, 23700, var4);
                                    var5++;
                                 } else {
                                    var5++;
                                 }
                              } else {
                                 var6.a(var3, 23700, var4);
                                 var5++;
                              }
                           } else {
                              var5++;
                           }
                        } else {
                           var5++;
                        }
                     } else if (var8 < 0) {
                        var6.b(var4, 103, var3);
                        if (var9 != 0) {
                           var6.a(var3, 23700, var4);
                           var5++;
                        } else {
                           var5++;
                        }
                     } else {
                        var6.a(var3, 23700, var4);
                        var5++;
                     }
                  } while (~var5 > ~this.X.length);
               }
            }
         }
      } catch (RuntimeException var10) {
         throw Class_sh.a(var10, "td.B(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void h(int var0) {
      int var2 = client.lb;

      try {
         if (var0 == 0) {
            W++;
            Class_ai var1 = (Class_ai)Class_se.Z.e((byte)76);
            if (var2 != 0 || var1 != null) {
               do {
                  if (var1.C > 0) {
                     var1.C--;
                  }

                  label89: {
                     if (~var1.C != -1) {
                        if (var1.A > 0) {
                           var1.A--;
                        }

                        if (~var1.A != -1 || var1.x < 1 || var1.q < 1 || var1.x > 102 || ~var1.q < -103 || ~var1.E <= -1 && !Class_vd.a(var1.E, var1.w, 28446)) {
                           break label89;
                        }

                        Class_ga.a(var0, var1.s, var1.E, var1.x, var1.v, var1.w, var1.t, var1.q);
                        var1.A = -1;
                        if (~var1.u == ~var1.E && var1.u == -1) {
                           var1.c(-17554);
                           if (var2 == 0) {
                              break label89;
                           }
                        }

                        if (~var1.u != ~var1.E || var1.z != var1.t || ~var1.p != ~var1.w) {
                           break label89;
                        }

                        var1.c(-17554);
                        if (var2 == 0) {
                           break label89;
                        }
                     }

                     if (var1.u < 0 || Class_vd.a(var1.u, var1.p, 28446)) {
                        Class_ga.a(0, var1.s, var1.u, var1.x, var1.v, var1.p, var1.z, var1.q);
                        var1.c(-17554);
                     }
                  }

                  var1 = (Class_ai)Class_se.Z.c((byte)104);
               } while (var1 != null);
            }
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "td.D(" + var0 + ')');
      }
   }

   final int[] a(byte var1, int var2) {
      try {
         if (var1 != -61) {
            U = null;
         }

         S++;
         int[] var3 = super.H.a(false, var2);
         if (super.H.s) {
            this.a(super.H.a(var1 ^ 32023), 23891);
         }

         return var3;
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "td.G(" + var1 + ',' + var2 + ')');
      }
   }
}
