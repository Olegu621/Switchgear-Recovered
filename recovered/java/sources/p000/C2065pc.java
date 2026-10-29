            package p000;

            import java.util.Map;
            
            /* JADX INFO: renamed from: pc */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2065pc extends AbstractC1910m0 {

                /* JADX INFO: renamed from: c */
                public static final /* synthetic */ int f15058c = 0;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ int f15059b;

                public /* synthetic */ C2065pc(int i) {
/* 1 */             this.f15059b = i;
                }

                @Override // p000.AbstractC1812k
                /* JADX INFO: renamed from: c */
                public final Map mo104c() {
                    switch (this.f15059b) {
                        case 0:
/* 18 */                    od0 od0Var = od0.f14715a;
/* 20 */                    od0Var.getClass();
/* 23 */                    return od0Var;
                        case 1:
/* 12 */                    od0 od0Var2 = od0.f14715a;
/* 14 */                    od0Var2.getClass();
/* 17 */                    return od0Var2;
                        default:
/* 6 */                     od0 od0Var3 = od0.f14715a;
/* 8 */                     od0Var3.getClass();
/* 11 */                    return od0Var3;
                    }
                }

                @Override // p000.AbstractC1910m0
                /* JADX INFO: renamed from: d */
                public final String mo105d() {
                    switch (this.f15059b) {
                        case 0:
/* 20 */                    return "iglu:com.snowplowanalytics.mobile/application_install/jsonschema/1-0-0";
                        case 1:
/* 15 */                    return mn0.m6697m("ping");
                        default:
/* 8 */                     return mn0.m6697m("ready");
                    }
                }
            }
