            package com.google.android.material.snackbar;

            import android.view.MotionEvent;
            import android.view.View;
            import androidx.coordinatorlayout.widget.CoordinatorLayout;
            import com.google.android.material.behavior.SwipeDismissBehavior;
            import p000.AbstractC2182si;
            import p000.C0828d1;
            import p000.xt0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

                /* JADX INFO: renamed from: i */
                public final xt0 f4937i;

                public BaseTransientBottomBar$Behavior() {
/* 8 */             xt0 xt0Var = new xt0(18);
/* 25 */            this.f4446f = Math.min(Math.max(0.0f, 0.1f), 1.0f);
/* 38 */            this.f4447g = Math.min(Math.max(0.0f, 0.6f), 1.0f);
/* 41 */            this.f4444d = 0;
/* 43 */            this.f4937i = xt0Var;
                }

                @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                /* JADX INFO: renamed from: g */
                public final boolean mo569g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
/* 3 */             this.f4937i.getClass();
/* 6 */             int actionMasked = motionEvent.getActionMasked();
/* 11 */            if (actionMasked != 0) {
/* 14 */                if (actionMasked == 1 || actionMasked == 3) {
/* 22 */                    if (C0828d1.f6953b == null) {
/* 29 */                        C0828d1.f6953b = new C0828d1(5);
                            }
                            synchronized (C0828d1.f6953b.f6954a) {
                            }
                        }
                    } else if (coordinatorLayout.m555n(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
/* 59 */                if (C0828d1.f6953b == null) {
/* 66 */                    C0828d1.f6953b = new C0828d1(5);
                        }
                        synchronized (C0828d1.f6953b.f6954a) {
                        }
                    }
/* 78 */            return super.mo569g(coordinatorLayout, view, motionEvent);
                }

                @Override // com.google.android.material.behavior.SwipeDismissBehavior
                /* JADX INFO: renamed from: s */
                public final boolean mo2237s(View view) {
/* 3 */             this.f4937i.getClass();
/* 6 */             return view instanceof AbstractC2182si;
                }
            }
