final class Class_fa extends Class_ta {
   static int Kb;
   static int Lb;
   private int Mb;
   int Nb;
   static int Ob;
   static int Pb;
   static int Qb;
   int Rb = 0;
   int Sb;
   int Tb;
   int Ub;
   Class_wf Vb;
   Class_jh Wb;
   int Xb;
   static Class_r Yb = Class_tc.a(43, "Lade Titelbild )2 ");
   Class_r Zb;
   int ac;
   int bc;
   static int cc;
   static Class_nj dc = new Class_nj(64);
   int ec;
   static int fc;
   int gc;
   int hc;
   static int ic;
   boolean jc;
   private short kc;
   private short lc;
   int mc;
   static Class_r nc = Class_tc.a(43, "::");
   static Class_r oc = Class_tc.a(43, "blinken1:");
   static int[] pc = new int[100];
   int qc;
   static int rc;
   int sc;
   int tc;
   int uc;
   static int vc;
   static int wc;
   int xc;
   int yc;
   static Class_r zc = Class_fa.Bc;
   static Class_r Ac = Class_fa.Bc;
   private static Class_r Bc = Class_tc.a(43, "flash2:");

   static final void a(int var0, int var1, int var2, int var3) {
      Class_si.j = new Class_aa[var0][var1][var2];
      Class_mg.l = new int[var0][var1 + 1][var2 + 1];
      Class_ab.a(false);
      Class_ra.g = var1;
      Class_qb.m = var2;
      Class_me.k = new int[var0][var1 + 1][var2 + 1];
      Class_db.a();
      Class_rd.Y = var3;
      Class_kc.v = new boolean[Class_rd.Y + Class_rd.Y + 1][Class_rd.Y + Class_rd.Y + 1];
      Class_la.cb = new boolean[Class_rd.Y + Class_rd.Y + 2][Class_rd.Y + Class_rd.Y + 2];
   }

   private final void a(
      int var1, int var2, int var3, int var4, int var5, boolean var6, int var7, int var8, int var9, int var10, int var11, int var12, Class_jh var13
   ) {
      try {
         Lb++;
         int var14 = var9 * var9 + var2 * var2;
         if (!var6) {
            this.Tb = 113;
         }

         if (var14 >= 16 && var14 <= 360000) {
            int var15 = (int)(325.949 * Math.atan2(var9, var2)) & 2047;
            Class_jh var16 = Class_of.a(var3, super.J, super.Cb, var15, -10, var13, super.hb);
            if (var16 != null) {
               var16.a(0, var5, var4, var12, var10, var11, var1, var7, -1L);
            }
         }
      } catch (RuntimeException var17) {
         throw Class_sh.a(
            var17,
            "fa.FA("
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
               + ','
               + var11
               + ','
               + var12
               + ','
               + (var13 != null ? "{...}" : "null")
               + ')'
         );
      }
   }

