import java.util.zip.CRC32;

final class Class_tc {
   static int a;
   boolean b = false;
   static int c;
   static int d;
   private short[] e;
   static int f;
   static Class_jb[] g;
   private short[] h;
   static int i;
   static Class_dh[] j;
   static CRC32 k = new CRC32();
   static int l;
   private int[] m;
   static int n;
   static int o = 0;
   private int[] p = new int[]{-1, -1, -1, -1, -1};
   static int q;
   private short[] r;
   int s = -1;
   static int t;
   private short[] u;
   static Class_cc v = new Class_cc(5000);
   static int w;
   static int x;

   static final Class_r a(int var0, String var1) {
      try {
         byte[] var2 = var1.getBytes();
         i++;
         int var3 = var2.length;
         Class_r var4 = new Class_r();
         if (var0 != 43) {
            return null;
         } else {
            var4.h = new byte[var3];
            int var5 = 0;

            while (var3 > var5) {
               int var6 = var2[var5++] & 255;
               if (var6 <= 45 && var6 >= 40) {
                  if (~var5 <= ~var3) {
                     break;
                  }

                  int var7 = 255 & var2[var5++];
                  var4.h[var4.G++] = (byte)(var7 + -48 + (var6 + -40) * 43);
               } else if (~var6 != -1) {
                  var4.h[var4.G++] = (byte)var6;
               }
            }

            var4.b(true);
            return var4.h(var0 + 4053);
         }
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "tc.B(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final Class_ne a(boolean var1) {
      int var6 = client.lb;

      try {
         l++;
         if (this.m == null) {
            return null;
         } else {
            Class_ne[] var2 = new Class_ne[this.m.length];
            int var3 = 0;
            if (var6 != 0) {
               var2[var3] = Class_ne.a(Class_lk.y, this.m[var3], 0);
               var3++;
            }

            while (this.m.length > var3) {
               var2[var3] = Class_ne.a(Class_lk.y, this.m[var3], 0);
               var3++;
            }

            if (var1) {
               v = null;
            }

            Class_ne var4;
            label52: {
               if (~var2.length == -2) {
                  var4 = var2[0];
                  if (var6 == 0) {
                     break label52;
                  }
               }

               var4 = new Class_ne(var2, var2.length);
            }

            if (this.u != null) {
               int var5 = 0;
               if (var6 != 0 || ~this.u.length < ~var5) {
                  do {
                     var4.b(this.u[var5], this.r[var5]);
                  } while (~this.u.length < ~(++var5));
               }
            }

            if (this.e != null) {
               int var8 = 0;
               if (var6 != 0 || var8 < this.e.length) {
                  do {
                     var4.a(this.e[var8], this.h[var8]);
                  } while (++var8 < this.e.length);
               }
            }

            return var4;
         }
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "tc.E(" + var1 + ')');
      }
   }

   public static void a(int var0) {
      try {
         if (var0 != 133988164) {
            a(-118, 57, 114);
         }

         j = null;
         k = null;
         v = null;
         g = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "tc.H(" + var0 + ')');
      }
   }

   static final int a(int var0, int var1, int var2) {
      try {
         int var3 = var2 - -(57 * var1);
         if (var0 != 133988164) {
            g = null;
         }

         f++;
         var3 ^= var3 << 1931164621;
         int var4 = 2147483647 & var3 * (15731 * var3 * var3 - -789221) + 1376312589;
         return (var4 & 133988164) >> 1504697395;
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "tc.I(" + var0 + 44 + var1 + 44 + var2 + 41);
      }
   }

   final Class_ne b(int var1) {
      try {
         n++;
         Class_ne[] var2 = new Class_ne[5];
         int var3 = 0;

         for (int var4 = 0; ~var4 > -6; var4++) {
            if (this.p[var4] != -1) {
               var2[var3++] = Class_ne.a(Class_lk.y, this.p[var4], 0);
            }
         }

         if (var1 >= -36) {
            this.b(50);
         }

         Class_ne var5 = new Class_ne(var2, var3);
         if (this.u != null) {
            for (int var6 = 0; this.u.length > var6; var6++) {
               var5.b(this.u[var6], this.r[var6]);
            }
         }

         if (this.e != null) {
            for (int var8 = 0; ~var8 > ~this.e.length; var8++) {
               var5.a(this.e[var8], this.h[var8]);
            }
         }

         return var5;
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "tc.G(" + var1 + ')');
      }
   }

   final boolean c(int var1) {
      try {
         boolean var2 = true;
         if (var1 != -23720) {
            return true;
         } else {
            for (int var3 = 0; ~var3 > -6; var3++) {
               if (~this.p[var3] != 0 && !Class_lk.y.a(this.p[var3], 0, (byte)-128)) {
                  var2 = false;
               }
            }

            d++;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "tc.C(" + var1 + ')');
      }
   }

   final boolean a(byte var1) {
      try {
         q++;
         if (this.m == null) {
            return true;
         } else {
            boolean var2 = true;
            if (var1 >= -114) {
               c = 21;
            }

            for (int var3 = 0; this.m.length > var3; var3++) {
               if (!Class_lk.y.a(this.m[var3], 0, (byte)-117)) {
                  var2 = false;
               }
            }

            return var2;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "tc.F(" + var1 + ')');
      }
   }

   public Class_tc() {
   }

   private final void a(Class_lh var1, int var2, int var3) {
      try {
         w++;
         if (~var2 == -2) {
            this.s = var1.n(-6677);
         } else if (var2 == 2) {
            int var4 = var1.n(-6677);
            this.m = new int[var4];

            for (int var5 = 0; ~var5 > ~var4; var5++) {
               this.m[var5] = var1.k(1355769544);
            }
         } else if (~var2 == -4) {
            this.b = true;
         } else if (~var2 != -41) {
            if (~var2 != -42) {
               if (~var2 <= -61 && ~var2 > -71) {
                  this.p[var2 + -60] = var1.k(Class_bj.a(var3, -1355769576));
               }
            } else {
               int var7 = var1.n(var3 ^ 6715);
               this.e = new short[var7];
               this.h = new short[var7];

               for (int var9 = 0; var7 > var9; var9++) {
                  this.e[var9] = (short)var1.k(1355769544);
                  this.h[var9] = (short)var1.k(var3 + 1355769592);
               }
            }
         } else {
            int var8 = var1.n(var3 ^ 6715);
            this.r = new short[var8];
            this.u = new short[var8];

            for (int var10 = 0; var10 < var8; var10++) {
               this.u[var10] = (short)var1.k(var3 + 1355769592);
               this.r[var10] = (short)var1.k(1355769544);
            }
         }

         if (var3 != -48) {
            o = -103;
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "tc.A(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   final void a(boolean var1, Class_lh var2) {
      try {
         while (true) {
            int var3 = var2.n(-6677);
            if (var3 == 0) {
               t++;
               if (!var1) {
                  this.a((byte)87);
                  return;
               }

               return;
            }

            this.a(var2, var3, -48);
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "tc.D(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
      }
   }
}
