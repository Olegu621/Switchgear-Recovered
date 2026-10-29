            package p000;

            import java.util.Collection;
            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class ub1 extends AbstractC0163b0 {

                /* JADX INFO: renamed from: a */
                public final sb1 f17438a;

                public ub1(sb1 sb1Var) {
/* 4 */             this.f17438a = sb1Var;
                }

                @Override // p000.AbstractC0163b0
                /* JADX INFO: renamed from: a */
                public final int mo1187a() {
/* 3 */             return this.f17438a.f16505w;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean add(Object obj) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean addAll(Collection collection) {
/* 1 */             collection.getClass();
/* 9 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final void clear() {
/* 3 */             this.f17438a.clear();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean contains(Object obj) {
/* 3 */             return this.f17438a.containsKey(obj);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean isEmpty() {
/* 3 */             return this.f17438a.isEmpty();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public final Iterator iterator() {
/* 1 */             sb1 sb1Var = this.f17438a;
/* 3 */             sb1Var.getClass();
/* 9 */             return new pb1(sb1Var, 1);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean remove(Object obj) {
/* 1 */             sb1 sb1Var = this.f17438a;
/* 3 */             sb1Var.m8462b();
/* 6 */             int iM8466f = sb1Var.m8466f(obj);
/* 10 */            if (iM8466f < 0) {
/* 12 */                return false;
                    }
/* 14 */            sb1Var.m8470j(iM8466f);
/* 17 */            return true;
                }

                @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean removeAll(Collection collection) {
/* 1 */             collection.getClass();
/* 6 */             this.f17438a.m8462b();
/* 9 */             return super.removeAll(collection);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean retainAll(Collection collection) {
/* 1 */             collection.getClass();
/* 6 */             this.f17438a.m8462b();
/* 9 */             return super.retainAll(collection);
                }
            }
