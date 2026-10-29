            package p000;
            
            /* JADX INFO: renamed from: zf */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2549zf {

                /* JADX INFO: renamed from: a */
                public final String f20129a;

                /* JADX INFO: renamed from: b */
                public final String f20130b;

                public C2549zf(String str, String str2) {
/* 4 */             this.f20129a = str;
/* 6 */             if (str2 != null) {
/* 8 */                 this.f20130b = str2;
                    } else {
/* 13 */                C1951n4.m6868s("Null version");
/* 17 */                throw null;
                    }
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 30 */                return true;
                    }
/* 6 */             if (!(obj instanceof C2549zf)) {
/* 32 */                return false;
                    }
/* 8 */             C2549zf c2549zf = (C2549zf) obj;
                    return this.f20129a.equals(c2549zf.f20129a) && this.f20130b.equals(c2549zf.f20130b);
                }

                public final int hashCode() {
/* 18 */            return this.f20130b.hashCode() ^ ((this.f20129a.hashCode() ^ 1000003) * 1000003);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
/* 10 */            sb.append(this.f20129a);
/* 15 */            sb.append(", version=");
/* 22 */            return fm0.m3789o(sb, this.f20130b, "}");
                }
            }
