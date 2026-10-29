            package p000;

            import java.io.InvalidObjectException;
            import java.io.ObjectInputStream;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.RandomAccess;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zw0 extends vw0 implements List, RandomAccess {

                /* JADX INFO: renamed from: b */
                public static final ww0 f20360b = new ww0(t22.f16899e, 0);

                /* JADX INFO: renamed from: f */
                public static t22 m10447f(int i, Object[] objArr) {
                    return i == 0 ? t22.f16899e : new t22(objArr, i);
                }

                private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
/* 8 */             throw new InvalidObjectException("Use SerializedForm");
                }

                @Override // p000.vw0
                /* JADX INFO: renamed from: a */
                public int mo8149a(Object[] objArr) {
/* 1 */             int size = size();
/* 6 */             for (int i = 0; i < size; i++) {
/* 12 */                objArr[i] = get(i);
                    }
/* 17 */            return size;
                }

                @Override // java.util.List
                public final void add(int i, Object obj) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.List
                public final boolean addAll(int i, Collection collection) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // p000.vw0, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean contains(Object obj) {
                    return indexOf(obj) >= 0;
                }

                @Override // p000.vw0
                /* JADX INFO: renamed from: e */
                public final wx2 iterator() {
/* 2 */             return listIterator(0);
                }

                @Override // java.util.Collection, java.util.List
                public final boolean equals(Object obj) {
/* 2 */             if (obj != this) {
/* 8 */                 if (obj instanceof List) {
/* 11 */                    List list = (List) obj;
/* 13 */                    int size = size();
/* 21 */                    if (size == list.size()) {
/* 26 */                        if (!(list instanceof RandomAccess)) {
/* 59 */                            Iterator it = list.iterator();
/* 67 */                            for (Object obj2 : this) {
/* 73 */                                if (it.hasNext()) {
/* 80 */                                    Object next = it.next();
/* 84 */                                    if (obj2 != next && (obj2 == null || !obj2.equals(next))) {
/* 7 */                                         return false;
                                            }
                                        }
                                    }
/* 100 */                           return !it.hasNext();
                                }
/* 29 */                        for (int i = 0; i < size; i++) {
/* 31 */                            Object obj3 = get(i);
/* 35 */                            Object obj4 = list.get(i);
/* 39 */                            if (obj3 != obj4 && (obj3 == null || !obj3.equals(obj4))) {
/* 7 */                                 return false;
                                    }
                                }
                            }
                        }
/* 7 */                 return false;
                    }
/* 1 */             return true;
                }

                @Override // java.util.List
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public final ww0 listIterator(int i) {
/* 5 */             yy1.m10215j(i, size());
                    return isEmpty() ? f20360b : new ww0(this, i);
                }

                @Override // java.util.List
                /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
                public zw0 subList(int i, int i2) {
/* 5 */             yy1.m10216k(i, i2, size());
/* 8 */             int i3 = i2 - i;
/* 13 */            if (i3 == size()) {
/* 15 */                return this;
                    }
                    return i3 == 0 ? t22.f16899e : new yw0(this, i, i3);
                }

                @Override // java.util.Collection, java.util.List
                public final int hashCode() {
/* 1 */             int size = size();
/* 5 */             int i = 1;
/* 7 */             for (int i2 = 0; i2 < size; i2++) {
/* 21 */                i = ~(~(get(i2).hashCode() + (i * 31)));
                    }
/* 25 */            return i;
                }

                @Override // java.util.List
                public final int indexOf(Object obj) {
/* 2 */             if (obj == null) {
/* 1 */                 return -1;
                    }
/* 5 */             int size = size();
/* 10 */            for (int i = 0; i < size; i++) {
/* 20 */                if (obj.equals(get(i))) {
/* 22 */                    return i;
                        }
                    }
/* 1 */             return -1;
                }

                @Override // p000.vw0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
                public Iterator iterator() {
/* 2 */             return listIterator(0);
                }

                @Override // java.util.List
                public final int lastIndexOf(Object obj) {
/* 2 */             if (obj == null) {
/* 1 */                 return -1;
                    }
/* 11 */            for (int size = size() - 1; size >= 0; size--) {
/* 21 */                if (obj.equals(get(size))) {
/* 23 */                    return size;
                        }
                    }
/* 1 */             return -1;
                }

                public ListIterator listIterator() {
/* 2 */             return listIterator(0);
                }

                @Override // java.util.List
                public final Object remove(int i) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.List
                public final Object set(int i, Object obj) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // p000.vw0
                public Object writeReplace() {
/* 9 */             return new xw0(toArray(vw0.f18371a));
                }
            }
