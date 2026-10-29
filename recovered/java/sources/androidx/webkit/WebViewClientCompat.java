            package androidx.webkit;

            import android.app.PendingIntent;
            import android.webkit.SafeBrowsingResponse;
            import android.webkit.WebResourceError;
            import android.webkit.WebResourceRequest;
            import android.webkit.WebView;
            import android.webkit.WebViewClient;
            import java.lang.reflect.InvocationHandler;
            import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
            import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;
            import org.chromium.support_lib_boundary.WebViewClientBoundaryInterface;
            import p000.j13;
            import p000.n63;
            import p000.o63;
            import p000.t52;
            import p000.u52;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 18 */    public abstract class WebViewClientCompat extends WebViewClient implements WebViewClientBoundaryInterface {
                private static final String[] sSupportedFeatures = {"VISUAL_STATE_CALLBACK", "RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_HTTP_ERROR", "SHOULD_OVERRIDE_WITH_REDIRECTS", "SAFE_BROWSING_HIT"};

                @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
                public final String[] getSupportedFeatures() {
/* 1 */             return sSupportedFeatures;
                }

                @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
                public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, InvocationHandler invocationHandler) {
/* 3 */             o63 o63Var = new o63();
/* 14 */            o63Var.f14652b = (WebResourceErrorBoundaryInterface) j13.m5642b(WebResourceErrorBoundaryInterface.class, invocationHandler);
/* 16 */            onReceivedError(webView, webResourceRequest, o63Var);
                }

                public abstract void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, n63 n63Var);

                @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
                public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, InvocationHandler invocationHandler) {
/* 3 */             u52 u52Var = new u52();
/* 14 */            u52Var.f17364b = (SafeBrowsingResponseBoundaryInterface) j13.m5642b(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
/* 16 */            onSafeBrowsingHit(webView, webResourceRequest, i, u52Var);
                }

                public abstract void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, t52 t52Var);

                @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
                public boolean onWebAuthnIntent(WebView webView, PendingIntent pendingIntent, InvocationHandler invocationHandler) {
/* 1 */             return false;
                }

                @Override // android.webkit.WebViewClient
/* 19 */        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
/* 21 */            o63 o63Var = new o63();
/* 22 */            o63Var.f14651a = webResourceError;
/* 23 */            onReceivedError(webView, webResourceRequest, o63Var);
                }

                @Override // android.webkit.WebViewClient
/* 19 */        public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
/* 21 */            u52 u52Var = new u52();
/* 22 */            u52Var.f17363a = safeBrowsingResponse;
/* 23 */            onSafeBrowsingHit(webView, webResourceRequest, i, u52Var);
                }
            }
