final class Class_ke extends Class_bh {
   static int[] l = new int[256];
   private static Class_r m = Class_tc.a(43, "Hidden");
   static int[] n = new int[128];
   static int o;
   static int p = 0;
   private final int q;
   static Class_r r = m;
   static int s;
   static int t;
   private final int u;
   static int v;
   static int w = 0;
   private final int x;
   static int y;
   static int z;
   private final int A;
   static Class_ei B;
   static int C;

   Class_ke(int var1, int var2, int var3, int var4, int var5, int var6) {
      super(-1, var5, var6);

      try {
         this.u = var2;
         this.q = var3;
         this.x = var1;
         this.A = var4;
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "ke.<init>(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
      }
   }

   static final void a(byte var0, Class_fa var1) {
      try {
         if (var0 != -10) {
            a(null, -124, 33, 69);
         }

         Class_nf var2 = (Class_nf)Class_qe.F.a(var1.Zb.f(10908), 117);
         t++;
         if (var2 == null) {
            Class_id.a(19395, var1.qb[0], null, null, 0, var1.v[0], Class_jk.F, var1);
         } else {
            var2.e(31506);
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ke.H(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   static final Class_dh[] a(Class_cj var0, int var1, int var2, int var3) {
      try {
         z++;
         if (var3 > -93) {
            return null;
         } else {
            return !Class_ve.a(-29381, var1, var0, var2) ? null : Class_ng.b(31);
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "ke.J(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   final void a(boolean var1, int var2, int var3) {
      try {
         s++;
         int var4 = this.x * var2 >> 269627692;
         if (!var1) {
            this.a(-20, -94, 39);
         }

         int var5 = var2 * this.q >> 667851340;
         int var7 = var3 * this.A >> -795303956;
         int var6 = this.u * var3 >> 595146636;
         Class_he.a(var4, super.h, var6, var5, (byte)-126, var7);
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "ke.B(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   public static void a(byte var0) {
      try {
         n = null;
         B = null;
         if (var0 != 15) {
            l = null;
         }

         r = null;
         l = null;
         m = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ke.G(" + var0 + ')');
      }
   }

   static final int a(Class_lh var0, int var1, Class_r var2) {
      try {
         o++;
         int var3 = var0.p;
         var0.l(var2.G, -1);
         var0.p = var0.p + Class_md.w.a(var2.G, var0.E, var2.h, -2147483648, var0.p, var1);
         return -var3 + var0.p;
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "ke.I(" + (var0 != null ? "{...}" : "null") + 44 + var1 + 44 + (var2 != null ? "{...}" : "null") + 41);
      }
   }

   final void b(int var1, int var2, int var3) {
      try {
         y++;
         int var4 = -17 % ((var2 - -49) / 43);
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "ke.E(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   final void a(int var1, int var2, int var3) {
      try {
         C++;
         if (var2 != 23700) {
            n = null;
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "ke.D(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }
}
