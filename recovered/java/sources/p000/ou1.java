            package p000;

            import java.util.Map;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ou1 {
                public static final nu1 Companion = new nu1();

                /* JADX INFO: renamed from: a */
                public final String f14901a;

                /* JADX INFO: renamed from: b */
                public final Map f14902b;

                public ou1(String str, Map map) {
/* 1 */             str.getClass();
/* 4 */             map.getClass();
/* 10 */            this.f14901a = str;
/* 12 */            this.f14902b = map;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof ou1)) {
/* 7 */                 return false;
                    }
/* 11 */            ou1 ou1Var = (ou1) obj;
                    return Intrinsics.m6216a(this.f14901a, ou1Var.f14901a) && Intrinsics.m6216a(this.f14902b, ou1Var.f14902b);
                }

                public final int hashCode() {
/* 15 */            return this.f14902b.hashCode() + (this.f14901a.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "PredefinedUIDecision(serviceId=" + this.f14901a + ", values=" + this.f14902b + ")";
                }
            }
