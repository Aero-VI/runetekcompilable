final class Class_wj extends Class_li {
   static int p;
   int q;
   private static Class_r r = Class_tc.a(43, "");
   int s;
   static int t = 0;
   Class_r u;
   static Class_r v = r;
   static int w;
   Object[] x;
   static int y;
   Class_ha z;
   int B;
   int C;
   boolean D;
   static int E = 0;
   Class_ha F;
   static int G;
   int H;
   static int I;
   static Class_r[] K;
   static int L;

   static final Class_ni a(int var0, Class_cj var1, int var2) {
      try {
         I++;
         if (var2 < 53) {
            K = null;
         }

         return !Class_jd.a(var1, -1, var0) ? null : Class_wa.a((byte)-83);
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "wj.G(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
      }
   }

   static final void d(int var0) {
      try {
         G++;
         int var1 = Class_hf.h;
         int var2 = Class_ih.S;
         int var4 = Class_fb.n;
         int var3 = Class_ii.ab;
         int var5 = 6116423;
         Class_nc.f(var1, var2, var3, var4, var5);
         Class_nc.f(1 + var1, 1 + var2, -2 + var3, 16, 0);
         Class_nc.a(var1 - -1, 18 + var2, -2 + var3, var4 + -19, 0);
         Class_db.sb.b(Class_ka.kb, var1 + 3, var2 - -14, var5, -1);
         int var6 = Class_pj.c;
         int var7 = Class_bh.k;
         int var8 = 0;
         if (var0 == 4) {
            while (~var8 > ~Class_ma.ib) {
               int var9 = (-1 + Class_ma.ib + -var8) * 15 + 31 + var2;
               int var10 = 16777215;
               if (~var6 < ~var1 && var3 + var1 > var6 && ~var7 < ~(-13 + var9) && var7 < var9 + 3) {
                  var10 = 16776960;
               }

               Class_db.sb.b(Class_jf.a((byte)-103, var8), 3 + var1, var9, var10, 0);
               var8++;
            }

            Class_bh.a(-97, Class_ii.ab, Class_fb.n, Class_hf.h, Class_ih.S);
         }
      } catch (RuntimeException var11) {
         throw Class_sh.a(var11, "wj.E(" + var0 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Irreducible bytecode has more than 5 nodes in sequence and was not entirely decomposed
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static final void a(byte var0) {
      int var10 = client.lb;

      try {
         y++;
         if (var0 > -99) {
            a(93, null);
         }

         int var1 = 0;
         if (var10 == 0 && ~var1 <= ~Class_fc.v) {
            if (Class_vf.i && !Class_tb.a(20778)) {
               if (~Class_oj.Y != -1 && ~Class_rc.i != 0) {
                  Class_vi.a(Class_rc.i, Class_cj.L, false, 0, Class_oj.Y, false);
               }

               Class_vf.i = false;
            } else if (~Class_oj.Y != -1 && Class_rc.i != -1 && !Class_tb.a(20778)) {
               Class_cj.S.o(-64, 247);
               Class_mb.f++;
               Class_cj.S.g(544537784, Class_rc.i);
               Class_rc.i = -1;
            }
         } else {
            do {
               Class_fd.f[var1]--;
               if (Class_fd.f[var1] < -10) {
                  Class_fc.v--;
                  int var2 = var1;
                  if (var10 != 0) {
                     Class_nj.s[var1] = Class_nj.s[var1 - -1];
                     Class_ad.h[var1] = Class_ad.h[var1 + 1];
                     Class_tb.p[var1] = Class_tb.p[1 + var1];
                     Class_fd.f[var1] = Class_fd.f[1 + var1];
                     Class_rf.l[var1] = Class_rf.l[1 + var1];
                     var2 = var1 + 1;
                  }

                  while (~var2 > ~Class_fc.v) {
                     Class_nj.s[var2] = Class_nj.s[var2 - -1];
                     Class_ad.h[var2] = Class_ad.h[var2 + 1];
                     Class_tb.p[var2] = Class_tb.p[1 + var2];
                     Class_fd.f[var2] = Class_fd.f[1 + var2];
                     Class_rf.l[var2] = Class_rf.l[1 + var2];
                     var2++;
                  }

                  var1--;
                  if (var10 == 0) {
                     var1++;
                     continue;
                  }
               }

               Class_hb var12 = Class_ad.h[var1];
               if (var12 == null) {
                  var12 = Class_hb.a(Class_nb.b, Class_nj.s[var1], 0);
                  if (var12 == null) {
                     var1++;
                     continue;
                  }

                  Class_fd.f[var1] = Class_fd.f[var1] + var12.b();
                  Class_ad.h[var1] = var12;
               }

               if (Class_fd.f[var1] < 0) {
                  if (Class_rf.l[var1] == 0) {
                     int var3 = Class_sf.d;
                     if (var10 != 0) {
                        int var5 = Class_rf.l[var1] >> -1590293168 & 0xFF;
                        int var7 = (Class_rf.l[var1] & 65318) >> -783890328;
                        int var6 = -Class_gg.B.hb + var5 * 128 + 64;
                        int var4 = (0xFF & Class_rf.l[var1]) * 128;
                        int var8;
                        if (var6 < 0) {
                           var6 = -var6;
                           var8 = 64 + var7 * 128 + -Class_gg.B.J;
                           if (~var8 > -1) {
                              var8 = -var8;
                           }
                        } else {
                           var8 = 64 + var7 * 128 + -Class_gg.B.J;
                           if (~var8 > -1) {
                              var8 = -var8;
                           }
                        }

                        int var9 = -128 + (var6 - -var8);
                        if (~var4 > ~var9) {
                           Class_fd.f[var1] = -100;
                           if (var10 != 0) {
                              if (~var9 > -1) {
                                 var9 = 0;
                              }

                              var3 = (-var9 + var4) * Class_tf.V / var4;
                              if (~var3 < -1) {
                                 Class_k var17 = var12.a().a(Class_pe.p);
                                 Class_rb var23 = Class_rb.a(var17, 100, var3);
                                 var23.e(Class_tb.p[var1] + -1);
                                 Class_nd.m.b(var23);
                              }

                              Class_fd.f[var1] = -100;
                              var1++;
                           } else {
                              var1++;
                           }
                        } else {
                           if (~var9 > -1) {
                              var9 = 0;
                           }

                           var3 = (-var9 + var4) * Class_tf.V / var4;
                           if (~var3 < -1) {
                              Class_k var18 = var12.a().a(Class_pe.p);
                              Class_rb var24 = Class_rb.a(var18, 100, var3);
                              var24.e(Class_tb.p[var1] + -1);
                              Class_nd.m.b(var24);
                           }

                           Class_fd.f[var1] = -100;
                           var1++;
                        }
                     } else {
                        if (~var3 < -1) {
                           Class_k var19 = var12.a().a(Class_pe.p);
                           Class_rb var25 = Class_rb.a(var19, 100, var3);
                           var25.e(Class_tb.p[var1] + -1);
                           Class_nd.m.b(var25);
                        }

                        Class_fd.f[var1] = -100;
                        var1++;
                     }
                  } else {
                     int var26 = Class_rf.l[var1] >> -1590293168 & 0xFF;
                     int var30 = (Class_rf.l[var1] & 65318) >> -783890328;
                     int var29 = -Class_gg.B.hb + var26 * 128 + 64;
                     int var20 = (0xFF & Class_rf.l[var1]) * 128;
                     int var31;
                     if (var29 < 0) {
                        var29 = -var29;
                        var31 = 64 + var30 * 128 + -Class_gg.B.J;
                        if (~var31 > -1) {
                           var31 = -var31;
                        }
                     } else {
                        var31 = 64 + var30 * 128 + -Class_gg.B.J;
                        if (~var31 > -1) {
                           var31 = -var31;
                        }
                     }

                     int var32 = -128 + (var29 - -var31);
                     if (~var20 > ~var32) {
                        Class_fd.f[var1] = -100;
                        if (var10 != 0) {
                           if (~var32 > -1) {
                              var32 = 0;
                           }

                           int var15 = (-var32 + var20) * Class_tf.V / var20;
                           if (~var15 < -1) {
                              Class_k var21 = var12.a().a(Class_pe.p);
                              Class_rb var27 = Class_rb.a(var21, 100, var15);
                              var27.e(Class_tb.p[var1] + -1);
                              Class_nd.m.b(var27);
                           }

                           Class_fd.f[var1] = -100;
                           var1++;
                        } else {
                           var1++;
                        }
                     } else {
                        if (~var32 > -1) {
                           var32 = 0;
                        }

                        int var16 = (-var32 + var20) * Class_tf.V / var20;
                        if (~var16 < -1) {
                           Class_k var22 = var12.a().a(Class_pe.p);
                           Class_rb var28 = Class_rb.a(var22, 100, var16);
                           var28.e(Class_tb.p[var1] + -1);
                           Class_nd.m.b(var28);
                        }

                        Class_fd.f[var1] = -100;
                        var1++;
                     }
                  }
               } else {
                  var1++;
               }
            } while (~var1 > ~Class_fc.v);

            if (Class_vf.i && !Class_tb.a(20778)) {
               if (~Class_oj.Y != -1 && ~Class_rc.i != 0) {
                  Class_vi.a(Class_rc.i, Class_cj.L, false, 0, Class_oj.Y, false);
               }

               Class_vf.i = false;
            } else if (~Class_oj.Y != -1 && Class_rc.i != -1 && !Class_tb.a(20778)) {
               Class_cj.S.o(-64, 247);
               Class_mb.f++;
               Class_cj.S.g(544537784, Class_rc.i);
               Class_rc.i = -1;
            }
         }
      } catch (RuntimeException var11) {
         throw Class_sh.a(var11, "wj.D(" + var0 + ')');
      }
   }

   static final Class_r a(int var0, long var1, int var3, boolean var4) {
      try {
         w++;
         if (var0 >= 2 && var0 <= 36) {
            int var5 = 1;

            for (long var6 = var1 / var0; ~var6 != -1L; var5++) {
               var6 /= var0;
            }

            int var8 = var5;
            if (var1 < 0L || var4) {
               var8 = var5 + 1;
            }

            byte[] var9 = new byte[var8];
            if (var1 < 0L) {
               var9[0] = 45;
            } else if (var4) {
               var9[0] = 43;
            }

            if (var3 < 18) {
               e(36);
            }

            for (int var10 = 0; ~var5 < ~var10; var10++) {
               int var11 = (int)(var1 % var0);
               if (~var11 > -1) {
                  var11 = -var11;
               }

               if (var11 > 9) {
                  var11 += 39;
               }

               var9[-1 + -var10 + var8] = (byte)(var11 + 48);
               var1 /= var0;
            }

            Class_r var13 = new Class_r();
            var13.G = var8;
            var13.h = var9;
            return var13;
         } else {
            throw new IllegalArgumentException("Invalid radix:" + var0);
         }
      } catch (RuntimeException var12) {
         throw Class_sh.a(var12, "wj.C(" + var0 + ',' + var1 + ',' + var3 + ',' + var4 + ')');
      }
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      try {
         p++;
         int var9 = var8 + -var4;
         int var11 = (-var3 + var5 << 1948975632) / var9;
         if (var6 == 1391070128) {
            int var10 = var2 - var1;
            int var12 = (-var0 + var7 << 1391070128) / var10;
            Class_ta.a(var11, var12, var8, true, 0, 0, var2, var0, var1, var3, var4);
         }
      } catch (RuntimeException var13) {
         throw Class_sh.a(var13, "wj.F(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ')');
      }
   }

   public static void e(int var0) {
      try {
         v = null;
         r = null;
         if (var0 > -88) {
            d(-124);
         }

         K = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "wj.A(" + var0 + ')');
      }
   }

   static final void a(int param0, Class_lh param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic client.lb I
      // 003: istore 17
      // 005: getstatic Class_wj.L I
      // 008: bipush 1
      // 009: iadd
      // 00a: putstatic Class_wj.L I
      // 00d: iload 17
      // 00f: ifeq 2ee
      // 012: bipush 0
      // 013: istore 5
      // 015: bipush 0
      // 016: istore 4
      // 018: bipush 0
      // 019: istore 6
      // 01b: aload 1
      // 01c: iload 0
      // 01d: sipush -8237
      // 020: ixor
      // 021: invokevirtual Class_lh.n (I)I
      // 024: bipush -1
      // 025: ixor
      // 026: bipush -2
      // 028: if_icmpne 042
      // 02b: aload 1
      // 02c: sipush -6677
      // 02f: invokevirtual Class_lh.n (I)I
      // 032: istore 5
      // 034: aload 1
      // 035: iload 0
      // 036: sipush -8237
      // 039: ixor
      // 03a: invokevirtual Class_lh.n (I)I
      // 03d: istore 6
      // 03f: bipush 1
      // 040: istore 4
      // 042: aload 1
      // 043: iload 0
      // 044: sipush -8237
      // 047: ixor
      // 048: invokevirtual Class_lh.n (I)I
      // 04b: istore 7
      // 04d: aload 1
      // 04e: iload 0
      // 04f: sipush -8237
      // 052: ixor
      // 053: invokevirtual Class_lh.n (I)I
      // 056: istore 8
      // 058: getstatic Class_sb.j I
      // 05b: bipush 1
      // 05c: iload 8
      // 05e: bipush 64
      // 060: imul
      // 061: ineg
      // 062: getstatic Class_aa.v I
      // 065: ineg
      // 066: isub
      // 067: isub
      // 068: isub
      // 069: istore 10
      // 06b: bipush 64
      // 06d: iload 7
      // 06f: imul
      // 070: getstatic Class_mb.k I
      // 073: ineg
      // 074: iadd
      // 075: istore 9
      // 077: iload 9
      // 079: iflt 0a2
      // 07c: bipush -63
      // 07e: iload 10
      // 080: iadd
      // 081: bipush -1
      // 082: ixor
      // 083: bipush -1
      // 084: if_icmpgt 0a2
      // 087: bipush 63
      // 089: iload 9
      // 08b: iadd
      // 08c: bipush -1
      // 08d: ixor
      // 08e: getstatic Class_fi.z I
      // 091: bipush -1
      // 092: ixor
      // 093: if_icmple 0a2
      // 096: getstatic Class_sb.j I
      // 099: bipush -1
      // 09a: ixor
      // 09b: iload 10
      // 09d: bipush -1
      // 09e: ixor
      // 09f: if_icmplt 111
      // 0a2: bipush 0
      // 0a3: istore 11
      // 0a5: iload 17
      // 0a7: ifeq 0fa
      // 0aa: aload 1
      // 0ab: sipush -6677
      // 0ae: invokevirtual Class_lh.n (I)I
      // 0b1: istore 12
      // 0b3: iload 12
      // 0b5: bipush -1
      // 0b6: ixor
      // 0b7: bipush -1
      // 0b8: if_icmpeq 0f7
      // 0bb: bipush 1
      // 0bc: iload 12
      // 0be: iand
      // 0bf: bipush -1
      // 0c0: ixor
      // 0c1: bipush -2
      // 0c3: if_icmpne 0d0
      // 0c6: aload 1
      // 0c7: dup
      // 0c8: getfield Class_lh.p I
      // 0cb: bipush 1
      // 0cc: iadd
      // 0cd: putfield Class_lh.p I
      // 0d0: iload 12
      // 0d2: bipush 2
      // 0d3: iand
      // 0d4: bipush 2
      // 0d5: if_icmpne 0e2
      // 0d8: aload 1
      // 0d9: dup
      // 0da: getfield Class_lh.p I
      // 0dd: bipush 2
      // 0de: iadd
      // 0df: putfield Class_lh.p I
      // 0e2: bipush 4
      // 0e3: iload 12
      // 0e5: iand
      // 0e6: bipush -1
      // 0e7: ixor
      // 0e8: bipush -5
      // 0ea: if_icmpne 0f7
      // 0ed: aload 1
      // 0ee: dup
      // 0ef: getfield Class_lh.p I
      // 0f2: bipush 3
      // 0f3: iadd
      // 0f4: putfield Class_lh.p I
      // 0f7: iinc 11 1
      // 0fa: iload 11
      // 0fc: iload 4
      // 0fe: ifne 107
      // 101: sipush 4096
      // 104: goto 109
      // 107: bipush 64
      // 109: if_icmplt 0aa
      // 10c: iload 17
      // 10e: ifeq 2ee
      // 111: iload 10
      // 113: ldc_w 775255206
      // 116: ishr
      // 117: istore 12
      // 119: iload 9
      // 11b: ldc_w 1933108550
      // 11e: ishr
      // 11f: istore 11
      // 121: bipush 0
      // 122: istore 13
      // 124: iload 17
      // 126: ifeq 2e7
      // 129: bipush 0
      // 12a: istore 14
      // 12c: iload 17
      // 12e: ifeq 2db
      // 131: iload 4
      // 133: ifeq 179
      // 136: iload 5
      // 138: bipush 8
      // 13a: imul
      // 13b: bipush -1
      // 13c: ixor
      // 13d: iload 13
      // 13f: bipush -1
      // 140: ixor
      // 141: if_icmplt 2d8
      // 144: iload 5
      // 146: bipush 8
      // 148: imul
      // 149: bipush 8
      // 14b: iadd
      // 14c: bipush -1
      // 14d: ixor
      // 14e: iload 13
      // 150: bipush -1
      // 151: ixor
      // 152: if_icmpge 2d8
      // 155: iload 14
      // 157: bipush -1
      // 158: ixor
      // 159: bipush 8
      // 15b: iload 6
      // 15d: imul
      // 15e: bipush -1
      // 15f: ixor
      // 160: if_icmpgt 2d8
      // 163: bipush 8
      // 165: iload 6
      // 167: imul
      // 168: bipush -8
      // 16a: isub
      // 16b: bipush -1
      // 16c: ixor
      // 16d: iload 14
      // 16f: bipush -1
      // 170: ixor
      // 171: if_icmplt 179
      // 174: iload 17
      // 176: ifeq 2d8
      // 179: aload 1
      // 17a: iload 0
      // 17b: sipush -8237
      // 17e: ixor
      // 17f: invokevirtual Class_lh.n (I)I
      // 182: istore 15
      // 184: iload 15
      // 186: bipush -1
      // 187: ixor
      // 188: bipush -1
      // 189: if_icmpeq 2d8
      // 18c: iload 15
      // 18e: bipush 1
      // 18f: iand
      // 190: bipush -1
      // 191: ixor
      // 192: bipush -2
      // 194: if_icmpne 1d2
      // 197: aload 1
      // 198: sipush -6677
      // 19b: invokevirtual Class_lh.n (I)I
      // 19e: istore 2
      // 19f: getstatic Class_i.ob [[[B
      // 1a2: iload 11
      // 1a4: aaload
      // 1a5: iload 12
      // 1a7: aaload
      // 1a8: ifnonnull 1b9
      // 1ab: getstatic Class_i.ob [[[B
      // 1ae: iload 11
      // 1b0: aaload
      // 1b1: iload 12
      // 1b3: sipush 4096
      // 1b6: newarray 8
      // 1b8: aastore
      // 1b9: getstatic Class_i.ob [[[B
      // 1bc: iload 11
      // 1be: aaload
      // 1bf: iload 12
      // 1c1: aaload
      // 1c2: bipush 63
      // 1c4: iload 14
      // 1c6: ineg
      // 1c7: iadd
      // 1c8: ldc_w -872272474
      // 1cb: ishl
      // 1cc: iload 13
      // 1ce: iadd
      // 1cf: iload 2
      // 1d0: i2b
      // 1d1: bastore
      // 1d2: iload 15
      // 1d4: bipush 2
      // 1d5: iand
      // 1d6: bipush -1
      // 1d7: ixor
      // 1d8: bipush -3
      // 1da: if_icmpne 217
      // 1dd: aload 1
      // 1de: ldc_w 1355769544
      // 1e1: invokevirtual Class_lh.k (I)I
      // 1e4: istore 2
      // 1e5: getstatic Class_i.sb [[[S
      // 1e8: iload 11
      // 1ea: aaload
      // 1eb: iload 12
      // 1ed: aaload
      // 1ee: ifnonnull 1ff
      // 1f1: getstatic Class_i.sb [[[S
      // 1f4: iload 11
      // 1f6: aaload
      // 1f7: iload 12
      // 1f9: sipush 4096
      // 1fc: newarray 9
      // 1fe: aastore
      // 1ff: getstatic Class_i.sb [[[S
      // 202: iload 11
      // 204: aaload
      // 205: iload 12
      // 207: aaload
      // 208: bipush 63
      // 20a: iload 14
      // 20c: isub
      // 20d: ldc_w -167824250
      // 210: ishl
      // 211: iload 13
      // 213: iadd
      // 214: iload 2
      // 215: i2s
      // 216: sastore
      // 217: bipush 4
      // 218: iload 15
      // 21a: iand
      // 21b: bipush -1
      // 21c: ixor
      // 21d: bipush -5
      // 21f: if_icmpne 2d8
      // 222: ldc_w 16711680
      // 225: aload 1
      // 226: sipush -6677
      // 229: invokevirtual Class_lh.n (I)I
      // 22c: ldc_w 247340304
      // 22f: ishl
      // 230: iand
      // 231: ldc_w 65280
      // 234: aload 1
      // 235: sipush -6677
      // 238: invokevirtual Class_lh.n (I)I
      // 23b: ldc_w -729656856
      // 23e: ishl
      // 23f: iand
      // 240: ineg
      // 241: aload 1
      // 242: sipush -6677
      // 245: invokevirtual Class_lh.n (I)I
      // 248: sipush 255
      // 24b: iand
      // 24c: ineg
      // 24d: iadd
      // 24e: isub
      // 24f: istore 2
      // 250: getstatic Class_w.T [[[I
      // 253: iload 11
      // 255: aaload
      // 256: iload 12
      // 258: aaload
      // 259: ifnonnull 26a
      // 25c: getstatic Class_w.T [[[I
      // 25f: iload 11
      // 261: aaload
      // 262: iload 12
      // 264: sipush 4096
      // 267: newarray 10
      // 269: aastore
      // 26a: bipush 114
      // 26c: iinc 2 -1
      // 26f: iload 2
      // 270: invokestatic Class_qe.a (II)LClass_ub;
      // 273: astore 3
      // 274: aload 3
      // 275: getfield Class_ub.J [I
      // 278: ifnull 293
      // 27b: aload 3
      // 27c: bipush -1
      // 27d: invokevirtual Class_ub.b (I)LClass_ub;
      // 280: astore 3
      // 281: aload 3
      // 282: ifnull 2d8
      // 285: aload 3
      // 286: getfield Class_ub.v I
      // 289: bipush -1
      // 28a: ixor
      // 28b: ifne 293
      // 28e: iload 17
      // 290: ifeq 2d8
      // 293: getstatic Class_w.T [[[I
      // 296: iload 11
      // 298: aaload
      // 299: iload 12
      // 29b: aaload
      // 29c: bipush 63
      // 29e: iload 14
      // 2a0: isub
      // 2a1: ldc_w 2087320198
      // 2a4: ishl
      // 2a5: iload 13
      // 2a7: iadd
      // 2a8: bipush 1
      // 2a9: aload 3
      // 2aa: getfield Class_ub.vb I
      // 2ad: iadd
      // 2ae: iastore
      // 2af: new Class_jc
      // 2b2: dup
      // 2b3: invokespecial Class_jc.<init> ()V
      // 2b6: astore 16
      // 2b8: aload 16
      // 2ba: aload 3
      // 2bb: getfield Class_ub.v I
      // 2be: putfield Class_jc.D I
      // 2c1: aload 16
      // 2c3: iload 9
      // 2c5: putfield Class_jc.u I
      // 2c8: aload 16
      // 2ca: iload 10
      // 2cc: putfield Class_jc.A I
      // 2cf: getstatic Class_mj.e LClass_c;
      // 2d2: aload 16
      // 2d4: bipush 1
      // 2d5: invokevirtual Class_c.a (LClass_li;Z)V
      // 2d8: iinc 14 1
      // 2db: iload 14
      // 2dd: bipush -1
      // 2de: ixor
      // 2df: bipush -65
      // 2e1: if_icmpgt 131
      // 2e4: iinc 13 1
      // 2e7: iload 13
      // 2e9: bipush 64
      // 2eb: if_icmplt 129
      // 2ee: aload 1
      // 2ef: getfield Class_lh.p I
      // 2f2: bipush -1
      // 2f3: ixor
      // 2f4: aload 1
      // 2f5: getfield Class_lh.E [B
      // 2f8: arraylength
      // 2f9: bipush -1
      // 2fa: ixor
      // 2fb: if_icmpgt 012
      // 2fe: iload 0
      // 2ff: sipush 14904
      // 302: if_icmpeq 34a
      // 305: bipush 69
      // 307: bipush 76
      // 309: bipush -109
      // 30b: bipush 33
      // 30d: bipush -58
      // 30f: bipush -2
      // 311: bipush 39
      // 313: bipush 107
      // 315: bipush -25
      // 317: invokestatic Class_wj.a (IIIIIIIII)V
      // 31a: return
      // 31b: astore 2
      // 31c: aload 2
      // 31d: new java/lang/StringBuffer
      // 320: dup
      // 321: ldc_w "wj.B("
      // 324: invokespecial java/lang/StringBuffer.<init> (Ljava/lang/String;)V
      // 327: iload 0
      // 328: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 32b: bipush 44
      // 32d: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 330: aload 1
      // 331: ifnull 339
      // 334: ldc "{...}"
      // 336: goto 33b
      // 339: ldc "null"
      // 33b: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 33e: bipush 41
      // 340: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 343: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 346: invokestatic Class_sh.a (Ljava/lang/Throwable;Ljava/lang/String;)LClass_ua;
      // 349: athrow
      // 34a: return
   }

   public Class_wj() {
   }
}
