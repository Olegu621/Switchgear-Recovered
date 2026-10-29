            package p000;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class v80 extends tj2 implements Function2 {

                /* JADX INFO: renamed from: a */
                public int f17909a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ long f17910b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ x80 f17911c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ C2223tm f17912d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ C0875ec f17913e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public v80(long j, x80 x80Var, C2223tm c2223tm, C0875ec c0875ec, c10 c10Var) {
/* 10 */            super(2, c10Var);
/* 1 */             this.f17910b = j;
/* 3 */             this.f17911c = x80Var;
/* 5 */             this.f17912d = c2223tm;
/* 7 */             this.f17913e = c0875ec;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 12 */            return new v80(this.f17910b, this.f17911c, this.f17912d, this.f17913e, c10Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((v80) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.f17909a;
/* 6 */             if (i == 0) {
/* 21 */                pg3.m7417A(obj);
/* 34 */                u80 u80Var = new u80(this.f17911c, this.f17912d, this.f17913e, null, 0);
/* 37 */                this.f17909a = 1;
/* 45 */                if (qj3.m7885R(this.f17910b, u80Var, this) == z10Var) {
/* 47 */                    return z10Var;
                        }
                    } else {
/* 8 */                 if (i != 1) {
/* 16 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 19 */                    return null;
                        }
/* 10 */                pg3.m7417A(obj);
                    }
/* 48 */            return Unit.f12910a;
                }
            }
