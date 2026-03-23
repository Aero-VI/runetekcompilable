import java.util.zip.Inflater;

final class Class_th {
   private Inflater a;
   static int b = -1;
   static Class_r c = Class_tc.a(43, "blinken3:");
   static int d = 0;
   static Class_r e = Class_tc.a(43, "k");
   static int f;
   static Class_r g = Class_tc.a(43, " )2> <col=00ffff>");
   static int h;
   static Class_r i = Class_tc.a(43, "Spielwelt erstellt)3");
   static int j;
   static int k;
   static int l;
   static int m;
   static byte[][] n = new byte[1000][];
   static int o;

   final void a(Class_lh var1, int var2, byte[] var3) {
      try {
         l++;
         if (~var1.E[var1.p] == -32 && ~var1.E[1 + var1.p] == 116) {
            if (this.a == null) {
               this.a = new Inflater(true);
            }

            try {
               this.a.setInput(var1.E, var1.p + 10, -var1.p - (10 - (-8 + var1.E.length)));
               this.a.inflate(var3);
            } catch (Exception var5) {
               this.a.reset();
               throw new RuntimeException("Invalid GZIP compressed data!");
            }

            if (var2 < 98) {
               b(-48);
            }

            this.a.reset();
         } else {
            throw new RuntimeException("Invalid GZIP header!");
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "th.D(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
      }
   }

   public static void a(boolean var0) {
      try {
         e = null;
         g = null;
         if (!var0) {
            b = 70;
         }

         c = null;
         i = null;
         n = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "th.C(" + var0 + ')');
      }
   }

