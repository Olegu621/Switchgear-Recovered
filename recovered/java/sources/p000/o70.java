            package p000;

            import java.util.concurrent.Delayed;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.TimeUnit;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class o70 extends AbstractC1873l0 implements ScheduledFuture {

                /* JADX INFO: renamed from: v */
                public final ScheduledFuture f14656v;

                public o70(n70 n70Var) {
/* 13 */            this.f14656v = n70Var.mo4121a(new gr0(this));
                }

                @Override // p000.AbstractC1873l0
                /* JADX INFO: renamed from: c */
                public final void mo6324c() {
/* 1 */             ScheduledFuture scheduledFuture = this.f14656v;
/* 3 */             Object obj = this.f13064a;
/* 18 */            scheduledFuture.cancel((obj instanceof C0863e0) && ((C0863e0) obj).f7460a);
                }

                @Override // java.lang.Comparable
                public final int compareTo(Delayed delayed) {
/* 5 */             return this.f14656v.compareTo(delayed);
                }

                @Override // java.util.concurrent.Delayed
                public final long getDelay(TimeUnit timeUnit) {
/* 3 */             return this.f14656v.getDelay(timeUnit);
                }
            }
