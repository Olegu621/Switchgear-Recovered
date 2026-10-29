            package p000;

            import android.content.pm.PackageInfo;
            import android.webkit.WebChromeClient;
            import android.webkit.WebSettings;
            import android.webkit.WebView;
            import android.webkit.WebViewClient;
            
            /* JADX INFO: renamed from: q9 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC2099q9 {
                /* JADX INFO: renamed from: a */
                public static PackageInfo m7736a() {
/* 1 */             return WebView.getCurrentWebViewPackage();
                }

                /* JADX INFO: renamed from: b */
                public static boolean m7737b(WebSettings webSettings) {
/* 1 */             return webSettings.getSafeBrowsingEnabled();
                }

                /* JADX INFO: renamed from: c */
                public static WebChromeClient m7738c(WebView webView) {
/* 1 */             return webView.getWebChromeClient();
                }

                /* JADX INFO: renamed from: d */
                public static WebViewClient m7739d(WebView webView) {
/* 1 */             return webView.getWebViewClient();
                }

                /* JADX INFO: renamed from: e */
                public static void m7740e(WebSettings webSettings, boolean z) {
/* 1 */             webSettings.setSafeBrowsingEnabled(z);
                }
            }
