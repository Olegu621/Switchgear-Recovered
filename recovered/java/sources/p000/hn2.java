            package p000;

            import com.google.android.material.internal.CheckableImageButton;
            import com.google.android.material.textfield.TextInputLayout;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class hn2 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f9159a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ TextInputLayout f9160b;

                public /* synthetic */ hn2(TextInputLayout textInputLayout, int i) {
/* 1 */             this.f9159a = i;
/* 3 */             this.f9160b = textInputLayout;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f9159a;
/* 3 */             TextInputLayout textInputLayout = this.f9160b;
                    switch (i) {
                        case 0:
/* 14 */                    CheckableImageButton checkableImageButton = textInputLayout.f5018P0;
/* 16 */                    checkableImageButton.performClick();
/* 19 */                    checkableImageButton.jumpDrawablesToCurrentState();
                            break;
                        default:
/* 10 */                    textInputLayout.f5044e.requestLayout();
                            break;
                    }
                }
            }
