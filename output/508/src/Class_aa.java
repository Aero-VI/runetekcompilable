final class Class_aa extends Class_li {
   static Class_r[] p = new Class_r[200];
   static Class_lh[] q = new Class_lh[2048];
   static int r;
   Class_kk s;
   Class_aj t;
   Class_je u;
   static int v;
   static Class_r w = Class_tc.a(43, "Cabbage");
   static int x;
   int y;
   Class_mk z;
   int A;
   int[] B;
   int C;
   int D;
   boolean E;
   boolean F;
   int G;
   Class_lj[] H = new Class_lj[5];
   int I;
   int J;
   static int K;
   int L;
   Class_hd M;
   int N;
   Class_na O;
   Class_aa P;
   boolean Q;
   int R;

   static final void a(
      int var0,
      int var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17,
      int var18,
      int var19
   ) {
      if (var3 == 0) {
         Class_aj var23 = new Class_aj(var10, var11, var12, var13, -1, var18, false);

         for (int var25 = var0; var25 >= 0; var25--) {
            if (Class_ck.d[var25][var1][var2] == null) {
               Class_ck.d[var25][var1][var2] = new Class_aa(var25, var1, var2);
            }
         }

         Class_ck.d[var0][var1][var2].t = var23;
      } else if (var3 != 1) {
         Class_na var22 = new Class_na(
            var3, var4, var5, var1, var2, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19
         );

         for (int var24 = var0; var24 >= 0; var24--) {
            if (Class_ck.d[var24][var1][var2] == null) {
               Class_ck.d[var24][var1][var2] = new Class_aa(var24, var1, var2);
            }
         }

         Class_ck.d[var0][var1][var2].O = var22;
      } else {
         Class_aj var20 = new Class_aj(var14, var15, var16, var17, var5, var19, var6 == var7 && var6 == var8 && var6 == var9);

         for (int var21 = var0; var21 >= 0; var21--) {
            if (Class_ck.d[var21][var1][var2] == null) {
               Class_ck.d[var21][var1][var2] = new Class_aa(var21, var1, var2);
            }
         }

         Class_ck.d[var0][var1][var2].t = var20;
      }
   }

   Class_aa(int var1, int var2, int var3) {
      this.B = new int[5];
      this.D = 0;

      try {
         this.R = var3;
         this.y = var2;
         this.A = this.C = var1;
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "aa.<init>(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   public static void d(int var0) {
      try {
         p = null;
         w = null;
         if (var0 == 0) {
            q = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "aa.A(" + var0 + ')');
      }
   }
}
