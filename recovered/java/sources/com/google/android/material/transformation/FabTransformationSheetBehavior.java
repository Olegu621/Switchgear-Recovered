            package com.google.android.material.transformation;

            import android.content.Context;
            import android.util.AttributeSet;
            import android.view.View;
            import android.view.ViewParent;
            import androidx.coordinatorlayout.widget.C0080c;
            import androidx.coordinatorlayout.widget.CoordinatorLayout;
            import com.google.android.material.R$animator;
            import java.util.HashMap;
            import java.util.WeakHashMap;
            import p000.e33;
            import p000.mk1;
            import p000.wc0;
            import p000.zb0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Deprecated
/* 3 */     public class FabTransformationSheetBehavior extends FabTransformationBehavior {

                /* JADX INFO: renamed from: i */
                public HashMap f5140i;

                public FabTransformationSheetBehavior() {
                }

                @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
                /* JADX INFO: renamed from: s */
                public final void mo2431s(View view, View view2, boolean z, boolean z2) {
/* 1 */             ViewParent parent = view2.getParent();
/* 7 */             if (parent instanceof CoordinatorLayout) {
/* 11 */                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
/* 13 */                int childCount = coordinatorLayout.getChildCount();
/* 17 */                if (z) {
/* 24 */                    this.f5140i = new HashMap(childCount);
                        }
/* 28 */                for (int i = 0; i < childCount; i++) {
/* 30 */                    View childAt = coordinatorLayout.getChildAt(i);
/* 56 */                    boolean z3 = (childAt.getLayoutParams() instanceof C0080c) && (((C0080c) childAt.getLayoutParams()).f1218a instanceof FabTransformationScrimBehavior);
/* 57 */                    if (childAt != view2 && !z3) {
/* 62 */                        HashMap map = this.f5140i;
/* 64 */                        if (z) {
/* 100 */                           map.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
/* 103 */                           WeakHashMap weakHashMap = e33.f7494a;
/* 106 */                           childAt.setImportantForAccessibility(4);
                                } else if (map != null && map.containsKey(childAt)) {
/* 82 */                            int iIntValue = ((Integer) this.f5140i.get(childAt)).intValue();
/* 86 */                            WeakHashMap weakHashMap2 = e33.f7494a;
/* 88 */                            childAt.setImportantForAccessibility(iIntValue);
                                }
                            }
                        }
/* 112 */               if (!z) {
/* 115 */                   this.f5140i = null;
                        }
                    }
/* 117 */           super.mo2431s(view, view2, z, z2);
                }

                @Override // com.google.android.material.transformation.FabTransformationBehavior
                /* JADX INFO: renamed from: z */
                public final wc0 mo2438z(Context context, boolean z) {
/* 6 */             int i = z ? R$animator.mtrl_fab_transformation_sheet_expand_spec : R$animator.mtrl_fab_transformation_sheet_collapse_spec;
/* 12 */            wc0 wc0Var = new wc0(2, false);
/* 19 */            wc0Var.f18577b = mk1.m6668b(context, i);
/* 28 */            wc0Var.f18578c = new zb0(24);
/* 30 */            return wc0Var;
                }

/* 4 */         public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
/* 5 */             super(context, attributeSet);
                }
            }