   final void a(Class_lh var1, byte var2) {
      try {
         var1.p = 0;
         ic++;
         int var3 = var1.n(-6677);
         if (var2 >= -3) {
            this.kc = 64;
         }

         if (~(2 & var3) == -3) {
            this.lc = (short)(var1.n(-6677) << -1440797374);
            this.kc = (short)(var1.n(-6677) << 1237400642);
         } else {
            this.kc = 0;
            this.lc = 0;
         }

         this.Mb = 3 & var3 >> 1463074214;
         int var6 = super.Q;
         super.Q = (7 & var3 >> 1102585635) + 1;
         super.J = super.J + (super.Q - var6) * 64;
         int var7 = -1;
         boolean var5 = (4 & var3) != 0;
         int var4 = var3 & 1;
         super.hb = super.hb + 64 * (-var6 + super.Q);
         this.uc = var1.o(3390);
         int[] var8 = new int[12];
         this.hc = var1.o(3390);
         this.qc = 0;

         for (int var9 = 0; var9 < 12; var9++) {
            int var10 = var1.n(-6677);
            if (~var10 == -1) {
               var8[var9] = 0;
            } else {
               int var11 = var1.n(-6677);
               int var12 = var11 + (var10 << -1305834968);
               if (var9 == 0 && ~var12 == -65536) {
                  var7 = var1.k(1355769544);
                  break;
               }

               if (var12 >= 32768) {
                  var12 = Class_qj.T[-32768 + var12];
                  var8[var9] = Class_mb.a(var12, 1073741824);
                  int var13 = Class_ra.a(-25672, var12).eb;
                  if (~var13 != -1) {
                     this.qc = var13;
                  }
               } else {
                  var8[var9] = Class_mb.a(-2147483648, var12 - 256);
               }
            }
         }

         int[] var17 = new int[5];

         for (int var18 = 0; var18 < 5; var18++) {
            int var20 = var1.n(-6677);
            if (~var20 > -1 || var20 >= Class_jd.g[var18].length) {
               var20 = 0;
            }

            var17[var18] = var20;
         }

         super.C = var1.k(1355769544);
         if (~super.C == -65536) {
            super.C = -1;
         }

         super.lb = var1.k(1355769544);
         if (super.lb == 65535) {
            super.lb = -1;
         }

         super.kb = super.lb;
         super.P = var1.k(1355769544);
         if (super.P == 65535) {
            super.P = -1;
         }

         super.E = var1.k(1355769544);
         if (super.E == 65535) {
            super.E = -1;
         }

         super.ub = var1.k(1355769544);
         if (super.ub == 65535) {
            super.ub = -1;
         }

         super.jb = var1.k(1355769544);
         if (super.jb == 65535) {
            super.jb = -1;
         }

         super.M = var1.k(1355769544);
         if (super.M == 65535) {
            super.M = -1;
         }

         this.Zb = Class_jd.a(var1.j(54), -1).c(12688);
         this.ac = var1.n(-6677);
         if (var5) {
            this.Rb = var1.k(1355769544);
         } else {
            this.Rb = 0;
         }

         int var21 = this.mc;
         this.mc = var1.n(-6677);
         if (this.mc == 0) {
            Class_tg.a(-1, this);
         } else {
            int var14 = this.gc;
            int var22 = this.Nb;
            int var15 = this.Ub;
            this.Nb = var1.k(1355769544);
            this.gc = var1.k(1355769544);
            this.Ub = var1.k(1355769544);
            if (~var21 != ~this.mc || var22 != this.Nb || ~this.gc != ~var14 || var15 != this.Ub) {
               Class_ke.a((byte)-10, this);
            }
         }

         if (this.Vb == null) {
            this.Vb = new Class_wf();
         }

         this.Vb.a(var17, var8, ~var4 == -2, (byte)-126, var7);
      } catch (RuntimeException var16) {
         throw Class_sh.a(var16, "fa.BA(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
      }
   }

   final Class_r f(int var1) {
      try {
         Class_r var2 = this.Zb;
         cc++;
         if (Class_ub.H != null) {
            var2 = Class_o.a(2, new Class_r[]{Class_ub.H[this.Mb], var2});
         }

         if (var1 != 3000) {
            this.Zb = null;
         }

         if (Class_pe.D != null) {
            var2 = Class_o.a(var1 ^ 3002, new Class_r[]{var2, Class_pe.D[this.Mb]});
         }

         return var2;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "fa.GA(" + var1 + ')');
      }
   }

