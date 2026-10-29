            package p000;

            import io.sentry.C1697u2;
            import java.util.Iterator;
            
            /* JADX INFO: renamed from: tl */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class C2222tl extends AbstractC2298vl {

                /* JADX INFO: renamed from: d */
                public final byte[] f17140d;

                public C2222tl(byte[] bArr) {
/* 5 */             this.f18236a = 0;
/* 7 */             bArr.getClass();
/* 10 */            this.f17140d = bArr;
                }

                @Override // p000.AbstractC2298vl
                /* JADX INFO: renamed from: a */
                public byte mo8194a(int i) {
/* 3 */             return this.f17140d[i];
                }

                @Override // p000.AbstractC2298vl
                /* JADX INFO: renamed from: d */
                public void mo8195d(byte[] bArr, int i) {
/* 4 */             System.arraycopy(this.f17140d, 0, bArr, 0, i);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 95 */                return true;
                    }
/* 7 */             if ((obj instanceof AbstractC2298vl) && size() == ((AbstractC2298vl) obj).size()) {
/* 28 */                if (size() == 0) {
/* 95 */                    return true;
                        }
/* 33 */                if (!(obj instanceof C2222tl)) {
/* 130 */                   return obj.equals(this);
                        }
/* 35 */                C2222tl c2222tl = (C2222tl) obj;
/* 37 */                int i = this.f18236a;
/* 39 */                int i2 = c2222tl.f18236a;
/* 41 */                if (i == 0 || i2 == 0 || i == i2) {
/* 48 */                    int size = size();
/* 56 */                    if (size > c2222tl.size()) {
/* 126 */                       C1697u2.m5432h(size, size());
/* 6 */                         return false;
                            }
/* 62 */                    if (size > c2222tl.size()) {
/* 103 */                       StringBuilder sbM3793s = fm0.m3793s(size, "Ran off end of other: 0, ", ", ");
/* 111 */                       sbM3793s.append(c2222tl.size());
/* 121 */                       throw new IllegalArgumentException(sbM3793s.toString());
                            }
/* 64 */                    byte[] bArr = c2222tl.f17140d;
/* 70 */                    int iMo8196f = mo8196f() + size;
/* 71 */                    int iMo8196f2 = mo8196f();
/* 75 */                    int iMo8196f3 = c2222tl.mo8196f();
/* 79 */                    while (iMo8196f2 < iMo8196f) {
/* 87 */                        if (this.f17140d[iMo8196f2] == bArr[iMo8196f3]) {
/* 90 */                            iMo8196f2++;
/* 92 */                            iMo8196f3++;
                                }
                            }
/* 95 */                    return true;
                        }
                    }
/* 6 */             return false;
                }

                /* JADX INFO: renamed from: f */
                public int mo8196f() {
/* 1 */             return 0;
                }

                /* JADX INFO: renamed from: g */
                public byte mo8197g(int i) {
/* 3 */             return this.f17140d[i];
                }

                @Override // java.lang.Iterable
                public final Iterator iterator() {
/* 3 */             return new C2111ql(this);
                }

                @Override // p000.AbstractC2298vl
                public int size() {
/* 3 */             return this.f17140d.length;
                }
            }
