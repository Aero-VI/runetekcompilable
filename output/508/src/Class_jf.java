final class Class_jf {
   static int a = 0;
   static int b;
   int c;
   int[] d;
   static int e;
   static int f;
   static int g;
   static int h;
   static Class_r i = Class_jf.l;
   static int j;
   static Class_sg k;
   private static Class_r l = Class_tc.a(43, "level)2");
   Class_gj m;

   static final void a(int var0, Class_fa var1, int var2, int var3) {
      try {
         if (~(var0 & 256) != -1) {
            var1.fb = Class_f.T.r(var2 ^ 19316);
            var1.q = Class_f.T.m(var2 ^ -19306);
            var1.O = Class_f.T.m(79);
            var1.r = Class_f.T.m(61);
            var1.W = Class_f.T.k(1355769544) + Class_be.C;
            var1.t = Class_f.T.g(-15046) + Class_be.C;
            var1.Ib = Class_f.T.n(-6677);
            var1.zb = 1;
            var1.db = 0;
         }

         if (~(var0 & 512) != -1) {
            int var4 = Class_f.T.m(115);
            int var5 = Class_f.T.d((byte)-115);
            var1.a(var4, false, Class_be.C, var5);
         }

         if (var2 == -19219) {
            g++;
            if (~(32 & var0) != -1) {
               var1.x = Class_f.T.k(var2 ^ -1355754971);
               if (~var1.x == -65536) {
                  var1.x = -1;
               }
            }

            if (~(4 & var0) != -1) {
               var1.wb = Class_f.T.e(var2 ^ -19310);
               if (var1.wb.a(0, 7178) == 126) {
                  var1.wb = var1.wb.b(1, true);
                  Class_he.a(var1.f(var2 + 22219), 126, var1.wb, 2);
               } else if (var1 == Class_gg.B) {
                  Class_he.a(var1.f(3000), -107, var1.wb, 2);
               }

               var1.L = 0;
               var1.pb = 150;
               var1.H = 0;
            }

            if ((var0 & 1024) != 0) {
               var1.Y = Class_f.T.k(var2 + 1355788763);
               int var16 = Class_f.T.i(79);
               var1.N = (var16 & 65535) + Class_be.C;
               var1.yb = 0;
               var1.gb = var16 >> 1501520208;
               var1.Gb = 0;
               if (~var1.Y == -65536) {
                  var1.Y = -1;
               }

               if (var1.N > Class_be.C) {
                  var1.yb = -1;
               }
            }

            if (~(64 & var0) != -1) {
               var1.y = Class_f.T.d(var2 + 19308);
               var1.sb = Class_f.T.g(-15046);
            }

            if ((var0 & 8) != 0) {
               int var17 = Class_f.T.g(var2 ^ 29143);
               boolean var8 = ~(32768 & var17) != -1;
               int var21 = Class_f.T.r(var2 ^ -19306);
               int var6 = Class_f.T.r(var2 + 19205);
               int var7 = Class_f.T.p;
               if (var1.Zb != null && var1.Vb != null) {
                  long var9 = var1.Zb.f(var2 + 30127);
                  boolean var11 = false;
                  if (var21 <= 1) {
                     if (var8 || Class_de.h != 1 && ~Class_ed.m != -2) {
                        for (int var12 = 0; Class_ok.bb > var12; var12++) {
                           if (~var9 == ~Class_sg.rb[var12]) {
                              var11 = true;
                              break;
                           }
                        }
                     } else {
                        var11 = true;
                     }
                  }

                  if (!var11 && ~Class_ub.bb == -1) {
                     Class_ph.b.p = 0;
                     Class_f.T.a(0, 0, var6, Class_ph.b.E);
                     Class_ph.b.p = 0;
                     int var13 = -1;
                     Class_r var26;
                     if (!var8) {
                        var26 = Class_af.a(Class_oi.a(68, Class_ph.b).g(var2 ^ -19217));
                     } else {
                        var17 &= 32767;
                        Class_jf var14 = Class_mb.a(Class_ph.b, -10);
                        var13 = var14.c;
                        var26 = var14.m.a(121, Class_ph.b);
                     }

                     var1.wb = var26.a(true);
                     var1.H = var17 >> 501220200;
                     var1.pb = 150;
                     var1.L = 0xFF & var17;
                     if (var21 == 2) {
                        Class_de.a(null, -19596, Class_o.a(var2 ^ -19217, new Class_r[]{Class_db.Z, var1.f(var2 ^ -16555)}), var13, var8 ? 17 : 1, var26);
                     } else if (~var21 != -2) {
                        Class_de.a(null, -19596, var1.f(3000), var13, !var8 ? 2 : 17, var26);
                     } else {
                        Class_de.a(null, -19596, Class_o.a(2, new Class_r[]{Class_pi.fb, var1.f(3000)}), var13, var8 ? 17 : 1, var26);
                     }
                  }
               }

               Class_f.T.p = var6 + var7;
            }

            if ((1 & var0) != 0) {
               int var18 = Class_f.T.k(1355769544);
               if (var18 == 65535) {
                  var18 = -1;
               }

               int var22 = Class_f.T.m(118);
               Class_uc.a(var22, var2 ^ -19219, var1, var18);
            }

            if ((var0 & 128) != 0) {
               int var19 = Class_f.T.n(var2 + 12542);
               byte[] var23 = new byte[var19];
               Class_lh var25 = new Class_lh(var23);
               Class_f.T.a(0, 0, var19, var23);
               Class_aa.q[var3] = var25;
               var1.a(var25, (byte)-82);
            }

            if ((var0 & 2) != 0) {
               int var20 = Class_f.T.m(125);
               int var24 = Class_f.T.m(var2 ^ -19320);
               var1.a(var20, false, Class_be.C, var24);
               var1.G = 300 + Class_be.C;
               var1.T = Class_f.T.m(70);
            }
         }
      } catch (RuntimeException var15) {
         throw Class_sh.a(var15, "jf.G(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   static final void a(Class_ta var0, boolean var1) {
      int var10 = client.lb;

      try {
         b++;
         var0.w = var0.C;
         if (~var0.zb == -1) {
            var0.s = 0;
         } else {
            if (var0.ob != -1 && ~var0.R == -1) {
               Class_uc var2 = Class_kk.a((byte)-36, var0.ob);
               if (var0.db > 0 && ~var2.l == -1) {
                  var0.s++;
                  return;
               }

               if (~var0.db >= -1 && var2.h == 0) {
                  var0.s++;
                  return;
               }
            }

            int var12 = var0.hb;
            int var3 = var0.J;
            int var5 = 64 * var0.Q + var0.qb[-1 + var0.zb] * 128;
            int var4 = var0.Q * 64 + 128 * var0.v[-1 + var0.zb];
            if (~(var4 - var12) >= -257 && ~(-var12 + var4) <= 255 && ~(-var3 + var5) >= -257 && ~(var5 + -var3) <= 255) {
               label225: {
                  if (var4 > var12) {
                     if (var5 > var3) {
                        var0.F = 1280;
                        if (var10 == 0) {
                           break label225;
                        }
                     }

                     if (~var3 < ~var5) {
                        var0.F = 1792;
                        if (var10 == 0) {
                           break label225;
                        }
                     }

                     var0.F = 1536;
                     if (var10 == 0) {
                        break label225;
                     }
                  }

                  if (var12 > var4) {
                     if (var5 > var3) {
                        var0.F = 768;
                        if (var10 == 0) {
                           break label225;
                        }
                     }

                     if (var3 > var5) {
                        var0.F = 256;
                        if (var10 == 0) {
                           break label225;
                        }
                     }

                     var0.F = 512;
                     if (var10 == 0) {
                        break label225;
                     }
                  }

                  if (~var3 > ~var5) {
                     var0.F = 1024;
                     if (var10 == 0) {
                        break label225;
                     }
                  }

                  if (var3 > var5) {
                     var0.F = 0;
                  }
               }

               int var7 = var0.E;
               int var6 = var0.F + -var0.U & 2047;
               byte var8 = 4;
               if (var6 > 1024) {
                  var6 -= 2048;
               }

               label236: {
                  if (~var6 > 255 || var6 > 256) {
                     if (~var6 <= -257 && var6 < 768) {
                        var7 = var0.jb;
                        if (var10 == 0) {
                           break label236;
                        }
                     }

                     if (~var6 > 767 || ~var6 < 255) {
                        break label236;
                     }

                     var7 = var0.ub;
                     if (var10 == 0) {
                        break label236;
                     }
                  }

                  var7 = var0.P;
               }

               boolean var9 = var1;
               if (~var7 == 0) {
                  var7 = var0.P;
               }

               var0.w = var7;
               if (var0 instanceof Class_eh) {
                  var9 = ((Class_eh)var0).Pb.s;
               }

               label229: {
                  if (!var9) {
                     if (var0.zb > 1) {
                        var8 = 6;
                     }

                     if (var0.zb > 2) {
                        var8 = 8;
                     }

                     if (var0.s <= 0 || var0.zb <= 1) {
                        break label229;
                     }

                     var8 = 8;
                     var0.s--;
                     if (var10 == 0) {
                        break label229;
                     }
                  }

                  if (~var0.F != ~var0.U && var0.x == -1 && var0.Bb != 0) {
                     var8 = 2;
                  }

                  if (~var0.zb < -3) {
                     var8 = 6;
                  }

                  if (var0.zb > 3) {
                     var8 = 8;
                  }

                  if (var0.s > 0 && ~var0.zb < -2) {
                     var8 = 8;
                     var0.s--;
                  }
               }

               if (var0.S[var0.zb - 1]) {
                  var8 <<= 1;
               }

               label153: {
                  if (~var12 <= ~var4) {
                     if (~var4 <= ~var12) {
                        break label153;
                     }

                     var0.hb -= var8;
                     if (~var0.hb <= ~var4) {
                        break label153;
                     }

                     var0.hb = var4;
                     if (var10 == 0) {
                        break label153;
                     }
                  }

                  var0.hb += var8;
                  if (var0.hb > var4) {
                     var0.hb = var4;
                  }
               }

               label144: {
                  if (var3 < var5) {
                     var0.J += var8;
                     if (var5 >= var0.J) {
                        break label144;
                     }

                     var0.J = var5;
                     if (var10 == 0) {
                        break label144;
                     }
                  }

                  if (var3 > var5) {
                     var0.J -= var8;
                     if (var5 > var0.J) {
                        var0.J = var5;
                     }
                  }
               }

               if (var8 >= 8 && ~var0.P == ~var0.w && ~var0.M != 0) {
                  var0.w = var0.M;
               }

               if (~var0.hb == ~var4 && var0.J == var5) {
                  if (~var0.db < -1) {
                     var0.db--;
                  }

                  var0.zb--;
               }
            } else {
               var0.J = var5;
               var0.hb = var4;
            }
         }
      } catch (RuntimeException var11) {
         throw Class_sh.a(var11, "jf.B(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
      }
   }

   static final Class_r a(byte var0, int var1) {
      try {
         f++;
         if (var0 >= -40) {
            return null;
         } else {
            return ~Class_fb.h[var1].d((byte)-117) >= -1 ? Class_tj.u[var1] : Class_o.a(2, new Class_r[]{Class_tj.u[var1], Class_hh.k, Class_fb.h[var1]});
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "jf.C(" + var0 + ',' + var1 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, int var1, byte var2) {
      int var7 = client.lb;

      try {
         j++;
         int var3 = var0;
         if (var0 > 25) {
            var3 = 25;
         }

         int var4 = Class_vh.gb[--var0];
         int var5 = Class_ma.cb[var0];
         if (~var1 == -1) {
            Class_cj.S.o(-122, 49);
            Class_w.N++;
            Class_cj.S.b(32, var3 + var3 - -3);
         }

         if (var1 == 1) {
            Class_vj.p++;
            Class_cj.S.o(-110, 119);
            Class_cj.S.b(32, 14 + 3 + var3 - -var3);
         }

         if (~var1 == -3) {
            Class_cj.S.o(76, 138);
            Class_cj.S.b(32, var3 + var3 + 3);
            Class_o.W++;
         }

         Class_cj.S.c((byte)19, var4 + Class_fj.e);
         Class_cj.S.h(var5 - -Class_va.ab, -38);
         Class_cj.S.b((byte)-103, Class_wh.q[82] ? 1 : 0);
         Class_fg.o = Class_ma.cb[0];
         if (var2 >= 123) {
            Class_ph.f = Class_vh.gb[0];
            int var6 = 1;
            if (var7 != 0 || var6 < var3) {
               do {
                  Class_cj.S.b(32, Class_vh.gb[--var0] + -var4);
                  Class_cj.S.j(17557, -var5 + Class_ma.cb[var0]);
               } while (++var6 < var3);
            }
         }
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "jf.E(" + var0 + ',' + var1 + ',' + var2 + ')');
      }
   }

   static final void a(int var0, byte var1, int var2, int var3, int var4, int var5) {
      try {
         e++;
         if (var1 != 63) {
            a = -12;
         }

         if (var2 == var0) {
            Class_qj.a(var5, var3, var0, var4, true);
         } else if (Class_ga.v <= var4 + -var0 && Class_tg.r >= var0 + var4 && ~Class_ff.d >= ~(var3 + -var2) && ~(var3 - -var2) >= ~Class_hh.h) {
            Class_p.a(var2, var4, var3, true, var0, var5);
         } else {
            Class_ja.a(var4, var3, var2, var0, (byte)47, var5);
         }
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "jf.F(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
      }
   }

   static final void a(int var0) {
      try {
         h++;
         if (var0 >= 12) {
            try {
               if (Class_mk.j == null) {
                  Class_mk.j = new Class_id(Class_rj.J, Class_o.a(2, new Class_r[]{Class_of.a(-1), Class_sc.i}).a(-16294));
               }
            } catch (Exception var2) {
               var2.printStackTrace();
               Class_mk.j = null;
            }
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "jf.A(" + var0 + ')');
      }
   }

   public static void b(int var0) {
      try {
         if (var0 != -2) {
            a(21);
         }

         k = null;
         i = null;
         l = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "jf.D(" + var0 + ')');
      }
   }

   public Class_jf() {
   }
}
