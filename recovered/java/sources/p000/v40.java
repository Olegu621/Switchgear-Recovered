            package p000;

            import java.util.Locale;
            import java.util.Map;
            import kotlin.Pair;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function1;
            import kotlin.text.C1852e;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 10 */    public final class v40 extends tj2 implements Function1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f17859a;

                /* JADX INFO: renamed from: b */
                public int f17860b;

                /* JADX INFO: renamed from: c */
                public Object f17861c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Object f17862d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ v40(en1 en1Var, String str, c10 c10Var, int i) {
/* 8 */             super(1, c10Var);
/* 1 */             this.f17859a = i;
/* 3 */             this.f17861c = en1Var;
/* 5 */             this.f17862d = str;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(c10 c10Var) {
/* 1 */             int i = this.f17859a;
/* 3 */             Object obj = this.f17862d;
                    switch (i) {
                        case 0:
/* 51 */                    return new v40((b50) obj, c10Var);
                        case 1:
/* 43 */                    return new v40((k51) this.f17861c, (String) obj, c10Var, 1);
                        case 2:
/* 30 */                    return new v40((C2279v3) this.f17861c, (String) obj, c10Var, 2);
                        default:
/* 17 */                    return new v40((C2279v3) this.f17861c, (String) obj, c10Var, 3);
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
/* 3 */             c10 c10Var = (c10) obj;
                    switch (this.f17859a) {
                        case 0:
                            break;
                        case 1:
                            break;
                        case 2:
                            break;
                    }
/* 16 */            return ((v40) create(c10Var)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) throws vz2 {
                    Throwable th;
                    og2 v02Var;
/* 1 */             int i = this.f17859a;
/* 5 */             Object obj2 = this.f17862d;
                    switch (i) {
                        case 0:
/* 208 */                   b50 b50Var = (b50) obj2;
/* 210 */                   z10 z10Var = z10.f19902a;
/* 212 */                   int i2 = this.f17860b;
                            try {
/* 215 */                       if (i2 == 0) {
/* 239 */                           pg3.m7417A(obj);
/* 242 */                           this.f17860b = 1;
/* 244 */                           obj = b50.m1284f(b50Var, true, this);
/* 248 */                           if (obj == z10Var) {
/* 268 */                               return z10Var;
                                    }
                                } else {
/* 217 */                           if (i2 != 1) {
/* 219 */                               if (i2 != 2) {
/* 229 */                                   f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 7 */                                     return null;
                                        }
/* 223 */                               th = (Throwable) this.f17861c;
/* 225 */                               pg3.m7417A(obj);
/* 281 */                               v02Var = new v02(((Number) obj).intValue(), th);
/* 289 */                               return new Pair(v02Var, Boolean.TRUE);
                                    }
/* 233 */                           pg3.m7417A(obj);
                                }
/* 251 */                       v02Var = (og2) obj;
                                break;
                            } catch (Throwable th2) {
/* 254 */                       qe2 qe2VarM1286g = b50Var.m1286g();
/* 258 */                       this.f17861c = th2;
/* 260 */                       this.f17860b = 2;
/* 262 */                       Integer numM7782a = qe2VarM1286g.m7782a();
/* 266 */                       if (numM7782a != z10Var) {
/* 271 */                           obj = numM7782a;
/* 272 */                           th = th2;
                                }
/* 268 */                       return z10Var;
                            }
/* 289 */                   return new Pair(v02Var, Boolean.TRUE);
                        case 1:
/* 164 */                   z10 z10Var2 = z10.f19902a;
/* 166 */                   int i3 = this.f17860b;
/* 168 */                   if (i3 != 0) {
/* 170 */                       if (i3 == 1) {
/* 172 */                           pg3.m7417A(obj);
/* 207 */                           return obj;
                                }
/* 176 */                       f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 7 */                         return null;
                            }
/* 181 */                   pg3.m7417A(obj);
/* 186 */                   k51 k51Var = (k51) this.f17861c;
/* 194 */                   Map mapM9255b = k51Var.m9255b();
/* 198 */                   this.f17860b = 1;
/* 200 */                   Object objM2949a = ((C0834d7) k51Var.f12600e).m2949a((String) obj2, mapM9255b, this);
                            return objM2949a == z10Var2 ? z10Var2 : objM2949a;
                        case 2:
/* 72 */                    z10 z10Var3 = z10.f19902a;
/* 74 */                    int i4 = this.f17860b;
/* 76 */                    if (i4 != 0) {
/* 78 */                        if (i4 == 1) {
/* 80 */                            pg3.m7417A(obj);
/* 163 */                           return obj;
                                }
/* 84 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 7 */                         return null;
                            }
/* 89 */                    pg3.m7417A(obj);
/* 94 */                    C2279v3 c2279v3 = (C2279v3) this.f17861c;
/* 98 */                    C2130r3 c2130r3 = (C2130r3) c2279v3.f17848e;
/* 102 */                   Map mapM9255b2 = c2279v3.m9255b();
/* 106 */                   this.f17860b = 1;
/* 110 */                   String strM4149a = c2130r3.f15841b.m4149a();
/* 124 */                   String lowerCase = C1852e.m6261k((String) obj2, "_", "-").toLowerCase(Locale.ROOT);
/* 128 */                   lowerCase.getClass();
/* 156 */                   Object objM10031c = c2130r3.f15840a.m10031c(strM4149a + "/gvl/v3/" + lowerCase + ".json", mapM9255b2, this);
                            return objM10031c == z10Var3 ? z10Var3 : objM10031c;
                        default:
/* 14 */                    z10 z10Var4 = z10.f19902a;
/* 16 */                    int i5 = this.f17860b;
/* 18 */                    if (i5 != 0) {
/* 20 */                        if (i5 == 1) {
/* 22 */                            pg3.m7417A(obj);
/* 71 */                            return obj;
                                }
/* 26 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 7 */                         return null;
                            }
/* 31 */                    pg3.m7417A(obj);
/* 36 */                    C2279v3 c2279v4 = (C2279v3) this.f17861c;
/* 40 */                    C2130r3 c2130r4 = (C2130r3) c2279v4.f17848e;
/* 44 */                    Map mapM9255b3 = c2279v4.m9255b();
/* 48 */                    this.f17860b = 1;
/* 64 */                    Object objM10031c2 = c2130r4.f15840a.m10031c(pm2.m7489l(c2130r4.f15841b.m4149a(), "/translations/translations-", (String) obj2, ".json"), mapM9255b3, this);
                            return objM10031c2 == z10Var4 ? z10Var4 : objM10031c2;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 11 */        public v40(b50 b50Var, c10 c10Var) {
                    super(1, c10Var);
                    this.f17859a = 0;
/* 12 */            this.f17862d = b50Var;
                }
            }
