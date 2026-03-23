final class Class_rj extends Class_cg {
   static int w;
   static Class_qc x = new Class_qc(5);
   static int y;
   static int z;
   static int A;
   static Class_r B = Class_tc.a(43, "::gc");
   static int C;
   static int D;
   static int E;
   static int F = 0;
   static Class_cj G;
   static Class_r H = Class_tc.a(43, "Lade Wordpack )2 ");
   static Class_nj I = new Class_nj(64);
   static Class_ik J;
   static int K = 0;
   static Class_cj L;

   static final boolean a(boolean var0, Class_aa[][][] var1, int var2, int var3, int var4, byte var5) {
      try {
         byte var6 = !var0 ? (byte)(Class_ad.l & 0xFF) : 1;
         w++;
         if (Class_pe.F[Class_jk.F][var3][var2] == var6) {
            return false;
         } else if (~(Class_kk.c[Class_jk.F][var3][var2] & 4) == -1) {
            return false;
         } else {
            int var7 = 0;
            Class_vh.gb[var7] = var3;
            int var9 = -107 % ((var5 - -16) / 61);
            int var8 = 0;
            Class_ma.cb[var7++] = var2;
            Class_pe.F[Class_jk.F][var3][var2] = var6;

            while (~var8 != ~var7) {
               int var11 = (Class_vh.gb[var8] & 16735495) >> -1540119312;
               int var10 = Class_vh.gb[var8] & 65535;
               int var12 = Class_vh.gb[var8] >> 1343402392 & 0xFF;
               int var13 = 65535 & Class_ma.cb[var8];
               int var14 = (16713050 & Class_ma.cb[var8]) >> 217901552;
               boolean var15 = false;
               var8 = var8 + 1 & 4095;
               if (~(4 & Class_kk.c[Class_jk.F][var10][var13]) == -1) {
                  var15 = true;
               }

               boolean var16 = false;

               label233:
               for (int var17 = Class_jk.F - -1; ~var17 >= -4; var17++) {
                  if (~(8 & Class_kk.c[var17][var10][var13]) == -1) {
                     if (var15 && var1[var17][var10][var13] != null) {
                        if (var1[var17][var10][var13].s != null) {
                           int var18 = Class_pb.a(var11, false);
                           if (~var18 == ~var1[var17][var10][var13].s.l || ~var18 == ~var1[var17][var10][var13].s.b) {
                              continue;
                           }

                           if (var12 != 0) {
                              int var19 = Class_pb.a(var12, false);
                              if (var1[var17][var10][var13].s.l == var19 || ~var19 == ~var1[var17][var10][var13].s.b) {
                                 continue;
                              }
                           }

                           if (var14 != 0) {
                              int var31 = Class_pb.a(var14, false);
                              if (~var1[var17][var10][var13].s.l == ~var31 || ~var1[var17][var10][var13].s.b == ~var31) {
                                 continue;
                              }
                           }
                        }

                        if (var1[var17][var10][var13].H != null) {
                           for (int var28 = 0; ~var28 > ~var1[var17][var10][var13].G; var28++) {
                              int var32 = (int)(63L & var1[var17][var10][var13].H[var28].k >> -594552946);
                              if (var32 == 21) {
                                 var32 = 19;
                              }

                              int var20 = (int)(3L & var1[var17][var10][var13].H[var28].k >> -793082092);
                              int var21 = var20 << 2086889734 | var32;
                              if (~var21 == ~var11 || var12 != 0 && var12 == var21 || ~var14 != -1 && ~var21 == ~var14) {
                                 continue label233;
                              }
                           }
                        }
                     }

                     var16 = true;
                     Class_aa var29 = var1[var17][var10][var13];
                     if (var29 != null && var29.G > 0) {
                        for (int var33 = 0; ~var29.G < ~var33; var33++) {
                           Class_lj var35 = var29.H[var33];
                           if (~var35.f != ~var35.v || ~var35.b != ~var35.u) {
                              for (int var36 = var35.v; ~var35.f <= ~var36; var36++) {
                                 for (int var22 = var35.u; ~var35.b <= ~var22; var22++) {
                                    Class_pe.F[var17][var36][var22] = var6;
                                 }
                              }
                           }
                        }
                     }

                     Class_pe.F[var17][var10][var13] = var6;
                  }
               }

               if (var16) {
                  if (Class_sg.hb[var4] < Class_mi.U[Class_jk.F + 1][var10][var13]) {
                     Class_sg.hb[var4] = Class_mi.U[Class_jk.F - -1][var10][var13];
                  }

                  int var30 = var10 << 423249287;
                  if (var30 >= Class_wf.a[var4]) {
                     if (~var30 < ~Class_aj.r[var4]) {
                        Class_aj.r[var4] = var30;
                     }
                  } else {
                     Class_wf.a[var4] = var30;
                  }

                  int var34 = var13 << 1915620551;
                  if (~var34 > ~Class_uf.K[var4]) {
                     Class_uf.K[var4] = var34;
                  } else if (~var34 < ~Class_nj.n[var4]) {
                     Class_nj.n[var4] = var34;
                  }
               }

               if (!var15) {
                  if (~var10 <= -2 && Class_pe.F[Class_jk.F][var10 + -1][var13] != var6) {
                     Class_vh.gb[var7] = Class_mb.a(Class_mb.a(1179648, var10 + -1), -754974720);
                     Class_ma.cb[var7] = Class_mb.a(1245184, var13);
                     var7 = 1 + var7 & 4095;
                     Class_pe.F[Class_jk.F][var10 + -1][var13] = var6;
                  }

                  if (~(++var13) > -105) {
                     if (var10 - 1 >= 0
                        && var6 != Class_pe.F[Class_jk.F][-1 + var10][var13]
                        && ~(Class_kk.c[Class_jk.F][var10][var13] & 4) == -1
                        && (Class_kk.c[Class_jk.F][-1 + var10][var13 - 1] & 4) == 0) {
                        Class_vh.gb[var7] = Class_mb.a(Class_mb.a(1179648, var10 + -1), 1375731712);
                        Class_ma.cb[var7] = Class_mb.a(var13, 1245184);
                        var7 = 1 + var7 & 4095;
                        Class_pe.F[Class_jk.F][var10 - 1][var13] = var6;
                     }

                     if (~var6 != ~Class_pe.F[Class_jk.F][var10][var13]) {
                        Class_vh.gb[var7] = Class_mb.a(Class_mb.a(5373952, var10), 318767104);
                        Class_ma.cb[var7] = Class_mb.a(5439488, var13);
                        var7 = var7 + 1 & 4095;
                        Class_pe.F[Class_jk.F][var10][var13] = var6;
                     }

                     if (1 + var10 < 104
                        && ~Class_pe.F[Class_jk.F][1 + var10][var13] != ~var6
                        && (4 & Class_kk.c[Class_jk.F][var10][var13]) == 0
                        && ~(4 & Class_kk.c[Class_jk.F][1 + var10][var13 - 1]) == -1) {
                        Class_vh.gb[var7] = Class_mb.a(Class_mb.a(1 + var10, 5373952), -1845493760);
                        Class_ma.cb[var7] = Class_mb.a(5439488, var13);
                        Class_pe.F[Class_jk.F][var10 - -1][var13] = var6;
                        var7 = 1 + var7 & 4095;
                     }
                  }

                  if (~(var10 - -1) > -105 && Class_pe.F[Class_jk.F][1 + var10][--var13] != var6) {
                     Class_vh.gb[var7] = Class_mb.a(1392508928, Class_mb.a(1 + var10, 9568256));
                     Class_ma.cb[var7] = Class_mb.a(var13, 9633792);
                     var7 = var7 - -1 & 4095;
                     Class_pe.F[Class_jk.F][1 + var10][var13] = var6;
                  }

                  if (--var13 >= 0) {
                     if (~(var10 + -1) <= -1
                        && ~var6 != ~Class_pe.F[Class_jk.F][-1 + var10][var13]
                        && (Class_kk.c[Class_jk.F][var10][var13] & 4) == 0
                        && ~(4 & Class_kk.c[Class_jk.F][var10 + -1][var13 + 1]) == -1) {
                        Class_vh.gb[var7] = Class_mb.a(Class_mb.a(13762560, var10 + -1), 301989888);
                        Class_ma.cb[var7] = Class_mb.a(var13, 13828096);
                        var7 = 4095 & var7 + 1;
                        Class_pe.F[Class_jk.F][var10 + -1][var13] = var6;
                     }

                     if (~Class_pe.F[Class_jk.F][var10][var13] != ~var6) {
                        Class_vh.gb[var7] = Class_mb.a(Class_mb.a(var10, 13762560), -1828716544);
                        Class_ma.cb[var7] = Class_mb.a(var13, 13828096);
                        Class_pe.F[Class_jk.F][var10][var13] = var6;
                        var7 = 4095 & 1 + var7;
                     }

                     if (var10 + 1 < 104
                        && ~var6 != ~Class_pe.F[Class_jk.F][1 + var10][var13]
                        && ~(4 & Class_kk.c[Class_jk.F][var10][var13]) == -1
                        && ~(Class_kk.c[Class_jk.F][1 + var10][1 + var13] & 4) == -1) {
                        Class_vh.gb[var7] = Class_mb.a(Class_mb.a(9568256, var10 + 1), -771751936);
                        Class_ma.cb[var7] = Class_mb.a(9633792, var13);
                        var7 = var7 - -1 & 4095;
                        Class_pe.F[Class_jk.F][var10 + 1][var13] = var6;
                     }
                  }
               }
            }

            if (Class_sg.hb[var4] != -1000000) {
               Class_sg.hb[var4] = Class_sg.hb[var4] + 10;
               Class_wf.a[var4] = Class_wf.a[var4] - 50;
               Class_aj.r[var4] = Class_aj.r[var4] + 50;
               Class_nj.n[var4] = Class_nj.n[var4] + 50;
               Class_uf.K[var4] = Class_uf.K[var4] - 50;
            }

            return true;
         }
      } catch (RuntimeException var23) {
         throw Class_sh.a(var23, "rj.D(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
      }
   }

   static final void a(boolean var0) {
      try {
         if (var0) {
            C++;
            Class_pi.W.b((byte)94);
            Class_rd.M.b((byte)94);
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "rj.A(" + var0 + ')');
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
      // 003: istore 27
      // 005: getstatic Class_rj.D I
      // 008: bipush 1
      // 009: iadd
      // 00a: putstatic Class_rj.D I
      // 00d: iload 0
      // 00e: bipush 28
      // 010: if_icmpge 017
      // 013: aconst_null
      // 014: putstatic Class_rj.I LClass_nj;
      // 017: getstatic Class_rh.p I
      // 01a: ldc 148444930
      // 01c: ishr
      // 01d: ldc -2024238198
      // 01f: ishl
      // 020: istore 2
      // 021: getstatic Class_fi.z I
      // 024: getstatic Class_sb.j I
      // 027: multianewarray 244 2
      // 02b: astore 4
      // 02d: getstatic Class_rc.h I
      // 030: ldc 719721857
      // 032: ishr
      // 033: istore 3
      // 034: iload 27
      // 036: ifeq 162
      // 039: bipush 0
      // 03a: istore 6
      // 03c: bipush 0
      // 03d: istore 7
      // 03f: bipush 0
      // 040: istore 5
      // 042: aload 1
      // 043: sipush -6677
      // 046: invokevirtual Class_lh.n (I)I
      // 049: bipush -1
      // 04a: ixor
      // 04b: bipush -2
      // 04d: if_icmpne 065
      // 050: aload 1
      // 051: sipush -6677
      // 054: invokevirtual Class_lh.n (I)I
      // 057: istore 6
      // 059: aload 1
      // 05a: sipush -6677
      // 05d: invokevirtual Class_lh.n (I)I
      // 060: istore 7
      // 062: bipush 1
      // 063: istore 5
      // 065: aload 1
      // 066: sipush -6677
      // 069: invokevirtual Class_lh.n (I)I
      // 06c: istore 8
      // 06e: aload 1
      // 06f: sipush -6677
      // 072: invokevirtual Class_lh.n (I)I
      // 075: istore 9
      // 077: getstatic Class_mb.k I
      // 07a: ineg
      // 07b: iload 8
      // 07d: bipush 64
      // 07f: imul
      // 080: iadd
      // 081: istore 10
      // 083: getstatic Class_sb.j I
      // 086: bipush -1
      // 087: getstatic Class_aa.v I
      // 08a: ineg
      // 08b: iload 9
      // 08d: bipush 64
      // 08f: imul
      // 090: iadd
      // 091: isub
      // 092: iadd
      // 093: istore 11
      // 095: iload 10
      // 097: bipush -1
      // 098: ixor
      // 099: bipush -1
      // 09a: if_icmpgt 0b8
      // 09d: bipush -63
      // 09f: iload 11
      // 0a1: iadd
      // 0a2: iflt 0b8
      // 0a5: bipush 63
      // 0a7: iload 10
      // 0a9: iadd
      // 0aa: getstatic Class_fi.z I
      // 0ad: if_icmpge 0b8
      // 0b0: getstatic Class_sb.j I
      // 0b3: iload 11
      // 0b5: if_icmpgt 0de
      // 0b8: iload 5
      // 0ba: ifeq 0cd
      // 0bd: aload 1
      // 0be: dup
      // 0bf: getfield Class_lh.p I
      // 0c2: bipush 64
      // 0c4: iadd
      // 0c5: putfield Class_lh.p I
      // 0c8: iload 27
      // 0ca: ifeq 162
      // 0cd: aload 1
      // 0ce: dup
      // 0cf: getfield Class_lh.p I
      // 0d2: sipush 4096
      // 0d5: iadd
      // 0d6: putfield Class_lh.p I
      // 0d9: iload 27
      // 0db: ifeq 162
      // 0de: bipush 0
      // 0df: istore 12
      // 0e1: iload 27
      // 0e3: ifeq 15b
      // 0e6: aload 4
      // 0e8: iload 12
      // 0ea: iload 10
      // 0ec: iadd
      // 0ed: aaload
      // 0ee: astore 13
      // 0f0: bipush 0
      // 0f1: istore 14
      // 0f3: iload 27
      // 0f5: ifeq 14f
      // 0f8: iload 5
      // 0fa: ifeq 13c
      // 0fd: bipush 8
      // 0ff: iload 6
      // 101: imul
      // 102: bipush -1
      // 103: ixor
      // 104: iload 12
      // 106: bipush -1
      // 107: ixor
      // 108: if_icmplt 14c
      // 10b: bipush 8
      // 10d: bipush 8
      // 10f: iload 6
      // 111: imul
      // 112: iadd
      // 113: iload 12
      // 115: if_icmple 14c
      // 118: iload 14
      // 11a: bipush -1
      // 11b: ixor
      // 11c: iload 7
      // 11e: bipush 8
      // 120: imul
      // 121: bipush -1
      // 122: ixor
      // 123: if_icmpgt 14c
      // 126: bipush 8
      // 128: iload 7
      // 12a: imul
      // 12b: bipush -8
      // 12d: isub
      // 12e: bipush -1
      // 12f: ixor
      // 130: iload 14
      // 132: bipush -1
      // 133: ixor
      // 134: if_icmplt 13c
      // 137: iload 27
      // 139: ifeq 14c
      // 13c: aload 13
      // 13e: iload 11
      // 140: iload 14
      // 142: ineg
      // 143: iadd
      // 144: aload 1
      // 145: sipush 3390
      // 148: invokevirtual Class_lh.o (I)B
      // 14b: bastore
      // 14c: iinc 14 1
      // 14f: iload 14
      // 151: bipush -1
      // 152: ixor
      // 153: bipush -65
      // 155: if_icmpgt 0f8
      // 158: iinc 12 1
      // 15b: iload 12
      // 15d: bipush 64
      // 15f: if_icmplt 0e6
      // 162: aload 1
      // 163: getfield Class_lh.E [B
      // 166: arraylength
      // 167: bipush -1
      // 168: ixor
      // 169: aload 1
      // 16a: getfield Class_lh.p I
      // 16d: bipush -1
      // 16e: ixor
      // 16f: if_icmplt 039
      // 172: getstatic Class_fi.z I
      // 175: istore 5
      // 177: getstatic Class_sb.j I
      // 17a: istore 6
      // 17c: iload 6
      // 17e: newarray 10
      // 180: astore 8
      // 182: iload 6
      // 184: newarray 10
      // 186: astore 9
      // 188: iload 6
      // 18a: newarray 10
      // 18c: astore 7
      // 18e: iload 6
      // 190: newarray 10
      // 192: astore 10
      // 194: iload 6
      // 196: newarray 10
      // 198: astore 11
      // 19a: bipush -5
      // 19c: istore 12
      // 19e: iload 27
      // 1a0: ifeq 427
      // 1a3: bipush 0
      // 1a4: istore 13
      // 1a6: iload 27
      // 1a8: ifeq 285
      // 1ab: iload 12
      // 1ad: bipush -5
      // 1af: isub
      // 1b0: istore 14
      // 1b2: iload 5
      // 1b4: iload 14
      // 1b6: if_icmple 218
      // 1b9: sipush 255
      // 1bc: aload 4
      // 1be: iload 14
      // 1c0: aaload
      // 1c1: iload 13
      // 1c3: baload
      // 1c4: iand
      // 1c5: istore 15
      // 1c7: iload 15
      // 1c9: bipush -1
      // 1ca: ixor
      // 1cb: bipush -1
      // 1cc: if_icmpge 218
      // 1cf: iload 15
      // 1d1: bipush 1
      // 1d2: isub
      // 1d3: sipush -128
      // 1d6: invokestatic Class_bc.b (IB)LClass_ig;
      // 1d9: astore 16
      // 1db: aload 7
      // 1dd: iload 13
      // 1df: dup2
      // 1e0: iaload
      // 1e1: aload 16
      // 1e3: getfield Class_ig.h I
      // 1e6: iadd
      // 1e7: iastore
      // 1e8: aload 8
      // 1ea: iload 13
      // 1ec: dup2
      // 1ed: iaload
      // 1ee: aload 16
      // 1f0: getfield Class_ig.m I
      // 1f3: iadd
      // 1f4: iastore
      // 1f5: aload 9
      // 1f7: iload 13
      // 1f9: dup2
      // 1fa: iaload
      // 1fb: aload 16
      // 1fd: getfield Class_ig.c I
      // 200: iadd
      // 201: iastore
      // 202: aload 10
      // 204: iload 13
      // 206: dup2
      // 207: iaload
      // 208: aload 16
      // 20a: getfield Class_ig.a I
      // 20d: iadd
      // 20e: iastore
      // 20f: aload 11
      // 211: iload 13
      // 213: dup2
      // 214: iaload
      // 215: bipush 1
      // 216: iadd
      // 217: iastore
      // 218: iload 12
      // 21a: bipush 5
      // 21b: isub
      // 21c: istore 15
      // 21e: iload 15
      // 220: bipush -1
      // 221: ixor
      // 222: bipush -1
      // 223: if_icmpgt 282
      // 226: aload 4
      // 228: iload 15
      // 22a: aaload
      // 22b: iload 13
      // 22d: baload
      // 22e: sipush 255
      // 231: iand
      // 232: istore 16
      // 234: iload 16
      // 236: ifle 282
      // 239: iload 16
      // 23b: bipush 1
      // 23c: isub
      // 23d: sipush -128
      // 240: invokestatic Class_bc.b (IB)LClass_ig;
      // 243: astore 17
      // 245: aload 7
      // 247: iload 13
      // 249: dup2
      // 24a: iaload
      // 24b: aload 17
      // 24d: getfield Class_ig.h I
      // 250: isub
      // 251: iastore
      // 252: aload 8
      // 254: iload 13
      // 256: dup2
      // 257: iaload
      // 258: aload 17
      // 25a: getfield Class_ig.m I
      // 25d: isub
      // 25e: iastore
      // 25f: aload 9
      // 261: iload 13
      // 263: dup2
      // 264: iaload
      // 265: aload 17
      // 267: getfield Class_ig.c I
      // 26a: isub
      // 26b: iastore
      // 26c: aload 10
      // 26e: iload 13
      // 270: dup2
      // 271: iaload
      // 272: aload 17
      // 274: getfield Class_ig.a I
      // 277: isub
      // 278: iastore
      // 279: aload 11
      // 27b: iload 13
      // 27d: dup2
      // 27e: iaload
      // 27f: bipush 1
      // 280: isub
      // 281: iastore
      // 282: iinc 13 1
      // 285: iload 6
      // 287: iload 13
      // 289: if_icmpgt 1ab
      // 28c: iload 12
      // 28e: iflt 424
      // 291: bipush 0
      // 292: istore 15
      // 294: getstatic Class_fb.j [[[I
      // 297: iload 12
      // 299: ldc_w -1012151354
      // 29c: ishr
      // 29d: aaload
      // 29e: astore 14
      // 2a0: bipush 0
      // 2a1: istore 16
      // 2a3: bipush 0
      // 2a4: istore 17
      // 2a6: bipush 0
      // 2a7: istore 19
      // 2a9: bipush 0
      // 2aa: istore 18
      // 2ac: bipush -5
      // 2ae: istore 20
      // 2b0: iload 27
      // 2b2: ifeq 419
      // 2b5: iload 20
      // 2b7: bipush -5
      // 2b9: iadd
      // 2ba: istore 22
      // 2bc: bipush 5
      // 2bd: iload 20
      // 2bf: iadd
      // 2c0: istore 21
      // 2c2: iload 6
      // 2c4: iload 21
      // 2c6: if_icmple 2fb
      // 2c9: iload 15
      // 2cb: aload 7
      // 2cd: iload 21
      // 2cf: iaload
      // 2d0: iadd
      // 2d1: istore 15
      // 2d3: iload 16
      // 2d5: aload 8
      // 2d7: iload 21
      // 2d9: iaload
      // 2da: iadd
      // 2db: istore 16
      // 2dd: iload 19
      // 2df: aload 11
      // 2e1: iload 21
      // 2e3: iaload
      // 2e4: iadd
      // 2e5: istore 19
      // 2e7: iload 17
      // 2e9: aload 9
      // 2eb: iload 21
      // 2ed: iaload
      // 2ee: iadd
      // 2ef: istore 17
      // 2f1: iload 18
      // 2f3: aload 10
      // 2f5: iload 21
      // 2f7: iaload
      // 2f8: iadd
      // 2f9: istore 18
      // 2fb: iload 22
      // 2fd: bipush -1
      // 2fe: ixor
      // 2ff: bipush -1
      // 300: if_icmpgt 335
      // 303: iload 19
      // 305: aload 11
      // 307: iload 22
      // 309: iaload
      // 30a: isub
      // 30b: istore 19
      // 30d: iload 15
      // 30f: aload 7
      // 311: iload 22
      // 313: iaload
      // 314: isub
      // 315: istore 15
      // 317: iload 17
      // 319: aload 9
      // 31b: iload 22
      // 31d: iaload
      // 31e: isub
      // 31f: istore 17
      // 321: iload 18
      // 323: aload 10
      // 325: iload 22
      // 327: iaload
      // 328: isub
      // 329: istore 18
      // 32b: iload 16
      // 32d: aload 8
      // 32f: iload 22
      // 331: iaload
      // 332: isub
      // 333: istore 16
      // 335: iload 20
      // 337: bipush -1
      // 338: ixor
      // 339: bipush -1
      // 33a: if_icmpgt 416
      // 33d: iload 19
      // 33f: bipush -1
      // 340: ixor
      // 341: bipush -1
      // 342: if_icmpge 416
      // 345: aload 14
      // 347: iload 20
      // 349: ldc_w -226701594
      // 34c: ishr
      // 34d: aaload
      // 34e: astore 23
      // 350: iload 18
      // 352: bipush -1
      // 353: ixor
      // 354: bipush -1
      // 355: if_icmpne 35c
      // 358: bipush 0
      // 359: goto 374
      // 35c: iload 16
      // 35e: iload 19
      // 360: idiv
      // 361: bipush -82
      // 363: iload 17
      // 365: iload 19
      // 367: idiv
      // 368: iload 15
      // 36a: sipush 256
      // 36d: imul
      // 36e: iload 18
      // 370: idiv
      // 371: invokestatic Class_kc.a (IBII)I
      // 374: istore 24
      // 376: aload 4
      // 378: iload 12
      // 37a: aaload
      // 37b: iload 20
      // 37d: baload
      // 37e: ifne 3a2
      // 381: aload 23
      // 383: ifnull 416
      // 386: aload 23
      // 388: bipush 63
      // 38a: iload 12
      // 38c: invokestatic Class_ui.a (II)I
      // 38f: bipush 63
      // 391: iload 20
      // 393: invokestatic Class_ui.a (II)I
      // 396: ldc_w -1613445434
      // 399: ishl
      // 39a: iadd
      // 39b: bipush 0
      // 39c: iastore
      // 39d: iload 27
      // 39f: ifeq 416
      // 3a2: aload 23
      // 3a4: ifnonnull 3b8
      // 3a7: aload 14
      // 3a9: iload 20
      // 3ab: ldc_w 1409522502
      // 3ae: ishr
      // 3af: sipush 4096
      // 3b2: newarray 10
      // 3b4: dup_x2
      // 3b5: aastore
      // 3b6: astore 23
      // 3b8: iload 3
      // 3b9: iload 24
      // 3bb: bipush 127
      // 3bd: iand
      // 3be: iadd
      // 3bf: istore 25
      // 3c1: iload 25
      // 3c3: bipush -1
      // 3c4: ixor
      // 3c5: bipush -1
      // 3c6: if_icmple 3d1
      // 3c9: bipush 0
      // 3ca: istore 25
      // 3cc: iload 27
      // 3ce: ifeq 3df
      // 3d1: iload 25
      // 3d3: bipush -1
      // 3d4: ixor
      // 3d5: sipush -128
      // 3d8: if_icmpge 3df
      // 3db: bipush 127
      // 3dd: istore 25
      // 3df: iload 25
      // 3e1: iload 24
      // 3e3: iload 2
      // 3e4: iadd
      // 3e5: ldc_w 64512
      // 3e8: iand
      // 3e9: iadd
      // 3ea: sipush 896
      // 3ed: iload 24
      // 3ef: iand
      // 3f0: ineg
      // 3f1: isub
      // 3f2: istore 26
      // 3f4: aload 23
      // 3f6: bipush 63
      // 3f8: iload 12
      // 3fa: invokestatic Class_ui.a (II)I
      // 3fd: bipush 63
      // 3ff: iload 20
      // 401: invokestatic Class_ui.a (II)I
      // 404: ldc_w 277041574
      // 407: ishl
      // 408: iadd
      // 409: getstatic Class_kd.h [I
      // 40c: bipush 2
      // 40d: bipush 96
      // 40f: iload 26
      // 411: invokestatic Class_ae.a (III)I
      // 414: iaload
      // 415: iastore
      // 416: iinc 20 1
      // 419: iload 20
      // 41b: bipush -1
      // 41c: ixor
      // 41d: iload 6
      // 41f: bipush -1
      // 420: ixor
      // 421: if_icmpgt 2b5
      // 424: iinc 12 1
      // 427: iload 12
      // 429: iload 5
      // 42b: if_icmplt 1a3
      // 42e: return
      // 42f: astore 2
      // 430: aload 2
      // 431: new java/lang/StringBuffer
      // 434: dup
      // 435: ldc_w "rj.C("
      // 438: invokespecial java/lang/StringBuffer.<init> (Ljava/lang/String;)V
      // 43b: iload 0
      // 43c: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 43f: bipush 44
      // 441: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 444: aload 1
      // 445: ifnull 44d
      // 448: ldc "{...}"
      // 44a: goto 44f
      // 44d: ldc "null"
      // 44f: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 452: bipush 41
      // 454: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 457: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 45a: invokestatic Class_sh.a (Ljava/lang/Throwable;Ljava/lang/String;)LClass_ua;
      // 45d: athrow
   }

   static final int a(byte var0, int var1, int var2) {
      try {
         if (var0 != 20) {
            return -120;
         } else {
            A++;
            int var3 = -1 + var2 & var1 >> 516948031;
            return (var1 + (var1 >>> 1824539903)) % var2 - -var3;
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "rj.B(" + var0 + 44 + var1 + 44 + var2 + 41);
      }
   }

   static final void a(byte var0, Class_wd var1) {
      try {
         if (var0 < -3) {
            var1.r = false;
            z++;
            if (var1.p != null) {
               var1.p.p = 0;
            }

            for (Class_wd var2 = var1.b(); var2 != null; var2 = var1.d()) {
               a((byte)-10, var2);
            }
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "rj.E(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   public static void b(byte var0) {
      try {
         if (var0 != 15) {
            a((byte)-48, 88, 69);
         }

         x = null;
         B = null;
         L = null;
         G = null;
         J = null;
         H = null;
         I = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "rj.F(" + var0 + ')');
      }
   }
}
