            package com.pichillilorenzo.flutter_inappwebview_android.webview.web_message;

            import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
            import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessageCompatExt;
            import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
            import io.flutter.plugin.common.MethodCall;
            import io.flutter.plugin.common.MethodChannel;
            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class WebMessageListenerChannelDelegate extends ChannelDelegateImpl {
                private WebMessageListener webMessageListener;

                public WebMessageListenerChannelDelegate(WebMessageListener webMessageListener, MethodChannel methodChannel) {
/* 1 */             super(methodChannel);
/* 4 */             this.webMessageListener = webMessageListener;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
                public void dispose() {
/* 1 */             super.dispose();
/* 5 */             this.webMessageListener = null;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
                public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
/* 1 */             String str = methodCall.method;
/* 3 */             str.getClass();
/* 12 */            if (!str.equals("postMessage")) {
/* 14 */                result.notImplemented();
/* 17 */                return;
                    }
/* 18 */            WebMessageListener webMessageListener = this.webMessageListener;
/* 20 */            if (webMessageListener == null || !(webMessageListener.webView instanceof InAppWebView)) {
/* 48 */                result.success(Boolean.FALSE);
                    } else {
/* 42 */                this.webMessageListener.postMessageForInAppWebView(WebMessageCompatExt.fromMap((Map) methodCall.argument("message")), result);
                    }
                }

                public void onPostMessage(WebMessageCompatExt webMessageCompatExt, String str, boolean z) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 10 */            HashMap map = new HashMap();
/* 23 */            map.put("message", webMessageCompatExt != null ? webMessageCompatExt.toMap() : null);
/* 28 */            map.put("sourceOrigin", str);
/* 37 */            map.put("isMainFrame", Boolean.valueOf(z));
/* 42 */            channel.invokeMethod("onPostMessage", map);
                }
            }
