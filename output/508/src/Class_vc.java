final class Class_vc extends Class_a {
   static Class_r p = Class_tc.a(43, "Schlie-8en");
   static int q;
   private int r;
   static int s;
   static int t;
   private int u;
   private int v;
   static int w = 0;
   private int x = -1;
   private int y;
   static int z;
   static Class_r A = Class_vc.M;
   private int B;
   private int C;
   private int D;
   private Class_dh E = null;
   private int F;
   static int G;
   static int H;
   private int I;
   static int J;
   static Class_r K = Class_vc.M;
   static boolean L = false;
   private static Class_r M = Class_tc.a(43, "green:");
   private int N;
   static int O;
   static int P;
   private Class_uc Q;
   static Class_cj R;
   static int S;

   static final Class_r a(int var0, int var1) {
      try {
         if (var1 != -17516) {
            return null;
         } else {
            J++;
            return Class_o.a(
               var1 ^ -17514,
               new Class_r[]{
                  Class_og.b(0xFF & var0 >> -1240357992, 0),
                  Class_ja.x,
                  Class_og.b(0xFF & var0 >> -1005336016, 0),
                  Class_ja.x,
                  Class_og.b((65479 & var0) >> 918212456, 0),
                  Class_ja.x,
                  Class_og.b(var0 & 0xFF, 0)
               }
            );
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "vc.C(" + var0 + ',' + var1 + ')');
      }
   }

   private final Class_a c(int var1) {
      try {
         if (var1 != 675116226) {
            return null;
         } else {
            q++;
            return this.a(false, 2);
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "vc.H(" + var1 + ')');
      }
   }

   private final Class_a a(boolean var1, int var2) {
      int var20 = client.lb;

      try {
         H++;
         boolean var3 = Class_mg.l != Class_mi.U;
         Class_ub var4 = Class_qe.a(var2 + 89, this.u);
         if (var4.J != null) {
            var4 = var4.b(var2 + -3);
         }

         if (var4 == null) {
            return null;
         } else {
            int var6;
            int var7;
            label113: {
               int var5 = this.D & 3;
               if (var5 == 1 || var5 == 3) {
                  var7 = var4.D;
                  var6 = var4.C;
                  if (var20 == 0) {
                     break label113;
                  }
               }

               var6 = var4.D;
               var7 = var4.C;
            }

            int var8 = this.I - -(var6 >> 1952131809);
            int var10 = (var7 >> -580821599) + this.N;
            int var9 = this.I - -(var6 - -1 >> -1235910239);
            int var11 = this.N - -(1 + var7 >> 1627324641);
            this.a(var8 * 128, var10 * 128, (byte)-95);
            boolean var12 = !var3 && var4.ib && (~this.x != ~var4.vb || this.C != this.y && Class_ok.X >= 2);
            if (var1 && !var12) {
               return null;
            } else {
               int[][] var13 = Class_mi.U[this.v];
               int var15 = (this.I << 1876830119) + (var6 << 135097254);
               int var16 = (var7 << 1252249254) + (this.N << 1882080487);
               boolean var18 = this.E == null;
               int var14 = var13[var9][var11] + var13[var8][var11] + var13[var8][var10] + var13[var9][var10] >> 675116226;
               int[][] var17 = null;
               if (!var3) {
                  if (this.v < 3) {
                     var17 = Class_mi.U[1 + this.v];
                  }
               } else {
                  var17 = Class_mg.l[0];
               }

               Class_h var19;
               label102: {
                  if (this.Q != null) {
                     var19 = var4.a(!var18 ? this.E : Class_uf.bb, this.Q, var12, var15, var14, this.C, this.D, var17, var13, 65535, var16, this.B);
                     if (var20 == 0) {
                        break label102;
                     }
                  }

                  var19 = var4.a(this.B, !var18 ? this.E : Class_uf.bb, var12, (byte)-10, false, var14, this.D, var13, var16, var17, var15);
               }

               if (var2 != 2) {
                  this.a(13, 52, (byte)-73);
               }

               return var19 == null ? null : var19.e;
            }
         }
      } catch (RuntimeException var21) {
         throw Class_sh.a(var21, "vc.E(" + var1 + ',' + var2 + ')');
      }
   }

   public static void d(int var0) {
      try {
         K = null;
         M = null;
         A = null;
         p = null;
         R = null;
         if (var0 > -44) {
            d(-90);
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "vc.F(" + var0 + ')');
      }
   }

   static final void a(int var0, int var1, int var2, int var3, Class_a var4, long var5, Class_a var7, Class_a var8) {
      Class_je var9 = new Class_je();
      var9.p = var4;
      var9.g = var1 * 128 + 64;
      var9.h = var2 * 128 + 64;
      var9.r = var3;
      var9.d = var5;
      var9.f = var7;
      var9.k = var8;
      int var10 = 0;
      Class_aa var11 = Class_ck.d[var0][var1][var2];
      if (var11 != null) {
         for (int var12 = 0; var12 < var11.G; var12++) {
            Class_lj var13 = var11.H[var12];
            if ((var13.k & 4194304L) == 4194304L) {
               int var14 = var13.j.a();
               if (var14 != -32768 && var14 < var10) {
                  var10 = var14;
               }
            }
         }
      }

      var9.b = -var10;
      if (Class_ck.d[var0][var1][var2] == null) {
         Class_ck.d[var0][var1][var2] = new Class_aa(var0, var1, var2);
      }

      Class_ck.d[var0][var1][var2].u = var9;
   }

   static final void e(int var0) {
      try {
         if (var0 != 255) {
            R = null;
         }

         s++;
         if (Class_fb.g != null) {
            Class_od var1 = Class_fb.g;
            synchronized (var1) {
               Class_fb.g = null;
            }
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "vc.G(" + var0 + ')');
      }
   }

   final int a() {
      try {
         z++;
         return this.r;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "vc.D(" + 41);
      }
   }

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      try {
         Class_a var11 = this.c(675116226);
         G++;
         if (var11 != null) {
            var11.a(var1, var2, var3, var4, var5, var6, var7, var8, var9);
            this.r = var11.a();
         }
      } catch (RuntimeException var12) {
         throw Class_sh.a(var12, "vc.A(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ')');
      }
   }

   final void a(int var1, int var2, int var3, int var4, int var5) {
      try {
         t++;
         this.a(128 * ((var5 + -var2 >> -315085247) + var2) + 64, 64 + (var4 - -(var1 + -var4 >> -159060191)) * 128, (byte)-59);
         if (var3 < 96) {
            this.D = 5;
         }
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "vc.B(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Irreducible bytecode has more than 5 nodes in sequence and was not entirely decomposed
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private final void a(int var1, int var2, byte var3) {
      int var8 = client.lb;

      try {
         O++;
         if (this.Q != null) {
            int var4;
            label72: {
               var4 = Class_be.C + -this.F;
               if (~var4 < -101) {
                  if (this.Q.P > 0) {
                     int var5 = -this.Q.P + this.Q.d.length;
                     if (var8 != 0) {
                        var4 -= this.Q.A[this.C];
                        this.C++;
                     }

                     while (~this.C > ~var5 && var4 > this.Q.A[this.C]) {
                        var4 -= this.Q.A[this.C];
                        this.C++;
                     }

                     if (this.C >= var5) {
                        int var6 = 0;
                        int var7 = var5;
                        if (var8 != 0) {
                           var6 += this.Q.A[var5];
                           var7 = var5 + 1;
                        }

                        while (~this.Q.d.length < ~var7) {
                           var6 += this.Q.A[var7];
                           var7++;
                        }

                        var4 %= var6;
                        if (var8 == 0 && ~var4 >= ~this.Q.A[this.C]) {
                           break label72;
                        }
                     } else if (~var4 >= ~this.Q.A[this.C]) {
                        break label72;
                     }
                  } else if (~var4 >= ~this.Q.A[this.C]) {
                     break label72;
                  }
               } else if (~var4 >= ~this.Q.A[this.C]) {
                  break label72;
               }

               do {
                  Class_h.a(false, this.C, var1, this.Q, false, var2);
                  var4 -= this.Q.A[this.C];
                  this.C++;
                  if (this.C >= this.Q.d.length) {
                     this.C = this.C - this.Q.P;
                     if (this.C >= 0) {
                        if (~this.Q.d.length >= ~this.C) {
                           this.Q = null;
                           if (var8 == 0) {
                              break;
                           }
                        }
                     } else {
                        this.Q = null;
                        if (var8 == 0) {
                           break;
                        }
                     }
                  }
               } while (~var4 < ~this.Q.A[this.C]);
            }

            this.F = -var4 + Class_be.C;
         }

         if (var3 >= -25) {
            this.x = 24;
         }
      } catch (RuntimeException var9) {
         throw Class_sh.a(var9, "vc.I(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   Class_vc(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Class_a var9) {
      this.y = -1;
      this.r = -32768;

      try {
         this.I = var5;
         this.N = var6;
         this.B = var2;
         this.v = var4;
         this.u = var1;
         this.D = var3;
         if (var7 != -1) {
            this.Q = Class_kk.a((byte)-36, var7);
            this.F = -1 + Class_be.C;
            this.C = 0;
            if (~this.Q.E == -1 && var9 != null && var9 instanceof Class_vc) {
               Class_vc var10 = (Class_vc)var9;
               if (var10.Q == this.Q) {
                  this.C = var10.C;
                  this.F = var10.F;
                  return;
               }
            }

            if (var8 && this.Q.P != -1) {
               this.C = (int)(this.Q.d.length * Math.random());
               this.F = this.F - (int)(Math.random() * this.Q.A[this.C]);
               return;
            }
         }
      } catch (RuntimeException var11) {
         throw Class_sh.a(
            var11,
            "vc.<init>("
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
               + var6
               + ','
               + var7
               + ','
               + var8
               + ','
               + (var9 != null ? "{...}" : "null")
               + ')'
         );
      }
   }
}
