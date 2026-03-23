import java.util.Random;

abstract class Class_af extends Class_pe {
   private static Class_r I = Class_tc.a(43, "nbsp");
   private static Class_r J = Class_tc.a(43, "trans=");
   int K = 0;
   private static Class_r L = Class_tc.a(43, "shad");
   private int[] M;
   private static Class_r N = Class_tc.a(43, ")4shad");
   private static Class_r O = Class_tc.a(43, "gt");
   private int P;
   private static Class_r Q = Class_cj.b(-18982, 100);
   private int R;
   private static Class_r S = Class_tc.a(43, ")4str");
   private int[] T;
   private static Class_r U = Class_tc.a(43, "euro");
   private static Class_r V = Class_tc.a(43, "col=");
   private static Class_r W = Class_tc.a(43, "br");
   private static Class_r X = Class_tc.a(43, "str=");
   private byte[] Y;
   private int[] Z;
   private Class_pc[] ab;
   private static Class_r bb = Class_tc.a(43, ")4col");
   private static Class_r cb = Class_tc.a(43, "img=");
   private static Class_r db = Class_tc.a(43, ")4u");
   private static Class_r eb = Class_tc.a(43, "str");
   private int[] fb;
   private static Class_r gb = Class_tc.a(43, "shad=");
   private static Class_r hb = Class_tc.a(43, "lt");
   private int[] ib;
   private static Class_r jb = Class_tc.a(43, "shy");
   private static Class_r kb = Class_tc.a(43, "copy");
   private static Class_r lb = Class_tc.a(43, ")4trans");
   private static Class_r mb = Class_tc.a(43, "times");
   private static Class_r nb = Class_tc.a(43, "u=");
   private static Class_r ob = Class_tc.a(43, "u");
   private int[] pb;
   private static Class_r qb = Class_tc.a(43, "reg");
   private static int rb = 0;
   private static Class_r[] sb = new Class_r[100];
   private static int tb = -1;
   private static int ub = -1;
   private static int vb = 256;
   private static int wb = 0;
   private static int xb = -1;
   private static int yb = -1;
   private static int zb = 0;
   private static int Ab = 256;
   private static int Bb = 0;

   static final Class_r a(Class_r var0) {
      int var1 = var0.d((byte)-121);
      byte var2 = 0;

      for (int var3 = 0; var3 < var1; var3++) {
         byte var4 = var0.h[var3];
         if (var4 == 60 || var4 == 62) {
            var2 += 3;
         }
      }

      Class_r var8 = new Class_r();
      var8.G = var1 + var2;
      var8.h = new byte[var8.G];
      int var5 = 0;

      for (int var6 = 0; var6 < var1; var6++) {
         byte var7 = var0.h[var6];
         if (var7 == 60) {
            var8.h[var5++] = 60;
            var8.h[var5++] = 108;
            var8.h[var5++] = 116;
            var8.h[var5++] = 62;
         } else if (var7 == 62) {
            var8.h[var5++] = 60;
            var8.h[var5++] = 103;
            var8.h[var5++] = 116;
            var8.h[var5++] = 62;
         } else {
            var8.h[var5++] = var7;
         }
      }

      return var8;
   }

