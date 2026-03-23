final class Class_n extends Class_li {
   static int p;
   static int q;
   int r;
   int s;
   static int t;
   static boolean[] u = new boolean[100];

   public static void d(int var0) {
      try {
         int var1 = 86 / ((62 - var0) / 33);
         u = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "n.C(" + var0 + ')');
      }
   }

   static final void a(byte var0) {
      try {
         if (Class_ve.V != null) {
            Class_ve.V.b(7759444);
         }

         if (Class_a.m != null) {
            Class_a.m.b(7759444);
         }

         p++;
         if (var0 <= 62) {
            a(-70, false, 8, -46, 86);
         }

         Class_ve.a(22050, 2, Class_mg.a, 81);
         Class_ve.V = Class_uc.a(Class_rj.J, (byte)104, Class_od.u, 22050, 0);
         Class_ve.V.a(false, Class_ij.a);
         Class_a.m = Class_uc.a(Class_rj.J, (byte)104, Class_od.u, 2048, 1);
         Class_a.m.a(false, Class_nd.m);
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "n.B(" + var0 + ')');
      }
   }

   Class_n(int var1, int var2) {
      try {
         this.r = var1;
         this.s = var2;
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "n.<init>(" + var1 + ',' + var2 + ')');
      }
   }

   static final void a(int var0, boolean var1, int var2, int var3, int var4) {
      try {
         Class_og.fb = Class_fi.z * var4 / var3;
         t++;
         Class_ad.m = -1;
         Class_qd.C = -1;
         Class_oc.e = Class_sb.j * var2 / var0;
         Class_wh.a(-1);
         if (var1) {
            a((byte)-38);
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "n.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
      }
   }
}
