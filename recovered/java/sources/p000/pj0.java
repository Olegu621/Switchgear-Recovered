            package p000;

            import android.animation.FloatEvaluator;
            import android.animation.TypeEvaluator;
            import android.graphics.Rect;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class pj0 implements TypeEvaluator {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f15140a;

                /* JADX INFO: renamed from: b */
                public Object f15141b;

                @Override // android.animation.TypeEvaluator
                public final Object evaluate(float f, Object obj, Object obj2) {
                    switch (this.f15140a) {
                        case 0:
/* 91 */                    float[] fArr = (float[]) obj;
/* 93 */                    float[] fArr2 = (float[]) obj2;
/* 97 */                    float[] fArr3 = (float[]) this.f15141b;
/* 101 */                   for (int i = 0; i < fArr3.length; i++) {
/* 103 */                       float f2 = fArr[i];
/* 111 */                       fArr3[i] = AbstractC0886en.m3503g(fArr2[i], f2, f, f2);
                            }
/* 116 */                   return fArr3;
                        case 1:
/* 74 */                    float fFloatValue = ((FloatEvaluator) this.f15141b).evaluate(f, (Number) obj, (Number) obj2).floatValue();
/* 83 */                    if (fFloatValue < 0.1f) {
/* 85 */                        fFloatValue = 0.0f;
                            }
/* 86 */                    return Float.valueOf(fFloatValue);
                        default:
/* 6 */                     Rect rect = (Rect) obj;
/* 8 */                     Rect rect2 = (Rect) obj2;
/* 10 */                    int i2 = rect.left;
/* 18 */                    int i3 = i2 + ((int) ((rect2.left - i2) * f));
/* 19 */                    int i4 = rect.top;
/* 27 */                    int i5 = i4 + ((int) ((rect2.top - i4) * f));
/* 28 */                    int i6 = rect.right;
/* 36 */                    int i7 = i6 + ((int) ((rect2.right - i6) * f));
/* 37 */                    int i8 = rect.bottom;
/* 45 */                    int i9 = i8 + ((int) ((rect2.bottom - i8) * f));
/* 48 */                    Rect rect3 = (Rect) this.f15141b;
/* 50 */                    if (rect3 == null) {
/* 54 */                        return new Rect(i3, i5, i7, i9);
                            }
/* 58 */                    rect3.set(i3, i5, i7, i9);
/* 61 */                    return rect3;
                    }
                }
            }
