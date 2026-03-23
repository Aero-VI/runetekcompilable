final class Class_kj extends Class_pe {
   static int I;
   static int J;
   static Class_r K = Class_tc.a(43, ":duelstake:");
   static int L;
   static int M;
   int[] N;
   int[] O;
   static int P;
   static int Q;
   static int R;
   static Class_r S = Class_tc.a(43, "::qa_op_test");
   static byte[][] T;
   static Class_r U = Class_tc.a(43, ")3runescape)3com");
   static Class_r V = Class_tc.a(43, "<col=ff7000>");
   int[] W;
   static int X;
   static int Y;
   int[] Z;
   static int ab;
   static int bb;
   static int cb;
   Class_r db;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int c(int var1, int var2) {
      int var4 = client.lb;

      try {
         I++;
         if (this.O == null) {
            return -1;
         } else {
            int var3 = 0;
            if (var2 != -1) {
               this.N = null;
               if (var4 != 0) {
                  if (this.W[var3] == var1) {
                     return this.O[var3];
                  }

                  var3++;
               }
            }

            while (var3 < this.O.length) {
               if (this.W[var3] == var1) {
                  return this.O[var3];
               }

               var3++;
            }

            return -1;
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "kj.B(" + var1 + 44 + var2 + 41);
      }
   }

   static final void d(int var0) {
      try {
         Q++;
         Object var1 = Class_kh.a;
         synchronized (var1) {
            if (Class_bb.d == 0) {
               Class_rj.J.a((byte)-58, 5, new Class_oe());
            }

            Class_bb.d = var0;
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "kj.F(" + var0 + ')');
      }
   }

   static final boolean a(
      int param0, int param1, int param2, int param3, int param4, int param5, byte param6, int param7, int param8, int param9, int param10, boolean param11
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
      // 005: bipush -107
      // 007: iload 6
      // 009: bipush -27
      // 00b: isub
      // 00c: bipush 58
      // 00e: idiv
      // 00f: idiv
      // 010: istore 12
      // 012: bipush 0
      // 013: istore 13
      // 015: iload 28
      // 017: ifeq 044
      // 01a: bipush 0
      // 01b: istore 14
      // 01d: iload 28
      // 01f: ifeq 03a
      // 022: getstatic Class_jc.y [[I
      // 025: iload 13
      // 027: aaload
      // 028: iload 14
      // 02a: bipush 0
      // 02b: iastore
      // 02c: getstatic Class_ub.gb [[I
      // 02f: iload 13
      // 031: aaload
      // 032: iload 14
      // 034: ldc 99999999
      // 036: iastore
      // 037: iinc 14 1
      // 03a: iload 14
      // 03c: bipush 104
      // 03e: if_icmplt 022
      // 041: iinc 13 1
      // 044: iload 13
      // 046: bipush -1
      // 047: ixor
      // 048: bipush -105
      // 04a: if_icmpgt 01a
      // 04d: getstatic Class_jc.y [[I
      // 050: iload 9
      // 052: aaload
      // 053: iload 4
      // 055: bipush 99
      // 057: iastore
      // 058: iload 9
      // 05a: istore 14
      // 05c: getstatic Class_kj.bb I
      // 05f: bipush 1
      // 060: iadd
      // 061: putstatic Class_kj.bb I
      // 064: bipush 0
      // 065: istore 16
      // 067: getstatic Class_ub.gb [[I
      // 06a: iload 9
      // 06c: aaload
      // 06d: iload 4
      // 06f: bipush 0
      // 070: iastore
      // 071: iload 4
      // 073: istore 15
      // 075: bipush 0
      // 076: istore 17
      // 078: getstatic Class_vh.gb [I
      // 07b: iload 16
      // 07d: iload 9
      // 07f: iastore
      // 080: bipush 0
      // 081: istore 18
      // 083: getstatic Class_ma.cb [I
      // 086: iload 16
      // 088: iinc 16 1
      // 08b: iload 4
      // 08d: iastore
      // 08e: getstatic Class_sj.j [LClass_ga;
      // 091: getstatic Class_jk.F I
      // 094: aaload
      // 095: getfield Class_ga.z [[I
      // 098: astore 19
      // 09a: iload 28
      // 09c: ifeq 53a
      // 09f: getstatic Class_ma.cb [I
      // 0a2: iload 17
      // 0a4: iaload
      // 0a5: istore 15
      // 0a7: getstatic Class_vh.gb [I
      // 0aa: iload 17
      // 0ac: iaload
      // 0ad: istore 14
      // 0af: sipush 4095
      // 0b2: iload 17
      // 0b4: bipush 1
      // 0b5: iadd
      // 0b6: iand
      // 0b7: istore 17
      // 0b9: iload 14
      // 0bb: bipush -1
      // 0bc: ixor
      // 0bd: iload 5
      // 0bf: bipush -1
      // 0c0: ixor
      // 0c1: if_icmpne 0d6
      // 0c4: iload 0
      // 0c5: bipush -1
      // 0c6: ixor
      // 0c7: iload 15
      // 0c9: bipush -1
      // 0ca: ixor
      // 0cb: if_icmpne 0d6
      // 0ce: bipush 1
      // 0cf: istore 18
      // 0d1: iload 28
      // 0d3: ifeq 541
      // 0d6: iload 2
      // 0d7: ifeq 138
      // 0da: iload 2
      // 0db: bipush -1
      // 0dc: ixor
      // 0dd: bipush -6
      // 0df: if_icmpgt 0ea
      // 0e2: iload 2
      // 0e3: bipush -1
      // 0e4: ixor
      // 0e5: bipush -11
      // 0e7: if_icmpne 10e
      // 0ea: getstatic Class_sj.j [LClass_ga;
      // 0ed: getstatic Class_jk.F I
      // 0f0: aaload
      // 0f1: iload 8
      // 0f3: iload 5
      // 0f5: bipush 108
      // 0f7: iload 14
      // 0f9: bipush 1
      // 0fa: iload 0
      // 0fb: iload 15
      // 0fd: iload 2
      // 0fe: bipush 1
      // 0ff: isub
      // 100: invokevirtual Class_ga.a (IIBIIIII)Z
      // 103: ifeq 10e
      // 106: bipush 1
      // 107: istore 18
      // 109: iload 28
      // 10b: ifeq 541
      // 10e: iload 2
      // 10f: bipush 10
      // 111: if_icmpge 138
      // 114: getstatic Class_sj.j [LClass_ga;
      // 117: getstatic Class_jk.F I
      // 11a: aaload
      // 11b: iload 5
      // 11d: iload 14
      // 11f: iload 8
      // 121: bipush -37
      // 123: bipush 1
      // 124: iload 0
      // 125: iload 15
      // 127: iload 2
      // 128: bipush -1
      // 129: iadd
      // 12a: invokevirtual Class_ga.a (IIIBIIII)Z
      // 12d: ifeq 138
      // 130: bipush 1
      // 131: istore 18
      // 133: iload 28
      // 135: ifeq 541
      // 138: iload 1
      // 139: bipush -1
      // 13a: ixor
      // 13b: bipush -1
      // 13c: if_icmpeq 16a
      // 13f: iload 3
      // 140: bipush -1
      // 141: ixor
      // 142: bipush -1
      // 143: if_icmpeq 16a
      // 146: getstatic Class_sj.j [LClass_ga;
      // 149: getstatic Class_jk.F I
      // 14c: aaload
      // 14d: sipush 15856
      // 150: iload 0
      // 151: bipush 1
      // 152: iload 15
      // 154: iload 3
      // 155: iload 14
      // 157: iload 10
      // 159: iload 1
      // 15a: iload 5
      // 15c: invokevirtual Class_ga.a (IIIIIIIII)Z
      // 15f: ifeq 16a
      // 162: bipush 1
      // 163: istore 18
      // 165: iload 28
      // 167: ifeq 541
      // 16a: getstatic Class_ub.gb [[I
      // 16d: iload 14
      // 16f: aaload
      // 170: iload 15
      // 172: iaload
      // 173: bipush 1
      // 174: iadd
      // 175: istore 20
      // 177: iload 14
      // 179: bipush -1
      // 17a: ixor
      // 17b: bipush -1
      // 17c: if_icmpge 1d8
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
      // 18d: if_icmpne 1d8
      // 190: aload 19
      // 192: bipush -1
      // 193: iload 14
      // 195: iadd
      // 196: aaload
      // 197: iload 15
      // 199: iaload
      // 19a: ldc 19661064
      // 19c: iand
      // 19d: bipush -1
      // 19e: ixor
      // 19f: bipush -1
      // 1a0: if_icmpne 1d8
      // 1a3: getstatic Class_vh.gb [I
      // 1a6: iload 16
      // 1a8: iload 14
      // 1aa: bipush -1
      // 1ab: iadd
      // 1ac: iastore
      // 1ad: getstatic Class_ma.cb [I
      // 1b0: iload 16
      // 1b2: iload 15
      // 1b4: iastore
      // 1b5: sipush 4095
      // 1b8: iload 16
      // 1ba: bipush 1
      // 1bb: iadd
      // 1bc: iand
      // 1bd: istore 16
      // 1bf: getstatic Class_jc.y [[I
      // 1c2: iload 14
      // 1c4: bipush -1
      // 1c5: iadd
      // 1c6: aaload
      // 1c7: iload 15
      // 1c9: bipush 2
      // 1ca: iastore
      // 1cb: getstatic Class_ub.gb [[I
      // 1ce: bipush -1
      // 1cf: iload 14
      // 1d1: iadd
      // 1d2: aaload
      // 1d3: iload 15
      // 1d5: iload 20
      // 1d7: iastore
      // 1d8: iload 14
      // 1da: bipush 103
      // 1dc: if_icmpge 236
      // 1df: getstatic Class_jc.y [[I
      // 1e2: iload 14
      // 1e4: bipush -1
      // 1e5: isub
      // 1e6: aaload
      // 1e7: iload 15
      // 1e9: iaload
      // 1ea: ifne 236
      // 1ed: ldc 19661184
      // 1ef: aload 19
      // 1f1: iload 14
      // 1f3: bipush -1
      // 1f4: isub
      // 1f5: aaload
      // 1f6: iload 15
      // 1f8: iaload
      // 1f9: iand
      // 1fa: bipush -1
      // 1fb: ixor
      // 1fc: bipush -1
      // 1fd: if_icmpne 236
      // 200: getstatic Class_vh.gb [I
      // 203: iload 16
      // 205: bipush 1
      // 206: iload 14
      // 208: iadd
      // 209: iastore
      // 20a: getstatic Class_ma.cb [I
      // 20d: iload 16
      // 20f: iload 15
      // 211: iastore
      // 212: bipush 1
      // 213: iload 16
      // 215: iadd
      // 216: sipush 4095
      // 219: iand
      // 21a: istore 16
      // 21c: getstatic Class_jc.y [[I
      // 21f: bipush 1
      // 220: iload 14
      // 222: iadd
      // 223: aaload
      // 224: iload 15
      // 226: bipush 8
      // 228: iastore
      // 229: getstatic Class_ub.gb [[I
      // 22c: bipush 1
      // 22d: iload 14
      // 22f: iadd
      // 230: aaload
      // 231: iload 15
      // 233: iload 20
      // 235: iastore
      // 236: iload 15
      // 238: bipush -1
      // 239: ixor
      // 23a: bipush -1
      // 23b: if_icmpge 294
      // 23e: getstatic Class_jc.y [[I
      // 241: iload 14
      // 243: aaload
      // 244: iload 15
      // 246: bipush 1
      // 247: isub
      // 248: iaload
      // 249: bipush -1
      // 24a: ixor
      // 24b: bipush -1
      // 24c: if_icmpne 294
      // 24f: aload 19
      // 251: iload 14
      // 253: aaload
      // 254: bipush -1
      // 255: iload 15
      // 257: iadd
      // 258: iaload
      // 259: ldc 19661058
      // 25b: iand
      // 25c: ifne 294
      // 25f: getstatic Class_vh.gb [I
      // 262: iload 16
      // 264: iload 14
      // 266: iastore
      // 267: getstatic Class_ma.cb [I
      // 26a: iload 16
      // 26c: bipush -1
      // 26d: iload 15
      // 26f: iadd
      // 270: iastore
      // 271: getstatic Class_jc.y [[I
      // 274: iload 14
      // 276: aaload
      // 277: iload 15
      // 279: bipush -1
      // 27a: iadd
      // 27b: bipush 1
      // 27c: iastore
      // 27d: sipush 4095
      // 280: iload 16
      // 282: bipush -1
      // 283: isub
      // 284: iand
      // 285: istore 16
      // 287: getstatic Class_ub.gb [[I
      // 28a: iload 14
      // 28c: aaload
      // 28d: bipush -1
      // 28e: iload 15
      // 290: iadd
      // 291: iload 20
      // 293: iastore
      // 294: iload 15
      // 296: bipush 103
      // 298: if_icmpge 2ee
      // 29b: getstatic Class_jc.y [[I
      // 29e: iload 14
      // 2a0: aaload
      // 2a1: iload 15
      // 2a3: bipush -1
      // 2a4: isub
      // 2a5: iaload
      // 2a6: ifne 2ee
      // 2a9: aload 19
      // 2ab: iload 14
      // 2ad: aaload
      // 2ae: iload 15
      // 2b0: bipush -1
      // 2b1: isub
      // 2b2: iaload
      // 2b3: ldc 19661088
      // 2b5: iand
      // 2b6: ifne 2ee
      // 2b9: getstatic Class_vh.gb [I
      // 2bc: iload 16
      // 2be: iload 14
      // 2c0: iastore
      // 2c1: getstatic Class_ma.cb [I
      // 2c4: iload 16
      // 2c6: iload 15
      // 2c8: bipush -1
      // 2c9: isub
      // 2ca: iastore
      // 2cb: getstatic Class_jc.y [[I
      // 2ce: iload 14
      // 2d0: aaload
      // 2d1: iload 15
      // 2d3: bipush 1
      // 2d4: iadd
      // 2d5: bipush 4
      // 2d6: iastore
      // 2d7: getstatic Class_ub.gb [[I
      // 2da: iload 14
      // 2dc: aaload
      // 2dd: iload 15
      // 2df: bipush -1
      // 2e0: isub
      // 2e1: iload 20
      // 2e3: iastore
      // 2e4: iload 16
      // 2e6: bipush -1
      // 2e7: isub
      // 2e8: sipush 4095
      // 2eb: iand
      // 2ec: istore 16
      // 2ee: iload 14
      // 2f0: bipush -1
      // 2f1: ixor
      // 2f2: bipush -1
      // 2f3: if_icmpge 381
      // 2f6: iload 15
      // 2f8: ifle 381
      // 2fb: getstatic Class_jc.y [[I
      // 2fe: bipush -1
      // 2ff: iload 14
      // 301: iadd
      // 302: aaload
      // 303: iload 15
      // 305: bipush -1
      // 306: iadd
      // 307: iaload
      // 308: bipush -1
      // 309: ixor
      // 30a: bipush -1
      // 30b: if_icmpne 381
      // 30e: aload 19
      // 310: iload 14
      // 312: bipush 1
      // 313: isub
      // 314: aaload
      // 315: bipush -1
      // 316: iload 15
      // 318: iadd
      // 319: iaload
      // 31a: ldc 19661070
      // 31c: iand
      // 31d: bipush -1
      // 31e: ixor
      // 31f: bipush -1
      // 320: if_icmpne 381
      // 323: aload 19
      // 325: iload 14
      // 327: bipush 1
      // 328: isub
      // 329: aaload
      // 32a: iload 15
      // 32c: iaload
      // 32d: ldc 19661064
      // 32f: iand
      // 330: ifne 381
      // 333: aload 19
      // 335: iload 14
      // 337: aaload
      // 338: bipush -1
      // 339: iload 15
      // 33b: iadd
      // 33c: iaload
      // 33d: ldc 19661058
      // 33f: iand
      // 340: bipush -1
      // 341: ixor
      // 342: bipush -1
      // 343: if_icmpne 381
      // 346: getstatic Class_vh.gb [I
      // 349: iload 16
      // 34b: bipush -1
      // 34c: iload 14
      // 34e: iadd
      // 34f: iastore
      // 350: getstatic Class_ma.cb [I
      // 353: iload 16
      // 355: iload 15
      // 357: bipush 1
      // 358: isub
      // 359: iastore
      // 35a: sipush 4095
      // 35d: bipush 1
      // 35e: iload 16
      // 360: iadd
      // 361: iand
      // 362: istore 16
      // 364: getstatic Class_jc.y [[I
      // 367: iload 14
      // 369: bipush -1
      // 36a: iadd
      // 36b: aaload
      // 36c: bipush -1
      // 36d: iload 15
      // 36f: iadd
      // 370: bipush 3
      // 371: iastore
      // 372: getstatic Class_ub.gb [[I
      // 375: iload 14
      // 377: bipush -1
      // 378: iadd
      // 379: aaload
      // 37a: bipush -1
      // 37b: iload 15
      // 37d: iadd
      // 37e: iload 20
      // 380: iastore
      // 381: iload 14
      // 383: bipush -1
      // 384: ixor
      // 385: bipush -104
      // 387: if_icmple 413
      // 38a: iload 15
      // 38c: bipush -1
      // 38d: ixor
      // 38e: bipush -1
      // 38f: if_icmpge 413
      // 392: getstatic Class_jc.y [[I
      // 395: bipush 1
      // 396: iload 14
      // 398: iadd
      // 399: aaload
      // 39a: iload 15
      // 39c: bipush 1
      // 39d: isub
      // 39e: iaload
      // 39f: ifne 413
      // 3a2: ldc 19661187
      // 3a4: aload 19
      // 3a6: bipush 1
      // 3a7: iload 14
      // 3a9: iadd
      // 3aa: aaload
      // 3ab: iload 15
      // 3ad: bipush -1
      // 3ae: iadd
      // 3af: iaload
      // 3b0: iand
      // 3b1: ifne 413
      // 3b4: ldc 19661184
      // 3b6: aload 19
      // 3b8: bipush 1
      // 3b9: iload 14
      // 3bb: iadd
      // 3bc: aaload
      // 3bd: iload 15
      // 3bf: iaload
      // 3c0: iand
      // 3c1: ifne 413
      // 3c4: ldc 19661058
      // 3c6: aload 19
      // 3c8: iload 14
      // 3ca: aaload
      // 3cb: iload 15
      // 3cd: bipush -1
      // 3ce: iadd
      // 3cf: iaload
      // 3d0: iand
      // 3d1: bipush -1
      // 3d2: ixor
      // 3d3: bipush -1
      // 3d4: if_icmpne 413
      // 3d7: getstatic Class_vh.gb [I
      // 3da: iload 16
      // 3dc: bipush 1
      // 3dd: iload 14
      // 3df: iadd
      // 3e0: iastore
      // 3e1: getstatic Class_ma.cb [I
      // 3e4: iload 16
      // 3e6: iload 15
      // 3e8: bipush -1
      // 3e9: iadd
      // 3ea: iastore
      // 3eb: sipush 4095
      // 3ee: bipush 1
      // 3ef: iload 16
      // 3f1: iadd
      // 3f2: iand
      // 3f3: istore 16
      // 3f5: getstatic Class_jc.y [[I
      // 3f8: iload 14
      // 3fa: bipush 1
      // 3fb: iadd
      // 3fc: aaload
      // 3fd: bipush -1
      // 3fe: iload 15
      // 400: iadd
      // 401: bipush 9
      // 403: iastore
      // 404: getstatic Class_ub.gb [[I
      // 407: bipush 1
      // 408: iload 14
      // 40a: iadd
      // 40b: aaload
      // 40c: iload 15
      // 40e: bipush -1
      // 40f: iadd
      // 410: iload 20
      // 412: iastore
      // 413: iload 14
      // 415: bipush -1
      // 416: ixor
      // 417: bipush -1
      // 418: if_icmpge 4a8
      // 41b: iload 15
      // 41d: bipush -1
      // 41e: ixor
      // 41f: bipush -104
      // 421: if_icmple 4a8
      // 424: getstatic Class_jc.y [[I
      // 427: bipush -1
      // 428: iload 14
      // 42a: iadd
      // 42b: aaload
      // 42c: bipush 1
      // 42d: iload 15
      // 42f: iadd
      // 430: iaload
      // 431: bipush -1
      // 432: ixor
      // 433: bipush -1
      // 434: if_icmpne 4a8
      // 437: aload 19
      // 439: bipush -1
      // 43a: iload 14
      // 43c: iadd
      // 43d: aaload
      // 43e: iload 15
      // 440: bipush 1
      // 441: iadd
      // 442: iaload
      // 443: ldc 19661112
      // 445: iand
      // 446: ifne 4a8
      // 449: ldc 19661064
      // 44b: aload 19
      // 44d: iload 14
      // 44f: bipush -1
      // 450: iadd
      // 451: aaload
      // 452: iload 15
      // 454: iaload
      // 455: iand
      // 456: bipush -1
      // 457: ixor
      // 458: bipush -1
      // 459: if_icmpne 4a8
      // 45c: aload 19
      // 45e: iload 14
      // 460: aaload
      // 461: bipush 1
      // 462: iload 15
      // 464: iadd
      // 465: iaload
      // 466: ldc 19661088
      // 468: iand
      // 469: ifne 4a8
      // 46c: getstatic Class_vh.gb [I
      // 46f: iload 16
      // 471: iload 14
      // 473: bipush 1
      // 474: isub
      // 475: iastore
      // 476: getstatic Class_ma.cb [I
      // 479: iload 16
      // 47b: bipush 1
      // 47c: iload 15
      // 47e: iadd
      // 47f: iastore
      // 480: sipush 4095
      // 483: iload 16
      // 485: bipush -1
      // 486: isub
      // 487: iand
      // 488: istore 16
      // 48a: getstatic Class_jc.y [[I
      // 48d: bipush -1
      // 48e: iload 14
      // 490: iadd
      // 491: aaload
      // 492: bipush 1
      // 493: iload 15
      // 495: iadd
      // 496: bipush 6
      // 498: iastore
      // 499: getstatic Class_ub.gb [[I
      // 49c: iload 14
      // 49e: bipush 1
      // 49f: isub
      // 4a0: aaload
      // 4a1: iload 15
      // 4a3: bipush -1
      // 4a4: isub
      // 4a5: iload 20
      // 4a7: iastore
      // 4a8: iload 14
      // 4aa: bipush 103
      // 4ac: if_icmpge 53a
      // 4af: iload 15
      // 4b1: bipush 103
      // 4b3: if_icmpge 53a
      // 4b6: getstatic Class_jc.y [[I
      // 4b9: iload 14
      // 4bb: bipush -1
      // 4bc: isub
      // 4bd: aaload
      // 4be: bipush 1
      // 4bf: iload 15
      // 4c1: iadd
      // 4c2: iaload
      // 4c3: ifne 53a
      // 4c6: aload 19
      // 4c8: iload 14
      // 4ca: bipush 1
      // 4cb: iadd
      // 4cc: aaload
      // 4cd: iload 15
      // 4cf: bipush 1
      // 4d0: iadd
      // 4d1: iaload
      // 4d2: ldc 19661280
      // 4d4: iand
      // 4d5: bipush -1
      // 4d6: ixor
      // 4d7: bipush -1
      // 4d8: if_icmpne 53a
      // 4db: ldc 19661184
      // 4dd: aload 19
      // 4df: bipush 1
      // 4e0: iload 14
      // 4e2: iadd
      // 4e3: aaload
      // 4e4: iload 15
      // 4e6: iaload
      // 4e7: iand
      // 4e8: bipush -1
      // 4e9: ixor
      // 4ea: bipush -1
      // 4eb: if_icmpne 53a
      // 4ee: aload 19
      // 4f0: iload 14
      // 4f2: aaload
      // 4f3: iload 15
      // 4f5: bipush -1
      // 4f6: isub
      // 4f7: iaload
      // 4f8: ldc 19661088
      // 4fa: iand
      // 4fb: ifne 53a
      // 4fe: getstatic Class_vh.gb [I
      // 501: iload 16
      // 503: iload 14
      // 505: bipush -1
      // 506: isub
      // 507: iastore
      // 508: getstatic Class_ma.cb [I
      // 50b: iload 16
      // 50d: bipush 1
      // 50e: iload 15
      // 510: iadd
      // 511: iastore
      // 512: getstatic Class_jc.y [[I
      // 515: iload 14
      // 517: bipush 1
      // 518: iadd
      // 519: aaload
      // 51a: iload 15
      // 51c: bipush -1
      // 51d: isub
      // 51e: bipush 12
      // 520: iastore
      // 521: getstatic Class_ub.gb [[I
      // 524: bipush 1
      // 525: iload 14
      // 527: iadd
      // 528: aaload
      // 529: bipush 1
      // 52a: iload 15
      // 52c: iadd
      // 52d: iload 20
      // 52f: iastore
      // 530: sipush 4095
      // 533: iload 16
      // 535: bipush 1
      // 536: iadd
      // 537: iand
      // 538: istore 16
      // 53a: iload 17
      // 53c: iload 16
      // 53e: if_icmpne 09f
      // 541: bipush 0
      // 542: putstatic Class_ek.f I
      // 545: iload 18
      // 547: ifne 68e
      // 54a: iload 11
      // 54c: ifeq 68c
      // 54f: sipush 1000
      // 552: istore 20
      // 554: bipush 100
      // 556: istore 21
      // 558: bipush 10
      // 55a: istore 22
      // 55c: iload 22
      // 55e: ineg
      // 55f: iload 5
      // 561: iadd
      // 562: istore 23
      // 564: iload 28
      // 566: ifeq 65b
      // 569: iload 0
      // 56a: iload 22
      // 56c: isub
      // 56d: istore 24
      // 56f: iload 28
      // 571: ifeq 64e
      // 574: iload 23
      // 576: iflt 64b
      // 579: iload 24
      // 57b: bipush -1
      // 57c: ixor
      // 57d: bipush -1
      // 57e: if_icmpgt 64b
      // 581: iload 23
      // 583: bipush 104
      // 585: if_icmpge 64b
      // 588: iload 24
      // 58a: bipush 104
      // 58c: if_icmpge 64b
      // 58f: getstatic Class_ub.gb [[I
      // 592: iload 23
      // 594: aaload
      // 595: iload 24
      // 597: iaload
      // 598: bipush -1
      // 599: ixor
      // 59a: bipush -101
      // 59c: if_icmple 64b
      // 59f: bipush 0
      // 5a0: istore 25
      // 5a2: iload 23
      // 5a4: iload 5
      // 5a6: if_icmpge 5b6
      // 5a9: iload 23
      // 5ab: ineg
      // 5ac: iload 5
      // 5ae: iadd
      // 5af: istore 25
      // 5b1: iload 28
      // 5b3: ifeq 5d3
      // 5b6: iload 23
      // 5b8: bipush -1
      // 5b9: ixor
      // 5ba: bipush -1
      // 5bb: iload 5
      // 5bd: iadd
      // 5be: iload 1
      // 5bf: ineg
      // 5c0: isub
      // 5c1: bipush -1
      // 5c2: ixor
      // 5c3: if_icmpge 5d3
      // 5c6: iload 5
      // 5c8: ineg
      // 5c9: iload 1
      // 5ca: ineg
      // 5cb: iadd
      // 5cc: bipush -1
      // 5cd: iload 23
      // 5cf: isub
      // 5d0: isub
      // 5d1: istore 25
      // 5d3: bipush 0
      // 5d4: istore 26
      // 5d6: iload 0
      // 5d7: iload 24
      // 5d9: if_icmple 5e8
      // 5dc: iload 24
      // 5de: ineg
      // 5df: iload 0
      // 5e0: iadd
      // 5e1: istore 26
      // 5e3: iload 28
      // 5e5: ifeq 602
      // 5e8: bipush -1
      // 5e9: iload 3
      // 5ea: iadd
      // 5eb: iload 0
      // 5ec: iadd
      // 5ed: bipush -1
      // 5ee: ixor
      // 5ef: iload 24
      // 5f1: bipush -1
      // 5f2: ixor
      // 5f3: if_icmple 602
      // 5f6: iload 0
      // 5f7: ineg
      // 5f8: iload 3
      // 5f9: ineg
      // 5fa: bipush 1
      // 5fb: iload 24
      // 5fd: iadd
      // 5fe: iadd
      // 5ff: iadd
      // 600: istore 26
      // 602: iload 25
      // 604: iload 25
      // 606: imul
      // 607: iload 26
      // 609: iload 26
      // 60b: imul
      // 60c: ineg
      // 60d: isub
      // 60e: istore 27
      // 610: iload 20
      // 612: bipush -1
      // 613: ixor
      // 614: iload 27
      // 616: bipush -1
      // 617: ixor
      // 618: if_icmplt 634
      // 61b: iload 27
      // 61d: iload 20
      // 61f: if_icmpne 64b
      // 622: getstatic Class_ub.gb [[I
      // 625: iload 23
      // 627: aaload
      // 628: iload 24
      // 62a: iaload
      // 62b: bipush -1
      // 62c: ixor
      // 62d: iload 21
      // 62f: bipush -1
      // 630: ixor
      // 631: if_icmple 64b
      // 634: iload 23
      // 636: istore 14
      // 638: iload 27
      // 63a: istore 20
      // 63c: getstatic Class_ub.gb [[I
      // 63f: iload 23
      // 641: aaload
      // 642: iload 24
      // 644: iaload
      // 645: istore 21
      // 647: iload 24
      // 649: istore 15
      // 64b: iinc 24 1
      // 64e: iload 0
      // 64f: iload 22
      // 651: ineg
      // 652: isub
      // 653: iload 24
      // 655: if_icmpge 574
      // 658: iinc 23 1
      // 65b: iload 22
      // 65d: iload 5
      // 65f: iadd
      // 660: iload 23
      // 662: if_icmpge 569
      // 665: iload 20
      // 667: sipush 1000
      // 66a: if_icmpne 66f
      // 66d: bipush 0
      // 66e: ireturn
      // 66f: iload 9
      // 671: iload 14
      // 673: if_icmpne 683
      // 676: iload 4
      // 678: bipush -1
      // 679: ixor
      // 67a: iload 15
      // 67c: bipush -1
      // 67d: ixor
      // 67e: if_icmpne 683
      // 681: bipush 0
      // 682: ireturn
      // 683: bipush 1
      // 684: putstatic Class_ek.f I
      // 687: iload 28
      // 689: ifeq 68e
      // 68c: bipush 0
      // 68d: ireturn
      // 68e: bipush 0
      // 68f: istore 17
      // 691: getstatic Class_vh.gb [I
      // 694: iload 17
      // 696: iload 14
      // 698: iastore
      // 699: getstatic Class_ma.cb [I
      // 69c: iload 17
      // 69e: iinc 17 1
      // 6a1: iload 15
      // 6a3: iastore
      // 6a4: getstatic Class_jc.y [[I
      // 6a7: iload 14
      // 6a9: aaload
      // 6aa: iload 15
      // 6ac: iaload
      // 6ad: dup
      // 6ae: istore 21
      // 6b0: istore 20
      // 6b2: iload 28
      // 6b4: ifeq 71c
      // 6b7: iload 21
      // 6b9: iload 20
      // 6bb: if_icmpeq 6d5
      // 6be: getstatic Class_vh.gb [I
      // 6c1: iload 17
      // 6c3: iload 14
      // 6c5: iastore
      // 6c6: iload 20
      // 6c8: istore 21
      // 6ca: getstatic Class_ma.cb [I
      // 6cd: iload 17
      // 6cf: iinc 17 1
      // 6d2: iload 15
      // 6d4: iastore
      // 6d5: bipush 1
      // 6d6: iload 20
      // 6d8: iand
      // 6d9: bipush -1
      // 6da: ixor
      // 6db: bipush -1
      // 6dc: if_icmpeq 6e7
      // 6df: iinc 15 1
      // 6e2: iload 28
      // 6e4: ifeq 6f4
      // 6e7: iload 20
      // 6e9: bipush 4
      // 6ea: iand
      // 6eb: bipush -1
      // 6ec: ixor
      // 6ed: bipush -1
      // 6ee: if_icmpeq 6f4
      // 6f1: iinc 15 -1
      // 6f4: iload 20
      // 6f6: bipush 2
      // 6f7: iand
      // 6f8: bipush -1
      // 6f9: ixor
      // 6fa: bipush -1
      // 6fb: if_icmpne 70e
      // 6fe: bipush 8
      // 700: iload 20
      // 702: iand
      // 703: ifeq 711
      // 706: iinc 14 -1
      // 709: iload 28
      // 70b: ifeq 711
      // 70e: iinc 14 1
      // 711: getstatic Class_jc.y [[I
      // 714: iload 14
      // 716: aaload
      // 717: iload 15
      // 719: iaload
      // 71a: istore 20
      // 71c: iload 14
      // 71e: bipush -1
      // 71f: ixor
      // 720: iload 9
      // 722: bipush -1
      // 723: ixor
      // 724: if_icmpne 6b7
      // 727: iload 4
      // 729: bipush -1
      // 72a: ixor
      // 72b: iload 15
      // 72d: bipush -1
      // 72e: ixor
      // 72f: if_icmpne 6b7
      // 732: iload 17
      // 734: ifle 742
      // 737: iload 17
      // 739: iload 7
      // 73b: bipush 127
      // 73d: invokestatic Class_jf.a (IIB)V
      // 740: bipush 1
      // 741: ireturn
      // 742: iload 7
      // 744: bipush -1
      // 745: ixor
      // 746: bipush -2
      // 748: if_icmpne 74d
      // 74b: bipush 0
      // 74c: ireturn
      // 74d: bipush 1
      // 74e: ireturn
      // 74f: astore 12
      // 751: aload 12
      // 753: new java/lang/StringBuffer
      // 756: dup
      // 757: ldc "kj.H("
      // 759: invokespecial java/lang/StringBuffer.<init> (Ljava/lang/String;)V
      // 75c: iload 0
      // 75d: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 760: bipush 44
      // 762: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 765: iload 1
      // 766: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 769: bipush 44
      // 76b: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 76e: iload 2
      // 76f: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 772: bipush 44
      // 774: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 777: iload 3
      // 778: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 77b: bipush 44
      // 77d: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 780: iload 4
      // 782: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 785: bipush 44
      // 787: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 78a: iload 5
      // 78c: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 78f: bipush 44
      // 791: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 794: iload 6
      // 796: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 799: bipush 44
      // 79b: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 79e: iload 7
      // 7a0: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 7a3: bipush 44
      // 7a5: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 7a8: iload 8
      // 7aa: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 7ad: bipush 44
      // 7af: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 7b2: iload 9
      // 7b4: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 7b7: bipush 44
      // 7b9: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 7bc: iload 10
      // 7be: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 7c1: bipush 44
      // 7c3: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 7c6: iload 11
      // 7c8: invokevirtual java/lang/StringBuffer.append (Z)Ljava/lang/StringBuffer;
      // 7cb: bipush 41
      // 7cd: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 7d0: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 7d3: invokestatic Class_sh.a (Ljava/lang/Throwable;Ljava/lang/String;)LClass_ua;
      // 7d6: athrow
      return false;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private final void a(boolean var1, Class_lh var2, int var3) {
      int var7 = client.lb;

      try {
         M++;
         if (var1) {
            e(102);
         }

         if (~var3 != -2) {
            if (var3 == 2) {
               int var9 = var2.n(-6677);
               this.Z = new int[var9];
               this.N = new int[var9];
               int var10 = 0;
               if (var7 == 0 && ~var10 <= ~var9) {
                  return;
               } else {
                  do {
                     this.Z[var10] = var2.k(1355769544);
                     int var11 = var2.n(-6677);
                     if (~var11 == -1) {
                        this.N[var10] = -1;
                        if (var7 != 0) {
                           this.N[var10] = var11;
                           var10++;
                        } else {
                           var10++;
                        }
                     } else {
                        this.N[var10] = var11;
                        var10++;
                     }
                  } while (~var10 > ~var9);

                  return;
               }
            }

            if (var3 == 3) {
               int var4 = var2.n(-6677);
               this.O = new int[var4];
               this.W = new int[var4];
               int var5 = 0;
               if (var7 == 0 && ~var5 <= ~var4) {
                  return;
               }

               do {
                  this.O[var5] = var2.k(1355769544);
                  int var6 = var2.n(-6677);
                  if (var6 != 0) {
                     this.W[var5] = var6;
                     if (var7 != 0) {
                        this.W[var5] = -1;
                        var5++;
                     } else {
                        var5++;
                     }
                  } else {
                     this.W[var5] = -1;
                     var5++;
                  }
               } while (~var5 > ~var4);

               return;
            }
         } else {
            this.db = var2.e(127);
         }
      } catch (RuntimeException var8) {
         throw Class_sh.a(var8, "kj.K(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
      }
   }

   final void a(Class_lh var1, boolean var2) {
      int var4 = client.lb;

      try {
         cb++;
         if (!var2) {
            V = null;
         }

         do {
            int var3 = var1.n(-6677);
            if (var3 == 0) {
               break;
            }

            this.a(false, var1, var3);
         } while (var4 == 0);
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "kj.G(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int d(int var1, int var2) {
      int var4 = client.lb;

      try {
         ab++;
         if (this.Z == null) {
            return -1;
         } else {
            if (var2 < 113) {
               a(74, -95, 56);
            }

            int var3 = 0;
            if (var4 == 0 && ~this.Z.length >= ~var3) {
               return -1;
            } else {
               while (~this.N[var3] != ~var1) {
                  if (~this.Z.length >= ~(++var3)) {
                     return -1;
                  }
               }

               return this.Z[var3];
            }
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "kj.D(" + var1 + 44 + var2 + 41);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final void c(byte var1) {
      int var3 = client.lb;

      try {
         if (var1 > -40) {
            a(-35, null, -90, -21);
         }

         J++;
         if (this.O != null) {
            int var2 = 0;
            if (var3 != 0 || ~var2 > ~this.O.length) {
               do {
                  this.O[var2] = Class_mb.a(this.O[var2], 32768);
               } while (~(++var2) > ~this.O.length);
            }
         }

         if (this.Z != null) {
            int var5 = 0;
            if (var3 != 0 || this.Z.length > var5) {
               do {
                  this.Z[var5] = Class_mb.a(this.Z[var5], 32768);
               } while (this.Z.length > ++var5);
            }
         }
      } catch (RuntimeException var4) {
         throw Class_sh.a(var4, "kj.A(" + var1 + ')');
      }
   }

   public static void e(int var0) {
      try {
         V = null;
         U = null;
         S = null;
         K = null;
         if (var0 != 0) {
            e(-25);
         }

         T = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "kj.C(" + var0 + ')');
      }
   }

   static final void a(int var0, Class_ha var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var11 = client.lb;

      try {
         if (var4 != 25504) {
            T = null;
         }

         label83: {
            R++;
            if (!Class_ed.n) {
               Class_lk.q = 0;
               if (var11 == 0) {
                  break label83;
               }
            }

            Class_lk.q = 32;
         }

         Class_ed.n = false;
         label78:
         if (Class_mi.T != 0) {
            if (~var7 > ~var5 || ~var7 <= ~(16 + var5) || var6 < var0 || 16 + var0 <= var6) {
               if (~var7 <= ~var5 && var7 < 16 + var5 && var6 >= var0 - -var2 - 16 && var6 < var0 + var2) {
                  var1.kb += 4;
                  Class_tg.a(var1, -122);
                  if (var11 == 0) {
                     break label78;
                  }
               }

               if (~(var5 + -Class_lk.q) < ~var7 || ~var7 <= ~(16 + var5 + Class_lk.q) || var6 < var0 - -16 || ~(var0 + var2 - 16) >= ~var6) {
                  break label78;
               }

               int var8 = var2 * (var2 - 32) / var3;
               if (var8 < 8) {
                  var8 = 8;
               }

               int var10 = -var8 + var2 - 32;
               int var9 = var6 - var0 - (16 - -(var8 / 2));
               var1.kb = (var3 - var2) * var9 / var10;
               Class_tg.a(var1, -114);
               Class_ed.n = true;
               if (var11 == 0) {
                  break label78;
               }
            }

            var1.kb -= 4;
            Class_tg.a(var1, var4 ^ -25553);
         }

         if (Class_sa.U != 0) {
            int var13 = var1.Gc;
            if (~var7 <= ~(-var13 + var5) && ~var6 <= ~var0 && var5 - -16 > var7 && var6 <= var2 + var0) {
               var1.kb = var1.kb + Class_sa.U * 45;
               Class_tg.a(var1, -120);
               return;
            }
         }
      } catch (RuntimeException var12) {
         throw Class_sh.a(
            var12, "kj.E(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')'
         );
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final int a(int var0, int var1, int var2) {
      int var6 = client.lb;

      try {
         L++;
         Class_qd var3 = (Class_qd)Class_f.X.a(var2, -125);
         if (var3 == null) {
            return 0;
         } else if (var1 == -1) {
            return 0;
         } else {
            int var4 = var0;
            int var5 = 0;
            if (var6 == 0 && var5 >= var3.y.length) {
               return var0;
            } else {
               do {
                  if (var1 == var3.B[var5]) {
                     var4 += var3.y[var5];
                  }
               } while (++var5 < var3.y.length);

               return var4;
            }
         }
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "kj.I(" + var0 + 44 + var1 + 44 + var2 + 41);
      }
   }

   public Class_kj() {
   }

   static final void a(int var0, Class_ha var1, int var2, int var3) {
      try {
         Y++;
         if (Class_kc.q == 0 || Class_kc.q == 3) {
            if (var1.a(2663)) {
               int var4 = var1.Ub[var2];
               if (~var3 <= ~var4 && var3 <= var1.B[var2] + var4) {
                  var3 -= var1.Gc / 2;
                  var2 -= var1.nc / 2;
                  int var5 = Class_ok.eb + Class_ba.z & 2047;
                  int var7 = Class_kd.q[var5];
                  var7 = var7 * (Class_uf.W + 256) >> -910221912;
                  int var10 = 53 % ((4 - var0) / 50);
                  int var6 = Class_kd.e[var5];
                  var6 = (256 + Class_uf.W) * var6 >> 1439887720;
                  int var9 = -(var3 * var6) + var7 * var2 >> 1723296619;
                  int var8 = var7 * var3 + var2 * var6 >> -1686322517;
                  int var12 = -var9 + Class_gg.B.J >> -495060793;
                  int var11 = var8 + Class_gg.B.hb >> -383880377;
                  if (Class_ib.eb > 0 && Class_wh.q[82] && Class_wh.q[81]) {
                     Class_hh.a(Class_fj.e - -var11, Class_jk.F, var12 + Class_va.ab, 24867);
                  } else {
                     boolean var13 = Class_ce.a(0, 0, Class_gg.B.v[0], Class_gg.B.qb[0], 0, 0, var12, true, 0, -3, 1, var11);
                     if (var13) {
                        Class_cj.S.b(32, var3);
                        Class_cj.S.b(32, var2);
                        Class_cj.S.a(false, Class_ba.z);
                        Class_cj.S.b(32, 57);
                        Class_cj.S.b(32, Class_ok.eb);
                        Class_cj.S.b(32, Class_uf.W);
                        Class_cj.S.b(32, 89);
                        Class_cj.S.a(false, Class_gg.B.hb);
                        Class_cj.S.a(false, Class_gg.B.J);
                        Class_cj.S.b(32, Class_ek.f);
                        Class_cj.S.b(32, 63);
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var14) {
         throw Class_sh.a(var14, "kj.J(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }
}