   static final void a(byte param0, boolean param1, Class_ga[] param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic client.lb I
      // 003: istore 38
      // 005: getstatic Class_th.h I
      // 008: bipush 1
      // 009: iadd
      // 00a: putstatic Class_th.h I
      // 00d: iload 0
      // 00e: bipush -111
      // 010: if_icmpeq 017
      // 013: bipush 1
      // 014: invokestatic Class_th.a (Z)V
      // 017: iload 1
      // 018: ifne 022
      // 01b: bipush 4
      // 01c: istore 3
      // 01d: iload 38
      // 01f: ifeq 024
      // 022: bipush 1
      // 023: istore 3
      // 024: iload 1
      // 025: ifne 0f8
      // 028: bipush 0
      // 029: istore 4
      // 02b: iload 38
      // 02d: ifeq 099
      // 030: bipush 0
      // 031: istore 5
      // 033: iload 38
      // 035: ifeq 08f
      // 038: bipush 0
      // 039: istore 6
      // 03b: iload 38
      // 03d: ifeq 085
      // 040: bipush 1
      // 041: getstatic Class_kk.c [[[B
      // 044: iload 4
      // 046: aaload
      // 047: iload 5
      // 049: aaload
      // 04a: iload 6
      // 04c: baload
      // 04d: iand
      // 04e: bipush -1
      // 04f: ixor
      // 050: bipush -2
      // 052: if_icmpne 082
      // 055: iload 4
      // 057: istore 7
      // 059: getstatic Class_kk.c [[[B
      // 05c: bipush 1
      // 05d: aaload
      // 05e: iload 5
      // 060: aaload
      // 061: iload 6
      // 063: baload
      // 064: bipush 2
      // 065: iand
      // 066: bipush -1
      // 067: ixor
      // 068: bipush -3
      // 06a: if_icmpne 070
      // 06d: iinc 7 -1
      // 070: iload 7
      // 072: iflt 082
      // 075: aload 2
      // 076: iload 7
      // 078: aaload
      // 079: iload 6
      // 07b: bipush -52
      // 07d: iload 5
      // 07f: invokevirtual Class_ga.a (IBI)V
      // 082: iinc 6 1
      // 085: iload 6
      // 087: bipush 104
      // 089: if_icmplt 040
      // 08c: iinc 5 1
      // 08f: iload 5
      // 091: bipush 104
      // 093: if_icmplt 038
      // 096: iinc 4 1
      // 099: iload 4
      // 09b: bipush 4
      // 09c: if_icmplt 030
      // 09f: getstatic Class_cb.E I
      // 0a2: bipush -2
      // 0a4: ldc2_w 5.0
      // 0a7: invokestatic java/lang/Math.random ()D
      // 0aa: dmul
      // 0ab: d2i
      // 0ac: iadd
      // 0ad: iadd
      // 0ae: putstatic Class_cb.E I
      // 0b1: getstatic Class_b.bb I
      // 0b4: invokestatic java/lang/Math.random ()D
      // 0b7: ldc2_w 5.0
      // 0ba: dmul
      // 0bb: d2i
      // 0bc: bipush 2
      // 0bd: isub
      // 0be: iadd
      // 0bf: putstatic Class_b.bb I
      // 0c2: getstatic Class_cb.E I
      // 0c5: bipush -16
      // 0c7: if_icmpge 0cf
      // 0ca: bipush -16
      // 0cc: putstatic Class_cb.E I
      // 0cf: getstatic Class_b.bb I
      // 0d2: bipush -8
      // 0d4: if_icmpge 0dc
      // 0d7: bipush -8
      // 0d9: putstatic Class_b.bb I
      // 0dc: getstatic Class_b.bb I
      // 0df: bipush 8
      // 0e1: if_icmple 0e9
      // 0e4: bipush 8
      // 0e6: putstatic Class_b.bb I
      // 0e9: getstatic Class_cb.E I
      // 0ec: bipush -1
      // 0ed: ixor
      // 0ee: bipush -17
      // 0f0: if_icmpge 0f8
      // 0f3: bipush 16
      // 0f5: putstatic Class_cb.E I
      // 0f8: bipush 104
      // 0fa: bipush 104
      // 0fc: multianewarray 153 2
      // 100: astore 7
      // 102: bipush 104
      // 104: bipush 104
      // 106: multianewarray 153 2
      // 10a: astore 6
      // 10c: getstatic Class_b.bb I
      // 10f: ldc 637325858
      // 111: ishr
      // 112: ldc 414480426
      // 114: ishl
      // 115: istore 4
      // 117: getstatic Class_cb.E I
      // 11a: ldc 143231457
      // 11c: ishr
      // 11d: istore 5
      // 11f: bipush 0
      // 120: istore 8
      // 122: iload 38
      // 124: ifeq 86e
      // 127: getstatic Class_ga.u [[[B
      // 12a: iload 8
      // 12c: aaload
      // 12d: astore 9
      // 12f: ldc2_w 5100.0
      // 132: invokestatic java/lang/Math.sqrt (D)D
      // 135: d2i
      // 136: istore 10
      // 138: sipush 768
      // 13b: iload 10
      // 13d: imul
      // 13e: ldc 1083611208
      // 140: ishr
      // 141: istore 11
      // 143: bipush 1
      // 144: istore 12
      // 146: iload 38
      // 148: ifeq 241
      // 14b: bipush 1
      // 14c: istore 13
      // 14e: iload 38
      // 150: ifeq 237
      // 153: getstatic Class_mi.U [[[I
      // 156: iload 8
      // 158: aaload
      // 159: bipush 1
      // 15a: iload 13
      // 15c: iadd
      // 15d: aaload
      // 15e: iload 12
      // 160: iaload
      // 161: getstatic Class_mi.U [[[I
      // 164: iload 8
      // 166: aaload
      // 167: bipush -1
      // 168: iload 13
      // 16a: iadd
      // 16b: aaload
      // 16c: iload 12
      // 16e: iaload
      // 16f: ineg
      // 170: iadd
      // 171: istore 15
      // 173: bipush 74
      // 175: istore 14
      // 177: getstatic Class_mi.U [[[I
      // 17a: iload 8
      // 17c: aaload
      // 17d: iload 13
      // 17f: aaload
      // 180: iload 12
      // 182: bipush -1
      // 183: isub
      // 184: iaload
      // 185: getstatic Class_mi.U [[[I
      // 188: iload 8
      // 18a: aaload
      // 18b: iload 13
      // 18d: aaload
      // 18e: iload 12
      // 190: bipush -1
      // 191: iadd
      // 192: iaload
      // 193: ineg
      // 194: iadd
      // 195: istore 16
      // 197: iload 15
      // 199: iload 15
      // 19b: imul
      // 19c: ldc -65536
      // 19e: iload 16
      // 1a0: iload 16
      // 1a2: imul
      // 1a3: isub
      // 1a4: isub
      // 1a5: i2d
      // 1a6: invokestatic java/lang/Math.sqrt (D)D
      // 1a9: d2i
      // 1aa: istore 17
      // 1ac: iload 15
      // 1ae: ldc -1151407800
      // 1b0: ishl
      // 1b1: iload 17
      // 1b3: idiv
      // 1b4: istore 18
      // 1b6: ldc -65536
      // 1b8: iload 17
      // 1ba: idiv
      // 1bb: istore 19
      // 1bd: iload 16
      // 1bf: ldc 2145368648
      // 1c1: ishl
      // 1c2: iload 17
      // 1c4: idiv
      // 1c5: istore 20
      // 1c7: iload 14
      // 1c9: iload 20
      // 1cb: bipush -50
      // 1cd: imul
      // 1ce: iload 18
      // 1d0: bipush -50
      // 1d2: imul
      // 1d3: bipush -10
      // 1d5: iload 19
      // 1d7: imul
      // 1d8: ineg
      // 1d9: isub
      // 1da: iadd
      // 1db: iload 11
      // 1dd: idiv
      // 1de: iadd
      // 1df: istore 14
      // 1e1: aload 9
      // 1e3: iload 13
      // 1e5: aaload
      // 1e6: iload 12
      // 1e8: baload
      // 1e9: ldc -1329701343
      // 1eb: ishr
      // 1ec: aload 9
      // 1ee: iload 13
      // 1f0: aaload
      // 1f1: bipush 1
      // 1f2: iload 12
      // 1f4: iadd
      // 1f5: baload
      // 1f6: ldc 1622509059
      // 1f8: ishr
      // 1f9: aload 9
      // 1fb: iload 13
      // 1fd: aaload
      // 1fe: bipush -1
      // 1ff: iload 12
      // 201: iadd
      // 202: baload
      // 203: ldc -314110558
      // 205: ishr
      // 206: iadd
      // 207: iadd
      // 208: aload 9
      // 20a: iload 13
      // 20c: bipush -1
      // 20d: iadd
      // 20e: aaload
      // 20f: iload 12
      // 211: baload
      // 212: ldc -317261150
      // 214: ishr
      // 215: aload 9
      // 217: iload 13
      // 219: bipush 1
      // 21a: iadd
      // 21b: aaload
      // 21c: iload 12
      // 21e: baload
      // 21f: ldc 280372739
      // 221: ishr
      // 222: iadd
      // 223: iadd
      // 224: istore 21
      // 226: aload 7
      // 228: iload 13
      // 22a: aaload
      // 22b: iload 12
      // 22d: iload 21
      // 22f: ineg
      // 230: iload 14
      // 232: iadd
      // 233: iastore
      // 234: iinc 13 1
      // 237: iload 13
      // 239: bipush 103
      // 23b: if_icmplt 153
      // 23e: iinc 12 1
      // 241: iload 12
      // 243: bipush -1
      // 244: ixor
      // 245: bipush -104
      // 247: if_icmpgt 14b
      // 24a: bipush 0
      // 24b: istore 13
      // 24d: iload 38
      // 24f: ifeq 278
      // 252: getstatic Class_lh.xb [I
      // 255: iload 13
      // 257: bipush 0
      // 258: iastore
      // 259: getstatic Class_ii.S [I
      // 25c: iload 13
      // 25e: bipush 0
      // 25f: iastore
      // 260: getstatic Class_kk.e [I
      // 263: iload 13
      // 265: bipush 0
      // 266: iastore
      // 267: getstatic Class_bi.m [I
      // 26a: iload 13
      // 26c: bipush 0
      // 26d: iastore
      // 26e: getstatic Class_mh.Q [I
      // 271: iload 13
      // 273: bipush 0
      // 274: iastore
      // 275: iinc 13 1
      // 278: iload 13
      // 27a: bipush -1
      // 27b: ixor
      // 27c: bipush -105
      // 27e: if_icmpgt 252
      // 281: bipush -5
      // 283: istore 14
      // 285: iload 38
      // 287: ifeq 46a
      // 28a: bipush 0
      // 28b: istore 15
      // 28d: iload 38
      // 28f: ifeq 37e
      // 292: iload 14
      // 294: bipush -5
      // 296: isub
      // 297: istore 16
      // 299: iload 16
      // 29b: bipush -1
      // 29c: ixor
      // 29d: bipush -105
      // 29f: if_icmple 307
      // 2a2: sipush 255
      // 2a5: getstatic Class_id.v [[[B
      // 2a8: iload 8
      // 2aa: aaload
      // 2ab: iload 16
      // 2ad: aaload
      // 2ae: iload 15
      // 2b0: baload
      // 2b1: iand
      // 2b2: istore 17
      // 2b4: iload 17
      // 2b6: ifle 307
      // 2b9: bipush -1
      // 2ba: iload 17
      // 2bc: iadd
      // 2bd: sipush -128
      // 2c0: invokestatic Class_bc.b (IB)LClass_ig;
      // 2c3: astore 18
      // 2c5: getstatic Class_lh.xb [I
      // 2c8: iload 15
      // 2ca: dup2
      // 2cb: iaload
      // 2cc: aload 18
      // 2ce: getfield Class_ig.h I
      // 2d1: iadd
      // 2d2: iastore
      // 2d3: getstatic Class_ii.S [I
      // 2d6: iload 15
      // 2d8: dup2
      // 2d9: iaload
      // 2da: aload 18
      // 2dc: getfield Class_ig.m I
      // 2df: iadd
      // 2e0: iastore
      // 2e1: getstatic Class_kk.e [I
      // 2e4: iload 15
      // 2e6: dup2
      // 2e7: iaload
      // 2e8: aload 18
      // 2ea: getfield Class_ig.c I
      // 2ed: iadd
      // 2ee: iastore
      // 2ef: getstatic Class_bi.m [I
      // 2f2: iload 15
      // 2f4: dup2
      // 2f5: iaload
      // 2f6: aload 18
      // 2f8: getfield Class_ig.a I
      // 2fb: iadd
      // 2fc: iastore
      // 2fd: getstatic Class_mh.Q [I
      // 300: iload 15
      // 302: dup2
      // 303: iaload
      // 304: bipush 1
      // 305: iadd
      // 306: iastore
      // 307: bipush -5
      // 309: iload 14
      // 30b: iadd
      // 30c: istore 17
      // 30e: iload 17
      // 310: iflt 37b
      // 313: getstatic Class_id.v [[[B
      // 316: iload 8
      // 318: aaload
      // 319: iload 17
      // 31b: aaload
      // 31c: iload 15
      // 31e: baload
      // 31f: sipush 255
      // 322: iand
      // 323: istore 18
      // 325: iload 18
      // 327: bipush -1
      // 328: ixor
      // 329: bipush -1
      // 32a: if_icmpge 37b
      // 32d: bipush -1
      // 32e: iload 18
      // 330: iadd
      // 331: sipush -128
      // 334: invokestatic Class_bc.b (IB)LClass_ig;
      // 337: astore 19
      // 339: getstatic Class_lh.xb [I
      // 33c: iload 15
      // 33e: dup2
      // 33f: iaload
      // 340: aload 19
      // 342: getfield Class_ig.h I
      // 345: isub
      // 346: iastore
      // 347: getstatic Class_ii.S [I
      // 34a: iload 15
      // 34c: dup2
      // 34d: iaload
      // 34e: aload 19
      // 350: getfield Class_ig.m I
      // 353: isub
      // 354: iastore
      // 355: getstatic Class_kk.e [I
      // 358: iload 15
      // 35a: dup2
      // 35b: iaload
      // 35c: aload 19
      // 35e: getfield Class_ig.c I
      // 361: isub
      // 362: iastore
      // 363: getstatic Class_bi.m [I
      // 366: iload 15
      // 368: dup2
      // 369: iaload
      // 36a: aload 19
      // 36c: getfield Class_ig.a I
      // 36f: isub
      // 370: iastore
      // 371: getstatic Class_mh.Q [I
      // 374: iload 15
      // 376: dup2
      // 377: iaload
      // 378: bipush 1
      // 379: isub
      // 37a: iastore
      // 37b: iinc 15 1
      // 37e: iload 15
      // 380: bipush -1
      // 381: ixor
      // 382: bipush -105
      // 384: if_icmpgt 292
      // 387: iload 14
      // 389: bipush -1
      // 38a: ixor
      // 38b: bipush -1
      // 38c: if_icmpgt 467
      // 38f: bipush 0
      // 390: istore 16
      // 392: bipush 0
      // 393: istore 17
      // 395: bipush 0
      // 396: istore 19
      // 398: bipush 0
      // 399: istore 20
      // 39b: bipush 0
      // 39c: istore 18
      // 39e: bipush -5
      // 3a0: istore 21
      // 3a2: iload 38
      // 3a4: ifeq 45e
      // 3a7: iload 21
      // 3a9: bipush -5
      // 3ab: iadd
      // 3ac: istore 23
      // 3ae: iload 21
      // 3b0: bipush 5
      // 3b1: iadd
      // 3b2: istore 22
      // 3b4: iload 22
      // 3b6: bipush 104
      // 3b8: if_icmpge 3f2
      // 3bb: iload 19
      // 3bd: getstatic Class_bi.m [I
      // 3c0: iload 22
      // 3c2: iaload
      // 3c3: iadd
      // 3c4: istore 19
      // 3c6: iload 20
      // 3c8: getstatic Class_mh.Q [I
      // 3cb: iload 22
      // 3cd: iaload
      // 3ce: iadd
      // 3cf: istore 20
      // 3d1: iload 18
      // 3d3: getstatic Class_kk.e [I
      // 3d6: iload 22
      // 3d8: iaload
      // 3d9: iadd
      // 3da: istore 18
      // 3dc: iload 16
      // 3de: getstatic Class_lh.xb [I
      // 3e1: iload 22
      // 3e3: iaload
      // 3e4: iadd
      // 3e5: istore 16
      // 3e7: iload 17
      // 3e9: getstatic Class_ii.S [I
      // 3ec: iload 22
      // 3ee: iaload
      // 3ef: iadd
      // 3f0: istore 17
      // 3f2: iload 23
      // 3f4: iflt 42e
      // 3f7: iload 17
      // 3f9: getstatic Class_ii.S [I
      // 3fc: iload 23
      // 3fe: iaload
      // 3ff: isub
      // 400: istore 17
      // 402: iload 18
      // 404: getstatic Class_kk.e [I
      // 407: iload 23
      // 409: iaload
      // 40a: isub
      // 40b: istore 18
      // 40d: iload 20
      // 40f: getstatic Class_mh.Q [I
      // 412: iload 23
      // 414: iaload
      // 415: isub
      // 416: istore 20
      // 418: iload 16
      // 41a: getstatic Class_lh.xb [I
      // 41d: iload 23
      // 41f: iaload
      // 420: isub
      // 421: istore 16
      // 423: iload 19
      // 425: getstatic Class_bi.m [I
      // 428: iload 23
      // 42a: iaload
      // 42b: isub
      // 42c: istore 19
      // 42e: iload 21
      // 430: bipush -1
      // 431: ixor
      // 432: bipush -1
      // 433: if_icmpgt 45b
      // 436: iload 20
      // 438: ifle 45b
      // 43b: aload 6
      // 43d: iload 14
      // 43f: aaload
      // 440: iload 21
      // 442: iload 17
      // 444: iload 20
      // 446: idiv
      // 447: bipush -76
      // 449: iload 18
      // 44b: iload 20
      // 44d: idiv
      // 44e: sipush 256
      // 451: iload 16
      // 453: imul
      // 454: iload 19
      // 456: idiv
      // 457: invokestatic Class_kc.a (IBII)I
      // 45a: iastore
      // 45b: iinc 21 1
      // 45e: iload 21
      // 460: bipush -1
      // 461: ixor
      // 462: bipush -105
      // 464: if_icmpgt 3a7
      // 467: iinc 14 1
      // 46a: iload 14
      // 46c: bipush 104
      // 46e: if_icmplt 28a
      // 471: bipush 1
      // 472: istore 15
      // 474: iload 38
      // 476: ifeq 841
      // 479: bipush 1
      // 47a: istore 16
      // 47c: iload 38
      // 47e: ifeq 837
      // 481: iload 1
      // 482: ifne 4c8
      // 485: iload 0
      // 486: sipush 24892
      // 489: iadd
      // 48a: invokestatic Class_e.a (I)Z
      // 48d: ifne 4c8
      // 490: bipush 2
      // 491: getstatic Class_kk.c [[[B
      // 494: bipush 0
      // 495: aaload
      // 496: iload 15
      // 498: aaload
      // 499: iload 16
      // 49b: baload
      // 49c: iand
      // 49d: ifne 4c8
      // 4a0: getstatic Class_kk.c [[[B
      // 4a3: iload 8
      // 4a5: aaload
      // 4a6: iload 15
      // 4a8: aaload
      // 4a9: iload 16
      // 4ab: baload
      // 4ac: bipush 16
      // 4ae: iand
      // 4af: ifne 834
      // 4b2: iload 16
      // 4b4: iload 8
      // 4b6: iload 15
      // 4b8: bipush -103
      // 4ba: invokestatic Class_od.a (IIIB)I
      // 4bd: getstatic Class_la.bb I
      // 4c0: if_icmpeq 4c8
      // 4c3: iload 38
      // 4c5: ifeq 834
      // 4c8: getstatic Class_v.z I
      // 4cb: iload 8
      // 4cd: if_icmple 4d5
      // 4d0: iload 8
      // 4d2: putstatic Class_v.z I
      // 4d5: getstatic Class_id.v [[[B
      // 4d8: iload 8
      // 4da: aaload
      // 4db: iload 15
      // 4dd: aaload
      // 4de: iload 16
      // 4e0: baload
      // 4e1: sipush 255
      // 4e4: iand
      // 4e5: istore 17
      // 4e7: getstatic Class_va.cb [[[B
      // 4ea: iload 8
      // 4ec: aaload
      // 4ed: iload 15
      // 4ef: aaload
      // 4f0: iload 16
      // 4f2: baload
      // 4f3: sipush 255
      // 4f6: iand
      // 4f7: istore 18
      // 4f9: iload 17
      // 4fb: ifgt 506
      // 4fe: iload 18
      // 500: bipush -1
      // 501: ixor
      // 502: bipush -1
      // 503: if_icmpge 834
      // 506: getstatic Class_mi.U [[[I
      // 509: iload 8
      // 50b: aaload
      // 50c: iload 15
      // 50e: aaload
      // 50f: iload 16
      // 511: iaload
      // 512: istore 19
      // 514: getstatic Class_mi.U [[[I
      // 517: iload 8
      // 519: aaload
      // 51a: bipush 1
      // 51b: iload 15
      // 51d: iadd
      // 51e: aaload
      // 51f: iload 16
      // 521: iaload
      // 522: istore 20
      // 524: getstatic Class_mi.U [[[I
      // 527: iload 8
      // 529: aaload
      // 52a: bipush 1
      // 52b: iload 15
      // 52d: iadd
      // 52e: aaload
      // 52f: iload 16
      // 531: bipush 1
      // 532: iadd
      // 533: iaload
      // 534: istore 21
      // 536: getstatic Class_mi.U [[[I
      // 539: iload 8
      // 53b: aaload
      // 53c: iload 15
      // 53e: aaload
      // 53f: iload 16
      // 541: bipush -1
      // 542: isub
      // 543: iaload
      // 544: istore 22
      // 546: iload 8
      // 548: bipush -1
      // 549: ixor
      // 54a: bipush -1
      // 54b: if_icmpge 5c6
      // 54e: bipush 1
      // 54f: istore 23
      // 551: iload 17
      // 553: bipush -1
      // 554: ixor
      // 555: bipush -1
      // 556: if_icmpne 56e
      // 559: getstatic Class_sj.n [[[B
      // 55c: iload 8
      // 55e: aaload
      // 55f: iload 15
      // 561: aaload
      // 562: iload 16
      // 564: baload
      // 565: bipush -1
      // 566: ixor
      // 567: bipush -1
      // 568: if_icmpeq 56e
      // 56b: bipush 0
      // 56c: istore 23
      // 56e: iload 18
      // 570: bipush -1
      // 571: ixor
      // 572: bipush -1
      // 573: if_icmpge 588
      // 576: bipush 53
      // 578: iload 18
      // 57a: bipush 1
      // 57b: isub
      // 57c: invokestatic Class_pf.a (BI)LClass_bb;
      // 57f: getfield Class_bb.e Z
      // 582: ifne 588
      // 585: bipush 0
      // 586: istore 23
      // 588: iload 23
      // 58a: ifeq 5c6
      // 58d: iload 19
      // 58f: iload 20
      // 591: if_icmpne 5c6
      // 594: iload 21
      // 596: bipush -1
      // 597: ixor
      // 598: iload 19
      // 59a: bipush -1
      // 59b: ixor
      // 59c: if_icmpne 5c6
      // 59f: iload 19
      // 5a1: bipush -1
      // 5a2: ixor
      // 5a3: iload 22
      // 5a5: bipush -1
      // 5a6: ixor
      // 5a7: if_icmpne 5c6
      // 5aa: getstatic Class_mg.m [[[I
      // 5ad: iload 8
      // 5af: aaload
      // 5b0: iload 15
      // 5b2: aaload
      // 5b3: iload 16
      // 5b5: getstatic Class_mg.m [[[I
      // 5b8: iload 8
      // 5ba: aaload
      // 5bb: iload 15
      // 5bd: aaload
      // 5be: iload 16
      // 5c0: iaload
      // 5c1: bipush 4
      // 5c2: invokestatic Class_mb.a (II)I
      // 5c5: iastore
      // 5c6: iload 17
      // 5c8: bipush -1
      // 5c9: ixor
      // 5ca: bipush -1
      // 5cb: if_icmpge 626
      // 5ce: aload 6
      // 5d0: iload 15
      // 5d2: aaload
      // 5d3: iload 16
      // 5d5: iaload
      // 5d6: istore 23
      // 5d8: bipush 127
      // 5da: iload 23
      // 5dc: iand
      // 5dd: iload 5
      // 5df: iadd
      // 5e0: istore 25
      // 5e2: iload 25
      // 5e4: ifge 5ef
      // 5e7: bipush 0
      // 5e8: istore 25
      // 5ea: iload 38
      // 5ec: ifeq 5fd
      // 5ef: iload 25
      // 5f1: bipush -1
      // 5f2: ixor
      // 5f3: sipush -128
      // 5f6: if_icmpge 5fd
      // 5f9: bipush 127
      // 5fb: istore 25
      // 5fd: iload 25
      // 5ff: iload 23
      // 601: iload 4
      // 603: iadd
      // 604: ldc_w 64512
      // 607: iand
      // 608: sipush 896
      // 60b: iload 23
      // 60d: iand
      // 60e: ineg
      // 60f: isub
      // 610: iadd
      // 611: istore 26
      // 613: getstatic Class_kd.h [I
      // 616: bipush 2
      // 617: bipush 96
      // 619: iload 26
      // 61b: invokestatic Class_ae.a (III)I
      // 61e: iaload
      // 61f: istore 24
      // 621: iload 38
      // 623: ifeq 62c
      // 626: bipush 0
      // 627: istore 24
      // 629: bipush -1
      // 62a: istore 23
      // 62c: aload 7
      // 62e: iload 15
      // 630: aaload
      // 631: iload 16
      // 633: iaload
      // 634: istore 25
      // 636: aload 7
      // 638: bipush 1
      // 639: iload 15
      // 63b: iadd
      // 63c: aaload
      // 63d: iload 16
      // 63f: iaload
      // 640: istore 26
      // 642: aload 7
      // 644: iload 15
      // 646: aaload
      // 647: iload 16
      // 649: bipush -1
      // 64a: isub
      // 64b: iaload
      // 64c: istore 28
      // 64e: aload 7
      // 650: bipush 1
      // 651: iload 15
      // 653: iadd
      // 654: aaload
      // 655: bipush 1
      // 656: iload 16
      // 658: iadd
      // 659: iaload
      // 65a: istore 27
      // 65c: iload 18
      // 65e: ifeq 7f6
      // 661: getstatic Class_sj.n [[[B
      // 664: iload 8
      // 666: aaload
      // 667: iload 15
      // 669: aaload
      // 66a: iload 16
      // 66c: baload
      // 66d: bipush -1
      // 66e: isub
      // 66f: istore 29
      // 671: getstatic Class_oc.h [[[B
      // 674: iload 8
      // 676: aaload
      // 677: iload 15
      // 679: aaload
      // 67a: iload 16
      // 67c: baload
      // 67d: istore 30
      // 67f: bipush 53
      // 681: iload 18
      // 683: bipush -1
      // 684: iadd
      // 685: invokestatic Class_pf.a (BI)LClass_bb;
      // 688: astore 31
      // 68a: aload 31
      // 68c: getfield Class_bb.j I
      // 68f: istore 32
      // 691: iload 32
      // 693: bipush -1
      // 694: ixor
      // 695: bipush -1
      // 696: if_icmpgt 6ab
      // 699: getstatic Class_kd.i LClass_ri;
      // 69c: bipush 39
      // 69e: iload 32
      // 6a0: invokeinterface Class_ri.a (BI)Z 3
      // 6a5: ifne 6ab
      // 6a8: bipush -1
      // 6a9: istore 32
      // 6ab: iload 32
      // 6ad: iflt 6d1
      // 6b0: bipush -1
      // 6b1: istore 33
      // 6b3: getstatic Class_kd.h [I
      // 6b6: bipush -91
      // 6b8: getstatic Class_kd.i LClass_ri;
      // 6bb: iload 32
      // 6bd: bipush 121
      // 6bf: invokeinterface Class_ri.c (II)I 3
      // 6c4: bipush 96
      // 6c6: invokestatic Class_ig.a (BII)I
      // 6c9: iaload
      // 6ca: istore 34
      // 6cc: iload 38
      // 6ce: ifeq 737
      // 6d1: aload 31
      // 6d3: getfield Class_bb.c I
      // 6d6: bipush -1
      // 6d7: ixor
      // 6d8: ifne 6e7
      // 6db: bipush 0
      // 6dc: istore 34
      // 6de: bipush -2
      // 6e0: istore 33
      // 6e2: iload 38
      // 6e4: ifeq 737
      // 6e7: aload 31
      // 6e9: getfield Class_bb.c I
      // 6ec: istore 33
      // 6ee: iload 5
      // 6f0: iload 33
      // 6f2: bipush 127
      // 6f4: iand
      // 6f5: iadd
      // 6f6: istore 35
      // 6f8: iload 35
      // 6fa: bipush -1
      // 6fb: ixor
      // 6fc: bipush -1
      // 6fd: if_icmple 708
      // 700: bipush 0
      // 701: istore 35
      // 703: iload 38
      // 705: ifeq 713
      // 708: iload 35
      // 70a: bipush 127
      // 70c: if_icmple 713
      // 70f: bipush 127
      // 711: istore 35
      // 713: iload 35
      // 715: sipush 896
      // 718: iload 33
      // 71a: iand
      // 71b: ldc_w 64512
      // 71e: iload 4
      // 720: iload 33
      // 722: iadd
      // 723: iand
      // 724: iadd
      // 725: iadd
      // 726: istore 36
      // 728: getstatic Class_kd.h [I
      // 72b: bipush -91
      // 72d: iload 36
      // 72f: bipush 96
      // 731: invokestatic Class_ig.a (BII)I
      // 734: iaload
      // 735: istore 34
      // 737: aload 31
      // 739: getfield Class_bb.g I
      // 73c: iflt 78f
      // 73f: aload 31
      // 741: getfield Class_bb.g I
      // 744: istore 35
      // 746: iload 35
      // 748: bipush 127
      // 74a: iand
      // 74b: iload 5
      // 74d: iadd
      // 74e: istore 36
      // 750: iload 36
      // 752: ifge 75d
      // 755: bipush 0
      // 756: istore 36
      // 758: iload 38
      // 75a: ifeq 76b
      // 75d: iload 36
      // 75f: bipush -1
      // 760: ixor
      // 761: sipush -128
      // 764: if_icmpge 76b
      // 767: bipush 127
      // 769: istore 36
      // 76b: iload 36
      // 76d: iload 35
      // 76f: sipush 896
      // 772: iand
      // 773: iadd
      // 774: ldc_w 64512
      // 777: iload 4
      // 779: iload 35
      // 77b: iadd
      // 77c: iand
      // 77d: iadd
      // 77e: istore 37
      // 780: getstatic Class_kd.h [I
      // 783: bipush -91
      // 785: iload 37
      // 787: bipush 96
      // 789: invokestatic Class_ig.a (BII)I
      // 78c: iaload
      // 78d: istore 34
      // 78f: iload 8
      // 791: iload 15
      // 793: iload 16
      // 795: iload 29
      // 797: iload 30
      // 799: iload 32
      // 79b: iload 19
      // 79d: iload 20
      // 79f: iload 21
      // 7a1: iload 22
      // 7a3: bipush 2
      // 7a4: iload 25
      // 7a6: iload 23
      // 7a8: invokestatic Class_ae.a (III)I
      // 7ab: iload 0
      // 7ac: bipush -109
      // 7ae: ixor
      // 7af: iload 26
      // 7b1: iload 23
      // 7b3: invokestatic Class_ae.a (III)I
      // 7b6: bipush 2
      // 7b7: iload 27
      // 7b9: iload 23
      // 7bb: invokestatic Class_ae.a (III)I
      // 7be: bipush 2
      // 7bf: iload 28
      // 7c1: iload 23
      // 7c3: invokestatic Class_ae.a (III)I
      // 7c6: bipush -91
      // 7c8: iload 33
      // 7ca: iload 25
      // 7cc: invokestatic Class_ig.a (BII)I
      // 7cf: bipush -91
      // 7d1: iload 33
      // 7d3: iload 26
      // 7d5: invokestatic Class_ig.a (BII)I
      // 7d8: bipush -91
      // 7da: iload 33
      // 7dc: iload 27
      // 7de: invokestatic Class_ig.a (BII)I
      // 7e1: bipush -91
      // 7e3: iload 33
      // 7e5: iload 28
      // 7e7: invokestatic Class_ig.a (BII)I
      // 7ea: iload 24
      // 7ec: iload 34
      // 7ee: invokestatic Class_aa.a (IIIIIIIIIIIIIIIIIIII)V
      // 7f1: iload 38
      // 7f3: ifeq 834
      // 7f6: iload 8
      // 7f8: iload 15
      // 7fa: iload 16
      // 7fc: bipush 0
      // 7fd: bipush 0
      // 7fe: bipush -1
      // 7ff: iload 19
      // 801: iload 20
      // 803: iload 21
      // 805: iload 22
      // 807: bipush 2
      // 808: iload 25
      // 80a: iload 23
      // 80c: invokestatic Class_ae.a (III)I
      // 80f: bipush 2
      // 810: iload 26
      // 812: iload 23
      // 814: invokestatic Class_ae.a (III)I
      // 817: bipush 2
      // 818: iload 27
      // 81a: iload 23
      // 81c: invokestatic Class_ae.a (III)I
      // 81f: iload 0
      // 820: bipush 113
      // 822: iadd
      // 823: iload 28
      // 825: iload 23
      // 827: invokestatic Class_ae.a (III)I
      // 82a: bipush 0
      // 82b: bipush 0
      // 82c: bipush 0
      // 82d: bipush 0
      // 82e: iload 24
      // 830: bipush 0
      // 831: invokestatic Class_aa.a (IIIIIIIIIIIIIIIIIIII)V
      // 834: iinc 16 1
      // 837: iload 16
      // 839: bipush 103
      // 83b: if_icmplt 481
      // 83e: iinc 15 1
      // 841: iload 15
      // 843: bipush 103
      // 845: if_icmplt 479
      // 848: getstatic Class_id.v [[[B
      // 84b: iload 8
      // 84d: aconst_null
      // 84e: aastore
      // 84f: getstatic Class_va.cb [[[B
      // 852: iload 8
      // 854: aconst_null
      // 855: aastore
      // 856: getstatic Class_sj.n [[[B
      // 859: iload 8
      // 85b: aconst_null
      // 85c: aastore
      // 85d: getstatic Class_oc.h [[[B
      // 860: iload 8
      // 862: aconst_null
      // 863: aastore
      // 864: getstatic Class_ga.u [[[B
      // 867: iload 8
      // 869: aconst_null
      // 86a: aastore
      // 86b: iinc 8 1
      // 86e: iload 8
      // 870: iload 3
      // 871: if_icmplt 127
      // 874: bipush -50
      // 876: bipush -10
      // 878: bipush -50
      // 87a: invokestatic Class_p.a (III)V
      // 87d: iload 1
      // 87e: ifne dbc
      // 881: bipush 0
      // 882: istore 9
      // 884: iload 38
      // 886: ifeq 8b6
      // 889: bipush 0
      // 88a: istore 10
      // 88c: iload 38
      // 88e: ifeq 8ac
      // 891: getstatic Class_kk.c [[[B
      // 894: bipush 1
      // 895: aaload
      // 896: iload 9
      // 898: aaload
      // 899: iload 10
      // 89b: baload
      // 89c: bipush 2
      // 89d: iand
      // 89e: bipush 2
      // 89f: if_icmpne 8a9
      // 8a2: iload 9
      // 8a4: iload 10
      // 8a6: invokestatic Class_i.b (II)V
      // 8a9: iinc 10 1
      // 8ac: iload 10
      // 8ae: bipush 104
      // 8b0: if_icmplt 891
      // 8b3: iinc 9 1
      // 8b6: iload 9
      // 8b8: bipush -1
      // 8b9: ixor
      // 8ba: bipush -105
      // 8bc: if_icmpgt 889
      // 8bf: bipush 0
      // 8c0: istore 10
      // 8c2: iload 38
      // 8c4: ifeq d7d
      // 8c7: bipush 0
      // 8c8: istore 11
      // 8ca: iload 38
      // 8cc: ifeq d71
      // 8cf: bipush 0
      // 8d0: istore 12
      // 8d2: iload 38
      // 8d4: ifeq d67
      // 8d7: bipush 1
      // 8d8: getstatic Class_mg.m [[[I
      // 8db: iload 10
      // 8dd: aaload
      // 8de: iload 12
      // 8e0: aaload
      // 8e1: iload 11
      // 8e3: iaload
      // 8e4: iand
      // 8e5: bipush -1
      // 8e6: ixor
      // 8e7: bipush -1
      // 8e8: if_icmpeq a6a
      // 8eb: iload 11
      // 8ed: istore 14
      // 8ef: iload 38
      // 8f1: ifeq 8f7
      // 8f4: iinc 14 1
      // 8f7: iload 14
      // 8f9: bipush -1
      // 8fa: ixor
      // 8fb: bipush -105
      // 8fd: if_icmple 913
      // 900: bipush 1
      // 901: getstatic Class_mg.m [[[I
      // 904: iload 10
      // 906: aaload
      // 907: iload 12
      // 909: aaload
      // 90a: bipush 1
      // 90b: iload 14
      // 90d: iadd
      // 90e: iaload
      // 90f: iand
      // 910: ifne 8f4
      // 913: iload 10
      // 915: istore 15
      // 917: iload 10
      // 919: istore 16
      // 91b: iload 11
      // 91d: istore 13
      // 91f: iload 38
      // 921: ifeq 927
      // 924: iinc 13 -1
      // 927: iload 13
      // 929: ifle 978
      // 92c: getstatic Class_mg.m [[[I
      // 92f: iload 10
      // 931: aaload
      // 932: iload 12
      // 934: aaload
      // 935: iload 13
      // 937: bipush 1
      // 938: isub
      // 939: iaload
      // 93a: bipush 1
      // 93b: iand
      // 93c: bipush -1
      // 93d: ixor
      // 93e: bipush -1
      // 93f: if_icmpne 924
      // 942: iload 38
      // 944: ifeq 978
      // 947: iload 13
      // 949: istore 17
      // 94b: iload 38
      // 94d: ifeq 96e
      // 950: getstatic Class_mg.m [[[I
      // 953: bipush -1
      // 954: iload 15
      // 956: iadd
      // 957: aaload
      // 958: iload 12
      // 95a: aaload
      // 95b: iload 17
      // 95d: iaload
      // 95e: bipush 1
      // 95f: iand
      // 960: bipush -1
      // 961: ixor
      // 962: bipush -1
      // 963: if_icmpne 96b
      // 966: iload 38
      // 968: ifeq 9b7
      // 96b: iinc 17 1
      // 96e: iload 17
      // 970: iload 14
      // 972: if_icmple 950
      // 975: iinc 15 -1
      // 978: iload 15
      // 97a: bipush -1
      // 97b: ixor
      // 97c: bipush -1
      // 97d: if_icmplt 947
      // 980: iload 38
      // 982: ifeq 9b7
      // 985: iload 13
      // 987: istore 17
      // 989: iload 38
      // 98b: ifeq 9a9
      // 98e: getstatic Class_mg.m [[[I
      // 991: bipush 1
      // 992: iload 16
      // 994: iadd
      // 995: aaload
      // 996: iload 12
      // 998: aaload
      // 999: iload 17
      // 99b: iaload
      // 99c: bipush 1
      // 99d: iand
      // 99e: ifne 9a6
      // 9a1: iload 38
      // 9a3: ifeq 9c0
      // 9a6: iinc 17 1
      // 9a9: iload 14
      // 9ab: bipush -1
      // 9ac: ixor
      // 9ad: iload 17
      // 9af: bipush -1
      // 9b0: ixor
      // 9b1: if_icmple 98e
      // 9b4: iinc 16 1
      // 9b7: iload 16
      // 9b9: bipush -1
      // 9ba: ixor
      // 9bb: bipush -4
      // 9bd: if_icmpgt 985
      // 9c0: bipush 1
      // 9c1: iload 14
      // 9c3: iadd
      // 9c4: iload 13
      // 9c6: isub
      // 9c7: bipush 1
      // 9c8: iload 16
      // 9ca: iload 15
      // 9cc: ineg
      // 9cd: iadd
      // 9ce: iadd
      // 9cf: imul
      // 9d0: istore 17
      // 9d2: iload 17
      // 9d4: bipush -1
      // 9d5: ixor
      // 9d6: bipush -9
      // 9d8: if_icmpgt a6a
      // 9db: sipush 240
      // 9de: istore 18
      // 9e0: getstatic Class_mi.U [[[I
      // 9e3: iload 15
      // 9e5: aaload
      // 9e6: iload 12
      // 9e8: aaload
      // 9e9: iload 13
      // 9eb: iaload
      // 9ec: istore 20
      // 9ee: getstatic Class_mi.U [[[I
      // 9f1: iload 16
      // 9f3: aaload
      // 9f4: iload 12
      // 9f6: aaload
      // 9f7: iload 13
      // 9f9: iaload
      // 9fa: iload 18
      // 9fc: isub
      // 9fd: istore 19
      // 9ff: bipush 1
      // a00: sipush 128
      // a03: iload 12
      // a05: imul
      // a06: iload 12
      // a08: sipush 128
      // a0b: imul
      // a0c: iload 13
      // a0e: sipush 128
      // a11: imul
      // a12: iload 14
      // a14: sipush 128
      // a17: imul
      // a18: sipush 128
      // a1b: iadd
      // a1c: iload 19
      // a1e: iload 20
      // a20: invokestatic Class_e.a (IIIIIII)V
      // a23: iload 15
      // a25: istore 21
      // a27: iload 38
      // a29: ifeq a5f
      // a2c: iload 13
      // a2e: istore 22
      // a30: iload 38
      // a32: ifeq a55
      // a35: getstatic Class_mg.m [[[I
      // a38: iload 21
      // a3a: aaload
      // a3b: iload 12
      // a3d: aaload
      // a3e: iload 22
      // a40: getstatic Class_mg.m [[[I
      // a43: iload 21
      // a45: aaload
      // a46: iload 12
      // a48: aaload
      // a49: iload 22
      // a4b: iaload
      // a4c: bipush -2
      // a4e: invokestatic Class_ui.a (II)I
      // a51: iastore
      // a52: iinc 22 1
      // a55: iload 14
      // a57: iload 22
      // a59: if_icmpge a35
      // a5c: iinc 21 1
      // a5f: iload 16
      // a61: bipush -1
      // a62: ixor
      // a63: iload 21
      // a65: bipush -1
      // a66: ixor
      // a67: if_icmple a2c
      // a6a: getstatic Class_mg.m [[[I
      // a6d: iload 10
      // a6f: aaload
      // a70: iload 12
      // a72: aaload
      // a73: iload 11
      // a75: iaload
      // a76: bipush 2
      // a77: iand
      // a78: ifeq bf7
      // a7b: iload 12
      // a7d: istore 13
      // a7f: iload 12
      // a81: istore 14
      // a83: iload 10
      // a85: istore 15
      // a87: iload 38
      // a89: ifeq a8f
      // a8c: iinc 13 -1
      // a8f: iload 13
      // a91: bipush -1
      // a92: ixor
      // a93: bipush -1
      // a94: if_icmpge aaa
      // a97: bipush 2
      // a98: getstatic Class_mg.m [[[I
      // a9b: iload 10
      // a9d: aaload
      // a9e: iload 13
      // aa0: bipush -1
      // aa1: iadd
      // aa2: aaload
      // aa3: iload 11
      // aa5: iaload
      // aa6: iand
      // aa7: ifne a8c
      // aaa: iload 10
      // aac: istore 16
      // aae: iload 38
      // ab0: ifeq ab6
      // ab3: iinc 14 1
      // ab6: iload 14
      // ab8: bipush -1
      // ab9: ixor
      // aba: bipush -105
      // abc: if_icmple b05
      // abf: getstatic Class_mg.m [[[I
      // ac2: iload 10
      // ac4: aaload
      // ac5: iload 14
      // ac7: bipush -1
      // ac8: isub
      // ac9: aaload
      // aca: iload 11
      // acc: iaload
      // acd: bipush 2
      // ace: iand
      // acf: ifne ab3
      // ad2: iload 38
      // ad4: ifeq b05
      // ad7: iload 13
      // ad9: istore 17
      // adb: iload 38
      // add: ifeq afb
      // ae0: getstatic Class_mg.m [[[I
      // ae3: iload 15
      // ae5: bipush 1
      // ae6: isub
      // ae7: aaload
      // ae8: iload 17
      // aea: aaload
      // aeb: iload 11
      // aed: iaload
      // aee: bipush 2
      // aef: iand
      // af0: ifne af8
      // af3: iload 38
      // af5: ifeq b43
      // af8: iinc 17 1
      // afb: iload 17
      // afd: iload 14
      // aff: if_icmple ae0
      // b02: iinc 15 -1
      // b05: iload 15
      // b07: bipush -1
      // b08: ixor
      // b09: bipush -1
      // b0a: if_icmplt ad7
      // b0d: iload 38
      // b0f: ifeq b43
      // b12: iload 13
      // b14: istore 17
      // b16: iload 38
      // b18: ifeq b39
      // b1b: getstatic Class_mg.m [[[I
      // b1e: bipush 1
      // b1f: iload 16
      // b21: iadd
      // b22: aaload
      // b23: iload 17
      // b25: aaload
      // b26: iload 11
      // b28: iaload
      // b29: bipush 2
      // b2a: iand
      // b2b: bipush -1
      // b2c: ixor
      // b2d: bipush -1
      // b2e: if_icmpne b36
      // b31: iload 38
      // b33: ifeq b4c
      // b36: iinc 17 1
      // b39: iload 14
      // b3b: iload 17
      // b3d: if_icmpge b1b
      // b40: iinc 16 1
      // b43: iload 16
      // b45: bipush -1
      // b46: ixor
      // b47: bipush -4
      // b49: if_icmpgt b12
      // b4c: iload 14
      // b4e: iload 13
      // b50: ineg
      // b51: iadd
      // b52: bipush 1
      // b53: iadd
      // b54: iload 16
      // b56: bipush 1
      // b57: iload 15
      // b59: ineg
      // b5a: iadd
      // b5b: iadd
      // b5c: imul
      // b5d: istore 17
      // b5f: iload 17
      // b61: bipush -1
      // b62: ixor
      // b63: bipush -9
      // b65: if_icmpgt bf7
      // b68: sipush 240
      // b6b: istore 18
      // b6d: getstatic Class_mi.U [[[I
      // b70: iload 16
      // b72: aaload
      // b73: iload 13
      // b75: aaload
      // b76: iload 11
      // b78: iaload
      // b79: iload 18
      // b7b: isub
      // b7c: istore 19
      // b7e: getstatic Class_mi.U [[[I
      // b81: iload 15
      // b83: aaload
      // b84: iload 13
      // b86: aaload
      // b87: iload 11
      // b89: iaload
      // b8a: istore 20
      // b8c: bipush 2
      // b8d: sipush 128
      // b90: iload 13
      // b92: imul
      // b93: sipush 128
      // b96: iload 14
      // b98: imul
      // b99: sipush 128
      // b9c: iadd
      // b9d: iload 11
      // b9f: sipush 128
      // ba2: imul
      // ba3: sipush 128
      // ba6: iload 11
      // ba8: imul
      // ba9: iload 19
      // bab: iload 20
      // bad: invokestatic Class_e.a (IIIIIII)V
      // bb0: iload 15
      // bb2: istore 21
      // bb4: iload 38
      // bb6: ifeq bf0
      // bb9: iload 13
      // bbb: istore 22
      // bbd: iload 38
      // bbf: ifeq be2
      // bc2: getstatic Class_mg.m [[[I
      // bc5: iload 21
      // bc7: aaload
      // bc8: iload 22
      // bca: aaload
      // bcb: iload 11
      // bcd: getstatic Class_mg.m [[[I
      // bd0: iload 21
      // bd2: aaload
      // bd3: iload 22
      // bd5: aaload
      // bd6: iload 11
      // bd8: iaload
      // bd9: bipush -3
      // bdb: invokestatic Class_ui.a (II)I
      // bde: iastore
      // bdf: iinc 22 1
      // be2: iload 14
      // be4: bipush -1
      // be5: ixor
      // be6: iload 22
      // be8: bipush -1
      // be9: ixor
      // bea: if_icmple bc2
      // bed: iinc 21 1
      // bf0: iload 21
      // bf2: iload 16
      // bf4: if_icmple bb9
      // bf7: bipush 4
      // bf8: getstatic Class_mg.m [[[I
      // bfb: iload 10
      // bfd: aaload
      // bfe: iload 12
      // c00: aaload
      // c01: iload 11
      // c03: iaload
      // c04: iand
      // c05: ifeq d64
      // c08: iload 12
      // c0a: istore 13
      // c0c: iload 12
      // c0e: istore 14
      // c10: iload 11
      // c12: istore 15
      // c14: iload 11
      // c16: istore 16
      // c18: iload 38
      // c1a: ifeq c20
      // c1d: iinc 15 -1
      // c20: iload 15
      // c22: ifle c40
      // c25: getstatic Class_mg.m [[[I
      // c28: iload 10
      // c2a: aaload
      // c2b: iload 12
      // c2d: aaload
      // c2e: iload 15
      // c30: bipush -1
      // c31: iadd
      // c32: iaload
      // c33: bipush 4
      // c34: iand
      // c35: ifne c1d
      // c38: iload 38
      // c3a: ifeq c40
      // c3d: iinc 16 1
      // c40: iload 16
      // c42: bipush 104
      // c44: if_icmpge c8d
      // c47: getstatic Class_mg.m [[[I
      // c4a: iload 10
      // c4c: aaload
      // c4d: iload 12
      // c4f: aaload
      // c50: bipush 1
      // c51: iload 16
      // c53: iadd
      // c54: iaload
      // c55: bipush 4
      // c56: iand
      // c57: ifne c3d
      // c5a: iload 38
      // c5c: ifeq c8d
      // c5f: iload 15
      // c61: istore 17
      // c63: iload 38
      // c65: ifeq c83
      // c68: bipush 4
      // c69: getstatic Class_mg.m [[[I
      // c6c: iload 10
      // c6e: aaload
      // c6f: iload 13
      // c71: bipush -1
      // c72: iadd
      // c73: aaload
      // c74: iload 17
      // c76: iaload
      // c77: iand
      // c78: ifne c80
      // c7b: iload 38
      // c7d: ifeq cc8
      // c80: iinc 17 1
      // c83: iload 16
      // c85: iload 17
      // c87: if_icmpge c68
      // c8a: iinc 13 -1
      // c8d: iload 13
      // c8f: bipush -1
      // c90: ixor
      // c91: bipush -1
      // c92: if_icmplt c5f
      // c95: iload 38
      // c97: ifeq cc8
      // c9a: iload 15
      // c9c: istore 17
      // c9e: iload 38
      // ca0: ifeq cbe
      // ca3: getstatic Class_mg.m [[[I
      // ca6: iload 10
      // ca8: aaload
      // ca9: iload 14
      // cab: bipush 1
      // cac: iadd
      // cad: aaload
      // cae: iload 17
      // cb0: iaload
      // cb1: bipush 4
      // cb2: iand
      // cb3: ifne cbb
      // cb6: iload 38
      // cb8: ifeq ccf
      // cbb: iinc 17 1
      // cbe: iload 17
      // cc0: iload 16
      // cc2: if_icmple ca3
      // cc5: iinc 14 1
      // cc8: iload 14
      // cca: bipush 104
      // ccc: if_icmplt c9a
      // ccf: bipush 1
      // cd0: iload 15
      // cd2: ineg
      // cd3: iadd
      // cd4: iload 16
      // cd6: iadd
      // cd7: iload 13
      // cd9: ineg
      // cda: iload 14
      // cdc: bipush 1
      // cdd: iadd
      // cde: iadd
      // cdf: imul
      // ce0: bipush -1
      // ce1: ixor
      // ce2: bipush -5
      // ce4: if_icmpgt d64
      // ce7: getstatic Class_mi.U [[[I
      // cea: iload 10
      // cec: aaload
      // ced: iload 13
      // cef: aaload
      // cf0: iload 15
      // cf2: iaload
      // cf3: istore 17
      // cf5: bipush 4
      // cf6: sipush 128
      // cf9: iload 13
      // cfb: imul
      // cfc: sipush 128
      // cff: iload 14
      // d01: imul
      // d02: sipush 128
      // d05: iadd
      // d06: iload 15
      // d08: sipush 128
      // d0b: imul
      // d0c: sipush 128
      // d0f: sipush 128
      // d12: iload 16
      // d14: imul
      // d15: iadd
      // d16: iload 17
      // d18: iload 17
      // d1a: invokestatic Class_e.a (IIIIIII)V
      // d1d: iload 13
      // d1f: istore 18
      // d21: iload 38
      // d23: ifeq d5d
      // d26: iload 15
      // d28: istore 19
      // d2a: iload 38
      // d2c: ifeq d4f
      // d2f: getstatic Class_mg.m [[[I
      // d32: iload 10
      // d34: aaload
      // d35: iload 18
      // d37: aaload
      // d38: iload 19
      // d3a: getstatic Class_mg.m [[[I
      // d3d: iload 10
      // d3f: aaload
      // d40: iload 18
      // d42: aaload
      // d43: iload 19
      // d45: iaload
      // d46: bipush -5
      // d48: invokestatic Class_ui.a (II)I
      // d4b: iastore
      // d4c: iinc 19 1
      // d4f: iload 16
      // d51: bipush -1
      // d52: ixor
      // d53: iload 19
      // d55: bipush -1
      // d56: ixor
      // d57: if_icmple d2f
      // d5a: iinc 18 1
      // d5d: iload 14
      // d5f: iload 18
      // d61: if_icmpge d26
      // d64: iinc 12 1
      // d67: iload 12
      // d69: bipush 104
      // d6b: if_icmple 8d7
      // d6e: iinc 11 1
      // d71: iload 11
      // d73: bipush -1
      // d74: ixor
      // d75: bipush -105
      // d77: if_icmpge 8cf
      // d7a: iinc 10 1
      // d7d: iload 10
      // d7f: bipush 4
      // d80: if_icmplt 8c7
      // d83: return
      // d84: astore 3
      // d85: aload 3
      // d86: new java/lang/StringBuffer
      // d89: dup
      // d8a: ldc_w "th.B("
      // d8d: invokespecial java/lang/StringBuffer.<init> (Ljava/lang/String;)V
      // d90: iload 0
      // d91: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // d94: bipush 44
      // d96: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // d99: iload 1
      // d9a: invokevirtual java/lang/StringBuffer.append (Z)Ljava/lang/StringBuffer;
      // d9d: bipush 44
      // d9f: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // da2: aload 2
      // da3: ifnull dab
      // da6: ldc "{...}"
      // da8: goto dad
      // dab: ldc "null"
      // dad: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // db0: bipush 41
      // db2: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // db5: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // db8: invokestatic Class_sh.a (Ljava/lang/Throwable;Ljava/lang/String;)LClass_ua;
      // dbb: athrow
      // dbc: return
   }

