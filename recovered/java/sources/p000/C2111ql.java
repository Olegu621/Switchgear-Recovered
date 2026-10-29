            package p000;

            import java.util.Iterator;
            
            /* JADX INFO: renamed from: ql */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 17 */    public final class C2111ql implements Iterator {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f15615a = 2;

                /* JADX INFO: renamed from: b */
                public int f15616b = 0;

                /* JADX INFO: renamed from: c */
                public final int f15617c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Object f15618d;

                public C2111ql(cn3 cn3Var) {
/* 7 */             this.f15618d = cn3Var;
/* 16 */            this.f15617c = cn3Var.mo320c();
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    switch (this.f15615a) {
                        case 0:
                            return this.f15616b < this.f15617c;
                        case 1:
                            return this.f15616b < this.f15617c;
                        default:
                            return this.f15616b < this.f15617c;
                    }
                }

                @Override // java.util.Iterator
                public final Object next() {
/* 1 */             int i = this.f15615a;
/* 4 */             Object obj = this.f15618d;
/* 6 */             int i2 = this.f15617c;
                    switch (i) {
                        case 0:
/* 57 */                    int i3 = this.f15616b;
/* 59 */                    if (i3 < i2) {
/* 63 */                        this.f15616b = i3 + 1;
/* 71 */                        return Byte.valueOf(((C2222tl) obj).mo8197g(i3));
                            }
/* 76 */                    C1951n4.m6864o();
/* 3 */                     return null;
                        case 1:
/* 34 */                    int i4 = this.f15616b;
/* 36 */                    if (i4 < i2) {
/* 40 */                        this.f15616b = i4 + 1;
/* 48 */                        return Byte.valueOf(((C2259ul) obj).mo8552f(i4));
                            }
/* 53 */                    C1951n4.m6864o();
/* 3 */                     return null;
                        default:
/* 11 */                    int i5 = this.f15616b;
/* 13 */                    if (i5 < i2) {
/* 17 */                        this.f15616b = i5 + 1;
/* 25 */                        return Byte.valueOf(((cn3) obj).mo319b(i5));
                            }
/* 30 */                    C1951n4.m6864o();
/* 3 */                     return null;
                    }
                }

                @Override // java.util.Iterator
                public final void remove() {
                    switch (this.f15615a) {
                        case 0:
/* 23 */                    throw new UnsupportedOperationException();
                        case 1:
/* 17 */                    throw new UnsupportedOperationException();
                        default:
/* 11 */                    throw new UnsupportedOperationException();
                    }
                }

/* 18 */        public C2111ql(C2259ul c2259ul) {
/* 20 */            this.f15618d = c2259ul;
/* 22 */            this.f15617c = c2259ul.size();
                }

/* 22 */        public C2111ql(C2222tl c2222tl) {
/* 24 */            this.f15618d = c2222tl;
/* 26 */            this.f15617c = c2222tl.size();
                }
            }
