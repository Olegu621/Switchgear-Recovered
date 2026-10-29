            package androidx.constraintlayout.widget;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.util.AttributeSet;
            import android.util.SparseArray;
            import java.util.HashMap;
            import p000.C2274uz;
            import p000.C2294vh;
            import p000.C2569zz;
            import p000.a00;
            import p000.cu0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 29 */    public class Barrier extends ConstraintHelper {

                /* JADX INFO: renamed from: U */
                public int f1041U;

                /* JADX INFO: renamed from: V */
                public C2294vh f1042V;

                /* JADX INFO: renamed from: w */
                public int f1043w;

                public Barrier(Context context) {
/* 1 */             super(context);
/* 8 */             this.f1044a = new int[32];
/* 11 */            this.f1050i = null;
/* 18 */            this.f1051v = new HashMap();
/* 20 */            this.f1046c = context;
/* 22 */            mo454k(null);
/* 27 */            super.setVisibility(8);
                }

                public boolean getAllowsGoneWidget() {
/* 3 */             return this.f1042V.f18178x0;
                }

                public int getMargin() {
/* 3 */             return this.f1042V.f18179y0;
                }

                public int getType() {
/* 1 */             return this.f1043w;
                }

                @Override // androidx.constraintlayout.widget.ConstraintHelper
                /* JADX INFO: renamed from: k */
                public final void mo454k(AttributeSet attributeSet) {
/* 1 */             super.mo454k(attributeSet);
/* 9 */             this.f1042V = new C2294vh();
/* 11 */            if (attributeSet != null) {
/* 19 */                TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout);
/* 23 */                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
/* 29 */                for (int i = 0; i < indexCount; i++) {
/* 31 */                    int index = typedArrayObtainStyledAttributes.getIndex(i);
/* 37 */                    if (index == R$styleable.ConstraintLayout_Layout_barrierDirection) {
/* 43 */                        setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                            } else if (index == R$styleable.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
/* 58 */                        this.f1042V.f18178x0 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                            } else if (index == R$styleable.ConstraintLayout_Layout_barrierMargin) {
/* 71 */                        this.f1042V.f18179y0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                            }
                        }
/* 76 */                typedArrayObtainStyledAttributes.recycle();
                    }
/* 81 */            this.f1047d = this.f1042V;
/* 83 */            m511q();
                }

                @Override // androidx.constraintlayout.widget.ConstraintHelper
                /* JADX INFO: renamed from: l */
                public final void mo457l(C0076c c0076c, cu0 cu0Var, Constraints.LayoutParams layoutParams, SparseArray sparseArray) {
/* 1 */             super.mo457l(c0076c, cu0Var, layoutParams, sparseArray);
/* 4 */             C2274uz c2274uz = c0076c.f1180e;
/* 8 */             if (cu0Var instanceof C2294vh) {
/* 11 */                C2294vh c2294vh = (C2294vh) cu0Var;
/* 21 */                m502r(c2294vh, c2274uz.f17784g0, ((a00) cu0Var.f20416V).f22z0);
/* 26 */                c2294vh.f18178x0 = c2274uz.f17800o0;
/* 30 */                c2294vh.f18179y0 = c2274uz.f17786h0;
                    }
                }

                @Override // androidx.constraintlayout.widget.ConstraintHelper
                /* JADX INFO: renamed from: m */
                public final void mo458m(C2569zz c2569zz, boolean z) {
/* 3 */             m502r(c2569zz, this.f1043w, z);
                }

                /* JADX INFO: renamed from: r */
                public final void m502r(C2569zz c2569zz, int i, boolean z) {
/* 1 */             this.f1041U = i;
/* 3 */             int i2 = this.f1043w;
/* 9 */             if (z) {
/* 11 */                if (i2 == 5) {
/* 13 */                    this.f1041U = 1;
                        } else if (i2 == 6) {
/* 18 */                    this.f1041U = 0;
                        }
                    } else if (i2 == 5) {
/* 23 */                this.f1041U = 0;
                    } else if (i2 == 6) {
/* 28 */                this.f1041U = 1;
                    }
/* 32 */            if (c2569zz instanceof C2294vh) {
/* 38 */                ((C2294vh) c2569zz).f18177w0 = this.f1041U;
                    }
                }

                public void setAllowsGoneWidget(boolean z) {
/* 3 */             this.f1042V.f18178x0 = z;
                }

                public void setDpMargin(int i) {
/* 19 */            this.f1042V.f18179y0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
                }

                public void setMargin(int i) {
/* 3 */             this.f1042V.f18179y0 = i;
                }

                public void setType(int i) {
/* 1 */             this.f1043w = i;
                }

/* 30 */        public Barrier(Context context, AttributeSet attributeSet) {
/* 31 */            super(context, attributeSet);
/* 32 */            super.setVisibility(8);
                }

/* 32 */        public Barrier(Context context, AttributeSet attributeSet, int i) {
/* 33 */            super(context, attributeSet, i);
/* 34 */            super.setVisibility(8);
                }
            }
