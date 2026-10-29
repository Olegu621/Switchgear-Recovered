            package p000;

            import android.content.res.ColorStateList;
            import android.graphics.Canvas;
            import android.graphics.ColorFilter;
            import android.graphics.LinearGradient;
            import android.graphics.Outline;
            import android.graphics.Paint;
            import android.graphics.Path;
            import android.graphics.Rect;
            import android.graphics.RectF;
            import android.graphics.Shader;
            import android.graphics.drawable.Drawable;
            
            /* JADX INFO: renamed from: hk */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0994hk extends Drawable {

                /* JADX INFO: renamed from: b */
                public final Paint f9104b;

                /* JADX INFO: renamed from: h */
                public float f9110h;

                /* JADX INFO: renamed from: i */
                public int f9111i;

                /* JADX INFO: renamed from: j */
                public int f9112j;

                /* JADX INFO: renamed from: k */
                public int f9113k;

                /* JADX INFO: renamed from: l */
                public int f9114l;

                /* JADX INFO: renamed from: m */
                public int f9115m;

                /* JADX INFO: renamed from: o */
                public tc2 f9117o;

                /* JADX INFO: renamed from: p */
                public ColorStateList f9118p;

                /* JADX INFO: renamed from: a */
                public final vc2 f9103a = uc2.f17468a;

                /* JADX INFO: renamed from: c */
                public final Path f9105c = new Path();

                /* JADX INFO: renamed from: d */
                public final Rect f9106d = new Rect();

                /* JADX INFO: renamed from: e */
                public final RectF f9107e = new RectF();

                /* JADX INFO: renamed from: f */
                public final RectF f9108f = new RectF();

                /* JADX INFO: renamed from: g */
                public final C0957gk f9109g = new C0957gk(this);

                /* JADX INFO: renamed from: n */
                public boolean f9116n = true;

                public C0994hk(tc2 tc2Var) {
/* 46 */            this.f9117o = tc2Var;
/* 50 */            Paint paint = new Paint(1);
/* 53 */            this.f9104b = paint;
/* 57 */            paint.setStyle(Paint.Style.STROKE);
                }

                @Override // android.graphics.drawable.Drawable
                public final void draw(Canvas canvas) {
/* 3 */             boolean z = this.f9116n;
/* 5 */             Rect rect = this.f9106d;
/* 7 */             Paint paint = this.f9104b;
/* 9 */             if (z) {
/* 11 */                copyBounds(rect);
/* 21 */                float fHeight = this.f9110h / rect.height();
/* 129 */               paint.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{AbstractC0196bx.m1452d(this.f9111i, this.f9115m), AbstractC0196bx.m1452d(this.f9112j, this.f9115m), AbstractC0196bx.m1452d(AbstractC0196bx.m1454f(this.f9112j, 0), this.f9115m), AbstractC0196bx.m1452d(AbstractC0196bx.m1454f(this.f9114l, 0), this.f9115m), AbstractC0196bx.m1452d(this.f9114l, this.f9115m), AbstractC0196bx.m1452d(this.f9113k, this.f9115m)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP));
/* 132 */               this.f9116n = false;
                    }
/* 140 */           float strokeWidth = paint.getStrokeWidth() / 2.0f;
/* 141 */           copyBounds(rect);
/* 144 */           RectF rectF = this.f9107e;
/* 146 */           rectF.set(rect);
/* 151 */           m10 m10Var = this.f9117o.f17036e;
/* 153 */           Rect bounds = getBounds();
/* 157 */           RectF rectF2 = this.f9108f;
/* 159 */           rectF2.set(bounds);
/* 171 */           float fMin = Math.min(m10Var.mo47a(rectF2), rectF.width() / 2.0f);
/* 175 */           tc2 tc2Var = this.f9117o;
/* 181 */           rectF2.set(getBounds());
/* 188 */           if (tc2Var.m8778e(rectF2)) {
/* 190 */               rectF.inset(strokeWidth, strokeWidth);
/* 195 */               canvas.drawRoundRect(rectF, fMin, fMin, paint);
                    }
                }

                @Override // android.graphics.drawable.Drawable
                public final Drawable.ConstantState getConstantState() {
/* 1 */             return this.f9109g;
                }

                @Override // android.graphics.drawable.Drawable
                public final int getOpacity() {
                    return this.f9110h > 0.0f ? -3 : -2;
                }

                @Override // android.graphics.drawable.Drawable
                public final void getOutline(Outline outline) {
/* 1 */             tc2 tc2Var = this.f9117o;
/* 3 */             Rect bounds = getBounds();
/* 7 */             RectF rectF = this.f9108f;
/* 9 */             rectF.set(bounds);
/* 16 */            if (tc2Var.m8778e(rectF)) {
/* 20 */                m10 m10Var = this.f9117o.f17036e;
/* 26 */                rectF.set(getBounds());
/* 37 */                outline.setRoundRect(getBounds(), m10Var.mo47a(rectF));
/* 40 */                return;
                    }
/* 41 */            Rect rect = this.f9106d;
/* 43 */            copyBounds(rect);
/* 46 */            RectF rectF2 = this.f9107e;
/* 48 */            rectF2.set(rect);
/* 51 */            tc2 tc2Var2 = this.f9117o;
/* 56 */            vc2 vc2Var = this.f9103a;
/* 58 */            Path path = this.f9105c;
/* 60 */            vc2Var.m9251a(tc2Var2, 1.0f, rectF2, null, path);
/* 67 */            if (path.isConvex()) {
/* 69 */                outline.setConvexPath(path);
                    }
                }

                @Override // android.graphics.drawable.Drawable
                public final boolean getPadding(Rect rect) {
/* 1 */             tc2 tc2Var = this.f9117o;
/* 3 */             Rect bounds = getBounds();
/* 7 */             RectF rectF = this.f9108f;
/* 9 */             rectF.set(bounds);
/* 16 */            if (!tc2Var.m8778e(rectF)) {
/* 27 */                return true;
                    }
/* 20 */            int iRound = Math.round(this.f9110h);
/* 24 */            rect.set(iRound, iRound, iRound, iRound);
/* 27 */            return true;
                }

                @Override // android.graphics.drawable.Drawable
                public final boolean isStateful() {
/* 1 */             ColorStateList colorStateList = this.f9118p;
                    return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
                }

                @Override // android.graphics.drawable.Drawable
                public final void onBoundsChange(Rect rect) {
/* 2 */             this.f9116n = true;
                }

                @Override // android.graphics.drawable.Drawable
                public final boolean onStateChange(int[] iArr) {
                    int colorForState;
/* 1 */             ColorStateList colorStateList = this.f9118p;
/* 3 */             if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f9115m)) != this.f9115m) {
/* 16 */                this.f9116n = true;
/* 18 */                this.f9115m = colorForState;
                    }
/* 22 */            if (this.f9116n) {
/* 24 */                invalidateSelf();
                    }
/* 27 */            return this.f9116n;
                }

                @Override // android.graphics.drawable.Drawable
                public final void setAlpha(int i) {
/* 3 */             this.f9104b.setAlpha(i);
/* 6 */             invalidateSelf();
                }

                @Override // android.graphics.drawable.Drawable
                public final void setColorFilter(ColorFilter colorFilter) {
/* 3 */             this.f9104b.setColorFilter(colorFilter);
/* 6 */             invalidateSelf();
                }
            }
