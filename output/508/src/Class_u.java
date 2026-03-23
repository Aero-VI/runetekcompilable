final class Class_u extends Class_lf {
   static int Q;
   static int R;
   static Class_r S = Class_tc.a(43, "::fpsoff");
   static int T;
   static int U;
   static int V;
   static int W = 0;
   static int X;
   static int Y;
   static int Z;
   static int[] ab = new int[32];
   static int bb = -2;
   static Class_r cb = Class_tc.a(43, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");
   static int db;

   static final boolean b(int var0, byte var1) {
      try {
         R++;
         if (var0 < 32) {
            return false;
         } else if (var0 == 127) {
            return false;
         } else {
            if (var1 > -34) {
               W = 46;
            }

            return ~var0 > -130 || ~var0 < -160;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "u.D(" + var0 + ',' + var1 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void g(int var0) {
      int var3 = client.lb;

      try {
         Class_nf var1 = (Class_nf)Class_ba.c.e((byte)76);
         if (var3 != 0) {
            if (var1.M) {
               var1.e(31506);
            }

            var1 = (Class_nf)Class_ba.c.c((byte)58);
         }

         for (; var1 != null; var1 = (Class_nf)Class_ba.c.c((byte)58)) {
            if (var1.M) {
               var1.e(31506);
            }
         }

         if (var0 != 2) {
            j(-53);
         }

         Class_nf var2 = (Class_nf)Class_hh.d.e((byte)76);
         if (var3 == 0 && var2 == null) {
            X++;
         } else {
            do {
               if (var2.M) {
                  var2.e(var0 + 31504);
               }

               var2 = (Class_nf)Class_hh.d.c((byte)60);
            } while (var2 != null);

            X++;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "u.C(" + var0 + ')');
      }
   }

   static final int b(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 65408) + var1;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int[] a(byte var1, int var2) {
      int var9 = client.lb;

      try {
         if (var1 != -61) {
            return null;
         } else {
            int[] var3 = super.H.a(false, var2);
            if (super.H.s) {
               int[] var4 = this.b(0, var2, 29149);
               int[] var5 = this.b(1, var2, 29149);
               int[] var6 = this.b(2, var2, 29149);
               int var7 = 0;
               if (var9 != 0 || var7 < Class_ld.X) {
                  do {
                     int var8 = var6[var7];
                     if (var8 == 4096) {
                        var3[var7] = var4[var7];
                        if (var9 == 0) {
                           var7++;
                           continue;
                        }
                     }

                     if (~var8 != -1) {
                        var3[var7] = var5[var7] * (-var8 + 4096) + var8 * var4[var7] >> -21906292;
                        if (var9 != 0) {
                           var3[var7] = var5[var7];
                           var7++;
                        } else {
                           var7++;
                        }
                     } else {
                        var3[var7] = var5[var7];
                        var7++;
                     }
                  } while (var7 < Class_ld.X);
               }
            }

            V++;
            return var3;
         }
      } catch (RuntimeException var10) {
         throw Class_sh.a(var10, "u.G(" + var1 + ',' + var2 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int[][] a(int var1, boolean var2) {
      int var19 = client.lb;

      try {
         if (!var2) {
            this.a(-2, true);
         }

         int[][] var3 = super.K.a(var1, (byte)-118);
         if (super.K.q) {
            int[] var4 = this.b(2, var1, 29149);
            int[][] var5 = this.c(-67, 0, var1);
            int[][] var6 = this.c(-114, 1, var1);
            int[] var9 = var3[2];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            int var16 = 0;
            if (var19 != 0 || ~Class_ld.X < ~var16) {
               do {
                  int var17 = var4[var16];
                  if (~var17 != -4097) {
                     if (~var17 == -1) {
                        var7[var16] = var13[var16];
                        var8[var16] = var14[var16];
                        var9[var16] = var15[var16];
                        if (var19 == 0) {
                           var16++;
                           continue;
                        }
                     }

                     int var18 = 4096 - var17;
                     var7[var16] = var13[var16] * var18 + var17 * var10[var16] >> -223121748;
                     var8[var16] = var14[var16] * var18 + var11[var16] * var17 >> -1128653428;
                     var9[var16] = var17 * var12[var16] - -(var18 * var15[var16]) >> -66343540;
                     if (var19 != 0) {
                        var7[var16] = var10[var16];
                        var8[var16] = var11[var16];
                        var9[var16] = var12[var16];
                        var16++;
                     } else {
                        var16++;
                     }
                  } else {
                     var7[var16] = var10[var16];
                     var8[var16] = var11[var16];
                     var9[var16] = var12[var16];
                     var16++;
                  }
               } while (~Class_ld.X < ~var16);
            }
         }

         db++;
         return var3;
      } catch (RuntimeException var20) {
         throw Class_sh.a(var20, "u.A(" + var1 + ',' + var2 + ')');
      }
   }

   static final boolean h(int var0) {
      try {
         T++;
         if (var0 != 0) {
            ab = null;
         }

         try {
            if (~Class_mb.y == -3) {
               if (client.fb == null) {
                  client.fb = Class_le.a(Class_ua.g, Class_tf.Z, Class_sd.e);
                  if (client.fb == null) {
                     return false;
                  }
               }

               if (Class_pd.h == null) {
                  Class_pd.h = new Class_bi(Class_gj.T, Class_nk.g);
               }

               if (Class_fc.t.a((byte)-70, client.fb, Class_pd.h, 22050, Class_wb.f)) {
                  Class_fc.t.a((byte)84);
                  Class_fc.t.a((byte)-126, Class_lg.l);
                  Class_fc.t.a(Class_id.f, true, client.fb);
                  Class_ua.g = null;
                  client.fb = null;
                  Class_mb.y = 0;
                  Class_pd.h = null;
                  return true;
               }
            }
         } catch (Exception var2) {
            var2.printStackTrace();
            Class_fc.t.e(73);
            Class_ua.g = null;
            client.fb = null;
            Class_mb.y = 0;
            Class_pd.h = null;
         }

         return false;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "u.J(" + var0 + ')');
      }
   }

   public static void i(int var0) {
      try {
         S = null;
         cb = null;
         if (var0 != -26774) {
            b(-65, -93);
         }

         ab = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "u.B(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void j(int var0) {
      int var4 = client.lb;

      try {
         Class_ma.ib = 0;
         Class_pe.w = -1;
         Class_hf.a = -1;
         Class_sc.j = 0;
         Y++;
         Class_sf.g = 0;
         Class_fe.T = -1;
         Class_qj.U = 0;
         Class_ui.h = false;
         Class_fh.I = -1;
         Class_kc.q = 0;
         if (var0 == 2) {
            Class_ph.f = 0;
            Class_cj.S.p = 0;
            Class_f.T.p = 0;
            int var1 = 0;
            if (var4 != 0) {
               if (Class_db.Q[var1] != null) {
                  Class_db.Q[var1].x = -1;
               }

               var1++;
            }

            for (; ~Class_db.Q.length < ~var1; var1++) {
               if (Class_db.Q[var1] != null) {
                  Class_db.Q[var1].x = -1;
               }
            }

            int var2 = 0;
            if (var4 != 0 || Class_rf.a.length > var2) {
               do {
                  if (Class_rf.a[var2] != null) {
                     Class_rf.a[var2].x = -1;
                  }
               } while (Class_rf.a.length > ++var2);
            }

            Class_nj.b(var0 ^ 126);
            Class_wh.c = 1;
            Class_ca.a(30, (byte)-68);
            int var3 = 0;
            if (var4 != 0) {
               Class_vb.j[var3] = true;
               var3++;
            }

            while (~var3 > -101) {
               Class_vb.j[var3] = true;
               var3++;
            }

            Class_ed.b.b(105);
            Class_fe.c((byte)-118);
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "u.H(" + var0 + ')');
      }
   }

   static final void d(byte var0) {
      try {
         Class_ed.a = null;
         Class_i.sb = null;
         Class_j.gb = null;
         Class_je.m = 0;
         Class_li.n = null;
         Class_bg.p = null;
         U++;
         Class_fb.j = null;
         Class_hf.i = null;
         Class_i.ob = null;
         Class_he.e = null;
         Class_w.T = null;
         Class_vb.e = null;
         Class_mj.e.b(var0 ^ 5);
         Class_me.e = null;
         Class_mj.f = null;
         Class_rf.k = null;
         Class_md.z = null;
         Class_kg.B = null;
         Class_uc.e = null;
         Class_sc.m = null;
         Class_a.f = null;
         Class_uf.T = null;
         if (var0 != 108) {
            b(-15, (byte)46);
         }

         Class_pi.pb = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "u.F(" + var0 + ')');
      }
   }

   final void a(Class_lh var1, int var2, int var3) {
      try {
         if (var3 != -1) {
            h(111);
         }

         if (var2 == 0) {
            super.C = var1.n(var3 + -6676) == 1;
         }

         Q++;
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "u.K(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   public Class_u() {
      super(3, false);
   }
}
