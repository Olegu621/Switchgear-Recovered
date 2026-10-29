            package p000;

            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class m82 {

                /* JADX INFO: renamed from: a */
                public final AbstractC1835kl f13658a;

                public m82(AbstractC1835kl abstractC1835kl) {
/* 4 */             this.f13658a = abstractC1835kl;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 23 */                return true;
                    }
                    return (obj instanceof m82) && Intrinsics.m6216a(this.f13658a, ((m82) obj).f13658a);
                }

                public final int hashCode() {
/* 1 */             AbstractC1835kl abstractC1835kl = this.f13658a;
/* 11 */            return (abstractC1835kl == null ? 0 : abstractC1835kl.hashCode()) * 31;
                }

                public final String toString() {
/* 18 */            return "SecondLayerStyleSettings(buttonLayout=" + this.f13658a + ", showCloseButton=null)";
                }
            }
