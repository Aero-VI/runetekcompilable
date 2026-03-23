import java.io.IOException;

final class Class_tg {
   private Class_li a;
   static int b;
   static int c = -1;
   static int d;
   private long e;
   static int f;
   private int g;
   static int h;
   private Class_li[] i;
   static int j;
   static int k;
   static int l;
   static int m;
   static int n;
   static int o;
   static int p;
   static int q;
   static int r = 100;
   static Class_aa[][][] s;
   private int t = 0;
   static int[] u = new int[1000];
   static int v;
   private Class_li w;

   final void a(byte var1, Class_li var2, long var3) {
      try {
         d++;
         int var6 = -127 % ((var1 - 68) / 51);
         if (var2.j != null) {
            var2.c(-17554);
         }

         Class_li var5 = this.i[(int)(this.g - 1 & var3)];
         var2.l = var5;
         var2.a = var3;
         var2.j = var5.j;
         var2.j.l = var2;
         var2.l.j = var2;
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "tg.K(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
      }
   }

   final Class_li a(long var1, int var3) {
      try {
         int var4 = -86 % ((16 - var3) / 54);
         q++;
         this.e = var1;
         Class_li var5 = this.i[(int)(-1 + this.g & var1)];

         for (this.a = var5.l; var5 != this.a; this.a = this.a.l) {
            if (~var1 == ~this.a.a) {
               Class_li var6 = this.a;
               this.a = this.a.l;
               return var6;
            }
         }

         this.a = null;
         return null;
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "tg.J(" + var1 + ',' + var3 + ')');
      }
   }

   final Class_li a(int var1) {
      try {
         this.t = 0;
         o++;
         if (var1 != -32642) {
            this.c(-62);
         }

         return this.a((byte)-119);
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "tg.C(" + var1 + ')');
      }
   }

   final int b(int var1) {
      try {
         if (var1 > -126) {
            this.e = -127L;
         }

         v++;
         return this.g;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "tg.A(" + var1 + 41);
      }
   }

   static final void a(int var0, Class_fa var1) {
      try {
         m++;
         Class_nf var2 = (Class_nf)Class_qe.F.a(var1.Zb.f(var0 + 10909), 127);
         if (var0 != -1) {
            s = null;
         }

         if (var2 != null) {
            if (var2.r != null) {
               Class_nd.m.a(var2.r);
               var2.r = null;
            }

            var2.c(-17554);
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "tg.I(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   static final void a(Class_ha var0, int var1) {
      try {
         if (~Class_u.bb == ~var0.ac) {
            Class_vb.j[var0.Qc] = true;
         }

         if (var1 >= -112) {
            a(null, false, true);
         }

         p++;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "tg.D(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
      }
   }

   final Class_li a(byte var1) {
      try {
         f++;
         if (var1 > -95) {
            u = null;
         }

         if (~this.t < -1 && this.w != this.i[this.t - 1]) {
            Class_li var4 = this.w;
            this.w = var4.l;
            return var4;
         } else {
            while (~this.t > ~this.g) {
               Class_li var2 = this.i[this.t++].l;
               if (this.i[-1 + this.t] != var2) {
                  this.w = var2.l;
                  return var2;
               }
            }

            return null;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "tg.B(" + var1 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final void a(boolean var1) {
      int var5 = client.lb;

      try {
         h++;
         if (var1) {
            l = -36;
         }

         int var2 = 0;
         Class_li var3;
         if (var5 != 0) {
            var3 = this.i[var2];
         } else {
            if (~var2 <= ~this.g) {
               this.w = null;
               this.a = null;
               return;
            }

            var3 = this.i[var2];
         }

         while (true) {
            while (true) {
               Class_li var4 = var3.l;
               if (var3 != var4) {
                  var4.c(-17554);
                  if (var5 == 0) {
                     continue;
                  }

                  var2++;
                  break;
               }

               var2++;
               break;
            }

            if (~var2 <= ~this.g) {
               this.w = null;
               this.a = null;
               return;
            }

            var3 = this.i[var2];
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "tg.F(" + var1 + ')');
      }
   }

   static final void a(Class_jk var0, boolean var1, boolean var2) {
      int var4 = client.lb;

      try {
         if (Class_v.s != null) {
            try {
               Class_v.s.b(-76);
            } catch (Exception var7) {
            }

            Class_v.s = null;
         }

         j++;
         Class_v.s = var0;
         Class_hg.a(var2, var1);
         Class_vf.j = null;
         Class_mg.g.p = 0;
         Class_mh.W = null;
         Class_hd.l = 0;

         do {
            Class_tf var3 = (Class_tf)Class_qj.S.a(-32642);
            if (var3 == null) {
               break;
            }

            Class_vf.e.a((byte)-116, var3, var3.a);
            Class_jd.i++;
            Class_ug.q--;
         } while (var4 == 0);

         do {
            Class_tf var9 = (Class_tf)Class_tb.n.a(-32642);
            if (var9 == null) {
               break;
            }

            Class_gg.v.a(var9, (byte)121);
            Class_lh.Ab.a((byte)-117, var9, var9.a);
            Class_wh.p++;
            Class_ck.c--;
         } while (var4 == 0);

         if (Class_p.e != 0) {
            try {
               Class_lh var10 = new Class_lh(4);
               var10.b(32, 4);
               var10.b(32, Class_p.e);
               var10.a(false, 0);
               Class_v.s.a(0, (byte)92, 4, var10.E);
            } catch (IOException var6) {
               try {
                  Class_v.s.b(-44);
               } catch (Exception var5) {
               }

               Class_v.s = null;
               Class_kg.y++;
            }
         }

         Class_c.s = 0;
         Class_ng.w = Class_fj.a(17161);
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "tg.G(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ')');
      }
   }

   final Class_li c(int var1) {
      try {
         k++;
         if (this.a == null) {
            return null;
         } else {
            Class_li var2 = this.i[(int)(this.e & -1 + this.g)];
            if (var1 < 66) {
               this.w = null;
            }

            while (this.a != var2) {
               if (this.a.a == this.e) {
                  Class_li var3 = this.a;
                  this.a = this.a.l;
                  return var3;
               }

               this.a = this.a.l;
            }

            this.a = null;
            return null;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "tg.H(" + var1 + ')');
      }
   }

   Class_tg(int var1) {
      try {
         this.i = new Class_li[var1];
         this.g = var1;

         for (int var2 = 0; ~var2 > ~var1; var2++) {
            Class_li var3 = this.i[var2] = new Class_li();
            var3.j = var3;
            var3.l = var3;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "tg.<init>(" + var1 + ')');
      }
   }

   public static void d(int var0) {
      try {
         s = null;
         if (var0 != 0) {
            l = 72;
         }

         u = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "tg.E(" + var0 + ')');
      }
   }
}
