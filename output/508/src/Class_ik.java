import java.applet.Applet;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class Class_ik implements Runnable {
   public static String a;
   private Thread b;
   private Class_ei c = null;
   public Class_ac[] d;
   public static String e;
   public Class_ac f;
   public Applet g;
   public File h = null;
   public static Method i;
   public Class_ac j;
   public static String k;
   public static String l;
   private Class_ei m;
   public static Method n;
   private Class_dg o;
   private static String p;
   private File q;
   public static String r;
   public static int s = 3;
   private boolean t;
   public EventQueue u;
   public Class_ac v;
   public static String w;

   private final Class_ei a(int var1, Object var2, int var3, int var4, int var5) {
      try {
         Class_ei var6 = new Class_ei();
         var6.f = var3;
         var6.a = var2;
         var6.c = var1;
         synchronized (this) {
            if (this.c == null) {
               this.c = this.m = var6;
            } else {
               this.c.d = var6;
               this.c = var6;
            }

            this.notify();
            int var9 = 20 / ((var4 - -48) / 48);
         }

         return var6;
      } catch (RuntimeException var13) {
         throw var13;
      }
   }

   public final Class_ei a(Class var1, byte var2) {
      try {
         if (var2 > -81) {
            this.o = null;
         }

         return this.a(13, var1, 0, -101, 0);
      } catch (RuntimeException var4) {
         throw var4;
      }
   }

   public final Class_ei a(byte var1, int var2, Runnable var3) {
      try {
         if (var1 >= -28) {
            this.a((Class)null, (byte)-110);
         }

         return this.a(2, var3, var2, -123, 0);
      } catch (RuntimeException var5) {
         throw var5;
      }
   }

   public final Class_ei a(String var1, byte var2, int var3) {
      try {
         if (var2 < 107) {
            this.a(-9, 4);
         }

         return this.a(1, var1, var3, -107, 0);
      } catch (RuntimeException var5) {
         throw var5;
      }
   }

   public final Class_ei a(Class var1, int var2) {
      try {
         return var2 < 12 ? null : this.a(11, var1, 0, 88, 0);
      } catch (RuntimeException var4) {
         throw var4;
      }
   }

   public final void run() {
      try {
         while (true) {
            Class_ei var1;
            synchronized (this) {
               while (true) {
                  if (this.t) {
                     return;
                  }

                  if (this.m != null) {
                     var1 = this.m;
                     this.m = this.m.d;
                     if (this.m == null) {
                        this.c = null;
                     }
                     break;
                  } else {
                     try {
                        this.wait();
                     } catch (InterruptedException var11) {
                     }
                  }
               }
            }

            try {
               int var2 = var1.c;
               if (~var2 == -2) {
                  var1.e = new Socket(InetAddress.getByName((String)var1.a), var1.f);
               } else if (var2 == 2) {
                  Thread var3 = new Thread((Runnable)var1.a);
                  var3.setDaemon(true);
                  var3.start();
                  var3.setPriority(var1.f);
                  var1.e = var3;
               } else if (var2 != 4) {
                  if (var2 != 8) {
                     if (var2 != 9) {
                        throw new Exception();
                     }

                     Object[] var14 = (Object[])var1.a;
                     var1.e = ((Class)var14[0]).getDeclaredField((String)var14[1]);
                  } else {
                     Object[] var15 = (Object[])var1.a;
                     var1.e = ((Class)var15[0]).getDeclaredMethod((String)var15[1], (Class<?>[])var15[2]);
                  }
               } else {
                  var1.e = new DataInputStream(((URL)var1.a).openStream());
               }

               var1.b = 1;
            } catch (ThreadDeath var9) {
               throw var9;
            } catch (Throwable var10) {
               var1.b = 2;
            }
         }
      } catch (RuntimeException var13) {
         throw var13;
      }
   }

   public final Class_ei a(int var1, String var2, Class var3) {
      try {
         return var1 != 30810 ? null : this.a(9, new Object[]{var3, var2}, 0, -104, 0);
      } catch (RuntimeException var5) {
         throw var5;
      }
   }

   public final Class_ei a(URL var1, int var2) {
      try {
         if (var2 != 0) {
            this.run();
         }

         return this.a(4, var1, 0, 12, 0);
      } catch (RuntimeException var4) {
         throw var4;
      }
   }

   public final Class_ei a(int var1, int var2) {
      try {
         if (var2 != 0) {
            this.h = null;
         }

         return this.a(3, null, var1, var2 + 28, 0);
      } catch (RuntimeException var4) {
         throw var4;
      }
   }

   public final Class_ei a(Class[] var1, int var2, String var3, Class var4) {
      try {
         if (var2 != 0) {
            this.a(-119, null, 20, -51);
         }

         return this.a(8, new Object[]{var4, var3, var1}, 0, -98, 0);
      } catch (RuntimeException var6) {
         throw var6;
      }
   }

   private final void a(int var1, String var2, int var3, int var4) {
      try {
         if (var1 < 32 || var1 > 34) {
            var1 = 32;
         }

         String[] var6 = new String[]{".jagex_cache_" + var1, ".file_store_" + var1};
         String[] var5 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", p, "/tmp/", ""};
         if (var3 != 34) {
            this.u = null;
         }

         for (int var7 = 0; var7 < 2; var7++) {
            for (int var8 = 0; var6.length > var8; var8++) {
               for (int var9 = 0; var9 < var5.length; var9++) {
                  try {
                     String var10 = var5[var9];
                     if (var10.length() > 0 && !new File(var10).exists()) {
                        continue;
                     }

                     File var11 = new File(var10 + var6[var8]);
                     if (var7 == 1 && !var11.exists()) {
                        boolean var12 = var11.mkdir();
                        if (!var12) {
                           continue;
                        }
                     }

                     if (this.f == null) {
                        try {
                           File var20 = new File(var11, "random.dat");
                           if (~var7 == -2 || var20.exists()) {
                              this.f = new Class_ac(var20, "rw", 25L);
                           }
                        } catch (Exception var16) {
                           this.f = null;
                        }
                     }

                     if (this.q == null) {
                        try {
                           var11 = new File(var11, var2);
                           if (~var7 == -2 && !var11.exists()) {
                              boolean var22 = var11.mkdir();
                              if (!var22) {
                                 continue;
                              }
                           }

                           File var23 = new File(var11, "main_file_cache.dat2");
                           if (~var7 == -1 && !var23.exists()) {
                              continue;
                           }

                           this.j = new Class_ac(var23, "rw", 104857600L);
                           this.d = new Class_ac[var4];

                           for (int var13 = 0; ~var13 > ~var4; var13++) {
                              this.d[var13] = new Class_ac(new File(var11, "main_file_cache.idx" + var13), "rw", 1048576L);
                           }

                           this.v = new Class_ac(new File(var11, "main_file_cache.idx255"), "rw", 1048576L);
                           this.h = this.q = var11;
                        } catch (Exception var15) {
                           try {
                              this.j.c(var3 ^ -8173);

                              for (int var21 = 0; ~var21 > ~var4; var21++) {
                                 this.d[var21].c(-8143);
                              }

                              this.v.c(-8143);
                           } catch (Exception var14) {
                           }

                           this.h = this.q = null;
                           this.d = null;
                           this.j = this.v = null;
                        }
                     }
                  } catch (Exception var17) {
                  }

                  if (this.f != null && this.q != null) {
                     return;
                  }
               }
            }
         }

         if (this.q == null) {
            throw new RuntimeException();
         }
      } catch (RuntimeException var18) {
         throw var18;
      }
   }

   public final void a(int var1) {
      try {
         synchronized (this) {
            if (var1 != 0) {
               this.a((Class)null, -14);
            }

            this.t = true;
            this.notifyAll();
         }

         try {
            this.b.join();
         } catch (InterruptedException var14) {
         }

         if (this.j != null) {
            try {
               this.j.c(var1 + -8143);
            } catch (IOException var13) {
            }
         }

         if (this.v != null) {
            try {
               this.v.c(-8143);
            } catch (IOException var12) {
            }
         }

         if (this.d != null) {
            for (int var2 = 0; var2 < this.d.length; var2++) {
               if (this.d[var2] != null) {
                  try {
                     this.d[var2].c(-8143);
                  } catch (IOException var11) {
                  }
               }
            }
         }

         if (this.f != null) {
            try {
               this.f.c(-8143);
            } catch (IOException var10) {
            }
         }
      } catch (RuntimeException var16) {
         throw var16;
      }
   }

   public final Class_dg b(int var1) {
      try {
         return var1 != 0 ? null : this.o;
      } catch (RuntimeException var3) {
         throw var3;
      }
   }

   public final Class_ei a(boolean var1, String var2) {
      try {
         return !var1 ? null : this.a(12, var2, 0, -124, 0);
      } catch (RuntimeException var4) {
         throw var4;
      }
   }

   public Class_ik(boolean var1, Applet var2, int var3, String var4, int var5) {
      this.f = null;
      this.q = null;
      this.m = null;
      this.g = null;
      this.j = null;
      this.t = false;
      this.v = null;

      try {
         w = "1.1";
         this.g = var2;
         a = "Unknown";

         try {
            a = System.getProperty("java.vendor");
            w = System.getProperty("java.version");
         } catch (Exception var14) {
         }

         try {
            k = System.getProperty("os.name");
         } catch (Exception var13) {
            k = "Unknown";
         }

         e = k.toLowerCase();

         try {
            l = System.getProperty("os.arch").toLowerCase();
         } catch (Exception var12) {
            l = "";
         }

         try {
            r = System.getProperty("os.version").toLowerCase();
         } catch (Exception var11) {
            r = "";
         }

         try {
            p = System.getProperty("user.home");
            if (p != null) {
               p = p + "/";
            }
         } catch (Exception var10) {
         }

         if (p == null) {
            p = "~/";
         }

         try {
            this.u = Toolkit.getDefaultToolkit().getSystemEventQueue();
         } catch (Throwable var9) {
         }

         try {
            if (var2 == null) {
               n = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", boolean.class);
            } else {
               n = var2.getClass().getMethod("setFocusTraversalKeysEnabled", boolean.class);
            }
         } catch (Exception var8) {
         }

         try {
            if (var2 == null) {
               i = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", boolean.class);
            } else {
               i = var2.getClass().getMethod("setFocusCycleRoot", boolean.class);
            }
         } catch (Exception var7) {
         }

         if (var1) {
            this.a(var3, var4, 34, var5);
         }

         this.t = false;
         this.b = new Thread(this);
         this.b.setPriority(10);
         this.b.setDaemon(true);
         this.b.start();
      } catch (RuntimeException var15) {
         throw var15;
      }
   }
}
