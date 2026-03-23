final class Class_mk {
   static int a = 20;
   static int[][] b = new int[104][104];
   static Class_r c = Class_mk.f;
   static int d;
   int e;
   private static Class_r f = Class_tc.a(43, "Use");
   static int g;
   int h;
   static int i;
   static Class_id j;
   static int k = 0;
   int l;
   static int m;
   Class_a n;
   int o;
   Class_a p;
   int q;
   int r;
   int s;
   long t = 0L;

   static final int a(int var0, int var1) {
      try {
         m++;
         if (Class_pi.sb == 1) {
            return 7;
         } else if (Class_pi.sb == 2) {
            return 20;
         } else {
            if (var1 != 15) {
               if (var1 == 16) {
                  return 3;
               }

               if (~var1 == -23) {
                  return 8;
               }

               if (var1 == 31) {
                  return 14;
               }

               if (~var1 == -39) {
                  return 2;
               }

               if (var1 == 43) {
                  return 15;
               }

               if (~var1 == -49) {
                  return 17;
               }

               if (~var1 == -59) {
                  return 11;
               }

               if (var1 == 69) {
                  return 6;
               }

               if (var1 == 74) {
                  return 20;
               }

               if (~var1 == -78) {
                  return 1;
               }

               if (var1 == 101) {
                  return 12;
               }

               if (~var1 == -104) {
                  return 19;
               }

               if (var1 == 152) {
                  return 16;
               }

               if (var1 == 161) {
                  return 4;
               }

               if (var1 == 162) {
                  return 9;
               }

               if (~var1 == -167) {
                  return 10;
               }

               if (var1 == 179) {
                  return 18;
               }

               if (var1 != 191) {
                  if (var0 != 3) {
                     b = null;
                  }

                  return 0;
               }

               if (client.lb == 0) {
                  return 5;
               }
            }

            return 13;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "mk.A(" + var0 + 44 + var1 + 41);
      }
   }

   static final Class_ke a(int var0, Class_lh var1) {
      try {
         if (var0 != 3) {
            return null;
         } else {
            i++;
            return new Class_ke(var1.p(-22489), var1.p(-22489), var1.p(-22489), var1.p(var0 ^ -22492), var1.b((byte)63), var1.n(-6677));
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "mk.C(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, byte var1) {
      int var5 = client.lb;

      try {
         d++;
         if (Class_oj.b(var0, (byte)-2)) {
            Class_ha[] var2 = Class_ve.ab[var0];
            if (var1 <= 103) {
               a(125, null);
            }

            int var3 = 0;
            if (var5 != 0 || var2.length > var3) {
               do {
                  Class_ha var4 = var2[var3];
                  if (var4 != null) {
                     var4.a = 0;
                     var4.p = 0;
                  }
               } while (var2.length > ++var3);
            }
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "mk.D(" + var0 + ',' + var1 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0) {
      int var16 = client.lb;

      try {
         g++;
         if (~Class_mc.k != 0 && ~Class_oa.e != 0) {
            float[] var3;
            label50: {
               int var1 = (Class_hc.d * (-Class_fb.c + Class_oj.Z) >> -2096407664) + Class_fb.c;
               Class_hc.d += var1;
               var3 = new float[3];
               if (Class_hc.d >= 65535) {
                  label47: {
                     if (!Class_cc.Ub) {
                        Class_r.s = true;
                        if (var16 == 0) {
                           break label47;
                        }
                     }

                     Class_r.s = false;
                  }

                  Class_cc.Ub = true;
                  Class_hc.d = 65535;
                  if (var16 == 0) {
                     break label50;
                  }
               }

               Class_r.s = false;
               Class_cc.Ub = false;
            }

            int var4 = Class_ed.g * 2;
            float var2 = Class_hc.d / 65535.0F;
            int var5 = 0;
            if (var16 != 0) {
               int var7 = Class_db.kb[Class_mc.k][1 + var4][var5] * 3;
               int var8 = 3 * (Class_db.kb[Class_mc.k][2 + var4][var5] - Class_db.kb[Class_mc.k][3 + var4][var5] + Class_db.kb[Class_mc.k][var4 - -2][var5]);
               int var9 = Class_db.kb[Class_mc.k][var4][var5];
               int var6 = Class_db.kb[Class_mc.k][var4][var5] * 3;
               int var10 = -var6 + var7;
               int var12 = -var8 + var7 + -var9 + Class_db.kb[Class_mc.k][var4 + 2][var5];
               int var11 = var6 - (var7 * 2 + -var8);
               var3[var5] = var9 + var2 * (var2 * (var2 * var12 + var11) + var10);
               var5++;
            }

            while (var5 < 3) {
               int var20 = Class_db.kb[Class_mc.k][1 + var4][var5] * 3;
               int var22 = 3 * (Class_db.kb[Class_mc.k][2 + var4][var5] - Class_db.kb[Class_mc.k][3 + var4][var5] + Class_db.kb[Class_mc.k][var4 - -2][var5]);
               int var24 = Class_db.kb[Class_mc.k][var4][var5];
               int var18 = Class_db.kb[Class_mc.k][var4][var5] * 3;
               int var28 = -var18 + var20;
               int var36 = -var22 + var20 + -var24 + Class_db.kb[Class_mc.k][var4 + 2][var5];
               int var32 = var18 - (var20 * 2 + -var22);
               var3[var5] = var24 + var2 * (var2 * (var2 * var36 + var32) + var28);
               var5++;
            }

            if (~Class_fj.e == -1 && ~Class_va.ab == -1) {
               Class_va.ab = ((int)var3[2] >> 79417770) * 8 - 48;
               Class_fj.e = 8 * ((int)var3[0] >> -96114774) - 48;
            }

            Class_oc.l = -(Class_va.ab * 128) + (int)var3[2];
            Class_ef.s = (int)var3[1] * var0;
            Class_gg.D = -(128 * Class_fj.e) + (int)var3[0];
            float[] var19 = new float[3];
            int var21 = 2 * Class_hj.W;
            int var23 = 0;
            if (var16 == 0 && var23 >= 3) {
               float var27 = -var3[0] + var19[0];
               float var31 = -1.0F * (var19[1] - var3[1]);
               float var35 = var19[2] - var3[2];
               double var39 = Math.sqrt(var35 * var35 + var27 * var27);
               Class_mh.X = (float)Math.atan2(var31, var39);
               Class_ha.jd = -((float)Math.atan2(var27, var35));
               Class_mg.j = (int)(325.949 * Class_ha.jd) & 2047;
               Class_hc.a = (int)(325.949 * Class_mh.X) & 2047;
            } else {
               do {
                  int var29 = Class_db.kb[Class_oa.e][var21 - -1][var23] * 3;
                  int var25 = 3 * Class_db.kb[Class_oa.e][var21][var23];
                  int var37 = Class_db.kb[Class_oa.e][var21][var23];
                  int var33 = (
                        Class_db.kb[Class_oa.e][var21 + 2][var23] - -Class_db.kb[Class_oa.e][var21 - -2][var23] - Class_db.kb[Class_oa.e][3 + var21][var23]
                     )
                     * 3;
                  int var14 = var33 + -(2 * var29) + var25;
                  int var13 = -var25 + var29;
                  int var15 = Class_db.kb[Class_oa.e][2 + var21][var23] - (var37 + -var29) - var33;
                  var19[var23] = (var13 + (var14 + var15 * var2) * var2) * var2 + var37;
               } while (++var23 < 3);

               float var26 = -var3[0] + var19[0];
               float var30 = -1.0F * (var19[1] - var3[1]);
               float var34 = var19[2] - var3[2];
               double var38 = Math.sqrt(var34 * var34 + var26 * var26);
               Class_mh.X = (float)Math.atan2(var30, var38);
               Class_ha.jd = -((float)Math.atan2(var26, var34));
               Class_mg.j = (int)(325.949 * Class_ha.jd) & 2047;
               Class_hc.a = (int)(325.949 * Class_mh.X) & 2047;
            }
         }
      } catch (RuntimeException var17) {
         throw Class_sh.a(var17, "mk.B(" + var0 + ')');
      }
   }

   public static void b(int var0) {
      try {
         c = null;
         f = null;
         b = null;
         if (var0 == 162) {
            j = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "mk.E(" + var0 + ')');
      }
   }

   public Class_mk() {
   }
}
