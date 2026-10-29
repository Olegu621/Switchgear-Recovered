            package p000;

            import java.util.AbstractList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.List;
            import java.util.RandomAccess;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 7 */     public final class ez1 extends AbstractList implements RandomAccess, dz0 {

                /* JADX INFO: renamed from: d */
                public static final ez1 f7925d = new ez1(new Object[0], 0, false);

                /* JADX INFO: renamed from: a */
                public boolean f7926a;

                /* JADX INFO: renamed from: b */
                public Object[] f7927b;

                /* JADX INFO: renamed from: c */
                public int f7928c;

                public ez1(Object[] objArr, int i, boolean z) {
/* 4 */             this.f7926a = z;
/* 6 */             this.f7927b = objArr;
/* 8 */             this.f7928c = i;
                }

                /* JADX INFO: renamed from: a */
                public final void m3616a(int i) {
/* 1 */             if (i < 0 || i >= this.f7928c) {
/* 14 */                StringBuilder sbM3793s = fm0.m3793s(i, "Index:", ", Size:");
/* 20 */                sbM3793s.append(this.f7928c);
/* 30 */                throw new IndexOutOfBoundsException(sbM3793s.toString());
                    }
                }

                @Override // java.util.AbstractList, java.util.List
                public final void add(int i, Object obj) {
                    int i2;
/* 1 */             m3617b();
/* 4 */             if (i < 0 || i > (i2 = this.f7928c)) {
/* 68 */                StringBuilder sbM3793s = fm0.m3793s(i, "Index:", ", Size:");
/* 74 */                sbM3793s.append(this.f7928c);
/* 84 */                throw new IndexOutOfBoundsException(sbM3793s.toString());
                    }
/* 10 */            Object[] objArr = this.f7927b;
/* 14 */            if (i2 < objArr.length) {
/* 19 */                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
                    } else {
/* 29 */                Object[] objArr2 = new Object[fm0.m3797w(i2, 3, 2, 1)];
/* 32 */                System.arraycopy(objArr, 0, objArr2, 0, i);
/* 42 */                System.arraycopy(this.f7927b, i, objArr2, i + 1, this.f7928c - i);
/* 45 */                this.f7927b = objArr2;
                    }
/* 49 */            this.f7927b[i] = obj;
/* 54 */            this.f7928c++;
/* 59 */            ((AbstractList) this).modCount++;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final boolean addAll(Collection collection) {
/* 1 */             m3617b();
/* 4 */             return super.addAll(collection);
                }

                /* JADX INFO: renamed from: b */
                public final void m3617b() {
/* 3 */             if (this.f7926a) {
/* 5 */                 return;
                    }
/* 6 */             f42.m3660p();
                }

                /* JADX INFO: renamed from: c */
                public final ez1 m3618c(int i) {
/* 3 */             if (i >= this.f7928c) {
/* 16 */                return new ez1(Arrays.copyOf(this.f7927b, i), this.f7928c, true);
                    }
/* 20 */            f42.m3649e();
/* 23 */            return null;
                }

                @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
                public final void clear() {
/* 1 */             m3617b();
/* 4 */             super.clear();
                }

                @Override // java.util.AbstractList, java.util.Collection, java.util.List
                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof List)) {
/* 7 */                 return false;
                    }
/* 13 */            if (!(obj instanceof RandomAccess)) {
/* 15 */                return super.equals(obj);
                    }
/* 20 */            List list = (List) obj;
/* 22 */            int size = size();
/* 30 */            if (size != list.size()) {
/* 7 */                 return false;
                    }
/* 34 */            for (int i = 0; i < size; i++) {
/* 48 */                if (!get(i).equals(list.get(i))) {
/* 7 */                     return false;
                        }
                    }
/* 1 */             return true;
                }

                @Override // java.util.AbstractList, java.util.List
                public final Object get(int i) {
/* 1 */             m3616a(i);
/* 6 */             return this.f7927b[i];
                }

                @Override // java.util.AbstractList, java.util.Collection, java.util.List
                public final int hashCode() {
/* 1 */             int size = size();
/* 5 */             int iHashCode = 1;
/* 7 */             for (int i = 0; i < size; i++) {
/* 19 */                iHashCode = (iHashCode * 31) + get(i).hashCode();
                    }
/* 23 */            return iHashCode;
                }

                @Override // java.util.AbstractList, java.util.List
                public final Object remove(int i) {
/* 1 */             m3617b();
/* 4 */             m3616a(i);
/* 7 */             Object[] objArr = this.f7927b;
/* 9 */             Object obj = objArr[i];
/* 11 */            int i2 = this.f7928c;
/* 15 */            if (i < i2 - 1) {
/* 22 */                System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
                    }
/* 29 */            this.f7928c--;
/* 35 */            ((AbstractList) this).modCount++;
/* 37 */            return obj;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final boolean removeAll(Collection collection) {
/* 1 */             m3617b();
/* 4 */             return super.removeAll(collection);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final boolean retainAll(Collection collection) {
/* 1 */             m3617b();
/* 4 */             return super.retainAll(collection);
                }

                @Override // java.util.AbstractList, java.util.List
                public final Object set(int i, Object obj) {
/* 1 */             m3617b();
/* 4 */             m3616a(i);
/* 7 */             Object[] objArr = this.f7927b;
/* 9 */             Object obj2 = objArr[i];
/* 11 */            objArr[i] = obj;
/* 17 */            ((AbstractList) this).modCount++;
/* 19 */            return obj2;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
/* 1 */             return this.f7928c;
                }

                @Override // java.util.AbstractList, java.util.List
/* 8 */         public final boolean addAll(int i, Collection collection) {
/* 9 */             m3617b();
/* 10 */            return super.addAll(i, collection);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
/* 37 */        public final boolean remove(Object obj) {
/* 38 */            m3617b();
/* 39 */            int iIndexOf = indexOf(obj);
                    if (iIndexOf == -1) {
                        return false;
                    }
/* 40 */            remove(iIndexOf);
                    return true;
                }

                @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
/* 84 */        public final boolean add(Object obj) {
/* 85 */            m3617b();
/* 86 */            int i = this.f7928c;
                    Object[] objArr = this.f7927b;
                    if (i == objArr.length) {
/* 89 */                this.f7927b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
                    }
/* 90 */            Object[] objArr2 = this.f7927b;
                    int i2 = this.f7928c;
                    this.f7928c = i2 + 1;
                    objArr2[i2] = obj;
/* 91 */            ((AbstractList) this).modCount++;
                    return true;
                }
            }
