            package p000;

            import kotlin.Unit;
            import kotlin.coroutines.CoroutineContext;
            import kotlin.coroutines.InterfaceC1843d;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: renamed from: bt */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C0192bt extends AbstractC0155at {

                /* JADX INFO: renamed from: d */
                public final fk0 f2592d;

                public C0192bt(fk0 fk0Var, CoroutineContext coroutineContext, int i, EnumC2464xk enumC2464xk) {
/* 1 */             super(coroutineContext, i, enumC2464xk);
/* 4 */             this.f2592d = fk0Var;
                }

                @Override // p000.AbstractC0155at
                /* JADX INFO: renamed from: a */
                public final Object mo1162a(xx1 xx1Var, c10 c10Var) {
/* 8 */             Object objCollect = this.f2592d.collect(new n92(xx1Var), c10Var);
/* 12 */            z10 z10Var = z10.f19902a;
/* 14 */            if (objCollect != z10Var) {
/* 17 */                objCollect = Unit.f12910a;
                    }
                    return objCollect == z10Var ? objCollect : Unit.f12910a;
                }

                @Override // p000.AbstractC0155at, p000.fk0
                public final Object collect(hk0 hk0Var, c10 c10Var) throws Throwable {
/* 4 */             if (this.f2087b == -3) {
/* 6 */                 CoroutineContext context = c10Var.getContext();
/* 10 */                Boolean bool = Boolean.FALSE;
/* 12 */                p10 p10Var = p10.f14947a;
/* 14 */                CoroutineContext coroutineContext = this.f2086a;
/* 34 */                CoroutineContext coroutineContextPlus = !((Boolean) coroutineContext.fold(bool, p10Var)).booleanValue() ? context.plus(coroutineContext) : j13.m5645g(context, coroutineContext, false);
/* 42 */                if (Intrinsics.m6216a(coroutineContextPlus, context)) {
/* 46 */                    Object objCollect = this.f2592d.collect(hk0Var, c10Var);
/* 50 */                    z10 z10Var = z10.f19902a;
/* 52 */                    if (objCollect != z10Var) {
/* 55 */                        objCollect = Unit.f12910a;
                            }
                            return objCollect == z10Var ? objCollect : Unit.f12910a;
                        }
/* 63 */                e10 e10Var = InterfaceC1843d.f12918S;
/* 77 */                if (Intrinsics.m6216a(coroutineContextPlus.get(e10Var), context.get(e10Var))) {
/* 79 */                    CoroutineContext context2 = c10Var.getContext();
/* 85 */                    if (!(hk0Var instanceof n92)) {
/* 90 */                        hk0Var = new ok0(hk0Var, context2);
                            }
/* 105 */                   Object objM5959M = k50.m5959M(coroutineContextPlus, hk0Var, co2.m1740b(coroutineContextPlus), new C2223tm(this, null, 2), c10Var);
                            return objM5959M == z10.f19902a ? objM5959M : Unit.f12910a;
                        }
                    }
/* 117 */           Object objCollect2 = super.collect(hk0Var, c10Var);
                    return objCollect2 == z10.f19902a ? objCollect2 : Unit.f12910a;
                }

                @Override // p000.AbstractC0155at
                public final String toString() {
/* 23 */            return this.f2592d + " -> " + super.toString();
                }
            }
