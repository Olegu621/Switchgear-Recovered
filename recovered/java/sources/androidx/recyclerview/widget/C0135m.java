            package androidx.recyclerview.widget;

            import java.util.ArrayList;
            import java.util.WeakHashMap;
            import p000.C2093q3;
            import p000.e33;
            import p000.f12;
            import p000.j12;
            
            /* JADX INFO: renamed from: androidx.recyclerview.widget.m */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0135m extends j12 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ RecyclerView f1776a;

                public C0135m(RecyclerView recyclerView) {
/* 4 */             this.f1776a = recyclerView;
                }

                @Override // p000.j12
                /* JADX INFO: renamed from: a */
                public final void mo1015a() {
/* 2 */             RecyclerView recyclerView = this.f1776a;
/* 4 */             recyclerView.m884i(null);
/* 10 */            recyclerView.f1624R0.f19442f = true;
/* 12 */            recyclerView.m869W(true);
/* 21 */            if (recyclerView.f1645d.m7687h()) {
/* 26 */                return;
                    }
/* 23 */            recyclerView.requestLayout();
                }

                @Override // p000.j12
                /* JADX INFO: renamed from: b */
                public final void mo1016b(int i) {
/* 2 */             RecyclerView recyclerView = this.f1776a;
/* 4 */             recyclerView.m884i(null);
/* 7 */             C2093q3 c2093q3 = recyclerView.f1645d;
/* 11 */            ArrayList arrayList = (ArrayList) c2093q3.f15371c;
/* 19 */            arrayList.add(c2093q3.m7688i(4, i, 1));
/* 25 */            c2093q3.f15369a |= 4;
/* 31 */            if (arrayList.size() == 1) {
/* 33 */                int[] iArr = RecyclerView.f1604k1;
/* 37 */                if (!recyclerView.f1654g0 || !recyclerView.f1652f0) {
/* 51 */                    recyclerView.f1666n0 = true;
/* 53 */                    recyclerView.requestLayout();
                        } else {
/* 43 */                    f12 f12Var = recyclerView.f1674v;
/* 45 */                    WeakHashMap weakHashMap = e33.f7494a;
/* 47 */                    recyclerView.postOnAnimation(f12Var);
                        }
                    }
                }
            }
