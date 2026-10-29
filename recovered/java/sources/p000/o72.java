            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class o72 extends C2131r4 {

                /* JADX INFO: renamed from: u */
                public double f14660u;

                /* JADX INFO: renamed from: v */
                public double f14661v;

                @Override // p000.C2131r4
                /* JADX INFO: renamed from: a */
                public final double mo288a(double d) {
/* 1 */             double d2 = this.f14661v;
/* 5 */             double d3 = this.f14660u;
/* 7 */             if (d < d2) {
/* 14 */                return (d2 * d) / (((d2 - d) * d3) + d);
                    }
/* 27 */            return ((d - 1.0d) * (1.0d - d2)) / ((1.0d - d) - ((d2 - d) * d3));
                }

                @Override // p000.C2131r4
                /* JADX INFO: renamed from: b */
                public final double mo289b(double d) {
/* 1 */             double d2 = this.f14661v;
/* 5 */             double d3 = this.f14660u;
/* 7 */             if (d < d2) {
/* 11 */                double d4 = d3 * d2 * d2;
/* 14 */                double d5 = ((d2 - d) * d3) + d;
/* 16 */                return d4 / (d5 * d5);
                    }
/* 20 */            double d6 = d2 - 1.0d;
/* 29 */            double d7 = (((d2 - d) * (-d3)) - d) + 1.0d;
/* 31 */            return ((d6 * d3) * d6) / (d7 * d7);
                }
            }
