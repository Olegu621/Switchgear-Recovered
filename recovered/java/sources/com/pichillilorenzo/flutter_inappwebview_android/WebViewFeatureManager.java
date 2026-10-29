            package com.pichillilorenzo.flutter_inappwebview_android;

            import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
            import io.flutter.plugin.common.MethodCall;
            import io.flutter.plugin.common.MethodChannel;
            import p000.xe2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class WebViewFeatureManager extends ChannelDelegateImpl {
                protected static final String LOG_TAG = "WebViewFeatureManager";
                public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_webviewfeature";
                public InAppWebViewFlutterPlugin plugin;

                public WebViewFeatureManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
/* 10 */            super(new MethodChannel(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
/* 13 */            this.plugin = inAppWebViewFlutterPlugin;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
                public void dispose() {
/* 1 */             super.dispose();
/* 5 */             this.plugin = null;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
                public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
/* 1 */             String str = methodCall.method;
/* 3 */             str.getClass();
/* 12 */            if (!str.equals("isStartupFeatureSupported")) {
/* 20 */                if (str.equals("isFeatureSupported")) {
/* 42 */                    result.success(Boolean.valueOf(xe2.m9786x((String) methodCall.argument("feature"))));
/* 45 */                    return;
                        } else {
/* 22 */                    result.notImplemented();
/* 25 */                    return;
                        }
                    }
/* 46 */            InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
/* 48 */            if (inAppWebViewFlutterPlugin == null || inAppWebViewFlutterPlugin.activity == null) {
/* 77 */                return;
                    }
/* 74 */            result.success(Boolean.valueOf(xe2.m9788z(this.plugin.activity, (String) methodCall.argument("startupFeature"))));
                }
            }
