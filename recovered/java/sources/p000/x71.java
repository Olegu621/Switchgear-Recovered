            package p000;

            import java.io.InvalidObjectException;
            import java.io.NotSerializableException;
            import java.io.ObjectInputStream;
            import java.io.Serializable;
            import java.util.AbstractList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.ConcurrentModificationException;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.RandomAccess;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
/* 18 */    public final class x71 extends AbstractC0002a0 implements RandomAccess, Serializable {

                /* JADX INFO: renamed from: a */
                public Object[] f18981a;

                /* JADX INFO: renamed from: b */
                public final int f18982b;

                /* JADX INFO: renamed from: c */
                public int f18983c;

                /* JADX INFO: renamed from: d */
                public final x71 f18984d;

                /* JADX INFO: renamed from: e */
                public final z71 f18985e;

                public x71(Object[] objArr, int i, int i2, x71 x71Var, z71 z71Var) {
/* 1 */             objArr.getClass();
/* 4 */             z71Var.getClass();
/* 10 */            this.f18981a = objArr;
/* 12 */            this.f18982b = i;
/* 14 */            this.f18983c = i2;
/* 16 */            this.f18984d = x71Var;
/* 18 */            this.f18985e = z71Var;
/* 24 */            ((AbstractList) this).modCount = ((AbstractList) z71Var).modCount;
                }

                private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
/* 8 */             throw new InvalidObjectException("Deserialization is supported via proxy only");
                }

                private final Object writeReplace() throws NotSerializableException {
/* 5 */             if (this.f18985e.f19967c) {
/* 10 */                return new ja2(0, this);
                    }
/* 21 */            throw new NotSerializableException("The list cannot be serialized while it is being built.");
                }

                @Override // p000.AbstractC0002a0
                /* JADX INFO: renamed from: a */
                public final int mo0a() {
/* 1 */             m9730f();
/* 4 */             return this.f18983c;
                }

                @Override // java.util.AbstractList, java.util.List
                public final void add(int i, Object obj) {
/* 1 */             m9731g();
/* 4 */             m9730f();
/* 7 */             C2089q c2089q = AbstractC2237u.Companion;
/* 9 */             int i2 = this.f18983c;
/* 11 */            c2089q.getClass();
/* 14 */            C2089q.m7639b(i, i2);
/* 20 */            m9729e(this.f18982b + i, obj);
                }

                @Override // java.util.AbstractList, java.util.List
                public final boolean addAll(int i, Collection collection) {
/* 1 */             collection.getClass();
/* 4 */             m9731g();
/* 7 */             m9730f();
/* 10 */            C2089q c2089q = AbstractC2237u.Companion;
/* 12 */            int i2 = this.f18983c;
/* 14 */            c2089q.getClass();
/* 17 */            C2089q.m7639b(i, i2);
/* 20 */            int size = collection.size();
/* 27 */            m9728d(this.f18982b + i, collection, size);
                    return size > 0;
                }

                @Override // p000.AbstractC0002a0
                /* JADX INFO: renamed from: b */
                public final Object mo1b(int i) {
/* 1 */             m9731g();
/* 4 */             m9730f();
/* 7 */             C2089q c2089q = AbstractC2237u.Companion;
/* 9 */             int i2 = this.f18983c;
/* 11 */            c2089q.getClass();
/* 14 */            C2089q.m7638a(i, i2);
/* 20 */            return m9732h(this.f18982b + i);
                }

                @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
                public final void clear() {
/* 1 */             m9731g();
/* 4 */             m9730f();
/* 11 */            m9733i(this.f18982b, this.f18983c);
                }

                /* JADX INFO: renamed from: d */
                public final void m9728d(int i, Collection collection, int i2) {
/* 5 */             ((AbstractList) this).modCount++;
/* 7 */             z71 z71Var = this.f18985e;
/* 9 */             x71 x71Var = this.f18984d;
/* 11 */            if (x71Var != null) {
/* 13 */                x71Var.m9728d(i, collection, i2);
                    } else {
/* 17 */                z71 z71Var2 = z71.f19964e;
/* 19 */                z71Var.m10278d(i, collection, i2);
                    }
/* 24 */            this.f18981a = z71Var.f19965a;
/* 29 */            this.f18983c += i2;
                }

                /* JADX INFO: renamed from: e */
                public final void m9729e(int i, Object obj) {
/* 5 */             ((AbstractList) this).modCount++;
/* 7 */             z71 z71Var = this.f18985e;
/* 9 */             x71 x71Var = this.f18984d;
/* 11 */            if (x71Var != null) {
/* 13 */                x71Var.m9729e(i, obj);
                    } else {
/* 17 */                z71 z71Var2 = z71.f19964e;
/* 19 */                z71Var.m10279e(i, obj);
                    }
/* 24 */            this.f18981a = z71Var.f19965a;
/* 30 */            this.f18983c++;
                }

                @Override // java.util.AbstractList, java.util.Collection, java.util.List
                public final boolean equals(Object obj) {
/* 1 */             m9730f();
/* 4 */             if (obj == this) {
/* 47 */                return true;
                    }
/* 9 */             if (obj instanceof List) {
/* 11 */                List list = (List) obj;
/* 13 */                Object[] objArr = this.f18981a;
/* 15 */                int i = this.f18983c;
/* 21 */                if (i == list.size()) {
/* 25 */                    for (int i2 = 0; i2 < i; i2++) {
/* 40 */                        if (Intrinsics.m6216a(objArr[this.f18982b + i2], list.get(i2))) {
                                }
                            }
/* 47 */                    return true;
                        }
                    }
/* 8 */             return false;
                }

                /* JADX INFO: renamed from: f */
                public final void m9730f() {
/* 9 */             if (((AbstractList) this.f18985e).modCount != ((AbstractList) this).modCount) {
/* 17 */                throw new ConcurrentModificationException();
                    }
                }

                /* JADX INFO: renamed from: g */
                public final void m9731g() {
/* 5 */             if (this.f18985e.f19967c) {
/* 8 */                 f42.m3660p();
                    }
                }

                @Override // java.util.AbstractList, java.util.List
                public final Object get(int i) {
/* 1 */             m9730f();
/* 4 */             C2089q c2089q = AbstractC2237u.Companion;
/* 6 */             int i2 = this.f18983c;
/* 8 */             c2089q.getClass();
/* 11 */            C2089q.m7638a(i, i2);
/* 19 */            return this.f18981a[this.f18982b + i];
                }

                /* JADX INFO: renamed from: h */
                public final Object m9732h(int i) {
                    Object objM10282h;
/* 5 */             ((AbstractList) this).modCount++;
/* 7 */             x71 x71Var = this.f18984d;
/* 9 */             if (x71Var != null) {
/* 11 */                objM10282h = x71Var.m9732h(i);
                    } else {
/* 16 */                z71 z71Var = z71.f19964e;
/* 20 */                objM10282h = this.f18985e.m10282h(i);
                    }
/* 28 */            this.f18983c--;
/* 30 */            return objM10282h;
                }

                @Override // java.util.AbstractList, java.util.Collection, java.util.List
                public final int hashCode() {
/* 1 */             m9730f();
/* 4 */             Object[] objArr = this.f18981a;
/* 6 */             int i = this.f18983c;
/* 8 */             int iHashCode = 1;
/* 11 */            for (int i2 = 0; i2 < i; i2++) {
/* 16 */                Object obj = objArr[this.f18982b + i2];
/* 28 */                iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
                    }
/* 32 */            return iHashCode;
                }

                /* JADX INFO: renamed from: i */
                public final void m9733i(int i, int i2) {
/* 1 */             if (i2 > 0) {
/* 7 */                 ((AbstractList) this).modCount++;
                    }
/* 9 */             x71 x71Var = this.f18984d;
/* 11 */            if (x71Var != null) {
/* 13 */                x71Var.m9733i(i, i2);
                    } else {
/* 17 */                z71 z71Var = z71.f19964e;
/* 21 */                this.f18985e.m10283i(i, i2);
                    }
/* 27 */            this.f18983c -= i2;
                }

                @Override // java.util.AbstractList, java.util.List
                public final int indexOf(Object obj) {
/* 1 */             m9730f();
/* 7 */             for (int i = 0; i < this.f18983c; i++) {
/* 20 */                if (Intrinsics.m6216a(this.f18981a[this.f18982b + i], obj)) {
/* 22 */                    return i;
                        }
                    }
/* 26 */            return -1;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final boolean isEmpty() {
/* 1 */             m9730f();
                    return this.f18983c == 0;
                }

                @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
                public final Iterator iterator() {
/* 2 */             return listIterator(0);
                }

                /* JADX INFO: renamed from: j */
                public final int m9734j(int i, int i2, Collection collection, boolean z) {
                    int iM10284j;
/* 1 */             x71 x71Var = this.f18984d;
/* 3 */             if (x71Var != null) {
/* 5 */                 iM10284j = x71Var.m9734j(i, i2, collection, z);
                    } else {
/* 10 */                z71 z71Var = z71.f19964e;
/* 14 */                iM10284j = this.f18985e.m10284j(i, i2, collection, z);
                    }
/* 18 */            if (iM10284j > 0) {
/* 24 */                ((AbstractList) this).modCount++;
                    }
/* 29 */            this.f18983c -= iM10284j;
/* 31 */            return iM10284j;
                }

                @Override // java.util.AbstractList, java.util.List
                public final int lastIndexOf(Object obj) {
/* 1 */             m9730f();
/* 8 */             for (int i = this.f18983c - 1; i >= 0; i--) {
/* 21 */                if (Intrinsics.m6216a(this.f18981a[this.f18982b + i], obj)) {
/* 23 */                    return i;
                        }
                    }
/* 27 */            return -1;
                }

                @Override // java.util.AbstractList, java.util.List
                public final ListIterator listIterator(int i) {
/* 1 */             m9730f();
/* 4 */             C2089q c2089q = AbstractC2237u.Companion;
/* 6 */             int i2 = this.f18983c;
/* 8 */             c2089q.getClass();
/* 11 */            C2089q.m7639b(i, i2);
/* 16 */            return new w71(this, i);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final boolean remove(Object obj) {
/* 1 */             m9731g();
/* 4 */             m9730f();
/* 7 */             int iIndexOf = indexOf(obj);
/* 11 */            if (iIndexOf >= 0) {
/* 13 */                mo1b(iIndexOf);
                    }
                    return iIndexOf >= 0;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final boolean removeAll(Collection collection) {
/* 1 */             collection.getClass();
/* 4 */             m9731g();
/* 7 */             m9730f();
                    return m9734j(this.f18982b, this.f18983c, collection, false) > 0;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final boolean retainAll(Collection collection) {
/* 1 */             collection.getClass();
/* 4 */             m9731g();
/* 7 */             m9730f();
                    return m9734j(this.f18982b, this.f18983c, collection, true) > 0;
                }

                @Override // java.util.AbstractList, java.util.List
                public final Object set(int i, Object obj) {
/* 1 */             m9731g();
/* 4 */             m9730f();
/* 7 */             C2089q c2089q = AbstractC2237u.Companion;
/* 9 */             int i2 = this.f18983c;
/* 11 */            c2089q.getClass();
/* 14 */            C2089q.m7638a(i, i2);
/* 17 */            Object[] objArr = this.f18981a;
/* 21 */            int i3 = this.f18982b + i;
/* 22 */            Object obj2 = objArr[i3];
/* 24 */            objArr[i3] = obj;
/* 26 */            return obj2;
                }

                @Override // java.util.AbstractList, java.util.List
                public final List subList(int i, int i2) {
/* 1 */             C2089q c2089q = AbstractC2237u.Companion;
/* 3 */             int i3 = this.f18983c;
/* 5 */             c2089q.getClass();
/* 8 */             C2089q.m7640c(i, i2, i3);
/* 24 */            return new x71(this.f18981a, this.f18982b + i, i2 - i, this, this.f18985e);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final Object[] toArray(Object[] objArr) {
/* 1 */             objArr.getClass();
/* 4 */             m9730f();
/* 7 */             int length = objArr.length;
/* 8 */             int i = this.f18983c;
/* 10 */            Object[] objArr2 = this.f18981a;
/* 12 */            int i2 = this.f18982b;
/* 14 */            if (length < i) {
/* 21 */                Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
/* 25 */                objArrCopyOfRange.getClass();
/* 28 */                return objArrCopyOfRange;
                    }
/* 31 */            C1960nd.m6965c(objArr2, 0, objArr, i2, i + i2);
/* 34 */            int i3 = this.f18983c;
/* 37 */            if (i3 < objArr.length) {
/* 40 */                objArr[i3] = null;
                    }
/* 42 */            return objArr;
                }

                @Override // java.util.AbstractCollection
                public final String toString() {
/* 1 */             m9730f();
/* 10 */            return b40.m1218b(this.f18981a, this.f18982b, this.f18983c, this);
                }

                @Override // java.util.AbstractList, java.util.List
/* 19 */        public final ListIterator listIterator() {
/* 20 */            return listIterator(0);
                }

                @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
/* 23 */        public final boolean add(Object obj) {
/* 24 */            m9731g();
/* 25 */            m9730f();
/* 26 */            m9729e(this.f18982b + this.f18983c, obj);
                    return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
/* 35 */        public final boolean addAll(Collection collection) {
                    collection.getClass();
/* 36 */            m9731g();
/* 37 */            m9730f();
/* 38 */            int size = collection.size();
/* 39 */            m9728d(this.f18982b + this.f18983c, collection, size);
                    return size > 0;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
/* 42 */        public final Object[] toArray() {
/* 43 */            m9730f();
/* 44 */            Object[] objArr = this.f18981a;
                    int i = this.f18983c;
                    int i2 = this.f18982b;
                    return C1960nd.m6967e(objArr, i2, i + i2);
                }
            }
