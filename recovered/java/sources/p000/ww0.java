            package p000;

            import java.util.ListIterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ww0 extends wx2 implements ListIterator {

                /* JADX INFO: renamed from: b */
                public final int f18843b;

                /* JADX INFO: renamed from: c */
                public int f18844c;

                /* JADX INFO: renamed from: d */
                public final zw0 f18845d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ww0(zw0 zw0Var, int i) {
/* 6 */             super(0);
/* 1 */             int size = zw0Var.size();
/* 9 */             yy1.m10215j(i, size);
/* 12 */            this.f18843b = size;
/* 14 */            this.f18844c = i;
/* 16 */            this.f18845d = zw0Var;
                }

                /* JADX INFO: renamed from: a */
                public final Object m9650a(int i) {
/* 3 */             return this.f18845d.get(i);
                }

                @Override // java.util.ListIterator
                public final void add(Object obj) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.Iterator, java.util.ListIterator
                public final boolean hasNext() {
                    return this.f18844c < this.f18843b;
                }

                @Override // java.util.ListIterator
                public final boolean hasPrevious() {
                    return this.f18844c > 0;
                }

                @Override // java.util.Iterator, java.util.ListIterator
                public final Object next() {
/* 5 */             if (!hasNext()) {
/* 18 */                C1951n4.m6864o();
/* 21 */                return null;
                    }
/* 7 */             int i = this.f18844c;
/* 11 */            this.f18844c = i + 1;
/* 13 */            return m9650a(i);
                }

                @Override // java.util.ListIterator
                public final int nextIndex() {
/* 1 */             return this.f18844c;
                }

                @Override // java.util.ListIterator
                public final Object previous() {
/* 5 */             if (!hasPrevious()) {
/* 18 */                C1951n4.m6864o();
/* 21 */                return null;
                    }
/* 9 */             int i = this.f18844c - 1;
/* 11 */            this.f18844c = i;
/* 13 */            return m9650a(i);
                }

                @Override // java.util.ListIterator
                public final int previousIndex() {
/* 3 */             return this.f18844c - 1;
                }

                @Override // java.util.ListIterator
                public final void set(Object obj) {
/* 6 */             throw new UnsupportedOperationException();
                }
            }
