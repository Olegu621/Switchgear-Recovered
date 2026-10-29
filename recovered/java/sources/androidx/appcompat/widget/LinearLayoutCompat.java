            package androidx.appcompat.widget;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.graphics.Canvas;
            import android.graphics.drawable.Drawable;
            import android.util.AttributeSet;
            import android.view.Gravity;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.accessibility.AccessibilityEvent;
            import android.view.accessibility.AccessibilityNodeInfo;
            import android.widget.LinearLayout;
            import androidx.appcompat.R$styleable;
            import p000.ac1;
            import p000.e33;
            import p000.f42;
            import p000.m53;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 128 */   public class LinearLayoutCompat extends ViewGroup {

                /* JADX INFO: renamed from: U */
                public int[] f552U;

                /* JADX INFO: renamed from: V */
                public Drawable f553V;

                /* JADX INFO: renamed from: W */
                public int f554W;

                /* JADX INFO: renamed from: a */
                public boolean f555a;

                /* JADX INFO: renamed from: a0 */
                public int f556a0;

                /* JADX INFO: renamed from: b */
                public int f557b;

                /* JADX INFO: renamed from: b0 */
                public int f558b0;

                /* JADX INFO: renamed from: c */
                public int f559c;

                /* JADX INFO: renamed from: c0 */
                public int f560c0;

                /* JADX INFO: renamed from: d */
                public int f561d;

                /* JADX INFO: renamed from: e */
                public int f562e;

                /* JADX INFO: renamed from: f */
                public int f563f;

                /* JADX INFO: renamed from: i */
                public float f564i;

                /* JADX INFO: renamed from: v */
                public boolean f565v;

                /* JADX INFO: renamed from: w */
                public int[] f566w;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class LayoutParams extends LinearLayout.LayoutParams {
                    public LayoutParams(Context context, AttributeSet attributeSet) {
/* 1 */                 super(context, attributeSet);
                    }
                }

                public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
/* 1 */             super(context, attributeSet, i);
/* 5 */             this.f555a = true;
/* 8 */             this.f557b = -1;
/* 11 */            this.f559c = 0;
/* 16 */            this.f562e = 8388659;
/* 20 */            ac1 ac1VarM156H = ac1.m156H(context, attributeSet, R$styleable.LinearLayoutCompat, i);
/* 35 */            e33.m3317m(this, context, R$styleable.LinearLayoutCompat, attributeSet, (TypedArray) ac1VarM156H.f178c, i);
/* 38 */            int i2 = R$styleable.LinearLayoutCompat_android_orientation;
/* 42 */            TypedArray typedArray = (TypedArray) ac1VarM156H.f178c;
/* 44 */            int i3 = typedArray.getInt(i2, -1);
/* 48 */            if (i3 >= 0) {
/* 50 */                setOrientation(i3);
                    }
/* 55 */            int i4 = typedArray.getInt(R$styleable.LinearLayoutCompat_android_gravity, -1);
/* 59 */            if (i4 >= 0) {
/* 61 */                setGravity(i4);
                    }
/* 66 */            boolean z = typedArray.getBoolean(R$styleable.LinearLayoutCompat_android_baselineAligned, true);
/* 70 */            if (!z) {
/* 72 */                setBaselineAligned(z);
                    }
/* 83 */            this.f564i = typedArray.getFloat(R$styleable.LinearLayoutCompat_android_weightSum, -1.0f);
/* 91 */            this.f557b = typedArray.getInt(R$styleable.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
/* 99 */            this.f565v = typedArray.getBoolean(R$styleable.LinearLayoutCompat_measureWithLargestChild, false);
/* 107 */           setDividerDrawable(ac1VarM156H.m184n(R$styleable.LinearLayoutCompat_divider));
/* 116 */           this.f558b0 = typedArray.getInt(R$styleable.LinearLayoutCompat_showDividers, 0);
/* 124 */           this.f560c0 = typedArray.getDimensionPixelSize(R$styleable.LinearLayoutCompat_dividerPadding, 0);
/* 126 */           ac1VarM156H.m168J();
                }

                @Override // android.view.ViewGroup
                public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
/* 1 */             return layoutParams instanceof LayoutParams;
                }

                /* JADX INFO: renamed from: d */
                public final void m362d(Canvas canvas, int i) {
/* 25 */            this.f553V.setBounds(getPaddingLeft() + this.f560c0, i, (getWidth() - getPaddingRight()) - this.f560c0, this.f556a0 + i);
/* 30 */            this.f553V.draw(canvas);
                }

                /* JADX INFO: renamed from: e */
                public final void m363e(Canvas canvas, int i) {
/* 25 */            this.f553V.setBounds(i, getPaddingTop() + this.f560c0, this.f554W + i, (getHeight() - getPaddingBottom()) - this.f560c0);
/* 30 */            this.f553V.draw(canvas);
                }

                @Override // android.view.ViewGroup
                /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
                public LayoutParams generateDefaultLayoutParams() {
/* 1 */             int i = this.f561d;
/* 4 */             if (i == 0) {
/* 8 */                 return new LayoutParams(-2, -2);
                    }
/* 13 */            if (i == 1) {
/* 18 */                return new LayoutParams(-1, -2);
                    }
/* 22 */            return null;
                }

                @Override // android.view.ViewGroup
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
/* 7 */             return new LayoutParams(getContext(), attributeSet);
                }

                @Override // android.view.View
                public int getBaseline() {
                    int i;
/* 3 */             if (this.f557b < 0) {
/* 5 */                 return super.getBaseline();
                    }
/* 10 */            int childCount = getChildCount();
/* 14 */            int i2 = this.f557b;
/* 17 */            if (childCount <= i2) {
/* 121 */               f42.m3663s("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
/* 16 */                return 0;
                    }
/* 19 */            View childAt = getChildAt(i2);
/* 23 */            int baseline = childAt.getBaseline();
/* 28 */            if (baseline == -1) {
/* 32 */                if (this.f557b == 0) {
/* 27 */                    return -1;
                        }
/* 37 */                f42.m3663s("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
/* 16 */                return 0;
                    }
/* 41 */            int bottom = this.f559c;
/* 46 */            if (this.f561d == 1 && (i = this.f562e & 112) != 48) {
/* 58 */                if (i == 16) {
/* 107 */                   bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f563f) / 2;
                        } else if (i == 80) {
/* 81 */                    bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f563f;
                        }
                    }
/* 117 */           return bottom + ((LinearLayout.LayoutParams) ((LayoutParams) childAt.getLayoutParams())).topMargin + baseline;
                }

                public int getBaselineAlignedChildIndex() {
/* 1 */             return this.f557b;
                }

                public Drawable getDividerDrawable() {
/* 1 */             return this.f553V;
                }

                public int getDividerPadding() {
/* 1 */             return this.f560c0;
                }

                public int getDividerWidth() {
/* 1 */             return this.f554W;
                }

                public int getGravity() {
/* 1 */             return this.f562e;
                }

                public int getOrientation() {
/* 1 */             return this.f561d;
                }

                public int getShowDividers() {
/* 1 */             return this.f558b0;
                }

                public int getVirtualChildCount() {
/* 1 */             return getChildCount();
                }

                public float getWeightSum() {
/* 1 */             return this.f564i;
                }

                @Override // android.view.ViewGroup
                /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
                public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
/* 3 */             if (layoutParams instanceof LayoutParams) {
/* 9 */                 return new LayoutParams((LayoutParams) layoutParams);
                    }
                    return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
                }

                /* JADX INFO: renamed from: i */
                public final boolean m364i(int i) {
/* 3 */             if (i == 0) {
                        return (this.f558b0 & 1) != 0;
                    }
/* 12 */            int childCount = getChildCount();
/* 16 */            int i2 = this.f558b0;
/* 18 */            if (i == childCount) {
                        return (i2 & 4) != 0;
                    }
/* 28 */            if ((i2 & 2) != 0) {
/* 31 */                for (int i3 = i - 1; i3 >= 0; i3--) {
/* 43 */                    if (getChildAt(i3).getVisibility() != 8) {
/* 2 */                         return true;
                            }
                        }
                    }
/* 1 */             return false;
                }

                @Override // android.view.View
                public final void onDraw(Canvas canvas) {
                    int right;
                    int left;
                    int i;
                    int bottom;
/* 3 */             if (this.f553V == null) {
/* 232 */               return;
                    }
/* 11 */            int i2 = 0;
/* 13 */            if (this.f561d == 1) {
/* 15 */                int virtualChildCount = getVirtualChildCount();
/* 19 */                while (i2 < virtualChildCount) {
/* 21 */                    View childAt = getChildAt(i2);
/* 25 */                    if (childAt != null && childAt.getVisibility() != 8 && m364i(i2)) {
/* 55 */                        m362d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((LayoutParams) childAt.getLayoutParams())).topMargin) - this.f556a0);
                            }
