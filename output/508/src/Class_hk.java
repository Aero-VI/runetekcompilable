final class Class_hk extends Class_wd {
   static int t;
   static int u;
   static int v;
   static int w;
   static int x;
   static int y;
   static int z;
   static int A;
   static int B;
   static int C;
   static int D;
   Class_c E = new Class_c();
   private Class_dd F;
   static Class_qc G = new Class_qc(4);
   static int H = -1;
   static int[] I;
   static int J = 0;
   static Class_r K = Class_tc.a(43, "settings=");
   static Class_r L = Class_tc.a(43, "Konfig geladen)3");
   static Class_r M = Class_tc.a(43, "Spieler kann nicht gefunden werden: ");
   static Class_r N = Class_hk.S;
   static Class_r O = Class_hk.S;
   static int P;
   static int Q;
   Class_re R = new Class_re();
   static Class_r S = Class_tc.a(43, "");

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final void b(int[] var1, int var2, int var3) {
      int var7 = client.lb;

      try {
         this.R.b(var1, var2, var3);
         t++;
         Class_vg var6 = (Class_vg)this.E.e((byte)76);
         if (var7 != 0 || var6 != null) {
            do {
               if (!this.F.a(var6, (byte)-42)) {
                  int var5 = var3;
                  int var4 = var2;
                  if (var7 == 0 && ~var3 >= ~var6.H) {
                     this.a(var6, var3, 24981, var2, var2 - -var3, var1);
                     var6.H -= var3;
                  } else {
                     while (true) {
                        this.a(var6, var6.H, 24981, var4, var4 - -var5, var1);
                        var4 += var6.H;
                        var5 -= var6.H;
                        if (this.F.a(var5, var4, var6, (byte)-68, var1) && var7 == 0) {
                           break;
                        }

                        if (~var5 >= ~var6.H) {
                           this.a(var6, var5, 24981, var4, var4 - -var5, var1);
                           var6.H -= var5;
                           break;
                        }
                     }
                  }
               }

               var6 = (Class_vg)this.E.c((byte)-114);
            } while (var6 != null);
         }
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "hk.F(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void e(int var0) {
      int var10 = client.lb;

      try {
         v++;
         if (var0 == -2) {
            if (Class_ij.f == null) {
               if (Class_ff.e == null) {
                  int var1 = Class_eb.d;
                  if (Class_ui.h) {
                     if (var1 != 1) {
                        int var14 = Class_bh.k;
                        int var12 = Class_pj.c;
                        if (~var12 > ~(-10 + Class_hf.h)
                           || Class_ii.ab + Class_hf.h - -10 < var12
                           || ~var14 > ~(-10 + Class_ih.S)
                           || ~var14 < ~(10 + Class_ih.S + Class_fb.n)) {
                           Class_ui.h = false;
                           Class_wg.a(Class_hf.h, Class_ih.S, Class_ii.ab, Class_fb.n, (byte)-45);
                        }
                     }

                     if (var1 == 1) {
                        int var13 = Class_hf.h;
                        int var15 = Class_ih.S;
                        int var17 = Class_vh.rb;
                        int var6 = Class_wb.i;
                        int var7 = -1;
                        int var16 = Class_ii.ab;
                        int var8 = 0;
                        if (var10 == 0 && var8 >= Class_ma.ib) {
                           if (~var7 != 0) {
                              Class_gj.a((byte)51, var7);
                           }

                           Class_ui.h = false;
                           Class_wg.a(Class_hf.h, Class_ih.S, Class_ii.ab, Class_fb.n, (byte)-95);
                           return;
                        } else {
                           do {
                              int var9 = var15 - -31 - -(15 * (-1 + Class_ma.ib + -var8));
                              if (~var17 < ~var13 && ~(var16 + var13) < ~var17 && var6 > -13 + var9 && ~var6 > ~(var9 - -3)) {
                                 var7 = var8;
                              }
                           } while (++var8 < Class_ma.ib);

                           if (~var7 != 0) {
                              Class_gj.a((byte)51, var7);
                           }

                           Class_ui.h = false;
                           Class_wg.a(Class_hf.h, Class_ih.S, Class_ii.ab, Class_fb.n, (byte)-95);
                           return;
                        }
                     }
                  } else {
                     if (var1 == 1 && ~Class_ma.ib < -1) {
                        short var2 = Class_dd.I[Class_ma.ib - 1];
                        if (~var2 == -42
                           || ~var2 == -41
                           || var2 == 43
                           || var2 == 38
                           || var2 == 58
                           || var2 == 14
                           || ~var2 == -18
                           || ~var2 == -14
                           || ~var2 == -8
                           || ~var2 == -23
                           || var2 == 16
                           || var2 == 1001) {
                           int var3 = Class_g.i[Class_ma.ib - 1];
                           int var4 = Class_vh.pb[Class_ma.ib + -1];
                           Class_ha var5 = Class_tf.a(var4, (byte)-80);
                           if (Class_id.a(client.b(var5), true) || Class_f.b(0, client.b(var5))) {
                              Class_ea.Z = 0;
                              Class_oe.a = false;
                              if (Class_ij.f != null) {
                                 Class_tg.a(Class_ij.f, -115);
                              }

                              Class_ij.f = Class_tf.a(var4, (byte)-80);
                              Class_nf.x = Class_wb.i;
                              Class_jg.c = Class_vh.rb;
                              Class_bk.Q = var3;
                              Class_tg.a(Class_ij.f, -114);
                              return;
                           }
                        }
                     }

                     if (~var1 == -2 && (Class_bi.e == 1 && ~Class_ma.ib < -3 || Class_ra.a((byte)-121, Class_ma.ib + -1))) {
                        var1 = 2;
                     }

                     if (~var1 == -3 && ~Class_ma.ib < -1 || ~Class_hd.j == -2) {
                        Class_la.d((byte)-15);
                     }

                     if ((var1 != 1 || ~Class_ma.ib >= -1) && Class_hd.j != 2) {
                        return;
                     }

                     Class_wi.d((byte)106);
                  }
               }
            }
         }
      } catch (RuntimeException var11) {
         throw Class_sh.a(var11, "hk.I(" + var0 + ')');
      }
   }

   private final void a(Class_vg var1, int var2, int var3) {
      try {
         if ((this.F.Jb[var1.E] & 4) != 0 && ~var1.z > -1) {
            int var4 = this.F.y[var1.E] / Class_pd.a;
            int var5 = (var4 + (1048575 - var1.r)) / var4;
            var1.r = var2 * var4 + var1.r & 1048575;
            if (var5 <= var2) {
               label48: {
                  if (~this.F.mb[var1.E] == -1) {
                     var1.w = Class_rb.a(var1.P, var1.w.j(), var1.w.i(), var1.w.h());
                     if (client.lb == 0) {
                        break label48;
                     }
                  }

                  var1.w = Class_rb.a(var1.P, var1.w.j(), 0, var1.w.h());
                  this.F.a(var1, ~var1.F.q[var1.J] > -1, (byte)59);
               }

               if (var1.F.q[var1.J] < 0) {
                  var1.w.e(-1);
               }

               var2 = var1.r / var4;
            }
         }

         if (var3 != -1) {
            M = null;
         }

         var1.w.d(var2);
         w++;
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "hk.B(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   final Class_wd b() {
      try {
         Class_vg var1 = (Class_vg)this.E.e((byte)76);
         x++;
         if (var1 == null) {
            return null;
         } else {
            return (Class_wd)(var1.w != null ? var1.w : this.d());
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "hk.H(" + ')');
      }
   }

   static final void f(int var0) {
      try {
         Class_pb.g.b((byte)94);
         Class_bf.f.b((byte)94);
         z++;
         if (var0 <= 67) {
            G = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "hk.E(" + var0 + ')');
      }
   }

   public static void g(int var0) {
      try {
         M = null;
         G = null;
         O = null;
         S = null;
         K = null;
         I = null;
         L = null;
         if (var0 > -19) {
            H = -57;
         }

         N = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "hk.K(" + var0 + ')');
      }
   }

   static final void h(int var0) {
      try {
         D++;
         Class_rg.W.a(var0 ^ 5682);
         if (var0 != 5698) {
            S = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "hk.D(" + var0 + ')');
      }
   }

   private final void a(Class_vg var1, int var2, int var3, int var4, int var5, int[] var6) {
      int var12 = client.lb;

      try {
         if ((4 & this.F.Jb[var1.E]) != 0 && ~var1.z > -1) {
            int var7 = this.F.y[var1.E] / Class_pd.a;

            while (true) {
               int var8 = (-var1.r + 1048575 + var7) / var7;
               if (var2 < var8) {
                  break;
               }

               var1.w.b(var6, var4, var8);
               var1.r += -1048576 + var7 * var8;
               var2 -= var8;
               int var9 = Class_pd.a / 100;
               var4 += var8;
               int var10 = 262144 / var7;
               if (var9 > var10) {
                  var9 = var10;
               }

               Class_rb var11;
               label71: {
                  var11 = var1.w;
                  if (this.F.mb[var1.E] == 0) {
                     var1.w = Class_rb.a(var1.P, var11.j(), var11.i(), var11.h());
                     if (var12 == 0) {
                        break label71;
                     }
                  }

                  var1.w = Class_rb.a(var1.P, var11.j(), 0, var11.h());
                  this.F.a(var1, ~var1.F.q[var1.J] > -1, (byte)56);
                  var1.w.c(var9, var11.i());
               }

               if (~var1.F.q[var1.J] > -1) {
                  var1.w.e(-1);
               }

               var11.g(var9);
               var11.b(var6, var4, var5 - var4);
               if (var11.f()) {
                  this.R.b(var11);
                  if (var12 != 0) {
                     break;
                  }
               }
            }

            var1.r += var7 * var2;
         }

         y++;
         if (var3 != 24981) {
            K = null;
         }

         var1.w.b(var6, var4, var2);
      } catch (RuntimeException var13) {
         throw Class_sh.a(
            var13,
            "hk.G(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + (var6 != null ? "{...}" : "null") + ')'
         );
      }
   }

   static final void a(byte var0) {
      try {
         if (var0 != -38) {
            e(-58);
         }

         u++;

         while (true) {
            Class_c var2 = Class_jb.V;
            Class_v var1;
            synchronized (var2) {
               var1 = (Class_v)Class_wg.d.e(-110);
            }

            if (var1 == null) {
               return;
            }

            var1.A.a(-83, false, var1.q, var1.v, (int)var1.a);
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "hk.J(" + var0 + ')');
      }
   }

   final int a() {
      try {
         C++;
         return 0;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "hk.C(" + 41);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final void d(int var1) {
      int var4 = client.lb;

      try {
         this.R.d(var1);
         A++;
         Class_vg var3 = (Class_vg)this.E.e((byte)76);
         if (var4 != 0 || var3 != null) {
            do {
               if (!this.F.a(var3, (byte)-42)) {
                  int var2 = var1;
                  if (var4 == 0 && ~var3.H <= ~var1) {
                     this.a(var3, var1, -1);
                     var3.H -= var1;
                  } else {
                     while (true) {
                        this.a(var3, var3.H, -1);
                        var2 -= var3.H;
                        if (this.F.a(var2, 0, var3, (byte)-68, null) && var4 == 0) {
                           break;
                        }

                        if (~var3.H <= ~var2) {
                           this.a(var3, var2, -1);
                           var3.H -= var2;
                           break;
                        }
                     }
                  }
               }

               var3 = (Class_vg)this.E.c((byte)-117);
            } while (var3 != null);
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "hk.A(" + var1 + ')');
      }
   }

   final Class_wd d() {
      try {
         Q++;

         Class_vg var1;
         do {
            var1 = (Class_vg)this.E.c((byte)61);
            if (var1 == null) {
               return null;
            }
         } while (var1.w == null);

         return var1.w;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "hk.L(" + ')');
      }
   }

   Class_hk(Class_dd var1) {
      try {
         this.F = var1;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "hk.<init>(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }
}
