            package p000;

            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: renamed from: u */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
/* 6 */     public abstract class AbstractC2237u extends AbstractC0936g implements List {
                public static final C2089q Companion = new C2089q(null);
                private static final int maxArraySize = 2147483639;

                @Override // java.util.List
                public void add(int i, Object obj) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.List
                public boolean addAll(int i, Collection<Object> collection) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.Collection, java.util.List
                public boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof List)) {
/* 7 */                 return false;
                    }
/* 13 */            Collection collection = (Collection) obj;
/* 15 */            Companion.getClass();
/* 26 */            if (size() == collection.size()) {
/* 29 */                Iterator it = collection.iterator();
/* 33 */                Iterator<E> it2 = iterator();
/* 41 */                while (it2.hasNext()) {
/* 55 */                    if (!Intrinsics.m6216a(it2.next(), it.next())) {
                            }
                        }
/* 1 */                 return true;
                    }
/* 7 */             return false;
                }

                @Override // java.util.Collection, java.util.List
                public int hashCode() {
/* 3 */             Companion.getClass();
/* 6 */             Iterator<E> it = iterator();
/* 10 */            int iHashCode = 1;
/* 15 */            while (it.hasNext()) {
/* 17 */                Object next = it.next();
/* 31 */                iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
                    }
/* 33 */            return iHashCode;
                }

                public int indexOf(Object obj) {
/* 1 */             Iterator it = iterator();
/* 5 */             int i = 0;
/* 10 */            while (it.hasNext()) {
/* 20 */                if (Intrinsics.m6216a(it.next(), obj)) {
/* 22 */                    return i;
                        }
/* 23 */                i++;
                    }
/* 26 */            return -1;
                }

                @Override // java.util.Collection, java.lang.Iterable, java.util.List
                public Iterator<Object> iterator() {
/* 4 */             return new C2126r(this, 0);
                }

                public int lastIndexOf(Object obj) {
/* 5 */             ListIterator listIterator = listIterator(size());
/* 13 */            while (listIterator.hasPrevious()) {
/* 23 */                if (Intrinsics.m6216a(listIterator.previous(), obj)) {
/* 25 */                    return listIterator.nextIndex();
                        }
                    }
/* 30 */            return -1;
                }

                @Override // java.util.List
                public ListIterator<Object> listIterator() {
/* 4 */             return new C2163s(this, 0);
                }

                @Override // java.util.List
                public Object remove(int i) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.List
                public Object set(int i, Object obj) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                public List<Object> subList(int i, int i2) {
/* 3 */             return new C2200t(this, i, i2);
                }

                @Override // java.util.List
/* 7 */         public ListIterator<Object> listIterator(int i) {
/* 8 */             return new C2163s(this, i);
                }
            }
