            package p000;

            import android.graphics.Matrix;
            
            /* JADX INFO: renamed from: xf */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2366xf implements gw0 {

                /* JADX INFO: renamed from: a */
                public final nm2 f19068a;

                /* JADX INFO: renamed from: b */
                public final long f19069b;

                /* JADX INFO: renamed from: c */
                public final int f19070c;

                /* JADX INFO: renamed from: d */
                public final Matrix f19071d;

                public C2366xf(nm2 nm2Var, long j, int i, Matrix matrix) {
/* 4 */             if (nm2Var == null) {
/* 17 */                C1951n4.m6868s("Null tagBundle");
/* 21 */                throw null;
                    }
/* 6 */             this.f19068a = nm2Var;
/* 8 */             this.f19069b = j;
/* 10 */            this.f19070c = i;
/* 12 */            this.f19071d = matrix;
                }

                @Override // p000.gw0
                /* JADX INFO: renamed from: a */
                public final nm2 mo4036a() {
/* 1 */             return this.f19068a;
                }

                @Override // p000.gw0
                /* JADX INFO: renamed from: b */
                public final long mo4037b() {
/* 1 */             return this.f19069b;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 44 */                return true;
                    }
/* 6 */             if (!(obj instanceof C2366xf)) {
/* 46 */                return false;
                    }
/* 8 */             C2366xf c2366xf = (C2366xf) obj;
                    return this.f19068a.equals(c2366xf.f19068a) && this.f19069b == c2366xf.f19069b && this.f19070c == c2366xf.f19070c && this.f19071d.equals(c2366xf.f19071d);
                }

                public final int hashCode() {
/* 11 */            int iHashCode = (this.f19068a.hashCode() ^ 1000003) * 1000003;
/* 14 */            long j = this.f19069b;
/* 33 */            return this.f19071d.hashCode() ^ ((((iHashCode ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.f19070c) * 1000003);
                }

                public final String toString() {
/* 48 */            return "ImmutableImageInfo{tagBundle=" + this.f19068a + ", timestamp=" + this.f19069b + ", rotationDegrees=" + this.f19070c + ", sensorToBufferTransformMatrix=" + this.f19071d + "}";
                }
            }
