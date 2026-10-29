            package androidx.constraintlayout.widget;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.graphics.Canvas;
            import android.util.AttributeSet;
            import android.view.View;
            import java.lang.ref.WeakReference;
            import java.util.ArrayList;
            import java.util.HashSet;
            import p000.pd2;
            import p000.qd2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 22 */    public class ReactiveGuide extends View implements pd2 {

                /* JADX INFO: renamed from: a */
                public int f1161a;

                /* JADX INFO: renamed from: b */
                public boolean f1162b;

                /* JADX INFO: renamed from: c */
                public int f1163c;

                /* JADX INFO: renamed from: d */
                public boolean f1164d;

                public ReactiveGuide(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 5 */             this.f1161a = -1;
/* 8 */             this.f1162b = false;
/* 10 */            this.f1163c = 0;
/* 13 */            this.f1164d = true;
/* 17 */            super.setVisibility(8);
/* 20 */            m522a(attributeSet);
                }

                /* JADX INFO: renamed from: a */
                public final void m522a(AttributeSet attributeSet) {
/* 1 */             if (attributeSet != null) {
/* 9 */                 TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_ReactiveGuide);
/* 13 */                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
/* 18 */                for (int i = 0; i < indexCount; i++) {
/* 20 */                    int index = typedArrayObtainStyledAttributes.getIndex(i);
/* 26 */                    if (index == R$styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_valueId) {
/* 34 */                        this.f1161a = typedArrayObtainStyledAttributes.getResourceId(index, this.f1161a);
                            } else if (index == R$styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_animateChange) {
/* 47 */                        this.f1162b = typedArrayObtainStyledAttributes.getBoolean(index, this.f1162b);
                            } else if (index == R$styleable.f1160x2694048c) {
/* 60 */                        this.f1163c = typedArrayObtainStyledAttributes.getResourceId(index, this.f1163c);
                            } else if (index == R$styleable.f1159xfdeff96) {
/* 73 */                        this.f1164d = typedArrayObtainStyledAttributes.getBoolean(index, this.f1164d);
                            }
                        }
/* 78 */                typedArrayObtainStyledAttributes.recycle();
                    }
/* 84 */            if (this.f1161a != -1) {
/* 92 */                ConstraintLayout.getSharedValues().m7781a(this.f1161a, this);
                    }
                }

                @Override // android.view.View
                public final void draw(Canvas canvas) {
                }

                public int getApplyToConstraintSetId() {
/* 1 */             return this.f1163c;
                }

                public int getAttributeId() {
/* 1 */             return this.f1161a;
                }

                @Override // android.view.View
                public final void onMeasure(int i, int i2) {
/* 2 */             setMeasuredDimension(0, 0);
                }

                public void setAnimateChange(boolean z) {
/* 1 */             this.f1162b = z;
                }

                public void setApplyToConstraintSetId(int i) {
/* 1 */             this.f1163c = i;
                }

                public void setAttributeId(int i) {
                    HashSet<WeakReference> hashSet;
/* 1 */             qd2 sharedValues = ConstraintLayout.getSharedValues();
/* 5 */             int i2 = this.f1161a;
/* 8 */             if (i2 != -1 && (hashSet = (HashSet) sharedValues.f15494a.get(Integer.valueOf(i2))) != null) {
/* 27 */                ArrayList arrayList = new ArrayList();
/* 38 */                for (WeakReference weakReference : hashSet) {
/* 50 */                    pd2 pd2Var = (pd2) weakReference.get();
/* 52 */                    if (pd2Var == null || pd2Var == this) {
/* 56 */                        arrayList.add(weakReference);
                            }
                        }
/* 60 */                hashSet.removeAll(arrayList);
                    }
/* 63 */            this.f1161a = i;
/* 65 */            if (i != -1) {
/* 67 */                sharedValues.m7781a(i, this);
                    }
                }

                public void setGuidelineBegin(int i) {
/* 5 */             ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
/* 7 */             layoutParams.f1096a = i;
/* 9 */             setLayoutParams(layoutParams);
                }

                public void setGuidelineEnd(int i) {
/* 5 */             ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
/* 7 */             layoutParams.f1098b = i;
/* 9 */             setLayoutParams(layoutParams);
                }

                public void setGuidelinePercent(float f) {
/* 5 */             ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
/* 7 */             layoutParams.f1100c = f;
/* 9 */             setLayoutParams(layoutParams);
                }

                @Override // android.view.View
                public void setVisibility(int i) {
                }

/* 23 */        public ReactiveGuide(Context context, AttributeSet attributeSet, int i) {
/* 24 */            super(context, attributeSet, i);
/* 25 */            this.f1161a = -1;
/* 26 */            this.f1162b = false;
/* 27 */            this.f1163c = 0;
/* 28 */            this.f1164d = true;
/* 29 */            super.setVisibility(8);
/* 30 */            m522a(attributeSet);
                }
            }
