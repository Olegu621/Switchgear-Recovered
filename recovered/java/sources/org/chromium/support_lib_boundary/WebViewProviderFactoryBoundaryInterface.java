            package org.chromium.support_lib_boundary;

            import android.webkit.WebView;
            import java.lang.reflect.InvocationHandler;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public interface WebViewProviderFactoryBoundaryInterface {
                InvocationHandler createWebView(WebView webView);

                InvocationHandler getDropDataProvider();

                InvocationHandler getProfileStore();

                InvocationHandler getProxyController();

                InvocationHandler getServiceWorkerController();

                InvocationHandler getStatics();

                String[] getSupportedFeatures();

                InvocationHandler getTracingController();

                InvocationHandler getWebkitToCompatConverter();
            }
