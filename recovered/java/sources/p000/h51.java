            package p000;

            import android.view.View;
            import com.usercentrics.sdk.p008ui.PredefinedUIResponse;
            import com.usercentrics.sdk.p008ui.components.UCButton;
            import com.usercentrics.sdk.p008ui.components.UCToggle;
            import com.usercentrics.sdk.p008ui.components.links.UCLink;
            import com.usercentrics.sdk.p008ui.secondLayer.component.footer.UCSecondLayerFooter;
            import com.usercentrics.sdk.p008ui.secondLayer.component.header.UCSecondLayerHeader;
            import io.sentry.android.core.AlertDialogC1270s1;
            import io.sentry.android.core.SentryUserFeedbackButton;
            import kotlin.jvm.functions.Function0;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class h51 implements View.OnClickListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f8900a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f8901b;

                public /* synthetic */ h51(Object obj, int i) {
/* 1 */             this.f8900a = i;
/* 3 */             this.f8901b = obj;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    n01 n01Var;
/* 1 */             int i = this.f8900a;
/* 4 */             Object obj = this.f8901b;
                    switch (i) {
                        case 0:
/* 121 */                   i51 i51Var = (i51) obj;
/* 125 */                   i51Var.f9450b.dismiss();
/* 128 */                   Object tag = view.getTag();
/* 137 */                   String str = tag instanceof String ? (String) tag : null;
/* 139 */                   if (str == null || (n01Var = i51Var.f9451c) == null) {
/* 149 */                       return;
                            }
/* 146 */                   n01Var.invoke(str);
/* 149 */                   return;
                        case 1:
/* 115 */                   int i2 = UCButton.f6240i0;
/* 117 */                   ((Function0) obj).invoke();
/* 120 */                   return;
                        case 2:
/* 109 */                   ((UCToggle) obj).toggle();
/* 112 */                   return;
                        case 3:
/* 92 */                    we2 we2Var = (we2) obj;
/* 94 */                    int i3 = UCLink.f6273e0;
/* 96 */                    we2Var.getClass();
/* 103 */                   ((Function0) we2Var.f18595b).invoke();
/* 106 */                   return;
                        case 4:
/* 88 */                    UCSecondLayerFooter.m2810j((UCSecondLayerFooter) obj);
/* 91 */                    return;
                        case 5:
/* 41 */                    int i4 = UCSecondLayerHeader.f6281w0;
/* 43 */                    qv2 qv2Var = ((UCSecondLayerHeader) obj).f6294s0;
/* 45 */                    if (qv2Var == null) {
/* 82 */                        Intrinsics.m6220e("viewModel");
/* 85 */                        throw null;
                            }
/* 47 */                    yv2 yv2Var = qv2Var.f15783c;
/* 49 */                    ac1 ac1Var = yv2Var.f19824c;
/* 76 */                    yv2Var.f19834m.m8898g(he3.m4198u(new PredefinedUIResponse(av1.f2108d, ((a13) ac1Var.f177b).m30k(), (String) ac1Var.f179d)));
/* 79 */                    return;
                        case 6:
/* 15 */                    SentryUserFeedbackButton sentryUserFeedbackButton = (SentryUserFeedbackButton) obj;
/* 17 */                    int i5 = SentryUserFeedbackButton.f9892b;
/* 28 */                    new AlertDialogC1270s1(sentryUserFeedbackButton.getContext()).show();
/* 31 */                    View.OnClickListener onClickListener = sentryUserFeedbackButton.f9893a;
/* 33 */                    if (onClickListener != null) {
/* 35 */                        onClickListener.onClick(view);
/* 38 */                        return;
                            }
/* 38 */                    return;
                        default:
/* 11 */                    ((AlertDialogC1270s1) obj).cancel();
/* 14 */                    return;
                    }
                }
            }
