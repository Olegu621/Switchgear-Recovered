            package p000;

            import android.graphics.Outline;
            import android.view.View;
            import android.view.ViewOutlineProvider;
            import androidx.constraintlayout.utils.widget.ImageFilterButton;
            import com.google.android.material.chip.Chip;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class dw0 extends ViewOutlineProvider {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7430a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ View f7431b;

                public /* synthetic */ dw0(View view, int i) {
/* 1 */             this.f7430a = i;
/* 3 */             this.f7431b = view;
                }

                @Override // android.view.ViewOutlineProvider
                public final void getOutline(View view, Outline outline) {
/* 1 */             int i = this.f7430a;
/* 3 */             View view2 = this.f7431b;
                    switch (i) {
                        case 0:
/* 43 */                    ImageFilterButton imageFilterButton = (ImageFilterButton) view2;
/* 45 */                    int width = imageFilterButton.getWidth();
/* 49 */                    int height = imageFilterButton.getHeight();
/* 68 */                    outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * imageFilterButton.f950f) / 2.0f);
                            break;
                        case 1:
/* 23 */                    ImageFilterButton imageFilterButton2 = (ImageFilterButton) view2;
/* 38 */                    outline.setRoundRect(0, 0, imageFilterButton2.getWidth(), imageFilterButton2.getHeight(), imageFilterButton2.f953i);
                            break;
                        default:
/* 10 */                    C1004hu c1004hu = ((Chip) view2).f4587e;
/* 12 */                    if (c1004hu == null) {
/* 19 */                        outline.setAlpha(0.0f);
                            } else {
/* 14 */                        c1004hu.getOutline(outline);
                            }
                            break;
                    }
                }
            }
