            package io.sentry;

            import io.sentry.util.C1702a;
            import java.util.concurrent.Future;
            import java.util.concurrent.ScheduledThreadPoolExecutor;
            import java.util.concurrent.TimeUnit;
            
            /* JADX INFO: renamed from: io.sentry.g5 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 15 */    public final class C1461g5 implements InterfaceC1457g1 {

                /* JADX INFO: renamed from: a */
                public final ScheduledThreadPoolExecutor f10960a;

                /* JADX INFO: renamed from: b */
                public final C1702a f10961b;

                /* JADX INFO: renamed from: c */
                public final C1554m6 f10962c;

                public C1461g5() {
/* 13 */            this(new ScheduledThreadPoolExecutor(1, new ThreadFactoryC1524k0(1)), null);
                }

                @Override // io.sentry.InterfaceC1457g1
                /* JADX INFO: renamed from: a */
                public final void mo4713a(long j) {
/* 1 */             ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f10960a;
/* 3 */             C1702a c1702a = this.f10961b;
/* 5 */             c1702a.m5443c();
                    try {
/* 12 */                if (!scheduledThreadPoolExecutor.isShutdown()) {
/* 14 */                    scheduledThreadPoolExecutor.shutdown();
                            try {
/* 23 */                        if (!scheduledThreadPoolExecutor.awaitTermination(j, TimeUnit.MILLISECONDS)) {
/* 25 */                            scheduledThreadPoolExecutor.shutdownNow();
                                }
                            } catch (InterruptedException unused) {
/* 31 */                        scheduledThreadPoolExecutor.shutdownNow();
/* 38 */                        Thread.currentThread().interrupt();
                            }
                        }
/* 41 */                c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 45 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 50 */                    th.addSuppressed(th2);
                        }
/* 53 */                throw th;
                    }
                }

                @Override // io.sentry.InterfaceC1457g1
                /* JADX INFO: renamed from: b */
                public final Future mo4714b(Runnable runnable, long j) {
/* 5 */             return this.f10960a.schedule(runnable, j, TimeUnit.MILLISECONDS);
                }

                @Override // io.sentry.InterfaceC1457g1
                public final boolean isClosed() {
/* 1 */             C1702a c1702a = this.f10961b;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 boolean zIsShutdown = this.f10960a.isShutdown();
/* 12 */                c1702a.close();
/* 15 */                return zIsShutdown;
                    } catch (Throwable th) {
                        try {
/* 17 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 22 */                    th.addSuppressed(th2);
                        }
/* 25 */                throw th;
                    }
                }

                @Override // io.sentry.InterfaceC1457g1
                public final Future submit(Runnable runnable) {
/* 1 */             ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f10960a;
/* 13 */            if (scheduledThreadPoolExecutor.getQueue().size() >= 271) {
/* 15 */                scheduledThreadPoolExecutor.purge();
                    }
/* 26 */            if (scheduledThreadPoolExecutor.getQueue().size() < 271) {
/* 28 */                return scheduledThreadPoolExecutor.submit(runnable);
                    }
/* 33 */            C1554m6 c1554m6 = this.f10962c;
/* 35 */            if (c1554m6 != null) {
/* 68 */                c1554m6.getLogger().mo4672k(EnumC1553m5.WARNING, "Task " + runnable + " rejected from " + scheduledThreadPoolExecutor, new Object[0]);
                    }
/* 73 */            return new FutureC1437e5();
                }

/* 16 */        public C1461g5(C1554m6 c1554m6) {
/* 19 */            this(new ScheduledThreadPoolExecutor(1, new ThreadFactoryC1524k0(1)), c1554m6);
                }

/* 19 */        public C1461g5(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, C1554m6 c1554m6) {
/* 23 */            this.f10961b = new C1702a();
/* 24 */            this.f10960a = scheduledThreadPoolExecutor;
/* 25 */            this.f10962c = c1554m6;
                }
            }
