            package p000;

            import kotlin.Pair;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class w40 extends tj2 implements Function2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f18431a;

                /* JADX INFO: renamed from: b */
                public int f18432b;

                /* JADX INFO: renamed from: c */
                public /* synthetic */ boolean f18433c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ b50 f18434d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ int f18435e;

                /* JADX INFO: renamed from: f */
                public Object f18436f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ w40(b50 b50Var, int i, c10 c10Var, int i2) {
/* 8 */             super(2, c10Var);
/* 1 */             this.f18431a = i2;
/* 3 */             this.f18434d = b50Var;
/* 5 */             this.f18435e = i;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 1 */             int i = this.f18431a;
/* 3 */             int i2 = this.f18435e;
/* 5 */             b50 b50Var = this.f18434d;
                    switch (i) {
                        case 0:
/* 28 */                    w40 w40Var = new w40(b50Var, i2, c10Var, 0);
/* 37 */                    w40Var.f18433c = ((Boolean) obj).booleanValue();
/* 39 */                    return w40Var;
                        default:
/* 13 */                    w40 w40Var2 = new w40(b50Var, i2, c10Var, 1);
/* 22 */                    w40Var2.f18433c = ((Boolean) obj).booleanValue();
/* 24 */                    return w40Var2;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.f18431a;
/* 3 */             Boolean bool = (Boolean) obj;
/* 5 */             bool.booleanValue();
/* 8 */             c10 c10Var = (c10) obj2;
                    switch (i) {
                        case 0:
                            break;
                    }
/* 21 */            return ((w40) create(bool, c10Var)).invokeSuspend(Unit.f12910a);
                }

                /* JADX WARN: Code duplicated, block: B:22:0x0058  */
                /* JADX WARN: Code duplicated, block: B:23:0x005d  */
                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
                    Throwable th;
                    boolean z;
                    og2 v02Var;
                    boolean z2;
                    Object obj2;
                    int iHashCode;
/* 1 */             int i = this.f18431a;
/* 3 */             int iIntValue = this.f18435e;
/* 5 */             boolean z3 = false;
/* 10 */            b50 b50Var = this.f18434d;
                    switch (i) {
                        case 0:
/* 99 */                    z10 z10Var = z10.f19902a;
/* 101 */                   int i2 = this.f18432b;
                            try {
/* 103 */                       if (i2 == 0) {
/* 131 */                           pg3.m7417A(obj);
/* 134 */                           z3 = this.f18433c;
/* 136 */                           this.f18433c = z3;
/* 138 */                           this.f18432b = 1;
/* 140 */                           obj = b50.m1284f(b50Var, z3, this);
/* 144 */                           if (obj == z10Var) {
/* 168 */                               return z10Var;
                                    }
                                } else {
/* 105 */                           if (i2 != 1) {
/* 107 */                               if (i2 != 2) {
/* 119 */                                   f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 5 */                                     return null;
                                        }
/* 109 */                               z = this.f18433c;
/* 113 */                               th = (Throwable) this.f18436f;
/* 115 */                               pg3.m7417A(obj);
/* 176 */                               iIntValue = ((Number) obj).intValue();
/* 180 */                               th = th;
/* 181 */                               z3 = z;
/* 184 */                               v02Var = new v02(iIntValue, th);
/* 194 */                               return new Pair(v02Var, Boolean.valueOf(z3));
                                    }
/* 123 */                           z3 = this.f18433c;
/* 125 */                           pg3.m7417A(obj);
                                }
/* 147 */                       v02Var = (og2) obj;
                                break;
                            } catch (Throwable th2) {
/* 129 */                       th = th2;
/* 150 */                       if (z3) {
/* 152 */                           qe2 qe2VarM1286g = b50Var.m1286g();
/* 156 */                           this.f18436f = th;
/* 158 */                           this.f18433c = z3;
/* 160 */                           this.f18432b = 2;
/* 162 */                           Integer numM7782a = qe2VarM1286g.m7782a();
/* 166 */                           if (numM7782a != z10Var) {
/* 171 */                               obj = numM7782a;
/* 172 */                               th = th;
/* 173 */                               z = z3;
                                    }
/* 168 */                           return z10Var;
                                }
                            }
/* 194 */                   return new Pair(v02Var, Boolean.valueOf(z3));
                        default:
/* 15 */                    z10 z10Var2 = z10.f19902a;
/* 17 */                    int i3 = this.f18432b;
/* 19 */                    if (i3 == 0) {
/* 41 */                        pg3.m7417A(obj);
/* 44 */                        z2 = this.f18433c;
/* 46 */                        this.f18433c = z2;
/* 48 */                        this.f18432b = 1;
/* 50 */                        obj = b50Var.m1288i(this);
/* 54 */                        if (obj != z10Var2) {
                                }
/* 73 */                        return z10Var2;
                            }
/* 21 */                    if (i3 == 1) {
/* 35 */                        z2 = this.f18433c;
/* 37 */                        pg3.m7417A(obj);
                            } else {
/* 23 */                        if (i3 != 2) {
/* 31 */                            f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 5 */                             return null;
                                }
/* 25 */                        obj2 = this.f18436f;
/* 27 */                        pg3.m7417A(obj);
                            }
/* 80 */                    iIntValue = ((Number) obj).intValue();
/* 84 */                    obj = obj2;
/* 87 */                    if (obj != null) {
/* 89 */                        iHashCode = obj.hashCode();
                            } else {
/* 94 */                        iHashCode = 0;
                            }
/* 95 */                    return new x30(obj, iHashCode, iIntValue);
/* 57 */                    if (z2) {
/* 59 */                        qe2 qe2VarM1286g2 = b50Var.m1286g();
/* 63 */                        this.f18436f = obj;
/* 65 */                        this.f18432b = 2;
/* 67 */                        Integer numM7782a2 = qe2VarM1286g2.m7782a();
/* 71 */                        if (numM7782a2 != z10Var2) {
/* 75 */                            Object obj3 = obj;
/* 76 */                            obj = numM7782a2;
/* 77 */                            obj2 = obj3;
/* 80 */                            iIntValue = ((Number) obj).intValue();
/* 84 */                            obj = obj2;
                                }
/* 73 */                        return z10Var2;
                            }
/* 87 */                    if (obj != null) {
/* 89 */                        iHashCode = obj.hashCode();
                            } else {
/* 94 */                        iHashCode = 0;
                            }
/* 95 */                    return new x30(obj, iHashCode, iIntValue);
                    }
                }
            }
