import java.math.BigInteger;

class Class_lh extends Class_li {
   int p;
   static int q;
   static int r;
   static int s;
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
   byte[] E;
   static int F;
   static int G;
   static int H;
   static int I;
   static int J;
   static int K;
   static int L;
   static int M;
   static int N;
   static int O;
   static int P;
   static int Q;
   static int R;
   static int S;
   static int T;
   static int U;
   static int V;
   static int W;
   static int X;
   static int Y;
   static int Z;
   static int ab;
   static int bb;
   static boolean cb = false;
   static int db;
   static int eb;
   static int fb;
   static int gb;
   static int hb;
   static int ib;
   static int jb;
   static int kb;
   static int lb;
   static Class_n mb = new Class_n(0, 0);
   static int nb;
   static int ob;
   static int pb;
   static int qb;
   static int rb;
   static int sb;
   static int tb;
   static int ub;
   static int vb;
   static int wb;
   static int[] xb;
   static Class_ni[] yb;
   static int zb;
   static Class_tg Ab = new Class_tg(4096);
   static Class_tg Bb;
   static Class_pc[] Cb;

   final long a(int var1, byte var2) {
      try {
         var1--;
         int var3 = 67 % ((28 - var2) / 39);
         eb++;
         if (~var1 <= -1 && var1 <= 7) {
            int var4 = var1 * 8;

            long var5;
            for (var5 = 0L; ~var4 <= -1; var4 -= 8) {
               var5 |= (this.E[this.p++] & 255L) << var4;
            }

            return var5;
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "lh.H(" + var1 + ',' + var2 + ')');
      }
   }

