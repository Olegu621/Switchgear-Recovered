            package p000;
            
            /* JADX INFO: renamed from: bf */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0178bf {

                /* JADX INFO: renamed from: a */
                public final int f2396a;

                /* JADX INFO: renamed from: b */
                public final long f2397b;

                public C0178bf(int i, long j) {
/* 4 */             if (i == 0) {
/* 13 */                C1951n4.m6868s("Null status");
/* 17 */                throw null;
                    }
/* 6 */             this.f2396a = i;
/* 8 */             this.f2397b = j;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 28 */                return true;
                    }
/* 6 */             if (!(obj instanceof C0178bf)) {
/* 30 */                return false;
                    }
/* 8 */             C0178bf c0178bf = (C0178bf) obj;
                    return AbstractC0886en.m3499c(this.f2396a, c0178bf.f2396a) && this.f2397b == c0178bf.f2397b;
                }

                public final int hashCode() {
/* 11 */            int iM3520y = (AbstractC0886en.m3520y(this.f2396a) ^ 1000003) * 1000003;
/* 14 */            long j = this.f2397b;
/* 21 */            return ((int) ((j >>> 32) ^ j)) ^ iM3520y;
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("BackendResponse{status=");
/* 14 */            sb.append(AbstractC0886en.m3521z(this.f2396a));
/* 19 */            sb.append(", nextRequestWaitMillis=");
/* 26 */            return fm0.m3787m(sb, this.f2397b, "}");
                }
            }
