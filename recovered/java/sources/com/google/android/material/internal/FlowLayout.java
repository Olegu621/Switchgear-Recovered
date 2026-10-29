            package com.google.android.material.internal;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.util.AttributeSet;
            import android.view.View;
            import android.view.ViewGroup;
            import com.google.android.material.R$id;
            import com.google.android.material.R$styleable;
            import java.util.WeakHashMap;
            import p000.AbstractC0208c9;
            import p000.e33;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 35 */    public class FlowLayout extends ViewGroup {

                /* JADX INFO: renamed from: a */
                public int f4785a;

                /* JADX INFO: renamed from: b */
                public int f4786b;

                /* JADX INFO: renamed from: c */
                public boolean f4787c;

                /* JADX INFO: renamed from: d */
                public int f4788d;

                public FlowLayout(Context context, AttributeSet attributeSet, int i) {
/* 1 */             super(context, attributeSet, i);
/* 5 */             this.f4787c = false;
/* 13 */            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.FlowLayout, 0, 0);
/* 23 */            this.f4785a = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.FlowLayout_lineSpacing, 0);
/* 31 */            this.f4786b = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.FlowLayout_itemSpacing, 0);
/* 33 */            typedArrayObtainStyledAttributes.recycle();
                }

                /* JADX INFO: renamed from: a */
                public boolean mo2286a() {
/* 1 */             return this.f4787c;
                }

                public int getItemSpacing() {
/* 1 */             return this.f4786b;
                }

                public int getLineSpacing() {
/* 1 */             return this.f4785a;
                }

                public int getRowCount() {
/* 1 */             return this.f4788d;
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
                    int marginEnd;
                    int marginStart;
/* 6 */             if (getChildCount() == 0) {
/* 8 */                 this.f4788d = 0;
/* 10 */                return;
                    }
/* 12 */            this.f4788d = 1;
/* 14 */            WeakHashMap weakHashMap = e33.f7494a;
/* 24 */            boolean z2 = getLayoutDirection() == 1;
/* 32 */            int paddingRight = z2 ? getPaddingRight() : getPaddingLeft();
/* 43 */            int paddingLeft = z2 ? getPaddingLeft() : getPaddingRight();
/* 47 */            int paddingTop = getPaddingTop();
/* 52 */            int i5 = (i3 - i) - paddingLeft;
/* 54 */            int measuredWidth = paddingRight;
/* 55 */            int i6 = paddingTop;
/* 60 */            for (int i7 = 0; i7 < getChildCount(); i7++) {
/* 62 */                View childAt = getChildAt(i7);
/* 72 */                if (childAt.getVisibility() == 8) {
/* 81 */                    childAt.setTag(R$id.row_index_key, -1);
                        } else {
/* 85 */                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
/* 91 */                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
/* 93 */                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
/* 95 */                        marginStart = marginLayoutParams.getMarginStart();
/* 99 */                        marginEnd = marginLayoutParams.getMarginEnd();
                            } else {
/* 104 */                       marginEnd = 0;
/* 105 */                       marginStart = 0;
                            }
/* 112 */                   int measuredWidth2 = childAt.getMeasuredWidth() + measuredWidth + marginStart;
/* 115 */                   if (!this.f4787c && measuredWidth2 > i5) {
/* 121 */                       i6 = this.f4785a + paddingTop;
/* 125 */                       this.f4788d++;
/* 127 */                       measuredWidth = paddingRight;
                            }
/* 137 */                   childAt.setTag(R$id.row_index_key, Integer.valueOf(this.f4788d - 1));
/* 140 */                   int i8 = measuredWidth + marginStart;
/* 146 */                   int measuredWidth3 = childAt.getMeasuredWidth() + i8;
/* 151 */                   int measuredHeight = childAt.getMeasuredHeight() + i6;
/* 152 */                   if (z2) {
/* 159 */                       childAt.layout(i5 - measuredWidth3, i6, (i5 - measuredWidth) - marginStart, measuredHeight);
                            } else {
/* 163 */                       childAt.layout(i8, i6, measuredWidth3, measuredHeight);
                            }
/* 175 */                   measuredWidth += childAt.getMeasuredWidth() + marginStart + marginEnd + this.f4786b;
/* 176 */                   paddingTop = measuredHeight;
                        }
                    }
                }

                @Override // android.view.View
                public final void onMeasure(int i, int i2) {
                    int i3;
                    int i4;
                    int i5;
/* 3 */             int size = View.MeasureSpec.getSize(i);
/* 7 */             int mode = View.MeasureSpec.getMode(i);
/* 11 */            int size2 = View.MeasureSpec.getSize(i2);
/* 15 */            int mode2 = View.MeasureSpec.getMode(i2);
/* 32 */            int i6 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : AbstractC0208c9.API_PRIORITY_OTHER;
/* 33 */            int paddingLeft = getPaddingLeft();
/* 37 */            int paddingTop = getPaddingTop();
/* 45 */            int paddingRight = i6 - getPaddingRight();
/* 46 */            int i7 = paddingTop;
/* 48 */            int i8 = 0;
/* 53 */            for (int i9 = 0; i9 < getChildCount(); i9++) {
/* 55 */                View childAt = getChildAt(i9);
/* 65 */                if (childAt.getVisibility() != 8) {
/* 76 */                    measureChild(childAt, i, i2);
/* 79 */                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
/* 85 */                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
/* 87 */                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
/* 89 */                        i5 = marginLayoutParams.leftMargin;
/* 91 */                        i4 = marginLayoutParams.rightMargin;
                            } else {
/* 94 */                        i4 = 0;
/* 95 */                        i5 = 0;
                            }
/* 102 */                   int i10 = i4;
/* 106 */                   if (childAt.getMeasuredWidth() + paddingLeft + i5 > paddingRight && !mo2286a()) {
/* 114 */                       paddingLeft = getPaddingLeft();
/* 120 */                       i7 = paddingTop + this.f4785a;
                            }
/* 128 */                   int measuredWidth = childAt.getMeasuredWidth() + paddingLeft + i5;
/* 133 */                   int measuredHeight = childAt.getMeasuredHeight() + i7;
/* 134 */                   if (measuredWidth > i8) {
/* 136 */                       i8 = measuredWidth;
                            }
/* 147 */                   int measuredWidth2 = childAt.getMeasuredWidth() + i5 + i10 + this.f4786b + paddingLeft;
/* 154 */                   if (i9 == getChildCount() - 1) {
/* 156 */                       i8 += i10;
                            }
/* 158 */                   paddingLeft = measuredWidth2;
/* 159 */                   paddingTop = measuredHeight;
                        }
                    }
/* 171 */           int paddingRight2 = getPaddingRight() + i8;
/* 176 */           int paddingBottom = getPaddingBottom() + paddingTop;
/* 179 */           if (mode != Integer.MIN_VALUE) {
/* 181 */               i3 = 1073741824;
/* 183 */               if (mode != 1073741824) {
/* 185 */                   size = paddingRight2;
                        }
                    } else {
/* 187 */               i3 = 1073741824;
/* 189 */               size = Math.min(paddingRight2, size);
                    }
/* 193 */           if (mode2 == Integer.MIN_VALUE) {
/* 199 */               size2 = Math.min(paddingBottom, size2);
                    } else if (mode2 != i3) {
/* 197 */               size2 = paddingBottom;
                    }
/* 203 */           setMeasuredDimension(size, size2);
                }

                public void setItemSpacing(int i) {
/* 1 */             this.f4786b = i;
                }

                public void setLineSpacing(int i) {
/* 1 */             this.f4785a = i;
                }

                public void setSingleLine(boolean z) {
/* 1 */             this.f4787c = z;
                }

/* 36 */        public FlowLayout(Context context, AttributeSet attributeSet) {
/* 37 */            this(context, attributeSet, 0);
                }
            }
