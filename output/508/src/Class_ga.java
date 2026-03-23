final class Class_ga {
   static Class_r a = Class_tc.a(43, "Bitte warten Sie)3)3)3");
   static int b;
   private int c;
   static Class_sg d;
   static int e;
   static int f;
   private int g;
   static int h;
   static int i;
   static int j;
   static int k = 0;
   static int l;
   static int m;
   static int n;
   static int o;
   static int p;
   private int q;
   static int r;
   static int s;
   static int t;
   static byte[][][] u;
   static int v = 0;
   static int w;
   static int x;
   static int y;
   int[][] z;
   static int A;
   static int B;
   private int C;
   static int D;
   static int E = 0;

   final void a(int var1, byte var2, int var3) {
      try {
         var3 -= this.c;
         var1 -= this.g;
         s++;
         if (var2 <= -44) {
            this.z[var3][var1] = Class_mb.a(this.z[var3][var1], 2097152);
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "ga.A(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final void a(boolean var1) {
      int var4 = client.lb;

      try {
         int var2 = 0;
         if (var4 == 0 && var2 >= this.C) {
            if (var1) {
               a(-17);
            }

            e++;
         } else {
            do {
               int var3 = 0;
               if (var4 != 0 || this.q > var3) {
                  do {
                     if (var2 != 0 && var3 != 0 && -5 + this.C > var2 && ~(-5 + this.q) < ~var3) {
                        this.z[var2][var3] = 16777216;
                        var3++;
                     } else {
                        this.z[var2][var3] = 16777215;
                        if (var4 != 0) {
                           this.z[var2][var3] = 16777216;
                           var3++;
                        } else {
                           var3++;
                        }
                     }
                  } while (this.q > var3);
               }
            } while (++var2 < this.C);

            if (var1) {
               a(-17);
            }

            e++;
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "ga.S(" + var1 + ')');
      }
   }

   private final boolean a(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      try {
         if (!var2) {
            d = null;
         }

         y++;
         return var1 + var9 > var7 && var9 < var7 - -var3 ? var5 + var4 > var6 && var4 < var8 + var6 : false;
      } catch (RuntimeException var11) {
         throw Class_sh.a(var11, "ga.M(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ')');
      }
   }

   final void a(int var1, int var2, int var3) {
      try {
         var3 -= this.c;
         var2 -= this.g;
         x++;
         this.z[var3][var2] = Class_mb.a(this.z[var3][var2], 262144);
         if (var1 >= -63) {
            v = -2;
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "ga.C(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   final void b(int var1, int var2, int var3) {
      try {
         var3 -= this.g;
         l++;
         var1 -= this.c;
         this.z[var1][var3] = Class_ui.a(this.z[var1][var3], var2);
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "ga.G(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   final boolean a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      try {
         if (var1 != 15856) {
            return false;
         } else {
            b++;
            if (~var3 < -2) {
               return this.a(var8, true, var3, var2, var5, var4, var6, var3, var9) ? true : this.a(var7, var3, var6, var9, var2, var3, false, var5, var8, var4);
            } else {
               int var10 = var9 + var8 + -1;
               int var11 = var5 + var2 - 1;
               if (var9 <= var6 && var10 >= var6 && ~var2 >= ~var4 && var11 >= var4) {
                  return true;
               } else if (var6 == -1 + var9 && var2 <= var4 && ~var4 >= ~var11 && (8 & this.z[-this.c + var6][-this.g + var4]) == 0 && (var7 & 8) == 0) {
                  return true;
               } else if (1 + var10 == var6 && var4 >= var2 && var4 <= var11 && (128 & this.z[var6 - this.c][-this.g + var4]) == 0 && (var7 & 2) == 0) {
                  return true;
               } else {
                  return var2 - 1 == var4 && var9 <= var6 && var6 <= var10 && (2 & this.z[-this.c + var6][var4 + -this.g]) == 0 && (4 & var7) == 0
                     ? true
                     : ~var4 == ~(1 + var11) && var6 >= var9 && ~var6 >= ~var10 && ~(32 & this.z[var6 - this.c][var4 - this.g]) == -1 && ~(1 & var7) == -1;
               }
            }
         }
      } catch (RuntimeException var12) {
         throw Class_sh.a(var12, "ga.J(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ')');
      }
   }

   static final void a(int var0) {
      try {
         if (var0 != 2) {
            b(-69);
         }

         Class_aj.h.b((byte)94);
         j++;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ga.N(" + var0 + ')');
      }
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         p++;
         if (var3 >= 1 && var7 >= 1 && var3 <= 102 && var7 <= 102) {
            if (!Class_e.a(24781) && (2 & Class_kk.c[0][var3][var7]) == 0) {
               int var8 = var4;
               if ((Class_kk.c[var4][var3][var7] & 8) != 0) {
                  var8 = 0;
               }

               if (Class_la.bb != var8) {
                  return;
               }
            }

            int var11 = var4;
            if (~var4 > -4 && ~(Class_kk.c[1][var3][var7] & 2) == -3) {
               var11 = var4 + 1;
            }

            Class_bk.a(Class_sj.j[var4], var1, var11, var4, 28, var7, var3);
            if (~var2 <= -1) {
               boolean var9 = Class_ng.o;
               Class_ng.o = true;
               Class_w.a(Class_sj.j[var4], 1, false, var7, var6, var3, var5, var11, var4, false, var2);
               Class_ng.o = var9;
            }
         }

         if (var0 != 0) {
            b(true);
         }
      } catch (RuntimeException var10) {
         throw Class_sh.a(var10, "ga.R(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
      }
   }

   private final void a(byte var1, int var2, int var3, int var4) {
      try {
         D++;
         this.z[var4][var2] = Class_mb.a(this.z[var4][var2], var3);
         if (var1 != -74) {
            a = null;
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "ga.O(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
      }
   }

   private final void a(boolean var1, int var2, int var3, int var4) {
      try {
         if (var1) {
            d = null;
         }

         i++;
         this.z[var4][var2] = Class_ui.a(this.z[var4][var2], ~var3);
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "ga.L(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private final boolean a(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, int var8, int var9, int var10) {
      int var17 = client.lb;

      try {
         int var12 = var10 - -var6;
         int var11 = var2 + var3;
         if (var7) {
            v = -65;
         }

         int var13 = var4 - -var9;
         int var14 = var8 + var5;
         h++;
         if (var3 < var4 || var13 <= var3) {
            if (var11 <= var4 || ~var11 < ~var13) {
               if (var10 >= var5 && ~var10 > ~var14) {
                  if (var4 != var11 || ~(var1 & 8) != -1) {
                     if (var3 != var13 || ~(var1 & 2) != -1) {
                        return false;
                     }

                     int var15 = var10;
                     int var16 = var14 >= var12 ? var12 : var14;
                     if (var17 == 0 && var16 <= var10) {
                        if (var17 == 0) {
                           return false;
                        }
                     } else {
                        do {
                           if (~(128 & this.z[var3 + -this.c][var15 + -this.g]) == -1) {
                              return true;
                           }
                        } while (var16 > ++var15);

                        if (var17 == 0) {
                           return false;
                        }
                     }
                  }

                  int var26 = var14 >= var12 ? var12 : var14;
                  int var19 = var10;
                  if (var17 != 0 || var10 < var26) {
                     do {
                        if (~(8 & this.z[-this.c + var11 + -1][-this.g + var19]) == -1) {
                           return true;
                        }
                     } while (++var19 < var26);
                  }

                  if (var17 == 0) {
                     return false;
                  }
               }

               if (~var5 <= ~var12 || ~var12 < ~var14) {
                  return false;
               }

               if (var4 != var11 || (var1 & 8) != 0) {
                  if (~var13 != ~var3 || (2 & var1) != 0) {
                     return false;
                  }

                  int var20 = var5;
                  if (var17 != 0 || var12 > var5) {
                     do {
                        if (~(128 & this.z[-this.c + var3][-this.g + var20]) == -1) {
                           return true;
                        }
                     } while (var12 > ++var20);
                  }

                  if (var17 == 0) {
                     return false;
                  }
               }

               int var21 = var5;
               if (var17 == 0 && ~var5 <= ~var12) {
                  if (var17 == 0) {
                     return false;
                  }
               } else {
                  do {
                     if (~(8 & this.z[-1 + -this.c + var11][var21 - this.g]) == -1) {
                        return true;
                     }
                  } while (~(++var21) > ~var12);

                  if (var17 == 0) {
                     return false;
                  }
               }
            }

            if (~var12 == ~var5 && ~(4 & var1) == -1) {
               int var22 = var4;
               if (var17 == 0 && var11 <= var4) {
                  if (var17 == 0) {
                     return false;
                  }
               } else {
                  do {
                     if (~(this.z[var22 - this.c][var12 + -this.g - 1] & 2) == -1) {
                        return true;
                     }
                  } while (var11 > ++var22);

                  if (var17 == 0) {
                     return false;
                  }
               }
            }

            if (~var14 != ~var10 || (1 & var1) != 0) {
               return false;
            }

            int var23 = var4;
            if (var17 != 0 || ~var11 < ~var4) {
               do {
                  if (~(this.z[-this.c + var23][var10 + -this.g] & 32) == -1) {
                     return true;
                  }
               } while (~var11 < ~(++var23));
            }

            if (var17 == 0) {
               return false;
            }
         }

         if (~var12 != ~var5 || ~(4 & var1) != -1) {
            if (var14 != var10 || ~(1 & var1) != -1) {
               return false;
            }

            int var24 = var3;
            int var27 = var11 > var13 ? var13 : var11;
            if (var17 != 0 || var27 > var3) {
               do {
                  if ((32 & this.z[-this.c + var24][var10 + -this.g]) == 0) {
                     return true;
                  }
               } while (var27 > ++var24);
            }

            if (var17 == 0) {
               return false;
            }
         }

         int var25 = var3;
         int var28 = var13 < var11 ? var13 : var11;
         if (var17 != 0 || var28 > var3) {
            do {
               if ((this.z[var25 + -this.c][-1 + (var12 - this.g)] & 2) == 0) {
                  return true;
               }
            } while (var28 > ++var25);
         }

         return false;
      } catch (RuntimeException var18) {
         throw Class_sh.a(
            var18, "ga.F(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ',' + var10 + ')'
         );
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final void a(int var1, int var2, int var3, int var4, int var5, boolean var6, byte var7) {
      int var11 = client.lb;

      try {
         t++;
         var5 -= this.g;
         var2 -= this.c;
         if (~var4 == -2 || ~var4 == -4) {
            int var9 = var3;
            var3 = var1;
            var1 = var9;
         }

         int var8 = 256;
         if (var6) {
            var8 += 131072;
         }

         if (var7 == 82) {
            int var13 = var2;
            if (var11 != 0 || var2 < var3 + var2) {
               do {
                  if (~var13 > -1) {
                     var13++;
                  } else if (var13 >= this.C) {
                     var13++;
                  } else {
                     int var10 = var5;
                     if (var11 != 0) {
                        if (var5 >= 0 && ~this.q < ~var5) {
                           this.a(false, var5, var8, var13);
                        }

                        var10 = var5 + 1;
                     }

                     for (; var1 + var5 > var10; var10++) {
                        if (var10 >= 0 && ~this.q < ~var10) {
                           this.a(false, var10, var8, var13);
                        }
                     }

                     var13++;
                  }
               } while (var13 < var3 + var2);
            }
         }
      } catch (RuntimeException var12) {
         throw Class_sh.a(var12, "ga.E(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final void a(int var1, boolean var2, int var3, int var4, int var5, int var6) {
      int var10 = client.lb;

      try {
         var6 -= this.g;
         int var7 = 256;
         n++;
         if (var2) {
            var7 += 131072;
         }

         var5 -= this.c;
         int var8 = var5;
         if (var10 == 0 && var5 >= var4 + var5) {
            if (var1 >= -38) {
               this.c = -81;
            }
         } else {
            do {
               if (var8 < 0) {
                  var8++;
               } else if (var8 >= this.C) {
                  var8++;
               } else {
                  int var9 = var6;
                  if (var10 != 0) {
                     if (var6 >= 0 && ~var6 > ~this.q) {
                        this.a((byte)-74, var6, var7, var8);
                     }

                     var9 = var6 + 1;
                  }

                  for (; ~(var3 + var6) < ~var9; var9++) {
                     if (var9 >= 0 && ~var9 > ~this.q) {
                        this.a((byte)-74, var9, var7, var8);
                     }
                  }

                  var8++;
               }
            } while (var8 < var4 + var5);

            if (var1 >= -38) {
               this.c = -81;
            }
         }
      } catch (RuntimeException var11) {
         throw Class_sh.a(var11, "ga.I(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
      }
   }

   public static void a(byte var0) {
      try {
         if (var0 >= -103) {
            a(-65);
         }

         d = null;
         a = null;
         u = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ga.H(" + var0 + ')');
      }
   }

   static final int b(boolean var0) {
      try {
         if (var0) {
            E = 10;
         }

         f++;
         return 2;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ga.Q(" + var0 + 41);
      }
   }

   final void a(int var1, int var2, int var3, boolean var4, boolean var5, int var6) {
      try {
         w++;
         var1 -= this.c;
         var3 -= this.g;
         if (~var2 == -1) {
            if (~var6 == -1) {
               this.a(false, var3, 128, var1);
               this.a(false, var3, 8, -1 + var1);
            }

            if (var6 == 1) {
               this.a(false, var3, 2, var1);
               this.a(false, var3 - -1, 32, var1);
            }

            if (var6 == 2) {
               this.a(false, var3, 8, var1);
               this.a(false, var3, 128, var1 + 1);
            }

            if (var6 == 3) {
               this.a(!var4, var3, 32, var1);
               this.a(false, -1 + var3, 2, var1);
            }
         }

         if (var2 == 1 || ~var2 == -4) {
            if (var6 == 0) {
               this.a(false, var3, 1, var1);
               this.a(false, 1 + var3, 16, var1 + -1);
            }

            if (~var6 == -2) {
               this.a(!var4, var3, 4, var1);
               this.a(false, var3 + 1, 64, 1 + var1);
            }

            if (var6 == 2) {
               this.a(!var4, var3, 16, var1);
               this.a(false, -1 + var3, 1, 1 + var1);
            }

            if (var6 == 3) {
               this.a(false, var3, 64, var1);
               this.a(false, var3 - 1, 4, var1 - 1);
            }
         }

         if (var2 == 2) {
            if (var6 == 0) {
               this.a(false, var3, 130, var1);
               this.a(false, var3, 8, -1 + var1);
               this.a(false, 1 + var3, 32, var1);
            }

            if (~var6 == -2) {
               this.a(false, var3, 10, var1);
               this.a(!var4, 1 + var3, 32, var1);
               this.a(false, var3, 128, 1 + var1);
            }

            if (var6 == 2) {
               this.a(!var4, var3, 40, var1);
               this.a(!var4, var3, 128, 1 + var1);
               this.a(false, var3 + -1, 2, var1);
            }

            if (~var6 == -4) {
               this.a(false, var3, 160, var1);
               this.a(false, -1 + var3, 2, var1);
               this.a(false, var3, 8, -1 + var1);
            }
         }

         if (var4) {
            if (var5) {
               if (var2 == 0) {
                  if (~var6 == -1) {
                     this.a(!var4, var3, 65536, var1);
                     this.a(false, var3, 4096, -1 + var1);
                  }

                  if (~var6 == -2) {
                     this.a(!var4, var3, 1024, var1);
                     this.a(false, 1 + var3, 16384, var1);
                  }

                  if (~var6 == -3) {
                     this.a(false, var3, 4096, var1);
                     this.a(!var4, var3, 65536, var1 - -1);
                  }

                  if (~var6 == -4) {
                     this.a(false, var3, 16384, var1);
                     this.a(false, var3 - 1, 1024, var1);
                  }
               }

               if (~var2 == -2 || ~var2 == -4) {
                  if (var6 == 0) {
                     this.a(false, var3, 512, var1);
                     this.a(false, 1 + var3, 8192, var1 - 1);
                  }

                  if (var6 == 1) {
                     this.a(false, var3, 2048, var1);
                     this.a(!var4, var3 + 1, 32768, 1 + var1);
                  }

                  if (~var6 == -3) {
                     this.a(false, var3, 8192, var1);
                     this.a(false, -1 + var3, 512, var1 - -1);
                  }

                  if (~var6 == -4) {
                     this.a(!var4, var3, 32768, var1);
                     this.a(false, -1 + var3, 2048, -1 + var1);
                  }
               }

               if (~var2 == -3) {
                  if (var6 == 0) {
                     this.a(!var4, var3, 66560, var1);
                     this.a(false, var3, 4096, var1 - 1);
                     this.a(false, var3 - -1, 16384, var1);
                  }

                  if (var6 == 1) {
                     this.a(!var4, var3, 5120, var1);
                     this.a(!var4, 1 + var3, 16384, var1);
                     this.a(false, var3, 65536, var1 - -1);
                  }

                  if (~var6 == -3) {
                     this.a(false, var3, 20480, var1);
                     this.a(false, var3, 65536, var1 - -1);
                     this.a(false, -1 + var3, 1024, var1);
                  }

                  if (var6 == 3) {
                     this.a(false, var3, 81920, var1);
                     this.a(!var4, var3 - 1, 1024, var1);
                     this.a(false, var3, 4096, var1 - 1);
                     return;
                  }
               }
            }
         }
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "ga.D(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
      }
   }

   final boolean a(int var1, int var2, byte var3, int var4, int var5, int var6, int var7, int var8) {
      try {
         if (var3 != 108) {
            d = null;
         }

         A++;
         if (~var5 != -2) {
            if (var4 <= var2 && var4 - (-var5 + 1) >= var2 && var6 <= var6 && var6 <= var5 + var6 - 1) {
               return true;
            }
         } else if (~var4 == ~var2 && var7 == var6) {
            return true;
         }

         var2 -= this.c;
         var4 -= this.c;
         var7 -= this.g;
         var6 -= this.g;
         if (~var5 != -2) {
            int var9 = -1 + var5 + var4;
            int var10 = -1 + (var7 - -var5);
            if (~var8 == -1) {
               if (var1 == 0) {
                  if (~(var2 - var5) == ~var4 && ~var6 <= ~var7 && ~var10 <= ~var6) {
                     return true;
                  }

                  if (var4 <= var2 && ~var9 <= ~var2 && ~var7 == ~(1 + var6) && ~(this.z[var2][var7] & 19661088) == -1) {
                     return true;
                  }

                  if (var4 <= var2 && var9 >= var2 && ~var7 == ~(var6 + -var5) && (19661058 & this.z[var2][var10]) == 0) {
                     return true;
                  }
               } else if (var1 == 1) {
                  if (var4 <= var2 && ~var2 >= ~var9 && var6 - -1 == var7) {
                     return true;
                  }

                  if (~(-var5 + var2) == ~var4 && var7 <= var6 && var10 >= var6 && (this.z[var9][var6] & 19661064) == 0) {
                     return true;
                  }

                  if (1 + var2 == var4 && var6 >= var7 && var6 <= var10 && (this.z[var4][var6] & 19661184) == 0) {
                     return true;
                  }
               } else if (~var1 == -3) {
                  if (~(var2 - -1) == ~var4 && ~var7 >= ~var6 && ~var6 >= ~var10) {
                     return true;
                  }

                  if (var2 >= var4 && ~var2 >= ~var9 && ~var7 == ~(var6 - -1) && (this.z[var2][var7] & 19661088) == 0) {
                     return true;
                  }

                  if (~var2 <= ~var4 && ~var9 <= ~var2 && var7 == -var5 + var6 && ~(this.z[var2][var10] & 19661058) == -1) {
                     return true;
                  }
               } else if (~var1 == -4) {
                  if (~var2 <= ~var4 && ~var2 >= ~var9 && ~(var6 - var5) == ~var7) {
                     return true;
                  }

                  if (-var5 + var2 == var4 && var7 <= var6 && ~var10 <= ~var6 && (19661064 & this.z[var9][var6]) == 0) {
                     return true;
                  }

                  if (~var4 == ~(var2 + 1) && ~var7 >= ~var6 && ~var10 <= ~var6 && ~(this.z[var4][var6] & 19661184) == -1) {
                     return true;
                  }
               }
            }

            if (~var8 == -3) {
               if (var1 != 0) {
                  if (var1 != 1) {
                     if (~var1 != -3) {
                        if (~var1 == -4) {
                           if (~(var2 + -var5) == ~var4 && ~var7 >= ~var6 && ~var10 <= ~var6) {
                              return true;
                           }

                           if (var2 >= var4 && var2 <= var9 && ~var7 == ~(var6 - -1) && (19661088 & this.z[var2][var7]) == 0) {
                              return true;
                           }

                           if (~(1 + var2) == ~var4 && ~var6 <= ~var7 && var10 >= var6 && ~(19661184 & this.z[var4][var6]) == -1) {
                              return true;
                           }

                           if (var2 >= var4 && ~var2 >= ~var9 && var6 - var5 == var7) {
                              return true;
                           }
                        }
                     } else {
                        if (var4 == -var5 + var2 && var6 >= var7 && ~var10 <= ~var6 && ~(this.z[var9][var6] & 19661064) == -1) {
                           return true;
                        }

                        if (var2 >= var4 && var9 >= var2 && var7 == var6 - -1 && ~(this.z[var2][var7] & 19661088) == -1) {
                           return true;
                        }

                        if (var2 + 1 == var4 && ~var7 >= ~var6 && ~var10 <= ~var6) {
                           return true;
                        }

                        if (~var2 <= ~var4 && var9 >= var2 && ~(-var5 + var6) == ~var7) {
                           return true;
                        }
                     }
                  } else {
                     if (var4 == -var5 + var2 && var7 <= var6 && var6 <= var10 && (19661064 & this.z[var9][var6]) == 0) {
                        return true;
                     }

                     if (var2 >= var4 && var2 <= var9 && var7 == var6 + 1) {
                        return true;
                     }

                     if (~var4 == ~(var2 + 1) && ~var6 <= ~var7 && ~var6 >= ~var10) {
                        return true;
                     }

                     if (var2 >= var4 && var9 >= var2 && -var5 + var6 == var7 && ~(19661058 & this.z[var2][var10]) == -1) {
                        return true;
                     }
                  }
               } else {
                  if (~var4 == ~(-var5 + var2) && var6 >= var7 && ~var10 <= ~var6) {
                     return true;
                  }

                  if (~var4 >= ~var2 && ~var2 >= ~var9 && ~var7 == ~(var6 - -1)) {
                     return true;
                  }

                  if (var2 + 1 == var4 && var6 >= var7 && ~var10 <= ~var6 && ~(19661184 & this.z[var4][var6]) == -1) {
                     return true;
                  }

                  if (~var4 >= ~var2 && var2 <= var9 && ~var7 == ~(-var5 + var6) && (19661058 & this.z[var2][var10]) == 0) {
                     return true;
                  }
               }
            }

            if (var8 == 9) {
               if (~var4 >= ~var2 && var9 >= var2 && var7 == 1 + var6 && (this.z[var2][var7] & 19661088) == 0) {
                  return true;
               }

               if (~var2 <= ~var4 && var9 >= var2 && var6 - var5 == var7 && ~(this.z[var2][var10] & 19661058) == -1) {
                  return true;
               }

               if (~(var2 - var5) == ~var4 && var7 <= var6 && ~var10 <= ~var6 && (this.z[var9][var6] & 19661064) == 0) {
                  return true;
               }

               if (~(1 + var2) == ~var4 && var7 <= var6 && var6 <= var10 && ~(19661184 & this.z[var4][var6]) == -1) {
                  return true;
               }
            }
         } else {
            if (var8 == 0) {
               if (var1 != 0) {
                  if (var1 == 1) {
                     if (~var4 == ~var2 && var6 - -1 == var7) {
                        return true;
                     }

                     if (~var4 == ~(var2 - 1) && ~var6 == ~var7 && ~(this.z[var4][var7] & 19661064) == -1) {
                        return true;
                     }

                     if (1 + var2 == var4 && var7 == var6 && ~(this.z[var4][var7] & 19661184) == -1) {
                        return true;
                     }
                  } else if (var1 == 2) {
                     if (~(1 + var2) == ~var4 && ~var7 == ~var6) {
                        return true;
                     }

                     if (~var2 == ~var4 && ~var7 == ~(var6 + 1) && (19661088 & this.z[var4][var7]) == 0) {
                        return true;
                     }

                     if (var2 == var4 && var6 + -1 == var7 && ~(19661058 & this.z[var4][var7]) == -1) {
                        return true;
                     }
                  } else if (~var1 == -4) {
                     if (~var4 == ~var2 && var7 == var6 + -1) {
                        return true;
                     }

                     if (var4 == var2 + -1 && ~var7 == ~var6 && ~(this.z[var4][var7] & 19661064) == -1) {
                        return true;
                     }

                     if (var2 - -1 == var4 && ~var6 == ~var7 && ~(19661184 & this.z[var4][var7]) == -1) {
                        return true;
                     }
                  }
               } else {
                  if (~(-1 + var2) == ~var4 && ~var7 == ~var6) {
                     return true;
                  }

                  if (~var2 == ~var4 && ~var7 == ~(1 + var6) && ~(this.z[var4][var7] & 19661088) == -1) {
                     return true;
                  }

                  if (~var2 == ~var4 && var6 - 1 == var7 && (19661058 & this.z[var4][var7]) == 0) {
                     return true;
                  }
               }
            }

            if (var8 == 2) {
               if (var1 != 0) {
                  if (var1 != 1) {
                     if (var1 == 2) {
                        if (var4 == var2 + -1 && ~var7 == ~var6 && ~(19661064 & this.z[var4][var7]) == -1) {
                           return true;
                        }

                        if (var4 == var2 && ~var7 == ~(1 + var6) && ~(19661088 & this.z[var4][var7]) == -1) {
                           return true;
                        }

                        if (~var4 == ~(var2 - -1) && ~var6 == ~var7) {
                           return true;
                        }

                        if (~var2 == ~var4 && var7 == var6 + -1) {
                           return true;
                        }
                     } else if (var1 == 3) {
                        if (-1 + var2 == var4 && var6 == var7) {
                           return true;
                        }

                        if (var2 == var4 && var6 - -1 == var7 && ~(this.z[var4][var7] & 19661088) == -1) {
                           return true;
                        }

                        if (~(1 + var2) == ~var4 && ~var6 == ~var7 && ~(19661184 & this.z[var4][var7]) == -1) {
                           return true;
                        }

                        if (var4 == var2 && ~var7 == ~(-1 + var6)) {
                           return true;
                        }
                     }
                  } else {
                     if (var2 - 1 == var4 && ~var6 == ~var7 && (this.z[var4][var7] & 19661064) == 0) {
                        return true;
                     }

                     if (~var4 == ~var2 && var7 == var6 - -1) {
                        return true;
                     }

                     if (~var4 == ~(1 + var2) && ~var7 == ~var6) {
                        return true;
                     }

                     if (~var2 == ~var4 && ~(-1 + var6) == ~var7 && ~(this.z[var4][var7] & 19661058) == -1) {
                        return true;
                     }
                  }
               } else {
                  if (~(-1 + var2) == ~var4 && ~var7 == ~var6) {
                     return true;
                  }

                  if (var2 == var4 && var7 == var6 - -1) {
                     return true;
                  }

                  if (~(1 + var2) == ~var4 && var7 == var6 && ~(19661184 & this.z[var4][var7]) == -1) {
                     return true;
                  }

                  if (var2 == var4 && var6 - 1 == var7 && ~(19661058 & this.z[var4][var7]) == -1) {
                     return true;
                  }
               }
            }

            if (var8 == 9) {
               if (~var2 == ~var4 && ~(var6 - -1) == ~var7 && (this.z[var4][var7] & 32) == 0) {
                  return true;
               }

               if (~var2 == ~var4 && var7 == var6 + -1 && (this.z[var4][var7] & 2) == 0) {
                  return true;
               }

               if (var4 == var2 + -1 && var6 == var7 && (this.z[var4][var7] & 8) == 0) {
                  return true;
               }

               if (~(var2 - -1) == ~var4 && var7 == var6 && (128 & this.z[var4][var7]) == 0) {
                  return true;
               }
            }
         }

         return false;
      } catch (RuntimeException var11) {
         throw Class_sh.a(var11, "ga.K(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ')');
      }
   }

   static final Class_dh b(int var0) {
      try {
         if (var0 != 9662) {
            k = 43;
         }

         Class_dh var1 = new Class_dh(Class_qb.b, Class_tf.bb, Class_ae.g[0], Class_ub.L[0], Class_ia.bb[0], Class_ld.ib[0], Class_lj.h[0], Class_ji.Y);
         Class_oe.a((byte)-93);
         r++;
         return var1;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ga.B(" + var0 + ')');
      }
   }

   final void a(int var1, int var2, boolean var3, int var4, int var5, byte var6) {
      try {
         var5 -= this.c;
         o++;
         var2 -= this.g;
         if (var4 == 0) {
            if (~var1 == -1) {
               this.a((byte)-74, var2, 128, var5);
               this.a((byte)-74, var2, 8, -1 + var5);
            }

            if (~var1 == -2) {
               this.a((byte)-74, var2, 2, var5);
               this.a((byte)-74, 1 + var2, 32, var5);
            }

            if (var1 == 2) {
               this.a((byte)-74, var2, 8, var5);
               this.a((byte)-74, var2, 128, 1 + var5);
            }

            if (var1 == 3) {
               this.a((byte)-74, var2, 32, var5);
               this.a((byte)-74, -1 + var2, 2, var5);
            }
         }

         int var7 = 78 % ((-87 - var6) / 37);
         if (~var4 == -2 || var4 == 3) {
            if (~var1 == -1) {
               this.a((byte)-74, var2, 1, var5);
               this.a((byte)-74, 1 + var2, 16, var5 - 1);
            }

            if (~var1 == -2) {
               this.a((byte)-74, var2, 4, var5);
               this.a((byte)-74, 1 + var2, 64, 1 + var5);
            }

            if (var1 == 2) {
               this.a((byte)-74, var2, 16, var5);
               this.a((byte)-74, var2 + -1, 1, 1 + var5);
            }

            if (~var1 == -4) {
               this.a((byte)-74, var2, 64, var5);
               this.a((byte)-74, var2 - 1, 4, var5 - 1);
            }
         }

         if (~var4 == -3) {
            if (~var1 == -1) {
               this.a((byte)-74, var2, 130, var5);
               this.a((byte)-74, var2, 8, var5 - 1);
               this.a((byte)-74, var2 - -1, 32, var5);
            }

            if (~var1 == -2) {
               this.a((byte)-74, var2, 10, var5);
               this.a((byte)-74, 1 + var2, 32, var5);
               this.a((byte)-74, var2, 128, 1 + var5);
            }

            if (~var1 == -3) {
               this.a((byte)-74, var2, 40, var5);
               this.a((byte)-74, var2, 128, 1 + var5);
               this.a((byte)-74, var2 - 1, 2, var5);
            }

            if (var1 == 3) {
               this.a((byte)-74, var2, 160, var5);
               this.a((byte)-74, -1 + var2, 2, var5);
               this.a((byte)-74, var2, 8, var5 - 1);
            }
         }

         if (var3) {
            if (~var4 == -1) {
               if (var1 == 0) {
                  this.a((byte)-74, var2, 65536, var5);
                  this.a((byte)-74, var2, 4096, var5 + -1);
               }

               if (~var1 == -2) {
                  this.a((byte)-74, var2, 1024, var5);
                  this.a((byte)-74, 1 + var2, 16384, var5);
               }

               if (~var1 == -3) {
                  this.a((byte)-74, var2, 4096, var5);
                  this.a((byte)-74, var2, 65536, 1 + var5);
               }

               if (var1 == 3) {
                  this.a((byte)-74, var2, 16384, var5);
                  this.a((byte)-74, -1 + var2, 1024, var5);
               }
            }

            if (var4 == 1 || var4 == 3) {
               if (~var1 == -1) {
                  this.a((byte)-74, var2, 512, var5);
                  this.a((byte)-74, 1 + var2, 8192, var5 - 1);
               }

               if (var1 == 1) {
                  this.a((byte)-74, var2, 2048, var5);
                  this.a((byte)-74, 1 + var2, 32768, 1 + var5);
               }

               if (var1 == 2) {
                  this.a((byte)-74, var2, 8192, var5);
                  this.a((byte)-74, -1 + var2, 512, var5 - -1);
               }

               if (var1 == 3) {
                  this.a((byte)-74, var2, 32768, var5);
                  this.a((byte)-74, -1 + var2, 2048, var5 - 1);
               }
            }

            if (~var4 == -3) {
               if (var1 == 0) {
                  this.a((byte)-74, var2, 66560, var5);
                  this.a((byte)-74, var2, 4096, var5 + -1);
                  this.a((byte)-74, var2 - -1, 16384, var5);
               }

               if (var1 == 1) {
                  this.a((byte)-74, var2, 5120, var5);
                  this.a((byte)-74, var2 - -1, 16384, var5);
                  this.a((byte)-74, var2, 65536, 1 + var5);
               }

               if (~var1 == -3) {
                  this.a((byte)-74, var2, 20480, var5);
                  this.a((byte)-74, var2, 65536, 1 + var5);
                  this.a((byte)-74, -1 + var2, 1024, var5);
               }

               if (var1 == 3) {
                  this.a((byte)-74, var2, 81920, var5);
                  this.a((byte)-74, var2 + -1, 1024, var5);
                  this.a((byte)-74, var2, 4096, -1 + var5);
                  return;
               }
            }
         }
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "ga.T(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
      }
   }

   final boolean a(int var1, int var2, int var3, byte var4, int var5, int var6, int var7, int var8) {
      try {
         B++;
         if (~var5 != -2) {
            if (var2 <= var1 && var1 <= -1 + var5 + var2 && ~var6 <= ~var6 && -1 + (var6 - -var5) >= var6) {
               return true;
            }
         } else if (~var1 == ~var2 && ~var6 == ~var7) {
            return true;
         }

         var1 -= this.c;
         var6 -= this.g;
         var7 -= this.g;
         int var9 = -3 % ((18 - var4) / 36);
         var2 -= this.c;
         if (var5 == 1) {
            if (~var8 == -7 || var8 == 7) {
               if (var8 == 7) {
                  var3 = 3 & var3 - -2;
               }

               if (~var3 == -1) {
                  if (~var2 == ~(1 + var1) && var7 == var6 && (this.z[var2][var7] & 128) == 0) {
                     return true;
                  }

                  if (var2 == var1 && -1 + var6 == var7 && ~(this.z[var2][var7] & 2) == -1) {
                     return true;
                  }
               } else if (var3 != 1) {
                  if (~var3 != -3) {
                     if (~var3 == -4) {
                        if (~var2 == ~(var1 - -1) && ~var6 == ~var7 && (128 & this.z[var2][var7]) == 0) {
                           return true;
                        }

                        if (~var2 == ~var1 && ~var7 == ~(1 + var6) && (32 & this.z[var2][var7]) == 0) {
                           return true;
                        }
                     }
                  } else {
                     if (var2 == -1 + var1 && ~var7 == ~var6 && (8 & this.z[var2][var7]) == 0) {
                        return true;
                     }

                     if (~var2 == ~var1 && var7 == 1 + var6 && (32 & this.z[var2][var7]) == 0) {
                        return true;
                     }
                  }
               } else {
                  if (var1 + -1 == var2 && ~var6 == ~var7 && ~(this.z[var2][var7] & 8) == -1) {
                     return true;
                  }

                  if (var2 == var1 && ~var7 == ~(-1 + var6) && ~(2 & this.z[var2][var7]) == -1) {
                     return true;
                  }
               }
            }

            if (var8 == 8) {
               if (~var2 == ~var1 && 1 + var6 == var7 && (32 & this.z[var2][var7]) == 0) {
                  return true;
               }

               if (~var2 == ~var1 && ~var7 == ~(-1 + var6) && ~(2 & this.z[var2][var7]) == -1) {
                  return true;
               }

               if (-1 + var1 == var2 && var7 == var6 && ~(8 & this.z[var2][var7]) == -1) {
                  return true;
               }

               if (var2 == var1 + 1 && var6 == var7 && ~(128 & this.z[var2][var7]) == -1) {
                  return true;
               }
            }
         } else {
            int var10 = -1 + var2 + var5;
            int var11 = var5 + (var7 - 1);
            if (var8 == 6 || ~var8 == -8) {
               if (var8 == 7) {
                  var3 = var3 + 2 & 3;
               }

               if (var3 == 0) {
                  if (var1 + 1 == var2 && var7 <= var6 && ~var6 >= ~var11 && ~(this.z[var2][var6] & 128) == -1) {
                     return true;
                  }

                  if (~var2 >= ~var1 && var1 <= var10 && var6 + -var5 == var7 && ~(this.z[var1][var11] & 2) == -1) {
                     return true;
                  }
               } else if (var3 == 1) {
                  if (-var5 + var1 == var2 && ~var7 >= ~var6 && ~var6 >= ~var11 && (this.z[var10][var6] & 8) == 0) {
                     return true;
                  }

                  if (var1 >= var2 && ~var1 >= ~var10 && -var5 + var6 == var7 && (2 & this.z[var1][var11]) == 0) {
                     return true;
                  }
               } else if (~var3 == -3) {
                  if (var2 == -var5 + var1 && ~var6 <= ~var7 && ~var6 >= ~var11 && ~(8 & this.z[var10][var6]) == -1) {
                     return true;
                  }

                  if (var1 >= var2 && ~var1 >= ~var10 && var7 == 1 + var6 && ~(32 & this.z[var1][var7]) == -1) {
                     return true;
                  }
               } else if (~var3 == -4) {
                  if (~(var1 + 1) == ~var2 && var7 <= var6 && var6 <= var11 && ~(this.z[var2][var6] & 128) == -1) {
                     return true;
                  }

                  if (~var2 >= ~var1 && var1 <= var10 && var7 == 1 + var6 && (32 & this.z[var1][var7]) == 0) {
                     return true;
                  }
               }
            }

            if (var8 == 8) {
               if (var1 >= var2 && var1 <= var10 && ~(var6 - -1) == ~var7 && (32 & this.z[var1][var7]) == 0) {
                  return true;
               }

               if (~var2 >= ~var1 && ~var1 >= ~var10 && ~var7 == ~(var6 - var5) && (this.z[var1][var11] & 2) == 0) {
                  return true;
               }

               if (~(-var5 + var1) == ~var2 && ~var7 >= ~var6 && ~var6 >= ~var11 && ~(this.z[var10][var6] & 8) == -1) {
                  return true;
               }

               if (~(1 + var1) == ~var2 && var6 >= var7 && var6 <= var11 && ~(128 & this.z[var2][var6]) == -1) {
                  return true;
               }
            }
         }

         return false;
      } catch (RuntimeException var12) {
         throw Class_sh.a(var12, "ga.P(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ')');
      }
   }

   Class_ga(int var1, int var2) {
      try {
         this.q = var2;
         this.C = var1;
         this.z = new int[this.C][this.q];
         this.c = 0;
         this.g = 0;
         this.a(false);
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "ga.<init>(" + var1 + ',' + var2 + ')');
      }
   }
}
