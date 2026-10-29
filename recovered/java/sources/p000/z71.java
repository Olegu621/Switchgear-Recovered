            package p000;

            import java.io.NotSerializableException;
            import java.io.Serializable;
            import java.util.AbstractList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.RandomAccess;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
/* 15 */    public final class z71 extends AbstractC0002a0 implements List, RandomAccess, Serializable {

                /* JADX INFO: renamed from: d */
                private static final y71 f19963d = new y71(null);

                /* JADX INFO: renamed from: e */
                public static final z71 f19964e;

                /* JADX INFO: renamed from: a */
                public Object[] f19965a;

                /* JADX INFO: renamed from: b */
                public int f19966b;

                /* JADX INFO: renamed from: c */
                public boolean f19967c;

                static {
/* 12 */            z71 z71Var = new z71(0);
/* 16 */            z71Var.f19967c = true;
/* 18 */            f19964e = z71Var;
                }

                public z71(int i) {
/* 4 */             if (i >= 0) {
/* 8 */                 this.f19965a = new Object[i];
                    } else {
/* 13 */                C1951n4.m6859j("capacity must be non-negative.");
/* 17 */                throw null;
                    }
                }

                private final Object writeReplace() throws NotSerializableException {
/* 3 */             if (this.f19967c) {
/* 8 */                 return new ja2(0, this);
                    }
/* 19 */            throw new NotSerializableException("The list cannot be serialized while it is being built.");
                }

                @Override // p000.AbstractC0002a0
                /* JADX INFO: renamed from: a */
                public final int mo0a() {
/* 1 */             return this.f19966b;
                }

                @Override // java.util.AbstractList, java.util.List
                public final void add(int i, Object obj) {
/* 1 */             m10280f();
/* 4 */             C2089q c2089q = AbstractC2237u.Companion;
/* 6 */             int i2 = this.f19966b;
/* 8 */             c2089q.getClass();
/* 11 */            C2089q.m7639b(i, i2);
/* 18 */            ((AbstractList) this).modCount++;
/* 20 */            m10281g(i, 1);
/* 25 */            this.f19965a[i] = obj;
                }

                @Override // java.util.AbstractList, java.util.List
                public final boolean addAll(int i, Collection collection) {
/* 1 */             collection.getClass();
/* 4 */             m10280f();
/* 7 */             C2089q c2089q = AbstractC2237u.Companion;
/* 9 */             int i2 = this.f19966b;
/* 11 */            c2089q.getClass();
/* 14 */            C2089q.m7639b(i, i2);
/* 17 */            int size = collection.size();
/* 21 */            m10278d(i, collection, size);
                    return size > 0;
                }

                @Override // p000.AbstractC0002a0
                /* JADX INFO: renamed from: b */
                public final Object mo1b(int i) {
/* 1 */             m10280f();
/* 4 */             C2089q c2089q = AbstractC2237u.Companion;
/* 6 */             int i2 = this.f19966b;
/* 8 */             c2089q.getClass();
/* 11 */            C2089q.m7638a(i, i2);
/* 14 */            return m10282h(i);
                }

                @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
                public final void clear() {
/* 1 */             m10280f();
/* 7 */             m10283i(0, this.f19966b);
                }

                /* JADX INFO: renamed from: d */
                public final void m10278d(int i, Collection collection, int i2) {
/* 5 */             ((AbstractList) this).modCount++;
/* 7 */             m10281g(i, i2);
/* 10 */            Iterator it = collection.iterator();
/* 15 */            for (int i3 = 0; i3 < i2; i3++) {
/* 25 */                this.f19965a[i + i3] = it.next();
                    }
                }

                /* JADX INFO: renamed from: e */
                public final void m10279e(int i, Object obj) {
/* 5 */             ((AbstractList) this).modCount++;
/* 7 */             m10281g(i, 1);
/* 12 */            this.f19965a[i] = obj;
                }

                @Override // java.util.AbstractList, java.util.Collection, java.util.List
                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 41 */                return true;
                    }
/* 6 */             if (obj instanceof List) {
/* 8 */                 List list = (List) obj;
/* 10 */                Object[] objArr = this.f19965a;
/* 12 */                int i = this.f19966b;
/* 18 */                if (i == list.size()) {
/* 22 */                    for (int i2 = 0; i2 < i; i2++) {
/* 34 */                        if (Intrinsics.m6216a(objArr[i2], list.get(i2))) {
                                }
                            }
/* 41 */                    return true;
                        }
                    }
