            package p000;

            import android.view.ViewGroup;
            import androidx.transition.Transition;
            
            /* JADX INFO: renamed from: ps */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2081ps extends jr2 {

                /* JADX INFO: renamed from: a */
                public boolean f15269a = false;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ViewGroup f15270b;

                public C2081ps(ViewGroup viewGroup) {
/* 4 */             this.f15270b = viewGroup;
                }

                @Override // p000.jr2, p000.ir2
                /* JADX INFO: renamed from: b */
                public final void mo87b(Transition transition) {
/* 4 */             py0.m7612u0(this.f15270b, false);
                }

                @Override // p000.ir2
                /* JADX INFO: renamed from: c */
                public final void mo88c(Transition transition) {
/* 3 */             if (!this.f15269a) {
/* 8 */                 py0.m7612u0(this.f15270b, false);
                    }
/* 11 */            transition.m1104v(this);
                }

                @Override // p000.jr2, p000.ir2
                /* JADX INFO: renamed from: d */
                public final void mo89d(Transition transition) {
/* 4 */             py0.m7612u0(this.f15270b, false);
/* 8 */             this.f15269a = true;
                }

                @Override // p000.jr2, p000.ir2
                /* JADX INFO: renamed from: e */
                public final void mo90e(Transition transition) {
/* 4 */             py0.m7612u0(this.f15270b, true);
                }
            }
