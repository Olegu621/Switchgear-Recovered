            package p000;

            import java.io.Serializable;
            import java.util.AbstractCollection;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Spliterator;
            import java.util.Spliterators;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 53 */    public abstract class ca3 extends AbstractCollection implements Serializable {

                /* JADX INFO: renamed from: a */
                public static final Object[] f2799a = new Object[0];

                /* JADX INFO: renamed from: a */
                public abstract int mo1561a(Object[] objArr);

                @Override // java.util.AbstractCollection, java.util.Collection
                public final boolean add(Object obj) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                public final boolean addAll(Collection collection) {
/* 6 */             throw new UnsupportedOperationException();
                }

                /* JADX INFO: renamed from: b */
                public abstract int mo1562b();

                /* JADX INFO: renamed from: c */
                public abstract int mo1563c();

                @Override // java.util.AbstractCollection, java.util.Collection
                public final void clear() {
/* 6 */             throw new UnsupportedOperationException();
                }

                /* JADX INFO: renamed from: d */
                public abstract Object[] mo1564d();

                @Override // java.util.AbstractCollection, java.util.Collection
                public final boolean remove(Object obj) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                public final boolean removeAll(Collection collection) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                public final boolean retainAll(Collection collection) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.Collection, java.lang.Iterable
                public final Spliterator spliterator() {
/* 3 */             return Spliterators.spliterator(this, 1296);
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                public final Object[] toArray(Object[] objArr) {
/* 1 */             objArr.getClass();
/* 4 */             int size = size();
/* 8 */             int length = objArr.length;
/* 9 */             if (length < size) {
/* 11 */                Object[] objArrMo1564d = mo1564d();
/* 15 */                if (objArrMo1564d != null) {
/* 41 */                    return Arrays.copyOfRange(objArrMo1564d, mo1563c(), mo1562b(), objArr.getClass());
                        }
/* 17 */                if (length != 0) {
/* 20 */                    objArr = Arrays.copyOf(objArr, 0);
                        }
/* 24 */                objArr = Arrays.copyOf(objArr, size);
                    } else if (length > size) {
/* 49 */                objArr[size] = null;
                    }
/* 51 */            mo1561a(objArr);
/* 54 */            return objArr;
                }

                @Override // java.util.AbstractCollection, java.util.Collection
/* 54 */        public final Object[] toArray() {
/* 55 */            return toArray(f2799a);
                }
            }
