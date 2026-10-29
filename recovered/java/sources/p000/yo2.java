            package p000;

            import android.view.KeyEvent;
            import android.widget.TextView;
            import com.supercell.titan.GameApp;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class yo2 implements TextView.OnEditorActionListener {
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
/* 2 */             if (i != 6) {
/* 13 */                return false;
                    }
/* 10 */            GameApp.getInstance().runOnView(bp2.f2561b);
/* 13 */            return false;
                }
            }
