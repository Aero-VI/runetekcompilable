final class Class_sg extends Class_cj {
   static int[] hb = new int[2];
   static int ib;
   static Class_r jb = Class_tc.a(43, "<col=ffffff>");
   private volatile boolean kb;
   private int lb;
   static Class_r mb = Class_tc.a(43, "Musik)2Engine vorbereitet)3");
   private Class_p nb;
   static int ob;
   private int pb;
   static Class_r qb = Class_tc.a(43, "(Udns");
   static long[] rb = new long[100];
   private boolean sb = false;
   static boolean tb = false;
   static int ub;
   static int vb;
   private int wb;
   static int xb;
   static Class_r[] yb = new Class_r[1000];
   private int zb;
   static int Ab;
   private Class_p Bb;
   static int Cb;
   static int Db;
   static int Eb;
   private volatile boolean[] Fb;
   static int Gb;
   static int Hb;

   final void a(int var1, byte var2) {
      try {
         vb++;
         if (var2 < 84) {
            this.sb = true;
         }

         if (this.d(var1, 0)) {
            Class_ch.a(this.lb, var1, true);
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "sg.V(" + var1 + ',' + var2 + ')');
      }
   }

   final void a(int var1, boolean var2, byte[] var3, Class_p var4, int var5) {
      try {
         Ab++;
         label94:
         if (var4 != this.Bb) {
            if (!var2 && var5 == this.zb) {
               this.kb = true;
            }

            if (var3 != null && var3.length > 2) {
               Class_tb.l.reset();
               Class_tb.l.update(var3, 0, -2 + var3.length);
               int var12 = (int)Class_tb.l.getValue();
               int var14 = (255 & var3[-1 + var3.length]) + (var3[-2 + var3.length] << -1474592440 & 0xFF00);
               if (~super.U[var5] == ~var12 && var14 == super.ab[var5]) {
                  this.Fb[var5] = true;
                  if (var2) {
                     super.n[var5] = Class_ui.a(false, (byte)-126, var3);
                  }
                  break label94;
               }

               this.Fb[var5] = false;
               if (this.sb || var2) {
                  Class_ua.a(var2, super.U[var5], this.lb, (byte)2, var5, this, (byte)22);
               }

               return;
            }

            this.Fb[var5] = false;
            if (this.sb || var2) {
               Class_ua.a(var2, super.U[var5], this.lb, (byte)2, var5, this, (byte)22);
            }

            return;
         } else {
            if (this.kb) {
               throw new RuntimeException();
            }

            if (var3 == null) {
               Class_ua.a(true, this.pb, 255, (byte)0, this.lb, this, (byte)22);
               return;
            }

            Class_tb.l.reset();
            Class_tb.l.update(var3, 0, var3.length);
            int var6 = (int)Class_tb.l.getValue();
            if (~this.pb != ~var6) {
               Class_ua.a(true, this.pb, 255, (byte)0, this.lb, this, (byte)22);
               return;
            }

            Class_lh var7;
            try {
               var7 = new Class_lh(Class_r.a(var3, true));
            } catch (RuntimeException var10) {
               Class_ua.a(true, this.pb, 255, (byte)0, this.lb, this, (byte)22);
               return;
            }

            int var8 = var7.n(-6677);
            if (~var8 != -6 && var8 != 6) {
               Class_ua.a(true, this.pb, 255, (byte)0, this.lb, this, (byte)22);
               return;
            }

            int var9 = 0;
            if (var8 >= 6) {
               var9 = var7.h(-5528);
            }

            if (~var9 != ~this.wb) {
               Class_ua.a(true, this.pb, 255, (byte)0, this.lb, this, (byte)22);
               return;
            }

            this.a(var3, -25529);
            this.k(-1);
         }

         int var13 = -14 / ((var1 - 77) / 41);
      } catch (RuntimeException var11) {
         throw Class_sh.a(
            var11, "sg.OA(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ',' + (var4 != null ? "{...}" : "null") + ',' + var5 + ')'
         );
      }
   }

   final int h(int var1) {
      try {
         Db++;
         if (this.kb) {
            return 100;
         } else if (super.n != null) {
            return 99;
         } else {
            int var2 = Class_ug.a(0, this.lb, 255);
            if (~var2 <= -101) {
               var2 = 99;
            }

            int var3 = 120 / ((var1 - -13) / 59);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "sg.QA(" + var1 + 41);
      }
   }

   static final void i(int var0) {
      try {
         xb++;
         Class_bc.T.a(-114);
         if (var0 >= 29) {
            Class_rj.x.a(-50);
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "sg.NA(" + var0 + ')');
      }
   }

   static final boolean h(int var0, int var1) {
      try {
         if (var1 != -1) {
            j(-14);
         }

         Gb++;
         return var0 == (-var0 & var0);
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "sg.VA(" + var0 + ',' + var1 + ')');
      }
   }

   Class_sg(Class_p var1, Class_p var2, int var3, boolean var4, boolean var5, boolean var6) {
      super(var4, var5);
      this.kb = false;
      this.zb = -1;

      try {
         this.lb = var3;
         this.Bb = var2;
         this.nb = var1;
         this.sb = var6;
         Class_me.a(this, -5720, this.lb);
      } catch (RuntimeException var8) {
         throw Class_sh.a(
            var8,
            "sg.<init>("
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

   final int a(int var1, int var2) {
      try {
         ib++;
         if (!this.d(var2, var1)) {
            return 0;
         } else if (super.n[var2] != null) {
            return 100;
         } else {
            return this.Fb[var2] ? 100 : Class_ug.a(0, var2, this.lb);
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "sg.W(" + var1 + 44 + var2 + 41);
      }
   }

   final void a(int var1, byte var2, int var3) {
      try {
         ub++;
         this.pb = var3;
         this.wb = var1;
         if (this.Bb != null) {
            Class_jj.a(this.Bb, this, 1, this.lb);
         } else {
            Class_ua.a(true, this.pb, 255, (byte)0, this.lb, this, (byte)22);
         }

         if (var2 <= 76) {
            rb = null;
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "sg.PA(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, byte var6, int var7) {
      int var47 = client.lb;

      try {
         Eb++;
         int var8 = 0;
         if (var6 < -58) {
            int var9 = var1;
            int var10 = 0;
            int var11 = var5 + -var0;
            int var13 = var5 * var5;
            int var12 = -var0 + var1;
            int var14 = var1 * var1;
            int var15 = var11 * var11;
            int var16 = var12 * var12;
            int var17 = var14 << -1237884991;
            int var18 = var13 << -1926222943;
            int var19 = var16 << -537209631;
            int var20 = var15 << 1572030849;
            int var22 = var12 << 724144353;
            int var21 = var1 << -677379135;
            int var24 = var14 + -((var21 + -1) * var18);
            int var23 = (1 - var21) * var13 + var17;
            int var25 = var15 * (-var22 + 1) - -var19;
            int var27 = var13 << 1081088002;
            int var26 = var16 + -(var20 * (var22 - 1));
            int var29 = var15 << -406053726;
            int var28 = var14 << 1232063042;
            int var30 = var16 << -1319405822;
            int var33 = var19 * 3;
            int var31 = var17 * 3;
            int var34 = var20 * (-3 + var22);
            int var32 = var18 * (-3 + var21);
            int var35 = var28;
            int var36 = (-1 + var1) * var27;
            int var38 = (-1 + var12) * var29;
            int[] var39 = Class_qd.p[var7];
            int var37 = var30;
            Class_fd.a(-var5 + var3, (byte)-17, var2, var39, -var11 + var3);
            Class_fd.a(-var11 + var3, (byte)-17, var4, var39, var11 + var3);
            Class_fd.a(var11 + var3, (byte)-17, var2, var39, var5 + var3);
            if (var47 != 0 || var1 > 0) {
               do {
                  if (~var23 > -1 && (var47 != 0 || ~var23 > -1)) {
                     do {
                        var8++;
                        var23 += var31;
                        var24 += var35;
                        var35 += var28;
                        var31 += var28;
                     } while (~var23 > -1);
                  }

                  boolean var40 = ~var9 >= ~var12;
                  if (var40) {
                     if (var25 < 0 && (var47 != 0 || ~var25 > -1)) {
                        do {
                           var10++;
                           var26 += var37;
                           var25 += var33;
                           var37 += var30;
                           var33 += var30;
                        } while (~var25 > -1);
                     }

                     if (~var26 > -1) {
                        var25 += var33;
                        var26 += var37;
                        var10++;
                        var37 += var30;
                        var33 += var30;
                     }

                     var25 += -var38;
                     var26 += -var34;
                     var34 -= var29;
                     var38 -= var29;
                  }

                  if (~var24 > -1) {
                     var23 += var31;
                     var24 += var35;
                     var8++;
                     var31 += var28;
                     var35 += var28;
                  }

                  label63: {
                     var23 += -var36;
                     var9--;
                     int var43 = var3 - -var8;
                     int var42 = var7 - -var9;
                     var36 -= var27;
                     int var41 = var7 + -var9;
                     int var44 = -var8 + var3;
                     var24 += -var32;
                     if (!var40) {
                        Class_fd.a(var44, (byte)-17, var2, Class_qd.p[var41], var43);
                        Class_fd.a(var44, (byte)-17, var2, Class_qd.p[var42], var43);
                        if (var47 == 0) {
                           break label63;
                        }
                     }

                     int var45 = var3 + var10;
                     int var46 = var3 + -var10;
                     Class_fd.a(var44, (byte)-17, var2, Class_qd.p[var41], var46);
                     Class_fd.a(var46, (byte)-17, var4, Class_qd.p[var41], var45);
                     Class_fd.a(var45, (byte)-17, var2, Class_qd.p[var41], var43);
                     Class_fd.a(var44, (byte)-17, var2, Class_qd.p[var42], var46);
                     Class_fd.a(var46, (byte)-17, var4, Class_qd.p[var42], var45);
                     Class_fd.a(var45, (byte)-17, var2, Class_qd.p[var42], var43);
                  }

                  var32 -= var27;
               } while (var9 > 0);
            }
         }
      } catch (RuntimeException var48) {
         throw Class_sh.a(var48, "sg.SA(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
      }
   }

   final void a(byte var1, int var2) {
      try {
         Hb++;
         if (this.d(var2, 0)) {
            label34: {
               if (this.nb == null || this.Fb == null || !this.Fb[var2]) {
                  Class_ua.a(true, super.U[var2], this.lb, (byte)2, var2, this, (byte)22);
                  if (client.lb == 0) {
                     break label34;
                  }
               }

               Class_jj.a(this.nb, this, 1, var2);
            }

            if (var1 > -103) {
               hb = null;
            }
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "sg.J(" + var1 + ',' + var2 + ')');
      }
   }

   public static void j(int var0) {
      try {
         qb = null;
         if (var0 != -677379135) {
            i(107);
         }

         mb = null;
         rb = null;
         jb = null;
         hb = null;
         yb = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "sg.RA(" + var0 + ')');
      }
   }

   final void a(boolean var1, boolean var2, int var3, int var4, byte[] var5) {
      try {
         if (var4 >= 122) {
            ob++;
            if (var2) {
               if (this.kb) {
                  throw new RuntimeException();
               } else {
                  if (this.Bb != null) {
                     Class_c.a(this.lb, var5, -30372, this.Bb);
                  }

                  this.a(var5, -25529);
                  this.k(-1);
               }
            } else {
               var5[var5.length + -2] = (byte)(super.ab[var3] >> 840888328);
               var5[var5.length - 1] = (byte)super.ab[var3];
               if (this.nb != null) {
                  Class_c.a(var3, var5, -30372, this.nb);
                  this.Fb[var3] = true;
               }

               if (var1) {
                  super.n[var3] = Class_ui.a(false, (byte)71, var5);
               }
            }
         }
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "sg.TA(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + (var5 != null ? "{...}" : "null") + ')');
      }
   }

   private final void k(int var1) {
      try {
         Cb++;
         this.Fb = new boolean[super.n.length];

         for (int var2 = 0; ~var2 > ~this.Fb.length; var2++) {
            this.Fb[var2] = false;
         }

         if (this.nb == null) {
            this.kb = true;
         } else {
            this.zb = var1;

            for (int var3 = 0; ~this.Fb.length < ~var3; var3++) {
               if (~super.t[var3] < -1) {
                  Class_v.a(this, (byte)-119, this.nb, var3);
                  this.zb = var3;
               }
            }

            if (~this.zb == 0) {
               this.kb = true;
            }
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "sg.UA(" + var1 + ')');
      }
   }
}
