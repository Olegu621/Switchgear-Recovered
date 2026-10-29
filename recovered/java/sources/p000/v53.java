            package p000;

            import android.view.inputmethod.InputMethodManager;
            import com.supercell.titan.GameApp;
            import com.supercell.titan.KeyboardDialog;
            import com.supercell.titan.VirtualKeyboardHandler;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class v53 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ boolean f17869a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ boolean f17870b;

                public v53(boolean z, boolean z2) {
/* 4 */             this.f17869a = z;
/* 6 */             this.f17870b = z2;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             KeyboardDialog keyboardDialog = VirtualKeyboardHandler.f5977c;
/* 3 */             if (keyboardDialog != null) {
/* 5 */                 bp2 bp2Var = keyboardDialog.f5816d;
/* 7 */                 GameApp gameApp = keyboardDialog.f5813a;
/* 15 */                InputMethodManager inputMethodManager = (InputMethodManager) gameApp.getSystemService("input_method");
/* 17 */                if (inputMethodManager != null && bp2Var != null) {
/* 28 */                    inputMethodManager.hideSoftInputFromWindow(bp2Var.getWindowToken(), 0);
/* 31 */                    bp2Var.clearFocus();
/* 36 */                    if (this.f17869a && !this.f17870b) {
/* 42 */                        VirtualKeyboardHandler.inputKeyboardDismissed();
                            }
/* 45 */                    gameApp.setSystemUiVisibility();
/* 50 */                    gameApp.setSystemUiVisibilityDelayed(2000L);
/* 53 */                    keyboardDialog.dismiss();
                        }
/* 57 */                VirtualKeyboardHandler.f5977c = null;
                    }
                }
            }
