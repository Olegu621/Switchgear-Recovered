            package p000;

            import android.graphics.Canvas;
            import android.graphics.Paint;
            import android.graphics.PorterDuff;
            import android.graphics.PorterDuffXfermode;
            import android.graphics.RectF;
            import android.graphics.Region;
            import android.os.Build;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class s30 extends fd1 {

                /* JADX INFO: renamed from: i0 */
                public final RectF f16396i0;

                public s30(tc2 tc2Var) {
/* 9 */             super(tc2Var == null ? new tc2() : tc2Var);
/* 15 */            Paint paint = new Paint(1);
/* 20 */            paint.setStyle(Paint.Style.FILL_AND_STROKE);
/* 24 */            paint.setColor(-1);
/* 34 */            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
/* 42 */            this.f16396i0 = new RectF();
                }

                @Override // p000.fd1
                /* JADX INFO: renamed from: f */
                public final void mo3734f(Canvas canvas) {
/* 1 */             RectF rectF = this.f16396i0;
/* 7 */             if (rectF.isEmpty()) {
/* 9 */                 super.mo3734f(canvas);
/* 12 */                return;
                    }
/* 13 */            canvas.save();
/* 20 */            if (Build.VERSION.SDK_INT >= 26) {
/* 1 */                 canvas.clipOutRect(rectF);
                    } else {
/* 28 */                canvas.clipRect(rectF, Region.Op.DIFFERENCE);
                    }
/* 31 */            super.mo3734f(canvas);
/* 34 */            canvas.restore();
                }

                /* JADX INFO: renamed from: w */
                public final void m8389w(float f, float f2, float f3, float f4) {
/* 1 */             RectF rectF = this.f16396i0;
/* 7 */             if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
/* 28 */                return;
                    }
/* 29 */            rectF.set(f, f2, f3, f4);
/* 32 */            invalidateSelf();
                }
            }
