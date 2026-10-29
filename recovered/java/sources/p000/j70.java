            package p000;

            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.TimeUnit;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class j70 implements n70 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f12124a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ m70 f12125b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Runnable f12126c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ long f12127d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ long f12128e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ TimeUnit f12129f;

                public /* synthetic */ j70(m70 m70Var, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i) {
/* 1 */             this.f12124a = i;
/* 3 */             this.f12125b = m70Var;
/* 5 */             this.f12126c = runnable;
/* 7 */             this.f12127d = j;
/* 9 */             this.f12128e = j2;
/* 11 */            this.f12129f = timeUnit;
                }

                @Override // p000.n70
                /* JADX INFO: renamed from: a */
                public final ScheduledFuture mo4121a(gr0 gr0Var) {
/* 1 */             int i = this.f12124a;
/* 3 */             Runnable runnable = this.f12126c;
/* 5 */             m70 m70Var = this.f12125b;
                    switch (i) {
                        case 0:
/* 44 */                    return m70Var.f13640b.scheduleAtFixedRate(new k70(m70Var, runnable, gr0Var, 0), this.f12127d, this.f12128e, this.f12129f);
                        default:
/* 24 */                    return m70Var.f13640b.scheduleWithFixedDelay(new k70(m70Var, runnable, gr0Var, 2), this.f12127d, this.f12128e, this.f12129f);
                    }
                }
            }
