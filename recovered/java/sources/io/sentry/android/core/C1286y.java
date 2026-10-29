            package io.sentry.android.core;

            import io.sentry.hints.InterfaceC1473a;
            import io.sentry.hints.InterfaceC1484l;
            
            /* JADX INFO: renamed from: io.sentry.android.core.y */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1286y implements InterfaceC1473a, InterfaceC1484l {

                /* JADX INFO: renamed from: a */
                public final boolean f10389a;

                public C1286y(boolean z) {
/* 4 */             this.f10389a = z;
                }

                @Override // io.sentry.hints.InterfaceC1473a
                /* JADX INFO: renamed from: b */
                public final Long mo4960b() {
/* 1 */             return null;
                }

                @Override // io.sentry.hints.InterfaceC1473a
                /* JADX INFO: renamed from: c */
                public final boolean mo4961c() {
/* 1 */             return true;
                }

                @Override // io.sentry.hints.InterfaceC1473a
                /* JADX INFO: renamed from: e */
                public final String mo4962e() {
                    return this.f10389a ? "anr_background" : "anr_foreground";
                }
            }
