import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

final class Class_j extends Class_lf {
   static Class_r Q = Class_tc.a(43, "cookiehost");
   static int R;
   private int S;
   static int[] T = new int[5];
   static int U;
   private int V;
   static int W;
   static int X;
   static Class_nj Y = new Class_nj(128);
   static int Z;
   static int ab;
   static int bb = 0;
   static int cb;
   static int db;
   private int eb;
   static boolean fb = false;
   static byte[][][] gb;

   static final void a(int var0, int var1, int var2, int var3, int var4, byte var5) {
      try {
         if (var5 > -58) {
            T = null;
         }

         Class_ob.Z[0].a(var3, var0);
         X++;
         Class_ob.Z[1].a(var3, var0 - (-var4 + 16));
         int var6 = (var4 - 32) * var4 / var2;
         if (var6 < 8) {
            var6 = 8;
         }

         int var7 = (-var6 + var4 + -32) * var1 / (var2 + -var4);
         Class_nc.f(var3, 16 + var0, 16, var4 - 32, Class_vd.e);
         Class_nc.f(var3, var7 + var0 + 16, 16, var6, Class_kk.p);
         Class_nc.e(var3, var0 + (16 - -var7), var6, Class_ff.y);
         Class_nc.e(1 + var3, var7 + 16 + var0, var6, Class_ff.y);
         Class_nc.d(var3, 16 + var0 + var7, 16, Class_ff.y);
         Class_nc.d(var3, 17 + var0 - -var7, 16, Class_ff.y);
         Class_nc.e(var3 - -15, var0 + 16 + var7, var6, Class_ab.V);
         Class_nc.e(var3 + 14, 17 + (var0 - -var7), -1 + var6, Class_ab.V);
         Class_nc.d(var3, var7 + 15 + var0 + var6, 16, Class_ab.V);
         Class_nc.d(var3 + 1, 14 + var0 + var7 + var6, 15, Class_ab.V);
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "j.V(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
      }
   }

   private final void b(byte var1, int var2) {
      try {
         Z++;
         this.V = var2 >> 973142724 & 4080;
         this.eb = (0xFF0000 & var2) >> 1082264972;
         this.S = 4080 & var2 << 725776228;
         if (var1 > -45) {
            this.a(64, true);
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "j.B(" + var1 + ',' + var2 + ')');
      }
   }

   public static void g(int var0) {
      try {
         gb = null;
         Q = null;
         T = null;
         Y = null;
         if (var0 >= -58) {
            fb = false;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "j.C(" + var0 + ')');
      }
   }

   public Class_j() {
      this(0);
   }

   static final void d(int var0, int var1, int var2) {
      Class_lh.cb = true;
      Class_ec.O = var0;
      Class_od.c = var1;
      Class_fh.R = var2;
      Class_tf.W = -1;
      Class_ng.q = -1;
   }

   static final Class_jb[] a(Class_cj var0, int var1, int var2, byte var3) {
      try {
         if (var3 != 13) {
            fb = true;
         }

         U++;
         return !Class_ve.a(-29381, var2, var0, var1) ? null : Class_ea.g(-21477);
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "j.D(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   private Class_j(int var1) {
      super(0, false);

      try {
         this.b((byte)-79, var1);
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "j.<init>(" + var1 + ')');
      }
   }

   static final void a(Class_wj var0, int var1) {
      try {
         Class_dd.a(var0, (byte)124, 200000);
         if (var1 != 16) {
            fb = true;
         }

         db++;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "j.U(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
      }
   }

   static final boolean a(int var0, int var1, int var2, int var3) {
      if (!Class_cj.c(var0, var1, var2)) {
         return false;
      } else {
         int var4 = var1 << 7;
         int var5 = var2 << 7;
         return Class_nj.a(var4 + 1, Class_mi.U[var0][var1][var2] + var3, var5 + 1)
            && Class_nj.a(var4 + 128 - 1, Class_mi.U[var0][var1 + 1][var2] + var3, var5 + 1)
            && Class_nj.a(var4 + 128 - 1, Class_mi.U[var0][var1 + 1][var2 + 1] + var3, var5 + 128 - 1)
            && Class_nj.a(var4 + 1, Class_mi.U[var0][var1][var2 + 1] + var3, var5 + 128 - 1);
      }
   }

