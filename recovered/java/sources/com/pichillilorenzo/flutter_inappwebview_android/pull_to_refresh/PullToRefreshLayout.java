            package com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh;

            import android.content.Context;
            import android.graphics.Color;
            import android.util.AttributeSet;
            import android.view.View;
            import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
            import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
            import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
            import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
            import io.flutter.plugin.common.MethodChannel;
            import p000.wj2;
            import p000.xj2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 39 */    public class PullToRefreshLayout extends SwipeRefreshLayout implements Disposable {
                static final String LOG_TAG = "PullToRefreshLayout";
                public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_pull_to_refresh_";
                public PullToRefreshChannelDelegate channelDelegate;
                public PullToRefreshSettings settings;

                public PullToRefreshLayout(Context context, InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, Object obj, PullToRefreshSettings pullToRefreshSettings) {
/* 2 */             super(context, null);
/* 7 */             new PullToRefreshSettings();
/* 10 */            this.settings = pullToRefreshSettings;
/* 38 */            this.channelDelegate = new PullToRefreshChannelDelegate(this, new MethodChannel(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME_PREFIX + obj));
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
                public void dispose() {
/* 1 */             PullToRefreshChannelDelegate pullToRefreshChannelDelegate = this.channelDelegate;
/* 3 */             if (pullToRefreshChannelDelegate != null) {
/* 5 */                 pullToRefreshChannelDelegate.dispose();
/* 9 */                 this.channelDelegate = null;
                    }
/* 11 */            removeAllViews();
                }

                public void prepare() {
/* 9 */             setEnabled(this.settings.enabled.booleanValue());
/* 17 */            setOnChildScrollUpCallback(new wj2() { // from class: com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshLayout.1
                        @Override // p000.wj2
                        public boolean canChildScrollUp(SwipeRefreshLayout swipeRefreshLayout, View view) {
/* 4 */                     if (!(view instanceof InAppWebView)) {
/* 3 */                         return true;
                            }
/* 6 */                     InAppWebView inAppWebView = (InAppWebView) view;
                            return (inAppWebView.canScrollVertically() && inAppWebView.getScrollY() > 0) || (!inAppWebView.canScrollVertically() && inAppWebView.getScrollY() == 0);
                        }
                    });
/* 25 */            setOnRefreshListener(new xj2() { // from class: com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshLayout.2
                        @Override // p000.xj2
                        public void onRefresh() {
/* 3 */                     PullToRefreshChannelDelegate pullToRefreshChannelDelegate = PullToRefreshLayout.this.channelDelegate;
/* 5 */                     if (pullToRefreshChannelDelegate == null) {
/* 10 */                        this.setRefreshing(false);
                            } else {
/* 14 */                        pullToRefreshChannelDelegate.onRefresh();
                            }
                        }
                    });
/* 30 */            String str = this.settings.color;
/* 32 */            if (str != null) {
/* 42 */                setColorSchemeColors(Color.parseColor(str));
                    }
/* 47 */            String str2 = this.settings.backgroundColor;
/* 49 */            if (str2 != null) {
/* 55 */                setProgressBackgroundColorSchemeColor(Color.parseColor(str2));
                    }
/* 60 */            Integer num = this.settings.distanceToTriggerSync;
/* 62 */            if (num != null) {
/* 68 */                setDistanceToTriggerSync(num.intValue());
                    }
/* 73 */            Integer num2 = this.settings.slingshotDistance;
/* 75 */            if (num2 != null) {
/* 81 */                setSlingshotDistance(num2.intValue());
                    }
/* 86 */            Integer num3 = this.settings.size;
/* 88 */            if (num3 != null) {
/* 94 */                setSize(num3.intValue());
                    }
                }

/* 40 */        public PullToRefreshLayout(Context context) {
/* 41 */            super(context, null);
/* 42 */            this.settings = new PullToRefreshSettings();
                }

/* 42 */        public PullToRefreshLayout(Context context, AttributeSet attributeSet) {
/* 43 */            super(context, attributeSet);
/* 44 */            this.settings = new PullToRefreshSettings();
                }
            }
