import java.io.IOException;
import java.util.zip.CRC32;

final class Class_tb {
   static int[] a = new int[]{2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2};
   static int b;
   static int[] c = new int[64];
   private static Class_r d = Class_tc.a(43, "shake:");
   static int e;
   static int f;
   static Class_r g = d;
   static int h;
   static int i;
   static Class_r j = d;
   static int k;
   static CRC32 l = new CRC32();
   static int m;
   static Class_tg n = new Class_tg(4096);
   static int o;
   static int[] p = new int[50];

   static final boolean a(byte[] var0, int var1, int var2, int var3) {
      int var17 = client.lb;

      try {
         if (var1 != -32692) {
            p = null;
         }

         e++;
         boolean var4 = true;
         Class_lh var5 = new Class_lh(var0);
         int var6 = -1;

         do {
            int var7 = var5.e(true);
            if (~var7 == -1) {
               break;
            }

            var6 += var7;
            int var8 = 0;
            boolean var9 = false;

            while (true) {
               if (var9) {
                  int var10 = var5.f(255);
                  if (~var10 == -1) {
                     break;
                  }

                  var5.n(-6677);
                  if (var17 == 0) {
                     continue;
                  }
               }

               int var19 = var5.f(255);
               if (~var19 != -1) {
                  var8 += var19 - 1;
                  int var11 = 63 & var8;
                  int var12 = (4070 & var8) >> -693368570;
                  int var15 = var11 - -var2;
                  int var14 = var12 - -var3;
                  int var13 = var5.n(-6677) >> 1429884258;
                  if (var14 <= 0 || ~var15 >= -1 || ~var14 <= -104 || var15 >= 103) {
                     continue;
                  }

                  Class_ub var16 = Class_qe.a(var1 + 32781, var6);
                  if (~var13 != -23 || Class_ng.o || var16.y != 0 || ~var16.mb == -2 || var16.U) {
                     if (!var16.c(107)) {
                        var4 = false;
                        Class_ha.nd++;
                     }

                     var9 = true;
                  }

                  if (var17 == 0) {
                     continue;
                  }
               }
               break;
            }
         } while (var17 == 0);

         return var4;
      } catch (RuntimeException var18) {
         throw Class_sh.a(var18, "tb.G(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   static final void a(boolean var0, int var1, int var2, int var3, Class_cj var4, boolean var5, int var6) {
      try {
         if (var5) {
            a((byte)81);
         }

         Class_tf.Z = var3;
         Class_i.mb = var2;
         Class_sd.e = var1;
         Class_id.f = var0;
         Class_lg.l = var6;
         Class_ua.g = var4;
         k++;
         Class_mb.y = 1;
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "tb.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ',' + var5 + ',' + var6 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, int var1, int var2) {
      int var7 = client.lb;

      try {
         f++;
         int[] var3 = new int[4];
         int[] var4 = new int[4];
         var3[0] = var1;
         int var5 = 1;
         var4[0] = var2;
         int var6 = 0;
         if (var7 == 0 && var6 >= 4) {
            Class_hh.j = var4;
            if (var0 <= 104) {
               a(39);
            }

            Class_ka.ob = var3;
            Class_e.a(Class_ta.B.length - 1, -228, Class_ta.B, 0);
         } else {
            do {
               if (~var1 != ~Class_ka.ob[var6]) {
                  var3[var5] = Class_ka.ob[var6];
                  var4[var5] = Class_hh.j[var6];
                  var5++;
               }
            } while (++var6 < 4);

            Class_hh.j = var4;
            if (var0 <= 104) {
               a(39);
            }

            Class_ka.ob = var3;
            Class_e.a(Class_ta.B.length - 1, -228, Class_ta.B, 0);
         }
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "tb.C(" + var0 + ',' + var1 + ',' + var2 + ')');
      }
   }

   static final boolean a(int var0) {
      try {
         i++;
         if (var0 != 20778) {
            j = null;
         }

         return ~Class_mb.y != -1 ? true : Class_fc.t.g(-1);
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "tb.A(" + var0 + ')');
      }
   }

   static final void a(Class_cj var0, byte var1, Class_cj var2) {
      try {
         b++;
         Class_b.eb = var0;
         Class_oa.g = var2;
         if (var1 != 82) {
            n = null;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "tb.E(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
      }
   }

   public static void a(byte var0) {
      try {
         g = null;
         j = null;
         if (var0 <= -8) {
            c = null;
            d = null;
            p = null;
            l = null;
            a = null;
            n = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "tb.F(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final boolean b(int var0) throws IOException {
      int var20 = client.lb;

      try {
         m++;
         if (Class_wf.k == null) {
            return false;
         } else {
            int var1 = Class_wf.k.a((byte)102);
            if (~var1 == -1) {
               return false;
            } else {
               if (~Class_hf.a == 0) {
                  var1--;
                  Class_wf.k.a(var0 ^ 26328, 1, 0, Class_f.T.E);
                  Class_f.T.p = 0;
                  Class_hf.a = Class_f.T.u(255);
                  Class_sf.g = Class_bb.m[Class_hf.a];
               }

               if (var0 != -26354) {
                  g = null;
               }

               if (Class_sf.g == -1) {
                  if (~var1 >= -1) {
                     return false;
                  }

                  Class_wf.k.a(var0 ^ -26284, 1, 0, Class_f.T.E);
                  Class_sf.g = 255 & Class_f.T.E[0];
                  var1--;
               }

               if (Class_sf.g == -2) {
                  if (~var1 >= -2) {
                     return false;
                  }

                  var1 -= 2;
                  Class_wf.k.a(117, 2, 0, Class_f.T.E);
                  Class_f.T.p = 0;
                  Class_sf.g = Class_f.T.k(1355769544);
                  if (var20 != 0) {
                     return false;
                  }
               }

               if (Class_sf.g > var1) {
                  return false;
               } else {
                  Class_f.T.p = 0;
                  Class_wf.k.a(107, Class_sf.g, 0, Class_f.T.E);
                  Class_qj.U = 0;
                  Class_fh.I = Class_fe.T;
                  Class_fe.T = Class_pe.w;
                  Class_pe.w = Class_hf.a;
                  if (Class_hf.a == 93) {
                     int var82 = Class_f.T.k(1355769544);
                     int var136 = Class_f.T.d((byte)-93);
                     int var186 = Class_f.T.h(var0 + 20826);
                     Class_be var214 = (Class_be)Class_nj.p.a(var186, 103);
                     if (var214 != null) {
                        Class_hj.a(var214, true, var214.t != var82);
                     }

                     Class_ek.a(var136, var82, -58, var186);
                     Class_hf.a = -1;
                     return true;
                  } else if (Class_hf.a == 217) {
                     Class_lf.f(0);
                     int var2 = Class_f.T.r(123);
                     int var3 = Class_f.T.d(false);
                     int var4 = Class_f.T.r(38);
                     Class_qe.M[var4] = var3;
                     Class_ed.i[var4] = var2;
                     Class_of.j[var4] = 1;
                     int var5 = 0;
                     if (var20 != 0) {
                        if (var3 >= Class_jk.k[var5]) {
                           Class_of.j[var4] = var5 + 2;
                        }

                        var5++;
                     }

                     for (; var5 < 98; var5++) {
                        if (var3 >= Class_jk.k[var5]) {
                           Class_of.j[var4] = var5 + 2;
                        }
                     }

                     Class_ve.eb[Class_ui.a(31, Class_ed.e++)] = var4;
                     Class_hf.a = -1;
                     return true;
                  } else if (Class_hf.a == 57) {
                     int var81 = Class_f.T.m(91);
                     int var135 = Class_f.T.d((byte)-124);
                     int var185 = Class_f.T.d((byte)-102);
                     Class_jk.F = var81 >> 1847841633;
                     Class_gg.B.a(var135, (byte)-68, var185, (var81 & 1) == 1);
                     Class_hf.a = -1;
                     return true;
                  } else if (Class_hf.a == 132) {
                     Class_i.a(Class_f.T.e(127), (byte)125);
                     Class_hf.a = -1;
                     return true;
                  } else if (~Class_hf.a == -211) {
                     if (Class_hj.bb != -1) {
                        Class_ua.a(89, Class_hj.bb, 0);
                     }

                     Class_hf.a = -1;
                     return true;
                  } else if (~Class_hf.a == -42) {
                     int var80 = Class_f.T.i(101);
                     int var134 = Class_f.T.g(-15046);
                     Class_ha var184 = Class_tf.a(var80, (byte)-80);
                     if (var184 != null && var184.Kc == 0) {
                        if (~(var184.M + -var184.nc) > ~var134) {
                           var134 = var184.M + -var184.nc;
                        }

                        if (var134 < 0) {
                           var134 = 0;
                        }

                        if (~var184.kb != ~var134) {
                           var184.kb = var134;
                           Class_tg.a(var184, -124);
                        }
                     }

                     Class_hf.a = -1;
                     return true;
                  } else if (~Class_hf.a == -224) {
                     int var79 = Class_f.T.k(1355769544);
                     int var133 = Class_f.T.e((byte)-47);
                     if (var133 == 65535) {
                        var133 = -1;
                     }

                     int var183 = Class_f.T.c((byte)121);
                     if (~var79 == -65536) {
                        var79 = -1;
                     }

                     int var213 = Class_f.T.c((byte)126);
                     int var246 = var133;
                     if (var20 == 0 && ~var133 < ~var79) {
                        Class_hf.a = -1;
                        return true;
                     } else {
                        do {
                           long var269 = ((long)var183 << -1214487776) + var246;
                           Class_li var293 = Class_sf.f.a(var269, -115);
                           if (var293 != null) {
                              var293.c(var0 ^ 8800);
                           }

                           Class_sf.f.a((byte)120, new Class_kg(var213), var269);
                        } while (~(++var246) >= ~var79);

                        Class_hf.a = -1;
                        return true;
                     }
                  } else if (Class_hf.a == 115) {
                     Class_ha.fd = Class_f.T.n(-6677);
                     Class_vf.l = Class_qd.F;
                     Class_hf.a = -1;
                     return true;
                  } else if (~Class_hf.a == -56) {
                     Class_lj.a(Class_f.T, 24);
                     Class_hf.a = -1;
                     return true;
                  } else if (~Class_hf.a == -118) {
                     int var22 = Class_sf.g + Class_f.T.p;
                     int var83 = Class_f.T.k(1355769544);
                     int var137 = Class_f.T.k(1355769544);
                     if (~var83 != ~Class_hj.bb) {
                        Class_hj.bb = var83;
                        Class_mk.a(Class_hj.bb, (byte)108);
                        Class_hc.a(false, 640);
                        Class_mc.a(-1, Class_hj.bb);
                        int var187 = 0;
                        if (var20 != 0) {
                           Class_vb.j[var187] = true;
                           var187++;
                        }

                        while (~var187 > -101) {
                           Class_vb.j[var187] = true;
                           var187++;
                        }

                        if (var20 != 0) {
                           var187 = Class_f.T.h(-5528);
                           int var6 = Class_f.T.k(var0 + 1355795898);
                           int var7 = Class_f.T.n(-6677);
                           Class_be var8 = (Class_be)Class_nj.p.a(var187, 82);
                           if (var8 != null && var6 != var8.t) {
                              Class_hj.a(var8, true, true);
                              var8 = null;
                           }

                           if (var8 == null) {
                              var8 = Class_ek.a(var7, var6, var0 ^ -26253, var187);
                           }

                           var8.y = true;
                        }
                     }

                     while (~(var137--) < -1) {
                        int var189 = Class_f.T.h(-5528);
                        int var215 = Class_f.T.k(var0 + 1355795898);
                        int var247 = Class_f.T.n(-6677);
                        Class_be var270 = (Class_be)Class_nj.p.a(var189, 82);
                        if (var270 != null && var215 != var270.t) {
                           Class_hj.a(var270, true, true);
                           var270 = null;
                        }

                        if (var270 == null) {
                           var270 = Class_ek.a(var247, var215, var0 ^ -26253, var189);
                        }

                        var270.y = true;
                     }

                     Class_be var190 = (Class_be)Class_nj.p.a(-32642);
                     if (var20 != 0 || var190 != null) {
                        do {
                           label916: {
                              if (var190.y) {
                                 var190.y = false;
                                 if (var20 == 0) {
                                    break label916;
                                 }
                              }

                              Class_hj.a(var190, true, true);
                           }

                           var190 = (Class_be)Class_nj.p.a((byte)-122);
                        } while (var190 != null);
                     }

                     Class_sf.f.a(false);
                     if (var20 == 0 && ~Class_f.T.p <= ~var22) {
                        Class_hf.a = -1;
                        return true;
                     } else {
                        do {
                           int var216 = Class_f.T.h(-5528);
                           int var248 = Class_f.T.k(1355769544);
                           int var271 = Class_f.T.k(1355769544);
                           int var9 = Class_f.T.h(-5528);
                           int var10 = var248;
                           if (var20 != 0 || ~var248 >= ~var271) {
                              do {
                                 long var11 = var10 + ((long)var216 << -1002536224);
                                 Class_sf.f.a((byte)-27, new Class_kg(var9), var11);
                              } while (~(++var10) >= ~var271);
                           }
                        } while (~Class_f.T.p > ~var22);

                        Class_hf.a = -1;
                        return true;
                     }
                  } else if (Class_hf.a == 64) {
                     int var78 = Class_f.T.e((byte)-47);
                     if (~var78 == -65536) {
                        var78 = -1;
                     }

                     int var132 = Class_f.T.i(var0 + 26479);
                     Class_ha var182 = Class_tf.a(var132, (byte)-80);
                     if (~var182.fc != -2 || var78 != var182.V) {
                        var182.V = var78;
                        var182.fc = 1;
                        Class_tg.a(var182, -116);
                     }

                     Class_hf.a = -1;
                     return true;
                  } else if (~Class_hf.a == -241) {
                     Class_ok.bb = Class_sf.g / 8;
                     int var23 = 0;
                     if (var20 == 0 && ~Class_ok.bb >= ~var23) {
                        Class_vf.l = Class_qd.F;
                        Class_hf.a = -1;
                        return true;
                     } else {
                        do {
                           Class_sg.rb[var23] = Class_f.T.j(Class_bj.a(var0, -26299));
                           Class_dc.D[var23] = Class_jd.a(Class_sg.rb[var23], -1);
                        } while (~Class_ok.bb < ~(++var23));

                        Class_vf.l = Class_qd.F;
                        Class_hf.a = -1;
                        return true;
                     }
                  } else if (Class_hf.a == 154) {
                     long var77 = Class_f.T.j(var0 + 26465);
                     int var181 = Class_f.T.k(1355769544);
                     int var212 = Class_f.T.n(-6677);
                     Class_r var268 = Class_hk.S;
                     if (var181 > 0) {
                        var268 = Class_f.T.e(127);
                     }

                     boolean var245 = true;
                     if (~var77 > -1L) {
                        var245 = false;
                        var77 &= 9223372036854775807L;
                     }

                     Class_r var284 = Class_jd.a(var77, var0 ^ 26353).c(12688);
                     int var292 = 0;
                     if (var20 != 0 || var292 < Class_ek.n) {
                        do {
                           if (var77 == Class_ma.hb[var292]) {
                              if (Class_qc.e[var292] != var181) {
                                 Class_qc.e[var292] = var181;
                                 if (~var181 < -1) {
                                    Class_he.a(Class_hk.S, 127, Class_o.a(var0 + 26356, new Class_r[]{var284, Class_wg.g}), 5);
                                 }

                                 if (var181 == 0) {
                                    Class_he.a(Class_hk.S, -38, Class_o.a(var0 + 26356, new Class_r[]{var284, Class_ak.K}), 5);
                                 }
                              }

                              Class_aa.p[var292] = var268;
                              var284 = null;
                              Class_dc.E[var292] = var212;
                              Class_s.bb[var292] = var245;
                              break;
                           }
                        } while (++var292 < Class_ek.n);
                     }

                     if (var284 != null && Class_ek.n < 200) {
                        Class_ma.hb[Class_ek.n] = var77;
                        Class_vi.W[Class_ek.n] = var284;
                        Class_qc.e[Class_ek.n] = var181;
                        Class_aa.p[Class_ek.n] = var268;
                        Class_dc.E[Class_ek.n] = var212;
                        Class_s.bb[Class_ek.n] = var245;
                        Class_ek.n++;
                     }

                     Class_vf.l = Class_qd.F;
                     int var307 = Class_ek.n;
                     boolean var301 = false;
                     if (var20 != 0 || var307 > 0) {
                        do {
                           var301 = true;
                           var307--;
                           int var312 = 0;
                           if (var20 != 0 || var312 < var307) {
                              do {
                                 if (Class_qc.e[var312] == Class_sf.b || ~Class_sf.b != ~Class_qc.e[1 + var312]) {
                                    if (Class_qc.e[var312] != 0) {
                                       var312++;
                                       continue;
                                    }

                                    if (Class_qc.e[var312 + 1] == 0) {
                                       var312++;
                                       continue;
                                    }
                                 }

                                 int var316 = Class_qc.e[var312];
                                 var301 = false;
                                 Class_qc.e[var312] = Class_qc.e[var312 - -1];
                                 Class_qc.e[var312 - -1] = var316;
                                 Class_r var320 = Class_aa.p[var312];
                                 Class_aa.p[var312] = Class_aa.p[var312 + 1];
                                 Class_aa.p[1 + var312] = var320;
                                 Class_r var323 = Class_vi.W[var312];
                                 Class_vi.W[var312] = Class_vi.W[var312 - -1];
                                 Class_vi.W[1 + var312] = var323;
                                 long var324 = Class_ma.hb[var312];
                                 Class_ma.hb[var312] = Class_ma.hb[var312 - -1];
                                 Class_ma.hb[1 + var312] = var324;
                                 int var18 = Class_dc.E[var312];
                                 Class_dc.E[var312] = Class_dc.E[1 + var312];
                                 Class_dc.E[var312 + 1] = var18;
                                 boolean var19 = Class_s.bb[var312];
                                 Class_s.bb[var312] = Class_s.bb[1 + var312];
                                 Class_s.bb[var312 - -1] = var19;
                                 var312++;
                              } while (var312 < var307);
                           }
                        } while ((!var301 || var20 != 0) && var307 > 0);
                     }

                     Class_hf.a = -1;
                     return true;
                  } else if (Class_hf.a == 229) {
                     long var76;
                     long var180;
                     int var300;
                     long var306;
                     boolean var315;
                     label1048: {
                        var76 = Class_f.T.j(61);
                        Class_f.T.o(3390);
                        var180 = Class_f.T.j(105);
                        long var244 = Class_f.T.k(1355769544);
                        var315 = false;
                        long var283 = Class_f.T.b((byte)87);
                        var306 = var283 + (var244 << 255256160);
                        var300 = Class_f.T.n(var0 + 19677);
                        int var318 = 0;
                        if (var20 != 0) {
                           if (~var306 == ~Class_qb.j[var318]) {
                              var315 = true;
                              if (var20 == 0) {
                                 break label1048;
                              }
                           }

                           var318++;
                        }

                        label1046:
                        while (true) {
                           if (~var318 <= -101) {
                              if (~var300 >= -2) {
                                 if (Class_de.h == 1 || Class_ed.m == 1) {
                                    var315 = true;
                                    if (var20 == 0) {
                                       break;
                                    }
                                 }

                                 int var322 = 0;
                                 if (var20 != 0 || Class_ok.bb > var322) {
                                    do {
                                       if (~Class_sg.rb[var322] == ~var76) {
                                          var315 = true;
                                          if (var20 == 0) {
                                             break label1046;
                                          }
                                       }
                                    } while (Class_ok.bb > ++var322);
                                 }
                              }
                              break;
                           }

                           if (~var306 == ~Class_qb.j[var318]) {
                              var315 = true;
                              if (var20 == 0) {
                                 break;
                              }
                           }

                           var318++;
                        }
                     }

                     label1013:
                     if (!var315 && Class_ub.bb == 0) {
                        Class_qb.j[Class_jk.u] = var306;
                        Class_jk.u = (Class_jk.u - -1) % 100;
                        Class_r var319 = Class_af.a(Class_oi.a(var0 + 26266, Class_f.T).g(2));
                        if (var300 == 2 || var300 == 3) {
                           Class_ba.a(
                              false,
                              Class_o.a(2, new Class_r[]{Class_db.Z, Class_jd.a(var76, var0 ^ 26353).c(12688)}),
                              var319,
                              Class_jd.a(var180, var0 + 26353).c(12688),
                              9
                           );
                           if (var20 == 0) {
                              break label1013;
                           }
                        }

                        if (~var300 != -2) {
                           Class_ba.a(false, Class_jd.a(var76, -1).c(12688), var319, Class_jd.a(var180, -1).c(12688), 9);
                           if (var20 == 0) {
                              break label1013;
                           }
                        }

                        Class_ba.a(
                           false, Class_o.a(2, new Class_r[]{Class_pi.fb, Class_jd.a(var76, -1).c(12688)}), var319, Class_jd.a(var180, -1).c(var0 ^ -22370), 9
                        );
                     }

                     Class_hf.a = -1;
                     return true;
                  } else if (Class_hf.a == 124) {
                     Class_dd.cb = Class_f.T.r(-102);
                     Class_pd.i = Class_f.T.m(126);
                     if (var20 != 0) {
                        Class_hf.a = Class_f.T.n(var0 ^ 31973);
                        Class_la.h(-1);
                     }

                     while (~Class_sf.g < ~Class_f.T.p) {
                        Class_hf.a = Class_f.T.n(var0 ^ 31973);
                        Class_la.h(-1);
                     }

                     Class_hf.a = -1;
                     return true;
                  } else if (~Class_hf.a == -30
                     || Class_hf.a == 232
                     || ~Class_hf.a == -51
                     || Class_hf.a == 21
                     || Class_hf.a == 75
                     || ~Class_hf.a == -249
                     || Class_hf.a == 112
                     || ~Class_hf.a == -202
                     || ~Class_hf.a == -26
                     || Class_hf.a == 110
                     || Class_hf.a == 196
                     || Class_hf.a == 30) {
                     Class_la.h(-1);
                     Class_hf.a = -1;
                     return true;
                  } else if (Class_hf.a == 121) {
                     long var75 = Class_f.T.j(46);
                     int var179 = Class_f.T.k(1355769544);
                     byte var211 = Class_f.T.o(var0 ^ -27600);
                     boolean var243 = false;
                     if (~(var75 & -9223372036854775808L) != -1L) {
                        var243 = true;
                     }

                     label1933: {
                        if (var243) {
                           if (Class_gj.S == 0) {
                              Class_hf.a = -1;
                              return true;
                           }

                           var75 &= 9223372036854775807L;
                           int var265 = 0;
                           var265 = 0;
                           if (var20 != 0 || Class_gj.S > var265) {
                              while (Class_o.ib[var265].a != var75 || var179 != Class_o.ib[var265].r || var20 != 0) {
                                 if (Class_gj.S <= ++var265) {
                                    break;
                                 }
                              }
                           }

                           if (var265 >= Class_gj.S) {
                              break label1933;
                           }

                           if (var20 != 0 || var265 < -1 + Class_gj.S) {
                              do {
                                 Class_o.ib[var265] = Class_o.ib[1 + var265];
                              } while (++var265 < -1 + Class_gj.S);
                           }

                           Class_gj.S--;
                           Class_o.ib[Class_gj.S] = null;
                           if (var20 == 0) {
                              break label1933;
                           }
                        }

                        Class_r var267 = Class_f.T.e(127);
                        Class_oi var282 = new Class_oi();
                        var282.a = var75;
                        var282.x = Class_jd.a(var282.a, var0 + 26353);
                        var282.r = var179;
                        var282.A = var267;
                        var282.z = var211;
                        int var291 = Class_gj.S + -1;
                        int var298;
                        if (var20 != 0 || var291 >= 0) {
                           do {
                              var298 = Class_o.ib[var291].x.b(false, var282.x);
                              if (~var298 == -1) {
                                 Class_o.ib[var291].r = var179;
                                 Class_o.ib[var291].z = var211;
                                 Class_o.ib[var291].A = var267;
                                 if (var75 == Class_ak.X) {
                                    Class_li.h = var211;
                                 }

                                 Class_hf.a = -1;
                                 Class_hk.J = Class_qd.F;
                                 return true;
                              }
                           } while ((~var298 <= -1 || var20 != 0) && --var291 >= 0);
                        }

                        if (~Class_gj.S <= ~Class_o.ib.length) {
                           Class_hf.a = -1;
                           return true;
                        }

                        var298 = Class_gj.S - 1;
                        if (var20 != 0 || var291 < var298) {
                           do {
                              Class_o.ib[1 + var298] = Class_o.ib[var298];
                           } while (var291 < --var298);
                        }

                        if (~Class_gj.S == -1) {
                           Class_o.ib = new Class_oi[100];
                        }

                        Class_o.ib[1 + var291] = var282;
                        if (~var75 == ~Class_ak.X) {
                           Class_li.h = var211;
                        }

                        Class_gj.S++;
                     }

                     Class_hf.a = -1;
                     Class_hk.J = Class_qd.F;
                     return true;
                  } else if (~Class_hf.a == -90) {
                     long var74 = Class_f.T.j(81);
                     Class_r var178 = Class_af.a(Class_oi.a(25, Class_f.T).g(2));
                     Class_he.a(Class_jd.a(var74, -1).c(12688), -67, var178, 6);
                     Class_hf.a = -1;
                     return true;
                  } else if (~Class_hf.a == -143) {
                     Class_ii.a((byte)95, false);
                     Class_hf.a = -1;
                     return true;
                  } else if (~Class_hf.a == -150) {
                     long var73;
                     int var281;
                     int var290;
                     long var297;
                     boolean var311;
                     label1144: {
                        var73 = Class_f.T.j(var0 + 26456);
                        long var177 = Class_f.T.k(1355769544);
                        long var242 = Class_f.T.b((byte)-69);
                        var297 = var242 + (var177 << 1243878112);
                        var281 = Class_f.T.n(var0 + 19677);
                        var311 = false;
                        var290 = Class_f.T.k(1355769544);
                        int var313 = 0;
                        if (var20 != 0) {
                           if (~Class_qb.j[var313] == ~var297) {
                              var311 = true;
                              if (var20 == 0) {
                                 break label1144;
                              }
                           }

                           var313++;
                        }

                        label1142:
                        while (true) {
                           if (~var313 <= -101) {
                              if (~var281 >= -2) {
                                 int var317 = 0;
                                 if (var20 != 0 || ~Class_ok.bb < ~var317) {
                                    do {
                                       if (~var73 == ~Class_sg.rb[var317]) {
                                          var311 = true;
                                          if (var20 == 0) {
                                             break label1142;
                                          }
                                       }
                                    } while (~Class_ok.bb < ~(++var317));
                                 }
                              }
                              break;
                           }

                           if (~Class_qb.j[var313] == ~var297) {
                              var311 = true;
                              if (var20 == 0) {
                                 break;
                              }
                           }

                           var313++;
                        }
                     }

                     label1116:
                     if (!var311 && ~Class_ub.bb == -1) {
                        Class_qb.j[Class_jk.u] = var297;
                        Class_jk.u = (1 + Class_jk.u) % 100;
                        Class_r var314 = Class_ud.a(var290, (byte)76).a((int)-90, Class_f.T);
                        if (~var281 == -3) {
                           Class_de.a(null, -19596, Class_o.a(2, new Class_r[]{Class_db.Z, Class_jd.a(var73, -1).c(var0 ^ -22370)}), var290, 18, var314);
                           if (var20 == 0) {
                              break label1116;
                           }
                        }

                        if (var281 != 1) {
                           Class_de.a(null, -19596, Class_jd.a(var73, -1).c(12688), var290, 18, var314);
                           if (var20 == 0) {
                              break label1116;
                           }
                        }

                        Class_de.a(
                           null, -19596, Class_o.a(var0 + 26356, new Class_r[]{Class_pi.fb, Class_jd.a(var73, var0 + 26353).c(12688)}), var290, 18, var314
                        );
                     }

                     Class_hf.a = -1;
                     return true;
                  } else if (Class_hf.a == 186) {
                     Class_ga.E = Class_f.T.n(-6677);
                     Class_db.eb = Class_f.T.n(var0 ^ 31973);
                     Class_dc.p = Class_f.T.n(var0 + 19677);
                     Class_hf.a = -1;
                     return true;
                  } else if (~Class_hf.a == -196) {
                     int var72 = Class_f.T.i(126);
                     int var131 = (var72 & 854440636) >> -375335812;
                     int var175 = 16383 & var72 >> 1567317006;
                     int var209 = 16383 & var72;
                     int var241 = Class_f.T.k(1355769544);
                     if (~var241 == -65536) {
                        var241 = -1;
                     }

                     int var264 = Class_f.T.n(-6677);
                     var175 -= Class_fj.e;
                     int var289 = 3 & var264;
                     int var280 = var264 >> 723066338;
                     var209 -= Class_va.ab;
                     int var296 = Class_bg.e[var280];
                     Class_gk.a(var209, var280, var131, var289, var175, (byte)126, var241, var296);
                     Class_hf.a = -1;
                     return true;
                  } else if (Class_hf.a == 156) {
                     int var71 = Class_f.T.c((byte)88);
                     int var130 = Class_f.T.g(var0 ^ 23604);
                     int var174 = Class_f.T.k(var0 ^ -1355743290);
                     Class_vi.b(-31, var174);
                     Class_rg.d(var71, 93, var130);
                     Class_hf.a = -1;
                     return true;
                  } else if (~Class_hf.a == -102) {
                     int var70 = Class_f.T.h(var0 ^ 29542);
                     Class_ha var129 = Class_tf.a(var70, (byte)-80);
                     var129.fc = 3;
                     var129.V = Class_gg.B.Vb.a(true);
                     Class_tg.a(var129, -128);
                     Class_hf.a = -1;
                     return true;
                  } else if (~Class_hf.a == -177) {
                     boolean var14;
                     long var69;
                     long var173;
                     int var295;
                     int var305;
                     long var310;
                     label1185: {
                        var69 = Class_f.T.j(87);
                        Class_f.T.o(3390);
                        var173 = Class_f.T.j(72);
                        long var240 = Class_f.T.k(1355769544);
                        long var279 = Class_f.T.b((byte)-114);
                        var295 = Class_f.T.n(var0 + 19677);
                        var305 = Class_f.T.k(1355769544);
                        var310 = var279 + (var240 << -1861613600);
                        var14 = false;
                        int var15 = 0;
                        if (var20 != 0) {
                           if (~Class_qb.j[var15] == ~var310) {
                              var14 = true;
                              if (var20 == 0) {
                                 break label1185;
                              }
                           }

                           var15++;
                        }

                        label1183:
                        while (true) {
                           if (var15 >= 100) {
                              if (~var295 >= -2) {
                                 int var16 = 0;
                                 if (var20 != 0 || var16 < Class_ok.bb) {
                                    do {
                                       if (~Class_sg.rb[var16] == ~var69) {
                                          var14 = true;
                                          if (var20 == 0) {
                                             break label1183;
                                          }
                                       }
                                    } while (++var16 < Class_ok.bb);
                                 }
                              }
                              break;
                           }

                           if (~Class_qb.j[var15] == ~var310) {
                              var14 = true;
                              if (var20 == 0) {
                                 break;
                              }
                           }

                           var15++;
                        }
                     }

                     label1157:
                     if (!var14 && ~Class_ub.bb == -1) {
                        Class_qb.j[Class_jk.u] = var310;
                        Class_jk.u = (1 + Class_jk.u) % 100;
                        Class_r var321 = Class_ud.a(var305, (byte)101).a((int)-37, Class_f.T);
                        if (~var295 != -3 && ~var295 != -4) {
                           if (~var295 != -2) {
                              Class_de.a(Class_jd.a(var173, -1).c(12688), -19596, Class_jd.a(var69, -1).c(12688), var305, 20, var321);
                              if (var20 == 0) {
                                 break label1157;
                              }
                           }

                           Class_de.a(
                              Class_jd.a(var173, var0 + 26353).c(var0 + 39042),
                              -19596,
                              Class_o.a(2, new Class_r[]{Class_pi.fb, Class_jd.a(var69, -1).c(12688)}),
                              var305,
                              20,
                              var321
                           );
                           if (var20 == 0) {
                              break label1157;
                           }
                        }

                        Class_de.a(
                           Class_jd.a(var173, -1).c(12688), -19596, Class_o.a(2, new Class_r[]{Class_db.Z, Class_jd.a(var69, -1).c(12688)}), var305, 20, var321
                        );
                     }

                     Class_hf.a = -1;
                     return true;
                  } else if (~Class_hf.a == -140) {
                     Class_bg.a(Class_rj.J, Class_f.T, Class_sf.g, (byte)101);
                     Class_hf.a = -1;
                     return true;
                  } else if (~Class_hf.a == -13) {
                     int var68 = Class_f.T.n(-6677);
                     int var128 = Class_f.T.n(-6677);
                     int var172 = Class_f.T.n(-6677);
                     int var208 = Class_f.T.n(-6677);
                     int var239 = Class_f.T.k(1355769544);
                     Class_lj.e[var68] = true;
                     Class_vb.k[var68] = var128;
                     Class_bf.i[var68] = var172;
                     Class_s.V[var68] = var208;
                     Class_j.T[var68] = var239;
                     Class_hf.a = -1;
                     return true;
                  } else if (Class_hf.a == 178) {
                     long var67;
                     int var278;
                     long var288;
                     boolean var304;
                     label1236: {
                        var67 = Class_f.T.j(var0 + 26477);
                        long var171 = Class_f.T.k(1355769544);
                        var304 = false;
                        long var238 = Class_f.T.b((byte)-112);
                        var278 = Class_f.T.n(var0 ^ 31973);
                        var288 = (var171 << 53194464) + var238;
                        int var308 = 0;
                        if (var20 != 0) {
                           if (Class_qb.j[var308] == var288) {
                              var304 = true;
                              if (var20 == 0) {
                                 break label1236;
                              }
                           }

                           var308++;
                        }

                        label1234:
                        while (true) {
                           if (var308 >= 100) {
                              if (var278 <= 1) {
                                 if (~Class_de.h == -2 || ~Class_ed.m == -2) {
                                    var304 = true;
                                    if (var20 == 0) {
                                       break;
                                    }
                                 }

                                 int var13 = 0;
                                 if (var20 != 0 || Class_ok.bb > var13) {
                                    do {
                                       if (var67 == Class_sg.rb[var13]) {
                                          var304 = true;
                                          if (var20 == 0) {
                                             break label1234;
                                          }
                                       }
                                    } while (Class_ok.bb > ++var13);
                                 }
                              }
                              break;
                           }

                           if (Class_qb.j[var308] == var288) {
                              var304 = true;
                              if (var20 == 0) {
                                 break;
                              }
                           }

                           var308++;
                        }
                     }

                     label1201:
                     if (!var304 && Class_ub.bb == 0) {
                        Class_qb.j[Class_jk.u] = var288;
                        Class_jk.u = (Class_jk.u - -1) % 100;
                        Class_r var309 = Class_af.a(Class_oi.a(27, Class_f.T).g(2));
                        if (var278 == 2 || ~var278 == -4) {
                           Class_he.a(Class_o.a(2, new Class_r[]{Class_db.Z, Class_jd.a(var67, -1).c(12688)}), 126, var309, 7);
                           if (var20 == 0) {
                              break label1201;
                           }
                        }

                        if (~var278 == -2) {
                           Class_he.a(Class_o.a(2, new Class_r[]{Class_pi.fb, Class_jd.a(var67, var0 + 26353).c(12688)}), 125, var309, 7);
                           if (var20 == 0) {
                              break label1201;
                           }
                        }

                        Class_he.a(Class_jd.a(var67, -1).c(var0 + 39042), var0 ^ 26251, var309, 3);
                     }

                     Class_hf.a = -1;
                     return true;
                  } else if (Class_hf.a == 179) {
                     Class_r var66 = Class_f.T.e(127);
                     int var127 = Class_f.T.i(var0 ^ -26260);
                     Class_ha var170 = Class_tf.a(var127, (byte)-80);
                     if (!var66.a(var170.vc, (byte)116)) {
                        var170.vc = var66;
                        Class_tg.a(var170, -115);
                     }

                     Class_hf.a = -1;
                     return true;
                  } else if (Class_hf.a == 100) {
                     int var65 = Class_f.T.g(-15046);
                     byte var126 = Class_f.T.a((byte)46);
                     Class_lc.a(var0 + 26474, var126, var65);
                     Class_hf.a = -1;
                     return true;
                  } else if (~Class_hf.a == -105) {
                     Class_be.a((byte)-127);
                     Class_hf.a = -1;
                     return false;
                  } else if (Class_hf.a == 146) {
                     int var64 = Class_f.T.e((byte)-47);
                     if (var64 == 65535) {
                        var64 = -1;
                     }

                     Class_b.a(79, var64);
                     Class_hf.a = -1;
                     return true;
                  } else if (Class_hf.a == 251) {
                     int var63 = Class_f.T.e((byte)-47);
                     int var125 = Class_f.T.c(false);
                     if (var63 == 65535) {
                        var63 = -1;
                     }

                     Class_rg.a((byte)106, var125, var63);
                     Class_hf.a = -1;
                     return true;
                  } else if (Class_hf.a == 56) {
                     Class_bf.a(-10937);
                     Class_hf.a = -1;
                     return true;
                  } else if (~Class_hf.a == -240) {
                     int var62 = Class_f.T.k(1355769544);
                     int var124 = Class_f.T.d((byte)-92);
                     if (var124 == 2) {
                        Class_lj.a(25);
                     }

                     Class_hj.bb = var62;
                     Class_mk.a(var62, (byte)126);
                     Class_hc.a(false, 640);
                     Class_mc.a(var0 ^ 26353, Class_hj.bb);
                     int var169 = 0;
                     if (var20 != 0) {
                        Class_vb.j[var169] = true;
                        var169++;
                     }

                     while (~var169 > -101) {
                        Class_vb.j[var169] = true;
                        var169++;
                     }

                     Class_hf.a = -1;
                     return true;
                  } else if (Class_hf.a == 135) {
                     int var61;
                     int var123;
                     Class_ha var168;
                     label1253: {
                        var61 = Class_f.T.h(-5528);
                        var123 = Class_f.T.k(1355769544);
                        if (~var61 <= -1) {
                           var168 = Class_tf.a(var61, (byte)-80);
                           if (var20 == 0) {
                              break label1253;
                           }
                        }

                        var168 = null;
                     }

                     if (~var61 > 69999) {
                        var123 += 32768;
                        if (var20 != 0) {
                           int var206 = Class_f.T.f(255);
                           int var236 = Class_f.T.k(1355769544);
                           int var262 = 0;
                           if (var236 != 0) {
                              var262 = Class_f.T.n(-6677);
                              if (~var262 == -256) {
                                 var262 = Class_f.T.h(var0 + 20826);
                              }
                           }

                           if (var168 != null && ~var206 <= -1 && var206 < var168.N.length) {
                              var168.N[var206] = var236;
                              var168.s[var206] = var262;
                           }

                           Class_wh.a(var206, var262, (byte)-67, var123, -1 + var236);
                        }
                     }

                     while (~Class_f.T.p > ~Class_sf.g) {
                        int var207 = Class_f.T.f(255);
                        int var237 = Class_f.T.k(1355769544);
                        int var263 = 0;
                        if (var237 != 0) {
                           var263 = Class_f.T.n(-6677);
                           if (~var263 == -256) {
                              var263 = Class_f.T.h(var0 + 20826);
                           }
                        }

                        if (var168 != null && ~var207 <= -1 && var207 < var168.N.length) {
                           var168.N[var207] = var237;
                           var168.s[var207] = var263;
                        }

                        Class_wh.a(var207, var263, (byte)-67, var123, -1 + var237);
                     }

                     if (var168 != null) {
                        Class_tg.a(var168, var0 + 26234);
                     }

                     Class_lf.f(0);
                     Class_wi.cb[Class_ui.a(31, Class_wj.E++)] = Class_ui.a(32767, var123);
                     Class_hf.a = -1;
                     return true;
                  } else if (Class_hf.a == 120) {
                     int var60 = Class_f.T.p(-22489);
                     int var122 = Class_f.T.d(false);
                     int var167 = Class_f.T.p(-22489);
                     Class_ha var205 = Class_tf.a(var122, (byte)-80);
                     var205.Rc = var205.cd = var167;
                     var205.mb = 0;
                     var205.Sc = 0;
                     var205.hb = var205.cb = var60;
                     Class_tg.a(var205, var0 + 26228);
                     Class_hf.a = -1;
                     return true;
                  } else if (~Class_hf.a == -235) {
                     long var59 = Class_f.T.j(86);
                     int var166 = Class_f.T.k(1355769544);
                     Class_r var204 = Class_ud.a(var166, (byte)96).a(114, Class_f.T);
                     Class_de.a(null, -19596, Class_jd.a(var59, -1).c(12688), var166, 19, var204);
                     Class_hf.a = -1;
                     return true;
                  } else if (~Class_hf.a == -185) {
                     int var58 = Class_f.T.h(-5528);
                     int var121 = Class_f.T.e((byte)-47);
                     int var235 = var121 & 31;
                     int var165 = (var121 & 32447) >> 25808906;
                     int var203 = (var121 & 1023) >> -1941183739;
                     int var261 = (var165 << 1507059315) + (var203 << -2092832469) + (var235 << -944266717);
                     Class_ha var277 = Class_tf.a(var58, (byte)-80);
                     if (var277.yb != var261) {
                        var277.yb = var261;
                        Class_tg.a(var277, -123);
                     }

                     Class_hf.a = -1;
                     return true;
                  } else if (Class_hf.a == 137) {
                     label1280: {
                        int var57 = Class_f.T.n(-6677);
                        if (Class_f.T.n(-6677) == 0) {
                           Class_kh.c[var57] = new Class_hf();
                           if (var20 == 0) {
                              break label1280;
                           }
                        }

                        Class_f.T.p--;
                        Class_kh.c[var57] = new Class_hf(Class_f.T);
                     }

                     Class_ae.d = Class_qd.F;
                     Class_hf.a = -1;
                     return true;
                  } else if (Class_hf.a == 249) {
                     Class_dd.cb = Class_f.T.n(-6677);
                     Class_pd.i = Class_f.T.n(-6677);
                     int var56 = Class_pd.i;
                     if (var20 != 0 || ~(Class_pd.i + 8) < ~var56) {
                        do {
                           int var119 = Class_dd.cb;
                           if (var20 != 0 || ~var119 > ~(8 + Class_dd.cb)) {
                              do {
                                 if (Class_ha.od[Class_jk.F][var56][var119] != null) {
                                    Class_ha.od[Class_jk.F][var56][var119] = null;
                                    Class_ic.a(var56, (byte)-52, var119);
                                 }
                              } while (~(++var119) > ~(8 + Class_dd.cb));
                           }
                        } while (~(Class_pd.i + 8) < ~(++var56));
                     }

                     Class_ai var120 = (Class_ai)Class_se.Z.e((byte)76);
                     if (var20 == 0 && var120 == null) {
                        Class_hf.a = -1;
                        return true;
                     } else {
                        do {
                           if (~var120.x <= ~Class_pd.i
                              && ~(Class_pd.i + 8) < ~var120.x
                              && var120.q >= Class_dd.cb
                              && 8 + Class_dd.cb > var120.q
                              && var120.v == Class_jk.F) {
                              var120.C = 0;
                           }

                           var120 = (Class_ai)Class_se.Z.c((byte)-105);
                        } while (var120 != null);

                        Class_hf.a = -1;
                        return true;
                     }
                  } else if (Class_hf.a == 119) {
                     int var55 = Class_f.T.k(1355769544);
                     if (var55 == 65535) {
                        var55 = -1;
                     }

                     int var118 = Class_f.T.n(-6677);
                     int var164 = Class_f.T.k(var0 ^ -1355743290);
                     Class_je.a((byte)122, var164, var118, var55);
                     Class_hf.a = -1;
                     return true;
                  } else if (Class_hf.a == 170) {
                     Class_r var54 = Class_f.T.e(127);
                     int var117 = Class_f.T.e((byte)-47);
                     int var163 = Class_f.T.e((byte)-47);
                     Class_vi.b(-21, var117);
                     Class_ee.a((byte)120, var163, var54);
                     Class_hf.a = -1;
                     return true;
                  } else if (Class_hf.a == 222) {
                     Class_me.a(false);
                     Class_hf.a = -1;
                     return true;
                  } else if (Class_hf.a == 8) {
                     Class_sc.j = 30 * Class_f.T.e((byte)-47);
                     Class_ec.I = Class_qd.F;
                     Class_hf.a = -1;
                     return true;
                  } else if (Class_hf.a == 219) {
                     int var24 = Class_f.T.i(19);
                     Class_ha var84 = Class_tf.a(var24, (byte)-80);
                     int var138 = 0;
                     if (var20 != 0) {
                        var84.N[var138] = -1;
                        var84.N[var138] = 0;
                        var138++;
                     }

                     while (var138 < var84.N.length) {
                        var84.N[var138] = -1;
                        var84.N[var138] = 0;
                        var138++;
                     }

                     Class_tg.a(var84, var0 + 26236);
                     Class_hf.a = -1;
                     return true;
                  } else if (Class_hf.a == 172) {
                     int var53 = Class_f.T.h(var0 + 20826);
                     Class_kg.D = Class_rj.J.a(var53, var0 + 26354);
                     Class_hf.a = -1;
                     return true;
                  } else if (~Class_hf.a == -83) {
                     Class_hk.J = Class_qd.F;
                     long var52 = Class_f.T.j(97);
                     if (var52 == 0L) {
                        Class_gj.S = 0;
                        Class_hf.a = -1;
                        Class_o.ib = null;
                        Class_lj.s = null;
                        Class_pa.y = null;
                        return true;
                     } else {
                        long var162 = Class_f.T.j(100);
                        Class_lj.s = Class_jd.a(var162, var0 + 26353);
                        Class_pa.y = Class_jd.a(var52, var0 + 26353);
                        Class_uc.O = Class_f.T.o(3390);
                        int var234 = Class_f.T.n(-6677);
                        if (~var234 == -256) {
                           Class_hf.a = -1;
                           return true;
                        } else {
                           Class_gj.S = var234;
                           Class_oi[] var260 = new Class_oi[100];
                           int var276 = 0;
                           if (var20 != 0) {
                              var260[var276] = new Class_oi();
                              var260[var276].a = Class_f.T.j(98);
                              var260[var276].x = Class_jd.a(var260[var276].a, -1);
                              var260[var276].r = Class_f.T.k(1355769544);
                              var260[var276].z = Class_f.T.o(3390);
                              var260[var276].A = Class_f.T.e(var0 ^ -26255);
                              if (var260[var276].a == Class_ak.X) {
                                 Class_li.h = var260[var276].z;
                              }

                              var276++;
                           }

                           for (; Class_gj.S > var276; var276++) {
                              var260[var276] = new Class_oi();
                              var260[var276].a = Class_f.T.j(98);
                              var260[var276].x = Class_jd.a(var260[var276].a, -1);
                              var260[var276].r = Class_f.T.k(1355769544);
                              var260[var276].z = Class_f.T.o(3390);
                              var260[var276].A = Class_f.T.e(var0 ^ -26255);
                              if (var260[var276].a == Class_ak.X) {
                                 Class_li.h = var260[var276].z;
                              }
                           }

                           boolean var286 = false;
                           int var303 = Class_gj.S;
                           if (var20 != 0 || ~var303 < -1) {
                              do {
                                 var303--;
                                 var286 = true;
                                 int var12 = 0;
                                 if (var20 != 0 || var303 > var12) {
                                    do {
                                       if (var260[var12].x.b(false, var260[var12 + 1].x) > 0) {
                                          Class_oi var294 = var260[var12];
                                          var286 = false;
                                          var260[var12] = var260[1 + var12];
                                          var260[1 + var12] = var294;
                                       }
                                    } while (var303 > ++var12);
                                 }
                              } while ((!var286 || var20 != 0) && ~var303 < -1);
                           }

                           Class_o.ib = var260;
                           Class_hf.a = -1;
                           return true;
                        }
                     }
                  } else if (Class_hf.a == 40) {
                     int var51 = Class_f.T.k(var0 ^ -1355743290);
                     int var116 = Class_f.T.d(108);
                     Class_c.w = var116;
                     Class_ba.z = var51;
                     Class_m.d((byte)-100);
                     Class_hf.a = -1;
                     return true;
                  } else if (~Class_hf.a == -38) {
                     Class_lf.f(0);
                     Class_rh.s = Class_f.T.p(-22489);
                     Class_ec.I = Class_qd.F;
                     Class_hf.a = -1;
                     return true;
                  } else if (~Class_hf.a == -60) {
                     boolean var50 = Class_f.T.r(-107) == 1;
                     int var115 = Class_f.T.i(16);
                     Class_ha var161 = Class_tf.a(var115, (byte)-80);
                     if (var161.i == !var50) {
                        var161.i = var50;
                        Class_tg.a(var161, -120);
                     }

                     Class_hf.a = -1;
                     return true;
                  } else if (~Class_hf.a == -227) {
                     Class_kc.q = Class_f.T.n(-6677);
                     Class_hf.a = -1;
                     return true;
                  } else if (Class_hf.a == 247) {
                     int var49 = Class_f.T.g(var0 ^ 23604);
                     int var114 = Class_f.T.r(var0 ^ 26308);
                     int var160 = Class_f.T.e((byte)-47);
                     Class_vi.b(-119, var49);
                     Class_rg.d(var114, var0 + 26475, var160);
                     Class_hf.a = -1;
                     return true;
                  } else if (~Class_hf.a == -178) {
                     Class_dd.cb = Class_f.T.n(-6677);
                     Class_pd.i = Class_f.T.m(59);
                     Class_hf.a = -1;
                     return true;
                  } else if (~Class_hf.a == -141) {
                     label1373: {
                        int var48 = Class_f.T.k(var0 ^ -1355743290);
                        int var113 = Class_f.T.h(-5528);
                        int var159 = Class_f.T.d(-96);
                        int var202 = Class_f.T.k(1355769544);
                        if (var113 >> -314135746 == 0) {
                           if (~(var113 >> 1271725373) != -1) {
                              int var231 = var113 & 65535;
                              Class_eh var256 = Class_rf.a[var231];
                              if (var256 == null) {
                                 break label1373;
                              }

                              var256.Gb = 0;
                              var256.Y = var159;
                              if (~var256.Y == -65536) {
                                 var256.Y = -1;
                              }

                              var256.yb = 0;
                              var256.gb = var202;
                              var256.N = Class_be.C + var48;
                              if (~var256.N >= ~Class_be.C) {
                                 break label1373;
                              }

                              var256.yb = -1;
                              if (var20 == 0) {
                                 break label1373;
                              }
                           }

                           if (var113 >> 678636924 == 0) {
                              break label1373;
                           }

                           Class_fa var257;
                           label1367: {
                              int var232 = 65535 & var113;
                              if (~Class_kg.A != ~var232) {
                                 var257 = Class_db.Q[var232];
                                 if (var20 == 0) {
                                    break label1367;
                                 }
                              }

                              var257 = Class_gg.B;
                           }

                           if (var257 == null) {
                              break label1373;
                           }

                           var257.N = var48 + Class_be.C;
                           var257.Y = var159;
                           var257.gb = var202;
                           if (~var257.Y == -65536) {
                              var257.Y = -1;
                           }

                           var257.Gb = 0;
                           var257.yb = 0;
                           if (~var257.N >= ~Class_be.C) {
                              break label1373;
                           }

                           var257.yb = -1;
                           if (var20 == 0) {
                              break label1373;
                           }
                        }

                        int var233 = var113 >> 1381623388 & 3;
                        int var258 = -Class_fj.e + (16383 & var113 >> 1195453614);
                        int var274 = (var113 & 16383) + -Class_va.ab;
                        if (var258 >= 0 && var274 >= 0 && var258 < 104 && ~var274 > -105) {
                           var258 = 64 + 128 * var258;
                           var274 = var274 * 128 + 64;
                           Class_qe var285 = new Class_qe(
                              var159, var233, var258, var274, -var202 + Class_fa.a(var258, var233, var274, false), var48, Class_be.C
                           );
                           Class_sd.a.a(new Class_ec(var285), true);
                        }
                     }

                     Class_hf.a = -1;
                     return true;
                  } else if (Class_hf.a == 174) {
                     int var47 = Class_f.T.k(1355769544);
                     int var112 = Class_f.T.d(-49);
                     int var158 = Class_f.T.d(false);
                     Class_ha var201 = Class_tf.a(var158, (byte)-80);
                     Class_hf.a = -1;
                     var201.Yc = (var47 << 1980630896) - -var112;
                     return true;
                  } else if (Class_hf.a == 216) {
                     Class_ph.a((byte)-108);
                     Class_hf.a = -1;
                     return true;
                  } else if (~Class_hf.a == -246) {
                     int var46 = Class_f.T.d(false);
                     int var111 = Class_f.T.p(-22489);
                     Class_ha var157 = Class_tf.a(var46, (byte)-80);
                     if (~var157.xb != ~var111 || ~var111 == 0) {
                        var157.p = 0;
                        var157.xb = var111;
                        var157.a = 0;
                        Class_tg.a(var157, -122);
                     }

                     Class_hf.a = -1;
                     return true;
                  } else if (Class_hf.a == 118) {
                     int var45 = Class_f.T.h(-5528);
                     int var110 = Class_f.T.h(-5528);
                     Class_be var156 = (Class_be)Class_nj.p.a(var45, 88);
                     Class_be var200 = (Class_be)Class_nj.p.a(var110, 111);
                     if (var200 != null) {
                        Class_hj.a(var200, true, var156 == null || var156.t != var200.t);
                     }

                     if (var156 != null) {
                        var156.c(-17554);
                        Class_nj.p.a((byte)127, var156, var110);
                     }

                     Class_ha var229 = Class_tf.a(var45, (byte)-80);
                     if (var229 != null) {
                        Class_tg.a(var229, -115);
                     }

                     var229 = Class_tf.a(var110, (byte)-80);
                     if (var229 != null) {
                        Class_tg.a(var229, -122);
                        Class_pi.a(-1, true, var229);
                     }

                     if (~Class_hj.bb != 0) {
                        Class_ua.a(var0 + 26449, Class_hj.bb, 1);
                     }

                     Class_hf.a = -1;
                     return true;
                  } else if (Class_hf.a == 211) {
                     int var44 = Class_f.T.n(-6677);
                     int var109 = Class_f.T.n(-6677);
                     int var155 = Class_f.T.k(1355769544);
                     int var199 = Class_f.T.n(-6677);
                     int var228 = Class_f.T.n(var0 + 19677);
                     Class_te.a(var44, var109, var228, var199, -118, var155, true);
                     Class_hf.a = -1;
                     return true;
                  } else if (Class_hf.a == 10) {
                     int var43 = Class_f.T.m(104);
                     int var108 = Class_f.T.e((byte)-47);
                     int var154 = Class_f.T.e((byte)-47);
                     Class_eh var198 = Class_rf.a[var154];
                     if (var198 != null) {
                        Class_rc.a(0, var108, var198, var43);
                     }

                     Class_hf.a = -1;
                     return true;
                  } else if (~Class_hf.a == -109) {
                     Class_uh.b(var0 + 26430);
                     Class_lf.f(0);
                     Class_dc.r += 32;
                     Class_hf.a = -1;
                     return true;
                  } else if (~Class_hf.a == -253) {
                     int var42 = Class_f.T.r(var0 ^ -26367);
                     Class_r var107 = Class_f.T.e(127);
                     int var153 = Class_f.T.r(22);
                     if (~var153 <= -2 && ~var153 >= -9) {
                        if (var107.a(false, Class_td.U)) {
                           var107 = null;
                        }

                        Class_wg.f[var153 - 1] = var107;
                        Class_ud.f[-1 + var153] = var42 == 0;
                     }

                     Class_hf.a = -1;
                     return true;
                  } else if (~Class_hf.a == -50) {
                     int var41 = Class_f.T.d(-82);
                     int var106 = Class_f.T.k(var0 + 1355795898);
                     int var152 = Class_f.T.c((byte)123);
                     int var197 = Class_f.T.d(102);
                     Class_ha var227 = Class_tf.a(var152, (byte)-80);
                     if (~var41 != ~var227.ec || var197 != var227.gb || ~var227.g != ~var106) {
                        var227.g = var106;
                        var227.ec = var41;
                        var227.gb = var197;
                        Class_tg.a(var227, -120);
                     }

                     Class_hf.a = -1;
                     return true;
                  } else if (~Class_hf.a == -153) {
                     Class_r var25 = Class_f.T.e(127);
                     Object[] var85 = new Object[1 + var25.d((byte)-119)];
                     int var139 = -1 + var25.d((byte)-100);
                     if (var20 == 0 && var139 < 0) {
                        var85[0] = new Integer(Class_f.T.h(-5528));
                        Class_wj var192 = new Class_wj();
                        var192.x = var85;
                        Class_j.a(var192, 16);
                        Class_hf.a = -1;
                        return true;
                     } else {
                        do {
                           if (var25.a(var139, 7178) == 115) {
                              var85[var139 - -1] = Class_f.T.e(var0 + 26481);
                              if (var20 != 0) {
                                 var85[1 + var139] = new Integer(Class_f.T.h(Class_bj.a(var0, 29542)));
                                 var139--;
                              } else {
                                 var139--;
                              }
                           } else {
                              var85[1 + var139] = new Integer(Class_f.T.h(Class_bj.a(var0, 29542)));
                              var139--;
                           }
                        } while (var139 >= 0);

                        var85[0] = new Integer(Class_f.T.h(-5528));
                        Class_wj var191 = new Class_wj();
                        var191.x = var85;
                        Class_j.a(var191, 16);
                        Class_hf.a = -1;
                        return true;
                     }
                  } else if (Class_hf.a == 173) {
                     Class_ii.a((byte)95, true);
                     Class_hf.a = -1;
                     return true;
                  } else if (Class_hf.a == 109) {
                     int var40 = Class_f.T.h(-5528);
                     int var105 = Class_f.T.d(-60);
                     Class_l.c(var0 ^ -26354, var40, var105);
                     Class_hf.a = -1;
                     return true;
                  } else if (~Class_hf.a == -194) {
                     int var39 = Class_f.T.n(-6677);
                     int var104 = Class_f.T.n(-6677);
                     int var151 = Class_f.T.k(1355769544);
                     int var196 = Class_f.T.n(-6677);
                     int var226 = Class_f.T.n(-6677);
                     Class_og.a(var196, var151, var39, true, var104, var226);
                     Class_hf.a = -1;
                     return true;
                  } else if (Class_hf.a == 38) {
                     int var26 = 0;
                     if (var20 == 0 && Class_sb.i.length <= var26) {
                        Class_hf.a = -1;
                        return true;
                     } else {
                        do {
                           if (Class_sb.i[var26] != Class_ad.g[var26]) {
                              Class_sb.i[var26] = Class_ad.g[var26];
                              Class_va.b((byte)67, var26);
                              Class_u.ab[Class_ui.a(Class_dc.r++, 31)] = var26;
                           }
                        } while (Class_sb.i.length > ++var26);

                        Class_hf.a = -1;
                        return true;
                     }
                  } else if (Class_hf.a == 6) {
                     int var38 = Class_f.T.d(false);
                     int var103 = Class_f.T.d(-43);
                     Class_ha var150 = Class_tf.a(var38, (byte)-80);
                     if (~var103 == -65536) {
                        var103 = -1;
                     }

                     if (var150.fc != 2 || var150.V != var103) {
                        var150.V = var103;
                        var150.fc = 2;
                        Class_tg.a(var150, -113);
                     }

                     Class_hf.a = -1;
                     return true;
                  } else if (Class_hf.a == 205) {
                     label1411: {
                        if (~Class_sf.g == -1) {
                           Class_g.h = Class_te.Q;
                           if (var20 == 0) {
                              break label1411;
                           }
                        }

                        Class_g.h = Class_f.T.e(var0 ^ -26255);
                     }

                     Class_hf.a = -1;
                     return true;
                  } else if (Class_hf.a == 218) {
                     label1948: {
                        Class_r var37 = Class_f.T.e(var0 ^ -26255);
                        if (!var37.a(Class_lf.t, true)) {
                           if (!var37.a(Class_ba.B, true)) {
                              if (var37.a(Class_qd.D, true)) {
                                 Class_r var94 = var37.a(0, (byte)-74, var37.a(83, Class_bh.f));
                                 long var144 = var94.f(10908);
                                 boolean var220 = false;
                                 int var250 = 0;
                                 if (var20 != 0 || ~var250 > ~Class_ok.bb) {
                                    do {
                                       if (~var144 == ~Class_sg.rb[var250]) {
                                          var220 = true;
                                          if (var20 == 0) {
                                             break;
                                          }
                                       }
                                    } while (~(++var250) > ~Class_ok.bb);
                                 }

                                 if (var220 || Class_ub.bb != 0) {
                                    break label1948;
                                 }

                                 Class_he.a(var94, -110, Class_hk.S, 10);
                                 if (var20 == 0) {
                                    break label1948;
                                 }
                              }

                              if (var37.a(Class_nk.f, true)) {
                                 Class_r var95 = var37.a(0, (byte)-74, var37.a(-71, Class_nk.f));
                                 Class_he.a(Class_hk.S, 126, var95, 11);
                                 if (var20 == 0) {
                                    break label1948;
                                 }
                              }

                              if (!var37.a(Class_wg.j, true)) {
                                 if (!var37.a(Class_sc.c, true)) {
                                    if (var37.a(Class_kj.K, true)) {
                                       Class_r var96 = var37.a(0, (byte)-74, var37.a(37, Class_bh.f));
                                       long var145 = var96.f(var0 ^ -19566);
                                       boolean var221 = false;
                                       int var251 = 0;
                                       if (var20 != 0 || ~var251 > ~Class_ok.bb) {
                                          do {
                                             if (var145 == Class_sg.rb[var251]) {
                                                var221 = true;
                                                if (var20 == 0) {
                                                   break;
                                                }
                                             }
                                          } while (~(++var251) > ~Class_ok.bb);
                                       }

                                       if (var221 || ~Class_ub.bb != -1) {
                                          break label1948;
                                       }

                                       Class_he.a(var96, var0 ^ 26289, Class_hk.S, 14);
                                       if (var20 == 0) {
                                          break label1948;
                                       }
                                    }

                                    if (var37.a(Class_tf.S, true)) {
                                       Class_r var97 = var37.a(0, (byte)-74, var37.a(-90, Class_bh.f));
                                       long var146 = var97.f(10908);
                                       boolean var222 = false;
                                       int var252 = 0;
                                       if (var20 != 0 || ~Class_ok.bb < ~var252) {
                                          do {
                                             if (~var146 == ~Class_sg.rb[var252]) {
                                                var222 = true;
                                                if (var20 == 0) {
                                                   break;
                                                }
                                             }
                                          } while (~Class_ok.bb < ~(++var252));
                                       }

                                       if (var222 || Class_ub.bb != 0) {
                                          break label1948;
                                       }

                                       Class_he.a(var97, -108, Class_hk.S, 15);
                                       if (var20 == 0) {
                                          break label1948;
                                       }
                                    }

                                    if (!var37.a(Class_ka.Q, true)) {
                                       Class_he.a(Class_hk.S, 127, var37, 0);
                                       if (var20 == 0) {
                                          break label1948;
                                       }
                                    }

                                    Class_r var98 = var37.a(0, (byte)-74, var37.a(63, Class_bh.f));
                                    long var147 = var98.f(var0 ^ -19566);
                                    boolean var223 = false;
                                    int var253 = 0;
                                    if (var20 != 0 || Class_ok.bb > var253) {
                                       do {
                                          if (~Class_sg.rb[var253] == ~var147) {
                                             var223 = true;
                                             if (var20 == 0) {
                                                break;
                                             }
                                          }
                                       } while (Class_ok.bb > ++var253);
                                    }

                                    if (var223 || Class_ub.bb != 0) {
                                       break label1948;
                                    }

                                    Class_he.a(var98, var0 ^ 26240, Class_hk.S, 16);
                                    if (var20 == 0) {
                                       break label1948;
                                    }
                                 }

                                 Class_r var99 = var37.a(0, (byte)-74, var37.a(-113, Class_sc.c));
                                 if (Class_ub.bb != 0) {
                                    break label1948;
                                 }

                                 Class_he.a(Class_hk.S, -12, var99, 13);
                                 if (var20 == 0) {
                                    break label1948;
                                 }
                              }

                              Class_r var100 = var37.a(0, (byte)-74, var37.a(-57, Class_wg.j));
                              if (~Class_ub.bb != -1) {
                                 break label1948;
                              }

                              Class_he.a(Class_hk.S, var0 + 26270, var100, 12);
                              if (var20 == 0) {
                                 break label1948;
                              }
                           }

                           Class_r var101 = var37.a(0, (byte)-74, var37.a(89, Class_bh.f));
                           long var148 = var101.f(10908);
                           boolean var224 = false;
                           int var254 = 0;
                           if (var20 != 0 || ~var254 > ~Class_ok.bb) {
                              do {
                                 if (Class_sg.rb[var254] == var148) {
                                    var224 = true;
                                    if (var20 == 0) {
                                       break;
                                    }
                                 }
                              } while (~(++var254) > ~Class_ok.bb);
                           }

                           if (var224 || Class_ub.bb != 0) {
                              break label1948;
                           }

                           Class_r var273 = var37.a(var37.a(-126, Class_bh.f) + 1, (byte)-74, var37.d((byte)-121) + -9);
                           Class_he.a(var101, -112, var273, 8);
                           if (var20 == 0) {
                              break label1948;
                           }
                        }

                        Class_r var102 = var37.a(0, (byte)-74, var37.a(var0 ^ 26253, Class_bh.f));
                        long var149 = var102.f(10908);
                        boolean var225 = false;
                        int var255 = 0;
                        if (var20 != 0 || ~var255 > ~Class_ok.bb) {
                           do {
                              if (Class_sg.rb[var255] == var149) {
                                 var225 = true;
                                 if (var20 == 0) {
                                    break;
                                 }
                              }
                           } while (~(++var255) > ~Class_ok.bb);
                        }

                        if (!var225 && ~Class_ub.bb == -1) {
                           Class_he.a(var102, var0 ^ 26264, Class_md.v, 4);
                        }
                     }

                     Class_hf.a = -1;
                     return true;
                  } else if (~Class_hf.a == -145) {
                     byte[] var36 = new byte[Class_sf.g];
                     Class_f.T.a(var36, Class_sf.g, 0, false);
                     Class_eh.a(Class_pi.a(Class_sf.g, var36, 104, 0), true, -125);
                     Class_hf.a = -1;
                     return true;
                  } else if (~Class_hf.a == -4) {
                     Class_hf.a = -1;
                     Class_ph.f = 0;
                     return true;
                  } else if (Class_hf.a == 161) {
                     int var35 = Class_f.T.k(1355769544);
                     int var93 = Class_f.T.i(55);
                     Class_lc.a(95, var93, var35);
                     Class_hf.a = -1;
                     return true;
                  } else if (~Class_hf.a == -228) {
                     int var34 = Class_f.T.n(-6677);
                     int var92 = var34 >> -577809018;
                     Class_d var143 = new Class_d();
                     var143.a = var34 & 63;
                     var143.k = Class_f.T.n(-6677);
                     if (~var143.k <= -1 && ~var143.k > ~Class_ia.ib.length) {
                        label1940: {
                           if (~var143.a == -2 || var143.a == 10) {
                              var143.e = Class_f.T.k(1355769544);
                              Class_f.T.p += 3;
                              if (var20 == 0) {
                                 break label1940;
                              }
                           }

                           if (~var143.a <= -3 && ~var143.a >= -7) {
                              if (var143.a == 2) {
                                 var143.n = 64;
                                 var143.o = 64;
                              }

                              if (~var143.a == -4) {
                                 var143.n = 0;
                                 var143.o = 64;
                              }

                              if (var143.a == 4) {
                                 var143.o = 64;
                                 var143.n = 128;
                              }

                              if (var143.a == 5) {
                                 var143.o = 0;
                                 var143.n = 64;
                              }

                              if (var143.a == 6) {
                                 var143.o = 128;
                                 var143.n = 64;
                              }

                              var143.a = 2;
                              var143.h = Class_f.T.k(1355769544);
                              var143.d = Class_f.T.k(1355769544);
                              var143.i = Class_f.T.n(-6677);
                           }
                        }

                        var143.g = Class_f.T.k(1355769544);
                        if (var143.g == 65535) {
                           var143.g = -1;
                        }

                        Class_fd.d[var92] = var143;
                     }

                     Class_hf.a = -1;
                     return true;
                  } else if (Class_hf.a == 190) {
                     int var33 = Class_f.T.k(var0 + 1355795898);
                     Class_ak.a(var33, -107);
                     Class_wi.cb[Class_ui.a(31, Class_wj.E++)] = Class_ui.a(var33, 32767);
                     Class_hf.a = -1;
                     return true;
                  } else if (Class_hf.a == 246) {
                     int var32 = Class_f.T.h(var0 + 20826);
                     Class_be var91 = (Class_be)Class_nj.p.a(var32, 107);
                     if (var91 != null) {
                        Class_hj.a(var91, true, true);
                     }

                     if (Class_eb.f != null) {
                        Class_tg.a(Class_eb.f, -125);
                        Class_eb.f = null;
                     }

                     Class_hf.a = -1;
                     return true;
                  } else if (~Class_hf.a == -192) {
                     Class_r var31 = Class_f.T.e(127);
                     int var90 = Class_f.T.d(-91);
                     int var142 = Class_f.T.e((byte)-47);
                     Class_vi.b(-55, var142);
                     Class_ee.a((byte)88, var90, var31);
                     Class_hf.a = -1;
                     return true;
                  } else if (~Class_hf.a == -256) {
                     int var30;
                     int var89;
                     Class_ha var141;
                     label1582: {
                        var30 = Class_f.T.h(-5528);
                        var89 = Class_f.T.k(1355769544);
                        if (var30 >= 0) {
                           var141 = Class_tf.a(var30, (byte)-80);
                           if (var20 == 0) {
                              break label1582;
                           }
                        }

                        var141 = null;
                     }

                     if (var141 != null) {
                        int var194 = 0;
                        if (var20 != 0 || ~var194 > ~var141.N.length) {
                           do {
                              var141.N[var194] = 0;
                              var141.s[var194] = 0;
                           } while (~(++var194) > ~var141.N.length);
                        }
                     }

                     if (var30 < -70000) {
                        var89 += 32768;
                     }

                     Class_bf.a(var89, (byte)45);
                     int var195 = Class_f.T.k(var0 ^ -1355743290);
                     int var219 = 0;
                     if (var20 == 0 && ~var195 >= ~var219) {
                        if (var141 != null) {
                           Class_tg.a(var141, -118);
                        }

                        Class_lf.f(0);
                        Class_wi.cb[Class_ui.a(Class_wj.E++, 31)] = Class_ui.a(32767, var89);
                        Class_hf.a = -1;
                        return true;
                     } else {
                        do {
                           int var249 = Class_f.T.m(97);
                           if (var249 == 255) {
                              var249 = Class_f.T.d(false);
                           }

                           int var272 = Class_f.T.d(var0 ^ -26265);
                           if (var141 != null && var141.N.length > var219) {
                              var141.N[var219] = var272;
                              var141.s[var219] = var249;
                           }

                           Class_wh.a(var219, var249, (byte)-32, var89, var272 + -1);
                        } while (~var195 < ~(++var219));

                        if (var141 != null) {
                           Class_tg.a(var141, -118);
                        }

                        Class_lf.f(0);
                        Class_wi.cb[Class_ui.a(Class_wj.E++, 31)] = Class_ui.a(32767, var89);
                        Class_hf.a = -1;
                        return true;
                     }
                  } else if (~Class_hf.a == -2) {
                     int var29 = Class_f.T.m(var0 ^ -26297);
                     int var88 = Class_f.T.e((byte)-47);
                     Class_l.c(var0 ^ -26354, var29, var88);
                     Class_hf.a = -1;
                     return true;
                  } else if (Class_hf.a == 99) {
                     Class_lf.f(0);
                     Class_ic.N = Class_f.T.n(-6677);
                     Class_ec.I = Class_qd.F;
                     Class_hf.a = -1;
                     return true;
                  } else if (Class_hf.a == 35) {
                     int var28 = Class_f.T.d(false);
                     int var87 = Class_f.T.c((byte)103);
                     int var140 = Class_f.T.e((byte)-47);
                     Class_ha var193 = Class_tf.a(var28, (byte)-80);
                     if (var140 == 65535) {
                        var140 = -1;
                     }

                     label1906: {
                        if (!var193.dc) {
                           if (var140 == -1) {
                              Class_hf.a = -1;
                              var193.fc = 0;
                              return true;
                           }

                           Class_cf var217 = Class_ra.a(var0 ^ 694, var140);
                           var193.gb = var217.qb;
                           var193.ec = var217.kb;
                           var193.V = var140;
                           var193.g = 100 * var217.j / var87;
                           var193.fc = 4;
                           Class_tg.a(var193, var0 + 26234);
                           if (var20 == 0) {
                              break label1906;
                           }
                        }

                        label1589: {
                           var193.dd = var87;
                           var193.Q = var140;
                           Class_cf var218 = Class_ra.a(-25672, var140);
                           var193.gb = var218.qb;
                           var193.Tb = var218.C;
                           var193.ec = var218.kb;
                           var193.z = var218.F;
                           var193.Ib = var218.mb;
                           var193.g = var218.j;
                           if (var193.L > 0) {
                              var193.g = 32 * var193.g / var193.L;
                              if (var20 == 0) {
                                 break label1589;
                              }
                           }

                           if (var193.r > 0) {
                              var193.g = 32 * var193.g / var193.r;
                           }
                        }

                        Class_tg.a(var193, -126);
                     }

                     Class_hf.a = -1;
                     return true;
                  } else if (Class_hf.a != 114) {
                     Class_mc.a("T1 - " + Class_hf.a + "," + Class_fe.T + "," + Class_fh.I + " - " + Class_sf.g, null, 38);
                     Class_be.a((byte)-116);
                     return true;
                  } else {
                     int var27 = 0;
                     if (var20 != 0 || Class_db.Q.length > var27) {
                        do {
                           if (Class_db.Q[var27] != null) {
                              Class_db.Q[var27].ob = -1;
                           }
                        } while (Class_db.Q.length > ++var27);
                     }

                     int var86 = 0;
                     if (var20 == 0 && Class_rf.a.length <= var86) {
                        Class_hf.a = -1;
                        return true;
                     } else {
                        do {
                           if (Class_rf.a[var86] != null) {
                              Class_rf.a[var86].ob = -1;
                           }
                        } while (Class_rf.a.length > ++var86);

                        Class_hf.a = -1;
                        return true;
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var21) {
         throw Class_sh.a(var21, "tb.D(" + var0 + ')');
      }
   }
}
