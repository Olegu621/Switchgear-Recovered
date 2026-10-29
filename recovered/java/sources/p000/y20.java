            package p000;

            import android.os.Bundle;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class y20 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f19453a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f19454b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Bundle f19455c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ d30 f19456d;

                public /* synthetic */ y20(d30 d30Var, String str, Bundle bundle, int i) {
/* 1 */             this.f19453a = i;
/* 3 */             this.f19456d = d30Var;
/* 5 */             this.f19454b = str;
/* 7 */             this.f19455c = bundle;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f19453a;
/* 3 */             Bundle bundle = this.f19455c;
/* 5 */             String str = this.f19454b;
/* 7 */             d30 d30Var = this.f19456d;
                    switch (i) {
                        case 0:
/* 20 */                    d30Var.f6966b.extraCallback(str, bundle);
                            break;
                        default:
/* 14 */                    d30Var.f6966b.onPostMessage(str, bundle);
                            break;
                    }
                }
            }
