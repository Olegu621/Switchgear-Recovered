            package androidx.appcompat.widget;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.util.AttributeSet;
            import android.view.View;
            import android.widget.LinearLayout;
            import androidx.appcompat.R$id;
            import androidx.appcompat.R$styleable;
            import java.util.WeakHashMap;
            import p000.e33;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ButtonBarLayout extends LinearLayout {

                /* JADX INFO: renamed from: a */
                public boolean f541a;

                /* JADX INFO: renamed from: b */
                public boolean f542b;

                /* JADX INFO: renamed from: c */
                public int f543c;

                public ButtonBarLayout(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
/* 5 */             this.f543c = -1;
/* 9 */             TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ButtonBarLayout);
/* 19 */            e33.m3317m(this, context, R$styleable.ButtonBarLayout, attributeSet, typedArrayObtainStyledAttributes, 0);
/* 29 */            this.f541a = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ButtonBarLayout_allowStacking, true);
/* 31 */            typedArrayObtainStyledAttributes.recycle();
/* 38 */            if (getOrientation() == 1) {
/* 42 */                setStacked(this.f541a);
                    }
                }

                private void setStacked(boolean z) {
/* 3 */             if (this.f542b != z) {
/* 5 */                 if (!z || this.f541a) {
/* 11 */                    this.f542b = z;
/* 13 */                    setOrientation(z ? 1 : 0);
/* 24 */                    setGravity(z ? 8388613 : 80);
/* 29 */                    View viewFindViewById = findViewById(R$id.spacer);
/* 33 */                    if (viewFindViewById != null) {
/* 41 */                        viewFindViewById.setVisibility(z ? 8 : 4);
                            }
/* 50 */                    for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
/* 56 */                        bringChildToFront(getChildAt(childCount));
                            }
                        }
                    }
                }

                @Override // android.widget.LinearLayout, android.view.View
                public final void onMeasure(int i, int i2) {
                    int iMakeMeasureSpec;
                    boolean z;
                    int i3;
/* 1 */             int size = View.MeasureSpec.getSize(i);
/* 7 */             int paddingBottom = 0;
/* 8 */             if (this.f541a) {
/* 12 */                if (size > this.f543c && this.f542b) {
/* 18 */                    setStacked(false);
                        }
/* 21 */                this.f543c = size;
                    }
/* 26 */            if (this.f542b || View.MeasureSpec.getMode(i) != 1073741824) {
/* 44 */                iMakeMeasureSpec = i;
/* 45 */                z = false;
                    } else {
/* 38 */                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
/* 42 */                z = true;
                    }
/* 46 */            super.onMeasure(iMakeMeasureSpec, i2);
/* 51 */            if (this.f541a && !this.f542b && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
/* 68 */                setStacked(true);
/* 71 */                z = true;
                    }
/* 72 */            if (z) {
/* 74 */                super.onMeasure(i, i2);
                    }
/* 77 */            int childCount = getChildCount();
/* 81 */            int i4 = 0;
                    while (true) {
/* 82 */                i3 = -1;
/* 83 */                if (i4 >= childCount) {
/* 99 */                    i4 = -1;
                            break;
                        } else if (getChildAt(i4).getVisibility() == 0) {
                            break;
                        } else {
/* 96 */                    i4++;
                        }
                    }
/* 100 */           if (i4 >= 0) {
/* 102 */               View childAt = getChildAt(i4);
/* 110 */               LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
/* 126 */               int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
/* 129 */               if (this.f542b) {
/* 132 */                   int childCount2 = getChildCount();
/* 136 */                   for (int i5 = i4 + 1; i5 < childCount2; i5++) {
/* 146 */                       if (getChildAt(i5).getVisibility() == 0) {
/* 148 */                           i3 = i5;
                                    break;
                                }
                            }
/* 181 */                   paddingBottom = i3 >= 0 ? getChildAt(i3).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
                        } else {
/* 187 */                   paddingBottom = getPaddingBottom() + measuredHeight;
                        }
                    }
/* 189 */           WeakHashMap weakHashMap = e33.f7494a;
/* 195 */           if (getMinimumHeight() != paddingBottom) {
/* 197 */               setMinimumHeight(paddingBottom);
/* 200 */               if (i2 == 0) {
/* 202 */                   super.onMeasure(i, i2);
                        }
                    }
                }

                public void setAllowStacking(boolean z) {
/* 3 */             if (this.f541a != z) {
/* 5 */                 this.f541a = z;
/* 7 */                 if (!z && this.f542b) {
/* 14 */                    setStacked(false);
                        }
/* 17 */                requestLayout();
                    }
                }
            }
