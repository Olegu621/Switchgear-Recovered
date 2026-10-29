            package p000;

            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class jh1 {

                /* JADX INFO: renamed from: a */
                public final ArrayList f12303a;

                /* JADX INFO: renamed from: b */
                public final k61 f12304b;

                /* JADX INFO: renamed from: c */
                public final ArrayList f12305c;

                /* JADX INFO: renamed from: d */
                public final ArrayList f12306d;

                public jh1(ArrayList arrayList, k61 k61Var, ArrayList arrayList2, ArrayList arrayList3) {
/* 4 */             this.f12303a = arrayList;
/* 6 */             this.f12304b = k61Var;
/* 8 */             this.f12305c = arrayList2;
/* 10 */            this.f12306d = arrayList3;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 56 */                return true;
                    }
/* 6 */             if (!(obj instanceof jh1)) {
/* 54 */                return false;
                    }
/* 9 */             jh1 jh1Var = (jh1) obj;
                    return this.f12303a.equals(jh1Var.f12303a) && this.f12304b.equals(jh1Var.f12304b) && this.f12305c.equals(jh1Var.f12305c) && this.f12306d.equals(jh1Var.f12306d);
                }

                public final int hashCode() {
/* 33 */            return this.f12306d.hashCode() + ((this.f12305c.hashCode() + ((this.f12304b.hashCode() + (this.f12303a.hashCode() * 31)) * 31)) * 31);
                }

                public final String toString() {
/* 48 */            return "MergedServicesSettings(mergedServices=" + this.f12303a + ", mergedSettings=" + this.f12304b + ", updatedEssentialServices=" + this.f12305c + ", updatedNonEssentialServices=" + this.f12306d + ")";
                }
            }
