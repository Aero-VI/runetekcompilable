import java.lang.ref.SoftReference;

final class Class_kb extends Class_qj {
   private SoftReference V;

   final Object d(int var1) {
      try {
         return var1 >= -49 ? (Object)null : this.V.get();
      } catch (RuntimeException var3) {
         throw var3;
      }
   }

   final boolean e(int var1) {
      try {
         int var2 = 30 % ((var1 - -43) / 62);
         return true;
      } catch (RuntimeException var3) {
         throw var3;
      }
   }

   Class_kb(Object var1) {
      try {
         this.V = new SoftReference<>(var1);
      } catch (RuntimeException var3) {
         throw var3;
      }
   }
}
