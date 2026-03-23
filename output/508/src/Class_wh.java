final class Class_wh {
   static int a;
   static int b;
   static int c;
   static int d;
   static int e;
   static int f;
   static int g;
   static int h;
   static int i;
   static Class_r j = Class_tc.a(43, "<col=40ff00>");
   static int k;
   static int l;
   private Class_pe m = new Class_pe();
   static Class_r n = Class_tc.a(43, "Zugewiesener Speicher)3");
   static int o;
   static int p = 0;
   static boolean[] q = new boolean[112];
   private Class_pe r;

   static final void a(int var0) {
      try {
         if (~Class_og.fb > var0) {
            Class_og.fb = 0;
            Class_ad.m = -1;
            Class_qd.C = -1;
         }

         g++;
         if (~Class_og.fb < ~Class_fi.z) {
            Class_qd.C = -1;
            Class_ad.m = -1;
            Class_og.fb = Class_fi.z;
         }

         if (Class_oc.e < 0) {
            Class_ad.m = -1;
            Class_oc.e = 0;
            Class_qd.C = -1;
         }

         if (Class_oc.e > Class_sb.j) {
            Class_oc.e = Class_sb.j;
            Class_qd.C = -1;
            Class_ad.m = -1;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "wh.G(" + var0 + ')');
      }
   }

   final void a(byte var1) {
      try {
         while (true) {
            Class_pe var2 = this.m.C;
            if (this.m == var2) {
               l++;
               if (var1 > -30) {
                  return;
               }

               this.r = null;
               return;
            }

            var2.b((byte)73);
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "wh.B(" + var1 + ')');
      }
   }

   final Class_pe b(int var1) {
      try {
         Class_pe var2 = this.m.C;
         k++;
         if (var2 == this.m) {
            this.r = null;
            return null;
         } else {
            this.r = var2.C;
            if (var1 != 1742) {
               this.a((byte)-63);
            }

            return var2;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "wh.E(" + var1 + ')');
      }
   }

   public static void c(int var0) {
      try {
         j = null;
         n = null;
         if (var0 <= -23) {
            q = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "wh.D(" + var0 + ')');
      }
   }

   final void a(Class_pe var1, byte var2) {
      try {
         if (var1.x != null) {
            var1.b((byte)73);
         }

         e++;
         var1.C = this.m.C;
         if (var2 != 121) {
            this.d(107);
         }

         var1.x = this.m;
         var1.x.C = var1;
         var1.C.x = var1;
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "wh.H(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
      }
   }

   final void a(int var1, Class_pe var2) {
      try {
         d++;
         if (var2.x != null) {
            var2.b((byte)73);
         }

         var2.x = this.m.x;
         var2.C = this.m;
         var2.x.C = var2;
         var2.C.x = var2;
         if (var1 < 27) {
            j = null;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "wh.A(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
      }
   }

   static final void a(int var0, Class_ta var1) {
      int var6 = client.lb;

      try {
         h++;
         if (~var1.Bb != -1) {
            if (~var1.x != 0 && var1.x < 32768) {
               Class_eh var2 = Class_rf.a[var1.x];
               if (var2 != null) {
                  int var3 = -var2.hb + var1.hb;
                  int var4 = -var2.J + var1.J;
                  if (var3 != 0 || ~var4 != -1) {
                     var1.F = 2047 & (int)(Math.atan2(var3, var4) * 325.949);
                  }
               }
            }

            if (~var1.x <= -32769) {
               int var8 = -32768 + var1.x;
               if (var8 == Class_kg.A) {
                  var8 = 2047;
               }

               Class_fa var11 = Class_db.Q[var8];
               if (var11 != null) {
                  int var5 = var1.J - var11.J;
                  int var15 = -var11.hb + var1.hb;
                  if (var15 != 0 || var5 != 0) {
                     var1.F = (int)(Math.atan2(var15, var5) * 325.949) & 2047;
                  }
               }
            }

            if ((var1.y != 0 || ~var1.sb != -1) && (~var1.zb == -1 || var1.s > 0)) {
               int var9 = -((-Class_fj.e + -Class_fj.e + var1.y) * 64) + -64 - (-(64 * var1.Q) - var1.hb);
               int var12 = (-1 + var1.Q) * 64 + var1.J - 64 * (-Class_va.ab + -Class_va.ab + var1.sb);
               if (var9 != 0 || ~var12 != -1) {
                  var1.F = (int)(Math.atan2(var9, var12) * 325.949) & 2047;
               }

               var1.y = 0;
               var1.sb = 0;
            }

            int var10 = 2047 & -var1.U + var1.F;
            if (var0 != 20106) {
               q = null;
            }

            if (~var10 == -1) {
               var1.ib = 0;
            } else {
               label147: {
                  var1.ib++;
                  if (~var10 < -1025) {
                     var1.U = var1.U - var1.Bb;
                     boolean var13 = true;
                     if (~var1.Bb < ~var10 || 2048 - var1.Bb < var10) {
                        var1.U = var1.F;
                        var13 = false;
                     }

                     if (~var1.w != ~var1.C || ~var1.ib >= -26 && !var13) {
                        break label147;
                     }

                     if (~var1.lb != 0) {
                        var1.w = var1.lb;
                        if (var6 == 0) {
                           break label147;
                        }
                     }

                     var1.w = var1.P;
                     if (var6 == 0) {
                        break label147;
                     }
                  }

                  boolean var14 = true;
                  var1.U = var1.U + var1.Bb;
                  if (var10 < var1.Bb || ~(-var1.Bb + 2048) > ~var10) {
                     var1.U = var1.F;
                     var14 = false;
                  }

                  label74:
                  if (var1.w == var1.C && (var1.ib > 25 || var14)) {
                     if (~var1.kb == 0) {
                        var1.w = var1.P;
                        if (var6 == 0) {
                           break label74;
                        }
                     }

                     var1.w = var1.kb;
                  }
               }

               var1.U &= 2047;
            }
         }
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "wh.J(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   static final Class_jb a(Class_cj var0, int var1, int var2) {
      try {
         a++;
         if (!Class_jd.a(var0, -1, var2)) {
            return null;
         } else {
            return var1 != 23463 ? null : Class_oe.c((byte)-126);
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "wh.F(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ')');
      }
   }

   final Class_pe d(int var1) {
      try {
         Class_pe var2 = this.m.C;
         o++;
         if (this.m == var2) {
            return null;
         } else {
            var2.b((byte)73);
            return var1 != 2265 ? null : var2;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "wh.K(" + var1 + ')');
      }
   }

   final Class_pe e(int var1) {
      try {
         f++;
         Class_pe var2 = this.r;
         int var3 = 75 % ((var1 - 64) / 59);
         if (this.m == var2) {
            this.r = null;
            return null;
         } else {
            this.r = var2.C;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "wh.C(" + var1 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, int var1, byte var2, int var3, int var4) {
      int var10 = client.lb;

      try {
         b++;
         Class_qd var5 = (Class_qd)Class_f.X.a(var3, 97);
         if (var5 == null) {
            var5 = new Class_qd();
            Class_f.X.a((byte)121, var5, var3);
         }

         if (var0 >= var5.B.length) {
            int[] var6 = new int[1 + var0];
            int[] var7 = new int[var0 - -1];
            int var8 = 0;
            if (var10 != 0 || var5.B.length > var8) {
               do {
                  var6[var8] = var5.B[var8];
                  var7[var8] = var5.y[var8];
               } while (var5.B.length > ++var8);
            }

            int var9 = var5.B.length;
            if (var10 != 0 || ~var9 > ~var0) {
               do {
                  var6[var9] = -1;
                  var7[var9] = 0;
               } while (~(++var9) > ~var0);
            }

            var5.y = var7;
            var5.B = var6;
         }

         if (var2 >= -11) {
            a(0, 82, (byte)-2, -76, 28);
         }

         var5.B[var0] = var4;
         var5.y[var0] = var1;
      } catch (RuntimeException var11) {
         throw Class_sh.a(var11, "wh.I(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
      }
   }

   public Class_wh() {
      try {
         this.m.x = this.m;
         this.m.C = this.m;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "wh.<init>(" + ')');
      }
   }
}
