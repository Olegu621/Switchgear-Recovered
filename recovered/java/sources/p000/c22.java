            package p000;

            import android.os.Bundle;
            import android.view.View;
            import android.view.accessibility.AccessibilityEvent;
            import androidx.recyclerview.widget.AbstractC0133k;
            import androidx.recyclerview.widget.RecyclerView;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class c22 extends C2201t0 {

                /* JADX INFO: renamed from: d */
                public final RecyclerView f2664d;

                /* JADX INFO: renamed from: e */
                public final b22 f2665e;

                public c22(RecyclerView recyclerView) {
/* 4 */             this.f2664d = recyclerView;
/* 6 */             b22 b22Var = this.f2665e;
/* 8 */             if (b22Var != null) {
/* 10 */                this.f2665e = b22Var;
                    } else {
/* 18 */                this.f2665e = new b22(this);
                    }
                }

                @Override // p000.C2201t0
                /* JADX INFO: renamed from: c */
                public final void mo127c(View view, AccessibilityEvent accessibilityEvent) {
/* 1 */             super.mo127c(view, accessibilityEvent);
/* 6 */             if (!(view instanceof RecyclerView) || this.f2664d.m859M()) {
/* 31 */                return;
                    }
/* 16 */            RecyclerView recyclerView = (RecyclerView) view;
/* 22 */            if (recyclerView.getLayoutManager() != null) {
/* 28 */                recyclerView.getLayoutManager().mo819b0(accessibilityEvent);
                    }
                }

                @Override // p000.C2201t0
                /* JADX INFO: renamed from: d */
                public void mo128d(View view, C0901f1 c0901f1) {
/* 5 */             this.f16886a.onInitializeAccessibilityNodeInfo(view, c0901f1.f7961a);
/* 8 */             RecyclerView recyclerView = this.f2664d;
/* 14 */            if (recyclerView.m859M() || recyclerView.getLayoutManager() == null) {
/* 35 */                return;
                    }
/* 22 */            AbstractC0133k layoutManager = recyclerView.getLayoutManager();
/* 26 */            RecyclerView recyclerView2 = layoutManager.f1760b;
/* 32 */            layoutManager.mo992c0(recyclerView2.f1639b, recyclerView2.f1624R0, c0901f1);
                }

                @Override // p000.C2201t0
                /* JADX INFO: renamed from: g */
                public final boolean mo129g(View view, int i, Bundle bundle) {
/* 5 */             if (super.mo129g(view, i, bundle)) {
/* 7 */                 return true;
                    }
/* 9 */             RecyclerView recyclerView = this.f2664d;
/* 15 */            if (recyclerView.m859M() || recyclerView.getLayoutManager() == null) {
/* 38 */                return false;
                    }
/* 23 */            AbstractC0133k layoutManager = recyclerView.getLayoutManager();
/* 27 */            RecyclerView recyclerView2 = layoutManager.f1760b;
/* 33 */            return layoutManager.mo997q0(recyclerView2.f1639b, recyclerView2.f1624R0, i, bundle);
                }
            }
