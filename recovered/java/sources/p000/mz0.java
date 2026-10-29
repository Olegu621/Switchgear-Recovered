            package p000;

            import kotlin.coroutines.C1846g;
            import kotlin.coroutines.CoroutineContext;
            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public class mz0 {
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: a */
                public static c10 m6833a(c10 c10Var, c10 c10Var2, Function2 function2) {
/* 1 */             function2.getClass();
/* 6 */             if (function2 instanceof AbstractC0181bi) {
/* 10 */                return ((AbstractC0181bi) function2).create(c10Var, c10Var2);
                    }
/* 15 */            CoroutineContext context = c10Var2.getContext();
                    return context == C1846g.f12919a ? new iz0(c10Var2, c10Var, function2) : new jz0(c10Var2, context, function2, c10Var);
                }

                /* JADX INFO: renamed from: b */
                public static c10 m6834b(c10 c10Var) {
                    c10 c10VarIntercepted;
/* 1 */             c10Var.getClass();
/* 12 */            d10 d10Var = c10Var instanceof d10 ? (d10) c10Var : null;
                    return (d10Var == null || (c10VarIntercepted = d10Var.intercepted()) == null) ? c10Var : c10VarIntercepted;
                }

                /* JADX INFO: renamed from: c */
                public static Object m6835c(Function2 function2, Object obj, c10 c10Var) {
/* 1 */             function2.getClass();
/* 4 */             CoroutineContext context = c10Var.getContext();
/* 20 */            Object kz0Var = context == C1846g.f12919a ? new kz0(c10Var) : new lz0(c10Var, context);
/* 25 */            gs2.m4011b(2, function2);
/* 28 */            return function2.invoke(obj, kz0Var);
                }
            }
