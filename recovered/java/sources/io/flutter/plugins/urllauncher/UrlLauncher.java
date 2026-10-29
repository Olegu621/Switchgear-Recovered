            package io.flutter.plugins.urllauncher;

            import android.app.Activity;
            import android.content.ActivityNotFoundException;
            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import android.net.Uri;
            import android.os.Bundle;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.Locale;
            import java.util.Map;
            import p000.e30;
            import p000.i30;
            import p000.j30;
            import p000.v00;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 8 */     final class UrlLauncher implements Messages.UrlLauncherApi {
                static final /* synthetic */ boolean $assertionsDisabled = false;
                private static final String TAG = "UrlLauncher";
                private Activity activity;
                private final Context applicationContext;
                private final IntentResolver intentResolver;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface IntentResolver {
                    String getHandlerComponentName(Intent intent);
                }

                public UrlLauncher(final Context context) {
/* 6 */             this(context, new IntentResolver() { // from class: io.flutter.plugins.urllauncher.a
                        @Override // io.flutter.plugins.urllauncher.UrlLauncher.IntentResolver
                        public final String getHandlerComponentName(Intent intent) {
/* 1 */                     return UrlLauncher.lambda$new$0(context, intent);
                        }
                    });
                }

                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                private static boolean containsRestrictedHeader(Map<String, String> map) {
/* 5 */             Iterator<String> it = map.keySet().iterator();
                    while (true) {
/* 13 */                byte b = 0;
/* 14 */                if (!it.hasNext()) {
/* 13 */                    return false;
                        }
/* 24 */                String lowerCase = it.next().toLowerCase(Locale.US);
/* 28 */                lowerCase.getClass();
/* 36 */                b = -1;
                        switch (lowerCase.hashCode()) {
                            case -1423461112:
/* 81 */                        if (!lowerCase.equals("accept")) {
                                }
                                break;
                            case -1229727188:
/* 70 */                        if (lowerCase.equals("content-language")) {
/* 73 */                            b = 1;
                                }
                                break;
                            case 785670158:
/* 59 */                        if (lowerCase.equals("content-type")) {
/* 62 */                            b = 2;
                                }
                                break;
                            case 802785917:
/* 48 */                        if (lowerCase.equals("accept-language")) {
/* 51 */                            b = 3;
                                }
                                break;
                            default:
                                break;
                        }
                        switch (b) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                                break;
                            default:
/* 35 */                        return true;
                        }
                    }
                }

                private void ensureActivity() {
/* 3 */             if (this.activity == null) {
/* 16 */                throw new Messages.FlutterError("NO_ACTIVITY", "Launching a URL requires a foreground activity.", null);
                    }
                }

                private static Bundle extractBundle(Map<String, String> map) {
/* 3 */             Bundle bundle = new Bundle();
/* 18 */            for (String str : map.keySet()) {
/* 32 */                bundle.putString(str, map.get(str));
                    }
/* 36 */            return bundle;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static /* synthetic */ String lambda$new$0(Context context, Intent intent) {
/* 5 */             ComponentName componentNameResolveActivity = intent.resolveActivity(context.getPackageManager());
/* 9 */             if (componentNameResolveActivity == null) {
/* 11 */                return null;
                    }
/* 13 */            return componentNameResolveActivity.toShortString();
                }

                private static boolean openCustomTab(Context context, Uri uri, Bundle bundle, Messages.BrowserOptions browserOptions) {
/* 3 */             i30 i30Var = new i30();
/* 18 */            i30Var.f9432a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", browserOptions.getShowTitle().booleanValue() ? 1 : 0);
/* 21 */            j30 j30VarM4451a = i30Var.m4451a();
/* 25 */            Intent intent = j30VarM4451a.f12036a;
/* 29 */            intent.putExtra("com.android.browser.headers", bundle);
                    try {
/* 32 */                intent.setData(uri);
/* 37 */                v00.startActivity(context, intent, j30VarM4451a.f12037b);
/* 40 */                return true;
                    } catch (ActivityNotFoundException unused) {
/* 42 */                return false;
                    }
                }

                @Override // io.flutter.plugins.urllauncher.Messages.UrlLauncherApi
                public Boolean canLaunchUrl(String str) {
/* 5 */             Intent intent = new Intent("android.intent.action.VIEW");
/* 12 */            intent.setData(Uri.parse(str));
/* 17 */            String handlerComponentName = this.intentResolver.getHandlerComponentName(intent);
                    return handlerComponentName == null ? Boolean.FALSE : Boolean.valueOf(!"{com.android.fallback/com.android.fallback.Fallback}".equals(handlerComponentName));
                }

                @Override // io.flutter.plugins.urllauncher.Messages.UrlLauncherApi
                public void closeWebView() {
/* 10 */            this.applicationContext.sendBroadcast(new Intent(WebViewActivity.ACTION_CLOSE));
                }

                @Override // io.flutter.plugins.urllauncher.Messages.UrlLauncherApi
                public Boolean launchUrl(String str, Map<String, String> map) {
/* 1 */             ensureActivity();
                    try {
/* 31 */                this.activity.startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", extractBundle(map)));
/* 34 */                return Boolean.TRUE;
                    } catch (ActivityNotFoundException unused) {
/* 37 */                return Boolean.FALSE;
                    }
                }

                @Override // io.flutter.plugins.urllauncher.Messages.UrlLauncherApi
                public Boolean openUrlInApp(String str, Boolean bool, Messages.WebViewOptions webViewOptions, Messages.BrowserOptions browserOptions) {
/* 1 */             ensureActivity();
/* 8 */             Bundle bundleExtractBundle = extractBundle(webViewOptions.getHeaders());
/* 16 */            if (bool.booleanValue() && !containsRestrictedHeader(webViewOptions.getHeaders())) {
/* 38 */                if (openCustomTab(this.activity, Uri.parse(str), bundleExtractBundle, browserOptions)) {
/* 40 */                    return Boolean.TRUE;
                        }
                    }
                    try {
/* 67 */                this.activity.startActivity(WebViewActivity.createIntent(this.activity, str, webViewOptions.getEnableJavaScript().booleanValue(), webViewOptions.getEnableDomStorage().booleanValue(), bundleExtractBundle));
/* 70 */                return Boolean.TRUE;
                    } catch (ActivityNotFoundException unused) {
/* 73 */                return Boolean.FALSE;
                    }
                }

                public void setActivity(Activity activity) {
/* 1 */             this.activity = activity;
                }

                @Override // io.flutter.plugins.urllauncher.Messages.UrlLauncherApi
                public Boolean supportsCustomTabs() {
/* 13 */            return Boolean.valueOf(e30.m3300a(this.applicationContext, Collections.EMPTY_LIST, false) != null);
                }

/* 9 */         public UrlLauncher(Context context, IntentResolver intentResolver) {
/* 11 */            this.applicationContext = context;
/* 12 */            this.intentResolver = intentResolver;
                }
            }
