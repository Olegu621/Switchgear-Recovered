            package p000;

            import kotlin.coroutines.CoroutineContext;
            import kotlin.coroutines.InterfaceC1843d;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
/* 11 */    public abstract class d10 extends AbstractC0181bi {
                private final CoroutineContext _context;
                private transient c10 intercepted;

                public d10(c10 c10Var) {
/* 9 */             this(c10Var, c10Var != null ? c10Var.getContext() : null);
                }

                @Override // p000.c10
                public CoroutineContext getContext() {
/* 1 */             CoroutineContext coroutineContext = this._context;
/* 3 */             coroutineContext.getClass();
/* 6 */             return coroutineContext;
                }

                public final c10 intercepted() {
/* 1 */             c10 c10Var = this.intercepted;
/* 3 */             if (c10Var != null) {
/* 31 */                return c10Var;
                    }
/* 15 */            InterfaceC1843d interfaceC1843d = (InterfaceC1843d) getContext().get(InterfaceC1843d.f12918S);
/* 27 */            c10 p80Var = interfaceC1843d != null ? new p80((s10) interfaceC1843d, this) : this;
/* 28 */            this.intercepted = p80Var;
/* 30 */            return p80Var;
                }

                @Override // p000.AbstractC0181bi
                public void releaseIntercepted() {
/* 1 */             c10 c10Var = this.intercepted;
/* 3 */             if (c10Var != null && c10Var != this) {
/* 13 */                CoroutineContext.Element element = getContext().get(InterfaceC1843d.f12918S);
/* 17 */                element.getClass();
/* 22 */                p80 p80Var = (p80) c10Var;
/* 24 */                p80Var.m7348k();
/* 27 */                C0890er c0890erM7350m = p80Var.m7350m();
/* 31 */                if (c0890erM7350m != null) {
/* 33 */                    c0890erM7350m.m3565o();
                        }
                    }
/* 38 */            this.intercepted = C1943mx.f14056a;
                }

/* 12 */        public d10(c10 c10Var, CoroutineContext coroutineContext) {
/* 13 */            super(c10Var);
/* 14 */            this._context = coroutineContext;
                }
            }
