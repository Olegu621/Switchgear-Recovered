            package p000;

            import kotlin.Unit;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 9 */     public final class o40 extends tj2 implements lo0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f14609a = 1;

                /* JADX INFO: renamed from: b */
                public int f14610b;

                /* JADX INFO: renamed from: c */
                public /* synthetic */ Object f14611c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public o40(b50 b50Var, c10 c10Var) {
/* 7 */             super(3, c10Var);
/* 4 */             this.f14611c = b50Var;
                }

                @Override // p000.lo0
                /* JADX INFO: renamed from: a */
                public final Object mo4450a(Object obj, Object obj2, Object obj3) {
                    switch (this.f14609a) {
                        case 0:
/* 47 */                    return new o40((b50) this.f14611c, (c10) obj3).invokeSuspend(Unit.f12910a);
                        default:
/* 10 */                    ((Boolean) obj2).getClass();
/* 18 */                    o40 o40Var = new o40(3, (c10) obj3);
/* 21 */                    o40Var.f14611c = (ph0) obj;
/* 25 */                    return o40Var.invokeSuspend(Unit.f12910a);
                    }
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
                    switch (this.f14609a) {
                        case 0:
/* 47 */                    z10 z10Var = z10.f19902a;
/* 49 */                    int i = this.f14610b;
/* 51 */                    if (i == 0) {
/* 63 */                        pg3.m7417A(obj);
/* 68 */                        b50 b50Var = (b50) this.f14611c;
/* 70 */                        this.f14610b = 1;
/* 76 */                        if (b50.m1280b(b50Var, this) == z10Var) {
/* 78 */                            return z10Var;
                                }
                            } else {
/* 53 */                        if (i != 1) {
/* 59 */                            f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 3 */                             return null;
                                }
/* 55 */                        pg3.m7417A(obj);
                            }
/* 80 */                    return Unit.f12910a;
                        default:
/* 10 */                    z10 z10Var2 = z10.f19902a;
/* 12 */                    int i2 = this.f14610b;
/* 14 */                    if (i2 != 0) {
/* 16 */                        if (i2 == 1) {
/* 18 */                            pg3.m7417A(obj);
/* 46 */                            return obj;
                                }
/* 22 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 3 */                         return null;
                            }
/* 27 */                    pg3.m7417A(obj);
/* 32 */                    ph0 ph0Var = (ph0) this.f14611c;
/* 34 */                    this.f14610b = 1;
/* 36 */                    ph0Var.getClass();
/* 39 */                    Object objM7447a = ph0.m7447a(ph0Var, this);
                            return objM7447a == z10Var2 ? z10Var2 : objM7447a;
                    }
                }

/* 10 */        public /* synthetic */ o40(int i, c10 c10Var) {
                    super(i, c10Var);
                }
            }
