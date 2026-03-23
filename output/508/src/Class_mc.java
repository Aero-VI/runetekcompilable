import java.io.DataInputStream;
import java.net.URL;

class Class_mc {
   static Class_r a = Class_tc.a(43, "Fps:");
   static Class_r b = Class_mc.c;
   private static Class_r c = Class_tc.a(43, "Free world");
   static int d;
   static int e;
   static int f = 0;
   static int[] g = new int[100];
   static int h;
   static Class_r i = Class_tc.a(43, "_labels");
   static int j;
   static int k = -1;
   static int l;
   static short[] m = new short[]{960, 957, -21568, -21571, 22464};

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, int var1, int var2) {
      int var14 = client.lb;

      try {
         if (~Class_nd.hb < -1) {
            Class_dc.a(Class_nd.hb, (byte)60);
            Class_nd.hb = 0;
         }

         int var4 = 0;
         e++;
         short var3 = 256;
         int var5 = var0 * Class_nc.e;
         int var6 = 0;
         if (var2 == 95) {
            int var7 = 1;
            if (var14 == 0 && var7 >= var3 - 1) {
               Class_ua.q.d(var1, var0);
            } else {
               while (true) {
                  int var8 = (-var7 + var3) * Class_uf.S[var7] / var3;
                  if (~var8 > -1) {
                     var8 = 0;
                  }

                  var4 += var8;
                  int var9 = var8;
                  if (var14 == 0 && var8 >= 128) {
                     int var19 = 0;
                     if (var14 != 0) {
                        Class_ua.q.I[var6++] = Class_nc.f[var5++ + var1];
                        var19++;
                     }

                     while (var8 > var19) {
                        Class_ua.q.I[var6++] = Class_nc.f[var5++ + var1];
                        var19++;
                     }

                     var5 += Class_nc.e - 128;
                     if (++var7 >= var3 - 1) {
                        Class_ua.q.d(var1, var0);
                        return;
                     }
                  } else {
                     do {
                        int var10 = Class_pe.A[var4++];
                        int var11 = Class_nc.f[var1 + var5++];
                        if (~var10 == -1) {
                           Class_ua.q.I[var6++] = var11;
                           if (var14 != 0) {
                              int var12 = 18 + var10;
                              if (~var12 < -256) {
                                 var12 = 255;
                              }

                              int var13 = 256 - (18 + var10);
                              if (~var13 < -256) {
                                 var13 = 255;
                              }

                              var10 = Class_v.x[var10];
                              Class_ua.q.I[var6++] = Class_ui.a(Class_ui.a(65280, var10) * var12 + var13 * Class_ui.a(var11, 65280), 16711680)
                                    + Class_ui.a(-16711936, var12 * Class_ui.a(var10, 16711935) + var13 * Class_ui.a(var11, 16711935))
                                 >> -1223440824;
                              var9++;
                           } else {
                              var9++;
                           }
                        } else {
                           int var20 = 18 + var10;
                           if (~var20 < -256) {
                              var20 = 255;
                           }

                           int var21 = 256 - (18 + var10);
                           if (~var21 < -256) {
                              var21 = 255;
                           }

                           var10 = Class_v.x[var10];
                           Class_ua.q.I[var6++] = Class_ui.a(Class_ui.a(65280, var10) * var20 + var21 * Class_ui.a(var11, 65280), 16711680)
                                 + Class_ui.a(-16711936, var20 * Class_ui.a(var10, 16711935) + var21 * Class_ui.a(var11, 16711935))
                              >> -1223440824;
                           var9++;
                        }
                     } while (var9 < 128);

                     int var18 = 0;
                     if (var14 != 0) {
                        Class_ua.q.I[var6++] = Class_nc.f[var5++ + var1];
                        var18++;
                     }

                     while (var8 > var18) {
                        Class_ua.q.I[var6++] = Class_nc.f[var5++ + var1];
                        var18++;
                     }

                     var5 += Class_nc.e - 128;
                     if (++var7 >= var3 - 1) {
                        Class_ua.q.d(var1, var0);
                        return;
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var15) {
         throw Class_sh.a(var15, "mc.D(" + var0 + ',' + var1 + ',' + var2 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(String var0, Throwable var1, int var2) {
      int var6 = client.lb;

      try {
         d++;

         try {
            String var3 = "";
            if (var1 != null) {
               var3 = Class_wf.a(var1, -113);
            }

            if (var0 != null) {
               if (var1 != null) {
                  var3 = var3 + " | ";
               }

               var3 = var3 + var0;
            }

            System.out.println("Error: " + var3);
            var3 = var3.replace(':', '.');
            var3 = var3.replace('@', '_');
            var3 = var3.replace((char)var2, '_');
            var3 = var3.replace('#', '_');
            if (Class_oc.g.g != null) {
               Class_ei var4 = Class_oc.g
                  .a(
                     new URL(
                        Class_oc.g.g.getCodeBase(),
                        "clienterror.ws?c=" + Class_pc.e + "&u=" + Class_ak.X + "&v1=" + Class_ik.a + "&v2=" + Class_ik.w + "&e=" + var3
                     ),
                     var2 + -38
                  );
               if (var6 != 0) {
                  Class_hg.a(var2 ^ -35, 1L);
               }

               while (~var4.b == -1) {
                  Class_hg.a(var2 ^ -35, 1L);
               }

               if (var4.b == 1) {
                  DataInputStream var5 = (DataInputStream)var4.e;
                  var5.read();
                  var5.close();
               }
            }
         } catch (Exception var7) {
         }
      } catch (RuntimeException var8) {
         throw var8;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, int var1) {
      int var6 = client.lb;

      try {
         h++;
         if (~var1 != 0) {
            if (Class_oj.b(var1, (byte)-2)) {
               if (var0 != -1) {
                  a(104, 115);
               }

               Class_ha[] var2 = Class_ve.ab[var1];
               int var3 = 0;
               if (var6 != 0 || var3 < var2.length) {
                  do {
                     Class_ha var4 = var2[var3];
                     if (var4.d != null) {
                        Class_wj var5 = new Class_wj();
                        var5.x = var4.d;
                        var5.z = var4;
                        Class_dd.a(var5, (byte)124, 2000000);
                     }
                  } while (++var3 < var2.length);
               }
            }
         }
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "mc.C(" + var0 + ',' + var1 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(byte var0) {
      int var5 = client.lb;

      try {
         int var1 = -1;
         if (var5 != 0 || ~client.ib < ~var1) {
            do {
               int var2;
               if (~var1 != 0) {
                  var2 = Class_oc.q[var1];
                  if (var5 != 0) {
                     var2 = 2047;
                  }
               } else {
                  var2 = 2047;
               }

               Class_fa var3 = Class_db.Q[var2];
               if (var3 != null && var3.pb > 0) {
                  var3.pb--;
                  if (var3.pb == 0) {
                     var3.wb = null;
                  }
               }
            } while (~client.ib < ~(++var1));
         }

         int var7 = 0;
         if (var5 == 0 && ~Class_ke.p >= ~var7) {
            int var10 = 49 % ((var0 - 54) / 63);
            l++;
         } else {
            do {
               int var8 = Class_kg.v[var7];
               Class_eh var4 = Class_rf.a[var8];
               if (var4 != null && ~var4.pb < -1) {
                  var4.pb--;
                  if (var4.pb == 0) {
                     var4.wb = null;
                  }
               }
            } while (~Class_ke.p < ~(++var7));

            int var9 = 49 % ((var0 - 54) / 63);
            l++;
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "mc.A(" + var0 + ')');
      }
   }

   public static void a(boolean var0) {
      try {
         g = null;
         a = null;
         m = null;
         if (var0) {
            c = null;
            b = null;
            i = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "mc.B(" + var0 + ')');
      }
   }
}
