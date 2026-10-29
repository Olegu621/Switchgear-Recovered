            package p000;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function0;
            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class t80 extends tj2 implements Function2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f16987a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Function0 f16988b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ t80(Function0 function0, c10 c10Var, int i) {
/* 6 */             super(2, c10Var);
/* 1 */             this.f16987a = i;
/* 3 */             this.f16988b = function0;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 1 */             int i = this.f16987a;
/* 3 */             Function0 function0 = this.f16988b;
                    switch (i) {
                        case 0:
/* 18 */                    return new t80(function0, c10Var, 0);
                        default:
/* 11 */                    return new t80(function0, c10Var, 1);
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
/* 3 */             y10 y10Var = (y10) obj;
/* 5 */             c10 c10Var = (c10) obj2;
                    switch (this.f16987a) {
                        case 0:
                            break;
                    }
/* 18 */            return ((t80) create(y10Var, c10Var)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             int i = this.f16987a;
/* 3 */             Function0 function0 = this.f16988b;
                    switch (i) {
                        case 0:
/* 18 */                    z10 z10Var = z10.f19902a;
/* 20 */                    pg3.m7417A(obj);
/* 23 */                    function0.invoke();
/* 26 */                    return Unit.f12910a;
                        default:
/* 8 */                     z10 z10Var2 = z10.f19902a;
/* 10 */                    pg3.m7417A(obj);
/* 13 */                    return function0.invoke();
                    }
                }
            }
