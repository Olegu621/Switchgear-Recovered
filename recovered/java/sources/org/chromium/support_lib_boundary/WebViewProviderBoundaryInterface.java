            package org.chromium.support_lib_boundary;

            import android.net.Uri;
            import android.webkit.WebChromeClient;
            import android.webkit.WebViewClient;
            import java.lang.reflect.InvocationHandler;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public interface WebViewProviderBoundaryInterface {
                InvocationHandler addDocumentStartJavaScript(String str, String[] strArr);

                void addWebMessageListener(String str, String[] strArr, InvocationHandler invocationHandler);

                InvocationHandler[] createWebMessageChannel();

                InvocationHandler getProfile();

                WebChromeClient getWebChromeClient();

                WebViewClient getWebViewClient();

                InvocationHandler getWebViewRenderer();

                InvocationHandler getWebViewRendererClient();

                void insertVisualStateCallback(long j, InvocationHandler invocationHandler);

                boolean isAudioMuted();

                void postMessageToMainFrame(InvocationHandler invocationHandler, Uri uri);

                void removeWebMessageListener(String str);

                void setAudioMuted(boolean z);

                void setProfile(String str);

                void setWebViewRendererClient(InvocationHandler invocationHandler);
            }
