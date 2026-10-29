            package p000;

            import android.os.Bundle;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class m30 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f13550a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ fe0 f13551b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ boolean f13552c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Bundle f13553d;

                public /* synthetic */ m30(fe0 fe0Var, boolean z, Bundle bundle, int i) {
/* 1 */             this.f13550a = i;
/* 3 */             this.f13551b = fe0Var;
/* 5 */             this.f13552c = z;
/* 7 */             this.f13553d = bundle;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f13550a;
/* 3 */             Bundle bundle = this.f13553d;
/* 5 */             boolean z = this.f13552c;
/* 7 */             fe0 fe0Var = this.f13551b;
                    switch (i) {
                        case 0:
/* 16 */                    fe0Var.onSessionEnded(z, bundle);
                            break;
                        default:
/* 12 */                    fe0Var.onVerticalScrollEvent(z, bundle);
                            break;
                    }
                }
            }
