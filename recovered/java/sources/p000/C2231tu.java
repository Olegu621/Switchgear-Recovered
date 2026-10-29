            package p000;

            import android.animation.ValueAnimator;
            import android.content.Context;
            import android.content.res.Resources;
            import android.graphics.Canvas;
            import android.graphics.ColorFilter;
            import android.graphics.Paint;
            import android.graphics.Path;
            import android.graphics.Rect;
            import android.graphics.RectF;
            import android.graphics.drawable.Animatable;
            import android.graphics.drawable.Drawable;
            import android.view.animation.LinearInterpolator;
            
            /* JADX INFO: renamed from: tu */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2231tu extends Drawable implements Animatable {

                /* JADX INFO: renamed from: i */
                public static final LinearInterpolator f17261i = new LinearInterpolator();

                /* JADX INFO: renamed from: v */
                public static final xg0 f17262v = new xg0();

                /* JADX INFO: renamed from: w */
                public static final int[] f17263w = {-16777216};

                /* JADX INFO: renamed from: a */
                public final C2194su f17264a;

                /* JADX INFO: renamed from: b */
                public float f17265b;

                /* JADX INFO: renamed from: c */
                public final Resources f17266c;

                /* JADX INFO: renamed from: d */
                public final ValueAnimator f17267d;

                /* JADX INFO: renamed from: e */
                public float f17268e;

                /* JADX INFO: renamed from: f */
                public boolean f17269f;

                public C2231tu(Context context) {
/* 4 */             context.getClass();
/* 11 */            this.f17266c = context.getResources();
/* 15 */            C2194su c2194su = new C2194su();
/* 18 */            this.f17264a = c2194su;
/* 22 */            c2194su.f16788i = f17263w;
/* 25 */            c2194su.m8633a(0);
/* 30 */            c2194su.f16787h = 2.5f;
/* 34 */            c2194su.f16781b.setStrokeWidth(2.5f);
/* 37 */            invalidateSelf();
/* 46 */            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
/* 56 */            valueAnimatorOfFloat.addUpdateListener(new C2360x9(1, this, c2194su));
/* 60 */            valueAnimatorOfFloat.setRepeatCount(-1);
/* 63 */            valueAnimatorOfFloat.setRepeatMode(1);
/* 68 */            valueAnimatorOfFloat.setInterpolator(f17261i);
/* 76 */            valueAnimatorOfFloat.addListener(new C2157ru(this, c2194su));
/* 79 */            this.f17267d = valueAnimatorOfFloat;
                }

                /* JADX INFO: renamed from: d */
                public static void m8913d(float f, C2194su c2194su) {
/* 5 */             if (f <= 0.75f) {
/* 90 */                c2194su.f16800u = c2194su.f16788i[c2194su.f16789j];
/* 92 */                return;
                    }
/* 10 */            float f2 = (f - 0.75f) / 0.25f;
/* 11 */            int[] iArr = c2194su.f16788i;
/* 13 */            int i = c2194su.f16789j;
/* 15 */            int i2 = iArr[i];
/* 21 */            int i3 = iArr[(i + 1) % iArr.length];
/* 25 */            int i4 = (i2 >> 24) & 255;
/* 29 */            int i5 = (i2 >> 16) & 255;
/* 33 */            int i6 = (i2 >> 8) & 255;
/* 35 */            int i7 = i2 & 255;
/* 81 */            c2194su.f16800u = ((i4 + ((int) ((((i3 >> 24) & 255) - i4) * f2))) << 24) | ((i5 + ((int) ((((i3 >> 16) & 255) - i5) * f2))) << 16) | ((i6 + ((int) ((((i3 >> 8) & 255) - i6) * f2))) << 8) | (i7 + ((int) (f2 * ((i3 & 255) - i7))));
                }

                /* JADX INFO: renamed from: a */
                public final void m8914a(float f, C2194su c2194su, boolean z) {
                    float interpolation;
/* 6 */             if (this.f17269f) {
/* 8 */                 m8913d(f, c2194su);
/* 25 */                float fFloor = (float) (Math.floor(c2194su.f16792m / 0.8f) + 1.0d);
/* 26 */                float f2 = c2194su.f16790k;
/* 28 */                float f3 = c2194su.f16791l;
/* 35 */                c2194su.f16784e = (((f3 - 0.01f) - f2) * f) + f2;
/* 37 */                c2194su.f16785f = f3;
/* 39 */                float f4 = c2194su.f16792m;
/* 45 */                c2194su.f16786g = AbstractC0886en.m3503g(fFloor, f4, f, f4);
/* 47 */                return;
                    }
/* 52 */            if (f != 1.0f || z) {
/* 58 */                float f5 = c2194su.f16792m;
/* 64 */                float interpolation2 = c2194su.f16790k;
/* 66 */                xg0 xg0Var = f17262v;
/* 71 */                if (f < 0.5f) {
/* 81 */                    interpolation = (xg0Var.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation2;
                        } else {
/* 86 */                    float f6 = interpolation2 + 0.79f;
/* 95 */                    interpolation2 = f6 - (((1.0f - xg0Var.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
/* 97 */                    interpolation = f6;
                        }
/* 102 */               float f7 = (0.20999998f * f) + f5;
/* 108 */               float f8 = (f + this.f17268e) * 216.0f;
/* 109 */               c2194su.f16784e = interpolation2;
/* 111 */               c2194su.f16785f = interpolation;
/* 113 */               c2194su.f16786g = f7;
/* 115 */               this.f17265b = f8;
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m8915b(float f, float f2, float f3, float f4) {
/* 7 */             float f5 = this.f17266c.getDisplayMetrics().density;
/* 9 */             float f6 = f2 * f5;
/* 10 */            C2194su c2194su = this.f17264a;
/* 12 */            c2194su.f16787h = f6;
/* 16 */            c2194su.f16781b.setStrokeWidth(f6);
/* 20 */            c2194su.f16796q = f * f5;
/* 23 */            c2194su.m8633a(0);
/* 29 */            c2194su.f16797r = (int) (f3 * f5);
/* 32 */            c2194su.f16798s = (int) (f4 * f5);
                }

                /* JADX INFO: renamed from: c */
                public final void m8916c(int i) {
/* 1 */             if (i == 0) {
/* 11 */                m8915b(11.0f, 3.0f, 12.0f, 6.0f);
                    } else {
/* 23 */                m8915b(7.5f, 2.5f, 10.0f, 5.0f);
                    }
/* 26 */            invalidateSelf();
                }

                @Override // android.graphics.drawable.Drawable
                public final void draw(Canvas canvas) {
/* 1 */             Rect bounds = getBounds();
/* 5 */             canvas.save();
/* 18 */            canvas.rotate(this.f17265b, bounds.exactCenterX(), bounds.exactCenterY());
/* 21 */            C2194su c2194su = this.f17264a;
/* 23 */            Paint paint = c2194su.f16781b;
/* 25 */            RectF rectF = c2194su.f16780a;
/* 27 */            float f = c2194su.f16796q;
/* 34 */            float fMin = (c2194su.f16787h / 2.0f) + f;
/* 38 */            if (f <= 0.0f) {
/* 68 */                fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((c2194su.f16797r * c2194su.f16795p) / 2.0f, c2194su.f16787h / 2.0f);
                    }
/* 94 */            rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
/* 97 */            float f2 = c2194su.f16784e;
/* 99 */            float f3 = c2194su.f16786g;
/* 104 */           float f4 = (f2 + f3) * 360.0f;
/* 109 */           float f5 = ((c2194su.f16785f + f3) * 360.0f) - f4;
/* 112 */           paint.setColor(c2194su.f16800u);
/* 117 */           paint.setAlpha(c2194su.f16799t);
/* 122 */           float f6 = c2194su.f16787h / 2.0f;
/* 123 */           rectF.inset(f6, f6);
/* 141 */           canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, c2194su.f16783d);
/* 144 */           float f7 = -f6;
/* 145 */           rectF.inset(f7, f7);
/* 151 */           canvas.drawArc(rectF, f4, f5, false, paint);
/* 154 */           Paint paint2 = c2194su.f16782c;
/* 158 */           if (c2194su.f16793n) {
/* 160 */               Path path = c2194su.f16794o;
/* 162 */               if (path == null) {
/* 166 */                   Path path2 = new Path();
/* 169 */                   c2194su.f16794o = path2;
/* 173 */                   path2.setFillType(Path.FillType.EVEN_ODD);
                        } else {
/* 177 */                   path.reset();
                        }
/* 192 */               float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
/* 199 */               float f8 = (c2194su.f16797r * c2194su.f16795p) / 2.0f;
/* 202 */               c2194su.f16794o.moveTo(0.0f, 0.0f);
/* 213 */               c2194su.f16794o.lineTo(c2194su.f16797r * c2194su.f16795p, 0.0f);
/* 216 */               Path path3 = c2194su.f16794o;
/* 218 */               float f9 = c2194su.f16797r;
/* 221 */               float f10 = c2194su.f16795p;
/* 229 */               path3.lineTo((f9 * f10) / 2.0f, c2194su.f16798s * f10);
/* 248 */               c2194su.f16794o.offset((rectF.centerX() + fMin2) - f8, (c2194su.f16787h / 2.0f) + rectF.centerY());
/* 253 */               c2194su.f16794o.close();
/* 258 */               paint2.setColor(c2194su.f16800u);
/* 263 */               paint2.setAlpha(c2194su.f16799t);
/* 266 */               canvas.save();
/* 279 */               canvas.rotate(f4 + f5, rectF.centerX(), rectF.centerY());
/* 284 */               canvas.drawPath(c2194su.f16794o, paint2);
/* 287 */               canvas.restore();
                    }
/* 290 */           canvas.restore();
                }

                @Override // android.graphics.drawable.Drawable
                public final int getAlpha() {
/* 3 */             return this.f17264a.f16799t;
                }

                @Override // android.graphics.drawable.Drawable
                public final int getOpacity() {
/* 1 */             return -3;
                }

                @Override // android.graphics.drawable.Animatable
                public final boolean isRunning() {
/* 3 */             return this.f17267d.isRunning();
                }

                @Override // android.graphics.drawable.Drawable
                public final void setAlpha(int i) {
/* 3 */             this.f17264a.f16799t = i;
/* 5 */             invalidateSelf();
                }

                @Override // android.graphics.drawable.Drawable
                public final void setColorFilter(ColorFilter colorFilter) {
/* 5 */             this.f17264a.f16781b.setColorFilter(colorFilter);
/* 8 */             invalidateSelf();
                }

                @Override // android.graphics.drawable.Animatable
                public final void start() {
/* 1 */             ValueAnimator valueAnimator = this.f17267d;
/* 3 */             valueAnimator.cancel();
/* 6 */             C2194su c2194su = this.f17264a;
/* 8 */             float f = c2194su.f16784e;
/* 10 */            c2194su.f16790k = f;
/* 12 */            float f2 = c2194su.f16785f;
/* 14 */            c2194su.f16791l = f2;
/* 18 */            c2194su.f16792m = c2194su.f16786g;
/* 22 */            if (f2 != f) {
/* 25 */                this.f17269f = true;
/* 29 */                valueAnimator.setDuration(666L);
/* 32 */                valueAnimator.start();
/* 35 */                return;
                    }
/* 37 */            c2194su.m8633a(0);
/* 41 */            c2194su.f16790k = 0.0f;
/* 43 */            c2194su.f16791l = 0.0f;
/* 45 */            c2194su.f16792m = 0.0f;
/* 47 */            c2194su.f16784e = 0.0f;
/* 49 */            c2194su.f16785f = 0.0f;
/* 51 */            c2194su.f16786g = 0.0f;
/* 55 */            valueAnimator.setDuration(1332L);
/* 58 */            valueAnimator.start();
                }

                @Override // android.graphics.drawable.Animatable
                public final void stop() {
/* 3 */             this.f17267d.cancel();
/* 7 */             this.f17265b = 0.0f;
/* 9 */             C2194su c2194su = this.f17264a;
/* 14 */            if (c2194su.f16793n) {
/* 16 */                c2194su.f16793n = false;
                    }
/* 18 */            c2194su.m8633a(0);
/* 21 */            c2194su.f16790k = 0.0f;
/* 23 */            c2194su.f16791l = 0.0f;
/* 25 */            c2194su.f16792m = 0.0f;
/* 27 */            c2194su.f16784e = 0.0f;
/* 29 */            c2194su.f16785f = 0.0f;
/* 31 */            c2194su.f16786g = 0.0f;
/* 33 */            invalidateSelf();
                }
            }
