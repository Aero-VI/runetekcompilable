import java.awt.Image;
import java.io.EOFException;
import java.io.IOException;

final class Class_p {
   static Class_r a = Class_tc.a(43, "m-Ochte mit Ihnen handeln)3");
   private int b;
   static int c;
   private Class_wa d;
   static byte e = 0;
   private Class_wa f = null;
   private int g = 65000;
   static Class_r h = Class_tc.a(43, "(U1");
   static Class_r i = Class_tc.a(43, "(U3");
   static int j;
   static Class_r k = Class_tc.a(43, "<br>(X");
   static Image l;
   static int m;
   static int n;
   static int o;
   static int p;
   static int q;
   static int r;
   static int s;

   static final void a(int var0, int var1, int var2) {
      for (int var3 = 0; var3 < Class_od.r; var3++) {
         for (int var4 = 0; var4 < Class_ra.g; var4++) {
            for (int var5 = 0; var5 < Class_qb.m; var5++) {
               Class_aa var6 = Class_ck.d[var3][var4][var5];
               if (var6 != null) {
                  Class_kk var7 = var6.s;
                  if (var7 != null && var7.f.b()) {
                     Class_vj.a(var7.f, var3, var4, var5, 1, 1);
                     if (var7.i != null && var7.i.b()) {
                        Class_vj.a(var7.i, var3, var4, var5, 1, 1);
                        var7.f.a(var7.i, 0, 0, 0, false);
                        var7.i = var7.i.a(var0, var1, var2);
                     }

                     var7.f = var7.f.a(var0, var1, var2);
                  }

                  for (int var8 = 0; var8 < var6.G; var8++) {
                     Class_lj var9 = var6.H[var8];
                     if (var9 != null && var9.j.b()) {
                        Class_vj.a(var9.j, var3, var4, var5, var9.f - var9.v + 1, var9.b - var9.u + 1);
                        var9.j = var9.j.a(var0, var1, var2);
                     }
                  }

                  Class_hd var10 = var6.M;
                  if (var10 != null && var10.a.b()) {
                     Class_ec.a(var10.a, var3, var4, var5);
                     var10.a = var10.a.a(var0, var1, var2);
                  }
               }
            }
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, int var1, int var2, boolean var3, int var4, int var5) {
      int var25 = client.lb;

      try {
         s++;
         Class_fd.a(-var4 + var1, (byte)-17, var5, Class_qd.p[var2], var1 + var4);
         int var7 = var0;
         int var8 = var4 * var4;
         int var6 = 0;
         int var9 = var0 * var0;
         int var10 = var9 << -836368127;
         int var11 = var8 << -1735381023;
         int var12 = var0 << 669055585;
         if (!var3) {
            l = null;
         }

         int var13 = (1 - var12) * var8 - -var10;
         int var14 = -((-1 + var12) * var11) + var9;
         int var15 = var8 << 1641909666;
         int var16 = var9 << -1520285566;
         int var17 = (3 + (var6 << 2113626465)) * var10;
         int var20 = var15 * (var0 + -1);
         int var19 = (var6 - -1) * var16;
         int var18 = (-3 + (var0 << 159282273)) * var11;
         if (var25 != 0 || ~var0 < -1) {
            do {
               var7--;
               if (var13 < 0 && (var25 != 0 || var13 < 0)) {
                  do {
                     var6++;
                     var14 += var19;
                     var19 += var16;
                     var13 += var17;
                     var17 += var16;
                  } while (var13 < 0);
               }

               int var21 = -var7 + var2;
               if (~var14 > -1) {
                  var6++;
                  var14 += var19;
                  var13 += var17;
                  var17 += var16;
                  var19 += var16;
               }

               int var23 = var1 + var6;
               int var24 = var1 - var6;
               Class_fd.a(var24, (byte)-17, var5, Class_qd.p[var21], var23);
               var13 += -var20;
               var20 -= var15;
               var14 += -var18;
               var18 -= var15;
               int var22 = var2 + var7;
               Class_fd.a(var24, (byte)-17, var5, Class_qd.p[var22], var23);
            } while (~var7 < -1);
         }
      } catch (RuntimeException var26) {
         throw Class_sh.a(var26, "p.K(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var12 = client.lb;

      try {
         p++;
         Class_ai var10 = null;
         if (var1 != 0) {
            a(-51, 16, 10, 40, -61, null, null, null, null, null, null, -61, (byte)4, 55, -127);
         }

         Class_ai var11 = (Class_ai)Class_se.Z.e((byte)76);
         if (var12 != 0 || var11 != null) {
            do {
               if (var7 == var11.v && ~var0 == ~var11.x && ~var4 == ~var11.q && ~var3 == ~var11.s) {
                  var10 = var11;
                  break;
               }

               var11 = (Class_ai)Class_se.Z.c((byte)14);
            } while (var11 != null);
         }

         if (var10 == null) {
            var10 = new Class_ai();
            var10.s = var3;
            var10.x = var0;
            var10.v = var7;
            var10.q = var4;
            Class_ve.a(var10, true);
            Class_se.Z.a(var10, true);
         }

         var10.C = var2;
         var10.w = var5;
         var10.E = var9;
         var10.A = var8;
         var10.t = var6;
      } catch (RuntimeException var13) {
         throw Class_sh.a(
            var13, "p.I(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ')'
         );
      }
   }

   public static void a(byte var0) {
      try {
         i = null;
         l = null;
         k = null;
         if (var0 < 99) {
            b(124, 7, 65);
         }

         h = null;
         a = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "p.F(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private final boolean a(int var1, byte var2, int var3, byte[] var4, boolean var5) {
      int var17 = client.lb;

      try {
         o++;
         Class_wa var7 = this.f;
         synchronized (var7) {
            try {
               int var9;
               if (var5) {
                  if (this.d.b((byte)90) < var3 * 6 + 6) {
                     return false;
                  }

                  this.d.a(6 * var3, 1);
                  this.d.b(0, 6, 0, Class_vf.g);
                  var9 = (Class_vf.g[5] & 255) + ((Class_vf.g[4] & 255) << 33133832) + (0xFF0000 & Class_vf.g[3] << 1465956592);
                  if (~var9 >= -1 || var9 > this.f.b((byte)75) / 520L) {
                     return false;
                  }
               } else {
                  var9 = (int)((519L + this.f.b((byte)51)) / 520L);
                  if (~var9 == -1) {
                     var9 = 1;
                  }
               }

               Class_vf.g[1] = (byte)(var1 >> 1817621192);
               Class_vf.g[2] = (byte)var1;
               Class_vf.g[5] = (byte)var9;
               Class_vf.g[0] = (byte)(var1 >> 1069068976);
               Class_vf.g[3] = (byte)(var9 >> -1629510896);
               Class_vf.g[4] = (byte)(var9 >> -551024760);
               this.d.a(6 * var3, 1);
               this.d.a(6, 0, 0, Class_vf.g);
               int var11 = -90 % ((40 - var2) / 54);
               int var10 = 0;
               int var12 = 0;
               if (var17 != 0 || ~var1 < ~var10) {
                  do {
                     int var13 = 0;
                     if (var5) {
                        this.f.a(var9 * 520, 1);

                        try {
                           this.f.b(0, 8, 0, Class_vf.g);
                        } catch (EOFException var22) {
                           if (var17 == 0) {
                              break;
                           }
                        }

                        int var14 = ((Class_vf.g[0] & 255) << -765727032) - -(Class_vf.g[1] & 255);
                        var13 = (Class_vf.g[6] & 255) + (Class_vf.g[4] << -2029121968 & 0xFF0000) - -(0xFF00 & Class_vf.g[5] << -2088592632);
                        int var16 = Class_vf.g[7] & 255;
                        int var15 = ((255 & Class_vf.g[2]) << 202860296) - -(Class_vf.g[3] & 255);
                        if (var14 != var3 || var15 != var12 || this.b != var16) {
                           return false;
                        }

                        if (var13 < 0 || ~var13 < ~(this.f.b((byte)116) / 520L)) {
                           return false;
                        }
                     }

                     if (var13 == 0) {
                        var5 = false;
                        var13 = (int)((519L + this.f.b((byte)82)) / 520L);
                        if (~var13 == -1) {
                           var13++;
                        }

                        if (~var13 == ~var9) {
                           var13++;
                        }
                     }

                     Class_vf.g[0] = (byte)(var3 >> 527566472);
                     Class_vf.g[2] = (byte)(var12 >> 1676955592);
                     Class_vf.g[7] = (byte)this.b;
                     Class_vf.g[1] = (byte)var3;
                     if (~(var1 - var10) >= -513) {
                        var13 = 0;
                     }

                     Class_vf.g[6] = (byte)var13;
                     Class_vf.g[5] = (byte)(var13 >> -11962840);
                     Class_vf.g[3] = (byte)var12;
                     int var31 = var1 + -var10;
                     Class_vf.g[4] = (byte)(var13 >> -1151944720);
                     var12++;
                     if (var31 > 512) {
                        var31 = 512;
                     }

                     this.f.a(var9 * 520, 1);
                     this.f.a(8, 0, 0, Class_vf.g);
                     var9 = var13;
                     this.f.a(var31, 0, var10, var4);
                     var10 += var31;
                  } while (~var1 < ~var10);
               }

               return true;
            } catch (IOException var23) {
               return false;
            }
         }
      } catch (RuntimeException var25) {
         throw Class_sh.a(var25, "p.D(" + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ',' + var5 + ')');
      }
   }

   final boolean a(byte[] var1, int var2, int var3, byte var4) {
      try {
         n++;
         Class_wa var6 = this.f;
         boolean var5;
         synchronized (var6) {
            if (~var3 > -1 || this.g < var3) {
               throw new IllegalArgumentException();
            }

            boolean var8 = this.a(var3, (byte)123, var2, var1, true);
            if (!var8) {
               var8 = this.a(var3, (byte)-109, var2, var1, false);
            }

            int var9 = -116 % ((var4 - -61) / 47);
            var5 = var8;
         }

         return var5;
      } catch (RuntimeException var11) {
         throw Class_sh.a(var11, "p.G(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + var4 + ')');
      }
   }

   static final void a(
      int var0,
      int var1,
      int var2,
      int var3,
      int var4,
      byte[][][] var5,
      int[] var6,
      int[] var7,
      int[] var8,
      int[] var9,
      int[] var10,
      int var11,
      byte var12,
      int var13,
      int var14
   ) {
      if (var0 < 0) {
         var0 = 0;
      } else if (var0 >= Class_ra.g * 128) {
         var0 = Class_ra.g * 128 - 1;
      }

      if (var2 < 0) {
         var2 = 0;
      } else if (var2 >= Class_qb.m * 128) {
         var2 = Class_qb.m * 128 - 1;
      }

      Class_ke.v = Class_kd.e[var3];
      Class_lc.f = Class_kd.q[var3];
      Class_wh.i = Class_kd.e[var4];
      Class_c.z = Class_kd.q[var4];
      Class_de.i = var0;
      Class_n.q = var1;
      Class_mi.W = var2;
      Class_jb.ab = var0 / 128;
      Class_vg.x = var2 / 128;
      Class_lj.g = Class_jb.ab - Class_rd.Y;
      if (Class_lj.g < 0) {
         Class_lj.g = 0;
      }

      Class_oc.k = Class_vg.x - Class_rd.Y;
      if (Class_oc.k < 0) {
         Class_oc.k = 0;
      }

      Class_ed.j = Class_jb.ab + Class_rd.Y;
      if (Class_ed.j > Class_ra.g) {
         Class_ed.j = Class_ra.g;
      }

      Class_ng.u = Class_vg.x + Class_rd.Y;
      if (Class_ng.u > Class_qb.m) {
         Class_ng.u = Class_qb.m;
      }

      short var15 = 3500;

      for (int var16 = 0; var16 < Class_rd.Y + Class_rd.Y + 2; var16++) {
         for (int var17 = 0; var17 < Class_rd.Y + Class_rd.Y + 2; var17++) {
            int var18 = (var16 - Class_rd.Y << 7) - (Class_de.i & 127);
            int var19 = (var17 - Class_rd.Y << 7) - (Class_mi.W & 127);
            int var20 = Class_jb.ab - Class_rd.Y + var16;
            int var21 = Class_vg.x - Class_rd.Y + var17;
            if (var20 >= 0 && var21 >= 0 && var20 < Class_ra.g && var21 < Class_qb.m) {
               int var22;
               if (Class_ih.W != null) {
                  var22 = Class_ih.W[0][var20][var21] - Class_n.q + 128;
               } else {
                  var22 = Class_mg.l[0][var20][var21] - Class_n.q + 128;
               }

               int var23 = Class_mg.l[3][var20][var21] - Class_n.q - 1000;
               Class_la.cb[var16][var17] = Class_mi.a(var18, var23, var22, var19, var15);
            } else {
               Class_la.cb[var16][var17] = false;
            }
         }
      }

      for (int var24 = 0; var24 < Class_rd.Y + Class_rd.Y + 1; var24++) {
         for (int var25 = 0; var25 < Class_rd.Y + Class_rd.Y + 1; var25++) {
            Class_kc.v[var24][var25] = Class_la.cb[var24][var25]
               || Class_la.cb[var24 + 1][var25]
               || Class_la.cb[var24][var25 + 1]
               || Class_la.cb[var24 + 1][var25 + 1];
         }
      }

      Class_hj.X = var6;
      Class_qd.u = var7;
      Class_uc.k = var8;
      Class_md.x = var9;
      Class_ig.f = var10;
      Class_gj.a();
      Class_ch.a(var0, var1, var2, var5, var11, var12, var13, var14);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void b(byte var0) {
      int var7 = client.lb;

      try {
         if (var0 >= -1) {
            a(125, 31, 8, true, -92, -128);
         }

         int var1 = 0;
         if (var7 == 0 && var1 >= Class_uf.U) {
            m++;
         } else {
            do {
               int var2 = Class_cc.Db[var1];
               Class_eh var3 = Class_rf.a[var2];
               int var4 = Class_f.T.n(-6677);
               if (~(var4 & 16) != -1) {
                  var3.x = Class_f.T.k(1355769544);
                  if (var3.x == 65535) {
                     var3.x = -1;
                  }
               }

               if (~(var4 & 8) != -1) {
                  if (var3.Pb.a(0)) {
                     Class_db.a(var3, 2);
                  }

                  var3.Pb = Class_i.c(Class_f.T.d(119), 18);
                  var3.C = var3.Pb.d;
                  var3.lb = var3.Pb.jb;
                  var3.ub = var3.Pb.P;
                  var3.P = var3.Pb.I;
                  var3.E = var3.Pb.e;
                  var3.kb = var3.Pb.p;
                  var3.Bb = var3.Pb.Y;
                  var3.Q = var3.Pb.T;
                  var3.jb = var3.Pb.j;
                  if (var3.Pb.a(0)) {
                     Class_id.a(19395, var3.qb[0], var3, null, 0, var3.v[0], Class_jk.F, null);
                  }
               }

               if ((64 & var4) != 0) {
                  var3.wb = Class_f.T.e(127);
                  var3.pb = 100;
               }

               if (~(var4 & 1) != -1) {
                  int var5 = Class_f.T.g(-15046);
                  if (var5 == 65535) {
                     var5 = -1;
                  }

                  int var6 = Class_f.T.n(-6677);
                  Class_rc.a(0, var5, var3, var6);
               }

               if ((var4 & 2) != 0) {
                  var3.Y = Class_f.T.g(-15046);
                  int var9 = Class_f.T.d(false);
                  var3.N = (var9 & 65535) + Class_be.C;
                  var3.Gb = 0;
                  if (var3.Y == 65535) {
                     var3.Y = -1;
                  }

                  var3.gb = var9 >> 1453284944;
                  var3.yb = 0;
                  if (Class_be.C < var3.N) {
                     var3.yb = -1;
                  }
               }

               if (~(32 & var4) != -1) {
                  int var10 = Class_f.T.n(-6677);
                  int var12 = Class_f.T.m(70);
                  var3.a(var10, false, Class_be.C, var12);
               }

               if (~(var4 & 128) != -1) {
                  var3.y = Class_f.T.g(-15046);
                  var3.sb = Class_f.T.e((byte)-47);
               }

               if (~(4 & var4) != -1) {
                  int var11 = Class_f.T.n(-6677);
                  int var13 = Class_f.T.n(-6677);
                  var3.a(var11, false, Class_be.C, var13);
                  var3.G = Class_be.C + 300;
                  var3.T = Class_f.T.m(101);
               }
            } while (++var1 < Class_uf.U);

            m++;
         }
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "p.J(" + var0 + ')');
      }
   }

   public final String toString() {
      try {
         r++;
         return "Cache:" + this.b;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "p.toString(" + ')');
      }
   }

   static final long b(int var0, int var1, int var2) {
      Class_aa var3 = Class_ck.d[var0][var1][var2];
      return var3 != null && var3.M != null ? var3.M.m : 0L;
   }

   final byte[] a(int var1, boolean var2) {
      try {
         q++;
         Class_wa var4 = this.f;
         synchronized (var4) {
            try {
               if (this.d.b((byte)101) < 6 + var1 * 6) {
                  return null;
               } else {
                  this.d.a(var1 * 6, 1);
                  this.d.b(0, 6, 0, Class_vf.g);
                  int var6 = (Class_vf.g[1] << -503326744 & 0xFF00) + (((Class_vf.g[0] & 255) << -1643323344) - -(255 & Class_vf.g[2]));
                  int var7 = (Class_vf.g[5] & 255) + (Class_vf.g[3] << -1717736080 & 0xFF0000) + ((Class_vf.g[4] & 255) << 1834419496);
                  if (!var2) {
                     return null;
                  } else if (~var6 > -1 || this.g < var6) {
                     return null;
                  } else if (var7 <= 0 || ~(this.f.b((byte)104) / 520L) > ~var7) {
                     return null;
                  } else {
                     byte[] var8 = new byte[var6];
                     int var9 = 0;

                     for (int var10 = 0; var6 > var9; var10++) {
                        if (var7 == 0) {
                           return null;
                        }

                        this.f.a(520 * var7, 1);
                        int var11 = var6 + -var9;
                        if (var11 > 512) {
                           var11 = 512;
                        }

                        this.f.b(0, var11 + 8, 0, Class_vf.g);
                        int var14 = (255 & Class_vf.g[6]) + ((0xFF0000 & Class_vf.g[4] << -600163600) - -(0xFF00 & Class_vf.g[5] << -554764568));
                        int var12 = ((Class_vf.g[0] & 255) << -974042584) - -(255 & Class_vf.g[1]);
                        int var13 = (255 & Class_vf.g[3]) + ((255 & Class_vf.g[2]) << -1322389528);
                        int var15 = 255 & Class_vf.g[7];
                        if (var12 != var1 || var13 != var10 || ~this.b != ~var15) {
                           return null;
                        }

                        if (var14 < 0 || var14 > this.f.b((byte)67) / 520L) {
                           return null;
                        }

                        var7 = var14;

                        for (int var16 = 0; ~var11 < ~var16; var16++) {
                           var8[var9++] = Class_vf.g[var16 - -8];
                        }
                     }

                     return var8;
                  }
               }
            } catch (IOException var20) {
               return null;
            }
         }
      } catch (RuntimeException var22) {
         throw Class_sh.a(var22, "p.A(" + var1 + ',' + var2 + ')');
      }
   }

   static final byte[] a(byte[] var0, boolean var1) {
      try {
         int var2 = var0.length;
         c++;
         byte[] var3 = new byte[var2];
         if (var1) {
            a(null, true);
         }

         Class_gb.a(var0, 0, var3, 0, var2);
         return var3;
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "p.C(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
      }
   }

   Class_p(int var1, Class_wa var2, Class_wa var3, int var4) {
      this.d = null;

      try {
         this.b = var1;
         this.g = var4;
         this.d = var3;
         this.f = var2;
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "p.<init>(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + (var3 != null ? "{...}" : "null") + ',' + var4 + ')');
      }
   }
}
