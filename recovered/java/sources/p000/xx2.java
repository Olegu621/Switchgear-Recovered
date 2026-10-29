            package p000;

            import java.util.ListIterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 14 */    public final class xx2 implements ListIterator {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f19391a = 0;

                /* JADX INFO: renamed from: b */
                public ListIterator f19392b;

                public xx2(oq3 oq3Var, int i) {
/* 13 */            this.f19392b = oq3Var.f14867a.listIterator(i);
                }

                @Override // java.util.ListIterator
                public final void add(Object obj) {
                    switch (this.f19391a) {
                        case 0:
/* 21 */                    throw new UnsupportedOperationException();
                        default:
/* 13 */                    throw new UnsupportedOperationException();
                    }
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public final boolean hasNext() {
                    switch (this.f19391a) {
                        case 0:
                            break;
                    }
/* 8 */             return this.f19392b.hasNext();
                }

                @Override // java.util.ListIterator
                public final boolean hasPrevious() {
                    switch (this.f19391a) {
                        case 0:
                            break;
                    }
/* 8 */             return this.f19392b.hasPrevious();
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public final Object next() {
                    switch (this.f19391a) {
                        case 0:
                            break;
                    }
/* 12 */            return (String) this.f19392b.next();
                }

                @Override // java.util.ListIterator
                public final int nextIndex() {
                    switch (this.f19391a) {
                        case 0:
                            break;
                    }
/* 8 */             return this.f19392b.nextIndex();
                }

                @Override // java.util.ListIterator
                public final Object previous() {
                    switch (this.f19391a) {
                        case 0:
                            break;
                    }
/* 12 */            return (String) this.f19392b.previous();
                }

                @Override // java.util.ListIterator
                public final int previousIndex() {
                    switch (this.f19391a) {
                        case 0:
                            break;
                    }
/* 8 */             return this.f19392b.previousIndex();
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public final void remove() {
                    switch (this.f19391a) {
                        case 0:
/* 17 */                    throw new UnsupportedOperationException();
                        default:
/* 11 */                    throw new UnsupportedOperationException();
                    }
                }

                @Override // java.util.ListIterator
                public final void set(Object obj) {
                    switch (this.f19391a) {
                        case 0:
/* 21 */                    throw new UnsupportedOperationException();
                        default:
/* 13 */                    throw new UnsupportedOperationException();
                    }
                }

/* 15 */        public /* synthetic */ xx2() {
                }
            }
