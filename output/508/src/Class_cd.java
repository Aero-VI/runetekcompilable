import java.io.UnsupportedEncodingException;

final class Class_cd extends Class_pe {
   static Class_cj I;
   private Class_tg J;
   static Class_r L = Class_tc.a(43, "Untersuchen");
   static int M;
   static int N = 0;
   int O;
   static int P;
   int Q;
   static int R;
   static int S;
   private Class_tg T;
   static int U;
   static int V;
   private int W;
   static int X;
   static int Y;
   private Class_r Z = Class_hg.o;
   static int ab;
   static int bb = -1;
   static int cb;
   static int db;
   static int eb;

   final boolean a(byte var1, int var2) {
      try {
         X++;
         if (this.T == null) {
            return false;
         } else {
            if (this.J == null) {
               this.f(113);
            }

            if (var1 > -78) {
               a(null, 122, null);
            }

            Class_kg var3 = (Class_kg)this.J.a(var2, -74);
            return var3 != null;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "cd.G(" + var1 + ',' + var2 + ')');
      }
   }

   final Class_r b(byte var1, int var2) {
      try {
         int var3 = -13 / ((var1 - -51) / 55);
         P++;
         if (this.T == null) {
            return this.Z;
         } else {
            Class_ef var4 = (Class_ef)this.T.a(var2, -78);
            return var4 == null ? this.Z : var4.p;
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "cd.H(" + var1 + ',' + var2 + ')');
      }
   }

