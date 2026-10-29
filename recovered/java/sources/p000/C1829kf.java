            package p000;
            
            /* JADX INFO: renamed from: kf */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1829kf extends AbstractC2195sv {

                /* JADX INFO: renamed from: a */
                public final C2548ze f12720a;

                public C1829kf(C2548ze c2548ze) {
/* 4 */             this.f12720a = c2548ze;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 30 */                return true;
                    }
/* 6 */             if (!(obj instanceof AbstractC2195sv)) {
/* 32 */                return false;
                    }
/* 8 */             AbstractC2195sv abstractC2195sv = (AbstractC2195sv) obj;
/* 10 */            Object obj2 = EnumC2158rv.f16301a;
/* 16 */            if (obj2.equals(obj2)) {
                        return this.f12720a.equals(((C1829kf) abstractC2195sv).f12720a);
                    }
/* 32 */            return false;
                }

                public final int hashCode() {
/* 18 */            return this.f12720a.hashCode() ^ ((EnumC2158rv.f16301a.hashCode() ^ 1000003) * 1000003);
                }

                public final String toString() {
/* 28 */            return "ClientInfo{clientType=" + EnumC2158rv.f16301a + ", androidClientInfo=" + this.f12720a + "}";
                }
            }
