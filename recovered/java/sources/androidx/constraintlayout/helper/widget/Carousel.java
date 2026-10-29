            package androidx.constraintlayout.helper.widget;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.util.AttributeSet;
            import androidx.constraintlayout.motion.widget.MotionHelper;
            import androidx.constraintlayout.motion.widget.MotionLayout;
            import androidx.constraintlayout.widget.R$styleable;
            import java.util.ArrayList;
            import p000.InterfaceC2191sr;
            import p000.RunnableC2495ye;
            import p000.kk1;
            import p000.mq2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 50 */    public class Carousel extends MotionHelper {

                /* JADX INFO: renamed from: a0 */
                public final ArrayList f819a0;

                /* JADX INFO: renamed from: b0 */
                public int f820b0;

                /* JADX INFO: renamed from: c0 */
                public MotionLayout f821c0;

                /* JADX INFO: renamed from: d0 */
                public int f822d0;

                /* JADX INFO: renamed from: e0 */
                public boolean f823e0;

                /* JADX INFO: renamed from: f0 */
                public int f824f0;

                /* JADX INFO: renamed from: g0 */
                public int f825g0;

                /* JADX INFO: renamed from: h0 */
                public int f826h0;

                /* JADX INFO: renamed from: i0 */
                public int f827i0;

                /* JADX INFO: renamed from: j0 */
                public float f828j0;

                /* JADX INFO: renamed from: k0 */
                public int f829k0;

                /* JADX INFO: renamed from: l0 */
                public int f830l0;

                /* JADX INFO: renamed from: m0 */
                public float f831m0;

                public Carousel(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 9 */             this.f819a0 = new ArrayList();
/* 12 */            this.f820b0 = 0;
/* 15 */            this.f822d0 = -1;
/* 17 */            this.f823e0 = false;
/* 19 */            this.f824f0 = -1;
/* 21 */            this.f825g0 = -1;
/* 23 */            this.f826h0 = -1;
/* 25 */            this.f827i0 = -1;
/* 30 */            this.f828j0 = 0.9f;
/* 33 */            this.f829k0 = 4;
/* 36 */            this.f830l0 = 1;
/* 40 */            this.f831m0 = 2.0f;
/* 45 */            new RunnableC2495ye(this, 2);
/* 48 */            m453s(context, attributeSet);
                }

                @Override // androidx.constraintlayout.motion.widget.MotionHelper, p000.gk1
                /* JADX INFO: renamed from: a */
                public final void mo452a(int i) {
/* 1 */             int i2 = this.f820b0;
/* 5 */             if (i == this.f827i0) {
/* 9 */                 this.f820b0 = i2 + 1;
                    } else if (i == this.f826h0) {
/* 18 */                this.f820b0 = i2 - 1;
                    }
/* 23 */            if (!this.f823e0) {
/* 26 */                throw null;
                    }
/* 25 */            throw null;
                }

                public int getCount() {
/* 1 */             return 0;
                }

                public int getCurrentIndex() {
/* 1 */             return this.f820b0;
                }

                @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
                public final void onAttachedToWindow() {
                    mq2 mq2Var;
                    mq2 mq2Var2;
/* 1 */             super.onAttachedToWindow();
/* 10 */            if (getParent() instanceof MotionLayout) {
/* 16 */                MotionLayout motionLayout = (MotionLayout) getParent();
/* 21 */                for (int i = 0; i < this.f1045b; i++) {
/* 33 */                    this.f819a0.add(motionLayout.m513b(this.f1044a[i]));
                        }
/* 39 */                this.f821c0 = motionLayout;
/* 44 */                if (this.f830l0 == 2) {
/* 48 */                    kk1 kk1VarM479q = motionLayout.m479q(this.f825g0);
/* 53 */                    if (kk1VarM479q != null && (mq2Var2 = kk1VarM479q.f12850l) != null) {
/* 59 */                        mq2Var2.f13953c = 5;
                            }
/* 65 */                    kk1 kk1VarM479q2 = this.f821c0.m479q(this.f824f0);
/* 69 */                    if (kk1VarM479q2 == null || (mq2Var = kk1VarM479q2.f12850l) == null) {
/* 77 */                        return;
                            }
/* 75 */                    mq2Var.f13953c = 5;
                        }
                    }
                }

                /* JADX INFO: renamed from: s */
                public final void m453s(Context context, AttributeSet attributeSet) {
/* 1 */             if (attributeSet != null) {
/* 5 */                 TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.Carousel);
/* 9 */                 int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
/* 14 */                for (int i = 0; i < indexCount; i++) {
/* 16 */                    int index = typedArrayObtainStyledAttributes.getIndex(i);
/* 22 */                    if (index == R$styleable.Carousel_carousel_firstView) {
/* 30 */                        this.f822d0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f822d0);
                            } else if (index == R$styleable.Carousel_carousel_backwardTransition) {
/* 44 */                        this.f824f0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f824f0);
                            } else if (index == R$styleable.Carousel_carousel_forwardTransition) {
/* 58 */                        this.f825g0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f825g0);
                            } else if (index == R$styleable.Carousel_carousel_emptyViewsBehavior) {
/* 71 */                        this.f829k0 = typedArrayObtainStyledAttributes.getInt(index, this.f829k0);
                            } else if (index == R$styleable.Carousel_carousel_previousState) {
/* 84 */                        this.f826h0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f826h0);
                            } else if (index == R$styleable.Carousel_carousel_nextState) {
/* 97 */                        this.f827i0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f827i0);
                            } else if (index == R$styleable.Carousel_carousel_touchUp_dampeningFactor) {
/* 110 */                       this.f828j0 = typedArrayObtainStyledAttributes.getFloat(index, this.f828j0);
                            } else if (index == R$styleable.Carousel_carousel_touchUpMode) {
/* 123 */                       this.f830l0 = typedArrayObtainStyledAttributes.getInt(index, this.f830l0);
                            } else if (index == R$styleable.Carousel_carousel_touchUp_velocityThreshold) {
/* 136 */                       this.f831m0 = typedArrayObtainStyledAttributes.getFloat(index, this.f831m0);
                            } else if (index == R$styleable.Carousel_carousel_infinite) {
/* 149 */                       this.f823e0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f823e0);
                            }
                        }
/* 155 */               typedArrayObtainStyledAttributes.recycle();
                    }
                }

                public void setAdapter(InterfaceC2191sr interfaceC2191sr) {
                }

/* 51 */        public Carousel(Context context, AttributeSet attributeSet, int i) {
/* 52 */            super(context, attributeSet, i);
/* 53 */            this.f819a0 = new ArrayList();
/* 54 */            this.f820b0 = 0;
/* 55 */            this.f822d0 = -1;
/* 56 */            this.f823e0 = false;
/* 57 */            this.f824f0 = -1;
/* 58 */            this.f825g0 = -1;
/* 59 */            this.f826h0 = -1;
/* 60 */            this.f827i0 = -1;
/* 61 */            this.f828j0 = 0.9f;
/* 62 */            this.f829k0 = 4;
/* 63 */            this.f830l0 = 1;
/* 64 */            this.f831m0 = 2.0f;
/* 65 */            new RunnableC2495ye(this, 2);
/* 66 */            m453s(context, attributeSet);
                }
            }
