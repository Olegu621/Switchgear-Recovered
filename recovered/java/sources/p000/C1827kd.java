            package p000;

            import java.lang.reflect.Array;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.Set;
            
            /* JADX INFO: renamed from: kd */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 37 */    public final class C1827kd implements Collection, Set {

                /* JADX INFO: renamed from: U */
                public static int f12686U;

                /* JADX INFO: renamed from: e */
                public static final int[] f12687e = new int[0];

                /* JADX INFO: renamed from: f */
                public static final Object[] f12688f = new Object[0];

                /* JADX INFO: renamed from: i */
                public static Object[] f12689i;

                /* JADX INFO: renamed from: v */
                public static int f12690v;

                /* JADX INFO: renamed from: w */
                public static Object[] f12691w;

                /* JADX INFO: renamed from: a */
                public int[] f12692a;

                /* JADX INFO: renamed from: b */
                public Object[] f12693b;

                /* JADX INFO: renamed from: c */
                public int f12694c;

                /* JADX INFO: renamed from: d */
                public C0987hd f12695d;

                public C1827kd(int i) {
/* 4 */             if (i == 0) {
/* 8 */                 this.f12692a = f12687e;
/* 12 */                this.f12693b = f12688f;
                    } else {
/* 15 */                m6091a(i);
                    }
/* 19 */            this.f12694c = 0;
                }

                /* JADX INFO: renamed from: b */
                public static void m6090b(int[] iArr, Object[] objArr, int i) {
/* 10 */            if (iArr.length == 8) {
                        synchronized (C1827kd.class) {
                            try {
/* 17 */                        if (f12686U < 10) {
/* 21 */                            objArr[0] = f12691w;
/* 23 */                            objArr[1] = iArr;
/* 26 */                            for (int i2 = i - 1; i2 >= 2; i2--) {
/* 28 */                                objArr[i2] = null;
                                    }
/* 35 */                            f12691w = objArr;
/* 40 */                            f12686U++;
                                }
                            } catch (Throwable th) {
/* 45 */                        throw th;
                            }
                        }
/* 43 */                return;
                    }
/* 48 */            if (iArr.length == 4) {
                        synchronized (C1827kd.class) {
                            try {
/* 55 */                        if (f12690v < 10) {
/* 59 */                            objArr[0] = f12689i;
/* 61 */                            objArr[1] = iArr;
/* 64 */                            for (int i3 = i - 1; i3 >= 2; i3--) {
/* 66 */                                objArr[i3] = null;
                                    }
/* 73 */                            f12689i = objArr;
/* 78 */                            f12690v++;
                                }
                            } catch (Throwable th2) {
/* 83 */                        throw th2;
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: a */
                public final void m6091a(int i) {
/* 6 */             if (i == 8) {
                        synchronized (C1827kd.class) {
                            try {
/* 11 */                        Object[] objArr = f12691w;
/* 13 */                        if (objArr != null) {
/* 15 */                            this.f12693b = objArr;
/* 21 */                            f12691w = (Object[]) objArr[0];
/* 27 */                            this.f12692a = (int[]) objArr[1];
/* 29 */                            objArr[1] = null;
/* 31 */                            objArr[0] = null;
/* 36 */                            f12686U--;
/* 39 */                            return;
                                }
                            } catch (Throwable th) {
/* 45 */                        throw th;
                            }
                        }
                    } else if (i == 4) {
                        synchronized (C1827kd.class) {
                            try {
/* 52 */                        Object[] objArr2 = f12689i;
/* 54 */                        if (objArr2 != null) {
/* 56 */                            this.f12693b = objArr2;
/* 62 */                            f12689i = (Object[]) objArr2[0];
/* 68 */                            this.f12692a = (int[]) objArr2[1];
/* 70 */                            objArr2[1] = null;
/* 72 */                            objArr2[0] = null;
/* 77 */                            f12690v--;
/* 80 */                            return;
                                }
                            } catch (Throwable th2) {
/* 86 */                        throw th2;
                            }
                        }
                    }
/* 89 */            this.f12692a = new int[i];
/* 93 */            this.f12693b = new Object[i];
                }

                @Override // java.util.Collection, java.util.Set
                public final boolean add(Object obj) {
                    int i;
                    int iM6092c;
/* 2 */             if (obj == null) {
/* 4 */                 iM6092c = m6093d();
/* 8 */                 i = 0;
                    } else {
/* 10 */                int iHashCode = obj.hashCode();
/* 19 */                i = iHashCode;
/* 14 */                iM6092c = m6092c(iHashCode, obj);
                    }
/* 21 */            if (iM6092c >= 0) {
/* 1 */                 return false;
                    }
/* 24 */            int i2 = ~iM6092c;
/* 25 */            int i3 = this.f12694c;
/* 27 */            int[] iArr = this.f12692a;
/* 30 */            if (i3 >= iArr.length) {
/* 32 */                int i4 = 8;
/* 34 */                if (i3 >= 8) {
/* 38 */                    i4 = (i3 >> 1) + i3;
                        } else if (i3 < 4) {
/* 44 */                    i4 = 4;
                        }
/* 45 */                Object[] objArr = this.f12693b;
/* 47 */                m6091a(i4);
/* 50 */                int[] iArr2 = this.f12692a;
/* 53 */                if (iArr2.length > 0) {
/* 56 */                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
/* 62 */                    System.arraycopy(objArr, 0, this.f12693b, 0, objArr.length);
                        }
/* 67 */                m6090b(iArr, objArr, this.f12694c);
                    }
/* 70 */            int i5 = this.f12694c;
/* 72 */            if (i2 < i5) {
/* 74 */                int[] iArr3 = this.f12692a;
/* 76 */                int i6 = i2 + 1;
/* 79 */                System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
/* 82 */                Object[] objArr2 = this.f12693b;
/* 87 */                System.arraycopy(objArr2, i2, objArr2, i6, this.f12694c - i2);
                    }
/* 92 */            this.f12692a[i2] = i;
/* 96 */            this.f12693b[i2] = obj;
/* 102 */           this.f12694c++;
/* 100 */           return true;
                }

                @Override // java.util.Collection, java.util.Set
                public final boolean addAll(Collection collection) {
/* 7 */             int size = collection.size() + this.f12694c;
/* 8 */             int[] iArr = this.f12692a;
/* 11 */            boolean zAdd = false;
/* 12 */            if (iArr.length < size) {
/* 14 */                Object[] objArr = this.f12693b;
/* 16 */                m6091a(size);
/* 19 */                int i = this.f12694c;
/* 21 */                if (i > 0) {
/* 25 */                    System.arraycopy(iArr, 0, this.f12692a, 0, i);
/* 32 */                    System.arraycopy(objArr, 0, this.f12693b, 0, this.f12694c);
                        }
/* 37 */                m6090b(iArr, objArr, this.f12694c);
                    }
/* 40 */            Iterator it = collection.iterator();
/* 48 */            while (it.hasNext()) {
/* 58 */                zAdd |= add(it.next());
                    }
/* 60 */            return zAdd;
                }

                /* JADX INFO: renamed from: c */
                public final int m6092c(int i, Object obj) {
/* 1 */             int i2 = this.f12694c;
/* 3 */             if (i2 == 0) {
/* 5 */                 return -1;
                    }
/* 9 */             int iM7586I = py0.m7586I(i2, i, this.f12692a);
/* 13 */            if (iM7586I < 0 || obj.equals(this.f12693b[iM7586I])) {
/* 26 */                return iM7586I;
                    }
/* 27 */            int i3 = iM7586I + 1;
/* 29 */            while (i3 < i2 && this.f12692a[i3] == i) {
/* 45 */                if (obj.equals(this.f12693b[i3])) {
/* 47 */                    return i3;
                        }
/* 48 */                i3++;
                    }
/* 53 */            for (int i4 = iM7586I - 1; i4 >= 0 && this.f12692a[i4] == i; i4--) {
/* 69 */                if (obj.equals(this.f12693b[i4])) {
/* 71 */                    return i4;
                        }
                    }
/* 75 */            return ~i3;
                }

                @Override // java.util.Collection, java.util.Set
                public final void clear() {
/* 1 */             int i = this.f12694c;
/* 3 */             if (i != 0) {
/* 9 */                 m6090b(this.f12692a, this.f12693b, i);
/* 14 */                this.f12692a = f12687e;
/* 18 */                this.f12693b = f12688f;
/* 21 */                this.f12694c = 0;
                    }
                }

                @Override // java.util.Collection, java.util.Set
                public final boolean contains(Object obj) {
                    return (obj == null ? m6093d() : m6092c(obj.hashCode(), obj)) >= 0;
                }

                @Override // java.util.Collection, java.util.Set
                public final boolean containsAll(Collection collection) {
/* 1 */             Iterator it = collection.iterator();
/* 9 */             while (it.hasNext()) {
/* 19 */                if (!contains(it.next())) {
/* 21 */                    return false;
                        }
                    }
/* 23 */            return true;
                }

                /* JADX INFO: renamed from: d */
                public final int m6093d() {
/* 1 */             int i = this.f12694c;
/* 3 */             if (i == 0) {
/* 5 */                 return -1;
                    }
/* 10 */            int iM7586I = py0.m7586I(i, 0, this.f12692a);
/* 14 */            if (iM7586I < 0 || this.f12693b[iM7586I] == null) {
/* 23 */                return iM7586I;
                    }
/* 24 */            int i2 = iM7586I + 1;
/* 26 */            while (i2 < i && this.f12692a[i2] == 0) {
/* 38 */                if (this.f12693b[i2] == null) {
/* 40 */                    return i2;
                        }
/* 41 */                i2++;
                    }
/* 46 */            for (int i3 = iM7586I - 1; i3 >= 0 && this.f12692a[i3] == 0; i3--) {
/* 58 */                if (this.f12693b[i3] == null) {
/* 60 */                    return i3;
                        }
                    }
/* 64 */            return ~i2;
                }

                /* JADX INFO: renamed from: e */
                public final void m6094e(int i) {
/* 1 */             Object[] objArr = this.f12693b;
/* 3 */             Object obj = objArr[i];
/* 5 */             int i2 = this.f12694c;
/* 7 */             int[] iArr = this.f12692a;
/* 11 */            if (i2 <= 1) {
/* 13 */                m6090b(iArr, objArr, i2);
/* 18 */                this.f12692a = f12687e;
/* 22 */                this.f12693b = f12688f;
/* 24 */                this.f12694c = 0;
/* 26 */                return;
                    }
/* 30 */            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
/* 84 */                int i3 = i2 - 1;
/* 85 */                this.f12694c = i3;
/* 87 */                if (i < i3) {
/* 89 */                    int i4 = i + 1;
/* 92 */                    System.arraycopy(iArr, i4, iArr, i, i3 - i);
/* 95 */                    Object[] objArr2 = this.f12693b;
/* 100 */                   System.arraycopy(objArr2, i4, objArr2, i, this.f12694c - i);
                        }
/* 108 */               this.f12693b[this.f12694c] = null;
/* 110 */               return;
                    }
/* 43 */            m6091a(i2 > 8 ? i2 + (i2 >> 1) : 8);
/* 49 */            this.f12694c--;
/* 51 */            if (i > 0) {
/* 55 */                System.arraycopy(iArr, 0, this.f12692a, 0, i);
/* 60 */                System.arraycopy(objArr, 0, this.f12693b, 0, i);
                    }
/* 63 */            int i5 = this.f12694c;
/* 65 */            if (i < i5) {
/* 67 */                int i6 = i + 1;
/* 72 */                System.arraycopy(iArr, i6, this.f12692a, i, i5 - i);
/* 80 */                System.arraycopy(objArr, i6, this.f12693b, i, this.f12694c - i);
                    }
                }

                @Override // java.util.Collection, java.util.Set
                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof Set) {
/* 10 */                Set set = (Set) obj;
/* 18 */                if (this.f12694c != set.size()) {
/* 7 */                     return false;
                        }
/* 24 */                for (int i = 0; i < this.f12694c; i++) {
                            try {
/* 34 */                        if (!set.contains(this.f12693b[i])) {
/* 7 */                             return false;
                                }
                            } catch (ClassCastException | NullPointerException unused) {
                            }
                        }
/* 1 */                 return true;
                    }
/* 7 */             return false;
                }

                @Override // java.util.Collection, java.util.Set
                public final int hashCode() {
/* 1 */             int[] iArr = this.f12692a;
/* 3 */             int i = this.f12694c;
/* 6 */             int i2 = 0;
/* 7 */             for (int i3 = 0; i3 < i; i3++) {
/* 11 */                i2 += iArr[i3];
                    }
/* 15 */            return i2;
                }

                @Override // java.util.Collection, java.util.Set
                public final boolean isEmpty() {
                    return this.f12694c <= 0;
                }

                @Override // java.util.Collection, java.lang.Iterable, java.util.Set
                public final Iterator iterator() {
/* 3 */             int i = 1;
/* 4 */             if (this.f12695d == null) {
/* 11 */                this.f12695d = new C0987hd(this, i);
                    }
/* 13 */            C0987hd c0987hd = this.f12695d;
/* 19 */            if (((xb1) c0987hd.f13034b) == null) {
/* 26 */                c0987hd.f13034b = new xb1(c0987hd, i);
                    }
/* 32 */            return ((xb1) c0987hd.f13034b).iterator();
                }

                @Override // java.util.Collection, java.util.Set
                public final boolean remove(Object obj) {
/* 12 */            int iM6093d = obj == null ? m6093d() : m6092c(obj.hashCode(), obj);
/* 16 */            if (iM6093d < 0) {
/* 23 */                return false;
                    }
/* 18 */            m6094e(iM6093d);
/* 21 */            return true;
                }

                @Override // java.util.Collection, java.util.Set
                public final boolean removeAll(Collection collection) {
/* 1 */             Iterator it = collection.iterator();
/* 5 */             boolean zRemove = false;
/* 10 */            while (it.hasNext()) {
/* 20 */                zRemove |= remove(it.next());
                    }
/* 22 */            return zRemove;
                }

                @Override // java.util.Collection, java.util.Set
                public final boolean retainAll(Collection collection) {
/* 5 */             boolean z = false;
/* 6 */             for (int i = this.f12694c - 1; i >= 0; i--) {
/* 16 */                if (!collection.contains(this.f12693b[i])) {
/* 18 */                    m6094e(i);
/* 21 */                    z = true;
                        }
                    }
/* 25 */            return z;
                }

                @Override // java.util.Collection, java.util.Set
                public final int size() {
/* 1 */             return this.f12694c;
                }

                @Override // java.util.Collection, java.util.Set
                public final Object[] toArray(Object[] objArr) {
/* 4 */             if (objArr.length < this.f12694c) {
/* 20 */                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f12694c);
                    }
/* 27 */            System.arraycopy(this.f12693b, 0, objArr, 0, this.f12694c);
/* 30 */            int length = objArr.length;
/* 31 */            int i = this.f12694c;
/* 33 */            if (length > i) {
/* 36 */                objArr[i] = null;
                    }
/* 38 */            return objArr;
                }

                public final String toString() {
/* 5 */             if (isEmpty()) {
/* 7 */                 return "{}";
                    }
/* 16 */            StringBuilder sb = new StringBuilder(this.f12694c * 14);
/* 21 */            sb.append('{');
/* 27 */            for (int i = 0; i < this.f12694c; i++) {
/* 29 */                if (i > 0) {
/* 33 */                    sb.append(", ");
                        }
/* 38 */                Object obj = this.f12693b[i];
/* 40 */                if (obj != this) {
/* 42 */                    sb.append(obj);
                        } else {
/* 48 */                    sb.append("(this Set)");
                        }
                    }
/* 56 */            sb.append('}');
/* 59 */            return sb.toString();
                }

                @Override // java.util.Collection, java.util.Set
/* 38 */        public final Object[] toArray() {
/* 39 */            int i = this.f12694c;
                    Object[] objArr = new Object[i];
/* 40 */            System.arraycopy(this.f12693b, 0, objArr, 0, i);
                    return objArr;
                }
            }