   public Class_th() {
      this(-1, 1000000, 1000000);
   }

   static final void a(int var0) {
      try {
         label115: {
            o++;
            int var1 = 64 + 128 * Class_lh.y;
            int var2 = Class_vh.hb * 128 + 64;
            int var3 = Class_fa.a(var1, Class_jk.F, var2, false) - Class_se.nb;
            if (Class_ug.x >= 100) {
               Class_gg.D = 64 + 128 * Class_lh.y;
               Class_oc.l = Class_vh.hb * 128 + 64;
               Class_ef.s = Class_fa.a(Class_gg.D, Class_jk.F, Class_oc.l, false) - Class_se.nb;
               if (client.lb == 0) {
                  break label115;
               }
            }

            if (Class_gg.D < var1) {
               Class_gg.D = Class_gg.D + (-Class_gg.D + var1) * Class_ug.x / 1000 + Class_wb.c;
               if (~var1 > ~Class_gg.D) {
                  Class_gg.D = var1;
               }
            }

            if (~var2 < ~Class_oc.l) {
               Class_oc.l = Class_oc.l + (var2 + -Class_oc.l) * Class_ug.x / 1000 + Class_wb.c;
               if (Class_oc.l > var2) {
                  Class_oc.l = var2;
               }
            }

            if (~var2 > ~Class_oc.l) {
               Class_oc.l = Class_oc.l - (Class_wb.c - -(Class_ug.x * (-var2 + Class_oc.l) / 1000));
               if (Class_oc.l < var2) {
                  Class_oc.l = var2;
               }
            }

            if (var1 < Class_gg.D) {
               Class_gg.D = Class_gg.D - ((-var1 + Class_gg.D) * Class_ug.x / 1000 + Class_wb.c);
               if (~Class_gg.D > ~var1) {
                  Class_gg.D = var1;
               }
            }

            if (~var3 < ~Class_ef.s) {
               Class_ef.s = Class_ef.s + Class_ug.x * (var3 - Class_ef.s) / 1000 + Class_wb.c;
               if (~var3 > ~Class_ef.s) {
                  Class_ef.s = var3;
               }
            }

            if (Class_ef.s > var3) {
               Class_ef.s = Class_ef.s - (Class_wb.c + (Class_ef.s - var3) * Class_ug.x / 1000);
               if (Class_ef.s < var3) {
                  Class_ef.s = var3;
               }
            }
         }

         int var14 = 64 + 128 * Class_wf.l;
         int var13 = 64 + 128 * Class_ba.x;
         int var15 = Class_fa.a(var13, Class_jk.F, var14, false) - Class_lf.O;
         if (var0 != -128) {
            a((byte)116, null);
         }

         int var5 = var15 - Class_ef.s;
         int var4 = var13 + -Class_gg.D;
         int var6 = -Class_oc.l + var14;
         int var7 = (int)Math.sqrt(var6 * var6 + var4 * var4);
         int var8 = 2047 & (int)(325.949 * Math.atan2(var5, var7));
         if (var8 < 128) {
            var8 = 128;
         }

         if (var8 > 383) {
            var8 = 383;
         }

         int var9 = 2047 & (int)(Math.atan2(var4, var6) * -325.949);
         int var10 = var9 + -Class_mg.j;
         if (var10 > 1024) {
            var10 -= 2048;
         }

         if (var10 < -1024) {
            var10 += 2048;
         }

         if (Class_hc.a < var8) {
            Class_hc.a = Class_hc.a + Class_me.u * (var8 + -Class_hc.a) / 1000 + Class_mi.V;
            if (~Class_hc.a < ~var8) {
               Class_hc.a = var8;
            }
         }

         if (var10 > 0) {
            Class_mg.j = Class_mg.j + Class_mi.V + Class_me.u * var10 / 1000;
            Class_mg.j &= 2047;
         }

         if (~var10 > -1) {
            Class_mg.j = Class_mg.j - (Class_mi.V - -(Class_me.u * -var10 / 1000));
            Class_mg.j &= 2047;
         }

         int var11 = -Class_mg.j + var9;
         if (~Class_hc.a < ~var8) {
            Class_hc.a = Class_hc.a - (Class_me.u * (-var8 + Class_hc.a) / 1000 + Class_mi.V);
            if (~Class_hc.a > ~var8) {
               Class_hc.a = var8;
            }
         }

         if (~var11 < -1025) {
            var11 -= 2048;
         }

         if (var11 < -1024) {
            var11 += 2048;
         }

         if (~var11 > -1 && var10 > 0 || var11 > 0 && var10 < 0) {
            Class_mg.j = var9;
         }
      } catch (RuntimeException var12) {
         throw Class_sh.a(var12, "th.F(" + var0 + ')');
      }
   }

   static final void b(int var0) {
      try {
         if (var0 != 0) {
            d = -60;
         }

         k++;
         if (!Class_e.a(var0 ^ 24781) && ~Class_jk.F != ~Class_la.bb) {
            Class_ng.a((byte)-128, Class_gg.B.qb[0], Class_jk.F, false, Class_gg.B.v[0], Class_cf.M, Class_gk.b);
         } else if (Class_td.T != Class_jk.F) {
            Class_td.T = Class_jk.F;
            Class_dj.a((byte)-124, Class_jk.F);
            Class_sh.c(var0 + -13401);
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "th.A(" + var0 + ')');
      }
   }

   static final void a(byte var0, Class_cj var1) {
      try {
         Class_e.h = var1;
         Class_tc.c = Class_e.h.e(4, 0);
         if (var0 >= -70) {
            g = null;
         }

         m++;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "th.E(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   private Class_th(int var1, int var2, int var3) {
   }
}
