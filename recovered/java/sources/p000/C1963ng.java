            package p000;
            
            /* JADX INFO: renamed from: ng */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1963ng {

                /* JADX INFO: renamed from: a */
                public final long f14256a;

                /* JADX INFO: renamed from: b */
                public final long f14257b;

                /* JADX INFO: renamed from: c */
                public final long f14258c;

                public C1963ng(long j, long j2, long j3) {
/* 4 */             this.f14256a = j;
/* 6 */             this.f14257b = j2;
/* 8 */             this.f14258c = j3;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof C1963ng) {
/* 10 */                C1963ng c1963ng = (C1963ng) obj;
/* 18 */                if (this.f14256a == c1963ng.f14256a && this.f14257b == c1963ng.f14257b && this.f14258c == c1963ng.f14258c) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 1 */             long j = this.f14256a;
/* 14 */            long j2 = this.f14257b;
/* 21 */            int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
/* 22 */            long j3 = this.f14258c;
/* 28 */            return ((int) ((j3 >>> 32) ^ j3)) ^ i;
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("StartupTime{epochMillis=");
/* 10 */            sb.append(this.f14256a);
/* 15 */            sb.append(", elapsedRealtime=");
/* 20 */            sb.append(this.f14257b);
/* 25 */            sb.append(", uptimeMillis=");
/* 32 */            return fm0.m3787m(sb, this.f14258c, "}");
                }
            }
