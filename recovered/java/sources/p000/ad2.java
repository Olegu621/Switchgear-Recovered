            package p000;

            import android.graphics.Matrix;
            import android.graphics.Path;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ad2 extends bd2 {

                /* JADX INFO: renamed from: b */
                public float f188b;

                /* JADX INFO: renamed from: c */
                public float f189c;

                @Override // p000.bd2
                /* JADX INFO: renamed from: a */
                public final void mo204a(Matrix matrix, Path path) {
/* 1 */             Matrix matrix2 = this.f2377a;
/* 3 */             matrix.invert(matrix2);
/* 6 */             path.transform(matrix2);
/* 13 */            path.lineTo(this.f188b, this.f189c);
/* 16 */            path.transform(matrix);
                }
            }
