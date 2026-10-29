            package p000;

            import java.util.Collection;
            import java.util.Iterator;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: renamed from: g */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
/* 7 */     public abstract class AbstractC0936g implements Collection, r21 {
                @Override // java.util.Collection
                public boolean add(Object obj) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.Collection
                public boolean addAll(Collection<Object> collection) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.Collection
                public void clear() {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.Collection
                public boolean contains(Object obj) {
/* 6 */             if (isEmpty()) {
/* 5 */                 return false;
                    }
/* 9 */             Iterator<E> it = iterator();
/* 17 */            while (it.hasNext()) {
/* 27 */                if (Intrinsics.m6216a(it.next(), obj)) {
/* 29 */                    return true;
                        }
                    }
/* 5 */             return false;
                }

                @Override // java.util.Collection
                public boolean containsAll(Collection<?> collection) {
/* 1 */             collection.getClass();
/* 9 */             if (collection.isEmpty()) {
/* 8 */                 return true;
                    }
/* 12 */            Iterator<T> it = collection.iterator();
/* 20 */            while (it.hasNext()) {
/* 30 */                if (!contains(it.next())) {
/* 32 */                    return false;
                        }
                    }
/* 8 */             return true;
                }

                public abstract int getSize();

                @Override // java.util.Collection
                public boolean isEmpty() {
                    return size() == 0;
                }

                @Override // java.util.Collection
                public boolean remove(Object obj) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.Collection
                public boolean removeAll(Collection<?> collection) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.Collection
                public boolean retainAll(Collection<?> collection) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.Collection
                public final /* bridge */ int size() {
/* 1 */             return getSize();
                }

                @Override // java.util.Collection, java.util.List
                public <T> T[] toArray(T[] tArr) {
/* 1 */             tArr.getClass();
/* 4 */             return (T[]) k50.m5955I(this, tArr);
                }

                public String toString() {
/* 16 */            return CollectionsKt.m6203x(this, ", ", "[", "]", new C0899f(this, 0), 24);
                }

                @Override // java.util.Collection, java.util.List
/* 8 */         public Object[] toArray() {
/* 9 */             return k50.m5954H(this);
                }
            }
