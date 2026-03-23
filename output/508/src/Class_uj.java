final class Class_uj extends Class_ni {
   final void a(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var6 != 0) {
         var1 -= super.W << 4;
         var2 -= super.K << 4;
         double var7 = (var5 & 65535) * 9.587379924285257E-5;
         int var9 = (int)Math.floor(Math.sin(var7) * var6 + 0.5);
         int var10 = (int)Math.floor(Math.cos(var7) * var6 + 0.5);
         int var11 = -var1 * var10 + -var2 * var9;
         int var12 = var1 * var9 + -var2 * var10;
         int var13 = ((super.Q << 4) - var1) * var10 + -var2 * var9;
         int var14 = -((super.Q << 4) - var1) * var9 + -var2 * var10;
         int var15 = -var1 * var10 + ((super.S << 4) - var2) * var9;
         int var16 = var1 * var9 + ((super.S << 4) - var2) * var10;
         int var17 = ((super.Q << 4) - var1) * var10 + ((super.S << 4) - var2) * var9;
         int var18 = -((super.Q << 4) - var1) * var9 + ((super.S << 4) - var2) * var10;
         int var19;
         int var20;
         if (var11 < var13) {
            var19 = var11;
            var20 = var13;
         } else {
            var19 = var13;
            var20 = var11;
         }

         if (var15 < var19) {
            var19 = var15;
         }

         if (var17 < var19) {
            var19 = var17;
         }

         if (var15 > var20) {
            var20 = var15;
         }

         if (var17 > var20) {
            var20 = var17;
         }

         int var21;
         int var22;
         if (var12 < var14) {
            var21 = var12;
            var22 = var14;
         } else {
            var21 = var14;
            var22 = var12;
         }

         if (var16 < var21) {
            var21 = var16;
         }

         if (var18 < var21) {
            var21 = var18;
         }

         if (var16 > var22) {
            var22 = var16;
         }

         if (var18 > var22) {
            var22 = var18;
         }

         var19 >>= 12;
         var20 = var20 + 4095 >> 12;
         var21 >>= 12;
         var22 = var22 + 4095 >> 12;
         var19 += var3;
         var20 += var3;
         var21 += var4;
         var22 += var4;
         var19 >>= 4;
         var20 = var20 + 15 >> 4;
         var21 >>= 4;
         var22 = var22 + 15 >> 4;
         if (var19 < Class_nc.d) {
            var19 = Class_nc.d;
         }

         if (var20 > Class_nc.b) {
            var20 = Class_nc.b;
         }

         if (var21 < Class_nc.g) {
            var21 = Class_nc.g;
         }

         if (var22 > Class_nc.h) {
            var22 = Class_nc.h;
         }

         var20 = var19 - var20;
         if (var20 < 0) {
            var22 = var21 - var22;
            if (var22 < 0) {
               int var23 = var21 * Class_nc.e + var19;
               double var24 = 1.6777216E7 / var6;
               int var26 = (int)Math.floor(Math.sin(var7) * var24 + 0.5);
               int var27 = (int)Math.floor(Math.cos(var7) * var24 + 0.5);
               int var28 = (var19 << 4) + 8 - var3;
               int var29 = (var21 << 4) + 8 - var4;
               int var30 = (var1 << 8) - (var29 * var26 >> 4);
               int var31 = (var2 << 8) + (var29 * var27 >> 4);
               if (var27 == 0) {
                  if (var26 == 0) {
                     for (int var94 = var22; var94 < 0; var23 += Class_nc.e) {
                        int var102 = var23;
                        int var110 = var30;
                        int var118 = var31;
                        int var126 = var20;
                        if (var30 >= 0 && var31 >= 0 && var30 - (super.Q << 12) < 0 && var31 - (super.S << 12) < 0) {
                           while (var126 < 0) {
                              int var134 = super.I[(var118 >> 12) * super.Q + (var110 >> 12)];
                              int var142 = Class_nc.f[var102];
                              int var150 = var134 >>> 24;
                              int var158 = 256 - var150;
                              Class_nc.f[var102++] = ((var134 & 16711935) * var150 + (var142 & 16711935) * var158 & -16711936)
                                    + ((var134 & 0xFF00) * var150 + (var142 & 0xFF00) * var158 & 0xFF0000)
                                 >> 8;
                              var126++;
                           }
                        }

                        var94++;
                     }
                  } else if (var26 < 0) {
                     for (int var93 = var22; var93 < 0; var23 += Class_nc.e) {
                        int var101 = var23;
                        int var109 = var30;
                        int var117 = var31 + (var28 * var26 >> 4);
                        int var125 = var20;
                        if (var30 >= 0 && var30 - (super.Q << 12) < 0) {
                           int var84;
                           if ((var84 = var117 - (super.S << 12)) >= 0) {
                              var84 = (var26 - var84) / var26;
                              var125 = var20 + var84;
                              var117 += var26 * var84;
                              var101 = var23 + var84;
                           }

                           if ((var84 = (var117 - var26) / var26) > var125) {
                              var125 = var84;
                           }

                           while (var125 < 0) {
                              int var133 = super.I[(var117 >> 12) * super.Q + (var109 >> 12)];
                              int var141 = Class_nc.f[var101];
                              int var149 = var133 >>> 24;
                              int var157 = 256 - var149;
                              Class_nc.f[var101++] = ((var133 & 16711935) * var149 + (var141 & 16711935) * var157 & -16711936)
                                    + ((var133 & 0xFF00) * var149 + (var141 & 0xFF00) * var157 & 0xFF0000)
                                 >> 8;
                              var117 += var26;
                              var125++;
                           }
                        }

                        var93++;
                        var30 -= var26;
                     }
                  } else {
                     for (int var92 = var22; var92 < 0; var23 += Class_nc.e) {
                        int var100 = var23;
                        int var108 = var30;
                        int var116 = var31 + (var28 * var26 >> 4);
                        int var124 = var20;
                        if (var30 >= 0 && var30 - (super.Q << 12) < 0) {
                           if (var116 < 0) {
                              int var82 = (var26 - 1 - var116) / var26;
                              var124 = var20 + var82;
                              var116 += var26 * var82;
                              var100 = var23 + var82;
                           }

                           int var83;
                           if ((var83 = (1 + var116 - (super.S << 12) - var26) / var26) > var124) {
                              var124 = var83;
                           }

                           while (var124 < 0) {
                              int var132 = super.I[(var116 >> 12) * super.Q + (var108 >> 12)];
                              int var140 = Class_nc.f[var100];
                              int var148 = var132 >>> 24;
                              int var156 = 256 - var148;
                              Class_nc.f[var100++] = ((var132 & 16711935) * var148 + (var140 & 16711935) * var156 & -16711936)
                                    + ((var132 & 0xFF00) * var148 + (var140 & 0xFF00) * var156 & 0xFF0000)
                                 >> 8;
                              var116 += var26;
                              var124++;
                           }
                        }

                        var92++;
                        var30 -= var26;
                     }
                  }
               } else if (var27 < 0) {
                  if (var26 == 0) {
                     for (int var91 = var22; var91 < 0; var23 += Class_nc.e) {
                        int var99 = var23;
                        int var107 = var30 + (var28 * var27 >> 4);
                        int var115 = var31;
                        int var123 = var20;
                        if (var31 >= 0 && var31 - (super.S << 12) < 0) {
                           int var79;
                           if ((var79 = var107 - (super.Q << 12)) >= 0) {
                              var79 = (var27 - var79) / var27;
                              var123 = var20 + var79;
                              var107 += var27 * var79;
                              var99 = var23 + var79;
                           }

                           if ((var79 = (var107 - var27) / var27) > var123) {
                              var123 = var79;
                           }

                           while (var123 < 0) {
                              int var131 = super.I[(var115 >> 12) * super.Q + (var107 >> 12)];
                              int var139 = Class_nc.f[var99];
                              int var147 = var131 >>> 24;
                              int var155 = 256 - var147;
                              Class_nc.f[var99++] = ((var131 & 16711935) * var147 + (var139 & 16711935) * var155 & -16711936)
                                    + ((var131 & 0xFF00) * var147 + (var139 & 0xFF00) * var155 & 0xFF0000)
                                 >> 8;
                              var107 += var27;
                              var123++;
                           }
                        }

                        var91++;
                        var31 += var27;
                     }
                  } else if (var26 < 0) {
                     for (int var90 = var22; var90 < 0; var23 += Class_nc.e) {
                        int var98 = var23;
                        int var106 = var30 + (var28 * var27 >> 4);
                        int var114 = var31 + (var28 * var26 >> 4);
                        int var122 = var20;
                        int var73;
                        if ((var73 = var106 - (super.Q << 12)) >= 0) {
                           var73 = (var27 - var73) / var27;
                           var122 = var20 + var73;
                           var106 += var27 * var73;
                           var114 += var26 * var73;
                           var98 = var23 + var73;
                        }

                        if ((var73 = (var106 - var27) / var27) > var122) {
                           var122 = var73;
                        }

                        if ((var73 = var114 - (super.S << 12)) >= 0) {
                           var73 = (var26 - var73) / var26;
                           var122 += var73;
                           var106 += var27 * var73;
                           var114 += var26 * var73;
                           var98 += var73;
                        }

                        if ((var73 = (var114 - var26) / var26) > var122) {
                           var122 = var73;
                        }

                        while (var122 < 0) {
                           int var130 = super.I[(var114 >> 12) * super.Q + (var106 >> 12)];
                           int var138 = Class_nc.f[var98];
                           int var146 = var130 >>> 24;
                           int var154 = 256 - var146;
                           Class_nc.f[var98++] = ((var130 & 16711935) * var146 + (var138 & 16711935) * var154 & -16711936)
                                 + ((var130 & 0xFF00) * var146 + (var138 & 0xFF00) * var154 & 0xFF0000)
                              >> 8;
                           var106 += var27;
                           var114 += var26;
                           var122++;
                        }

                        var90++;
                        var30 -= var26;
                        var31 += var27;
                     }
                  } else {
                     for (int var89 = var22; var89 < 0; var23 += Class_nc.e) {
                        int var97 = var23;
                        int var105 = var30 + (var28 * var27 >> 4);
                        int var113 = var31 + (var28 * var26 >> 4);
                        int var121 = var20;
                        int var68;
                        if ((var68 = var105 - (super.Q << 12)) >= 0) {
                           var68 = (var27 - var68) / var27;
                           var121 = var20 + var68;
                           var105 += var27 * var68;
                           var113 += var26 * var68;
                           var97 = var23 + var68;
                        }

                        if ((var68 = (var105 - var27) / var27) > var121) {
                           var121 = var68;
                        }

                        if (var113 < 0) {
                           var68 = (var26 - 1 - var113) / var26;
                           var121 += var68;
                           var105 += var27 * var68;
                           var113 += var26 * var68;
                           var97 += var68;
                        }

                        if ((var68 = (1 + var113 - (super.S << 12) - var26) / var26) > var121) {
                           var121 = var68;
                        }

                        while (var121 < 0) {
                           int var129 = super.I[(var113 >> 12) * super.Q + (var105 >> 12)];
                           int var137 = Class_nc.f[var97];
                           int var145 = var129 >>> 24;
                           int var153 = 256 - var145;
                           Class_nc.f[var97++] = ((var129 & 16711935) * var145 + (var137 & 16711935) * var153 & -16711936)
                                 + ((var129 & 0xFF00) * var145 + (var137 & 0xFF00) * var153 & 0xFF0000)
                              >> 8;
                           var105 += var27;
                           var113 += var26;
                           var121++;
                        }

                        var89++;
                        var30 -= var26;
                        var31 += var27;
                     }
                  }
               } else if (var26 == 0) {
                  for (int var88 = var22; var88 < 0; var23 += Class_nc.e) {
                     int var96 = var23;
                     int var104 = var30 + (var28 * var27 >> 4);
                     int var112 = var31;
                     int var120 = var20;
                     if (var31 >= 0 && var31 - (super.S << 12) < 0) {
                        if (var104 < 0) {
                           int var66 = (var27 - 1 - var104) / var27;
                           var120 = var20 + var66;
                           var104 += var27 * var66;
                           var96 = var23 + var66;
                        }

                        int var67;
                        if ((var67 = (1 + var104 - (super.Q << 12) - var27) / var27) > var120) {
                           var120 = var67;
                        }

                        while (var120 < 0) {
                           int var128 = super.I[(var112 >> 12) * super.Q + (var104 >> 12)];
                           int var136 = Class_nc.f[var96];
                           int var144 = var128 >>> 24;
                           int var152 = 256 - var144;
                           Class_nc.f[var96++] = ((var128 & 16711935) * var144 + (var136 & 16711935) * var152 & -16711936)
                                 + ((var128 & 0xFF00) * var144 + (var136 & 0xFF00) * var152 & 0xFF0000)
                              >> 8;
                           var104 += var27;
                           var120++;
                        }
                     }

                     var88++;
                     var31 += var27;
                  }
               } else if (var26 < 0) {
                  for (int var87 = var22; var87 < 0; var23 += Class_nc.e) {
                     int var95 = var23;
                     int var103 = var30 + (var28 * var27 >> 4);
                     int var111 = var31 + (var28 * var26 >> 4);
                     int var119 = var20;
                     if (var103 < 0) {
                        int var61 = (var27 - 1 - var103) / var27;
                        var119 = var20 + var61;
                        var103 += var27 * var61;
                        var111 += var26 * var61;
                        var95 = var23 + var61;
                     }

                     int var62;
                     if ((var62 = (1 + var103 - (super.Q << 12) - var27) / var27) > var119) {
                        var119 = var62;
                     }

                     if ((var62 = var111 - (super.S << 12)) >= 0) {
                        var62 = (var26 - var62) / var26;
                        var119 += var62;
                        var103 += var27 * var62;
                        var111 += var26 * var62;
                        var95 += var62;
                     }

                     if ((var62 = (var111 - var26) / var26) > var119) {
                        var119 = var62;
                     }

                     while (var119 < 0) {
                        int var127 = super.I[(var111 >> 12) * super.Q + (var103 >> 12)];
                        int var135 = Class_nc.f[var95];
                        int var143 = var127 >>> 24;
                        int var151 = 256 - var143;
                        Class_nc.f[var95++] = ((var127 & 16711935) * var143 + (var135 & 16711935) * var151 & -16711936)
                              + ((var127 & 0xFF00) * var143 + (var135 & 0xFF00) * var151 & 0xFF0000)
                           >> 8;
                        var103 += var27;
                        var111 += var26;
                        var119++;
                     }

                     var87++;
                     var30 -= var26;
                     var31 += var27;
                  }
               } else {
                  for (int var33 = var22; var33 < 0; var23 += Class_nc.e) {
                     int var34 = var23;
                     int var35 = var30 + (var28 * var27 >> 4);
                     int var36 = var31 + (var28 * var26 >> 4);
                     int var37 = var20;
                     if (var35 < 0) {
                        int var32 = (var27 - 1 - var35) / var27;
                        var37 = var20 + var32;
                        var35 += var27 * var32;
                        var36 += var26 * var32;
                        var34 = var23 + var32;
                     }

                     int var58;
                     if ((var58 = (1 + var35 - (super.Q << 12) - var27) / var27) > var37) {
                        var37 = var58;
                     }

                     if (var36 < 0) {
                        var58 = (var26 - 1 - var36) / var26;
                        var37 += var58;
                        var35 += var27 * var58;
                        var36 += var26 * var58;
                        var34 += var58;
                     }

                     if ((var58 = (1 + var36 - (super.S << 12) - var26) / var26) > var37) {
                        var37 = var58;
                     }

                     while (var37 < 0) {
                        int var38 = super.I[(var36 >> 12) * super.Q + (var35 >> 12)];
                        int var39 = Class_nc.f[var34];
                        int var40 = var38 >>> 24;
                        int var41 = 256 - var40;
                        Class_nc.f[var34++] = ((var38 & 16711935) * var40 + (var39 & 16711935) * var41 & -16711936)
                              + ((var38 & 0xFF00) * var40 + (var39 & 0xFF00) * var41 & 0xFF0000)
                           >> 8;
                        var35 += var27;
                        var36 += var26;
                        var37++;
                     }

                     var33++;
                     var30 -= var26;
                     var31 += var27;
                  }
               }
            }
         }
      }
   }

   private static final void b(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -var5;

      for (int var10 = -var6; var10 < 0; var10++) {
         for (int var11 = var9; var11 < 0; var11++) {
            int var12 = var1[var3] >>> 24;
            int var13 = 256 - var12;
            int var14 = var1[var3++];
            int var15 = var0[var4];
            var0[var4++] = ((var14 & 16711935) * var12 + (var15 & 16711935) * var13 & -16711936)
                  + ((var14 & 0xFF00) * var12 + (var15 & 0xFF00) * var13 & 0xFF0000)
               >> 8;
         }

         var4 += var7;
         var3 += var8;
      }
   }

   private static final void b(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for (int var8 = -var5; var8 < 0; var8++) {
         int var9 = var3 + var4;

         while (var3 < var9) {
            int var10 = var1[var2] >>> 24;
            int var11 = 256 - var10;
            int var12 = var1[var2++];
            int var13 = var0[var3];
            var0[var3++] = ((var12 & 16711935) * var10 + (var13 & 16711935) * var11 & -16711936)
                  + ((var12 & 0xFF00) * var10 + (var13 & 0xFF00) * var11 & 0xFF0000)
               >> 8;
         }

         var3 += var6;
         var2 += var7;
      }
   }

   final void d(int var1, int var2) {
      var1 += super.W;
      var2 += super.K;
      int var3 = var1 + var2 * Class_nc.e;
      int var4 = 0;
      int var5 = super.S;
      int var6 = super.Q;
      int var7 = Class_nc.e - var6;
      int var8 = 0;
      if (var2 < Class_nc.g) {
         int var9 = Class_nc.g - var2;
         var5 -= var9;
         var2 = Class_nc.g;
         var4 += var9 * var6;
         var3 += var9 * Class_nc.e;
      }

      if (var2 + var5 > Class_nc.h) {
         var5 -= var2 + var5 - Class_nc.h;
      }

      if (var1 < Class_nc.d) {
         int var12 = Class_nc.d - var1;
         var6 -= var12;
         var1 = Class_nc.d;
         var4 += var12;
         var3 += var12;
         var8 += var12;
         var7 += var12;
      }

      if (var1 + var6 > Class_nc.b) {
         int var13 = var1 + var6 - Class_nc.b;
         var6 -= var13;
         var8 += var13;
         var7 += var13;
      }

      if (var6 > 0 && var5 > 0) {
         b(Class_nc.f, super.I, var4, var3, var6, var5, var7, var8);
      }
   }

   final void b(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[] var9, int[] var10) {
      try {
         int var11 = -var3 / 2;
         int var12 = -var4 / 2;
         int var13 = (int)(Math.sin(var7 / 326.11) * 65536.0);
         int var14 = (int)(Math.cos(var7 / 326.11) * 65536.0);
         var13 = var13 * var8 >> 8;
         var14 = var14 * var8 >> 8;
         int var15 = (var5 << 16) + var12 * var13 + var11 * var14;
         int var16 = (var6 << 16) + (var12 * var14 - var11 * var13);
         int var17 = var1 + var2 * Class_nc.e;

         for (int var28 = 0; var28 < var4; var28++) {
            int var18 = var9[var28];
            int var19 = var17 + var18;
            int var20 = var15 + var14 * var18;
            int var21 = var16 - var13 * var18;

            for (int var27 = -var10[var28]; var27 < 0; var27++) {
               int var22 = super.I[(var20 >> 16) + (var21 >> 16) * super.Q];
               int var23 = Class_nc.f[var19];
               int var24 = var22 >>> 24;
               int var25 = 256 - var24;
               Class_nc.f[var19++] = ((var22 & 16711935) * var24 + (var23 & 16711935) * var25 & -16711936)
                     + ((var22 & 0xFF00) * var24 + (var23 & 0xFF00) * var25 & 0xFF0000)
                  >> 8;
               var20 += var14;
               var21 -= var13;
            }

            var15 += var13;
            var16 += var14;
            var17 += Class_nc.e;
         }
      } catch (Exception var26) {
      }
   }

   private static final void b(
      int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12
   ) {
      int var13 = var3;

      for (int var14 = -var8; var14 < 0; var14++) {
         int var15 = (var4 >> 16) * var11;

         for (int var16 = -var7; var16 < 0; var16++) {
            int var17 = var1[(var3 >> 16) + var15];
            int var18 = var0[var5];
            int var19 = (var17 >>> 24) - (255 - var12);
            if (var19 < 0) {
               var19 = 0;
            }

            int var20 = 256 - var19;
            var0[var5++] = ((var17 & 16711935) * var19 + (var18 & 16711935) * var20 & -16711936)
                  + ((var17 & 0xFF00) * var19 + (var18 & 0xFF00) * var20 & 0xFF0000)
               >> 8;
            var3 += var9;
         }

         var4 += var10;
         var3 = var13;
         var5 += var6;
      }
   }

   private static final void b(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      for (int var10 = -var6; var10 < 0; var10++) {
         for (int var11 = -var5; var11 < 0; var11++) {
            int var12 = (var1[var3] >>> 24) - (255 - var9);
            if (var12 < 0) {
               var12 = 0;
            }

            int var13 = 256 - var12;
            int var14 = var1[var3++];
            int var15 = var0[var4];
            var0[var4++] = ((var14 & 16711935) * var12 + (var15 & 16711935) * var13 & -16711936)
                  + ((var14 & 0xFF00) * var12 + (var15 & 0xFF00) * var13 & 0xFF0000)
               >> 8;
         }

         var4 += var7;
         var3 += var8;
      }
   }

   final void a(int var1, int var2, int var3, int var4, int var5) {
      if (var3 > 0 && var4 > 0) {
         int var6 = super.Q;
         int var7 = super.S;
         int var8 = 0;
         int var9 = 0;
         int var10 = super.M;
         int var11 = super.U;
         int var12 = (var10 << 16) / var3;
         int var13 = (var11 << 16) / var4;
         if (super.W > 0) {
            int var14 = ((super.W << 16) + var12 - 1) / var12;
            var1 += var14;
            var8 += var14 * var12 - (super.W << 16);
         }

         if (super.K > 0) {
            int var17 = ((super.K << 16) + var13 - 1) / var13;
            var2 += var17;
            var9 += var17 * var13 - (super.K << 16);
         }

         if (var6 < var10) {
            var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         if (var7 < var11) {
            var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
         }

         int var18 = var1 + var2 * Class_nc.e;
         int var15 = Class_nc.e - var3;
         if (var2 + var4 > Class_nc.h) {
            var4 -= var2 + var4 - Class_nc.h;
         }

         if (var2 < Class_nc.g) {
            int var16 = Class_nc.g - var2;
            var4 -= var16;
            var18 += var16 * Class_nc.e;
            var9 += var13 * var16;
         }

         if (var1 + var3 > Class_nc.b) {
            int var19 = var1 + var3 - Class_nc.b;
            var3 -= var19;
            var15 += var19;
         }

         if (var1 < Class_nc.d) {
            int var20 = Class_nc.d - var1;
            var3 -= var20;
            var18 += var20;
            var8 += var12 * var20;
            var15 += var20;
         }

         b(Class_nc.f, super.I, 0, var8, var9, var18, var15, var3, var4, var12, var13, var6, var5);
      }
   }

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[] var9, int[] var10) {
      try {
         int var11 = -var3 / 2;
         int var12 = -var4 / 2;
         int var13 = (int)(Math.sin(var7 / 326.11) * 65536.0);
         int var14 = (int)(Math.cos(var7 / 326.11) * 65536.0);
         var13 = var13 * var8 >> 8;
         var14 = var14 * var8 >> 8;
         int var15 = (var5 << 16) + var12 * var13 + var11 * var14;
         int var16 = (var6 << 16) + (var12 * var14 - var11 * var13);
         int var17 = var1 + var2 * Class_nc.e;

         for (int var28 = 0; var28 < var4; var28++) {
            int var18 = var9[var28];
            int var19 = var17 + var18;
            int var20 = var15 + var14 * var18;
            int var21 = var16 - var13 * var18;

            for (int var27 = -var10[var28]; var27 < 0; var27++) {
               int var22 = super.I[(var20 >> 16) + (var21 >> 16) * super.Q];
               int var23 = Class_nc.f[var19];
               int var24 = var22 >>> 24;
               int var25 = 256 - var24;
               Class_nc.f[var19++] = ((var22 & 16711935) * var24 + (var23 & 16711935) * var25 & -16711936)
                     + ((var22 & 0xFF00) * var24 + (var23 & 0xFF00) * var25 & 0xFF0000)
                  >> 8;
               var20 += var14;
               var21 -= var13;
            }

            var15 += var13;
            var16 += var14;
            var17 += Class_nc.e;
         }
      } catch (Exception var26) {
      }
   }

   final void c(int var1, int var2) {
      var1 += super.W;
      var2 += super.K;
      int var3 = var1 + var2 * Class_nc.e;
      int var4 = 0;
      int var5 = super.S;
      int var6 = super.Q;
      int var7 = Class_nc.e - var6;
      int var8 = 0;
      if (var2 < Class_nc.g) {
         int var9 = Class_nc.g - var2;
         var5 -= var9;
         var2 = Class_nc.g;
         var4 += var9 * var6;
         var3 += var9 * Class_nc.e;
      }

      if (var2 + var5 > Class_nc.h) {
         var5 -= var2 + var5 - Class_nc.h;
      }

      if (var1 < Class_nc.d) {
         int var12 = Class_nc.d - var1;
         var6 -= var12;
         var1 = Class_nc.d;
         var4 += var12;
         var3 += var12;
         var8 += var12;
         var7 += var12;
      }

      if (var1 + var6 > Class_nc.b) {
         int var13 = var1 + var6 - Class_nc.b;
         var6 -= var13;
         var8 += var13;
         var7 += var13;
      }

      if (var6 > 0 && var5 > 0) {
         b(Class_nc.f, super.I, 0, var4, var3, var6, var5, var7, var8);
      }
   }

   Class_uj(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
      super(var1, var2, var3, var4, var5, var6, var7);
   }

   final void a(int var1, int var2, int var3) {
      var1 += super.W;
      var2 += super.K;
      int var4 = var1 + var2 * Class_nc.e;
      int var5 = 0;
      int var6 = super.S;
      int var7 = super.Q;
      int var8 = Class_nc.e - var7;
      int var9 = 0;
      if (var2 < Class_nc.g) {
         int var10 = Class_nc.g - var2;
         var6 -= var10;
         var2 = Class_nc.g;
         var5 += var10 * var7;
         var4 += var10 * Class_nc.e;
      }

      if (var2 + var6 > Class_nc.h) {
         var6 -= var2 + var6 - Class_nc.h;
      }

      if (var1 < Class_nc.d) {
         int var13 = Class_nc.d - var1;
         var7 -= var13;
         var1 = Class_nc.d;
         var5 += var13;
         var4 += var13;
         var9 += var13;
         var8 += var13;
      }

      if (var1 + var7 > Class_nc.b) {
         int var14 = var1 + var7 - Class_nc.b;
         var7 -= var14;
         var9 += var14;
         var8 += var14;
      }

      if (var7 > 0 && var6 > 0) {
         b(Class_nc.f, super.I, 0, var5, var4, var7, var6, var8, var9, var3);
      }
   }

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
      try {
         int var10 = -var3 / 2;
         int var11 = -var4 / 2;
         int var12 = (int)(Math.sin(var7) * 65536.0);
         int var13 = (int)(Math.cos(var7) * 65536.0);
         var12 = var12 * var9 >> 8;
         var13 = var13 * var9 >> 8;
         int var14 = (var5 << 16) + var11 * var12 + var10 * var13;
         int var15 = (var6 << 16) + (var11 * var13 - var10 * var12);
         int var16 = var1 + var2 * Class_nc.e;

         for (int var26 = 0; var26 < var4; var26++) {
            int var17 = var16;
            int var18 = var14;
            int var19 = var15;

            for (int var25 = -var3; var25 < 0; var25++) {
               int var20 = super.I[(var18 >> 16) + (var19 >> 16) * super.Q];
               int var21 = Class_nc.f[var17];
               int var22 = var20 >>> 24;
               int var23 = 256 - var22;
               Class_nc.f[var17++] = ((var20 & 16711935) * var22 + (var21 & 16711935) * var23 & -16711936)
                     + ((var20 & 0xFF00) * var22 + (var21 & 0xFF00) * var23 & 0xFF0000)
                  >> 8;
               var18 += var13;
               var19 -= var12;
            }

            var14 += var12;
            var15 += var13;
            var16 += Class_nc.e;
         }
      } catch (Exception var24) {
      }
   }
}
