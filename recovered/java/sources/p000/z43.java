            package p000;

            import android.util.SparseArray;
            import android.view.View;
            import java.lang.reflect.Array;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class z43 extends c53 {

                /* JADX INFO: renamed from: g */
                public String f19933g;

                /* JADX INFO: renamed from: h */
                public SparseArray f19934h;

                /* JADX INFO: renamed from: i */
                public SparseArray f19935i;

                /* JADX INFO: renamed from: j */
                public float[] f19936j;

                /* JADX INFO: renamed from: k */
                public float[] f19937k;

                @Override // p000.c53
                /* JADX INFO: renamed from: b */
                public final boolean mo67b(float f, long j, d31 d31Var, View view) {
/* 6 */             this.f2726a.mo6913h0(f, this.f19936j);
/* 9 */             float[] fArr = this.f19936j;
/* 14 */            float f2 = fArr[fArr.length - 2];
/* 19 */            float f3 = fArr[fArr.length - 1];
/* 23 */            long j2 = j - this.f2730e;
/* 32 */            if (Float.isNaN(this.f2731f)) {
/* 36 */                float fM2916a = d31Var.m2916a(view, this.f19933g);
/* 40 */                this.f2731f = fM2916a;
/* 46 */                if (Float.isNaN(fM2916a)) {
/* 48 */                    this.f2731f = 0.0f;
                        }
                    }
/* 66 */            float f4 = (float) ((((j2 * 1.0E-9d) * ((double) f2)) + ((double) this.f2731f)) % 1.0d);
/* 67 */            this.f2731f = f4;
/* 69 */            this.f2730e = j;
/* 80 */            float fSin = (float) Math.sin(f4 * 6.2831855f);
/* 82 */            this.f2729d = false;
/* 84 */            int i = 0;
                    while (true) {
/* 85 */                float[] fArr2 = this.f19937k;
/* 88 */                if (i >= fArr2.length) {
                            break;
                        }
/* 90 */                boolean z = this.f2729d;
/* 94 */                float f5 = this.f19936j[i];
/* 107 */               this.f2729d = z | (((double) f5) != 0.0d);
/* 111 */               fArr2[i] = (f5 * fSin) + f3;
/* 113 */               i++;
                    }
/* 126 */           jb1.m5737C((C2088pz) this.f19934h.valueAt(0), view, this.f19937k);
/* 131 */           if (f2 != 0.0f) {
/* 133 */               this.f2729d = true;
                    }
/* 135 */           return this.f2729d;
                }

                @Override // p000.c53
                /* JADX INFO: renamed from: c */
                public final void mo1538c(int i) {
/* 3 */             SparseArray sparseArray = this.f19934h;
/* 5 */             int size = sparseArray.size();
/* 16 */            int iM7620c = ((C2088pz) sparseArray.valueAt(0)).m7620c();
/* 20 */            double[] dArr = new double[size];
/* 22 */            int i2 = iM7620c + 2;
/* 26 */            this.f19936j = new float[i2];
/* 30 */            this.f19937k = new float[iM7620c];
/* 46 */            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i2);
/* 49 */            for (int i3 = 0; i3 < size; i3++) {
/* 51 */                int iKeyAt = sparseArray.keyAt(i3);
/* 59 */                C2088pz c2088pz = (C2088pz) sparseArray.valueAt(i3);
/* 67 */                float[] fArr = (float[]) this.f19935i.valueAt(i3);
/* 76 */                dArr[i3] = ((double) iKeyAt) * 0.01d;
/* 80 */                c2088pz.m7619b(this.f19936j);
/* 83 */                int i4 = 0;
                        while (true) {
/* 84 */                    float[] fArr2 = this.f19936j;
/* 87 */                    if (i4 < fArr2.length) {
/* 94 */                        dArr2[i3][i4] = fArr2[i4];
/* 96 */                        i4++;
                            }
                        }
/* 99 */                double[] dArr3 = dArr2[i3];
/* 104 */               dArr3[iM7620c] = fArr[0];
/* 111 */               dArr3[iM7620c + 1] = fArr[1];
                    }
/* 122 */           this.f2726a = py0.m7597V(i, dArr, dArr2);
                }
            }
