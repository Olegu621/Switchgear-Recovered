            package p000;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class el1 extends b51 implements Function1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7777a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ gl1 f7778b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ el1(gl1 gl1Var, fl1 fl1Var, int i) {
/* 6 */             super(1);
/* 1 */             this.f7777a = i;
/* 3 */             this.f7778b = gl1Var;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
/* 1 */             int i = this.f7777a;
/* 4 */             gl1 gl1Var = this.f7778b;
                    switch (i) {
                        case 0:
/* 24 */                    gl1Var.m3970g(null);
                            break;
                        default:
/* 13 */                    gl1.f8697i.set(gl1Var, null);
/* 16 */                    gl1Var.m3970g(null);
                            break;
                    }
/* 19 */            return Unit.f12910a;
                }
            }