/* 58 */                    i2++;
                        }
/* 65 */                if (m364i(virtualChildCount)) {
/* 68 */                    View childAt2 = getChildAt(virtualChildCount - 1);
/* 72 */                    if (childAt2 == null) {
/* 85 */                        bottom = (getHeight() - getPaddingBottom()) - this.f556a0;
                            } else {
/* 99 */                        bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((LayoutParams) childAt2.getLayoutParams())).bottomMargin;
                            }
/* 100 */                   m362d(canvas, bottom);
/* 103 */                   return;
                        }
/* 232 */               return;
                    }
/* 104 */           int virtualChildCount2 = getVirtualChildCount();
/* 108 */           boolean z = m53.f13568a;
/* 118 */           boolean z2 = getLayoutDirection() == 1;
/* 119 */           while (i2 < virtualChildCount2) {
/* 121 */               View childAt3 = getChildAt(i2);
/* 125 */               if (childAt3 != null && childAt3.getVisibility() != 8 && m364i(i2)) {
/* 143 */                   LayoutParams layoutParams = (LayoutParams) childAt3.getLayoutParams();
/* 165 */                   m363e(canvas, z2 ? childAt3.getRight() + ((LinearLayout.LayoutParams) layoutParams).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) layoutParams).leftMargin) - this.f554W);
                        }
/* 168 */               i2++;
                    }
/* 175 */           if (m364i(virtualChildCount2)) {
/* 178 */               View childAt4 = getChildAt(virtualChildCount2 - 1);
/* 182 */               if (childAt4 != null) {
/* 208 */                   LayoutParams layoutParams2 = (LayoutParams) childAt4.getLayoutParams();
/* 210 */                   if (z2) {
/* 218 */                       left = childAt4.getLeft() - ((LinearLayout.LayoutParams) layoutParams2).leftMargin;
/* 219 */                       i = this.f554W;
/* 202 */                       right = left - i;
                            } else {
/* 228 */                       right = childAt4.getRight() + ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                            }
                        } else if (z2) {
/* 186 */                   right = getPaddingLeft();
                        } else {
/* 199 */                   left = getWidth() - getPaddingRight();
/* 200 */                   i = this.f554W;
/* 202 */                   right = left - i;
                        }
/* 229 */               m363e(canvas, right);
                    }
                }

                @Override // android.view.View
                public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
/* 1 */             super.onInitializeAccessibilityEvent(accessibilityEvent);
/* 6 */             accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
                }

                @Override // android.view.View
                public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
/* 1 */             super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
/* 6 */             accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
                }

                /* JADX WARN: Code duplicated, block: B:29:0x009d  */
                /* JADX WARN: Code duplicated, block: B:62:0x015a  */
                /* JADX WARN: Code duplicated, block: B:65:0x0163  */
                /* JADX WARN: Code duplicated, block: B:67:0x0167  */
                /* JADX WARN: Code duplicated, block: B:69:0x016b  */
                /* JADX WARN: Code duplicated, block: B:70:0x016f  */
                /* JADX WARN: Code duplicated, block: B:72:0x0177  */
                /* JADX WARN: Code duplicated, block: B:74:0x0183  */
                /* JADX WARN: Code duplicated, block: B:76:0x018a  */
                /* JADX WARN: Code duplicated, block: B:77:0x0191  */
                /* JADX WARN: Code duplicated, block: B:80:0x01a4  */
                /* JADX WARN: Code duplicated, block: B:81:0x01a9  */
                @Override // android.view.ViewGroup, android.view.View
                public void onLayout(boolean z, int i, int i2, int i3, int i4) {
                    int paddingLeft;
                    int i5;
                    int i6;
                    int i7;
                    int i8;
                    int baseline;
                    int i9;
                    int i10;
                    int i11;
                    int measuredHeight;
                    int i12;
                    int paddingTop;
                    int i13;
                    int i14;
                    int i15;
/* 6 */             int i16 = 8;
/* 15 */            char c = 2;
/* 17 */            if (this.f561d == 1) {
/* 19 */                int paddingLeft2 = getPaddingLeft();
/* 23 */                int i17 = i3 - i;
/* 29 */                int paddingRight = i17 - getPaddingRight();
/* 36 */                int paddingRight2 = (i17 - paddingLeft2) - getPaddingRight();
/* 37 */                int virtualChildCount = getVirtualChildCount();
/* 41 */                int i18 = this.f562e;
/* 43 */                int i19 = i18 & 112;
/* 45 */                int i20 = 8388615 & i18;
/* 46 */                if (i19 != 16) {
/* 65 */                    paddingTop = i19 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.f563f;
                        } else {
/* 77 */                    paddingTop = getPaddingTop() + (((i4 - i2) - this.f563f) / 2);
                        }
/* 78 */                int i21 = 0;
/* 79 */                while (i21 < virtualChildCount) {
/* 81 */                    View childAt = getChildAt(i21);
/* 85 */                    if (childAt != null && childAt.getVisibility() != i16) {
/* 96 */                        int measuredWidth = childAt.getMeasuredWidth();
/* 100 */                       int measuredHeight2 = childAt.getMeasuredHeight();
/* 108 */                       LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
/* 112 */                       int i22 = ((LinearLayout.LayoutParams) layoutParams).gravity;
/* 114 */                       if (i22 < 0) {
/* 116 */                           i22 = i20;
                                }
/* 125 */                       int absoluteGravity = Gravity.getAbsoluteGravity(i22, getLayoutDirection()) & 7;
/* 127 */                       if (absoluteGravity != 1) {
/* 129 */                           if (absoluteGravity != 5) {
/* 133 */                               i15 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + paddingLeft2;
                                    } else {
/* 135 */                               i13 = paddingRight - measuredWidth;
/* 137 */                               i14 = ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                                    }
/* 156 */                           if (m364i(i21)) {
/* 160 */                               paddingTop += this.f556a0;
                                    }
/* 163 */                           int i23 = paddingTop + ((LinearLayout.LayoutParams) layoutParams).topMargin;
/* 167 */                           childAt.layout(i15, i23, measuredWidth + i15, i23 + measuredHeight2);
/* 173 */                           paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + i23;
                                } else {
/* 148 */                           i13 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft2 + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
/* 149 */                           i14 = ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                                }
/* 139 */                       i15 = i13 - i14;
/* 156 */                       if (m364i(i21)) {
/* 160 */                           paddingTop += this.f556a0;
                                }
/* 163 */                       int i24 = paddingTop + ((LinearLayout.LayoutParams) layoutParams).topMargin;
/* 167 */                       childAt.layout(i15, i24, measuredWidth + i15, i24 + measuredHeight2);
/* 173 */                       paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + i24;
                            }
/* 175 */                   i21++;
/* 177 */                   c = c;
/* 179 */                   i16 = 8;
                        }
/* 461 */               return;
                    }
/* 184 */           boolean z2 = m53.f13568a;
/* 194 */           boolean z3 = getLayoutDirection() == 1;
/* 195 */           int paddingTop2 = getPaddingTop();
/* 199 */           int i25 = i4 - i2;
/* 205 */           int paddingBottom = i25 - getPaddingBottom();
/* 212 */           int paddingBottom2 = (i25 - paddingTop2) - getPaddingBottom();
/* 213 */           int virtualChildCount2 = getVirtualChildCount();
/* 217 */           int i26 = this.f562e;
/* 219 */           int i27 = 8388615 & i26;
/* 220 */           int i28 = i26 & 112;
/* 222 */           boolean z4 = this.f555a;
/* 224 */           int[] iArr = this.f566w;
/* 226 */           int[] iArr2 = this.f552U;
/* 232 */           int absoluteGravity2 = Gravity.getAbsoluteGravity(i27, getLayoutDirection());
/* 236 */           if (absoluteGravity2 != 1) {
/* 255 */               paddingLeft = absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i3) - i) - this.f563f;
                    } else {
/* 268 */               paddingLeft = getPaddingLeft() + (((i3 - i) - this.f563f) / 2);
                    }
