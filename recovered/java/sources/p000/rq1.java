            package p000;

            import android.hardware.camera2.params.OutputConfiguration;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class rq1 {

                /* JADX INFO: renamed from: a */
                public final OutputConfiguration f16229a;

                /* JADX INFO: renamed from: b */
                public String f16230b;

                /* JADX INFO: renamed from: c */
                public long f16231c = 1;

                public rq1(OutputConfiguration outputConfiguration) {
/* 8 */             this.f16229a = outputConfiguration;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof rq1)) {
/* 38 */                return false;
                    }
/* 6 */             rq1 rq1Var = (rq1) obj;
                    return this.f16229a.equals(rq1Var.f16229a) && this.f16231c == rq1Var.f16231c && Objects.equals(this.f16230b, rq1Var.f16230b);
                }

                public final int hashCode() {
/* 9 */             int iHashCode = this.f16229a.hashCode() ^ 31;
/* 12 */            int i = (iHashCode << 5) - iHashCode;
/* 13 */            String str = this.f16230b;
/* 23 */            int iHashCode2 = (str == null ? 0 : str.hashCode()) ^ i;
/* 33 */            return Long.hashCode(this.f16231c) ^ ((iHashCode2 << 5) - iHashCode2);
                }
            }
