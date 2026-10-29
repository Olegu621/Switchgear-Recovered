            package p000;

            import android.graphics.Canvas;
            import android.graphics.Paint;
            import android.graphics.Rect;
            import android.graphics.RectF;
            import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class o71 extends ca0 {

                /* JADX INFO: renamed from: c */
                public float f14657c;

                /* JADX INFO: renamed from: d */
                public float f14658d;

                /* JADX INFO: renamed from: e */
                public float f14659e;

                public o71(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
/* 1 */             super(linearProgressIndicatorSpec);
/* 6 */             this.f14657c = 300.0f;
                }

                @Override // p000.ca0
                /* JADX INFO: renamed from: a */
                public final void mo1555a(Canvas canvas, float f) {
/* 1 */             Rect clipBounds = canvas.getClipBounds();
/* 10 */            this.f14657c = clipBounds.width();
/* 14 */            LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) this.f2787a;
/* 16 */            float f2 = linearProgressIndicatorSpec.f14762a;
/* 56 */            canvas.translate((clipBounds.width() / 2.0f) + clipBounds.left, Math.max(0.0f, (clipBounds.height() - linearProgressIndicatorSpec.f14762a) / 2.0f) + (clipBounds.height() / 2.0f) + clipBounds.top);
/* 65 */            if (linearProgressIndicatorSpec.f4850i) {
/* 67 */                canvas.scale(-1.0f, 1.0f);
                    }
/* 76 */            if ((this.f2788b.m10129d() && linearProgressIndicatorSpec.f14766e == 1) || (this.f2788b.m10128c() && linearProgressIndicatorSpec.f14767f == 2)) {
/* 96 */                canvas.scale(1.0f, -1.0f);
                    }
/* 105 */           if (this.f2788b.m10129d() || this.f2788b.m10128c()) {
/* 122 */               canvas.translate(0.0f, ((f - 1.0f) * linearProgressIndicatorSpec.f14762a) / 2.0f);
                    }
/* 125 */           float f3 = this.f14657c;
/* 133 */           canvas.clipRect((-f3) / 2.0f, (-f2) / 2.0f, f3 / 2.0f, f2 / 2.0f);
/* 140 */           this.f14658d = linearProgressIndicatorSpec.f14762a * f;
/* 146 */           this.f14659e = linearProgressIndicatorSpec.f14763b * f;
                }

                @Override // p000.ca0
                /* JADX INFO: renamed from: b */
                public final void mo1556b(Canvas canvas, Paint paint, float f, float f2, int i) {
/* 3 */             if (f == f2) {
/* 5 */                 return;
                    }
/* 6 */             float f3 = this.f14657c;
/* 11 */            float f4 = (-f3) / 2.0f;
/* 14 */            float f5 = this.f14659e * 2.0f;
/* 15 */            float f6 = f3 - f5;
/* 23 */            paint.setStyle(Paint.Style.FILL);
/* 27 */            paint.setAntiAlias(true);
/* 30 */            paint.setColor(i);
/* 35 */            float f7 = this.f14658d;
/* 40 */            RectF rectF = new RectF((f * f6) + f4, (-f7) / 2.0f, (f6 * f2) + f4 + f5, f7 / 2.0f);
/* 43 */            float f8 = this.f14659e;
/* 45 */            canvas.drawRoundRect(rectF, f8, f8, paint);
                }

                @Override // p000.ca0
                /* JADX INFO: renamed from: c */
                public final void mo1557c(Canvas canvas, Paint paint) {
/* 11 */            int iM9772j = xe2.m9772j(((LinearProgressIndicatorSpec) this.f2787a).f14765d, this.f2788b.f19528U);
/* 17 */            paint.setStyle(Paint.Style.FILL);
/* 21 */            paint.setAntiAlias(true);
/* 24 */            paint.setColor(iM9772j);
/* 29 */            float f = this.f14657c;
/* 35 */            float f2 = this.f14658d;
/* 41 */            RectF rectF = new RectF((-f) / 2.0f, (-f2) / 2.0f, f / 2.0f, f2 / 2.0f);
/* 44 */            float f3 = this.f14659e;
/* 46 */            canvas.drawRoundRect(rectF, f3, f3, paint);
                }

                @Override // p000.ca0
                /* JADX INFO: renamed from: d */
                public final int mo1558d() {
/* 5 */             return ((LinearProgressIndicatorSpec) this.f2787a).f14762a;
                }

                @Override // p000.ca0
                /* JADX INFO: renamed from: e */
                public final int mo1559e() {
/* 1 */             return -1;
                }
            }
