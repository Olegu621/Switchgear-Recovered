            package p000;

            import java.util.List;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: renamed from: s3 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2167s3 {

                /* JADX INFO: renamed from: a */
                public final String f16394a;

                /* JADX INFO: renamed from: b */
                public final List f16395b;

                public C2167s3(String str, List list) {
/* 1 */             str.getClass();
/* 4 */             list.getClass();
/* 10 */            this.f16394a = str;
/* 12 */            this.f16395b = list;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof C2167s3)) {
/* 7 */                 return false;
                    }
/* 11 */            C2167s3 c2167s3 = (C2167s3) obj;
                    return Intrinsics.m6216a(this.f16394a, c2167s3.f16394a) && Intrinsics.m6216a(this.f16395b, c2167s3.f16395b);
                }

                public final int hashCode() {
/* 15 */            return this.f16395b.hashCode() + (this.f16394a.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "AdditionalConsentModeData(acString=" + this.f16394a + ", adTechProviders=" + this.f16395b + ")";
                }
            }