   static final void a(Class_na var0, int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      int var8 = var0.q.length;

      for (int var9 = 0; var9 < var8; var9++) {
         int var10 = var0.q[var9] - Class_de.i;
         int var11 = var0.h[var9] - Class_n.q;
         int var12 = var0.n[var9] - Class_mi.W;
         int var13 = var12 * var3 + var10 * var4 >> 16;
         var12 = var12 * var4 - var10 * var3 >> 16;
         var13 = var11 * var2 - var12 * var1 >> 16;
         var12 = var11 * var1 + var12 * var2 >> 16;
         if (var12 < 50) {
            return;
         }

         if (var0.a != null) {
            Class_na.m[var9] = var13;
            Class_na.c[var9] = var13;
            Class_na.d[var9] = var12;
         }

         Class_na.k[var9] = Class_kd.n + (var13 << 9) / var12;
         Class_na.j[var9] = Class_kd.j + (var13 << 9) / var12;
      }

      Class_kd.c = 0;
      var8 = var0.f.length;

      for (int var23 = 0; var23 < var8; var23++) {
         int var24 = var0.f[var23];
         int var27 = var0.b[var23];
         int var29 = var0.r[var23];
         int var14 = Class_na.k[var24];
         int var15 = Class_na.k[var27];
         int var16 = Class_na.k[var29];
         int var17 = Class_na.j[var24];
         int var18 = Class_na.j[var27];
         int var19 = Class_na.j[var29];
         if ((var14 - var15) * (var19 - var18) - (var17 - var18) * (var16 - var15) > 0) {
            if (Class_lh.cb && Class_w.a(Class_od.c + Class_kd.n, Class_fh.R + Class_kd.j, var17, var18, var19, var14, var15, var16)) {
               Class_tf.W = var5;
               Class_ng.q = var6;
            }

            if (!var7) {
               Class_kd.g = false;
               if (var14 < 0 || var15 < 0 || var16 < 0 || var14 > Class_kd.r || var15 > Class_kd.r || var16 > Class_kd.r) {
                  Class_kd.g = true;
               }

               if (var0.a != null && var0.a[var23] != -1) {
                  if (Class_qd.G) {
                     if (var0.p) {
                        Class_kd.a(
                           var17,
                           var18,
                           var19,
                           var14,
                           var15,
                           var16,
                           var0.v[var23],
                           var0.u[var23],
                           var0.o[var23],
                           Class_na.m[0],
                           Class_na.m[1],
                           Class_na.m[3],
                           Class_na.c[0],
                           Class_na.c[1],
                           Class_na.c[3],
                           Class_na.d[0],
                           Class_na.d[1],
                           Class_na.d[3],
                           var0.a[var23]
                        );
                     } else {
                        Class_kd.a(
                           var17,
                           var18,
                           var19,
                           var14,
                           var15,
                           var16,
                           var0.v[var23],
                           var0.u[var23],
                           var0.o[var23],
                           Class_na.m[var24],
                           Class_na.m[var27],
                           Class_na.m[var29],
                           Class_na.c[var24],
                           Class_na.c[var27],
                           Class_na.c[var29],
                           Class_na.d[var24],
                           Class_na.d[var27],
                           Class_na.d[var29],
                           var0.a[var23]
                        );
                     }
                  } else {
                     int var20 = Class_kd.i.c(var0.a[var23], 6);
                     Class_kd.a(
                        var17,
                        var18,
                        var19,
                        var14,
                        var15,
                        var16,
                        Class_u.b(var20, var0.v[var23]),
                        Class_u.b(var20, var0.u[var23]),
                        Class_u.b(var20, var0.o[var23])
                     );
                  }
               } else if (var0.v[var23] != 12345678) {
                  Class_kd.a(var17, var18, var19, var14, var15, var16, var0.v[var23], var0.u[var23], var0.o[var23]);
               }
            }
         }
      }
   }

