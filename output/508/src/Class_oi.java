final class Class_oi extends Class_li {
   static int p;
   static Class_r q = Class_tc.a(43, " (X");
   int r;
   static int s;
   static Class_dh[] t;
   static boolean u = false;
   static int v;
   static int w;
   Class_r x;
   static int y;
   byte z;
   Class_r A;
   static int[] C;
   static int D;

   static final Class_r a(int var0, Class_lh var1) {
      try {
         y++;
         int var2 = 19 % ((-21 - var0) / 37);
         return Class_f.a(0, var1, 32767);
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "oi.D(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final int a(int var0, int var1, int var2) {
      int var4 = client.lb;

      try {
         if (var2 < 65) {
            return 23;
         } else {
            int var3 = 1;
            D++;
            if (var4 == 0 && ~var0 >= -2) {
               return ~var0 == -2 ? var3 * var1 : var3;
            } else {
               do {
                  if (~(var0 & 1) != -1) {
                     var3 *= var1;
                  }

                  var0 >>= 1;
                  var1 *= var1;
               } while (~var0 < -2);

               return ~var0 == -2 ? var3 * var1 : var3;
            }
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "oi.B(" + var0 + 44 + var1 + 44 + var2 + 41);
      }
   }

   public static void a(boolean var0) {
      try {
         t = null;
         q = null;
         if (var0) {
            C = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "oi.C(" + var0 + ')');
      }
   }

   static final void a(int param0, int param1, int param2, Class_ha[] param3, int param4, int param5, int param6, int param7, int param8, int param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.OutOfMemoryError: Java heap space
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.Statement.getNeighbours(Statement.java:735)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.findGeneralStatement(DomHelper.java:635)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.processStatement(DomHelper.java:472)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.processStatement(DomHelper.java:477)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.processStatement(DomHelper.java:379)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:208)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 0000: getstatic client.lb I
      // 0003: istore 33
      // 0005: iload 6
      // 0007: iload 2
      // 0008: iload 4
      // 000a: iload 0
      // 000b: invokestatic Class_nc.c (IIII)V
      // 000e: invokestatic Class_kd.d ()V
      // 0011: iload 1
      // 0012: sipush -21644
      // 0015: if_icmpeq 0019
      // 0018: return
      // 0019: getstatic Class_oi.p I
      // 001c: bipush 1
      // 001d: iadd
      // 001e: putstatic Class_oi.p I
      // 0021: bipush 0
      // 0022: istore 10
      // 0024: iload 33
      // 0026: ifeq 15e1
      // 0029: aload 3
      // 002a: iload 10
      // 002c: aaload
      // 002d: astore 11
      // 002f: aload 11
      // 0031: ifnull 15de
      // 0034: iload 8
      // 0036: bipush -1
      // 0037: ixor
      // 0038: aload 11
      // 003a: getfield Class_ha.R I
      // 003d: bipush -1
      // 003e: ixor
      // 003f: if_icmpeq 0056
      // 0042: iload 8
      // 0044: ldc -1412584499
      // 0046: if_icmpne 15de
      // 0049: aload 11
      // 004b: getstatic Class_ff.e LClass_ha;
      // 004e: if_acmpeq 0056
      // 0051: iload 33
      // 0053: ifeq 15de
      // 0056: iload 5
      // 0058: bipush -1
      // 0059: if_icmpne 00a2
      // 005c: getstatic Class_sd.f [I
      // 005f: getstatic Class_jd.c I
      // 0062: iload 9
      // 0064: aload 11
      // 0066: getfield Class_ha.hb I
      // 0069: iadd
      // 006a: iastore
      // 006b: getstatic Class_mc.g [I
      // 006e: getstatic Class_jd.c I
      // 0071: aload 11
      // 0073: getfield Class_ha.Rc I
      // 0076: iload 7
      // 0078: iadd
      // 0079: iastore
      // 007a: getstatic Class_cf.X [I
      // 007d: getstatic Class_jd.c I
      // 0080: aload 11
      // 0082: getfield Class_ha.Gc I
      // 0085: iastore
      // 0086: getstatic Class_fa.pc [I
      // 0089: getstatic Class_jd.c I
      // 008c: aload 11
      // 008e: getfield Class_ha.nc I
      // 0091: iastore
      // 0092: getstatic Class_jd.c I
      // 0095: dup
      // 0096: bipush 1
      // 0097: iadd
      // 0098: putstatic Class_jd.c I
      // 009b: istore 12
      // 009d: iload 33
      // 009f: ifeq 00a6
      // 00a2: iload 5
      // 00a4: istore 12
      // 00a6: aload 11
      // 00a8: getstatic Class_be.C I
      // 00ab: putfield Class_ha.ac I
      // 00ae: aload 11
      // 00b0: iload 12
      // 00b2: putfield Class_ha.Qc I
      // 00b5: aload 11
      // 00b7: getfield Class_ha.dc Z
      // 00ba: ifeq 00c5
      // 00bd: aload 11
      // 00bf: invokestatic client.c (LClass_ha;)Z
      // 00c2: ifne 15de
      // 00c5: aload 11
      // 00c7: getfield Class_ha.ab I
      // 00ca: ifle 00d5
      // 00cd: sipush 30341
      // 00d0: aload 11
      // 00d2: invokestatic Class_pb.a (ILClass_ha;)V
      // 00d5: aload 11
      // 00d7: getfield Class_ha.hb I
      // 00da: iload 9
      // 00dc: ineg
      // 00dd: isub
      // 00de: istore 13
      // 00e0: aload 11
      // 00e2: getfield Class_ha.t I
      // 00e5: istore 15
      // 00e7: iload 7
      // 00e9: aload 11
      // 00eb: getfield Class_ha.Rc I
      // 00ee: iadd
      // 00ef: istore 14
      // 00f1: getstatic Class_pe.E Z
      // 00f4: ifeq 0112
      // 00f7: aload 11
      // 00f9: invokestatic client.b (LClass_ha;)I
      // 00fc: ifne 0107
      // 00ff: aload 11
      // 0101: getfield Class_ha.Kc I
      // 0104: ifne 0112
      // 0107: iload 15
      // 0109: bipush 127
      // 010b: if_icmple 0112
      // 010e: bipush 127
      // 0110: istore 15
      // 0112: getstatic Class_ff.e LClass_ha;
      // 0115: aload 11
      // 0117: if_acmpne 01e8
      // 011a: iload 8
      // 011c: ldc -1412584499
      // 011e: if_icmpeq 013c
      // 0121: aload 11
      // 0123: getfield Class_ha.k Z
      // 0126: ifne 013c
      // 0129: iload 7
      // 012b: putstatic Class_vb.h I
      // 012e: iload 9
      // 0130: putstatic Class_dc.s I
      // 0133: aload 3
      // 0134: putstatic Class_sb.e [LClass_ha;
      // 0137: iload 33
      // 0139: ifeq 15de
      // 013c: getstatic Class_bj.d Z
      // 013f: ifeq 01db
      // 0142: getstatic Class_nf.J Z
      // 0145: ifeq 01db
      // 0148: getstatic Class_bh.k I
      // 014b: istore 17
      // 014d: iload 17
      // 014f: getstatic Class_jf.a I
      // 0152: isub
      // 0153: istore 17
      // 0155: iload 17
      // 0157: getstatic Class_tg.c I
      // 015a: if_icmpge 0162
      // 015d: getstatic Class_tg.c I
      // 0160: istore 17
      // 0162: getstatic Class_pj.c I
      // 0165: istore 16
      // 0167: iload 16
      // 0169: getstatic Class_oj.W I
      // 016c: isub
      // 016d: istore 16
      // 016f: getstatic Class_vh.nb I
      // 0172: bipush -1
      // 0173: ixor
      // 0174: iload 16
      // 0176: bipush -1
      // 0177: ixor
      // 0178: if_icmpge 0180
      // 017b: getstatic Class_vh.nb I
      // 017e: istore 16
      // 0180: getstatic Class_ka.mb LClass_ha;
      // 0183: getfield Class_ha.Gc I
      // 0186: getstatic Class_vh.nb I
      // 0189: iadd
      // 018a: aload 11
      // 018c: getfield Class_ha.Gc I
      // 018f: iload 16
      // 0191: iadd
      // 0192: if_icmpge 01a8
      // 0195: getstatic Class_ka.mb LClass_ha;
      // 0198: getfield Class_ha.Gc I
      // 019b: getstatic Class_vh.nb I
      // 019e: aload 11
      // 01a0: getfield Class_ha.Gc I
      // 01a3: ineg
      // 01a4: iadd
      // 01a5: iadd
      // 01a6: istore 16
      // 01a8: iload 16
      // 01aa: istore 13
      // 01ac: getstatic Class_tg.c I
      // 01af: getstatic Class_ka.mb LClass_ha;
      // 01b2: getfield Class_ha.nc I
      // 01b5: iadd
      // 01b6: bipush -1
      // 01b7: ixor
      // 01b8: iload 17
      // 01ba: aload 11
      // 01bc: getfield Class_ha.nc I
      // 01bf: iadd
      // 01c0: bipush -1
      // 01c1: ixor
      // 01c2: if_icmple 01d7
      // 01c5: getstatic Class_tg.c I
      // 01c8: getstatic Class_ka.mb LClass_ha;
      // 01cb: getfield Class_ha.nc I
      // 01ce: aload 11
      // 01d0: getfield Class_ha.nc I
      // 01d3: isub
      // 01d4: iadd
      // 01d5: istore 17
      // 01d7: iload 17
      // 01d9: istore 14
      // 01db: aload 11
      // 01dd: getfield Class_ha.k Z
      // 01e0: ifne 01e8
      // 01e3: sipush 128
      // 01e6: istore 15
      // 01e8: aload 11
      // 01ea: getfield Class_ha.Kc I
      // 01ed: bipush 2
      // 01ee: if_icmpne 0204
      // 01f1: iload 6
      // 01f3: istore 16
      // 01f5: iload 0
      // 01f6: istore 19
      // 01f8: iload 2
      // 01f9: istore 17
      // 01fb: iload 4
      // 01fd: istore 18
      // 01ff: iload 33
      // 0201: ifeq 0273
      // 0204: iload 13
      // 0206: iload 6
      // 0208: if_icmpgt 0210
      // 020b: iload 6
      // 020d: goto 0212
      // 0210: iload 13
      // 0212: istore 16
      // 0214: iload 14
      // 0216: bipush -1
      // 0217: ixor
      // 0218: iload 2
      // 0219: bipush -1
      // 021a: ixor
      // 021b: if_icmplt 0222
      // 021e: iload 2
      // 021f: goto 0224
      // 0222: iload 14
      // 0224: istore 17
      // 0226: aload 11
      // 0228: getfield Class_ha.Gc I
      // 022b: iload 13
      // 022d: iadd
      // 022e: istore 20
      // 0230: iload 14
      // 0232: aload 11
      // 0234: getfield Class_ha.nc I
      // 0237: ineg
      // 0238: isub
      // 0239: istore 21
      // 023b: aload 11
      // 023d: getfield Class_ha.Kc I
      // 0240: bipush -1
      // 0241: ixor
      // 0242: bipush -10
      // 0244: if_icmpne 024d
      // 0247: iinc 21 1
      // 024a: iinc 20 1
      // 024d: iload 0
      // 024e: bipush -1
      // 024f: ixor
      // 0250: iload 21
      // 0252: bipush -1
      // 0253: ixor
      // 0254: if_icmplt 025b
      // 0257: iload 0
      // 0258: goto 025d
      // 025b: iload 21
      // 025d: istore 19
      // 025f: iload 20
      // 0261: bipush -1
      // 0262: ixor
      // 0263: iload 4
      // 0265: bipush -1
      // 0266: ixor
      // 0267: if_icmple 026f
      // 026a: iload 20
      // 026c: goto 0271
      // 026f: iload 4
      // 0271: istore 18
      // 0273: aload 11
      // 0275: getfield Class_ha.dc Z
      // 0278: ifeq 0292
      // 027b: iload 16
      // 027d: bipush -1
      // 027e: ixor
      // 027f: iload 18
      // 0281: bipush -1
      // 0282: ixor
      // 0283: if_icmple 15de
      // 0286: iload 17
      // 0288: iload 19
      // 028a: if_icmplt 0292
      // 028d: iload 33
      // 028f: ifeq 15de
      // 0292: aload 11
      // 0294: getfield Class_ha.ab I
      // 0297: ifeq 04da
      // 029a: aload 11
      // 029c: getfield Class_ha.ab I
      // 029f: bipush -1
      // 02a0: ixor
      // 02a1: sipush -1338
      // 02a4: if_icmpne 02e8
      // 02a7: iload 13
      // 02a9: putstatic Class_ai.F I
      // 02ac: iload 14
      // 02ae: putstatic Class_c.x I
      // 02b1: aload 11
      // 02b3: putstatic Class_w.S LClass_ha;
      // 02b6: iload 14
      // 02b8: aload 11
      // 02ba: getfield Class_ha.Gc I
      // 02bd: bipush 0
      // 02be: iload 13
      // 02c0: aload 11
      // 02c2: getfield Class_ha.ab I
      // 02c5: bipush -1
      // 02c6: ixor
      // 02c7: sipush -1404
      // 02ca: if_icmpeq 02d1
      // 02cd: bipush 0
      // 02ce: goto 02d2
      // 02d1: bipush 1
      // 02d2: aload 11
      // 02d4: getfield Class_ha.nc I
      // 02d7: invokestatic Class_se.a (IIZIZI)V
      // 02da: iload 6
      // 02dc: iload 2
      // 02dd: iload 4
      // 02df: iload 0
      // 02e0: invokestatic Class_nc.c (IIII)V
      // 02e3: iload 33
      // 02e5: ifeq 15de
      // 02e8: aload 11
      // 02ea: getfield Class_ha.ab I
      // 02ed: sipush 1338
      // 02f0: if_icmpne 0319
      // 02f3: aload 11
      // 02f5: sipush 2663
      // 02f8: invokevirtual Class_ha.a (I)Z
      // 02fb: ifeq 15de
      // 02fe: aload 11
      // 0300: iload 13
      // 0302: iload 14
      // 0304: iload 12
      // 0306: bipush -101
      // 0308: invokestatic Class_hc.a (LClass_ha;IIIB)V
      // 030b: iload 6
      // 030d: iload 2
      // 030e: iload 4
      // 0310: iload 0
      // 0311: invokestatic Class_nc.c (IIII)V
      // 0314: iload 33
      // 0316: ifeq 15de
      // 0319: aload 11
      // 031b: getfield Class_ha.ab I
      // 031e: sipush 1339
      // 0321: if_icmpne 034a
      // 0324: aload 11
      // 0326: sipush 2663
      // 0329: invokevirtual Class_ha.a (I)Z
      // 032c: ifeq 15de
      // 032f: iload 14
      // 0331: iload 12
      // 0333: bipush -123
      // 0335: aload 11
      // 0337: iload 13
      // 0339: invokestatic Class_b.a (IIBLClass_ha;I)V
      // 033c: iload 6
      // 033e: iload 2
      // 033f: iload 4
      // 0341: iload 0
      // 0342: invokestatic Class_nc.c (IIII)V
      // 0345: iload 33
      // 0347: ifeq 15de
      // 034a: aload 11
      // 034c: getfield Class_ha.ab I
      // 034f: bipush -1
      // 0350: ixor
      // 0351: sipush -1401
      // 0354: if_icmpne 0386
      // 0357: iload 14
      // 0359: bipush 51
      // 035b: aload 11
      // 035d: getfield Class_ha.nc I
      // 0360: aload 11
      // 0362: getfield Class_ha.Gc I
      // 0365: iload 13
      // 0367: invokestatic Class_pa.a (IBIII)V
      // 036a: getstatic Class_vb.j [Z
      // 036d: iload 12
      // 036f: bipush 1
      // 0370: bastore
      // 0371: getstatic Class_n.u [Z
      // 0374: iload 12
      // 0376: bipush 1
      // 0377: bastore
      // 0378: iload 6
      // 037a: iload 2
      // 037b: iload 4
      // 037d: iload 0
      // 037e: invokestatic Class_nc.c (IIII)V
      // 0381: iload 33
      // 0383: ifeq 15de
      // 0386: aload 11
      // 0388: getfield Class_ha.ab I
      // 038b: sipush 1401
      // 038e: if_icmpne 03bf
      // 0391: iload 14
      // 0393: aload 11
      // 0395: getfield Class_ha.nc I
      // 0398: aload 11
      // 039a: getfield Class_ha.Gc I
      // 039d: iload 13
      // 039f: bipush 1
      // 03a0: invokestatic Class_ff.a (IIIIZ)V
      // 03a3: getstatic Class_vb.j [Z
      // 03a6: iload 12
      // 03a8: bipush 1
      // 03a9: bastore
      // 03aa: getstatic Class_n.u [Z
      // 03ad: iload 12
      // 03af: bipush 1
      // 03b0: bastore
      // 03b1: iload 6
      // 03b3: iload 2
      // 03b4: iload 4
      // 03b6: iload 0
      // 03b7: invokestatic Class_nc.c (IIII)V
      // 03ba: iload 33
      // 03bc: ifeq 15de
      // 03bf: aload 11
      // 03c1: getfield Class_ha.ab I
      // 03c4: sipush 1402
      // 03c7: if_icmpne 03e6
      // 03ca: iload 14
      // 03cc: iload 13
      // 03ce: bipush 95
      // 03d0: invokestatic Class_mc.a (III)V
      // 03d3: getstatic Class_vb.j [Z
      // 03d6: iload 12
      // 03d8: bipush 1
      // 03d9: bastore
      // 03da: getstatic Class_n.u [Z
      // 03dd: iload 12
      // 03df: bipush 1
      // 03e0: bastore
      // 03e1: iload 33
      // 03e3: ifeq 15de
      // 03e6: aload 11
      // 03e8: getfield Class_ha.ab I
      // 03eb: bipush -1
      // 03ec: ixor
      // 03ed: sipush -1405
      // 03f0: if_icmpne 0421
      // 03f3: bipush -38
      // 03f5: iload 14
      // 03f7: getstatic Class_db.sb LClass_af;
      // 03fa: getstatic Class_ma.gb LClass_af;
      // 03fd: aload 11
      // 03ff: getfield Class_ha.Gc I
      // 0402: aload 11
      // 0404: getfield Class_ha.nc I
      // 0407: iload 13
      // 0409: aload 11
      // 040b: invokestatic Class_ea.a (BILClass_af;LClass_af;IIILClass_ha;)V
      // 040e: getstatic Class_vb.j [Z
      // 0411: iload 12
      // 0413: bipush 1
      // 0414: bastore
      // 0415: getstatic Class_n.u [Z
      // 0418: iload 12
      // 041a: bipush 1
      // 041b: bastore
      // 041c: iload 33
      // 041e: ifeq 15de
      // 0421: aload 11
      // 0423: getfield Class_ha.ab I
      // 0426: sipush 1405
      // 0429: if_icmpne 04da
      // 042c: getstatic Class_qd.r Z
      // 042f: ifeq 15de
      // 0432: iload 13
      // 0434: aload 11
      // 0436: getfield Class_ha.Gc I
      // 0439: iadd
      // 043a: istore 20
      // 043c: iload 14
      // 043e: bipush 15
      // 0440: iadd
      // 0441: istore 21
      // 0443: getstatic Class_fi.A LClass_af;
      // 0446: bipush 2
      // 0447: bipush 2
      // 0448: anewarray 321
      // 044b: dup
      // 044c: bipush 0
      // 044d: getstatic Class_cf.rb LClass_r;
      // 0450: aastore
      // 0451: dup
      // 0452: bipush 1
      // 0453: getstatic Class_fd.g I
      // 0456: bipush 0
      // 0457: invokestatic Class_og.b (II)LClass_r;
      // 045a: aastore
      // 045b: invokestatic Class_o.a (I[LClass_r;)LClass_r;
      // 045e: iload 20
      // 0460: iload 21
      // 0462: ldc_w 16776960
      // 0465: bipush -1
      // 0466: invokevirtual Class_af.a (LClass_r;IIII)V
      // 0469: iinc 21 15
      // 046c: invokestatic java/lang/Runtime.getRuntime ()Ljava/lang/Runtime;
      // 046f: astore 22
      // 0471: aload 22
      // 0473: invokevirtual java/lang/Runtime.totalMemory ()J
      // 0476: aload 22
      // 0478: invokevirtual java/lang/Runtime.freeMemory ()J
      // 047b: lneg
      // 047c: ladd
      // 047d: ldc2_w 1024
      // 0480: ldiv
      // 0481: l2i
      // 0482: istore 23
      // 0484: ldc_w 16776960
      // 0487: istore 24
      // 0489: iload 23
      // 048b: ldc_w 65536
      // 048e: if_icmple 0496
      // 0491: ldc_w 16711680
      // 0494: istore 24
      // 0496: getstatic Class_fi.A LClass_af;
      // 0499: bipush 2
      // 049a: bipush 3
      // 049b: anewarray 321
      // 049e: dup
      // 049f: bipush 0
      // 04a0: getstatic Class_jd.h LClass_r;
      // 04a3: aastore
      // 04a4: dup
      // 04a5: bipush 1
      // 04a6: iload 23
      // 04a8: iload 1
      // 04a9: sipush -21644
      // 04ac: ixor
      // 04ad: invokestatic Class_og.b (II)LClass_r;
      // 04b0: aastore
      // 04b1: dup
      // 04b2: bipush 2
      // 04b3: getstatic Class_ij.c LClass_r;
      // 04b6: aastore
      // 04b7: invokestatic Class_o.a (I[LClass_r;)LClass_r;
      // 04ba: iload 20
      // 04bc: iload 21
      // 04be: iload 24
      // 04c0: bipush -1
      // 04c1: invokevirtual Class_af.a (LClass_r;IIII)V
      // 04c4: getstatic Class_vb.j [Z
      // 04c7: iload 12
      // 04c9: bipush 1
      // 04ca: bastore
      // 04cb: iinc 21 15
      // 04ce: getstatic Class_n.u [Z
      // 04d1: iload 12
      // 04d3: bipush 1
      // 04d4: bastore
      // 04d5: iload 33
      // 04d7: ifeq 15de
      // 04da: getstatic Class_ui.h Z
      // 04dd: ifne 057d
      // 04e0: aload 11
      // 04e2: getfield Class_ha.Kc I
      // 04e5: bipush -1
      // 04e6: ixor
      // 04e7: bipush -1
      // 04e8: if_icmpne 0545
      // 04eb: aload 11
      // 04ed: getfield Class_ha.ed Z
      // 04f0: ifeq 0545
      // 04f3: iload 16
      // 04f5: bipush -1
      // 04f6: ixor
      // 04f7: getstatic Class_v.B I
      // 04fa: bipush -1
      // 04fb: ixor
      // 04fc: if_icmplt 0545
      // 04ff: iload 17
      // 0501: bipush -1
      // 0502: ixor
      // 0503: getstatic Class_pc.c I
      // 0506: bipush -1
      // 0507: ixor
      // 0508: if_icmplt 0545
      // 050b: iload 18
      // 050d: bipush -1
      // 050e: ixor
      // 050f: getstatic Class_v.B I
      // 0512: bipush -1
      // 0513: ixor
      // 0514: if_icmpge 0545
      // 0517: iload 19
      // 0519: bipush -1
      // 051a: ixor
      // 051b: getstatic Class_pc.c I
      // 051e: bipush -1
      // 051f: ixor
      // 0520: if_icmpge 0545
      // 0523: getstatic Class_pe.E Z
      // 0526: ifne 0545
      // 0529: getstatic Class_dd.I [S
      // 052c: bipush 0
      // 052d: sipush 1004
      // 0530: sastore
      // 0531: getstatic Class_tj.u [LClass_r;
      // 0534: bipush 0
      // 0535: getstatic Class_fd.h LClass_r;
      // 0538: aastore
      // 0539: bipush 1
      // 053a: putstatic Class_ma.ib I
      // 053d: getstatic Class_fb.h [LClass_r;
      // 0540: bipush 0
      // 0541: getstatic Class_hk.S LClass_r;
      // 0544: aastore
      // 0545: getstatic Class_v.B I
      // 0548: iload 16
      // 054a: if_icmplt 057d
      // 054d: getstatic Class_pc.c I
      // 0550: bipush -1
      // 0551: ixor
      // 0552: iload 17
      // 0554: bipush -1
      // 0555: ixor
      // 0556: if_icmpgt 057d
      // 0559: iload 18
      // 055b: getstatic Class_v.B I
      // 055e: if_icmple 057d
      // 0561: getstatic Class_pc.c I
      // 0564: iload 19
      // 0566: if_icmpge 057d
      // 0569: iload 13
      // 056b: ineg
      // 056c: getstatic Class_v.B I
      // 056f: iadd
      // 0570: aload 11
      // 0572: bipush 1
      // 0573: iload 14
      // 0575: ineg
      // 0576: getstatic Class_pc.c I
      // 0579: iadd
      // 057a: invokestatic Class_vb.a (ILClass_ha;ZI)V
      // 057d: aload 11
      // 057f: getfield Class_ha.Kc I
      // 0582: ifne 06d8
      // 0585: aload 11
      // 0587: getfield Class_ha.dc Z
      // 058a: ifne 059d
      // 058d: aload 11
      // 058f: invokestatic client.c (LClass_ha;)Z
      // 0592: ifeq 059d
      // 0595: aload 11
      // 0597: getstatic Class_si.b LClass_ha;
      // 059a: if_acmpne 15de
      // 059d: aload 11
      // 059f: getfield Class_ha.dc Z
      // 05a2: ifne 05db
      // 05a5: aload 11
      // 05a7: getfield Class_ha.M I
      // 05aa: aload 11
      // 05ac: getfield Class_ha.nc I
      // 05af: ineg
      // 05b0: iadd
      // 05b1: bipush -1
      // 05b2: ixor
      // 05b3: aload 11
      // 05b5: getfield Class_ha.kb I
      // 05b8: bipush -1
      // 05b9: ixor
      // 05ba: if_icmple 05cd
      // 05bd: aload 11
      // 05bf: aload 11
      // 05c1: getfield Class_ha.M I
      // 05c4: aload 11
      // 05c6: getfield Class_ha.nc I
      // 05c9: isub
      // 05ca: putfield Class_ha.kb I
      // 05cd: aload 11
      // 05cf: getfield Class_ha.kb I
      // 05d2: ifge 05db
      // 05d5: aload 11
      // 05d7: bipush 0
      // 05d8: putfield Class_ha.kb I
      // 05db: iload 19
      // 05dd: sipush -21644
      // 05e0: iload 17
      // 05e2: aload 3
      // 05e3: iload 18
      // 05e5: iload 12
      // 05e7: iload 16
      // 05e9: iload 14
      // 05eb: aload 11
      // 05ed: getfield Class_ha.kb I
      // 05f0: isub
      // 05f1: aload 11
      // 05f3: getfield Class_ha.K I
      // 05f6: aload 11
      // 05f8: getfield Class_ha.Nb I
      // 05fb: ineg
      // 05fc: iload 13
      // 05fe: iadd
      // 05ff: invokestatic Class_oi.a (III[LClass_ha;IIIIII)V
      // 0602: aload 11
      // 0604: getfield Class_ha.n [LClass_ha;
      // 0607: ifnull 0636
      // 060a: iload 19
      // 060c: sipush -21644
      // 060f: iload 17
      // 0611: aload 11
      // 0613: getfield Class_ha.n [LClass_ha;
      // 0616: iload 18
      // 0618: iload 12
      // 061a: iload 16
      // 061c: iload 14
      // 061e: aload 11
      // 0620: getfield Class_ha.kb I
      // 0623: ineg
      // 0624: iadd
      // 0625: aload 11
      // 0627: getfield Class_ha.K I
      // 062a: aload 11
      // 062c: getfield Class_ha.Nb I
      // 062f: ineg
      // 0630: iload 13
      // 0632: iadd
      // 0633: invokestatic Class_oi.a (III[LClass_ha;IIIIII)V
      // 0636: getstatic Class_nj.p LClass_tg;
      // 0639: aload 11
      // 063b: getfield Class_ha.K I
      // 063e: i2l
      // 063f: iload 1
      // 0640: sipush 21602
      // 0643: iadd
      // 0644: invokevirtual Class_tg.a (JI)LClass_li;
      // 0647: checkcast Class_be
      // 064a: astore 20
      // 064c: aload 20
      // 064e: ifnull 06cc
      // 0651: aload 20
      // 0653: getfield Class_be.q I
      // 0656: bipush -1
      // 0657: ixor
      // 0658: bipush -1
      // 0659: if_icmpne 06b4
      // 065c: getstatic Class_ui.h Z
      // 065f: ifne 06b4
      // 0662: iload 16
      // 0664: bipush -1
      // 0665: ixor
      // 0666: getstatic Class_v.B I
      // 0669: bipush -1
      // 066a: ixor
      // 066b: if_icmplt 06b4
      // 066e: getstatic Class_pc.c I
      // 0671: bipush -1
      // 0672: ixor
      // 0673: iload 17
      // 0675: bipush -1
      // 0676: ixor
      // 0677: if_icmpgt 06b4
      // 067a: getstatic Class_v.B I
      // 067d: bipush -1
      // 067e: ixor
      // 067f: iload 18
      // 0681: bipush -1
      // 0682: ixor
      // 0683: if_icmple 06b4
      // 0686: iload 19
      // 0688: bipush -1
      // 0689: ixor
      // 068a: getstatic Class_pc.c I
      // 068d: bipush -1
      // 068e: ixor
      // 068f: if_icmpge 06b4
      // 0692: getstatic Class_pe.E Z
      // 0695: ifne 06b4
      // 0698: getstatic Class_dd.I [S
      // 069b: bipush 0
      // 069c: sipush 1004
      // 069f: sastore
      // 06a0: getstatic Class_tj.u [LClass_r;
      // 06a3: bipush 0
      // 06a4: getstatic Class_fd.h LClass_r;
      // 06a7: aastore
      // 06a8: bipush 1
      // 06a9: putstatic Class_ma.ib I
      // 06ac: getstatic Class_fb.h [LClass_r;
      // 06af: bipush 0
      // 06b0: getstatic Class_hk.S LClass_r;
      // 06b3: aastore
      // 06b4: iload 16
      // 06b6: iload 17
      // 06b8: iload 19
      // 06ba: iload 14
      // 06bc: aload 20
      // 06be: getfield Class_be.t I
      // 06c1: iload 12
      // 06c3: iload 13
      // 06c5: iload 18
      // 06c7: bipush -112
      // 06c9: invokestatic Class_pe.a (IIIIIIIIB)V
      // 06cc: iload 6
      // 06ce: iload 2
      // 06cf: iload 4
      // 06d1: iload 0
      // 06d2: invokestatic Class_nc.c (IIII)V
      // 06d5: invokestatic Class_kd.d ()V
      // 06d8: getstatic Class_ae.f [Z
      // 06db: iload 12
      // 06dd: baload
      // 06de: ifne 06eb
      // 06e1: getstatic Class_ec.S I
      // 06e4: bipush -1
      // 06e5: ixor
      // 06e6: bipush -2
      // 06e8: if_icmpge 15de
      // 06eb: aload 11
      // 06ed: getfield Class_ha.Kc I
      // 06f0: bipush -1
      // 06f1: ixor
      // 06f2: bipush -1
      // 06f3: if_icmpne 0729
      // 06f6: aload 11
      // 06f8: getfield Class_ha.dc Z
      // 06fb: ifne 0729
      // 06fe: aload 11
      // 0700: getfield Class_ha.M I
      // 0703: aload 11
      // 0705: getfield Class_ha.nc I
      // 0708: if_icmple 0729
      // 070b: iload 14
      // 070d: aload 11
      // 070f: getfield Class_ha.kb I
      // 0712: aload 11
      // 0714: getfield Class_ha.M I
      // 0717: aload 11
      // 0719: getfield Class_ha.Gc I
      // 071c: iload 13
      // 071e: iadd
      // 071f: aload 11
      // 0721: getfield Class_ha.nc I
      // 0724: bipush -62
      // 0726: invokestatic Class_j.a (IIIIIB)V
      // 0729: aload 11
      // 072b: getfield Class_ha.Kc I
      // 072e: bipush -1
      // 072f: ixor
      // 0730: bipush -2
      // 0732: if_icmpeq 15de
      // 0735: aload 11
      // 0737: getfield Class_ha.Kc I
      // 073a: bipush -1
      // 073b: ixor
      // 073c: bipush -3
      // 073e: if_icmpne 0a9c
      // 0741: bipush 0
      // 0742: istore 20
      // 0744: bipush 0
      // 0745: istore 21
      // 0747: iload 33
      // 0749: ifeq 0a89
      // 074c: bipush 0
      // 074d: istore 22
      // 074f: iload 33
      // 0751: ifeq 0a78
      // 0754: iload 14
      // 0756: bipush 32
      // 0758: aload 11
      // 075a: getfield Class_ha.Mb I
      // 075d: ineg
      // 075e: isub
      // 075f: iload 21
      // 0761: imul
      // 0762: iadd
      // 0763: istore 24
      // 0765: iload 13
      // 0767: aload 11
      // 0769: getfield Class_ha.zc I
      // 076c: bipush 32
      // 076e: iadd
      // 076f: iload 22
      // 0771: imul
      // 0772: iadd
      // 0773: istore 23
      // 0775: iload 20
      // 0777: bipush -1
      // 0778: ixor
      // 0779: bipush -21
      // 077b: if_icmple 0798
      // 077e: iload 23
      // 0780: aload 11
      // 0782: getfield Class_ha.sb [I
      // 0785: iload 20
      // 0787: iaload
      // 0788: iadd
      // 0789: istore 23
      // 078b: iload 24
      // 078d: aload 11
      // 078f: getfield Class_ha.l [I
      // 0792: iload 20
      // 0794: iaload
      // 0795: iadd
      // 0796: istore 24
      // 0798: aload 11
      // 079a: getfield Class_ha.N [I
      // 079d: iload 20
      // 079f: iaload
      // 07a0: bipush -1
      // 07a1: ixor
      // 07a2: bipush -1
      // 07a3: if_icmplt 07e8
      // 07a6: aload 11
      // 07a8: getfield Class_ha.Hb [I
      // 07ab: ifnull 0a72
      // 07ae: iload 20
      // 07b0: bipush 20
      // 07b2: if_icmpge 0a72
      // 07b5: aload 11
      // 07b7: bipush -40
      // 07b9: iload 20
      // 07bb: invokevirtual Class_ha.a (BI)LClass_jb;
      // 07be: astore 25
      // 07c0: aload 25
      // 07c2: ifnonnull 07da
      // 07c5: getstatic Class_pd.j Z
      // 07c8: ifeq 0a72
      // 07cb: aload 11
      // 07cd: iload 1
      // 07ce: sipush 21530
      // 07d1: iadd
      // 07d2: invokestatic Class_tg.a (LClass_ha;I)V
      // 07d5: iload 33
      // 07d7: ifeq 0a72
      // 07da: aload 25
      // 07dc: iload 23
      // 07de: iload 24
      // 07e0: invokevirtual Class_jb.c (II)V
      // 07e3: iload 33
      // 07e5: ifeq 0a72
      // 07e8: bipush 0
      // 07e9: istore 26
      // 07eb: bipush 0
      // 07ec: istore 25
      // 07ee: aload 11
      // 07f0: getfield Class_ha.N [I
      // 07f3: iload 20
      // 07f5: iaload
      // 07f6: bipush 1
      // 07f7: isub
      // 07f8: istore 27
      // 07fa: iload 6
      // 07fc: bipush -1
      // 07fd: ixor
      // 07fe: bipush 32
      // 0800: iload 23
      // 0802: iadd
      // 0803: bipush -1
      // 0804: ixor
      // 0805: if_icmple 0826
      // 0808: iload 23
      // 080a: iload 4
      // 080c: if_icmpge 0826
      // 080f: iload 24
      // 0811: bipush 32
      // 0813: iadd
      // 0814: bipush -1
      // 0815: ixor
      // 0816: iload 2
      // 0817: bipush -1
      // 0818: ixor
      // 0819: if_icmpge 0826
      // 081c: iload 24
      // 081e: bipush -1
      // 081f: ixor
      // 0820: iload 0
      // 0821: bipush -1
      // 0822: ixor
      // 0823: if_icmpgt 0836
      // 0826: aload 11
      // 0828: getstatic Class_ij.f LClass_ha;
      // 082b: if_acmpne 0a72
      // 082e: getstatic Class_bk.Q I
      // 0831: iload 20
      // 0833: if_icmpne 0a72
      // 0836: getstatic Class_vh.cb I
      // 0839: bipush 1
      // 083a: if_icmpne 0854
      // 083d: iload 20
      // 083f: bipush -1
      // 0840: ixor
      // 0841: getstatic Class_fa.Kb I
      // 0844: bipush -1
      // 0845: ixor
      // 0846: if_icmpne 0854
      // 0849: aload 11
      // 084b: getfield Class_ha.K I
      // 084e: getstatic Class_hk.P I
      // 0851: if_icmpeq 0872
      // 0854: bipush 1
      // 0855: aload 11
      // 0857: getfield Class_ha.s [I
      // 085a: iload 20
      // 085c: iaload
      // 085d: bipush 0
      // 085e: iload 27
      // 0860: ldc_w 3153952
      // 0863: aload 11
      // 0865: getfield Class_ha.D Z
      // 0868: invokestatic Class_h.a (IIZIIZ)LClass_jb;
      // 086b: astore 28
      // 086d: iload 33
      // 086f: ifeq 0889
      // 0872: bipush 2
      // 0873: aload 11
      // 0875: getfield Class_ha.s [I
      // 0878: iload 20
      // 087a: iaload
      // 087b: bipush 0
      // 087c: iload 27
      // 087e: bipush 0
      // 087f: aload 11
      // 0881: getfield Class_ha.D Z
      // 0884: invokestatic Class_h.a (IIZIIZ)LClass_jb;
      // 0887: astore 28
      // 0889: getstatic Class_kd.b Z
      // 088c: ifeq 0896
      // 088f: getstatic Class_vb.j [Z
      // 0892: iload 12
      // 0894: bipush 1
      // 0895: bastore
      // 0896: aload 28
      // 0898: ifnull 0a6b
      // 089b: getstatic Class_ij.f LClass_ha;
      // 089e: aload 11
      // 08a0: if_acmpne 08af
      // 08a3: iload 20
      // 08a5: bipush -1
      // 08a6: ixor
      // 08a7: getstatic Class_bk.Q I
      // 08aa: bipush -1
      // 08ab: ixor
      // 08ac: if_icmpeq 08e2
      // 08af: getstatic Class_qe.L LClass_ha;
      // 08b2: aload 11
      // 08b4: if_acmpne 08c3
      // 08b7: iload 20
      // 08b9: bipush -1
      // 08ba: ixor
      // 08bb: getstatic Class_kh.d I
      // 08be: bipush -1
      // 08bf: ixor
      // 08c0: if_icmpeq 08d1
      // 08c3: aload 28
      // 08c5: iload 23
      // 08c7: iload 24
      // 08c9: invokevirtual Class_jb.c (II)V
      // 08cc: iload 33
      // 08ce: ifeq 0a72
      // 08d1: aload 28
      // 08d3: iload 23
      // 08d5: iload 24
      // 08d7: sipush 128
      // 08da: invokevirtual Class_jb.a (III)V
      // 08dd: iload 33
      // 08df: ifeq 0a72
      // 08e2: getstatic Class_pj.c I
      // 08e5: getstatic Class_jg.c I
      // 08e8: ineg
      // 08e9: iadd
      // 08ea: istore 25
      // 08ec: iload 25
      // 08ee: bipush 5
      // 08ef: if_icmpge 08fd
      // 08f2: iload 25
      // 08f4: bipush -1
      // 08f5: ixor
      // 08f6: bipush 4
      // 08f7: if_icmpge 08fd
      // 08fa: bipush 0
      // 08fb: istore 25
      // 08fd: getstatic Class_nf.x I
      // 0900: ineg
      // 0901: getstatic Class_bh.k I
      // 0904: iadd
      // 0905: istore 26
      // 0907: iload 26
      // 0909: bipush -1
      // 090a: ixor
      // 090b: bipush -6
      // 090d: if_icmple 091b
      // 0910: iload 26
      // 0912: bipush -1
      // 0913: ixor
      // 0914: bipush 4
      // 0915: if_icmpge 091b
      // 0918: bipush 0
      // 0919: istore 26
      // 091b: getstatic Class_ea.Z I
      // 091e: bipush -1
      // 091f: ixor
      // 0920: bipush -6
      // 0922: if_icmple 092b
      // 0925: bipush 0
      // 0926: istore 26
      // 0928: bipush 0
      // 0929: istore 25
      // 092b: aload 28
      // 092d: iload 23
      // 092f: iload 25
      // 0931: ineg
      // 0932: isub
      // 0933: iload 24
      // 0935: iload 26
      // 0937: iadd
      // 0938: sipush 128
      // 093b: invokevirtual Class_jb.a (III)V
      // 093e: iload 8
      // 0940: bipush -1
      // 0941: if_icmpeq 0a72
      // 0944: aload 3
      // 0945: iload 8
      // 0947: ldc_w 65535
      // 094a: iand
      // 094b: aaload
      // 094c: astore 29
      // 094e: getstatic Class_nc.h I
      // 0951: istore 31
      // 0953: getstatic Class_nc.g I
      // 0956: istore 30
      // 0958: iload 30
      // 095a: bipush -1
      // 095b: ixor
      // 095c: iload 24
      // 095e: iload 26
      // 0960: iadd
      // 0961: bipush -1
      // 0962: ixor
      // 0963: if_icmpge 09c7
      // 0966: aload 29
      // 0968: getfield Class_ha.kb I
      // 096b: ifle 09c7
      // 096e: getstatic Class_sj.k I
      // 0971: iload 30
      // 0973: iload 24
      // 0975: ineg
      // 0976: iload 26
      // 0978: isub
      // 0979: iadd
      // 097a: imul
      // 097b: bipush 3
      // 097c: idiv
      // 097d: istore 32
      // 097f: iload 32
      // 0981: bipush -1
      // 0982: ixor
      // 0983: getstatic Class_sj.k I
      // 0986: bipush 10
      // 0988: imul
      // 0989: bipush -1
      // 098a: ixor
      // 098b: if_icmpge 0996
      // 098e: bipush 10
      // 0990: getstatic Class_sj.k I
      // 0993: imul
      // 0994: istore 32
      // 0996: aload 29
      // 0998: getfield Class_ha.kb I
      // 099b: bipush -1
      // 099c: ixor
      // 099d: iload 32
      // 099f: bipush -1
      // 09a0: ixor
      // 09a1: if_icmple 09ab
      // 09a4: aload 29
      // 09a6: getfield Class_ha.kb I
      // 09a9: istore 32
      // 09ab: getstatic Class_nf.x I
      // 09ae: iload 32
      // 09b0: iadd
      // 09b1: putstatic Class_nf.x I
      // 09b4: aload 29
      // 09b6: dup
      // 09b7: getfield Class_ha.kb I
      // 09ba: iload 32
      // 09bc: isub
      // 09bd: putfield Class_ha.kb I
      // 09c0: aload 29
      // 09c2: bipush -116
      // 09c4: invokestatic Class_tg.a (LClass_ha;I)V
      // 09c7: iload 31
      // 09c9: bipush -1
      // 09ca: ixor
      // 09cb: bipush 32
      // 09cd: iload 26
      // 09cf: iadd
      // 09d0: iload 24
      // 09d2: iadd
      // 09d3: bipush -1
      // 09d4: ixor
      // 09d5: if_icmple 0a72
      // 09d8: aload 29
      // 09da: getfield Class_ha.kb I
      // 09dd: bipush -1
      // 09de: ixor
      // 09df: aload 29
      // 09e1: getfield Class_ha.M I
      // 09e4: aload 29
      // 09e6: getfield Class_ha.nc I
      // 09e9: isub
      // 09ea: bipush -1
      // 09eb: ixor
      // 09ec: if_icmple 0a72
      // 09ef: getstatic Class_sj.k I
      // 09f2: bipush 32
      // 09f4: iload 24
      // 09f6: iadd
      // 09f7: iload 26
      // 09f9: ineg
      // 09fa: isub
      // 09fb: iload 31
      // 09fd: ineg
      // 09fe: iadd
      // 09ff: imul
      // 0a00: bipush 3
      // 0a01: idiv
      // 0a02: istore 32
      // 0a04: iload 32
      // 0a06: bipush -1
      // 0a07: ixor
      // 0a08: bipush 10
      // 0a0a: getstatic Class_sj.k I
      // 0a0d: imul
      // 0a0e: bipush -1
      // 0a0f: ixor
      // 0a10: if_icmpge 0a1b
      // 0a13: getstatic Class_sj.k I
      // 0a16: bipush 10
      // 0a18: imul
      // 0a19: istore 32
      // 0a1b: aload 29
      // 0a1d: getfield Class_ha.nc I
      // 0a20: ineg
      // 0a21: aload 29
      // 0a23: getfield Class_ha.M I
      // 0a26: aload 29
      // 0a28: getfield Class_ha.kb I
      // 0a2b: isub
      // 0a2c: iadd
      // 0a2d: bipush -1
      // 0a2e: ixor
      // 0a2f: iload 32
      // 0a31: bipush -1
      // 0a32: ixor
      // 0a33: if_icmple 0a4a
      // 0a36: aload 29
      // 0a38: getfield Class_ha.kb I
      // 0a3b: ineg
      // 0a3c: aload 29
      // 0a3e: getfield Class_ha.M I
      // 0a41: aload 29
      // 0a43: getfield Class_ha.nc I
      // 0a46: isub
      // 0a47: iadd
      // 0a48: istore 32
      // 0a4a: aload 29
      // 0a4c: dup
      // 0a4d: getfield Class_ha.kb I
      // 0a50: iload 32
      // 0a52: iadd
      // 0a53: putfield Class_ha.kb I
      // 0a56: getstatic Class_nf.x I
      // 0a59: iload 32
      // 0a5b: isub
      // 0a5c: putstatic Class_nf.x I
      // 0a5f: aload 29
      // 0a61: bipush -117
      // 0a63: invokestatic Class_tg.a (LClass_ha;I)V
      // 0a66: iload 33
      // 0a68: ifeq 0a72
      // 0a6b: aload 11
      // 0a6d: bipush -119
      // 0a6f: invokestatic Class_tg.a (LClass_ha;I)V
      // 0a72: iinc 20 1
      // 0a75: iinc 22 1
      // 0a78: aload 11
      // 0a7a: getfield Class_ha.r I
      // 0a7d: bipush -1
      // 0a7e: ixor
      // 0a7f: iload 22
      // 0a81: bipush -1
      // 0a82: ixor
      // 0a83: if_icmplt 0754
      // 0a86: iinc 21 1
      // 0a89: aload 11
      // 0a8b: getfield Class_ha.Nc I
      // 0a8e: bipush -1
      // 0a8f: ixor
      // 0a90: iload 21
      // 0a92: bipush -1
      // 0a93: ixor
      // 0a94: if_icmplt 074c
      // 0a97: iload 33
      // 0a99: ifeq 15de
      // 0a9c: aload 11
      // 0a9e: getfield Class_ha.Kc I
      // 0aa1: bipush 3
      // 0aa2: if_icmpne 0b84
      // 0aa5: iload 1
      // 0aa6: sipush 21644
      // 0aa9: iadd
      // 0aaa: aload 11
      // 0aac: invokestatic Class_oi.a (ILClass_ha;)Z
      // 0aaf: ifeq 0ad8
      // 0ab2: aload 11
      // 0ab4: getfield Class_ha.cc I
      // 0ab7: istore 20
      // 0ab9: getstatic Class_si.b LClass_ha;
      // 0abc: aload 11
      // 0abe: if_acmpne 0af9
      // 0ac1: aload 11
      // 0ac3: getfield Class_ha.u I
      // 0ac6: bipush -1
      // 0ac7: ixor
      // 0ac8: bipush -1
      // 0ac9: if_icmpeq 0af9
      // 0acc: aload 11
      // 0ace: getfield Class_ha.u I
      // 0ad1: istore 20
      // 0ad3: iload 33
      // 0ad5: ifeq 0af9
      // 0ad8: aload 11
      // 0ada: getfield Class_ha.yb I
      // 0add: istore 20
      // 0adf: aload 11
      // 0ae1: getstatic Class_si.b LClass_ha;
      // 0ae4: if_acmpne 0af9
      // 0ae7: aload 11
      // 0ae9: getfield Class_ha.ub I
      // 0aec: bipush -1
      // 0aed: ixor
      // 0aee: bipush -1
      // 0aef: if_icmpeq 0af9
      // 0af2: aload 11
      // 0af4: getfield Class_ha.ub I
      // 0af7: istore 20
      // 0af9: iload 15
      // 0afb: ifeq 0b4c
      // 0afe: aload 11
      // 0b00: getfield Class_ha.gc Z
      // 0b03: ifeq 0b29
      // 0b06: iload 13
      // 0b08: iload 14
      // 0b0a: aload 11
      // 0b0c: getfield Class_ha.Gc I
      // 0b0f: aload 11
      // 0b11: getfield Class_ha.nc I
      // 0b14: iload 20
      // 0b16: sipush 255
      // 0b19: iload 15
      // 0b1b: iand
      // 0b1c: ineg
      // 0b1d: sipush 256
      // 0b20: iadd
      // 0b21: invokestatic Class_nc.c (IIIIII)V
      // 0b24: iload 33
      // 0b26: ifeq 15de
      // 0b29: iload 13
      // 0b2b: iload 14
      // 0b2d: aload 11
      // 0b2f: getfield Class_ha.Gc I
      // 0b32: aload 11
      // 0b34: getfield Class_ha.nc I
      // 0b37: iload 20
      // 0b39: sipush 255
      // 0b3c: iload 15
      // 0b3e: iand
      // 0b3f: ineg
      // 0b40: sipush 256
      // 0b43: iadd
      // 0b44: invokestatic Class_nc.b (IIIIII)V
      // 0b47: iload 33
      // 0b49: ifeq 15de
      // 0b4c: aload 11
      // 0b4e: getfield Class_ha.gc Z
      // 0b51: ifne 0b6c
      // 0b54: iload 13
      // 0b56: iload 14
      // 0b58: aload 11
      // 0b5a: getfield Class_ha.Gc I
      // 0b5d: aload 11
      // 0b5f: getfield Class_ha.nc I
      // 0b62: iload 20
      // 0b64: invokestatic Class_nc.a (IIIII)V
      // 0b67: iload 33
      // 0b69: ifeq 15de
      // 0b6c: iload 13
      // 0b6e: iload 14
      // 0b70: aload 11
      // 0b72: getfield Class_ha.Gc I
      // 0b75: aload 11
      // 0b77: getfield Class_ha.nc I
      // 0b7a: iload 20
      // 0b7c: invokestatic Class_nc.f (IIIII)V
      // 0b7f: iload 33
      // 0b81: ifeq 15de
      // 0b84: aload 11
      // 0b86: getfield Class_ha.Kc I
      // 0b89: bipush 4
      // 0b8a: if_icmpne 0cf7
      // 0b8d: aload 11
      // 0b8f: bipush -103
      // 0b91: getstatic Class_lh.Cb [LClass_pc;
      // 0b94: invokevirtual Class_ha.a (I[LClass_pc;)LClass_af;
      // 0b97: astore 20
      // 0b99: aload 20
      // 0b9b: ifnonnull 0bb0
      // 0b9e: getstatic Class_pd.j Z
      // 0ba1: ifeq 15de
      // 0ba4: aload 11
      // 0ba6: bipush -117
      // 0ba8: invokestatic Class_tg.a (LClass_ha;I)V
      // 0bab: iload 33
      // 0bad: ifeq 15de
      // 0bb0: aload 11
      // 0bb2: getfield Class_ha.vc LClass_r;
      // 0bb5: astore 22
      // 0bb7: iload 1
      // 0bb8: sipush -21644
      // 0bbb: ixor
      // 0bbc: aload 11
      // 0bbe: invokestatic Class_oi.a (ILClass_ha;)Z
      // 0bc1: ifeq 0c01
      // 0bc4: aload 11
      // 0bc6: getfield Class_ha.cc I
      // 0bc9: istore 21
      // 0bcb: aload 11
      // 0bcd: getstatic Class_si.b LClass_ha;
      // 0bd0: if_acmpne 0be5
      // 0bd3: aload 11
      // 0bd5: getfield Class_ha.u I
      // 0bd8: bipush -1
      // 0bd9: ixor
      // 0bda: bipush -1
      // 0bdb: if_icmpeq 0be5
      // 0bde: aload 11
      // 0be0: getfield Class_ha.u I
      // 0be3: istore 21
      // 0be5: aload 11
      // 0be7: getfield Class_ha.uc LClass_r;
      // 0bea: bipush -111
      // 0bec: invokevirtual Class_r.d (B)I
      // 0bef: bipush -1
      // 0bf0: ixor
      // 0bf1: bipush -1
      // 0bf2: if_icmpge 0c1f
      // 0bf5: aload 11
      // 0bf7: getfield Class_ha.uc LClass_r;
      // 0bfa: astore 22
      // 0bfc: iload 33
      // 0bfe: ifeq 0c1f
      // 0c01: aload 11
      // 0c03: getfield Class_ha.yb I
      // 0c06: istore 21
      // 0c08: aload 11
      // 0c0a: getstatic Class_si.b LClass_ha;
      // 0c0d: if_acmpne 0c1f
      // 0c10: aload 11
      // 0c12: getfield Class_ha.ub I
      // 0c15: ifeq 0c1f
      // 0c18: aload 11
      // 0c1a: getfield Class_ha.ub I
      // 0c1d: istore 21
      // 0c1f: aload 11
      // 0c21: getfield Class_ha.dc Z
      // 0c24: ifeq 0c96
      // 0c27: aload 11
      // 0c29: getfield Class_ha.Q I
      // 0c2c: bipush -1
      // 0c2d: ixor
      // 0c2e: ifeq 0c96
      // 0c31: sipush -25672
      // 0c34: aload 11
      // 0c36: getfield Class_ha.Q I
      // 0c39: invokestatic Class_ra.a (II)LClass_cf;
      // 0c3c: astore 23
      // 0c3e: aload 23
      // 0c40: getfield Class_cf.J LClass_r;
      // 0c43: astore 22
      // 0c45: aload 22
      // 0c47: ifnonnull 0c4f
      // 0c4a: getstatic Class_td.U LClass_r;
      // 0c4d: astore 22
      // 0c4f: aload 23
      // 0c51: getfield Class_cf.cb I
      // 0c54: bipush 1
      // 0c55: if_icmpeq 0c61
      // 0c58: aload 11
      // 0c5a: getfield Class_ha.dd I
      // 0c5d: bipush 1
      // 0c5e: if_icmpeq 0c96
      // 0c61: aload 11
      // 0c63: getfield Class_ha.dd I
      // 0c66: bipush -1
      // 0c67: ixor
      // 0c68: ifeq 0c96
      // 0c6b: bipush 2
      // 0c6c: bipush 4
      // 0c6d: anewarray 321
      // 0c70: dup
      // 0c71: bipush 0
      // 0c72: getstatic Class_hj.U LClass_r;
      // 0c75: aastore
      // 0c76: dup
      // 0c77: bipush 1
      // 0c78: aload 22
      // 0c7a: aastore
      // 0c7b: dup
      // 0c7c: bipush 2
      // 0c7d: getstatic Class_hj.Z LClass_r;
      // 0c80: aastore
      // 0c81: dup
      // 0c82: bipush 3
      // 0c83: aload 11
      // 0c85: getfield Class_ha.dd I
      // 0c88: iload 1
      // 0c89: sipush 16468
      // 0c8c: ixor
      // 0c8d: invokestatic Class_vh.b (II)LClass_r;
      // 0c90: aastore
      // 0c91: invokestatic Class_o.a (I[LClass_r;)LClass_r;
      // 0c94: astore 22
      // 0c96: aload 11
      // 0c98: getstatic Class_eb.f LClass_ha;
      // 0c9b: if_acmpne 0caa
      // 0c9e: aload 11
      // 0ca0: getfield Class_ha.yb I
      // 0ca3: istore 21
      // 0ca5: getstatic Class_wa.f LClass_r;
      // 0ca8: astore 22
      // 0caa: aload 11
      // 0cac: getfield Class_ha.dc Z
      // 0caf: ifne 0cbe
      // 0cb2: aload 22
      // 0cb4: sipush 27757
      // 0cb7: aload 11
      // 0cb9: invokestatic Class_cd.a (LClass_r;ILClass_ha;)LClass_r;
      // 0cbc: astore 22
      // 0cbe: aload 20
      // 0cc0: aload 22
      // 0cc2: iload 13
      // 0cc4: iload 14
      // 0cc6: aload 11
      // 0cc8: getfield Class_ha.Gc I
      // 0ccb: aload 11
      // 0ccd: getfield Class_ha.nc I
      // 0cd0: iload 21
      // 0cd2: aload 11
      // 0cd4: getfield Class_ha.f Z
      // 0cd7: ifeq 0cde
      // 0cda: bipush 0
      // 0cdb: goto 0cdf
      // 0cde: bipush -1
      // 0cdf: aload 11
      // 0ce1: getfield Class_ha.v I
      // 0ce4: aload 11
      // 0ce6: getfield Class_ha.wb I
      // 0ce9: aload 11
      // 0ceb: getfield Class_ha.H I
      // 0cee: invokevirtual Class_af.a (LClass_r;IIIIIIIII)I
      // 0cf1: pop
      // 0cf2: iload 33
      // 0cf4: ifeq 15de
      // 0cf7: aload 11
      // 0cf9: getfield Class_ha.Kc I
      // 0cfc: bipush -1
      // 0cfd: ixor
      // 0cfe: bipush -6
      // 0d00: if_icmpne 0f3a
      // 0d03: aload 11
      // 0d05: getfield Class_ha.dc Z
      // 0d08: ifeq 0f03
      // 0d0b: aload 11
      // 0d0d: getfield Class_ha.Q I
      // 0d10: bipush -1
      // 0d11: if_icmpeq 0d38
      // 0d14: aload 11
      // 0d16: getfield Class_ha.Zb I
      // 0d19: aload 11
      // 0d1b: getfield Class_ha.dd I
      // 0d1e: bipush 0
      // 0d1f: aload 11
      // 0d21: getfield Class_ha.Q I
      // 0d24: aload 11
      // 0d26: getfield Class_ha.Uc I
      // 0d29: aload 11
      // 0d2b: getfield Class_ha.D Z
      // 0d2e: invokestatic Class_h.a (IIZIIZ)LClass_jb;
      // 0d31: astore 20
      // 0d33: iload 33
      // 0d35: ifeq 0d43
      // 0d38: aload 11
      // 0d3a: bipush 0
      // 0d3b: sipush 20503
      // 0d3e: invokevirtual Class_ha.a (ZI)LClass_jb;
      // 0d41: astore 20
      // 0d43: aload 20
      // 0d45: ifnonnull 0d5a
      // 0d48: getstatic Class_pd.j Z
      // 0d4b: ifeq 15de
      // 0d4e: aload 11
      // 0d50: bipush -127
      // 0d52: invokestatic Class_tg.a (LClass_ha;I)V
      // 0d55: iload 33
      // 0d57: ifeq 15de
      // 0d5a: aload 20
      // 0d5c: getfield Class_jb.M I
      // 0d5f: istore 21
      // 0d61: aload 20
      // 0d63: getfield Class_jb.U I
      // 0d66: istore 22
      // 0d68: aload 11
      // 0d6a: getfield Class_ha.tb Z
      // 0d6d: ifeq 0e59
      // 0d70: aload 11
      // 0d72: getfield Class_ha.Gc I
      // 0d75: bipush -1
      // 0d76: iadd
      // 0d77: iload 21
      // 0d79: iadd
      // 0d7a: iload 21
      // 0d7c: idiv
      // 0d7d: istore 23
      // 0d7f: aload 11
      // 0d81: getfield Class_ha.nc I
      // 0d84: iload 22
      // 0d86: bipush -1
      // 0d87: iadd
      // 0d88: iadd
      // 0d89: iload 22
      // 0d8b: idiv
      // 0d8c: istore 24
      // 0d8e: iload 13
      // 0d90: iload 14
      // 0d92: iload 13
      // 0d94: aload 11
      // 0d96: getfield Class_ha.Gc I
      // 0d99: ineg
      // 0d9a: isub
      // 0d9b: iload 14
      // 0d9d: aload 11
      // 0d9f: getfield Class_ha.nc I
      // 0da2: iadd
      // 0da3: invokestatic Class_nc.b (IIII)V
      // 0da6: bipush 0
      // 0da7: istore 25
      // 0da9: iload 33
      // 0dab: ifeq 0e40
      // 0dae: bipush 0
      // 0daf: istore 26
      // 0db1: iload 33
      // 0db3: ifeq 0e32
      // 0db6: aload 11
      // 0db8: getfield Class_ha.Lb I
      // 0dbb: bipush -1
      // 0dbc: ixor
      // 0dbd: bipush -1
      // 0dbe: if_icmpeq 0df0
      // 0dc1: aload 20
      // 0dc3: aload 11
      // 0dc5: getfield Class_ha.Lb I
      // 0dc8: iload 26
      // 0dca: iload 22
      // 0dcc: imul
      // 0dcd: iload 14
      // 0dcf: iadd
      // 0dd0: iload 22
      // 0dd2: bipush 2
      // 0dd3: idiv
      // 0dd4: ineg
      // 0dd5: isub
      // 0dd6: iload 25
      // 0dd8: iload 21
      // 0dda: imul
      // 0ddb: iload 13
      // 0ddd: iadd
      // 0dde: iload 21
      // 0de0: bipush 2
      // 0de1: idiv
      // 0de2: iadd
      // 0de3: sipush 4096
      // 0de6: bipush 106
      // 0de8: invokevirtual Class_jb.a (IIIIB)V
      // 0deb: iload 33
      // 0ded: ifeq 0e2f
      // 0df0: iload 15
      // 0df2: ifeq 0e1a
      // 0df5: aload 20
      // 0df7: iload 25
      // 0df9: iload 21
      // 0dfb: imul
      // 0dfc: iload 13
      // 0dfe: iadd
      // 0dff: iload 22
      // 0e01: iload 26
      // 0e03: imul
      // 0e04: iload 14
      // 0e06: iadd
      // 0e07: sipush 256
      // 0e0a: sipush 255
      // 0e0d: iload 15
      // 0e0f: iand
      // 0e10: ineg
      // 0e11: iadd
      // 0e12: invokevirtual Class_jb.a (III)V
      // 0e15: iload 33
      // 0e17: ifeq 0e2f
      // 0e1a: aload 20
      // 0e1c: iload 25
      // 0e1e: iload 21
      // 0e20: imul
      // 0e21: iload 13
      // 0e23: iadd
      // 0e24: iload 14
      // 0e26: iload 22
      // 0e28: iload 26
      // 0e2a: imul
      // 0e2b: iadd
      // 0e2c: invokevirtual Class_jb.c (II)V
      // 0e2f: iinc 26 1
      // 0e32: iload 24
      // 0e34: bipush -1
      // 0e35: ixor
      // 0e36: iload 26
      // 0e38: bipush -1
      // 0e39: ixor
      // 0e3a: if_icmplt 0db6
      // 0e3d: iinc 25 1
      // 0e40: iload 23
      // 0e42: bipush -1
      // 0e43: ixor
      // 0e44: iload 25
      // 0e46: bipush -1
      // 0e47: ixor
      // 0e48: if_icmplt 0dae
      // 0e4b: iload 6
      // 0e4d: iload 2
      // 0e4e: iload 4
      // 0e50: iload 0
      // 0e51: invokestatic Class_nc.c (IIII)V
      // 0e54: iload 33
      // 0e56: ifeq 15de
      // 0e59: sipush 4096
      // 0e5c: aload 11
      // 0e5e: getfield Class_ha.Gc I
      // 0e61: imul
      // 0e62: iload 21
      // 0e64: idiv
      // 0e65: istore 23
      // 0e67: aload 11
      // 0e69: getfield Class_ha.Lb I
      // 0e6c: ifne 0edc
      // 0e6f: iload 15
      // 0e71: bipush -1
      // 0e72: ixor
      // 0e73: bipush -1
      // 0e74: if_icmpeq 0e9a
      // 0e77: aload 20
      // 0e79: iload 13
      // 0e7b: iload 14
      // 0e7d: aload 11
      // 0e7f: getfield Class_ha.Gc I
      // 0e82: aload 11
      // 0e84: getfield Class_ha.nc I
      // 0e87: sipush 256
      // 0e8a: iload 15
      // 0e8c: sipush 255
      // 0e8f: iand
      // 0e90: ineg
      // 0e91: iadd
      // 0e92: invokevirtual Class_jb.a (IIIII)V
      // 0e95: iload 33
      // 0e97: ifeq 15de
      // 0e9a: iload 21
      // 0e9c: bipush -1
      // 0e9d: ixor
      // 0e9e: aload 11
      // 0ea0: getfield Class_ha.Gc I
      // 0ea3: bipush -1
      // 0ea4: ixor
      // 0ea5: if_icmpne 0eb6
      // 0ea8: aload 11
      // 0eaa: getfield Class_ha.nc I
      // 0ead: bipush -1
      // 0eae: ixor
      // 0eaf: iload 22
      // 0eb1: bipush -1
      // 0eb2: ixor
      // 0eb3: if_icmpeq 0ece
      // 0eb6: aload 20
      // 0eb8: iload 13
      // 0eba: iload 14
      // 0ebc: aload 11
      // 0ebe: getfield Class_ha.Gc I
      // 0ec1: aload 11
      // 0ec3: getfield Class_ha.nc I
      // 0ec6: invokevirtual Class_jb.b (IIII)V
      // 0ec9: iload 33
      // 0ecb: ifeq 15de
      // 0ece: aload 20
      // 0ed0: iload 13
      // 0ed2: iload 14
      // 0ed4: invokevirtual Class_jb.c (II)V
      // 0ed7: iload 33
      // 0ed9: ifeq 15de
      // 0edc: aload 20
      // 0ede: aload 11
      // 0ee0: getfield Class_ha.Lb I
      // 0ee3: aload 11
      // 0ee5: getfield Class_ha.nc I
      // 0ee8: bipush 2
      // 0ee9: idiv
      // 0eea: iload 14
      // 0eec: iadd
      // 0eed: aload 11
      // 0eef: getfield Class_ha.Gc I
      // 0ef2: bipush 2
      // 0ef3: idiv
      // 0ef4: iload 13
      // 0ef6: iadd
      // 0ef7: iload 23
      // 0ef9: bipush 118
      // 0efb: invokevirtual Class_jb.a (IIIIB)V
      // 0efe: iload 33
      // 0f00: ifeq 15de
      // 0f03: aload 11
      // 0f05: bipush 0
      // 0f06: aload 11
      // 0f08: invokestatic Class_oi.a (ILClass_ha;)Z
      // 0f0b: iload 1
      // 0f0c: ldc_w 42147
      // 0f0f: iadd
      // 0f10: invokevirtual Class_ha.a (ZI)LClass_jb;
      // 0f13: astore 20
      // 0f15: aload 20
      // 0f17: ifnonnull 0f2c
      // 0f1a: getstatic Class_pd.j Z
      // 0f1d: ifeq 15de
      // 0f20: aload 11
      // 0f22: bipush -121
      // 0f24: invokestatic Class_tg.a (LClass_ha;I)V
      // 0f27: iload 33
      // 0f29: ifeq 15de
      // 0f2c: aload 20
      // 0f2e: iload 13
      // 0f30: iload 14
      // 0f32: invokevirtual Class_jb.c (II)V
      // 0f35: iload 33
      // 0f37: ifeq 15de
      // 0f3a: aload 11
      // 0f3c: getfield Class_ha.Kc I
      // 0f3f: bipush 6
      // 0f41: if_icmpne 1229
      // 0f44: iload 1
      // 0f45: sipush 21644
      // 0f48: iadd
      // 0f49: aload 11
      // 0f4b: invokestatic Class_oi.a (ILClass_ha;)Z
      // 0f4e: istore 20
      // 0f50: aconst_null
      // 0f51: astore 22
      // 0f53: iload 20
      // 0f55: ifeq 0f64
      // 0f58: aload 11
      // 0f5a: getfield Class_ha.jc I
      // 0f5d: istore 21
      // 0f5f: iload 33
      // 0f61: ifeq 0f6b
      // 0f64: aload 11
      // 0f66: getfield Class_ha.xb I
      // 0f69: istore 21
      // 0f6b: bipush 0
      // 0f6c: istore 23
      // 0f6e: aload 11
      // 0f70: getfield Class_ha.Q I
      // 0f73: bipush -1
      // 0f74: ixor
      // 0f75: ifne 107a
      // 0f78: aload 11
      // 0f7a: getfield Class_ha.fc I
      // 0f7d: bipush -1
      // 0f7e: ixor
      // 0f7f: bipush -6
      // 0f81: if_icmpne 1014
      // 0f84: aload 11
      // 0f86: getfield Class_ha.V I
      // 0f89: bipush -1
      // 0f8a: ixor
      // 0f8b: ifeq 1003
      // 0f8e: sipush 2047
      // 0f91: aload 11
      // 0f93: getfield Class_ha.V I
      // 0f96: iand
      // 0f97: istore 24
      // 0f99: iload 24
      // 0f9b: bipush -1
      // 0f9c: ixor
      // 0f9d: getstatic Class_kg.A I
      // 0fa0: bipush -1
      // 0fa1: ixor
      // 0fa2: if_icmpne 0faa
      // 0fa5: sipush 2047
      // 0fa8: istore 24
      // 0faa: getstatic Class_db.Q [LClass_fa;
      // 0fad: iload 24
      // 0faf: aaload
      // 0fb0: astore 25
      // 0fb2: iload 21
      // 0fb4: bipush -1
      // 0fb5: ixor
      // 0fb6: ifne 0fbd
      // 0fb9: aconst_null
      // 0fba: goto 0fc4
      // 0fbd: bipush -36
      // 0fbf: iload 21
      // 0fc1: invokestatic Class_kk.a (BI)LClass_uc;
      // 0fc4: astore 26
      // 0fc6: aload 25
      // 0fc8: ifnull 10db
      // 0fcb: aload 25
      // 0fcd: getfield Class_fa.Zb LClass_r;
      // 0fd0: sipush 10908
      // 0fd3: invokevirtual Class_r.f (I)J
      // 0fd6: l2i
      // 0fd7: ldc_w -2035566133
      // 0fda: ishl
      // 0fdb: bipush -1
      // 0fdc: ixor
      // 0fdd: sipush -2048
      // 0fe0: aload 11
      // 0fe2: getfield Class_ha.V I
      // 0fe5: iand
      // 0fe6: bipush -1
      // 0fe7: ixor
      // 0fe8: if_icmpne 10db
      // 0feb: aload 25
      // 0fed: getfield Class_fa.Vb LClass_wf;
      // 0ff0: aload 11
      // 0ff2: getfield Class_ha.a I
      // 0ff5: aload 26
      // 0ff7: bipush 0
      // 0ff8: aconst_null
      // 0ff9: bipush 46
      // 0ffb: invokevirtual Class_wf.a (ILClass_uc;ILClass_uc;B)LClass_jh;
      // 0ffe: astore 22
      // 1000: goto 10db
      // 1003: getstatic Class_te.U LClass_wf;
      // 1006: bipush -1
      // 1007: aconst_null
      // 1008: bipush -1
      // 1009: aconst_null
      // 100a: bipush 99
      // 100c: invokevirtual Class_wf.a (ILClass_uc;ILClass_uc;B)LClass_jh;
      // 100f: astore 22
      // 1011: goto 10db
      // 1014: iload 21
      // 1016: bipush -1
      // 1017: ixor
      // 1018: ifne 1044
      // 101b: aload 11
      // 101d: bipush -1
      // 101e: iload 20
      // 1020: bipush -27
      // 1022: getstatic Class_gg.B LClass_fa;
      // 1025: getfield Class_fa.Vb LClass_wf;
      // 1028: aconst_null
      // 1029: invokevirtual Class_ha.a (IZBLClass_wf;LClass_uc;)LClass_jh;
      // 102c: astore 22
      // 102e: aload 22
      // 1030: ifnonnull 10db
      // 1033: getstatic Class_pd.j Z
      // 1036: ifeq 10db
      // 1039: aload 11
      // 103b: sipush -128
      // 103e: invokestatic Class_tg.a (LClass_ha;I)V
      // 1041: goto 10db
      // 1044: bipush -36
      // 1046: iload 21
      // 1048: invokestatic Class_kk.a (BI)LClass_uc;
      // 104b: astore 24
      // 104d: aload 11
      // 104f: aload 11
      // 1051: getfield Class_ha.a I
      // 1054: iload 20
      // 1056: bipush -27
      // 1058: getstatic Class_gg.B LClass_fa;
      // 105b: getfield Class_fa.Vb LClass_wf;
      // 105e: aload 24
      // 1060: invokevirtual Class_ha.a (IZBLClass_wf;LClass_uc;)LClass_jh;
      // 1063: astore 22
      // 1065: aload 22
      // 1067: ifnonnull 10db
      // 106a: getstatic Class_pd.j Z
      // 106d: ifeq 10db
      // 1070: aload 11
      // 1072: bipush -115
      // 1074: invokestatic Class_tg.a (LClass_ha;I)V
      // 1077: goto 10db
      // 107a: sipush -25672
      // 107d: aload 11
      // 107f: getfield Class_ha.Q I
      // 1082: invokestatic Class_ra.a (II)LClass_cf;
      // 1085: astore 24
      // 1087: aload 24
      // 1089: ifnull 10db
      // 108c: aload 24
      // 108e: aload 11
      // 1090: getfield Class_ha.dd I
      // 1093: bipush -126
      // 1095: invokevirtual Class_cf.b (II)LClass_cf;
      // 1098: astore 24
      // 109a: iload 21
      // 109c: bipush -1
      // 109d: if_icmpeq 10aa
      // 10a0: bipush -36
      // 10a2: iload 21
      // 10a4: invokestatic Class_kk.a (BI)LClass_uc;
      // 10a7: goto 10ab
      // 10aa: aconst_null
      // 10ab: astore 25
      // 10ad: aload 24
      // 10af: bipush 1
      // 10b0: aload 25
      // 10b2: aload 11
      // 10b4: getfield Class_ha.a I
      // 10b7: sipush 13895
      // 10ba: invokevirtual Class_cf.a (ILClass_uc;II)LClass_jh;
      // 10bd: astore 22
      // 10bf: aload 22
      // 10c1: ifnonnull 10d1
      // 10c4: aload 11
      // 10c6: sipush -128
      // 10c9: invokestatic Class_tg.a (LClass_ha;I)V
      // 10cc: iload 33
      // 10ce: ifeq 10db
      // 10d1: aload 22
      // 10d3: invokevirtual Class_jh.a ()I
      // 10d6: ineg
      // 10d7: bipush 2
      // 10d8: idiv
      // 10d9: istore 23
      // 10db: aload 22
      // 10dd: ifnull 15de
      // 10e0: aload 11
      // 10e2: getfield Class_ha.L I
      // 10e5: ifgt 10f2
      // 10e8: sipush 256
      // 10eb: istore 24
      // 10ed: iload 33
      // 10ef: ifeq 1103
      // 10f2: aload 11
      // 10f4: getfield Class_ha.Gc I
      // 10f7: ldc_w -2121766488
      // 10fa: ishl
      // 10fb: aload 11
      // 10fd: getfield Class_ha.L I
      // 1100: idiv
      // 1101: istore 24
      // 1103: aload 11
      // 1105: getfield Class_ha.xc I
      // 1108: bipush -1
      // 1109: ixor
      // 110a: bipush -1
      // 110b: if_icmpge 1124
      // 110e: aload 11
      // 1110: getfield Class_ha.nc I
      // 1113: ldc_w -830447320
      // 1116: ishl
      // 1117: aload 11
      // 1119: getfield Class_ha.xc I
      // 111c: idiv
      // 111d: istore 25
      // 111f: iload 33
      // 1121: ifeq 1129
      // 1124: sipush 256
      // 1127: istore 25
      // 1129: aload 11
      // 112b: getfield Class_ha.nc I
      // 112e: bipush 2
      // 112f: idiv
      // 1130: iload 14
      // 1132: iadd
      // 1133: iload 25
      // 1135: aload 11
      // 1137: getfield Class_ha.ib I
      // 113a: imul
      // 113b: ldc_w 1319467880
      // 113e: ishr
      // 113f: iadd
      // 1140: istore 27
      // 1142: aload 11
      // 1144: getfield Class_ha.Gc I
      // 1147: bipush 2
      // 1148: idiv
      // 1149: iload 13
      // 114b: iadd
      // 114c: aload 11
      // 114e: getfield Class_ha.Xb I
      // 1151: iload 24
      // 1153: imul
      // 1154: ldc_w 860822824
      // 1157: ishr
      // 1158: iadd
      // 1159: istore 26
      // 115b: iload 26
      // 115d: iload 27
      // 115f: invokestatic Class_kd.a (II)V
      // 1162: getstatic Class_kd.e [I
      // 1165: aload 11
      // 1167: getfield Class_ha.ec I
      // 116a: iaload
      // 116b: aload 11
      // 116d: getfield Class_ha.g I
      // 1170: imul
      // 1171: ldc_w -11452624
      // 1174: ishr
      // 1175: istore 28
      // 1177: aload 11
      // 1179: getfield Class_ha.g I
      // 117c: getstatic Class_kd.q [I
      // 117f: aload 11
      // 1181: getfield Class_ha.ec I
      // 1184: iaload
      // 1185: imul
      // 1186: ldc_w 1627033072
      // 1189: ishr
      // 118a: istore 29
      // 118c: aload 11
      // 118e: getfield Class_ha.dc Z
      // 1191: ifne 11af
      // 1194: aload 22
      // 1196: bipush 0
      // 1197: aload 11
      // 1199: getfield Class_ha.gb I
      // 119c: bipush 0
      // 119d: aload 11
      // 119f: getfield Class_ha.ec I
      // 11a2: bipush 0
      // 11a3: iload 28
      // 11a5: iload 29
      // 11a7: invokevirtual Class_jh.a (IIIIIII)V
      // 11aa: iload 33
      // 11ac: ifeq 1221
      // 11af: aload 11
      // 11b1: getfield Class_ha.fb Z
      // 11b4: ifne 11eb
      // 11b7: aload 22
      // 11b9: bipush 0
      // 11ba: aload 11
      // 11bc: getfield Class_ha.gb I
      // 11bf: aload 11
      // 11c1: getfield Class_ha.Tb I
      // 11c4: aload 11
      // 11c6: getfield Class_ha.ec I
      // 11c9: aload 11
      // 11cb: getfield Class_ha.z I
      // 11ce: aload 11
      // 11d0: getfield Class_ha.Ib I
      // 11d3: iload 28
      // 11d5: iadd
      // 11d6: iload 23
      // 11d8: ineg
      // 11d9: isub
      // 11da: iload 29
      // 11dc: aload 11
      // 11de: getfield Class_ha.Ib I
      // 11e1: ineg
      // 11e2: isub
      // 11e3: invokevirtual Class_jh.a (IIIIIII)V
      // 11e6: iload 33
      // 11e8: ifeq 1221
      // 11eb: aload 22
      // 11ed: checkcast Class_qa
      // 11f0: bipush 0
      // 11f1: aload 11
      // 11f3: getfield Class_ha.gb I
      // 11f6: aload 11
      // 11f8: getfield Class_ha.Tb I
      // 11fb: aload 11
      // 11fd: getfield Class_ha.ec I
      // 1200: aload 11
      // 1202: getfield Class_ha.z I
      // 1205: iload 28
      // 1207: iload 23
      // 1209: aload 11
      // 120b: getfield Class_ha.Ib I
      // 120e: ineg
      // 120f: isub
      // 1210: iadd
      // 1211: iload 29
      // 1213: aload 11
      // 1215: getfield Class_ha.Ib I
      // 1218: iadd
      // 1219: aload 11
      // 121b: getfield Class_ha.g I
      // 121e: invokevirtual Class_qa.b (IIIIIIII)V
      // 1221: invokestatic Class_kd.e ()V
      // 1224: iload 33
      // 1226: ifeq 15de
      // 1229: aload 11
      // 122b: getfield Class_ha.Kc I
      // 122e: bipush -1
      // 122f: ixor
      // 1230: bipush -8
      // 1232: if_icmpne 13b1
      // 1235: aload 11
      // 1237: bipush -92
      // 1239: getstatic Class_lh.Cb [LClass_pc;
      // 123c: invokevirtual Class_ha.a (I[LClass_pc;)LClass_af;
      // 123f: astore 20
      // 1241: aload 20
      // 1243: ifnonnull 1258
      // 1246: getstatic Class_pd.j Z
      // 1249: ifeq 15de
      // 124c: aload 11
      // 124e: bipush -116
      // 1250: invokestatic Class_tg.a (LClass_ha;I)V
      // 1253: iload 33
      // 1255: ifeq 15de
      // 1258: bipush 0
      // 1259: istore 21
      // 125b: bipush 0
      // 125c: istore 22
      // 125e: iload 33
      // 1260: ifeq 13a7
      // 1263: bipush 0
      // 1264: istore 23
      // 1266: iload 33
      // 1268: ifeq 1396
      // 126b: aload 11
      // 126d: getfield Class_ha.N [I
      // 1270: iload 21
      // 1272: iaload
      // 1273: ifle 1390
      // 1276: iload 1
      // 1277: sipush -4028
      // 127a: iadd
      // 127b: aload 11
      // 127d: getfield Class_ha.N [I
      // 1280: iload 21
      // 1282: iaload
      // 1283: bipush 1
      // 1284: isub
      // 1285: invokestatic Class_ra.a (II)LClass_cf;
      // 1288: astore 24
      // 128a: aload 24
      // 128c: getfield Class_cf.cb I
      // 128f: bipush -1
      // 1290: ixor
      // 1291: bipush -2
      // 1293: if_icmpeq 12a2
      // 1296: aload 11
      // 1298: getfield Class_ha.s [I
      // 129b: iload 21
      // 129d: iaload
      // 129e: bipush 1
      // 129f: if_icmpeq 12d6
      // 12a2: bipush 2
      // 12a3: bipush 4
      // 12a4: anewarray 321
      // 12a7: dup
      // 12a8: bipush 0
      // 12a9: getstatic Class_hj.U LClass_r;
      // 12ac: aastore
      // 12ad: dup
      // 12ae: bipush 1
      // 12af: aload 24
      // 12b1: getfield Class_cf.J LClass_r;
      // 12b4: aastore
      // 12b5: dup
      // 12b6: bipush 2
      // 12b7: getstatic Class_hj.Z LClass_r;
      // 12ba: aastore
      // 12bb: dup
      // 12bc: bipush 3
      // 12bd: aload 11
      // 12bf: getfield Class_ha.s [I
      // 12c2: iload 21
      // 12c4: iaload
      // 12c5: sipush -5344
      // 12c8: invokestatic Class_vh.b (II)LClass_r;
      // 12cb: aastore
      // 12cc: invokestatic Class_o.a (I[LClass_r;)LClass_r;
      // 12cf: astore 25
      // 12d1: iload 33
      // 12d3: ifeq 12f4
      // 12d6: bipush 2
      // 12d7: bipush 3
      // 12d8: anewarray 321
      // 12db: dup
      // 12dc: bipush 0
      // 12dd: getstatic Class_hj.U LClass_r;
      // 12e0: aastore
      // 12e1: dup
      // 12e2: bipush 1
      // 12e3: aload 24
      // 12e5: getfield Class_cf.J LClass_r;
      // 12e8: aastore
      // 12e9: dup
      // 12ea: bipush 2
      // 12eb: getstatic Class_r.S LClass_r;
      // 12ee: aastore
      // 12ef: invokestatic Class_o.a (I[LClass_r;)LClass_r;
      // 12f2: astore 25
      // 12f4: bipush 115
      // 12f6: aload 11
      // 12f8: getfield Class_ha.zc I
      // 12fb: ineg
      // 12fc: isub
      // 12fd: iload 23
      // 12ff: imul
      // 1300: iload 13
      // 1302: iadd
      // 1303: istore 26
      // 1305: iload 14
      // 1307: aload 11
      // 1309: getfield Class_ha.Mb I
      // 130c: bipush 12
      // 130e: iadd
      // 130f: iload 22
      // 1311: imul
      // 1312: ineg
      // 1313: isub
      // 1314: istore 27
      // 1316: aload 11
      // 1318: getfield Class_ha.v I
      // 131b: ifeq 1373
      // 131e: aload 11
      // 1320: getfield Class_ha.v I
      // 1323: bipush 1
      // 1324: if_icmpne 134c
      // 1327: aload 20
      // 1329: aload 25
      // 132b: bipush 57
      // 132d: iload 26
      // 132f: iadd
      // 1330: iload 27
      // 1332: aload 11
      // 1334: getfield Class_ha.yb I
      // 1337: aload 11
      // 1339: getfield Class_ha.f Z
      // 133c: ifne 1343
      // 133f: bipush -1
      // 1340: goto 1344
      // 1343: bipush 0
      // 1344: invokevirtual Class_af.c (LClass_r;IIII)V
      // 1347: iload 33
      // 1349: ifeq 1390
      // 134c: aload 20
      // 134e: aload 25
      // 1350: bipush -1
      // 1351: iload 26
      // 1353: bipush 115
      // 1355: iadd
      // 1356: iadd
      // 1357: iload 27
      // 1359: aload 11
      // 135b: getfield Class_ha.yb I
      // 135e: aload 11
      // 1360: getfield Class_ha.f Z
      // 1363: ifeq 136a
      // 1366: bipush 0
      // 1367: goto 136b
      // 136a: bipush -1
      // 136b: invokevirtual Class_af.a (LClass_r;IIII)V
      // 136e: iload 33
      // 1370: ifeq 1390
      // 1373: aload 20
      // 1375: aload 25
      // 1377: iload 26
      // 1379: iload 27
      // 137b: aload 11
      // 137d: getfield Class_ha.yb I
      // 1380: aload 11
      // 1382: getfield Class_ha.f Z
      // 1385: ifeq 138c
      // 1388: bipush 0
      // 1389: goto 138d
      // 138c: bipush -1
      // 138d: invokevirtual Class_af.b (LClass_r;IIII)V
      // 1390: iinc 21 1
      // 1393: iinc 23 1
      // 1396: aload 11
      // 1398: getfield Class_ha.r I
      // 139b: bipush -1
      // 139c: ixor
      // 139d: iload 23
      // 139f: bipush -1
      // 13a0: ixor
      // 13a1: if_icmplt 126b
      // 13a4: iinc 22 1
      // 13a7: aload 11
      // 13a9: getfield Class_ha.Nc I
      // 13ac: iload 22
      // 13ae: if_icmpgt 1263
      // 13b1: aload 11
      // 13b3: getfield Class_ha.Kc I
      // 13b6: bipush -1
      // 13b7: ixor
      // 13b8: bipush -9
      // 13ba: if_icmpne 1553
      // 13bd: getstatic Class_vb.i LClass_ha;
      // 13c0: aload 11
      // 13c2: if_acmpne 1553
      // 13c5: getstatic Class_jg.j I
      // 13c8: getstatic Class_pf.f I
      // 13cb: if_icmpne 1553
      // 13ce: bipush 0
      // 13cf: istore 20
      // 13d1: bipush 0
      // 13d2: istore 21
      // 13d4: getstatic Class_fi.A LClass_af;
      // 13d7: astore 22
      // 13d9: aload 11
      // 13db: getfield Class_ha.vc LClass_r;
      // 13de: astore 23
      // 13e0: aload 23
      // 13e2: iload 1
      // 13e3: ldc_w 49401
      // 13e6: iadd
      // 13e7: aload 11
      // 13e9: invokestatic Class_cd.a (LClass_r;ILClass_ha;)LClass_r;
      // 13ec: astore 23
      // 13ee: iload 33
      // 13f0: ifeq 144c
      // 13f3: aload 23
      // 13f5: bipush 61
      // 13f7: getstatic Class_ud.i LClass_r;
      // 13fa: invokevirtual Class_r.a (ILClass_r;)I
      // 13fd: istore 25
      // 13ff: iload 25
      // 1401: bipush -1
      // 1402: ixor
      // 1403: ifne 1414
      // 1406: aload 23
      // 1408: astore 24
      // 140a: getstatic Class_hk.S LClass_r;
      // 140d: astore 23
      // 140f: iload 33
      // 1411: ifeq 142c
      // 1414: aload 23
      // 1416: bipush 0
      // 1417: bipush -74
      // 1419: iload 25
      // 141b: invokevirtual Class_r.a (IBI)LClass_r;
      // 141e: astore 24
      // 1420: aload 23
      // 1422: bipush 4
      // 1423: iload 25
      // 1425: iadd
      // 1426: bipush 1
      // 1427: invokevirtual Class_r.b (IZ)LClass_r;
      // 142a: astore 23
      // 142c: aload 22
      // 142e: aload 24
      // 1430: invokevirtual Class_af.c (LClass_r;)I
      // 1433: istore 26
      // 1435: iload 26
      // 1437: iload 20
      // 1439: if_icmple 1440
      // 143c: iload 26
      // 143e: istore 20
      // 1440: iload 21
      // 1442: aload 22
      // 1444: getfield Class_af.K I
      // 1447: bipush 1
      // 1448: iadd
      // 1449: iadd
      // 144a: istore 21
      // 144c: aload 23
      // 144e: bipush -117
      // 1450: invokevirtual Class_r.d (B)I
      // 1453: ifgt 13f3
      // 1456: iinc 20 6
      // 1459: iinc 21 7
      // 145c: iload 20
      // 145e: ineg
      // 145f: bipush -5
      // 1461: iload 13
      // 1463: aload 11
      // 1465: getfield Class_ha.Gc I
      // 1468: ineg
      // 1469: isub
      // 146a: iadd
      // 146b: iadd
      // 146c: istore 25
      // 146e: iload 14
      // 1470: aload 11
      // 1472: getfield Class_ha.nc I
      // 1475: ineg
      // 1476: bipush -5
      // 1478: iadd
      // 1479: isub
      // 147a: istore 26
      // 147c: iload 0
      // 147d: bipush -1
      // 147e: ixor
      // 147f: iload 26
      // 1481: iload 21
      // 1483: iadd
      // 1484: bipush -1
      // 1485: ixor
      // 1486: if_icmple 1490
      // 1489: iload 21
      // 148b: ineg
      // 148c: iload 0
      // 148d: iadd
      // 148e: istore 26
      // 1490: iload 25
      // 1492: iload 13
      // 1494: bipush 5
      // 1495: iadd
      // 1496: if_icmpge 149f
      // 1499: bipush 5
      // 149a: iload 13
      // 149c: iadd
      // 149d: istore 25
      // 149f: iload 25
      // 14a1: iload 20
      // 14a3: iadd
      // 14a4: bipush -1
      // 14a5: ixor
      // 14a6: iload 4
      // 14a8: bipush -1
      // 14a9: ixor
      // 14aa: if_icmpge 14b5
      // 14ad: iload 20
      // 14af: ineg
      // 14b0: iload 4
      // 14b2: iadd
      // 14b3: istore 25
      // 14b5: iload 25
      // 14b7: iload 26
      // 14b9: iload 20
      // 14bb: iload 21
      // 14bd: ldc_w 16777120
      // 14c0: invokestatic Class_nc.f (IIIII)V
      // 14c3: iload 25
      // 14c5: iload 26
      // 14c7: iload 20
      // 14c9: iload 21
      // 14cb: bipush 0
      // 14cc: invokestatic Class_nc.a (IIIII)V
      // 14cf: aload 11
      // 14d1: getfield Class_ha.vc LClass_r;
      // 14d4: astore 23
      // 14d6: aload 22
      // 14d8: getfield Class_af.K I
      // 14db: iload 26
      // 14dd: bipush 2
      // 14de: iadd
      // 14df: iadd
      // 14e0: istore 27
      // 14e2: aload 23
      // 14e4: sipush 27757
      // 14e7: aload 11
      // 14e9: invokestatic Class_cd.a (LClass_r;ILClass_ha;)LClass_r;
      // 14ec: astore 23
      // 14ee: iload 33
      // 14f0: ifeq 1549
      // 14f3: aload 23
      // 14f5: bipush 92
      // 14f7: getstatic Class_ud.i LClass_r;
      // 14fa: invokevirtual Class_r.a (ILClass_r;)I
      // 14fd: istore 28
      // 14ff: iload 28
      // 1501: bipush -1
      // 1502: ixor
      // 1503: ifne 1514
      // 1506: aload 23
      // 1508: astore 24
      // 150a: getstatic Class_hk.S LClass_r;
      // 150d: astore 23
      // 150f: iload 33
      // 1511: ifeq 152d
      // 1514: aload 23
      // 1516: bipush 0
      // 1517: bipush -74
      // 1519: iload 28
      // 151b: invokevirtual Class_r.a (IBI)LClass_r;
      // 151e: astore 24
      // 1520: aload 23
      // 1522: iload 28
      // 1524: bipush -4
      // 1526: isub
      // 1527: bipush 1
      // 1528: invokevirtual Class_r.b (IZ)LClass_r;
      // 152b: astore 23
      // 152d: aload 22
      // 152f: aload 24
      // 1531: iload 25
      // 1533: bipush -3
      // 1535: isub
      // 1536: iload 27
      // 1538: bipush 0
      // 1539: bipush -1
      // 153a: invokevirtual Class_af.b (LClass_r;IIII)V
      // 153d: iload 27
      // 153f: aload 22
      // 1541: getfield Class_af.K I
      // 1544: bipush -1
      // 1545: isub
      // 1546: iadd
      // 1547: istore 27
      // 1549: aload 23
      // 154b: bipush -102
      // 154d: invokevirtual Class_r.d (B)I
      // 1550: ifgt 14f3
      // 1553: aload 11
      // 1555: getfield Class_ha.Kc I
      // 1558: bipush -1
      // 1559: ixor
      // 155a: bipush -10
      // 155c: if_icmpne 15de
      // 155f: aload 11
      // 1561: getfield Class_ha.Ic Z
      // 1564: ifeq 1589
      // 1567: iload 14
      // 1569: istore 23
      // 156b: iload 13
      // 156d: istore 20
      // 156f: iload 13
      // 1571: aload 11
      // 1573: getfield Class_ha.Gc I
      // 1576: ineg
      // 1577: isub
      // 1578: istore 22
      // 157a: iload 14
      // 157c: aload 11
      // 157e: getfield Class_ha.nc I
      // 1581: iadd
      // 1582: istore 21
      // 1584: iload 33
      // 1586: ifeq 15a5
      // 1589: iload 13
      // 158b: istore 20
      // 158d: aload 11
      // 158f: getfield Class_ha.nc I
      // 1592: iload 14
      // 1594: iadd
      // 1595: istore 23
      // 1597: iload 14
      // 1599: istore 21
      // 159b: aload 11
      // 159d: getfield Class_ha.Gc I
      // 15a0: iload 13
      // 15a2: iadd
      // 15a3: istore 22
      // 15a5: aload 11
      // 15a7: getfield Class_ha.ob I
      // 15aa: bipush -1
      // 15ab: ixor
      // 15ac: bipush -2
      // 15ae: if_icmpeq 15cb
      // 15b1: iload 20
      // 15b3: iload 21
      // 15b5: iload 22
      // 15b7: iload 23
      // 15b9: aload 11
      // 15bb: getfield Class_ha.yb I
      // 15be: aload 11
      // 15c0: getfield Class_ha.ob I
      // 15c3: invokestatic Class_nc.a (IIIIII)V
      // 15c6: iload 33
      // 15c8: ifeq 15de
      // 15cb: iload 20
      // 15cd: iload 21
      // 15cf: iload 22
      // 15d1: iload 23
      // 15d3: aload 11
      // 15d5: getfield Class_ha.yb I
      // 15d8: invokestatic Class_nc.b (IIIII)V
      // 15db: goto 15de
      // 15de: iinc 10 1
      // 15e1: iload 10
      // 15e3: aload 3
      // 15e4: arraylength
      // 15e5: if_icmplt 0029
      // 15e8: return
      // 15e9: astore 10
      // 15eb: aload 10
      // 15ed: new java/lang/StringBuffer
      // 15f0: dup
      // 15f1: ldc_w "oi.E("
      // 15f4: invokespecial java/lang/StringBuffer.<init> (Ljava/lang/String;)V
      // 15f7: iload 0
      // 15f8: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 15fb: bipush 44
      // 15fd: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 1600: iload 1
      // 1601: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 1604: bipush 44
      // 1606: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 1609: iload 2
      // 160a: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 160d: bipush 44
      // 160f: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 1612: aload 3
      // 1613: ifnull 161b
      // 1616: ldc "{...}"
      // 1618: goto 161d
      // 161b: ldc "null"
      // 161d: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 1620: bipush 44
      // 1622: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 1625: iload 4
      // 1627: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 162a: bipush 44
      // 162c: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 162f: iload 5
      // 1631: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 1634: bipush 44
      // 1636: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 1639: iload 6
      // 163b: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 163e: bipush 44
      // 1640: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 1643: iload 7
      // 1645: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 1648: bipush 44
      // 164a: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 164d: iload 8
      // 164f: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 1652: bipush 44
      // 1654: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 1657: iload 9
      // 1659: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 165c: bipush 41
      // 165e: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 1661: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 1664: invokestatic Class_sh.a (Ljava/lang/Throwable;Ljava/lang/String;)LClass_ua;
      // 1667: athrow
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final boolean a(int var0, Class_ha var1) {
      int var5 = client.lb;

      try {
         s++;
         if (var1.O == null) {
            return false;
         } else {
            int var2 = var0;
            if (var5 == 0 && ~var0 <= ~var1.O.length) {
               return true;
            } else {
               do {
                  int var3 = Class_ug.a(var2, var0 + 20, var1);
                  int var4 = var1.J[var2];
                  if (var1.O[var2] == 2) {
                     if (~var4 >= ~var3) {
                        return false;
                     }
                  } else if (~var1.O[var2] != -4) {
                     if (~var1.O[var2] != -5) {
                        if (var3 != var4) {
                           return false;
                        }
                     } else if (var4 == var3) {
                        return false;
                     }
                  } else if (~var4 <= ~var3) {
                     return false;
                  }
               } while (~(++var2) > ~var1.O.length);

               return true;
            }
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "oi.F(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   static final void a(byte var0) {
      try {
         v++;
         Class_ha.gd.b((byte)94);
         if (var0 >= -45) {
            a(7, 117, -119);
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "oi.G(" + var0 + ')');
      }
   }

   static final int b(int var0, int var1, int var2) {
      try {
         if (var2 != 16) {
            a(124, 106, 95);
         }

         w++;
         int var3 = Class_tc.a(133988164, var1 - 1, -1 + var0)
            - -Class_tc.a(133988164, -1 + var1, 1 + var0)
            - (-Class_tc.a(133988164, var1 - -1, -1 + var0) - Class_tc.a(133988164, 1 + var1, var0 - -1));
         int var4 = Class_tc.a(133988164, var1, -1 + var0)
            + Class_tc.a(133988164, var1, 1 + var0)
            + (Class_tc.a(133988164, -1 + var1, var0) - -Class_tc.a(var2 ^ 133988180, 1 + var1, var0));
         int var5 = Class_tc.a(133988164, var1, var0);
         return var4 / 8 + (var3 / 16 - -(var5 / 4));
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "oi.A(" + var0 + 44 + var1 + 44 + var2 + 41);
      }
   }

   public Class_oi() {
   }
}
