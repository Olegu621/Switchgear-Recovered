            package com.pichillilorenzo.flutter_inappwebview_android.webview.web_message;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
            import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessageCompatExt;
            import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
            import io.flutter.plugin.common.MethodCall;
            import io.flutter.plugin.common.MethodChannel;
            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class WebMessageChannelChannelDelegate extends ChannelDelegateImpl {
                private WebMessageChannel webMessageChannel;

                public WebMessageChannelChannelDelegate(WebMessageChannel webMessageChannel, MethodChannel methodChannel) {
/* 1 */             super(methodChannel);
/* 4 */             this.webMessageChannel = webMessageChannel;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
                public void dispose() {
/* 1 */             super.dispose();
/* 5 */             this.webMessageChannel = null;
                }

                public void onMessage(int i, WebMessageCompatExt webMessageCompatExt) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 10 */            HashMap map = new HashMap();
/* 19 */            map.put(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i));
/* 32 */            map.put("message", webMessageCompatExt != null ? webMessageCompatExt.toMap() : null);
/* 37 */            channel.invokeMethod("onMessage", map);
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
                public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
/* 1 */             String str = methodCall.method;
/* 3 */             str.getClass();
                    switch (str) {
                        case "close":
/* 128 */                   WebMessageChannel webMessageChannel = this.webMessageChannel;
/* 130 */                   if (webMessageChannel != null && (webMessageChannel.webView instanceof InAppWebView)) {
/* 146 */                       this.webMessageChannel.closeForInAppWebView((Integer) methodCall.argument(FirebaseAnalytics.Param.INDEX), result);
                                break;
                            } else {
/* 152 */                       result.success(Boolean.FALSE);
                                break;
                            }
                            break;
                        case "setWebMessageCallback":
/* 96 */                    WebMessageChannel webMessageChannel2 = this.webMessageChannel;
/* 98 */                    if (webMessageChannel2 != null && (webMessageChannel2.webView instanceof InAppWebView)) {
/* 118 */                       this.webMessageChannel.setWebMessageCallbackForInAppWebView(((Integer) methodCall.argument(FirebaseAnalytics.Param.INDEX)).intValue(), result);
                                break;
                            } else {
/* 124 */                       result.success(Boolean.FALSE);
                                break;
                            }
                            break;
                        case "postMessage":
/* 56 */                    WebMessageChannel webMessageChannel3 = this.webMessageChannel;
/* 58 */                    if (webMessageChannel3 != null && (webMessageChannel3.webView instanceof InAppWebView)) {
/* 86 */                        this.webMessageChannel.postMessageForInAppWebView((Integer) methodCall.argument(FirebaseAnalytics.Param.INDEX), WebMessageCompatExt.fromMap((Map) methodCall.argument("message")), result);
                                break;
                            } else {
/* 92 */                        result.success(Boolean.FALSE);
                                break;
                            }
                            break;
                        default:
/* 52 */                    result.notImplemented();
                            break;
                    }
                }
            }
