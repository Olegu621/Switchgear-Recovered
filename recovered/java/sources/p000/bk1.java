            package p000;

            import android.graphics.Outline;
            import android.view.View;
            import android.view.ViewOutlineProvider;
            import androidx.constraintlayout.utils.widget.MotionLabel;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class bk1 extends ViewOutlineProvider {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f2493a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ MotionLabel f2494b;

                public /* synthetic */ bk1(MotionLabel motionLabel, int i) {
/* 1 */             this.f2493a = i;
/* 3 */             this.f2494b = motionLabel;
                }

                @Override // android.view.ViewOutlineProvider
                public final void getOutline(View view, Outline outline) {
/* 1 */             int i = this.f2493a;
/* 3 */             MotionLabel motionLabel = this.f2494b;
                    switch (i) {
                        case 0:
/* 26 */                    int width = motionLabel.getWidth();
/* 30 */                    int height = motionLabel.getHeight();
/* 49 */                    outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * motionLabel.f1009f) / 2.0f);
                            break;
                        default:
/* 21 */                    outline.setRoundRect(0, 0, motionLabel.getWidth(), motionLabel.getHeight(), motionLabel.f1013i);
                            break;
                    }
                }
            }
