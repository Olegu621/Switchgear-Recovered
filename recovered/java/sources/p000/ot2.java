            package p000;

            import android.content.Context;
            import android.view.ViewGroup;
            import com.usercentrics.sdk.p008ui.R$dimen;
            import com.usercentrics.sdk.p008ui.R$drawable;
            import com.usercentrics.sdk.p008ui.R$id;
            import com.usercentrics.sdk.p008ui.components.UCButton;
            import com.usercentrics.sdk.p008ui.components.UCTextView;
            import com.usercentrics.sdk.p008ui.components.UCToggle;
            import com.usercentrics.sdk.p008ui.components.cards.UCCard;
            import kotlin.jvm.functions.Function0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ot2 extends b51 implements Function0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f14895a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ UCCard f14896b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ ot2(UCCard uCCard, int i) {
/* 6 */             super(0);
/* 1 */             this.f14895a = i;
/* 3 */             this.f14896b = uCCard;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
/* 1 */             int i = this.f14895a;
/* 3 */             UCCard uCCard = this.f14896b;
                    switch (i) {
                        case 0:
/* 119 */                   return Integer.valueOf((int) uCCard.getContext().getResources().getDimension(R$dimen.ucCardVerticalMargin));
                        case 1:
/* 90 */                    Context context = uCCard.getContext();
/* 94 */                    context.getClass();
/* 99 */                    return mn0.m6700p(context, R$drawable.uc_ic_expand);
                        case 2:
/* 85 */                    return uCCard.findViewById(R$id.ucCardBottomSpacing);
                        case 3:
/* 80 */                    return (UCTextView) uCCard.findViewById(R$id.ucCardDescription);
                        case 4:
/* 69 */                    return uCCard.findViewById(R$id.ucCardDividerExpandedContent);
                        case 5:
/* 64 */                    return (ViewGroup) uCCard.findViewById(R$id.ucCardExpandableContent);
                        case 6:
/* 53 */                    return uCCard.findViewById(R$id.ucCardHeader);
                        case 7:
/* 48 */                    return (UCButton) uCCard.findViewById(R$id.ucCardIcon);
                        case 8:
/* 39 */                    return (UCToggle) uCCard.findViewById(R$id.ucCardSwitch);
                        case 9:
/* 30 */                    return (ViewGroup) uCCard.findViewById(R$id.ucCardSwitchList);
                        case 10:
/* 19 */                    return uCCard.findViewById(R$id.ucCardSwitchListDivider);
                        default:
/* 14 */                    return (UCTextView) uCCard.findViewById(R$id.ucCardTitle);
                    }
                }
            }
