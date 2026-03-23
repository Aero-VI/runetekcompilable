final class Class_kk {
   int a;
   int b;
   static byte[][][] c = new byte[4][104][104];
   static Class_r d = Class_tc.a(43, "::fpson");
   static int[] e;
   Class_a f;
   static int g;
   int h;
   Class_a i;
   long j = 0L;
   int k;
   int l;
   static Class_r m = Class_tc.a(43, "sch-Utteln:");
   static int n;
   static int o = 0;
   static int p = 5063219;
   static int q;
   static int r;

   static final int a(int var0, boolean var1, int var2, byte[] var3) {
      try {
         int var4 = -1;
         r++;

         for (int var5 = var2; ~var5 > ~var0; var5++) {
            var4 = Class_li.b[0xFF & (var3[var5] ^ var4)] ^ var4 >>> -215018360;
         }

         return var1 ? -46 : ~var4;
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "kk.C(" + var0 + 44 + var1 + 44 + var2 + 44 + (var3 != null ? "{...}" : "null") + 41);
      }
   }

   public static void a(int var0) {
      try {
         if (var0 == -1154) {
            c = null;
            e = null;
            m = null;
            d = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "kk.B(" + var0 + ')');
      }
   }

   static final Class_uc a(byte var0, int var1) {
      try {
         g++;
         Class_uc var2 = (Class_uc)Class_pb.g.a(14366, (long)var1);
         if (var2 != null) {
            return var2;
         } else {
            byte[] var3 = Class_og.S.a(Class_kf.a(var1, (byte)65), 0, Class_o.d(var1, -840517817));
            var2 = new Class_uc();
            if (var3 != null) {
               var2.a(new Class_lh(var3), var0 ^ -24054);
            }

            if (var0 != -36) {
               return null;
            } else {
               var2.a((byte)-1);
               Class_pb.g.a(var2, var0 + 134, var1);
               return var2;
            }
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "kk.A(" + var0 + ',' + var1 + ')');
      }
   }

   static final void b(int var0) {
      try {
         Class_wb.g.b((byte)94);
         Class_bg.o.b((byte)94);
         n++;
         if (var0 == -27434) {
            Class_m.ib.b((byte)94);
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "kk.D(" + var0 + ')');
      }
   }

   public Class_kk() {
   }
}
