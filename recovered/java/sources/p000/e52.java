            package p000;

            import android.content.res.ColorStateList;
            import android.graphics.Canvas;
            import android.graphics.ColorFilter;
            import android.graphics.Outline;
            import android.graphics.Paint;
            import android.graphics.PorterDuff;
            import android.graphics.PorterDuffColorFilter;
            import android.graphics.Rect;
            import android.graphics.RectF;
            import android.graphics.drawable.Drawable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class e52 extends Drawable {

                /* JADX INFO: renamed from: a */
                public float f7515a;

                /* JADX INFO: renamed from: b */
                public final Paint f7516b;

                /* JADX INFO: renamed from: c */
                public final RectF f7517c;

                /* JADX INFO: renamed from: d */
                public final Rect f7518d;

                /* JADX INFO: renamed from: e */
                public float f7519e;

                /* JADX INFO: renamed from: h */
                public ColorStateList f7522h;

                /* JADX INFO: renamed from: i */
                public PorterDuffColorFilter f7523i;

                /* JADX INFO: renamed from: j */
                public ColorStateList f7524j;

                /* JADX INFO: renamed from: f */
                public boolean f7520f = false;

                /* JADX INFO: renamed from: g */
                public boolean f7521g = true;

                /* JADX INFO: renamed from: k */
                public PorterDuff.Mode f7525k = PorterDuff.Mode.SRC_IN;

                public e52(ColorStateList colorStateList, float f) {
/* 14 */            this.f7515a = f;
/* 19 */            Paint paint = new Paint(5);
/* 22 */            this.f7516b = paint;
/* 26 */            colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
/* 30 */            this.f7522h = colorStateList;
/* 46 */            paint.setColor(colorStateList.getColorForState(getState(), this.f7522h.getDefaultColor()));
/* 54 */            this.f7517c = new RectF();
/* 61 */            this.f7518d = new Rect();
                }

                /* JADX INFO: renamed from: a */
                public final PorterDuffColorFilter m3321a(ColorStateList colorStateList, PorterDuff.Mode mode) {
/* 1 */             if (colorStateList == null || mode == null) {
/* 21 */                return null;
                    }
/* 17 */            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
                }

                /* JADX INFO: renamed from: b */
                public final void m3322b(Rect rect) {
/* 1 */             if (rect == null) {
/* 3 */                 rect = getBounds();
                    }
/* 7 */             float f = rect.left;
/* 10 */            float f2 = rect.top;
/* 13 */            float f3 = rect.right;
/* 16 */            float f4 = rect.bottom;
/* 19 */            RectF rectF = this.f7517c;
/* 21 */            rectF.set(f, f2, f3, f4);
/* 24 */            Rect rect2 = this.f7518d;
/* 26 */            rect2.set(rect);
/* 31 */            if (this.f7520f) {
/* 65 */                rect2.inset((int) Math.ceil(f52.m3670a(this.f7519e, this.f7515a, this.f7521g)), (int) Math.ceil(f52.m3671b(this.f7519e, this.f7515a, this.f7521g)));
/* 68 */                rectF.set(rect2);
                    }
                }

                @Override // android.graphics.drawable.Drawable
                public final void draw(Canvas canvas) {
                    boolean z;
/* 1 */             PorterDuffColorFilter porterDuffColorFilter = this.f7523i;
/* 3 */             Paint paint = this.f7516b;
/* 5 */             if (porterDuffColorFilter == null || paint.getColorFilter() != null) {
/* 20 */                z = false;
                    } else {
/* 15 */                paint.setColorFilter(this.f7523i);
/* 18 */                z = true;
                    }
/* 21 */            RectF rectF = this.f7517c;
/* 23 */            float f = this.f7515a;
/* 25 */            canvas.drawRoundRect(rectF, f, f, paint);
/* 28 */            if (z) {
/* 31 */                paint.setColorFilter(null);
                    }
                }

                @Override // android.graphics.drawable.Drawable
                public final int getOpacity() {
/* 1 */             return -3;
                }

                @Override // android.graphics.drawable.Drawable
                public final void getOutline(Outline outline) {
/* 5 */             outline.setRoundRect(this.f7518d, this.f7515a);
                }

                @Override // android.graphics.drawable.Drawable
                public final boolean isStateful() {
/* 1 */             ColorStateList colorStateList = this.f7524j;
/* 3 */             if (colorStateList != null && colorStateList.isStateful()) {
/* 27 */                return true;
                    }
/* 11 */            ColorStateList colorStateList2 = this.f7522h;
                    return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
                }

                @Override // android.graphics.drawable.Drawable
                public final void onBoundsChange(Rect rect) {
/* 1 */             super.onBoundsChange(rect);
/* 4 */             m3322b(rect);
                }

                @Override // android.graphics.drawable.Drawable
                public final boolean onStateChange(int[] iArr) {
                    PorterDuff.Mode mode;
/* 1 */             ColorStateList colorStateList = this.f7522h;
/* 7 */             int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
/* 11 */            Paint paint = this.f7516b;
/* 22 */            boolean z = colorForState != paint.getColor();
/* 23 */            if (z) {
/* 25 */                paint.setColor(colorForState);
                    }
/* 28 */            ColorStateList colorStateList2 = this.f7524j;
/* 30 */            if (colorStateList2 == null || (mode = this.f7525k) == null) {
/* 43 */                return z;
                    }
/* 40 */            this.f7523i = m3321a(colorStateList2, mode);
/* 17 */            return true;
                }

                @Override // android.graphics.drawable.Drawable
                public final void setAlpha(int i) {
/* 3 */             this.f7516b.setAlpha(i);
                }

                @Override // android.graphics.drawable.Drawable
                public final void setColorFilter(ColorFilter colorFilter) {
/* 3 */             this.f7516b.setColorFilter(colorFilter);
                }

                @Override // android.graphics.drawable.Drawable
                public final void setTintList(ColorStateList colorStateList) {
/* 1 */             this.f7524j = colorStateList;
/* 9 */             this.f7523i = m3321a(colorStateList, this.f7525k);
/* 11 */            invalidateSelf();
                }

                @Override // android.graphics.drawable.Drawable
                public final void setTintMode(PorterDuff.Mode mode) {
/* 1 */             this.f7525k = mode;
/* 9 */             this.f7523i = m3321a(this.f7524j, mode);
/* 11 */            invalidateSelf();
                }
            }
