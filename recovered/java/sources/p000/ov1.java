            package p000;

            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ov1 extends pg3 {

                /* JADX INFO: renamed from: i */
                public final ArrayList f14905i;

                public ov1(ArrayList arrayList) {
/* 4 */             this.f14905i = arrayList;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 23 */                return true;
                    }
                    return (obj instanceof ov1) && this.f14905i.equals(((ov1) obj).f14905i);
                }

                public final int hashCode() {
/* 3 */             return this.f14905i.hashCode();
                }

                public final String toString() {
/* 18 */            return "PredefinedUIServicesCardContent(services=" + this.f14905i + ")";
                }
            }
