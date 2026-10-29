            package p000;

            import com.pixplicity.sharp.Sharp;
            import com.usercentrics.sdk.p008ui.components.UCImageView;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class yu2 extends tj2 implements Function2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ String f19816a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ UCImageView f19817b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public yu2(String str, UCImageView uCImageView, c10 c10Var) {
/* 6 */             super(2, c10Var);
/* 1 */             this.f19816a = str;
/* 3 */             this.f19817b = uCImageView;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 7 */             return new yu2(this.f19816a, this.f19817b, c10Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((yu2) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             pg3.m7417A(obj);
/* 14 */            Sharp.loadString(this.f19816a).into(this.f19817b);
/* 17 */            return Unit.f12910a;
                }
            }
