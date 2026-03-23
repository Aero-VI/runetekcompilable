import java.util.Calendar;
import java.util.TimeZone;

final class Class_mb {
   static int a;
   private int b = 128;
   static int c;
   private int d;
   private int e;
   static int f;
   private int g = 0;
   private short[] h;
   private short[] i;
   static int j;
   static int k;
   private int l;
   static int m;
   private short[] n;
   int o;
   static int p;
   boolean q;
   static int r;
   static int s = 0;
   int t;
   static Calendar u = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
   private int v;
   private short[] w;
   static Class_jb[] x;
   static int y = 0;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private final void a(int var1, Class_lh var2, int var3) {
      int var6 = client.lb;

      try {
         a++;
         if (var3 <= 77) {
            a(null, -50);
         }

         if (~var1 == -2) {
            this.e = var2.k(1355769544);
         } else if (~var1 == -3) {
            this.t = var2.k(1355769544);
         } else if (~var1 == -5) {
            this.b = var2.k(1355769544);
         } else if (var1 == 5) {
            this.d = var2.k(1355769544);
         } else if (~var1 != -7) {
            if (var1 == 7) {
               this.l = var2.n(-6677);
            } else if (~var1 != -9) {
               if (~var1 == -10) {
                  this.q = true;
               } else {
                  if (~var1 != -41) {
                     if (var1 == 41) {
                        int var4 = var2.n(-6677);
                        this.w = new short[var4];
                        this.h = new short[var4];
                        int var5 = 0;
                        if (var6 == 0 && var5 >= var4) {
                           return;
                        } else {
                           do {
                              this.w[var5] = (short)var2.k(1355769544);
                              this.h[var5] = (short)var2.k(1355769544);
                           } while (++var5 < var4);

                           return;
                        }
                     }
                  } else {
                     int var8 = var2.n(-6677);
                     this.i = new short[var8];
                     this.n = new short[var8];
                     int var9 = 0;
                     if (var6 != 0 || ~var8 < ~var9) {
                        do {
                           this.n[var9] = (short)var2.k(1355769544);
                           this.i[var9] = (short)var2.k(1355769544);
                        } while (~var8 < ~(++var9));
                     }
                  }
               }
            } else {
               this.v = var2.n(-6677);
            }
         } else {
            this.g = var2.k(1355769544);
         }
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "mb.D(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
      }
   }

   public static void a(byte var0) {
      try {
         u = null;
         x = null;
         int var1 = 90 % ((61 - var0) / 59);
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "mb.G(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var35 = client.lb;

      try {
         label47: {
            if (var5 != var3 || var7 != var4 || var0 != var8 || var9 != var2) {
               int var10 = var5;
               int var11 = var4;
               int var12 = 3 * var5;
               int var13 = 3 * var4;
               int var15 = 3 * var7;
               int var14 = var3 * 3;
               int var16 = 3 * var8;
               int var17 = var2 * 3;
               int var18 = var14 + var0 + (-var16 - var5);
               int var19 = -var4 + -var17 + var9 + var15;
               int var21 = -var15 + -var15 + (var17 - -var13);
               int var20 = var12 + -var14 + var16 + -var14;
               int var22 = var14 - var12;
               int var23 = var15 - var13;
               short var24 = 128;
               if (var35 != 0 || ~var24 >= -4097) {
                  do {
                     int var25 = var24 * var24 >> -160204692;
                     int var26 = var24 * var25 >> -431407540;
                     int var28 = var26 * var19;
                     int var27 = var26 * var18;
                     int var30 = var21 * var25;
                     int var32 = var23 * var24;
                     int var29 = var20 * var25;
                     int var31 = var22 * var24;
                     int var33 = var5 + (var29 + (var27 - -var31) >> 330027852);
                     int var34 = var4 - -(var32 + var28 + var30 >> -49365812);
                     Class_h.a(var10, var34, (byte)87, var33, var6, var11);
                     var10 = var33;
                     var11 = var34;
                     var24 += 128;
                  } while (~var24 >= -4097);
               }

               if (var35 == 0) {
                  break label47;
               }
            }

            Class_h.a(var5, var9, (byte)126, var0, var6, var4);
         }

         m++;
         if (var1 >= -15) {
            a(51, -81, -54, 36, 92, -32, 125, -18, -46, 118);
         }
      } catch (RuntimeException var36) {
         throw Class_sh.a(
            var36, "mb.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ')'
         );
      }
   }

   static final Class_jf a(Class_lh var0, int var1) {
      try {
         c++;
         Class_jf var2 = new Class_jf();
         if (var1 != -10) {
            x = null;
         }

         var2.c = var0.k(var1 ^ -1355769538);
         var2.m = Class_ud.a(var2.c, (byte)111);
         return var2;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "mb.F(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
      }
   }

   static int a(int var0, int var1) {
      try {
         return var0 | var1;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "mb.B(" + var0 + 44 + var1 + 41);
      }
   }

   final void b(Class_lh var1, int var2) {
      int var4 = client.lb;

      try {
         do {
            int var3 = var1.n(-6677);
            if (~var3 == -1) {
               break;
            }

            this.a(var3, var1, 84);
         } while (var4 == 0);

         p++;
         if (var2 != -1) {
            a(null, 120);
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "mb.C(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final Class_jh b(int var1, int var2) {
      int var6 = client.lb;

      try {
         if (var2 != -10) {
            return null;
         } else {
            r++;
            Class_jh var3 = (Class_jh)Class_rd.M.a(14366, (long)this.o);
            if (var3 == null) {
               Class_ne var4 = Class_ne.a(Class_rj.L, this.e, 0);
               if (var4 == null) {
                  return null;
               }

               if (this.n != null) {
                  int var5 = 0;
                  if (var6 != 0 || ~var5 > ~this.n.length) {
                     do {
                        var4.b(this.n[var5], this.i[var5]);
                     } while (~(++var5) > ~this.n.length);
                  }
               }

               if (this.w != null) {
                  int var9 = 0;
                  if (var6 != 0 || ~this.w.length < ~var9) {
                     do {
                        var4.a(this.w[var9], this.h[var9]);
                     } while (~this.w.length < ~(++var9));
                  }
               }

               var3 = var4.c(this.l + 64, 850 + this.v, -30, -50, -30);
               Class_rd.M.a(var3, var2 + 123, this.o);
            }

            Class_jh var8;
            label98: {
               if (this.t == -1 || var1 == -1) {
                  var8 = var3.a(true, true);
                  if (var6 == 0) {
                     break label98;
                  }
               }

               var8 = Class_kk.a((byte)-36, this.t).a(var3, 8493, var1);
            }

            if (~this.b != -129 || ~this.d != -129) {
               var8.b(this.b, this.d, this.b);
            }

            if (~this.g != -1) {
               if (this.g == 90) {
                  var8.e();
               }

               if (this.g == 180) {
                  var8.f();
               }

               if (~this.g == -271) {
                  var8.i();
               }
            }

            return var8;
         }
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "mb.E(" + var1 + ',' + var2 + ')');
      }
   }

   public Class_mb() {
      this.d = 128;
      this.q = false;
      this.l = 0;
      this.t = -1;
      this.v = 0;
   }
}
