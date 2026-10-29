            package androidx.constraintlayout.widget;

            import android.content.Context;
            import android.graphics.Canvas;
            import android.util.AttributeSet;
            import android.view.View;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 11 */    public class Guideline extends View {

                /* JADX INFO: renamed from: a */
                public boolean f1153a;

                public Guideline(Context context) {
/* 1 */             super(context);
/* 5 */             this.f1153a = true;
/* 9 */             super.setVisibility(8);
                }

                @Override // android.view.View
                public final void draw(Canvas canvas) {
                }

                @Override // android.view.View
                public final void onMeasure(int i, int i2) {
/* 2 */             setMeasuredDimension(0, 0);
                }

                public void setFilterRedundantCalls(boolean z) {
/* 1 */             this.f1153a = z;
                }

                public void setGuidelineBegin(int i) {
/* 5 */             ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
/* 9 */             if (this.f1153a && layoutParams.f1096a == i) {
/* 15 */                return;
                    }
/* 16 */            layoutParams.f1096a = i;
/* 18 */            setLayoutParams(layoutParams);
                }

                public void setGuidelineEnd(int i) {
/* 5 */             ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
/* 9 */             if (this.f1153a && layoutParams.f1098b == i) {
/* 15 */                return;
                    }
/* 16 */            layoutParams.f1098b = i;
/* 18 */            setLayoutParams(layoutParams);
                }

                public void setGuidelinePercent(float f) {
/* 5 */             ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
/* 9 */             if (this.f1153a && layoutParams.f1100c == f) {
/* 17 */                return;
                    }
/* 18 */            layoutParams.f1100c = f;
/* 20 */            setLayoutParams(layoutParams);
                }

                @Override // android.view.View
                public void setVisibility(int i) {
                }

/* 12 */        public Guideline(Context context, AttributeSet attributeSet) {
/* 13 */            super(context, attributeSet);
/* 14 */            this.f1153a = true;
/* 15 */            super.setVisibility(8);
                }

/* 15 */        public Guideline(Context context, AttributeSet attributeSet, int i) {
/* 16 */            super(context, attributeSet, i);
/* 17 */            this.f1153a = true;
/* 18 */            super.setVisibility(8);
                }
            }
