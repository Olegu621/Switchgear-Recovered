            package com.google.android.material.card;

            import android.R;
            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.TypedArray;
            import android.graphics.Rect;
            import android.graphics.RectF;
            import android.graphics.drawable.Drawable;
            import android.graphics.drawable.InsetDrawable;
            import android.graphics.drawable.RippleDrawable;
            import android.os.Build;
            import android.util.AttributeSet;
            import android.view.View;
            import android.view.accessibility.AccessibilityEvent;
            import android.view.accessibility.AccessibilityNodeInfo;
            import android.widget.Checkable;
            import androidx.cardview.widget.CardView;
            import com.google.android.material.R$attr;
            import com.google.android.material.R$style;
            import com.google.android.material.R$styleable;
            import p000.c52;
            import p000.de3;
            import p000.ed2;
            import p000.fd1;
            import p000.hd1;
            import p000.he3;
            import p000.mn0;
            import p000.rn2;
            import p000.s90;
            import p000.sc2;
            import p000.tc2;
            import p000.v00;
            import p000.xc1;
            import p000.xe2;
            import p000.zc1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 11 */    public class MaterialCardView extends CardView implements Checkable, ed2 {

                /* JADX INFO: renamed from: V */
                public static final int[] f4563V = {R.attr.state_checkable};

                /* JADX INFO: renamed from: W */
                public static final int[] f4564W = {R.attr.state_checked};

                /* JADX INFO: renamed from: a0 */
                public static final int[] f4565a0 = {R$attr.state_dragged};

                /* JADX INFO: renamed from: b0 */
                public static final int f4566b0 = R$style.Widget_MaterialComponents_CardView;

                /* JADX INFO: renamed from: U */
                public boolean f4567U;

                /* JADX INFO: renamed from: i */
                public final zc1 f4568i;

                /* JADX INFO: renamed from: v */
                public final boolean f4569v;

                /* JADX INFO: renamed from: w */
                public boolean f4570w;

                /* JADX WARN: Illegal instructions before constructor call */
                public MaterialCardView(Context context, AttributeSet attributeSet, int i) {
/* 1 */             int i2 = f4566b0;
/* 7 */             super(hd1.m4176a(context, attributeSet, i, i2), attributeSet, i);
/* 11 */            this.f4570w = false;
/* 13 */            this.f4567U = false;
/* 16 */            this.f4569v = true;
/* 28 */            TypedArray typedArrayM8213d = rn2.m8213d(getContext(), attributeSet, R$styleable.MaterialCardView, i, i2, new int[0]);
/* 34 */            zc1 zc1Var = new zc1(this, attributeSet, i);
/* 37 */            this.f4568i = zc1Var;
/* 39 */            ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
/* 43 */            fd1 fd1Var = zc1Var.f20074c;
/* 45 */            fd1Var.m3742n(cardBackgroundColor);
/* 66 */            zc1Var.f20073b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
/* 69 */            zc1Var.m10333i();
/* 72 */            MaterialCardView materialCardView = zc1Var.f20072a;
/* 80 */            ColorStateList colorStateListM3033o = de3.m3033o(materialCardView.getContext(), typedArrayM8213d, R$styleable.MaterialCardView_strokeColor);
/* 84 */            zc1Var.f20085n = colorStateListM3033o;
/* 86 */            if (colorStateListM3033o == null) {
/* 93 */                zc1Var.f20085n = ColorStateList.valueOf(-1);
                    }
/* 101 */           zc1Var.f20079h = typedArrayM8213d.getDimensionPixelSize(R$styleable.MaterialCardView_strokeWidth, 0);
/* 105 */           boolean z = typedArrayM8213d.getBoolean(R$styleable.MaterialCardView_android_checkable, false);
/* 109 */           zc1Var.f20090s = z;
/* 111 */           materialCardView.setLongClickable(z);
/* 124 */           zc1Var.f20083l = de3.m3033o(materialCardView.getContext(), typedArrayM8213d, R$styleable.MaterialCardView_checkedIconTint);
/* 136 */           zc1Var.m10330f(de3.m3035q(materialCardView.getContext(), typedArrayM8213d, R$styleable.MaterialCardView_checkedIcon));
/* 145 */           zc1Var.f20077f = typedArrayM8213d.getDimensionPixelSize(R$styleable.MaterialCardView_checkedIconSize, 0);
/* 153 */           zc1Var.f20076e = typedArrayM8213d.getDimensionPixelSize(R$styleable.MaterialCardView_checkedIconMargin, 0);
/* 164 */           zc1Var.f20078g = typedArrayM8213d.getInteger(R$styleable.MaterialCardView_checkedIconGravity, 8388661);
/* 172 */           ColorStateList colorStateListM3033o2 = de3.m3033o(materialCardView.getContext(), typedArrayM8213d, R$styleable.MaterialCardView_rippleColor);
/* 176 */           zc1Var.f20082k = colorStateListM3033o2;
/* 178 */           if (colorStateListM3033o2 == null) {
/* 190 */               zc1Var.f20082k = ColorStateList.valueOf(xe2.m9779q(R$attr.colorControlHighlight, materialCardView));
                    }
/* 198 */           ColorStateList colorStateListM3033o3 = de3.m3033o(materialCardView.getContext(), typedArrayM8213d, R$styleable.MaterialCardView_cardForegroundColor);
/* 204 */           colorStateListM3033o3 = colorStateListM3033o3 == null ? ColorStateList.valueOf(0) : colorStateListM3033o3;
/* 208 */           fd1 fd1Var2 = zc1Var.f20075d;
/* 210 */           fd1Var2.m3742n(colorStateListM3033o3);
/* 213 */           int[] iArr = c52.f2721a;
/* 215 */           RippleDrawable rippleDrawable = zc1Var.f20086o;
/* 217 */           if (rippleDrawable != null) {
/* 221 */               rippleDrawable.setColor(zc1Var.f20082k);
                    }
/* 228 */           fd1Var.m3741m(materialCardView.getCardElevation());
/* 231 */           float f = zc1Var.f20079h;
/* 234 */           ColorStateList colorStateList = zc1Var.f20085n;
/* 238 */           fd1Var2.f8151a.f7644j = f;
/* 240 */           fd1Var2.invalidateSelf();
/* 243 */           fd1Var2.m3747s(colorStateList);
/* 250 */           materialCardView.setBackgroundInternal(zc1Var.m10328d(fd1Var));
/* 259 */           Drawable drawableM10327c = materialCardView.isClickable() ? zc1Var.m10327c() : fd1Var2;
/* 263 */           zc1Var.f20080i = drawableM10327c;
/* 269 */           materialCardView.setForeground(zc1Var.m10328d(drawableM10327c));
/* 272 */           typedArrayM8213d.recycle();
                }

                private RectF getBoundsAsRectF() {
/* 3 */             RectF rectF = new RectF();
/* 14 */            rectF.set(this.f4568i.f20074c.getBounds());
/* 17 */            return rectF;
                }

                /* JADX INFO: renamed from: f */
                public final void m2277f() {
                    zc1 zc1Var;
                    RippleDrawable rippleDrawable;
/* 5 */             if (Build.VERSION.SDK_INT <= 26 || (rippleDrawable = (zc1Var = this.f4568i).f20086o) == null) {
/* 43 */                return;
                    }
/* 13 */            Rect bounds = rippleDrawable.getBounds();
/* 17 */            int i = bounds.bottom;
/* 29 */            zc1Var.f20086o.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
/* 40 */            zc1Var.f20086o.setBounds(bounds.left, bounds.top, bounds.right, i);
                }

                @Override // androidx.cardview.widget.CardView
                public ColorStateList getCardBackgroundColor() {
/* 7 */             return this.f4568i.f20074c.f8151a.f7637c;
                }

                public ColorStateList getCardForegroundColor() {
/* 7 */             return this.f4568i.f20075d.f8151a.f7637c;
                }

                public float getCardViewRadius() {
/* 1 */             return super.getRadius();
                }

                public Drawable getCheckedIcon() {
/* 3 */             return this.f4568i.f20081j;
                }

                public int getCheckedIconGravity() {
/* 3 */             return this.f4568i.f20078g;
                }

                public int getCheckedIconMargin() {
/* 3 */             return this.f4568i.f20076e;
                }

                public int getCheckedIconSize() {
/* 3 */             return this.f4568i.f20077f;
                }

                public ColorStateList getCheckedIconTint() {
/* 3 */             return this.f4568i.f20083l;
                }

                @Override // androidx.cardview.widget.CardView
                public int getContentPaddingBottom() {
/* 5 */             return this.f4568i.f20073b.bottom;
                }

                @Override // androidx.cardview.widget.CardView
                public int getContentPaddingLeft() {
/* 5 */             return this.f4568i.f20073b.left;
                }

                @Override // androidx.cardview.widget.CardView
                public int getContentPaddingRight() {
/* 5 */             return this.f4568i.f20073b.right;
                }

                @Override // androidx.cardview.widget.CardView
                public int getContentPaddingTop() {
/* 5 */             return this.f4568i.f20073b.top;
                }

                public float getProgress() {
/* 7 */             return this.f4568i.f20074c.f8151a.f7643i;
                }

                @Override // androidx.cardview.widget.CardView
                public float getRadius() {
/* 5 */             return this.f4568i.f20074c.m3737i();
                }

                public ColorStateList getRippleColor() {
/* 3 */             return this.f4568i.f20082k;
                }

                public tc2 getShapeAppearanceModel() {
/* 3 */             return this.f4568i.f20084m;
                }

                @Deprecated
                public int getStrokeColor() {
/* 3 */             ColorStateList colorStateList = this.f4568i.f20085n;
/* 5 */             if (colorStateList == null) {
/* 7 */                 return -1;
                    }
/* 9 */             return colorStateList.getDefaultColor();
                }

                public ColorStateList getStrokeColorStateList() {
/* 3 */             return this.f4568i.f20085n;
                }

                public int getStrokeWidth() {
/* 3 */             return this.f4568i.f20079h;
                }

                @Override // android.widget.Checkable
                public final boolean isChecked() {
/* 1 */             return this.f4570w;
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 8 */             he3.m4195r(this, this.f4568i.f20074c);
                }

                @Override // android.view.ViewGroup, android.view.View
                public final int[] onCreateDrawableState(int i) {
/* 3 */             int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 3);
/* 7 */             zc1 zc1Var = this.f4568i;
/* 9 */             if (zc1Var != null && zc1Var.f20090s) {
/* 17 */                View.mergeDrawableStates(iArrOnCreateDrawableState, f4563V);
                    }
/* 22 */            if (this.f4570w) {
/* 26 */                View.mergeDrawableStates(iArrOnCreateDrawableState, f4564W);
                    }
/* 31 */            if (this.f4567U) {
/* 35 */                View.mergeDrawableStates(iArrOnCreateDrawableState, f4565a0);
                    }
/* 38 */            return iArrOnCreateDrawableState;
                }

                @Override // android.view.View
                public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
