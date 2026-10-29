            package p000;

            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class pu2 {

                /* JADX INFO: renamed from: a */
                public final String f15287a;

                public pu2(String str) {
/* 1 */             str.getClass();
/* 7 */             this.f15287a = str;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof pu2) && Intrinsics.m6216a(this.f15287a, ((pu2) obj).f15287a);
                }

                public final int hashCode() {
/* 10 */            return this.f15287a.hashCode() * 923521;
                }

                public final String toString() {
/* 7 */             return fm0.m3784j("UCFirstLayerTitle(text=", this.f15287a, ", customFont=null, customTextSizeInSp=null, customTextColor=null, customAlignment=null)");
                }
            }
