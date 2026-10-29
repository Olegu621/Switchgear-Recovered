            package p000;

            import kotlin.Unit;
            import kotlin.coroutines.CoroutineContext;
            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: renamed from: i */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public abstract class AbstractC1010i extends z01 implements c10, y10 {

                /* JADX INFO: renamed from: e */
                public final CoroutineContext f9377e;

                public AbstractC1010i(CoroutineContext coroutineContext, boolean z) {
/* 1 */             super(z);
/* 12 */            m10236A((h01) coroutineContext.get(xt0.f19368w));
/* 19 */            this.f9377e = coroutineContext.plus(this);
                }

                @Override // p000.z01
                /* JADX INFO: renamed from: I */
                public final void mo4402I(Object obj) {
/* 3 */             if (!(obj instanceof C1980nx)) {
/* 24 */                mo4404V(obj);
/* 27 */                return;
                    }
/* 5 */             C1980nx c1980nx = (C1980nx) obj;
/* 20 */            mo4403U(C1980nx.f14554b.get(c1980nx) != 0, c1980nx.f14555a);
                }

                /* JADX INFO: renamed from: U */
                public void mo4403U(boolean z, Throwable th) {
                }

                /* JADX INFO: renamed from: V */
                public void mo4404V(Object obj) {
                }

                /* JADX INFO: renamed from: W */
                public final void m4405W(b20 b20Var, AbstractC1010i abstractC1010i, Function2 function2) {
                    Object objInvoke;
/* 1 */             int iOrdinal = b20Var.ordinal();
/* 5 */             if (iOrdinal == 0) {
/* 94 */                w11.m9396F(function2, abstractC1010i, this);
/* 97 */                return;
                    }
/* 8 */             if (iOrdinal != 1) {
/* 11 */                if (iOrdinal == 2) {
/* 75 */                    function2.getClass();
/* 82 */                    c10 c10VarM6834b = mz0.m6834b(mz0.m6833a(abstractC1010i, this, function2));
/* 86 */                    Unit unit = Unit.f12910a;
/* 88 */                    m42 m42Var = o42.f14612b;
/* 90 */                    c10VarM6834b.resumeWith(unit);
/* 93 */                    return;
                        }
/* 14 */                if (iOrdinal != 3) {
/* 71 */                    ds0.m3187b();
/* 74 */                    return;
                        }
                        try {
/* 16 */                    CoroutineContext coroutineContext = this.f9377e;
/* 19 */                    Object objM1741c = co2.m1741c(coroutineContext, null);
                            try {
/* 25 */                        if (function2 instanceof AbstractC0181bi) {
/* 34 */                            gs2.m4011b(2, function2);
/* 37 */                            objInvoke = function2.invoke(abstractC1010i, this);
                                } else {
/* 27 */                            objInvoke = mz0.m6835c(function2, abstractC1010i, this);
                                }
/* 41 */                        co2.m1739a(coroutineContext, objM1741c);
/* 46 */                        if (objInvoke != z10.f19902a) {
/* 48 */                            m42 m42Var2 = o42.f14612b;
/* 50 */                            resumeWith(objInvoke);
                                }
                            } catch (Throwable th) {
/* 56 */                        co2.m1739a(coroutineContext, objM1741c);
/* 59 */                        throw th;
                            }
                        } catch (Throwable th2) {
/* 60 */                    m42 m42Var3 = o42.f14612b;
/* 67 */                    resumeWith(new n42(th2));
                        }
                    }
                }

                @Override // p000.y10
                /* JADX INFO: renamed from: c */
                public final CoroutineContext mo4406c() {
/* 1 */             return this.f9377e;
                }

                @Override // p000.c10
                public final CoroutineContext getContext() {
/* 1 */             return this.f9377e;
                }

                @Override // p000.z01
                /* JADX INFO: renamed from: m */
                public final String mo4407m() {
/* 11 */            return getClass().getSimpleName().concat(" was cancelled");
                }

                @Override // p000.c10
                public final void resumeWith(Object obj) {
/* 1 */             Throwable thM7099a = o42.m7099a(obj);
/* 5 */             if (thM7099a != null) {
/* 11 */                obj = new C1980nx(false, thM7099a);
                    }
/* 14 */            Object objM10239E = m10239E(obj);
/* 20 */            if (objM10239E == j13.f11997g) {
/* 22 */                return;
                    }
/* 23 */            mo6307h(objM10239E);
                }

                @Override // p000.z01
                /* JADX INFO: renamed from: z */
                public final void mo4408z(C2086px c2086px) {
/* 3 */             b40.m1231o(c2086px, this.f9377e);
                }
            }
