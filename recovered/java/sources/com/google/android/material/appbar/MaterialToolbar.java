            package com.google.android.material.appbar;

            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.TypedArray;
            import android.graphics.drawable.ColorDrawable;
            import android.graphics.drawable.Drawable;
            import android.util.AttributeSet;
            import android.util.Pair;
            import android.view.View;
            import android.widget.ImageView;
            import android.widget.TextView;
            import androidx.appcompat.widget.Toolbar;
            import com.google.android.material.R$attr;
            import com.google.android.material.R$style;
            import com.google.android.material.R$styleable;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.WeakHashMap;
            import p000.e33;
            import p000.fd1;
            import p000.hd1;
            import p000.he3;
            import p000.hu0;
            import p000.rn2;
            import p000.s23;
            import p000.s90;
            import p000.wa3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 144 */   public class MaterialToolbar extends Toolbar {

                /* JADX INFO: renamed from: N0 */
                public static final int f4395N0 = R$style.Widget_MaterialComponents_Toolbar;

                /* JADX INFO: renamed from: O0 */
                public static final ImageView.ScaleType[] f4396O0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

                /* JADX INFO: renamed from: I0 */
                public Integer f4397I0;

                /* JADX INFO: renamed from: J0 */
                public boolean f4398J0;

                /* JADX INFO: renamed from: K0 */
                public boolean f4399K0;

                /* JADX INFO: renamed from: L0 */
                public ImageView.ScaleType f4400L0;

                /* JADX INFO: renamed from: M0 */
                public Boolean f4401M0;

                /* JADX WARN: Illegal instructions before constructor call */
                public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
/* 1 */             int i2 = f4395N0;
/* 7 */             super(hd1.m4176a(context, attributeSet, i, i2), attributeSet, i);
/* 10 */            Context context2 = getContext();
/* 21 */            TypedArray typedArrayM8213d = rn2.m8213d(context2, attributeSet, R$styleable.MaterialToolbar, i, i2, new int[0]);
/* 32 */            if (typedArrayM8213d.hasValue(R$styleable.MaterialToolbar_navigationIconTint)) {
/* 40 */                setNavigationIconTint(typedArrayM8213d.getColor(R$styleable.MaterialToolbar_navigationIconTint, -1));
                    }
/* 49 */            this.f4398J0 = typedArrayM8213d.getBoolean(R$styleable.MaterialToolbar_titleCentered, false);
/* 57 */            this.f4399K0 = typedArrayM8213d.getBoolean(R$styleable.MaterialToolbar_subtitleCentered, false);
/* 61 */            int i3 = typedArrayM8213d.getInt(R$styleable.MaterialToolbar_logoScaleType, -1);
/* 65 */            if (i3 >= 0) {
/* 67 */                ImageView.ScaleType[] scaleTypeArr = f4396O0;
/* 70 */                if (i3 < scaleTypeArr.length) {
/* 74 */                    this.f4400L0 = scaleTypeArr[i3];
                        }
                    }
/* 82 */            if (typedArrayM8213d.hasValue(R$styleable.MaterialToolbar_logoAdjustViewBounds)) {
/* 94 */                this.f4401M0 = Boolean.valueOf(typedArrayM8213d.getBoolean(R$styleable.MaterialToolbar_logoAdjustViewBounds, false));
                    }
/* 96 */            typedArrayM8213d.recycle();
/* 99 */            Drawable background = getBackground();
/* 103 */           if (background == null || (background instanceof ColorDrawable)) {
/* 112 */               fd1 fd1Var = new fd1();
/* 127 */               fd1Var.m3742n(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
/* 130 */               fd1Var.m3739k(context2);
/* 133 */               WeakHashMap weakHashMap = e33.f7494a;
/* 139 */               fd1Var.m3741m(s23.m8371i(this));
/* 142 */               setBackground(fd1Var);
                    }
                }

                public ImageView.ScaleType getLogoScaleType() {
/* 1 */             return this.f4400L0;
                }

                public Integer getNavigationIconTint() {
/* 1 */             return this.f4397I0;
                }

                @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
                public final void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 4 */             he3.m4196s(this);
                }

                @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
                    ImageView imageView;
                    Drawable drawable;
