            package p000;

            import java.util.Iterator;
            import kotlin.collections.IndexedValue;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
/* 18 */    public final class sa0 implements Iterator, r21 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f16484a = 1;

                /* JADX INFO: renamed from: b */
                public final Iterator f16485b;

                /* JADX INFO: renamed from: c */
                public int f16486c;

                public sa0(ta0 ta0Var) {
/* 13 */            this.f16485b = ta0Var.f17002a.iterator();
/* 17 */            this.f16486c = ta0Var.f17003b;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
/* 1 */             int i = this.f16484a;
/* 3 */             Iterator it = this.f16485b;
                    switch (i) {
                        case 0:
                            break;
                        default:
/* 8 */                     return it.hasNext();
                    }
/* 15 */            while (this.f16486c > 0 && it.hasNext()) {
/* 23 */                it.next();
/* 30 */                this.f16486c--;
                    }
/* 33 */            return it.hasNext();
                }

                @Override // java.util.Iterator
                public final Object next() {
/* 1 */             int i = this.f16484a;
/* 3 */             Iterator it = this.f16485b;
                    switch (i) {
                        case 0:
                            break;
                        default:
/* 10 */                    int i2 = this.f16486c;
/* 14 */                    this.f16486c = i2 + 1;
/* 16 */                    if (i2 >= 0) {
/* 22 */                        return new IndexedValue(i2, it.next());
                            }
/* 26 */                    C2085pw.m7568g();
/* 30 */                    throw null;
                    }
/* 33 */            while (this.f16486c > 0 && it.hasNext()) {
/* 41 */                it.next();
/* 48 */                this.f16486c--;
                    }
/* 51 */            return it.next();
                }

                @Override // java.util.Iterator
                public final void remove() {
                    switch (this.f16484a) {
                        case 0:
/* 21 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                        default:
/* 13 */                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                    }
                }

/* 19 */        public sa0(Iterator it) {
                    it.getClass();
                    this.f16485b = it;
                }
            }
