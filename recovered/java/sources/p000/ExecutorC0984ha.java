            package p000;

            import java.util.ArrayDeque;
            import java.util.concurrent.Executor;
            
            /* JADX INFO: renamed from: ha */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ExecutorC0984ha implements Executor {

                /* JADX INFO: renamed from: a */
                public final Object f8978a = new Object();

                /* JADX INFO: renamed from: b */
                public final ArrayDeque f8979b = new ArrayDeque();

                /* JADX INFO: renamed from: c */
                public final o80 f8980c;

                /* JADX INFO: renamed from: d */
                public Runnable f8981d;

                public ExecutorC0984ha(o80 o80Var) {
/* 18 */            this.f8980c = o80Var;
                }

                /* JADX INFO: renamed from: a */
                public final void m4136a() {
                    synchronized (this.f8978a) {
                        try {
/* 10 */                    Runnable runnable = (Runnable) this.f8979b.poll();
/* 12 */                    this.f8981d = runnable;
/* 14 */                    if (runnable != null) {
/* 18 */                        this.f8980c.execute(runnable);
                            }
                        } catch (Throwable th) {
/* 27 */                    throw th;
                        }
                    }
                }

                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    synchronized (this.f8978a) {
                        try {
/* 12 */                    this.f8979b.add(new RunnableC1784j8(1, this, runnable));
/* 17 */                    if (this.f8981d == null) {
/* 19 */                        m4136a();
                            }
                        } catch (Throwable th) {
/* 28 */                    throw th;
                        }
                    }
                }
            }