/* 1 */             super.onLayout(z, i, i2, i3, i4);
/* 4 */             wa3 wa3Var = hu0.f9295c;
/* 9 */             ImageView imageView2 = null;
/* 10 */            if (this.f4398J0 || this.f4399K0) {
/* 22 */                ArrayList arrayListM4339h0 = hu0.m4339h0(this, getTitle());
/* 38 */                TextView textView = arrayListM4339h0.isEmpty() ? null : (TextView) Collections.min(arrayListM4339h0, wa3Var);
/* 44 */                ArrayList arrayListM4339h1 = hu0.m4339h0(this, getSubtitle());
/* 60 */                TextView textView2 = arrayListM4339h1.isEmpty() ? null : (TextView) Collections.max(arrayListM4339h1, wa3Var);
/* 62 */                if (textView != null || textView2 != null) {
/* 67 */                    int measuredWidth = getMeasuredWidth();
/* 71 */                    int i5 = measuredWidth / 2;
/* 73 */                    int paddingLeft = getPaddingLeft();
/* 81 */                    int paddingRight = measuredWidth - getPaddingRight();
/* 87 */                    for (int i6 = 0; i6 < getChildCount(); i6++) {
/* 89 */                        View childAt = getChildAt(i6);
/* 99 */                        if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
/* 109 */                           if (childAt.getRight() < i5 && childAt.getRight() > paddingLeft) {
/* 117 */                               paddingLeft = childAt.getRight();
                                    }
/* 125 */                           if (childAt.getLeft() > i5 && childAt.getLeft() < paddingRight) {
/* 133 */                               paddingRight = childAt.getLeft();
                                    }
                                }
                            }
/* 150 */                   Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
/* 155 */                   if (this.f4398J0 && textView != null) {
/* 159 */                       m2233w(textView, pair);
                            }
/* 164 */                   if (this.f4399K0 && textView2 != null) {
/* 168 */                       m2233w(textView2, pair);
                            }
                        }
                    }
/* 171 */           Drawable logo = getLogo();
/* 175 */           if (logo != null) {
/* 182 */               for (int i7 = 0; i7 < getChildCount(); i7++) {
/* 184 */                   View childAt2 = getChildAt(i7);
/* 190 */                   if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
/* 220 */                       imageView2 = imageView;
                                break;
                            }
                        }
                    }
/* 225 */           if (imageView2 != null) {
/* 227 */               Boolean bool = this.f4401M0;
/* 229 */               if (bool != null) {
/* 235 */                   imageView2.setAdjustViewBounds(bool.booleanValue());
                        }
/* 238 */               ImageView.ScaleType scaleType = this.f4400L0;
/* 240 */               if (scaleType != null) {
/* 242 */                   imageView2.setScaleType(scaleType);
                        }
                    }
                }

                @Override // android.view.View
                public void setElevation(float f) {
/* 1 */             super.setElevation(f);
/* 4 */             he3.m4190m(this, f);
                }

                public void setLogoAdjustViewBounds(boolean z) {
/* 1 */             Boolean bool = this.f4401M0;
/* 3 */             if (bool == null || bool.booleanValue() != z) {
/* 17 */                this.f4401M0 = Boolean.valueOf(z);
/* 19 */                requestLayout();
                    }
                }

                public void setLogoScaleType(ImageView.ScaleType scaleType) {
/* 3 */             if (this.f4400L0 != scaleType) {
/* 5 */                 this.f4400L0 = scaleType;
/* 7 */                 requestLayout();
                    }
                }

                @Override // androidx.appcompat.widget.Toolbar
                public void setNavigationIcon(Drawable drawable) {
/* 1 */             if (drawable != null && this.f4397I0 != null) {
/* 7 */                 drawable = drawable.mutate();
/* 17 */                s90.m8447g(drawable, this.f4397I0.intValue());
                    }
/* 20 */            super.setNavigationIcon(drawable);
                }

                public void setNavigationIconTint(int i) {
/* 5 */             this.f4397I0 = Integer.valueOf(i);
/* 7 */             Drawable navigationIcon = getNavigationIcon();
/* 11 */            if (navigationIcon != null) {
/* 13 */                setNavigationIcon(navigationIcon);
                    }
                }

                public void setSubtitleCentered(boolean z) {
/* 3 */             if (this.f4399K0 != z) {
/* 5 */                 this.f4399K0 = z;
/* 7 */                 requestLayout();
                    }
                }

                public void setTitleCentered(boolean z) {
/* 3 */             if (this.f4398J0 != z) {
/* 5 */                 this.f4398J0 = z;
/* 7 */                 requestLayout();
                    }
                }

                /* JADX INFO: renamed from: w */
                public final void m2233w(TextView textView, Pair pair) {
/* 1 */             int measuredWidth = getMeasuredWidth();
/* 5 */             int measuredWidth2 = textView.getMeasuredWidth();
/* 13 */            int i = (measuredWidth / 2) - (measuredWidth2 / 2);
/* 14 */            int i2 = measuredWidth2 + i;
/* 43 */            int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
/* 47 */            if (iMax > 0) {
/* 49 */                i += iMax;
/* 50 */                i2 -= iMax;
/* 63 */                textView.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), textView.getMeasuredHeightAndState());
                    }
/* 74 */            textView.layout(i, textView.getTop(), i2, textView.getBottom());
                }

/* 145 */       public MaterialToolbar(Context context, AttributeSet attributeSet) {
/* 146 */           this(context, attributeSet, R$attr.toolbarStyle);
                }
            }
