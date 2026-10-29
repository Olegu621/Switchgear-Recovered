            package p000;

            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class l82 {

                /* JADX INFO: renamed from: a */
                public final Boolean f13151a;

                /* JADX INFO: renamed from: b */
                public final Integer f13152b;

                public l82(Boolean bool, Integer num) {
/* 4 */             this.f13151a = bool;
/* 6 */             this.f13152b = num;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof l82)) {
/* 7 */                 return false;
                    }
/* 11 */            l82 l82Var = (l82) obj;
                    return Intrinsics.m6216a(this.f13151a, l82Var.f13151a) && Intrinsics.m6216a(this.f13152b, l82Var.f13152b);
                }

                public final int hashCode() {
/* 2 */             Boolean bool = this.f13151a;
/* 12 */            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
/* 14 */            Integer num = this.f13152b;
/* 23 */            return iHashCode + (num != null ? num.hashCode() : 0);
                }

                public final String toString() {
/* 28 */            return "SecondLayerInitialState(ccpaToggleValue=" + this.f13151a + ", tabIndex=" + this.f13152b + ")";
                }
            }