/* 269 */           if (z3) {
/* 271 */               i6 = virtualChildCount2 - 1;
/* 273 */               i5 = -1;
                    } else {
/* 275 */               i5 = 1;
/* 276 */               i6 = 0;
                    }
/* 279 */           int i29 = 0;
/* 280 */           while (i29 < virtualChildCount2) {
/* 284 */               int i30 = (i5 * i29) + i6;
/* 286 */               View childAt2 = getChildAt(i30);
/* 290 */               if (childAt2 == null) {
/* 292 */                   i7 = i6;
                        } else {
/* 302 */                   i7 = i6;
/* 306 */                   if (childAt2.getVisibility() != 8) {
/* 308 */                       int measuredWidth2 = childAt2.getMeasuredWidth();
/* 312 */                       int measuredHeight3 = childAt2.getMeasuredHeight();
/* 322 */                       LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
/* 324 */                       int i31 = paddingLeft;
/* 326 */                       if (z4) {
/* 330 */                           i8 = paddingTop2;
/* 335 */                           baseline = ((LinearLayout.LayoutParams) layoutParams2).height != -1 ? childAt2.getBaseline() : -1;
/* 343 */                           i9 = ((LinearLayout.LayoutParams) layoutParams2).gravity;
/* 345 */                           if (i9 < 0) {
/* 347 */                               i9 = i28;
                                    }
/* 348 */                           i10 = i9 & 112;
/* 354 */                           if (i10 != 16) {
/* 358 */                               if (i10 != 48) {
/* 391 */                                   i11 = i8 + ((LinearLayout.LayoutParams) layoutParams2).topMargin;
/* 393 */                                   if (baseline != -1) {
/* 399 */                                       i11 = (iArr[1] - baseline) + i11;
                                            }
                                        } else if (i10 != 80) {
/* 364 */                                   i11 = i8;
                                        } else {
/* 372 */                                   i11 = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) layoutParams2).bottomMargin;
/* 374 */                                   if (baseline != -1) {
/* 384 */                                       measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                                            }
                                        }
/* 419 */                               if (m364i(i30)) {
/* 423 */                                   i12 = i31 + this.f554W;
                                        } else {
/* 426 */                                   i12 = i31;
                                        }
/* 430 */                               int i32 = i12 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin;
/* 435 */                               childAt2.layout(i32, i11, i32 + measuredWidth2, i11 + measuredHeight3);
/* 442 */                               paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) layoutParams2).rightMargin + i32;
                                    } else {
/* 411 */                               i11 = ((paddingBottom2 - measuredHeight3) / 2) + i8 + ((LinearLayout.LayoutParams) layoutParams2).topMargin;
/* 412 */                               measuredHeight = ((LinearLayout.LayoutParams) layoutParams2).bottomMargin;
                                    }
/* 386 */                           i11 -= measuredHeight;
/* 419 */                           if (m364i(i30)) {
/* 423 */                               i12 = i31 + this.f554W;
                                    } else {
/* 426 */                               i12 = i31;
                                    }
/* 430 */                           int i33 = i12 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin;
/* 435 */                           childAt2.layout(i33, i11, i33 + measuredWidth2, i11 + measuredHeight3);
/* 442 */                           paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) layoutParams2).rightMargin + i33;
                                } else {
/* 340 */                           i8 = paddingTop2;
                                }
/* 343 */                       i9 = ((LinearLayout.LayoutParams) layoutParams2).gravity;
/* 345 */                       if (i9 < 0) {
/* 347 */                           i9 = i28;
                                }
/* 348 */                       i10 = i9 & 112;
/* 354 */                       if (i10 != 16) {
/* 358 */                           if (i10 != 48) {
/* 391 */                               i11 = i8 + ((LinearLayout.LayoutParams) layoutParams2).topMargin;
/* 393 */                               if (baseline != -1) {
/* 399 */                                   i11 = (iArr[1] - baseline) + i11;
                                        }
                                    } else if (i10 != 80) {
/* 364 */                               i11 = i8;
                                    } else {
/* 372 */                               i11 = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) layoutParams2).bottomMargin;
/* 374 */                               if (baseline != -1) {
/* 384 */                                   measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                                        }
                                    }
/* 419 */                           if (m364i(i30)) {
/* 423 */                               i12 = i31 + this.f554W;
                                    } else {
/* 426 */                               i12 = i31;
                                    }
/* 430 */                           int i34 = i12 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin;
/* 435 */                           childAt2.layout(i34, i11, i34 + measuredWidth2, i11 + measuredHeight3);
/* 442 */                           paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) layoutParams2).rightMargin + i34;
                                } else {
/* 411 */                           i11 = ((paddingBottom2 - measuredHeight3) / 2) + i8 + ((LinearLayout.LayoutParams) layoutParams2).topMargin;
/* 412 */                           measuredHeight = ((LinearLayout.LayoutParams) layoutParams2).bottomMargin;
                                }
/* 386 */                       i11 -= measuredHeight;
/* 419 */                       if (m364i(i30)) {
/* 423 */                           i12 = i31 + this.f554W;
                                } else {
/* 426 */                           i12 = i31;
                                }
/* 430 */                       int i35 = i12 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin;
/* 435 */                       childAt2.layout(i35, i11, i35 + measuredWidth2, i11 + measuredHeight3);
/* 442 */                       paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) layoutParams2).rightMargin + i35;
                            }
/* 449 */                   i29++;
/* 451 */                   i6 = i7;
/* 453 */                   paddingTop2 = i8;
                        }
