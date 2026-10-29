            package com.pichillilorenzo.flutter_inappwebview_android.in_app_browser;

            import android.app.Activity;
            import android.content.Intent;
            import android.content.pm.ResolveInfo;
            import android.net.Uri;
            import android.os.Bundle;
            import android.os.Parcelable;
            import android.webkit.MimeTypeMap;
            import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
            import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import io.flutter.plugin.common.MethodCall;
            import io.flutter.plugin.common.MethodChannel;
            import java.io.Serializable;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.UUID;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class InAppBrowserManager extends ChannelDelegateImpl {
                protected static final String LOG_TAG = "InAppBrowserManager";
                public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappbrowser";
                public static final Map<String, InAppBrowserManager> shared = new HashMap();

                /* JADX INFO: renamed from: id */
                public String f5325id;
                public InAppWebViewFlutterPlugin plugin;

                public InAppBrowserManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
/* 10 */            super(new MethodChannel(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
/* 17 */            String string = UUID.randomUUID().toString();
/* 21 */            this.f5325id = string;
/* 23 */            this.plugin = inAppWebViewFlutterPlugin;
/* 27 */            shared.put(string, this);
                }

                public static String getMimeType(String str) {
/* 1 */             String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
/* 5 */             if (fileExtensionFromUrl != null) {
/* 11 */                return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
                    }
/* 16 */            return null;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
                public void dispose() {
/* 1 */             super.dispose();
/* 8 */             shared.remove(this.f5325id);
/* 12 */            this.plugin = null;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
                public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                    Activity activity;
/* 1 */             String str = methodCall.method;
/* 3 */             str.getClass();
/* 12 */            if (str.equals("openWithSystemBrowser")) {
/* 55 */                InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
/* 57 */                if (inAppWebViewFlutterPlugin == null || inAppWebViewFlutterPlugin.activity == null) {
/* 81 */                    result.success(Boolean.FALSE);
/* 84 */                    return;
                        } else {
/* 75 */                    openWithSystemBrowser(this.plugin.activity, (String) methodCall.argument("url"), result);
/* 78 */                    return;
                        }
                    }
/* 20 */            if (!str.equals("open")) {
/* 22 */                result.notImplemented();
/* 25 */                return;
                    }
/* 26 */            InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin2 = this.plugin;
/* 28 */            if (inAppWebViewFlutterPlugin2 == null || (activity = inAppWebViewFlutterPlugin2.activity) == null) {
/* 51 */                result.success(Boolean.FALSE);
                    } else {
/* 40 */                open(activity, (Map) methodCall.arguments());
/* 45 */                result.success(Boolean.TRUE);
                    }
                }

                public void open(Activity activity, Map<String, Object> map) {
/* 11 */            String str = (String) map.get("id");
/* 19 */            Map map2 = (Map) map.get("urlRequest");
/* 27 */            String str2 = (String) map.get("assetFilePath");
/* 35 */            String str3 = (String) map.get(SharedDataContentProvider.BASE_PATH);
/* 43 */            String str4 = (String) map.get("mimeType");
/* 51 */            String str5 = (String) map.get("encoding");
/* 59 */            String str6 = (String) map.get("baseUrl");
/* 67 */            String str7 = (String) map.get("historyUrl");
/* 75 */            Map map3 = (Map) map.get("settings");
/* 83 */            Map map4 = (Map) map.get("contextMenu");
/* 91 */            Integer num = (Integer) map.get("windowId");
/* 101 */           List list = (List) map.get("initialUserScripts");
/* 111 */           Map map5 = (Map) map.get("pullToRefreshSettings");
/* 121 */           List list2 = (List) map.get("menuItems");
/* 127 */           Bundle bundle = new Bundle();
/* 144 */           bundle.putString("fromActivity", activity.getClass().getName());
/* 153 */           bundle.putSerializable("initialUrlRequest", (Serializable) map2);
/* 158 */           bundle.putString("initialFile", str2);
/* 163 */           bundle.putString("initialData", str3);
/* 168 */           bundle.putString("initialMimeType", str4);
/* 173 */           bundle.putString("initialEncoding", str5);
/* 178 */           bundle.putString("initialBaseUrl", str6);
/* 183 */           bundle.putString("initialHistoryUrl", str7);
/* 186 */           bundle.putString("id", str);
/* 193 */           bundle.putString("managerId", this.f5325id);
/* 200 */           bundle.putSerializable("settings", (Serializable) map3);
/* 207 */           bundle.putSerializable("contextMenu", (Serializable) map4);
/* 218 */           bundle.putInt("windowId", num != null ? num.intValue() : -1);
/* 225 */           bundle.putSerializable("initialUserScripts", (Serializable) list);
/* 234 */           bundle.putSerializable("pullToRefreshInitialSettings", (Serializable) map5);
/* 243 */           bundle.putSerializable("menuItems", (Serializable) list2);
/* 248 */           startInAppBrowserActivity(activity, bundle);
                }

                public void openExternalExcludeCurrentApp(Activity activity, Intent intent) {
/* 1 */             String packageName = activity.getPackageName();
/* 10 */            List<ResolveInfo> listQueryIntentActivities = activity.getPackageManager().queryIntentActivities(intent, 0);
/* 16 */            ArrayList arrayList = new ArrayList();
/* 23 */            boolean z = false;
/* 29 */            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
/* 45 */                if (packageName.equals(resolveInfo.activityInfo.packageName)) {
/* 64 */                    z = true;
                        } else {
/* 51 */                    Intent intent2 = (Intent) intent.clone();
/* 57 */                    intent2.setPackage(resolveInfo.activityInfo.packageName);
/* 60 */                    arrayList.add(intent2);
                        }
                    }
/* 66 */            if (!z || arrayList.size() == 0) {
/* 130 */               activity.startActivity(intent);
/* 133 */               return;
                    }
/* 79 */            if (arrayList.size() == 1) {
/* 87 */                activity.startActivity((Intent) arrayList.get(0));
                    } else if (arrayList.size() > 0) {
/* 109 */               Intent intentCreateChooser = Intent.createChooser((Intent) arrayList.remove(arrayList.size() - 1), null);
/* 123 */               intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
/* 126 */               activity.startActivity(intentCreateChooser);
                    }
                }

                public void openWithSystemBrowser(Activity activity, String str, MethodChannel.Result result) {
                    try {
/* 5 */                 Intent intent = new Intent("android.intent.action.VIEW");
/* 8 */                 Uri uri = Uri.parse(str);
/* 22 */                if ("file".equals(uri.getScheme())) {
/* 28 */                    intent.setDataAndType(uri, getMimeType(str));
                        } else {
/* 34 */                    intent.setData(uri);
                        }
/* 43 */                intent.putExtra("com.android.browser.application_id", activity.getPackageName());
/* 46 */                openExternalExcludeCurrentApp(activity, intent);
/* 51 */                result.success(Boolean.TRUE);
                    } catch (RuntimeException e) {
/* 55 */                e.toString();
/* 78 */                result.error(LOG_TAG, str + " cannot be opened!", null);
                    }
                }

                public void startInAppBrowserActivity(Activity activity, Bundle bundle) {
/* 5 */             Intent intent = new Intent(activity, (Class<?>) InAppBrowserActivity.class);
/* 8 */             if (bundle != null) {
/* 10 */                intent.putExtras(bundle);
                    }
/* 13 */            activity.startActivity(intent);
                }
            }
