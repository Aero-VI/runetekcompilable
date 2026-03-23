final class Class_pb {
   static int a;
   short[] b;
   static int c;
   static int d;
   short[] e;
   Class_r[] f;
   static Class_qc g = new Class_qc(64);
   int h;
   byte[] i;
   static int j;
   int[] k;
   static Class_r l = Class_tc.a(43, "scrollbar");
   static Class_r m = Class_tc.a(43, "Texturen geladen)3");
   static int n;

   static final int a(int var0, boolean var1) {
      try {
         if (var1) {
            m = null;
         }

         n++;
         int var2 = 63 & var0;
         int var3 = (var0 & 230) >> 977256934;
         if (~var2 != -19) {
            if (~var2 == -20 || ~var2 == -22) {
               if (var3 == 0) {
                  return 16;
               }

               if (~var3 == -2) {
                  return 32;
               }

               if (var3 == 2) {
                  return 64;
               }

               if (var3 == 3) {
                  return 128;
               }
            }
         } else {
            if (var3 == 0) {
               return 1;
            }

            if (~var3 == -2) {
               return 2;
            }

            if (var3 == 2) {
               return 4;
            }

            if (var3 == 3) {
               return 8;
            }
         }

         return 0;
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "pb.E(" + var0 + 44 + var1 + 41);
      }
   }

   final boolean a(byte var1, int var2) {
      try {
         a++;
         int var3 = 38 % ((var1 - -11) / 51);
         return (4 & this.i[var2]) != 0;
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "pb.F(" + var1 + ',' + var2 + ')');
      }
   }

   public static void a(byte var0) {
      try {
         if (var0 > -52) {
            m = null;
         }

         l = null;
         g = null;
         m = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "pb.A(" + var0 + ')');
      }
   }

   static final void a(int var0, int var1, int var2, Class_ha var3) {
      try {
         c++;
         if (Class_ff.e == null && !Class_ui.h) {
            if (var3 != null && Class_ph.a(var3, (byte)3) != null) {
               if (var2 != -4798) {
                  a(-50, null);
               }

               Class_ff.e = var3;
               Class_ka.mb = Class_ph.a(var3, (byte)3);
               Class_vg.L = 0;
               Class_jf.a = var1;
               Class_oj.W = var0;
               Class_bj.d = false;
            }
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "pb.B(" + var0 + ',' + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
      }
   }

   static final void a(int var0, Class_ha var1) {
      try {
         if (var0 != 30341) {
            a(-53, true);
         }

         int var2 = var1.ab;
         d++;
         if (var2 == 324) {
            if (Class_nd.C == -1) {
               Class_nd.C = var1.Gb;
               Class_se.lb = var1.zb;
            }

            if (Class_te.U.q) {
               var1.Gb = Class_nd.C;
            } else {
               var1.Gb = Class_se.lb;
            }
         } else if (var2 == 325) {
            if (~Class_nd.C == 0) {
               Class_nd.C = var1.Gb;
               Class_se.lb = var1.zb;
            }

            if (Class_te.U.q) {
               var1.Gb = Class_se.lb;
            } else {
               var1.Gb = Class_nd.C;
            }
         } else if (~var2 == -328) {
            var1.ec = 150;
            var1.gb = (int)(256.0 * Math.sin(Class_be.C / 40.0)) & 2047;
            var1.V = -1;
            var1.fc = 5;
         } else if (var2 == 328) {
            if (Class_gg.B.Zb == null) {
               var1.V = 0;
            } else {
               var1.ec = 150;
               var1.gb = (int)(256.0 * Math.sin(Class_be.C / 40.0)) & 2047;
               var1.fc = 5;
               var1.V = 2047 + ((int)Class_gg.B.Zb.f(10908) << -1259687477);
               var1.xb = Class_gg.B.w;
               var1.a = Class_gg.B.bb;
            }
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "pb.D(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   final int a(int var1, int var2) {
      try {
         int var3 = 20 / ((29 - var1) / 48);
         j++;
         return 3 & this.i[var2];
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "pb.C(" + var1 + 44 + var2 + 41);
      }
   }

   Class_pb(int var1) {
      try {
         this.h = var1;
         this.e = new short[this.h];
         this.b = new short[this.h];
         this.k = new int[this.h];
         this.i = new byte[this.h];
         this.f = new Class_r[this.h];
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "pb.<init>(" + var1 + ')');
      }
   }
}
