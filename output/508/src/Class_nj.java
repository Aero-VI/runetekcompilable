import java.io.IOException;
import java.net.Socket;

final class Class_nj {
   static int a;
   static Class_nj b = new Class_nj(16);
   static int c;
   static int d;
   static int e;
   static int f;
   static int g;
   static int h;
   static int i;
   private Class_pe j = new Class_pe();
   static Class_r k = Class_nj.o;
   static int l;
   static int m;
   static int[] n = new int[2];
   private static Class_r o = Class_tc.a(43, "World");
   static Class_tg p = new Class_tg(8);
   static Class_r q = Class_tc.a(43, "Hidden)2");
   static int r;
   static int[] s = new int[50];
   private int t;
   private int u;
   static int v;
   private Class_tg w;
   private Class_wh x = new Class_wh();
   static Class_r y = Class_nj.z;
   private static Class_r z = Class_tc.a(43, "Loaded config");

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(boolean var0) {
      int var5 = client.lb;

      try {
         d++;
         if (~Class_ek.o != -1 && ~Class_ek.o != -6) {
            try {
               if (~(++Class_og.cb) < -2001) {
                  if (Class_wf.k != null) {
                     Class_wf.k.b(-64);
                     Class_wf.k = null;
                  }

                  if (~Class_ga.k <= -2) {
                     Class_fh.O = -5;
                     Class_ek.o = 0;
                     return;
                  }

                  label196: {
                     if (Class_ti.h != Class_sb.o) {
                        Class_sb.o = Class_ti.h;
                        if (var5 == 0) {
                           break label196;
                        }
                     }

                     Class_sb.o = Class_lk.r;
                  }

                  Class_ga.k++;
                  Class_ek.o = 1;
                  Class_og.cb = 0;
               }

               if (var0) {
                  z = null;
               }

               if (~Class_ek.o == -2) {
                  Class_ke.B = Class_rj.J.a(Class_kc.r, (byte)116, Class_sb.o);
                  Class_ek.o = 2;
               }

               if (Class_ek.o == 2) {
                  if (~Class_ke.B.b == -3) {
                     throw new IOException();
                  }

                  if (Class_ke.B.b != 1) {
                     return;
                  }

                  Class_wf.k = new Class_jk((Socket)Class_ke.B.e, Class_rj.J);
                  Class_ke.B = null;
                  long var1 = Class_ak.X = Class_hk.N.f(10908);
                  Class_cj.S.p = 0;
                  Class_cj.S.b(32, 14);
                  int var3 = (int)(31L & var1 >> 502092432);
                  Class_cj.S.b(32, var3);
                  Class_wf.k.a(0, (byte)36, 2, Class_cj.S.E);
                  if (Class_ve.V != null) {
                     Class_ve.V.a(var0);
                  }

                  if (Class_a.m != null) {
                     Class_a.m.a(var0);
                  }

                  int var4 = Class_wf.k.a(112);
                  if (Class_ve.V != null) {
                     Class_ve.V.a(false);
                  }

                  if (Class_a.m != null) {
                     Class_a.m.a(false);
                  }

                  if (~var4 != -1) {
                     Class_fh.O = var4;
                     Class_ek.o = 0;
                     Class_wf.k.b(-7);
                     Class_wf.k = null;
                     return;
                  }

                  Class_ek.o = 3;
               }

               if (~Class_ek.o == -4) {
                  if (Class_wf.k.a((byte)102) < 8) {
                     return;
                  }

                  int[] var10;
                  label184: {
                     Class_wf.k.a(-44, 8, 0, Class_f.T.E);
                     Class_f.T.p = 0;
                     Class_i.V = Class_f.T.j(102);
                     var10 = new int[4];
                     var10[1] = (int)(9.9999999E7 * Math.random());
                     var10[0] = (int)(9.9999999E7 * Math.random());
                     var10[2] = (int)(Class_i.V >> 266129824);
                     Class_cj.S.p = 0;
                     var10[3] = (int)Class_i.V;
                     Class_cj.S.b(32, 10);
                     Class_cj.S.g(544537784, var10[0]);
                     Class_cj.S.g(544537784, var10[1]);
                     Class_cj.S.g(544537784, var10[2]);
                     Class_cj.S.g(544537784, var10[3]);
                     Class_cj.S.a(true, Class_hk.N.f(10908));
                     Class_cj.S.a((byte)-9, Class_hk.O);
                     Class_cj.S.a(false, Class_dc.q, Class_qd.t);
                     Class_tc.v.p = 0;
                     if (Class_ua.b == 40) {
                        Class_tc.v.b(32, 18);
                        if (var5 == 0) {
                           break label184;
                        }
                     }

                     Class_tc.v.b(32, 16);
                  }

                  Class_tc.v.a(false, 151 + Class_cj.S.p + Class_dj.a(Class_df.c, -106));
                  Class_tc.v.g(544537784, 508);
                  Class_tc.v.b(32, Class_di.W);
                  Class_tc.v.b(32, 0);
                  Class_tc.v.b(32, Class_tj.b((byte)97));
                  Class_tc.v.a(var0, Class_l.u);
                  Class_tc.v.a(false, Class_fk.R);
                  Class_ch.a(24, Class_tc.v);
                  Class_tc.v.a((byte)-9, Class_df.c);
                  Class_tc.v.g(544537784, Class_m.kb);
                  Class_tc.v.g(544537784, Class_fd.a((byte)119));
                  Class_si.g = true;
                  Class_tc.v.g(544537784, Class_dd.Eb.g);
                  Class_tc.v.g(544537784, Class_jf.k.g);
                  Class_tc.v.g(544537784, Class_fi.w.g);
                  Class_tc.v.g(544537784, Class_ma.jb.g);
                  Class_tc.v.g(544537784, Class_nb.b.g);
                  Class_tc.v.g(544537784, Class_pc.a.g);
                  Class_tc.v.g(544537784, Class_cj.L.g);
                  Class_tc.v.g(544537784, Class_ui.d.g);
                  Class_tc.v.g(544537784, Class_id.s.g);
                  Class_tc.v.g(544537784, Class_sa.Z.g);
                  Class_tc.v.g(544537784, Class_oa.b.g);
                  Class_tc.v.g(544537784, Class_cj.Y.g);
                  Class_tc.v.g(544537784, Class_bh.i.g);
                  Class_tc.v.g(544537784, Class_kh.e.g);
                  Class_tc.v.g(544537784, Class_ci.L.g);
                  Class_tc.v.g(544537784, Class_e.f.g);
                  Class_tc.v.g(544537784, Class_aj.t.g);
                  Class_tc.v.g(544537784, Class_fb.i.g);
                  Class_tc.v.g(544537784, Class_li.k.g);
                  Class_tc.v.g(544537784, Class_uc.g.g);
                  Class_tc.v.g(544537784, Class_je.a.g);
                  Class_tc.v.g(544537784, Class_se.hb.g);
                  Class_tc.v.g(544537784, Class_bi.f.g);
                  Class_tc.v.g(544537784, Class_ec.K.g);
                  Class_tc.v.g(544537784, Class_di.ab.g);
                  Class_tc.v.g(544537784, Class_ga.d.g);
                  Class_tc.v.g(544537784, Class_cc.ac.g);
                  Class_tc.v.a(Class_cj.S.p, (byte)118, 0, Class_cj.S.E);
                  Class_wf.k.a(0, (byte)86, Class_tc.v.p, Class_tc.v.E);
                  Class_cj.S.a(var10, 3426);
                  int var2 = 0;
                  if (var5 != 0 || var2 < 4) {
                     do {
                        var10[var2] += 50;
                     } while (++var2 < 4);
                  }

                  Class_f.T.a(var10, 3426);
                  Class_ek.o = 4;
               }

               int var11;
               label219: {
                  label168:
                  if (~Class_ek.o == -5) {
                     if (~Class_wf.k.a((byte)102) > -2) {
                        return;
                     }

                     var11 = Class_wf.k.a(110);
                     if (~var11 == -22) {
                        Class_ek.o = 7;
                        if (var5 == 0) {
                           break label168;
                        }
                     }

                     if (~var11 == -2) {
                        Class_ek.o = 5;
                        Class_fh.O = var11;
                        return;
                     }

                     if (~var11 != -3) {
                        break label219;
                     }

                     Class_ek.o = 8;
                     if (var5 != 0) {
                        break label219;
                     }
                  }

                  if (Class_ek.o == 6) {
                     Class_cj.S.p = 0;
                     Class_cj.S.o(115, 17);
                     Class_wf.k.a(0, (byte)87, Class_cj.S.p, Class_cj.S.E);
                     Class_ek.o = 4;
                     return;
                  }

                  if (Class_ek.o == 7) {
                     if (~Class_wf.k.a((byte)102) > -2) {
                        return;
                     }

                     Class_fj.d = 180 + Class_wf.k.a(98) * 60;
                     Class_ek.o = 0;
                     Class_fh.O = 21;
                     Class_wf.k.b(-51);
                     Class_wf.k = null;
                     return;
                  }

                  if (~Class_ek.o == -9) {
                     if (Class_wf.k.a((byte)102) < 11) {
                        return;
                     }

                     label149: {
                        Class_wf.k.a(-73, 11, 0, Class_f.T.E);
                        Class_f.T.p = 0;
                        Class_ib.eb = Class_f.T.n(-6677);
                        Class_ba.w = Class_f.T.n(-6677);
                        Class_de.h = Class_f.T.n(-6677);
                        if (~Class_de.h != -2) {
                           try {
                              Class_gj.W.a(Class_rj.J.g, (byte)-123);
                              break label149;
                           } catch (Throwable var7) {
                              if (var5 == 0) {
                                 break label149;
                              }
                           }
                        }

                        try {
                           Class_dc.G.a(Class_rj.J.g, (byte)-123);
                        } catch (Throwable var6) {
                        }
                     }

                     Class_ed.m = Class_f.T.n(-6677);
                     Class_te.db = Class_f.T.n(-6677) == 1;
                     Class_kg.A = Class_f.T.k(1355769544);
                     Class_df.a = Class_f.T.n(-6677);
                     Class_hf.a = Class_f.T.u(255);
                     Class_sf.g = Class_f.T.k(1355769544);
                     Class_ek.o = 9;
                  }

                  if (Class_ek.o == 9) {
                     if (Class_wf.k.a((byte)102) < Class_sf.g) {
                        return;
                     }

                     Class_f.T.p = 0;
                     Class_wf.k.a(88, Class_sf.g, 0, Class_f.T.E);
                     Class_ek.o = 0;
                     Class_fh.O = 2;
                     Class_cj.g(10938);
                     Class_cf.M = -1;
                     Class_ii.a((byte)95, false);
                     Class_hf.a = -1;
                     return;
                  }

                  return;
               }

               if (~var11 == -16) {
                  Class_fh.O = var11;
                  Class_ek.o = 0;
               } else if (~var11 == -24 && ~Class_ga.k > -2) {
                  Class_ek.o = 1;
                  Class_og.cb = 0;
                  Class_ga.k++;
                  Class_wf.k.b(-48);
                  Class_wf.k = null;
               } else {
                  Class_fh.O = var11;
                  Class_ek.o = 0;
                  Class_wf.k.b(-41);
                  Class_wf.k = null;
               }
            } catch (IOException var8) {
               if (Class_wf.k != null) {
                  Class_wf.k.b(-94);
                  Class_wf.k = null;
               }

               if (Class_ga.k < 1) {
                  Class_ek.o = 1;
                  Class_og.cb = 0;
                  Class_ga.k++;
                  if (Class_sb.o != Class_ti.h) {
                     Class_sb.o = Class_ti.h;
                  } else {
                     Class_sb.o = Class_lk.r;
                  }
               } else {
                  Class_ek.o = 0;
                  Class_fh.O = -4;
               }
            }
         }
      } catch (RuntimeException var9) {
         throw Class_sh.a(var9, "nj.J(" + var0 + ')');
      }
   }

