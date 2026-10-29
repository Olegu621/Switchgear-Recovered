            package io.sentry;

            import io.sentry.hints.InterfaceC1476d;
            import io.sentry.hints.InterfaceC1478f;
            import io.sentry.hints.InterfaceC1480h;
            import io.sentry.hints.InterfaceC1483k;
            import java.util.Queue;
            import java.util.concurrent.CountDownLatch;
            import java.util.concurrent.TimeUnit;
            
            /* JADX INFO: renamed from: io.sentry.v */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1721v implements InterfaceC1476d, InterfaceC1480h, InterfaceC1483k, InterfaceC1478f {

                /* JADX INFO: renamed from: a */
                public boolean f11749a = false;

                /* JADX INFO: renamed from: b */
                public boolean f11750b = false;

                /* JADX INFO: renamed from: c */
                public final CountDownLatch f11751c = new CountDownLatch(1);

                /* JADX INFO: renamed from: d */
                public final long f11752d;

                /* JADX INFO: renamed from: e */
                public final ILogger f11753e;

                /* JADX INFO: renamed from: f */
                public final String f11754f;

                /* JADX INFO: renamed from: i */
                public final Queue f11755i;

                public C1721v(long j, ILogger iLogger, String str, C1463g7 c1463g7) {
/* 9 */             this.f11752d = j;
/* 11 */            this.f11754f = str;
/* 13 */            this.f11755i = c1463g7;
/* 23 */            this.f11753e = iLogger;
                }

                @Override // io.sentry.hints.InterfaceC1480h
                /* JADX INFO: renamed from: a */
                public final boolean mo4952a() {
/* 1 */             return this.f11749a;
                }

                @Override // io.sentry.hints.InterfaceC1483k
                /* JADX INFO: renamed from: b */
                public final void mo4953b(boolean z) {
/* 1 */             this.f11750b = z;
/* 5 */             this.f11751c.countDown();
                }

                @Override // io.sentry.hints.InterfaceC1480h
                /* JADX INFO: renamed from: c */
                public final void mo4954c(boolean z) {
/* 1 */             this.f11749a = z;
                }

                @Override // io.sentry.hints.InterfaceC1478f
                /* JADX INFO: renamed from: d */
                public final boolean mo4955d() {
                    try {
/* 7 */                 return this.f11751c.await(this.f11752d, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException e) {
/* 17 */                Thread.currentThread().interrupt();
/* 26 */                this.f11753e.mo4671d(EnumC1553m5.ERROR, "Exception while awaiting on lock.", e);
/* 29 */                return false;
                    }
                }

                @Override // io.sentry.hints.InterfaceC1483k
                /* JADX INFO: renamed from: e */
                public final boolean mo4956e() {
/* 1 */             return this.f11750b;
                }
            }
