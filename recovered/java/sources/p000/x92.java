            package p000;

            import java.util.ArrayDeque;
            import java.util.concurrent.Executor;
            import java.util.concurrent.RejectedExecutionException;
            import java.util.logging.Logger;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class x92 implements Executor {

                /* JADX INFO: renamed from: f */
                public static final Logger f18998f = Logger.getLogger(x92.class.getName());

                /* JADX INFO: renamed from: a */
                public final Executor f18999a;

                /* JADX INFO: renamed from: b */
                public final ArrayDeque f19000b = new ArrayDeque();

                /* JADX INFO: renamed from: c */
                public int f19001c = 1;

                /* JADX INFO: renamed from: d */
                public long f19002d = 0;

                /* JADX INFO: renamed from: e */
                public final dp0 f19003e = new dp0(this);

                public x92(Executor executor) {
/* 25 */            kb1.m6061n(executor);
/* 28 */            this.f18999a = executor;
                }

                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
/* 1 */             kb1.m6061n(runnable);
                    synchronized (this.f19000b) {
/* 7 */                 int i = this.f19001c;
/* 10 */                if (i != 4 && i != 3) {
/* 16 */                    long j = this.f19002d;
/* 21 */                    f62 f62Var = new f62(runnable, 2);
/* 26 */                    this.f19000b.add(f62Var);
/* 29 */                    this.f19001c = 2;
                            try {
/* 36 */                        this.f18999a.execute(this.f19003e);
/* 41 */                        if (this.f19001c != 2) {
/* 96 */                            return;
                                }
                                synchronized (this.f19000b) {
                                    try {
/* 51 */                                if (this.f19002d == j && this.f19001c == 2) {
/* 57 */                                    this.f19001c = 3;
                                        }
                                    } catch (Throwable th) {
/* 65 */                                throw th;
                                    }
                                }
/* 63 */                        return;
                            } catch (Error | RuntimeException e) {
                                synchronized (this.f19000b) {
                                    try {
/* 72 */                                int i2 = this.f19001c;
/* 74 */                                boolean z = true;
/* 75 */                                if ((i2 != 1 && i2 != 2) || !this.f19000b.removeLastOccurrence(f62Var)) {
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
/* 106 */               this.f19000b.add(runnable);
                    }
                }

                public final String toString() {
/* 30 */            return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f18999a + "}";
                }
            }
