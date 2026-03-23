import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

final class Class_jk implements Runnable {
   private boolean a = false;
   static int b;
   static int c;
   private Class_ei d;
   static int e;
   private Socket f;
   private int g = 0;
   static int h;
   static int i;
   private InputStream j;
   static int[] k = new int[99];
   static int l;
   private OutputStream m;
   private Class_ik n;
   private boolean o = false;
   static int p;
   private int q = 0;
   static int r;
   static int s;
   static int t;
   static int u;
   static Class_r[] v;
   static int w;
   static Class_r x;
   static boolean[] y;
   static long z;
   static Class_jb A;
   private byte[] B;
   static Class_r C;
   static Class_r D;
   static Class_r E;
   static int F;
   static int G;

   protected final void finalize() {
      try {
         this.b(-120);
         c++;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "jk.finalize(" + ')');
      }
   }

   final void a(int var1, byte var2, int var3, byte[] var4) throws IOException {
      try {
         G++;
         if (!this.o) {
            if (this.a) {
               this.a = false;
               throw new IOException();
            } else if (var2 >= 23) {
               if (this.B == null) {
                  this.B = new byte[5000];
               }

               synchronized (this) {
                  for (int var7 = 0; ~var7 > ~var3; var7++) {
                     this.B[this.q] = var4[var7 + var1];
                     this.q = (1 + this.q) % 5000;
                     if (~((this.g - -4900) % 5000) == ~this.q) {
                        throw new IOException();
                     }
                  }

                  if (this.d == null) {
                     this.d = this.n.a((byte)-89, 3, this);
                  }

                  this.notifyAll();
               }
            }
         }
      } catch (RuntimeException var9) {
         throw Class_sh.a(var9, "jk.F(" + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ')');
      }
   }

   public final void run() {
      int var5 = client.lb;

      try {
         try {
            while (true) {
               int var1;
               int var2;
               synchronized (this) {
                  label125: {
                     if (this.g == this.q) {
                        if (this.o) {
                           break;
                        }

                        try {
                           this.wait();
                        } catch (InterruptedException var16) {
                        }
                     }

                     var2 = this.g;
                     if (~this.q > ~this.g) {
                        var1 = -this.g + 5000;
                        if (var5 == 0) {
                           break label125;
                        }
                     }

                     var1 = -this.g + this.q;
                  }
               }

               if (~var1 < -1) {
                  try {
                     this.m.write(this.B, var2, var1);
                  } catch (IOException var15) {
                     this.a = true;
                  }

                  this.g = (var1 + this.g) % 5000;

                  try {
                     if (this.q == this.g) {
                        this.m.flush();
                     }
                  } catch (IOException var14) {
                     this.a = true;
                  }
               }
            }

            try {
               if (this.j != null) {
                  this.j.close();
               }

               if (this.m != null) {
                  this.m.close();
               }

               if (this.f != null) {
                  this.f.close();
               }
            } catch (IOException var13) {
            }

            this.B = null;
         } catch (Exception var18) {
            Class_mc.a(null, var18, 38);
         }

         e++;
      } catch (RuntimeException var19) {
         throw Class_sh.a(var19, "jk.run(" + ')');
      }
   }

   final void a(int var1, int var2, int var3, byte[] var4) throws IOException {
      try {
         w++;
         int var5 = 74 % ((var1 - 47) / 41);
         if (!this.o) {
            while (var2 > 0) {
               int var6 = this.j.read(var4, var3, var2);
               if (~var6 >= -1) {
                  throw new EOFException();
               }

               var2 -= var6;
               var3 += var6;
            }
         }
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "jk.J(" + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, Class_cj var1) {
      int var11 = client.lb;

      try {
         p++;
         Class_sc.e = Class_ke.a(var1, Class_pe.z, 0, -122);
         Class_tc.j = new Class_dh[Class_sc.e.length];
         Class_ld.W = new Class_dh[Class_sc.e.length];
         Class_w.I = new Class_dh[Class_sc.e.length];
         int var2 = 0;
         if (var11 != 0) {
            Class_sc.e[var2].a();
            Class_tc.j[var2] = Class_sc.e[var2].b();
            Class_sc.e[var2].a();
            Class_ld.W[var2] = Class_sc.e[var2].b();
            Class_sc.e[var2].a();
            Class_w.I[var2] = Class_sc.e[var2].b();
            Class_sc.e[var2].a();
            var2++;
         }

         while (~Class_sc.e.length < ~var2) {
            Class_sc.e[var2].a();
            Class_tc.j[var2] = Class_sc.e[var2].b();
            Class_sc.e[var2].a();
            Class_ld.W[var2] = Class_sc.e[var2].b();
            Class_sc.e[var2].a();
            Class_w.I[var2] = Class_sc.e[var2].b();
            Class_sc.e[var2].a();
            var2++;
         }

         Class_lh.yb = Class_ng.a(false, Class_vg.t, 0, var1);
         Class_ob.V = Class_wg.a(0, Class_hh.l, 0, var1);
         Class_md.y = Class_wg.a(0, Class_ca.b, 0, var1);
         Class_jg.g = Class_wg.a(var0 + -12339, Class_j.R, 0, var1);
         Class_si.e = Class_wg.a(0, Class_tg.b, 0, var1);
         Class_ia.ib = Class_j.a(var1, 0, Class_qe.w, (byte)13);
         Class_mb.x = Class_j.a(var1, 0, Class_jc.B, (byte)13);
         Class_w.R = Class_uh.a(var0 + -12275, Class_ra.p, 0, var1);
         Class_fg.j = Class_j.a(var1, 0, Class_vi.U, (byte)13);
         Class_tc.g = Class_j.a(var1, 0, Class_pi.U, (byte)13);
         Class_ob.Z = Class_dj.a(var1, 0, false, Class_rd.S);
         if (var0 == 12339) {
            Class_lh.Cb = Class_dj.a(var1, 0, false, Class_bj.i);
            Class_ma.gb.a(Class_lh.Cb, null);
            Class_fi.A.a(Class_lh.Cb, null);
            Class_db.sb.a(Class_lh.Cb, null);
            Class_ni var3 = Class_qd.a(Class_qb.k, (byte)-96, var1, 0);
            var3.d();
            Class_ub.jb = var3;
            Class_ni[] var4 = Class_ng.a(false, Class_qb.e, 0, var1);
            int var5 = 0;
            if (var11 != 0) {
               var4[var5].d();
               var5++;
            }

            while (~var4.length < ~var5) {
               var4[var5].d();
               var5++;
            }

            Class_of.o = var4;
            int var6 = -10 + (int)(21.0 * Math.random());
            int var7 = (int)(21.0 * Math.random()) - 10;
            int var8 = -10 + (int)(Math.random() * 21.0);
            int var9 = (int)(41.0 * Math.random()) - 20;
            int var10 = 0;
            if (var11 != 0) {
               Class_lh.yb[var10].b(var6 + var9, var7 + var9, var9 + var8);
               var10++;
            }

            while (Class_lh.yb.length > var10) {
               Class_lh.yb[var10].b(var6 + var9, var7 + var9, var9 + var8);
               var10++;
            }

            Class_sc.e[0].b(var6 + var9, var9 + var7, var8 + var9);
            Class_i.X = Class_lh.yb;
         }
      } catch (RuntimeException var12) {
         throw Class_sh.a(var12, "jk.A(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   final int a(int var1) throws IOException {
      try {
         h++;
         if (this.o) {
            return 0;
         } else {
            return var1 <= 38 ? 120 : this.j.read();
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "jk.E(" + var1 + 41);
      }
   }

   final void b(int var1) {
      try {
         t++;
         if (var1 > -2) {
            C = null;
         }

         if (!this.o) {
            synchronized (this) {
               this.o = true;
               this.notifyAll();
            }

            if (this.d != null) {
               while (~this.d.b == -1) {
                  Class_hg.a(-5, 1L);
               }

               if (this.d.b == 1) {
                  try {
                     ((Thread)this.d.e).join();
                  } catch (InterruptedException var6) {
                  }
               }
            }

            this.d = null;
         }
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "jk.H(" + var1 + ')');
      }
   }

   static final void a(int var0, int var1, int var2, int var3, int var4) {
      try {
         if (var0 == -6) {
            if (var4 <= var2) {
               for (int var5 = var4; ~var2 < ~var5; var5++) {
                  Class_qd.p[var5][var1] = var3;
               }
            } else {
               for (int var7 = var2; var4 > var7; var7++) {
                  Class_qd.p[var7][var1] = var3;
               }
            }

            b++;
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "jk.G(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
      }
   }

   static final void c(int var0) {
      try {
         i++;
         Class_he.a((byte)-120);
         Class_md.a((byte)-79);
         Class_ia.a(true);
         Class_me.b(var0 ^ -57);
         Class_oe.a(76);
         Class_hd.b((byte)124);
         Class_gj.d(var0);
         Class_a.a(var0 ^ -7816);
         Class_ae.a(var0 + -26678);
         Class_hk.h(var0 + 5698);
         Class_sg.i(127);
         Class_hj.g(7);
         Class_qb.b(122);
         Class_lk.d(var0 ^ 35);
         Class_si.d.a(var0 + 127);
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "jk.B(" + var0 + ')');
      }
   }

   final int a(byte var1) throws IOException {
      try {
         l++;
         if (var1 != 102) {
            a(53, 70, 102, -56, 118);
         }

         return this.o ? 0 : this.j.available();
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "jk.C(" + var1 + 41);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void d(int var0) {
      int var14 = client.lb;

      try {
         boolean var1 = true;
         r++;
         Class_dj.a(-12915, false);
         Class_ld.Z = 0;
         int var2 = 0;
         if (var14 != 0) {
            if (~Class_pj.g[var2] != 0 && Class_d.b[var2] == null) {
               Class_d.b[var2] = Class_pc.a.a(0, 0, Class_pj.g[var2]);
               if (Class_d.b[var2] == null) {
                  Class_ld.Z++;
                  var1 = false;
               }
            }

            if (Class_s.cb[var2] != -1 && Class_kj.T[var2] == null) {
               Class_kj.T[var2] = Class_pc.a.a(Class_fe.Z[var2], Class_s.cb[var2], 0, (byte)-28);
               if (Class_kj.T[var2] == null) {
                  var1 = false;
                  Class_ld.Z++;
               }
            }

            if (Class_nd.a != null && Class_aj.q[var2] == null && ~Class_nd.a[var2] != 0) {
               Class_aj.q[var2] = Class_pc.a.a(Class_fe.Z[var2], Class_nd.a[var2], 0, (byte)115);
               if (Class_aj.q[var2] == null) {
                  var1 = false;
                  Class_ld.Z++;
               }
            }

            var2++;
         }

         for (; ~var2 > ~Class_d.b.length; var2++) {
            if (~Class_pj.g[var2] != 0 && Class_d.b[var2] == null) {
               Class_d.b[var2] = Class_pc.a.a(0, 0, Class_pj.g[var2]);
               if (Class_d.b[var2] == null) {
                  Class_ld.Z++;
                  var1 = false;
               }
            }

            if (Class_s.cb[var2] != -1 && Class_kj.T[var2] == null) {
               Class_kj.T[var2] = Class_pc.a.a(Class_fe.Z[var2], Class_s.cb[var2], 0, (byte)-28);
               if (Class_kj.T[var2] == null) {
                  var1 = false;
                  Class_ld.Z++;
               }
            }

            if (Class_nd.a != null && Class_aj.q[var2] == null && ~Class_nd.a[var2] != 0) {
               Class_aj.q[var2] = Class_pc.a.a(Class_fe.Z[var2], Class_nd.a[var2], 0, (byte)115);
               if (Class_aj.q[var2] == null) {
                  var1 = false;
                  Class_ld.Z++;
               }
            }
         }

         label553: {
            if (Class_qb.a == null || !Class_ec.K.a((byte)-101, Class_o.a(2, new Class_r[]{Class_qb.a.O, Class_mc.i}))) {
               Class_ma.T = null;
               if (var14 == 0) {
                  break label553;
               }
            }

            if (!Class_ec.K.a(0, Class_o.a(2, new Class_r[]{Class_qb.a.O, Class_mc.i}))) {
               Class_ld.Z++;
               var1 = false;
               if (var14 == 0) {
                  break label553;
               }
            }

            Class_ma.T = Class_pa.a(Class_o.a(2, new Class_r[]{Class_qb.a.O, Class_mc.i}), 12666, Class_ec.K);
         }

         if (!var1) {
            Class_cj.gb = 1;
         } else {
            Class_ha.nd = 0;
            var1 = true;
            int var3 = 0;
            if (var14 != 0) {
               byte[] var4 = Class_kj.T[var3];
               if (var4 != null) {
                  int var5 = -Class_fj.e + (Class_uh.e[var3] >> -1503568216) * 64;
                  int var6 = -Class_va.ab + (0xFF & Class_uh.e[var3]) * 64;
                  if (Class_fj.b) {
                     var5 = 10;
                     var6 = 10;
                  }

                  var1 &= Class_tb.a(var4, -32692, var6, var5);
               }

               var3++;
            }

            for (; ~Class_d.b.length < ~var3; var3++) {
               byte[] var17 = Class_kj.T[var3];
               if (var17 != null) {
                  int var19 = -Class_fj.e + (Class_uh.e[var3] >> -1503568216) * 64;
                  int var21 = -Class_va.ab + (0xFF & Class_uh.e[var3]) * 64;
                  if (Class_fj.b) {
                     var19 = 10;
                     var21 = 10;
                  }

                  var1 &= Class_tb.a(var17, -32692, var21, var19);
               }
            }

            if (!var1) {
               Class_cj.gb = 2;
            } else {
               if (Class_cj.gb != 0) {
                  Class_mg.a(true, Class_o.a(2, new Class_r[]{Class_ld.T, Class_rc.g}), -16678);
               }

               if (var0 < 78) {
                  a(113, 66, -49, 57, 30);
               }

               Class_hf.c(16322);
               Class_cc.t(137);
               Class_db.a();
               int var18 = 0;
               if (var14 != 0 || ~var18 > -5) {
                  do {
                     Class_sj.j[var18].a(false);
                  } while (~(++var18) > -5);
               }

               int var20 = 0;
               if (var14 == 0 && var20 >= 4) {
                  Class_ab.b(0, false);
                  Class_hf.c(16322);
                  System.gc();
                  Class_dj.a(-12915, true);
                  Class_c.a(false, -1261);
                  if (!Class_fj.b) {
                     Class_hf.a(false, false);
                     Class_dj.a(-12915, true);
                     Class_gg.b(false, (byte)84);
                     if (Class_aj.q != null) {
                        Class_oe.d((byte)-110);
                     }
                  }

                  if (Class_fj.b) {
                     Class_li.a(false, (byte)-32);
                     Class_dj.a(-12915, true);
                     Class_te.a((byte)-124, false);
                  }

                  Class_cc.t(137);
                  Class_dj.a(-12915, true);
                  Class_th.a((byte)-111, false, Class_sj.j);
                  Class_dj.a(-12915, true);
                  int var25 = Class_v.z;
                  if (~F > ~var25) {
                     var25 = F;
                  }

                  if (~(F + -1) < ~var25) {
                     var25 = -1 + F;
                  }

                  label285: {
                     if (!Class_e.a(24781)) {
                        Class_qe.d(Class_v.z);
                        if (var14 == 0) {
                           break label285;
                        }
                     }

                     Class_qe.d(0);
                  }

                  Class_vf.a(108);
                  int var28 = 0;
                  int var31;
                  if (var14 != 0) {
                     var31 = 0;
                     if (var14 != 0) {
                        Class_ic.a(var28, (byte)-52, var31);
                        var31++;
                     }
                  } else {
                     if (var28 >= 104) {
                        Class_sh.c(-13401);
                        Class_hf.c(16322);
                        Class_fd.a(-28968);
                        Class_cc.t(137);
                        if (Class_si.i != null && Class_wf.k != null && Class_ua.b == 25) {
                           Class_cj.S.o(-63, 22);
                           Class_cj.S.g(544537784, 1057001181);
                           Class_wi.hb++;
                        }

                        if (!Class_fj.b) {
                           var31 = (-6 + Class_cf.M) / 8;
                           int var39 = (Class_gk.b - 6) / 8;
                           int var36 = (6 + Class_cf.M) / 8;
                           int var42 = (6 + Class_gk.b) / 8;
                           int var45 = var31 + -1;
                           if (var14 != 0 || var45 <= 1 + var36) {
                              do {
                                 int var48 = var39 - 1;
                                 if (var14 != 0 || var48 <= 1 + var42) {
                                    do {
                                       if (var31 <= var45 && var45 <= var36 && ~var39 >= ~var48 && ~var42 <= ~var48) {
                                          var48++;
                                       } else {
                                          Class_pc.a.a(Class_o.a(2, new Class_r[]{Class_nk.c, Class_og.b(var45, 0), Class_ec.M, Class_og.b(var48, 0)}), 118);
                                          Class_pc.a.a(Class_o.a(2, new Class_r[]{Class_uf.ab, Class_og.b(var45, 0), Class_ec.M, Class_og.b(var48, 0)}), 114);
                                          var48++;
                                       }
                                    } while (var48 <= 1 + var42);
                                 }
                              } while (++var45 <= 1 + var36);
                           }
                        }

                        label348: {
                           if (Class_ua.b != 28) {
                              Class_ca.a(30, (byte)-77);
                              if (Class_wf.k == null) {
                                 break label348;
                              }

                              Class_cj.S.o(64, 60);
                              if (var14 == 0) {
                                 break label348;
                              }
                           }

                           Class_ca.a(10, (byte)-128);
                        }

                        Class_hf.c(16322);
                        Class_ch.b((byte)105);
                        return;
                     }

                     var31 = 0;
                     if (var14 != 0) {
                        Class_ic.a(var28, (byte)-52, var31);
                        var31++;
                     }
                  }

                  while (true) {
                     while (~var31 > -105) {
                        Class_ic.a(var28, (byte)-52, var31);
                        var31++;
                     }

                     if (++var28 >= 104) {
                        Class_sh.c(-13401);
                        Class_hf.c(16322);
                        Class_fd.a(-28968);
                        Class_cc.t(137);
                        if (Class_si.i != null && Class_wf.k != null && Class_ua.b == 25) {
                           Class_cj.S.o(-63, 22);
                           Class_cj.S.g(544537784, 1057001181);
                           Class_wi.hb++;
                        }

                        if (!Class_fj.b) {
                           var31 = (-6 + Class_cf.M) / 8;
                           int var38 = (Class_gk.b - 6) / 8;
                           int var35 = (6 + Class_cf.M) / 8;
                           int var41 = (6 + Class_gk.b) / 8;
                           int var44 = var31 + -1;
                           if (var14 != 0 || var44 <= 1 + var35) {
                              do {
                                 int var47 = var38 - 1;
                                 if (var14 != 0 || var47 <= 1 + var41) {
                                    do {
                                       if (var31 <= var44 && var44 <= var35 && ~var38 >= ~var47 && ~var41 <= ~var47) {
                                          var47++;
                                       } else {
                                          Class_pc.a.a(Class_o.a(2, new Class_r[]{Class_nk.c, Class_og.b(var44, 0), Class_ec.M, Class_og.b(var47, 0)}), 118);
                                          Class_pc.a.a(Class_o.a(2, new Class_r[]{Class_uf.ab, Class_og.b(var44, 0), Class_ec.M, Class_og.b(var47, 0)}), 114);
                                          var47++;
                                       }
                                    } while (var47 <= 1 + var41);
                                 }
                              } while (++var44 <= 1 + var35);
                           }
                        }

                        label417: {
                           if (Class_ua.b != 28) {
                              Class_ca.a(30, (byte)-77);
                              if (Class_wf.k == null) {
                                 break label417;
                              }

                              Class_cj.S.o(64, 60);
                              if (var14 == 0) {
                                 break label417;
                              }
                           }

                           Class_ca.a(10, (byte)-128);
                        }

                        Class_hf.c(16322);
                        Class_ch.b((byte)105);
                        return;
                     }

                     var31 = 0;
                     if (var14 != 0) {
                        Class_ic.a(var28, (byte)-52, var31);
                        var31++;
                     }
                  }
               } else {
                  do {
                     int var22 = 0;
                     int var7;
                     if (var14 != 0) {
                        var7 = 0;
                        if (var14 != 0) {
                           Class_kk.c[var20][var22][var7] = 0;
                           var7++;
                        }
                     } else {
                        if (~var22 <= -105) {
                           continue;
                        }

                        var7 = 0;
                        if (var14 != 0) {
                           Class_kk.c[var20][var22][var7] = 0;
                           var7++;
                        }
                     }

                     while (true) {
                        while (var7 < 104) {
                           Class_kk.c[var20][var22][var7] = 0;
                           var7++;
                        }

                        if (~(++var22) <= -105) {
                           break;
                        }

                        var7 = 0;
                        if (var14 != 0) {
                           Class_kk.c[var20][var22][var7] = 0;
                           var7++;
                        }
                     }
                  } while (++var20 < 4);

                  Class_ab.b(0, false);
                  Class_hf.c(16322);
                  System.gc();
                  Class_dj.a(-12915, true);
                  Class_c.a(false, -1261);
                  if (!Class_fj.b) {
                     Class_hf.a(false, false);
                     Class_dj.a(-12915, true);
                     Class_gg.b(false, (byte)84);
                     if (Class_aj.q != null) {
                        Class_oe.d((byte)-110);
                     }
                  }

                  if (Class_fj.b) {
                     Class_li.a(false, (byte)-32);
                     Class_dj.a(-12915, true);
                     Class_te.a((byte)-124, false);
                  }

                  Class_cc.t(137);
                  Class_dj.a(-12915, true);
                  Class_th.a((byte)-111, false, Class_sj.j);
                  Class_dj.a(-12915, true);
                  int var23 = Class_v.z;
                  if (~F > ~var23) {
                     var23 = F;
                  }

                  if (~(F + -1) < ~var23) {
                     var23 = -1 + F;
                  }

                  label162: {
                     if (!Class_e.a(24781)) {
                        Class_qe.d(Class_v.z);
                        if (var14 == 0) {
                           break label162;
                        }
                     }

                     Class_qe.d(0);
                  }

                  Class_vf.a(108);
                  int var27 = 0;
                  int var8;
                  if (var14 != 0) {
                     var8 = 0;
                     if (var14 != 0) {
                        Class_ic.a(var27, (byte)-52, var8);
                        var8++;
                     }
                  } else {
                     if (var27 >= 104) {
                        Class_sh.c(-13401);
                        Class_hf.c(16322);
                        Class_fd.a(-28968);
                        Class_cc.t(137);
                        if (Class_si.i != null && Class_wf.k != null && Class_ua.b == 25) {
                           Class_cj.S.o(-63, 22);
                           Class_cj.S.g(544537784, 1057001181);
                           Class_wi.hb++;
                        }

                        if (!Class_fj.b) {
                           var8 = (-6 + Class_cf.M) / 8;
                           int var37 = (Class_gk.b - 6) / 8;
                           int var34 = (6 + Class_cf.M) / 8;
                           int var40 = (6 + Class_gk.b) / 8;
                           int var43 = var8 + -1;
                           if (var14 != 0 || var43 <= 1 + var34) {
                              do {
                                 int var46 = var37 - 1;
                                 if (var14 != 0 || var46 <= 1 + var40) {
                                    do {
                                       if (var8 <= var43 && var43 <= var34 && ~var37 >= ~var46 && ~var40 <= ~var46) {
                                          var46++;
                                       } else {
                                          Class_pc.a.a(Class_o.a(2, new Class_r[]{Class_nk.c, Class_og.b(var43, 0), Class_ec.M, Class_og.b(var46, 0)}), 118);
                                          Class_pc.a.a(Class_o.a(2, new Class_r[]{Class_uf.ab, Class_og.b(var43, 0), Class_ec.M, Class_og.b(var46, 0)}), 114);
                                          var46++;
                                       }
                                    } while (var46 <= 1 + var40);
                                 }
                              } while (++var43 <= 1 + var34);
                           }
                        }

                        label221: {
                           if (Class_ua.b != 28) {
                              Class_ca.a(30, (byte)-77);
                              if (Class_wf.k == null) {
                                 break label221;
                              }

                              Class_cj.S.o(64, 60);
                              if (var14 == 0) {
                                 break label221;
                              }
                           }

                           Class_ca.a(10, (byte)-128);
                        }

                        Class_hf.c(16322);
                        Class_ch.b((byte)105);
                        return;
                     }

                     var8 = 0;
                     if (var14 != 0) {
                        Class_ic.a(var27, (byte)-52, var8);
                        var8++;
                     }
                  }

                  while (true) {
                     while (~var8 > -105) {
                        Class_ic.a(var27, (byte)-52, var8);
                        var8++;
                     }

                     if (++var27 >= 104) {
                        Class_sh.c(-13401);
                        Class_hf.c(16322);
                        Class_fd.a(-28968);
                        Class_cc.t(137);
                        if (Class_si.i != null && Class_wf.k != null && Class_ua.b == 25) {
                           Class_cj.S.o(-63, 22);
                           Class_cj.S.g(544537784, 1057001181);
                           Class_wi.hb++;
                        }

                        if (!Class_fj.b) {
                           var8 = (-6 + Class_cf.M) / 8;
                           int var10 = (Class_gk.b - 6) / 8;
                           int var9 = (6 + Class_cf.M) / 8;
                           int var11 = (6 + Class_gk.b) / 8;
                           int var12 = var8 + -1;
                           if (var14 != 0 || var12 <= 1 + var9) {
                              do {
                                 int var13 = var10 - 1;
                                 if (var14 != 0 || var13 <= 1 + var11) {
                                    do {
                                       if (var8 <= var12 && var12 <= var9 && ~var10 >= ~var13 && ~var11 <= ~var13) {
                                          var13++;
                                       } else {
                                          Class_pc.a.a(Class_o.a(2, new Class_r[]{Class_nk.c, Class_og.b(var12, 0), Class_ec.M, Class_og.b(var13, 0)}), 118);
                                          Class_pc.a.a(Class_o.a(2, new Class_r[]{Class_uf.ab, Class_og.b(var12, 0), Class_ec.M, Class_og.b(var13, 0)}), 114);
                                          var13++;
                                       }
                                    } while (var13 <= 1 + var11);
                                 }
                              } while (++var12 <= 1 + var9);
                           }
                        }

                        label128: {
                           if (Class_ua.b != 28) {
                              Class_ca.a(30, (byte)-77);
                              if (Class_wf.k == null) {
                                 break label128;
                              }

                              Class_cj.S.o(64, 60);
                              if (var14 == 0) {
                                 break label128;
                              }
                           }

                           Class_ca.a(10, (byte)-128);
                        }

                        Class_hf.c(16322);
                        Class_ch.b((byte)105);
                        return;
                     }

                     var8 = 0;
                     if (var14 != 0) {
                        Class_ic.a(var27, (byte)-52, var8);
                        var8++;
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var15) {
         throw Class_sh.a(var15, "jk.I(" + var0 + ')');
      }
   }

   public static void b(byte var0) {
      try {
         k = null;
         x = null;
         int var1 = -22 / ((var0 - -68) / 46);
         y = null;
         D = null;
         E = null;
         C = null;
         A = null;
         v = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "jk.D(" + var0 + ')');
      }
   }

   Class_jk(Socket var1, Class_ik var2) throws IOException {
      try {
         this.n = var2;
         this.f = var1;
         this.f.setSoTimeout(30000);
         this.f.setTcpNoDelay(true);
         this.j = this.f.getInputStream();
         this.m = this.f.getOutputStream();
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "jk.<init>(" + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ? "{...}" : "null") + ')');
      }
   }

   static {
      int var0 = 0;

      for (int var1 = 0; ~var1 > -100; var1++) {
         int var2 = var1 - -1;
         int var3 = (int)(Math.pow(2.0, var2 / 7.0) * 300.0 + var2);
         var0 += var3;
         k[var1] = var0 / 4;
      }

      u = 0;
      x = Class_tc.a(43, "::tele ");
      C = Class_tc.a(43, " )2> <col=ffff00>");
      D = Class_tc.a(43, ")1j");
      v = new Class_r[100];
      E = Class_tc.a(43, "");
   }
}
