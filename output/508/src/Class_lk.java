final class Class_lk extends Class_li {
   static int p;
   static int q = 0;
   static int r;
   long s;
   static Class_r[] t = new Class_r[1000];
   static int u;
   static int v;
   static int w;
   static int x;
   static Class_cj y;

   static final int b(int var0, int var1) {
      try {
         if (var0 != 28443) {
            a(null, -10);
         }

         v++;
         return var1 >>> 928971400;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "lk.F(" + var0 + 44 + var1 + 41);
      }
   }

   static final boolean a(
      boolean param0,
      int param1,
      int param2,
      int param3,
      int param4,
      int param5,
      int param6,
      byte param7,
      int param8,
      int param9,
      int param10,
      int param11,
      int param12
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic client.lb I
      // 003: istore 28
      // 005: bipush 0
      // 006: istore 13
      // 008: iload 28
      // 00a: ifeq 037
      // 00d: bipush 0
      // 00e: istore 14
      // 010: iload 28
      // 012: ifeq 02d
      // 015: getstatic Class_jc.y [[I
      // 018: iload 13
      // 01a: aaload
      // 01b: iload 14
      // 01d: bipush 0
      // 01e: iastore
      // 01f: getstatic Class_ub.gb [[I
      // 022: iload 13
      // 024: aaload
      // 025: iload 14
      // 027: ldc 99999999
      // 029: iastore
      // 02a: iinc 14 1
      // 02d: iload 14
      // 02f: bipush 104
      // 031: if_icmplt 015
      // 034: iinc 13 1
      // 037: iload 13
      // 039: bipush -1
      // 03a: ixor
      // 03b: bipush -105
      // 03d: if_icmpgt 00d
      // 040: getstatic Class_lk.p I
      // 043: bipush 1
      // 044: iadd
      // 045: putstatic Class_lk.p I
      // 048: iload 1
      // 049: istore 14
      // 04b: iload 9
      // 04d: istore 15
      // 04f: getstatic Class_jc.y [[I
      // 052: iload 1
      // 053: aaload
      // 054: iload 9
      // 056: bipush 99
      // 058: iastore
      // 059: bipush 0
      // 05a: istore 16
      // 05c: getstatic Class_ub.gb [[I
      // 05f: iload 1
      // 060: aaload
      // 061: iload 9
      // 063: bipush 0
      // 064: iastore
      // 065: getstatic Class_vh.gb [I
      // 068: iload 16
      // 06a: iload 1
      // 06b: iastore
      // 06c: getstatic Class_ma.cb [I
      // 06f: iload 16
      // 071: iinc 16 1
      // 074: iload 9
      // 076: iastore
      // 077: bipush 0
      // 078: istore 17
      // 07a: iload 7
      // 07c: bipush 108
      // 07e: if_icmpge 085
      // 081: aconst_null
      // 082: putstatic Class_lk.y LClass_cj;
      // 085: getstatic Class_sj.j [LClass_ga;
      // 088: getstatic Class_jk.F I
      // 08b: aaload
      // 08c: getfield Class_ga.z [[I
      // 08f: astore 19
      // 091: bipush 0
      // 092: istore 18
      // 094: iload 28
      // 096: ifeq 7b2
      // 099: getstatic Class_vh.gb [I
      // 09c: iload 17
      // 09e: iaload
      // 09f: istore 14
      // 0a1: getstatic Class_ma.cb [I
      // 0a4: iload 17
      // 0a6: iaload
      // 0a7: istore 15
      // 0a9: bipush 1
      // 0aa: iload 17
      // 0ac: iadd
      // 0ad: sipush 4095
      // 0b0: iand
      // 0b1: istore 17
      // 0b3: iload 8
      // 0b5: bipush -1
      // 0b6: ixor
      // 0b7: iload 14
      // 0b9: bipush -1
      // 0ba: ixor
      // 0bb: if_icmpne 0d0
      // 0be: iload 2
      // 0bf: bipush -1
      // 0c0: ixor
      // 0c1: iload 15
      // 0c3: bipush -1
      // 0c4: ixor
      // 0c5: if_icmpne 0d0
      // 0c8: bipush 1
      // 0c9: istore 18
      // 0cb: iload 28
      // 0cd: ifeq 7bd
      // 0d0: iload 10
      // 0d2: ifeq 139
      // 0d5: iload 10
      // 0d7: bipush 5
      // 0d8: if_icmplt 0e4
      // 0db: iload 10
      // 0dd: bipush -1
      // 0de: ixor
      // 0df: bipush -11
      // 0e1: if_icmpne 10a
      // 0e4: getstatic Class_sj.j [LClass_ga;
      // 0e7: getstatic Class_jk.F I
      // 0ea: aaload
      // 0eb: iload 5
      // 0ed: iload 8
      // 0ef: bipush 108
      // 0f1: iload 14
      // 0f3: iload 12
      // 0f5: iload 2
      // 0f6: iload 15
      // 0f8: iload 10
      // 0fa: bipush 1
      // 0fb: isub
      // 0fc: invokevirtual Class_ga.a (IIBIIIII)Z
      // 0ff: ifeq 10a
      // 102: bipush 1
      // 103: istore 18
      // 105: iload 28
      // 107: ifeq 7bd
      // 10a: iload 10
      // 10c: bipush -1
      // 10d: ixor
      // 10e: bipush -11
      // 110: if_icmple 139
      // 113: getstatic Class_sj.j [LClass_ga;
      // 116: getstatic Class_jk.F I
      // 119: aaload
      // 11a: iload 8
      // 11c: iload 14
      // 11e: iload 5
      // 120: bipush 118
      // 122: iload 12
      // 124: iload 2
      // 125: iload 15
      // 127: iload 10
      // 129: bipush 1
      // 12a: isub
      // 12b: invokevirtual Class_ga.a (IIIBIIII)Z
      // 12e: ifeq 139
      // 131: bipush 1
      // 132: istore 18
      // 134: iload 28
      // 136: ifeq 7bd
      // 139: iload 6
      // 13b: ifeq 16d
      // 13e: iload 4
      // 140: bipush -1
      // 141: ixor
      // 142: bipush -1
      // 143: if_icmpeq 16d
      // 146: getstatic Class_sj.j [LClass_ga;
      // 149: getstatic Class_jk.F I
      // 14c: aaload
      // 14d: sipush 15856
      // 150: iload 2
      // 151: iload 12
      // 153: iload 15
      // 155: iload 4
      // 157: iload 14
      // 159: iload 11
      // 15b: iload 6
      // 15d: iload 8
      // 15f: invokevirtual Class_ga.a (IIIIIIIII)Z
      // 162: ifeq 16d
      // 165: bipush 1
      // 166: istore 18
      // 168: iload 28
      // 16a: ifeq 7bd
      // 16d: bipush 1
      // 16e: getstatic Class_ub.gb [[I
      // 171: iload 14
      // 173: aaload
      // 174: iload 15
      // 176: iaload
      // 177: iadd
      // 178: istore 20
      // 17a: iload 14
      // 17c: ifle 21a
      // 17f: getstatic Class_jc.y [[I
      // 182: bipush -1
      // 183: iload 14
      // 185: iadd
      // 186: aaload
      // 187: iload 15
      // 189: iaload
      // 18a: bipush -1
      // 18b: ixor
      // 18c: bipush -1
      // 18d: if_icmpne 21a
      // 190: aload 19
      // 192: iload 14
      // 194: bipush 1
      // 195: isub
      // 196: aaload
      // 197: iload 15
      // 199: iaload
      // 19a: ldc 19661070
      // 19c: iand
      // 19d: ifne 21a
      // 1a0: aload 19
      // 1a2: iload 14
      // 1a4: bipush 1
      // 1a5: isub
      // 1a6: aaload
      // 1a7: iload 12
      // 1a9: iload 15
      // 1ab: bipush 1
      // 1ac: isub
      // 1ad: iadd
      // 1ae: iaload
      // 1af: ldc 19661112
      // 1b1: iand
      // 1b2: ifne 21a
      // 1b5: bipush 1
      // 1b6: istore 21
      // 1b8: iload 28
      // 1ba: ifeq 1d8
      // 1bd: aload 19
      // 1bf: iload 14
      // 1c1: bipush 1
      // 1c2: isub
      // 1c3: aaload
      // 1c4: iload 21
      // 1c6: iload 15
      // 1c8: iadd
      // 1c9: iaload
      // 1ca: ldc 19661118
      // 1cc: iand
      // 1cd: ifeq 1d5
      // 1d0: iload 28
      // 1d2: ifeq 21a
      // 1d5: iinc 21 1
      // 1d8: iload 21
      // 1da: bipush -1
      // 1db: ixor
      // 1dc: iload 12
      // 1de: bipush 1
      // 1df: isub
      // 1e0: bipush -1
      // 1e1: ixor
      // 1e2: if_icmpgt 1bd
      // 1e5: getstatic Class_vh.gb [I
      // 1e8: iload 16
      // 1ea: bipush -1
      // 1eb: iload 14
      // 1ed: iadd
      // 1ee: iastore
      // 1ef: getstatic Class_ma.cb [I
      // 1f2: iload 16
      // 1f4: iload 15
      // 1f6: iastore
      // 1f7: getstatic Class_jc.y [[I
      // 1fa: iload 14
      // 1fc: bipush -1
      // 1fd: iadd
      // 1fe: aaload
      // 1ff: iload 15
      // 201: bipush 2
      // 202: iastore
      // 203: getstatic Class_ub.gb [[I
      // 206: bipush -1
      // 207: iload 14
      // 209: iadd
      // 20a: aaload
      // 20b: iload 15
      // 20d: iload 20
      // 20f: iastore
      // 210: bipush 1
      // 211: iload 16
      // 213: iadd
      // 214: sipush 4095
      // 217: iand
      // 218: istore 16
      // 21a: iload 14
      // 21c: bipush -1
      // 21d: ixor
      // 21e: bipush -103
      // 220: if_icmple 2c2
      // 223: getstatic Class_jc.y [[I
      // 226: iload 14
      // 228: bipush -1
      // 229: isub
      // 22a: aaload
      // 22b: iload 15
      // 22d: iaload
      // 22e: ifne 2c2
      // 231: aload 19
      // 233: iload 12
      // 235: iload 14
      // 237: iadd
      // 238: aaload
      // 239: iload 15
      // 23b: iaload
      // 23c: ldc 19661187
      // 23e: iand
      // 23f: bipush -1
      // 240: ixor
      // 241: bipush -1
      // 242: if_icmpne 2c2
      // 245: ldc 19661280
      // 247: aload 19
      // 249: iload 14
      // 24b: iload 12
      // 24d: ineg
      // 24e: isub
      // 24f: aaload
      // 250: iload 15
      // 252: iload 12
      // 254: bipush 1
      // 255: isub
      // 256: iadd
      // 257: iaload
      // 258: iand
      // 259: bipush -1
      // 25a: ixor
      // 25b: bipush -1
      // 25c: if_icmpne 2c2
      // 25f: bipush 1
      // 260: istore 21
      // 262: iload 28
      // 264: ifeq 283
      // 267: aload 19
      // 269: iload 14
      // 26b: iload 12
      // 26d: iadd
      // 26e: aaload
      // 26f: iload 21
      // 271: iload 15
      // 273: iadd
      // 274: iaload
      // 275: ldc 19661283
      // 277: iand
      // 278: ifeq 280
      // 27b: iload 28
      // 27d: ifeq 2c2
      // 280: iinc 21 1
      // 283: iload 12
      // 285: bipush 1
      // 286: isub
      // 287: iload 21
      // 289: if_icmpgt 267
      // 28c: getstatic Class_vh.gb [I
      // 28f: iload 16
      // 291: iload 14
      // 293: bipush 1
      // 294: iadd
      // 295: iastore
      // 296: getstatic Class_ma.cb [I
      // 299: iload 16
      // 29b: iload 15
      // 29d: iastore
      // 29e: getstatic Class_jc.y [[I
      // 2a1: bipush 1
      // 2a2: iload 14
      // 2a4: iadd
      // 2a5: aaload
      // 2a6: iload 15
      // 2a8: bipush 8
      // 2aa: iastore
      // 2ab: sipush 4095
      // 2ae: bipush 1
      // 2af: iload 16
      // 2b1: iadd
      // 2b2: iand
      // 2b3: istore 16
      // 2b5: getstatic Class_ub.gb [[I
      // 2b8: iload 14
      // 2ba: bipush -1
      // 2bb: isub
      // 2bc: aaload
      // 2bd: iload 15
      // 2bf: iload 20
      // 2c1: iastore
      // 2c2: iload 15
      // 2c4: ifle 368
      // 2c7: getstatic Class_jc.y [[I
      // 2ca: iload 14
      // 2cc: aaload
      // 2cd: iload 15
      // 2cf: bipush -1
      // 2d0: iadd
      // 2d1: iaload
      // 2d2: bipush -1
      // 2d3: ixor
      // 2d4: bipush -1
      // 2d5: if_icmpne 368
      // 2d8: aload 19
      // 2da: iload 14
      // 2dc: aaload
      // 2dd: iload 15
      // 2df: bipush -1
      // 2e0: iadd
      // 2e1: iaload
      // 2e2: ldc 19661070
      // 2e4: iand
      // 2e5: bipush -1
      // 2e6: ixor
      // 2e7: bipush -1
      // 2e8: if_icmpne 368
      // 2eb: ldc 19661187
      // 2ed: aload 19
      // 2ef: iload 12
      // 2f1: iload 14
      // 2f3: iadd
      // 2f4: bipush -1
      // 2f5: iadd
      // 2f6: aaload
      // 2f7: bipush -1
      // 2f8: iload 15
      // 2fa: iadd
      // 2fb: iaload
      // 2fc: iand
      // 2fd: ifne 368
      // 300: bipush 1
      // 301: istore 21
      // 303: iload 28
      // 305: ifeq 326
      // 308: aload 19
      // 30a: iload 14
      // 30c: iload 21
      // 30e: iadd
      // 30f: aaload
      // 310: iload 15
      // 312: bipush -1
      // 313: iadd
      // 314: iaload
      // 315: ldc 19661199
      // 317: iand
      // 318: bipush -1
      // 319: ixor
      // 31a: bipush -1
      // 31b: if_icmpeq 323
      // 31e: iload 28
      // 320: ifeq 368
      // 323: iinc 21 1
      // 326: iload 12
      // 328: bipush -1
      // 329: iadd
      // 32a: bipush -1
      // 32b: ixor
      // 32c: iload 21
      // 32e: bipush -1
      // 32f: ixor
      // 330: if_icmplt 308
      // 333: getstatic Class_vh.gb [I
      // 336: iload 16
      // 338: iload 14
      // 33a: iastore
      // 33b: getstatic Class_ma.cb [I
      // 33e: iload 16
      // 340: bipush -1
      // 341: iload 15
      // 343: iadd
      // 344: iastore
      // 345: bipush 1
      // 346: iload 16
      // 348: iadd
      // 349: sipush 4095
      // 34c: iand
      // 34d: istore 16
      // 34f: getstatic Class_jc.y [[I
      // 352: iload 14
      // 354: aaload
      // 355: iload 15
      // 357: bipush 1
      // 358: isub
      // 359: bipush 1
      // 35a: iastore
      // 35b: getstatic Class_ub.gb [[I
      // 35e: iload 14
      // 360: aaload
      // 361: bipush -1
      // 362: iload 15
      // 364: iadd
      // 365: iload 20
      // 367: iastore
      // 368: iload 15
      // 36a: bipush -1
      // 36b: ixor
      // 36c: bipush -103
      // 36e: if_icmple 413
      // 371: getstatic Class_jc.y [[I
      // 374: iload 14
      // 376: aaload
      // 377: iload 15
      // 379: bipush 1
      // 37a: iadd
      // 37b: iaload
      // 37c: ifne 413
      // 37f: ldc 19661112
      // 381: aload 19
      // 383: iload 14
      // 385: aaload
      // 386: iload 15
      // 388: iload 12
      // 38a: iadd
      // 38b: iaload
      // 38c: iand
      // 38d: ifne 413
      // 390: ldc 19661280
      // 392: aload 19
      // 394: bipush -1
      // 395: iload 12
      // 397: iload 14
      // 399: iadd
      // 39a: iadd
      // 39b: aaload
      // 39c: iload 12
      // 39e: iload 15
      // 3a0: iadd
      // 3a1: iaload
      // 3a2: iand
      // 3a3: bipush -1
      // 3a4: ixor
      // 3a5: bipush -1
      // 3a6: if_icmpne 413
      // 3a9: bipush 1
      // 3aa: istore 21
      // 3ac: iload 28
      // 3ae: ifeq 3d1
      // 3b1: aload 19
      // 3b3: iload 21
      // 3b5: iload 14
      // 3b7: iadd
      // 3b8: aaload
      // 3b9: iload 15
      // 3bb: iload 12
      // 3bd: ineg
      // 3be: isub
      // 3bf: iaload
      // 3c0: ldc 19661304
      // 3c2: iand
      // 3c3: bipush -1
      // 3c4: ixor
      // 3c5: bipush -1
      // 3c6: if_icmpeq 3ce
      // 3c9: iload 28
      // 3cb: ifeq 413
      // 3ce: iinc 21 1
      // 3d1: iload 12
      // 3d3: bipush 1
      // 3d4: isub
      // 3d5: bipush -1
      // 3d6: ixor
      // 3d7: iload 21
      // 3d9: bipush -1
      // 3da: ixor
      // 3db: if_icmplt 3b1
      // 3de: getstatic Class_vh.gb [I
      // 3e1: iload 16
      // 3e3: iload 14
      // 3e5: iastore
      // 3e6: getstatic Class_ma.cb [I
      // 3e9: iload 16
      // 3eb: bipush 1
      // 3ec: iload 15
      // 3ee: iadd
      // 3ef: iastore
      // 3f0: getstatic Class_jc.y [[I
      // 3f3: iload 14
      // 3f5: aaload
      // 3f6: iload 15
      // 3f8: bipush 1
      // 3f9: iadd
      // 3fa: bipush 4
      // 3fb: iastore
      // 3fc: sipush 4095
      // 3ff: iload 16
      // 401: bipush -1
      // 402: isub
      // 403: iand
      // 404: istore 16
      // 406: getstatic Class_ub.gb [[I
      // 409: iload 14
      // 40b: aaload
      // 40c: bipush 1
      // 40d: iload 15
      // 40f: iadd
      // 410: iload 20
      // 412: iastore
      // 413: iload 14
      // 415: ifle 4fc
      // 418: iload 15
      // 41a: bipush -1
      // 41b: ixor
      // 41c: bipush -1
      // 41d: if_icmpge 4fc
      // 420: getstatic Class_jc.y [[I
      // 423: iload 14
      // 425: bipush -1
      // 426: iadd
      // 427: aaload
      // 428: bipush -1
      // 429: iload 15
      // 42b: iadd
      // 42c: iaload
      // 42d: bipush -1
      // 42e: ixor
      // 42f: bipush -1
      // 430: if_icmpne 4fc
      // 433: ldc 19661112
      // 435: aload 19
      // 437: iload 14
      // 439: bipush -1
      // 43a: iadd
      // 43b: aaload
      // 43c: iload 12
      // 43e: bipush -1
      // 43f: iadd
      // 440: iload 15
      // 442: iadd
      // 443: bipush 1
      // 444: isub
      // 445: iaload
      // 446: iand
      // 447: ifne 4fc
      // 44a: aload 19
      // 44c: iload 14
      // 44e: bipush 1
      // 44f: isub
      // 450: aaload
      // 451: iload 15
      // 453: bipush -1
      // 454: iadd
      // 455: iaload
      // 456: ldc 19661070
      // 458: iand
      // 459: ifne 4fc
      // 45c: aload 19
      // 45e: bipush -1
      // 45f: iload 12
      // 461: iadd
      // 462: iload 14
      // 464: iadd
      // 465: bipush -1
      // 466: iadd
      // 467: aaload
      // 468: bipush -1
      // 469: iload 15
      // 46b: iadd
      // 46c: iaload
      // 46d: ldc 19661187
      // 46f: iand
      // 470: ifne 4fc
      // 473: bipush 1
      // 474: istore 21
      // 476: iload 28
      // 478: ifeq 4b4
      // 47b: aload 19
      // 47d: bipush -1
      // 47e: iload 14
      // 480: iadd
      // 481: aaload
      // 482: bipush -1
      // 483: iload 15
      // 485: iadd
      // 486: iload 21
      // 488: ineg
      // 489: isub
      // 48a: iaload
      // 48b: ldc 19661118
      // 48d: iand
      // 48e: bipush -1
      // 48f: ixor
      // 490: bipush -1
      // 491: if_icmpne 4fc
      // 494: ldc 19661199
      // 496: aload 19
      // 498: iload 21
      // 49a: bipush -1
      // 49b: iload 14
      // 49d: iadd
      // 49e: iadd
      // 49f: aaload
      // 4a0: bipush -1
      // 4a1: iload 15
      // 4a3: iadd
      // 4a4: iaload
      // 4a5: iand
      // 4a6: bipush -1
      // 4a7: ixor
      // 4a8: bipush -1
      // 4a9: if_icmpeq 4b1
      // 4ac: iload 28
      // 4ae: ifeq 4fc
      // 4b1: iinc 21 1
      // 4b4: iload 21
      // 4b6: bipush -1
      // 4b7: ixor
      // 4b8: iload 12
      // 4ba: bipush -1
      // 4bb: iadd
      // 4bc: bipush -1
      // 4bd: ixor
      // 4be: if_icmpgt 47b
      // 4c1: getstatic Class_vh.gb [I
      // 4c4: iload 16
      // 4c6: bipush -1
      // 4c7: iload 14
      // 4c9: iadd
      // 4ca: iastore
      // 4cb: getstatic Class_ma.cb [I
      // 4ce: iload 16
      // 4d0: iload 15
      // 4d2: bipush -1
      // 4d3: iadd
      // 4d4: iastore
      // 4d5: getstatic Class_jc.y [[I
      // 4d8: bipush -1
      // 4d9: iload 14
      // 4db: iadd
      // 4dc: aaload
      // 4dd: bipush -1
      // 4de: iload 15
      // 4e0: iadd
      // 4e1: bipush 3
      // 4e2: iastore
      // 4e3: getstatic Class_ub.gb [[I
      // 4e6: bipush -1
      // 4e7: iload 14
      // 4e9: iadd
      // 4ea: aaload
      // 4eb: iload 15
      // 4ed: bipush -1
      // 4ee: iadd
      // 4ef: iload 20
      // 4f1: iastore
      // 4f2: sipush 4095
      // 4f5: bipush 1
      // 4f6: iload 16
      // 4f8: iadd
      // 4f9: iand
      // 4fa: istore 16
      // 4fc: iload 14
      // 4fe: bipush -1
      // 4ff: ixor
      // 500: bipush -103
      // 502: if_icmple 5e6
      // 505: iload 15
      // 507: ifle 5e6
      // 50a: getstatic Class_jc.y [[I
      // 50d: bipush 1
      // 50e: iload 14
      // 510: iadd
      // 511: aaload
      // 512: iload 15
      // 514: bipush 1
      // 515: isub
      // 516: iaload
      // 517: ifne 5e6
      // 51a: aload 19
      // 51c: iload 14
      // 51e: bipush 1
      // 51f: iadd
      // 520: aaload
      // 521: bipush -1
      // 522: iload 15
      // 524: iadd
      // 525: iaload
      // 526: ldc 19661070
      // 528: iand
      // 529: ifne 5e6
      // 52c: ldc 19661187
      // 52e: aload 19
      // 530: iload 14
      // 532: iload 12
      // 534: ineg
      // 535: isub
      // 536: aaload
      // 537: iload 15
      // 539: bipush -1
      // 53a: iadd
      // 53b: iaload
      // 53c: iand
      // 53d: bipush -1
      // 53e: ixor
      // 53f: bipush -1
      // 540: if_icmpne 5e6
      // 543: ldc 19661280
      // 545: aload 19
      // 547: iload 12
      // 549: iload 14
      // 54b: iadd
      // 54c: aaload
      // 54d: bipush -1
      // 54e: iload 15
      // 550: iload 12
      // 552: ineg
      // 553: isub
      // 554: bipush 1
      // 555: isub
      // 556: iadd
      // 557: iaload
      // 558: iand
      // 559: bipush -1
      // 55a: ixor
      // 55b: bipush -1
      // 55c: if_icmpne 5e6
      // 55f: bipush 1
      // 560: istore 21
      // 562: iload 28
      // 564: ifeq 5a1
      // 567: aload 19
      // 569: iload 12
      // 56b: iload 14
      // 56d: iadd
      // 56e: aaload
      // 56f: iload 21
      // 571: bipush -1
      // 572: iadd
      // 573: iload 15
      // 575: iadd
      // 576: iaload
      // 577: ldc 19661283
      // 579: iand
      // 57a: bipush -1
      // 57b: ixor
      // 57c: bipush -1
      // 57d: if_icmpne 5e6
      // 580: ldc 19661199
      // 582: aload 19
      // 584: iload 14
      // 586: bipush 1
      // 587: iload 21
      // 589: ineg
      // 58a: isub
      // 58b: iadd
      // 58c: aaload
      // 58d: bipush -1
      // 58e: iload 15
      // 590: iadd
      // 591: iaload
      // 592: iand
      // 593: bipush -1
      // 594: ixor
      // 595: bipush -1
      // 596: if_icmpeq 59e
      // 599: iload 28
      // 59b: ifeq 5e6
      // 59e: iinc 21 1
      // 5a1: bipush -1
      // 5a2: iload 12
      // 5a4: iadd
      // 5a5: iload 21
      // 5a7: if_icmpgt 567
      // 5aa: getstatic Class_vh.gb [I
      // 5ad: iload 16
      // 5af: bipush 1
      // 5b0: iload 14
      // 5b2: iadd
      // 5b3: iastore
      // 5b4: getstatic Class_ma.cb [I
      // 5b7: iload 16
      // 5b9: iload 15
      // 5bb: bipush -1
      // 5bc: iadd
      // 5bd: iastore
      // 5be: getstatic Class_jc.y [[I
      // 5c1: bipush 1
      // 5c2: iload 14
      // 5c4: iadd
      // 5c5: aaload
      // 5c6: iload 15
      // 5c8: bipush 1
      // 5c9: isub
      // 5ca: bipush 9
      // 5cc: iastore
      // 5cd: getstatic Class_ub.gb [[I
      // 5d0: bipush 1
      // 5d1: iload 14
      // 5d3: iadd
      // 5d4: aaload
      // 5d5: iload 15
      // 5d7: bipush 1
      // 5d8: isub
      // 5d9: iload 20
      // 5db: iastore
      // 5dc: iload 16
      // 5de: bipush 1
      // 5df: iadd
      // 5e0: sipush 4095
      // 5e3: iand
      // 5e4: istore 16
      // 5e6: iload 14
      // 5e8: bipush -1
      // 5e9: ixor
      // 5ea: bipush -1
      // 5eb: if_icmpge 6c7
      // 5ee: iload 15
      // 5f0: bipush 102
      // 5f2: if_icmpge 6c7
      // 5f5: getstatic Class_jc.y [[I
      // 5f8: iload 14
      // 5fa: bipush -1
      // 5fb: iadd
      // 5fc: aaload
      // 5fd: iload 15
      // 5ff: bipush -1
      // 600: isub
      // 601: iaload
      // 602: bipush -1
      // 603: ixor
      // 604: bipush -1
      // 605: if_icmpne 6c7
      // 608: ldc 19661070
      // 60a: aload 19
      // 60c: bipush -1
      // 60d: iload 14
      // 60f: iadd
      // 610: aaload
      // 611: iload 15
      // 613: bipush -1
      // 614: isub
      // 615: iaload
      // 616: iand
      // 617: ifne 6c7
      // 61a: ldc 19661112
      // 61c: aload 19
      // 61e: iload 14
      // 620: bipush 1
      // 621: isub
      // 622: aaload
      // 623: iload 15
      // 625: iload 12
      // 627: iadd
      // 628: iaload
      // 629: iand
      // 62a: bipush -1
      // 62b: ixor
      // 62c: bipush -1
      // 62d: if_icmpne 6c7
      // 630: aload 19
      // 632: iload 14
      // 634: aaload
      // 635: iload 12
      // 637: iload 15
      // 639: iadd
      // 63a: iaload
      // 63b: ldc 19661280
      // 63d: iand
      // 63e: bipush -1
      // 63f: ixor
      // 640: bipush -1
      // 641: if_icmpne 6c7
      // 644: bipush 1
      // 645: istore 21
      // 647: iload 28
      // 649: ifeq 682
      // 64c: aload 19
      // 64e: iload 14
      // 650: bipush -1
      // 651: iadd
      // 652: aaload
      // 653: iload 21
      // 655: bipush 1
      // 656: iadd
      // 657: iload 15
      // 659: iadd
      // 65a: iaload
      // 65b: ldc 19661118
      // 65d: iand
      // 65e: ifne 6c7
      // 661: aload 19
      // 663: iload 21
      // 665: iload 14
      // 667: iadd
      // 668: bipush -1
      // 669: iadd
      // 66a: aaload
      // 66b: iload 12
      // 66d: iload 15
      // 66f: iadd
      // 670: iaload
      // 671: ldc 19661304
      // 673: iand
      // 674: bipush -1
      // 675: ixor
      // 676: bipush -1
      // 677: if_icmpeq 67f
      // 67a: iload 28
      // 67c: ifeq 6c7
      // 67f: iinc 21 1
      // 682: iload 21
      // 684: bipush -1
      // 685: iload 12
      // 687: iadd
      // 688: if_icmplt 64c
      // 68b: getstatic Class_vh.gb [I
      // 68e: iload 16
      // 690: iload 14
      // 692: bipush 1
      // 693: isub
      // 694: iastore
      // 695: getstatic Class_ma.cb [I
      // 698: iload 16
      // 69a: iload 15
      // 69c: bipush -1
      // 69d: isub
      // 69e: iastore
      // 69f: getstatic Class_jc.y [[I
      // 6a2: iload 14
      // 6a4: bipush -1
      // 6a5: iadd
      // 6a6: aaload
      // 6a7: bipush 1
      // 6a8: iload 15
      // 6aa: iadd
      // 6ab: bipush 6
      // 6ad: iastore
      // 6ae: bipush 1
      // 6af: iload 16
      // 6b1: iadd
      // 6b2: sipush 4095
      // 6b5: iand
      // 6b6: istore 16
      // 6b8: getstatic Class_ub.gb [[I
      // 6bb: bipush -1
      // 6bc: iload 14
      // 6be: iadd
      // 6bf: aaload
      // 6c0: iload 15
      // 6c2: bipush -1
      // 6c3: isub
      // 6c4: iload 20
      // 6c6: iastore
      // 6c7: iload 14
      // 6c9: bipush 102
      // 6cb: if_icmpge 7b2
      // 6ce: iload 15
      // 6d0: bipush 102
      // 6d2: if_icmpge 7b2
      // 6d5: getstatic Class_jc.y [[I
      // 6d8: bipush 1
      // 6d9: iload 14
      // 6db: iadd
      // 6dc: aaload
      // 6dd: bipush 1
      // 6de: iload 15
      // 6e0: iadd
      // 6e1: iaload
      // 6e2: bipush -1
      // 6e3: ixor
      // 6e4: bipush -1
      // 6e5: if_icmpne 7b2
      // 6e8: aload 19
      // 6ea: iload 14
      // 6ec: bipush 1
      // 6ed: iadd
      // 6ee: aaload
      // 6ef: iload 12
      // 6f1: iload 15
      // 6f3: iadd
      // 6f4: iaload
      // 6f5: ldc 19661112
      // 6f7: iand
      // 6f8: bipush -1
      // 6f9: ixor
      // 6fa: bipush -1
      // 6fb: if_icmpne 7b2
      // 6fe: ldc 19661280
      // 700: aload 19
      // 702: iload 14
      // 704: iload 12
      // 706: ineg
      // 707: isub
      // 708: aaload
      // 709: iload 12
      // 70b: iload 15
      // 70d: iadd
      // 70e: iaload
      // 70f: iand
      // 710: bipush -1
      // 711: ixor
      // 712: bipush -1
      // 713: if_icmpne 7b2
      // 716: ldc 19661187
      // 718: aload 19
      // 71a: iload 12
      // 71c: iload 14
      // 71e: iadd
      // 71f: aaload
      // 720: bipush 1
      // 721: iload 15
      // 723: iadd
      // 724: iaload
      // 725: iand
      // 726: ifne 7b2
      // 729: bipush 1
      // 72a: istore 21
      // 72c: iload 28
      // 72e: ifeq 769
      // 731: aload 19
      // 733: iload 21
      // 735: iload 14
      // 737: bipush -1
      // 738: isub
      // 739: iadd
      // 73a: aaload
      // 73b: iload 12
      // 73d: iload 15
      // 73f: iadd
      // 740: iaload
      // 741: ldc 19661304
      // 743: iand
      // 744: ifne 7b2
      // 747: aload 19
      // 749: iload 12
      // 74b: iload 14
      // 74d: iadd
      // 74e: aaload
      // 74f: iload 15
      // 751: bipush -1
      // 752: isub
      // 753: iload 21
      // 755: ineg
      // 756: isub
      // 757: iaload
      // 758: ldc 19661283
      // 75a: iand
      // 75b: bipush -1
      // 75c: ixor
      // 75d: bipush -1
      // 75e: if_icmpeq 766
      // 761: iload 28
      // 763: ifeq 7b2
      // 766: iinc 21 1
      // 769: iload 21
      // 76b: bipush -1
      // 76c: ixor
      // 76d: bipush -1
      // 76e: iload 12
      // 770: iadd
      // 771: bipush -1
      // 772: ixor
      // 773: if_icmpgt 731
      // 776: getstatic Class_vh.gb [I
      // 779: iload 16
      // 77b: bipush 1
      // 77c: iload 14
      // 77e: iadd
      // 77f: iastore
      // 780: getstatic Class_ma.cb [I
      // 783: iload 16
      // 785: iload 15
      // 787: bipush 1
      // 788: iadd
      // 789: iastore
      // 78a: getstatic Class_jc.y [[I
      // 78d: bipush 1
      // 78e: iload 14
      // 790: iadd
      // 791: aaload
      // 792: bipush 1
      // 793: iload 15
      // 795: iadd
      // 796: bipush 12
      // 798: iastore
      // 799: bipush 1
      // 79a: iload 16
      // 79c: iadd
      // 79d: sipush 4095
      // 7a0: iand
      // 7a1: istore 16
      // 7a3: getstatic Class_ub.gb [[I
      // 7a6: iload 14
      // 7a8: bipush 1
      // 7a9: iadd
      // 7aa: aaload
      // 7ab: bipush 1
      // 7ac: iload 15
      // 7ae: iadd
      // 7af: iload 20
      // 7b1: iastore
      // 7b2: iload 16
      // 7b4: bipush -1
      // 7b5: ixor
      // 7b6: iload 17
      // 7b8: bipush -1
      // 7b9: ixor
      // 7ba: if_icmpne 099
      // 7bd: bipush 0
      // 7be: putstatic Class_ek.f I
      // 7c1: iload 18
      // 7c3: ifne 907
      // 7c6: iload 0
      // 7c7: ifeq 905
      // 7ca: sipush 1000
      // 7cd: istore 20
      // 7cf: bipush 100
      // 7d1: istore 21
      // 7d3: bipush 10
      // 7d5: istore 22
      // 7d7: iload 8
      // 7d9: iload 22
      // 7db: ineg
      // 7dc: iadd
      // 7dd: istore 23
      // 7df: iload 28
      // 7e1: ifeq 8d2
      // 7e4: iload 2
      // 7e5: iload 22
      // 7e7: isub
      // 7e8: istore 24
      // 7ea: iload 28
      // 7ec: ifeq 8c6
      // 7ef: iload 23
      // 7f1: iflt 8c3
      // 7f4: iload 24
      // 7f6: iflt 8c3
      // 7f9: iload 23
      // 7fb: bipush -1
      // 7fc: ixor
      // 7fd: bipush -105
      // 7ff: if_icmple 8c3
      // 802: iload 24
      // 804: bipush -1
      // 805: ixor
      // 806: bipush -105
      // 808: if_icmple 8c3
      // 80b: getstatic Class_ub.gb [[I
      // 80e: iload 23
      // 810: aaload
      // 811: iload 24
      // 813: iaload
      // 814: bipush -1
      // 815: ixor
      // 816: bipush -101
      // 818: if_icmple 8c3
      // 81b: bipush 0
      // 81c: istore 26
      // 81e: bipush 0
      // 81f: istore 25
      // 821: iload 8
      // 823: iload 23
      // 825: if_icmple 835
      // 828: iload 23
      // 82a: ineg
      // 82b: iload 8
      // 82d: iadd
      // 82e: istore 25
      // 830: iload 28
      // 832: ifeq 84e
      // 835: iload 23
      // 837: iload 8
      // 839: iload 6
      // 83b: iadd
      // 83c: bipush 1
      // 83d: isub
      // 83e: if_icmple 84e
      // 841: iload 23
      // 843: bipush 1
      // 844: iadd
      // 845: iload 8
      // 847: ineg
      // 848: iadd
      // 849: iload 6
      // 84b: isub
      // 84c: istore 25
      // 84e: iload 2
      // 84f: iload 24
      // 851: if_icmpgt 874
      // 854: iload 4
      // 856: iload 2
      // 857: bipush 1
      // 858: isub
      // 859: iadd
      // 85a: bipush -1
      // 85b: ixor
      // 85c: iload 24
      // 85e: bipush -1
      // 85f: ixor
      // 860: if_icmple 87b
      // 863: bipush 1
      // 864: iload 2
      // 865: iload 4
      // 867: ineg
      // 868: iload 24
      // 86a: iadd
      // 86b: isub
      // 86c: isub
      // 86d: istore 26
      // 86f: iload 28
      // 871: ifeq 87b
      // 874: iload 24
      // 876: ineg
      // 877: iload 2
      // 878: iadd
      // 879: istore 26
      // 87b: iload 26
      // 87d: iload 26
      // 87f: imul
      // 880: iload 25
      // 882: iload 25
      // 884: imul
      // 885: iadd
      // 886: istore 27
      // 888: iload 20
      // 88a: iload 27
      // 88c: if_icmpgt 8ac
      // 88f: iload 27
      // 891: bipush -1
      // 892: ixor
      // 893: iload 20
      // 895: bipush -1
      // 896: ixor
      // 897: if_icmpne 8c3
      // 89a: iload 21
      // 89c: bipush -1
      // 89d: ixor
      // 89e: getstatic Class_ub.gb [[I
      // 8a1: iload 23
      // 8a3: aaload
      // 8a4: iload 24
      // 8a6: iaload
      // 8a7: bipush -1
      // 8a8: ixor
      // 8a9: if_icmpge 8c3
      // 8ac: iload 23
      // 8ae: istore 14
      // 8b0: getstatic Class_ub.gb [[I
      // 8b3: iload 23
      // 8b5: aaload
      // 8b6: iload 24
      // 8b8: iaload
      // 8b9: istore 21
      // 8bb: iload 24
      // 8bd: istore 15
      // 8bf: iload 27
      // 8c1: istore 20
      // 8c3: iinc 24 1
      // 8c6: iload 24
      // 8c8: iload 2
      // 8c9: iload 22
      // 8cb: iadd
      // 8cc: if_icmple 7ef
      // 8cf: iinc 23 1
      // 8d2: iload 23
      // 8d4: iload 8
      // 8d6: iload 22
      // 8d8: ineg
      // 8d9: isub
      // 8da: if_icmple 7e4
      // 8dd: iload 20
      // 8df: bipush -1
      // 8e0: ixor
      // 8e1: sipush -1001
      // 8e4: if_icmpne 8e9
      // 8e7: bipush 0
      // 8e8: ireturn
      // 8e9: iload 1
      // 8ea: bipush -1
      // 8eb: ixor
      // 8ec: iload 14
      // 8ee: bipush -1
      // 8ef: ixor
      // 8f0: if_icmpne 8fc
      // 8f3: iload 9
      // 8f5: iload 15
      // 8f7: if_icmpne 8fc
      // 8fa: bipush 0
      // 8fb: ireturn
      // 8fc: bipush 1
      // 8fd: putstatic Class_ek.f I
      // 900: iload 28
      // 902: ifeq 907
      // 905: bipush 0
      // 906: ireturn
      // 907: bipush 0
      // 908: istore 17
      // 90a: getstatic Class_vh.gb [I
      // 90d: iload 17
      // 90f: iload 14
      // 911: iastore
      // 912: getstatic Class_ma.cb [I
      // 915: iload 17
      // 917: iinc 17 1
      // 91a: iload 15
      // 91c: iastore
      // 91d: getstatic Class_jc.y [[I
      // 920: iload 14
      // 922: aaload
      // 923: iload 15
      // 925: iaload
      // 926: dup
      // 927: istore 21
      // 929: istore 20
      // 92b: iload 28
      // 92d: ifeq 996
      // 930: iload 21
      // 932: bipush -1
      // 933: ixor
      // 934: iload 20
      // 936: bipush -1
      // 937: ixor
      // 938: if_icmpeq 952
      // 93b: iload 20
      // 93d: istore 21
      // 93f: getstatic Class_vh.gb [I
      // 942: iload 17
      // 944: iload 14
      // 946: iastore
      // 947: getstatic Class_ma.cb [I
      // 94a: iload 17
      // 94c: iinc 17 1
      // 94f: iload 15
      // 951: iastore
      // 952: bipush 1
      // 953: iload 20
      // 955: iand
      // 956: ifne 968
      // 959: bipush 4
      // 95a: iload 20
      // 95c: iand
      // 95d: ifeq 96b
      // 960: iinc 15 -1
      // 963: iload 28
      // 965: ifeq 96b
      // 968: iinc 15 1
      // 96b: iload 20
      // 96d: bipush 2
      // 96e: iand
      // 96f: bipush -1
      // 970: ixor
      // 971: bipush -1
      // 972: if_icmpeq 97d
      // 975: iinc 14 1
      // 978: iload 28
      // 97a: ifeq 98b
      // 97d: bipush 8
      // 97f: iload 20
      // 981: iand
      // 982: bipush -1
      // 983: ixor
      // 984: bipush -1
      // 985: if_icmpeq 98b
      // 988: iinc 14 -1
      // 98b: getstatic Class_jc.y [[I
      // 98e: iload 14
      // 990: aaload
      // 991: iload 15
      // 993: iaload
      // 994: istore 20
      // 996: iload 14
      // 998: bipush -1
      // 999: ixor
      // 99a: iload 1
      // 99b: bipush -1
      // 99c: ixor
      // 99d: if_icmpne 930
      // 9a0: iload 9
      // 9a2: bipush -1
      // 9a3: ixor
      // 9a4: iload 15
      // 9a6: bipush -1
      // 9a7: ixor
      // 9a8: if_icmpne 930
      // 9ab: iload 17
      // 9ad: ifle 9ba
      // 9b0: iload 17
      // 9b2: iload 3
      // 9b3: bipush 124
      // 9b5: invokestatic Class_jf.a (IIB)V
      // 9b8: bipush 1
      // 9b9: ireturn
      // 9ba: iload 3
      // 9bb: bipush 1
      // 9bc: if_icmpne 9c1
      // 9bf: bipush 0
      // 9c0: ireturn
      // 9c1: bipush 1
      // 9c2: ireturn
      // 9c3: astore 13
      // 9c5: aload 13
      // 9c7: new java/lang/StringBuffer
      // 9ca: dup
      // 9cb: ldc "lk.D("
      // 9cd: invokespecial java/lang/StringBuffer.<init> (Ljava/lang/String;)V
      // 9d0: iload 0
      // 9d1: invokevirtual java/lang/StringBuffer.append (Z)Ljava/lang/StringBuffer;
      // 9d4: bipush 44
      // 9d6: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 9d9: iload 1
      // 9da: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 9dd: bipush 44
      // 9df: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 9e2: iload 2
      // 9e3: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 9e6: bipush 44
      // 9e8: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 9eb: iload 3
      // 9ec: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 9ef: bipush 44
      // 9f1: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 9f4: iload 4
      // 9f6: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 9f9: bipush 44
      // 9fb: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 9fe: iload 5
      // a00: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // a03: bipush 44
      // a05: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // a08: iload 6
      // a0a: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // a0d: bipush 44
      // a0f: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // a12: iload 7
      // a14: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // a17: bipush 44
      // a19: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // a1c: iload 8
      // a1e: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // a21: bipush 44
      // a23: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // a26: iload 9
      // a28: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // a2b: bipush 44
      // a2d: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // a30: iload 10
      // a32: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // a35: bipush 44
      // a37: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // a3a: iload 11
      // a3c: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // a3f: bipush 44
      // a41: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // a44: iload 12
      // a46: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // a49: bipush 41
      // a4b: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // a4e: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // a51: invokestatic Class_sh.a (Ljava/lang/Throwable;Ljava/lang/String;)LClass_ua;
      // a54: athrow
      return false;
   }

   static final void a(Class_cj var0, int var1) {
      try {
         Class_tf.Y = var0.a(Class_ch.p, (byte)-104);
         x++;
         if (var1 != 1) {
            r = 52;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "lk.C(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
      }
   }

   static final void d(int var0) {
      try {
         w++;
         Class_vb.a.a(123);
         int var1 = -52 % ((-32 - var0) / 44);
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "lk.B(" + var0 + ')');
      }
   }

   public static void e(int var0) {
      try {
         y = null;
         if (var0 == 1) {
            t = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "lk.E(" + var0 + ')');
      }
   }

   public Class_lk() {
   }

   static final void a(int var0, int var1, int var2, byte var3, int var4) {
      try {
         if (var3 != -7) {
            a(-61, 57, -65, (byte)13, 35);
         }

         u++;
         if (~Class_ga.v >= ~var2 && ~var2 >= ~Class_tg.r) {
            var4 = Class_tf.a(var4, Class_hh.h, (byte)114, Class_ff.d);
            var1 = Class_tf.a(var1, Class_hh.h, (byte)114, Class_ff.d);
            Class_jk.a(-6, var2, var1, var0, var4);
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "lk.A(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ')');
      }
   }

   Class_lk(long var1) {
      try {
         this.s = var1;
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "lk.<init>(" + var1 + ')');
      }
   }
}
