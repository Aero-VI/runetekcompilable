final class Class_fh extends Class_pe {
   static int I = 0;
   static int J;
   static int K;
   static int M = 0;
   static Class_r N = Class_tc.a(43, ")4g");
   static int O = -2;
   static int P;
   static int Q;
   static int R = 0;
   static int[] S = new int[]{16, 32, 64, 128};
   static long T = 0L;
   static int[] U = new int[]{1, 0, -1, 0};
   private Class_tg V;
   static int W;
   static short[] X = new short[256];
   static Class_r Y = Class_tc.a(43, "(U");

   public static void d(int var0) {
      try {
         if (var0 != -23562) {
            a(false, 72, 88, 47, null);
         }

         S = null;
         N = null;
         Y = null;
         U = null;
         X = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "fh.E(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private final void a(int var1, int var2, Class_lh var3) {
      int var9 = client.lb;

      try {
         if (var1 == 249) {
            int var4 = var3.n(-6677);
            if (this.V == null) {
               int var5 = Class_pa.f(var4, -21189);
               this.V = new Class_tg(var5);
            }

            int var11 = 0;
            if (var9 != 0 || var11 < var4) {
               do {
                  int var7;
                  Object var8;
                  label45: {
                     boolean var6 = var3.n(var2 ^ 6673) == 1;
                     var7 = var3.b((byte)-69);
                     if (!var6) {
                        var8 = new Class_kg(var3.h(-5528));
                        if (var9 == 0) {
                           break label45;
                        }
                     }

                     var8 = new Class_ef(var3.e(127));
                  }

                  this.V.a((byte)127, (Class_li)var8, var7);
               } while (++var11 < var4);
            }
         }

         if (var2 != -6) {
            this.a(34, -83, -92);
         }

         Q++;
      } catch (RuntimeException var10) {
         throw Class_sh.a(var10, "fh.A(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
      }
   }

   static final void a(boolean var0, int var1, int var2, int var3, Class_ha var4) {
      int var8 = client.lb;

      try {
         if (var1 <= 9) {
            S = null;
         }

         int var5;
         int var6;
         label126: {
            K++;
            var5 = var4.Gc;
            var6 = var4.nc;
            if (var4.x != 0) {
               if (var4.x == 1) {
                  var4.Gc = -var4.r + var3;
                  if (var8 == 0) {
                     break label126;
                  }
               }

               if (~var4.x == -3) {
                  var4.Gc = var4.r * var3 >> -1008088050;
                  if (var8 == 0) {
                     break label126;
                  }
               }

               if (var4.x != 3) {
                  break label126;
               }

               if (~var4.Kc == -3) {
                  var4.Gc = (-1 + var4.r) * var4.zc + 32 * var4.r;
                  if (var8 == 0) {
                     break label126;
                  }
               }

               if (var4.Kc != 7) {
                  break label126;
               }

               var4.Gc = 115 * var4.r + (-1 + var4.r) * var4.zc;
               if (var8 == 0) {
                  break label126;
               }
            }

            var4.Gc = var4.r;
         }

         label133: {
            if (~var4.db == -1) {
               var4.nc = var4.Nc;
               if (var8 == 0) {
                  break label133;
               }
            }

            if (~var4.db != -2) {
               if (var4.db == 2) {
                  var4.nc = var2 * var4.Nc >> -37038450;
                  if (var8 == 0) {
                     break label133;
                  }
               }

               if (var4.db != 3) {
                  break label133;
               }

               if (var4.Kc == 2) {
                  var4.nc = var4.Mb * (-1 + var4.Nc) + 32 * var4.Nc;
                  if (var8 == 0) {
                     break label133;
                  }
               }

               if (~var4.Kc != -8) {
                  break label133;
               }

               var4.nc = (-1 + var4.Nc) * var4.Mb + var4.Nc * 12;
               if (var8 == 0) {
                  break label133;
               }
            }

            var4.nc = var2 - var4.Nc;
         }

         if (var4.x == 4) {
            var4.Gc = var4.Pb * var4.nc / var4.m;
         }

         if (~var4.db == -5) {
            var4.nc = var4.Gc * var4.m / var4.Pb;
         }

         label86:
         if (Class_pe.E && (client.b(var4) != 0 || var4.Kc == 0)) {
            if (~var4.nc > -6 && ~var4.Gc > -6) {
               var4.Gc = 5;
               var4.nc = 5;
               if (var8 == 0) {
                  break label86;
               }
            }

            if (var4.Gc <= 0) {
               var4.Gc = 5;
            }

            if (var4.nc <= 0) {
               var4.nc = 5;
            }
         }

         if (var4.ab == 1337) {
            Class_w.S = var4;
         }

         if (var0 && var4.U != null) {
            if (var5 != var4.Gc || var6 != var4.nc) {
               Class_wj var7 = new Class_wj();
               var7.x = var4.U;
               var7.z = var4;
               Class_ti.q.a(var7, true);
            }
         }
      } catch (RuntimeException var9) {
         throw Class_sh.a(var9, "fh.F(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ')');
      }
   }

   final Class_r a(int var1, Class_r var2, int var3) {
      try {
         P++;
         if (this.V == null) {
            return var2;
         } else {
            Class_ef var4 = (Class_ef)this.V.a(var3, 73);
            if (var1 != -1) {
               return null;
            } else {
               return var4 == null ? var2 : var4.p;
            }
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "fh.B(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
      }
   }

   final int a(int var1, int var2, int var3) {
      try {
         W++;
         if (this.V == null) {
            return var1;
         } else if (var2 != 9081) {
            return -34;
         } else {
            Class_kg var4 = (Class_kg)this.V.a(var3, 74);
            return var4 == null ? var1 : var4.r;
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "fh.D(" + var1 + 44 + var2 + 44 + var3 + 41);
      }
   }

   public Class_fh() {
   }

   final void a(Class_lh var1, byte var2) {
      int var4 = client.lb;

      try {
         if (var2 > -91) {
            this.a(93, -71, null);
         }

         do {
            int var3 = var1.n(-6677);
            if (~var3 == -1) {
               break;
            }

            this.a(var3, -6, var1);
         } while (var4 == 0);

         J++;
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "fh.C(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
      }
   }
}
