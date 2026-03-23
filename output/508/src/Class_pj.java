final class Class_pj {
   static int a;
   static Class_qc b = new Class_qc(5);
   static int c = 0;
   static int d;
   static Class_r e = Class_tc.a(43, "<)4col>");
   static int f;
   static int[] g;
   static Class_jb h;
   static int[] i = new int[]{
      0,
      1,
      3,
      7,
      15,
      31,
      63,
      127,
      255,
      511,
      1023,
      2047,
      4095,
      8191,
      16383,
      32767,
      65535,
      131071,
      262143,
      524287,
      1048575,
      2097151,
      4194303,
      8388607,
      16777215,
      33554431,
      67108863,
      134217727,
      268435455,
      536870911,
      1073741823,
      2147483647,
      -1
   };

   public static void a(byte var0) {
      try {
         if (var0 > 61) {
            g = null;
            b = null;
            i = null;
            e = null;
            h = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "pj.B(" + var0 + ')');
      }
   }

   static final void a(boolean var0, int var1, int var2, int var3, Class_lh var4, int var5, int var6, byte var7, int var8) {
      int var11 = client.lb;

      try {
         label117: {
            d++;
            if (~var1 > -1 || ~var1 <= -105 || var8 < 0 || var8 >= 104) {
               while (true) {
                  int var9 = var4.n(-6677);
                  if (~var9 != -1) {
                     if (var9 == 1) {
                        var4.n(-6677);
                        if (var11 == 0) {
                           break label117;
                        }
                     }

                     if (var9 > 49) {
                        continue;
                     }

                     var4.n(-6677);
                     if (var11 == 0) {
                        continue;
                     }
                  }

                  if (var11 == 0) {
                     break label117;
                  }
                  break;
               }
            }

            if (!var0) {
               Class_kk.c[var5][var1][var8] = 0;
            }

            while (true) {
               int var13 = var4.n(-6677);
               if (var13 == 0) {
                  if (var0) {
                     Class_mi.U[0][var1][var8] = Class_mg.l[0][var1][var8];
                     if (var11 == 0) {
                        break;
                     }
                  }

                  if (var5 != 0) {
                     Class_mi.U[var5][var1][var8] = Class_mi.U[-1 + var5][var1][var8] - 240;
                     if (var11 == 0) {
                        break;
                     }
                  }

                  Class_mi.U[0][var1][var8] = 8 * -Class_vi.a(var8 + 556238 + var3, true, var2 + (932731 - -var1));
                  if (var11 == 0) {
                     break;
                  }
               }

               if (var13 == 1) {
                  int var10 = var4.n(-6677);
                  if (!var0) {
                     if (var10 == 1) {
                        var10 = 0;
                     }

                     if (~var5 == -1) {
                        Class_mi.U[0][var1][var8] = -var10 * 8;
                        if (var11 == 0) {
                           break;
                        }
                     }

                     Class_mi.U[var5][var1][var8] = -(var10 * 8) + Class_mi.U[-1 + var5][var1][var8];
                     if (var11 == 0) {
                        break;
                     }
                  }

                  Class_mi.U[0][var1][var8] = Class_mg.l[0][var1][var8] + 8 * var10;
                  if (var11 == 0) {
                     break;
                  }
               }

               if (~var13 >= -50) {
                  Class_va.cb[var5][var1][var8] = var4.o(3390);
                  Class_sj.n[var5][var1][var8] = (byte)((var13 - 2) / 4);
                  Class_oc.h[var5][var1][var8] = (byte)Class_ui.a(3, var13 + -2 + var6);
                  if (var11 == 0) {
                     continue;
                  }
               }

               if (var13 <= 81) {
                  if (var0) {
                     continue;
                  }

                  Class_kk.c[var5][var1][var8] = (byte)(var13 - 49);
                  if (var11 == 0) {
                     continue;
                  }
               }

               Class_id.v[var5][var1][var8] = (byte)(-81 + var13);
               if (var11 != 0) {
                  break;
               }
            }
         }

         if (var7 <= 25) {
            a(-35, (byte)-31);
         }
      } catch (RuntimeException var12) {
         throw Class_sh.a(
            var12,
            "pj.C("
               + var0
               + ','
               + var1
               + ','
               + var2
               + ','
               + var3
               + ','
               + (var4 != null ? "{...}" : "null")
               + ','
               + var5
               + ','
               + var6
               + ','
               + var7
               + ','
               + var8
               + ')'
         );
      }
   }

   static final boolean a(int var0, byte var1) {
      try {
         if (var1 > -112) {
            return false;
         } else {
            f++;
            return ~(1 & var0 >> -245386763) != -1;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "pj.D(" + var0 + ',' + var1 + ')');
      }
   }

   static final int a(boolean param0, int param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic client.lb I
      // 03: istore 9
      // 05: getstatic Class_f.X LClass_tg;
      // 08: iload 2
      // 09: i2l
      // 0a: bipush -60
      // 0c: invokevirtual Class_tg.a (JI)LClass_li;
      // 0f: checkcast Class_qd
      // 12: astore 4
      // 14: getstatic Class_pj.a I
      // 17: bipush 1
      // 18: iadd
      // 19: putstatic Class_pj.a I
      // 1c: aload 4
      // 1e: ifnonnull 23
      // 21: bipush 0
      // 22: ireturn
      // 23: bipush 0
      // 24: istore 5
      // 26: iload 3
      // 27: istore 6
      // 29: iload 9
      // 2b: ifeq a2
      // 2e: aload 4
      // 30: getfield Class_qd.B [I
      // 33: iload 6
      // 35: iaload
      // 36: iflt 9f
      // 39: getstatic Class_bi.j I
      // 3c: bipush -1
      // 3d: ixor
      // 3e: aload 4
      // 40: getfield Class_qd.B [I
      // 43: iload 6
      // 45: iaload
      // 46: bipush -1
      // 47: ixor
      // 48: if_icmpge 9f
      // 4b: sipush -25672
      // 4e: aload 4
      // 50: getfield Class_qd.B [I
      // 53: iload 6
      // 55: iaload
      // 56: invokestatic Class_ra.a (II)LClass_cf;
      // 59: astore 7
      // 5b: aload 7
      // 5d: getfield Class_cf.pb LClass_tg;
      // 60: ifnull 9f
      // 63: aload 7
      // 65: getfield Class_cf.pb LClass_tg;
      // 68: iload 1
      // 69: i2l
      // 6a: bipush -103
      // 6c: invokevirtual Class_tg.a (JI)LClass_li;
      // 6f: checkcast Class_kg
      // 72: astore 8
      // 74: aload 8
      // 76: ifnull 9f
      // 79: iload 0
      // 7a: ifne 8c
      // 7d: iload 5
      // 7f: aload 8
      // 81: getfield Class_kg.r I
      // 84: iadd
      // 85: istore 5
      // 87: iload 9
      // 89: ifeq 9f
      // 8c: iload 5
      // 8e: aload 4
      // 90: getfield Class_qd.y [I
      // 93: iload 6
      // 95: iaload
      // 96: aload 8
      // 98: getfield Class_kg.r I
      // 9b: imul
      // 9c: iadd
      // 9d: istore 5
      // 9f: iinc 6 1
      // a2: aload 4
      // a4: getfield Class_qd.B [I
      // a7: arraylength
      // a8: iload 6
      // aa: if_icmpgt 2e
      // ad: iload 5
      // af: ireturn
      // b0: astore 4
      // b2: aload 4
      // b4: new java/lang/StringBuffer
      // b7: dup
      // b8: ldc "pj.A("
      // ba: invokespecial java/lang/StringBuffer.<init> (Ljava/lang/String;)V
      // bd: iload 0
      // be: invokevirtual java/lang/StringBuffer.append (Z)Ljava/lang/StringBuffer;
      // c1: bipush 44
      // c3: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // c6: iload 1
      // c7: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // ca: bipush 44
      // cc: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // cf: iload 2
      // d0: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // d3: bipush 44
      // d5: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // d8: iload 3
      // d9: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // dc: bipush 41
      // de: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // e1: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // e4: invokestatic Class_sh.a (Ljava/lang/Throwable;Ljava/lang/String;)LClass_ua;
      // e7: athrow
      return 0;
   }
}
