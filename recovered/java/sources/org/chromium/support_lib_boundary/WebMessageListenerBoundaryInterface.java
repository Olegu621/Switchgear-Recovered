            package org.chromium.support_lib_boundary;

            import android.net.Uri;
            import android.webkit.WebView;
            import java.lang.reflect.InvocationHandler;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public interface WebMessageListenerBoundaryInterface extends FeatureFlagHolderBoundaryInterface {
                void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z, InvocationHandler invocationHandler2);
            }
