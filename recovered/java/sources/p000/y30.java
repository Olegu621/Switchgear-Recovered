            package p000;

            import java.util.AbstractSet;
            import java.util.Iterator;
            import java.util.NoSuchElementException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 11 */    public final class y30 implements Iterator {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f19468a;

                /* JADX INFO: renamed from: b */
                public int f19469b;

                /* JADX INFO: renamed from: c */
                public final Iterable f19470c;

                public y30(AbstractC1775j abstractC1775j) {
/* 2 */             this.f19468a = 0;
/* 7 */             this.f19470c = abstractC1775j;
/* 10 */            this.f19469b = -1;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
/* 1 */             int i = this.f19468a;
/* 5 */             Iterable iterable = this.f19470c;
                    switch (i) {
                        case 0:
                            return this.f19469b < ((AbstractC1775j) iterable).getCount() + (-1);
                        case 1:
                            return this.f19469b < ((cj3) ((gf2) iterable).f8586b).f2968e;
                        default:
/* 12 */                    gk3 gk3Var = (gk3) iterable;
                            return this.f19469b < gk3Var.m3966b() - gk3Var.m3965a();
                    }
                }

                @Override // java.util.Iterator
                public final Object next() {
/* 1 */             int i = this.f19468a;
/* 3 */             Iterable iterable = this.f19470c;
                    switch (i) {
                        case 0:
/* 71 */                    if (!hasNext()) {
/* 99 */                        throw new NoSuchElementException(fm0.m3781g(this.f19469b, "Cannot advance the iterator beyond "));
                            }
/* 77 */                    int i2 = this.f19469b + 1;
/* 79 */                    this.f19469b = i2;
/* 81 */                    return ((AbstractC1775j) iterable).get(i2);
                        case 1:
/* 48 */                    cj3 cj3Var = (cj3) ((gf2) iterable).f8586b;
/* 50 */                    int[] iArr = cj3Var.f2967d;
/* 52 */                    int i3 = this.f19469b;
/* 56 */                    this.f19469b = i3 + 1;
/* 62 */                    return cj3Var.m1712d(iArr[i3] & 31);
                        default:
/* 8 */                     int i4 = this.f19469b;
/* 10 */                    gk3 gk3Var = (gk3) iterable;
/* 21 */                    if (i4 >= gk3Var.m3966b() - gk3Var.m3965a()) {
/* 39 */                        C1951n4.m6864o();
/* 42 */                        return null;
                            }
/* 34 */                    Object obj = gk3Var.f8688b.f9697a[gk3Var.m3965a() + i4];
/* 36 */                    this.f19469b = i4 + 1;
/* 43 */                    return obj;
                    }
                }

                @Override // java.util.Iterator
                public final void remove() {
                    switch (this.f19468a) {
                        case 0:
/* 25 */                    throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
                        case 1:
/* 17 */                    throw new UnsupportedOperationException();
                        default:
/* 11 */                    throw new UnsupportedOperationException();
                    }
                }

/* 12 */        public /* synthetic */ y30(AbstractSet abstractSet, int i) {
/* 13 */            this.f19468a = i;
                    this.f19470c = abstractSet;
                    this.f19469b = 0;
                }
            }
