final class Class_ih extends Class_lf {
   static int Q;
   static int[] R = new int[1000];
   static int S;
   static int T;
   static Class_r U = Class_tc.a(43, "3D)2Softwarebibliothek gestartet)3");
   static int V = -1;
   static int[][][] W;
   static int X;
   static int Y = 2;
   static int Z;
   static int ab;
   static long[] bb = new long[500];

   public static void g(int var0) {
      try {
         if (var0 == 0) {
            W = null;
            U = null;
            bb = null;
            R = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ih.B(" + var0 + ')');
      }
   }

   public Class_ih() {
      super(1, false);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int[] a(byte var1, int var2) {
      int var6 = client.lb;

      try {
         if (var1 != -61) {
            this.d(64, 69, 4);
         }

         Q++;
         int[] var3 = super.H.a(false, var2);
         if (super.H.s) {
            int var4 = 0;
            if (var6 != 0 || var4 < Class_ld.X) {
               do {
                  this.d(var4, var1 + 2109, var2);
                  int[] var5 = this.b(0, Class_bg.l, 29149);
                  var3[var4] = var5[Class_tc.o];
               } while (++var4 < Class_ld.X);
            }
         }

         return var3;
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "ih.G(" + var1 + ',' + var2 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int[][] a(int var1, boolean var2) {
      int var9 = client.lb;

      try {
         X++;
         if (!var2) {
            bb = null;
         }

         int[][] var3 = super.K.a(var1, (byte)-126);
         if (super.K.q) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = 0;
            if (var9 != 0 || var7 < Class_ld.X) {
               do {
                  this.d(var7, 2048, var1);
                  int[][] var8 = this.c(-79, 0, Class_bg.l);
                  var4[var7] = var8[0][Class_tc.o];
                  var5[var7] = var8[1][Class_tc.o];
                  var6[var7] = var8[2][Class_tc.o];
               } while (++var7 < Class_ld.X);
            }
         }

         return var3;
      } catch (RuntimeException var10) {
         throw Class_sh.a(var10, "ih.A(" + var1 + ',' + var2 + ')');
      }
   }

   final void a(Class_lh var1, int var2, int var3) {
      try {
         ab++;
         if (var3 == ~var2) {
            super.C = ~var1.n(-6677) == -2;
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "ih.K(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   private final void d(int var1, int var2, int var3) {
      int var7 = client.lb;

      try {
         label83: {
            T++;
            int var4 = Class_ce.gb[var1];
            int var5 = Class_l.y[var3];
            float var6 = (float)Math.atan2(var4 - var2, var5 + -2048);
            if (var6 >= -3.141592653589793 && var6 <= -2.356194490192345) {
               Class_tc.o = var1;
               Class_bg.l = var3;
               if (var7 == 0) {
                  break label83;
               }
            }

            if (var6 <= -1.5707963267948966 && var6 >= -2.356194490192345) {
               Class_bg.l = var1;
               Class_tc.o = var3;
               if (var7 == 0) {
                  break label83;
               }
            }

            if (var6 <= -0.7853981633974483 && var6 >= -1.5707963267948966) {
               Class_bg.l = var1;
               Class_tc.o = -var3 + Class_ld.X;
               if (var7 == 0) {
                  break label83;
               }
            }

            if (var6 <= 0.0F && var6 >= -0.7853981633974483) {
               Class_tc.o = var1;
               Class_bg.l = Class_aa.K - var3;
               if (var7 == 0) {
                  break label83;
               }
            }

            if (!(var6 >= 0.0F) || !(var6 <= 0.7853981633974483)) {
               if (!(var6 >= 0.7853981633974483) || !(var6 <= 1.5707963267948966)) {
                  if (var6 >= 1.5707963267948966 && var6 <= 2.356194490192345) {
                     Class_tc.o = var3;
                     Class_bg.l = -var1 + Class_aa.K;
                     if (var7 == 0) {
                        break label83;
                     }
                  }

                  if (!(var6 >= 2.356194490192345) || !(var6 <= 3.141592653589793)) {
                     break label83;
                  }

                  Class_bg.l = var3;
                  Class_tc.o = -var1 + Class_ld.X;
                  if (var7 == 0) {
                     break label83;
                  }
               }

               Class_bg.l = Class_aa.K + -var1;
               Class_tc.o = Class_ld.X - var3;
               if (var7 == 0) {
                  break label83;
               }
            }

            Class_tc.o = -var1 + Class_ld.X;
            Class_bg.l = Class_aa.K + -var3;
         }

         Class_tc.o = Class_tc.o & Class_ed.d;
         Class_bg.l = Class_bg.l & Class_fa.rc;
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "ih.C(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }
}
