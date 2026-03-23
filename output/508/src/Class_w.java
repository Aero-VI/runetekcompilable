final class Class_w extends Class_pe {
   static Class_dh[] I;
   Class_t[] J;
   static int K;
   static int L;
   static Class_r M = Class_tc.a(43, ")4a=");
   static int N;
   static int O;
   static Class_r P = Class_tc.a(43, "leuchten3:");
   static int Q = 0;
   static Class_jb R;
   static Class_ha S = null;
   static int[][][] T;
   static int U;

   static final void d(int var0) {
      int var3 = client.lb;

      try {
         label60: {
            if (Class_wh.q[96]) {
               Class_ub.X = Class_ub.X + (-Class_ub.X + -24) / 2;
               if (var3 == 0) {
                  break label60;
               }
            }

            if (!Class_wh.q[97]) {
               Class_ub.X /= 2;
               if (var3 == 0) {
                  break label60;
               }
            }

            Class_ub.X = Class_ub.X + (-Class_ub.X + 24) / 2;
         }

         int var1;
         label46: {
            var1 = Class_be.v + Class_gg.B.hb;
            L++;
            Class_ba.z = Class_ba.z + Class_ub.X / var0;
            if (!Class_wh.q[98]) {
               if (Class_wh.q[99]) {
                  Class_ec.P = Class_ec.P + (-Class_ec.P + -12) / 2;
                  if (var3 == 0) {
                     break label46;
                  }
               }

               Class_ec.P /= 2;
               if (var3 == 0) {
                  break label46;
               }
            }

            Class_ec.P = Class_ec.P + (-Class_ec.P + 12) / 2;
         }

         Class_c.w = Class_c.w + Class_ec.P / 2;
         int var2 = Class_gg.B.J + Class_ic.I;
         if (Class_bk.N - var1 < -500 || Class_bk.N + -var1 > 500 || ~(Class_wc.N + -var2) > 499 || ~(Class_wc.N + -var2) < -501) {
            Class_wc.N = var2;
            Class_bk.N = var1;
         }

         if (~var1 != ~Class_bk.N) {
            Class_bk.N = Class_bk.N + (-Class_bk.N + var1) / 16;
         }

         if (~Class_wc.N != ~var2) {
            Class_wc.N = Class_wc.N + (-Class_wc.N + var2) / 16;
         }

         Class_m.d((byte)-121);
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "w.D(" + var0 + ')');
      }
   }

   public static void e(int var0) {
      try {
         R = null;
         if (var0 != 499) {
            e(-51);
         }

         T = null;
         S = null;
         P = null;
         I = null;
         M = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "w.C(" + var0 + ')');
      }
   }

   Class_w(Class_cj var1, Class_cj var2, int var3, boolean var4) {
      try {
         Class_c var5 = new Class_c();
         int var6 = var1.e(var3, 0);
         this.J = new Class_t[var6];
         int[] var7 = var1.a(false, var3);

         for (int var8 = 0; ~var8 > ~var7.length; var8++) {
            byte[] var9 = var1.a(var7[var8], 0, var3);
            int var11 = 255 & var9[1] | (255 & var9[0]) << 734028872;
            Class_gg var12 = (Class_gg)var5.e((byte)76);

            Class_gg var10;
            for (var10 = null; var12 != null; var12 = (Class_gg)var5.c((byte)-107)) {
               if (var11 == var12.y) {
                  var10 = var12;
                  break;
               }
            }

            if (var10 == null) {
               byte[] var13;
               if (var4) {
                  var13 = var2.b(var11, 14281, 0);
               } else {
                  var13 = var2.b(0, 14281, var11);
               }

               var10 = new Class_gg(var11, var13);
               var5.a(var10, true);
            }

            this.J[var7[var8]] = new Class_t(var9, var10);
         }
      } catch (RuntimeException var14) {
         throw Class_sh.a(var14, "w.<init>(" + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + var4 + ')');
      }
   }

   final boolean a(boolean var1, int var2) {
      try {
         if (!var1) {
            return true;
         } else {
            U++;
            return this.J[var2].g;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "w.A(" + var1 + ',' + var2 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(Class_ga var0, int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, int var10) {
      int var33 = client.lb;

      try {
         K++;
         if (var9 && !Class_e.a(24781) && (Class_kk.c[0][var5][var3] & 2) == 0) {
            if (~(Class_kk.c[var8][var5][var3] & 16) != -1) {
               return;
            }

            if (Class_od.a(var3, var8, var5, (byte)-68) != Class_la.bb) {
               return;
            }
         }

         if (Class_v.z > var8) {
            Class_v.z = var8;
         }

         Class_ub var11;
         int var12;
         int var13;
         label557: {
            var11 = Class_qe.a(110, var10);
            if (var1 != var4 && ~var4 != -4) {
               var13 = var11.C;
               var12 = var11.D;
               if (var33 == 0) {
                  break label557;
               }
            }

            var12 = var11.C;
            var13 = var11.D;
         }

         int var14;
         int var15;
         label551: {
            if (~(var12 + var5) >= -105) {
               var15 = var5 - -(var12 - -1 >> -337102239);
               var14 = var5 + (var12 >> -456050847);
               if (var33 == 0) {
                  break label551;
               }
            }

            var15 = var5 - -1;
            var14 = var5;
         }

         int var16;
         int var17;
         label546: {
            if (var13 + var3 > 104) {
               var16 = var3;
               var17 = 1 + var3;
               if (var33 == 0) {
                  break label546;
               }
            }

            var16 = var3 - -(var13 >> -1166464799);
            var17 = var3 - -(1 + var13 >> -895671615);
         }

         int[][] var18 = Class_mi.U[var7];
         int var21 = (var13 << -105619002) + (var3 << -1899253241);
         int var20 = (var5 << 387717831) - -(var12 << -1441891642);
         int var19 = var18[var14][var16] - (-var18[var15][var16] + -var18[var14][var17]) + var18[var15][var17] >> -1107865470;
         int[][] var22 = null;
         if (var2) {
            var22 = Class_mg.l[0];
         } else if (~var7 > -4) {
            var22 = Class_mi.U[1 + var7];
         }

         long var23 = 1073741824 | var4 << 1760561524 | var3 << 1552693575 | var5 | var6 << -484950450;
         if (~var11.y == -1 || var2) {
            var23 |= -9223372036854775808L;
         }

         if (~var11.n == -2) {
            var23 |= 4194304L;
         }

         if (var11.V) {
            var23 |= 2147483648L;
         }

         if (var11.a((byte)-6)) {
            Class_id.a(19395, var3, null, var11, var4, var5, var8, null);
         }

         boolean var25 = !var2 & var11.ib;
         var23 |= (long)var10 << -519895968;
         if (var6 == 22) {
            if (Class_ng.o || var11.y != 0 || var11.mb == 1 || var11.U) {
               Object var47;
               label319: {
                  if (var11.S == -1 && var11.J == null) {
                     Class_h var60 = var11.a(22, null, var25, (byte)-116, var9, var19, var4, var18, var21, var22, var20);
                     var47 = var60.e;
                     if (var33 == 0) {
                        break label319;
                     }
                  }

                  var47 = new Class_vc(var10, 22, var4, var7, var5, var3, var11.S, var11.M, null);
               }

               Class_qc.a(var8, var5, var3, var19, (Class_a)var47, var23, var11.b);
               if (~var11.mb == -2 && var0 != null) {
                  var0.a(-124, var3, var5);
               }
            }
         } else if (~var6 != -11 && ~var6 != -12) {
            if (var6 >= 12) {
               Object var46;
               label597: {
                  if (var11.S != -1 || var11.J != null) {
                     var46 = new Class_vc(var10, var6, var4, var7, var5, var3, var11.S, var11.M, null);
                     if (var33 == 0) {
                        break label597;
                     }
                  }

                  Class_h var59 = var11.a(var6, null, var25, (byte)-127, var9, var19, var4, var18, var21, var22, var20);
                  var46 = var59.e;
               }

               Class_ad.a(var8, var5, var3, var19, 1, 1, (Class_a)var46, 0, var23);
               if (var9 && var6 >= 12 && var6 <= 17 && var6 != 13 && ~var8 < -1) {
                  Class_mg.m[var8][var5][var3] = Class_mb.a(Class_mg.m[var8][var5][var3], 4);
               }

               if (~var11.mb != -1 && var0 != null) {
                  var0.a(-56, var11.ub, var13, var12, var5, var3);
               }
            } else if (var6 == 0) {
               Object var45;
               label362: {
                  if (var11.S == -1 && var11.J == null) {
                     Class_h var58 = var11.a(0, null, var25, (byte)-29, var9, var19, var4, var18, var21, var22, var20);
                     var45 = var58.e;
                     if (var33 == 0) {
                        break label362;
                     }
                  }

                  var45 = new Class_vc(var10, 0, var4, var7, var5, var3, var11.S, var11.M, null);
               }

               Class_uh.a(var8, var5, var3, var19, (Class_a)var45, null, Class_d.j[var4], 0, var23);
               label356:
               if (var9) {
                  if (var4 == 0) {
                     if (var11.rb) {
                        Class_ga.u[var8][var5][var3] = 50;
                        Class_ga.u[var8][var5][1 + var3] = 50;
                     }

                     if (!var11.Y) {
                        break label356;
                     }

                     Class_mg.m[var8][var5][var3] = Class_mb.a(Class_mg.m[var8][var5][var3], 1);
                     if (var33 == 0) {
                        break label356;
                     }
                  }

                  if (var4 == 1) {
                     if (var11.rb) {
                        Class_ga.u[var8][var5][1 + var3] = 50;
                        Class_ga.u[var8][1 + var5][var3 + 1] = 50;
                     }

                     if (!var11.Y) {
                        break label356;
                     }

                     Class_mg.m[var8][var5][1 + var3] = Class_mb.a(Class_mg.m[var8][var5][1 + var3], 2);
                     if (var33 == 0) {
                        break label356;
                     }
                  }

                  if (var4 != 2) {
                     if (~var4 != -4) {
                        break label356;
                     }

                     if (var11.rb) {
                        Class_ga.u[var8][var5][var3] = 50;
                        Class_ga.u[var8][var5 - -1][var3] = 50;
                     }

                     if (!var11.Y) {
                        break label356;
                     }

                     Class_mg.m[var8][var5][var3] = Class_mb.a(Class_mg.m[var8][var5][var3], 2);
                     if (var33 == 0) {
                        break label356;
                     }
                  }

                  if (var11.rb) {
                     Class_ga.u[var8][var5 + 1][var3] = 50;
                     Class_ga.u[var8][1 + var5][var3 + 1] = 50;
                  }

                  if (var11.Y) {
                     Class_mg.m[var8][var5 - -1][var3] = Class_mb.a(Class_mg.m[var8][var5 - -1][var3], 1);
                  }
               }

               if (var11.mb != 0 && var0 != null) {
                  var0.a(var4, var3, var11.ub, var6, var5, (byte)0);
               }

               if (~var11.pb != -17) {
                  Class_ok.a(var8, var5, var3, var11.pb);
               }
            } else if (var6 == 1) {
               Object var44;
               label598: {
                  if (var11.S != -1 || var11.J != null) {
                     var44 = new Class_vc(var10, 1, var4, var7, var5, var3, var11.S, var11.M, null);
                     if (var33 == 0) {
                        break label598;
                     }
                  }

                  Class_h var57 = var11.a(1, null, var25, (byte)-51, var9, var19, var4, var18, var21, var22, var20);
                  var44 = var57.e;
               }

               Class_uh.a(var8, var5, var3, var19, (Class_a)var44, null, Class_fh.S[var4], 0, var23);
               label380:
               if (var11.rb && var9) {
                  if (~var4 == -1) {
                     Class_ga.u[var8][var5][var3 - -1] = 50;
                     if (var33 == 0) {
                        break label380;
                     }
                  }

                  if (~var4 != -2) {
                     if (var4 == 2) {
                        Class_ga.u[var8][var5 + 1][var3] = 50;
                        if (var33 == 0) {
                           break label380;
                        }
                     }

                     if (var4 != 3) {
                        break label380;
                     }

                     Class_ga.u[var8][var5][var3] = 50;
                     if (var33 == 0) {
                        break label380;
                     }
                  }

                  Class_ga.u[var8][1 + var5][var3 - -1] = 50;
               }

               if (~var11.mb != -1 && var0 != null) {
                  var0.a(var4, var3, var11.ub, var6, var5, (byte)24);
               }
            } else if (var6 == 2) {
               int var43;
               Object var56;
               Object var62;
               label599: {
                  var43 = 3 & 1 + var4;
                  if (~var11.S != 0 || var11.J != null) {
                     var56 = new Class_vc(var10, 2, 4 + var4, var7, var5, var3, var11.S, var11.M, null);
                     var62 = new Class_vc(var10, 2, var43, var7, var5, var3, var11.S, var11.M, null);
                     if (var33 == 0) {
                        break label599;
                     }
                  }

                  Class_h var66 = var11.a(2, null, var25, (byte)-49, var9, var19, var4 + 4, var18, var21, var22, var20);
                  var56 = var66.e;
                  var66 = var11.a(2, null, var25, (byte)-116, var9, var19, var43, var18, var21, var22, var20);
                  var62 = var66.e;
               }

               Class_uh.a(var8, var5, var3, var19, (Class_a)var56, (Class_a)var62, Class_d.j[var4], Class_d.j[var43], var23);
               label405:
               if (var11.Y && var9) {
                  if (var4 != 0) {
                     if (var4 == 1) {
                        Class_mg.m[var8][var5][var3 + 1] = Class_mb.a(Class_mg.m[var8][var5][var3 + 1], 2);
                        Class_mg.m[var8][1 + var5][var3] = Class_mb.a(Class_mg.m[var8][1 + var5][var3], 1);
                        if (var33 == 0) {
                           break label405;
                        }
                     }

                     if (~var4 == -3) {
                        Class_mg.m[var8][1 + var5][var3] = Class_mb.a(Class_mg.m[var8][1 + var5][var3], 1);
                        Class_mg.m[var8][var5][var3] = Class_mb.a(Class_mg.m[var8][var5][var3], 2);
                        if (var33 == 0) {
                           break label405;
                        }
                     }

                     if (~var4 != -4) {
                        break label405;
                     }

                     Class_mg.m[var8][var5][var3] = Class_mb.a(Class_mg.m[var8][var5][var3], 2);
                     Class_mg.m[var8][var5][var3] = Class_mb.a(Class_mg.m[var8][var5][var3], 1);
                     if (var33 == 0) {
                        break label405;
                     }
                  }

                  Class_mg.m[var8][var5][var3] = Class_mb.a(Class_mg.m[var8][var5][var3], 1);
                  Class_mg.m[var8][var5][var3 + 1] = Class_mb.a(Class_mg.m[var8][var5][var3 + 1], 2);
               }

               if (~var11.mb != -1 && var0 != null) {
                  var0.a(var4, var3, var11.ub, var6, var5, (byte)-125);
               }

               if (var11.pb != 16) {
                  Class_ok.a(var8, var5, var3, var11.pb);
               }
            } else if (~var6 == -4) {
               Object var42;
               label436: {
                  if (~var11.S == 0 && var11.J == null) {
                     Class_h var55 = var11.a(3, null, var25, (byte)-47, var9, var19, var4, var18, var21, var22, var20);
                     var42 = var55.e;
                     if (var33 == 0) {
                        break label436;
                     }
                  }

                  var42 = new Class_vc(var10, 3, var4, var7, var5, var3, var11.S, var11.M, null);
               }

               Class_uh.a(var8, var5, var3, var19, (Class_a)var42, null, Class_fh.S[var4], 0, var23);
               label430:
               if (var11.rb && var9) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (~var4 != -3) {
                           if (var4 != 3) {
                              break label430;
                           }

                           Class_ga.u[var8][var5][var3] = 50;
                           if (var33 == 0) {
                              break label430;
                           }
                        }

                        Class_ga.u[var8][1 + var5][var3] = 50;
                        if (var33 == 0) {
                           break label430;
                        }
                     }

                     Class_ga.u[var8][var5 + 1][1 + var3] = 50;
                     if (var33 == 0) {
                        break label430;
                     }
                  }

                  Class_ga.u[var8][var5][1 + var3] = 50;
               }

               if (var11.mb != 0 && var0 != null) {
                  var0.a(var4, var3, var11.ub, var6, var5, (byte)-126);
               }
            } else if (var6 == 9) {
               Object var41;
               label600: {
                  if (~var11.S != 0 || var11.J != null) {
                     var41 = new Class_vc(var10, var6, var4, var7, var5, var3, var11.S, var11.M, null);
                     if (var33 == 0) {
                        break label600;
                     }
                  }

                  Class_h var54 = var11.a(var6, null, var25, (byte)-35, var9, var19, var4, var18, var21, var22, var20);
                  var41 = var54.e;
               }

               Class_ad.a(var8, var5, var3, var19, 1, 1, (Class_a)var41, 0, var23);
               if (var11.mb != 0 && var0 != null) {
                  var0.a(-87, var11.ub, var13, var12, var5, var3);
               }

               if (var11.pb != 16) {
                  Class_ok.a(var8, var5, var3, var11.pb);
               }
            } else if (~var6 == -5) {
               Object var40;
               label601: {
                  if (~var11.S != 0 || var11.J != null) {
                     var40 = new Class_vc(var10, 4, var4, var7, var5, var3, var11.S, var11.M, null);
                     if (var33 == 0) {
                        break label601;
                     }
                  }

                  Class_h var53 = var11.a(4, null, var25, (byte)-32, var9, var19, var4, var18, var21, var22, var20);
                  var40 = var53.e;
               }

               Class_d.a(var8, var5, var3, var19, (Class_a)var40, null, Class_d.j[var4], 0, 0, 0, var23);
            } else if (var6 == 5) {
               int var39 = 16;
               long var52 = Class_sh.a(var8, var5, var3);
               if (var52 != 0L) {
                  var39 = Class_qe.a(110, (int)(var52 >>> 2101198624) & 2147483647).pb;
               }

               Object var65;
               label464: {
                  if (var11.S == -1 && var11.J == null) {
                     Class_h var70 = var11.a(4, null, var25, (byte)-30, var9, var19, var4, var18, var21, var22, var20);
                     var65 = var70.e;
                     if (var33 == 0) {
                        break label464;
                     }
                  }

                  var65 = new Class_vc(var10, 4, var4, var7, var5, var3, var11.S, var11.M, null);
               }

               Class_d.a(var8, var5, var3, var19, (Class_a)var65, null, Class_d.j[var4], 0, var39 * Class_fh.U[var4], Class_ti.l[var4] * var39, var23);
            } else if (var6 == 6) {
               long var51 = Class_sh.a(var8, var5, var3);
               int var38 = 8;
               if (~var51 != -1L) {
                  var38 = Class_qe.a(var1 + 122, 2147483647 & (int)(var51 >>> 427422752)).pb / 2;
               }

               Object var64;
               label473: {
                  if (~var11.S == 0 && var11.J == null) {
                     Class_h var69 = var11.a(4, null, var25, (byte)127, var9, var19, var4 - -4, var18, var21, var22, var20);
                     var64 = var69.e;
                     if (var33 == 0) {
                        break label473;
                     }
                  }

                  var64 = new Class_vc(var10, 4, var4 - -4, var7, var5, var3, var11.S, var11.M, null);
               }

               Class_d.a(var8, var5, var3, var19, (Class_a)var64, null, 256, var4, Class_lf.r[var4] * var38, Class_rg.cb[var4] * var38, var23);
            } else if (var6 == 7) {
               Object var37;
               int var50;
               label482: {
                  var50 = 3 & 2 + var4;
                  if (var11.S == -1 && var11.J == null) {
                     Class_h var61 = var11.a(4, null, var25, (byte)-48, var9, var19, 4 + var50, var18, var21, var22, var20);
                     var37 = var61.e;
                     if (var33 == 0) {
                        break label482;
                     }
                  }

                  var37 = new Class_vc(var10, 4, var50 - -4, var7, var5, var3, var11.S, var11.M, null);
               }

               Class_d.a(var8, var5, var3, var19, (Class_a)var37, null, 256, var50, 0, 0, var23);
            } else if (var6 == 8) {
               int var36 = 8;
               int var31 = 3 & 2 + var4;
               long var49 = Class_sh.a(var8, var5, var3);
               if (~var49 != -1L) {
                  var36 = Class_qe.a(106, 2147483647 & (int)(var49 >>> -1987366752)).pb / 2;
               }

               Object var63;
               Object var68;
               label490: {
                  if (~var11.S == 0 && var11.J == null) {
                     Class_h var32 = var11.a(4, null, var25, (byte)125, var9, var19, var4 + 4, var18, var21, var22, var20);
                     var63 = var32.e;
                     var32 = var11.a(4, null, var25, (byte)-5, var9, var19, 4 + var31, var18, var21, var22, var20);
                     var68 = var32.e;
                     if (var33 == 0) {
                        break label490;
                     }
                  }

                  var63 = new Class_vc(var10, 4, var4 - -4, var7, var5, var3, var11.S, var11.M, null);
                  var68 = new Class_vc(var10, 4, 4 + var31, var7, var5, var3, var11.S, var11.M, null);
               }

               Class_d.a(var8, var5, var3, var19, (Class_a)var63, (Class_a)var68, 256, var4, Class_lf.r[var4] * var36, Class_rg.cb[var4] * var36, var23);
            }
         } else {
            Object var26;
            label602: {
               if (~var11.S != 0 || var11.J != null) {
                  var26 = new Class_vc(var10, 10, var6 != 11 ? var4 : var4 + 4, var7, var5, var3, var11.S, var11.M, null);
                  if (var33 == 0) {
                     break label602;
                  }
               }

               Class_h var27 = var11.a(10, null, var25, (byte)-20, var9, var19, var6 == 11 ? var4 + 4 : var4, var18, var21, var22, var20);
               var26 = var27.e;
            }

            if (var26 != null) {
               boolean var48 = Class_ad.a(var8, var5, var3, var19, var12, var13, (Class_a)var26, 0, var23);
               if (var11.rb && var48 && var9) {
                  int var28 = 15;
                  if (var26 instanceof Class_jh) {
                     var28 = ((Class_jh)var26).d() / 4;
                     if (~var28 < -31) {
                        var28 = 30;
                     }
                  }

                  int var29 = 0;
                  if (var33 != 0 || ~var29 >= ~var12) {
                     do {
                        int var30 = 0;
                        if (var33 != 0 || var30 <= var13) {
                           do {
                              if (~Class_ga.u[var8][var5 - -var29][var3 + var30] > ~var28) {
                                 Class_ga.u[var8][var29 + var5][var30 + var3] = (byte)var28;
                              }
                           } while (++var30 <= var13);
                        }
                     } while (~(++var29) >= ~var12);
                  }
               }
            }

            if (~var11.mb != -1 && var0 != null) {
               var0.a(-120, var11.ub, var13, var12, var5, var3);
            }
         }
      } catch (RuntimeException var34) {
         throw Class_sh.a(
            var34,
            "w.E("
               + (var0 != null ? "{...}" : "null")
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

   static final boolean a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var1 < var2 && var1 < var3 && var1 < var4) {
         return false;
      } else if (var1 > var2 && var1 > var3 && var1 > var4) {
         return false;
      } else if (var0 < var5 && var0 < var6 && var0 < var7) {
         return false;
      } else if (var0 > var5 && var0 > var6 && var0 > var7) {
         return false;
      } else {
         int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2);
         int var9 = (var1 - var4) * (var5 - var7) - (var0 - var7) * (var2 - var4);
         int var10 = (var1 - var3) * (var7 - var6) - (var0 - var6) * (var4 - var3);
         return var8 * var10 > 0 && var10 * var9 > 0;
      }
   }
}
