            package p000;

            import java.util.AbstractSet;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.Set;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class vb2 extends AbstractSet {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Set f17955a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Set f17956b;

                public vb2(Set set, Set set2) {
/* 1 */             this.f17955a = set;
/* 3 */             this.f17956b = set2;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean add(Object obj) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean addAll(Collection collection) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final void clear() {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean contains(Object obj) {
                    return this.f17955a.contains(obj) || this.f17956b.contains(obj);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean isEmpty() {
                    return this.f17955a.isEmpty() && this.f17956b.isEmpty();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public final Iterator iterator() {
/* 3 */             return new ub2(this);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean remove(Object obj) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean removeAll(Collection collection) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean retainAll(Collection collection) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final int size() {
/* 1 */             Set set = this.f17955a;
/* 3 */             int size = set.size();
/* 9 */             Iterator it = this.f17956b.iterator();
/* 17 */            while (it.hasNext()) {
/* 27 */                if (!set.contains(it.next())) {
/* 29 */                    size++;
                        }
                    }
/* 32 */            return size;
                }
            }
