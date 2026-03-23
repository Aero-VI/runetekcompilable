class Class_ni extends Class_jb {
   int[] I;

   final void a() {
      int[] var1 = new int[super.Q * super.S];
      int var2 = 0;

      for (int var3 = super.S - 1; var3 >= 0; var3--) {
         for (int var4 = 0; var4 < super.Q; var4++) {
            var1[var2++] = this.I[var4 + var3 * super.Q];
         }
      }

      this.I = var1;
      super.K = super.U - super.S - super.K;
   }

   void c(int var1, int var2) {
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
         a(Class_nc.f, this.I, 0, var4, var3, var6, var5, var7, var8);
      }
   }

   void d(int var1, int var2) {
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
         a(Class_nc.f, this.I, var4, var3, var6, var5, var7, var8);
      }
   }

   final void d(int var1) {
      int[] var2 = new int[super.Q * super.S];
      int var3 = 0;

      for (int var4 = 0; var4 < super.S; var4++) {
         for (int var5 = 0; var5 < super.Q; var5++) {
            int var6 = this.I[var3];
            if (var6 == 0) {
               if (var5 > 0 && this.I[var3 - 1] != 0) {
                  var6 = var1;
               } else if (var4 > 0 && this.I[var3 - super.Q] != 0) {
                  var6 = var1;
               } else if (var5 < super.Q - 1 && this.I[var3 + 1] != 0) {
                  var6 = var1;
               } else if (var4 < super.S - 1 && this.I[var3 + super.Q] != 0) {
                  var6 = var1;
               }
            }

            var2[var3++] = var6;
         }
      }

      this.I = var2;
   }

   void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[] var9, int[] var10) {
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

         for (int var25 = 0; var25 < var4; var25++) {
            int var18 = var9[var25];
            int var19 = var17 + var18;
            int var20 = var15 + var14 * var18;
            int var21 = var16 - var13 * var18;

            for (int var24 = -var10[var25]; var24 < 0; var24++) {
               int var22 = this.I[(var20 >> 16) + (var21 >> 16) * super.Q];
               if (var22 != 0) {
                  Class_nc.f[var19++] = var22;
               } else {
                  var19++;
               }

               var20 += var14;
               var21 -= var13;
            }

            var15 += var13;
            var16 += var14;
            var17 += Class_nc.e;
         }
      } catch (Exception var23) {
      }
   }

   void a(int var1, int var2, int var3, int var4, int var5, int var6) {
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
                     for (int var91 = var22; var91 < 0; var23 += Class_nc.e) {
                        int var99 = var23;
                        int var107 = var30;
                        int var115 = var31;
                        int var123 = var20;
                        if (var30 >= 0 && var31 >= 0 && var30 - (super.Q << 12) < 0 && var31 - (super.S << 12) < 0) {
                           for (; var123 < 0; var123++) {
                              int var131 = this.I[(var115 >> 12) * super.Q + (var107 >> 12)];
                              if (var131 != 0) {
                                 Class_nc.f[var99++] = var131;
                              } else {
                                 var99++;
                              }
                           }
                        }

                        var91++;
                     }
                  } else if (var26 < 0) {
                     for (int var90 = var22; var90 < 0; var23 += Class_nc.e) {
                        int var98 = var23;
                        int var106 = var30;
                        int var114 = var31 + (var28 * var26 >> 4);
                        int var122 = var20;
                        if (var30 >= 0 && var30 - (super.Q << 12) < 0) {
                           int var81;
                           if ((var81 = var114 - (super.S << 12)) >= 0) {
                              var81 = (var26 - var81) / var26;
                              var122 = var20 + var81;
                              var114 += var26 * var81;
                              var98 = var23 + var81;
                           }

                           if ((var81 = (var114 - var26) / var26) > var122) {
                              var122 = var81;
                           }

                           while (var122 < 0) {
                              int var130 = this.I[(var114 >> 12) * super.Q + (var106 >> 12)];
                              if (var130 != 0) {
                                 Class_nc.f[var98++] = var130;
                              } else {
                                 var98++;
                              }

                              var114 += var26;
                              var122++;
                           }
                        }

                        var90++;
                        var30 -= var26;
                     }
                  } else {
                     for (int var89 = var22; var89 < 0; var23 += Class_nc.e) {
                        int var97 = var23;
                        int var105 = var30;
                        int var113 = var31 + (var28 * var26 >> 4);
                        int var121 = var20;
                        if (var30 >= 0 && var30 - (super.Q << 12) < 0) {
                           if (var113 < 0) {
                              int var79 = (var26 - 1 - var113) / var26;
                              var121 = var20 + var79;
                              var113 += var26 * var79;
                              var97 = var23 + var79;
                           }

                           int var80;
                           if ((var80 = (1 + var113 - (super.S << 12) - var26) / var26) > var121) {
                              var121 = var80;
                           }

                           while (var121 < 0) {
                              int var129 = this.I[(var113 >> 12) * super.Q + (var105 >> 12)];
                              if (var129 != 0) {
                                 Class_nc.f[var97++] = var129;
                              } else {
                                 var97++;
                              }

                              var113 += var26;
                              var121++;
                           }
                        }

                        var89++;
                        var30 -= var26;
                     }
                  }
               } else if (var27 < 0) {
                  if (var26 == 0) {
                     for (int var88 = var22; var88 < 0; var23 += Class_nc.e) {
                        int var96 = var23;
                        int var104 = var30 + (var28 * var27 >> 4);
                        int var112 = var31;
                        int var120 = var20;
                        if (var31 >= 0 && var31 - (super.S << 12) < 0) {
                           int var76;
                           if ((var76 = var104 - (super.Q << 12)) >= 0) {
                              var76 = (var27 - var76) / var27;
                              var120 = var20 + var76;
                              var104 += var27 * var76;
                              var96 = var23 + var76;
                           }

                           if ((var76 = (var104 - var27) / var27) > var120) {
                              var120 = var76;
                           }

                           while (var120 < 0) {
                              int var128 = this.I[(var112 >> 12) * super.Q + (var104 >> 12)];
                              if (var128 != 0) {
                                 Class_nc.f[var96++] = var128;
                              } else {
                                 var96++;
                              }

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
                        int var70;
                        if ((var70 = var103 - (super.Q << 12)) >= 0) {
                           var70 = (var27 - var70) / var27;
                           var119 = var20 + var70;
                           var103 += var27 * var70;
                           var111 += var26 * var70;
                           var95 = var23 + var70;
                        }

                        if ((var70 = (var103 - var27) / var27) > var119) {
                           var119 = var70;
                        }

                        if ((var70 = var111 - (super.S << 12)) >= 0) {
                           var70 = (var26 - var70) / var26;
                           var119 += var70;
                           var103 += var27 * var70;
                           var111 += var26 * var70;
                           var95 += var70;
                        }

                        if ((var70 = (var111 - var26) / var26) > var119) {
                           var119 = var70;
                        }

                        while (var119 < 0) {
                           int var127 = this.I[(var111 >> 12) * super.Q + (var103 >> 12)];
                           if (var127 != 0) {
                              Class_nc.f[var95++] = var127;
                           } else {
                              var95++;
                           }

                           var103 += var27;
                           var111 += var26;
                           var119++;
                        }

                        var87++;
                        var30 -= var26;
                        var31 += var27;
                     }
                  } else {
                     for (int var86 = var22; var86 < 0; var23 += Class_nc.e) {
                        int var94 = var23;
                        int var102 = var30 + (var28 * var27 >> 4);
                        int var110 = var31 + (var28 * var26 >> 4);
                        int var118 = var20;
                        int var65;
                        if ((var65 = var102 - (super.Q << 12)) >= 0) {
                           var65 = (var27 - var65) / var27;
                           var118 = var20 + var65;
                           var102 += var27 * var65;
                           var110 += var26 * var65;
                           var94 = var23 + var65;
                        }

                        if ((var65 = (var102 - var27) / var27) > var118) {
                           var118 = var65;
                        }

                        if (var110 < 0) {
                           var65 = (var26 - 1 - var110) / var26;
                           var118 += var65;
                           var102 += var27 * var65;
                           var110 += var26 * var65;
                           var94 += var65;
                        }

                        if ((var65 = (1 + var110 - (super.S << 12) - var26) / var26) > var118) {
                           var118 = var65;
                        }

                        while (var118 < 0) {
                           int var126 = this.I[(var110 >> 12) * super.Q + (var102 >> 12)];
                           if (var126 != 0) {
                              Class_nc.f[var94++] = var126;
                           } else {
                              var94++;
                           }

                           var102 += var27;
                           var110 += var26;
                           var118++;
                        }

                        var86++;
                        var30 -= var26;
                        var31 += var27;
                     }
                  }
               } else if (var26 == 0) {
                  for (int var85 = var22; var85 < 0; var23 += Class_nc.e) {
                     int var93 = var23;
                     int var101 = var30 + (var28 * var27 >> 4);
                     int var109 = var31;
                     int var117 = var20;
                     if (var31 >= 0 && var31 - (super.S << 12) < 0) {
                        if (var101 < 0) {
                           int var63 = (var27 - 1 - var101) / var27;
                           var117 = var20 + var63;
                           var101 += var27 * var63;
                           var93 = var23 + var63;
                        }

                        int var64;
                        if ((var64 = (1 + var101 - (super.Q << 12) - var27) / var27) > var117) {
                           var117 = var64;
                        }

                        while (var117 < 0) {
                           int var125 = this.I[(var109 >> 12) * super.Q + (var101 >> 12)];
                           if (var125 != 0) {
                              Class_nc.f[var93++] = var125;
                           } else {
                              var93++;
                           }

                           var101 += var27;
                           var117++;
                        }
                     }

                     var85++;
                     var31 += var27;
                  }
               } else if (var26 < 0) {
                  for (int var84 = var22; var84 < 0; var23 += Class_nc.e) {
                     int var92 = var23;
                     int var100 = var30 + (var28 * var27 >> 4);
                     int var108 = var31 + (var28 * var26 >> 4);
                     int var116 = var20;
                     if (var100 < 0) {
                        int var58 = (var27 - 1 - var100) / var27;
                        var116 = var20 + var58;
                        var100 += var27 * var58;
                        var108 += var26 * var58;
                        var92 = var23 + var58;
                     }

                     int var59;
                     if ((var59 = (1 + var100 - (super.Q << 12) - var27) / var27) > var116) {
                        var116 = var59;
                     }

                     if ((var59 = var108 - (super.S << 12)) >= 0) {
                        var59 = (var26 - var59) / var26;
                        var116 += var59;
                        var100 += var27 * var59;
                        var108 += var26 * var59;
                        var92 += var59;
                     }

                     if ((var59 = (var108 - var26) / var26) > var116) {
                        var116 = var59;
                     }

                     while (var116 < 0) {
                        int var124 = this.I[(var108 >> 12) * super.Q + (var100 >> 12)];
                        if (var124 != 0) {
                           Class_nc.f[var92++] = var124;
                        } else {
                           var92++;
                        }

                        var100 += var27;
                        var108 += var26;
                        var116++;
                     }

                     var84++;
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

                     int var55;
                     if ((var55 = (1 + var35 - (super.Q << 12) - var27) / var27) > var37) {
                        var37 = var55;
                     }

                     if (var36 < 0) {
                        var55 = (var26 - 1 - var36) / var26;
                        var37 += var55;
                        var35 += var27 * var55;
                        var36 += var26 * var55;
                        var34 += var55;
                     }

                     if ((var55 = (1 + var36 - (super.S << 12) - var26) / var26) > var37) {
                        var37 = var55;
                     }

                     while (var37 < 0) {
                        int var38 = this.I[(var36 >> 12) * super.Q + (var35 >> 12)];
                        if (var38 != 0) {
                           Class_nc.f[var34++] = var38;
                        } else {
                           var34++;
                        }

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

   final void b() {
      int[] var1 = new int[super.Q * super.S];
      int var2 = 0;

      for (int var3 = 0; var3 < super.S; var3++) {
         for (int var4 = super.Q - 1; var4 >= 0; var4--) {
            var1[var2++] = this.I[var4 + var3 * super.Q];
         }
      }

      this.I = var1;
      super.W = super.M - super.Q - super.W;
   }

   void a(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
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

         for (int var23 = 0; var23 < var4; var23++) {
            int var17 = var16;
            int var18 = var14;
            int var19 = var15;

            for (int var22 = -var3; var22 < 0; var22++) {
               int var20 = this.I[(var18 >> 16) + (var19 >> 16) * super.Q];
               if (var20 != 0) {
                  Class_nc.f[var17++] = var20;
               } else {
                  var17++;
               }

               var18 += var13;
               var19 -= var12;
            }

            var14 += var12;
            var15 += var13;
            var16 += Class_nc.e;
         }
      } catch (Exception var21) {
      }
   }

   private static final void a(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for (int var10 = -var6; var10 < 0; var10++) {
         for (int var11 = var9; var11 < 0; var11++) {
            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               var4++;
            }

            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               var4++;
            }

            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               var4++;
            }

            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               var4++;
            }
         }

         for (int var12 = var5; var12 < 0; var12++) {
            var2 = var1[var3++];
            if (var2 != 0) {
               var0[var4++] = var2;
            } else {
               var4++;
            }
         }

         var4 += var7;
         var3 += var8;
      }
   }

   final void e(int var1) {
      for (int var2 = super.S - 1; var2 > 0; var2--) {
         int var3 = var2 * super.Q;

         for (int var4 = super.Q - 1; var4 > 0; var4--) {
            if (this.I[var4 + var3] == 0 && this.I[var4 + var3 - 1 - super.Q] != 0) {
               this.I[var4 + var3] = var1;
            }
         }
      }
   }

   private static final void a(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var3;

      for (int var13 = -var8; var13 < 0; var13++) {
         int var14 = (var4 >> 16) * var11;

         for (int var15 = -var7; var15 < 0; var15++) {
            var2 = var1[(var3 >> 16) + var14];
            if (var2 != 0) {
               var0[var5++] = var2;
            } else {
               var5++;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var12;
         var5 += var6;
      }
   }

   final void f(int var1) {
      if (super.Q != super.M || super.S != super.U) {
         int var2 = var1;
         if (var1 > super.W) {
            var2 = super.W;
         }

         int var3 = var1;
         if (var1 + super.W + super.Q > super.M) {
            var3 = super.M - super.W - super.Q;
         }

         int var4 = var1;
         if (var1 > super.K) {
            var4 = super.K;
         }

         int var5 = var1;
         if (var1 + super.K + super.S > super.U) {
            var5 = super.U - super.K - super.S;
         }

         int var6 = super.Q + var2 + var3;
         int var7 = super.S + var4 + var5;
         int[] var8 = new int[var6 * var7];

         for (int var9 = 0; var9 < super.S; var9++) {
            for (int var10 = 0; var10 < super.Q; var10++) {
               var8[(var9 + var4) * var6 + var10 + var2] = this.I[var9 * super.Q + var10];
            }
         }

         this.I = var8;
         super.Q = var6;
         super.S = var7;
         super.W -= var2;
         super.K -= var4;
      }
   }

   final void c() {
      Class_nc.a(this.I, super.Q, super.S);
   }

   void a(int var1, int var2, int var3, int var4, int var5) {
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

         a(Class_nc.f, this.I, 0, var8, var9, var18, var15, var3, var4, var12, var13, var6, var5);
      }
   }

   final void a(int var1, int var2, int[] var3, int[] var4) {
      if (Class_nc.h - Class_nc.g != var3.length) {
         throw new IllegalStateException();
      } else {
         var1 += super.W;
         var2 += super.K;
         int var5 = 0;
         int var6 = super.S;
         int var7 = super.Q;
         int var8 = Class_nc.e - var7;
         int var9 = 0;
         int var10 = var1 + var2 * Class_nc.e;
         if (var2 < Class_nc.g) {
            int var11 = Class_nc.g - var2;
            var6 -= var11;
            var2 = Class_nc.g;
            var5 += var11 * var7;
            var10 += var11 * Class_nc.e;
         }

         if (var2 + var6 > Class_nc.h) {
            var6 -= var2 + var6 - Class_nc.h;
         }

         if (var1 < Class_nc.d) {
            int var22 = Class_nc.d - var1;
            var7 -= var22;
            var1 = Class_nc.d;
            var5 += var22;
            var10 += var22;
            var9 += var22;
            var8 += var22;
         }

         if (var1 + var7 > Class_nc.b) {
            int var23 = var1 + var7 - Class_nc.b;
            var7 -= var23;
            var9 += var23;
            var8 += var23;
         }

         if (var7 > 0 && var6 > 0) {
            int var24 = var1 - Class_nc.d;
            int var12 = var2 - Class_nc.g;

            for (int var13 = var12; var13 < var12 + var6; var13++) {
               int var14 = var3[var13];
               int var15 = var4[var13];
               int var16 = var7;
               if (var24 > var14) {
                  int var17 = var24 - var14;
                  if (var17 >= var15) {
                     var5 += var7 + var9;
                     var10 += var7 + var8;
                     continue;
                  }

                  var15 -= var17;
               } else {
                  int var25 = var14 - var24;
                  if (var25 >= var7) {
                     var5 += var7 + var9;
                     var10 += var7 + var8;
                     continue;
                  }

                  var5 += var25;
                  var16 = var7 - var25;
                  var10 += var25;
               }

               int var26 = 0;
               if (var16 < var15) {
                  var15 = var16;
               } else {
                  var26 = var16 - var15;
               }

               for (int var18 = -var15; var18 < 0; var18++) {
                  int var19 = this.I[var5++];
                  if (var19 != 0) {
                     Class_nc.f[var10++] = var19;
                  } else {
                     var10++;
                  }
               }

               var5 += var26 + var9;
               var10 += var26 + var8;
            }
         }
      }
   }

   private static final void a(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for (int var8 = -var5; var8 < 0; var8++) {
         int var9;
         for (var9 = var3 + var4 - 3; var3 < var9; var0[var3++] = var1[var2++]) {
            var0[var3++] = var1[var2++];
            var0[var3++] = var1[var2++];
            var0[var3++] = var1[var2++];
         }

         var9 += 3;

         while (var3 < var9) {
            var0[var3++] = var1[var2++];
         }

         var3 += var6;
         var2 += var7;
      }
   }

   final void d() {
      if (super.Q != super.M || super.S != super.U) {
         int[] var1 = new int[super.M * super.U];

         for (int var2 = 0; var2 < super.S; var2++) {
            for (int var3 = 0; var3 < super.Q; var3++) {
               var1[(var2 + super.K) * super.M + var3 + super.W] = this.I[var2 * super.Q + var3];
            }
         }

         this.I = var1;
         super.Q = super.M;
         super.S = super.U;
         super.W = 0;
         super.K = 0;
      }
   }

   final void b(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.I.length; var4++) {
         int var5 = this.I[var4];
         if (var5 != 0) {
            int var6 = var5 >> 16 & 0xFF;
            var6 += var1;
            if (var6 < 1) {
               var6 = 1;
            } else if (var6 > 255) {
               var6 = 255;
            }

            int var7 = var5 >> 8 & 0xFF;
            var7 += var2;
            if (var7 < 1) {
               var7 = 1;
            } else if (var7 > 255) {
               var7 = 255;
            }

            int var8 = var5 & 0xFF;
            var8 += var3;
            if (var8 < 1) {
               var8 = 1;
            } else if (var8 > 255) {
               var8 = 255;
            }

            this.I[var4] = (var6 << 16) + (var7 << 8) + var8;
         }
      }
   }

   final void a(int var1, int var2, int var3, int var4) {
      if (var3 == 256) {
         this.c(var1, var2);
      } else {
         var1 += super.W;
         var2 += super.K;
         int var5 = var1 + var2 * Class_nc.e;
         int var6 = 0;
         int var7 = super.S;
         int var8 = super.Q;
         int var9 = Class_nc.e - var8;
         int var10 = 0;
         if (var2 < Class_nc.g) {
            int var11 = Class_nc.g - var2;
            var7 -= var11;
            var2 = Class_nc.g;
            var6 += var11 * var8;
            var5 += var11 * Class_nc.e;
         }

         if (var2 + var7 > Class_nc.h) {
            var7 -= var2 + var7 - Class_nc.h;
         }

         if (var1 < Class_nc.d) {
            int var14 = Class_nc.d - var1;
            var8 -= var14;
            var1 = Class_nc.d;
            var6 += var14;
            var5 += var14;
            var10 += var14;
            var9 += var14;
         }

         if (var1 + var8 > Class_nc.b) {
            int var15 = var1 + var8 - Class_nc.b;
            var8 -= var15;
            var10 += var15;
            var9 += var15;
         }

         if (var8 > 0 && var7 > 0) {
            a(Class_nc.f, this.I, 0, var6, var5, var8, var7, var9, var10, var3, var4);
         }
      }
   }

   private static final void a(
      int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12
   ) {
      int var13 = 256 - var12;
      int var14 = var3;

      for (int var15 = -var8; var15 < 0; var15++) {
         int var16 = (var4 >> 16) * var11;

         for (int var17 = -var7; var17 < 0; var17++) {
            var2 = var1[(var3 >> 16) + var16];
            if (var2 != 0) {
               int var18 = var0[var5];
               var0[var5++] = ((var2 & 16711935) * var12 + (var18 & 16711935) * var13 & -16711936)
                     + ((var2 & 0xFF00) * var12 + (var18 & 0xFF00) * var13 & 0xFF0000)
                  >> 8;
            } else {
               var5++;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var14;
         var5 += var6;
      }
   }

   void b(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[] var9, int[] var10) {
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

         for (int var24 = 0; var24 < var4; var24++) {
            int var18 = var9[var24];
            int var19 = var17 + var18;
            int var20 = var15 + var14 * var18;
            int var21 = var16 - var13 * var18;

            for (int var23 = -var10[var24]; var23 < 0; var23++) {
               Class_nc.f[var19++] = this.I[(var20 >> 16) + (var21 >> 16) * super.Q];
               var20 += var14;
               var21 -= var13;
            }

            var15 += var13;
            var16 += var14;
            var17 += Class_nc.e;
         }
      } catch (Exception var22) {
      }
   }

   private static final void a(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = 256 - var9;

      for (int var11 = -var6; var11 < 0; var11++) {
         for (int var12 = -var5; var12 < 0; var12++) {
            var2 = var1[var3++];
            if (var2 != 0) {
               int var13 = var0[var4];
               var0[var4++] = ((var2 & 16711935) * var9 + (var13 & 16711935) * var10 & -16711936)
                     + ((var2 & 0xFF00) * var9 + (var13 & 0xFF00) * var10 & 0xFF0000)
                  >> 8;
            } else {
               var4++;
            }
         }

         var4 += var7;
         var3 += var8;
      }
   }

   private static final void a(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      int var11 = 256 - var9;
      int var12 = (var10 & 16711935) * var11 & -16711936;
      int var13 = (var10 & 0xFF00) * var11 & 0xFF0000;
      var10 = (var12 | var13) >>> 8;

      for (int var14 = -var6; var14 < 0; var14++) {
         for (int var15 = -var5; var15 < 0; var15++) {
            var2 = var1[var3++];
            if (var2 != 0) {
               var12 = (var2 & 16711935) * var9 & -16711936;
               var13 = (var2 & 0xFF00) * var9 & 0xFF0000;
               var0[var4++] = ((var12 | var13) >>> 8) + var10;
            } else {
               var4++;
            }
         }

         var4 += var7;
         var3 += var8;
      }
   }

   void a(int var1, int var2, int var3) {
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
         a(Class_nc.f, this.I, 0, var5, var4, var7, var6, var8, var9, var3);
      }
   }

   Class_ni(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
      super.M = var1;
      super.U = var2;
      super.W = var3;
      super.K = var4;
      super.Q = var5;
      super.S = var6;
      this.I = var7;
   }

   final void b(int var1, int var2, int var3, int var4) {
      if (var3 > 0 && var4 > 0) {
         int var5 = super.Q;
         int var6 = super.S;
         int var7 = 0;
         int var8 = 0;
         int var9 = super.M;
         int var10 = super.U;
         int var11 = (var9 << 16) / var3;
         int var12 = (var10 << 16) / var4;
         if (super.W > 0) {
            int var13 = ((super.W << 16) + var11 - 1) / var11;
            var1 += var13;
            var7 += var13 * var11 - (super.W << 16);
         }

         if (super.K > 0) {
            int var16 = ((super.K << 16) + var12 - 1) / var12;
            var2 += var16;
            var8 += var16 * var12 - (super.K << 16);
         }

         if (var5 < var9) {
            var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
         }

         if (var6 < var10) {
            var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
         }

         int var17 = var1 + var2 * Class_nc.e;
         int var14 = Class_nc.e - var3;
         if (var2 + var4 > Class_nc.h) {
            var4 -= var2 + var4 - Class_nc.h;
         }

         if (var2 < Class_nc.g) {
            int var15 = Class_nc.g - var2;
            var4 -= var15;
            var17 += var15 * Class_nc.e;
            var8 += var12 * var15;
         }

         if (var1 + var3 > Class_nc.b) {
            int var18 = var1 + var3 - Class_nc.b;
            var3 -= var18;
            var14 += var18;
         }

         if (var1 < Class_nc.d) {
            int var19 = Class_nc.d - var1;
            var3 -= var19;
            var17 += var19;
            var7 += var11 * var19;
            var14 += var19;
         }

         a(Class_nc.f, this.I, 0, var7, var8, var17, var14, var3, var4, var11, var12, var5);
      }
   }

   Class_ni(int var1, int var2) {
      this.I = new int[var1 * var2];
      super.Q = super.M = var1;
      super.S = super.U = var2;
      super.W = super.K = 0;
   }
}
