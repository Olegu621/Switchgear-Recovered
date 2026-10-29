            package p000;

            import android.webkit.WebView;
            import android.webkit.WebViewRenderProcess;
            import android.webkit.WebViewRenderProcessClient;
            import java.lang.ref.WeakReference;
            import java.util.WeakHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class h73 extends WebViewRenderProcessClient {

                /* JADX INFO: renamed from: a */
                public final g73 f8948a;

                public h73(g73 g73Var) {
/* 4 */             this.f8948a = g73Var;
                }

                public final void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
/* 1 */             WeakHashMap weakHashMap = i73.f9490c;
/* 7 */             i73 i73Var = (i73) weakHashMap.get(webViewRenderProcess);
/* 9 */             if (i73Var == null) {
/* 14 */                i73Var = new i73();
/* 22 */                i73Var.f9492b = new WeakReference(webViewRenderProcess);
/* 24 */                weakHashMap.put(webViewRenderProcess, i73Var);
                    }
/* 29 */            this.f8948a.onRenderProcessResponsive(webView, i73Var);
                }

                public final void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
/* 1 */             WeakHashMap weakHashMap = i73.f9490c;
/* 7 */             i73 i73Var = (i73) weakHashMap.get(webViewRenderProcess);
/* 9 */             if (i73Var == null) {
/* 14 */                i73Var = new i73();
/* 22 */                i73Var.f9492b = new WeakReference(webViewRenderProcess);
/* 24 */                weakHashMap.put(webViewRenderProcess, i73Var);
                    }
/* 29 */            this.f8948a.onRenderProcessUnresponsive(webView, i73Var);
                }
            }
