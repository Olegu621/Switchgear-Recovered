            package p000;

            import android.webkit.WebView;
            import org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface;
            import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
            import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
            import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;
            import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
            import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface e73 {
                /* JADX INFO: renamed from: a */
                String[] mo2990a();

                WebViewProviderBoundaryInterface createWebView(WebView webView);

                DropDataContentProviderBoundaryInterface getDropDataProvider();

                ProxyControllerBoundaryInterface getProxyController();

                StaticsBoundaryInterface getStatics();

                TracingControllerBoundaryInterface getTracingController();

                WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter();
            }
