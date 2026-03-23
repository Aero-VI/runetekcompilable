import java.util.Random;

final class Class_vh extends Class_lf {
   static int Q;
   private short[] R;
   private boolean S;
   static int T;
   static int U;
   static int V;
   static int[] W = new int[]{1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0};
   private int X;
   private int Y = 1638;
   static int Z;
   private byte[] ab;
   static Class_r bb = Class_tc.a(43, "leuchten2:");
   static int cb = 0;
   static int db;
   static Class_qc eb = new Class_qc(50);
   private short[] fb;
   static int[] gb = new int[4096];
   static int hb;
   static int ib;
   static int jb;
   private int kb;
   private int lb;
   static Class_r mb = Class_tc.a(43, "::rebuild");
   static int nb = -1;
   static int ob;
   static int[] pb = new int[500];
   private int qb;
   static int rb = 0;

   public Class_vh() {
      super(0, true);
      this.X = 4;
      this.S = true;
      this.kb = 4;
      this.lb = 4;
      this.ab = new byte[512];
      this.qb = 0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final void a(Class_lh var1, int var2, int var3) {
      int var5 = client.lb;

      try {
         label90: {
            label95: {
               label103: {
                  label87: {
                     label97: {
                        Z++;
                        if (~var2 != -1) {
                           if (~var2 == -2) {
                              break label97;
                           }

                           if (var2 == 2) {
                              break label87;
                           }

                           if (var2 == 3) {
                              this.lb = this.kb = var1.n(-6677);
                              if (var5 == 0) {
                                 break label90;
                              }
                              break label103;
                           }

                           if (~var2 == -5) {
                              break label103;
                           }

                           if (var2 == 5) {
                              this.lb = var1.n(var3 ^ 6676);
                              if (var5 == 0) {
                                 break label90;
                              }
                              break label95;
                           }

                           if (~var2 != -7) {
                              break label90;
                           }

                           if (var5 == 0) {
                              break label95;
                           }
                        }

                        this.S = ~var1.n(-6677) == -2;
                        if (var5 == 0) {
                           break label90;
                        }
                     }

                     this.X = var1.n(var3 ^ 6676);
                     if (var5 == 0) {
                        break label90;
                     }
                  }

                  this.Y = var1.p(var3 ^ 22488);
                  if (~this.Y <= -1) {
                     break label90;
                  }

                  this.R = new short[this.X];
                  int var4 = 0;
                  if (var5 != 0) {
                     this.R[var4] = (short)var1.p(var3 + -22488);
                     var4++;
                  }

                  while (var4 < this.X) {
                     this.R[var4] = (short)var1.p(var3 + -22488);
                     var4++;
                  }

                  if (var5 == 0) {
                     break label90;
                  }

                  this.lb = this.kb = var1.n(-6677);
                  if (var5 == 0) {
                     break label90;
                  }
               }

               this.qb = var1.n(-6677);
               if (var5 == 0) {
                  break label90;
               }

               this.lb = var1.n(var3 ^ 6676);
               if (var5 == 0) {
                  break label90;
               }
            }

            this.kb = var1.n(-6677);
         }

         if (var3 != -1) {
            b(-85, -47);
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "vh.K(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private final void a(int[] var1, int var2, int var3) {
      int var19 = client.lb;

      try {
         ob++;
         int var5 = this.kb * Class_l.y[var3];
         if (var2 == 0) {
            if (this.X == 1) {
               short var34 = this.R[0];
               int var32 = this.fb[0] << -396608308;
               int var45 = var32 * this.lb >> 617569580;
               int var47 = this.kb * var32 >> -792114740;
               int var42 = var5 * var32 >> 1937691244;
               int var51 = var42 >> 318363340;
               int var53 = var51 - -1;
               var42 &= 4095;
               if (var53 >= var47) {
                  var53 = 0;
               }

               int var55 = 255 & this.ab[0xFF & var51];
               int var57 = 255 & this.ab[0xFF & var53];
               int var49 = Class_ve.Z[var42];
               if (!this.S) {
                  int var38 = 0;
                  if (var19 != 0 || ~Class_ld.X < ~var38) {
                     do {
                        int var24 = this.lb * Class_ce.gb[var38];
                        int var30 = this.a(var42, var55, (byte)44, var49, var24 * var32 >> 1441094124, var45, var57);
                        var1[var38] = var34 * var30 >> 1619524844;
                     } while (~Class_ld.X < ~(++var38));
                  }
               } else {
                  int var37 = 0;
                  if (var19 != 0 || Class_ld.X > var37) {
                     do {
                        int var23 = this.lb * Class_ce.gb[var37];
                        int var28 = this.a(var42, var55, (byte)91, var49, var23 * var32 >> -520975284, var45, var57);
                        var28 = var28 * var34 >> -1547488404;
                        var1[var37] = (var28 >> 446084129) + 2048;
                     } while (Class_ld.X > ++var37);
                  }
               }
            } else {
               short var9 = this.R[0];
               if (var9 > 8 || var9 < -8) {
                  int var8 = this.fb[0] << -2113891540;
                  int var11 = var8 * var5 >> 1585559308;
                  int var12 = this.lb * var8 >> 647946124;
                  int var15 = var11 >> 991848108;
                  int var16 = 1 + var15;
                  int var17 = this.ab[0xFF & var15] & 255;
                  int var13 = this.kb * var8 >> -1069679572;
                  var11 &= 4095;
                  int var14 = Class_ve.Z[var11];
                  if (~var16 <= ~var13) {
                     var16 = 0;
                  }

                  int var18 = 255 & this.ab[var16 & 0xFF];
                  int var10 = 0;
                  if (var19 != 0 || Class_ld.X > var10) {
                     do {
                        int var4 = Class_ce.gb[var10] * this.lb;
                        int var6 = this.a(var11, var17, (byte)-127, var14, var8 * var4 >> -137120404, var12, var18);
                        var1[var10] = var9 * var6 >> -622495284;
                     } while (Class_ld.X > ++var10);
                  }
               }

               int var7 = 1;
               if (var19 != 0 || this.X > var7) {
                  do {
                     var9 = this.R[var7];
                     if (var9 <= 8 && var9 >= -8) {
                        var7++;
                     } else {
                        int var31 = this.fb[var7] << 1603830348;
                        int var44 = this.lb * var31 >> -4411572;
                        int var40 = var31 * var5 >> 1335296716;
                        int var46 = this.kb * var31 >> 212904108;
                        int var50 = var40 >> -1045922644;
                        int var54 = this.ab[0xFF & var50] & 255;
                        int var52 = var50 + 1;
                        if (~var46 >= ~var52) {
                           var52 = 0;
                        }

                        int var56 = 255 & this.ab[0xFF & var52];
                        var40 &= 4095;
                        int var48 = Class_ve.Z[var40];
                        if (this.S && ~var7 == ~(this.X - 1)) {
                           int var35 = 0;
                           if (var19 != 0 || Class_ld.X > var35) {
                              do {
                                 int var21 = this.lb * Class_ce.gb[var35];
                                 int var25 = this.a(var40, var54, (byte)36, var48, var31 * var21 >> 253365324, var44, var56);
                                 var25 = (var25 * var9 >> -1744754772) + var1[var35];
                                 var1[var35] = 2048 + (var25 >> 1115323041);
                              } while (Class_ld.X > ++var35);
                           }

                           if (var19 == 0) {
                              var7++;
                              continue;
                           }
                        }

                        int var36 = 0;
                        if (var19 == 0 && var36 >= Class_ld.X) {
                           var7++;
                        } else {
                           do {
                              int var22 = Class_ce.gb[var36] * this.lb;
                              int var27 = this.a(var40, var54, (byte)86, var48, var31 * var22 >> -1921482356, var44, var56);
                              var1[var36] += var27 * var9 >> -2042177012;
                           } while (++var36 < Class_ld.X);

                           var7++;
                        }
                     }
                  } while (this.X > var7);
               }
            }
         }
      } catch (RuntimeException var20) {
         throw Class_sh.a(var20, "vh.H(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final Class_r b(int var0, int var1) {
      int var4 = client.lb;

      try {
         U++;
         Class_r var2 = Class_og.b(var0, 0);
         int var3 = var2.d((byte)-103) - 3;
         if (var4 != 0) {
            var2 = Class_o.a(2, new Class_r[]{var2.a(0, (byte)-74, var3), Class_sf.c, var2.b(var3, true)});
            var3 -= 3;
         }

         while (var3 > 0) {
            var2 = Class_o.a(2, new Class_r[]{var2.a(0, (byte)-74, var3), Class_sf.c, var2.b(var3, true)});
            var3 -= 3;
         }

         if (var1 != -5344) {
            W = null;
         }

         if (~var2.d((byte)-126) < -10) {
            return Class_o.a(2, new Class_r[]{Class_uf.Q, var2.a(0, (byte)-74, var2.d((byte)-100) + -8), Class_cb.x, Class_oi.q, var2, Class_lj.l});
         } else {
            return ~var2.d((byte)-97) < -7
               ? Class_o.a(2, new Class_r[]{Class_ua.k, var2.a(0, (byte)-74, var2.d((byte)-99) + -4), Class_i.tb, Class_oi.q, var2, Class_lj.l})
               : Class_o.a(2, new Class_r[]{Class_be.u, var2, Class_r.S});
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "vh.F(" + var0 + ',' + var1 + ')');
      }
   }

   public static void d(byte var0) {
      try {
         gb = null;
         if (var0 > -24) {
            a(5, -30, -77, -55, -30, 100);
         }

         bb = null;
         pb = null;
         eb = null;
         W = null;
         mb = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "vh.E(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final void a(byte var1) {
      int var4 = client.lb;

      try {
         this.ab = b((byte)14, this.qb);
         if (var1 >= -22) {
            cb = 85;
         }

         this.e((byte)125);
         int var2 = -1 + this.X;
         if (var4 != 0 || var2 >= 1) {
            do {
               short var3 = this.R[var2];
               if (~var3 < -9 || var3 < -8 && var4 == 0) {
                  break;
               }

               this.X--;
            } while (--var2 >= 1);
         }

         db++;
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "vh.I(" + var1 + ')');
      }
   }

   final int[] a(byte var1, int var2) {
      try {
         Q++;
         if (var1 != -61) {
            this.a((Class_lh)null, -11, -125);
         }

         int[] var3 = super.H.a(false, var2);
         if (super.H.s) {
            this.a(var3, 0, var2);
         }

         return var3;
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "vh.G(" + var1 + ',' + var2 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private final void e(byte var1) {
      int var3 = client.lb;

      try {
         label53: {
            ib++;
            if (this.Y <= 0) {
               if (this.R == null || this.R.length != this.X) {
                  break label53;
               }

               this.fb = new short[this.X];
               int var2 = 0;
               if (var3 != 0 || var2 < this.X) {
                  do {
                     this.fb[var2] = (short)Math.pow(2.0, var2);
                  } while (++var2 < this.X);
               }

               if (var3 == 0) {
                  break label53;
               }
            }

            this.fb = new short[this.X];
            this.R = new short[this.X];
            int var5 = 0;
            if (var3 != 0 || this.X > var5) {
               do {
                  this.R[var5] = (short)(Math.pow(this.Y / 4096.0F, var5) * 4096.0);
                  this.fb[var5] = (short)Math.pow(2.0, var5);
               } while (this.X > ++var5);
            }
         }

         if (var1 <= 112) {
            this.a((Class_lh)null, -67, -50);
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "vh.C(" + var1 + ')');
      }
   }

   private final int a(int var1, int var2, byte var3, int var4, int var5, int var6, int var7) {
      int var19 = client.lb;

      try {
         V++;
         int var10 = -4096 + var1;
         int var13 = var5 >> 1110007436;
         int var12 = var13 - -1;
         if (var6 <= var12) {
            var12 = 0;
         }

         int var8;
         int var11;
         int var15;
         label88: {
            var5 &= 4095;
            var11 = -4096 + var5;
            var13 &= 255;
            int var14 = this.ab[var13 + var2] & 3;
            var15 = Class_ve.Z[var5];
            var12 &= 255;
            if (var14 <= 1) {
               var8 = var14 != 0 ? var1 - var5 : var5 + var1;
               if (var19 == 0) {
                  break label88;
               }
            }

            var8 = ~var14 != -3 ? -var1 + -var5 : -var1 + var5;
         }

         int var9;
         label89: {
            int var25 = 3 & this.ab[var12 + var2];
            if (~var25 < -2) {
               var9 = var25 != 2 ? -var1 + -var11 : -var1 + var11;
               if (var19 == 0) {
                  break label89;
               }
            }

            var9 = var25 == 0 ? var11 + var1 : -var11 + var1;
         }

         int var16;
         label90: {
            var16 = var8 + ((-var8 + var9) * var15 >> 1727990412);
            int var26 = 3 & this.ab[var7 + var13];
            int var18 = 20 / ((-38 - var3) / 35);
            if (var26 <= 1) {
               var8 = var26 != 0 ? -var5 + var10 : var5 - -var10;
               if (var19 == 0) {
                  break label90;
               }
            }

            var8 = var26 != 2 ? -var5 + -var10 : var5 - var10;
         }

         label91: {
            int var27 = this.ab[var12 - -var7] & 3;
            if (~var27 >= -2) {
               var9 = ~var27 == -1 ? var10 + var11 : -var11 + var10;
               if (var19 == 0) {
                  break label91;
               }
            }

            var9 = ~var27 == -3 ? var11 - var10 : -var11 + -var10;
         }

         int var17 = ((var9 + -var8) * var15 >> -666703540) + var8;
         return (var4 * (var17 - var16) >> -1831752948) + var16;
      } catch (RuntimeException var20) {
         throw Class_sh.a(var20, "vh.B(" + var1 + 44 + var2 + 44 + var3 + 44 + var4 + 44 + var5 + 44 + var6 + 44 + var7 + 41);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var9 = client.lb;

      try {
         T++;
         if (var1 > -51) {
            rb = 102;
         }

         int var6 = var4;
         if (var9 != 0 || var0 + var4 >= var4) {
            do {
               int var7 = var5;
               if (var9 != 0 || var5 <= var2 + var5) {
                  do {
                     if (~var7 <= -1 && var7 < 104 && ~var6 <= -1 && var6 < 104) {
                        Class_ga.u[var3][var7][var6] = 127;
                     }
                  } while (++var7 <= var2 + var5);
               }
            } while (var0 + var4 >= ++var6);
         }

         int var11 = var4;
         int var8;
         if (var9 != 0) {
            var8 = var5;
            if (var9 != 0) {
               if (~var5 <= -1 && ~var5 > -105 && var4 >= 0 && ~var4 > -105) {
                  Class_mi.U[var3][var5][var4] = ~var3 < -1 ? Class_mi.U[var3 + -1][var5][var4] : 0;
               }

               var8 = var5 + 1;
            }
         } else {
            if (~var4 <= ~(var4 - -var0)) {
               if (var5 > 0 && var5 < 104) {
                  var8 = 1 + var4;
                  if (var9 != 0 || ~var8 > ~(var0 + var4)) {
                     do {
                        if (~var8 <= -1 && var8 < 104) {
                           Class_mi.U[var3][var5][var8] = Class_mi.U[var3][-1 + var5][var8];
                        }
                     } while (~(++var8) > ~(var0 + var4));
                  }
               }

               if (var4 > 0 && ~var4 > -105) {
                  var8 = var5 + 1;
                  if (var9 != 0 || var2 + var5 > var8) {
                     do {
                        if (var8 >= 0 && ~var8 > -105) {
                           Class_mi.U[var3][var8][var4] = Class_mi.U[var3][var8][-1 + var4];
                        }
                     } while (var2 + var5 > ++var8);
                  }
               }

               if (var5 >= 0 && var4 >= 0 && var5 < 104 && ~var4 > -105) {
                  if (~var3 == -1) {
                     if (var5 > 0 && Class_mi.U[var3][-1 + var5][var4] != 0) {
                        Class_mi.U[var3][var5][var4] = Class_mi.U[var3][-1 + var5][var4];
                        return;
                     }

                     if (var4 > 0 && Class_mi.U[var3][var5][var4 - 1] != 0) {
                        Class_mi.U[var3][var5][var4] = Class_mi.U[var3][var5][var4 + -1];
                        return;
                     }

                     if (~var5 < -1 && ~var4 < -1 && ~Class_mi.U[var3][-1 + var5][-1 + var4] != -1) {
                        Class_mi.U[var3][var5][var4] = Class_mi.U[var3][-1 + var5][-1 + var4];
                        return;
                     }

                     return;
                  }

                  if (~var5 < -1 && Class_mi.U[var3 - 1][-1 + var5][var4] != Class_mi.U[var3][var5 - 1][var4]) {
                     Class_mi.U[var3][var5][var4] = Class_mi.U[var3][-1 + var5][var4];
                     return;
                  }

                  if (var4 > 0 && Class_mi.U[var3][var5][-1 + var4] != Class_mi.U[-1 + var3][var5][-1 + var4]) {
                     Class_mi.U[var3][var5][var4] = Class_mi.U[var3][var5][-1 + var4];
                     return;
                  }

                  if (~var5 < -1 && var4 > 0 && Class_mi.U[var3][-1 + var5][-1 + var4] != Class_mi.U[var3 + -1][var5 - 1][var4 + -1]) {
                     Class_mi.U[var3][var5][var4] = Class_mi.U[var3][var5 - 1][var4 + -1];
                     return;
                  }
               }

               return;
            }

            var8 = var5;
            if (var9 != 0) {
               if (~var5 <= -1 && ~var5 > -105 && var4 >= 0 && ~var4 > -105) {
                  Class_mi.U[var3][var5][var4] = ~var3 < -1 ? Class_mi.U[var3 + -1][var5][var4] : 0;
               }

               var8 = var5 + 1;
            }
         }

         while (true) {
            for (; var2 + var5 > var8; var8++) {
               if (~var8 <= -1 && ~var8 > -105 && var11 >= 0 && ~var11 > -105) {
                  Class_mi.U[var3][var8][var11] = ~var3 < -1 ? Class_mi.U[var3 + -1][var8][var11] : 0;
               }
            }

            if (~(++var11) <= ~(var4 - -var0)) {
               if (var5 > 0 && var5 < 104) {
                  var8 = 1 + var4;
                  if (var9 != 0 || ~var8 > ~(var0 + var4)) {
                     do {
                        if (~var8 <= -1 && var8 < 104) {
                           Class_mi.U[var3][var5][var8] = Class_mi.U[var3][-1 + var5][var8];
                        }
                     } while (~(++var8) > ~(var0 + var4));
                  }
               }

               if (var4 > 0 && ~var4 > -105) {
                  var8 = var5 + 1;
                  if (var9 != 0 || var2 + var5 > var8) {
                     do {
                        if (var8 >= 0 && ~var8 > -105) {
                           Class_mi.U[var3][var8][var4] = Class_mi.U[var3][var8][-1 + var4];
                        }
                     } while (var2 + var5 > ++var8);
                  }
               }

               if (var5 >= 0 && var4 >= 0 && var5 < 104 && ~var4 > -105) {
                  if (~var3 == -1) {
                     if (var5 > 0 && Class_mi.U[var3][-1 + var5][var4] != 0) {
                        Class_mi.U[var3][var5][var4] = Class_mi.U[var3][-1 + var5][var4];
                        return;
                     }

                     if (var4 > 0 && Class_mi.U[var3][var5][var4 - 1] != 0) {
                        Class_mi.U[var3][var5][var4] = Class_mi.U[var3][var5][var4 + -1];
                        return;
                     }

                     if (~var5 < -1 && ~var4 < -1 && ~Class_mi.U[var3][-1 + var5][-1 + var4] != -1) {
                        Class_mi.U[var3][var5][var4] = Class_mi.U[var3][-1 + var5][-1 + var4];
                        return;
                     }

                     return;
                  }

                  if (~var5 < -1 && Class_mi.U[var3 - 1][-1 + var5][var4] != Class_mi.U[var3][var5 - 1][var4]) {
                     Class_mi.U[var3][var5][var4] = Class_mi.U[var3][-1 + var5][var4];
                     return;
                  }

                  if (var4 > 0 && Class_mi.U[var3][var5][-1 + var4] != Class_mi.U[-1 + var3][var5][-1 + var4]) {
                     Class_mi.U[var3][var5][var4] = Class_mi.U[var3][var5][-1 + var4];
                     return;
                  }

                  if (~var5 < -1 && var4 > 0 && Class_mi.U[var3][-1 + var5][-1 + var4] != Class_mi.U[var3 + -1][var5 - 1][var4 + -1]) {
                     Class_mi.U[var3][var5][var4] = Class_mi.U[var3][var5 - 1][var4 + -1];
                     return;
                  }
               }

               return;
            }

            var8 = var5;
            if (var9 != 0) {
               if (~var5 <= -1 && ~var5 > -105 && var11 >= 0 && ~var11 > -105) {
                  Class_mi.U[var3][var5][var11] = ~var3 < -1 ? Class_mi.U[var3 + -1][var5][var11] : 0;
               }

               var8 = var5 + 1;
            }
         }
      } catch (RuntimeException var10) {
         throw Class_sh.a(var10, "vh.D(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final byte[] b(byte var0, int var1) {
      int var10 = client.lb;

      try {
         jb++;
         if (var0 != 14) {
            cb = -127;
         }

         Class_we var2 = (Class_we)Class_nj.b.a((long)var1, (byte)-76);
         if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random(var1);
            int var5 = 0;
            if (var10 != 0 || ~var5 > -256) {
               do {
                  var3[var5] = (byte)var5;
               } while (~(++var5) > -256);
            }

            int var6 = 0;
            if (var10 != 0 || ~var6 > -256) {
               do {
                  int var7 = -var6 + 255;
                  int var8 = Class_jb.a(var7, (byte)70, var4);
                  byte var9 = var3[var8];
                  var3[var8] = var3[var7];
                  var3[var7] = var3[511 + -var6] = var9;
               } while (~(++var6) > -256);
            }

            var2 = new Class_we(var3);
            Class_nj.b.a(var1, (byte)112, var2);
         }

         return var2.K;
      } catch (RuntimeException var11) {
         throw Class_sh.a(var11, "vh.J(" + var0 + ',' + var1 + ')');
      }
   }
}
