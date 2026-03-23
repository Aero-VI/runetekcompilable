final class Class_ba {
   int a;
   int b;
   static Class_c c = new Class_c();
   int d;
   int e;
   int f;
   int g;
   int h;
   int i;
   int j;
   int k;
   int l;
   int m;
   static int n;
   int o;
   int p;
   static int q;
   static int r;
   int s;
   int t;
   static int u;
   int v;
   static int w = 0;
   static int x;
   int y;
   static int z = 0;
   static Class_cj A;
   static Class_r B = Class_tc.a(43, ":chalreq:");

   static final void a(boolean var0) {
      try {
         n++;
         int var1 = 0;

         for (int var2 = 0; ~var2 > -105; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
               if (Class_rj.a(true, Class_ck.d, var3, var2, var1, (byte)95)) {
                  var1++;
               }

               if (var1 >= 512) {
                  return;
               }
            }
         }

         if (!var0) {
            a(true, null, null, null, 106);
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "ba.A(" + var0 + ')');
      }
   }

   static final void a(boolean var0, Class_r var1, Class_r var2, Class_r var3, int var4) {
      try {
         if (var0) {
            c = null;
         }

         r++;
         Class_de.a(var3, -19596, var1, -1, var4, var2);
      } catch (RuntimeException var6) {
         throw Class_sh.a(
            var6,
            "ba.B("
               + var0
               + ','
               + (var1 != null ? "{...}" : "null")
               + ','
               + (var2 != null ? "{...}" : "null")
               + ','
               + (var3 != null ? "{...}" : "null")
               + ','
               + var4
               + ')'
         );
      }
   }

   static final Class_r a(int var0, Class_ha var1) {
      try {
         u++;
         if (var0 == Class_fa.c(118, client.b(var1))) {
            return null;
         } else if (var1.yc != null && var1.yc.a(true).d((byte)-125) != 0) {
            return var1.yc;
         } else {
            return Class_pe.E ? Class_qb.d : null;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ba.D(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, int var1, int var2, boolean var3, int var4, int var5, int var6) {
      int var25 = client.lb;

      try {
         Class_jj.a(-1, var0);
         int var8 = -var1 + var0;
         int var7 = 0;
         if (var8 < 0) {
            var8 = 0;
         }

         int var10 = -var0;
         int var9 = var0;
         q++;
         int var11 = var8;
         int var12 = -var8;
         byte var13 = -1;
         int[] var15 = Class_qd.p[var6];
         byte var14 = -1;
         int var16 = var2 + -var8;
         Class_fd.a(var2 - var0, (byte)-17, var5, var15, var16);
         int var17 = var2 + var8;
         Class_fd.a(var16, (byte)-17, var4, var15, var17);
         Class_fd.a(var17, (byte)-17, var5, var15, var0 + var2);
         if (!var3) {
            x = -97;
            if (var25 == 0 && var7 >= var0) {
               return;
            }
         } else if (var7 >= var0) {
            return;
         }

         do {
            var13 += 2;
            var14 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && ~var11 <= -2) {
               Class_tj.s[var11] = var7;
               var11--;
               var12 -= var11 << 1629697313;
            }

            var7++;
            label53:
            if (var10 >= 0) {
               var9--;
               var10 -= var9 << -163046623;
               if (~var8 >= ~var9) {
                  int[] var18 = Class_qd.p[var9 + var6];
                  int[] var19 = Class_qd.p[var6 + -var9];
                  int var20 = var7 + var2;
                  int var21 = var2 - var7;
                  Class_fd.a(var21, (byte)-17, var5, var18, var20);
                  Class_fd.a(var21, (byte)-17, var5, var19, var20);
                  if (var25 == 0) {
                     break label53;
                  }
               }

               int var31 = Class_tj.s[var9];
               int[] var27 = Class_qd.p[var9 + var6];
               int var22 = var2 - var7;
               int[] var29 = Class_qd.p[var6 + -var9];
               int var23 = var31 + var2;
               int var33 = var2 + var7;
               int var24 = var2 - var31;
               Class_fd.a(var22, (byte)-17, var5, var27, var24);
               Class_fd.a(var24, (byte)-17, var4, var27, var23);
               Class_fd.a(var23, (byte)-17, var5, var27, var33);
               Class_fd.a(var22, (byte)-17, var5, var29, var24);
               Class_fd.a(var24, (byte)-17, var4, var29, var23);
               Class_fd.a(var23, (byte)-17, var5, var29, var33);
            }

            int[] var30 = Class_qd.p[var6 - var7];
            int[] var28 = Class_qd.p[var6 + var7];
            int var32 = var9 + var2;
            int var34 = var2 - var9;
            if (var7 >= var8) {
               Class_fd.a(var34, (byte)-17, var5, var28, var32);
               Class_fd.a(var34, (byte)-17, var5, var30, var32);
               if (var25 == 0) {
                  continue;
               }
            }

            int var35 = ~var11 > ~var7 ? Class_tj.s[var7] : var11;
            int var36 = var35 + var2;
            int var37 = var2 + -var35;
            Class_fd.a(var34, (byte)-17, var5, var28, var37);
            Class_fd.a(var37, (byte)-17, var4, var28, var36);
            Class_fd.a(var36, (byte)-17, var5, var28, var32);
            Class_fd.a(var34, (byte)-17, var5, var30, var37);
            Class_fd.a(var37, (byte)-17, var4, var30, var36);
            Class_fd.a(var36, (byte)-17, var5, var30, var32);
         } while (var7 < var9);
      } catch (RuntimeException var26) {
         throw Class_sh.a(var26, "ba.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
      }
   }

   public static void a(byte var0) {
      try {
         B = null;
         A = null;
         c = null;
         if (var0 != -9) {
            B = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ba.E(" + var0 + ')');
      }
   }
}
