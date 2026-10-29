            package p000;

            import io.flutter.plugin.common.MethodChannel;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class us1 extends tj2 implements Function2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ MethodChannel.Result f17712a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public us1(MethodChannel.Result result, c10 c10Var) {
/* 4 */             super(2, c10Var);
/* 1 */             this.f17712a = result;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 5 */             return new us1(this.f17712a, c10Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((us1) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             pg3.m7417A(obj);
/* 10 */            this.f17712a.success(nd0.f14189a);
/* 13 */            return Unit.f12910a;
                }
            }
