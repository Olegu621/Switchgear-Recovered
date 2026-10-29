            package p000;

            import java.util.ArrayDeque;
            import java.util.concurrent.Executor;
            import java.util.concurrent.RejectedExecutionException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class y92 implements Executor {

                /* JADX INFO: renamed from: b */
                public final Executor f19545b;

                /* JADX INFO: renamed from: a */
                public final ArrayDeque f19544a = new ArrayDeque();

                /* JADX INFO: renamed from: c */
                public final RunnableC2495ye f19546c = new RunnableC2495ye(this, 22);

                /* JADX INFO: renamed from: d */
                public int f19547d = 1;

                /* JADX INFO: renamed from: e */
                public long f19548e = 0;

                public y92(Executor executor) {
/* 27 */            executor.getClass();
/* 30 */            this.f19545b = executor;
                }

                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
/* 1 */             runnable.getClass();
                    synchronized (this.f19544a) {
/* 7 */                 int i = this.f19547d;
/* 10 */                if (i != 4 && i != 3) {
/* 16 */                    long j = this.f19548e;
/* 20 */                    f62 f62Var = new f62(runnable, 3);
/* 25 */                    this.f19544a.add(f62Var);
/* 29 */                    this.f19547d = 2;
                            try {
/* 36 */                        this.f19545b.execute(this.f19546c);
/* 41 */                        if (this.f19547d != 2) {
/* 96 */                            return;
                                }
                                synchronized (this.f19544a) {
                                    try {
/* 51 */                                if (this.f19548e == j && this.f19547d == 2) {
/* 57 */                                    this.f19547d = 3;
                                        }
                                    } catch (Throwable th) {
/* 65 */                                throw th;
                                    }
                                }
/* 63 */                        return;
                            } catch (Error | RuntimeException e) {
                                synchronized (this.f19544a) {
                                    try {
/* 72 */                                int i2 = this.f19547d;
/* 74 */                                boolean z = true;
/* 75 */                                if ((i2 != 1 && i2 != 2) || !this.f19544a.removeLastOccurrence(f62Var)) {
/* 88 */                                    z = false;
                                        }
/* 91 */                                if (!(e instanceof RejectedExecutionException) || z) {
/* 99 */                                    throw e;
                                        }
                                    } catch (Throwable th2) {
/* 101 */                               throw th2;
                                    }
                                }
/* 96 */                        return;
                            }
                        }
/* 106 */               this.f19544a.add(runnable);
                    }
                }
            }
