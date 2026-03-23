final class Class_pg extends Class_bh {
   private final int l;
   static int m;
   private final int n;
   private final int o;
   static int p;
   private final int q;
   static int r = 0;
   private final int s;
   static int t;
   private final int u;
   private final int v;
   static int w;
   private final int x;
   static int y;
   static int z = 0;
   static int A;

   final void a(boolean var1, int var2, int var3) {
      try {
         int var4 = var2 * this.l >> -891261044;
         y++;
         int var6 = this.q * var2 >> -1931743604;
         int var5 = var3 * this.u >> -457698516;
         int var7 = this.s * var3 >> -559875604;
         int var8 = var2 * this.n >> 1874872492;
         int var9 = var3 * this.o >> -921279860;
         int var11 = this.v * var3 >> -1294546068;
         int var10 = var2 * this.x >> -2028756724;
         Class_v.a(var6, (byte)-119, var5, var7, var4, var10, var9, super.h, var11, var8);
         if (!var1) {
            this.a(false, -1, 2);
         }
      } catch (RuntimeException var12) {
         throw Class_sh.a(var12, "pg.B(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   final void a(int var1, int var2, int var3) {
      try {
         m++;
         if (var2 != 23700) {
            r = -52;
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "pg.D(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   final void b(int var1, int var2, int var3) {
      try {
         int var4 = -39 % ((var2 - -49) / 43);
         t++;
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "pg.E(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void b(int var0) {
      int var3 = client.lb;

      try {
         p++;
         if (var0 != -1) {
            b(84);
         }

         Class_ec var1 = (Class_ec)Class_sd.a.e((byte)76);
         if (var3 != 0 || var1 != null) {
            do {
               label52: {
                  Class_qe var2 = var1.L;
                  if (Class_jk.F != var2.C || var2.I) {
                     var1.c(-17554);
                     if (var3 == 0) {
                        break label52;
                     }
                  }

                  label34:
                  if (~Class_be.C <= ~var2.z) {
                     var2.a(Class_sj.k, false);
                     if (!var2.I) {
                        Class_ci.a(var2.C, var2.J, var2.B, var2.p, 60, var2, 0, -1L, false);
                        if (var3 == 0) {
                           break label34;
                        }
                     }

                     var1.c(-17554);
                  }
               }

               var1 = (Class_ec)Class_sd.a.c((byte)34);
            } while (var1 != null);
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "pg.G(" + var0 + ')');
      }
   }

   Class_pg(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      super(-1, var9, var10);

      try {
         this.q = var3;
         this.x = var7;
         this.l = var1;
         this.s = var4;
         this.o = var6;
         this.v = var8;
         this.n = var5;
         this.u = var2;
      } catch (RuntimeException var12) {
         throw Class_sh.a(
            var12,
            "pg.<init>(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ',' + var10 + ')'
         );
      }
   }
}
