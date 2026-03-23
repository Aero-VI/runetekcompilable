abstract class Class_lf extends Class_li {
   static int p;
   static int q;
   static int[] r = new int[]{1, -1, -1, 1};
   static Class_dh[] s;
   static Class_r t = Class_tc.a(43, ":tradereq:");
   static int u = 0;
   static int[] v = new int[1000];
   static int w;
   static int x;
   static int y;
   static Class_r z = Class_tc.a(43, "cross");
   static int A;
   static int B;
   boolean C;
   static int D;
   static int E;
   static int F;
   static int G;
   Class_ti H;
   static int I;
   static int J;
   Class_of K;
   static int L;
   Class_lf[] M;
   int N;
   static int O;
   static int[] P = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};

   int d(int var1) {
      try {
         if (var1 != 9485) {
            return 99;
         } else {
            y++;
            return -1;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "lf.T(" + var1 + 41);
      }
   }

   void a(byte var1) {
      try {
         D++;
         if (var1 >= -22) {
            this.a((byte)-47);
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "lf.I(" + var1 + ')');
      }
   }

   public static void b(byte var0) {
      try {
         s = null;
         if (var0 == 50) {
            z = null;
            r = null;
            t = null;
            v = null;
            P = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "lf.S(" + var0 + ')');
      }
   }

   static final void a(int var0, byte var1) {
      try {
         Class_tf.Z = -1;
         Class_id.f = false;
         Class_sd.e = -1;
         E++;
         Class_lg.l = 0;
         Class_mb.y = 1;
         if (var1 < 118) {
            s = null;
         }

         Class_i.mb = var0;
         Class_ua.g = null;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "lf.L(" + var0 + ',' + var1 + ')');
      }
   }

   int c(byte var1) {
      try {
         p++;
         if (var1 > -43) {
            u = -96;
         }

         return -1;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "lf.N(" + var1 + 41);
      }
   }

   void e(int var1) {
      try {
         label19: {
            if (!this.C) {
               this.K.b(0);
               this.K = null;
               if (client.lb == 0) {
                  break label19;
               }
            }

            this.H.b(true);
            this.H = null;
         }

         G++;
         if (var1 != 8) {
            u = 91;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "lf.R(" + var1 + ')');
      }
   }

   final void a(int var1, int var2, int var3) {
      try {
         A++;
         int var4 = var2 == ~this.N ? var3 : this.N;
         if (!this.C) {
            this.K = new Class_of(var4, var3, var1);
         } else {
            this.H = new Class_ti(var4, var3, var1);
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "lf.O(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   final int[] b(int var1, int var2, int var3) {
      try {
         F++;
         if (var3 != 29149) {
            b((byte)-29);
         }

         return this.M[var1].C ? this.M[var1].a((byte)-61, var2) : this.M[var1].a(var2, true)[0];
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "lf.M(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   int[][] a(int var1, boolean var2) {
      try {
         x++;
         if (!var2) {
            O = 55;
         }

         throw new IllegalStateException("This operation does not have a colour output");
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "lf.A(" + var1 + ',' + var2 + ')');
      }
   }

   int[] a(byte var1, int var2) {
      try {
         q++;
         if (var1 != -61) {
            this.N = 9;
         }

         throw new IllegalStateException("This operation does not have a monochrome output");
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "lf.G(" + var1 + ',' + var2 + ')');
      }
   }

   final int[][] c(int var1, int var2, int var3) {
      try {
         w++;
         if (var1 >= -8) {
            b((byte)-105);
         }

         if (!this.M[var2].C) {
            return this.M[var2].a(var3, true);
         } else {
            int[][] var5 = new int[3][];
            int[] var4 = this.M[var2].a((byte)-61, var3);
            var5[2] = var4;
            var5[0] = var4;
            var5[1] = var4;
            return var5;
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "lf.Q(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   Class_lf(int var1, boolean var2) {
      try {
         this.C = var2;
         this.M = new Class_lf[var1];
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "lf.<init>(" + var1 + ',' + var2 + ')');
      }
   }

   void a(Class_lh var1, int var2, int var3) {
      try {
         I++;
         if (var3 != -1) {
            b((byte)-125);
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "lf.K(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void f(int var0) {
      int var8 = client.lb;

      try {
         L++;
         if (var0 == 0) {
            Class_be var1 = (Class_be)Class_nj.p.a(var0 ^ -32642);
            if (var8 != 0 || var1 != null) {
               do {
                  int var2 = var1.t;
                  if (Class_oj.b(var2, (byte)-2)) {
                     Class_ha[] var4 = Class_ve.ab[var2];
                     boolean var3 = true;
                     int var5 = 0;
                     if (var8 != 0 || var5 < var4.length) {
                        do {
                           if (var4[var5] != null) {
                              var3 = var4[var5].dc;
                              if (var8 == 0) {
                                 break;
                              }

                              var5++;
                           } else {
                              var5++;
                           }
                        } while (var5 < var4.length);
                     }

                     if (!var3) {
                        int var6 = (int)var1.a;
                        Class_ha var7 = Class_tf.a(var6, (byte)-80);
                        if (var7 != null) {
                           Class_tg.a(var7, -124);
                        }
                     }
                  }

                  var1 = (Class_be)Class_nj.p.a((byte)-101);
               } while (var1 != null);
            }
         }
      } catch (RuntimeException var9) {
         throw Class_sh.a(var9, "lf.P(" + var0 + ')');
      }
   }
}
