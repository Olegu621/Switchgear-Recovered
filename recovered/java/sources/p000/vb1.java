            package p000;

            import java.util.Collection;
            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class vb1 extends AbstractC2517z {

                /* JADX INFO: renamed from: a */
                public final sb1 f17954a;

                public vb1(sb1 sb1Var) {
/* 4 */             this.f17954a = sb1Var;
                }

                @Override // p000.AbstractC2517z
                /* JADX INFO: renamed from: a */
                public final int mo9243a() {
/* 3 */             return this.f17954a.f16505w;
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                public final boolean add(Object obj) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                public final boolean addAll(Collection collection) {
/* 1 */             collection.getClass();
/* 9 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                public final void clear() {
/* 3 */             this.f17954a.clear();
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                public final boolean contains(Object obj) {
/* 3 */             return this.f17954a.containsValue(obj);
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                public final boolean isEmpty() {
/* 3 */             return this.f17954a.isEmpty();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
                public final Iterator iterator() {
/* 1 */             sb1 sb1Var = this.f17954a;
/* 3 */             sb1Var.getClass();
/* 9 */             return new pb1(sb1Var, 2);
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                public final boolean remove(Object obj) {
/* 1 */             sb1 sb1Var = this.f17954a;
/* 3 */             sb1Var.m8462b();
/* 6 */             int iM8467g = sb1Var.m8467g(obj);
/* 10 */            if (iM8467g < 0) {
/* 12 */                return false;
                    }
/* 14 */            sb1Var.m8470j(iM8467g);
/* 17 */            return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                public final boolean removeAll(Collection collection) {
/* 1 */             collection.getClass();
/* 6 */             this.f17954a.m8462b();
/* 9 */             return super.removeAll(collection);
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                public final boolean retainAll(Collection collection) {
/* 1 */             collection.getClass();
/* 6 */             this.f17954a.m8462b();
/* 9 */             return super.retainAll(collection);
                }
            }