   final int d(int var1) {
      try {
         this.p += 2;
         int var2 = 65 / ((var1 - 26) / 55);
         u++;
         return ((0xFF & this.E[this.p - 1]) << -1387447512) - -(this.E[-2 + this.p] & 0xFF);
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "lh.VA(" + var1 + 41);
      }
   }

   final Class_r e(int var1) {
      try {
         Q++;
         int var2 = this.p;

         while (~this.E[this.p++] != -1) {
         }

         if (var1 != 127) {
            xb = null;
         }

         return Class_pi.a(-var2 + (this.p - 1), this.E, var1 ^ 16, var2);
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "lh.IA(" + var1 + ')');
      }
   }

   final void b(int var1, int var2) {
      try {
         this.E[this.p++] = (byte)var2;
         if (var1 == 32) {
            db++;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "lh.L(" + var1 + ',' + var2 + ')');
      }
   }

   final int f(int var1) {
      try {
         T++;
         int var2 = this.E[this.p] & var1;
         return ~var2 > -129 ? this.n(-6677) : -32768 + this.k(var1 + 1355769289);
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "lh.EB(" + var1 + 41);
      }
   }

   final void a(byte var1, int var2) {
      try {
         this.E[this.p++] = (byte)(var2 >> -2017770840);
         this.E[this.p++] = (byte)var2;
         this.E[this.p++] = (byte)(var2 >> -1565653576);
         this.E[this.p++] = (byte)(var2 >> 1786657648);
         R++;
         if (var1 > -75) {
            Ab = null;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "lh.Q(" + var1 + ',' + var2 + ')');
      }
   }

   final void a(byte var1, Class_r var2) {
      try {
         if (var1 == -9) {
            J++;
            this.p = this.p + var2.a(this.p, var1 + 264, var2.d((byte)-113), 0, this.E);
            this.E[this.p++] = 0;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "lh.DB(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
      }
   }

   final int g(int var1) {
      try {
         if (var1 != -15046) {
            return 59;
         } else {
            L++;
            this.p += 2;
            return ((this.E[-2 + this.p] & 0xFF) << -711126968) + (0xFF & this.E[this.p + -1] + -128);
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "lh.WA(" + var1 + 41);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final void a(long var1, int var3, int var4) {
      int var6 = client.lb;

      try {
         var4--;
         M++;
         if (~var4 <= -1 && var4 <= 7) {
            if (var3 >= -106) {
               this.a(-115, 77, 125, null);
            }

            int var5 = 8 * var4;
            if (var6 != 0 || var5 >= 0) {
               do {
                  this.E[this.p++] = (byte)(var1 >> var5);
                  var5 -= 8;
               } while (var5 >= 0);
            }
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "lh.MA(" + var1 + ',' + var3 + ',' + var4 + ')');
      }
   }

   final byte a(boolean var1) {
      try {
         if (var1) {
            this.E = null;
         }

         wb++;
         return (byte)(-this.E[this.p++]);
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "lh.D(" + var1 + ')');
      }
   }

   final void a(int var1, boolean var2) {
      try {
         this.E[this.p++] = (byte)(var1 >> -282453968);
         O++;
         this.E[this.p++] = (byte)(var1 >> -1827586328);
         this.E[this.p++] = (byte)var1;
         if (var2) {
            xb = null;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "lh.FA(" + var1 + ',' + var2 + ')');
      }
   }

   Class_lh(int var1) {
      try {
         this.E = Class_fb.a(var1, (byte)-85);
         this.p = 0;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "lh.<init>(" + var1 + ')');
      }
   }

   final byte a(byte var1) {
      try {
         F++;
         if (var1 <= 22) {
            this.e(true);
         }

         return (byte)(this.E[this.p++] - 128);
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "lh.IB(" + var1 + ')');
      }
   }

   final int c(int var1, int var2) {
      try {
         int var4 = 43 % ((var2 - 59) / 43);
         s++;
         int var3 = Class_kk.a(this.p, false, var1, this.E);
         this.g(544537784, var3);
         return var3;
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "lh.S(" + var1 + 44 + var2 + 41);
      }
   }

   final int b(byte var1) {
      try {
         this.p += 3;
         z++;
         int var2 = 78 / (-var1 / 42);
         return (this.E[this.p + -1] & 0xFF) + (this.E[this.p + -3] << -1337350736 & 0xFF0000) - -((0xFF & this.E[-2 + this.p]) << -1317980984);
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "lh.GA(" + var1 + 41);
      }
   }

   final void b(byte var1, int var2) {
      try {
         int var3 = 70 % ((-27 - var1) / 63);
         this.E[this.p++] = (byte)(-var2);
         W++;
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "lh.U(" + var1 + ',' + var2 + ')');
      }
   }

   final void a(boolean var1, int var2) {
      try {
         if (var1) {
            this.c(false);
         }

         this.E[this.p++] = (byte)(var2 >> -870131448);
         this.E[this.p++] = (byte)var2;
         K++;
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "lh.KA(" + var1 + ',' + var2 + ')');
      }
   }

   final void a(boolean var1, long var2) {
      try {
         this.E[this.p++] = (byte)(var2 >> 521528504);
         if (!var1) {
            this.f(-50);
         }

         kb++;
         this.E[this.p++] = (byte)(var2 >> 1869536624);
         this.E[this.p++] = (byte)(var2 >> 1583085800);
         this.E[this.p++] = (byte)(var2 >> -1133298784);
         this.E[this.p++] = (byte)(var2 >> -820696616);
         this.E[this.p++] = (byte)(var2 >> 138189072);
         this.E[this.p++] = (byte)(var2 >> 1096640776);
         this.E[this.p++] = (byte)var2;
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "lh.F(" + var1 + ',' + var2 + ')');
      }
   }

   final int h(int var1) {
      try {
         jb++;
         this.p += 4;
         return var1 != -5528
            ? 119
            : (this.E[this.p + -1] & 0xFF)
               + (this.E[this.p + -3] << 1999953968 & 0xFF0000)
               + (((this.E[-4 + this.p] & 0xFF) << 423052568) - -(this.E[-2 + this.p] << -1988116152 & 0xFF00));
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "lh.G(" + var1 + 41);
      }
   }

   final void a(int var1, long var2) {
      try {
         N++;
         if (var1 != 128) {
            xb = null;
         }

         this.d((byte)127, (int)(var2 >> -41780448));
         this.d((byte)127, (int)var2);
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "lh.PA(" + var1 + ',' + var2 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int b(boolean var1) {
      int var4 = client.lb;

      try {
         r++;
         if (!var1) {
            return 89;
         } else {
            byte var2 = this.E[this.p++];
            int var3 = 0;
            if (var4 == 0 && var2 >= 0) {
               return var2 | var3;
            } else {
               do {
                  var3 = (var3 | 127 & var2) << -731912441;
                  var2 = this.E[this.p++];
               } while (var2 < 0);

               return var2 | var3;
            }
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "lh.O(" + var1 + 41);
      }
   }

   Class_lh(byte[] var1) {
      try {
         this.E = var1;
         this.p = 0;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "lh.<init>(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   final int i(int var1) {
      try {
         P++;
         this.p += 4;
         if (var1 < 4) {
            this.a(false, 115);
         }

         return (this.E[this.p + -1] << 440230864 & 0xFF0000)
            + ((0xFF000000 & this.E[-2 + this.p] << 1242983576) - -((this.E[-4 + this.p] & 0xFF) << 127484232) - -(0xFF & this.E[-3 + this.p]));
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "lh.A(" + var1 + 41);
      }
   }

   final void b(int var1, byte var2) {
      try {
         if (var2 != 38) {
            this.c(false);
         }

         this.E[this.p++] = (byte)var1;
         this.E[this.p++] = (byte)(var1 >> -678861656);
         ub++;
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "lh.P(" + var1 + ',' + var2 + ')');
      }
   }

   final int c(boolean var1) {
      try {
         this.p += 3;
         if (var1) {
            cb = true;
         }

         sb++;
         return ((this.E[this.p + -2] & 0xFF) << 798639568) + ((this.E[this.p + -3] << -1935278584 & 0xFF00) - -(this.E[this.p - 1] & 0xFF));
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "lh.RA(" + var1 + 41);
      }
   }

   final void d(int var1, int var2) {
      try {
         if (var1 != -772724656) {
            this.j(5, 109);
         }

         vb++;
         this.E[this.p++] = (byte)(var2 + 128);
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "lh.HB(" + var1 + ',' + var2 + ')');
      }
   }

   final int d(boolean var1) {
      try {
         G++;
         this.p += 4;
         if (var1) {
            mb = null;
         }

         return ((this.E[-3 + this.p] & 0xFF) << 357099128)
            - -((this.E[-4 + this.p] & 0xFF) << -772724656)
            + (((0xFF & this.E[this.p + -1]) << -63088472) - -(this.E[this.p - 2] & 0xFF));
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "lh.EA(" + var1 + 41);
      }
   }

   final void a(boolean var1, BigInteger var2, BigInteger var3) {
      try {
         nb++;
         int var4 = this.p;
         byte[] var5 = new byte[var4];
         this.p = 0;
         this.a(0, 0, var4, var5);
         BigInteger var6 = new BigInteger(var5);
         if (var1) {
            mb = null;
         }

         BigInteger var7 = var6.modPow(var2, var3);
         byte[] var8 = var7.toByteArray();
         this.p = 0;
         this.b(32, var8.length);
         this.a(var8.length, (byte)118, 0, var8);
      } catch (RuntimeException var9) {
         throw Class_sh.a(var9, "lh.UA(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + (var3 != null ? "{...}" : "null") + ')');
      }
   }

   static final void a(int var0, Class_cj var1) {
      try {
         Class_rj.G = var1;
         if (var0 > -73) {
            f(true);
         }

         S++;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "lh.FB(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   final void e(int var1, int var2) {
      try {
         ib++;
         if (var2 >= 118) {
            this.E[-1 + (this.p - var1)] = (byte)var1;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "lh.LA(" + var1 + ',' + var2 + ')');
      }
   }

   final void f(int var1, int var2) {
      try {
         X++;
         if (var2 != 9684) {
            this.a((byte)121, 105);
         }

         if ((var1 & -128) != 0) {
            if ((var1 & -16384) != 0) {
               if ((-2097152 & var1) != 0) {
                  if (~(var1 & -268435456) != -1) {
                     this.b(32, var1 >>> 1990185980 | 128);
                  }

                  this.b(32, var1 >>> 1886938837 | 128);
               }

               this.b(var2 + -9652, (var1 | 2103292) >>> 744113902);
            }

            this.b(32, var1 >>> -2144201945 | 128);
         }

         this.b(var2 + -9652, var1 & 127);
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "lh.E(" + var1 + ',' + var2 + ')');
      }
   }

   final int e(boolean var1) {
      try {
         lb++;
         short var2 = 0;
         int var3 = this.f(255);
         if (!var1) {
            return -6;
         } else {
            while (var3 == 32767) {
               var2 += 32767;
               var3 = this.f(255);
            }

            return var2 + var3;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "lh.JA(" + var1 + 41);
      }
   }

   final void a(int var1, int var2, int var3, byte[] var4) {
      try {
         U++;

         for (int var5 = var1; var5 < var1 + var3; var5++) {
            var4[var5] = this.E[this.p++];
         }

         if (var2 != 0) {
            this.a((byte)-5, 85);
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "lh.AA(" + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ')');
      }
   }

   final void g(int var1, int var2) {
      try {
         if (var1 != 544537784) {
            mb = null;
         }

         this.E[this.p++] = (byte)(var2 >> 544537784);
         I++;
         this.E[this.p++] = (byte)(var2 >> 322362640);
         this.E[this.p++] = (byte)(var2 >> 680567848);
         this.E[this.p++] = (byte)var2;
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "lh.K(" + var1 + ',' + var2 + ')');
      }
   }

   final int c(byte var1) {
      try {
         A++;
         this.p += 4;
         return var1 < 87
            ? 41
            : (this.E[this.p - 1] << 269458744 & 0xFF000000)
               + ((this.E[this.p - 2] << -1234080752 & 0xFF0000) - (-(this.E[this.p - 3] << -1038016920 & 0xFF00) + -(this.E[this.p + -4] & 0xFF)));
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "lh.OA(" + var1 + 41);
      }
   }

   final long j(int var1) {
      try {
         hb++;
         if (var1 < 27) {
            yb = null;
         }

         long var2 = 4294967295L & this.h(-5528);
         long var4 = this.h(-5528) & 4294967295L;
         return var4 + (var2 << -2097004448);
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "lh.AB(" + var1 + ')');
      }
   }

   final void a(int var1, byte var2, int var3, byte[] var4) {
      try {
         gb++;
         if (var2 != 118) {
            cb = true;
         }

         for (int var5 = var3; var3 + var1 > var5; var5++) {
            this.E[this.p++] = var4[var5];
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "lh.SA(" + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ')');
      }
   }

   static final void b(boolean var0, int var1) {
      int var3 = client.lb;

      try {
         label30: {
            if (var1 != 37) {
               if (~var1 != -51) {
                  if (var1 != 75) {
                     Class_pi.qb = 8.0F;
                     if (var3 == 0) {
                        break label30;
                     }
                  }

                  Class_pi.qb = 6.0F;
                  if (var3 == 0) {
                     break label30;
                  }
               }

               Class_pi.qb = 4.0F;
               if (var3 == 0) {
                  break label30;
               }
            }

            Class_pi.qb = 3.0F;
         }

         if (!var0) {
            Class_qd.C = -1;
            Class_qd.C = -1;
            D++;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "lh.CA(" + var0 + ',' + var1 + ')');
      }
   }

   final void h(int var1, int var2) {
      try {
         this.E[this.p++] = (byte)(var1 >> -1905447096);
         fb++;
         if (var2 < -20) {
            this.E[this.p++] = (byte)(var1 - -128);
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "lh.I(" + var1 + ',' + var2 + ')');
      }
   }

   final int d(byte var1) {
      try {
         if (var1 > -48) {
            yb = null;
         }

         Z++;
         return 0xFF & -128 + this.E[this.p++];
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "lh.CB(" + var1 + 41);
      }
   }

   final void a(int[] var1, int var2, int var3, byte var4) {
      try {
         t++;
         int var6 = (var3 - var2) / 8;
         int var5 = this.p;
         if (var4 <= 76) {
            this.q(108);
         }

         this.p = var2;

         for (int var7 = 0; var7 < var6; var7++) {
            int var8 = this.h(-5528);
            int var9 = this.h(-5528);
            int var10 = -957401312;
            int var11 = -1640531527;
            int var12 = 32;

            while (~(var12--) < -1) {
               var9 -= (var8 >>> -1563092443 ^ var8 << 611091524) - -var8 ^ var10 + var1[var10 >>> -1002502837 & 1455423491];
               var10 -= var11;
               var8 -= (var9 >>> 1337206757 ^ var9 << 363118692) - -var9 ^ var10 + var1[var10 & 3];
            }

            this.p -= 8;
            this.g(544537784, var8);
            this.g(544537784, var9);
         }

         this.p = var5;
      } catch (RuntimeException var13) {
         throw Class_sh.a(var13, "lh.TA(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + var4 + ')');
      }
   }

   final int k(int var1) {
      try {
         if (var1 != 1355769544) {
            mb = null;
         }

         this.p += 2;
         V++;
         return ((this.E[this.p - 2] & 0xFF) << 1355769544) - -(this.E[this.p - 1] & 0xFF);
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "lh.R(" + var1 + 41);
      }
   }

   final Class_r l(int var1) {
      try {
         if (var1 != 23733) {
            return null;
         } else {
            x++;
            if (this.E[this.p] == 0) {
               this.p++;
               return null;
            } else {
               return this.e(var1 ^ 23754);
            }
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "lh.J(" + var1 + ')');
      }
   }

   final int m(int var1) {
      try {
         tb++;
         if (var1 < 48) {
            this.l(-65, -64);
         }

         return -this.E[this.p++] + 128 & 0xFF;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "lh.HA(" + var1 + 41);
      }
   }

   final int n(int var1) {
      try {
         if (var1 != -6677) {
            yb = null;
         }

         H++;
         return 0xFF & this.E[this.p++];
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "lh.V(" + var1 + 41);
      }
   }

   final void i(int var1, int var2) {
      try {
         if (var2 < -94) {
            rb++;
            this.E[-var1 + (this.p - 4)] = (byte)(var1 >> 759933560);
            this.E[-3 + this.p - var1] = (byte)(var1 >> 520407888);
            this.E[-2 + this.p + -var1] = (byte)(var1 >> -1078182744);
            this.E[-var1 + (this.p - 1)] = (byte)var1;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "lh.DA(" + var1 + ',' + var2 + ')');
      }
   }

   final void a(BigInteger var1, byte var2, BigInteger var3) {
      try {
         q++;
         int var4 = this.n(-6677);
         byte[] var5 = new byte[var4];
         this.a(0, 0, var4, var5);
         BigInteger var6 = new BigInteger(var5);
         BigInteger var7 = var6.modPow(var1, var3);
         if (var2 != -88) {
            Ab = null;
         }

         byte[] var8 = var7.toByteArray();
         this.p = 0;
         this.a(var8.length, (byte)118, 0, var8);
      } catch (RuntimeException var9) {
         throw Class_sh.a(var9, "lh.N(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
      }
   }

   final void j(int var1, int var2) {
      try {
         pb++;
         if (var1 != 17557) {
            this.i(-50, -42);
         }

         this.E[this.p++] = (byte)(-var2 + 128);
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "lh.GB(" + var1 + ',' + var2 + ')');
      }
   }

   final void k(int var1, int var2) {
      try {
         this.E[this.p++] = (byte)(var2 >> -925760816);
         ab++;
         this.E[this.p++] = (byte)(var2 >> 1324535448);
         this.E[this.p++] = (byte)var2;
         if (var1 == -19237) {
            this.E[this.p++] = (byte)(var2 >> -4948312);
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "lh.M(" + var1 + ',' + var2 + ')');
      }
   }

   final byte o(int var1) {
      try {
         qb++;
         if (var1 != 3390) {
            this.p = 52;
         }

         return this.E[this.p++];
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "lh.QA(" + var1 + ')');
      }
   }

   final void l(int var1, int var2) {
      try {
         v++;
         if (var2 >= ~var1 && ~var1 > -129) {
            this.b(32, var1);
         } else if (var1 >= 0 && ~var1 > -32769) {
            this.a(false, var1 + 32768);
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "lh.C(" + var1 + ',' + var2 + ')');
      }
   }

   final int p(int var1) {
      try {
         B++;
         if (var1 != -22489) {
            return -87;
         } else {
            this.p += 2;
            int var2 = (255 & this.E[-1 + this.p]) + (0xFF00 & this.E[-2 + this.p] << -1713538328);
            if (var2 > 32767) {
               var2 -= 65536;
            }

            return var2;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "lh.B(" + var1 + 41);
      }
   }

   final void c(byte var1, int var2) {
      try {
         bb++;
         this.E[this.p++] = (byte)(128 + var2);
         this.E[this.p++] = (byte)(var2 >> -1544045528);
         if (var1 != 19) {
            this.e(true);
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "lh.NA(" + var1 + ',' + var2 + ')');
      }
   }

   final void d(byte var1, int var2) {
      try {
         w++;
         if (var1 < 126) {
            mb = null;
         }

         this.E[this.p++] = (byte)var2;
         this.E[this.p++] = (byte)(var2 >> 1279827400);
         this.E[this.p++] = (byte)(var2 >> -882770384);
         this.E[this.p++] = (byte)(var2 >> 1432242680);
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "lh.W(" + var1 + ',' + var2 + ')');
      }
   }

   final int q(int var1) {
      try {
         if (var1 != 32767) {
            return 90;
         } else {
            int var2 = this.E[this.p] & 255;
            C++;
            return ~var2 > -129 ? this.n(-6677) - 64 : -49152 + this.k(1355769544);
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "lh.T(" + var1 + 41);
      }
   }

   final int r(int var1) {
      try {
         int var2 = 38 % ((81 - var1) / 36);
         ob++;
         return -this.E[this.p++] & 0xFF;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "lh.JB(" + var1 + 41);
      }
   }

   public static void f(boolean var0) {
      try {
         xb = null;
         yb = null;
         Cb = null;
         Bb = null;
         Ab = null;
         mb = null;
         if (var0) {
            f(true);
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "lh.BA(" + var0 + ')');
      }
   }

   final int e(byte var1) {
      try {
         Y++;
         this.p += 2;
         return var1 != -47 ? -45 : ((this.E[-1 + this.p] & 0xFF) << 494543592) + (0xFF & -128 + this.E[-2 + this.p]);
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "lh.BB(" + var1 + 41);
      }
   }
}
