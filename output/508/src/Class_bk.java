import java.awt.Font;

final class Class_bk extends Class_pe {
   int I = 0;
   static int J;
   static int K;
   static int L;
   static int M;
   static int N;
   static int O;
   static boolean P = true;
   static int Q = 0;
   static Font R;
   static int S;

   static final void a(Class_ga var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var14 = client.lb;

      try {
         long var7 = 0L;
         K++;
         if (var4 <= 10) {
            d((byte)55);
         }

         label81: {
            boolean var10 = false;
            byte var9 = -1;
            if (var1 != 0) {
               if (var1 == 1) {
                  var7 = Class_ve.d(var3, var6, var5);
                  if (var14 == 0) {
                     break label81;
                  }
               }

               if (var1 != 2) {
                  if (var1 != 3) {
                     break label81;
                  }

                  var7 = Class_p.b(var3, var6, var5);
                  if (var14 == 0) {
                     break label81;
                  }
               }

               var7 = Class_fk.d(var3, var6, var5);
               if (var14 == 0) {
                  break label81;
               }
            }

            var7 = Class_sh.a(var3, var6, var5);
         }

         int var16 = 2147483647 & (int)(var7 >>> -2076799584);
         int var11 = 0;
         var11 = ((int)var7 & 4094261) >> -125238508;
         Class_ub var12 = Class_qe.a(107, var16);
         if (var12.a((byte)-6)) {
            Class_ma.a(var5, var12, var3, (byte)18, var6);
         }

         int var17 = 31 & (int)var7 >> -348570866;
         if (~var7 != -1L) {
            if (var1 != 0) {
               if (~var1 == -2) {
                  Class_mk var21 = Class_bj.a(var3, var6, var5);
                  return;
               }

               if (var1 != 2) {
                  if (var1 == 3) {
                     Class_hd var20 = Class_mh.e(var3, var6, var5);
                     if (~var12.mb == -2) {
                        var0.b(var6, -262145, var5);
                        return;
                     }
                  }

                  return;
               }

               Class_lj var19 = Class_wc.a(var3, var6, var5);
               if (~var12.mb != -1 && ~(var12.D + var6) > -105 && var5 + var12.D < 104 && var6 + var12.C < 104 && var12.C + var5 < 104) {
                  var0.a(var12.C, var6, var12.D, var11, var5, var12.ub, (byte)82);
                  return;
               }

               return;
            }

            Class_kk var13 = Class_md.a(var3, var6, var5);
            if (var12.mb != 0) {
               var0.a(var6, var17, var5, true, var12.ub, var11);
               return;
            }
         }
      } catch (RuntimeException var15) {
         throw Class_sh.a(
            var15, "bk.A(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')'
         );
      }
   }

   private final void a(int var1, Class_lh var2, int var3) {
      try {
         M++;
         if (var1 == ~var3) {
            this.I = var2.k(1355769544);
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "bk.C(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
      }
   }

   static final void d(int var0) {
      try {
         if (var0 == -13893) {
            L++;
            Class_hg.g = new Class_c();
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "bk.B(" + var0 + ')');
      }
   }

   public static void c(byte var0) {
      try {
         if (var0 == 23) {
            R = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "bk.G(" + var0 + ')');
      }
   }

   static final Class_qb d(byte var0) {
      try {
         S++;

         try {
            return var0 < 56 ? null : (Class_qb)Class.forName("qh").newInstance();
         } catch (Throwable var2) {
            return null;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "bk.E(" + var0 + ')');
      }
   }

   public Class_bk() {
   }

   static final void e(byte var0) {
      try {
         J++;
         if (var0 <= -56) {
            R = null;
            Class_ud.b = null;
            Class_p.l = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "bk.D(" + var0 + ')');
      }
   }

   final void a(byte var1, Class_lh var2) {
      try {
         while (true) {
            int var3 = var2.n(-6677);
            if (var3 == 0) {
               O++;
               var3 = -126 % ((var1 - -63) / 59);
               return;
            }

            this.a(-3, var2, var3);
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "bk.F(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
      }
   }
}
