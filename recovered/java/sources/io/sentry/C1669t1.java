            package io.sentry;
            
            /* JADX INFO: renamed from: io.sentry.t1 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1669t1 implements InterfaceC1750y0 {

                /* JADX INFO: renamed from: a */
                public final Runtime f11665a = Runtime.getRuntime();

                @Override // io.sentry.InterfaceC1750y0
                /* JADX INFO: renamed from: a */
                public final void mo4805a(C1536l3 c1536l3) {
/* 1 */             Runtime runtime = this.f11665a;
/* 16 */            c1536l3.f11117b = Long.valueOf(runtime.totalMemory() - runtime.freeMemory());
                }

                @Override // io.sentry.InterfaceC1750y0
                /* JADX INFO: renamed from: c */
                public final void mo4807c() {
                }
            }
