            package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

            import android.app.Activity;
            import android.content.Intent;
            import android.os.Bundle;
            import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
            import com.pichillilorenzo.flutter_inappwebview_android.Util;
            import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
            import io.flutter.plugin.common.MethodCall;
            import io.flutter.plugin.common.MethodChannel;
            import java.io.Serializable;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.UUID;
            import p000.e30;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ChromeSafariBrowserManager extends ChannelDelegateImpl {
                protected static final String LOG_TAG = "ChromeBrowserManager";
                public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_chromesafaribrowser";
                public static final Map<String, ChromeSafariBrowserManager> shared = new HashMap();
                public final Map<String, ChromeCustomTabsActivity> browsers;

                /* JADX INFO: renamed from: id */
                public String f5320id;
                public InAppWebViewFlutterPlugin plugin;

                public ChromeSafariBrowserManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
/* 10 */            super(new MethodChannel(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
/* 18 */            this.browsers = new HashMap();
/* 24 */            String string = UUID.randomUUID().toString();
/* 28 */            this.f5320id = string;
/* 30 */            this.plugin = inAppWebViewFlutterPlugin;
/* 34 */            shared.put(string, this);
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
                public void dispose() {
/* 1 */             super.dispose();
/* 18 */            for (ChromeCustomTabsActivity chromeCustomTabsActivity : this.browsers.values()) {
/* 26 */                if (chromeCustomTabsActivity != null) {
/* 28 */                    chromeCustomTabsActivity.close();
/* 31 */                    chromeCustomTabsActivity.dispose();
                        }
                    }
/* 37 */            this.browsers.clear();
/* 44 */            shared.remove(this.f5320id);
/* 48 */            this.plugin = null;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
                public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                    Activity activity;
/* 8 */             String str = (String) methodCall.argument("id");
/* 10 */            String str2 = methodCall.method;
/* 12 */            str2.getClass();
                    switch (str2) {
                        case "getMaxToolbarItems":
/* 248 */                   result.success(5);
                            break;
                        case "open":
/* 145 */                   InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
/* 147 */                   if (inAppWebViewFlutterPlugin != null && inAppWebViewFlutterPlugin.activity != null) {
/* 231 */                       open(this.plugin.activity, str, (String) methodCall.argument("url"), (HashMap) methodCall.argument("headers"), (String) methodCall.argument("referrer"), (ArrayList) methodCall.argument("otherLikelyURLs"), (HashMap) methodCall.argument("settings"), (HashMap) methodCall.argument("actionButton"), (HashMap) methodCall.argument("secondaryToolbar"), (List) methodCall.argument("menuItemList"), result);
                                break;
                            } else {
/* 238 */                       result.success(Boolean.FALSE);
                                break;
                            }
                            break;
                        case "getPackageName":
/* 100 */                   InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin2 = this.plugin;
/* 102 */                   if (inAppWebViewFlutterPlugin2 != null && inAppWebViewFlutterPlugin2.activity != null) {
/* 136 */                       result.success(e30.m3300a(this.plugin.activity, (ArrayList) methodCall.argument("packages"), ((Boolean) methodCall.argument("ignoreDefault")).booleanValue()));
                                break;
                            } else {
/* 141 */                       result.success(null);
                                break;
                            }
                            break;
                        case "isAvailable":
/* 74 */                    InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin3 = this.plugin;
/* 76 */                    if (inAppWebViewFlutterPlugin3 != null && (activity = inAppWebViewFlutterPlugin3.activity) != null) {
/* 90 */                        result.success(Boolean.valueOf(CustomTabActivityHelper.isAvailable(activity)));
                                break;
                            } else {
/* 96 */                        result.success(Boolean.FALSE);
                                break;
                            }
                            break;
                        default:
/* 70 */                    result.notImplemented();
                            break;
                    }
                }

                public void open(Activity activity, String str, String str2, HashMap<String, Object> map, String str3, ArrayList<String> arrayList, HashMap<String, Object> map2, HashMap<String, Object> map3, HashMap<String, Object> map4, List<HashMap<String, Object>> list, MethodChannel.Result result) {
                    Class cls;
/* 3 */             Bundle bundle = new Bundle();
/* 8 */             bundle.putString("url", str2);
/* 13 */            bundle.putString("id", str);
/* 20 */            bundle.putString("managerId", this.f5320id);
/* 25 */            bundle.putSerializable("headers", map);
/* 30 */            bundle.putString("referrer", str3);
/* 35 */            bundle.putSerializable("otherLikelyURLs", arrayList);
/* 40 */            bundle.putSerializable("settings", map2);
/* 45 */            bundle.putSerializable("actionButton", map3);
/* 50 */            bundle.putSerializable("secondaryToolbar", map4);
/* 57 */            bundle.putSerializable("menuItemList", (Serializable) list);
/* 60 */            Boolean bool = Boolean.FALSE;
/* 68 */            Boolean bool2 = (Boolean) Util.getOrDefault(map2, "isSingleInstance", bool);
/* 76 */            Boolean bool3 = (Boolean) Util.getOrDefault(map2, "isTrustedWebActivity", bool);
/* 82 */            if (!CustomTabActivityHelper.isAvailable(activity)) {
/* 154 */               result.error(LOG_TAG, "ChromeCustomTabs is not available!", null);
/* 157 */               return;
                    }
/* 90 */            if (bool2.booleanValue()) {
/* 113 */               cls = !bool3.booleanValue() ? ChromeCustomTabsActivitySingleInstance.class : TrustedWebActivitySingleInstance.class;
                    } else {
/* 101 */               cls = !bool3.booleanValue() ? ChromeCustomTabsActivity.class : TrustedWebActivity.class;
                    }
/* 115 */           Intent intent = new Intent(activity, (Class<?>) cls);
/* 118 */           intent.putExtras(bundle);
/* 133 */           if (((Boolean) Util.getOrDefault(map2, "noHistory", bool)).booleanValue()) {
/* 137 */               intent.addFlags(1073741824);
                    }
/* 140 */           activity.startActivity(intent);
/* 145 */           result.success(Boolean.TRUE);
                }
            }
