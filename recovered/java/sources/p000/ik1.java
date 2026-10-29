            package p000;

            import androidx.constraintlayout.widget.C0076c;
            import java.util.LinkedHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ik1 implements Comparable {

                /* JADX INFO: renamed from: c0 */
                public static final String[] f9677c0 = {"position", "x", "y", "width", "height", "pathRotate"};

                /* JADX INFO: renamed from: a */
                public C2131r4 f9684a;

                /* JADX INFO: renamed from: c */
                public float f9688c;

                /* JADX INFO: renamed from: d */
                public float f9689d;

                /* JADX INFO: renamed from: e */
                public float f9690e;

                /* JADX INFO: renamed from: f */
                public float f9691f;

                /* JADX INFO: renamed from: i */
                public float f9692i;

                /* JADX INFO: renamed from: v */
                public float f9693v;

                /* JADX INFO: renamed from: b */
                public int f9686b = 0;

                /* JADX INFO: renamed from: w */
                public float f9694w = Float.NaN;

                /* JADX INFO: renamed from: U */
                public int f9678U = -1;

                /* JADX INFO: renamed from: V */
                public int f9679V = -1;

                /* JADX INFO: renamed from: W */
                public float f9680W = Float.NaN;

                /* JADX INFO: renamed from: X */
                public zj1 f9681X = null;

                /* JADX INFO: renamed from: Y */
                public LinkedHashMap f9682Y = new LinkedHashMap();

                /* JADX INFO: renamed from: Z */
                public int f9683Z = 0;

                /* JADX INFO: renamed from: a0 */
                public double[] f9685a0 = new double[18];

                /* JADX INFO: renamed from: b0 */
                public double[] f9687b0 = new double[18];

                /* JADX INFO: renamed from: b */
                public static boolean m4570b(float f, float f2) {
/* 5 */             if (Float.isNaN(f) || Float.isNaN(f2)) {
                        return Float.isNaN(f) != Float.isNaN(f2);
                    }
                    return Math.abs(f - f2) > 1.0E-6f;
                }

                /* JADX INFO: renamed from: e */
                public static void m4571e(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
/* 3 */             float f3 = 0.0f;
/* 4 */             float f4 = 0.0f;
/* 5 */             float f5 = 0.0f;
/* 6 */             float f6 = 0.0f;
/* 10 */            for (int i = 0; i < iArr.length; i++) {
/* 14 */                float f7 = (float) dArr[i];
/* 15 */                double d = dArr2[i];
/* 17 */                int i2 = iArr[i];
/* 19 */                if (i2 == 1) {
/* 37 */                    f3 = f7;
                        } else if (i2 == 2) {
/* 35 */                    f5 = f7;
                        } else if (i2 == 3) {
/* 33 */                    f4 = f7;
                        } else if (i2 == 4) {
/* 31 */                    f6 = f7;
                        }
                    }
/* 46 */            float f8 = f3 - ((0.0f * f4) / 2.0f);
/* 50 */            float f9 = f5 - ((0.0f * f6) / 2.0f);
/* 63 */            fArr[0] = (((f4 * 1.0f) + f8) * f) + ((1.0f - f) * f8) + 0.0f;
/* 70 */            fArr[1] = (((f6 * 1.0f) + f9) * f2) + ((1.0f - f2) * f9) + 0.0f;
                }

                /* JADX INFO: renamed from: a */
                public final void m4572a(C0076c c0076c) {
                    int iM3520y;
/* 9 */             this.f9684a = C2131r4.m8062c(c0076c.f1179d.f18392d);
/* 11 */            C2312vz c2312vz = c0076c.f1179d;
/* 15 */            this.f9678U = c2312vz.f18393e;
/* 19 */            this.f9679V = c2312vz.f18390b;
/* 23 */            this.f9694w = c2312vz.f18396h;
/* 27 */            this.f9686b = c2312vz.f18394f;
/* 33 */            this.f9680W = c0076c.f1180e.f17747C;
/* 49 */            for (String str : c0076c.f1182g.keySet()) {
/* 63 */                C2088pz c2088pz = (C2088pz) c0076c.f1182g.get(str);
/* 65 */                if (c2088pz != null && (iM3520y = AbstractC0886en.m3520y(c2088pz.f15343c)) != 4 && iM3520y != 5 && iM3520y != 7) {
/* 84 */                    this.f9682Y.put(str, c2088pz);
                        }
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m4573c(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
/* 3 */             float f = this.f9690e;
/* 5 */             float fCos = this.f9691f;
/* 7 */             float f2 = this.f9692i;
/* 9 */             float f3 = this.f9693v;
/* 16 */            for (int i2 = 0; i2 < iArr.length; i2++) {
/* 20 */                float f4 = (float) dArr[i2];
/* 21 */                int i3 = iArr[i2];
/* 23 */                if (i3 == 1) {
/* 40 */                    f = f4;
                        } else if (i3 == 2) {
/* 38 */                    fCos = f4;
                        } else if (i3 == 3) {
/* 36 */                    f2 = f4;
                        } else if (i3 == 4) {
/* 34 */                    f3 = f4;
                        }
                    }
/* 44 */            zj1 zj1Var = this.f9681X;
/* 48 */            if (zj1Var != null) {
/* 50 */                float[] fArr2 = new float[2];
/* 55 */                zj1Var.m10360c(d, fArr2, new float[2]);
/* 58 */                float f5 = fArr2[0];
/* 60 */                float f6 = fArr2[1];
                        double d2 = f;
                        double d3 = fCos;
/* 69 */                double dSin = Math.sin(d3) * d2;
/* 87 */                fCos = (float) ((((double) f6) - (Math.cos(d3) * d2)) - ((double) (f3 / 2.0f)));
/* 75 */                f = (float) ((dSin + ((double) f5)) - ((double) (f2 / 2.0f)));
                    }
/* 93 */            fArr[i] = (f2 / 2.0f) + f + 0.0f;
/* 100 */           fArr[i + 1] = (f3 / 2.0f) + fCos + 0.0f;
                }

                @Override // java.lang.Comparable
                public final int compareTo(Object obj) {
/* 7 */             return Float.compare(this.f9689d, ((ik1) obj).f9689d);
                }

                /* JADX INFO: renamed from: d */
                public final void m4574d(float f, float f2, float f3, float f4) {
/* 1 */             this.f9690e = f;
/* 3 */             this.f9691f = f2;
/* 5 */             this.f9692i = f3;
/* 7 */             this.f9693v = f4;
                }

                /* JADX INFO: renamed from: f */
                public final void m4575f(zj1 zj1Var, ik1 ik1Var) {
/* 15 */            double d = (((this.f9692i / 2.0f) + this.f9690e) - ik1Var.f9690e) - (ik1Var.f9692i / 2.0f);
/* 29 */            double d2 = (((this.f9693v / 2.0f) + this.f9691f) - ik1Var.f9691f) - (ik1Var.f9693v / 2.0f);
/* 31 */            this.f9681X = zj1Var;
/* 38 */            this.f9690e = (float) Math.hypot(d2, d);
/* 46 */            if (Float.isNaN(this.f9680W)) {
/* 59 */                this.f9691f = (float) (Math.atan2(d2, d) + 1.5707963267948966d);
                    } else {
/* 70 */                this.f9691f = (float) Math.toRadians(this.f9680W);
                    }
                }
            }
