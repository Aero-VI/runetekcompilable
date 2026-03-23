final class Class_ld extends Class_lf {
   static Class_r Q = Class_tc.a(43, "");
   static Class_r R = Class_ld.S;
   private static Class_r S = Class_tc.a(43, "Loaded interfaces");
   static Class_r T = Class_ld.fb;
   private boolean U = true;
   static int V;
   static Class_dh[] W;
   static int X;
   static int Y;
   static int Z = 0;
   static int ab;
   static int bb;
   static int cb;
   private boolean db = true;
   static int eb;
   private static Class_r fb = Class_tc.a(43, "Loading )2 please wait)3");
   static int gb = 0;
   static int hb;
   static int[] ib;
   static int jb;
   static int kb = 0;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void g(int var0) {
      int var9 = client.lb;

      try {
         ab++;
         boolean var1 = false;
         if (var0 == 6364) {
            while (!var1) {
               var1 = true;
               int var2 = 0;
               if (var9 != 0 || var2 < Class_ma.ib + -1) {
                  while (true) {
                     if (Class_dd.I[var2] < 1000 && ~Class_dd.I[var2 - -1] < -1001) {
                        var1 = false;
                        Class_r var3 = Class_fb.h[var2];
                        Class_fb.h[var2] = Class_fb.h[var2 - -1];
                        Class_fb.h[var2 - -1] = var3;
                        Class_r var4 = Class_tj.u[var2];
                        Class_tj.u[var2] = Class_tj.u[1 + var2];
                        Class_tj.u[1 + var2] = var4;
                        int var5 = Class_g.i[var2];
                        Class_g.i[var2] = Class_g.i[var2 - -1];
                        Class_g.i[var2 + 1] = var5;
                        var5 = Class_vh.pb[var2];
                        Class_vh.pb[var2] = Class_vh.pb[var2 - -1];
                        Class_vh.pb[var2 - -1] = var5;
                        short var6 = Class_dd.I[var2];
                        Class_dd.I[var2] = Class_dd.I[var2 + 1];
                        Class_dd.I[1 + var2] = var6;
                        long var7 = Class_ih.bb[var2];
                        Class_ih.bb[var2] = Class_ih.bb[var2 - -1];
                        Class_ih.bb[var2 + 1] = var7;
                     }

                     if (++var2 >= Class_ma.ib + -1) {
                        break;
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var10) {
         throw Class_sh.a(var10, "ld.C(" + var0 + ')');
      }
   }

   public Class_ld() {
      super(1, false);
   }

   static final int b(int var0, int var1) {
      try {
         if (var0 > -83) {
            a(null, (byte)100);
         }

         V++;
         return var1 >>> -118132568;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ld.E(" + var0 + 44 + var1 + 41);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int[] a(byte var1, int var2) {
      int var6 = client.lb;

      try {
         eb++;
         int[] var3 = super.H.a(false, var2);
         if (var1 != -61) {
            T = null;
         }

         if (super.H.s) {
            int[] var4 = this.b(0, this.U ? -var2 + Class_fa.rc : var2, 29149);
            if (!this.db) {
               Class_gb.a(var4, 0, var3, 0, X);
               if (var6 == 0) {
                  return var3;
               }
            }

            int var5 = 0;
            if (var6 != 0 || X > var5) {
               do {
                  var3[var5] = var4[Class_ed.d - var5];
               } while (X > ++var5);
            }
         }

         return var3;
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "ld.G(" + var1 + ',' + var2 + ')');
      }
   }

   static final boolean c(int var0, int var1) {
      try {
         Y++;
         if (var0 != 32157) {
            b(-72, -38);
         }

         return ~(var1 >> 1379986100 & 1) != -1;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ld.B(" + var0 + ',' + var1 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int[][] a(int var1, boolean var2) {
      int var12 = client.lb;

      try {
         int[][] var3;
         jb++;
         var3 = super.K.a(var1, (byte)3);
         label48:
         if (super.K.q) {
            int[][] var4 = this.c(-85, 0, !this.U ? var1 : -var1 + Class_fa.rc);
            int[] var6 = var4[1];
            int[] var5 = var4[0];
            int[] var8 = var3[0];
            int[] var10 = var3[2];
            int[] var9 = var3[1];
            int[] var7 = var4[2];
            if (this.db) {
               int var11 = 0;
               if (var12 != 0 || ~X < ~var11) {
                  do {
                     var8[var11] = var5[Class_ed.d + -var11];
                     var9[var11] = var6[Class_ed.d + -var11];
                     var10[var11] = var7[Class_ed.d - var11];
                  } while (~X < ~(++var11));
               }

               if (var12 == 0) {
                  break label48;
               }
            }

            int var14 = 0;
            if (var12 != 0 || ~X < ~var14) {
               do {
                  var8[var14] = var5[var14];
                  var9[var14] = var6[var14];
                  var10[var14] = var7[var14];
               } while (~X < ~(++var14));
            }
         }

         if (!var2) {
            fb = null;
         }

         return var3;
      } catch (RuntimeException var13) {
         throw Class_sh.a(var13, "ld.A(" + var1 + ',' + var2 + ')');
      }
   }

   final void a(Class_lh var1, int var2, int var3) {
      int var5 = client.lb;

      try {
         label61: {
            label62: {
               label63: {
                  cb++;
                  if (~var2 != -1) {
                     if (var2 == 1) {
                        break label63;
                     }

                     if (var2 != 2) {
                        break label61;
                     }

                     if (var5 == 0) {
                        break label62;
                     }
                  }

                  this.db = ~var1.n(-6677) == -2;
                  if (var5 == 0) {
                     break label61;
                  }
               }

               this.U = var1.n(-6677) == 1;
               if (var5 == 0) {
                  break label61;
               }
            }

            super.C = ~var1.n(-6677) == -2;
         }

         if (var3 != -1) {
            c(26, 123);
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "ld.K(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   static final void a(Class_ra var0, byte var1) {
      try {
         hb++;
         Class_ud.a(true);
         if (Class_mk.j == null) {
            if (!Class_b.R) {
               Class_g.b(500);
            } else {
               if (Class_eb.d == 1) {
                  int var2 = Class_hg.m / 5;
                  int var3 = var2 + Class_la.Y - -140;
                  if (Class_vh.rb >= var3 && Class_vh.rb <= 14 + var3 && Class_ug.v + 4 <= Class_wb.i && 18 + Class_ug.v >= Class_wb.i) {
                     Class_tb.a(122, 0, 0);
                     return;
                  }

                  if (~Class_vh.rb <= ~(15 + var3) && 80 + var3 >= Class_vh.rb && ~Class_wb.i <= ~(4 + Class_ug.v) && Class_ug.v - -18 >= Class_wb.i) {
                     Class_tb.a(126, 0, 1);
                     return;
                  }

                  int var4 = 250 + var2 + Class_la.Y;
                  if (var4 <= Class_vh.rb && ~Class_vh.rb >= ~(var4 + 14) && ~(Class_ug.v - -4) >= ~Class_wb.i && ~Class_wb.i >= ~(18 + Class_ug.v)) {
                     Class_tb.a(112, 1, 0);
                     return;
                  }

                  if (~Class_vh.rb <= ~(var4 - -15) && ~Class_vh.rb >= ~(80 + var4) && Class_ug.v - -4 <= Class_wb.i && ~(Class_ug.v + 18) <= ~Class_wb.i) {
                     Class_tb.a(124, 1, 1);
                     return;
                  }

                  int var5 = 360 + var2 + Class_la.Y;
                  if (var5 <= Class_vh.rb && ~(var5 + 14) <= ~Class_vh.rb && Class_wb.i >= Class_ug.v - -4 && Class_wb.i <= 18 + Class_ug.v) {
                     Class_tb.a(105, 2, 0);
                     return;
                  }

                  if (~(var5 + 15) >= ~Class_vh.rb && Class_vh.rb <= var5 + 80 && Class_wb.i >= 4 + Class_ug.v && ~(18 + Class_ug.v) <= ~Class_wb.i) {
                     Class_tb.a(115, 2, 1);
                     return;
                  }

                  int var6 = var2 + Class_la.Y + 470;
                  if (Class_vh.rb >= var6 && Class_vh.rb <= 14 + var6 && Class_wb.i >= 4 + Class_ug.v && ~(Class_ug.v - -18) <= ~Class_wb.i) {
                     Class_tb.a(112, 3, 0);
                     return;
                  }

                  if (~Class_vh.rb <= ~(15 + var6) && 80 + var6 >= Class_vh.rb && ~(Class_ug.v + 4) >= ~Class_wb.i && 18 + Class_ug.v >= Class_wb.i) {
                     Class_tb.a(124, 3, 1);
                     return;
                  }

                  if (~Class_ve.X != 0) {
                     Class_pd var7 = Class_ta.B[Class_ve.X];
                     if (var7.b != !Class_vc.L) {
                        byte[] var12 = Class_o.a(2, new Class_r[]{var7.k, Class_kj.U}).a((byte)-110);
                        Class_kc.r = new String(var12, 0, var12.length);
                        Class_sf.b = var7.e;
                        if (~Class_rh.q != -1) {
                           Class_lk.r = 50000 + Class_sf.b;
                           Class_ti.h = Class_sf.b + 40000;
                           Class_sb.o = Class_ti.h;
                        }

                        if (Class_jg.b != null) {
                           Class_jg.b.i = true;
                           Class_tg.a(Class_jg.b, -119);
                        }

                        return;
                     }

                     Class_r var8 = Class_fb.l;
                     if (~Class_rh.q != -1) {
                        var8 = Class_o.a(2, new Class_r[]{Class_ic.M, Class_og.b(7000 + var7.e, 0)});
                     }

                     Class_r var9 = Class_o.a(
                        2,
                        new Class_r[]{
                           Class_ua.c,
                           var7.k,
                           Class_kj.U,
                           var8,
                           Class_dj.p,
                           Class_og.b(Class_pi.sb, 0),
                           Class_id.q,
                           Class_og.b(Class_m.kb, 0),
                           Class_fh.N,
                           Class_og.b(0, 0),
                           Class_fj.a,
                           Class_og.b(Class_ch.f, 0),
                           Class_jk.D,
                           Class_og.b(Class_hj.db, 0)
                        }
                     );

                     try {
                        var0.getAppletContext().showDocument(var9.a(-16294), "_self");
                     } catch (Exception var10) {
                     }
                  }
               }

               if (var1 < 63) {
                  X = -85;
               }
            }
         }
      } catch (RuntimeException var11) {
         throw Class_sh.a(var11, "ld.D(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
      }
   }

   public static void h(int var0) {
      try {
         W = null;
         if (var0 != 1) {
            a(null, (byte)117);
         }

         R = null;
         ib = null;
         Q = null;
         fb = null;
         S = null;
         T = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ld.H(" + var0 + ')');
      }
   }

   static final void a(Class_cj var0, Class_cj var1, Class_cj var2, int var3) {
      try {
         bb++;
         Class_og.eb = var2;
         if (var3 >= -72) {
            b(-11, 6);
         }

         Class_og.S = var0;
         Class_kf.w = var1;
      } catch (RuntimeException var5) {
         throw Class_sh.a(
            var5,
            "ld.F(" + (var0 != null ? "{...}" : "null") + ',' + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')'
         );
      }
   }
}
