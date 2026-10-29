            package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

            import android.webkit.WebView;
            import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate;
            import p000.f73;
            import p000.g73;
            import p000.xe2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class InAppWebViewRenderProcessClient extends g73 {
                protected static final String LOG_TAG = "IAWRenderProcessClient";

                public void dispose() {
                }

                @Override // p000.g73
                public void onRenderProcessResponsive(WebView webView, final f73 f73Var) {
/* 1 */             InAppWebView inAppWebView = (InAppWebView) webView;
/* 5 */             WebViewChannelDelegate.RenderProcessResponsiveCallback renderProcessResponsiveCallback = new WebViewChannelDelegate.RenderProcessResponsiveCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewRenderProcessClient.2
                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, io.flutter.plugin.common.MethodChannel.Result
                        public void error(String str, String str2, Object obj) {
/* 2 */                     defaultBehaviour((Integer) null);
                        }

                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                        public boolean nonNullSuccess(Integer num) {
/* 3 */                     if (f73Var == null) {
/* 27 */                        return true;
                            }
/* 9 */                     if (num.intValue() != 0 || !xe2.m9786x("WEB_VIEW_RENDERER_TERMINATE")) {
/* 25 */                        return false;
                            }
/* 22 */                    f73Var.mo3675a();
/* 25 */                    return false;
                        }

                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
/* 6 */                 public void defaultBehaviour(Integer num) {
                        }
                    };
/* 8 */             WebViewChannelDelegate webViewChannelDelegate = inAppWebView.channelDelegate;
/* 10 */            if (webViewChannelDelegate != null) {
/* 16 */                webViewChannelDelegate.onRenderProcessResponsive(inAppWebView.getUrl(), renderProcessResponsiveCallback);
                    } else {
/* 21 */                renderProcessResponsiveCallback.defaultBehaviour(null);
                    }
                }

                @Override // p000.g73
                public void onRenderProcessUnresponsive(WebView webView, final f73 f73Var) {
/* 1 */             InAppWebView inAppWebView = (InAppWebView) webView;
/* 5 */             WebViewChannelDelegate.RenderProcessUnresponsiveCallback renderProcessUnresponsiveCallback = new WebViewChannelDelegate.RenderProcessUnresponsiveCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewRenderProcessClient.1
                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, io.flutter.plugin.common.MethodChannel.Result
                        public void error(String str, String str2, Object obj) {
/* 2 */                     defaultBehaviour((Integer) null);
                        }

                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                        public boolean nonNullSuccess(Integer num) {
/* 3 */                     if (f73Var == null) {
/* 27 */                        return true;
                            }
/* 9 */                     if (num.intValue() != 0 || !xe2.m9786x("WEB_VIEW_RENDERER_TERMINATE")) {
/* 25 */                        return false;
                            }
/* 22 */                    f73Var.mo3675a();
/* 25 */                    return false;
                        }

                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
/* 6 */                 public void defaultBehaviour(Integer num) {
                        }
                    };
/* 8 */             WebViewChannelDelegate webViewChannelDelegate = inAppWebView.channelDelegate;
/* 10 */            if (webViewChannelDelegate != null) {
/* 16 */                webViewChannelDelegate.onRenderProcessUnresponsive(inAppWebView.getUrl(), renderProcessUnresponsiveCallback);
                    } else {
/* 21 */                renderProcessUnresponsiveCallback.defaultBehaviour(null);
                    }
                }
            }
