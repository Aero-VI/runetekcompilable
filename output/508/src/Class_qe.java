final class Class_qe extends Class_a {
   int p;
   static int q;
   private Class_uc r;
   static Class_me s;
   static int t;
   static int u;
   private int v;
   static int w;
   static int x;
   private int y = 0;
   int z;
   static int A;
   int B;
   int C;
   static int D;
   static int E;
   static Class_tg F = new Class_tg(16);
   private int G;
   private int H;
   boolean I;
   int J;
   static int K = -1;
   static Class_ha L;
   static int[] M = new int[25];

   public static void c(int var0) {
      try {
         s = null;
         M = null;
         L = null;
         if (var0 != 2) {
            M = null;
         }

         F = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "qe.G(" + var0 + ')');
      }
   }

   static final void d(int var0) {
      Class_hd.n = var0;

      for (int var1 = 0; var1 < Class_ra.g; var1++) {
         for (int var2 = 0; var2 < Class_qb.m; var2++) {
            if (Class_ck.d[var0][var1][var2] == null) {
               Class_ck.d[var0][var1][var2] = new Class_aa(var0, var1, var2);
            }
         }
      }
   }

   final int a() {
      try {
         t++;
         return this.G;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "qe.D(" + 41);
      }
   }

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      try {
         u++;
         Class_jh var11 = this.e(119);
         if (var11 != null) {
            var11.a(var1, var2, var3, var4, var5, var6, var7, var8, var9);
            this.G = var11.a();
         }
      } catch (RuntimeException var12) {
         throw Class_sh.a(var12, "qe.A(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ')');
      }
   }

   final void a(int var1, boolean var2) {
      try {
         q++;
         if (!this.I) {
            this.y += var1;
            if (!var2) {
               while (this.y > this.r.A[this.v]) {
                  this.y = this.y - this.r.A[this.v];
                  this.v++;
                  if (~this.r.d.length >= ~this.v) {
                     this.I = true;
                     return;
                  }
               }
            }
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "qe.J(" + var1 + ',' + var2 + ')');
      }
   }

   static final Class_ub a(int var0, int var1) {
      try {
         A++;
         Class_ub var2 = (Class_ub)Class_mi.P.a(14366, (long)var1);
         if (var2 != null) {
            return var2;
         } else {
            byte[] var3 = Class_dd.P.a(Class_sf.a(var1, false), 0, Class_lk.b(28443, var1));
            var2 = new Class_ub();
            var2.vb = var1;
            if (var3 != null) {
               var2.a((byte)29, new Class_lh(var3));
            }

            var2.a(-129);
            if (!Class_vj.z && var2.t) {
               var2.W = null;
            }

            if (var2.j) {
               var2.mb = 0;
               var2.ub = false;
            }

            Class_mi.P.a(var2, 110, var1);
            if (var0 < 79) {
               K = -82;
            }

            return var2;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "qe.H(" + var0 + ',' + var1 + ')');
      }
   }

   static final void a(Class_lh var0, byte var1) {
      int var4 = client.lb;

      try {
         E++;
         if (-var0.p + var0.E.length >= 1) {
            int var2 = var0.n(-6677);
            if (var2 >= 0 && ~var2 >= -4) {
               byte var3;
               label172: {
                  if (var2 == 3) {
                     var3 = 23;
                     if (var4 == 0) {
                        break label172;
                     }
                  }

                  if (~var2 == -3) {
                     var3 = 22;
                     if (var4 == 0) {
                        break label172;
                     }
                  }

                  if (~var2 != -2) {
                     var3 = 19;
                     if (var4 == 0) {
                        break label172;
                     }
                  }

                  var3 = 23;
               }

               if (var3 <= -var0.p + var0.E.length) {
                  label148: {
                     Class_ha.hd = var0.n(-6677);
                     if (Class_ha.hd >= 1) {
                        if (Class_ha.hd <= 4) {
                           break label148;
                        }

                        Class_ha.hd = 4;
                        if (var4 == 0) {
                           break label148;
                        }
                     }

                     Class_ha.hd = 1;
                  }

                  if (var1 <= 89) {
                     M = null;
                  }

                  Class_ja.a(~var0.n(-6677) == -2, 1);
                  Class_bk.P = ~var0.n(-6677) == -2;
                  Class_ng.o = var0.n(-6677) == 1;
                  Class_fc.s = ~var0.n(-6677) == -2;
                  Class_r.b = var0.n(-6677) == 1;
                  Class_bc.U = ~var0.n(-6677) == -2;
                  Class_qd.G = ~var0.n(-6677) == -2;
                  Class_o.hb = ~var0.n(-6677) == -2;
                  Class_ok.X = var0.n(-6677);
                  if (Class_ok.X > 2) {
                     Class_ok.X = 2;
                  }

                  label173: {
                     if (~var2 > -3) {
                        Class_dd.Gb = ~var0.n(-6677) == -2;
                        var0.n(-6677);
                        if (var4 == 0) {
                           break label173;
                        }
                     }

                     Class_dd.Gb = ~var0.n(-6677) == -2;
                  }

                  Class_fi.r = var0.n(-6677) == 1;
                  Class_gk.k = var0.n(-6677) == 1;
                  Class_lj.m = var0.n(-6677);
                  if (~Class_lj.m < -3) {
                     Class_lj.m = 2;
                  }

                  Class_mg.a = ~var0.n(-6677) == -2;
                  Class_sf.d = var0.n(-6677);
                  if (Class_sf.d > 127) {
                     Class_sf.d = 127;
                  }

                  Class_oj.Y = var0.n(-6677);
                  Class_tf.V = var0.n(-6677);
                  if (Class_tf.V > 127) {
                     Class_tf.V = 127;
                  }

                  if (var2 >= 1) {
                     Class_od.g = var0.k(1355769544);
                     Class_ij.e = var0.k(1355769544);
                  }

                  if (~var2 <= -4) {
                     Class_ma.Y = ~var0.n(-6677) == -2;
                  }
               }
            }
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "qe.C(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, Class_ha[] var1, int var2) {
      int var6 = client.lb;

      try {
         D++;
         if (var2 != 16) {
            w = -106;
         }

         int var3 = 0;
         if (var6 != 0 || var3 < var1.length) {
            do {
               Class_ha var4 = var1[var3];
               if (var4 != null) {
                  if (~var4.Kc == -1) {
                     if (var4.n != null) {
                        a(var0, var4.n, var2);
                     }

                     Class_be var5 = (Class_be)Class_nj.p.a(var4.K, -63);
                     if (var5 != null) {
                        Class_ua.a(113, var5.t, var0);
                     }
                  }

                  if (~var0 == -1 && var4.Lc != null) {
                     Class_wj var8 = new Class_wj();
                     var8.z = var4;
                     var8.x = var4.Lc;
                     Class_j.a(var8, 16);
                  }

                  if (var0 == 1 && var4.o != null) {
                     if (~var4.hc <= -1) {
                        Class_ha var9 = Class_tf.a(var4.K, (byte)-80);
                        if (var9 == null || var9.n == null || var9.n.length <= var4.hc || var9.n[var4.hc] != var4 && var6 == 0) {
                           continue;
                        }
                     }

                     Class_wj var10 = new Class_wj();
                     var10.x = var4.o;
                     var10.z = var4;
                     Class_j.a(var10, 16);
                  }
               }
            } while (++var3 < var1.length);
         }
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "qe.I(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
      }
   }

   private final Class_jh e(int var1) {
      try {
         x++;
         if (var1 <= 111) {
            F = null;
         }

         Class_mb var2 = Class_qj.c(this.H, 1);
         if (this.I) {
            Class_jh var3 = var2.b(-1, -10);
            if (client.lb == 0) {
               return var3 == null ? null : var3;
            }
         }

         Class_jh var5 = var2.b(this.v, -10);
         return var5 == null ? null : var5;
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "qe.F(" + var1 + ')');
      }
   }

   Class_qe(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.v = 0;
      this.G = -32768;
      this.I = false;

      try {
         this.C = var2;
         this.J = var3;
         this.z = var7 - -var6;
         this.H = var1;
         this.p = var5;
         this.B = var4;
         int var8 = Class_qj.c(this.H, 1).t;
         if (~var8 != 0) {
            this.I = false;
            this.r = Class_kk.a((byte)-36, var8);
         } else {
            this.I = true;
         }
      } catch (RuntimeException var9) {
         throw Class_sh.a(var9, "qe.<init>(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
      }
   }
}
