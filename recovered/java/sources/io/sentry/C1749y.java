            package io.sentry;

            import java.io.Serializable;
            import java.util.AbstractCollection;
            import java.util.Iterator;
            import java.util.NoSuchElementException;
            import java.util.Queue;
            
            /* JADX INFO: renamed from: io.sentry.y */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1749y extends AbstractCollection implements Queue, Serializable {
                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
                public final boolean add(Object obj) {
/* 1 */             return false;
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                public final void clear() {
                }

                @Override // java.util.Queue
                public final Object element() {
/* 1 */             return null;
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                public final boolean isEmpty() {
/* 1 */             return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
                public final Iterator iterator() {
/* 3 */             return new C1741x();
                }

                @Override // java.util.Queue
                public final boolean offer(Object obj) {
/* 1 */             return false;
                }

                @Override // java.util.Queue
                public final Object peek() {
/* 1 */             return null;
                }

                @Override // java.util.Queue
                public final Object poll() {
/* 1 */             return null;
                }

                @Override // java.util.Queue
                public final Object remove() {
/* 8 */             throw new NoSuchElementException("queue is disabled");
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                public final int size() {
/* 1 */             return 0;
                }
            }
