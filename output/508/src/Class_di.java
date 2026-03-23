import java.math.BigInteger;

final class Class_di extends Class_lf {
   static int Q;
   static int R;
   static int S;
   static Class_h T = new Class_h();
   static BigInteger U = new BigInteger(
      "9431484119947534773405476242098823416177206852045075556673005859802229236458585051597844837479119770056361726819094346360070592289857694387401749674169083"
   );
   static Class_r V = Class_di.X;
   static int W = -1;
   private static Class_r X = Class_tc.a(43, "Allocated memory");
   static Class_r Y = Class_di.Z;
   private static Class_r Z = Class_tc.a(43, "Checking for updates )2 ");
   static Class_sg ab;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int[][] a(int var1, boolean var2) {
      int var12 = client.lb;

      try {
         Q++;
         int[][] var3 = super.K.a(var1, (byte)54);
         if (!var2) {
            return null;
         } else {
            if (super.K.q) {
               int[][] var4 = this.c(-31, 0, var1);
               int[] var5 = var4[0];
               int[] var6 = var4[1];
               int[] var7 = var4[2];
               int[] var8 = var3[0];
               int[] var10 = var3[2];
               int[] var9 = var3[1];
               int var11 = 0;
               if (var12 != 0 || ~Class_ld.X < ~var11) {
                  do {
                     var8[var11] = 4096 + -var5[var11];
                     var9[var11] = -var6[var11] + 4096;
                     var10[var11] = 4096 - var7[var11];
                  } while (~Class_ld.X < ~(++var11));
               }
            }

            return var3;
         }
      } catch (RuntimeException var13) {
         throw Class_sh.a(var13, "di.A(" + var1 + ',' + var2 + ')');
      }
   }

   public static void g(int var0) {
      try {
         X = null;
         Z = null;
         ab = null;
         V = null;
         if (var0 == 4096) {
            U = null;
            Y = null;
            T = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "di.B(" + var0 + ')');
      }
   }

   public Class_di() {
      super(1, false);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int[] a(byte var1, int var2) {
      int var6 = client.lb;

      try {
         int[] var3 = super.H.a(false, var2);
         if (super.H.s) {
            int[] var4 = this.b(0, var2, 29149);
            int var5 = 0;
            if (var6 != 0 || Class_ld.X > var5) {
               do {
                  var3[var5] = -var4[var5] + 4096;
               } while (Class_ld.X > ++var5);
            }
         }

         if (var1 != -61) {
            this.a(null, -83, 113);
         }

         R++;
         return var3;
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "di.G(" + var1 + ',' + var2 + ')');
      }
   }

   final void a(Class_lh var1, int var2, int var3) {
      try {
         if (var3 != -1) {
            ab = null;
         }

         if (var2 == 0) {
            super.C = ~var1.n(-6677) == -2;
         }

         S++;
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "di.K(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }
}
