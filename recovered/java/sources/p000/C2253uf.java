            package p000;
            
            /* JADX INFO: renamed from: uf */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2253uf {

                /* JADX INFO: renamed from: a */
                public final String f17497a;

                /* JADX INFO: renamed from: b */
                public final String f17498b;

                /* JADX INFO: renamed from: c */
                public final String f17499c;

                /* JADX INFO: renamed from: d */
                public final String f17500d;

                public C2253uf(String str, String str2, String str3, String str4) {
/* 4 */             this.f17497a = str;
/* 6 */             this.f17498b = str2;
/* 8 */             this.f17499c = str3;
/* 10 */            this.f17500d = str4;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 50 */                return true;
                    }
/* 6 */             if (!(obj instanceof C2253uf)) {
/* 52 */                return false;
                    }
/* 8 */             C2253uf c2253uf = (C2253uf) obj;
                    return this.f17497a.equals(c2253uf.f17497a) && this.f17498b.equals(c2253uf.f17498b) && this.f17499c.equals(c2253uf.f17499c) && this.f17500d.equals(c2253uf.f17500d);
                }

                public final int hashCode() {
/* 34 */            return this.f17500d.hashCode() ^ ((((((this.f17497a.hashCode() ^ 1000003) * 1000003) ^ this.f17498b.hashCode()) * 1000003) ^ this.f17499c.hashCode()) * 1000003);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("GraphicDeviceInfo{glVersion=");
/* 10 */            sb.append(this.f17497a);
/* 15 */            sb.append(", eglVersion=");
/* 20 */            sb.append(this.f17498b);
/* 25 */            sb.append(", glExtensions=");
/* 30 */            sb.append(this.f17499c);
/* 35 */            sb.append(", eglExtensions=");
/* 42 */            return fm0.m3789o(sb, this.f17500d, "}");
                }
            }
