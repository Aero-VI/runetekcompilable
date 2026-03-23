final class Class_mh extends Class_lf {
   static int[] Q;
   static short R = 32767;
   private int S = 1;
   static Class_r T = Class_tc.a(43, " x ");
   static int U;
   static int V;
   static Class_tf W;
   static float X;
   static int Y;
   private int Z = 1;
   static int ab;

   public static void d(byte var0) {
      try {
         T = null;
         Q = null;
         W = null;
         if (var0 <= 10) {
            d(31, -36, 15);
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "mh.C(" + var0 + ')');
      }
   }

   public Class_mh() {
      super(1, false);
   }

   final void a(Class_lh var1, int var2, int var3) {
      try {
         if (var3 != -1) {
            R = -91;
         }

         Y++;
         if (~var2 != -1) {
            if (var2 == 1) {
               this.S = var1.n(-6677);
               return;
            }

            if (~var2 != -3) {
               return;
            }

            if (client.lb == 0) {
               super.C = var1.n(var3 ^ 6676) == 1;
               return;
            }
         }

         this.Z = var1.n(-6677);
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "mh.K(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int[][] a(int var1, boolean var2) {
      int var24 = client.lb;

      try {
         if (!var2) {
            e(123, -69, -104);
         }

         ab++;
         int[][] var3 = super.K.a(var1, (byte)-5);
         if (super.K.q) {
            int var4 = this.S + (this.S - -1);
            int var5 = 65536 / var4;
            int var6 = 1 + (this.Z - -this.Z);
            int[][][] var8 = new int[var4][][];
            int var7 = 65536 / var6;
            int var9 = -this.S + var1;
            if (var24 != 0 || ~(this.S + var1) <= ~var9) {
               while (true) {
                  int[][] var10 = this.c(-53, 0, var9 & Class_fa.rc);
                  int[][] var11 = new int[3][Class_ld.X];
                  int var12 = 0;
                  int var14 = 0;
                  int var13 = 0;
                  int[] var17 = var10[2];
                  int[] var15 = var10[0];
                  int[] var16 = var10[1];
                  int var18 = -this.Z;
                  if (var24 != 0 || var18 <= this.Z) {
                     do {
                        int var19 = var18 & Class_ed.d;
                        var14 += var17[var19];
                        var13 += var16[var19];
                        var12 += var15[var19];
                     } while (++var18 <= this.Z);
                  }

                  int[] var38 = var11[0];
                  int[] var20 = var11[1];
                  int[] var21 = var11[2];
                  int var22 = 0;
                  if (var24 == 0 && ~var22 <= ~Class_ld.X) {
                     var8[-var1 + var9 - -this.S] = var11;
                     if (~(this.S + var1) > ~(++var9)) {
                        break;
                     }
                  } else {
                     do {
                        var38[var22] = var7 * var12 >> 1286472336;
                        var20[var22] = var13 * var7 >> -1207358160;
                        var21[var22] = var14 * var7 >> -1475118032;
                        int var23 = var22 - this.Z & Class_ed.d;
                        var14 -= var17[var23];
                        var12 -= var15[var23];
                        var22++;
                        var13 -= var16[var23];
                        var23 = Class_ed.d & this.Z + var22;
                        var12 += var15[var23];
                        var14 += var17[var23];
                        var13 += var16[var23];
                     } while (~var22 > ~Class_ld.X);

                     var8[-var1 + var9 - -this.S] = var11;
                     if (~(this.S + var1) > ~(++var9)) {
                        break;
                     }
                  }
               }
            }

            int[] var27 = var3[1];
            int[] var26 = var3[0];
            int[] var29 = var3[2];
            int var31 = 0;
            if (var24 != 0 || Class_ld.X > var31) {
               do {
                  int var33 = 0;
                  int var34 = 0;
                  int var35 = 0;
                  int var36 = 0;
                  if (var24 != 0 || ~var36 > ~var4) {
                     do {
                        int[][] var37 = var8[var36];
                        var34 += var37[1][var31];
                        var35 += var37[2][var31];
                        var33 += var37[0][var31];
                     } while (~(++var36) > ~var4);
                  }

                  var26[var31] = var5 * var33 >> 1830240528;
                  var27[var31] = var34 * var5 >> -1467325008;
                  var29[var31] = var35 * var5 >> -1725579088;
               } while (Class_ld.X > ++var31);
            }
         }

         return var3;
      } catch (RuntimeException var25) {
         throw Class_sh.a(var25, "mh.A(" + var1 + ',' + var2 + ')');
      }
   }

   static final Class_je d(int var0, int var1, int var2) {
      Class_aa var3 = Class_ck.d[var0][var1][var2];
      if (var3 == null) {
         return null;
      } else {
         Class_je var4 = var3.u;
         var3.u = null;
         return var4;
      }
   }

   static final Class_hd e(int var0, int var1, int var2) {
      Class_aa var3 = Class_ck.d[var0][var1][var2];
      if (var3 == null) {
         return null;
      } else {
         Class_hd var4 = var3.M;
         var3.M = null;
         return var4;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int[] a(byte var1, int var2) {
      int var15 = client.lb;

      try {
         int[] var3 = super.H.a(false, var2);
         if (var1 != -61) {
            return null;
         } else {
            if (super.H.s) {
               int var6 = 1 + this.Z + this.Z;
               int var4 = 1 + this.S + this.S;
               int var7 = 65536 / var6;
               int[][] var8 = new int[var4][];
               int var9 = -this.S + var2;
               if (var15 != 0 || ~var9 >= ~(var2 - -this.S)) {
                  while (true) {
                     int[] var10 = this.b(0, Class_fa.rc & var9, 29149);
                     int var12 = 0;
                     int var13 = -this.Z;
                     if (var15 != 0) {
                        var12 += var10[Class_ed.d & var13];
                        var13++;
                     }

                     while (~var13 >= ~this.Z) {
                        var12 += var10[Class_ed.d & var13];
                        var13++;
                     }

                     int[] var11 = new int[Class_ld.X];
                     int var14 = 0;
                     if (var15 == 0 && var14 >= Class_ld.X) {
                        var8[-var2 + this.S + var9] = var11;
                        if (~(++var9) < ~(var2 - -this.S)) {
                           break;
                        }
                     } else {
                        do {
                           var11[var14] = var7 * var12 >> 280919120;
                           var12 -= var10[Class_ed.d & var14 + -this.Z];
                           var12 += var10[Class_ed.d & ++var14 + this.Z];
                        } while (var14 < Class_ld.X);

                        var8[-var2 + this.S + var9] = var11;
                        if (~(++var9) < ~(var2 - -this.S)) {
                           break;
                        }
                     }
                  }
               }

               int var5 = 65536 / var4;
               int var17 = 0;
               if (var15 != 0 || Class_ld.X > var17) {
                  do {
                     int var18 = 0;
                     int var20 = 0;
                     if (var15 != 0 || var4 > var20) {
                        do {
                           var18 += var8[var20][var17];
                        } while (var4 > ++var20);
                     }

                     var3[var17] = var18 * var5 >> 1060602928;
                  } while (Class_ld.X > ++var17);
               }
            }

            U++;
            return var3;
         }
      } catch (RuntimeException var16) {
         throw Class_sh.a(var16, "mh.G(" + var1 + ',' + var2 + ')');
      }
   }
}
