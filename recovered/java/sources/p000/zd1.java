            package p000;

            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zd1 {

                /* JADX INFO: renamed from: a */
                public String f20100a;

                /* JADX INFO: renamed from: b */
                public String f20101b;

                /* JADX INFO: renamed from: c */
                public String f20102c;

                /* JADX INFO: renamed from: d */
                public Integer f20103d;

                /* JADX INFO: renamed from: e */
                public Double f20104e;

                /* JADX INFO: renamed from: f */
                public Boolean f20105f;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 78 */                return true;
                    }
/* 6 */             if (!(obj instanceof zd1)) {
/* 76 */                return false;
                    }
/* 9 */             zd1 zd1Var = (zd1) obj;
                    return this.f20100a.equals(zd1Var.f20100a) && Intrinsics.m6216a(this.f20101b, zd1Var.f20101b) && Intrinsics.m6216a(this.f20102c, zd1Var.f20102c) && Intrinsics.m6216a(this.f20103d, zd1Var.f20103d) && Intrinsics.m6216a(this.f20104e, zd1Var.f20104e) && Intrinsics.m6216a(this.f20105f, zd1Var.f20105f);
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.f20100a.hashCode() * 31;
/* 9 */             String str = this.f20101b;
/* 21 */            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
/* 23 */            String str2 = this.f20102c;
/* 34 */            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
/* 36 */            Integer num = this.f20103d;
/* 47 */            int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
/* 49 */            Double d = this.f20104e;
/* 60 */            int iHashCode5 = (iHashCode4 + (d == null ? 0 : d.hashCode())) * 31;
/* 62 */            Boolean bool = this.f20105f;
/* 71 */            return iHashCode5 + (bool != null ? bool.hashCode() : 0);
                }

                public final String toString() {
/* 68 */            return "MediaAdEntity(adId=" + this.f20100a + ", name=" + this.f20101b + ", creativeId=" + this.f20102c + ", podPosition=" + this.f20103d + ", duration=" + this.f20104e + ", skippable=" + this.f20105f + ')';
                }
            }
