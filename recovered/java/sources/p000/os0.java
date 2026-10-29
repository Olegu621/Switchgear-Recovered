            package p000;

            import android.content.Intent;
            import android.net.Uri;
            import android.webkit.WebResourceRequest;
            import android.webkit.WebResourceResponse;
            import android.webkit.WebView;
            import android.webkit.WebViewClient;
            import java.lang.ref.WeakReference;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class os0 extends WebViewClient {

                /* JADX INFO: renamed from: a */
                public final eq2 f14882a;

                /* JADX INFO: renamed from: b */
                public final C1969nm f14883b;

                /* JADX INFO: renamed from: c */
                public boolean f14884c;

                public os0(eq2 eq2Var, C1969nm c1969nm) {
/* 4 */             this.f14882a = eq2Var;
/* 6 */             this.f14883b = c1969nm;
                }

                @Override // android.webkit.WebViewClient
                public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
/* 11 */            if (!"GET".equalsIgnoreCase(webResourceRequest.getMethod())) {
/* 13 */                return super.shouldInterceptRequest(webView, webResourceRequest);
                    }
/* 18 */            boolean z = this.f14884c;
/* 20 */            C1969nm c1969nm = this.f14883b;
/* 22 */            if (!z) {
/* 24 */                c1969nm.m6999a();
/* 28 */                this.f14884c = true;
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
/* 129 */               xe2.m9777o("ChatWebClient", "Webview response error for request-" + webResourceRequest.getUrl(), null);
/* 132 */               return webResourceResponseShouldInterceptRequest;
                    }
/* 107 */           xe2.m9775m("ChatWebClient", "Webview response received for request-" + webResourceRequest.toString() + " status:" + webResourceResponseShouldInterceptRequest.getStatusCode() + " MimeType:" + webResourceResponseShouldInterceptRequest.getMimeType(), null);
/* 110 */           return webResourceResponseShouldInterceptRequest;
                }

                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView, String str) {
/* 9 */             Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
/* 22 */            ls0 ls0Var = (ls0) ((WeakReference) this.f14882a.f7838i).get();
/* 24 */            if (ls0Var == null) {
/* 38 */                return true;
                    }
                    try {
/* 26 */                ls0Var.startActivity(intent);
/* 38 */                return true;
                    } catch (Exception e) {
/* 35 */                xe2.m9777o("HSChatFragment", "Error in opening a link in system app", e);
/* 38 */                return true;
                    }
                }
            }
