            package androidx.transition;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.graphics.Matrix;
            import android.graphics.Path;
            import android.graphics.PathMeasure;
            import android.util.AttributeSet;
            import org.xmlpull.v1.XmlPullParser;
            import p000.C1951n4;
            import p000.k50;
            import p000.pg3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class PatternPathMotion extends PathMotion {

                /* JADX INFO: renamed from: a */
                public final Path f1872a = new Path();

                /* JADX INFO: renamed from: b */
                public final Matrix f1873b = new Matrix();

                public PatternPathMotion(Context context, AttributeSet attributeSet) {
/* 20 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k50.f12596k);
                    try {
/* 37 */                String string = !k50.m5988y((XmlPullParser) attributeSet, "patternPathData") ? null : typedArrayObtainStyledAttributes.getString(0);
/* 41 */                if (string == null) {
/* 63 */                    throw new RuntimeException("pathData must be supplied for patternPathMotion");
                        }
/* 47 */                m1078b(pg3.m7427f(string));
/* 50 */                typedArrayObtainStyledAttributes.recycle();
                    } catch (Throwable th) {
/* 64 */                typedArrayObtainStyledAttributes.recycle();
/* 67 */                throw th;
                    }
                }

                @Override // androidx.transition.PathMotion
                /* JADX INFO: renamed from: a */
                public final Path mo1062a(float f, float f2, float f3, float f4) {
/* 1 */             float f5 = f3 - f;
/* 2 */             float f6 = f4 - f2;
/* 13 */            float fSqrt = (float) Math.sqrt((f6 * f6) + (f5 * f5));
/* 16 */            double dAtan2 = Math.atan2(f6, f5);
/* 20 */            Matrix matrix = this.f1873b;
/* 22 */            matrix.setScale(fSqrt, fSqrt);
/* 30 */            matrix.postRotate((float) Math.toDegrees(dAtan2));
/* 33 */            matrix.postTranslate(f, f2);
/* 38 */            Path path = new Path();
/* 43 */            this.f1872a.transform(matrix, path);
/* 46 */            return path;
                }

                /* JADX INFO: renamed from: b */
                public final void m1078b(Path path) {
/* 4 */             PathMeasure pathMeasure = new PathMeasure(path, false);
/* 12 */            float[] fArr = new float[2];
/* 15 */            pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
/* 18 */            float f = fArr[0];
/* 21 */            float f2 = fArr[1];
/* 24 */            pathMeasure.getPosTan(0.0f, fArr, null);
/* 27 */            float f3 = fArr[0];
/* 29 */            float f4 = fArr[1];
/* 33 */            if (f3 == f && f4 == f2) {
/* 42 */                C1951n4.m6859j("pattern must not end at the starting point");
/* 45 */                return;
                    }
/* 48 */            Matrix matrix = this.f1873b;
/* 50 */            matrix.setTranslate(-f3, -f4);
/* 53 */            float f5 = f - f3;
/* 54 */            float f6 = f2 - f4;
/* 68 */            float fSqrt = 1.0f / ((float) Math.sqrt((f6 * f6) + (f5 * f5)));
/* 69 */            matrix.postScale(fSqrt, fSqrt);
/* 84 */            matrix.postRotate((float) Math.toDegrees(-Math.atan2(f6, f5)));
/* 89 */            path.transform(matrix, this.f1872a);
                }
            }
