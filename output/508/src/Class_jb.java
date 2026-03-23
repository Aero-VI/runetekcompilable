import java.util.Random;

abstract class Class_jb extends Class_pe {
   static int J;
   int K;
   static int L;
   int M;
   static long N = 0L;
   static int O;
   static int P;
   int Q;
   static int R;
   int S;
   static int T;
   int U;
   static Class_c V = new Class_c();
   int W;
   static int X;
   static Class_r Y = Class_tc.a(43, "null");
   static Class_wa Z;
   static int ab;
   static Class_r bb = Class_tc.a(43, "W-=hlen Sie eine Welt");

   abstract void c(int var1, int var2);

   final void a(int var1, int var2, int var3, int var4, byte var5) {
      try {
         P++;
         int var6 = this.M << -1286189757;
         var3 = (var6 & 15) + (var3 << -1503069852);
         int var7 = this.U << 758495971;
         var2 = (15 & var7) + (var2 << -563161628);
         int var8 = -44 / ((36 - var5) / 52);
         this.a(var6, var7, var3, var2, var1, var4);
      } catch (RuntimeException var9) {
         throw Class_sh.a(var9, "jb.D(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
      }
   }

   abstract void a(int var1, int var2, int var3, int var4, int var5);

   static final Class_r a(boolean var0, int var1, Class_r[] var2, int var3) {
      try {
         O++;
         int var4 = 0;

         for (int var5 = 0; var5 < var3; var5++) {
            if (var2[var5 + var1] == null) {
               var2[var5 + var1] = Class_jc.w;
            }

            var4 += var2[var1 + var5].G;
         }

         byte[] var6 = new byte[var4];
         int var7 = 0;

         for (int var8 = 0; var3 > var8; var8++) {
            Class_r var9 = var2[var1 - -var8];
            Class_gb.a(var9.h, 0, var6, var7, var9.G);
            var7 += var9.G;
         }

         Class_r var11 = new Class_r();
         var11.G = var4;
         var11.h = var6;
         return !var0 ? null : var11;
      } catch (RuntimeException var10) {
         throw Class_sh.a(var10, "jb.C(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
      }
   }

   abstract void a(int var1, int var2, int var3, int var4, int var5, int var6);

   abstract void d(int var1, int var2);

   static final void a(int var0, Class_cj var1, Class_cj var2) {
      try {
         T++;
         Class_lk.y = var1;
         Class_bb.h = var2;
         Class_uh.d = Class_bb.h.e(3, 0);
         if (var0 >= -102) {
            Z = null;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "jb.H(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ? "{...}" : "null") + ')');
      }
   }

   abstract void a(int var1, int var2, int var3);

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, boolean var1, int var2, int var3, int var4) {
      int var13 = client.lb;

      try {
         Class_fd.a(-var2 + var3, (byte)-17, var0, Class_qd.p[var4], var2 + var3);
         L++;
         int var7 = -var2;
         int var5 = 0;
         if (var1) {
            int var6 = var2;
            byte var8 = -1;
            if (var13 != 0 || ~var2 < ~var5) {
               do {
                  var8 += 2;
                  var5++;
                  var7 += var8;
                  if (var7 >= 0) {
                     var6--;
                     var7 -= var6 << -268852863;
                     int[] var10 = Class_qd.p[var4 - var6];
                     int[] var9 = Class_qd.p[var6 + var4];
                     int var11 = var5 + var3;
                     int var12 = var3 + -var5;
                     Class_fd.a(var12, (byte)-17, var0, var9, var11);
                     Class_fd.a(var12, (byte)-17, var0, var10, var11);
                  }

                  int var16 = -var6 + var3;
                  int[] var18 = Class_qd.p[var4 + -var5];
                  int var15 = var3 + var6;
                  int[] var17 = Class_qd.p[var4 + var5];
                  Class_fd.a(var16, (byte)-17, var0, var17, var15);
                  Class_fd.a(var16, (byte)-17, var0, var18, var15);
               } while (~var6 < ~var5);
            }
         }
      } catch (RuntimeException var14) {
         throw Class_sh.a(var14, "jb.N(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
      }
   }

   abstract void a(int var1, int var2, int var3, int var4);

   abstract void b(int var1, int var2, int var3, int var4);

   static final int a(int var0, byte var1, Random var2) {
      try {
         X++;
         if (~var0 >= -1) {
            throw new IllegalArgumentException();
         } else {
            if (var1 != 70) {
               Z = null;
            }

            if (Class_sg.h(var0, -1)) {
               return (int)((var2.nextInt() & 4294967295L) * var0 >> -1825954720);
            } else {
               int var3 = -2147483648 - (int)(4294967296L % var0);

               int var4;
               do {
                  var4 = var2.nextInt();
               } while (var4 >= var3);

               return Class_rj.a((byte)20, var4, var0);
            }
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "jb.E(" + var0 + 44 + var1 + 44 + (var2 != null ? "{...}" : "null") + 41);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(boolean var0, Class_ik var1) {
      int var5 = client.lb;

      try {
         J++;
         Class_ac var2 = null;

         try {
            Class_ei var3 = var1.a(var0, "runescape");
            if (var5 != 0) {
               Class_hg.a(-5, 1L);
            }

            while (var3.b == 0) {
               Class_hg.a(-5, 1L);
            }

            if (var3.b == 1) {
               var2 = (Class_ac)var3.e;
               Class_lh var4 = Class_pf.a(0);
               var2.a(0, var4.E, 18405, var4.p);
            }
         } catch (Exception var7) {
         }

         try {
            if (var2 != null) {
               var2.c(-8143);
            }
         } catch (Exception var6) {
         }
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "jb.I(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   public static void c(byte var0) {
      try {
         Z = null;
         Y = null;
         if (var0 >= -97) {
            a(-12, true, 107, 127, -107);
         }

         bb = null;
         V = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "jb.G(" + var0 + ')');
      }
   }

   public Class_jb() {
   }
}
