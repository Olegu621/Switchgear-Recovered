            package p000;

            import android.view.View;
            import android.view.ViewGroup;
            import android.view.ViewStub;
            import android.widget.ProgressBar;
            import com.google.android.material.tabs.TabLayout;
            import com.usercentrics.sdk.p008ui.R$id;
            import com.usercentrics.sdk.p008ui.components.UCImageView;
            import com.usercentrics.sdk.p008ui.components.UCTextView;
            import com.usercentrics.sdk.p008ui.secondLayer.component.header.UCSecondLayerHeader;
            import kotlin.jvm.functions.Function0;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ov2 extends b51 implements Function0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f14906a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ UCSecondLayerHeader f14907b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ ov2(UCSecondLayerHeader uCSecondLayerHeader, int i) {
/* 6 */             super(0);
/* 1 */             this.f14906a = i;
/* 3 */             this.f14907b = uCSecondLayerHeader;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
/* 1 */             int i = this.f14906a;
/* 6 */             UCSecondLayerHeader uCSecondLayerHeader = this.f14907b;
                    switch (i) {
                        case 0:
/* 137 */                   return (ViewStub) uCSecondLayerHeader.findViewById(R$id.ucHeaderStub);
                        case 1:
/* 114 */                   View view = uCSecondLayerHeader.f6283h0;
/* 116 */                   if (view != null) {
/* 124 */                       return (UCImageView) view.findViewById(R$id.ucHeaderBackButton);
                            }
/* 127 */                   Intrinsics.m6220e("inflatedStubView");
/* 130 */                   throw null;
                        case 2:
/* 111 */                   return (UCImageView) uCSecondLayerHeader.findViewById(R$id.ucHeaderCloseButton);
                        case 3:
/* 100 */                   return uCSecondLayerHeader.findViewById(R$id.ucHeaderContentDivider);
                        case 4:
/* 95 */                    return (UCTextView) uCSecondLayerHeader.findViewById(R$id.ucHeaderDescription);
                        case 5:
/* 72 */                    View view2 = uCSecondLayerHeader.f6283h0;
/* 74 */                    if (view2 != null) {
/* 82 */                        return (UCImageView) view2.findViewById(R$id.ucHeaderLanguageIcon);
                            }
/* 85 */                    Intrinsics.m6220e("inflatedStubView");
/* 88 */                    throw null;
                        case 6:
/* 55 */                    View view3 = uCSecondLayerHeader.f6283h0;
/* 57 */                    if (view3 != null) {
/* 65 */                        return (ProgressBar) view3.findViewById(R$id.ucHeaderLanguageLoading);
                            }
/* 68 */                    Intrinsics.m6220e("inflatedStubView");
/* 71 */                    throw null;
                        case 7:
/* 52 */                    return (ViewGroup) uCSecondLayerHeader.findViewById(R$id.ucHeaderLinks);
                        case 8:
/* 29 */                    View view4 = uCSecondLayerHeader.f6283h0;
/* 31 */                    if (view4 != null) {
/* 39 */                        return (UCImageView) view4.findViewById(R$id.ucHeaderLogo);
                            }
/* 42 */                    Intrinsics.m6220e("inflatedStubView");
/* 45 */                    throw null;
                        case 9:
/* 26 */                    return (TabLayout) uCSecondLayerHeader.findViewById(R$id.ucHeaderTabLayout);
                        default:
/* 17 */                    return (UCTextView) uCSecondLayerHeader.findViewById(R$id.ucHeaderTitle);
                    }
                }
            }
