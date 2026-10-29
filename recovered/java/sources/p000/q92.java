            package p000;

            import java.util.Iterator;
            import java.util.NoSuchElementException;
            import kotlin.Unit;
            import kotlin.coroutines.C1846g;
            import kotlin.coroutines.CoroutineContext;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class q92 extends r92 implements Iterator, c10, r21 {

                /* JADX INFO: renamed from: a */
                public int f15450a;

                /* JADX INFO: renamed from: b */
                public Object f15451b;

                /* JADX INFO: renamed from: c */
                public c10 f15452c;

                @Override // p000.r92
                /* JADX INFO: renamed from: a */
                public final void mo7741a(Object obj, AbstractC0181bi abstractC0181bi) {
/* 1 */             this.f15451b = obj;
/* 4 */             this.f15450a = 3;
/* 6 */             this.f15452c = abstractC0181bi;
/* 8 */             z10 z10Var = z10.f19902a;
                }

                /* JADX INFO: renamed from: c */
                public final RuntimeException m7742c() {
/* 1 */             int i = this.f15450a;
/* 4 */             if (i == 4) {
/* 41 */                return new NoSuchElementException();
                    }
/* 7 */             if (i == 5) {
/* 35 */                return new IllegalStateException("Iterator has failed.");
                    }
/* 27 */            return new IllegalStateException("Unexpected state of the iterator: " + this.f15450a);
                }

                @Override // p000.c10
                public final CoroutineContext getContext() {
/* 1 */             return C1846g.f12919a;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    int i;
                    while (true) {
/* 1 */                 i = this.f15450a;
/* 4 */                 if (i != 0) {
                            break;
                        }
/* 28 */                this.f15450a = 5;
/* 30 */                c10 c10Var = this.f15452c;
/* 32 */                c10Var.getClass();
/* 35 */                this.f15452c = null;
/* 37 */                Unit unit = Unit.f12910a;
/* 39 */                m42 m42Var = o42.f14612b;
/* 41 */                c10Var.resumeWith(unit);
                    }
/* 7 */             if (i == 1) {
/* 26 */                throw null;
                    }
/* 10 */            if (i == 2 || i == 3) {
/* 6 */                 return true;
                    }
/* 16 */            if (i == 4) {
/* 18 */                return false;
                    }
/* 24 */            throw m7742c();
                }

                @Override // java.util.Iterator
                public final Object next() {
/* 1 */             int i = this.f15450a;
/* 4 */             if (i == 0 || i == 1) {
/* 35 */                if (hasNext()) {
/* 37 */                    return next();
                        }
/* 42 */                C1951n4.m6864o();
/* 3 */                 return null;
                    }
/* 10 */            if (i == 2) {
/* 28 */                this.f15450a = 1;
/* 30 */                throw null;
                    }
/* 13 */            if (i != 3) {
/* 27 */                throw m7742c();
                    }
/* 16 */            this.f15450a = 0;
/* 18 */            Object obj = this.f15451b;
/* 20 */            this.f15451b = null;
/* 22 */            return obj;
                }

                @Override // java.util.Iterator
                public final void remove() {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // p000.c10
                public final void resumeWith(Object obj) {
/* 1 */             pg3.m7417A(obj);
/* 5 */             this.f15450a = 4;
                }
            }
