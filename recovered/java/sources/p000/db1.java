            package p000;

            import android.content.Context;
            import kotlin.Pair;
            import kotlin.jvm.functions.Function0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class db1 extends b51 implements Function0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7081a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ fb1 f7082b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Context f7083c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ db1(fb1 fb1Var, Context context, int i) {
/* 8 */             super(0);
/* 1 */             this.f7081a = i;
/* 3 */             this.f7082b = fb1Var;
/* 5 */             this.f7083c = context;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
/* 3 */             int i = this.f7081a;
/* 5 */             Context context = this.f7083c;
/* 7 */             fb1 fb1Var = this.f7082b;
                    switch (i) {
                        case 0:
/* 46 */                    i03 i03VarM3699e = fb1Var.m3699e();
/* 50 */                    i03VarM3699e.getClass();
/* 57 */                    ri0 ri0Var = new ri0(i03VarM3699e);
/* 64 */                    qi0 qi0Var = new qi0("Firebase Advertising", i03VarM3699e);
/* 225 */                   return new bg1(new ac1(oc1.m7131e(new Pair("hpb62D82I", new qx2(i03VarM3699e, context)), new Pair("fHczTMzX8", new C0949gc(i03VarM3699e, context)), new Pair("9dchbL797", new xz0(i03VarM3699e)), new Pair("diWdt4yLB", ri0Var), new Pair("GqhZxB-iiydzEk", qi0Var), new Pair("cE0B0wy4Z", new e20(i03VarM3699e)), new Pair("IEbRp3saT", new C2267ut(i03VarM3699e, context)), new Pair("OxsYgtMfe7aP8u", new se2(i03VarM3699e)), new Pair("Gx9iMF__f", new C2250uc(i03VarM3699e)), new Pair("1k_ljMZc28DDOc", new C0944g7(i03VarM3699e))), C2085pw.m7566e(ri0Var, qi0Var), new C0875ec(i03VarM3699e, new C0006a4(i03VarM3699e))), fb1Var.m3699e());
                        default:
/* 20 */                    il1 il1Var = (il1) fb1Var.f8080R.getValue();
/* 22 */                    il1Var.getClass();
/* 25 */                    ts0 ts0Var = new ts0();
/* 28 */                    ts0Var.f17248a = il1Var;
/* 42 */                    return new nl1(context, ts0Var, (gv1) fb1Var.f8081S.getValue(), fb1Var.f8087a);
                    }
                }
            }
