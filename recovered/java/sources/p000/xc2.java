            package p000;

            import android.graphics.Canvas;
            import android.graphics.Matrix;
            import android.graphics.Paint;
            import android.graphics.Path;
            import android.graphics.RadialGradient;
            import android.graphics.RectF;
            import android.graphics.Region;
            import android.graphics.Shader;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class xc2 extends cd2 {

                /* JADX INFO: renamed from: b */
                public final zc2 f19028b;

                public xc2(zc2 zc2Var) {
/* 4 */             this.f19028b = zc2Var;
                }

                @Override // p000.cd2
                /* JADX INFO: renamed from: a */
                public final void mo1635a(Matrix matrix, rc2 rc2Var, int i, Canvas canvas) {
/* 9 */             zc2 zc2Var = this.f19028b;
/* 11 */            float f = zc2Var.f20096f;
/* 13 */            float f2 = zc2Var.f20097g;
/* 25 */            RectF rectF = new RectF(zc2Var.f20092b, zc2Var.f20093c, zc2Var.f20094d, zc2Var.f20095e);
/* 28 */            Paint paint = rc2Var.f15977b;
/* 39 */            boolean z = f2 < 0.0f;
/* 40 */            Path path = rc2Var.f15982g;
/* 44 */            int[] iArr = rc2.f15974k;
/* 46 */            if (z) {
/* 48 */                iArr[0] = 0;
/* 52 */                iArr[1] = rc2Var.f15981f;
/* 56 */                iArr[2] = rc2Var.f15980e;
/* 60 */                iArr[3] = rc2Var.f15979d;
                    } else {
/* 63 */                path.rewind();
/* 74 */                path.moveTo(rectF.centerX(), rectF.centerY());
/* 77 */                path.arcTo(rectF, f, f2);
/* 80 */                path.close();
/* 83 */                float f3 = -i;
/* 85 */                rectF.inset(f3, f3);
/* 88 */                iArr[0] = 0;
/* 92 */                iArr[1] = rc2Var.f15979d;
/* 96 */                iArr[2] = rc2Var.f15980e;
/* 100 */               iArr[3] = rc2Var.f15981f;
                    }
/* 108 */           float fWidth = rectF.width() / 2.0f;
/* 112 */           if (fWidth <= 0.0f) {
/* 114 */               return;
                    }
/* 120 */           float f4 = 1.0f - (i / fWidth);
/* 126 */           float[] fArr = rc2.f15975l;
/* 128 */           fArr[1] = f4;
/* 130 */           fArr[2] = ((1.0f - f4) / 2.0f) + f4;
/* 147 */           paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
/* 150 */           canvas.save();
/* 155 */           canvas.concat(matrix);
/* 167 */           canvas.scale(1.0f, rectF.height() / rectF.width());
/* 170 */           if (!z) {
/* 174 */               canvas.clipPath(path, Region.Op.DIFFERENCE);
/* 179 */               canvas.drawPath(path, rc2Var.f15983h);
                    }
/* 189 */           canvas.drawArc(rectF, f, f2, true, paint);
/* 192 */           canvas.restore();
                }
            }
