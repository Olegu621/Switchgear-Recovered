            package com.appsflyer;

            import android.content.BroadcastReceiver;
            import android.content.Context;
            import android.content.Intent;
            import com.appsflyer.internal.AFa1ySDK;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class SingleInstallBroadcastReceiver extends BroadcastReceiver {
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    String stringExtra;
/* 3 */             if (intent == null) {
/* 66 */                return;
                    }
                    try {
/* 7 */                 stringExtra = intent.getStringExtra("referrer");
                    } catch (Throwable th) {
/* 15 */                AFLogger.afErrorLog("error in BroadcastReceiver ", th);
/* 18 */                stringExtra = null;
                    }
/* 19 */            if (stringExtra != null && AFa1ySDK.m1763d_(context).getString("referrer", null) != null) {
/* 35 */                AFa1ySDK.getRevenue().AFAdRevenueData(context, stringExtra);
/* 38 */                return;
                    }
/* 45 */            String string = AppsFlyerProperties.getInstance().getString("referrer_timestamp");
/* 49 */            long jCurrentTimeMillis = System.currentTimeMillis();
/* 53 */            if (string == null || jCurrentTimeMillis - Long.parseLong(string) >= 2000) {
/* 69 */                AFLogger.afInfoLog("SingleInstallBroadcastReceiver called");
/* 76 */                AFa1ySDK.getRevenue().m1769b_(context, intent);
/* 91 */                AppsFlyerProperties.getInstance().set("referrer_timestamp", String.valueOf(System.currentTimeMillis()));
                    }
                }
            }
