            package p000;

            import android.util.Size;
            import java.util.HashMap;
            
            /* JADX INFO: renamed from: wg */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2330wg {

                /* JADX INFO: renamed from: a */
                public final Size f18608a;

                /* JADX INFO: renamed from: b */
                public final HashMap f18609b;

                /* JADX INFO: renamed from: c */
                public final Size f18610c;

                /* JADX INFO: renamed from: d */
                public final HashMap f18611d;

                /* JADX INFO: renamed from: e */
                public final Size f18612e;

                /* JADX INFO: renamed from: f */
                public final HashMap f18613f;

                /* JADX INFO: renamed from: g */
                public final HashMap f18614g;

                public C2330wg(Size size, HashMap map, Size size2, HashMap map2, Size size3, HashMap map3, HashMap map4) {
/* 5 */             if (size == null) {
/* 40 */                C1951n4.m6868s("Null analysisSize");
/* 43 */                throw null;
                    }
/* 7 */             this.f18608a = size;
/* 9 */             this.f18609b = map;
/* 11 */            if (size2 == null) {
/* 34 */                C1951n4.m6868s("Null previewSize");
/* 37 */                throw null;
                    }
/* 13 */            this.f18610c = size2;
/* 15 */            this.f18611d = map2;
/* 17 */            if (size3 == null) {
/* 28 */                C1951n4.m6868s("Null recordSize");
/* 31 */                throw null;
                    }
/* 19 */            this.f18612e = size3;
/* 21 */            this.f18613f = map3;
/* 23 */            this.f18614g = map4;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 80 */                return true;
                    }
/* 6 */             if (!(obj instanceof C2330wg)) {
/* 82 */                return false;
                    }
/* 8 */             C2330wg c2330wg = (C2330wg) obj;
                    return this.f18608a.equals(c2330wg.f18608a) && this.f18609b.equals(c2330wg.f18609b) && this.f18610c.equals(c2330wg.f18610c) && this.f18611d.equals(c2330wg.f18611d) && this.f18612e.equals(c2330wg.f18612e) && this.f18613f.equals(c2330wg.f18613f) && this.f18614g.equals(c2330wg.f18614g);
                }

                public final int hashCode() {
/* 58 */            return this.f18614g.hashCode() ^ ((((((((((((this.f18608a.hashCode() ^ 1000003) * 1000003) ^ this.f18609b.hashCode()) * 1000003) ^ this.f18610c.hashCode()) * 1000003) ^ this.f18611d.hashCode()) * 1000003) ^ this.f18612e.hashCode()) * 1000003) ^ this.f18613f.hashCode()) * 1000003);
                }

                public final String toString() {
/* 78 */            return "SurfaceSizeDefinition{analysisSize=" + this.f18608a + ", s720pSizeMap=" + this.f18609b + ", previewSize=" + this.f18610c + ", s1440pSizeMap=" + this.f18611d + ", recordSize=" + this.f18612e + ", maximumSizeMap=" + this.f18613f + ", ultraMaximumSizeMap=" + this.f18614g + "}";
                }
            }
