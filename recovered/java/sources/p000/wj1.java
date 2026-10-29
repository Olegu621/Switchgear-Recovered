            package p000;

            import android.graphics.Outline;
            import android.view.View;
            import android.view.ViewOutlineProvider;
            import androidx.constraintlayout.utils.widget.MotionButton;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class wj1 extends ViewOutlineProvider {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f18663a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ MotionButton f18664b;

                public /* synthetic */ wj1(MotionButton motionButton, int i) {
/* 1 */             this.f18663a = i;
/* 3 */             this.f18664b = motionButton;
                }

                @Override // android.view.ViewOutlineProvider
                public final void getOutline(View view, Outline outline) {
/* 1 */             int i = this.f18663a;
/* 3 */             MotionButton motionButton = this.f18664b;
                    switch (i) {
                        case 0:
/* 26 */                    int width = motionButton.getWidth();
/* 30 */                    int height = motionButton.getHeight();
/* 49 */                    outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * motionButton.f983d) / 2.0f);
                            break;
                        default:
/* 21 */                    outline.setRoundRect(0, 0, motionButton.getWidth(), motionButton.getHeight(), motionButton.f984e);
                            break;
                    }
                }
            }
