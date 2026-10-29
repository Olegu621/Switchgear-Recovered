            package p000;

            import android.os.Process;
            import java.util.concurrent.BlockingQueue;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zi3 extends Thread {

                /* JADX INFO: renamed from: a */
                public final Object f20161a;

                /* JADX INFO: renamed from: b */
                public final BlockingQueue f20162b;

                /* JADX INFO: renamed from: c */
                public boolean f20163c = false;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ bj3 f20164d;

                public zi3(bj3 bj3Var, String str, BlockingQueue blockingQueue) {
/* 1 */             this.f20164d = bj3Var;
/* 9 */             kb1.m6061n(blockingQueue);
/* 17 */            this.f20161a = new Object();
/* 19 */            this.f20162b = blockingQueue;
/* 21 */            setName(str);
                }

                /* JADX INFO: renamed from: a */
                public final void m10356a() {
/* 1 */             bj3 bj3Var = this.f20164d;
                    synchronized (bj3Var.f2458w) {
                        try {
/* 8 */                     if (!this.f20163c) {
/* 12 */                        bj3Var.f2451U.release();
/* 17 */                        bj3Var.f2458w.notifyAll();
/* 23 */                        if (this == bj3Var.f2452c) {
/* 25 */                            bj3Var.f2452c = null;
                                } else if (this == bj3Var.f2453d) {
/* 34 */                            bj3Var.f2453d = null;
                                } else {
/* 41 */                            uh3 uh3Var = ((ij3) bj3Var.f16749a).f9655f;
/* 43 */                            ij3.m4555l(uh3Var);
/* 50 */                            uh3Var.f17538f.m8510a("Current scheduler thread is neither worker nor network");
                                }
/* 54 */                        this.f20163c = true;
                            }
                        } catch (Throwable th) {
/* 59 */                    throw th;
                        }
                    }
                }

                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
/* 1 */             boolean z = false;
/* 3 */             while (!z) {
                        try {
/* 9 */                     this.f20164d.f2451U.acquire();
/* 12 */                    z = true;
                        } catch (InterruptedException e) {
/* 21 */                    uh3 uh3Var = ((ij3) this.f20164d.f16749a).f9655f;
/* 23 */                    ij3.m4555l(uh3Var);
/* 42 */                    uh3Var.f17541w.m8511b(e, String.valueOf(getName()).concat(" was interrupted"));
                        }
                    }
                    try {
/* 50 */                int threadPriority = Process.getThreadPriority(Process.myTid());
                        while (true) {
/* 54 */                    BlockingQueue blockingQueue = this.f20162b;
/* 60 */                    yi3 yi3Var = (yi3) blockingQueue.poll();
/* 62 */                    if (yi3Var != null) {
/* 72 */                        Process.setThreadPriority(true != yi3Var.f19652b ? 10 : threadPriority);
/* 75 */                        yi3Var.run();
                            } else {
/* 81 */                        Object obj = this.f20161a;
                                synchronized (obj) {
/* 88 */                            if (blockingQueue.peek() == null) {
/* 92 */                                this.f20164d.getClass();
                                        try {
/* 97 */                                    obj.wait(30000L);
                                        } catch (InterruptedException e2) {
/* 110 */                                   uh3 uh3Var2 = ((ij3) this.f20164d.f16749a).f9655f;
/* 112 */                                   ij3.m4555l(uh3Var2);
/* 131 */                                   uh3Var2.f17541w.m8511b(e2, String.valueOf(getName()).concat(" was interrupted"));
                                        }
                                    }
                                }
                                synchronized (this.f20164d.f2458w) {
/* 146 */                           if (this.f20162b.peek() == null) {
/* 148 */                               m10356a();
/* 152 */                               m10356a();
/* 155 */                               return;
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
/* 164 */               m10356a();
/* 167 */               throw th;
                    }
                }
            }
