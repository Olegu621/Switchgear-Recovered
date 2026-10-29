            package p000;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ky1 extends tj2 implements Function2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f13039a;

                /* JADX INFO: renamed from: b */
                public int f13040b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f13041c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ ky1(Object obj, c10 c10Var, int i) {
/* 6 */             super(2, c10Var);
/* 1 */             this.f13039a = i;
/* 3 */             this.f13041c = obj;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 1 */             int i = this.f13039a;
/* 3 */             Object obj2 = this.f13041c;
                    switch (i) {
                        case 0:
/* 31 */                    return new ky1((e70) obj2, c10Var, 0);
                        case 1:
/* 22 */                    return new ky1((e70) obj2, c10Var, 1);
                        default:
/* 13 */                    return new ky1((pd1) obj2, c10Var, 2);
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
/* 3 */             y10 y10Var = (y10) obj;
/* 5 */             c10 c10Var = (c10) obj2;
                    switch (this.f13039a) {
                        case 0:
                            break;
                        case 1:
                            break;
                    }
/* 18 */            return ((ky1) create(y10Var, c10Var)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             int i = this.f13039a;
/* 3 */             Object obj2 = this.f13041c;
                    switch (i) {
                        case 0:
/* 78 */                    z10 z10Var = z10.f19902a;
/* 80 */                    int i2 = this.f13040b;
/* 82 */                    if (i2 == 0) {
/* 95 */                        pg3.m7417A(obj);
/* 100 */                       this.f13040b = 1;
/* 102 */                       Object objAwait = ((e70) obj2).await(this);
                                return objAwait == z10Var ? z10Var : objAwait;
                            }
/* 84 */                    if (i2 == 1) {
/* 86 */                        pg3.m7417A(obj);
/* 109 */                       return obj;
                            }
/* 90 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 8 */                     return null;
                        case 1:
/* 46 */                    z10 z10Var2 = z10.f19902a;
/* 48 */                    int i3 = this.f13040b;
                            try {
/* 50 */                        if (i3 == 0) {
/* 63 */                            pg3.m7417A(obj);
/* 68 */                            this.f13040b = 1;
/* 70 */                            obj = ((e70) obj2).await(this);
/* 74 */                            if (obj == z10Var2) {
/* 76 */                                obj = z10Var2;
                                    }
                                } else {
/* 52 */                            if (i3 != 1) {
/* 58 */                                f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 8 */                                 return null;
                                    }
/* 54 */                            pg3.m7417A(obj);
                                }
/* 77 */                        return obj;
                            } catch (Exception unused) {
                            }
                            break;
                        default:
/* 12 */                    z10 z10Var3 = z10.f19902a;
/* 14 */                    int i4 = this.f13040b;
/* 16 */                    if (i4 != 0) {
/* 18 */                        if (i4 == 1) {
/* 20 */                            pg3.m7417A(obj);
/* 45 */                            return obj;
                                }
/* 24 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 8 */                         return null;
                            }
/* 29 */                    pg3.m7417A(obj);
/* 34 */                    rd1 rd1Var = ((pd1) obj2).f15072a;
/* 36 */                    this.f13040b = 1;
/* 38 */                    Object objM8143c = rd1Var.m8143c(this);
                            return objM8143c == z10Var3 ? z10Var3 : objM8143c;
                    }
                }
            }
