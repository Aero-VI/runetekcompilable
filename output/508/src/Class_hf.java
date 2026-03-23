import java.io.IOException;
import java.net.Socket;

final class Class_hf {
   static int a = 0;
   static Class_r b = Class_tc.a(43, "document)3cookie=(R");
   int c;
   static int d;
   static Class_ri e;
   private byte f;
   int g;
   static int h;
   static byte[][][] i;
   static int j;
   int k;
   static int l;
   static int m;
   int n;
   static int o;
   int p;

   public static void a(boolean var0) {
      try {
         if (!var0) {
            e = null;
         }

         i = null;
         b = null;
         e = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "hf.D(" + var0 + ')');
      }
   }

   final int a(int var1) {
      try {
         if (var1 != 7) {
            return -110;
         } else {
            j++;
            return 7 & this.f;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "hf.F(" + var1 + 41);
      }
   }

   final int b(int var1) {
      try {
         m++;
         if (var1 != 8) {
            return 97;
         } else {
            return ~(this.f & 8) != -9 ? 0 : 1;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "hf.E(" + var1 + 41);
      }
   }

   static final void c(int var0) {
      try {
         d++;
         if (Class_a.m != null) {
            Class_a.m.c((byte)94);
         }

         if (var0 == 16322) {
            if (Class_ve.V != null) {
               Class_ve.V.c((byte)119);
            }
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "hf.C(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(byte var0) {
      int var2 = client.lb;

      try {
         o++;
         if (~Class_pi.rb != -1) {
            try {
               if (++Class_kk.o > 2000) {
                  if (Class_wf.k != null) {
                     Class_wf.k.b(-47);
                     Class_wf.k = null;
                  }

                  if (Class_of.i >= 1) {
                     Class_hg.c = -5;
                     Class_pi.rb = 0;
                     return;
                  }

                  label112: {
                     Class_pi.rb = 1;
                     if (~Class_sb.o == ~Class_ti.h) {
                        Class_sb.o = Class_lk.r;
                        if (var2 == 0) {
                           break label112;
                        }
                     }

                     Class_sb.o = Class_ti.h;
                  }

                  Class_kk.o = 0;
                  Class_of.i++;
               }

               if (Class_pi.rb == 1) {
                  Class_ke.B = Class_rj.J.a(Class_kc.r, (byte)113, Class_sb.o);
                  Class_pi.rb = 2;
               }

               if (~Class_pi.rb == -3) {
                  if (Class_ke.B.b == 2) {
                     throw new IOException();
                  }

                  if (Class_ke.B.b != 1) {
                     return;
                  }

                  Class_wf.k = new Class_jk((Socket)Class_ke.B.e, Class_rj.J);
                  Class_ke.B = null;
                  Class_wf.k.a(0, (byte)78, Class_cj.S.p, Class_cj.S.E);
                  if (Class_ve.V != null) {
                     Class_ve.V.a(false);
                  }

                  if (Class_a.m != null) {
                     Class_a.m.a(false);
                  }

                  int var1 = Class_wf.k.a(55);
                  if (Class_ve.V != null) {
                     Class_ve.V.a(false);
                  }

                  if (Class_a.m != null) {
                     Class_a.m.a(false);
                  }

                  if (~var1 != -22) {
                     Class_pi.rb = 0;
                     Class_hg.c = var1;
                     Class_wf.k.b(-89);
                     Class_wf.k = null;
                     return;
                  }

                  Class_pi.rb = 3;
               }

               if (var0 < 5) {
                  c(110);
               }

               if (~Class_pi.rb == -4) {
                  if (~Class_wf.k.a((byte)102) > -2) {
                     return;
                  }

                  Class_jc.x = new Class_r[Class_wf.k.a(114)];
                  Class_pi.rb = 4;
               }

               if (Class_pi.rb == 4) {
                  if (Class_wf.k.a((byte)102) >= Class_jc.x.length * 8) {
                     Class_f.T.p = 0;
                     Class_wf.k.a(3, 8 * Class_jc.x.length, 0, Class_f.T.E);
                     int var5 = 0;
                     if (var2 != 0) {
                        Class_jc.x[var5] = Class_jd.a(Class_f.T.j(88), -1);
                        var5++;
                     }

                     while (var5 < Class_jc.x.length) {
                        Class_jc.x[var5] = Class_jd.a(Class_f.T.j(88), -1);
                        var5++;
                     }

                     Class_hg.c = 21;
                     Class_pi.rb = 0;
                     Class_wf.k.b(-25);
                     Class_wf.k = null;
                  }
               }
            } catch (IOException var3) {
               if (Class_wf.k != null) {
                  Class_wf.k.b(-119);
                  Class_wf.k = null;
               }

               if (~Class_of.i <= -2) {
                  Class_hg.c = -4;
                  Class_pi.rb = 0;
               } else {
                  label86: {
                     if (Class_sb.o != Class_ti.h) {
                        Class_sb.o = Class_ti.h;
                        if (var2 == 0) {
                           break label86;
                        }
                     }

                     Class_sb.o = Class_lk.r;
                  }

                  Class_pi.rb = 1;
                  Class_of.i++;
                  Class_kk.o = 0;
               }
            }
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "hf.A(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(boolean var0, boolean var1) {
      int var11 = client.lb;

      try {
         l++;
         byte[][] var3 = Class_d.b;
         byte var2 = 4;
         int var4 = var3.length;
         int var5 = 0;
         if (var11 != 0 || ~var5 > ~var4) {
            do {
               int var6 = -Class_fj.e + (Class_uh.e[var5] >> 567718824) * 64;
               int var7 = -Class_va.ab + (Class_uh.e[var5] & 0xFF) * 64;
               byte[] var8 = var3[var5];
               if (var8 != null) {
                  c(16322);
                  Class_a.a(var7, var8, var6, var0, -4, 8 * (-6 + Class_gk.b), Class_cf.M * 8 - 48, Class_sj.j);
               }
            } while (~(++var5) > ~var4);
         }

         int var13 = 0;
         if (var1) {
            i = null;
            if (var11 == 0 && var13 >= var4) {
               return;
            }
         } else if (var13 >= var4) {
            return;
         }

         do {
            int var15 = 64 * (0xFF & Class_uh.e[var13]) + -Class_va.ab;
            byte[] var9 = var3[var13];
            int var14 = 64 * (Class_uh.e[var13] >> 1005714728) + -Class_fj.e;
            if (var9 != null) {
               var13++;
            } else if (Class_gk.b >= 800) {
               var13++;
            } else {
               c(16322);
               int var10 = 0;
               if (var11 != 0) {
                  Class_vh.a(64, -73, 64, var10, var15, var14);
                  var10++;
               }

               while (~var2 < ~var10) {
                  Class_vh.a(64, -73, 64, var10, var15, var14);
                  var10++;
               }

               var13++;
            }
         } while (var13 < var4);
      } catch (RuntimeException var12) {
         throw Class_sh.a(var12, "hf.B(" + var0 + ',' + var1 + ')');
      }
   }

   public Class_hf() {
   }

   Class_hf(Class_lh var1) {
      try {
         this.f = var1.o(3390);
         this.c = var1.k(1355769544);
         this.p = var1.h(-5528);
         this.g = var1.h(-5528);
         this.k = var1.h(-5528);
         this.n = var1.h(-5528);
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "hf.<init>(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }
}
