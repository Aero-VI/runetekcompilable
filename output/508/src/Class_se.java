final class Class_se extends Class_lf {
   private int Q;
   static int R;
   static int S;
   private int T = 0;
   private int[] U;
   static int V;
   static int X;
   static int Y;
   static Class_c Z = new Class_c();
   private int[] ab;
   static int bb;
   static int cb;
   static int db;
   private int eb;
   static int[] fb = new int[5];
   static int[] gb = new int[32];
   static Class_sg hb;
   static int ib;
   static Class_dh[] jb;
   static int kb;
   static int lb = -1;
   static Class_r mb = Class_tc.a(43, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");
   static int nb;

   public Class_se() {
      super(0, true);
      this.Q = 10;
      this.eb = 2048;
   }

   final void a(byte var1) {
      try {
         this.g(-1);
         if (var1 > -22) {
            this.ab = null;
         }

         Y++;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "se.I(" + var1 + ')');
      }
   }

   static final Class_ni a(int var0, Class_cj var1, int var2, int var3) {
      try {
         bb++;
         if (var0 <= 49) {
            fb = null;
         }

         return !Class_ve.a(-29381, var3, var1, var2) ? null : Class_mg.b(-14452);
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "se.D(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   static final void d(byte var0) {
      try {
         int var1 = -14 / ((-23 - var0) / 50);
         Class_qj.L.b((byte)94);
         X++;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "se.B(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private final void g(int var1) {
      int var6 = client.lb;

      try {
         this.ab = new int[this.Q - var1];
         int var2 = 0;
         S++;
         this.U = new int[this.Q + 1];
         int var3 = 4096 / this.Q;
         int var4 = var3 * this.eb >> -1297789620;
         int var5 = 0;
         if (var6 != 0) {
            this.ab[var5] = var2;
            this.U[var5] = var4 + var2;
            var2 += var3;
            var5++;
         }

         while (var5 < this.Q) {
            this.ab[var5] = var2;
            this.U[var5] = var4 + var2;
            var2 += var3;
            var5++;
         }

         this.ab[this.Q] = 4096;
         this.U[this.Q] = this.U[0] + 4096;
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "se.J(" + var1 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, int var1, boolean var2, int var3, boolean var4, int var5) {
      int var16 = client.lb;

      try {
         Class_ad.l++;
         db++;
         if (!var4) {
            Class_pi.b(64, true);
            Class_kc.a(true, -125);
            Class_pi.b(64, false);
         }

         Class_kc.a(var2, -127);
         if (!var4) {
            Class_sf.a((byte)-92);
         }

         Class_pg.b(-1);
         if (~Class_wh.c == -2) {
            int var6 = Class_c.w;
            if (~var6 > ~(Class_wj.t / 256)) {
               var6 = Class_wj.t / 256;
            }

            if (Class_lj.e[4] && var6 < Class_bf.i[4] + 128) {
               var6 = Class_bf.i[4] + 128;
            }

            int var7 = Class_ba.z + Class_rg.T & 2047;
            Class_ug.a(var5, var7, Class_bk.N, Class_fa.a(Class_gg.B.hb, Class_jk.F, Class_gg.B.J, var2) - 50, 600 - -(3 * var6), Class_wc.N, var6, (byte)65);
         }

         int var18 = Class_gg.D;
         int var8 = Class_oc.l;
         int var19 = Class_ef.s;
         int var10 = Class_mg.j;
         int var9 = Class_hc.a;
         int var11 = 0;
         if (var16 != 0) {
            if (Class_lj.e[var11]) {
               int var12 = (int)(
                  -Class_vb.k[var11]
                     + Math.random() * (2 * Class_vb.k[var11] + 1)
                     + Math.sin(Class_j.T[var11] * (Class_s.V[var11] / 100.0)) * Class_bf.i[var11]
               );
               if (var11 == 2) {
                  Class_oc.l += var12;
               }

               if (~var11 == -5) {
                  Class_hc.a += var12;
                  if (~Class_hc.a > -129) {
                     Class_hc.a = 128;
                  }

                  if (~Class_hc.a < -384) {
                     Class_hc.a = 383;
                  }
               }

               if (~var11 == -2) {
                  Class_ef.s += var12;
               }

               if (var11 == 0) {
                  Class_gg.D += var12;
               }

               if (~var11 == -4) {
                  Class_mg.j = 2047 & Class_mg.j + var12;
               }
            }

            var11++;
         }

         for (; var11 < 5; var11++) {
            if (Class_lj.e[var11]) {
               int var20 = (int)(
                  -Class_vb.k[var11]
                     + Math.random() * (2 * Class_vb.k[var11] + 1)
                     + Math.sin(Class_j.T[var11] * (Class_s.V[var11] / 100.0)) * Class_bf.i[var11]
               );
               if (var11 == 2) {
                  Class_oc.l += var20;
               }

               if (~var11 == -5) {
                  Class_hc.a += var20;
                  if (~Class_hc.a > -129) {
                     Class_hc.a = 128;
                  }

                  if (~Class_hc.a < -384) {
                     Class_hc.a = 383;
                  }
               }

               if (~var11 == -2) {
                  Class_ef.s += var20;
               }

               if (var11 == 0) {
                  Class_gg.D += var20;
               }

               if (~var11 == -4) {
                  Class_mg.j = 2047 & Class_mg.j + var20;
               }
            }
         }

         label163: {
            Class_kg.e(-3);
            Class_nc.c(var3, var0, var3 - -var1, var0 - -var5);
            Class_kd.d();
            if (Class_ui.h || ~Class_v.B > ~var3 || ~Class_v.B <= ~(var1 + var3) || ~var0 < ~Class_pc.c || ~Class_pc.c <= ~(var0 + var5)) {
               Class_oi.u = false;
               Class_ab.Q = 0;
               if (var16 == 0) {
                  break label163;
               }
            }

            Class_ab.Q = 0;
            Class_oi.u = true;
            int var21 = Class_nd.v;
            int var13 = Class_tb.o;
            Class_kc.u = (var13 + -var21) * (Class_v.B - var3) / var1 - -var21;
            int var14 = Class_a.j;
            int var15 = Class_vi.R;
            Class_hh.i = (var15 + -var14) * (Class_pc.c + -var0) / var5 - -var14;
         }

         Class_hf.c(16322);
         byte var22 = ~Class_gg.d(1) != -3 ? 1 : (byte)Class_ad.l;
         Class_nc.f(var3, var0, var1, var5, 0);
         Class_p.a(
            Class_gg.D,
            Class_ef.s,
            Class_oc.l,
            Class_hc.a,
            Class_mg.j,
            Class_pe.F,
            Class_sg.hb,
            Class_wf.a,
            Class_aj.r,
            Class_nj.n,
            Class_uf.K,
            Class_jk.F - -1,
            var22,
            Class_gg.B.hb >> 737831943,
            Class_gg.B.J >> 712564327
         );
         Class_hf.c(16322);
         Class_ti.a();
         Class_wi.a(var5, var1, var3, 256, var0, 256, (byte)-32);
         Class_dc.a(113, var1, var0, var3, 256, var5, 256);
         ((Class_pa)Class_kd.i).e(Class_sj.k, 0);
         Class_wc.a(var5, var3, var0, var1, -17234);
         Class_ef.s = var19;
         Class_mg.j = var10;
         Class_gg.D = var18;
         Class_oc.l = var8;
         Class_hc.a = var9;
         if (Class_rg.S && ~Class_kc.a(true, false, (byte)71) == -1) {
            Class_rg.S = false;
         }

         if (Class_rg.S) {
            Class_nc.f(var3, var0, var1, var5, 0);
            Class_mg.a(false, Class_ld.T, -16678);
         }

         if (!var4 && !Class_rg.S && !Class_ui.h && Class_v.B >= var3 && ~Class_v.B > ~(var3 - -var1) && ~Class_pc.c <= ~var0 && ~Class_pc.c > ~(var5 + var0)) {
            Class_ch.a(var3, var0, var5, Class_pc.c, !var2, var1, Class_v.B);
         }
      } catch (RuntimeException var17) {
         throw Class_sh.a(var17, "se.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final int a(int var0, Class_r var1) {
      int var3 = client.lb;

      try {
         ib++;
         if (var0 != 64) {
            return 54;
         } else if (~var1.d((byte)-104) == -1) {
            return -1;
         } else {
            int var2 = 0;
            if (var3 == 0 && ~var2 <= ~Class_rf.k.h) {
               return -1;
            } else {
               while (!Class_rf.k.f[var2].b(-577, var1)) {
                  if (~(++var2) <= ~Class_rf.k.h) {
                     return -1;
                  }
               }

               return var2;
            }
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "se.H(" + var0 + 44 + (var1 != null ? "{...}" : "null") + 41);
      }
   }

   static final void a(int var0, int var1, int var2, int var3, Class_nf var4, int var5) {
      int var12 = client.lb;

      try {
         kb++;
         if (var4.t != -1 || var4.E != null) {
            int var6;
            label98: {
               var6 = 0;
               if (~var5 < ~var4.N) {
                  var6 += -var4.N + var5;
                  if (var12 == 0) {
                     break label98;
                  }
               }

               if (~var4.P < ~var5) {
                  var6 += var4.P - var5;
               }
            }

            label93: {
               if (var4.p >= var2) {
                  if (~var2 <= ~var4.C) {
                     break label93;
                  }

                  var6 += -var2 + var4.C;
                  if (var12 == 0) {
                     break label93;
                  }
               }

               var6 += -var4.p + var2;
            }

            if (var4.I != 0 && ~var4.I <= ~(var6 + -64) && Class_tf.V != 0 && ~var4.q == ~var1) {
               var6 -= 64;
               if (var0 >= 77) {
                  if (~var6 > -1) {
                     var6 = 0;
                  }

                  int var7;
                  label78: {
                     var7 = (var4.I + -var6) * Class_tf.V / var4.I;
                     if (var4.r == null) {
                        if (var4.t < 0) {
                           break label78;
                        }

                        Class_hb var8 = Class_hb.a(Class_nb.b, var4.t, 0);
                        if (var8 == null) {
                           break label78;
                        }

                        Class_k var9 = var8.a().a(Class_pe.p);
                        Class_rb var10 = Class_rb.a(var9, 100, var7);
                        var10.e(-1);
                        Class_nd.m.b(var10);
                        var4.r = var10;
                        if (var12 == 0) {
                           break label78;
                        }
                     }

                     var4.r.f(var7);
                  }

                  if (var4.A != null) {
                     var4.A.f(var7);
                     if (!var4.A.b(84)) {
                        var4.A = null;
                     }
                  } else {
                     if (var4.E != null && (var4.F -= var3) <= 0) {
                        int var15 = (int)(Math.random() * var4.E.length);
                        Class_hb var16 = Class_hb.a(Class_nb.b, var4.E[var15], 0);
                        if (var16 != null) {
                           Class_k var17 = var16.a().a(Class_pe.p);
                           Class_rb var11 = Class_rb.a(var17, 100, var7);
                           var11.e(0);
                           Class_nd.m.b(var11);
                           var4.A = var11;
                           var4.F = (int)(Math.random() * (-var4.v + var4.K)) + var4.v;
                           return;
                        }
                     }
                  }
               }
            } else {
               if (var4.r != null) {
                  Class_nd.m.a(var4.r);
                  var4.r = null;
               }

               if (var4.A != null) {
                  Class_nd.m.a(var4.A);
                  var4.A = null;
               }
            }
         }
      } catch (RuntimeException var13) {
         throw Class_sh.a(var13, "se.E(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ',' + var5 + ')');
      }
   }

   final void a(Class_lh var1, int var2, int var3) {
      try {
         if (var3 != -1) {
            fb = null;
         }

         V++;
         if (var2 != 0) {
            if (~var2 == -2) {
               this.eb = var1.k(var3 + 1355769545);
               return;
            }

            if (~var2 != -3) {
               return;
            }

            if (client.lb == 0) {
               this.T = var1.n(-6677);
               return;
            }
         }

         this.Q = var1.n(-6677);
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "se.K(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   public static void e(byte var0) {
      try {
         if (var0 == 120) {
            gb = null;
            jb = null;
            Z = null;
            mb = null;
            fb = null;
            hb = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "se.U(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int[] a(byte var1, int var2) {
      int var10 = client.lb;

      try {
         R++;
         if (var1 != -61) {
            a(-125, null);
         }

         int[] var3 = super.H.a(false, var2);
         if (super.H.s) {
            int var4 = Class_l.y[var2];
            if (~this.T == -1) {
               short var5 = 0;
               int var6 = 0;
               if (var10 != 0 || var6 < this.Q) {
                  do {
                     if (this.ab[var6] <= var4 && ~var4 > ~this.ab[1 + var6]) {
                        if (~var4 <= ~this.U[var6]) {
                           break;
                        }

                        var5 = 4096;
                        if (var10 == 0) {
                           break;
                        }
                     }
                  } while (++var6 < this.Q);
               }

               Class_gb.a(var3, 0, Class_ld.X, var5);
               if (var10 == 0) {
                  return var3;
               }
            }

            int var12 = 0;
            if (var10 != 0 || ~var12 > ~Class_ld.X) {
               do {
                  short var7;
                  int var13;
                  label60: {
                     int var8;
                     label59: {
                        label58: {
                           var7 = 0;
                           var13 = 0;
                           var8 = Class_ce.gb[var12];
                           int var9 = this.T;
                           if (~var9 != -2) {
                              if (~var9 == -3) {
                                 break label58;
                              }

                              if (var9 != 3) {
                                 break label60;
                              }

                              if (var10 == 0) {
                                 break label59;
                              }
                           }

                           var13 = var8;
                           if (var10 == 0) {
                              break label60;
                           }
                        }

                        var13 = (var8 + var4 + -4096 >> 489836129) + 2048;
                        if (var10 == 0) {
                           break label60;
                        }
                     }

                     var13 = 2048 + (var8 - var4 >> 428571105);
                  }

                  int var14 = 0;
                  if (var10 != 0 || ~var14 > ~this.Q) {
                     do {
                        if (this.ab[var14] <= var13) {
                           if (~this.ab[1 + var14] < ~var13) {
                              if (~var13 <= ~this.U[var14]) {
                                 break;
                              }

                              var7 = 4096;
                              if (var10 == 0) {
                                 break;
                              }

                              var14++;
                           } else {
                              var14++;
                           }
                        } else {
                           var14++;
                        }
                     } while (~var14 > ~this.Q);
                  }

                  var3[var12] = var7;
               } while (~(++var12) > ~Class_ld.X);
            }
         }

         return var3;
      } catch (RuntimeException var11) {
         throw Class_sh.a(var11, "se.G(" + var1 + ',' + var2 + ')');
      }
   }

   static final void f(byte var0) {
      try {
         Class_hj.b(5, true);
         Class_nj.b(5, -120);
         Class_h.a((byte)66, 5);
         Class_uc.b(-1, 5);
         Class_e.a(5, true);
         cb++;
         Class_bb.a(5, (byte)35);
         Class_je.b(5, 0);
         Class_mi.c(9, 5);
         if (var0 >= -4) {
            a(-68, 94, false, -113, false, 93);
         }

         Class_nj.a(121, 5);
         Class_gj.c(0, 5);
         Class_gj.d(190, 5);
         Class_sc.a(0, 50);
         Class_ok.b(-127, 5);
         Class_qc.a(5, 95);
         Class_si.d.b(-18767, 5);
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "se.F(" + var0 + ')');
      }
   }
}
