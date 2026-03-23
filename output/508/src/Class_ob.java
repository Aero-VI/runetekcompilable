final class Class_ob extends Class_lf {
   static int Q;
   static int R;
   static int S;
   static Class_r T = Class_tc.a(43, "gr-Un:");
   private int U = 1;
   static Class_jb[] V;
   private int W = 0;
   static int X;
   static int Y;
   static Class_pc[] Z;
   static Class_r ab = Class_tc.a(43, "Stufe)2");
   static int bb;
   private int cb = 0;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int[] a(byte var1, int var2) {
      int var11 = client.lb;

      try {
         Y++;
         if (var1 != -61) {
            this.a(null, -71, -32);
         }

         int[] var3 = super.H.a(false, var2);
         if (super.H.s) {
            int var4 = Class_l.y[var2];
            int var5 = -2048 + var4 >> 1787938369;
            int var6 = 0;
            if (var11 != 0 || var6 < Class_ld.X) {
               do {
                  int var7;
                  label37: {
                     int var8 = Class_ce.gb[var6];
                     int var9 = -2048 + var8 >> 214580225;
                     if (this.cb == 0) {
                        var7 = this.U * (var8 - var4);
                        if (var11 == 0) {
                           break label37;
                        }
                     }

                     int var10 = var9 * var9 - -(var5 * var5) >> 707503596;
                     var7 = (int)(4096.0 * Math.sqrt(var10 / 4096.0F));
                     var7 = (int)(3.141592653589793 * (this.U * var7));
                  }

                  label42: {
                     var7 -= var7 & -4096;
                     if (~this.W == -1) {
                        var7 = 4096 + Class_ud.e[0xFF & var7 >> 35459076] >> -35407135;
                        if (var11 == 0) {
                           break label42;
                        }
                     }

                     if (~this.W == -3) {
                        var7 -= 2048;
                        if (~var7 > -1) {
                           var7 = -var7;
                        }

                        var7 = -var7 + 2048 << 1384424897;
                     }
                  }

                  var3[var6] = var7;
               } while (++var6 < Class_ld.X);
            }
         }

         return var3;
      } catch (RuntimeException var12) {
         throw Class_sh.a(var12, "ob.G(" + var1 + ',' + var2 + ')');
      }
   }

   static final Class_ek b(int var0, int var1) {
      try {
         if (var0 >= -3) {
            return null;
         } else {
            bb++;
            Class_ek var2 = (Class_ek)Class_rg.W.a(14366, (long)var1);
            if (var2 != null) {
               return var2;
            } else {
               byte[] var3 = Class_wf.m.a(var1, 0, 16);
               var2 = new Class_ek();
               if (var3 != null) {
                  var2.a(0, new Class_lh(var3));
               }

               Class_rg.W.a(var2, 126, var1);
               return var2;
            }
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "ob.C(" + var0 + ',' + var1 + ')');
      }
   }

   public Class_ob() {
      super(0, true);
   }

   final void a(byte var1) {
      try {
         S++;
         Class_kg.a((byte)43);
         if (var1 > -22) {
            this.a((byte)-3);
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ob.I(" + var1 + ')');
      }
   }

   static final void a(byte var0, Class_r var1) {
      try {
         if (var0 == 37) {
            Q++;
            Class_u.d((byte)108);
            Class_nd.a(0, var1);
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ob.D(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   public static void g(int var0) {
      try {
         Z = null;
         int var1 = -71 % ((var0 - -16) / 48);
         V = null;
         ab = null;
         T = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ob.B(" + var0 + ')');
      }
   }

   final void a(Class_lh var1, int var2, int var3) {
      int var5 = client.lb;

      try {
         label41: {
            label40: {
               label39: {
                  if (~var2 != -1) {
                     if (~var2 == -2) {
                        break label39;
                     }

                     if (~var2 != -4) {
                        break label41;
                     }

                     if (var5 == 0) {
                        break label40;
                     }
                  }

                  this.cb = var1.n(-6677);
                  if (var5 == 0) {
                     break label41;
                  }
               }

               this.W = var1.n(var3 ^ 6676);
               if (var5 == 0) {
                  break label41;
               }
            }

            this.U = var1.n(-6677);
         }

         if (var3 != -1) {
            this.U = -82;
         }

         R++;
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "ob.K(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }
}
