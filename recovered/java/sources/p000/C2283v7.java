            package p000;

            import com.usercentrics.sdk.UsercentricsDomains;
            import java.io.IOException;
            import java.util.Map;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: v7 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 15 */    public final class C2283v7 extends tj2 implements Function2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f17876a = 0;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f17877b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f17878c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Object f17879d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Object f17880e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2283v7(C2321w7 c2321w7, ez2 ez2Var, String str, String str2, c10 c10Var) {
/* 13 */            super(2, c10Var);
/* 4 */             this.f17879d = c2321w7;
/* 6 */             this.f17880e = ez2Var;
/* 8 */             this.f17877b = str;
/* 10 */            this.f17878c = str2;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 1 */             int i = this.f17876a;
/* 3 */             Object obj2 = this.f17880e;
/* 5 */             Object obj3 = this.f17879d;
                    switch (i) {
                        case 0:
/* 42 */                    return new C2283v7((C2321w7) obj3, (ez2) obj2, this.f17877b, this.f17878c, c10Var);
                        default:
/* 23 */                    return new C2283v7((xu0) obj3, this.f17877b, this.f17878c, (Map) obj2, c10Var);
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
/* 3 */             y80 y80Var = (y80) obj;
/* 5 */             c10 c10Var = (c10) obj2;
                    switch (this.f17876a) {
                        case 0:
                            break;
                    }
/* 18 */            return ((C2283v7) create(y80Var, c10Var)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) throws IOException {
                    String str;
/* 1 */             int i = this.f17876a;
/* 3 */             Object obj2 = this.f17880e;
/* 5 */             String str2 = this.f17878c;
/* 7 */             String str3 = this.f17877b;
/* 9 */             Object obj3 = this.f17879d;
                    switch (i) {
                        case 0:
/* 28 */                    z10 z10Var = z10.f19902a;
/* 30 */                    pg3.m7417A(obj);
/* 33 */                    C2321w7 c2321w7 = (C2321w7) obj3;
/* 37 */                    kn1 kn1Var = c2321w7.f18460b.f15067d;
/* 39 */                    kn1Var.getClass();
/* 46 */                    if (!kn1Var.f12892a.f6724x) {
/* 48 */                        return Unit.f12910a;
                            }
/* 52 */                    C0875ec c0875ec = c2321w7.f18459a;
/* 54 */                    ez2 ez2Var = (ez2) obj2;
/* 61 */                    long jM4115c = new h50().m4115c();
/* 67 */                    n02.f14089a.getClass();
/* 72 */                    int iMo1167c = n02.f14090b.mo1167c();
/* 78 */                    StringBuilder sb = new StringBuilder();
/* 81 */                    sb.append(jM4115c);
/* 84 */                    sb.append(iMo1167c);
/* 87 */                    String string = sb.toString();
/* 91 */                    str3.getClass();
/* 96 */                    hb1 hb1Var = (hb1) c0875ec.f7613b;
/* 98 */                    UsercentricsDomains usercentricsDomains = hb1Var.f8999b;
/* 105 */                   if (usercentricsDomains.m2770a()) {
/* 107 */                       str = usercentricsDomains.f6044c;
                            } else {
/* 112 */                       int iOrdinal = hb1Var.f8998a.ordinal();
/* 116 */                       if (iOrdinal == 0) {
/* 129 */                           str = "https://uct.service.usercentrics.eu";
                                } else {
/* 119 */                           if (iOrdinal != 1) {
/* 124 */                               ds0.m3187b();
/* 104 */                               return null;
                                    }
/* 121 */                           str = "https://uct.eu.usercentrics.eu";
                                }
                            }
/* 131 */                   int i2 = ez2Var.f7942a;
/* 135 */                   String str4 = (String) c0875ec.f7615d;
/* 139 */                   if (str2 == null) {
/* 141 */                       str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
/* 144 */                   StringBuilder sb2 = new StringBuilder();
/* 147 */                   sb2.append(str);
/* 152 */                   sb2.append("/uct?v=1&sid=");
/* 155 */                   sb2.append(str3);
/* 160 */                   sb2.append("&t=");
/* 163 */                   sb2.append(i2);
/* 170 */                   fm0.m3796v(sb2, "&r=", str4, "&abv=", str2);
/* 183 */                   ((xu0) c0875ec.f7614c).m10032d(fm0.m3789o(sb2, "&cb=", string), HttpUrl.FRAGMENT_ENCODE_SET, null);
/* 186 */                   return Unit.f12910a;
                        default:
/* 14 */                    z10 z10Var2 = z10.f19902a;
/* 16 */                    pg3.m7417A(obj);
/* 23 */                    return ((xu0) obj3).m10032d(str3, str2, (Map) obj2);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 16 */        public C2283v7(xu0 xu0Var, String str, String str2, Map map, c10 c10Var) {
                    super(2, c10Var);
/* 17 */            this.f17879d = xu0Var;
                    this.f17877b = str;
                    this.f17878c = str2;
                    this.f17880e = map;
                }
            }
