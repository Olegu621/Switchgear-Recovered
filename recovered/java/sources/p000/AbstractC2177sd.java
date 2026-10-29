            package p000;

            import android.util.Rational;
            import android.util.Size;
            
            /* JADX INFO: renamed from: sd */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC2177sd {

                /* JADX INFO: renamed from: a */
                public static final Rational f16535a = new Rational(4, 3);

                /* JADX INFO: renamed from: b */
                public static final Rational f16536b = new Rational(3, 4);

                /* JADX INFO: renamed from: c */
                public static final Rational f16537c = new Rational(16, 9);

                /* JADX INFO: renamed from: d */
                public static final Rational f16538d = new Rational(9, 16);

                /* JADX INFO: renamed from: a */
                public static boolean m8480a(Rational rational, Size size) {
/* 1 */             Size size2 = ue2.f17490b;
/* 4 */             if (rational != null) {
/* 24 */                if (rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
/* 95 */                    return true;
                        }
/* 40 */                if (size.getHeight() * size.getWidth() >= ue2.m9005a(size2)) {
/* 42 */                    int width = size.getWidth();
/* 46 */                    int height = size.getHeight();
/* 60 */                    Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
/* 63 */                    int i = width % 16;
/* 65 */                    if (i == 0 && height % 16 == 0) {
/* 81 */                        if (m8481b(Math.max(0, height - 16), width, rational) || m8481b(Math.max(0, width - 16), height, rational2)) {
/* 95 */                            return true;
                                }
                            } else {
/* 97 */                        if (i == 0) {
/* 99 */                            return m8481b(height, width, rational);
                                }
/* 106 */                       if (height % 16 == 0) {
/* 108 */                           return m8481b(width, height, rational2);
                                }
                            }
                        }
                    }
/* 3 */             return false;
                }

                /* JADX INFO: renamed from: b */
                public static boolean m8481b(int i, int i2, Rational rational) {
/* 10 */            de3.m3024f(i2 % 16 == 0);
/* 24 */            double numerator = ((double) (rational.getNumerator() * i)) / ((double) rational.getDenominator());
                    return numerator > ((double) Math.max(0, i2 + (-16))) && numerator < ((double) (i2 + 16));
                }
            }
