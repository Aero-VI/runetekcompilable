import java.awt.Frame;

final class Class_si {
   static int a = 0;
   static Class_ha b;
   static int c = 0;
   static Class_qc d = new Class_qc(4);
   static Class_jb[] e;
   static int f;
   static boolean g = true;
   static Class_r h = Class_tc.a(43, "Weiter");
   static Frame i;
   static Class_aa[][][] j;

   static final void a(Class_aa var0, boolean var1) {
      Class_me.l.a(var0, true);

      while (true) {
         Class_aa var2;
         int var3;
         int var4;
         int var5;
         int var6;
         Class_aa[][] var7;
         while (true) {
            var2 = (Class_aa)Class_me.l.e(-115);
            if (var2 == null) {
               return;
            }

            if (var2.F) {
               var3 = var2.y;
               var4 = var2.R;
               var5 = var2.C;
               var6 = var2.A;
               var7 = Class_ck.d[var5];
               if (!var2.E) {
                  break;
               }

               if (var1) {
                  if (var5 > 0) {
                     Class_aa var8 = Class_ck.d[var5 - 1][var3][var4];
                     if (var8 != null && var8.F) {
                        continue;
                     }
                  }

                  if (var3 <= Class_jb.ab && var3 > Class_lj.g) {
                     Class_aa var20 = var7[var3 - 1][var4];
                     if (var20 != null && var20.F && (var20.E || (var2.D & 1) == 0)) {
                        continue;
                     }
                  }

                  if (var3 >= Class_jb.ab && var3 < Class_ed.j - 1) {
                     Class_aa var21 = var7[var3 + 1][var4];
                     if (var21 != null && var21.F && (var21.E || (var2.D & 4) == 0)) {
                        continue;
                     }
                  }

                  if (var4 <= Class_vg.x && var4 > Class_oc.k) {
                     Class_aa var22 = var7[var3][var4 - 1];
                     if (var22 != null && var22.F && (var22.E || (var2.D & 8) == 0)) {
                        continue;
                     }
                  }

                  if (var4 >= Class_vg.x && var4 < Class_ng.u - 1) {
                     Class_aa var23 = var7[var3][var4 + 1];
                     if (var23 != null && var23.F && (var23.E || (var2.D & 2) == 0)) {
                        continue;
                     }
                  }
               } else {
                  var1 = true;
               }

               var2.E = false;
               if (var2.P != null) {
                  Class_aa var24 = var2.P;
                  if (var24.t != null) {
                     if (!Class_cj.c(0, var3, var4)) {
                        Class_md.a(var24.t, 0, Class_ke.v, Class_lc.f, Class_wh.i, Class_c.z, var3, var4, false);
                     } else {
                        Class_md.a(var24.t, 0, Class_ke.v, Class_lc.f, Class_wh.i, Class_c.z, var3, var4, true);
                     }
                  } else if (var24.O != null) {
                     if (!Class_cj.c(0, var3, var4)) {
                        Class_j.a(var24.O, Class_ke.v, Class_lc.f, Class_wh.i, Class_c.z, var3, var4, false);
                     } else {
                        Class_j.a(var24.O, Class_ke.v, Class_lc.f, Class_wh.i, Class_c.z, var3, var4, true);
                     }
                  }

                  Class_kk var9 = var24.s;
                  if (var9 != null) {
                     var9.f.a(0, Class_ke.v, Class_lc.f, Class_wh.i, Class_c.z, var9.h - Class_de.i, var9.k - Class_n.q, var9.a - Class_mi.W, var9.j);
                  }

                  for (int var10 = 0; var10 < var24.G; var10++) {
                     Class_lj var11 = var24.H[var10];
                     if (var11 != null) {
                        var11.j
                           .a(var11.w, Class_ke.v, Class_lc.f, Class_wh.i, Class_c.z, var11.D - Class_de.i, var11.t - Class_n.q, var11.r - Class_mi.W, var11.k);
                     }
                  }
               }

               boolean var25 = false;
               if (var2.t != null) {
                  if (!Class_cj.c(var6, var3, var4)) {
                     var25 = true;
                     if (var2.t.m != 12345678 || Class_lh.cb && var5 <= Class_ec.O) {
                        Class_md.a(var2.t, var6, Class_ke.v, Class_lc.f, Class_wh.i, Class_c.z, var3, var4, false);
                     }
                  } else {
                     Class_md.a(var2.t, var6, Class_ke.v, Class_lc.f, Class_wh.i, Class_c.z, var3, var4, true);
                  }
               } else if (var2.O != null) {
                  if (!Class_cj.c(var6, var3, var4)) {
                     var25 = true;
                     Class_j.a(var2.O, Class_ke.v, Class_lc.f, Class_wh.i, Class_c.z, var3, var4, false);
                  } else {
                     Class_j.a(var2.O, Class_ke.v, Class_lc.f, Class_wh.i, Class_c.z, var3, var4, true);
                  }
               }

               if (var25) {
                  Class_hd var33 = var2.M;
                  if (var33 != null && (var33.m & 2147483648L) != 0L) {
                     var33.a.a(0, Class_ke.v, Class_lc.f, Class_wh.i, Class_c.z, var33.k - Class_de.i, var33.g - Class_n.q, var33.b - Class_mi.W, var33.m);
                  }
               }

               int var34 = 0;
               int var43 = 0;
               Class_kk var48 = var2.s;
               Class_mk var12 = var2.z;
               if (var48 != null || var12 != null) {
                  if (Class_jb.ab == var3) {
                     var34++;
                  } else if (Class_jb.ab < var3) {
                     var34 += 2;
                  }

                  if (Class_vg.x == var4) {
                     var34 += 3;
                  } else if (Class_vg.x > var4) {
                     var34 += 6;
                  }

                  var43 = Class_lj.y[var34];
                  var2.I = Class_cc.Zb[var34];
               }

               if (var48 != null) {
                  if ((var48.l & Class_ak.L[var34]) != 0) {
                     if (var48.l == 16) {
                        var2.N = 3;
                        var2.J = Class_ti.e[var34];
                        var2.L = 3 - var2.J;
                     } else if (var48.l == 32) {
                        var2.N = 6;
                        var2.J = Class_kh.g[var34];
                        var2.L = 6 - var2.J;
                     } else if (var48.l == 64) {
                        var2.N = 12;
                        var2.J = Class_kh.f[var34];
                        var2.L = 12 - var2.J;
                     } else {
                        var2.N = 9;
                        var2.J = Class_lf.P[var34];
                        var2.L = 9 - var2.J;
                     }
                  } else {
                     var2.N = 0;
                  }

                  if ((var48.l & var43) != 0 && !Class_pi.a(var6, var3, var4, var48.l)) {
                     var48.f.a(0, Class_ke.v, Class_lc.f, Class_wh.i, Class_c.z, var48.h - Class_de.i, var48.k - Class_n.q, var48.a - Class_mi.W, var48.j);
                  }

                  if ((var48.b & var43) != 0 && !Class_pi.a(var6, var3, var4, var48.b)) {
                     var48.i.a(0, Class_ke.v, Class_lc.f, Class_wh.i, Class_c.z, var48.h - Class_de.i, var48.k - Class_n.q, var48.a - Class_mi.W, var48.j);
                  }
               }

               if (var12 != null && !Class_j.a(var6, var3, var4, var12.n.a())) {
                  if ((var12.r & var43) != 0) {
                     var12.n
                        .a(
                           0,
                           Class_ke.v,
                           Class_lc.f,
                           Class_wh.i,
                           Class_c.z,
                           var12.e - Class_de.i + var12.l,
                           var12.q - Class_n.q,
                           var12.h - Class_mi.W + var12.s,
                           var12.t
                        );
                  } else if (var12.r == 256) {
                     int var13 = var12.e - Class_de.i;
                     int var14 = var12.q - Class_n.q;
                     int var15 = var12.h - Class_mi.W;
                     int var16 = var12.o;
                     int var17;
                     if (var16 != 1 && var16 != 2) {
                        var17 = var13;
                     } else {
                        var17 = -var13;
                     }

                     int var18;
                     if (var16 != 2 && var16 != 3) {
                        var18 = var15;
                     } else {
                        var18 = -var15;
                     }

                     if (var18 < var17) {
                        var12.n.a(0, Class_ke.v, Class_lc.f, Class_wh.i, Class_c.z, var13 + var12.l, var14, var15 + var12.s, var12.t);
                     } else if (var12.p != null) {
                        var12.p.a(0, Class_ke.v, Class_lc.f, Class_wh.i, Class_c.z, var13, var14, var15, var12.t);
                     }
                  }
               }

               if (var25) {
                  Class_hd var55 = var2.M;
                  if (var55 != null && (var55.m & 2147483648L) == 0L) {
                     var55.a.a(0, Class_ke.v, Class_lc.f, Class_wh.i, Class_c.z, var55.k - Class_de.i, var55.g - Class_n.q, var55.b - Class_mi.W, var55.m);
                  }

                  Class_je var61 = var2.u;
                  if (var61 != null && var61.b == 0) {
                     if (var61.f != null) {
                        var61.f.a(0, Class_ke.v, Class_lc.f, Class_wh.i, Class_c.z, var61.g - Class_de.i, var61.r - Class_n.q, var61.h - Class_mi.W, var61.d);
                     }

                     if (var61.k != null) {
                        var61.k.a(0, Class_ke.v, Class_lc.f, Class_wh.i, Class_c.z, var61.g - Class_de.i, var61.r - Class_n.q, var61.h - Class_mi.W, var61.d);
                     }

                     if (var61.p != null) {
                        var61.p.a(0, Class_ke.v, Class_lc.f, Class_wh.i, Class_c.z, var61.g - Class_de.i, var61.r - Class_n.q, var61.h - Class_mi.W, var61.d);
                     }
                  }
               }

               int var56 = var2.D;
               if (var56 != 0) {
                  if (var3 < Class_jb.ab && (var56 & 4) != 0) {
                     Class_aa var62 = var7[var3 + 1][var4];
                     if (var62 != null && var62.F) {
                        Class_me.l.a(var62, true);
                     }
                  }

                  if (var4 < Class_vg.x && (var56 & 2) != 0) {
                     Class_aa var63 = var7[var3][var4 + 1];
                     if (var63 != null && var63.F) {
                        Class_me.l.a(var63, true);
                     }
                  }

                  if (var3 > Class_jb.ab && (var56 & 1) != 0) {
                     Class_aa var64 = var7[var3 - 1][var4];
                     if (var64 != null && var64.F) {
                        Class_me.l.a(var64, true);
                     }
                  }

                  if (var4 > Class_vg.x && (var56 & 8) != 0) {
                     Class_aa var65 = var7[var3][var4 - 1];
                     if (var65 != null && var65.F) {
                        Class_me.l.a(var65, true);
                     }
                  }
               }
               break;
            }
         }

         if (var2.N != 0) {
            boolean var26 = true;

            for (int var35 = 0; var35 < var2.G; var35++) {
               if (var2.H[var35].B != Class_aa.r && (var2.B[var35] & var2.N) == var2.J) {
                  var26 = false;
                  break;
               }
            }

            if (var26) {
               Class_kk var44 = var2.s;
               if (!Class_pi.a(var6, var3, var4, var44.l)) {
                  var44.f.a(0, Class_ke.v, Class_lc.f, Class_wh.i, Class_c.z, var44.h - Class_de.i, var44.k - Class_n.q, var44.a - Class_mi.W, var44.j);
               }

               var2.N = 0;
            }
         }

         if (var2.Q) {
            try {
               int var27 = var2.G;
               var2.Q = false;
               int var36 = 0;

               label572:
               for (int var45 = 0; var45 < var27; var45++) {
                  Class_lj var49 = var2.H[var45];
                  if (var49.B != Class_aa.r) {
                     for (int var52 = var49.v; var52 <= var49.f; var52++) {
                        for (int var57 = var49.u; var57 <= var49.b; var57++) {
                           Class_aa var66 = var7[var52][var57];
                           if (var66.E) {
                              var2.Q = true;
                              continue label572;
                           }

                           if (var66.N != 0) {
                              int var71 = 0;
                              if (var52 > var49.v) {
                                 var71++;
                              }

                              if (var52 < var49.f) {
                                 var71 += 4;
                              }

                              if (var57 > var49.u) {
                                 var71 += 8;
                              }

                              if (var57 < var49.b) {
                                 var71 += 2;
                              }

                              if ((var71 & var66.N) == var2.L) {
                                 var2.Q = true;
                                 continue label572;
                              }
                           }
                        }
                     }

                     Class_cg.v[var36++] = var49;
                     int var58 = Class_jb.ab - var49.v;
                     int var67 = var49.f - Class_jb.ab;
                     if (var67 > var58) {
                        var58 = var67;
                     }

                     int var72 = Class_vg.x - var49.u;
                     int var76 = var49.b - Class_vg.x;
                     if (var76 > var72) {
                        var49.x = var58 + var76;
                     } else {
                        var49.x = var58 + var72;
                     }
                  }
               }

               while (var36 > 0) {
                  int var50 = -50;
                  int var53 = -1;

                  for (int var59 = 0; var59 < var36; var59++) {
                     Class_lj var68 = Class_cg.v[var59];
                     if (var68.B != Class_aa.r) {
                        if (var68.x > var50) {
                           var50 = var68.x;
                           var53 = var59;
                        } else if (var68.x == var50) {
                           int var73 = var68.D - Class_de.i;
                           int var77 = var68.r - Class_mi.W;
                           int var79 = Class_cg.v[var53].D - Class_de.i;
                           int var81 = Class_cg.v[var53].r - Class_mi.W;
                           if (var73 * var73 + var77 * var77 > var79 * var79 + var81 * var81) {
                              var53 = var59;
                           }
                        }
                     }
                  }

                  if (var53 == -1) {
                     break;
                  }

                  Class_lj var69 = Class_cg.v[var53];
                  var69.B = Class_aa.r;
                  if (!Class_hj.a(var6, var69.v, var69.f, var69.u, var69.b, var69.j.a())) {
                     var69.j
                        .a(var69.w, Class_ke.v, Class_lc.f, Class_wh.i, Class_c.z, var69.D - Class_de.i, var69.t - Class_n.q, var69.r - Class_mi.W, var69.k);
                  }

                  for (int var74 = var69.v; var74 <= var69.f; var74++) {
                     for (int var78 = var69.u; var78 <= var69.b; var78++) {
                        Class_aa var80 = var7[var74][var78];
                        if (var80.N != 0) {
                           Class_me.l.a(var80, true);
                        } else if ((var74 != var3 || var78 != var4) && var80.F) {
                           Class_me.l.a(var80, true);
                        }
                     }
                  }
               }

               if (var2.Q) {
                  continue;
               }
            } catch (Exception var19) {
               var2.Q = false;
            }
         }

         if (var2.F && var2.N == 0) {
            if (var3 <= Class_jb.ab && var3 > Class_lj.g) {
               Class_aa var28 = var7[var3 - 1][var4];
               if (var28 != null && var28.F) {
                  continue;
               }
            }

            if (var3 >= Class_jb.ab && var3 < Class_ed.j - 1) {
               Class_aa var29 = var7[var3 + 1][var4];
               if (var29 != null && var29.F) {
                  continue;
               }
            }

            if (var4 <= Class_vg.x && var4 > Class_oc.k) {
               Class_aa var30 = var7[var3][var4 - 1];
               if (var30 != null && var30.F) {
                  continue;
               }
            }

            if (var4 >= Class_vg.x && var4 < Class_ng.u - 1) {
               Class_aa var31 = var7[var3][var4 + 1];
               if (var31 != null && var31.F) {
                  continue;
               }
            }

            var2.F = false;
            Class_i.kb--;
            Class_je var32 = var2.u;
            if (var32 != null && var32.b != 0) {
               if (var32.f != null) {
                  var32.f
                     .a(0, Class_ke.v, Class_lc.f, Class_wh.i, Class_c.z, var32.g - Class_de.i, var32.r - Class_n.q - var32.b, var32.h - Class_mi.W, var32.d);
               }

               if (var32.k != null) {
                  var32.k
                     .a(0, Class_ke.v, Class_lc.f, Class_wh.i, Class_c.z, var32.g - Class_de.i, var32.r - Class_n.q - var32.b, var32.h - Class_mi.W, var32.d);
               }

               if (var32.p != null) {
                  var32.p
                     .a(0, Class_ke.v, Class_lc.f, Class_wh.i, Class_c.z, var32.g - Class_de.i, var32.r - Class_n.q - var32.b, var32.h - Class_mi.W, var32.d);
               }
            }

            if (var2.I != 0) {
               Class_mk var37 = var2.z;
               if (var37 != null && !Class_j.a(var6, var3, var4, var37.n.a())) {
                  if ((var37.r & var2.I) != 0) {
                     var37.n
                        .a(
                           0,
                           Class_ke.v,
                           Class_lc.f,
                           Class_wh.i,
                           Class_c.z,
                           var37.e - Class_de.i + var37.l,
                           var37.q - Class_n.q,
                           var37.h - Class_mi.W + var37.s,
                           var37.t
                        );
                  } else if (var37.r == 256) {
                     int var46 = var37.e - Class_de.i;
                     int var51 = var37.q - Class_n.q;
                     int var54 = var37.h - Class_mi.W;
                     int var60 = var37.o;
                     int var70;
                     if (var60 != 1 && var60 != 2) {
                        var70 = var46;
                     } else {
                        var70 = -var46;
                     }

                     int var75;
                     if (var60 != 2 && var60 != 3) {
                        var75 = var54;
                     } else {
                        var75 = -var54;
                     }

                     if (var75 >= var70) {
                        var37.n.a(0, Class_ke.v, Class_lc.f, Class_wh.i, Class_c.z, var46 + var37.l, var51, var54 + var37.s, var37.t);
                     } else if (var37.p != null) {
                        var37.p.a(0, Class_ke.v, Class_lc.f, Class_wh.i, Class_c.z, var46, var51, var54, var37.t);
                     }
                  }
               }

               Class_kk var47 = var2.s;
               if (var47 != null) {
                  if ((var47.b & var2.I) != 0 && !Class_pi.a(var6, var3, var4, var47.b)) {
                     var47.i.a(0, Class_ke.v, Class_lc.f, Class_wh.i, Class_c.z, var47.h - Class_de.i, var47.k - Class_n.q, var47.a - Class_mi.W, var47.j);
                  }

                  if ((var47.l & var2.I) != 0 && !Class_pi.a(var6, var3, var4, var47.l)) {
                     var47.f.a(0, Class_ke.v, Class_lc.f, Class_wh.i, Class_c.z, var47.h - Class_de.i, var47.k - Class_n.q, var47.a - Class_mi.W, var47.j);
                  }
               }
            }

            if (var5 < Class_od.r - 1) {
               Class_aa var38 = Class_ck.d[var5 + 1][var3][var4];
               if (var38 != null && var38.F) {
                  Class_me.l.a(var38, true);
               }
            }

            if (var3 < Class_jb.ab) {
               Class_aa var39 = var7[var3 + 1][var4];
               if (var39 != null && var39.F) {
                  Class_me.l.a(var39, true);
               }
            }

            if (var4 < Class_vg.x) {
               Class_aa var40 = var7[var3][var4 + 1];
               if (var40 != null && var40.F) {
                  Class_me.l.a(var40, true);
               }
            }

            if (var3 > Class_jb.ab) {
               Class_aa var41 = var7[var3 - 1][var4];
               if (var41 != null && var41.F) {
                  Class_me.l.a(var41, true);
               }
            }

            if (var4 > Class_vg.x) {
               Class_aa var42 = var7[var3][var4 - 1];
               if (var42 != null && var42.F) {
                  Class_me.l.a(var42, true);
               }
            }
         }
      }
   }

   public static void a(int var0) {
      try {
         e = null;
         j = null;
         d = null;
         b = null;
         if (var0 != 29889) {
            f = 69;
         }

         h = null;
         i = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "si.A(" + var0 + ')');
      }
   }
}
