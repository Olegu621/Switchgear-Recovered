            package com.pichillilorenzo.flutter_inappwebview_android.webview;

            import android.content.Context;
            import android.view.View;
            import android.view.ViewGroup;
            import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
            import com.pichillilorenzo.flutter_inappwebview_android.headless_in_app_webview.HeadlessInAppWebView;
            import com.pichillilorenzo.flutter_inappwebview_android.headless_in_app_webview.HeadlessInAppWebViewManager;
            import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.FlutterWebView;
            import io.flutter.plugin.common.StandardMessageCodec;
            import io.flutter.plugin.platform.PlatformView;
            import io.flutter.plugin.platform.PlatformViewFactory;
            import java.util.HashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class FlutterWebViewFactory extends PlatformViewFactory {
                public static final String VIEW_TYPE_ID = "com.pichillilorenzo/flutter_inappwebview";
                private final InAppWebViewFlutterPlugin plugin;

                public FlutterWebViewFactory(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
/* 3 */             super(StandardMessageCodec.INSTANCE);
/* 6 */             this.plugin = inAppWebViewFlutterPlugin;
                }

                @Override // io.flutter.plugin.platform.PlatformViewFactory
                public PlatformView create(Context context, int i, Object obj) {
                    FlutterWebView flutterWebView;
                    View view;
                    ViewGroup viewGroup;
                    HeadlessInAppWebView headlessInAppWebView;
/* 1 */             HashMap<String, Object> map = (HashMap) obj;
/* 3 */             Object objValueOf = Integer.valueOf(i);
/* 13 */            String str = (String) map.get("keepAliveId");
/* 21 */            String str2 = (String) map.get("headlessWebViewId");
/* 25 */            HeadlessInAppWebViewManager headlessInAppWebViewManager = this.plugin.headlessInAppWebViewManager;
/* 27 */            if (str2 == null || headlessInAppWebViewManager == null || (headlessInAppWebView = headlessInAppWebViewManager.webViews.get(str2)) == null) {
/* 50 */                flutterWebView = null;
                    } else {
/* 41 */                flutterWebView = headlessInAppWebView.disposeAndGetFlutterWebView();
/* 45 */                if (flutterWebView != null) {
/* 47 */                    flutterWebView.keepAliveId = str;
                        }
                    }
/* 53 */            InAppWebViewManager inAppWebViewManager = this.plugin.inAppWebViewManager;
/* 55 */            if (str != null && flutterWebView == null && inAppWebViewManager != null && (flutterWebView = inAppWebViewManager.keepAliveWebViews.get(str)) != null && (view = flutterWebView.getView()) != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
/* 85 */                viewGroup.removeView(view);
                    }
/* 92 */            boolean z = flutterWebView == null;
/* 93 */            if (flutterWebView == null) {
/* 95 */                if (str != null) {
/* 97 */                    objValueOf = str;
                        }
/* 102 */               flutterWebView = new FlutterWebView(this.plugin, context, objValueOf, map);
                    }
/* 105 */           if (str != null && inAppWebViewManager != null) {
/* 111 */               inAppWebViewManager.keepAliveWebViews.put(str, flutterWebView);
                    }
/* 114 */           if (z) {
/* 116 */               flutterWebView.makeInitialLoad(map);
                    }
/* 119 */           return flutterWebView;
                }
            }
