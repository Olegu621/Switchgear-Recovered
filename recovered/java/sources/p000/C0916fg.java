            package p000;

            import android.graphics.Rect;
            import android.util.Size;
            import java.util.UUID;
            
            /* JADX INFO: renamed from: fg */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0916fg {

                /* JADX INFO: renamed from: a */
                public final UUID f8192a;

                /* JADX INFO: renamed from: b */
                public final int f8193b;

                /* JADX INFO: renamed from: c */
                public final int f8194c;

                /* JADX INFO: renamed from: d */
                public final Rect f8195d;

                /* JADX INFO: renamed from: e */
                public final Size f8196e;

                /* JADX INFO: renamed from: f */
                public final int f8197f;

                /* JADX INFO: renamed from: g */
                public final boolean f8198g;

                public C0916fg(UUID uuid, int i, int i2, Rect rect, Size size, int i3, boolean z) {
/* 5 */             if (uuid == null) {
/* 40 */                C1951n4.m6868s("Null getUuid");
/* 43 */                throw null;
                    }
/* 7 */             this.f8192a = uuid;
/* 9 */             this.f8193b = i;
/* 11 */            this.f8194c = i2;
/* 13 */            if (rect == null) {
/* 34 */                C1951n4.m6868s("Null getCropRect");
/* 37 */                throw null;
                    }
/* 15 */            this.f8195d = rect;
/* 17 */            if (size == null) {
/* 28 */                C1951n4.m6868s("Null getSize");
/* 31 */                throw null;
                    }
/* 19 */            this.f8196e = size;
/* 21 */            this.f8197f = i3;
/* 23 */            this.f8198g = z;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 7 */             if (!(obj instanceof C0916fg)) {
/* 66 */                return false;
                    }
/* 9 */             C0916fg c0916fg = (C0916fg) obj;
                    return this.f8192a.equals(c0916fg.f8192a) && this.f8193b == c0916fg.f8193b && this.f8194c == c0916fg.f8194c && this.f8195d.equals(c0916fg.f8195d) && this.f8196e.equals(c0916fg.f8196e) && this.f8197f == c0916fg.f8197f && this.f8198g == c0916fg.f8198g;
                }

                public final int hashCode() {
/* 52 */            return (((this.f8198g ? 1231 : 1237) ^ ((((((((((((this.f8192a.hashCode() ^ 1000003) * 1000003) ^ this.f8193b) * 1000003) ^ this.f8194c) * 1000003) ^ this.f8195d.hashCode()) * 1000003) ^ this.f8196e.hashCode()) * 1000003) ^ this.f8197f) * 1000003)) * 1000003) ^ 1237;
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("OutConfig{getUuid=");
/* 10 */            sb.append(this.f8192a);
/* 15 */            sb.append(", getTargets=");
/* 20 */            sb.append(this.f8193b);
/* 25 */            sb.append(", getFormat=");
/* 30 */            sb.append(this.f8194c);
/* 35 */            sb.append(", getCropRect=");
/* 40 */            sb.append(this.f8195d);
/* 45 */            sb.append(", getSize=");
/* 50 */            sb.append(this.f8196e);
/* 55 */            sb.append(", getRotationDegrees=");
/* 60 */            sb.append(this.f8197f);
/* 65 */            sb.append(", isMirroring=");
/* 72 */            return AbstractC0886en.m3511o(sb, this.f8198g, ", shouldRespectInputCropRect=false}");
                }
            }
