            package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

            import android.content.Context;
            import android.hardware.display.DisplayManager;
            import android.os.Message;
            import android.view.View;
            import android.webkit.WebView;
            import android.widget.FrameLayout;
            import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
            import com.pichillilorenzo.flutter_inappwebview_android.find_interaction.FindInteractionController;
            import com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshLayout;
            import com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshSettings;
            import com.pichillilorenzo.flutter_inappwebview_android.types.URLRequest;
            import com.pichillilorenzo.flutter_inappwebview_android.types.UserScript;
            import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager;
            import com.pichillilorenzo.flutter_inappwebview_android.webview.PlatformWebView;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import p000.xe2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class FlutterWebView implements PlatformWebView {
                static final String LOG_TAG = "IAWFlutterWebView";
                public String keepAliveId;
                public PullToRefreshLayout pullToRefreshLayout;
                public InAppWebView webView;

                public FlutterWebView(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, Context context, Object obj, HashMap<String, Object> map) {
/* 8 */             DisplayListenerProxy displayListenerProxy = new DisplayListenerProxy();
/* 18 */            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
/* 20 */            displayListenerProxy.onPreWebViewInitialization(displayManager);
/* 31 */            this.keepAliveId = (String) map.get("keepAliveId");
/* 39 */            Map<String, Object> map2 = (Map) map.get("initialSettings");
/* 48 */            Map map3 = (Map) map.get("contextMenu");
/* 57 */            Integer num = (Integer) map.get("windowId");
/* 65 */            List list = (List) map.get("initialUserScripts");
/* 74 */            Map<String, Object> map4 = (Map) map.get("pullToRefreshSettings");
/* 78 */            InAppWebViewSettings inAppWebViewSettings = new InAppWebViewSettings();
/* 81 */            inAppWebViewSettings.parse2(map2);
/* 86 */            ArrayList arrayList = new ArrayList();
/* 89 */            if (list != null) {
/* 91 */                Iterator it = list.iterator();
/* 99 */                while (it.hasNext()) {
/* 111 */                   arrayList.add(UserScript.fromMap((Map) it.next()));
                        }
                    }
/* 142 */           this.webView = new InAppWebView(context, inAppWebViewFlutterPlugin, obj, num, inAppWebViewSettings, map3, inAppWebViewSettings.useHybridComposition.booleanValue() ? null : inAppWebViewFlutterPlugin.flutterView, arrayList);
/* 144 */           displayListenerProxy.onPostWebViewInitialization(displayManager);
/* 155 */           this.webView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
/* 160 */           PullToRefreshSettings pullToRefreshSettings = new PullToRefreshSettings();
/* 163 */           pullToRefreshSettings.parse2(map4);
/* 168 */           PullToRefreshLayout pullToRefreshLayout = new PullToRefreshLayout(context, inAppWebViewFlutterPlugin, obj, pullToRefreshSettings);
/* 171 */           this.pullToRefreshLayout = pullToRefreshLayout;
/* 175 */           pullToRefreshLayout.addView(this.webView);
/* 180 */           this.pullToRefreshLayout.prepare();
/* 187 */           FindInteractionController findInteractionController = new FindInteractionController(this.webView, inAppWebViewFlutterPlugin, obj, null);
/* 192 */           this.webView.findInteractionController = findInteractionController;
/* 194 */           findInteractionController.prepare();
/* 199 */           this.webView.prepare();
                }

                @Override // io.flutter.plugin.platform.PlatformView
                public void dispose() {
                    InAppWebView inAppWebView;
/* 3 */             if (this.keepAliveId != null || (inAppWebView = this.webView) == null) {
/* 24 */                return;
                    }
/* 9 */             inAppWebView.dispose();
/* 13 */            this.webView = null;
/* 15 */            PullToRefreshLayout pullToRefreshLayout = this.pullToRefreshLayout;
/* 17 */            if (pullToRefreshLayout != null) {
/* 19 */                pullToRefreshLayout.dispose();
/* 22 */                this.pullToRefreshLayout = null;
                    }
                }

                @Override // io.flutter.plugin.platform.PlatformView
                public View getView() {
/* 1 */             PullToRefreshLayout pullToRefreshLayout = this.pullToRefreshLayout;
                    return pullToRefreshLayout != null ? pullToRefreshLayout : this.webView;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.PlatformWebView
                public void makeInitialLoad(HashMap<String, Object> map) {
                    URLRequest uRLRequestFromMap;
                    InAppWebViewManager inAppWebViewManager;
                    Message message;
/* 3 */             if (this.webView == null) {
/* 166 */               return;
                    }
/* 13 */            Integer num = (Integer) map.get("windowId");
/* 21 */            Map map2 = (Map) map.get("initialUrlRequest");
/* 29 */            String str = (String) map.get("initialFile");
/* 37 */            Map map3 = (Map) map.get("initialData");
/* 39 */            if (num != null) {
/* 43 */                InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.webView.plugin;
/* 45 */                if (inAppWebViewFlutterPlugin == null || (inAppWebViewManager = inAppWebViewFlutterPlugin.inAppWebViewManager) == null || (message = inAppWebViewManager.windowWebViewMessages.get(num)) == null) {
/* 166 */                   return;
                        }
/* 67 */                ((WebView.WebViewTransport) message.obj).setWebView(this.webView);
/* 70 */                message.sendToTarget();
/* 79 */                if (xe2.m9786x("DOCUMENT_START_SCRIPT")) {
/* 88 */                    this.webView.post(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.FlutterWebView.1
                                @Override // java.lang.Runnable
                                public void run() {
/* 3 */                             InAppWebView inAppWebView = FlutterWebView.this.webView;
/* 5 */                             if (inAppWebView != null) {
/* 7 */                                 inAppWebView.prepareAndAddUserScripts();
                                    }
                                }
                            });
/* 91 */                    return;
                        }
/* 166 */               return;
                    }
/* 92 */            if (str != null) {
                        try {
/* 96 */                    this.webView.loadFile(str);
                        } catch (IOException unused) {
                        }
                    } else {
/* 100 */               if (map3 != null) {
/* 149 */                   this.webView.loadDataWithBaseURL((String) map3.get("baseUrl"), (String) map3.get(SharedDataContentProvider.BASE_PATH), (String) map3.get("mimeType"), (String) map3.get("encoding"), (String) map3.get("historyUrl"));
/* 152 */                   return;
                        }
/* 153 */               if (map2 == null || (uRLRequestFromMap = URLRequest.fromMap(map2)) == null) {
/* 166 */                   return;
                        }
/* 163 */               this.webView.loadUrl(uRLRequestFromMap);
                    }
                }

                @Override // io.flutter.plugin.platform.PlatformView
                public void onFlutterViewAttached(View view) {
/* 1 */             InAppWebView inAppWebView = this.webView;
/* 3 */             if (inAppWebView == null || inAppWebView.customSettings.useHybridComposition.booleanValue()) {
/* 20 */                return;
                    }
/* 17 */            this.webView.setContainerView(view);
                }

                @Override // io.flutter.plugin.platform.PlatformView
                public void onFlutterViewDetached() {
/* 1 */             InAppWebView inAppWebView = this.webView;
/* 3 */             if (inAppWebView == null || inAppWebView.customSettings.useHybridComposition.booleanValue()) {
/* 21 */                return;
                    }
/* 18 */            this.webView.setContainerView(null);
                }

                @Override // io.flutter.plugin.platform.PlatformView
                public void onInputConnectionLocked() {
/* 1 */             InAppWebView inAppWebView = this.webView;
/* 3 */             if (inAppWebView == null || inAppWebView.inAppBrowserDelegate != null || inAppWebView.customSettings.useHybridComposition.booleanValue()) {
/* 24 */                return;
                    }
/* 21 */            this.webView.lockInputConnection();
                }

                @Override // io.flutter.plugin.platform.PlatformView
                public void onInputConnectionUnlocked() {
/* 1 */             InAppWebView inAppWebView = this.webView;
/* 3 */             if (inAppWebView == null || inAppWebView.inAppBrowserDelegate != null || inAppWebView.customSettings.useHybridComposition.booleanValue()) {
/* 24 */                return;
                    }
/* 21 */            this.webView.unlockInputConnection();
                }
            }
