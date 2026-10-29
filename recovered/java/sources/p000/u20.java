            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class u20 extends py0 {

                /* JADX INFO: renamed from: k */
                public double f17333k;

                /* JADX INFO: renamed from: l */
                public double[] f17334l;

                @Override // p000.py0
                /* JADX INFO: renamed from: f0 */
                public final double mo6911f0(double d) {
/* 4 */             return this.f17334l[0];
                }

                @Override // p000.py0
                /* JADX INFO: renamed from: g0 */
                public final void mo6912g0(double d, double[] dArr) {
/* 1 */             double[] dArr2 = this.f17334l;
/* 5 */             System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
                }

                @Override // p000.py0
                /* JADX INFO: renamed from: h0 */
                public final void mo6913h0(double d, float[] fArr) {
/* 1 */             int i = 0;
                    while (true) {
/* 2 */                 double[] dArr = this.f17334l;
/* 5 */                 if (i >= dArr.length) {
/* 15 */                    return;
                        }
/* 10 */                fArr[i] = (float) dArr[i];
/* 12 */                i++;
                    }
                }

                @Override // p000.py0
                /* JADX INFO: renamed from: j0 */
                public final double mo6914j0(double d) {
/* 1 */             return 0.0d;
                }

                @Override // p000.py0
                /* JADX INFO: renamed from: k0 */
                public final void mo6915k0(double d, double[] dArr) {
/* 5 */             for (int i = 0; i < this.f17334l.length; i++) {
/* 9 */                 dArr[i] = 0.0d;
                    }
                }

                @Override // p000.py0
                /* JADX INFO: renamed from: n0 */
                public final double[] mo6916n0() {
/* 4 */             return new double[]{this.f17333k};
                }
            }
