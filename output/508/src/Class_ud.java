import java.awt.FontMetrics;

final class Class_ud {
   static int a;
   static FontMetrics b;
   static int c;
   static long[] d = new long[256];
   static int[] e;
   static boolean[] f = new boolean[8];
   static int g;
   static Class_r h;
   static Class_r i;
   private static Class_r j;
   static Class_r k;
   private static Class_r l;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(boolean var0) {
      int var7 = client.lb;

      try {
         c++;
         if (Class_mk.j != null) {
            if (!var0) {
               a(false);
            }

            try {
               byte[] var1 = Class_mk.j.a((byte)78);
               if (var1 != null) {
                  Class_lh var2 = new Class_lh(var1);
                  Class_ld.kb = var2.k(1355769544);
                  Class_ta.B = new Class_pd[Class_ld.kb];
                  int var3 = 0;
                  if (var7 == 0 && ~Class_ld.kb >= ~var3) {
                     Class_e.a(-1 + Class_ta.B.length, -228, Class_ta.B, 0);
                     Class_mk.j = null;
                  } else {
                     do {
                        Class_pd var4 = Class_ta.B[var3] = new Class_pd();
                        int var5 = var2.k(1355769544);
                        var4.b = (var5 & 32768) != 0;
                        var4.e = 32767 & var5;
                        var4.k = var2.e(127);
                        var4.f = var2.p(-22489);
                        var4.d = var3;
                        int var6 = var2.k(1355769544);
                        var4.g = Class_mk.a(3, var6);
                     } while (~Class_ld.kb < ~(++var3));

                     Class_e.a(-1 + Class_ta.B.length, -228, Class_ta.B, 0);
                     Class_mk.j = null;
                  }
               }
            } catch (Exception var8) {
               var8.printStackTrace();
               Class_mk.j = null;
            }
         }
      } catch (RuntimeException var9) {
         throw Class_sh.a(var9, "ud.B(" + var0 + ')');
      }
   }

   static final Class_gj a(int var0, byte var1) {
      try {
         Class_gj var2 = (Class_gj)Class_b.y.a((long)var0, (byte)-76);
         a++;
         if (var2 != null) {
            return var2;
         } else {
            byte[] var3;
            if (var0 < 32768) {
               var3 = Class_l.x.a(var0, 0, 1);
            } else {
               var3 = Class_pc.i.a(32767 & var0, 0, 1);
            }

            var2 = new Class_gj();
            if (var3 != null) {
               var2.a((byte)45, new Class_lh(var3));
            }

            if (~var0 <= -32769) {
               var2.d((byte)38);
            }

            Class_b.y.a(var0, (byte)90, var2);
            if (var1 < 75) {
               a(-8);
            }

            return var2;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "ud.A(" + var0 + ',' + var1 + ')');
      }
   }

   public static void a(int var0) {
      try {
         k = null;
         b = null;
         f = null;
         l = null;
         e = null;
         i = null;
         if (var0 != 32767) {
            a(-9, (byte)-12);
         }

         d = null;
         h = null;
         j = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ud.C(" + var0 + ')');
      }
   }

   static {
      for (int var2 = 0; ~var2 > -257; var2++) {
         long var0 = var2;

         for (int var3 = 0; ~var3 > -9; var3++) {
            if (~(var0 & 1L) != -2L) {
               var0 >>>= 1;
            } else {
               var0 = -3932672073523589310L ^ var0 >>> -409417855;
            }
         }

         d[var2] = var0;
      }

      i = Class_tc.a(43, "<br>");
      j = Class_tc.a(43, "Members only world");
      k = j;
      l = Class_tc.a(43, "skill)2");
      h = l;
   }
}
