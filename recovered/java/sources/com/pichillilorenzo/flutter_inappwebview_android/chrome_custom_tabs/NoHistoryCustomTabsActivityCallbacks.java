            package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

            import android.app.Activity;
            import android.app.Application;
            import android.os.Bundle;
            import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
            import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
            import io.flutter.embedding.android.FlutterActivity;
            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class NoHistoryCustomTabsActivityCallbacks implements Disposable {
                public InAppWebViewFlutterPlugin plugin;
                public final Map<String, String> noHistoryBrowserIDs = new HashMap();
                public Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = new Application.ActivityLifecycleCallbacks() { // from class: com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.NoHistoryCustomTabsActivityCallbacks.1
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityCreated(Activity activity, Bundle bundle) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityDestroyed(Activity activity) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPaused(Activity activity) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityResumed(Activity activity) {
                        NoHistoryCustomTabsActivityCallbacks noHistoryCustomTabsActivityCallbacks;
                        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin;
/* 3 */                 if (!(activity instanceof FlutterActivity) || (inAppWebViewFlutterPlugin = (noHistoryCustomTabsActivityCallbacks = NoHistoryCustomTabsActivityCallbacks.this).plugin) == null || inAppWebViewFlutterPlugin.chromeSafariBrowserManager == null) {
/* 70 */                    return;
                        }
/* 29 */                for (String str : noHistoryCustomTabsActivityCallbacks.noHistoryBrowserIDs.values()) {
/* 37 */                    if (str != null) {
/* 44 */                        NoHistoryCustomTabsActivityCallbacks.this.noHistoryBrowserIDs.put(str, null);
/* 55 */                        ChromeCustomTabsActivity chromeCustomTabsActivity = NoHistoryCustomTabsActivityCallbacks.this.plugin.chromeSafariBrowserManager.browsers.get(str);
/* 61 */                        if (chromeCustomTabsActivity != null) {
/* 63 */                            chromeCustomTabsActivity.close();
/* 66 */                            chromeCustomTabsActivity.dispose();
                                }
                            }
                        }
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStarted(Activity activity) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStopped(Activity activity) {
                    }
                };

                public NoHistoryCustomTabsActivityCallbacks(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
/* 18 */            this.plugin = inAppWebViewFlutterPlugin;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
                public void dispose() {
/* 3 */             this.noHistoryBrowserIDs.clear();
/* 7 */             this.plugin = null;
                }
            }
