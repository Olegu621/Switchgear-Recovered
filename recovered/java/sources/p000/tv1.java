            package p000;

            import java.util.ArrayList;
            import java.util.List;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class tv1 {

                /* JADX INFO: renamed from: a */
                public final String f17288a;

                /* JADX INFO: renamed from: b */
                public final String f17289b;

                /* JADX INFO: renamed from: c */
                public final List f17290c;

                public tv1(String str, String str2, ArrayList arrayList) {
/* 1 */             str.getClass();
/* 7 */             this.f17288a = str;
/* 9 */             this.f17289b = str2;
/* 11 */            this.f17290c = arrayList;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof tv1)) {
/* 7 */                 return false;
                    }
/* 11 */            tv1 tv1Var = (tv1) obj;
                    return Intrinsics.m6216a(this.f17288a, tv1Var.f17288a) && Intrinsics.m6216a(this.f17289b, tv1Var.f17289b) && Intrinsics.m6216a(this.f17290c, tv1Var.f17290c);
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.f17288a.hashCode() * 31;
/* 10 */            String str = this.f17289b;
/* 21 */            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
/* 23 */            List list = this.f17290c;
/* 32 */            return iHashCode2 + (list != null ? list.hashCode() : 0);
                }

                public final String toString() {
/* 11 */            StringBuilder sbM3514r = AbstractC0886en.m3514r("PredefinedUIStorageInformationButtonInfo(label=", this.f17288a, ", url=", this.f17289b, ", deviceStorage=");
/* 17 */            sbM3514r.append(this.f17290c);
/* 22 */            sbM3514r.append(")");
/* 25 */            return sbM3514r.toString();
                }
            }
