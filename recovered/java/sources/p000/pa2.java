            package p000;

            import java.util.LinkedHashMap;
            import kotlin.jvm.functions.Function0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class pa2 extends b51 implements Function0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f15044a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ qa2 f15045b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ pa2(qa2 qa2Var, int i) {
/* 6 */             super(0);
/* 1 */             this.f15044a = i;
/* 3 */             this.f15045b = qa2Var;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
/* 1 */             int i = this.f15044a;
/* 3 */             qa2 qa2Var = this.f15045b;
                    switch (i) {
                        case 0:
/* 16 */                    ve1 ve1Var = new ve1(qa2Var);
/* 24 */                    ve1Var.f18022b = new LinkedHashMap();
/* 26 */                    return ve1Var;
                        default:
/* 10 */                    return new ht1(qa2Var);
                    }
                }
            }
