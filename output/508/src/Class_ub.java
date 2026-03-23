final class Class_ub {
   static int a;
   boolean b;
   private short c = -1;
   private byte[] d;
   private byte e = 0;
   int f;
   private int g;
   private boolean h;
   private int[] i;
   boolean j;
   private Class_tg k;
   static int l;
   private boolean m;
   int n;
   int o;
   static int p;
   int q;
   private int r;
   private int s;
   boolean t;
   private int u;
   int v;
   private short[] w;
   int x;
   int y;
   static int z;
   private short[] A;
   private int B;
   int C;
   int D;
   private int E;
   int F;
   static int G;
   static Class_r[] H;
   static int I;
   int[] J;
   int[] K;
   static int[] L;
   boolean M;
   private int N;
   private int O;
   int Q;
   static int R;
   int S;
   private int T;
   boolean U;
   boolean V;
   Class_r[] W;
   static int X = 0;
   boolean Y;
   static int Z;
   private int[] ab;
   static int bb = 0;
   static int cb;
   private int db;
   static int eb;
   static int fb;
   static int[][] gb = new int[104][104];
   boolean hb;
   boolean ib;
   static Class_jb jb;
   static int kb;
   Class_r lb;
   int mb;
   private short[] nb;
   static int ob;
   int pb;
   private short[] qb;
   boolean rb;
   static int sb;
   static int tb;
   boolean ub;
   int vb;

   final Class_h a(int var1, Class_dh var2, boolean var3, byte var4, boolean var5, int var6, int var7, int[][] var8, int var9, int[][] var10, int var11) {
      int var18 = client.lb;

      try {
         long var12;
         label83: {
            kb++;
            if (this.ab == null) {
               var12 = (this.vb << 1483642730) + var7;
               if (var18 == 0) {
                  break label83;
               }
            }

            var12 = (this.vb << -2129513334) + (var1 << 1803278083) + var7;
         }

         boolean var14;
         label94: {
            int var16 = 82 % ((58 - var4) / 62);
            if (!var5 || !this.h) {
               var14 = false;
               if (var18 == 0) {
                  break label94;
               }
            }

            var14 = true;
            var12 |= -9223372036854775808L;
         }

         Object var15 = (Class_a)Class_m.V.a(14366, var12);
         if (var15 == null) {
            Class_ne var17 = this.a(var7, 0, var1);
            if (var17 == null) {
               Class_di.T.e = null;
               return Class_di.T;
            }

            var17.l();
            if (var1 == 10 && var7 > 3) {
               var17.c(256);
            }

            label65: {
               if (var14) {
                  var17.N = (short)(64 + this.db);
                  var15 = var17;
                  var17.T = (short)(768 + 5 * this.u);
                  var17.g();
                  if (var18 == 0) {
                     break label65;
                  }
               }

               var15 = new Class_qa(var17, this.db + 64, this.u * 5 + 768, -50, -10, -50);
            }

            Class_m.V.a(var15, 97, var12);
         }

         if (var14) {
            var15 = ((Class_ne)var15).c();
         }

         label59:
         if (~this.e != -1) {
            if (!(var15 instanceof Class_qa)) {
               if (!(var15 instanceof Class_ne)) {
                  break label59;
               }

               var15 = ((Class_ne)var15).a(this.e, this.c, var8, var10, var11, var6, var9, true, false);
               if (var18 == 0) {
                  break label59;
               }
            }

            var15 = ((Class_qa)var15).a(this.e, this.c, var8, var10, var11, var6, var9, true);
         }

         Class_di.T.e = (Class_a)var15;
         return Class_di.T;
      } catch (RuntimeException var19) {
         throw Class_sh.a(
            var19,
            "ub.G("
               + var1
               + ','
               + (var2 != null ? "{...}" : "null")
               + ','
               + var3
               + ','
               + var4
               + ','
               + var5
               + ','
               + var6
               + ','
               + var7
               + ','
               + (var8 != null ? "{...}" : "null")
               + ','
               + var9
               + ','
               + (var10 != null ? "{...}" : "null")
               + ','
               + var11
               + ')'
         );
      }
   }

   final int a(byte var1, int var2, int var3) {
      try {
         R++;
         if (this.k == null) {
            return var2;
         } else {
            Class_kg var4 = (Class_kg)this.k.a(var3, 79);
            if (var1 > -85) {
               this.b = false;
            }

            return var4 == null ? var2 : var4.r;
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "ub.B(" + var1 + 44 + var2 + 44 + var3 + 41);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final boolean a(int var1, int var2) {
      int var6 = client.lb;

      try {
         int var3 = 100 % ((var1 - 49) / 62);
         sb++;
         if (this.ab == null) {
            if (this.i == null) {
               return true;
            } else if (~var2 != -11) {
               return true;
            } else {
               boolean var8 = true;
               int var5 = 0;
               if (var6 == 0 && ~var5 <= ~this.i.length) {
                  return var8;
               } else {
                  do {
                     var8 &= Class_cd.I.a(65535 & this.i[var5], 0, (byte)-95);
                  } while (~(++var5) > ~this.i.length);

                  return var8;
               }
            }
         } else {
            int var4 = 0;
            if (var6 == 0 && ~this.ab.length >= ~var4) {
               return true;
            } else {
               while (var2 != this.ab[var4]) {
                  if (~this.ab.length >= ~(++var4)) {
                     return true;
                  }
               }

               return Class_cd.I.a(65535 & this.i[var4], 0, (byte)-116);
            }
         }
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "ub.J(" + var1 + ',' + var2 + ')');
      }
   }

   final Class_r a(int var1, Class_r var2, int var3) {
      try {
         tb++;
         if (var1 != 256) {
            this.V = false;
         }

         if (this.k == null) {
            return var2;
         } else {
            Class_ef var4 = (Class_ef)this.k.a(var3, var1 ^ -301);
            return var4 == null ? var2 : var4.p;
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "ub.H(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
      }
   }

   final void a(int var1) {
      try {
         p++;
         if (~this.y == 0) {
            this.y = 0;
            if (this.i != null && (this.ab == null || this.ab[0] == 10)) {
               this.y = 1;
            }

            for (int var2 = 0; ~var2 > -6; var2++) {
               if (this.W[var2] != null) {
                  this.y = 1;
                  break;
               }
            }
         }

         if (~this.n == 0) {
            this.n = this.mb != 0 ? 1 : 0;
         }

         if (var1 != -129) {
            this.D = -45;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ub.E(" + var1 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final boolean a(byte var1) {
      int var4 = client.lb;

      try {
         G++;
         if (this.J == null) {
            return this.x != -1 || this.K != null;
         } else if (var1 != -6) {
            return true;
         } else {
            int var2 = 0;
            if (var4 == 0 && ~var2 <= ~this.J.length) {
               return false;
            } else {
               do {
                  if (~this.J[var2] != 0) {
                     Class_ub var3 = Class_qe.a(96, this.J[var2]);
                     if (var3.x != -1 || var3.K != null) {
                        return true;
                     }
                  }
               } while (~(++var2) > ~this.J.length);

               return false;
            }
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "ub.C(" + var1 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final int a(int var0, byte var1, int var2) {
      int var5 = client.lb;

      try {
         if (~var0 < ~var2) {
            int var3 = var2;
            var2 = var0;
            var0 = var3;
         }

         int var7 = 12 % ((-35 - var1) / 38);
         cb++;
         if (var5 == 0 && ~var0 == -1) {
            return var2;
         } else {
            int var4;
            do {
               var4 = var2 % var0;
               var2 = var0;
               var0 = var4;
            } while (~var4 != -1);

            return var2;
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "ub.A(" + var0 + 44 + var1 + 44 + var2 + 41);
      }
   }

   private final void a(int var1, Class_lh var2, int var3) {
      try {
         if (var3 == 1) {
            int var4 = var2.n(-6677);
            if (~var4 < -1) {
               if (this.i != null && !Class_j.fb) {
                  var2.p += 3 * var4;
               } else {
                  this.ab = new int[var4];
                  this.i = new int[var4];

                  for (int var5 = 0; ~var4 < ~var5; var5++) {
                     this.i[var5] = var2.k(1355769544);
                     this.ab[var5] = var2.n(-6677);
                  }
               }
            }
         } else if (~var3 == -3) {
            this.lb = var2.e(var1 ^ -2129513227);
         } else if (~var3 != -6) {
            if (var3 != 14) {
               if (~var3 == -16) {
                  this.C = var2.n(-6677);
               } else if (~var3 != -18) {
                  if (var3 == 18) {
                     this.ub = false;
                  } else if (var3 == 19) {
                     this.y = var2.n(var1 + 2129506657);
                  } else if (var3 != 21) {
                     if (~var3 != -23) {
                        if (~var3 != -24) {
                           if (~var3 != -25) {
                              if (~var3 != -28) {
                                 if (var3 != 28) {
                                    if (~var3 != -30) {
                                       if (var3 != 39) {
                                          if (var3 >= 30 && var3 < 35) {
                                             this.W[-30 + var3] = var2.e(127);
                                             if (this.W[-30 + var3].a(false, Class_ke.r)) {
                                                this.W[var3 - 30] = null;
                                             }
                                          } else if (~var3 != -41) {
                                             if (~var3 != -42) {
                                                if (~var3 != -43) {
                                                   if (~var3 != -61) {
                                                      if (var3 != 62) {
                                                         if (var3 == 64) {
                                                            this.rb = false;
                                                         } else if (~var3 == -66) {
                                                            this.s = var2.k(1355769544);
                                                         } else if (~var3 != -67) {
                                                            if (~var3 == -68) {
                                                               this.T = var2.k(1355769544);
                                                            } else if (var3 == 68) {
                                                               this.o = var2.k(var1 ^ -774024638);
                                                            } else if (~var3 != -70) {
                                                               if (var3 != 70) {
                                                                  if (var3 != 71) {
                                                                     if (~var3 == -73) {
                                                                        this.B = var2.p(var1 + 2129490845);
                                                                     } else if (var3 != 73) {
                                                                        if (~var3 != -75) {
                                                                           if (~var3 != -76) {
                                                                              if (~var3 == -78 || ~var3 == -93) {
                                                                                 this.r = var2.k(1355769544);
                                                                                 if (~this.r == -65536) {
                                                                                    this.r = -1;
                                                                                 }

                                                                                 int var12 = -1;
                                                                                 this.N = var2.k(1355769544);
                                                                                 if (this.N == 65535) {
                                                                                    this.N = -1;
                                                                                 }

                                                                                 if (~var3 == -93) {
                                                                                    var12 = var2.k(1355769544);
                                                                                    if (var12 == 65535) {
                                                                                       var12 = -1;
                                                                                    }
                                                                                 }

                                                                                 int var20 = var2.n(-6677);
                                                                                 this.J = new int[var20 - -2];

                                                                                 for (int var25 = 0; var20 >= var25; var25++) {
                                                                                    this.J[var25] = var2.k(1355769544);
                                                                                    if (~this.J[var25] == -65536) {
                                                                                       this.J[var25] = -1;
                                                                                    }
                                                                                 }

                                                                                 this.J[1 + var20] = var12;
                                                                              } else if (var3 != 78) {
                                                                                 if (var3 == 79) {
                                                                                    this.f = var2.k(1355769544);
                                                                                    this.Q = var2.k(var1 + -809684418);
                                                                                    this.q = var2.n(-6677);
                                                                                    int var10 = var2.n(-6677);
                                                                                    this.K = new int[var10];

                                                                                    for (int var17 = 0; var10 > var17; var17++) {
                                                                                       this.K[var17] = var2.k(1355769544);
                                                                                    }
                                                                                 } else if (var3 != 81) {
                                                                                    if (~var3 != -83) {
                                                                                       if (~var3 == -89) {
                                                                                          this.ib = false;
                                                                                       } else if (var3 != 89) {
                                                                                          if (~var3 != -91) {
                                                                                             if (var3 != 91) {
                                                                                                if (~var3 == -94) {
                                                                                                   this.e = 3;
                                                                                                   this.c = (short)var2.k(1355769544);
                                                                                                } else if (var3 != 94) {
                                                                                                   if (~var3 == -96) {
                                                                                                      this.e = 5;
                                                                                                   } else if (var3 != 96) {
                                                                                                      if (var3 == 97) {
                                                                                                         this.hb = true;
                                                                                                      } else if (~var3 == -250) {
                                                                                                         int var11 = var2.n(var1 + 2129506657);
                                                                                                         if (this.k == null) {
                                                                                                            int var18 = Class_pa.f(var11, var1 ^ 2129500593);
                                                                                                            this.k = new Class_tg(var18);
                                                                                                         }

                                                                                                         for (int var19 = 0; var11 > var19; var19++) {
                                                                                                            boolean var6 = ~var2.n(-6677) == -2;
                                                                                                            int var7 = var2.b((byte)-70);
                                                                                                            Object var8;
                                                                                                            if (var6) {
                                                                                                               var8 = new Class_ef(var2.e(var1 + 2129513461));
                                                                                                            } else {
                                                                                                               var8 = new Class_kg(var2.h(var1 + 2129507806));
                                                                                                            }

                                                                                                            this.k.a((byte)11, (Class_li)var8, var7);
                                                                                                         }
                                                                                                      }
                                                                                                   } else {
                                                                                                      this.V = true;
                                                                                                   }
                                                                                                } else {
                                                                                                   this.e = 4;
                                                                                                }
                                                                                             } else {
                                                                                                this.t = true;
                                                                                             }
                                                                                          } else {
                                                                                             this.b = true;
                                                                                          }
                                                                                       } else {
                                                                                          this.M = false;
                                                                                       }
                                                                                    }
                                                                                 } else {
                                                                                    this.e = 2;
                                                                                    this.c = (short)(256 * var2.n(var1 + 2129506657));
                                                                                 }
                                                                              } else {
                                                                                 this.x = var2.k(1355769544);
                                                                                 this.q = var2.n(-6677);
                                                                              }
                                                                           } else {
                                                                              this.n = var2.n(-6677);
                                                                           }
                                                                        } else {
                                                                           this.j = true;
                                                                        }
                                                                     } else {
                                                                        this.U = true;
                                                                     }
                                                                  } else {
                                                                     this.E = var2.p(var1 + 2129490845);
                                                                  }
                                                               } else {
                                                                  this.g = var2.p(var1 + 2129490845);
                                                               }
                                                            } else {
                                                               this.F = var2.n(-6677);
                                                            }
                                                         } else {
                                                            this.O = var2.k(1355769544);
                                                         }
                                                      } else {
                                                         this.m = true;
                                                      }
                                                   } else {
                                                      this.v = var2.k(1355769544);
                                                   }
                                                } else {
                                                   int var13 = var2.n(var1 ^ 2129514849);
                                                   this.d = new byte[var13];

                                                   for (int var21 = 0; var13 > var21; var21++) {
                                                      this.d[var21] = var2.o(3390);
                                                   }
                                                }
                                             } else {
                                                int var14 = var2.n(var1 + 2129506657);
                                                this.A = new short[var14];
                                                this.nb = new short[var14];

                                                for (int var22 = 0; ~var22 > ~var14; var22++) {
                                                   this.nb[var22] = (short)var2.k(1355769544);
                                                   this.A[var22] = (short)var2.k(1355769544);
                                                }
                                             }
                                          } else {
                                             int var15 = var2.n(-6677);
                                             this.w = new short[var15];
                                             this.qb = new short[var15];

                                             for (int var23 = 0; var15 > var23; var23++) {
                                                this.qb[var23] = (short)var2.k(1355769544);
                                                this.w[var23] = (short)var2.k(1355769544);
                                             }
                                          }
                                       } else {
                                          this.u = 5 * var2.o(var1 + 2129516724);
                                       }
                                    } else {
                                       this.db = var2.o(3390);
                                    }
                                 } else {
                                    this.pb = var2.n(var1 + 2129506657);
                                 }
                              } else {
                                 this.mb = 1;
                              }
                           } else {
                              this.S = var2.k(1355769544);
                              if (~this.S == -65536) {
                                 this.S = -1;
                              }
                           }
                        } else {
                           this.Y = true;
                        }
                     } else {
                        this.h = true;
                     }
                  } else {
                     this.e = 1;
                  }
               } else {
                  this.mb = 0;
                  this.ub = false;
               }
            } else {
               this.D = var2.n(var1 ^ 2129514849);
            }
         } else {
            int var16 = var2.n(-6677);
            if (~var16 < -1) {
               if (this.i != null && !Class_j.fb) {
                  var2.p += 2 * var16;
               } else {
                  this.i = new int[var16];
                  this.ab = null;

                  for (int var24 = 0; var16 > var24; var24++) {
                     this.i[var24] = var2.k(1355769544);
                  }
               }
            }
         }

         fb++;
         if (var1 != -2129513334) {
            this.k = null;
         }
      } catch (RuntimeException var9) {
         throw Class_sh.a(var9, "ub.K(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
      }
   }

   final Class_ub b(int var1) {
      try {
         ob++;
         int var2 = -1;
         if (this.r != var1) {
            var2 = Class_cb.a(this.r, false);
         } else if (this.N != -1) {
            var2 = Class_sb.i[this.N];
         }

         if (~var2 <= -1 && var2 < this.J.length + -1 && ~this.J[var2] != 0) {
            return Class_qe.a(126, this.J[var2]);
         } else {
            int var3 = this.J[this.J.length - 1];
            return var3 == -1 ? null : Class_qe.a(87, var3);
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "ub.N(" + var1 + ')');
      }
   }

   final void a(byte var1, Class_lh var2) {
      try {
         while (true) {
            int var3 = var2.n(-6677);
            if (~var3 == -1) {
               if (var1 != 29) {
                  this.a(62);
               }

               Z++;
               return;
            }

            this.a(-2129513334, var2, var3);
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "ub.M(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final boolean c(int var1) {
      int var4 = client.lb;

      try {
         eb++;
         if (var1 < 88) {
            a(123, (byte)83, -84);
         }

         if (this.i == null) {
            return true;
         } else {
            boolean var2 = true;
            int var3 = 0;
            if (var4 == 0 && this.i.length <= var3) {
               return var2;
            } else {
               do {
                  var2 &= Class_cd.I.a(65535 & this.i[var3], 0, (byte)-113);
               } while (this.i.length > ++var3);

               return var2;
            }
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "ub.L(" + var1 + ')');
      }
   }

   public static void d(int var0) {
      try {
         H = null;
         gb = null;
         if (var0 == 0) {
            L = null;
            jb = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ub.F(" + var0 + ')');
      }
   }

   final Class_h a(
      Class_dh var1, Class_uc var2, boolean var3, int var4, int var5, int var6, int var7, int[][] var8, int[][] var9, int var10, int var11, int var12
   ) {
      try {
         long var13;
         label70: {
            l++;
            if (this.ab == null) {
               var13 = (this.vb << 2069897482) - -var7;
               if (client.lb == 0) {
                  break label70;
               }
            }

            var13 = (this.vb << 1166367274) - -(var12 << -586457341) + var7;
         }

         Class_qa var15 = (Class_qa)Class_vh.eb.a(14366, var13);
         if (var15 == null) {
            Class_ne var16 = this.a(var7, 0, var12);
            if (var16 == null) {
               return null;
            }

            var15 = new Class_qa(var16, this.db + 64, 5 * this.u + 768, -50, -10, -50);
            Class_vh.eb.a(var15, var10 ^ 65433, var13);
         }

         if (var10 != 65535) {
            return null;
         } else {
            boolean var18 = false;
            if (var2 != null) {
               var15 = (Class_qa)var2.a(var6, var15, var7, -11436);
               var18 = true;
            }

            if (~var12 == -11 && ~var7 < -4) {
               if (!var18) {
                  var18 = true;
                  var15 = (Class_qa)var15.b(true, true);
               }

               var15.e(256);
            }

            if (~this.e != -1) {
               if (!var18) {
                  var18 = true;
                  var15 = (Class_qa)var15.b(true, true);
               }

               var15 = var15.a(this.e, this.c, var9, var8, var4, var5, var11, false);
            }

            Class_di.T.e = var15;
            return Class_di.T;
         }
      } catch (RuntimeException var17) {
         throw Class_sh.a(
            var17,
            "ub.D("
               + (var1 != null ? "{...}" : "null")
               + ','
               + (var2 != null ? "{...}" : "null")
               + ','
               + var3
               + ','
               + var4
               + ','
               + var5
               + ','
               + var6
               + ','
               + var7
               + ','
               + (var8 != null ? "{...}" : "null")
               + ','
               + (var9 != null ? "{...}" : "null")
               + ','
               + var10
               + ','
               + var11
               + ','
               + var12
               + ')'
         );
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private final Class_ne a(int var1, int var2, int var3) {
      int var10 = client.lb;

      try {
         boolean var5 = this.m;
         z++;
         Class_ne var4 = null;
         if (var3 == 2 && ~var1 < -4) {
            var5 = !var5;
         }

         if (this.ab != null) {
            int var6 = -1;
            int var7 = 0;
            if (var10 != 0 || var7 < this.ab.length) {
               do {
                  if (this.ab[var7] == var3) {
                     var6 = var7;
                     if (var10 == 0) {
                        break;
                     }
                  }
               } while (++var7 < this.ab.length);
            }

            if (var6 == -1) {
               return null;
            }

            int var8 = this.i[var6];
            if (var5) {
               var8 += 65536;
            }

            var4 = (Class_ne)Class_id.h.a(14366, (long)var8);
            if (var4 == null) {
               var4 = Class_ne.a(Class_cd.I, var8 & 65535, 0);
               if (var4 == null) {
                  return null;
               }

               if (var5) {
                  var4.e();
               }

               Class_id.h.a(var4, 107, var8);
            }
         } else {
            if (~var3 != -11) {
               return null;
            }

            if (this.i == null) {
               return null;
            }

            int var12 = this.i.length;

            for (int var14 = 0; ~var14 > ~var12; var14++) {
               int var16 = this.i[var14];
               if (var5) {
                  var16 += 65536;
               }

               var4 = (Class_ne)Class_id.h.a(14366, (long)var16);
               if (var4 == null) {
                  var4 = Class_ne.a(Class_cd.I, var16 & 65535, 0);
                  if (var4 == null) {
                     return null;
                  }

                  if (var5) {
                     var4.e();
                  }

                  Class_id.h.a(var4, 103, var16);
               }

               if (var12 > 1) {
                  Class_cc.Kb[var14] = var4;
               }
            }

            if (~var12 < -2) {
               var4 = new Class_ne(Class_cc.Kb, var12);
            }
         }

         boolean var15;
         label231: {
            if (~this.g != -1 || ~this.E != -1 || this.B != 0) {
               var15 = true;
               if (var10 == 0) {
                  break label231;
               }
            }

            var15 = false;
         }

         boolean var13;
         label183: {
            if (~this.s == -129 && ~this.O == -129 && this.T == 128) {
               var13 = false;
               if (var10 == 0) {
                  break label183;
               }
            }

            var13 = true;
         }

         Class_ne var17 = new Class_ne(var4, var1 == var2 && !var13 && !var15, this.qb == null, this.nb == null, true);
         if (~var3 == -5 && var1 > 3) {
            var17.c(256);
            var17.c(45, 0, -45);
         }

         label169: {
            var1 &= 3;
            if (var1 != 1) {
               if (var1 != 2) {
                  if (~var1 != -4) {
                     break label169;
                  }

                  var17.m();
                  if (var10 == 0) {
                     break label169;
                  }
               }

               var17.j();
               if (var10 == 0) {
                  break label169;
               }
            }

            var17.k();
         }

         if (this.qb != null) {
            int var9 = 0;
            if (var10 != 0 || var9 < this.qb.length) {
               do {
                  if (this.d != null && var9 < this.d.length) {
                     var17.b(this.qb[var9], Class_fb.e[this.d[var9] & 255]);
                     if (var10 == 0) {
                        var9++;
                        continue;
                     }
                  }

                  var17.b(this.qb[var9], this.w[var9]);
                  var9++;
               } while (var9 < this.qb.length);
            }
         }

         if (this.nb != null) {
            int var18 = 0;
            if (var10 != 0 || var18 < this.nb.length) {
               do {
                  var17.a(this.nb[var18], this.A[var18]);
               } while (++var18 < this.nb.length);
            }
         }

         if (var13) {
            var17.e(this.s, this.O, this.T);
         }

         if (var15) {
            var17.c(this.g, this.E, this.B);
         }

         return var17;
      } catch (RuntimeException var11) {
         throw Class_sh.a(var11, "ub.I(" + var1 + ',' + var2 + ',' + var3 + ')');
      }
   }

   public Class_ub() {
      this.b = false;
      this.s = 128;
      this.u = 0;
      this.v = -1;
      this.j = false;
      this.g = 0;
      this.n = -1;
      this.m = false;
      this.B = 0;
      this.O = 128;
      this.E = 0;
      this.r = -1;
      this.Q = 0;
      this.x = -1;
      this.M = true;
      this.U = false;
      this.db = 0;
      this.D = 1;
      this.Y = false;
      this.q = 0;
      this.f = 0;
      this.h = false;
      this.N = -1;
      this.C = 1;
      this.o = -1;
      this.t = false;
      this.y = -1;
      this.W = new Class_r[5];
      this.S = -1;
      this.lb = Class_jb.Y;
      this.V = false;
      this.T = 128;
      this.mb = 2;
      this.hb = false;
      this.ib = true;
      this.pb = 16;
      this.rb = true;
      this.F = 0;
      this.ub = true;
   }
}
