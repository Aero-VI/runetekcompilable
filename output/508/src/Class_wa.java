import java.io.EOFException;
import java.io.File;
import java.io.IOException;

final class Class_wa {
   static int[][] a = new int[][]{
      new int[16],
      {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
      {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1},
      {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
      {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1},
      {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
      {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1},
      {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0},
      {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0},
      {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1},
      {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
      {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1},
      {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}
   };
   static int b;
   static int c;
   static int d;
   static int e;
   static Class_r f = Class_wa.s;
   static int g;
   static int h;
   static int i;
   private long j;
   static Class_r k = Class_tc.a(43, "sl_flags");
   private int l = 0;
   static Class_r m = Class_wa.p;
   static int n;
   private long o;
   private static Class_r p = Class_tc.a(43, "glow2:");
   private long q = -1L;
   static Class_r r = Class_tc.a(43, "gelb:");
   private static Class_r s = Class_tc.a(43, "Please wait)3)3)3");
   private byte[] t;
   static int u;
   private long v;
   private long w = -1L;
   static Class_r x = Class_tc.a(43, "(U0a )2 in: ");
   static int y;
   private byte[] z;
   static int A;
   static int B;
   static boolean C = false;
   private Class_ac D;
   private long E;
   private int F;
   static Class_r G = p;
   static int H = 0;

   static final Class_ni a(byte var0) {
      try {
         n++;
         int var1 = Class_ld.ib[0] * Class_ia.bb[0];
         int[] var3 = new int[var1];
         byte[] var2 = Class_lj.h[0];
         int var4 = 0;
         if (var0 != -83) {
            return null;
         } else {
            while (~var4 > ~var1) {
               var3[var4] = Class_ji.Y[Class_ui.a(255, var2[var4])];
               var4++;
            }

            Class_ni var5 = new Class_ni(Class_qb.b, Class_tf.bb, Class_ae.g[0], Class_ub.L[0], Class_ia.bb[0], Class_ld.ib[0], var3);
            Class_oe.a((byte)-93);
            return var5;
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "wa.B(" + var0 + ')');
      }
   }

   static final void a(Class_cj var0, Class_cj var1, Class_cj var2, boolean var3, Class_cj var4) {
      try {
         Class_vc.R = var0;
         Class_ba.A = var4;
         client.gb = var2;
         if (var3) {
            B++;
            Class_kg.w = var1;
            Class_ve.ab = new Class_ha[client.gb.c(0)][];
            Class_jk.y = new boolean[client.gb.c(0)];
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(
            var6,
            "wa.J("
               + (var0 != null ? "{...}" : "null")
               + ','
               + (var1 != null ? "{...}" : "null")
               + ','
               + (var2 != null ? "{...}" : "null")
               + ','
               + var3
               + ','
               + (var4 != null ? "{...}" : "null")
               + ')'
         );
      }
   }

   final void a(int var1, byte[] var2) throws IOException {
      try {
         g++;
         this.b(0, var2.length, 0, var2);
         if (var1 > -33) {
            a(null, null, null, true, null);
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "wa.D(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
      }
   }

   final long b(byte var1) {
      try {
         y++;
         if (var1 <= 48) {
            this.j = 100L;
         }

         return this.j;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "wa.H(" + var1 + ')');
      }
   }

   final void a(int var1, int var2, int var3, byte[] var4) throws IOException {
      int var10 = client.lb;

      try {
         u++;

         try {
            if (var2 == 0) {
               if (this.j < this.o - -var1) {
                  this.j = this.o - -var1;
               }

               if (~this.w != 0L && (~this.o > ~this.w || this.w - -this.l < this.o)) {
                  this.a(var2 + 86);
               }

               if (this.w != -1L && ~(this.t.length + this.w) > ~(this.o + var1)) {
                  int var5 = (int)(this.t.length - this.o + this.w);
                  var1 -= var5;
                  Class_gb.a(var4, var3, this.t, (int)(this.o - this.w), var5);
                  this.o += var5;
                  this.l = this.t.length;
                  this.a(40);
                  var3 += var5;
               }

               if (var1 > this.t.length) {
                  long var7 = -1L;
                  long var13 = -1L;
                  if (~this.o != ~this.v) {
                     this.D.a(false, this.o);
                     this.v = this.o;
                  }

                  label90: {
                     this.D.a(var3, var4, 18405, var1);
                     if (~(this.o - -var1) < ~this.q && this.o - -var1 <= this.q + this.F) {
                        var7 = var1 + this.o;
                        if (var10 == 0) {
                           break label90;
                        }
                     }

                     if (~(this.q + this.F) < ~this.o && ~(var1 + this.o) <= ~(this.F + this.q)) {
                        var7 = this.F + this.q;
                     }
                  }

                  label118: {
                     this.v += var1;
                     if (~this.o > ~this.q || ~this.o <= ~(this.q - -this.F)) {
                        if (~this.o < ~this.q || this.q >= this.o - -var1) {
                           break label118;
                        }

                        var13 = this.q;
                        if (var10 == 0) {
                           break label118;
                        }
                     }

                     var13 = this.o;
                  }

                  if (this.v > this.E) {
                     this.E = this.v;
                  }

                  if (var13 > -1L && ~var7 < ~var13) {
                     int var9 = (int)(var7 - var13);
                     Class_gb.a(var4, (int)(var13 + var3 + -this.o), this.z, (int)(-this.q + var13), var9);
                  }

                  this.o += var1;
               } else if (~var1 < -1) {
                  if (this.w == -1L) {
                     this.w = this.o;
                  }

                  Class_gb.a(var4, var3, this.t, (int)(this.o - this.w), var1);
                  this.o += var1;
                  if (~(-this.w + this.o) < ~this.l) {
                     this.l = (int)(-this.w + this.o);
                  }
               }
            }
         } catch (IOException var11) {
            this.v = -1L;
            throw var11;
         }
      } catch (RuntimeException var12) {
         throw Class_sh.a(var12, "wa.A(" + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ')');
      }
   }

   public static void a(boolean var0) {
      try {
         m = null;
         r = null;
         if (!var0) {
            m = null;
         }

         x = null;
         p = null;
         a = null;
         s = null;
         f = null;
         G = null;
         k = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "wa.C(" + var0 + ')');
      }
   }

   private final File b(boolean var1) {
      try {
         e++;
         if (!var1) {
            this.w = 14L;
         }

         return this.D.b(0);
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "wa.F(" + var1 + ')');
      }
   }

   private final void a(int var1) throws IOException {
      int var8 = client.lb;

      try {
         b++;
         int var2 = -72 % ((var1 - -42) / 59);
         if (~this.w != 0L) {
            if (~this.w != ~this.v) {
               this.D.a(false, this.w);
               this.v = this.w;
            }

            long var3;
            label51: {
               var3 = -1L;
               this.D.a(0, this.t, 18405, this.l);
               this.v = this.v + this.l;
               if (~this.q >= ~this.w && this.w < this.F + this.q) {
                  var3 = this.w;
                  if (var8 == 0) {
                     break label51;
                  }
               }

               if (this.w <= this.q && ~(this.w - -this.l) < ~this.q) {
                  var3 = this.q;
               }
            }

            long var5;
            label45: {
               var5 = -1L;
               if (this.l + this.w > this.q && this.w + this.l <= this.F + this.q) {
                  var5 = this.w + this.l;
                  if (var8 == 0) {
                     break label45;
                  }
               }

               if (~(this.F + this.q) < ~this.w && ~(this.q - -this.F) >= ~(this.l + this.w)) {
                  var5 = this.F + this.q;
               }
            }

            if (~this.v < ~this.E) {
               this.E = this.v;
            }

            if (var3 > -1L && ~var3 > ~var5) {
               int var7 = (int)(-var3 + var5);
               Class_gb.a(this.t, (int)(var3 + -this.w), this.z, (int)(var3 - this.q), var7);
            }

            this.w = -1L;
            this.l = 0;
         }
      } catch (RuntimeException var9) {
         throw Class_sh.a(var9, "wa.G(" + var1 + ')');
      }
   }

   final void b(int var1) throws IOException {
      try {
         this.a(-121);
         if (var1 == -9715) {
            A++;
            this.D.c(var1 + 1572);
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "wa.E(" + var1 + ')');
      }
   }

   final void a(long var1, int var3) throws IOException {
      try {
         d++;
         if (var1 < 0L) {
            throw new IOException("Invalid seek to " + var1 + " in file " + this.b(true));
         } else {
            this.o = var1;
            if (var3 != 1) {
               this.j = -83L;
            }
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "wa.K(" + var1 + ',' + var3 + ')');
      }
   }

   final void b(int var1, int var2, int var3, byte[] var4) throws IOException {
      try {
         c++;

         try {
            if (var2 + var1 > var4.length) {
               throw new ArrayIndexOutOfBoundsException(var2 + var1 + -var4.length);
            }

            if (~this.w != 0L && ~this.o <= ~this.w && ~(this.o + var2) >= ~(this.w - -this.l)) {
               Class_gb.a(this.t, (int)(-this.w + this.o), var4, var1, var2);
               this.o += var2;
               return;
            }

            long var5 = this.o;
            int var8 = var2;
            int var7 = var1;
            if (~this.o <= ~this.q && this.o < this.F + this.q) {
               int var9 = (int)(this.F - (this.o + -this.q));
               if (var2 < var9) {
                  var9 = var2;
               }

               var2 -= var9;
               Class_gb.a(this.z, (int)(-this.q + this.o), var4, var1, var9);
               this.o += var9;
               var1 += var9;
            }

            if (~this.z.length > ~var2) {
               this.D.a(false, this.o);
               this.v = this.o;

               while (~var2 < -1) {
                  int var17 = this.D.a(var2, 0, var1, var4);
                  if (~var17 == 0) {
                     break;
                  }

                  var1 += var17;
                  var2 -= var17;
                  this.o += var17;
                  this.v += var17;
               }
            } else if (~var2 < -1) {
               this.c(false);
               int var16 = var2;
               if (~var2 < ~this.F) {
                  var16 = this.F;
               }

               Class_gb.a(this.z, 0, var4, var1, var16);
               this.o += var16;
               var2 -= var16;
               var1 += var16;
            }

            if (~this.w != 0L) {
               if (this.w > this.o && ~var2 < -1) {
                  int var18 = var1 + (int)(-this.o + this.w);
                  if (~var18 < ~(var1 - -var2)) {
                     var18 = var1 - -var2;
                  }

                  while (var1 < var18) {
                     var4[var1++] = 0;
                     this.o++;
                     var2--;
                  }
               }

               long var19 = -1L;
               if (this.w >= var5 && ~(var5 - -var8) < ~this.w) {
                  var19 = this.w;
               } else if (~this.w >= ~var5 && var5 < this.l + this.w) {
                  var19 = var5;
               }

               long var11 = -1L;
               if (~var5 > ~(this.l + this.w) && ~(this.w - -this.l) >= ~(var8 + var5)) {
                  var11 = this.l + this.w;
               } else if (~(var8 + var5) < ~this.w && this.w - -this.l >= var8 + var5) {
                  var11 = var8 + var5;
               }

               if (~var19 < 0L && ~var19 > ~var11) {
                  int var13 = (int)(-var19 + var11);
                  Class_gb.a(this.t, (int)(var19 - this.w), var4, var7 - -((int)(-var5 + var19)), var13);
                  if (~var11 < ~this.o) {
                     var2 = (int)(var2 - (var11 + -this.o));
                     this.o = var11;
                  }
               }
            }
         } catch (IOException var14) {
            this.v = -1L;
            throw var14;
         }

         if (var3 < var2) {
            throw new EOFException();
         }
      } catch (RuntimeException var15) {
         throw Class_sh.a(var15, "wa.I(" + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ')');
      }
   }

   private final void c(boolean var1) throws IOException {
      try {
         h++;
         if (!var1) {
            this.F = 0;
            if (~this.o != ~this.v) {
               this.D.a(false, this.o);
               this.v = this.o;
            }

            this.q = this.o;

            while (~this.F > ~this.z.length) {
               int var2 = -this.F + this.z.length;
               if (var2 > 200000000) {
                  var2 = 200000000;
               }

               int var3 = this.D.a(var2, 0, this.F, this.z);
               if (~var3 == 0) {
                  break;
               }

               this.v += var3;
               this.F += var3;
            }
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "wa.L(" + var1 + ')');
      }
   }

   Class_wa(Class_ac var1, int var2, int var3) throws IOException {
      try {
         this.D = var1;
         this.j = this.E = var1.a(-1);
         this.z = new byte[var2];
         this.t = new byte[var3];
         this.o = 0L;
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "wa.<init>(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }
}
