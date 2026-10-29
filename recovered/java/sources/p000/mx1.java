            package p000;

            import java.util.Arrays;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class mx1 implements Comparable {

                /* JADX INFO: renamed from: a */
                public final byte[] f14059a;

                public mx1(byte[] bArr) {
/* 9 */             this.f14059a = Arrays.copyOf(bArr, bArr.length);
                }

                @Override // java.lang.Comparable
                public final int compareTo(Object obj) {
/* 1 */             mx1 mx1Var = (mx1) obj;
/* 3 */             byte[] bArr = this.f14059a;
/* 5 */             int length = bArr.length;
/* 6 */             byte[] bArr2 = mx1Var.f14059a;
/* 9 */             if (length != bArr2.length) {
/* 13 */                return bArr.length - bArr2.length;
                    }
/* 18 */            for (int i = 0; i < bArr.length; i++) {
/* 20 */                byte b = bArr[i];
/* 24 */                byte b2 = mx1Var.f14059a[i];
/* 26 */                if (b != b2) {
/* 28 */                    return b - b2;
                        }
                    }
/* 15 */            return 0;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (obj instanceof mx1) {
/* 13 */                return Arrays.equals(this.f14059a, ((mx1) obj).f14059a);
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 3 */             return Arrays.hashCode(this.f14059a);
                }

                public final String toString() {
/* 3 */             return qj3.m7907r(this.f14059a);
                }
            }
