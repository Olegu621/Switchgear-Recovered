            package p000;

            import android.content.Context;
            import com.usercentrics.sdk.p008ui.R$drawable;
            import com.usercentrics.sdk.p008ui.R$id;
            import com.usercentrics.sdk.p008ui.components.UCControllerId;
            import com.usercentrics.sdk.p008ui.components.UCImageView;
            import com.usercentrics.sdk.p008ui.components.UCTextView;
            import kotlin.jvm.functions.Function0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class cu2 extends b51 implements Function0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f6915a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ UCControllerId f6916b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ cu2(UCControllerId uCControllerId, int i) {
/* 6 */             super(0);
/* 1 */             this.f6915a = i;
/* 3 */             this.f6916b = uCControllerId;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
/* 1 */             int i = this.f6915a;
/* 3 */             UCControllerId uCControllerId = this.f6916b;
                    switch (i) {
                        case 0:
/* 49 */                    Context context = uCControllerId.getContext();
/* 53 */                    context.getClass();
/* 58 */                    return mn0.m6700p(context, R$drawable.uc_ic_check_circle_outline);
                        case 1:
/* 35 */                    Context context2 = uCControllerId.getContext();
/* 39 */                    context2.getClass();
/* 44 */                    return mn0.m6700p(context2, R$drawable.uc_ic_copy);
                        case 2:
/* 32 */                    return (UCImageView) uCControllerId.findViewById(R$id.ucControllerIdCopy);
                        case 3:
/* 23 */                    return (UCTextView) uCControllerId.findViewById(R$id.ucControllerIdLabel);
                        default:
/* 14 */                    return (UCTextView) uCControllerId.findViewById(R$id.ucControllerIdValue);
                    }
                }
            }
