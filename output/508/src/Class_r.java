import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

final class Class_r implements Class_nh {
   static Class nb;
   static Class_qb a;
   static boolean b = true;
   static int c;
   static int d;
   private boolean e = true;
   static int f;
   static int g;
   byte[] h;
   private static Class_r i = Class_tc.a(43, "Loading wordpack )2 ");
   static int j;
   static int k;
   static int l;
   static int m;
   static int n;
   static int o;
   static int p;
   static int q;
   static int r;
   static boolean s = false;
   static int t;
   static int u;
   static int v;
   static int w;
   static int x;
   static int y;
   static int z;
   static int A;
   static int B;
   static int C;
   static int D;
   static int E;
   static int F;
   int G;
   static int H;
   static int I;
   static int J;
   static Class_r K = Class_tc.a(43, "scape main");
   static int L;
   static int M;
   static int N;
   static int O;
   static int P;
   static int Q;
   static int R;
   static Class_r S = Class_tc.a(43, "<)4col>");
   static int T;
   static int U;
   private int V;
   static int W;
   static int X;
   static int Y;
   static int Z;
   static int ab;
   static int bb;
   static int cb;
   static int db;
   static Class_r eb = i;
   static int fb;
   static int gb;
   static int hb;
   static int ib;
   static int jb;
   static int kb;
   static int lb;
   static int mb;

