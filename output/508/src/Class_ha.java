final class Class_ha {
   int a = 0;
   static int b;
   static int c;
   Object[] d;
   static int e;
   boolean f;
   int g;
   int h;
   boolean i;
   boolean j;
   boolean k;
   int[] l;
   int m;
   Class_ha[] n;
   Object[] o;
   int p;
   Object[] q;
   int r = 0;
   int[] s;
   int t;
   int u;
   int v;
   Object[] w;
   byte x;
   int[] y;
   int z;
   int A;
   int[] B;
   Object[] C;
   boolean D;
   Object[] E;
   int[] F;
   Object[] G;
   int H;
   Object[] I;
   int[] J;
   int K;
   int L;
   int M;
   int[] N;
   int[] O;
   private int P;
   int Q;
   int R;
   static int S;
   Object[] T;
   Object[] U;
   int V;
   static int W;
   static int X;
   Object[] Y;
   Object[] Z;
   int ab;
   static int bb;
   int cb;
   byte db;
   Object[] eb;
   boolean fb;
   int gb;
   int hb;
   int ib;
   Class_r[] jb;
   int kb;
   boolean lb;
   byte mb;
   Object[] nb;
   int ob;
   Class_r[] pb;
   static int qb;
   boolean rb;
   int[] sb;
   boolean tb;
   int ub;
   static int vb;
   int wb;
   int xb;
   int yb;
   int zb;
   static int Ab;
   Object[] Bb;
   int Cb;
   Object[] Db;
   Object[] Eb;
   int Fb;
   int Gb;
   int[] Hb;
   int Ib;
   Object[] Jb;
   int Kb;
   int Lb;
   int Mb;
   int Nb;
   Object[] Ob;
   int Pb;
   boolean Qb;
   boolean Rb;
   private int Sb;
   int Tb;
   int[] Ub;
   int Vb;
   Object[] Wb;
   int Xb;
   static int Yb;
   int Zb;
   int ac;
   Object[] bc;
   int cc;
   boolean dc;
   int ec;
   int fc;
   boolean gc;
   int hc;
   Object[] ic;
   int jc;
   int kc;
   Object[] lc;
   Object[] mc;
   int nc;
   Object[] oc;
   Object[] pc;
   Class_r qc;
   int rc;
   Object[] sc;
   int tc;
   Class_r uc;
   Class_r vc;
   static int wc;
   int xc;
   Class_r yc;
   int zc;
   static Class_c Ac = new Class_c();
   int[] Bc;
   int Cc;
   int Dc;
   Class_r Ec;
   int[] Fc;
   int Gc;
   Class_ha Hc;
   boolean Ic;
   static int Jc;
   int Kc;
   Object[] Lc;
   Class_r Mc;
   int Nc;
   int[] Oc;
   int Pc;
   int Qc;
   int Rc;
   byte Sc;
   boolean Tc;
   int Uc;
   byte[] Vc;
   int[][] Wc;
   int Xc;
   int Yc;
   Object[] Zc;
   static int ad;
   Object[] bd;
   int cd;
   int dd;
   boolean ed;
   static int fd = 0;
   static Class_qc gd = new Class_qc(100);
   static int hd = 3;
   static Class_r id = Class_ha.kd;
   static float jd;
   private static Class_r kd = Class_tc.a(43, "glow3:");
   static Class_r ld = kd;
   static Class_r md = Class_ha.pd;
   static int nd = 0;
   static Class_c[][][] od = new Class_c[4][104][104];
   private static Class_r pd = Class_tc.a(43, "Close");

   final void a(int var1, int var2, int var3) {
      try {
         if (var2 < 27) {
            this.i = false;
         }

         int var4 = this.N[var3];
         b++;
         this.N[var3] = this.N[var1];
         this.N[var1] = var4;
         var4 = this.s[var3];
         this.s[var3] = this.s[var1];
         this.s[var1] = var4;
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "ha.B(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final void a(int var1, Class_r var2, int var3) {
      int var6 = client.lb;

      try {
         if (var3 != 0) {
            this.m = 47;
         }

         if (this.pb == null || ~this.pb.length >= ~var1) {
            Class_r[] var4 = new Class_r[1 + var1];
            if (this.pb != null) {
               int var5 = 0;
               if (var6 != 0) {
                  var4[var5] = this.pb[var5];
                  var5++;
               }

               while (~var5 > ~this.pb.length) {
                  var4[var5] = this.pb[var5];
                  var5++;
               }
            }

            this.pb = var4;
         }

         this.pb[var1] = var2;
         bb++;
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "ha.M(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final boolean a(int var1) {
      int var8 = client.lb;

      try {
         Jc++;
         if (this.Ub != null) {
            return true;
         } else {
            Class_dh var2 = Class_la.a(Class_ba.A, (byte)66, this.Gb, 0);
            if (var2 == null) {
               return false;
            } else {
               if (var1 != 2663) {
                  this.r = 6;
               }

               var2.c();
               this.Ub = new int[var2.o];
               this.B = new int[var2.o];
               int var3 = 0;
               if (var8 == 0 && ~var3 <= ~var2.o) {
                  return true;
               } else {
                  do {
                     int var4 = 0;
                     int var5 = var2.p;
                     int var6 = 0;
                     if (var8 != 0 || var2.p > var6) {
                        do {
                           if (~var2.r[var2.p * var3 + var6] != -1) {
                              var4 = var6;
                              if (var8 == 0) {
                                 break;
                              }

                              var6++;
                           } else {
                              var6++;
                           }
                        } while (var2.p > var6);
                     }

                     int var7 = var4;
                     if (var8 != 0 || var4 < var2.p) {
                        do {
                           if (var2.r[var2.p * var3 + var7] == 0) {
                              var5 = var7;
                              if (var8 == 0) {
                                 break;
                              }

                              var7++;
                           } else {
                              var7++;
                           }
                        } while (var7 < var2.p);
                     }

                     this.Ub[var3] = var4;
                     this.B[var3] = -var4 + var5;
                  } while (~(++var3) > ~var2.o);

                  return true;
               }
            }
         }
      } catch (RuntimeException var9) {
         throw Class_sh.a(var9, "ha.K(" + var1 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final void a(int var1, Class_lh var2) {
      int var12 = client.lb;

      try {
         label300: {
            wc++;
            this.dc = false;
            this.Kc = var2.n(var1 + 11488);
            this.A = var2.n(-6677);
            this.ab = var2.k(1355769544);
            this.cb = var2.p(-22489);
            this.cd = var2.p(-22489);
            this.r = var2.k(1355769544);
            this.Nc = var2.k(1355769544);
            this.x = 0;
            this.Sc = 0;
            this.db = 0;
            this.mb = 0;
            this.t = var2.n(-6677);
            this.R = var2.k(1355769544);
            if (~this.R == -65536) {
               this.R = -1;
               if (var12 == 0) {
                  break label300;
               }
            }

            this.R = this.R + (-65536 & this.K);
         }

         this.Kb = var2.k(var1 + 1355787709);
         if (this.Kb == 65535) {
            this.Kb = -1;
         }

         int var3 = var2.n(-6677);
         if (~var3 < -1) {
            this.O = new int[var3];
            this.J = new int[var3];
            int var4 = 0;
            if (var12 != 0 || ~var3 < ~var4) {
               do {
                  this.O[var4] = var2.n(Class_bj.a(var1, 23776));
                  this.J[var4] = var2.k(1355769544);
               } while (~var3 < ~(++var4));
            }
         }

         if (var1 != -18165) {
            ld = null;
         }

         int var14 = var2.n(-6677);
         if (var14 > 0) {
            this.Wc = new int[var14][];
            int var5 = 0;
            if (var12 != 0 || ~var14 < ~var5) {
               do {
                  int var6 = var2.k(1355769544);
                  this.Wc[var5] = new int[var6];
                  int var7 = 0;
                  if (var12 != 0 || ~var6 < ~var7) {
                     do {
                        this.Wc[var5][var7] = var2.k(1355769544);
                        if (~this.Wc[var5][var7] == -65536) {
                           this.Wc[var5][var7] = -1;
                        }
                     } while (~var6 < ~(++var7));
                  }
               } while (~var14 < ~(++var5));
            }
         }

         if (~this.Kc == -1) {
            this.M = var2.k(1355769544);
            this.i = ~var2.n(-6677) == -2;
         }

         if (this.Kc == 1) {
            var2.k(1355769544);
            var2.n(-6677);
         }

         if (this.Kc == 2) {
            this.db = 3;
            this.s = new int[this.r * this.Nc];
            this.N = new int[this.r * this.Nc];
            this.x = 3;
            int var15 = var2.n(-6677);
            if (var15 == 1) {
               this.h |= 268435456;
            }

            int var18 = var2.n(-6677);
            if (~var18 == -2) {
               this.h |= 1073741824;
            }

            int var20 = var2.n(var1 ^ 23776);
            if (~var20 == -2) {
               this.h |= -2147483648;
            }

            int var8 = var2.n(-6677);
            if (var8 == 1) {
               this.h |= 536870912;
            }

            this.zc = var2.n(-6677);
            this.Mb = var2.n(-6677);
            this.l = new int[20];
            this.Hb = new int[20];
            this.sb = new int[20];
            int var9 = 0;
            if (var12 != 0 || var9 < 20) {
               do {
                  int var10 = var2.n(var1 ^ 23776);
                  if (~var10 == -2) {
                     this.sb[var9] = var2.p(-22489);
                     this.l[var9] = var2.p(-22489);
                     this.Hb[var9] = var2.h(-5528);
                     if (var12 == 0) {
                        var9++;
                        continue;
                     }
                  }

                  this.Hb[var9] = -1;
                  var9++;
               } while (var9 < 20);
            }

            this.jb = new Class_r[5];
            int var22 = 0;
            if (var12 != 0 || var22 < 5) {
               do {
                  Class_r var11 = var2.e(127);
                  if (~var11.d((byte)-103) < -1) {
                     this.jb[var22] = var11;
                     this.h |= 1 << var22 + 23;
                  }
               } while (++var22 < 5);
            }
         }

         if (~this.Kc == -4) {
            this.gc = ~var2.n(-6677) == -2;
         }

         if (~this.Kc == -5 || this.Kc == 1) {
            this.v = var2.n(var1 + 11488);
            this.wb = var2.n(-6677);
            this.H = var2.n(-6677);
            this.Pc = var2.k(1355769544);
            if (this.Pc == 65535) {
               this.Pc = -1;
            }

            this.f = var2.n(-6677) == 1;
         }

         if (~this.Kc == -5) {
            this.vc = var2.e(127);
            this.uc = var2.e(127);
         }

         if (~this.Kc == -2 || ~this.Kc == -4 || ~this.Kc == -5) {
            this.yb = var2.h(-5528);
         }

         if (this.Kc == 3 || ~this.Kc == -5) {
            this.cc = var2.h(-5528);
            this.ub = var2.h(-5528);
            this.u = var2.h(-5528);
         }

         if (this.Kc == 5) {
            this.Gb = var2.h(-5528);
            this.zb = var2.h(-5528);
         }

         if (this.Kc == 6) {
            this.fc = 1;
            this.V = var2.k(var1 + 1355787709);
            this.P = 1;
            if (~this.V == -65536) {
               this.V = -1;
            }

            this.Sb = var2.k(var1 ^ -1355751485);
            if (this.Sb == 65535) {
               this.Sb = -1;
            }

            this.xb = var2.k(var1 + 1355787709);
            if (this.xb == 65535) {
               this.xb = -1;
            }

            this.jc = var2.k(1355769544);
            if (~this.jc == -65536) {
               this.jc = -1;
            }

            this.g = var2.k(1355769544);
            this.ec = var2.k(var1 + 1355787709);
            this.gb = var2.k(1355769544);
         }

         if (~this.Kc == -8) {
            this.db = 3;
            this.s = new int[this.Nc * this.r];
            this.N = new int[this.Nc * this.r];
            this.x = 3;
            this.v = var2.n(var1 + 11488);
            this.Pc = var2.k(var1 ^ -1355751485);
            if (this.Pc == 65535) {
               this.Pc = -1;
            }

            this.f = ~var2.n(-6677) == -2;
            this.yb = var2.h(-5528);
            this.zc = var2.p(-22489);
            this.Mb = var2.p(-22489);
            int var16 = var2.n(-6677);
            this.jb = new Class_r[5];
            if (~var16 == -2) {
               this.h |= 1073741824;
            }

            int var19 = 0;
            if (var12 != 0 || var19 < 5) {
               do {
                  Class_r var21 = var2.e(var1 ^ -18060);
                  if (~var21.d((byte)-124) < -1) {
                     this.jb[var19] = var21;
                     this.h |= 1 << 23 - -var19;
                  }
               } while (++var19 < 5);
            }
         }

         if (this.Kc == 8) {
            this.vc = var2.e(127);
         }

         if (this.A == 2 || ~this.Kc == -3) {
            this.yc = var2.e(127);
            this.Mc = var2.e(var1 ^ -18060);
            int var17 = var2.k(1355769544) & 63;
            this.h |= var17 << 68141611;
         }

         if (~this.A == -2 || ~this.A == -5 || this.A == 5 || this.A == 6) {
            this.qc = var2.e(127);
            if (this.qc.d((byte)-118) == 0) {
               if (~this.A == -2) {
                  this.qc = Class_nb.c;
               }

               if (~this.A == -5) {
                  this.qc = Class_ch.d;
               }

               if (~this.A == -6) {
                  this.qc = Class_ch.d;
               }

               if (this.A == 6) {
                  this.qc = Class_rh.j;
               }
            }
         }

         if (this.A == 1 || ~this.A == -5 || ~this.A == -6) {
            this.h |= 4194304;
         }

         if (~this.A == -7) {
            this.h |= 1;
         }
      } catch (RuntimeException var13) {
         throw Class_sh.a(var13, "ha.E(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
      }
   }

   final Class_jb a(byte var1, int var2) {
      try {
         Class_pd.j = false;
         c++;
         if (~var2 <= -1 && ~this.Hb.length < ~var2) {
            int var3 = this.Hb[var2];
            if (var1 > -26) {
               this.w = null;
            }

            if (~var3 == 0) {
               return null;
            } else {
               Class_jb var4 = (Class_jb)Class_wb.g.a(14366, (long)var3);
               if (var4 != null) {
                  return var4;
               } else {
                  var4 = Class_uh.a(64, var3, 0, Class_ba.A);
                  if (var4 == null) {
                     Class_pd.j = true;
                     if (client.lb == 0) {
                        return var4;
                     }
                  }

                  Class_wb.g.a(var4, 99, var3);
                  return var4;
               }
            }
         } else {
            return null;
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "ha.A(" + var1 + ',' + var2 + ')');
      }
   }

   public static void b(int var0) {
      try {
         id = null;
         od = null;
         pd = null;
         ld = null;
         Ac = null;
         if (var0 != 104) {
            a((Class_cj)null, 57);
         }

         gd = null;
         md = null;
         kd = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ha.H(" + var0 + ')');
      }
   }

   static final void a(Class_cj var0, int var1) {
      try {
         vb++;
         if (var1 == 1) {
            Class_rf.h = var0;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ha.C(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final void b(int var1, Class_lh var2) {
      int var6 = client.lb;

      try {
         label148: {
            var2.p++;
            ad++;
            this.dc = true;
            this.Kc = var2.n(-6677);
            this.ab = var2.k(1355769544);
            this.cb = var2.p(-22489);
            this.cd = var2.p(-22489);
            this.r = var2.k(1355769544);
            this.Nc = var2.k(1355769544);
            this.x = var2.o(3390);
            this.db = var2.o(3390);
            this.Sc = var2.o(3390);
            this.mb = var2.o(3390);
            this.R = var2.k(1355769544);
            if (~this.R == -65536) {
               this.R = -1;
               if (var6 == 0) {
                  break label148;
               }
            }

            this.R = this.R + (-65536 & this.K);
         }

         this.i = ~var2.n(-6677) == var1;
         if (this.Kc == 0) {
            this.Cc = var2.k(1355769544);
            this.M = var2.k(var1 ^ -1355769546);
            this.ed = ~var2.n(-6677) == -2;
         }

         if (~this.Kc == -6) {
            this.Gb = var2.h(-5528);
            this.Lb = var2.k(1355769544);
            int var3 = var2.n(-6677);
            this.tb = ~(1 & var3) != -1;
            this.j = (var3 & 2) != 0;
            this.t = var2.n(-6677);
            this.Zb = var2.n(-6677);
            this.Uc = var2.h(var1 ^ 5526);
            this.lb = ~var2.n(-6677) == -2;
            this.rb = ~var2.n(var1 ^ 6677) == -2;
         }

         if (~this.Kc == -7) {
            this.fc = 1;
            this.V = var2.k(1355769544);
            if (~this.V == -65536) {
               this.V = -1;
            }

            this.Xb = var2.p(-22489);
            this.ib = var2.p(-22489);
            this.ec = var2.k(1355769544);
            this.gb = var2.k(1355769544);
            this.Tb = var2.k(1355769544);
            this.g = var2.k(1355769544);
            this.xb = var2.k(var1 + 1355769546);
            if (this.xb == 65535) {
               this.xb = -1;
            }

            this.fb = var2.n(var1 ^ 6677) == 1;
            var2.k(1355769544);
            var2.k(1355769544);
            var2.n(-6677);
            if (~this.x != -1) {
               this.L = var2.k(var1 ^ -1355769546);
            }

            if (~this.db != -1) {
               this.xc = var2.k(1355769544);
            }
         }

         if (~this.Kc == -5) {
            this.Pc = var2.k(1355769544);
            if (this.Pc == 65535) {
               this.Pc = -1;
            }

            this.vc = var2.e(127);
            this.H = var2.n(-6677);
            this.v = var2.n(var1 + -6675);
            this.wb = var2.n(var1 + -6675);
            this.f = var2.n(var1 ^ 6677) == 1;
            this.yb = var2.h(-5528);
         }

         if (this.Kc == 3) {
            this.yb = var2.h(-5528);
            this.gc = ~var2.n(-6677) == -2;
            this.t = var2.n(var1 + -6675);
         }

         if (~this.Kc == -10) {
            this.ob = var2.n(-6677);
            this.yb = var2.h(-5528);
            this.Ic = var2.n(-6677) == 1;
         }

         this.h = var2.b((byte)-113);
         int var8 = var2.n(-6677);
         if (var8 > 0) {
            this.Vc = new byte[var8];
            int var4 = 0;
            if (var6 != 0 || ~var4 > ~var8) {
               do {
                  this.Vc[var4] = var2.o(var1 + 3392);
               } while (~(++var4) > ~var8);
            }
         }

         this.Ec = var2.e(var1 ^ -127);
         int var9 = var2.n(-6677);
         if (~var9 < -1) {
            this.pb = new Class_r[var9];
            int var5 = 0;
            if (var6 != 0 || ~var9 < ~var5) {
               do {
                  this.pb[var5] = var2.e(127);
               } while (~var9 < ~(++var5));
            }
         }

         this.kc = var2.n(-6677);
         this.Xc = var2.n(var1 ^ 6677);
         this.k = var2.n(-6677) == 1;
         this.yc = var2.e(127);
         this.d = this.a((byte)-72, var2);
         this.C = this.a((byte)-72, var2);
         this.q = this.a((byte)-72, var2);
         this.Y = this.a((byte)-72, var2);
         this.bd = this.a((byte)-72, var2);
         this.E = this.a((byte)-72, var2);
         this.Db = this.a((byte)-72, var2);
         this.bc = this.a((byte)-72, var2);
         this.sc = this.a((byte)-72, var2);
         this.Wb = this.a((byte)-72, var2);
         this.Eb = this.a((byte)-72, var2);
         this.G = this.a((byte)-72, var2);
         this.Zc = this.a((byte)-72, var2);
         this.I = this.a((byte)-72, var2);
         this.nb = this.a((byte)-72, var2);
         this.Z = this.a((byte)-72, var2);
         this.w = this.a((byte)-72, var2);
         this.Ob = this.a((byte)-72, var2);
         this.pc = this.a((byte)-72, var2);
         this.Bb = this.a((byte)-72, var2);
         this.F = this.a(var2, 0);
         this.Bc = this.a(var2, 0);
         this.Fc = this.a(var2, 0);
         this.Oc = this.a(var2, 0);
         this.y = this.a(var2, 0);
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "ha.F(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private final int[] a(Class_lh var1, int var2) {
      int var6 = client.lb;

      try {
         W++;
         int var3 = var1.n(-6677);
         if (var2 == var3) {
            return null;
         } else {
            int[] var4 = new int[var3];
            int var5 = 0;
            if (var6 == 0 && var5 >= var3) {
               return var4;
            } else {
               do {
                  var4[var5] = var1.h(-5528);
               } while (++var5 < var3);

               return var4;
            }
         }
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "ha.L(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private final Object[] a(byte var1, Class_lh var2) {
      int var7 = client.lb;

      try {
         S++;
         int var3 = var2.n(var1 + -6605);
         if (var3 == 0) {
            return null;
         } else {
            Object[] var4 = new Object[var3];
            if (var1 != -72) {
               this.bd = null;
            }

            int var5 = 0;
            if (var7 == 0 && ~var5 <= ~var3) {
               this.Rb = true;
               return var4;
            } else {
               do {
                  int var6 = var2.n(-6677);
                  if (~var6 == -1) {
                     var4[var5] = new Integer(var2.h(var1 + -5456));
                     if (var7 != 0) {
                        if (var6 == 1) {
                           var4[var5] = var2.e(127);
                        }

                        var5++;
                     } else {
                        var5++;
                     }
                  } else {
                     if (var6 == 1) {
                        var4[var5] = var2.e(127);
                     }

                     var5++;
                  }
               } while (~var5 > ~var3);

               this.Rb = true;
               return var4;
            }
         }
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "ha.G(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
      }
   }

   final Class_af a(int var1, Class_pc[] var2) {
      try {
         Yb++;
         Class_pd.j = false;
         if (~this.Pc == 0) {
            return null;
         } else {
            if (var1 >= -86) {
               this.a(51, 87, -18);
            }

            Class_af var3 = (Class_af)Class_m.ib.a(14366, (long)this.Pc);
            if (var3 != null) {
               return var3;
            } else {
               var3 = Class_pa.a(Class_ba.A, 0, (byte)127, Class_kg.w, this.Pc);
               if (var3 == null) {
                  Class_pd.j = true;
                  if (client.lb == 0) {
                     return var3;
                  }
               }

               var3.a(var2, null);
               Class_m.ib.a(var3, 107, this.Pc);
               return var3;
            }
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "ha.I(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
      }
   }

   final Class_jh a(int var1, boolean var2, byte var3, Class_wf var4, Class_uc var5) {
      try {
         e++;
         if (var3 != -27) {
            this.a(103, (Class_lh)null);
         }

         int var6;
         int var7;
         label99: {
            Class_pd.j = false;
            if (!var2) {
               var7 = this.V;
               var6 = this.fc;
               if (client.lb == 0) {
                  break label99;
               }
            }

            var6 = this.P;
            var7 = this.Sb;
         }

         if (var6 == 0) {
            return null;
         } else if (var6 == 1 && var7 == -1) {
            return null;
         } else if (var6 == 1) {
            Class_jh var16 = (Class_jh)Class_bg.o.a(var3 + 14393, (long)((var6 << -989736496) + var7));
            if (var16 == null) {
               Class_ne var18 = Class_ne.a(Class_vc.R, var7, 0);
               if (var18 == null) {
                  Class_pd.j = true;
                  return null;
               }

               var16 = var18.c(64, 768, -50, -10, -50);
               Class_bg.o.a(var16, var3 ^ -100, var7 + (var6 << -181231824));
            }

            if (var5 != null) {
               var16 = var5.a((byte)123, var16, var1);
            }

            return var16;
         } else if (~var6 == -3) {
            Class_jh var15 = Class_i.c(var7, 101).a(var5, (byte)12, var1);
            if (var15 == null) {
               Class_pd.j = true;
               return null;
            } else {
               return var15;
            }
         } else if (~var6 == -4) {
            if (var4 == null) {
               return null;
            } else {
               Class_jh var14 = var4.a(var1, var5, -13);
               if (var14 == null) {
                  Class_pd.j = true;
                  return null;
               } else {
                  return var14;
               }
            }
         } else if (var6 == 4) {
            Class_cf var13 = Class_ra.a(-25672, var7);
            Class_jh var17 = var13.a(10, var5, var1, 13895);
            if (var17 == null) {
               Class_pd.j = true;
               return null;
            } else {
               return var17;
            }
         } else if (~var6 == -7) {
            Class_jh var12 = Class_i.c(var7, -119).a(0, null, (byte)-121, var5, var1);
            if (var12 == null) {
               Class_pd.j = true;
               return null;
            } else {
               return var12;
            }
         } else if (~var6 == -8) {
            int var9 = this.V & 65535;
            int var8 = this.V >>> 1664705104;
            Class_jh var10 = var4.a(var1, var5, var8, var9, (byte)-37);
            if (var10 == null) {
               Class_pd.j = true;
               return null;
            } else {
               return var10;
            }
         } else {
            return null;
         }
      } catch (RuntimeException var11) {
         throw Class_sh.a(
            var11, "ha.J(" + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ',' + (var5 != null ? "{...}" : "null") + ')'
         );
      }
   }

   final Class_jb a(boolean var1, int var2) {
      int var8 = client.lb;

      try {
         int var3;
         label78: {
            Class_pd.j = false;
            X++;
            if (var1) {
               var3 = this.zb;
               if (var8 == 0) {
                  break label78;
               }
            }

            var3 = this.Gb;
         }

         if (~var3 == 0) {
            return null;
         } else {
            long var4 = var3
               + ((!this.j ? 0L : 1L) << 1356195)
               + (((long)this.Zb << 1472580260) + ((!this.lb ? 0L : 1L) << 1233233126) - -((this.rb ? 1L : 0L) << 2132906599) - -((long)this.Uc << -670715992));
            Class_jb var6 = (Class_jb)Class_wb.g.a(var2 ^ 26633, var4);
            if (var6 != null) {
               return var6;
            } else {
               Class_ni var7;
               label70: {
                  if (this.j) {
                     var7 = Class_se.a(90, Class_ba.A, 0, var3);
                     if (var8 == 0) {
                        break label70;
                     }
                  }

                  var7 = Class_qd.a(var3, (byte)-96, Class_ba.A, 0);
               }

               if (var7 == null) {
                  Class_pd.j = true;
                  return null;
               } else {
                  if (this.lb) {
                     var7.a();
                  }

                  if (this.rb) {
                     var7.b();
                  }

                  if (var2 != 20503) {
                     this.a(45, true, (byte)41, null, null);
                  }

                  if (this.Zb > 0) {
                     var7.f(this.Zb);
                  }

                  if (~this.Zb <= -2) {
                     var7.d(1);
                  }

                  if (this.Zb >= 2) {
                     var7.d(16777215);
                  }

                  if (~this.Uc != -1) {
                     var7.e(this.Uc);
                  }

                  Class_wb.g.a(var7, var2 + -20386, var4);
                  return var7;
               }
            }
         }
      } catch (RuntimeException var9) {
         throw Class_sh.a(var9, "ha.D(" + var1 + ',' + var2 + ')');
      }
   }

   public Class_ha() {
      this.m = 1;
      this.p = 0;
      this.j = false;
      this.v = 0;
      this.H = 0;
      this.M = 0;
      this.t = 0;
      this.cb = 0;
      this.Q = -1;
      this.R = -1;
      this.tb = false;
      this.wb = 0;
      this.K = -1;
      this.L = 0;
      this.Gb = -1;
      this.k = false;
      this.P = 1;
      this.D = true;
      this.mb = 0;
      this.ob = 1;
      this.ib = 0;
      this.xb = -1;
      this.Nb = 0;
      this.Lb = 0;
      this.gb = 0;
      this.jc = -1;
      this.kc = 0;
      this.f = false;
      this.cc = 0;
      this.Sb = -1;
      this.Kb = -1;
      this.fb = false;
      this.Fb = 0;
      this.u = 0;
      this.Xb = 0;
      this.ab = 0;
      this.Vb = 0;
      this.hb = 0;
      this.i = false;
      this.kb = 0;
      this.uc = Class_qd.w;
      this.z = 0;
      this.dc = false;
      this.Ib = 0;
      this.Qb = false;
      this.hc = -1;
      this.V = -1;
      this.zc = 0;
      this.Pb = 1;
      this.Ec = Class_qd.w;
      this.vc = Class_qd.w;
      this.Rb = false;
      this.x = 0;
      this.Gc = 0;
      this.g = 100;
      this.Cb = -1;
      this.ub = 0;
      this.xc = 0;
      this.Nc = 0;
      this.Qc = -1;
      this.Ic = false;
      this.yb = 0;
      this.yc = Class_qd.w;
      this.Dc = 0;
      this.gc = false;
      this.db = 0;
      this.Sc = 0;
      this.nc = 0;
      this.qc = Class_nb.c;
      this.Mc = Class_qd.w;
      this.Xc = 0;
      this.ec = 0;
      this.A = 0;
      this.Mb = 0;
      this.Cc = 0;
      this.Uc = 0;
      this.tc = 0;
      this.Rc = 0;
      this.Tc = false;
      this.cd = 0;
      this.Yc = 0;
      this.Tb = 0;
      this.fc = 1;
      this.h = 0;
      this.Zb = 0;
      this.zb = -1;
      this.Pc = -1;
      this.Hc = null;
      this.dd = 0;
      this.rc = 0;
      this.ed = false;
      this.ac = -1;
   }
}
