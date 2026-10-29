            package p000;

            import com.usercentrics.sdk.AdTechProvider;
            import java.security.NoSuchAlgorithmException;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.UUID;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class w03 extends tj2 implements Function2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f18406a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ a13 f18407b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ w03(a13 a13Var, c10 c10Var, int i) {
/* 6 */             super(2, c10Var);
/* 1 */             this.f18406a = i;
/* 3 */             this.f18407b = a13Var;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 1 */             int i = this.f18406a;
/* 3 */             a13 a13Var = this.f18407b;
                    switch (i) {
                        case 0:
/* 18 */                    return new w03(a13Var, c10Var, 0);
                        default:
/* 11 */                    return new w03(a13Var, c10Var, 1);
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
/* 3 */             y80 y80Var = (y80) obj;
/* 5 */             c10 c10Var = (c10) obj2;
                    switch (this.f18406a) {
                        case 0:
                            break;
                    }
/* 18 */            return ((w03) create(y80Var, c10Var)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) throws NoSuchAlgorithmException {
/* 1 */             int i = this.f18406a;
/* 3 */             a13 a13Var = this.f18407b;
                    switch (i) {
                        case 0:
/* 24 */                    z10 z10Var = z10.f19902a;
/* 26 */                    pg3.m7417A(obj);
/* 29 */                    jb1.m5748h();
/* 32 */                    fb1 fb1Var = a13Var.f30a;
/* 40 */                    ArrayList arrayList = null;
/* 41 */                    fb1Var.m3699e().mo2906a("Clearing User Session", null);
/* 46 */                    a13Var.f32c = HttpUrl.FRAGMENT_ENCODE_SET;
/* 58 */                    ((pz2) ((g80) fb1Var.f8112z.getValue())).m7629a();
/* 61 */                    hk2 hk2Var = fb1Var.f8068F;
/* 67 */                    ac2 ac2Var = (ac2) hk2Var.getValue();
/* 69 */                    k61 k61Var = ac2Var.f182c;
/* 73 */                    ac2Var.f181b.getClass();
/* 80 */                    String string = UUID.randomUUID().toString();
/* 84 */                    string.getClass();
/* 87 */                    String strM9312a = vq0.m9312a(string);
/* 91 */                    k61Var.getClass();
/* 94 */                    k61Var.f12614e = strM9312a;
/* 107 */                   for (m61 m61Var : k61Var.f12611b) {
/* 119 */                       i61 i61Var = new i61(nd0.f14189a, false);
/* 122 */                       m61Var.getClass();
/* 125 */                       m61Var.f13590p = i61Var;
                            }
/* 132 */                   if (a13Var.m34o()) {
/* 142 */                       qk2 qk2Var = (qk2) ((il2) fb1Var.f8073K.getValue());
/* 144 */                       qk2Var.m7934s();
/* 149 */                       qk2Var.f15612o.clear();
/* 152 */                       ql2 ql2Var = qk2Var.f15610m;
/* 154 */                       if (ql2Var != null) {
/* 158 */                           ql2Var.f15639r.clear();
/* 163 */                           ql2Var.f15640s.clear();
/* 168 */                           ql2Var.f15646y.clear();
/* 173 */                           ql2Var.f15647z.clear();
/* 178 */                           ql2Var.f15638q.clear();
                                }
/* 191 */                       if (((ac2) hk2Var.getValue()).m195b()) {
/* 199 */                           C2484y3 c2484y3 = (C2484y3) fb1Var.f8086X.getValue();
/* 201 */                           List list = c2484y3.f19466d;
/* 203 */                           if (list != null) {
/* 213 */                               arrayList = new ArrayList(C2122qw.m8020h(list, 10));
/* 216 */                               Iterator it = list.iterator();
/* 224 */                               while (it.hasNext()) {
/* 236 */                                   arrayList.add(AdTechProvider.m2769a((AdTechProvider) it.next(), false));
                                        }
                                    }
/* 240 */                           c2484y3.f19466d = arrayList;
/* 246 */                           c2484y3.f19467e = c2484y3.m10095c();
                                }
                            }
/* 257 */                   ((sx0) fb1Var.f8106t.getValue()).m8648c(HttpUrl.FRAGMENT_ENCODE_SET, true);
/* 260 */                   a13Var.m31l();
/* 263 */                   return Unit.f12910a;
                        default:
/* 8 */                     z10 z10Var2 = z10.f19902a;
/* 10 */                    pg3.m7417A(obj);
/* 19 */                    return ((qk2) a13Var.m32m()).m7927i();
                    }
                }
            }
