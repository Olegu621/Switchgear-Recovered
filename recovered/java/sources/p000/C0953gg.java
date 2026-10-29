            package p000;

            import android.opengl.EGLSurface;
            
            /* JADX INFO: renamed from: gg */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0953gg {

                /* JADX INFO: renamed from: a */
                public final EGLSurface f8592a;

                /* JADX INFO: renamed from: b */
                public final int f8593b;

                /* JADX INFO: renamed from: c */
                public final int f8594c;

                public C0953gg(EGLSurface eGLSurface, int i, int i2) {
/* 4 */             if (eGLSurface == null) {
/* 15 */                C1951n4.m6868s("Null eglSurface");
/* 19 */                throw null;
                    }
/* 6 */             this.f8592a = eGLSurface;
/* 8 */             this.f8593b = i;
/* 10 */            this.f8594c = i2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof C0953gg) {
/* 10 */                C0953gg c0953gg = (C0953gg) obj;
/* 20 */                if (this.f8592a.equals(c0953gg.f8592a) && this.f8593b == c0953gg.f8593b && this.f8594c == c0953gg.f8594c) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 18 */            return this.f8594c ^ ((((this.f8592a.hashCode() ^ 1000003) * 1000003) ^ this.f8593b) * 1000003);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("OutputSurface{eglSurface=");
/* 10 */            sb.append(this.f8592a);
/* 15 */            sb.append(", width=");
/* 20 */            sb.append(this.f8593b);
/* 25 */            sb.append(", height=");
/* 32 */            return fm0.m3786l(sb, this.f8594c, "}");
                }
            }
