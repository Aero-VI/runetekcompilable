final class Class_nd {
   static int[] a;
   static int b;
   static int c;
   int d;
   int e;
   static int f;
   private short[] g;
   private Class_tg h;
   static int i;
   int j;
   private int k = 128;
   static int l;
   static Class_re m;
   short n;
   boolean o;
   int p;
   private byte[] q;
   short r;
   boolean s;
   private short[] t;
   private int u;
   static int v;
   private int w;
   int x;
   int y;
   int[] z;
   Class_r[] A = new Class_r[5];
   boolean B;
   static int C = -1;
   private int[] D;
   short E;
   int F = -1;
   boolean G;
   int H;
   int I;
   private static Class_r J = Class_tc.a(43, "null");
   private short[] K;
   private short[] L;
   int M;
   static int N;
   byte O;
   int P;
   boolean Q;
   static int R;
   static int S;
   int T;
   static int U;
   byte V;
   private int[] W;
   static Class_r X = Class_tc.a(43, "Hierhin gehen");
   int Y;
   private int[][] Z;
   int ab;
   static int bb;
   static int cb;
   private int db;
   private int eb;
   int fb;
   short gb;
   static int hb = 0;
   Class_r ib;
   int jb;
   static int kb;
   private int lb;
   byte mb;
   int nb;
   static int ob;

   final Class_r a(int var1, Class_r var2, int var3) {
      try {
         f++;
         if (this.h == null) {
            return var2;
         } else if (var1 != 0) {
            return null;
         } else {
            Class_ef var4 = (Class_ef)this.h.a(var3, -80);
            return var4 == null ? var2 : var4.p;
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "nd.K(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, Class_r var1) {
      int var3 = client.lb;

      try {
         b++;
         Class_uf var2 = (Class_uf)Class_ff.a.e((byte)76);
         if (var3 == 0 && var2 == null) {
            if (var0 != 0) {
               N = 94;
            }
         } else {
            while (!var2.O.a(var1, (byte)107)) {
               var2 = (Class_uf)Class_ff.a.c((byte)62);
               if (var2 == null) {
                  if (var0 != 0) {
                     N = 94;
                     return;
                  }

                  return;
               }
            }

            Class_ed.a = var2;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "nd.J(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   final int a(int var1, int var2, int var3) {
      try {
         cb++;
         if (this.h == null) {
            return var2;
         } else {
            Class_kg var4 = (Class_kg)this.h.a(var1, -54);
            if (var4 == null) {
               return var2;
            } else {
               int var5 = 71 / ((var3 - 40) / 45);
               return var4.r;
            }
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "nd.F(" + var1 + 44 + var2 + 44 + var3 + 41);
      }
   }

   final void a(Class_lh var1, byte var2) {
      try {
         while (true) {
            int var3 = var1.n(-6677);
            if (var3 == 0) {
               ob++;
               if (var2 != -53) {
                  this.a(-106);
                  return;
               }

               return;
            }

            this.a(var3, var1, false);
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "nd.D(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
      }
   }

   final boolean a(int var1) {
      try {
         U++;
         if (this.z == null) {
            return ~this.x != 0 || this.y != -1 || this.nb != -1;
         } else {
            for (int var2 = var1; this.z.length > var2; var2++) {
               if (this.z[var2] != -1) {
                  Class_nd var3 = Class_i.c(this.z[var2], var1 ^ -119);
                  if (~var3.x != 0 || ~var3.y != 0 || ~var3.nb != 0) {
                     return true;
                  }
               }
            }

            return false;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "nd.A(" + var1 + ')');
      }
   }

   static final void b(int var0) {
      try {
         Class_vb.a.b((byte)94);
         R++;
         if (var0 != -10705) {
            b(5);
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "nd.B(" + var0 + ')');
      }
   }

   public static void c(int var0) {
      try {
         if (var0 == 1) {
            J = null;
            m = null;
            a = null;
            X = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "nd.E(" + var0 + ')');
      }
   }

   final Class_nd d(int var1) {
      try {
         kb++;
         if (var1 != -94) {
            c(80);
         }

         int var2 = -1;
         if (~this.u != 0) {
            var2 = Class_cb.a(this.u, false);
         } else if (~this.lb != 0) {
            var2 = Class_sb.i[this.lb];
         }

         if (var2 >= 0 && -1 + this.z.length > var2 && ~this.z[var2] != 0) {
            return Class_i.c(this.z[var2], 48);
         } else {
            int var3 = this.z[this.z.length + -1];
            return ~var3 != 0 ? Class_i.c(var3, 75) : null;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "nd.G(" + var1 + ')');
      }
   }

   private final void a(int var1, Class_lh var2, boolean var3) {
      try {
         bb++;
         if (~var1 != -2) {
            if (~var1 != -3) {
               if (~var1 != -13) {
                  if (~var1 != -14) {
                     if (var1 == 14) {
                        this.I = var2.k(1355769544);
                     } else if (~var1 != -16) {
                        if (var1 != 16) {
                           if (~var1 != -18) {
                              if (~var1 <= -31 && ~var1 > -36) {
                                 this.A[-30 + var1] = var2.e(127);
                                 if (this.A[var1 - 30].a(false, Class_ke.r)) {
                                    this.A[var1 - 30] = null;
                                 }
                              } else if (~var1 == -41) {
                                 int var4 = var2.n(-6677);
                                 this.L = new short[var4];
                                 this.g = new short[var4];

                                 for (int var5 = 0; var4 > var5; var5++) {
                                    this.L[var5] = (short)var2.k(1355769544);
                                    this.g[var5] = (short)var2.k(1355769544);
                                 }
                              } else if (var1 == 41) {
                                 int var10 = var2.n(-6677);
                                 this.K = new short[var10];
                                 this.t = new short[var10];

                                 for (int var17 = 0; ~var17 > ~var10; var17++) {
                                    this.K[var17] = (short)var2.k(1355769544);
                                    this.t[var17] = (short)var2.k(1355769544);
                                 }
                              } else if (var1 == 42) {
                                 int var11 = var2.n(-6677);
                                 this.q = new byte[var11];

                                 for (int var18 = 0; ~var11 < ~var18; var18++) {
                                    this.q[var18] = var2.o(3390);
                                 }
                              } else if (var1 != 60) {
                                 if (~var1 != -94) {
                                    if (var1 == 95) {
                                       this.M = var2.k(1355769544);
                                    } else if (~var1 != -98) {
                                       if (~var1 == -99) {
                                          this.k = var2.k(1355769544);
                                       } else if (var1 != 99) {
                                          if (var1 != 100) {
                                             if (var1 != 101) {
                                                if (var1 == 102) {
                                                   this.H = var2.k(1355769544);
                                                } else if (~var1 == -104) {
                                                   this.Y = var2.k(1355769544);
                                                } else if (var1 == 106 || ~var1 == -119) {
                                                   this.u = var2.k(1355769544);
                                                   if (~this.u == -65536) {
                                                      this.u = -1;
                                                   }

                                                   this.lb = var2.k(1355769544);
                                                   if (this.lb == 65535) {
                                                      this.lb = -1;
                                                   }

                                                   int var14 = -1;
                                                   if (var1 == 118) {
                                                      var14 = var2.k(1355769544);
                                                      if (var14 == 65535) {
                                                         var14 = -1;
                                                      }
                                                   }

                                                   int var22 = var2.n(-6677);
                                                   this.z = new int[2 + var22];

                                                   for (int var26 = 0; ~var26 >= ~var22; var26++) {
                                                      this.z[var26] = var2.k(1355769544);
                                                      if (~this.z[var26] == -65536) {
                                                         this.z[var26] = -1;
                                                      }
                                                   }

                                                   this.z[1 + var22] = var14;
                                                } else if (var1 != 107) {
                                                   if (~var1 == -110) {
                                                      this.s = false;
                                                   } else if (var1 == 111) {
                                                      this.Q = false;
                                                   } else if (var1 == 113) {
                                                      this.gb = (short)var2.k(1355769544);
                                                      this.E = (short)var2.k(1355769544);
                                                   } else if (~var1 == -115) {
                                                      this.mb = var2.o(3390);
                                                      this.V = var2.o(3390);
                                                   } else if (var1 == 115) {
                                                      this.n = (short)(4 * var2.n(-6677));
                                                      this.r = (short)(var2.n(-6677) * 4);
                                                   } else if (~var1 == -120) {
                                                      this.O = var2.o(3390);
                                                   } else if (~var1 != -121) {
                                                      if (~var1 == -122) {
                                                         this.Z = new int[this.W.length][];
                                                         int var12 = var2.n(-6677);

                                                         for (int var19 = 0; var19 < var12; var19++) {
                                                            int var6 = var2.n(-6677);
                                                            int[] var7 = this.Z[var6] = new int[3];
                                                            var7[0] = var2.o(3390);
                                                            var7[1] = var2.o(3390);
                                                            var7[2] = var2.o(3390);
                                                         }
                                                      } else if (var1 == 122) {
                                                         this.F = var2.k(1355769544);
                                                      } else if (~var1 == -250) {
                                                         int var13 = var2.n(-6677);
                                                         if (this.h == null) {
                                                            int var20 = Class_pa.f(var13, -21189);
                                                            this.h = new Class_tg(var20);
                                                         }

                                                         for (int var21 = 0; var13 > var21; var21++) {
                                                            boolean var25 = ~var2.n(-6677) == -2;
                                                            int var27 = var2.b((byte)50);
                                                            Object var8;
                                                            if (var25) {
                                                               var8 = new Class_ef(var2.e(127));
                                                            } else {
                                                               var8 = new Class_kg(var2.h(-5528));
                                                            }

                                                            this.h.a((byte)-59, (Class_li)var8, var27);
                                                         }
                                                      }
                                                   } else {
                                                      this.x = var2.k(1355769544);
                                                      this.y = var2.k(1355769544);
                                                      this.nb = var2.k(1355769544);
                                                      this.fb = var2.n(-6677);
                                                   }
                                                } else {
                                                   this.B = false;
                                                }
                                             } else {
                                                this.eb = 5 * var2.o(3390);
                                             }
                                          } else {
                                             this.w = var2.o(3390);
                                          }
                                       } else {
                                          this.o = true;
                                       }
                                    } else {
                                       this.db = var2.k(1355769544);
                                    }
                                 } else {
                                    this.G = false;
                                 }
                              } else {
                                 int var15 = var2.n(-6677);
                                 this.D = new int[var15];

                                 for (int var23 = 0; ~var15 < ~var23; var23++) {
                                    this.D[var23] = var2.k(1355769544);
                                 }
                              }
                           } else {
                              this.I = var2.k(1355769544);
                              this.e = var2.k(1355769544);
                              this.P = var2.k(1355769544);
                              this.j = var2.k(1355769544);
                           }
                        } else {
                           this.p = var2.k(1355769544);
                        }
                     } else {
                        this.jb = var2.k(1355769544);
                     }
                  } else {
                     this.d = var2.k(1355769544);
                  }
               } else {
                  this.T = var2.n(-6677);
               }
            } else {
               this.ib = var2.e(127);
            }
         } else {
            int var16 = var2.n(-6677);
            this.W = new int[var16];

            for (int var24 = 0; ~var24 > ~var16; var24++) {
               this.W[var24] = var2.k(1355769544);
            }
         }

         if (var3) {
            this.d(29);
         }
      } catch (RuntimeException var9) {
         throw Class_sh.a(var9, "nd.M(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
      }
   }

   final boolean e(int var1) {
      try {
         c++;
         if (this.z == null) {
            return true;
         } else {
            int var2;
            label35: {
               var2 = -1;
               if (~this.u != 0) {
                  var2 = Class_cb.a(this.u, false);
                  if (client.lb == 0) {
                     break label35;
                  }
               }

               if (~this.lb != 0) {
                  var2 = Class_sb.i[this.lb];
               }
            }

            if (~var2 <= -1 && ~(this.z.length - 1) < ~var2 && this.z[var2] != -1) {
               if (var1 != 8937) {
                  this.a(90, null, true);
               }

               return true;
            } else {
               int var3 = this.z[-1 + this.z.length];
               return ~var3 != 0;
            }
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "nd.C(" + var1 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final Class_jh a(Class_uc var1, byte var2, int var3) {
      int var11 = client.lb;

      try {
         i++;
         if (this.z != null) {
            Class_nd var13 = this.d(var2 + -106);
            return var13 == null ? null : var13.a(var1, (byte)12, var3);
         } else if (this.D == null) {
            return null;
         } else {
            Class_jh var4 = (Class_jh)Class_pj.b.a(14366, (long)this.ab);
            if (var4 == null) {
               boolean var5 = false;
               int var6 = 0;
               if (var11 != 0 || var6 < this.D.length) {
                  do {
                     if (!Class_oa.g.a(this.D[var6], 0, (byte)-98)) {
                        var5 = true;
                     }
                  } while (++var6 < this.D.length);
               }

               if (var5) {
                  return null;
               }

               Class_ne[] var7 = new Class_ne[this.D.length];
               int var8 = 0;
               if (var11 != 0 || var8 < this.D.length) {
                  do {
                     var7[var8] = Class_ne.a(Class_oa.g, this.D[var8], 0);
                  } while (++var8 < this.D.length);
               }

               Class_ne var9;
               label99: {
                  if (~var7.length != -2) {
                     var9 = new Class_ne(var7, var7.length);
                     if (var11 == 0) {
                        break label99;
                     }
                  }

                  var9 = var7[0];
               }

               if (this.L != null) {
                  int var10 = 0;
                  if (var11 != 0 || var10 < this.L.length) {
                     do {
                        if (this.q == null || ~var10 <= ~this.q.length) {
                           var9.b(this.L[var10], this.g[var10]);
                           if (var11 == 0) {
                              var10++;
                              continue;
                           }
                        }

                        var9.b(this.L[var10], Class_oj.X[255 & this.q[var10]]);
                        var10++;
                     } while (var10 < this.L.length);
                  }
               }

               if (this.K != null) {
                  int var14 = 0;
                  if (var11 != 0 || ~this.K.length < ~var14) {
                     do {
                        var9.a(this.K[var14], this.t[var14]);
                     } while (~this.K.length < ~(++var14));
                  }
               }

               var4 = var9.c(64, 768, -50, -10, -50);
               Class_pj.b.a(var4, 97, this.ab);
            }

            if (var1 != null) {
               var4 = var1.a((byte)-73, var4, var3);
            }

            if (var2 != 12) {
               this.a(38, null, (byte)38, null, -90);
            }

            return var4;
         }
      } catch (RuntimeException var12) {
         throw Class_sh.a(var12, "nd.L(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final Class_jh a(int var1, Class_uc var2, byte var3, Class_uc var4, int var5) {
      int var13 = client.lb;

      try {
         S++;
         if (this.z != null) {
            Class_nd var15 = this.d(-94);
            return var15 == null ? null : var15.a(var1, var2, (byte)-1, var4, var5);
         } else {
            Class_jh var6 = (Class_jh)Class_aj.h.a(14366, (long)this.ab);
            if (var6 == null) {
               boolean var7 = false;
               int var8 = 0;
               if (var13 != 0 || ~this.W.length < ~var8) {
                  do {
                     if (!Class_oa.g.a(this.W[var8], 0, (byte)-126)) {
                        var7 = true;
                     }
                  } while (~this.W.length < ~(++var8));
               }

               if (var7) {
                  return null;
               }

               Class_ne[] var10 = new Class_ne[this.W.length];
               int var11 = 0;
               if (var13 != 0 || this.W.length > var11) {
                  do {
                     var10[var11] = Class_ne.a(Class_oa.g, this.W[var11], 0);
                     if (this.Z != null && this.Z[var11] != null && var10[var11] != null) {
                        var10[var11].c(this.Z[var11][0], this.Z[var11][1], this.Z[var11][2]);
                     }
                  } while (this.W.length > ++var11);
               }

               Class_ne var9;
               label130: {
                  if (var10.length == 1) {
                     var9 = var10[0];
                     if (var13 == 0) {
                        break label130;
                     }
                  }

                  var9 = new Class_ne(var10, var10.length);
               }

               if (this.L != null) {
                  int var12 = 0;
                  if (var13 != 0 || var12 < this.L.length) {
                     do {
                        if (this.q != null && var12 < this.q.length) {
                           var9.b(this.L[var12], Class_oj.X[this.q[var12] & 255]);
                           if (var13 == 0) {
                              var12++;
                              continue;
                           }
                        }

                        var9.b(this.L[var12], this.g[var12]);
                        var12++;
                     } while (var12 < this.L.length);
                  }
               }

               if (this.K != null) {
                  int var18 = 0;
                  if (var13 != 0 || var18 < this.K.length) {
                     do {
                        var9.a(this.K[var18], this.t[var18]);
                     } while (++var18 < this.K.length);
                  }
               }

               var6 = var9.c(this.w + 64, 850 - -this.eb, -30, -50, -30);
               Class_aj.h.a(var6, 107, this.ab);
            }

            Class_jh var17;
            label175: {
               int var16 = 35 / ((-64 - var3) / 55);
               if (var4 == null || var2 == null) {
                  if (var4 != null) {
                     var17 = var4.a(var5, true, var6);
                     if (var13 == 0) {
                        break label175;
                     }
                  }

                  if (var2 == null) {
                     var17 = var6.b(true, true);
                     if (var13 == 0) {
                        break label175;
                     }
                  }

                  var17 = var2.a(var1, true, var6);
                  if (var13 == 0) {
                     break label175;
                  }
               }

               var17 = var4.a(var6, var2, var1, (byte)104, var5);
            }

            if (~this.db != -129 || this.k != 128) {
               var17.b(this.db, this.k, this.db);
            }

            return var17;
         }
      } catch (RuntimeException var14) {
         throw Class_sh.a(
            var14, "nd.I(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ',' + var5 + ')'
         );
      }
   }

   final void f(int var1) {
      try {
         l++;
         if (var1 != 24381) {
            this.lb = -100;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "nd.H(" + var1 + ')');
      }
   }

   public Class_nd() {
      this.u = -1;
      this.y = -1;
      this.Q = true;
      this.e = -1;
      this.p = -1;
      this.I = -1;
      this.G = true;
      this.w = 0;
      this.j = -1;
      this.H = -1;
      this.E = 0;
      this.n = 0;
      this.x = -1;
      this.B = true;
      this.db = 128;
      this.P = -1;
      this.jb = -1;
      this.o = false;
      this.gb = 0;
      this.eb = 0;
      this.s = true;
      this.Y = 32;
      this.d = -1;
      this.lb = -1;
      this.M = -1;
      this.O = 0;
      this.ib = J;
      this.V = -16;
      this.nb = -1;
      this.mb = -96;
      this.r = 0;
      this.T = 1;
      this.fb = 0;
   }
}
