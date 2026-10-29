            package io.sentry.android.core;

            import io.sentry.EnumC1553m5;
            import io.sentry.ILogger;
            import io.sentry.hints.InterfaceC1476d;
            import io.sentry.hints.InterfaceC1478f;
            import io.sentry.hints.InterfaceC1480h;
            import io.sentry.hints.InterfaceC1483k;
            import io.sentry.util.AbstractC1704c;
            import java.util.concurrent.CountDownLatch;
            import java.util.concurrent.TimeUnit;
            
            /* JADX INFO: renamed from: io.sentry.android.core.v0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1278v0 implements InterfaceC1476d, InterfaceC1480h, InterfaceC1483k, InterfaceC1478f {

                /* JADX INFO: renamed from: d */
                public final long f10372d;

                /* JADX INFO: renamed from: e */
                public final ILogger f10373e;

                /* JADX INFO: renamed from: c */
                public CountDownLatch f10371c = new CountDownLatch(1);

                /* JADX INFO: renamed from: a */
                public boolean f10369a = false;

                /* JADX INFO: renamed from: b */
                public boolean f10370b = false;

                public C1278v0(long j, ILogger iLogger) {
/* 17 */            this.f10372d = j;
/* 21 */            AbstractC1704c.m5462q(iLogger, "ILogger is required.");
/* 24 */            this.f10373e = iLogger;
                }

                @Override // io.sentry.hints.InterfaceC1480h
                /* JADX INFO: renamed from: a */
                public final boolean mo4952a() {
/* 1 */             return this.f10369a;
                }

                @Override // io.sentry.hints.InterfaceC1483k
                /* JADX INFO: renamed from: b */
                public final void mo4953b(boolean z) {
/* 1 */             this.f10370b = z;
/* 5 */             this.f10371c.countDown();
                }

                @Override // io.sentry.hints.InterfaceC1480h
                /* JADX INFO: renamed from: c */
                public final void mo4954c(boolean z) {
/* 1 */             this.f10369a = z;
                }

                @Override // io.sentry.hints.InterfaceC1478f
                /* JADX INFO: renamed from: d */
                public final boolean mo4955d() {
                    try {
/* 7 */                 return this.f10371c.await(this.f10372d, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException e) {
/* 17 */                Thread.currentThread().interrupt();
/* 26 */                this.f10373e.mo4671d(EnumC1553m5.ERROR, "Exception while awaiting on lock.", e);
/* 29 */                return false;
                    }
                }

                @Override // io.sentry.hints.InterfaceC1483k
                /* JADX INFO: renamed from: e */
                public final boolean mo4956e() {
/* 1 */             return this.f10370b;
                }
            }
