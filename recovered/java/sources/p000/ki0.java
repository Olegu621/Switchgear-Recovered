            package p000;

            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class ki0 implements Iterator, r21 {

                /* JADX INFO: renamed from: a */
                public final Iterator f12784a;

                /* JADX INFO: renamed from: b */
                public int f12785b = -1;

                /* JADX INFO: renamed from: c */
                public Object f12786c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ li0 f12787d;

                public ki0(li0 li0Var) {
/* 4 */             this.f12787d = li0Var;
/* 15 */            this.f12784a = new fr2((li0) li0Var.f13298b);
                }

                /* JADX INFO: renamed from: a */
                public final void m6112a() {
                    Object next;
/* 29 */            do {
/* 1 */                 Iterator it = this.f12784a;
/* 7 */                 if (!it.hasNext()) {
/* 38 */                    this.f12785b = 0;
/* 40 */                    return;
                        }
/* 9 */                 next = it.next();
/* 29 */            } while (((Boolean) ((C0197bz) this.f12787d.f13299c).invoke(next)).booleanValue());
/* 31 */            this.f12786c = next;
/* 34 */            this.f12785b = 1;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
/* 4 */             if (this.f12785b == -1) {
/* 6 */                 m6112a();
                    }
                    return this.f12785b == 1;
                }

                @Override // java.util.Iterator
                public final Object next() {
/* 4 */             if (this.f12785b == -1) {
/* 6 */                 m6112a();
                    }
/* 11 */            if (this.f12785b == 0) {
/* 21 */                C1951n4.m6864o();
/* 24 */                return null;
                    }
/* 13 */            Object obj = this.f12786c;
/* 16 */            this.f12786c = null;
/* 18 */            this.f12785b = -1;
/* 20 */            return obj;
                }

                @Override // java.util.Iterator
                public final void remove() {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }
            }
