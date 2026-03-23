final class Class_s extends Class_lf {
   private static Class_r Q = Class_tc.a(43, "Loaded wordpack");
   static int R;
   private static Class_r S = Class_tc.a(43, "Loaded fonts");
   static int T;
   static Class_r U = Class_tc.a(43, "<col=00ff80>");
   static int[] V = new int[5];
   static Class_r W = Class_tc.a(43, "mapfunction");
   private int X = 4;
   static int Y;
   static Class_r Z = Q;
   static Class_r ab = S;
   static boolean[] bb = new boolean[200];
   static int[] cb;
   private int db = 4;

   public Class_s() {
      super(1, false);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int[][] a(int var1, boolean var2) {
      int var16 = client.lb;

      try {
         if (!var2) {
            this.a(null, 104, 10);
         }

         Y++;
         int[][] var3 = super.K.a(var1, (byte)85);
         if (super.K.q) {
            int[][] var4;
            int var5;
            label37: {
               int var6 = Class_aa.K / this.X;
               var5 = Class_ld.X / this.db;
               if (var6 > 0) {
                  int var7 = var1 % var6;
                  var4 = this.c(-93, 0, Class_aa.K * var7 / var6);
                  if (var16 == 0) {
                     break label37;
                  }
               }

               var4 = this.c(-24, 0, 0);
            }

            int[] var18 = var4[0];
            int[] var8 = var4[1];
            int[] var11 = var3[1];
            int[] var10 = var3[0];
            int[] var9 = var4[2];
            int[] var12 = var3[2];
            int var13 = 0;
            if (var16 != 0 || ~var13 > ~Class_ld.X) {
               do {
                  int var14;
                  if (~var5 < -1) {
                     int var15 = var13 % var5;
                     var14 = Class_ld.X * var15 / var5;
                     if (var16 != 0) {
                        var14 = 0;
                     }
                  } else {
                     var14 = 0;
                  }

                  var10[var13] = var18[var14];
                  var11[var13] = var8[var14];
                  var12[var13] = var9[var14];
               } while (~(++var13) > ~Class_ld.X);
            }
         }

         return var3;
      } catch (RuntimeException var17) {
         throw Class_sh.a(var17, "s.A(" + var1 + ',' + var2 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int[] a(byte var1, int var2) {
      int var9 = client.lb;

      try {
         R++;
         int[] var3 = super.H.a(false, var2);
         if (super.H.s) {
            int[] var4;
            int var5;
            label40: {
               int var6 = Class_aa.K / this.X;
               var5 = Class_ld.X / this.db;
               if (var6 <= 0) {
                  var4 = this.b(0, 0, 29149);
                  if (var9 == 0) {
                     break label40;
                  }
               }

               int var7 = var2 % var6;
               var4 = this.b(0, Class_aa.K * var7 / var6, 29149);
            }

            int var11 = 0;
            if (var9 != 0 || ~var11 > ~Class_ld.X) {
               do {
                  if (~var5 >= -1) {
                     var3[var11] = var4[0];
                     if (var9 == 0) {
                        var11++;
                        continue;
                     }
                  }

                  int var8 = var11 % var5;
                  var3[var11] = var4[Class_ld.X * var8 / var5];
                  var11++;
               } while (~var11 > ~Class_ld.X);
            }
         }

         if (var1 != -61) {
            g(57);
         }

         return var3;
      } catch (RuntimeException var10) {
         throw Class_sh.a(var10, "s.G(" + var1 + ',' + var2 + ')');
      }
   }

   public static void g(int var0) {
      try {
         S = null;
         ab = null;
         U = null;
         V = null;
         Z = null;
         int var1 = -47 % ((49 - var0) / 53);
         W = null;
         bb = null;
         Q = null;
         cb = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "s.B(" + var0 + ')');
      }
   }

   final void a(Class_lh var1, int var2, int var3) {
      try {
         if (var3 != -1) {
            this.a((byte)87, -105);
         }

         T++;
         if (~var2 != -1) {
            if (var2 != 1) {
               return;
            }

            if (client.lb == 0) {
               this.X = var1.n(-6677);
               return;
            }
         }

         this.db = var1.n(var3 ^ 6676);
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "s.K(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }
}