   static final void a(int var0, int var1) {
      try {
         f++;
         Class_f.U.b(-18767, var1);
         int var2 = -47 % ((var0 - 38) / 47);
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "nj.H(" + var0 + ',' + var1 + ')');
      }
   }

   final void a(long var1, byte var3, Class_pe var4) {
      try {
         if (this.t != 0) {
            this.t--;
         } else {
            Class_pe var5 = this.x.d(2265);
            var5.c(-17554);
            var5.b((byte)73);
            if (this.j == var5) {
               var5 = this.x.d(2265);
               var5.c(-17554);
               var5.b((byte)73);
            }
         }

         i++;
         this.w.a((byte)9, var4, var1);
         int var8 = -84 % ((43 - var3) / 39);
         this.x.a(48, var4);
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "nj.E(" + var1 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ')');
      }
   }

   final Class_li a(int var1) {
      try {
         c++;
         return var1 <= 37 ? null : this.w.a((byte)-122);
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "nj.G(" + var1 + ')');
      }
   }

   public static void a(byte var0) {
      try {
         z = null;
         q = null;
         y = null;
         if (var0 != 69) {
            a(true);
         }

         p = null;
         n = null;
         k = null;
         s = null;
         o = null;
         b = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "nj.D(" + var0 + ')');
      }
   }

   static final boolean a(Class_dd var0, Class_cj var1, boolean var2, Class_cj var3, Class_cj var4) {
      try {
         Class_nk.g = var4;
         Class_wb.f = var3;
         if (var2) {
            return true;
         } else {
            Class_fc.t = var0;
            e++;
            Class_gj.T = var1;
            return true;
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(
            var6,
            "nj.K("
               + (var0 != null ? "{...}" : "null")
               + ','
               + (var1 != null ? "{...}" : "null")
               + ','
               + var2
               + ','
               + (var3 != null ? "{...}" : "null")
               + ','
               + (var4 != null ? "{...}" : "null")
               + ')'
         );
      }
   }

   static final void b(int var0) {
      try {
         if (var0 < 115) {
            a((byte)-105);
         }

         h++;
         Class_f.X = new Class_tg(32);
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "nj.F(" + var0 + ')');
      }
   }

   final void b(byte var1) {
      try {
         a++;
         this.x.a((byte)-56);
         this.w.a(false);
         this.j = new Class_pe();
         if (var1 != -11) {
            o = null;
         }

         this.t = this.u;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "nj.B(" + var1 + ')');
      }
   }

   static final void b(int var0, int var1) {
      try {
         int var2 = 97 / ((63 - var1) / 48);
         l++;
         Class_cc.Lb.b(-18767, var0);
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "nj.C(" + var0 + ',' + var1 + ')');
      }
   }

   static final boolean a(int var0, int var1, int var2) {
      for (int var3 = 0; var3 < Class_vc.w; var3++) {
         Class_ba var4 = Class_v.t[var3];
         if (var4.d == 1) {
            int var5 = var4.v - var0;
            if (var5 > 0) {
               int var6 = var4.k + (var4.a * var5 >> 8);
               int var7 = var4.j + (var4.t * var5 >> 8);
               int var8 = var4.o + (var4.p * var5 >> 8);
               int var9 = var4.m + (var4.f * var5 >> 8);
               if (var2 >= var6 && var2 <= var7 && var1 >= var8 && var1 <= var9) {
                  return true;
               }
            }
         } else if (var4.d == 2) {
            int var10 = var0 - var4.v;
            if (var10 > 0) {
               int var14 = var4.k + (var4.a * var10 >> 8);
               int var18 = var4.j + (var4.t * var10 >> 8);
               int var22 = var4.o + (var4.p * var10 >> 8);
               int var26 = var4.m + (var4.f * var10 >> 8);
               if (var2 >= var14 && var2 <= var18 && var1 >= var22 && var1 <= var26) {
                  return true;
               }
            }
         } else if (var4.d == 3) {
            int var11 = var4.k - var2;
            if (var11 > 0) {
               int var15 = var4.v + (var4.b * var11 >> 8);
               int var19 = var4.y + (var4.g * var11 >> 8);
               int var23 = var4.o + (var4.p * var11 >> 8);
               int var27 = var4.m + (var4.f * var11 >> 8);
               if (var0 >= var15 && var0 <= var19 && var1 >= var23 && var1 <= var27) {
                  return true;
               }
            }
         } else if (var4.d == 4) {
            int var12 = var2 - var4.k;
            if (var12 > 0) {
               int var16 = var4.v + (var4.b * var12 >> 8);
               int var20 = var4.y + (var4.g * var12 >> 8);
               int var24 = var4.o + (var4.p * var12 >> 8);
               int var28 = var4.m + (var4.f * var12 >> 8);
               if (var0 >= var16 && var0 <= var20 && var1 >= var24 && var1 <= var28) {
                  return true;
               }
            }
         } else if (var4.d == 5) {
            int var13 = var1 - var4.o;
            if (var13 > 0) {
               int var17 = var4.v + (var4.b * var13 >> 8);
               int var21 = var4.y + (var4.g * var13 >> 8);
               int var25 = var4.k + (var4.a * var13 >> 8);
               int var29 = var4.j + (var4.t * var13 >> 8);
               if (var0 >= var17 && var0 <= var21 && var2 >= var25 && var2 <= var29) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   final Class_pe a(long var1, byte var3) {
      try {
         if (var3 != -76) {
            this.j = null;
         }

         Class_pe var4 = (Class_pe)this.w.a(var1, -111);
         g++;
         if (var4 != null) {
            this.x.a(77, var4);
         }

         return var4;
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "nj.I(" + var1 + ',' + var3 + ')');
      }
   }

   final Class_li c(int var1) {
      try {
         v++;
         if (var1 != 0) {
            k = null;
         }

         return this.w.a(-32642);
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "nj.A(" + var1 + ')');
      }
   }

   Class_nj(int var1) {
      try {
         this.t = var1;
         this.u = var1;
         byte var2 = 1;

         while (~(var2 + var2) > ~var1) {
            var2 += var2;
         }

         this.w = new Class_tg(var2);
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "nj.<init>(" + var1 + ')');
      }
   }
}
