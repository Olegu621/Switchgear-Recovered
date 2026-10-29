            package p000;

            import java.lang.reflect.Method;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.Executor;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.RejectedExecutionException;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.ScheduledThreadPoolExecutor;
            import java.util.concurrent.TimeUnit;
            import kotlin.coroutines.CoroutineContext;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class of0 extends nf0 implements g70 {

                /* JADX INFO: renamed from: c */
                public final Executor f14735c;

                public of0(Executor executor) {
                    Method method;
/* 4 */             this.f14735c = executor;
/* 6 */             Method method2 = AbstractC2124qy.f15797a;
                    try {
/* 15 */                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
/* 16 */                if (scheduledThreadPoolExecutor != null && (method = AbstractC2124qy.f15797a) != null) {
/* 30 */                    method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
                        }
                    } catch (Throwable unused) {
                    }
                }

                @Override // p000.g70
                /* JADX INFO: renamed from: c */
                public final e90 mo3417c(long j, mo2 mo2Var, CoroutineContext coroutineContext) {
/* 1 */             Executor executor = this.f14735c;
/* 5 */             ScheduledFuture<?> scheduledFutureSchedule = null;
/* 11 */            ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
/* 12 */            if (scheduledExecutorService != null) {
                        try {
/* 16 */                    scheduledFutureSchedule = scheduledExecutorService.schedule(mo2Var, j, TimeUnit.MILLISECONDS);
                        } catch (RejectedExecutionException e) {
/* 26 */                    CancellationException cancellationException = new CancellationException("The task was rejected");
/* 29 */                    cancellationException.initCause(e);
/* 38 */                    h01 h01Var = (h01) coroutineContext.get(xt0.f19368w);
/* 40 */                    if (h01Var != null) {
/* 42 */                        h01Var.cancel(cancellationException);
                            }
                        }
                    }
                    return scheduledFutureSchedule != null ? new d90(scheduledFutureSchedule) : w50.f18442W.mo3417c(j, mo2Var, coroutineContext);
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
/* 1 */             Executor executor = this.f14735c;
/* 10 */            ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
/* 11 */            if (executorService != null) {
/* 13 */                executorService.shutdown();
                    }
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof of0) && ((of0) obj).f14735c == this.f14735c;
                }

                @Override // p000.g70
                /* JADX INFO: renamed from: f */
                public final void mo3418f(long j, C0890er c0890er) {
/* 1 */             Executor executor = this.f14735c;
/* 5 */             ScheduledFuture<?> scheduledFutureSchedule = null;
/* 11 */            ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
/* 12 */            if (scheduledExecutorService != null) {
/* 18 */                dp0 dp0Var = new dp0(19, this, c0890er);
/* 21 */                CoroutineContext coroutineContext = c0890er.f7845e;
                        try {
/* 25 */                    scheduledFutureSchedule = scheduledExecutorService.schedule(dp0Var, j, TimeUnit.MILLISECONDS);
                        } catch (RejectedExecutionException e) {
/* 35 */                    CancellationException cancellationException = new CancellationException("The task was rejected");
/* 38 */                    cancellationException.initCause(e);
/* 47 */                    h01 h01Var = (h01) coroutineContext.get(xt0.f19368w);
/* 49 */                    if (h01Var != null) {
/* 51 */                        h01Var.cancel(cancellationException);
                            }
                        }
                    }
/* 54 */            if (scheduledFutureSchedule != null) {
/* 62 */                c0890er.m3574x(new C2507yq(scheduledFutureSchedule, 0));
                    } else {
/* 68 */                w50.f18442W.mo3418f(j, c0890er);
                    }
                }

                @Override // p000.s10
                /* JADX INFO: renamed from: g */
                public final void mo1539g(CoroutineContext coroutineContext, Runnable runnable) {
                    try {
/* 3 */                 this.f14735c.execute(runnable);
                    } catch (RejectedExecutionException e) {
/* 12 */                CancellationException cancellationException = new CancellationException("The task was rejected");
/* 15 */                cancellationException.initCause(e);
/* 24 */                h01 h01Var = (h01) coroutineContext.get(xt0.f19368w);
/* 26 */                if (h01Var != null) {
/* 28 */                    h01Var.cancel(cancellationException);
                        }
/* 33 */                z80.f19977c.mo1539g(coroutineContext, runnable);
                    }
                }

                public final int hashCode() {
/* 3 */             return System.identityHashCode(this.f14735c);
                }

                @Override // p000.s10
                public final String toString() {
/* 3 */             return this.f14735c.toString();
                }
            }
