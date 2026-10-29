            package p000;

            import java.util.Arrays;
            
            /* JADX INFO: renamed from: sj */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 29 */    public final class C2183sj implements Cloneable {

                /* JADX INFO: renamed from: a */
                public final int f16651a;

                /* JADX INFO: renamed from: b */
                public final int f16652b;

                /* JADX INFO: renamed from: c */
                public final int f16653c;

                /* JADX INFO: renamed from: d */
                public final int[] f16654d;

                public C2183sj(int i, int i2) {
/* 4 */             if (i <= 0 || i2 <= 0) {
/* 26 */                C1951n4.m6859j("Both dimensions must be greater than 0");
/* 30 */                throw null;
                    }
/* 8 */             this.f16651a = i;
/* 10 */            this.f16652b = i2;
/* 14 */            int i3 = (i + 31) / 32;
/* 16 */            this.f16653c = i3;
/* 21 */            this.f16654d = new int[i3 * i2];
                }

                /* JADX INFO: renamed from: a */
                public final void m8515a(int i, int i2) {
/* 6 */             int i3 = (i / 32) + (i2 * this.f16653c);
/* 7 */             int[] iArr = this.f16654d;
/* 17 */            iArr[i3] = (1 << (i & 31)) ^ iArr[i3];
                }

                /* JADX INFO: renamed from: b */
                public final boolean m8516b(int i, int i2) {
                    return ((this.f16654d[(i / 32) + (i2 * this.f16653c)] >>> (i & 31)) & 1) != 0;
                }

                /* JADX INFO: renamed from: c */
                public final void m8517c(int i, int i2) {
/* 6 */             int i3 = (i / 32) + (i2 * this.f16653c);
/* 7 */             int[] iArr = this.f16654d;
/* 17 */            iArr[i3] = (1 << (i & 31)) | iArr[i3];
                }

                public final Object clone() {
/* 17 */            return new C2183sj((int[]) this.f16654d.clone(), this.f16651a, this.f16652b, this.f16653c);
                }

                /* JADX INFO: renamed from: d */
                public final void m8518d(int i, int i2, int i3, int i4) {
/* 1 */             if (i2 < 0 || i < 0) {
/* 63 */                C1951n4.m6859j("Left and top must be nonnegative");
/* 66 */                return;
                    }
/* 5 */             if (i4 <= 0 || i3 <= 0) {
/* 57 */                C1951n4.m6859j("Height and width must be at least 1");
/* 60 */                return;
                    }
/* 9 */             int i5 = i3 + i;
/* 10 */            int i6 = i4 + i2;
/* 13 */            if (i6 > this.f16652b || i5 > this.f16651a) {
/* 51 */                C1951n4.m6859j("The region must fit inside the matrix");
/* 54 */                return;
                    }
/* 19 */            while (i2 < i6) {
/* 23 */                int i7 = this.f16653c * i2;
/* 25 */                for (int i8 = i; i8 < i5; i8++) {
/* 29 */                    int i9 = (i8 / 32) + i7;
/* 30 */                    int[] iArr = this.f16654d;
/* 40 */                    iArr[i9] = iArr[i9] | (1 << (i8 & 31));
                        }
/* 45 */                i2++;
                    }
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof C2183sj)) {
/* 38 */                return false;
                    }
/* 6 */             C2183sj c2183sj = (C2183sj) obj;
                    return this.f16651a == c2183sj.f16651a && this.f16652b == c2183sj.f16652b && this.f16653c == c2183sj.f16653c && Arrays.equals(this.f16654d, c2183sj.f16654d);
                }

                public final int hashCode() {
/* 1 */             int i = this.f16651a;
/* 24 */            return Arrays.hashCode(this.f16654d) + (((((((i * 31) + i) * 31) + this.f16652b) * 31) + this.f16653c) * 31);
                }

                public final String toString() {
/* 3 */             int i = this.f16651a;
/* 7 */             int i2 = this.f16652b;
/* 10 */            StringBuilder sb = new StringBuilder((i + 1) * i2);
/* 15 */            for (int i3 = 0; i3 < i2; i3++) {
/* 18 */                for (int i4 = 0; i4 < i; i4++) {
/* 31 */                    sb.append(m8516b(i4, i3) ? "X " : "  ");
                        }
/* 39 */                sb.append("\n");
                    }
/* 45 */            return sb.toString();
                }

/* 30 */        public C2183sj(int[] iArr, int i, int i2, int i3) {
/* 32 */            this.f16651a = i;
/* 33 */            this.f16652b = i2;
/* 34 */            this.f16653c = i3;
/* 35 */            this.f16654d = iArr;
                }
            }
