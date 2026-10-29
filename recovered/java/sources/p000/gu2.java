            package p000;

            import android.view.View;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class gu2 implements View.OnClickListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f8822a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ iu2 f8823b;

                public /* synthetic */ gu2(iu2 iu2Var, int i) {
/* 1 */             this.f8822a = i;
/* 3 */             this.f8823b = iu2Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws Exception {
/* 1 */             int i = this.f8822a;
/* 3 */             iu2 iu2Var = this.f8823b;
                    switch (i) {
                        case 0:
/* 18 */                    ((v11) iu2Var.f11931h0.f15956b).invoke();
                            break;
                        default:
/* 8 */                     iu2Var.m5557m();
                            break;
                    }
                }
            }
