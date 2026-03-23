final class Class_vj extends Class_li {
   static int p;
   short[] q;
   byte[] r;
   Class_k[] s;
   static int t;
   static Class_r u = Class_tc.a(43, "; Max)2Age=");
   private int[] v;
   byte[] w;
   static int x;
   static int y;
   static boolean z;
   int A;
   byte[] B;
   static int C;
   Class_ch[] E;

   static final void a(Class_a var0, int var1, int var2, int var3, int var4, int var5) {
      boolean var6 = true;
      int var7 = var2;
      int var8 = var2 + var4;
      int var9 = var3 - 1;
      int var10 = var3 + var5;

      for (int var11 = var1; var11 <= var1 + 1; var11++) {
         if (var11 != Class_od.r) {
            for (int var12 = var7; var12 <= var8; var12++) {
               if (var12 >= 0 && var12 < Class_ra.g) {
                  for (int var13 = var9; var13 <= var10; var13++) {
                     if (var13 >= 0 && var13 < Class_qb.m && (!var6 || var12 >= var8 || var13 >= var10 || var13 < var3 && var12 != var2)) {
                        Class_aa var14 = Class_ck.d[var11][var12][var13];
                        if (var14 != null) {
                           int var15 = (
                                    Class_mi.U[var11][var12][var13]
                                       + Class_mi.U[var11][var12 + 1][var13]
                                       + Class_mi.U[var11][var12][var13 + 1]
                                       + Class_mi.U[var11][var12 + 1][var13 + 1]
                                 )
                                 / 4
                              - (
                                    Class_mi.U[var1][var2][var3]
                                       + Class_mi.U[var1][var2 + 1][var3]
                                       + Class_mi.U[var1][var2][var3 + 1]
                                       + Class_mi.U[var1][var2 + 1][var3 + 1]
                                 )
                                 / 4;
                           Class_kk var16 = var14.s;
                           if (var16 != null) {
                              if (var16.f.b()) {
                                 var0.a(var16.f, (var12 - var2) * 128 + (1 - var4) * 64, var15, (var13 - var3) * 128 + (1 - var5) * 64, var6);
                              }

                              if (var16.i != null && var16.i.b()) {
                                 var0.a(var16.i, (var12 - var2) * 128 + (1 - var4) * 64, var15, (var13 - var3) * 128 + (1 - var5) * 64, var6);
                              }
                           }

                           for (int var17 = 0; var17 < var14.G; var17++) {
                              Class_lj var18 = var14.H[var17];
                              if (var18 != null && var18.j.b() && (var12 == var18.v || var12 == var7) && (var13 == var18.u || var13 == var9)) {
                                 int var19 = var18.f - var18.v + 1;
                                 int var20 = var18.b - var18.u + 1;
                                 var0.a(var18.j, (var18.v - var2) * 128 + (var19 - var4) * 64, var15, (var18.u - var3) * 128 + (var20 - var5) * 64, var6);
                              }
                           }
                        }
                     }
                  }
               }
            }

            var7--;
            var6 = false;
         }
      }
   }

   static final int a(int var0, int var1, int var2, int var3, int var4, int var5, byte var6) {
      try {
         if (var6 >= -123) {
            y = -63;
         }

         t++;
         if (~(1 & var0) == -2) {
            int var7 = var1;
            var1 = var4;
            var4 = var7;
         }

         var2 &= 3;
         if (~var2 == -1) {
            return var3;
         } else if (var2 == 1) {
            return 1 + -var1 + -var5 + 7;
         } else {
            return var2 == 2 ? -var4 - -8 - var3 : var5;
         }
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "vj.B(" + var0 + 44 + var1 + 44 + var2 + 44 + var3 + 44 + var4 + 44 + var5 + 44 + var6 + 41);
      }
   }

   final void d(int var1) {
      try {
         C++;
         this.v = null;
         if (var1 != 4) {
            e(66);
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "vj.E(" + var1 + ')');
      }
   }

   final boolean a(Class_bi var1, int[] var2, byte[] var3, byte var4) {
      int var11 = client.lb;

      try {
         x++;
         Class_k var7 = null;
         int var6 = 0;
         boolean var5 = true;
         int var8 = 40 / ((5 - var4) / 33);

         for (int var9 = 0; ~var9 > -129; var9++) {
            if (var3 == null || ~var3[var9] != -1) {
               int var10 = this.v[var9];
               if (~var10 != -1) {
                  if (var10 != var6) {
                     label49: {
                        var6 = var10--;
                        if (~(var10 & 1) != -1) {
                           var7 = var1.a(var10 >> -1806557726, (byte)53, var2);
                           if (var11 == 0) {
                              break label49;
                           }
                        }

                        var7 = var1.a(0, var2, var10 >> 1270280130);
                     }

                     if (var7 == null) {
                        var5 = false;
                     }
                  }

                  if (var7 != null) {
                     this.s[var9] = var7;
                     this.v[var9] = 0;
                  }
               }
            }
         }

         return var5;
      } catch (RuntimeException var12) {
         throw Class_sh.a(
            var12,
            "vj.D(" + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ? "{...}" : "null") + ',' + (var3 != null ? "{...}" : "null") + ',' + var4 + ')'
         );
      }
   }

   public static void e(int var0) {
      try {
         u = null;
         if (var0 != -1) {
            a(-24, 78, 74, 122, -54, -27, (byte)10);
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "vj.A(" + var0 + ')');
      }
   }

   public Class_vj() {
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   Class_vj(byte[] var1) {
      super();
      int var53 = client.lb;

      try {
         this.r = new byte[128];
         this.B = new byte[128];
         this.s = new Class_k[128];
         this.w = new byte[128];
         this.q = new short[128];
         this.E = new Class_ch[128];
         int var3 = 0;
         this.v = new int[128];
         Class_lh var2 = new Class_lh(var1);
         if (var53 != 0) {
            var3++;
         }

         while (~var2.E[var3 + var2.p] != -1) {
            var3++;
         }

         byte[] var4 = new byte[var3];
         int var5 = 0;
         if (var53 != 0) {
            var4[var5] = var2.o(3390);
            var5++;
         }

         while (var3 > var5) {
            var4[var5] = var2.o(3390);
            var5++;
         }

         var2.p++;
         int var6 = var2.p;
         var3++;
         int var7 = 0;
         var2.p += var3;
         if (var53 != 0) {
            var7++;
         }

         while (var2.E[var7 + var2.p] != 0) {
            var7++;
         }

         byte[] var8 = new byte[var7];
         int var9 = 0;
         if (var53 != 0) {
            var8[var9] = var2.o(3390);
            var9++;
         }

         while (~var9 > ~var7) {
            var8[var9] = var2.o(3390);
            var9++;
         }

         var7++;
         var2.p++;
         int var10 = var2.p;
         var2.p += var7;
         int var11 = 0;
         if (var53 != 0) {
            var11++;
         }

         while (var2.E[var2.p - -var11] != 0) {
            var11++;
         }

         byte[] var12 = new byte[var11];
         int var13 = 0;
         if (var53 != 0) {
            var12[var13] = var2.o(3390);
            var13++;
         }

         while (var11 > var13) {
            var12[var13] = var2.o(3390);
            var13++;
         }

         byte[] var14;
         int var15;
         label1341: {
            var11++;
            var2.p++;
            var14 = new byte[var11];
            if (var11 > 1) {
               int var16 = 1;
               var15 = 2;
               var14[1] = 1;
               int var17 = 2;
               if (var53 != 0 || ~var11 < ~var17) {
                  do {
                     int var18 = var2.n(-6677);
                     if (var18 == 0) {
                        var16 = var15++;
                        if (var53 == 0) {
                           var14[var17] = (byte)var16;
                           var17++;
                           continue;
                        }
                     }

                     if (~var18 >= ~var16) {
                        var18--;
                     }

                     var16 = var18;
                     var14[var17] = (byte)var18;
                     var17++;
                  } while (~var11 < ~var17);
               }

               if (var53 == 0) {
                  break label1341;
               }
            }

            var15 = var11;
         }

         Class_ch[] var58 = new Class_ch[var15];
         int var59 = 0;
         if (var53 != 0) {
            Class_ch var60 = var58[var59] = new Class_ch();
            int var19 = var2.n(-6677);
            if (var19 > 0) {
               var60.j = new byte[var19 * 2];
            }

            var19 = var2.n(-6677);
            if (~var19 < -1) {
               var60.h = new byte[var19 * 2 + 2];
               var60.h[1] = 64;
            }

            var59++;
         }

         for (; ~var59 > ~var58.length; var59++) {
            Class_ch var61 = var58[var59] = new Class_ch();
            int var65 = var2.n(-6677);
            if (var65 > 0) {
               var61.j = new byte[var65 * 2];
            }

            var65 = var2.n(-6677);
            if (~var65 < -1) {
               var61.h = new byte[var65 * 2 + 2];
               var61.h[1] = 64;
            }
         }

         int var21 = 0;
         int var62 = var2.n(-6677);
         byte[] var67 = ~var62 < -1 ? new byte[var62 * 2] : null;
         var62 = var2.n(-6677);
         byte[] var20 = var62 > 0 ? new byte[var62 * 2] : null;
         if (var53 != 0) {
            var21++;
         }

         while (~var2.E[var21 + var2.p] != -1) {
            var21++;
         }

         byte[] var22 = new byte[var21];
         int var23 = 0;
         if (var53 != 0) {
            var22[var23] = var2.o(3390);
            var23++;
         }

         while (~var21 < ~var23) {
            var22[var23] = var2.o(3390);
            var23++;
         }

         var2.p++;
         var21++;
         int var24 = 0;
         int var25 = 0;
         if (var53 != 0) {
            var24 += var2.n(-6677);
            this.q[var25] = (short)var24;
            var25++;
         }

         while (var25 < 128) {
            var24 += var2.n(-6677);
            this.q[var25] = (short)var24;
            var25++;
         }

         var24 = 0;
         int var26 = 0;
         if (var53 != 0 || ~var26 > -129) {
            do {
               var24 += var2.n(-6677);
               this.q[var26] = (short)(this.q[var26] + (var24 << -569820856));
            } while (~(++var26) > -129);
         }

         int var27 = 0;
         int var28 = 0;
         int var29 = 0;
         int var30 = 0;
         if (var53 != 0) {
            if (~var27 == -1) {
               if (var28 < var22.length) {
                  var27 = var22[var28++];
                  if (var53 != 0) {
                     var27 = -1;
                  }
               } else {
                  var27 = -1;
               }

               var29 = var2.b(true);
            }

            this.q[var30] = (short)(this.q[var30] + Class_ui.a(32768, var29 + -1 << 821558478));
            var27--;
            this.v[var30] = var29;
            var30++;
         }

         while (var30 < 128) {
            if (~var27 == -1) {
               if (var28 < var22.length) {
                  var27 = var22[var28++];
                  if (var53 != 0) {
                     var27 = -1;
                  }
               } else {
                  var27 = -1;
               }

               var29 = var2.b(true);
            }

            this.q[var30] = (short)(this.q[var30] + Class_ui.a(32768, var29 + -1 << 821558478));
            var27--;
            this.v[var30] = var29;
            var30++;
         }

         var28 = 0;
         var27 = 0;
         int var31 = 0;
         int var32 = 0;
         if (var53 != 0 || var32 < 128) {
            do {
               if (~this.v[var32] != -1) {
                  if (var27 == 0) {
                     if (var28 < var4.length) {
                        var27 = var4[var28++];
                        if (var53 != 0) {
                           var27 = -1;
                        }
                     } else {
                        var27 = -1;
                     }

                     var31 = -1 + var2.E[var6++];
                  }

                  this.w[var32] = (byte)var31;
                  var27--;
                  var32++;
               } else {
                  var32++;
               }
            } while (var32 < 128);
         }

         int var33 = 0;
         var28 = 0;
         var27 = 0;
         int var34 = 0;
         if (var53 != 0) {
            if (~this.v[var34] != -1) {
               if (~var27 == -1) {
                  var33 = 16 + var2.E[var10++] << -1399136158;
                  if (var28 < var8.length) {
                     var27 = var8[var28++];
                     if (var53 != 0) {
                        var27 = -1;
                     }
                  } else {
                     var27 = -1;
                  }
               }

               this.B[var34] = (byte)var33;
               var27--;
               var34++;
            } else {
               var34++;
            }
         }

         while (var34 < 128) {
            if (~this.v[var34] != -1) {
               if (~var27 == -1) {
                  var33 = 16 + var2.E[var10++] << -1399136158;
                  if (var28 < var8.length) {
                     var27 = var8[var28++];
                     if (var53 != 0) {
                        var27 = -1;
                     }
                  } else {
                     var27 = -1;
                  }
               }

               this.B[var34] = (byte)var33;
               var27--;
               var34++;
            } else {
               var34++;
            }
         }

         var28 = 0;
         var27 = 0;
         Class_ch var35 = null;

         for (int var36 = 0; ~var36 > -129; var36++) {
            if (this.v[var36] != 0) {
               label1207:
               if (var27 == 0) {
                  var35 = var58[var14[var28]];
                  if (~var28 <= ~var12.length) {
                     var27 = -1;
                     if (var53 == 0) {
                        break label1207;
                     }
                  }

                  var27 = var12[var28++];
               }

               this.E[var36] = var35;
               var27--;
            }
         }

         var28 = 0;
         int var37 = 0;
         var27 = 0;
         int var38 = 0;
         if (var53 != 0 || var38 < 128) {
            do {
               if (~var27 == -1) {
                  label669: {
                     if (~var22.length >= ~var28) {
                        var27 = -1;
                        if (var53 == 0) {
                           break label669;
                        }
                     }

                     var27 = var22[var28++];
                  }

                  if (this.v[var38] > 0) {
                     var37 = var2.n(-6677) - -1;
                  }
               }

               this.r[var38] = (byte)var37;
               var27--;
            } while (++var38 < 128);
         }

         this.A = 1 + var2.n(-6677);
         int var39 = 0;
         if (var53 == 0 && ~var39 <= ~var15) {
            if (var67 != null) {
               byte var101 = 1;
               if (var53 != 0 || var67.length > var101) {
                  do {
                     var67[var101] = var2.o(3390);
                     var101 += 2;
                  } while (var67.length > var101);
               }
            }

            if (var20 != null) {
               byte var102 = 1;
               if (var53 != 0) {
                  var20[var102] = var2.o(3390);
                  var102 += 2;
               }

               while (~var20.length < ~var102) {
                  var20[var102] = var2.o(3390);
                  var102 += 2;
               }
            }

            int var103 = 0;
            if (var53 != 0 || ~var103 > ~var15) {
               do {
                  Class_ch var107 = var58[var103];
                  if (var107.h == null) {
                     var103++;
                  } else {
                     var24 = 0;
                     byte var116 = 2;
                     if (var53 == 0 && var116 >= var107.h.length) {
                        var103++;
                     } else {
                        do {
                           var24 = var24 + 1 - -var2.n(-6677);
                           var107.h[var116] = (byte)var24;
                           var116 += 2;
                        } while (var116 < var107.h.length);

                        var103++;
                     }
                  }
               } while (~var103 > ~var15);
            }

            int var108 = 0;
            if (var53 == 0 && var108 >= var15) {
               if (var67 != null) {
                  var24 = var2.n(-6677);
                  var67[0] = (byte)var24;
                  byte var121 = 2;
                  if (var53 != 0 || var121 < var67.length) {
                     do {
                        var24 = var2.n(-6677) + var24 - -1;
                        var67[var121] = (byte)var24;
                        var121 += 2;
                     } while (var121 < var67.length);
                  }

                  byte var134 = var67[0];
                  byte var148 = var67[1];
                  int var160 = 0;
                  if (var53 != 0 || var134 > var160) {
                     do {
                        this.r[var160] = (byte)(32 + var148 * this.r[var160] >> 1819936230);
                     } while (var134 > ++var160);
                  }

                  byte var177 = 2;
                  if (var53 != 0 || var177 < var67.length) {
                     do {
                        byte var196 = var67[var177];
                        byte var209 = var67[var177 + 1];
                        var177 += 2;
                        int var217 = var148 * (var196 - var134) + (-var134 + var196) / 2;
                        int var224 = var134;
                        if (var53 != 0 || var134 < var196) {
                           do {
                              int var231 = Class_lj.a(503159455, var196 - var134, var217);
                              var217 += -var148 + var209;
                              this.r[var224] = (byte)(32 + this.r[var224] * var231 >> -1612862202);
                           } while (++var224 < var196);
                        }

                        var134 = var196;
                        var148 = var209;
                     } while (var177 < var67.length);
                  }

                  var67 = null;
                  int var197 = var134;
                  if (var53 != 0 || ~var134 > -129) {
                     do {
                        this.r[var197] = (byte)(32 + var148 * this.r[var197] >> 316844998);
                     } while (~(++var197) > -129);
                  }
               }

               if (var20 != null) {
                  var24 = var2.n(-6677);
                  var20[0] = (byte)var24;
                  byte var122 = 2;
                  if (var53 != 0 || ~var122 > ~var20.length) {
                     do {
                        var24 = var2.n(-6677) + var24 + 1;
                        var20[var122] = (byte)var24;
                        var122 += 2;
                     } while (~var122 > ~var20.length);
                  }

                  byte var135 = var20[0];
                  int var149 = var20[1] << -2062689791;
                  int var161 = 0;
                  if (var53 != 0 || var135 > var161) {
                     do {
                        int var178 = var149 + (255 & this.B[var161]);
                        if (~var178 > -1) {
                           var178 = 0;
                        }

                        if (~var178 < -129) {
                           var178 = 128;
                        }

                        this.B[var161] = (byte)var178;
                     } while (var135 > ++var161);
                  }

                  byte var179 = 2;
                  if (var53 != 0 || var179 < var20.length) {
                     do {
                        byte var198 = var20[var179];
                        int var210 = var20[var179 - -1] << 676653313;
                        int var218 = (-var135 + var198) / 2 + var149 * (-var135 + var198);
                        var179 += 2;
                        int var225 = var135;
                        if (var53 != 0 || ~var198 < ~var135) {
                           do {
                              int var232 = Class_lj.a(503159455, -var135 + var198, var218);
                              int var235 = var232 + (this.B[var225] & 255);
                              var218 += -var149 + var210;
                              if (~var235 > -1) {
                                 var235 = 0;
                              }

                              if (var235 > 128) {
                                 var235 = 128;
                              }

                              this.B[var225] = (byte)var235;
                           } while (~var198 < ~(++var225));
                        }

                        var149 = var210;
                        var135 = var198;
                     } while (var179 < var20.length);
                  }

                  var20 = null;
                  int var199 = var135;
                  if (var53 != 0 || var135 < 128) {
                     do {
                        int var211 = (this.B[var199] & 255) - -var149;
                        if (~var211 > -1) {
                           var211 = 0;
                        }

                        if (~var211 < -129) {
                           var211 = 128;
                        }

                        this.B[var199] = (byte)var211;
                     } while (++var199 < 128);
                  }
               }

               int var123 = 0;
               if (var53 != 0) {
                  var58[var123].l = var2.n(-6677);
                  var123++;
               }

               while (var15 > var123) {
                  var58[var123].l = var2.n(-6677);
                  var123++;
               }

               int var136 = 0;
               if (var53 != 0 || var15 > var136) {
                  do {
                     Class_ch var150 = var58[var136];
                     if (var150.j != null) {
                        var150.u = var2.n(-6677);
                     }

                     if (var150.h != null) {
                        var150.q = var2.n(-6677);
                     }

                     if (~var150.l < -1) {
                        var150.e = var2.n(-6677);
                     }
                  } while (var15 > ++var136);
               }

               int var151 = 0;
               if (var53 != 0) {
                  var58[var151].k = var2.n(-6677);
                  var151++;
               }

               while (~var151 > ~var15) {
                  var58[var151].k = var2.n(-6677);
                  var151++;
               }

               int var162 = 0;
               if (var53 != 0 || var162 < var15) {
                  do {
                     Class_ch var180 = var58[var162];
                     if (~var180.k < -1) {
                        var180.t = var2.n(-6677);
                     }
                  } while (++var162 < var15);
               }

               int var181 = 0;
               if (var53 != 0 || ~var181 > ~var15) {
                  do {
                     Class_ch var200 = var58[var181];
                     if (var200.t > 0) {
                        var200.r = var2.n(-6677);
                     }
                  } while (~(++var181) > ~var15);
               }
            } else {
               do {
                  Class_ch var117 = var58[var108];
                  if (var117.j == null) {
                     var108++;
                  } else {
                     var24 = 0;
                     byte var130 = 2;
                     if (var53 != 0) {
                        var24 = 1 + var24 - -var2.n(-6677);
                        var117.j[var130] = (byte)var24;
                        var130 += 2;
                     }

                     while (~var117.j.length < ~var130) {
                        var24 = 1 + var24 - -var2.n(-6677);
                        var117.j[var130] = (byte)var24;
                        var130 += 2;
                     }

                     var108++;
                  }
               } while (var108 < var15);

               if (var67 != null) {
                  var24 = var2.n(-6677);
                  var67[0] = (byte)var24;
                  byte var118 = 2;
                  if (var53 != 0 || var118 < var67.length) {
                     do {
                        var24 = var2.n(-6677) + var24 - -1;
                        var67[var118] = (byte)var24;
                        var118 += 2;
                     } while (var118 < var67.length);
                  }

                  byte var131 = var67[0];
                  byte var144 = var67[1];
                  int var157 = 0;
                  if (var53 != 0 || var131 > var157) {
                     do {
                        this.r[var157] = (byte)(32 + var144 * this.r[var157] >> 1819936230);
                     } while (var131 > ++var157);
                  }

                  byte var172 = 2;
                  if (var53 != 0 || var172 < var67.length) {
                     do {
                        byte var191 = var67[var172];
                        byte var206 = var67[var172 + 1];
                        var172 += 2;
                        int var215 = var144 * (var191 - var131) + (-var131 + var191) / 2;
                        int var222 = var131;
                        if (var53 != 0 || var131 < var191) {
                           do {
                              int var229 = Class_lj.a(503159455, var191 - var131, var215);
                              var215 += -var144 + var206;
                              this.r[var222] = (byte)(32 + this.r[var222] * var229 >> -1612862202);
                           } while (++var222 < var191);
                        }

                        var131 = var191;
                        var144 = var206;
                     } while (var172 < var67.length);
                  }

                  var67 = null;
                  int var192 = var131;
                  if (var53 != 0 || ~var131 > -129) {
                     do {
                        this.r[var192] = (byte)(32 + var144 * this.r[var192] >> 316844998);
                     } while (~(++var192) > -129);
                  }
               }

               if (var20 != null) {
                  var24 = var2.n(-6677);
                  var20[0] = (byte)var24;
                  byte var119 = 2;
                  if (var53 != 0 || ~var119 > ~var20.length) {
                     do {
                        var24 = var2.n(-6677) + var24 + 1;
                        var20[var119] = (byte)var24;
                        var119 += 2;
                     } while (~var119 > ~var20.length);
                  }

                  byte var132 = var20[0];
                  int var145 = var20[1] << -2062689791;
                  int var158 = 0;
                  if (var53 != 0 || var132 > var158) {
                     do {
                        int var173 = var145 + (255 & this.B[var158]);
                        if (~var173 > -1) {
                           var173 = 0;
                        }

                        if (~var173 < -129) {
                           var173 = 128;
                        }

                        this.B[var158] = (byte)var173;
                     } while (var132 > ++var158);
                  }

                  byte var174 = 2;
                  if (var53 != 0 || var174 < var20.length) {
                     do {
                        byte var193 = var20[var174];
                        int var207 = var20[var174 - -1] << 676653313;
                        int var216 = (-var132 + var193) / 2 + var145 * (-var132 + var193);
                        var174 += 2;
                        int var223 = var132;
                        if (var53 != 0 || ~var193 < ~var132) {
                           do {
                              int var230 = Class_lj.a(503159455, -var132 + var193, var216);
                              int var234 = var230 + (this.B[var223] & 255);
                              var216 += -var145 + var207;
                              if (~var234 > -1) {
                                 var234 = 0;
                              }

                              if (var234 > 128) {
                                 var234 = 128;
                              }

                              this.B[var223] = (byte)var234;
                           } while (~var193 < ~(++var223));
                        }

                        var145 = var207;
                        var132 = var193;
                     } while (var174 < var20.length);
                  }

                  var20 = null;
                  int var194 = var132;
                  if (var53 != 0 || var132 < 128) {
                     do {
                        int var208 = (this.B[var194] & 255) - -var145;
                        if (~var208 > -1) {
                           var208 = 0;
                        }

                        if (~var208 < -129) {
                           var208 = 128;
                        }

                        this.B[var194] = (byte)var208;
                     } while (++var194 < 128);
                  }
               }

               int var120 = 0;
               if (var53 != 0) {
                  var58[var120].l = var2.n(-6677);
                  var120++;
               }

               while (var15 > var120) {
                  var58[var120].l = var2.n(-6677);
                  var120++;
               }

               int var133 = 0;
               if (var53 != 0 || var15 > var133) {
                  do {
                     Class_ch var146 = var58[var133];
                     if (var146.j != null) {
                        var146.u = var2.n(-6677);
                     }

                     if (var146.h != null) {
                        var146.q = var2.n(-6677);
                     }

                     if (~var146.l < -1) {
                        var146.e = var2.n(-6677);
                     }
                  } while (var15 > ++var133);
               }

               int var147 = 0;
               if (var53 != 0) {
                  var58[var147].k = var2.n(-6677);
                  var147++;
               }

               while (~var147 > ~var15) {
                  var58[var147].k = var2.n(-6677);
                  var147++;
               }

               int var159 = 0;
               if (var53 != 0 || var159 < var15) {
                  do {
                     Class_ch var175 = var58[var159];
                     if (~var175.k < -1) {
                        var175.t = var2.n(-6677);
                     }
                  } while (++var159 < var15);
               }

               int var176 = 0;
               if (var53 != 0 || ~var176 > ~var15) {
                  do {
                     Class_ch var195 = var58[var176];
                     if (var195.t > 0) {
                        var195.r = var2.n(-6677);
                     }
                  } while (~(++var176) > ~var15);
               }
            }
         } else {
            do {
               Class_ch var40 = var58[var39];
               if (var40.j != null) {
                  byte var41 = 1;
                  if (var53 != 0) {
                     var40.j[var41] = var2.o(3390);
                     var41 += 2;
                  }

                  while (var40.j.length > var41) {
                     var40.j[var41] = var2.o(3390);
                     var41 += 2;
                  }
               }

               if (var40.h == null) {
                  var39++;
               } else {
                  byte var104 = 3;
                  if (var53 != 0) {
                     var40.h[var104] = var2.o(3390);
                     var104 += 2;
                  }

                  while (~var104 > ~(-2 + var40.h.length)) {
                     var40.h[var104] = var2.o(3390);
                     var104 += 2;
                  }

                  var39++;
               }
            } while (~var39 > ~var15);

            if (var67 != null) {
               byte var98 = 1;
               if (var53 != 0 || var67.length > var98) {
                  do {
                     var67[var98] = var2.o(3390);
                     var98 += 2;
                  } while (var67.length > var98);
               }
            }

            if (var20 != null) {
               byte var99 = 1;
               if (var53 != 0) {
                  var20[var99] = var2.o(3390);
                  var99 += 2;
               }

               while (~var20.length < ~var99) {
                  var20[var99] = var2.o(3390);
                  var99 += 2;
               }
            }

            int var100 = 0;
            if (var53 != 0 || ~var100 > ~var15) {
               do {
                  Class_ch var105 = var58[var100];
                  if (var105.h == null) {
                     var100++;
                  } else {
                     var24 = 0;
                     byte var42 = 2;
                     if (var53 == 0 && var42 >= var105.h.length) {
                        var100++;
                     } else {
                        do {
                           var24 = var24 + 1 - -var2.n(-6677);
                           var105.h[var42] = (byte)var24;
                           var42 += 2;
                        } while (var42 < var105.h.length);

                        var100++;
                     }
                  }
               } while (~var100 > ~var15);
            }

            int var106 = 0;
            if (var53 == 0 && var106 >= var15) {
               if (var67 != null) {
                  var24 = var2.n(-6677);
                  var67[0] = (byte)var24;
                  byte var113 = 2;
                  if (var53 != 0 || var113 < var67.length) {
                     do {
                        var24 = var2.n(-6677) + var24 - -1;
                        var67[var113] = (byte)var24;
                        var113 += 2;
                     } while (var113 < var67.length);
                  }

                  byte var127 = var67[0];
                  byte var140 = var67[1];
                  int var154 = 0;
                  if (var53 != 0 || var127 > var154) {
                     do {
                        this.r[var154] = (byte)(32 + var140 * this.r[var154] >> 1819936230);
                     } while (var127 > ++var154);
                  }

                  byte var167 = 2;
                  if (var53 != 0 || var167 < var67.length) {
                     do {
                        byte var186 = var67[var167];
                        byte var203 = var67[var167 + 1];
                        var167 += 2;
                        int var213 = var140 * (var186 - var127) + (-var127 + var186) / 2;
                        int var220 = var127;
                        if (var53 != 0 || var127 < var186) {
                           do {
                              int var227 = Class_lj.a(503159455, var186 - var127, var213);
                              var213 += -var140 + var203;
                              this.r[var220] = (byte)(32 + this.r[var220] * var227 >> -1612862202);
                           } while (++var220 < var186);
                        }

                        var127 = var186;
                        var140 = var203;
                     } while (var167 < var67.length);
                  }

                  var67 = null;
                  int var187 = var127;
                  if (var53 != 0 || ~var127 > -129) {
                     do {
                        this.r[var187] = (byte)(32 + var140 * this.r[var187] >> 316844998);
                     } while (~(++var187) > -129);
                  }
               }

               if (var20 != null) {
                  var24 = var2.n(-6677);
                  var20[0] = (byte)var24;
                  byte var114 = 2;
                  if (var53 != 0 || ~var114 > ~var20.length) {
                     do {
                        var24 = var2.n(-6677) + var24 + 1;
                        var20[var114] = (byte)var24;
                        var114 += 2;
                     } while (~var114 > ~var20.length);
                  }

                  byte var128 = var20[0];
                  int var141 = var20[1] << -2062689791;
                  int var155 = 0;
                  if (var53 != 0 || var128 > var155) {
                     do {
                        int var168 = var141 + (255 & this.B[var155]);
                        if (~var168 > -1) {
                           var168 = 0;
                        }

                        if (~var168 < -129) {
                           var168 = 128;
                        }

                        this.B[var155] = (byte)var168;
                     } while (var128 > ++var155);
                  }

                  byte var169 = 2;
                  if (var53 != 0 || var169 < var20.length) {
                     do {
                        byte var188 = var20[var169];
                        int var204 = var20[var169 - -1] << 676653313;
                        int var214 = (-var128 + var188) / 2 + var141 * (-var128 + var188);
                        var169 += 2;
                        int var221 = var128;
                        if (var53 != 0 || ~var188 < ~var128) {
                           do {
                              int var228 = Class_lj.a(503159455, -var128 + var188, var214);
                              int var233 = var228 + (this.B[var221] & 255);
                              var214 += -var141 + var204;
                              if (~var233 > -1) {
                                 var233 = 0;
                              }

                              if (var233 > 128) {
                                 var233 = 128;
                              }

                              this.B[var221] = (byte)var233;
                           } while (~var188 < ~(++var221));
                        }

                        var141 = var204;
                        var128 = var188;
                     } while (var169 < var20.length);
                  }

                  var20 = null;
                  int var189 = var128;
                  if (var53 != 0 || var128 < 128) {
                     do {
                        int var205 = (this.B[var189] & 255) - -var141;
                        if (~var205 > -1) {
                           var205 = 0;
                        }

                        if (~var205 < -129) {
                           var205 = 128;
                        }

                        this.B[var189] = (byte)var205;
                     } while (++var189 < 128);
                  }
               }

               int var115 = 0;
               if (var53 != 0) {
                  var58[var115].l = var2.n(-6677);
                  var115++;
               }

               while (var15 > var115) {
                  var58[var115].l = var2.n(-6677);
                  var115++;
               }

               int var129 = 0;
               if (var53 != 0 || var15 > var129) {
                  do {
                     Class_ch var142 = var58[var129];
                     if (var142.j != null) {
                        var142.u = var2.n(-6677);
                     }

                     if (var142.h != null) {
                        var142.q = var2.n(-6677);
                     }

                     if (~var142.l < -1) {
                        var142.e = var2.n(-6677);
                     }
                  } while (var15 > ++var129);
               }

               int var143 = 0;
               if (var53 != 0) {
                  var58[var143].k = var2.n(-6677);
                  var143++;
               }

               while (~var143 > ~var15) {
                  var58[var143].k = var2.n(-6677);
                  var143++;
               }

               int var156 = 0;
               if (var53 != 0 || var156 < var15) {
                  do {
                     Class_ch var170 = var58[var156];
                     if (~var170.k < -1) {
                        var170.t = var2.n(-6677);
                     }
                  } while (++var156 < var15);
               }

               int var171 = 0;
               if (var53 != 0 || ~var171 > ~var15) {
                  do {
                     Class_ch var190 = var58[var171];
                     if (var190.t > 0) {
                        var190.r = var2.n(-6677);
                     }
                  } while (~(++var171) > ~var15);
               }
            } else {
               do {
                  Class_ch var109 = var58[var106];
                  if (var109.j == null) {
                     var106++;
                  } else {
                     var24 = 0;
                     byte var43 = 2;
                     if (var53 != 0) {
                        var24 = 1 + var24 - -var2.n(-6677);
                        var109.j[var43] = (byte)var24;
                        var43 += 2;
                     }

                     while (~var109.j.length < ~var43) {
                        var24 = 1 + var24 - -var2.n(-6677);
                        var109.j[var43] = (byte)var24;
                        var43 += 2;
                     }

                     var106++;
                  }
               } while (var106 < var15);

               if (var67 != null) {
                  var24 = var2.n(-6677);
                  var67[0] = (byte)var24;
                  byte var110 = 2;
                  if (var53 != 0 || var110 < var67.length) {
                     do {
                        var24 = var2.n(-6677) + var24 - -1;
                        var67[var110] = (byte)var24;
                        var110 += 2;
                     } while (var110 < var67.length);
                  }

                  byte var124 = var67[0];
                  byte var44 = var67[1];
                  int var45 = 0;
                  if (var53 != 0 || var124 > var45) {
                     do {
                        this.r[var45] = (byte)(32 + var44 * this.r[var45] >> 1819936230);
                     } while (var124 > ++var45);
                  }

                  byte var46 = 2;
                  if (var53 != 0 || var46 < var67.length) {
                     do {
                        byte var47 = var67[var46];
                        byte var48 = var67[var46 + 1];
                        var46 += 2;
                        int var49 = var44 * (var47 - var124) + (-var124 + var47) / 2;
                        int var50 = var124;
                        if (var53 != 0 || var124 < var47) {
                           do {
                              int var51 = Class_lj.a(503159455, var47 - var124, var49);
                              var49 += -var44 + var48;
                              this.r[var50] = (byte)(32 + this.r[var50] * var51 >> -1612862202);
                           } while (++var50 < var47);
                        }

                        var124 = var47;
                        var44 = var48;
                     } while (var46 < var67.length);
                  }

                  var67 = null;
                  int var182 = var124;
                  if (var53 != 0 || ~var124 > -129) {
                     do {
                        this.r[var182] = (byte)(32 + var44 * this.r[var182] >> 316844998);
                     } while (~(++var182) > -129);
                  }
               }

               if (var20 != null) {
                  var24 = var2.n(-6677);
                  var20[0] = (byte)var24;
                  byte var111 = 2;
                  if (var53 != 0 || ~var111 > ~var20.length) {
                     do {
                        var24 = var2.n(-6677) + var24 + 1;
                        var20[var111] = (byte)var24;
                        var111 += 2;
                     } while (~var111 > ~var20.length);
                  }

                  byte var125 = var20[0];
                  int var137 = var20[1] << -2062689791;
                  int var152 = 0;
                  if (var53 != 0 || var125 > var152) {
                     do {
                        int var163 = var137 + (255 & this.B[var152]);
                        if (~var163 > -1) {
                           var163 = 0;
                        }

                        if (~var163 < -129) {
                           var163 = 128;
                        }

                        this.B[var152] = (byte)var163;
                     } while (var125 > ++var152);
                  }

                  byte var164 = 2;
                  if (var53 != 0 || var164 < var20.length) {
                     do {
                        byte var183 = var20[var164];
                        int var201 = var20[var164 - -1] << 676653313;
                        int var212 = (-var125 + var183) / 2 + var137 * (-var125 + var183);
                        var164 += 2;
                        int var219 = var125;
                        if (var53 != 0 || ~var183 < ~var125) {
                           do {
                              int var226 = Class_lj.a(503159455, -var125 + var183, var212);
                              int var52 = var226 + (this.B[var219] & 255);
                              var212 += -var137 + var201;
                              if (~var52 > -1) {
                                 var52 = 0;
                              }

                              if (var52 > 128) {
                                 var52 = 128;
                              }

                              this.B[var219] = (byte)var52;
                           } while (~var183 < ~(++var219));
                        }

                        var137 = var201;
                        var125 = var183;
                     } while (var164 < var20.length);
                  }

                  var20 = null;
                  int var184 = var125;
                  if (var53 != 0 || var125 < 128) {
                     do {
                        int var202 = (this.B[var184] & 255) - -var137;
                        if (~var202 > -1) {
                           var202 = 0;
                        }

                        if (~var202 < -129) {
                           var202 = 128;
                        }

                        this.B[var184] = (byte)var202;
                     } while (++var184 < 128);
                  }
               }

               int var112 = 0;
               if (var53 != 0) {
                  var58[var112].l = var2.n(-6677);
                  var112++;
               }

               while (var15 > var112) {
                  var58[var112].l = var2.n(-6677);
                  var112++;
               }

               int var126 = 0;
               if (var53 != 0 || var15 > var126) {
                  do {
                     Class_ch var138 = var58[var126];
                     if (var138.j != null) {
                        var138.u = var2.n(-6677);
                     }

                     if (var138.h != null) {
                        var138.q = var2.n(-6677);
                     }

                     if (~var138.l < -1) {
                        var138.e = var2.n(-6677);
                     }
                  } while (var15 > ++var126);
               }

               int var139 = 0;
               if (var53 != 0) {
                  var58[var139].k = var2.n(-6677);
                  var139++;
               }

               while (~var139 > ~var15) {
                  var58[var139].k = var2.n(-6677);
                  var139++;
               }

               int var153 = 0;
               if (var53 != 0 || var153 < var15) {
                  do {
                     Class_ch var165 = var58[var153];
                     if (~var165.k < -1) {
                        var165.t = var2.n(-6677);
                     }
                  } while (++var153 < var15);
               }

               int var166 = 0;
               if (var53 != 0 || ~var166 > ~var15) {
                  do {
                     Class_ch var185 = var58[var166];
                     if (var185.t > 0) {
                        var185.r = var2.n(-6677);
                     }
                  } while (~(++var166) > ~var15);
               }
            }
         }
      } catch (RuntimeException var54) {
         throw Class_sh.a(var54, "vj.<init>(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }
}