   final boolean d(int var1) {
      try {
         if (var1 <= 14) {
            this.a(49, 21, 126, -70, 76, 66, -93, -23, 86L);
         }

         Pb++;
         return this.Vb != null;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "fa.W(" + var1 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      int var45 = client.lb;

      try {
         fc++;
         if (this.Vb != null) {
            Class_uc var11 = super.ob != -1 && ~super.R == -1 ? Class_kk.a((byte)-36, super.ob) : null;
            Class_uc var12 = super.w == -1 || this.jc || ~super.w == ~super.C && var11 != null ? null : Class_kk.a((byte)-36, super.w);
            Class_jh var13 = this.Vb.a(super.u, var11, super.bb, var12, (byte)97);
            if (var13 != null) {
               super.mb = var13.a();
               if (Class_o.hb && (this.Vb.v == -1 || Class_i.c(this.Vb.v, -103).Q)) {
                  Class_jh var14 = Class_ua.a(
                     super.J,
                     var1,
                     super.Cb,
                     var13,
                     var12 != null ? super.bb : super.u,
                     var12 != null ? var12 : var11,
                     240,
                     0,
                     super.hb,
                     1,
                     160,
                     0,
                     64,
                     super.Db
                  );
                  var14.a(0, var2, var3, var4, var5, var6, var7, var8, -1L);
               }

               if (Class_gg.B == this) {
                  int var47 = -1 + Class_fd.d.length;
                  if (var45 != 0 || var47 >= 0) {
                     do {
                        Class_d var15 = Class_fd.d[var47];
                        if (var15 != null && ~var15.g != 0) {
                           if (var15.a == 1 && var15.e >= 0 && ~var15.e > ~Class_rf.a.length) {
                              Class_eh var16 = Class_rf.a[var15.e];
                              if (var16 != null) {
                                 int var18 = var16.J / 32 - Class_gg.B.J / 32;
                                 int var17 = var16.hb / 32 - Class_gg.B.hb / 32;
                                 this.a(var7, var18, var15.g, var3, var2, true, var8, var1, var17, var5, var6, var4, var13);
                              }
                           }

                           if (var15.a == 2) {
                              int var54 = (var15.d + -Class_va.ab) * 4 - (-2 + Class_gg.B.J / 32);
                              int var50 = -(Class_gg.B.hb / 32) + (4 * (-Class_fj.e + var15.h) - -2);
                              this.a(var7, var54, var15.g, var3, var2, true, var8, var1, var50, var5, var6, var4, var13);
                           }

                           if (~var15.a == -11 && var15.e >= 0 && ~var15.e > ~Class_db.Q.length) {
                              Class_fa var51 = Class_db.Q[var15.e];
                              if (var51 != null) {
                                 int var55 = -(Class_gg.B.hb / 32) + var51.hb / 32;
                                 int var58 = var51.J / 32 - Class_gg.B.J / 32;
                                 this.a(var7, var58, var15.g, var3, var2, true, var8, var1, var55, var5, var6, var4, var13);
                              }
                           }
                        }
                     } while (--var47 >= 0);
                  }
               }

               int var49 = 0;
               int var48 = 0;
               int var52 = 0;
               if (~this.lc != -1 && this.kc != 0) {
                  int var56 = Class_kd.e[var1];
                  int var59 = Class_kd.q[var1];
                  short var19 = this.lc;
                  short var20 = this.kc;
                  int var21 = -var19 / 2;
                  int var22 = -var20 / 2;
                  int var24 = -(var56 * var21) + var59 * var22 >> -1167294384;
                  int var23 = var59 * var21 + var56 * var22 >> -1961904976;
                  int var26 = var19 / 2;
                  int var27 = -var20 / 2;
                  int var25 = a(var23 + super.hb, Class_jk.F, var24 + super.J, false);
                  int var28 = var56 * var27 - -(var26 * var59) >> -630227760;
                  int var29 = var27 * var59 + -(var26 * var56) >> 397580528;
                  int var30 = a(super.hb + var28, Class_jk.F, var29 + super.J, false);
                  int var31 = -var19 / 2;
                  int var32 = var20 / 2;
                  int var33 = var31 * var59 + var56 * var32 >> 1273859056;
                  int var34 = -(var56 * var31) + var59 * var32 >> 606108336;
                  int var35 = a(var33 + super.hb, Class_jk.F, super.J + var34, false);
                  int var36 = var19 / 2;
                  int var37 = var20 / 2;
                  int var38 = var59 * var36 + var56 * var37 >> 1893849104;
                  int var39 = -(var56 * var36) + var37 * var59 >> 1377446096;
                  int var40 = a(var38 + super.hb, Class_jk.F, super.J + var39, false);
                  var52 = var40 + var25;
                  int var41 = var25 >= var30 ? var30 : var25;
                  if (~var52 < ~(var30 + var35)) {
                     var52 = var35 + var30;
                  }

                  int var44 = var35 <= var25 ? var35 : var25;
                  int var43 = ~var40 >= ~var30 ? var40 : var30;
                  int var42 = var40 <= var35 ? var40 : var35;
                  var48 = 2047 & (int)(Math.atan2(var41 - var42, var20) * 325.95);
                  if (~var48 != -1) {
                     var13.c(var48);
                  }

                  var49 = (int)(Math.atan2(-var43 + var44, var19) * 325.95) & 2047;
                  if (~var49 != -1) {
                     var13.d(var49);
                  }

                  var52 = -super.Cb + (var52 >> -1892740159);
                  if (~var52 != -1) {
                     var13.c(0, var52, 0);
                  }
               }

               Class_jh var57 = null;
               if (!this.jc && ~super.Y != 0 && super.yb != -1) {
                  Class_mb var60 = Class_qj.c(super.Y, 1);
                  var57 = var60.b(super.yb, -10);
                  if (var57 != null) {
                     var57.c(0, -super.gb, 0);
                     if (var60.q) {
                        if (var48 != 0) {
                           var57.c(var48);
                        }

                        if (~var49 != -1) {
                           var57.d(var49);
                        }

                        if (~var52 != -1) {
                           var57.c(0, var52, 0);
                        }
                     }
                  }
               }

               Class_jh var61 = null;
               if (!this.jc && this.Wb != null) {
                  if (Class_be.C >= this.yc) {
                     this.Wb = null;
                  }

                  label183:
                  if (Class_be.C >= this.Xb && ~this.yc < ~Class_be.C) {
                     var61 = this.Wb;
                     var61.c(-super.hb + this.bc, this.tc - super.Cb, this.Sb - super.J);
                     if (super.F == 512) {
                        var61.i();
                        if (var45 == 0) {
                           break label183;
                        }
                     }

                     if (~super.F == -1025) {
                        var61.f();
                        if (var45 == 0) {
                           break label183;
                        }
                     }

                     if (super.F == 1536) {
                        var61.e();
                     }
                  }
               }

               if (var57 != null) {
                  var13 = ((Class_qa)var13).a(var57);
               }

               if (var61 != null) {
                  var13 = ((Class_qa)var13).a(var61);
               }

               var13.p = true;
               var13.a(var1, var2, var3, var4, var5, var6, var7, var8, var9);
               if (var61 != null) {
                  label233: {
                     if (super.F == 512) {
                        var61.e();
                        if (var45 == 0) {
                           break label233;
                        }
                     }

                     if (super.F != 1024) {
                        if (~super.F != -1537) {
                           break label233;
                        }

                        var61.i();
                        if (var45 == 0) {
                           break label233;
                        }
                     }

                     var61.f();
                  }

                  var61.c(super.hb - this.bc, -this.tc + super.Cb, -this.Sb + super.J);
               }
            }
         }
      } catch (RuntimeException var46) {
         throw Class_sh.a(var46, "fa.A(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ')');
      }
   }

   static final void g(int var0) {
      try {
         if (var0 != 64) {
            Bc = null;
         }

         wc++;
         Class_hj.bb = Class_wa.i;
         Class_hc.a(false, var0 + 576);
         Class_c.d((byte)124);
         Class_mc.a(var0 ^ -65, Class_hj.bb);
         Class_gg.B = new Class_fa();
         Class_gg.B.hb = 3000;
         Class_gg.B.J = 3000;
         Class_gk.a(var0 ^ 67, Class_id.s);
         Class_ca.a(10, (byte)-94);
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "fa.CA(" + var0 + ')');
      }
   }

   final int a() {
      try {
         vc++;
         return super.mb;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "fa.D(" + 41);
      }
   }

