            package p000;

            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class j61 {

                /* JADX INFO: renamed from: a */
                public final kz2 f12095a;

                /* JADX INFO: renamed from: b */
                public final boolean f12096b;

                /* JADX INFO: renamed from: c */
                public final mz2 f12097c;

                /* JADX INFO: renamed from: d */
                public final String f12098d;

                /* JADX INFO: renamed from: e */
                public final long f12099e;

                public j61(kz2 kz2Var, boolean z, mz2 mz2Var, String str, long j) {
/* 1 */             kz2Var.getClass();
/* 4 */             mz2Var.getClass();
/* 7 */             str.getClass();
/* 13 */            this.f12095a = kz2Var;
/* 15 */            this.f12096b = z;
/* 17 */            this.f12097c = mz2Var;
/* 19 */            this.f12098d = str;
/* 21 */            this.f12099e = j;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof j61)) {
/* 7 */                 return false;
                    }
/* 11 */            j61 j61Var = (j61) obj;
                    return this.f12095a == j61Var.f12095a && this.f12096b == j61Var.f12096b && this.f12097c == j61Var.f12097c && Intrinsics.m6216a(this.f12098d, j61Var.f12098d) && this.f12099e == j61Var.f12099e;
                }

                public final int hashCode() {
/* 36 */            return Long.hashCode(this.f12099e) + pm2.m7485h((this.f12097c.hashCode() + AbstractC0886en.m3504h(this.f12095a.hashCode() * 31, 31, this.f12096b)) * 31, 31, this.f12098d);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("LegacyConsentHistoryEntry(action=");
/* 10 */            sb.append(this.f12095a);
/* 15 */            sb.append(", status=");
/* 20 */            sb.append(this.f12096b);
/* 25 */            sb.append(", type=");
/* 30 */            sb.append(this.f12097c);
/* 35 */            sb.append(", language=");
/* 40 */            sb.append(this.f12098d);
/* 45 */            sb.append(", timestampInMillis=");
/* 52 */            return fm0.m3787m(sb, this.f12099e, ")");
                }
            }
