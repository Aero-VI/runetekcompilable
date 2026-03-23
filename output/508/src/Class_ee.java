final class Class_ee extends Class_lf {
   static int Q;
   static int R;
   static int S;
   private int T = 4096;
   static int U;
   static int V;
   static Class_r W = Class_tc.a(43, "cookieprefix");
   static Class_r X = Class_tc.a(43, "Verbindung abgebrochen)3");
   static int Y;
   static int Z;
   static int ab;
   static int bb;

   static final void a(boolean var0, long var1) {
      try {
         try {
            Thread.sleep(var1);
            if (var0) {
               a(false, 103L);
            }
         } catch (InterruptedException var4) {
         }

         Y++;
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "ee.E(" + var0 + ',' + var1 + ')');
      }
   }

   public Class_ee() {
      this(4096);
   }

   final int[] a(byte var1, int var2) {
      try {
         Q++;
         if (var1 != -61) {
            this.a(null, 45, -36);
         }

         int[] var3 = super.H.a(false, var2);
         if (super.H.s) {
            Class_gb.a(var3, 0, Class_ld.X, this.T);
         }

         return var3;
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "ee.G(" + var1 + ',' + var2 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final Class_uf a(byte var0, Class_r var1) {
      int var4 = client.lb;

      try {
         U++;
         Class_uf var2 = (Class_uf)Class_ff.a.e((byte)76);
         if (var4 == 0 && var2 == null) {
            int var6 = 46 % ((var0 - 28) / 32);
            return null;
         } else {
            while (!var2.O.a(var1, (byte)125)) {
               var2 = (Class_uf)Class_ff.a.c((byte)-118);
               if (var2 == null) {
                  int var3 = 46 % ((var0 - 28) / 32);
                  return null;
               }
            }

            return var2;
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "ee.J(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   public static void g(int var0) {
      try {
         W = null;
         X = null;
         if (var0 != 0) {
            W = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ee.C(" + var0 + ')');
      }
   }

   static final int b(int var0, int var1) {
      try {
         Z++;
         if (var0 != -1872384500) {
            W = null;
         }

         if ((var1 < 97 || ~var1 < -123) && (var1 < 224 || var1 > 254 || var1 == 247)) {
            if (~var1 == -256) {
               return 159;
            } else {
               return ~var1 == -157 ? 140 : var1;
            }
         } else {
            return var1 - 32;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ee.F(" + var0 + 44 + var1 + 41);
      }
   }

   private Class_ee(int var1) {
      super(0, true);

      try {
         this.T = var1;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ee.<init>(" + var1 + ')');
      }
   }

   static final Class a(String var0, int var1) throws ClassNotFoundException {
      try {
         V++;
         if (var0.equals("B")) {
            return byte.class;
         } else if (var0.equals("I")) {
            return int.class;
         } else if (var0.equals("S")) {
            return short.class;
         } else if (var0.equals("J")) {
            return long.class;
         } else if (var0.equals("Z")) {
            return boolean.class;
         } else if (var0.equals("F")) {
            return float.class;
         } else if (var0.equals("D")) {
            return double.class;
         } else {
            if (var1 != -1) {
               X = null;
            }

            return var0.equals("C") ? char.class : Class.forName(var0);
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ee.D(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
      }
   }

   static final void a(byte var0, int var1, Class_r var2) {
      try {
         S++;
         Class_ic var3 = Class_ka.a(var1, 2, (byte)-120);
         var3.e(0);
         var3.S = var2;
         if (var0 < 69) {
            X = null;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "ee.B(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
      }
   }

   static final int a(Class_cj var0, int var1, Class_cj var2) {
      try {
         R++;
         int var3 = 0;
         if (var0.g(Class_tg.l, 0)) {
            var3++;
         }

         if (var0.g(Class_ua.l, 0)) {
            var3++;
         }

         if (var0.g(Class_hg.i, 0)) {
            var3++;
         }

         if (var2.g(Class_tg.l, 0)) {
            var3++;
         }

         if (var1 < 43) {
            a((byte)-13, null);
         }

         if (var2.g(Class_ua.l, 0)) {
            var3++;
         }

         if (var2.g(Class_hg.i, 0)) {
            var3++;
         }

         return var3;
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "ee.H(" + (var0 != null ? "{...}" : "null") + 44 + var1 + 44 + (var2 != null ? "{...}" : "null") + 41);
      }
   }

   final void a(Class_lh var1, int var2, int var3) {
      try {
         if (var3 != -1) {
            W = null;
         }

         if (~var2 == -1) {
            this.T = (var1.n(var3 + -6676) << -1872384500) / 255;
         }

         bb++;
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "ee.K(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   static final void h(int var0) {
      int var9 = client.lb;

      try {
         ab++;
         if (var0 != 19114) {
            W = null;
         }

         while (Class_f.T.n(Class_sf.g, -104) >= 27) {
            int var1 = Class_f.T.e((byte)0, 15);
            if (var1 == 32767) {
               break;
            }

            boolean var2 = false;
            if (Class_rf.a[var1] == null) {
               var2 = true;
               Class_rf.a[var1] = new Class_eh();
            }

            Class_eh var3 = Class_rf.a[var1];
            Class_kg.v[Class_ke.p++] = var1;
            var3.vb = Class_be.C;
            var3.Pb = Class_i.c(Class_f.T.e((byte)0, 14), -103);
            int var4 = Class_f.T.e((byte)0, 1);
            if (var4 == 1) {
               Class_cc.Db[Class_uf.U++] = var1;
            }

            int var5 = Class_f.T.e((byte)0, 5);
            if (~var5 < -16) {
               var5 -= 32;
            }

            int var6 = Class_f.T.e((byte)0, 5);
            int var7 = Class_fk.bb[Class_f.T.e((byte)0, 3)];
            if (var2) {
               var3.F = var3.U = var7;
            }

            if (var6 > 15) {
               var6 -= 32;
            }

            int var8 = Class_f.T.e((byte)0, 1);
            var3.E = var3.Pb.e;
            var3.Q = var3.Pb.T;
            var3.C = var3.Pb.d;
            var3.Bb = var3.Pb.Y;
            var3.lb = var3.Pb.jb;
            var3.kb = var3.Pb.p;
            var3.P = var3.Pb.I;
            if (~var3.Bb == -1) {
               var3.U = 0;
            }

            var3.ub = var3.Pb.P;
            var3.jb = var3.Pb.j;
            var3.a(var5 + Class_gg.B.qb[0], (byte)-68, Class_gg.B.v[0] - -var6, ~var8 == -2);
            if (var3.Pb.a(var0 ^ 19114)) {
               Class_id.a(19395, var3.qb[0], var3, null, 0, var3.v[0], Class_jk.F, null);
               if (var9 != 0) {
                  break;
               }
            }
         }

         Class_f.T.f((byte)-59);
      } catch (RuntimeException var10) {
         throw Class_sh.a(var10, "ee.U(" + var0 + ')');
      }
   }
}
