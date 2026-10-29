            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class uu2 {
                public static final tu2 Companion = new tu2();

                /* JADX INFO: renamed from: a */
                public final float f17725a;

                /* JADX INFO: renamed from: b */
                public final float f17726b;

                /* JADX INFO: renamed from: c */
                public final float f17727c;

                /* JADX INFO: renamed from: d */
                public final float f17728d;

                public uu2(float f, float f2, float f3, float f4) {
/* 4 */             this.f17725a = f;
/* 6 */             this.f17726b = f2;
/* 8 */             this.f17727c = f3;
/* 10 */            this.f17728d = f4;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof uu2)) {
/* 7 */                 return false;
                    }
/* 11 */            uu2 uu2Var = (uu2) obj;
                    return Float.compare(this.f17725a, uu2Var.f17725a) == 0 && Float.compare(this.f17726b, uu2Var.f17726b) == 0 && Float.compare(this.f17727c, uu2Var.f17727c) == 0 && Float.compare(this.f17728d, uu2Var.f17728d) == 0;
                }

                public final int hashCode() {
/* 33 */            return Float.hashCode(this.f17728d) + ((Float.hashCode(this.f17727c) + ((Float.hashCode(this.f17726b) + (Float.hashCode(this.f17725a) * 31)) * 31)) * 31);
                }

                public final String toString() {
/* 48 */            return "UCFontSize(title=" + this.f17725a + ", body=" + this.f17726b + ", small=" + this.f17727c + ", tiny=" + this.f17728d + ")";
                }
            }
