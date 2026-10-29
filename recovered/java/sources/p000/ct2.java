            package p000;

            import com.usercentrics.sdk.p008ui.R$id;
            import com.usercentrics.sdk.p008ui.components.UCButton;
            import com.usercentrics.sdk.p008ui.components.UCImageView;
            import com.usercentrics.sdk.p008ui.components.UCTextView;
            import kotlin.jvm.functions.Function0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ct2 extends b51 implements Function0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f6904a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ UCButton f6905b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ ct2(UCButton uCButton, int i) {
/* 6 */             super(0);
/* 1 */             this.f6904a = i;
/* 3 */             this.f6905b = uCButton;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
/* 1 */             int i = this.f6904a;
/* 3 */             UCButton uCButton = this.f6905b;
                    switch (i) {
                        case 0:
/* 23 */                    return (UCImageView) uCButton.findViewById(R$id.ucButtonBackground);
                        default:
/* 14 */                    return (UCTextView) uCButton.findViewById(R$id.ucButtonText);
                    }
                }
            }
