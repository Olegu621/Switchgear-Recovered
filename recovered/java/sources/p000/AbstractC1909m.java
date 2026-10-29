            package p000;

            import java.util.Iterator;
            
            /* JADX INFO: renamed from: m */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public abstract class AbstractC1909m implements Iterator, r21 {

                /* JADX INFO: renamed from: a */
                public int f13539a;

                /* JADX INFO: renamed from: b */
                public Object f13540b;

                /* JADX INFO: renamed from: a */
                public abstract void mo66a();

                @Override // java.util.Iterator
                public final boolean hasNext() {
/* 1 */             int i = this.f13539a;
/* 5 */             if (i == 0) {
/* 22 */                this.f13539a = 3;
/* 24 */                mo66a();
                        return this.f13539a == 1;
                    }
/* 7 */             if (i == 1) {
/* 4 */                 return true;
                    }
/* 10 */            if (i == 2) {
/* 3 */                 return false;
                    }
/* 15 */            C1951n4.m6859j("hasNext called when the iterator is in the FAILED state.");
/* 18 */            return false;
                }

                @Override // java.util.Iterator
                public final Object next() {
/* 1 */             int i = this.f13539a;
/* 5 */             if (i == 1) {
/* 7 */                 this.f13539a = 0;
/* 9 */                 return this.f13540b;
                    }
/* 13 */            if (i != 2) {
/* 16 */                this.f13539a = 3;
/* 18 */                mo66a();
/* 23 */                if (this.f13539a == 1) {
/* 25 */                    this.f13539a = 0;
/* 27 */                    return this.f13540b;
                        }
                    }
/* 30 */            C1951n4.m6864o();
/* 33 */            return null;
                }

                @Override // java.util.Iterator
                public final void remove() {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }
            }
