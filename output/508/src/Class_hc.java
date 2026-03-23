import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;

final class Class_hc extends Canvas {
   static int a;
   static int b;
   static int c;
   static int d = 0;
   static int e;
   static int f;
   static Class_r g = Class_tc.a(43, "hint_mapmarkers");
   static int h;
   private Component i;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static final void a(Class_ik var0, Object var1, byte var2) {
      int var4 = client.lb;

      try {
         if (var2 >= -49) {
            a((byte)-99);
         }

         e++;
         if (var0.u != null) {
            int var3 = 0;
            if (var4 != 0) {
               Class_hg.a(-5, 1L);
               var3++;
            }

            while (var3 < 50 && var0.u.peekEvent() != null) {
               Class_hg.a(-5, 1L);
               var3++;
            }

            if (var1 != null) {
               var0.u.postEvent(new ActionEvent(var1, 1001, "dummy"));
            }
         }
      } catch (RuntimeException var5) {
         throw Class_sh.a(var5, "hc.D(" + (var0 != null ? "{...}" : "null") + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
      }
   }

   public final void paint(Graphics var1) {
      try {
         f++;
         this.i.paint(var1);
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "hc.paint(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   static final void a(boolean var0, int var1) {
      try {
         Class_bf.a((byte)99, Class_fk.R, var0, Class_l.u, Class_hj.bb);
         h++;
         if (var1 != 640) {
            a = 80;
         }
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "hc.C(" + var0 + ',' + var1 + ')');
      }
   }

   public static void a(byte var0) {
      try {
         g = null;
         int var1 = -74 % ((var0 - 43) / 60);
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "hc.A(" + var0 + ')');
      }
   }

