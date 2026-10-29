            package p000;

            import java.util.ArrayList;
            
            /* JADX INFO: renamed from: cf */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0214cf extends AbstractC2499yi {

                /* JADX INFO: renamed from: a */
                public final ArrayList f2871a;

                public C0214cf(ArrayList arrayList) {
/* 4 */             this.f2871a = arrayList;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 3 */                 return true;
                    }
/* 7 */             if (!(obj instanceof AbstractC2499yi)) {
/* 22 */                return false;
                    }
/* 17 */            return this.f2871a.equals(((C0214cf) ((AbstractC2499yi) obj)).f2871a);
                }

                public final int hashCode() {
/* 10 */            return this.f2871a.hashCode() ^ 1000003;
                }

                public final String toString() {
/* 18 */            return "BatchedLogRequest{logRequests=" + this.f2871a + "}";
                }
            }