   public static void b(byte var0) {
      try {
         oc = null;
         if (var0 <= 27) {
            b((byte)69);
         }

         nc = null;
         dc = null;
         Ac = null;
         pc = null;
         Bc = null;
         Yb = null;
         zc = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "fa.EA(" + var0 + ')');
      }
   }

   static final int a(int var0, int var1, int var2, boolean var3) {
      try {
         Qb++;
         int var5 = var2 >> -1075247801;
         int var4 = var0 >> 560014343;
         if (~var4 <= -1 && var5 >= 0 && ~var4 >= -104 && ~var5 >= -104) {
            int var6 = var1;
            int var7 = 127 & var0;
            int var8 = var2 & 127;
            if (var3) {
               return -41;
            } else {
               if (var1 < 3 && (Class_kk.c[1][var4][var5] & 2) == 2) {
                  var6 = var1 + 1;
               }

               int var9 = Class_mi.U[var6][1 + var4][var5] * var7 + (-var7 + 128) * Class_mi.U[var6][var4][var5] >> -303145273;
               int var10 = var7 * Class_mi.U[var6][var4 + 1][1 + var5] + Class_mi.U[var6][var4][var5 + 1] * (-var7 + 128) >> -599314009;
               return (-var8 + 128) * var9 - -(var10 * var8) >> -558759673;
            }
         } else {
            return 0;
         }
      } catch (RuntimeException var11) {
         throw Class_sh.a(var11, "fa.HA(" + var0 + 44 + var1 + 44 + var2 + 44 + var3 + 41);
      }
   }

   static final int c(int var0, int var1) {
      try {
         if (var0 < 94) {
            c(-31, -69);
         }

         Ob++;
         return 63 & var1 >> -1110562197;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "fa.DA(" + var0 + 44 + var1 + 41);
      }
   }

   Class_fa() {
      this.Mb = 0;
      this.Nb = -1;
      this.gc = -1;
      this.Xb = 0;
      this.Ub = -1;
      this.jc = false;
      this.lc = 0;
      this.mc = 0;
      this.qc = 0;
      this.kc = 0;
      this.hc = -1;
      this.ac = 0;
      this.uc = -1;
      this.yc = 0;
   }
}
