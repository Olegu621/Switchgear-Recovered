            package p000;

            import java.util.AbstractList;
            import java.util.Arrays;
            import java.util.RandomAccess;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 76 */    public final class zp3 extends vm3 implements RandomAccess {

                /* JADX INFO: renamed from: d */
                public static final zp3 f20290d = new zp3(new Object[0], 0, false);

                /* JADX INFO: renamed from: b */
                public Object[] f20291b;

                /* JADX INFO: renamed from: c */
                public int f20292c;

                public zp3(Object[] objArr, int i, boolean z) {
/* 1 */             super(z);
/* 4 */             this.f20291b = objArr;
/* 6 */             this.f20292c = i;
                }

                @Override // p000.ro3
                /* JADX INFO: renamed from: I */
                public final /* bridge */ /* synthetic */ ro3 mo8221I(int i) {
/* 3 */             if (i >= this.f20292c) {
/* 16 */                return new zp3(Arrays.copyOf(this.f20291b, i), this.f20292c, true);
                    }
/* 20 */            f42.m3649e();
/* 23 */            return null;
                }

                @Override // java.util.AbstractList, java.util.List
                public final void add(int i, Object obj) {
                    int i2;
/* 1 */             m9305a();
/* 4 */             if (i < 0 || i > (i2 = this.f20292c)) {
/* 74 */                s80.m8425f(ym3.m10160a(this.f20292c, i, (byte) 13, "Index:", ", Size:"));
/* 77 */                return;
                    }
/* 10 */            Object[] objArr = this.f20291b;
/* 14 */            if (i2 < objArr.length) {
/* 19 */                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
                    } else {
/* 29 */                Object[] objArr2 = new Object[fm0.m3797w(i2, 3, 2, 1)];
/* 32 */                System.arraycopy(objArr, 0, objArr2, 0, i);
/* 42 */                System.arraycopy(this.f20291b, i, objArr2, i + 1, this.f20292c - i);
/* 45 */                this.f20291b = objArr2;
                    }
/* 49 */            this.f20291b[i] = obj;
/* 54 */            this.f20292c++;
/* 59 */            ((AbstractList) this).modCount++;
                }

                /* JADX INFO: renamed from: b */
                public final void m10419b(int i) {
/* 1 */             if (i < 0 || i >= this.f20292c) {
/* 20 */                s80.m8425f(ym3.m10160a(this.f20292c, i, (byte) 13, "Index:", ", Size:"));
                    }
                }

                @Override // java.util.AbstractList, java.util.List
                public final Object get(int i) {
/* 1 */             m10419b(i);
/* 6 */             return this.f20291b[i];
                }

                @Override // p000.vm3, java.util.AbstractList, java.util.List
                public final Object remove(int i) {
/* 1 */             m9305a();
/* 4 */             m10419b(i);
/* 7 */             Object[] objArr = this.f20291b;
/* 9 */             Object obj = objArr[i];
/* 11 */            int i2 = this.f20292c;
/* 15 */            if (i < i2 - 1) {
/* 22 */                System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
                    }
/* 29 */            this.f20292c--;
/* 35 */            ((AbstractList) this).modCount++;
/* 37 */            return obj;
                }

                @Override // java.util.AbstractList, java.util.List
                public final Object set(int i, Object obj) {
/* 1 */             m9305a();
/* 4 */             m10419b(i);
/* 7 */             Object[] objArr = this.f20291b;
/* 9 */             Object obj2 = objArr[i];
/* 11 */            objArr[i] = obj;
/* 17 */            ((AbstractList) this).modCount++;
/* 19 */            return obj2;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
/* 1 */             return this.f20292c;
                }

                @Override // p000.vm3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
/* 77 */        public final boolean add(Object obj) {
/* 78 */            m9305a();
                    int i = this.f20292c;
                    Object[] objArr = this.f20291b;
/* 79 */            if (i == objArr.length) {
/* 80 */                this.f20291b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
                    }
                    Object[] objArr2 = this.f20291b;
                    int i2 = this.f20292c;
                    this.f20292c = i2 + 1;
/* 81 */            objArr2[i2] = obj;
/* 82 */            ((AbstractList) this).modCount++;
                    return true;
                }
            }
