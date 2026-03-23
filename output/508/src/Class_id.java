import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

final class Class_id {
   private static Class_r a = Class_tc.a(43, "Your ignore list is full)3 Max of 100 users)3");
   static int b;
   private int c;
   private byte[] d = new byte[4];
   private int e;
   static boolean f;
   static int g;
   static Class_qc h = new Class_qc(500);
   private Class_ei i;
   static Class_r j = Class_tc.a(43, " )2>");
   private byte[] k;
   static Class_pc[] l;
   static Class_r m = a;
   static int n = 0;
   private long o;
   private int p;
   static Class_r q = Class_tc.a(43, ")4a=");
   static int r;
   static Class_sg s;
   private DataInputStream t;
   static int u = 0;
   static byte[][][] v;

   final byte[] a(byte var1) throws IOException {
      try {
         g++;
         if (~Class_fj.a(17161) < ~this.o) {
            throw new IOException("fdt");
         } else if (var1 <= 15) {
            return null;
         } else {
            if (~this.e == -1) {
               if (this.i.b == 2) {
                  throw new IOException("fds");
               }

               if (this.i.b == 1) {
                  this.e = 1;
                  this.t = (DataInputStream)this.i.e;
                  if (client.lb != 0) {
                     throw new IOException("fds");
                  }
               }
            }

            if (this.e == 1) {
               int var2 = this.t.available();
               if (~var2 < -1) {
                  if (~(var2 + this.c) < -5) {
                     var2 = -this.c + 4;
                  }

                  this.c = this.c + this.t.read(this.d, this.c, var2);
                  if (~this.c == -5) {
                     int var3 = new Class_lh(this.d).h(-5528);
                     this.e = 2;
                     this.k = new byte[var3];
                  }
               }
            }

            if (~this.e == -3) {
               int var5 = this.t.available();
               if (~var5 < -1) {
                  if (~(var5 + this.p) < ~this.k.length) {
                     var5 = this.k.length + -this.p;
                  }

                  this.p = this.p + this.t.read(this.k, this.p, var5);
                  if (this.p == this.k.length) {
                     return this.k;
                  }
               }
            }

            return null;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "id.B(" + var1 + ')');
      }
   }

   static final boolean a(int var0, boolean var1) {
      try {
         if (!var1) {
            return true;
         } else {
            b++;
            return ~((286878853 & var0) >> -137274020) != -1;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "id.C(" + var0 + ',' + var1 + ')');
      }
   }

   static final void a(int var0, int var1, Class_eh var2, Class_ub var3, int var4, int var5, int var6, Class_fa var7) {
      try {
         if (var0 != 19395) {
            b((byte)123);
         }

         Class_nf var8 = new Class_nf();
         var8.P = 128 * var5;
         var8.q = var6;
         r++;
         var8.C = var1 * 128;
         if (var3 == null) {
            if (var2 != null) {
               Class_nd var12 = var2.Pb;
               var8.L = var2;
               if (var12.z != null) {
                  var8.M = true;
                  var12 = var12.d(var0 ^ -19359);
               }

               if (var12 != null) {
                  var8.N = (var5 + var12.T) * 128;
                  var8.p = 128 * (var1 - -var12.T);
                  var8.t = Class_me.a(var2, false);
                  var8.I = 128 * var12.fb;
               }

               Class_hh.d.a(var8, true);
            } else if (var7 != null) {
               var8.p = 128 * (var7.Q + var1);
               var8.N = (var7.Q + var5) * 128;
               var8.B = var7;
               var8.t = Class_ra.a(var7, var0 ^ -20967);
               var8.I = 128 * var7.mc;
               Class_qe.F.a((byte)119, var8, var7.Zb.f(10908));
            }
         } else {
            var8.E = var3.K;
            var8.t = var3.x;
            var8.I = 128 * var3.q;
            var8.K = var3.Q;
            int var10 = var3.C;
            var8.w = var3;
            var8.v = var3.f;
            int var9 = var3.D;
            if (~var4 == -2 || ~var4 == -4) {
               var9 = var3.C;
               var10 = var3.D;
            }

            var8.N = 128 * (var9 + var5);
            var8.p = (var10 + var1) * 128;
            if (var3.J != null) {
               var8.M = true;
               var8.e(var0 + 12111);
            }

            if (var8.E != null) {
               var8.F = var8.v - -((int)(Math.random() * (-var8.v + var8.K)));
            }

            Class_ba.c.a(var8, true);
         }
      } catch (RuntimeException var11) {
         throw Class_sh.a(
            var11,
            "id.A("
               + var0
               + ','
               + var1
               + ','
               + (var2 != null ? "{...}" : "null")
               + ','
               + (var3 != null ? "{...}" : "null")
               + ','
               + var4
               + ','
               + var5
               + ','
               + var6
               + ','
               + (var7 != null ? "{...}" : "null")
               + ')'
         );
      }
   }

   Class_id(Class_ik var1, URL var2) {
      try {
         this.i = var1.a(var2, 0);
         this.e = 0;
         this.o = 30000L + Class_fj.a(17161);
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "id.<init>(" + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ? "{...}" : "null") + ')');
      }
   }

   public static void b(byte var0) {
      try {
         s = null;
         j = null;
         a = null;
         h = null;
         l = null;
         m = null;
         int var1 = 59 % ((-19 - var0) / 34);
         v = null;
         q = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "id.D(" + var0 + ')');
      }
   }
}
