            package androidx.constraintlayout.motion.widget;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.util.AttributeSet;
            import android.view.View;
            import android.view.ViewGroup;
            import androidx.constraintlayout.widget.ConstraintHelper;
            import androidx.constraintlayout.widget.ConstraintLayout;
            import androidx.constraintlayout.widget.R$styleable;
            import java.util.HashMap;
            import p000.gk1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 11 */    public class MotionHelper extends ConstraintHelper implements gk1 {

                /* JADX INFO: renamed from: U */
                public boolean f871U;

                /* JADX INFO: renamed from: V */
                public float f872V;

                /* JADX INFO: renamed from: W */
                public View[] f873W;

                /* JADX INFO: renamed from: w */
                public boolean f874w;

                public MotionHelper(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 5 */             this.f874w = false;
/* 7 */             this.f871U = false;
/* 9 */             mo454k(attributeSet);
                }

                /* JADX INFO: renamed from: a */
                public void mo452a(int i) {
                }

                public float getProgress() {
/* 1 */             return this.f872V;
                }

                @Override // androidx.constraintlayout.widget.ConstraintHelper
                /* JADX INFO: renamed from: k */
                public final void mo454k(AttributeSet attributeSet) {
/* 1 */             super.mo454k(attributeSet);
/* 4 */             if (attributeSet != null) {
/* 12 */                TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.MotionHelper);
/* 16 */                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
/* 21 */                for (int i = 0; i < indexCount; i++) {
/* 23 */                    int index = typedArrayObtainStyledAttributes.getIndex(i);
/* 29 */                    if (index == R$styleable.MotionHelper_onShow) {
/* 37 */                        this.f874w = typedArrayObtainStyledAttributes.getBoolean(index, this.f874w);
                            } else if (index == R$styleable.MotionHelper_onHide) {
/* 50 */                        this.f871U = typedArrayObtainStyledAttributes.getBoolean(index, this.f871U);
                            }
                        }
/* 55 */                typedArrayObtainStyledAttributes.recycle();
                    }
                }

                /* JADX INFO: renamed from: r */
                public void mo466r(MotionLayout motionLayout, HashMap map) {
                }

                public void setProgress(float f) {
/* 1 */             this.f872V = f;
/* 5 */             int i = 0;
/* 6 */             if (this.f1045b > 0) {
/* 18 */                this.f873W = m510j((ConstraintLayout) getParent());
/* 22 */                while (i < this.f1045b) {
/* 26 */                    View view = this.f873W[i];
/* 28 */                    i++;
                        }
/* 49 */                return;
                    }
/* 35 */            ViewGroup viewGroup = (ViewGroup) getParent();
/* 37 */            int childCount = viewGroup.getChildCount();
/* 41 */            while (i < childCount) {
/* 43 */                viewGroup.getChildAt(i);
/* 46 */                i++;
                    }
                }

/* 12 */        public MotionHelper(Context context, AttributeSet attributeSet, int i) {
/* 13 */            super(context, attributeSet, i);
/* 14 */            this.f874w = false;
/* 15 */            this.f871U = false;
/* 16 */            mo454k(attributeSet);
                }
            }
