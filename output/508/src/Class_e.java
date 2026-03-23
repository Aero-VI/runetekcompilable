import java.awt.Component;

final class Class_e {
   static int a;
   static int b;
   static int c;
   static int d;
   static Class_cj e;
   static Class_sg f;
   static int g;
   static Class_cj h;
   static int i;
   static int j;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, int var1, Class_pd[] var2, int var3) {
      int var12 = client.lb;

      try {
         if (var1 != -228) {
            e = null;
         }

         j++;
         if (var3 < var0) {
            int var4 = var3 + -1;
            int var5 = var0 - -1;
            int var6 = (var3 - -var0) / 2;
            Class_pd var7 = var2[var6];
            var2[var6] = var2[var3];
            var2[var3] = var7;
            boolean var8;
            if (var12 != 0) {
               var8 = true;
            } else {
               if (~var5 >= ~var4) {
                  a(var5, -228, var2, var3);
                  a(var0, -228, var2, 1 + var5);
                  return;
               }

               var8 = true;
            }

            while (true) {
               var5--;
               int var9 = 0;
               if (var12 != 0 || var9 < 4) {
                  do {
                     int var10;
                     int var11;
                     label163:
                     if (~Class_ka.ob[var9] != -3) {
                        if (~Class_ka.ob[var9] != -2) {
                           int var10000;
                           if (Class_ka.ob[var9] != 3) {
                              var10 = var2[var5].e;
                              var11 = var7.e;
                              if (var12 == 0) {
                                 break label163;
                              }

                              var11 = var7.b ? 1 : 0;
                              var10000 = !var2[var5].b ? 0 : 1;
                           } else {
                              var11 = var7.b ? 1 : 0;
                              var10000 = !var2[var5].b ? 0 : 1;
                           }

                           var10 = var10000;
                           if (var12 == 0) {
                              break label163;
                           }
                        }

                        var10 = var2[var5].f;
                        if (var10 == -1 && Class_hh.j[var9] == 1) {
                           var10 = 2001;
                        }

                        var11 = var7.f;
                        if (var11 == -1 && ~Class_hh.j[var9] == -2) {
                           var11 = 2001;
                           if (var12 != 0) {
                              var10 = var2[var5].d;
                              var11 = var7.d;
                           }
                        }
                     } else {
                        var10 = var2[var5].d;
                        var11 = var7.d;
                     }

                     if (var10 == var11) {
                        if (~var9 != -4) {
                           var9++;
                           continue;
                        }

                        var8 = false;
                        if (var12 == 0) {
                           var9++;
                           continue;
                        }
                     }

                     if (~Class_hh.j[var9] == -2 && var11 < var10 && var12 == 0 || ~Class_hh.j[var9] == -1 && var11 > var10) {
                        break;
                     }

                     var8 = false;
                     if (var12 == 0) {
                        break;
                     }

                     var9++;
                  } while (var9 < 4);
               }

               if (!var8) {
                  var8 = true;

                  do {
                     var4++;
                     var9 = 0;
                     if (var12 != 0 || ~var9 > -5) {
                        do {
                           int var17;
                           int var18;
                           label233: {
                              if (Class_ka.ob[var9] == 2) {
                                 var17 = var2[var4].d;
                                 var18 = var7.d;
                                 if (var12 == 0) {
                                    break label233;
                                 }
                              }

                              if (Class_ka.ob[var9] == 1) {
                                 var17 = var2[var4].f;
                                 var18 = var7.f;
                                 if (~var18 == 0 && Class_hh.j[var9] == 1) {
                                    var18 = 2001;
                                 }

                                 if (var17 != -1 || Class_hh.j[var9] != 1) {
                                    break label233;
                                 }

                                 var17 = 2001;
                                 if (var12 == 0) {
                                    break label233;
                                 }
                              }

                              if (~Class_ka.ob[var9] == -4) {
                                 var17 = !var2[var4].b ? 0 : 1;
                                 var18 = !var7.b ? 0 : 1;
                                 if (var12 != 0) {
                                    var18 = var7.e;
                                    var17 = var2[var4].e;
                                 }
                              } else {
                                 var18 = var7.e;
                                 var17 = var2[var4].e;
                              }
                           }

                           if (var18 != var17) {
                              if (~Class_hh.j[var9] == -2 && var18 > var17 && var12 == 0 || ~Class_hh.j[var9] == -1 && var17 > var18 && var12 == 0) {
                                 break;
                              }

                              var8 = false;
                              if (var12 == 0) {
                                 break;
                              }

                              if (~var9 == -4) {
                                 var8 = false;
                              }

                              var9++;
                           } else {
                              if (~var9 == -4) {
                                 var8 = false;
                              }

                              var9++;
                           }
                        } while (~var9 > -5);
                     }
                  } while (var8);

                  if (~var5 < ~var4) {
                     Class_pd var16 = var2[var4];
                     var2[var4] = var2[var5];
                     var2[var5] = var16;
                  }

                  if (~var5 >= ~var4) {
                     a(var5, -228, var2, var3);
                     a(var0, -228, var2, 1 + var5);
                     return;
                  }

                  var8 = true;
               }
            }
         }
      } catch (RuntimeException var13) {
         throw Class_sh.a(var13, "e.H(" + var0 + ',' + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
      }
   }

   static final void a(int var0, boolean var1) {
      try {
         if (!var1) {
            h = null;
         }

         b++;
         Class_pd.c.b(-18767, var0);
         Class_aj.h.b(-18767, var0);
         Class_pj.b.b(-18767, var0);
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "e.D(" + var0 + ',' + var1 + ')');
      }
   }

   static final void a(byte var0, int var1) {
      try {
         a++;
         if (var0 != -117) {
            a(-42, 32, -2, -81, 42, 107, -83);
         }

         Class_ic var2 = Class_ka.a(var1, 1, (byte)-128);
         var2.c((byte)-50);
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "e.F(" + var0 + ',' + var1 + ')');
      }
   }

   static final void a(byte var0, Class_cj var1) {
      try {
         int var2 = 95 / ((-64 - var0) / 32);
         Class_ca.a = var1.a(Class_ra.J, (byte)-98);
         Class_ih.V = var1.a(Class_hd.e, (byte)-82);
         c++;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "e.I(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   static final Class_me a(Component var0, int var1, int var2, int var3) {
      try {
         d++;

         try {
            Class var8 = Class.forName("ue");
            Class_me var5 = (Class_me)var8.newInstance();
            if (var3 >= -12) {
               a(-53, false);
            }

            var5.a(var0, var1, -121, var2);
            return var5;
         } catch (Throwable var6) {
            Class_ak var4 = new Class_ak();
            var4.a(var0, var1, -127, var2);
            return var4;
         }
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "e.B(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      Class_ba var7 = new Class_ba();
      var7.i = var1 / 128;
      var7.l = var2 / 128;
      var7.h = var3 / 128;
      var7.s = var4 / 128;
      var7.e = var0;
      var7.v = var1;
      var7.y = var2;
      var7.k = var3;
      var7.j = var4;
      var7.o = var5;
      var7.m = var6;
      Class_vb.c[Class_ij.b++] = var7;
   }

   static final boolean a(int var0) {
      try {
         if (var0 != 24781) {
            f = null;
         }

         i++;
         return Class_d.m;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "e.A(" + var0 + ')');
      }
   }

   static final void a(int var0, int var1, int var2) {
      int var5 = client.lb;

      try {
         g++;
         if (Class_ma.ib >= 2 || ~Class_vh.cb != -1 || Class_sg.tb) {
            if (var0 <= 22) {
               e = null;
            }

            Class_r var3;
            label51: {
               if (Class_vh.cb == 1 && Class_ma.ib < 2) {
                  var3 = Class_o.a(2, new Class_r[]{Class_mk.c, Class_hh.k, Class_h.b, Class_id.j});
                  if (var5 == 0) {
                     break label51;
                  }
               }

               if (!Class_sg.tb || ~Class_ma.ib <= -3) {
                  var3 = Class_jf.a((byte)-99, Class_ma.ib + -1);
                  if (var5 == 0) {
                     break label51;
                  }
               }

               var3 = Class_o.a(2, new Class_r[]{Class_aj.b, Class_hh.k, Class_ab.U, Class_id.j});
            }

            if (~Class_ma.ib < -3) {
               var3 = Class_o.a(2, new Class_r[]{var3, Class_sj.a, Class_og.b(Class_ma.ib + -2, 0), Class_aj.u});
            }

            int var4 = Class_db.sb.a(var3, var2 - -4, 15 + var1, 16777215, 0, Class_ok.U, Class_db.qb);
            Class_wg.a(var2 - -4, var1, Class_db.sb.c(var3) - -var4, 15, (byte)-112);
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "e.C(" + var0 + ',' + var1 + ',' + var2 + ')');
      }
   }

   public static void b(int var0) {
      try {
         h = null;
         e = null;
         if (var0 != -1) {
            f = null;
         }

         f = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "e.E(" + var0 + ')');
      }
   }
}
