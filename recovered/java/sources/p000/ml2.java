            package p000;

            import java.util.List;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ml2 {

                /* JADX INFO: renamed from: a */
                public final List f13847a;

                /* JADX INFO: renamed from: b */
                public final List f13848b;

                /* JADX INFO: renamed from: c */
                public final List f13849c;

                /* JADX INFO: renamed from: d */
                public final List f13850d;

                public ml2(List list, List list2, List list3, List list4) {
/* 1 */             list4.getClass();
/* 7 */             this.f13847a = list;
/* 9 */             this.f13848b = list2;
/* 11 */            this.f13849c = list3;
/* 13 */            this.f13850d = list4;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof ml2)) {
/* 7 */                 return false;
                    }
/* 11 */            ml2 ml2Var = (ml2) obj;
                    return Intrinsics.m6216a(this.f13847a, ml2Var.f13847a) && Intrinsics.m6216a(this.f13848b, ml2Var.f13848b) && Intrinsics.m6216a(this.f13849c, ml2Var.f13849c) && Intrinsics.m6216a(this.f13850d, ml2Var.f13850d);
                }

                public final int hashCode() {
/* 2 */             List list = this.f13847a;
/* 12 */            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
/* 14 */            List list2 = this.f13848b;
/* 25 */            int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
/* 27 */            List list3 = this.f13849c;
/* 45 */            return this.f13850d.hashCode() + ((iHashCode2 + (list3 != null ? list3.hashCode() : 0)) * 31);
                }

                public final String toString() {
/* 48 */            return "TCFUserDecisions(purposes=" + this.f13847a + ", specialFeatures=" + this.f13848b + ", vendors=" + this.f13849c + ", adTechProviders=" + this.f13850d + ")";
                }
            }
