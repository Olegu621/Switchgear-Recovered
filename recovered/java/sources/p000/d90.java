            package p000;

            import java.util.concurrent.ScheduledFuture;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class d90 implements e90 {

                /* JADX INFO: renamed from: a */
                public final ScheduledFuture f7064a;

                public d90(ScheduledFuture scheduledFuture) {
/* 4 */             this.f7064a = scheduledFuture;
                }

                @Override // p000.e90
                public final void dispose() {
/* 4 */             this.f7064a.cancel(false);
                }

                public final String toString() {
/* 18 */            return "DisposableFutureHandle[" + this.f7064a + ']';
                }
            }
