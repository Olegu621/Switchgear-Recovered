            package com.google.android.material.imageview;

            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.TypedArray;
            import android.graphics.Canvas;
            import android.graphics.Paint;
            import android.graphics.Path;
            import android.graphics.PorterDuff;
            import android.graphics.PorterDuffXfermode;
            import android.graphics.RectF;
            import android.util.AttributeSet;
            import androidx.appcompat.widget.AppCompatImageView;
            import com.google.android.material.R$style;
            import com.google.android.material.R$styleable;
            import p000.de3;
            import p000.ed2;
            import p000.fd1;
            import p000.fd2;
            import p000.hd1;
            import p000.tc2;
            import p000.uc2;
            import p000.v00;
            import p000.vc2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 196 */   public class ShapeableImageView extends AppCompatImageView implements ed2 {

                /* JADX INFO: renamed from: g0 */
                public static final int f4760g0 = R$style.Widget_MaterialComponents_ShapeableImageView;

                /* JADX INFO: renamed from: U */
                public float f4761U;

                /* JADX INFO: renamed from: V */
                public final Path f4762V;

                /* JADX INFO: renamed from: W */
                public final int f4763W;

                /* JADX INFO: renamed from: a */
                public final vc2 f4764a;

                /* JADX INFO: renamed from: a0 */
                public final int f4765a0;

                /* JADX INFO: renamed from: b */
                public final RectF f4766b;

                /* JADX INFO: renamed from: b0 */
                public final int f4767b0;

                /* JADX INFO: renamed from: c */
                public final RectF f4768c;

                /* JADX INFO: renamed from: c0 */
                public final int f4769c0;

                /* JADX INFO: renamed from: d */
                public final Paint f4770d;

                /* JADX INFO: renamed from: d0 */
                public final int f4771d0;

                /* JADX INFO: renamed from: e */
                public final Paint f4772e;

                /* JADX INFO: renamed from: e0 */
                public final int f4773e0;

                /* JADX INFO: renamed from: f */
                public final Path f4774f;

                /* JADX INFO: renamed from: f0 */
                public boolean f4775f0;

                /* JADX INFO: renamed from: i */
                public ColorStateList f4776i;

                /* JADX INFO: renamed from: v */
                public fd1 f4777v;

                /* JADX INFO: renamed from: w */
                public tc2 f4778w;

                /* JADX WARN: Illegal instructions before constructor call */
                public ShapeableImageView(Context context, AttributeSet attributeSet, int i) {
/* 1 */             int i2 = f4760g0;
/* 7 */             super(hd1.m4176a(context, attributeSet, i, i2), attributeSet, i);
/* 12 */            this.f4764a = uc2.f17468a;
/* 19 */            this.f4774f = new Path();
/* 22 */            this.f4775f0 = false;
/* 24 */            Context context2 = getContext();
/* 30 */            Paint paint = new Paint();
/* 33 */            this.f4772e = paint;
/* 36 */            paint.setAntiAlias(true);
/* 40 */            paint.setColor(-1);
/* 50 */            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
/* 58 */            this.f4766b = new RectF();
/* 65 */            this.f4768c = new RectF();
/* 72 */            this.f4762V = new Path();
/* 76 */            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R$styleable.ShapeableImageView, i, i2);
/* 86 */            this.f4776i = de3.m3033o(context2, typedArrayObtainStyledAttributes, R$styleable.ShapeableImageView_strokeColor);
/* 95 */            this.f4761U = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ShapeableImageView_strokeWidth, 0);
/* 99 */            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ShapeableImageView_contentPadding, 0);
/* 103 */           this.f4763W = dimensionPixelSize;
/* 105 */           this.f4765a0 = dimensionPixelSize;
/* 107 */           this.f4767b0 = dimensionPixelSize;
/* 109 */           this.f4769c0 = dimensionPixelSize;
/* 117 */           this.f4763W = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ShapeableImageView_contentPaddingLeft, dimensionPixelSize);
/* 125 */           this.f4765a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ShapeableImageView_contentPaddingTop, dimensionPixelSize);
/* 133 */           this.f4767b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ShapeableImageView_contentPaddingRight, dimensionPixelSize);
/* 141 */           this.f4769c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ShapeableImageView_contentPaddingBottom, dimensionPixelSize);
/* 151 */           this.f4771d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ShapeableImageView_contentPaddingStart, Integer.MIN_VALUE);
/* 159 */           this.f4773e0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ShapeableImageView_contentPaddingEnd, Integer.MIN_VALUE);
/* 161 */           typedArrayObtainStyledAttributes.recycle();
/* 166 */           Paint paint2 = new Paint();
/* 169 */           this.f4770d = paint2;
/* 173 */           paint2.setStyle(Paint.Style.STROKE);
/* 176 */           paint2.setAntiAlias(true);
/* 187 */           this.f4778w = tc2.m8775b(context2, attributeSet, i, i2).m8478a();
/* 194 */           setOutlineProvider(new fd2(this));
                }

                /* JADX INFO: renamed from: c */
                public final boolean m2341c() {
                    return getLayoutDirection() == 1;
                }

                /* JADX INFO: renamed from: d */
                public final void m2342d(int i, int i2) {
/* 1 */             float paddingLeft = getPaddingLeft();
/* 6 */             float paddingTop = getPaddingTop();
/* 15 */            float paddingRight = i - getPaddingRight();
/* 22 */            float paddingBottom = i2 - getPaddingBottom();
/* 25 */            RectF rectF = this.f4766b;
/* 27 */            rectF.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
/* 30 */            tc2 tc2Var = this.f4778w;
/* 33 */            vc2 vc2Var = this.f4764a;
/* 37 */            Path path = this.f4774f;
/* 39 */            vc2Var.m9251a(tc2Var, 1.0f, rectF, null, path);
/* 42 */            Path path2 = this.f4762V;
/* 44 */            path2.rewind();
/* 47 */            path2.addPath(path);
/* 52 */            RectF rectF2 = this.f4768c;
/* 55 */            rectF2.set(0.0f, 0.0f, i, i2);
/* 60 */            path2.addRect(rectF2, Path.Direction.CCW);
                }

                public int getContentPaddingBottom() {
/* 1 */             return this.f4769c0;
                }

                public final int getContentPaddingEnd() {
/* 3 */             int i = this.f4773e0;
/* 5 */             if (i != Integer.MIN_VALUE) {
/* 7 */                 return i;
                    }
                    return m2341c() ? this.f4763W : this.f4767b0;
                }

                public int getContentPaddingLeft() {
/* 1 */             int i = this.f4773e0;
/* 5 */             int i2 = this.f4771d0;
/* 7 */             if (i2 != Integer.MIN_VALUE || i != Integer.MIN_VALUE) {
/* 15 */                if (m2341c() && i != Integer.MIN_VALUE) {
/* 19 */                    return i;
                        }
/* 24 */                if (!m2341c() && i2 != Integer.MIN_VALUE) {
/* 28 */                    return i2;
                        }
                    }
/* 29 */            return this.f4763W;
                }

                public int getContentPaddingRight() {
/* 1 */             int i = this.f4773e0;
/* 5 */             int i2 = this.f4771d0;
/* 7 */             if (i2 != Integer.MIN_VALUE || i != Integer.MIN_VALUE) {
/* 15 */                if (m2341c() && i2 != Integer.MIN_VALUE) {
/* 19 */                    return i2;
                        }
/* 24 */                if (!m2341c() && i != Integer.MIN_VALUE) {
/* 28 */                    return i;
                        }
                    }
/* 29 */            return this.f4767b0;
                }

                public final int getContentPaddingStart() {
/* 3 */             int i = this.f4771d0;
/* 5 */             if (i != Integer.MIN_VALUE) {
/* 7 */                 return i;
                    }
                    return m2341c() ? this.f4767b0 : this.f4763W;
                }

                public int getContentPaddingTop() {
/* 1 */             return this.f4765a0;
                }

                @Override // android.view.View
                public int getPaddingBottom() {
/* 9 */             return super.getPaddingBottom() - getContentPaddingBottom();
                }

                @Override // android.view.View
                public int getPaddingEnd() {
/* 9 */             return super.getPaddingEnd() - getContentPaddingEnd();
                }

                @Override // android.view.View
                public int getPaddingLeft() {
/* 9 */             return super.getPaddingLeft() - getContentPaddingLeft();
                }

                @Override // android.view.View
                public int getPaddingRight() {
/* 9 */             return super.getPaddingRight() - getContentPaddingRight();
                }

                @Override // android.view.View
                public int getPaddingStart() {
/* 9 */             return super.getPaddingStart() - getContentPaddingStart();
                }

                @Override // android.view.View
                public int getPaddingTop() {
/* 9 */             return super.getPaddingTop() - getContentPaddingTop();
                }

                public tc2 getShapeAppearanceModel() {
/* 1 */             return this.f4778w;
                }

                public ColorStateList getStrokeColor() {
/* 1 */             return this.f4776i;
                }

                public float getStrokeWidth() {
/* 1 */             return this.f4761U;
                }

                @Override // android.widget.ImageView, android.view.View
                public final void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 6 */             setLayerType(2, null);
                }

                @Override // android.widget.ImageView, android.view.View
                public final void onDetachedFromWindow() {
/* 3 */             setLayerType(0, null);
/* 6 */             super.onDetachedFromWindow();
                }

                @Override // android.widget.ImageView, android.view.View
                public final void onDraw(Canvas canvas) {
/* 1 */             super.onDraw(canvas);
/* 8 */             canvas.drawPath(this.f4762V, this.f4772e);
/* 13 */            if (this.f4776i == null) {
/* 56 */                return;
                    }
/* 16 */            float f = this.f4761U;
/* 18 */            Paint paint = this.f4770d;
/* 20 */            paint.setStrokeWidth(f);
/* 35 */            int colorForState = this.f4776i.getColorForState(getDrawableState(), this.f4776i.getDefaultColor());
/* 44 */            if (this.f4761U <= 0.0f || colorForState == 0) {
/* 56 */                return;
                    }
/* 48 */            paint.setColor(colorForState);
/* 53 */            canvas.drawPath(this.f4774f, paint);
                }

                @Override // android.widget.ImageView, android.view.View
                public final void onMeasure(int i, int i2) {
/* 1 */             super.onMeasure(i, i2);
/* 6 */             if (!this.f4775f0 && isLayoutDirectionResolved()) {
/* 17 */                this.f4775f0 = true;
/* 23 */                if (!isPaddingRelative() && this.f4771d0 == Integer.MIN_VALUE && this.f4773e0 == Integer.MIN_VALUE) {
/* 52 */                    setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
                        } else {
/* 72 */                    setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
                        }
                    }
                }

                @Override // android.view.View
                public final void onSizeChanged(int i, int i2, int i3, int i4) {
/* 1 */             super.onSizeChanged(i, i2, i3, i4);
/* 4 */             m2342d(i, i2);
                }

                @Override // android.view.View
                public final void setPadding(int i, int i2, int i3, int i4) {
/* 21 */            super.setPadding(getContentPaddingLeft() + i, getContentPaddingTop() + i2, getContentPaddingRight() + i3, getContentPaddingBottom() + i4);
                }

                @Override // android.view.View
                public final void setPaddingRelative(int i, int i2, int i3, int i4) {
/* 21 */            super.setPaddingRelative(getContentPaddingStart() + i, getContentPaddingTop() + i2, getContentPaddingEnd() + i3, getContentPaddingBottom() + i4);
                }

                @Override // p000.ed2
                public void setShapeAppearanceModel(tc2 tc2Var) {
/* 1 */             this.f4778w = tc2Var;
/* 3 */             fd1 fd1Var = this.f4777v;
/* 5 */             if (fd1Var != null) {
/* 7 */                 fd1Var.setShapeAppearanceModel(tc2Var);
                    }
/* 18 */            m2342d(getWidth(), getHeight());
/* 21 */            invalidate();
/* 24 */            invalidateOutline();
                }

                public void setStrokeColor(ColorStateList colorStateList) {
/* 1 */             this.f4776i = colorStateList;
/* 3 */             invalidate();
                }

                public void setStrokeColorResource(int i) {
/* 9 */             setStrokeColor(v00.getColorStateList(getContext(), i));
                }

                public void setStrokeWidth(float f) {
/* 5 */             if (this.f4761U != f) {
/* 7 */                 this.f4761U = f;
/* 9 */                 invalidate();
                    }
                }

                public void setStrokeWidthResource(int i) {
/* 10 */            setStrokeWidth(getResources().getDimensionPixelSize(i));
                }

/* 197 */       public ShapeableImageView(Context context, AttributeSet attributeSet) {
/* 198 */           this(context, attributeSet, 0);
                }
            }
