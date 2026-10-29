            package p000;

            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class vu1 {

                /* JADX INFO: renamed from: a */
                public final boolean f18356a;

                /* JADX INFO: renamed from: b */
                public final String f18357b;

                /* JADX INFO: renamed from: c */
                public final String f18358c;

                public vu1(String str, String str2, boolean z) {
/* 1 */             str.getClass();
/* 7 */             this.f18356a = z;
/* 9 */             this.f18357b = str;
/* 11 */            this.f18358c = str2;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 41 */                return true;
                    }
/* 6 */             if (!(obj instanceof vu1)) {
/* 39 */                return false;
                    }
/* 9 */             vu1 vu1Var = (vu1) obj;
                    return this.f18356a == vu1Var.f18356a && Intrinsics.m6216a(this.f18357b, vu1Var.f18357b) && this.f18358c.equals(vu1Var.f18358c);
                }

                public final int hashCode() {
/* 22 */            return this.f18358c.hashCode() + pm2.m7485h(Boolean.hashCode(this.f18356a) * 31, 31, this.f18357b);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("PredefinedUIHistoryEntry(status=");
/* 10 */            sb.append(this.f18356a);
/* 15 */            sb.append(", decisionText=");
/* 20 */            sb.append(this.f18357b);
/* 25 */            sb.append(", formattedDate=");
/* 32 */            return fm0.m3789o(sb, this.f18358c, ")");
                }
            }
