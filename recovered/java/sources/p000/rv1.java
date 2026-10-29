            package p000;

            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class rv1 extends w11 {

                /* JADX INFO: renamed from: f */
                public final String f16322f;

                public rv1(String str) {
/* 1 */             str.getClass();
/* 7 */             this.f16322f = str;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof rv1) && Intrinsics.m6216a(this.f16322f, ((rv1) obj).f16322f);
                }

                public final int hashCode() {
/* 3 */             return this.f16322f.hashCode();
                }

                public final String toString() {
/* 7 */             return fm0.m3784j("PredefinedUISimpleServiceContent(content=", this.f16322f, ")");
                }
            }
