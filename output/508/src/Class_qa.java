final class Class_qa extends Class_jh {
   int[] q;
   private byte[] r;
   private int[] s;
   private int t;
   private int[] u;
   private int[] v;
   private int[][] w;
   private short x;
   private short y;
   int[] z;
   private byte[] A;
   boolean B = false;
   private short D;
   private short E;
   private short[] F;
   private byte[] G;
   private short H;
   private int[] I;
   private short J;
   private short K;
   int[] L;
   int M;
   private int N = 0;
   private int[] O;
   private int[] P;
   private int[][] Q;
   private byte R;
   private int[] S;
   private short T;
   private static Class_qa U = new Class_qa();
   private int[] V;
   private static Class_qa W = new Class_qa();
   private int[] X;
   private static byte[] Y = new byte[1];
   private static int[] Z = new int[4096];
   private static int ab;
   private static byte[] bb = new byte[1];
   private static int[] cb = new int[12];
   private static int[] db = new int[10];
   private static int[] eb = new int[4096];
   private static int[] fb = new int[4096];
   private static boolean[] gb = new boolean[4096];
   private static int hb;
   private static int ib;
   private static int[] jb = new int[10];
   private static int[][] kb = new int[12][4096];
   private static int[] lb = new int[4096];
   private static boolean[] mb = new boolean[4096];
   private static int[] nb = new int[4096];
   private static int[] ob = new int[4096];
   private static int[] pb = new int[4096];
   private static int[] qb = new int[10];
   private static int[] rb = new int[4096];
   private static int[][] sb = new int[1600][512];
   private static int[] tb = new int[12];
   private static int[] ub = new int[1600];

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         if (!this.B) {
            this.l();
         }

         int var8 = Class_kd.n;
         int var9 = Class_kd.j;
         int var10 = Class_kd.e[var1];
         int var11 = Class_kd.q[var1];
         int var12 = Class_kd.e[var2];
         int var13 = Class_kd.q[var2];
         int var14 = Class_kd.e[var3];
         int var15 = Class_kd.q[var3];
         int var16 = Class_kd.e[var4];
         int var17 = Class_kd.q[var4];
         int var18 = var6 * var16 + var7 * var17 >> 16;

         for (int var19 = 0; var19 < this.M; var19++) {
            int var20 = this.L[var19];
            int var21 = this.q[var19];
            int var22 = this.z[var19];
            if (var3 != 0) {
               int var23 = var21 * var14 + var20 * var15 >> 16;
               var21 = var21 * var15 - var20 * var14 >> 16;
               var20 = var23;
            }

            if (var1 != 0) {
               int var29 = var21 * var11 - var22 * var10 >> 16;
               var22 = var21 * var10 + var22 * var11 >> 16;
               var21 = var29;
            }

            if (var2 != 0) {
               int var30 = var22 * var12 + var20 * var13 >> 16;
               var22 = var22 * var13 - var20 * var12 >> 16;
               var20 = var30;
            }

            var20 += var5;
            var21 += var6;
            var22 += var7;
            int var31 = var21 * var17 - var22 * var16 >> 16;
            var22 = var21 * var16 + var22 * var17 >> 16;
            rb[var19] = var22 - var18;
            nb[var19] = var8 + (var20 << 9) / var22;
            Z[var19] = var9 + (var31 << 9) / var22;
            if (this.t > 0) {
               pb[var19] = var20;
               lb[var19] = var31;
               eb[var19] = var22;
            }
         }

         this.a(false, false, 0L, this.K, this.K << 1);
      } catch (RuntimeException var24) {
      }
   }

   final int h() {
      if (!this.B) {
         this.l();
      }

      return this.D;
   }

   private final boolean a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (var2 < var3 && var2 < var4 && var2 < var5) {
         return false;
      } else if (var2 > var3 && var2 > var4 && var2 > var5) {
         return false;
      } else {
         return var1 < var6 && var1 < var7 && var1 < var8 ? false : var1 <= var6 || var1 <= var7 || var1 <= var8;
      }
   }

   final void b(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      try {
         if (!this.B) {
            this.l();
         }

         int var9 = Class_kd.n;
         int var10 = Class_kd.j;
         int var11 = Class_kd.e[var1];
         int var12 = Class_kd.q[var1];
         int var13 = Class_kd.e[var2];
         int var14 = Class_kd.q[var2];
         int var15 = Class_kd.e[var3];
         int var16 = Class_kd.q[var3];
         int var17 = Class_kd.e[var4];
         int var18 = Class_kd.q[var4];
         int var19 = var6 * var17 + var7 * var18 >> 16;

         for (int var20 = 0; var20 < this.M; var20++) {
            int var21 = this.L[var20];
            int var22 = this.q[var20];
            int var23 = this.z[var20];
            if (var3 != 0) {
               int var24 = var22 * var15 + var21 * var16 >> 16;
               var22 = var22 * var16 - var21 * var15 >> 16;
               var21 = var24;
            }

            if (var1 != 0) {
               int var30 = var22 * var12 - var23 * var11 >> 16;
               var23 = var22 * var11 + var23 * var12 >> 16;
               var22 = var30;
            }

            if (var2 != 0) {
               int var31 = var23 * var13 + var21 * var14 >> 16;
               var23 = var23 * var14 - var21 * var13 >> 16;
               var21 = var31;
            }

            var21 += var5;
            var22 += var6;
            var23 += var7;
            int var32 = var22 * var18 - var23 * var17 >> 16;
            var23 = var22 * var17 + var23 * var18 >> 16;
            rb[var20] = var23 - var19;
            nb[var20] = var9 + (var21 << 9) / var8;
            Z[var20] = var10 + (var32 << 9) / var8;
            if (this.t > 0) {
               pb[var20] = var21;
               lb[var20] = var32;
               eb[var20] = var23;
            }
         }

         this.a(false, false, 0L, this.K, this.K << 1);
      } catch (RuntimeException var25) {
      }
   }

   final int a() {
      if (!this.B) {
         this.l();
      }

      return this.y;
   }

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
      if (!this.B) {
         this.l();
      }

      int var11 = var8 * var5 - var6 * var4 >> 16;
      int var12 = var7 * var2 + var11 * var3 >> 16;
      int var13 = var12 + (this.T * var3 + this.J * var2 >> 16);
      if (var13 > 50) {
         int var14 = var12 + (-this.T * var3 + this.y * var2 >> 16);
         if (var14 < 3500) {
            int var15 = var8 * var4 + var6 * var5 >> 16;
            int var16 = var15 + this.T << 9;
            if (var16 / var13 > Class_nd.v) {
               int var17 = var15 - this.T << 9;
               if (var17 / var13 < Class_tb.o) {
                  int var18 = var7 * var3 - var11 * var2 >> 16;
                  int var19 = var18 + (this.T * var2 + this.J * var3 >> 16) << 9;
                  if (var19 / var13 > Class_a.j) {
                     int var20 = var18 + (-this.T * var2 + this.y * var3 >> 16) << 9;
                     if (var20 / var13 < Class_vi.R) {
                        boolean var21 = false;
                        boolean var22 = var14 <= 50;
                        boolean var23 = var22 || this.t > 0;
                        int var24 = Class_kd.n;
                        int var25 = Class_kd.j;
                        int var26 = 0;
                        int var27 = 0;
                        if (var1 != 0) {
                           var26 = Class_kd.e[var1];
                           var27 = Class_kd.q[var1];
                        }

                        boolean var28 = false;
                        if (var9 > 0L && Class_oi.u && var14 > 0) {
                           int var29;
                           int var31;
                           if (var15 > 0) {
                              var29 = var17 / var13;
                              var31 = var16 / var14;
                           } else {
                              var29 = var17 / var14;
                              var31 = var16 / var13;
                           }

                           int var30;
                           int var32;
                           if (var18 > 0) {
                              var30 = var20 / var13;
                              var32 = var19 / var14;
                           } else {
                              var30 = var20 / var14;
                              var32 = var19 / var13;
                           }

                           if (Class_kc.u >= var29 && Class_kc.u <= var31 && Class_hh.i >= var30 && Class_hh.i <= var32) {
                              var29 = 999999;
                              var31 = -999999;
                              var30 = 999999;
                              var32 = -999999;
                              int[] var33 = new int[]{this.H, this.E, this.H, this.E, this.H, this.E, this.H, this.E};
                              int[] var34 = new int[]{this.x, this.x, this.D, this.D, this.x, this.x, this.D, this.D};
                              int[] var35 = new int[]{this.y, this.y, this.y, this.y, this.J, this.J, this.J, this.J};

                              for (int var36 = 0; var36 < 8; var36++) {
                                 int var37 = var33[var36];
                                 int var38 = var35[var36];
                                 int var39 = var34[var36];
                                 if (var1 != 0) {
                                    int var40 = var39 * var26 + var37 * var27 >> 16;
                                    var39 = var39 * var27 - var37 * var26 >> 16;
                                    var37 = var40;
                                 }

                                 var37 += var6;
                                 var38 += var7;
                                 var39 += var8;
                                 int var67 = var39 * var4 + var37 * var5 >> 16;
                                 var39 = var39 * var5 - var37 * var4 >> 16;
                                 var67 = var38 * var3 - var39 * var2 >> 16;
                                 var39 = var38 * var2 + var39 * var3 >> 16;
                                 if (var39 > 0) {
                                    int var41 = (var67 << 9) / var39;
                                    int var42 = (var67 << 9) / var39;
                                    if (var41 < var29) {
                                       var29 = var41;
                                    }

                                    if (var41 > var31) {
                                       var31 = var41;
                                    }

                                    if (var42 < var30) {
                                       var30 = var42;
                                    }

                                    if (var42 > var32) {
                                       var32 = var42;
                                    }
                                 }
                              }

                              if (Class_kc.u >= var29 && Class_kc.u <= var31 && Class_hh.i >= var30 && Class_hh.i <= var32) {
                                 if (super.p) {
                                    Class_tf.J[Class_ab.Q++] = var9;
                                 } else {
                                    var28 = true;
                                 }
                              }
                           }
                        }

                        for (int var45 = 0; var45 < this.M; var45++) {
                           int var47 = this.L[var45];
                           int var51 = this.q[var45];
                           int var54 = this.z[var45];
                           if (var1 != 0) {
                              int var58 = var54 * var26 + var47 * var27 >> 16;
                              var54 = var54 * var27 - var47 * var26 >> 16;
                              var47 = var58;
                           }

                           var47 += var6;
                           var51 += var7;
                           var54 += var8;
                           int var59 = var54 * var4 + var47 * var5 >> 16;
                           var54 = var54 * var5 - var47 * var4 >> 16;
                           var59 = var51 * var3 - var54 * var2 >> 16;
                           var54 = var51 * var2 + var54 * var3 >> 16;
                           rb[var45] = var54 - var12;
                           if (var54 >= 50) {
                              nb[var45] = var24 + (var59 << 9) / var54;
                              Z[var45] = var25 + (var59 << 9) / var54;
                           } else {
                              nb[var45] = -5000;
                              var21 = true;
                           }

                           if (var23) {
                              pb[var45] = var59;
                              lb[var45] = var59;
                              eb[var45] = var54;
                           }
                        }

                        try {
                           this.a(var21, var28, var9, var12 - var14, var13 - var14 + 2);
                        } catch (Exception var43) {
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private final void a(int var1, int var2, int var3, int var4) {
      if (var1 == 0) {
         int var12 = 0;
         ib = 0;
         hb = 0;
         ab = 0;

         for (int var16 = 0; var16 < this.M; var16++) {
            ib = ib + this.L[var16];
            hb = hb + this.q[var16];
            ab = ab + this.z[var16];
            var12++;
         }

         if (var12 > 0) {
            ib = ib / var12 + var2;
            hb = hb / var12 + var3;
            ab = ab / var12 + var4;
         } else {
            ib = var2;
            hb = var3;
            ab = var4;
         }
      } else if (var1 == 1) {
         for (int var11 = 0; var11 < this.M; var11++) {
            this.L[var11] = this.L[var11] + var2;
            this.q[var11] = this.q[var11] + var3;
            this.z[var11] = this.z[var11] + var4;
         }
      } else if (var1 == 2) {
         for (int var10 = 0; var10 < this.M; var10++) {
            this.L[var10] = this.L[var10] - ib;
            this.q[var10] = this.q[var10] - hb;
            this.z[var10] = this.z[var10] - ab;
            if (var4 != 0) {
               int var13 = Class_kd.e[var4];
               int var7 = Class_kd.q[var4];
               int var8 = this.q[var10] * var13 + this.L[var10] * var7 + 32767 >> 16;
               this.q[var10] = this.q[var10] * var7 - this.L[var10] * var13 + 32767 >> 16;
               this.L[var10] = var8;
            }

            if (var2 != 0) {
               int var14 = Class_kd.e[var2];
               int var17 = Class_kd.q[var2];
               int var19 = this.q[var10] * var17 - this.z[var10] * var14 + 32767 >> 16;
               this.z[var10] = this.q[var10] * var14 + this.z[var10] * var17 + 32767 >> 16;
               this.q[var10] = var19;
            }

            if (var3 != 0) {
               int var15 = Class_kd.e[var3];
               int var18 = Class_kd.q[var3];
               int var20 = this.z[var10] * var15 + this.L[var10] * var18 + 32767 >> 16;
               this.z[var10] = this.z[var10] * var18 - this.L[var10] * var15 + 32767 >> 16;
               this.L[var10] = var20;
            }

            this.L[var10] = this.L[var10] + ib;
            this.q[var10] = this.q[var10] + hb;
            this.z[var10] = this.z[var10] + ab;
         }
      } else if (var1 != 3) {
         if (var1 == 5) {
            for (int var9 = 0; var9 < this.N; var9++) {
               int var6 = (this.G[var9] & 255) + var2 * 8;
               if (var6 < 0) {
                  var6 = 0;
               } else if (var6 > 255) {
                  var6 = 255;
               }

               this.G[var9] = (byte)var6;
            }
         }
      } else {
         for (int var5 = 0; var5 < this.M; var5++) {
            this.L[var5] = this.L[var5] - ib;
            this.q[var5] = this.q[var5] - hb;
            this.z[var5] = this.z[var5] - ab;
            this.L[var5] = this.L[var5] * var2 / 128;
            this.q[var5] = this.q[var5] * var3 / 128;
            this.z[var5] = this.z[var5] * var4 / 128;
            this.L[var5] = this.L[var5] + ib;
            this.q[var5] = this.q[var5] + hb;
            this.z[var5] = this.z[var5] + ab;
         }
      }
   }

   final void b(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.M; var4++) {
         this.L[var4] = this.L[var4] * var1 / 128;
         this.q[var4] = this.q[var4] * var2 / 128;
         this.z[var4] = this.z[var4] * var3 / 128;
      }

      this.B = false;
   }

   final int d() {
      if (!this.B) {
         this.l();
      }

      return this.T;
   }

   public static void k() {
      U = null;
      Y = null;
      W = null;
      bb = null;
      gb = null;
      mb = null;
      nb = null;
      Z = null;
      rb = null;
      pb = null;
      lb = null;
      eb = null;
      ub = null;
      sb = null;
      tb = null;
      kb = null;
      fb = null;
      ob = null;
      cb = null;
      db = null;
      qb = null;
      jb = null;
   }

   private final void a(int var1, int[] var2, int var3, int var4, int var5) {
      int var6 = var2.length;
      if (var1 == 0) {
         int var18 = 0;
         ib = 0;
         hb = 0;
         ab = 0;

         for (int var22 = 0; var22 < var6; var22++) {
            int var26 = var2[var22];
            if (var26 < this.Q.length) {
               int[] var30 = this.Q[var26];

               for (int var34 = 0; var34 < var30.length; var34++) {
                  int var38 = var30[var34];
                  ib = ib + this.L[var38];
                  hb = hb + this.q[var38];
                  ab = ab + this.z[var38];
                  var18++;
               }
            }
         }

         if (var18 > 0) {
            ib = ib / var18 + var3;
            hb = hb / var18 + var4;
            ab = ab / var18 + var5;
         } else {
            ib = var3;
            hb = var4;
            ab = var5;
         }
      } else if (var1 == 1) {
         for (int var17 = 0; var17 < var6; var17++) {
            int var21 = var2[var17];
            if (var21 < this.Q.length) {
               int[] var25 = this.Q[var21];

               for (int var29 = 0; var29 < var25.length; var29++) {
                  int var33 = var25[var29];
                  this.L[var33] = this.L[var33] + var3;
                  this.q[var33] = this.q[var33] + var4;
                  this.z[var33] = this.z[var33] + var5;
               }
            }
         }
      } else if (var1 == 2) {
         for (int var16 = 0; var16 < var6; var16++) {
            int var20 = var2[var16];
            if (var20 < this.Q.length) {
               int[] var24 = this.Q[var20];

               for (int var28 = 0; var28 < var24.length; var28++) {
                  int var32 = var24[var28];
                  this.L[var32] = this.L[var32] - ib;
                  this.q[var32] = this.q[var32] - hb;
                  this.z[var32] = this.z[var32] - ab;
                  if (var5 != 0) {
                     int var35 = Class_kd.e[var5];
                     int var13 = Class_kd.q[var5];
                     int var14 = this.q[var32] * var35 + this.L[var32] * var13 + 32767 >> 16;
                     this.q[var32] = this.q[var32] * var13 - this.L[var32] * var35 + 32767 >> 16;
                     this.L[var32] = var14;
                  }

                  if (var3 != 0) {
                     int var36 = Class_kd.e[var3];
                     int var39 = Class_kd.q[var3];
                     int var41 = this.q[var32] * var39 - this.z[var32] * var36 + 32767 >> 16;
                     this.z[var32] = this.q[var32] * var36 + this.z[var32] * var39 + 32767 >> 16;
                     this.q[var32] = var41;
                  }

                  if (var4 != 0) {
                     int var37 = Class_kd.e[var4];
                     int var40 = Class_kd.q[var4];
                     int var42 = this.z[var32] * var37 + this.L[var32] * var40 + 32767 >> 16;
                     this.z[var32] = this.z[var32] * var40 - this.L[var32] * var37 + 32767 >> 16;
                     this.L[var32] = var42;
                  }

                  this.L[var32] = this.L[var32] + ib;
                  this.q[var32] = this.q[var32] + hb;
                  this.z[var32] = this.z[var32] + ab;
               }
            }
         }
      } else if (var1 == 3) {
         for (int var15 = 0; var15 < var6; var15++) {
            int var19 = var2[var15];
            if (var19 < this.Q.length) {
               int[] var23 = this.Q[var19];

               for (int var27 = 0; var27 < var23.length; var27++) {
                  int var31 = var23[var27];
                  this.L[var31] = this.L[var31] - ib;
                  this.q[var31] = this.q[var31] - hb;
                  this.z[var31] = this.z[var31] - ab;
                  this.L[var31] = this.L[var31] * var3 / 128;
                  this.q[var31] = this.q[var31] * var4 / 128;
                  this.z[var31] = this.z[var31] * var5 / 128;
                  this.L[var31] = this.L[var31] + ib;
                  this.q[var31] = this.q[var31] + hb;
                  this.z[var31] = this.z[var31] + ab;
               }
            }
         }
      } else if (var1 == 5) {
         if (this.w != null && this.G != null) {
            for (int var7 = 0; var7 < var6; var7++) {
               int var8 = var2[var7];
               if (var8 < this.w.length) {
                  int[] var9 = this.w[var8];

                  for (int var10 = 0; var10 < var9.length; var10++) {
                     int var11 = var9[var10];
                     int var12 = (this.G[var11] & 255) + var3 * 8;
                     if (var12 < 0) {
                        var12 = 0;
                     } else if (var12 > 255) {
                        var12 = 255;
                     }

                     this.G[var11] = (byte)var12;
                  }
               }
            }
         }
      }
   }

   final void c(int var1, int var2, int var3) {
      for (int var4 = 0; var4 < this.M; var4++) {
         this.L[var4] = this.L[var4] + var1;
         this.q[var4] = this.q[var4] + var2;
         this.z[var4] = this.z[var4] + var3;
      }

      this.B = false;
   }

   private final Class_jh a(boolean var1, Class_qa var2, byte[] var3) {
      var2.M = this.M;
      var2.N = this.N;
      var2.t = this.t;
      if (var2.L == null || var2.L.length < this.M) {
         var2.L = new int[this.M + 100];
         var2.q = new int[this.M + 100];
         var2.z = new int[this.M + 100];
      }

      for (int var4 = 0; var4 < this.M; var4++) {
         var2.L[var4] = this.L[var4];
         var2.q[var4] = this.q[var4];
         var2.z[var4] = this.z[var4];
      }

      if (var1) {
         var2.G = this.G;
      } else {
         var2.G = var3;
         if (this.G == null) {
            for (int var5 = 0; var5 < this.N; var5++) {
               var2.G[var5] = 0;
            }
         } else {
            for (int var6 = 0; var6 < this.N; var6++) {
               var2.G[var6] = this.G[var6];
            }
         }
      }

      var2.S = this.S;
      var2.s = this.s;
      var2.V = this.V;
      var2.I = this.I;
      var2.X = this.X;
      var2.v = this.v;
      var2.A = this.A;
      var2.r = this.r;
      var2.F = this.F;
      var2.R = this.R;
      var2.O = this.O;
      var2.u = this.u;
      var2.P = this.P;
      var2.Q = this.Q;
      var2.w = this.w;
      var2.p = super.p;
      var2.B = false;
      return var2;
   }

   private final void f(int var1) {
      int var2 = Class_kd.n;
      int var3 = Class_kd.j;
      int var4 = 0;
      int var5 = this.S[var1];
      int var6 = this.s[var1];
      int var7 = this.V[var1];
      int var8 = eb[var5];
      int var9 = eb[var6];
      int var10 = eb[var7];
      if (this.G == null) {
         Class_kd.c = 0;
      } else {
         Class_kd.c = this.G[var1] & 255;
      }

      if (var8 >= 50) {
         db[var4] = nb[var5];
         qb[var4] = Z[var5];
         jb[var4++] = this.I[var1];
      } else {
         int var11 = pb[var5];
         int var12 = lb[var5];
         int var13 = this.I[var1];
         if (var10 >= 50) {
            int var14 = (50 - var8) * Class_kd.d[var10 - var8];
            db[var4] = var2 + (var11 + ((pb[var7] - var11) * var14 >> 16) << 9) / 50;
            qb[var4] = var3 + (var12 + ((lb[var7] - var12) * var14 >> 16) << 9) / 50;
            jb[var4++] = var13 + ((this.v[var1] - var13) * var14 >> 16);
         }

         if (var9 >= 50) {
            int var30 = (50 - var8) * Class_kd.d[var9 - var8];
            db[var4] = var2 + (var11 + ((pb[var6] - var11) * var30 >> 16) << 9) / 50;
            qb[var4] = var3 + (var12 + ((lb[var6] - var12) * var30 >> 16) << 9) / 50;
            jb[var4++] = var13 + ((this.X[var1] - var13) * var30 >> 16);
         }
      }

      if (var9 >= 50) {
         db[var4] = nb[var6];
         qb[var4] = Z[var6];
         jb[var4++] = this.X[var1];
      } else {
         int var21 = pb[var6];
         int var24 = lb[var6];
         int var27 = this.X[var1];
         if (var8 >= 50) {
            int var31 = (50 - var9) * Class_kd.d[var8 - var9];
            db[var4] = var2 + (var21 + ((pb[var5] - var21) * var31 >> 16) << 9) / 50;
            qb[var4] = var3 + (var24 + ((lb[var5] - var24) * var31 >> 16) << 9) / 50;
            jb[var4++] = var27 + ((this.I[var1] - var27) * var31 >> 16);
         }

         if (var10 >= 50) {
            int var32 = (50 - var9) * Class_kd.d[var10 - var9];
            db[var4] = var2 + (var21 + ((pb[var7] - var21) * var32 >> 16) << 9) / 50;
            qb[var4] = var3 + (var24 + ((lb[var7] - var24) * var32 >> 16) << 9) / 50;
            jb[var4++] = var27 + ((this.v[var1] - var27) * var32 >> 16);
         }
      }

      if (var10 >= 50) {
         db[var4] = nb[var7];
         qb[var4] = Z[var7];
         jb[var4++] = this.v[var1];
      } else {
         int var22 = pb[var7];
         int var25 = lb[var7];
         int var28 = this.v[var1];
         if (var9 >= 50) {
            int var33 = (50 - var10) * Class_kd.d[var9 - var10];
            db[var4] = var2 + (var22 + ((pb[var6] - var22) * var33 >> 16) << 9) / 50;
            qb[var4] = var3 + (var25 + ((lb[var6] - var25) * var33 >> 16) << 9) / 50;
            jb[var4++] = var28 + ((this.X[var1] - var28) * var33 >> 16);
         }

         if (var8 >= 50) {
            int var34 = (50 - var10) * Class_kd.d[var8 - var10];
            db[var4] = var2 + (var22 + ((pb[var5] - var22) * var34 >> 16) << 9) / 50;
            qb[var4] = var3 + (var25 + ((lb[var5] - var25) * var34 >> 16) << 9) / 50;
            jb[var4++] = var28 + ((this.I[var1] - var28) * var34 >> 16);
         }
      }

      int var23 = db[0];
      int var26 = db[1];
      int var29 = db[2];
      int var35 = qb[0];
      int var15 = qb[1];
      int var16 = qb[2];
      Class_kd.g = false;
      if (var4 == 3) {
         if (var23 < 0 || var26 < 0 || var29 < 0 || var23 > Class_kd.r || var26 > Class_kd.r || var29 > Class_kd.r) {
            Class_kd.g = true;
         }

         if (this.F != null && this.F[var1] != -1) {
            int var17;
            int var18;
            int var19;
            if (this.r != null && this.r[var1] != -1) {
               int var20 = this.r[var1] & 255;
               var17 = this.O[var20];
               var18 = this.u[var20];
               var19 = this.P[var20];
            } else {
               var17 = var5;
               var18 = var6;
               var19 = var7;
            }

            if (this.v[var1] == -1) {
               Class_kd.b(
                  var35,
                  var15,
                  var16,
                  var23,
                  var26,
                  var29,
                  this.I[var1],
                  this.I[var1],
                  this.I[var1],
                  pb[var17],
                  pb[var18],
                  pb[var19],
                  lb[var17],
                  lb[var18],
                  lb[var19],
                  eb[var17],
                  eb[var18],
                  eb[var19],
                  this.F[var1]
               );
            } else {
               Class_kd.b(
                  var35,
                  var15,
                  var16,
                  var23,
                  var26,
                  var29,
                  jb[0],
                  jb[1],
                  jb[2],
                  pb[var17],
                  pb[var18],
                  pb[var19],
                  lb[var17],
                  lb[var18],
                  lb[var19],
                  eb[var17],
                  eb[var18],
                  eb[var19],
                  this.F[var1]
               );
            }
         } else if (this.v[var1] == -1) {
            Class_kd.a(var35, var15, var16, var23, var26, var29, Class_kd.h[this.I[var1]]);
         } else {
            Class_kd.a(var35, var15, var16, var23, var26, var29, jb[0], jb[1], jb[2]);
         }
      }

      if (var4 == 4) {
         if (var23 < 0 || var26 < 0 || var29 < 0 || var23 > Class_kd.r || var26 > Class_kd.r || var29 > Class_kd.r || db[3] < 0 || db[3] > Class_kd.r) {
            Class_kd.g = true;
         }

         if (this.F == null || this.F[var1] == -1) {
            if (this.v[var1] == -1) {
               int var37 = Class_kd.h[this.I[var1]];
               Class_kd.a(var35, var15, var16, var23, var26, var29, var37);
               Class_kd.a(var35, var16, qb[3], var23, var29, db[3], var37);
               return;
            }

            Class_kd.a(var35, var15, var16, var23, var26, var29, jb[0], jb[1], jb[2]);
            Class_kd.a(var35, var16, qb[3], var23, var29, db[3], jb[0], jb[2], jb[3]);
            return;
         }

         int var36;
         int var38;
         int var39;
         if (this.r != null && this.r[var1] != -1) {
            int var40 = this.r[var1] & 255;
            var36 = this.O[var40];
            var38 = this.u[var40];
            var39 = this.P[var40];
         } else {
            var36 = var5;
            var38 = var6;
            var39 = var7;
         }

         short var41 = this.F[var1];
         if (this.v[var1] == -1) {
            Class_kd.b(
               var35,
               var15,
               var16,
               var23,
               var26,
               var29,
               this.I[var1],
               this.I[var1],
               this.I[var1],
               pb[var36],
               pb[var38],
               pb[var39],
               lb[var36],
               lb[var38],
               lb[var39],
               eb[var36],
               eb[var38],
               eb[var39],
               var41
            );
            Class_kd.b(
               var35,
               var16,
               qb[3],
               var23,
               var29,
               db[3],
               this.I[var1],
               this.I[var1],
               this.I[var1],
               pb[var36],
               pb[var38],
               pb[var39],
               lb[var36],
               lb[var38],
               lb[var39],
               eb[var36],
               eb[var38],
               eb[var39],
               var41
            );
            return;
         }

         Class_kd.b(
            var35,
            var15,
            var16,
            var23,
            var26,
            var29,
            jb[0],
            jb[1],
            jb[2],
            pb[var36],
            pb[var38],
            pb[var39],
            lb[var36],
            lb[var38],
            lb[var39],
            eb[var36],
            eb[var38],
            eb[var39],
            var41
         );
         Class_kd.b(
            var35,
            var16,
            qb[3],
            var23,
            var29,
            db[3],
            jb[0],
            jb[2],
            jb[3],
            pb[var36],
            pb[var38],
            pb[var39],
            lb[var36],
            lb[var38],
            lb[var39],
            eb[var36],
            eb[var38],
            eb[var39],
            var41
         );
      }
   }

   final Class_qa a(int var1, int var2, int[][] var3, int[][] var4, int var5, int var6, int var7, boolean var8) {
      if (!this.B) {
         this.l();
      }

      int var9 = var5 + this.H;
      int var10 = var5 + this.E;
      int var11 = var7 + this.x;
      int var12 = var7 + this.D;
      if (var1 != 1 && var1 != 2 && var1 != 3 && var1 != 5 || var9 >= 0 && var10 + 128 >> 7 < var3.length && var11 >= 0 && var12 + 128 >> 7 < var3[0].length) {
         if (var1 != 4 && var1 != 5) {
            var9 >>= 7;
            var10 = var10 + 127 >> 7;
            var11 >>= 7;
            var12 = var12 + 127 >> 7;
            if (var3[var9][var11] == var6 && var3[var10][var11] == var6 && var3[var9][var12] == var6 && var3[var10][var12] == var6) {
               return this;
            }
         } else {
            if (var4 == null) {
               return this;
            }

            if (var9 < 0 || var10 + 128 >> 7 >= var4.length || var11 < 0 || var12 + 128 >> 7 >= var4[0].length) {
               return this;
            }
         }

         Class_qa var13;
         if (var8) {
            var13 = new Class_qa();
            var13.M = this.M;
            var13.N = this.N;
            var13.t = this.t;
            var13.S = this.S;
            var13.s = this.s;
            var13.V = this.V;
            var13.I = this.I;
            var13.X = this.X;
            var13.v = this.v;
            var13.A = this.A;
            var13.G = this.G;
            var13.r = this.r;
            var13.F = this.F;
            var13.R = this.R;
            var13.O = this.O;
            var13.u = this.u;
            var13.P = this.P;
            var13.Q = this.Q;
            var13.w = this.w;
            var13.p = super.p;
            if (var1 == 3) {
               var13.L = Class_sf.a(this.L, -48);
               var13.q = Class_sf.a(this.q, -40);
               var13.z = Class_sf.a(this.z, -52);
            } else {
               var13.L = this.L;
               var13.q = new int[var13.M];
               var13.z = this.z;
            }
         } else {
            var13 = this;
         }

         if (var1 == 1) {
            for (int var14 = 0; var14 < var13.M; var14++) {
               int var15 = this.L[var14] + var5;
               int var16 = this.z[var14] + var7;
               int var17 = var15 & 127;
               int var18 = var16 & 127;
               int var19 = var15 >> 7;
               int var20 = var16 >> 7;
               int var21 = var3[var19][var20] * (128 - var17) + var3[var19 + 1][var20] * var17 >> 7;
               int var22 = var3[var19][var20 + 1] * (128 - var17) + var3[var19 + 1][var20 + 1] * var17 >> 7;
               int var23 = var21 * (128 - var18) + var22 * var18 >> 7;
               var13.q[var14] = this.q[var14] + var23 - var6;
            }
         } else if (var1 == 2) {
            for (int var31 = 0; var31 < var13.M; var31++) {
               int var35 = (this.q[var31] << 16) / this.y;
               if (var35 < var2) {
                  int var39 = this.L[var31] + var5;
                  int var42 = this.z[var31] + var7;
                  int var45 = var39 & 127;
                  int var48 = var42 & 127;
                  int var51 = var39 >> 7;
                  int var54 = var42 >> 7;
                  int var57 = var3[var51][var54] * (128 - var45) + var3[var51 + 1][var54] * var45 >> 7;
                  int var61 = var3[var51][var54 + 1] * (128 - var45) + var3[var51 + 1][var54 + 1] * var45 >> 7;
                  int var24 = var57 * (128 - var48) + var61 * var48 >> 7;
                  var13.q[var31] = this.q[var31] + (var24 - var6) * (var2 - var35) / var2;
               } else {
                  var13.q[var31] = this.q[var31];
               }
            }
         } else if (var1 == 3) {
            int var32 = (var2 & 0xFF) * 4;
            int var36 = (var2 >> 8 & 0xFF) * 4;
            var13.a(var3, var5, var6, var7, var32, var36);
         } else if (var1 == 4) {
            int var33 = this.J - this.y;

            for (int var37 = 0; var37 < this.M; var37++) {
               int var40 = this.L[var37] + var5;
               int var43 = this.z[var37] + var7;
               int var46 = var40 & 127;
               int var49 = var43 & 127;
               int var52 = var40 >> 7;
               int var55 = var43 >> 7;
               int var58 = var4[var52][var55] * (128 - var46) + var4[var52 + 1][var55] * var46 >> 7;
               int var62 = var4[var52][var55 + 1] * (128 - var46) + var4[var52 + 1][var55 + 1] * var46 >> 7;
               int var65 = var58 * (128 - var49) + var62 * var49 >> 7;
               var13.q[var37] = this.q[var37] + (var65 - var6) + var33;
            }
         } else if (var1 == 5) {
            int var34 = this.J - this.y;

            for (int var38 = 0; var38 < this.M; var38++) {
               int var41 = this.L[var38] + var5;
               int var44 = this.z[var38] + var7;
               int var47 = var41 & 127;
               int var50 = var44 & 127;
               int var53 = var41 >> 7;
               int var56 = var44 >> 7;
               int var59 = var3[var53][var56] * (128 - var47) + var3[var53 + 1][var56] * var47 >> 7;
               int var63 = var3[var53][var56 + 1] * (128 - var47) + var3[var53 + 1][var56 + 1] * var47 >> 7;
               int var66 = var59 * (128 - var50) + var63 * var50 >> 7;
               var59 = var4[var53][var56] * (128 - var47) + var4[var53 + 1][var56] * var47 >> 7;
               var63 = var4[var53][var56 + 1] * (128 - var47) + var4[var53 + 1][var56 + 1] * var47 >> 7;
               int var25 = var59 * (128 - var50) + var63 * var50 >> 7;
               int var26 = var66 - var25;
               var13.q[var38] = ((this.q[var38] << 8) / var34 * var26 >> 8) - (var6 - var66);
            }
         }

         var13.B = false;
         return var13;
      } else {
         return this;
      }
   }

   final int g() {
      if (!this.B) {
         this.l();
      }

      return this.E;
   }

   final void i() {
      for (int var1 = 0; var1 < this.M; var1++) {
         int var2 = this.z[var1];
         this.z[var1] = this.L[var1];
         this.L[var1] = -var2;
      }

      this.B = false;
   }

   final int j() {
      if (!this.B) {
         this.l();
      }

      return this.H;
   }

   private final void l() {
      int var1 = 32767;
      int var2 = 32767;
      int var3 = 32767;
      int var4 = -32768;
      int var5 = -32768;
      int var6 = -32768;
      int var7 = 0;
      int var8 = 0;

      for (int var9 = 0; var9 < this.M; var9++) {
         int var10 = this.L[var9];
         int var11 = this.q[var9];
         int var12 = this.z[var9];
         if (var10 < var1) {
            var1 = var10;
         }

         if (var10 > var4) {
            var4 = var10;
         }

         if (var11 < var2) {
            var2 = var11;
         }

         if (var11 > var5) {
            var5 = var11;
         }

         if (var12 < var3) {
            var3 = var12;
         }

         if (var12 > var6) {
            var6 = var12;
         }

         int var13 = var10 * var10 + var12 * var12;
         if (var13 > var7) {
            var7 = var13;
         }

         var13 += var11 * var11;
         if (var13 > var8) {
            var8 = var13;
         }
      }

      this.H = (short)var1;
      this.E = (short)var4;
      this.y = (short)var2;
      this.J = (short)var5;
      this.x = (short)var3;
      this.D = (short)var6;
      this.T = (short)(Math.sqrt(var7) + 0.99);
      this.K = (short)(Math.sqrt(var8) + 0.99);
      this.B = true;
   }

   final void f() {
      for (int var1 = 0; var1 < this.M; var1++) {
         this.L[var1] = -this.L[var1];
         this.z[var1] = -this.z[var1];
      }

      this.B = false;
   }

   final Class_jh b(boolean var1, boolean var2) {
      if (!var1 && Y.length < this.N) {
         Y = new byte[this.N + 100];
      }

      return this.a(var1, U, Y);
   }

   final int c() {
      if (!this.B) {
         this.l();
      }

      return this.x;
   }

   final Class_jh a(boolean var1, boolean var2) {
      if (!var1 && bb.length < this.N) {
         bb = new byte[this.N + 100];
      }

      return this.a(var1, W, bb);
   }

   final void e() {
      for (int var1 = 0; var1 < this.M; var1++) {
         int var2 = this.L[var1];
         this.L[var1] = this.z[var1];
         this.z[var1] = -var2;
      }

      this.B = false;
   }

   final void d(int var1) {
      int var2 = Class_kd.e[var1];
      int var3 = Class_kd.q[var1];

      for (int var4 = 0; var4 < this.M; var4++) {
         int var5 = this.q[var4] * var2 + this.L[var4] * var3 >> 16;
         this.q[var4] = this.q[var4] * var3 - this.L[var4] * var2 >> 16;
         this.L[var4] = var5;
      }

      this.B = false;
   }

   private static final int g(int var0) {
      if (var0 < 2) {
         var0 = 2;
      } else if (var0 > 126) {
         var0 = 126;
      }

      return var0;
   }

   private static final int a(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 65408) + var1;
   }

   final void a(Class_w var1, int var2) {
      if (this.Q != null) {
         if (var2 != -1) {
            Class_t var3 = var1.J[var2];
            Class_gg var4 = var3.h;
            ib = 0;
            hb = 0;
            ab = 0;

            for (int var5 = 0; var5 < var3.k; var5++) {
               short var6 = var3.m[var5];
               if (var4.q[var6]) {
                  if (var3.e[var5] != -1) {
                     this.a(0, 0, 0, 0);
                  }

                  this.a(var4.u[var6], var3.a[var5], var3.c[var5], var3.l[var5]);
               }
            }

            this.B = false;
         }
      }
   }

   private final void a(boolean var1, boolean var2, long var3, int var5, int var6) {
      if (var6 < 1600) {
         for (int var7 = 0; var7 < var6; var7++) {
            ub[var7] = 0;
         }

         for (int var8 = 0; var8 < this.N; var8++) {
            if (this.v[var8] != -2) {
               int var9 = this.S[var8];
               int var10 = this.s[var8];
               int var11 = this.V[var8];
               int var12 = nb[var9];
               int var13 = nb[var10];
               int var14 = nb[var11];
               if (!var1 || var12 != -5000 && var13 != -5000 && var14 != -5000) {
                  if (var2 && this.a(Class_kc.u + Class_kd.n, Class_hh.i + Class_kd.j, Z[var9], Z[var10], Z[var11], var12, var13, var14)) {
                     Class_tf.J[Class_ab.Q++] = var3;
                     var2 = false;
                  }

                  if ((var12 - var13) * (Z[var11] - Z[var10]) - (Z[var9] - Z[var10]) * (var14 - var13) > 0) {
                     mb[var8] = false;
                     if (var12 >= 0 && var13 >= 0 && var14 >= 0 && var12 <= Class_kd.r && var13 <= Class_kd.r && var14 <= Class_kd.r) {
                        gb[var8] = false;
                     } else {
                        gb[var8] = true;
                     }

                     int var43 = (rb[var9] + rb[var10] + rb[var11]) / 3 + var5;
                     sb[var43][ub[var43]++] = var8;
                  }
               } else {
                  int var15 = pb[var9];
                  int var16 = pb[var10];
                  int var17 = pb[var11];
                  int var18 = lb[var9];
                  int var19 = lb[var10];
                  int var20 = lb[var11];
                  int var21 = eb[var9];
                  int var22 = eb[var10];
                  int var23 = eb[var11];
                  var15 -= var16;
                  var17 -= var16;
                  var18 -= var19;
                  var20 -= var19;
                  var21 -= var22;
                  var23 -= var22;
                  int var24 = var18 * var23 - var21 * var20;
                  int var25 = var21 * var17 - var15 * var23;
                  int var26 = var15 * var20 - var18 * var17;
                  if (var16 * var24 + var19 * var25 + var22 * var26 > 0) {
                     mb[var8] = true;
                     int var27 = (rb[var9] + rb[var10] + rb[var11]) / 3 + var5;
                     sb[var27][ub[var27]++] = var8;
                  }
               }
            }
         }

         if (this.A == null) {
            for (int var29 = var6 - 1; var29 >= 0; var29--) {
               int var31 = ub[var29];
               if (var31 > 0) {
                  int[] var34 = sb[var29];

                  for (int var37 = 0; var37 < var31; var37++) {
                     this.h(var34[var37]);
                  }
               }
            }
         } else {
            for (int var28 = 0; var28 < 12; var28++) {
               tb[var28] = 0;
               cb[var28] = 0;
            }

            for (int var30 = var6 - 1; var30 >= 0; var30--) {
               int var32 = ub[var30];
               if (var32 > 0) {
                  int[] var35 = sb[var30];

                  for (int var38 = 0; var38 < var32; var38++) {
                     int var40 = var35[var38];
                     byte var44 = this.A[var40];
                     int var46 = tb[var44]++;
                     kb[var44][var46] = var40;
                     if (var44 < 10) {
                        cb[var44] = cb[var44] + var30;
                     } else if (var44 == 10) {
                        fb[var46] = var30;
                     } else {
                        ob[var46] = var30;
                     }
                  }
               }
            }

            int var33 = 0;
            if (tb[1] > 0 || tb[2] > 0) {
               var33 = (cb[1] + cb[2]) / (tb[1] + tb[2]);
            }

            int var36 = 0;
            if (tb[3] > 0 || tb[4] > 0) {
               var36 = (cb[3] + cb[4]) / (tb[3] + tb[4]);
            }

            int var39 = 0;
            if (tb[6] > 0 || tb[8] > 0) {
               var39 = (cb[6] + cb[8]) / (tb[6] + tb[8]);
            }

            int var45 = 0;
            int var47 = tb[10];
            int[] var49 = kb[10];
            int[] var51 = fb;
            if (var45 == var47) {
               var45 = 0;
               var47 = tb[11];
               var49 = kb[11];
               var51 = ob;
            }

            int var41;
            if (var45 < var47) {
               var41 = var51[var45];
            } else {
               var41 = -1000;
            }

            for (int var52 = 0; var52 < 10; var52++) {
               while (var52 == 0 && var41 > var33) {
                  this.h(var49[var45++]);
                  if (var45 == var47 && var49 != kb[11]) {
                     var45 = 0;
                     var47 = tb[11];
                     var49 = kb[11];
                     var51 = ob;
                  }

                  if (var45 < var47) {
                     var41 = var51[var45];
                  } else {
                     var41 = -1000;
                  }
               }

               while (var52 == 3 && var41 > var36) {
                  this.h(var49[var45++]);
                  if (var45 == var47 && var49 != kb[11]) {
                     var45 = 0;
                     var47 = tb[11];
                     var49 = kb[11];
                     var51 = ob;
                  }

                  if (var45 < var47) {
                     var41 = var51[var45];
                  } else {
                     var41 = -1000;
                  }
               }

               while (var52 == 5 && var41 > var39) {
                  this.h(var49[var45++]);
                  if (var45 == var47 && var49 != kb[11]) {
                     var45 = 0;
                     var47 = tb[11];
                     var49 = kb[11];
                     var51 = ob;
                  }

                  if (var45 < var47) {
                     var41 = var51[var45];
                  } else {
                     var41 = -1000;
                  }
               }

               int var54 = tb[var52];
               int[] var56 = kb[var52];

               for (int var57 = 0; var57 < var54; var57++) {
                  this.h(var56[var57]);
               }
            }

            while (var41 != -1000) {
               this.h(var49[var45++]);
               if (var45 == var47 && var49 != kb[11]) {
                  var45 = 0;
                  var49 = kb[11];
                  var47 = tb[11];
                  var51 = ob;
               }

               if (var45 < var47) {
                  var41 = var51[var45];
               } else {
                  var41 = -1000;
               }
            }
         }
      }
   }

   private final void h(int var1) {
      if (mb[var1]) {
         this.f(var1);
      } else {
         int var2 = this.S[var1];
         int var3 = this.s[var1];
         int var4 = this.V[var1];
         Class_kd.g = gb[var1];
         if (this.G == null) {
            Class_kd.c = 0;
         } else {
            Class_kd.c = this.G[var1] & 255;
         }

         if (this.F != null && this.F[var1] != -1) {
            int var5;
            int var6;
            int var7;
            if (this.r != null && this.r[var1] != -1) {
               int var8 = this.r[var1] & 255;
               var5 = this.O[var8];
               var6 = this.u[var8];
               var7 = this.P[var8];
            } else {
               var5 = var2;
               var6 = var3;
               var7 = var4;
            }

            if (this.v[var1] == -1) {
               Class_kd.b(
                  Z[var2],
                  Z[var3],
                  Z[var4],
                  nb[var2],
                  nb[var3],
                  nb[var4],
                  this.I[var1],
                  this.I[var1],
                  this.I[var1],
                  pb[var5],
                  pb[var6],
                  pb[var7],
                  lb[var5],
                  lb[var6],
                  lb[var7],
                  eb[var5],
                  eb[var6],
                  eb[var7],
                  this.F[var1]
               );
            } else {
               Class_kd.b(
                  Z[var2],
                  Z[var3],
                  Z[var4],
                  nb[var2],
                  nb[var3],
                  nb[var4],
                  this.I[var1],
                  this.X[var1],
                  this.v[var1],
                  pb[var5],
                  pb[var6],
                  pb[var7],
                  lb[var5],
                  lb[var6],
                  lb[var7],
                  eb[var5],
                  eb[var6],
                  eb[var7],
                  this.F[var1]
               );
            }
         } else if (this.v[var1] == -1) {
            Class_kd.a(Z[var2], Z[var3], Z[var4], nb[var2], nb[var3], nb[var4], Class_kd.h[this.I[var1]]);
         } else {
            Class_kd.a(Z[var2], Z[var3], Z[var4], nb[var2], nb[var3], nb[var4], this.I[var1], this.X[var1], this.v[var1]);
         }
      }
   }

   final void c(int var1) {
      int var2 = Class_kd.e[var1];
      int var3 = Class_kd.q[var1];

      for (int var4 = 0; var4 < this.M; var4++) {
         int var5 = this.q[var4] * var3 - this.z[var4] * var2 >> 16;
         this.z[var4] = this.q[var4] * var2 + this.z[var4] * var3 >> 16;
         this.q[var4] = var5;
      }

      this.B = false;
   }

   final void e(int var1) {
      int var2 = Class_kd.e[var1];
      int var3 = Class_kd.q[var1];

      for (int var4 = 0; var4 < this.M; var4++) {
         int var5 = this.z[var4] * var2 + this.L[var4] * var3 >> 16;
         this.z[var4] = this.z[var4] * var3 - this.L[var4] * var2 >> 16;
         this.L[var4] = var5;
      }

      this.B = false;
   }

   final Class_jh a(Class_jh var1) {
      return new Class_qa(new Class_qa[]{this, (Class_qa)var1}, 2);
   }

   final void a(Class_w var1, int var2, boolean var3) {
      if (this.Q != null) {
         if (var2 != -1) {
            Class_t var4 = var1.J[var2];
            Class_gg var5 = var4.h;
            ib = 0;
            hb = 0;
            ab = 0;

            for (int var6 = 0; var6 < var4.k; var6++) {
               short var7 = var4.m[var6];
               if (var4.e[var6] != -1) {
                  this.a(0, var5.w[var4.e[var6]], 0, 0, 0);
               }

               this.a(var5.u[var7], var5.w[var7], var4.a[var6], var4.c[var6], var4.l[var6]);
            }

            this.B = false;
         }
      }
   }

   final void a(Class_w var1, int var2, Class_w var3, int var4, int[] var5, boolean var6) {
      if (var2 != -1) {
         if (var5 != null && var4 != -1) {
            Class_t var7 = var1.J[var2];
            Class_t var8 = var3.J[var4];
            Class_gg var9 = var7.h;
            ib = 0;
            hb = 0;
            ab = 0;
            int var10 = 0;
            int var11 = var5[var10++];

            for (int var12 = 0; var12 < var7.k; var12++) {
               short var13 = var7.m[var12];

               while (var13 > var11) {
                  var11 = var5[var10++];
               }

               if (var13 != var11 || var9.u[var13] == 0) {
                  if (var7.e[var12] != -1) {
                     this.a(0, var9.w[var7.e[var12]], 0, 0, 0);
                  }

                  this.a(var9.u[var13], var9.w[var13], var7.a[var12], var7.c[var12], var7.l[var12]);
               }
            }

            ib = 0;
            hb = 0;
            ab = 0;
            var10 = 0;
            var11 = var5[var10++];

            for (int var19 = 0; var19 < var8.k; var19++) {
               short var14 = var8.m[var19];

               while (var14 > var11) {
                  var11 = var5[var10++];
               }

               if (var14 == var11 || var9.u[var14] == 0) {
                  if (var8.e[var19] != -1) {
                     this.a(0, var9.w[var8.e[var19]], 0, 0, 0);
                  }

                  this.a(var9.u[var14], var9.w[var14], var8.a[var19], var8.c[var19], var8.l[var19]);
               }
            }

            this.B = false;
         } else {
            this.a(var1, var2, var6);
         }
      }
   }

   public Class_qa() {
      this.M = 0;
      this.t = 0;
      this.R = 0;
   }

   Class_qa(Class_ne var1, int var2, int var3, int var4, int var5, int var6) {
      this.M = 0;
      this.t = 0;
      this.R = 0;
      var1.g();
      var1.d();
      this.M = var1.q;
      this.L = var1.W;
      this.q = var1.S;
      this.z = var1.L;
      this.N = var1.U;
      this.S = var1.r;
      this.s = var1.fb;
      this.V = var1.I;
      this.A = var1.Z;
      this.G = var1.Y;
      this.R = var1.ib;
      this.Q = var1.gb;
      this.w = var1.db;
      int var7 = (int)Math.sqrt(var4 * var4 + var5 * var5 + var6 * var6);
      int var8 = var3 * var7 >> 8;
      this.I = new int[this.N];
      this.X = new int[this.N];
      this.v = new int[this.N];
      if (var1.K != null) {
         this.F = new short[this.N];

         for (int var9 = 0; var9 < this.N; var9++) {
            short var10 = var1.K[var9];
            if (var10 != -1 && Class_kd.i.a((byte)39, var10)) {
               this.F[var9] = var10;
            } else {
               this.F[var9] = -1;
            }
         }
      } else {
         this.F = null;
      }

      if (var1.E > 0 && var1.lb != null) {
         int[] var16 = new int[var1.E];

         for (int var18 = 0; var18 < this.N; var18++) {
            if (var1.lb[var18] != -1) {
               var16[var1.lb[var18] & 255]++;
            }
         }

         this.t = 0;

         for (int var11 = 0; var11 < var1.E; var11++) {
            if (var16[var11] > 0 && var1.G[var11] == 0) {
               this.t++;
            }
         }

         this.O = new int[this.t];
         this.u = new int[this.t];
         this.P = new int[this.t];
         int var12 = 0;

         for (int var13 = 0; var13 < var1.E; var13++) {
            if (var16[var13] > 0 && var1.G[var13] == 0) {
               this.O[var12] = var1.z[var13] & '\uffff';
               this.u[var12] = var1.x[var13] & '\uffff';
               this.P[var12] = var1.C[var13] & '\uffff';
               var16[var13] = var12++;
            } else {
               var16[var13] = -1;
            }
         }

         this.r = new byte[this.N];

         for (int var14 = 0; var14 < this.N; var14++) {
            if (var1.lb[var14] != -1) {
               this.r[var14] = (byte)var16[var1.lb[var14] & 255];
               if (this.r[var14] == -1 && this.F != null) {
                  this.F[var14] = -1;
               }
            } else {
               this.r[var14] = -1;
            }
         }
      }

      for (int var17 = 0; var17 < this.N; var17++) {
         byte var19;
         if (var1.V == null) {
            var19 = 0;
         } else {
            var19 = var1.V[var17];
         }

         byte var20;
         if (var1.Y == null) {
            var20 = 0;
         } else {
            var20 = var1.Y[var17];
         }

         short var21;
         if (this.F == null) {
            var21 = -1;
         } else {
            var21 = this.F[var17];
         }

         if (var20 == -2) {
            var19 = 3;
         }

         if (var20 == -1) {
            var19 = 2;
         }

         if (var21 == -1) {
            if (var19 == 0) {
               int var15 = var1.H[var17] & '\uffff';
               Class_sh var22;
               if (var1.X != null && var1.X[this.S[var17]] != null) {
                  var22 = var1.X[this.S[var17]];
               } else {
                  var22 = var1.w[this.S[var17]];
               }

               int var30 = var2 + (var4 * var22.j + var5 * var22.l + var6 * var22.a) / (var8 * var22.d);
               this.I[var17] = a(var15, var30);
               if (var1.X != null && var1.X[this.s[var17]] != null) {
                  var22 = var1.X[this.s[var17]];
               } else {
                  var22 = var1.w[this.s[var17]];
               }

               var30 = var2 + (var4 * var22.j + var5 * var22.l + var6 * var22.a) / (var8 * var22.d);
               this.X[var17] = a(var15, var30);
               if (var1.X != null && var1.X[this.V[var17]] != null) {
                  var22 = var1.X[this.V[var17]];
               } else {
                  var22 = var1.w[this.V[var17]];
               }

               var30 = var2 + (var4 * var22.j + var5 * var22.l + var6 * var22.a) / (var8 * var22.d);
               this.v[var17] = a(var15, var30);
            } else if (var19 == 1) {
               Class_sc var25 = var1.t[var17];
               int var33 = var2 + (var4 * var25.g + var5 * var25.n + var6 * var25.h) / (var8 + var8 / 2);
               this.I[var17] = a(var1.H[var17] & '\uffff', var33);
               this.v[var17] = -1;
            } else if (var19 == 3) {
               this.I[var17] = 128;
               this.v[var17] = -1;
            } else {
               this.v[var17] = -2;
            }
         } else if (var19 == 0) {
            Class_sh var26;
            if (var1.X != null && var1.X[this.S[var17]] != null) {
               var26 = var1.X[this.S[var17]];
            } else {
               var26 = var1.w[this.S[var17]];
            }

            int var34 = var2 + (var4 * var26.j + var5 * var26.l + var6 * var26.a) / (var8 * var26.d);
            this.I[var17] = g(var34);
            if (var1.X != null && var1.X[this.s[var17]] != null) {
               var26 = var1.X[this.s[var17]];
            } else {
               var26 = var1.w[this.s[var17]];
            }

            var34 = var2 + (var4 * var26.j + var5 * var26.l + var6 * var26.a) / (var8 * var26.d);
            this.X[var17] = g(var34);
            if (var1.X != null && var1.X[this.V[var17]] != null) {
               var26 = var1.X[this.V[var17]];
            } else {
               var26 = var1.w[this.V[var17]];
            }

            var34 = var2 + (var4 * var26.j + var5 * var26.l + var6 * var26.a) / (var8 * var26.d);
            this.v[var17] = g(var34);
         } else if (var19 == 1) {
            Class_sc var29 = var1.t[var17];
            int var37 = var2 + (var4 * var29.g + var5 * var29.n + var6 * var29.h) / (var8 + var8 / 2);
            this.I[var17] = g(var37);
            this.v[var17] = -1;
         } else {
            this.v[var17] = -2;
         }
      }
   }

   private Class_qa(Class_qa[] var1, int var2) {
      this.M = 0;
      this.t = 0;
      this.R = 0;
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      this.M = 0;
      this.N = 0;
      this.t = 0;
      this.R = -1;

      for (int var7 = 0; var7 < var2; var7++) {
         Class_qa var8 = var1[var7];
         if (var8 != null) {
            this.M = this.M + var8.M;
            this.N = this.N + var8.N;
            this.t = this.t + var8.t;
            if (var8.A != null) {
               var3 = true;
            } else {
               if (this.R == -1) {
                  this.R = var8.R;
               }

               if (this.R != var8.R) {
                  var3 = true;
               }
            }

            var4 |= var8.G != null;
            var5 |= var8.F != null;
            var6 |= var8.r != null;
         }
      }

      this.L = new int[this.M];
      this.q = new int[this.M];
      this.z = new int[this.M];
      this.S = new int[this.N];
      this.s = new int[this.N];
      this.V = new int[this.N];
      this.I = new int[this.N];
      this.X = new int[this.N];
      this.v = new int[this.N];
      if (var3) {
         this.A = new byte[this.N];
      }

      if (var4) {
         this.G = new byte[this.N];
      }

      if (var5) {
         this.F = new short[this.N];
      }

      if (var6) {
         this.r = new byte[this.N];
      }

      if (this.t > 0) {
         this.O = new int[this.t];
         this.u = new int[this.t];
         this.P = new int[this.t];
      }

      this.M = 0;
      this.N = 0;
      this.t = 0;

      for (int var13 = 0; var13 < var2; var13++) {
         Class_qa var9 = var1[var13];
         if (var9 != null) {
            for (int var10 = 0; var10 < var9.N; var10++) {
               this.S[this.N] = var9.S[var10] + this.M;
               this.s[this.N] = var9.s[var10] + this.M;
               this.V[this.N] = var9.V[var10] + this.M;
               this.I[this.N] = var9.I[var10];
               this.X[this.N] = var9.X[var10];
               this.v[this.N] = var9.v[var10];
               if (var3) {
                  if (var9.A != null) {
                     this.A[this.N] = var9.A[var10];
                  } else {
                     this.A[this.N] = var9.R;
                  }
               }

               if (var4 && var9.G != null) {
                  this.G[this.N] = var9.G[var10];
               }

               if (var5) {
                  if (var9.F != null) {
                     this.F[this.N] = var9.F[var10];
                  } else {
                     this.F[this.N] = -1;
                  }
               }

               if (var6) {
                  if (var9.r != null && var9.r[var10] != -1) {
                     this.r[this.N] = (byte)(var9.r[var10] + this.t);
                  } else {
                     this.r[this.N] = -1;
                  }
               }

               this.N++;
            }

            for (int var11 = 0; var11 < var9.t; var11++) {
               this.O[this.t] = var9.O[var11] + this.M;
               this.u[this.t] = var9.u[var11] + this.M;
               this.P[this.t] = var9.P[var11] + this.M;
               this.t++;
            }

            for (int var12 = 0; var12 < var9.M; var12++) {
               this.L[this.M] = var9.L[var12];
               this.q[this.M] = var9.q[var12];
               this.z[this.M] = var9.z[var12];
               this.M++;
            }
         }
      }
   }
}
