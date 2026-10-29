            package io.sentry.backpressure;

            import io.sentry.C1469h4;
            import io.sentry.EnumC1553m5;
            import io.sentry.InterfaceC1457g1;
            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.util.C1702a;
            import java.util.concurrent.Future;
            import java.util.concurrent.RejectedExecutionException;
            
            /* JADX INFO: renamed from: io.sentry.backpressure.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class RunnableC1384a implements InterfaceC1385b, Runnable {

                /* JADX INFO: renamed from: a */
                public final SentryAndroidOptions f10764a;

                /* JADX INFO: renamed from: b */
                public final C1469h4 f10765b;

                /* JADX INFO: renamed from: c */
                public int f10766c;

                /* JADX INFO: renamed from: d */
                public volatile Future f10767d;

                /* JADX INFO: renamed from: e */
                public final C1702a f10768e;

                public RunnableC1384a(SentryAndroidOptions sentryAndroidOptions) {
/* 1 */             C1469h4 c1469h4 = C1469h4.f10976a;
/* 7 */             this.f10766c = 0;
/* 10 */            this.f10767d = null;
/* 17 */            this.f10768e = new C1702a();
/* 19 */            this.f10764a = sentryAndroidOptions;
/* 21 */            this.f10765b = c1469h4;
                }

                @Override // io.sentry.backpressure.InterfaceC1385b
                /* JADX INFO: renamed from: a */
                public final int mo5071a() {
/* 1 */             return this.f10766c;
                }

                /* JADX INFO: renamed from: b */
                public final void m5072b(int i) {
/* 3 */             InterfaceC1457g1 executorService = this.f10764a.getExecutorService();
/* 11 */            if (executorService.isClosed()) {
/* 55 */                return;
                    }
/* 13 */            C1702a c1702a = this.f10768e;
/* 15 */            c1702a.m5443c();
                    try {
                        try {
/* 23 */                    this.f10767d = executorService.mo4714b(this, i);
                        } catch (RejectedExecutionException e) {
/* 39 */                    this.f10764a.getLogger().mo4671d(EnumC1553m5.WARNING, "Backpressure monitor reschedule task rejected", e);
                        }
/* 42 */                c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 46 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 51 */                    th.addSuppressed(th2);
                        }
/* 54 */                throw th;
                    }
                }

                @Override // io.sentry.backpressure.InterfaceC1385b
                public final void close() {
/* 1 */             Future future = this.f10767d;
/* 3 */             if (future != null) {
/* 5 */                 C1702a c1702a = this.f10768e;
/* 7 */                 c1702a.m5443c();
                        try {
/* 11 */                    future.cancel(true);
/* 14 */                    c1702a.close();
                        } catch (Throwable th) {
                            try {
/* 19 */                        c1702a.close();
                            } catch (Throwable th2) {
/* 24 */                        th.addSuppressed(th2);
                            }
/* 27 */                    throw th;
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 3 */             boolean zMo5085e = this.f10765b.mo5085e();
/* 7 */             int i = this.f10766c;
/* 9 */             SentryAndroidOptions sentryAndroidOptions = this.f10764a;
/* 11 */            if (zMo5085e) {
/* 14 */                if (i > 0) {
/* 26 */                    sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Health check positive, reverting to normal sampling.", new Object[0]);
                        }
/* 29 */                this.f10766c = 0;
                    } else if (i < 10) {
/* 38 */                this.f10766c = i + 1;
/* 58 */                sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Health check negative, downsampling with a factor of %d", Integer.valueOf(this.f10766c));
                    }
/* 63 */            m5072b(10000);
                }

                @Override // io.sentry.backpressure.InterfaceC1385b
                public final void start() {
/* 3 */             m5072b(500);
                }
            }
