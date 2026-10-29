            package p000;

            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class fr2 implements Iterator, r21 {

                /* JADX INFO: renamed from: a */
                public final Iterator f8335a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ li0 f8336b;

                public fr2(li0 li0Var) {
/* 4 */             this.f8336b = li0Var;
/* 12 */            this.f8335a = li0Var.f13298b.iterator();
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
/* 3 */             return this.f8335a.hasNext();
                }

                @Override // java.util.Iterator
                public final Object next() {
/* 11 */            return this.f8336b.f13299c.invoke(this.f8335a.next());
                }

                @Override // java.util.Iterator
                public final void remove() {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }
            }
