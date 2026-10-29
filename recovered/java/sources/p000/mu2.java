            package p000;

            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class mu2 {

                /* JADX INFO: renamed from: a */
                public final String f14029a;

                public mu2(String str) {
/* 1 */             str.getClass();
/* 7 */             this.f14029a = str;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 23 */                return true;
                    }
                    return (obj instanceof mu2) && Intrinsics.m6216a(this.f14029a, ((mu2) obj).f14029a);
                }

                public final int hashCode() {
/* 10 */            return this.f14029a.hashCode() * 887503681;
                }

                public final String toString() {
/* 7 */             return fm0.m3784j("UCFirstLayerMessage(text=", this.f14029a, ", customFont=null, customTextSizeInSp=null, customAlignment=null, customTextColor=null, customLinkTextColor=null, customUnderlineLink=null)");
                }
            }
