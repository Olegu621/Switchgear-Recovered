            package p000;

            import androidx.appcompat.widget.SearchView;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class e82 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7574a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ SearchView f7575b;

                public /* synthetic */ e82(SearchView searchView, int i) {
/* 1 */             this.f7574a = i;
/* 3 */             this.f7575b = searchView;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f7574a;
/* 3 */             SearchView searchView = this.f7575b;
                    switch (i) {
                        case 0:
/* 19 */                    searchView.m385s();
                            break;
                        default:
/* 8 */                     s20 s20Var = searchView.f597C0;
/* 12 */                    if (s20Var instanceof ni2) {
/* 15 */                        s20Var.mo6987b(null);
                            }
                            break;
                    }
                }
            }
