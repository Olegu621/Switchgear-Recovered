            package com.appsflyer;

            import android.content.BroadcastReceiver;
            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.PackageItemInfo;
            import android.content.pm.ResolveInfo;
            import com.appsflyer.internal.AFa1ySDK;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class MultipleInstallBroadcastReceiver extends BroadcastReceiver {
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    String stringExtra;
/* 5 */             if (intent == null) {
/* 186 */               return;
                    }
                    try {
/* 10 */                stringExtra = intent.getStringExtra("referrer");
                    } catch (Throwable th) {
/* 16 */                AFLogger.afErrorLog("error in BroadcastReceiver ", th);
/* 19 */                stringExtra = null;
                    }
/* 20 */            if (stringExtra != null && AFa1ySDK.m1763d_(context).getString("referrer", null) != null) {
/* 36 */                AFa1ySDK.getRevenue().AFAdRevenueData(context, stringExtra);
/* 39 */                return;
                    }
/* 42 */            AFLogger.afInfoLog("MultipleInstallBroadcastReceiver called");
/* 49 */            AFa1ySDK.getRevenue().m1769b_(context, intent);
/* 76 */            for (ResolveInfo resolveInfo : context.getPackageManager().queryBroadcastReceivers(new Intent("com.android.vending.INSTALL_REFERRER"), 0)) {
/* 84 */                String action = intent.getAction();
/* 100 */               if (((PackageItemInfo) resolveInfo.activityInfo).packageName.equals(context.getPackageName()) && "com.android.vending.INSTALL_REFERRER".equals(action) && !getClass().getName().equals(((PackageItemInfo) resolveInfo.activityInfo).name)) {
/* 130 */                   StringBuilder sb = new StringBuilder("trigger onReceive: class: ");
/* 137 */                   sb.append(((PackageItemInfo) resolveInfo.activityInfo).name);
/* 144 */                   AFLogger.afInfoLog(sb.toString());
                            try {
/* 161 */                       ((BroadcastReceiver) Class.forName(((PackageItemInfo) resolveInfo.activityInfo).name).newInstance()).onReceive(context, intent);
                            } catch (Throwable th2) {
/* 168 */                       StringBuilder sb2 = new StringBuilder("error in BroadcastReceiver ");
/* 175 */                       sb2.append(((PackageItemInfo) resolveInfo.activityInfo).name);
/* 182 */                       AFLogger.afErrorLog(sb2.toString(), th2);
                            }
                        }
                    }
                }
            }
