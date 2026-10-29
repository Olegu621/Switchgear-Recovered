            package p000;

            import java.util.ListIterator;
            
            /* JADX INFO: renamed from: s */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C2163s extends C2126r implements ListIterator {

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ AbstractC2237u f16368d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2163s(AbstractC2237u abstractC2237u, int i) {
/* 4 */             super(abstractC2237u, 0);
/* 1 */             this.f16368d = abstractC2237u;
/* 7 */             C2089q c2089q = AbstractC2237u.Companion;
/* 9 */             int size = abstractC2237u.size();
/* 13 */            c2089q.getClass();
/* 16 */            C2089q.m7639b(i, size);
/* 19 */            this.f15813b = i;
                }

                @Override // java.util.ListIterator
                public final void add(Object obj) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.ListIterator
                public final boolean hasPrevious() {
                    return this.f15813b > 0;
                }

                @Override // java.util.ListIterator
                public final int nextIndex() {
/* 1 */             return this.f15813b;
                }

                @Override // java.util.ListIterator
                public final Object previous() {
/* 5 */             if (!hasPrevious()) {
/* 20 */                C1951n4.m6864o();
/* 23 */                return null;
                    }
/* 9 */             int i = this.f15813b - 1;
/* 11 */            this.f15813b = i;
/* 15 */            return this.f16368d.get(i);
                }

                @Override // java.util.ListIterator
                public final int previousIndex() {
/* 3 */             return this.f15813b - 1;
                }

                @Override // java.util.ListIterator
                public final void set(Object obj) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }
            }
