package nativeadvert;

public class browsercontrol {
   private static boolean iscreated;
   private static boolean error;

   public static boolean create(String var0) {
      if (iscreated) {
         throw new IllegalStateException();
      } else if (error) {
         return false;
      } else {
         boolean var1 = browsercontrol0(var0);
         if (var1) {
            iscreated = true;
         } else {
            error = true;
         }

         return var1;
      }
   }

   public static boolean iscreated() {
      return iscreated;
   }

   public static void set_position(int var0, int var1, int var2, int var3) {
      if (!iscreated) {
         throw new IllegalStateException();
      } else {
         setposition0(var0, var1, var2, var3);
      }
   }

   public static void hide() {
      if (!iscreated) {
         throw new IllegalStateException();
      } else {
         detach0();
      }
   }

   public static void navigate(String var0) {
      if (!iscreated) {
         throw new IllegalStateException();
      } else {
         navigate0(var0);
      }
   }

   public static void destroy() {
      if (!iscreated) {
         throw new IllegalStateException();
      } else {
         destroy0();
         iscreated = false;
      }
   }

   private static native boolean browsercontrol0(String var0);

   private static native void setposition0(int var0, int var1, int var2, int var3);

   private static native void navigate0(String var0);

   private static native void destroy0();

   private static native void detach0();
}
