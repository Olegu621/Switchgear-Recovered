            package p000;

            import java.util.AbstractList;
            import java.util.Arrays;
            import java.util.RandomAccess;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 83 */    public final class dz1 extends AbstractC0827d0 implements RandomAccess {

                /* JADX INFO: renamed from: d */
                public static final dz1 f7454d;

                /* JADX INFO: renamed from: b */
                public Object[] f7455b;

                /* JADX INFO: renamed from: c */
                public int f7456c;

                static {
/* 6 */             dz1 dz1Var = new dz1(new Object[0], 0);
/* 9 */             f7454d = dz1Var;
/* 11 */            dz1Var.f6945a = false;
                }

                public dz1(Object[] objArr, int i) {
/* 4 */             this.f7455b = objArr;
/* 6 */             this.f7456c = i;
                }

                @Override // java.util.AbstractList, java.util.List
                public final void add(int i, Object obj) {
                    int i2;
/* 1 */             m2903a();
/* 4 */             if (i < 0 || i > (i2 = this.f7456c)) {
/* 68 */                StringBuilder sbM3793s = fm0.m3793s(i, "Index:", ", Size:");
/* 74 */                sbM3793s.append(this.f7456c);
/* 84 */                throw new IndexOutOfBoundsException(sbM3793s.toString());
                    }
/* 10 */            Object[] objArr = this.f7455b;
/* 14 */            if (i2 < objArr.length) {
/* 19 */                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
                    } else {
/* 29 */                Object[] objArr2 = new Object[fm0.m3797w(i2, 3, 2, 1)];
/* 32 */                System.arraycopy(objArr, 0, objArr2, 0, i);
/* 42 */                System.arraycopy(this.f7455b, i, objArr2, i + 1, this.f7456c - i);
/* 45 */                this.f7455b = objArr2;
                    }
/* 49 */            this.f7455b[i] = obj;
/* 54 */            this.f7456c++;
/* 59 */            ((AbstractList) this).modCount++;
                }

                /* JADX INFO: renamed from: b */
                public final void m3283b(int i) {
/* 1 */             if (i < 0 || i >= this.f7456c) {
/* 14 */                StringBuilder sbM3793s = fm0.m3793s(i, "Index:", ", Size:");
/* 20 */                sbM3793s.append(this.f7456c);
/* 30 */                throw new IndexOutOfBoundsException(sbM3793s.toString());
                    }
                }

                @Override // java.util.AbstractList, java.util.List
                public final Object get(int i) {
/* 1 */             m3283b(i);
/* 6 */             return this.f7455b[i];
                }

                @Override // p000.AbstractC0827d0, java.util.AbstractList, java.util.List
                public final Object remove(int i) {
/* 1 */             m2903a();
/* 4 */             m3283b(i);
/* 7 */             Object[] objArr = this.f7455b;
/* 9 */             Object obj = objArr[i];
/* 11 */            int i2 = this.f7456c;
/* 15 */            if (i < i2 - 1) {
/* 22 */                System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
                    }
/* 29 */            this.f7456c--;
/* 35 */            ((AbstractList) this).modCount++;
/* 37 */            return obj;
                }

                @Override // java.util.AbstractList, java.util.List
                public final Object set(int i, Object obj) {
/* 1 */             m2903a();
/* 4 */             m3283b(i);
/* 7 */             Object[] objArr = this.f7455b;
/* 9 */             Object obj2 = objArr[i];
/* 11 */            objArr[i] = obj;
/* 17 */            ((AbstractList) this).modCount++;
/* 19 */            return obj2;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
/* 1 */             return this.f7456c;
                }

                @Override // p000.cz0
                /* JADX INFO: renamed from: x */
                public final cz0 mo2899x(int i) {
/* 3 */             if (i >= this.f7456c) {
/* 15 */                return new dz1(Arrays.copyOf(this.f7455b, i), this.f7456c);
                    }
/* 19 */            f42.m3649e();
/* 22 */            return null;
                }

                @Override // p000.AbstractC0827d0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
/* 84 */        public final boolean add(Object obj) {
/* 85 */            m2903a();
/* 86 */            int i = this.f7456c;
                    Object[] objArr = this.f7455b;
                    if (i == objArr.length) {
/* 89 */                this.f7455b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
                    }
/* 90 */            Object[] objArr2 = this.f7455b;
                    int i2 = this.f7456c;
                    this.f7456c = i2 + 1;
                    objArr2[i2] = obj;
/* 91 */            ((AbstractList) this).modCount++;
                    return true;
                }
            }
