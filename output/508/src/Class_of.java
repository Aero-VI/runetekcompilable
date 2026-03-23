final class Class_of {
   static int a;
   static int b;
   private int c;
   private int d;
   private Class_c e;
   static int f;
   private int g = 0;
   private Class_fi[] h;
   static int i = 0;
   static int[] j = new int[25];
   private int k;
   private int[][][] l;
   static int m;
   static int n;
   static Class_jb[] o;
   static int p;
   boolean q;

   static final Class_r a(int var0) {
      try {
         p++;
         Class_r var1 = Class_me.b;
         if (~Class_rh.q != var0) {
            var1 = Class_rf.d;
         }

         return Class_o.a(var0 ^ -3, new Class_r[]{Class_ug.w, var1, Class_pc.m, Class_og.b(Class_pi.sb, 0), Class_w.M, Class_og.b(Class_m.kb, 0), Class_ce.W});
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "of.B(" + var0 + ')');
      }
   }

   public static void a(byte var0) {
      try {
         if (var0 != 103) {
            a((byte)-94);
         }

         j = null;
         o = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "of.A(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final Class_jh a(int var0, int var1, int var2, int var3, int var4, Class_jh var5, int var6) {
      int var16 = client.lb;

      try {
         n++;
         long var7 = var0;
         Class_jh var9 = (Class_jh)Class_hk.G.a(14366, var7);
         if (var9 == null) {
            Class_ne var10 = Class_ne.a(Class_ui.d, var0, 0);
            if (var10 == null) {
               return null;
            }

            var9 = var10.c(64, 768, -50, -10, -50);
            Class_hk.G.a(var9, 115, var7);
         }

         int var19 = var5.j();
         int var11 = var5.g();
         int var12 = var5.c();
         int var13 = var5.h();
         var9 = var9.a(true, true);
         if (var3 != 0) {
            var9.e(var3);
         }

         if (var4 != -10) {
            return null;
         } else {
            Class_qa var14 = (Class_qa)var9;
            if (var2 != Class_fa.a(var19 + var6, Class_jk.F, var12 + var1, false) || Class_fa.a(var11 + var6, Class_jk.F, var1 + var13, false) != var2) {
               int var15 = 0;
               if (var16 != 0 || ~var15 > ~var14.M) {
                  do {
                     var14.q[var15] = var14.q[var15] + -var2 + Class_fa.a(var14.L[var15] - -var6, Class_jk.F, var14.z[var15] - -var1, false);
                  } while (~(++var15) > ~var14.M);
               }

               var14.B = false;
            }

            return var9;
         }
      } catch (RuntimeException var17) {
         throw Class_sh.a(
            var17, "of.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + (var5 != null ? "{...}" : "null") + ',' + var6 + ')'
         );
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final void b(int var1) {
      int var3 = client.lb;

      try {
         b++;
         int var2 = var1;
         if (var3 == 0 && this.c <= var1) {
            this.h = null;
            this.l = null;
            this.e.b(var1 ^ 105);
            this.e = null;
         } else {
            do {
               this.l[var2][0] = null;
               this.l[var2][1] = null;
               this.l[var2][2] = null;
               this.l[var2] = null;
            } while (this.c > ++var2);

            this.h = null;
            this.l = null;
            this.e.b(var1 ^ 105);
            this.e = null;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "of.E(" + var1 + ')');
      }
   }

   final int[][] a(int var1, byte var2) {
      int var6 = client.lb;

      try {
         int var3 = 96 % ((-65 - var2) / 33);
         a++;
         if (this.k == this.c) {
            this.q = this.h[var1] == null;
            this.h[var1] = Class_ma.X;
            return this.l[var1];
         } else if (~this.c == -2) {
            this.q = ~this.d != ~var1;
            this.d = var1;
            return this.l[0];
         } else {
            Class_fi var4;
            label46: {
               var4 = this.h[var1];
               if (var4 != null) {
                  this.q = false;
                  if (var6 == 0) {
                     break label46;
                  }
               }

               label33: {
                  this.q = true;
                  if (~this.g <= ~this.c) {
                     Class_fi var5 = (Class_fi)this.e.d(30568);
                     var4 = new Class_fi(var1, var5.y);
                     this.h[var5.s] = null;
                     var5.c(-17554);
                     if (var6 == 0) {
                        break label33;
                     }
                  }

                  var4 = new Class_fi(var1, this.g);
                  this.g++;
               }

               this.h[var1] = var4;
            }

            this.e.a((byte)85, var4);
            return this.l[var4.y];
         }
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "of.F(" + var1 + ',' + var2 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int[][][] b(byte var1) {
      int var3 = client.lb;

      try {
         f++;
         if (~this.k != ~this.c) {
            throw new RuntimeException("Can only retrieve a full image cache");
         } else {
            if (var1 < 122) {
               this.b(51);
            }

            int var2 = 0;
            if (var3 != 0) {
               this.h[var2] = Class_ma.X;
               var2++;
            }

            while (var2 < this.c) {
               this.h[var2] = Class_ma.X;
               var2++;
            }

            return this.l;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "of.D(" + var1 + ')');
      }
   }

   Class_of(int var1, int var2, int var3) {
      this.d = -1;
      this.e = new Class_c();
      this.q = false;

      try {
         this.c = var1;
         this.k = var2;
         this.h = new Class_fi[this.k];
         this.l = new int[this.c][3][var3];
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "of.<init>(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }
}
