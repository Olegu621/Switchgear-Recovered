            package com.google.android.material.internal;

            import android.content.Context;
            import android.util.AttributeSet;
            import android.view.View;
            import android.view.ViewGroup;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 7 */     public class BaselineLayout extends ViewGroup {

                /* JADX INFO: renamed from: a */
                public int f4779a;

                public BaselineLayout(Context context, AttributeSet attributeSet) {
/* 2 */             super(context, attributeSet, 0);
/* 6 */             this.f4779a = -1;
                }

                @Override // android.view.View
                public int getBaseline() {
/* 1 */             return this.f4779a;
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
/* 1 */             int childCount = getChildCount();
/* 5 */             int paddingLeft = getPaddingLeft();
/* 15 */            int paddingRight = ((i3 - i) - getPaddingRight()) - paddingLeft;
/* 16 */            int paddingTop = getPaddingTop();
/* 21 */            for (int i5 = 0; i5 < childCount; i5++) {
/* 23 */                View childAt = getChildAt(i5);
/* 33 */                if (childAt.getVisibility() != 8) {
/* 36 */                    int measuredWidth = childAt.getMeasuredWidth();
/* 40 */                    int measuredHeight = childAt.getMeasuredHeight();
/* 48 */                    int i6 = ((paddingRight - measuredWidth) / 2) + paddingLeft;
/* 69 */                    int baseline = (this.f4779a == -1 || childAt.getBaseline() == -1) ? paddingTop : (this.f4779a + paddingTop) - childAt.getBaseline();
/* 72 */                    childAt.layout(i6, baseline, measuredWidth + i6, measuredHeight + baseline);
                        }
                    }
                }

                @Override // android.view.View
                public final void onMeasure(int i, int i2) {
/* 1 */             int childCount = getChildCount();
/* 7 */             int iMax = 0;
/* 8 */             int iMax2 = 0;
/* 9 */             int iCombineMeasuredStates = 0;
/* 10 */            int iMax3 = -1;
/* 11 */            int iMax4 = -1;
/* 12 */            for (int i3 = 0; i3 < childCount; i3++) {
/* 14 */                View childAt = getChildAt(i3);
/* 24 */                if (childAt.getVisibility() != 8) {
/* 27 */                    measureChild(childAt, i, i2);
/* 30 */                    int baseline = childAt.getBaseline();
/* 34 */                    if (baseline != -1) {
/* 36 */                        iMax3 = Math.max(iMax3, baseline);
/* 45 */                        iMax4 = Math.max(iMax4, childAt.getMeasuredHeight() - baseline);
                            }
/* 53 */                    iMax2 = Math.max(iMax2, childAt.getMeasuredWidth());
/* 61 */                    iMax = Math.max(iMax, childAt.getMeasuredHeight());
/* 69 */                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                        }
                    }
/* 76 */            if (iMax3 != -1) {
/* 87 */                iMax = Math.max(iMax, Math.max(iMax4, getPaddingBottom()) + iMax3);
/* 91 */                this.f4779a = iMax3;
                    }
/* 119 */           setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax2, getSuggestedMinimumWidth()), i, iCombineMeasuredStates), View.resolveSizeAndState(Math.max(iMax, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates << 16));
                }

/* 8 */         public BaselineLayout(Context context, AttributeSet attributeSet, int i) {
/* 9 */             super(context, attributeSet, i);
/* 10 */            this.f4779a = -1;
                }
            }
