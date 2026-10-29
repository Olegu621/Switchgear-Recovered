            package p000;

            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class gj0 {

                /* JADX INFO: renamed from: a */
                public final AbstractC1835kl f8632a;

                public gj0(AbstractC1835kl abstractC1835kl) {
/* 4 */             this.f8632a = abstractC1835kl;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 23 */                return true;
                    }
                    return (obj instanceof gj0) && Intrinsics.m6216a(this.f8632a, ((gj0) obj).f8632a);
                }

                public final int hashCode() {
/* 1 */             AbstractC1835kl abstractC1835kl = this.f8632a;
/* 11 */            return (abstractC1835kl == null ? 0 : abstractC1835kl.hashCode()) * 29791;
                }

                public final String toString() {
/* 18 */            return "FirstLayerStyleSettings(layout=null, headerImage=null, title=null, message=null, buttonLayout=" + this.f8632a + ", backgroundColor=null, cornerRadius=null, overlayColor=null)";
                }
            }
