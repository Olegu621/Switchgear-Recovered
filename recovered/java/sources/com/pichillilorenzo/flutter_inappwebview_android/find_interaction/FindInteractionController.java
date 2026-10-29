            package com.pichillilorenzo.flutter_inappwebview_android.find_interaction;

            import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
            import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
            import com.pichillilorenzo.flutter_inappwebview_android.types.FindSession;
            import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface;
            import io.flutter.plugin.common.MethodChannel;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class FindInteractionController implements Disposable {
                static final String LOG_TAG = "FindInteractionController";
                public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_find_interaction_";
                public FindSession activeFindSession;
                public FindInteractionChannelDelegate channelDelegate;
                public String searchText;
                public FindInteractionSettings settings;
                public InAppWebViewInterface webView;

                public FindInteractionController(InAppWebViewInterface inAppWebViewInterface, InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, Object obj, FindInteractionSettings findInteractionSettings) {
/* 4 */             this.webView = inAppWebViewInterface;
/* 6 */             this.settings = findInteractionSettings;
/* 34 */            this.channelDelegate = new FindInteractionChannelDelegate(this, new MethodChannel(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME_PREFIX + obj));
                }

                public void clearMatches() {
/* 1 */             InAppWebViewInterface inAppWebViewInterface = this.webView;
/* 3 */             if (inAppWebViewInterface != null) {
/* 5 */                 inAppWebViewInterface.clearMatches();
                    }
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
                public void dispose() {
/* 1 */             FindInteractionChannelDelegate findInteractionChannelDelegate = this.channelDelegate;
/* 4 */             if (findInteractionChannelDelegate != null) {
/* 6 */                 findInteractionChannelDelegate.dispose();
/* 9 */                 this.channelDelegate = null;
                    }
/* 11 */            this.webView = null;
/* 13 */            this.activeFindSession = null;
/* 15 */            this.searchText = null;
                }

                public void findAll(String str) {
/* 1 */             if (str == null) {
/* 3 */                 str = this.searchText;
                    } else {
/* 6 */                 this.searchText = str;
                    }
/* 8 */             InAppWebViewInterface inAppWebViewInterface = this.webView;
/* 10 */            if (inAppWebViewInterface == null || str == null) {
/* 17 */                return;
                    }
/* 14 */            inAppWebViewInterface.findAllAsync(str);
                }

                public void findNext(boolean z) {
/* 1 */             InAppWebViewInterface inAppWebViewInterface = this.webView;
/* 3 */             if (inAppWebViewInterface != null) {
/* 5 */                 inAppWebViewInterface.findNext(z);
                    }
                }

                public void prepare() {
                }
            }
