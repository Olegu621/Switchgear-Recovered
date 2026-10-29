            package p000;

            import kotlin.Unit;
            import kotlin.coroutines.C1846g;
            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class n40 extends tj2 implements Function2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f14117a;

                /* JADX INFO: renamed from: b */
                public int f14118b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ b50 f14119c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ n40(b50 b50Var, c10 c10Var, int i) {
/* 6 */             super(2, c10Var);
/* 1 */             this.f14117a = i;
/* 3 */             this.f14119c = b50Var;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 1 */             int i = this.f14117a;
/* 3 */             b50 b50Var = this.f14119c;
                    switch (i) {
                        case 0:
/* 25 */                    return new n40(b50Var, c10Var, 0);
                        case 1:
/* 18 */                    return new n40(b50Var, c10Var, 1);
                        default:
/* 11 */                    return new n40(b50Var, c10Var, 2);
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f14117a) {
                        case 0:
/* 52 */                    return ((n40) create((hk0) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                        case 1:
/* 35 */                    return ((n40) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                        default:
/* 18 */                    return ((n40) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
                
                    if (r10 == r7) goto L20;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:43:0x00a9, code lost:
                
                    if (r10.collect(r1, r9) == r0) goto L44;
                 */
                @Override // p000.AbstractC0181bi
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.f14117a;
/* 6 */             b50 b50Var = this.f14119c;
                    switch (i) {
                        case 0:
/* 177 */                   z10 z10Var = z10.f19902a;
/* 179 */                   int i2 = this.f14118b;
/* 181 */                   if (i2 == 0) {
/* 193 */                       pg3.m7417A(obj);
/* 196 */                       this.f14118b = 1;
/* 202 */                       if (b50.m1282d(b50Var, this) == z10Var) {
/* 204 */                           return z10Var;
                                }
                            } else {
/* 183 */                       if (i2 != 1) {
/* 189 */                           f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 10 */                            return null;
                                }
/* 185 */                       pg3.m7417A(obj);
                            }
/* 206 */                   return Unit.f12910a;
                        case 1:
/* 85 */                    z10 z10Var2 = z10.f19902a;
/* 87 */                    int i3 = this.f14118b;
/* 89 */                    if (i3 != 0) {
/* 91 */                        if (i3 == 1) {
/* 103 */                           pg3.m7417A(obj);
                                } else {
/* 93 */                            if (i3 != 2) {
/* 99 */                                f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 10 */                                return null;
                                    }
/* 95 */                            pg3.m7417A(obj);
                                }
/* 174 */                       return Unit.f12910a;
                            }
/* 107 */                   pg3.m7417A(obj);
/* 110 */                   ra2 ra2Var = b50Var.f2224i;
/* 112 */                   this.f14118b = 1;
/* 118 */                   Object objM10250i = ((C1869kx) ra2Var.f15956b).m10250i(this);
/* 122 */                   if (objM10250i != z10Var2) {
/* 125 */                       objM10250i = Unit.f12910a;
                            }
/* 127 */                   if (objM10250i != z10Var2) {
                            }
/* 172 */                   return z10Var2;
/* 134 */                   fk0 fk0Var = b50Var.m1286g().f15505c;
/* 136 */                   EnumC2464xk enumC2464xk = EnumC2464xk.f19233b;
/* 155 */                   fk0 fk0VarM1228l = fk0Var instanceof wo0 ? b40.m1228l((C2149rm) ((wo0) fk0Var), null, 0, enumC2464xk, 1) : new C0192bt(fk0Var, C1846g.f12919a, 0, enumC2464xk);
/* 161 */                   C2186sm c2186sm = new C2186sm(b50Var, 2);
/* 164 */                   this.f14118b = 2;
                            break;
                        default:
/* 14 */                    gr0 gr0Var = b50Var.f2223h;
/* 16 */                    z10 z10Var3 = z10.f19902a;
/* 18 */                    int i4 = this.f14118b;
                            try {
/* 20 */                        if (i4 == 0) {
/* 38 */                            pg3.m7417A(obj);
/* 47 */                            if (gr0Var.m4001r() instanceof mi0) {
/* 49 */                                return gr0Var.m4001r();
                                    }
/* 54 */                            this.f14118b = 1;
/* 60 */                            if (b50Var.m1287h(this) != z10Var3) {
                                    }
/* 71 */                            return z10Var3;
                                }
/* 22 */                        if (i4 == 1) {
/* 34 */                            pg3.m7417A(obj);
                                } else {
/* 24 */                            if (i4 != 2) {
/* 30 */                                f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 10 */                                return null;
                                    }
/* 26 */                            pg3.m7417A(obj);
                                }
/* 74 */                        return (og2) obj;
/* 63 */                        this.f14118b = 2;
/* 65 */                        obj = b50.m1283e(b50Var, false, this);
                            } catch (Throwable th) {
/* 81 */                        return new v02(-1, th);
                            }
                            break;
                    }
                }
            }
