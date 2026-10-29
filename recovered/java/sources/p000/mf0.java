            package p000;

            import java.util.concurrent.Callable;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.Executors;
            import java.util.concurrent.Future;
            import java.util.concurrent.ScheduledExecutorService;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class mf0 {

                /* JADX INFO: renamed from: a */
                public static ScheduledExecutorService f13715a;

                /* JADX INFO: renamed from: b */
                public static int f13716b = mc0.f13688h;

                /* JADX INFO: renamed from: a */
                public static final void m6643a(String str, boolean z, Runnable runnable) {
/* 3 */             lf0 lf0Var = new lf0(str, z);
/* 6 */             ExecutorService executorServiceM6645c = m6645c();
/* 10 */            if (executorServiceM6645c != null) {
                        try {
/* 19 */                    executorServiceM6645c.execute(new RunnableC1784j8(22, runnable, lf0Var));
                        } catch (Exception e) {
/* 24 */                    lf0Var.m6431a(e);
                        }
                    }
                }

                /* JADX INFO: renamed from: b */
                public static final Future m6644b(Callable callable) {
                    try {
/* 2 */                 ExecutorService executorServiceM6645c = m6645c();
/* 6 */                 if (executorServiceM6645c != null) {
/* 8 */                     return executorServiceM6645c.submit(callable);
                        }
/* 1 */                 return null;
                    } catch (Exception e) {
/* 16 */                String message = e.getMessage();
/* 20 */                if (message == null) {
/* 22 */                    message = "Failed to submit task";
                        }
/* 29 */                k50.m5980q("Executor", message, new Object[0]);
/* 1 */                 return null;
                    }
                }

                /* JADX INFO: renamed from: c */
                public static final synchronized ExecutorService m6645c() {
/* 6 */             if (f13715a == null) {
                        try {
/* 14 */                    f13715a = Executors.newScheduledThreadPool(f13716b);
                        } catch (Exception e) {
/* 22 */                    String message = e.getMessage();
/* 26 */                    if (message == null) {
/* 28 */                        message = "Failed to create thread pool";
                            }
/* 33 */                    k50.m5980q("Executor", message, new Object[0]);
                        }
                    }
/* 36 */            return f13715a;
                }
            }
