            package p000;

            import android.graphics.Outline;
            import android.view.View;
            import android.view.ViewOutlineProvider;
            import androidx.constraintlayout.utils.widget.ImageFilterView;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ew0 extends ViewOutlineProvider {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7905a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ImageFilterView f7906b;

                public /* synthetic */ ew0(ImageFilterView imageFilterView, int i) {
/* 1 */             this.f7905a = i;
/* 3 */             this.f7906b = imageFilterView;
                }

                @Override // android.view.ViewOutlineProvider
                public final void getOutline(View view, Outline outline) {
/* 1 */             int i = this.f7905a;
/* 3 */             ImageFilterView imageFilterView = this.f7906b;
                    switch (i) {
                        case 0:
/* 26 */                    int width = imageFilterView.getWidth();
/* 30 */                    int height = imageFilterView.getHeight();
/* 49 */                    outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * imageFilterView.f968f) / 2.0f);
                            break;
                        default:
/* 21 */                    outline.setRoundRect(0, 0, imageFilterView.getWidth(), imageFilterView.getHeight(), imageFilterView.f969i);
                            break;
                    }
                }
            }
