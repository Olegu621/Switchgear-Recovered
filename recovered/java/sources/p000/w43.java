            package p000;

            import android.view.View;
            import java.lang.reflect.Array;
            import java.text.DecimalFormat;
            import java.util.Arrays;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class w43 {

                /* JADX INFO: renamed from: a */
                public py0 f18437a;

                /* JADX INFO: renamed from: b */
                public int[] f18438b = new int[10];

                /* JADX INFO: renamed from: c */
                public float[] f18439c = new float[10];

                /* JADX INFO: renamed from: d */
                public int f18440d;

                /* JADX INFO: renamed from: e */
                public String f18441e;

                /* JADX INFO: renamed from: a */
                public final float m9466a(float f) {
/* 8 */             return (float) this.f18437a.mo6911f0(f);
                }

                /* JADX INFO: renamed from: b */
                public void mo8687b(float f, int i) {
/* 1 */             int[] iArr = this.f18438b;
/* 8 */             if (iArr.length < this.f18440d + 1) {
/* 17 */                this.f18438b = Arrays.copyOf(iArr, iArr.length * 2);
/* 19 */                float[] fArr = this.f18439c;
/* 28 */                this.f18439c = Arrays.copyOf(fArr, fArr.length * 2);
                    }
/* 30 */            int[] iArr2 = this.f18438b;
/* 32 */            int i2 = this.f18440d;
/* 34 */            iArr2[i2] = i;
/* 38 */            this.f18439c[i2] = f;
/* 42 */            this.f18440d = i2 + 1;
                }

                /* JADX INFO: renamed from: c */
                public abstract void mo8400c(View view, float f);

                /* JADX WARN: Code duplicated, block: B:31:0x009d  */
                /* JADX INFO: renamed from: d */
                public void mo8688d(int i) {
/* 3 */             int i2 = this.f18440d;
/* 5 */             if (i2 == 0) {
/* 7 */                 return;
                    }
/* 8 */             int[] iArr = this.f18438b;
/* 10 */            float[] fArr = this.f18439c;
/* 17 */            int[] iArr2 = new int[iArr.length + 10];
/* 20 */            iArr2[0] = i2 - 1;
/* 22 */            iArr2[1] = 0;
/* 25 */            int i3 = 2;
/* 26 */            while (i3 > 0) {
/* 28 */                int i4 = i3 - 1;
/* 30 */                int i5 = iArr2[i4];
/* 32 */                int i6 = i3 - 2;
/* 34 */                int i7 = iArr2[i6];
/* 36 */                if (i5 < i7) {
/* 38 */                    int i8 = iArr[i7];
/* 40 */                    int i9 = i5;
/* 41 */                    int i10 = i9;
/* 42 */                    while (i9 < i7) {
/* 44 */                        int i11 = iArr[i9];
/* 46 */                        if (i11 <= i8) {
/* 48 */                            int i12 = iArr[i10];
/* 50 */                            iArr[i10] = i11;
/* 52 */                            iArr[i9] = i12;
/* 54 */                            float f = fArr[i10];
/* 58 */                            fArr[i10] = fArr[i9];
/* 60 */                            fArr[i9] = f;
/* 62 */                            i10++;
                                }
/* 64 */                        i9++;
                            }
/* 67 */                    int i13 = iArr[i10];
/* 71 */                    iArr[i10] = iArr[i7];
/* 73 */                    iArr[i7] = i13;
/* 75 */                    float f2 = fArr[i10];
/* 79 */                    fArr[i10] = fArr[i7];
/* 81 */                    fArr[i7] = f2;
/* 85 */                    iArr2[i6] = i10 - 1;
/* 87 */                    iArr2[i4] = i5;
/* 89 */                    int i14 = i3 + 1;
/* 91 */                    iArr2[i3] = i7;
/* 93 */                    i3 += 2;
/* 97 */                    iArr2[i14] = i10 + 1;
                        } else {
/* 100 */                   i3 = i6;
                        }
                    }
/* 103 */           int i15 = 1;
/* 106 */           for (int i16 = 1; i16 < this.f18440d; i16++) {
/* 108 */               int[] iArr3 = this.f18438b;
/* 116 */               if (iArr3[i16 - 1] != iArr3[i16]) {
/* 118 */                   i15++;
                        }
                    }
/* 123 */           double[] dArr = new double[i15];
/* 137 */           double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i15, 1);
/* 140 */           int i17 = 0;
/* 143 */           for (int i18 = 0; i18 < this.f18440d; i18++) {
/* 145 */               if (i18 > 0) {
/* 147 */                   int[] iArr4 = this.f18438b;
/* 155 */                   if (iArr4[i18] != iArr4[i18 - 1]) {
/* 169 */                       dArr[i17] = ((double) this.f18438b[i18]) * 0.01d;
/* 178 */                       dArr2[i17][0] = this.f18439c[i18];
/* 180 */                       i17++;
                            }
                        } else {
/* 169 */                   dArr[i17] = ((double) this.f18438b[i18]) * 0.01d;
/* 178 */                   dArr2[i17][0] = this.f18439c[i18];
/* 180 */                   i17++;
                        }
                    }
/* 191 */           this.f18437a = py0.m7597V(i, dArr, dArr2);
                }

                public final String toString() {
/* 1 */             String string = this.f18441e;
/* 7 */             DecimalFormat decimalFormat = new DecimalFormat("##.##");
/* 13 */            for (int i = 0; i < this.f18440d; i++) {
/* 17 */                StringBuilder sbM3794t = fm0.m3794t(string, "[");
/* 25 */                sbM3794t.append(this.f18438b[i]);
/* 30 */                sbM3794t.append(" , ");
/* 42 */                sbM3794t.append(decimalFormat.format(this.f18439c[i]));
/* 47 */                sbM3794t.append("] ");
/* 50 */                string = sbM3794t.toString();
                    }
/* 57 */            return string;
                }
            }
