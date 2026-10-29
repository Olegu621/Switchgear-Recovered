            package p000;

            import android.content.Context;
            import android.content.res.Resources;
            import android.view.View;
            import android.widget.FrameLayout;
            import com.google.android.material.R$dimen;
            import java.util.WeakHashMap;
            
            /* JADX INFO: renamed from: pk */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2073pk extends tl1 {

                /* JADX INFO: renamed from: s0 */
                public final int f15149s0;

                /* JADX INFO: renamed from: t0 */
                public final int f15150t0;

                /* JADX INFO: renamed from: u0 */
                public final int f15151u0;

                /* JADX INFO: renamed from: v0 */
                public final int f15152v0;

                /* JADX INFO: renamed from: w0 */
                public boolean f15153w0;

                /* JADX INFO: renamed from: x0 */
                public final int[] f15154x0;

                public C2073pk(Context context) {
/* 1 */             super(context);
/* 7 */             FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
/* 12 */            layoutParams.gravity = 17;
/* 14 */            setLayoutParams(layoutParams);
/* 17 */            Resources resources = getResources();
/* 27 */            this.f15149s0 = resources.getDimensionPixelSize(R$dimen.design_bottom_navigation_item_max_width);
/* 35 */            this.f15150t0 = resources.getDimensionPixelSize(R$dimen.design_bottom_navigation_item_min_width);
/* 43 */            this.f15151u0 = resources.getDimensionPixelSize(R$dimen.design_bottom_navigation_active_item_max_width);
/* 51 */            this.f15152v0 = resources.getDimensionPixelSize(R$dimen.design_bottom_navigation_active_item_min_width);
/* 56 */            this.f15154x0 = new int[5];
                }

                @Override // p000.tl1
                /* JADX INFO: renamed from: e */
                public final rl1 mo4579e(Context context) {
/* 3 */             return new C2004ok(context);
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
/* 1 */             int childCount = getChildCount();
/* 5 */             int i5 = i3 - i;
/* 6 */             int i6 = i4 - i2;
/* 9 */             int measuredWidth = 0;
/* 10 */            for (int i7 = 0; i7 < childCount; i7++) {
/* 12 */                View childAt = getChildAt(i7);
/* 22 */                if (childAt.getVisibility() != 8) {
/* 25 */                    WeakHashMap weakHashMap = e33.f7494a;
/* 32 */                    if (getLayoutDirection() == 1) {
/* 34 */                        int i8 = i5 - measuredWidth;
/* 42 */                        childAt.layout(i8 - childAt.getMeasuredWidth(), 0, i8, i6);
                            } else {
/* 51 */                        childAt.layout(measuredWidth, 0, childAt.getMeasuredWidth() + measuredWidth, i6);
                            }
/* 58 */                    measuredWidth += childAt.getMeasuredWidth();
                        }
                    }
                }

                @Override // android.view.View
                public final void onMeasure(int i, int i2) {
/* 1 */             jg1 menu = getMenu();
/* 5 */             int size = View.MeasureSpec.getSize(i);
/* 13 */            int size2 = menu.m5807l().size();
/* 17 */            int childCount = getChildCount();
/* 21 */            int size3 = View.MeasureSpec.getSize(i2);
/* 27 */            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
/* 35 */            boolean zM8808f = tl1.m8808f(getLabelVisibilityMode(), size2);
/* 39 */            int i3 = this.f15151u0;
/* 41 */            int[] iArr = this.f15154x0;
/* 47 */            if (zM8808f && this.f15153w0) {
/* 57 */                View childAt = getChildAt(getSelectedItemPosition());
/* 61 */                int visibility = childAt.getVisibility();
/* 65 */                int iMax = this.f15152v0;
/* 67 */                if (visibility != 8) {
/* 75 */                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), iMakeMeasureSpec);
/* 82 */                    iMax = Math.max(iMax, childAt.getMeasuredWidth());
                        }
/* 95 */                int i4 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
/* 105 */               int iMin = Math.min(size - (this.f15150t0 * i4), Math.min(iMax, i3));
/* 109 */               int i5 = size - iMin;
/* 118 */               int iMin2 = Math.min(i5 / (i4 != 0 ? i4 : 1), this.f15149s0);
/* 123 */               int i6 = i5 - (i4 * iMin2);
/* 124 */               int i7 = 0;
/* 125 */               while (i7 < childCount) {
/* 135 */                   if (getChildAt(i7).getVisibility() != 8) {
/* 145 */                       int i8 = i7 == getSelectedItemPosition() ? iMin : iMin2;
/* 146 */                       iArr[i7] = i8;
/* 148 */                       if (i6 > 0) {
/* 152 */                           iArr[i7] = i8 + 1;
/* 154 */                           i6--;
                                }
                            } else {
/* 157 */                       iArr[i7] = 0;
                            }
/* 159 */                   i7++;
                        }
                    } else {
/* 168 */               int iMin3 = Math.min(size / (size2 != 0 ? size2 : 1), i3);
/* 173 */               int i9 = size - (size2 * iMin3);
/* 175 */               for (int i10 = 0; i10 < childCount; i10++) {
/* 185 */                   if (getChildAt(i10).getVisibility() != 8) {
/* 187 */                       iArr[i10] = iMin3;
/* 189 */                       if (i9 > 0) {
/* 193 */                           iArr[i10] = iMin3 + 1;
/* 195 */                           i9--;
                                }
                            } else {
/* 198 */                       iArr[i10] = 0;
                            }
                        }
                    }
/* 204 */           int measuredWidth = 0;
/* 205 */           for (int i11 = 0; i11 < childCount; i11++) {
/* 207 */               View childAt2 = getChildAt(i11);
/* 215 */               if (childAt2.getVisibility() != 8) {
/* 224 */                   childAt2.measure(View.MeasureSpec.makeMeasureSpec(iArr[i11], 1073741824), iMakeMeasureSpec);
/* 235 */                   childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
/* 241 */                   measuredWidth += childAt2.getMeasuredWidth();
                        }
                    }
/* 257 */           setMeasuredDimension(View.resolveSizeAndState(measuredWidth, View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), 0), View.resolveSizeAndState(size3, i2, 0));
                }

                public void setItemHorizontalTranslationEnabled(boolean z) {
/* 1 */             this.f15153w0 = z;
                }
            }
