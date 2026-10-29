            package p000;

            import android.util.SparseArray;
            import android.view.View;
            import java.lang.reflect.Array;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class t43 extends w43 {

                /* JADX INFO: renamed from: f */
                public SparseArray f16918f;

                /* JADX INFO: renamed from: g */
                public float[] f16919g;

                @Override // p000.w43
                /* JADX INFO: renamed from: b */
                public final void mo8687b(float f, int i) {
/* 8 */             throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
                }

                @Override // p000.w43
                /* JADX INFO: renamed from: c */
                public final void mo8400c(View view, float f) {
/* 6 */             this.f18437a.mo6913h0(f, this.f16919g);
/* 20 */            jb1.m5737C((C2088pz) this.f16918f.valueAt(0), view, this.f16919g);
                }

                @Override // p000.w43
                /* JADX INFO: renamed from: d */
                public final void mo8688d(int i) {
/* 1 */             SparseArray sparseArray = this.f16918f;
/* 3 */             int size = sparseArray.size();
/* 14 */            int iM7620c = ((C2088pz) sparseArray.valueAt(0)).m7620c();
/* 18 */            double[] dArr = new double[size];
/* 22 */            this.f16919g = new float[iM7620c];
/* 38 */            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iM7620c);
/* 41 */            for (int i2 = 0; i2 < size; i2++) {
/* 43 */                int iKeyAt = sparseArray.keyAt(i2);
/* 51 */                C2088pz c2088pz = (C2088pz) sparseArray.valueAt(i2);
/* 60 */                dArr[i2] = ((double) iKeyAt) * 0.01d;
/* 64 */                c2088pz.m7619b(this.f16919g);
/* 67 */                int i3 = 0;
                        while (true) {
/* 68 */                    float[] fArr = this.f16919g;
/* 71 */                    if (i3 < fArr.length) {
/* 78 */                        dArr2[i2][i3] = fArr[i3];
/* 80 */                        i3++;
                            }
                        }
                    }
/* 90 */            this.f18437a = py0.m7597V(i, dArr, dArr2);
                }
            }
