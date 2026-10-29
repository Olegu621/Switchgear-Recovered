            package p000;

            import android.graphics.Rect;
            import android.util.Size;
            
            /* JADX INFO: renamed from: jg */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1792jg {

                /* JADX INFO: renamed from: a */
                public final Size f12252a;

                /* JADX INFO: renamed from: b */
                public final Rect f12253b;

                /* JADX INFO: renamed from: c */
                public final int f12254c;

                public C1792jg(Size size, Rect rect, int i) {
/* 4 */             this.f12252a = size;
/* 6 */             this.f12253b = rect;
/* 8 */             this.f12254c = i;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 36 */                return true;
                    }
/* 6 */             if (!(obj instanceof C1792jg)) {
/* 38 */                return false;
                    }
/* 8 */             C1792jg c1792jg = (C1792jg) obj;
                    return this.f12252a.equals(c1792jg.f12252a) && this.f12253b.equals(c1792jg.f12253b) && this.f12254c == c1792jg.f12254c;
                }

                public final int hashCode() {
/* 22 */            return this.f12254c ^ ((((this.f12252a.hashCode() ^ 1000003) * 1000003) ^ this.f12253b.hashCode()) * 1000003);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("ResolutionInfoInternal{resolution=");
/* 10 */            sb.append(this.f12252a);
/* 15 */            sb.append(", cropRect=");
/* 20 */            sb.append(this.f12253b);
/* 25 */            sb.append(", rotationDegrees=");
/* 32 */            return fm0.m3786l(sb, this.f12254c, "}");
                }
            }
