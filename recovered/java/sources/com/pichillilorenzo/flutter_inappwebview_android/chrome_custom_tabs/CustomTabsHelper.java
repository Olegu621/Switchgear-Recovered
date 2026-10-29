            package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

            import android.content.Context;
            import android.content.Intent;
            import android.content.IntentFilter;
            import android.content.pm.PackageManager;
            import android.content.pm.ResolveInfo;
            import android.net.Uri;
            import android.text.TextUtils;
            import java.util.ArrayList;
            import java.util.List;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class CustomTabsHelper {
                static final String BETA_PACKAGE = "com.chrome.beta";
                static final String DEV_PACKAGE = "com.chrome.dev";
                protected static final String EXTRA_CUSTOM_TABS_KEEP_ALIVE = "android.support.customtabs.extra.KEEP_ALIVE";
                static final String LOCAL_PACKAGE = "com.google.android.apps.chrome";
                static final String STABLE_PACKAGE = "com.android.chrome";
                protected static final String TAG = "CustomTabsHelper";
                private static String sPackageNameToUse;

                private CustomTabsHelper() {
                }

                public static void addKeepAliveExtra(Context context, Intent intent) {
/* 22 */            intent.putExtra(EXTRA_CUSTOM_TABS_KEEP_ALIVE, new Intent().setClassName(context.getPackageName(), KeepAliveService.class.getCanonicalName()));
                }

                public static String getPackageNameToUse(Context context) {
/* 1 */             String str = sPackageNameToUse;
/* 3 */             if (str != null) {
/* 5 */                 return str;
                    }
/* 6 */             PackageManager packageManager = context.getPackageManager();
/* 20 */            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
/* 25 */            intent.addCategory("android.intent.category.BROWSABLE");
/* 29 */            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
/* 41 */            String str2 = resolveInfoResolveActivity != null ? resolveInfoResolveActivity.activityInfo.packageName : null;
/* 44 */            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 131072);
/* 50 */            ArrayList arrayList = new ArrayList();
/* 61 */            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
/* 71 */                Intent intent2 = new Intent();
/* 76 */                intent2.setAction("android.support.customtabs.action.CustomTabsService");
/* 83 */                intent2.setPackage(resolveInfo.activityInfo.packageName);
/* 90 */                if (packageManager.resolveService(intent2, 0) != null) {
/* 96 */                    arrayList.add(resolveInfo.activityInfo.packageName);
                        }
                    }
/* 104 */           if (arrayList.isEmpty()) {
/* 106 */               sPackageNameToUse = null;
                    } else if (arrayList.size() == 1) {
/* 122 */               sPackageNameToUse = (String) arrayList.get(0);
                    } else if (!TextUtils.isEmpty(str2) && !hasSpecializedHandlerIntents(context, intent) && arrayList.contains(str2)) {
/* 143 */               sPackageNameToUse = str2;
                    } else if (arrayList.contains(STABLE_PACKAGE)) {
/* 154 */               sPackageNameToUse = STABLE_PACKAGE;
                    } else if (arrayList.contains(BETA_PACKAGE)) {
/* 165 */               sPackageNameToUse = BETA_PACKAGE;
                    } else if (arrayList.contains(DEV_PACKAGE)) {
/* 176 */               sPackageNameToUse = DEV_PACKAGE;
                    } else if (arrayList.contains(LOCAL_PACKAGE)) {
/* 187 */               sPackageNameToUse = LOCAL_PACKAGE;
                    }
/* 189 */           return sPackageNameToUse;
                }

                public static String[] getPackages() {
/* 11 */            return new String[]{HttpUrl.FRAGMENT_ENCODE_SET, STABLE_PACKAGE, BETA_PACKAGE, DEV_PACKAGE, LOCAL_PACKAGE};
                }

                private static boolean hasSpecializedHandlerIntents(Context context, Intent intent) {
                    try {
/* 8 */                 List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
/* 12 */                if (listQueryIntentActivities != null && listQueryIntentActivities.size() != 0) {
/* 29 */                    for (ResolveInfo resolveInfo : listQueryIntentActivities) {
/* 37 */                        IntentFilter intentFilter = resolveInfo.filter;
/* 39 */                        if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo.activityInfo != null) {
/* 60 */                            return true;
                                }
                            }
                        }
                    } catch (RuntimeException unused) {
                    }
/* 1 */             return false;
                }
            }
