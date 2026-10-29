            package p000;

            import java.io.Serializable;
            import java.net.HttpURLConnection;
            import java.net.ProtocolException;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class u80 extends tj2 implements Function2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f17415a;

                /* JADX INFO: renamed from: b */
                public int f17416b;

                /* JADX INFO: renamed from: c */
                public Object f17417c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Object f17418d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Serializable f17419e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ Object f17420f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ u80(Object obj, Serializable serializable, Object obj2, c10 c10Var, int i) {
/* 10 */            super(2, c10Var);
/* 1 */             this.f17415a = i;
/* 3 */             this.f17418d = obj;
/* 5 */             this.f17419e = serializable;
/* 7 */             this.f17420f = obj2;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 1 */             int i = this.f17415a;
/* 3 */             Object obj2 = this.f17420f;
/* 5 */             Serializable serializable = this.f17419e;
/* 7 */             Object obj3 = this.f17418d;
                    switch (i) {
                        case 0:
/* 43 */                    u80 u80Var = new u80((x80) obj3, (C2223tm) serializable, (C0875ec) obj2, c10Var, 0);
/* 46 */                    u80Var.f17417c = obj;
/* 48 */                    return u80Var;
                        default:
/* 25 */                    return new u80((xu0) obj3, (String) serializable, (Map) obj2, c10Var, 1);
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
/* 3 */             y10 y10Var = (y10) obj;
/* 5 */             c10 c10Var = (c10) obj2;
                    switch (this.f17415a) {
                        case 0:
                            break;
                    }
/* 18 */            return ((u80) create(y10Var, c10Var)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) throws ProtocolException {
/* 1 */             int i = this.f17415a;
/* 3 */             Object obj2 = this.f17420f;
/* 5 */             Serializable serializable = this.f17419e;
/* 7 */             Object obj3 = this.f17418d;
                    switch (i) {
                        case 0:
/* 145 */                   z10 z10Var = z10.f19902a;
/* 147 */                   int i2 = this.f17416b;
/* 149 */                   if (i2 != 0) {
/* 151 */                       if (i2 != 1) {
/* 161 */                           f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 9 */                             return null;
                                }
/* 157 */                       pg3.m7417A(obj);
/* 227 */                       return obj;
                            }
/* 166 */                   pg3.m7417A(obj);
/* 171 */                   y10 y10Var = (y10) this.f17417c;
/* 180 */                   C0875ec c0875ec = (C0875ec) obj2;
/* 182 */                   this.f17417c = y10Var;
/* 184 */                   this.f17416b = 1;
/* 192 */                   C0890er c0890er = new C0890er(1, mz0.m6834b(this));
/* 195 */                   c0890er.m3571u();
/* 217 */                   c0890er.m3573w(new C1983o(i13.m4443w(y10Var, null, new C2562zs((x80) obj3, (C2223tm) serializable, c0875ec, null, 4), 3), 8));
/* 220 */                   Object objM3569s = c0890er.m3569s();
                            return objM3569s == z10Var ? z10Var : objM3569s;
                        default:
/* 16 */                    z10 z10Var2 = z10.f19902a;
/* 18 */                    int i3 = this.f17416b;
/* 20 */                    if (i3 != 0) {
/* 22 */                        if (i3 != 1) {
/* 34 */                            f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 9 */                             return null;
                                }
/* 30 */                        pg3.m7417A(obj);
/* 144 */                       return obj;
                            }
/* 39 */                    pg3.m7417A(obj);
/* 42 */                    xu0 xu0Var = (xu0) obj3;
/* 46 */                    Map map = (Map) obj2;
/* 51 */                    this.f17417c = map;
/* 53 */                    this.f17416b = 1;
/* 61 */                    C0890er c0890er2 = new C0890er(1, mz0.m6834b(this));
/* 64 */                    c0890er2.m3571u();
/* 69 */                    wu0 wu0Var = new wu0(c0890er2, 1);
/* 75 */                    wu0 wu0Var2 = new wu0(c0890er2, 0);
/* 78 */                    C0945g8 c0945g8 = xu0Var.f19379a;
/* 80 */                    LinkedHashMap linkedHashMapM10029a = xu0Var.m10029a(map);
/* 84 */                    c0945g8.getClass();
/* 87 */                    HttpURLConnection httpURLConnectionM3886a = c0945g8.m3886a((String) serializable, linkedHashMapM10029a);
/* 93 */                    httpURLConnectionM3886a.setRequestMethod("GET");
/* 115 */                   c0945g8.f8511b.m9743b(new C0871e8(wu0Var, c0945g8, httpURLConnectionM3886a, null, 0)).m3369G(new C1983o(wu0Var2, 2));
/* 134 */                   c0890er2.m3573w(new C1996oc(6, new er0(new C0908f8(httpURLConnectionM3886a, 0), 2), c0890er2));
/* 137 */                   Object objM3569s2 = c0890er2.m3569s();
                            return objM3569s2 == z10Var2 ? z10Var2 : objM3569s2;
                    }
                }
            }
