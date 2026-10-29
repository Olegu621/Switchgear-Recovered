            package p000;

            import java.util.Collection;
            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 21 */    public final class zb1 implements Collection {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ kx0 f20060a;

                public zb1(kx0 kx0Var) {
/* 4 */             this.f20060a = kx0Var;
                }

                @Override // java.util.Collection
                public final boolean add(Object obj) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.Collection
                public final boolean addAll(Collection collection) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.Collection
                public final void clear() {
/* 3 */             this.f20060a.mo4166b();
                }

                @Override // java.util.Collection
                public final boolean contains(Object obj) {
                    return this.f20060a.mo4171g(obj) >= 0;
                }

                @Override // java.util.Collection
                public final boolean containsAll(Collection collection) {
/* 1 */             Iterator it = collection.iterator();
/* 9 */             while (it.hasNext()) {
/* 19 */                if (!contains(it.next())) {
/* 21 */                    return false;
                        }
                    }
/* 23 */            return true;
                }

                @Override // java.util.Collection
                public final boolean isEmpty() {
                    return this.f20060a.mo4169e() == 0;
                }

                @Override // java.util.Collection, java.lang.Iterable
                public final Iterator iterator() {
/* 6 */             return new wb1(this.f20060a, 1);
                }

                @Override // java.util.Collection
                public final boolean remove(Object obj) {
/* 1 */             kx0 kx0Var = this.f20060a;
/* 3 */             int iMo4171g = kx0Var.mo4171g(obj);
/* 7 */             if (iMo4171g < 0) {
/* 14 */                return false;
                    }
/* 9 */             kx0Var.mo4173i(iMo4171g);
/* 12 */            return true;
                }

                @Override // java.util.Collection
                public final boolean removeAll(Collection collection) {
/* 1 */             kx0 kx0Var = this.f20060a;
/* 3 */             int iMo4169e = kx0Var.mo4169e();
/* 7 */             int i = 0;
/* 8 */             boolean z = false;
/* 9 */             while (i < iMo4169e) {
/* 20 */                if (collection.contains(kx0Var.mo4167c(i, 1))) {
/* 22 */                    kx0Var.mo4173i(i);
/* 25 */                    i--;
/* 27 */                    iMo4169e--;
/* 29 */                    z = true;
                        }
/* 30 */                i++;
                    }
/* 32 */            return z;
                }

                @Override // java.util.Collection
                public final boolean retainAll(Collection collection) {
/* 1 */             kx0 kx0Var = this.f20060a;
/* 3 */             int iMo4169e = kx0Var.mo4169e();
/* 7 */             int i = 0;
/* 8 */             boolean z = false;
/* 9 */             while (i < iMo4169e) {
/* 20 */                if (!collection.contains(kx0Var.mo4167c(i, 1))) {
/* 22 */                    kx0Var.mo4173i(i);
/* 25 */                    i--;
/* 27 */                    iMo4169e--;
/* 29 */                    z = true;
                        }
/* 30 */                i++;
                    }
/* 32 */            return z;
                }

                @Override // java.util.Collection
                public final int size() {
/* 3 */             return this.f20060a.mo4169e();
                }

                @Override // java.util.Collection
                public final Object[] toArray() {
/* 1 */             kx0 kx0Var = this.f20060a;
/* 3 */             int iMo4169e = kx0Var.mo4169e();
/* 7 */             Object[] objArr = new Object[iMo4169e];
/* 10 */            for (int i = 0; i < iMo4169e; i++) {
/* 17 */                objArr[i] = kx0Var.mo4167c(i, 1);
                    }
/* 22 */            return objArr;
                }

                @Override // java.util.Collection
/* 22 */        public final Object[] toArray(Object[] objArr) {
/* 23 */            return this.f20060a.m6302v(1, objArr);
                }
            }
