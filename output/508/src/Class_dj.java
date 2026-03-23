import java.io.IOException;

final class Class_dj extends Class_bh {
   static int l;
   private final int m;
   static int n;
   static int o;
   static Class_r p = Class_tc.a(43, ")4l=");
   static int q;
   private static Class_r r = Class_tc.a(43, "Loading interfaces )2 ");
   static Class_c s = new Class_c();
   private final int t;
   private final int u;
   static int v;
   static int w;
   static int x;
   static Class_r y = r;
   private final int z;
   static Class_r A = Class_tc.a(43, "(Z");
   static int B;
   static int C;
   static int D;
   static int E = 0;
   static int F;

   static final void a(byte var0, int var1) {
      try {
         Class_ni var2;
         if (Class_jk.A == null) {
            var2 = new Class_ni(512, 512);
         } else {
            var2 = (Class_ni)Class_jk.A;
         }

         q++;
         int[] var3 = var2.I;
         int var4 = var3.length;

         for (int var5 = 0; ~var5 > ~var4; var5++) {
            var3[var5] = 1;
         }

         for (int var6 = 1; ~var6 > -104; var6++) {
            int var7 = 24628 - -(4 * (52736 + -(512 * var6)));

            for (int var8 = 1; var8 < 103; var8++) {
               if (~(Class_kk.c[var1][var8][var6] & 24) == -1) {
                  a(var3, var7, 512, var1, var8, var6);
               }

               if (~var1 > -4 && ~(Class_kk.c[1 + var1][var8][var6] & 8) != -1) {
                  a(var3, var7, 512, 1 + var1, var8, var6);
               }

               var7 += 4;
            }
         }

         var2.c();
         if (var0 != -124) {
            a(-46, false);
         }

         int var23 = 238 + ((int)(Math.random() * 20.0) - 10) << -1313258800;
         int var22 = -10
            + (int)(Math.random() * 20.0)
            + 238
            + (238 + (int)(Math.random() * 20.0) + -10 << -2005976952)
            + (228 - -((int)(20.0 * Math.random())) << 1887366288);

         for (int var9 = 1; ~var9 > -104; var9++) {
            for (int var10 = 1; ~var10 > -104; var10++) {
               if ((24 & Class_kk.c[var1][var10][var9]) == 0) {
                  Class_kg.a(var1, var22, var10, var23, var9, (byte)91);
               }

               if (~var1 > -4 && ~(8 & Class_kk.c[var1 - -1][var10][var9]) != -1) {
                  Class_kg.a(1 + var1, var22, var10, var23, var9, (byte)92);
               }
            }
         }

         Class_id.n = 0;

         for (int var24 = 0; ~var24 > -105; var24++) {
            for (int var11 = 0; var11 < 104; var11++) {
               long var12 = Class_p.b(Class_jk.F, var24, var11);
               if (var12 != 0L) {
                  Class_ub var14 = Class_qe.a(var0 + 212, 2147483647 & (int)(var12 >>> 1113552736));
                  int var15 = var14.v;
                  if (var14.J != null) {
                     for (int var16 = 0; var14.J.length > var16; var16++) {
                        if (~var14.J[var16] != 0) {
                           Class_ub var17 = Class_qe.a(96, var14.J[var16]);
                           if (var17.v >= 0) {
                              var15 = var17.v;
                              break;
                           }
                        }
                     }
                  }

                  if (var15 >= 0) {
                     int var26 = var11;
                     int var25 = var24;
                     if (var15 != 22 && var15 != 29 && ~var15 != -35 && var15 != 36 && ~var15 != -47 && ~var15 != -48 && var15 != 48) {
                        int[][] var18 = Class_sj.j[Class_jk.F].z;

                        for (int var19 = 0; ~var19 > -11; var19++) {
                           int var20 = (int)(Math.random() * 4.0);
                           if (~var20 == -1 && ~var25 < -1 && ~var25 < ~(var24 + -3) && (var18[-1 + var25][var26] & 19661064) == 0) {
                              var25--;
                           }

                           if (~var20 == -2 && ~var25 > -104 && ~(3 + var24) < ~var25 && (19661184 & var18[1 + var25][var26]) == 0) {
                              var25++;
                           }

                           if (~var20 == -3 && var26 > 0 && var26 > -3 + var11 && (var18[var25][var26 + -1] & 19661058) == 0) {
                              var26--;
                           }

                           if (~var20 == -4 && var26 < 103 && var11 - -3 > var26 && ~(var18[var25][var26 - -1] & 19661088) == -1) {
                              var26++;
                           }
                        }
                     }

                     Class_we.I[Class_id.n] = var14.vb;
                     Class_ph.e[Class_id.n] = var25;
                     Class_tg.u[Class_id.n] = var26;
                     Class_id.n++;
                  }
               }
            }
         }

         Class_jk.A = var2;
         Class_qe.s.c(108);
      } catch (RuntimeException var21) {
         throw Class_sh.a(var21, "dj.H(" + var0 + ',' + var1 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final Class_r a(int var0, boolean var1, byte var2, int var3) {
      int var10 = client.lb;

      try {
         D++;
         if (~var0 <= -3 && var0 <= 36) {
            int var5 = var3 / var0;
            int var4 = 1;
            if (var10 != 0) {
               var4++;
               var5 /= var0;
            }

            while (~var5 != -1) {
               var4++;
               var5 /= var0;
            }

            int var6 = var4;
            if (var3 < 0 || var1) {
               var6 = var4 + 1;
            }

            byte[] var7;
            label52: {
               var7 = new byte[var6];
               if (var3 >= 0) {
                  if (!var1) {
                     break label52;
                  }

                  var7[0] = 43;
                  if (var10 == 0) {
                     break label52;
                  }
               }

               var7[0] = 45;
            }

            if (var2 != 125) {
               a(120, true);
            }

            int var8 = 0;
            if (var10 == 0 && ~var4 >= ~var8) {
               Class_r var13 = new Class_r();
               var13.h = var7;
               var13.G = var6;
               return var13;
            } else {
               do {
                  int var9 = var3 % var0;
                  var3 /= var0;
                  if (~var9 > -1) {
                     var9 = -var9;
                  }

                  if (~var9 < -10) {
                     var9 += 39;
                  }

                  var7[-var8 + var6 + -1] = (byte)(var9 + 48);
               } while (~var4 < ~(++var8));

               Class_r var12 = new Class_r();
               var12.h = var7;
               var12.G = var6;
               return var12;
            }
         } else {
            throw new IllegalArgumentException("Invalid radix:" + var0);
         }
      } catch (RuntimeException var11) {
         throw Class_sh.a(var11, "dj.K(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   static final Class_pc[] a(Class_cj var0, int var1, boolean var2, int var3) {
      try {
         n++;
         if (var2) {
            a(-21, true, (byte)121, 82);
         }

         return !Class_ve.a(-29381, var3, var0, var1) ? null : Class_cj.a(32568);
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "dj.I(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   final void a(int var1, int var2, int var3) {
      try {
         x++;
         int var4 = this.u * var1 >> -567332404;
         if (var2 != 23700) {
            A = null;
         }

         int var6 = var3 * this.m >> 202273740;
         int var5 = var1 * this.t >> 1011932524;
         int var7 = this.z * var3 >> -1687003508;
         Class_tf.a(super.d, var5, var4, var6, var7, super.j, super.h, (byte)-12);
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "dj.D(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   private static final void a(int[] var0, int var1, int var2, int var3, int var4, int var5) {
      Class_aa var6 = Class_ck.d[var3][var4][var5];
      if (var6 != null) {
         Class_aj var7 = var6.t;
         if (var7 == null) {
            Class_na var17 = var6.O;
            if (var17 != null) {
               int var18 = var17.g;
               int var10 = var17.l;
               int var11 = var17.s;
               int var12 = var17.e;
               int[] var13 = Class_wa.a[var18];
               int[] var14 = Class_aj.n[var10];
               int var15 = 0;
               if (var11 != 0) {
                  for (int var25 = 0; var25 < 4; var25++) {
                     var0[var1] = var13[var14[var15++]] == 0 ? var11 : var12;
                     var0[var1 + 1] = var13[var14[var15++]] == 0 ? var11 : var12;
                     var0[var1 + 2] = var13[var14[var15++]] == 0 ? var11 : var12;
                     var0[var1 + 3] = var13[var14[var15++]] == 0 ? var11 : var12;
                     var1 += var2;
                  }
               } else {
                  for (int var16 = 0; var16 < 4; var16++) {
                     if (var13[var14[var15++]] != 0) {
                        var0[var1] = var12;
                     }

                     if (var13[var14[var15++]] != 0) {
                        var0[var1 + 1] = var12;
                     }

                     if (var13[var14[var15++]] != 0) {
                        var0[var1 + 2] = var12;
                     }

                     if (var13[var14[var15++]] != 0) {
                        var0[var1 + 3] = var12;
                     }

                     var1 += var2;
                  }
               }
            }
         } else {
            int var8 = var7.c;
            if (var8 != 0) {
               for (int var9 = 0; var9 < 4; var9++) {
                  var0[var1] = var8;
                  var0[var1 + 1] = var8;
                  var0[var1 + 2] = var8;
                  var0[var1 + 3] = var8;
                  var1 += var2;
               }
            }
         }
      }
   }

   static final int a(Class_r var0, int var1) {
      try {
         C++;
         if (var1 >= -104) {
            A = null;
         }

         return var0.d((byte)-105) - -1;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "dj.O(" + (var0 != null ? "{...}" : "null") + 44 + var1 + 41);
      }
   }

   static final void a(boolean var0) {
      try {
         w++;
         if (~Class_ek.o == -6) {
            if (var0) {
               A = null;
            }

            Class_ek.o = 6;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "dj.M(" + var0 + ')');
      }
   }

   final void b(int var1, int var2, int var3) {
      try {
         int var4 = var3 * this.u >> -1941234900;
         o++;
         int var5 = this.t * var3 >> 146088972;
         int var7 = -30 % ((-49 - var2) / 43);
         int var6 = this.m * var1 >> 1243673516;
         int var8 = this.z * var1 >> -1759137172;
         Class_jf.a(var5, (byte)63, var8, var6, var4, super.d);
      } catch (RuntimeException var9) {
         throw Class_sh.a(var9, "dj.E(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   final void a(boolean var1, int var2, int var3) {
      try {
         if (var1) {
            F++;
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "dj.B(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   public static void b(int var0) {
      try {
         p = null;
         A = null;
         int var1 = -84 % ((10 - var0) / 38);
         r = null;
         s = null;
         y = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "dj.J(" + var0 + ')');
      }
   }

   static final void c(int var0) {
      try {
         v++;
         if (Class_fb.m) {
            Class_bj.h = null;
            if (var0 != 20) {
               s = null;
            }

            Class_fb.m = false;
            Class_pj.h = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "dj.N(" + var0 + ')');
      }
   }

   static final void a(int var0, boolean var1) {
      try {
         if (var0 != -12915) {
            b(47);
         }

         l++;
         Class_hf.c(16322);
         if (~Class_ua.b == -31 || Class_ua.b == 25) {
            Class_fg.m++;
            if (Class_fg.m >= 50 || var1) {
               Class_fg.m = 0;
               if (!Class_ja.y && Class_wf.k != null) {
                  Class_cj.S.o(-53, 115);

                  try {
                     Class_wf.k.a(0, (byte)33, Class_cj.S.p, Class_cj.S.E);
                     Class_cj.S.p = 0;
                  } catch (IOException var3) {
                     Class_ja.y = true;
                  }

                  Class_nb.f++;
               }

               Class_hf.c(var0 + 29237);
            }
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "dj.L(" + var0 + ',' + var1 + ')');
      }
   }

   Class_dj(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      super(var5, var6, var7);

      try {
         this.z = var4;
         this.t = var3;
         this.m = var2;
         this.u = var1;
      } catch (RuntimeException var9) {
         throw Class_sh.a(var9, "dj.<init>(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
      }
   }
}