   final void a(int var1, Class_lh var2) {
      int var4 = client.lb;

      try {
         do {
            int var3 = var2.n(-6677);
            if (var3 == 0) {
               break;
            }

            this.a(var2, (byte)-119, var3);
         } while (var4 == 0);

         U++;
         if (var1 != 0) {
            this.Q = 28;
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "cd.A(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private final void d(int var1) {
      int var4 = client.lb;

      try {
         this.J = new Class_tg(this.T.b(-128));
         if (var1 == 6) {
            Class_ef var2 = (Class_ef)this.T.a(-32642);
            if (var4 == 0 && var2 == null) {
               eb++;
            } else {
               do {
                  Class_ug var3 = new Class_ug(var2.p, (int)var2.a);
                  this.J.a((byte)-9, var3, var2.p.b(85));
                  var2 = (Class_ef)this.T.a((byte)-120);
               } while (var2 != null);

               eb++;
            }
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "cd.I(" + var1 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final boolean a(int var1, Class_r var2) {
      int var4 = client.lb;

      try {
         V++;
         if (var1 < 62) {
            return true;
         } else if (this.T == null) {
            return false;
         } else {
            if (this.J == null) {
               this.d(6);
            }

            Class_ug var3 = (Class_ug)this.J.a(var2.b(-85), -71);
            if (var4 == 0 && var3 == null) {
               return false;
            } else {
               while (!var3.A.a(var2, (byte)117)) {
                  var3 = (Class_ug)this.J.c(127);
                  if (var3 == null) {
                     return false;
                  }
               }

               return true;
            }
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "cd.D(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
      }
   }

   static final int c(int var0, int var1) {
      try {
         M++;
         if (~var1 > -1) {
            return 0;
         } else {
            Class_qd var2 = (Class_qd)Class_f.X.a(var1, var0 + -121);
            if (var2 == null) {
               return Class_wb.a((byte)106, var1).I;
            } else {
               int var3 = 0;

               for (int var4 = 0; var4 < var2.B.length; var4++) {
                  if (var2.B[var4] == -1) {
                     var3++;
                  }
               }

               var3 += Class_wb.a((byte)126, var1).I - var2.B.length;
               return var0 != 2 ? -37 : var3;
            }
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "cd.C(" + var0 + 44 + var1 + 41);
      }
   }

   static final Class_sd e(int var0) {
      try {
         db++;
         if (var0 != 3253) {
            g(-92);
         }

         try {
            return (Class_sd)Class.forName("hi").newInstance();
         } catch (Throwable var2) {
            return null;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "cd.F(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private final void f(int var1) {
      int var4 = client.lb;

      try {
         this.J = new Class_tg(this.T.b(-128));
         if (var1 >= 50) {
            Class_kg var2 = (Class_kg)this.T.a(-32642);
            if (var4 == 0 && var2 == null) {
               cb++;
            } else {
               do {
                  Class_kg var3 = new Class_kg((int)var2.a);
                  this.J.a((byte)123, var3, var2.r);
                  var2 = (Class_kg)this.T.a((byte)-117);
               } while (var2 != null);

               cb++;
            }
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "cd.L(" + var1 + ')');
      }
   }

   final int d(int var1, int var2) {
      try {
         ab++;
         if (this.T == null) {
            return this.W;
         } else {
            Class_kg var3 = (Class_kg)this.T.a(var1, -84);
            if (var2 != -32511) {
               return -78;
            } else {
               return var3 == null ? this.W : var3.r;
            }
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "cd.E(" + var1 + 44 + var2 + 41);
      }
   }

   static final Class_r a(Class_r var0, int var1, Class_ha var2) {
      int var6 = client.lb;

      try {
         Y++;
         if (var0.a(-125, Class_fh.Y) != -1) {
            do {
               int var3 = var0.a(33, Class_p.h);
               if (~var3 == 0) {
                  break;
               }

               var0 = Class_o.a(2, new Class_r[]{var0.a(0, (byte)-74, var3), Class_ea.b(Class_ug.a(0, 20, var2), var1 ^ -27758), var0.b(2 + var3, true)});
            } while (var6 == 0);

            do {
               int var9 = var0.a(var1 ^ 27740, Class_ae.e);
               if (~var9 == 0) {
                  break;
               }

               var0 = Class_o.a(2, new Class_r[]{var0.a(0, (byte)-74, var9), Class_ea.b(Class_ug.a(1, 20, var2), -1), var0.b(var9 + 2, true)});
            } while (var6 == 0);

            do {
               int var10 = var0.a(var1 + -27678, Class_p.i);
               if (var10 == -1) {
                  break;
               }

               var0 = Class_o.a(2, new Class_r[]{var0.a(0, (byte)-74, var10), Class_ea.b(Class_ug.a(2, var1 + -27737, var2), -1), var0.b(2 + var10, true)});
            } while (var6 == 0);

            do {
               int var11 = var0.a(-126, Class_la.W);
               if (~var11 == 0) {
                  break;
               }

               var0 = Class_o.a(2, new Class_r[]{var0.a(0, (byte)-74, var11), Class_ea.b(Class_ug.a(3, 20, var2), -1), var0.b(2 + var11, true)});
            } while (var6 == 0);

            do {
               int var12 = var0.a(var1 + -27855, Class_aj.k);
               if (~var12 == 0) {
                  break;
               }

               var0 = Class_o.a(var1 + -27755, new Class_r[]{var0.a(0, (byte)-74, var12), Class_ea.b(Class_ug.a(4, 20, var2), -1), var0.b(2 + var12, true)});
            } while (var6 == 0);

            do {
               int var13 = var0.a(-73, Class_sg.qb);
               if (var13 == -1) {
                  break;
               }

               Class_r var4 = Class_hk.S;
               if (Class_kg.D != null) {
                  var4 = Class_vc.a(Class_kg.D.f, -17516);

                  try {
                     if (Class_kg.D.e != null) {
                        byte[] var5 = ((String)Class_kg.D.e).getBytes("ISO-8859-1");
                        var4 = Class_pi.a(var5.length, var5, 43, 0);
                     }
                  } catch (UnsupportedEncodingException var7) {
                  }
               }

               var0 = Class_o.a(var1 ^ 27759, new Class_r[]{var0.a(0, (byte)-74, var13), var4, var0.b(4 + var13, true)});
            } while (var6 == 0);
         }

         if (var1 != 27757) {
            L = null;
         }

         return var0;
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "cd.J(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
      }
   }

   public static void g(int var0) {
      try {
         I = null;
         if (var0 != 0) {
            c(18, 45);
         }

         L = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "cd.B(" + var0 + ')');
      }
   }

   public Class_cd() {
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private final void a(Class_lh var1, byte var2, int var3) {
      int var8 = client.lb;

      try {
         R++;
         if (var2 != -119) {
            this.Z = null;
         }

         if (~var3 == -2) {
            this.O = var1.n(var2 + -6558);
         } else if (~var3 == -3) {
            this.Q = var1.n(-6677);
         } else if (var3 == 3) {
            this.Z = var1.e(127);
         } else if (var3 == 4) {
            this.W = var1.h(-5528);
         } else {
            if (var3 == 5 || var3 == 6) {
               int var4 = var1.k(1355769544);
               this.T = new Class_tg(Class_pa.f(var4, -21189));
               int var5 = 0;
               if (var8 != 0 || ~var5 > ~var4) {
                  do {
                     int var6 = var1.h(-5528);
                     Object var7;
                     if (var3 == 5) {
                        var7 = new Class_ef(var1.e(127));
                        if (var8 != 0) {
                           var7 = new Class_kg(var1.h(-5528));
                        }
                     } else {
                        var7 = new Class_kg(var1.h(-5528));
                     }

                     this.T.a((byte)2, (Class_li)var7, var6);
                  } while (~(++var5) > ~var4);
               }
            }
         }
      } catch (RuntimeException var9) {
         throw Class_sh.a(var9, "cd.K(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }
}
