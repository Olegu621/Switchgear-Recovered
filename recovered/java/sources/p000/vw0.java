            package p000;

            import java.io.Serializable;
            import java.lang.reflect.Array;
            import java.util.AbstractCollection;
            import java.util.Arrays;
            import java.util.Collection;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 57 */    public abstract class vw0 extends AbstractCollection implements Serializable {

                /* JADX INFO: renamed from: a */
                public static final Object[] f18371a = new Object[0];

                /* JADX INFO: renamed from: a */
                public abstract int mo8149a(Object[] objArr);

                @Override // java.util.AbstractCollection, java.util.Collection
                public final boolean add(Object obj) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                public final boolean addAll(Collection collection) {
/* 6 */             throw new UnsupportedOperationException();
                }

                /* JADX INFO: renamed from: b */
                public Object[] mo8678b() {
/* 1 */             return null;
                }

                /* JADX INFO: renamed from: c */
                public int mo8679c() {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                public final void clear() {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public abstract boolean contains(Object obj);

                /* JADX INFO: renamed from: d */
                public int mo8680d() {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public abstract wx2 iterator();

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

                @Override // java.util.AbstractCollection, java.util.Collection
                public final Object[] toArray(Object[] objArr) {
/* 1 */             objArr.getClass();
/* 4 */             int size = size();
/* 9 */             if (objArr.length < size) {
/* 11 */                Object[] objArrMo8678b = mo8678b();
/* 15 */                if (objArrMo8678b != null) {
/* 29 */                    return Arrays.copyOfRange(objArrMo8678b, mo8680d(), mo8679c(), objArr.getClass());
                        }
/* 46 */                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
                    } else if (objArr.length > size) {
/* 53 */                objArr[size] = null;
                    }
/* 55 */            mo8149a(objArr);
/* 58 */            return objArr;
                }

                public Object writeReplace() {
/* 9 */             return new xw0(toArray(f18371a));
                }

                @Override // java.util.AbstractCollection, java.util.Collection
/* 58 */        public final Object[] toArray() {
/* 59 */            return toArray(f18371a);
                }
            }
