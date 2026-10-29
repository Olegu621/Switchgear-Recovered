            package io.sentry;

            import java.util.concurrent.Future;
            import java.util.concurrent.FutureTask;
            
            /* JADX INFO: renamed from: io.sentry.a3 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1158a3 implements InterfaceC1457g1 {

                /* JADX INFO: renamed from: a */
                public static final C1158a3 f9797a = new C1158a3();

                @Override // io.sentry.InterfaceC1457g1
                /* JADX INFO: renamed from: a */
                public final void mo4713a(long j) {
                }

                @Override // io.sentry.InterfaceC1457g1
                /* JADX INFO: renamed from: b */
                public final Future mo4714b(Runnable runnable, long j) {
/* 9 */             return new FutureTask(new CallableC1515j0(1));
                }

                @Override // io.sentry.InterfaceC1457g1
                public final boolean isClosed() {
/* 1 */             return false;
                }

                @Override // io.sentry.InterfaceC1457g1
                public final Future submit(Runnable runnable) {
/* 9 */             return new FutureTask(new CallableC1515j0(1));
                }
            }
