            package p000;

            import android.animation.TypeEvaluator;
            import android.graphics.Matrix;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class wj0 implements TypeEvaluator {

                /* JADX INFO: renamed from: a */
                public final float[] f18659a = new float[9];

                /* JADX INFO: renamed from: b */
                public final float[] f18660b = new float[9];

                /* JADX INFO: renamed from: c */
                public final Matrix f18661c = new Matrix();

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ bk0 f18662d;

                public wj0(bk0 bk0Var) {
/* 4 */             this.f18662d = bk0Var;
                }

                @Override // android.animation.TypeEvaluator
                public final Object evaluate(float f, Object obj, Object obj2) {
/* 7 */             this.f18662d.f2481o = f;
/* 9 */             float[] fArr = this.f18659a;
/* 11 */            ((Matrix) obj).getValues(fArr);
/* 14 */            float[] fArr2 = this.f18660b;
/* 16 */            ((Matrix) obj2).getValues(fArr2);
/* 22 */            for (int i = 0; i < 9; i++) {
/* 24 */                float f2 = fArr2[i];
/* 26 */                float f3 = fArr[i];
/* 32 */                fArr2[i] = AbstractC0886en.m3503g(f2, f3, f, f3);
                    }
/* 37 */            Matrix matrix = this.f18661c;
/* 39 */            matrix.setValues(fArr2);
/* 42 */            return matrix;
                }
            }
