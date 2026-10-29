            package p000;

            import java.util.concurrent.Callable;
            import java.util.concurrent.LinkedBlockingQueue;
            import java.util.concurrent.PriorityBlockingQueue;
            import java.util.concurrent.Semaphore;
            import java.util.concurrent.atomic.AtomicLong;
            import java.util.concurrent.atomic.AtomicReference;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class bj3 extends hk3 {

                /* JADX INFO: renamed from: V */
                public static final AtomicLong f2450V = new AtomicLong(Long.MIN_VALUE);

                /* JADX INFO: renamed from: U */
                public final Semaphore f2451U;

                /* JADX INFO: renamed from: c */
                public zi3 f2452c;

                /* JADX INFO: renamed from: d */
                public zi3 f2453d;

                /* JADX INFO: renamed from: e */
                public final PriorityBlockingQueue f2454e;

                /* JADX INFO: renamed from: f */
                public final LinkedBlockingQueue f2455f;

                /* JADX INFO: renamed from: i */
                public final xi3 f2456i;

                /* JADX INFO: renamed from: v */
                public final xi3 f2457v;

                /* JADX INFO: renamed from: w */
                public final Object f2458w;

                public bj3(ij3 ij3Var) {
/* 1 */             super(ij3Var);
/* 9 */             this.f2458w = new Object();
/* 17 */            this.f2451U = new Semaphore(2);
/* 24 */            this.f2454e = new PriorityBlockingQueue();
/* 31 */            this.f2455f = new LinkedBlockingQueue();
/* 40 */            this.f2456i = new xi3(this, "Thread death: Uncaught exception on worker thread");
/* 49 */            this.f2457v = new xi3(this, "Thread death: Uncaught exception on network thread");
                }

                @Override // p000.hk3
                /* JADX INFO: renamed from: A */
                public final boolean mo1364A() {
/* 1 */             return false;
                }

                /* JADX INFO: renamed from: D */
                public final void m1365D() {
/* 7 */             if (Thread.currentThread() == this.f2453d) {
/* 9 */                 return;
                    }
/* 12 */            f42.m3656l("Call expected from network thread");
                }

                /* JADX INFO: renamed from: E */
                public final void m1366E() {
/* 7 */             if (Thread.currentThread() != this.f2452c) {
/* 9 */                 return;
                    }
/* 12 */            f42.m3656l("Call not expected from worker thread");
                }

                /* JADX INFO: renamed from: F */
                public final boolean m1367F() {
                    return Thread.currentThread() == this.f2452c;
                }

                /* JADX INFO: renamed from: G */
                public final yi3 m1368G(Callable callable) {
/* 1 */             m4240B();
/* 7 */             yi3 yi3Var = new yi3(this, callable, false);
/* 16 */            if (Thread.currentThread() != this.f2452c) {
/* 46 */                m1374M(yi3Var);
/* 49 */                return yi3Var;
                    }
/* 24 */            if (!this.f2454e.isEmpty()) {
/* 30 */                uh3 uh3Var = ((ij3) this.f16749a).f9655f;
/* 32 */                ij3.m4555l(uh3Var);
/* 39 */                uh3Var.f17541w.m8510a("Callable skipped the worker queue.");
                    }
/* 42 */            yi3Var.run();
/* 45 */            return yi3Var;
                }

                /* JADX INFO: renamed from: H */
                public final yi3 m1369H(Callable callable) {
/* 1 */             m4240B();
/* 7 */             yi3 yi3Var = new yi3(this, callable, true);
/* 16 */            if (Thread.currentThread() == this.f2452c) {
/* 18 */                yi3Var.run();
/* 21 */                return yi3Var;
                    }
/* 22 */            m1374M(yi3Var);
/* 25 */            return yi3Var;
                }

                /* JADX INFO: renamed from: I */
                public final void m1370I(Runnable runnable) {
/* 1 */             m4240B();
/* 4 */             kb1.m6061n(runnable);
/* 15 */            m1374M(new yi3(this, runnable, false, "Task exception on worker thread"));
                }

                /* JADX INFO: renamed from: J */
                public final Object m1371J(AtomicReference atomicReference, long j, String str, Runnable runnable) {
                    synchronized (atomicReference) {
/* 8 */                 bj3 bj3Var = ((ij3) this.f16749a).f9659i;
/* 10 */                ij3.m4555l(bj3Var);
/* 13 */                bj3Var.m1370I(runnable);
                        try {
/* 16 */                    atomicReference.wait(j);
                        } catch (InterruptedException unused) {
/* 53 */                    uh3 uh3Var = ((ij3) this.f16749a).f9655f;
/* 55 */                    ij3.m4555l(uh3Var);
/* 58 */                    sh3 sh3Var = uh3Var.f17541w;
/* 68 */                    StringBuilder sb = new StringBuilder(str.length() + 24);
/* 71 */                    sb.append("Interrupted waiting for ");
/* 74 */                    sb.append(str);
/* 81 */                    sh3Var.m8510a(sb.toString());
/* 85 */                    return null;
                        }
                    }
/* 20 */            Object obj = atomicReference.get();
/* 24 */            if (obj == null) {
/* 30 */                uh3 uh3Var2 = ((ij3) this.f16749a).f9655f;
/* 32 */                ij3.m4555l(uh3Var2);
/* 43 */                uh3Var2.f17541w.m8510a("Timed out waiting for ".concat(str));
                    }
/* 46 */            return obj;
                }

                /* JADX INFO: renamed from: K */
                public final void m1372K(Runnable runnable) {
/* 1 */             m4240B();
/* 12 */            m1374M(new yi3(this, runnable, true, "Task exception on worker thread"));
                }

                /* JADX INFO: renamed from: L */
                public final void m1373L(Runnable runnable) {
/* 1 */             m4240B();
/* 9 */             yi3 yi3Var = new yi3(this, runnable, false, "Task exception on network thread");
                    synchronized (this.f2458w) {
                        try {
/* 15 */                    LinkedBlockingQueue linkedBlockingQueue = this.f2455f;
/* 17 */                    linkedBlockingQueue.add(yi3Var);
/* 20 */                    zi3 zi3Var = this.f2453d;
/* 22 */                    if (zi3Var == null) {
/* 28 */                        zi3 zi3Var2 = new zi3(this, "Measurement Network", linkedBlockingQueue);
/* 31 */                        this.f2453d = zi3Var2;
/* 35 */                        zi3Var2.setUncaughtExceptionHandler(this.f2457v);
/* 40 */                        this.f2453d.start();
                            } else {
/* 46 */                        Object obj = zi3Var.f20161a;
                                synchronized (obj) {
/* 49 */                            obj.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
/* 59 */                    throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: M */
                public final void m1374M(yi3 yi3Var) {
                    synchronized (this.f2458w) {
                        try {
/* 4 */                     PriorityBlockingQueue priorityBlockingQueue = this.f2454e;
/* 6 */                     priorityBlockingQueue.add(yi3Var);
/* 9 */                     zi3 zi3Var = this.f2452c;
/* 11 */                    if (zi3Var == null) {
/* 17 */                        zi3 zi3Var2 = new zi3(this, "Measurement Worker", priorityBlockingQueue);
/* 20 */                        this.f2452c = zi3Var2;
/* 24 */                        zi3Var2.setUncaughtExceptionHandler(this.f2456i);
/* 29 */                        this.f2452c.start();
                            } else {
/* 35 */                        Object obj = zi3Var.f20161a;
                                synchronized (obj) {
/* 38 */                            obj.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
/* 48 */                    throw th;
                        }
                    }
                }

                @Override // p000.sq3
                /* JADX INFO: renamed from: y */
                public final void mo1375y() {
/* 7 */             if (Thread.currentThread() == this.f2452c) {
/* 9 */                 return;
                    }
/* 12 */            f42.m3656l("Call expected from worker thread");
                }
            }
