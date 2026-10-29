            package p000;

            import android.webkit.ValueCallback;
            import com.helpshift.activities.HSMainActivity;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ks0 implements ValueCallback {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ ls0 f12995a;

                public ks0(ls0 ls0Var) {
/* 4 */             this.f12995a = ls0Var;
                }

                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
/* 1 */             String str = (String) obj;
/* 20 */            xe2.m9775m("HSChatFragment", "Back press handle from webchat" + str, null);
/* 25 */            HSMainActivity hSMainActivity = this.f12995a.f13484w;
/* 27 */            if (hSMainActivity != null) {
/* 33 */                hSMainActivity.m2540g(Boolean.parseBoolean(str));
                    }
                }
            }
