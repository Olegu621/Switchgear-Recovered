            package io.sentry;

            import java.time.Instant;
            
            /* JADX INFO: renamed from: io.sentry.i5 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1491i5 extends AbstractC1672t4 {

                /* JADX INFO: renamed from: a */
                public final Instant f11013a = Instant.now();

                @Override // io.sentry.AbstractC1672t4
                /* JADX INFO: renamed from: d */
                public final long mo5278d() {
/* 18 */            return (this.f11013a.getEpochSecond() * 1000000000) + ((long) this.f11013a.getNano());
                }
            }
