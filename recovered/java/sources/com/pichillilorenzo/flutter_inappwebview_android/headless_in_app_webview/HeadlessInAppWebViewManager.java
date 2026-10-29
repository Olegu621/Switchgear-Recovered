            package com.pichillilorenzo.flutter_inappwebview_android.headless_in_app_webview;

            import android.content.Context;
            import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
            import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
            import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.FlutterWebView;
            import io.flutter.plugin.common.MethodCall;
            import io.flutter.plugin.common.MethodChannel;
            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class HeadlessInAppWebViewManager extends ChannelDelegateImpl {
                protected static final String LOG_TAG = "HeadlessInAppWebViewManager";
                public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_headless_inappwebview";
                public InAppWebViewFlutterPlugin plugin;
                public final Map<String, HeadlessInAppWebView> webViews;

                public HeadlessInAppWebViewManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
/* 10 */            super(new MethodChannel(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
/* 18 */            this.webViews = new HashMap();
/* 20 */            this.plugin = inAppWebViewFlutterPlugin;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
                public void dispose() {
/* 1 */             super.dispose();
/* 18 */            for (HeadlessInAppWebView headlessInAppWebView : this.webViews.values()) {
/* 26 */                if (headlessInAppWebView != null) {
/* 28 */                    headlessInAppWebView.dispose();
                        }
                    }
/* 34 */            this.webViews.clear();
/* 38 */            this.plugin = null;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
                public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
/* 7 */             String str = (String) methodCall.argument("id");
/* 9 */             String str2 = methodCall.method;
/* 11 */            str2.getClass();
/* 20 */            if (!str2.equals("run")) {
/* 22 */                result.notImplemented();
                    } else {
/* 34 */                run(str, (HashMap) methodCall.argument("params"));
/* 39 */                result.success(Boolean.TRUE);
                    }
                }

                public void run(String str, HashMap<String, Object> map) {
/* 1 */             InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
/* 3 */             if (inAppWebViewFlutterPlugin != null) {
/* 5 */                 Context context = inAppWebViewFlutterPlugin.activity;
/* 7 */                 if (context == null && inAppWebViewFlutterPlugin.applicationContext == null) {
/* 44 */                    return;
                        }
/* 14 */                if (context == null) {
/* 16 */                    context = inAppWebViewFlutterPlugin.applicationContext;
                        }
/* 20 */                FlutterWebView flutterWebView = new FlutterWebView(inAppWebViewFlutterPlugin, context, str, map);
/* 27 */                HeadlessInAppWebView headlessInAppWebView = new HeadlessInAppWebView(this.plugin, str, flutterWebView);
/* 32 */                this.webViews.put(str, headlessInAppWebView);
/* 35 */                headlessInAppWebView.prepare(map);
/* 38 */                headlessInAppWebView.onWebViewCreated();
/* 41 */                flutterWebView.makeInitialLoad(map);
                    }
                }
            }
