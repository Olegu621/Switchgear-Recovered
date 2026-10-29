            package p000;

            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class td1 {

                /* JADX INFO: renamed from: a */
                public String f17046a;

                /* JADX INFO: renamed from: b */
                public String f17047b;

                /* JADX INFO: renamed from: c */
                public wd1 f17048c;

                /* JADX INFO: renamed from: d */
                public Integer f17049d;

                /* JADX INFO: renamed from: e */
                public Double f17050e;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 52 */                return true;
                    }
/* 6 */             if (!(obj instanceof td1)) {
/* 50 */                return false;
                    }
/* 9 */             td1 td1Var = (td1) obj;
                    return this.f17046a.equals(td1Var.f17046a) && Intrinsics.m6216a(this.f17047b, td1Var.f17047b) && this.f17048c == td1Var.f17048c && Intrinsics.m6216a(this.f17049d, td1Var.f17049d);
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.f17046a.hashCode() * 31;
/* 9 */             String str = this.f17047b;
/* 21 */            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
/* 23 */            wd1 wd1Var = this.f17048c;
/* 34 */            int iHashCode3 = (iHashCode2 + (wd1Var == null ? 0 : wd1Var.hashCode())) * 31;
/* 36 */            Integer num = this.f17049d;
/* 45 */            return iHashCode3 + (num != null ? num.hashCode() : 0);
                }

                public final String toString() {
/* 48 */            return "MediaAdBreakEntity(breakId=" + this.f17046a + ", name=" + this.f17047b + ", breakType=" + this.f17048c + ", podSize=" + this.f17049d + ')';
                }
            }
