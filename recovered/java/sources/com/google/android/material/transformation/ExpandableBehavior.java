            package com.google.android.material.transformation;

            import android.content.Context;
            import android.util.AttributeSet;
            import android.view.View;
            import androidx.coordinatorlayout.widget.CoordinatorLayout;
            import com.google.android.material.floatingactionbutton.FloatingActionButton;
            import java.util.ArrayList;
            import java.util.WeakHashMap;
            import p000.e33;
            import p000.pf0;
            import p000.qf0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Deprecated
/* 6 */     public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior<View> {

                /* JADX INFO: renamed from: a */
                public int f5130a;

                public ExpandableBehavior(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 5 */             this.f5130a = 0;
                }

                @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                /* JADX INFO: renamed from: b */
                public abstract boolean mo564b(View view, View view2);

                /* JADX WARN: Multi-variable type inference failed */
                @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                /* JADX INFO: renamed from: d */
                public final boolean mo566d(CoordinatorLayout coordinatorLayout, View view, View view2) {
/* 1 */             Object obj = (qf0) view2;
/* 8 */             boolean z = ((FloatingActionButton) obj).f4750c0.f2148a;
/* 10 */            int i = this.f5130a;
/* 14 */            if (z) {
/* 16 */                if (i != 0 && i != 2) {
/* 41 */                    return false;
                        }
                    } else if (i != 1) {
/* 41 */                return false;
                    }
/* 28 */            boolean z2 = ((FloatingActionButton) obj).f4750c0.f2148a;
/* 33 */            this.f5130a = z2 ? 1 : 2;
/* 37 */            mo2431s((View) obj, view, z2, true);
/* 13 */            return true;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                /* JADX INFO: renamed from: h */
                public final boolean mo570h(CoordinatorLayout coordinatorLayout, View view, int i) {
                    qf0 qf0Var;
/* 1 */             WeakHashMap weakHashMap = e33.f7494a;
/* 8 */             if (!view.isLaidOut()) {
/* 10 */                ArrayList arrayListM552i = coordinatorLayout.m552i(view);
/* 14 */                int size = arrayListM552i.size();
/* 18 */                int i2 = 0;
                        while (true) {
/* 19 */                    if (i2 >= size) {
/* 39 */                        qf0Var = null;
                                break;
                            }
/* 25 */                    View view2 = (View) arrayListM552i.get(i2);
/* 31 */                    if (mo564b(view, view2)) {
/* 33 */                        qf0Var = (qf0) view2;
                                break;
                            }
/* 36 */                    i2++;
                        }
/* 40 */                if (qf0Var != null) {
/* 47 */                    boolean z = ((FloatingActionButton) qf0Var).f4750c0.f2148a;
/* 49 */                    int i3 = this.f5130a;
/* 53 */                    if (!z ? i3 == 1 : !(i3 != 0 && i3 != 2)) {
/* 62 */                        int i4 = z ? 1 : 2;
/* 65 */                        this.f5130a = i4;
/* 76 */                        view.getViewTreeObserver().addOnPreDrawListener(new pf0(this, view, i4, qf0Var));
                            }
                        }
                    }
/* 7 */             return false;
                }

                /* JADX INFO: renamed from: s */
                public abstract void mo2431s(View view, View view2, boolean z, boolean z2);

/* 7 */         public ExpandableBehavior() {
/* 9 */             this.f5130a = 0;
                }
            }
