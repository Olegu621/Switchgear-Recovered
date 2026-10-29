            package io.sentry.logger;

            import io.sentry.C1461g5;
            import io.sentry.C1575o5;
            import io.sentry.C1583p5;
            import io.sentry.C1666s6;
            import io.sentry.EnumC1553m5;
            import io.sentry.EnumC1560n;
            import io.sentry.RunnableC1526k2;
            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.clientreport.EnumC1414d;
            import io.sentry.clientreport.InterfaceC1416f;
            import io.sentry.transport.C1691q;
            import io.sentry.util.AbstractC1706e;
            import io.sentry.util.C1702a;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.concurrent.ConcurrentLinkedQueue;
            import java.util.concurrent.Future;
            import java.util.concurrent.RejectedExecutionException;
            import java.util.concurrent.TimeUnit;
            import p000.u93;
            
            /* JADX INFO: renamed from: io.sentry.logger.e */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class C1545e implements InterfaceC1542b {

                /* JADX INFO: renamed from: a */
                public final SentryAndroidOptions f11123a;

                /* JADX INFO: renamed from: b */
                public final u93 f11124b;

                /* JADX INFO: renamed from: c */
                public final ConcurrentLinkedQueue f11125c;

                /* JADX INFO: renamed from: d */
                public final C1461g5 f11126d;

                /* JADX INFO: renamed from: e */
                public volatile Future f11127e;

                /* JADX INFO: renamed from: f */
                public final C1702a f11128f;

                /* JADX INFO: renamed from: i */
                public volatile boolean f11129i;

                /* JADX INFO: renamed from: v */
                public volatile boolean f11130v;

                /* JADX INFO: renamed from: w */
                public final C1666s6 f11131w;

                public C1545e(SentryAndroidOptions sentryAndroidOptions, u93 u93Var) {
/* 3 */             C1461g5 c1461g5 = new C1461g5(sentryAndroidOptions);
/* 14 */            this.f11128f = new C1702a();
/* 17 */            this.f11129i = false;
/* 19 */            this.f11130v = false;
/* 28 */            this.f11131w = new C1666s6(9);
/* 30 */            this.f11123a = sentryAndroidOptions;
/* 32 */            this.f11124b = u93Var;
/* 39 */            this.f11125c = new ConcurrentLinkedQueue();
/* 41 */            this.f11126d = c1461g5;
                }

                @Override // io.sentry.logger.InterfaceC1542b
                /* JADX INFO: renamed from: a */
                public void mo4871a(boolean z) {
/* 2 */             this.f11130v = true;
/* 4 */             if (z) {
/* 6 */                 m5348g(true, true);
/* 17 */                this.f11126d.submit(new RunnableC1544d(this, 0));
                    } else {
/* 29 */                this.f11126d.mo4713a(this.f11123a.getShutdownTimeoutMillis());
/* 38 */                while (!this.f11125c.isEmpty()) {
/* 40 */                    m5347e();
                        }
                    }
                }

                @Override // io.sentry.logger.InterfaceC1542b
                /* JADX INFO: renamed from: b */
                public final void mo5345b(long j) {
/* 2 */             m5348g(true, true);
                    try {
/* 17 */                ((C1691q) this.f11131w.f11662b).tryAcquireSharedNanos(1, TimeUnit.MILLISECONDS.toNanos(j));
                    } catch (InterruptedException e) {
/* 32 */                this.f11123a.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to flush log events", e);
/* 39 */                Thread.currentThread().interrupt();
                    }
                }

                @Override // io.sentry.logger.InterfaceC1542b
                /* JADX INFO: renamed from: d */
                public final void mo5346d(C1575o5 c1575o5) {
/* 3 */             if (this.f11130v) {
/* 5 */                 return;
                    }
/* 18 */            if (C1691q.m5429a((C1691q) this.f11131w.f11662b) < 1000) {
/* 67 */                C1691q.m5430b((C1691q) this.f11131w.f11662b);
/* 72 */                this.f11125c.offer(c1575o5);
/* 76 */                m5348g(false, false);
                    } else {
/* 22 */                InterfaceC1416f clientReportRecorder = this.f11123a.getClientReportRecorder();
/* 26 */                EnumC1414d enumC1414d = EnumC1414d.QUEUE_OVERFLOW;
/* 30 */                clientReportRecorder.mo5158a(enumC1414d, EnumC1560n.LogItem);
/* 57 */                this.f11123a.getClientReportRecorder().mo5160e(enumC1414d, EnumC1560n.LogByte, AbstractC1706e.m5469a(this.f11123a.getSerializer(), this.f11123a.getLogger(), c1575o5));
                    }
                }

                /* JADX INFO: renamed from: e */
                public final void m5347e() {
/* 5 */             ArrayList arrayList = new ArrayList(100);
/* 31 */            do {
/* 8 */                 ConcurrentLinkedQueue concurrentLinkedQueue = this.f11125c;
/* 14 */                C1575o5 c1575o5 = (C1575o5) concurrentLinkedQueue.poll();
/* 16 */                if (c1575o5 != null) {
/* 18 */                    arrayList.add(c1575o5);
                        }
/* 25 */                if (concurrentLinkedQueue.isEmpty()) {
                            break;
                        }
/* 31 */            } while (arrayList.size() < 100);
/* 37 */            if (arrayList.isEmpty()) {
/* 98 */                return;
                    }
/* 41 */            C1583p5 c1583p5 = new C1583p5(arrayList);
/* 44 */            u93 u93Var = this.f11124b;
/* 46 */            u93Var.getClass();
                    try {
/* 55 */                u93Var.m8995y(u93Var.m8987p(c1583p5), null);
                    } catch (IOException e) {
/* 74 */                ((SentryAndroidOptions) u93Var.f17429b).getLogger().mo4670b(EnumC1553m5.WARNING, e, "Capturing logs failed.", new Object[0]);
                    }
/* 81 */            for (int i = 0; i < arrayList.size(); i++) {
/* 87 */                C1691q c1691q = (C1691q) this.f11131w.f11662b;
/* 89 */                int i2 = C1691q.f11714a;
/* 92 */                c1691q.releaseShared(1);
                    }
                }

                /* JADX INFO: renamed from: g */
                public final void m5348g(boolean z, boolean z2) {
/* 3 */             if (!this.f11129i || z) {
/* 8 */                 C1702a c1702a = this.f11128f;
/* 10 */                c1702a.m5443c();
                        try {
/* 13 */                    Future future = this.f11127e;
/* 15 */                    if (z || future == null || future.isDone() || future.isCancelled()) {
/* 35 */                        this.f11129i = true;
                                try {
/* 57 */                            this.f11127e = this.f11126d.mo4714b(new RunnableC1526k2(this, 7), z2 ? 0 : 5000);
                                } catch (RejectedExecutionException e) {
/* 61 */                            this.f11129i = false;
/* 73 */                            this.f11123a.getLogger().mo4671d(EnumC1553m5.WARNING, "Logs batch processor flush task rejected", e);
                                }
                            }
/* 76 */                    c1702a.close();
                        } catch (Throwable th) {
                            try {
/* 80 */                        c1702a.close();
                            } catch (Throwable th2) {
/* 85 */                        th.addSuppressed(th2);
                            }
/* 88 */                    throw th;
                        }
                    }
                }
            }
