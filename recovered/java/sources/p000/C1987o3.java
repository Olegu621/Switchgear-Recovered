            package p000;
            
            /* JADX INFO: renamed from: o3 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1987o3 {

                /* JADX INFO: renamed from: a */
                public final int f14597a;

                /* JADX INFO: renamed from: b */
                public final boolean f14598b;

                public C1987o3(int i, boolean z) {
/* 4 */             this.f14597a = i;
/* 6 */             this.f14598b = z;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof C1987o3)) {
/* 7 */                 return false;
                    }
/* 11 */            C1987o3 c1987o3 = (C1987o3) obj;
                    return this.f14597a == c1987o3.f14597a && this.f14598b == c1987o3.f14598b;
                }

                public final int hashCode() {
/* 15 */            return Boolean.hashCode(this.f14598b) + (Integer.hashCode(this.f14597a) * 31);
                }

                public final String toString() {
/* 28 */            return "AdTechProviderDecision(id=" + this.f14597a + ", consent=" + this.f14598b + ")";
                }
            }
