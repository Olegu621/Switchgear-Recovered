            package p000;

            import android.util.Size;
            import java.util.ArrayList;
            import java.util.List;
            
            /* JADX INFO: renamed from: df */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0842df {

                /* JADX INFO: renamed from: a */
                public final String f7149a;

                /* JADX INFO: renamed from: b */
                public final Class f7150b;

                /* JADX INFO: renamed from: c */
                public final fb2 f7151c;

                /* JADX INFO: renamed from: d */
                public final zy2 f7152d;

                /* JADX INFO: renamed from: e */
                public final Size f7153e;

                /* JADX INFO: renamed from: f */
                public final C2069pg f7154f;

                /* JADX INFO: renamed from: g */
                public final List f7155g;

                public C0842df(String str, Class cls, fb2 fb2Var, zy2 zy2Var, Size size, C2069pg c2069pg, ArrayList arrayList) {
/* 4 */             this.f7149a = str;
/* 6 */             this.f7150b = cls;
/* 9 */             if (fb2Var == null) {
/* 32 */                C1951n4.m6868s("Null sessionConfig");
/* 35 */                throw null;
                    }
/* 11 */            this.f7151c = fb2Var;
/* 13 */            if (zy2Var == null) {
/* 26 */                C1951n4.m6868s("Null useCaseConfig");
/* 29 */                throw null;
                    }
/* 15 */            this.f7152d = zy2Var;
/* 17 */            this.f7153e = size;
/* 19 */            this.f7154f = c2069pg;
/* 21 */            this.f7155g = arrayList;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 95 */                return true;
                    }
/* 6 */             if (!(obj instanceof C0842df)) {
/* 97 */                return false;
                    }
/* 8 */             C0842df c0842df = (C0842df) obj;
/* 18 */            if (!this.f7149a.equals(c0842df.f7149a) || !this.f7150b.equals(c0842df.f7150b) || !this.f7151c.equals(c0842df.f7151c) || !this.f7152d.equals(c0842df.f7152d)) {
/* 97 */                return false;
                    }
/* 50 */            Size size = c0842df.f7153e;
/* 52 */            Size size2 = this.f7153e;
/* 54 */            if (size2 == null) {
/* 56 */                if (size != null) {
/* 97 */                    return false;
                        }
                    } else if (!size2.equals(size)) {
/* 97 */                return false;
                    }
/* 65 */            C2069pg c2069pg = c0842df.f7154f;
/* 67 */            C2069pg c2069pg2 = this.f7154f;
/* 69 */            if (c2069pg2 == null) {
/* 71 */                if (c2069pg != null) {
/* 97 */                    return false;
                        }
                    } else if (!c2069pg2.equals(c2069pg)) {
/* 97 */                return false;
                    }
/* 80 */            List list = c0842df.f7155g;
/* 82 */            List list2 = this.f7155g;
/* 84 */            if (list2 == null) {
                        return list == null;
                    }
                    return list2.equals(list);
                }

                public final int hashCode() {
/* 35 */            int iHashCode = (((((((this.f7149a.hashCode() ^ 1000003) * 1000003) ^ this.f7150b.hashCode()) * 1000003) ^ this.f7151c.hashCode()) * 1000003) ^ this.f7152d.hashCode()) * 1000003;
/* 37 */            Size size = this.f7153e;
/* 48 */            int iHashCode2 = (iHashCode ^ (size == null ? 0 : size.hashCode())) * 1000003;
/* 49 */            C2069pg c2069pg = this.f7154f;
/* 60 */            int iHashCode3 = (iHashCode2 ^ (c2069pg == null ? 0 : c2069pg.hashCode())) * 1000003;
/* 61 */            List list = this.f7155g;
/* 70 */            return iHashCode3 ^ (list != null ? list.hashCode() : 0);
                }

                public final String toString() {
/* 78 */            return "UseCaseInfo{useCaseId=" + this.f7149a + ", useCaseType=" + this.f7150b + ", sessionConfig=" + this.f7151c + ", useCaseConfig=" + this.f7152d + ", surfaceResolution=" + this.f7153e + ", streamSpec=" + this.f7154f + ", captureTypes=" + this.f7155g + "}";
                }
            }
