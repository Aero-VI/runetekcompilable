final class Class_ij {
   static Class_dd a;
   static int b;
   static Class_r c = Class_tc.a(43, "k");
   static int d;
   static int e = 0;
   static Class_ha f;
   static int g;
   static int h;

   static final Class_tc a(int var0, int var1) {
      try {
         d++;
         Class_tc var2 = (Class_tc)Class_qj.L.a(14366, (long)var0);
         if (var2 != null) {
            return var2;
         } else {
            byte[] var3 = Class_bb.h.a(var0, 0, var1);
            var2 = new Class_tc();
            if (var3 != null) {
               var2.a(true, new Class_lh(var3));
            }

            Class_qj.L.a(var2, 110, var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "ij.B(" + var0 + ',' + var1 + ')');
      }
   }

   static final boolean b(int var0, int var1) {
      try {
         h++;
         if (var1 != 31155) {
            return true;
         } else if (var0 >= 97 && var0 <= 122) {
            return true;
         } else {
            return var0 >= 65 && ~var0 >= -91 ? true : ~var0 <= -49 && var0 <= 57;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ij.A(" + var0 + ',' + var1 + ')');
      }
   }

   static final boolean a(Class_ha var0, int var1) {
      try {
         if (var1 != 29905) {
            return false;
         } else {
            g++;
            if (var0.ab == 205) {
               Class_c.u = 250;
               return true;
            } else {
               return false;
            }
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ij.D(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
      }
   }

   public static void a(byte var0) {
      try {
         a = null;
         int var1 = 41 / ((50 - var0) / 46);
         c = null;
         f = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ij.C(" + var0 + ')');
      }
   }
}
