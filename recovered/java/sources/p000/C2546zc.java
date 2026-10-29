            package p000;

            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Iterator;
            
            /* JADX INFO: renamed from: zc */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 30 */    public final class C2546zc implements Collection, r21 {

                /* JADX INFO: renamed from: a */
                public final Object[] f20066a;

                /* JADX INFO: renamed from: b */
                public final boolean f20067b;

                public C2546zc(Object[] objArr, boolean z) {
/* 1 */             objArr.getClass();
/* 7 */             this.f20066a = objArr;
/* 9 */             this.f20067b = z;
                }

                @Override // java.util.Collection
                public final boolean add(Object obj) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.Collection
                public final boolean addAll(Collection collection) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.Collection
                public final void clear() {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.Collection
                public final boolean contains(Object obj) {
/* 3 */             return C2103qd.m7772g(this.f20066a, obj);
                }

                @Override // java.util.Collection
                public final boolean containsAll(Collection collection) {
/* 1 */             collection.getClass();
/* 9 */             if (collection.isEmpty()) {
/* 8 */                 return true;
                    }
/* 12 */            Iterator it = collection.iterator();
/* 20 */            while (it.hasNext()) {
/* 32 */                if (!C2103qd.m7772g(this.f20066a, it.next())) {
/* 34 */                    return false;
                        }
                    }
/* 8 */             return true;
                }

                @Override // java.util.Collection
                public final boolean isEmpty() {
                    return this.f20066a.length == 0;
                }

                @Override // java.util.Collection, java.lang.Iterable
                public final Iterator iterator() {
/* 1 */             Object[] objArr = this.f20066a;
/* 3 */             objArr.getClass();
/* 8 */             return new C2126r(objArr);
                }

                @Override // java.util.Collection
                public final boolean remove(Object obj) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.Collection
                public final boolean removeAll(Collection collection) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.Collection
                public final boolean retainAll(Collection collection) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.Collection
                public final int size() {
/* 3 */             return this.f20066a.length;
                }

                @Override // java.util.Collection
                public final Object[] toArray() {
/* 1 */             Object[] objArr = this.f20066a;
/* 3 */             objArr.getClass();
/* 10 */            if (this.f20067b && objArr.getClass().equals(Object[].class)) {
/* 22 */                return objArr;
                    }
/* 24 */            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
/* 28 */            objArrCopyOf.getClass();
/* 31 */            return objArrCopyOf;
                }

                @Override // java.util.Collection
/* 31 */        public final Object[] toArray(Object[] objArr) {
/* 32 */            objArr.getClass();
                    return k50.m5955I(this, objArr);
                }
            }