   public final void update(Graphics var1) {
      try {
         this.i.update(var1);
         b++;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "hc.update(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }

   static final void a(Class_ha param0, int param1, int param2, int param3, byte param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic client.lb I
      // 003: istore 21
      // 005: sipush 16322
      // 008: invokestatic Class_hf.c (I)V
      // 00b: getstatic Class_hc.c I
      // 00e: bipush 1
      // 00f: iadd
      // 010: putstatic Class_hc.c I
      // 013: iload 1
      // 014: iload 2
      // 015: aload 0
      // 016: getfield Class_ha.Gc I
      // 019: iload 1
      // 01a: iadd
      // 01b: aload 0
      // 01c: getfield Class_ha.nc I
      // 01f: iload 2
      // 020: iadd
      // 021: invokestatic Class_nc.c (IIII)V
      // 024: iload 4
      // 026: bipush -9
      // 028: if_icmplt 02c
      // 02b: return
      // 02c: getstatic Class_kc.q I
      // 02f: bipush -1
      // 030: ixor
      // 031: bipush -3
      // 033: if_icmpeq 043
      // 036: getstatic Class_kc.q I
      // 039: bipush 5
      // 03a: if_icmpeq 043
      // 03d: getstatic Class_jk.A LClass_jb;
      // 040: ifnonnull 056
      // 043: iload 1
      // 044: iload 2
      // 045: bipush 0
      // 046: aload 0
      // 047: getfield Class_ha.Ub [I
      // 04a: aload 0
      // 04b: getfield Class_ha.B [I
      // 04e: invokestatic Class_nc.a (III[I[I)V
      // 051: iload 21
      // 053: ifeq 6ad
      // 056: getstatic Class_gg.B LClass_fa;
      // 059: getfield Class_ta.hb I
      // 05c: bipush 32
      // 05e: idiv
      // 05f: bipush 48
      // 061: iadd
      // 062: istore 6
      // 064: sipush 2047
      // 067: getstatic Class_ba.z I
      // 06a: getstatic Class_ok.eb I
      // 06d: ineg
      // 06e: isub
      // 06f: iand
      // 070: istore 5
      // 072: sipush 464
      // 075: getstatic Class_gg.B LClass_fa;
      // 078: getfield Class_ta.J I
      // 07b: bipush 32
      // 07d: idiv
      // 07e: isub
      // 07f: istore 7
      // 081: getstatic Class_jk.A LClass_jb;
      // 084: checkcast Class_ni
      // 087: iload 1
      // 088: iload 2
      // 089: aload 0
      // 08a: getfield Class_ha.Gc I
      // 08d: aload 0
      // 08e: getfield Class_ha.nc I
      // 091: iload 6
      // 093: iload 7
      // 095: iload 5
      // 097: getstatic Class_uf.W I
      // 09a: sipush 256
      // 09d: iadd
      // 09e: aload 0
      // 09f: getfield Class_ha.Ub [I
      // 0a2: aload 0
      // 0a3: getfield Class_ha.B [I
      // 0a6: invokevirtual Class_ni.b (IIIIIIII[I[I)V
      // 0a9: getstatic Class_ma.T LClass_pb;
      // 0ac: ifnull 23b
      // 0af: bipush 0
      // 0b0: istore 8
      // 0b2: iload 21
      // 0b4: ifeq 22c
      // 0b7: getstatic Class_ma.T LClass_pb;
      // 0ba: bipush 95
      // 0bc: iload 8
      // 0be: invokevirtual Class_pb.a (BI)Z
      // 0c1: ifeq 229
      // 0c4: bipush 2
      // 0c5: bipush 4
      // 0c6: getstatic Class_va.ab I
      // 0c9: ineg
      // 0ca: getstatic Class_ma.T LClass_pb;
      // 0cd: getfield Class_pb.e [S
      // 0d0: iload 8
      // 0d2: saload
      // 0d3: iadd
      // 0d4: imul
      // 0d5: iadd
      // 0d6: getstatic Class_gg.B LClass_fa;
      // 0d9: getfield Class_ta.J I
      // 0dc: bipush 32
      // 0de: idiv
      // 0df: ineg
      // 0e0: iadd
      // 0e1: istore 10
      // 0e3: getstatic Class_gg.B LClass_fa;
      // 0e6: getfield Class_ta.hb I
      // 0e9: bipush 32
      // 0eb: idiv
      // 0ec: ineg
      // 0ed: bipush 2
      // 0ee: iadd
      // 0ef: getstatic Class_ma.T LClass_pb;
      // 0f2: getfield Class_pb.b [S
      // 0f5: iload 8
      // 0f7: saload
      // 0f8: getstatic Class_fj.e I
      // 0fb: isub
      // 0fc: bipush 4
      // 0fd: imul
      // 0fe: iadd
      // 0ff: istore 9
      // 101: getstatic Class_kd.e [I
      // 104: iload 5
      // 106: iaload
      // 107: istore 11
      // 109: getstatic Class_kd.q [I
      // 10c: iload 5
      // 10e: iaload
      // 10f: istore 12
      // 111: sipush 256
      // 114: iload 12
      // 116: imul
      // 117: sipush 256
      // 11a: getstatic Class_uf.W I
      // 11d: iadd
      // 11e: idiv
      // 11f: istore 12
      // 121: getstatic Class_ma.gb LClass_af;
      // 124: astore 15
      // 126: sipush 256
      // 129: iload 11
      // 12b: imul
      // 12c: sipush 256
      // 12f: getstatic Class_uf.W I
      // 132: iadd
      // 133: idiv
      // 134: istore 11
      // 136: iload 10
      // 138: iload 11
      // 13a: imul
      // 13b: iload 9
      // 13d: iload 12
      // 13f: imul
      // 140: iadd
      // 141: ldc -242397904
      // 143: ishr
      // 144: istore 13
      // 146: iload 12
      // 148: iload 10
      // 14a: imul
      // 14b: iload 11
      // 14d: iload 9
      // 14f: imul
      // 150: isub
      // 151: ldc 1531632048
      // 153: ishr
      // 154: istore 14
      // 156: getstatic Class_ma.T LClass_pb;
      // 159: bipush 126
      // 15b: iload 8
      // 15d: invokevirtual Class_pb.a (II)I
      // 160: bipush 1
      // 161: if_icmpne 169
      // 164: getstatic Class_fi.A LClass_af;
      // 167: astore 15
      // 169: getstatic Class_ma.T LClass_pb;
      // 16c: bipush -21
      // 16e: iload 8
      // 170: invokevirtual Class_pb.a (II)I
      // 173: bipush -1
      // 174: ixor
      // 175: bipush -3
      // 177: if_icmpne 17f
      // 17a: getstatic Class_db.sb LClass_af;
      // 17d: astore 15
      // 17f: aload 15
      // 181: getstatic Class_ma.T LClass_pb;
      // 184: getfield Class_pb.f [LClass_r;
      // 187: iload 8
      // 189: aaload
      // 18a: bipush 100
      // 18c: invokevirtual Class_af.a (LClass_r;I)I
      // 18f: istore 16
      // 191: iload 13
      // 193: iload 16
      // 195: bipush 2
      // 196: idiv
      // 197: isub
      // 198: istore 13
      // 19a: aload 0
      // 19b: getfield Class_ha.Gc I
      // 19e: ineg
      // 19f: iload 13
      // 1a1: if_icmpgt 229
      // 1a4: iload 13
      // 1a6: aload 0
      // 1a7: getfield Class_ha.Gc I
      // 1aa: if_icmpgt 229
      // 1ad: iload 14
      // 1af: bipush -1
      // 1b0: ixor
      // 1b1: aload 0
      // 1b2: getfield Class_ha.nc I
      // 1b5: ineg
      // 1b6: bipush -1
      // 1b7: ixor
      // 1b8: if_icmpgt 229
      // 1bb: aload 0
      // 1bc: getfield Class_ha.nc I
      // 1bf: iload 14
      // 1c1: if_icmpge 1c9
      // 1c4: iload 21
      // 1c6: ifeq 229
      // 1c9: ldc_w 16777215
      // 1cc: istore 17
      // 1ce: getstatic Class_ma.T LClass_pb;
      // 1d1: getfield Class_pb.k [I
      // 1d4: iload 8
      // 1d6: iaload
      // 1d7: bipush -1
      // 1d8: if_icmpeq 1e6
      // 1db: getstatic Class_ma.T LClass_pb;
      // 1de: getfield Class_pb.k [I
      // 1e1: iload 8
      // 1e3: iaload
      // 1e4: istore 17
      // 1e6: aload 0
      // 1e7: getfield Class_ha.Ub [I
      // 1ea: aload 0
      // 1eb: getfield Class_ha.B [I
      // 1ee: invokestatic Class_nc.a ([I[I)V
      // 1f1: aload 15
      // 1f3: getstatic Class_ma.T LClass_pb;
      // 1f6: getfield Class_pb.f [LClass_r;
      // 1f9: iload 8
      // 1fb: aaload
      // 1fc: iload 13
      // 1fe: iload 1
      // 1ff: iadd
      // 200: aload 0
      // 201: getfield Class_ha.Gc I
      // 204: bipush 2
      // 205: idiv
      // 206: ineg
      // 207: isub
      // 208: iload 2
      // 209: aload 0
      // 20a: getfield Class_ha.nc I
      // 20d: bipush 2
      // 20e: idiv
      // 20f: ineg
      // 210: isub
      // 211: iload 14
      // 213: ineg
      // 214: iadd
      // 215: iload 16
      // 217: bipush 50
      // 219: iload 17
      // 21b: bipush 0
      // 21c: sipush 256
      // 21f: bipush 1
      // 220: bipush 0
      // 221: bipush 0
      // 222: invokevirtual Class_af.a (LClass_r;IIIIIIIIII)I
      // 225: pop
      // 226: invokestatic Class_nc.d ()V
      // 229: iinc 8 1
      // 22c: iload 8
      // 22e: bipush -1
      // 22f: ixor
      // 230: getstatic Class_ma.T LClass_pb;
      // 233: getfield Class_pb.h I
      // 236: bipush -1
      // 237: ixor
      // 238: if_icmpgt 0b7
      // 23b: bipush 0
      // 23c: istore 9
      // 23e: iload 21
      // 240: ifeq 2b9
      // 243: bipush 2
      // 244: getstatic Class_tg.u [I
      // 247: iload 9
      // 249: iaload
      // 24a: bipush 4
      // 24b: imul
      // 24c: getstatic Class_gg.B LClass_fa;
      // 24f: getfield Class_ta.J I
      // 252: bipush 32
      // 254: idiv
      // 255: ineg
      // 256: iadd
      // 257: iadd
      // 258: istore 11
      // 25a: getstatic Class_gg.B LClass_fa;
      // 25d: getfield Class_ta.hb I
      // 260: bipush 32
      // 262: idiv
      // 263: ineg
      // 264: bipush 2
      // 265: iadd
      // 266: getstatic Class_ph.e [I
      // 269: iload 9
      // 26b: iaload
      // 26c: bipush 4
      // 26d: imul
      // 26e: iadd
      // 26f: istore 10
      // 271: bipush 95
      // 273: getstatic Class_we.I [I
      // 276: iload 9
      // 278: iaload
      // 279: invokestatic Class_qe.a (II)LClass_ub;
      // 27c: astore 8
      // 27e: aload 8
      // 280: getfield Class_ub.J [I
      // 283: ifnull 2a1
      // 286: aload 8
      // 288: bipush -1
      // 289: invokevirtual Class_ub.b (I)LClass_ub;
      // 28c: astore 8
      // 28e: aload 8
      // 290: ifnull 2b6
      // 293: aload 8
      // 295: getfield Class_ub.v I
      // 298: bipush -1
      // 299: if_icmpne 2a1
      // 29c: iload 21
      // 29e: ifeq 2b6
      // 2a1: iload 11
      // 2a3: bipush -69
      // 2a5: aload 0
      // 2a6: iload 1
      // 2a7: iload 10
      // 2a9: getstatic Class_i.X [LClass_jb;
      // 2ac: aload 8
      // 2ae: getfield Class_ub.v I
      // 2b1: aaload
      // 2b2: iload 2
      // 2b3: invokestatic Class_fb.a (IILClass_ha;IILClass_jb;I)V
      // 2b6: iinc 9 1
      // 2b9: getstatic Class_id.n I
      // 2bc: bipush -1
      // 2bd: ixor
      // 2be: iload 9
      // 2c0: bipush -1
      // 2c1: ixor
      // 2c2: if_icmplt 243
      // 2c5: bipush 0
      // 2c6: istore 10
      // 2c8: iload 21
      // 2ca: ifeq 32f
      // 2cd: bipush 0
      // 2ce: istore 11
      // 2d0: iload 21
      // 2d2: ifeq 323
      // 2d5: getstatic Class_ha.od [[[LClass_c;
      // 2d8: getstatic Class_jk.F I
      // 2db: aaload
      // 2dc: iload 10
      // 2de: aaload
      // 2df: iload 11
      // 2e1: aaload
      // 2e2: astore 12
      // 2e4: aload 12
      // 2e6: ifnull 320
      // 2e9: getstatic Class_gg.B LClass_fa;
      // 2ec: getfield Class_ta.J I
      // 2ef: bipush 32
      // 2f1: idiv
      // 2f2: ineg
      // 2f3: bipush 4
      // 2f4: iload 11
      // 2f6: imul
      // 2f7: bipush 2
      // 2f8: iadd
      // 2f9: iadd
      // 2fa: istore 14
      // 2fc: getstatic Class_gg.B LClass_fa;
      // 2ff: getfield Class_ta.hb I
      // 302: bipush 32
      // 304: idiv
      // 305: ineg
      // 306: bipush 2
      // 307: bipush 4
      // 308: iload 10
      // 30a: imul
      // 30b: iadd
      // 30c: iadd
      // 30d: istore 13
      // 30f: iload 14
      // 311: bipush -35
      // 313: aload 0
      // 314: iload 1
      // 315: iload 13
      // 317: getstatic Class_tc.g [LClass_jb;
      // 31a: bipush 0
      // 31b: aaload
      // 31c: iload 2
      // 31d: invokestatic Class_fb.a (IILClass_ha;IILClass_jb;I)V
      // 320: iinc 11 1
      // 323: iload 11
      // 325: bipush -1
      // 326: ixor
      // 327: bipush -105
      // 329: if_icmpgt 2d5
      // 32c: iinc 10 1
      // 32f: iload 10
      // 331: bipush -1
      // 332: ixor
      // 333: bipush -105
      // 335: if_icmpgt 2cd
      // 338: bipush 0
      // 339: istore 11
      // 33b: iload 21
      // 33d: ifeq 3ca
      // 340: getstatic Class_rf.a [LClass_eh;
      // 343: getstatic Class_kg.v [I
      // 346: iload 11
      // 348: iaload
      // 349: aaload
      // 34a: astore 12
      // 34c: aload 12
      // 34e: ifnull 3c7
      // 351: aload 12
      // 353: bipush 111
      // 355: invokevirtual Class_eh.d (I)Z
      // 358: ifeq 3c7
      // 35b: aload 12
      // 35d: getfield Class_eh.Pb LClass_nd;
      // 360: astore 13
      // 362: aload 13
      // 364: ifnull 378
      // 367: aload 13
      // 369: getfield Class_nd.z [I
      // 36c: ifnull 378
      // 36f: aload 13
      // 371: bipush -94
      // 373: invokevirtual Class_nd.d (I)LClass_nd;
      // 376: astore 13
      // 378: aload 13
      // 37a: ifnull 3c7
      // 37d: aload 13
      // 37f: getfield Class_nd.G Z
      // 382: ifeq 3c7
      // 385: aload 13
      // 387: getfield Class_nd.B Z
      // 38a: ifeq 3c7
      // 38d: getstatic Class_gg.B LClass_fa;
      // 390: getfield Class_ta.hb I
      // 393: bipush 32
      // 395: idiv
      // 396: ineg
      // 397: aload 12
      // 399: getfield Class_ta.hb I
      // 39c: bipush 32
      // 39e: idiv
      // 39f: iadd
      // 3a0: istore 14
      // 3a2: aload 12
      // 3a4: getfield Class_ta.J I
      // 3a7: bipush 32
      // 3a9: idiv
      // 3aa: getstatic Class_gg.B LClass_fa;
      // 3ad: getfield Class_ta.J I
      // 3b0: bipush 32
      // 3b2: idiv
      // 3b3: isub
      // 3b4: istore 15
      // 3b6: iload 15
      // 3b8: bipush -89
      // 3ba: aload 0
      // 3bb: iload 1
      // 3bc: iload 14
      // 3be: getstatic Class_tc.g [LClass_jb;
      // 3c1: bipush 1
      // 3c2: aaload
      // 3c3: iload 2
      // 3c4: invokestatic Class_fb.a (IILClass_ha;IILClass_jb;I)V
      // 3c7: iinc 11 1
      // 3ca: iload 11
      // 3cc: bipush -1
      // 3cd: ixor
      // 3ce: getstatic Class_ke.p I
      // 3d1: bipush -1
      // 3d2: ixor
      // 3d3: if_icmpgt 340
      // 3d6: bipush 0
      // 3d7: istore 12
      // 3d9: iload 21
      // 3db: ifeq 4e0
      // 3de: getstatic Class_db.Q [LClass_fa;
      // 3e1: getstatic Class_oc.q [I
      // 3e4: iload 12
      // 3e6: iaload
      // 3e7: aaload
      // 3e8: astore 13
      // 3ea: aload 13
      // 3ec: ifnull 4dd
      // 3ef: aload 13
      // 3f1: bipush 97
      // 3f3: invokevirtual Class_fa.d (I)Z
      // 3f6: ifeq 4dd
      // 3f9: getstatic Class_gg.B LClass_fa;
      // 3fc: getfield Class_ta.hb I
      // 3ff: bipush 32
      // 401: idiv
      // 402: ineg
      // 403: aload 13
      // 405: getfield Class_ta.hb I
      // 408: bipush 32
      // 40a: idiv
      // 40b: iadd
      // 40c: istore 14
      // 40e: bipush 0
      // 40f: istore 16
      // 411: getstatic Class_gg.B LClass_fa;
      // 414: getfield Class_ta.J I
      // 417: bipush 32
      // 419: idiv
      // 41a: ineg
      // 41b: aload 13
      // 41d: getfield Class_ta.J I
      // 420: bipush 32
      // 422: idiv
      // 423: iadd
      // 424: istore 15
      // 426: aload 13
      // 428: getfield Class_fa.Zb LClass_r;
      // 42b: sipush 10908
      // 42e: invokevirtual Class_r.f (I)J
      // 431: lstore 17
      // 433: bipush 0
      // 434: istore 19
      // 436: iload 21
      // 438: ifeq 466
      // 43b: getstatic Class_ma.hb [J
      // 43e: iload 19
      // 440: laload
      // 441: ldc2_w -1
      // 444: lxor
      // 445: lload 17
      // 447: ldc2_w -1
      // 44a: lxor
      // 44b: lcmp
      // 44c: ifne 463
      // 44f: getstatic Class_qc.e [I
      // 452: iload 19
      // 454: iaload
      // 455: bipush -1
      // 456: ixor
      // 457: bipush -1
      // 458: if_icmpeq 463
      // 45b: bipush 1
      // 45c: istore 16
      // 45e: iload 21
      // 460: ifeq 46e
      // 463: iinc 19 1
      // 466: getstatic Class_ek.n I
      // 469: iload 19
      // 46b: if_icmpgt 43b
      // 46e: bipush 0
      // 46f: istore 20
      // 471: getstatic Class_gg.B LClass_fa;
      // 474: getfield Class_fa.qc I
      // 477: bipush -1
      // 478: ixor
      // 479: bipush -1
      // 47a: if_icmpeq 496
      // 47d: aload 13
      // 47f: getfield Class_fa.qc I
      // 482: ifeq 496
      // 485: getstatic Class_gg.B LClass_fa;
      // 488: getfield Class_fa.qc I
      // 48b: aload 13
      // 48d: getfield Class_fa.qc I
      // 490: if_icmpne 496
      // 493: bipush 1
      // 494: istore 20
      // 496: iload 16
      // 498: ifne 4cc
      // 49b: iload 20
      // 49d: ifne 4b6
      // 4a0: iload 15
      // 4a2: bipush -52
      // 4a4: aload 0
      // 4a5: iload 1
      // 4a6: iload 14
      // 4a8: getstatic Class_tc.g [LClass_jb;
      // 4ab: bipush 2
      // 4ac: aaload
      // 4ad: iload 2
      // 4ae: invokestatic Class_fb.a (IILClass_ha;IILClass_jb;I)V
      // 4b1: iload 21
      // 4b3: ifeq 4dd
      // 4b6: iload 15
      // 4b8: bipush -92
      // 4ba: aload 0
      // 4bb: iload 1
      // 4bc: iload 14
      // 4be: getstatic Class_tc.g [LClass_jb;
      // 4c1: bipush 4
      // 4c2: aaload
      // 4c3: iload 2
      // 4c4: invokestatic Class_fb.a (IILClass_ha;IILClass_jb;I)V
      // 4c7: iload 21
      // 4c9: ifeq 4dd
      // 4cc: iload 15
      // 4ce: bipush -27
      // 4d0: aload 0
      // 4d1: iload 1
      // 4d2: iload 14
      // 4d4: getstatic Class_tc.g [LClass_jb;
      // 4d7: bipush 3
      // 4d8: aaload
      // 4d9: iload 2
      // 4da: invokestatic Class_fb.a (IILClass_ha;IILClass_jb;I)V
      // 4dd: iinc 12 1
      // 4e0: iload 12
      // 4e2: bipush -1
      // 4e3: ixor
      // 4e4: getstatic client.ib I
      // 4e7: bipush -1
      // 4e8: ixor
      // 4e9: if_icmpgt 3de
      // 4ec: getstatic Class_fd.d [LClass_d;
      // 4ef: astore 13
      // 4f1: bipush 0
      // 4f2: istore 14
      // 4f4: iload 21
      // 4f6: ifeq 648
      // 4f9: aload 13
      // 4fb: iload 14
      // 4fd: aaload
      // 4fe: astore 15
      // 500: aload 15
      // 502: ifnull 645
      // 505: aload 15
      // 507: getfield Class_d.a I
      // 50a: ifeq 645
      // 50d: getstatic Class_be.C I
      // 510: bipush 20
      // 512: irem
      // 513: bipush -1
      // 514: ixor
      // 515: bipush -11
      // 517: if_icmple 645
      // 51a: aload 15
      // 51c: getfield Class_d.a I
      // 51f: bipush 1
      // 520: if_icmpne 589
      // 523: aload 15
      // 525: getfield Class_d.e I
      // 528: bipush -1
      // 529: ixor
      // 52a: bipush -1
      // 52b: if_icmpgt 589
      // 52e: aload 15
      // 530: getfield Class_d.e I
      // 533: bipush -1
      // 534: ixor
      // 535: getstatic Class_rf.a [LClass_eh;
      // 538: arraylength
      // 539: bipush -1
      // 53a: ixor
      // 53b: if_icmple 589
      // 53e: getstatic Class_rf.a [LClass_eh;
      // 541: aload 15
      // 543: getfield Class_d.e I
      // 546: aaload
      // 547: astore 16
      // 549: aload 16
      // 54b: ifnull 589
      // 54e: getstatic Class_gg.B LClass_fa;
      // 551: getfield Class_ta.hb I
      // 554: bipush 32
      // 556: idiv
      // 557: ineg
      // 558: aload 16
      // 55a: getfield Class_ta.hb I
      // 55d: bipush 32
      // 55f: idiv
      // 560: iadd
      // 561: istore 17
      // 563: getstatic Class_gg.B LClass_fa;
      // 566: getfield Class_ta.J I
      // 569: bipush 32
      // 56b: idiv
      // 56c: ineg
      // 56d: aload 16
      // 56f: getfield Class_ta.J I
      // 572: bipush 32
      // 574: idiv
      // 575: iadd
      // 576: istore 18
      // 578: aload 15
      // 57a: getfield Class_d.k I
      // 57d: bipush 122
      // 57f: iload 17
      // 581: aload 0
      // 582: iload 2
      // 583: iload 1
      // 584: iload 18
      // 586: invokestatic Class_ig.a (IBILClass_ha;III)V
      // 589: aload 15
      // 58b: getfield Class_d.a I
      // 58e: bipush 2
      // 58f: if_icmpne 5d9
      // 592: aload 15
      // 594: getfield Class_d.h I
      // 597: getstatic Class_fj.e I
      // 59a: ineg
      // 59b: iadd
      // 59c: bipush 4
      // 59d: imul
      // 59e: bipush 2
      // 59f: iadd
      // 5a0: getstatic Class_gg.B LClass_fa;
      // 5a3: getfield Class_ta.hb I
      // 5a6: bipush 32
      // 5a8: idiv
      // 5a9: ineg
      // 5aa: iadd
      // 5ab: istore 16
      // 5ad: getstatic Class_gg.B LClass_fa;
      // 5b0: getfield Class_ta.J I
      // 5b3: bipush 32
      // 5b5: idiv
      // 5b6: ineg
      // 5b7: bipush 2
      // 5b8: iadd
      // 5b9: getstatic Class_va.ab I
      // 5bc: ineg
      // 5bd: aload 15
      // 5bf: getfield Class_d.d I
      // 5c2: iadd
      // 5c3: bipush 4
      // 5c4: imul
      // 5c5: iadd
      // 5c6: istore 17
      // 5c8: aload 15
      // 5ca: getfield Class_d.k I
      // 5cd: bipush 119
      // 5cf: iload 16
      // 5d1: aload 0
      // 5d2: iload 2
      // 5d3: iload 1
      // 5d4: iload 17
      // 5d6: invokestatic Class_ig.a (IBILClass_ha;III)V
      // 5d9: aload 15
      // 5db: getfield Class_d.a I
      // 5de: bipush 10
      // 5e0: if_icmpne 645
      // 5e3: aload 15
      // 5e5: getfield Class_d.e I
      // 5e8: bipush -1
      // 5e9: ixor
      // 5ea: bipush -1
      // 5eb: if_icmpgt 645
      // 5ee: aload 15
      // 5f0: getfield Class_d.e I
      // 5f3: getstatic Class_db.Q [LClass_fa;
      // 5f6: arraylength
      // 5f7: if_icmpge 645
      // 5fa: getstatic Class_db.Q [LClass_fa;
      // 5fd: aload 15
      // 5ff: getfield Class_d.e I
      // 602: aaload
      // 603: astore 16
      // 605: aload 16
      // 607: ifnull 645
      // 60a: getstatic Class_gg.B LClass_fa;
      // 60d: getfield Class_ta.hb I
      // 610: bipush 32
      // 612: idiv
      // 613: ineg
      // 614: aload 16
      // 616: getfield Class_ta.hb I
      // 619: bipush 32
      // 61b: idiv
      // 61c: iadd
      // 61d: istore 17
      // 61f: getstatic Class_gg.B LClass_fa;
      // 622: getfield Class_ta.J I
      // 625: bipush 32
      // 627: idiv
      // 628: ineg
      // 629: aload 16
      // 62b: getfield Class_ta.J I
      // 62e: bipush 32
      // 630: idiv
      // 631: iadd
      // 632: istore 18
      // 634: aload 15
      // 636: getfield Class_d.k I
      // 639: bipush 110
      // 63b: iload 17
      // 63d: aload 0
      // 63e: iload 2
      // 63f: iload 1
      // 640: iload 18
      // 642: invokestatic Class_ig.a (IBILClass_ha;III)V
      // 645: iinc 14 1
      // 648: aload 13
      // 64a: arraylength
      // 64b: iload 14
      // 64d: if_icmpgt 4f9
      // 650: getstatic Class_ph.f I
      // 653: bipush -1
      // 654: ixor
      // 655: bipush -1
      // 656: if_icmpeq 691
      // 659: getstatic Class_ph.f I
      // 65c: bipush 4
      // 65d: imul
      // 65e: bipush -2
      // 660: isub
      // 661: getstatic Class_gg.B LClass_fa;
      // 664: getfield Class_ta.hb I
      // 667: bipush 32
      // 669: idiv
      // 66a: ineg
      // 66b: iadd
      // 66c: istore 15
      // 66e: bipush 2
      // 66f: bipush 4
      // 670: getstatic Class_fg.o I
      // 673: imul
      // 674: getstatic Class_gg.B LClass_fa;
      // 677: getfield Class_ta.J I
      // 67a: bipush 32
      // 67c: idiv
      // 67d: ineg
      // 67e: iadd
      // 67f: iadd
      // 680: istore 16
      // 682: iload 16
      // 684: bipush -65
      // 686: aload 0
      // 687: iload 1
      // 688: iload 15
      // 68a: getstatic Class_w.R LClass_jb;
      // 68d: iload 2
      // 68e: invokestatic Class_fb.a (IILClass_ha;IILClass_jb;I)V
      // 691: aload 0
      // 692: getfield Class_ha.Gc I
      // 695: bipush 2
      // 696: idiv
      // 697: iload 1
      // 698: iadd
      // 699: bipush 1
      // 69a: isub
      // 69b: bipush -1
      // 69c: iload 2
      // 69d: aload 0
      // 69e: getfield Class_ha.nc I
      // 6a1: bipush 2
      // 6a2: idiv
      // 6a3: iadd
      // 6a4: iadd
      // 6a5: bipush 3
      // 6a6: bipush 3
      // 6a7: ldc_w 16777215
      // 6aa: invokestatic Class_nc.f (IIIII)V
      // 6ad: getstatic Class_n.u [Z
      // 6b0: iload 3
      // 6b1: bipush 1
      // 6b2: bastore
      // 6b3: return
      // 6b4: astore 5
      // 6b6: aload 5
      // 6b8: new java/lang/StringBuffer
      // 6bb: dup
      // 6bc: ldc_w "hc.B("
      // 6bf: invokespecial java/lang/StringBuffer.<init> (Ljava/lang/String;)V
      // 6c2: aload 0
      // 6c3: ifnull 6cb
      // 6c6: ldc "{...}"
      // 6c8: goto 6cd
      // 6cb: ldc "null"
      // 6cd: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 6d0: bipush 44
      // 6d2: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 6d5: iload 1
      // 6d6: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 6d9: bipush 44
      // 6db: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 6de: iload 2
      // 6df: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 6e2: bipush 44
      // 6e4: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 6e7: iload 3
      // 6e8: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 6eb: bipush 44
      // 6ed: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 6f0: iload 4
      // 6f2: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 6f5: bipush 41
      // 6f7: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 6fa: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 6fd: invokestatic Class_sh.a (Ljava/lang/Throwable;Ljava/lang/String;)LClass_ua;
      // 700: athrow
   }

   Class_hc(Component var1) {
      try {
         this.i = var1;
      } catch (RuntimeException var3) {
         throw Class_sh.a(var3, "hc.<init>(" + (var1 != null ? "{...}" : "null") + ')');
      }
   }
}