/* 5 */             return false;
                }

                /* JADX INFO: renamed from: f */
                public final void m10280f() {
/* 3 */             if (this.f19967c) {
/* 6 */                 f42.m3660p();
                    }
                }

                /* JADX INFO: renamed from: g */
                public final void m10281g(int i, int i2) {
/* 3 */             int i3 = this.f19966b + i2;
/* 4 */             if (i3 < 0) {
/* 52 */                throw new OutOfMemoryError();
                    }
/* 6 */             Object[] objArr = this.f19965a;
/* 9 */             if (i3 > objArr.length) {
/* 11 */                C2089q c2089q = AbstractC2237u.Companion;
/* 13 */                int length = objArr.length;
/* 14 */                c2089q.getClass();
/* 17 */                int iM7641d = C2089q.m7641d(length, i3);
/* 21 */                Object[] objArr2 = this.f19965a;
/* 23 */                objArr2.getClass();
/* 30 */                this.f19965a = Arrays.copyOf(objArr2, iM7641d);
                    }
/* 32 */            Object[] objArr3 = this.f19965a;
/* 38 */            C1960nd.m6965c(objArr3, i + i2, objArr3, i, this.f19966b);
/* 44 */            this.f19966b += i2;
                }

                @Override // java.util.AbstractList, java.util.List
                public final Object get(int i) {
/* 1 */             C2089q c2089q = AbstractC2237u.Companion;
/* 3 */             int i2 = this.f19966b;
/* 5 */             c2089q.getClass();
/* 8 */             C2089q.m7638a(i, i2);
/* 13 */            return this.f19965a[i];
                }

                /* JADX INFO: renamed from: h */
                public final Object m10282h(int i) {
/* 5 */             ((AbstractList) this).modCount++;
/* 7 */             Object[] objArr = this.f19965a;
/* 9 */             Object obj = objArr[i];
/* 15 */            C1960nd.m6965c(objArr, i, objArr, i + 1, this.f19966b);
/* 18 */            Object[] objArr2 = this.f19965a;
/* 22 */            int i2 = this.f19966b - 1;
/* 24 */            objArr2.getClass();
/* 28 */            objArr2[i2] = null;
/* 34 */            this.f19966b--;
/* 36 */            return obj;
                }

                @Override // java.util.AbstractList, java.util.Collection, java.util.List
                public final int hashCode() {
/* 1 */             Object[] objArr = this.f19965a;
/* 3 */             int i = this.f19966b;
/* 5 */             int iHashCode = 1;
/* 8 */             for (int i2 = 0; i2 < i; i2++) {
/* 10 */                Object obj = objArr[i2];
/* 22 */                iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
                    }
/* 26 */            return iHashCode;
                }

                /* JADX INFO: renamed from: i */
                public final void m10283i(int i, int i2) {
/* 1 */             if (i2 > 0) {
/* 7 */                 ((AbstractList) this).modCount++;
                    }
/* 9 */             Object[] objArr = this.f19965a;
/* 15 */            C1960nd.m6965c(objArr, i, objArr, i + i2, this.f19966b);
/* 18 */            Object[] objArr2 = this.f19965a;
/* 20 */            int i3 = this.f19966b;
/* 24 */            b40.m1211B(objArr2, i3 - i2, i3);
/* 30 */            this.f19966b -= i2;
                }

                @Override // java.util.AbstractList, java.util.List
                public final int indexOf(Object obj) {
/* 4 */             for (int i = 0; i < this.f19966b; i++) {
/* 14 */                if (Intrinsics.m6216a(this.f19965a[i], obj)) {
/* 16 */                    return i;
                        }
                    }
/* 20 */            return -1;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final boolean isEmpty() {
                    return this.f19966b == 0;
                }

                @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
                public final Iterator iterator() {
/* 2 */             return listIterator(0);
                }

                /* JADX INFO: renamed from: j */
                public final int m10284j(int i, int i2, Collection collection, boolean z) {
                    Object[] objArr;
/* 1 */             int i3 = 0;
/* 2 */             int i4 = 0;
                    while (true) {
/* 3 */                 objArr = this.f19965a;
/* 5 */                 if (i3 >= i2) {
                            break;
                        }
/* 7 */                 int i5 = i + i3;
/* 15 */                if (collection.contains(objArr[i5]) == z) {
/* 17 */                    Object[] objArr2 = this.f19965a;
/* 22 */                    i3++;
/* 26 */                    objArr2[i4 + i] = objArr2[i5];
/* 19 */                    i4++;
                        } else {
/* 30 */                    i3++;
                        }
                    }
/* 33 */            int i6 = i2 - i4;
/* 39 */            C1960nd.m6965c(objArr, i + i4, objArr, i2 + i, this.f19966b);
/* 42 */            Object[] objArr3 = this.f19965a;
/* 44 */            int i7 = this.f19966b;
/* 48 */            b40.m1211B(objArr3, i7 - i6, i7);
/* 51 */            if (i6 > 0) {
/* 57 */                ((AbstractList) this).modCount++;
                    }
/* 62 */            this.f19966b -= i6;
/* 64 */            return i6;
                }

                @Override // java.util.AbstractList, java.util.List
                public final int lastIndexOf(Object obj) {
/* 5 */             for (int i = this.f19966b - 1; i >= 0; i--) {
/* 15 */                if (Intrinsics.m6216a(this.f19965a[i], obj)) {
/* 17 */                    return i;
                        }
                    }
/* 21 */            return -1;
                }

                @Override // java.util.AbstractList, java.util.List
                public final ListIterator listIterator(int i) {
/* 1 */             C2089q c2089q = AbstractC2237u.Companion;
/* 3 */             int i2 = this.f19966b;
/* 5 */             c2089q.getClass();
/* 8 */             C2089q.m7639b(i, i2);
/* 13 */            return new w71(this, i);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final boolean remove(Object obj) {
/* 1 */             m10280f();
/* 4 */             int iIndexOf = indexOf(obj);
/* 8 */             if (iIndexOf >= 0) {
/* 10 */                mo1b(iIndexOf);
                    }
                    return iIndexOf >= 0;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final boolean removeAll(Collection collection) {
/* 1 */             collection.getClass();
/* 4 */             m10280f();
                    return m10284j(0, this.f19966b, collection, false) > 0;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final boolean retainAll(Collection collection) {
/* 1 */             collection.getClass();
/* 4 */             m10280f();
                    return m10284j(0, this.f19966b, collection, true) > 0;
                }

                @Override // java.util.AbstractList, java.util.List
                public final Object set(int i, Object obj) {
/* 1 */             m10280f();
/* 4 */             C2089q c2089q = AbstractC2237u.Companion;
/* 6 */             int i2 = this.f19966b;
/* 8 */             c2089q.getClass();
/* 11 */            C2089q.m7638a(i, i2);
/* 14 */            Object[] objArr = this.f19965a;
/* 16 */            Object obj2 = objArr[i];
/* 18 */            objArr[i] = obj;
/* 20 */            return obj2;
                }

                @Override // java.util.AbstractList, java.util.List
                public final List subList(int i, int i2) {
/* 1 */             C2089q c2089q = AbstractC2237u.Companion;
/* 3 */             int i3 = this.f19966b;
/* 5 */             c2089q.getClass();
/* 8 */             C2089q.m7640c(i, i2, i3);
/* 20 */            return new x71(this.f19965a, i, i2 - i, null, this);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final Object[] toArray(Object[] objArr) {
/* 1 */             objArr.getClass();
/* 4 */             int length = objArr.length;
/* 5 */             int i = this.f19966b;
/* 7 */             Object[] objArr2 = this.f19965a;
/* 10 */            if (length < i) {
/* 16 */                Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
/* 20 */                objArrCopyOfRange.getClass();
/* 23 */                return objArrCopyOfRange;
                    }
/* 24 */            C1960nd.m6965c(objArr2, 0, objArr, 0, i);
/* 27 */            int i2 = this.f19966b;
/* 30 */            if (i2 < objArr.length) {
/* 33 */                objArr[i2] = null;
                    }
/* 35 */            return objArr;
                }

                @Override // java.util.AbstractCollection
                public final String toString() {
/* 6 */             return b40.m1218b(this.f19965a, 0, this.f19966b, this);
                }

                @Override // java.util.AbstractList, java.util.List
/* 16 */        public final ListIterator listIterator() {
/* 17 */            return listIterator(0);
                }

/* 17 */        public /* synthetic */ z71(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
/* 18 */            this((i2 & 1) != 0 ? 10 : i);
                }

/* 18 */        public z71() {
/* 19 */            this(0, 1, null);
                }

                @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
/* 27 */        public final boolean add(Object obj) {
/* 28 */            m10280f();
/* 29 */            int i = this.f19966b;
/* 30 */            ((AbstractList) this).modCount++;
/* 31 */            m10281g(i, 1);
/* 32 */            this.f19965a[i] = obj;
                    return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
/* 29 */        public final boolean addAll(Collection collection) {
                    collection.getClass();
/* 30 */            m10280f();
/* 31 */            int size = collection.size();
/* 32 */            m10278d(this.f19966b, collection, size);
                    return size > 0;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
/* 35 */        public final Object[] toArray() {
/* 36 */            return C1960nd.m6967e(this.f19965a, 0, this.f19966b);
                }
            }
