            package p000;

            import java.util.LinkedHashSet;
            import java.util.concurrent.Executor;
            import java.util.concurrent.LinkedBlockingQueue;
            import java.util.concurrent.ThreadPoolExecutor;
            import java.util.concurrent.TimeUnit;
            
            /* JADX INFO: renamed from: wp */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ExecutorC2339wp implements Executor {

                /* JADX INFO: renamed from: c */
                public static final ThreadFactoryC2302vp f18715c = new ThreadFactoryC2302vp(0);

                /* JADX INFO: renamed from: a */
                public final Object f18716a = new Object();

                /* JADX INFO: renamed from: b */
                public ThreadPoolExecutor f18717b;

                public ExecutorC2339wp() {
/* 26 */            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f18715c);
/* 35 */            threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandlerC2263up(0));
/* 38 */            this.f18717b = threadPoolExecutor;
                }

                /* JADX INFO: renamed from: a */
                public final void m9595a(C1896ln c1896ln) {
                    ThreadPoolExecutor threadPoolExecutor;
/* 1 */             c1896ln.getClass();
                    synchronized (this.f18716a) {
                        try {
/* 13 */                    if (this.f18717b.isShutdown()) {
/* 30 */                        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f18715c);
/* 39 */                        threadPoolExecutor2.setRejectedExecutionHandler(new RejectedExecutionHandlerC2263up(0));
/* 42 */                        this.f18717b = threadPoolExecutor2;
                            }
/* 48 */                    threadPoolExecutor = this.f18717b;
                        } catch (Throwable th) {
/* 75 */                    throw th;
                        }
                    }
/* 63 */            int iMax = Math.max(1, new LinkedHashSet(c1896ln.f13426f).size());
/* 67 */            threadPoolExecutor.setMaximumPoolSize(iMax);
/* 70 */            threadPoolExecutor.setCorePoolSize(iMax);
                }

                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
/* 1 */             runnable.getClass();
                    synchronized (this.f18716a) {
/* 9 */                 this.f18717b.execute(runnable);
                    }
                }
            }
