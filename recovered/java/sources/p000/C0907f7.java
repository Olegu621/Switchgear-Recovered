            package p000;

            import java.util.List;
            import java.util.Map;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function1;
            
            /* JADX INFO: renamed from: f7 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0907f7 extends tj2 implements Function1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f8029a;

                /* JADX INFO: renamed from: b */
                public int f8030b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f8031c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ en1 f8032d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Object f8033e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ C0907f7(en1 en1Var, String str, Object obj, c10 c10Var, int i) {
/* 10 */            super(1, c10Var);
/* 1 */             this.f8029a = i;
/* 3 */             this.f8032d = en1Var;
/* 5 */             this.f8031c = str;
/* 7 */             this.f8033e = obj;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(c10 c10Var) {
                    switch (this.f8029a) {
                        case 0:
/* 62 */                    return new C0907f7((C2279v3) this.f8032d, this.f8031c, (List) this.f8033e, c10Var, 0);
                        case 1:
/* 42 */                    return new C0907f7((k51) this.f8032d, this.f8031c, (String) this.f8033e, c10Var, 1);
                        default:
/* 22 */                    return new C0907f7((lc2) this.f8032d, this.f8031c, (String) this.f8033e, c10Var, 2);
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
/* 3 */             c10 c10Var = (c10) obj;
                    switch (this.f8029a) {
                        case 0:
                            break;
                        case 1:
                            break;
                    }
/* 16 */            return ((C0907f7) create(c10Var)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) throws vz2 {
/* 1 */             int i = this.f8029a;
/* 3 */             Object obj2 = this.f8033e;
/* 5 */             String str = this.f8031c;
/* 7 */             en1 en1Var = this.f8032d;
                    switch (i) {
                        case 0:
/* 138 */                   z10 z10Var = z10.f19902a;
/* 140 */                   int i2 = this.f8030b;
/* 142 */                   if (i2 != 0) {
/* 144 */                       if (i2 == 1) {
/* 146 */                           pg3.m7417A(obj);
/* 179 */                           return obj;
                                }
/* 150 */                       f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 9 */                         return null;
                            }
/* 155 */                   pg3.m7417A(obj);
/* 158 */                   C2279v3 c2279v3 = (C2279v3) en1Var;
/* 166 */                   Map mapM9255b = c2279v3.m9255b();
/* 170 */                   this.f8030b = 1;
/* 172 */                   Object objM2950b = ((C0834d7) c2279v3.f17848e).m2950b(str, (List) obj2, mapM9255b, this);
                            return objM2950b == z10Var ? z10Var : objM2950b;
                        case 1:
/* 96 */                    z10 z10Var2 = z10.f19902a;
/* 98 */                    int i3 = this.f8030b;
/* 100 */                   if (i3 != 0) {
/* 102 */                       if (i3 == 1) {
/* 104 */                           pg3.m7417A(obj);
/* 137 */                           return obj;
                                }
/* 108 */                       f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 9 */                         return null;
                            }
/* 113 */                   pg3.m7417A(obj);
/* 116 */                   k51 k51Var = (k51) en1Var;
/* 124 */                   Map mapM9255b2 = k51Var.m9255b();
/* 128 */                   this.f8030b = 1;
/* 130 */                   Object objM8060a = ((C2130r3) k51Var.f12600e).m8060a(str, (String) obj2, mapM9255b2, this);
                            return objM8060a == z10Var2 ? z10Var2 : objM8060a;
                        default:
/* 16 */                    z10 z10Var3 = z10.f19902a;
/* 18 */                    int i4 = this.f8030b;
/* 20 */                    if (i4 != 0) {
/* 22 */                        if (i4 == 1) {
/* 24 */                            pg3.m7417A(obj);
/* 95 */                            return obj;
                                }
/* 28 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 9 */                         return null;
                            }
/* 33 */                    pg3.m7417A(obj);
/* 36 */                    lc2 lc2Var = (lc2) en1Var;
/* 38 */                    C2130r3 c2130r3 = lc2Var.f13183d;
/* 42 */                    String str2 = lc2Var.f13184e;
/* 44 */                    Map mapM9255b3 = lc2Var.m9255b();
/* 48 */                    this.f8030b = 1;
/* 52 */                    String strM4149a = c2130r3.f15841b.m4149a();
/* 58 */                    StringBuilder sb = new StringBuilder();
/* 61 */                    sb.append(strM4149a);
/* 66 */                    sb.append("/settings/");
/* 69 */                    sb.append(str);
/* 74 */                    sb.append("/");
/* 77 */                    sb.append((String) obj2);
/* 88 */                    Object objM10031c = c2130r3.f15840a.m10031c(fm0.m3790p(sb, "/", str2, ".json"), mapM9255b3, this);
                            return objM10031c == z10Var3 ? z10Var3 : objM10031c;
                    }
                }
            }
