import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

final class Class_qh extends Class_qb implements MouseWheelListener {
   private int s = 0;

   final void a(Component var1, boolean var2) {
      try {
         var1.addMouseWheelListener(this);
         if (!var2) {
            this.a(false);
         }
      } catch (RuntimeException var4) {
         throw var4;
      }
   }

   public final synchronized void mouseWheelMoved(MouseWheelEvent var1) {
      try {
         this.s = this.s + var1.getWheelRotation();
      } catch (RuntimeException var3) {
         throw var3;
      }
   }

   final void a(int var1, Component var2) {
      try {
         if (var1 != 100) {
            this.a(true);
         }

         var2.removeMouseWheelListener(this);
      } catch (RuntimeException var4) {
         throw var4;
      }
   }

   final synchronized int a(boolean var1) {
      try {
         if (var1) {
            this.a((Component)null, true);
         }

         int var2 = this.s;
         this.s = 0;
         return var2;
      } catch (RuntimeException var3) {
         throw var3;
      }
   }
}
