            package p000;

            import android.view.View;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class tv2 implements e43 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ wv2 f17291a;

                public tv2(wv2 wv2Var) {
/* 4 */             this.f17291a = wv2Var;
                }

                @Override // p000.e43
                /* JADX INFO: renamed from: b */
                public final void mo3182b(float f, int i) {
                }

                @Override // p000.e43
                /* JADX INFO: renamed from: c */
                public final void mo3183c(int i) {
                }

                @Override // p000.e43
                /* JADX INFO: renamed from: d */
                public final void mo3184d(int i) {
/* 1 */             wv2 wv2Var = this.f17291a;
/* 21 */            View viewFindViewWithTag = wv2Var.getUcContentViewPager().findViewWithTag("page_" + i);
/* 25 */            if (viewFindViewWithTag != null) {
/* 27 */                viewFindViewWithTag.requestFocus();
                    }
/* 34 */            wv2Var.f18842k0 = Integer.valueOf(i);
                }
            }
