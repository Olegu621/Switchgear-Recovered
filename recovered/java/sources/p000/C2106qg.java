            package p000;
            
            /* JADX INFO: renamed from: qg */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2106qg {

                /* JADX INFO: renamed from: a */
                public final int f15524a;

                /* JADX INFO: renamed from: b */
                public final int f15525b;

                /* JADX INFO: renamed from: c */
                public final boolean f15526c;

                /* JADX INFO: renamed from: d */
                public final boolean f15527d;

                public C2106qg(int i, int i2, boolean z, boolean z2) {
/* 4 */             this.f15524a = i;
/* 6 */             this.f15525b = i2;
/* 8 */             this.f15526c = z;
/* 10 */            this.f15527d = z2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof C2106qg) {
/* 10 */                C2106qg c2106qg = (C2106qg) obj;
/* 16 */                if (this.f15524a == c2106qg.f15524a && this.f15525b == c2106qg.f15525b && this.f15526c == c2106qg.f15526c && this.f15527d == c2106qg.f15527d) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 30 */            return ((((((this.f15524a ^ 1000003) * 1000003) ^ this.f15525b) * 1000003) ^ (this.f15526c ? 1231 : 1237)) * 1000003) ^ (this.f15527d ? 1231 : 1237);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("FeatureSettings{cameraMode=");
/* 10 */            sb.append(this.f15524a);
/* 15 */            sb.append(", requiredMaxBitDepth=");
/* 20 */            sb.append(this.f15525b);
/* 25 */            sb.append(", previewStabilizationOn=");
/* 30 */            sb.append(this.f15526c);
/* 35 */            sb.append(", ultraHdrOn=");
/* 42 */            return AbstractC0886en.m3511o(sb, this.f15527d, "}");
                }
            }
