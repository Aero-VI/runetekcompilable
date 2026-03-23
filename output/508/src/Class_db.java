import java.util.Random;

final class Class_db extends Class_lf {
   static Class_fa[] Q = new Class_fa[2048];
   private int R;
   private int[] S;
   static Class_wa T;
   private int U;
   static int V = 0;
   private int W;
   private int X;
   private int[][] Y;
   static Class_r Z = Class_tc.a(43, "<img=1>");
   static int ab;
   private int bb = 0;
   private int[][] cb;
   static int db;
   static int eb = 0;
   private int fb = 1024;
   static int gb;
   private int hb;
   static int ib = 2;
   private int jb;
   static int[][][] kb = new int[2][][];
   static int lb;
   private int mb;
   static int nb;
   private int ob;
   static int pb;
   static int qb;
   private int rb;
   static Class_af sb;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int[] a(byte var1, int var2) {
      int var17 = client.lb;

      try {
         int[] var3;
         var3 = super.H.a(false, var2);
         label135:
         if (super.H.s) {
            int var7 = 0;
            int var9 = this.bb + Class_l.y[var2];
            if (var17 != 0) {
               var9 += 4096;
            }

            while (~var9 > -1) {
               var9 += 4096;
            }

            if (var17 != 0) {
               var9 -= 4096;
            }

            while (~var9 < -4097) {
               var9 -= 4096;
            }

            if (var17 != 0 || var7 < this.R) {
               while (~this.S[var7] >= ~var9) {
                  if (++var7 >= this.R) {
                     break;
                  }
               }
            }

            int var16 = this.S[var7 - 1];
            int var11 = var7 - 1;
            boolean var12 = ~(1 & var7) == -1;
            int var15 = this.S[var7];
            if (~var9 >= ~(var16 + this.X) || -this.X + var15 <= var9) {
               Class_gb.a(var3, 0, Class_ld.X, 0);
               if (var17 == 0) {
                  break label135;
               }
            }

            int var4 = 0;
            if (var17 != 0 || ~var4 > ~Class_ld.X) {
               do {
                  int var6 = 0;
                  int var5 = !var12 ? -this.jb : this.jb;
                  int var8 = Class_ce.gb[var4] + (this.ob * var5 >> 523047916);
                  if (var17 != 0) {
                     var8 += 4096;
                  }

                  while (~var8 > -1) {
                     var8 += 4096;
                  }

                  if (var17 != 0) {
                     var8 -= 4096;
                  }

                  while (var8 > 4096) {
                     var8 -= 4096;
                  }

                  if (var17 != 0 || ~this.mb < ~var6) {
                     while (var8 >= this.Y[var11][var6]) {
                        if (~this.mb >= ~(++var6)) {
                           break;
                        }
                     }
                  }

                  int var14 = this.Y[var11][var6];
                  int var10 = var6 - 1;
                  int var13 = this.Y[var11][var10];
                  if (~(var13 + this.X) > ~var8) {
                     if (~var8 > ~(var14 + -this.X)) {
                        var3[var4] = this.cb[var11][var10];
                        if (var17 != 0) {
                           var3[var4] = 0;
                           var4++;
                        } else {
                           var4++;
                        }
                     } else {
                        var3[var4] = 0;
                        var4++;
                     }
                  } else {
                     var3[var4] = 0;
                     var4++;
                  }
               } while (~var4 > ~Class_ld.X);
            }
         }

         gb++;
         if (var1 != -61) {
            this.a((byte)-77, -48);
         }

         return var3;
      } catch (RuntimeException var18) {
         throw Class_sh.a(var18, "db.G(" + var1 + ',' + var2 + ')');
      }
   }

