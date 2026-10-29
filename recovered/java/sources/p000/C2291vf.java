            package p000;

            import java.util.ArrayList;
            
            /* JADX INFO: renamed from: vf */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2291vf {

                /* JADX INFO: renamed from: a */
                public final String f18026a;

                /* JADX INFO: renamed from: b */
                public final ArrayList f18027b;

                public C2291vf(String str, ArrayList arrayList) {
/* 4 */             if (str == null) {
/* 13 */                C1951n4.m6868s("Null userAgent");
/* 17 */                throw null;
                    }
/* 6 */             this.f18026a = str;
/* 8 */             this.f18027b = arrayList;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 30 */                return true;
                    }
/* 6 */             if (!(obj instanceof C2291vf)) {
/* 32 */                return false;
                    }
/* 8 */             C2291vf c2291vf = (C2291vf) obj;
                    return this.f18026a.equals(c2291vf.f18026a) && this.f18027b.equals(c2291vf.f18027b);
                }

                public final int hashCode() {
/* 18 */            return this.f18027b.hashCode() ^ ((this.f18026a.hashCode() ^ 1000003) * 1000003);
                }

                public final String toString() {
/* 28 */            return "HeartBeatResult{userAgent=" + this.f18026a + ", usedDates=" + this.f18027b + "}";
                }
            }