/* 1 */             super.onInitializeAccessibilityEvent(accessibilityEvent);
/* 6 */             accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
/* 11 */            accessibilityEvent.setChecked(this.f4570w);
                }

                @Override // android.view.View
                public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
/* 1 */             super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
/* 6 */             accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
/* 9 */             zc1 zc1Var = this.f4568i;
/* 20 */            accessibilityNodeInfo.setCheckable(zc1Var != null && zc1Var.f20090s);
/* 27 */            accessibilityNodeInfo.setClickable(isClickable());
/* 32 */            accessibilityNodeInfo.setChecked(this.f4570w);
                }

                @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
                public final void onMeasure(int i, int i2) {
/* 1 */             super.onMeasure(i, i2);
/* 14 */            this.f4568i.m10329e(getMeasuredWidth(), getMeasuredHeight());
                }

                @Override // android.view.View
                public void setBackground(Drawable drawable) {
/* 1 */             setBackgroundDrawable(drawable);
                }

                @Override // android.view.View
                public void setBackgroundDrawable(Drawable drawable) {
/* 3 */             if (this.f4569v) {
/* 5 */                 zc1 zc1Var = this.f4568i;
/* 9 */                 if (!zc1Var.f20089r) {
/* 12 */                    zc1Var.f20089r = true;
                        }
/* 14 */                super.setBackgroundDrawable(drawable);
                    }
                }

                public void setBackgroundInternal(Drawable drawable) {
/* 1 */             super.setBackgroundDrawable(drawable);
                }

                @Override // androidx.cardview.widget.CardView
                public void setCardBackgroundColor(int i) {
/* 9 */             this.f4568i.f20074c.m3742n(ColorStateList.valueOf(i));
                }

                @Override // androidx.cardview.widget.CardView
                public void setCardElevation(float f) {
/* 1 */             super.setCardElevation(f);
/* 4 */             zc1 zc1Var = this.f4568i;
/* 14 */            zc1Var.f20074c.m3741m(zc1Var.f20072a.getCardElevation());
                }

                public void setCardForegroundColor(ColorStateList colorStateList) {
/* 3 */             fd1 fd1Var = this.f4568i.f20075d;
/* 5 */             if (colorStateList == null) {
/* 8 */                 colorStateList = ColorStateList.valueOf(0);
                    }
/* 12 */            fd1Var.m3742n(colorStateList);
                }

                public void setCheckable(boolean z) {
/* 3 */             this.f4568i.f20090s = z;
                }

                @Override // android.widget.Checkable
                public void setChecked(boolean z) {
/* 3 */             if (this.f4570w != z) {
/* 5 */                 toggle();
                    }
                }

                public void setCheckedIcon(Drawable drawable) {
/* 3 */             this.f4568i.m10330f(drawable);
                }

                public void setCheckedIconGravity(int i) {
/* 1 */             zc1 zc1Var = this.f4568i;
/* 5 */             if (zc1Var.f20078g != i) {
/* 7 */                 zc1Var.f20078g = i;
/* 9 */                 MaterialCardView materialCardView = zc1Var.f20072a;
/* 19 */                zc1Var.m10329e(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
                    }
                }

                public void setCheckedIconMargin(int i) {
/* 3 */             this.f4568i.f20076e = i;
                }

                public void setCheckedIconMarginResource(int i) {
/* 2 */             if (i != -1) {
/* 14 */                this.f4568i.f20076e = getResources().getDimensionPixelSize(i);
                    }
                }

                public void setCheckedIconResource(int i) {
/* 11 */            this.f4568i.m10330f(mn0.m6700p(getContext(), i));
                }

                public void setCheckedIconSize(int i) {
/* 3 */             this.f4568i.f20077f = i;
                }

                public void setCheckedIconSizeResource(int i) {
/* 1 */             if (i != 0) {
/* 13 */                this.f4568i.f20077f = getResources().getDimensionPixelSize(i);
                    }
                }

                public void setCheckedIconTint(ColorStateList colorStateList) {
/* 1 */             zc1 zc1Var = this.f4568i;
/* 3 */             zc1Var.f20083l = colorStateList;
/* 5 */             Drawable drawable = zc1Var.f20081j;
/* 7 */             if (drawable != null) {
/* 9 */                 s90.m8448h(drawable, colorStateList);
                    }
                }

                @Override // android.view.View
                public void setClickable(boolean z) {
/* 1 */             super.setClickable(z);
/* 4 */             zc1 zc1Var = this.f4568i;
/* 6 */             if (zc1Var != null) {
/* 8 */                 Drawable drawable = zc1Var.f20080i;
/* 10 */                MaterialCardView materialCardView = zc1Var.f20072a;
/* 23 */                Drawable drawableM10327c = materialCardView.isClickable() ? zc1Var.m10327c() : zc1Var.f20075d;
/* 25 */                zc1Var.f20080i = drawableM10327c;
/* 27 */                if (drawable != drawableM10327c) {
/* 35 */                    if (materialCardView.getForeground() instanceof InsetDrawable) {
/* 43 */                        ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawableM10327c);
                            } else {
/* 51 */                        materialCardView.setForeground(zc1Var.m10328d(drawableM10327c));
                            }
                        }
                    }
                }

                public void setDragged(boolean z) {
/* 3 */             if (this.f4567U != z) {
/* 5 */                 this.f4567U = z;
/* 7 */                 refreshDrawableState();
/* 10 */                m2277f();
/* 13 */                invalidate();
                    }
                }

                @Override // androidx.cardview.widget.CardView
                public void setMaxCardElevation(float f) {
/* 1 */             super.setMaxCardElevation(f);
/* 6 */             this.f4568i.m10334j();
                }

                public void setOnCheckedChangeListener(xc1 xc1Var) {
                }

                @Override // androidx.cardview.widget.CardView
                public void setPreventCornerOverlap(boolean z) {
/* 1 */             super.setPreventCornerOverlap(z);
/* 4 */             zc1 zc1Var = this.f4568i;
/* 6 */             zc1Var.m10334j();
/* 9 */             zc1Var.m10333i();
                }

                public void setProgress(float f) {
/* 1 */             zc1 zc1Var = this.f4568i;
/* 5 */             zc1Var.f20074c.m3743o(f);
/* 8 */             fd1 fd1Var = zc1Var.f20075d;
/* 10 */            if (fd1Var != null) {
/* 12 */                fd1Var.m3743o(f);
                    }
/* 15 */            fd1 fd1Var2 = zc1Var.f20088q;
/* 17 */            if (fd1Var2 != null) {
/* 19 */                fd1Var2.m3743o(f);
                    }
                }

                @Override // androidx.cardview.widget.CardView
                public void setRadius(float f) {
/* 1 */             super.setRadius(f);
/* 4 */             zc1 zc1Var = this.f4568i;
/* 8 */             sc2 sc2VarM8779f = zc1Var.f20084m.m8779f();
/* 12 */            sc2VarM8779f.m8479b(f);
/* 19 */            zc1Var.m10331g(sc2VarM8779f.m8478a());
/* 24 */            zc1Var.f20080i.invalidateSelf();
/* 31 */            if (zc1Var.m10332h() || (zc1Var.f20072a.getPreventCornerOverlap() && !zc1Var.f20074c.m3740l())) {
/* 49 */                zc1Var.m10333i();
                    }
/* 56 */            if (zc1Var.m10332h()) {
/* 58 */                zc1Var.m10334j();
                    }
                }

                public void setRippleColor(ColorStateList colorStateList) {
/* 1 */             zc1 zc1Var = this.f4568i;
/* 3 */             zc1Var.f20082k = colorStateList;
/* 5 */             int[] iArr = c52.f2721a;
/* 7 */             RippleDrawable rippleDrawable = zc1Var.f20086o;
/* 9 */             if (rippleDrawable != null) {
/* 11 */                rippleDrawable.setColor(colorStateList);
                    }
                }

                public void setRippleColorResource(int i) {
/* 5 */             ColorStateList colorStateList = v00.getColorStateList(getContext(), i);
/* 9 */             zc1 zc1Var = this.f4568i;
/* 11 */            zc1Var.f20082k = colorStateList;
/* 13 */            int[] iArr = c52.f2721a;
/* 15 */            RippleDrawable rippleDrawable = zc1Var.f20086o;
/* 17 */            if (rippleDrawable != null) {
/* 19 */                rippleDrawable.setColor(colorStateList);
                    }
                }

                @Override // p000.ed2
                public void setShapeAppearanceModel(tc2 tc2Var) {
/* 9 */             setClipToOutline(tc2Var.m8778e(getBoundsAsRectF()));
/* 14 */            this.f4568i.m10331g(tc2Var);
                }

                public void setStrokeColor(ColorStateList colorStateList) {
/* 1 */             zc1 zc1Var = this.f4568i;
/* 5 */             if (zc1Var.f20085n != colorStateList) {
/* 8 */                 zc1Var.f20085n = colorStateList;
/* 10 */                fd1 fd1Var = zc1Var.f20075d;
/* 17 */                fd1Var.f8151a.f7644j = zc1Var.f20079h;
/* 19 */                fd1Var.invalidateSelf();
/* 22 */                fd1Var.m3747s(colorStateList);
                    }
/* 25 */            invalidate();
                }

                public void setStrokeWidth(int i) {
/* 1 */             zc1 zc1Var = this.f4568i;
/* 5 */             if (i != zc1Var.f20079h) {
/* 8 */                 zc1Var.f20079h = i;
/* 10 */                fd1 fd1Var = zc1Var.f20075d;
/* 13 */                ColorStateList colorStateList = zc1Var.f20085n;
/* 17 */                fd1Var.f8151a.f7644j = i;
/* 19 */                fd1Var.invalidateSelf();
/* 22 */                fd1Var.m3747s(colorStateList);
                    }
/* 25 */            invalidate();
                }

                @Override // androidx.cardview.widget.CardView
                public void setUseCompatPadding(boolean z) {
/* 1 */             super.setUseCompatPadding(z);
/* 4 */             zc1 zc1Var = this.f4568i;
/* 6 */             zc1Var.m10334j();
/* 9 */             zc1Var.m10333i();
                }

                @Override // android.widget.Checkable
                public final void toggle() {
/* 1 */             zc1 zc1Var = this.f4568i;
/* 3 */             if (zc1Var != null && zc1Var.f20090s && isEnabled()) {
/* 19 */                this.f4570w = !this.f4570w;
/* 21 */                refreshDrawableState();
/* 24 */                m2277f();
/* 27 */                boolean z = this.f4570w;
/* 29 */                Drawable drawable = zc1Var.f20081j;
/* 31 */                if (drawable != null) {
/* 39 */                    drawable.setAlpha(z ? 255 : 0);
                        }
                    }
                }

                @Override // androidx.cardview.widget.CardView
/* 12 */        public void setCardBackgroundColor(ColorStateList colorStateList) {
/* 15 */            this.f4568i.f20074c.m3742n(colorStateList);
                }

/* 28 */        public void setStrokeColor(int i) {
/* 29 */            setStrokeColor(ColorStateList.valueOf(i));
                }

/* 275 */       public MaterialCardView(Context context, AttributeSet attributeSet) {
/* 276 */           this(context, attributeSet, R$attr.materialCardViewStyle);
                }
            }
