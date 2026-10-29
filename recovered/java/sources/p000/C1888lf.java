            package p000;

            import android.hardware.camera2.CaptureRequest;
            
            /* JADX INFO: renamed from: lf */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1888lf {

                /* JADX INFO: renamed from: a */
                public final String f13218a;

                /* JADX INFO: renamed from: b */
                public final Class f13219b;

                /* JADX INFO: renamed from: c */
                public final Object f13220c;

                public C1888lf(String str, Class cls, CaptureRequest.Key key) {
/* 4 */             this.f13218a = str;
/* 6 */             if (cls == null) {
/* 15 */                C1951n4.m6868s("Null valueClass");
/* 19 */                throw null;
                    }
/* 8 */             this.f13219b = cls;
/* 10 */            this.f13220c = key;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 45 */                return true;
                    }
/* 6 */             if (!(obj instanceof C1888lf)) {
/* 47 */                return false;
                    }
/* 8 */             C1888lf c1888lf = (C1888lf) obj;
/* 18 */            if (!this.f13218a.equals(c1888lf.f13218a) || !this.f13219b.equals(c1888lf.f13219b)) {
/* 47 */                return false;
                    }
/* 30 */            Object obj2 = c1888lf.f13220c;
/* 32 */            Object obj3 = this.f13220c;
/* 34 */            if (obj3 == null) {
                        return obj2 == null;
                    }
                    return obj3.equals(obj2);
                }

                public final int hashCode() {
/* 19 */            int iHashCode = (((this.f13218a.hashCode() ^ 1000003) * 1000003) ^ this.f13219b.hashCode()) * 1000003;
/* 20 */            Object obj = this.f13220c;
/* 30 */            return (obj == null ? 0 : obj.hashCode()) ^ iHashCode;
                }

                public final String toString() {
/* 38 */            return "Option{id=" + this.f13218a + ", valueClass=" + this.f13219b + ", token=" + this.f13220c + "}";
                }
            }
