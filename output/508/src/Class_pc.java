abstract class Class_pc {
   static Class_sg a;
   int b;
   static int c;
   int d;
   static int e;
   static boolean f = false;
   static short[][] g;
   static int h;
   static Class_cj i;
   static int j;
   static int k;
   int l;
   static Class_r m = Class_tc.a(43, ")3runescape)3com)4l=");
   int n;
   int o;
   int p;

   static final int a(int var0, byte var1) {
      try {
         int var2 = -12 / ((-52 - var1) / 55);
         int var3 = 0;
         if (~var0 > -1 || var0 >= 65536) {
            var3 += 16;
            var0 >>>= 16;
         }

         if (var0 >= 256) {
            var3 += 8;
            var0 >>>= 8;
         }

         if (var0 >= 16) {
            var3 += 4;
            var0 >>>= 4;
         }

         if (~var0 <= -5) {
            var0 >>>= 2;
            var3 += 2;
         }

         k++;
         if (var0 >= 1) {
            var0 >>>= 1;
            var3++;
         }

         return var3 - -var0;
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "pc.F(" + var0 + 44 + var1 + 41);
      }
   }

   abstract void a(int var1, int var2);

   abstract void a(int var1, int var2, int var3);

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0) {
      int var2 = client.lb;

      try {
         h++;
         Class_db.a();
         if (var0 == 297) {
            int var1 = 0;
            if (var2 == 0 && var1 >= 4) {
               System.gc();
            } else {
               do {
                  Class_sj.j[var1].a(false);
               } while (++var1 < 4);

               System.gc();
            }
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "pc.A(" + var0 + ')');
      }
   }

   public static void b(int var0) {
      try {
         m = null;
         if (var0 != -1) {
            m = null;
         }

         g = null;
         i = null;
         a = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "pc.D(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, long var1) {
      int var5 = client.lb;

      try {
         j++;
         if (var1 != 0L) {
            if (var0 >= -125) {
               i = null;
            }

            int var3 = 0;
            if (var5 != 0 || Class_ok.bb > var3) {
               while (~var1 != ~Class_sg.rb[var3]) {
                  if (Class_ok.bb <= ++var3) {
                     return;
                  }
               }

               Class_ih.Z++;
               Class_ok.bb--;
               int var4 = var3;
               if (var5 == 0 && var3 >= Class_ok.bb) {
                  Class_vf.l = Class_qd.F;
                  Class_cj.S.o(72, 2);
                  Class_cj.S.a(true, var1);
               } else {
                  do {
                     Class_sg.rb[var4] = Class_sg.rb[var4 - -1];
                     Class_dc.D[var4] = Class_dc.D[var4 - -1];
                  } while (++var4 < Class_ok.bb);

                  Class_vf.l = Class_qd.F;
                  Class_cj.S.o(72, 2);
                  Class_cj.S.a(true, var1);
               }
            }
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "pc.C(" + var0 + ',' + var1 + ')');
      }
   }

   public Class_pc() {
   }
}