/* 294 */               i8 = paddingTop2;
/* 449 */               i29++;
/* 451 */               i6 = i7;
/* 453 */               paddingTop2 = i8;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:229:0x04dc  */
                /* JADX WARN: Code duplicated, block: B:232:0x04f1  */
                /* JADX WARN: Code duplicated, block: B:234:0x04fa  */
                /* JADX WARN: Code duplicated, block: B:236:0x04fe  */
                /* JADX WARN: Code duplicated, block: B:238:0x051f  */
                /* JADX WARN: Code duplicated, block: B:244:0x052f  */
                /* JADX WARN: Code duplicated, block: B:247:0x0536 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:249:0x0539  */
                /* JADX WARN: Code duplicated, block: B:251:0x0540 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:253:0x0543  */
                /* JADX WARN: Code duplicated, block: B:368:0x0791  */
                /* JADX WARN: Code duplicated, block: B:64:0x013d A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:66:0x0140  */
                /* JADX WARN: Code duplicated, block: B:68:0x0146 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:70:0x0149  */
                @Override // android.view.View
                public void onMeasure(int i, int i2) {
                    int i3;
                    int i4;
                    int i5;
                    int iMax;
                    int i6;
                    int baseline;
                    int i7;
                    int i8;
                    int[] iArr;
                    int i9;
                    int i10;
                    boolean z;
                    boolean z2;
                    LayoutParams layoutParams;
                    View view;
                    int i11;
                    int[] iArr2;
                    int i12;
                    int i13;
                    boolean z3;
                    int i14;
                    int measuredHeight;
                    boolean z4;
                    boolean z5;
                    int iMax2;
                    int i15;
                    int baseline2;
                    int i16;
                    int i17;
                    int i18;
                    int i19;
                    int i20;
                    boolean z6;
                    int i21;
                    int i22;
                    int i23;
                    View view2;
                    boolean z7;
/* 1 */             LinearLayoutCompat linearLayoutCompat = this;
/* 5 */             int i24 = -2;
/* 6 */             int iMax3 = 0;
/* 7 */             int i25 = 1073741824;
/* 9 */             int i26 = 8;
/* 12 */            if (linearLayoutCompat.f561d == 1) {
/* 14 */                linearLayoutCompat.f563f = 0;
/* 16 */                int virtualChildCount = linearLayoutCompat.getVirtualChildCount();
/* 20 */                int mode = View.MeasureSpec.getMode(i);
/* 24 */                int mode2 = View.MeasureSpec.getMode(i2);
/* 28 */                int i27 = linearLayoutCompat.f557b;
/* 30 */                boolean z8 = linearLayoutCompat.f565v;
/* 32 */                int i28 = 0;
/* 33 */                int iMax4 = 0;
/* 34 */                int iMax5 = 0;
/* 35 */                boolean z9 = false;
/* 37 */                int i29 = 0;
/* 39 */                boolean z10 = false;
/* 43 */                boolean z11 = true;
/* 45 */                float f = 0.0f;
/* 52 */                int iMax6 = 0;
/* 54 */                while (i28 < virtualChildCount) {
/* 56 */                    int i30 = mode;
/* 58 */                    View childAt = linearLayoutCompat.getChildAt(i28);
/* 62 */                    if (childAt == null) {
/* 66 */                        linearLayoutCompat.f563f = linearLayoutCompat.f563f;
                            } else {
/* 86 */                        if (childAt.getVisibility() != i26) {
/* 93 */                            if (linearLayoutCompat.m364i(i28)) {
/* 100 */                               linearLayoutCompat.f563f += linearLayoutCompat.f556a0;
                                    }
/* 106 */                           LayoutParams layoutParams2 = (LayoutParams) childAt.getLayoutParams();
/* 108 */                           float f2 = ((LinearLayout.LayoutParams) layoutParams2).weight;
/* 110 */                           f += f2;
/* 112 */                           if (mode2 == i25 && ((LinearLayout.LayoutParams) layoutParams2).height == 0 && f2 > 0.0f) {
/* 122 */                               int i31 = linearLayoutCompat.f563f;
/* 134 */                               linearLayoutCompat.f563f = Math.max(i31, ((LinearLayout.LayoutParams) layoutParams2).topMargin + i31 + ((LinearLayout.LayoutParams) layoutParams2).bottomMargin);
/* 136 */                               view2 = childAt;
/* 138 */                               i20 = mode2;
/* 140 */                               i21 = i27;
/* 141 */                               z6 = z8;
/* 143 */                               i22 = i28;
/* 144 */                               z9 = true;
/* 146 */                               i23 = i30;
                                    } else {
/* 155 */                               if (((LinearLayout.LayoutParams) layoutParams2).height != 0 || f2 <= 0.0f) {
/* 165 */                                   i19 = Integer.MIN_VALUE;
                                        } else {
/* 161 */                                   ((LinearLayout.LayoutParams) layoutParams2).height = i24;
/* 163 */                                   i19 = 0;
                                        }
/* 182 */                               i20 = mode2;
/* 184 */                               z6 = z8;
/* 186 */                               i21 = i27;
/* 191 */                               i22 = i28;
/* 192 */                               i23 = i30;
/* 194 */                               linearLayoutCompat.measureChildWithMargins(childAt, i, 0, i2, f == 0.0f ? linearLayoutCompat.f563f : 0);
/* 199 */                               if (i19 != Integer.MIN_VALUE) {
/* 201 */                                   ((LinearLayout.LayoutParams) layoutParams2).height = i19;
                                        }
/* 203 */                               int measuredHeight2 = childAt.getMeasuredHeight();
/* 207 */                               int i32 = linearLayoutCompat.f563f;
/* 211 */                               view2 = childAt;
/* 223 */                               linearLayoutCompat.f563f = Math.max(i32, i32 + measuredHeight2 + ((LinearLayout.LayoutParams) layoutParams2).topMargin + ((LinearLayout.LayoutParams) layoutParams2).bottomMargin);
/* 225 */                               if (z6) {
/* 227 */                                   iMax6 = Math.max(measuredHeight2, iMax6);
                                        }
                                    }
/* 231 */                           if (i21 >= 0 && i21 == i22 + 1) {
/* 239 */                               linearLayoutCompat.f559c = linearLayoutCompat.f563f;
                                    }
/* 241 */                           if (i22 < i21 && ((LinearLayout.LayoutParams) layoutParams2).weight > 0.0f) {
/* 254 */                               f42.m3663s("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
/* 257 */                               return;
                                    }
/* 258 */                           if (i23 == 1073741824 || ((LinearLayout.LayoutParams) layoutParams2).width != -1) {
/* 270 */                               z7 = false;
                                    } else {
/* 265 */                               z7 = true;
/* 267 */                               z10 = true;
                                    }
/* 275 */                           int i33 = ((LinearLayout.LayoutParams) layoutParams2).leftMargin + ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
/* 280 */                           int measuredWidth = view2.getMeasuredWidth() + i33;
/* 281 */                           iMax3 = Math.max(iMax3, measuredWidth);
/* 285 */                           int measuredState = view2.getMeasuredState();
/* 289 */                           boolean z12 = z7;
/* 293 */                           int iCombineMeasuredStates = View.combineMeasuredStates(i29, measuredState);
/* 297 */                           if (z11) {
/* 301 */                               i29 = iCombineMeasuredStates;
/* 304 */                               boolean z13 = ((LinearLayout.LayoutParams) layoutParams2).width == -1;
/* 316 */                               if (((LinearLayout.LayoutParams) layoutParams2).weight > 0.0f) {
/* 318 */                                   if (!z12) {
/* 321 */                                       i33 = measuredWidth;
                                            }
/* 322 */                                   iMax5 = Math.max(iMax5, i33);
                                        } else {
/* 327 */                                   if (!z12) {
/* 330 */                                       i33 = measuredWidth;
                                            }
/* 331 */                                   iMax4 = Math.max(iMax4, i33);
                                        }
/* 335 */                               z11 = z13;
                                    } else {
/* 309 */                               i29 = iCombineMeasuredStates;
                                    }
/* 316 */                           if (((LinearLayout.LayoutParams) layoutParams2).weight > 0.0f) {
/* 318 */                               if (!z12) {
/* 321 */                                   i33 = measuredWidth;
                                        }
/* 322 */                               iMax5 = Math.max(iMax5, i33);
                                    } else {
/* 327 */                               if (!z12) {
/* 330 */                                   i33 = measuredWidth;
                                        }
/* 331 */                               iMax4 = Math.max(iMax4, i33);
                                    }
/* 335 */                           z11 = z13;
                                }
/* 337 */                       i28 = i22 + 1;
/* 339 */                       i27 = i21;
/* 340 */                       mode = i23;
/* 341 */                       z8 = z6;
/* 343 */                       mode2 = i20;
/* 345 */                       i24 = -2;
/* 346 */                       i25 = 1073741824;
/* 348 */                       i26 = 8;
                            }
/* 68 */                    i20 = mode2;
/* 70 */                    i21 = i27;
/* 71 */                    z6 = z8;
/* 73 */                    i22 = i28;
/* 74 */                    i23 = i30;
/* 337 */                   i28 = i22 + 1;
/* 339 */                   i27 = i21;
/* 340 */                   mode = i23;
/* 341 */                   z8 = z6;
/* 343 */                   mode2 = i20;
/* 345 */                   i24 = -2;
/* 346 */                   i25 = 1073741824;
/* 348 */                   i26 = 8;
                        }
/* 352 */               int i34 = mode;
/* 353 */               int i35 = mode2;
/* 355 */               boolean z14 = z8;
/* 357 */               int i36 = i29;
/* 361 */               int i37 = i2;
/* 365 */               if (linearLayoutCompat.f563f > 0 && linearLayoutCompat.m364i(virtualChildCount)) {
/* 378 */                   linearLayoutCompat.f563f += linearLayoutCompat.f556a0;
                        }
/* 382 */               if (z14 && (i35 == Integer.MIN_VALUE || i35 == 0)) {
/* 391 */                   linearLayoutCompat.f563f = 0;
/* 394 */                   for (int i38 = 0; i38 < virtualChildCount; i38++) {
/* 396 */                       View childAt2 = linearLayoutCompat.getChildAt(i38);
/* 400 */                       if (childAt2 == null) {
/* 404 */                           linearLayoutCompat.f563f = linearLayoutCompat.f563f;
                                } else if (childAt2.getVisibility() != 8) {
/* 420 */                           LayoutParams layoutParams3 = (LayoutParams) childAt2.getLayoutParams();
/* 422 */                           int i39 = linearLayoutCompat.f563f;
/* 436 */                           linearLayoutCompat.f563f = Math.max(i39, i39 + iMax6 + ((LinearLayout.LayoutParams) layoutParams3).topMargin + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin);
                                }
                            }
                        }
/* 452 */               int paddingBottom = linearLayoutCompat.getPaddingBottom() + linearLayoutCompat.getPaddingTop() + linearLayoutCompat.f563f;
/* 453 */               linearLayoutCompat.f563f = paddingBottom;
/* 464 */               int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, linearLayoutCompat.getSuggestedMinimumHeight()), i37, 0);
/* 472 */               int i40 = (iResolveSizeAndState & 16777215) - linearLayoutCompat.f563f;
/* 473 */               if (z9 || (i40 != 0 && f > 0.0f)) {
/* 542 */                   float f3 = linearLayoutCompat.f564i;
/* 546 */                   if (f3 > 0.0f) {
/* 548 */                       f = f3;
                            }
/* 551 */                   linearLayoutCompat.f563f = 0;
/* 553 */                   int iCombineMeasuredStates2 = i36;
/* 554 */                   int i41 = 0;
/* 555 */                   while (i41 < virtualChildCount) {
/* 557 */                       View childAt3 = linearLayoutCompat.getChildAt(i41);
/* 567 */                       if (childAt3.getVisibility() == 8) {
/* 569 */                           i41 = i41;
                                } else {
/* 577 */                           LayoutParams layoutParams4 = (LayoutParams) childAt3.getLayoutParams();
/* 579 */                           float f4 = ((LinearLayout.LayoutParams) layoutParams4).weight;
/* 583 */                           if (f4 > 0.0f) {
/* 589 */                               int i42 = (int) ((i40 * f4) / f);
/* 590 */                               f -= f4;
/* 592 */                               i40 -= i42;
/* 615 */                               int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, linearLayoutCompat.getPaddingRight() + linearLayoutCompat.getPaddingLeft() + ((LinearLayout.LayoutParams) layoutParams4).leftMargin + ((LinearLayout.LayoutParams) layoutParams4).rightMargin, ((LinearLayout.LayoutParams) layoutParams4).width);
/* 621 */                               if (((LinearLayout.LayoutParams) layoutParams4).height == 0) {
/* 623 */                                   i18 = 1073741824;
/* 625 */                                   if (i35 == 1073741824) {
/* 628 */                                       if (i42 <= 0) {
/* 631 */                                           i42 = 0;
                                                }
/* 636 */                                       childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i42, 1073741824));
                                            }
/* 664 */                                   iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                                        } else {
/* 640 */                                   i18 = 1073741824;
                                        }
/* 646 */                               int measuredHeight3 = childAt3.getMeasuredHeight() + i42;
/* 648 */                               if (measuredHeight3 < 0) {
/* 650 */                                   measuredHeight3 = 0;
                                        }
/* 655 */                               childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight3, i18));
/* 664 */                               iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                                    }
/* 675 */                           int i43 = ((LinearLayout.LayoutParams) layoutParams4).leftMargin + ((LinearLayout.LayoutParams) layoutParams4).rightMargin;
/* 680 */                           int measuredWidth2 = childAt3.getMeasuredWidth() + i43;
/* 681 */                           iMax3 = Math.max(iMax3, measuredWidth2);
/* 687 */                           if (i34 != 1073741824) {
/* 693 */                               i17 = -1;
/* 694 */                               if (((LinearLayout.LayoutParams) layoutParams4).width == -1) {
/* 696 */                                   measuredWidth2 = i43;
                                        }
                                    } else {
/* 699 */                               i17 = -1;
                                    }
