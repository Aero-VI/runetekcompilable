abstract class Class_a {
   static int a;
   static int b;
   static int c;
   static int d;
   static int e;
   static Class_jb f;
   static int g;
   static Class_ha h = null;
   static int i;
   static int j;
   static Class_r k = Class_tc.a(43, "Bitte entfernen Sie ");
   static int l;
   static Class_ff m;
   static int n;
   static int o;

   static final Class_r a(byte var0, int var1) {
      try {
         if (var0 > -36) {
            j = -44;
         }

         b++;
         if (var1 < 100000) {
            return Class_o.a(2, new Class_r[]{Class_oc.j, Class_og.b(var1, 0), Class_pj.e});
         } else {
            return var1 < 10000000
               ? Class_o.a(2, new Class_r[]{Class_sg.jb, Class_og.b(var1 / 1000, 0), Class_i.db, Class_pj.e})
               : Class_o.a(2, new Class_r[]{Class_s.U, Class_og.b(var1 / 1000000, 0), Class_cb.k, Class_pj.e});
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "a.M(" + var0 + ',' + var1 + ')');
      }
   }

   abstract void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9);

   public Class_a() {
   }

   void a(Class_a var1, int var2, int var3, int var4, boolean var5) {
      try {
         e++;
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "a.S(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
      }
   }

   static final byte[] a(boolean var0, byte var1, Object var2) {
      try {
         c++;
         if (var2 == null) {
            return null;
         } else if (var2 instanceof byte[]) {
            byte[] var5 = (byte[])var2;
            return var0 ? Class_p.a(var5, false) : var5;
         } else {
            if (var1 != -4) {
               a((byte)-77, -30, -86, 85);
            }

            if (var2 instanceof Class_bj) {
               Class_bj var3 = (Class_bj)var2;
               return var3.b(-82);
            } else {
               throw new IllegalArgumentException();
            }
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "a.L(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
      }
   }

   static final int a(byte var0, int var1, int var2, int var3) {
      try {
         d++;
         var1 &= 3;
         if (~var1 == -1) {
            return var2;
         } else {
            int var4 = -17 / ((-35 - var0) / 45);
            if (var1 == 1) {
               return -var3 + 7;
            } else {
               return var1 == 2 ? 7 + -var2 : var3;
            }
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "a.T(" + var0 + 44 + var1 + 44 + var2 + 44 + var3 + 41);
      }
   }

   static final void a(int var0) {
      try {
         g++;
         Class_pi.W.a(-20);
         Class_rd.M.a(111);
         if (var0 != -7816) {
            m = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "a.P(" + var0 + ')');
      }
   }

   abstract int a();

   Class_a a(int var1, int var2, int var3) {
      try {
         i++;
         return this;
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "a.N(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   boolean b() {
      try {
         n++;
         return false;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "a.R(" + ')');
      }
   }

   static final Class_dh[] a(int var0, Class_cj var1, boolean var2) {
      try {
         l++;
         if (var2) {
            f = null;
         }

         return !Class_jd.a(var1, -1, var0) ? null : Class_ng.b(31);
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "a.O(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
      }
   }

   void a(int var1, int var2, int var3, int var4, int var5) {
      try {
         if (var3 <= 96) {
            j = 32;
         }

         o++;
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "a.B(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
      }
   }

   public static void b(int var0) {
      try {
         f = null;
         h = null;
         m = null;
         k = null;
         if (var0 <= 35) {
            a(5, null, false);
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "a.K(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, byte[] var1, int var2, boolean var3, int var4, int var5, int var6, Class_ga[] var7) {
      int var13 = client.lb;

      try {
         byte var8;
         label116: {
            a++;
            if (var3) {
               var8 = 1;
               if (var13 == 0) {
                  break label116;
               }
            }

            var8 = 4;
         }

         if (var4 < -1) {
            if (!var3) {
               int var9 = 0;
               if (var13 != 0 || ~var9 > -5) {
                  do {
                     int var10 = 0;
                     if (var13 != 0 || var10 < 64) {
                        do {
                           int var11 = 0;
                           if (var13 != 0 || ~var11 > -65) {
                              do {
                                 if (~(var2 - -var10) < -1 && var2 + var10 < 103 && ~(var11 + var0) < -1 && var0 - -var11 < 103) {
                                    var7[var9].z[var10 + var2][var11 + var0] = Class_ui.a(var7[var9].z[var10 + var2][var11 + var0], -16777217);
                                 }
                              } while (~(++var11) > -65);
                           }
                        } while (++var10 < 64);
                     }
                  } while (~(++var9) > -5);
               }
            }

            Class_lh var15 = new Class_lh(var1);
            int var16 = 0;
            if (var13 != 0 || ~var8 < ~var16) {
               do {
                  int var17 = 0;
                  if (var13 != 0 || var17 < 64) {
                     do {
                        int var12 = 0;
                        if (var13 != 0 || ~var12 > -65) {
                           do {
                              Class_pj.a(var3, var2 + var17, var6, var5, var15, var16, 0, (byte)91, var12 + var0);
                           } while (~(++var12) > -65);
                        }
                     } while (++var17 < 64);
                  }
               } while (~var8 < ~(++var16));
            }
         }
      } catch (RuntimeException var14) {
         throw Class_sh.a(
            var14,
            "a.Q("
               + var0
               + ','
               + (var1 != null ? "{...}" : "null")
               + ','
               + var2
               + ','
               + var3
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
}
