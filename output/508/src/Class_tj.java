import java.awt.Component;
import java.math.BigInteger;

final class Class_tj extends Class_mc {
   static int n;
   static BigInteger o = new BigInteger("111425062890301051365206642964372080941130087045221691750738418203817739415579");
   static int p;
   static int q;
   static int r;
   static int[] s;
   static Class_r t = Class_tc.a(43, "<col=ff0000>");
   static Class_r[] u = new Class_r[500];

   public static void b(boolean var0) {
      try {
         t = null;
         if (!var0) {
            o = null;
            u = null;
            s = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "tj.G(" + var0 + ')');
      }
   }

   static final int b(byte var0) {
      try {
         r++;
         int var1 = -121 / ((var0 - -31) / 48);
         return 0;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "tj.I(" + var0 + 41);
      }
   }

   static final void a(int var0, Component var1) {
      try {
         if (var0 <= -7) {
            n++;
            var1.removeKeyListener(Class_lc.a);
            var1.removeFocusListener(Class_lc.a);
            Class_fb.b = -1;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "tj.H(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   static final Class_ic c(byte var0) {
      try {
         p++;
         Class_ic var1 = (Class_ic)Class_ed.k.b(1742);
         if (var1 != null) {
            var1.c(-17554);
            var1.b((byte)73);
            return var1;
         } else {
            if (var0 != 37) {
               o = null;
            }

            do {
               var1 = (Class_ic)Class_l.o.b(var0 + 1705);
               if (var1 == null) {
                  return null;
               }

               if (var1.f(var0 + 218) > Class_fj.a(17161)) {
                  return null;
               }

               var1.c(-17554);
               var1.b((byte)73);
            } while (~(var1.v & -9223372036854775808L) == -1L);

            return var1;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "tj.F(" + var0 + ')');
      }
   }
}
