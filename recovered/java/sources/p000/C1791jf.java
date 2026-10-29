            package p000;

            import android.util.Size;
            
            /* JADX INFO: renamed from: jf */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1791jf {

                /* JADX INFO: renamed from: a */
                public uw0 f12240a;

                /* JADX INFO: renamed from: b */
                public final uw0 f12241b = null;

                /* JADX INFO: renamed from: c */
                public final Size f12242c;

                /* JADX INFO: renamed from: d */
                public final int f12243d;

                /* JADX INFO: renamed from: e */
                public final int f12244e;

                /* JADX INFO: renamed from: f */
                public final boolean f12245f;

                /* JADX INFO: renamed from: g */
                public final ac0 f12246g;

                /* JADX INFO: renamed from: h */
                public final ac0 f12247h;

                public C1791jf(Size size, int i, int i2, boolean z, ac0 ac0Var, ac0 ac0Var2) {
/* 7 */             if (size == null) {
/* 24 */                C1951n4.m6868s("Null size");
/* 27 */                throw null;
                    }
/* 9 */             this.f12242c = size;
/* 11 */            this.f12243d = i;
/* 13 */            this.f12244e = i2;
/* 15 */            this.f12245f = z;
/* 17 */            this.f12246g = ac0Var;
/* 19 */            this.f12247h = ac0Var2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof C1791jf) {
/* 10 */                C1791jf c1791jf = (C1791jf) obj;
                        return this.f12242c.equals(c1791jf.f12242c) && this.f12243d == c1791jf.f12243d && this.f12244e == c1791jf.f12244e && this.f12245f == c1791jf.f12245f && this.f12246g == c1791jf.f12246g && this.f12247h == c1791jf.f12247h;
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 51 */            return this.f12247h.hashCode() ^ ((((((((((((this.f12242c.hashCode() ^ 1000003) * 1000003) ^ this.f12243d) * 1000003) ^ this.f12244e) * 1000003) ^ (this.f12245f ? 1231 : 1237)) * 583896283) ^ 35) * 1000003) ^ this.f12246g.hashCode()) * 1000003);
                }

                public final String toString() {
/* 68 */            return "In{size=" + this.f12242c + ", inputFormat=" + this.f12243d + ", outputFormat=" + this.f12244e + ", virtualCamera=" + this.f12245f + ", imageReaderProxyProvider=null, postviewSize=null, postviewImageFormat=35, requestEdge=" + this.f12246g + ", errorEdge=" + this.f12247h + "}";
                }
            }
