            package io.sentry.android.core;

            import io.sentry.ILogger;
            import io.sentry.hints.AbstractC1475c;
            import io.sentry.hints.InterfaceC1474b;
            import io.sentry.hints.InterfaceC1479g;
            import io.sentry.protocol.C1626w;
            
            /* JADX INFO: renamed from: io.sentry.android.core.x1 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1285x1 extends AbstractC1475c implements InterfaceC1474b, InterfaceC1479g {

                /* JADX INFO: renamed from: d */
                public final long f10387d;

                /* JADX INFO: renamed from: e */
                public final boolean f10388e;

                public C1285x1(long j, ILogger iLogger, long j2, boolean z) {
/* 1 */             super(j, iLogger);
/* 4 */             this.f10387d = j2;
/* 6 */             this.f10388e = z;
                }

                @Override // io.sentry.hints.InterfaceC1474b
                /* JADX INFO: renamed from: a */
                public final boolean mo4957a() {
/* 1 */             return this.f10388e;
                }

                @Override // io.sentry.hints.AbstractC1475c
                /* JADX INFO: renamed from: f */
                public final boolean mo4958f(C1626w c1626w) {
/* 1 */             return true;
                }

                @Override // io.sentry.hints.AbstractC1475c
                /* JADX INFO: renamed from: g */
                public final void mo4959g(C1626w c1626w) {
                }
            }
