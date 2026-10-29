            package com.pichillilorenzo.flutter_inappwebview_android.headless_in_app_webview;

            import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
            import com.pichillilorenzo.flutter_inappwebview_android.types.Size2D;
            import io.flutter.plugin.common.MethodCall;
            import io.flutter.plugin.common.MethodChannel;
            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class HeadlessWebViewChannelDelegate extends ChannelDelegateImpl {
                private HeadlessInAppWebView headlessWebView;

                public HeadlessWebViewChannelDelegate(HeadlessInAppWebView headlessInAppWebView, MethodChannel methodChannel) {
/* 1 */             super(methodChannel);
/* 4 */             this.headlessWebView = headlessInAppWebView;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
                public void dispose() {
/* 1 */             super.dispose();
/* 5 */             this.headlessWebView = null;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
                public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
/* 1 */             String str = methodCall.method;
/* 3 */             str.getClass();
                    switch (str) {
                        case "getSize":
/* 108 */                   HeadlessInAppWebView headlessInAppWebView = this.headlessWebView;
/* 111 */                   if (headlessInAppWebView == null) {
/* 127 */                       result.success(null);
                                break;
                            } else {
/* 113 */                       Size2D size = headlessInAppWebView.getSize();
/* 123 */                       result.success(size != null ? size.toMap() : null);
                                break;
                            }
                            break;
                        case "dispose":
/* 89 */                    HeadlessInAppWebView headlessInAppWebView2 = this.headlessWebView;
/* 91 */                    if (headlessInAppWebView2 == null) {
/* 104 */                       result.success(Boolean.FALSE);
                                break;
                            } else {
/* 93 */                        headlessInAppWebView2.dispose();
/* 98 */                        result.success(Boolean.TRUE);
                                break;
                            }
                            break;
                        case "setSize":
/* 56 */                    if (this.headlessWebView == null) {
/* 85 */                        result.success(Boolean.FALSE);
                                break;
                            } else {
/* 66 */                        Size2D size2DFromMap = Size2D.fromMap((Map) methodCall.argument("size"));
/* 70 */                        if (size2DFromMap != null) {
/* 74 */                            this.headlessWebView.setSize(size2DFromMap);
                                }
/* 79 */                        result.success(Boolean.TRUE);
                                break;
                            }
                            break;
                        default:
/* 50 */                    result.notImplemented();
                            break;
                    }
                }

                public void onWebViewCreated() {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 15 */            channel.invokeMethod("onWebViewCreated", new HashMap());
                }
            }