/* 700 */                           iMax4 = Math.max(iMax4, measuredWidth2);
/* 713 */                           boolean z15 = z11 && ((LinearLayout.LayoutParams) layoutParams4).width == i17;
/* 714 */                           int i44 = linearLayoutCompat.f563f;
/* 731 */                           linearLayoutCompat.f563f = Math.max(i44, childAt3.getMeasuredHeight() + i44 + ((LinearLayout.LayoutParams) layoutParams4).topMargin + ((LinearLayout.LayoutParams) layoutParams4).bottomMargin);
/* 733 */                           z11 = z15;
                                }
/* 735 */                       i41++;
                            }
/* 751 */                   linearLayoutCompat.f563f = linearLayoutCompat.getPaddingBottom() + linearLayoutCompat.getPaddingTop() + linearLayoutCompat.f563f;
/* 753 */                   i36 = iCombineMeasuredStates2;
                        } else {
/* 482 */                   iMax4 = Math.max(iMax4, iMax5);
/* 486 */                   if (z14 && i35 != 1073741824) {
/* 493 */                       for (int i45 = 0; i45 < virtualChildCount; i45++) {
/* 495 */                           View childAt4 = linearLayoutCompat.getChildAt(i45);
/* 499 */                           if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((LayoutParams) childAt4.getLayoutParams())).weight > 0.0f) {
/* 536 */                               childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(iMax6, 1073741824));
                                    }
                                }
                            }
                        }
/* 754 */               if (z11 || i34 == 1073741824) {
/* 761 */                   iMax4 = iMax3;
                        }
/* 784 */               linearLayoutCompat.setMeasuredDimension(View.resolveSizeAndState(Math.max(linearLayoutCompat.getPaddingRight() + linearLayoutCompat.getPaddingLeft() + iMax4, linearLayoutCompat.getSuggestedMinimumWidth()), i, i36), iResolveSizeAndState);
/* 787 */               if (z10) {
/* 795 */                   int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(linearLayoutCompat.getMeasuredWidth(), 1073741824);
/* 799 */                   int i46 = 0;
/* 800 */                   while (i46 < virtualChildCount) {
/* 802 */                       View childAt5 = linearLayoutCompat.getChildAt(i46);
/* 812 */                       if (childAt5.getVisibility() != 8) {
/* 819 */                           LayoutParams layoutParams5 = (LayoutParams) childAt5.getLayoutParams();
/* 824 */                           if (((LinearLayout.LayoutParams) layoutParams5).width == -1) {
/* 826 */                               int i47 = ((LinearLayout.LayoutParams) layoutParams5).height;
/* 832 */                               ((LinearLayout.LayoutParams) layoutParams5).height = childAt5.getMeasuredHeight();
/* 836 */                               linearLayoutCompat.measureChildWithMargins(childAt5, iMakeMeasureSpec, 0, i37, 0);
/* 839 */                               ((LinearLayout.LayoutParams) layoutParams5).height = i47;
                                    }
                                }
/* 841 */                       i46++;
/* 843 */                       i37 = i2;
                            }
/* 2139 */                  return;
                        }
/* 2139 */              return;
                    }
/* 846 */           int i48 = i;
/* 856 */           linearLayoutCompat.f563f = 0;
/* 858 */           int virtualChildCount2 = linearLayoutCompat.getVirtualChildCount();
/* 862 */           int mode3 = View.MeasureSpec.getMode(i48);
/* 866 */           int mode4 = View.MeasureSpec.getMode(i2);
/* 873 */           if (linearLayoutCompat.f566w == null || linearLayoutCompat.f552U == null) {
/* 881 */               linearLayoutCompat.f566w = new int[4];
/* 885 */               linearLayoutCompat.f552U = new int[4];
                    }
