final class Class_we extends Class_pe {
   static int[] I = new int[1000];
   static int J;
   byte[] K;
   static short[][] L = new short[][]{
      {
            6554,
            115,
            10304,
            28,
            5702,
            7756,
            5681,
            4510,
            -31835,
            22437,
            2859,
            -11339,
            16,
            5157,
            10446,
            3658,
            -27314,
            -21965,
            472,
            580,
            784,
            21966,
            28950,
            -15697,
            -14002
      },
      {
            9104,
            10275,
            7595,
            3610,
            7975,
            8526,
            918,
            -26734,
            24466,
            10145,
            -6882,
            5027,
            1457,
            16565,
            -30545,
            25486,
            24,
            5392,
            10429,
            3673,
            -27335,
            -21957,
            192,
            687,
            412,
            21821,
            28835,
            -15460,
            -14019
      },
      new short[0],
      new short[0],
      new short[0]
   };

   static final int a(int var0, byte var1) {
      try {
         var0 = (-715827883 & var0 >>> -537680191) + (1431655765 & var0);
         J++;
         var0 = ((var0 & -858993460) >>> 2117050626) + (var0 & 858993459);
         var0 = (var0 >>> -1297626044) + var0 & 252645135;
         var0 += var0 >>> 1350981032;
         if (var1 >= -71) {
            a(-59, (byte)11);
         }

         var0 += var0 >>> -1295753584;
         return 0xFF & var0;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "we.A(" + var0 + 44 + var1 + 41);
      }
   }

   Class_we(byte[] var1) {
      try {
         this.K = var1;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "we.<init>(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   public static void d(int var0) {
      try {
         if (var0 == 26507) {
            I = null;
            L = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "we.B(" + var0 + ')');
      }
   }
}
