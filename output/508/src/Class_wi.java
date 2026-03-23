import java.util.Random;

final class Class_wi extends Class_lf {
   static int Q;
   static int R;
   static int S;
   static int T;
   static int U;
   static int V;
   static int W;
   private int X;
   static int[] Y = new int[100];
   private short[] Z = new short[512];
   private int ab;
   private int bb;
   static int[] cb = new int[32];
   private int db;
   private int eb;
   static int fb;
   private int gb;
   static int hb;
   static int ib;
   private byte[] jb;

   public Class_wi() {
      super(0, true);
      this.X = 0;
      this.bb = 2048;
      this.eb = 5;
      this.gb = 2;
      this.db = 1;
      this.jb = new byte[512];
      this.ab = 5;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Irreducible bytecode has more than 5 nodes in sequence and was not entirely decomposed
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   final int[] a(byte var1, int var2) {
      int var19 = client.lb;

      try {
         U++;
         int[] var3 = super.H.a(false, var2);
         if (var1 != -61) {
            return null;
         } else {
            if (super.H.s) {
               int var4 = this.ab * Class_l.y[var2] + 2048;
               int var5 = var4 >> 329137420;
               int var6 = var5 + 1;
               int var14 = 0;
               if (var19 != 0 || Class_ld.X > var14) {
                  do {
                     Class_rd.W = 2147483647;
                     Class_vj.y = 2147483647;
                     Class_si.f = 2147483647;
                     Class_ci.M = 2147483647;
                     int var15 = this.eb * Class_ce.gb[var14] + 2048;
                     int var16 = var15 >> -65607508;
                     int var17 = var16 + 1;
                     int var8 = var5 + -1;
                     if (var19 != 0 || ~var6 <= ~var8) {
                        label248:
                        while (true) {
                           int var12 = this.jb[0xFF & (var8 < this.ab ? var8 : -this.ab + var8)] & 255;
                           int var7 = -1 + var16;
                           byte[] var10000;
                           int var10001;
                           int var10002;
                           if (var19 != 0) {
                              var10000 = this.jb;
                              var10001 = var12;
                              var10002 = ~this.eb >= ~var7 ? var7 + -this.eb : var7;
                           } else {
                              if (var7 > var17) {
                                 if (~var6 > ~(++var8)) {
                                    break;
                                 }
                                 continue;
                              }

                              var10000 = this.jb;
                              var10001 = var12;
                              var10002 = ~this.eb >= ~var7 ? var7 + -this.eb : var7;
                           }

                           while (true) {
                              int var11;
                              int var29 = 0;
                              double var30 = 0;
                              label243: {
                                 int var9;
                                 int var10;
                                 label242: {
                                    label262: {
                                       label263: {
                                          int var13 = (var10000[var10001 - -var10002 & 0xFF] & 255) * 2;
                                          var9 = -(var7 << -732815412) - this.Z[var13++] + var15;
                                          var10 = var4 - ((var8 << -1632225748) + this.Z[var13]);
                                          int var18 = this.db;
                                          if (var18 != 1) {
                                             if (~var18 == -4) {
                                                var9 = ~var9 <= -1 ? var9 : -var9;
                                                var10 = ~var10 > -1 ? -var10 : var10;
                                                var29 = ~var9 >= ~var10 ? var10 : var9;
                                                break label263;
                                             }

                                             if (~var18 == -5) {
                                                var9 = (int)(4096.0 * Math.sqrt((~var9 <= -1 ? var9 : -var9) / 4096.0F));
                                                var30 = 4096.0;
                                                var10001 = var10 < 0 ? -var10 : var10;
                                                break label262;
                                             }

                                             if (var18 == 5) {
                                                break label242;
                                             }

                                             if (~var18 != -3) {
                                                var11 = (int)(4096.0 * Math.sqrt((var10 * var10 + var9 * var9) / 1.6777216E7F));
                                                break label243;
                                             }

                                             if (var19 == 0) {
                                                var11 = (~var9 <= -1 ? var9 : -var9) + (var10 >= 0 ? var10 : -var10);
                                                if (var19 != 0) {
                                                   var11 = (int)(4096.0 * Math.sqrt((var10 * var10 + var9 * var9) / 1.6777216E7F));
                                                }
                                                break label243;
                                             }
                                          }

                                          var11 = var9 * var9 - -(var10 * var10) >> -1406160692;
                                          if (var19 == 0) {
                                             break label243;
                                          }

                                          var9 = ~var9 <= -1 ? var9 : -var9;
                                          var10 = ~var10 > -1 ? -var10 : var10;
                                          var29 = ~var9 >= ~var10 ? var10 : var9;
                                       }

                                       var11 = var29;
                                       if (var19 == 0) {
                                          break label243;
                                       }

                                       var9 = (int)(4096.0 * Math.sqrt((~var9 <= -1 ? var9 : -var9) / 4096.0F));
                                       var30 = 4096.0;
                                       var10001 = var10 < 0 ? -var10 : var10;
                                    }

                                    var10 = (int)(var30 * Math.sqrt(var10001 / 4096.0F));
                                    var11 = var10 + var9;
                                    var11 = var11 * var11 >> -1930277172;
                                    if (var19 == 0) {
                                       break label243;
                                    }
                                 }

                                 var9 *= var9;
                                 var10 *= var10;
                                 var11 = (int)(4096.0 * Math.sqrt(Math.sqrt((var9 + var10) / 1.6777216E7F)));
                                 if (var19 != 0) {
                                    var11 = (~var9 <= -1 ? var9 : -var9) + (var10 >= 0 ? var10 : -var10);
                                    if (var19 != 0) {
                                       var11 = (int)(4096.0 * Math.sqrt((var10 * var10 + var9 * var9) / 1.6777216E7F));
                                    }
                                 }
                              }

                              if (~var11 <= ~Class_ci.M) {
                                 if (~Class_si.f >= ~var11) {
                                    if (Class_vj.y <= var11) {
                                       if (Class_rd.W > var11) {
                                          Class_rd.W = var11;
                                          if (var19 != 0) {
                                             Class_rd.W = Class_vj.y;
                                             Class_vj.y = var11;
                                             if (var19 != 0) {
                                                Class_rd.W = Class_vj.y;
                                                Class_vj.y = Class_si.f;
                                                Class_si.f = var11;
                                                if (var19 != 0) {
                                                   Class_rd.W = Class_vj.y;
                                                   Class_vj.y = Class_si.f;
                                                   Class_si.f = Class_ci.M;
                                                   Class_ci.M = var11;
                                                   var7++;
                                                } else {
                                                   var7++;
                                                }
                                             } else {
                                                var7++;
                                             }
                                          } else {
                                             var7++;
                                          }
                                       } else {
                                          var7++;
                                       }
                                    } else {
                                       Class_rd.W = Class_vj.y;
                                       Class_vj.y = var11;
                                       if (var19 != 0) {
                                          Class_rd.W = Class_vj.y;
                                          Class_vj.y = Class_si.f;
                                          Class_si.f = var11;
                                          if (var19 != 0) {
                                             Class_rd.W = Class_vj.y;
                                             Class_vj.y = Class_si.f;
                                             Class_si.f = Class_ci.M;
                                             Class_ci.M = var11;
                                             var7++;
                                          } else {
                                             var7++;
                                          }
                                       } else {
                                          var7++;
                                       }
                                    }
                                 } else {
                                    Class_rd.W = Class_vj.y;
                                    Class_vj.y = Class_si.f;
                                    Class_si.f = var11;
                                    if (var19 != 0) {
                                       Class_rd.W = Class_vj.y;
                                       Class_vj.y = Class_si.f;
                                       Class_si.f = Class_ci.M;
                                       Class_ci.M = var11;
                                       var7++;
                                    } else {
                                       var7++;
                                    }
                                 }
                              } else {
                                 Class_rd.W = Class_vj.y;
                                 Class_vj.y = Class_si.f;
                                 Class_si.f = Class_ci.M;
                                 Class_ci.M = var11;
                                 var7++;
                              }

                              if (var7 > var17) {
                                 if (~var6 > ~(++var8)) {
                                    break label248;
                                 }
                                 break;
                              }

                              var10000 = this.jb;
                              var10001 = var12;
                              var10002 = ~this.eb >= ~var7 ? var7 + -this.eb : var7;
                           }
                        }
                     }

                     label122: {
                        label121: {
                           label120: {
                              label119: {
                                 int var27 = this.gb;
                                 if (var27 != 0) {
                                    if (var27 == 1) {
                                       break label119;
                                    }

                                    if (var27 == 3) {
                                       break label120;
                                    }

                                    if (~var27 == -5) {
                                       break label121;
                                    }

                                    if (var27 != 2) {
                                       continue;
                                    }

                                    if (var19 == 0) {
                                       break label122;
                                    }
                                 }

                                 var3[var14] = Class_ci.M;
                                 if (var19 == 0) {
                                    continue;
                                 }
                              }

                              var3[var14] = Class_si.f;
                              if (var19 == 0) {
                                 continue;
                              }
                           }

                           var3[var14] = Class_vj.y;
                           if (var19 == 0) {
                              continue;
                           }
                        }

                        var3[var14] = Class_rd.W;
                        if (var19 == 0) {
                           continue;
                        }
                     }

                     var3[var14] = Class_si.f - Class_ci.M;
                  } while (Class_ld.X > ++var14);
               }
            }

            return var3;
         }
      } catch (RuntimeException var20) {
         throw Class_sh.a(var20, "wi.G(" + var1 + ',' + var2 + ')');
      }
   }

   static final void d(byte var0) {
      int var2 = client.lb;

      try {
         label34: {
            int var1 = 102 / ((var0 - -71) / 38);
            if (Class_hd.j == 2) {
               if (~Class_v.B != ~Class_pg.r || Class_j.bb != Class_pc.c) {
                  break label34;
               }

               Class_hd.j = 0;
               Class_gj.a((byte)-126, Class_ma.ib - 1);
               if (var2 == 0) {
                  break label34;
               }
            }

            if (Class_vh.rb == Class_v.B && ~Class_pc.c == ~Class_wb.i) {
               Class_hd.j = 0;
               Class_gj.a((byte)102, Class_ma.ib + -1);
               if (var2 == 0) {
                  break label34;
               }
            }

            Class_j.bb = Class_wb.i;
            Class_pg.r = Class_vh.rb;
            Class_hd.j = 2;
         }

         V++;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "wi.H(" + var0 + ')');
      }
   }

