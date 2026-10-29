            package p000;

            import java.util.Arrays;
            
            /* JADX INFO: renamed from: wl */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2335wl {

                /* JADX INFO: renamed from: a */
                public final byte[] f18678a;

                public C2335wl(byte[] bArr, int i) {
/* 4 */             byte[] bArr2 = new byte[i];
/* 6 */             this.f18678a = bArr2;
/* 9 */             System.arraycopy(bArr, 0, bArr2, 0, i);
                }

                /* JADX INFO: renamed from: a */
                public static C2335wl m9584a(byte[] bArr) {
/* 1 */             if (bArr != null) {
/* 6 */                 return new C2335wl(bArr, bArr.length);
                    }
/* 12 */            C1951n4.m6868s("data must be non-null");
/* 15 */            return null;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (obj instanceof C2335wl) {
/* 13 */                return Arrays.equals(((C2335wl) obj).f18678a, this.f18678a);
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 3 */             return Arrays.hashCode(this.f18678a);
                }

                public final String toString() {
/* 22 */            return "Bytes(" + qj3.m7907r(this.f18678a) + ")";
                }
            }
