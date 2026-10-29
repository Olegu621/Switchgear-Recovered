            package androidx.cardview.widget;

            import android.R;
            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.TypedArray;
            import android.graphics.Color;
            import android.graphics.Rect;
            import android.util.AttributeSet;
            import android.widget.FrameLayout;
            import androidx.cardview.R$attr;
            import androidx.cardview.R$color;
            import androidx.cardview.R$style;
            import androidx.cardview.R$styleable;
            import p000.C0210cb;
            import p000.e52;
            import p000.mn0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 44 */    public class CardView extends FrameLayout {

                /* JADX INFO: renamed from: f */
                public static final int[] f813f = {R.attr.colorBackground};

                /* JADX INFO: renamed from: a */
                public boolean f814a;

                /* JADX INFO: renamed from: b */
                public boolean f815b;

                /* JADX INFO: renamed from: c */
                public final Rect f816c;

                /* JADX INFO: renamed from: d */
                public final Rect f817d;

                /* JADX INFO: renamed from: e */
                public final C0210cb f818e;

                public CardView(Context context, AttributeSet attributeSet, int i) {
                    ColorStateList colorStateListValueOf;
/* 1 */             super(context, attributeSet, i);
/* 6 */             Rect rect = new Rect();
/* 9 */             this.f816c = rect;
/* 16 */            this.f817d = new Rect();
/* 20 */            C0210cb c0210cb = new C0210cb(this);
/* 23 */            this.f818e = c0210cb;
/* 29 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CardView, i, R$style.CardView);
/* 40 */            if (typedArrayObtainStyledAttributes.hasValue(R$styleable.CardView_cardBackgroundColor)) {
/* 44 */                colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.CardView_cardBackgroundColor);
                    } else {
/* 55 */                TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f813f);
/* 59 */                int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
/* 63 */                typedArrayObtainStyledAttributes2.recycle();
/* 67 */                float[] fArr = new float[3];
/* 69 */                Color.colorToHSV(color, fArr);
/* 102 */               colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(R$color.cardview_light_background) : getResources().getColor(R$color.cardview_dark_background));
                    }
