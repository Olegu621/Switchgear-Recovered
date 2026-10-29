            package p000;

            import android.view.KeyEvent;
            import android.widget.RelativeLayout;
            import com.supercell.titan.GameApp;
            import com.supercell.titan.VirtualKeyboardHandler;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class e41 extends RelativeLayout {
                @Override // android.view.ViewGroup, android.view.View
                public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
/* 6 */             if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
/* 18 */                if (VirtualKeyboardHandler.f5977c != null) {
/* 29 */                    GameApp.getInstance().runOnUiThread(new v53(true, false));
                        }
/* 32 */                VirtualKeyboardHandler.visible = false;
                    }
/* 34 */            return super.dispatchKeyEventPreIme(keyEvent);
                }
            }
