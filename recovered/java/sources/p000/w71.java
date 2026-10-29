            package p000;

            import java.util.AbstractList;
            import java.util.ConcurrentModificationException;
            import java.util.ListIterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
/* 19 */    public final class w71 implements ListIterator, r21 {

                /* JADX INFO: renamed from: b */
                public int f18466b;

                /* JADX INFO: renamed from: d */
                public int f18468d;

                /* JADX INFO: renamed from: e */
                public final AbstractC0002a0 f18469e;

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f18465a = 0;

                /* JADX INFO: renamed from: c */
                public int f18467c = -1;

                public w71(z71 z71Var, int i) {
/* 7 */             this.f18469e = z71Var;
/* 9 */             this.f18466b = i;
/* 18 */            this.f18468d = ((AbstractList) z71Var).modCount;
                }

                /* JADX INFO: renamed from: a */
                public void m9481a() {
/* 13 */            if (((AbstractList) ((x71) this.f18469e).f18985e).modCount != this.f18468d) {
/* 21 */                throw new ConcurrentModificationException();
                    }
                }

                @Override // java.util.ListIterator
                public final void add(Object obj) {
/* 1 */             int i = this.f18465a;
/* 4 */             AbstractC0002a0 abstractC0002a0 = this.f18469e;
                    switch (i) {
                        case 0:
/* 32 */                    m9481a();
/* 35 */                    x71 x71Var = (x71) abstractC0002a0;
/* 37 */                    int i2 = this.f18466b;
/* 41 */                    this.f18466b = i2 + 1;
/* 43 */                    x71Var.add(i2, obj);
/* 46 */                    this.f18467c = -1;
/* 52 */                    this.f18468d = ((AbstractList) x71Var).modCount;
                            break;
                        default:
/* 9 */                     m9482b();
/* 12 */                    z71 z71Var = (z71) abstractC0002a0;
/* 14 */                    int i3 = this.f18466b;
/* 18 */                    this.f18466b = i3 + 1;
/* 20 */                    z71Var.add(i3, obj);
/* 23 */                    this.f18467c = -1;
/* 29 */                    this.f18468d = ((AbstractList) z71Var).modCount;
                            break;
                    }
                }

                /* JADX INFO: renamed from: b */
                public void m9482b() {
/* 11 */            if (((AbstractList) ((z71) this.f18469e)).modCount != this.f18468d) {
/* 19 */                throw new ConcurrentModificationException();
                    }
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public final boolean hasNext() {
/* 1 */             int i = this.f18465a;
/* 5 */             AbstractC0002a0 abstractC0002a0 = this.f18469e;
                    switch (i) {
                        case 0:
                            return this.f18466b < ((x71) abstractC0002a0).f18983c;
                        default:
                            return this.f18466b < ((z71) abstractC0002a0).f19966b;
                    }
                }

                @Override // java.util.ListIterator
                public final boolean hasPrevious() {
                    switch (this.f18465a) {
                        case 0:
                            return this.f18466b > 0;
                        default:
                            return this.f18466b > 0;
                    }
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public final Object next() {
/* 1 */             int i = this.f18465a;
/* 4 */             AbstractC0002a0 abstractC0002a0 = this.f18469e;
                    switch (i) {
                        case 0:
/* 35 */                    m9481a();
/* 38 */                    int i2 = this.f18466b;
/* 40 */                    x71 x71Var = (x71) abstractC0002a0;
/* 44 */                    if (i2 >= x71Var.f18983c) {
/* 60 */                        C1951n4.m6864o();
/* 3 */                         return null;
                            }
/* 48 */                    this.f18466b = i2 + 1;
/* 50 */                    this.f18467c = i2;
/* 57 */                    return x71Var.f18981a[x71Var.f18982b + i2];
                        default:
/* 9 */                     m9482b();
/* 12 */                    int i3 = this.f18466b;
/* 14 */                    z71 z71Var = (z71) abstractC0002a0;
/* 18 */                    if (i3 >= z71Var.f19966b) {
/* 31 */                        C1951n4.m6864o();
/* 3 */                         return null;
                            }
/* 22 */                    this.f18466b = i3 + 1;
/* 24 */                    this.f18467c = i3;
/* 28 */                    return z71Var.f19965a[i3];
                    }
                }

                @Override // java.util.ListIterator
                public final int nextIndex() {
                    switch (this.f18465a) {
                        case 0:
                            break;
                    }
/* 6 */             return this.f18466b;
                }

                @Override // java.util.ListIterator
                public final Object previous() {
/* 1 */             int i = this.f18465a;
/* 4 */             AbstractC0002a0 abstractC0002a0 = this.f18469e;
                    switch (i) {
                        case 0:
/* 33 */                    m9481a();
/* 36 */                    int i2 = this.f18466b;
/* 38 */                    if (i2 <= 0) {
/* 56 */                        C1951n4.m6864o();
/* 3 */                         return null;
                            }
/* 40 */                    int i3 = i2 - 1;
/* 42 */                    this.f18466b = i3;
/* 44 */                    this.f18467c = i3;
/* 46 */                    x71 x71Var = (x71) abstractC0002a0;
/* 53 */                    return x71Var.f18981a[x71Var.f18982b + i3];
                        default:
/* 9 */                     m9482b();
/* 12 */                    int i4 = this.f18466b;
/* 14 */                    if (i4 <= 0) {
/* 29 */                        C1951n4.m6864o();
/* 3 */                         return null;
                            }
/* 16 */                    int i5 = i4 - 1;
/* 18 */                    this.f18466b = i5;
/* 20 */                    this.f18467c = i5;
/* 26 */                    return ((z71) abstractC0002a0).f19965a[i5];
                    }
                }

                @Override // java.util.ListIterator
                public final int previousIndex() {
                    int i;
                    switch (this.f18465a) {
                        case 0:
/* 11 */                    i = this.f18466b;
                            break;
                        default:
/* 6 */                     i = this.f18466b;
                            break;
                    }
/* 8 */             return i - 1;
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public final void remove() {
/* 1 */             int i = this.f18465a;
/* 6 */             AbstractC0002a0 abstractC0002a0 = this.f18469e;
                    switch (i) {
                        case 0:
/* 40 */                    x71 x71Var = (x71) abstractC0002a0;
/* 42 */                    m9481a();
/* 45 */                    int i2 = this.f18467c;
/* 47 */                    if (i2 == -1) {
/* 65 */                        f42.m3656l("Call next() or previous() before removing element from the iterator.");
                            } else {
/* 49 */                        x71Var.mo1b(i2);
/* 54 */                        this.f18466b = this.f18467c;
/* 56 */                        this.f18467c = -1;
/* 62 */                        this.f18468d = ((AbstractList) x71Var).modCount;
                            }
                            break;
                        default:
/* 11 */                    z71 z71Var = (z71) abstractC0002a0;
/* 13 */                    m9482b();
/* 16 */                    int i3 = this.f18467c;
/* 18 */                    if (i3 == -1) {
/* 36 */                        f42.m3656l("Call next() or previous() before removing element from the iterator.");
                            } else {
/* 20 */                        z71Var.mo1b(i3);
/* 25 */                        this.f18466b = this.f18467c;
/* 27 */                        this.f18467c = -1;
/* 33 */                        this.f18468d = ((AbstractList) z71Var).modCount;
                            }
                            break;
                    }
                }

                @Override // java.util.ListIterator
                public final void set(Object obj) {
/* 1 */             int i = this.f18465a;
/* 5 */             AbstractC0002a0 abstractC0002a0 = this.f18469e;
                    switch (i) {
                        case 0:
/* 28 */                    m9481a();
/* 31 */                    int i2 = this.f18467c;
/* 33 */                    if (i2 == -1) {
/* 41 */                        f42.m3656l("Call next() or previous() before replacing element from the iterator.");
                            } else {
/* 37 */                        ((x71) abstractC0002a0).set(i2, obj);
                            }
                            break;
                        default:
/* 11 */                    m9482b();
/* 14 */                    int i3 = this.f18467c;
/* 16 */                    if (i3 == -1) {
/* 24 */                        f42.m3656l("Call next() or previous() before replacing element from the iterator.");
                            } else {
/* 20 */                        ((z71) abstractC0002a0).set(i3, obj);
                            }
                            break;
                    }
                }

/* 20 */        public w71(x71 x71Var, int i) {
/* 22 */            this.f18469e = x71Var;
/* 23 */            this.f18466b = i;
/* 1 */             this.f18468d = ((AbstractList) x71Var).modCount;
                }
            }
