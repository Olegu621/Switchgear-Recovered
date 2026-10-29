            package p000;

            import java.util.Map;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function1;
            
            /* JADX INFO: renamed from: u3 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2241u3 extends tj2 implements Function1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f17336a;

                /* JADX INFO: renamed from: b */
                public int f17337b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f17338c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ C2241u3(Object obj, c10 c10Var, int i) {
/* 6 */             super(1, c10Var);
/* 1 */             this.f17336a = i;
/* 3 */             this.f17338c = obj;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(c10 c10Var) {
/* 1 */             int i = this.f17336a;
/* 3 */             Object obj = this.f17338c;
                    switch (i) {
                        case 0:
/* 31 */                    return new C2241u3((C2279v3) obj, c10Var, 0);
                        case 1:
/* 22 */                    return new C2241u3((y40) obj, c10Var, 1);
                        default:
/* 13 */                    return new C2241u3((k51) obj, c10Var, 2);
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
/* 3 */             c10 c10Var = (c10) obj;
                    switch (this.f17336a) {
                        case 0:
                            break;
                        case 1:
                            break;
                    }
/* 16 */            return ((C2241u3) create(c10Var)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             int i = this.f17336a;
/* 3 */             Object obj2 = this.f17338c;
                    switch (i) {
                        case 0:
/* 98 */                    z10 z10Var = z10.f19902a;
/* 100 */                   int i2 = this.f17337b;
/* 102 */                   if (i2 != 0) {
/* 104 */                       if (i2 == 1) {
/* 106 */                           pg3.m7417A(obj);
/* 162 */                           return obj;
                                }
/* 110 */                       f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 5 */                         return null;
                            }
/* 115 */                   pg3.m7417A(obj);
/* 118 */                   C2279v3 c2279v3 = (C2279v3) obj2;
/* 122 */                   C2130r3 c2130r3 = (C2130r3) c2279v3.f17848e;
/* 124 */                   Map mapM9255b = c2279v3.m9255b();
/* 128 */                   this.f17337b = 1;
/* 155 */                   Object objM10031c = c2130r3.f15840a.m10031c(c2130r3.f15841b.m4149a() + "/tcfac/acp.json", mapM9255b, this);
                            return objM10031c == z10Var ? z10Var : objM10031c;
                        case 1:
/* 66 */                    z10 z10Var2 = z10.f19902a;
/* 68 */                    int i3 = this.f17337b;
/* 70 */                    if (i3 == 0) {
/* 83 */                        pg3.m7417A(obj);
/* 88 */                        this.f17337b = 1;
/* 90 */                        Object objInvoke = ((y40) obj2).invoke(this);
                                return objInvoke == z10Var2 ? z10Var2 : objInvoke;
                            }
/* 72 */                    if (i3 == 1) {
/* 74 */                        pg3.m7417A(obj);
/* 97 */                        return obj;
                            }
/* 78 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 5 */                     return null;
                        default:
/* 12 */                    z10 z10Var3 = z10.f19902a;
/* 14 */                    int i4 = this.f17337b;
/* 16 */                    if (i4 != 0) {
/* 18 */                        if (i4 == 1) {
/* 20 */                            pg3.m7417A(obj);
/* 65 */                            return obj;
                                }
/* 24 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 5 */                         return null;
                            }
/* 29 */                    pg3.m7417A(obj);
/* 32 */                    k51 k51Var = (k51) obj2;
/* 36 */                    C2130r3 c2130r4 = (C2130r3) k51Var.f12600e;
/* 38 */                    Map mapM9255b2 = k51Var.m9255b();
/* 42 */                    this.f17337b = 1;
/* 58 */                    Object objM10031c2 = c2130r4.f15840a.m10031c(fm0.m3783i(c2130r4.f15841b.m4149a(), "/gvl/v3/en.json"), mapM9255b2, this);
                            return objM10031c2 == z10Var3 ? z10Var3 : objM10031c2;
                    }
                }
            }
