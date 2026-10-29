            package p000;

            import android.view.View;
            import com.usercentrics.sdk.p008ui.R$id;
            import com.usercentrics.sdk.p008ui.components.UCTextView;
            import kotlin.jvm.functions.Function0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class g10 extends b51 implements Function0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f8428a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ View f8429b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ g10(View view, int i) {
/* 6 */             super(0);
/* 1 */             this.f8428a = i;
/* 3 */             this.f8429b = view;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
/* 1 */             int i = this.f8428a;
/* 3 */             View view = this.f8429b;
                    switch (i) {
                        case 0:
/* 30 */                    return (UCTextView) view.findViewById(R$id.ucCardContent);
                        case 1:
/* 21 */                    return (UCTextView) view.findViewById(R$id.ucCookieCardTitle);
                        default:
/* 10 */                    return view.findViewById(R$id.ucCookieCardTitleDivider);
                    }
                }
            }
