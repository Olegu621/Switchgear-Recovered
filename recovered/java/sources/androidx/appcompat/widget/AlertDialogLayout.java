            package androidx.appcompat.widget;

            import android.content.Context;
            import android.graphics.drawable.Drawable;
            import android.util.AttributeSet;
            import android.view.Gravity;
            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.LinearLayout;
            import androidx.appcompat.R$id;
            import java.util.WeakHashMap;
            import p000.e33;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class AlertDialogLayout extends LinearLayoutCompat {
                public AlertDialogLayout(Context context, AttributeSet attributeSet) {
/* 1 */             super(context, attributeSet);
                }

                /* JADX INFO: renamed from: j */
                public static int m355j(View view) {
/* 1 */             WeakHashMap weakHashMap = e33.f7494a;
/* 3 */             int minimumHeight = view.getMinimumHeight();
/* 7 */             if (minimumHeight > 0) {
/* 9 */                 return minimumHeight;
                    }
/* 13 */            if (view instanceof ViewGroup) {
/* 15 */                ViewGroup viewGroup = (ViewGroup) view;
/* 22 */                if (viewGroup.getChildCount() == 1) {
/* 28 */                    return m355j(viewGroup.getChildAt(0));
                        }
                    }
/* 12 */            return 0;
                }

                /* JADX WARN: Code duplicated, block: B:31:0x009e  */
                @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
                    int i5;
                    int i6;
                    int i7;
/* 1 */             int paddingLeft = getPaddingLeft();
/* 5 */             int i8 = i3 - i;
/* 10 */            int paddingRight = i8 - getPaddingRight();
/* 17 */            int paddingRight2 = (i8 - paddingLeft) - getPaddingRight();
/* 18 */            int measuredHeight = getMeasuredHeight();
/* 22 */            int childCount = getChildCount();
/* 26 */            int gravity = getGravity();
/* 30 */            int i9 = gravity & 112;
/* 35 */            int i10 = gravity & 8388615;
/* 66 */            int paddingTop = i9 != 16 ? i9 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - measuredHeight : (((i4 - i2) - measuredHeight) / 2) + getPaddingTop();
/* 68 */            Drawable dividerDrawable = getDividerDrawable();
/* 77 */            int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
/* 81 */            for (int i11 = 0; i11 < childCount; i11++) {
/* 83 */                View childAt = getChildAt(i11);
/* 87 */                if (childAt != null && childAt.getVisibility() != 8) {
/* 97 */                    int measuredWidth = childAt.getMeasuredWidth();
/* 101 */                   int measuredHeight2 = childAt.getMeasuredHeight();
/* 109 */                   LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) childAt.getLayoutParams();
/* 111 */                   int i12 = ((LinearLayout.LayoutParams) layoutParams).gravity;
/* 113 */                   if (i12 < 0) {
/* 115 */                       i12 = i10;
                            }
/* 124 */                   int absoluteGravity = Gravity.getAbsoluteGravity(i12, getLayoutDirection()) & 7;
/* 127 */                   if (absoluteGravity != 1) {
/* 130 */                       if (absoluteGravity != 5) {
/* 134 */                           i7 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + paddingLeft;
                                } else {
/* 136 */                           i5 = paddingRight - measuredWidth;
/* 138 */                           i6 = ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                                }
/* 157 */                       if (m364i(i11)) {
/* 159 */                           paddingTop += intrinsicHeight;
                                }
/* 162 */                       int i13 = paddingTop + ((LinearLayout.LayoutParams) layoutParams).topMargin;
/* 166 */                       childAt.layout(i7, i13, measuredWidth + i7, i13 + measuredHeight2);
/* 172 */                       paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + i13;
                            } else {
/* 149 */                       i5 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
/* 150 */                       i6 = ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                            }
/* 140 */                   i7 = i5 - i6;
/* 157 */                   if (m364i(i11)) {
/* 159 */                       paddingTop += intrinsicHeight;
                            }
/* 162 */                   int i14 = paddingTop + ((LinearLayout.LayoutParams) layoutParams).topMargin;
/* 166 */                   childAt.layout(i7, i14, measuredWidth + i7, i14 + measuredHeight2);
/* 172 */                   paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + i14;
                        }
                    }
                }

                @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
                public final void onMeasure(int i, int i2) {
                    int iCombineMeasuredStates;
                    int iM355j;
                    int measuredHeight;
                    int measuredHeight2;
/* 1 */             AlertDialogLayout alertDialogLayout = this;
/* 5 */             int childCount = alertDialogLayout.getChildCount();
/* 9 */             View view = null;
/* 11 */            View view2 = null;
/* 12 */            View view3 = null;
/* 16 */            for (int i3 = 0; i3 < childCount; i3++) {
/* 18 */                View childAt = alertDialogLayout.getChildAt(i3);
/* 26 */                if (childAt.getVisibility() != 8) {
/* 29 */                    int id = childAt.getId();
/* 35 */                    if (id == R$id.topPanel) {
/* 37 */                        view = childAt;
                            } else if (id == R$id.buttonPanel) {
/* 43 */                        view2 = childAt;
                            } else {
/* 47 */                        if ((id != R$id.contentPanel && id != R$id.customPanel) || view3 != null) {
/* 55 */                            super.onMeasure(i, i2);
/* 58 */                            return;
                                }
/* 59 */                        view3 = childAt;
                            }
                        }
                    }
/* 63 */            int mode = View.MeasureSpec.getMode(i2);
/* 67 */            int size = View.MeasureSpec.getSize(i2);
/* 71 */            int mode2 = View.MeasureSpec.getMode(i);
/* 83 */            int paddingBottom = alertDialogLayout.getPaddingBottom() + alertDialogLayout.getPaddingTop();
/* 84 */            if (view != null) {
/* 86 */                view.measure(i, 0);
/* 93 */                paddingBottom += view.getMeasuredHeight();
/* 98 */                iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
                    } else {
/* 103 */               iCombineMeasuredStates = 0;
                    }
/* 104 */           if (view2 != null) {
/* 106 */               view2.measure(i, 0);
/* 109 */               iM355j = m355j(view2);
/* 117 */               measuredHeight = view2.getMeasuredHeight() - iM355j;
/* 118 */               paddingBottom += iM355j;
/* 123 */               iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
                    } else {
/* 128 */               iM355j = 0;
/* 129 */               measuredHeight = 0;
                    }
/* 130 */           if (view3 != null) {
/* 146 */               view3.measure(i, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
/* 149 */               measuredHeight2 = view3.getMeasuredHeight();
/* 153 */               paddingBottom += measuredHeight2;
/* 158 */               iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
                    } else {
/* 163 */               measuredHeight2 = 0;
                    }
/* 164 */           int i4 = size - paddingBottom;
/* 167 */           if (view2 != null) {
/* 169 */               int i5 = paddingBottom - iM355j;
/* 170 */               int iMin = Math.min(i4, measuredHeight);
/* 174 */               if (iMin > 0) {
/* 176 */                   i4 -= iMin;
/* 177 */                   iM355j += iMin;
                        }
/* 182 */               view2.measure(i, View.MeasureSpec.makeMeasureSpec(iM355j, 1073741824));
/* 189 */               paddingBottom = i5 + view2.getMeasuredHeight();
/* 194 */               iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
                    }
/* 198 */           if (view3 != null && i4 > 0) {
/* 208 */               view3.measure(i, View.MeasureSpec.makeMeasureSpec(measuredHeight2 + i4, mode));
/* 215 */               paddingBottom = (paddingBottom - measuredHeight2) + view3.getMeasuredHeight();
/* 220 */               iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
                    }
/* 225 */           int iMax = 0;
/* 226 */           for (int i6 = 0; i6 < childCount; i6++) {
/* 228 */               View childAt2 = alertDialogLayout.getChildAt(i6);
/* 236 */               if (childAt2.getVisibility() != 8) {
/* 242 */                   iMax = Math.max(iMax, childAt2.getMeasuredWidth());
                        }
                    }
/* 263 */           int i7 = i2;
/* 269 */           alertDialogLayout.setMeasuredDimension(View.resolveSizeAndState(alertDialogLayout.getPaddingRight() + alertDialogLayout.getPaddingLeft() + iMax, i, iCombineMeasuredStates), View.resolveSizeAndState(paddingBottom, i7, 0));
/* 272 */           if (mode2 != 1073741824) {
/* 278 */               int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(alertDialogLayout.getMeasuredWidth(), 1073741824);
/* 282 */               int i8 = 0;
/* 283 */               while (i8 < childCount) {
/* 285 */                   View childAt3 = alertDialogLayout.getChildAt(i8);
/* 293 */                   if (childAt3.getVisibility() != 8) {
/* 300 */                       LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) childAt3.getLayoutParams();
/* 305 */                       if (((LinearLayout.LayoutParams) layoutParams).width == -1) {
/* 307 */                           int i9 = ((LinearLayout.LayoutParams) layoutParams).height;
/* 313 */                           ((LinearLayout.LayoutParams) layoutParams).height = childAt3.getMeasuredHeight();
/* 317 */                           alertDialogLayout.measureChildWithMargins(childAt3, iMakeMeasureSpec, 0, i7, 0);
/* 320 */                           ((LinearLayout.LayoutParams) layoutParams).height = i9;
                                }
                            }
/* 322 */                   i8++;
/* 324 */                   alertDialogLayout = this;
/* 326 */                   i7 = i2;
                        }
                    }
                }
            }
