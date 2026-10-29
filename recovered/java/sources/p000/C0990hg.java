            package p000;
            
            /* JADX INFO: renamed from: hg */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0990hg {

                /* JADX INFO: renamed from: a */
                public final long f9063a;

                /* JADX INFO: renamed from: b */
                public final C2497yg f9064b;

                /* JADX INFO: renamed from: c */
                public final C2142rf f9065c;

                public C0990hg(long j, C2497yg c2497yg, C2142rf c2142rf) {
/* 4 */             this.f9063a = j;
/* 6 */             this.f9064b = c2497yg;
/* 8 */             this.f9065c = c2142rf;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 38 */                return true;
                    }
/* 6 */             if (!(obj instanceof C0990hg)) {
/* 40 */                return false;
                    }
/* 8 */             C0990hg c0990hg = (C0990hg) obj;
                    return this.f9063a == c0990hg.f9063a && this.f9064b.equals(c0990hg.f9064b) && this.f9065c.equals(c0990hg.f9065c);
                }

                public final int hashCode() {
/* 3 */             long j = this.f9063a;
/* 29 */            return this.f9065c.hashCode() ^ ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.f9064b.hashCode()) * 1000003);
                }

                public final String toString() {
/* 38 */            return "PersistedEvent{id=" + this.f9063a + ", transportContext=" + this.f9064b + ", event=" + this.f9065c + "}";
                }
            }
