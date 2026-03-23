import java.io.IOException;

final class Class_bi {
   static Class_r a = Class_tc.a(43, "Art");
   static int b;
   static int c;
   private Class_cj d;
   static int e = 0;
   static Class_sg f;
   private Class_tg g = new Class_tg(256);
   private Class_cj h;
   static int i;
   static int j;
   static int k;
   static int l;
   static int[] m;
   static int n;
   static int o;
   static int p;
   static int q;
   static Class_oa r;
   private Class_tg s = new Class_tg(256);
   static Class_r t = Class_tc.a(43, "Benutzen");

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final boolean a(int var0) {
      int var4 = client.lb;

      try {
         k++;

         try {
            if (var0 >= -98) {
               b = 39;
            }

            return Class_tb.b(-26354);
         } catch (IOException var5) {
            Class_ak.b((byte)-21);
            return true;
         } catch (Exception var6) {
            String var2 = "T2 - "
               + Class_hf.a
               + ","
               + Class_fe.T
               + ","
               + Class_fh.I
               + " - "
               + Class_sf.g
               + ","
               + (Class_gg.B.v[0] + Class_fj.e)
               + ","
               + (Class_gg.B.qb[0] + Class_va.ab)
               + " - ";
            int var3 = 0;
            if (var4 != 0 || ~Class_sf.g < ~var3 && ~var3 > -51) {
               do {
                  var2 = var2 + Class_f.T.E[var3] + ",";
                  var3++;
               } while (~Class_sf.g < ~var3 && ~var3 > -51);
            }

            Class_mc.a(var2, var6, 38);
            Class_be.a((byte)-109);
            return true;
         }
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "bi.H(" + var0 + ')');
      }
   }

   final Class_k a(int var1, int[] var2, int var3) {
      try {
         n++;
         if (this.h.c(0) == 1) {
            return this.a(0, var2, var3, (byte)91);
         } else if (~this.h.e(var3, var1 + var1) == -2) {
            return this.a(var3, var2, 0, (byte)112);
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "bi.F(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
      }
   }

   static final Class_kj a(boolean var0, int var1) {
      try {
         if (!var0) {
            m = null;
         }

         Class_kj var2 = (Class_kj)Class_fa.dc.a((long)var1, (byte)-76);
         q++;
         if (var2 != null) {
            return var2;
         } else {
            byte[] var3;
            label27: {
               if (~var1 > -32769) {
                  var3 = Class_gj.eb.a(var1, 0, 0);
                  if (client.lb == 0) {
                     break label27;
                  }
               }

               var3 = Class_de.d.a(32767 & var1, 0, 0);
            }

            var2 = new Class_kj();
            if (var3 != null) {
               var2.a(new Class_lh(var3), var0);
            }

            if (var1 >= 32768) {
               var2.c((byte)-67);
            }

            Class_fa.dc.a(var1, (byte)-126, var2);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "bi.B(" + var0 + ',' + var1 + ')');
      }
   }

   private final Class_k a(byte var1, int var2, int var3, int[] var4) {
      try {
         if (var1 != -113) {
            a = null;
         }

         p++;
         int var5 = var3 ^ (var2 >>> 1030641644 | var2 << -1517522620 & 65532);
         var5 |= var2 << -637707920;
         long var6 = var5 ^ 4294967296L;
         Class_k var8 = (Class_k)this.s.a(var6, -80);
         if (var8 != null) {
            return var8;
         } else if (var4 != null && var4[0] <= 0) {
            return null;
         } else {
            Class_q var9 = (Class_q)this.g.a(var6, 82);
            if (var9 == null) {
               var9 = Class_q.a(this.d, var2, var3);
               if (var9 == null) {
                  return null;
               }

               this.g.a((byte)123, var9, var6);
            }

            var8 = var9.a(var4);
            if (var8 == null) {
               return null;
            } else {
               var9.c(-17554);
               this.s.a((byte)122, var8, var6);
               return var8;
            }
         }
      } catch (RuntimeException var10) {
         throw Class_sh.a(var10, "bi.A(" + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ')');
      }
   }

   public static void a(boolean var0) {
      try {
         m = null;
         a = null;
         f = null;
         if (!var0) {
            t = null;
            r = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "bi.D(" + var0 + ')');
      }
   }

   final Class_k a(int var1, byte var2, int[] var3) {
      try {
         o++;
         if (this.d.c(0) == 1) {
            return this.a((byte)-113, 0, var1, var3);
         } else if (~this.d.e(var1, 0) == -2) {
            return this.a((byte)-113, var1, 0, var3);
         } else {
            if (var2 <= 5) {
               j = -21;
            }

            throw new RuntimeException();
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "bi.E(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
      }
   }

   static final void a(boolean var0, Class_cj var1, Class_cj var2, byte var3, Class_qf var4) {
      try {
         Class_vg.C = var1;
         Class_od.b = var2;
         c++;
         Class_c.t = var0;
         if (var3 <= 26) {
            r = null;
         }

         int var5 = -1 + Class_od.b.c(0);
         j = var5 * 256 + Class_od.b.e(var5, 0);
         Class_cb.d = var4;
      } catch (RuntimeException var6) {
         throw Class_sh.a(
            var6,
            "bi.C("
               + var0
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

   private final Class_k a(int var1, int[] var2, int var3, byte var4) {
      try {
         l++;
         int var5 = (var1 >>> 1727410956 | var1 << -759980412 & 65533) ^ var3;
         var5 |= var1 << 1741927728;
         long var6 = var5;
         Class_k var8 = (Class_k)this.s.a(var6, -40);
         if (var8 != null) {
            return var8;
         } else if (var2 != null && var2[0] <= 0) {
            return null;
         } else {
            Class_hb var9 = Class_hb.a(this.h, var1, var3);
            if (var9 == null) {
               return null;
            } else {
               int var10 = 46 / (-var4 / 36);
               var8 = var9.a();
               this.s.a((byte)-126, var8, var6);
               if (var2 != null) {
                  var2[0] -= var8.s.length;
               }

               return var8;
            }
         }
      } catch (RuntimeException var11) {
         throw Class_sh.a(var11, "bi.G(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + var4 + ')');
      }
   }

   Class_bi(Class_cj var1, Class_cj var2) {
      try {
         this.d = var2;
         this.h = var1;
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "bi.<init>(" + (var1 != null ? "{...}" : "null") + ',' + (var2 != null ? "{...}" : "null") + ')');
      }
   }
}
