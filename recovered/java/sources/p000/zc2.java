            package p000;

            import android.graphics.Matrix;
            import android.graphics.Path;
            import android.graphics.RectF;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zc2 extends bd2 {

                /* JADX INFO: renamed from: h */
                public static final RectF f20091h = new RectF();

                /* JADX INFO: renamed from: b */
                public final float f20092b;

                /* JADX INFO: renamed from: c */
                public final float f20093c;

                /* JADX INFO: renamed from: d */
                public final float f20094d;

                /* JADX INFO: renamed from: e */
                public final float f20095e;

                /* JADX INFO: renamed from: f */
                public float f20096f;

                /* JADX INFO: renamed from: g */
                public float f20097g;

                public zc2(float f, float f2, float f3, float f4) {
/* 4 */             this.f20092b = f;
/* 6 */             this.f20093c = f2;
/* 8 */             this.f20094d = f3;
/* 10 */            this.f20095e = f4;
                }

                @Override // p000.bd2
                /* JADX INFO: renamed from: a */
                public final void mo204a(Matrix matrix, Path path) {
/* 1 */             Matrix matrix2 = this.f2377a;
/* 3 */             matrix.invert(matrix2);
/* 6 */             path.transform(matrix2);
/* 9 */             float f = this.f20094d;
/* 11 */            float f2 = this.f20095e;
/* 13 */            RectF rectF = f20091h;
/* 19 */            rectF.set(this.f20092b, this.f20093c, f, f2);
/* 27 */            path.arcTo(rectF, this.f20096f, this.f20097g, false);
/* 30 */            path.transform(matrix);
                }
            }
