            package p000;

            import android.os.Bundle;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class z20 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f19908a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Bundle f19909b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ d30 f19910c;

                public /* synthetic */ z20(d30 d30Var, Bundle bundle, int i) {
/* 1 */             this.f19908a = i;
/* 3 */             this.f19910c = d30Var;
/* 5 */             this.f19909b = bundle;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f19908a;
/* 3 */             Bundle bundle = this.f19909b;
/* 5 */             d30 d30Var = this.f19910c;
                    switch (i) {
                        case 0:
/* 18 */                    d30Var.f6966b.onMessageChannelReady(bundle);
                            break;
                        default:
/* 12 */                    d30Var.f6966b.onMinimized(bundle);
                            break;
                    }
                }
            }
