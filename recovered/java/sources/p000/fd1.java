            package p000;

            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.graphics.Bitmap;
            import android.graphics.Canvas;
            import android.graphics.ColorFilter;
            import android.graphics.Matrix;
            import android.graphics.Outline;
            import android.graphics.Paint;
            import android.graphics.Path;
            import android.graphics.PorterDuff;
            import android.graphics.PorterDuffColorFilter;
            import android.graphics.PorterDuffXfermode;
            import android.graphics.Rect;
            import android.graphics.RectF;
            import android.graphics.Region;
            import android.graphics.drawable.Drawable;
            import android.os.Build;
            import android.os.Looper;
            import android.util.AttributeSet;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.BitSet;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 154 */   public class fd1 extends Drawable implements ed2 {

                /* JADX INFO: renamed from: h0 */
                public static final Paint f8144h0;

                /* JADX INFO: renamed from: U */
                public final RectF f8145U;

                /* JADX INFO: renamed from: V */
                public final Region f8146V;

                /* JADX INFO: renamed from: W */
                public final Region f8147W;

                /* JADX INFO: renamed from: X */
                public tc2 f8148X;

                /* JADX INFO: renamed from: Y */
                public final Paint f8149Y;

                /* JADX INFO: renamed from: Z */
                public final Paint f8150Z;

                /* JADX INFO: renamed from: a */
                public ed1 f8151a;

                /* JADX INFO: renamed from: a0 */
                public final rc2 f8152a0;

                /* JADX INFO: renamed from: b */
                public final cd2[] f8153b;

                /* JADX INFO: renamed from: b0 */
                public final ts0 f8154b0;

                /* JADX INFO: renamed from: c */
                public final cd2[] f8155c;

                /* JADX INFO: renamed from: c0 */
                public final vc2 f8156c0;

                /* JADX INFO: renamed from: d */
                public final BitSet f8157d;

                /* JADX INFO: renamed from: d0 */
                public PorterDuffColorFilter f8158d0;

                /* JADX INFO: renamed from: e */
                public boolean f8159e;

                /* JADX INFO: renamed from: e0 */
                public PorterDuffColorFilter f8160e0;

                /* JADX INFO: renamed from: f */
                public final Matrix f8161f;

                /* JADX INFO: renamed from: f0 */
                public final RectF f8162f0;

                /* JADX INFO: renamed from: g0 */
                public boolean f8163g0;

                /* JADX INFO: renamed from: i */
                public final Path f8164i;

                /* JADX INFO: renamed from: v */
                public final Path f8165v;

                /* JADX INFO: renamed from: w */
                public final RectF f8166w;

                static {
/* 4 */             Paint paint = new Paint(1);
/* 7 */             f8144h0 = paint;
/* 10 */            paint.setColor(-1);
/* 20 */            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                }

                public fd1(ed1 ed1Var) {
/* 7 */             this.f8153b = new cd2[4];
/* 11 */            this.f8155c = new cd2[4];
/* 20 */            this.f8157d = new BitSet(8);
/* 27 */            this.f8161f = new Matrix();
/* 34 */            this.f8164i = new Path();
/* 41 */            this.f8165v = new Path();
/* 48 */            this.f8166w = new RectF();
/* 55 */            this.f8145U = new RectF();
/* 62 */            this.f8146V = new Region();
/* 69 */            this.f8147W = new Region();
/* 74 */            Paint paint = new Paint(1);
/* 77 */            this.f8149Y = paint;
/* 81 */            Paint paint2 = new Paint(1);
/* 84 */            this.f8150Z = paint2;
/* 91 */            this.f8152a0 = new rc2();
/* 115 */           this.f8156c0 = Looper.getMainLooper().getThread() == Thread.currentThread() ? uc2.f17468a : new vc2();
/* 122 */           this.f8162f0 = new RectF();
/* 124 */           this.f8163g0 = true;
/* 126 */           this.f8151a = ed1Var;
/* 130 */           paint2.setStyle(Paint.Style.STROKE);
/* 135 */           paint.setStyle(Paint.Style.FILL);
/* 138 */           m3749u();
/* 145 */           m3748t(getState());
/* 153 */           this.f8154b0 = new ts0(this);
                }

                /* JADX INFO: renamed from: a */
                public void mo3729a() {
/* 1 */             invalidateSelf();
                }

                /* JADX INFO: renamed from: b */
                public final void m3730b(RectF rectF, Path path) {
/* 1 */             ed1 ed1Var = this.f8151a;
/* 13 */            this.f8156c0.m9251a(ed1Var.f7635a, ed1Var.f7643i, rectF, this.f8154b0, path);
/* 24 */            if (this.f8151a.f7642h != 1.0f) {
/* 26 */                Matrix matrix = this.f8161f;
/* 28 */                matrix.reset();
/* 33 */                float f = this.f8151a.f7642h;
/* 47 */                matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
/* 50 */                path.transform(matrix);
                    }
/* 56 */            path.computeBounds(this.f8162f0, true);
                }

                /* JADX INFO: renamed from: c */
                public final int m3731c(int i) {
/* 1 */             ed1 ed1Var = this.f8151a;
/* 9 */             float f = ed1Var.f7647m + 0.0f + ed1Var.f7646l;
/* 10 */            ic0 ic0Var = ed1Var.f7636b;
                    return ic0Var != null ? ic0Var.m4516a(f, i) : i;
                }

                /* JADX INFO: renamed from: d */
                public final void m3732d(Canvas canvas) {
/* 7 */             if (this.f8157d.cardinality() > 0) {
/* 13 */                AbstractC1245n0.m4889q("fd1", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
                    }
/* 18 */            int i = this.f8151a.f7650p;
/* 20 */            Path path = this.f8164i;
/* 22 */            rc2 rc2Var = this.f8152a0;
/* 24 */            if (i != 0) {
/* 28 */                canvas.drawPath(path, rc2Var.f15976a);
                    }
/* 33 */            for (int i2 = 0; i2 < 4; i2++) {
/* 37 */                cd2 cd2Var = this.f8153b[i2];
/* 41 */                int i3 = this.f8151a.f7649o;
/* 43 */                Matrix matrix = cd2.f2848a;
/* 45 */                cd2Var.mo1635a(matrix, rc2Var, i3, canvas);
/* 56 */                this.f8155c[i2].mo1635a(matrix, rc2Var, this.f8151a.f7649o, canvas);
                    }
/* 64 */            if (this.f8163g0) {
/* 82 */                int iSin = (int) (Math.sin(Math.toRadians(0.0d)) * ((double) this.f8151a.f7650p));
/* 83 */                int iM3736h = m3736h();
/* 91 */                canvas.translate(-iSin, -iM3736h);
/* 96 */                canvas.drawPath(path, f8144h0);
/* 101 */               canvas.translate(iSin, iM3736h);
                    }
                }

                @Override // android.graphics.drawable.Drawable
                public void draw(Canvas canvas) {
/* 5 */             PorterDuffColorFilter porterDuffColorFilter = this.f8158d0;
/* 7 */             Paint paint = this.f8149Y;
/* 9 */             paint.setColorFilter(porterDuffColorFilter);
/* 12 */            int alpha = paint.getAlpha();
/* 18 */            int i = this.f8151a.f7645k;
/* 26 */            paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
/* 29 */            PorterDuffColorFilter porterDuffColorFilter2 = this.f8160e0;
/* 31 */            Paint paint2 = this.f8150Z;
/* 33 */            paint2.setColorFilter(porterDuffColorFilter2);
/* 40 */            paint2.setStrokeWidth(this.f8151a.f7644j);
/* 43 */            int alpha2 = paint2.getAlpha();
/* 49 */            int i2 = this.f8151a.f7645k;
/* 57 */            paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
/* 60 */            boolean z = this.f8159e;
/* 64 */            Path path = this.f8164i;
/* 66 */            if (z) {
/* 84 */                float f = -(m3738j() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
/* 87 */                tc2 tc2Var = this.f8151a.f7635a;
/* 89 */                sc2 sc2VarM8779f = tc2Var.m8779f();
/* 93 */                m10 c0167b4 = tc2Var.f17036e;
/* 97 */                if (!(c0167b4 instanceof a32)) {
/* 102 */                   c0167b4 = new C0167b4(f, c0167b4);
                        }
/* 106 */               sc2VarM8779f.f16527e = c0167b4;
/* 108 */               m10 c0167b5 = tc2Var.f17037f;
/* 112 */               if (!(c0167b5 instanceof a32)) {
/* 117 */                   c0167b5 = new C0167b4(f, c0167b5);
                        }
/* 121 */               sc2VarM8779f.f16528f = c0167b5;
/* 123 */               m10 c0167b6 = tc2Var.f17039h;
/* 127 */               if (!(c0167b6 instanceof a32)) {
/* 132 */                   c0167b6 = new C0167b4(f, c0167b6);
                        }
/* 136 */               sc2VarM8779f.f16530h = c0167b6;
/* 138 */               m10 c0167b7 = tc2Var.f17038g;
/* 142 */               if (!(c0167b7 instanceof a32)) {
/* 147 */                   c0167b7 = new C0167b4(f, c0167b7);
                        }
/* 151 */               sc2VarM8779f.f16529g = c0167b7;
/* 153 */               tc2 tc2VarM8478a = sc2VarM8779f.m8478a();
/* 157 */               this.f8148X = tc2VarM8478a;
/* 161 */               float f2 = this.f8151a.f7643i;
/* 163 */               RectF rectFM3735g = m3735g();
/* 167 */               RectF rectF = this.f8145U;
/* 169 */               rectF.set(rectFM3735g);
/* 182 */               float strokeWidth = m3738j() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
/* 184 */               rectF.inset(strokeWidth, strokeWidth);
/* 195 */               this.f8156c0.m9251a(tc2VarM8478a, f2, rectF, null, this.f8165v);
/* 202 */               m3730b(m3735g(), path);
/* 206 */               this.f8159e = false;
                    }
/* 208 */           ed1 ed1Var = this.f8151a;
/* 210 */           int i3 = ed1Var.f7648n;
/* 213 */           if (i3 != 1 && ed1Var.f7649o > 0 && (i3 == 2 || (!m3740l() && !path.isConvex() && Build.VERSION.SDK_INT < 29))) {
/* 240 */               canvas.save();
/* 266 */               canvas.translate((int) (Math.sin(Math.toRadians(0.0d)) * ((double) this.f8151a.f7650p)), m3736h());
/* 271 */               if (this.f8163g0) {
/* 281 */                   RectF rectF2 = this.f8162f0;
/* 297 */                   int iWidth = (int) (rectF2.width() - getBounds().width());
/* 312 */                   int iHeight = (int) (rectF2.height() - getBounds().height());
/* 313 */                   if (iWidth < 0 || iHeight < 0) {
/* 399 */                       f42.m3656l("Invalid shadow bounds. Check that the treatments result in a valid path.");
/* 402 */                       return;
                            }
/* 343 */                   Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.f8151a.f7649o * 2) + ((int) rectF2.width()) + iWidth, (this.f8151a.f7649o * 2) + ((int) rectF2.height()) + iHeight, Bitmap.Config.ARGB_8888);
/* 349 */                   Canvas canvas2 = new Canvas(bitmapCreateBitmap);
/* 363 */                   float f3 = (getBounds().left - this.f8151a.f7649o) - iWidth;
/* 376 */                   float f4 = (getBounds().top - this.f8151a.f7649o) - iHeight;
/* 380 */                   canvas2.translate(-f3, -f4);
/* 383 */                   m3732d(canvas2);
/* 387 */                   canvas.drawBitmap(bitmapCreateBitmap, f3, f4, (Paint) null);
/* 390 */                   bitmapCreateBitmap.recycle();
/* 393 */                   canvas.restore();
                        } else {
/* 273 */                   m3732d(canvas);
/* 276 */                   canvas.restore();
                        }
                    }
/* 403 */           ed1 ed1Var2 = this.f8151a;
/* 405 */           Paint.Style style = ed1Var2.f7651q;
/* 409 */           if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
/* 421 */               m3733e(canvas, paint, path, ed1Var2.f7635a, m3735g());
                    }
/* 428 */           if (m3738j()) {
/* 430 */               mo3734f(canvas);
                    }
/* 433 */           paint.setAlpha(alpha);
/* 436 */           paint2.setAlpha(alpha2);
                }

                /* JADX INFO: renamed from: e */
                public final void m3733e(Canvas canvas, Paint paint, Path path, tc2 tc2Var, RectF rectF) {
/* 5 */             if (!tc2Var.m8778e(rectF)) {
/* 22 */                canvas.drawPath(path, paint);
                    } else {
/* 17 */                float fMo47a = tc2Var.f17037f.mo47a(rectF) * this.f8151a.f7643i;
/* 18 */                canvas.drawRoundRect(rectF, fMo47a, fMo47a, paint);
                    }
                }

                /* JADX INFO: renamed from: f */
                public void mo3734f(Canvas canvas) {
/* 1 */             tc2 tc2Var = this.f8148X;
/* 3 */             RectF rectFM3735g = m3735g();
/* 7 */             RectF rectF = this.f8145U;
/* 9 */             rectF.set(rectFM3735g);
/* 12 */            boolean zM3738j = m3738j();
/* 16 */            Paint paint = this.f8150Z;
/* 28 */            float strokeWidth = zM3738j ? paint.getStrokeWidth() / 2.0f : 0.0f;
/* 29 */            rectF.inset(strokeWidth, strokeWidth);
/* 36 */            m3733e(canvas, paint, this.f8165v, tc2Var, rectF);
                }

                /* JADX INFO: renamed from: g */
                public final RectF m3735g() {
/* 1 */             Rect bounds = getBounds();
/* 5 */             RectF rectF = this.f8166w;
/* 7 */             rectF.set(bounds);
/* 10 */            return rectF;
                }

                @Override // android.graphics.drawable.Drawable
                public int getAlpha() {
/* 3 */             return this.f8151a.f7645k;
                }

                @Override // android.graphics.drawable.Drawable
                public final Drawable.ConstantState getConstantState() {
/* 1 */             return this.f8151a;
                }

                @Override // android.graphics.drawable.Drawable
                public int getOpacity() {
/* 1 */             return -3;
                }

                @Override // android.graphics.drawable.Drawable
                public void getOutline(Outline outline) {
/* 6 */             if (this.f8151a.f7648n == 2) {
/* 54 */                return;
                    }
/* 13 */            if (m3740l()) {
/* 28 */                outline.setRoundRect(getBounds(), m3737i() * this.f8151a.f7643i);
/* 31 */                return;
                    }
/* 32 */            RectF rectFM3735g = m3735g();
/* 36 */            Path path = this.f8164i;
/* 38 */            m3730b(rectFM3735g, path);
/* 45 */            if (path.isConvex() || Build.VERSION.SDK_INT >= 29) {
                        try {
/* 55 */                    outline.setConvexPath(path);
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }

                @Override // android.graphics.drawable.Drawable
                public final boolean getPadding(Rect rect) {
/* 3 */             Rect rect2 = this.f8151a.f7641g;
/* 5 */             if (rect2 == null) {
/* 12 */                return super.getPadding(rect);
                    }
/* 7 */             rect.set(rect2);
/* 10 */            return true;
                }

                @Override // android.graphics.drawable.Drawable
                public final Region getTransparentRegion() {
/* 1 */             Rect bounds = getBounds();
/* 5 */             Region region = this.f8146V;
/* 7 */             region.set(bounds);
/* 10 */            RectF rectFM3735g = m3735g();
/* 14 */            Path path = this.f8164i;
/* 16 */            m3730b(rectFM3735g, path);
/* 19 */            Region region2 = this.f8147W;
/* 21 */            region2.setPath(path, region);
/* 26 */            region.op(region2, Region.Op.DIFFERENCE);
/* 29 */            return region;
                }

                /* JADX INFO: renamed from: h */
                public final int m3736h() {
/* 17 */            return (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.f8151a.f7650p));
                }

                /* JADX INFO: renamed from: i */
                public final float m3737i() {
/* 11 */            return this.f8151a.f7635a.f17036e.mo47a(m3735g());
                }

                @Override // android.graphics.drawable.Drawable
                public final void invalidateSelf() {
/* 2 */             this.f8159e = true;
/* 4 */             super.invalidateSelf();
                }

                @Override // android.graphics.drawable.Drawable
                public boolean isStateful() {
/* 5 */             if (super.isStateful()) {
/* 51 */                return true;
                    }
/* 9 */             ColorStateList colorStateList = this.f8151a.f7639e;
/* 11 */            if (colorStateList != null && colorStateList.isStateful()) {
/* 51 */                return true;
                    }
/* 21 */            this.f8151a.getClass();
/* 26 */            ColorStateList colorStateList2 = this.f8151a.f7638d;
/* 28 */            if (colorStateList2 != null && colorStateList2.isStateful()) {
/* 51 */                return true;
                    }
/* 38 */            ColorStateList colorStateList3 = this.f8151a.f7637c;
                    return colorStateList3 != null && colorStateList3.isStateful();
                }

                /* JADX INFO: renamed from: j */
                public final boolean m3738j() {
/* 3 */             Paint.Style style = this.f8151a.f7651q;
                    return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f8150Z.getStrokeWidth() > 0.0f;
                }

                /* JADX INFO: renamed from: k */
                public final void m3739k(Context context) {
/* 8 */             this.f8151a.f7636b = new ic0(context);
/* 10 */            m3750v();
                }

                /* JADX INFO: renamed from: l */
                public final boolean m3740l() {
/* 9 */             return this.f8151a.f7635a.m8778e(m3735g());
                }

                /* JADX INFO: renamed from: m */
                public final void m3741m(float f) {
/* 1 */             ed1 ed1Var = this.f8151a;
/* 7 */             if (ed1Var.f7647m != f) {
/* 9 */                 ed1Var.f7647m = f;
/* 11 */                m3750v();
                    }
                }

                @Override // android.graphics.drawable.Drawable
                public final Drawable mutate() {
/* 3 */             ed1 ed1Var = this.f8151a;
/* 5 */             ed1 ed1Var2 = new ed1();
/* 9 */             ed1Var2.f7637c = null;
/* 11 */            ed1Var2.f7638d = null;
/* 13 */            ed1Var2.f7639e = null;
/* 17 */            ed1Var2.f7640f = PorterDuff.Mode.SRC_IN;
/* 19 */            ed1Var2.f7641g = null;
/* 23 */            ed1Var2.f7642h = 1.0f;
/* 25 */            ed1Var2.f7643i = 1.0f;
/* 29 */            ed1Var2.f7645k = 255;
/* 32 */            ed1Var2.f7646l = 0.0f;
/* 34 */            ed1Var2.f7647m = 0.0f;
/* 37 */            ed1Var2.f7648n = 0;
/* 39 */            ed1Var2.f7649o = 0;
/* 41 */            ed1Var2.f7650p = 0;
/* 45 */            ed1Var2.f7651q = Paint.Style.FILL_AND_STROKE;
/* 49 */            ed1Var2.f7635a = ed1Var.f7635a;
/* 53 */            ed1Var2.f7636b = ed1Var.f7636b;
/* 57 */            ed1Var2.f7644j = ed1Var.f7644j;
/* 61 */            ed1Var2.f7637c = ed1Var.f7637c;
/* 65 */            ed1Var2.f7638d = ed1Var.f7638d;
/* 69 */            ed1Var2.f7640f = ed1Var.f7640f;
/* 73 */            ed1Var2.f7639e = ed1Var.f7639e;
/* 77 */            ed1Var2.f7645k = ed1Var.f7645k;
/* 81 */            ed1Var2.f7642h = ed1Var.f7642h;
/* 85 */            ed1Var2.f7650p = ed1Var.f7650p;
/* 89 */            ed1Var2.f7648n = ed1Var.f7648n;
/* 93 */            ed1Var2.f7643i = ed1Var.f7643i;
/* 97 */            ed1Var2.f7646l = ed1Var.f7646l;
/* 101 */           ed1Var2.f7647m = ed1Var.f7647m;
/* 105 */           ed1Var2.f7649o = ed1Var.f7649o;
/* 109 */           ed1Var2.f7651q = ed1Var.f7651q;
/* 113 */           if (ed1Var.f7641g != null) {
/* 122 */               ed1Var2.f7641g = new Rect(ed1Var.f7641g);
                    }
/* 124 */           this.f8151a = ed1Var2;
/* 126 */           return this;
                }

                /* JADX INFO: renamed from: n */
                public final void m3742n(ColorStateList colorStateList) {
/* 1 */             ed1 ed1Var = this.f8151a;
/* 5 */             if (ed1Var.f7637c != colorStateList) {
/* 7 */                 ed1Var.f7637c = colorStateList;
/* 13 */                onStateChange(getState());
                    }
                }

                /* JADX INFO: renamed from: o */
                public final void m3743o(float f) {
/* 1 */             ed1 ed1Var = this.f8151a;
/* 7 */             if (ed1Var.f7643i != f) {
/* 9 */                 ed1Var.f7643i = f;
/* 12 */                this.f8159e = true;
/* 14 */                invalidateSelf();
                    }
                }

                @Override // android.graphics.drawable.Drawable
                public void onBoundsChange(Rect rect) {
/* 2 */             this.f8159e = true;
/* 4 */             super.onBoundsChange(rect);
                }

                @Override // android.graphics.drawable.Drawable
                public boolean onStateChange(int[] iArr) {
/* 16 */            boolean z = m3748t(iArr) || m3749u();
/* 17 */            if (z) {
/* 19 */                invalidateSelf();
                    }
/* 22 */            return z;
                }

                /* JADX INFO: renamed from: p */
                public final void m3744p() {
/* 5 */             this.f8151a.f7651q = Paint.Style.FILL;
/* 7 */             super.invalidateSelf();
                }

                /* JADX INFO: renamed from: q */
                public final void m3745q() {
/* 6 */             this.f8152a0.m8131a(-12303292);
/* 11 */            this.f8151a.getClass();
/* 14 */            super.invalidateSelf();
                }

                /* JADX INFO: renamed from: r */
                public final void m3746r() {
/* 1 */             ed1 ed1Var = this.f8151a;
/* 6 */             if (ed1Var.f7648n != 2) {
/* 8 */                 ed1Var.f7648n = 2;
/* 10 */                super.invalidateSelf();
                    }
                }

                /* JADX INFO: renamed from: s */
                public final void m3747s(ColorStateList colorStateList) {
/* 1 */             ed1 ed1Var = this.f8151a;
/* 5 */             if (ed1Var.f7638d != colorStateList) {
/* 7 */                 ed1Var.f7638d = colorStateList;
/* 13 */                onStateChange(getState());
                    }
                }

                @Override // android.graphics.drawable.Drawable
                public void setAlpha(int i) {
/* 1 */             ed1 ed1Var = this.f8151a;
/* 5 */             if (ed1Var.f7645k != i) {
/* 7 */                 ed1Var.f7645k = i;
/* 9 */                 super.invalidateSelf();
                    }
                }

                @Override // android.graphics.drawable.Drawable
                public void setColorFilter(ColorFilter colorFilter) {
/* 3 */             this.f8151a.getClass();
/* 6 */             super.invalidateSelf();
                }

                @Override // p000.ed2
                public final void setShapeAppearanceModel(tc2 tc2Var) {
/* 3 */             this.f8151a.f7635a = tc2Var;
/* 5 */             invalidateSelf();
                }

                @Override // android.graphics.drawable.Drawable
                public final void setTint(int i) {
/* 5 */             setTintList(ColorStateList.valueOf(i));
                }

                @Override // android.graphics.drawable.Drawable
                public void setTintList(ColorStateList colorStateList) {
/* 3 */             this.f8151a.f7639e = colorStateList;
/* 5 */             m3749u();
/* 8 */             super.invalidateSelf();
                }

                @Override // android.graphics.drawable.Drawable
                public void setTintMode(PorterDuff.Mode mode) {
/* 1 */             ed1 ed1Var = this.f8151a;
/* 5 */             if (ed1Var.f7640f != mode) {
/* 7 */                 ed1Var.f7640f = mode;
/* 9 */                 m3749u();
/* 12 */                super.invalidateSelf();
                    }
                }

                /* JADX INFO: renamed from: t */
                public final boolean m3748t(int[] iArr) {
                    boolean z;
                    Paint paint;
                    int color;
                    int colorForState;
                    Paint paint2;
                    int color2;
                    int colorForState2;
/* 6 */             if (this.f8151a.f7637c == null || color2 == (colorForState2 = this.f8151a.f7637c.getColorForState(iArr, (color2 = (paint2 = this.f8149Y).getColor())))) {
/* 29 */                z = false;
                    } else {
/* 24 */                paint2.setColor(colorForState2);
/* 27 */                z = true;
                    }
/* 34 */            if (this.f8151a.f7638d == null || color == (colorForState = this.f8151a.f7638d.getColorForState(iArr, (color = (paint = this.f8150Z).getColor())))) {
/* 56 */                return z;
                    }
/* 52 */            paint.setColor(colorForState);
/* 5 */             return true;
                }

                /* JADX INFO: renamed from: u */
                public final boolean m3749u() {
                    PorterDuffColorFilter porterDuffColorFilter;
/* 1 */             PorterDuffColorFilter porterDuffColorFilter2 = this.f8158d0;
/* 3 */             PorterDuffColorFilter porterDuffColorFilter3 = this.f8160e0;
/* 5 */             ed1 ed1Var = this.f8151a;
/* 7 */             ColorStateList colorStateList = ed1Var.f7639e;
/* 9 */             PorterDuff.Mode mode = ed1Var.f7640f;
/* 14 */            if (colorStateList == null || mode == null) {
/* 39 */                int color = this.f8149Y.getColor();
/* 43 */                int iM3731c = m3731c(color);
/* 57 */                porterDuffColorFilter = iM3731c != color ? new PorterDuffColorFilter(iM3731c, PorterDuff.Mode.SRC_IN) : null;
                    } else {
/* 33 */                porterDuffColorFilter = new PorterDuffColorFilter(m3731c(colorStateList.getColorForState(getState(), 0)), mode);
                    }
/* 58 */            this.f8158d0 = porterDuffColorFilter;
/* 62 */            this.f8151a.getClass();
/* 65 */            this.f8160e0 = null;
/* 69 */            this.f8151a.getClass();
                    return (Objects.equals(porterDuffColorFilter2, this.f8158d0) && Objects.equals(porterDuffColorFilter3, this.f8160e0)) ? false : true;
                }

                /* JADX INFO: renamed from: v */
                public final void m3750v() {
/* 1 */             ed1 ed1Var = this.f8151a;
/* 6 */             float f = ed1Var.f7647m + 0.0f;
/* 16 */            ed1Var.f7649o = (int) Math.ceil(0.75f * f);
/* 29 */            this.f8151a.f7650p = (int) Math.ceil(f * 0.25f);
/* 31 */            m3749u();
/* 34 */            super.invalidateSelf();
                }

/* 155 */       public fd1(Context context, AttributeSet attributeSet, int i, int i2) {
/* 156 */           this(tc2.m8775b(context, attributeSet, i, i2).m8478a());
                }

/* 156 */       public fd1(tc2 tc2Var) {
/* 158 */           ed1 ed1Var = new ed1();
/* 159 */           ed1Var.f7637c = null;
/* 160 */           ed1Var.f7638d = null;
/* 161 */           ed1Var.f7639e = null;
/* 162 */           ed1Var.f7640f = PorterDuff.Mode.SRC_IN;
/* 163 */           ed1Var.f7641g = null;
/* 164 */           ed1Var.f7642h = 1.0f;
/* 165 */           ed1Var.f7643i = 1.0f;
/* 166 */           ed1Var.f7645k = 255;
/* 167 */           ed1Var.f7646l = 0.0f;
/* 168 */           ed1Var.f7647m = 0.0f;
/* 169 */           ed1Var.f7648n = 0;
/* 170 */           ed1Var.f7649o = 0;
/* 171 */           ed1Var.f7650p = 0;
/* 172 */           ed1Var.f7651q = Paint.Style.FILL_AND_STROKE;
/* 173 */           ed1Var.f7635a = tc2Var;
/* 174 */           ed1Var.f7636b = null;
/* 175 */           this(ed1Var);
                }

/* 175 */       public fd1() {
/* 176 */           this(new tc2());
                }
            }