/* 887 */           int[] iArr3 = linearLayoutCompat.f566w;
/* 889 */           int[] iArr4 = linearLayoutCompat.f552U;
/* 894 */           iArr3[3] = -1;
/* 896 */           char c = 2;
/* 897 */           iArr3[2] = -1;
/* 899 */           iArr3[1] = -1;
/* 903 */           iArr3[0] = -1;
/* 905 */           iArr4[3] = -1;
/* 907 */           iArr4[2] = -1;
/* 909 */           iArr4[1] = -1;
/* 911 */           iArr4[0] = -1;
/* 913 */           boolean z16 = linearLayoutCompat.f555a;
/* 915 */           boolean z17 = linearLayoutCompat.f565v;
/* 924 */           boolean z18 = mode3 == 1073741824;
/* 930 */           float f5 = 0.0f;
/* 932 */           boolean z19 = true;
/* 934 */           int i49 = 0;
/* 935 */           int i50 = 0;
/* 936 */           int i51 = 0;
/* 937 */           int iMax7 = 0;
/* 938 */           int iMax8 = 0;
/* 939 */           int iCombineMeasuredStates3 = 0;
/* 940 */           boolean z20 = false;
/* 942 */           boolean z21 = false;
/* 944 */           while (i49 < virtualChildCount2) {
/* 946 */               char c2 = c;
/* 948 */               View childAt6 = linearLayoutCompat.getChildAt(i49);
/* 952 */               if (childAt6 == null) {
/* 956 */                   linearLayoutCompat.f563f = linearLayoutCompat.f563f;
/* 958 */                   i10 = i49;
/* 960 */                   i15 = i51;
/* 961 */                   iArr2 = iArr3;
/* 963 */                   iArr = iArr4;
/* 965 */                   z = z16;
/* 967 */                   z2 = z17;
                        } else {
/* 977 */                   int i52 = i50;
/* 981 */                   if (childAt6.getVisibility() == 8) {
/* 983 */                       i48 = i;
/* 985 */                       i10 = i49;
/* 987 */                       i15 = i51;
/* 988 */                       iArr = iArr4;
/* 990 */                       z = z16;
/* 992 */                       z2 = z17;
/* 994 */                       i50 = i52;
/* 998 */                       iArr2 = iArr3;
                            } else {
/* 1006 */                      if (linearLayoutCompat.m364i(i49)) {
/* 1013 */                          linearLayoutCompat.f563f += linearLayoutCompat.f554W;
                                }
/* 1019 */                      LayoutParams layoutParams6 = (LayoutParams) childAt6.getLayoutParams();
/* 1021 */                      float f6 = ((LinearLayout.LayoutParams) layoutParams6).weight;
/* 1023 */                      f5 += f6;
/* 1025 */                      int i53 = i49;
/* 1029 */                      if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) layoutParams6).width == 0 && f6 > 0.0f) {
/* 1039 */                          int i54 = linearLayoutCompat.f563f;
/* 1041 */                          int i55 = ((LinearLayout.LayoutParams) layoutParams6).leftMargin;
/* 1043 */                          if (z18) {
/* 1052 */                              linearLayoutCompat.f563f = i55 + ((LinearLayout.LayoutParams) layoutParams6).rightMargin + i54;
                                    } else {
/* 1069 */                              linearLayoutCompat.f563f = Math.max(i54, i54 + i55 + ((LinearLayout.LayoutParams) layoutParams6).rightMargin);
                                    }
/* 1071 */                          if (z16) {
/* 1074 */                              int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
/* 1078 */                              childAt6.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
/* 1081 */                              view = childAt6;
/* 1083 */                              z = z16;
/* 1085 */                              z2 = z17;
/* 1087 */                              i11 = i52;
/* 1089 */                              i10 = i53;
/* 1091 */                              layoutParams = layoutParams6;
/* 1092 */                              iArr2 = iArr3;
/* 1094 */                              iArr = iArr4;
/* 1096 */                              i48 = i;
/* 1098 */                              i12 = i51;
/* 1099 */                              i9 = iMax7;
                                    } else {
/* 1104 */                              view = childAt6;
/* 1106 */                              z = z16;
/* 1108 */                              z2 = z17;
/* 1110 */                              z21 = true;
/* 1112 */                              i11 = i52;
/* 1114 */                              i10 = i53;
/* 1116 */                              i13 = 1073741824;
/* 1118 */                              layoutParams = layoutParams6;
/* 1119 */                              iArr2 = iArr3;
/* 1121 */                              iArr = iArr4;
/* 1123 */                              i48 = i;
/* 1125 */                              i12 = i51;
/* 1126 */                              i9 = iMax7;
                                    }
/* 1233 */                          if (mode4 == i13 && ((LinearLayout.LayoutParams) layoutParams).height == -1) {
/* 1240 */                              z3 = true;
/* 1242 */                              z20 = true;
                                    } else {
/* 1245 */                              z3 = false;
                                    }
/* 1250 */                          i14 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
/* 1255 */                          measuredHeight = view.getMeasuredHeight() + i14;
/* 1260 */                          iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
/* 1264 */                          if (z) {
/* 1266 */                              baseline2 = view.getBaseline();
/* 1270 */                              z4 = z3;
/* 1273 */                              if (baseline2 != -1) {
/* 1275 */                                  i16 = ((LinearLayout.LayoutParams) layoutParams).gravity;
/* 1277 */                                  if (i16 < 0) {
/* 1279 */                                      i16 = linearLayoutCompat.f562e;
                                            }
/* 1289 */                                  int i56 = (((i16 & 112) >> 4) & (-2)) >> 1;
/* 1299 */                                  iArr2[i56] = Math.max(iArr2[i56], baseline2);
/* 1309 */                                  iArr[i56] = Math.max(iArr[i56], measuredHeight - baseline2);
                                        }
                                    } else {
/* 1312 */                              z4 = z3;
                                    }
/* 1314 */                          int iMax9 = Math.max(i11, measuredHeight);
/* 1318 */                          if (z19 || ((LinearLayout.LayoutParams) layoutParams).height != -1) {
/* 1328 */                              z5 = false;
                                    } else {
/* 1325 */                              z5 = true;
                                    }
/* 1333 */                          if (((LinearLayout.LayoutParams) layoutParams).weight > 0.0f) {
/* 1335 */                              if (!z4) {
/* 1338 */                                  i14 = measuredHeight;
                                        }
/* 1339 */                              iMax7 = Math.max(i9, i14);
/* 1343 */                              iMax2 = i12;
                                    } else {
/* 1345 */                              if (!z4) {
/* 1348 */                                  i14 = measuredHeight;
                                        }
/* 1349 */                              iMax2 = Math.max(i12, i14);
/* 1353 */                              iMax7 = i9;
                                    }
/* 1354 */                          int i57 = iMax2;
/* 1356 */                          i50 = iMax9;
/* 1357 */                          i15 = i57;
/* 1359 */                          z19 = z5;
                                } else {
/* 1133 */                          if (((LinearLayout.LayoutParams) layoutParams6).width != 0 || f6 <= 0.0f) {
/* 1144 */                              i8 = Integer.MIN_VALUE;
                                    } else {
/* 1140 */                              ((LinearLayout.LayoutParams) layoutParams6).width = -2;
/* 1142 */                              i8 = 0;
                                    }
/* 1160 */                          iArr = iArr4;
/* 1162 */                          i9 = iMax7;
/* 1164 */                          i10 = i53;
/* 1166 */                          z = z16;
/* 1168 */                          z2 = z17;
/* 1170 */                          int i58 = i8;
/* 1171 */                          layoutParams = layoutParams6;
/* 1172 */                          view = childAt6;
/* 1173 */                          i11 = i52;
/* 1175 */                          i48 = i;
/* 1177 */                          iArr2 = iArr3;
/* 1179 */                          i12 = i51;
/* 1182 */                          linearLayoutCompat.measureChildWithMargins(view, i48, f5 == 0.0f ? linearLayoutCompat.f563f : 0, i2, 0);
/* 1187 */                          if (i58 != Integer.MIN_VALUE) {
/* 1189 */                              ((LinearLayout.LayoutParams) layoutParams).width = i58;
                                    }
/* 1191 */                          int measuredWidth3 = view.getMeasuredWidth();
/* 1195 */                          int i59 = linearLayoutCompat.f563f;
/* 1197 */                          int i60 = ((LinearLayout.LayoutParams) layoutParams).leftMargin;
/* 1199 */                          if (z18) {
/* 1208 */                              linearLayoutCompat.f563f = i60 + measuredWidth3 + ((LinearLayout.LayoutParams) layoutParams).rightMargin + i59;
                                    } else {
/* 1223 */                              linearLayoutCompat.f563f = Math.max(i59, i59 + measuredWidth3 + i60 + ((LinearLayout.LayoutParams) layoutParams).rightMargin);
                                    }
/* 1225 */                          if (z2) {
/* 1227 */                              iMax8 = Math.max(measuredWidth3, iMax8);
                                    }
                                }