   public static void g(int var0) {
      try {
         cb = null;
         if (var0 == -1) {
            Y = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "wi.D(" + var0 + ')');
      }
   }

   final void a(Class_lh var1, int var2, int var3) {
      int var5 = client.lb;

      try {
         label69: {
            label68: {
               label67: {
                  label66: {
                     label65: {
                        label64: {
                           label63: {
                              T++;
                              if (~var2 != -1) {
                                 if (~var2 == -2) {
                                    break label63;
                                 }

                                 if (var2 == 2) {
                                    break label64;
                                 }

                                 if (~var2 == -4) {
                                    break label65;
                                 }

                                 if (var2 == 4) {
                                    break label66;
                                 }

                                 if (~var2 == -6) {
                                    break label67;
                                 }

                                 if (var2 != 6) {
                                    break label69;
                                 }

                                 if (var5 == 0) {
                                    break label68;
                                 }
                              }

                              this.eb = this.ab = var1.n(-6677);
                              if (var5 == 0) {
                                 break label69;
                              }
                           }

                           this.X = var1.n(-6677);
                           if (var5 == 0) {
                              break label69;
                           }
                        }

                        this.bb = var1.k(1355769544);
                        if (var5 == 0) {
                           break label69;
                        }
                     }

                     this.gb = var1.n(-6677);
                     if (var5 == 0) {
                        break label69;
                     }
                  }

                  this.db = var1.n(var3 ^ 6676);
                  if (var5 == 0) {
                     break label69;
                  }
               }

               this.eb = var1.n(-6677);
               if (var5 == 0) {
                  break label69;
               }
            }

            this.ab = var1.n(-6677);
         }

         if (var3 != -1) {
            d(127, -1, 114);
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "wi.K(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }

   final void a(byte var1) {
      try {
         this.jb = Class_vh.b((byte)14, this.X);
         W++;
         if (var1 < -22) {
            this.h(-1632225748);
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "wi.I(" + var1 + ')');
      }
   }

   static final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic client.lb I
      // 003: istore 31
      // 005: getstatic Class_wi.S I
      // 008: bipush 1
      // 009: iadd
      // 00a: putstatic Class_wi.S I
      // 00d: iload 6
      // 00f: ineg
      // 010: iload 1
      // 011: iadd
      // 012: istore 11
      // 014: iload 10
      // 016: iload 2
      // 017: ineg
      // 018: iadd
      // 019: istore 12
      // 01b: getstatic Class_ve.T I
      // 01e: ifle 02e
      // 021: getstatic Class_ve.T I
      // 024: bipush 10
      // 026: irem
      // 027: bipush -1
      // 028: ixor
      // 029: bipush -6
      // 02b: if_icmpgt 036
      // 02e: bipush 0
      // 02f: istore 13
      // 031: iload 31
      // 033: ifeq 039
      // 036: bipush 1
      // 037: istore 13
      // 039: ldc 983040
      // 03b: iload 8
      // 03d: idiv
      // 03e: istore 15
      // 040: ldc 983040
      // 042: iload 0
      // 043: idiv
      // 044: istore 16
      // 046: iload 15
      // 048: ineg
      // 049: istore 17
      // 04b: iload 31
      // 04d: ifeq 1b1
      // 050: iload 3
      // 051: iload 8
      // 053: iload 17
      // 055: imul
      // 056: iadd
      // 057: ldc 2056485616
      // 059: ishr
      // 05a: istore 18
      // 05c: iload 3
      // 05d: iload 8
      // 05f: bipush 1
      // 060: iload 17
      // 062: iadd
      // 063: imul
      // 064: ineg
      // 065: isub
      // 066: ldc -2040025040
      // 068: ishr
      // 069: istore 19
      // 06b: iload 18
      // 06d: ineg
      // 06e: iload 19
      // 070: iadd
      // 071: istore 20
      // 073: iload 20
      // 075: bipush -1
      // 076: ixor
      // 077: bipush -1
      // 078: if_icmpge 1ae
      // 07b: iload 17
      // 07d: iload 6
      // 07f: iadd
      // 080: ldc 926459878
      // 082: ishr
      // 083: istore 21
      // 085: iload 18
      // 087: iload 5
      // 089: iadd
      // 08a: istore 18
      // 08c: iload 19
      // 08e: iload 5
      // 090: iadd
      // 091: istore 19
      // 093: iload 21
      // 095: bipush -1
      // 096: ixor
      // 097: bipush -1
      // 098: if_icmpgt 1ae
      // 09b: iload 21
      // 09d: bipush -1
      // 09e: ixor
      // 09f: bipush -1
      // 0a0: getstatic Class_w.T [[[I
      // 0a3: arraylength
      // 0a4: iadd
      // 0a5: bipush -1
      // 0a6: ixor
      // 0a7: if_icmpge 0af
      // 0aa: iload 31
      // 0ac: ifeq 1ae
      // 0af: getstatic Class_w.T [[[I
      // 0b2: iload 21
      // 0b4: aaload
      // 0b5: astore 22
      // 0b7: iload 16
      // 0b9: ineg
      // 0ba: istore 23
      // 0bc: iload 31
      // 0be: ifeq 1a0
      // 0c1: iload 7
      // 0c3: bipush 1
      // 0c4: iload 23
      // 0c6: iadd
      // 0c7: iload 0
      // 0c8: imul
      // 0c9: ineg
      // 0ca: isub
      // 0cb: ldc 740261616
      // 0cd: ishr
      // 0ce: istore 25
      // 0d0: iload 7
      // 0d2: iload 0
      // 0d3: iload 23
      // 0d5: imul
      // 0d6: iadd
      // 0d7: ldc -613871312
      // 0d9: ishr
      // 0da: istore 24
      // 0dc: iload 25
      // 0de: iload 24
      // 0e0: isub
      // 0e1: istore 26
      // 0e3: iload 26
      // 0e5: bipush -1
      // 0e6: ixor
      // 0e7: bipush -1
      // 0e8: if_icmpge 19d
      // 0eb: iload 25
      // 0ed: iload 9
      // 0ef: iadd
      // 0f0: istore 25
      // 0f2: iload 24
      // 0f4: iload 9
      // 0f6: iadd
      // 0f7: istore 24
      // 0f9: iload 2
      // 0fa: iload 23
      // 0fc: iadd
      // 0fd: ldc 245999110
      // 0ff: ishr
      // 100: istore 27
      // 102: iload 27
      // 104: iflt 19d
      // 107: iload 27
      // 109: bipush -1
      // 10a: aload 22
      // 10c: arraylength
      // 10d: iadd
      // 10e: if_icmple 116
      // 111: iload 31
      // 113: ifeq 19d
      // 116: aload 22
      // 118: iload 27
      // 11a: aaload
      // 11b: ifnull 19d
      // 11e: iload 17
      // 120: iload 6
      // 122: iadd
      // 123: bipush 63
      // 125: iand
      // 126: iload 2
      // 127: iload 23
      // 129: iadd
      // 12a: bipush 63
      // 12c: iand
      // 12d: ldc -852910938
      // 12f: ishl
      // 130: iadd
      // 131: istore 28
      // 133: aload 22
      // 135: iload 27
      // 137: aaload
      // 138: iload 28
      // 13a: iaload
      // 13b: istore 29
      // 13d: iload 29
      // 13f: ifeq 19d
      // 142: bipush 115
      // 144: iload 29
      // 146: bipush -1
      // 147: iadd
      // 148: invokestatic Class_qe.a (II)LClass_ub;
      // 14b: astore 14
      // 14d: iload 13
      // 14f: ifeq 187
      // 152: aload 14
      // 154: getfield Class_ub.v I
      // 157: getstatic Class_ia.gb I
      // 15a: if_icmpne 187
      // 15d: new Class_jc
      // 160: dup
      // 161: invokespecial Class_jc.<init> ()V
      // 164: astore 30
      // 166: aload 30
      // 168: iload 24
      // 16a: putfield Class_jc.A I
      // 16d: aload 30
      // 16f: aload 14
      // 171: getfield Class_ub.v I
      // 174: putfield Class_jc.D I
      // 177: aload 30
      // 179: iload 18
      // 17b: putfield Class_jc.u I
      // 17e: getstatic Class_pf.a LClass_c;
      // 181: aload 30
      // 183: bipush 1
      // 184: invokevirtual Class_c.a (LClass_li;Z)V
      // 187: getstatic Class_fk.S [LClass_ni;
      // 18a: aload 14
      // 18c: getfield Class_ub.v I
      // 18f: aaload
      // 190: bipush -7
      // 192: iload 18
      // 194: iadd
      // 195: iload 24
      // 197: bipush -7
      // 199: iadd
      // 19a: invokevirtual Class_ni.c (II)V
      // 19d: iinc 23 1
      // 1a0: iload 12
      // 1a2: iload 16
      // 1a4: iadd
      // 1a5: bipush -1
      // 1a6: ixor
      // 1a7: iload 23
      // 1a9: bipush -1
      // 1aa: ixor
      // 1ab: if_icmplt 0c1
      // 1ae: iinc 17 1
      // 1b1: iload 11
      // 1b3: iload 15
      // 1b5: ineg
      // 1b6: isub
      // 1b7: iload 17
      // 1b9: if_icmpgt 050
      // 1bc: bipush -124
      // 1be: iload 4
      // 1c0: bipush -31
      // 1c2: isub
      // 1c3: bipush 58
      // 1c5: idiv
      // 1c6: idiv
      // 1c7: istore 18
      // 1c9: getstatic Class_pf.a LClass_c;
      // 1cc: bipush 76
      // 1ce: invokevirtual Class_c.e (B)LClass_li;
      // 1d1: checkcast Class_jc
      // 1d4: astore 19
      // 1d6: iload 31
      // 1d8: ifeq 22e
      // 1db: getstatic Class_fk.S [LClass_ni;
      // 1de: aload 19
      // 1e0: getfield Class_jc.D I
      // 1e3: aaload
      // 1e4: bipush -7
      // 1e6: aload 19
      // 1e8: getfield Class_jc.u I
      // 1eb: iadd
      // 1ec: aload 19
      // 1ee: getfield Class_jc.A I
      // 1f1: bipush 7
      // 1f3: isub
      // 1f4: invokevirtual Class_ni.c (II)V
      // 1f7: aload 19
      // 1f9: getfield Class_jc.u I
      // 1fc: aload 19
      // 1fe: getfield Class_jc.A I
      // 201: bipush 15
      // 203: ldc_w 16776960
      // 206: sipush 128
      // 209: invokestatic Class_nc.e (IIIII)V
      // 20c: aload 19
      // 20e: getfield Class_jc.u I
      // 211: aload 19
      // 213: getfield Class_jc.A I
      // 216: bipush 7
      // 218: ldc_w 16777215
      // 21b: sipush 256
      // 21e: invokestatic Class_nc.e (IIIII)V
      // 221: getstatic Class_pf.a LClass_c;
      // 224: bipush -119
      // 226: invokevirtual Class_c.c (B)LClass_li;
      // 229: checkcast Class_jc
      // 22c: astore 19
      // 22e: aload 19
      // 230: ifnonnull 1db
      // 233: getstatic Class_pf.a LClass_c;
      // 236: bipush 105
      // 238: invokevirtual Class_c.b (I)V
      // 23b: return
      // 23c: astore 11
      // 23e: aload 11
      // 240: new java/lang/StringBuffer
      // 243: dup
      // 244: ldc_w "wi.C("
      // 247: invokespecial java/lang/StringBuffer.<init> (Ljava/lang/String;)V
      // 24a: iload 0
      // 24b: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 24e: bipush 44
      // 250: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 253: iload 1
      // 254: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 257: bipush 44
      // 259: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 25c: iload 2
      // 25d: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 260: bipush 44
      // 262: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 265: iload 3
      // 266: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 269: bipush 44
      // 26b: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 26e: iload 4
      // 270: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 273: bipush 44
      // 275: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 278: iload 5
      // 27a: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 27d: bipush 44
      // 27f: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 282: iload 6
      // 284: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 287: bipush 44
      // 289: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 28c: iload 7
      // 28e: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 291: bipush 44
      // 293: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 296: iload 8
      // 298: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 29b: bipush 44
      // 29d: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 2a0: iload 9
      // 2a2: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 2a5: bipush 44
      // 2a7: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 2aa: iload 10
      // 2ac: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 2af: bipush 41
      // 2b1: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 2b4: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 2b7: invokestatic Class_sh.a (Ljava/lang/Throwable;Ljava/lang/String;)LClass_ua;
      // 2ba: athrow
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Irreducible bytecode has more than 5 nodes in sequence and was not entirely decomposed
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, byte var6) {
      int var18 = client.lb;

      try {
         R++;
         Class_hd.h = 0;
         int var7 = -1;
         if (var18 != 0 || ~(client.ib + Class_ke.p) < ~var7) {
            do {
               Object var8;
               if (var7 == -1) {
                  var8 = Class_gg.B;
                  if (var18 != 0) {
                     if (var7 >= client.ib) {
                        var8 = Class_rf.a[Class_kg.v[-client.ib + var7]];
                        if (var18 != 0) {
                           var8 = Class_db.Q[Class_oc.q[var7]];
                        }
                     } else {
                        var8 = Class_db.Q[Class_oc.q[var7]];
                     }
                  }
               } else if (var7 >= client.ib) {
                  var8 = Class_rf.a[Class_kg.v[-client.ib + var7]];
                  if (var18 != 0) {
                     var8 = Class_db.Q[Class_oc.q[var7]];
                  }
               } else {
                  var8 = Class_db.Q[Class_oc.q[var7]];
               }

               if (var8 != null) {
                  if (!((Class_ta)var8).d(109) && var18 == 0) {
                     var7++;
                  } else {
                     if (var8 instanceof Class_eh) {
                        Class_nd var9 = ((Class_eh)var8).Pb;
                        if (var9.z != null) {
                           var9 = var9.d(-94);
                        }

                        if (var9 == null && var18 == 0) {
                           var7++;
                           continue;
                        }
                     }

                     label432: {
                        if (var7 >= client.ib) {
                           Class_nd var21 = ((Class_eh)var8).Pb;
                           if (var21.z != null) {
                              var21 = var21.d(-94);
                           }

                           if (~var21.H <= -1 && ~var21.H > ~Class_si.e.length) {
                              Class_ph.a(93, var5, var3, var0 >> -617376639, (Class_ta)var8, var1 >> 253301537, ((Class_ta)var8).a((byte)109) - -15);
                              if (~Class_od.l < 0) {
                                 Class_si.e[var21.H].c(var2 - (-Class_od.l - -12), var4 + Class_th.b - 30);
                              }
                           }

                           Class_d[] var10 = Class_fd.d;
                           int var11 = 0;
                           if (var18 != 0 || ~var10.length < ~var11) {
                              do {
                                 Class_d var12 = var10[var11];
                                 if (var12 != null && var12.a == 1 && ~var12.e == ~Class_kg.v[-client.ib + var7] && Class_be.C % 20 < 10) {
                                    Class_ph.a(54, var5, var3, var0 >> 1370432289, (Class_ta)var8, var1 >> 319321345, ((Class_ta)var8).a((byte)-122) - -15);
                                    if (Class_od.l > -1) {
                                       Class_ia.ib[var12.k].c(Class_od.l + var2 - 12, var4 - (-Class_th.b - -28));
                                    }
                                 }
                              } while (~var10.length < ~(++var11));
                           }

                           if (var18 == 0) {
                              break label432;
                           }
                        }

                        Class_fa var26 = (Class_fa)var8;
                        byte var22 = 30;
                        if (var26.uc != -1 || var26.hc != -1) {
                           Class_ph.a(110, var5, var3, var0 >> -234316287, (Class_ta)var8, var1 >> 1474617121, 15 + ((Class_ta)var8).a((byte)-114));
                           if (Class_od.l > -1) {
                              if (var26.uc != -1) {
                                 Class_jg.g[var26.uc].c(-12 + Class_od.l + var2, var4 + Class_th.b + -var22);
                                 var22 += 25;
                              }

                              if (var26.hc != -1) {
                                 Class_si.e[var26.hc].c(-12 + var2 - -Class_od.l, var4 + Class_th.b + -var22);
                                 var22 += 25;
                              }
                           }
                        }

                        if (var7 >= 0) {
                           int var33 = 0;
                           Class_d[] var29 = Class_fd.d;
                           if (var18 != 0 || var29.length > var33) {
                              do {
                                 Class_d var13 = var29[var33];
                                 if (var13 != null && var13.a == 10 && ~var13.e == ~Class_oc.q[var7]) {
                                    Class_ph.a(55, var5, var3, var0 >> 1187412609, (Class_ta)var8, var1 >> 815114945, ((Class_ta)var8).a((byte)87) + 15);
                                    if (~Class_od.l < 0) {
                                       Class_ia.ib[var13.k].c(var2 - (-Class_od.l + 12), -var22 + Class_th.b + var4);
                                    }
                                 }
                              } while (var29.length > ++var33);
                           }
                        }
                     }

                     if (((Class_ta)var8).wb != null
                        && (var7 >= client.ib || ~Class_ga.E == -1 || Class_ga.E == 3 || ~Class_ga.E == -2 && Class_ji.a(-86, ((Class_fa)var8).Zb))) {
                        Class_ph.a(33, var5, var3, var0 >> -1557620863, (Class_ta)var8, var1 >> 298870017, ((Class_ta)var8).a((byte)-111));
                        if (~Class_od.l < 0 && Class_hd.h < Class_cg.q) {
                           Class_cg.h[Class_hd.h] = Class_db.sb.c(((Class_ta)var8).wb) / 2;
                           Class_cg.p[Class_hd.h] = Class_db.sb.K;
                           Class_cg.i[Class_hd.h] = Class_od.l;
                           Class_cg.u[Class_hd.h] = Class_th.b;
                           Class_cg.k[Class_hd.h] = ((Class_ta)var8).H;
                           Class_cg.m[Class_hd.h] = ((Class_ta)var8).L;
                           Class_cg.s[Class_hd.h] = ((Class_ta)var8).pb;
                           Class_cg.o[Class_hd.h] = ((Class_ta)var8).wb;
                           Class_hd.h++;
                        }
                     }

                     if (~Class_be.C > ~((Class_ta)var8).G) {
                        Class_jb var23 = Class_md.y[0];
                        Class_jb var27 = Class_md.y[1];
                        if (var8 instanceof Class_eh) {
                           Class_eh var30 = (Class_eh)var8;
                           Class_jb[] var34 = (Class_jb[])Class_si.d.a(14366, (long)var30.Pb.F);
                           if (var34 == null) {
                              var34 = Class_wg.a(0, var30.Pb.F, 0, Class_id.s);
                              if (var34 != null) {
                                 Class_si.d.a(var34, 100, var30.Pb.F);
                              }
                           }

                           if (var34 != null && var34.length == 2) {
                              var27 = var34[1];
                              var23 = var34[0];
                           }
                        }

                        Class_ph.a(57, var5, var3, var0 >> -1344746495, (Class_ta)var8, var1 >> 1523513249, ((Class_ta)var8).a((byte)-120) - (-10 - var23.S));
                        if (Class_od.l > -1) {
                           int var31 = Class_od.l + var2 + -(var23.Q >> -428194975);
                           int var35 = Class_th.b + var4 + -3;
                           var23.c(var31, var35);
                           int var37 = ((Class_ta)var8).T * var23.Q / 255;
                           int var14 = var23.S;
                           Class_nc.b(var31, var35, var31 - -var37, var35 + var14);
                           var27.c(var31, var35);
                           Class_nc.c(var2, var4, var1 + var2, var4 + var0);
                        }
                     }

                     int var24 = 0;
                     if (var18 != 0 || var24 < 4) {
                        do {
                           if (~Class_be.C > ~((Class_ta)var8).Ab[var24]) {
                              Class_ph.a(80, var5, var3, var0 >> -1803677215, (Class_ta)var8, var1 >> -57233215, ((Class_ta)var8).a((byte)-121) / 2);
                              if (~Class_od.l < 0) {
                                 if (var24 == 1) {
                                    Class_th.b -= 20;
                                 }

                                 if (var24 == 2) {
                                    Class_od.l -= 15;
                                    Class_th.b -= 10;
                                 }

                                 if (var24 == 3) {
                                    Class_th.b -= 10;
                                    Class_od.l += 15;
                                 }

                                 Class_ob.V[((Class_ta)var8).rb[var24]].c(var2 + Class_od.l + -12, -12 + var4 + Class_th.b);
                                 Class_ma.gb.c(Class_og.b(((Class_ta)var8).ab[var24], 0), -1 + Class_od.l + var2, 3 + Class_th.b + var4, 16777215, 0);
                              }
                           }
                        } while (++var24 < 4);
                     }

                     var7++;
                  }
               } else {
                  var7++;
               }
            } while (~(client.ib + Class_ke.p) < ~var7);
         }

         int var20 = 0;
         if (var6 >= -28) {
            Y = null;
            if (var18 == 0 && var20 >= Class_hd.h) {
               return;
            }
         } else if (var20 >= Class_hd.h) {
            return;
         }

         do {
            int var28 = Class_cg.u[var20];
            int var25 = Class_cg.i[var20];
            int var32 = Class_cg.h[var20];
            int var36 = Class_cg.p[var20];
            boolean var38 = true;
            if (var18 != 0 || var38) {
               do {
                  var38 = false;
                  int var40 = 0;
                  if (var18 != 0 || ~var40 > ~var20) {
                     do {
                        if (~(2 + var28) < ~(Class_cg.u[var40] + -Class_cg.p[var40])
                           && ~(2 + Class_cg.u[var40]) < ~(var28 - var36)
                           && ~(var25 + -var32) > ~(Class_cg.i[var40] - -Class_cg.h[var40])
                           && -Class_cg.h[var40] + Class_cg.i[var40] < var32 + var25
                           && -Class_cg.p[var40] + Class_cg.u[var40] < var28) {
                           var38 = true;
                           var28 = Class_cg.u[var40] + -Class_cg.p[var40];
                        }
                     } while (~(++var40) > ~var20);
                  }
               } while (var38);
            }

            Class_od.l = Class_cg.i[var20];
            Class_th.b = Class_cg.u[var20] = var28;
            Class_r var41 = Class_cg.o[var20];
            if (~Class_ld.gb == -1) {
               int var15 = 16776960;
               if (Class_cg.k[var20] < 6) {
                  var15 = Class_je.j[Class_cg.k[var20]];
               }

               if (Class_cg.k[var20] == 6) {
                  var15 = Class_ad.l % 20 >= 10 ? 16776960 : 16711680;
               }

               if (~Class_cg.k[var20] == -8) {
                  var15 = Class_ad.l % 20 >= 10 ? '\uffff' : 255;
               }

               if (Class_cg.k[var20] == 8) {
                  var15 = Class_ad.l % 20 < 10 ? '\ub000' : 8454016;
               }

               label376:
               if (~Class_cg.k[var20] == -10) {
                  int var16 = -Class_cg.s[var20] + 150;
                  if (~var16 > -51) {
                     var15 = 1280 * var16 + 16711680;
                     if (var18 == 0) {
                        break label376;
                     }
                  }

                  if (var16 < 100) {
                     var15 = 16384000 - 327680 * var16 + 16776960;
                     if (var18 == 0) {
                        break label376;
                     }
                  }

                  if (~var16 > -151) {
                     var15 = 65280 - -((-100 + var16) * 5);
                  }
               }

               if (Class_cg.k[var20] == 10) {
                  int var42 = 150 - Class_cg.s[var20];
                  label364:
                  if (~var42 <= -51) {
                     if (var42 >= 100) {
                        if (var42 >= 150) {
                           break label364;
                        }

                        var15 = 327680 * (var42 - 100) + (255 - var42 * 5 - -500);
                        if (var18 == 0) {
                           break label364;
                        }
                     }

                     var15 = 16384000 - 327680 * var42 + 16711935;
                     if (var18 != 0) {
                        var15 = 16711680 + 5 * var42;
                     }
                  } else {
                     var15 = 16711680 + 5 * var42;
                  }
               }

               if (~Class_cg.k[var20] == -12) {
                  int var43 = 150 + -Class_cg.s[var20];
                  label353:
                  if (var43 >= 50) {
                     if (~var43 <= -101) {
                        if (var43 >= 150) {
                           break label353;
                        }

                        var15 = -(327680 * var43) - -49545215;
                        if (var18 == 0) {
                           break label353;
                        }
                     }

                     var15 = 327685 * var43 + -16318970;
                     if (var18 != 0) {
                        var15 = 16777215 - 327685 * var43;
                     }
                  } else {
                     var15 = 16777215 - 327685 * var43;
                  }
               }

               if (Class_cg.m[var20] == 0) {
                  Class_db.sb.c(var41, Class_od.l + var2, Class_th.b + var4, var15, 0);
               }

               if (~Class_cg.m[var20] == -2) {
                  Class_db.sb.b(var41, Class_od.l + var2, Class_th.b + var4, var15, 0, Class_ad.l);
               }

               if (Class_cg.m[var20] == 2) {
                  Class_db.sb.a(var41, var2 + Class_od.l, Class_th.b + var4, var15, 0, Class_ad.l);
               }

               if (~Class_cg.m[var20] == -4) {
                  Class_db.sb.a(var41, Class_od.l + var2, Class_th.b + var4, var15, 0, Class_ad.l, -Class_cg.s[var20] + 150);
               }

               if (Class_cg.m[var20] == 4) {
                  int var44 = (150 - Class_cg.s[var20]) * (Class_db.sb.c(var41) - -100) / 150;
                  Class_nc.b(var2 + (Class_od.l - 50), var4, var2 - -Class_od.l + 50, var4 + var0);
                  Class_db.sb.b(var41, -var44 + Class_od.l + var2 - -50, var4 - -Class_th.b, var15, 0);
                  Class_nc.c(var2, var4, var1 + var2, var0 + var4);
               }

               if (~Class_cg.m[var20] == -6) {
                  int var45 = 150 - Class_cg.s[var20];
                  Class_nc.b(var2, Class_th.b + var4 + -Class_db.sb.K + -1, var2 - -var1, 5 + (var4 - -Class_th.b));
                  int var17 = 0;
                  if (var45 >= 25) {
                     if (~var45 < -126) {
                        var17 = -125 + var45;
                        if (var18 != 0) {
                           var17 = -25 + var45;
                        }
                     }
                  } else {
                     var17 = -25 + var45;
                  }

                  Class_db.sb.c(var41, var2 - -Class_od.l, var17 + Class_th.b + var4, var15, 0);
                  Class_nc.c(var2, var4, var1 + var2, var4 + var0);
                  if (var18 != 0) {
                     Class_db.sb.c(var41, var2 + Class_od.l, Class_th.b + var4, 16776960, 0);
                     var20++;
                  } else {
                     var20++;
                  }
               } else {
                  var20++;
               }
            } else {
               Class_db.sb.c(var41, var2 + Class_od.l, Class_th.b + var4, 16776960, 0);
               var20++;
            }
         } while (var20 < Class_hd.h);
      } catch (RuntimeException var19) {
         throw Class_sh.a(var19, "wi.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
      }
   }

   static final void d(int var0, int var1, int var2) {
      try {
         Class_mb.j++;
         if (var2 != 327685) {
            Y = null;
         }

         ib++;
         Class_cj.S.o(119, 63);
         Class_cj.S.c((byte)19, var0);
         Class_cj.S.d((byte)127, var1);
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "wi.F(" + var0 + ',' + var1 + ',' + var2 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private final void h(int var1) {
      int var4 = client.lb;

      try {
         if (var1 != -1632225748) {
            this.jb = null;
         }

         Random var2 = new Random(this.X);
         this.Z = new short[512];
         if (~this.bb < -1) {
            int var3 = 0;
            if (var4 != 0 || var3 < 512) {
               do {
                  this.Z[var3] = (short)Class_jb.a(this.bb, (byte)70, var2);
               } while (++var3 < 512);
            }
         }

         Q++;
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "wi.E(" + var1 + ')');
      }
   }

   static final void b(int var0, int var1) {
      try {
         if (var0 >= -99) {
            Y = null;
         }

         Class_ic var2 = Class_ka.a(var1, 2, (byte)-121);
         fb++;
         var2.c((byte)-87);
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "wi.J(" + var0 + ',' + var1 + ')');
      }
   }
}
