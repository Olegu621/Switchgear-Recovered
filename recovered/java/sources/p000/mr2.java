            package p000;

            import android.animation.TypeEvaluator;
            import android.graphics.Matrix;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class mr2 implements TypeEvaluator {

                /* JADX INFO: renamed from: a */
                public final float[] f13985a = new float[9];

                /* JADX INFO: renamed from: b */
                public final float[] f13986b = new float[9];

                /* JADX INFO: renamed from: c */
                public final Matrix f13987c = new Matrix();

                @Override // android.animation.TypeEvaluator
                public final Object evaluate(float f, Object obj, Object obj2) {
/* 5 */             float[] fArr = this.f13985a;
/* 7 */             ((Matrix) obj).getValues(fArr);
/* 10 */            float[] fArr2 = this.f13986b;
/* 12 */            ((Matrix) obj2).getValues(fArr2);
/* 18 */            for (int i = 0; i < 9; i++) {
/* 20 */                float f2 = fArr2[i];
/* 22 */                float f3 = fArr[i];
/* 28 */                fArr2[i] = AbstractC0886en.m3503g(f2, f3, f, f3);
                    }
/* 33 */            Matrix matrix = this.f13987c;
/* 35 */            matrix.setValues(fArr2);
/* 38 */            return matrix;
                }
            }
