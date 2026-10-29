            package p000;

            import java.util.ListIterator;
            import java.util.NoSuchElementException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class md0 implements ListIterator, r21 {

                /* JADX INFO: renamed from: a */
                public static final md0 f13701a = new md0();

                @Override // java.util.ListIterator
                public final /* bridge */ /* synthetic */ void add(Object obj) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public final boolean hasNext() {
/* 1 */             return false;
                }

                @Override // java.util.ListIterator
                public final boolean hasPrevious() {
/* 1 */             return false;
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public final Object next() {
/* 6 */             throw new NoSuchElementException();
                }

                @Override // java.util.ListIterator
                public final int nextIndex() {
/* 1 */             return 0;
                }

                @Override // java.util.ListIterator
                public final Object previous() {
/* 6 */             throw new NoSuchElementException();
                }

                @Override // java.util.ListIterator
                public final int previousIndex() {
/* 1 */             return -1;
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public final void remove() {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                @Override // java.util.ListIterator
                public final /* bridge */ /* synthetic */ void set(Object obj) {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }
            }
