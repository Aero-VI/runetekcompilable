import java.awt.Component;

class Class_ff {
   static Class_c a = new Class_c();
   static int b;
   private int c = 32;
   static int d = 0;
   static Class_ha e = null;
   static int f;
   static int g;
   static int h;
   static int i;
   static int j;
   static int k;
   static int l;
   static int m;
   static int n;
   private Class_wd o;
   static int p;
   static int q;
   static int r;
   static int s;
   static int t;
   static int u;
   static Class_c v = new Class_c();
   private long w = Class_fj.a(17161);
   int[] x;
   static int y = 7759444;
   private boolean z = true;
   private Class_wd[] A;
   private int B = 0;
   private int C;
   private int D;
   int E;
   private long F = 0L;
   private int G;
   private Class_wd[] H;
   int I;
   private int J;
   private long K;

   final void a(boolean var1) {
      try {
         if (!var1) {
            this.z = true;
            g++;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ff.O(" + var1 + ')');
      }
   }

   private final void a(int[] var1, int var2) {
      int var3 = var2;
      if (Class_aj.p) {
         var3 = var2 << 1;
      }

      Class_gb.a(var1, 0, var3);
      this.J -= var2;
      if (this.o != null && this.J <= 0) {
         this.J = this.J + (Class_pd.a >> 4);
         Class_rj.a((byte)-45, this.o);
         this.a((byte)88, this.o, this.o.c());
         int var4 = 0;
         int var5 = 255;

         label103:
         for (int var6 = 7; var5 != 0; var6--) {
            int var7;
            int var8;
            if (var6 < 0) {
               var7 = var6 & 3;
               var8 = -(var6 >> 2);
            } else {
               var7 = var6;
               var8 = 0;
            }

            for (int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
               if ((var9 & 1) != 0) {
                  var5 &= ~(1 << var7);
                  Class_wd var10 = null;
                  Class_wd var11 = this.A[var7];

                  while (var11 != null) {
                     Class_ki var12 = var11.p;
                     if (var12 != null && var12.p > var8) {
                        var5 |= 1 << var7;
                        var10 = var11;
                        var11 = var11.s;
                     } else {
                        var11.r = true;
                        int var13 = var11.a();
                        var4 += var13;
                        if (var12 != null) {
                           var12.p += var13;
                        }

                        if (var4 >= this.c) {
                           break label103;
                        }

                        Class_wd var14 = var11.b();
                        if (var14 != null) {
                           for (int var15 = var11.q; var14 != null; var14 = var11.d()) {
                              this.a((byte)104, var14, var15 * var14.c() >> 8);
                           }
                        }

                        Class_wd var19 = var11.s;
                        var11.s = null;
                        if (var10 == null) {
                           this.A[var7] = var19;
                        } else {
                           var10.s = var19;
                        }

                        if (var19 == null) {
                           this.H[var7] = var10;
                        }

                        var11 = var19;
                     }
                  }
               }

               var7 += 4;
               var8++;
            }
         }

         for (int var16 = 0; var16 < 8; var16++) {
            Class_wd var17 = this.A[var16];
            this.A[var16] = this.H[var16] = null;

            while (var17 != null) {
               Class_wd var18 = var17.s;
               var17.s = null;
               var17 = var18;
            }
         }
      }

      if (this.J < 0) {
         this.J = 0;
      }

      if (this.o != null) {
         this.o.b(var1, 0, var2);
      }

      this.w = Class_fj.a(17161);
   }

   void a() throws Exception {
      try {
         k++;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ff.B(" + ')');
      }
   }

   private final void a(int var1, int var2) {
      try {
         if (var1 != 2955) {
            d = 58;
         }

         i++;
         this.J -= var2;
         if (~this.J > -1) {
            this.J = 0;
         }

         if (this.o != null) {
            this.o.d(var2);
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "ff.R(" + var1 + ',' + var2 + ')');
      }
   }

   int b() throws Exception {
      try {
         q++;
         return this.I;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ff.A(" + 41);
      }
   }

   void a(int var1) throws Exception {
      try {
         l++;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ff.E(" + var1 + ')');
      }
   }

   static final void a(int var0, int var1, int var2, int var3, boolean var4) {
      try {
         p++;
         Class_nc.c(var3, var0, var3 + var2, var1 + var0);
         Class_nc.f(var3, var0, var2, var1, 0);
         if (Class_je.m >= 100) {
            if (Class_a.f == null || Class_a.f.Q != var2 || ~Class_a.f.S != ~var1) {
               Class_ni var5 = new Class_ni(var2, var1);
               Class_nc.a(var5.I, var2, var1);
               Class_wj.a(0, 0, Class_sb.j, 0, 0, var2, 1391070128, var1, Class_fi.z);
               Class_a.f = var5;
               Class_qe.s.c(81);
            }

            Class_a.f.d(var3, var0);
            int var13 = var3 + var2 * Class_de.g / Class_fi.z;
            int var6 = var0 - -(Class_kk.q * var1 / Class_sb.j);
            int var7 = var2 * Class_pg.w / Class_fi.z;
            if (!var4) {
               a(-12, 24, -51, 5, true);
            }

            int var8 = var1 * Class_vc.S / Class_sb.j;
            Class_nc.c(var13, var6, var7, var8, 16711680, 128);
            Class_nc.a(var13, var6, var7, var8, 16711680);
            if (~Class_ve.T < -1 && Class_ve.T % 10 < 5) {
               for (Class_jc var9 = (Class_jc)Class_mj.e.e((byte)76); var9 != null; var9 = (Class_jc)Class_mj.e.c((byte)90)) {
                  if (~Class_ia.gb == ~var9.D) {
                     int var10 = var9.u * var2 / Class_fi.z + var3;
                     int var11 = var9.A * var1 / Class_sb.j + var0;
                     Class_nc.f(-2 + var10, -2 + var11, 4, 4, 16776960);
                  }
               }
            }
         }
      } catch (RuntimeException var12) {
         throw Class_sh.a(var12, "ff.L(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
      }
   }

   final synchronized void a(boolean var1, Class_wd var2) {
      try {
         h++;
         this.o = var2;
         if (var1) {
            this.a(null, 104);
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "ff.K(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
      }
   }

   void c() {
      try {
         b++;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ff.D(" + ')');
      }
   }

   public static void a(byte var0) {
      try {
         if (var0 == -90) {
            a = null;
            v = null;
            e = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ff.J(" + var0 + ')');
      }
   }

   final synchronized void b(byte var1) {
      try {
         u++;
         this.z = true;
         if (var1 == -100) {
            try {
               this.d();
            } catch (Exception var3) {
               this.c();
               this.F = 2000L + Class_fj.a(17161);
            }
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "ff.H(" + var1 + ')');
      }
   }

   private final void a(byte var1, Class_wd var2, int var3) {
      try {
         s++;
         int var4 = var3 >> 1734735941;
         if (var1 < 4) {
            this.H = null;
         }

         Class_wd var5 = this.H[var4];
         if (var5 != null) {
            var5.s = var2;
         } else {
            this.A[var4] = var2;
         }

         this.H[var4] = var2;
         var2.q = var3;
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "ff.Q(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
      }
   }

   final synchronized void c(byte var1) {
      try {
         int var2 = 101 / ((9 - var1) / 44);
         m++;
         if (this.x != null) {
            long var3 = Class_fj.a(17161);

            try {
               if (this.F != 0L) {
                  if (var3 < this.F) {
                     return;
                  }

                  this.a(this.I);
                  this.F = 0L;
                  this.z = true;
               }

               int var5 = this.b();
               if (-var5 + this.B > this.G) {
                  this.G = this.B - var5;
               }

               int var6 = this.D + this.E;
               if (~(256 + var6) < -16385) {
                  var6 = 16128;
               }

               if (~this.I > ~(256 + var6)) {
                  this.I += 1024;
                  if (~this.I < -16385) {
                     this.I = 16384;
                  }

                  this.c();
                  this.a(this.I);
                  this.z = true;
                  var5 = 0;
                  if (256 + var6 > this.I) {
                     var6 = -256 + this.I;
                     this.D = var6 + -this.E;
                  }
               }

               while (~var6 < ~var5) {
                  this.a(this.x, 256);
                  this.a();
                  var5 += 256;
               }

               if (~this.K > ~var3) {
                  if (this.z) {
                     this.z = false;
                  } else {
                     if (this.G == 0 && ~this.C == -1) {
                        this.c();
                        this.F = var3 + 2000L;
                        return;
                     }

                     this.D = Math.min(this.C, this.G);
                     this.C = this.G;
                  }

                  this.G = 0;
                  this.K = 2000L + var3;
               }

               this.B = var5;
            } catch (Exception var8) {
               this.c();
               this.F = 2000L + var3;
            }

            try {
               if (~var3 < ~(500000L + this.w)) {
                  var3 = this.w;
               }

               while (~var3 < ~(5000L + this.w)) {
                  this.a(2955, 256);
                  this.w = this.w + 256000 / Class_pd.a;
               }
            } catch (Exception var7) {
               this.w = var3;
            }
         }
      } catch (RuntimeException var9) {
         throw Class_sh.a(var9, "ff.P(" + var1 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final synchronized void b(int var1) {
      int var4 = client.lb;

      try {
         if (Class_h.a != null) {
            boolean var2 = true;
            int var3 = 0;
            if (var4 != 0 || var3 < 2) {
               do {
                  if (Class_h.a.j[var3] == this) {
                     Class_h.a.j[var3] = null;
                  }

                  if (Class_h.a.j[var3] != null) {
                     var2 = false;
                  }
               } while (++var3 < 2);
            }

            if (var2) {
               Class_h.a.l = true;
               if (var4 != 0 || Class_h.a.n) {
                  do {
                     Class_hg.a(var1 + -7759449, 50L);
                  } while (Class_h.a.n);
               }

               Class_h.a = null;
            }
         }

         n++;
         this.c();
         this.x = null;
         if (var1 != 7759444) {
            this.z = true;
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "ff.N(" + var1 + ')');
      }
   }

   static final Class_w a(int var0, byte var1) {
      try {
         t++;
         Class_w var2 = (Class_w)Class_bf.f.a(14366, (long)var0);
         if (var2 != null) {
            return var2;
         } else {
            if (var1 >= -31) {
               a((byte)102, null);
            }

            var2 = Class_sa.a(-32, false, Class_kf.w, var0, Class_og.eb);
            if (var2 != null) {
               Class_bf.f.a(var2, 114, var0);
            }

            return var2;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ff.S(" + var0 + ',' + var1 + ')');
      }
   }

   void a(Component var1) throws Exception {
      try {
         j++;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ff.F(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   void d() throws Exception {
      try {
         r++;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ff.G(" + ')');
      }
   }

   static final void a(byte var0, Class_cj var1) {
      try {
         f++;
         Class_tg.l = var1.a(Class_pa.C, (byte)-103);
         Class_ua.l = var1.a(Class_aj.g, (byte)-117);
         Class_hg.i = var1.a(Class_g.e, (byte)-112);
         Class_pe.z = var1.a(Class_oj.T, (byte)-83);
         Class_vg.t = var1.a(Class_s.W, (byte)-122);
         Class_hh.l = var1.a(Class_jg.d, (byte)-128);
         Class_ca.b = var1.a(Class_ta.Eb, (byte)-104);
         Class_j.R = var1.a(Class_pa.o, (byte)-127);
         Class_tg.b = var1.a(Class_sj.d, (byte)-99);
         Class_qe.w = var1.a(Class_fk.db, (byte)-92);
         Class_jc.B = var1.a(Class_hc.g, (byte)-88);
         Class_ra.p = var1.a(Class_va.V, (byte)-117);
         Class_vi.U = var1.a(Class_lf.z, (byte)-106);
         Class_pi.U = var1.a(Class_jg.m, (byte)-86);
         Class_rd.S = var1.a(Class_pb.l, (byte)-112);
         Class_bj.i = var1.a(Class_oc.d, (byte)-128);
         var1.a(Class_pi.eb, (byte)-127);
         if (var0 != 105) {
            a(95, -83, 14, -46, false);
         }

         Class_qb.k = var1.a(Class_ck.h, (byte)-82);
         Class_qb.e = var1.a(Class_uc.H, (byte)-106);
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ff.I(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   public Class_ff() {
      this.A = new Class_wd[8];
      this.C = 0;
      this.H = new Class_wd[8];
      this.G = 0;
      this.J = 0;
      this.K = 0L;
   }
}
