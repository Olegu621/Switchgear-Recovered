            package com.google.android.material.transformation;

            import android.animation.AnimatorSet;
            import android.content.Context;
            import android.util.AttributeSet;
            import android.view.View;
            import p000.C2315w1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Deprecated
/* 3 */     public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

                /* JADX INFO: renamed from: b */
                public AnimatorSet f5131b;

                public ExpandableTransformationBehavior() {
                }

                @Override // com.google.android.material.transformation.ExpandableBehavior
                /* JADX INFO: renamed from: s */
                public void mo2431s(View view, View view2, boolean z, boolean z2) {
/* 1 */             AnimatorSet animatorSet = this.f5131b;
/* 7 */             boolean z3 = animatorSet != null;
/* 8 */             if (z3) {
/* 10 */                animatorSet.cancel();
                    }
/* 13 */            AnimatorSet animatorSetMo2432t = mo2432t(view, view2, z, z3);
/* 17 */            this.f5131b = animatorSetMo2432t;
/* 25 */            animatorSetMo2432t.addListener(new C2315w1(this, 3));
/* 30 */            this.f5131b.start();
/* 33 */            if (z2) {
/* 40 */                return;
                    }
/* 37 */            this.f5131b.end();
                }

                /* JADX INFO: renamed from: t */
                public abstract AnimatorSet mo2432t(View view, View view2, boolean z, boolean z2);

/* 4 */         public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
/* 5 */             super(context, attributeSet);
                }
            }
