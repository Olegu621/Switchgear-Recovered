            package p000;

            import android.view.View;
            import androidx.transition.Transition;
            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class nn0 implements ir2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ View f14387a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ArrayList f14388b;

                public nn0(View view, ArrayList arrayList) {
/* 4 */             this.f14387a = view;
/* 6 */             this.f14388b = arrayList;
                }

                @Override // p000.ir2
                /* JADX INFO: renamed from: a */
                public final void mo86a(Transition transition) {
/* 1 */             transition.m1104v(this);
/* 4 */             transition.m1090a(this);
                }

                @Override // p000.ir2
                /* JADX INFO: renamed from: b */
                public final void mo87b(Transition transition) {
                }

                @Override // p000.ir2
                /* JADX INFO: renamed from: c */
                public final void mo88c(Transition transition) {
/* 1 */             transition.m1104v(this);
/* 8 */             this.f14387a.setVisibility(8);
/* 11 */            ArrayList arrayList = this.f14388b;
/* 13 */            int size = arrayList.size();
/* 19 */            for (int i = 0; i < size; i++) {
/* 27 */                ((View) arrayList.get(i)).setVisibility(0);
                    }
                }

                @Override // p000.ir2
                /* JADX INFO: renamed from: d */
                public final void mo89d(Transition transition) {
                }

                @Override // p000.ir2
                /* JADX INFO: renamed from: e */
                public final void mo90e(Transition transition) {
                }
            }
