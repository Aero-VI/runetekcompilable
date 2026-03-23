final class Class_ce extends Class_lf {
   static short R = 205;
   static int S;
   static int T;
   static Class_r U = Class_tc.a(43, "");
   static Class_r V = Class_ce.ib;
   static Class_r W = Class_tc.a(43, ")4");
   static int X;
   private int Y = 2048;
   static Class_r Z = Class_ce.ib;
   static int ab;
   private int bb = 1024;
   static int cb;
   static int db;
   static int eb;
   static int fb;
   static int[] gb;
   static Class_r hb = Class_tc.a(43, "Null");
   private static Class_r ib = Class_tc.a(43, "yellow:");
   private int jb = 3072;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int[][] a(int var1, boolean var2) {
      int var12 = client.lb;

      try {
         T++;
         if (!var2) {
            ib = null;
         }

         int[][] var3 = super.K.a(var1, (byte)-123);
         if (super.K.q) {
            int[][] var4 = this.c(-20, 0, var1);
            int[] var6 = var4[1];
            int[] var5 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            int var11 = 0;
            if (var12 != 0 || Class_ld.X > var11) {
               do {
                  var8[var11] = this.bb + (this.Y * var5[var11] >> -2082788436);
                  var9[var11] = (var6[var11] * this.Y >> 367066188) + this.bb;
                  var10[var11] = this.bb + (this.Y * var7[var11] >> -1240396596);
               } while (Class_ld.X > ++var11);
            }
         }

         return var3;
      } catch (RuntimeException var13) {
         throw Class_sh.a(var13, "ce.A(" + var1 + ',' + var2 + ')');
      }
   }

   public Class_ce() {
      super(1, false);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   final int[] a(byte var1, int var2) {
      int var6 = client.lb;

      try {
         if (var1 != -61) {
            U = null;
         }

         X++;
         int[] var3 = super.H.a(false, var2);
         if (super.H.s) {
            int[] var4 = this.b(0, var2, var1 ^ -29154);
            int var5 = 0;
            if (var6 != 0 || var5 < Class_ld.X) {
               do {
                  var3[var5] = this.bb - -(var4[var5] * this.Y >> -1474050068);
               } while (++var5 < Class_ld.X);
            }
         }

         return var3;
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "ce.G(" + var1 + ',' + var2 + ')');
      }
   }

   private static final boolean a(
      int param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7, boolean param8, int param9, int param10, int param11
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic client.lb I
      // 003: istore 27
      // 005: bipush 0
      // 006: istore 12
      // 008: iload 27
      // 00a: ifeq 037
      // 00d: bipush 0
      // 00e: istore 13
      // 010: iload 27
      // 012: ifeq 02d
      // 015: getstatic Class_jc.y [[I
      // 018: iload 12
      // 01a: aaload
      // 01b: iload 13
      // 01d: bipush 0
      // 01e: iastore
      // 01f: getstatic Class_ub.gb [[I
      // 022: iload 12
      // 024: aaload
      // 025: iload 13
      // 027: ldc 99999999
      // 029: iastore
      // 02a: iinc 13 1
      // 02d: iload 13
      // 02f: bipush 104
      // 031: if_icmplt 015
      // 034: iinc 12 1
      // 037: iload 12
      // 039: bipush -1
      // 03a: ixor
      // 03b: bipush -105
      // 03d: if_icmpgt 00d
      // 040: iload 10
      // 042: istore 13
      // 044: getstatic Class_jc.y [[I
      // 047: iload 10
      // 049: aaload
      // 04a: iload 0
      // 04b: bipush 99
      // 04d: iastore
      // 04e: getstatic Class_ub.gb [[I
      // 051: iload 10
      // 053: aaload
      // 054: iload 0
      // 055: bipush 0
      // 056: iastore
      // 057: getstatic Class_ce.db I
      // 05a: bipush 1
      // 05b: iadd
      // 05c: putstatic Class_ce.db I
      // 05f: iload 0
      // 060: istore 14
      // 062: bipush 0
      // 063: istore 15
      // 065: bipush 0
      // 066: istore 16
      // 068: getstatic Class_vh.gb [I
      // 06b: iload 15
      // 06d: iload 10
      // 06f: iastore
      // 070: getstatic Class_ma.cb [I
      // 073: iload 15
      // 075: iinc 15 1
      // 078: iload 0
      // 079: iastore
      // 07a: getstatic Class_sj.j [LClass_ga;
      // 07d: getstatic Class_jk.F I
      // 080: aaload
      // 081: getfield Class_ga.z [[I
      // 084: astore 18
      // 086: bipush 0
      // 087: istore 17
      // 089: iload 27
      // 08b: ifeq 585
      // 08e: getstatic Class_vh.gb [I
      // 091: iload 16
      // 093: iaload
      // 094: istore 13
      // 096: getstatic Class_ma.cb [I
      // 099: iload 16
      // 09b: iaload
      // 09c: istore 14
      // 09e: bipush 1
      // 09f: iload 16
      // 0a1: iadd
      // 0a2: sipush 4095
      // 0a5: iand
      // 0a6: istore 16
      // 0a8: iload 13
      // 0aa: bipush -1
      // 0ab: ixor
      // 0ac: iload 6
      // 0ae: bipush -1
      // 0af: ixor
      // 0b0: if_icmpne 0c2
      // 0b3: iload 9
      // 0b5: iload 14
      // 0b7: if_icmpne 0c2
      // 0ba: bipush 1
      // 0bb: istore 17
      // 0bd: iload 27
      // 0bf: ifeq 590
      // 0c2: iload 4
      // 0c4: ifeq 12a
      // 0c7: iload 4
      // 0c9: bipush -1
      // 0ca: ixor
      // 0cb: bipush -6
      // 0cd: if_icmpgt 0d9
      // 0d0: iload 4
      // 0d2: bipush -1
      // 0d3: ixor
      // 0d4: bipush -11
      // 0d6: if_icmpne 0f6
      // 0d9: getstatic Class_sj.j [LClass_ga;
      // 0dc: getstatic Class_jk.F I
      // 0df: aaload
      // 0e0: iload 2
      // 0e1: iload 6
      // 0e3: bipush 108
      // 0e5: iload 13
      // 0e7: bipush 2
      // 0e8: iload 9
      // 0ea: iload 14
      // 0ec: iload 4
      // 0ee: bipush 1
      // 0ef: isub
      // 0f0: invokevirtual Class_ga.a (IIBIIIII)Z
      // 0f3: ifne 122
      // 0f6: iload 4
      // 0f8: bipush 10
      // 0fa: if_icmpge 12a
      // 0fd: getstatic Class_sj.j [LClass_ga;
      // 100: getstatic Class_jk.F I
      // 103: aaload
      // 104: iload 6
      // 106: iload 13
      // 108: iload 2
      // 109: bipush 69
      // 10b: bipush 2
      // 10c: iload 9
      // 10e: iload 14
      // 110: iload 4
      // 112: bipush 1
      // 113: isub
      // 114: invokevirtual Class_ga.a (IIIBIIII)Z
      // 117: ifeq 12a
      // 11a: bipush 1
      // 11b: istore 17
      // 11d: iload 27
      // 11f: ifeq 590
      // 122: bipush 1
      // 123: istore 17
      // 125: iload 27
      // 127: ifeq 590
      // 12a: iload 1
      // 12b: bipush -1
      // 12c: ixor
      // 12d: bipush -1
      // 12e: if_icmpeq 15d
      // 131: iload 3
      // 132: bipush -1
      // 133: ixor
      // 134: bipush -1
      // 135: if_icmpeq 15d
      // 138: getstatic Class_sj.j [LClass_ga;
      // 13b: getstatic Class_jk.F I
      // 13e: aaload
      // 13f: sipush 15856
      // 142: iload 9
      // 144: bipush 2
      // 145: iload 14
      // 147: iload 3
      // 148: iload 13
      // 14a: iload 11
      // 14c: iload 1
      // 14d: iload 6
      // 14f: invokevirtual Class_ga.a (IIIIIIIII)Z
      // 152: ifeq 15d
      // 155: bipush 1
      // 156: istore 17
      // 158: iload 27
      // 15a: ifeq 590
      // 15d: getstatic Class_ub.gb [[I
      // 160: iload 13
      // 162: aaload
      // 163: iload 14
      // 165: iaload
      // 166: bipush -1
      // 167: isub
      // 168: istore 19
      // 16a: iload 13
      // 16c: bipush -1
      // 16d: ixor
      // 16e: bipush -1
      // 16f: if_icmpge 1dd
      // 172: getstatic Class_jc.y [[I
      // 175: bipush -1
      // 176: iload 13
      // 178: iadd
      // 179: aaload
      // 17a: iload 14
      // 17c: iaload
      // 17d: bipush -1
      // 17e: ixor
      // 17f: bipush -1
      // 180: if_icmpne 1dd
      // 183: ldc 19661070
      // 185: aload 18
      // 187: iload 13
      // 189: bipush -1
      // 18a: iadd
      // 18b: aaload
      // 18c: iload 14
      // 18e: iaload
      // 18f: iand
      // 190: bipush -1
      // 191: ixor
      // 192: bipush -1
      // 193: if_icmpne 1dd
      // 196: aload 18
      // 198: iload 13
      // 19a: bipush 1
      // 19b: isub
      // 19c: aaload
      // 19d: bipush 1
      // 19e: iload 14
      // 1a0: iadd
      // 1a1: iaload
      // 1a2: ldc 19661112
      // 1a4: iand
      // 1a5: ifne 1dd
      // 1a8: getstatic Class_vh.gb [I
      // 1ab: iload 15
      // 1ad: bipush -1
      // 1ae: iload 13
      // 1b0: iadd
      // 1b1: iastore
      // 1b2: getstatic Class_ma.cb [I
      // 1b5: iload 15
      // 1b7: iload 14
      // 1b9: iastore
      // 1ba: getstatic Class_jc.y [[I
      // 1bd: iload 13
      // 1bf: bipush -1
      // 1c0: iadd
      // 1c1: aaload
      // 1c2: iload 14
      // 1c4: bipush 2
      // 1c5: iastore
      // 1c6: getstatic Class_ub.gb [[I
      // 1c9: iload 13
      // 1cb: bipush -1
      // 1cc: iadd
      // 1cd: aaload
      // 1ce: iload 14
      // 1d0: iload 19
      // 1d2: iastore
      // 1d3: sipush 4095
      // 1d6: iload 15
      // 1d8: bipush -1
      // 1d9: isub
      // 1da: iand
      // 1db: istore 15
      // 1dd: iload 13
      // 1df: bipush 102
      // 1e1: if_icmpge 254
      // 1e4: getstatic Class_jc.y [[I
      // 1e7: iload 13
      // 1e9: bipush 1
      // 1ea: iadd
      // 1eb: aaload
      // 1ec: iload 14
      // 1ee: iaload
      // 1ef: bipush -1
      // 1f0: ixor
      // 1f1: bipush -1
      // 1f2: if_icmpne 254
      // 1f5: ldc 19661187
      // 1f7: aload 18
      // 1f9: iload 13
      // 1fb: bipush -2
      // 1fd: isub
      // 1fe: aaload
      // 1ff: iload 14
      // 201: iaload
      // 202: iand
      // 203: bipush -1
      // 204: ixor
      // 205: bipush -1
      // 206: if_icmpne 254
      // 209: aload 18
      // 20b: bipush 2
      // 20c: iload 13
      // 20e: iadd
      // 20f: aaload
      // 210: iload 14
      // 212: bipush -1
      // 213: isub
      // 214: iaload
      // 215: ldc 19661280
      // 217: iand
      // 218: bipush -1
      // 219: ixor
      // 21a: bipush -1
      // 21b: if_icmpne 254
      // 21e: getstatic Class_vh.gb [I
      // 221: iload 15
      // 223: bipush 1
      // 224: iload 13
      // 226: iadd
      // 227: iastore
      // 228: getstatic Class_ma.cb [I
      // 22b: iload 15
      // 22d: iload 14
      // 22f: iastore
      // 230: getstatic Class_jc.y [[I
      // 233: bipush 1
      // 234: iload 13
      // 236: iadd
      // 237: aaload
      // 238: iload 14
      // 23a: bipush 8
      // 23c: iastore
      // 23d: getstatic Class_ub.gb [[I
      // 240: iload 13
      // 242: bipush -1
      // 243: isub
      // 244: aaload
      // 245: iload 14
      // 247: iload 19
      // 249: iastore
      // 24a: iload 15
      // 24c: bipush 1
      // 24d: iadd
      // 24e: sipush 4095
      // 251: iand
      // 252: istore 15
      // 254: iload 14
      // 256: ifle 2c4
      // 259: getstatic Class_jc.y [[I
      // 25c: iload 13
      // 25e: aaload
      // 25f: iload 14
      // 261: bipush -1
      // 262: iadd
      // 263: iaload
      // 264: bipush -1
      // 265: ixor
      // 266: bipush -1
      // 267: if_icmpne 2c4
      // 26a: ldc 19661070
      // 26c: aload 18
      // 26e: iload 13
      // 270: aaload
      // 271: bipush -1
      // 272: iload 14
      // 274: iadd
      // 275: iaload
      // 276: iand
      // 277: bipush -1
      // 278: ixor
      // 279: bipush -1
      // 27a: if_icmpne 2c4
      // 27d: ldc 19661187
      // 27f: aload 18
      // 281: bipush 1
      // 282: iload 13
      // 284: iadd
      // 285: aaload
      // 286: bipush -1
      // 287: iload 14
      // 289: iadd
      // 28a: iaload
      // 28b: iand
      // 28c: ifne 2c4
      // 28f: getstatic Class_vh.gb [I
      // 292: iload 15
      // 294: iload 13
      // 296: iastore
      // 297: getstatic Class_ma.cb [I
      // 29a: iload 15
      // 29c: bipush -1
      // 29d: iload 14
      // 29f: iadd
      // 2a0: iastore
      // 2a1: getstatic Class_jc.y [[I
      // 2a4: iload 13
      // 2a6: aaload
      // 2a7: iload 14
      // 2a9: bipush 1
      // 2aa: isub
      // 2ab: bipush 1
      // 2ac: iastore
      // 2ad: sipush 4095
      // 2b0: bipush 1
      // 2b1: iload 15
      // 2b3: iadd
      // 2b4: iand
      // 2b5: istore 15
      // 2b7: getstatic Class_ub.gb [[I
      // 2ba: iload 13
      // 2bc: aaload
      // 2bd: bipush -1
      // 2be: iload 14
      // 2c0: iadd
      // 2c1: iload 19
      // 2c3: iastore
      // 2c4: iload 14
      // 2c6: bipush -1
      // 2c7: ixor
      // 2c8: bipush -103
      // 2ca: if_icmple 335
      // 2cd: getstatic Class_jc.y [[I
      // 2d0: iload 13
      // 2d2: aaload
      // 2d3: bipush 1
      // 2d4: iload 14
      // 2d6: iadd
      // 2d7: iaload
      // 2d8: ifne 335
      // 2db: aload 18
      // 2dd: iload 13
      // 2df: aaload
      // 2e0: iload 14
      // 2e2: bipush 2
      // 2e3: iadd
      // 2e4: iaload
      // 2e5: ldc 19661112
      // 2e7: iand
      // 2e8: bipush -1
      // 2e9: ixor
      // 2ea: bipush -1
      // 2eb: if_icmpne 335
      // 2ee: ldc 19661280
      // 2f0: aload 18
      // 2f2: bipush 1
      // 2f3: iload 13
      // 2f5: iadd
      // 2f6: aaload
      // 2f7: iload 14
      // 2f9: bipush 2
      // 2fa: iadd
      // 2fb: iaload
      // 2fc: iand
      // 2fd: ifne 335
      // 300: getstatic Class_vh.gb [I
      // 303: iload 15
      // 305: iload 13
      // 307: iastore
      // 308: getstatic Class_ma.cb [I
      // 30b: iload 15
      // 30d: bipush 1
      // 30e: iload 14
      // 310: iadd
      // 311: iastore
      // 312: getstatic Class_jc.y [[I
      // 315: iload 13
      // 317: aaload
      // 318: bipush 1
      // 319: iload 14
      // 31b: iadd
      // 31c: bipush 4
      // 31d: iastore
      // 31e: getstatic Class_ub.gb [[I
      // 321: iload 13
      // 323: aaload
      // 324: bipush 1
      // 325: iload 14
      // 327: iadd
      // 328: iload 19
      // 32a: iastore
      // 32b: iload 15
      // 32d: bipush 1
      // 32e: iadd
      // 32f: sipush 4095
      // 332: iand
      // 333: istore 15
      // 335: iload 13
      // 337: bipush -1
      // 338: ixor
      // 339: bipush -1
      // 33a: if_icmpge 3c2
      // 33d: iload 14
      // 33f: ifle 3c2
      // 342: getstatic Class_jc.y [[I
      // 345: iload 13
      // 347: bipush -1
      // 348: iadd
      // 349: aaload
      // 34a: bipush -1
      // 34b: iload 14
      // 34d: iadd
      // 34e: iaload
      // 34f: ifne 3c2
      // 352: ldc 19661112
      // 354: aload 18
      // 356: bipush -1
      // 357: iload 13
      // 359: iadd
      // 35a: aaload
      // 35b: iload 14
      // 35d: iaload
      // 35e: iand
      // 35f: ifne 3c2
      // 362: aload 18
      // 364: iload 13
      // 366: bipush -1
      // 367: iadd
      // 368: aaload
      // 369: iload 14
      // 36b: bipush 1
      // 36c: isub
      // 36d: iaload
      // 36e: ldc 19661070
      // 370: iand
      // 371: bipush -1
      // 372: ixor
      // 373: bipush -1
      // 374: if_icmpne 3c2
      // 377: aload 18
      // 379: iload 13
      // 37b: aaload
      // 37c: bipush -1
      // 37d: iload 14
      // 37f: iadd
      // 380: iaload
      // 381: ldc 19661187
      // 383: iand
      // 384: ifne 3c2
      // 387: getstatic Class_vh.gb [I
      // 38a: iload 15
      // 38c: iload 13
      // 38e: bipush 1
      // 38f: isub
      // 390: iastore
      // 391: getstatic Class_ma.cb [I
      // 394: iload 15
      // 396: iload 14
      // 398: bipush 1
      // 399: isub
      // 39a: iastore
      // 39b: sipush 4095
      // 39e: iload 15
      // 3a0: bipush -1
      // 3a1: isub
      // 3a2: iand
      // 3a3: istore 15
      // 3a5: getstatic Class_jc.y [[I
      // 3a8: bipush -1
      // 3a9: iload 13
      // 3ab: iadd
      // 3ac: aaload
      // 3ad: iload 14
      // 3af: bipush -1
      // 3b0: iadd
      // 3b1: bipush 3
      // 3b2: iastore
      // 3b3: getstatic Class_ub.gb [[I
      // 3b6: iload 13
      // 3b8: bipush -1
      // 3b9: iadd
      // 3ba: aaload
      // 3bb: iload 14
      // 3bd: bipush -1
      // 3be: iadd
      // 3bf: iload 19
      // 3c1: iastore
      // 3c2: iload 13
      // 3c4: bipush -1
      // 3c5: ixor
      // 3c6: bipush -103
      // 3c8: if_icmple 453
      // 3cb: iload 14
      // 3cd: bipush -1
      // 3ce: ixor
      // 3cf: bipush -1
      // 3d0: if_icmpge 453
      // 3d3: getstatic Class_jc.y [[I
      // 3d6: iload 13
      // 3d8: bipush 1
      // 3d9: iadd
      // 3da: aaload
      // 3db: bipush -1
      // 3dc: iload 14
      // 3de: iadd
      // 3df: iaload
      // 3e0: ifne 453
      // 3e3: ldc 19661070
      // 3e5: aload 18
      // 3e7: bipush 1
      // 3e8: iload 13
      // 3ea: iadd
      // 3eb: aaload
      // 3ec: bipush -1
      // 3ed: iload 14
      // 3ef: iadd
      // 3f0: iaload
      // 3f1: iand
      // 3f2: ifne 453
      // 3f5: ldc 19661187
      // 3f7: aload 18
      // 3f9: bipush 2
      // 3fa: iload 13
      // 3fc: iadd
      // 3fd: aaload
      // 3fe: iload 14
      // 400: bipush -1
      // 401: iadd
      // 402: iaload
      // 403: iand
      // 404: ifne 453
      // 407: ldc 19661280
      // 409: aload 18
      // 40b: bipush 2
      // 40c: iload 13
      // 40e: iadd
      // 40f: aaload
      // 410: iload 14
      // 412: iaload
      // 413: iand
      // 414: ifne 453
      // 417: getstatic Class_vh.gb [I
      // 41a: iload 15
      // 41c: bipush 1
      // 41d: iload 13
      // 41f: iadd
      // 420: iastore
      // 421: getstatic Class_ma.cb [I
      // 424: iload 15
      // 426: bipush -1
      // 427: iload 14
      // 429: iadd
      // 42a: iastore
      // 42b: getstatic Class_jc.y [[I
      // 42e: bipush 1
      // 42f: iload 13
      // 431: iadd
      // 432: aaload
      // 433: iload 14
      // 435: bipush 1
      // 436: isub
      // 437: bipush 9
      // 439: iastore
      // 43a: iload 15
      // 43c: bipush 1
      // 43d: iadd
      // 43e: sipush 4095
      // 441: iand
      // 442: istore 15
      // 444: getstatic Class_ub.gb [[I
      // 447: iload 13
      // 449: bipush 1
      // 44a: iadd
      // 44b: aaload
      // 44c: bipush -1
      // 44d: iload 14
      // 44f: iadd
      // 450: iload 19
      // 452: iastore
      // 453: iload 13
      // 455: ifle 4ea
      // 458: iload 14
      // 45a: bipush -1
      // 45b: ixor
      // 45c: bipush -103
      // 45e: if_icmple 4ea
      // 461: getstatic Class_jc.y [[I
      // 464: iload 13
      // 466: bipush -1
      // 467: iadd
      // 468: aaload
      // 469: bipush 1
      // 46a: iload 14
      // 46c: iadd
      // 46d: iaload
      // 46e: ifne 4ea
      // 471: aload 18
      // 473: bipush -1
      // 474: iload 13
      // 476: iadd
      // 477: aaload
      // 478: bipush 1
      // 479: iload 14
      // 47b: iadd
      // 47c: iaload
      // 47d: ldc 19661070
      // 47f: iand
      // 480: bipush -1
      // 481: ixor
      // 482: bipush -1
      // 483: if_icmpne 4ea
      // 486: ldc 19661112
      // 488: aload 18
      // 48a: iload 13
      // 48c: bipush -1
      // 48d: iadd
      // 48e: aaload
      // 48f: iload 14
      // 491: bipush 2
      // 492: iadd
      // 493: iaload
      // 494: iand
      // 495: bipush -1
      // 496: ixor
      // 497: bipush -1
      // 498: if_icmpne 4ea
      // 49b: aload 18
      // 49d: iload 13
      // 49f: aaload
      // 4a0: bipush 2
      // 4a1: iload 14
      // 4a3: iadd
      // 4a4: iaload
      // 4a5: ldc 19661280
      // 4a7: iand
      // 4a8: bipush -1
      // 4a9: ixor
      // 4aa: bipush -1
      // 4ab: if_icmpne 4ea
      // 4ae: getstatic Class_vh.gb [I
      // 4b1: iload 15
      // 4b3: bipush -1
      // 4b4: iload 13
      // 4b6: iadd
      // 4b7: iastore
      // 4b8: getstatic Class_ma.cb [I
      // 4bb: iload 15
      // 4bd: bipush 1
      // 4be: iload 14
      // 4c0: iadd
      // 4c1: iastore
      // 4c2: getstatic Class_jc.y [[I
      // 4c5: iload 13
      // 4c7: bipush 1
      // 4c8: isub
      // 4c9: aaload
      // 4ca: bipush 1
      // 4cb: iload 14
      // 4cd: iadd
      // 4ce: bipush 6
      // 4d0: iastore
      // 4d1: sipush 4095
      // 4d4: bipush 1
      // 4d5: iload 15
      // 4d7: iadd
      // 4d8: iand
      // 4d9: istore 15
      // 4db: getstatic Class_ub.gb [[I
      // 4de: bipush -1
      // 4df: iload 13
      // 4e1: iadd
      // 4e2: aaload
      // 4e3: bipush 1
      // 4e4: iload 14
      // 4e6: iadd
      // 4e7: iload 19
      // 4e9: iastore
      // 4ea: iload 13
      // 4ec: bipush -1
      // 4ed: ixor
      // 4ee: bipush -103
      // 4f0: if_icmple 585
      // 4f3: iload 14
      // 4f5: bipush -1
      // 4f6: ixor
      // 4f7: bipush -103
      // 4f9: if_icmple 585
      // 4fc: getstatic Class_jc.y [[I
      // 4ff: iload 13
      // 501: bipush 1
      // 502: iadd
      // 503: aaload
      // 504: iload 14
      // 506: bipush -1
      // 507: isub
      // 508: iaload
      // 509: ifne 585
      // 50c: ldc 19661112
      // 50e: aload 18
      // 510: iload 13
      // 512: bipush 1
      // 513: iadd
      // 514: aaload
      // 515: bipush 2
      // 516: iload 14
      // 518: iadd
      // 519: iaload
      // 51a: iand
      // 51b: bipush -1
      // 51c: ixor
      // 51d: bipush -1
      // 51e: if_icmpne 585
      // 521: aload 18
      // 523: bipush 2
      // 524: iload 13
      // 526: iadd
      // 527: aaload
      // 528: iload 14
      // 52a: bipush -2
      // 52c: isub
      // 52d: iaload
      // 52e: ldc 19661280
      // 530: iand
      // 531: ifne 585
      // 534: aload 18
      // 536: bipush 2
      // 537: iload 13
      // 539: iadd
      // 53a: aaload
      // 53b: bipush 1
      // 53c: iload 14
      // 53e: iadd
      // 53f: iaload
      // 540: ldc 19661187
      // 542: iand
      // 543: bipush -1
      // 544: ixor
      // 545: bipush -1
      // 546: if_icmpne 585
      // 549: getstatic Class_vh.gb [I
      // 54c: iload 15
      // 54e: iload 13
      // 550: bipush -1
      // 551: isub
      // 552: iastore
      // 553: getstatic Class_ma.cb [I
      // 556: iload 15
      // 558: iload 14
      // 55a: bipush 1
      // 55b: iadd
      // 55c: iastore
      // 55d: getstatic Class_jc.y [[I
      // 560: iload 13
      // 562: bipush -1
      // 563: isub
      // 564: aaload
      // 565: bipush 1
      // 566: iload 14
      // 568: iadd
      // 569: bipush 12
      // 56b: iastore
      // 56c: getstatic Class_ub.gb [[I
      // 56f: iload 13
      // 571: bipush -1
      // 572: isub
      // 573: aaload
      // 574: iload 14
      // 576: bipush 1
      // 577: iadd
      // 578: iload 19
      // 57a: iastore
      // 57b: bipush 1
      // 57c: iload 15
      // 57e: iadd
      // 57f: sipush 4095
      // 582: iand
      // 583: istore 15
      // 585: iload 16
      // 587: bipush -1
      // 588: ixor
      // 589: iload 15
      // 58b: bipush -1
      // 58c: ixor
      // 58d: if_icmpne 08e
      // 590: bipush 0
      // 591: putstatic Class_ek.f I
      // 594: iload 17
      // 596: ifne 6e6
      // 599: iload 5
      // 59b: ifne 5a0
      // 59e: bipush 0
      // 59f: ireturn
      // 5a0: sipush 1000
      // 5a3: istore 19
      // 5a5: bipush 10
      // 5a7: istore 21
      // 5a9: bipush 100
      // 5ab: istore 20
      // 5ad: iload 21
      // 5af: ineg
      // 5b0: iload 6
      // 5b2: iadd
      // 5b3: istore 22
      // 5b5: iload 27
      // 5b7: ifeq 6b5
      // 5ba: iload 9
      // 5bc: iload 21
      // 5be: isub
      // 5bf: istore 23
      // 5c1: iload 27
      // 5c3: ifeq 6a4
      // 5c6: iload 22
      // 5c8: bipush -1
      // 5c9: ixor
      // 5ca: bipush -1
      // 5cb: if_icmpgt 6a1
      // 5ce: iload 23
      // 5d0: iflt 6a1
      // 5d3: iload 22
      // 5d5: bipush 104
      // 5d7: if_icmpge 6a1
      // 5da: iload 23
      // 5dc: bipush 104
      // 5de: if_icmpge 6a1
      // 5e1: getstatic Class_ub.gb [[I
      // 5e4: iload 22
      // 5e6: aaload
      // 5e7: iload 23
      // 5e9: iaload
      // 5ea: bipush 100
      // 5ec: if_icmpge 6a1
      // 5ef: bipush 0
      // 5f0: istore 24
      // 5f2: iload 6
      // 5f4: bipush -1
      // 5f5: ixor
      // 5f6: iload 22
      // 5f8: bipush -1
      // 5f9: ixor
      // 5fa: if_icmpge 609
      // 5fd: iload 6
      // 5ff: iload 22
      // 601: isub
      // 602: istore 24
      // 604: iload 27
      // 606: ifeq 626
      // 609: iload 22
      // 60b: bipush -1
      // 60c: ixor
      // 60d: iload 6
      // 60f: iload 1
      // 610: ineg
      // 611: isub
      // 612: bipush 1
      // 613: isub
      // 614: bipush -1
      // 615: ixor
      // 616: if_icmpge 626
      // 619: iload 6
      // 61b: ineg
      // 61c: iload 1
      // 61d: ineg
      // 61e: bipush 1
      // 61f: iadd
      // 620: iload 22
      // 622: iadd
      // 623: iadd
      // 624: istore 24
      // 626: bipush 0
      // 627: istore 25
      // 629: iload 23
      // 62b: bipush -1
      // 62c: ixor
      // 62d: iload 9
      // 62f: bipush -1
      // 630: ixor
      // 631: if_icmple 641
      // 634: iload 23
      // 636: ineg
      // 637: iload 9
      // 639: iadd
      // 63a: istore 25
      // 63c: iload 27
      // 63e: ifeq 659
      // 641: bipush -1
      // 642: iload 3
      // 643: iload 9
      // 645: iadd
      // 646: iadd
      // 647: iload 23
      // 649: if_icmpge 659
      // 64c: iload 23
      // 64e: iload 3
      // 64f: ineg
      // 650: iload 9
      // 652: ineg
      // 653: iadd
      // 654: iadd
      // 655: bipush 1
      // 656: iadd
      // 657: istore 25
      // 659: iload 24
      // 65b: iload 24
      // 65d: imul
      // 65e: iload 25
      // 660: iload 25
      // 662: imul
      // 663: iadd
      // 664: istore 26
      // 666: iload 19
      // 668: iload 26
      // 66a: if_icmpgt 68a
      // 66d: iload 19
      // 66f: bipush -1
      // 670: ixor
      // 671: iload 26
      // 673: bipush -1
      // 674: ixor
      // 675: if_icmpne 6a1
      // 678: iload 20
      // 67a: bipush -1
      // 67b: ixor
      // 67c: getstatic Class_ub.gb [[I
      // 67f: iload 22
      // 681: aaload
      // 682: iload 23
      // 684: iaload
      // 685: bipush -1
      // 686: ixor
      // 687: if_icmpge 6a1
      // 68a: iload 23
      // 68c: istore 14
      // 68e: iload 22
      // 690: istore 13
      // 692: getstatic Class_ub.gb [[I
      // 695: iload 22
      // 697: aaload
      // 698: iload 23
      // 69a: iaload
      // 69b: istore 20
      // 69d: iload 26
      // 69f: istore 19
      // 6a1: iinc 23 1
      // 6a4: iload 23
      // 6a6: bipush -1
      // 6a7: ixor
      // 6a8: iload 21
      // 6aa: iload 9
      // 6ac: iadd
      // 6ad: bipush -1
      // 6ae: ixor
      // 6af: if_icmpge 5c6
      // 6b2: iinc 22 1
      // 6b5: iload 22
      // 6b7: bipush -1
      // 6b8: ixor
      // 6b9: iload 21
      // 6bb: iload 6
      // 6bd: iadd
      // 6be: bipush -1
      // 6bf: ixor
      // 6c0: if_icmpge 5ba
      // 6c3: iload 19
      // 6c5: bipush -1
      // 6c6: ixor
      // 6c7: sipush -1001
      // 6ca: if_icmpne 6cf
      // 6cd: bipush 0
      // 6ce: ireturn
      // 6cf: iload 10
      // 6d1: bipush -1
      // 6d2: ixor
      // 6d3: iload 13
      // 6d5: bipush -1
      // 6d6: ixor
      // 6d7: if_icmpne 6e2
      // 6da: iload 14
      // 6dc: iload 0
      // 6dd: if_icmpne 6e2
      // 6e0: bipush 0
      // 6e1: ireturn
      // 6e2: bipush 1
      // 6e3: putstatic Class_ek.f I
      // 6e6: bipush 0
      // 6e7: istore 16
      // 6e9: getstatic Class_vh.gb [I
      // 6ec: iload 16
      // 6ee: iload 13
      // 6f0: iastore
      // 6f1: iload 8
      // 6f3: bipush 1
      // 6f4: if_icmpeq 6fb
      // 6f7: aconst_null
      // 6f8: putstatic Class_ce.ib LClass_r;
      // 6fb: getstatic Class_ma.cb [I
      // 6fe: iload 16
      // 700: iinc 16 1
      // 703: iload 14
      // 705: iastore
      // 706: getstatic Class_jc.y [[I
      // 709: iload 13
      // 70b: aaload
      // 70c: iload 14
      // 70e: iaload
      // 70f: dup
      // 710: istore 20
      // 712: istore 19
      // 714: iload 27
      // 716: ifeq 77f
      // 719: iload 20
      // 71b: bipush -1
      // 71c: ixor
      // 71d: iload 19
      // 71f: bipush -1
      // 720: ixor
      // 721: if_icmpeq 73b
      // 724: iload 19
      // 726: istore 20
      // 728: getstatic Class_vh.gb [I
      // 72b: iload 16
      // 72d: iload 13
      // 72f: iastore
      // 730: getstatic Class_ma.cb [I
      // 733: iload 16
      // 735: iinc 16 1
      // 738: iload 14
      // 73a: iastore
      // 73b: iload 19
      // 73d: bipush 1
      // 73e: iand
      // 73f: bipush -1
      // 740: ixor
      // 741: bipush -1
      // 742: if_icmpeq 74d
      // 745: iinc 14 1
      // 748: iload 27
      // 74a: ifeq 757
      // 74d: iload 19
      // 74f: bipush 4
      // 750: iand
      // 751: ifeq 757
      // 754: iinc 14 -1
      // 757: iload 19
      // 759: bipush 2
      // 75a: iand
      // 75b: bipush -1
      // 75c: ixor
      // 75d: bipush -1
      // 75e: if_icmpeq 769
      // 761: iinc 13 1
      // 764: iload 27
      // 766: ifeq 774
      // 769: iload 19
      // 76b: bipush 8
      // 76d: iand
      // 76e: ifeq 774
      // 771: iinc 13 -1
      // 774: getstatic Class_jc.y [[I
      // 777: iload 13
      // 779: aaload
      // 77a: iload 14
      // 77c: iaload
      // 77d: istore 19
      // 77f: iload 10
      // 781: bipush -1
      // 782: ixor
      // 783: iload 13
      // 785: bipush -1
      // 786: ixor
      // 787: if_icmpne 719
      // 78a: iload 0
      // 78b: bipush -1
      // 78c: ixor
      // 78d: iload 14
      // 78f: bipush -1
      // 790: ixor
      // 791: if_icmpne 719
      // 794: iload 16
      // 796: bipush -1
      // 797: ixor
      // 798: bipush -1
      // 799: if_icmpge 7a7
      // 79c: iload 16
      // 79e: iload 7
      // 7a0: bipush 125
      // 7a2: invokestatic Class_jf.a (IIB)V
      // 7a5: bipush 1
      // 7a6: ireturn
      // 7a7: iload 7
      // 7a9: bipush 1
      // 7aa: if_icmpne 7af
      // 7ad: bipush 0
      // 7ae: ireturn
      // 7af: bipush 1
      // 7b0: ireturn
      // 7b1: astore 12
      // 7b3: aload 12
      // 7b5: new java/lang/StringBuffer
      // 7b8: dup
      // 7b9: ldc "ce.H("
      // 7bb: invokespecial java/lang/StringBuffer.<init> (Ljava/lang/String;)V
      // 7be: iload 0
      // 7bf: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 7c2: bipush 44
      // 7c4: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 7c7: iload 1
      // 7c8: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 7cb: bipush 44
      // 7cd: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 7d0: iload 2
      // 7d1: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 7d4: bipush 44
      // 7d6: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 7d9: iload 3
      // 7da: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 7dd: bipush 44
      // 7df: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 7e2: iload 4
      // 7e4: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 7e7: bipush 44
      // 7e9: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 7ec: iload 5
      // 7ee: invokevirtual java/lang/StringBuffer.append (Z)Ljava/lang/StringBuffer;
      // 7f1: bipush 44
      // 7f3: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 7f6: iload 6
      // 7f8: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 7fb: bipush 44
      // 7fd: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 800: iload 7
      // 802: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 805: bipush 44
      // 807: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 80a: iload 8
      // 80c: invokevirtual java/lang/StringBuffer.append (Z)Ljava/lang/StringBuffer;
      // 80f: bipush 44
      // 811: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 814: iload 9
      // 816: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 819: bipush 44
      // 81b: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 81e: iload 10
      // 820: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 823: bipush 44
      // 825: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 828: iload 11
      // 82a: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 82d: bipush 41
      // 82f: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 832: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 835: invokestatic Class_sh.a (Ljava/lang/Throwable;Ljava/lang/String;)LClass_ua;
      // 838: athrow
      return false;
   }

   final void a(byte var1) {
      try {
         S++;
         if (var1 > -22) {
            this.jb = -76;
         }

         this.Y = this.jb + -this.bb;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "ce.I(" + var1 + ')');
      }
   }

   public static void g(int var0) {
      try {
         ib = null;
         if (var0 != 9927) {
            W = null;
         }

         gb = null;
         hb = null;
         U = null;
         Z = null;
         W = null;
         V = null;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "ce.F(" + var0 + ')');
      }
   }

   static final boolean a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, int var8, int var9, int var10, int var11) {
      try {
         cb++;
         if (var9 == ~Class_gg.B.Q) {
            return a(var3, var5, var0, var4, var1, var7, var11, var10, true, var6, var2, var8);
         } else {
            return ~Class_gg.B.Q < -3
               ? Class_lk.a(var7, var2, var6, var10, var4, var0, var5, (byte)121, var11, var3, var1, var8, Class_gg.B.Q)
               : Class_kj.a(var6, var5, var1, var4, var3, var11, (byte)36, var10, var0, var2, var8, var7);
         }
      } catch (RuntimeException var13) {
         throw Class_sh.a(
            var13,
            "ce.J("
               + var0
               + ','
               + var1
               + ','
               + var2
               + ','
               + var3
               + ','
               + var4
               + ','
               + var5
               + ','
               + var6
               + ','
               + var7
               + ','
               + var8
               + ','
               + var9
               + ','
               + var10
               + ','
               + var11
               + ')'
         );
      }
   }

   final void a(Class_lh var1, int var2, int var3) {
      int var5 = client.lb;

      try {
         label51: {
            label45: {
               label44: {
                  if (~var2 != -1) {
                     if (var2 == 1) {
                        break label44;
                     }

                     if (var2 != 2) {
                        break label51;
                     }

                     if (var5 == 0) {
                        break label45;
                     }
                  }

                  this.bb = var1.k(var3 ^ -1355769545);
                  if (var5 == 0) {
                     break label51;
                  }
               }

               this.jb = var1.k(var3 + 1355769545);
               if (var5 == 0) {
                  break label51;
               }
            }

            super.C = var1.n(-6677) == 1;
         }

         fb++;
         if (var3 != -1) {
            this.a(null, -25, 117);
         }
      } catch (RuntimeException var6) {
         throw Class_sh.a(var6, "ce.K(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
      }
   }
}
