final class Class_oc {
   private static Class_r a = Class_tc.a(43, "Loaded update list");
   static int b = 0;
   static int c = 500;
   static Class_r d = Class_tc.a(43, "name_icons");
   static int e;
   private static Class_r f = Class_tc.a(43, "Players");
   static Class_ik g;
   static byte[][][] h;
   static int i;
   static Class_r j = Class_tc.a(43, "<col=ffff00>");
   static int k;
   static int l;
   static Class_r m = f;
   static int n;
   static int o;
   static int p;
   static int[] q = new int[2048];
   static Class_r r = a;

   public static void a(int var0) {
      try {
         j = null;
         m = null;
         d = null;
         r = null;
         g = null;
         a = null;
         q = null;
         h = null;
         if (var0 != 0) {
            g = null;
         }

         f = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "oc.A(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, Class_ni[] var1, Class_cj var2, Class_dh[] var3, Class_dh[] var4, Class_dh[] var5, Class_dh[] var6) {
      int var10 = client.lb;

      try {
         Class_oe.b = var2;
         Class_oi.t = var4;
         Class_ta.eb = var6;
         Class_fk.S = var1;
         if (var0 != -10675) {
            b = -51;
         }

         n++;
         Class_se.jb = var3;
         Class_bc.X = var5;
         Class_ff.a.b(105);
         int var7 = Class_oe.b.a(Class_uc.u, (byte)-126);
         int[] var8 = Class_oe.b.a(false, var7);
         int var9 = 0;
         if (var10 != 0 || var8.length > var9) {
            do {
               Class_ff.a.a(Class_ae.a(new Class_lh(Class_oe.b.a(var8[var9], 0, var7)), var0 + 10676), true);
            } while (var8.length > ++var9);
         }
      } catch (RuntimeException var11) {
         throw Class_sh.a(
            var11,
            "oc.C("
               + var0
               + ','
               + (var1 != null ? "{...}" : "null")
               + ','
               + (var2 != null ? "{...}" : "null")
               + ','
               + (var3 != null ? "{...}" : "null")
               + ','
               + (var4 != null ? "{...}" : "null")
               + ','
               + (var5 != null ? "{...}" : "null")
               + ','
               + (var6 != null ? "{...}" : "null")
               + ')'
         );
      }
   }

   static final Class_af a(byte[] var0, boolean var1) {
      try {
         o++;
         if (var0 == null) {
            return null;
         } else {
            if (var1) {
               a(null, false);
            }

            Class_qf var2 = new Class_qf(var0, Class_ae.g, Class_ub.L, Class_ia.bb, Class_ld.ib, Class_lj.h);
            Class_oe.a((byte)-93);
            return var2;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "oc.B(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
      }
   }
}
