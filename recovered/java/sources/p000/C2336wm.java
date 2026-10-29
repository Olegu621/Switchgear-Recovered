            package p000;
            
            /* JADX INFO: renamed from: wm */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2336wm extends AbstractC1873l0 {

                /* JADX INFO: renamed from: v */
                public final /* synthetic */ C2466xm f18684v;

                public C2336wm(C2466xm c2466xm) {
/* 4 */             this.f18684v = c2466xm;
                }

                @Override // p000.AbstractC1873l0
                /* JADX INFO: renamed from: h */
                public final String mo6325h() {
/* 9 */             C2260um c2260um = (C2260um) this.f18684v.f19247a.get();
/* 11 */            if (c2260um == null) {
/* 13 */                return "Completer object has been garbage collected, future will fail soon";
                    }
/* 33 */            return "tag=[" + c2260um.f17590a + "]";
                }
            }
