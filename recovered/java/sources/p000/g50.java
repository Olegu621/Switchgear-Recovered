            package p000;

            import kotlin.jvm.functions.Function0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class g50 extends b51 implements Function0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f8473a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ h50 f8474b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ g50(h50 h50Var, int i) {
/* 6 */             super(0);
/* 1 */             this.f8473a = i;
/* 3 */             this.f8474b = h50Var;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
/* 1 */             int i = this.f8473a;
/* 4 */             h50 h50Var = this.f8474b;
                    switch (i) {
                        case 0:
/* 79 */                    return Integer.valueOf(h50Var.f8899b.get(5));
                        case 1:
/* 67 */                    return Integer.valueOf(h50Var.f8899b.get(11));
                        case 2:
/* 54 */                    return Integer.valueOf(h50Var.f8899b.get(12));
                        case 3:
/* 41 */                    return Integer.valueOf(h50Var.f8899b.get(2) + 1);
                        case 4:
/* 28 */                    return Integer.valueOf(h50Var.f8899b.get(13));
                        default:
/* 15 */                    return Integer.valueOf(h50Var.f8899b.get(1));
                    }
                }
            }
