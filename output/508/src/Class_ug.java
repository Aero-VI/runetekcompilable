final class Class_ug extends Class_li {
   static Class_r p = Class_ug.r;
   static int q = 0;
   private static Class_r r = Class_tc.a(43, "Loading textures )2 ");
   static int s;
   static int t;
   static int u;
   static int v;
   static Class_r w = Class_tc.a(43, "http:)4)4");
   static int x;
   static int y;
   static Class_r z = Class_tc.a(43, "settings");
   Class_r A;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final int a(int var0, int var1, Class_ha var2) {
      int var14 = client.lb;

      try {
         u++;
         if (var2.Wc != null && ~var2.Wc.length < ~var0) {
            try {
               if (var1 != 20) {
                  a(-10, -70, 84, -119, -48, -79, 2, (byte)-64);
               }

               int[] var3 = var2.Wc[var0];
               int var5 = 0;
               byte var6 = 0;
               int var4 = 0;

               while (true) {
                  int var7 = var3[var5++];
                  byte var9 = 0;
                  int var8 = 0;
                  if (var7 == 0) {
                     return var4;
                  }

                  if (~var7 == -2) {
                     var8 = Class_ed.i[var3[var5++]];
                  }

                  if (~var7 == -16) {
                     var9 = 1;
                  }

                  if (~var7 == -3) {
                     var8 = Class_of.j[var3[var5++]];
                  }

                  if (var7 == 16) {
                     var9 = 2;
                  }

                  if (~var7 == -18) {
                     var9 = 3;
                  }

                  if (~var7 == -4) {
                     var8 = Class_qe.M[var3[var5++]];
                  }

                  if (var7 == 4) {
                     int var10 = var3[var5++] << -1088096752;
                     var10 += var3[var5++];
                     Class_ha var11 = Class_tf.a(var10, (byte)-80);
                     int var12 = var3[var5++];
                     if (var12 != -1 && (!Class_ra.a(-25672, var12).S || Class_vc.L)) {
                        int var13 = 0;
                        if (var14 != 0 || var11.N.length > var13) {
                           do {
                              if (1 + var12 == var11.N[var13]) {
                                 var8 += var11.s[var13];
                              }
                           } while (var11.N.length > ++var13);
                        }
                     }
                  }

                  if (var7 == 5) {
                     var8 = Class_sb.i[var3[var5++]];
                  }

                  if (~var7 == -7) {
                     var8 = Class_jk.k[Class_of.j[var3[var5++]] + -1];
                  }

                  if (~var7 == -8) {
                     var8 = Class_sb.i[var3[var5++]] * 100 / 46875;
                  }

                  if (~var7 == -9) {
                     var8 = Class_gg.B.ac;
                  }

                  if (var7 == 9) {
                     int var23 = 0;
                     if (var14 != 0 || var23 < 25) {
                        do {
                           if (Class_df.d[var23]) {
                              var8 += Class_of.j[var23];
                           }
                        } while (++var23 < 25);
                     }
                  }

                  if (~var7 == -11) {
                     int var24 = var3[var5++] << -562088496;
                     var24 += var3[var5++];
                     Class_ha var28 = Class_tf.a(var24, (byte)-80);
                     int var30 = var3[var5++];
                     if (~var30 != 0 && (!Class_ra.a(-25672, var30).S || Class_vc.L)) {
                        int var31 = 0;
                        if (var14 != 0 || var31 < var28.N.length) {
                           do {
                              if (1 + var30 == var28.N[var31]) {
                                 var8 = 999999999;
                                 if (var14 == 0) {
                                    break;
                                 }
                              }
                           } while (++var31 < var28.N.length);
                        }
                     }
                  }

                  if (var7 == 11) {
                     var8 = Class_ic.N;
                  }

                  if (var7 == 12) {
                     var8 = Class_rh.s;
                  }

                  if (~var7 == -14) {
                     int var26 = Class_sb.i[var3[var5++]];
                     int var29 = var3[var5++];
                     var8 = (1 << var29 & var26) != 0 ? 1 : 0;
                  }

                  if (~var7 == -15) {
                     int var27 = var3[var5++];
                     var8 = Class_cb.a(var27, false);
                  }

                  if (~var7 == -19) {
                     var8 = (Class_gg.B.hb >> -879491993) - -Class_fj.e;
                  }

                  if (var7 == 19) {
                     var8 = (Class_gg.B.J >> 329773287) + Class_va.ab;
                  }

                  if (var7 == 20) {
                     var8 = var3[var5++];
                  }

                  if (~var9 != -1) {
                     var6 = var9;
                     if (var14 == 0) {
                        continue;
                     }
                  }

                  if (var6 == 0) {
                     var4 += var8;
                  }

                  if (var6 == 1) {
                     var4 -= var8;
                  }

                  if (var6 == 2 && ~var8 != -1) {
                     var4 /= var8;
                  }

                  if (var6 == 3) {
                     var4 *= var8;
                  }

                  var6 = 0;
               }
            } catch (Exception var15) {
               return -1;
            }
         } else {
            return -2;
         }
      } catch (RuntimeException var16) {
         throw Class_sh.a(var16, "ug.A(" + var0 + 44 + var1 + 44 + (var2 != null ? "{...}" : "null") + 41);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void d(int var0) {
      int var4 = client.lb;

      try {
         s++;
         Class_vf var1 = Class_lc.a;
         synchronized (var1) {
            label74: {
               Class_mb.s = Class_rj.K;
               Class_fb.p++;
               if (~Class_fb.b > -1) {
                  int var3 = 0;
                  if (var4 != 0) {
                     Class_wh.q[var3] = false;
                     var3++;
                  }

                  while (~var3 > -113) {
                     Class_wh.q[var3] = false;
                     var3++;
                  }

                  Class_fb.b = Class_wa.H;
                  if (var4 == 0) {
                     break label74;
                  }
               } else if (~Class_fb.b == ~Class_wa.H) {
                  break label74;
               }

               do {
                  int var10 = Class_pa.i[Class_wa.H];
                  Class_wa.H = 1 + Class_wa.H & 127;
                  if (var10 >= 0) {
                     Class_wh.q[var10] = true;
                     if (var4 != 0) {
                        Class_wh.q[~var10] = false;
                     }
                  } else {
                     Class_wh.q[~var10] = false;
                  }
               } while (~Class_fb.b != ~Class_wa.H);
            }

            Class_rj.K = Class_bb.l;
         }

         int var9 = 10 / ((var0 - 91) / 35);
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "ug.E(" + var0 + ')');
      }
   }

   public static void a(byte var0) {
      try {
         w = null;
         if (var0 != -69) {
            p = null;
         }

         z = null;
         r = null;
         p = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ug.D(" + var0 + ')');
      }
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
      try {
         y++;
         int var8 = 2048 - var6 & 2047;
         int var9 = -var1 + 2048 & 2047;
         if (var7 > 26) {
            int var11 = 0;
            int var12 = var4;
            if (var8 != 0) {
               int var13 = Class_kd.e[var8];
               int var14 = Class_kd.q[var8];
               var11 = var13 * -var4 >> 334715760;
               var12 = var4 * var14 >> -1203448176;
            }

            int var10 = 0;
            if (~var9 != -1) {
               int var16 = Class_kd.e[var9];
               var10 = var12 * var16 >> -111120368;
               int var17 = Class_kd.q[var9];
               var12 = var17 * var12 >> -1690074768;
            }

            Class_mg.j = var1;
            Class_hc.a = var6;
            Class_ef.s = -var11 + var3;
            Class_gg.D = -var10 + var2;
            Class_oc.l = -var12 + var5;
         }
      } catch (RuntimeException var15) {
         throw Class_sh.a(var15, "ug.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
      }
   }

   static final int a(int var0, int var1, int var2) {
      try {
         t++;
         if (var0 != 0) {
            return -119;
         } else {
            long var3 = var1 + (var2 << -1252810064);
            return Class_mh.W != null && ~Class_mh.W.a == ~var3 ? Class_vf.j.p * 99 / (-Class_mh.W.M + Class_vf.j.E.length) + 1 : 0;
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "ug.B(" + var0 + 44 + var1 + 44 + var2 + 41);
      }
   }

   public Class_ug() {
   }

   Class_ug(Class_r var1, int var2) {
      try {
         this.A = var1;
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "ug.<init>(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
      }
   }
}
