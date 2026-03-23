final class Class_ad {
   static Class_ha a;
   static int b;
   static short[] c = new short[]{6798, 8741, 25238, 4626, 4550};
   static int d;
   static int e;
   static byte[][] f;
   static int[] g = new int[2000];
   static Class_hb[] h = new Class_hb[50];
   private int[] i;
   private Class_lf[] j;
   private int[] k;
   static int l = 0;
   static int m = -1;
   static int n;
   static int o;
   private Class_lf p;
   private Class_lf q;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int[] a(boolean var1, boolean var2, Class_cj var3, Class_ri var4, int var5, int var6, double var7, int var9) {
      int var24 = client.lb;

      try {
         Class_od.a((byte)47, var7);
         int[] var10 = new int[var5 * var6];
         Class_hf.e = var4;
         Class_nk.d = var3;
         Class_ii.a(var5, var6, true);
         int var11 = 0;
         if (var24 != 0) {
            this.j[var11].a(var5, -256, var6);
            var11++;
         }

         while (this.j.length > var11) {
            this.j[var11].a(var5, -256, var6);
            var11++;
         }

         int var12;
         int var13;
         byte var14;
         label123: {
            e++;
            if (var2) {
               var14 = -1;
               var12 = var5 - 1;
               var13 = -1;
               if (var24 == 0) {
                  break label123;
               }
            }

            var13 = var5;
            var12 = 0;
            var14 = 1;
         }

         int var15 = 0;
         if (var9 != 2000) {
            c = null;
         }

         label110: {
            int var16 = 0;
            if (var24 != 0) {
               if (var1) {
                  var15 = var16;
               }
            } else {
               if (~var6 >= ~var16) {
                  break label110;
               }

               if (var1) {
                  var15 = var16;
               }
            }

            while (true) {
               int[] var17;
               int[] var18;
               int[] var19;
               label91: {
                  if (this.p.C) {
                     int[] var20 = this.p.a((byte)-61, var16);
                     var19 = var20;
                     var17 = var20;
                     var18 = var20;
                     if (var24 == 0) {
                        break label91;
                     }
                  }

                  int[][] var27 = this.p.a(var16, true);
                  var17 = var27[0];
                  var19 = var27[2];
                  var18 = var27[1];
               }

               int var28 = var12;
               if (var24 == 0 && ~var12 == ~var13) {
                  if (~var6 >= ~(++var16)) {
                     break;
                  }

                  if (var1) {
                     var15 = var16;
                  }
               } else {
                  do {
                     int var21 = var17[var28] >> 437217892;
                     if (var21 > 255) {
                        var21 = 255;
                     }

                     if (~var21 > -1) {
                        var21 = 0;
                     }

                     var21 = Class_ke.l[var21];
                     int var22 = var18[var28] >> -1320973244;
                     if (~var22 < -256) {
                        var22 = 255;
                     }

                     if (var22 < 0) {
                        var22 = 0;
                     }

                     var22 = Class_ke.l[var22];
                     int var23 = var19[var28] >> -528239868;
                     if (var23 > 255) {
                        var23 = 255;
                     }

                     if (var23 < 0) {
                        var23 = 0;
                     }

                     var23 = Class_ke.l[var23];
                     var10[var15++] = (var22 << -2094660728) + (var21 << -549549072) - -var23;
                     if (var1) {
                        var15 += -1 + var5;
                     }

                     var28 += var14;
                  } while (~var28 != ~var13);

                  if (~var6 >= ~(++var16)) {
                     break;
                  }

                  if (var1) {
                     var15 = var16;
                  }
               }
            }
         }

         int var26 = 0;
         if (var24 != 0) {
            this.j[var26].e(var9 + -1992);
            var26++;
         }

         while (~var26 > ~this.j.length) {
            this.j[var26].e(var9 + -1992);
            var26++;
         }

         return var10;
      } catch (RuntimeException var25) {
         throw Class_sh.a(
            var25,
            "ad.B("
               + var1
               + ','
               + var2
               + ','
               + (var3 != null ? "{...}" : "null")
               + ','
               + (var4 != null ? "{...}" : "null")
               + ','
               + var5
               + ','
               + var6
               + ','
               + var7
               + ','
               + var9
               + ')'
         );
      }
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         label25: {
            if (~Class_ga.v >= ~(-var3 + var1) && var1 - -var3 <= Class_tg.r && var4 - var3 >= Class_ff.d && Class_hh.h >= var4 + var3) {
               Class_ba.a(var3, var2, var1, true, var6, var0, var4);
               if (client.lb == 0) {
                  break label25;
               }
            }

            Class_cg.a(var6, var4, var0, var2, var1, -135, var3);
         }

         if (var5 <= 72) {
            a(-99, 50, 81, 76, -97, 76, null, 15, 29L);
         }

         b++;
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "ad.F(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final boolean a(Class_ri var1, int var2, Class_cj var3) {
      int var6 = client.lb;

      try {
         n++;
         int var4 = var2;
         if (var6 != 0 || var2 < this.k.length) {
            do {
               if (!var3.g(this.k[var4], 0)) {
                  return false;
               }
            } while (++var4 < this.k.length);
         }

         int var5 = 0;
         if (var6 == 0 && ~var5 <= ~this.i.length) {
            return true;
         } else {
            while (var1.a(true, this.i[var5])) {
               if (~(++var5) <= ~this.i.length) {
                  return true;
               }
            }

            return false;
         }
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "ad.E(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
      }
   }

   static final boolean a(int var0, int var1, int var2, int var3, int var4, int var5, Class_a var6, int var7, long var8) {
      if (var6 == null) {
         return true;
      } else {
         int var10 = var1 * 128 + 64 * var4;
         int var11 = var2 * 128 + 64 * var5;
         return Class_ma.a(var0, var1, var2, var4, var5, var10, var11, var3, var6, var7, false, var8);
      }
   }

   public static void a(int var0) {
      try {
         c = null;
         g = null;
         a = null;
         int var1 = -17 % ((var0 - -24) / 35);
         f = null;
         h = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ad.A(" + var0 + ')');
      }
   }

   static final int b(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         if ((1 & var0) == 1) {
            int var7 = var2;
            var2 = var4;
            var4 = var7;
         }

         d++;
         if (var5 > -75) {
            a(-23);
         }

         var6 &= 3;
         if (var6 == 0) {
            return var3;
         } else if (~var6 == -2) {
            return var1;
         } else {
            return ~var6 == -3 ? 7 - var3 - (var2 - 1) : 7 - (var1 - -var4) - -1;
         }
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "ad.D(" + var0 + 44 + var1 + 44 + var2 + 44 + var3 + 44 + var4 + 44 + var5 + 44 + var6 + 41);
      }
   }

   public Class_ad() {
      try {
         this.i = new int[0];
         this.k = new int[0];
         this.p = new Class_ee();
         this.p.N = 1;
         this.q = new Class_ee();
         this.q.N = 1;
         this.j = new Class_lf[]{this.p, this.q};
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ad.<init>(" + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   Class_ad(Class_lh var1) {
      super();
      int var13 = client.lb;

      try {
         int var2 = var1.n(-6677);
         int var3 = 0;
         this.j = new Class_lf[var2];
         int var4 = 0;
         int[][] var5 = new int[var2][];
         int var6 = 0;
         if (var13 != 0 || ~var2 < ~var6) {
            do {
               Class_lf var7 = Class_sc.a(true, var1);
               if (~var7.d(9485) <= -1) {
                  var3++;
                  if (var7.c((byte)-116) >= 0) {
                     var4++;
                  }
               } else if (var7.c((byte)-116) >= 0) {
                  var4++;
               }

               int var8 = var7.M.length;
               var5[var6] = new int[var8];
               int var9 = 0;
               if (var13 != 0) {
                  var5[var6][var9] = var1.n(-6677);
                  var9++;
               }

               while (var8 > var9) {
                  var5[var6][var9] = var1.n(-6677);
                  var9++;
               }

               this.j[var6] = var7;
            } while (~var2 < ~(++var6));
         }

         this.i = new int[var4];
         var4 = 0;
         this.k = new int[var3];
         var3 = 0;
         int var19 = 0;
         if (var13 == 0 && ~var2 >= ~var19) {
            this.p = this.j[var1.n(-6677)];
            this.q = this.j[var1.n(-6677)];
            var5 = null;
         } else {
            do {
               Class_lf var20 = this.j[var19];
               int var21 = var20.M.length;
               int var10 = 0;
               if (var13 != 0) {
                  var20.M[var10] = this.j[var5[var19][var10]];
                  var10++;
               }

               while (var10 < var21) {
                  var20.M[var10] = this.j[var5[var19][var10]];
                  var10++;
               }

               int var11 = var20.d(9485);
               int var12 = var20.c((byte)-127);
               if (~var11 < -1) {
                  this.k[var3++] = var11;
               }

               if (var12 > 0) {
                  this.i[var4++] = var12;
               }

               var5[var19] = null;
            } while (~var2 < ~(++var19));

            this.p = this.j[var1.n(-6677)];
            this.q = this.j[var1.n(-6677)];
            var5 = null;
         }
      } catch (RuntimeException var14) {
         throw Class_sh.a(var14, "ad.<init>(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }
}
