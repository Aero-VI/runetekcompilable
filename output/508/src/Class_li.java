class Class_li {
   long a;
   static int[] b = new int[256];
   static int c;
   static int d;
   static Class_lj[] e = new Class_lj[5000];
   static Class_r f = Class_tc.a(43, "<col=ffffff>");
   static int g;
   static byte h;
   static int i;
   Class_li j;
   static Class_sg k;
   Class_li l;
   static Class_r m;
   static Class_ha n;
   static int o;

   public static void a(int var0) {
      try {
         m = null;
         e = null;
         b = null;
         int var1 = -117 / ((var0 - -67) / 42);
         n = null;
         f = null;
         k = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "li.OB(" + var0 + ')');
      }
   }

   static final boolean a(int var0, int var1) {
      try {
         g++;
         return var1 != 1424444319 ? true : (1 & var0 >> 1424444319) != 0;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "li.KB(" + var0 + ',' + var1 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(boolean var0, byte var1) {
      int var15 = client.lb;

      try {
         c++;
         if (var1 >= -13) {
            a(-38, -97);
         }

         byte var2 = 4;
         byte[][] var3 = Class_d.b;
         int var4 = 0;
         if (var15 != 0 || var2 > var4) {
            do {
               Class_hf.c(16322);
               int var5 = 0;
               if (var15 != 0 || ~var5 > -14) {
                  do {
                     int var6 = 0;
                     if (var15 != 0 || ~var6 > -14) {
                        do {
                           int var8 = Class_ai.D[var4][var5][var6];
                           boolean var7 = false;
                           if (var8 != -1) {
                              int var9 = (57374920 & var8) >> 92564152;
                              if (!var0 || var9 == 0) {
                                 int var11 = (var8 & 16767527) >> 171936078;
                                 int var10 = (6 & var8) >> 121929409;
                                 int var12 = (var8 & 16382) >> 21854147;
                                 int var13 = (var11 / 8 << -1838768664) - -(var12 / 8);
                                 int var14 = 0;
                                 if (var15 != 0 || ~var14 > ~Class_uh.e.length) {
                                    do {
                                       if (Class_uh.e[var14] == var13) {
                                          if (var3[var14] != null) {
                                             var7 = true;
                                             Class_uf.a(
                                                (var11 & 7) * 8, false, var5 * 8, var3[var14], 8 * (7 & var12), Class_sj.j, var10, var4, var0, var9, var6 * 8
                                             );
                                             if (var15 == 0) {
                                                break;
                                             }

                                             var14++;
                                          } else {
                                             var14++;
                                          }
                                       } else {
                                          var14++;
                                       }
                                    } while (~var14 > ~Class_uh.e.length);
                                 }
                              }
                           }

                           if (!var7) {
                              Class_vh.a(8, -81, 8, var4, var6 * 8, 8 * var5);
                           }
                        } while (~(++var6) > -14);
                     }
                  } while (~(++var5) > -14);
               }
            } while (var2 > ++var4);
         }
      } catch (RuntimeException var16) {
         throw Class_sh.a(var16, "li.NB(" + var0 + ',' + var1 + ')');
      }
   }

   final boolean b(int var1) {
      try {
         d++;
         if (this.j == null) {
            return false;
         } else {
            if (var1 <= 64) {
               a(-119);
            }

            return true;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "li.MB(" + var1 + ')');
      }
   }

   final void c(int var1) {
      try {
         i++;
         if (this.j != null) {
            if (var1 == -17554) {
               this.j.l = this.l;
               this.l.j = this.j;
               this.j = null;
               this.l = null;
            }
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "li.LB(" + var1 + ')');
      }
   }

   public Class_li() {
   }

   static {
      for (int var1 = 0; ~var1 > -257; var1++) {
         int var0 = var1;

         for (int var2 = 0; ~var2 > -9; var2++) {
            if (~(1 & var0) != -2) {
               var0 >>>= 1;
            } else {
               var0 = -306674912 ^ var0 >>> -959825663;
            }
         }

         b[var1] = var0;
      }

      o = 0;
      m = Class_tc.a(43, "Lade)3)3)3");
   }
}