   final void a(Class_lh var1, int var2, int var3) {
      try {
         cb++;
         if (~var2 == -1) {
            this.b((byte)-84, var1.b((byte)-52));
         }

         if (var3 != -1) {
            fb = true;
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "j.K(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int[][] a(int var1, boolean var2) {
      int var8 = client.lb;

      try {
         if (!var2) {
            Y = null;
         }

         ab++;
         int[][] var3 = super.K.a(var1, (byte)-20);
         if (super.K.q) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = 0;
            if (var8 != 0 || ~var7 > ~Class_ld.X) {
               do {
                  var4[var7] = this.eb;
                  var5[var7] = this.V;
                  var6[var7] = this.S;
               } while (~(++var7) > ~Class_ld.X);
            }
         }

         return var3;
      } catch (RuntimeException var9) {
         throw Class_sh.a(var9, "j.A(" + var1 + ',' + var2 + ')');
      }
   }

   static final void a(int var0, Color var1, Class_r var2, boolean var3, int var4) {
      try {
         W++;

         try {
            Graphics var5 = Class_od.u.getGraphics();
            if (Class_bk.R == null) {
               Class_bk.R = new Font("Helvetica", 1, 13);
               Class_ud.b = Class_od.u.getFontMetrics(Class_bk.R);
            }

            if (var3) {
               var5.setColor(Color.black);
               var5.fillRect(0, 0, Class_l.u, Class_fk.R);
            }

            if (var1 == null) {
               var1 = new Color(140, 17, 17);
            }

            try {
               if (Class_p.l == null) {
                  Class_p.l = Class_od.u.createImage(304, 34);
               }

               if (var4 != 23189) {
                  a(125, -44, -120, -27);
               }

               Graphics var11 = Class_p.l.getGraphics();
               var11.setColor(var1);
               var11.drawRect(0, 0, 303, 33);
               var11.fillRect(2, 2, var0 * 3, 30);
               var11.setColor(Color.black);
               var11.drawRect(1, 1, 301, 31);
               var11.fillRect(3 * var0 + 2, 2, 300 + -(3 * var0), 30);
               var11.setFont(Class_bk.R);
               var11.setColor(Color.white);
               var2.a((-var2.a((byte)101, Class_ud.b) + 304) / 2, 22, var11, -42);
               var5.drawImage(Class_p.l, Class_l.u / 2 + -152, Class_fk.R / 2 - 18, null);
            } catch (Exception var8) {
               int var6 = Class_l.u / 2 + -152;
               int var7 = Class_fk.R / 2 + -18;
               var5.setColor(var1);
               var5.drawRect(var6, var7, 303, 33);
               var5.fillRect(var6 - -2, var7 - -2, var0 * 3, 30);
               var5.setColor(Color.black);
               var5.drawRect(var6 + 1, var7 + 1, 301, 31);
               var5.fillRect(3 * var0 + 2 + var6, 2 + var7, -(3 * var0) + 300, 30);
               var5.setFont(Class_bk.R);
               var5.setColor(Color.white);
               var2.a((-var2.a((byte)117, Class_ud.b) + 304) / 2 + var6, 22 + var7, var5, -85);
            }

            if (Class_dc.v != null) {
               var5.setFont(Class_bk.R);
               var5.setColor(Color.white);
               Class_dc.v.a(Class_l.u / 2 - Class_dc.v.a((byte)91, Class_ud.b) / 2, -26 + Class_fk.R / 2, var5, var4 ^ -23214);
            }
         } catch (Exception var9) {
            Class_od.u.repaint();
         }
      } catch (RuntimeException var10) {
         throw Class_sh.a(
            var10, "j.H(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + var4 + ')'
         );
      }
   }
}
