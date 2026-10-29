            package p000;

            import android.graphics.Canvas;
            import android.graphics.LinearGradient;
            import android.graphics.Matrix;
            import android.graphics.Paint;
            import android.graphics.RectF;
            import android.graphics.Shader;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class yc2 extends cd2 {

                /* JADX INFO: renamed from: b */
                public final ad2 f19576b;

                /* JADX INFO: renamed from: c */
                public final float f19577c;

                /* JADX INFO: renamed from: d */
                public final float f19578d;

                public yc2(ad2 ad2Var, float f, float f2) {
/* 4 */             this.f19576b = ad2Var;
/* 6 */             this.f19577c = f;
/* 8 */             this.f19578d = f2;
                }

                @Override // p000.cd2
                /* JADX INFO: renamed from: a */
                public final void mo1635a(Matrix matrix, rc2 rc2Var, int i, Canvas canvas) {
/* 9 */             ad2 ad2Var = this.f19576b;
/* 11 */            float f = ad2Var.f189c;
/* 13 */            float f2 = this.f19578d;
/* 16 */            float f3 = ad2Var.f188b;
/* 18 */            float f4 = this.f19577c;
/* 31 */            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
/* 38 */            Matrix matrix2 = new Matrix(matrix);
/* 41 */            matrix2.preTranslate(f4, f2);
/* 48 */            matrix2.preRotate(m10144b());
/* 51 */            rc2Var.getClass();
/* 58 */            rectF.bottom += i;
/* 62 */            rectF.offset(0.0f, -i);
/* 66 */            int i2 = rc2Var.f15981f;
/* 68 */            int[] iArr = rc2.f15972i;
/* 70 */            iArr[0] = i2;
/* 75 */            iArr[1] = rc2Var.f15980e;
/* 80 */            iArr[2] = rc2Var.f15979d;
/* 82 */            Paint paint = rc2Var.f15978c;
/* 86 */            float f5 = rectF.left;
/* 100 */           paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, rc2.f15973j, Shader.TileMode.CLAMP));
/* 103 */           canvas.save();
/* 106 */           canvas.concat(matrix2);
/* 109 */           canvas.drawRect(rectF, paint);
/* 112 */           canvas.restore();
                }

                /* JADX INFO: renamed from: b */
                public final float m10144b() {
/* 1 */             ad2 ad2Var = this.f19576b;
/* 23 */            return (float) Math.toDegrees(Math.atan((ad2Var.f189c - this.f19578d) / (ad2Var.f188b - this.f19577c)));
                }
            }
