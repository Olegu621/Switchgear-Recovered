            package p000;

            import android.view.View;
            import android.view.ViewGroup;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ye2 extends de3 {

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ int f19589h;

                public /* synthetic */ ye2(int i) {
/* 1 */             this.f19589h = i;
                }

                @Override // p000.ze2
                /* JADX INFO: renamed from: a */
                public final float mo9789a(ViewGroup viewGroup, View view) {
                    switch (this.f19589h) {
                        case 0:
/* 26 */                    return view.getTranslationY() - viewGroup.getHeight();
                        default:
/* 15 */                    return view.getTranslationY() + viewGroup.getHeight();
                    }
                }
            }
