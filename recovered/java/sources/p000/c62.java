            package p000;

            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class c62 extends d62 implements Iterator {

                /* JADX INFO: renamed from: a */
                public b62 f2746a;

                /* JADX INFO: renamed from: b */
                public boolean f2747b = true;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ e62 f2748c;

                public c62(e62 e62Var) {
/* 4 */             this.f2748c = e62Var;
                }

                @Override // p000.d62
                /* JADX INFO: renamed from: a */
                public final void mo84a(b62 b62Var) {
/* 1 */             b62 b62Var2 = this.f2746a;
/* 3 */             if (b62Var == b62Var2) {
/* 5 */                 b62 b62Var3 = b62Var2.f2242d;
/* 7 */                 this.f2746a = b62Var3;
/* 14 */                this.f2747b = b62Var3 == null;
                    }
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
/* 3 */             if (this.f2747b) {
                        return this.f2748c.f7556a != null;
                    }
/* 12 */            b62 b62Var = this.f2746a;
                    return (b62Var == null || b62Var.f2241c == null) ? false : true;
                }

                @Override // java.util.Iterator
                public final Object next() {
/* 3 */             if (this.f2747b) {
/* 6 */                 this.f2747b = false;
/* 12 */                this.f2746a = this.f2748c.f7556a;
                    } else {
/* 15 */                b62 b62Var = this.f2746a;
/* 23 */                this.f2746a = b62Var != null ? b62Var.f2241c : null;
                    }
/* 25 */            return this.f2746a;
                }
            }
