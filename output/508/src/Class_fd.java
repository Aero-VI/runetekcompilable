final class Class_fd {
   static int a;
   static int b = 0;
   static Class_pc[] c;
   static Class_d[] d = new Class_d[4];
   static Class_r e = Class_tc.a(43, "::noclip");
   static int[] f = new int[50];
   static int g = 0;
   static Class_r h = Class_fd.j;
   static int i;
   private static Class_r j = Class_tc.a(43, "Cancel");
   static int k;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0) {
      int var2 = client.lb;

      try {
         Class_ai var1 = (Class_ai)Class_se.Z.e((byte)76);
         k++;
         if (var2 == 0 && var1 == null) {
            if (var0 != -28968) {
               a(42);
            }
         } else {
            do {
               if (~var1.C != 0) {
                  var1.c(-17554);
                  if (var2 != 0) {
                     var1.A = 0;
                     Class_ve.a(var1, true);
                     var1 = (Class_ai)Class_se.Z.c((byte)79);
                  } else {
                     var1 = (Class_ai)Class_se.Z.c((byte)79);
                  }
               } else {
                  var1.A = 0;
                  Class_ve.a(var1, true);
                  var1 = (Class_ai)Class_se.Z.c((byte)79);
               }
            } while (var1 != null);

            if (var0 != -28968) {
               a(42);
            }
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "fd.A(" + var0 + ')');
      }
   }

   static final int a(byte var0) {
      try {
         int var1 = 122 / ((51 - var0) / 57);
         i++;
         return ((Class_sf.d == 0 ? 0 : 1) << 351497908)
            + ((!Class_mg.a ? 0 : 1) << 1969149779)
            + (393216 & Class_lj.m << -2121078959)
            + ((Class_gk.k ? 1 : 0) << -1422848656)
            + ((Class_fi.r ? 1 : 0) << 778354863)
            + ((Class_dd.Gb ? 1 : 0) << -1047818099)
            + ((Class_o.hb ? 1 : 0) << 803447498)
            + ((!Class_qd.G ? 0 : 1) << -1737613527)
            + ((Class_r.b ? 1 : 0) << 840780039)
            + ((!Class_fc.s ? 0 : 1) << 126168518)
            + ((Class_ng.o ? 1 : 0) << 1515986597)
            + ((Class_bk.P ? 1 : 0) << 995280516)
            + (Class_ha.hd & 7)
            + ((Class_d.m ? 1 : 0) << 940635459)
            - (-((!Class_bc.U ? 0 : 1) << -764083448) + -(6144 & Class_ok.X << -716929333) - ((Class_oj.Y != 0 ? 1 : 0) << 698829205))
            + ((Class_tf.V != 0 ? 1 : 0) << 1148366230);
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "fd.B(" + var0 + 41);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, byte var1, int var2, int[] var3, int var4) {
      int var6 = client.lb;

      try {
         if (var1 != -17) {
            a(false);
         }

         var4--;
         int var5 = var4 - 7;
         a++;
         if (var6 != 0 || ~(--var0) > ~var5) {
            do {
               var3[++var0] = var2;
               var3[++var0] = var2;
               var3[++var0] = var2;
               var3[++var0] = var2;
               var3[++var0] = var2;
               var3[++var0] = var2;
               var3[++var0] = var2;
               var3[++var0] = var2;
            } while (~var0 > ~var5);
         }

         if (var6 != 0) {
            var3[++var0] = var2;
         }

         while (~var0 > ~var4) {
            var3[++var0] = var2;
         }
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "fd.D(" + var0 + ',' + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ',' + var4 + ')');
      }
   }

   public static void a(boolean var0) {
      try {
         j = null;
         d = null;
         c = null;
         e = null;
         if (var0) {
            f = null;
            h = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "fd.C(" + var0 + ')');
      }
   }
}
