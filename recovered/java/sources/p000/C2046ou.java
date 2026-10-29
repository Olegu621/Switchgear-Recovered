            package p000;

            import android.graphics.Canvas;
            import android.graphics.Paint;
            import android.graphics.RectF;
            import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
            
            /* JADX INFO: renamed from: ou */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2046ou extends ca0 {

                /* JADX INFO: renamed from: c */
                public int f14897c;

                /* JADX INFO: renamed from: d */
                public float f14898d;

                /* JADX INFO: renamed from: e */
                public float f14899e;

                /* JADX INFO: renamed from: f */
                public float f14900f;

                public C2046ou(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
/* 1 */             super(circularProgressIndicatorSpec);
/* 5 */             this.f14897c = 1;
                }

                @Override // p000.ca0
                /* JADX INFO: renamed from: a */
                public final void mo1555a(Canvas canvas, float f) {
/* 3 */             CircularProgressIndicatorSpec circularProgressIndicatorSpec = (CircularProgressIndicatorSpec) this.f2787a;
/* 14 */            float f2 = (circularProgressIndicatorSpec.f4844g / 2.0f) + circularProgressIndicatorSpec.f4845h;
/* 15 */            canvas.translate(f2, f2);
/* 20 */            canvas.rotate(-90.0f);
/* 23 */            float f3 = -f2;
/* 24 */            canvas.clipRect(f3, f3, f2, f2);
/* 35 */            this.f14897c = circularProgressIndicatorSpec.f4846i == 0 ? 1 : -1;
/* 37 */            int i = circularProgressIndicatorSpec.f14762a;
/* 41 */            this.f14898d = i * f;
/* 47 */            this.f14899e = circularProgressIndicatorSpec.f14763b * f;
/* 54 */            this.f14900f = (circularProgressIndicatorSpec.f4844g - i) / 2.0f;
/* 65 */            if ((this.f2788b.m10129d() && circularProgressIndicatorSpec.f14766e == 2) || (this.f2788b.m10128c() && circularProgressIndicatorSpec.f14767f == 1)) {
/* 92 */                this.f14900f = (((1.0f - f) * circularProgressIndicatorSpec.f14762a) / 2.0f) + this.f14900f;
                    } else if ((this.f2788b.m10129d() && circularProgressIndicatorSpec.f14766e == 1) || (this.f2788b.m10128c() && circularProgressIndicatorSpec.f14767f == 2)) {
/* 128 */               this.f14900f -= ((1.0f - f) * circularProgressIndicatorSpec.f14762a) / 2.0f;
                    }
                }

                @Override // p000.ca0
                /* JADX INFO: renamed from: b */
                public final void mo1556b(Canvas canvas, Paint paint, float f, float f2, int i) {
/* 3 */             if (f == f2) {
/* 112 */               return;
                    }
/* 9 */             paint.setStyle(Paint.Style.STROKE);
/* 14 */            paint.setStrokeCap(Paint.Cap.BUTT);
/* 18 */            paint.setAntiAlias(true);
/* 21 */            paint.setColor(i);
/* 26 */            paint.setStrokeWidth(this.f14898d);
/* 33 */            float f3 = this.f14897c;
/* 36 */            float f4 = f * 360.0f * f3;
/* 45 */            float f5 = (f2 >= f ? f2 - f : (1.0f + f2) - f) * 360.0f * f3;
/* 55 */            float f6 = this.f14900f;
/* 57 */            float f7 = -f6;
/* 65 */            canvas.drawArc(new RectF(f7, f7, f6, f6), f4, f5, false, paint);
/* 74 */            if (this.f14899e <= 0.0f || Math.abs(f5) >= 360.0f) {
/* 112 */               return;
                    }
/* 86 */            paint.setStyle(Paint.Style.FILL);
/* 97 */            m7240f(canvas, paint, this.f14898d, this.f14899e, f4);
/* 109 */           m7240f(canvas, paint, this.f14898d, this.f14899e, f4 + f5);
                }

                @Override // p000.ca0
                /* JADX INFO: renamed from: c */
                public final void mo1557c(Canvas canvas, Paint paint) {
/* 11 */            int iM9772j = xe2.m9772j(((CircularProgressIndicatorSpec) this.f2787a).f14765d, this.f2788b.f19528U);
/* 17 */            paint.setStyle(Paint.Style.STROKE);
/* 22 */            paint.setStrokeCap(Paint.Cap.BUTT);
/* 26 */            paint.setAntiAlias(true);
/* 29 */            paint.setColor(iM9772j);
/* 34 */            paint.setStrokeWidth(this.f14898d);
/* 39 */            float f = this.f14900f;
/* 41 */            float f2 = -f;
/* 51 */            canvas.drawArc(new RectF(f2, f2, f, f), 0.0f, 360.0f, false, paint);
                }

                @Override // p000.ca0
                /* JADX INFO: renamed from: d */
                public final int mo1558d() {
/* 3 */             CircularProgressIndicatorSpec circularProgressIndicatorSpec = (CircularProgressIndicatorSpec) this.f2787a;
/* 11 */            return (circularProgressIndicatorSpec.f4845h * 2) + circularProgressIndicatorSpec.f4844g;
                }

                @Override // p000.ca0
                /* JADX INFO: renamed from: e */
                public final int mo1559e() {
/* 3 */             CircularProgressIndicatorSpec circularProgressIndicatorSpec = (CircularProgressIndicatorSpec) this.f2787a;
/* 11 */            return (circularProgressIndicatorSpec.f4845h * 2) + circularProgressIndicatorSpec.f4844g;
                }

                /* JADX INFO: renamed from: f */
                public final void m7240f(Canvas canvas, Paint paint, float f, float f2, float f3) {
/* 1 */             canvas.save();
/* 4 */             canvas.rotate(f3);
/* 9 */             float f4 = this.f14900f;
/* 13 */            float f5 = f / 2.0f;
/* 21 */            canvas.drawRoundRect(new RectF(f4 - f5, f2, f4 + f5, -f2), f2, f2, paint);
/* 24 */            canvas.restore();
                }
            }
