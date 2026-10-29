            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class kd0 implements ix0 {

                /* JADX INFO: renamed from: a */
                public final boolean f12696a;

                public kd0(boolean z) {
/* 4 */             this.f12696a = z;
                }

                @Override // p000.ix0
                /* JADX INFO: renamed from: c */
                public final qn1 mo4393c() {
/* 1 */             return null;
                }

                @Override // p000.ix0
                public final boolean isActive() {
/* 1 */             return this.f12696a;
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("Empty{");
/* 17 */            sb.append(this.f12696a ? "Active" : "New");
/* 22 */            sb.append('}');
/* 25 */            return sb.toString();
                }
            }
