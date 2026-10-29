            package p000;

            import java.util.ArrayList;
            
            /* JADX INFO: renamed from: cg */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0215cg extends ea1 {

                /* JADX INFO: renamed from: a */
                public final long f2882a;

                /* JADX INFO: renamed from: b */
                public final long f2883b;

                /* JADX INFO: renamed from: c */
                public final C1829kf f2884c;

                /* JADX INFO: renamed from: d */
                public final Integer f2885d;

                /* JADX INFO: renamed from: e */
                public final String f2886e;

                /* JADX INFO: renamed from: f */
                public final ArrayList f2887f;

                public C0215cg(long j, long j2, C1829kf c1829kf, Integer num, String str, ArrayList arrayList) {
/* 1 */             b02 b02Var = b02.f2153a;
/* 6 */             this.f2882a = j;
/* 8 */             this.f2883b = j2;
/* 10 */            this.f2884c = c1829kf;
/* 12 */            this.f2885d = num;
/* 14 */            this.f2886e = str;
/* 16 */            this.f2887f = arrayList;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 86 */                return true;
                    }
/* 6 */             if (!(obj instanceof ea1)) {
/* 88 */                return false;
                    }
/* 10 */            C0215cg c0215cg = (C0215cg) ((ea1) obj);
/* 18 */            if (this.f2882a != c0215cg.f2882a || this.f2883b != c0215cg.f2883b || !this.f2884c.equals(c0215cg.f2884c)) {
/* 88 */                return false;
                    }
/* 38 */            Integer num = c0215cg.f2885d;
/* 40 */            Integer num2 = this.f2885d;
/* 42 */            if (num2 == null) {
/* 44 */                if (num != null) {
/* 88 */                    return false;
                        }
                    } else if (!num2.equals(num)) {
/* 88 */                return false;
                    }
/* 53 */            String str = c0215cg.f2886e;
/* 55 */            String str2 = this.f2886e;
/* 57 */            if (str2 == null) {
/* 59 */                if (str != null) {
/* 88 */                    return false;
                        }
                    } else if (!str2.equals(str)) {
/* 88 */                return false;
                    }
/* 76 */            if (!this.f2887f.equals(c0215cg.f2887f)) {
/* 88 */                return false;
                    }
/* 78 */            Object obj2 = b02.f2153a;
                    return obj2.equals(obj2);
                }

                public final int hashCode() {
/* 1 */             long j = this.f2882a;
/* 14 */            long j2 = this.f2883b;
/* 30 */            int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f2884c.hashCode()) * 1000003;
/* 32 */            Integer num = this.f2885d;
/* 43 */            int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
/* 44 */            String str = this.f2886e;
/* 69 */            return ((this.f2887f.hashCode() ^ ((iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003)) * 1000003) ^ b02.f2153a.hashCode();
                }

                public final String toString() {
/* 78 */            return "LogRequest{requestTimeMs=" + this.f2882a + ", requestUptimeMs=" + this.f2883b + ", clientInfo=" + this.f2884c + ", logSource=" + this.f2885d + ", logSourceName=" + this.f2886e + ", logEvents=" + this.f2887f + ", qosTier=" + b02.f2153a + "}";
                }
            }
