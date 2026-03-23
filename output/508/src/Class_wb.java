final class Class_wb implements Runnable {
   static Class_r a = Class_wb.k;
   Class_ik b;
   static int c;
   static int d;
   static int[] e = new int[32];
   static Class_cj f;
   static Class_qc g = new Class_qc(200);
   static int h;
   static int i = 0;
   volatile Class_ff[] j = new Class_ff[2];
   private static Class_r k = Class_tc.a(43, "You can(Wt add yourself to your own ignore list)3");
   volatile boolean l = false;
   static int m;
   volatile boolean n = false;
   static int o;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public final void run() {
      int var5 = client.lb;

      try {
         this.n = true;
         o++;

         try {
            if (var5 != 0 || !this.l) {
               do {
                  int var3 = 0;
                  if (var5 != 0 || ~var3 > -3) {
                     do {
                        Class_ff var4 = this.j[var3];
                        if (var4 != null) {
                           var4.c((byte)54);
                        }
                     } while (~(++var3) > -3);
                  }

                  Class_hg.a(-5, 10L);
                  Class_hc.a(this.b, null, (byte)-103);
               } while (!this.l);
            }
         } catch (Exception var9) {
            Class_mc.a(null, var9, 38);
         } finally {
            this.n = false;
         }
      } catch (RuntimeException var11) {
         throw Class_sh.a(var11, "wb.run(" + ')');
      }
   }

   static final Class_bk a(byte var0, int var1) {
      try {
         d++;
         Class_bk var2 = (Class_bk)Class_rj.I.a((long)var1, (byte)-76);
         if (var2 != null) {
            return var2;
         } else {
            byte[] var3 = Class_sj.l.a(var1, 0, 5);
            if (var0 <= 103) {
               k = null;
            }

            var2 = new Class_bk();
            if (var3 != null) {
               var2.a((byte)108, new Class_lh(var3));
            }

            Class_rj.I.a(var1, (byte)-105, var2);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "wb.A(" + var0 + ',' + var1 + ')');
      }
   }

   public static void a(int var0) {
      try {
         f = null;
         a = null;
         g = null;
         e = null;
         int var1 = -37 / ((62 - var0) / 41);
         k = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "wb.B(" + var0 + ')');
      }
   }
}
