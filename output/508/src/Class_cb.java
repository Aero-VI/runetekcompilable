final class Class_cb {
   int a;
   byte[] b;
   byte[] c = new byte[18002];
   static Class_qf d;
   int e;
   int[] f;
   int g;
   int h;
   int i;
   byte[] j;
   static Class_r k = Class_cb.I;
   byte l;
   int m;
   int[] n;
   byte[][] o = new byte[6][258];
   static int p;
   int q;
   int[][] r;
   boolean[] s;
   int t;
   int u;
   int v;
   int w;
   static Class_r x = Class_cb.I;
   int y;
   byte[] z;
   byte[] A;
   int B;
   int C;
   int D;
   static int E = (int)(33.0 * Math.random()) + -16;
   static int F;
   static int G;
   int[] H;
   private static Class_r I = Class_tc.a(43, "M");
   int[][] J;
   int[] K;
   byte[] L;
   int[][] M;
   boolean[] N;
   static int O;

   public static void a(int var0) {
      try {
         I = null;
         k = null;
         d = null;
         if (var0 == 18002) {
            x = null;
         }
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "cb.D(" + var0 + ')');
      }
   }

   static final int a(int var0, boolean var1) {
      try {
         if (var1) {
            return 80;
         } else {
            F++;
            Class_he var2 = Class_i.b((byte)81, var0);
            int var5 = var2.l;
            int var4 = var2.n;
            int var6 = Class_c.g[var5 + -var4];
            int var3 = var2.a;
            return var6 & Class_sb.i[var3] >> var4;
         }
      } catch (RuntimeException var7) {
         throw Class_sh.a(var7, "cb.C(" + var0 + 44 + var1 + 41);
      }
   }

   static final void b(int var0) {
      try {
         if (var0 > -84) {
            a(-32, null, 85);
         }

         Class_cc.Lb.b((byte)94);
         O++;
      } catch (RuntimeException var2) {
         throw Class_sh.a(var2, "cb.A(" + var0 + ')');
      }
   }

   static final void a(int param0, Class_ha[] param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic client.lb I
      // 003: istore 8
      // 005: iload 0
      // 006: istore 3
      // 007: iload 8
      // 009: ifeq 1dc
      // 00c: aload 1
      // 00d: iload 3
      // 00e: aaload
      // 00f: astore 4
      // 011: aload 4
      // 013: ifnull 1d9
      // 016: aload 4
      // 018: getfield Class_ha.R I
      // 01b: bipush -1
      // 01c: ixor
      // 01d: iload 2
      // 01e: bipush -1
      // 01f: ixor
      // 020: if_icmpne 1d9
      // 023: aload 4
      // 025: getfield Class_ha.dc Z
      // 028: ifeq 033
      // 02b: aload 4
      // 02d: invokestatic client.c (LClass_ha;)Z
      // 030: ifne 1d9
      // 033: aload 4
      // 035: getfield Class_ha.Kc I
      // 038: bipush -1
      // 039: ixor
      // 03a: bipush -1
      // 03b: if_icmpne 099
      // 03e: aload 4
      // 040: getfield Class_ha.dc Z
      // 043: ifne 056
      // 046: aload 4
      // 048: invokestatic client.c (LClass_ha;)Z
      // 04b: ifeq 056
      // 04e: getstatic Class_si.b LClass_ha;
      // 051: aload 4
      // 053: if_acmpne 1d9
      // 056: iload 0
      // 057: aload 1
      // 058: aload 4
      // 05a: getfield Class_ha.K I
      // 05d: invokestatic Class_cb.a (I[LClass_ha;I)V
      // 060: aload 4
      // 062: getfield Class_ha.n [LClass_ha;
      // 065: ifnull 076
      // 068: iload 0
      // 069: aload 4
      // 06b: getfield Class_ha.n [LClass_ha;
      // 06e: aload 4
      // 070: getfield Class_ha.K I
      // 073: invokestatic Class_cb.a (I[LClass_ha;I)V
      // 076: getstatic Class_nj.p LClass_tg;
      // 079: aload 4
      // 07b: getfield Class_ha.K I
      // 07e: i2l
      // 07f: iload 0
      // 080: bipush -53
      // 082: iadd
      // 083: invokevirtual Class_tg.a (JI)LClass_li;
      // 086: checkcast Class_be
      // 089: astore 5
      // 08b: aload 5
      // 08d: ifnull 099
      // 090: aload 5
      // 092: getfield Class_be.t I
      // 095: bipush -1
      // 096: invokestatic Class_gk.a (II)V
      // 099: aload 4
      // 09b: getfield Class_ha.Kc I
      // 09e: bipush 6
      // 0a0: if_icmpne 1d9
      // 0a3: aload 4
      // 0a5: getfield Class_ha.xb I
      // 0a8: bipush -1
      // 0a9: ixor
      // 0aa: ifne 0b6
      // 0ad: aload 4
      // 0af: getfield Class_ha.jc I
      // 0b2: bipush -1
      // 0b3: if_icmpeq 177
      // 0b6: iload 0
      // 0b7: aload 4
      // 0b9: invokestatic Class_oi.a (ILClass_ha;)Z
      // 0bc: istore 5
      // 0be: iload 5
      // 0c0: ifeq 0cf
      // 0c3: aload 4
      // 0c5: getfield Class_ha.jc I
      // 0c8: istore 6
      // 0ca: iload 8
      // 0cc: ifeq 0d6
      // 0cf: aload 4
      // 0d1: getfield Class_ha.xb I
      // 0d4: istore 6
      // 0d6: iload 6
      // 0d8: bipush -1
      // 0d9: if_icmpeq 177
      // 0dc: bipush -36
      // 0de: iload 6
      // 0e0: invokestatic Class_kk.a (BI)LClass_uc;
      // 0e3: astore 7
      // 0e5: aload 7
      // 0e7: ifnull 177
      // 0ea: aload 4
      // 0ec: dup
      // 0ed: getfield Class_ha.p I
      // 0f0: getstatic Class_sj.k I
      // 0f3: iadd
      // 0f4: putfield Class_ha.p I
      // 0f7: iload 8
      // 0f9: ifeq 160
      // 0fc: aload 4
      // 0fe: dup
      // 0ff: getfield Class_ha.p I
      // 102: aload 7
      // 104: getfield Class_uc.A [I
      // 107: aload 4
      // 109: getfield Class_ha.a I
      // 10c: iaload
      // 10d: isub
      // 10e: putfield Class_ha.p I
      // 111: aload 4
      // 113: dup
      // 114: getfield Class_ha.a I
      // 117: bipush 1
      // 118: iadd
      // 119: putfield Class_ha.a I
      // 11c: aload 4
      // 11e: getfield Class_ha.a I
      // 121: bipush -1
      // 122: ixor
      // 123: aload 7
      // 125: getfield Class_uc.d [I
      // 128: arraylength
      // 129: bipush -1
      // 12a: ixor
      // 12b: if_icmpgt 159
      // 12e: aload 4
      // 130: dup
      // 131: getfield Class_ha.a I
      // 134: aload 7
      // 136: getfield Class_uc.P I
      // 139: isub
      // 13a: putfield Class_ha.a I
      // 13d: aload 4
      // 13f: getfield Class_ha.a I
      // 142: iflt 153
      // 145: aload 7
      // 147: getfield Class_uc.d [I
      // 14a: arraylength
      // 14b: aload 4
      // 14d: getfield Class_ha.a I
      // 150: if_icmpgt 159
      // 153: aload 4
      // 155: bipush 0
      // 156: putfield Class_ha.a I
      // 159: aload 4
      // 15b: bipush -124
      // 15d: invokestatic Class_tg.a (LClass_ha;I)V
      // 160: aload 7
      // 162: getfield Class_uc.A [I
      // 165: aload 4
      // 167: getfield Class_ha.a I
      // 16a: iaload
      // 16b: bipush -1
      // 16c: ixor
      // 16d: aload 4
      // 16f: getfield Class_ha.p I
      // 172: bipush -1
      // 173: ixor
      // 174: if_icmpgt 0fc
      // 177: aload 4
      // 179: getfield Class_ha.Yc I
      // 17c: ifeq 1d9
      // 17f: aload 4
      // 181: getfield Class_ha.dc Z
      // 184: ifne 1d9
      // 187: aload 4
      // 189: getfield Class_ha.Yc I
      // 18c: ldc -1796951952
      // 18e: ishr
      // 18f: istore 5
      // 191: iload 5
      // 193: getstatic Class_sj.k I
      // 196: imul
      // 197: istore 5
      // 199: aload 4
      // 19b: iload 5
      // 19d: aload 4
      // 19f: getfield Class_ha.ec I
      // 1a2: iadd
      // 1a3: sipush 2047
      // 1a6: iand
      // 1a7: putfield Class_ha.ec I
      // 1aa: aload 4
      // 1ac: getfield Class_ha.Yc I
      // 1af: ldc -486371248
      // 1b1: ishl
      // 1b2: ldc -538030224
      // 1b4: ishr
      // 1b5: istore 6
      // 1b7: iload 6
      // 1b9: getstatic Class_sj.k I
      // 1bc: imul
      // 1bd: istore 6
      // 1bf: aload 4
      // 1c1: iload 6
      // 1c3: aload 4
      // 1c5: getfield Class_ha.gb I
      // 1c8: iadd
      // 1c9: sipush 2047
      // 1cc: iand
      // 1cd: putfield Class_ha.gb I
      // 1d0: aload 4
      // 1d2: iload 0
      // 1d3: bipush -115
      // 1d5: iadd
      // 1d6: invokestatic Class_tg.a (LClass_ha;I)V
      // 1d9: iinc 3 1
      // 1dc: iload 3
      // 1dd: aload 1
      // 1de: arraylength
      // 1df: if_icmplt 00c
      // 1e2: getstatic Class_cb.p I
      // 1e5: bipush 1
      // 1e6: iadd
      // 1e7: putstatic Class_cb.p I
      // 1ea: return
      // 1eb: astore 3
      // 1ec: aload 3
      // 1ed: new java/lang/StringBuffer
      // 1f0: dup
      // 1f1: ldc "cb.B("
      // 1f3: invokespecial java/lang/StringBuffer.<init> (Ljava/lang/String;)V
      // 1f6: iload 0
      // 1f7: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 1fa: bipush 44
      // 1fc: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 1ff: aload 1
      // 200: ifnull 208
      // 203: ldc "{...}"
      // 205: goto 20a
      // 208: ldc "null"
      // 20a: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 20d: bipush 44
      // 20f: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 212: iload 2
      // 213: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 216: bipush 41
      // 218: invokevirtual java/lang/StringBuffer.append (C)Ljava/lang/StringBuffer;
      // 21b: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 21e: invokestatic Class_sh.a (Ljava/lang/Throwable;Ljava/lang/String;)LClass_ua;
      // 221: athrow
   }

   Class_cb() {
      this.n = new int[16];
      this.r = new int[6][258];
      this.z = new byte[256];
      this.b = new byte[4096];
      this.f = new int[257];
      this.s = new boolean[256];
      this.w = 0;
      this.L = new byte[18002];
      this.J = new int[6][258];
      this.D = 0;
      this.N = new boolean[16];
      this.M = new int[6][258];
      this.H = new int[256];
      this.K = new int[6];
   }
}
