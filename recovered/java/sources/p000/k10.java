            package p000;

            import android.view.View;
            import android.view.ViewGroup;
            import androidx.coordinatorlayout.widget.CoordinatorLayout;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class k10 implements ViewGroup.OnHierarchyChangeListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ CoordinatorLayout f12559a;

                public k10(CoordinatorLayout coordinatorLayout) {
/* 4 */             this.f12559a = coordinatorLayout;
                }

                @Override // android.view.ViewGroup.OnHierarchyChangeListener
                public final void onChildViewAdded(View view, View view2) {
/* 3 */             ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f12559a.f1210e0;
/* 5 */             if (onHierarchyChangeListener != null) {
/* 7 */                 onHierarchyChangeListener.onChildViewAdded(view, view2);
                    }
                }

                @Override // android.view.ViewGroup.OnHierarchyChangeListener
                public final void onChildViewRemoved(View view, View view2) {
/* 2 */             CoordinatorLayout coordinatorLayout = this.f12559a;
/* 4 */             coordinatorLayout.m556o(2);
/* 7 */             ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.f1210e0;
/* 9 */             if (onHierarchyChangeListener != null) {
/* 11 */                onHierarchyChangeListener.onChildViewRemoved(view, view2);
                    }
                }
            }
