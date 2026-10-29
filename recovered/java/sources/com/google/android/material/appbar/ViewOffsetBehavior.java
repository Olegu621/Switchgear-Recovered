            package com.google.android.material.appbar;

            import android.content.Context;
            import android.util.AttributeSet;
            import android.view.View;
            import androidx.coordinatorlayout.widget.CoordinatorLayout;
            import p000.v33;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 6 */     class ViewOffsetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

                /* JADX INFO: renamed from: a */
                public v33 f4402a;

                /* JADX INFO: renamed from: b */
                public int f4403b;

                public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 5 */             this.f4403b = 0;
                }

                @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                /* JADX INFO: renamed from: h */
                public boolean mo570h(CoordinatorLayout coordinatorLayout, View view, int i) {
/* 1 */             mo2232u(coordinatorLayout, view, i);
/* 6 */             if (this.f4402a == null) {
/* 13 */                this.f4402a = new v33(view);
                    }
/* 15 */            v33 v33Var = this.f4402a;
/* 17 */            View view2 = v33Var.f17851a;
/* 23 */            v33Var.f17852b = view2.getTop();
/* 29 */            v33Var.f17853c = view2.getLeft();
/* 33 */            this.f4402a.m9216a();
/* 36 */            int i2 = this.f4403b;
/* 38 */            if (i2 == 0) {
/* 48 */                return true;
                    }
/* 42 */            this.f4402a.m9217b(i2);
/* 46 */            this.f4403b = 0;
/* 48 */            return true;
                }

                /* JADX INFO: renamed from: s */
                public int m2234s() {
/* 1 */             v33 v33Var = this.f4402a;
/* 3 */             if (v33Var != null) {
/* 5 */                 return v33Var.f17854d;
                    }
/* 8 */             return 0;
                }

                /* JADX INFO: renamed from: t */
                public int mo2217t() {
/* 1 */             return m2234s();
                }

                /* JADX INFO: renamed from: u */
                public void mo2232u(CoordinatorLayout coordinatorLayout, View view, int i) {
/* 1 */             coordinatorLayout.m557p(i, view);
                }

                /* JADX INFO: renamed from: v */
                public boolean m2235v(int i) {
/* 1 */             v33 v33Var = this.f4402a;
/* 3 */             if (v33Var != null) {
/* 5 */                 return v33Var.m9217b(i);
                    }
/* 10 */            this.f4403b = i;
/* 12 */            return false;
                }

/* 7 */         public ViewOffsetBehavior() {
/* 9 */             this.f4403b = 0;
                }
            }
