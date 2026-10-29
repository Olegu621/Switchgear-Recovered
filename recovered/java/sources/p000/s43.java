            package p000;

            import android.view.View;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class s43 extends w43 {

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ int f16427f;

                @Override // p000.w43
                /* JADX INFO: renamed from: c */
                public final void mo8400c(View view, float f) {
                    switch (this.f16427f) {
                        case 0:
/* 98 */                    view.setAlpha(m9466a(f));
                            break;
                        case 1:
/* 90 */                    view.setElevation(m9466a(f));
                            break;
                        case 2:
/* 82 */                    view.setPivotX(m9466a(f));
                            break;
                        case 3:
/* 74 */                    view.setPivotY(m9466a(f));
                            break;
                        case 4:
/* 66 */                    view.setRotation(m9466a(f));
                            break;
                        case 5:
/* 58 */                    view.setRotationX(m9466a(f));
                            break;
                        case 6:
/* 50 */                    view.setRotationY(m9466a(f));
                            break;
                        case 7:
/* 42 */                    view.setScaleX(m9466a(f));
                            break;
                        case 8:
/* 34 */                    view.setScaleY(m9466a(f));
                            break;
                        case 9:
/* 26 */                    view.setTranslationX(m9466a(f));
                            break;
                        case 10:
/* 18 */                    view.setTranslationY(m9466a(f));
                            break;
                        default:
/* 10 */                    view.setTranslationZ(m9466a(f));
                            break;
                    }
                }
            }