/* 1231 */                      i13 = 1073741824;
/* 1233 */                      if (mode4 == i13) {
/* 1245 */                          z3 = false;
                                } else {
/* 1245 */                          z3 = false;
                                }
/* 1250 */                      i14 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
/* 1255 */                      measuredHeight = view.getMeasuredHeight() + i14;
/* 1260 */                      iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
/* 1264 */                      if (z) {
/* 1266 */                          baseline2 = view.getBaseline();
/* 1270 */                          z4 = z3;
/* 1273 */                          if (baseline2 != -1) {
/* 1275 */                              i16 = ((LinearLayout.LayoutParams) layoutParams).gravity;
/* 1277 */                              if (i16 < 0) {
/* 1279 */                                  i16 = linearLayoutCompat.f562e;
                                        }
/* 1289 */                              int i510 = (((i16 & 112) >> 4) & (-2)) >> 1;
/* 1299 */                              iArr2[i510] = Math.max(iArr2[i510], baseline2);
/* 1309 */                              iArr[i510] = Math.max(iArr[i510], measuredHeight - baseline2);
                                    }
                                } else {
/* 1312 */                          z4 = z3;
                                }
/* 1314 */                      int iMax10 = Math.max(i11, measuredHeight);
/* 1318 */                      if (z19) {
/* 1328 */                          z5 = false;
                                } else {
/* 1328 */                          z5 = false;
                                }
/* 1333 */                      if (((LinearLayout.LayoutParams) layoutParams).weight > 0.0f) {
/* 1335 */                          if (!z4) {
/* 1338 */                              i14 = measuredHeight;
                                    }
/* 1339 */                          iMax7 = Math.max(i9, i14);
/* 1343 */                          iMax2 = i12;
                                } else {
/* 1345 */                          if (!z4) {
/* 1348 */                              i14 = measuredHeight;
                                    }
/* 1349 */                          iMax2 = Math.max(i12, i14);
/* 1353 */                          iMax7 = i9;
                                }
/* 1354 */                      int i511 = iMax2;
/* 1356 */                      i50 = iMax10;
/* 1357 */                      i15 = i511;
/* 1359 */                      z19 = z5;
                            }
                        }
/* 1363 */              i51 = i15;
/* 1361 */              i49 = i10 + 1;
/* 1365 */              c = c2;
/* 1367 */              iArr3 = iArr2;
/* 1369 */              iArr4 = iArr;
/* 1371 */              z16 = z;
/* 1373 */              z17 = z2;
                    }
/* 1377 */          int[] iArr5 = iArr3;
/* 1379 */          int[] iArr6 = iArr4;
/* 1381 */          char c3 = c;
/* 1383 */          boolean z22 = z16;
/* 1385 */          boolean z23 = z17;
/* 1387 */          int i61 = i50;
/* 1388 */          int i62 = i51;
/* 1389 */          int i63 = iMax7;
/* 1394 */          if (linearLayoutCompat.f563f > 0 && linearLayoutCompat.m364i(virtualChildCount2)) {
/* 1407 */              linearLayoutCompat.f563f += linearLayoutCompat.f554W;
                    }
/* 1409 */          int i64 = iArr5[1];
/* 1472 */          int iMax11 = (i64 == -1 && iArr5[0] == -1 && iArr5[c3] == -1 && iArr5[3] == -1) ? i61 : Math.max(i61, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c3]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i64, iArr5[c3]))));
/* 1476 */          if (z23 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
/* 1485 */              linearLayoutCompat.f563f = 0;
/* 1488 */              for (int i65 = 0; i65 < virtualChildCount2; i65++) {
/* 1490 */                  View childAt7 = linearLayoutCompat.getChildAt(i65);
/* 1494 */                  if (childAt7 == null) {
/* 1498 */                      linearLayoutCompat.f563f = linearLayoutCompat.f563f;
                            } else if (childAt7.getVisibility() != 8) {
/* 1514 */                      LayoutParams layoutParams7 = (LayoutParams) childAt7.getLayoutParams();
/* 1516 */                      int i66 = linearLayoutCompat.f563f;
/* 1518 */                      if (z18) {
/* 1527 */                          linearLayoutCompat.f563f = ((LinearLayout.LayoutParams) layoutParams7).leftMargin + iMax8 + ((LinearLayout.LayoutParams) layoutParams7).rightMargin + i66;
                                } else {
/* 1542 */                          linearLayoutCompat.f563f = Math.max(i66, i66 + iMax8 + ((LinearLayout.LayoutParams) layoutParams7).leftMargin + ((LinearLayout.LayoutParams) layoutParams7).rightMargin);
                                }
                            }
                        }
                    }
/* 1558 */          int paddingRight = linearLayoutCompat.getPaddingRight() + linearLayoutCompat.getPaddingLeft() + linearLayoutCompat.f563f;
/* 1559 */          linearLayoutCompat.f563f = paddingRight;
/* 1570 */          int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, linearLayoutCompat.getSuggestedMinimumWidth()), i48, 0);
/* 1578 */          int i67 = (iResolveSizeAndState2 & 16777215) - linearLayoutCompat.f563f;
/* 1579 */          if (z21 || (i67 != 0 && f5 > 0.0f)) {
/* 1656 */              float f7 = linearLayoutCompat.f564i;
/* 1660 */              if (f7 > 0.0f) {
/* 1662 */                  f5 = f7;
                        }
/* 1666 */              iArr5[3] = -1;
/* 1668 */              iArr5[c3] = -1;
/* 1670 */              iArr5[1] = -1;
/* 1673 */              iArr5[0] = -1;
/* 1675 */              iArr6[3] = -1;
/* 1677 */              iArr6[c3] = -1;
/* 1679 */              iArr6[1] = -1;
/* 1681 */              iArr6[0] = -1;
/* 1683 */              linearLayoutCompat.f563f = 0;
/* 1685 */              iMax11 = -1;
/* 1686 */              int i68 = 0;
/* 1687 */              while (i68 < virtualChildCount2) {
/* 1689 */                  View childAt8 = linearLayoutCompat.getChildAt(i68);
/* 1693 */                  if (childAt8 == null || childAt8.getVisibility() == 8) {
/* 1703 */                      iResolveSizeAndState2 = iResolveSizeAndState2;
                            } else {
/* 1715 */                      LayoutParams layoutParams8 = (LayoutParams) childAt8.getLayoutParams();
/* 1717 */                      float f8 = ((LinearLayout.LayoutParams) layoutParams8).weight;
/* 1721 */                      if (f8 > 0.0f) {
/* 1729 */                          int i69 = (int) ((i67 * f8) / f5);
/* 1730 */                          f5 -= f8;
/* 1732 */                          i67 -= i69;
/* 1755 */                          int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, linearLayoutCompat.getPaddingBottom() + linearLayoutCompat.getPaddingTop() + ((LinearLayout.LayoutParams) layoutParams8).topMargin + ((LinearLayout.LayoutParams) layoutParams8).bottomMargin, ((LinearLayout.LayoutParams) layoutParams8).height);
/* 1761 */                          if (((LinearLayout.LayoutParams) layoutParams8).width == 0) {
/* 1763 */                              i7 = 1073741824;
/* 1765 */                              if (mode3 == 1073741824) {
/* 1768 */                                  if (i69 <= 0) {
/* 1771 */                                      i69 = 0;
                                            }
/* 1776 */                                  childAt8.measure(View.MeasureSpec.makeMeasureSpec(i69, 1073741824), childMeasureSpec2);
                                        }
/* 1804 */                              iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                                    } else {
/* 1780 */                              i7 = 1073741824;
                                    }
/* 1786 */                          int measuredWidth4 = childAt8.getMeasuredWidth() + i69;
/* 1788 */                          if (measuredWidth4 < 0) {
/* 1790 */                              measuredWidth4 = 0;
                                    }
/* 1795 */                          childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i7), childMeasureSpec2);
/* 1804 */                          iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                                }
/* 1813 */                      int i70 = linearLayoutCompat.f563f;
/* 1815 */                      if (z18) {
/* 1828 */                          linearLayoutCompat.f563f = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams8).leftMargin + ((LinearLayout.LayoutParams) layoutParams8).rightMargin + i70;
                                } else {
/* 1848 */                          linearLayoutCompat.f563f = Math.max(i70, childAt8.getMeasuredWidth() + i70 + ((LinearLayout.LayoutParams) layoutParams8).leftMargin + ((LinearLayout.LayoutParams) layoutParams8).rightMargin);
                                }
