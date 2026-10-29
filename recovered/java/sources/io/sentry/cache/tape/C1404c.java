            package io.sentry.cache.tape;

            import java.io.IOException;
            import java.util.Iterator;
            
            /* JADX INFO: renamed from: io.sentry.cache.tape.c */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1404c implements Iterator {

                /* JADX INFO: renamed from: a */
                public final C1409h f10811a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C1405d f10812b;

                public C1404c(C1405d c1405d, C1409h c1409h) {
/* 4 */             this.f10812b = c1405d;
/* 6 */             this.f10811a = c1409h;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
/* 3 */             return this.f10811a.hasNext();
                }

                @Override // java.util.Iterator
                public final Object next() {
/* 13 */            return this.f10812b.f10815c.mo5133d((byte[]) this.f10811a.next());
                }

                @Override // java.util.Iterator
                public final void remove() throws IOException {
/* 3 */             this.f10811a.remove();
                }
            }
