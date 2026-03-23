abstract class Class_qj extends Class_pe {
   static int I;
   static int J;
   static int K;
   static Class_qc L = new Class_qc(64);
   static int M;
   static int N;
   static int O;
   static int P = 0;
   static Class_hg Q;
   static volatile int R = -1;
   static Class_tg S = new Class_tg(32);
   static int[] T;
   static int U = 0;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(byte var0, long var1) {
      int var6 = client.lb;

      try {
         N++;
         if (~var1 != -1L) {
            if ((Class_ek.n < 100 || Class_df.a == 1) && Class_ek.n < 200) {
               Class_r var3 = Class_jd.a(var1, -1).c(12688);
               int var4 = 0;
               if (var6 != 0 || var4 < Class_ek.n) {
                  do {
                     if (~var1 == ~Class_ma.hb[var4]) {
                        Class_he.a(Class_hk.S, 127, Class_o.a(2, new Class_r[]{var3, Class_hg.h}), 0);
                        return;
                     }
                  } while (++var4 < Class_ek.n);
               }

               int var5 = 0;
               if (var6 != 0) {
                  if (Class_sg.rb[var5] == var1) {
                     Class_he.a(Class_hk.S, 126, Class_o.a(2, new Class_r[]{Class_rd.bb, var3, Class_mj.c}), 0);
                     return;
                  }

                  var5++;
               }

               while (var5 < Class_ok.bb) {
                  if (Class_sg.rb[var5] == var1) {
                     Class_he.a(Class_hk.S, 126, Class_o.a(2, new Class_r[]{Class_rd.bb, var3, Class_mj.c}), 0);
                     return;
                  }

                  var5++;
               }

               if (var3.a(Class_gg.B.Zb, (byte)99)) {
                  Class_he.a(Class_hk.S, -89, Class_jc.r, 0);
               } else {
                  Class_vi.W[Class_ek.n] = var3;
                  Class_jb.R++;
                  Class_ma.hb[Class_ek.n] = var1;
                  Class_qc.e[Class_ek.n] = 0;
                  Class_aa.p[Class_ek.n] = Class_hk.S;
                  Class_dc.E[Class_ek.n] = 0;
                  Class_s.bb[Class_ek.n] = false;
                  Class_ek.n++;
                  Class_vf.l = Class_qd.F;
                  if (var0 > 89) {
                     Class_cj.S.o(113, 30);
                     Class_cj.S.a(true, var1);
                  }
               }
            } else {
               Class_he.a(Class_hk.S, -74, Class_ma.ab, 0);
            }
         }
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "qj.F(" + var0 + ',' + var1 + ')');
      }
   }

   static final void a(int var0, int var1, int var2, int var3, boolean var4) {
      try {
         O++;
         if (!var4) {
            L = null;
         }

         if (~(var3 - var2) <= ~Class_ga.v && var3 - -var2 <= Class_tg.r && ~(var1 - var2) <= ~Class_ff.d && Class_hh.h >= var2 + var1) {
            Class_jb.a(var0, var4, var2, var3, var1);
         } else {
            Class_la.a((byte)83, var0, var3, var2, var1);
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "qj.G(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
      }
   }

   static final void a(int var0, Class_ha var1, int var2, int var3) {
      int var5 = client.lb;

      try {
         I++;
         if (var3 != -1198502738) {
            T = null;
         }

         label101: {
            if (~var1.Sc != -1) {
               if (var1.Sc != 1) {
                  if (~var1.Sc == -3) {
                     var1.hb = var2 - var1.Gc - var1.cb;
                     if (var5 == 0) {
                        break label101;
                     }
                  }

                  if (var1.Sc == 3) {
                     var1.hb = var1.cb * var2 >> 2074648526;
                     if (var5 == 0) {
                        break label101;
                     }
                  }

                  if (~var1.Sc != -5) {
                     var1.hb = var2 + -var1.Gc - (var1.cb * var2 >> 580489870);
                     if (var5 == 0) {
                        break label101;
                     }
                  }

                  var1.hb = (-var1.Gc + var2) / 2 + (var1.cb * var2 >> -1198502738);
                  if (var5 == 0) {
                     break label101;
                  }
               }

               var1.hb = var1.cb + (-var1.Gc + var2) / 2;
               if (var5 == 0) {
                  break label101;
               }
            }

            var1.hb = var1.cb;
         }

         label108: {
            if (~var1.mb == -1) {
               var1.Rc = var1.cd;
               if (var5 == 0) {
                  break label108;
               }
            }

            if (~var1.mb != -2) {
               if (~var1.mb == -3) {
                  var1.Rc = -var1.nc + var0 + -var1.cd;
                  if (var5 == 0) {
                     break label108;
                  }
               }

               if (var1.mb != 3) {
                  if (~var1.mb != -5) {
                     var1.Rc = -(var0 * var1.cd >> -1342515730) + -var1.nc + var0;
                     if (var5 == 0) {
                        break label108;
                     }
                  }

                  var1.Rc = (var0 + -var1.nc) / 2 + (var1.cd * var0 >> 1334621262);
                  if (var5 == 0) {
                     break label108;
                  }
               }

               var1.Rc = var1.cd * var0 >> -1805519186;
               if (var5 == 0) {
                  break label108;
               }
            }

            var1.Rc = var1.cd + (-var1.nc + var0) / 2;
         }

         if (Class_pe.E) {
            if (client.b(var1) != 0 || var1.Kc == 0) {
               label60: {
                  if (~var1.hb > -1) {
                     var1.hb = 0;
                     if (var5 == 0) {
                        break label60;
                     }
                  }

                  if (var1.hb + var1.Gc > var2) {
                     var1.hb = var2 + -var1.Gc;
                  }
               }

               if (var1.Rc >= 0) {
                  if (~var0 > ~(var1.nc + var1.Rc)) {
                     var1.Rc = -var1.nc + var0;
                     return;
                  }
               } else {
                  var1.Rc = 0;
               }
            }
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "qj.C(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   static final Class_mb c(int var0, int var1) {
      try {
         J++;
         Class_mb var2 = (Class_mb)Class_pi.W.a(14366, (long)var0);
         if (var2 != null) {
            return var2;
         } else {
            byte[] var3 = Class_sa.T.a(Class_ta.a(var1 ^ 111, var0), 0, Class_ld.b(var1 ^ -88, var0));
            var2 = new Class_mb();
            if (var1 != 1) {
               P = -10;
            }

            var2.o = var0;
            if (var3 != null) {
               var2.b(new Class_lh(var3), -1);
            }

            Class_pi.W.a(var2, 111, var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "qj.A(" + var0 + ',' + var1 + ')');
      }
   }

   abstract Object d(int var1);

   public static void a(boolean var0) {
      try {
         Q = null;
         S = null;
         if (var0) {
            L = null;
            T = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "qj.E(" + var0 + ')');
      }
   }

   abstract boolean e(int var1);
}
