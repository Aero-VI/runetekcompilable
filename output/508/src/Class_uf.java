final class Class_uf extends Class_pe {
   int I;
   int J = 12800;
   static int[] K = new int[2];
   int L = -1;
   int M;
   static int N;
   Class_r O;
   boolean P;
   static Class_r Q = Class_tc.a(43, " <col=00ff80>");
   static int R;
   static int[] S = new int[256];
   static Class_lb T;
   static int U = 0;
   int V = 12800;
   static int W = 0;
   static int X;
   static int Y = -1;
   int Z;
   static Class_r ab = Class_tc.a(43, "l");
   static Class_dh bb = null;
   static int cb;
   static int db;
   int eb;
   Class_r fb;
   Class_c gb;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final void d(int var1) {
      int var3 = client.lb;

      try {
         this.V = var1;
         R++;
         this.I = 0;
         this.J = 12800;
         this.M = 0;
         Class_dc var2 = (Class_dc)this.gb.e((byte)76);
         if (var3 != 0 || var2 != null) {
            do {
               if (~var2.z < ~this.M) {
                  this.M = var2.z;
               }

               if (this.J > var2.y) {
                  this.J = var2.y;
               }

               if (this.V > var2.t) {
                  this.V = var2.t;
               }

               if (var2.x > this.I) {
                  this.I = var2.x;
               }

               var2 = (Class_dc)this.gb.c((byte)-106);
            } while (var2 != null);
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "uf.D(" + var1 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, boolean var1, int var2, byte[] var3, int var4, Class_ga[] var5, int var6, int var7, boolean var8, int var9, int var10) {
      int var16 = client.lb;

      try {
         if (var1) {
            K = null;
         }

         if (!var8) {
            int var12 = 0;
            if (var16 != 0 || ~var12 > -9) {
               do {
                  int var13 = 0;
                  if (var16 != 0 || var13 < 8) {
                     do {
                        if (var12 + var2 > 0 && ~(var2 + var12) > -104 && ~(var10 + var13) < -1 && ~(var10 - -var13) > -104) {
                           var5[var7].z[var2 - -var12][var13 + var10] = Class_ui.a(var5[var7].z[var2 - -var12][var13 + var10], -16777217);
                        }
                     } while (++var13 < 8);
                  }
               } while (~(++var12) > -9);
            }
         }

         byte var11;
         label64: {
            cb++;
            if (var8) {
               var11 = 1;
               if (var16 == 0) {
                  break label64;
               }
            }

            var11 = 4;
         }

         Class_lh var18 = new Class_lh(var3);
         int var19 = 0;
         if (var16 != 0 || var19 < var11) {
            do {
               int var14 = 0;
               if (var16 != 0 || var14 < 64) {
                  do {
                     int var15 = 0;
                     if (var16 != 0 || var15 < 64) {
                        do {
                           if (~var9 != ~var19 || var0 > var14 || var14 >= 8 + var0 || ~var4 < ~var15 || ~(var4 - -8) >= ~var15) {
                              Class_pj.a(var8, -1, 0, 0, var18, 0, 0, (byte)118, -1);
                              if (var16 == 0) {
                                 var15++;
                                 continue;
                              }
                           }

                           Class_pj.a(
                              var8,
                              var2 + Class_ji.a(var6, 7 & var15, 7 & var14, -27039),
                              0,
                              0,
                              var18,
                              var7,
                              var6,
                              (byte)37,
                              Class_a.a((byte)-94, var6, var15 & 7, var14 & 7) + var10
                           );
                           var15++;
                        } while (var15 < 64);
                     }
                  } while (++var14 < 64);
               }
            } while (++var19 < var11);
         }
      } catch (RuntimeException var17) {
         throw Class_sh.a(
            var17,
            "uf.E("
               + var0
               + ','
               + var1
               + ','
               + var2
               + ','
               + (var3 != null ? "{...}" : "null")
               + ','
               + var4
               + ','
               + (var5 != null ? "{...}" : "null")
               + ','
               + var6
               + ','
               + var7
               + ','
               + var8
               + ','
               + var9
               + ','
               + var10
               + ')'
         );
      }
   }

   final boolean a(int var1, int var2, int var3) {
      try {
         db++;
         if (~this.V >= ~var2 && var2 <= this.M && ~var3 <= ~this.J && this.I >= var3) {
            Class_dc var4 = (Class_dc)this.gb.e((byte)76);

            for (int var5 = -107 / ((-26 - var1) / 57); var4 != null; var4 = (Class_dc)this.gb.c((byte)109)) {
               if (var4.a(var2, -9710, var3)) {
                  return true;
               }
            }

            return false;
         } else {
            return false;
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "uf.B(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   public static void e(int var0) {
      try {
         bb = null;
         Q = null;
         if (var0 != 25465) {
            K = null;
         }

         ab = null;
         K = null;
         S = null;
         T = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "uf.C(" + var0 + ')');
      }
   }

   static final int c(int var0, int var1) {
      try {
         if (var1 != 255) {
            return 40;
         } else {
            X++;
            return var0 & 0xFF;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "uf.A(" + var0 + 44 + var1 + 41);
      }
   }

   static final void a(int var0, Class_cj var1, boolean var2, Class_cj var3) {
      try {
         Class_cd.I = var1;
         if (var0 != 12800) {
            c(62, 98);
         }

         N++;
         Class_vj.z = var2;
         Class_dd.P = var3;
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "uf.F(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
      }
   }

   Class_uf(Class_r var1, Class_r var2, int var3, int var4, int var5, boolean var6) {
      this.I = 0;
      this.M = 0;
      this.P = true;

      try {
         this.L = var5;
         this.P = var6;
         this.fb = var2;
         this.Z = var3;
         this.eb = var4;
         this.O = var1;
         this.gb = new Class_c();
      } catch (RuntimeException var8) {
         throw Class_sh.a(
            var8,
            "uf.<init>("
               + (var1 != null ? "{...}" : "null")
               + ','
               + (var2 != null ? "{...}" : "null")
               + ','
               + var3
               + ','
               + var4
               + ','
               + var5
               + ','
               + var6
               + ')'
         );
      }
   }
}
