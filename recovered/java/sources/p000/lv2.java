            package p000;

            import android.widget.LinearLayout;
            import com.usercentrics.sdk.p008ui.R$id;
            import com.usercentrics.sdk.p008ui.components.UCTextView;
            import com.usercentrics.sdk.p008ui.components.UCToggle;
            import com.usercentrics.sdk.p008ui.secondLayer.component.footer.UCSecondLayerFooter;
            import kotlin.jvm.functions.Function0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class lv2 extends b51 implements Function0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f13502a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ UCSecondLayerFooter f13503b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ lv2(UCSecondLayerFooter uCSecondLayerFooter, int i) {
/* 6 */             super(0);
/* 1 */             this.f13502a = i;
/* 3 */             this.f13503b = uCSecondLayerFooter;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
/* 1 */             int i = this.f13502a;
/* 3 */             UCSecondLayerFooter uCSecondLayerFooter = this.f13503b;
                    switch (i) {
                        case 0:
/* 48 */                    return (LinearLayout) uCSecondLayerFooter.findViewById(R$id.ucFooterButtonsContainer);
                        case 1:
/* 37 */                    return uCSecondLayerFooter.findViewById(R$id.ucFooterDivider);
                        case 2:
/* 32 */                    return (UCToggle) uCSecondLayerFooter.findViewById(R$id.ucFooterSwitch);
                        case 3:
/* 23 */                    return (UCTextView) uCSecondLayerFooter.findViewById(R$id.ucFooterSwitchText);
                        default:
/* 14 */                    return (UCTextView) uCSecondLayerFooter.findViewById(R$id.ucFooterTextProvider);
                    }
                }
            }
