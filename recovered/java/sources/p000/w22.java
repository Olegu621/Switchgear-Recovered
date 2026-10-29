            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class w22 extends fx0 {

                /* JADX INFO: renamed from: d */
                public final transient dx0 f18421d;

                /* JADX INFO: renamed from: e */
                public final transient x22 f18422e;

                public w22(dx0 dx0Var, x22 x22Var) {
/* 4 */             this.f18421d = dx0Var;
/* 6 */             this.f18422e = x22Var;
                }

                @Override // p000.vw0
                /* JADX INFO: renamed from: a */
                public final int mo8149a(Object[] objArr) {
/* 3 */             return this.f18422e.mo8149a(objArr);
                }

                @Override // p000.vw0, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean contains(Object obj) {
                    return this.f18421d.get(obj) != null;
                }

                @Override // p000.vw0
                /* JADX INFO: renamed from: e */
                public final wx2 iterator() {
/* 4 */             return this.f18422e.listIterator(0);
                }

                @Override // p000.fx0
                /* JADX INFO: renamed from: f */
                public final zw0 mo3852f() {
                    throw null;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final int size() {
/* 5 */             return ((y22) this.f18421d).f19462f;
                }
            }
