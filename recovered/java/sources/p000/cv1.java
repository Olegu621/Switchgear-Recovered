            package p000;

            import java.util.List;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class cv1 {

                /* JADX INFO: renamed from: a */
                public final List f6917a;

                /* JADX INFO: renamed from: b */
                public final bv1 f6918b;

                public cv1(List list, bv1 bv1Var) {
/* 1 */             list.getClass();
/* 7 */             this.f6917a = list;
/* 9 */             this.f6918b = bv1Var;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 34 */                return true;
                    }
/* 6 */             if (!(obj instanceof cv1)) {
/* 32 */                return false;
                    }
/* 9 */             cv1 cv1Var = (cv1) obj;
                    return Intrinsics.m6216a(this.f6917a, cv1Var.f6917a) && this.f6918b.equals(cv1Var.f6918b);
                }

                public final int hashCode() {
/* 17 */            return this.f6918b.f2615a.hashCode() + (this.f6917a.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "PredefinedUILanguageSettings(available=" + this.f6917a + ", selected=" + this.f6918b + ")";
                }
            }
