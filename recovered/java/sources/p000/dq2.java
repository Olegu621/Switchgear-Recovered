            package p000;

            import android.content.Context;
            import android.graphics.Canvas;
            import android.graphics.Paint;
            import android.graphics.Rect;
            import android.text.TextPaint;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class dq2 extends fd1 implements fn2 {

                /* JADX INFO: renamed from: i0 */
                public CharSequence f7367i0;

                /* JADX INFO: renamed from: j0 */
                public final Context f7368j0;

                /* JADX INFO: renamed from: k0 */
                public final Paint.FontMetrics f7369k0;

                /* JADX INFO: renamed from: l0 */
                public final gn2 f7370l0;

                /* JADX INFO: renamed from: m0 */
                public final mp0 f7371m0;

                /* JADX INFO: renamed from: n0 */
                public final Rect f7372n0;

                /* JADX INFO: renamed from: o0 */
                public int f7373o0;

                /* JADX INFO: renamed from: p0 */
                public int f7374p0;

                /* JADX INFO: renamed from: q0 */
                public int f7375q0;

                /* JADX INFO: renamed from: r0 */
                public int f7376r0;

                /* JADX INFO: renamed from: s0 */
                public int f7377s0;

                /* JADX INFO: renamed from: t0 */
                public int f7378t0;

                /* JADX INFO: renamed from: u0 */
                public float f7379u0;

                /* JADX INFO: renamed from: v0 */
                public float f7380v0;

                /* JADX INFO: renamed from: w0 */
                public float f7381w0;

                /* JADX INFO: renamed from: x0 */
                public float f7382x0;

                public dq2(Context context, int i) {
/* 3 */             super(context, null, 0, i);
/* 11 */            this.f7369k0 = new Paint.FontMetrics();
/* 15 */            gn2 gn2Var = new gn2(this);
/* 18 */            this.f7370l0 = gn2Var;
/* 26 */            this.f7371m0 = new mp0(this, 3);
/* 33 */            this.f7372n0 = new Rect();
/* 37 */            this.f7379u0 = 1.0f;
/* 39 */            this.f7380v0 = 1.0f;
/* 43 */            this.f7381w0 = 0.5f;
/* 45 */            this.f7382x0 = 1.0f;
/* 47 */            this.f7368j0 = context;
/* 57 */            float f = context.getResources().getDisplayMetrics().density;
/* 59 */            TextPaint textPaint = gn2Var.f8747a;
/* 61 */            textPaint.density = f;
/* 65 */            textPaint.setTextAlign(Paint.Align.CENTER);
                }

                @Override // p000.fd1, android.graphics.drawable.Drawable
                public final void draw(Canvas canvas) {
                    Canvas canvas2;
/* 1 */             canvas.save();
/* 4 */             float fM3175w = m3175w();
/* 23 */            float f = (float) (-((Math.sqrt(2.0d) * ((double) this.f7377s0)) - ((double) this.f7377s0)));
/* 68 */            canvas.scale(this.f7379u0, this.f7380v0, (getBounds().width() * 0.5f) + getBounds().left, (getBounds().height() * this.f7381w0) + getBounds().top);
/* 71 */            canvas.translate(fM3175w, f);
/* 74 */            super.draw(canvas);
/* 79 */            if (this.f7367i0 == null) {
/* 81 */                canvas2 = canvas;
                    } else {
/* 83 */                Rect bounds = getBounds();
/* 87 */                float fCenterY = bounds.centerY();
/* 92 */                gn2 gn2Var = this.f7370l0;
/* 94 */                TextPaint textPaint = gn2Var.f8747a;
/* 96 */                Paint.FontMetrics fontMetrics = this.f7369k0;
/* 98 */                textPaint.getFontMetrics(fontMetrics);
/* 110 */               int i = (int) (fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f));
/* 113 */               if (gn2Var.f8752f != null) {
/* 119 */                   textPaint.drawableState = getState();
/* 129 */                   gn2Var.f8752f.m3162e(this.f7368j0, gn2Var.f8747a, gn2Var.f8748b);
/* 138 */                   textPaint.setAlpha((int) (this.f7382x0 * 255.0f));
                        }
/* 141 */               CharSequence charSequence = this.f7367i0;
/* 154 */               canvas2 = canvas;
/* 155 */               canvas2.drawText(charSequence, 0, charSequence.length(), bounds.centerX(), i, textPaint);
                    }
/* 158 */           canvas2.restore();
                }

                @Override // android.graphics.drawable.Drawable
                public final int getIntrinsicHeight() {
/* 16 */            return (int) Math.max(this.f7370l0.f8747a.getTextSize(), this.f7375q0);
                }

                @Override // android.graphics.drawable.Drawable
                public final int getIntrinsicWidth() {
/* 3 */             float f = this.f7373o0 * 2;
/* 6 */             CharSequence charSequence = this.f7367i0;
/* 30 */            return (int) Math.max(f + (charSequence == null ? 0.0f : this.f7370l0.m3977a(charSequence.toString())), this.f7374p0);
                }

                @Override // p000.fd1, android.graphics.drawable.Drawable
                public final void onBoundsChange(Rect rect) {
/* 1 */             super.onBoundsChange(rect);
/* 8 */             sc2 sc2VarM8779f = this.f8151a.f7635a.m8779f();
/* 16 */            sc2VarM8779f.f16533k = m3176x();
/* 22 */            setShapeAppearanceModel(sc2VarM8779f.m8478a());
                }

                /* JADX INFO: renamed from: w */
                public final float m3175w() {
                    int i;
/* 1 */             Rect rect = this.f7372n0;
/* 18 */            if (((rect.right - getBounds().right) - this.f7378t0) - this.f7376r0 < 0) {
/* 34 */                i = ((rect.right - getBounds().right) - this.f7378t0) - this.f7376r0;
                    } else {
/* 52 */                if (((rect.left - getBounds().left) - this.f7378t0) + this.f7376r0 <= 0) {
/* 70 */                    return 0.0f;
                        }
/* 68 */                i = ((rect.left - getBounds().left) - this.f7378t0) + this.f7376r0;
                    }
/* 35 */            return i;
                }

                /* JADX INFO: renamed from: x */
                public final gp1 m3176x() {
/* 5 */             float f = -m3175w();
/* 29 */            float fWidth = ((float) (((double) getBounds().width()) - (Math.sqrt(2.0d) * ((double) this.f7377s0)))) / 2.0f;
/* 49 */            return new gp1(new pc1(this.f7377s0), Math.min(Math.max(f, -fWidth), fWidth));
                }
            }
