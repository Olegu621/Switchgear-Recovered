            package p000;

            import android.webkit.WebSettings;
            import android.webkit.WebView;
            import android.webkit.WebViewRenderProcess;
            import android.webkit.WebViewRenderProcessClient;
            import java.util.concurrent.Executor;
            
            /* JADX INFO: renamed from: u9 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC2247u9 {
                @Deprecated
                /* JADX INFO: renamed from: a */
                public static int m8974a(WebSettings webSettings) {
/* 1 */             return webSettings.getForceDark();
                }

                /* JADX INFO: renamed from: b */
                public static WebViewRenderProcess m8975b(WebView webView) {
/* 1 */             return webView.getWebViewRenderProcess();
                }

                /* JADX INFO: renamed from: c */
                public static WebViewRenderProcessClient m8976c(WebView webView) {
/* 1 */             return webView.getWebViewRenderProcessClient();
                }

                @Deprecated
                /* JADX INFO: renamed from: d */
                public static void m8977d(WebSettings webSettings, int i) {
/* 1 */             webSettings.setForceDark(i);
                }

                /* JADX INFO: renamed from: e */
                public static void m8978e(WebView webView, g73 g73Var) {
/* 1 */             webView.setWebViewRenderProcessClient(g73Var != null ? new h73(g73Var) : null);
                }

                /* JADX INFO: renamed from: f */
                public static void m8979f(WebView webView, Executor executor, g73 g73Var) {
/* 1 */             webView.setWebViewRenderProcessClient(executor, g73Var != null ? new h73(g73Var) : null);
                }

                /* JADX INFO: renamed from: g */
                public static boolean m8980g(WebViewRenderProcess webViewRenderProcess) {
/* 1 */             return webViewRenderProcess.terminate();
                }
            }
