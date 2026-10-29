            package p000;

            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.RandomAccess;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
/* 60 */    public final class b52 extends AbstractC2237u implements RandomAccess {

                /* JADX INFO: renamed from: a */
                public final Object[] f2228a;

                /* JADX INFO: renamed from: b */
                public final int f2229b;

                /* JADX INFO: renamed from: c */
                public int f2230c;

                /* JADX INFO: renamed from: d */
                public int f2231d;

                public b52(Object[] objArr, int i) {
/* 4 */             this.f2228a = objArr;
/* 7 */             if (i < 0) {
/* 37 */                ds0.m3200q(fm0.m3781g(i, "ring buffer filled size should not be negative but it is "));
/* 40 */                throw null;
                    }
/* 10 */            if (i <= objArr.length) {
/* 13 */                this.f2229b = objArr.length;
/* 15 */                this.f2231d = i;
                    } else {
/* 27 */                f42.m3652h(objArr.length, fm0.m3793s(i, "ring buffer filled size: ", " cannot be larger than the buffer size: "));
/* 30 */                throw null;
                    }
                }

                /* JADX INFO: renamed from: a */
                public final void m1290a() {
/* 7 */             if (20 > size()) {
/* 69 */                throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = 20, size = " + size()).toString());
                    }
/* 9 */             int i = this.f2230c;
/* 13 */            int i2 = this.f2229b;
/* 15 */            int i3 = (i + 20) % i2;
/* 17 */            Object[] objArr = this.f2228a;
/* 19 */            if (i > i3) {
/* 21 */                Arrays.fill(objArr, i, i2, (Object) null);
/* 25 */                Arrays.fill(objArr, 0, i3, (Object) null);
                    } else {
/* 29 */                Arrays.fill(objArr, i, i3, (Object) null);
                    }
/* 32 */            this.f2230c = i3;
/* 39 */            this.f2231d = size() - 20;
                }

                @Override // java.util.List
                public final Object get(int i) {
/* 1 */             C2089q c2089q = AbstractC2237u.Companion;
/* 3 */             int size = size();
/* 7 */             c2089q.getClass();
/* 10 */            C2089q.m7638a(i, size);
/* 21 */            return this.f2228a[(this.f2230c + i) % this.f2229b];
                }

                @Override // p000.AbstractC0936g
                public final int getSize() {
/* 1 */             return this.f2231d;
                }

                @Override // p000.AbstractC2237u, java.util.Collection, java.lang.Iterable, java.util.List
                public final Iterator iterator() {
/* 3 */             return new a52(this);
                }

                @Override // p000.AbstractC0936g, java.util.Collection, java.util.List
                public final Object[] toArray(Object[] objArr) {
                    Object[] objArr2;
/* 1 */             objArr.getClass();
/* 9 */             if (objArr.length < size()) {
/* 15 */                objArr = Arrays.copyOf(objArr, size());
                    }
/* 19 */            int size = size();
/* 23 */            int i = this.f2230c;
/* 25 */            int i2 = 0;
/* 26 */            int i3 = 0;
                    while (true) {
/* 27 */                objArr2 = this.f2228a;
/* 29 */                if (i3 >= size || i >= this.f2229b) {
                            break;
                        }
/* 37 */                objArr[i3] = objArr2[i];
/* 39 */                i3++;
/* 41 */                i++;
                    }
/* 44 */            while (i3 < size) {
/* 48 */                objArr[i3] = objArr2[i2];
/* 50 */                i3++;
/* 52 */                i2++;
                    }
/* 56 */            if (size < objArr.length) {
/* 59 */                objArr[size] = null;
                    }
/* 61 */            return objArr;
                }

                @Override // p000.AbstractC0936g, java.util.Collection, java.util.List
/* 61 */        public final Object[] toArray() {
/* 62 */            return toArray(new Object[size()]);
                }
            }
