            package p000;

            import android.graphics.Color;
            
            /* JADX INFO: renamed from: bx */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC0196bx {

                /* JADX INFO: renamed from: a */
                public static final ThreadLocal f2628a = new ThreadLocal();

                /* JADX INFO: renamed from: a */
                public static int m1449a(double d, double d2, double d3) {
/* 26 */            double d4 = (((-0.4986d) * d3) + (((-1.5372d) * d2) + (3.2406d * d))) / 100.0d;
/* 50 */            double d5 = ((0.0415d * d3) + ((1.8758d * d2) + ((-0.9689d) * d))) / 100.0d;
/* 74 */            double d6 = ((1.057d * d3) + (((-0.204d) * d2) + (0.0557d * d))) / 100.0d;
/* 111 */           double dPow = d4 > 0.0031308d ? (Math.pow(d4, 0.4166666666666667d) * 1.055d) - 0.055d : d4 * 12.92d;
/* 123 */           double dPow2 = d5 > 0.0031308d ? (Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d;
/* 135 */           double dPow3 = d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d;
/* 147 */           int iRound = (int) Math.round(dPow * 255.0d);
/* 155 */           int iMin = iRound < 0 ? 0 : Math.min(iRound, 255);
/* 164 */           int iRound2 = (int) Math.round(dPow2 * 255.0d);
/* 169 */           int iMin2 = iRound2 < 0 ? 0 : Math.min(iRound2, 255);
/* 178 */           int iRound3 = (int) Math.round(dPow3 * 255.0d);
/* 186 */           return Color.rgb(iMin, iMin2, iRound3 >= 0 ? Math.min(iRound3, 255) : 0);
                }

                /* JADX INFO: renamed from: b */
                public static double m1450b(int i, int i2) {
/* 7 */             if (Color.alpha(i2) != 255) {
/* 50 */                C1951n4.m6865p(Integer.toHexString(i2), "background can not be translucent: #");
/* 53 */                return 0.0d;
                    }
/* 13 */            if (Color.alpha(i) < 255) {
/* 15 */                i = m1452d(i, i2);
                    }
/* 28 */            double dM1451c = m1451c(i) + 0.05d;
/* 33 */            double dM1451c2 = m1451c(i2) + 0.05d;
/* 42 */            return Math.max(dM1451c, dM1451c2) / Math.min(dM1451c, dM1451c2);
                }

                /* JADX INFO: renamed from: c */
                public static double m1451c(int i) {
/* 1 */             ThreadLocal threadLocal = f2628a;
/* 7 */             double[] dArr = (double[]) threadLocal.get();
/* 10 */            if (dArr == null) {
/* 12 */                dArr = new double[3];
/* 14 */                threadLocal.set(dArr);
                    }
/* 17 */            int iRed = Color.red(i);
/* 21 */            int iGreen = Color.green(i);
/* 25 */            int iBlue = Color.blue(i);
/* 30 */            if (dArr.length != 3) {
/* 189 */               C1951n4.m6859j("outXyz must have a length of 3.");
/* 192 */               return 0.0d;
                    }
/* 38 */            double d = ((double) iRed) / 255.0d;
/* 73 */            double dPow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
/* 78 */            double d2 = ((double) iGreen) / 255.0d;
/* 90 */            double dPow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
/* 96 */            double d3 = ((double) iBlue) / 255.0d;
/* 107 */           double dPow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
/* 135 */           dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
/* 157 */           double d4 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
/* 159 */           dArr[1] = d4;
/* 183 */           dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
/* 185 */           return d4 / 100.0d;
                }

                /* JADX INFO: renamed from: d */
                public static int m1452d(int i, int i2) {
/* 1 */             int iAlpha = Color.alpha(i2);
/* 5 */             int iAlpha2 = Color.alpha(i);
/* 16 */            int i3 = 255 - (((255 - iAlpha2) * (255 - iAlpha)) / 255);
/* 54 */            return Color.argb(i3, m1453e(Color.red(i), iAlpha2, Color.red(i2), iAlpha, i3), m1453e(Color.green(i), iAlpha2, Color.green(i2), iAlpha, i3), m1453e(Color.blue(i), iAlpha2, Color.blue(i2), iAlpha, i3));
                }

                /* JADX INFO: renamed from: e */
                public static int m1453e(int i, int i2, int i3, int i4, int i5) {
/* 1 */             if (i5 == 0) {
/* 3 */                 return 0;
                    }
/* 15 */            return (((255 - i2) * (i3 * i4)) + ((i * 255) * i2)) / (i5 * 255);
                }

                /* JADX INFO: renamed from: f */
                public static int m1454f(int i, int i2) {
/* 1 */             if (i2 >= 0 && i2 <= 255) {
/* 13 */                return (i & 16777215) | (i2 << 24);
                    }
/* 17 */            C1951n4.m6859j("alpha must be between 0 and 255.");
/* 20 */            return 0;
                }
            }
