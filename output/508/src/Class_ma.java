final class Class_ma extends Class_lf {
   static int Q;
   static int[] R = new int[]{12543016, 15504954, 15914854, 16773818};
   static int S = 0;
   static Class_pb T;
   static int U;
   static int V;
   private int W = 4096;
   static Class_fi X = new Class_fi(0, 0);
   static boolean Y = true;
   static int Z;
   static Class_r ab = Class_ma.eb;
   static volatile boolean bb = false;
   static int[] cb = new int[4096];
   static int db;
   private static Class_r eb = Class_tc.a(43, "Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");
   static int fb;
   static Class_af gb;
   static long[] hb = new long[200];
   static int ib = 0;
   static Class_sg jb;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final int a(int var0, Class_r var1) {
      int var3 = client.lb;

      try {
         Z++;
         if (var1 == null) {
            return -1;
         } else {
            int var2 = 0;
            if (var0 != 31601) {
               a((byte)66, 93, 122);
               if (var3 != 0) {
                  if (var1.a(false, Class_vi.W[var2])) {
                     return var2;
                  }

                  var2++;
               }
            }

            while (~var2 > ~Class_ek.n) {
               if (var1.a(false, Class_vi.W[var2])) {
                  return var2;
               }

               var2++;
            }

            return -1;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "ma.B(" + var0 + 44 + (var1 != null ? "{...}" : "null") + 41);
      }
   }

   public Class_ma() {
      super(1, true);
   }

   public static void g(int var0) {
      try {
         ab = null;
         R = null;
         if (var0 > -65) {
            a(-106, 49, 57, 32, 5, 110, 104, -2, null, 88, true, 60L);
         }

         T = null;
         cb = null;
         gb = null;
         jb = null;
         eb = null;
         hb = null;
         X = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ma.C(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int[] a(byte var1, int var2) {
      int var16 = client.lb;

      try {
         int[] var3 = super.H.a(false, var2);
         db++;
         if (var1 != -61) {
            X = null;
         }

         if (super.H.s) {
            int[] var4 = this.b(0, Class_fa.rc & var2 - 1, 29149);
            int[] var5 = this.b(0, var2, 29149);
            int[] var6 = this.b(0, Class_fa.rc & var2 + 1, 29149);
            int var7 = 0;
            if (var16 != 0 || ~Class_ld.X < ~var7) {
               do {
                  int var9 = (-var5[Class_ed.d & -1 + var7] + var5[Class_ed.d & var7 - -1]) * this.W;
                  int var8 = this.W * (-var4[var7] + var6[var7]);
                  int var11 = var8 >> 1482857932;
                  int var13 = var11 * var11 >> 142659340;
                  int var10 = var9 >> -1944776724;
                  int var12 = var10 * var10 >> 428458892;
                  int var14 = (int)(Math.sqrt((var13 + var12 - -4096) / 4096.0F) * 4096.0);
                  int var15 = ~var14 == -1 ? 0 : 16777216 / var14;
                  var3[var7] = -var15 + 4096;
               } while (~Class_ld.X < ~(++var7));
            }
         }

         return var3;
      } catch (RuntimeException var17) {
         throw Class_sh.a(var17, "ma.G(" + var1 + ',' + var2 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final int a(byte var0, int var1, int var2) {
      int var5 = client.lb;

      try {
         U++;
         int var3 = 0;
         int var4 = -40 % ((-47 - var0) / 34);
         if (var5 == 0 && ~var2 >= -1) {
            return var3;
         } else {
            do {
               var3 = var3 << 2048908097 | 1 & var1;
               var2--;
               var1 >>>= 1;
            } while (~var2 < -1);

            return var3;
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "ma.E(" + var0 + 44 + var1 + 44 + var2 + 41);
      }
   }

   final void a(Class_lh var1, int var2, int var3) {
      try {
         if (var3 != -1) {
            a((byte)95, 101, 33);
         }

         fb++;
         if (var2 == 0) {
            this.W = var1.k(1355769544);
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "ma.K(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   static final boolean a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Class_a var8, int var9, boolean var10, long var11) {
      boolean var13 = Class_mi.U == Class_ih.W;
      int var14 = 0;

      for (int var15 = var1; var15 < var1 + var3; var15++) {
         for (int var16 = var2; var16 < var2 + var4; var16++) {
            if (var15 < 0 || var16 < 0 || var15 >= Class_ra.g || var16 >= Class_qb.m) {
               return false;
            }

            Class_aa var17 = Class_ck.d[var0][var15][var16];
            if (var17 != null && var17.G >= 5) {
               return false;
            }
         }
      }

      Class_lj var22 = new Class_lj();
      var22.k = var11;
      var22.q = var0;
      var22.D = var5;
      var22.r = var6;
      var22.t = var7;
      var22.j = var8;
      var22.w = var9;
      var22.v = var1;
      var22.u = var2;
      var22.f = var1 + var3 - 1;
      var22.b = var2 + var4 - 1;

      for (int var23 = var1; var23 < var1 + var3; var23++) {
         for (int var18 = var2; var18 < var2 + var4; var18++) {
            int var19 = 0;
            if (var23 > var1) {
               var19++;
            }

            if (var23 < var1 + var3 - 1) {
               var19 += 4;
            }

            if (var18 > var2) {
               var19 += 8;
            }

            if (var18 < var2 + var4 - 1) {
               var19 += 2;
            }

            for (int var20 = var0; var20 >= 0; var20--) {
               if (Class_ck.d[var20][var23][var18] == null) {
                  Class_ck.d[var20][var23][var18] = new Class_aa(var20, var23, var18);
               }
            }

            Class_aa var21 = Class_ck.d[var0][var23][var18];
            var21.H[var21.G] = var22;
            var21.B[var21.G] = var19;
            var21.D |= var19;
            var21.G++;
            if (var13 && Class_fc.q[var23][var18] != 0) {
               var14 = Class_fc.q[var23][var18];
            }
         }
      }

      if (var13 && var14 != 0) {
         for (int var24 = var1; var24 < var1 + var3; var24++) {
            for (int var25 = var2; var25 < var2 + var4; var25++) {
               if (Class_fc.q[var24][var25] == 0) {
                  Class_fc.q[var24][var25] = var14;
               }
            }
         }
      }

      if (var10) {
         Class_li.e[Class_uc.x++] = var22;
      }

      return true;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, Class_ub var1, int var2, byte var3, int var4) {
      int var6 = client.lb;

      try {
         V++;
         if (var3 == 18) {
            Class_nf var5 = (Class_nf)Class_ba.c.e((byte)76);
            if (var6 != 0 || var5 != null) {
               while (var2 != var5.q || ~var5.P != ~(var4 * 128) || ~var5.C != ~(128 * var0) || ~var5.w.vb != ~var1.vb) {
                  var5 = (Class_nf)Class_ba.c.c((byte)109);
                  if (var5 == null) {
                     return;
                  }
               }

               if (var5.r != null) {
                  Class_nd.m.a(var5.r);
                  var5.r = null;
               }

               if (var5.A != null) {
                  Class_nd.m.a(var5.A);
                  var5.A = null;
               }

               var5.c(var3 ^ -17540);
            }
         }
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "ma.F(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + var4 + ')');
      }
   }
}
