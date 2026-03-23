final class Class_qi {
   int a;
   int b;
   int[] c;
   int[] d;

   Class_qi() {
      Class_q.d(16);
      this.b = Class_q.a() != 0 ? Class_q.d(4) + 1 : 1;
      if (Class_q.a() != 0) {
         Class_q.d(8);
      }

      Class_q.d(2);
      if (this.b > 1) {
         this.a = Class_q.d(4);
      }

      this.d = new int[this.b];
      this.c = new int[this.b];

      for (int var1 = 0; var1 < this.b; var1++) {
         Class_q.d(8);
         this.d[var1] = Class_q.d(8);
         this.c[var1] = Class_q.d(8);
      }
   }
}
