            package p000;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.RandomAccess;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class fa3 extends ca3 implements List, RandomAccess {

                /* JADX INFO: renamed from: b */
                public static final da3 f8056b = new da3(ha3.f8990d, 0);

                @Override // p000.ca3
                /* JADX INFO: renamed from: a */
                public int mo1561a(Object[] objArr) {
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

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final boolean contains(Object obj) {
                    return indexOf(obj) >= 0;
                }

                @Override // java.util.List
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public fa3 subList(int i, int i2) {
/* 5 */             i13.m4430g(i, i2, size());
/* 8 */             int i3 = i2 - i;
/* 13 */            if (i3 == size()) {
/* 15 */                return this;
                    }
                    return i3 == 0 ? ha3.f8990d : new ea3(this, i, i3);
                }

                @Override // java.util.Collection, java.util.List
                public final boolean equals(Object obj) {
                    Object next;
                    Object next2;
/* 1 */             if (obj == this) {
/* 97 */                return true;
                    }
/* 7 */             if (obj instanceof List) {
/* 10 */                List list = (List) obj;
/* 12 */                int size = size();
/* 20 */                if (size == list.size()) {
/* 25 */                    if (list instanceof RandomAccess) {
/* 28 */                        for (int i = 0; i < size; i++) {
/* 30 */                            Object obj2 = get(i);
/* 34 */                            Object obj3 = list.get(i);
/* 38 */                            if (obj2 == obj3 || (obj2 != null && obj2.equals(obj3))) {
                                    }
                                }
/* 97 */                        return true;
                            }
/* 51 */                    da3 da3VarListIterator = listIterator(0);
/* 55 */                    Iterator it = list.iterator();
/* 63 */                    while (da3VarListIterator.hasNext()) {
/* 69 */                        if (it.hasNext() && ((next = da3VarListIterator.next()) == (next2 = it.next()) || (next != null && next.equals(next2)))) {
                                }
                            }
/* 95 */                    if (!it.hasNext()) {
/* 97 */                        return true;
                            }
                        }
                    }
/* 6 */             return false;
                }

                @Override // java.util.List
                /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
                public final da3 listIterator(int i) {
/* 1 */             int size = size();
/* 5 */             if (i >= 0 && i <= size) {
                        return isEmpty() ? f8056b : new da3(this, i);
                    }
/* 30 */            s80.m8425f(i13.m4434k(i, size, FirebaseAnalytics.Param.INDEX));
/* 33 */            return null;
                }

                @Override // java.util.Collection, java.util.List
                public final int hashCode() {
/* 1 */             int size = size();
/* 6 */             int iHashCode = 1;
/* 7 */             for (int i = 0; i < size; i++) {
/* 19 */                iHashCode = (iHashCode * 31) + get(i).hashCode();
                    }
/* 23 */            return iHashCode;
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

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
                public final /* synthetic */ Iterator iterator() {
/* 2 */             return listIterator(0);
                }

                @Override // java.util.List
                public final int lastIndexOf(Object obj) {
/* 2 */             if (obj == null) {
/* 1 */                 return -1;
                    }
/* 10 */            for (int size = size() - 1; size >= 0; size--) {
/* 20 */                if (obj.equals(get(size))) {
/* 22 */                    return size;
                        }
                    }
/* 1 */             return -1;
                }

                @Override // java.util.List
                public final /* synthetic */ ListIterator listIterator() {
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
            }
