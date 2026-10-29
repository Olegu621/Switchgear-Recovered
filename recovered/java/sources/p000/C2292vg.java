            package p000;

            import android.graphics.Matrix;
            import android.graphics.Rect;
            
            /* JADX INFO: renamed from: vg */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2292vg {

                /* JADX INFO: renamed from: a */
                public final Rect f18046a;

                /* JADX INFO: renamed from: b */
                public final int f18047b;

                /* JADX INFO: renamed from: c */
                public final int f18048c;

                /* JADX INFO: renamed from: d */
                public final boolean f18049d;

                /* JADX INFO: renamed from: e */
                public final Matrix f18050e;

                /* JADX INFO: renamed from: f */
                public final boolean f18051f;

                public C2292vg(Rect rect, int i, int i2, boolean z, Matrix matrix, boolean z2) {
/* 5 */             if (rect == null) {
/* 30 */                C1951n4.m6868s("Null getCropRect");
/* 33 */                throw null;
                    }
/* 7 */             this.f18046a = rect;
/* 9 */             this.f18047b = i;
/* 11 */            this.f18048c = i2;
/* 13 */            this.f18049d = z;
/* 15 */            if (matrix == null) {
/* 24 */                C1951n4.m6868s("Null getSensorToBufferTransform");
/* 27 */                throw null;
                    }
/* 17 */            this.f18050e = matrix;
/* 19 */            this.f18051f = z2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof C2292vg) {
/* 10 */                C2292vg c2292vg = (C2292vg) obj;
/* 20 */                if (this.f18046a.equals(c2292vg.f18046a) && this.f18047b == c2292vg.f18047b && this.f18048c == c2292vg.f18048c && this.f18049d == c2292vg.f18049d && this.f18050e.equals(c2292vg.f18050e) && this.f18051f == c2292vg.f18051f) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 46 */            return ((((((((((this.f18046a.hashCode() ^ 1000003) * 1000003) ^ this.f18047b) * 1000003) ^ this.f18048c) * 1000003) ^ (this.f18049d ? 1231 : 1237)) * 1000003) ^ this.f18050e.hashCode()) * 1000003) ^ (this.f18051f ? 1231 : 1237);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("TransformationInfo{getCropRect=");
/* 10 */            sb.append(this.f18046a);
/* 15 */            sb.append(", getRotationDegrees=");
/* 20 */            sb.append(this.f18047b);
/* 25 */            sb.append(", getTargetRotation=");
/* 30 */            sb.append(this.f18048c);
/* 35 */            sb.append(", hasCameraTransform=");
/* 40 */            sb.append(this.f18049d);
/* 45 */            sb.append(", getSensorToBufferTransform=");
/* 50 */            sb.append(this.f18050e);
/* 55 */            sb.append(", isMirroring=");
/* 62 */            return AbstractC0886en.m3511o(sb, this.f18051f, "}");
                }
            }
