            package p000;

            import androidx.appcompat.widget.ActionBarOverlayLayout;
            
            /* JADX INFO: renamed from: x1 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class RunnableC2352x1 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f18887a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ActionBarOverlayLayout f18888b;

                public /* synthetic */ RunnableC2352x1(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
/* 1 */             this.f18887a = i;
/* 3 */             this.f18888b = actionBarOverlayLayout;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f18887a;
/* 3 */             ActionBarOverlayLayout actionBarOverlayLayout = this.f18888b;
                    switch (i) {
                        case 0:
/* 38 */                    actionBarOverlayLayout.m342b();
/* 58 */                    actionBarOverlayLayout.f448k0 = actionBarOverlayLayout.f437d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f449l0);
                            break;
                        default:
/* 8 */                     actionBarOverlayLayout.m342b();
/* 35 */                    actionBarOverlayLayout.f448k0 = actionBarOverlayLayout.f437d.animate().translationY(-actionBarOverlayLayout.f437d.getHeight()).setListener(actionBarOverlayLayout.f449l0);
                            break;
                    }
                }
            }
