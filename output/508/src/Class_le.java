final class Class_le extends Class_li {
   byte[] p;
   Class_tg q;

   static final Class_le a(Class_cj var0, int var1, int var2) {
      byte[] var3 = var0.a(var2, 0, var1);
      return var3 == null ? null : new Class_le(new Class_lh(var3));
   }

   private Class_le(Class_lh var1) {
      var1.p = var1.E.length - 3;
      int var2 = var1.n(-6677);
      int var3 = var1.k(1355769544);
      int var4 = 14 + var2 * 10;
      var1.p = 0;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;

      for (int var13 = 0; var13 < var2; var13++) {
         int var14 = -1;

         while (true) {
            int var15 = var1.n(-6677);
            if (var15 != var14) {
               var4++;
            }

            var14 = var15 & 15;
            if (var15 == 7) {
               break;
            }

            if (var15 == 23) {
               var5++;
            } else if (var14 == 0) {
               var7++;
            } else if (var14 == 1) {
               var8++;
            } else if (var14 == 2) {
               var6++;
            } else if (var14 == 3) {
               var9++;
            } else if (var14 == 4) {
               var10++;
            } else if (var14 == 5) {
               var11++;
            } else {
               if (var14 != 6) {
                  throw new RuntimeException();
               }

               var12++;
            }
         }
      }

      var4 += 5 * var5;
      var4 += 2 * (var7 + var8 + var6 + var9 + var11);
      var4 += var10 + var12;
      int var74 = var1.p;
      int var75 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;

      for (int var16 = 0; var16 < var75; var16++) {
         var1.b(true);
      }

      var4 += var1.p - var74;
      int var17 = var1.p;
      int var18 = 0;
      int var19 = 0;
      int var20 = 0;
      int var21 = 0;
      int var22 = 0;
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      int var26 = 0;
      int var27 = 0;
      int var28 = 0;
      int var29 = 0;
      int var30 = 0;

      for (int var31 = 0; var31 < var6; var31++) {
         var30 = var30 + var1.n(-6677) & 127;
         if (var30 == 0 || var30 == 32) {
            var12++;
         } else if (var30 == 1) {
            var18++;
         } else if (var30 == 33) {
            var19++;
         } else if (var30 == 7) {
            var20++;
         } else if (var30 == 39) {
            var21++;
         } else if (var30 == 10) {
            var22++;
         } else if (var30 == 42) {
            var23++;
         } else if (var30 == 99) {
            var24++;
         } else if (var30 == 98) {
            var25++;
         } else if (var30 == 101) {
            var26++;
         } else if (var30 == 100) {
            var27++;
         } else if (var30 != 64 && var30 != 65 && var30 != 120 && var30 != 121 && var30 != 123) {
            var29++;
         } else {
            var28++;
         }
      }

      int var32 = 0;
      int var33 = var1.p;
      var1.p += var28;
      int var34 = var1.p;
      var1.p += var11;
      int var35 = var1.p;
      var1.p += var10;
      int var36 = var1.p;
      var1.p += var9;
      int var37 = var1.p;
      var1.p += var18;
      int var38 = var1.p;
      var1.p += var20;
      int var39 = var1.p;
      var1.p += var22;
      int var40 = var1.p;
      var1.p += var7 + var8 + var11;
      int var41 = var1.p;
      var1.p += var7;
      int var42 = var1.p;
      var1.p += var29;
      int var43 = var1.p;
      var1.p += var8;
      int var44 = var1.p;
      var1.p += var19;
      int var45 = var1.p;
      var1.p += var21;
      int var46 = var1.p;
      var1.p += var23;
      int var47 = var1.p;
      var1.p += var12;
      int var48 = var1.p;
      var1.p += var9;
      int var49 = var1.p;
      var1.p += var24;
      int var50 = var1.p;
      var1.p += var25;
      int var51 = var1.p;
      var1.p += var26;
      int var52 = var1.p;
      var1.p += var27;
      int var53 = var1.p;
      var1.p += var5 * 3;
      this.p = new byte[var4];
      Class_lh var54 = new Class_lh(this.p);
      var54.g(544537784, 1297377380);
      var54.g(544537784, 6);
      var54.a(false, var2 > 1 ? 1 : 0);
      var54.a(false, var2);
      var54.a(false, var3);
      var1.p = var74;
      int var55 = 0;
      byte var56 = 0;
      byte var57 = 0;
      byte var58 = 0;
      int var59 = 0;
      byte var60 = 0;
      byte var61 = 0;
      int[] var62 = new int[128];
      var30 = 0;

      for (int var63 = 0; var63 < var2; var63++) {
         var54.g(544537784, 1297379947);
         var54.p += 4;
         int var64 = var54.p;
         int var65 = -1;

         while (true) {
            int var66 = var1.b(true);
            var54.f(var66, 9684);
            int var67 = var1.E[var32++] & 255;
            boolean var68 = var67 != var65;
            var65 = var67 & 15;
            if (var67 == 7) {
               if (var68) {
                  var54.b(32, 255);
               }

               var54.b(32, 47);
               var54.b(32, 0);
               var54.i(var54.p - var64, -114);
               break;
            }

            if (var67 == 23) {
               if (var68) {
                  var54.b(32, 255);
               }

               var54.b(32, 81);
               var54.b(32, 3);
               var54.b(32, var1.E[var53++]);
               var54.b(32, var1.E[var53++]);
               var54.b(32, var1.E[var53++]);
            } else {
               var55 ^= var67 >> 4;
               if (var65 == 0) {
                  if (var68) {
                     var54.b(32, 144 + var55);
                  }

                  var56 += var1.E[var40++];
                  var57 += var1.E[var41++];
                  var54.b(32, var56 & 127);
                  var54.b(32, var57 & 127);
               } else if (var65 == 1) {
                  if (var68) {
                     var54.b(32, 128 + var55);
                  }

                  var56 += var1.E[var40++];
                  var58 += var1.E[var43++];
                  var54.b(32, var56 & 127);
                  var54.b(32, var58 & 127);
               } else if (var65 == 2) {
                  if (var68) {
                     var54.b(32, 176 + var55);
                  }

                  var30 = var30 + var1.E[var17++] & 127;
                  var54.b(32, var30);
                  byte var69;
                  if (var30 == 0 || var30 == 32) {
                     var69 = var1.E[var47++];
                  } else if (var30 == 1) {
                     var69 = var1.E[var37++];
                  } else if (var30 == 33) {
                     var69 = var1.E[var44++];
                  } else if (var30 == 7) {
                     var69 = var1.E[var38++];
                  } else if (var30 == 39) {
                     var69 = var1.E[var45++];
                  } else if (var30 == 10) {
                     var69 = var1.E[var39++];
                  } else if (var30 == 42) {
                     var69 = var1.E[var46++];
                  } else if (var30 == 99) {
                     var69 = var1.E[var49++];
                  } else if (var30 == 98) {
                     var69 = var1.E[var50++];
                  } else if (var30 == 101) {
                     var69 = var1.E[var51++];
                  } else if (var30 == 100) {
                     var69 = var1.E[var52++];
                  } else if (var30 != 64 && var30 != 65 && var30 != 120 && var30 != 121 && var30 != 123) {
                     var69 = var1.E[var42++];
                  } else {
                     var69 = var1.E[var33++];
                  }

                  var69 += var62[var30];
                  var62[var30] = var69;
                  var54.b(32, var69 & 127);
               } else if (var65 == 3) {
                  if (var68) {
                     var54.b(32, 224 + var55);
                  }

                  int var79 = var59 + var1.E[var48++];
                  var59 = var79 + (var1.E[var36++] << 7);
                  var54.b(32, var59 & 127);
                  var54.b(32, var59 >> 7 & 127);
               } else if (var65 == 4) {
                  if (var68) {
                     var54.b(32, 208 + var55);
                  }

                  var60 += var1.E[var35++];
                  var54.b(32, var60 & 127);
               } else if (var65 == 5) {
                  if (var68) {
                     var54.b(32, 160 + var55);
                  }

                  var56 += var1.E[var40++];
                  var61 += var1.E[var34++];
                  var54.b(32, var56 & 127);
                  var54.b(32, var61 & 127);
               } else {
                  if (var65 != 6) {
                     throw new RuntimeException();
                  }

                  if (var68) {
                     var54.b(32, 192 + var55);
                  }

                  var54.b(32, var1.E[var47++]);
               }
            }
         }
      }
   }

   final void a() {
      this.q = null;
   }

   final void b() {
      if (this.q == null) {
         this.q = new Class_tg(16);
         int[] var1 = new int[16];
         int[] var2 = new int[16];
         var1[9] = var2[9] = 128;
         Class_bd var3 = new Class_bd(this.p);
         int var4 = var3.c();

         for (int var5 = 0; var5 < var4; var5++) {
            var3.a(var5);
            var3.c(var5);
            var3.e(var5);
         }

         while (true) {
            int var6 = var3.b();
            int var7 = var3.d[var6];

            while (var3.d[var6] == var7) {
               var3.a(var6);
               int var8 = var3.f(var6);
               if (var8 == 1) {
                  var3.f();
                  var3.e(var6);
                  if (var3.g()) {
                     return;
                  }
                  break;
               }

               int var9 = var8 & 240;
               if (var9 == 176) {
                  int var10 = var8 & 15;
                  int var11 = var8 >> 8 & 127;
                  int var12 = var8 >> 16 & 127;
                  if (var11 == 0) {
                     var1[var10] = (var1[var10] & -2080769) + (var12 << 14);
                  }

                  if (var11 == 32) {
                     var1[var10] = (var1[var10] & -16257) + (var12 << 7);
                  }
               }

               if (var9 == 192) {
                  int var15 = var8 & 15;
                  int var17 = var8 >> 8 & 127;
                  var2[var15] = var1[var15] + var17;
               }

               if (var9 == 144) {
                  int var16 = var8 & 15;
                  int var18 = var8 >> 8 & 127;
                  int var19 = var8 >> 16 & 127;
                  if (var19 > 0) {
                     int var13 = var2[var16];
                     Class_md var14 = (Class_md)this.q.a(var13, 75);
                     if (var14 == null) {
                        var14 = new Class_md(new byte[128]);
                        this.q.a((byte)-19, var14, var13);
                     }

                     var14.p[var18] = 1;
                  }
               }

               var3.c(var6);
               var3.e(var6);
            }
         }
      }
   }
}
