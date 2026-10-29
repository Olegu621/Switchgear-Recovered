            package com.google.android.material.behavior;

            import android.view.MotionEvent;
            import android.view.View;
            import androidx.coordinatorlayout.widget.CoordinatorLayout;
            import java.util.WeakHashMap;
            import p000.C2518z0;
            import p000.e33;
            import p000.fs0;
            import p000.j33;
            import p000.uj2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

                /* JADX INFO: renamed from: a */
                public j33 f4441a;

                /* JADX INFO: renamed from: b */
                public fs0 f4442b;

                /* JADX INFO: renamed from: c */
                public boolean f4443c;

                /* JADX INFO: renamed from: d */
                public int f4444d = 2;

                /* JADX INFO: renamed from: e */
                public float f4445e = 0.5f;

                /* JADX INFO: renamed from: f */
                public float f4446f = 0.0f;

                /* JADX INFO: renamed from: g */
                public float f4447g = 0.5f;

                /* JADX INFO: renamed from: h */
                public final uj2 f4448h = new uj2(this);

                @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                /* JADX INFO: renamed from: g */
                public boolean mo569g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
/* 1 */             boolean zM555n = this.f4443c;
/* 3 */             int actionMasked = motionEvent.getActionMasked();
/* 8 */             if (actionMasked == 0) {
/* 30 */                zM555n = coordinatorLayout.m555n(view, (int) motionEvent.getX(), (int) motionEvent.getY());
/* 34 */                this.f4443c = zM555n;
                    } else if (actionMasked == 1 || actionMasked == 3) {
/* 17 */                this.f4443c = false;
                    }
/* 36 */            if (!zM555n) {
/* 7 */                 return false;
                    }
/* 40 */            if (this.f4441a == null) {
/* 53 */                this.f4441a = new j33(coordinatorLayout.getContext(), coordinatorLayout, this.f4448h);
                    }
/* 57 */            return this.f4441a.m5688t(motionEvent);
                }

                @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                /* JADX INFO: renamed from: h */
                public final boolean mo570h(CoordinatorLayout coordinatorLayout, View view, int i) {
/* 1 */             WeakHashMap weakHashMap = e33.f7494a;
/* 8 */             if (view.getImportantForAccessibility() == 0) {
/* 11 */                view.setImportantForAccessibility(1);
/* 16 */                e33.m3315k(1048576, view);
/* 19 */                e33.m3311g(0, view);
/* 26 */                if (mo2237s(view)) {
/* 37 */                    e33.m3316l(view, C2518z0.f19879l, new fs0(this, 15));
                        }
                    }
/* 7 */             return false;
                }

                @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                /* JADX INFO: renamed from: r */
                public final boolean mo580r(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
/* 1 */             j33 j33Var = this.f4441a;
/* 3 */             if (j33Var == null) {
/* 10 */                return false;
                    }
/* 5 */             j33Var.m5681m(motionEvent);
/* 8 */             return true;
                }

                /* JADX INFO: renamed from: s */
                public boolean mo2237s(View view) {
/* 1 */             return true;
                }
            }
