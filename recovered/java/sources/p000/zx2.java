            package p000;

            import java.util.AbstractList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.RandomAccess;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zx2 extends AbstractList implements u51, RandomAccess {

                /* JADX INFO: renamed from: a */
                public final t51 f20376a;

                public zx2(t51 t51Var) {
/* 4 */             this.f20376a = t51Var;
                }

                @Override // p000.u51
                /* JADX INFO: renamed from: C0 */
                public final void mo8695C0(AbstractC2298vl abstractC2298vl) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // p000.u51
                /* JADX INFO: renamed from: X0 */
                public final u51 mo8696X0() {
/* 1 */             return this;
                }

                @Override // p000.u51
                /* JADX INFO: renamed from: c0 */
                public final List mo8697c0() {
/* 5 */             return Collections.unmodifiableList(this.f20376a.f16924b);
                }

                @Override // java.util.AbstractList, java.util.List
                public final Object get(int i) {
/* 7 */             return (String) this.f20376a.get(i);
                }

                @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
                public final Iterator iterator() {
/* 3 */             yx2 yx2Var = new yx2();
/* 12 */            yx2Var.f19850b = this.f20376a.iterator();
/* 14 */            return yx2Var;
                }

                @Override // p000.u51
                /* JADX INFO: renamed from: j1 */
                public final Object mo8698j1(int i) {
/* 5 */             return this.f20376a.f16924b.get(i);
                }

                @Override // java.util.AbstractList, java.util.List
                public final ListIterator listIterator(int i) {
/* 3 */             xx2 xx2Var = new xx2();
/* 12 */            xx2Var.f19392b = this.f20376a.listIterator(i);
/* 14 */            return xx2Var;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
/* 3 */             return this.f20376a.size();
                }
            }
