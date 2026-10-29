            package p000;

            import android.os.Bundle;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class x20 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f18913a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Bundle f18914b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ d30 f18915c;

                public /* synthetic */ x20(d30 d30Var, Bundle bundle, int i) {
/* 1 */             this.f18913a = i;
/* 3 */             this.f18915c = d30Var;
/* 5 */             this.f18914b = bundle;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f18913a;
/* 3 */             Bundle bundle = this.f18914b;
/* 5 */             d30 d30Var = this.f18915c;
                    switch (i) {
                        case 0:
/* 18 */                    d30Var.f6966b.onUnminimized(bundle);
                            break;
                        default:
/* 12 */                    d30Var.f6966b.onWarmupCompleted(bundle);
                            break;
                    }
                }
            }
