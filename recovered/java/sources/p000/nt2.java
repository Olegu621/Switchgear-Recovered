            package p000;

            import com.usercentrics.sdk.p008ui.components.cards.UCCard;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class nt2 extends b51 implements Function1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ UCCard f14450a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ew2 f14451b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ st2 f14452c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Function1 f14453d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public nt2(UCCard uCCard, ew2 ew2Var, st2 st2Var, Function1 function1) {
/* 10 */            super(1);
/* 1 */             this.f14450a = uCCard;
/* 3 */             this.f14451b = ew2Var;
/* 5 */             this.f14452c = st2Var;
/* 7 */             this.f14453d = function1;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
/* 3 */             boolean zBooleanValue = ((Boolean) obj).booleanValue();
/* 7 */             int i = UCCard.f6254e0;
/* 9 */             UCCard uCCard = this.f14450a;
/* 17 */            uCCard.m2806f(this.f14451b, this.f14452c, this.f14453d);
/* 20 */            if (zBooleanValue) {
/* 28 */                uCCard.post(new mt2(uCCard, 1));
                    }
/* 31 */            return Unit.f12910a;
                }
            }