   final Class_r a(int var1, int var2, int var3, Class_r var4) {
      try {
         l++;
         if (!this.e) {
            throw new IllegalArgumentException();
         } else if (~var1 <= -1 && ~var1 >= ~var2 && var2 <= var4.G) {
            this.V = 0;
            if (this.G - (-var2 - -var1) > this.h.length) {
               byte var5 = 1;

               while (this.G + var4.G > var5) {
                  var5 += var5;
               }

               byte[] var6 = new byte[var5];
               Class_gb.a(this.h, 0, var6, 0, this.G);
               this.h = var6;
            }

            Class_gb.a(var4.h, var1, this.h, this.G, var2 + -var1);
            this.G += -var1 + var2;
            if (var3 != -10000) {
               this.b(-123);
            }

            return this;
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "r.M(" + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final boolean a(Class_r var1, boolean var2) {
      int var5 = client.lb;

      try {
         A++;
         if (var1.G > this.G) {
            return false;
         } else {
            int var3 = this.G + -var1.G;
            int var4 = 0;
            if (var5 == 0 && var1.G <= var4) {
               if (!var2) {
                  this.d(60, -108);
               }

               return true;
            } else {
               while (this.h[var4 - -var3] == var1.h[var4]) {
                  if (var1.G <= ++var4) {
                     if (!var2) {
                        this.d(60, -108);
                     }

                     return true;
                  }
               }

               return false;
            }
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "r.A(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
      }
   }

   final URL a(int var1) throws MalformedURLException {
      try {
         if (var1 != -16294) {
            this.e(37);
         }

         Y++;
         return new URL(new String(this.h, 0, this.G));
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "r.TA(" + var1 + ')');
      }
   }

   final byte[] a(byte var1) {
      try {
         if (var1 >= -75) {
            return null;
         } else {
            byte[] var2 = new byte[this.G];
            Class_gb.a(this.h, 0, var2, 0, this.G);
            c++;
            return var2;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "r.UA(" + var1 + ')');
      }
   }

   final Class_r a(byte var1, int var2) {
      try {
         f++;
         if (var2 > 0 && var2 <= 255) {
            if (var1 <= 85) {
               S = null;
            }

            Class_r var3 = new Class_r();
            var3.h = new byte[this.G + 1];
            var3.G = this.G + 1;
            Class_gb.a(this.h, 0, var3.h, 0, this.G);
            var3.h[this.G] = (byte)var2;
            return var3;
         } else {
            throw new IllegalArgumentException("invalid char");
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "r.U(" + var1 + ',' + var2 + ')');
      }
   }

   final void b(byte var1) {
      try {
         String var2;
         try {
            var2 = new String(this.h, 0, this.G, "ISO-8859-1");
         } catch (UnsupportedEncodingException var3) {
            var2 = new String(this.h, 0, this.G);
         }

         System.out.println(var2);
         j++;
         if (var1 != 112) {
            this.b(-51, null);
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "r.I(" + var1 + ')');
      }
   }

   final int a(int var1, int var2) {
      try {
         p++;
         if (var2 != 7178) {
            S = null;
         }

         return this.h[var1] & 0xFF;
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "r.S(" + var1 + 44 + var2 + 41);
      }
   }

   public static void c(byte var0) {
      try {
         S = null;
         eb = null;
         a = null;
         i = null;
         K = null;
         if (var0 > -107) {
            b = true;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "r.VA(" + var0 + ')');
      }
   }

   final long b(int var1) {
      try {
         long var2 = 0L;

         for (int var4 = 0; var4 < this.G; var4++) {
            var2 = -var2 + (var2 << 718411205) + (255 & this.h[var4]);
         }

         int var5 = -68 % ((37 - var1) / 45);
         d++;
         return var2;
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "r.K(" + var1 + ')');
      }
   }

   private final boolean a(int var1, boolean var2) {
      try {
         H++;
         boolean var3 = false;
         boolean var4 = var2;
         int var5 = 0;
         if (~var1 > -2 || var1 > 36) {
            var1 = 10;
         }

         for (int var6 = 0; ~var6 > ~this.G; var6++) {
            int var7 = 255 & this.h[var6];
            if (~var6 == -1) {
               if (var7 == 45) {
                  var3 = true;
                  continue;
               }

               if (~var7 == -44) {
                  continue;
               }
            }

            if (~var7 <= -49 && ~var7 >= -58) {
               var7 -= 48;
            } else if (var7 >= 65 && var7 <= 90) {
               var7 -= 55;
            } else {
               if (var7 < 97 || ~var7 < -123) {
                  return false;
               }

               var7 -= 87;
            }

            if (var1 <= var7) {
               return false;
            }

            if (var3) {
               var7 = -var7;
            }

            int var8 = var5 * var1 + var7;
            if (var8 / var1 != var5) {
               return false;
            }

            var5 = var8;
            var4 = true;
         }

         return var4;
      } catch (RuntimeException var9) {
         throw Class_sh.a(var9, "r.BB(" + var1 + ',' + var2 + ')');
      }
   }

   final URL a(URL var1, int var2) throws MalformedURLException {
      try {
         D++;
         if (var2 != 4) {
            this.d(122, 19);
         }

         return new URL(var1, new String(this.h, 0, this.G));
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "r.SA(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
      }
   }

   final void a(int var1, int var2, Graphics var3, int var4) {
      try {
         String var5;
         try {
            var5 = new String(this.h, 0, this.G, "ISO-8859-1");
            int var6 = 84 / ((57 - var4) / 63);
         } catch (UnsupportedEncodingException var7) {
            var5 = new String(this.h, 0, this.G);
         }

         var3.drawString(var5, var1, var2);
         o++;
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "r.JA(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ',' + var4 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int a(int var1, int var2, int var3) {
      int var6 = client.lb;

      try {
         Q++;
         if (var2 != -1) {
            return 21;
         } else {
            byte var4 = (byte)var1;
            int var5 = var3;
            if (var6 == 0 && ~var3 <= ~this.G) {
               return -1;
            } else {
               while (~this.h[var5] != ~var4) {
                  if (~(++var5) <= ~this.G) {
                     return -1;
                  }
               }

               return var5;
            }
         }
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "r.EA(" + var1 + 44 + var2 + 44 + var3 + 41);
      }
   }

   final Class_r a(boolean var1) {
      try {
         gb++;
         if (!var1) {
            this.e = true;
         }

         int var2 = 0;
         int var3 = this.G;

         while (var2 < this.G && (~this.h[var2] <= -1 && ~this.h[var2] >= -33 || ~(this.h[var2] & 255) == -161)) {
            var2++;
         }

         while (var2 < var3 && (this.h[-1 + var3] >= 0 && this.h[var3 - 1] <= 32 || (255 & this.h[-1 + var3]) == 160)) {
            var3--;
         }

         if (~var2 == -1 && this.G == var3) {
            return this;
         } else {
            Class_r var4 = new Class_r();
            var4.G = var3 - var2;
            var4.h = new byte[var4.G];

            for (int var5 = 0; var4.G > var5; var5++) {
               var4.h[var5] = this.h[var2 + var5];
            }

            return var4;
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "r.DA(" + var1 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int a(byte var1, Class_r var2, int var3) {
      int var17 = client.lb;

      try {
         int[] var4 = new int[var2.G];
         int[] var5 = new int[256];
         T++;
         int[] var6 = new int[var2.G];
         int var7 = 0;
         if (var17 != 0) {
            var5[var7] = var2.G;
            var7++;
         }

         while (~var7 > ~var5.length) {
            var5[var7] = var2.G;
            var7++;
         }

         int var8 = 1;
         if (var17 != 0 || ~var2.G <= ~var8) {
            do {
               var4[-1 + var8] = (var2.G << -516904319) - var8;
               var5[Class_ui.a(var2.h[-1 + var8], 255)] = var2.G - var8;
            } while (~var2.G <= ~(++var8));
         }

         int var9 = 1 + var2.G;
         int var10 = var2.G;
         if (var17 != 0) {
            var6[-1 + var10] = var9;
            if (var17 != 0) {
               if (~var4[-1 + var9] <= ~(-var10 + var2.G)) {
                  var4[var9 - 1] = var2.G + -var10;
               }

               var9 = var6[-1 + var9];
            }
         } else {
            if (~var10 >= -1) {
               int var21 = var9;
               var9 = -var9 + 1 + var2.G;
               int var23 = 1;
               int var25 = 0;
               int var26 = 1;
               if (var17 != 0 || var9 >= var26) {
                  label219:
                  do {
                     var6[-1 + var26] = var25;
                     if (var17 != 0) {
                        var25 = var6[-1 + var25];
                     }

                     while (var25 >= 1) {
                        if (~var2.h[var26 - 1] == ~var2.h[var25 + -1]) {
                           var25++;
                           var26++;
                           continue label219;
                        }

                        var25 = var6[-1 + var25];
                     }

                     var25++;
                     var26++;
                  } while (var9 >= var26);
               }

               int var29;
               if (var17 != 0) {
                  var29 = var23;
                  if (var17 != 0) {
                     if (var4[var23 - 1] >= -var23 + var9 + var2.G) {
                        var4[var23 - 1] = -var23 + var9 + var2.G;
                     }

                     var29 = var23 + 1;
                  }
               } else {
                  if (var9 >= var2.G) {
                     if (var1 != 43) {
                        return -2;
                     }

                     var29 = -1 + var2.G + var3;
                     int var34;
                     if (var17 != 0) {
                        var34 = -1 + var2.G;
                        if (var17 != 0) {
                           var29--;
                           var34--;
                        }
                     } else {
                        if (~var29 <= ~this.G) {
                           return -1;
                        }

                        var34 = -1 + var2.G;
                        if (var17 != 0) {
                           var29--;
                           var34--;
                        }
                     }

                     while (true) {
                        while (var34 < 0 || ~this.h[var29] != ~var2.h[var34]) {
                           if (~var34 == 0) {
                              return var29 + 1;
                           }

                           var29 += Math.max(var5[255 & this.h[var29]], var4[var34]);
                           if (~var29 <= ~this.G) {
                              return -1;
                           }

                           var34 = -1 + var2.G;
                           if (var17 != 0) {
                              var29--;
                              var34--;
                           }
                        }

                        var29--;
                        var34--;
                     }
                  }

                  var29 = var23;
                  if (var17 != 0) {
                     if (var4[var23 - 1] >= -var23 + var9 + var2.G) {
                        var4[var23 - 1] = -var23 + var9 + var2.G;
                     }

                     var29 = var23 + 1;
                  }
               }

               while (true) {
                  for (; var21 >= var29; var29++) {
                     if (var4[var29 - 1] >= -var29 + var21 + var2.G) {
                        var4[var29 - 1] = -var29 + var21 + var2.G;
                     }
                  }

                  var23 = var21 + 1;
                  var21 = var9 + var21 + -var6[var9 + -1];
                  var9 = var6[var9 + -1];
                  if (var21 >= var2.G) {
                     if (var1 != 43) {
                        return -2;
                     }

                     var29 = -1 + var2.G + var3;
                     int var33;
                     if (var17 != 0) {
                        var33 = -1 + var2.G;
                        if (var17 != 0) {
                           var29--;
                           var33--;
                        }
                     } else {
                        if (~var29 <= ~this.G) {
                           return -1;
                        }

                        var33 = -1 + var2.G;
                        if (var17 != 0) {
                           var29--;
                           var33--;
                        }
                     }

                     while (true) {
                        while (var33 < 0 || ~this.h[var29] != ~var2.h[var33]) {
                           if (~var33 == 0) {
                              return var29 + 1;
                           }

                           var29 += Math.max(var5[255 & this.h[var29]], var4[var33]);
                           if (~var29 <= ~this.G) {
                              return -1;
                           }

                           var33 = -1 + var2.G;
                           if (var17 != 0) {
                              var29--;
                              var33--;
                           }
                        }

                        var29--;
                        var33--;
                     }
                  }

                  var29 = var23;
                  if (var17 != 0) {
                     if (var4[var23 - 1] >= -var23 + var21 + var2.G) {
                        var4[var23 - 1] = -var23 + var21 + var2.G;
                     }

                     var29 = var23 + 1;
                  }
               }
            }

            var6[-1 + var10] = var9;
            if (var17 != 0) {
               if (~var4[-1 + var9] <= ~(-var10 + var2.G)) {
                  var4[var9 - 1] = var2.G + -var10;
               }

               var9 = var6[-1 + var9];
            }
         }

         while (true) {
            if (~var9 >= ~var2.G) {
               if (var2.h[var10 - 1] != var2.h[var9 - 1]) {
                  if (~var4[-1 + var9] <= ~(-var10 + var2.G)) {
                     var4[var9 - 1] = var2.G + -var10;
                  }

                  var9 = var6[-1 + var9];
                  continue;
               }

               var10--;
               var9--;
            } else {
               var10--;
               var9--;
            }

            if (~var10 >= -1) {
               int var11 = var9;
               var9 = -var9 + 1 + var2.G;
               int var12 = 1;
               int var13 = 0;
               int var14 = 1;
               if (var17 != 0 || var9 >= var14) {
                  label108:
                  do {
                     var6[-1 + var14] = var13;
                     if (var17 != 0) {
                        var13 = var6[-1 + var13];
                     }

                     while (var13 >= 1) {
                        if (~var2.h[var14 - 1] == ~var2.h[var13 + -1]) {
                           var13++;
                           var14++;
                           continue label108;
                        }

                        var13 = var6[-1 + var13];
                     }

                     var13++;
                     var14++;
                  } while (var9 >= var14);
               }

               int var15;
               if (var17 != 0) {
                  var15 = var12;
                  if (var17 != 0) {
                     if (var4[var12 - 1] >= -var12 + var9 + var2.G) {
                        var4[var12 - 1] = -var12 + var9 + var2.G;
                     }

                     var15 = var12 + 1;
                  }
               } else {
                  if (var9 >= var2.G) {
                     if (var1 != 43) {
                        return -2;
                     }

                     var15 = -1 + var2.G + var3;
                     int var32;
                     if (var17 != 0) {
                        var32 = -1 + var2.G;
                        if (var17 != 0) {
                           var15--;
                           var32--;
                        }
                     } else {
                        if (~var15 <= ~this.G) {
                           return -1;
                        }

                        var32 = -1 + var2.G;
                        if (var17 != 0) {
                           var15--;
                           var32--;
                        }
                     }

                     while (true) {
                        while (var32 < 0 || ~this.h[var15] != ~var2.h[var32]) {
                           if (~var32 == 0) {
                              return var15 + 1;
                           }

                           var15 += Math.max(var5[255 & this.h[var15]], var4[var32]);
                           if (~var15 <= ~this.G) {
                              return -1;
                           }

                           var32 = -1 + var2.G;
                           if (var17 != 0) {
                              var15--;
                              var32--;
                           }
                        }

                        var15--;
                        var32--;
                     }
                  }

                  var15 = var12;
                  if (var17 != 0) {
                     if (var4[var12 - 1] >= -var12 + var9 + var2.G) {
                        var4[var12 - 1] = -var12 + var9 + var2.G;
                     }

                     var15 = var12 + 1;
                  }
               }

               while (true) {
                  for (; var11 >= var15; var15++) {
                     if (var4[var15 - 1] >= -var15 + var11 + var2.G) {
                        var4[var15 - 1] = -var15 + var11 + var2.G;
                     }
                  }

                  var12 = var11 + 1;
                  var11 = var9 + var11 + -var6[var9 + -1];
                  var9 = var6[var9 + -1];
                  if (var11 >= var2.G) {
                     if (var1 != 43) {
                        return -2;
                     }

                     var15 = -1 + var2.G + var3;
                     int var16;
                     if (var17 != 0) {
                        var16 = -1 + var2.G;
                        if (var17 != 0) {
                           var15--;
                           var16--;
                        }
                     } else {
                        if (~var15 <= ~this.G) {
                           return -1;
                        }

                        var16 = -1 + var2.G;
                        if (var17 != 0) {
                           var15--;
                           var16--;
                        }
                     }

                     while (true) {
                        while (var16 < 0 || ~this.h[var15] != ~var2.h[var16]) {
                           if (~var16 == 0) {
                              return var15 + 1;
                           }

                           var15 += Math.max(var5[255 & this.h[var15]], var4[var16]);
                           if (~var15 <= ~this.G) {
                              return -1;
                           }

                           var16 = -1 + var2.G;
                           if (var17 != 0) {
                              var15--;
                              var16--;
                           }
                        }

                        var15--;
                        var16--;
                     }
                  }

                  var15 = var12;
                  if (var17 != 0) {
                     if (var4[var12 - 1] >= -var12 + var11 + var2.G) {
                        var4[var12 - 1] = -var12 + var11 + var2.G;
                     }

                     var15 = var12 + 1;
                  }
               }
            }

            var6[-1 + var10] = var9;
            if (var17 != 0) {
               if (~var4[-1 + var9] <= ~(-var10 + var2.G)) {
                  var4[var9 - 1] = var2.G + -var10;
               }

               var9 = var6[-1 + var9];
            }
         }
      } catch (RuntimeException var18) {
         throw Class_sh.a(var18, "r.AA(" + var1 + 44 + (var2 != null ? "{...}" : "null") + 44 + var3 + 41);
      }
   }

   final Class_r b(boolean var1) {
      try {
         Z++;
         if (!this.e) {
            throw new IllegalArgumentException();
         } else {
            this.V = 0;
            if (!var1) {
               i = null;
            }

            if (this.h.length != this.G) {
               byte[] var2 = new byte[this.G];
               Class_gb.a(this.h, 0, var2, 0, this.G);
               this.h = var2;
            }

            return this;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "r.F(" + var1 + ')');
      }
   }

   final Class_r b(int var1, int var2) {
      try {
         if (var2 != 26011) {
            this.d((byte)62);
         }

         C++;
         if (var1 <= 0 || var1 > 255) {
            throw new IllegalArgumentException("invalid char:" + var1);
         } else if (!this.e) {
            throw new IllegalArgumentException();
         } else {
            this.V = 0;
            if (this.h.length == this.G) {
               byte var3 = 1;

               while (this.G >= var3) {
                  var3 += var3;
               }

               byte[] var4 = new byte[var3];
               Class_gb.a(this.h, 0, var4, 0, this.G);
               this.h = var4;
            }

            this.h[this.G++] = (byte)var1;
            return this;
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "r.G(" + var1 + ',' + var2 + ')');
      }
   }

   final boolean a(Class_r var1, int var2) {
      try {
         if (var2 < 25) {
            this.a(37, false);
         }

         F++;
         if (this.G < var1.G) {
            return false;
         } else {
            for (int var3 = 0; ~var3 > ~var1.G; var3++) {
               if (var1.h[var3] != this.h[var3]) {
                  return false;
               }
            }

            return true;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "r.O(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
      }
   }

   final int d(byte var1) {
      try {
         U++;
         if (var1 >= -95) {
            this.a((byte)0, -29);
         }

         return this.G;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "r.AB(" + var1 + 41);
      }
   }

   final int a(byte var1, FontMetrics var2) {
      try {
         N++;

         String var3;
         try {
            var3 = new String(this.h, 0, this.G, "ISO-8859-1");
            if (var1 < 85) {
               this.g((byte)-127);
            }
         } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.h, 0, this.G);
         }

         return var2.stringWidth(var3);
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "r.N(" + var1 + 44 + (var2 != null ? "{...}" : "null") + 41);
      }
   }

   final int b(byte var1, int var2) {
      try {
         db++;
         int var3 = 12 % ((-48 - var1) / 63);
         return this.a(var2, -1, 0);
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "r.CB(" + var1 + 44 + var2 + 41);
      }
   }