/* 109 */           float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.CardView_cardCornerRadius, 0.0f);
/* 115 */           float dimension2 = typedArrayObtainStyledAttributes.getDimension(R$styleable.CardView_cardElevation, 0.0f);
/* 121 */           float dimension3 = typedArrayObtainStyledAttributes.getDimension(R$styleable.CardView_cardMaxElevation, 0.0f);
/* 131 */           this.f814a = typedArrayObtainStyledAttributes.getBoolean(R$styleable.CardView_cardUseCompatPadding, false);
/* 140 */           this.f815b = typedArrayObtainStyledAttributes.getBoolean(R$styleable.CardView_cardPreventCornerOverlap, true);
/* 144 */           int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CardView_contentPadding, 0);
/* 154 */           rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CardView_contentPaddingLeft, dimensionPixelSize);
/* 162 */           rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CardView_contentPaddingTop, dimensionPixelSize);
/* 170 */           rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CardView_contentPaddingRight, dimensionPixelSize);
/* 178 */           rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CardView_contentPaddingBottom, dimensionPixelSize);
/* 182 */           dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
/* 187 */           typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CardView_android_minWidth, 0);
/* 192 */           typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CardView_android_minHeight, 0);
/* 195 */           typedArrayObtainStyledAttributes.recycle();
/* 200 */           e52 e52Var = new e52(colorStateListValueOf, dimension);
/* 203 */           c0210cb.f2804b = e52Var;
/* 205 */           setBackgroundDrawable(e52Var);
/* 208 */           setClipToOutline(true);
/* 211 */           setElevation(dimension2);
/* 214 */           mn0.m6709z(c0210cb, dimension3);
                }

                public ColorStateList getCardBackgroundColor() {
/* 7 */             return ((e52) this.f818e.f2804b).f7522h;
                }

                public float getCardElevation() {
/* 7 */             return ((CardView) this.f818e.f2805c).getElevation();
                }

                public int getContentPaddingBottom() {
/* 3 */             return this.f816c.bottom;
                }

                public int getContentPaddingLeft() {
/* 3 */             return this.f816c.left;
                }

                public int getContentPaddingRight() {
/* 3 */             return this.f816c.right;
                }

                public int getContentPaddingTop() {
/* 3 */             return this.f816c.top;
                }

                public float getMaxCardElevation() {
/* 7 */             return ((e52) this.f818e.f2804b).f7519e;
                }

                public boolean getPreventCornerOverlap() {
/* 1 */             return this.f815b;
                }

                public float getRadius() {
/* 7 */             return ((e52) this.f818e.f2804b).f7515a;
                }

                public boolean getUseCompatPadding() {
/* 1 */             return this.f814a;
                }

                @Override // android.widget.FrameLayout, android.view.View
                public void onMeasure(int i, int i2) {
/* 1 */             super.onMeasure(i, i2);
                }

                public void setCardBackgroundColor(int i) {
/* 1 */             ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
/* 9 */             e52 e52Var = (e52) this.f818e.f2804b;
/* 11 */            if (colorStateListValueOf == null) {
/* 13 */                e52Var.getClass();
/* 17 */                colorStateListValueOf = ColorStateList.valueOf(0);
                    }
/* 21 */            e52Var.f7522h = colorStateListValueOf;
/* 39 */            e52Var.f7516b.setColor(colorStateListValueOf.getColorForState(e52Var.getState(), e52Var.f7522h.getDefaultColor()));
/* 42 */            e52Var.invalidateSelf();
                }

                public void setCardElevation(float f) {
/* 7 */             ((CardView) this.f818e.f2805c).setElevation(f);
                }

                public void setMaxCardElevation(float f) {
/* 3 */             mn0.m6709z(this.f818e, f);
                }

                @Override // android.view.View
                public void setMinimumHeight(int i) {
/* 1 */             super.setMinimumHeight(i);
                }

                @Override // android.view.View
                public void setMinimumWidth(int i) {
/* 1 */             super.setMinimumWidth(i);
                }

                @Override // android.view.View
                public final void setPadding(int i, int i2, int i3, int i4) {
                }

                @Override // android.view.View
                public final void setPaddingRelative(int i, int i2, int i3, int i4) {
                }

                public void setPreventCornerOverlap(boolean z) {
/* 3 */             if (z != this.f815b) {
/* 5 */                 this.f815b = z;
/* 7 */                 C0210cb c0210cb = this.f818e;
/* 15 */                mn0.m6709z(c0210cb, ((e52) c0210cb.f2804b).f7519e);
                    }
                }

                public void setRadius(float f) {
/* 5 */             e52 e52Var = (e52) this.f818e.f2804b;
/* 11 */            if (f == e52Var.f7515a) {
/* 13 */                return;
                    }
/* 14 */            e52Var.f7515a = f;
/* 17 */            e52Var.m3322b(null);
/* 20 */            e52Var.invalidateSelf();
                }

                public void setUseCompatPadding(boolean z) {
/* 3 */             if (this.f814a != z) {
/* 5 */                 this.f814a = z;
/* 7 */                 C0210cb c0210cb = this.f818e;
/* 15 */                mn0.m6709z(c0210cb, ((e52) c0210cb.f2804b).f7519e);
                    }
                }

/* 45 */        public void setCardBackgroundColor(ColorStateList colorStateList) {
/* 47 */            e52 e52Var = (e52) this.f818e.f2804b;
                    if (colorStateList == null) {
/* 48 */                e52Var.getClass();
/* 49 */                colorStateList = ColorStateList.valueOf(0);
                    }
                    e52Var.f7522h = colorStateList;
/* 50 */            e52Var.f7516b.setColor(colorStateList.getColorForState(e52Var.getState(), e52Var.f7522h.getDefaultColor()));
/* 51 */            e52Var.invalidateSelf();
                }

/* 217 */       public CardView(Context context, AttributeSet attributeSet) {
/* 218 */           this(context, attributeSet, R$attr.cardViewStyle);
                }
            }
