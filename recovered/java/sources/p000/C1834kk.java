            package p000;

            import com.google.android.material.bottomappbar.BottomAppBar;
            import com.google.android.material.floatingactionbutton.FloatingActionButton;
            
            /* JADX INFO: renamed from: kk */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1834kk extends he3 {

                /* JADX INFO: renamed from: r */
                public final /* synthetic */ int f12832r;

                /* JADX INFO: renamed from: s */
                public final /* synthetic */ BottomAppBar f12833s;

                public C1834kk(BottomAppBar bottomAppBar, int i) {
/* 4 */             this.f12833s = bottomAppBar;
/* 6 */             this.f12832r = i;
                }

                @Override // p000.he3
                /* JADX INFO: renamed from: k */
                public final void mo4204k(FloatingActionButton floatingActionButton) {
/* 1 */             int i = BottomAppBar.f4449b1;
/* 11 */            floatingActionButton.setTranslationX(this.f12833s.m2245D(this.f12832r));
/* 20 */            floatingActionButton.m2338l(new C1796jk(), true);
                }
            }
