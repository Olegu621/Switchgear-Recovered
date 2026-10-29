            package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

            import android.animation.ObjectAnimator;
            import android.animation.PropertyValuesHolder;
            import android.app.Activity;
            import android.content.Context;
            import android.content.pm.PackageInfo;
            import android.graphics.Bitmap;
            import android.graphics.Canvas;
            import android.graphics.Color;
            import android.graphics.Point;
            import android.graphics.drawable.ColorDrawable;
            import android.net.Uri;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.Handler;
            import android.os.Looper;
            import android.os.Message;
            import android.print.PrintAttributes;
            import android.print.PrintJob;
            import android.print.PrintManager;
            import android.text.TextUtils;
            import android.util.AttributeSet;
            import android.view.ActionMode;
            import android.view.ContextMenu;
            import android.view.GestureDetector;
            import android.view.LayoutInflater;
            import android.view.Menu;
            import android.view.MenuItem;
            import android.view.MotionEvent;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.ViewParent;
            import android.view.ViewTreeObserver;
            import android.view.inputmethod.EditorInfo;
            import android.view.inputmethod.InputConnection;
            import android.view.inputmethod.InputMethodManager;
            import android.webkit.CookieManager;
            import android.webkit.DownloadListener;
            import android.webkit.URLUtil;
            import android.webkit.ValueCallback;
            import android.webkit.WebBackForwardList;
            import android.webkit.WebChromeClient;
            import android.webkit.WebHistoryItem;
            import android.webkit.WebSettings;
            import android.webkit.WebStorage;
            import android.webkit.WebView;
            import android.webkit.WebViewClient;
            import android.widget.AbsoluteLayout;
            import android.widget.HorizontalScrollView;
            import android.widget.LinearLayout;
            import android.widget.TextView;
            import com.pichillilorenzo.flutter_inappwebview_android.C0608R;
            import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
            import com.pichillilorenzo.flutter_inappwebview_android.Util;
            import com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlocker;
            import com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerAction;
            import com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerHandler;
            import com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerTrigger;
            import com.pichillilorenzo.flutter_inappwebview_android.find_interaction.FindInteractionChannelDelegate;
            import com.pichillilorenzo.flutter_inappwebview_android.find_interaction.FindInteractionController;
            import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserDelegate;
            import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.InterceptAjaxRequestJS;
            import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.InterceptFetchRequestJS;
            import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.JavaScriptBridgeJS;
            import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.OnLoadResourceJS;
            import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.OnWindowBlurEventJS;
            import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.OnWindowFocusEventJS;
            import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.PluginScriptsUtil;
            import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.PrintJS;
            import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.PromisePolyfillJS;
            import com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobController;
            import com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobSettings;
            import com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshLayout;
            import com.pichillilorenzo.flutter_inappwebview_android.types.ContentWorld;
            import com.pichillilorenzo.flutter_inappwebview_android.types.DownloadStartRequest;
            import com.pichillilorenzo.flutter_inappwebview_android.types.HitTestResult;
            import com.pichillilorenzo.flutter_inappwebview_android.types.MediaSizeExt;
            import com.pichillilorenzo.flutter_inappwebview_android.types.PluginScript;
            import com.pichillilorenzo.flutter_inappwebview_android.types.PreferredContentModeOptionType;
            import com.pichillilorenzo.flutter_inappwebview_android.types.ResolutionExt;
            import com.pichillilorenzo.flutter_inappwebview_android.types.URLRequest;
            import com.pichillilorenzo.flutter_inappwebview_android.types.UserContentController;
            import com.pichillilorenzo.flutter_inappwebview_android.types.UserScript;
            import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessage;
            import com.pichillilorenzo.flutter_inappwebview_android.types.WebViewAssetLoaderExt;
            import com.pichillilorenzo.flutter_inappwebview_android.webview.ContextMenuSettings;
            import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface;
            import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager;
            import com.pichillilorenzo.flutter_inappwebview_android.webview.JavaScriptBridgeInterface;
            import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate;
            import com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageChannel;
            import com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageListener;
            import io.flutter.plugin.common.MethodChannel;
            import java.io.ByteArrayOutputStream;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import java.util.UUID;
            import java.util.regex.Pattern;
            import okhttp3.HttpUrl;
            import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
            import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
            import org.json.JSONArray;
            import org.json.JSONObject;
            import p000.AbstractC0886en;
            import p000.AbstractC1993o9;
            import p000.AbstractC2062p9;
            import p000.C2297vk;
            import p000.b73;
            import p000.fm0;
            import p000.fs0;
            import p000.p63;
            import p000.pm2;
            import p000.ts0;
            import p000.x63;
            import p000.xe2;
            import p000.y63;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 9 */     public final class InAppWebView extends InputAwareWebView implements InAppWebViewInterface {
                protected static final String LOG_TAG = "InAppWebView";
                public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_";
                static Handler mHandler = new Handler();
                public Map<String, ValueCallback<String>> callAsyncJavaScriptCallbacks;
                public WebViewChannelDelegate channelDelegate;
                public Runnable checkContextMenuShouldBeClosedTask;
                public Runnable checkScrollStoppedTask;
                public ContentBlockerHandler contentBlockerHandler;
                public Map<String, Object> contextMenu;
                private Point contextMenuPoint;
                public InAppWebViewSettings customSettings;
                public Map<String, ValueCallback<String>> evaluateJavaScriptContentWorldCallbacks;
                public FindInteractionController findInteractionController;
                public LinearLayout floatingContextMenu;
                public GestureDetector gestureDetector;

                /* JADX INFO: renamed from: id */
                public Object f5338id;
                public InAppBrowserDelegate inAppBrowserDelegate;
                public InAppWebViewChromeClient inAppWebViewChromeClient;
                public InAppWebViewClient inAppWebViewClient;
                public InAppWebViewClientCompat inAppWebViewClientCompat;
                public InAppWebViewRenderProcessClient inAppWebViewRenderProcessClient;
                private boolean inFullscreen;
                public int initialPositionScrollStoppedTask;
                private List<UserScript> initialUserOnlyScripts;
                private PluginScript interceptOnlyAsyncAjaxRequestsPluginScript;
                public boolean isLoading;
                public JavaScriptBridgeInterface javaScriptBridgeInterface;
                private Point lastTouch;
                public Handler mainLooperHandler;
                public int newCheckContextMenuShouldBeClosedTaskTask;
                public int newCheckScrollStoppedTask;
                public InAppWebViewFlutterPlugin plugin;
                public Pattern regexToCancelSubFramesLoadingCompiled;
                public UserContentController userContentController;
                public Map<String, WebMessageChannel> webMessageChannels;
                public List<WebMessageListener> webMessageListeners;
                public WebViewAssetLoaderExt webViewAssetLoaderExt;
                public Integer windowId;
                public float zoomScale;

                /* JADX INFO: renamed from: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView$21 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static /* synthetic */ class C066421 {

                    /* JADX INFO: renamed from: $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$types$PreferredContentModeOptionType */
                    static final /* synthetic */ int[] f5339x8be7bf1;

                    static {
/* 6 */                 int[] iArr = new int[PreferredContentModeOptionType.values().length];
/* 8 */                 f5339x8be7bf1 = iArr;
                        try {
/* 17 */                    iArr[PreferredContentModeOptionType.DESKTOP.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
/* 28 */                    f5339x8be7bf1[PreferredContentModeOptionType.MOBILE.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
/* 39 */                    f5339x8be7bf1[PreferredContentModeOptionType.RECOMMENDED.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public class DownloadStartListener implements DownloadListener {
                    public DownloadStartListener() {
                    }

                    @Override // android.webkit.DownloadListener
                    public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
/* 13 */                DownloadStartRequest downloadStartRequest = new DownloadStartRequest(str, str2, str3, str4, j, URLUtil.guessFileName(str, str3, str4), null);
/* 18 */                WebViewChannelDelegate webViewChannelDelegate = InAppWebView.this.channelDelegate;
/* 20 */                if (webViewChannelDelegate != null) {
/* 22 */                    webViewChannelDelegate.onDownloadStartRequest(downloadStartRequest);
                        }
                    }
                }

                public InAppWebView(Context context, InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, Object obj, Integer num, InAppWebViewSettings inAppWebViewSettings, Map<String, Object> map, View view, List<UserScript> list) {
/* 3 */             super(context, view, inAppWebViewSettings.useHybridComposition);
/* 11 */            this.customSettings = new InAppWebViewSettings();
/* 14 */            this.isLoading = false;
/* 16 */            this.inFullscreen = false;
/* 20 */            this.zoomScale = 1.0f;
/* 27 */            this.contentBlockerHandler = new ContentBlockerHandler();
/* 30 */            this.gestureDetector = null;
/* 32 */            this.floatingContextMenu = null;
/* 34 */            this.contextMenu = null;
/* 45 */            this.mainLooperHandler = new Handler(getWebViewLooper());
/* 49 */            this.newCheckScrollStoppedTask = 100;
/* 51 */            this.newCheckContextMenuShouldBeClosedTaskTask = 100;
/* 58 */            this.userContentController = new UserContentController(this);
/* 65 */            this.callAsyncJavaScriptCallbacks = new HashMap();
/* 72 */            this.evaluateJavaScriptContentWorldCallbacks = new HashMap();
/* 79 */            this.webMessageChannels = new HashMap();
/* 86 */            this.webMessageListeners = new ArrayList();
/* 93 */            this.initialUserOnlyScripts = new ArrayList();
/* 100 */           this.contextMenuPoint = new Point(0, 0);
/* 107 */           this.lastTouch = new Point(0, 0);
/* 109 */           this.plugin = inAppWebViewFlutterPlugin;
/* 111 */           this.f5338id = obj;
/* 139 */           this.channelDelegate = new WebViewChannelDelegate(this, new MethodChannel(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME_PREFIX + obj));
/* 141 */           this.windowId = num;
/* 143 */           this.customSettings = inAppWebViewSettings;
/* 145 */           this.contextMenu = map;
/* 147 */           this.initialUserOnlyScripts = list;
/* 149 */           Activity activity = inAppWebViewFlutterPlugin.activity;
/* 151 */           if (activity != null) {
/* 153 */               activity.registerForContextMenu(this);
                    }
                }

                @Deprecated
                private void clearCookies() {
/* 10 */            CookieManager.getInstance().removeAllCookies(new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.7
                        @Override // android.webkit.ValueCallback
/* 6 */                 public void onReceiveValue(Boolean bool) {
                        }
                    });
                }

                private void sendOnCreateContextMenuEvent() {
/* 5 */             HitTestResult hitTestResultFromWebViewHitTestResult = HitTestResult.fromWebViewHitTestResult(getHitTestResult());
/* 9 */             WebViewChannelDelegate webViewChannelDelegate = this.channelDelegate;
/* 11 */            if (webViewChannelDelegate != null) {
/* 13 */                webViewChannelDelegate.onCreateContextMenu(hitTestResultFromWebViewHitTestResult);
                    }
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
                public void addWebMessageListener(WebMessageListener webMessageListener) {
/* 7 */             if (xe2.m9786x("WEB_MESSAGE_LISTENER")) {
/* 9 */                 String str = webMessageListener.jsObjectName;
/* 11 */                Set<String> set = webMessageListener.allowedOriginRules;
/* 13 */                x63 x63Var = webMessageListener.listener;
/* 15 */                Uri uri = y63.f19511a;
/* 23 */                if (!b73.f2293I.mo97b()) {
/* 67 */                    throw b73.m1295a();
                        }
/* 25 */                fs0 fs0VarM10119d = y63.m10119d(this);
/* 36 */                String[] strArr = (String[]) set.toArray(new String[0]);
/* 40 */                WebViewProviderBoundaryInterface webViewProviderBoundaryInterface = (WebViewProviderBoundaryInterface) fs0VarM10119d.f8339b;
/* 44 */                ts0 ts0Var = new ts0();
/* 47 */                ts0Var.f17248a = x63Var;
/* 54 */                webViewProviderBoundaryInterface.addWebMessageListener(str, strArr, new C2297vk(ts0Var));
/* 59 */                this.webMessageListeners.add(webMessageListener);
                    }
                }

                public void adjustFloatingContextMenuPosition() {
/* 8 */             evaluateJavascript("(function(){  var selection = window.getSelection();  var rangeY = null;  if (selection != null && selection.rangeCount > 0) {    var range = selection.getRangeAt(0);    var clientRect = range.getClientRects();    if (clientRect.length > 0) {      rangeY = clientRect[0].y;    } else if (document.activeElement != null && document.activeElement.tagName.toLowerCase() !== 'iframe') {      var boundingClientRect = document.activeElement.getBoundingClientRect();      rangeY = boundingClientRect.y;    }  }  return rangeY;})();", new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.16
                        @Override // android.webkit.ValueCallback
                        public void onReceiveValue(String str) {
/* 5 */                     if (InAppWebView.this.floatingContextMenu != null) {
/* 7 */                         if (str == null || str.equalsIgnoreCase("null")) {
/* 74 */                            InAppWebView.this.floatingContextMenu.setVisibility(0);
/* 98 */                            InAppWebView.this.floatingContextMenu.animate().alpha(1.0f).setDuration(100L).setListener(null);
/* 101 */                           InAppWebView inAppWebView = InAppWebView.this;
/* 117 */                           inAppWebView.onFloatingActionGlobalLayout(inAppWebView.contextMenuPoint.x, InAppWebView.this.contextMenuPoint.y);
/* 120 */                           return;
                                }
/* 23 */                        int i = InAppWebView.this.contextMenuPoint.x;
/* 54 */                        int height = (int) ((((double) InAppWebView.this.floatingContextMenu.getHeight()) / 3.5d) + ((double) (Util.getPixelDensity(InAppWebView.this.getContext()) * Float.parseFloat(str))));
/* 61 */                        InAppWebView.this.contextMenuPoint.y = height;
/* 65 */                        InAppWebView.this.onFloatingActionGlobalLayout(i, height);
                            }
                        }
                    });
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
                public void callAsyncJavaScript(String str, Map<String, Object> map, ContentWorld contentWorld, ValueCallback<String> valueCallback) {
/* 5 */             String string = UUID.randomUUID().toString();
/* 9 */             if (valueCallback != null) {
/* 13 */                this.callAsyncJavaScriptCallbacks.put(string, valueCallback);
                    }
/* 21 */            Iterator<String> itKeys = new JSONObject(map).keys();
/* 27 */            ArrayList arrayList = new ArrayList();
/* 32 */            ArrayList arrayList2 = new ArrayList();
/* 39 */            while (itKeys.hasNext()) {
/* 41 */                String next = itKeys.next();
/* 47 */                arrayList.add(next);
/* 64 */                arrayList2.add("obj." + next);
                    }
/* 70 */            String strJoin = TextUtils.join(", ", arrayList);
/* 125 */           evaluateJavascript(this.userContentController.generateCodeForScriptEvaluation(PluginScriptsUtil.CALL_ASYNC_JAVA_SCRIPT_WRAPPER_JS_SOURCE.replace(PluginScriptsUtil.VAR_FUNCTION_ARGUMENT_NAMES, strJoin).replace(PluginScriptsUtil.VAR_FUNCTION_ARGUMENT_VALUES, TextUtils.join(", ", arrayList2)).replace(PluginScriptsUtil.VAR_FUNCTION_ARGUMENTS_OBJ, Util.JSONStringify(map)).replace(PluginScriptsUtil.VAR_FUNCTION_BODY, str).replace(PluginScriptsUtil.VAR_RESULT_UUID, string).replace(PluginScriptsUtil.VAR_RESULT_UUID, string), contentWorld), null);
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
                public boolean canScrollHorizontally() {
                    return computeHorizontalScrollRange() > computeHorizontalScrollExtent();
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
                public boolean canScrollVertically() {
                    return computeVerticalScrollRange() > computeVerticalScrollExtent();
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
                @Deprecated
                public void clearAllCache() {
/* 2 */             clearCache(true);
/* 5 */             clearCookies();
/* 8 */             clearFormData();
/* 15 */            WebStorage.getInstance().deleteAllData();
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
                public WebMessageChannel createCompatWebMessageChannel() {
/* 5 */             String string = UUID.randomUUID().toString();
/* 11 */            WebMessageChannel webMessageChannel = new WebMessageChannel(string, this);
/* 16 */            this.webMessageChannels.put(string, webMessageChannel);
/* 19 */            return webMessageChannel;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
                public WebMessageChannel createWebMessageChannel(ValueCallback<WebMessageChannel> valueCallback) {
/* 1 */             WebMessageChannel webMessageChannelCreateCompatWebMessageChannel = createCompatWebMessageChannel();
/* 5 */             valueCallback.onReceiveValue(webMessageChannelCreateCompatWebMessageChannel);
/* 8 */             return webMessageChannelCreateCompatWebMessageChannel;
                }

                /* JADX WARN: Code duplicated, block: B:26:0x0055 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:29:0x005d  */
                public WebViewClient createWebViewClient(InAppBrowserDelegate inAppBrowserDelegate) {
/* 5 */             PackageInfo packageInfoM10117b = y63.m10117b(getContext());
/* 9 */             if (packageInfoM10117b == null) {
/* 13 */                return new InAppWebViewClient(inAppBrowserDelegate);
                    }
/* 51 */            boolean z = "com.android.webview".equals(packageInfoM10117b.packageName) || "com.google.android.webview".equals(packageInfoM10117b.packageName) || "com.android.chrome".equals(packageInfoM10117b.packageName);
/* 52 */            if (z) {
/* 54 */                String str = packageInfoM10117b.versionName;
/* 56 */                if (str == null) {
/* 59 */                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        try {
/* 83 */                    if ((str.contains(".") ? Integer.parseInt(str.split("\\.")[0]) : 0) < 73) {
/* 86 */                        if (z) {
/* 96 */                            return new InAppWebViewClient(inAppBrowserDelegate);
                                }
                            }
                        } catch (NumberFormatException unused) {
                        }
                    } else if (z) {
/* 96 */                return new InAppWebViewClient(inAppBrowserDelegate);
                    }
/* 90 */            return new InAppWebViewClientCompat(inAppBrowserDelegate);
                }

                @Override // android.webkit.WebView
                public void destroy() {
/* 1 */             super.destroy();
                }

                @Override // android.view.ViewGroup, android.view.View
                public boolean dispatchTouchEvent(MotionEvent motionEvent) {
/* 1 */             return super.dispatchTouchEvent(motionEvent);
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InputAwareWebView
                public void dispose() {
                    InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin;
                    InAppWebViewManager inAppWebViewManager;
/* 1 */             WebViewChannelDelegate webViewChannelDelegate = this.channelDelegate;
/* 4 */             if (webViewChannelDelegate != null) {
/* 6 */                 webViewChannelDelegate.dispose();
/* 9 */                 this.channelDelegate = null;
                    }
/* 11 */            super.dispose();
/* 19 */            getSettings().setJavaScriptEnabled(false);
/* 24 */            removeJavascriptInterface(JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_NAME);
/* 31 */            if (Build.VERSION.SDK_INT >= 29 && xe2.m9786x("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE")) {
/* 41 */                y63.m10122g(this, null);
                    }
/* 49 */            setWebChromeClient(new WebChromeClient());
/* 57 */            setWebViewClient(new WebViewClient() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.20
                        @Override // android.webkit.WebViewClient
                        public void onPageFinished(WebView webView, String str) {
/* 3 */                     InAppWebView.this.destroy();
                        }
                    });
/* 60 */            this.interceptOnlyAsyncAjaxRequestsPluginScript = null;
/* 64 */            this.userContentController.dispose();
/* 67 */            FindInteractionController findInteractionController = this.findInteractionController;
/* 69 */            if (findInteractionController != null) {
/* 71 */                findInteractionController.dispose();
/* 74 */                this.findInteractionController = null;
                    }
/* 76 */            WebViewAssetLoaderExt webViewAssetLoaderExt = this.webViewAssetLoaderExt;
/* 78 */            if (webViewAssetLoaderExt != null) {
/* 80 */                webViewAssetLoaderExt.dispose();
/* 83 */                this.webViewAssetLoaderExt = null;
                    }
/* 85 */            Integer num = this.windowId;
/* 87 */            if (num != null && (inAppWebViewFlutterPlugin = this.plugin) != null && (inAppWebViewManager = inAppWebViewFlutterPlugin.inAppWebViewManager) != null) {
/* 99 */                inAppWebViewManager.windowWebViewMessages.remove(num);
                    }
/* 104 */           this.mainLooperHandler.removeCallbacksAndMessages(null);
/* 109 */           mHandler.removeCallbacksAndMessages(null);
/* 112 */           disposeWebMessageChannels();
/* 115 */           disposeWebMessageListeners();
/* 118 */           removeAllViews();
/* 121 */           Runnable runnable = this.checkContextMenuShouldBeClosedTask;
/* 123 */           if (runnable != null) {
/* 125 */               removeCallbacks(runnable);
                    }
/* 128 */           Runnable runnable2 = this.checkScrollStoppedTask;
/* 130 */           if (runnable2 != null) {
/* 132 */               removeCallbacks(runnable2);
                    }
/* 137 */           this.callAsyncJavaScriptCallbacks.clear();
/* 142 */           this.evaluateJavaScriptContentWorldCallbacks.clear();
/* 145 */           this.inAppBrowserDelegate = null;
/* 147 */           InAppWebViewRenderProcessClient inAppWebViewRenderProcessClient = this.inAppWebViewRenderProcessClient;
/* 149 */           if (inAppWebViewRenderProcessClient != null) {
/* 151 */               inAppWebViewRenderProcessClient.dispose();
/* 154 */               this.inAppWebViewRenderProcessClient = null;
                    }
/* 156 */           InAppWebViewChromeClient inAppWebViewChromeClient = this.inAppWebViewChromeClient;
/* 158 */           if (inAppWebViewChromeClient != null) {
/* 160 */               inAppWebViewChromeClient.dispose();
/* 163 */               this.inAppWebViewChromeClient = null;
                    }
/* 165 */           InAppWebViewClientCompat inAppWebViewClientCompat = this.inAppWebViewClientCompat;
/* 167 */           if (inAppWebViewClientCompat != null) {
/* 169 */               inAppWebViewClientCompat.dispose();
/* 172 */               this.inAppWebViewClientCompat = null;
                    }
/* 174 */           InAppWebViewClient inAppWebViewClient = this.inAppWebViewClient;
/* 176 */           if (inAppWebViewClient != null) {
/* 178 */               inAppWebViewClient.dispose();
/* 181 */               this.inAppWebViewClient = null;
                    }
/* 183 */           JavaScriptBridgeInterface javaScriptBridgeInterface = this.javaScriptBridgeInterface;
/* 185 */           if (javaScriptBridgeInterface != null) {
/* 187 */               javaScriptBridgeInterface.dispose();
/* 190 */               this.javaScriptBridgeInterface = null;
                    }
/* 192 */           this.plugin = null;
/* 196 */           loadUrl("about:blank");
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
                public void disposeWebMessageChannels() {
/* 7 */             Iterator<WebMessageChannel> it = this.webMessageChannels.values().iterator();
/* 15 */            while (it.hasNext()) {
/* 23 */                it.next().dispose();
                    }
/* 29 */            this.webMessageChannels.clear();
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
                public void disposeWebMessageListeners() {
/* 3 */             Iterator<WebMessageListener> it = this.webMessageListeners.iterator();
/* 11 */            while (it.hasNext()) {
/* 19 */                it.next().dispose();
                    }
/* 25 */            this.webMessageListeners.clear();
                }

                public void enablePluginScriptAtRuntime(final String str, final boolean z, final PluginScript pluginScript) {
/* 13 */            evaluateJavascript(AbstractC0886en.m3507k("window.", str), null, new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.9
                        @Override // android.webkit.ValueCallback
                        public void onReceiveValue(String str2) {
/* 2 */                     if (str2 == null || str2.equalsIgnoreCase("null")) {
/* 58 */                        if (z) {
/* 68 */                            InAppWebView.this.evaluateJavascript(pluginScript.getSource(), null, null);
/* 77 */                            InAppWebView.this.userContentController.addPluginScript(pluginScript);
/* 80 */                            return;
                                }
/* 80 */                        return;
                            }
/* 16 */                    StringBuilder sb = new StringBuilder("window.");
/* 21 */                    sb.append(str);
/* 26 */                    sb.append(" = ");
/* 39 */                    InAppWebView.this.evaluateJavascript(AbstractC0886en.m3511o(sb, z, ";"), null, null);
/* 44 */                    if (z) {
/* 80 */                        return;
                            }
/* 52 */                    InAppWebView.this.userContentController.removePluginScript(pluginScript);
                        }
                    });
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
                public void evaluateJavascript(String str, ContentWorld contentWorld, ValueCallback<String> valueCallback) {
/* 2 */             injectDeferredObject(str, contentWorld, null, valueCallback);
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
                public WebViewChannelDelegate getChannelDelegate() {
/* 1 */             return this.channelDelegate;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
                public void getContentHeight(ValueCallback<Integer> valueCallback) {
/* 9 */             valueCallback.onReceiveValue(Integer.valueOf(getContentHeight()));
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
                public void getContentWidth(final ValueCallback<Integer> valueCallback) {
/* 8 */             evaluateJavascript("document.documentElement.scrollWidth;", new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.19
                        @Override // android.webkit.ValueCallback
                        public void onReceiveValue(String str) {
/* 23 */                    valueCallback.onReceiveValue((str == null || str.equalsIgnoreCase("null")) ? null : Integer.valueOf(Integer.parseInt(str)));
                        }
                    });
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
                public Map<String, Object> getContextMenu() {
/* 1 */             return this.contextMenu;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
                public HashMap<String, Object> getCopyBackForwardList() {
/* 1 */             WebBackForwardList webBackForwardListCopyBackForwardList = copyBackForwardList();
/* 5 */             int size = webBackForwardListCopyBackForwardList.getSize();
/* 9 */             int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex();
/* 15 */            ArrayList arrayList = new ArrayList();
/* 19 */            for (int i = 0; i < size; i++) {
/* 21 */                WebHistoryItem itemAtIndex = webBackForwardListCopyBackForwardList.getItemAtIndex(i);
/* 27 */                HashMap map = new HashMap();
/* 36 */                map.put("originalUrl", itemAtIndex.getOriginalUrl());
/* 45 */                map.put("title", itemAtIndex.getTitle());
/* 54 */                map.put("url", itemAtIndex.getUrl());
/* 57 */                arrayList.add(map);
                    }
/* 65 */            HashMap<String, Object> map2 = new HashMap<>();
/* 70 */            map2.put("list", arrayList);
/* 79 */            map2.put("currentIndex", Integer.valueOf(currentIndex));
/* 82 */            return map2;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
                public Map<String, Object> getCustomSettings() {
/* 1 */             InAppWebViewSettings inAppWebViewSettings = this.customSettings;
/* 3 */             if (inAppWebViewSettings != null) {
/* 5 */                 return inAppWebViewSettings.getRealSettings((InAppWebViewInterface) this);
                    }
/* 10 */            return null;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
                public void getHitTestResult(ValueCallback<HitTestResult> valueCallback) {
/* 9 */             valueCallback.onReceiveValue(HitTestResult.fromWebViewHitTestResult(getHitTestResult()));
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
                public InAppBrowserDelegate getInAppBrowserDelegate() {
/* 1 */             return this.inAppBrowserDelegate;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
                public InAppWebViewFlutterPlugin getPlugin() {
/* 1 */             return this.plugin;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
                public void getSelectedText(final ValueCallback<String> valueCallback) {
/* 8 */             evaluateJavascript(PluginScriptsUtil.GET_SELECTED_TEXT_JS_SOURCE, new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.17
                        @Override // android.webkit.ValueCallback
                        public void onReceiveValue(String str) {
/* 25 */                    valueCallback.onReceiveValue((str == null || str.equalsIgnoreCase("null")) ? null : str.substring(1, str.length() - 1));
                        }
                    });
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
                public UserContentController getUserContentController() {
/* 1 */             return this.userContentController;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
                public Map<String, WebMessageChannel> getWebMessageChannels() {
/* 1 */             return this.webMessageChannels;
                }

                @Override // android.webkit.WebView, com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
                public Looper getWebViewLooper() {
                    return Build.VERSION.SDK_INT >= 28 ? super.getWebViewLooper() : Looper.getMainLooper();
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
                public void getZoomScale(ValueCallback<Float> valueCallback) {
/* 7 */             valueCallback.onReceiveValue(Float.valueOf(this.zoomScale));
                }

                public void hideContextMenu() {
/* 3 */             removeView(this.floatingContextMenu);
/* 7 */             this.floatingContextMenu = null;
/* 9 */             WebViewChannelDelegate webViewChannelDelegate = this.channelDelegate;
/* 11 */            if (webViewChannelDelegate != null) {
/* 13 */                webViewChannelDelegate.onHideContextMenu();
                    }
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
                public void injectCSSCode(String str) {
/* 4 */             injectDeferredObject(str, null, "(function(d) { var style = d.createElement('style'); style.innerHTML = %s; if (d.head != null) { d.head.appendChild(style); } })(document);", null);
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
                public void injectCSSFileFromUrl(String str, Map<String, Object> map) {
                    String string;
                    String strConcat;
/* 1 */             String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 3 */             if (map != null) {
/* 11 */                String str3 = (String) map.get("id");
/* 19 */                if (str3 != null) {
/* 38 */                    strConcat = " link.id = '" + str3.replaceAll("'", "\\\\'") + "'; ";
                        } else {
/* 43 */                    strConcat = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
/* 50 */                String str4 = (String) map.get("media");
/* 52 */                if (str4 != null) {
/* 56 */                    StringBuilder sbM3794t = fm0.m3794t(strConcat, " link.media = '");
/* 64 */                    sbM3794t.append(str4.replaceAll("'", "\\\\'"));
/* 67 */                    sbM3794t.append("'; ");
/* 70 */                    strConcat = sbM3794t.toString();
                        }
/* 80 */                String str5 = (String) map.get("crossOrigin");
/* 82 */                if (str5 != null) {
/* 86 */                    StringBuilder sbM3794t2 = fm0.m3794t(strConcat, " link.crossOrigin = '");
/* 94 */                    sbM3794t2.append(str5.replaceAll("'", "\\\\'"));
/* 97 */                    sbM3794t2.append("'; ");
/* 100 */                   strConcat = sbM3794t2.toString();
                        }
/* 110 */               String str6 = (String) map.get("integrity");
/* 112 */               if (str6 != null) {
/* 116 */                   StringBuilder sbM3794t3 = fm0.m3794t(strConcat, " link.integrity = '");
/* 124 */                   sbM3794t3.append(str6.replaceAll("'", "\\\\'"));
/* 127 */                   sbM3794t3.append("'; ");
/* 130 */                   strConcat = sbM3794t3.toString();
                        }
/* 140 */               String str7 = (String) map.get("referrerPolicy");
/* 142 */               if (str7 != null) {
/* 146 */                   StringBuilder sbM3794t4 = fm0.m3794t(strConcat, " link.referrerPolicy = '");
/* 154 */                   sbM3794t4.append(str7.replaceAll("'", "\\\\'"));
/* 157 */                   sbM3794t4.append("'; ");
/* 160 */                   strConcat = sbM3794t4.toString();
                        }
/* 170 */               Boolean bool = (Boolean) map.get("disabled");
/* 172 */               if (bool != null && bool.booleanValue()) {
/* 182 */                   strConcat = strConcat.concat(" link.disabled = true; ");
                        }
/* 192 */               Boolean bool2 = (Boolean) map.get("alternate");
/* 194 */               if (bool2 != null && bool2.booleanValue()) {
/* 202 */                   str2 = "alternate ";
                        }
/* 210 */               String str8 = (String) map.get("title");
/* 212 */               if (str8 != null) {
/* 216 */                   StringBuilder sbM3794t5 = fm0.m3794t(strConcat, " link.title = '");
/* 224 */                   sbM3794t5.append(str8.replaceAll("'", "\\\\'"));
/* 227 */                   sbM3794t5.append("'; ");
/* 230 */                   string = sbM3794t5.toString();
                        } else {
/* 235 */                   string = strConcat;
                        }
                    } else {
/* 237 */               string = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 249 */           injectDeferredObject(str, null, fm0.m3785k("(function(d) { var link = d.createElement('link'); link.rel='", str2, "stylesheet'; link.type='text/css'; ", string, " link.href = %s; if (d.head != null) { d.head.appendChild(link); } })(document);"), null);
                }

                public void injectDeferredObject(String str, final ContentWorld contentWorld, String str2, final ValueCallback<String> valueCallback) {
                    String strReplace;
/* 21 */            final String string = (contentWorld == null || contentWorld.equals(ContentWorld.PAGE)) ? null : UUID.randomUUID().toString();
/* 23 */            if (str2 != null) {
/* 27 */                JSONArray jSONArray = new JSONArray();
/* 30 */                jSONArray.put(str);
/* 33 */                String string2 = jSONArray.toString();
/* 51 */                strReplace = String.format(str2, string2.substring(1, string2.length() - 1));
                    } else {
/* 56 */                strReplace = str;
                    }
/* 57 */            if (string != null && valueCallback != null) {
/* 63 */                this.evaluateJavaScriptContentWorldCallbacks.put(string, valueCallback);
/* 114 */               strReplace = Util.replaceAll(PluginScriptsUtil.EVALUATE_JAVASCRIPT_WITH_CONTENT_WORLD_WRAPPER_JS_SOURCE, PluginScriptsUtil.VAR_RANDOM_NAME, "_flutter_inappwebview_" + Math.round(Math.random() * 1000000.0d)).replace(PluginScriptsUtil.VAR_PLACEHOLDER_VALUE, UserContentController.escapeCode(str)).replace(PluginScriptsUtil.VAR_RESULT_UUID, string);
                    }
/* 118 */           final String str3 = strReplace;
/* 129 */           this.mainLooperHandler.post(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.10
                        @Override // java.lang.Runnable
                        public void run() {
/* 20 */                    InAppWebView.this.evaluateJavascript(InAppWebView.this.userContentController.generateCodeForScriptEvaluation(str3, contentWorld), new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.10.1
                                @Override // android.webkit.ValueCallback
                                public void onReceiveValue(String str4) {
                                    ValueCallback valueCallback2;
/* 1 */                             RunnableC065210 runnableC065210 = RunnableC065210.this;
/* 5 */                             if (string != null || (valueCallback2 = valueCallback) == null) {
/* 15 */                                return;
                                    }
/* 12 */                            valueCallback2.onReceiveValue(str4);
                                }
                            });
                        }
                    });
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
                public void injectJavascriptFileFromUrl(String str, Map<String, Object> map) {
/* 1 */             String string = HttpUrl.FRAGMENT_ENCODE_SET;
/* 3 */             if (map != null) {
/* 11 */                String str2 = (String) map.get("type");
/* 19 */                if (str2 != null) {
/* 38 */                    string = " script.type = '" + str2.replaceAll("'", "\\\\'") + "'; ";
                        }
/* 48 */                String str3 = (String) map.get("id");
/* 50 */                if (str3 != null) {
/* 52 */                    String strReplaceAll = str3.replaceAll("'", "\\\\'");
/* 72 */                    string = pm2.m7489l(pm2.m7489l(pm2.m7489l(string, " script.id = '", strReplaceAll, "'; "), " script.onload = function() {  if (window.flutter_inappwebview != null) {    window.flutter_inappwebview.callHandler('onInjectedScriptLoaded', '", strReplaceAll, "');  }};"), " script.onerror = function() {  if (window.flutter_inappwebview != null) {    window.flutter_inappwebview.callHandler('onInjectedScriptError', '", strReplaceAll, "');  }};");
                        }
/* 82 */                Boolean bool = (Boolean) map.get("async");
/* 84 */                if (bool != null && bool.booleanValue()) {
/* 94 */                    string = string.concat(" script.async = true; ");
                        }
/* 104 */               Boolean bool2 = (Boolean) map.get("defer");
/* 106 */               if (bool2 != null && bool2.booleanValue()) {
/* 116 */                   string = string.concat(" script.defer = true; ");
                        }
/* 126 */               String str4 = (String) map.get("crossOrigin");
/* 128 */               if (str4 != null) {
/* 132 */                   StringBuilder sbM3794t = fm0.m3794t(string, " script.crossOrigin = '");
/* 140 */                   sbM3794t.append(str4.replaceAll("'", "\\\\'"));
/* 143 */                   sbM3794t.append("'; ");
/* 146 */                   string = sbM3794t.toString();
                        }
/* 156 */               String str5 = (String) map.get("integrity");
/* 158 */               if (str5 != null) {
/* 162 */                   StringBuilder sbM3794t2 = fm0.m3794t(string, " script.integrity = '");
/* 170 */                   sbM3794t2.append(str5.replaceAll("'", "\\\\'"));
/* 173 */                   sbM3794t2.append("'; ");
/* 176 */                   string = sbM3794t2.toString();
                        }
/* 186 */               Boolean bool3 = (Boolean) map.get("noModule");
/* 188 */               if (bool3 != null && bool3.booleanValue()) {
/* 198 */                   string = string.concat(" script.noModule = true; ");
                        }
/* 208 */               String str6 = (String) map.get("nonce");
/* 210 */               if (str6 != null) {
/* 214 */                   StringBuilder sbM3794t3 = fm0.m3794t(string, " script.nonce = '");
/* 222 */                   sbM3794t3.append(str6.replaceAll("'", "\\\\'"));
/* 225 */                   sbM3794t3.append("'; ");
/* 228 */                   string = sbM3794t3.toString();
                        }
/* 238 */               String str7 = (String) map.get("referrerPolicy");
/* 240 */               if (str7 != null) {
/* 244 */                   StringBuilder sbM3794t4 = fm0.m3794t(string, " script.referrerPolicy = '");
/* 252 */                   sbM3794t4.append(str7.replaceAll("'", "\\\\'"));
/* 255 */                   sbM3794t4.append("'; ");
/* 258 */                   string = sbM3794t4.toString();
                        }
                    }
/* 271 */           injectDeferredObject(str, null, fm0.m3784j("(function(d) { var script = d.createElement('script'); ", string, " script.src = %s; if (d.body != null) { d.body.appendChild(script); } })(document);"), null);
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
                public boolean isInFullscreen() {
/* 1 */             return this.inFullscreen;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
                public boolean isLoading() {
/* 1 */             return this.isLoading;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
                public void isSecureContext(final ValueCallback<Boolean> valueCallback) {
/* 8 */             evaluateJavascript("window.isSecureContext", new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.18
                        @Override // android.webkit.ValueCallback
                        public void onReceiveValue(String str) {
/* 1 */                     if (str == null || str.isEmpty() || str.equalsIgnoreCase("null") || str.equalsIgnoreCase("false")) {
/* 38 */                        valueCallback.onReceiveValue(Boolean.FALSE);
                            } else {
/* 30 */                        valueCallback.onReceiveValue(Boolean.TRUE);
                            }
                        }
                    });
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
                public void loadFile(String str) {
/* 1 */             InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
/* 3 */             if (inAppWebViewFlutterPlugin == null) {
/* 5 */                 return;
                    }
/* 10 */            loadUrl(Util.getUrlAsset(inAppWebViewFlutterPlugin, str));
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
                public void loadUrl(URLRequest uRLRequest) {
/* 1 */             String url = uRLRequest.getUrl();
/* 5 */             String method = uRLRequest.getMethod();
/* 9 */             if (method != null && method.equals("POST")) {
/* 23 */                postUrl(url, uRLRequest.getBody());
/* 26 */                return;
                    }
/* 27 */            Map<String, String> headers = uRLRequest.getHeaders();
/* 31 */            if (headers != null) {
/* 33 */                loadUrl(url, headers);
                    } else {
/* 37 */                loadUrl(url);
                    }
                }

                @Override // android.view.View
                public void onCreateContextMenu(ContextMenu contextMenu) {
/* 1 */             super.onCreateContextMenu(contextMenu);
/* 4 */             sendOnCreateContextMenuEvent();
                }

                @Override // android.webkit.WebView, android.view.View
                public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
                    View view;
/* 1 */             InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
/* 5 */             if (inputConnectionOnCreateInputConnection == null && !this.customSettings.useHybridComposition.booleanValue() && (view = this.containerView) != null) {
/* 32 */                view.getHandler().postDelayed(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.11
                            @Override // java.lang.Runnable
                            public void run() {
                                boolean zIsAcceptingText;
/* 13 */                        InputMethodManager inputMethodManager = (InputMethodManager) InAppWebView.this.getContext().getSystemService("input_method");
/* 15 */                        if (inputMethodManager != null) {
                                    try {
/* 17 */                                zIsAcceptingText = inputMethodManager.isAcceptingText();
                                    } catch (Exception unused) {
/* 22 */                                zIsAcceptingText = false;
                                    }
                                } else {
/* 22 */                            zIsAcceptingText = false;
                                }
/* 25 */                        View view2 = InAppWebView.this.containerView;
/* 27 */                        if (view2 == null || inputMethodManager == null || zIsAcceptingText) {
/* 41 */                            return;
                                }
/* 38 */                        inputMethodManager.hideSoftInputFromWindow(view2.getWindowToken(), 2);
                            }
                        }, 128L);
                    }
/* 35 */            return inputConnectionOnCreateInputConnection;
                }

                public void onFloatingActionGlobalLayout(int i, int i2) {
/* 1 */             int width = getWidth();
/* 5 */             getHeight();
/* 10 */            int width2 = this.floatingContextMenu.getWidth();
/* 16 */            int height = this.floatingContextMenu.getHeight();
/* 22 */            int i3 = i - (width2 / 2);
/* 23 */            if (i3 < 0) {
/* 25 */                i3 = 0;
                    } else if (i3 + width2 > width) {
/* 31 */                i3 = width - width2;
                    }
/* 38 */            float f = i2 - (height * 1.5f);
/* 42 */            if (f < 0.0f) {
/* 44 */                f = i2 + height;
                    }
/* 65 */            updateViewLayout(this.floatingContextMenu, new AbsoluteLayout.LayoutParams(-2, -2, getScrollX() + i3, getScrollY() + ((int) f)));
/* 75 */            this.mainLooperHandler.post(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.15
                        @Override // java.lang.Runnable
                        public void run() {
/* 3 */                     LinearLayout linearLayout = InAppWebView.this.floatingContextMenu;
/* 5 */                     if (linearLayout != null) {
/* 8 */                         linearLayout.setVisibility(0);
/* 32 */                        InAppWebView.this.floatingContextMenu.animate().alpha(1.0f).setDuration(100L).setListener(null);
                            }
                        }
                    });
                }

                @Override // android.webkit.WebView, android.view.View
                public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
                    WebViewChannelDelegate webViewChannelDelegate;
/* 1 */             super.onOverScrolled(i, i2, z, z2);
/* 8 */             boolean z3 = false;
/* 16 */            boolean z4 = canScrollHorizontally() && z;
/* 21 */            if (canScrollVertically() && z2) {
/* 25 */                z3 = true;
                    }
/* 26 */            ViewParent parent = getParent();
/* 32 */            if ((parent instanceof PullToRefreshLayout) && z3 && i2 <= 10) {
/* 40 */                PullToRefreshLayout pullToRefreshLayout = (PullToRefreshLayout) parent;
/* 43 */                setOverScrollMode(2);
/* 54 */                pullToRefreshLayout.setEnabled(pullToRefreshLayout.settings.enabled.booleanValue());
/* 65 */                setOverScrollMode(this.customSettings.overScrollMode.intValue());
                    }
/* 68 */            if ((z4 || z3) && (webViewChannelDelegate = this.channelDelegate) != null) {
/* 76 */                webViewChannelDelegate.onOverScrolled(i, i2, z4, z3);
                    }
                }

                @Override // android.webkit.WebView, android.view.View
                public void onScrollChanged(int i, int i2, int i3, int i4) {
/* 1 */             super.onScrollChanged(i, i2, i3, i4);
/* 4 */             LinearLayout linearLayout = this.floatingContextMenu;
/* 6 */             if (linearLayout != null) {
/* 9 */                 linearLayout.setAlpha(0.0f);
/* 16 */                this.floatingContextMenu.setVisibility(8);
                    }
/* 19 */            WebViewChannelDelegate webViewChannelDelegate = this.channelDelegate;
/* 21 */            if (webViewChannelDelegate != null) {
/* 23 */                webViewChannelDelegate.onScrollChanged(i, i2);
                    }
                }

                public void onScrollStopped() {
/* 3 */             if (this.floatingContextMenu != null) {
/* 5 */                 adjustFloatingContextMenuPosition();
                    }
                }

                @Override // android.webkit.WebView, android.view.View
                public boolean onTouchEvent(MotionEvent motionEvent) {
/* 16 */            this.lastTouch = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
/* 18 */            ViewParent parent = getParent();
/* 24 */            if (parent instanceof PullToRefreshLayout) {
/* 26 */                PullToRefreshLayout pullToRefreshLayout = (PullToRefreshLayout) parent;
/* 32 */                if (motionEvent.getActionMasked() == 0) {
/* 35 */                    pullToRefreshLayout.setEnabled(false);
                        }
                    }
/* 38 */            return super.onTouchEvent(motionEvent);
                }

                @Override // android.webkit.WebView, android.view.View
                public void onWindowVisibilityChanged(int i) {
/* 9 */             if (!this.customSettings.allowBackgroundAudioPlaying.booleanValue()) {
/* 20 */                super.onWindowVisibilityChanged(i);
                    } else if (i != 8) {
/* 16 */                super.onWindowVisibilityChanged(0);
                    }
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
                public void postWebMessage(WebMessage webMessage, Uri uri, ValueCallback<String> valueCallback) {
/* 6 */             throw new UnsupportedOperationException();
                }

                public void prepare() {
/* 1 */             InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
/* 3 */             if (inAppWebViewFlutterPlugin != null) {
/* 17 */                this.webViewAssetLoaderExt = WebViewAssetLoaderExt.fromMap(this.customSettings.webViewAssetLoader, inAppWebViewFlutterPlugin, getContext());
                    }
/* 21 */            JavaScriptBridgeInterface javaScriptBridgeInterface = new JavaScriptBridgeInterface(this);
/* 24 */            this.javaScriptBridgeInterface = javaScriptBridgeInterface;
/* 28 */            addJavascriptInterface(javaScriptBridgeInterface, JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_NAME);
/* 37 */            InAppWebViewChromeClient inAppWebViewChromeClient = new InAppWebViewChromeClient(this.plugin, this, this.inAppBrowserDelegate);
/* 40 */            this.inAppWebViewChromeClient = inAppWebViewChromeClient;
/* 42 */            setWebChromeClient(inAppWebViewChromeClient);
/* 47 */            WebViewClient webViewClientCreateWebViewClient = createWebViewClient(this.inAppBrowserDelegate);
/* 53 */            if (webViewClientCreateWebViewClient instanceof InAppWebViewClientCompat) {
/* 55 */                InAppWebViewClientCompat inAppWebViewClientCompat = (InAppWebViewClientCompat) webViewClientCreateWebViewClient;
/* 57 */                this.inAppWebViewClientCompat = inAppWebViewClientCompat;
/* 59 */                setWebViewClient(inAppWebViewClientCompat);
                    } else if (webViewClientCreateWebViewClient instanceof InAppWebViewClient) {
/* 67 */                InAppWebViewClient inAppWebViewClient = (InAppWebViewClient) webViewClientCreateWebViewClient;
/* 69 */                this.inAppWebViewClient = inAppWebViewClient;
/* 71 */                setWebViewClient(inAppWebViewClient);
                    }
/* 74 */            int i = Build.VERSION.SDK_INT;
/* 78 */            if (i >= 29 && xe2.m9786x("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE")) {
/* 90 */                InAppWebViewRenderProcessClient inAppWebViewRenderProcessClient = new InAppWebViewRenderProcessClient();
/* 93 */                this.inAppWebViewRenderProcessClient = inAppWebViewRenderProcessClient;
/* 95 */                y63.m10122g(this, inAppWebViewRenderProcessClient);
                    }
/* 100 */           if (this.windowId == null || !xe2.m9786x("DOCUMENT_START_SCRIPT")) {
/* 110 */               prepareAndAddUserScripts();
                    }
/* 121 */           if (this.customSettings.useOnDownloadStart.booleanValue()) {
/* 128 */               setDownloadListener(new DownloadStartListener());
                    }
/* 131 */           WebSettings settings = getSettings();
/* 143 */           settings.setJavaScriptEnabled(this.customSettings.javaScriptEnabled.booleanValue());
/* 154 */           settings.setJavaScriptCanOpenWindowsAutomatically(this.customSettings.javaScriptCanOpenWindowsAutomatically.booleanValue());
/* 165 */           settings.setBuiltInZoomControls(this.customSettings.builtInZoomControls.booleanValue());
/* 176 */           settings.setDisplayZoomControls(this.customSettings.displayZoomControls.booleanValue());
/* 187 */           settings.setSupportMultipleWindows(this.customSettings.supportMultipleWindows.booleanValue());
/* 198 */           if (xe2.m9786x("SAFE_BROWSING_ENABLE")) {
/* 208 */               p63.m7344c(settings, this.customSettings.safeBrowsingEnabled.booleanValue());
                    } else if (i >= 26) {
/* 1 */                 settings.setSafeBrowsingEnabled(this.customSettings.safeBrowsingEnabled.booleanValue());
                    }
/* 233 */           settings.setMediaPlaybackRequiresUserGesture(this.customSettings.mediaPlaybackRequiresUserGesture.booleanValue());
/* 244 */           settings.setDatabaseEnabled(this.customSettings.databaseEnabled.booleanValue());
/* 255 */           settings.setDomStorageEnabled(this.customSettings.domStorageEnabled.booleanValue());
/* 260 */           String str = this.customSettings.userAgent;
/* 262 */           if (str == null || str.isEmpty()) {
/* 286 */               settings.setUserAgentString(WebSettings.getDefaultUserAgent(getContext()));
                    } else {
/* 274 */               settings.setUserAgentString(this.customSettings.userAgent);
                    }
/* 291 */           String str2 = this.customSettings.applicationNameForUserAgent;
/* 293 */           if (str2 != null && !str2.isEmpty()) {
/* 303 */               String str3 = this.customSettings.userAgent;
/* 328 */               StringBuilder sbM3794t = fm0.m3794t((str3 == null || str3.isEmpty()) ? WebSettings.getDefaultUserAgent(getContext()) : this.customSettings.userAgent, " ");
/* 336 */               sbM3794t.append(this.customSettings.applicationNameForUserAgent);
/* 343 */               settings.setUserAgentString(sbM3794t.toString());
                    }
/* 354 */           if (this.customSettings.clearCache.booleanValue()) {
/* 356 */               clearAllCache();
                    } else if (this.customSettings.clearSessionCache.booleanValue()) {
/* 374 */               CookieManager.getInstance().removeSessionCookie();
                    }
/* 389 */           CookieManager.getInstance().setAcceptThirdPartyCookies(this, this.customSettings.thirdPartyCookiesEnabled.booleanValue());
/* 400 */           settings.setLoadWithOverviewMode(this.customSettings.loadWithOverviewMode.booleanValue());
/* 411 */           settings.setUseWideViewPort(this.customSettings.useWideViewPort.booleanValue());
/* 422 */           settings.setSupportZoom(this.customSettings.supportZoom.booleanValue());
/* 433 */           settings.setTextZoom(this.customSettings.textZoom.intValue());
/* 461 */           setVerticalScrollBarEnabled(!this.customSettings.disableVerticalScroll.booleanValue() && this.customSettings.verticalScrollBarEnabled.booleanValue());
/* 487 */           setHorizontalScrollBarEnabled(!this.customSettings.disableHorizontalScroll.booleanValue() && this.customSettings.horizontalScrollBarEnabled.booleanValue());
/* 498 */           if (this.customSettings.transparentBackground.booleanValue()) {
/* 500 */               setBackgroundColor(0);
                    }
/* 505 */           Integer num = this.customSettings.mixedContentMode;
/* 507 */           if (num != null) {
/* 513 */               settings.setMixedContentMode(num.intValue());
                    }
/* 524 */           settings.setAllowContentAccess(this.customSettings.allowContentAccess.booleanValue());
/* 535 */           settings.setAllowFileAccess(this.customSettings.allowFileAccess.booleanValue());
/* 546 */           settings.setAllowFileAccessFromFileURLs(this.customSettings.allowFileAccessFromFileURLs.booleanValue());
/* 557 */           settings.setAllowUniversalAccessFromFileURLs(this.customSettings.allowUniversalAccessFromFileURLs.booleanValue());
/* 568 */           setCacheEnabled(this.customSettings.cacheEnabled.booleanValue());
/* 573 */           String str4 = this.customSettings.appCachePath;
/* 575 */           if (str4 != null && !str4.isEmpty() && this.customSettings.cacheEnabled.booleanValue()) {
/* 603 */               Util.invokeMethodIfExists(settings, "setAppCachePath", this.customSettings.appCachePath);
                    }
/* 614 */           settings.setBlockNetworkImage(this.customSettings.blockNetworkImage.booleanValue());
/* 625 */           settings.setBlockNetworkLoads(this.customSettings.blockNetworkLoads.booleanValue());
/* 630 */           Integer num2 = this.customSettings.cacheMode;
/* 632 */           if (num2 != null) {
/* 638 */               settings.setCacheMode(num2.intValue());
                    }
/* 645 */           settings.setCursiveFontFamily(this.customSettings.cursiveFontFamily);
/* 656 */           settings.setDefaultFixedFontSize(this.customSettings.defaultFixedFontSize.intValue());
/* 667 */           settings.setDefaultFontSize(this.customSettings.defaultFontSize.intValue());
/* 674 */           settings.setDefaultTextEncodingName(this.customSettings.defaultTextEncodingName);
/* 681 */           if (this.customSettings.disabledActionModeMenuItems != null) {
/* 685 */               boolean zM9786x = xe2.m9786x("DISABLED_ACTION_MODE_MENU_ITEMS");
/* 689 */               InAppWebViewSettings inAppWebViewSettings = this.customSettings;
/* 691 */               if (zM9786x) {
/* 695 */                   int iIntValue = inAppWebViewSettings.disabledActionModeMenuItems.intValue();
/* 701 */                   b73.f2302c.getClass();
/* 704 */                   AbstractC2062p9.m7368o(settings, iIntValue);
                        } else {
/* 714 */                   settings.setDisabledActionModeMenuItems(inAppWebViewSettings.disabledActionModeMenuItems.intValue());
                        }
                    }
/* 721 */           settings.setFantasyFontFamily(this.customSettings.fantasyFontFamily);
/* 728 */           settings.setFixedFontFamily(this.customSettings.fixedFontFamily);
/* 735 */           if (this.customSettings.forceDark != null) {
/* 743 */               if (xe2.m9786x("FORCE_DARK")) {
/* 753 */                   p63.m7343b(settings, this.customSettings.forceDark.intValue());
                        } else if (i >= 29) {
/* 1 */                     settings.setForceDark(this.customSettings.forceDark.intValue());
                        }
                    }
/* 774 */           if (this.customSettings.forceDarkStrategy != null && xe2.m9786x("FORCE_DARK_STRATEGY")) {
/* 788 */               int iIntValue2 = this.customSettings.forceDarkStrategy.intValue();
/* 798 */               if (!b73.f2292H.mo97b()) {
/* 816 */                   throw b73.m1295a();
                        }
/* 808 */               ((WebSettingsBoundaryInterface) p63.m7342a(settings).f7853b).setForceDarkBehavior(iIntValue2);
                    }
/* 825 */           settings.setGeolocationEnabled(this.customSettings.geolocationEnabled.booleanValue());
/* 830 */           WebSettings.LayoutAlgorithm layoutAlgorithm = this.customSettings.layoutAlgorithm;
/* 832 */           if (layoutAlgorithm != null) {
/* 836 */               boolean zEquals = layoutAlgorithm.equals(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);
/* 840 */               InAppWebViewSettings inAppWebViewSettings2 = this.customSettings;
/* 842 */               if (zEquals) {
/* 846 */                   settings.setLayoutAlgorithm(inAppWebViewSettings2.layoutAlgorithm);
                        } else {
/* 852 */                   settings.setLayoutAlgorithm(inAppWebViewSettings2.layoutAlgorithm);
                        }
                    }
/* 863 */           settings.setLoadsImagesAutomatically(this.customSettings.loadsImagesAutomatically.booleanValue());
/* 874 */           settings.setMinimumFontSize(this.customSettings.minimumFontSize.intValue());
/* 885 */           settings.setMinimumLogicalFontSize(this.customSettings.minimumLogicalFontSize.intValue());
/* 896 */           setInitialScale(this.customSettings.initialScale.intValue());
/* 907 */           settings.setNeedInitialFocus(this.customSettings.needInitialFocus.booleanValue());
/* 912 */           boolean zM9786x2 = xe2.m9786x("OFF_SCREEN_PRERASTER");
/* 916 */           InAppWebViewSettings inAppWebViewSettings3 = this.customSettings;
/* 918 */           if (zM9786x2) {
/* 922 */               boolean zBooleanValue = inAppWebViewSettings3.offscreenPreRaster.booleanValue();
/* 928 */               b73.f2300a.getClass();
/* 931 */               AbstractC1993o9.m7124k(settings, zBooleanValue);
                    } else {
/* 941 */               settings.setOffscreenPreRaster(inAppWebViewSettings3.offscreenPreRaster.booleanValue());
                    }
/* 948 */           settings.setSansSerifFontFamily(this.customSettings.sansSerifFontFamily);
/* 955 */           settings.setSerifFontFamily(this.customSettings.serifFontFamily);
/* 962 */           settings.setStandardFontFamily(this.customSettings.standardFontFamily);
/* 967 */           Integer num3 = this.customSettings.preferredContentMode;
/* 969 */           if (num3 != null && num3.intValue() == PreferredContentModeOptionType.DESKTOP.toValue()) {
/* 983 */               setDesktopMode(true);
                    }
/* 994 */           settings.setSaveFormData(this.customSettings.saveFormData.booleanValue());
/* 1005 */          if (this.customSettings.incognito.booleanValue()) {
/* 1007 */              setIncognito(true);
                    }
/* 1018 */          if (this.customSettings.useHybridComposition.booleanValue()) {
/* 1029 */              if (this.customSettings.hardwareAcceleration.booleanValue()) {
/* 1032 */                  setLayerType(2, null);
                        } else {
/* 1036 */                  setLayerType(0, null);
                        }
                    }
/* 1041 */          String str5 = this.customSettings.regexToCancelSubFramesLoading;
/* 1043 */          if (str5 != null) {
/* 1049 */              this.regexToCancelSubFramesLoadingCompiled = Pattern.compile(str5);
                    }
/* 1059 */          setScrollBarStyle(this.customSettings.scrollBarStyle.intValue());
/* 1062 */          InAppWebViewSettings inAppWebViewSettings4 = this.customSettings;
/* 1064 */          Integer num4 = inAppWebViewSettings4.scrollBarDefaultDelayBeforeFade;
/* 1066 */          if (num4 != null) {
/* 1072 */              setScrollBarDefaultDelayBeforeFade(num4.intValue());
                    } else {
/* 1084 */              inAppWebViewSettings4.scrollBarDefaultDelayBeforeFade = Integer.valueOf(getScrollBarDefaultDelayBeforeFade());
                    }
/* 1094 */          setScrollbarFadingEnabled(this.customSettings.scrollbarFadingEnabled.booleanValue());
/* 1097 */          InAppWebViewSettings inAppWebViewSettings5 = this.customSettings;
/* 1099 */          Integer num5 = inAppWebViewSettings5.scrollBarFadeDuration;
/* 1101 */          if (num5 != null) {
/* 1107 */              setScrollBarFadeDuration(num5.intValue());
                    } else {
/* 1119 */              inAppWebViewSettings5.scrollBarFadeDuration = Integer.valueOf(getScrollBarFadeDuration());
                    }
/* 1129 */          setVerticalScrollbarPosition(this.customSettings.verticalScrollbarPosition.intValue());
/* 1132 */          if (i >= 29) {
/* 1138 */              if (this.customSettings.verticalScrollbarThumbColor != null) {
/* 1 */                     setVerticalScrollbarThumbDrawable(new ColorDrawable(Color.parseColor(this.customSettings.verticalScrollbarThumbColor)));
                        }
/* 1160 */              if (this.customSettings.verticalScrollbarTrackColor != null) {
/* 1 */                     setVerticalScrollbarTrackDrawable(new ColorDrawable(Color.parseColor(this.customSettings.verticalScrollbarTrackColor)));
                        }
/* 1182 */              if (this.customSettings.horizontalScrollbarThumbColor != null) {
/* 1 */                     setHorizontalScrollbarThumbDrawable(new ColorDrawable(Color.parseColor(this.customSettings.horizontalScrollbarThumbColor)));
                        }
/* 1204 */              if (this.customSettings.horizontalScrollbarTrackColor != null) {
/* 1 */                     setHorizontalScrollbarTrackDrawable(new ColorDrawable(Color.parseColor(this.customSettings.horizontalScrollbarTrackColor)));
                        }
                    }
/* 1230 */          setOverScrollMode(this.customSettings.overScrollMode.intValue());
/* 1235 */          Boolean bool = this.customSettings.networkAvailable;
/* 1237 */          if (bool != null) {
/* 1243 */              setNetworkAvailable(bool.booleanValue());
                    }
/* 1248 */          Map<String, Object> map = this.customSettings.rendererPriorityPolicy;
/* 1250 */          if (map != null && !map.isEmpty() && i >= 26) {
/* 1 */                 setRendererPriorityPolicy(((Integer) this.customSettings.rendererPriorityPolicy.get("rendererRequestedPriority")).intValue(), ((Boolean) this.customSettings.rendererPriorityPolicy.get("waivedWhenNotVisible")).booleanValue());
                    }
/* 1301 */          if (xe2.m9786x("ALGORITHMIC_DARKENING") && i >= 29) {
/* 1309 */              boolean zBooleanValue2 = this.customSettings.algorithmicDarkeningAllowed.booleanValue();
/* 1319 */              if (!b73.f2288D.mo97b()) {
/* 1337 */                  throw b73.m1295a();
                        }
/* 1329 */              ((WebSettingsBoundaryInterface) p63.m7342a(settings).f7853b).setAlgorithmicDarkeningAllowed(zBooleanValue2);
                    }
/* 1344 */          if (xe2.m9786x("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY")) {
/* 1350 */              boolean zBooleanValue3 = this.customSettings.enterpriseAuthenticationAppLinkPolicyEnabled.booleanValue();
/* 1360 */              if (!b73.f2297M.mo97b()) {
/* 1378 */                  throw b73.m1295a();
                        }
/* 1370 */              ((WebSettingsBoundaryInterface) p63.m7342a(settings).f7853b).setEnterpriseAuthenticationAppLinkPolicyEnabled(zBooleanValue3);
                    }
/* 1383 */          if (this.customSettings.requestedWithHeaderOriginAllowList != null && xe2.m9786x("REQUESTED_WITH_HEADER_ALLOW_LIST")) {
/* 1395 */              Set<String> set = this.customSettings.requestedWithHeaderOriginAllowList;
/* 1403 */              if (!b73.f2299O.mo97b()) {
/* 1421 */                  throw b73.m1295a();
                        }
/* 1413 */              ((WebSettingsBoundaryInterface) p63.m7342a(settings).f7853b).setRequestedWithHeaderOriginAllowList(set);
                    }
/* 1428 */          this.contentBlockerHandler.getRuleList().clear();
/* 1443 */          for (Map<String, Map<String, Object>> map2 : this.customSettings.contentBlockers) {
/* 1486 */              this.contentBlockerHandler.getRuleList().add(new ContentBlocker(ContentBlockerTrigger.fromMap(map2.get("trigger")), ContentBlockerAction.fromMap(map2.get("action"))));
                    }
/* 1495 */          setFindListener(new WebView.FindListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.1
                        @Override // android.webkit.WebView.FindListener
                        public void onFindResultReceived(int i2, int i3, boolean z) {
                            FindInteractionChannelDelegate findInteractionChannelDelegate;
/* 3 */                     FindInteractionController findInteractionController = InAppWebView.this.findInteractionController;
/* 5 */                     if (findInteractionController != null && (findInteractionChannelDelegate = findInteractionController.channelDelegate) != null) {
/* 11 */                        findInteractionChannelDelegate.onFindResultReceived(i2, i3, z);
                            }
/* 16 */                    WebViewChannelDelegate webViewChannelDelegate = InAppWebView.this.channelDelegate;
/* 18 */                    if (webViewChannelDelegate != null) {
/* 20 */                        webViewChannelDelegate.onFindResultReceived(i2, i3, z);
                            }
                        }
                    });
/* 1512 */          this.gestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.2
                        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                        public boolean onSingleTapUp(MotionEvent motionEvent) {
/* 1 */                     InAppWebView inAppWebView = InAppWebView.this;
/* 5 */                     if (inAppWebView.floatingContextMenu != null) {
/* 7 */                         inAppWebView.hideContextMenu();
                            }
/* 10 */                    return super.onSingleTapUp(motionEvent);
                        }
                    });
/* 1519 */          this.checkScrollStoppedTask = new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.3
                        @Override // java.lang.Runnable
                        public void run() {
/* 3 */                     int scrollY = InAppWebView.this.getScrollY();
/* 7 */                     InAppWebView inAppWebView = InAppWebView.this;
/* 12 */                    if (inAppWebView.initialPositionScrollStoppedTask - scrollY == 0) {
/* 14 */                        inAppWebView.onScrollStopped();
/* 17 */                        return;
                            }
/* 22 */                    inAppWebView.initialPositionScrollStoppedTask = inAppWebView.getScrollY();
/* 24 */                    InAppWebView inAppWebView2 = InAppWebView.this;
/* 33 */                    inAppWebView2.mainLooperHandler.postDelayed(inAppWebView2.checkScrollStoppedTask, inAppWebView2.newCheckScrollStoppedTask);
                        }
                    };
/* 1529 */          if (!this.customSettings.useHybridComposition.booleanValue()) {
/* 1536 */              this.checkContextMenuShouldBeClosedTask = new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.4
                            @Override // java.lang.Runnable
                            public void run() {
/* 1 */                         InAppWebView inAppWebView = InAppWebView.this;
/* 5 */                         if (inAppWebView.floatingContextMenu != null) {
/* 14 */                            inAppWebView.evaluateJavascript(PluginScriptsUtil.CHECK_CONTEXT_MENU_SHOULD_BE_HIDDEN_JS_SOURCE, new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.4.1
                                        @Override // android.webkit.ValueCallback
                                        public void onReceiveValue(String str6) {
/* 1 */                                     if (str6 != null && !str6.equals("true")) {
/* 14 */                                        InAppWebView inAppWebView2 = InAppWebView.this;
/* 23 */                                        inAppWebView2.mainLooperHandler.postDelayed(inAppWebView2.checkContextMenuShouldBeClosedTask, inAppWebView2.newCheckContextMenuShouldBeClosedTaskTask);
                                            } else {
/* 29 */                                        InAppWebView inAppWebView3 = InAppWebView.this;
/* 33 */                                        if (inAppWebView3.floatingContextMenu != null) {
/* 35 */                                            inAppWebView3.hideContextMenu();
                                                }
                                            }
                                        }
                                    });
                                }
                            }
                        };
                    }
/* 1543 */          setOnTouchListener(new View.OnTouchListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.5
                        float m_downX;
                        float m_downY;

                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
/* 5 */                     InAppWebView.this.gestureDetector.onTouchEvent(motionEvent);
/* 13 */                    if (motionEvent.getAction() == 1) {
/* 19 */                        InAppWebView.this.checkScrollStoppedTask.run();
                            }
/* 34 */                    if (InAppWebView.this.customSettings.disableHorizontalScroll.booleanValue() && InAppWebView.this.customSettings.disableVerticalScroll.booleanValue()) {
                                return motionEvent.getAction() == 2;
                            }
/* 66 */                    if (InAppWebView.this.customSettings.disableHorizontalScroll.booleanValue() || InAppWebView.this.customSettings.disableVerticalScroll.booleanValue()) {
/* 80 */                        int action = motionEvent.getAction();
/* 84 */                        if (action == 0) {
/* 130 */                           this.m_downX = motionEvent.getX();
/* 136 */                           this.m_downY = motionEvent.getY();
                                } else if (action == 1 || action == 2 || action == 3) {
/* 104 */                           if (InAppWebView.this.customSettings.disableHorizontalScroll.booleanValue()) {
/* 112 */                               motionEvent.setLocation(this.m_downX, motionEvent.getY());
                                    } else {
/* 122 */                               motionEvent.setLocation(motionEvent.getX(), this.m_downY);
                                    }
                                }
                            }
/* 32 */                    return false;
                        }
                    });
/* 1551 */          setOnLongClickListener(new View.OnLongClickListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.6
                        @Override // android.view.View.OnLongClickListener
                        public boolean onLongClick(View view) {
/* 7 */                     HitTestResult hitTestResultFromWebViewHitTestResult = HitTestResult.fromWebViewHitTestResult(InAppWebView.this.getHitTestResult());
/* 13 */                    WebViewChannelDelegate webViewChannelDelegate = InAppWebView.this.channelDelegate;
/* 15 */                    if (webViewChannelDelegate == null) {
/* 20 */                        return false;
                            }
/* 17 */                    webViewChannelDelegate.onLongPressHitTestResult(hitTestResultFromWebViewHitTestResult);
/* 20 */                    return false;
                        }
                    });
                }

                public void prepareAndAddUserScripts() {
/* 5 */             this.userContentController.addPluginScript(PromisePolyfillJS.PROMISE_POLYFILL_JS_PLUGIN_SCRIPT);
/* 12 */            this.userContentController.addPluginScript(JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_JS_PLUGIN_SCRIPT);
/* 19 */            this.userContentController.addPluginScript(PrintJS.PRINT_JS_PLUGIN_SCRIPT);
/* 26 */            this.userContentController.addPluginScript(OnWindowBlurEventJS.ON_WINDOW_BLUR_EVENT_JS_PLUGIN_SCRIPT);
/* 33 */            this.userContentController.addPluginScript(OnWindowFocusEventJS.ON_WINDOW_FOCUS_EVENT_JS_PLUGIN_SCRIPT);
/* 48 */            this.interceptOnlyAsyncAjaxRequestsPluginScript = InterceptAjaxRequestJS.createInterceptOnlyAsyncAjaxRequestsPluginScript(this.customSettings.interceptOnlyAsyncAjaxRequests.booleanValue());
/* 58 */            if (this.customSettings.useShouldInterceptAjaxRequest.booleanValue()) {
/* 64 */                this.userContentController.addPluginScript(this.interceptOnlyAsyncAjaxRequestsPluginScript);
/* 71 */                this.userContentController.addPluginScript(InterceptAjaxRequestJS.INTERCEPT_AJAX_REQUEST_JS_PLUGIN_SCRIPT);
                    }
/* 82 */            if (this.customSettings.useShouldInterceptFetchRequest.booleanValue()) {
/* 88 */                this.userContentController.addPluginScript(InterceptFetchRequestJS.INTERCEPT_FETCH_REQUEST_JS_PLUGIN_SCRIPT);
                    }
/* 99 */            if (this.customSettings.useOnLoadResource.booleanValue()) {
/* 105 */               this.userContentController.addPluginScript(OnLoadResourceJS.ON_LOAD_RESOURCE_JS_PLUGIN_SCRIPT);
                    }
/* 116 */           if (!this.customSettings.useHybridComposition.booleanValue()) {
/* 122 */               this.userContentController.addPluginScript(PluginScriptsUtil.f5326x4e848d3b);
                    }
/* 129 */           this.userContentController.addUserOnlyScripts(this.initialUserOnlyScripts);
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
                public String printCurrentPage(PrintJobSettings printJobSettings) {
                    Activity activity;
                    PrintManager printManager;
/* 1 */             InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
/* 3 */             if (inAppWebViewFlutterPlugin == null || (activity = inAppWebViewFlutterPlugin.activity) == null || (printManager = (PrintManager) activity.getSystemService("print")) == null) {
/* 188 */               return null;
                    }
/* 21 */            PrintAttributes.Builder builder = new PrintAttributes.Builder();
/* 46 */            String strM3789o = fm0.m3789o(new StringBuilder(), getTitle() != null ? getTitle() : getUrl(), " Document");
/* 50 */            if (printJobSettings != null) {
/* 52 */                String str = printJobSettings.jobName;
/* 54 */                if (str != null && !str.isEmpty()) {
/* 62 */                    strM3789o = printJobSettings.jobName;
                        }
/* 64 */                Integer num = printJobSettings.orientation;
/* 66 */                if (num != null) {
/* 68 */                    int iIntValue = num.intValue();
/* 72 */                    if (iIntValue == 0) {
/* 86 */                        builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_PORTRAIT);
                            } else if (iIntValue == 1) {
/* 80 */                        builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE);
                            }
                        }
/* 89 */                MediaSizeExt mediaSizeExt = printJobSettings.mediaSize;
/* 91 */                if (mediaSizeExt != null) {
/* 97 */                    builder.setMediaSize(mediaSizeExt.toMediaSize());
                        }
/* 100 */               Integer num2 = printJobSettings.colorMode;
/* 102 */               if (num2 != null) {
/* 108 */                   builder.setColorMode(num2.intValue());
                        }
/* 111 */               Integer num3 = printJobSettings.duplexMode;
/* 113 */               if (num3 != null) {
/* 119 */                   builder.setDuplexMode(num3.intValue());
                        }
/* 122 */               ResolutionExt resolutionExt = printJobSettings.resolution;
/* 124 */               if (resolutionExt != null) {
/* 130 */                   builder.setResolution(resolutionExt.toResolution());
                        }
                    }
/* 141 */           PrintJob printJobPrint = printManager.print(strM3789o, createPrintDocumentAdapter(strM3789o), builder.build());
/* 145 */           if (printJobSettings == null || !printJobSettings.handledByClient.booleanValue() || this.plugin.printJobManager == null) {
/* 188 */               return null;
                    }
/* 165 */           String string = UUID.randomUUID().toString();
/* 173 */           PrintJobController printJobController = new PrintJobController(string, printJobPrint, printJobSettings, this.plugin);
/* 184 */           this.plugin.printJobManager.jobs.put(printJobController.f5328id, printJobController);
/* 187 */           return string;
                }

                public ActionMode rebuildActionMode(ActionMode actionMode, ActionMode.Callback callback) {
                    boolean z;
                    View view;
/* 9 */             if (!this.customSettings.useHybridComposition.booleanValue() && (view = this.containerView) != null) {
/* 19 */                onWindowFocusChanged(view.isFocused());
                    }
/* 25 */            if (this.floatingContextMenu != null) {
/* 27 */                hideContextMenu();
/* 30 */                z = true;
                    } else {
/* 32 */                z = false;
                    }
/* 33 */            if (actionMode == null) {
/* 35 */                return null;
                    }
/* 37 */            Menu menu = actionMode.getMenu();
/* 43 */            actionMode.hide(3000L);
/* 48 */            ArrayList<MenuItem> arrayList = new ArrayList();
/* 56 */            for (int i = 0; i < menu.size(); i++) {
/* 62 */                arrayList.add(menu.getItem(i));
                    }
/* 68 */            menu.clear();
/* 71 */            actionMode.finish();
/* 82 */            if (this.customSettings.disableContextMenu.booleanValue()) {
/* 84 */                return actionMode;
                    }
/* 101 */           LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(getContext()).inflate(C0608R.layout.floating_action_mode, (ViewGroup) this, false);
/* 103 */           this.floatingContextMenu = linearLayout;
/* 115 */           LinearLayout linearLayout2 = (LinearLayout) ((HorizontalScrollView) linearLayout.getChildAt(0)).getChildAt(0);
/* 119 */           List<Map> arrayList2 = new ArrayList();
/* 124 */           ContextMenuSettings contextMenuSettings = new ContextMenuSettings();
/* 127 */           Map<String, Object> map = this.contextMenu;
/* 129 */           if (map != null) {
/* 137 */               arrayList2 = (List) map.get("menuItems");
/* 147 */               Map<String, Object> map2 = (Map) this.contextMenu.get("settings");
/* 149 */               if (map2 != null) {
/* 151 */                   contextMenuSettings.parse2(map2);
                        }
                    }
/* 154 */           if (arrayList2 == null) {
/* 158 */               arrayList2 = new ArrayList();
                    }
/* 161 */           Boolean bool = contextMenuSettings.hideDefaultSystemContextMenuItems;
/* 163 */           if (bool == null || !bool.booleanValue()) {
/* 183 */               for (final MenuItem menuItem : arrayList) {
/* 192 */                   final int itemId = menuItem.getItemId();
/* 200 */                   final String string = menuItem.getTitle().toString();
/* 218 */                   TextView textView = (TextView) LayoutInflater.from(this.getContext()).inflate(C0608R.layout.floating_action_mode_item, (ViewGroup) this, false);
/* 220 */                   textView.setText(string);
/* 225 */                   InAppWebView inAppWebView = this;
/* 226 */                   final ActionMode actionMode2 = actionMode;
/* 227 */                   final ActionMode.Callback callback2 = callback;
/* 231 */                   textView.setOnClickListener(new View.OnClickListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.12
                                @Override // android.view.View.OnClickListener
                                public void onClick(View view2) {
/* 3 */                             InAppWebView.this.hideContextMenu();
/* 12 */                            callback2.onActionItemClicked(actionMode2, menuItem);
/* 17 */                            WebViewChannelDelegate webViewChannelDelegate = InAppWebView.this.channelDelegate;
/* 19 */                            if (webViewChannelDelegate != null) {
/* 25 */                                webViewChannelDelegate.onContextMenuActionItemClicked(itemId, string);
                                    }
                                }
                            });
/* 236 */                   if (inAppWebView.floatingContextMenu != null) {
/* 238 */                       linearLayout2.addView(textView);
                            }
/* 241 */                   this = inAppWebView;
/* 242 */                   callback = callback2;
/* 243 */                   actionMode = actionMode2;
                        }
                    }
/* 172 */           InAppWebView inAppWebView2 = this;
/* 173 */           ActionMode actionMode3 = actionMode;
/* 253 */           for (Map map3 : arrayList2) {
/* 269 */               final int iIntValue = ((Integer) map3.get("id")).intValue();
/* 279 */               final String str = (String) map3.get("title");
/* 295 */               TextView textView2 = (TextView) LayoutInflater.from(inAppWebView2.getContext()).inflate(C0608R.layout.floating_action_mode_item, (ViewGroup) inAppWebView2, false);
/* 297 */               textView2.setText(str);
/* 305 */               textView2.setOnClickListener(new View.OnClickListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.13
                            @Override // android.view.View.OnClickListener
                            public void onClick(View view2) {
/* 3 */                         InAppWebView.this.hideContextMenu();
/* 8 */                         WebViewChannelDelegate webViewChannelDelegate = InAppWebView.this.channelDelegate;
/* 10 */                        if (webViewChannelDelegate != null) {
/* 16 */                            webViewChannelDelegate.onContextMenuActionItemClicked(iIntValue, str);
                                }
                            }
                        });
/* 310 */               if (inAppWebView2.floatingContextMenu != null) {
/* 312 */                   linearLayout2.addView(textView2);
                        }
                    }
/* 316 */           Point point = inAppWebView2.lastTouch;
/* 323 */           final int i2 = point != null ? point.x : 0;
/* 326 */           final int i3 = point != null ? point.y : 0;
/* 333 */           inAppWebView2.contextMenuPoint = new Point(i2, i3);
/* 335 */           LinearLayout linearLayout3 = inAppWebView2.floatingContextMenu;
/* 337 */           if (linearLayout3 == null) {
/* 374 */               return actionMode3;
                    }
/* 348 */           linearLayout3.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.14
                        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                        public void onGlobalLayout() {
/* 3 */                     LinearLayout linearLayout4 = InAppWebView.this.floatingContextMenu;
/* 5 */                     if (linearLayout4 != null) {
/* 11 */                        linearLayout4.getViewTreeObserver().removeOnGlobalLayoutListener(this);
/* 20 */                        boolean javaScriptEnabled = InAppWebView.this.getSettings().getJavaScriptEnabled();
/* 24 */                        InAppWebView inAppWebView3 = InAppWebView.this;
/* 26 */                        if (javaScriptEnabled) {
/* 28 */                            inAppWebView3.onScrollStopped();
                                } else {
/* 36 */                            inAppWebView3.onFloatingActionGlobalLayout(i2, i3);
                                }
                            }
                        }
                    });
/* 359 */           inAppWebView2.addView(inAppWebView2.floatingContextMenu, new AbsoluteLayout.LayoutParams(-2, -2, i2, i3));
/* 362 */           if (z) {
/* 364 */               inAppWebView2.sendOnCreateContextMenuEvent();
                    }
/* 367 */           Runnable runnable = inAppWebView2.checkContextMenuShouldBeClosedTask;
/* 369 */           if (runnable == null) {
/* 374 */               return actionMode3;
                    }
/* 371 */           runnable.run();
/* 374 */           return actionMode3;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
                public Map<String, Object> requestFocusNodeHref() {
/* 3 */             Message messageObtainMessage = mHandler.obtainMessage();
/* 7 */             requestFocusNodeHref(messageObtainMessage);
/* 10 */            Bundle bundlePeekData = messageObtainMessage.peekData();
/* 16 */            HashMap map = new HashMap();
/* 25 */            map.put("src", bundlePeekData.getString("src"));
/* 34 */            map.put("url", bundlePeekData.getString("url"));
/* 43 */            map.put("title", bundlePeekData.getString("title"));
/* 46 */            return map;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
                public Map<String, Object> requestImageRef() {
/* 3 */             Message messageObtainMessage = mHandler.obtainMessage();
/* 7 */             requestImageRef(messageObtainMessage);
/* 10 */            Bundle bundlePeekData = messageObtainMessage.peekData();
/* 16 */            HashMap map = new HashMap();
/* 25 */            map.put("url", bundlePeekData.getString("url"));
/* 28 */            return map;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
                public void scrollBy(Integer num, Integer num2, Boolean bool) {
/* 5 */             if (!bool.booleanValue()) {
/* 71 */                scrollBy(num.intValue(), num2.intValue());
/* 74 */                return;
                    }
/* 59 */            ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofInt("scrollX", num.intValue() + getScrollX()), PropertyValuesHolder.ofInt("scrollY", num2.intValue() + getScrollY())).setDuration(300L).start();
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
                public void scrollTo(Integer num, Integer num2, Boolean bool) {
/* 5 */             if (bool.booleanValue()) {
/* 49 */                ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofInt("scrollX", num.intValue()), PropertyValuesHolder.ofInt("scrollY", num2.intValue())).setDuration(300L).start();
                    } else {
/* 61 */                scrollTo(num.intValue(), num2.intValue());
                    }
                }

                public void setCacheEnabled(boolean z) {
/* 1 */             WebSettings settings = getSettings();
/* 7 */             if (!z) {
/* 47 */                settings.setCacheMode(2);
/* 56 */                Util.invokeMethodIfExists(settings, "setAppCacheEnabled", Boolean.FALSE);
/* 59 */                return;
                    }
/* 9 */             Context context = getContext();
/* 13 */            if (context != null) {
/* 29 */                Util.invokeMethodIfExists(settings, "setAppCachePath", context.getCacheDir().getAbsolutePath());
/* 33 */                settings.setCacheMode(-1);
/* 42 */                Util.invokeMethodIfExists(settings, "setAppCacheEnabled", Boolean.TRUE);
                    }
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
                public void setChannelDelegate(WebViewChannelDelegate webViewChannelDelegate) {
/* 1 */             this.channelDelegate = webViewChannelDelegate;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
                public void setContextMenu(Map<String, Object> map) {
/* 1 */             this.contextMenu = map;
                }

                public void setDesktopMode(boolean z) {
/* 1 */             WebSettings settings = getSettings();
/* 40 */            settings.setUserAgentString(z ? settings.getUserAgentString().replace("Mobile", "eliboM").replace("Android", "diordnA") : settings.getUserAgentString().replace("eliboM", "Mobile").replace("diordnA", "Android"));
/* 43 */            settings.setUseWideViewPort(z);
/* 46 */            settings.setLoadWithOverviewMode(z);
/* 49 */            settings.setSupportZoom(z);
/* 52 */            settings.setBuiltInZoomControls(z);
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
                public void setInAppBrowserDelegate(InAppBrowserDelegate inAppBrowserDelegate) {
/* 1 */             this.inAppBrowserDelegate = inAppBrowserDelegate;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
                public void setInFullscreen(boolean z) {
/* 1 */             this.inFullscreen = z;
                }

                public void setIncognito(boolean z) {
/* 1 */             WebSettings settings = getSettings();
/* 8 */             if (!z) {
/* 49 */                settings.setCacheMode(-1);
/* 58 */                Util.invokeMethodIfExists(settings, "setAppCacheEnabled", Boolean.TRUE);
/* 61 */                settings.setSavePassword(true);
/* 64 */                settings.setSaveFormData(true);
/* 67 */                return;
                    }
/* 15 */            CookieManager.getInstance().removeAllCookies(null);
/* 19 */            settings.setCacheMode(2);
/* 28 */            Util.invokeMethodIfExists(settings, "setAppCacheEnabled", Boolean.FALSE);
/* 31 */            clearHistory();
/* 34 */            clearCache(true);
/* 37 */            clearFormData();
/* 41 */            settings.setSavePassword(false);
/* 44 */            settings.setSaveFormData(false);
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
                public void setPlugin(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
/* 1 */             this.plugin = inAppWebViewFlutterPlugin;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
                public void setSettings(InAppWebViewSettings inAppWebViewSettings, HashMap<String, Object> map) {
                    Map<String, Object> map2;
                    Integer num;
                    Integer num2;
                    String str;
                    Integer num3;
                    String str2;
                    Integer num4;
/* 1 */             WebSettings settings = getSettings();
/* 11 */            if (map.get("javaScriptEnabled") != null) {
/* 15 */                Boolean bool = this.customSettings.javaScriptEnabled;
/* 17 */                Boolean bool2 = inAppWebViewSettings.javaScriptEnabled;
/* 19 */                if (bool != bool2) {
/* 25 */                    settings.setJavaScriptEnabled(bool2.booleanValue());
                        }
                    }
/* 34 */            if (map.get("useShouldInterceptAjaxRequest") != null) {
/* 38 */                Boolean bool3 = this.customSettings.useShouldInterceptAjaxRequest;
/* 40 */                Boolean bool4 = inAppWebViewSettings.useShouldInterceptAjaxRequest;
/* 42 */                if (bool3 != bool4) {
/* 52 */                    enablePluginScriptAtRuntime(InterceptAjaxRequestJS.FLAG_VARIABLE_FOR_SHOULD_INTERCEPT_AJAX_REQUEST_JS_SOURCE, bool4.booleanValue(), InterceptAjaxRequestJS.INTERCEPT_AJAX_REQUEST_JS_PLUGIN_SCRIPT);
                        }
                    }
/* 61 */            if (map.get("interceptOnlyAsyncAjaxRequests") != null) {
/* 65 */                Boolean bool5 = this.customSettings.interceptOnlyAsyncAjaxRequests;
/* 67 */                Boolean bool6 = inAppWebViewSettings.interceptOnlyAsyncAjaxRequests;
/* 69 */                if (bool5 != bool6) {
/* 79 */                    enablePluginScriptAtRuntime(InterceptAjaxRequestJS.FLAG_VARIABLE_FOR_INTERCEPT_ONLY_ASYNC_AJAX_REQUESTS_JS_SOURCE, bool6.booleanValue(), this.interceptOnlyAsyncAjaxRequestsPluginScript);
                        }
                    }
/* 88 */            if (map.get("useShouldInterceptFetchRequest") != null) {
/* 92 */                Boolean bool7 = this.customSettings.useShouldInterceptFetchRequest;
/* 94 */                Boolean bool8 = inAppWebViewSettings.useShouldInterceptFetchRequest;
/* 96 */                if (bool7 != bool8) {
/* 106 */                   enablePluginScriptAtRuntime(InterceptFetchRequestJS.FLAG_VARIABLE_FOR_SHOULD_INTERCEPT_FETCH_REQUEST_JS_SOURCE, bool8.booleanValue(), InterceptFetchRequestJS.INTERCEPT_FETCH_REQUEST_JS_PLUGIN_SCRIPT);
                        }
                    }
/* 115 */           if (map.get("useOnLoadResource") != null) {
/* 119 */               Boolean bool9 = this.customSettings.useOnLoadResource;
/* 121 */               Boolean bool10 = inAppWebViewSettings.useOnLoadResource;
/* 123 */               if (bool9 != bool10) {
/* 133 */                   enablePluginScriptAtRuntime(OnLoadResourceJS.FLAG_VARIABLE_FOR_ON_LOAD_RESOURCE_JS_SOURCE, bool10.booleanValue(), OnLoadResourceJS.ON_LOAD_RESOURCE_JS_PLUGIN_SCRIPT);
                        }
                    }
/* 142 */           if (map.get("javaScriptCanOpenWindowsAutomatically") != null) {
/* 146 */               Boolean bool11 = this.customSettings.javaScriptCanOpenWindowsAutomatically;
/* 148 */               Boolean bool12 = inAppWebViewSettings.javaScriptCanOpenWindowsAutomatically;
/* 150 */               if (bool11 != bool12) {
/* 156 */                   settings.setJavaScriptCanOpenWindowsAutomatically(bool12.booleanValue());
                        }
                    }
/* 165 */           if (map.get("builtInZoomControls") != null) {
/* 169 */               Boolean bool13 = this.customSettings.builtInZoomControls;
/* 171 */               Boolean bool14 = inAppWebViewSettings.builtInZoomControls;
/* 173 */               if (bool13 != bool14) {
/* 179 */                   settings.setBuiltInZoomControls(bool14.booleanValue());
                        }
                    }
/* 188 */           if (map.get("displayZoomControls") != null) {
/* 192 */               Boolean bool15 = this.customSettings.displayZoomControls;
/* 194 */               Boolean bool16 = inAppWebViewSettings.displayZoomControls;
/* 196 */               if (bool15 != bool16) {
/* 202 */                   settings.setDisplayZoomControls(bool16.booleanValue());
                        }
                    }
/* 213 */           if (map.get("safeBrowsingEnabled") != null && this.customSettings.safeBrowsingEnabled != inAppWebViewSettings.safeBrowsingEnabled) {
/* 229 */               if (xe2.m9786x("SAFE_BROWSING_ENABLE")) {
/* 237 */                   p63.m7344c(settings, inAppWebViewSettings.safeBrowsingEnabled.booleanValue());
                        } else if (Build.VERSION.SDK_INT >= 26) {
/* 1 */                     settings.setSafeBrowsingEnabled(inAppWebViewSettings.safeBrowsingEnabled.booleanValue());
                        }
                    }
/* 260 */           if (map.get("mediaPlaybackRequiresUserGesture") != null) {
/* 264 */               Boolean bool17 = this.customSettings.mediaPlaybackRequiresUserGesture;
/* 266 */               Boolean bool18 = inAppWebViewSettings.mediaPlaybackRequiresUserGesture;
/* 268 */               if (bool17 != bool18) {
/* 274 */                   settings.setMediaPlaybackRequiresUserGesture(bool18.booleanValue());
                        }
                    }
/* 283 */           if (map.get("databaseEnabled") != null) {
/* 287 */               Boolean bool19 = this.customSettings.databaseEnabled;
/* 289 */               Boolean bool20 = inAppWebViewSettings.databaseEnabled;
/* 291 */               if (bool19 != bool20) {
/* 297 */                   settings.setDatabaseEnabled(bool20.booleanValue());
                        }
                    }
/* 306 */           if (map.get("domStorageEnabled") != null) {
/* 310 */               Boolean bool21 = this.customSettings.domStorageEnabled;
/* 312 */               Boolean bool22 = inAppWebViewSettings.domStorageEnabled;
/* 314 */               if (bool21 != bool22) {
/* 320 */                   settings.setDomStorageEnabled(bool22.booleanValue());
                        }
                    }
/* 329 */           if (map.get("userAgent") != null && !this.customSettings.userAgent.equals(inAppWebViewSettings.userAgent) && !inAppWebViewSettings.userAgent.isEmpty()) {
/* 353 */               settings.setUserAgentString(inAppWebViewSettings.userAgent);
                    }
/* 362 */           if (map.get("applicationNameForUserAgent") != null && !this.customSettings.applicationNameForUserAgent.equals(inAppWebViewSettings.applicationNameForUserAgent) && !inAppWebViewSettings.applicationNameForUserAgent.isEmpty()) {
/* 384 */               String str3 = inAppWebViewSettings.userAgent;
/* 407 */               StringBuilder sbM3794t = fm0.m3794t((str3 == null || str3.isEmpty()) ? WebSettings.getDefaultUserAgent(getContext()) : inAppWebViewSettings.userAgent, " ");
/* 415 */               sbM3794t.append(this.customSettings.applicationNameForUserAgent);
/* 422 */               settings.setUserAgentString(sbM3794t.toString());
                    }
/* 431 */           if (map.get("clearCache") != null && inAppWebViewSettings.clearCache.booleanValue()) {
/* 441 */               clearAllCache();
                    } else if (map.get("clearSessionCache") != null && inAppWebViewSettings.clearSessionCache.booleanValue()) {
/* 465 */               CookieManager.getInstance().removeSessionCookie();
                    }
/* 474 */           if (map.get("thirdPartyCookiesEnabled") != null && this.customSettings.thirdPartyCookiesEnabled != inAppWebViewSettings.thirdPartyCookiesEnabled) {
/* 494 */               CookieManager.getInstance().setAcceptThirdPartyCookies(this, inAppWebViewSettings.thirdPartyCookiesEnabled.booleanValue());
                    }
/* 503 */           if (map.get("useWideViewPort") != null) {
/* 507 */               Boolean bool23 = this.customSettings.useWideViewPort;
/* 509 */               Boolean bool24 = inAppWebViewSettings.useWideViewPort;
/* 511 */               if (bool23 != bool24) {
/* 517 */                   settings.setUseWideViewPort(bool24.booleanValue());
                        }
                    }
/* 526 */           if (map.get("supportZoom") != null) {
/* 530 */               Boolean bool25 = this.customSettings.supportZoom;
/* 532 */               Boolean bool26 = inAppWebViewSettings.supportZoom;
/* 534 */               if (bool25 != bool26) {
/* 540 */                   settings.setSupportZoom(bool26.booleanValue());
                        }
                    }
/* 549 */           if (map.get("textZoom") != null && !this.customSettings.textZoom.equals(inAppWebViewSettings.textZoom)) {
/* 569 */               settings.setTextZoom(inAppWebViewSettings.textZoom.intValue());
                    }
/* 578 */           if (map.get("verticalScrollBarEnabled") != null) {
/* 582 */               Boolean bool27 = this.customSettings.verticalScrollBarEnabled;
/* 584 */               Boolean bool28 = inAppWebViewSettings.verticalScrollBarEnabled;
/* 586 */               if (bool27 != bool28) {
/* 592 */                   setVerticalScrollBarEnabled(bool28.booleanValue());
                        }
                    }
/* 601 */           if (map.get("horizontalScrollBarEnabled") != null) {
/* 605 */               Boolean bool29 = this.customSettings.horizontalScrollBarEnabled;
/* 607 */               Boolean bool30 = inAppWebViewSettings.horizontalScrollBarEnabled;
/* 609 */               if (bool29 != bool30) {
/* 615 */                   setHorizontalScrollBarEnabled(bool30.booleanValue());
                        }
                    }
/* 624 */           boolean z = false;
/* 625 */           if (map.get("transparentBackground") != null) {
/* 629 */               Boolean bool31 = this.customSettings.transparentBackground;
/* 631 */               Boolean bool32 = inAppWebViewSettings.transparentBackground;
/* 633 */               if (bool31 != bool32) {
/* 639 */                   if (bool32.booleanValue()) {
/* 641 */                       setBackgroundColor(0);
                            } else {
/* 651 */                       setBackgroundColor(Color.parseColor("#FFFFFF"));
                            }
                        }
                    }
/* 654 */           int i = Build.VERSION.SDK_INT;
/* 662 */           if (map.get("mixedContentMode") != null && ((num4 = this.customSettings.mixedContentMode) == null || !num4.equals(inAppWebViewSettings.mixedContentMode))) {
/* 684 */               settings.setMixedContentMode(inAppWebViewSettings.mixedContentMode.intValue());
                    }
/* 693 */           if (map.get("supportMultipleWindows") != null) {
/* 697 */               Boolean bool33 = this.customSettings.supportMultipleWindows;
/* 699 */               Boolean bool34 = inAppWebViewSettings.supportMultipleWindows;
/* 701 */               if (bool33 != bool34) {
/* 707 */                   settings.setSupportMultipleWindows(bool34.booleanValue());
                        }
                    }
/* 717 */           if (map.get("useOnDownloadStart") != null) {
/* 721 */               Boolean bool35 = this.customSettings.useOnDownloadStart;
/* 723 */               Boolean bool36 = inAppWebViewSettings.useOnDownloadStart;
/* 725 */               if (bool35 != bool36) {
/* 731 */                   if (bool36.booleanValue()) {
/* 738 */                       setDownloadListener(new DownloadStartListener());
                            } else {
/* 742 */                       setDownloadListener(null);
                            }
                        }
                    }
/* 751 */           if (map.get("allowContentAccess") != null) {
/* 755 */               Boolean bool37 = this.customSettings.allowContentAccess;
/* 757 */               Boolean bool38 = inAppWebViewSettings.allowContentAccess;
/* 759 */               if (bool37 != bool38) {
/* 765 */                   settings.setAllowContentAccess(bool38.booleanValue());
                        }
                    }
/* 774 */           if (map.get("allowFileAccess") != null) {
/* 778 */               Boolean bool39 = this.customSettings.allowFileAccess;
/* 780 */               Boolean bool40 = inAppWebViewSettings.allowFileAccess;
/* 782 */               if (bool39 != bool40) {
/* 788 */                   settings.setAllowFileAccess(bool40.booleanValue());
                        }
                    }
/* 797 */           if (map.get("allowFileAccessFromFileURLs") != null) {
/* 801 */               Boolean bool41 = this.customSettings.allowFileAccessFromFileURLs;
/* 803 */               Boolean bool42 = inAppWebViewSettings.allowFileAccessFromFileURLs;
/* 805 */               if (bool41 != bool42) {
/* 811 */                   settings.setAllowFileAccessFromFileURLs(bool42.booleanValue());
                        }
                    }
/* 820 */           if (map.get("allowUniversalAccessFromFileURLs") != null) {
/* 824 */               Boolean bool43 = this.customSettings.allowUniversalAccessFromFileURLs;
/* 826 */               Boolean bool44 = inAppWebViewSettings.allowUniversalAccessFromFileURLs;
/* 828 */               if (bool43 != bool44) {
/* 834 */                   settings.setAllowUniversalAccessFromFileURLs(bool44.booleanValue());
                        }
                    }
/* 843 */           if (map.get("cacheEnabled") != null) {
/* 847 */               Boolean bool45 = this.customSettings.cacheEnabled;
/* 849 */               Boolean bool46 = inAppWebViewSettings.cacheEnabled;
/* 851 */               if (bool45 != bool46) {
/* 857 */                   setCacheEnabled(bool46.booleanValue());
                        }
                    }
/* 866 */           if (map.get("appCachePath") != null && ((str2 = this.customSettings.appCachePath) == null || !str2.equals(inAppWebViewSettings.appCachePath))) {
/* 890 */               Util.invokeMethodIfExists(settings, "setAppCachePath", inAppWebViewSettings.appCachePath);
                    }
/* 899 */           if (map.get("blockNetworkImage") != null) {
/* 903 */               Boolean bool47 = this.customSettings.blockNetworkImage;
/* 905 */               Boolean bool48 = inAppWebViewSettings.blockNetworkImage;
/* 907 */               if (bool47 != bool48) {
/* 913 */                   settings.setBlockNetworkImage(bool48.booleanValue());
                        }
                    }
/* 922 */           if (map.get("blockNetworkLoads") != null) {
/* 926 */               Boolean bool49 = this.customSettings.blockNetworkLoads;
/* 928 */               Boolean bool50 = inAppWebViewSettings.blockNetworkLoads;
/* 930 */               if (bool49 != bool50) {
/* 936 */                   settings.setBlockNetworkLoads(bool50.booleanValue());
                        }
                    }
/* 945 */           if (map.get("cacheMode") != null && !this.customSettings.cacheMode.equals(inAppWebViewSettings.cacheMode)) {
/* 965 */               settings.setCacheMode(inAppWebViewSettings.cacheMode.intValue());
                    }
/* 974 */           if (map.get("cursiveFontFamily") != null && !this.customSettings.cursiveFontFamily.equals(inAppWebViewSettings.cursiveFontFamily)) {
/* 990 */               settings.setCursiveFontFamily(inAppWebViewSettings.cursiveFontFamily);
                    }
/* 999 */           if (map.get("defaultFixedFontSize") != null && !this.customSettings.defaultFixedFontSize.equals(inAppWebViewSettings.defaultFixedFontSize)) {
/* 1019 */              settings.setDefaultFixedFontSize(inAppWebViewSettings.defaultFixedFontSize.intValue());
                    }
/* 1028 */          if (map.get("defaultFontSize") != null && !this.customSettings.defaultFontSize.equals(inAppWebViewSettings.defaultFontSize)) {
/* 1048 */              settings.setDefaultFontSize(inAppWebViewSettings.defaultFontSize.intValue());
                    }
/* 1057 */          if (map.get("defaultTextEncodingName") != null && !this.customSettings.defaultTextEncodingName.equals(inAppWebViewSettings.defaultTextEncodingName)) {
/* 1073 */              settings.setDefaultTextEncodingName(inAppWebViewSettings.defaultTextEncodingName);
                    }
/* 1082 */          if (map.get("disabledActionModeMenuItems") != null && ((num3 = this.customSettings.disabledActionModeMenuItems) == null || !num3.equals(inAppWebViewSettings.disabledActionModeMenuItems))) {
/* 1104 */              if (xe2.m9786x("DISABLED_ACTION_MODE_MENU_ITEMS")) {
/* 1108 */                  int iIntValue = inAppWebViewSettings.disabledActionModeMenuItems.intValue();
/* 1114 */                  b73.f2302c.getClass();
/* 1117 */                  AbstractC2062p9.m7368o(settings, iIntValue);
                        } else {
/* 1127 */                  settings.setDisabledActionModeMenuItems(inAppWebViewSettings.disabledActionModeMenuItems.intValue());
                        }
                    }
/* 1136 */          if (map.get("fantasyFontFamily") != null && !this.customSettings.fantasyFontFamily.equals(inAppWebViewSettings.fantasyFontFamily)) {
/* 1152 */              settings.setFantasyFontFamily(inAppWebViewSettings.fantasyFontFamily);
                    }
/* 1161 */          if (map.get("fixedFontFamily") != null && !this.customSettings.fixedFontFamily.equals(inAppWebViewSettings.fixedFontFamily)) {
/* 1177 */              settings.setFixedFontFamily(inAppWebViewSettings.fixedFontFamily);
                    }
/* 1188 */          if (map.get("forceDark") != null && !this.customSettings.forceDark.equals(inAppWebViewSettings.forceDark)) {
/* 1208 */              if (xe2.m9786x("FORCE_DARK")) {
/* 1216 */                  p63.m7343b(settings, inAppWebViewSettings.forceDark.intValue());
                        } else if (i >= 29) {
/* 1 */                     settings.setForceDark(inAppWebViewSettings.forceDark.intValue());
                        }
                    }
/* 1237 */          if (map.get("forceDarkStrategy") != null && !this.customSettings.forceDarkStrategy.equals(inAppWebViewSettings.forceDarkStrategy) && xe2.m9786x("FORCE_DARK_STRATEGY")) {
/* 1261 */              int iIntValue2 = inAppWebViewSettings.forceDarkStrategy.intValue();
/* 1271 */              if (!b73.f2292H.mo97b()) {
/* 1289 */                  throw b73.m1295a();
                        }
/* 1281 */              ((WebSettingsBoundaryInterface) p63.m7342a(settings).f7853b).setForceDarkBehavior(iIntValue2);
                    }
/* 1296 */          if (map.get("geolocationEnabled") != null) {
/* 1300 */              Boolean bool51 = this.customSettings.geolocationEnabled;
/* 1302 */              Boolean bool52 = inAppWebViewSettings.geolocationEnabled;
/* 1304 */              if (bool51 != bool52) {
/* 1310 */                  settings.setGeolocationEnabled(bool52.booleanValue());
                        }
                    }
/* 1319 */          if (map.get("layoutAlgorithm") != null) {
/* 1323 */              WebSettings.LayoutAlgorithm layoutAlgorithm = this.customSettings.layoutAlgorithm;
/* 1325 */              WebSettings.LayoutAlgorithm layoutAlgorithm2 = inAppWebViewSettings.layoutAlgorithm;
/* 1327 */              if (layoutAlgorithm != layoutAlgorithm2) {
/* 1331 */                  boolean zEquals = layoutAlgorithm2.equals(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);
/* 1335 */                  WebSettings.LayoutAlgorithm layoutAlgorithm3 = inAppWebViewSettings.layoutAlgorithm;
/* 1337 */                  if (zEquals) {
/* 1339 */                      settings.setLayoutAlgorithm(layoutAlgorithm3);
                            } else {
/* 1343 */                      settings.setLayoutAlgorithm(layoutAlgorithm3);
                            }
                        }
                    }
/* 1352 */          if (map.get("loadWithOverviewMode") != null) {
/* 1356 */              Boolean bool53 = this.customSettings.loadWithOverviewMode;
/* 1358 */              Boolean bool54 = inAppWebViewSettings.loadWithOverviewMode;
/* 1360 */              if (bool53 != bool54) {
/* 1366 */                  settings.setLoadWithOverviewMode(bool54.booleanValue());
                        }
                    }
/* 1375 */          if (map.get("loadsImagesAutomatically") != null) {
/* 1379 */              Boolean bool55 = this.customSettings.loadsImagesAutomatically;
/* 1381 */              Boolean bool56 = inAppWebViewSettings.loadsImagesAutomatically;
/* 1383 */              if (bool55 != bool56) {
/* 1389 */                  settings.setLoadsImagesAutomatically(bool56.booleanValue());
                        }
                    }
/* 1398 */          if (map.get("minimumFontSize") != null && !this.customSettings.minimumFontSize.equals(inAppWebViewSettings.minimumFontSize)) {
/* 1418 */              settings.setMinimumFontSize(inAppWebViewSettings.minimumFontSize.intValue());
                    }
/* 1427 */          if (map.get("minimumLogicalFontSize") != null && !this.customSettings.minimumLogicalFontSize.equals(inAppWebViewSettings.minimumLogicalFontSize)) {
/* 1447 */              settings.setMinimumLogicalFontSize(inAppWebViewSettings.minimumLogicalFontSize.intValue());
                    }
/* 1456 */          if (map.get("initialScale") != null && !this.customSettings.initialScale.equals(inAppWebViewSettings.initialScale)) {
/* 1476 */              setInitialScale(inAppWebViewSettings.initialScale.intValue());
                    }
/* 1485 */          if (map.get("needInitialFocus") != null) {
/* 1489 */              Boolean bool57 = this.customSettings.needInitialFocus;
/* 1491 */              Boolean bool58 = inAppWebViewSettings.needInitialFocus;
/* 1493 */              if (bool57 != bool58) {
/* 1499 */                  settings.setNeedInitialFocus(bool58.booleanValue());
                        }
                    }
/* 1508 */          if (map.get("offscreenPreRaster") != null && this.customSettings.offscreenPreRaster != inAppWebViewSettings.offscreenPreRaster) {
/* 1520 */              boolean zM9786x = xe2.m9786x("OFF_SCREEN_PRERASTER");
/* 1524 */              Boolean bool59 = inAppWebViewSettings.offscreenPreRaster;
/* 1526 */              if (zM9786x) {
/* 1528 */                  boolean zBooleanValue = bool59.booleanValue();
/* 1534 */                  b73.f2300a.getClass();
/* 1537 */                  AbstractC1993o9.m7124k(settings, zBooleanValue);
                        } else {
/* 1545 */                  settings.setOffscreenPreRaster(bool59.booleanValue());
                        }
                    }
/* 1554 */          if (map.get("sansSerifFontFamily") != null && !this.customSettings.sansSerifFontFamily.equals(inAppWebViewSettings.sansSerifFontFamily)) {
/* 1570 */              settings.setSansSerifFontFamily(inAppWebViewSettings.sansSerifFontFamily);
                    }
/* 1579 */          if (map.get("serifFontFamily") != null && !this.customSettings.serifFontFamily.equals(inAppWebViewSettings.serifFontFamily)) {
/* 1595 */              settings.setSerifFontFamily(inAppWebViewSettings.serifFontFamily);
                    }
/* 1604 */          if (map.get("standardFontFamily") != null && !this.customSettings.standardFontFamily.equals(inAppWebViewSettings.standardFontFamily)) {
/* 1620 */              settings.setStandardFontFamily(inAppWebViewSettings.standardFontFamily);
                    }
/* 1631 */          if (map.get("preferredContentMode") != null && !this.customSettings.preferredContentMode.equals(inAppWebViewSettings.preferredContentMode)) {
/* 1661 */              int i2 = C066421.f5339x8be7bf1[PreferredContentModeOptionType.fromValue(inAppWebViewSettings.preferredContentMode.intValue()).ordinal()];
/* 1663 */              if (i2 == 1) {
/* 1675 */                  setDesktopMode(true);
                        } else if (i2 == 2 || i2 == 3) {
/* 1671 */                  setDesktopMode(false);
                        }
                    }
/* 1684 */          if (map.get("saveFormData") != null) {
/* 1688 */              Boolean bool60 = this.customSettings.saveFormData;
/* 1690 */              Boolean bool61 = inAppWebViewSettings.saveFormData;
/* 1692 */              if (bool60 != bool61) {
/* 1698 */                  settings.setSaveFormData(bool61.booleanValue());
                        }
                    }
/* 1707 */          if (map.get("incognito") != null) {
/* 1711 */              Boolean bool62 = this.customSettings.incognito;
/* 1713 */              Boolean bool63 = inAppWebViewSettings.incognito;
/* 1715 */              if (bool62 != bool63) {
/* 1721 */                  setIncognito(bool63.booleanValue());
                        }
                    }
/* 1732 */          if (this.customSettings.useHybridComposition.booleanValue() && map.get("hardwareAcceleration") != null) {
/* 1744 */              Boolean bool64 = this.customSettings.hardwareAcceleration;
/* 1746 */              Boolean bool65 = inAppWebViewSettings.hardwareAcceleration;
/* 1748 */              if (bool64 != bool65) {
/* 1754 */                  if (bool65.booleanValue()) {
/* 1756 */                      setLayerType(2, null);
                            } else {
/* 1760 */                      setLayerType(0, null);
                            }
                        }
                    }
/* 1769 */          if (map.get("regexToCancelSubFramesLoading") != null && ((str = this.customSettings.regexToCancelSubFramesLoading) == null || !str.equals(inAppWebViewSettings.regexToCancelSubFramesLoading))) {
/* 1787 */              if (inAppWebViewSettings.regexToCancelSubFramesLoading == null) {
/* 1789 */                  this.regexToCancelSubFramesLoadingCompiled = null;
                        } else {
/* 1800 */                  this.regexToCancelSubFramesLoadingCompiled = Pattern.compile(this.customSettings.regexToCancelSubFramesLoading);
                        }
                    }
/* 1804 */          if (inAppWebViewSettings.contentBlockers != null) {
/* 1812 */              this.contentBlockerHandler.getRuleList().clear();
/* 1825 */              for (Map<String, Map<String, Object>> map3 : inAppWebViewSettings.contentBlockers) {
/* 1868 */                  this.contentBlockerHandler.getRuleList().add(new ContentBlocker(ContentBlockerTrigger.fromMap(map3.get("trigger")), ContentBlockerAction.fromMap(map3.get("action"))));
                        }
                    }
/* 1878 */          if (map.get("scrollBarStyle") != null && !this.customSettings.scrollBarStyle.equals(inAppWebViewSettings.scrollBarStyle)) {
/* 1898 */              setScrollBarStyle(inAppWebViewSettings.scrollBarStyle.intValue());
                    }
/* 1907 */          if (map.get("scrollBarDefaultDelayBeforeFade") != null && ((num2 = this.customSettings.scrollBarDefaultDelayBeforeFade) == null || !num2.equals(inAppWebViewSettings.scrollBarDefaultDelayBeforeFade))) {
/* 1929 */              setScrollBarDefaultDelayBeforeFade(inAppWebViewSettings.scrollBarDefaultDelayBeforeFade.intValue());
                    }
/* 1938 */          if (map.get("scrollbarFadingEnabled") != null && !this.customSettings.scrollbarFadingEnabled.equals(inAppWebViewSettings.scrollbarFadingEnabled)) {
/* 1958 */              setScrollbarFadingEnabled(inAppWebViewSettings.scrollbarFadingEnabled.booleanValue());
                    }
/* 1967 */          if (map.get("scrollBarFadeDuration") != null && ((num = this.customSettings.scrollBarFadeDuration) == null || !num.equals(inAppWebViewSettings.scrollBarFadeDuration))) {
/* 1989 */              setScrollBarFadeDuration(inAppWebViewSettings.scrollBarFadeDuration.intValue());
                    }
/* 1998 */          if (map.get("verticalScrollbarPosition") != null && !this.customSettings.verticalScrollbarPosition.equals(inAppWebViewSettings.verticalScrollbarPosition)) {
/* 2018 */              setVerticalScrollbarPosition(inAppWebViewSettings.verticalScrollbarPosition.intValue());
                    }
/* 2027 */          if (map.get("disableVerticalScroll") != null) {
/* 2031 */              Boolean bool66 = this.customSettings.disableVerticalScroll;
/* 2033 */              Boolean bool67 = inAppWebViewSettings.disableVerticalScroll;
/* 2035 */              if (bool66 != bool67) {
/* 2054 */                  setVerticalScrollBarEnabled(!bool67.booleanValue() && inAppWebViewSettings.verticalScrollBarEnabled.booleanValue());
                        }
                    }
/* 2063 */          if (map.get("disableHorizontalScroll") != null) {
/* 2067 */              Boolean bool68 = this.customSettings.disableHorizontalScroll;
/* 2069 */              Boolean bool69 = inAppWebViewSettings.disableHorizontalScroll;
/* 2071 */              if (bool68 != bool69) {
/* 2077 */                  if (!bool69.booleanValue() && inAppWebViewSettings.horizontalScrollBarEnabled.booleanValue()) {
/* 2087 */                      z = true;
                            }
/* 2088 */                  setHorizontalScrollBarEnabled(z);
                        }
                    }
/* 2097 */          if (map.get("overScrollMode") != null && !this.customSettings.overScrollMode.equals(inAppWebViewSettings.overScrollMode)) {
/* 2117 */              setOverScrollMode(inAppWebViewSettings.overScrollMode.intValue());
                    }
/* 2126 */          if (map.get("networkAvailable") != null) {
/* 2130 */              Boolean bool70 = this.customSettings.networkAvailable;
/* 2132 */              Boolean bool71 = inAppWebViewSettings.networkAvailable;
/* 2134 */              if (bool70 != bool71) {
/* 2140 */                  setNetworkAvailable(bool71.booleanValue());
                        }
                    }
/* 2149 */          if (map.get("rendererPriorityPolicy") != null && (((map2 = this.customSettings.rendererPriorityPolicy) == null || map2.get("rendererRequestedPriority") != inAppWebViewSettings.rendererPriorityPolicy.get("rendererRequestedPriority") || this.customSettings.rendererPriorityPolicy.get("waivedWhenNotVisible") != inAppWebViewSettings.rendererPriorityPolicy.get("waivedWhenNotVisible")) && Build.VERSION.SDK_INT >= 26)) {
/* 1 */                 setRendererPriorityPolicy(((Integer) inAppWebViewSettings.rendererPriorityPolicy.get("rendererRequestedPriority")).intValue(), ((Boolean) inAppWebViewSettings.rendererPriorityPolicy.get("waivedWhenNotVisible")).booleanValue());
                    }
/* 2220 */          int i3 = Build.VERSION.SDK_INT;
/* 2222 */          if (i3 >= 29) {
/* 2230 */              if (map.get("verticalScrollbarThumbColor") != null && !Util.objEquals(this.customSettings.verticalScrollbarThumbColor, inAppWebViewSettings.verticalScrollbarThumbColor)) {
/* 1 */                     setVerticalScrollbarThumbDrawable(new ColorDrawable(Color.parseColor(inAppWebViewSettings.verticalScrollbarThumbColor)));
                        }
/* 2264 */              if (map.get("verticalScrollbarTrackColor") != null && !Util.objEquals(this.customSettings.verticalScrollbarTrackColor, inAppWebViewSettings.verticalScrollbarTrackColor)) {
/* 1 */                     setVerticalScrollbarTrackDrawable(new ColorDrawable(Color.parseColor(inAppWebViewSettings.verticalScrollbarTrackColor)));
                        }
/* 2298 */              if (map.get("horizontalScrollbarThumbColor") != null && !Util.objEquals(this.customSettings.horizontalScrollbarThumbColor, inAppWebViewSettings.horizontalScrollbarThumbColor)) {
/* 1 */                     setHorizontalScrollbarThumbDrawable(new ColorDrawable(Color.parseColor(inAppWebViewSettings.horizontalScrollbarThumbColor)));
                        }
/* 2332 */              if (map.get("horizontalScrollbarTrackColor") != null && !Util.objEquals(this.customSettings.horizontalScrollbarTrackColor, inAppWebViewSettings.horizontalScrollbarTrackColor)) {
/* 1 */                     setHorizontalScrollbarTrackDrawable(new ColorDrawable(Color.parseColor(inAppWebViewSettings.horizontalScrollbarTrackColor)));
                        }
                    }
/* 2366 */          if (map.get("algorithmicDarkeningAllowed") != null && !Util.objEquals(this.customSettings.algorithmicDarkeningAllowed, inAppWebViewSettings.algorithmicDarkeningAllowed) && xe2.m9786x("ALGORITHMIC_DARKENING") && i3 >= 29) {
/* 2392 */              boolean zBooleanValue2 = inAppWebViewSettings.algorithmicDarkeningAllowed.booleanValue();
/* 2402 */              if (!b73.f2288D.mo97b()) {
/* 2420 */                  throw b73.m1295a();
                        }
/* 2412 */              ((WebSettingsBoundaryInterface) p63.m7342a(settings).f7853b).setAlgorithmicDarkeningAllowed(zBooleanValue2);
                    }
/* 2427 */          if (map.get("enterpriseAuthenticationAppLinkPolicyEnabled") != null && !Util.objEquals(this.customSettings.enterpriseAuthenticationAppLinkPolicyEnabled, inAppWebViewSettings.enterpriseAuthenticationAppLinkPolicyEnabled) && xe2.m9786x("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY")) {
/* 2451 */              boolean zBooleanValue3 = inAppWebViewSettings.enterpriseAuthenticationAppLinkPolicyEnabled.booleanValue();
/* 2461 */              if (!b73.f2297M.mo97b()) {
/* 2479 */                  throw b73.m1295a();
                        }
/* 2471 */              ((WebSettingsBoundaryInterface) p63.m7342a(settings).f7853b).setEnterpriseAuthenticationAppLinkPolicyEnabled(zBooleanValue3);
                    }
/* 2486 */          if (map.get("requestedWithHeaderOriginAllowList") != null && !Util.objEquals(this.customSettings.requestedWithHeaderOriginAllowList, inAppWebViewSettings.requestedWithHeaderOriginAllowList) && xe2.m9786x("REQUESTED_WITH_HEADER_ALLOW_LIST")) {
/* 2508 */              Set<String> set = inAppWebViewSettings.requestedWithHeaderOriginAllowList;
/* 2516 */              if (!b73.f2299O.mo97b()) {
/* 2534 */                  throw b73.m1295a();
                        }
/* 2526 */              ((WebSettingsBoundaryInterface) p63.m7342a(settings).f7853b).setRequestedWithHeaderOriginAllowList(set);
                    }
/* 2537 */          if (this.plugin != null) {
/* 2539 */              WebViewAssetLoaderExt webViewAssetLoaderExt = this.webViewAssetLoaderExt;
/* 2541 */              if (webViewAssetLoaderExt != null) {
/* 2543 */                  webViewAssetLoaderExt.dispose();
                        }
/* 2560 */              this.webViewAssetLoaderExt = WebViewAssetLoaderExt.fromMap(this.customSettings.webViewAssetLoader, this.plugin, getContext());
                    }
/* 2562 */          this.customSettings = inAppWebViewSettings;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
                public void setUserContentController(UserContentController userContentController) {
/* 1 */             this.userContentController = userContentController;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
                public void setWebMessageChannels(Map<String, WebMessageChannel> map) {
/* 1 */             this.webMessageChannels = map;
                }

                @Override // android.view.View
                public ActionMode startActionMode(ActionMode.Callback callback) {
                    Map<String, Object> map;
                    return (this.customSettings.useHybridComposition.booleanValue() && !this.customSettings.disableContextMenu.booleanValue() && ((map = this.contextMenu) == null || map.keySet().size() == 0)) ? super.startActionMode(callback) : rebuildActionMode(super.startActionMode(callback), callback);
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
                public void takeScreenshot(final Map<String, Object> map, final MethodChannel.Result result) {
/* 5 */             final float pixelDensity = Util.getPixelDensity(getContext());
/* 16 */            this.mainLooperHandler.post(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.8
                        @Override // java.lang.Runnable
                        public void run() {
                            int iIntValue;
                            try {
/* 15 */                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(InAppWebView.this.getMeasuredWidth(), InAppWebView.this.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
/* 21 */                        Canvas canvas = new Canvas(bitmapCreateBitmap);
/* 40 */                        canvas.translate(-InAppWebView.this.getScrollX(), -InAppWebView.this.getScrollY());
/* 45 */                        InAppWebView.this.draw(canvas);
/* 50 */                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 53 */                        Bitmap.CompressFormat compressFormatValueOf = Bitmap.CompressFormat.PNG;
/* 55 */                        Map map2 = map;
/* 57 */                        if (map2 != null) {
/* 65 */                            Map map3 = (Map) map2.get("rect");
/* 69 */                            if (map3 != null) {
/* 175 */                               bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, (int) Math.floor((((Double) map3.get("x")).doubleValue() * ((double) pixelDensity)) + 0.5d), (int) Math.floor((((Double) map3.get("y")).doubleValue() * ((double) pixelDensity)) + 0.5d), Math.min(bitmapCreateBitmap.getWidth(), (int) Math.floor((((Double) map3.get("width")).doubleValue() * ((double) pixelDensity)) + 0.5d)), Math.min(bitmapCreateBitmap.getHeight(), (int) Math.floor((((Double) map3.get("height")).doubleValue() * ((double) pixelDensity)) + 0.5d)));
                                    }
/* 187 */                           Double d = (Double) map.get("snapshotWidth");
/* 189 */                           if (d != null) {
/* 204 */                               int iFloor = (int) Math.floor((d.doubleValue() * ((double) pixelDensity)) + 0.5d);
/* 220 */                               bitmapCreateBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, iFloor, (int) (iFloor / (bitmapCreateBitmap.getWidth() / bitmapCreateBitmap.getHeight())), true);
                                    }
                                    try {
/* 234 */                               compressFormatValueOf = Bitmap.CompressFormat.valueOf((String) map.get("compressFormat"));
                                    } catch (IllegalArgumentException unused) {
                                    }
/* 248 */                           iIntValue = ((Integer) map.get("quality")).intValue();
                                } else {
/* 253 */                           iIntValue = 100;
                                }
/* 255 */                       bitmapCreateBitmap.compress(compressFormatValueOf, iIntValue, byteArrayOutputStream);
                                try {
/* 258 */                           byteArrayOutputStream.close();
                                } catch (IOException unused2) {
                                }
/* 261 */                       bitmapCreateBitmap.recycle();
/* 270 */                       result.success(byteArrayOutputStream.toByteArray());
                            } catch (IllegalArgumentException unused3) {
/* 277 */                       result.success(null);
                            }
                        }
                    });
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
/* 10 */        public float getZoomScale() {
/* 11 */            return this.zoomScale;
                }

                @Override // android.view.View
/* 48 */        public ActionMode startActionMode(ActionMode.Callback callback, int i) {
                    Map<String, Object> map;
/* 49 */            if (this.customSettings.useHybridComposition.booleanValue() && !this.customSettings.disableContextMenu.booleanValue() && ((map = this.contextMenu) == null || map.keySet().size() == 0)) {
/* 50 */                return super.startActionMode(callback, i);
                    }
/* 51 */            return rebuildActionMode(super.startActionMode(callback, i), callback);
                }

/* 156 */       public InAppWebView(Context context, AttributeSet attributeSet) {
/* 157 */           super(context, attributeSet);
/* 158 */           this.customSettings = new InAppWebViewSettings();
/* 159 */           this.isLoading = false;
/* 160 */           this.inFullscreen = false;
/* 161 */           this.zoomScale = 1.0f;
/* 162 */           this.contentBlockerHandler = new ContentBlockerHandler();
/* 163 */           this.gestureDetector = null;
/* 164 */           this.floatingContextMenu = null;
/* 165 */           this.contextMenu = null;
/* 166 */           this.mainLooperHandler = new Handler(getWebViewLooper());
/* 167 */           this.newCheckScrollStoppedTask = 100;
/* 168 */           this.newCheckContextMenuShouldBeClosedTaskTask = 100;
/* 169 */           this.userContentController = new UserContentController(this);
/* 170 */           this.callAsyncJavaScriptCallbacks = new HashMap();
/* 171 */           this.evaluateJavaScriptContentWorldCallbacks = new HashMap();
/* 172 */           this.webMessageChannels = new HashMap();
/* 173 */           this.webMessageListeners = new ArrayList();
/* 174 */           this.initialUserOnlyScripts = new ArrayList();
/* 175 */           this.contextMenuPoint = new Point(0, 0);
/* 176 */           this.lastTouch = new Point(0, 0);
                }

/* 176 */       public InAppWebView(Context context, AttributeSet attributeSet, int i) {
/* 177 */           super(context, attributeSet, i);
/* 178 */           this.customSettings = new InAppWebViewSettings();
/* 179 */           this.isLoading = false;
/* 180 */           this.inFullscreen = false;
/* 181 */           this.zoomScale = 1.0f;
/* 182 */           this.contentBlockerHandler = new ContentBlockerHandler();
/* 183 */           this.gestureDetector = null;
/* 184 */           this.floatingContextMenu = null;
/* 185 */           this.contextMenu = null;
/* 186 */           this.mainLooperHandler = new Handler(getWebViewLooper());
/* 187 */           this.newCheckScrollStoppedTask = 100;
/* 188 */           this.newCheckContextMenuShouldBeClosedTaskTask = 100;
/* 189 */           this.userContentController = new UserContentController(this);
/* 190 */           this.callAsyncJavaScriptCallbacks = new HashMap();
/* 191 */           this.evaluateJavaScriptContentWorldCallbacks = new HashMap();
/* 192 */           this.webMessageChannels = new HashMap();
/* 193 */           this.webMessageListeners = new ArrayList();
/* 194 */           this.initialUserOnlyScripts = new ArrayList();
/* 195 */           this.contextMenuPoint = new Point(0, 0);
/* 196 */           this.lastTouch = new Point(0, 0);
                }

/* 196 */       public InAppWebView(Context context) {
/* 197 */           super(context);
/* 198 */           this.customSettings = new InAppWebViewSettings();
/* 199 */           this.isLoading = false;
/* 200 */           this.inFullscreen = false;
/* 201 */           this.zoomScale = 1.0f;
/* 202 */           this.contentBlockerHandler = new ContentBlockerHandler();
/* 203 */           this.gestureDetector = null;
/* 204 */           this.floatingContextMenu = null;
/* 205 */           this.contextMenu = null;
/* 206 */           this.mainLooperHandler = new Handler(getWebViewLooper());
/* 207 */           this.newCheckScrollStoppedTask = 100;
/* 208 */           this.newCheckContextMenuShouldBeClosedTaskTask = 100;
/* 209 */           this.userContentController = new UserContentController(this);
/* 210 */           this.callAsyncJavaScriptCallbacks = new HashMap();
/* 211 */           this.evaluateJavaScriptContentWorldCallbacks = new HashMap();
/* 212 */           this.webMessageChannels = new HashMap();
/* 213 */           this.webMessageListeners = new ArrayList();
/* 214 */           this.initialUserOnlyScripts = new ArrayList();
/* 215 */           this.contextMenuPoint = new Point(0, 0);
/* 216 */           this.lastTouch = new Point(0, 0);
                }
            }
