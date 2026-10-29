            package p000;

            import android.view.KeyEvent;
            import android.view.View;
            import com.supercell.titan.VirtualKeyboardHandler;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class xo2 implements View.OnKeyListener {
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i, KeyEvent keyEvent) {
/* 4 */             if (i == 66) {
/* 6 */                 VirtualKeyboardHandler.inputOkPressed();
/* 3 */                 return true;
                    }
/* 12 */            if (i != 111) {
/* 18 */                return false;
                    }
/* 14 */            VirtualKeyboardHandler.inputEscPressed();
/* 3 */             return true;
                }
            }
