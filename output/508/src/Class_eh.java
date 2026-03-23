final class Class_eh extends Class_ta {
   static int Kb;
   static short Lb = 256;
   static long Mb = 0L;
   static int Nb;
   static int Ob;
   Class_nd Pb;
   static int Qb;
   static int Rb;
   static int Sb;

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      try {
         Nb++;
         if (this.Pb != null) {
            Class_uc var11 = super.ob != -1 && ~super.R == -1 ? Class_kk.a((byte)-36, super.ob) : null;
            Class_uc var12 = super.w == -1 || ~super.w == ~super.C && var11 != null ? null : Class_kk.a((byte)-36, super.w);
            Class_jh var13 = this.Pb.a(super.bb, var12, (byte)17, var11, super.u);
            if (var13 != null) {
               super.mb = var13.a();
               Class_nd var14 = this.Pb;
               if (var14.z != null) {
                  var14 = var14.d(-94);
               }

               if (Class_o.hb && var14.Q) {
                  Class_jh var15 = Class_ua.a(
                     super.J,
                     var1,
                     super.Cb,
                     var13,
                     var12 == null ? super.u : super.bb,
                     var12 != null ? var12 : var11,
                     this.Pb.V,
                     this.Pb.E,
                     super.hb,
                     this.Pb.T,
                     this.Pb.mb,
                     this.Pb.gb,
                     126,
                     super.Db
                  );
                  var15.a(0, var2, var3, var4, var5, var6, var7, var8, -1L);
               }

               int var47 = 0;
               int var16 = 0;
               int var17 = 0;
               if (~this.Pb.n != -1 || this.Pb.r != 0) {
                  int var19 = Class_kd.q[var1];
                  int var18 = Class_kd.e[var1];
                  short var21 = this.Pb.r;
                  int var23 = -var21 / 2;
                  short var20 = this.Pb.n;
                  int var22 = -var20 / 2;
                  int var25 = var23 * var19 + -(var22 * var18) >> 1251056880;
                  int var24 = var22 * var19 + var18 * var23 >> 115299728;
                  int var26 = Class_fa.a(var24 + super.hb, Class_jk.F, var25 + super.J, false);
                  int var27 = var20 / 2;
                  int var28 = -var21 / 2;
                  int var29 = var28 * var18 - -(var27 * var19) >> 1936501744;
                  int var30 = var19 * var28 + -(var27 * var18) >> -1685447984;
                  int var31 = Class_fa.a(var29 + super.hb, Class_jk.F, super.J + var30, false);
                  int var32 = -var20 / 2;
                  int var33 = var21 / 2;
                  int var35 = -(var18 * var32) + var19 * var33 >> -1205804048;
                  int var38 = var21 / 2;
                  int var34 = var33 * var18 + var32 * var19 >> -1207711408;
                  int var37 = var20 / 2;
                  int var39 = var38 * var18 - -(var37 * var19) >> -1730400016;
                  int var40 = -(var18 * var37) + var38 * var19 >> -789010448;
                  int var36 = Class_fa.a(var34 + super.hb, Class_jk.F, var35 + super.J, false);
                  int var41 = Class_fa.a(super.hb - -var39, Class_jk.F, super.J + var40, false);
                  var17 = var26 + var41;
                  if (~(var36 + var31) > ~var17) {
                     var17 = var31 + var36;
                  }

                  int var43 = var36 < var41 ? var36 : var41;
                  int var42 = var31 > var26 ? var26 : var31;
                  int var44 = ~var41 >= ~var31 ? var41 : var31;
                  int var45 = ~var36 < ~var26 ? var26 : var36;
                  if (~var21 != -1) {
                     var47 = 2047 & (int)(Math.atan2(-var43 + var42, var21) * 325.95);
                     if (~var47 != -1) {
                        var13.c(var47);
                     }
                  }

                  if (~var20 != -1) {
                     var16 = (int)(325.95 * Math.atan2(var45 + -var44, var20)) & 2047;
                     if (var16 != 0) {
                        var13.d(var16);
                     }
                  }

                  var17 = -super.Cb + (var17 >> 1813388225);
                  if (~var17 != -1) {
                     var13.c(0, var17, 0);
                  }
               }

               Class_jh var49 = null;
               if (~super.Y != 0 && super.yb != -1) {
                  Class_mb var50 = Class_qj.c(super.Y, 1);
                  var49 = var50.b(super.yb, -10);
                  if (var49 != null) {
                     var49.c(0, -super.gb, 0);
                     if (var50.q) {
                        if (var47 != 0) {
                           var49.c(var47);
                        }

                        if (~var16 != -1) {
                           var49.d(var16);
                        }

                        if (~var17 != -1) {
                           var49.c(0, var17, 0);
                        }
                     }
                  }
               }

               if (var49 != null) {
                  var13 = ((Class_qa)var13).a(var49);
               }

               if (this.Pb.T == 1) {
                  var13.p = true;
               }

               var13.a(var1, var2, var3, var4, var5, var6, var7, var8, var9);
            }
         }
      } catch (RuntimeException var46) {
         throw Class_sh.a(var46, "eh.A(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ')');
      }
   }

   final boolean d(int var1) {
      try {
         Kb++;
         if (this.Pb == null) {
            return false;
         } else {
            if (var1 < 14) {
               a(null, false, -3);
            }

            return true;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "eh.W(" + var1 + ')');
      }
   }

   static final void a(byte var0, Class_ta var1) {
      try {
         if (var0 <= 116) {
            a(106, 48, 104, -51);
         }

         if (var1.Ib == 0) {
            var1.F = 1024;
         }

         var1.s = 0;
         Sb++;
         if (var1.Ib == 1) {
            var1.F = 1536;
         }

         int var3 = var1.fb * 128 - -(64 * var1.Q);
         if (var1.Ib == 2) {
            var1.F = 0;
         }

         int var2 = -Class_be.C + var1.W;
         int var4 = 128 * var1.q - -(var1.Q * 64);
         var1.hb = var1.hb + (var3 + -var1.hb) / var2;
         if (~var1.Ib == -4) {
            var1.F = 512;
         }

         var1.J = var1.J + (var4 - var1.J) / var2;
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "eh.BA(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   final int a() {
      try {
         Ob++;
         return super.mb;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "eh.D(" + 41);
      }
   }

   static final void a(Class_r var0, boolean var1, int var2) {
      try {
         Qb++;
         if (var2 >= -112) {
            Mb = -56L;
         }

         if (!var1) {
            try {
               Class_lj.i.getAppletContext().showDocument(var0.a(Class_lj.i.getCodeBase(), 4), "_top");
            } catch (Exception var4) {
            }
         } else {
            try {
               Class_lj.i.getAppletContext().showDocument(var0.a(Class_lj.i.getCodeBase(), 4), "_blank");
            } catch (Exception var5) {
            }
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "eh.CA(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ')');
      }
   }

   static final int a(int var0, int var1, int var2, int var3) {
      try {
         Rb++;
         int var4 = var1 / var0;
         int var5 = var1 & var3 + var0;
         int var6 = var2 / var0;
         int var8 = Class_oi.b(var4, var6, var3 + 17);
         int var7 = var2 & -1 + var0;
         int var9 = Class_oi.b(1 + var4, var6, 16);
         int var10 = Class_oi.b(var4, var6 - -1, 16);
         int var11 = Class_oi.b(var4 + 1, 1 + var6, 16);
         int var12 = Class_nb.a(var5, var8, var9, (byte)25, var0);
         int var13 = Class_nb.a(var5, var10, var11, (byte)25, var0);
         return Class_nb.a(var7, var12, var13, (byte)25, var0);
      } catch (RuntimeException var14) {
         throw Class_sh.a(var14, "eh.AA(" + var0 + 44 + var1 + 44 + var2 + 44 + var3 + 41);
      }
   }
}
