final class Class_qc {
   static Class_ha a;
   static int b;
   private int c;
   private Class_tg d;
   static int[] e = new int[200];
   static int f;
   static int g;
   static int h;
   static int i;
   static int j;
   private Class_wh k = new Class_wh();
   static int l;
   private int m;

   static final void a(int var0, int var1) {
      try {
         i++;
         if (var1 >= 52) {
            Class_vb.a.b(-18767, var0);
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "qc.I(" + var0 + ',' + var1 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final void b(int var1, int var2) {
      int var5 = client.lb;

      try {
         if (var1 != -18767) {
            e = null;
         }

         if (Class_md.s != null) {
            Class_qj var3 = (Class_qj)this.k.b(1742);
            if (var5 != 0 || var3 != null) {
               do {
                  label34: {
                     if (var3.e(-111)) {
                        if (var3.d(var1 ^ 18715) != null) {
                           break label34;
                        }

                        var3.c(var1 + 1213);
                        var3.b((byte)73);
                        this.c++;
                        if (var5 == 0) {
                           break label34;
                        }
                     }

                     if (~(++var3.v) < ~var2) {
                        Class_qj var4 = Class_md.s.a(var3, (byte)122);
                        this.d.a((byte)126, var4, var3.a);
                        Class_bg.a((byte)-74, var4, var3);
                        var3.c(-17554);
                        var3.b((byte)73);
                     }
                  }

                  var3 = (Class_qj)this.k.e(var1 + 18644);
               } while (var3 != null);
            }
         }

         l++;
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "qc.C(" + var1 + ',' + var2 + ')');
      }
   }

   public static void a(byte var0) {
      try {
         a = null;
         e = null;
         int var1 = -75 / ((80 - var0) / 41);
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "qc.B(" + var0 + ')');
      }
   }

   final void b(byte var1) {
      try {
         if (var1 == 94) {
            g++;
            this.k.a((byte)-39);
            this.d.a(false);
            this.c = this.m;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "qc.H(" + var1 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final void a(int var1) {
      int var4 = client.lb;

      try {
         Class_qj var2 = (Class_qj)this.k.b(1742);
         if (var4 == 0 && var2 == null) {
            f++;
            int var6 = 13 % ((var1 - 51) / 56);
         } else {
            do {
               if (var2.e(-112)) {
                  var2.c(-17554);
                  var2.b((byte)73);
                  this.c++;
               }

               var2 = (Class_qj)this.k.e(-105);
            } while (var2 != null);

            f++;
            int var3 = 13 % ((var1 - 51) / 56);
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "qc.F(" + var1 + ')');
      }
   }

   final void a(Object var1, int var2, long var3) {
      try {
         h++;
         this.a((byte)28, var3);
         if (~this.c == -1) {
            Class_qj var5 = (Class_qj)this.k.d(2265);
            var5.c(-17554);
            var5.b((byte)73);
         } else {
            this.c--;
         }

         if (var2 > 95) {
            Class_o var7 = new Class_o(var1);
            this.d.a((byte)125, var7, var3);
            this.k.a(71, var7);
            var7.v = 0L;
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "qc.D(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   final void a(byte var1, long var2) {
      try {
         j++;
         Class_qj var4 = (Class_qj)this.d.a(var2, var1 + -111);
         if (var4 != null) {
            var4.c(-17554);
            var4.b((byte)73);
            this.c++;
         }

         if (var1 != 28) {
            this.m = -4;
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "qc.A(" + var1 + ',' + var2 + ')');
      }
   }

   final Object a(int var1, long var2) {
      try {
         b++;
         if (var1 != 14366) {
            a((byte)64);
         }

         Class_qj var4 = (Class_qj)this.d.a(var2, 90);
         if (var4 == null) {
            return null;
         } else {
            Object var5 = var4.d(-105);
            if (var5 == null) {
               var4.c(-17554);
               var4.b((byte)73);
               this.c++;
               return null;
            } else {
               if (!var4.e(-109)) {
                  this.k.a(var1 ^ 14427, var4);
                  var4.v = 0L;
               } else {
                  Class_o var6 = new Class_o(var5);
                  this.d.a((byte)-40, var6, var4.a);
                  this.k.a(99, var6);
                  var6.v = 0L;
                  var4.c(var1 ^ -31888);
                  var4.b((byte)73);
               }

               return var5;
            }
         }
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "qc.E(" + var1 + ',' + var2 + ')');
      }
   }

   Class_qc(int var1) {
      try {
         this.m = var1;
         byte var2 = 1;
         this.c = var1;

         while (~var1 < ~(var2 + var2)) {
            var2 += var2;
         }

         this.d = new Class_tg(var2);
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "qc.<init>(" + var1 + ')');
      }
   }

   static final void a(int var0, int var1, int var2, int var3, Class_a var4, long var5, boolean var7) {
      if (var4 != null) {
         Class_hd var8 = new Class_hd();
         var8.a = var4;
         var8.k = var1 * 128 + 64;
         var8.b = var2 * 128 + 64;
         var8.g = var3;
         var8.m = var5;
         if (Class_ck.d[var0][var1][var2] == null) {
            Class_ck.d[var0][var1][var2] = new Class_aa(var0, var1, var2);
         }

         Class_ck.d[var0][var1][var2].M = var8;
      }
   }
}
