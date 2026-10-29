            package io.sentry;

            import io.sentry.hints.AbstractC1475c;
            import io.sentry.hints.InterfaceC1481i;
            import io.sentry.hints.InterfaceC1484l;
            import io.sentry.protocol.C1626w;
            import java.util.concurrent.atomic.AtomicReference;
            
            /* JADX INFO: renamed from: io.sentry.l7 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1540l7 extends AbstractC1475c implements InterfaceC1481i, InterfaceC1484l {

                /* JADX INFO: renamed from: d */
                public final AtomicReference f11120d;

                public C1540l7(long j, ILogger iLogger) {
/* 1 */             super(j, iLogger);
/* 9 */             this.f11120d = new AtomicReference();
                }

                @Override // io.sentry.hints.AbstractC1475c
                /* JADX INFO: renamed from: f */
                public final boolean mo4958f(C1626w c1626w) {
/* 7 */             C1626w c1626w2 = (C1626w) this.f11120d.get();
                    return c1626w2 != null && c1626w2.equals(c1626w);
                }

                @Override // io.sentry.hints.AbstractC1475c
                /* JADX INFO: renamed from: g */
                public final void mo4959g(C1626w c1626w) {
/* 3 */             this.f11120d.set(c1626w);
                }
            }
