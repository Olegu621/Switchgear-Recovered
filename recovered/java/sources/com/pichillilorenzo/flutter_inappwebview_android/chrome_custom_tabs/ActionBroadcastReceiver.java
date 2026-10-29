            package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

            import android.content.BroadcastReceiver;
            import android.content.Context;
            import android.content.Intent;
            import android.os.Bundle;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ActionBroadcastReceiver extends BroadcastReceiver {
                public static final String KEY_ACTION_ID = "com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.ACTION_ID";
                public static final String KEY_ACTION_MANAGER_ID = "com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.ACTION_MANAGER_ID";
                public static final String KEY_ACTION_VIEW_ID = "com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.ACTION_VIEW_ID";
                public static final String KEY_URL_TITLE = "android.intent.extra.SUBJECT";
                protected static final String LOG_TAG = "ActionBroadcastReceiver";

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    ChromeSafariBrowserManager chromeSafariBrowserManager;
                    ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate;
                    ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate2;
/* 4 */             int intExtra = intent.getIntExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_CLICKED_ID", -1);
/* 8 */             String dataString = intent.getDataString();
/* 12 */            if (dataString != null) {
/* 14 */                Bundle extras = intent.getExtras();
/* 20 */                String string = extras.getString(KEY_ACTION_VIEW_ID);
/* 26 */                String string2 = extras.getString(KEY_ACTION_MANAGER_ID);
/* 30 */                if (string2 == null || (chromeSafariBrowserManager = ChromeSafariBrowserManager.shared.get(string2)) == null) {
/* 99 */                    return;
                        }
/* 42 */                if (intExtra != -1) {
/* 76 */                    ChromeCustomTabsActivity chromeCustomTabsActivity = chromeSafariBrowserManager.browsers.get(string);
/* 82 */                    if (chromeCustomTabsActivity == null || (chromeCustomTabsChannelDelegate = chromeCustomTabsActivity.channelDelegate) == null) {
/* 99 */                        return;
                            }
/* 96 */                    chromeCustomTabsChannelDelegate.onSecondaryItemActionPerform(chromeCustomTabsActivity.getResources().getResourceName(intExtra), dataString);
/* 99 */                    return;
                        }
/* 46 */                int i = extras.getInt(KEY_ACTION_ID);
/* 52 */                String string3 = extras.getString(KEY_URL_TITLE);
/* 58 */                ChromeCustomTabsActivity chromeCustomTabsActivity2 = chromeSafariBrowserManager.browsers.get(string);
/* 64 */                if (chromeCustomTabsActivity2 == null || (chromeCustomTabsChannelDelegate2 = chromeCustomTabsActivity2.channelDelegate) == null) {
/* 99 */                    return;
                        }
/* 70 */                chromeCustomTabsChannelDelegate2.onItemActionPerform(i, dataString, string3);
                    }
                }
            }
