            package kotlinx.serialization.json;

            import java.util.Collection;
            import java.util.Comparator;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.function.UnaryOperator;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.internal.Intrinsics;
            import p000.k50;
            import p000.r21;
            
            /* JADX INFO: renamed from: kotlinx.serialization.json.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
/* 6 */     public final class C1857a extends AbstractC1858b implements List, r21 {
                public static final JsonArray$Companion Companion = new JsonArray$Companion();

                /* JADX INFO: renamed from: a */
                public final List f12963a;

                public C1857a(List list) {
/* 1 */             list.getClass();
/* 7 */             this.f12963a = list;
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
                public final boolean contains(Object obj) {
/* 3 */             if (!(obj instanceof AbstractC1858b)) {
/* 5 */                 return false;
                    }
/* 11 */            return this.f12963a.contains((AbstractC1858b) obj);
                }

                @Override // java.util.List, java.util.Collection
                public final boolean containsAll(Collection collection) {
/* 1 */             collection.getClass();
/* 6 */             return this.f12963a.containsAll(collection);
                }

                @Override // java.util.List, java.util.Collection
                public final boolean equals(Object obj) {
/* 3 */             return Intrinsics.m6216a(this.f12963a, obj);
                }

                @Override // java.util.List
                public final Object get(int i) {
/* 7 */             return (AbstractC1858b) this.f12963a.get(i);
                }

                @Override // java.util.List, java.util.Collection
                public final int hashCode() {
/* 3 */             return this.f12963a.hashCode();
                }

                @Override // java.util.List
                public final int indexOf(Object obj) {
/* 3 */             if (!(obj instanceof AbstractC1858b)) {
/* 5 */                 return -1;
                    }
/* 11 */            return this.f12963a.indexOf((AbstractC1858b) obj);
                }

                @Override // java.util.List, java.util.Collection
                public final boolean isEmpty() {
/* 3 */             return this.f12963a.isEmpty();
                }

                @Override // java.util.List, java.util.Collection, java.lang.Iterable
                public final Iterator iterator() {
/* 3 */             return this.f12963a.iterator();
                }

                @Override // java.util.List
                public final int lastIndexOf(Object obj) {
/* 3 */             if (!(obj instanceof AbstractC1858b)) {
/* 5 */                 return -1;
                    }
/* 11 */            return this.f12963a.lastIndexOf((AbstractC1858b) obj);
                }

                @Override // java.util.List
                public final ListIterator listIterator() {
/* 3 */             return this.f12963a.listIterator();
                }

                @Override // java.util.List
                public final /* bridge */ /* synthetic */ Object remove(int i) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.List, java.util.Collection
                public final boolean removeAll(Collection collection) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.List
                public final void replaceAll(UnaryOperator unaryOperator) {
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
                public final int size() {
/* 3 */             return this.f12963a.size();
                }

                @Override // java.util.List
                public final void sort(Comparator comparator) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.List
                public final List subList(int i, int i2) {
/* 3 */             return this.f12963a.subList(i, i2);
                }

                @Override // java.util.List, java.util.Collection
                public final Object[] toArray(Object[] objArr) {
/* 1 */             objArr.getClass();
/* 4 */             return k50.m5955I(this, objArr);
                }

                public final String toString() {
/* 12 */            return CollectionsKt.m6203x(this.f12963a, ",", "[", "]", null, 56);
                }

                @Override // java.util.List
/* 7 */         public final ListIterator listIterator(int i) {
/* 8 */             return this.f12963a.listIterator(i);
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
            }
