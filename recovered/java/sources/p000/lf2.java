            package p000;

            import androidx.recyclerview.widget.RecyclerView;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class lf2 extends r12 {

                /* JADX INFO: renamed from: a */
                public boolean f13228a = false;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ br1 f13229b;

                public lf2(br1 br1Var) {
/* 4 */             this.f13229b = br1Var;
                }

                @Override // p000.r12
                /* JADX INFO: renamed from: a */
                public final void mo2309a(RecyclerView recyclerView, int i) {
/* 1 */             if (i == 0 && this.f13228a) {
/* 8 */                 this.f13228a = false;
/* 12 */                this.f13229b.m1420h();
                    }
                }

                @Override // p000.r12
                /* JADX INFO: renamed from: b */
                public final void mo2310b(RecyclerView recyclerView, int i, int i2) {
/* 1 */             if (i == 0 && i2 == 0) {
/* 6 */                 return;
                    }
/* 8 */             this.f13228a = true;
                }
            }
