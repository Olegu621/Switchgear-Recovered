            package p000;
            
            /* JADX INFO: renamed from: hf */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0989hf {

                /* JADX INFO: renamed from: a */
                public final String f9050a;

                /* JADX INFO: renamed from: b */
                public final C2329wf f9051b;

                public C0989hf(String str, C2329wf c2329wf) {
/* 5 */             if (str == null) {
/* 22 */                C1951n4.m6868s("Null cameraIdString");
/* 25 */                throw null;
                    }
/* 7 */             this.f9050a = str;
/* 9 */             if (c2329wf != null) {
/* 11 */                this.f9051b = c2329wf;
                    } else {
/* 16 */                C1951n4.m6868s("Null cameraConfigId");
/* 19 */                throw null;
                    }
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 30 */                return true;
                    }
/* 6 */             if (!(obj instanceof C0989hf)) {
/* 32 */                return false;
                    }
/* 8 */             C0989hf c0989hf = (C0989hf) obj;
                    return this.f9050a.equals(c0989hf.f9050a) && this.f9051b.equals(c0989hf.f9051b);
                }

                public final int hashCode() {
/* 18 */            return this.f9051b.hashCode() ^ ((this.f9050a.hashCode() ^ 1000003) * 1000003);
                }

                public final String toString() {
/* 28 */            return "CameraId{cameraIdString=" + this.f9050a + ", cameraConfigId=" + this.f9051b + "}";
                }
            }
