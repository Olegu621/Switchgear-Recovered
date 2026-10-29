            package p000;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class f40 extends tj2 implements Function1 {

                /* JADX INFO: renamed from: a */
                public int f7992a;

                @Override // p000.AbstractC0181bi
                public final c10 create(c10 c10Var) {
/* 4 */             return new f40(1, c10Var);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
/* 11 */            return ((f40) create((c10) obj)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.f7992a;
/* 7 */             if (i == 0) {
/* 23 */                pg3.m7417A(obj);
/* 26 */                this.f7992a = 1;
/* 28 */                throw null;
                    }
/* 9 */             if (i == 1) {
/* 11 */                pg3.m7417A(obj);
/* 14 */                return Unit.f12910a;
                    }
/* 19 */            f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 5 */             return null;
                }
            }
