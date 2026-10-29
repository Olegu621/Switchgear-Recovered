            package com.pichillilorenzo.flutter_inappwebview_android.headless_in_app_webview;

            import android.R;
            import android.app.Activity;
            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.FrameLayout;
            import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
            import com.pichillilorenzo.flutter_inappwebview_android.Util;
            import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
            import com.pichillilorenzo.flutter_inappwebview_android.types.Size2D;
            import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.FlutterWebView;
            import io.flutter.plugin.common.MethodChannel;
            import java.util.Map;
            import p000.AbstractC0886en;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class HeadlessInAppWebView implements Disposable {
                protected static final String LOG_TAG = "HeadlessInAppWebView";
                public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_headless_inappwebview_";
                public HeadlessWebViewChannelDelegate channelDelegate;
                public FlutterWebView flutterWebView;

                /* JADX INFO: renamed from: id */
                public final String f5323id;
                public InAppWebViewFlutterPlugin plugin;

                public HeadlessInAppWebView(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, String str, FlutterWebView flutterWebView) {
/* 4 */             this.f5323id = str;
/* 6 */             this.plugin = inAppWebViewFlutterPlugin;
/* 8 */             this.flutterWebView = flutterWebView;
/* 28 */            this.channelDelegate = new HeadlessWebViewChannelDelegate(this, new MethodChannel(inAppWebViewFlutterPlugin.messenger, AbstractC0886en.m3507k(METHOD_CHANNEL_NAME_PREFIX, str)));
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
                public void dispose() {
                    ViewGroup viewGroup;
                    ViewGroup viewGroup2;
                    FlutterWebView flutterWebView;
/* 1 */             HeadlessWebViewChannelDelegate headlessWebViewChannelDelegate = this.channelDelegate;
/* 4 */             if (headlessWebViewChannelDelegate != null) {
/* 6 */                 headlessWebViewChannelDelegate.dispose();
/* 9 */                 this.channelDelegate = null;
                    }
/* 11 */            InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
/* 13 */            if (inAppWebViewFlutterPlugin != null) {
/* 15 */                HeadlessInAppWebViewManager headlessInAppWebViewManager = inAppWebViewFlutterPlugin.headlessInAppWebViewManager;
/* 17 */                if (headlessInAppWebViewManager != null && headlessInAppWebViewManager.webViews.containsKey(this.f5323id)) {
/* 33 */                    headlessInAppWebViewManager.webViews.put(this.f5323id, null);
                        }
/* 38 */                Activity activity = this.plugin.activity;
/* 40 */                if (activity != null && (viewGroup = (ViewGroup) activity.findViewById(R.id.content)) != null && (viewGroup2 = (ViewGroup) viewGroup.getChildAt(0)) != null && (flutterWebView = this.flutterWebView) != null && flutterWebView.getView() != null) {
/* 78 */                    viewGroup2.removeView(this.flutterWebView.getView());
                        }
                    }
/* 81 */            FlutterWebView flutterWebView2 = this.flutterWebView;
/* 83 */            if (flutterWebView2 != null) {
/* 85 */                flutterWebView2.dispose();
                    }
/* 88 */            this.flutterWebView = null;
/* 90 */            this.plugin = null;
                }

                public FlutterWebView disposeAndGetFlutterWebView() {
/* 1 */             FlutterWebView flutterWebView = this.flutterWebView;
/* 3 */             if (flutterWebView != null) {
/* 5 */                 View view = flutterWebView.getView();
/* 9 */                 if (view != null) {
/* 17 */                    view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
/* 21 */                    view.setVisibility(0);
/* 28 */                    ViewGroup viewGroup = (ViewGroup) view.getParent();
/* 30 */                    if (viewGroup != null) {
/* 32 */                        viewGroup.removeView(view);
                            }
                        }
/* 36 */                this.flutterWebView = null;
/* 38 */                dispose();
                    }
/* 41 */            return flutterWebView;
                }

                public Size2D getSize() {
                    View view;
/* 1 */             FlutterWebView flutterWebView = this.flutterWebView;
/* 3 */             if (flutterWebView == null || flutterWebView.webView == null || (view = flutterWebView.getView()) == null) {
/* 71 */                return null;
                    }
/* 19 */            float pixelDensity = Util.getPixelDensity(view.getContext());
/* 27 */            Size2D fullscreenSize = Util.getFullscreenSize(view.getContext());
/* 31 */            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
/* 37 */            double width = fullscreenSize.getWidth();
/* 41 */            int i = layoutParams.width;
                    double d = i;
/* 46 */            if (width != d) {
/* 50 */                d = i / pixelDensity;
                    }
/* 52 */            double height = fullscreenSize.getHeight();
/* 56 */            int i2 = layoutParams.height;
                    double d2 = i2;
/* 61 */            if (height != d2) {
/* 65 */                d2 = i2 / pixelDensity;
                    }
/* 67 */            return new Size2D(d, d2);
                }

                public void onWebViewCreated() {
/* 1 */             HeadlessWebViewChannelDelegate headlessWebViewChannelDelegate = this.channelDelegate;
/* 3 */             if (headlessWebViewChannelDelegate != null) {
/* 5 */                 headlessWebViewChannelDelegate.onWebViewCreated();
                    }
                }

                public void prepare(Map<String, Object> map) {
                    Activity activity;
                    ViewGroup viewGroup;
                    ViewGroup viewGroup2;
                    FlutterWebView flutterWebView;
                    View view;
                    View view2;
/* 1 */             FlutterWebView flutterWebView2 = this.flutterWebView;
/* 3 */             if (flutterWebView2 != null && (view2 = flutterWebView2.getView()) != null) {
/* 19 */                Size2D size2DFromMap = Size2D.fromMap((Map) map.get("initialSize"));
/* 23 */                if (size2DFromMap == null) {
/* 29 */                    size2DFromMap = new Size2D(-1.0d, -1.0d);
                        }
/* 32 */                setSize(size2DFromMap);
/* 36 */                view2.setVisibility(4);
                    }
/* 39 */            InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
/* 41 */            if (inAppWebViewFlutterPlugin == null || (activity = inAppWebViewFlutterPlugin.activity) == null || (viewGroup = (ViewGroup) activity.findViewById(R.id.content)) == null || (viewGroup2 = (ViewGroup) viewGroup.getChildAt(0)) == null || (flutterWebView = this.flutterWebView) == null || (view = flutterWebView.getView()) == null) {
/* 80 */                return;
                    }
/* 77 */            viewGroup2.addView(view, 0);
                }

                public void setSize(Size2D size2D) {
                    View view;
/* 1 */             FlutterWebView flutterWebView = this.flutterWebView;
/* 3 */             if (flutterWebView == null || flutterWebView.webView == null || (view = flutterWebView.getView()) == null) {
/* 81 */                return;
                    }
/* 19 */            float pixelDensity = Util.getPixelDensity(view.getContext());
/* 27 */            Size2D fullscreenSize = Util.getFullscreenSize(view.getContext());
/* 78 */            view.setLayoutParams(new FrameLayout.LayoutParams((int) (size2D.getWidth() == -1.0d ? fullscreenSize.getWidth() : size2D.getWidth() * ((double) pixelDensity)), (int) (size2D.getWidth() == -1.0d ? fullscreenSize.getHeight() : ((double) pixelDensity) * size2D.getHeight())));
                }
            }
