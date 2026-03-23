final class Class_rf {
   static Class_eh[] a = new Class_eh[32768];
   static int b;
   static boolean c = true;
   static Class_r d = Class_tc.a(43, "www)2wtrc");
   static int e;
   static Class_r f = Class_rf.i;
   static int g;
   static Class_cj h;
   private static Class_r i = Class_tc.a(43, "OFF");
   static int j;
   static Class_pb k;
   static int[] l = new int[50];
   static int m;

   public static void a(int var0) {
      try {
         d = null;
         i = null;
         k = null;
         f = null;
         a = null;
         if (var0 != 32768) {
            i = null;
         }

         h = null;
         l = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "rf.A(" + var0 + ')');
      }
   }

   static final Class_lj a(int var0, int var1, int var2) {
      Class_aa var3 = Class_ck.d[var0][var1][var2];
      if (var3 == null) {
         return null;
      } else {
         for (int var4 = 0; var4 < var3.G; var4++) {
            Class_lj var5 = var3.H[var4];
            if ((var5.k >> 29 & 3L) == 2L && var5.v == var1 && var5.u == var2) {
               return var5;
            }
         }

         return null;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, boolean var1, int var2, int var3, int var4, int var5) {
      int var7 = client.lb;

      try {
         if (var1) {
            int var6 = var0;
            if (var7 == 0 && var2 < var0) {
               g++;
            } else {
               do {
                  Class_fd.a(var4, (byte)-17, var5, Class_qd.p[var6], var3);
               } while (var2 >= ++var6);

               g++;
            }
         }
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "rf.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
      }
   }

   static final void b(int var0, int var1, int var2) {
      try {
         m++;
         Class_he var3 = Class_i.b((byte)81, var0);
         if (var1 != 0) {
            i = null;
         }

         int var5 = var3.n;
         int var4 = var3.a;
         int var6 = var3.l;
         int var7 = Class_c.g[var6 + -var5];
         if (~var2 > -1 || ~var2 < ~var7) {
            var2 = 0;
         }

         var7 <<= var5;
         Class_ii.d(var4, ~var7 & Class_sb.i[var4] | var2 << var5 & var7, 87);
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "rf.F(" + var0 + ',' + var1 + ',' + var2 + ')');
      }
   }

   static final void a(int var0, int var1, int var2, boolean var3, int var4) {
      try {
         j++;
         if (~var0 <= ~Class_ff.d && var0 <= Class_hh.h) {
            var2 = Class_tf.a(var2, Class_tg.r, (byte)114, Class_ga.v);
            var4 = Class_tf.a(var4, Class_tg.r, (byte)114, Class_ga.v);
            Class_bj.a(1, var4, var2, var1, var0);
         }

         if (!var3) {
            a(-105, 101, 125, false, -95);
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "rf.D(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
      }
   }

   static final void a(byte var0, int var1, int var2, int var3) {
      try {
         b++;
         if (var0 > -48) {
            a(118);
         }

         Class_ha var4 = Class_lc.a(var3, false, var2);
         if (var4 != null && var4.bd != null) {
            Class_wj var5 = new Class_wj();
            var5.z = var4;
            var5.x = var4.bd;
            Class_j.a(var5, 16);
         }

         Class_sg.tb = true;
         Class_fb.o = var1;
         Class_sh.k = var3;
         Class_uf.Y = var2;
         Class_tg.a(var4, -122);
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "rf.E(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }
}
