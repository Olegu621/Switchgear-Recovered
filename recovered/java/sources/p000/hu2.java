            package p000;

            import android.widget.LinearLayout;
            import androidx.recyclerview.widget.RecyclerView;
            import com.usercentrics.sdk.p008ui.R$id;
            import com.usercentrics.sdk.p008ui.components.UCImageView;
            import com.usercentrics.sdk.p008ui.components.UCTextView;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class hu2 extends b51 implements Function0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f9329a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ iu2 f9330b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ hu2(iu2 iu2Var, int i) {
/* 6 */             super(0);
/* 1 */             this.f9329a = i;
/* 3 */             this.f9330b = iu2Var;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
/* 1 */             int i = this.f9329a;
/* 3 */             iu2 iu2Var = this.f9330b;
                    switch (i) {
                        case 0:
/* 80 */                    iu2.m5555k(iu2Var);
/* 83 */                    return Unit.f12910a;
                        case 1:
/* 77 */                    return (UCImageView) iu2Var.findViewById(R$id.ucCookieDialogClose);
                        case 2:
/* 68 */                    return (RecyclerView) iu2Var.findViewById(R$id.ucCookieDialogList);
                        case 3:
/* 59 */                    return (UCTextView) iu2Var.findViewById(R$id.ucCookieDialogTitle);
                        case 4:
/* 50 */                    return (LinearLayout) iu2Var.findViewById(R$id.ucCookieLoadingBox);
                        case 5:
/* 41 */                    return (UCTextView) iu2Var.findViewById(R$id.ucCookieLoadingText);
                        case 6:
/* 32 */                    return (LinearLayout) iu2Var.findViewById(R$id.ucCookieRetryBox);
                        case 7:
/* 23 */                    return (UCTextView) iu2Var.findViewById(R$id.ucCookieRetryMessage);
                        default:
/* 14 */                    return (UCTextView) iu2Var.findViewById(R$id.ucCookieTryAgainBtn);
                    }
                }
            }