   final boolean a(Class_r var1, byte var2) {
      try {
         u++;
         if (var1 == null) {
            return false;
         } else {
            if (var2 <= 89) {
               c((byte)-22);
            }

            if (var1.G != this.G) {
               return false;
            } else {
               if (!this.e || !var1.e) {
                  if (this.V == 0) {
                     this.V = this.e(5745);
                     if (this.V == 0) {
                        this.V = 1;
                     }
                  }

                  if (var1.V == 0) {
                     var1.V = var1.e(5745);
                     if (var1.V == 0) {
                        var1.V = 1;
                     }
                  }

                  if (~var1.V != ~this.V) {
                     return false;
                  }
               }

               for (int var3 = 0; ~var3 > ~this.G; var3++) {
                  if (~this.h[var3] != ~var1.h[var3]) {
                     return false;
                  }
               }

               return true;
            }
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "r.L(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
      }
   }

   final void a(int var1, byte var2) {
      try {
         q++;
         this.V = 0;
         if (!this.e) {
            throw new IllegalArgumentException();
         } else if (~var1 > -1) {
            throw new IllegalArgumentException();
         } else {
            if (~var1 < ~this.h.length) {
               byte var3 = 1;

               while (~var1 < ~var3) {
                  var3 += var3;
               }

               byte[] var4 = new byte[var3];
               Class_gb.a(this.h, 0, var4, 0, this.G);
               this.h = var4;
            }

            if (var2 > -13) {
               this.a(true, null);
            }

            for (int var6 = this.G; ~var6 > ~var1; var6++) {
               this.h[var6] = 32;
            }

            this.G = var1;
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "r.D(" + var1 + ',' + var2 + ')');
      }
   }

   final int a(int var1, Class_r var2) {
      try {
         int var3 = 97 / ((-11 - var1) / 44);
         X++;
         return this.a((byte)43, var2, 0);
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "r.B(" + var1 + 44 + (var2 != null ? "{...}" : "null") + 41);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int c(int var1, int var2) {
      int var6 = client.lb;

      try {
         t++;
         if (var2 < 39) {
            this.b(false, null);
         }

         byte var3 = (byte)var1;
         int var4 = 0;
         int var5 = 0;
         if (var6 != 0) {
            if (var3 == this.h[var5]) {
               var4++;
            }

            var5++;
         }

         for (; ~this.G < ~var5; var5++) {
            if (var3 == this.h[var5]) {
               var4++;
            }
         }

         return var4;
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "r.Q(" + var1 + 44 + var2 + 41);
      }
   }

   final Class_r c(int var1) {
      try {
         Class_r var2 = new Class_r();
         J++;
         boolean var3 = true;
         var2.G = this.G;
         var2.h = new byte[this.G];
         if (var1 != 12688) {
            b = true;
         }

         for (int var4 = 0; ~this.G < ~var4; var4++) {
            byte var5 = this.h[var4];
            if (~var5 == -96) {
               var2.h[var4] = 32;
               var3 = true;
            } else if (~var5 <= -98 && ~var5 >= -123 && var3) {
               var2.h[var4] = (byte)(var5 + -32);
               var3 = false;
            } else {
               var3 = false;
               var2.h[var4] = var5;
            }
         }

         return var2;
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "r.KA(" + var1 + ')');
      }
   }

