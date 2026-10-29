            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ta1 implements Cloneable {

                /* JADX INFO: renamed from: e */
                public static final Object f17004e = new Object();

                /* JADX INFO: renamed from: a */
                public boolean f17005a = false;

                /* JADX INFO: renamed from: b */
                public long[] f17006b;

                /* JADX INFO: renamed from: c */
                public Object[] f17007c;

                /* JADX INFO: renamed from: d */
                public int f17008d;

                public ta1() {
                    int i;
/* 7 */             int i2 = 4;
                    while (true) {
/* 10 */                i = 80;
/* 12 */                if (i2 >= 32) {
                            break;
                        }
/* 16 */                int i3 = (1 << i2) - 12;
/* 18 */                if (80 <= i3) {
/* 20 */                    i = i3;
                            break;
                        }
/* 22 */                i2++;
                    }
/* 25 */            int i4 = i / 8;
/* 29 */            this.f17006b = new long[i4];
/* 33 */            this.f17007c = new Object[i4];
                }

                /* JADX INFO: renamed from: a */
                public final void m8752a() {
/* 1 */             int i = this.f17008d;
/* 3 */             Object[] objArr = this.f17007c;
/* 7 */             for (int i2 = 0; i2 < i; i2++) {
/* 10 */                objArr[i2] = null;
                    }
/* 15 */            this.f17008d = 0;
/* 17 */            this.f17005a = false;
                }

                /* JADX INFO: renamed from: b */
                public final void m8753b() {
/* 1 */             int i = this.f17008d;
/* 3 */             long[] jArr = this.f17006b;
/* 5 */             Object[] objArr = this.f17007c;
/* 9 */             int i2 = 0;
/* 10 */            for (int i3 = 0; i3 < i; i3++) {
/* 12 */                Object obj = objArr[i3];
/* 16 */                if (obj != f17004e) {
/* 18 */                    if (i3 != i2) {
/* 22 */                        jArr[i2] = jArr[i3];
/* 24 */                        objArr[i2] = obj;
/* 27 */                        objArr[i3] = null;
                            }
/* 29 */                    i2++;
                        }
                    }
/* 34 */            this.f17005a = false;
/* 36 */            this.f17008d = i2;
                }

                /* JADX INFO: renamed from: c */
                public final Object m8754c(long j) {
                    Object obj;
/* 5 */             int iM7587J = py0.m7587J(this.f17006b, this.f17008d, j);
/* 9 */             if (iM7587J < 0 || (obj = this.f17007c[iM7587J]) == f17004e) {
/* 21 */                return null;
                    }
/* 20 */            return obj;
                }

                public final Object clone() {
                    try {
/* 5 */                 ta1 ta1Var = (ta1) super.clone();
/* 15 */                ta1Var.f17006b = (long[]) this.f17006b.clone();
/* 25 */                ta1Var.f17007c = (Object[]) this.f17007c.clone();
/* 27 */                return ta1Var;
                    } catch (CloneNotSupportedException e) {
/* 29 */                C1951n4.m6856g(e);
/* 32 */                return null;
                    }
                }

                /* JADX INFO: renamed from: d */
                public final void m8755d(Object obj, long j) {
/* 5 */             int iM7587J = py0.m7587J(this.f17006b, this.f17008d, j);
/* 9 */             if (iM7587J >= 0) {
/* 13 */                this.f17007c[iM7587J] = obj;
/* 15 */                return;
                    }
/* 16 */            int i = ~iM7587J;
/* 17 */            int i2 = this.f17008d;
/* 19 */            if (i < i2) {
/* 21 */                Object[] objArr = this.f17007c;
/* 27 */                if (objArr[i] == f17004e) {
/* 31 */                    this.f17006b[i] = j;
/* 33 */                    objArr[i] = obj;
/* 35 */                    return;
                        }
                    }
/* 38 */            if (this.f17005a && i2 >= this.f17006b.length) {
/* 45 */                m8753b();
/* 56 */                i = ~py0.m7587J(this.f17006b, this.f17008d, j);
                    }
/* 57 */            int i3 = this.f17008d;
/* 63 */            if (i3 >= this.f17006b.length) {
/* 66 */                int i4 = (i3 + 1) * 8;
/* 71 */                for (int i5 = 4; i5 < 32; i5++) {
/* 75 */                    int i6 = (1 << i5) - 12;
/* 77 */                    if (i4 <= i6) {
/* 79 */                        i4 = i6;
                                break;
                            }
                        }
/* 84 */                int i7 = i4 / 8;
/* 86 */                long[] jArr = new long[i7];
/* 88 */                Object[] objArr2 = new Object[i7];
/* 90 */                long[] jArr2 = this.f17006b;
/* 94 */                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
/* 97 */                Object[] objArr3 = this.f17007c;
/* 100 */               System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
/* 103 */               this.f17006b = jArr;
/* 105 */               this.f17007c = objArr2;
                    }
/* 109 */           int i8 = this.f17008d - i;
/* 110 */           if (i8 != 0) {
/* 112 */               long[] jArr3 = this.f17006b;
/* 114 */               int i9 = i + 1;
/* 116 */               System.arraycopy(jArr3, i, jArr3, i9, i8);
/* 119 */               Object[] objArr4 = this.f17007c;
/* 124 */               System.arraycopy(objArr4, i, objArr4, i9, this.f17008d - i);
                    }
/* 129 */           this.f17006b[i] = j;
/* 133 */           this.f17007c[i] = obj;
/* 138 */           this.f17008d++;
                }

                /* JADX INFO: renamed from: e */
                public final int m8756e() {
/* 3 */             if (this.f17005a) {
/* 5 */                 m8753b();
                    }
/* 8 */             return this.f17008d;
                }

                /* JADX INFO: renamed from: f */
                public final Object m8757f(int i) {
/* 3 */             if (this.f17005a) {
/* 5 */                 m8753b();
                    }
/* 10 */            return this.f17007c[i];
                }

                public final String toString() {
/* 5 */             if (m8756e() <= 0) {
/* 7 */                 return "{}";
                    }
/* 16 */            StringBuilder sb = new StringBuilder(this.f17008d * 28);
/* 21 */            sb.append('{');
/* 27 */            for (int i = 0; i < this.f17008d; i++) {
/* 29 */                if (i > 0) {
/* 33 */                    sb.append(", ");
                        }
/* 38 */                if (this.f17005a) {
/* 40 */                    m8753b();
                        }
/* 47 */                sb.append(this.f17006b[i]);
/* 52 */                sb.append('=');
/* 55 */                Object objM8757f = m8757f(i);
/* 59 */                if (objM8757f != this) {
/* 61 */                    sb.append(objM8757f);
                        } else {
/* 67 */                    sb.append("(this Map)");
                        }
                    }
/* 75 */            sb.append('}');
/* 78 */            return sb.toString();
                }
            }
