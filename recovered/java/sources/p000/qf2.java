            package p000;

            import java.util.Arrays;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class qf2 implements Comparable {

                /* JADX INFO: renamed from: W */
                public int f15513W;

                /* JADX INFO: renamed from: a */
                public boolean f15514a;

                /* JADX INFO: renamed from: e */
                public float f15518e;

                /* JADX INFO: renamed from: b */
                public int f15515b = -1;

                /* JADX INFO: renamed from: c */
                public int f15516c = -1;

                /* JADX INFO: renamed from: d */
                public int f15517d = 0;

                /* JADX INFO: renamed from: f */
                public boolean f15519f = false;

                /* JADX INFO: renamed from: i */
                public final float[] f15520i = new float[9];

                /* JADX INFO: renamed from: v */
                public final float[] f15521v = new float[9];

                /* JADX INFO: renamed from: w */
                public C1789jd[] f15522w = new C1789jd[16];

                /* JADX INFO: renamed from: U */
                public int f15511U = 0;

                /* JADX INFO: renamed from: V */
                public int f15512V = 0;

                public qf2(int i) {
/* 34 */            this.f15513W = i;
                }

                /* JADX INFO: renamed from: a */
                public final void m7785a(C1789jd c1789jd) {
/* 1 */             int i = 0;
                    while (true) {
/* 2 */                 int i2 = this.f15511U;
/* 4 */                 C1789jd[] c1789jdArr = this.f15522w;
/* 6 */                 if (i >= i2) {
/* 17 */                    if (i2 >= c1789jdArr.length) {
/* 28 */                        this.f15522w = (C1789jd[]) Arrays.copyOf(c1789jdArr, c1789jdArr.length * 2);
                            }
/* 30 */                    C1789jd[] c1789jdArr2 = this.f15522w;
/* 32 */                    int i3 = this.f15511U;
/* 34 */                    c1789jdArr2[i3] = c1789jd;
/* 38 */                    this.f15511U = i3 + 1;
/* 40 */                    return;
                        }
/* 10 */                if (c1789jdArr[i] == c1789jd) {
/* 12 */                    return;
                        } else {
/* 13 */                    i++;
                        }
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m7786b(C1789jd c1789jd) {
/* 1 */             int i = this.f15511U;
/* 3 */             int i2 = 0;
/* 4 */             while (i2 < i) {
/* 10 */                if (this.f15522w[i2] == c1789jd) {
/* 14 */                    while (i2 < i - 1) {
/* 16 */                        C1789jd[] c1789jdArr = this.f15522w;
/* 18 */                        int i3 = i2 + 1;
/* 22 */                        c1789jdArr[i2] = c1789jdArr[i3];
/* 24 */                        i2 = i3;
                            }
/* 30 */                    this.f15511U--;
/* 32 */                    return;
                        }
/* 33 */                i2++;
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m7787c() {
/* 2 */             this.f15513W = 5;
/* 5 */             this.f15517d = 0;
/* 8 */             this.f15515b = -1;
/* 10 */            this.f15516c = -1;
/* 13 */            this.f15518e = 0.0f;
/* 15 */            this.f15519f = false;
/* 17 */            int i = this.f15511U;
/* 20 */            for (int i2 = 0; i2 < i; i2++) {
/* 25 */                this.f15522w[i2] = null;
                    }
/* 30 */            this.f15511U = 0;
/* 32 */            this.f15512V = 0;
/* 34 */            this.f15514a = false;
/* 38 */            Arrays.fill(this.f15521v, 0.0f);
                }

                @Override // java.lang.Comparable
                public final int compareTo(Object obj) {
/* 7 */             return this.f15515b - ((qf2) obj).f15515b;
                }

                /* JADX INFO: renamed from: d */
                public final void m7788d(t71 t71Var, float f) {
/* 1 */             this.f15518e = f;
/* 4 */             this.f15519f = true;
/* 6 */             int i = this.f15511U;
/* 9 */             this.f15516c = -1;
/* 13 */            for (int i2 = 0; i2 < i; i2++) {
/* 19 */                this.f15522w[i2].m5794h(t71Var, this, false);
                    }
/* 25 */            this.f15511U = 0;
                }

                /* JADX INFO: renamed from: e */
                public final void m7789e(t71 t71Var, C1789jd c1789jd) {
/* 1 */             int i = this.f15511U;
/* 5 */             for (int i2 = 0; i2 < i; i2++) {
/* 11 */                this.f15522w[i2].mo5795i(t71Var, c1789jd, false);
                    }
/* 17 */            this.f15511U = 0;
                }

                public final String toString() {
/* 13 */            return HttpUrl.FRAGMENT_ENCODE_SET + this.f15515b;
                }
            }
