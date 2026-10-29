            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class lb1 implements lh1 {

                /* JADX INFO: renamed from: a */
                public lh1[] f13171a;

                @Override // p000.lh1
                /* JADX INFO: renamed from: a */
                public final s02 mo6414a(Class cls) {
/* 5 */             for (lh1 lh1Var : this.f13171a) {
/* 13 */                if (lh1Var.mo6415b(cls)) {
/* 15 */                    return lh1Var.mo6414a(cls);
                        }
                    }
/* 33 */            C1951n4.m6866q("No factory is available for message type: ".concat(cls.getName()));
/* 36 */            return null;
                }

                @Override // p000.lh1
                /* JADX INFO: renamed from: b */
                public final boolean mo6415b(Class cls) {
/* 6 */             for (lh1 lh1Var : this.f13171a) {
/* 14 */                if (lh1Var.mo6415b(cls)) {
/* 16 */                    return true;
                        }
                    }
/* 4 */             return false;
                }
            }
