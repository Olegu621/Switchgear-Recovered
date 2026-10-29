            package p000;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function0;
            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class iy1 extends tj2 implements Function2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f11963a;

                /* JADX INFO: renamed from: b */
                public int f11964b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ e70 f11965c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Function0 f11966d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ iy1(e70 e70Var, Function0 function0, c10 c10Var, int i) {
/* 8 */             super(2, c10Var);
/* 1 */             this.f11963a = i;
/* 3 */             this.f11965c = e70Var;
/* 5 */             this.f11966d = function0;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
                    switch (this.f11963a) {
                        case 0:
/* 24 */                    return new iy1(this.f11965c, this.f11966d, c10Var, 0);
                        default:
/* 13 */                    return new iy1(this.f11965c, this.f11966d, c10Var, 1);
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
/* 3 */             y10 y10Var = (y10) obj;
/* 5 */             c10 c10Var = (c10) obj2;
                    switch (this.f11963a) {
                        case 0:
                            break;
                    }
/* 18 */            return ((iy1) create(y10Var, c10Var)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             int i = this.f11963a;
/* 3 */             e70 e70Var = this.f11965c;
/* 8 */             Function0 function0 = this.f11966d;
                    switch (i) {
                        case 0:
/* 56 */                    z10 z10Var = z10.f19902a;
/* 58 */                    int i2 = this.f11964b;
                            try {
/* 60 */                        if (i2 == 0) {
/* 74 */                            pg3.m7417A(obj);
/* 77 */                            this.f11964b = 1;
/* 83 */                            if (e70Var.await(this) == z10Var) {
/* 85 */                                return z10Var;
                                    }
                                } else {
/* 62 */                            if (i2 != 1) {
/* 70 */                                f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 5 */                                 return null;
                                    }
/* 64 */                            pg3.m7417A(obj);
                                }
                                break;
                            } catch (Exception unused) {
                            } finally {
/* 91 */                        function0.invoke();
                            }
/* 95 */                    return Unit.f12910a;
                        default:
/* 14 */                    z10 z10Var2 = z10.f19902a;
/* 16 */                    int i3 = this.f11964b;
                            try {
/* 18 */                        if (i3 == 0) {
/* 32 */                            pg3.m7417A(obj);
/* 35 */                            this.f11964b = 1;
/* 41 */                            if (e70Var.await(this) == z10Var2) {
/* 43 */                                return z10Var2;
                                    }
                                } else {
/* 20 */                            if (i3 != 1) {
/* 28 */                                f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 5 */                                 return null;
                                    }
/* 22 */                            pg3.m7417A(obj);
                                }
                                break;
                            } catch (Exception unused2) {
                            } finally {
/* 49 */                        function0.invoke();
                            }
/* 53 */                    return Unit.f12910a;
                    }
                }
            }
