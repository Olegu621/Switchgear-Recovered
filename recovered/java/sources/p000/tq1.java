            package p000;

            import android.hardware.camera2.params.OutputConfiguration;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class tq1 {

                /* JADX INFO: renamed from: a */
                public final OutputConfiguration f17226a;

                /* JADX INFO: renamed from: b */
                public long f17227b = 1;

                public tq1(OutputConfiguration outputConfiguration) {
/* 8 */             this.f17226a = outputConfiguration;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof tq1)) {
/* 28 */                return false;
                    }
/* 6 */             tq1 tq1Var = (tq1) obj;
                    return this.f17226a.equals(tq1Var.f17226a) && this.f17227b == tq1Var.f17227b;
                }

                public final int hashCode() {
/* 9 */             int iHashCode = this.f17226a.hashCode() ^ 31;
/* 19 */            return Long.hashCode(this.f17227b) ^ ((iHashCode << 5) - iHashCode);
                }
            }
