final class Class_m extends Class_lf {
   private int Q = 0;
   private int R;
   static int S;
   static int T;
   private int U;
   static Class_qc V = new Class_qc(30);
   private int W;
   static int X;
   static int Y;
   private int Z = 0;
   private int ab = 0;
   private int bb;
   static int cb;
   static int db;
   static int eb;
   private int fb;
   static int gb;
   private int hb;
   static Class_qc ib = new Class_qc(20);
   static short[] jb = new short[]{-10304, 9104, -1, -1, -1};
   static int kb = 0;
   static Class_r lb = Class_tc.a(43, "Speicher wird zugewiesen)3");
   static Class_r mb = Class_m.ob;
   static Class_r nb = Class_m.ob;
   private static Class_r ob = Class_tc.a(43, "flash1:");

   static final int b(int var0, int var1) {
      try {
         gb++;
         if (var0 != 26151) {
            d(-53, 103, -43);
         }

         int var3 = var1 * 6 + -61440;
         int var4 = 40960 - -(var3 * var1 >> 176455820);
         int var2 = (var1 * var1 >> -966678452) * var1 >> -1617612404;
         return var2 * var4 >> -1878668532;
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "m.D(" + var0 + 44 + var1 + 41);
      }
   }

   final void a(Class_lh var1, int var2, int var3) {
      int var5 = client.lb;

      try {
         label41: {
            label40: {
               label39: {
                  if (~var2 != -1) {
                     if (~var2 == -2) {
                        break label39;
                     }

                     if (var2 != 2) {
                        break label41;
                     }

                     if (var5 == 0) {
                        break label40;
                     }
                  }

                  this.ab = var1.p(var3 ^ 22488);
                  if (var5 == 0) {
                     break label41;
                  }
               }

               this.Q = (var1.o(3390) << 1048193548) / 100;
               if (var5 == 0) {
                  break label41;
               }
            }

            this.Z = (var1.o(3390) << 1256237644) / 100;
         }

         if (var3 != -1) {
            d(-91, -92, 95);
         }

         eb++;
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "m.K(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int[][] a(int var1, boolean var2) {
      int var12 = client.lb;

      try {
         cb++;
         if (!var2) {
            return null;
         } else {
            int[][] var3 = super.K.a(var1, (byte)87);
            if (super.K.q) {
               int[][] var4 = this.c(-40, 0, var1);
               int[] var6 = var4[1];
               int[] var8 = var3[0];
               int[] var7 = var4[2];
               int[] var9 = var3[1];
               int[] var5 = var4[0];
               int[] var10 = var3[2];
               int var11 = 0;
               if (var12 != 0 || ~Class_ld.X < ~var11) {
                  do {
                     this.a(var6[var11], var7[var11], var5[var11], false);
                     this.W = this.W + this.Z;
                     this.U = this.U + this.ab;
                     if (~this.W > -1) {
                        this.W = 0;
                     }

                     this.hb = this.hb + this.Q;
                     if (~this.W < -4097) {
                        this.W = 4096;
                        if (var12 != 0) {
                           this.U += 4096;
                        }
                     }

                     while (~this.U > -1) {
                        this.U += 4096;
                     }

                     if (~this.hb > -1) {
                        this.hb = 0;
                        if (var12 != 0) {
                           this.U -= 4096;
                        }
                     }

                     while (this.U > 4096) {
                        this.U -= 4096;
                     }

                     if (this.hb > 4096) {
                        this.hb = 4096;
                     }

                     this.a(this.W, false, this.U, this.hb);
                     var8[var11] = this.R;
                     var9[var11] = this.fb;
                     var10[var11] = this.bb;
                  } while (~Class_ld.X < ~(++var11));
               }
            }

            return var3;
         }
      } catch (RuntimeException var13) {
         throw Class_sh.a(var13, "m.A(" + var1 + ',' + var2 + ')');
      }
   }

   public Class_m() {
      super(1, false);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void d(byte var0) {
      int var9 = client.lb;

      try {
         if (~Class_c.w > -129) {
            Class_c.w = 128;
         }

         if (Class_c.w > 383) {
            Class_c.w = 383;
         }

         X++;
         Class_ba.z &= 2047;
         int var1 = Class_bk.N >> -14897657;
         int var2 = Class_wc.N >> -909518393;
         int var3 = Class_fa.a(Class_bk.N, Class_jk.F, Class_wc.N, false);
         int var4 = 0;
         if (var1 > 3 && var2 > 3 && var1 < 100 && ~var2 > -101) {
            int var5 = -4 + var1;
            if (var9 != 0 || var5 <= 4 + var1) {
               do {
                  int var6 = -4 + var2;
                  if (var9 != 0 || var6 <= 4 + var2) {
                     do {
                        int var7 = Class_jk.F;
                        if (~var7 > -4 && (Class_kk.c[1][var5][var6] & 2) == 2) {
                           var7++;
                        }

                        int var8 = -Class_mi.U[var7][var5][var6] + var3;
                        if (var4 < var8) {
                           var4 = var8;
                        }
                     } while (++var6 <= 4 + var2);
                  }
               } while (++var5 <= 4 + var1);
            }
         }

         int var11 = 192 * var4;
         if (var0 <= -22) {
            if (~var11 < -98049) {
               var11 = 98048;
            }

            if (~var11 > -32769) {
               var11 = 32768;
            }

            if (~var11 < ~Class_wj.t) {
               Class_wj.t = Class_wj.t + (var11 + -Class_wj.t) / 24;
            } else if (Class_wj.t > var11) {
               Class_wj.t = Class_wj.t + (var11 + -Class_wj.t) / 80;
            }
         }
      } catch (RuntimeException var10) {
         throw Class_sh.a(var10, "m.C(" + var0 + ')');
      }
   }

   private final void a(int var1, int var2, int var3, boolean var4) {
      int var11 = client.lb;

      try {
         int var7;
         int var13;
         int var14;
         label82: {
            S++;
            int var6 = var3 < var1 ? var3 : var1;
            int var5 = ~var3 >= ~var1 ? var1 : var3;
            var13 = ~var2 < ~var5 ? var2 : var5;
            var14 = ~var6 < ~var2 ? var2 : var6;
            this.W = (var13 + var14) / 2;
            var7 = -var14 + var13;
            if (~this.W < -1 && this.W < 4096) {
               this.hb = (var7 << -1546870612) / (this.W <= 2048 ? this.W * 2 : 8192 - 2 * this.W);
               if (var11 == 0) {
                  break label82;
               }
            }

            this.hb = 0;
         }

         label75: {
            if (var7 > 0) {
               label88: {
                  int var8 = (-var3 + var13 << 1780777132) / var7;
                  int var9 = (var13 - var1 << 1472044620) / var7;
                  int var10 = (var13 + -var2 << 1198254060) / var7;
                  if (~var13 != ~var3) {
                     if (~var1 == ~var13) {
                        this.U = var14 != var2 ? 12288 + -var10 : var8 + 4096;
                        if (var11 == 0) {
                           break label88;
                        }
                     }

                     this.U = ~var14 != ~var3 ? -var8 + 20480 : 12288 + var9;
                     if (var11 == 0) {
                        break label88;
                     }
                  }

                  this.U = var14 != var1 ? 4096 - var9 : var10 + 20480;
               }

               this.U /= 6;
               if (var11 == 0) {
                  break label75;
               }
            }

            this.U = 0;
         }

         if (var4) {
            lb = null;
         }
      } catch (RuntimeException var12) {
         throw Class_sh.a(var12, "m.H(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
      }
   }

   public static void g(int var0) {
      try {
         lb = null;
         V = null;
         jb = null;
         nb = null;
         ob = null;
         mb = null;
         if (var0 != -22338) {
            h(68);
         }

         ib = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "m.B(" + var0 + ')');
      }
   }

   static final void h(int var0) {
      int var9 = client.lb;

      try {
         db++;

         while (~Class_f.T.n(Class_sf.g, -128) <= -12) {
            int var1 = Class_f.T.e((byte)0, 11);
            if (~var1 == -2048) {
               break;
            }

            boolean var2 = false;
            if (Class_db.Q[var1] == null) {
               var2 = true;
               Class_db.Q[var1] = new Class_fa();
               if (Class_aa.q[var1] != null) {
                  Class_db.Q[var1].a(Class_aa.q[var1], (byte)-12);
               }
            }

            Class_oc.q[client.ib++] = var1;
            Class_fa var3 = Class_db.Q[var1];
            var3.vb = Class_be.C;
            int var4 = Class_f.T.e((byte)0, 5);
            int var5 = Class_f.T.e((byte)0, 1);
            if (~var5 == -2) {
               Class_cc.Db[Class_uf.U++] = var1;
            }

            int var6 = Class_fk.bb[Class_f.T.e((byte)0, 3)];
            if (var4 > 15) {
               var4 -= 32;
            }

            if (var2) {
               var3.F = var3.U = var6;
            }

            int var7 = Class_f.T.e((byte)0, 1);
            int var8 = Class_f.T.e((byte)0, 5);
            if (var8 > 15) {
               var8 -= 32;
            }

            var3.a(Class_gg.B.qb[0] + var8, (byte)-68, Class_gg.B.v[0] + var4, var7 == 1);
            if (var9 != 0) {
               break;
            }
         }

         int var11 = -46 / ((var0 - -42) / 42);
         Class_f.T.f((byte)-59);
      } catch (RuntimeException var10) {
         throw Class_sh.a(var10, "m.E(" + var0 + ')');
      }
   }

   static final boolean d(int var0, int var1, int var2) {
      try {
         if (var2 != -32276) {
            kb = 11;
         }

         T++;
         return ~(var1 >> 1 + var0 & 1) != -1;
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "m.J(" + var0 + ',' + var1 + ',' + var2 + ')');
      }
   }

   private final void a(int var1, boolean var2, int var3, int var4) {
      int var14 = client.lb;

      try {
         if (var2) {
            this.Z = -97;
         }

         label71: {
            int var5 = var1 > 2048 ? -(var4 * var1 >> 463698700) + var4 + var1 : var1 * (4096 - -var4) >> 527559596;
            if (var5 <= 0) {
               this.R = this.fb = this.bb = var1;
               if (var14 == 0) {
                  break label71;
               }
            }

            int var6;
            int var12;
            label58: {
               int var11;
               label57: {
                  label56: {
                     label55: {
                        label54: {
                           var3 *= 6;
                           int var8 = var3 >> -1885464436;
                           var6 = -var5 + var1 - -var1;
                           int var7 = (-var6 + var5 << -1982504532) / var5;
                           int var9 = -(var8 << -132334932) + var3;
                           int var10 = var7 * var5 >> 1173807372;
                           var10 = var10 * var9 >> 994569804;
                           var11 = var10 + var6;
                           var12 = var5 - var10;
                           if (~var8 != -1) {
                              if (var8 == 1) {
                                 break label54;
                              }

                              if (~var8 == -3) {
                                 break label55;
                              }

                              if (var8 == 3) {
                                 break label56;
                              }

                              if (~var8 == -5) {
                                 break label57;
                              }

                              if (~var8 != -6) {
                                 break label71;
                              }

                              if (var14 == 0) {
                                 break label58;
                              }
                           }

                           this.fb = var11;
                           this.bb = var6;
                           this.R = var5;
                           if (var14 == 0) {
                              break label71;
                           }
                        }

                        this.bb = var6;
                        this.fb = var5;
                        this.R = var12;
                        if (var14 == 0) {
                           break label71;
                        }
                     }

                     this.bb = var11;
                     this.fb = var5;
                     this.R = var6;
                     if (var14 == 0) {
                        break label71;
                     }
                  }

                  this.R = var6;
                  this.bb = var5;
                  this.fb = var12;
                  if (var14 == 0) {
                     break label71;
                  }
               }

               this.bb = var5;
               this.fb = var6;
               this.R = var11;
               if (var14 == 0) {
                  break label71;
               }
            }

            this.R = var5;
            this.fb = var6;
            this.bb = var12;
         }

         Y++;
      } catch (RuntimeException var15) {
         throw Class_sh.a(var15, "m.F(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
      }
   }
}
