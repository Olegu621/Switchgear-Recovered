            package p000;

            import java.io.Serializable;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.RandomAccess;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
/* 7 */     public final class nd0 implements List, Serializable, RandomAccess, r21 {

                /* JADX INFO: renamed from: a */
                public static final nd0 f14189a = new nd0();

                private final Object readResolve() {
/* 1 */             return f14189a;
                }

                @Override // java.util.List
                public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.List
                public final boolean addAll(int i, Collection collection) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.List, java.util.Collection
                public final void clear() {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.List, java.util.Collection
                public final /* bridge */ boolean contains(Object obj) {
/* 1 */             return false;
                }

                @Override // java.util.List, java.util.Collection
                public final boolean containsAll(Collection collection) {
/* 1 */             collection.getClass();
/* 4 */             return collection.isEmpty();
                }

                @Override // java.util.List, java.util.Collection
                public final boolean equals(Object obj) {
                    return (obj instanceof List) && ((List) obj).isEmpty();
                }

                @Override // java.util.List
                public final Object get(int i) {
/* 25 */            throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i + '.');
                }

                @Override // java.util.List, java.util.Collection
                public final int hashCode() {
/* 1 */             return 1;
                }

                @Override // java.util.List
                public final /* bridge */ int indexOf(Object obj) {
/* 1 */             return -1;
                }

                @Override // java.util.List, java.util.Collection
                public final boolean isEmpty() {
/* 1 */             return true;
                }

                @Override // java.util.List, java.util.Collection, java.lang.Iterable
                public final Iterator iterator() {
/* 1 */             return md0.f13701a;
                }

                @Override // java.util.List
                public final /* bridge */ int lastIndexOf(Object obj) {
/* 1 */             return -1;
                }

                @Override // java.util.List
                public final ListIterator listIterator(int i) {
/* 1 */             if (i == 0) {
/* 3 */                 return md0.f13701a;
                    }
/* 12 */            s80.m8425f(fm0.m3781g(i, "Index: "));
/* 15 */            return null;
                }

                @Override // java.util.List
                public final /* bridge */ /* synthetic */ Object remove(int i) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.List, java.util.Collection
                public final boolean removeAll(Collection collection) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.List, java.util.Collection
                public final boolean retainAll(Collection collection) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.List
                public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.List, java.util.Collection
                public final /* bridge */ int size() {
/* 1 */             return 0;
                }

                @Override // java.util.List
                public final List subList(int i, int i2) {
/* 1 */             if (i == 0 && i2 == 0) {
/* 5 */                 return this;
                    }
/* 14 */            s80.m8425f(AbstractC0886en.m3506j("fromIndex: ", i, i2, ", toIndex: "));
/* 17 */            return null;
                }

                @Override // java.util.List, java.util.Collection
                public final Object[] toArray(Object[] objArr) {
/* 1 */             objArr.getClass();
/* 4 */             return k50.m5955I(this, objArr);
                }

                public final String toString() {
/* 1 */             return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
                }

                @Override // java.util.List, java.util.Collection
/* 8 */         public final /* bridge */ /* synthetic */ boolean add(Object obj) {
/* 9 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.List, java.util.Collection
/* 8 */         public final boolean addAll(Collection collection) {
/* 9 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.List, java.util.Collection
/* 8 */         public final boolean remove(Object obj) {
/* 9 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.List, java.util.Collection
/* 8 */         public final Object[] toArray() {
/* 9 */             return k50.m5954H(this);
                }

                @Override // java.util.List
/* 16 */        public final ListIterator listIterator() {
/* 17 */            return md0.f13701a;
                }
            }
