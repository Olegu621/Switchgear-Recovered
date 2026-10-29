            package io.sentry.metrics;

            import io.sentry.C1461g5;
            import io.sentry.C1665s5;
            import io.sentry.C1666s6;
            import io.sentry.C1673t5;
            import io.sentry.EnumC1553m5;
            import io.sentry.RunnableC1526k2;
            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.logger.RunnableC1544d;
            import io.sentry.transport.C1691q;
            import io.sentry.util.C1702a;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.concurrent.ConcurrentLinkedQueue;
            import java.util.concurrent.Future;
            import java.util.concurrent.RejectedExecutionException;
            import java.util.concurrent.TimeUnit;
            import p000.u93;
            
            /* JADX INFO: renamed from: io.sentry.metrics.c */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class C1558c implements InterfaceC1556a {

                /* JADX INFO: renamed from: a */
                public final SentryAndroidOptions f11150a;

                /* JADX INFO: renamed from: b */
                public final u93 f11151b;

                /* JADX INFO: renamed from: d */
                public final C1461g5 f11153d;

                /* JADX INFO: renamed from: e */
                public volatile Future f11154e;

                /* JADX INFO: renamed from: f */
                public final C1702a f11155f = new C1702a();

                /* JADX INFO: renamed from: i */
                public final C1666s6 f11156i = new C1666s6(9);

                /* JADX INFO: renamed from: c */
                public final ConcurrentLinkedQueue f11152c = new ConcurrentLinkedQueue();

                public C1558c(SentryAndroidOptions sentryAndroidOptions, u93 u93Var) {
/* 20 */            this.f11150a = sentryAndroidOptions;
/* 22 */            this.f11151b = u93Var;
/* 36 */            this.f11153d = new C1461g5(sentryAndroidOptions);
                }

                @Override // io.sentry.metrics.InterfaceC1556a
                /* JADX INFO: renamed from: a */
                public void mo4894a(boolean z) {
/* 1 */             C1461g5 c1461g5 = this.f11153d;
/* 3 */             if (z) {
/* 6 */                 m5368e(true);
/* 15 */                c1461g5.submit(new RunnableC1544d(this, 1));
                    } else {
/* 25 */                c1461g5.mo4713a(this.f11150a.getShutdownTimeoutMillis());
/* 34 */                while (!this.f11152c.isEmpty()) {
/* 36 */                    m5367d();
                        }
                    }
                }

                @Override // io.sentry.metrics.InterfaceC1556a
                /* JADX INFO: renamed from: b */
                public final void mo5366b(long j) {
/* 2 */             m5368e(true);
                    try {
/* 17 */                ((C1691q) this.f11156i.f11662b).tryAcquireSharedNanos(1, TimeUnit.MILLISECONDS.toNanos(j));
                    } catch (InterruptedException e) {
/* 32 */                this.f11150a.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to flush metrics events", e);
/* 39 */                Thread.currentThread().interrupt();
                    }
                }

                /* JADX INFO: renamed from: d */
                public final void m5367d() {
/* 5 */             ArrayList arrayList = new ArrayList(1000);
/* 31 */            do {
/* 8 */                 ConcurrentLinkedQueue concurrentLinkedQueue = this.f11152c;
/* 14 */                C1665s5 c1665s5 = (C1665s5) concurrentLinkedQueue.poll();
/* 16 */                if (c1665s5 != null) {
/* 18 */                    arrayList.add(c1665s5);
                        }
/* 25 */                if (concurrentLinkedQueue.isEmpty()) {
                            break;
                        }
/* 31 */            } while (arrayList.size() < 1000);
/* 37 */            if (arrayList.isEmpty()) {
/* 98 */                return;
                    }
/* 41 */            C1673t5 c1673t5 = new C1673t5(arrayList);
/* 44 */            u93 u93Var = this.f11151b;
/* 46 */            u93Var.getClass();
                    try {
/* 55 */                u93Var.m8995y(u93Var.m8988q(c1673t5), null);
                    } catch (IOException e) {
/* 74 */                ((SentryAndroidOptions) u93Var.f17429b).getLogger().mo4670b(EnumC1553m5.WARNING, e, "Capturing metrics failed.", new Object[0]);
                    }
/* 81 */            for (int i = 0; i < arrayList.size(); i++) {
/* 87 */                C1691q c1691q = (C1691q) this.f11156i.f11662b;
/* 89 */                int i2 = C1691q.f11714a;
/* 92 */                c1691q.releaseShared(1);
                    }
                }

                /* JADX INFO: renamed from: e */
                public final void m5368e(boolean z) {
/* 1 */             C1702a c1702a = this.f11155f;
/* 3 */             c1702a.m5443c();
                    try {
                        try {
/* 26 */                    this.f11154e = this.f11153d.mo4714b(new RunnableC1526k2(this, 8), z ? 0 : 5000);
                        } catch (RejectedExecutionException e) {
/* 42 */                    this.f11150a.getLogger().mo4671d(EnumC1553m5.WARNING, "Metrics batch processor flush task rejected", e);
                        }
/* 45 */                c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 49 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 54 */                    th.addSuppressed(th2);
                        }
/* 57 */                throw th;
                    }
                }
            }