   public final int hashCode() {
      try {
         k++;
         return this.e(5745);
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "r.hashCode(" + 41);
      }
   }

   static final Class_dj a(int var0, Class_lh var1) {
      try {
         if (var0 != -20084) {
            eb = null;
         }

         O++;
         return new Class_dj(var1.p(var0 + -2405), var1.p(var0 + -2405), var1.p(-22489), var1.p(-22489), var1.b((byte)-58), var1.b((byte)-124), var1.n(-6677));
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "r.PA(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   final void a(byte var1, Applet var2) throws Throwable {
      try {
         w++;
         String var3 = new String(this.h, 0, this.G);
         Class_dk.a(var3, 4149, var2);
         int var4 = 25 % ((var1 - 47) / 45);
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "r.FA(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
      }
   }

   final boolean a(boolean var1, Class_r var2) {
      try {
         if (var1) {
            return true;
         } else {
            R++;
            if (var2 == null) {
               return false;
            } else if (~var2.G != ~this.G) {
               return false;
            } else {
               for (int var3 = 0; ~this.G < ~var3; var3++) {
                  byte var4 = this.h[var3];
                  if (~var4 <= -66 && var4 <= 90 || ~var4 <= 63 && var4 <= -34 && ~var4 != 40) {
                     var4 = (byte)(var4 + 32);
                  }

                  byte var5 = var2.h[var3];
                  if (~var5 <= -66 && var5 <= 90 || ~var5 <= 63 && ~var5 >= 33 && var5 != -41) {
                     var5 = (byte)(var5 + 32);
                  }

                  if (~var5 != ~var4) {
                     return false;
                  }
               }

               return true;
            }
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "r.MA(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int a(byte var1, Class_r var2) {
      int var11 = client.lb;

      try {
         int var3 = 0;
         fb++;
         int var4 = 0;
         int var6 = var2.G;
         if (var1 != -39) {
            return 4;
         } else {
            int var5 = this.G;
            int var7 = this.G;
            int var8 = var2.G;
            int var9 = 0;
            int var10 = 0;
            if (var11 != 0 || var5 != 0 && var6 != 0) {
               do {
                  label133: {
                     if (var3 == 156 || var3 == 230) {
                        var3 = 101;
                        if (var11 == 0) {
                           break label133;
                        }
                     }

                     if (~var3 == -141 || ~var3 == -199) {
                        var3 = 69;
                        if (var11 == 0) {
                           break label133;
                        }
                     }

                     if (var3 == 223) {
                        var3 = 115;
                        if (var11 == 0) {
                           break label133;
                        }
                     }

                     var3 = this.h[var9] & 255;
                     var9++;
                  }

                  if (Class_je.a(140, var3)) {
                     var7++;
                     if (var11 != 0) {
                        var5--;
                     }
                  } else {
                     var5--;
                  }

                  if (~var4 != -157) {
                     label111:
                     if (var4 != 230) {
                        if (var4 == 140 || var4 == 198) {
                           var4 = 69;
                           if (var11 == 0) {
                              break label111;
                           }
                        }

                        if (var4 != 223) {
                           var4 = var2.h[var10] & 255;
                           var10++;
                           if (var11 == 0) {
                              break label111;
                           }
                        }

                        var4 = 115;
                        if (var11 != 0) {
                           var4 = 101;
                        }
                     } else {
                        var4 = 101;
                     }
                  } else {
                     var4 = 101;
                  }

                  if (!Class_je.a(140, var4)) {
                     var6--;
                     if (var11 != 0) {
                        var8++;
                     }
                  } else {
                     var8++;
                  }

                  if (~Class_va.W[var4] < ~Class_va.W[var3]) {
                     return -1;
                  }

                  if (Class_va.W[var3] > Class_va.W[var4]) {
                     return 1;
                  }
               } while (var5 != 0 && var6 != 0);
            }

            if (var7 < var8) {
               return -1;
            } else {
               return ~var8 > ~var7 ? 1 : 0;
            }
         }
      } catch (RuntimeException var12) {
         throw Class_sh.a(var12, "r.W(" + var1 + 44 + (var2 != null ? "{...}" : "null") + 41);
      }
   }

   final Class_r d(int var1) {
      try {
         y++;
         int var2 = 103 % ((-6 - var1) / 62);
         Class_r var3 = Class_jd.a(this.f(10908), -1);
         return var3 == null ? Class_jk.E : var3;
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "r.P(" + var1 + ')');
      }
   }

   final int e(int var1) {
      try {
         if (var1 != 5745) {
            this.a(9, (byte)-46, 113);
         }

         g++;
         int var2 = 0;

         for (int var3 = 0; var3 < this.G; var3++) {
            var2 = (this.h[var3] & 255) + (var2 << -1325077051) + -var2;
         }

         return var2;
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "r.E(" + var1 + 41);
      }
   }

   final Object a(Applet var1, byte var2) throws Throwable {
      try {
         if (var2 != -123) {
            b = true;
         }

         String var3 = new String(this.h, 0, this.G);
         n++;
         Object var4 = Class_dk.a(var3, var1, null, var2 + -584);
         if (var4 instanceof String) {
            byte[] var5 = ((String)var4).getBytes();
            var4 = Class_pi.a(var5.length, var5, var2 ^ -75, 0);
         }

         return var4;
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "r.WA(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
      }
   }

   final int d(int var1, int var2) {
      try {
         P++;
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         if (var1 < 1 || ~var1 < -37) {
            var1 = 10;
         }

         for (int var6 = 0; ~var6 > ~this.G; var6++) {
            int var7 = 255 & this.h[var6];
            if (var6 == 0) {
               if (~var7 == -46) {
                  var3 = true;
                  continue;
               }

               if (~var7 == -44) {
                  continue;
               }
            }

            if (var7 >= 48 && var7 <= 57) {
               var7 -= 48;
            } else if (~var7 <= -66 && var7 <= 90) {
               var7 -= 55;
            } else {
               if (~var7 > -98 || var7 > 122) {
                  throw new NumberFormatException();
               }

               var7 -= 87;
            }

            if (var7 >= var1) {
               throw new NumberFormatException();
            }

            if (var3) {
               var7 = -var7;
            }

            int var8 = var5 * var1 - -var7;
            if (var5 != var8 / var1) {
               throw new NumberFormatException();
            }

            var5 = var8;
            var4 = true;
         }

         if (!var4) {
            throw new NumberFormatException();
         } else {
            if (var2 <= 41) {
               a = null;
            }

            return var5;
         }
      } catch (RuntimeException var9) {
         throw Class_sh.a(var9, "r.CA(" + var1 + 44 + var2 + 41);
      }
   }

   final byte[] e(byte var1) {
      try {
         v++;
         if (~this.G == -1) {
            return new byte[0];
         } else {
            int var3;
            label24: {
               int var2 = this.G + 3 & -4;
               int var4 = -56 / ((var1 - -53) / 54);
               var3 = 3 * (var2 / 4);
               if (~(var2 + -2) > ~this.G && Class_ci.a(this.h[-2 + var2], -109) != -1) {
                  if (~this.G < ~(var2 - 1) && Class_ci.a(this.h[-1 + var2], 37) != -1) {
                     break label24;
                  }

                  var3--;
                  if (client.lb == 0) {
                     break label24;
                  }
               }

               var3 -= 2;
            }

            byte[] var5 = new byte[var3];
            this.a(var5, -64, 0);
            return var5;
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "r.QA(" + var1 + ')');
      }
   }

   final Class_r a(int var1, byte var2, int var3) {
      try {
         M++;
         Class_r var4 = new Class_r();
         var4.G = -var1 + var3;
         if (var2 != -74) {
            this.h = null;
         }

         var4.h = new byte[-var1 + var3];
         Class_gb.a(this.h, var1, var4.h, 0, var4.G);
         return var4;
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "r.J(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   public final boolean equals(Object var1) {
      try {
         bb++;
         if (var1 instanceof Class_r) {
            return this.a((Class_r)var1, (byte)122);
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "r.equals(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   final Class_r f(byte var1) {
      try {
         Class_r var2 = new Class_r();
         m++;
         var2.G = this.G;
         var2.h = new byte[this.G];
         int var4 = 93 % ((-26 - var1) / 54);

         for (int var3 = 0; ~this.G < ~var3; var3++) {
            byte var5 = this.h[var3];
            if (~var5 <= -66 && ~var5 >= -91 || ~var5 <= 63 && var5 <= -34 && var5 != -41) {
               var5 = (byte)(var5 + 32);
            }

            var2.h[var3] = var5;
         }

         return var2;
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "r.T(" + var1 + ')');
      }
   }

   public final String toString() {
      try {
         jb++;
         throw new RuntimeException();
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "r.toString(" + ')');
      }
   }

   final long f(int var1) {
      try {
         if (var1 != 10908) {
            this.a((byte)-51);
         }

         mb++;
         long var2 = 0L;

         for (int var4 = 0; ~var4 > ~this.G && ~var4 > -13; var4++) {
            byte var5 = this.h[var4];
            var2 *= 37L;
            if (~var5 <= -66 && ~var5 >= -91) {
               var2 += -65 + 1 + var5;
            } else if (~var5 <= -98 && ~var5 >= -123) {
               var2 += 1 - -var5 + -97;
            } else if (var5 >= 48 && var5 <= 57) {
               var2 += var5 + 27 + -48;
            }
         }

         while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
         }

         return var2;
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "r.R(" + var1 + ')');
      }
   }

   final Class_r b(Applet var1, byte var2) {
      try {
         r++;
         String var3 = new String(this.h, 0, this.G);
         if (var2 != -31) {
            this.e((byte)-109);
         }

         String var4 = var1.getParameter(var3);
         return var4 == null ? null : Class_d.a(25732, var4);
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "r.NA(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
      }
   }

   final int a(int var1, int var2, int var3, int var4, byte[] var5) {
      try {
         ab++;
         Class_gb.a(this.h, var4, var5, var1, var3 + -var4);
         if (var2 != 255) {
            this.e(-96);
         }

         return -var4 + var3;
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "r.EB(" + var1 + 44 + var2 + 44 + var3 + 44 + var4 + 44 + (var5 != null ? "{...}" : "null") + 41);
      }
   }

   static final byte[] a(byte[] var0, boolean var1) {
      try {
         x++;
         if (!var1) {
            return null;
         } else {
            Class_lh var2 = new Class_lh(var0);
            int var3 = var2.n(-6677);
            int var4 = var2.h(-5528);
            if (var4 >= 0 && (~Class_i.nb == -1 || var4 <= Class_i.nb)) {
               if (~var3 == -1) {
                  byte[] var8 = new byte[var4];
                  var2.a(0, 0, var4, var8);
                  return var8;
               } else {
                  int var5 = var2.h(-5528);
                  if (var5 >= 0 && (~Class_i.nb == -1 || Class_i.nb >= var5)) {
                     byte[] var6 = new byte[var5];
                     if (var3 == 1) {
                        Class_mf.a(var6, var5, var0, var4, 9);
                     } else {
                        Class_te.cb.a(var2, 115, var6);
                     }

                     return var6;
                  } else {
                     throw new RuntimeException();
                  }
               }
            } else {
               throw new RuntimeException();
            }
         }
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "r.H(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private final int a(byte[] var1, int var2, int var3) {
      int var10 = client.lb;

      try {
         int var4 = var3;
         E++;
         byte var5 = 0;
         if (var2 >= -2) {
            a = null;
            if (var10 == 0 && var5 >= this.G) {
               return -var3 + var3;
            }
         } else if (var5 >= this.G) {
            return -var3 + var3;
         }

         do {
            int var6 = Class_ci.a(this.h[var5], 101);
            int var7 = ~this.G >= ~(1 + var5) ? -1 : Class_ci.a(this.h[1 + var5], 27);
            int var8 = ~(var5 + 2) <= ~this.G ? -1 : Class_ci.a(this.h[2 + var5], 90);
            int var9 = ~this.G < ~(3 + var5) ? Class_ci.a(this.h[3 + var5], 37) : -1;
            var1[var3++] = (byte)Class_mb.a(var6 << 1324180066, var7 >>> 1558649252);
            if (~var8 == 0 && var10 == 0) {
               break;
            }

            var1[var3++] = (byte)Class_mb.a(Class_ui.a(var7, 15) << -1724734620, var8 >>> 1372711714);
            if (~var9 == 0) {
               break;
            }

            var1[var3++] = (byte)Class_mb.a(Class_ui.a(192, var8 << -64861882), var9);
            var5 += 4;
         } while (var5 < this.G);

         return -var4 + var3;
      } catch (RuntimeException var11) {
         throw Class_sh.a(var11, "r.OA(" + (var1 != null ? "{...}" : "null") + 44 + var2 + 44 + var3 + 41);
      }
   }

   final int b(boolean var1, Class_r var2) {
      int var5 = client.lb;

      try {
         int var3;
         label47: {
            I++;
            if (this.G <= var2.G) {
               var3 = this.G;
               if (var5 == 0) {
                  break label47;
               }
            }

            var3 = var2.G;
         }

         int var4 = 0;
         if (var1) {
            return 115;
         } else {
            while (var3 > var4) {
               if (~(var2.h[var4] & 255) < ~(255 & this.h[var4])) {
                  return -1;
               }

               if ((var2.h[var4] & 255) < (255 & this.h[var4])) {
                  return 1;
               }

               var4++;
            }

            if (var2.G > this.G) {
               return -1;
            } else {
               return this.G > var2.G ? 1 : 0;
            }
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "r.LA(" + var1 + 44 + (var2 != null ? "{...}" : "null") + 41);
      }
   }

   final Class_r b(int var1, boolean var2) {
      try {
         if (!var2) {
            return null;
         } else {
            z++;
            return this.a(var1, (byte)-74, this.G);
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "r.RA(" + var1 + ',' + var2 + ')');
      }
   }

   final Class_r g(int var1) {
      try {
         ib++;
         int var3 = var1;
         Class_r var2 = new Class_r();
         var2.G = this.G;
         var2.h = new byte[this.G];

         for (int var4 = 0; ~var4 > ~this.G; var4++) {
            byte var5 = this.h[var4];
            if ((var5 < 97 || var5 > 122) && (~var5 > 31 || ~var5 < 1 || ~var5 == 8)) {
               if ((var5 < 65 || var5 > 90) && (~var5 > 63 || var5 > -34 || var5 == -41)) {
                  if (~var5 == -47 || ~var5 == -34 || var5 == 63) {
                     var3 = 2;
                  } else if (~var5 == -33) {
                     if (~var3 != -3) {
                        var3 = 1;
                     }
                  } else {
                     var3 = 1;
                  }
               } else {
                  if (~var3 == -1) {
                     var5 = (byte)(var5 + 32);
                  }

                  var3 = 0;
               }
            } else {
               if (var3 == 2) {
                  var5 = (byte)(var5 - 32);
               }

               var3 = 0;
            }

            var2.h[var4] = var5;
         }

         return var2;
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "r.GA(" + var1 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final boolean b(int var1, Class_r var2) {
      int var6 = client.lb;

      try {
         kb++;
         if (~var2.G < ~this.G) {
            return false;
         } else {
            int var3 = 0;
            if (var1 != -577) {
               this.h = null;
               if (var6 == 0 && var2.G <= var3) {
                  return true;
               }
            } else if (var2.G <= var3) {
               return true;
            }

            do {
               byte var4 = this.h[var3];
               if (var4 >= 65 && ~var4 >= -91) {
                  var4 = (byte)(var4 + 32);
               } else if (~var4 <= 63 && var4 <= -34 && ~var4 != 40) {
                  var4 = (byte)(var4 + 32);
               }

               byte var5 = var2.h[var3];
               if (var5 >= 65 && var5 <= 90) {
                  var5 = (byte)(var5 + 32);
                  if (~var4 != ~var5) {
                     return false;
                  }

                  var3++;
               } else {
                  if (var5 >= -64 && ~var5 >= 33 && ~var5 != 40) {
                     var5 = (byte)(var5 + 32);
                  }

                  if (~var4 != ~var5) {
                     return false;
                  }

                  var3++;
               }
            } while (var2.G > var3);

            return true;
         }
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "r.DB(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
      }
   }

   final Class_r b(Class_r var1, int var2) {
      try {
         lb++;
         if (var2 != 12147) {
            s = false;
         }

         if (!this.e) {
            throw new IllegalArgumentException();
         } else {
            this.V = 0;
            if (~this.h.length > ~(var1.G + this.G)) {
               byte var3 = 1;

               while (var1.G + this.G > var3) {
                  var3 += var3;
               }

               byte[] var4 = new byte[var3];
               Class_gb.a(this.h, 0, var4, 0, this.G);
               this.h = var4;
            }

            Class_gb.a(var1.h, 0, this.h, this.G, var1.G);
            this.G = this.G + var1.G;
            return this;
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "r.BA(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
      }
   }

   final int g(byte var1) {
      try {
         B++;
         int var2 = -58 % ((var1 - 75) / 46);
         return this.d(10, 71);
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "r.HA(" + var1 + 41);
      }
   }

   final Class_r[] e(int var1, int var2) {
      try {
         hb++;
         int var3 = var1;

         for (int var4 = 0; this.G > var4; var4++) {
            if (var2 == this.h[var4]) {
               var3++;
            }
         }

         Class_r[] var5 = new Class_r[var3 + 1];
         if (~var3 == -1) {
            var5[0] = this;
            return var5;
         } else {
            int var6 = 0;
            int var7 = 0;

            for (int var8 = 0; var3 > var8; var8++) {
               int var9 = 0;

               while (~var2 != ~this.h[var9 + var7]) {
                  var9++;
               }

               var5[var6++] = this.a(var7, (byte)-74, var7 + var9);
               var7 += 1 + var9;
            }

            var5[var3] = this.a(var7, (byte)-74, this.G);
            return var5;
         }
      } catch (RuntimeException var10) {
         throw Class_sh.a(var10, "r.V(" + var1 + ',' + var2 + ')');
      }
   }

   final boolean h(byte var1) {
      try {
         W++;
         if (var1 >= -17) {
            this.a(12, -60, -82, null);
         }

         return this.a(10, false);
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "r.C(" + var1 + ')');
      }
   }

   final Class_r h(int var1) {
      try {
         long var2 = this.b(-50);
         L++;
         Class var5;
         try { var5 = nb != null ? nb : (nb = Class.forName("Class_r")); } catch (ClassNotFoundException ex) { throw new RuntimeException(ex); }
         synchronized (var5) {
            if (Class_lh.Bb != null) {
               for (Class_ef var7 = (Class_ef)Class_lh.Bb.a(var2, 110); var7 != null; var7 = (Class_ef)Class_lh.Bb.c(109)) {
                  if (this.a(var7.p, (byte)117)) {
                     return var7.p;
                  }
               }
            } else {
               Class_lh.Bb = new Class_tg(4096);
            }

            Class_ef var13 = new Class_ef();
            var13.p = this;
            if (var1 != 4096) {
               return null;
            }

            this.e = false;
            Class_lh.Bb.a((byte)-66, var13, var2);
         }

         return this;
      } catch (RuntimeException var11) {
         throw Class_sh.a(var11, "r.IA(" + var1 + ')');
      }
   }
}
