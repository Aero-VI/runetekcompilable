final class Class_gk {
   int[] a;
   static int b;
   Class_rd c;
   static Class_p d;
   static int e;
   int f = -1;
   static int g;
   Class_r[] h;
   static int i = 0;
   static int j;
   static boolean k = true;

   static final void a(int var0, int var1) {
      try {
         g++;
         if (Class_oj.b(var0, (byte)-2)) {
            Class_cb.a(0, Class_ve.ab[var0], var1);
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "gk.A(" + var0 + ',' + var1 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, Class_cj var1) {
      int var13 = client.lb;

      try {
         if (var0 != 3) {
            d = null;
         }

         Class_lf.s = Class_a.a(Class_tf.Y, var1, false);
         j++;
         Class_v.x = new int[256];
         int var2 = 0;
         if (var13 != 0 || ~var2 > -4) {
            do {
               float var3 = 0xFF & Class_ma.R[var2] >> -2137176912;
               int var4 = 0xFF & Class_ma.R[1 + var2] >> -1319431152;
               float var6 = Class_ma.R[var2] >> -1218847512 & 0xFF;
               float var5 = (-var3 + var4) / 64.0F;
               int var7 = Class_ma.R[var2 + 1] >> 1406699464 & 0xFF;
               float var8 = (-var6 + var7) / 64.0F;
               float var9 = 0xFF & Class_ma.R[var2];
               int var10 = Class_ma.R[var2 - -1] & 0xFF;
               float var11 = (var10 - var9) / 64.0F;
               int var12 = 0;
               if (var13 != 0 || ~var12 > -65) {
                  do {
                     Class_v.x[var12 + 64 * var2] = Class_mb.a((int)var9, Class_mb.a((int)var3 << -1933748848, (int)var6 << -892646456));
                     var6 += var8;
                     var3 += var5;
                     var9 += var11;
                  } while (~(++var12) > -65);
               }
            } while (~(++var2) > -4);
         }

         int var15 = 192;
         if (var13 != 0) {
            Class_v.x[var15] = Class_ma.R[3];
            var15++;
         }

         while (~var15 > -256) {
            Class_v.x[var15] = Class_ma.R[3];
            var15++;
         }

         Class_oi.C = new int[32768];
         Class_fe.I = new int[32768];
         Class_oa.a(var0 + 96, null);
         Class_pa.s = new int[32768];
         Class_pe.A = new int[32768];
         Class_ua.q = new Class_ni(128, 254);
      } catch (RuntimeException var14) {
         throw Class_sh.a(var14, "gk.C(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   public Class_gk() {
   }

   public static void a(int var0) {
      try {
         if (var0 != -2) {
            i = -115;
         }

         d = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "gk.D(" + var0 + ')');
      }
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, byte var5, int var6, int var7) {
      int var10 = client.lb;

      try {
         e++;
         if (var5 > 115) {
            if (~var4 <= -1 && ~var0 <= -1 && ~var4 > -104 && ~var0 > -104) {
               if (var7 == 0) {
                  Class_kk var8 = Class_ea.d(var2, var4, var0);
                  label70:
                  if (var8 != null) {
                     int var9 = 2147483647 & (int)(var8.j >>> -44778016);
                     if (~var1 != -3) {
                        var8.f = new Class_vc(var9, var1, var3, var2, var4, var0, var6, false, var8.f);
                        if (var10 == 0) {
                           break label70;
                        }
                     }

                     var8.f = new Class_vc(var9, 2, var3 + 4, var2, var4, var0, var6, false, var8.f);
                     var8.i = new Class_vc(var9, 2, 3 & 1 + var3, var2, var4, var0, var6, false, var8.i);
                  }
               }

               if (~var7 == -2) {
                  Class_mk var12 = Class_df.a(var2, var4, var0);
                  label61:
                  if (var12 != null) {
                     int var15 = (int)(var12.t >>> -1175873888) & 2147483647;
                     if (var1 != 4 && ~var1 != -6) {
                        if (var1 == 6) {
                           var12.n = new Class_vc(var15, 4, var3 - -4, var2, var4, var0, var6, false, var12.n);
                           if (var10 == 0) {
                              break label61;
                           }
                        }

                        if (var1 == 7) {
                           var12.n = new Class_vc(var15, 4, (2 + var3 & 3) + 4, var2, var4, var0, var6, false, var12.n);
                           if (var10 == 0) {
                              break label61;
                           }
                        }

                        if (~var1 != -9) {
                           break label61;
                        }

                        var12.n = new Class_vc(var15, 4, 4 + var3, var2, var4, var0, var6, false, var12.n);
                        var12.p = new Class_vc(var15, 4, (2 + var3 & 3) - -4, var2, var4, var0, var6, false, var12.p);
                        if (var10 == 0) {
                           break label61;
                        }
                     }

                     var12.n = new Class_vc(var15, 4, var3, var2, var4, var0, var6, false, var12.n);
                  }
               }

               if (var7 == 2) {
                  if (var1 == 11) {
                     var1 = 10;
                  }

                  Class_lj var13 = Class_rf.a(var2, var4, var0);
                  if (var13 != null) {
                     var13.j = new Class_vc((int)(var13.k >>> 892662880) & 2147483647, var1, var3, var2, var4, var0, var6, false, var13.j);
                  }
               }

               if (~var7 == -4) {
                  Class_hd var14 = Class_rg.e(var2, var4, var0);
                  if (var14 != null) {
                     var14.a = new Class_vc(2147483647 & (int)(var14.m >>> -1374568992), 22, var3, var2, var4, var0, var6, false, var14.a);
                     return;
                  }
               }
            }
         }
      } catch (RuntimeException var11) {
         throw Class_sh.a(var11, "gk.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
      }
   }
}
