            package p000;

            import java.util.List;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class i61 {

                /* JADX INFO: renamed from: a */
                public final List f9465a;

                /* JADX INFO: renamed from: b */
                public final boolean f9466b;

                public i61(List list, boolean z) {
/* 1 */             list.getClass();
/* 7 */             this.f9465a = list;
/* 9 */             this.f9466b = z;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof i61)) {
/* 7 */                 return false;
                    }
/* 11 */            i61 i61Var = (i61) obj;
                    return Intrinsics.m6216a(this.f9465a, i61Var.f9465a) && this.f9466b == i61Var.f9466b;
                }

                public final int hashCode() {
/* 15 */            return Boolean.hashCode(this.f9466b) + (this.f9465a.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "LegacyConsent(history=" + this.f9465a + ", status=" + this.f9466b + ")";
                }
            }
