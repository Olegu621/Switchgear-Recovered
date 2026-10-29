            package p000;

            import java.util.Set;
            
            /* JADX INFO: renamed from: lg */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1889lg {

                /* JADX INFO: renamed from: a */
                public final long f13259a;

                /* JADX INFO: renamed from: b */
                public final long f13260b;

                /* JADX INFO: renamed from: c */
                public final Set f13261c;

                public C1889lg(long j, long j2, Set set) {
/* 4 */             this.f13259a = j;
/* 6 */             this.f13260b = j2;
/* 8 */             this.f13261c = set;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof C1889lg) {
/* 10 */                C1889lg c1889lg = (C1889lg) obj;
/* 18 */                if (this.f13259a == c1889lg.f13259a && this.f13260b == c1889lg.f13260b && this.f13261c.equals(c1889lg.f13261c)) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 1 */             long j = this.f13259a;
/* 13 */            int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
/* 14 */            long j2 = this.f13260b;
/* 29 */            return this.f13261c.hashCode() ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
                }

                public final String toString() {
/* 38 */            return "ConfigValue{delta=" + this.f13259a + ", maxAllowedDelay=" + this.f13260b + ", flags=" + this.f13261c + "}";
                }
            }
