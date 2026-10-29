            package io.sentry.hints;

            import io.sentry.EnumC1553m5;
            import io.sentry.ILogger;
            import io.sentry.protocol.C1626w;
            import java.util.concurrent.CountDownLatch;
            import java.util.concurrent.TimeUnit;
            
            /* JADX INFO: renamed from: io.sentry.hints.c */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC1475c implements InterfaceC1478f {

                /* JADX INFO: renamed from: a */
                public final CountDownLatch f10996a = new CountDownLatch(1);

                /* JADX INFO: renamed from: b */
                public final long f10997b;

                /* JADX INFO: renamed from: c */
                public final ILogger f10998c;

                public AbstractC1475c(long j, ILogger iLogger) {
/* 4 */             this.f10997b = j;
/* 14 */            this.f10998c = iLogger;
                }

                @Override // io.sentry.hints.InterfaceC1478f
                /* JADX INFO: renamed from: d */
                public final boolean mo4955d() {
                    try {
/* 7 */                 return this.f10996a.await(this.f10997b, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException e) {
/* 17 */                Thread.currentThread().interrupt();
/* 26 */                this.f10998c.mo4671d(EnumC1553m5.ERROR, "Exception while awaiting for flush in BlockingFlushHint", e);
/* 29 */                return false;
                    }
                }

                /* JADX INFO: renamed from: f */
                public abstract boolean mo4958f(C1626w c1626w);

                /* JADX INFO: renamed from: g */
                public abstract void mo4959g(C1626w c1626w);
            }
