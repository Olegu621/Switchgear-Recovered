            package p000;

            import android.hardware.camera2.params.OutputConfiguration;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class pq1 {

                /* JADX INFO: renamed from: a */
                public final OutputConfiguration f15247a;

                /* JADX INFO: renamed from: b */
                public String f15248b;

                /* JADX INFO: renamed from: c */
                public boolean f15249c;

                /* JADX INFO: renamed from: d */
                public long f15250d = 1;

                public pq1(OutputConfiguration outputConfiguration) {
/* 8 */             this.f15247a = outputConfiguration;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof pq1)) {
/* 44 */                return false;
                    }
/* 6 */             pq1 pq1Var = (pq1) obj;
                    return this.f15247a.equals(pq1Var.f15247a) && this.f15249c == pq1Var.f15249c && this.f15250d == pq1Var.f15250d && Objects.equals(this.f15248b, pq1Var.f15248b);
                }

                public final int hashCode() {
/* 9 */             int iHashCode = this.f15247a.hashCode() ^ 31;
/* 15 */            int i = (this.f15249c ? 1 : 0) ^ ((iHashCode << 5) - iHashCode);
/* 18 */            int i2 = (i << 5) - i;
/* 19 */            String str = this.f15248b;
/* 29 */            int iHashCode2 = (str == null ? 0 : str.hashCode()) ^ i2;
/* 39 */            return Long.hashCode(this.f15250d) ^ ((iHashCode2 << 5) - iHashCode2);
                }
            }
