            package p000;

            import android.graphics.Matrix;
            import android.graphics.Rect;
            import android.graphics.RectF;
            import android.util.Size;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class cr2 {

                /* JADX INFO: renamed from: a */
                public static final RectF f6893a = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

                /* JADX INFO: renamed from: a */
                public static Matrix m2871a(RectF rectF, RectF rectF2, int i, boolean z) {
/* 3 */             Matrix matrix = new Matrix();
/* 6 */             Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
/* 8 */             RectF rectF3 = f6893a;
/* 10 */            matrix.setRectToRect(rectF, rectF3, scaleToFit);
/* 14 */            matrix.postRotate(i);
/* 17 */            if (z) {
/* 23 */                matrix.postScale(-1.0f, 1.0f);
                    }
/* 28 */            Matrix matrix2 = new Matrix();
/* 31 */            matrix2.setRectToRect(rectF3, rectF2, scaleToFit);
/* 34 */            matrix.postConcat(matrix2);
/* 37 */            return matrix;
                }

                /* JADX INFO: renamed from: b */
                public static boolean m2872b(int i) {
/* 3 */             if (i == 90 || i == 270) {
/* 30 */                return true;
                    }
/* 10 */            if (i == 0 || i == 180) {
/* 28 */                return false;
                    }
/* 23 */            C1951n4.m6859j(fm0.m3781g(i, "Invalid rotation degrees: "));
/* 26 */            return false;
                }

                /* JADX INFO: renamed from: c */
                public static boolean m2873c(Size size, Size size2) {
                    return (((float) size.getWidth()) + 1.0f) / (((float) size.getHeight()) - 1.0f) >= (((float) size2.getWidth()) - 1.0f) / (((float) size2.getHeight()) + 1.0f) && (((float) size2.getWidth()) + 1.0f) / (((float) size2.getHeight()) - 1.0f) >= (((float) size.getWidth()) - 1.0f) / (((float) size.getHeight()) + 1.0f);
                }

                /* JADX INFO: renamed from: d */
                public static Size m2874d(Rect rect) {
/* 11 */            return new Size(rect.width(), rect.height());
                }

                /* JADX INFO: renamed from: e */
                public static Size m2875e(Size size, int i) {
/* 22 */            de3.m3023e("Invalid rotation degrees: " + i, i % 90 == 0);
                    return m2872b(m2876f(i)) ? new Size(size.getHeight(), size.getWidth()) : size;
                }

                /* JADX INFO: renamed from: f */
                public static int m2876f(int i) {
/* 5 */             return ((i % 360) + 360) % 360;
                }
            }
