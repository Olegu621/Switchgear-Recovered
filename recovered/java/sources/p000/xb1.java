            package p000;

            import java.util.Collection;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.Set;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 33 */    public final class xb1 implements Set {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f19013a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ kx0 f19014b;

                public /* synthetic */ xb1(kx0 kx0Var, int i) {
/* 1 */             this.f19013a = i;
/* 3 */             this.f19014b = kx0Var;
                }

                @Override // java.util.Set, java.util.Collection
                public final boolean add(Object obj) {
                    switch (this.f19013a) {
                        case 0:
/* 19 */                    throw new UnsupportedOperationException();
                        default:
/* 11 */                    throw new UnsupportedOperationException();
                    }
                }

                @Override // java.util.Set, java.util.Collection
                public final boolean addAll(Collection collection) {
                    switch (this.f19013a) {
                        case 0:
/* 12 */                    kx0 kx0Var = this.f19014b;
/* 14 */                    int iMo4169e = kx0Var.mo4169e();
/* 18 */                    Iterator it = collection.iterator();
/* 26 */                    while (it.hasNext()) {
/* 32 */                        Map.Entry entry = (Map.Entry) it.next();
/* 42 */                        kx0Var.mo4172h(entry.getKey(), entry.getValue());
                            }
                            return iMo4169e != kx0Var.mo4169e();
                        default:
/* 11 */                    throw new UnsupportedOperationException();
                    }
                }

                @Override // java.util.Set, java.util.Collection
                public final void clear() {
/* 1 */             int i = this.f19013a;
/* 3 */             kx0 kx0Var = this.f19014b;
                    switch (i) {
                        case 0:
/* 12 */                    kx0Var.mo4166b();
                            break;
                        default:
/* 8 */                     kx0Var.mo4166b();
                            break;
                    }
                }

                @Override // java.util.Set, java.util.Collection
                public final boolean contains(Object obj) {
/* 1 */             int i = this.f19013a;
/* 5 */             kx0 kx0Var = this.f19014b;
                    switch (i) {
                        case 0:
/* 20 */                    if (!(obj instanceof Map.Entry)) {
/* 3 */                         return false;
                            }
/* 23 */                    Map.Entry entry = (Map.Entry) obj;
/* 29 */                    int iMo4170f = kx0Var.mo4170f(entry.getKey());
/* 33 */                    if (iMo4170f < 0) {
/* 3 */                         return false;
                            }
/* 36 */                    Object objMo4167c = kx0Var.mo4167c(iMo4170f, 1);
/* 40 */                    Object value = entry.getValue();
                            return objMo4167c == value || (objMo4167c != null && objMo4167c.equals(value));
                        default:
                            return kx0Var.mo4170f(obj) >= 0;
                    }
                }

                @Override // java.util.Set, java.util.Collection
                public final boolean containsAll(Collection collection) {
                    switch (this.f19013a) {
                        case 0:
/* 36 */                    Iterator it = collection.iterator();
/* 44 */                    while (it.hasNext()) {
/* 54 */                        if (!contains(it.next())) {
/* 4 */                             return false;
                                }
                            }
/* 3 */                     return true;
                        default:
/* 10 */                    Map mapMo4168d = this.f19014b.mo4168d();
/* 14 */                    Iterator it2 = collection.iterator();
/* 22 */                    while (it2.hasNext()) {
/* 32 */                        if (!mapMo4168d.containsKey(it2.next())) {
/* 4 */                             return false;
                                }
                            }
/* 3 */                     return true;
                    }
                }

                @Override // java.util.Set, java.util.Collection
                public final boolean equals(Object obj) {
                    switch (this.f19013a) {
                        case 0:
                            break;
                    }
/* 6 */             return kx0.m6290k(this, obj);
                }

                @Override // java.util.Set, java.util.Collection
                public final int hashCode() {
/* 1 */             int i = this.f19013a;
/* 4 */             kx0 kx0Var = this.f19014b;
                    switch (i) {
                        case 0:
/* 40 */                    int iHashCode = 0;
/* 41 */                    for (int iMo4169e = kx0Var.mo4169e() - 1; iMo4169e >= 0; iMo4169e--) {
/* 43 */                        Object objMo4167c = kx0Var.mo4167c(iMo4169e, 0);
/* 47 */                        Object objMo4167c2 = kx0Var.mo4167c(iMo4169e, 1);
/* 68 */                        iHashCode += (objMo4167c == null ? 0 : objMo4167c.hashCode()) ^ (objMo4167c2 == null ? 0 : objMo4167c2.hashCode());
                            }
/* 72 */                    return iHashCode;
                        default:
/* 15 */                    int iHashCode2 = 0;
/* 16 */                    for (int iMo4169e2 = kx0Var.mo4169e() - 1; iMo4169e2 >= 0; iMo4169e2--) {
/* 18 */                        Object objMo4167c3 = kx0Var.mo4167c(iMo4169e2, 0);
/* 30 */                        iHashCode2 += objMo4167c3 == null ? 0 : objMo4167c3.hashCode();
                            }
/* 34 */                    return iHashCode2;
                    }
                }

                @Override // java.util.Set, java.util.Collection
                public final boolean isEmpty() {
/* 1 */             int i = this.f19013a;
/* 5 */             kx0 kx0Var = this.f19014b;
                    switch (i) {
                        case 0:
                            return kx0Var.mo4169e() == 0;
                        default:
                            return kx0Var.mo4169e() == 0;
                    }
                }

                @Override // java.util.Set, java.util.Collection, java.lang.Iterable
                public final Iterator iterator() {
/* 1 */             int i = this.f19013a;
/* 3 */             kx0 kx0Var = this.f19014b;
                    switch (i) {
                        case 0:
/* 17 */                    return new yb1(kx0Var);
                        default:
/* 11 */                    return new wb1(kx0Var, 0);
                    }
                }

                @Override // java.util.Set, java.util.Collection
                public final boolean remove(Object obj) {
                    switch (this.f19013a) {
                        case 0:
/* 26 */                    throw new UnsupportedOperationException();
                        default:
/* 6 */                     kx0 kx0Var = this.f19014b;
/* 8 */                     int iMo4170f = kx0Var.mo4170f(obj);
/* 12 */                    if (iMo4170f < 0) {
/* 19 */                        return false;
                            }
/* 14 */                    kx0Var.mo4173i(iMo4170f);
/* 17 */                    return true;
                    }
                }

                @Override // java.util.Set, java.util.Collection
                public final boolean removeAll(Collection collection) {
                    switch (this.f19013a) {
                        case 0:
/* 49 */                    throw new UnsupportedOperationException();
                        default:
/* 8 */                     Map mapMo4168d = this.f19014b.mo4168d();
/* 12 */                    int size = mapMo4168d.size();
/* 16 */                    Iterator it = collection.iterator();
/* 24 */                    while (it.hasNext()) {
/* 30 */                        mapMo4168d.remove(it.next());
                            }
                            return size != mapMo4168d.size();
                    }
                }

                @Override // java.util.Set, java.util.Collection
                public final boolean retainAll(Collection collection) {
                    switch (this.f19013a) {
                        case 0:
/* 22 */                    throw new UnsupportedOperationException();
                        default:
/* 12 */                    return kx0.m6291t(this.f19014b.mo4168d(), collection);
                    }
                }

                @Override // java.util.Set, java.util.Collection
                public final int size() {
/* 1 */             int i = this.f19013a;
/* 3 */             kx0 kx0Var = this.f19014b;
                    switch (i) {
                        case 0:
                            break;
                    }
/* 8 */             return kx0Var.mo4169e();
                }

                @Override // java.util.Set, java.util.Collection
                public final Object[] toArray() {
                    switch (this.f19013a) {
                        case 0:
/* 33 */                    throw new UnsupportedOperationException();
                        default:
/* 6 */                     kx0 kx0Var = this.f19014b;
/* 8 */                     int iMo4169e = kx0Var.mo4169e();
/* 12 */                    Object[] objArr = new Object[iMo4169e];
/* 16 */                    for (int i = 0; i < iMo4169e; i++) {
/* 22 */                        objArr[i] = kx0Var.mo4167c(i, 0);
                            }
/* 27 */                    return objArr;
                    }
                }

                @Override // java.util.Set, java.util.Collection
/* 34 */        public final Object[] toArray(Object[] objArr) {
                    switch (this.f19013a) {
                        case 0:
/* 36 */                    throw new UnsupportedOperationException();
                        default:
/* 35 */                    return this.f19014b.m6302v(0, objArr);
                    }
                }
            }
