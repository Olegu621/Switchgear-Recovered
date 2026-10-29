            package p000;

            import android.text.Editable;
            import android.text.TextWatcher;
            import com.supercell.titan.GameApp;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zo2 implements TextWatcher {

                /* JADX INFO: renamed from: a */
                public String f20283a = HttpUrl.FRAGMENT_ENCODE_SET;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ bp2 f20284b;

                public zo2(bp2 bp2Var) {
/* 4 */             this.f20284b = bp2Var;
                }

                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
/* 1 */             String string = editable.toString();
/* 11 */            if (string.equals(this.f20283a) || this.f20284b.f2562a) {
/* 33 */                return;
                    }
/* 30 */            GameApp.getInstance().runOnView(new iu0(string, 4));
                }

                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
/* 5 */             this.f20283a = charSequence.toString();
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }
            }
