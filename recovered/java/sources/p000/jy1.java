            package p000;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class jy1 extends tj2 implements Function2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f12541a;

                /* JADX INFO: renamed from: b */
                public int f12542b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ e70 f12543c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Function1 f12544d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ jy1(int i, c10 c10Var, e70 e70Var, Function1 function1) {
/* 8 */             super(2, c10Var);
/* 1 */             this.f12541a = i;
/* 3 */             this.f12543c = e70Var;
/* 5 */             this.f12544d = function1;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
                    switch (this.f12541a) {
                        case 0:
/* 46 */                    return new jy1(0, c10Var, this.f12543c, this.f12544d);
                        case 1:
/* 35 */                    return new jy1(1, c10Var, this.f12543c, this.f12544d);
                        case 2:
/* 24 */                    return new jy1(2, c10Var, this.f12543c, this.f12544d);
                        default:
/* 13 */                    return new jy1(3, c10Var, this.f12543c, this.f12544d);
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
/* 3 */             y10 y10Var = (y10) obj;
/* 5 */             c10 c10Var = (c10) obj2;
                    switch (this.f12541a) {
                        case 0:
                            break;
                        case 1:
                            break;
                        case 2:
                            break;
                    }
/* 18 */            return ((jy1) create(y10Var, c10Var)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.f12541a;
/* 3 */             Function1 function1 = this.f12544d;
/* 5 */             e70 e70Var = this.f12543c;
                    switch (i) {
                        case 0:
/* 127 */                   z10 z10Var = z10.f19902a;
/* 129 */                   int i2 = this.f12542b;
                            try {
/* 131 */                       if (i2 == 0) {
/* 145 */                           pg3.m7417A(obj);
/* 148 */                           this.f12542b = 1;
/* 154 */                           if (e70Var.await(this) == z10Var) {
/* 156 */                               return z10Var;
                                    }
                                } else {
/* 133 */                           if (i2 != 1) {
/* 141 */                               f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 7 */                                 return null;
                                    }
/* 135 */                           pg3.m7417A(obj);
                                }
                                break;
                            } catch (Exception e) {
/* 158 */                       function1.invoke(e);
                            }
/* 161 */                   return Unit.f12910a;
                        case 1:
/* 90 */                    z10 z10Var2 = z10.f19902a;
/* 92 */                    int i3 = this.f12542b;
                            try {
/* 94 */                        if (i3 == 0) {
/* 108 */                           pg3.m7417A(obj);
/* 111 */                           this.f12542b = 1;
/* 117 */                           if (e70Var.await(this) == z10Var2) {
/* 119 */                               return z10Var2;
                                    }
                                } else {
/* 96 */                            if (i3 != 1) {
/* 104 */                               f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 7 */                                 return null;
                                    }
/* 98 */                            pg3.m7417A(obj);
                                }
                                break;
                            } catch (Exception e2) {
/* 121 */                       function1.invoke(e2);
                            }
/* 124 */                   return Unit.f12910a;
                        case 2:
/* 53 */                    z10 z10Var3 = z10.f19902a;
/* 55 */                    int i4 = this.f12542b;
                            try {
/* 57 */                        if (i4 == 0) {
/* 72 */                            pg3.m7417A(obj);
/* 75 */                            this.f12542b = 1;
/* 77 */                            obj = e70Var.await(this);
/* 81 */                            if (obj == z10Var3) {
/* 83 */                                obj = z10Var3;
                                    }
                                } else {
/* 59 */                            if (i4 != 1) {
/* 67 */                                f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 7 */                                 return null;
                                    }
/* 61 */                            pg3.m7417A(obj);
                                }
/* 89 */                        return obj;
                            } catch (Exception e3) {
/* 85 */                        return function1.invoke(e3);
                            }
                        default:
/* 14 */                    z10 z10Var4 = z10.f19902a;
/* 16 */                    int i5 = this.f12542b;
                            try {
/* 18 */                        if (i5 == 0) {
/* 33 */                            pg3.m7417A(obj);
/* 36 */                            this.f12542b = 1;
/* 38 */                            obj = e70Var.await(this);
/* 42 */                            if (obj == z10Var4) {
/* 44 */                                obj = z10Var4;
                                    }
                                } else {
/* 20 */                            if (i5 != 1) {
/* 28 */                                f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 7 */                                 return null;
                                    }
/* 22 */                            pg3.m7417A(obj);
                                }
/* 45 */                        return obj;
                            } catch (Exception e4) {
/* 52 */                        throw ((Throwable) function1.invoke(e4));
                            }
                    }
                }
            }
