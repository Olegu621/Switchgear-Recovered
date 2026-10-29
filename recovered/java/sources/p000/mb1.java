            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class mb1 implements mh1 {

                /* JADX INFO: renamed from: a */
                public mh1[] f13679a;

                @Override // p000.mh1
                /* JADX INFO: renamed from: a */
                public final t02 mo6636a(Class cls) {
/* 5 */             for (mh1 mh1Var : this.f13679a) {
/* 13 */                if (mh1Var.mo6637b(cls)) {
/* 15 */                    return mh1Var.mo6636a(cls);
                        }
                    }
/* 33 */            C1951n4.m6866q("No factory is available for message type: ".concat(cls.getName()));
/* 36 */            return null;
                }

                @Override // p000.mh1
                /* JADX INFO: renamed from: b */
                public final boolean mo6637b(Class cls) {
/* 6 */             for (mh1 mh1Var : this.f13679a) {
/* 14 */                if (mh1Var.mo6637b(cls)) {
/* 16 */                    return true;
                        }
                    }
/* 4 */             return false;
                }
            }
