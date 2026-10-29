            package p000;

            import java.util.LinkedHashMap;
            import java.util.concurrent.atomic.AtomicBoolean;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class fw1 extends tj2 implements Function2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f8381a;

                /* JADX INFO: renamed from: b */
                public int f8382b;

                /* JADX INFO: renamed from: c */
                public /* synthetic */ Object f8383c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Function2 f8384d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ fw1(Function2 function2, c10 c10Var, int i) {
/* 6 */             super(2, c10Var);
/* 1 */             this.f8381a = i;
/* 3 */             this.f8384d = function2;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 1 */             int i = this.f8381a;
/* 3 */             Function2 function2 = this.f8384d;
                    switch (i) {
                        case 0:
/* 20 */                    fw1 fw1Var = new fw1(function2, c10Var, 0);
/* 23 */                    fw1Var.f8383c = obj;
/* 25 */                    return fw1Var;
                        default:
/* 11 */                    fw1 fw1Var2 = new fw1(function2, c10Var, 1);
/* 14 */                    fw1Var2.f8383c = obj;
/* 16 */                    return fw1Var2;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
/* 3 */             vk1 vk1Var = (vk1) obj;
/* 5 */             c10 c10Var = (c10) obj2;
                    switch (this.f8381a) {
                        case 0:
                            break;
                    }
/* 18 */            return ((fw1) create(vk1Var, c10Var)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             int i = this.f8381a;
/* 3 */             Function2 function2 = this.f8384d;
                    switch (i) {
                        case 0:
/* 67 */                    z10 z10Var = z10.f19902a;
/* 69 */                    int i2 = this.f8382b;
/* 71 */                    if (i2 == 0) {
/* 83 */                        pg3.m7417A(obj);
/* 88 */                        vk1 vk1Var = (vk1) this.f8383c;
/* 90 */                        this.f8382b = 1;
/* 92 */                        obj = function2.invoke(vk1Var, this);
/* 96 */                        if (obj == z10Var) {
/* 98 */                            return z10Var;
                                }
                            } else {
/* 73 */                        if (i2 != 1) {
/* 79 */                            f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 5 */                             return null;
                                }
/* 75 */                        pg3.m7417A(obj);
                            }
/* 101 */                   vk1 vk1Var2 = (vk1) obj;
/* 103 */                   vk1Var2.getClass();
/* 112 */                   ((AtomicBoolean) vk1Var2.f18232b.f8789a).set(true);
/* 115 */                   return vk1Var2;
                        default:
/* 12 */                    z10 z10Var2 = z10.f19902a;
/* 14 */                    int i3 = this.f8382b;
/* 16 */                    if (i3 == 0) {
/* 33 */                        pg3.m7417A(obj);
/* 52 */                        vk1 vk1Var3 = new vk1(new LinkedHashMap(((vk1) this.f8383c).m9298a()), false);
/* 55 */                        this.f8383c = vk1Var3;
/* 57 */                        this.f8382b = 1;
                                return function2.invoke(vk1Var3, this) == z10Var2 ? z10Var2 : vk1Var3;
                            }
/* 18 */                    if (i3 != 1) {
/* 29 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 5 */                         return null;
                            }
/* 23 */                    vk1 vk1Var4 = (vk1) this.f8383c;
/* 25 */                    pg3.m7417A(obj);
/* 66 */                    return vk1Var4;
                    }
                }
            }
