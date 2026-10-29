            package p000;

            import android.view.View;
            import io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate;
            import io.flutter.plugin.platform.PlatformViewsController;
            import io.flutter.plugin.platform.PlatformViewsController2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class bt1 implements View.OnFocusChangeListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f2594a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ int f2595b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ PlatformViewsAccessibilityDelegate f2596c;

                public /* synthetic */ bt1(PlatformViewsAccessibilityDelegate platformViewsAccessibilityDelegate, int i, int i2) {
/* 1 */             this.f2594a = i2;
/* 3 */             this.f2596c = platformViewsAccessibilityDelegate;
/* 5 */             this.f2595b = i;
                }

                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
/* 1 */             int i = this.f2594a;
/* 3 */             int i2 = this.f2595b;
/* 5 */             PlatformViewsAccessibilityDelegate platformViewsAccessibilityDelegate = this.f2596c;
                    switch (i) {
                        case 0:
/* 1 */                     ((PlatformViewsController) platformViewsAccessibilityDelegate).lambda$initializePlatformViewIfNeeded$2(i2, view, z);
                            break;
                        default:
/* 1 */                     ((PlatformViewsController2) platformViewsAccessibilityDelegate).lambda$initializePlatformViewIfNeeded$0(i2, view, z);
                            break;
                    }
                }
            }
