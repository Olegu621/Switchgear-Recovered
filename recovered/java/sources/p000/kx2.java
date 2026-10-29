            package p000;

            import kotlin.Pair;
            import kotlin.coroutines.CoroutineContext;
            import kotlin.coroutines.InterfaceC1843d;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class kx2 extends p72 {

                /* JADX INFO: renamed from: i */
                public final ThreadLocal f13038i;
                private volatile boolean threadLocalIsSet;

                /* JADX WARN: Illegal instructions before constructor call */
                public kx2(c10 c10Var, CoroutineContext coroutineContext) {
/* 1 */             lx2 lx2Var = lx2.f13526a;
/* 15 */            super(c10Var, coroutineContext.get(lx2Var) == null ? coroutineContext.plus(lx2Var) : coroutineContext);
/* 23 */            this.f13038i = new ThreadLocal();
/* 37 */            if (c10Var.getContext().get(InterfaceC1843d.f12918S) instanceof s10) {
/* 50 */                return;
                    }
/* 40 */            Object objM1741c = co2.m1741c(coroutineContext, null);
/* 44 */            co2.m1739a(coroutineContext, objM1741c);
/* 47 */            m6306Y(coroutineContext, objM1741c);
                }

                /* JADX INFO: renamed from: X */
                public final boolean m6305X() {
/* 16 */            boolean z = this.threadLocalIsSet && this.f13038i.get() == null;
/* 19 */            this.f13038i.remove();
/* 22 */            return !z;
                }

                /* JADX INFO: renamed from: Y */
                public final void m6306Y(CoroutineContext coroutineContext, Object obj) {
/* 2 */             this.threadLocalIsSet = true;
/* 11 */            this.f13038i.set(new Pair(coroutineContext, obj));
                }

                @Override // p000.p72, p000.z01
                /* JADX INFO: renamed from: h */
                public final void mo6307h(Object obj) {
/* 3 */             if (this.threadLocalIsSet) {
/* 11 */                Pair pair = (Pair) this.f13038i.get();
/* 13 */                if (pair != null) {
/* 21 */                    co2.m1739a((CoroutineContext) pair.f12908a, pair.f12909b);
                        }
/* 26 */                this.f13038i.remove();
                    }
/* 29 */            Object objM3016D = de3.m3016D(obj);
/* 33 */            c10 c10Var = this.f15010f;
/* 35 */            CoroutineContext context = c10Var.getContext();
/* 40 */            Object objM1741c = co2.m1741c(context, null);
/* 48 */            kx2 kx2VarM5638C = objM1741c != co2.f3022a ? j13.m5638C(c10Var, context, objM1741c) : null;
                    try {
/* 54 */                this.f15010f.resumeWith(objM3016D);
                    } finally {
/* 72 */                if (kx2VarM5638C == null || kx2VarM5638C.m6305X()) {
/* 80 */                    co2.m1739a(context, objM1741c);
                        }
                    }
                }
            }
