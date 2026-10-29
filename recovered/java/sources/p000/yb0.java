            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class yb0 extends C2131r4 {

                /* JADX INFO: renamed from: u */
                public final double f19562u;

                /* JADX INFO: renamed from: v */
                public final double f19563v;

                /* JADX INFO: renamed from: w */
                public final double f19564w;

                /* JADX INFO: renamed from: x */
                public final double f19565x;

                public yb0(String str) {
/* 4 */             this.f15867b = str;
/* 8 */             int iIndexOf = str.indexOf(40);
/* 14 */            int iIndexOf2 = str.indexOf(44, iIndexOf);
/* 32 */            this.f19562u = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
/* 34 */            int i = iIndexOf2 + 1;
/* 36 */            int iIndexOf3 = str.indexOf(44, i);
/* 52 */            this.f19563v = Double.parseDouble(str.substring(i, iIndexOf3).trim());
/* 54 */            int i2 = iIndexOf3 + 1;
/* 56 */            int iIndexOf4 = str.indexOf(44, i2);
/* 72 */            this.f19564w = Double.parseDouble(str.substring(i2, iIndexOf4).trim());
/* 74 */            int i3 = iIndexOf4 + 1;
/* 94 */            this.f19565x = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
                }

                @Override // p000.C2131r4
                /* JADX INFO: renamed from: a */
                public final double mo288a(double d) {
/* 5 */             if (d <= 0.0d) {
/* 1 */                 return 0.0d;
                    }
/* 12 */            if (d >= 1.0d) {
/* 8 */                 return 1.0d;
                    }
/* 17 */            double d2 = 0.5d;
/* 18 */            double d3 = 0.5d;
/* 26 */            while (d2 > 0.01d) {
/* 32 */                d2 *= 0.5d;
/* 39 */                d3 = m10137d(d3) < d ? d3 + d2 : d3 - d2;
                    }
/* 41 */            double d4 = d3 - d2;
/* 43 */            double dM10137d = m10137d(d4);
/* 47 */            double d5 = d3 + d2;
/* 48 */            double dM10137d2 = m10137d(d5);
/* 52 */            double dM10138e = m10138e(d4);
/* 65 */            return (((d - dM10137d) * (m10138e(d5) - dM10138e)) / (dM10137d2 - dM10137d)) + dM10138e;
                }

                @Override // p000.C2131r4
                /* JADX INFO: renamed from: b */
                public final double mo289b(double d) {
/* 3 */             double d2 = 0.5d;
/* 4 */             double d3 = 0.5d;
/* 12 */            while (d2 > 1.0E-4d) {
/* 18 */                d2 *= 0.5d;
/* 25 */                d3 = m10137d(d3) < d ? d3 + d2 : d3 - d2;
                    }
/* 27 */            double d4 = d3 - d2;
/* 33 */            double d5 = d3 + d2;
/* 48 */            return (m10138e(d5) - m10138e(d4)) / (m10137d(d5) - m10137d(d4));
                }

                /* JADX INFO: renamed from: d */
                public final double m10137d(double d) {
/* 3 */             double d2 = 1.0d - d;
/* 6 */             double d3 = 3.0d * d2;
/* 8 */             double d4 = d2 * d3 * d;
/* 10 */            double d5 = d3 * d * d;
/* 21 */            return (this.f19564w * d5) + (this.f19562u * d4) + (d * d * d);
                }

                /* JADX INFO: renamed from: e */
                public final double m10138e(double d) {
/* 3 */             double d2 = 1.0d - d;
/* 6 */             double d3 = 3.0d * d2;
/* 8 */             double d4 = d2 * d3 * d;
/* 10 */            double d5 = d3 * d * d;
/* 21 */            return (this.f19565x * d5) + (this.f19563v * d4) + (d * d * d);
                }
            }
