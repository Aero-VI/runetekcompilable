import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

final class Class_wf {
   static int[] a = new int[2];
   static int b;
   private int[] c;
   private int[] d;
   static int e;
   static boolean f = false;
   private long g;
   static int h;
   static int i;
   static int j;
   static Class_jk k;
   static int l;
   static Class_cj m;
   static int n;
   static int o;
   static int p;
   boolean q;
   static int r;
   private long s;
   static int t;
   static int u;
   int v;

   static final Class_r a(long var0, int var2) {
      try {
         p++;
         int var3 = -20 % ((-16 - var2) / 36);
         return Class_wj.a(10, var0, 97, false);
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "wf.A(" + var0 + ',' + var2 + ')');
      }
   }

   final Class_jh a(int var1, Class_uc var2, int var3, int var4, byte var5) {
      try {
         h++;
         long var6 = var3 | (long)var3 << 1725838304 | var4 << -1329298704;
         if (var5 != -37) {
            a(37L, 25);
         }

         Class_jh var8 = (Class_jh)Class_rj.x.a(var5 + 14403, var6);
         if (var8 == null) {
            Class_ne[] var9 = new Class_ne[2];
            int var10 = 0;
            if (!Class_ij.a(var3, var5 + 40).c(var5 ^ 23683) || !Class_ij.a(var4, 3).c(var5 ^ 23683)) {
               return null;
            }

            Class_ne var11 = Class_ij.a(var3, var5 ^ -40).b(-74);
            if (var11 != null) {
               var9[var10++] = var11;
            }

            var11 = Class_ij.a(var4, 3).b(-123);
            if (var11 != null) {
               var9[var10++] = var11;
            }

            var11 = new Class_ne(var9, var10);

            for (int var12 = 0; ~var12 > -6; var12++) {
               if (Class_jd.g[var12].length > this.c[var12]) {
                  var11.b(Class_ui.g[var12], Class_jd.g[var12][this.c[var12]]);
               }

               if (~this.c[var12] > ~Class_pc.g[var12].length) {
                  var11.b(Class_va.X[var12], Class_pc.g[var12][this.c[var12]]);
               }
            }

            var8 = var11.c(64, 768, -50, -10, -50);
            Class_rj.x.a(var8, 99, var6);
         }

         if (var2 != null) {
            var8 = var2.a((byte)-98, var8, var1);
         }

         return var8;
      } catch (RuntimeException var13) {
         throw Class_sh.a(var13, "wf.D(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + var4 + ',' + var5 + ')');
      }
   }

   final void a(boolean var1, int var2) {
      try {
         this.q = var1;
         e++;
         int var3 = -19 / ((7 - var2) / 45);
         this.b(-1);
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "wf.F(" + var1 + ',' + var2 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final Class_jh a(int var1, Class_uc var2, int var3, Class_uc var4, byte var5) {
      int var24 = client.lb;

      try {
         j++;
         if (~this.v != 0) {
            return Class_i.c(this.v, 28).a(var3, var4, (byte)-119, var2, var1);
         } else {
            long var6 = this.g;
            int[] var8 = this.d;
            if (var5 <= 43) {
               m = null;
            }

            if (var2 != null && (~var2.p <= -1 || ~var2.b <= -1)) {
               var8 = new int[12];
               int var9 = 0;
               if (var24 != 0 || var9 < 12) {
                  do {
                     var8[var9] = this.d[var9];
                  } while (++var9 < 12);
               }

               label200:
               if (var2.p >= 0) {
                  if (~var2.p != -65536) {
                     var8[5] = Class_mb.a(1073741824, var2.p);
                     var6 ^= (long)var8[5] << 2032205984;
                     if (var24 == 0) {
                        break label200;
                     }
                  }

                  var6 ^= -4294967296L;
                  var8[5] = 0;
               }

               label195:
               if (~var2.b <= -1) {
                  if (~var2.b == -65536) {
                     var8[3] = 0;
                     var6 ^= 4294967295L;
                     if (var24 == 0) {
                        break label195;
                     }
                  }

                  var8[3] = Class_mb.a(1073741824, var2.b);
                  var6 ^= var8[3];
               }
            }

            Class_jh var26 = (Class_jh)Class_bc.T.a(14366, var6);
            if (var26 == null) {
               boolean var10 = false;
               int var11 = 0;
               if (var24 != 0 || ~var11 > -13) {
                  do {
                     int var12 = var8[var11];
                     if (~(1073741824 & var12) != -1) {
                        if (Class_ra.a(-25672, 1073741823 & var12).a(this.q, -116)) {
                           var11++;
                           continue;
                        }

                        var10 = true;
                        if (var24 == 0) {
                           var11++;
                           continue;
                        }
                     }

                     if ((var12 & -2147483648) != 0 && !Class_ij.a(var12 & 1073741823, 3).a((byte)-118)) {
                        var10 = true;
                     }

                     var11++;
                  } while (~var11 > -13);
               }

               if (var10) {
                  if (this.s != -1L) {
                     var26 = (Class_jh)Class_bc.T.a(14366, this.s);
                  }

                  if (var26 == null) {
                     return null;
                  }
               }

               if (var26 == null) {
                  Class_ne[] var28 = new Class_ne[12];
                  int var13 = 0;
                  int var14 = 0;
                  if (var24 != 0 || ~var14 > -13) {
                     do {
                        int var15 = var8[var14];
                        if ((1073741824 & var15) == 0) {
                           if (~(var15 & -2147483648) != -1) {
                              Class_ne var16 = Class_ij.a(1073741823 & var15, 3).a(false);
                              if (var16 != null) {
                                 var28[var13++] = var16;
                                 if (var24 != 0) {
                                    var16 = Class_ra.a(-25672, 1073741823 & var15).b(this.q, (byte)118);
                                    if (var16 != null) {
                                       var28[var13++] = var16;
                                    }

                                    var14++;
                                 } else {
                                    var14++;
                                 }
                              } else {
                                 var14++;
                              }
                           } else {
                              var14++;
                           }
                        } else {
                           Class_ne var31 = Class_ra.a(-25672, 1073741823 & var15).b(this.q, (byte)118);
                           if (var31 != null) {
                              var28[var13++] = var31;
                           }

                           var14++;
                        }
                     } while (~var14 > -13);
                  }

                  int var29 = var8[0];
                  if ((var29 & 1073741824) != 0) {
                     Class_cf var32 = Class_ra.a(-25672, 1073741823 & var29);
                     if (var32.e != null) {
                        int var17 = 0;
                        if (var24 != 0 || ~var32.e.length < ~var17) {
                           do {
                              if (var32.e[var17] != null) {
                                 if (var28[var17 - -1] == null && var24 == 0) {
                                    var17++;
                                 } else {
                                    int var18 = var32.e[var17][0];
                                    int var19 = var32.e[var17][1];
                                    int var20 = var32.e[var17][2];
                                    int var21 = var32.e[var17][3];
                                    int var22 = var32.e[var17][4];
                                    int var23 = var32.e[var17][5];
                                    var28[1 + var17].c(var18, var19, var20);
                                    var28[var17 - -1].b(var21, var22, var23);
                                    var17++;
                                 }
                              } else {
                                 var17++;
                              }
                           } while (~var32.e.length < ~var17);
                        }
                     }
                  }

                  Class_ne var33 = new Class_ne(var28, var13);
                  int var34 = 0;
                  if (var24 != 0 || ~var34 > -6) {
                     do {
                        if (this.c[var34] < Class_jd.g[var34].length) {
                           var33.b(Class_ui.g[var34], Class_jd.g[var34][this.c[var34]]);
                        }

                        if (this.c[var34] < Class_pc.g[var34].length) {
                           var33.b(Class_va.X[var34], Class_pc.g[var34][this.c[var34]]);
                        }
                     } while (~(++var34) > -6);
                  }

                  var26 = var33.c(64, 850, -30, -50, -30);
                  Class_bc.T.a(var26, 102, var6);
                  this.s = var6;
               }
            }

            if (var2 == null && var4 == null) {
               return var26;
            } else {
               if (var2 != null && var4 != null) {
                  Class_jh var27 = var2.a(var26, var4, var3, (byte)-79, var1);
                  if (var24 == 0) {
                     return var27;
                  }
               }

               if (var2 == null) {
                  Class_jh var37 = var4.a(var3, true, var26);
                  if (var24 == 0) {
                     return var37;
                  }
               }

               return var2.a(var1, true, var26);
            }
         }
      } catch (RuntimeException var25) {
         throw Class_sh.a(
            var25, "wf.E(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ',' + var5 + ')'
         );
      }
   }

   final void a(int var1, int var2, int var3) {
      try {
         if (var2 == 41) {
            this.c[var1] = var3;
            this.b(-1);
            b++;
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "wf.L(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   public static void a(int var0) {
      try {
         k = null;
         a = null;
         if (var0 <= 56) {
            m = null;
         }

         m = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "wf.B(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final Class_jh a(int var1, Class_uc var2, int var3) {
      int var12 = client.lb;

      try {
         if (var3 != -13) {
            return null;
         } else {
            o++;
            if (~this.v != 0) {
               return Class_i.c(this.v, -111).a(var2, (byte)12, var1);
            } else {
               Class_jh var4 = (Class_jh)Class_rj.x.a(14366, this.g);
               if (var4 == null) {
                  boolean var5 = false;
                  int var6 = 0;
                  if (var12 != 0 || ~var6 > -13) {
                     do {
                        int var7 = this.d[var6];
                        if ((1073741824 & var7) == 0) {
                           if ((var7 & -2147483648) != 0) {
                              if (!Class_ij.a(1073741823 & var7, 3).c(var3 ^ 23723)) {
                                 var5 = true;
                                 if (var12 != 0) {
                                    if (!Class_ra.a(-25672, var7 & 1073741823).a(this.q, (byte)75)) {
                                       var5 = true;
                                    }

                                    var6++;
                                 } else {
                                    var6++;
                                 }
                              } else {
                                 var6++;
                              }
                           } else {
                              var6++;
                           }
                        } else {
                           if (!Class_ra.a(-25672, var7 & 1073741823).a(this.q, (byte)75)) {
                              var5 = true;
                           }

                           var6++;
                        }
                     } while (~var6 > -13);
                  }

                  if (var5) {
                     return null;
                  }

                  Class_ne[] var14 = new Class_ne[12];
                  int var8 = 0;
                  int var9 = 0;
                  if (var12 != 0 || ~var9 > -13) {
                     do {
                        int var10 = this.d[var9];
                        if ((1073741824 & var10) != 0) {
                           Class_ne var11 = Class_ra.a(-25672, 1073741823 & var10).a(-31779, this.q);
                           if (var11 == null) {
                              var9++;
                              continue;
                           }

                           var14[var8++] = var11;
                           if (var12 == 0) {
                              var9++;
                              continue;
                           }
                        }

                        if ((-2147483648 & var10) != 0) {
                           Class_ne var16 = Class_ij.a(1073741823 & var10, var3 ^ -16).b(-50);
                           if (var16 != null) {
                              var14[var8++] = var16;
                           }
                        }

                        var9++;
                     } while (~var9 > -13);
                  }

                  Class_ne var15 = new Class_ne(var14, var8);
                  int var17 = 0;
                  if (var12 != 0 || ~var17 > -6) {
                     do {
                        if (this.c[var17] < Class_jd.g[var17].length) {
                           var15.b(Class_ui.g[var17], Class_jd.g[var17][this.c[var17]]);
                        }

                        if (this.c[var17] < Class_pc.g[var17].length) {
                           var15.b(Class_va.X[var17], Class_pc.g[var17][this.c[var17]]);
                        }
                     } while (~(++var17) > -6);
                  }

                  var4 = var15.c(64, 768, -50, -10, -50);
                  Class_rj.x.a(var4, 127, this.g);
               }

               if (var2 != null) {
                  var4 = var2.a((byte)-64, var4, var1);
               }

               return var4;
            }
         }
      } catch (RuntimeException var13) {
         throw Class_sh.a(var13, "wf.G(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
      }
   }

   final void b(int var1, int var2, int var3) {
      try {
         t++;
         int var4 = Class_he.p[var1];
         if (var3 != -27345) {
            this.a(false);
         }

         if (~this.d[var4] != -1) {
            if (Class_ij.a(var2, 3) != null) {
               this.d[var4] = Class_mb.a(var2, -2147483648);
               this.b(-1);
            }
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "wf.H(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   final void a(int[] var1, int[] var2, boolean var3, byte var4, int var5) {
      try {
         if (var2 == null) {
            var2 = new int[12];

            for (int var6 = 0; var6 < 7; var6++) {
               for (int var7 = 0; ~var7 > ~Class_uh.d; var7++) {
                  Class_tc var8 = Class_ij.a(var7, 3);
                  if (var8 != null && !var8.b && ~var8.s == ~((!var3 ? 0 : 7) + var6)) {
                     var2[Class_he.p[var6]] = Class_mb.a(-2147483648, var7);
                     break;
                  }
               }
            }
         }

         this.v = var5;
         r++;
         this.c = var1;
         this.q = var3;
         this.d = var2;
         this.b(-1);
         if (var4 >= -125) {
            this.a(121, null, -17, 99, (byte)-74);
         }
      } catch (RuntimeException var9) {
         throw Class_sh.a(
            var9, "wf.K(" + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + var4 + ',' + var5 + ')'
         );
      }
   }

   final int a(boolean var1) {
      try {
         if (!var1) {
            this.a(false, -75);
         }

         u++;
         return this.v != -1
            ? Class_i.c(this.v, -97).ab + 305419896
            : this.d[1]
               + (this.d[11] << 954016229)
               + (this.d[0] << 907413679)
               + (this.c[4] << 363057108)
               + ((this.c[0] << 1973786873) - -(this.d[8] << 1034909194));
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "wf.C(" + var1 + 41);
      }
   }

   private final void b(int var1) {
      try {
         i++;
         long var2 = this.g;
         long[] var4 = Class_ud.d;
         this.g = -1L;
         if (var1 != -1) {
            a(-7L, 114);
         }

         for (int var5 = 0; ~var5 > -13; var5++) {
            this.g = this.g >>> -1286536056 ^ var4[(int)(255L & (this.g ^ this.d[var5] >> 1998943416))];
            this.g = this.g >>> 1024523528 ^ var4[(int)((this.g ^ this.d[var5] >> 1308934576) & 255L)];
            this.g = this.g >>> 369068232 ^ var4[(int)((this.d[var5] >> 1550174440 ^ this.g) & 255L)];
            this.g = var4[(int)((this.d[var5] ^ this.g) & 255L)] ^ this.g >>> -672521208;
         }

         for (int var6 = 0; ~var6 > -6; var6++) {
            this.g = var4[(int)(255L & (this.g ^ this.c[var6]))] ^ this.g >>> -23528504;
         }

         this.g = this.g >>> -1369850616 ^ var4[(int)(((!this.q ? 0 : 1) ^ this.g) & 255L)];
         if (~var2 != -1L && ~this.g != ~var2) {
            Class_bc.T.a((byte)28, var2);
         }
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "wf.I(" + var1 + ')');
      }
   }

   static final String a(Throwable var0, int var1) throws IOException {
      int var13 = client.lb;

      try {
         String var2;
         label36: {
            n++;
            if (!(var0 instanceof Class_ua)) {
               var2 = "";
               if (var13 == 0) {
                  break label36;
               }
            }

            Class_ua var3 = (Class_ua)var0;
            var0 = var3.r;
            var2 = var3.j + " | ";
         }

         StringWriter var16 = new StringWriter();
         PrintWriter var4 = new PrintWriter(var16);
         var0.printStackTrace(var4);
         var4.close();
         String var5 = var16.toString();
         BufferedReader var6 = new BufferedReader(new StringReader(var5));
         String var7 = var6.readLine();

         while (true) {
            String var8 = var6.readLine();
            if (var8 == null) {
               break;
            }

            int var9 = var8.indexOf(40);
            int var10 = var8.indexOf(41, var9 + 1);
            if (var9 >= 0 && ~var10 <= -1) {
               String var11 = var8.substring(var9 - -1, var10);
               int var12 = var11.indexOf(".java:");
               if (~var12 <= -1) {
                  var11 = var11.substring(0, var12) + var11.substring(var12 + 5);
                  var2 = var2 + var11 + ' ';
                  if (var13 == 0) {
                     continue;
                  }
               }

               var8 = var8.substring(0, var9);
            }

            var8 = var8.trim();
            var8 = var8.substring(var8.lastIndexOf(32) - -1);
            var8 = var8.substring(var8.lastIndexOf(9) + 1);
            var2 = var2 + var8 + ' ';
            if (var13 != 0) {
               break;
            }
         }

         var2 = var2 + "| " + var7;
         int var20 = -123 / ((9 - var1) / 32);
         return var2;
      } catch (RuntimeException var14) {
         throw var14;
      }
   }

   public Class_wf() {
   }
}
