            package p000;

            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: renamed from: vi */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2295vi {

                /* JADX INFO: renamed from: a */
                public final String f18188a;

                /* JADX INFO: renamed from: b */
                public final String f18189b;

                public C2295vi(String str, String str2) {
/* 1 */             str.getClass();
/* 4 */             str2.getClass();
/* 10 */            this.f18188a = str;
/* 12 */            this.f18189b = str2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof C2295vi)) {
/* 7 */                 return false;
                    }
/* 11 */            C2295vi c2295vi = (C2295vi) obj;
                    return Intrinsics.m6216a(this.f18188a, c2295vi.f18188a) && Intrinsics.m6216a(this.f18189b, c2295vi.f18189b);
                }

                public final int hashCode() {
/* 15 */            return this.f18189b.hashCode() + (this.f18188a.hashCode() * 31);
                }

                public final String toString() {
/* 11 */            return fm0.m3785k("BasicConsentTemplate(templateId=", this.f18188a, ", version=", this.f18189b, ")");
                }
            }
