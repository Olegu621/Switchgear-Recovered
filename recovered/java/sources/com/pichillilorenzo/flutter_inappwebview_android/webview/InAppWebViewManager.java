            package com.pichillilorenzo.flutter_inappwebview_android.webview;

            import android.content.Context;
            import android.content.pm.PackageInfo;
            import android.net.Uri;
            import android.os.Build;
            import android.os.Message;
            import android.view.View;
            import android.view.ViewGroup;
            import android.webkit.ValueCallback;
            import android.webkit.WebSettings;
            import android.webkit.WebView;
            import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
            import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
            import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.FlutterWebView;
            import io.flutter.plugin.common.MethodCall;
            import io.flutter.plugin.common.MethodChannel;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import p000.AbstractC2173s9;
            import p000.C1823k9;
            import p000.b73;
            import p000.d73;
            import p000.xe2;
            import p000.y63;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class InAppWebViewManager extends ChannelDelegateImpl {
                protected static final String LOG_TAG = "InAppWebViewManager";
                public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_manager";
                public final Map<String, FlutterWebView> keepAliveWebViews;
                public InAppWebViewFlutterPlugin plugin;
                public int windowAutoincrementId;
                public final Map<Integer, Message> windowWebViewMessages;

                public InAppWebViewManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
/* 10 */            super(new MethodChannel(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
/* 18 */            this.keepAliveWebViews = new HashMap();
/* 25 */            this.windowWebViewMessages = new HashMap();
/* 28 */            this.windowAutoincrementId = 0;
/* 30 */            this.plugin = inAppWebViewFlutterPlugin;
                }

                public void clearAllCache(Context context, boolean z) {
/* 3 */             WebView webView = new WebView(context);
/* 6 */             webView.clearCache(z);
/* 9 */             webView.destroy();
                }

                public Map<String, Object> convertWebViewPackageToMap(PackageInfo packageInfo) {
/* 3 */             HashMap map = new HashMap();
/* 10 */            map.put("versionName", packageInfo.versionName);
/* 17 */            map.put("packageName", packageInfo.packageName);
/* 20 */            return map;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
                public void dispose() {
/* 1 */             super.dispose();
/* 10 */            Iterator<FlutterWebView> it = this.keepAliveWebViews.values().iterator();
/* 18 */            while (it.hasNext()) {
/* 26 */                String str = it.next().keepAliveId;
/* 28 */                if (str != null) {
/* 30 */                    disposeKeepAlive(str);
                        }
                    }
/* 36 */            this.keepAliveWebViews.clear();
/* 41 */            this.windowWebViewMessages.clear();
/* 45 */            this.plugin = null;
                }

                public void disposeKeepAlive(String str) {
                    ViewGroup viewGroup;
/* 3 */             FlutterWebView flutterWebView = this.keepAliveWebViews.get(str);
/* 10 */            if (flutterWebView != null) {
/* 12 */                flutterWebView.keepAliveId = null;
/* 14 */                View view = flutterWebView.getView();
/* 18 */                if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
/* 28 */                    viewGroup.removeView(view);
                        }
/* 31 */                flutterWebView.dispose();
                    }
/* 40 */            if (this.keepAliveWebViews.containsKey(str)) {
/* 44 */                this.keepAliveWebViews.put(str, null);
                    }
                }

                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
                public void onMethodCall(MethodCall methodCall, final MethodChannel.Result result) {
                    Uri safeBrowsingPrivacyPolicyUrl;
                    Context context;
/* 1 */             String str = methodCall.method;
/* 3 */             str.getClass();
/* 10 */            byte b = -1;
                    switch (str.hashCode()) {
                        case -1496477679:
/* 141 */                   if (str.equals("disableWebView")) {
/* 144 */                       b = 0;
                            }
                            break;
                        case -910403233:
/* 130 */                   if (str.equals("setWebContentsDebuggingEnabled")) {
/* 133 */                       b = 1;
                            }
                            break;
                        case -633518365:
/* 119 */                   if (str.equals("getVariationsHeader")) {
/* 122 */                       b = 2;
                            }
                            break;
                        case -436220260:
/* 108 */                   if (str.equals("clearClientCertPreferences")) {
/* 111 */                       b = 3;
                            }
                            break;
                        case 258673215:
/* 97 */                    if (str.equals("getSafeBrowsingPrivacyPolicyUrl")) {
/* 100 */                       b = 4;
                            }
                            break;
                        case 426229521:
/* 86 */                    if (str.equals("setSafeBrowsingAllowlist")) {
/* 89 */                        b = 5;
                            }
                            break;
                        case 643643439:
/* 75 */                    if (str.equals("getDefaultUserAgent")) {
/* 78 */                        b = 6;
                            }
                            break;
                        case 1033609166:
/* 64 */                    if (str.equals("clearAllCache")) {
/* 67 */                        b = 7;
                            }
                            break;
                        case 1586319888:
/* 50 */                    if (str.equals("getCurrentWebViewPackage")) {
/* 54 */                        b = 8;
                            }
                            break;
                        case 1667434977:
/* 36 */                    if (str.equals("isMultiProcessEnabled")) {
/* 40 */                        b = 9;
                            }
                            break;
                        case 1867011305:
/* 22 */                    if (str.equals("disposeKeepAlive")) {
/* 26 */                        b = 10;
                            }
                            break;
                    }
                    switch (b) {
                        case 0:
/* 497 */                   if (Build.VERSION.SDK_INT >= 28) {
/* 1 */                         WebView.disableWebView();
                            }
/* 504 */                   result.success(Boolean.TRUE);
/* 507 */                   return;
                        case 1:
/* 484 */                   WebView.setWebContentsDebuggingEnabled(((Boolean) methodCall.argument("debuggingEnabled")).booleanValue());
/* 489 */                   result.success(Boolean.TRUE);
/* 492 */                   return;
                        case 2:
/* 437 */                   if (!xe2.m9786x("GET_VARIATIONS_HEADER")) {
/* 468 */                       result.success(null);
/* 471 */                       return;
                            }
/* 439 */                   Uri uri = y63.f19511a;
/* 447 */                   if (!b73.f2296L.mo97b()) {
/* 467 */                       throw b73.m1295a();
                            }
/* 459 */                   result.success(d73.f7038a.getStatics().getVariationsHeader());
/* 462 */                   return;
                        case 3:
/* 427 */                   WebView.clearClientCertPreferences(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager.1
                                @Override // java.lang.Runnable
                                public void run() {
/* 5 */                             result.success(Boolean.TRUE);
                                }
                            });
/* 430 */                   return;
                        case 4:
/* 372 */                   if (!xe2.m9786x("SAFE_BROWSING_PRIVACY_POLICY_URL")) {
/* 418 */                       result.success(null);
/* 421 */                       return;
                            }
/* 374 */                   Uri uri2 = y63.f19511a;
/* 376 */                   C1823k9 c1823k9 = b73.f2306g;
/* 382 */                   if (c1823k9.mo6026a()) {
/* 384 */                       safeBrowsingPrivacyPolicyUrl = AbstractC2173s9.m8436b();
                            } else {
/* 393 */                       if (!c1823k9.mo97b()) {
/* 417 */                           throw b73.m1295a();
                                }
/* 401 */                       safeBrowsingPrivacyPolicyUrl = d73.f7038a.getStatics().getSafeBrowsingPrivacyPolicyUrl();
                            }
/* 409 */                   result.success(safeBrowsingPrivacyPolicyUrl.toString());
/* 412 */                   return;
                        case 5:
/* 308 */                   if (xe2.m9786x("SAFE_BROWSING_ALLOWLIST")) {
/* 326 */                       y63.m10121f(new HashSet((List) methodCall.argument("hosts")), new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager.2
                                    @Override // android.webkit.ValueCallback
/* 6 */                             public void onReceiveValue(Boolean bool) {
/* 7 */                                 result.success(bool);
                                    }
                                });
/* 329 */                       return;
                            }
/* 336 */                   if (!xe2.m9786x("SAFE_BROWSING_WHITELIST")) {
/* 362 */                       result.success(Boolean.FALSE);
/* 365 */                       return;
                            }
/* 342 */                   List list = (List) methodCall.argument("hosts");
/* 346 */                   ValueCallback<Boolean> valueCallback = new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager.3
                                @Override // android.webkit.ValueCallback
/* 6 */                         public void onReceiveValue(Boolean bool) {
/* 7 */                             result.success(bool);
                                }
                            };
/* 349 */                   Uri uri3 = y63.f19511a;
/* 356 */                   y63.m10121f(new HashSet(list), valueCallback);
/* 359 */                   return;
                        case 6:
/* 282 */                   InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
/* 284 */                   if (inAppWebViewFlutterPlugin != null) {
/* 292 */                       result.success(WebSettings.getDefaultUserAgent(inAppWebViewFlutterPlugin.applicationContext));
/* 295 */                       return;
                            } else {
/* 296 */                       result.success(null);
/* 299 */                       return;
                            }
                        case 7:
/* 249 */                   InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin2 = this.plugin;
/* 251 */                   if (inAppWebViewFlutterPlugin2 != null) {
/* 253 */                       Context context2 = inAppWebViewFlutterPlugin2.activity;
/* 255 */                       if (context2 == null) {
/* 257 */                           context2 = inAppWebViewFlutterPlugin2.applicationContext;
                                }
/* 259 */                       if (context2 != null) {
/* 273 */                           clearAllCache(context2, ((Boolean) methodCall.argument("includeDiskFiles")).booleanValue());
                                }
                            }
/* 278 */                   result.success(Boolean.TRUE);
/* 281 */                   return;
                        case 8:
/* 219 */                   InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin3 = this.plugin;
/* 221 */                   if (inAppWebViewFlutterPlugin3 != null) {
/* 223 */                       context = inAppWebViewFlutterPlugin3.activity;
/* 225 */                       if (context == null) {
/* 227 */                           context = inAppWebViewFlutterPlugin3.applicationContext;
                                }
                            } else {
/* 230 */                       context = null;
                            }
/* 238 */                   PackageInfo packageInfoM10117b = context != null ? y63.m10117b(context) : null;
/* 245 */                   result.success(packageInfoM10117b != null ? convertWebViewPackageToMap(packageInfoM10117b) : null);
/* 248 */                   return;
                        case 9:
/* 178 */                   if (!xe2.m9786x("MULTI_PROCESS")) {
/* 215 */                       result.success(Boolean.FALSE);
/* 218 */                       return;
                            }
/* 180 */                   Uri uri4 = y63.f19511a;
/* 188 */                   if (!b73.f2290F.mo97b()) {
/* 212 */                       throw b73.m1295a();
                            }
/* 204 */                   result.success(Boolean.valueOf(d73.f7038a.getStatics().isMultiProcessEnabled()));
/* 207 */                   return;
                        case 10:
/* 159 */                   String str2 = (String) methodCall.argument("keepAliveId");
/* 161 */                   if (str2 != null) {
/* 163 */                       disposeKeepAlive(str2);
                            }
/* 168 */                   result.success(Boolean.TRUE);
/* 171 */                   return;
                        default:
/* 149 */                   result.notImplemented();
/* 152 */                   return;
                    }
                }
            }
