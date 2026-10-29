            package androidx.constraintlayout.helper.widget;

            import android.content.Context;
            import android.util.AttributeSet;
            import android.util.SparseArray;
            import android.view.View;
            import androidx.constraintlayout.widget.VirtualLayout;
            import p000.bs1;
            import p000.cu0;
            import p000.y53;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 3 */     public class MotionPlaceholder extends VirtualLayout {
                public MotionPlaceholder(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
                }

                @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
                /* JADX INFO: renamed from: k */
                public final void mo454k(AttributeSet attributeSet) {
/* 1 */             super.mo454k(attributeSet);
/* 9 */             this.f1047d = new bs1();
/* 11 */            m511q();
                }

                @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
                public final void onMeasure(int i, int i2) {
/* 2 */             mo459r(null, i, i2);
                }

                @Override // androidx.constraintlayout.widget.ConstraintHelper
                /* JADX INFO: renamed from: p */
                public final void mo468p(cu0 cu0Var, SparseArray sparseArray) {
                }

                @Override // androidx.constraintlayout.widget.VirtualLayout
                /* JADX INFO: renamed from: r */
                public final void mo459r(y53 y53Var, int i, int i2) {
/* 1 */             int mode = View.MeasureSpec.getMode(i);
/* 5 */             int size = View.MeasureSpec.getSize(i);
/* 9 */             int mode2 = View.MeasureSpec.getMode(i2);
/* 13 */            int size2 = View.MeasureSpec.getSize(i2);
/* 17 */            if (y53Var == null) {
/* 31 */                setMeasuredDimension(0, 0);
                    } else {
/* 19 */                y53Var.mo1431V(mode, size, mode2, size2);
/* 26 */                setMeasuredDimension(y53Var.f19493D0, y53Var.f19494E0);
                    }
                }

/* 4 */         public MotionPlaceholder(Context context, AttributeSet attributeSet, int i) {
/* 5 */             super(context, attributeSet, i);
                }
            }
