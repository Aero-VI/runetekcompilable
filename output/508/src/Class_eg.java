import java.nio.Buffer;
import java.nio.ByteBuffer;

final class Class_eg extends Class_bj {
   private ByteBuffer j;

   final byte[] b(int var1) {
      try {
         if (var1 >= -80) {
            return (byte[])null;
         } else {
            byte[] var2 = new byte[this.j.capacity()];
            ((Buffer)this.j).position(0);
            this.j.get(var2);
            return var2;
         }
      } catch (RuntimeException var3) {
         throw var3;
      }
   }

   final void a(byte[] var1, boolean var2) {
      try {
         this.j = ByteBuffer.allocateDirect(var1.length);
         ((Buffer)this.j).position(0);
         this.j.put(var1);
         if (!var2) {
            this.a((byte[])null, true);
         }
      } catch (RuntimeException var4) {
         throw var4;
      }
   }
}