   final void a(Class_r var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var1 != null) {
         this.c(var4, var5);
         double var8 = 7.0 - var7 / 8.0;
         if (var8 < 0.0) {
            var8 = 0.0;
         }

         int[] var10 = new int[var1.G];

         for (int var11 = 0; var11 < var1.G; var11++) {
            var10[var11] = (int)(Math.sin(var11 / 1.5 + var6) * var8);
         }

         this.a(var1, var2 - this.c(var1) / 2, var3, null, var10);
      }
   }

   private final int d(int var1) {
      return this.pb[var1 & 0xFF];
   }

   private final void a(int var1, int var2, int var3) {
      ub = -1;
      xb = -1;
      yb = var2;
      tb = var2;
      rb = var1;
      Bb = var1;
      vb = var3;
      Ab = var3;
      zb = 0;
      wb = 0;
   }

   final int a(Class_r var1, int[] var2, Class_r[] var3) {
      if (var1 == null) {
         return 0;
      } else {
         Q.a(0, (byte)-80);
         int var4 = 0;
         int var5 = 0;
         int var6 = -1;
         int var7 = 0;
         byte var8 = 0;
         int var9 = -1;
         int var10 = -1;
         int var11 = 0;
         int var12 = var1.d((byte)-122);

         for (int var13 = 0; var13 < var12; var13++) {
            int var14 = var1.a(var13, 7178);
            if (var14 == 60) {
               var9 = var13;
            } else {
               if (var14 == 62 && var9 != -1) {
                  Class_r var15 = var1.a(var9 + 1, (byte)-74, var13);
                  var9 = -1;
                  Q.b(60, 26011);
                  Q.b(var15, 12147);
                  Q.b(62, 26011);
                  if (var15.a(W, (byte)95)) {
                     if (var3[var11] != null) {
                        var3[var11].a(0, (byte)-103);
                        var3[var11] = var3[var11].a(var5, Q.d((byte)-108), -10000, Q);
                     } else {
                        var3[var11] = Q.a(var5, (byte)-74, Q.d((byte)-98));
                     }

                     var11++;
                     var5 = Q.d((byte)-108);
                     var4 = 0;
                     var6 = -1;
                     var10 = -1;
                  } else if (var15.a(hb, (byte)101)) {
                     var4 += this.d(60);
                     if (this.Y != null && var10 != -1) {
                        var4 += this.Y[(var10 << 8) + 60];
                     }

                     var10 = 60;
                  } else if (var15.a(O, (byte)127)) {
                     var4 += this.d(62);
                     if (this.Y != null && var10 != -1) {
                        var4 += this.Y[(var10 << 8) + 62];
                     }

                     var10 = 62;
                  } else if (var15.a(I, (byte)109)) {
                     var4 += this.d(160);
                     if (this.Y != null && var10 != -1) {
                        var4 += this.Y[(var10 << 8) + 160];
                     }

                     var10 = 160;
                  } else if (var15.a(jb, (byte)115)) {
                     var4 += this.d(173);
                     if (this.Y != null && var10 != -1) {
                        var4 += this.Y[(var10 << 8) + 173];
                     }

                     var10 = 173;
                  } else if (var15.a(mb, (byte)101)) {
                     var4 += this.d(215);
                     if (this.Y != null && var10 != -1) {
                        var4 += this.Y[(var10 << 8) + 215];
                     }

                     var10 = 215;
                  } else if (var15.a(U, (byte)90)) {
                     var4 += this.d(128);
                     if (this.Y != null && var10 != -1) {
                        var4 += this.Y[(var10 << 8) + 128];
                     }

                     var10 = 128;
                  } else if (var15.a(kb, (byte)99)) {
                     var4 += this.d(169);
                     if (this.Y != null && var10 != -1) {
                        var4 += this.Y[(var10 << 8) + 169];
                     }

                     var10 = 169;
                  } else if (var15.a(qb, (byte)104)) {
                     var4 += this.d(174);
                     if (this.Y != null && var10 != -1) {
                        var4 += this.Y[(var10 << 8) + 174];
                     }

                     var10 = 174;
                  } else if (var15.a(cb, 45)) {
                     try {
                        int var16 = var15.b(4, true).g((byte)-118);
                        var4 += this.ab[var16].d;
                        var10 = -1;
                     } catch (Exception var17) {
                     }
                  }

                  var14 = -1;
               }

               if (var9 == -1) {
                  if (var14 != -1) {
                     Q.b(var14, 26011);
                     var4 += this.d(var14);
                     if (this.Y != null && var10 != -1) {
                        var4 += this.Y[(var10 << 8) + var14];
                     }

                     var10 = var14;
                  }

                  if (var14 == 32) {
                     var6 = Q.d((byte)-116);
                     var7 = var4;
                     var8 = 1;
                  }

                  if (var2 != null && var4 > var2[var11 < var2.length ? var11 : var2.length - 1] && var6 >= 0) {
                     if (var3[var11] != null) {
                        var3[var11].a(0, (byte)-119);
                        var3[var11] = var3[var11].a(var5, var6 - var8, -10000, Q);
                     } else {
                        var3[var11] = Q.a(var5, (byte)-74, var6 - var8);
                     }

                     var11++;
                     var5 = var6;
                     var6 = -1;
                     var4 -= var7;
                     var10 = -1;
                  }

                  if (var14 == 45) {
                     var6 = Q.d((byte)-103);
                     var7 = var4;
                     var8 = 0;
                  }
               }
            }
         }

         if (Q.d((byte)-110) > var5) {
            if (var3[var11] != null) {
               var3[var11].a(0, (byte)-72);
               var3[var11] = var3[var11].a(var5, Q.d((byte)-103), -10000, Q);
            } else {
               var3[var11] = Q.a(var5, (byte)-74, Q.d((byte)-109));
            }

            var11++;
         }

         return var11;
      }
   }

   private static final int a(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
      int var7 = var2[var5];
      int var8 = var7 + var4[var5];
      int var9 = var2[var6];
      int var10 = var9 + var4[var6];
      int var11 = var7;
      if (var9 > var7) {
         var11 = var9;
      }

      int var12 = var8;
      if (var10 < var8) {
         var12 = var10;
      }

      int var13 = var3[var5];
      if (var3[var6] < var13) {
         var13 = var3[var6];
      }

      byte[] var14 = var1[var5];
      byte[] var15 = var0[var6];
      int var16 = var11 - var7;
      int var17 = var11 - var9;

      for (int var18 = var11; var18 < var12; var18++) {
         int var19 = var14[var16++] + var15[var17++];
         if (var19 < var13) {
            var13 = var19;
         }
      }

      return -var13;
   }

   final void a(Class_r var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.c(var4, var5);
         int[] var7 = new int[var1.G];
         int[] var8 = new int[var1.G];

         for (int var9 = 0; var9 < var1.G; var9++) {
            var7[var9] = (int)(Math.sin(var9 / 5.0 + var6 / 5.0) * 5.0);
            var8[var9] = (int)(Math.sin(var9 / 3.0 + var6 / 5.0) * 5.0);
         }

         this.a(var1, var2 - this.c(var1) / 2, var3, var7, var8);
      }
   }

   final void b(Class_r var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.c(var4, var5);
         int[] var7 = new int[var1.G];

         for (int var8 = 0; var8 < var1.G; var8++) {
            var7[var8] = (int)(Math.sin(var8 / 2.0 + var6 / 5.0) * 5.0);
         }

         this.a(var1, var2 - this.c(var1) / 2, var3, null, var7);
      }
   }

   final void a(Class_pc[] var1, int[] var2) {
      if (var2 != null && var2.length != var1.length) {
         throw new IllegalArgumentException();
      } else {
         this.ab = var1;
         this.ib = var2;
      }
   }

   final int a(Class_r var1, int var2) {
      int var3 = this.a(var1, new int[]{var2}, sb);
      int var4 = 0;

      for (int var5 = 0; var5 < var3; var5++) {
         int var6 = this.c(sb[var5]);
         if (var6 > var4) {
            var4 = var6;
         }
      }

      return var4;
   }

   final int a(Class_r var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      return this.a(var1, var2, var3, var4, var5, var6, var7, 256, var8, var9, var10);
   }

   final int b(Class_r var1, int var2) {
      return this.a(var1, new int[]{var2}, sb);
   }

   private final void a(Class_r var1, int var2, int var3) {
      var3 -= this.K;
      int var4 = -1;
      int var5 = -1;

      for (int var6 = 0; var6 < var1.G; var6++) {
         int var7 = var1.h[var6] & 255;
         if (var7 == 60) {
            var4 = var6;
         } else {
            if (var7 == 62 && var4 != -1) {
               Class_r var8 = var1.a(var4 + 1, (byte)-74, var6);
               var4 = -1;
               if (var8.a(hb, (byte)106)) {
                  var7 = 60;
               } else if (var8.a(O, (byte)106)) {
                  var7 = 62;
               } else if (var8.a(I, (byte)95)) {
                  var7 = 160;
               } else if (var8.a(jb, (byte)97)) {
                  var7 = 173;
               } else if (var8.a(mb, (byte)120)) {
                  var7 = 215;
               } else if (var8.a(U, (byte)124)) {
                  var7 = 128;
               } else if (var8.a(kb, (byte)92)) {
                  var7 = 169;
               } else {
                  if (!var8.a(qb, (byte)101)) {
                     if (var8.a(cb, 61)) {
                        try {
                           int var15 = var8.b(4, true).g((byte)-3);
                           Class_pc var16 = this.ab[var15];
                           int var11 = this.ib != null ? this.ib[var15] : var16.b;
                           if (Ab == 256) {
                              var16.a(var2, var3 + this.K - var11);
                           } else {
                              var16.a(var2, var3 + this.K - var11, Ab);
                           }

                           var2 += var16.d;
                           var5 = -1;
                        } catch (Exception var12) {
                        }
                     } else {
                        this.b(var8);
                     }
                     continue;
                  }

                  var7 = 174;
               }
            }

            if (var4 == -1) {
               if (this.Y != null && var5 != -1) {
                  var2 += this.Y[(var5 << 8) + var7];
               }

               int var14 = this.fb[var7];
               int var9 = this.T[var7];
               if (var7 != 32) {
                  if (Ab == 256) {
                     if (tb != -1) {
                        this.a(var7, var2 + this.Z[var7] + 1, var3 + this.M[var7] + 1, var14, var9, tb, true);
                     }

                     this.a(var7, var2 + this.Z[var7], var3 + this.M[var7], var14, var9, Bb, false);
                  } else {
                     if (tb != -1) {
                        this.a(var7, var2 + this.Z[var7] + 1, var3 + this.M[var7] + 1, var14, var9, tb, Ab, true);
                     }

                     this.a(var7, var2 + this.Z[var7], var3 + this.M[var7], var14, var9, Bb, Ab, false);
                  }
               } else if (zb > 0) {
                  wb = wb + zb;
                  var2 += wb >> 8;
                  wb &= 255;
               }

               int var10 = this.pb[var7];
               if (ub != -1) {
                  Class_nc.d(var2, var3 + (int)(this.K * 0.7), var10, ub);
               }

               if (xb != -1) {
                  Class_nc.d(var2, var3 + this.K + 1, var10, xb);
               }

               var2 += var10;
               var5 = var7;
            }
         }
      }
   }

   final void a(Class_r var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.c(var4, var5);
         this.a(var1, var2 - this.c(var1), var3);
      }
   }

   abstract void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8);

   abstract void a(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7);

   private final void a(Class_r var1, int var2, int var3, int[] var4, int[] var5) {
      var3 -= this.K;
      int var6 = -1;
      int var7 = -1;
      int var8 = 0;

      for (int var9 = 0; var9 < var1.G; var9++) {
         int var10 = var1.h[var9] & 255;
         if (var10 == 60) {
            var6 = var9;
         } else {
            if (var10 == 62 && var6 != -1) {
               Class_r var11 = var1.a(var6 + 1, (byte)-74, var9);
               var6 = -1;
               if (var11.a(hb, (byte)119)) {
                  var10 = 60;
               } else if (var11.a(O, (byte)123)) {
                  var10 = 62;
               } else if (var11.a(I, (byte)106)) {
                  var10 = 160;
               } else if (var11.a(jb, (byte)103)) {
                  var10 = 173;
               } else if (var11.a(mb, (byte)97)) {
                  var10 = 215;
               } else if (var11.a(U, (byte)99)) {
                  var10 = 128;
               } else if (var11.a(kb, (byte)114)) {
                  var10 = 169;
               } else {
                  if (!var11.a(qb, (byte)127)) {
                     if (var11.a(cb, 90)) {
                        try {
                           int var20;
                           if (var4 != null) {
                              var20 = var4[var8];
                           } else {
                              var20 = 0;
                           }

                           int var21;
                           if (var5 != null) {
                              var21 = var5[var8];
                           } else {
                              var21 = 0;
                           }

                           var8++;
                           int var22 = var11.b(4, true).g((byte)-53);
                           Class_pc var23 = this.ab[var22];
                           int var16 = this.ib != null ? this.ib[var22] : var23.b;
                           if (Ab == 256) {
                              var23.a(var2 + var20, var3 + this.K - var16 + var21);
                           } else {
                              var23.a(var2 + var20, var3 + this.K - var16 + var21, Ab);
                           }

                           var2 += var23.d;
                           var7 = -1;
                        } catch (Exception var17) {
                        }
                     } else {
                        this.b(var11);
                     }
                     continue;
                  }

                  var10 = 174;
               }
            }

            if (var6 == -1) {
               if (this.Y != null && var7 != -1) {
                  var2 += this.Y[(var7 << 8) + var10];
               }

               int var19 = this.fb[var10];
               int var12 = this.T[var10];
               int var13;
               if (var4 != null) {
                  var13 = var4[var8];
               } else {
                  var13 = 0;
               }

               int var14;
               if (var5 != null) {
                  var14 = var5[var8];
               } else {
                  var14 = 0;
               }

               var8++;
               if (var10 != 32) {
                  if (Ab == 256) {
                     if (tb != -1) {
                        this.a(var10, var2 + this.Z[var10] + 1 + var13, var3 + this.M[var10] + 1 + var14, var19, var12, tb, true);
                     }

                     this.a(var10, var2 + this.Z[var10] + var13, var3 + this.M[var10] + var14, var19, var12, Bb, false);
                  } else {
                     if (tb != -1) {
                        this.a(var10, var2 + this.Z[var10] + 1 + var13, var3 + this.M[var10] + 1 + var14, var19, var12, tb, Ab, true);
                     }

                     this.a(var10, var2 + this.Z[var10] + var13, var3 + this.M[var10] + var14, var19, var12, Bb, Ab, false);
                  }
               } else if (zb > 0) {
                  wb = wb + zb;
                  var2 += wb >> 8;
                  wb &= 255;
               }

               int var15 = this.pb[var10];
               if (ub != -1) {
                  Class_nc.d(var2, var3 + (int)(this.K * 0.7), var15, ub);
               }

               if (xb != -1) {
                  Class_nc.d(var2, var3 + this.K, var15, xb);
               }

               var2 += var15;
               var7 = var10;
            }
         }
      }
   }

   private final void b(Class_r var1) {
      try {
         if (var1.a(V, 126)) {
            Bb = var1.b(4, true).d(16, 48);
            return;
         }

         if (var1.a(bb, (byte)117)) {
            Bb = rb;
            return;
         }

         if (var1.a(J, 50)) {
            Ab = var1.b(6, true).g((byte)-118);
            return;
         }

         if (var1.a(lb, (byte)127)) {
            Ab = vb;
            return;
         }

         if (var1.a(X, 61)) {
            ub = var1.b(4, true).d(16, 90);
            return;
         }

         if (var1.a(eb, (byte)126)) {
            ub = 8388608;
            return;
         }

         if (var1.a(S, (byte)111)) {
            ub = -1;
            return;
         }

         if (var1.a(nb, 43)) {
            xb = var1.b(2, true).d(16, 51);
            return;
         }

         if (var1.a(ob, (byte)127)) {
            xb = 0;
            return;
         }

         if (var1.a(db, (byte)117)) {
            xb = -1;
            return;
         }

         if (var1.a(gb, 98)) {
            tb = var1.b(5, true).d(16, 51);
            return;
         }

         if (var1.a(L, (byte)92)) {
            tb = 0;
            return;
         }

         if (var1.a(N, (byte)113)) {
            tb = yb;
            return;
         }

         if (var1.a(W, (byte)118)) {
            this.a(rb, yb, vb);
            return;
         }
      } catch (Exception var2) {
      }
   }

   private final void c(int var1, int var2) {
      ub = -1;
      xb = -1;
      yb = var2;
      tb = var2;
      rb = var1;
      Bb = var1;
      vb = 256;
      Ab = 256;
      zb = 0;
      wb = 0;
   }

   private final void a(byte[] var1) {
      this.pb = new int[256];
      if (var1.length == 257) {
         for (int var14 = 0; var14 < this.pb.length; var14++) {
            this.pb[var14] = var1[var14] & 255;
         }

         this.K = var1[256] & 255;
      } else {
         int var2 = 0;

         for (int var3 = 0; var3 < 256; var3++) {
            this.pb[var3] = var1[var2++] & 255;
         }

         int[] var4 = new int[256];
         int[] var5 = new int[256];

         for (int var6 = 0; var6 < 256; var6++) {
            var4[var6] = var1[var2++] & 255;
         }

         for (int var7 = 0; var7 < 256; var7++) {
            var5[var7] = var1[var2++] & 255;
         }

         byte[][] var8 = new byte[256][];

         for (int var9 = 0; var9 < 256; var9++) {
            var8[var9] = new byte[var4[var9]];
            byte var10 = 0;

            for (int var11 = 0; var11 < var8[var9].length; var11++) {
               var10 += var1[var2++];
               var8[var9][var11] = var10;
            }
         }

         byte[][] var15 = new byte[256][];

         for (int var16 = 0; var16 < 256; var16++) {
            var15[var16] = new byte[var4[var16]];
            byte var12 = 0;

            for (int var13 = 0; var13 < var15[var16].length; var13++) {
               var12 += var1[var2++];
               var15[var16][var13] = var12;
            }
         }

         this.Y = new byte[65536];

         for (int var17 = 0; var17 < 256; var17++) {
            if (var17 != 32 && var17 != 160) {
               for (int var18 = 0; var18 < 256; var18++) {
                  if (var18 != 32 && var18 != 160) {
                     this.Y[(var17 << 8) + var18] = (byte)a(var8, var15, var5, this.pb, var4, var17, var18);
                  }
               }
            }
         }

         this.K = var5[32] + var4[32];
      }
   }

   final int c(Class_r var1) {
      if (var1 == null) {
         return 0;
      } else {
         int var2 = -1;
         int var3 = -1;
         int var4 = 0;

         for (int var5 = 0; var5 < var1.G; var5++) {
            int var6 = var1.h[var5] & 255;
            if (var6 == 60) {
               var2 = var5;
            } else {
               if (var6 == 62 && var2 != -1) {
                  Class_r var7 = var1.a(var2 + 1, (byte)-74, var5);
                  var2 = -1;
                  if (var7.a(hb, (byte)101)) {
                     var6 = 60;
                  } else if (var7.a(O, (byte)122)) {
                     var6 = 62;
                  } else if (var7.a(I, (byte)112)) {
                     var6 = 160;
                  } else if (var7.a(jb, (byte)93)) {
                     var6 = 173;
                  } else if (var7.a(mb, (byte)96)) {
                     var6 = 215;
                  } else if (var7.a(U, (byte)99)) {
                     var6 = 128;
                  } else if (var7.a(kb, (byte)125)) {
                     var6 = 169;
                  } else {
                     if (!var7.a(qb, (byte)112)) {
                        if (var7.a(cb, 64)) {
                           try {
                              int var8 = var7.b(4, true).g((byte)-22);
                              var4 += this.ab[var8].d;
                              var3 = -1;
                           } catch (Exception var9) {
                           }
                        }
                        continue;
                     }

                     var6 = 174;
                  }
               }

               if (var2 == -1) {
                  var4 += this.pb[var6];
                  if (this.Y != null && var3 != -1) {
                     var4 += this.Y[(var3 << 8) + var6];
                  }

                  var3 = var6;
               }
            }
         }

         return var4;
      }
   }

   final void b(Class_r var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.c(var4, var5);
         this.a(var1, var2, var3);
      }
   }

   private final void c(Class_r var1, int var2) {
      int var3 = 0;
      boolean var4 = false;

      for (int var5 = 0; var5 < var1.d((byte)-122); var5++) {
         int var6 = var1.a(var5, 7178);
         if (var6 == 60) {
            var4 = true;
         } else if (var6 == 62) {
            var4 = false;
         } else if (!var4 && var6 == 32) {
            var3++;
         }
      }

      if (var3 > 0) {
         zb = (var2 - this.c(var1) << 8) / var3;
      }
   }

   final void c(Class_r var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.c(var4, var5);
         this.a(var1, var2 - this.c(var1) / 2, var3);
      }
   }

   public static void a() {
      hb = null;
      O = null;
      I = null;
      jb = null;
      mb = null;
      U = null;
      kb = null;
      qb = null;
      cb = null;
      W = null;
      V = null;
      bb = null;
      J = null;
      lb = null;
      nb = null;
      ob = null;
      db = null;
      gb = null;
      L = null;
      N = null;
      X = null;
      eb = null;
      S = null;
      Q = null;
      sb = null;
   }

   final int a(Class_r var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      if (var1 == null) {
         return 0;
      } else {
         this.a(var6, var7, var8);
         if (var11 == 0) {
            var11 = this.K;
         }

         int[] var12 = new int[]{var4};
         if (var5 < this.P + this.R + var11 && var5 < var11 + var11) {
            var12 = null;
         }

         int var13 = this.a(var1, var12, sb);
         if (var10 == 3 && var13 == 1) {
            var10 = 1;
         }

         int var14;
         if (var10 == 0) {
            var14 = var3 + this.P;
         } else if (var10 == 1) {
            var14 = var3 + this.P + (var5 - this.P - this.R - (var13 - 1) * var11) / 2;
         } else if (var10 == 2) {
            var14 = var3 + var5 - this.R - (var13 - 1) * var11;
         } else {
            int var15 = (var5 - this.P - this.R - (var13 - 1) * var11) / (var13 + 1);
            if (var15 < 0) {
               var15 = 0;
            }

            var14 = var3 + this.P + var15;
            var11 += var15;
         }

         for (int var16 = 0; var16 < var13; var16++) {
            if (var9 == 0) {
               this.a(sb[var16], var2, var14);
            } else if (var9 == 1) {
               this.a(sb[var16], var2 + (var4 - this.c(sb[var16])) / 2, var14);
            } else if (var9 == 2) {
               this.a(sb[var16], var2 + var4 - this.c(sb[var16]), var14);
            } else if (var16 == var13 - 1) {
               this.a(sb[var16], var2, var14);
            } else {
               this.c(sb[var16], var4);
               this.a(sb[var16], var2, var14);
               zb = 0;
            }

            var14 += var11;
         }

         return var13;
      }
   }

   Class_af(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5) {
      this.Z = var2;
      this.M = var3;
      this.fb = var4;
      this.T = var5;
      this.a(var1);
      int var6 = 2147483647;
      int var7 = -2147483648;

      for (int var8 = 0; var8 < 256; var8++) {
         if (this.M[var8] < var6 && this.T[var8] != 0) {
            var6 = this.M[var8];
         }

         if (this.M[var8] + this.T[var8] > var7) {
            var7 = this.M[var8] + this.T[var8];
         }
      }

      this.P = this.K - var6;
      this.R = var7 - this.K;
   }

   final int a(Class_r var1, int var2, int var3, int var4, int var5, Random var6, int var7) {
      if (var1 == null) {
         return 0;
      } else {
         var6.setSeed(var7);
         this.a(var4, var5, 192 + (var6.nextInt() & 31));
         int[] var8 = new int[var1.G];
         int var9 = 0;

         for (int var10 = 0; var10 < var1.G; var10++) {
            var8[var10] = var9;
            if ((var6.nextInt() & 3) == 0) {
               var9++;
            }
         }

         this.a(var1, var2, var3, var8, null);
         return var9;
      }
   }

   Class_af(byte[] var1) {
      this.a(var1);
   }
}
