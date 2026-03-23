final class Class_oa implements Runnable {
   static int a;
   static Class_sg b;
   boolean c = true;
   static int d;
   static int e = -1;
   static Class_r f = Class_oa.k;
   static Class_cj g;
   static Class_r h = Class_tc.a(43, " loggt sich ein)3");
   static Class_r i = Class_tc.a(43, "Versteckt");
   static int j = 0;
   private static Class_r k = Class_tc.a(43, "Unable to find ");
   static int l;
   Object m = new Object();
   int[] n = new int[500];
   int o;
   int[] p = new int[500];

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(int var0, Class_dh var1) {
      int var12 = client.lb;

      try {
         short var2 = 256;
         int var3 = 0;
         if (var12 != 0) {
            Class_fe.I[var3] = 0;
            var3++;
         }

         while (Class_fe.I.length > var3) {
            Class_fe.I[var3] = 0;
            var3++;
         }

         l++;
         if (var0 < 72) {
            g = null;
         }

         int var4 = 0;
         if (var12 != 0 || var4 < 5000) {
            do {
               int var5 = (int)(128.0 * Math.random() * var2);
               Class_fe.I[var5] = (int)(284.0 * Math.random());
            } while (++var4 < 5000);
         }

         int var14 = 0;
         if (var12 != 0 || ~var14 > -21) {
            do {
               label136: {
                  int var6 = 1;
                  int var7;
                  if (var12 != 0) {
                     var7 = 1;
                     if (var12 != 0) {
                        int var8 = (var6 << -468912249) + var7;
                        Class_oi.C[var8] = (Class_fe.I[var8 + -1] + Class_fe.I[var8 - -1] + Class_fe.I[-128 + var8] + Class_fe.I[var8 + 128]) / 4;
                        var7++;
                     }
                  } else {
                     if (-1 + var2 <= var6) {
                        break label136;
                     }

                     var7 = 1;
                     if (var12 != 0) {
                        int var20 = (var6 << -468912249) + var7;
                        Class_oi.C[var20] = (Class_fe.I[var20 + -1] + Class_fe.I[var20 - -1] + Class_fe.I[-128 + var20] + Class_fe.I[var20 + 128]) / 4;
                        var7++;
                     }
                  }

                  while (true) {
                     while (~var7 > -128) {
                        int var21 = (var6 << -468912249) + var7;
                        Class_oi.C[var21] = (Class_fe.I[var21 + -1] + Class_fe.I[var21 - -1] + Class_fe.I[-128 + var21] + Class_fe.I[var21 + 128]) / 4;
                        var7++;
                     }

                     if (-1 + var2 <= ++var6) {
                        break;
                     }

                     var7 = 1;
                     if (var12 != 0) {
                        int var22 = (var6 << -468912249) + var7;
                        Class_oi.C[var22] = (Class_fe.I[var22 + -1] + Class_fe.I[var22 - -1] + Class_fe.I[-128 + var22] + Class_fe.I[var22 + 128]) / 4;
                        var7++;
                     }
                  }
               }

               int[] var17 = Class_fe.I;
               Class_fe.I = Class_oi.C;
               Class_oi.C = var17;
            } while (~(++var14) > -21);

            if (var1 != null) {
               int var15 = 0;
               int var18 = 0;
               if (var12 != 0 || ~var18 > ~var1.o) {
                  do {
                     int var23 = 0;
                     if (var12 != 0 || ~var1.p < ~var23) {
                        do {
                           if (var1.r[var15++] != 0) {
                              int var9 = var1.n + 16 + var23;
                              int var10 = var18 + 16 + var1.l;
                              int var11 = var9 - -(var10 << 453988551);
                              Class_fe.I[var11] = 0;
                           }
                        } while (~var1.p < ~(++var23));
                     }
                  } while (~(++var18) > ~var1.o);
               }
            }
         } else if (var1 != null) {
            int var16 = 0;
            int var19 = 0;
            if (var12 != 0 || ~var19 > ~var1.o) {
               do {
                  int var24 = 0;
                  if (var12 != 0 || ~var1.p < ~var24) {
                     do {
                        if (var1.r[var16++] != 0) {
                           int var25 = var1.n + 16 + var24;
                           int var26 = var19 + 16 + var1.l;
                           int var27 = var25 - -(var26 << 453988551);
                           Class_fe.I[var27] = 0;
                        }
                     } while (~var1.p < ~(++var24));
                  }
               } while (~(++var19) > ~var1.o);
            }
         }
      } catch (RuntimeException var13) {
         throw Class_sh.a(var13, "oa.A(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   public final void run() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic client.lb I
      // 03: istore 2
      // 04: getstatic Class_oa.d I
      // 07: bipush 1
      // 08: iadd
      // 09: putstatic Class_oa.d I
      // 0c: iload 2
      // 0d: ifeq 53
      // 10: aload 0
      // 11: getfield Class_oa.m Ljava/lang/Object;
      // 14: astore 1
      // 15: aload 1
      // 16: monitorenter
      // 17: aload 0
      // 18: getfield Class_oa.o I
      // 1b: sipush 500
      // 1e: if_icmpge 43
      // 21: aload 0
      // 22: getfield Class_oa.n [I
      // 25: aload 0
      // 26: getfield Class_oa.o I
      // 29: getstatic Class_pj.c I
      // 2c: iastore
      // 2d: aload 0
      // 2e: getfield Class_oa.p [I
      // 31: aload 0
      // 32: getfield Class_oa.o I
      // 35: getstatic Class_bh.k I
      // 38: iastore
      // 39: aload 0
      // 3a: dup
      // 3b: getfield Class_oa.o I
      // 3e: bipush 1
      // 3f: iadd
      // 40: putfield Class_oa.o I
      // 43: aload 1
      // 44: monitorexit
      // 45: goto 4b
      // 48: aload 1
      // 49: monitorexit
      // 4a: athrow
      // 4b: bipush -5
      // 4d: ldc2_w 50
      // 50: invokestatic Class_hg.a (IJ)V
      // 53: aload 0
      // 54: getfield Class_oa.c Z
      // 57: ifne 10
      // 5a: return
      // 5b: astore 1
      // 5c: aload 1
      // 5d: new java/lang/StringBuffer
      // 60: dup
      // 61: ldc "oa.run("
      // 63: invokespecial java/lang/StringBuffer.<init> (Ljava/lang/String;)V
      // 66: bipush 41
      // 68: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 6b: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 6e: invokestatic Class_sh.a (Ljava/lang/Throwable;Ljava/lang/String;)LClass_ua;
      // 71: athrow
   }

   public static void a(byte var0) {
      try {
         b = null;
         i = null;
         h = null;
         k = null;
         if (var0 == -127) {
            f = null;
            g = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "oa.B(" + var0 + ')');
      }
   }

   static final void a(int var0, int var1, int var2, byte var3, int var4, int var5) {
      try {
         if (var3 >= 48) {
            label24: {
               if (~Class_ga.v >= ~var2 && ~var4 >= ~Class_tg.r && var0 >= Class_ff.d && ~var5 >= ~Class_hh.h) {
                  Class_rf.a(var0, true, var5, var4, var2, var1);
                  if (client.lb == 0) {
                     break label24;
                  }
               }

               Class_vb.a(var0, var5, var4, var2, -115, var1);
            }

            a++;
         }
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "oa.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ')');
      }
   }

   public Class_oa() {
      this.o = 0;
   }
}