/* 1861 */                      boolean z24 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) layoutParams8).height == -1;
/* 1866 */                      int i71 = ((LinearLayout.LayoutParams) layoutParams8).topMargin + ((LinearLayout.LayoutParams) layoutParams8).bottomMargin;
/* 1871 */                      int measuredHeight4 = childAt8.getMeasuredHeight() + i71;
/* 1872 */                      iMax11 = Math.max(iMax11, measuredHeight4);
/* 1876 */                      if (!z24) {
/* 1879 */                          i71 = measuredHeight4;
                                }
/* 1880 */                      int iMax12 = Math.max(i62, i71);
/* 1884 */                      if (z19) {
/* 1888 */                          i6 = -1;
/* 1889 */                          boolean z25 = ((LinearLayout.LayoutParams) layoutParams8).height == -1;
/* 1896 */                          if (!z22 && (baseline = childAt8.getBaseline()) != i6) {
/* 1904 */                              int i72 = ((LinearLayout.LayoutParams) layoutParams8).gravity;
/* 1906 */                              if (i72 < 0) {
/* 1908 */                                  i72 = linearLayoutCompat.f562e;
                                        }
/* 1918 */                              int i73 = (((i72 & 112) >> 4) & (-2)) >> 1;
/* 1926 */                              iArr5[i73] = Math.max(iArr5[i73], baseline);
/* 1935 */                              iArr6[i73] = Math.max(iArr6[i73], measuredHeight4 - baseline);
                                    }
/* 1940 */                          z19 = z25;
/* 1942 */                          i62 = iMax12;
                                } else {
/* 1894 */                          i6 = -1;
                                }
/* 1896 */                      if (!z22) {
                                }
/* 1940 */                      z19 = z25;
/* 1942 */                      i62 = iMax12;
                            }
/* 1943 */                  i68++;
/* 1945 */                  iResolveSizeAndState2 = iResolveSizeAndState2;
                        }
/* 1949 */              i3 = iResolveSizeAndState2;
/* 1951 */              i4 = -16777216;
/* 1965 */              linearLayoutCompat.f563f = linearLayoutCompat.getPaddingRight() + linearLayoutCompat.getPaddingLeft() + linearLayoutCompat.f563f;
/* 1967 */              int i74 = iArr5[1];
/* 1970 */              if (i74 == -1 && iArr5[0] == -1 && iArr5[c3] == -1 && iArr5[3] == -1) {
/* 1987 */                  i5 = 0;
                        } else {
/* 1992 */                  i5 = 0;
/* 2031 */                  iMax11 = Math.max(iMax11, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c3]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i74, iArr5[c3]))));
                        }
/* 2036 */              iMax = i62;
                    } else {
/* 1588 */              iMax = Math.max(i62, i63);
/* 1592 */              if (z23 && mode3 != 1073741824) {
/* 1599 */                  for (int i75 = 0; i75 < virtualChildCount2; i75++) {
/* 1601 */                      View childAt9 = linearLayoutCompat.getChildAt(i75);
/* 1605 */                      if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((LayoutParams) childAt9.getLayoutParams())).weight > 0.0f) {
/* 1642 */                          childAt9.measure(View.MeasureSpec.makeMeasureSpec(iMax8, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                                }
                            }
                        }
/* 1648 */              i3 = iResolveSizeAndState2;
/* 1650 */              i4 = -16777216;
/* 1652 */              i5 = 0;
                    }
/* 2037 */          if (!z19 && mode4 != 1073741824) {
/* 2043 */              iMax11 = iMax;
                    }
/* 2072 */          linearLayoutCompat.setMeasuredDimension(i3 | (iCombineMeasuredStates3 & i4), View.resolveSizeAndState(Math.max(linearLayoutCompat.getPaddingBottom() + linearLayoutCompat.getPaddingTop() + iMax11, linearLayoutCompat.getSuggestedMinimumHeight()), i2, iCombineMeasuredStates3 << 16));
/* 2075 */          if (z20) {
/* 2083 */              int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(linearLayoutCompat.getMeasuredHeight(), 1073741824);
/* 2087 */              int i76 = i5;
/* 2089 */              while (i76 < virtualChildCount2) {
/* 2091 */                  View childAt10 = linearLayoutCompat.getChildAt(i76);
/* 2101 */                  if (childAt10.getVisibility() != 8) {
/* 2108 */                      LayoutParams layoutParams9 = (LayoutParams) childAt10.getLayoutParams();
/* 2113 */                      if (((LinearLayout.LayoutParams) layoutParams9).height == -1) {
/* 2115 */                          int i77 = ((LinearLayout.LayoutParams) layoutParams9).width;
/* 2121 */                          ((LinearLayout.LayoutParams) layoutParams9).width = childAt10.getMeasuredWidth();
/* 2125 */                          linearLayoutCompat.measureChildWithMargins(childAt10, i48, 0, iMakeMeasureSpec3, 0);
/* 2128 */                          ((LinearLayout.LayoutParams) layoutParams9).width = i77;
                                }
                            }
/* 2132 */                  i76++;
/* 2134 */                  linearLayoutCompat = this;
/* 2136 */                  i48 = i;
                        }
                    }
                }

                public void setBaselineAligned(boolean z) {
/* 1 */             this.f555a = z;
                }

                public void setBaselineAlignedChildIndex(int i) {
/* 1 */             if (i >= 0 && i < getChildCount()) {
/* 9 */                 this.f557b = i;
/* 11 */                return;
                    }
/* 40 */            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
                }

                public void setDividerDrawable(Drawable drawable) {
/* 3 */             if (drawable == this.f553V) {
/* 5 */                 return;
                    }
/* 6 */             this.f553V = drawable;
/* 9 */             if (drawable != null) {
/* 15 */                this.f554W = drawable.getIntrinsicWidth();
/* 21 */                this.f556a0 = drawable.getIntrinsicHeight();
                    } else {
/* 24 */                this.f554W = 0;
/* 26 */                this.f556a0 = 0;
                    }
/* 31 */            setWillNotDraw(drawable == null);
/* 34 */            requestLayout();
                }

                public void setDividerPadding(int i) {
/* 1 */             this.f560c0 = i;
                }

                public void setGravity(int i) {
/* 3 */             if (this.f562e != i) {
/* 9 */                 if ((8388615 & i) == 0) {
/* 14 */                    i |= 8388611;
                        }
/* 17 */                if ((i & 112) == 0) {
/* 19 */                    i |= 48;
                        }
/* 21 */                this.f562e = i;
/* 23 */                requestLayout();
                    }
                }

                public void setHorizontalGravity(int i) {
/* 4 */             int i2 = i & 8388615;
/* 5 */             int i3 = this.f562e;
/* 8 */             if ((8388615 & i3) != i2) {
/* 15 */                this.f562e = i2 | ((-8388616) & i3);
/* 17 */                requestLayout();
                    }
                }

                public void setMeasureWithLargestChildEnabled(boolean z) {
/* 1 */             this.f565v = z;
                }

                public void setOrientation(int i) {
/* 3 */             if (this.f561d != i) {
/* 5 */                 this.f561d = i;
/* 7 */                 requestLayout();
                    }
                }

                public void setShowDividers(int i) {
/* 3 */             if (i != this.f558b0) {
/* 5 */                 requestLayout();
                    }
/* 8 */             this.f558b0 = i;
                }

                public void setVerticalGravity(int i) {
/* 1 */             int i2 = i & 112;
/* 3 */             int i3 = this.f562e;
/* 7 */             if ((i3 & 112) != i2) {
/* 12 */                this.f562e = i2 | (i3 & (-113));
/* 14 */                requestLayout();
                    }
                }

                public void setWeightSum(float f) {
/* 6 */             this.f564i = Math.max(0.0f, f);
                }

                @Override // android.view.ViewGroup
                public final boolean shouldDelayChildPressedState() {
/* 1 */             return false;
                }

/* 129 */       public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
/* 130 */           this(context, attributeSet, 0);
                }
            }
