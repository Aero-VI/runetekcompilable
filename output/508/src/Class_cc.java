final class Class_cc extends Class_lh {
   static int[] Db = new int[2048];
   static int Eb;
   static int Fb;
   static int Gb;
   static int Hb;
   static int Ib;
   private Class_ng Jb;
   static Class_ne[] Kb = new Class_ne[4];
   static Class_qc Lb = new Class_qc(64);
   static int Mb;
   static Class_r Nb = Class_tc.a(43, "Ladevorgang )2 bitte warten Sie)3");
   static Class_r Ob = Class_tc.a(43, "<col=ffff00>");
   static int Pb;
   static int Qb;
   static int Rb;
   static int Sb;
   private int Tb;
   static boolean Ub = false;
   static int Vb;
   static int Wb;
   static int Xb;
   static int Yb;
   static int[] Zb = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
   static Class_sg ac;
   static Class_r bc = Class_tc.a(43, "sl_arrows");

   final void a(int[] var1, int var2) {
      try {
         if (var2 != 3426) {
            Nb = null;
         }

         this.Jb = new Class_ng(var1);
         Sb++;
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "cc.RB(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
      }
   }

   final void s(int var1) {
      try {
         int var2 = 2 % ((var1 - 58) / 51);
         this.Tb = 8 * super.p;
         Fb++;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "cc.PB(" + var1 + ')');
      }
   }

   final void f(byte var1) {
      try {
         if (var1 != -59) {
            Db = null;
         }

         super.p = (7 + this.Tb) / 8;
         Rb++;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "cc.CC(" + var1 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int e(byte var1, int var2) {
      int var6 = client.lb;

      try {
         Xb++;
         int var3 = this.Tb >> -611460541;
         if (var1 != 0) {
            Ub = true;
         }

         int var4 = 8 - (this.Tb & 7);
         this.Tb += var2;
         int var5 = 0;
         if (var6 != 0) {
            var5 += (super.E[var3++] & Class_pj.i[var4]) << var2 - var4;
            var2 -= var4;
            var4 = 8;
         }

         while (~var4 > ~var2) {
            var5 += (super.E[var3++] & Class_pj.i[var4]) << var2 - var4;
            var2 -= var4;
            var4 = 8;
         }

         if (~var2 != ~var4) {
            var5 += super.E[var3] >> var4 - var2 & Class_pj.i[var2];
            if (var6 == 0) {
               return var5;
            }
         }

         var5 += Class_pj.i[var4] & super.E[var3];
         return var5;
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "cc.UB(" + var1 + 44 + var2 + 41);
      }
   }

   static final int m(int var0, int var1) {
      try {
         Pb++;
         if (~var0 == -16711936) {
            return -1;
         } else {
            return var1 != -16844 ? -120 : Class_mg.a(var0, -82);
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "cc.VB(" + var0 + 44 + var1 + 41);
      }
   }

   Class_cc(int var1) {
      super(var1);
   }

   static final void a(Class_r var0, int var1, int var2) {
      try {
         Hb++;
         Class_fj.c++;
         Class_cj.S.o(-51, 111);
         if (var1 == -32443) {
            Class_cj.S.b(32, var2);
            Class_cj.S.a(128, var0.f(10908));
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "cc.EC(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ')');
      }
   }

   final int n(int var1, int var2) {
      try {
         Gb++;
         return var2 > -71 ? 1 : 8 * var1 - this.Tb;
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "cc.QB(" + var1 + 44 + var2 + 41);
      }
   }

   static final void t(int var0) {
      try {
         Class_nb.a(103);
         Class_cb.b(-93);
         Class_se.d((byte)-103);
         Class_jg.a((byte)-88);
         Class_vg.a((byte)-108);
         Class_b.b((byte)-96);
         Class_hk.f(125);
         Class_rj.a(true);
         Class_rg.d((byte)-115);
         Vb++;
         Class_lj.a((byte)78);
         Class_h.a((byte)-59);
         Class_kk.b(-27434);
         Class_db.d((byte)-88);
         Class_nd.b(-10705);
         ((Class_pa)Class_kd.i).a((byte)-95);
         Class_j.Y.b((byte)-11);
         Class_dd.Eb.f(0);
         Class_jf.k.f(0);
         Class_ma.jb.f(var0 ^ var0);
         Class_nb.b.f(var0 ^ 137);
         Class_pc.a.f(0);
         Class_cj.L.f(0);
         Class_ui.d.f(0);
         Class_id.s.f(0);
         Class_oa.b.f(0);
         Class_cj.Y.f(0);
         Class_bh.i.f(0);
         Class_si.d.b((byte)94);
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "cc.AC(" + var0 + ')');
      }
   }

   final int u(int var1) {
      try {
         Ib++;
         if (var1 != 255) {
            this.s(21);
         }

         return super.E[super.p++] + -this.Jb.b((byte)-55) & 0xFF;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "cc.DC(" + var1 + 41);
      }
   }

   final void o(int var1, int var2) {
      try {
         Mb++;
         super.E[super.p++] = (byte)(var2 + this.Jb.b((byte)-23));
         int var3 = -68 / ((var1 - 1) / 52);
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "cc.BC(" + var1 + ',' + var2 + ')');
      }
   }

   public static void g(boolean var0) {
      try {
         Lb = null;
         Ob = null;
         Kb = null;
         if (var0) {
            g(true);
         }

         Nb = null;
         bc = null;
         ac = null;
         Zb = null;
         Db = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "cc.SB(" + var0 + ')');
      }
   }

   static final Class_uf a(int var0, int var1, int var2) {
      try {
         Qb++;

         for (Class_uf var3 = (Class_uf)Class_ff.a.e((byte)76); var3 != null; var3 = (Class_uf)Class_ff.a.c((byte)-110)) {
            if (var3.P && var3.a(67, var1, var0)) {
               return var3;
            }
         }

         if (var2 != 111) {
            Kb = null;
         }

         return null;
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "cc.TB(" + var0 + ',' + var1 + ',' + var2 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final void a(byte[] var1, int var2, int var3, boolean var4) {
      int var6 = client.lb;

      try {
         int var5 = 0;
         if (var6 == 0 && var5 >= var2) {
            Yb++;
            if (var4) {
               ac = null;
            }
         } else {
            do {
               var1[var5 + var3] = (byte)(super.E[super.p++] + -this.Jb.b((byte)64));
            } while (++var5 < var2);

            Yb++;
            if (var4) {
               ac = null;
            }
         }
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "cc.WB(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + var4 + ')');
      }
   }
}
