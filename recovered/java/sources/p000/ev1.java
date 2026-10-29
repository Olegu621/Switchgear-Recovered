            package p000;

            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.StringsKt;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ev1 {
                public static final dv1 Companion = new dv1();

                /* JADX INFO: renamed from: a */
                public final String f7892a;

                /* JADX INFO: renamed from: b */
                public final String f7893b;

                /* JADX INFO: renamed from: c */
                public final fv1 f7894c;

                /* JADX INFO: renamed from: d */
                public final ez2 f7895d;

                public ev1(String str, String str2, fv1 fv1Var, ez2 ez2Var) {
/* 1 */             str.getClass();
/* 7 */             this.f7892a = str;
/* 9 */             this.f7893b = str2;
/* 11 */            this.f7894c = fv1Var;
/* 13 */            this.f7895d = ez2Var;
                }

                /* JADX INFO: renamed from: a */
                public final boolean m3602a() {
/* 7 */             if (StringsKt.m6228D(this.f7892a)) {
/* 28 */                return true;
                    }
/* 13 */            if (this.f7894c != fv1.URL) {
/* 26 */                return false;
                    }
/* 15 */            String str = this.f7893b;
                    return str == null || StringsKt.m6228D(str);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 48 */                return true;
                    }
/* 6 */             if (!(obj instanceof ev1)) {
/* 46 */                return false;
                    }
/* 9 */             ev1 ev1Var = (ev1) obj;
                    return Intrinsics.m6216a(this.f7892a, ev1Var.f7892a) && Intrinsics.m6216a(this.f7893b, ev1Var.f7893b) && this.f7894c == ev1Var.f7894c && this.f7895d == ev1Var.f7895d;
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.f7892a.hashCode() * 31;
/* 9 */             String str = this.f7893b;
/* 37 */            return this.f7895d.hashCode() + ((this.f7894c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
                }

                public final String toString() {
/* 11 */            StringBuilder sbM3514r = AbstractC0886en.m3514r("PredefinedUILink(label=", this.f7892a, ", url=", this.f7893b, ", linkType=");
/* 17 */            sbM3514r.append(this.f7894c);
/* 22 */            sbM3514r.append(", eventType=");
/* 27 */            sbM3514r.append(this.f7895d);
/* 32 */            sbM3514r.append(")");
/* 35 */            return sbM3514r.toString();
                }
            }
