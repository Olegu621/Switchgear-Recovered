            package p000;

            import android.widget.AutoCompleteTextView;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class va0 implements AutoCompleteTextView.OnDismissListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ za0 f17946a;

                public va0(za0 za0Var) {
/* 4 */             this.f17946a = za0Var;
                }

                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
/* 2 */             za0 za0Var = this.f17946a;
/* 4 */             za0Var.f20026l = true;
/* 10 */            za0Var.f20028n = System.currentTimeMillis();
/* 13 */            za0Var.m10298i(false);
                }
            }
