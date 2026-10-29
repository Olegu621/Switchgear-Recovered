            package p000;

            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.TypedArray;
            import android.graphics.PorterDuff;
            import android.graphics.Rect;
            import android.graphics.drawable.Drawable;
            import android.graphics.drawable.GradientDrawable;
            import android.util.AttributeSet;
            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.FrameLayout;
            import com.google.android.material.R$attr;
            import com.google.android.material.R$dimen;
            import com.google.android.material.R$styleable;
            import java.util.WeakHashMap;
            
            /* JADX INFO: renamed from: si */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC2182si extends FrameLayout {

                /* JADX INFO: renamed from: v */
                public static final ViewOnTouchListenerC2145ri f16637v = new ViewOnTouchListenerC2145ri(0);

                /* JADX INFO: renamed from: a */
                public int f16638a;

                /* JADX INFO: renamed from: b */
                public final float f16639b;

                /* JADX INFO: renamed from: c */
                public final float f16640c;

                /* JADX INFO: renamed from: d */
                public final int f16641d;

                /* JADX INFO: renamed from: e */
                public final int f16642e;

                /* JADX INFO: renamed from: f */
                public ColorStateList f16643f;

                /* JADX INFO: renamed from: i */
                public PorterDuff.Mode f16644i;

                public AbstractC2182si(Context context, AttributeSet attributeSet) {
/* 6 */             super(hd1.m4176a(context, attributeSet, 0, 0), attributeSet);
/* 9 */             Context context2 = getContext();
/* 15 */            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R$styleable.SnackbarLayout);
/* 25 */            if (typedArrayObtainStyledAttributes.hasValue(R$styleable.SnackbarLayout_elevation)) {
/* 29 */                float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SnackbarLayout_elevation, 0);
/* 34 */                WeakHashMap weakHashMap = e33.f7494a;
/* 36 */                s23.m8381s(this, dimensionPixelSize);
                    }
/* 45 */            this.f16638a = typedArrayObtainStyledAttributes.getInt(R$styleable.SnackbarLayout_animationMode, 0);
/* 55 */            this.f16639b = typedArrayObtainStyledAttributes.getFloat(R$styleable.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
/* 63 */            setBackgroundTintList(de3.m3033o(context2, typedArrayObtainStyledAttributes, R$styleable.SnackbarLayout_backgroundTint));
/* 79 */            setBackgroundTintMode(kb1.m6039O(typedArrayObtainStyledAttributes.getInt(R$styleable.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
/* 88 */            this.f16640c = typedArrayObtainStyledAttributes.getFloat(R$styleable.SnackbarLayout_actionTextColorAlpha, 1.0f);
/* 96 */            this.f16641d = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SnackbarLayout_android_maxWidth, -1);
/* 104 */           this.f16642e = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SnackbarLayout_maxActionInlineWidth, -1);
/* 106 */           typedArrayObtainStyledAttributes.recycle();
/* 111 */           setOnTouchListener(f16637v);
/* 115 */           setFocusable(true);
/* 122 */           if (getBackground() == null) {
/* 130 */               float dimension = getResources().getDimension(R$dimen.mtrl_snackbar_background_corner_radius);
/* 136 */               GradientDrawable gradientDrawable = new GradientDrawable();
/* 139 */               gradientDrawable.setShape(0);
/* 142 */               gradientDrawable.setCornerRadius(dimension);
/* 165 */               gradientDrawable.setColor(xe2.m9757A(xe2.m9779q(R$attr.colorSurface, this), getBackgroundOverlayColorAlpha(), xe2.m9779q(R$attr.colorOnSurface, this)));
/* 168 */               ColorStateList colorStateList = this.f16643f;
/* 170 */               if (colorStateList != null) {
/* 172 */                   s90.m8448h(gradientDrawable, colorStateList);
                        }
/* 175 */               WeakHashMap weakHashMap2 = e33.f7494a;
/* 177 */               setBackground(gradientDrawable);
                    }
                }

                private void setBaseTransientBottomBar(AbstractC2219ti abstractC2219ti) {
                }

                public float getActionTextColorAlpha() {
/* 1 */             return this.f16640c;
                }

                public int getAnimationMode() {
/* 1 */             return this.f16638a;
                }

                public float getBackgroundOverlayColorAlpha() {
/* 1 */             return this.f16639b;
                }

                public int getMaxInlineActionWidth() {
/* 1 */             return this.f16642e;
                }

                public int getMaxWidth() {
/* 1 */             return this.f16641d;
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 4 */             WeakHashMap weakHashMap = e33.f7494a;
/* 6 */             q23.m7679c(this);
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onDetachedFromWindow() {
/* 1 */             super.onDetachedFromWindow();
                }

                @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
/* 1 */             super.onLayout(z, i, i2, i3, i4);
                }

                @Override // android.widget.FrameLayout, android.view.View
                public void onMeasure(int i, int i2) {
/* 1 */             super.onMeasure(i, i2);
/* 4 */             int i3 = this.f16641d;
/* 6 */             if (i3 <= 0 || getMeasuredWidth() <= i3) {
/* 23 */                return;
                    }
/* 20 */            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }

                public void setAnimationMode(int i) {
/* 1 */             this.f16638a = i;
                }

                @Override // android.view.View
                public void setBackground(Drawable drawable) {
/* 1 */             setBackgroundDrawable(drawable);
                }

                @Override // android.view.View
                public void setBackgroundDrawable(Drawable drawable) {
/* 1 */             if (drawable != null && this.f16643f != null) {
/* 7 */                 drawable = drawable.mutate();
/* 13 */                s90.m8448h(drawable, this.f16643f);
/* 18 */                s90.m8449i(drawable, this.f16644i);
                    }
/* 21 */            super.setBackgroundDrawable(drawable);
                }

                @Override // android.view.View
                public void setBackgroundTintList(ColorStateList colorStateList) {
/* 1 */             this.f16643f = colorStateList;
/* 7 */             if (getBackground() != null) {
/* 13 */                Drawable drawableMutate = getBackground().mutate();
/* 17 */                s90.m8448h(drawableMutate, colorStateList);
/* 22 */                s90.m8449i(drawableMutate, this.f16644i);
/* 29 */                if (drawableMutate != getBackground()) {
/* 31 */                    super.setBackgroundDrawable(drawableMutate);
                        }
                    }
                }

                @Override // android.view.View
                public void setBackgroundTintMode(PorterDuff.Mode mode) {
/* 1 */             this.f16644i = mode;
/* 7 */             if (getBackground() != null) {
/* 13 */                Drawable drawableMutate = getBackground().mutate();
/* 17 */                s90.m8449i(drawableMutate, mode);
/* 24 */                if (drawableMutate != getBackground()) {
/* 26 */                    super.setBackgroundDrawable(drawableMutate);
                        }
                    }
                }

                @Override // android.view.View
                public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
/* 1 */             super.setLayoutParams(layoutParams);
/* 6 */             if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
/* 8 */                 ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
/* 20 */                new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                    }
                }

                @Override // android.view.View
                public void setOnClickListener(View.OnClickListener onClickListener) {
/* 7 */             setOnTouchListener(onClickListener != null ? null : f16637v);
/* 10 */            super.setOnClickListener(onClickListener);
                }
            }
