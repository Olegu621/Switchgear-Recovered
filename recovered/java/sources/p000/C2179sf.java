            package p000;
            
            /* JADX INFO: renamed from: sf */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2179sf {

                /* JADX INFO: renamed from: f */
                public static final C2179sf f16553f = new C2179sf(200, 10000, 81920, 10485760, 604800000);

                /* JADX INFO: renamed from: a */
                public final long f16554a;

                /* JADX INFO: renamed from: b */
                public final int f16555b;

                /* JADX INFO: renamed from: c */
                public final int f16556c;

                /* JADX INFO: renamed from: d */
                public final long f16557d;

                /* JADX INFO: renamed from: e */
                public final int f16558e;

                public C2179sf(int i, int i2, int i3, long j, long j2) {
/* 4 */             this.f16554a = j;
/* 6 */             this.f16555b = i;
/* 8 */             this.f16556c = i2;
/* 10 */            this.f16557d = j2;
/* 12 */            this.f16558e = i3;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof C2179sf) {
/* 10 */                C2179sf c2179sf = (C2179sf) obj;
/* 18 */                if (this.f16554a == c2179sf.f16554a && this.f16555b == c2179sf.f16555b && this.f16556c == c2179sf.f16556c && this.f16557d == c2179sf.f16557d && this.f16558e == c2179sf.f16558e) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 1 */             long j = this.f16554a;
/* 21 */            int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f16555b) * 1000003) ^ this.f16556c) * 1000003;
/* 22 */            long j2 = this.f16557d;
/* 33 */            return this.f16558e ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
/* 10 */            sb.append(this.f16554a);
/* 15 */            sb.append(", loadBatchSize=");
/* 20 */            sb.append(this.f16555b);
/* 25 */            sb.append(", criticalSectionEnterTimeoutMs=");
/* 30 */            sb.append(this.f16556c);
/* 35 */            sb.append(", eventCleanUpAge=");
/* 40 */            sb.append(this.f16557d);
/* 45 */            sb.append(", maxBlobByteSizePerRow=");
/* 52 */            return fm0.m3786l(sb, this.f16558e, "}");
                }
            }
