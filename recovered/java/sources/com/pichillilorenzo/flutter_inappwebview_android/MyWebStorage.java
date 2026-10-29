            package com.pichillilorenzo.flutter_inappwebview_android;

            import android.webkit.ValueCallback;
            import android.webkit.WebStorage;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
            import io.flutter.plugin.common.MethodCall;
            import io.flutter.plugin.common.MethodChannel;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class MyWebStorage extends ChannelDelegateImpl {
                protected static final String LOG_TAG = "MyWebStorage";
                public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_webstoragemanager";
                public static WebStorage webStorageManager;
                public InAppWebViewFlutterPlugin plugin;

                public MyWebStorage(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
/* 10 */            super(new MethodChannel(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
/* 13 */            this.plugin = inAppWebViewFlutterPlugin;
                }

                public static void init() {
/* 3 */             if (webStorageManager == null) {
/* 9 */                 webStorageManager = WebStorage.getInstance();
                    }
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
                public void dispose() {
/* 1 */             super.dispose();
/* 5 */             this.plugin = null;
                }

                public void getOrigins(final MethodChannel.Result result) {
/* 1 */             WebStorage webStorage = webStorageManager;
/* 3 */             if (webStorage == null) {
/* 10 */                result.success(new ArrayList());
                    } else {
/* 19 */                webStorage.getOrigins(new ValueCallback<Map>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.MyWebStorage.1
                            @Override // android.webkit.ValueCallback
                            public void onReceiveValue(Map map) {
/* 3 */                         ArrayList arrayList = new ArrayList();
/* 10 */                        Iterator it = map.keySet().iterator();
/* 18 */                        while (it.hasNext()) {
/* 28 */                            WebStorage.Origin origin = (WebStorage.Origin) map.get(it.next());
/* 32 */                            HashMap map2 = new HashMap();
/* 41 */                            map2.put(FirebaseAnalytics.Param.ORIGIN, origin.getOrigin());
/* 54 */                            map2.put("quota", Long.valueOf(origin.getQuota()));
/* 67 */                            map2.put("usage", Long.valueOf(origin.getUsage()));
/* 70 */                            arrayList.add(map2);
                                }
/* 76 */                        result.success(arrayList);
                            }
                        });
                    }
                }

                public void getQuotaForOrigin(String str, final MethodChannel.Result result) {
/* 1 */             WebStorage webStorage = webStorageManager;
/* 3 */             if (webStorage == null) {
/* 10 */                result.success(0);
                    } else {
/* 19 */                webStorage.getQuotaForOrigin(str, new ValueCallback<Long>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.MyWebStorage.2
                            @Override // android.webkit.ValueCallback
/* 6 */                     public void onReceiveValue(Long l) {
/* 7 */                         result.success(l);
                            }
                        });
                    }
                }

                public void getUsageForOrigin(String str, final MethodChannel.Result result) {
/* 1 */             WebStorage webStorage = webStorageManager;
/* 3 */             if (webStorage == null) {
/* 10 */                result.success(0);
                    } else {
/* 19 */                webStorage.getUsageForOrigin(str, new ValueCallback<Long>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.MyWebStorage.3
                            @Override // android.webkit.ValueCallback
/* 6 */                     public void onReceiveValue(Long l) {
/* 7 */                         result.success(l);
                            }
                        });
                    }
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
                public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
/* 1 */             init();
/* 4 */             String str = methodCall.method;
/* 6 */             str.getClass();
                    switch (str) {
                        case "getQuotaForOrigin":
/* 147 */                   getQuotaForOrigin((String) methodCall.argument(FirebaseAnalytics.Param.ORIGIN), result);
                            break;
                        case "deleteAllData":
/* 122 */                   WebStorage webStorage = webStorageManager;
/* 124 */                   if (webStorage == null) {
/* 137 */                       result.success(Boolean.FALSE);
                                break;
                            } else {
/* 126 */                       webStorage.deleteAllData();
/* 131 */                       result.success(Boolean.TRUE);
                                break;
                            }
                            break;
                        case "deleteOrigin":
/* 97 */                    if (webStorageManager == null) {
/* 118 */                       result.success(Boolean.FALSE);
                                break;
                            } else {
/* 107 */                       webStorageManager.deleteOrigin((String) methodCall.argument(FirebaseAnalytics.Param.ORIGIN));
/* 112 */                       result.success(Boolean.TRUE);
                                break;
                            }
                            break;
                        case "getOrigins":
/* 91 */                    getOrigins(result);
                            break;
                        case "getUsageForOrigin":
/* 87 */                    getUsageForOrigin((String) methodCall.argument(FirebaseAnalytics.Param.ORIGIN), result);
                            break;
                        default:
/* 77 */                    result.notImplemented();
                            break;
                    }
                }
            }
