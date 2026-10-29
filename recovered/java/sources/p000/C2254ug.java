            package p000;

            import android.view.Surface;
            
            /* JADX INFO: renamed from: ug */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2254ug extends qj2 {

                /* JADX INFO: renamed from: a */
                public final int f17513a;

                /* JADX INFO: renamed from: b */
                public final Surface f17514b;

                public C2254ug(int i, Surface surface) {
/* 4 */             this.f17513a = i;
/* 6 */             this.f17514b = surface;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 28 */                return true;
                    }
/* 6 */             if (!(obj instanceof qj2)) {
/* 30 */                return false;
                    }
/* 10 */            C2254ug c2254ug = (C2254ug) ((qj2) obj);
                    return this.f17513a == c2254ug.f17513a && this.f17514b.equals(c2254ug.f17514b);
                }

                public final int hashCode() {
/* 14 */            return this.f17514b.hashCode() ^ ((this.f17513a ^ 1000003) * 1000003);
                }

                public final String toString() {
/* 28 */            return "Result{resultCode=" + this.f17513a + ", surface=" + this.f17514b + "}";
                }
            }
