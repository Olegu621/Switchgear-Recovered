            package p000;

            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: renamed from: zy */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2568zy {

                /* JADX INFO: renamed from: a */
                public final String f20377a;

                /* JADX INFO: renamed from: b */
                public final boolean f20378b;

                /* JADX INFO: renamed from: c */
                public final String f20379c;

                /* JADX INFO: renamed from: d */
                public final Boolean f20380d;

                /* JADX INFO: renamed from: e */
                public final cg1 f20381e;

                public C2568zy(String str, boolean z, String str2, Boolean bool, cg1 cg1Var, int i) {
/* 4 */             str2 = (i & 4) != 0 ? null : str2;
/* 9 */             bool = (i & 8) != 0 ? null : bool;
/* 14 */            cg1Var = (i & 16) != 0 ? null : cg1Var;
/* 17 */            str.getClass();
/* 23 */            this.f20377a = str;
/* 25 */            this.f20378b = z;
/* 27 */            this.f20379c = str2;
/* 29 */            this.f20380d = bool;
/* 31 */            this.f20381e = cg1Var;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof C2568zy)) {
/* 7 */                 return false;
                    }
/* 11 */            C2568zy c2568zy = (C2568zy) obj;
                    return Intrinsics.m6216a(this.f20377a, c2568zy.f20377a) && this.f20378b == c2568zy.f20378b && Intrinsics.m6216a(this.f20379c, c2568zy.f20379c) && Intrinsics.m6216a(this.f20380d, c2568zy.f20380d) && Intrinsics.m6216a(this.f20381e, c2568zy.f20381e);
                }

                public final int hashCode() {
/* 12 */            int iM3504h = AbstractC0886en.m3504h(this.f20377a.hashCode() * 31, 31, this.f20378b);
/* 17 */            String str = this.f20379c;
/* 28 */            int iHashCode = (iM3504h + (str == null ? 0 : str.hashCode())) * 31;
/* 29 */            Boolean bool = this.f20380d;
/* 40 */            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
/* 41 */            cg1 cg1Var = this.f20381e;
/* 50 */            return iHashCode2 + (cg1Var != null ? cg1Var.hashCode() : 0);
                }

                public final String toString() {
/* 58 */            return "ConsentApplyResult(name=" + this.f20377a + ", mediated=" + this.f20378b + ", templateId=" + this.f20379c + ", consent=" + this.f20380d + ", granularConsent=" + this.f20381e + ")";
                }
            }
