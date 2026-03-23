final class Class_ua extends RuntimeException {
   static Class_r a = Class_ua.o;
   static int b = 0;
   static Class_r c = Class_tc.a(43, "http:)4)4");
   static int d;
   static int e;
   static int f;
   static Class_cj g;
   static int h;
   static int i;
   String j;
   static Class_r k = Class_tc.a(43, " <col=ffffff>");
   static int l;
   static int m;
   static Class_r n = Class_ua.o;
   private static Class_r o = Class_tc.a(43, "glow1:");
   static int p;
   static Class_ni q;
   Throwable r;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final Class_jh a(
      int var0,
      int var1,
      int var2,
      Class_jh var3,
      int var4,
      Class_uc var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      boolean var13
   ) {
      int var30 = client.lb;

      try {
         long var14 = ((long)var11 << -1663761184) + ((var6 << -1502276232) + (var10 << -743990992) + var9) + ((long)var7 << 1875380208);
         i++;
         Class_jh var16 = (Class_jh)Class_vb.a.a(14366, var14);
         if (var16 == null) {
            byte var17;
            label194: {
               if (~var9 == -2) {
                  var17 = 9;
                  if (var30 == 0) {
                     break label194;
                  }
               }

               if (~var9 != -3) {
                  if (var9 == 3) {
                     var17 = 15;
                     if (var30 == 0) {
                        break label194;
                     }
                  }

                  if (~var9 == -5) {
                     var17 = 18;
                     if (var30 == 0) {
                        break label194;
                     }
                  }

                  var17 = 21;
                  if (var30 == 0) {
                     break label194;
                  }
               }

               var17 = 12;
            }

            byte var18 = 3;
            int[] var19 = new int[]{64, 96, 128};
            int[][] var22 = new int[var18][var17];
            Class_ne var20 = new Class_ne(1 - -(var17 * var18), -var17 + 2 * var17 * var18, 0);
            int var21 = var20.d(0, 0, 0);
            int var23 = 0;
            if (var30 != 0 || var18 > var23) {
               do {
                  int var25 = var19[var23];
                  int var24 = var19[var23];
                  int var26 = 0;
                  if (var30 != 0 || var26 < var17) {
                     do {
                        int var27 = (var26 << -939650869) / var17;
                        int var28 = var8 - -(var24 * Class_kd.e[var27]) >> -780014224;
                        int var29 = var0 - -(var25 * Class_kd.q[var27]) >> 100362896;
                        var22[var23][var26] = var20.d(var28, 0, var29);
                     } while (++var26 < var17);
                  }
               } while (var18 > ++var23);
            }

            int var39 = 0;
            if (var30 != 0 || ~var18 < ~var39) {
               do {
                  int var41 = (128 + 256 * var39) / var18;
                  int var43 = -var41 + 256;
                  short var47 = (short)(
                     (var43 * (var11 & 896) + (896 & var7) * var41 & 229376)
                           + ((var7 & 64512) * var41 + (64512 & var11) * var43 & 16515072)
                           + ((127 & var7) * var41 + (127 & var11) * var43 & 32512)
                        >> -1732730136
                  );
                  byte var45 = (byte)(var41 * var6 + var10 * var43 >> -480210520);
                  int var49 = 0;
                  if (var30 != 0 || var17 > var49) {
                     do {
                        if (~var39 != -1) {
                           var20.a(var22[-1 + var39][var49], var22[-1 + var39][(1 + var49) % var17], var22[var39][(1 + var49) % var17], (byte)1, var47, var45);
                           var20.a(var22[-1 + var39][var49], var22[var39][(var49 - -1) % var17], var22[var39][var49], (byte)1, var47, var45);
                           if (var30 == 0) {
                              var49++;
                              continue;
                           }
                        }

                        var20.a(var21, var22[0][(var49 + 1) % var17], var22[0][var49], (byte)1, var47, var45);
                        var49++;
                     } while (var17 > var49);
                  }
               } while (~var18 < ~(++var39));
            }

            var16 = var20.c(64, 768, -50, -10, -50);
            Class_vb.a.a(var16, 127, var14);
         }

         int var32 = 64 * var9 + -1;
         int var33 = -var32;
         int var34 = -var32;
         int var35 = var32;
         int var36 = var32;
         int var37 = var3.j();
         if (var13) {
            if (var1 > 640 && ~var1 > -1409) {
               var36 = var32 + 128;
            }

            if (~var1 < -129 && ~var1 > -897) {
               var33 -= 128;
            }

            if (~var1 < -1665 || var1 < 384) {
               var34 -= 128;
            }

            if (~var1 < -1153 && ~var1 > -1921) {
               var35 = var32 + 128;
            }
         }

         if (var37 < var33) {
            var37 = var33;
         }

         int var38 = var3.g();
         if (~var38 < ~var35) {
            var38 = var35;
         }

         int var40 = var3.c();
         if (~var40 > ~var34) {
            var40 = var34;
         }

         Class_w var44 = null;
         int var42 = var3.h();
         if (var5 != null) {
            var4 = var5.d[var4];
            var44 = Class_ff.a(var4 >> 1541839728, (byte)-96);
            var4 &= 65535;
         }

         int var46 = 125 % ((-7 - var12) / 52);
         if (~var36 > ~var42) {
            var42 = var36;
         }

         label200: {
            if (var44 == null) {
               var16 = var16.a(true, true);
               var16.b((-var37 + var38) / 2, 128, (var42 - var40) / 2);
               var16.c((var37 + var38) / 2, 0, (var40 - -var42) / 2);
               if (var30 == 0) {
                  break label200;
               }
            }

            var16 = var16.a(!var44.a(true, var4), true);
            var16.b((-var37 + var38) / 2, 128, (var42 - var40) / 2);
            var16.c((var37 + var38) / 2, 0, (var42 + var40) / 2);
            var16.a(var44, var4);
         }

         if (~var1 != -1) {
            var16.e(var1);
         }

         Class_qa var48 = (Class_qa)var16;
         if (var2 != Class_fa.a(var8 - -var37, Class_jk.F, var40 + var0, false) || Class_fa.a(var38 + var8, Class_jk.F, var42 + var0, false) != var2) {
            int var50 = 0;
            if (var30 != 0 || var48.M > var50) {
               do {
                  var48.q[var50] = var48.q[var50] + Class_fa.a(var48.L[var50] + var8, Class_jk.F, var0 + var48.z[var50], false) + -var2;
               } while (var48.M > ++var50);
            }

            var48.B = false;
         }

         return var16;
      } catch (RuntimeException var31) {
         throw Class_sh.a(
            var31,
            "ua.A("
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
               + ','
               + var11
               + ','
               + var12
               + ','
               + var13
               + ')'
         );
      }
   }

   public static void a(int var0) {
      try {
         a = null;
         o = null;
         c = null;
         n = null;
         q = null;
         g = null;
         if (var0 != 64) {
            a(false, 79, 66, (byte)113, 45, null, (byte)12);
         }

         k = null;
      } catch (RuntimeException var2) {
         throw var2;
      }
   }

   static final int a(int var0, int var1) {
      try {
         h++;
         if (var1 <= 44) {
            l = 118;
         }

         return 1023 & var0;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ua.B(" + var0 + 44 + var1 + 41);
      }
   }

   static final void a(int var0, int var1, int var2) {
      try {
         if (var0 >= 65) {
            d++;
            if (Class_oj.b(var1, (byte)-2)) {
               Class_qe.a(var2, Class_ve.ab[var1], 16);
            }
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "ua.C(" + var0 + ',' + var1 + ',' + var2 + ')');
      }
   }

   static final void a(int var0, boolean var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, Class_ga[] var8, int var9, int var10) {
      int var27 = client.lb;

      try {
         p++;
         int var12 = -1;
         if (var9 < 67) {
            q = null;
         }

         Class_lh var11 = new Class_lh(var6);

         while (true) {
            int var13 = var11.e(true);
            if (~var13 == -1) {
               return;
            }

            int var14 = 0;
            var12 += var13;

            while (true) {
               int var15 = var11.f(255);
               if (~var15 != -1) {
                  var14 += -1 + var15;
                  int var17 = (var14 & 4040) >> -740717850;
                  int var18 = var14 >> 210097612;
                  int var19 = var11.n(-6677);
                  int var16 = var14 & 63;
                  int var20 = var19 >> -964823422;
                  int var21 = var19 & 3;
                  if (var18 != var7 || var5 > var17 || ~(8 + var5) >= ~var17 || var16 < var2 || ~(var2 - -8) >= ~var16) {
                     continue;
                  }

                  Class_ub var22 = Class_qe.a(110, var12);
                  int var23 = var3 + Class_ad.b(var21, var16 & 7, var22.D, var17 & 7, var22.C, -120, var4);
                  int var24 = var10 - -Class_vj.a(var21, var22.D, var4, var16 & 7, var22.C, 7 & var17, (byte)-128);
                  if (var23 <= 0 || var24 <= 0 || ~var23 <= -104 || var24 >= 103) {
                     continue;
                  }

                  Class_ga var25 = null;
                  if (!var1) {
                     int var26 = var0;
                     if (~(Class_kk.c[1][var23][var24] & 2) == -3) {
                        var26 = var0 - 1;
                     }

                     if (~var26 <= -1) {
                        var25 = var8[var26];
                     }
                  }

                  Class_w.a(var25, 1, var1, var24, 3 & var21 - -var4, var23, var20, var0, var0, !var1, var12);
                  if (var27 == 0) {
                     continue;
                  }
               }

               if (var27 != 0) {
                  return;
               }
               break;
            }
         }
      } catch (RuntimeException var28) {
         throw Class_sh.a(
            var28,
            "ua.D("
               + var0
               + ','
               + var1
               + ','
               + var2
               + ','
               + var3
               + ','
               + var4
               + ','
               + var5
               + ','
               + (var6 != null ? "{...}" : "null")
               + ','
               + var7
               + ','
               + (var8 != null ? "{...}" : "null")
               + ','
               + var9
               + ','
               + var10
               + ')'
         );
      }
   }

   static final void a(boolean var0, int var1, int var2, byte var3, int var4, Class_sg var5, byte var6) {
      try {
         long var7 = var4 + (var2 << 598658928);
         e++;
         Class_tf var9 = (Class_tf)Class_vf.e.a(var7, -58);
         if (var6 == 22) {
            if (var9 == null) {
               var9 = (Class_tf)Class_qj.S.a(var7, -47);
               if (var9 == null) {
                  var9 = (Class_tf)Class_lh.Ab.a(var7, 73);
                  if (var9 != null) {
                     if (var0) {
                        var9.b((byte)73);
                        Class_vf.e.a((byte)123, var9, var7);
                        Class_jd.i++;
                        Class_wh.p--;
                     }
                  } else {
                     if (!var0) {
                        var9 = (Class_tf)Class_tb.n.a(var7, -100);
                        if (var9 != null) {
                           return;
                        }
                     }

                     var9 = new Class_tf();
                     var9.P = var5;
                     var9.N = var1;
                     var9.M = var3;
                     if (var0) {
                        Class_vf.e.a((byte)119, var9, var7);
                        Class_jd.i++;
                     } else {
                        Class_gg.v.a(125, var9);
                        Class_lh.Ab.a((byte)127, var9, var7);
                        Class_wh.p++;
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var10) {
         throw Class_sh.a(
            var10, "ua.F(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + (var5 != null ? "{...}" : "null") + ',' + var6 + ')'
         );
      }
   }

   Class_ua(Throwable var1, String var2) {
      try {
         this.r = var1;
         this.j = var2;
      } catch (RuntimeException var4) {
         throw var4;
      }
   }
}
