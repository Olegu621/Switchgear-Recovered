            package io.sentry.transport;

            import io.sentry.AbstractC1672t4;
            import io.sentry.C1666s6;
            import io.sentry.EnumC1553m5;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1699u4;
            import io.sentry.ThreadFactoryC1524k0;
            import java.util.concurrent.Future;
            import java.util.concurrent.LinkedBlockingQueue;
            import java.util.concurrent.RejectedExecutionException;
            import java.util.concurrent.ThreadPoolExecutor;
            import java.util.concurrent.TimeUnit;
            
            /* JADX INFO: renamed from: io.sentry.transport.n */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1688n extends ThreadPoolExecutor {

                /* JADX INFO: renamed from: a */
                public final int f11703a;

                /* JADX INFO: renamed from: b */
                public AbstractC1672t4 f11704b;

                /* JADX INFO: renamed from: c */
                public final ILogger f11705c;

                /* JADX INFO: renamed from: d */
                public final InterfaceC1699u4 f11706d;

                /* JADX INFO: renamed from: e */
                public final C1666s6 f11707e;

                public C1688n(int i, ThreadFactoryC1524k0 threadFactoryC1524k0, RejectedExecutionHandlerC1675a rejectedExecutionHandlerC1675a, ILogger iLogger, InterfaceC1699u4 interfaceC1699u4) {
/* 15 */            super(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactoryC1524k0, rejectedExecutionHandlerC1675a);
/* 19 */            this.f11704b = null;
/* 28 */            this.f11707e = new C1666s6(9);
/* 30 */            this.f11703a = i;
/* 32 */            this.f11705c = iLogger;
/* 34 */            this.f11706d = interfaceC1699u4;
                }

                @Override // java.util.concurrent.ThreadPoolExecutor
                public final void afterExecute(Runnable runnable, Throwable th) {
/* 1 */             C1666s6 c1666s6 = this.f11707e;
                    try {
/* 4 */                 super.afterExecute(runnable, th);
                    } finally {
/* 20 */                C1691q c1691q = (C1691q) c1666s6.f11662b;
/* 22 */                int i = C1691q.f11714a;
/* 24 */                c1691q.releaseShared(1);
                    }
                }

                @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
                public final Future submit(Runnable runnable) {
/* 1 */             C1666s6 c1666s6 = this.f11707e;
/* 5 */             C1691q c1691q = (C1691q) c1666s6.f11662b;
/* 9 */             C1691q c1691q2 = (C1691q) c1666s6.f11662b;
/* 11 */            int iM5429a = C1691q.m5429a(c1691q);
/* 15 */            int i = this.f11703a;
/* 17 */            ILogger iLogger = this.f11705c;
/* 19 */            InterfaceC1699u4 interfaceC1699u4 = this.f11706d;
/* 21 */            if (iM5429a >= i) {
/* 59 */                this.f11704b = interfaceC1699u4.mo4856a();
/* 68 */                iLogger.mo4672k(EnumC1553m5.WARNING, "Submit cancelled", new Object[0]);
/* 73 */                return new FutureC1687m();
                    }
/* 23 */            C1691q.m5430b(c1691q2);
                    try {
/* 26 */                return super.submit(runnable);
                    } catch (RejectedExecutionException e) {
/* 33 */                c1691q2.releaseShared(1);
/* 40 */                this.f11704b = interfaceC1699u4.mo4856a();
/* 46 */                iLogger.mo4671d(EnumC1553m5.WARNING, "Submit rejected by thread pool executor", e);
/* 51 */                return new FutureC1687m();
                    }
                }
            }
