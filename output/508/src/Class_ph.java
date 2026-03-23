final class Class_ph {
   static int a;
   static Class_lh b = new Class_lh(new byte[5000]);
   static int c;
   static int d;
   static int[] e = new int[1000];
   static int f = 0;
   private int g;
   static int h;
   static int i;
   private int[][] j;
   static int k;
   private int l;
   static Class_r m = Class_tc.a(43, "0(U");
   static int n;

   public static void a(int var0) {
      try {
         m = null;
         b = null;
         if (var0 != -26412) {
            m = null;
         }

         e = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ph.D(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final byte[] a(byte var1, byte[] var2) {
      int var12 = client.lb;

      try {
         if (this.j != null) {
            int var3 = (int)((long)var2.length * this.g / this.l) + 14;
            int[] var4 = new int[var3];
            int var6 = 0;
            int var5 = 0;
            int var7 = 0;
            if (var12 != 0 || var2.length > var7) {
               do {
                  byte var8 = var2[var7];
                  int[] var9 = this.j[var6];
                  int var10 = 0;
                  if (var12 != 0 || ~var10 > -15) {
                     do {
                        var4[var10 + var5] = var4[var10 + var5] + var9[var10] * var8;
                     } while (~(++var10) > -15);
                  }

                  var6 += this.g;
                  int var11 = var6 / this.l;
                  var6 -= this.l * var11;
                  var5 += var11;
               } while (var2.length > ++var7);
            }

            var2 = new byte[var3];
            int var15 = 0;
            if (var12 != 0 || ~var3 < ~var15) {
               do {
                  int var16 = 32768 + var4[var15] >> -1654271568;
                  if (~var16 > 127) {
                     var2[var15] = -128;
                     if (var12 == 0) {
                        var15++;
                        continue;
                     }
                  }

                  if (var16 <= 127) {
                     var2[var15] = (byte)var16;
                     if (var12 != 0) {
                        var2[var15] = 127;
                        var15++;
                     } else {
                        var15++;
                     }
                  } else {
                     var2[var15] = 127;
                     var15++;
                  }
               } while (~var3 < ~var15);
            }
         }

         k++;
         if (var1 >= -118) {
            this.a(-122, (byte)-69);
         }

         return var2;
      } catch (RuntimeException var13) {
         throw Class_sh.a(var13, "ph.A(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
      }
   }

   final int a(int var1, int var2) {
      try {
         if (this.j != null) {
            var1 = (int)((long)this.g * var1 / this.l);
         }

         if (var2 > -75) {
            this.a(98, (byte)124);
         }

         d++;
         return var1;
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "ph.G(" + var1 + 44 + var2 + 41);
      }
   }

   static final Class_ha a(Class_ha var0, byte var1) {
      try {
         a++;
         Class_ha var2 = client.a(var0);
         if (var2 == null) {
            var2 = var0.Hc;
         }

         return var1 != 3 ? null : var2;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ph.F(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
      }
   }

   static final void a(Class_lj var0) {
      for (int var1 = var0.v; var1 <= var0.f; var1++) {
         for (int var2 = var0.u; var2 <= var0.b; var2++) {
            Class_aa var3 = Class_ck.d[var0.q][var1][var2];
            if (var3 != null) {
               for (int var4 = 0; var4 < var3.G; var4++) {
                  if (var3.H[var4] == var0) {
                     var3.G--;

                     for (int var5 = var4; var5 < var3.G; var5++) {
                        var3.H[var5] = var3.H[var5 + 1];
                        var3.B[var5] = var3.B[var5 + 1];
                     }

                     var3.H[var3.G] = null;
                     break;
                  }
               }

               var3.D = 0;

               for (int var6 = 0; var6 < var3.G; var6++) {
                  var3.D = var3.D | var3.B[var6];
               }
            }
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   Class_ph(int var1, int var2) {
      super();
      int var16 = client.lb;

      try {
         if (var2 != var1) {
            int var3 = Class_ub.a(var2, (byte)-124, var1);
            var2 /= var3;
            this.g = var2;
            var1 /= var3;
            this.j = new int[var1][14];
            this.l = var1;
            int var4 = 0;
            if (var16 != 0 || ~var1 < ~var4) {
               while (true) {
                  double var6 = (double)var4 / var1 + 6.0;
                  int[] var5 = this.j[var4];
                  int var8 = (int)Math.floor(-7.0 + var6 + 1.0);
                  if (~var8 > -1) {
                     var8 = 0;
                  }

                  double var10 = (double)var2 / var1;
                  int var9 = (int)Math.ceil(7.0 + var6);
                  if (var9 > 14) {
                     var9 = 14;
                     if (var16 == 0 && var9 <= var8) {
                        if (~var1 >= ~(++var4)) {
                           return;
                        }
                        continue;
                     }
                  } else if (var9 <= var8) {
                     if (~var1 >= ~(++var4)) {
                        return;
                     }
                     continue;
                  }

                  do {
                     double var14 = var10;
                     double var12 = (-var6 + var8) * 3.141592653589793;
                     if (!(var12 < -1.0E-4)) {
                        if (var12 > 1.0E-4) {
                           var14 = var10 * (Math.sin(var12) / var12);
                        }
                     } else {
                        var14 = var10 * (Math.sin(var12) / var12);
                     }

                     var14 *= 0.54 + 0.46 * Math.cos((var8 - var6) * 0.2243994752564138);
                     var5[var8] = (int)Math.floor(0.5 + 65536.0 * var14);
                  } while (var9 > ++var8);

                  if (~var1 >= ~(++var4)) {
                     return;
                  }
               }
            }
         }
      } catch (RuntimeException var17) {
         throw Class_sh.a(var17, "ph.<init>(" + var1 + ',' + var2 + ')');
      }
   }

   static final void a(int var0, int var1, int var2, int var3, Class_ta var4, int var5, int var6) {
      try {
         Class_lg.a(var1, var2, var5, var4.J, var6, var3, var4.hb, (byte)-127);
         i++;
         if (var0 < 16) {
            a(null, (byte)64);
         }
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "ph.E(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ',' + var5 + ',' + var6 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(byte var0) {
      int var3 = client.lb;

      try {
         Class_ja.w = 0;
         Class_uf.U = 0;
         h++;
         Class_fe.d(-19342);
         Class_i.d((byte)70);
         Class_m.h(-92);
         Class_c.c(0);
         int var1 = 0;
         if (var3 != 0) {
            int var2 = Class_ih.R[var1];
            if (Class_db.Q[var2].vb != Class_be.C) {
               if (Class_db.Q[var2].mc > 0) {
                  Class_tg.a(-1, Class_db.Q[var2]);
               }

               Class_db.Q[var2] = null;
            }

            var1++;
         }

         for (; ~Class_ja.w < ~var1; var1++) {
            int var5 = Class_ih.R[var1];
            if (Class_db.Q[var5].vb != Class_be.C) {
               if (Class_db.Q[var5].mc > 0) {
                  Class_tg.a(-1, Class_db.Q[var5]);
               }

               Class_db.Q[var5] = null;
            }
         }

         if (Class_f.T.p != Class_sf.g) {
            throw new RuntimeException("gpp1 pos:" + Class_f.T.p + " psize:" + Class_sf.g);
         } else {
            int var6 = 0;
            if (var0 >= -68) {
               a((byte)-52);
               if (var3 == 0 && ~client.ib >= ~var6) {
                  return;
               }
            } else if (~client.ib >= ~var6) {
               return;
            }

            while (Class_db.Q[Class_oc.q[var6]] != null) {
               if (~client.ib >= ~(++var6)) {
                  return;
               }
            }

            throw new RuntimeException("gpp2 pos:" + var6 + " size:" + client.ib);
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "ph.B(" + var0 + ')');
      }
   }

   final int a(int var1, byte var2) {
      try {
         if (var2 != 127) {
            return -26;
         } else {
            if (this.j != null) {
               var1 = (int)((long)this.g * var1 / this.l) + 6;
            }

            n++;
            return var1;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "ph.C(" + var1 + 44 + var2 + 41);
      }
   }
}
