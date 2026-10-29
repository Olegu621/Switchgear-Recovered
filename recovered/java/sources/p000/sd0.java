            package p000;

            import java.util.Arrays;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class sd0 {

                /* JADX INFO: renamed from: a */
                public final vd0 f16539a;

                /* JADX INFO: renamed from: b */
                public final byte[] f16540b;

                public sd0(vd0 vd0Var, byte[] bArr) {
/* 5 */             if (vd0Var == null) {
/* 22 */                C1951n4.m6868s("encoding is null");
/* 25 */                throw null;
                    }
/* 7 */             if (bArr == null) {
/* 16 */                C1951n4.m6868s("bytes is null");
/* 19 */                throw null;
                    }
/* 9 */             this.f16539a = vd0Var;
/* 11 */            this.f16540b = bArr;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 8 */             if (!(obj instanceof sd0)) {
/* 7 */                 return false;
                    }
/* 11 */            sd0 sd0Var = (sd0) obj;
/* 21 */            if (this.f16539a.equals(sd0Var.f16539a)) {
/* 28 */                return Arrays.equals(this.f16540b, sd0Var.f16540b);
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 18 */            return Arrays.hashCode(this.f16540b) ^ ((this.f16539a.hashCode() ^ 1000003) * 1000003);
                }

                public final String toString() {
/* 18 */            return "EncodedPayload{encoding=" + this.f16539a + ", bytes=[...]}";
                }
            }
