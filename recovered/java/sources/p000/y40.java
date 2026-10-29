            package p000;

            import java.io.Serializable;
            import kotlin.Unit;
            import kotlin.coroutines.CoroutineContext;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function2;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 13 */    public final class y40 extends tj2 implements Function1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f19471a = 1;

                /* JADX INFO: renamed from: b */
                public int f19472b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ b50 f19473c;

                /* JADX INFO: renamed from: d */
                public Object f19474d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Object f19475e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ Object f19476f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public y40(h22 h22Var, b50 b50Var, f22 f22Var, c10 c10Var) {
/* 11 */            super(1, c10Var);
/* 4 */             this.f19475e = h22Var;
/* 6 */             this.f19473c = b50Var;
/* 8 */             this.f19476f = f22Var;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(c10 c10Var) {
/* 1 */             int i = this.f19471a;
/* 3 */             Object obj = this.f19476f;
/* 5 */             Object obj2 = this.f19475e;
/* 7 */             b50 b50Var = this.f19473c;
                    switch (i) {
                        case 0:
/* 28 */                    return new y40((h22) obj2, b50Var, (f22) obj, c10Var);
                        default:
/* 18 */                    return new y40(b50Var, (CoroutineContext) obj2, (Function2) obj, c10Var);
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
/* 3 */             c10 c10Var = (c10) obj;
                    switch (this.f19471a) {
                        case 0:
                            break;
                    }
/* 16 */            return ((y40) create(c10Var)).invokeSuspend(Unit.f12910a);
                }

                /* JADX WARN: Code duplicated, block: B:22:0x005e  */
                /* JADX WARN: Code duplicated, block: B:23:0x0063  */
                /* JADX WARN: Code duplicated, block: B:26:0x0068  */
                /* JADX WARN: Code duplicated, block: B:28:0x0070  */
                /* JADX WARN: Code duplicated, block: B:32:0x007e  */
                /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
                
                    if (r7.m1289j(r12, true, r11) == r0) goto L30;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:59:0x00eb, code lost:
                
                    if (r12 == r0) goto L60;
                 */
                @Override // p000.AbstractC0181bi
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    h22 h22Var;
                    f22 f22Var;
                    x30 x30Var;
                    Object obj2;
                    int iHashCode;
/* 1 */             int i = this.f19471a;
/* 3 */             Object obj3 = this.f19476f;
/* 5 */             Object obj4 = this.f19475e;
/* 12 */            b50 b50Var = this.f19473c;
/* 14 */            c10 c10Var = null;
                    switch (i) {
                        case 0:
/* 133 */                   f22 f22Var2 = (f22) obj3;
/* 135 */                   h22 h22Var2 = (h22) obj4;
/* 137 */                   z10 z10Var = z10.f19902a;
/* 139 */                   int i2 = this.f19472b;
                            try {
/* 141 */                       if (i2 == 0) {
/* 184 */                           pg3.m7417A(obj);
/* 187 */                           this.f19474d = h22Var2;
/* 189 */                           this.f19472b = 1;
/* 191 */                           obj = b50Var.m1288i(this);
/* 195 */                           if (obj != z10Var) {
/* 198 */                               h22Var = h22Var2;
                                    }
/* 238 */                           return z10Var;
                                }
/* 143 */                       if (i2 == 1) {
/* 178 */                           h22Var = (h22) ((Serializable) this.f19474d);
/* 180 */                           pg3.m7417A(obj);
                                } else {
/* 145 */                           if (i2 != 2) {
/* 147 */                               if (i2 != 3) {
/* 160 */                                   f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 14 */                                    return null;
                                        }
/* 154 */                               f22Var2 = (f22) ((Serializable) this.f19474d);
/* 156 */                               pg3.m7417A(obj);
/* 246 */                               f22Var2.f7976a = ((Number) obj).intValue();
/* 248 */                               return Unit.f12910a;
                                    }
/* 168 */                           f22Var = (f22) ((Serializable) this.f19474d);
/* 170 */                           pg3.m7417A(obj);
                                }
/* 223 */                       f22Var.f7976a = ((Number) obj).intValue();
/* 248 */                       return Unit.f12910a;
/* 199 */                       h22Var.f8873a = obj;
/* 201 */                       qe2 qe2VarM1286g = b50Var.m1286g();
/* 205 */                       this.f19474d = f22Var2;
/* 207 */                       this.f19472b = 2;
/* 209 */                       obj = qe2VarM1286g.m7782a();
/* 213 */                       if (obj == z10Var) {
/* 238 */                           return z10Var;
                                }
/* 216 */                       f22Var = f22Var2;
/* 223 */                       f22Var.f7976a = ((Number) obj).intValue();
/* 248 */                       return Unit.f12910a;
                            } catch (d20 unused) {
/* 226 */                       Object obj5 = h22Var2.f8873a;
/* 228 */                       this.f19474d = f22Var2;
/* 230 */                       this.f19472b = 3;
/* 232 */                       obj = b50Var.m1289j(obj5, true, this);
                            }
                            break;
                        default:
/* 18 */                    z10 z10Var2 = z10.f19902a;
/* 20 */                    int i3 = this.f19472b;
/* 22 */                    if (i3 == 0) {
/* 53 */                        pg3.m7417A(obj);
/* 56 */                        this.f19472b = 1;
/* 58 */                        obj = b50.m1284f(b50Var, true, this);
/* 62 */                        if (obj != z10Var2) {
                                }
/* 123 */                       return z10Var2;
                            }
/* 24 */                    if (i3 == 1) {
/* 49 */                        pg3.m7417A(obj);
                            } else {
/* 26 */                        if (i3 != 2) {
/* 28 */                            if (i3 != 3) {
/* 37 */                                f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 14 */                                return null;
                                    }
/* 30 */                            Object obj6 = this.f19474d;
/* 32 */                            pg3.m7417A(obj);
/* 132 */                           return obj6;
                                }
/* 43 */                        x30Var = (x30) this.f19474d;
/* 45 */                        pg3.m7417A(obj);
                            }
/* 91 */                    obj2 = x30Var.f18924b;
/* 93 */                    if (obj2 != null) {
/* 95 */                        iHashCode = obj2.hashCode();
                            } else {
/* 100 */                       iHashCode = 0;
                            }
/* 103 */                   if (iHashCode == x30Var.f18925c) {
/* 129 */                       f42.m3656l("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
/* 14 */                        return null;
                            }
/* 111 */                   if (!Intrinsics.m6216a(x30Var.f18924b, obj)) {
/* 113 */                       this.f19474d = obj;
/* 115 */                       this.f19472b = 3;
                                break;
                            }
/* 125 */                   return obj;
/* 65 */                    x30 x30Var2 = (x30) obj;
/* 74 */                    C2223tm c2223tm = new C2223tm((Function2) obj3, x30Var2, c10Var, 4);
/* 77 */                    this.f19474d = x30Var2;
/* 79 */                    this.f19472b = 2;
/* 81 */                    Object objM4422D = i13.m4422D((CoroutineContext) obj4, c2223tm, this);
/* 85 */                    if (objM4422D != z10Var2) {
/* 89 */                        x30Var = x30Var2;
/* 90 */                        obj = objM4422D;
/* 91 */                        obj2 = x30Var.f18924b;
/* 93 */                        if (obj2 != null) {
/* 95 */                            iHashCode = obj2.hashCode();
                                } else {
/* 100 */                           iHashCode = 0;
                                }
/* 103 */                       if (iHashCode == x30Var.f18925c) {
/* 129 */                           f42.m3656l("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
/* 14 */                            return null;
                                }
/* 111 */                       if (!Intrinsics.m6216a(x30Var.f18924b, obj)) {
/* 113 */                           this.f19474d = obj;
/* 115 */                           this.f19472b = 3;
                                    break;
                                }
/* 125 */                       return obj;
                            }
/* 123 */                   return z10Var2;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 14 */        public y40(b50 b50Var, CoroutineContext coroutineContext, Function2 function2, c10 c10Var) {
                    super(1, c10Var);
/* 15 */            this.f19473c = b50Var;
                    this.f19475e = coroutineContext;
                    this.f19476f = function2;
                }
            }
