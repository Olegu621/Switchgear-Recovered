            package p000;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class my1 extends tj2 implements Function2 {

                /* JADX INFO: renamed from: a */
                public int f14060a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ long f14061b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public my1(long j, c10 c10Var) {
/* 4 */             super(2, c10Var);
/* 1 */             this.f14061b = j;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 5 */             return new my1(this.f14061b, c10Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((my1) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.f14060a;
/* 6 */             if (i == 0) {
/* 21 */                pg3.m7417A(obj);
/* 24 */                this.f14060a = 1;
/* 32 */                if (w11.m9431h(this.f14061b, this) == z10Var) {
/* 34 */                    return z10Var;
                        }
                    } else {
/* 8 */                 if (i != 1) {
/* 16 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 19 */                    return null;
                        }
/* 10 */                pg3.m7417A(obj);
                    }
/* 35 */            return Unit.f12910a;
                }
            }
