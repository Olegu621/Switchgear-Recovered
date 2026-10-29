            package p000;

            import android.graphics.Rect;
            import android.os.Bundle;
            import android.view.View;
            import androidx.recyclerview.widget.C0134l;
            import androidx.recyclerview.widget.LinearLayoutManager;
            import androidx.recyclerview.widget.RecyclerView;
            import androidx.viewpager2.widget.ViewPager2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class i43 extends LinearLayoutManager {

                /* JADX INFO: renamed from: p0 */
                public final /* synthetic */ ViewPager2 f9444p0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public i43(ViewPager2 viewPager2) {
/* 4 */             super(1);
/* 1 */             this.f9444p0 = viewPager2;
                }

                @Override // androidx.recyclerview.widget.LinearLayoutManager
                /* JADX INFO: renamed from: L0 */
                public final void mo802L0(y12 y12Var, int[] iArr) {
/* 1 */             ViewPager2 viewPager2 = this.f9444p0;
/* 3 */             int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
/* 8 */             if (offscreenPageLimit == -1) {
/* 10 */                super.mo802L0(y12Var, iArr);
/* 13 */                return;
                    }
/* 18 */            int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
/* 20 */            iArr[0] = pageSize;
/* 23 */            iArr[1] = pageSize;
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: c0 */
                public final void mo992c0(C0134l c0134l, y12 y12Var, C0901f1 c0901f1) {
/* 1 */             super.mo992c0(c0134l, y12Var, c0901f1);
/* 8 */             this.f9444p0.f2023h0.getClass();
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: q0 */
                public final boolean mo997q0(C0134l c0134l, y12 y12Var, int i, Bundle bundle) {
/* 5 */             this.f9444p0.f2023h0.getClass();
/* 8 */             return super.mo997q0(c0134l, y12Var, i, bundle);
                }

                @Override // androidx.recyclerview.widget.AbstractC0133k
                /* JADX INFO: renamed from: v0 */
                public final boolean mo1002v0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
/* 1 */             return false;
                }
            }