   final void a(byte var1) {
      try {
         this.h(0);
         if (var1 > -22) {
            this.S = null;
         }

         nb++;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "db.I(" + var1 + ')');
      }
   }

   public static void g(int var0) {
      try {
         if (var0 >= -97) {
            a(null, 122);
         }

         Z = null;
         kb = null;
         T = null;
         Q = null;
         sb = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "db.C(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private final void h(int var1) {
      int var9 = client.lb;

      try {
         Random var2 = new Random(this.R);
         this.X = this.U / 2;
         pb++;
         this.ob = 4096 / this.mb;
         this.cb = new int[this.R][this.mb];
         this.S = new int[1 + this.R];
         this.Y = new int[this.R][1 + this.mb];
         int var3 = this.ob / 2;
         this.rb = 4096 / this.R;
         this.S[0] = 0;
         int var4 = this.rb / 2;
         int var5 = var1;
         if (var9 == 0 && ~var1 <= ~this.R) {
            this.S[this.R] = 4096;
         } else {
            while (true) {
               if (var5 > 0) {
                  int var6 = this.rb;
                  int var7 = (-2048 + Class_jb.a(4096, (byte)70, var2)) * this.W >> 247639212;
                  var6 += var4 * var7 >> -1309365524;
                  this.S[var5] = this.S[-1 + var5] - -var6;
               }

               this.Y[var5][0] = 0;
               int var12 = 0;
               if (var9 == 0 && ~this.mb >= ~var12) {
                  this.Y[var5][this.mb] = 4096;
                  if (~(++var5) <= ~this.R) {
                     this.S[this.R] = 4096;
                     return;
                  }
               } else {
                  do {
                     if (var12 > 0) {
                        int var13 = this.ob;
                        int var8 = (Class_jb.a(4096, (byte)70, var2) + -2048) * this.hb >> -1625992660;
                        var13 += var3 * var8 >> -1496180564;
                        this.Y[var5][var12] = this.Y[var5][-1 + var12] - -var13;
                     }

                     this.cb[var5][var12] = this.fb <= 0 ? 4096 : -Class_jb.a(this.fb, (byte)70, var2) + 4096;
                  } while (~this.mb < ~(++var12));

                  this.Y[var5][this.mb] = 4096;
                  if (~(++var5) <= ~this.R) {
                     this.S[this.R] = 4096;
                     return;
                  }
               }
            }
         }
      } catch (RuntimeException var10) {
         throw Class_sh.a(var10, "db.B(" + var1 + ')');
      }
   }

   final void a(Class_lh var1, int var2, int var3) {
      int var5 = client.lb;

      try {
         label76: {
            label75: {
               label74: {
                  label73: {
                     label72: {
                        label71: {
                           label70: {
                              label69: {
                                 if (var2 != 0) {
                                    if (var2 == 1) {
                                       break label69;
                                    }

                                    if (var2 == 2) {
                                       break label70;
                                    }

                                    if (~var2 == -4) {
                                       break label71;
                                    }

                                    if (~var2 == -5) {
                                       break label72;
                                    }

                                    if (var2 == 5) {
                                       break label73;
                                    }

                                    if (~var2 == -7) {
                                       break label74;
                                    }

                                    if (~var2 != -8) {
                                       break label76;
                                    }

                                    if (var5 == 0) {
                                       break label75;
                                    }
                                 }

                                 this.mb = var1.n(-6677);
                                 if (var5 == 0) {
                                    break label76;
                                 }
                              }

                              this.R = var1.n(var3 ^ 6676);
                              if (var5 == 0) {
                                 break label76;
                              }
                           }

                           this.hb = var1.k(1355769544);
                           if (var5 == 0) {
                              break label76;
                           }
                        }

                        this.W = var1.k(1355769544);
                        if (var5 == 0) {
                           break label76;
                        }
                     }

                     this.jb = var1.k(1355769544);
                     if (var5 == 0) {
                        break label76;
                     }
                  }

                  this.bb = var1.k(var3 ^ -1355769545);
                  if (var5 == 0) {
                     break label76;
                  }
               }

               this.U = var1.k(1355769544);
               if (var5 == 0) {
                  break label76;
               }
            }

            this.fb = var1.k(1355769544);
         }

         db++;
         if (var3 != -1) {
            this.ob = 120;
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "db.K(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   static final void a() {
      for (int var0 = 0; var0 < Class_od.r; var0++) {
         for (int var1 = 0; var1 < Class_ra.g; var1++) {
            for (int var2 = 0; var2 < Class_qb.m; var2++) {
               Class_ck.d[var0][var1][var2] = null;
            }
         }
      }

      for (int var4 = 0; var4 < Class_ij.b; var4++) {
         Class_vb.c[var4] = null;
      }

      Class_ij.b = 0;

      for (int var5 = 0; var5 < Class_uc.x; var5++) {
         Class_li.e[var5] = null;
      }

      Class_uc.x = 0;

      for (int var3 = 0; var3 < Class_cg.v.length; var3++) {
         Class_cg.v[var3] = null;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(Class_eh var0, int var1) {
      int var3 = client.lb;

      try {
         ab++;
         Class_nf var2 = (Class_nf)Class_hh.d.e((byte)76);
         if (var3 == 0 && var2 == null) {
            if (var1 != 2) {
               T = null;
            }
         } else {
            while (var2.L != var0) {
               var2 = (Class_nf)Class_hh.d.c((byte)80);
               if (var2 == null) {
                  if (var1 != 2) {
                     T = null;
                     return;
                  }

                  return;
               }
            }

            if (var2.r != null) {
               Class_nd.m.a(var2.r);
               var2.r = null;
            }

            var2.c(-17554);
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "db.E(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
      }
   }

   public Class_db() {
      super(0, true);
      this.W = 204;
      this.jb = 1024;
      this.U = 81;
      this.mb = 4;
      this.hb = 409;
      this.R = 8;
   }

   static final void d(byte var0) {
      try {
         if (var0 == -88) {
            lb++;
            Class_hk.G.b((byte)94);
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "db.D(" + var0 + ')');
      }
   }
}
