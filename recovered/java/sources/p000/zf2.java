            package p000;

            import com.usercentrics.sdk.services.tcf.interfaces.TCFSpecialPurpose;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zf2 {

                /* JADX INFO: renamed from: a */
                public final TCFSpecialPurpose f20131a;

                public zf2(TCFSpecialPurpose tCFSpecialPurpose) {
/* 1 */             tCFSpecialPurpose.getClass();
/* 7 */             this.f20131a = tCFSpecialPurpose;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 23 */                return true;
                    }
                    return (obj instanceof zf2) && Intrinsics.m6216a(this.f20131a, ((zf2) obj).f20131a);
                }

                public final int hashCode() {
/* 20 */            return this.f20131a.hashCode() + AbstractC0886en.m3504h(Boolean.hashCode(false) * 31, 31, true);
                }

                public final String toString() {
/* 18 */            return "SpecialPurposeProps(checked=false, legitimateInterestChecked=true, purpose=" + this.f20131a + ")";
                }
            }
