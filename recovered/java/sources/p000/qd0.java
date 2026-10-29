            package p000;

            import java.io.Serializable;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.Set;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
/* 7 */     public final class qd0 implements Set, Serializable, r21 {

                /* JADX INFO: renamed from: a */
                public static final qd0 f15493a = new qd0();

                private final Object readResolve() {
/* 1 */             return f15493a;
                }

                @Override // java.util.Set, java.util.Collection
                public final /* bridge */ /* synthetic */ boolean add(Object obj) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.Set, java.util.Collection
                public final boolean addAll(Collection collection) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.Set, java.util.Collection
                public final void clear() {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.Set, java.util.Collection
                public final /* bridge */ boolean contains(Object obj) {
/* 1 */             return false;
                }

                @Override // java.util.Set, java.util.Collection
                public final boolean containsAll(Collection collection) {
/* 1 */             collection.getClass();
/* 4 */             return collection.isEmpty();
                }

                @Override // java.util.Set, java.util.Collection
                public final boolean equals(Object obj) {
                    return (obj instanceof Set) && ((Set) obj).isEmpty();
                }

                @Override // java.util.Set, java.util.Collection
                public final int hashCode() {
/* 1 */             return 0;
                }

                @Override // java.util.Set, java.util.Collection
                public final boolean isEmpty() {
/* 1 */             return true;
                }

                @Override // java.util.Set, java.util.Collection, java.lang.Iterable
                public final Iterator iterator() {
/* 1 */             return md0.f13701a;
                }

                @Override // java.util.Set, java.util.Collection
                public final boolean remove(Object obj) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.Set, java.util.Collection
                public final boolean removeAll(Collection collection) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.Set, java.util.Collection
                public final boolean retainAll(Collection collection) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.Set, java.util.Collection
                public final /* bridge */ int size() {
/* 1 */             return 0;
                }

                @Override // java.util.Set, java.util.Collection
                public final Object[] toArray(Object[] objArr) {
/* 1 */             objArr.getClass();
/* 4 */             return k50.m5955I(this, objArr);
                }

                public final String toString() {
/* 1 */             return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
                }

                @Override // java.util.Set, java.util.Collection
/* 8 */         public final Object[] toArray() {
/* 9 */             return k50.m5954H(this);
                }
            }
