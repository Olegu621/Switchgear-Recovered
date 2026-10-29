            package p000;

            import androidx.appcompat.widget.Toolbar;
            import androidx.viewpager.widget.ViewPager;
            import com.google.android.material.appbar.AppBarLayout;
            import com.usercentrics.sdk.p008ui.R$id;
            import com.usercentrics.sdk.p008ui.secondLayer.component.footer.UCSecondLayerFooter;
            import com.usercentrics.sdk.p008ui.secondLayer.component.header.UCSecondLayerHeader;
            import kotlin.jvm.functions.Function0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class vv2 extends b51 implements Function0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f18369a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ wv2 f18370b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ vv2(wv2 wv2Var, int i) {
/* 6 */             super(0);
/* 1 */             this.f18369a = i;
/* 3 */             this.f18370b = wv2Var;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
/* 1 */             int i = this.f18369a;
/* 3 */             wv2 wv2Var = this.f18370b;
                    switch (i) {
                        case 0:
/* 50 */                    return (AppBarLayout) wv2Var.findViewById(R$id.ucAppBar);
                        case 1:
/* 41 */                    return (ViewPager) wv2Var.findViewById(R$id.ucContentViewPager);
                        case 2:
/* 32 */                    return (UCSecondLayerFooter) wv2Var.findViewById(R$id.ucFooter);
                        case 3:
/* 23 */                    return (UCSecondLayerHeader) wv2Var.findViewById(R$id.ucHeader);
                        default:
/* 14 */                    return (Toolbar) wv2Var.findViewById(R$id.ucToolbar);
                    }
                }
            }
