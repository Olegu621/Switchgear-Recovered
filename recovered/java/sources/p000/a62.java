            package p000;

            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class a62 extends d62 implements Iterator {

                /* JADX INFO: renamed from: a */
                public b62 f97a;

                /* JADX INFO: renamed from: b */
                public b62 f98b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ int f99c;

                public a62(b62 b62Var, b62 b62Var2, int i) {
/* 1 */             this.f99c = i;
/* 6 */             this.f97a = b62Var2;
/* 8 */             this.f98b = b62Var;
                }

                @Override // p000.d62
                /* JADX INFO: renamed from: a */
                public final void mo84a(b62 b62Var) {
                    b62 b62Var2;
/* 3 */             b62 b62VarM85b = null;
/* 4 */             if (this.f97a == b62Var && b62Var == this.f98b) {
/* 10 */                this.f98b = null;
/* 12 */                this.f97a = null;
                    }
/* 14 */            b62 b62Var3 = this.f97a;
/* 16 */            if (b62Var3 == b62Var) {
                        switch (this.f99c) {
                            case 0:
/* 26 */                        b62Var2 = b62Var3.f2242d;
                                break;
                            default:
/* 23 */                        b62Var2 = b62Var3.f2241c;
                                break;
                        }
/* 28 */                this.f97a = b62Var2;
                    }
/* 30 */            b62 b62Var4 = this.f98b;
/* 32 */            if (b62Var4 == b62Var) {
/* 34 */                b62 b62Var5 = this.f97a;
/* 36 */                if (b62Var4 != b62Var5 && b62Var5 != null) {
/* 41 */                    b62VarM85b = m85b(b62Var4);
                        }
/* 45 */                this.f98b = b62VarM85b;
                    }
                }

                /* JADX INFO: renamed from: b */
                public final b62 m85b(b62 b62Var) {
                    switch (this.f99c) {
                        case 0:
/* 9 */                     return b62Var.f2241c;
                        default:
/* 6 */                     return b62Var.f2242d;
                    }
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    return this.f98b != null;
                }

                @Override // java.util.Iterator
                public final Object next() {
/* 1 */             b62 b62Var = this.f98b;
/* 3 */             b62 b62Var2 = this.f97a;
/* 16 */            this.f98b = (b62Var == b62Var2 || b62Var2 == null) ? null : m85b(b62Var);
/* 18 */            return b62Var;
                }
            }
