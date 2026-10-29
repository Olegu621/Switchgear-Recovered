            package p000;

            import android.content.Context;
            import android.content.res.Configuration;
            import android.content.res.Resources;
            import com.usercentrics.sdk.p008ui.PredefinedUIResponse;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class qz2 extends b51 implements Function0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f15810a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ rz2 f15811b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ qz2(rz2 rz2Var, int i) {
/* 6 */             super(0);
/* 1 */             this.f15810a = i;
/* 3 */             this.f15811b = rz2Var;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Context contextM8339c;
                    Resources resources;
                    Configuration configuration;
/* 1 */             int i = this.f15810a;
/* 3 */             rz2 rz2Var = this.f15811b;
                    switch (i) {
                        case 0:
/* 63 */                    ac1 ac1Var = rz2Var.f16360d.f18820b;
/* 90 */                    rz2Var.f16359c.m8898g(he3.m4198u(new PredefinedUIResponse(av1.f2108d, ((a13) ac1Var.f177b).m30k(), (String) ac1Var.f179d)));
/* 93 */                    return Unit.f12910a;
                        default:
/* 8 */                     Context contextM8339c2 = rz2Var.m8339c();
/* 56 */                    return Boolean.valueOf(!(contextM8339c2 == null || (resources = contextM8339c2.getResources()) == null || (configuration = resources.getConfiguration()) == null || configuration.orientation != 2) || ((contextM8339c = rz2Var.m8339c()) != null && (contextM8339c.getResources().getConfiguration().screenLayout & 15) >= 3));
                    }
                }
            }
