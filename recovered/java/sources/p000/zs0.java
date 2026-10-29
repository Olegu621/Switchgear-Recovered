            package p000;

            import android.webkit.WebResourceRequest;
            import android.webkit.WebResourceResponse;
            import android.webkit.WebView;
            import android.webkit.WebViewClient;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zs0 extends WebViewClient {

                /* JADX INFO: renamed from: a */
                public C1969nm f20318a;

                /* JADX INFO: renamed from: b */
                public boolean f20319b;

                @Override // android.webkit.WebViewClient
                public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
/* 1 */             C1969nm c1969nm = this.f20318a;
/* 13 */            if (!"GET".equalsIgnoreCase(webResourceRequest.getMethod())) {
/* 15 */                return super.shouldInterceptRequest(webView, webResourceRequest);
                    }
/* 22 */            if (!this.f20319b) {
/* 24 */                c1969nm.m6999a();
/* 28 */                this.f20319b = true;
                    }
/* 42 */            if (!c1969nm.m7012o(webResourceRequest.getUrl().getPath())) {
/* 44 */                return super.shouldInterceptRequest(webView, webResourceRequest);
                    }
/* 49 */            WebResourceResponse webResourceResponseM9784v = xe2.m9784v(c1969nm, webResourceRequest);
/* 53 */            if (webResourceResponseM9784v != null) {
/* 55 */                return webResourceResponseM9784v;
                    }
/* 56 */            WebResourceResponse webResourceResponseShouldInterceptRequest = super.shouldInterceptRequest(webView, webResourceRequest);
/* 63 */            if (webResourceResponseShouldInterceptRequest == null) {
/* 129 */               xe2.m9777o("HelpcntrWebClient", "Webview response error for request-" + webResourceRequest.getUrl(), null);
/* 132 */               return webResourceResponseShouldInterceptRequest;
                    }
/* 107 */           xe2.m9775m("HelpcntrWebClient", "Webview response received for request-" + webResourceRequest.toString() + " status:" + webResourceResponseShouldInterceptRequest.getStatusCode() + " MimeType:" + webResourceResponseShouldInterceptRequest.getMimeType(), null);
/* 110 */           return webResourceResponseShouldInterceptRequest;
                }

                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView, String str) {
/* 7 */             if (!str.startsWith("https://") && !str.startsWith("http://")) {
/* 18 */                return super.shouldOverrideUrlLoading(webView, str);
                    }
/* 23 */            webView.loadUrl(str);
/* 26 */            return false;
                }
            }
